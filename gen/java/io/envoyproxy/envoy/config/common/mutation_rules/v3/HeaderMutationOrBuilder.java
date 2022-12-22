// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/common/mutation_rules/v3/mutation_rules.proto

package io.envoyproxy.envoy.config.common.mutation_rules.v3;

public interface HeaderMutationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.common.mutation_rules.v3.HeaderMutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Remove the specified header if it exists.
   * </pre>
   *
   * <code>string remove = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove the specified header if it exists.
   * </pre>
   *
   * <code>string remove = 1 [(.validate.rules) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove the specified header if it exists.
   * </pre>
   *
   * <code>string remove = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  /**
   * <pre>
   * Append new header by the specified HeaderValueOption.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderValueOption append = 2;</code>
   * @return Whether the append field is set.
   */
  boolean hasAppend();
  /**
   * <pre>
   * Append new header by the specified HeaderValueOption.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderValueOption append = 2;</code>
   * @return The append.
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOption getAppend();
  /**
   * <pre>
   * Append new header by the specified HeaderValueOption.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HeaderValueOption append = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOptionOrBuilder getAppendOrBuilder();

  public io.envoyproxy.envoy.config.common.mutation_rules.v3.HeaderMutation.ActionCase getActionCase();
}