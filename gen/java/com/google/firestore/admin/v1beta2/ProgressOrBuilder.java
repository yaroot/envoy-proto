// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1beta2/operation.proto

package com.google.firestore.admin.v1beta2;

public interface ProgressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.admin.v1beta2.Progress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The amount of work estimated.
   * </pre>
   *
   * <code>int64 estimated_work = 1;</code>
   * @return The estimatedWork.
   */
  long getEstimatedWork();

  /**
   * <pre>
   * The amount of work completed.
   * </pre>
   *
   * <code>int64 completed_work = 2;</code>
   * @return The completedWork.
   */
  long getCompletedWork();
}