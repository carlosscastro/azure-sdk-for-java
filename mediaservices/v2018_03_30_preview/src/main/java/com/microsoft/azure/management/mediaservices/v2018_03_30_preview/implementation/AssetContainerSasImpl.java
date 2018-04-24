/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.AssetContainerSas;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class AssetContainerSasImpl extends WrapperImpl<AssetContainerSasInner> implements AssetContainerSas {
    private final MediaManager manager;
    AssetContainerSasImpl(AssetContainerSasInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public List<String> assetContainerSasUrls() {
        return this.inner().assetContainerSasUrls();
    }

}
