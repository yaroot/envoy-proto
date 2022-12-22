// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iap/v1/service.proto

package com.google.cloud.iap.v1;

public interface CsmSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.CsmSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Audience claim set in the generated RCToken. This value is not validated by
   * IAP.
   * </pre>
   *
   * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
   * @return Whether the rctokenAud field is set.
   */
  boolean hasRctokenAud();
  /**
   * <pre>
   * Audience claim set in the generated RCToken. This value is not validated by
   * IAP.
   * </pre>
   *
   * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
   * @return The rctokenAud.
   */
  com.google.protobuf.StringValue getRctokenAud();
  /**
   * <pre>
   * Audience claim set in the generated RCToken. This value is not validated by
   * IAP.
   * </pre>
   *
   * <code>.google.protobuf.StringValue rctoken_aud = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getRctokenAudOrBuilder();
}