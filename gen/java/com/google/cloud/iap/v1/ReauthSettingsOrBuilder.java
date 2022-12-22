// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iap/v1/service.proto

package com.google.cloud.iap.v1;

public interface ReauthSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.ReauthSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reauth method requested.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ReauthSettings.Method method = 1;</code>
   * @return The enum numeric value on the wire for method.
   */
  int getMethodValue();
  /**
   * <pre>
   * Reauth method requested.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ReauthSettings.Method method = 1;</code>
   * @return The method.
   */
  com.google.cloud.iap.v1.ReauthSettings.Method getMethod();

  /**
   * <pre>
   * Reauth session lifetime, how long before a user has to reauthenticate
   * again.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 2;</code>
   * @return Whether the maxAge field is set.
   */
  boolean hasMaxAge();
  /**
   * <pre>
   * Reauth session lifetime, how long before a user has to reauthenticate
   * again.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 2;</code>
   * @return The maxAge.
   */
  com.google.protobuf.Duration getMaxAge();
  /**
   * <pre>
   * Reauth session lifetime, how long before a user has to reauthenticate
   * again.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxAgeOrBuilder();

  /**
   * <pre>
   * How IAP determines the effective policy in cases of hierarchial policies.
   * Policies are merged from higher in the hierarchy to lower in the hierarchy.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ReauthSettings.PolicyType policy_type = 3;</code>
   * @return The enum numeric value on the wire for policyType.
   */
  int getPolicyTypeValue();
  /**
   * <pre>
   * How IAP determines the effective policy in cases of hierarchial policies.
   * Policies are merged from higher in the hierarchy to lower in the hierarchy.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.ReauthSettings.PolicyType policy_type = 3;</code>
   * @return The policyType.
   */
  com.google.cloud.iap.v1.ReauthSettings.PolicyType getPolicyType();
}