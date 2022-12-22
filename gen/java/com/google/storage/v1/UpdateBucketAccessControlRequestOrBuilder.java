// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

public interface UpdateBucketAccessControlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v1.UpdateBucketAccessControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString
      getBucketBytes();

  /**
   * <pre>
   * Required. The entity holding the permission. Can be one of:
   * * `user-`*userId*
   * * `user-`*emailAddress*
   * * `group-`*groupId*
   * * `group-`*emailAddress*
   * * `allUsers`
   * * `allAuthenticatedUsers`
   * </pre>
   *
   * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   * <pre>
   * Required. The entity holding the permission. Can be one of:
   * * `user-`*userId*
   * * `user-`*emailAddress*
   * * `group-`*groupId*
   * * `group-`*emailAddress*
   * * `allUsers`
   * * `allAuthenticatedUsers`
   * </pre>
   *
   * <code>string entity = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString
      getEntityBytes();

  /**
   * <pre>
   * The BucketAccessControl for updating.
   * </pre>
   *
   * <code>.google.storage.v1.BucketAccessControl bucket_access_control = 4;</code>
   * @return Whether the bucketAccessControl field is set.
   */
  boolean hasBucketAccessControl();
  /**
   * <pre>
   * The BucketAccessControl for updating.
   * </pre>
   *
   * <code>.google.storage.v1.BucketAccessControl bucket_access_control = 4;</code>
   * @return The bucketAccessControl.
   */
  com.google.storage.v1.BucketAccessControl getBucketAccessControl();
  /**
   * <pre>
   * The BucketAccessControl for updating.
   * </pre>
   *
   * <code>.google.storage.v1.BucketAccessControl bucket_access_control = 4;</code>
   */
  com.google.storage.v1.BucketAccessControlOrBuilder getBucketAccessControlOrBuilder();

  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
   * @return Whether the commonRequestParams field is set.
   */
  boolean hasCommonRequestParams();
  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
   * @return The commonRequestParams.
   */
  com.google.storage.v1.CommonRequestParams getCommonRequestParams();
  /**
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 5;</code>
   */
  com.google.storage.v1.CommonRequestParamsOrBuilder getCommonRequestParamsOrBuilder();
}