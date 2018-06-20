/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProtectionPolicies.
 */
public class ProtectionPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectionPoliciesService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectionPoliciesInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectionPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectionPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectionPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionPolicies get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionPolicies createOrUpdate" })
        @PUT("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Query("api-version") String apiVersion, @Body ProtectionPolicyResourceInner resourceProtectionPolicy, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionPolicies delete" })
        @HTTP(path = "Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionPolicies list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the details of the backup policy associated with the Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy name used in this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectionPolicyResourceInner object if successful.
     */
    public ProtectionPolicyResourceInner get(String vaultName, String resourceGroupName, String policyName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName).toBlocking().single().body();
    }

    /**
     * Gets the details of the backup policy associated with the Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy name used in this GET operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectionPolicyResourceInner> getAsync(String vaultName, String resourceGroupName, String policyName, final ServiceCallback<ProtectionPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, policyName), serviceCallback);
    }

    /**
     * Gets the details of the backup policy associated with the Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy name used in this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ProtectionPolicyResourceInner> getAsync(String vaultName, String resourceGroupName, String policyName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName).map(new Func1<ServiceResponse<ProtectionPolicyResourceInner>, ProtectionPolicyResourceInner>() {
            @Override
            public ProtectionPolicyResourceInner call(ServiceResponse<ProtectionPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details of the backup policy associated with the Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy name used in this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ServiceResponse<ProtectionPolicyResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectionPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectionPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectionPolicyResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectionPolicyResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectionPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectionPolicyResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy to be created.
     * @param resourceProtectionPolicy The resource backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectionPolicyResourceInner object if successful.
     */
    public ProtectionPolicyResourceInner createOrUpdate(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner resourceProtectionPolicy) {
        return createOrUpdateWithServiceResponseAsync(vaultName, resourceGroupName, policyName, resourceProtectionPolicy).toBlocking().single().body();
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy to be created.
     * @param resourceProtectionPolicy The resource backup policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectionPolicyResourceInner> createOrUpdateAsync(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner resourceProtectionPolicy, final ServiceCallback<ProtectionPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(vaultName, resourceGroupName, policyName, resourceProtectionPolicy), serviceCallback);
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy to be created.
     * @param resourceProtectionPolicy The resource backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ProtectionPolicyResourceInner> createOrUpdateAsync(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner resourceProtectionPolicy) {
        return createOrUpdateWithServiceResponseAsync(vaultName, resourceGroupName, policyName, resourceProtectionPolicy).map(new Func1<ServiceResponse<ProtectionPolicyResourceInner>, ProtectionPolicyResourceInner>() {
            @Override
            public ProtectionPolicyResourceInner call(ServiceResponse<ProtectionPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The backup policy to be created.
     * @param resourceProtectionPolicy The resource backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ServiceResponse<ProtectionPolicyResourceInner>> createOrUpdateWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner resourceProtectionPolicy) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (resourceProtectionPolicy == null) {
            throw new IllegalArgumentException("Parameter resourceProtectionPolicy is required and cannot be null.");
        }
        Validator.validate(resourceProtectionPolicy);
        return service.createOrUpdate(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, this.client.apiVersion(), resourceProtectionPolicy, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectionPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectionPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectionPolicyResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectionPolicyResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectionPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectionPolicyResourceInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes the specified backup policy from your Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The name of the backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String vaultName, String resourceGroupName, String policyName) {
        deleteWithServiceResponseAsync(vaultName, resourceGroupName, policyName).toBlocking().single().body();
    }

    /**
     * Deletes the specified backup policy from your Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The name of the backup policy to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String vaultName, String resourceGroupName, String policyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(vaultName, resourceGroupName, policyName), serviceCallback);
    }

    /**
     * Deletes the specified backup policy from your Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The name of the backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String vaultName, String resourceGroupName, String policyName) {
        return deleteWithServiceResponseAsync(vaultName, resourceGroupName, policyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified backup policy from your Recovery Services vault. This is an asynchronous operation. Use the GetPolicyOperationResult API to Get the operation status.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param policyName The name of the backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ProtectionPolicyResourceInner&gt; object if successful.
     */
    public List<ProtectionPolicyResourceInner> list(String vaultName, String resourceGroupName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName).toBlocking().single().body();
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectionPolicyResourceInner>> listAsync(String vaultName, String resourceGroupName, final ServiceCallback<List<ProtectionPolicyResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(vaultName, resourceGroupName), serviceCallback);
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProtectionPolicyResourceInner&gt; object
     */
    public Observable<List<ProtectionPolicyResourceInner>> listAsync(String vaultName, String resourceGroupName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName).map(new Func1<ServiceResponse<List<ProtectionPolicyResourceInner>>, List<ProtectionPolicyResourceInner>>() {
            @Override
            public List<ProtectionPolicyResourceInner> call(ServiceResponse<List<ProtectionPolicyResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProtectionPolicyResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<ProtectionPolicyResourceInner>>> listWithServiceResponseAsync(String vaultName, String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ProtectionPolicyResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ProtectionPolicyResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectionPolicyResourceInner>> result = listDelegate(response);
                        List<ProtectionPolicyResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ProtectionPolicyResourceInner>> clientResponse = new ServiceResponse<List<ProtectionPolicyResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param filter The following equation can be used to filter the list of backup policies. backupManagementType eq {AzureIaasVM, MAB, DPM, AzureBackupServer, AzureSql}.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ProtectionPolicyResourceInner&gt; object if successful.
     */
    public List<ProtectionPolicyResourceInner> list(String vaultName, String resourceGroupName, String filter) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, filter).toBlocking().single().body();
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param filter The following equation can be used to filter the list of backup policies. backupManagementType eq {AzureIaasVM, MAB, DPM, AzureBackupServer, AzureSql}.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectionPolicyResourceInner>> listAsync(String vaultName, String resourceGroupName, String filter, final ServiceCallback<List<ProtectionPolicyResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(vaultName, resourceGroupName, filter), serviceCallback);
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param filter The following equation can be used to filter the list of backup policies. backupManagementType eq {AzureIaasVM, MAB, DPM, AzureBackupServer, AzureSql}.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProtectionPolicyResourceInner&gt; object
     */
    public Observable<List<ProtectionPolicyResourceInner>> listAsync(String vaultName, String resourceGroupName, String filter) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, filter).map(new Func1<ServiceResponse<List<ProtectionPolicyResourceInner>>, List<ProtectionPolicyResourceInner>>() {
            @Override
            public List<ProtectionPolicyResourceInner> call(ServiceResponse<List<ProtectionPolicyResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the backup policies associated with the Recovery Services vault. The API provides parameters to Get scoped results.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param filter The following equation can be used to filter the list of backup policies. backupManagementType eq {AzureIaasVM, MAB, DPM, AzureBackupServer, AzureSql}.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProtectionPolicyResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<ProtectionPolicyResourceInner>>> listWithServiceResponseAsync(String vaultName, String resourceGroupName, String filter) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ProtectionPolicyResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ProtectionPolicyResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectionPolicyResourceInner>> result = listDelegate(response);
                        List<ProtectionPolicyResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ProtectionPolicyResourceInner>> clientResponse = new ServiceResponse<List<ProtectionPolicyResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProtectionPolicyResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProtectionPolicyResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProtectionPolicyResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
