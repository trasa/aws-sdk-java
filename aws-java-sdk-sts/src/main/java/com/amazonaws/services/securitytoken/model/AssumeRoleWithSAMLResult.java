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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful AssumeRoleWithSAML request,
 * including temporary AWS credentials that can be used to make AWS
 * requests.
 * </p>
 */
public class AssumeRoleWithSAMLResult implements Serializable, Cloneable {

    /**
     * AWS credentials for API authentication.
     */
    private Credentials credentials;

    /**
     * The identifiers for the temporary security credentials that the
     * operation returns.
     */
    private AssumedRoleUser assumedRoleUser;

    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer packedPolicySize;

    /**
     * The value of the <code>NameID</code> element in the
     * <code>Subject</code> element of the SAML assertion.
     */
    private String subject;

    /**
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>. <p> If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     */
    private String subjectType;

    /**
     * The value of the <code>Issuer</code> element of the SAML assertion.
     */
    private String issuer;

    /**
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     */
    private String audience;

    /**
     * A hash value based on the concatenation of the <code>Issuer</code>
     * response value, the AWS account ID, and the friendly name (the last
     * part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to
     * uniquely identify a federated user. <p>The following pseudocode shows
     * how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     * "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     */
    private String nameQualifier;

    /**
     * AWS credentials for API authentication.
     *
     * @return AWS credentials for API authentication.
     */
    public Credentials getCredentials() {
        return credentials;
    }
    
    /**
     * AWS credentials for API authentication.
     *
     * @param credentials AWS credentials for API authentication.
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    
    /**
     * AWS credentials for API authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param credentials AWS credentials for API authentication.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * The identifiers for the temporary security credentials that the
     * operation returns.
     *
     * @return The identifiers for the temporary security credentials that the
     *         operation returns.
     */
    public AssumedRoleUser getAssumedRoleUser() {
        return assumedRoleUser;
    }
    
    /**
     * The identifiers for the temporary security credentials that the
     * operation returns.
     *
     * @param assumedRoleUser The identifiers for the temporary security credentials that the
     *         operation returns.
     */
    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }
    
    /**
     * The identifiers for the temporary security credentials that the
     * operation returns.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param assumedRoleUser The identifiers for the temporary security credentials that the
     *         operation returns.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }

    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A percentage value that indicates the size of the policy in packed
     *         form. The service rejects any policy with a packed size greater than
     *         100 percent, which means the policy exceeded the allowed space.
     */
    public Integer getPackedPolicySize() {
        return packedPolicySize;
    }
    
    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize A percentage value that indicates the size of the policy in packed
     *         form. The service rejects any policy with a packed size greater than
     *         100 percent, which means the policy exceeded the allowed space.
     */
    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }
    
    /**
     * A percentage value that indicates the size of the policy in packed
     * form. The service rejects any policy with a packed size greater than
     * 100 percent, which means the policy exceeded the allowed space.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize A percentage value that indicates the size of the policy in packed
     *         form. The service rejects any policy with a packed size greater than
     *         100 percent, which means the policy exceeded the allowed space.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
        return this;
    }

    /**
     * The value of the <code>NameID</code> element in the
     * <code>Subject</code> element of the SAML assertion.
     *
     * @return The value of the <code>NameID</code> element in the
     *         <code>Subject</code> element of the SAML assertion.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * The value of the <code>NameID</code> element in the
     * <code>Subject</code> element of the SAML assertion.
     *
     * @param subject The value of the <code>NameID</code> element in the
     *         <code>Subject</code> element of the SAML assertion.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * The value of the <code>NameID</code> element in the
     * <code>Subject</code> element of the SAML assertion.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject The value of the <code>NameID</code> element in the
     *         <code>Subject</code> element of the SAML assertion.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>. <p> If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     *
     * @return The format of the name ID, as defined by the <code>Format</code>
     *         attribute in the <code>NameID</code> element of the SAML assertion.
     *         Typical examples of the format are <code>transient</code> or
     *         <code>persistent</code>. <p> If the format includes the prefix
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     *         removed. For example,
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     *         returned as <code>transient</code>. If the format includes any other
     *         prefix, the format is returned with no modifications.
     */
    public String getSubjectType() {
        return subjectType;
    }
    
    /**
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>. <p> If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     *
     * @param subjectType The format of the name ID, as defined by the <code>Format</code>
     *         attribute in the <code>NameID</code> element of the SAML assertion.
     *         Typical examples of the format are <code>transient</code> or
     *         <code>persistent</code>. <p> If the format includes the prefix
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     *         removed. For example,
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     *         returned as <code>transient</code>. If the format includes any other
     *         prefix, the format is returned with no modifications.
     */
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }
    
    /**
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>. <p> If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subjectType The format of the name ID, as defined by the <code>Format</code>
     *         attribute in the <code>NameID</code> element of the SAML assertion.
     *         Typical examples of the format are <code>transient</code> or
     *         <code>persistent</code>. <p> If the format includes the prefix
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     *         removed. For example,
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     *         returned as <code>transient</code>. If the format includes any other
     *         prefix, the format is returned with no modifications.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * The value of the <code>Issuer</code> element of the SAML assertion.
     *
     * @return The value of the <code>Issuer</code> element of the SAML assertion.
     */
    public String getIssuer() {
        return issuer;
    }
    
    /**
     * The value of the <code>Issuer</code> element of the SAML assertion.
     *
     * @param issuer The value of the <code>Issuer</code> element of the SAML assertion.
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    
    /**
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param issuer The value of the <code>Issuer</code> element of the SAML assertion.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     *
     * @return The value of the <code>Recipient</code> attribute of the
     *         <code>SubjectConfirmationData</code> element of the SAML assertion.
     */
    public String getAudience() {
        return audience;
    }
    
    /**
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     *
     * @param audience The value of the <code>Recipient</code> attribute of the
     *         <code>SubjectConfirmationData</code> element of the SAML assertion.
     */
    public void setAudience(String audience) {
        this.audience = audience;
    }
    
    /**
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param audience The value of the <code>Recipient</code> attribute of the
     *         <code>SubjectConfirmationData</code> element of the SAML assertion.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * A hash value based on the concatenation of the <code>Issuer</code>
     * response value, the AWS account ID, and the friendly name (the last
     * part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to
     * uniquely identify a federated user. <p>The following pseudocode shows
     * how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     * "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     *
     * @return A hash value based on the concatenation of the <code>Issuer</code>
     *         response value, the AWS account ID, and the friendly name (the last
     *         part of the ARN) of the SAML provider in IAM. The combination of
     *         <code>NameQualifier</code> and <code>Subject</code> can be used to
     *         uniquely identify a federated user. <p>The following pseudocode shows
     *         how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     *         "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     */
    public String getNameQualifier() {
        return nameQualifier;
    }
    
    /**
     * A hash value based on the concatenation of the <code>Issuer</code>
     * response value, the AWS account ID, and the friendly name (the last
     * part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to
     * uniquely identify a federated user. <p>The following pseudocode shows
     * how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     * "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     *
     * @param nameQualifier A hash value based on the concatenation of the <code>Issuer</code>
     *         response value, the AWS account ID, and the friendly name (the last
     *         part of the ARN) of the SAML provider in IAM. The combination of
     *         <code>NameQualifier</code> and <code>Subject</code> can be used to
     *         uniquely identify a federated user. <p>The following pseudocode shows
     *         how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     *         "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     */
    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }
    
    /**
     * A hash value based on the concatenation of the <code>Issuer</code>
     * response value, the AWS account ID, and the friendly name (the last
     * part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to
     * uniquely identify a federated user. <p>The following pseudocode shows
     * how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     * "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nameQualifier A hash value based on the concatenation of the <code>Issuer</code>
     *         response value, the AWS account ID, and the friendly name (the last
     *         part of the ARN) of the SAML provider in IAM. The combination of
     *         <code>NameQualifier</code> and <code>Subject</code> can be used to
     *         uniquely identify a federated user. <p>The following pseudocode shows
     *         how the hash value is calculated: <p> <code>BASE64 ( SHA1 (
     *         "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleWithSAMLResult withNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
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
        if (getCredentials() != null) sb.append("Credentials: " + getCredentials() + ",");
        if (getAssumedRoleUser() != null) sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        if (getPackedPolicySize() != null) sb.append("PackedPolicySize: " + getPackedPolicySize() + ",");
        if (getSubject() != null) sb.append("Subject: " + getSubject() + ",");
        if (getSubjectType() != null) sb.append("SubjectType: " + getSubjectType() + ",");
        if (getIssuer() != null) sb.append("Issuer: " + getIssuer() + ",");
        if (getAudience() != null) sb.append("Audience: " + getAudience() + ",");
        if (getNameQualifier() != null) sb.append("NameQualifier: " + getNameQualifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode()); 
        hashCode = prime * hashCode + ((getAssumedRoleUser() == null) ? 0 : getAssumedRoleUser().hashCode()); 
        hashCode = prime * hashCode + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize().hashCode()); 
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode()); 
        hashCode = prime * hashCode + ((getSubjectType() == null) ? 0 : getSubjectType().hashCode()); 
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode()); 
        hashCode = prime * hashCode + ((getAudience() == null) ? 0 : getAudience().hashCode()); 
        hashCode = prime * hashCode + ((getNameQualifier() == null) ? 0 : getNameQualifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssumeRoleWithSAMLResult == false) return false;
        AssumeRoleWithSAMLResult other = (AssumeRoleWithSAMLResult)obj;
        
        if (other.getCredentials() == null ^ this.getCredentials() == null) return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false) return false; 
        if (other.getAssumedRoleUser() == null ^ this.getAssumedRoleUser() == null) return false;
        if (other.getAssumedRoleUser() != null && other.getAssumedRoleUser().equals(this.getAssumedRoleUser()) == false) return false; 
        if (other.getPackedPolicySize() == null ^ this.getPackedPolicySize() == null) return false;
        if (other.getPackedPolicySize() != null && other.getPackedPolicySize().equals(this.getPackedPolicySize()) == false) return false; 
        if (other.getSubject() == null ^ this.getSubject() == null) return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false) return false; 
        if (other.getSubjectType() == null ^ this.getSubjectType() == null) return false;
        if (other.getSubjectType() != null && other.getSubjectType().equals(this.getSubjectType()) == false) return false; 
        if (other.getIssuer() == null ^ this.getIssuer() == null) return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false) return false; 
        if (other.getAudience() == null ^ this.getAudience() == null) return false;
        if (other.getAudience() != null && other.getAudience().equals(this.getAudience()) == false) return false; 
        if (other.getNameQualifier() == null ^ this.getNameQualifier() == null) return false;
        if (other.getNameQualifier() != null && other.getNameQualifier().equals(this.getNameQualifier()) == false) return false; 
        return true;
    }
    
    @Override
    public AssumeRoleWithSAMLResult clone() {
        try {
            return (AssumeRoleWithSAMLResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    