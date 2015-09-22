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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Represents health information from the specified instance that belongs to the
 * AWS Elastic Beanstalk environment. Use the <code>InstanceId</code> property
 * to specify the application instance for which you'd like to return data.
 * </p>
 */
public class SingleInstanceHealth implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * ></a>.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     */
    private String color;
    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> causes;
    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     */
    private java.util.Date launchedAt;

    private ApplicationMetrics applicationMetrics;

    private SystemStatus system;

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the Amazon EC2 instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * 
     * @return The ID of the Amazon EC2 instance.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * ></a>.
     * </p>
     * 
     * @param healthStatus
     *        Returns the health status of the specified instance. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        ></a>.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * ></a>.
     * </p>
     * 
     * @return Returns the health status of the specified instance. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         ></a>.
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * Returns the health status of the specified instance. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * ></a>.
     * </p>
     * 
     * @param healthStatus
     *        Returns the health status of the specified instance. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        ></a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @param color
     *        Represents the color indicator that gives you information about
     *        the health of the EC2 instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        >Health Colors and Statuses</a>.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @return Represents the color indicator that gives you information about
     *         the health of the EC2 instance. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *         >Health Colors and Statuses</a>.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * Represents the color indicator that gives you information about the
     * health of the EC2 instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     * >Health Colors and Statuses</a>.
     * </p>
     * 
     * @param color
     *        Represents the color indicator that gives you information about
     *        the health of the EC2 instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html"
     *        >Health Colors and Statuses</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     * 
     * @return Represents the causes, which provide more information about the
     *         current health status.
     */
    public java.util.List<String> getCauses() {
        if (causes == null) {
            causes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return causes;
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     * 
     * @param causes
     *        Represents the causes, which provide more information about the
     *        current health status.
     */
    public void setCauses(java.util.Collection<String> causes) {
        if (causes == null) {
            this.causes = null;
            return;
        }

        this.causes = new com.amazonaws.internal.SdkInternalList<String>(causes);
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCauses(java.util.Collection)} or
     * {@link #withCauses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param causes
     *        Represents the causes, which provide more information about the
     *        current health status.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withCauses(String... causes) {
        if (this.causes == null) {
            setCauses(new com.amazonaws.internal.SdkInternalList<String>(
                    causes.length));
        }
        for (String ele : causes) {
            this.causes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the causes, which provide more information about the current
     * health status.
     * </p>
     * 
     * @param causes
     *        Represents the causes, which provide more information about the
     *        current health status.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withCauses(java.util.Collection<String> causes) {
        setCauses(causes);
        return this;
    }

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     * 
     * @param launchedAt
     *        The time at which the EC2 instance was launched.
     */
    public void setLaunchedAt(java.util.Date launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     * 
     * @return The time at which the EC2 instance was launched.
     */
    public java.util.Date getLaunchedAt() {
        return this.launchedAt;
    }

    /**
     * <p>
     * The time at which the EC2 instance was launched.
     * </p>
     * 
     * @param launchedAt
     *        The time at which the EC2 instance was launched.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withLaunchedAt(java.util.Date launchedAt) {
        setLaunchedAt(launchedAt);
        return this;
    }

    /**
     * Sets the value of the ApplicationMetrics property for this object.
     * 
     * @param applicationMetrics
     *        The new value for the ApplicationMetrics property for this object.
     */
    public void setApplicationMetrics(ApplicationMetrics applicationMetrics) {
        this.applicationMetrics = applicationMetrics;
    }

    /**
     * Returns the value of the ApplicationMetrics property for this object.
     * 
     * @return The value of the ApplicationMetrics property for this object.
     */
    public ApplicationMetrics getApplicationMetrics() {
        return this.applicationMetrics;
    }

    /**
     * Sets the value of the ApplicationMetrics property for this object.
     * 
     * @param applicationMetrics
     *        The new value for the ApplicationMetrics property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withApplicationMetrics(
            ApplicationMetrics applicationMetrics) {
        setApplicationMetrics(applicationMetrics);
        return this;
    }

    /**
     * Sets the value of the System property for this object.
     * 
     * @param system
     *        The new value for the System property for this object.
     */
    public void setSystem(SystemStatus system) {
        this.system = system;
    }

    /**
     * Returns the value of the System property for this object.
     * 
     * @return The value of the System property for this object.
     */
    public SystemStatus getSystem() {
        return this.system;
    }

    /**
     * Sets the value of the System property for this object.
     * 
     * @param system
     *        The new value for the System property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SingleInstanceHealth withSystem(SystemStatus system) {
        setSystem(system);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getColor() != null)
            sb.append("Color: " + getColor() + ",");
        if (getCauses() != null)
            sb.append("Causes: " + getCauses() + ",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: " + getLaunchedAt() + ",");
        if (getApplicationMetrics() != null)
            sb.append("ApplicationMetrics: " + getApplicationMetrics() + ",");
        if (getSystem() != null)
            sb.append("System: " + getSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleInstanceHealth == false)
            return false;
        SingleInstanceHealth other = (SingleInstanceHealth) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null
                && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getCauses() == null ^ this.getCauses() == null)
            return false;
        if (other.getCauses() != null
                && other.getCauses().equals(this.getCauses()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null
                && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        if (other.getApplicationMetrics() == null
                ^ this.getApplicationMetrics() == null)
            return false;
        if (other.getApplicationMetrics() != null
                && other.getApplicationMetrics().equals(
                        this.getApplicationMetrics()) == false)
            return false;
        if (other.getSystem() == null ^ this.getSystem() == null)
            return false;
        if (other.getSystem() != null
                && other.getSystem().equals(this.getSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode
                + ((getCauses() == null) ? 0 : getCauses().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getApplicationMetrics() == null) ? 0
                        : getApplicationMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getSystem() == null) ? 0 : getSystem().hashCode());
        return hashCode;
    }

    @Override
    public SingleInstanceHealth clone() {
        try {
            return (SingleInstanceHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}