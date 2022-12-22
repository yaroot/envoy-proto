// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

public interface CreateDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1alpha.CreateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Parent project that will own the dataset.
   * Format: projects/{$project_number}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Parent project that will own the dataset.
   * Format: projects/{$project_number}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The dataset version to create.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * Required. The dataset version to create.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataset.
   */
  com.google.maps.mapsplatformdatasets.v1alpha.Dataset getDataset();
  /**
   * <pre>
   * Required. The dataset version to create.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder getDatasetOrBuilder();
}