/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The description of an X509 CA Certificate.
 */
public class CertificateProperties {
    /**
     * The certificate's subject name.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /**
     * The certificate's expiration date and time.
     */
    @JsonProperty(value = "expiry", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 expiry;

    /**
     * The certificate's thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Determines whether certificate has been verified.
     */
    @JsonProperty(value = "isVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isVerified;

    /**
     * The certificate's create date and time.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 created;

    /**
     * The certificate's last update date and time.
     */
    @JsonProperty(value = "updated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 updated;

    /**
     * Get the subject value.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expiry value.
     *
     * @return the expiry value
     */
    public DateTime expiry() {
        if (this.expiry == null) {
            return null;
        }
        return this.expiry.dateTime();
    }

    /**
     * Get the thumbprint value.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the isVerified value.
     *
     * @return the isVerified value
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        if (this.created == null) {
            return null;
        }
        return this.created.dateTime();
    }

    /**
     * Get the updated value.
     *
     * @return the updated value
     */
    public DateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return this.updated.dateTime();
    }

}
