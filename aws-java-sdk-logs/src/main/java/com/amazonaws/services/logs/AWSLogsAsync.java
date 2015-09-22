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
package com.amazonaws.services.logs;

import com.amazonaws.services.logs.model.*;

/**
 * Interface for accessing Amazon CloudWatch Logs asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudWatch Logs API Reference</fullname>
 * <p>
 * This is the <i>Amazon CloudWatch Logs API Reference</i>. Amazon CloudWatch
 * Logs enables you to monitor, store, and access your system, application, and
 * custom log files. This guide provides detailed information about Amazon
 * CloudWatch Logs actions, data types, parameters, and errors. For detailed
 * information about Amazon CloudWatch Logs features and their associated API
 * calls, go to the <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide"
 * >Amazon CloudWatch Developer Guide</a>.
 * </p>
 * <p>
 * Use the following links to get started using the <i>Amazon CloudWatch Logs
 * API Reference</i>:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Operations.html"
 * >Actions</a>: An alphabetical list of all Amazon CloudWatch Logs actions.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_Types.html"
 * >Data Types</a>: An alphabetical list of all Amazon CloudWatch Logs data
 * types.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonParameters.html"
 * >Common Parameters</a>: Parameters that all Query actions can use.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>: Client and server errors that all actions can return.</li>
 * <li><a
 * href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"
 * >Regions and Endpoints</a>: Itemized regions and endpoints for all AWS
 * products.</li>
 * </ul>
 * <p>
 * In addition to using the Amazon CloudWatch Logs API, you can also use the
 * following SDKs and third-party libraries to access Amazon CloudWatch Logs
 * programmatically.
 * </p>
 * <ul>
 * <li><a href="http://aws.amazon.com/documentation/sdkforjava/">AWS SDK for
 * Java Documentation</a></li>
 * <li><a href="http://aws.amazon.com/documentation/sdkfornet/">AWS SDK for .NET
 * Documentation</a></li>
 * <li><a href="http://aws.amazon.com/documentation/sdkforphp/">AWS SDK for PHP
 * Documentation</a></li>
 * <li><a href="http://aws.amazon.com/documentation/sdkforruby/">AWS SDK for
 * Ruby Documentation</a></li>
 * </ul>
 * <p>
 * Developers in the AWS developer community also provide their own libraries,
 * which you can find at the following AWS developer centers:
 * </p>
 * <ul>
 * <li><a href="http://aws.amazon.com/java/">AWS Java Developer Center</a></li>
 * <li><a href="http://aws.amazon.com/php/">AWS PHP Developer Center</a></li>
 * <li><a href="http://aws.amazon.com/python/">AWS Python Developer Center</a></li>
 * <li><a href="http://aws.amazon.com/ruby/">AWS Ruby Developer Center</a></li>
 * <li><a href="http://aws.amazon.com/net/">AWS Windows and .NET Developer
 * Center</a></li>
 * </ul>
 */
public interface AWSLogsAsync extends AWSLogs {

    /**
     * <p>
     * Cancels an export task if it is in <code>PENDING</code> or
     * <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     *        null
     */
    java.util.concurrent.Future<Void> cancelExportTaskAsync(
            CancelExportTaskRequest cancelExportTaskRequest);

    /**
     * <p>
     * Cancels an export task if it is in <code>PENDING</code> or
     * <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> cancelExportTaskAsync(
            CancelExportTaskRequest cancelExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates an <code>ExportTask</code> which allows you to efficiently export
     * data from a Log Group to your Amazon S3 bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is
     * provided, this API will initiate an export task and respond with the task
     * Id. Once started, <code>DescribeExportTasks</code> can be used to get the
     * status of an export task.
     * </p>
     * 
     * @param createExportTaskRequest
     *        null
     * @return A Java Future containing the result of the CreateExportTask
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(
            CreateExportTaskRequest createExportTaskRequest);

    /**
     * <p>
     * Creates an <code>ExportTask</code> which allows you to efficiently export
     * data from a Log Group to your Amazon S3 bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is
     * provided, this API will initiate an export task and respond with the task
     * Id. Once started, <code>DescribeExportTasks</code> can be used to get the
     * status of an export task.
     * </p>
     * 
     * @param createExportTaskRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExportTask
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(
            CreateExportTaskRequest createExportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExportTaskRequest, CreateExportTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log
     * group must be unique within a region for an AWS account. You can create
     * up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * <ul>
     * <li>Log group names can be between 1 and 512 characters long.</li>
     * <li>Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen),
     * '/' (forward slash), and '.' (period).</li>
     * </ul>
     * </p>
     * 
     * @param createLogGroupRequest
     *        null
     */
    java.util.concurrent.Future<Void> createLogGroupAsync(
            CreateLogGroupRequest createLogGroupRequest);

    /**
     * <p>
     * Creates a new log group with the specified name. The name of the log
     * group must be unique within a region for an AWS account. You can create
     * up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * <ul>
     * <li>Log group names can be between 1 and 512 characters long.</li>
     * <li>Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen),
     * '/' (forward slash), and '.' (period).</li>
     * </ul>
     * </p>
     * 
     * @param createLogGroupRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> createLogGroupAsync(
            CreateLogGroupRequest createLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLogGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the log
     * stream must be unique within the log group. There is no limit on the
     * number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * <ul>
     * <li>Log stream names can be between 1 and 512 characters long.</li>
     * <li>The ':' colon character is not allowed.</li>
     * </ul>
     * </p>
     * 
     * @param createLogStreamRequest
     *        null
     */
    java.util.concurrent.Future<Void> createLogStreamAsync(
            CreateLogStreamRequest createLogStreamRequest);

    /**
     * <p>
     * Creates a new log stream in the specified log group. The name of the log
     * stream must be unique within the log group. There is no limit on the
     * number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * <ul>
     * <li>Log stream names can be between 1 and 512 characters long.</li>
     * <li>The ':' colon character is not allowed.</li>
     * </ul>
     * </p>
     * 
     * @param createLogStreamRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> createLogStreamAsync(
            CreateLogStreamRequest createLogStreamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLogStreamRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the destination with the specified name and eventually disables
     * all the subscription filters that publish to it. This will not delete the
     * physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteDestinationAsync(
            DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Deletes the destination with the specified name and eventually disables
     * all the subscription filters that publish to it. This will not delete the
     * physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteDestinationAsync(
            DeleteDestinationRequest deleteDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes all
     * the archived log events associated with it.
     * </p>
     * 
     * @param deleteLogGroupRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteLogGroupAsync(
            DeleteLogGroupRequest deleteLogGroupRequest);

    /**
     * <p>
     * Deletes the log group with the specified name and permanently deletes all
     * the archived log events associated with it.
     * </p>
     * 
     * @param deleteLogGroupRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteLogGroupAsync(
            DeleteLogGroupRequest deleteLogGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLogGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log events
     * associated with it.
     * </p>
     * 
     * @param deleteLogStreamRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteLogStreamAsync(
            DeleteLogStreamRequest deleteLogStreamRequest);

    /**
     * <p>
     * Deletes a log stream and permanently deletes all the archived log events
     * associated with it.
     * </p>
     * 
     * @param deleteLogStreamRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteLogStreamAsync(
            DeleteLogStreamRequest deleteLogStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLogStreamRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteMetricFilterAsync(
            DeleteMetricFilterRequest deleteMetricFilterRequest);

    /**
     * <p>
     * Deletes a metric filter associated with the specified log group.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteMetricFilterAsync(
            DeleteMetricFilterRequest deleteMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricFilterRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events would
     * not expire if they belong to log groups without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteRetentionPolicyAsync(
            DeleteRetentionPolicyRequest deleteRetentionPolicyRequest);

    /**
     * <p>
     * Deletes the retention policy of the specified log group. Log events would
     * not expire if they belong to log groups without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteRetentionPolicyAsync(
            DeleteRetentionPolicyRequest deleteRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a subscription filter associated with the specified log group.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     *        null
     */
    java.util.concurrent.Future<Void> deleteSubscriptionFilterAsync(
            DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest);

    /**
     * <p>
     * Deletes a subscription filter associated with the specified log group.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> deleteSubscriptionFilterAsync(
            DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionFilterRequest, Void> asyncHandler);

    /**
     * <p>
     * Returns all the destinations that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted by
     * destination name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 destinations. If there are
     * more destinations to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of destinations returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeDestinationsRequest
     *        null
     * @return A Java Future containing the result of the DescribeDestinations
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            DescribeDestinationsRequest describeDestinationsRequest);

    /**
     * <p>
     * Returns all the destinations that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted by
     * destination name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 destinations. If there are
     * more destinations to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of destinations returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeDestinationsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDestinations
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            DescribeDestinationsRequest describeDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDestinations operation.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest)
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync();

    /**
     * Simplified method form for invoking the DescribeDestinations operation
     * with an AsyncHandler.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler);

    /**
     * <p>
     * Returns all the export tasks that are associated with the AWS account
     * making the request. The export tasks can be filtered based on
     * <code>TaskId</code> or <code>TaskStatus</code>.
     * </p>
     * <p>
     * By default, this operation returns up to 50 export tasks that satisfy the
     * specified filters. If there are more export tasks to list, the response
     * would contain a <code class="code">nextToken</code> value in the response
     * body. You can also limit the number of export tasks returned in the
     * response by specifying the <code class="code">limit</code> parameter in
     * the request.
     * </p>
     * 
     * @param describeExportTasksRequest
     *        null
     * @return A Java Future containing the result of the DescribeExportTasks
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            DescribeExportTasksRequest describeExportTasksRequest);

    /**
     * <p>
     * Returns all the export tasks that are associated with the AWS account
     * making the request. The export tasks can be filtered based on
     * <code>TaskId</code> or <code>TaskStatus</code>.
     * </p>
     * <p>
     * By default, this operation returns up to 50 export tasks that satisfy the
     * specified filters. If there are more export tasks to list, the response
     * would contain a <code class="code">nextToken</code> value in the response
     * body. You can also limit the number of export tasks returned in the
     * response by specifying the <code class="code">limit</code> parameter in
     * the request.
     * </p>
     * 
     * @param describeExportTasksRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExportTasks
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            DescribeExportTasksRequest describeExportTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler);

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted by
     * log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are more
     * log groups to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of log groups returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeLogGroupsRequest
     *        null
     * @return A Java Future containing the result of the DescribeLogGroups
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            DescribeLogGroupsRequest describeLogGroupsRequest);

    /**
     * <p>
     * Returns all the log groups that are associated with the AWS account
     * making the request. The list returned in the response is ASCII-sorted by
     * log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are more
     * log groups to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of log groups returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeLogGroupsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLogGroups
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            DescribeLogGroupsRequest describeLogGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLogGroups operation.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest)
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeLogGroups operation with
     * an AsyncHandler.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns all the log streams that are associated with the specified log
     * group. The list returned in the response is ASCII-sorted by log stream
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are
     * more log streams to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of log streams returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * This operation has a limit of five transactions per second, after which
     * transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     *        null
     * @return A Java Future containing the result of the DescribeLogStreams
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(
            DescribeLogStreamsRequest describeLogStreamsRequest);

    /**
     * <p>
     * Returns all the log streams that are associated with the specified log
     * group. The list returned in the response is ASCII-sorted by log stream
     * name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are
     * more log streams to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of log streams returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * This operation has a limit of five transactions per second, after which
     * transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLogStreams
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(
            DescribeLogStreamsRequest describeLogStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLogStreamsRequest, DescribeLogStreamsResult> asyncHandler);

    /**
     * <p>
     * Returns all the metrics filters associated with the specified log group.
     * The list returned in the response is ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there are
     * more metric filters to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of metric filters returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     *        null
     * @return A Java Future containing the result of the DescribeMetricFilters
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(
            DescribeMetricFiltersRequest describeMetricFiltersRequest);

    /**
     * <p>
     * Returns all the metrics filters associated with the specified log group.
     * The list returned in the response is ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there are
     * more metric filters to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of metric filters returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMetricFilters
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(
            DescribeMetricFiltersRequest describeMetricFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler);

    /**
     * <p>
     * Returns all the subscription filters associated with the specified log
     * group. The list returned in the response is ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 subscription filters. If
     * there are more subscription filters to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of subscription filters returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     *        null
     * @return A Java Future containing the result of the
     *         DescribeSubscriptionFilters operation returned by the service.
     */
    java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest);

    /**
     * <p>
     * Returns all the subscription filters associated with the specified log
     * group. The list returned in the response is ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 subscription filters. If
     * there are more subscription filters to list, the response would contain a
     * <code class="code">nextToken</code> value in the response body. You can
     * also limit the number of subscription filters returned in the response by
     * specifying the <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeSubscriptionFilters operation returned by the service.
     */
    java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResult> asyncHandler);

    /**
     * <p>
     * Retrieves log events, optionally filtered by a filter pattern from the
     * specified log group. You can provide an optional time range to filter the
     * results on the event <code class="code">timestamp</code>. You can limit
     * the streams searched to an explicit list of
     * <code class="code">logStreamNames</code>.
     * </p>
     * <p>
     * By default, this operation returns as much matching log events as can fit
     * in a response size of 1MB, up to 10,000 log events, or all the events
     * found within a time-bounded scan window. If the response includes a
     * <code class="code">nextToken</code>, then there is more data to search,
     * and the search can be resumed with a new request providing the nextToken.
     * The response will contain a list of
     * <code class="code">searchedLogStreams</code> that contains information
     * about which streams were searched in the request and whether they have
     * been searched completely or require further pagination. The
     * <code class="code">limit</code> parameter in the request. can be used to
     * specify the maximum number of events to return in a page.
     * </p>
     * 
     * @param filterLogEventsRequest
     *        null
     * @return A Java Future containing the result of the FilterLogEvents
     *         operation returned by the service.
     */
    java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(
            FilterLogEventsRequest filterLogEventsRequest);

    /**
     * <p>
     * Retrieves log events, optionally filtered by a filter pattern from the
     * specified log group. You can provide an optional time range to filter the
     * results on the event <code class="code">timestamp</code>. You can limit
     * the streams searched to an explicit list of
     * <code class="code">logStreamNames</code>.
     * </p>
     * <p>
     * By default, this operation returns as much matching log events as can fit
     * in a response size of 1MB, up to 10,000 log events, or all the events
     * found within a time-bounded scan window. If the response includes a
     * <code class="code">nextToken</code>, then there is more data to search,
     * and the search can be resumed with a new request providing the nextToken.
     * The response will contain a list of
     * <code class="code">searchedLogStreams</code> that contains information
     * about which streams were searched in the request and whether they have
     * been searched completely or require further pagination. The
     * <code class="code">limit</code> parameter in the request. can be used to
     * specify the maximum number of events to return in a page.
     * </p>
     * 
     * @param filterLogEventsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FilterLogEvents
     *         operation returned by the service.
     */
    java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(
            FilterLogEventsRequest filterLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<FilterLogEventsRequest, FilterLogEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide an
     * optional time range to filter the results on the event
     * <code class="code">timestamp</code>.
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a
     * response size of 1MB, up to 10,000 log events. The response will always
     * include a <code class="code">nextForwardToken</code> and a
     * <code class="code">nextBackwardToken</code> in the response body. You can
     * use any of these tokens in subsequent
     * <code class="code">GetLogEvents</code> requests to paginate through
     * events in either forward or backward direction. You can also limit the
     * number of log events returned in the response by specifying the
     * <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param getLogEventsRequest
     *        null
     * @return A Java Future containing the result of the GetLogEvents operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(
            GetLogEventsRequest getLogEventsRequest);

    /**
     * <p>
     * Retrieves log events from the specified log stream. You can provide an
     * optional time range to filter the results on the event
     * <code class="code">timestamp</code>.
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a
     * response size of 1MB, up to 10,000 log events. The response will always
     * include a <code class="code">nextForwardToken</code> and a
     * <code class="code">nextBackwardToken</code> in the response body. You can
     * use any of these tokens in subsequent
     * <code class="code">GetLogEvents</code> requests to paginate through
     * events in either forward or backward direction. You can also limit the
     * number of log events returned in the response by specifying the
     * <code class="code">limit</code> parameter in the request.
     * </p>
     * 
     * @param getLogEventsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLogEvents operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(
            GetLogEventsRequest getLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a <code>Destination</code>. A destination encapsulates
     * a physical resource (such as a Kinesis stream) and allows you to
     * subscribe to a real-time stream of log events of a different account,
     * ingested through <code class="code">PutLogEvents</code> requests.
     * Currently, the only supported physical resource is a Amazon Kinesis
     * stream belonging to the same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream
     * through an access policy. By default, PutDestination does not set any
     * access policy with the destination, which means a cross-account user will
     * not be able to call <code>PutSubscriptionFilter</code> against this
     * destination. To enable that, the destination owner must call
     * <code>PutDestinationPolicy</code> after PutDestination.
     * </p>
     * 
     * @param putDestinationRequest
     *        null
     * @return A Java Future containing the result of the PutDestination
     *         operation returned by the service.
     */
    java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(
            PutDestinationRequest putDestinationRequest);

    /**
     * <p>
     * Creates or updates a <code>Destination</code>. A destination encapsulates
     * a physical resource (such as a Kinesis stream) and allows you to
     * subscribe to a real-time stream of log events of a different account,
     * ingested through <code class="code">PutLogEvents</code> requests.
     * Currently, the only supported physical resource is a Amazon Kinesis
     * stream belonging to the same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream
     * through an access policy. By default, PutDestination does not set any
     * access policy with the destination, which means a cross-account user will
     * not be able to call <code>PutSubscriptionFilter</code> against this
     * destination. To enable that, the destination owner must call
     * <code>PutDestinationPolicy</code> after PutDestination.
     * </p>
     * 
     * @param putDestinationRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDestination
     *         operation returned by the service.
     */
    java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(
            PutDestinationRequest putDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<PutDestinationRequest, PutDestinationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing
     * <code>Destination</code>. An access policy is an <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html"
     * >IAM policy document</a> that is used to authorize claims to register a
     * subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     *        null
     */
    java.util.concurrent.Future<Void> putDestinationPolicyAsync(
            PutDestinationPolicyRequest putDestinationPolicyRequest);

    /**
     * <p>
     * Creates or updates an access policy associated with an existing
     * <code>Destination</code>. An access policy is an <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html"
     * >IAM policy document</a> that is used to authorize claims to register a
     * subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> putDestinationPolicyAsync(
            PutDestinationPolicyRequest putDestinationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutDestinationPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the
     * <code class="code">sequenceToken</code> obtained from the response of the
     * previous request. An upload in a newly created log stream does not
     * require a <code class="code">sequenceToken</code>.
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * <ul>
     * <li>The maximum batch size is 1,048,576 bytes, and this size is
     * calculated as the sum of all event messages in UTF-8, plus 26 bytes for
     * each log event.</li>
     * <li>None of the log events in the batch can be more than 2 hours in the
     * future.</li>
     * <li>None of the log events in the batch can be older than 14 days or the
     * retention period of the log group.</li>
     * <li>The log events in the batch must be in chronological ordered by their
     * <code class="code">timestamp</code>.</li>
     * <li>The maximum number of log events in a batch is 10,000.</li>
     * </ul>
     * </p>
     * 
     * @param putLogEventsRequest
     *        null
     * @return A Java Future containing the result of the PutLogEvents operation
     *         returned by the service.
     */
    java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(
            PutLogEventsRequest putLogEventsRequest);

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <p>
     * Every PutLogEvents request must include the
     * <code class="code">sequenceToken</code> obtained from the response of the
     * previous request. An upload in a newly created log stream does not
     * require a <code class="code">sequenceToken</code>.
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * <ul>
     * <li>The maximum batch size is 1,048,576 bytes, and this size is
     * calculated as the sum of all event messages in UTF-8, plus 26 bytes for
     * each log event.</li>
     * <li>None of the log events in the batch can be more than 2 hours in the
     * future.</li>
     * <li>None of the log events in the batch can be older than 14 days or the
     * retention period of the log group.</li>
     * <li>The log events in the batch must be in chronological ordered by their
     * <code class="code">timestamp</code>.</li>
     * <li>The maximum number of log events in a batch is 10,000.</li>
     * </ul>
     * </p>
     * 
     * @param putLogEventsRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLogEvents operation
     *         returned by the service.
     */
    java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(
            PutLogEventsRequest putLogEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutLogEventsRequest, PutLogEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified
     * log group. Metric filters allow you to configure rules to extract metric
     * data from log events ingested through
     * <code class="code">PutLogEvents</code> requests.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log
     * group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     *        null
     */
    java.util.concurrent.Future<Void> putMetricFilterAsync(
            PutMetricFilterRequest putMetricFilterRequest);

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified
     * log group. Metric filters allow you to configure rules to extract metric
     * data from log events ingested through
     * <code class="code">PutLogEvents</code> requests.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log
     * group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> putMetricFilterAsync(
            PutMetricFilterRequest putMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetricFilterRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows
     * you to configure the number of days you want to retain log events in the
     * specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     *        null
     */
    java.util.concurrent.Future<Void> putRetentionPolicyAsync(
            PutRetentionPolicyRequest putRetentionPolicyRequest);

    /**
     * <p>
     * Sets the retention of the specified log group. A retention policy allows
     * you to configure the number of days you want to retain log events in the
     * specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> putRetentionPolicyAsync(
            PutRetentionPolicyRequest putRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the
     * specified log group. Subscription filters allow you to subscribe to a
     * real-time stream of log events ingested through
     * <code class="code">PutLogEvents</code> requests and have them delivered
     * to a specific destination. Currently, the supported destinations are:
     * <ul>
     * <li>A Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.</li>
     * <li>A logical destination (used via an ARN of <code>Destination</code>)
     * belonging to a different account, for cross-account delivery.</li>
     * </ul>
     * </p>
     * <p>
     * Currently there can only be one subscription filter associated with a log
     * group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     *        null
     */
    java.util.concurrent.Future<Void> putSubscriptionFilterAsync(
            PutSubscriptionFilterRequest putSubscriptionFilterRequest);

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the
     * specified log group. Subscription filters allow you to subscribe to a
     * real-time stream of log events ingested through
     * <code class="code">PutLogEvents</code> requests and have them delivered
     * to a specific destination. Currently, the supported destinations are:
     * <ul>
     * <li>A Amazon Kinesis stream belonging to the same account as the
     * subscription filter, for same-account delivery.</li>
     * <li>A logical destination (used via an ARN of <code>Destination</code>)
     * belonging to a different account, for cross-account delivery.</li>
     * </ul>
     * </p>
     * <p>
     * Currently there can only be one subscription filter associated with a log
     * group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> putSubscriptionFilterAsync(
            PutSubscriptionFilterRequest putSubscriptionFilterRequest,
            com.amazonaws.handlers.AsyncHandler<PutSubscriptionFilterRequest, Void> asyncHandler);

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event
     * messages. You can use this operation to validate the correctness of a
     * metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     *        null
     * @return A Java Future containing the result of the TestMetricFilter
     *         operation returned by the service.
     */
    java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(
            TestMetricFilterRequest testMetricFilterRequest);

    /**
     * <p>
     * Tests the filter pattern of a metric filter against a sample of log event
     * messages. You can use this operation to validate the correctness of a
     * metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     *        null
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestMetricFilter
     *         operation returned by the service.
     */
    java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(
            TestMetricFilterRequest testMetricFilterRequest,
            com.amazonaws.handlers.AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler);

}
