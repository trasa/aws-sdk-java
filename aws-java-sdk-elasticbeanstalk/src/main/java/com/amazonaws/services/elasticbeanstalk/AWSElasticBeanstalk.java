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
package com.amazonaws.services.elasticbeanstalk;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticbeanstalk.model.*;

/**
 * Interface for accessing Elastic Beanstalk.
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * This is the AWS Elastic Beanstalk API Reference. This guide provides detailed
 * information about AWS Elastic Beanstalk actions, data types, parameters, and
 * errors.
 * </p>
 * <p>
 * AWS Elastic Beanstalk is a tool that makes it easy for you to create, deploy,
 * and manage scalable, fault-tolerant applications running on Amazon Web
 * Services cloud resources.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic Beanstalk</a>
 * details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href=
 * "http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.
 * wsdl</a>. To install the Software Development Kits (SDKs), Integrated
 * Development Environment (IDE) Toolkits, and command line tools that enable
 * you to access the API, go to <a href="https://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports,
 * go to <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region"
 * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
public interface AWSElasticBeanstalk {

    /**
     * Overrides the default endpoint for this client
     * ("https://elasticbeanstalk.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "elasticbeanstalk.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://elasticbeanstalk.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elasticbeanstalk.us-east-1.amazonaws.com") or a
     *        full URL, including the protocol (ex:
     *        "https://elasticbeanstalk.us-east-1.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSElasticBeanstalk#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Cancels in-progress environment configuration update or application
     * version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    void abortEnvironmentUpdate(
            AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest);

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation.
     *
     * @see #abortEnvironmentUpdate(AbortEnvironmentUpdateRequest)
     */
    void abortEnvironmentUpdate();

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest
     *        Results message indicating whether a CNAME is available.
     * @return Result of the CheckDNSAvailability operation returned by the
     *         service.
     */
    CheckDNSAvailabilityResult checkDNSAvailability(
            CheckDNSAvailabilityRequest checkDNSAvailabilityRequest);

    /**
     * <p>
     * Creates an application that has one configuration template named
     * <code>default</code> and no application versions.
     * </p>
     * 
     * @param createApplicationRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the CreateApplication operation returned by the
     *         service.
     * @throws TooManyApplicationsException
     *         The caller has exceeded the limit on the number of applications
     *         associated with their account.
     */
    CreateApplicationResult createApplication(
            CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application version for the specified application.
     * </p>
     * <note>Once you create an application version with a specified Amazon S3
     * bucket and key location, you cannot change that Amazon S3 location. If
     * you change the Amazon S3 location, you receive an exception when you
     * attempt to launch an environment from the application version. </note>
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the
     *         service.
     * @throws TooManyApplicationsException
     *         The caller has exceeded the limit on the number of applications
     *         associated with their account.
     * @throws TooManyApplicationVersionsException
     *         The caller has exceeded the limit on the number of application
     *         versions associated with their account.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which
     *         the service is running.
     */
    CreateApplicationVersionResult createApplicationVersion(
            CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a
     * specific application and are used to deploy different versions of the
     * application with the same configuration settings.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>DescribeConfigurationOptions</a></li>
     * <li><a>DescribeConfigurationSettings</a></li>
     * <li><a>ListAvailableSolutionStacks</a></li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the CreateConfigurationTemplate operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     * @throws TooManyConfigurationTemplatesException
     *         The caller has exceeded the limit on the number of configuration
     *         templates associated with their account.
     */
    CreateConfigurationTemplateResult createConfigurationTemplate(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest);

    /**
     * <p>
     * Launches an environment for the specified application using the specified
     * configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the
     *         service.
     * @throws TooManyEnvironmentsException
     *         The caller has exceeded the limit of allowed environments
     *         associated with the account.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    CreateEnvironmentResult createEnvironment(
            CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     * 
     * @param createStorageLocationRequest
     *        null
     * @return Result of the CreateStorageLocation operation returned by the
     *         service.
     * @throws TooManyBucketsException
     *         The web service attempted to create a bucket in an Amazon S3
     *         account that already has 100 buckets.
     * @throws S3SubscriptionRequiredException
     *         The caller does not have a subscription to Amazon S3.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    CreateStorageLocationResult createStorageLocation(
            CreateStorageLocationRequest createStorageLocationRequest);

    /**
     * Simplified method form for invoking the CreateStorageLocation operation.
     *
     * @see #createStorageLocation(CreateStorageLocationRequest)
     */
    CreateStorageLocationResult createStorageLocation();

    /**
     * <p>
     * Deletes the specified application along with all associated versions and
     * configurations. The application versions will not be deleted from your
     * Amazon S3 bucket.
     * </p>
     * <note>You cannot delete an application that has a running environment.
     * </note>
     * 
     * @param deleteApplicationRequest
     *        This documentation target is not reported in the API reference.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another
     *         operation is already in progress affecting an element in this
     *         activity.
     */
    void deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>You cannot delete an application version that is associated with a
     * running environment.</note>
     * 
     * @param deleteApplicationVersionRequest
     *        This documentation target is not reported in the API reference.
     * @throws SourceBundleDeletionException
     *         Unable to delete the Amazon S3 source bundle associated with the
     *         application version, although the application version deleted
     *         successfully.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another
     *         operation is already in progress affecting an element in this
     *         activity.
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which
     *         the service is running.
     */
    void deleteApplicationVersion(
            DeleteApplicationVersionRequest deleteApplicationVersionRequest);

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>When you launch an environment using a configuration template, the
     * environment gets a copy of the template. You can delete or modify the
     * environment's copy of the template without affecting the running
     * environment.</note>
     * 
     * @param deleteConfigurationTemplateRequest
     *        This documentation target is not reported in the API reference.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another
     *         operation is already in progress affecting an element in this
     *         activity.
     */
    void deleteConfigurationTemplate(
            DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a
     * draft configuration set. You can get the draft configuration using
     * <a>DescribeConfigurationSettings</a> while the update is in progress or
     * if the update fails. The <code>DeploymentStatus</code> for the draft
     * configuration indicates whether the deployment is in process or has
     * failed. The draft configuration remains in existence until it is deleted
     * with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest
     *        This documentation target is not reported in the API reference.
     */
    void deleteEnvironmentConfiguration(
            DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest);

    /**
     * <p>
     * Returns descriptions for existing application versions.
     * </p>
     * 
     * @param describeApplicationVersionsRequest
     *        Result message containing a list of configuration descriptions.
     * @return Result of the DescribeApplicationVersions operation returned by
     *         the service.
     */
    DescribeApplicationVersionsResult describeApplicationVersions(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest);

    /**
     * Simplified method form for invoking the DescribeApplicationVersions
     * operation.
     *
     * @see #describeApplicationVersions(DescribeApplicationVersionsRequest)
     */
    DescribeApplicationVersionsResult describeApplicationVersions();

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeApplications operation returned by the
     *         service.
     */
    DescribeApplicationsResult describeApplications(
            DescribeApplicationsRequest describeApplicationsRequest);

    /**
     * Simplified method form for invoking the DescribeApplications operation.
     *
     * @see #describeApplications(DescribeApplicationsRequest)
     */
    DescribeApplicationsResult describeApplications();

    /**
     * <p>
     * Describes the configuration options that are used in a particular
     * configuration template or environment, or that a specified solution stack
     * defines. The description includes the values the options, their default
     * values, and an indication of the required action on a running environment
     * if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest
     *        Result message containig a list of application version
     *        descriptions.
     * @return Result of the DescribeConfigurationOptions operation returned by
     *         the service.
     */
    DescribeConfigurationOptionsResult describeConfigurationOptions(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest);

    /**
     * <p>
     * Returns a description of the settings for the specified configuration
     * set, that is, either a configuration template or the configuration set
     * associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a
     * running environment, it is possible to receive two sets of setting
     * descriptions. One is the deployed configuration set, and the other is a
     * draft configuration of an environment that is either in the process of
     * deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>DeleteEnvironmentConfiguration</a></li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest
     *        Result message containing all of the configuration settings for a
     *        specified solution stack or configuration template.
     * @return Result of the DescribeConfigurationSettings operation returned by
     *         the service.
     */
    DescribeConfigurationSettingsResult describeConfigurationSettings(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest);

    /**
     * <p>
     * Returns information about the overall health of the specified
     * environment. The <b>DescribeEnvironmentHealth</b> operation is only
     * available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest
     *        See the example below to learn how to create a request body.
     * @return Result of the DescribeEnvironmentHealth operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is invalid, please check parameters and their values
     * @throws ElasticBeanstalkServiceException
     *         null
     */
    DescribeEnvironmentHealthResult describeEnvironmentHealth(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest);

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeEnvironmentResources operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    DescribeEnvironmentResourcesResult describeEnvironmentResources(
            DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest);

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeEnvironments operation returned by the
     *         service.
     */
    DescribeEnvironmentsResult describeEnvironments(
            DescribeEnvironmentsRequest describeEnvironmentsRequest);

    /**
     * Simplified method form for invoking the DescribeEnvironments operation.
     *
     * @see #describeEnvironments(DescribeEnvironmentsRequest)
     */
    DescribeEnvironmentsResult describeEnvironments();

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <note> This action returns the most recent 1,000 events from the
     * specified <code>NextToken</code>. </note>
     * 
     * @param describeEventsRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the DescribeEvents operation returned by the service.
     */
    DescribeEventsResult describeEvents(
            DescribeEventsRequest describeEventsRequest);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEvents(DescribeEventsRequest)
     */
    DescribeEventsResult describeEvents();

    /**
     * <p>
     * Returns more detailed information about the health of the specified
     * instances (for example, CPU utilization, load average, and causes). The
     * <b>DescribeInstancesHealth</b> operation is only available with AWS
     * Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeInstancesHealthRequest
     *        See the example below to learn how to create a request body.
     * @return Result of the DescribeInstancesHealth operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is invalid, please check parameters and their values
     * @throws ElasticBeanstalkServiceException
     *         null
     */
    DescribeInstancesHealthResult describeInstancesHealth(
            DescribeInstancesHealthRequest describeInstancesHealthRequest);

    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     *        null
     * @return Result of the ListAvailableSolutionStacks operation returned by
     *         the service.
     */
    ListAvailableSolutionStacksResult listAvailableSolutionStacks(
            ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest);

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks
     * operation.
     *
     * @see #listAvailableSolutionStacks(ListAvailableSolutionStacksRequest)
     */
    ListAvailableSolutionStacksResult listAvailableSolutionStacks();

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    void rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest);

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the
     * deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last
     * lines from the application server log files of every Amazon EC2 instance
     * in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the
     * application server log files for every Amazon EC2 instance into a
     * <code>.zip</code> file. Legacy and .NET containers do not support bundle
     * logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>RetrieveEnvironmentInfo</a></li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest
     *        This documentation target is not reported in the API reference.
     */
    void requestEnvironmentInfo(
            RequestEnvironmentInfoRequest requestEnvironmentInfoRequest);

    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest
     */
    void restartAppServer(RestartAppServerRequest restartAppServerRequest);

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a>
     * request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>RequestEnvironmentInfo</a></li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the RetrieveEnvironmentInfo operation returned by the
     *         service.
     */
    RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(
            RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest);

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest
     *        Swaps the CNAMEs of two environments.
     */
    void swapEnvironmentCNAMEs(
            SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest);

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation.
     *
     * @see #swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest)
     */
    void swapEnvironmentCNAMEs();

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the TerminateEnvironment operation returned by the
     *         service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    TerminateEnvironmentResult terminateEnvironment(
            TerminateEnvironmentRequest terminateEnvironmentRequest);

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note> If a property (for example, <code>description</code>) is not
     * provided, the value remains unchanged. To clear these properties, specify
     * an empty string. </note>
     * 
     * @param updateApplicationRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the UpdateApplication operation returned by the
     *         service.
     */
    UpdateApplicationResult updateApplication(
            UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the specified application version to have the specified
     * properties.
     * </p>
     * <note> If a property (for example, <code>description</code>) is not
     * provided, the value remains unchanged. To clear properties, specify an
     * empty string. </note>
     * 
     * @param updateApplicationVersionRequest
     * @return Result of the UpdateApplicationVersion operation returned by the
     *         service.
     */
    UpdateApplicationVersionResult updateApplicationVersion(
            UpdateApplicationVersionRequest updateApplicationVersionRequest);

    /**
     * <p>
     * Updates the specified configuration template to have the specified
     * properties or configuration option values.
     * </p>
     * <note> If a property (for example, <code>ApplicationName</code>) is not
     * provided, its value remains unchanged. To clear such properties, specify
     * an empty string. </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li><a>DescribeConfigurationOptions</a></li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest
     *        The result message containing the options for the specified
     *        solution stack.
     * @return Result of the UpdateConfigurationTemplate operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    UpdateConfigurationTemplateResult updateConfigurationTemplate(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest);

    /**
     * <p>
     * Updates the environment description, deploys a new application version,
     * updates the configuration settings to an entirely new configuration
     * template, or updates select configuration option values in the running
     * environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed
     * and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual
     * settings, a draft configuration is created and
     * <a>DescribeConfigurationSettings</a> for this environment returns two
     * setting descriptions with different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest
     *        This documentation target is not reported in the API reference.
     * @return Result of the UpdateEnvironment operation returned by the
     *         service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    UpdateEnvironmentResult updateEnvironment(
            UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template
     * or environment, and determines whether those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings
     * associated with the selection of option values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest
     *        A list of validation messages for a specified configuration
     *        template.
     * @return Result of the ValidateConfigurationSettings operation returned by
     *         the service.
     * @throws InsufficientPrivilegesException
     *         Unable to perform the specified operation because the user does
     *         not have enough privileges for one of more downstream aws
     *         services
     */
    ValidateConfigurationSettingsResult validateConfigurationSettings(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
