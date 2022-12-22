// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_upload.proto

package com.google.devtools.resultstore.v2;

public interface FinalizeTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.FinalizeTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the target.  Its format must be:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the target.  Its format must be:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This is a token to authorize access to this invocation. It must be set to
   * the same value that was provided in the CreateInvocationRequest.
   * </pre>
   *
   * <code>string authorization_token = 3;</code>
   * @return The authorizationToken.
   */
  java.lang.String getAuthorizationToken();
  /**
   * <pre>
   * This is a token to authorize access to this invocation. It must be set to
   * the same value that was provided in the CreateInvocationRequest.
   * </pre>
   *
   * <code>string authorization_token = 3;</code>
   * @return The bytes for authorizationToken.
   */
  com.google.protobuf.ByteString
      getAuthorizationTokenBytes();
}