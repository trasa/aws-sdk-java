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

package com.amazonaws.services.codedeploy.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateDeploymentGroupRequest Marshaller
 */
public class UpdateDeploymentGroupRequestMarshaller
        implements
        Marshaller<Request<UpdateDeploymentGroupRequest>, UpdateDeploymentGroupRequest> {

    public Request<UpdateDeploymentGroupRequest> marshall(
            UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {

        if (updateDeploymentGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateDeploymentGroupRequest> request = new DefaultRequest<UpdateDeploymentGroupRequest>(
                updateDeploymentGroupRequest, "AmazonCodeDeploy");
        request.addHeader("X-Amz-Target",
                "CodeDeploy_20141006.UpdateDeploymentGroup");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateDeploymentGroupRequest.getApplicationName() != null) {
                jsonWriter.key("applicationName").value(
                        updateDeploymentGroupRequest.getApplicationName());
            }

            if (updateDeploymentGroupRequest.getCurrentDeploymentGroupName() != null) {
                jsonWriter.key("currentDeploymentGroupName").value(
                        updateDeploymentGroupRequest
                                .getCurrentDeploymentGroupName());
            }

            if (updateDeploymentGroupRequest.getNewDeploymentGroupName() != null) {
                jsonWriter.key("newDeploymentGroupName").value(
                        updateDeploymentGroupRequest
                                .getNewDeploymentGroupName());
            }

            if (updateDeploymentGroupRequest.getDeploymentConfigName() != null) {
                jsonWriter.key("deploymentConfigName").value(
                        updateDeploymentGroupRequest.getDeploymentConfigName());
            }

            com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFiltersList = (com.amazonaws.internal.SdkInternalList<EC2TagFilter>) updateDeploymentGroupRequest
                    .getEc2TagFilters();
            if (!ec2TagFiltersList.isEmpty()
                    || !ec2TagFiltersList.isAutoConstruct()) {
                jsonWriter.key("ec2TagFilters");
                jsonWriter.array();
                for (EC2TagFilter ec2TagFiltersListValue : ec2TagFiltersList) {
                    if (ec2TagFiltersListValue != null) {

                        EC2TagFilterJsonMarshaller.getInstance().marshall(
                                ec2TagFiltersListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFiltersList = (com.amazonaws.internal.SdkInternalList<TagFilter>) updateDeploymentGroupRequest
                    .getOnPremisesInstanceTagFilters();
            if (!onPremisesInstanceTagFiltersList.isEmpty()
                    || !onPremisesInstanceTagFiltersList.isAutoConstruct()) {
                jsonWriter.key("onPremisesInstanceTagFilters");
                jsonWriter.array();
                for (TagFilter onPremisesInstanceTagFiltersListValue : onPremisesInstanceTagFiltersList) {
                    if (onPremisesInstanceTagFiltersListValue != null) {

                        TagFilterJsonMarshaller.getInstance().marshall(
                                onPremisesInstanceTagFiltersListValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> autoScalingGroupsList = (com.amazonaws.internal.SdkInternalList<String>) updateDeploymentGroupRequest
                    .getAutoScalingGroups();
            if (!autoScalingGroupsList.isEmpty()
                    || !autoScalingGroupsList.isAutoConstruct()) {
                jsonWriter.key("autoScalingGroups");
                jsonWriter.array();
                for (String autoScalingGroupsListValue : autoScalingGroupsList) {
                    if (autoScalingGroupsListValue != null) {
                        jsonWriter.value(autoScalingGroupsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (updateDeploymentGroupRequest.getServiceRoleArn() != null) {
                jsonWriter.key("serviceRoleArn").value(
                        updateDeploymentGroupRequest.getServiceRoleArn());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
