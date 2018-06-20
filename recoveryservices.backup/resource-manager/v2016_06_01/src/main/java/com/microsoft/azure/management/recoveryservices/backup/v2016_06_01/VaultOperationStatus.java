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

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.OperationStatusInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.RecoveryServicesManager;
import org.joda.time.DateTime;

/**
 * Type representing VaultOperationStatus.
 */
public interface VaultOperationStatus extends HasInner<OperationStatusInner>, Indexable, Refreshable<VaultOperationStatus>, HasManager<RecoveryServicesManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    OperationStatusError error();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    OperationStatusExtendedInfo properties();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    OperationStatusValues status();

}
