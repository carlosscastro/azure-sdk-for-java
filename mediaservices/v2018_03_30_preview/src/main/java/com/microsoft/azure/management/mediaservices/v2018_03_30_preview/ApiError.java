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
 * The API error.
 */
public class ApiError {
    /**
     * ApiError.
     * The error properties.
     */
    @JsonProperty(value = "error")
    private ODataError error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ODataError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ApiError object itself.
     */
    public ApiError withError(ODataError error) {
        this.error = error;
        return this;
    }

}
