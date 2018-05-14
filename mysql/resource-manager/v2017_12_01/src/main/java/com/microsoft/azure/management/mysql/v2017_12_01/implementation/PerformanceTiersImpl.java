/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mysql.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2017_12_01.PerformanceTiers;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.mysql.v2017_12_01.PerformanceTierProperties;

class PerformanceTiersImpl extends WrapperImpl<LocationBasedPerformanceTiersInner> implements PerformanceTiers {
    private final MySQLManager manager;

    PerformanceTiersImpl(MySQLManager manager) {
        super(manager.inner().locationBasedPerformanceTiers());
        this.manager = manager;
    }

    public MySQLManager manager() {
        return this.manager;
    }

    private PerformanceTierPropertiesImpl wrapModel(PerformanceTierPropertiesInner inner) {
        return  new PerformanceTierPropertiesImpl(inner, manager());
    }

    @Override
    public Observable<PerformanceTierProperties> listByLocationAsync(String locationName) {
        LocationBasedPerformanceTiersInner client = this.inner();
        return client.listAsync(locationName)
        .flatMap(new Func1<List<PerformanceTierPropertiesInner>, Observable<PerformanceTierPropertiesInner>>() {
            @Override
            public Observable<PerformanceTierPropertiesInner> call(List<PerformanceTierPropertiesInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PerformanceTierPropertiesInner, PerformanceTierProperties>() {
            @Override
            public PerformanceTierProperties call(PerformanceTierPropertiesInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
