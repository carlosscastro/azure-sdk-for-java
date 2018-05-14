/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IotHubResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Skus.
 */
public interface Skus extends HasInner<IotHubResourcesInner> {

    /**
     * Get the list of valid SKUs for an IoT hub.
     * Get the list of valid SKUs for an IoT hub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IotHubSkuDescription> listByIotHubAsync(final String resourceGroupName, final String resourceName);
}
