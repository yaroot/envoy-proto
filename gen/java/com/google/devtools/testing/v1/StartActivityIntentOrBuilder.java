// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

public interface StartActivityIntentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.StartActivityIntent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Action name.
   * Required for START_ACTIVITY.
   * </pre>
   *
   * <code>string action = 2;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * Action name.
   * Required for START_ACTIVITY.
   * </pre>
   *
   * <code>string action = 2;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * URI for the action.
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * URI for the action.
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @return A list containing the categories.
   */
  java.util.List<java.lang.String>
      getCategoriesList();
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @return The count of categories.
   */
  int getCategoriesCount();
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @param index The index of the element to return.
   * @return The categories at the given index.
   */
  java.lang.String getCategories(int index);
  /**
   * <pre>
   * Intent categories to set on the intent.
   * </pre>
   *
   * <code>repeated string categories = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the categories at the given index.
   */
  com.google.protobuf.ByteString
      getCategoriesBytes(int index);
}