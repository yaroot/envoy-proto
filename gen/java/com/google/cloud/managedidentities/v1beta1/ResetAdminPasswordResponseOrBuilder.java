// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/managedidentities/v1beta1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1beta1;

public interface ResetAdminPasswordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
   * </pre>
   *
   * <code>string password = 1;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * A random password. See [admin][google.cloud.managedidentities.v1beta1.Domain.admin] for more information.
   * </pre>
   *
   * <code>string password = 1;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}