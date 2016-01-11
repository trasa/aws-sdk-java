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

package com.amazonaws.services.storagegateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TapeArchiveMarshaller
 */
public class TapeArchiveJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(TapeArchive tapeArchive, JSONWriter jsonWriter) {
        if (tapeArchive == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (tapeArchive.getTapeARN() != null) {
                jsonWriter.key("TapeARN").value(tapeArchive.getTapeARN());
            }

            if (tapeArchive.getTapeBarcode() != null) {
                jsonWriter.key("TapeBarcode").value(
                        tapeArchive.getTapeBarcode());
            }

            if (tapeArchive.getTapeSizeInBytes() != null) {
                jsonWriter.key("TapeSizeInBytes").value(
                        tapeArchive.getTapeSizeInBytes());
            }

            if (tapeArchive.getCompletionTime() != null) {
                jsonWriter.key("CompletionTime").value(
                        tapeArchive.getCompletionTime());
            }

            if (tapeArchive.getRetrievedTo() != null) {
                jsonWriter.key("RetrievedTo").value(
                        tapeArchive.getRetrievedTo());
            }

            if (tapeArchive.getTapeStatus() != null) {
                jsonWriter.key("TapeStatus").value(tapeArchive.getTapeStatus());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TapeArchiveJsonMarshaller instance;

    public static TapeArchiveJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TapeArchiveJsonMarshaller();
        return instance;
    }

}
