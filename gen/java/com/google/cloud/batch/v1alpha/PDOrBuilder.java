// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/volume.proto

package com.google.cloud.batch.v1alpha;

public interface PDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.PD)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * PD disk name, e.g. pd-1.
   * </pre>
   *
   * <code>string disk = 1;</code>
   * @return The disk.
   */
  java.lang.String getDisk();
  /**
   * <pre>
   * PD disk name, e.g. pd-1.
   * </pre>
   *
   * <code>string disk = 1;</code>
   * @return The bytes for disk.
   */
  com.google.protobuf.ByteString
      getDiskBytes();

  /**
   * <pre>
   * PD device name, e.g. persistent-disk-1.
   * </pre>
   *
   * <code>string device = 2;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * PD device name, e.g. persistent-disk-1.
   * </pre>
   *
   * <code>string device = 2;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * Whether this is an existing PD. Default is false. If false, i.e., new
   * PD, we will format it into ext4 and mount to the given path. If true, i.e.,
   * existing PD, it should be in ext4 format and we will mount it to the given
   * path.
   * </pre>
   *
   * <code>bool existing = 3 [deprecated = true];</code>
   * @deprecated google.cloud.batch.v1alpha.PD.existing is deprecated.
   *     See google/cloud/batch/v1alpha/volume.proto;l=85
   * @return The existing.
   */
  @java.lang.Deprecated boolean getExisting();
}