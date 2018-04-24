/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the properties for producing a series of PNG images from the input
 * video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.PngImage")
public class PngImage extends Image {
    /**
     * A collection of output PNG image layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<PngLayer> layers;

    /**
     * Get the layers value.
     *
     * @return the layers value
     */
    public List<PngLayer> layers() {
        return this.layers;
    }

    /**
     * Set the layers value.
     *
     * @param layers the layers value to set
     * @return the PngImage object itself.
     */
    public PngImage withLayers(List<PngLayer> layers) {
        this.layers = layers;
        return this;
    }

}
