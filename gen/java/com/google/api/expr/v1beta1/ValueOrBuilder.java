// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/value.proto

package com.google.api.expr.v1beta1;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1beta1.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();
  /**
   * <pre>
   * Null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   * @return The enum numeric value on the wire for nullValue.
   */
  int getNullValueValue();
  /**
   * <pre>
   * Null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   * @return The nullValue.
   */
  com.google.protobuf.NullValue getNullValue();

  /**
   * <pre>
   * Boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2;</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <pre>
   * Boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   * <pre>
   * Signed integer value.
   * </pre>
   *
   * <code>int64 int64_value = 3;</code>
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   * <pre>
   * Signed integer value.
   * </pre>
   *
   * <code>int64 int64_value = 3;</code>
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   * <pre>
   * Unsigned integer value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4;</code>
   * @return Whether the uint64Value field is set.
   */
  boolean hasUint64Value();
  /**
   * <pre>
   * Unsigned integer value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4;</code>
   * @return The uint64Value.
   */
  long getUint64Value();

  /**
   * <pre>
   * Floating point value.
   * </pre>
   *
   * <code>double double_value = 5;</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <pre>
   * Floating point value.
   * </pre>
   *
   * <code>double double_value = 5;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <pre>
   * UTF-8 string value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <pre>
   * UTF-8 string value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * UTF-8 string value.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * Byte string value.
   * </pre>
   *
   * <code>bytes bytes_value = 7;</code>
   * @return Whether the bytesValue field is set.
   */
  boolean hasBytesValue();
  /**
   * <pre>
   * Byte string value.
   * </pre>
   *
   * <code>bytes bytes_value = 7;</code>
   * @return The bytesValue.
   */
  com.google.protobuf.ByteString getBytesValue();

  /**
   * <pre>
   * An enum value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.EnumValue enum_value = 9;</code>
   * @return Whether the enumValue field is set.
   */
  boolean hasEnumValue();
  /**
   * <pre>
   * An enum value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.EnumValue enum_value = 9;</code>
   * @return The enumValue.
   */
  com.google.api.expr.v1beta1.EnumValue getEnumValue();
  /**
   * <pre>
   * An enum value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.EnumValue enum_value = 9;</code>
   */
  com.google.api.expr.v1beta1.EnumValueOrBuilder getEnumValueOrBuilder();

  /**
   * <pre>
   * The proto message backing an object value.
   * </pre>
   *
   * <code>.google.protobuf.Any object_value = 10;</code>
   * @return Whether the objectValue field is set.
   */
  boolean hasObjectValue();
  /**
   * <pre>
   * The proto message backing an object value.
   * </pre>
   *
   * <code>.google.protobuf.Any object_value = 10;</code>
   * @return The objectValue.
   */
  com.google.protobuf.Any getObjectValue();
  /**
   * <pre>
   * The proto message backing an object value.
   * </pre>
   *
   * <code>.google.protobuf.Any object_value = 10;</code>
   */
  com.google.protobuf.AnyOrBuilder getObjectValueOrBuilder();

  /**
   * <pre>
   * Map value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.MapValue map_value = 11;</code>
   * @return Whether the mapValue field is set.
   */
  boolean hasMapValue();
  /**
   * <pre>
   * Map value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.MapValue map_value = 11;</code>
   * @return The mapValue.
   */
  com.google.api.expr.v1beta1.MapValue getMapValue();
  /**
   * <pre>
   * Map value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.MapValue map_value = 11;</code>
   */
  com.google.api.expr.v1beta1.MapValueOrBuilder getMapValueOrBuilder();

  /**
   * <pre>
   * List value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.ListValue list_value = 12;</code>
   * @return Whether the listValue field is set.
   */
  boolean hasListValue();
  /**
   * <pre>
   * List value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.ListValue list_value = 12;</code>
   * @return The listValue.
   */
  com.google.api.expr.v1beta1.ListValue getListValue();
  /**
   * <pre>
   * List value.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.ListValue list_value = 12;</code>
   */
  com.google.api.expr.v1beta1.ListValueOrBuilder getListValueOrBuilder();

  /**
   * <pre>
   * A Type value represented by the fully qualified name of the type.
   * </pre>
   *
   * <code>string type_value = 15;</code>
   * @return Whether the typeValue field is set.
   */
  boolean hasTypeValue();
  /**
   * <pre>
   * A Type value represented by the fully qualified name of the type.
   * </pre>
   *
   * <code>string type_value = 15;</code>
   * @return The typeValue.
   */
  java.lang.String getTypeValue();
  /**
   * <pre>
   * A Type value represented by the fully qualified name of the type.
   * </pre>
   *
   * <code>string type_value = 15;</code>
   * @return The bytes for typeValue.
   */
  com.google.protobuf.ByteString
      getTypeValueBytes();

  public com.google.api.expr.v1beta1.Value.KindCase getKindCase();
}