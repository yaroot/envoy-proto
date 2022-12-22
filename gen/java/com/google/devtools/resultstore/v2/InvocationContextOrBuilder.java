// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/invocation.proto

package com.google.devtools.resultstore.v2;

public interface InvocationContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.InvocationContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A human readable name for the context under which this Invocation was run.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A human readable name for the context under which this Invocation was run.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A URL pointing to a UI containing more information
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * A URL pointing to a UI containing more information
   * </pre>
   *
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}