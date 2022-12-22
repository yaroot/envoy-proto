// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

public interface GetGuestAttributesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.GetGuestAttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributes guest_attributes = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2.GuestAttributes> 
      getGuestAttributesList();
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributes guest_attributes = 1;</code>
   */
  com.google.cloud.tpu.v2.GuestAttributes getGuestAttributes(int index);
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributes guest_attributes = 1;</code>
   */
  int getGuestAttributesCount();
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributes guest_attributes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2.GuestAttributesOrBuilder> 
      getGuestAttributesOrBuilderList();
  /**
   * <pre>
   * The guest attributes for the TPU workers.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributes guest_attributes = 1;</code>
   */
  com.google.cloud.tpu.v2.GuestAttributesOrBuilder getGuestAttributesOrBuilder(
      int index);
}