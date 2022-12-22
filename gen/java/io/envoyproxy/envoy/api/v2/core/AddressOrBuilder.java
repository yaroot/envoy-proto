// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/address.proto

package io.envoyproxy.envoy.api.v2.core;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.core.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.envoy.api.v2.core.SocketAddress socket_address = 1;</code>
   * @return Whether the socketAddress field is set.
   */
  boolean hasSocketAddress();
  /**
   * <code>.envoy.api.v2.core.SocketAddress socket_address = 1;</code>
   * @return The socketAddress.
   */
  io.envoyproxy.envoy.api.v2.core.SocketAddress getSocketAddress();
  /**
   * <code>.envoy.api.v2.core.SocketAddress socket_address = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.core.SocketAddressOrBuilder getSocketAddressOrBuilder();

  /**
   * <code>.envoy.api.v2.core.Pipe pipe = 2;</code>
   * @return Whether the pipe field is set.
   */
  boolean hasPipe();
  /**
   * <code>.envoy.api.v2.core.Pipe pipe = 2;</code>
   * @return The pipe.
   */
  io.envoyproxy.envoy.api.v2.core.Pipe getPipe();
  /**
   * <code>.envoy.api.v2.core.Pipe pipe = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.core.PipeOrBuilder getPipeOrBuilder();

  public io.envoyproxy.envoy.api.v2.core.Address.AddressCase getAddressCase();
}