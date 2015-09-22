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
package com.amazonaws.internal;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.regions.Region;

/**
 * Uses region metdata to construct an endpoint for a specific service
 */
@NotThreadSafe
public class DefaultServiceEndpointBuilder extends ServiceEndpointBuilder {

    private static final Log log = LogFactory.getLog(DefaultServiceEndpointBuilder.class);

    private final String serviceName;
    private final String protocol;
    private Region region;

    public DefaultServiceEndpointBuilder(String serviceName, String protocol) {
        this.serviceName = serviceName;
        this.protocol = protocol;
    }

    public DefaultServiceEndpointBuilder withRegion(Region region) {
        this.region = region;
        return this;
    }

    @Override
    public URI getServiceEndpoint() {
        String serviceEndpoint;

        if (region.isServiceSupported(serviceName)) {
            serviceEndpoint = stripProtocol(region.getServiceEndpoint(serviceName));
        } else {
            serviceEndpoint = String.format("%s.%s.%s", serviceName, region.getName(), region.getDomain());

            log.info("{" + serviceName + ", " + region.getName() + "} was not "
                    + "found in region metadata, trying to construct an "
                    + "endpoint using the standard pattern for this region: '" + serviceEndpoint + "'.");

        }
        return toURI(serviceEndpoint);
    }

    private String stripProtocol(final String endpoint) {
        final int protocolIndex = endpoint.indexOf("://");
        return protocolIndex >= 0 ? endpoint.substring(protocolIndex + "://".length()) : endpoint;
    }

    private URI toURI(String endpoint) throws IllegalArgumentException {
        try {
            return new URI(String.format("%s://%s", protocol, endpoint));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Region getRegion() {
        return region;
    }
}
