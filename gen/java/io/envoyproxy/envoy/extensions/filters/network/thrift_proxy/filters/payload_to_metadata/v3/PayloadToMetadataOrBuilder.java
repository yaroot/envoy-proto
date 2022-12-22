// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/thrift_proxy/filters/payload_to_metadata/v3/payload_to_metadata.proto

package io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3;

public interface PayloadToMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule request_rules = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule> 
      getRequestRulesList();
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule request_rules = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule getRequestRules(int index);
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule request_rules = 1 [(.validate.rules) = { ... }</code>
   */
  int getRequestRulesCount();
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule request_rules = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.RuleOrBuilder> 
      getRequestRulesOrBuilderList();
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.Rule request_rules = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.filters.payload_to_metadata.v3.PayloadToMetadata.RuleOrBuilder getRequestRulesOrBuilder(
      int index);
}