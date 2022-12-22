// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/apikeys/v2/apikeys.proto

package com.google.api.apikeys.v2;

public interface LookupKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.LookupKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Finds the project that owns the key string value.
   * </pre>
   *
   * <code>string key_string = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The keyString.
   */
  java.lang.String getKeyString();
  /**
   * <pre>
   * Required. Finds the project that owns the key string value.
   * </pre>
   *
   * <code>string key_string = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for keyString.
   */
  com.google.protobuf.ByteString
      getKeyStringBytes();
}