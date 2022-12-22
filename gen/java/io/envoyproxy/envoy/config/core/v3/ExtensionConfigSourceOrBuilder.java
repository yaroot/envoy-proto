// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/config_source.proto

package io.envoyproxy.envoy.config.core.v3;

public interface ExtensionConfigSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.ExtensionConfigSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.envoy.config.core.v3.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the configSource field is set.
   */
  boolean hasConfigSource();
  /**
   * <code>.envoy.config.core.v3.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
   * @return The configSource.
   */
  io.envoyproxy.envoy.config.core.v3.ConfigSource getConfigSource();
  /**
   * <code>.envoy.config.core.v3.ConfigSource config_source = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.core.v3.ConfigSourceOrBuilder getConfigSourceOrBuilder();

  /**
   * <pre>
   * Optional default configuration to use as the initial configuration if
   * there is a failure to receive the initial extension configuration or if
   * ``apply_default_config_without_warming`` flag is set.
   * </pre>
   *
   * <code>.google.protobuf.Any default_config = 2;</code>
   * @return Whether the defaultConfig field is set.
   */
  boolean hasDefaultConfig();
  /**
   * <pre>
   * Optional default configuration to use as the initial configuration if
   * there is a failure to receive the initial extension configuration or if
   * ``apply_default_config_without_warming`` flag is set.
   * </pre>
   *
   * <code>.google.protobuf.Any default_config = 2;</code>
   * @return The defaultConfig.
   */
  com.google.protobuf.Any getDefaultConfig();
  /**
   * <pre>
   * Optional default configuration to use as the initial configuration if
   * there is a failure to receive the initial extension configuration or if
   * ``apply_default_config_without_warming`` flag is set.
   * </pre>
   *
   * <code>.google.protobuf.Any default_config = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getDefaultConfigOrBuilder();

  /**
   * <pre>
   * Use the default config as the initial configuration without warming and
   * waiting for the first discovery response. Requires the default configuration
   * to be supplied.
   * </pre>
   *
   * <code>bool apply_default_config_without_warming = 3;</code>
   * @return The applyDefaultConfigWithoutWarming.
   */
  boolean getApplyDefaultConfigWithoutWarming();

  /**
   * <pre>
   * A set of permitted extension type URLs. Extension configuration updates are rejected
   * if they do not match any type URL in the set.
   * </pre>
   *
   * <code>repeated string type_urls = 4 [(.validate.rules) = { ... }</code>
   * @return A list containing the typeUrls.
   */
  java.util.List<java.lang.String>
      getTypeUrlsList();
  /**
   * <pre>
   * A set of permitted extension type URLs. Extension configuration updates are rejected
   * if they do not match any type URL in the set.
   * </pre>
   *
   * <code>repeated string type_urls = 4 [(.validate.rules) = { ... }</code>
   * @return The count of typeUrls.
   */
  int getTypeUrlsCount();
  /**
   * <pre>
   * A set of permitted extension type URLs. Extension configuration updates are rejected
   * if they do not match any type URL in the set.
   * </pre>
   *
   * <code>repeated string type_urls = 4 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The typeUrls at the given index.
   */
  java.lang.String getTypeUrls(int index);
  /**
   * <pre>
   * A set of permitted extension type URLs. Extension configuration updates are rejected
   * if they do not match any type URL in the set.
   * </pre>
   *
   * <code>repeated string type_urls = 4 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the typeUrls at the given index.
   */
  com.google.protobuf.ByteString
      getTypeUrlsBytes(int index);
}