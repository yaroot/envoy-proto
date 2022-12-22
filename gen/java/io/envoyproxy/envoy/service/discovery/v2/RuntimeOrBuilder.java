// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v2/rtds.proto

package io.envoyproxy.envoy.service.discovery.v2;

public interface RuntimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.discovery.v2.Runtime)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Runtime resource name. This makes the Runtime a self-describing xDS
   * resource.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Runtime resource name. This makes the Runtime a self-describing xDS
   * resource.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Struct layer = 2;</code>
   * @return Whether the layer field is set.
   */
  boolean hasLayer();
  /**
   * <code>.google.protobuf.Struct layer = 2;</code>
   * @return The layer.
   */
  com.google.protobuf.Struct getLayer();
  /**
   * <code>.google.protobuf.Struct layer = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getLayerOrBuilder();
}