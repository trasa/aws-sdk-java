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
package com.amazonaws.services.identitymanagement;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

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

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.services.identitymanagement.model.transform.*;

/**
 * Client for accessing AmazonIdentityManagement.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Identity and Access Management <p>
 * AWS Identity and Access Management (IAM) is a web service that you can
 * use to manage users and user permissions under your AWS account. This
 * guide provides descriptions of IAM actions that you can call
 * programmatically. For general information about IAM, see
 * <a href="http://aws.amazon.com/iam/"> AWS Identity and Access Management (IAM) </a> . For the user guide for IAM, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/"> Using IAM </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>AWS provides SDKs that consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby,
 * .NET, iOS, Android, etc.). The SDKs provide a convenient way to create
 * programmatic access to IAM and AWS. For example, the SDKs take care of
 * tasks such as cryptographically signing requests (see below), managing
 * errors, and retrying requests automatically. For information about the
 * AWS SDKs, including how to download and install them, see the Tools
 * for Amazon Web Services page.
 * </p>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls
 * to IAM. However, you can also use the IAM Query API to make direct
 * calls to the IAM web service. To learn more about the IAM Query API,
 * see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a>
 * in the <i>Using IAM</i> guide. IAM supports GET and POST requests
 * for all actions. That is, the API does not require you to use GET for
 * some actions and POST for others. However, GET requests are subject to
 * the limitation size of a URL. Therefore, for operations that require
 * larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed using an access key ID and a secret access
 * key. We strongly recommend that you do not use your AWS account access
 * key ID and secret access key for everyday work with IAM. You can use
 * the access key ID and secret access key for an IAM user or you can use
 * the AWS Security Token Service to generate temporary security
 * credentials and use those to sign requests.
 * </p>
 * <p>
 * To sign requests, we recommend that you use
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 </a>
 * . If you have an existing application that uses Signature Version 2,
 * you do not have to update it to use Signature Version 4. However, some
 * operations now require Signature Version 4. The documentation for
 * operations that require version 4 indicate this requirement.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information, see the following:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"> AWS Security Credentials </a>
 * . This topic provides general information about the types of
 * credentials used for accessing AWS. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html"> IAM Best Practices </a>
 * . This topic presents a list of suggestions for using the IAM service
 * to help secure your AWS resources. </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a>
 * . This set of topics walk you through the process of signing a
 * request using an access key ID and secret access key. </li>
 * 
 * </ul>
 */
public class AmazonIdentityManagementClient extends AmazonWebServiceClient implements AmazonIdentityManagement {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonIdentityManagement exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonIdentityManagementClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonIdentityManagement
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonIdentityManagementClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonIdentityManagement
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonIdentityManagementClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonIdentityManagement
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonIdentityManagement using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonIdentityManagement
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonIdentityManagementClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new CredentialReportNotReadyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnrecognizedPublicKeyEncodingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KeyPairMismatchExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PasswordPolicyViolationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CredentialReportNotPresentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchEntityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DuplicateSSHPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidUserTypeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DeleteConflictExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAuthenticationCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PolicyEvaluationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EntityTemporarilyUnmodifiableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceFailureExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CredentialReportExpiredExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("iam.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/identitymanagement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/identitymanagement/request.handler2s"));
    }

    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using
     * an AWS account alias, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"> Using an Alias for Your AWS Account ID </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param deleteAccountAliasRequest Container for the necessary
     *           parameters to execute the DeleteAccountAlias service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteAccountAliasRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountAliasRequestMarshaller().marshall(super.beforeMarshalling(deleteAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listGroupsRequest Container for the necessary parameters to
     *           execute the ListGroups service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListGroups service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestMarshaller().marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <p>
     * <b>NOTE:</b> You must deactivate a user's virtual MFA device before
     * you can delete it. For information about deactivating MFA devices, see
     * DeactivateMFADevice.
     * </p>
     *
     * @param deleteVirtualMFADeviceRequest Container for the necessary
     *           parameters to execute the DeleteVirtualMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteVirtualMFADeviceRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(deleteVirtualMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified user.
     * </p>
     * <p>
     * A user can also have a managed policy attached to it. To attach a
     * managed policy to a user, use AttachUserPolicy. To create a new
     * managed policy, use CreatePolicy. For information about policies,
     * refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * For information about limits on the number of inline policies that
     * you can embed in a user, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use
     * POST rather than GET when calling PutUserPolicy. For general
     * information about using the Query API with IAM, go to Making Query
     * Requests in the Using IAM guide.
     * </p>
     *
     * @param putUserPolicyRequest Container for the necessary parameters to
     *           execute the PutUserPolicy service method on AmazonIdentityManagement.
     * 
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putUserPolicy(PutUserPolicyRequest putUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<PutUserPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(putUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns information about the SSH public keys associated with the
     * specified IAM user. If there are none, the action returns an empty
     * list.
     * </p>
     * <p>
     * The SSH public keys returned by this action are used only for
     * authenticating the IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see
     * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
     * in the <i>AWS CodeCommit User Guide</i> .
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can
     * still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listSSHPublicKeysRequest Container for the necessary parameters
     *           to execute the ListSSHPublicKeys service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListSSHPublicKeys service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSSHPublicKeysResult listSSHPublicKeys(ListSSHPublicKeysRequest listSSHPublicKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listSSHPublicKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSSHPublicKeysRequest> request = null;
        Response<ListSSHPublicKeysResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSSHPublicKeysRequestMarshaller().marshall(super.beforeMarshalling(listSSHPublicKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListSSHPublicKeysResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the SAML providers in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation requires Signature Version 4.
     * </p>
     *
     * @param listSAMLProvidersRequest Container for the necessary parameters
     *           to execute the ListSAMLProviders service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListSAMLProviders service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSAMLProvidersResult listSAMLProviders(ListSAMLProvidersRequest listSAMLProvidersRequest) {
        ExecutionContext executionContext = createExecutionContext(listSAMLProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSAMLProvidersRequest> request = null;
        Response<ListSAMLProvidersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSAMLProvidersRequestMarshaller().marshall(super.beforeMarshalling(listSAMLProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListSAMLProvidersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in
     * the specified user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a user, use GetPolicy to
     * determine the policy's default version, then use GetPolicyVersion to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param getUserPolicyRequest Container for the necessary parameters to
     *           execute the GetUserPolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetUserPolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserPolicyResult getUserPolicy(GetUserPolicyRequest getUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserPolicyRequest> request = null;
        Response<GetUserPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(getUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetUserPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes an IAM OpenID Connect identity provider.
     * </p>
     * <p>
     * Deleting an OIDC provider does not update any roles that reference
     * the provider as a principal in their trust policies. Any attempt to
     * assume a role that references a provider that has been deleted will
     * fail.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you
     * call the action for a provider that was already deleted.
     * </p>
     *
     * @param deleteOpenIDConnectProviderRequest Container for the necessary
     *           parameters to execute the DeleteOpenIDConnectProvider service method
     *           on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteOpenIDConnectProvider(DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteOpenIDConnectProviderRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(deleteOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Changes the status of the specified signing certificate from active
     * to disabled, or vice versa. This action can be used to disable a
     * user's signing certificate as part of a certificate rotation work
     * flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     *
     * @param updateSigningCertificateRequest Container for the necessary
     *           parameters to execute the UpdateSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateSigningCertificate(UpdateSigningCertificateRequest updateSigningCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateSigningCertificateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSigningCertificateRequestMarshaller().marshall(super.beforeMarshalling(updateSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path
     * prefix is specified, the action returns all users in the AWS account.
     * If there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listUsersRequest Container for the necessary parameters to
     *           execute the ListUsers service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListUsers service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller().marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListUsersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Attaches the specified managed policy to the specified role.
     * </p>
     * <p>
     * When you attach a managed policy to a role, the managed policy is
     * used as the role's access (permissions) policy. You cannot use a
     * managed policy as the role's trust policy. The role's trust policy is
     * created at the same time as the role, using CreateRole. You can update
     * a role's trust policy using UpdateAssumeRolePolicy.
     * </p>
     * <p>
     * Use this API to attach a managed policy to a role. To embed an inline
     * policy in a role, use PutRolePolicy. For more information about
     * policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param attachRolePolicyRequest Container for the necessary parameters
     *           to execute the AttachRolePolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachRolePolicy(AttachRolePolicyRequest attachRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachRolePolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(attachRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
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
     * @param getContextKeysForCustomPolicyRequest Container for the
     *           necessary parameters to execute the GetContextKeysForCustomPolicy
     *           service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetContextKeysForCustomPolicy service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getContextKeysForCustomPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContextKeysForCustomPolicyRequest> request = null;
        Response<GetContextKeysForCustomPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContextKeysForCustomPolicyRequestMarshaller().marshall(super.beforeMarshalling(getContextKeysForCustomPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetContextKeysForCustomPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more
     * information about the credential report, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"> Getting Credential Reports </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param getCredentialReportRequest Container for the necessary
     *           parameters to execute the GetCredentialReport service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetCredentialReport service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws CredentialReportNotPresentException
     * @throws CredentialReportNotReadyException
     * @throws CredentialReportExpiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCredentialReportResult getCredentialReport(GetCredentialReportRequest getCredentialReportRequest) {
        ExecutionContext executionContext = createExecutionContext(getCredentialReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCredentialReportRequest> request = null;
        Response<GetCredentialReportResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCredentialReportRequestMarshaller().marshall(super.beforeMarshalling(getCredentialReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetCredentialReportResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified
     * user name. When enabled, the MFA device is required for every
     * subsequent login by the user name associated with the device.
     * </p>
     *
     * @param enableMFADeviceRequest Container for the necessary parameters
     *           to execute the EnableMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws InvalidAuthenticationCodeException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableMFADevice(EnableMFADeviceRequest enableMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(enableMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<EnableMFADeviceRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(enableMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the password policy for the AWS account.
     * </p>
     *
     * @param deleteAccountPasswordPolicyRequest Container for the necessary
     *           parameters to execute the DeleteAccountPasswordPolicy service method
     *           on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAccountPasswordPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteAccountPasswordPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountPasswordPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteAccountPasswordPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Retrieves the user name and password-creation date for the specified
     * user. If the user has not been assigned a password, the action returns
     * a 404 ( <code>NoSuchEntity</code> ) error.
     * </p>
     *
     * @param getLoginProfileRequest Container for the necessary parameters
     *           to execute the GetLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetLoginProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetLoginProfileResult getLoginProfile(GetLoginProfileRequest getLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(getLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoginProfileRequest> request = null;
        Response<GetLoginProfileResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(getLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetLoginProfileResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Updates the metadata document for an existing SAML provider.
     * </p>
     * <p>
     * <b>NOTE:</b>This operation requires Signature Version 4.
     * </p>
     *
     * @param updateSAMLProviderRequest Container for the necessary
     *           parameters to execute the UpdateSAMLProvider service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UpdateSAMLProvider service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateSAMLProviderResult updateSAMLProvider(UpdateSAMLProviderRequest updateSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSAMLProviderRequest> request = null;
        Response<UpdateSAMLProviderResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(updateSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UpdateSAMLProviderResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server
     * certificate entity includes a public key certificate, a private key,
     * and an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * For information about the number of server certificates you can
     * upload, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because the body of the public key certificate, private
     * key, and the certificate chain can be large, you should use POST
     * rather than GET when calling UploadServerCertificate. For information
     * about setting up signatures and authorization through the API, go to
     * Signing AWS API Requests in the AWS General Reference. For general
     * information about using the Query API with IAM, go to Making Query
     * Requests in the IAM User Guide.
     * </p>
     *
     * @param uploadServerCertificateRequest Container for the necessary
     *           parameters to execute the UploadServerCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UploadServerCertificate service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws KeyPairMismatchException
     * @throws ServiceFailureException
     * @throws MalformedCertificateException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UploadServerCertificateResult uploadServerCertificate(UploadServerCertificateRequest uploadServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadServerCertificateRequest> request = null;
        Response<UploadServerCertificateResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(uploadServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UploadServerCertificateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an alias for your AWS account. For information about using an
     * AWS account alias, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"> Using an Alias for Your AWS Account ID </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createAccountAliasRequest Container for the necessary
     *           parameters to execute the CreateAccountAlias service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createAccountAlias(CreateAccountAliasRequest createAccountAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAccountAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateAccountAliasRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountAliasRequestMarshaller().marshall(super.beforeMarshalling(createAccountAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists all managed policies that are attached to the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To list the
     * inline policies for a user, use the ListUserPolicies API. For
     * information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to
     * only those matching the specified path prefix. If there are no
     * policies attached to the specified group (or none that match the
     * specified path prefix), the action returns an empty list.
     * </p>
     *
     * @param listAttachedUserPoliciesRequest Container for the necessary
     *           parameters to execute the ListAttachedUserPolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListAttachedUserPolicies service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAttachedUserPoliciesResult listAttachedUserPolicies(ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedUserPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedUserPoliciesRequest> request = null;
        Response<ListAttachedUserPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedUserPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listAttachedUserPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListAttachedUserPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified managed policy.
     * </p>
     * <p>
     * Before you can delete a managed policy, you must detach the policy
     * from all users, groups, and roles that it is attached to, and you must
     * delete all of the policy's versions. The following steps describe the
     * process for deleting a managed policy: <ol> <li>Detach the policy from
     * all users, groups, and roles that the policy is attached to, using the
     * DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy APIs. To list
     * all the users, groups, and roles that a policy is attached to, use
     * ListEntitiesForPolicy. </li>
     * <li>Delete all versions of the policy using DeletePolicyVersion. To
     * list the policy's versions, use ListPolicyVersions. You cannot use
     * DeletePolicyVersion to delete the version that is marked as the
     * default version. You delete the policy's default version in the next
     * step of the process. </li>
     * <li>Delete the policy (this automatically deletes the policy's
     * default version) using this API. </li>
     * </ol>
     * </p>
     * <p>
     * For information about managed policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestMarshaller().marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Simulate a set of IAM policies against a list of API actions and AWS
     * resources to determine the policies' effective permissions. The
     * policies are provided as a list of strings.
     * </p>
     * <p>
     * The simulation does not perform the API actions, it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * actions.
     * </p>
     * <p>
     * If you want to simulate existing policies attached to an IAM user,
     * group, or role, use SimulatePrincipalPolicy instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM
     * policy. To get the list of context keys required by the policies to
     * simulate them correctly, use GetContextKeysForCustomPolicy.
     * </p>
     * <p>
     * If the output is long, you can paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     *
     * @param simulateCustomPolicyRequest Container for the necessary
     *           parameters to execute the SimulateCustomPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the SimulateCustomPolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws PolicyEvaluationException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SimulateCustomPolicyResult simulateCustomPolicy(SimulateCustomPolicyRequest simulateCustomPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(simulateCustomPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SimulateCustomPolicyRequest> request = null;
        Response<SimulateCustomPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SimulateCustomPolicyRequestMarshaller().marshall(super.beforeMarshalling(simulateCustomPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SimulateCustomPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified role. The role must not have any policies
     * attached. For more information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a>
     * .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Make sure you do not have any Amazon EC2 instances
     * running with the role you are about to delete. Deleting a role or
     * instance profile that is associated with a running instance will break
     * any applications running on the instance.
     * </p>
     *
     * @param deleteRoleRequest Container for the necessary parameters to
     *           execute the DeleteRole service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRole(DeleteRoleRequest deleteRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteRoleRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoleRequestMarshaller().marshall(super.beforeMarshalling(deleteRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key
     * ID for the specified user. The default status for new keys is
     * <code>Active</code> .
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create,
     * see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> To ensure the security of your AWS account, the
     * secret access key is accessible only during key and user creation. You
     * must save the key (for example, in a text file) if you want to be able
     * to access it again. If a secret key is lost, you can delete the access
     * keys for the associated user and then create new keys.
     * </p>
     *
     * @param createAccessKeyRequest Container for the necessary parameters
     *           to execute the CreateAccessKey service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateAccessKey service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest createAccessKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(createAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccessKeyRequest> request = null;
        Response<CreateAccessKeyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccessKeyRequestMarshaller().marshall(super.beforeMarshalling(createAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateAccessKeyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID used to sign the request.
     * </p>
     *
     * @param getUserRequest Container for the necessary parameters to
     *           execute the GetUser service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser(GetUserRequest getUserRequest) {
        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestMarshaller().marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetUserResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists all managed policies that are attached to the specified group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To list the
     * inline policies for a group, use the ListGroupPolicies API. For
     * information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to
     * only those matching the specified path prefix. If there are no
     * policies attached to the specified group (or none that match the
     * specified path prefix), the action returns an empty list.
     * </p>
     *
     * @param listAttachedGroupPoliciesRequest Container for the necessary
     *           parameters to execute the ListAttachedGroupPolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListAttachedGroupPolicies service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAttachedGroupPoliciesResult listAttachedGroupPolicies(ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedGroupPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedGroupPoliciesRequest> request = null;
        Response<ListAttachedGroupPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedGroupPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listAttachedGroupPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListAttachedGroupPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Synchronizes the specified MFA device with AWS servers.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA
     * devices, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"> Using a Virtual MFA Device </a>
     * in the <i>Using IAM</i> guide.
     * </p>
     *
     * @param resyncMFADeviceRequest Container for the necessary parameters
     *           to execute the ResyncMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws InvalidAuthenticationCodeException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resyncMFADevice(ResyncMFADeviceRequest resyncMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(resyncMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ResyncMFADeviceRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResyncMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(resyncMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the MFA devices. If the request includes the user name, then
     * this action lists all the MFA devices associated with the specified
     * user name. If you do not specify a user name, IAM determines the user
     * name implicitly based on the AWS access key ID signing the request.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listMFADevicesRequest Container for the necessary parameters to
     *           execute the ListMFADevices service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListMFADevices service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMFADevicesResult listMFADevices(ListMFADevicesRequest listMFADevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(listMFADevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMFADevicesRequest> request = null;
        Response<ListMFADevicesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMFADevicesRequestMarshaller().marshall(super.beforeMarshalling(listMFADevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListMFADevicesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating
     * the virtual MFA, use EnableMFADevice to attach the MFA device to an
     * IAM user. For more information about creating and working with virtual
     * MFA devices, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"> Using a Virtual MFA Device </a>
     * in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can
     * create, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on Entities </a>
     * in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The seed information contained in the QR code and
     * the Base32 string should be treated like any other secret access
     * information, such as your AWS access keys or your passwords. After you
     * provision your virtual device, you should ensure that the information
     * is destroyed following secure procedures.
     * </p>
     *
     * @param createVirtualMFADeviceRequest Container for the necessary
     *           parameters to execute the CreateVirtualMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateVirtualMFADevice service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVirtualMFADeviceResult createVirtualMFADevice(CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(createVirtualMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualMFADeviceRequest> request = null;
        Response<CreateVirtualMFADeviceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(createVirtualMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateVirtualMFADeviceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified version of the specified managed policy.
     * </p>
     * <p>
     * You cannot delete the default version of a policy using this API. To
     * delete the default version of a policy, use DeletePolicy. To find out
     * which version of a policy is marked as the default version, use
     * ListPolicyVersions.
     * </p>
     * <p>
     * For information about versions for managed policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"> Versioning for Managed Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param deletePolicyVersionRequest Container for the necessary
     *           parameters to execute the DeletePolicyVersion service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePolicyVersionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(deletePolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the account aliases associated with the account. For
     * information about using an AWS account alias, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"> Using an Alias for Your AWS Account ID </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listAccountAliasesRequest Container for the necessary
     *           parameters to execute the ListAccountAliases service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListAccountAliases service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest listAccountAliasesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAccountAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountAliasesRequest> request = null;
        Response<ListAccountAliasesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountAliasesRequestMarshaller().marshall(super.beforeMarshalling(listAccountAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListAccountAliasesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports
     * <a href="http://openid.net/connect/"> OpenID Connect (OIDC) </a>
     * .
     * </p>
     * <p>
     * The OIDC provider that you create with this operation can be used as
     * a principal in a role's trust policy to establish a trust relationship
     * between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the URL of the
     * OIDC identity provider (IdP) to trust, a list of client IDs (also
     * known as audiences) that identify the application or applications that
     * are allowed to authenticate using the OIDC provider, and a list of
     * thumbprints of the server certificate(s) that the IdP uses. You get
     * all of this information from the OIDC IdP that you want to use for
     * access to AWS.
     * </p>
     * <p>
     * <b>NOTE:</b>Because trust for the OIDC provider is ultimately derived
     * from the IAM provider that this action creates, it is a best practice
     * to limit access to the CreateOpenIDConnectProvider action to
     * highly-privileged users.
     * </p>
     *
     * @param createOpenIDConnectProviderRequest Container for the necessary
     *           parameters to execute the CreateOpenIDConnectProvider service method
     *           on AmazonIdentityManagement.
     * 
     * @return The response from the CreateOpenIDConnectProvider service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateOpenIDConnectProviderResult createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(createOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOpenIDConnectProviderRequest> request = null;
        Response<CreateOpenIDConnectProviderResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(createOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateOpenIDConnectProviderResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves information about the specified role, including the role's
     * path, GUID, ARN, and the policy granting permission to assume the
     * role. For more information about ARNs, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs"> ARNs </a> . For more information about roles, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a>
     * .
     * </p>
     *
     * @param getRoleRequest Container for the necessary parameters to
     *           execute the GetRole service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetRole service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetRoleResult getRole(GetRoleRequest getRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(getRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoleRequest> request = null;
        Response<GetRoleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoleRequestMarshaller().marshall(super.beforeMarshalling(getRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetRoleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the
     * specified role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To list the
     * managed policies that are attached to a role, use
     * ListAttachedRolePolicies. For more information about policies, refer
     * to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies
     * embedded with the specified role, the action returns an empty list.
     * </p>
     *
     * @param listRolePoliciesRequest Container for the necessary parameters
     *           to execute the ListRolePolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListRolePolicies service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest listRolePoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRolePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRolePoliciesRequest> request = null;
        Response<ListRolePoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRolePoliciesRequestMarshaller().marshall(super.beforeMarshalling(listRolePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListRolePoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns information about the signing certificates associated with
     * the specified user. If there are none, the action returns an empty
     * list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing
     * certificates, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     *
     * @param listSigningCertificatesRequest Container for the necessary
     *           parameters to execute the ListSigningCertificates service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListSigningCertificates service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSigningCertificatesResult listSigningCertificates(ListSigningCertificatesRequest listSigningCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listSigningCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSigningCertificatesRequest> request = null;
        Response<ListSigningCertificatesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSigningCertificatesRequestMarshaller().marshall(super.beforeMarshalling(listSigningCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListSigningCertificatesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the
     * specified user. Some AWS services use X.509 signing certificates to
     * validate requests that are signed with a corresponding private key.
     * When you upload the certificate, its default status is
     * <code>Active</code> .
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>Because the body of a X.509 certificate can be large, you
     * should use POST rather than GET when calling UploadSigningCertificate.
     * For information about setting up signatures and authorization through
     * the API, go to Signing AWS API Requests in the AWS General Reference.
     * For general information about using the Query API with IAM, go to
     * Making Query Requests in the Using IAMguide.
     * </p>
     *
     * @param uploadSigningCertificateRequest Container for the necessary
     *           parameters to execute the UploadSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UploadSigningCertificate service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws DuplicateCertificateException
     * @throws InvalidCertificateException
     * @throws ServiceFailureException
     * @throws MalformedCertificateException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UploadSigningCertificateResult uploadSigningCertificate(UploadSigningCertificateRequest uploadSigningCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadSigningCertificateRequest> request = null;
        Response<UploadSigningCertificateResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadSigningCertificateRequestMarshaller().marshall(super.beforeMarshalling(uploadSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UploadSigningCertificateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and
     * policies in your account, including their relationships to one
     * another. Use this API to obtain a snapshot of the configuration of IAM
     * permissions (users, groups, roles, and policies) in your account.
     * </p>
     * <p>
     * You can optionally filter the results using the <code>Filter</code>
     * parameter. You can paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     *
     * @param getAccountAuthorizationDetailsRequest Container for the
     *           necessary parameters to execute the GetAccountAuthorizationDetails
     *           service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetAccountAuthorizationDetails service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountAuthorizationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountAuthorizationDetailsRequest> request = null;
        Response<GetAccountAuthorizationDetailsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountAuthorizationDetailsRequestMarshaller().marshall(super.beforeMarshalling(getAccountAuthorizationDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetAccountAuthorizationDetailsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Changes the password of the IAM user who is calling this action. The
     * root account password is not affected by this action.
     * </p>
     * <p>
     * To change the password for a different user, see UpdateLoginProfile.
     * For more information about modifying passwords, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"> Managing Passwords </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param changePasswordRequest Container for the necessary parameters to
     *           execute the ChangePassword service method on AmazonIdentityManagement.
     * 
     * 
     * @throws PasswordPolicyViolationException
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidUserTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void changePassword(ChangePasswordRequest changePasswordRequest) {
        ExecutionContext executionContext = createExecutionContext(changePasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ChangePasswordRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangePasswordRequestMarshaller().marshall(super.beforeMarshalling(changePasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified group.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To attach a
     * managed policy to a group, use AttachGroupPolicy. To create a new
     * managed policy, use CreatePolicy. For information about policies,
     * refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * For information about limits on the number of inline policies that
     * you can embed in a group, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use
     * POST rather than GET when calling PutGroupPolicy. For general
     * information about using the Query API with IAM, go to Making Query
     * Requests in the Using IAM guide.
     * </p>
     *
     * @param putGroupPolicyRequest Container for the necessary parameters to
     *           execute the PutGroupPolicy service method on AmazonIdentityManagement.
     * 
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<PutGroupPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(putGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified signing certificate associated with the
     * specified user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     *
     * @param deleteSigningCertificateRequest Container for the necessary
     *           parameters to execute the DeleteSigningCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSigningCertificate(DeleteSigningCertificateRequest deleteSigningCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSigningCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSigningCertificateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSigningCertificateRequestMarshaller().marshall(super.beforeMarshalling(deleteSigningCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns information about the access key IDs associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can
     * still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your AWS account, the secret
     * access key is accessible only during key and user creation.
     * </p>
     *
     * @param listAccessKeysRequest Container for the necessary parameters to
     *           execute the ListAccessKeys service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListAccessKeys service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAccessKeysResult listAccessKeys(ListAccessKeysRequest listAccessKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listAccessKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccessKeysRequest> request = null;
        Response<ListAccessKeysResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccessKeysRequestMarshaller().marshall(super.beforeMarshalling(listAccessKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListAccessKeysResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists information about the OpenID Connect providers in the AWS
     * account.
     * </p>
     *
     * @param listOpenIDConnectProvidersRequest Container for the necessary
     *           parameters to execute the ListOpenIDConnectProviders service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListOpenIDConnectProviders service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders(ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest) {
        ExecutionContext executionContext = createExecutionContext(listOpenIDConnectProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOpenIDConnectProvidersRequest> request = null;
        Response<ListOpenIDConnectProvidersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOpenIDConnectProvidersRequestMarshaller().marshall(super.beforeMarshalling(listOpenIDConnectProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListOpenIDConnectProvidersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Replaces the existing list of server certificate thumbprints with a
     * new list.
     * </p>
     * <p>
     * The list that you pass with this action completely replaces the
     * existing list of thumbprints. (The lists are not merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity
     * provider's certificate changes, which occurs rarely. However, if the
     * provider's certificate <i>does</i> change, any attempt to assume an
     * IAM role that specifies the OIDC provider as a principal will fail
     * until the certificate thumbprint is updated.
     * </p>
     * <p>
     * <b>NOTE:</b>Because trust for the OpenID Connect provider is
     * ultimately derived from the provider's certificate and is validated by
     * the thumbprint, it is a best practice to limit access to the
     * UpdateOpenIDConnectProviderThumbprint action to highly-privileged
     * users.
     * </p>
     *
     * @param updateOpenIDConnectProviderThumbprintRequest Container for the
     *           necessary parameters to execute the
     *           UpdateOpenIDConnectProviderThumbprint service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateOpenIDConnectProviderThumbprint(UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest) {
        ExecutionContext executionContext = createExecutionContext(updateOpenIDConnectProviderThumbprintRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateOpenIDConnectProviderThumbprintRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOpenIDConnectProviderThumbprintRequestMarshaller().marshall(super.beforeMarshalling(updateOpenIDConnectProviderThumbprintRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Retrieves the specified SSH public key, including metadata about the
     * key.
     * </p>
     * <p>
     * The SSH public key retrieved by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate
     * to an AWS CodeCommit repository, see
     * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
     * in the <i>AWS CodeCommit User Guide</i> .
     * </p>
     *
     * @param getSSHPublicKeyRequest Container for the necessary parameters
     *           to execute the GetSSHPublicKey service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetSSHPublicKey service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws UnrecognizedPublicKeyEncodingException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest getSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(getSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSSHPublicKeyRequest> request = null;
        Response<GetSSHPublicKeyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(getSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetSSHPublicKeyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes the specified managed policy from the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To delete an
     * inline policy, use the DeleteRolePolicy API. For information about
     * policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param detachRolePolicyRequest Container for the necessary parameters
     *           to execute the DetachRolePolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachRolePolicy(DetachRolePolicyRequest detachRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachRolePolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(detachRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a new managed policy for your AWS account.
     * </p>
     * <p>
     * This operation creates a policy version with a version identifier of
     * <code>v1</code> and sets v1 as the policy's default version. For more
     * information about policy versions, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"> Versioning for Managed Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * For more information about managed policies in general, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createPolicyRequest Container for the necessary parameters to
     *           execute the CreatePolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the CreatePolicy service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestMarshaller().marshall(super.beforeMarshalling(createPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreatePolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new instance profile. For information about instance
     * profiles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     * <p>
     * For information about the number of instance profiles you can create,
     * see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createInstanceProfileRequest Container for the necessary
     *           parameters to execute the CreateInstanceProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateInstanceProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(createInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceProfileRequest> request = null;
        Response<CreateInstanceProfileResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(createInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateInstanceProfileResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a password for the specified user, giving the user the
     * ability to access AWS services through the AWS Management Console. For
     * more information about managing passwords, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"> Managing Passwords </a>
     * in the <i>Using IAM</i> guide.
     * </p>
     *
     * @param createLoginProfileRequest Container for the necessary
     *           parameters to execute the CreateLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateLoginProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws PasswordPolicyViolationException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest createLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(createLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoginProfileRequest> request = null;
        Response<CreateLoginProfileResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(createLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateLoginProfileResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes the specified role from the specified instance profile.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Make sure you do not have any Amazon EC2 instances
     * running with the role you are about to remove from the instance
     * profile. Removing a role from an instance profile that is associated
     * with a running instance will break any applications running on the
     * instance.
     * </p>
     * <p>
     * For more information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> . For more information about instance profiles, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     *
     * @param removeRoleFromInstanceProfileRequest Container for the
     *           necessary parameters to execute the RemoveRoleFromInstanceProfile
     *           service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(removeRoleFromInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RemoveRoleFromInstanceProfileRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveRoleFromInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(removeRoleFromInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the password policy settings for the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This action does not support partial updates. No
     * parameters are required, but if you do not specify a parameter, that
     * parameter's value reverts to its default value. See the Request
     * Parameters section for each parameter's default value.
     * </p>
     * <p>
     * For more information about using a password policy, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"> Managing an IAM Password Policy </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param updateAccountPasswordPolicyRequest Container for the necessary
     *           parameters to execute the UpdateAccountPasswordPolicy service method
     *           on AmazonIdentityManagement.
     * 
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAccountPasswordPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateAccountPasswordPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountPasswordPolicyRequestMarshaller().marshall(super.beforeMarshalling(updateAccountPasswordPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the policy that grants an entity permission to assume a role.
     * For more information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"> Using Roles to Delegate Permissions and Federate Identities </a>
     * .
     * </p>
     *
     * @param updateAssumeRolePolicyRequest Container for the necessary
     *           parameters to execute the UpdateAssumeRolePolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssumeRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateAssumeRolePolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssumeRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(updateAssumeRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Retrieves information about the specified instance profile, including
     * the instance profile's path, GUID, ARN, and role. For more information
     * about instance profiles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a> . For more information about ARNs, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs"> ARNs </a>
     * .
     * </p>
     *
     * @param getInstanceProfileRequest Container for the necessary
     *           parameters to execute the GetInstanceProfile service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetInstanceProfile service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(getInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceProfileRequest> request = null;
        Response<GetInstanceProfileResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(getInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetInstanceProfileResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the
     * AWS account.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param getAccountSummaryRequest Container for the necessary parameters
     *           to execute the GetAccountSummary service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetAccountSummary service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest getAccountSummaryRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSummaryRequest> request = null;
        Response<GetAccountSummaryResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSummaryRequestMarshaller().marshall(super.beforeMarshalling(getAccountSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetAccountSummaryResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports SAML 2.0.
     * </p>
     * <p>
     * The SAML provider that you create with this operation can be used as
     * a principal in a role's trust policy to establish a trust relationship
     * between AWS and a SAML identity provider. You can create an IAM role
     * that supports Web-based single sign-on (SSO) to the AWS Management
     * Console or one that supports API access to AWS.
     * </p>
     * <p>
     * When you create the SAML provider, you upload an a SAML metadata
     * document that you get from your IdP and that includes the issuer's
     * name, expiration information, and keys that can be used to validate
     * the SAML authentication response (assertions) that are received from
     * the IdP. You must generate the metadata document using the identity
     * management software that is used as your organization's IdP.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation requires Signature Version 4.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html"> Enabling SAML 2.0 Federated Users to Access the AWS Management Console </a> and <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html"> About SAML 2.0-based Federation </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createSAMLProviderRequest Container for the necessary
     *           parameters to execute the CreateSAMLProvider service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreateSAMLProvider service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSAMLProviderResult createSAMLProvider(CreateSAMLProviderRequest createSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(createSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSAMLProviderRequest> request = null;
        Response<CreateSAMLProviderResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(createSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateSAMLProviderResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves information about the specified managed policy, including
     * the policy's default version and the total number of users, groups,
     * and roles that the policy is attached to. For a list of the specific
     * users, groups, and roles that the policy is attached to, use the
     * ListEntitiesForPolicy API. This API returns metadata about the policy.
     * To retrieve the policy document for a specific version of the policy,
     * use GetPolicyVersion.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded with a user,
     * group, or role, use the GetUserPolicy, GetGroupPolicy, or
     * GetRolePolicy API.
     * </p>
     * <p>
     * For more information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetPolicy service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestMarshaller().marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists information about the versions of the specified managed policy,
     * including the version that is set as the policy's default version.
     * </p>
     * <p>
     * For more information about managed policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param listPolicyVersionsRequest Container for the necessary
     *           parameters to execute the ListPolicyVersions service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListPolicyVersions service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyVersionsRequest> request = null;
        Response<ListPolicyVersionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyVersionsRequestMarshaller().marshall(super.beforeMarshalling(listPolicyVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListPolicyVersionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the access key associated with the specified user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     *
     * @param deleteAccessKeyRequest Container for the necessary parameters
     *           to execute the DeleteAccessKey service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteAccessKeyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessKeyRequestMarshaller().marshall(super.beforeMarshalling(deleteAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To detach a
     * managed policy from a user, use DetachUserPolicy. For more information
     * about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param deleteUserPolicyRequest Container for the necessary parameters
     *           to execute the DeleteUserPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserPolicy(DeleteUserPolicyRequest deleteUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteUserPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the server certificates that have the specified path prefix. If
     * none exist, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listServerCertificatesRequest Container for the necessary
     *           parameters to execute the ListServerCertificates service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListServerCertificates service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListServerCertificatesResult listServerCertificates(ListServerCertificatesRequest listServerCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listServerCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServerCertificatesRequest> request = null;
        Response<ListServerCertificatesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServerCertificatesRequestMarshaller().marshall(super.beforeMarshalling(listServerCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListServerCertificatesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing
     * a server certificate's path or name. For more information, see
     * Managing Server Certificates in the IAM User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b>To change a server certificate name the requester must
     * have appropriate permissions on both the source object and the target
     * object. For example, to change the name from ProductionCert to
     * ProdCert, the entity making the request must have permission on
     * ProductionCert and ProdCert, or must have permission on all (*). For
     * more information about permissions, see Permissions and Policies.
     * </p>
     *
     * @param updateServerCertificateRequest Container for the necessary
     *           parameters to execute the UpdateServerCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateServerCertificate(UpdateServerCertificateRequest updateServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateServerCertificateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(updateServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the name and/or the path of the specified user.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing
     * a user's path or name. For more information, see Renaming Users and
     * Groups in the IAM User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> To change a user name the requester must have
     * appropriate permissions on both the source object and the target
     * object. For example, to change Bob to Robert, the entity making the
     * request must have permission on Bob and Robert, or must have
     * permission on all (*). For more information about permissions, see
     * Permissions and Policies.
     * </p>
     *
     * @param updateUserRequest Container for the necessary parameters to
     *           execute the UpdateUser service method on AmazonIdentityManagement.
     * 
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateUser(UpdateUserRequest updateUserRequest) {
        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateUserRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestMarshaller().marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified SSH public key.
     * </p>
     * <p>
     * The SSH public key deleted by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate
     * to an AWS CodeCommit repository, see
     * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
     * in the <i>AWS CodeCommit User Guide</i> .
     * </p>
     *
     * @param deleteSSHPublicKeyRequest Container for the necessary
     *           parameters to execute the DeleteSSHPublicKey service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSSHPublicKey(DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSSHPublicKeyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(deleteSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified role.
     * </p>
     * <p>
     * When you embed an inline policy in a role, the inline policy is used
     * as the role's access (permissions) policy. The role's trust policy is
     * created at the same time as the role, using CreateRole. You can update
     * a role's trust policy using UpdateAssumeRolePolicy. For more
     * information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"> Using Roles to Delegate Permissions and Federate Identities </a>
     * .
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a
     * managed policy to a role, use AttachRolePolicy. To create a new
     * managed policy, use CreatePolicy. For information about policies,
     * refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * For information about limits on the number of inline policies that
     * you can embed with a role, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b>Because policy documents can be large, you should use
     * POST rather than GET when calling PutRolePolicy. For general
     * information about using the Query API with IAM, go to Making Query
     * Requests in the Using IAM guide.
     * </p>
     *
     * @param putRolePolicyRequest Container for the necessary parameters to
     *           execute the PutRolePolicy service method on AmazonIdentityManagement.
     * 
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putRolePolicy(PutRolePolicyRequest putRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<PutRolePolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(putRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To detach a
     * managed policy from a group, use DetachGroupPolicy. For more
     * information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param deleteGroupPolicyRequest Container for the necessary parameters
     *           to execute the DeleteGroupPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteGroupPolicy(DeleteGroupPolicyRequest deleteGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteGroupPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates the name and/or the path of the specified group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You should understand the implications of changing
     * a group's path or name. For more information, see Renaming Users and
     * Groups in the IAM User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b>To change a group name the requester must have
     * appropriate permissions on both the source object and the target
     * object. For example, to change Managers to MGRs, the entity making the
     * request must have permission on Managers and MGRs, or must have
     * permission on all (*). For more information about permissions, see
     * Permissions and Policies.
     * </p>
     *
     * @param updateGroupRequest Container for the necessary parameters to
     *           execute the UpdateGroup service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateGroup(UpdateGroupRequest updateGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestMarshaller().marshall(super.beforeMarshalling(updateGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Sets the status of the specified SSH public key to active or
     * inactive. SSH public keys that are inactive cannot be used for
     * authentication. This action can be used to disable a user's SSH public
     * key as part of a key rotation work flow.
     * </p>
     * <p>
     * The SSH public key affected by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate
     * to an AWS CodeCommit repository, see
     * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
     * in the <i>AWS CodeCommit User Guide</i> .
     * </p>
     *
     * @param updateSSHPublicKeyRequest Container for the necessary
     *           parameters to execute the UpdateSSHPublicKey service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateSSHPublicKey(UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateSSHPublicKeyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(updateSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists all the managed policies that are available to your account,
     * including your own customer managed policies and all AWS managed
     * policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the
     * optional <code>OnlyAttached</code> , <code>Scope</code> , and
     * <code>PathPrefix</code> parameters. For example, to list only the
     * customer managed policies in your AWS account, set <code>Scope</code>
     * to <code>Local</code> . To list only AWS managed policies, set
     * <code>Scope</code> to <code>AWS</code> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param listPoliciesRequest Container for the necessary parameters to
     *           execute the ListPolicies service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListPolicies service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new user for your AWS account.
     * </p>
     * <p>
     * For information about limitations on the number of users you can
     * create, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createUserRequest Container for the necessary parameters to
     *           execute the CreateUser service method on AmazonIdentityManagement.
     * 
     * @return The response from the CreateUser service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserResult createUser(CreateUserRequest createUserRequest) {
        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateUserResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client
     * IDs already registered for the specified IAM OpenID Connect provider.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you
     * add an existing client ID to the provider.
     * </p>
     *
     * @param addClientIDToOpenIDConnectProviderRequest Container for the
     *           necessary parameters to execute the AddClientIDToOpenIDConnectProvider
     *           service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addClientIDToOpenIDConnectProvider(AddClientIDToOpenIDConnectProviderRequest addClientIDToOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(addClientIDToOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AddClientIDToOpenIDConnectProviderRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddClientIDToOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(addClientIDToOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes a SAML provider.
     * </p>
     * <p>
     * Deleting the provider does not update any roles that reference the
     * SAML provider as a principal in their trust policies. Any attempt to
     * assume a role that references a SAML provider that has been deleted
     * will fail.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation requires Signature Version 4.
     * </p>
     *
     * @param deleteSAMLProviderRequest Container for the necessary
     *           parameters to execute the DeleteSAMLProvider service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSAMLProvider(DeleteSAMLProviderRequest deleteSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSAMLProviderRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(deleteSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Gets a list of all of the context keys referenced in
     * <code>Condition</code> elements in all of the IAM policies attached to
     * the specified IAM entity. The entity can be an IAM user, group, or
     * role. If you specify a user, then the request also includes all of the
     * policies attached to groups that the user is a member of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies,
     * specified as strings. If you want to include only a list of policies
     * by string, use GetContextKeysForCustomPolicy instead.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions
     * granted to other users. If you do not want users to see other user's
     * permissions, then consider allowing them to use
     * GetContextKeysForCustomPolicy instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM
     * policy. Use GetContextKeysForPrincipalPolicy to understand what key
     * names and values you must supply when you call
     * SimulatePrincipalPolicy.
     * </p>
     *
     * @param getContextKeysForPrincipalPolicyRequest Container for the
     *           necessary parameters to execute the GetContextKeysForPrincipalPolicy
     *           service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetContextKeysForPrincipalPolicy service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getContextKeysForPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContextKeysForPrincipalPolicyRequest> request = null;
        Response<GetContextKeysForPrincipalPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContextKeysForPrincipalPolicyRequestMarshaller().marshall(super.beforeMarshalling(getContextKeysForPrincipalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetContextKeysForPrincipalPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes the specified client ID (also known as audience) from the
     * list of client IDs registered for the specified IAM OpenID Connect
     * provider.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you
     * try to remove a client ID that was removed previously.
     * </p>
     *
     * @param removeClientIDFromOpenIDConnectProviderRequest Container for
     *           the necessary parameters to execute the
     *           RemoveClientIDFromOpenIDConnectProvider service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removeClientIDFromOpenIDConnectProvider(RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(removeClientIDFromOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RemoveClientIDFromOpenIDConnectProviderRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveClientIDFromOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(removeClientIDFromOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createGroupRequest Container for the necessary parameters to
     *           execute the CreateGroup service method on AmazonIdentityManagement.
     * 
     * @return The response from the CreateGroup service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestMarshaller().marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified user. The user must not belong to any groups,
     * have any keys or signing certificates, or have any attached policies.
     * </p>
     *
     * @param deleteUserRequest Container for the necessary parameters to
     *           execute the DeleteUser service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUser(DeleteUserRequest deleteUserRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteUserRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association
     * with the user name for which it was originally enabled.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA
     * devices, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"> Using a Virtual MFA Device </a>
     * in the <i>Using IAM</i> guide.
     * </p>
     *
     * @param deactivateMFADeviceRequest Container for the necessary
     *           parameters to execute the DeactivateMFADevice service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deactivateMFADevice(DeactivateMFADeviceRequest deactivateMFADeviceRequest) {
        ExecutionContext executionContext = createExecutionContext(deactivateMFADeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeactivateMFADeviceRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivateMFADeviceRequestMarshaller().marshall(super.beforeMarshalling(deactivateMFADeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Retrieves information about the specified version of the specified
     * managed policy, including the policy document.
     * </p>
     * <p>
     * To list the available versions for a policy, use ListPolicyVersions.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded in a user, group,
     * or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API.
     * </p>
     * <p>
     * For more information about the types of policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param getPolicyVersionRequest Container for the necessary parameters
     *           to execute the GetPolicyVersion service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetPolicyVersion service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyVersionRequest> request = null;
        Response<GetPolicyVersionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(getPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetPolicyVersionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Generates a credential report for the AWS account. For more
     * information about the credential report, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"> Getting Credential Reports </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param generateCredentialReportRequest Container for the necessary
     *           parameters to execute the GenerateCredentialReport service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GenerateCredentialReport service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateCredentialReportResult generateCredentialReport(GenerateCredentialReportRequest generateCredentialReportRequest) {
        ExecutionContext executionContext = createExecutionContext(generateCredentialReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateCredentialReportRequest> request = null;
        Response<GenerateCredentialReportResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateCredentialReportRequestMarshaller().marshall(super.beforeMarshalling(generateCredentialReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GenerateCredentialReportResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     *
     * @param removeUserFromGroupRequest Container for the necessary
     *           parameters to execute the RemoveUserFromGroup service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(removeUserFromGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RemoveUserFromGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveUserFromGroupRequestMarshaller().marshall(super.beforeMarshalling(removeUserFromGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists all managed policies that are attached to the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To list the
     * inline policies for a role, use the ListRolePolicies API. For
     * information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to
     * only those matching the specified path prefix. If there are no
     * policies attached to the specified role (or none that match the
     * specified path prefix), the action returns an empty list.
     * </p>
     *
     * @param listAttachedRolePoliciesRequest Container for the necessary
     *           parameters to execute the ListAttachedRolePolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListAttachedRolePolicies service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAttachedRolePoliciesResult listAttachedRolePolicies(ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedRolePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedRolePoliciesRequest> request = null;
        Response<ListAttachedRolePoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedRolePoliciesRequestMarshaller().marshall(super.beforeMarshalling(listAttachedRolePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListAttachedRolePoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If you are using a server certificate with Elastic
     * Load Balancing, deleting the certificate could have implications for
     * your application. If Elastic Load Balancing doesn't detect the
     * deletion of bound certificates, it may continue to use the
     * certificates. This could cause Elastic Load Balancing to stop
     * accepting traffic. We recommend that you remove the reference to the
     * certificate from Elastic Load Balancing before using this command to
     * delete the certificate. For more information, go to
     * DeleteLoadBalancerListeners in the Elastic Load Balancing API
     * Reference.
     * </p>
     *
     * @param deleteServerCertificateRequest Container for the necessary
     *           parameters to execute the DeleteServerCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteServerCertificate(DeleteServerCertificateRequest deleteServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteServerCertificateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(deleteServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists all users, groups, and roles that the specified managed policy
     * is attached to.
     * </p>
     * <p>
     * You can use the optional <code>EntityFilter</code> parameter to limit
     * the results to a particular type of entity (users, groups, or roles).
     * For example, to list only the roles that are attached to the specified
     * policy, set <code>EntityFilter</code> to <code>Role</code> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listEntitiesForPolicyRequest Container for the necessary
     *           parameters to execute the ListEntitiesForPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListEntitiesForPolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEntitiesForPolicyResult listEntitiesForPolicy(ListEntitiesForPolicyRequest listEntitiesForPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(listEntitiesForPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesForPolicyRequest> request = null;
        Response<ListEntitiesForPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesForPolicyRequestMarshaller().marshall(super.beforeMarshalling(listEntitiesForPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListEntitiesForPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes the specified managed policy from the specified group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To delete an
     * inline policy, use the DeleteGroupPolicy API. For information about
     * policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param detachGroupPolicyRequest Container for the necessary parameters
     *           to execute the DetachGroupPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachGroupPolicy(DetachGroupPolicyRequest detachGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachGroupPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(detachGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If
     * there are none, the action returns an empty list. For more information
     * about instance profiles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listInstanceProfilesRequest Container for the necessary
     *           parameters to execute the ListInstanceProfiles service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListInstanceProfiles service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest listInstanceProfilesRequest) {
        ExecutionContext executionContext = createExecutionContext(listInstanceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceProfilesRequest> request = null;
        Response<ListInstanceProfilesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceProfilesRequestMarshaller().marshall(super.beforeMarshalling(listInstanceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListInstanceProfilesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Changes the status of the specified access key from Active to
     * Inactive, or vice versa. This action can be used to disable a user's
     * key as part of a key rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html"> Managing Keys and Certificates </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param updateAccessKeyRequest Container for the necessary parameters
     *           to execute the UpdateAccessKey service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAccessKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateAccessKeyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccessKeyRequestMarshaller().marshall(super.beforeMarshalling(updateAccessKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns information about the specified OpenID Connect provider.
     * </p>
     *
     * @param getOpenIDConnectProviderRequest Container for the necessary
     *           parameters to execute the GetOpenIDConnectProvider service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetOpenIDConnectProvider service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetOpenIDConnectProviderResult getOpenIDConnectProvider(GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(getOpenIDConnectProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOpenIDConnectProviderRequest> request = null;
        Response<GetOpenIDConnectProviderResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOpenIDConnectProviderRequestMarshaller().marshall(super.beforeMarshalling(getOpenIDConnectProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetOpenIDConnectProviderResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     *
     * @param addUserToGroupRequest Container for the necessary parameters to
     *           execute the AddUserToGroup service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(addUserToGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AddUserToGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddUserToGroupRequestMarshaller().marshall(super.beforeMarshalling(addUserToGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns a list of users that are in the specified group. You can
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param getGroupRequest Container for the necessary parameters to
     *           execute the GetGroup service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetGroup service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetGroupResult getGroup(GetGroupRequest getGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(getGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupRequest> request = null;
        Response<GetGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupRequestMarshaller().marshall(super.beforeMarshalling(getGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified group. The group must not contain any users or
     * have any attached policies.
     * </p>
     *
     * @param deleteGroupRequest Container for the necessary parameters to
     *           execute the DeleteGroup service method on AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteGroup(DeleteGroupRequest deleteGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Removes the specified managed policy from the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To delete an
     * inline policy, use the DeleteUserPolicy API. For information about
     * policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param detachUserPolicyRequest Container for the necessary parameters
     *           to execute the DetachUserPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachUserPolicy(DetachUserPolicyRequest detachUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachUserPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(detachUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the specified instance profile. The instance profile must not
     * have an associated role.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Make sure you do not have any Amazon EC2 instances
     * running with the instance profile you are about to delete. Deleting a
     * role or instance profile that is associated with a running instance
     * will break any applications running on the instance.
     * </p>
     * <p>
     * For more information about instance profiles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     *
     * @param deleteInstanceProfileRequest Container for the necessary
     *           parameters to execute the DeleteInstanceProfile service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteInstanceProfileRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(deleteInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns the SAML provider metadocument that was uploaded when the
     * provider was created or updated.
     * </p>
     * <p>
     * <b>NOTE:</b>This operation requires Signature Version 4.
     * </p>
     *
     * @param getSAMLProviderRequest Container for the necessary parameters
     *           to execute the GetSAMLProvider service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetSAMLProvider service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest getSAMLProviderRequest) {
        ExecutionContext executionContext = createExecutionContext(getSAMLProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSAMLProviderRequest> request = null;
        Response<GetSAMLProviderResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSAMLProviderRequestMarshaller().marshall(super.beforeMarshalling(getSAMLProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetSAMLProviderResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new role for your AWS account. For more information about
     * roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> . For information about limitations on role names and the number of roles you can create, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * The policy in the following example grants permission to an EC2
     * instance to assume the role.
     * </p>
     *
     * @param createRoleRequest Container for the necessary parameters to
     *           execute the CreateRole service method on AmazonIdentityManagement.
     * 
     * @return The response from the CreateRole service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateRoleResult createRole(CreateRoleRequest createRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(createRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoleRequest> request = null;
        Response<CreateRoleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoleRequestMarshaller().marshall(super.beforeMarshalling(createRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateRoleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Changes the password for the specified user.
     * </p>
     * <p>
     * Users can change their own passwords by calling ChangePassword. For
     * more information about modifying passwords, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"> Managing Passwords </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param updateLoginProfileRequest Container for the necessary
     *           parameters to execute the UpdateLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws PasswordPolicyViolationException
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateLoginProfile(UpdateLoginProfileRequest updateLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(updateLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateLoginProfileRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(updateLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Deletes the password for the specified user, which terminates the
     * user's ability to access AWS services through the AWS Management
     * Console.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Deleting a user's password does not prevent a user
     * from accessing IAM through the command line interface or the API. To
     * prevent all user access you must also either make the access key
     * inactive or delete it. For more information about making keys inactive
     * or deleting them, see UpdateAccessKey and DeleteAccessKey.
     * </p>
     *
     * @param deleteLoginProfileRequest Container for the necessary
     *           parameters to execute the DeleteLoginProfile service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoginProfile(DeleteLoginProfileRequest deleteLoginProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLoginProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteLoginProfileRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoginProfileRequestMarshaller().marshall(super.beforeMarshalling(deleteLoginProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Uploads an SSH public key and associates it with the specified IAM
     * user.
     * </p>
     * <p>
     * The SSH public key uploaded by this action can be used only for
     * authenticating the associated IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate
     * to an AWS CodeCommit repository, see
     * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
     * in the <i>AWS CodeCommit User Guide</i> .
     * </p>
     *
     * @param uploadSSHPublicKeyRequest Container for the necessary
     *           parameters to execute the UploadSSHPublicKey service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the UploadSSHPublicKey service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws UnrecognizedPublicKeyEncodingException
     * @throws InvalidPublicKeyException
     * @throws DuplicateSSHPublicKeyException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UploadSSHPublicKeyResult uploadSSHPublicKey(UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadSSHPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadSSHPublicKeyRequest> request = null;
        Response<UploadSSHPublicKeyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadSSHPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(uploadSSHPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UploadSSHPublicKeyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Simulate the set of IAM policies attached to an IAM entity against a
     * list of API actions and AWS resources to determine the policies'
     * effective permissions. The entity can be an IAM user, group, or role.
     * If you specify a user, then the simulation also includes all of the
     * policies attached to groups that the user is a member of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies
     * specified as strings to include in the simulation. If you want to
     * simulate only policies specified as strings, use SimulateCustomPolicy
     * instead.
     * </p>
     * <p>
     * The simulation does not perform the API actions, it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * actions.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions
     * granted to other users. If you do not want users to see other user's
     * permissions, then consider allowing them to use SimulateCustomPolicy
     * instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM
     * policy. To get the list of context keys required by the policies to
     * simulate them correctly, use GetContextKeysForPrincipalPolicy.
     * </p>
     * <p>
     * If the output is long, you can paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     *
     * @param simulatePrincipalPolicyRequest Container for the necessary
     *           parameters to execute the SimulatePrincipalPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the SimulatePrincipalPolicy service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws PolicyEvaluationException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SimulatePrincipalPolicyResult simulatePrincipalPolicy(SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(simulatePrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SimulatePrincipalPolicyRequest> request = null;
        Response<SimulatePrincipalPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SimulatePrincipalPolicyRequestMarshaller().marshall(super.beforeMarshalling(simulatePrincipalPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SimulatePrincipalPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Attaches the specified managed policy to the specified user.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a user. To embed an
     * inline policy in a user, use PutUserPolicy.
     * </p>
     * <p>
     * For more information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param attachUserPolicyRequest Container for the necessary parameters
     *           to execute the AttachUserPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachUserPolicy(AttachUserPolicyRequest attachUserPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachUserPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachUserPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachUserPolicyRequestMarshaller().marshall(super.beforeMarshalling(attachUserPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Retrieves information about the specified server certificate.
     * </p>
     *
     * @param getServerCertificateRequest Container for the necessary
     *           parameters to execute the GetServerCertificate service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetServerCertificate service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetServerCertificateResult getServerCertificate(GetServerCertificateRequest getServerCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(getServerCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServerCertificateRequest> request = null;
        Response<GetServerCertificateResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServerCertificateRequestMarshaller().marshall(super.beforeMarshalling(getServerCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetServerCertificateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Attaches the specified managed policy to the specified group.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a group. To embed an
     * inline policy in a group, use PutGroupPolicy.
     * </p>
     * <p>
     * For more information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param attachGroupPolicyRequest Container for the necessary parameters
     *           to execute the AttachGroupPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachGroupPolicy(AttachGroupPolicyRequest attachGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachGroupPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(attachGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version.
     * </p>
     * <p>
     * This action affects all users, groups, and roles that the policy is
     * attached to. To list the users, groups, and roles that the policy is
     * attached to, use the ListEntitiesForPolicy API.
     * </p>
     * <p>
     * For information about managed policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param setDefaultPolicyVersionRequest Container for the necessary
     *           parameters to execute the SetDefaultPolicyVersion service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(setDefaultPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetDefaultPolicyVersionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultPolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(setDefaultPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the names of the inline policies embedded in the specified
     * user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To list the
     * managed policies that are attached to a user, use
     * ListAttachedUserPolicies. For more information about policies, refer
     * to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies
     * embedded with the specified user, the action returns an empty list.
     * </p>
     *
     * @param listUserPoliciesRequest Container for the necessary parameters
     *           to execute the ListUserPolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListUserPolicies service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest listUserPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listUserPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserPoliciesRequest> request = null;
        Response<ListUserPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listUserPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListUserPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves information about when the specified access key was last
     * used. The information includes the date and time of last use, along
     * with the AWS service and region that were specified in the last
     * request made with that key.
     * </p>
     *
     * @param getAccessKeyLastUsedRequest Container for the necessary
     *           parameters to execute the GetAccessKeyLastUsed service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetAccessKeyLastUsed service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccessKeyLastUsedResult getAccessKeyLastUsed(GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccessKeyLastUsedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccessKeyLastUsedRequest> request = null;
        Response<GetAccessKeyLastUsedResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccessKeyLastUsedRequestMarshaller().marshall(super.beforeMarshalling(getAccessKeyLastUsedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetAccessKeyLastUsedResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the groups the specified user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listGroupsForUserRequest Container for the necessary parameters
     *           to execute the ListGroupsForUser service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListGroupsForUser service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest listGroupsForUserRequest) {
        ExecutionContext executionContext = createExecutionContext(listGroupsForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsForUserRequest> request = null;
        Response<ListGroupsForUserResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsForUserRequestMarshaller().marshall(super.beforeMarshalling(listGroupsForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListGroupsForUserResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new version of the specified managed policy. To update a
     * managed policy, you create a new policy version. A managed policy can
     * have up to five versions. If the policy has five versions, you must
     * delete an existing version using DeletePolicyVersion before you create
     * a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default
     * version. The default version is the operative version; that is, the
     * version that is in effect for the IAM users, groups, and roles that
     * the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"> Versioning for Managed Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param createPolicyVersionRequest Container for the necessary
     *           parameters to execute the CreatePolicyVersion service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the CreatePolicyVersion service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyVersionRequest> request = null;
        Response<CreatePolicyVersionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyVersionRequestMarshaller().marshall(super.beforeMarshalling(createPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreatePolicyVersionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Adds the specified role to the specified instance profile. For more
     * information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> . For more information about instance profiles, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     *
     * @param addRoleToInstanceProfileRequest Container for the necessary
     *           parameters to execute the AddRoleToInstanceProfile service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addRoleToInstanceProfile(AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest) {
        ExecutionContext executionContext = createExecutionContext(addRoleToInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AddRoleToInstanceProfileRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddRoleToInstanceProfileRequestMarshaller().marshall(super.beforeMarshalling(addRoleToInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in
     * the specified group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a group, use GetPolicy to
     * determine the policy's default version, then use GetPolicyVersion to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param getGroupPolicyRequest Container for the necessary parameters to
     *           execute the GetGroupPolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetGroupPolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest getGroupPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getGroupPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupPolicyRequest> request = null;
        Response<GetGroupPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupPolicyRequestMarshaller().marshall(super.beforeMarshalling(getGroupPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetGroupPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded with
     * the specified role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a role, use GetPolicy to
     * determine the policy's default version, then use GetPolicyVersion to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * For more information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"> Using Roles to Delegate Permissions and Federate Identities </a>
     * .
     * </p>
     *
     * @param getRolePolicyRequest Container for the necessary parameters to
     *           execute the GetRolePolicy service method on AmazonIdentityManagement.
     * 
     * @return The response from the GetRolePolicy service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetRolePolicyResult getRolePolicy(GetRolePolicyRequest getRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRolePolicyRequest> request = null;
        Response<GetRolePolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(getRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetRolePolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the instance profiles that have the specified associated role.
     * If there are none, the action returns an empty list. For more
     * information about instance profiles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listInstanceProfilesForRoleRequest Container for the necessary
     *           parameters to execute the ListInstanceProfilesForRole service method
     *           on AmazonIdentityManagement.
     * 
     * @return The response from the ListInstanceProfilesForRole service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstanceProfilesForRoleResult listInstanceProfilesForRole(ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(listInstanceProfilesForRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceProfilesForRoleRequest> request = null;
        Response<ListInstanceProfilesForRoleResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceProfilesForRoleRequestMarshaller().marshall(super.beforeMarshalling(listInstanceProfilesForRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListInstanceProfilesForRoleResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To detach a
     * managed policy from a role, use DetachRolePolicy. For more information
     * about policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     *
     * @param deleteRolePolicyRequest Container for the necessary parameters
     *           to execute the DeleteRolePolicy service method on
     *           AmazonIdentityManagement.
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRolePolicy(DeleteRolePolicyRequest deleteRolePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRolePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteRolePolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRolePolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteRolePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Lists the virtual MFA devices under the AWS account by assignment
     * status. If you do not specify an assignment status, the action returns
     * a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code> , <code>Unassigned</code> , or <code>Any</code>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listVirtualMFADevicesRequest Container for the necessary
     *           parameters to execute the ListVirtualMFADevices service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListVirtualMFADevices service method, as
     *         returned by AmazonIdentityManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVirtualMFADevicesResult listVirtualMFADevices(ListVirtualMFADevicesRequest listVirtualMFADevicesRequest) {
        ExecutionContext executionContext = createExecutionContext(listVirtualMFADevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualMFADevicesRequest> request = null;
        Response<ListVirtualMFADevicesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualMFADevicesRequestMarshaller().marshall(super.beforeMarshalling(listVirtualMFADevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListVirtualMFADevicesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the
     * specified group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To list the
     * managed policies that are attached to a group, use
     * ListAttachedGroupPolicies. For more information about policies, refer
     * to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies
     * embedded with the specified group, the action returns an empty list.
     * </p>
     *
     * @param listGroupPoliciesRequest Container for the necessary parameters
     *           to execute the ListGroupPolicies service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the ListGroupPolicies service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest listGroupPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listGroupPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupPoliciesRequest> request = null;
        Response<ListGroupPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listGroupPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListGroupPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the roles that have the specified path prefix. If there are
     * none, the action returns an empty list. For more information about
     * roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     *
     * @param listRolesRequest Container for the necessary parameters to
     *           execute the ListRoles service method on AmazonIdentityManagement.
     * 
     * @return The response from the ListRoles service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListRolesResult listRoles(ListRolesRequest listRolesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRolesRequest> request = null;
        Response<ListRolesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRolesRequestMarshaller().marshall(super.beforeMarshalling(listRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListRolesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more
     * information about using a password policy, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"> Managing an IAM Password Policy </a>
     * .
     * </p>
     *
     * @param getAccountPasswordPolicyRequest Container for the necessary
     *           parameters to execute the GetAccountPasswordPolicy service method on
     *           AmazonIdentityManagement.
     * 
     * @return The response from the GetAccountPasswordPolicy service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy(GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getAccountPasswordPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountPasswordPolicyRequest> request = null;
        Response<GetAccountPasswordPolicyResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountPasswordPolicyRequestMarshaller().marshall(super.beforeMarshalling(getAccountPasswordPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new GetAccountPasswordPolicyResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists the groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListGroups service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGroupsResult listGroups() throws AmazonServiceException, AmazonClientException {
        return listGroups(new ListGroupsRequest());
    }
    
    /**
     * <p>
     * Returns information about the SSH public keys associated with the
     * specified IAM user. If there are none, the action returns an empty
     * list.
     * </p>
     * <p>
     * The SSH public keys returned by this action are used only for
     * authenticating the IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see
     * <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"> Set up AWS CodeCommit for SSH Connections </a>
     * in the <i>AWS CodeCommit User Guide</i> .
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can
     * still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListSSHPublicKeys service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSSHPublicKeysResult listSSHPublicKeys() throws AmazonServiceException, AmazonClientException {
        return listSSHPublicKeys(new ListSSHPublicKeysRequest());
    }
    
    /**
     * <p>
     * Lists the SAML providers in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation requires Signature Version 4.
     * </p>
     * 
     * @return The response from the ListSAMLProviders service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSAMLProvidersResult listSAMLProviders() throws AmazonServiceException, AmazonClientException {
        return listSAMLProviders(new ListSAMLProvidersRequest());
    }
    
    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path
     * prefix is specified, the action returns all users in the AWS account.
     * If there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListUsers service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListUsersResult listUsers() throws AmazonServiceException, AmazonClientException {
        return listUsers(new ListUsersRequest());
    }
    
    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more
     * information about the credential report, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"> Getting Credential Reports </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * 
     * @return The response from the GetCredentialReport service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws CredentialReportNotPresentException
     * @throws CredentialReportNotReadyException
     * @throws CredentialReportExpiredException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCredentialReportResult getCredentialReport() throws AmazonServiceException, AmazonClientException {
        return getCredentialReport(new GetCredentialReportRequest());
    }
    
    /**
     * <p>
     * Deletes the password policy for the AWS account.
     * </p>
     * 
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAccountPasswordPolicy() throws AmazonServiceException, AmazonClientException {
        deleteAccountPasswordPolicy(new DeleteAccountPasswordPolicyRequest());
    }
    
    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key
     * ID for the specified user. The default status for new keys is
     * <code>Active</code> .
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use
     * this action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create,
     * see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> To ensure the security of your AWS account, the
     * secret access key is accessible only during key and user creation. You
     * must save the key (for example, in a text file) if you want to be able
     * to access it again. If a secret key is lost, you can delete the access
     * keys for the associated user and then create new keys.
     * </p>
     * 
     * @return The response from the CreateAccessKey service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAccessKeyResult createAccessKey() throws AmazonServiceException, AmazonClientException {
        return createAccessKey(new CreateAccessKeyRequest());
    }
    
    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID used to sign the request.
     * </p>
     * 
     * @return The response from the GetUser service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetUserResult getUser() throws AmazonServiceException, AmazonClientException {
        return getUser(new GetUserRequest());
    }
    
    /**
     * <p>
     * Lists the MFA devices. If the request includes the user name, then
     * this action lists all the MFA devices associated with the specified
     * user name. If you do not specify a user name, IAM determines the user
     * name implicitly based on the AWS access key ID signing the request.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListMFADevices service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListMFADevicesResult listMFADevices() throws AmazonServiceException, AmazonClientException {
        return listMFADevices(new ListMFADevicesRequest());
    }
    
    /**
     * <p>
     * Lists the account aliases associated with the account. For
     * information about using an AWS account alias, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"> Using an Alias for Your AWS Account ID </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListAccountAliases service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAccountAliasesResult listAccountAliases() throws AmazonServiceException, AmazonClientException {
        return listAccountAliases(new ListAccountAliasesRequest());
    }
    
    /**
     * <p>
     * Returns information about the signing certificates associated with
     * the specified user. If there are none, the action returns an empty
     * list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing
     * certificates, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     * 
     * @return The response from the ListSigningCertificates service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSigningCertificatesResult listSigningCertificates() throws AmazonServiceException, AmazonClientException {
        return listSigningCertificates(new ListSigningCertificatesRequest());
    }
    
    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and
     * policies in your account, including their relationships to one
     * another. Use this API to obtain a snapshot of the configuration of IAM
     * permissions (users, groups, roles, and policies) in your account.
     * </p>
     * <p>
     * You can optionally filter the results using the <code>Filter</code>
     * parameter. You can paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the GetAccountAuthorizationDetails service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails() throws AmazonServiceException, AmazonClientException {
        return getAccountAuthorizationDetails(new GetAccountAuthorizationDetailsRequest());
    }
    
    /**
     * <p>
     * Returns information about the access key IDs associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can
     * still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if
     * the AWS account has no associated users.
     * </p>
     * <p>
     * <b>NOTE:</b>To ensure the security of your AWS account, the secret
     * access key is accessible only during key and user creation.
     * </p>
     * 
     * @return The response from the ListAccessKeys service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAccessKeysResult listAccessKeys() throws AmazonServiceException, AmazonClientException {
        return listAccessKeys(new ListAccessKeysRequest());
    }
    
    /**
     * <p>
     * Lists information about the OpenID Connect providers in the AWS
     * account.
     * </p>
     * 
     * @return The response from the ListOpenIDConnectProviders service
     *         method, as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders() throws AmazonServiceException, AmazonClientException {
        return listOpenIDConnectProviders(new ListOpenIDConnectProvidersRequest());
    }
    
    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the
     * AWS account.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"> Limitations on IAM Entities </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * 
     * @return The response from the GetAccountSummary service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccountSummaryResult getAccountSummary() throws AmazonServiceException, AmazonClientException {
        return getAccountSummary(new GetAccountSummaryRequest());
    }
    
    /**
     * <p>
     * Lists the server certificates that have the specified path prefix. If
     * none exist, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListServerCertificates service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListServerCertificatesResult listServerCertificates() throws AmazonServiceException, AmazonClientException {
        return listServerCertificates(new ListServerCertificatesRequest());
    }
    
    /**
     * <p>
     * Lists all the managed policies that are available to your account,
     * including your own customer managed policies and all AWS managed
     * policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the
     * optional <code>OnlyAttached</code> , <code>Scope</code> , and
     * <code>PathPrefix</code> parameters. For example, to list only the
     * customer managed policies in your AWS account, set <code>Scope</code>
     * to <code>Local</code> . To list only AWS managed policies, set
     * <code>Scope</code> to <code>AWS</code> .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, refer to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * 
     * @return The response from the ListPolicies service method, as returned
     *         by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPoliciesResult listPolicies() throws AmazonServiceException, AmazonClientException {
        return listPolicies(new ListPoliciesRequest());
    }
    
    /**
     * <p>
     * Generates a credential report for the AWS account. For more
     * information about the credential report, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"> Getting Credential Reports </a>
     * in the <i>IAM User Guide</i> .
     * </p>
     * 
     * @return The response from the GenerateCredentialReport service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GenerateCredentialReportResult generateCredentialReport() throws AmazonServiceException, AmazonClientException {
        return generateCredentialReport(new GenerateCredentialReportRequest());
    }
    
    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If
     * there are none, the action returns an empty list. For more information
     * about instance profiles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance Profiles </a>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListInstanceProfiles service method, as
     *         returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstanceProfilesResult listInstanceProfiles() throws AmazonServiceException, AmazonClientException {
        return listInstanceProfiles(new ListInstanceProfilesRequest());
    }
    
    /**
     * <p>
     * Lists the virtual MFA devices under the AWS account by assignment
     * status. If you do not specify an assignment status, the action returns
     * a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code> , <code>Unassigned</code> , or <code>Any</code>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListVirtualMFADevices service method, as
     *         returned by AmazonIdentityManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVirtualMFADevicesResult listVirtualMFADevices() throws AmazonServiceException, AmazonClientException {
        return listVirtualMFADevices(new ListVirtualMFADevicesRequest());
    }
    
    /**
     * <p>
     * Lists the roles that have the specified path prefix. If there are
     * none, the action returns an empty list. For more information about
     * roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a>
     * .
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @return The response from the ListRoles service method, as returned by
     *         AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListRolesResult listRoles() throws AmazonServiceException, AmazonClientException {
        return listRoles(new ListRolesRequest());
    }
    
    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more
     * information about using a password policy, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"> Managing an IAM Password Policy </a>
     * .
     * </p>
     * 
     * @return The response from the GetAccountPasswordPolicy service method,
     *         as returned by AmazonIdentityManagement.
     * 
     * @throws ServiceFailureException
     * @throws NoSuchEntityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonIdentityManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy() throws AmazonServiceException, AmazonClientException {
        return getAccountPasswordPolicy(new GetAccountPasswordPolicyRequest());
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        