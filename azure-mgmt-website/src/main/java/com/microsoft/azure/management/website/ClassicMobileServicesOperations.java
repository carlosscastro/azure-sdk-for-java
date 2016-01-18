/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.management.website.models.ClassicMobileService;
import com.microsoft.azure.management.website.models.ClassicMobileServiceCollection;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in ClassicMobileServicesOperations.
 */
public interface ClassicMobileServicesOperations {
    /**
     * The interface defining all the services for ClassicMobileServicesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ClassicMobileServicesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/classicMobileServices")
        Call<ResponseBody> getClassicMobileServices(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/classicMobileServices/{name}")
        Call<ResponseBody> getClassicMobileService(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/classicMobileServices/{name}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteClassicMobileService(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get all mobile services in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ClassicMobileServiceCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ClassicMobileServiceCollection> getClassicMobileServices(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all mobile services in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getClassicMobileServicesAsync(String resourceGroupName, final ServiceCallback<ClassicMobileServiceCollection> serviceCallback);

    /**
     * Get a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ClassicMobileService object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ClassicMobileService> getClassicMobileService(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getClassicMobileServiceAsync(String resourceGroupName, String name, final ServiceCallback<ClassicMobileService> serviceCallback);

    /**
     * Delete a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> deleteClassicMobileService(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a mobile service.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of mobile service
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteClassicMobileServiceAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback);

}
