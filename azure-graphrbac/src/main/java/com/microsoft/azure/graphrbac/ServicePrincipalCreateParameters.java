/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.graphrbac.implementation.KeyCredentialInner;
import com.microsoft.azure.graphrbac.implementation.PasswordCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for creating a new service principal.
 */
public class ServicePrincipalCreateParameters {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * application Id.
     */
    @JsonProperty(value = "appId", required = true)
    private String appId;

    /**
     * Whether the account is enabled.
     */
    @JsonProperty(value = "accountEnabled", required = true)
    private boolean accountEnabled;

    /**
     * A collection of KeyCredential objects.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /**
     * A collection of PasswordCredential objects.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the ServicePrincipalCreateParameters object itself.
     */
    public ServicePrincipalCreateParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get application Id.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set application Id.
     *
     * @param appId the appId value to set
     * @return the ServicePrincipalCreateParameters object itself.
     */
    public ServicePrincipalCreateParameters withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get whether the account is enabled.
     *
     * @return the accountEnabled value
     */
    public boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set whether the account is enabled.
     *
     * @param accountEnabled the accountEnabled value to set
     * @return the ServicePrincipalCreateParameters object itself.
     */
    public ServicePrincipalCreateParameters withAccountEnabled(boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get a collection of KeyCredential objects.
     *
     * @return the keyCredentials value
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set a collection of KeyCredential objects.
     *
     * @param keyCredentials the keyCredentials value to set
     * @return the ServicePrincipalCreateParameters object itself.
     */
    public ServicePrincipalCreateParameters withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get a collection of PasswordCredential objects.
     *
     * @return the passwordCredentials value
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set a collection of PasswordCredential objects.
     *
     * @param passwordCredentials the passwordCredentials value to set
     * @return the ServicePrincipalCreateParameters object itself.
     */
    public ServicePrincipalCreateParameters withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

}