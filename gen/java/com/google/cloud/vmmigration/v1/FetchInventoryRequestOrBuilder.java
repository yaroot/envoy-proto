// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface FetchInventoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.FetchInventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Source.
   * </pre>
   *
   * <code>string source = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <pre>
   * Required. The name of the Source.
   * </pre>
   *
   * <code>string source = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   * If this flag is set to true, the source will be queried instead of using
   * cached results. Using this flag will make the call slower.
   * </pre>
   *
   * <code>bool force_refresh = 2;</code>
   * @return The forceRefresh.
   */
  boolean getForceRefresh();
}