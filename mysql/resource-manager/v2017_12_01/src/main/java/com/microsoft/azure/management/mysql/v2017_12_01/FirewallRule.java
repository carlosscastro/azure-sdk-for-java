/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.FirewallRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.MySQLManager;

/**
 * Type representing FirewallRule.
 */
public interface FirewallRule extends HasInner<FirewallRuleInner>, Indexable, Refreshable<FirewallRule>, Updatable<FirewallRule.Update>, HasManager<MySQLManager> {
    /**
     * @return the endIpAddress value.
     */
    String endIpAddress();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startIpAddress value.
     */
    String startIpAddress();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FirewallRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithEndIpAddress, DefinitionStages.WithStartIpAddress, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FirewallRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FirewallRule definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the firewallrule definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithEndIpAddress withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the firewallrule definition allowing to specify EndIpAddress.
         */
        interface WithEndIpAddress {
           /**
            * Specifies endIpAddress.
            */
            WithStartIpAddress withEndIpAddress(String endIpAddress);
        }

        /**
         * The stage of the firewallrule definition allowing to specify StartIpAddress.
         */
        interface WithStartIpAddress {
           /**
            * Specifies startIpAddress.
            */
            WithCreate withStartIpAddress(String startIpAddress);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FirewallRule> {
        }
    }
    /**
     * The template for a FirewallRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FirewallRule> {
    }

    /**
     * Grouping of FirewallRule update stages.
     */
    interface UpdateStages {
    }
}
