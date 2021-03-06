/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ApplicationGatewaySslPolicyName.
 */
public final class ApplicationGatewaySslPolicyName {
    /** Static value AppGwSslPolicy20150501 for ApplicationGatewaySslPolicyName. */
    public static final ApplicationGatewaySslPolicyName APP_GW_SSL_POLICY20150501 = new ApplicationGatewaySslPolicyName("AppGwSslPolicy20150501");

    /** Static value AppGwSslPolicy20170401 for ApplicationGatewaySslPolicyName. */
    public static final ApplicationGatewaySslPolicyName APP_GW_SSL_POLICY20170401 = new ApplicationGatewaySslPolicyName("AppGwSslPolicy20170401");

    /** Static value AppGwSslPolicy20170401S for ApplicationGatewaySslPolicyName. */
    public static final ApplicationGatewaySslPolicyName APP_GW_SSL_POLICY20170401S = new ApplicationGatewaySslPolicyName("AppGwSslPolicy20170401S");

    private String value;

    /**
     * Creates a custom value for ApplicationGatewaySslPolicyName.
     * @param value the custom value
     */
    public ApplicationGatewaySslPolicyName(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ApplicationGatewaySslPolicyName)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ApplicationGatewaySslPolicyName rhs = (ApplicationGatewaySslPolicyName) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
