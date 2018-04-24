/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.LiveOutputsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LiveOutputs.
 */
public interface LiveOutputs extends SupportsCreating<LiveOutput.DefinitionStages.Blank>, HasInner<LiveOutputsInner> {

    /**
     * List Live Outputs.
     * Lists the Live Outputs in the Live Event.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the Live Event.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LiveOutput> listByLiveEventAsync(final String resourceGroupName, final String accountName, final String liveEventName);

    /**
     * Get Live Output.
     * Gets a Live Output.
    *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the Live Event.
     * @param liveOutputName The name of the Live Output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LiveOutput> getByLiveEventAsync(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * Delete Live Output.
     * Deletes a Live Output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the Live Event.
     * @param liveOutputName The name of the Live Output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByLiveEventAsync(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);
}
