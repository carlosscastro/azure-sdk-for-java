/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base class for a backup policy. Workload-specific backup policies are
 * derived from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("ProtectionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureIaasVM", value = AzureIaaSVMProtectionPolicy.class),
    @JsonSubTypes.Type(name = "MAB", value = MabProtectionPolicy.class),
    @JsonSubTypes.Type(name = "AzureSql", value = AzureSqlProtectionPolicy.class)
})
public class ProtectionPolicyInner {
    /**
     * The number of items associated with this policy.
     */
    @JsonProperty(value = "protectedItemsCount")
    private Integer protectedItemsCount;

    /**
     * Get the number of items associated with this policy.
     *
     * @return the protectedItemsCount value
     */
    public Integer protectedItemsCount() {
        return this.protectedItemsCount;
    }

    /**
     * Set the number of items associated with this policy.
     *
     * @param protectedItemsCount the protectedItemsCount value to set
     * @return the ProtectionPolicyInner object itself.
     */
    public ProtectionPolicyInner withProtectedItemsCount(Integer protectedItemsCount) {
        this.protectedItemsCount = protectedItemsCount;
        return this;
    }

}
