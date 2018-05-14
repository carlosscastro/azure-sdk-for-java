/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the StreamAnalyticsManagementClientImpl class.
 */
public class StreamAnalyticsManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** GUID which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets GUID which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets GUID which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public StreamAnalyticsManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public StreamAnalyticsManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public StreamAnalyticsManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public StreamAnalyticsManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The StreamingJobsInner object to access its operations.
     */
    private StreamingJobsInner streamingJobs;

    /**
     * Gets the StreamingJobsInner object to access its operations.
     * @return the StreamingJobsInner object.
     */
    public StreamingJobsInner streamingJobs() {
        return this.streamingJobs;
    }

    /**
     * The InputsInner object to access its operations.
     */
    private InputsInner inputs;

    /**
     * Gets the InputsInner object to access its operations.
     * @return the InputsInner object.
     */
    public InputsInner inputs() {
        return this.inputs;
    }

    /**
     * The OutputsInner object to access its operations.
     */
    private OutputsInner outputs;

    /**
     * Gets the OutputsInner object to access its operations.
     * @return the OutputsInner object.
     */
    public OutputsInner outputs() {
        return this.outputs;
    }

    /**
     * The TransformationsInner object to access its operations.
     */
    private TransformationsInner transformations;

    /**
     * Gets the TransformationsInner object to access its operations.
     * @return the TransformationsInner object.
     */
    public TransformationsInner transformations() {
        return this.transformations;
    }

    /**
     * The FunctionsInner object to access its operations.
     */
    private FunctionsInner functions;

    /**
     * Gets the FunctionsInner object to access its operations.
     * @return the FunctionsInner object.
     */
    public FunctionsInner functions() {
        return this.functions;
    }

    /**
     * The SubscriptionsInner object to access its operations.
     */
    private SubscriptionsInner subscriptions;

    /**
     * Gets the SubscriptionsInner object to access its operations.
     * @return the SubscriptionsInner object.
     */
    public SubscriptionsInner subscriptions() {
        return this.subscriptions;
    }

    /**
     * Initializes an instance of StreamAnalyticsManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public StreamAnalyticsManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of StreamAnalyticsManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public StreamAnalyticsManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of StreamAnalyticsManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public StreamAnalyticsManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-03-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.streamingJobs = new StreamingJobsInner(restClient().retrofit(), this);
        this.inputs = new InputsInner(restClient().retrofit(), this);
        this.outputs = new OutputsInner(restClient().retrofit(), this);
        this.transformations = new TransformationsInner(restClient().retrofit(), this);
        this.functions = new FunctionsInner(restClient().retrofit(), this);
        this.subscriptions = new SubscriptionsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "StreamAnalyticsManagementClient", "2016-03-01");
    }
}
