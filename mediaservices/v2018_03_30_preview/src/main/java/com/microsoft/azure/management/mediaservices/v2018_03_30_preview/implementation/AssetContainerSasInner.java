/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Asset Storage container SAS URLs.
 */
public class AssetContainerSasInner {
    /**
     * The list of Asset container SAS URLs.
     */
    @JsonProperty(value = "assetContainerSasUrls")
    private List<String> assetContainerSasUrls;

    /**
     * Get the assetContainerSasUrls value.
     *
     * @return the assetContainerSasUrls value
     */
    public List<String> assetContainerSasUrls() {
        return this.assetContainerSasUrls;
    }

    /**
     * Set the assetContainerSasUrls value.
     *
     * @param assetContainerSasUrls the assetContainerSasUrls value to set
     * @return the AssetContainerSasInner object itself.
     */
    public AssetContainerSasInner withAssetContainerSasUrls(List<String> assetContainerSasUrls) {
        this.assetContainerSasUrls = assetContainerSasUrls;
        return this;
    }

}
