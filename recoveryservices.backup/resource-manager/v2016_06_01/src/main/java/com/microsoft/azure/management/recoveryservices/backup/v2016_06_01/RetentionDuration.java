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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Retention duration.
 */
public class RetentionDuration {
    /**
     * Count of the duration types. Retention duration is determined by the
     * combining the Count times and durationType.
     * For example, if Count = 3 and durationType = Weeks, then the retention
     * duration is three weeks.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * The retention duration type of the retention policy. Possible values
     * include: 'Invalid', 'Days', 'Weeks', 'Months', 'Years'.
     */
    @JsonProperty(value = "durationType")
    private RetentionDurationType durationType;

    /**
     * Get count of the duration types. Retention duration is determined by the combining the Count times and durationType.
        For example, if Count = 3 and durationType = Weeks, then the retention duration is three weeks.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set count of the duration types. Retention duration is determined by the combining the Count times and durationType.
        For example, if Count = 3 and durationType = Weeks, then the retention duration is three weeks.
     *
     * @param count the count value to set
     * @return the RetentionDuration object itself.
     */
    public RetentionDuration withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the retention duration type of the retention policy. Possible values include: 'Invalid', 'Days', 'Weeks', 'Months', 'Years'.
     *
     * @return the durationType value
     */
    public RetentionDurationType durationType() {
        return this.durationType;
    }

    /**
     * Set the retention duration type of the retention policy. Possible values include: 'Invalid', 'Days', 'Weeks', 'Months', 'Years'.
     *
     * @param durationType the durationType value to set
     * @return the RetentionDuration object itself.
     */
    public RetentionDuration withDurationType(RetentionDurationType durationType) {
        this.durationType = durationType;
        return this;
    }

}
