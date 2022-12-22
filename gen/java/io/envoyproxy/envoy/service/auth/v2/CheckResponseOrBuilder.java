// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v2/external_auth.proto

package io.envoyproxy.envoy.service.auth.v2;

public interface CheckResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.auth.v2.CheckResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status `OK` allows the request. Any other status indicates the request should be denied.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Status `OK` allows the request. Any other status indicates the request should be denied.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Status `OK` allows the request. Any other status indicates the request should be denied.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Supplies http attributes for a denied response.
   * </pre>
   *
   * <code>.envoy.service.auth.v2.DeniedHttpResponse denied_response = 2;</code>
   * @return Whether the deniedResponse field is set.
   */
  boolean hasDeniedResponse();
  /**
   * <pre>
   * Supplies http attributes for a denied response.
   * </pre>
   *
   * <code>.envoy.service.auth.v2.DeniedHttpResponse denied_response = 2;</code>
   * @return The deniedResponse.
   */
  io.envoyproxy.envoy.service.auth.v2.DeniedHttpResponse getDeniedResponse();
  /**
   * <pre>
   * Supplies http attributes for a denied response.
   * </pre>
   *
   * <code>.envoy.service.auth.v2.DeniedHttpResponse denied_response = 2;</code>
   */
  io.envoyproxy.envoy.service.auth.v2.DeniedHttpResponseOrBuilder getDeniedResponseOrBuilder();

  /**
   * <pre>
   * Supplies http attributes for an ok response.
   * </pre>
   *
   * <code>.envoy.service.auth.v2.OkHttpResponse ok_response = 3;</code>
   * @return Whether the okResponse field is set.
   */
  boolean hasOkResponse();
  /**
   * <pre>
   * Supplies http attributes for an ok response.
   * </pre>
   *
   * <code>.envoy.service.auth.v2.OkHttpResponse ok_response = 3;</code>
   * @return The okResponse.
   */
  io.envoyproxy.envoy.service.auth.v2.OkHttpResponse getOkResponse();
  /**
   * <pre>
   * Supplies http attributes for an ok response.
   * </pre>
   *
   * <code>.envoy.service.auth.v2.OkHttpResponse ok_response = 3;</code>
   */
  io.envoyproxy.envoy.service.auth.v2.OkHttpResponseOrBuilder getOkResponseOrBuilder();

  public io.envoyproxy.envoy.service.auth.v2.CheckResponse.HttpResponseCase getHttpResponseCase();
}