// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/conversation/prompt/content/list.proto

package com.google.actions.sdk.v2.conversation;

public interface ListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.conversation.List)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Title of the list. Optional.
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Title of the list. Optional.
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Subtitle of the list. Optional.
   * </pre>
   *
   * <code>string subtitle = 2;</code>
   * @return The subtitle.
   */
  java.lang.String getSubtitle();
  /**
   * <pre>
   * Subtitle of the list. Optional.
   * </pre>
   *
   * <code>string subtitle = 2;</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <pre>
   * min: 2 max: 30
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.conversation.List.ListItem items = 3;</code>
   */
  java.util.List<com.google.actions.sdk.v2.conversation.List.ListItem> 
      getItemsList();
  /**
   * <pre>
   * min: 2 max: 30
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.conversation.List.ListItem items = 3;</code>
   */
  com.google.actions.sdk.v2.conversation.List.ListItem getItems(int index);
  /**
   * <pre>
   * min: 2 max: 30
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.conversation.List.ListItem items = 3;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * min: 2 max: 30
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.conversation.List.ListItem items = 3;</code>
   */
  java.util.List<? extends com.google.actions.sdk.v2.conversation.List.ListItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * min: 2 max: 30
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.conversation.List.ListItem items = 3;</code>
   */
  com.google.actions.sdk.v2.conversation.List.ListItemOrBuilder getItemsOrBuilder(
      int index);
}
