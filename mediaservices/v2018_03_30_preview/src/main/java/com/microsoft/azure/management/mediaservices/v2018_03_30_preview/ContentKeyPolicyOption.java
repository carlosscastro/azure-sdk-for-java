/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a policy option.
 */
public class ContentKeyPolicyOption {
    /**
     * The legacy Policy Option ID.
     */
    @JsonProperty(value = "policyOptionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID policyOptionId;

    /**
     * The Policy Option description.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The key delivery configuration.
     */
    @JsonProperty(value = "configuration", required = true)
    private ContentKeyPolicyConfiguration configuration;

    /**
     * The requirements that must be met to deliver keys with this
     * configuration.
     */
    @JsonProperty(value = "restriction", required = true)
    private ContentKeyPolicyRestriction restriction;

    /**
     * Get the policyOptionId value.
     *
     * @return the policyOptionId value
     */
    public UUID policyOptionId() {
        return this.policyOptionId;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ContentKeyPolicyOption object itself.
     */
    public ContentKeyPolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the configuration value.
     *
     * @return the configuration value
     */
    public ContentKeyPolicyConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration value.
     *
     * @param configuration the configuration value to set
     * @return the ContentKeyPolicyOption object itself.
     */
    public ContentKeyPolicyOption withConfiguration(ContentKeyPolicyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the restriction value.
     *
     * @return the restriction value
     */
    public ContentKeyPolicyRestriction restriction() {
        return this.restriction;
    }

    /**
     * Set the restriction value.
     *
     * @param restriction the restriction value to set
     * @return the ContentKeyPolicyOption object itself.
     */
    public ContentKeyPolicyOption withRestriction(ContentKeyPolicyRestriction restriction) {
        this.restriction = restriction;
        return this;
    }

}
