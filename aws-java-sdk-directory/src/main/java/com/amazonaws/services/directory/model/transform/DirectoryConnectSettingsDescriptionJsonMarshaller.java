/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.directory.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DirectoryConnectSettingsDescriptionMarshaller
 */
public class DirectoryConnectSettingsDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            DirectoryConnectSettingsDescription directoryConnectSettingsDescription,
            JSONWriter jsonWriter) {
        if (directoryConnectSettingsDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (directoryConnectSettingsDescription.getVpcId() != null) {
                jsonWriter.key("VpcId").value(
                        directoryConnectSettingsDescription.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettingsDescription
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonWriter.key("SubnetIds");
                jsonWriter.array();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonWriter.value(subnetIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (directoryConnectSettingsDescription.getCustomerUserName() != null) {
                jsonWriter.key("CustomerUserName").value(
                        directoryConnectSettingsDescription
                                .getCustomerUserName());
            }

            if (directoryConnectSettingsDescription.getSecurityGroupId() != null) {
                jsonWriter.key("SecurityGroupId").value(
                        directoryConnectSettingsDescription
                                .getSecurityGroupId());
            }

            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettingsDescription
                    .getAvailabilityZones();
            if (!availabilityZonesList.isEmpty()
                    || !availabilityZonesList.isAutoConstruct()) {
                jsonWriter.key("AvailabilityZones");
                jsonWriter.array();
                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        jsonWriter.value(availabilityZonesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> connectIpsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettingsDescription
                    .getConnectIps();
            if (!connectIpsList.isEmpty() || !connectIpsList.isAutoConstruct()) {
                jsonWriter.key("ConnectIps");
                jsonWriter.array();
                for (String connectIpsListValue : connectIpsList) {
                    if (connectIpsListValue != null) {
                        jsonWriter.value(connectIpsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryConnectSettingsDescriptionJsonMarshaller instance;

    public static DirectoryConnectSettingsDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryConnectSettingsDescriptionJsonMarshaller();
        return instance;
    }

}
