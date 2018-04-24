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
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Represents input files for a Job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.JobInputClip")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputAsset", value = JobInputAsset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputHttp", value = JobInputHttp.class)
})
public class JobInputClip extends JobInput {
    /**
     * List of files. Required for JobInputHttp.
     */
    @JsonProperty(value = "files")
    private List<String> files;

    /**
     * Get the files value.
     *
     * @return the files value
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set the files value.
     *
     * @param files the files value to set
     * @return the JobInputClip object itself.
     */
    public JobInputClip withFiles(List<String> files) {
        this.files = files;
        return this;
    }

}
