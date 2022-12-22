// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_download.proto

package com.google.devtools.resultstore.v2;

public interface GetTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.GetTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the target to retrieve. It must match this format:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the target to retrieve. It must match this format:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}