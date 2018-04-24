/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * scale units definition.
 */
public class StreamingEntityScaleUnit {
    /**
     * ScaleUnit.
     * The scale unit number of the StreamingEndpoint.
     */
    @JsonProperty(value = "scaleUnit")
    private Integer scaleUnit;

    /**
     * Get the scaleUnit value.
     *
     * @return the scaleUnit value
     */
    public Integer scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set the scaleUnit value.
     *
     * @param scaleUnit the scaleUnit value to set
     * @return the StreamingEntityScaleUnit object itself.
     */
    public StreamingEntityScaleUnit withScaleUnit(Integer scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

}
