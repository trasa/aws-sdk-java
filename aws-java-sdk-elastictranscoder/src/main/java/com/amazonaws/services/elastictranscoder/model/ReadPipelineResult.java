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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ReadPipelineResponse</code> structure.
 * </p>
 */
public class ReadPipelineResult implements Serializable, Cloneable {

    /**
     * A section of the response body that provides information about the
     * pipeline.
     */
    private Pipeline pipeline;

    /**
     * Elastic Transcoder returns a warning if the resources used by your
     * pipeline are not in the same region as the pipeline. <p>Using
     * resources in the same region, such as your Amazon S3 buckets, Amazon
     * SNS notification topics, and AWS KMS key, reduces processing time and
     * prevents cross-regional charges.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Warning> warnings;

    /**
     * A section of the response body that provides information about the
     * pipeline.
     *
     * @return A section of the response body that provides information about the
     *         pipeline.
     */
    public Pipeline getPipeline() {
        return pipeline;
    }
    
    /**
     * A section of the response body that provides information about the
     * pipeline.
     *
     * @param pipeline A section of the response body that provides information about the
     *         pipeline.
     */
    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }
    
    /**
     * A section of the response body that provides information about the
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipeline A section of the response body that provides information about the
     *         pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReadPipelineResult withPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Elastic Transcoder returns a warning if the resources used by your
     * pipeline are not in the same region as the pipeline. <p>Using
     * resources in the same region, such as your Amazon S3 buckets, Amazon
     * SNS notification topics, and AWS KMS key, reduces processing time and
     * prevents cross-regional charges.
     *
     * @return Elastic Transcoder returns a warning if the resources used by your
     *         pipeline are not in the same region as the pipeline. <p>Using
     *         resources in the same region, such as your Amazon S3 buckets, Amazon
     *         SNS notification topics, and AWS KMS key, reduces processing time and
     *         prevents cross-regional charges.
     */
    public java.util.List<Warning> getWarnings() {
        if (warnings == null) {
              warnings = new com.amazonaws.internal.ListWithAutoConstructFlag<Warning>();
              warnings.setAutoConstruct(true);
        }
        return warnings;
    }
    
    /**
     * Elastic Transcoder returns a warning if the resources used by your
     * pipeline are not in the same region as the pipeline. <p>Using
     * resources in the same region, such as your Amazon S3 buckets, Amazon
     * SNS notification topics, and AWS KMS key, reduces processing time and
     * prevents cross-regional charges.
     *
     * @param warnings Elastic Transcoder returns a warning if the resources used by your
     *         pipeline are not in the same region as the pipeline. <p>Using
     *         resources in the same region, such as your Amazon S3 buckets, Amazon
     *         SNS notification topics, and AWS KMS key, reduces processing time and
     *         prevents cross-regional charges.
     */
    public void setWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Warning> warningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Warning>(warnings.size());
        warningsCopy.addAll(warnings);
        this.warnings = warningsCopy;
    }
    
    /**
     * Elastic Transcoder returns a warning if the resources used by your
     * pipeline are not in the same region as the pipeline. <p>Using
     * resources in the same region, such as your Amazon S3 buckets, Amazon
     * SNS notification topics, and AWS KMS key, reduces processing time and
     * prevents cross-regional charges.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setWarnings(java.util.Collection)} or {@link
     * #withWarnings(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warnings Elastic Transcoder returns a warning if the resources used by your
     *         pipeline are not in the same region as the pipeline. <p>Using
     *         resources in the same region, such as your Amazon S3 buckets, Amazon
     *         SNS notification topics, and AWS KMS key, reduces processing time and
     *         prevents cross-regional charges.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReadPipelineResult withWarnings(Warning... warnings) {
        if (getWarnings() == null) setWarnings(new java.util.ArrayList<Warning>(warnings.length));
        for (Warning value : warnings) {
            getWarnings().add(value);
        }
        return this;
    }
    
    /**
     * Elastic Transcoder returns a warning if the resources used by your
     * pipeline are not in the same region as the pipeline. <p>Using
     * resources in the same region, such as your Amazon S3 buckets, Amazon
     * SNS notification topics, and AWS KMS key, reduces processing time and
     * prevents cross-regional charges.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warnings Elastic Transcoder returns a warning if the resources used by your
     *         pipeline are not in the same region as the pipeline. <p>Using
     *         resources in the same region, such as your Amazon S3 buckets, Amazon
     *         SNS notification topics, and AWS KMS key, reduces processing time and
     *         prevents cross-regional charges.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReadPipelineResult withWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Warning> warningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Warning>(warnings.size());
            warningsCopy.addAll(warnings);
            this.warnings = warningsCopy;
        }

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
        if (getPipeline() != null) sb.append("Pipeline: " + getPipeline() + ",");
        if (getWarnings() != null) sb.append("Warnings: " + getWarnings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode()); 
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReadPipelineResult == false) return false;
        ReadPipelineResult other = (ReadPipelineResult)obj;
        
        if (other.getPipeline() == null ^ this.getPipeline() == null) return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false) return false; 
        if (other.getWarnings() == null ^ this.getWarnings() == null) return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false) return false; 
        return true;
    }
    
    @Override
    public ReadPipelineResult clone() {
        try {
            return (ReadPipelineResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    