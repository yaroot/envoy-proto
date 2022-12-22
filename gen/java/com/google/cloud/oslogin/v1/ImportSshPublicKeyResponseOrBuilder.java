// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface ImportSshPublicKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.ImportSshPublicKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   * @return Whether the loginProfile field is set.
   */
  boolean hasLoginProfile();
  /**
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   * @return The loginProfile.
   */
  com.google.cloud.oslogin.v1.LoginProfile getLoginProfile();
  /**
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   */
  com.google.cloud.oslogin.v1.LoginProfileOrBuilder getLoginProfileOrBuilder();

  /**
   * <pre>
   * Detailed information about import results.
   * </pre>
   *
   * <code>string details = 2;</code>
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   * <pre>
   * Detailed information about import results.
   * </pre>
   *
   * <code>string details = 2;</code>
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString
      getDetailsBytes();
}