// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/platform.proto

package com.google.cloud.visionai.v1;

public interface PersonVehicleDetectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.PersonVehicleDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * At least one of enable_people_counting and enable_vehicle_counting fields
   * must be set to true.
   * Whether to count the appearances of people, output counts have 'people' as
   * the key.
   * </pre>
   *
   * <code>bool enable_people_counting = 1;</code>
   * @return The enablePeopleCounting.
   */
  boolean getEnablePeopleCounting();

  /**
   * <pre>
   * Whether to count the appearances of vehicles, output counts will have
   * 'vehicle' as the key.
   * </pre>
   *
   * <code>bool enable_vehicle_counting = 2;</code>
   * @return The enableVehicleCounting.
   */
  boolean getEnableVehicleCounting();
}