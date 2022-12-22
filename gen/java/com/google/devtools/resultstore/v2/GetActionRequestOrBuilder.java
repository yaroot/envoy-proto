// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_download.proto

package com.google.devtools.resultstore.v2;

public interface GetActionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.GetActionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the action to retrieve. It must match this format:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}/configuredTargets/${CONFIGURATION_ID}/actions/${ACTION_ID}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the action to retrieve. It must match this format:
   * invocations/${INVOCATION_ID}/targets/${url_encode(TARGET_ID)}/configuredTargets/${CONFIGURATION_ID}/actions/${ACTION_ID}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}