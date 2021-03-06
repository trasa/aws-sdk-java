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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListVirtualMFADevicesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The status (unassigned or assigned) of the devices to list. If you do not
     * specify an <code>AssignmentStatus</code>, the action defaults to
     * <code>Any</code> which lists both assigned and unassigned virtual MFA
     * devices.
     * </p>
     */
    private String assignmentStatus;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The status (unassigned or assigned) of the devices to list. If you do not
     * specify an <code>AssignmentStatus</code>, the action defaults to
     * <code>Any</code> which lists both assigned and unassigned virtual MFA
     * devices.
     * </p>
     * 
     * @param assignmentStatus
     *        The status (unassigned or assigned) of the devices to list. If you
     *        do not specify an <code>AssignmentStatus</code>, the action
     *        defaults to <code>Any</code> which lists both assigned and
     *        unassigned virtual MFA devices.
     * @see AssignmentStatusType
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * The status (unassigned or assigned) of the devices to list. If you do not
     * specify an <code>AssignmentStatus</code>, the action defaults to
     * <code>Any</code> which lists both assigned and unassigned virtual MFA
     * devices.
     * </p>
     * 
     * @return The status (unassigned or assigned) of the devices to list. If
     *         you do not specify an <code>AssignmentStatus</code>, the action
     *         defaults to <code>Any</code> which lists both assigned and
     *         unassigned virtual MFA devices.
     * @see AssignmentStatusType
     */
    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    /**
     * <p>
     * The status (unassigned or assigned) of the devices to list. If you do not
     * specify an <code>AssignmentStatus</code>, the action defaults to
     * <code>Any</code> which lists both assigned and unassigned virtual MFA
     * devices.
     * </p>
     * 
     * @param assignmentStatus
     *        The status (unassigned or assigned) of the devices to list. If you
     *        do not specify an <code>AssignmentStatus</code>, the action
     *        defaults to <code>Any</code> which lists both assigned and
     *        unassigned virtual MFA devices.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AssignmentStatusType
     */
    public ListVirtualMFADevicesRequest withAssignmentStatus(
            String assignmentStatus) {
        setAssignmentStatus(assignmentStatus);
        return this;
    }

    /**
     * <p>
     * The status (unassigned or assigned) of the devices to list. If you do not
     * specify an <code>AssignmentStatus</code>, the action defaults to
     * <code>Any</code> which lists both assigned and unassigned virtual MFA
     * devices.
     * </p>
     * 
     * @param assignmentStatus
     *        The status (unassigned or assigned) of the devices to list. If you
     *        do not specify an <code>AssignmentStatus</code>, the action
     *        defaults to <code>Any</code> which lists both assigned and
     *        unassigned virtual MFA devices.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AssignmentStatusType
     */
    public void setAssignmentStatus(AssignmentStatusType assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
    }

    /**
     * <p>
     * The status (unassigned or assigned) of the devices to list. If you do not
     * specify an <code>AssignmentStatus</code>, the action defaults to
     * <code>Any</code> which lists both assigned and unassigned virtual MFA
     * devices.
     * </p>
     * 
     * @param assignmentStatus
     *        The status (unassigned or assigned) of the devices to list. If you
     *        do not specify an <code>AssignmentStatus</code>, the action
     *        defaults to <code>Any</code> which lists both assigned and
     *        unassigned virtual MFA devices.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AssignmentStatusType
     */
    public ListVirtualMFADevicesRequest withAssignmentStatus(
            AssignmentStatusType assignmentStatus) {
        setAssignmentStatus(assignmentStatus);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you
     *        receive a response indicating that the results are truncated. Set
     *        it to the value of the <code>Marker</code> element in the response
     *        that you received to indicate where the next call should start.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after
     *         you receive a response indicating that the results are truncated.
     *         Set it to the value of the <code>Marker</code> element in the
     *         response that you received to indicate where the next call should
     *         start.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you
     *        receive a response indicating that the results are truncated. Set
     *        it to the value of the <code>Marker</code> element in the response
     *        that you received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListVirtualMFADevicesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum
     *        number of items you want in the response. If additional items
     *        exist beyond the maximum you specify, the <code>IsTruncated</code>
     *        response element is <code>true</code>.</p>
     *        <p>
     *        This parameter is optional. If you do not include it, it defaults
     *        to 100. Note that IAM might return fewer results, even when there
     *        are more results available. In that case, the
     *        <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to
     *        include in the subsequent call that tells the service where to
     *        continue from.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @return Use this only when paginating results to indicate the maximum
     *         number of items you want in the response. If additional items
     *         exist beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>
     *         .</p>
     *         <p>
     *         This parameter is optional. If you do not include it, it defaults
     *         to 100. Note that IAM might return fewer results, even when there
     *         are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to
     *         include in the subsequent call that tells the service where to
     *         continue from.
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum
     *        number of items you want in the response. If additional items
     *        exist beyond the maximum you specify, the <code>IsTruncated</code>
     *        response element is <code>true</code>.</p>
     *        <p>
     *        This parameter is optional. If you do not include it, it defaults
     *        to 100. Note that IAM might return fewer results, even when there
     *        are more results available. In that case, the
     *        <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to
     *        include in the subsequent call that tells the service where to
     *        continue from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListVirtualMFADevicesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: " + getAssignmentStatus() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualMFADevicesRequest == false)
            return false;
        ListVirtualMFADevicesRequest other = (ListVirtualMFADevicesRequest) obj;
        if (other.getAssignmentStatus() == null
                ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null
                && other.getAssignmentStatus().equals(
                        this.getAssignmentStatus()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualMFADevicesRequest clone() {
        return (ListVirtualMFADevicesRequest) super.clone();
    }
}