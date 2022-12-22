// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document_schema.proto

package com.google.cloud.contentwarehouse.v1;

public interface EnumTypeOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.EnumTypeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the possibleValues.
   */
  java.util.List<java.lang.String>
      getPossibleValuesList();
  /**
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of possibleValues.
   */
  int getPossibleValuesCount();
  /**
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The possibleValues at the given index.
   */
  java.lang.String getPossibleValues(int index);
  /**
   * <pre>
   * Required. List of possible enum values.
   * </pre>
   *
   * <code>repeated string possible_values = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the possibleValues at the given index.
   */
  com.google.protobuf.ByteString
      getPossibleValuesBytes(int index);

  /**
   * <pre>
   * Make sure the Enum property value provided in the document is in the
   * possile value list during document creation. The validation check runs by
   * default.
   * </pre>
   *
   * <code>bool validation_check_disabled = 2;</code>
   * @return The validationCheckDisabled.
   */
  boolean getValidationCheckDisabled();
}