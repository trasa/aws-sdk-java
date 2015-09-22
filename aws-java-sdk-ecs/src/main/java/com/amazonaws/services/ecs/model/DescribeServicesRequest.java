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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#describeServices(DescribeServicesRequest) DescribeServices operation}.
 * <p>
 * Describes the specified services running in your cluster.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#describeServices(DescribeServicesRequest)
 */
public class DescribeServicesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the cluster that hosts the service you want to describe.
     */
    private String cluster;

    /**
     * A list of services you want to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> services;

    /**
     * The name of the cluster that hosts the service you want to describe.
     *
     * @return The name of the cluster that hosts the service you want to describe.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The name of the cluster that hosts the service you want to describe.
     *
     * @param cluster The name of the cluster that hosts the service you want to describe.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The name of the cluster that hosts the service you want to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The name of the cluster that hosts the service you want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeServicesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * A list of services you want to describe.
     *
     * @return A list of services you want to describe.
     */
    public java.util.List<String> getServices() {
        if (services == null) {
              services = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              services.setAutoConstruct(true);
        }
        return services;
    }
    
    /**
     * A list of services you want to describe.
     *
     * @param services A list of services you want to describe.
     */
    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> servicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(services.size());
        servicesCopy.addAll(services);
        this.services = servicesCopy;
    }
    
    /**
     * A list of services you want to describe.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setServices(java.util.Collection)} or {@link
     * #withServices(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param services A list of services you want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeServicesRequest withServices(String... services) {
        if (getServices() == null) setServices(new java.util.ArrayList<String>(services.length));
        for (String value : services) {
            getServices().add(value);
        }
        return this;
    }
    
    /**
     * A list of services you want to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param services A list of services you want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeServicesRequest withServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> servicesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(services.size());
            servicesCopy.addAll(services);
            this.services = servicesCopy;
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
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getServices() != null) sb.append("Services: " + getServices() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeServicesRequest == false) return false;
        DescribeServicesRequest other = (DescribeServicesRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getServices() == null ^ this.getServices() == null) return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeServicesRequest clone() {
        
            return (DescribeServicesRequest) super.clone();
    }

}
    