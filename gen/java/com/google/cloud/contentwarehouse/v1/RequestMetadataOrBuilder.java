// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/common.proto

package com.google.cloud.contentwarehouse.v1;

public interface RequestMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.RequestMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides user unique identification and groups information.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UserInfo user_info = 1;</code>
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   * <pre>
   * Provides user unique identification and groups information.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UserInfo user_info = 1;</code>
   * @return The userInfo.
   */
  com.google.cloud.contentwarehouse.v1.UserInfo getUserInfo();
  /**
   * <pre>
   * Provides user unique identification and groups information.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UserInfo user_info = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder getUserInfoOrBuilder();
}