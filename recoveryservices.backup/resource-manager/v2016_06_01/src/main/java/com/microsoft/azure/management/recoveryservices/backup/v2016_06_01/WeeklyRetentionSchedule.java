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

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Weekly retention schedule.
 */
public class WeeklyRetentionSchedule {
    /**
     * List of the days of the week for the weekly retention policy.
     */
    @JsonProperty(value = "daysOfTheWeek")
    private List<DayOfWeek> daysOfTheWeek;

    /**
     * Retention times of the retention policy.
     */
    @JsonProperty(value = "retentionTimes")
    private List<DateTime> retentionTimes;

    /**
     * Retention duration of retention policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /**
     * Get list of the days of the week for the weekly retention policy.
     *
     * @return the daysOfTheWeek value
     */
    public List<DayOfWeek> daysOfTheWeek() {
        return this.daysOfTheWeek;
    }

    /**
     * Set list of the days of the week for the weekly retention policy.
     *
     * @param daysOfTheWeek the daysOfTheWeek value to set
     * @return the WeeklyRetentionSchedule object itself.
     */
    public WeeklyRetentionSchedule withDaysOfTheWeek(List<DayOfWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
        return this;
    }

    /**
     * Get retention times of the retention policy.
     *
     * @return the retentionTimes value
     */
    public List<DateTime> retentionTimes() {
        return this.retentionTimes;
    }

    /**
     * Set retention times of the retention policy.
     *
     * @param retentionTimes the retentionTimes value to set
     * @return the WeeklyRetentionSchedule object itself.
     */
    public WeeklyRetentionSchedule withRetentionTimes(List<DateTime> retentionTimes) {
        this.retentionTimes = retentionTimes;
        return this;
    }

    /**
     * Get retention duration of retention policy.
     *
     * @return the retentionDuration value
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set retention duration of retention policy.
     *
     * @param retentionDuration the retentionDuration value to set
     * @return the WeeklyRetentionSchedule object itself.
     */
    public WeeklyRetentionSchedule withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

}
