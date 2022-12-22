// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/version.proto

package com.google.appengine.v1beta;

public interface VolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1beta.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique name for the volume.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Unique name for the volume.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Underlying volume type, e.g. 'tmpfs'.
   * </pre>
   *
   * <code>string volume_type = 2;</code>
   * @return The volumeType.
   */
  java.lang.String getVolumeType();
  /**
   * <pre>
   * Underlying volume type, e.g. 'tmpfs'.
   * </pre>
   *
   * <code>string volume_type = 2;</code>
   * @return The bytes for volumeType.
   */
  com.google.protobuf.ByteString
      getVolumeTypeBytes();

  /**
   * <pre>
   * Volume size in gigabytes.
   * </pre>
   *
   * <code>double size_gb = 3;</code>
   * @return The sizeGb.
   */
  double getSizeGb();
}