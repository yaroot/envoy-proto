// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/http/early_header_mutation/header_mutation/v3/header_mutation.proto

package io.envoyproxy.envoy.extensions.http.early_header_mutation.header_mutation.v3;

public interface HeaderMutationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.http.early_header_mutation.header_mutation.v3.HeaderMutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .envoy.config.common.mutation_rules.v3.HeaderMutation mutations = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.config.common.mutation_rules.v3.HeaderMutation> 
      getMutationsList();
  /**
   * <code>repeated .envoy.config.common.mutation_rules.v3.HeaderMutation mutations = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.common.mutation_rules.v3.HeaderMutation getMutations(int index);
  /**
   * <code>repeated .envoy.config.common.mutation_rules.v3.HeaderMutation mutations = 1 [(.validate.rules) = { ... }</code>
   */
  int getMutationsCount();
  /**
   * <code>repeated .envoy.config.common.mutation_rules.v3.HeaderMutation mutations = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.common.mutation_rules.v3.HeaderMutationOrBuilder> 
      getMutationsOrBuilderList();
  /**
   * <code>repeated .envoy.config.common.mutation_rules.v3.HeaderMutation mutations = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.common.mutation_rules.v3.HeaderMutationOrBuilder getMutationsOrBuilder(
      int index);
}