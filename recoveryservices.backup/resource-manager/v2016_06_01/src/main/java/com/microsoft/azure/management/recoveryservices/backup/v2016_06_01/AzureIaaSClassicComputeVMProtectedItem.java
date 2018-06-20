/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IaaS VM workload-specific backup item representing the classic VM.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("Microsoft.ClassicCompute/virtualMachines")
public class AzureIaaSClassicComputeVMProtectedItem extends AzureIaaSVMProtectedItem {
}
