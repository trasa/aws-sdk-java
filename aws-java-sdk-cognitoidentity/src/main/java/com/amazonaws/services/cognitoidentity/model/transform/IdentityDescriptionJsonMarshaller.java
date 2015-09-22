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

package com.amazonaws.services.cognitoidentity.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * IdentityDescriptionMarshaller
 */
public class IdentityDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(IdentityDescription identityDescription,
            JSONWriter jsonWriter) {
        if (identityDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (identityDescription.getIdentityId() != null) {
                jsonWriter.key("IdentityId").value(
                        identityDescription.getIdentityId());
            }

            java.util.List<String> loginsList = identityDescription.getLogins();
            if (loginsList != null) {
                jsonWriter.key("Logins");
                jsonWriter.array();
                for (String loginsListValue : loginsList) {
                    if (loginsListValue != null) {
                        jsonWriter.value(loginsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (identityDescription.getCreationDate() != null) {
                jsonWriter.key("CreationDate").value(
                        identityDescription.getCreationDate());
            }

            if (identityDescription.getLastModifiedDate() != null) {
                jsonWriter.key("LastModifiedDate").value(
                        identityDescription.getLastModifiedDate());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IdentityDescriptionJsonMarshaller instance;

    public static IdentityDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDescriptionJsonMarshaller();
        return instance;
    }

}
