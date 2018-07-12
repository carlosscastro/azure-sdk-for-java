/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_05_31_preview.Projects;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.billing.v2018_05_31_preview.ProjectListResult;
import com.microsoft.azure.management.billing.v2018_05_31_preview.Project;

class ProjectsImpl extends WrapperImpl<ProjectsInner> implements Projects {
    private final BillingManager manager;

    ProjectsImpl(BillingManager manager) {
        super(manager.inner().projects());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private ProjectImpl wrapModel(ProjectInner inner) {
        return  new ProjectImpl(inner, manager());
    }

    @Override
    public Observable<ProjectListResult> listByBillingAccountIdAsync(String billingAccountId) {
        ProjectsInner client = this.inner();
        return client.listByBillingAccountIdAsync(billingAccountId)
        .map(new Func1<ProjectListResultInner, ProjectListResult>() {
            @Override
            public ProjectListResult call(ProjectListResultInner inner) {
                return new ProjectListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Project> getAsync(String billingAccountId, String projectId) {
        ProjectsInner client = this.inner();
        return client.getAsync(billingAccountId, projectId)
        .map(new Func1<ProjectInner, Project>() {
            @Override
            public Project call(ProjectInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<Project> createAsync(String billingAccountId, ProjectInner parameters) {
        ProjectsInner client = this.inner();
        return client.createAsync(billingAccountId, parameters)
        .map(new Func1<ProjectInner, Project>() {
            @Override
            public Project call(ProjectInner inner) {
                return new ProjectImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProjectListResult> listWithCreateSubscriptionPermissionAsync(String billingAccountId) {
        ProjectsInner client = this.inner();
        return client.listWithCreateSubscriptionPermissionAsync(billingAccountId)
        .map(new Func1<ProjectListResultInner, ProjectListResult>() {
            @Override
            public ProjectListResult call(ProjectListResultInner inner) {
                return new ProjectListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Project> create1Async(String billingAccountId, ProjectInner parameters) {
        ProjectsInner client = this.inner();
        return client.create1Async(billingAccountId, parameters)
        .map(new Func1<ProjectInner, Project>() {
            @Override
            public Project call(ProjectInner inner) {
                return new ProjectImpl(inner, manager());
            }
        });
    }

}
