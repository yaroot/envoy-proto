// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/datasets.proto

package com.google.genomics.v1;

public interface UpdateDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.UpdateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the dataset to be updated.
   * </pre>
   *
   * <code>string dataset_id = 1;</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * The ID of the dataset to be updated.
   * </pre>
   *
   * <code>string dataset_id = 1;</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <pre>
   * The new dataset data.
   * </pre>
   *
   * <code>.google.genomics.v1.Dataset dataset = 2;</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * The new dataset data.
   * </pre>
   *
   * <code>.google.genomics.v1.Dataset dataset = 2;</code>
   * @return The dataset.
   */
  com.google.genomics.v1.Dataset getDataset();
  /**
   * <pre>
   * The new dataset data.
   * </pre>
   *
   * <code>.google.genomics.v1.Dataset dataset = 2;</code>
   */
  com.google.genomics.v1.DatasetOrBuilder getDatasetOrBuilder();

  /**
   * <pre>
   * An optional mask specifying which fields to update. At this time, the only
   * mutable field is [name][google.genomics.v1.Dataset.name]. The only
   * acceptable value is "name". If unspecified, all mutable fields will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * An optional mask specifying which fields to update. At this time, the only
   * mutable field is [name][google.genomics.v1.Dataset.name]. The only
   * acceptable value is "name". If unspecified, all mutable fields will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * An optional mask specifying which fields to update. At this time, the only
   * mutable field is [name][google.genomics.v1.Dataset.name]. The only
   * acceptable value is "name". If unspecified, all mutable fields will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}