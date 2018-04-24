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
 * Represents a token restriction. Provided token must match these requirements
 * for successful license or key delivery.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyTokenRestriction")
public class ContentKeyPolicyTokenRestriction extends ContentKeyPolicyRestriction {
    /**
     * The token issuer.
     */
    @JsonProperty(value = "issuer", required = true)
    private String issuer;

    /**
     * The audience for the token.
     */
    @JsonProperty(value = "audience", required = true)
    private String audience;

    /**
     * The primary verification key.
     */
    @JsonProperty(value = "primaryVerificationKey", required = true)
    private ContentKeyPolicyRestrictionTokenKey primaryVerificationKey;

    /**
     * A list of alternative verification keys.
     */
    @JsonProperty(value = "alternateVerificationKeys")
    private List<ContentKeyPolicyRestrictionTokenKey> alternateVerificationKeys;

    /**
     * A list of required token claims.
     */
    @JsonProperty(value = "requiredClaims")
    private List<ContentKeyPolicyTokenClaim> requiredClaims;

    /**
     * The type of token. Possible values include: 'Unknown', 'Swt', 'Jwt'.
     */
    @JsonProperty(value = "restrictionTokenType", required = true)
    private ContentKeyPolicyRestrictionTokenType restrictionTokenType;

    /**
     * The OpenID connect discovery document.
     */
    @JsonProperty(value = "openIdConnectDiscoveryDocument")
    private String openIdConnectDiscoveryDocument;

    /**
     * Get the issuer value.
     *
     * @return the issuer value
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer value.
     *
     * @param issuer the issuer value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the audience value.
     *
     * @return the audience value
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience value.
     *
     * @param audience the audience value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Get the primaryVerificationKey value.
     *
     * @return the primaryVerificationKey value
     */
    public ContentKeyPolicyRestrictionTokenKey primaryVerificationKey() {
        return this.primaryVerificationKey;
    }

    /**
     * Set the primaryVerificationKey value.
     *
     * @param primaryVerificationKey the primaryVerificationKey value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withPrimaryVerificationKey(ContentKeyPolicyRestrictionTokenKey primaryVerificationKey) {
        this.primaryVerificationKey = primaryVerificationKey;
        return this;
    }

    /**
     * Get the alternateVerificationKeys value.
     *
     * @return the alternateVerificationKeys value
     */
    public List<ContentKeyPolicyRestrictionTokenKey> alternateVerificationKeys() {
        return this.alternateVerificationKeys;
    }

    /**
     * Set the alternateVerificationKeys value.
     *
     * @param alternateVerificationKeys the alternateVerificationKeys value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withAlternateVerificationKeys(List<ContentKeyPolicyRestrictionTokenKey> alternateVerificationKeys) {
        this.alternateVerificationKeys = alternateVerificationKeys;
        return this;
    }

    /**
     * Get the requiredClaims value.
     *
     * @return the requiredClaims value
     */
    public List<ContentKeyPolicyTokenClaim> requiredClaims() {
        return this.requiredClaims;
    }

    /**
     * Set the requiredClaims value.
     *
     * @param requiredClaims the requiredClaims value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withRequiredClaims(List<ContentKeyPolicyTokenClaim> requiredClaims) {
        this.requiredClaims = requiredClaims;
        return this;
    }

    /**
     * Get the restrictionTokenType value.
     *
     * @return the restrictionTokenType value
     */
    public ContentKeyPolicyRestrictionTokenType restrictionTokenType() {
        return this.restrictionTokenType;
    }

    /**
     * Set the restrictionTokenType value.
     *
     * @param restrictionTokenType the restrictionTokenType value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withRestrictionTokenType(ContentKeyPolicyRestrictionTokenType restrictionTokenType) {
        this.restrictionTokenType = restrictionTokenType;
        return this;
    }

    /**
     * Get the openIdConnectDiscoveryDocument value.
     *
     * @return the openIdConnectDiscoveryDocument value
     */
    public String openIdConnectDiscoveryDocument() {
        return this.openIdConnectDiscoveryDocument;
    }

    /**
     * Set the openIdConnectDiscoveryDocument value.
     *
     * @param openIdConnectDiscoveryDocument the openIdConnectDiscoveryDocument value to set
     * @return the ContentKeyPolicyTokenRestriction object itself.
     */
    public ContentKeyPolicyTokenRestriction withOpenIdConnectDiscoveryDocument(String openIdConnectDiscoveryDocument) {
        this.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
        return this;
    }

}
