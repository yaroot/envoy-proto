// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/library/v1/library.proto

package com.google.example.library.v1;

public interface ShelfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.example.library.v1.Shelf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the shelf.
   * Shelf names have the form `shelves/{shelf_id}`.
   * The name is ignored when creating a shelf.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the shelf.
   * Shelf names have the form `shelves/{shelf_id}`.
   * The name is ignored when creating a shelf.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The theme of the shelf
   * </pre>
   *
   * <code>string theme = 2;</code>
   * @return The theme.
   */
  java.lang.String getTheme();
  /**
   * <pre>
   * The theme of the shelf
   * </pre>
   *
   * <code>string theme = 2;</code>
   * @return The bytes for theme.
   */
  com.google.protobuf.ByteString
      getThemeBytes();
}