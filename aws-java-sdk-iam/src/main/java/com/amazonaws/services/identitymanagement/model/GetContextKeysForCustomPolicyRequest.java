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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest) GetContextKeysForCustomPolicy operation}.
 * <p>
 * Gets a list of all of the context keys referenced in
 * <code>Condition</code> elements in the input policies. The policies
 * are supplied as a list of one or more strings. To get the context keys
 * from policies associated with an IAM user, group, or role, use
 * GetContextKeysForPrincipalPolicy.
 * </p>
 * <p>
 * Context keys are variables maintained by AWS and its services that
 * provide details about the context of an API query request, and can be
 * evaluated by using the <code>Condition</code> element of an IAM
 * policy. Use GetContextKeysForCustomPolicy to understand what key names
 * and values you must supply when you call SimulateCustomPolicy. Note
 * that all parameters are shown in unencoded form here for clarity, but
 * must be URL encoded to be included as a part of a real HTML request.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest)
 */
public class GetContextKeysForCustomPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A list of policies for which you want list of context keys used in
     * <code>Condition</code> elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputList;

    /**
     * A list of policies for which you want list of context keys used in
     * <code>Condition</code> elements.
     *
     * @return A list of policies for which you want list of context keys used in
     *         <code>Condition</code> elements.
     */
    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
              policyInputList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyInputList.setAutoConstruct(true);
        }
        return policyInputList;
    }
    
    /**
     * A list of policies for which you want list of context keys used in
     * <code>Condition</code> elements.
     *
     * @param policyInputList A list of policies for which you want list of context keys used in
     *         <code>Condition</code> elements.
     */
    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyInputList.size());
        policyInputListCopy.addAll(policyInputList);
        this.policyInputList = policyInputListCopy;
    }
    
    /**
     * A list of policies for which you want list of context keys used in
     * <code>Condition</code> elements.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyInputList(java.util.Collection)} or {@link
     * #withPolicyInputList(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyInputList A list of policies for which you want list of context keys used in
     *         <code>Condition</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForCustomPolicyRequest withPolicyInputList(String... policyInputList) {
        if (getPolicyInputList() == null) setPolicyInputList(new java.util.ArrayList<String>(policyInputList.length));
        for (String value : policyInputList) {
            getPolicyInputList().add(value);
        }
        return this;
    }
    
    /**
     * A list of policies for which you want list of context keys used in
     * <code>Condition</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyInputList A list of policies for which you want list of context keys used in
     *         <code>Condition</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForCustomPolicyRequest withPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyInputList.size());
            policyInputListCopy.addAll(policyInputList);
            this.policyInputList = policyInputListCopy;
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
        if (getPolicyInputList() != null) sb.append("PolicyInputList: " + getPolicyInputList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyInputList() == null) ? 0 : getPolicyInputList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetContextKeysForCustomPolicyRequest == false) return false;
        GetContextKeysForCustomPolicyRequest other = (GetContextKeysForCustomPolicyRequest)obj;
        
        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null) return false;
        if (other.getPolicyInputList() != null && other.getPolicyInputList().equals(this.getPolicyInputList()) == false) return false; 
        return true;
    }
    
    @Override
    public GetContextKeysForCustomPolicyRequest clone() {
        
            return (GetContextKeysForCustomPolicyRequest) super.clone();
    }

}
    