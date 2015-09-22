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
package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Update Health Check Request Marshaller
 */
public class UpdateHealthCheckRequestMarshaller implements Marshaller<Request<UpdateHealthCheckRequest>, UpdateHealthCheckRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2013-04-01/healthcheck/{HealthCheckId}";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<UpdateHealthCheckRequest> marshall(UpdateHealthCheckRequest updateHealthCheckRequest) {

        if (updateHealthCheckRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateHealthCheckRequest> request = new DefaultRequest<UpdateHealthCheckRequest>(updateHealthCheckRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("HealthCheckId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("HealthCheckId");
            String value = (updateHealthCheckRequest.getHealthCheckId() == null) ? null : StringUtils.fromString(updateHealthCheckRequest.getHealthCheckId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{HealthCheckId}", (updateHealthCheckRequest.getHealthCheckId() == null) ? "" : StringUtils.fromString(updateHealthCheckRequest.getHealthCheckId())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("UpdateHealthCheckRequest");
                    if (updateHealthCheckRequest.getHealthCheckVersion() != null) {
            xmlWriter.startElement("HealthCheckVersion").value(updateHealthCheckRequest.getHealthCheckVersion()).endElement();
        }
        if (updateHealthCheckRequest.getIPAddress() != null) {
            xmlWriter.startElement("IPAddress").value(updateHealthCheckRequest.getIPAddress()).endElement();
        }
        if (updateHealthCheckRequest.getPort() != null) {
            xmlWriter.startElement("Port").value(updateHealthCheckRequest.getPort()).endElement();
        }
        if (updateHealthCheckRequest.getResourcePath() != null) {
            xmlWriter.startElement("ResourcePath").value(updateHealthCheckRequest.getResourcePath()).endElement();
        }
        if (updateHealthCheckRequest.getFullyQualifiedDomainName() != null) {
            xmlWriter.startElement("FullyQualifiedDomainName").value(updateHealthCheckRequest.getFullyQualifiedDomainName()).endElement();
        }
        if (updateHealthCheckRequest.getSearchString() != null) {
            xmlWriter.startElement("SearchString").value(updateHealthCheckRequest.getSearchString()).endElement();
        }
        if (updateHealthCheckRequest.getFailureThreshold() != null) {
            xmlWriter.startElement("FailureThreshold").value(updateHealthCheckRequest.getFailureThreshold()).endElement();
        }
        if (updateHealthCheckRequest.isInverted() != null) {
            xmlWriter.startElement("Inverted").value(updateHealthCheckRequest.isInverted()).endElement();
        }
        if (updateHealthCheckRequest.getHealthThreshold() != null) {
            xmlWriter.startElement("HealthThreshold").value(updateHealthCheckRequest.getHealthThreshold()).endElement();
        }

        if (updateHealthCheckRequest != null) {
            java.util.List<String> UpdateHealthCheckRequestchildHealthChecksList = updateHealthCheckRequest.getChildHealthChecks();
            if (UpdateHealthCheckRequestchildHealthChecksList != null && UpdateHealthCheckRequestchildHealthChecksList.size() > 0) {
                int UpdateHealthCheckRequestchildHealthChecksListIndex = 1;
                xmlWriter.startElement("ChildHealthChecks");
                for (String UpdateHealthCheckRequestchildHealthChecksListValue : UpdateHealthCheckRequestchildHealthChecksList) {

                xmlWriter.startElement("ChildHealthCheck");
                    xmlWriter.value(UpdateHealthCheckRequestchildHealthChecksListValue);
                xmlWriter.endElement();

                    UpdateHealthCheckRequestchildHealthChecksListIndex++;
                }
                xmlWriter.endElement();
            }
        }

            xmlWriter.endElement();

            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }

        return request;
    }
}
