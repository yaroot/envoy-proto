// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/conversation/prompt/suggestion.proto

package com.google.actions.sdk.v2.conversation;

public interface SuggestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.conversation.Suggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The text shown in the suggestion chip. When tapped, this text will be
   * posted back to the conversation verbatim as if the user had typed it.
   * Each title must be unique among the set of suggestion chips.
   * Max 25 chars
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Required. The text shown in the suggestion chip. When tapped, this text will be
   * posted back to the conversation verbatim as if the user had typed it.
   * Each title must be unique among the set of suggestion chips.
   * Max 25 chars
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}