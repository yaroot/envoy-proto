// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

public interface ListDefaultObjectAccessControlsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v1.ListDefaultObjectAccessControlsRequest)
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
   * If present, only return default ACL listing if the bucket's current
   * metageneration matches this value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_match = 2;</code>
   * @return Whether the ifMetagenerationMatch field is set.
   */
  boolean hasIfMetagenerationMatch();
  /**
   * <pre>
   * If present, only return default ACL listing if the bucket's current
   * metageneration matches this value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_match = 2;</code>
   * @return The ifMetagenerationMatch.
   */
  com.google.protobuf.Int64Value getIfMetagenerationMatch();
  /**
   * <pre>
   * If present, only return default ACL listing if the bucket's current
   * metageneration matches this value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_match = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIfMetagenerationMatchOrBuilder();

  /**
   * <pre>
   * If present, only return default ACL listing if the bucket's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_not_match = 3;</code>
   * @return Whether the ifMetagenerationNotMatch field is set.
   */
  boolean hasIfMetagenerationNotMatch();
  /**
   * <pre>
   * If present, only return default ACL listing if the bucket's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_not_match = 3;</code>
   * @return The ifMetagenerationNotMatch.
   */
  com.google.protobuf.Int64Value getIfMetagenerationNotMatch();
  /**
   * <pre>
   * If present, only return default ACL listing if the bucket's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_not_match = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIfMetagenerationNotMatchOrBuilder();

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