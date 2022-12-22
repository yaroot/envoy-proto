// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface ExportVariantSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ExportVariantSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the variant set that contains variant data which
   * should be exported. The caller must have READ access to this variant set.
   * </pre>
   *
   * <code>string variant_set_id = 1;</code>
   * @return The variantSetId.
   */
  java.lang.String getVariantSetId();
  /**
   * <pre>
   * Required. The ID of the variant set that contains variant data which
   * should be exported. The caller must have READ access to this variant set.
   * </pre>
   *
   * <code>string variant_set_id = 1;</code>
   * @return The bytes for variantSetId.
   */
  com.google.protobuf.ByteString
      getVariantSetIdBytes();

  /**
   * <pre>
   * If provided, only variant call information from the specified call sets
   * will be exported. By default all variant calls are exported.
   * </pre>
   *
   * <code>repeated string call_set_ids = 2;</code>
   * @return A list containing the callSetIds.
   */
  java.util.List<java.lang.String>
      getCallSetIdsList();
  /**
   * <pre>
   * If provided, only variant call information from the specified call sets
   * will be exported. By default all variant calls are exported.
   * </pre>
   *
   * <code>repeated string call_set_ids = 2;</code>
   * @return The count of callSetIds.
   */
  int getCallSetIdsCount();
  /**
   * <pre>
   * If provided, only variant call information from the specified call sets
   * will be exported. By default all variant calls are exported.
   * </pre>
   *
   * <code>repeated string call_set_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The callSetIds at the given index.
   */
  java.lang.String getCallSetIds(int index);
  /**
   * <pre>
   * If provided, only variant call information from the specified call sets
   * will be exported. By default all variant calls are exported.
   * </pre>
   *
   * <code>repeated string call_set_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the callSetIds at the given index.
   */
  com.google.protobuf.ByteString
      getCallSetIdsBytes(int index);

  /**
   * <pre>
   * Required. The Google Cloud project ID that owns the destination
   * BigQuery dataset. The caller must have WRITE access to this project.  This
   * project will also own the resulting export job.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. The Google Cloud project ID that owns the destination
   * BigQuery dataset. The caller must have WRITE access to this project.  This
   * project will also own the resulting export job.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The format for the exported data.
   * </pre>
   *
   * <code>.google.genomics.v1.ExportVariantSetRequest.Format format = 4;</code>
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   * <pre>
   * The format for the exported data.
   * </pre>
   *
   * <code>.google.genomics.v1.ExportVariantSetRequest.Format format = 4;</code>
   * @return The format.
   */
  com.google.genomics.v1.ExportVariantSetRequest.Format getFormat();

  /**
   * <pre>
   * Required. The BigQuery dataset to export data to. This dataset must already
   * exist. Note that this is distinct from the Genomics concept of "dataset".
   * </pre>
   *
   * <code>string bigquery_dataset = 5;</code>
   * @return The bigqueryDataset.
   */
  java.lang.String getBigqueryDataset();
  /**
   * <pre>
   * Required. The BigQuery dataset to export data to. This dataset must already
   * exist. Note that this is distinct from the Genomics concept of "dataset".
   * </pre>
   *
   * <code>string bigquery_dataset = 5;</code>
   * @return The bytes for bigqueryDataset.
   */
  com.google.protobuf.ByteString
      getBigqueryDatasetBytes();

  /**
   * <pre>
   * Required. The BigQuery table to export data to.
   * If the table doesn't exist, it will be created. If it already exists, it
   * will be overwritten.
   * </pre>
   *
   * <code>string bigquery_table = 6;</code>
   * @return The bigqueryTable.
   */
  java.lang.String getBigqueryTable();
  /**
   * <pre>
   * Required. The BigQuery table to export data to.
   * If the table doesn't exist, it will be created. If it already exists, it
   * will be overwritten.
   * </pre>
   *
   * <code>string bigquery_table = 6;</code>
   * @return The bytes for bigqueryTable.
   */
  com.google.protobuf.ByteString
      getBigqueryTableBytes();
}