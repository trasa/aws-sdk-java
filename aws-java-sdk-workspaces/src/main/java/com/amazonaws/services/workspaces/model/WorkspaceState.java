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

package com.amazonaws.services.workspaces.model;

/**
 * 
 */
public enum WorkspaceState {

    PENDING("PENDING"),
    AVAILABLE("AVAILABLE"),
    IMPAIRED("IMPAIRED"),
    UNHEALTHY("UNHEALTHY"),
    REBOOTING("REBOOTING"),
    REBUILDING("REBUILDING"),
    TERMINATING("TERMINATING"),
    TERMINATED("TERMINATED"),
    SUSPENDED("SUSPENDED"),
    ERROR("ERROR");

    private String value;

    private WorkspaceState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return WorkspaceState corresponding to the value
     */
    public static WorkspaceState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PENDING".equals(value)) {
            return PENDING;
        } else if ("AVAILABLE".equals(value)) {
            return AVAILABLE;
        } else if ("IMPAIRED".equals(value)) {
            return IMPAIRED;
        } else if ("UNHEALTHY".equals(value)) {
            return UNHEALTHY;
        } else if ("REBOOTING".equals(value)) {
            return REBOOTING;
        } else if ("REBUILDING".equals(value)) {
            return REBUILDING;
        } else if ("TERMINATING".equals(value)) {
            return TERMINATING;
        } else if ("TERMINATED".equals(value)) {
            return TERMINATED;
        } else if ("SUSPENDED".equals(value)) {
            return SUSPENDED;
        } else if ("ERROR".equals(value)) {
            return ERROR;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}