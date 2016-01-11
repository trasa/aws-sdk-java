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
package com.amazonaws.services.cloudhsm;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.services.cloudhsm.model.transform.*;

/**
 * Client for accessing CloudHSM. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CloudHSM Service</fullname>
 */
public class AWSCloudHSMClient extends AmazonWebServiceClient implements
        AWSCloudHSM {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudHSM.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudhsm";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "cloudhsm";

    /**
     * List of exception unmarshallers for all CloudHSM exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on CloudHSM. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudHSMClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudHSM (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudHSMClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSCloudHSMClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudHSM (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudHSMClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSCloudHSMClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudHSM (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudHSMClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CloudHSM (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCloudHSMClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudhsm.model.CloudHsmServiceException.class,
                        "CloudHsmServiceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudhsm.model.CloudHsmInternalException.class,
                        "CloudHsmInternalException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudhsm.model.InvalidRequestException.class,
                        "InvalidRequestException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://cloudhsm.us-east-1.amazonaws.com/");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/cloudhsm/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/cloudhsm/request.handler2s"));
    }

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability
     * partition group is a group of partitions that spans multiple physical
     * HSMs.
     * </p>
     * 
     * @param createHapgRequest
     *        Contains the inputs for the <a>CreateHapgRequest</a> action.
     * @return Result of the CreateHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.CreateHapg
     */
    @Override
    public CreateHapgResult createHapg(CreateHapgRequest createHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(createHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHapgRequest> request = null;
        Response<CreateHapgResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHapgRequestMarshaller().marshall(super
                        .beforeMarshalling(createHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateHapgResult> responseHandler = new JsonResponseHandler<CreateHapgResult>(
                    new CreateHapgResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an uninitialized HSM instance. Running this command provisions an
     * HSM appliance and will result in charges to your AWS account for the HSM.
     * </p>
     * 
     * @param createHsmRequest
     *        Contains the inputs for the <a>CreateHsm</a> action.
     * @return Result of the CreateHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.CreateHsm
     */
    @Override
    public CreateHsmResult createHsm(CreateHsmRequest createHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(createHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmRequest> request = null;
        Response<CreateHsmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmRequestMarshaller().marshall(super
                        .beforeMarshalling(createHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateHsmResult> responseHandler = new JsonResponseHandler<CreateHsmResult>(
                    new CreateHsmResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     * 
     * @param createLunaClientRequest
     *        Contains the inputs for the <a>CreateLunaClient</a> action.
     * @return Result of the CreateLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.CreateLunaClient
     */
    @Override
    public CreateLunaClientResult createLunaClient(
            CreateLunaClientRequest createLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(createLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLunaClientRequest> request = null;
        Response<CreateLunaClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLunaClientRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateLunaClientResult> responseHandler = new JsonResponseHandler<CreateLunaClientResult>(
                    new CreateLunaClientResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     * 
     * @param deleteHapgRequest
     *        Contains the inputs for the <a>DeleteHapg</a> action.
     * @return Result of the DeleteHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.DeleteHapg
     */
    @Override
    public DeleteHapgResult deleteHapg(DeleteHapgRequest deleteHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHapgRequest> request = null;
        Response<DeleteHapgResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHapgRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteHapgResult> responseHandler = new JsonResponseHandler<DeleteHapgResult>(
                    new DeleteHapgResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an HSM. Once complete, this operation cannot be undone and your
     * key material cannot be recovered.
     * </p>
     * 
     * @param deleteHsmRequest
     *        Contains the inputs for the <a>DeleteHsm</a> action.
     * @return Result of the DeleteHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.DeleteHsm
     */
    @Override
    public DeleteHsmResult deleteHsm(DeleteHsmRequest deleteHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmRequest> request = null;
        Response<DeleteHsmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteHsmResult> responseHandler = new JsonResponseHandler<DeleteHsmResult>(
                    new DeleteHsmResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a client.
     * </p>
     * 
     * @param deleteLunaClientRequest
     * @return Result of the DeleteLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.DeleteLunaClient
     */
    @Override
    public DeleteLunaClientResult deleteLunaClient(
            DeleteLunaClientRequest deleteLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLunaClientRequest> request = null;
        Response<DeleteLunaClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLunaClientRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteLunaClientResult> responseHandler = new JsonResponseHandler<DeleteLunaClientResult>(
                    new DeleteLunaClientResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     * 
     * @param describeHapgRequest
     *        Contains the inputs for the <a>DescribeHapg</a> action.
     * @return Result of the DescribeHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.DescribeHapg
     */
    @Override
    public DescribeHapgResult describeHapg(
            DescribeHapgRequest describeHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(describeHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHapgRequest> request = null;
        Response<DescribeHapgResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHapgRequestMarshaller().marshall(super
                        .beforeMarshalling(describeHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeHapgResult> responseHandler = new JsonResponseHandler<DescribeHapgResult>(
                    new DescribeHapgResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its ARN
     * or its serial number.
     * </p>
     * 
     * @param describeHsmRequest
     *        Contains the inputs for the <a>DescribeHsm</a> action.
     * @return Result of the DescribeHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.DescribeHsm
     */
    @Override
    public DescribeHsmResult describeHsm(DescribeHsmRequest describeHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(describeHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmRequest> request = null;
        Response<DescribeHsmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHsmRequestMarshaller().marshall(super
                        .beforeMarshalling(describeHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeHsmResult> responseHandler = new JsonResponseHandler<DescribeHsmResult>(
                    new DescribeHsmResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeHsmResult describeHsm() {
        return describeHsm(new DescribeHsmRequest());
    }

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     * 
     * @param describeLunaClientRequest
     * @return Result of the DescribeLunaClient operation returned by the
     *         service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.DescribeLunaClient
     */
    @Override
    public DescribeLunaClientResult describeLunaClient(
            DescribeLunaClientRequest describeLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLunaClientRequest> request = null;
        Response<DescribeLunaClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLunaClientRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeLunaClientResult> responseHandler = new JsonResponseHandler<DescribeLunaClientResult>(
                    new DescribeLunaClientResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLunaClientResult describeLunaClient() {
        return describeLunaClient(new DescribeLunaClientRequest());
    }

    /**
     * <p>
     * Gets the configuration files necessary to connect to all high
     * availability partition groups the client is associated with.
     * </p>
     * 
     * @param getConfigRequest
     * @return Result of the GetConfig operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.GetConfig
     */
    @Override
    public GetConfigResult getConfig(GetConfigRequest getConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigRequest> request = null;
        Response<GetConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigRequestMarshaller().marshall(super
                        .beforeMarshalling(getConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetConfigResult> responseHandler = new JsonResponseHandler<GetConfigResult>(
                    new GetConfigResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param listAvailableZonesRequest
     *        Contains the inputs for the <a>ListAvailableZones</a> action.
     * @return Result of the ListAvailableZones operation returned by the
     *         service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.ListAvailableZones
     */
    @Override
    public ListAvailableZonesResult listAvailableZones(
            ListAvailableZonesRequest listAvailableZonesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAvailableZonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableZonesRequest> request = null;
        Response<ListAvailableZonesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableZonesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAvailableZonesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAvailableZonesResult> responseHandler = new JsonResponseHandler<ListAvailableZonesResult>(
                    new ListAvailableZonesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAvailableZonesResult listAvailableZones() {
        return listAvailableZones(new ListAvailableZonesRequest());
    }

    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * member. If more results are available, the <i>NextToken</i> member of the
     * response contains a token that you pass in the next call to
     * <a>ListHapgs</a> to retrieve the next set of items.
     * </p>
     * 
     * @param listHapgsRequest
     * @return Result of the ListHapgs operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.ListHapgs
     */
    @Override
    public ListHapgsResult listHapgs(ListHapgsRequest listHapgsRequest) {
        ExecutionContext executionContext = createExecutionContext(listHapgsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHapgsRequest> request = null;
        Response<ListHapgsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHapgsRequestMarshaller().marshall(super
                        .beforeMarshalling(listHapgsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListHapgsResult> responseHandler = new JsonResponseHandler<ListHapgsResult>(
                    new ListHapgsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListHapgsResult listHapgs() {
        return listHapgs(new ListHapgsRequest());
    }

    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the current
     * customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * member. If more results are available, the <i>NextToken</i> member of the
     * response contains a token that you pass in the next call to
     * <a>ListHsms</a> to retrieve the next set of items.
     * </p>
     * 
     * @param listHsmsRequest
     * @return Result of the ListHsms operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.ListHsms
     */
    @Override
    public ListHsmsResult listHsms(ListHsmsRequest listHsmsRequest) {
        ExecutionContext executionContext = createExecutionContext(listHsmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHsmsRequest> request = null;
        Response<ListHsmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHsmsRequestMarshaller().marshall(super
                        .beforeMarshalling(listHsmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListHsmsResult> responseHandler = new JsonResponseHandler<ListHsmsResult>(
                    new ListHsmsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListHsmsResult listHsms() {
        return listHsms(new ListHsmsRequest());
    }

    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * member. If more results are available, the <i>NextToken</i> member of the
     * response contains a token that you pass in the next call to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * </p>
     * 
     * @param listLunaClientsRequest
     * @return Result of the ListLunaClients operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.ListLunaClients
     */
    @Override
    public ListLunaClientsResult listLunaClients(
            ListLunaClientsRequest listLunaClientsRequest) {
        ExecutionContext executionContext = createExecutionContext(listLunaClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLunaClientsRequest> request = null;
        Response<ListLunaClientsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLunaClientsRequestMarshaller().marshall(super
                        .beforeMarshalling(listLunaClientsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListLunaClientsResult> responseHandler = new JsonResponseHandler<ListLunaClientsResult>(
                    new ListLunaClientsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListLunaClientsResult listLunaClients() {
        return listLunaClients(new ListLunaClientsRequest());
    }

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     * 
     * @param modifyHapgRequest
     * @return Result of the ModifyHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.ModifyHapg
     */
    @Override
    public ModifyHapgResult modifyHapg(ModifyHapgRequest modifyHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyHapgRequest> request = null;
        Response<ModifyHapgResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyHapgRequestMarshaller().marshall(super
                        .beforeMarshalling(modifyHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ModifyHapgResult> responseHandler = new JsonResponseHandler<ModifyHapgResult>(
                    new ModifyHapgResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     * 
     * @param modifyHsmRequest
     *        Contains the inputs for the <a>ModifyHsm</a> action.
     * @return Result of the ModifyHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not
     *         valid.
     * @sample AWSCloudHSM.ModifyHsm
     */
    @Override
    public ModifyHsmResult modifyHsm(ModifyHsmRequest modifyHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyHsmRequest> request = null;
        Response<ModifyHsmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyHsmRequestMarshaller().marshall(super
                        .beforeMarshalling(modifyHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ModifyHsmResult> responseHandler = new JsonResponseHandler<ModifyHsmResult>(
                    new ModifyHsmResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new
     * certificate on the client's HSMs.
     * </p>
     * 
     * @param modifyLunaClientRequest
     * @return Result of the ModifyLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @sample AWSCloudHSM.ModifyLunaClient
     */
    @Override
    public ModifyLunaClientResult modifyLunaClient(
            ModifyLunaClientRequest modifyLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyLunaClientRequest> request = null;
        Response<ModifyLunaClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyLunaClientRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(modifyLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ModifyLunaClientResult> responseHandler = new JsonResponseHandler<ModifyLunaClientResult>(
                    new ModifyLunaClientResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
