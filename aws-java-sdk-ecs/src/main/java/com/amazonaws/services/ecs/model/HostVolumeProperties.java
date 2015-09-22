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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on a container instance host volume.
 * </p>
 */
public class HostVolumeProperties implements Serializable, Cloneable {

    /**
     * The path on the host container instance that is presented to the
     * container. If this parameter is empty, then the Docker daemon has
     * assigned a host path for you.
     */
    private String sourcePath;

    /**
     * The path on the host container instance that is presented to the
     * container. If this parameter is empty, then the Docker daemon has
     * assigned a host path for you.
     *
     * @return The path on the host container instance that is presented to the
     *         container. If this parameter is empty, then the Docker daemon has
     *         assigned a host path for you.
     */
    public String getSourcePath() {
        return sourcePath;
    }
    
    /**
     * The path on the host container instance that is presented to the
     * container. If this parameter is empty, then the Docker daemon has
     * assigned a host path for you.
     *
     * @param sourcePath The path on the host container instance that is presented to the
     *         container. If this parameter is empty, then the Docker daemon has
     *         assigned a host path for you.
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }
    
    /**
     * The path on the host container instance that is presented to the
     * container. If this parameter is empty, then the Docker daemon has
     * assigned a host path for you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourcePath The path on the host container instance that is presented to the
     *         container. If this parameter is empty, then the Docker daemon has
     *         assigned a host path for you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostVolumeProperties withSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
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
        if (getSourcePath() != null) sb.append("SourcePath: " + getSourcePath() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HostVolumeProperties == false) return false;
        HostVolumeProperties other = (HostVolumeProperties)obj;
        
        if (other.getSourcePath() == null ^ this.getSourcePath() == null) return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false) return false; 
        return true;
    }
    
    @Override
    public HostVolumeProperties clone() {
        try {
            return (HostVolumeProperties) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    