// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/library/v1/library.proto

package com.google.example.library.v1;

public interface MoveBookRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.example.library.v1.MoveBookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the book to move.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the book to move.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The name of the destination shelf.
   * </pre>
   *
   * <code>string other_shelf_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The otherShelfName.
   */
  java.lang.String getOtherShelfName();
  /**
   * <pre>
   * The name of the destination shelf.
   * </pre>
   *
   * <code>string other_shelf_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for otherShelfName.
   */
  com.google.protobuf.ByteString
      getOtherShelfNameBytes();
}