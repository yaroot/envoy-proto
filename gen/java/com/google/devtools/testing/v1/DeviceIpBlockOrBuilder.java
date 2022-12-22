// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_environment_discovery.proto

package com.google.devtools.testing.v1;

public interface DeviceIpBlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.DeviceIpBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An IP address block in CIDR notation eg: 34.68.194.64/29
   * </pre>
   *
   * <code>string block = 1;</code>
   * @return The block.
   */
  java.lang.String getBlock();
  /**
   * <pre>
   * An IP address block in CIDR notation eg: 34.68.194.64/29
   * </pre>
   *
   * <code>string block = 1;</code>
   * @return The bytes for block.
   */
  com.google.protobuf.ByteString
      getBlockBytes();

  /**
   * <pre>
   * Whether this block is used by physical or virtual devices
   * </pre>
   *
   * <code>.google.devtools.testing.v1.DeviceForm form = 2;</code>
   * @return The enum numeric value on the wire for form.
   */
  int getFormValue();
  /**
   * <pre>
   * Whether this block is used by physical or virtual devices
   * </pre>
   *
   * <code>.google.devtools.testing.v1.DeviceForm form = 2;</code>
   * @return The form.
   */
  com.google.devtools.testing.v1.DeviceForm getForm();

  /**
   * <pre>
   * The date this block was added to Firebase Test Lab
   * </pre>
   *
   * <code>.google.type.Date added_date = 3;</code>
   * @return Whether the addedDate field is set.
   */
  boolean hasAddedDate();
  /**
   * <pre>
   * The date this block was added to Firebase Test Lab
   * </pre>
   *
   * <code>.google.type.Date added_date = 3;</code>
   * @return The addedDate.
   */
  com.google.type.Date getAddedDate();
  /**
   * <pre>
   * The date this block was added to Firebase Test Lab
   * </pre>
   *
   * <code>.google.type.Date added_date = 3;</code>
   */
  com.google.type.DateOrBuilder getAddedDateOrBuilder();
}