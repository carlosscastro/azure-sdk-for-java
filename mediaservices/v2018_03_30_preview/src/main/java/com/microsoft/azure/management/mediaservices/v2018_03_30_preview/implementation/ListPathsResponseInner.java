/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.StreamingPath;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class of response for listPaths action.
 */
public class ListPathsResponseInner {
    /**
     * Streaming Paths supported by current Streaming Locator.
     */
    @JsonProperty(value = "streamingPaths")
    private List<StreamingPath> streamingPaths;

    /**
     * Download Paths supported by current Streaming Locator.
     */
    @JsonProperty(value = "downloadPaths")
    private List<String> downloadPaths;

    /**
     * Get the streamingPaths value.
     *
     * @return the streamingPaths value
     */
    public List<StreamingPath> streamingPaths() {
        return this.streamingPaths;
    }

    /**
     * Set the streamingPaths value.
     *
     * @param streamingPaths the streamingPaths value to set
     * @return the ListPathsResponseInner object itself.
     */
    public ListPathsResponseInner withStreamingPaths(List<StreamingPath> streamingPaths) {
        this.streamingPaths = streamingPaths;
        return this;
    }

    /**
     * Get the downloadPaths value.
     *
     * @return the downloadPaths value
     */
    public List<String> downloadPaths() {
        return this.downloadPaths;
    }

    /**
     * Set the downloadPaths value.
     *
     * @param downloadPaths the downloadPaths value to set
     * @return the ListPathsResponseInner object itself.
     */
    public ListPathsResponseInner withDownloadPaths(List<String> downloadPaths) {
        this.downloadPaths = downloadPaths;
        return this;
    }

}
