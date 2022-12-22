// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetAutoscalerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetAutoscalerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the autoscaler to return.
   * </pre>
   *
   * <code>string autoscaler = 517258967 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The autoscaler.
   */
  java.lang.String getAutoscaler();
  /**
   * <pre>
   * Name of the autoscaler to return.
   * </pre>
   *
   * <code>string autoscaler = 517258967 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for autoscaler.
   */
  com.google.protobuf.ByteString
      getAutoscalerBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}