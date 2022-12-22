// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public interface DeleteDocumentActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.DeleteDocumentAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Boolean field to select between hard vs soft delete options.
   * Set 'true' for 'hard delete' and 'false' for 'soft delete'.
   * </pre>
   *
   * <code>bool enable_hard_delete = 1;</code>
   * @return The enableHardDelete.
   */
  boolean getEnableHardDelete();
}