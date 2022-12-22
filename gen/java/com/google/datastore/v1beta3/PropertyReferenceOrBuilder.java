// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/query.proto

package com.google.datastore.v1beta3;

public interface PropertyReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.PropertyReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the property.
   * If name includes "."s, it may be interpreted as a property name path.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the property.
   * If name includes "."s, it may be interpreted as a property name path.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}