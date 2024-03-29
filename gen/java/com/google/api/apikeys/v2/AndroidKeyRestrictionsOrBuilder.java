// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/apikeys/v2/resources.proto

package com.google.api.apikeys.v2;

public interface AndroidKeyRestrictionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.AndroidKeyRestrictions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  java.util.List<com.google.api.apikeys.v2.AndroidApplication> 
      getAllowedApplicationsList();
  /**
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  com.google.api.apikeys.v2.AndroidApplication getAllowedApplications(int index);
  /**
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  int getAllowedApplicationsCount();
  /**
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  java.util.List<? extends com.google.api.apikeys.v2.AndroidApplicationOrBuilder> 
      getAllowedApplicationsOrBuilderList();
  /**
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  com.google.api.apikeys.v2.AndroidApplicationOrBuilder getAllowedApplicationsOrBuilder(
      int index);
}
