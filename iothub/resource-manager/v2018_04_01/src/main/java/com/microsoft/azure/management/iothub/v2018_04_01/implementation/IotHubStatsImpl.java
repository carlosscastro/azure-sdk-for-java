/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubStats;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.RegistryStatistics;

class IotHubStatsImpl extends WrapperImpl<IotHubResourcesInner> implements IotHubStats {
    private final IoTHubManager manager;

    IotHubStatsImpl(IoTHubManager manager) {
        super(manager.inner().iotHubResources());
        this.manager = manager;
    }

    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RegistryStatistics> getStatsAsync(String resourceGroupName, String resourceName) {
        IotHubResourcesInner client = this.inner();
        return client.getStatsAsync(resourceGroupName, resourceName)
        .map(new Func1<RegistryStatisticsInner, RegistryStatistics>() {
            @Override
            public RegistryStatistics call(RegistryStatisticsInner inner) {
                return new RegistryStatisticsImpl(inner, manager());
            }
        });
    }

}
