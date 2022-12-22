// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface DataSourceParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.DataSourceParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parameter identifier.
   * </pre>
   *
   * <code>string param_id = 1;</code>
   * @return The paramId.
   */
  java.lang.String getParamId();
  /**
   * <pre>
   * Parameter identifier.
   * </pre>
   *
   * <code>string param_id = 1;</code>
   * @return The bytes for paramId.
   */
  com.google.protobuf.ByteString
      getParamIdBytes();

  /**
   * <pre>
   * Parameter display name in the user interface.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Parameter display name in the user interface.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Parameter description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Parameter description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Parameter type.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceParameter.Type type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Parameter type.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceParameter.Type type = 4;</code>
   * @return The type.
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter.Type getType();

  /**
   * <pre>
   * Is parameter required.
   * </pre>
   *
   * <code>bool required = 5;</code>
   * @return The required.
   */
  boolean getRequired();

  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>bool repeated = 6;</code>
   * @return The repeated.
   */
  boolean getRepeated();

  /**
   * <pre>
   * Regular expression which can be used for parameter validation.
   * </pre>
   *
   * <code>string validation_regex = 7;</code>
   * @return The validationRegex.
   */
  java.lang.String getValidationRegex();
  /**
   * <pre>
   * Regular expression which can be used for parameter validation.
   * </pre>
   *
   * <code>string validation_regex = 7;</code>
   * @return The bytes for validationRegex.
   */
  com.google.protobuf.ByteString
      getValidationRegexBytes();

  /**
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   * @return A list containing the allowedValues.
   */
  java.util.List<java.lang.String>
      getAllowedValuesList();
  /**
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   * @return The count of allowedValues.
   */
  int getAllowedValuesCount();
  /**
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   * @param index The index of the element to return.
   * @return The allowedValues at the given index.
   */
  java.lang.String getAllowedValues(int index);
  /**
   * <pre>
   * All possible values for the parameter.
   * </pre>
   *
   * <code>repeated string allowed_values = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedValues at the given index.
   */
  com.google.protobuf.ByteString
      getAllowedValuesBytes(int index);

  /**
   * <pre>
   * For integer and double values specifies minimum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 9;</code>
   * @return Whether the minValue field is set.
   */
  boolean hasMinValue();
  /**
   * <pre>
   * For integer and double values specifies minimum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 9;</code>
   * @return The minValue.
   */
  com.google.protobuf.DoubleValue getMinValue();
  /**
   * <pre>
   * For integer and double values specifies minimum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue min_value = 9;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getMinValueOrBuilder();

  /**
   * <pre>
   * For integer and double values specifies maximum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 10;</code>
   * @return Whether the maxValue field is set.
   */
  boolean hasMaxValue();
  /**
   * <pre>
   * For integer and double values specifies maximum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 10;</code>
   * @return The maxValue.
   */
  com.google.protobuf.DoubleValue getMaxValue();
  /**
   * <pre>
   * For integer and double values specifies maximum allowed value.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue max_value = 10;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getMaxValueOrBuilder();

  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter> 
      getFieldsList();
  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter getFields(int index);
  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter fields = 11;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Description of the requirements for this field, in case the user input does
   * not fulfill the regex pattern or min/max values.
   * </pre>
   *
   * <code>string validation_description = 12;</code>
   * @return The validationDescription.
   */
  java.lang.String getValidationDescription();
  /**
   * <pre>
   * Description of the requirements for this field, in case the user input does
   * not fulfill the regex pattern or min/max values.
   * </pre>
   *
   * <code>string validation_description = 12;</code>
   * @return The bytes for validationDescription.
   */
  com.google.protobuf.ByteString
      getValidationDescriptionBytes();

  /**
   * <pre>
   * URL to a help document to further explain the naming requirements.
   * </pre>
   *
   * <code>string validation_help_url = 13;</code>
   * @return The validationHelpUrl.
   */
  java.lang.String getValidationHelpUrl();
  /**
   * <pre>
   * URL to a help document to further explain the naming requirements.
   * </pre>
   *
   * <code>string validation_help_url = 13;</code>
   * @return The bytes for validationHelpUrl.
   */
  com.google.protobuf.ByteString
      getValidationHelpUrlBytes();

  /**
   * <pre>
   * Cannot be changed after initial creation.
   * </pre>
   *
   * <code>bool immutable = 14;</code>
   * @return The immutable.
   */
  boolean getImmutable();

  /**
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>bool recurse = 15;</code>
   * @return The recurse.
   */
  boolean getRecurse();

  /**
   * <pre>
   * If true, it should not be used in new transfers, and it should not be
   * visible to users.
   * </pre>
   *
   * <code>bool deprecated = 20;</code>
   * @return The deprecated.
   */
  boolean getDeprecated();
}
