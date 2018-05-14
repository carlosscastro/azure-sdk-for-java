/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SslEnforcementEnum.
 */
public enum SslEnforcementEnum {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a SslEnforcementEnum instance. */
    private String value;

    SslEnforcementEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SslEnforcementEnum instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SslEnforcementEnum object, or null if unable to parse.
     */
    @JsonCreator
    public static SslEnforcementEnum fromString(String value) {
        SslEnforcementEnum[] items = SslEnforcementEnum.values();
        for (SslEnforcementEnum item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
