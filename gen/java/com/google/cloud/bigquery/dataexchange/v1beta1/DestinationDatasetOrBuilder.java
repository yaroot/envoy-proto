// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

public interface DestinationDatasetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.DestinationDataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A reference that identifies the destination dataset.
   * </pre>
   *
   * <code>.google.cloud.bigquery.dataexchange.v1beta1.DestinationDatasetReference dataset_reference = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the datasetReference field is set.
   */
  boolean hasDatasetReference();
  /**
   * <pre>
   * Required. A reference that identifies the destination dataset.
   * </pre>
   *
   * <code>.google.cloud.bigquery.dataexchange.v1beta1.DestinationDatasetReference dataset_reference = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The datasetReference.
   */
  com.google.cloud.bigquery.dataexchange.v1beta1.DestinationDatasetReference getDatasetReference();
  /**
   * <pre>
   * Required. A reference that identifies the destination dataset.
   * </pre>
   *
   * <code>.google.cloud.bigquery.dataexchange.v1beta1.DestinationDatasetReference dataset_reference = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.bigquery.dataexchange.v1beta1.DestinationDatasetReferenceOrBuilder getDatasetReferenceOrBuilder();

  /**
   * <pre>
   * Optional. A descriptive name for the dataset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue friendly_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the friendlyName field is set.
   */
  boolean hasFriendlyName();
  /**
   * <pre>
   * Optional. A descriptive name for the dataset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue friendly_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The friendlyName.
   */
  com.google.protobuf.StringValue getFriendlyName();
  /**
   * <pre>
   * Optional. A descriptive name for the dataset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue friendly_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StringValueOrBuilder getFriendlyNameOrBuilder();

  /**
   * <pre>
   * Optional. A user-friendly description of the dataset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Optional. A user-friendly description of the dataset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * Optional. A user-friendly description of the dataset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Optional. The labels associated with this dataset. You can use these
   * to organize and group your datasets.
   * You can set this property when inserting or updating a dataset.
   * See https://cloud.google.com/resource-manager/docs/creating-managing-labels
   * for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels associated with this dataset. You can use these
   * to organize and group your datasets.
   * You can set this property when inserting or updating a dataset.
   * See https://cloud.google.com/resource-manager/docs/creating-managing-labels
   * for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels associated with this dataset. You can use these
   * to organize and group your datasets.
   * You can set this property when inserting or updating a dataset.
   * See https://cloud.google.com/resource-manager/docs/creating-managing-labels
   * for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels associated with this dataset. You can use these
   * to organize and group your datasets.
   * You can set this property when inserting or updating a dataset.
   * See https://cloud.google.com/resource-manager/docs/creating-managing-labels
   * for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels associated with this dataset. You can use these
   * to organize and group your datasets.
   * You can set this property when inserting or updating a dataset.
   * See https://cloud.google.com/resource-manager/docs/creating-managing-labels
   * for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. The geographic location where the dataset should reside. See
   * https://cloud.google.com/bigquery/docs/locations for supported
   * locations.
   * </pre>
   *
   * <code>string location = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Required. The geographic location where the dataset should reside. See
   * https://cloud.google.com/bigquery/docs/locations for supported
   * locations.
   * </pre>
   *
   * <code>string location = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();
}
