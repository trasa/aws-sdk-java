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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAvailableZonesResult implements Serializable, Cloneable {

    /**
     * The list of Availability Zones that have available AWS CloudHSM
     * capacity.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> aZList;

    /**
     * The list of Availability Zones that have available AWS CloudHSM
     * capacity.
     *
     * @return The list of Availability Zones that have available AWS CloudHSM
     *         capacity.
     */
    public java.util.List<String> getAZList() {
        if (aZList == null) {
              aZList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              aZList.setAutoConstruct(true);
        }
        return aZList;
    }
    
    /**
     * The list of Availability Zones that have available AWS CloudHSM
     * capacity.
     *
     * @param aZList The list of Availability Zones that have available AWS CloudHSM
     *         capacity.
     */
    public void setAZList(java.util.Collection<String> aZList) {
        if (aZList == null) {
            this.aZList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> aZListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aZList.size());
        aZListCopy.addAll(aZList);
        this.aZList = aZListCopy;
    }
    
    /**
     * The list of Availability Zones that have available AWS CloudHSM
     * capacity.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAZList(java.util.Collection)} or {@link
     * #withAZList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aZList The list of Availability Zones that have available AWS CloudHSM
     *         capacity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAvailableZonesResult withAZList(String... aZList) {
        if (getAZList() == null) setAZList(new java.util.ArrayList<String>(aZList.length));
        for (String value : aZList) {
            getAZList().add(value);
        }
        return this;
    }
    
    /**
     * The list of Availability Zones that have available AWS CloudHSM
     * capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aZList The list of Availability Zones that have available AWS CloudHSM
     *         capacity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAvailableZonesResult withAZList(java.util.Collection<String> aZList) {
        if (aZList == null) {
            this.aZList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> aZListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aZList.size());
            aZListCopy.addAll(aZList);
            this.aZList = aZListCopy;
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
        if (getAZList() != null) sb.append("AZList: " + getAZList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAZList() == null) ? 0 : getAZList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAvailableZonesResult == false) return false;
        ListAvailableZonesResult other = (ListAvailableZonesResult)obj;
        
        if (other.getAZList() == null ^ this.getAZList() == null) return false;
        if (other.getAZList() != null && other.getAZList().equals(this.getAZList()) == false) return false; 
        return true;
    }
    
    @Override
    public ListAvailableZonesResult clone() {
        try {
            return (ListAvailableZonesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    