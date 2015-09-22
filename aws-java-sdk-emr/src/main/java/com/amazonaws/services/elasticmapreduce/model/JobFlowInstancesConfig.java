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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A description of the Amazon EC2 instance running the job flow. A valid
 * JobFlowInstancesConfig must contain at least InstanceGroups, which is
 * the recommended configuration. However, a valid alternative is to have
 * MasterInstanceType, SlaveInstanceType, and InstanceCount (all three
 * must be present).
 * </p>
 */
public class JobFlowInstancesConfig implements Serializable, Cloneable {

    /**
     * The EC2 instance type of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String masterInstanceType;

    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String slaveInstanceType;

    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     */
    private Integer instanceCount;

    /**
     * Configuration for the job flow's instance groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig> instanceGroups;

    /**
     * The name of the Amazon EC2 key pair that can be used to ssh to the
     * master node as the user called "hadoop."
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String ec2KeyName;

    /**
     * The Availability Zone the job flow will run in.
     */
    private PlacementType placement;

    /**
     * Specifies whether the job flow should be kept alive after completing
     * all steps.
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    /**
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in
     * the event of a job flow error.
     */
    private Boolean terminationProtected;

    /**
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     * is used, unless the AmiVersion parameter is set in the RunJobFlow
     * call, in which case the default version of Hadoop for that AMI version
     * is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String hadoopVersion;

    /**
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     * set this parameter to the identifier of the Amazon VPC subnet where
     * you want the job flow to launch. If you do not specify this value, the
     * job flow is launched in the normal Amazon Web Services cloud, outside
     * of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     * compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     * specify the cc1.4xlarge instance type for nodes of a job flow launched
     * in a Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String ec2SubnetId;

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String emrManagedMasterSecurityGroup;

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String emrManagedSlaveSecurityGroup;

    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroups;

    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroups;

    /**
     * Default constructor for a new JobFlowInstancesConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public JobFlowInstancesConfig() {}
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The EC2 instance type of the master node.
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param masterInstanceType The EC2 instance type of the master node.
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }
    
    /**
     * The EC2 instance type of the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param masterInstanceType The EC2 instance type of the master node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }

    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The EC2 instance type of the slave nodes.
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }
    
    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param slaveInstanceType The EC2 instance type of the slave nodes.
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }
    
    /**
     * The EC2 instance type of the slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param slaveInstanceType The EC2 instance type of the slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }

    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     *
     * @return The number of Amazon EC2 instances used to execute the job flow.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     *
     * @param instanceCount The number of Amazon EC2 instances used to execute the job flow.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of Amazon EC2 instances used to execute the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of Amazon EC2 instances used to execute the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Configuration for the job flow's instance groups.
     *
     * @return Configuration for the job flow's instance groups.
     */
    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        if (instanceGroups == null) {
              instanceGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig>();
              instanceGroups.setAutoConstruct(true);
        }
        return instanceGroups;
    }
    
    /**
     * Configuration for the job flow's instance groups.
     *
     * @param instanceGroups Configuration for the job flow's instance groups.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig> instanceGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig>(instanceGroups.size());
        instanceGroupsCopy.addAll(instanceGroups);
        this.instanceGroups = instanceGroupsCopy;
    }
    
    /**
     * Configuration for the job flow's instance groups.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceGroups(java.util.Collection)} or {@link
     * #withInstanceGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Configuration for the job flow's instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withInstanceGroups(InstanceGroupConfig... instanceGroups) {
        if (getInstanceGroups() == null) setInstanceGroups(new java.util.ArrayList<InstanceGroupConfig>(instanceGroups.length));
        for (InstanceGroupConfig value : instanceGroups) {
            getInstanceGroups().add(value);
        }
        return this;
    }
    
    /**
     * Configuration for the job flow's instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Configuration for the job flow's instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig> instanceGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig>(instanceGroups.size());
            instanceGroupsCopy.addAll(instanceGroups);
            this.instanceGroups = instanceGroupsCopy;
        }

        return this;
    }

    /**
     * The name of the Amazon EC2 key pair that can be used to ssh to the
     * master node as the user called "hadoop."
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Amazon EC2 key pair that can be used to ssh to the
     *         master node as the user called "hadoop."
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair that can be used to ssh to the
     * master node as the user called "hadoop."
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param ec2KeyName The name of the Amazon EC2 key pair that can be used to ssh to the
     *         master node as the user called "hadoop."
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair that can be used to ssh to the
     * master node as the user called "hadoop."
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param ec2KeyName The name of the Amazon EC2 key pair that can be used to ssh to the
     *         master node as the user called "hadoop."
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * The Availability Zone the job flow will run in.
     *
     * @return The Availability Zone the job flow will run in.
     */
    public PlacementType getPlacement() {
        return placement;
    }
    
    /**
     * The Availability Zone the job flow will run in.
     *
     * @param placement The Availability Zone the job flow will run in.
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }
    
    /**
     * The Availability Zone the job flow will run in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The Availability Zone the job flow will run in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }

    /**
     * Specifies whether the job flow should be kept alive after completing
     * all steps.
     *
     * @return Specifies whether the job flow should be kept alive after completing
     *         all steps.
     */
    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether the job flow should be kept alive after completing
     * all steps.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether the job flow should be kept alive after completing
     *         all steps.
     */
    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }
    
    /**
     * Specifies whether the job flow should be kept alive after completing
     * all steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keepJobFlowAliveWhenNoSteps Specifies whether the job flow should be kept alive after completing
     *         all steps.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }

    /**
     * Specifies whether the job flow should be kept alive after completing
     * all steps.
     *
     * @return Specifies whether the job flow should be kept alive after completing
     *         all steps.
     */
    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }

    /**
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in
     * the event of a job flow error.
     *
     * @return Specifies whether to lock the job flow to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention, or in
     *         the event of a job flow error.
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }
    
    /**
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in
     * the event of a job flow error.
     *
     * @param terminationProtected Specifies whether to lock the job flow to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention, or in
     *         the event of a job flow error.
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }
    
    /**
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in
     * the event of a job flow error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationProtected Specifies whether to lock the job flow to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention, or in
     *         the event of a job flow error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    /**
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in
     * the event of a job flow error.
     *
     * @return Specifies whether to lock the job flow to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention, or in
     *         the event of a job flow error.
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     * is used, unless the AmiVersion parameter is set in the RunJobFlow
     * call, in which case the default version of Hadoop for that AMI version
     * is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The Hadoop version for the job flow. Valid inputs are "0.18"
     *         (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     *         "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     *         is used, unless the AmiVersion parameter is set in the RunJobFlow
     *         call, in which case the default version of Hadoop for that AMI version
     *         is used.
     */
    public String getHadoopVersion() {
        return hadoopVersion;
    }
    
    /**
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     * is used, unless the AmiVersion parameter is set in the RunJobFlow
     * call, in which case the default version of Hadoop for that AMI version
     * is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param hadoopVersion The Hadoop version for the job flow. Valid inputs are "0.18"
     *         (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     *         "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     *         is used, unless the AmiVersion parameter is set in the RunJobFlow
     *         call, in which case the default version of Hadoop for that AMI version
     *         is used.
     */
    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }
    
    /**
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     * is used, unless the AmiVersion parameter is set in the RunJobFlow
     * call, in which case the default version of Hadoop for that AMI version
     * is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param hadoopVersion The Hadoop version for the job flow. Valid inputs are "0.18"
     *         (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     *         "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18
     *         is used, unless the AmiVersion parameter is set in the RunJobFlow
     *         call, in which case the default version of Hadoop for that AMI version
     *         is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }

    /**
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     * set this parameter to the identifier of the Amazon VPC subnet where
     * you want the job flow to launch. If you do not specify this value, the
     * job flow is launched in the normal Amazon Web Services cloud, outside
     * of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     * compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     * specify the cc1.4xlarge instance type for nodes of a job flow launched
     * in a Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     *         set this parameter to the identifier of the Amazon VPC subnet where
     *         you want the job flow to launch. If you do not specify this value, the
     *         job flow is launched in the normal Amazon Web Services cloud, outside
     *         of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     *         compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     *         specify the cc1.4xlarge instance type for nodes of a job flow launched
     *         in a Amazon VPC.
     */
    public String getEc2SubnetId() {
        return ec2SubnetId;
    }
    
    /**
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     * set this parameter to the identifier of the Amazon VPC subnet where
     * you want the job flow to launch. If you do not specify this value, the
     * job flow is launched in the normal Amazon Web Services cloud, outside
     * of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     * compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     * specify the cc1.4xlarge instance type for nodes of a job flow launched
     * in a Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param ec2SubnetId To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     *         set this parameter to the identifier of the Amazon VPC subnet where
     *         you want the job flow to launch. If you do not specify this value, the
     *         job flow is launched in the normal Amazon Web Services cloud, outside
     *         of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     *         compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     *         specify the cc1.4xlarge instance type for nodes of a job flow launched
     *         in a Amazon VPC.
     */
    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }
    
    /**
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     * set this parameter to the identifier of the Amazon VPC subnet where
     * you want the job flow to launch. If you do not specify this value, the
     * job flow is launched in the normal Amazon Web Services cloud, outside
     * of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     * compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     * specify the cc1.4xlarge instance type for nodes of a job flow launched
     * in a Amazon VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param ec2SubnetId To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC),
     *         set this parameter to the identifier of the Amazon VPC subnet where
     *         you want the job flow to launch. If you do not specify this value, the
     *         job flow is launched in the normal Amazon Web Services cloud, outside
     *         of an Amazon VPC. <p> Amazon VPC currently does not support cluster
     *         compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot
     *         specify the cc1.4xlarge instance type for nodes of a job flow launched
     *         in a Amazon VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the Amazon EC2 security group (managed by Amazon
     *         ElasticMapReduce) for the master node.
     */
    public String getEmrManagedMasterSecurityGroup() {
        return emrManagedMasterSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the master node.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         ElasticMapReduce) for the master node.
     */
    public void setEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         ElasticMapReduce) for the master node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        return this;
    }

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the Amazon EC2 security group (managed by Amazon
     *         ElasticMapReduce) for the slave nodes.
     */
    public String getEmrManagedSlaveSecurityGroup() {
        return emrManagedSlaveSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the slave nodes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         ElasticMapReduce) for the slave nodes.
     */
    public void setEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * ElasticMapReduce) for the slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         ElasticMapReduce) for the slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        return this;
    }

    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     *
     * @return A list of additional Amazon EC2 security group IDs for the master
     *         node.
     */
    public java.util.List<String> getAdditionalMasterSecurityGroups() {
        if (additionalMasterSecurityGroups == null) {
              additionalMasterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              additionalMasterSecurityGroups.setAutoConstruct(true);
        }
        return additionalMasterSecurityGroups;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     *
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for the master
     *         node.
     */
    public void setAdditionalMasterSecurityGroups(java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalMasterSecurityGroups.size());
        additionalMasterSecurityGroupsCopy.addAll(additionalMasterSecurityGroups);
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroupsCopy;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link
     * #setAdditionalMasterSecurityGroups(java.util.Collection)} or {@link
     * #withAdditionalMasterSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for the master
     *         node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(String... additionalMasterSecurityGroups) {
        if (getAdditionalMasterSecurityGroups() == null) setAdditionalMasterSecurityGroups(new java.util.ArrayList<String>(additionalMasterSecurityGroups.length));
        for (String value : additionalMasterSecurityGroups) {
            getAdditionalMasterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for the master
     *         node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalMasterSecurityGroups.size());
            additionalMasterSecurityGroupsCopy.addAll(additionalMasterSecurityGroups);
            this.additionalMasterSecurityGroups = additionalMasterSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     *
     * @return A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     */
    public java.util.List<String> getAdditionalSlaveSecurityGroups() {
        if (additionalSlaveSecurityGroups == null) {
              additionalSlaveSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              additionalSlaveSecurityGroups.setAutoConstruct(true);
        }
        return additionalSlaveSecurityGroups;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     *
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     */
    public void setAdditionalSlaveSecurityGroups(java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalSlaveSecurityGroups.size());
        additionalSlaveSecurityGroupsCopy.addAll(additionalSlaveSecurityGroups);
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroupsCopy;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link
     * #setAdditionalSlaveSecurityGroups(java.util.Collection)} or {@link
     * #withAdditionalSlaveSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(String... additionalSlaveSecurityGroups) {
        if (getAdditionalSlaveSecurityGroups() == null) setAdditionalSlaveSecurityGroups(new java.util.ArrayList<String>(additionalSlaveSecurityGroups.length));
        for (String value : additionalSlaveSecurityGroups) {
            getAdditionalSlaveSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalSlaveSecurityGroups.size());
            additionalSlaveSecurityGroupsCopy.addAll(additionalSlaveSecurityGroups);
            this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroupsCopy;
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
        if (getMasterInstanceType() != null) sb.append("MasterInstanceType: " + getMasterInstanceType() + ",");
        if (getSlaveInstanceType() != null) sb.append("SlaveInstanceType: " + getSlaveInstanceType() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceGroups() != null) sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getEc2KeyName() != null) sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (isKeepJobFlowAliveWhenNoSteps() != null) sb.append("KeepJobFlowAliveWhenNoSteps: " + isKeepJobFlowAliveWhenNoSteps() + ",");
        if (isTerminationProtected() != null) sb.append("TerminationProtected: " + isTerminationProtected() + ",");
        if (getHadoopVersion() != null) sb.append("HadoopVersion: " + getHadoopVersion() + ",");
        if (getEc2SubnetId() != null) sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getEmrManagedMasterSecurityGroup() != null) sb.append("EmrManagedMasterSecurityGroup: " + getEmrManagedMasterSecurityGroup() + ",");
        if (getEmrManagedSlaveSecurityGroup() != null) sb.append("EmrManagedSlaveSecurityGroup: " + getEmrManagedSlaveSecurityGroup() + ",");
        if (getAdditionalMasterSecurityGroups() != null) sb.append("AdditionalMasterSecurityGroups: " + getAdditionalMasterSecurityGroups() + ",");
        if (getAdditionalSlaveSecurityGroups() != null) sb.append("AdditionalSlaveSecurityGroups: " + getAdditionalSlaveSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMasterInstanceType() == null) ? 0 : getMasterInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getSlaveInstanceType() == null) ? 0 : getSlaveInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceGroups() == null) ? 0 : getInstanceGroups().hashCode()); 
        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((isKeepJobFlowAliveWhenNoSteps() == null) ? 0 : isKeepJobFlowAliveWhenNoSteps().hashCode()); 
        hashCode = prime * hashCode + ((isTerminationProtected() == null) ? 0 : isTerminationProtected().hashCode()); 
        hashCode = prime * hashCode + ((getHadoopVersion() == null) ? 0 : getHadoopVersion().hashCode()); 
        hashCode = prime * hashCode + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getEmrManagedMasterSecurityGroup() == null) ? 0 : getEmrManagedMasterSecurityGroup().hashCode()); 
        hashCode = prime * hashCode + ((getEmrManagedSlaveSecurityGroup() == null) ? 0 : getEmrManagedSlaveSecurityGroup().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalMasterSecurityGroups() == null) ? 0 : getAdditionalMasterSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalSlaveSecurityGroups() == null) ? 0 : getAdditionalSlaveSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobFlowInstancesConfig == false) return false;
        JobFlowInstancesConfig other = (JobFlowInstancesConfig)obj;
        
        if (other.getMasterInstanceType() == null ^ this.getMasterInstanceType() == null) return false;
        if (other.getMasterInstanceType() != null && other.getMasterInstanceType().equals(this.getMasterInstanceType()) == false) return false; 
        if (other.getSlaveInstanceType() == null ^ this.getSlaveInstanceType() == null) return false;
        if (other.getSlaveInstanceType() != null && other.getSlaveInstanceType().equals(this.getSlaveInstanceType()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getInstanceGroups() == null ^ this.getInstanceGroups() == null) return false;
        if (other.getInstanceGroups() != null && other.getInstanceGroups().equals(this.getInstanceGroups()) == false) return false; 
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null) return false;
        if (other.getEc2KeyName() != null && other.getEc2KeyName().equals(this.getEc2KeyName()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.isKeepJobFlowAliveWhenNoSteps() == null ^ this.isKeepJobFlowAliveWhenNoSteps() == null) return false;
        if (other.isKeepJobFlowAliveWhenNoSteps() != null && other.isKeepJobFlowAliveWhenNoSteps().equals(this.isKeepJobFlowAliveWhenNoSteps()) == false) return false; 
        if (other.isTerminationProtected() == null ^ this.isTerminationProtected() == null) return false;
        if (other.isTerminationProtected() != null && other.isTerminationProtected().equals(this.isTerminationProtected()) == false) return false; 
        if (other.getHadoopVersion() == null ^ this.getHadoopVersion() == null) return false;
        if (other.getHadoopVersion() != null && other.getHadoopVersion().equals(this.getHadoopVersion()) == false) return false; 
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null) return false;
        if (other.getEc2SubnetId() != null && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false) return false; 
        if (other.getEmrManagedMasterSecurityGroup() == null ^ this.getEmrManagedMasterSecurityGroup() == null) return false;
        if (other.getEmrManagedMasterSecurityGroup() != null && other.getEmrManagedMasterSecurityGroup().equals(this.getEmrManagedMasterSecurityGroup()) == false) return false; 
        if (other.getEmrManagedSlaveSecurityGroup() == null ^ this.getEmrManagedSlaveSecurityGroup() == null) return false;
        if (other.getEmrManagedSlaveSecurityGroup() != null && other.getEmrManagedSlaveSecurityGroup().equals(this.getEmrManagedSlaveSecurityGroup()) == false) return false; 
        if (other.getAdditionalMasterSecurityGroups() == null ^ this.getAdditionalMasterSecurityGroups() == null) return false;
        if (other.getAdditionalMasterSecurityGroups() != null && other.getAdditionalMasterSecurityGroups().equals(this.getAdditionalMasterSecurityGroups()) == false) return false; 
        if (other.getAdditionalSlaveSecurityGroups() == null ^ this.getAdditionalSlaveSecurityGroups() == null) return false;
        if (other.getAdditionalSlaveSecurityGroups() != null && other.getAdditionalSlaveSecurityGroups().equals(this.getAdditionalSlaveSecurityGroups()) == false) return false; 
        return true;
    }
    
    @Override
    public JobFlowInstancesConfig clone() {
        try {
            return (JobFlowInstancesConfig) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    