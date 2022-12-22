// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v3/discovery.proto

package io.envoyproxy.envoy.service.discovery.v3;

public interface ResourceLocatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.discovery.v3.ResourceLocator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name to subscribe to.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name to subscribe to.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A set of dynamic parameters used to match against the dynamic parameter
   * constraints on the resource. This allows clients to select between
   * multiple variants of the same resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dynamic_parameters = 2;</code>
   */
  int getDynamicParametersCount();
  /**
   * <pre>
   * A set of dynamic parameters used to match against the dynamic parameter
   * constraints on the resource. This allows clients to select between
   * multiple variants of the same resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dynamic_parameters = 2;</code>
   */
  boolean containsDynamicParameters(
      java.lang.String key);
  /**
   * Use {@link #getDynamicParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDynamicParameters();
  /**
   * <pre>
   * A set of dynamic parameters used to match against the dynamic parameter
   * constraints on the resource. This allows clients to select between
   * multiple variants of the same resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dynamic_parameters = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDynamicParametersMap();
  /**
   * <pre>
   * A set of dynamic parameters used to match against the dynamic parameter
   * constraints on the resource. This allows clients to select between
   * multiple variants of the same resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dynamic_parameters = 2;</code>
   */
  /* nullable */
java.lang.String getDynamicParametersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A set of dynamic parameters used to match against the dynamic parameter
   * constraints on the resource. This allows clients to select between
   * multiple variants of the same resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dynamic_parameters = 2;</code>
   */
  java.lang.String getDynamicParametersOrThrow(
      java.lang.String key);
}
