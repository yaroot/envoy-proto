// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/warehouse.proto

package com.google.cloud.visionai.v1;

public interface GeoCoordinateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.GeoCoordinate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Latitude Coordinate. Degrees [-90 .. 90]
   * </pre>
   *
   * <code>double latitude = 1;</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <pre>
   * Longitude Coordinate. Degrees [-180 .. 180]
   * </pre>
   *
   * <code>double longitude = 2;</code>
   * @return The longitude.
   */
  double getLongitude();
}