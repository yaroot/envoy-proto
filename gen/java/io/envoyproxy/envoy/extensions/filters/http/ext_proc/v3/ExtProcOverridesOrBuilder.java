// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ext_proc/v3/ext_proc.proto

package io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3;

public interface ExtProcOverridesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ext_proc.v3.ExtProcOverrides)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Set a different processing mode for this route than the default.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode processing_mode = 1;</code>
   * @return Whether the processingMode field is set.
   */
  boolean hasProcessingMode();
  /**
   * <pre>
   * Set a different processing mode for this route than the default.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode processing_mode = 1;</code>
   * @return The processingMode.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode getProcessingMode();
  /**
   * <pre>
   * Set a different processing mode for this route than the default.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode processing_mode = 1;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ProcessingModeOrBuilder getProcessingModeOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set a different asynchronous processing option than the default.
   * </pre>
   *
   * <code>bool async_mode = 2;</code>
   * @return The asyncMode.
   */
  boolean getAsyncMode();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional attributes than the default setting of the
   * ``request_attributes`` field.
   * </pre>
   *
   * <code>repeated string request_attributes = 3;</code>
   * @return A list containing the requestAttributes.
   */
  java.util.List<java.lang.String>
      getRequestAttributesList();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional attributes than the default setting of the
   * ``request_attributes`` field.
   * </pre>
   *
   * <code>repeated string request_attributes = 3;</code>
   * @return The count of requestAttributes.
   */
  int getRequestAttributesCount();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional attributes than the default setting of the
   * ``request_attributes`` field.
   * </pre>
   *
   * <code>repeated string request_attributes = 3;</code>
   * @param index The index of the element to return.
   * @return The requestAttributes at the given index.
   */
  java.lang.String getRequestAttributes(int index);
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional attributes than the default setting of the
   * ``request_attributes`` field.
   * </pre>
   *
   * <code>repeated string request_attributes = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the requestAttributes at the given index.
   */
  com.google.protobuf.ByteString
      getRequestAttributesBytes(int index);

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional properties than the default setting of the
   * ``response_attributes`` field.
   * </pre>
   *
   * <code>repeated string response_attributes = 4;</code>
   * @return A list containing the responseAttributes.
   */
  java.util.List<java.lang.String>
      getResponseAttributesList();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional properties than the default setting of the
   * ``response_attributes`` field.
   * </pre>
   *
   * <code>repeated string response_attributes = 4;</code>
   * @return The count of responseAttributes.
   */
  int getResponseAttributesCount();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional properties than the default setting of the
   * ``response_attributes`` field.
   * </pre>
   *
   * <code>repeated string response_attributes = 4;</code>
   * @param index The index of the element to return.
   * @return The responseAttributes at the given index.
   */
  java.lang.String getResponseAttributes(int index);
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Set different optional properties than the default setting of the
   * ``response_attributes`` field.
   * </pre>
   *
   * <code>repeated string response_attributes = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the responseAttributes at the given index.
   */
  com.google.protobuf.ByteString
      getResponseAttributesBytes(int index);

  /**
   * <pre>
   * Set a different gRPC service for this route than the default.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 5;</code>
   * @return Whether the grpcService field is set.
   */
  boolean hasGrpcService();
  /**
   * <pre>
   * Set a different gRPC service for this route than the default.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 5;</code>
   * @return The grpcService.
   */
  io.envoyproxy.envoy.config.core.v3.GrpcService getGrpcService();
  /**
   * <pre>
   * Set a different gRPC service for this route than the default.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getGrpcServiceOrBuilder();
}