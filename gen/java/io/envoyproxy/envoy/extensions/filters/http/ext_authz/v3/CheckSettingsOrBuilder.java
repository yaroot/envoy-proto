// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ext_authz/v3/ext_authz.proto

package io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3;

public interface CheckSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ext_authz.v3.CheckSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Context extensions to set on the CheckRequest's
   * :ref:`AttributeContext.context_extensions&lt;envoy_v3_api_field_service.auth.v3.AttributeContext.context_extensions&gt;`
   * You can use this to provide extra context for the external authorization server on specific
   * virtual hosts/routes. For example, adding a context extension on the virtual host level can
   * give the ext-authz server information on what virtual host is used without needing to parse the
   * host header. If CheckSettings is specified in multiple per-filter-configs, they will be merged
   * in order, and the result will be used.
   * Merge semantics for this field are such that keys from more specific configs override.
   * .. note::
   *   These settings are only applied to a filter configured with a
   *   :ref:`grpc_service&lt;envoy_v3_api_field_extensions.filters.http.ext_authz.v3.ExtAuthz.grpc_service&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  int getContextExtensionsCount();
  /**
   * <pre>
   * Context extensions to set on the CheckRequest's
   * :ref:`AttributeContext.context_extensions&lt;envoy_v3_api_field_service.auth.v3.AttributeContext.context_extensions&gt;`
   * You can use this to provide extra context for the external authorization server on specific
   * virtual hosts/routes. For example, adding a context extension on the virtual host level can
   * give the ext-authz server information on what virtual host is used without needing to parse the
   * host header. If CheckSettings is specified in multiple per-filter-configs, they will be merged
   * in order, and the result will be used.
   * Merge semantics for this field are such that keys from more specific configs override.
   * .. note::
   *   These settings are only applied to a filter configured with a
   *   :ref:`grpc_service&lt;envoy_v3_api_field_extensions.filters.http.ext_authz.v3.ExtAuthz.grpc_service&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  boolean containsContextExtensions(
      java.lang.String key);
  /**
   * Use {@link #getContextExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getContextExtensions();
  /**
   * <pre>
   * Context extensions to set on the CheckRequest's
   * :ref:`AttributeContext.context_extensions&lt;envoy_v3_api_field_service.auth.v3.AttributeContext.context_extensions&gt;`
   * You can use this to provide extra context for the external authorization server on specific
   * virtual hosts/routes. For example, adding a context extension on the virtual host level can
   * give the ext-authz server information on what virtual host is used without needing to parse the
   * host header. If CheckSettings is specified in multiple per-filter-configs, they will be merged
   * in order, and the result will be used.
   * Merge semantics for this field are such that keys from more specific configs override.
   * .. note::
   *   These settings are only applied to a filter configured with a
   *   :ref:`grpc_service&lt;envoy_v3_api_field_extensions.filters.http.ext_authz.v3.ExtAuthz.grpc_service&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getContextExtensionsMap();
  /**
   * <pre>
   * Context extensions to set on the CheckRequest's
   * :ref:`AttributeContext.context_extensions&lt;envoy_v3_api_field_service.auth.v3.AttributeContext.context_extensions&gt;`
   * You can use this to provide extra context for the external authorization server on specific
   * virtual hosts/routes. For example, adding a context extension on the virtual host level can
   * give the ext-authz server information on what virtual host is used without needing to parse the
   * host header. If CheckSettings is specified in multiple per-filter-configs, they will be merged
   * in order, and the result will be used.
   * Merge semantics for this field are such that keys from more specific configs override.
   * .. note::
   *   These settings are only applied to a filter configured with a
   *   :ref:`grpc_service&lt;envoy_v3_api_field_extensions.filters.http.ext_authz.v3.ExtAuthz.grpc_service&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  /* nullable */
java.lang.String getContextExtensionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Context extensions to set on the CheckRequest's
   * :ref:`AttributeContext.context_extensions&lt;envoy_v3_api_field_service.auth.v3.AttributeContext.context_extensions&gt;`
   * You can use this to provide extra context for the external authorization server on specific
   * virtual hosts/routes. For example, adding a context extension on the virtual host level can
   * give the ext-authz server information on what virtual host is used without needing to parse the
   * host header. If CheckSettings is specified in multiple per-filter-configs, they will be merged
   * in order, and the result will be used.
   * Merge semantics for this field are such that keys from more specific configs override.
   * .. note::
   *   These settings are only applied to a filter configured with a
   *   :ref:`grpc_service&lt;envoy_v3_api_field_extensions.filters.http.ext_authz.v3.ExtAuthz.grpc_service&gt;`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 1 [(.udpa.annotations.sensitive) = true];</code>
   */
  java.lang.String getContextExtensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * When set to true, disable the configured :ref:`with_request_body
   * &lt;envoy_v3_api_field_extensions.filters.http.ext_authz.v3.ExtAuthz.with_request_body&gt;` for a route.
   * </pre>
   *
   * <code>bool disable_request_body_buffering = 2;</code>
   * @return The disableRequestBodyBuffering.
   */
  boolean getDisableRequestBodyBuffering();
}