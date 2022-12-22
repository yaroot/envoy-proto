// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/configuration.proto

package com.google.devtools.resultstore.v2;

public interface ConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.Configuration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The format of this Configuration resource name must be:
   * invocations/${INVOCATION_ID}/configs/${url_encode(CONFIG_ID)}
   * The configuration ID of "default" should be preferred for the default
   * configuration in a single-config invocation.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The format of this Configuration resource name must be:
   * invocations/${INVOCATION_ID}/configs/${url_encode(CONFIG_ID)}
   * The configuration ID of "default" should be preferred for the default
   * configuration in a single-config invocation.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The resource ID components that identify the Configuration. They must match
   * the resource name after proper encoding.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.Configuration.Id id = 2;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * The resource ID components that identify the Configuration. They must match
   * the resource name after proper encoding.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.Configuration.Id id = 2;</code>
   * @return The id.
   */
  com.google.devtools.resultstore.v2.Configuration.Id getId();
  /**
   * <pre>
   * The resource ID components that identify the Configuration. They must match
   * the resource name after proper encoding.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.Configuration.Id id = 2;</code>
   */
  com.google.devtools.resultstore.v2.Configuration.IdOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The aggregate status for this configuration.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.StatusAttributes status_attributes = 3;</code>
   * @return Whether the statusAttributes field is set.
   */
  boolean hasStatusAttributes();
  /**
   * <pre>
   * The aggregate status for this configuration.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.StatusAttributes status_attributes = 3;</code>
   * @return The statusAttributes.
   */
  com.google.devtools.resultstore.v2.StatusAttributes getStatusAttributes();
  /**
   * <pre>
   * The aggregate status for this configuration.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.StatusAttributes status_attributes = 3;</code>
   */
  com.google.devtools.resultstore.v2.StatusAttributesOrBuilder getStatusAttributesOrBuilder();

  /**
   * <pre>
   * Attributes that apply only to this configuration.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.ConfigurationAttributes configuration_attributes = 5;</code>
   * @return Whether the configurationAttributes field is set.
   */
  boolean hasConfigurationAttributes();
  /**
   * <pre>
   * Attributes that apply only to this configuration.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.ConfigurationAttributes configuration_attributes = 5;</code>
   * @return The configurationAttributes.
   */
  com.google.devtools.resultstore.v2.ConfigurationAttributes getConfigurationAttributes();
  /**
   * <pre>
   * Attributes that apply only to this configuration.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.ConfigurationAttributes configuration_attributes = 5;</code>
   */
  com.google.devtools.resultstore.v2.ConfigurationAttributesOrBuilder getConfigurationAttributesOrBuilder();

  /**
   * <pre>
   * Arbitrary name-value pairs.
   * This is implemented as a multi-map. Multiple properties are allowed with
   * the same key. Properties will be returned in lexicographical order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.Property> 
      getPropertiesList();
  /**
   * <pre>
   * Arbitrary name-value pairs.
   * This is implemented as a multi-map. Multiple properties are allowed with
   * the same key. Properties will be returned in lexicographical order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
   */
  com.google.devtools.resultstore.v2.Property getProperties(int index);
  /**
   * <pre>
   * Arbitrary name-value pairs.
   * This is implemented as a multi-map. Multiple properties are allowed with
   * the same key. Properties will be returned in lexicographical order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Arbitrary name-value pairs.
   * This is implemented as a multi-map. Multiple properties are allowed with
   * the same key. Properties will be returned in lexicographical order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.PropertyOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <pre>
   * Arbitrary name-value pairs.
   * This is implemented as a multi-map. Multiple properties are allowed with
   * the same key. Properties will be returned in lexicographical order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 6;</code>
   */
  com.google.devtools.resultstore.v2.PropertyOrBuilder getPropertiesOrBuilder(
      int index);

  /**
   * <pre>
   * A human-readable name for Configuration for UIs.
   * It is recommended that this name be unique.
   * If omitted, UIs should default to configuration_id.
   * </pre>
   *
   * <code>string display_name = 8;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A human-readable name for Configuration for UIs.
   * It is recommended that this name be unique.
   * If omitted, UIs should default to configuration_id.
   * </pre>
   *
   * <code>string display_name = 8;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}