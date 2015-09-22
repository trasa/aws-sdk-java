/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.http.annotation.NotThreadSafe;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

/**
 * Base class for all user facing web service requests.
 */
@NotThreadSafe
public abstract class AmazonWebServiceRequest implements Cloneable, ReadLimitInfo {

    public static final AmazonWebServiceRequest NOOP = new AmazonWebServiceRequest() {};

    /**
     * The optional progress listener for receiving updates about the progress
     * of the request.
     */
    private ProgressListener progressListener = ProgressListener.NOOP;

    /**
     * Arbitrary options storage for individual {@link AmazonWebServiceRequest}s. This
     * field is not intended to be used by clients.
     */
    private final RequestClientOptions requestClientOptions = new RequestClientOptions();

    /**
     * A request metric collector used for this specific service request; or
     * null if there is none.  This collector always takes precedence over the
     * ones specified at the http client level and AWS SDK level.
     */
    private RequestMetricCollector requestMetricCollector;

    /**
     * The optional credentials to use for this request - overrides the
     * default credentials set at the client level.
     */
    private AWSCredentials credentials;

    /**
     * A map of custom header names to header values.
     */
    private Map<String, String> customRequestHeaders;

    /**
     * Custom query parameters for the request.
     */
    private Map<String, List<String>> customQueryParameters;

    /**
     * Sets the optional credentials to use for this request, overriding the
     * default credentials set at the client level.
     *
     * @param credentials
     *            The optional AWS security credentials to use for this request,
     *            overriding the default credentials set at the client level.
     */
    public void setRequestCredentials(AWSCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Returns the optional credentials to use to sign this request, overriding
     * the default credentials set at the client level.
     *
     * @return The optional credentials to use to sign this request, overriding
     *         the default credentials set at the client level.
     */
    public AWSCredentials getRequestCredentials() {
        return credentials;
    }

    /**
     * Gets the options stored with this request object. Intended for internal
     * use only.
     */
    public RequestClientOptions getRequestClientOptions() {
        return requestClientOptions;
    }

    /**
     * Returns a request level metric collector; or null if not specified.
     */
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }

    /**
     * Sets a request level request metric collector which takes precedence over
     * the ones at the http client level and AWS SDK level.
     */
    public void setRequestMetricCollector(RequestMetricCollector requestMetricCollector) {
        this.requestMetricCollector = requestMetricCollector;
    }

    /**
     * Specifies a request level metric collector which takes precedence over
     * the ones at the http client level and AWS SDK level.
     */
    public <T extends AmazonWebServiceRequest> T withRequestMetricCollector(RequestMetricCollector metricCollector) {
        setRequestMetricCollector(metricCollector);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Sets the optional progress listener for receiving updates about the
     * progress of the request.
     *
     * @param progressListener
     *            The new progress listener.
     */
    public void setGeneralProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener == null
                              ? ProgressListener.NOOP
                              : progressListener;
    }

    /**
     * Returns the optional progress listener for receiving updates about the
     * progress of the request.
     *
     * @return the optional progress listener for receiving updates about the
     *         progress of the request.
     */
    public ProgressListener getGeneralProgressListener() {
        return progressListener;
    }

    /**
     * Sets the optional progress listener for receiving updates about the
     * progress of the request, and returns a reference to this object so that
     * method calls can be chained together.
     *
     * @param progressListener
     *            The new progress listener.
     *
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public <T extends AmazonWebServiceRequest> T withGeneralProgressListener(ProgressListener progressListener) {
        setGeneralProgressListener(progressListener);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Returns an immutable map of custom header names to header values.
     *
     * @return The immutable map of custom header names to header values.
     */
    public Map<String, String> getCustomRequestHeaders() {
        if(customRequestHeaders == null) {
            return null;
        }
        return Collections.unmodifiableMap(customRequestHeaders);
    }

    /**
     * Put a new custom header to the map of custom header names to custom
     * header values, and return the previous value if the header has already
     * been set in this map.
     * <p>
     * NOTE: Custom header values set via this method will overwrite any
     * conflicting values coming from the request parameters.
     *
     * @param name
     *            The name of the header to add
     * @param value
     *            The value of the header to add
     * @return the previous value for the name if it was set, null otherwise
     */
    public String putCustomRequestHeader(String name, String value) {
        if (customRequestHeaders == null) {
            customRequestHeaders = new HashMap<String, String>();
        }
        return customRequestHeaders.put(name, value);
    }

    /**
     * @return the immutable map of custom query parameters. The parameter value
     *         is modeled as a list of strings because multiple values can be
     *         specified for the same parameter name.
     */
    public Map<String, List<String>> getCustomQueryParameters() {
        if(customQueryParameters == null) {
            return null;
        }
        return Collections.unmodifiableMap(customQueryParameters);
    }

    /**
     * Add a custom query parameter for the request. Since multiple values are
     * allowed for the same query parameter, this method does NOT overwrite any
     * existing parameter values in the request.
     *
     * @param name
     *            The name of the query parameter
     * @param value
     *            The value of the query parameter. Only the parameter name will
     *            be added in the URI if the value is set to null. For example,
     *            putCustomQueryParameter("param", null) will be serialized to
     *            "?param", while putCustomQueryParameter("param", "") will be
     *            serialized to "?param=".
     */
    public void putCustomQueryParameter(String name, String value) {
        if (customQueryParameters == null) {
            customQueryParameters = new HashMap<String, List<String>>();
        }
        List<String> paramList = customQueryParameters.get(name);
        if (paramList == null) {
            paramList = new LinkedList<String>();
            customQueryParameters.put(name, paramList);
        }
        paramList.add(value);
    }


    @Override
    public final int getReadLimit() {
        return requestClientOptions.getReadLimit();
    }

    /**
     * Copies the internal state of this base class to that of the target
     * request.
     *
     * @return the target request
     */
    protected final <T extends AmazonWebServiceRequest> T copyBaseTo(T target) {
        if (customRequestHeaders != null) {
            for (Map.Entry<String, String> e: customRequestHeaders.entrySet())
                target.putCustomRequestHeader(e.getKey(), e.getValue());
        }
        if (customQueryParameters != null) {
            for (Map.Entry<String, List<String>> e: customQueryParameters.entrySet()) {
                if (e.getValue() != null) {
                    for (String value : e.getValue()) {
                        target.putCustomQueryParameter(e.getKey(), value);
                    }
                }
            }
        }
        target.setRequestCredentials(credentials);
        target.setGeneralProgressListener(progressListener);
        target.setRequestMetricCollector(requestMetricCollector);
        requestClientOptions.copyTo(target.getRequestClientOptions());
        return target;
    }

    /**
     * Creates a shallow clone of this request. Explicitly does <em>not</em>
     * clone the deep structure of the request object.
     *
     * @see Object#clone()
     */
    @Override
    public AmazonWebServiceRequest clone() {
        try {
            return (AmazonWebServiceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
    }
}
