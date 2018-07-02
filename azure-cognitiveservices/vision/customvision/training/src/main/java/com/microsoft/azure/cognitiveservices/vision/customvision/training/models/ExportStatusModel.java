/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExportStatusModel.
 */
public final class ExportStatusModel extends ExpandableStringEnum<ExportStatusModel> {
    /** Static value Exporting for ExportStatusModel. */
    public static final ExportStatusModel EXPORTING = fromString("Exporting");

    /** Static value Failed for ExportStatusModel. */
    public static final ExportStatusModel FAILED = fromString("Failed");

    /** Static value Done for ExportStatusModel. */
    public static final ExportStatusModel DONE = fromString("Done");

    /**
     * Creates or finds a ExportStatusModel from its string representation.
     * @param name a name to look for
     * @return the corresponding ExportStatusModel
     */
    @JsonCreator
    public static ExportStatusModel fromString(String name) {
        return fromString(name, ExportStatusModel.class);
    }

    /**
     * @return known ExportStatusModel values
     */
    public static Collection<ExportStatusModel> values() {
        return values(ExportStatusModel.class);
    }
}
