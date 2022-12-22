// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/ratelimit/v2/rls.proto

package io.envoyproxy.envoy.config.ratelimit.v2;

public interface RateLimitServiceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.ratelimit.v2.RateLimitServiceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the gRPC service that hosts the rate limit service. The client
   * will connect to this cluster when it needs to make rate limit service
   * requests.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the grpcService field is set.
   */
  boolean hasGrpcService();
  /**
   * <pre>
   * Specifies the gRPC service that hosts the rate limit service. The client
   * will connect to this cluster when it needs to make rate limit service
   * requests.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
   * @return The grpcService.
   */
  io.envoyproxy.envoy.api.v2.core.GrpcService getGrpcService();
  /**
   * <pre>
   * Specifies the gRPC service that hosts the rate limit service. The client
   * will connect to this cluster when it needs to make rate limit service
   * requests.
   * </pre>
   *
   * <code>.envoy.api.v2.core.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.core.GrpcServiceOrBuilder getGrpcServiceOrBuilder();
}