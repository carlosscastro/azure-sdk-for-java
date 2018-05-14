/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OutputErrorPolicy.
 */
public final class OutputErrorPolicy extends ExpandableStringEnum<OutputErrorPolicy> {
    /** Static value Stop for OutputErrorPolicy. */
    public static final OutputErrorPolicy STOP = fromString("Stop");

    /** Static value Drop for OutputErrorPolicy. */
    public static final OutputErrorPolicy DROP = fromString("Drop");

    /**
     * Creates or finds a OutputErrorPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding OutputErrorPolicy
     */
    @JsonCreator
    public static OutputErrorPolicy fromString(String name) {
        return fromString(name, OutputErrorPolicy.class);
    }

    /**
     * @return known OutputErrorPolicy values
     */
    public static Collection<OutputErrorPolicy> values() {
        return values(OutputErrorPolicy.class);
    }
}
