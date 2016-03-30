/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.SourceControl;
import com.microsoft.azure.management.website.models.SourceControlCollection;
import com.microsoft.azure.management.website.models.User;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ProviderOperations.
 */
public interface ProviderOperations {
    /**
     * Gets the source controls available for Azure websites.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControlCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SourceControlCollection> getSourceControls() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the source controls available for Azure websites.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSourceControlsAsync(final ServiceCallback<SourceControlCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SourceControl> getSourceControl(String sourceControlType) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSourceControlAsync(String sourceControlType, final ServiceCallback<SourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control
     * @param requestMessage Source control token information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SourceControl> updateSourceControl(String sourceControlType, SourceControl requestMessage) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control
     * @param requestMessage Source control token information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSourceControlAsync(String sourceControlType, SourceControl requestMessage, final ServiceCallback<SourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets publishing user.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> getPublishingUser() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets publishing user.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getPublishingUserAsync(final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> updatePublishingUser(User requestMessage) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updatePublishingUserAsync(User requestMessage, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

}