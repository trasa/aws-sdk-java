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
package com.amazonaws.services.ecs.model.transform;

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
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Run Task Request Marshaller
 */
public class RunTaskRequestMarshaller implements Marshaller<Request<RunTaskRequest>, RunTaskRequest> {

    public Request<RunTaskRequest> marshall(RunTaskRequest runTaskRequest) {
        if (runTaskRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RunTaskRequest> request = new DefaultRequest<RunTaskRequest>(runTaskRequest, "AmazonECS");
        String target = "AmazonEC2ContainerServiceV20141113.RunTask";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (runTaskRequest.getCluster() != null) {
                jsonWriter.key("cluster").value(runTaskRequest.getCluster());
            }
            if (runTaskRequest.getTaskDefinition() != null) {
                jsonWriter.key("taskDefinition").value(runTaskRequest.getTaskDefinition());
            }
            TaskOverride overrides = runTaskRequest.getOverrides();
            if (overrides != null) {

                jsonWriter.key("overrides");
                jsonWriter.object();

                com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride> containerOverridesList = (com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride>)(overrides.getContainerOverrides());
                if (containerOverridesList != null && !(containerOverridesList.isAutoConstruct() && containerOverridesList.isEmpty())) {

                    jsonWriter.key("containerOverrides");
                    jsonWriter.array();

                    for (ContainerOverride containerOverridesListValue : containerOverridesList) {
                        if (containerOverridesListValue != null) {
                            jsonWriter.object();
                            if (containerOverridesListValue.getName() != null) {
                                jsonWriter.key("name").value(containerOverridesListValue.getName());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> commandList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerOverridesListValue.getCommand());
                            if (commandList != null && !(commandList.isAutoConstruct() && commandList.isEmpty())) {

                                jsonWriter.key("command");
                                jsonWriter.array();

                                for (String commandListValue : commandList) {
                                    if (commandListValue != null) {
                                        jsonWriter.value(commandListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair> environmentList = (com.amazonaws.internal.ListWithAutoConstructFlag<KeyValuePair>)(containerOverridesListValue.getEnvironment());
                            if (environmentList != null && !(environmentList.isAutoConstruct() && environmentList.isEmpty())) {

                                jsonWriter.key("environment");
                                jsonWriter.array();

                                for (KeyValuePair environmentListValue : environmentList) {
                                    if (environmentListValue != null) {
                                        jsonWriter.object();
                                        if (environmentListValue.getName() != null) {
                                            jsonWriter.key("name").value(environmentListValue.getName());
                                        }
                                        if (environmentListValue.getValue() != null) {
                                            jsonWriter.key("value").value(environmentListValue.getValue());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            if (runTaskRequest.getCount() != null) {
                jsonWriter.key("count").value(runTaskRequest.getCount());
            }
            if (runTaskRequest.getStartedBy() != null) {
                jsonWriter.key("startedBy").value(runTaskRequest.getStartedBy());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
