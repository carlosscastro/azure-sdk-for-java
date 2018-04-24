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
 * Class to specify which protocols are enabled.
 */
public class EnabledProtocols {
    /**
     * Enable Download protocol or not.
     */
    @JsonProperty(value = "download", required = true)
    private boolean download;

    /**
     * Enable Dash protocol or not.
     */
    @JsonProperty(value = "dash", required = true)
    private boolean dash;

    /**
     * Enable Hls protocol or not.
     */
    @JsonProperty(value = "hls", required = true)
    private boolean hls;

    /**
     * Enable SmoothStreaming protocol or not.
     */
    @JsonProperty(value = "smoothStreaming", required = true)
    private boolean smoothStreaming;

    /**
     * Get the download value.
     *
     * @return the download value
     */
    public boolean download() {
        return this.download;
    }

    /**
     * Set the download value.
     *
     * @param download the download value to set
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withDownload(boolean download) {
        this.download = download;
        return this;
    }

    /**
     * Get the dash value.
     *
     * @return the dash value
     */
    public boolean dash() {
        return this.dash;
    }

    /**
     * Set the dash value.
     *
     * @param dash the dash value to set
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withDash(boolean dash) {
        this.dash = dash;
        return this;
    }

    /**
     * Get the hls value.
     *
     * @return the hls value
     */
    public boolean hls() {
        return this.hls;
    }

    /**
     * Set the hls value.
     *
     * @param hls the hls value to set
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withHls(boolean hls) {
        this.hls = hls;
        return this;
    }

    /**
     * Get the smoothStreaming value.
     *
     * @return the smoothStreaming value
     */
    public boolean smoothStreaming() {
        return this.smoothStreaming;
    }

    /**
     * Set the smoothStreaming value.
     *
     * @param smoothStreaming the smoothStreaming value to set
     * @return the EnabledProtocols object itself.
     */
    public EnabledProtocols withSmoothStreaming(boolean smoothStreaming) {
        this.smoothStreaming = smoothStreaming;
        return this;
    }

}
