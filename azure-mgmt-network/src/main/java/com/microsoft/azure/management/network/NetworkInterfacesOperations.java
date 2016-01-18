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

import com.microsoft.azure.management.network.models.NetworkInterface;
import com.microsoft.azure.management.network.models.PageImpl;
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
 * in NetworkInterfacesOperations.
 */
public interface NetworkInterfacesOperations {
    /**
     * The interface defining all the services for NetworkInterfacesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkInterfacesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("networkInterfaceName") String networkInterfaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("networkInterfaceName") String networkInterfaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("networkInterfaceName") String networkInterfaceName, @Path("subscriptionId") String subscriptionId, @Body NetworkInterface parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.Compute/virtualMachineScaleSets/{virtualMachineScaleSetName}/virtualMachines/{virtualmachineIndex}/networkInterfaces")
        Call<ResponseBody> listVirtualMachineScaleSetVMNetworkInterfaces(@Path("resourceGroupName") String resourceGroupName, @Path("virtualMachineScaleSetName") String virtualMachineScaleSetName, @Path("virtualmachineIndex") String virtualmachineIndex, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.Compute/virtualMachineScaleSets/{virtualMachineScaleSetName}/networkInterfaces")
        Call<ResponseBody> listVirtualMachineScaleSetNetworkInterfaces(@Path("resourceGroupName") String resourceGroupName, @Path("virtualMachineScaleSetName") String virtualMachineScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.Compute/virtualMachineScaleSets/{virtualMachineScaleSetName}/virtualMachines/{virtualmachineIndex}/networkInterfaces/{networkInterfaceName}")
        Call<ResponseBody> getVirtualMachineScaleSetNetworkInterface(@Path("resourceGroupName") String resourceGroupName, @Path("virtualMachineScaleSetName") String virtualMachineScaleSetName, @Path("virtualmachineIndex") String virtualmachineIndex, @Path("networkInterfaceName") String networkInterfaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/networkInterfaces")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listVirtualMachineScaleSetVMNetworkInterfacesNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listVirtualMachineScaleSetNetworkInterfacesNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The delete netwokInterface operation deletes the specified netwokInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String networkInterfaceName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete netwokInterface operation deletes the specified netwokInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String networkInterfaceName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get ntework interface operation retreives information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkInterface object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<NetworkInterface> get(String resourceGroupName, String networkInterfaceName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String networkInterfaceName, String expand, final ServiceCallback<NetworkInterface> serviceCallback);

    /**
     * The Put NetworkInterface operation creates/updates a networkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create/update NetworkInterface operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the NetworkInterface object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<NetworkInterface> createOrUpdate(String resourceGroupName, String networkInterfaceName, NetworkInterface parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put NetworkInterface operation creates/updates a networkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create/update NetworkInterface operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String networkInterfaceName, NetworkInterface parameters, final ServiceCallback<NetworkInterface> serviceCallback);

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listVirtualMachineScaleSetVMNetworkInterfaces(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listVirtualMachineScaleSetVMNetworkInterfacesAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listVirtualMachineScaleSetNetworkInterfaces(String resourceGroupName, String virtualMachineScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listVirtualMachineScaleSetNetworkInterfacesAsync(String resourceGroupName, String virtualMachineScaleSetName, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The Get ntework interface operation retreives information about the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkInterface object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<NetworkInterface> getVirtualMachineScaleSetNetworkInterface(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getVirtualMachineScaleSetNetworkInterfaceAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String expand, final ServiceCallback<NetworkInterface> serviceCallback);

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> list(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listVirtualMachineScaleSetVMNetworkInterfacesNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listVirtualMachineScaleSetVMNetworkInterfacesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listVirtualMachineScaleSetNetworkInterfacesNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listVirtualMachineScaleSetNetworkInterfacesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listAllNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;NetworkInterface&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<NetworkInterface>> serviceCallback);

}
