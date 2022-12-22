// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/appengine.proto

package com.google.appengine.v1beta;

public interface BatchUpdateIngressRulesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1beta.BatchUpdateIngressRulesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the Firewall collection to set.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the Firewall collection to set.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1beta.FirewallRule ingress_rules = 2;</code>
   */
  java.util.List<com.google.appengine.v1beta.firewall.FirewallRule> 
      getIngressRulesList();
  /**
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1beta.FirewallRule ingress_rules = 2;</code>
   */
  com.google.appengine.v1beta.firewall.FirewallRule getIngressRules(int index);
  /**
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1beta.FirewallRule ingress_rules = 2;</code>
   */
  int getIngressRulesCount();
  /**
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1beta.FirewallRule ingress_rules = 2;</code>
   */
  java.util.List<? extends com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder> 
      getIngressRulesOrBuilderList();
  /**
   * <pre>
   * A list of FirewallRules to replace the existing set.
   * </pre>
   *
   * <code>repeated .google.appengine.v1beta.FirewallRule ingress_rules = 2;</code>
   */
  com.google.appengine.v1beta.firewall.FirewallRuleOrBuilder getIngressRulesOrBuilder(
      int index);
}