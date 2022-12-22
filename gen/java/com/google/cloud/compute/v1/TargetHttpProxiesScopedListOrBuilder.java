// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface TargetHttpProxiesScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetHttpProxiesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of TargetHttpProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy target_http_proxies = 162147011;</code>
   */
  java.util.List<com.google.cloud.compute.v1.TargetHttpProxy> 
      getTargetHttpProxiesList();
  /**
   * <pre>
   * A list of TargetHttpProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy target_http_proxies = 162147011;</code>
   */
  com.google.cloud.compute.v1.TargetHttpProxy getTargetHttpProxies(int index);
  /**
   * <pre>
   * A list of TargetHttpProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy target_http_proxies = 162147011;</code>
   */
  int getTargetHttpProxiesCount();
  /**
   * <pre>
   * A list of TargetHttpProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy target_http_proxies = 162147011;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.TargetHttpProxyOrBuilder> 
      getTargetHttpProxiesOrBuilderList();
  /**
   * <pre>
   * A list of TargetHttpProxies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy target_http_proxies = 162147011;</code>
   */
  com.google.cloud.compute.v1.TargetHttpProxyOrBuilder getTargetHttpProxiesOrBuilder(
      int index);

  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}