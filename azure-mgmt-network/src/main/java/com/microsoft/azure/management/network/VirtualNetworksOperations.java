/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.VirtualNetwork;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworksOperations.
 */
public interface VirtualNetworksOperations {
    /**
     * The interface defining all the services for VirtualNetworksOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualNetworksService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworks/{virtualNetworkName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkName") String virtualNetworkName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworks/{virtualNetworkName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkName") String virtualNetworkName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworks/{virtualNetworkName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("virtualNetworkName") String virtualNetworkName, @Path("subscriptionId") String subscriptionId, @Body VirtualNetwork parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/virtualnetworks")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualnetworks")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The Delete VirtualNetwork operation deletes the specifed virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete VirtualNetwork operation deletes the specifed virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String virtualNetworkName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetwork object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualNetwork> get(String resourceGroupName, String virtualNetworkName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String virtualNetworkName, String expand, final ServiceCallback<VirtualNetwork> serviceCallback);

    /**
     * The Put VirtualNetwork operation creates/updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Parameters supplied to the create/update Virtual Network operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetwork object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualNetwork> createOrUpdate(String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetwork operation creates/updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Parameters supplied to the create/update Virtual Network operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters, final ServiceCallback<VirtualNetwork> serviceCallback);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetwork&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualNetwork>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<VirtualNetwork>> serviceCallback);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetwork&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualNetwork>> list(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<VirtualNetwork>> serviceCallback);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetwork&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualNetwork>> listAllNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualNetwork>> serviceCallback);

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetwork&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualNetwork>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualNetwork>> serviceCallback);

}
