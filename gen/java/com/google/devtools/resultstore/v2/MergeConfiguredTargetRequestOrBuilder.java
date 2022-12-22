// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_upload.proto

package com.google.devtools.resultstore.v2;

public interface MergeConfiguredTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.MergeConfiguredTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifier for this request. Must be set to a different value for
   * each request that affects a given resource (eg. a random UUID). Required
   * for the operation to be idempotent. This is achieved by ignoring this
   * request if the last successful operation on the resource had the same
   * request ID.  Restricted to 36 Unicode characters.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * A unique identifier for this request. Must be set to a different value for
   * each request that affects a given resource (eg. a random UUID). Required
   * for the operation to be idempotent. This is achieved by ignoring this
   * request if the last successful operation on the resource had the same
   * request ID.  Restricted to 36 Unicode characters.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Contains the name and the fields of the configured target to be merged.
   * The name format must be:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}/configuredTargets/${CONFIG_ID}
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.ConfiguredTarget configured_target = 3;</code>
   * @return Whether the configuredTarget field is set.
   */
  boolean hasConfiguredTarget();
  /**
   * <pre>
   * Contains the name and the fields of the configured target to be merged.
   * The name format must be:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}/configuredTargets/${CONFIG_ID}
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.ConfiguredTarget configured_target = 3;</code>
   * @return The configuredTarget.
   */
  com.google.devtools.resultstore.v2.ConfiguredTarget getConfiguredTarget();
  /**
   * <pre>
   * Contains the name and the fields of the configured target to be merged.
   * The name format must be:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}/configuredTargets/${CONFIG_ID}
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.ConfiguredTarget configured_target = 3;</code>
   */
  com.google.devtools.resultstore.v2.ConfiguredTargetOrBuilder getConfiguredTargetOrBuilder();

  /**
   * <pre>
   * Indicates which fields to merge.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields to merge.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields to merge.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * This is a token to authorize access to this invocation. It must be set to
   * the same value that was provided in the CreateInvocationRequest.
   * </pre>
   *
   * <code>string authorization_token = 5;</code>
   * @return The authorizationToken.
   */
  java.lang.String getAuthorizationToken();
  /**
   * <pre>
   * This is a token to authorize access to this invocation. It must be set to
   * the same value that was provided in the CreateInvocationRequest.
   * </pre>
   *
   * <code>string authorization_token = 5;</code>
   * @return The bytes for authorizationToken.
   */
  com.google.protobuf.ByteString
      getAuthorizationTokenBytes();

  /**
   * <pre>
   * If true then the Merge operation will become a Create operation if the
   * ConfiguredTarget is NOT_FOUND.
   * </pre>
   *
   * <code>bool create_if_not_found = 6;</code>
   * @return The createIfNotFound.
   */
  boolean getCreateIfNotFound();
}