/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.Configurations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.ClusterQuotaConfigurationProperties;

class ConfigurationsImpl extends WrapperImpl<ConfigurationsInner> implements Configurations {
    private final EventHubManager manager;

    ConfigurationsImpl(EventHubManager manager) {
        super(manager.inner().configurations());
        this.manager = manager;
    }

    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ClusterQuotaConfigurationProperties> patchAsync(String resourceGroupName, String clusterName) {
        ConfigurationsInner client = this.inner();
        return client.patchAsync(resourceGroupName, clusterName)
        .map(new Func1<ClusterQuotaConfigurationPropertiesInner, ClusterQuotaConfigurationProperties>() {
            @Override
            public ClusterQuotaConfigurationProperties call(ClusterQuotaConfigurationPropertiesInner inner) {
                return new ClusterQuotaConfigurationPropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ClusterQuotaConfigurationProperties> getAsync(String resourceGroupName, String clusterName) {
        ConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName)
        .map(new Func1<ClusterQuotaConfigurationPropertiesInner, ClusterQuotaConfigurationProperties>() {
            @Override
            public ClusterQuotaConfigurationProperties call(ClusterQuotaConfigurationPropertiesInner inner) {
                return new ClusterQuotaConfigurationPropertiesImpl(inner, manager());
            }
        });
    }

}
