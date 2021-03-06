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

package com.amazonaws.services.elasticfilesystem.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned if the request is malformed or contains an error such as an invalid
 * parameter value or a missing required parameter.
 * </p>
 */
public class BadRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    private String errorCode;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public BadRequestException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}