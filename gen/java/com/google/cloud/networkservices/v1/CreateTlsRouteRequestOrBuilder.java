// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1/tls_route.proto

package com.google.cloud.networkservices.v1;

public interface CreateTlsRouteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.CreateTlsRouteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource of the TlsRoute. Must be in the
   * format `projects/&#42;&#47;locations/global`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource of the TlsRoute. Must be in the
   * format `projects/&#42;&#47;locations/global`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Short name of the TlsRoute resource to be created. E.g. TODO(Add an
   * example).
   * </pre>
   *
   * <code>string tls_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tlsRouteId.
   */
  java.lang.String getTlsRouteId();
  /**
   * <pre>
   * Required. Short name of the TlsRoute resource to be created. E.g. TODO(Add an
   * example).
   * </pre>
   *
   * <code>string tls_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tlsRouteId.
   */
  com.google.protobuf.ByteString
      getTlsRouteIdBytes();

  /**
   * <pre>
   * Required. TlsRoute resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.TlsRoute tls_route = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tlsRoute field is set.
   */
  boolean hasTlsRoute();
  /**
   * <pre>
   * Required. TlsRoute resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.TlsRoute tls_route = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tlsRoute.
   */
  com.google.cloud.networkservices.v1.TlsRoute getTlsRoute();
  /**
   * <pre>
   * Required. TlsRoute resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.TlsRoute tls_route = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networkservices.v1.TlsRouteOrBuilder getTlsRouteOrBuilder();
}