// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface RowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the row.
   * Row names have the form `tables/{table}/rows/{row}`.
   * The name is ignored when creating a row.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the row.
   * Row names have the form `tables/{table}/rows/{row}`.
   * The name is ignored when creating a row.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getValues();
  /**
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getValuesMap();
  /**
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  /* nullable */
com.google.protobuf.Value getValuesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * The values of the row. This is a map of column key to value.
   * Key is user entered name(default) or the internal column id based on
   * the view in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; values = 2;</code>
   */
  com.google.protobuf.Value getValuesOrThrow(
      java.lang.String key);
}
