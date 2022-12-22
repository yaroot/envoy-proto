// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/network_settings.proto

package com.google.appengine.v1beta;

public interface NetworkSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1beta.NetworkSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ingress settings for version or service.
   * </pre>
   *
   * <code>.google.appengine.v1beta.NetworkSettings.IngressTrafficAllowed ingress_traffic_allowed = 1;</code>
   * @return The enum numeric value on the wire for ingressTrafficAllowed.
   */
  int getIngressTrafficAllowedValue();
  /**
   * <pre>
   * The ingress settings for version or service.
   * </pre>
   *
   * <code>.google.appengine.v1beta.NetworkSettings.IngressTrafficAllowed ingress_traffic_allowed = 1;</code>
   * @return The ingressTrafficAllowed.
   */
  com.google.appengine.v1beta.NetworkSettings.IngressTrafficAllowed getIngressTrafficAllowed();
}