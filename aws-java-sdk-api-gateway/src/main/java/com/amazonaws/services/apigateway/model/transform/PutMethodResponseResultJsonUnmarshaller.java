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

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutMethodResponseResult JSON Unmarshaller
 */
public class PutMethodResponseResultJsonUnmarshaller implements
        Unmarshaller<PutMethodResponseResult, JsonUnmarshallerContext> {

    public PutMethodResponseResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        PutMethodResponseResult putMethodResponseResult = new PutMethodResponseResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    putMethodResponseResult
                            .setStatusCode(StringJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("responseParameters", targetDepth)) {
                    context.nextToken();
                    putMethodResponseResult
                            .setResponseParameters(new MapUnmarshaller<String, Boolean>(
                                    StringJsonUnmarshaller.getInstance(),
                                    BooleanJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("responseModels", targetDepth)) {
                    context.nextToken();
                    putMethodResponseResult
                            .setResponseModels(new MapUnmarshaller<String, String>(
                                    StringJsonUnmarshaller.getInstance(),
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return putMethodResponseResult;
    }

    private static PutMethodResponseResultJsonUnmarshaller instance;

    public static PutMethodResponseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutMethodResponseResultJsonUnmarshaller();
        return instance;
    }
}
