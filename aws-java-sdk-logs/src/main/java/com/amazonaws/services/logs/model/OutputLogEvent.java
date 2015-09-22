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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class OutputLogEvent implements Serializable, Cloneable {

    private Long timestamp;

    private String message;

    private Long ingestionTime;

    /**
     * Sets the value of the Timestamp property for this object.
     * 
     * @param timestamp
     *        The new value for the Timestamp property for this object.
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Returns the value of the Timestamp property for this object.
     * 
     * @return The value of the Timestamp property for this object.
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * Sets the value of the Timestamp property for this object.
     * 
     * @param timestamp
     *        The new value for the Timestamp property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public OutputLogEvent withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * Sets the value of the Message property for this object.
     * 
     * @param message
     *        The new value for the Message property for this object.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the value of the Message property for this object.
     * 
     * @return The value of the Message property for this object.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the value of the Message property for this object.
     * 
     * @param message
     *        The new value for the Message property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public OutputLogEvent withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Sets the value of the IngestionTime property for this object.
     * 
     * @param ingestionTime
     *        The new value for the IngestionTime property for this object.
     */
    public void setIngestionTime(Long ingestionTime) {
        this.ingestionTime = ingestionTime;
    }

    /**
     * Returns the value of the IngestionTime property for this object.
     * 
     * @return The value of the IngestionTime property for this object.
     */
    public Long getIngestionTime() {
        return this.ingestionTime;
    }

    /**
     * Sets the value of the IngestionTime property for this object.
     * 
     * @param ingestionTime
     *        The new value for the IngestionTime property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public OutputLogEvent withIngestionTime(Long ingestionTime) {
        setIngestionTime(ingestionTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getIngestionTime() != null)
            sb.append("IngestionTime: " + getIngestionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputLogEvent == false)
            return false;
        OutputLogEvent other = (OutputLogEvent) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getIngestionTime() == null ^ this.getIngestionTime() == null)
            return false;
        if (other.getIngestionTime() != null
                && other.getIngestionTime().equals(this.getIngestionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime
                * hashCode
                + ((getIngestionTime() == null) ? 0 : getIngestionTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public OutputLogEvent clone() {
        try {
            return (OutputLogEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}