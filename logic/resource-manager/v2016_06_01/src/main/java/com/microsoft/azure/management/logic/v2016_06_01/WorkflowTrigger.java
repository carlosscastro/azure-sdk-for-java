/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowTriggerInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import org.joda.time.DateTime;

/**
 * Type representing WorkflowTrigger.
 */
public interface WorkflowTrigger extends HasInner<WorkflowTriggerInner>, Indexable, Refreshable<WorkflowTrigger>, HasManager<LogicManager> {
    /**
     * @return the changedTime value.
     */
    DateTime changedTime();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastExecutionTime value.
     */
    DateTime lastExecutionTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextExecutionTime value.
     */
    DateTime nextExecutionTime();

    /**
     * @return the provisioningState value.
     */
    WorkflowTriggerProvisioningState provisioningState();

    /**
     * @return the recurrence value.
     */
    WorkflowTriggerRecurrence recurrence();

    /**
     * @return the state value.
     */
    WorkflowState state();

    /**
     * @return the status value.
     */
    WorkflowStatus status();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the workflow value.
     */
    ResourceReference workflow();

}
