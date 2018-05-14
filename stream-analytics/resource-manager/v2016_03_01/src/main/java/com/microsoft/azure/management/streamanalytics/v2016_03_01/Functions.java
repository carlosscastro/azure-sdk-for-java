/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.FunctionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Functions.
 */
public interface Functions extends SupportsCreating<Function.DefinitionStages.Blank>, HasInner<FunctionsInner> {

    /**
     * Lists all of the functions under the specified streaming job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Function> listByStreamingjobAsync(final String resourceGroupName, final String jobName);

    /**
     * Gets details about the specified function.
    *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param functionName The name of the function.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Function> getByStreamingjobAsync(String resourceGroupName, String jobName, String functionName);

    /**
     * Deletes a function from the streaming job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param functionName The name of the function.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByStreamingjobAsync(String resourceGroupName, String jobName, String functionName);
    /**
     * Tests if the information provided for a function is valid. This can range from testing the connection to the underlying web service behind the function or making sure the function code provided is syntactically correct.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param functionName The name of the function.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceTestStatus> testAsync(String resourceGroupName, String jobName, String functionName);

    /**
     * Retrieves the default definition of a function based on the parameters specified.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param functionName The name of the function.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Function> retrieveDefaultDefinitionAsync(String resourceGroupName, String jobName, String functionName);

}
