/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * Resource provider information.
 */
public class Provider {
    /**
     * Gets or sets the provider id.
     */
    private String id;

    /**
     * Gets or sets the namespace of the provider.
     */
    private String namespace;

    /**
     * Gets or sets the registration state of the provider.
     */
    private String registrationState;

    /**
     * Gets or sets the collection of provider resource types.
     */
    private List<ProviderResourceType> resourceTypes;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the namespace value.
     *
     * @return the namespace value
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Set the namespace value.
     *
     * @param namespace the namespace value to set
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * Get the registrationState value.
     *
     * @return the registrationState value
     */
    public String getRegistrationState() {
        return this.registrationState;
    }

    /**
     * Set the registrationState value.
     *
     * @param registrationState the registrationState value to set
     */
    public void setRegistrationState(String registrationState) {
        this.registrationState = registrationState;
    }

    /**
     * Get the resourceTypes value.
     *
     * @return the resourceTypes value
     */
    public List<ProviderResourceType> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes value.
     *
     * @param resourceTypes the resourceTypes value to set
     */
    public void setResourceTypes(List<ProviderResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

}