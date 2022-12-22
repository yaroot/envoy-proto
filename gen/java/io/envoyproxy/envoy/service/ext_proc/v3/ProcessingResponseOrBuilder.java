// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ext_proc/v3/external_processor.proto

package io.envoyproxy.envoy.service.ext_proc.v3;

public interface ProcessingResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.ext_proc.v3.ProcessingResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The server must send back this message in response to a message with the
   * ``request_headers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.HeadersResponse request_headers = 1;</code>
   * @return Whether the requestHeaders field is set.
   */
  boolean hasRequestHeaders();
  /**
   * <pre>
   * The server must send back this message in response to a message with the
   * ``request_headers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.HeadersResponse request_headers = 1;</code>
   * @return The requestHeaders.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.HeadersResponse getRequestHeaders();
  /**
   * <pre>
   * The server must send back this message in response to a message with the
   * ``request_headers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.HeadersResponse request_headers = 1;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.HeadersResponseOrBuilder getRequestHeadersOrBuilder();

  /**
   * <pre>
   * The server must send back this message in response to a message with the
   * ``response_headers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.HeadersResponse response_headers = 2;</code>
   * @return Whether the responseHeaders field is set.
   */
  boolean hasResponseHeaders();
  /**
   * <pre>
   * The server must send back this message in response to a message with the
   * ``response_headers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.HeadersResponse response_headers = 2;</code>
   * @return The responseHeaders.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.HeadersResponse getResponseHeaders();
  /**
   * <pre>
   * The server must send back this message in response to a message with the
   * ``response_headers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.HeadersResponse response_headers = 2;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.HeadersResponseOrBuilder getResponseHeadersOrBuilder();

  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``request_body`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.BodyResponse request_body = 3;</code>
   * @return Whether the requestBody field is set.
   */
  boolean hasRequestBody();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``request_body`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.BodyResponse request_body = 3;</code>
   * @return The requestBody.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse getRequestBody();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``request_body`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.BodyResponse request_body = 3;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.BodyResponseOrBuilder getRequestBodyOrBuilder();

  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``response_body`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.BodyResponse response_body = 4;</code>
   * @return Whether the responseBody field is set.
   */
  boolean hasResponseBody();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``response_body`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.BodyResponse response_body = 4;</code>
   * @return The responseBody.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.BodyResponse getResponseBody();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``response_body`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.BodyResponse response_body = 4;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.BodyResponseOrBuilder getResponseBodyOrBuilder();

  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``request_trailers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.TrailersResponse request_trailers = 5;</code>
   * @return Whether the requestTrailers field is set.
   */
  boolean hasRequestTrailers();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``request_trailers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.TrailersResponse request_trailers = 5;</code>
   * @return The requestTrailers.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.TrailersResponse getRequestTrailers();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``request_trailers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.TrailersResponse request_trailers = 5;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.TrailersResponseOrBuilder getRequestTrailersOrBuilder();

  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``response_trailers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.TrailersResponse response_trailers = 6;</code>
   * @return Whether the responseTrailers field is set.
   */
  boolean hasResponseTrailers();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``response_trailers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.TrailersResponse response_trailers = 6;</code>
   * @return The responseTrailers.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.TrailersResponse getResponseTrailers();
  /**
   * <pre>
   * The server must send back this message in response to a message with
   * the ``response_trailers`` field set.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.TrailersResponse response_trailers = 6;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.TrailersResponseOrBuilder getResponseTrailersOrBuilder();

  /**
   * <pre>
   * If specified, attempt to create a locally generated response, send it
   * downstream, and stop processing additional filters and ignore any
   * additional messages received from the remote server for this request or
   * response. If a response has already started -- for example, if this
   * message is sent response to a ``response_body`` message -- then
   * this will either ship the reply directly to the downstream codec,
   * or reset the stream.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.ImmediateResponse immediate_response = 7;</code>
   * @return Whether the immediateResponse field is set.
   */
  boolean hasImmediateResponse();
  /**
   * <pre>
   * If specified, attempt to create a locally generated response, send it
   * downstream, and stop processing additional filters and ignore any
   * additional messages received from the remote server for this request or
   * response. If a response has already started -- for example, if this
   * message is sent response to a ``response_body`` message -- then
   * this will either ship the reply directly to the downstream codec,
   * or reset the stream.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.ImmediateResponse immediate_response = 7;</code>
   * @return The immediateResponse.
   */
  io.envoyproxy.envoy.service.ext_proc.v3.ImmediateResponse getImmediateResponse();
  /**
   * <pre>
   * If specified, attempt to create a locally generated response, send it
   * downstream, and stop processing additional filters and ignore any
   * additional messages received from the remote server for this request or
   * response. If a response has already started -- for example, if this
   * message is sent response to a ``response_body`` message -- then
   * this will either ship the reply directly to the downstream codec,
   * or reset the stream.
   * </pre>
   *
   * <code>.envoy.service.ext_proc.v3.ImmediateResponse immediate_response = 7;</code>
   */
  io.envoyproxy.envoy.service.ext_proc.v3.ImmediateResponseOrBuilder getImmediateResponseOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Optional metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata will be placed in the namespace ``envoy.filters.http.ext_proc``.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 8;</code>
   * @return Whether the dynamicMetadata field is set.
   */
  boolean hasDynamicMetadata();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Optional metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata will be placed in the namespace ``envoy.filters.http.ext_proc``.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 8;</code>
   * @return The dynamicMetadata.
   */
  com.google.protobuf.Struct getDynamicMetadata();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * Optional metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata will be placed in the namespace ``envoy.filters.http.ext_proc``.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 8;</code>
   */
  com.google.protobuf.StructOrBuilder getDynamicMetadataOrBuilder();

  /**
   * <pre>
   * Override how parts of the HTTP request and response are processed
   * for the duration of this particular request/response only. Servers
   * may use this to intelligently control how requests are processed
   * based on the headers and other metadata that they see.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode mode_override = 9;</code>
   * @return Whether the modeOverride field is set.
   */
  boolean hasModeOverride();
  /**
   * <pre>
   * Override how parts of the HTTP request and response are processed
   * for the duration of this particular request/response only. Servers
   * may use this to intelligently control how requests are processed
   * based on the headers and other metadata that they see.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode mode_override = 9;</code>
   * @return The modeOverride.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode getModeOverride();
  /**
   * <pre>
   * Override how parts of the HTTP request and response are processed
   * for the duration of this particular request/response only. Servers
   * may use this to intelligently control how requests are processed
   * based on the headers and other metadata that they see.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_proc.v3.ProcessingMode mode_override = 9;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_proc.v3.ProcessingModeOrBuilder getModeOverrideOrBuilder();

  public io.envoyproxy.envoy.service.ext_proc.v3.ProcessingResponse.ResponseCase getResponseCase();
}