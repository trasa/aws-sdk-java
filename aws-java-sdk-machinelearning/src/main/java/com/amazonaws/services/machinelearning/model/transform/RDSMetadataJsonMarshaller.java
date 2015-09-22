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

package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RDSMetadataMarshaller
 */
public class RDSMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RDSMetadata rDSMetadata, JSONWriter jsonWriter) {
        if (rDSMetadata == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (rDSMetadata.getDatabase() != null) {
                jsonWriter.key("Database");
                RDSDatabaseJsonMarshaller.getInstance().marshall(
                        rDSMetadata.getDatabase(), jsonWriter);
            }

            if (rDSMetadata.getDatabaseUserName() != null) {
                jsonWriter.key("DatabaseUserName").value(
                        rDSMetadata.getDatabaseUserName());
            }

            if (rDSMetadata.getSelectSqlQuery() != null) {
                jsonWriter.key("SelectSqlQuery").value(
                        rDSMetadata.getSelectSqlQuery());
            }

            if (rDSMetadata.getResourceRole() != null) {
                jsonWriter.key("ResourceRole").value(
                        rDSMetadata.getResourceRole());
            }

            if (rDSMetadata.getServiceRole() != null) {
                jsonWriter.key("ServiceRole").value(
                        rDSMetadata.getServiceRole());
            }

            if (rDSMetadata.getDataPipelineId() != null) {
                jsonWriter.key("DataPipelineId").value(
                        rDSMetadata.getDataPipelineId());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RDSMetadataJsonMarshaller instance;

    public static RDSMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RDSMetadataJsonMarshaller();
        return instance;
    }

}
