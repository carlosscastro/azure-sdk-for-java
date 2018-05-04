/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.microsoft.azure.cognitiveservices.vision.faceapi.models.CreateFaceListOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.UpdateFaceListOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.AddFaceFromUrlOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.AddFaceFromStreamOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.FaceList;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.PersistedFace;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FaceLists.
 */
public interface FaceLists {
    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param createFaceListOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void createFaceList(String faceListId, CreateFaceListOptionalParameter createFaceListOptionalParameter);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param createFaceListOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> createFaceListAsync(String faceListId, CreateFaceListOptionalParameter createFaceListOptionalParameter);


    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FaceList object if successful.
     */
    FaceList get(String faceListId);

    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FaceList object
     */
    Observable<FaceList> getAsync(String faceListId);


    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param updateFaceListOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void updateFaceList(String faceListId, UpdateFaceListOptionalParameter updateFaceListOptionalParameter);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param updateFaceListOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> updateFaceListAsync(String faceListId, UpdateFaceListOptionalParameter updateFaceListOptionalParameter);


    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String faceListId);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteAsync(String faceListId);



    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FaceList&gt; object if successful.
     */
    List<FaceList> list();

    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FaceList&gt; object
     */
    Observable<List<FaceList>> listAsync();



    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteFace(String faceListId, UUID persistedFaceId);

    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteFaceAsync(String faceListId, UUID persistedFaceId);


    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *  persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url the String value
     * @param addFaceFromUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    PersistedFace addFaceFromUrl(String faceListId, String url, AddFaceFromUrlOptionalParameter addFaceFromUrlOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *  persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url the String value
     * @param addFaceFromUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    Observable<PersistedFace> addFaceFromUrlAsync(String faceListId, String url, AddFaceFromUrlOptionalParameter addFaceFromUrlOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *  persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param image An image stream.
     * @param addFaceFromStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    PersistedFace addFaceFromStream(String faceListId, byte[] image, AddFaceFromStreamOptionalParameter addFaceFromStreamOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *  persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param image An image stream.
     * @param addFaceFromStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    Observable<PersistedFace> addFaceFromStreamAsync(String faceListId, byte[] image, AddFaceFromStreamOptionalParameter addFaceFromStreamOptionalParameter);

}