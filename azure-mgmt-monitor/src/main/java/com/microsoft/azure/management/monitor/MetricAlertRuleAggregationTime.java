/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricAlertRuleAggregationTime.
 */
public final class MetricAlertRuleAggregationTime extends ExpandableStringEnum<MetricAlertRuleAggregationTime> {
    /** Static value Average for MetricAlertRuleAggregationTime. */
    public static final MetricAlertRuleAggregationTime AVERAGE = fromString("Average");

    /** Static value Minimum for MetricAlertRuleAggregationTime. */
    public static final MetricAlertRuleAggregationTime MINIMUM = fromString("Minimum");

    /** Static value Maximum for MetricAlertRuleAggregationTime. */
    public static final MetricAlertRuleAggregationTime MAXIMUM = fromString("Maximum");

    /** Static value Total for MetricAlertRuleAggregationTime. */
    public static final MetricAlertRuleAggregationTime TOTAL = fromString("Total");

    /**
     * Creates or finds a MetricAlertRuleAggregationTime from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricAlertRuleAggregationTime
     */
    @JsonCreator
    public static MetricAlertRuleAggregationTime fromString(String name) {
        return fromString(name, MetricAlertRuleAggregationTime.class);
    }

    /**
     * @return known MetricAlertRuleAggregationTime values
     */
    public static Collection<MetricAlertRuleAggregationTime> values() {
        return values(MetricAlertRuleAggregationTime.class);
    }
}
