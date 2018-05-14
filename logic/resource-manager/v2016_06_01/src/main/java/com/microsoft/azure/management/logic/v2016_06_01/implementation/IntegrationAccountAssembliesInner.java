/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IntegrationAccountAssemblies.
 */
public class IntegrationAccountAssembliesInner {
    /** The Retrofit service to perform REST calls. */
    private IntegrationAccountAssembliesService service;
    /** The service client containing this operation class. */
    private LogicManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationAccountAssembliesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntegrationAccountAssembliesInner(Retrofit retrofit, LogicManagementClientImpl client) {
        this.service = retrofit.create(IntegrationAccountAssembliesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntegrationAccountAssemblies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntegrationAccountAssembliesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountAssemblies list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/integrationAccounts/{integrationAccountName}/assemblies")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("integrationAccountName") String integrationAccountName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountAssemblies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/integrationAccounts/{integrationAccountName}/assemblies/{assemblyArtifactName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("integrationAccountName") String integrationAccountName, @Path("assemblyArtifactName") String assemblyArtifactName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountAssemblies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/integrationAccounts/{integrationAccountName}/assemblies/{assemblyArtifactName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("integrationAccountName") String integrationAccountName, @Path("assemblyArtifactName") String assemblyArtifactName, @Body AssemblyDefinitionInner assemblyArtifact, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountAssemblies delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/integrationAccounts/{integrationAccountName}/assemblies/{assemblyArtifactName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("integrationAccountName") String integrationAccountName, @Path("assemblyArtifactName") String assemblyArtifactName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountAssemblies listContentCallbackUrl" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/integrationAccounts/{integrationAccountName}/assemblies/{assemblyArtifactName}/listContentCallbackUrl")
        Observable<Response<ResponseBody>> listContentCallbackUrl(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("integrationAccountName") String integrationAccountName, @Path("assemblyArtifactName") String assemblyArtifactName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;AssemblyDefinitionInner&gt; object if successful.
     */
    public List<AssemblyDefinitionInner> list(String resourceGroupName, String integrationAccountName) {
        return listWithServiceResponseAsync(resourceGroupName, integrationAccountName).toBlocking().single().body();
    }

    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AssemblyDefinitionInner>> listAsync(String resourceGroupName, String integrationAccountName, final ServiceCallback<List<AssemblyDefinitionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, integrationAccountName), serviceCallback);
    }

    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AssemblyDefinitionInner&gt; object
     */
    public Observable<List<AssemblyDefinitionInner>> listAsync(String resourceGroupName, String integrationAccountName) {
        return listWithServiceResponseAsync(resourceGroupName, integrationAccountName).map(new Func1<ServiceResponse<List<AssemblyDefinitionInner>>, List<AssemblyDefinitionInner>>() {
            @Override
            public List<AssemblyDefinitionInner> call(ServiceResponse<List<AssemblyDefinitionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List the assemblies for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AssemblyDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<List<AssemblyDefinitionInner>>> listWithServiceResponseAsync(String resourceGroupName, String integrationAccountName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (integrationAccountName == null) {
            throw new IllegalArgumentException("Parameter integrationAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, integrationAccountName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<AssemblyDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<AssemblyDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl2<AssemblyDefinitionInner>> result = listDelegate(response);
                        List<AssemblyDefinitionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<AssemblyDefinitionInner>> clientResponse = new ServiceResponse<List<AssemblyDefinitionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl2<AssemblyDefinitionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl2<AssemblyDefinitionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl2<AssemblyDefinitionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AssemblyDefinitionInner object if successful.
     */
    public AssemblyDefinitionInner get(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        return getWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).toBlocking().single().body();
    }

    /**
     * Get an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AssemblyDefinitionInner> getAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, final ServiceCallback<AssemblyDefinitionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName), serviceCallback);
    }

    /**
     * Get an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AssemblyDefinitionInner object
     */
    public Observable<AssemblyDefinitionInner> getAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        return getWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).map(new Func1<ServiceResponse<AssemblyDefinitionInner>, AssemblyDefinitionInner>() {
            @Override
            public AssemblyDefinitionInner call(ServiceResponse<AssemblyDefinitionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AssemblyDefinitionInner object
     */
    public Observable<ServiceResponse<AssemblyDefinitionInner>> getWithServiceResponseAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (integrationAccountName == null) {
            throw new IllegalArgumentException("Parameter integrationAccountName is required and cannot be null.");
        }
        if (assemblyArtifactName == null) {
            throw new IllegalArgumentException("Parameter assemblyArtifactName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, integrationAccountName, assemblyArtifactName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AssemblyDefinitionInner>>>() {
                @Override
                public Observable<ServiceResponse<AssemblyDefinitionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AssemblyDefinitionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AssemblyDefinitionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AssemblyDefinitionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AssemblyDefinitionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param assemblyArtifact The assembly artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AssemblyDefinitionInner object if successful.
     */
    public AssemblyDefinitionInner createOrUpdate(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, AssemblyDefinitionInner assemblyArtifact) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName, assemblyArtifact).toBlocking().single().body();
    }

    /**
     * Create or update an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param assemblyArtifact The assembly artifact.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AssemblyDefinitionInner> createOrUpdateAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, AssemblyDefinitionInner assemblyArtifact, final ServiceCallback<AssemblyDefinitionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName, assemblyArtifact), serviceCallback);
    }

    /**
     * Create or update an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param assemblyArtifact The assembly artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AssemblyDefinitionInner object
     */
    public Observable<AssemblyDefinitionInner> createOrUpdateAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, AssemblyDefinitionInner assemblyArtifact) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName, assemblyArtifact).map(new Func1<ServiceResponse<AssemblyDefinitionInner>, AssemblyDefinitionInner>() {
            @Override
            public AssemblyDefinitionInner call(ServiceResponse<AssemblyDefinitionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param assemblyArtifact The assembly artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AssemblyDefinitionInner object
     */
    public Observable<ServiceResponse<AssemblyDefinitionInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, AssemblyDefinitionInner assemblyArtifact) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (integrationAccountName == null) {
            throw new IllegalArgumentException("Parameter integrationAccountName is required and cannot be null.");
        }
        if (assemblyArtifactName == null) {
            throw new IllegalArgumentException("Parameter assemblyArtifactName is required and cannot be null.");
        }
        if (assemblyArtifact == null) {
            throw new IllegalArgumentException("Parameter assemblyArtifact is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(assemblyArtifact);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, integrationAccountName, assemblyArtifactName, assemblyArtifact, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AssemblyDefinitionInner>>>() {
                @Override
                public Observable<ServiceResponse<AssemblyDefinitionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AssemblyDefinitionInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AssemblyDefinitionInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AssemblyDefinitionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AssemblyDefinitionInner>() { }.getType())
                .register(201, new TypeToken<AssemblyDefinitionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        deleteWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).toBlocking().single().body();
    }

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName), serviceCallback);
    }

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        return deleteWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete an assembly for an integration account.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (integrationAccountName == null) {
            throw new IllegalArgumentException("Parameter integrationAccountName is required and cannot be null.");
        }
        if (assemblyArtifactName == null) {
            throw new IllegalArgumentException("Parameter assemblyArtifactName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, integrationAccountName, assemblyArtifactName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkflowTriggerCallbackUrlInner object if successful.
     */
    public WorkflowTriggerCallbackUrlInner listContentCallbackUrl(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        return listContentCallbackUrlWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).toBlocking().single().body();
    }

    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkflowTriggerCallbackUrlInner> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName, final ServiceCallback<WorkflowTriggerCallbackUrlInner> serviceCallback) {
        return ServiceFuture.fromResponse(listContentCallbackUrlWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName), serviceCallback);
    }

    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowTriggerCallbackUrlInner object
     */
    public Observable<WorkflowTriggerCallbackUrlInner> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        return listContentCallbackUrlWithServiceResponseAsync(resourceGroupName, integrationAccountName, assemblyArtifactName).map(new Func1<ServiceResponse<WorkflowTriggerCallbackUrlInner>, WorkflowTriggerCallbackUrlInner>() {
            @Override
            public WorkflowTriggerCallbackUrlInner call(ServiceResponse<WorkflowTriggerCallbackUrlInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the content callback url for an integration account assembly.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param assemblyArtifactName The assembly artifact name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowTriggerCallbackUrlInner object
     */
    public Observable<ServiceResponse<WorkflowTriggerCallbackUrlInner>> listContentCallbackUrlWithServiceResponseAsync(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (integrationAccountName == null) {
            throw new IllegalArgumentException("Parameter integrationAccountName is required and cannot be null.");
        }
        if (assemblyArtifactName == null) {
            throw new IllegalArgumentException("Parameter assemblyArtifactName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listContentCallbackUrl(this.client.subscriptionId(), resourceGroupName, integrationAccountName, assemblyArtifactName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkflowTriggerCallbackUrlInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkflowTriggerCallbackUrlInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkflowTriggerCallbackUrlInner> clientResponse = listContentCallbackUrlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkflowTriggerCallbackUrlInner> listContentCallbackUrlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkflowTriggerCallbackUrlInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkflowTriggerCallbackUrlInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
