// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_types.proto

package com.google.cloud.automl.v1beta1;

public interface StructTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.StructType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unordered map of struct field names to their data types.
   * Fields cannot be added or removed via Update. Their names and
   * data types are still mutable.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataType&gt; fields = 1;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Unordered map of struct field names to their data types.
   * Fields cannot be added or removed via Update. Their names and
   * data types are still mutable.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataType&gt; fields = 1;</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataType>
  getFields();
  /**
   * <pre>
   * Unordered map of struct field names to their data types.
   * Fields cannot be added or removed via Update. Their names and
   * data types are still mutable.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataType&gt; fields = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.DataType>
  getFieldsMap();
  /**
   * <pre>
   * Unordered map of struct field names to their data types.
   * Fields cannot be added or removed via Update. Their names and
   * data types are still mutable.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataType&gt; fields = 1;</code>
   */
  /* nullable */
com.google.cloud.automl.v1beta1.DataType getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.automl.v1beta1.DataType defaultValue);
  /**
   * <pre>
   * Unordered map of struct field names to their data types.
   * Fields cannot be added or removed via Update. Their names and
   * data types are still mutable.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.automl.v1beta1.DataType&gt; fields = 1;</code>
   */
  com.google.cloud.automl.v1beta1.DataType getFieldsOrThrow(
      java.lang.String key);
}
