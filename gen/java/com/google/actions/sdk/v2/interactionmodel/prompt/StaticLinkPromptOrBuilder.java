// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/prompt/content/static_link_prompt.proto

package com.google.actions.sdk.v2.interactionmodel.prompt;

public interface StaticLinkPromptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.interactionmodel.prompt.StaticLinkPrompt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the link
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the link
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Defines behavior when the user opens the link.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.OpenUrl open = 2;</code>
   * @return Whether the open field is set.
   */
  boolean hasOpen();
  /**
   * <pre>
   * Defines behavior when the user opens the link.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.OpenUrl open = 2;</code>
   * @return The open.
   */
  com.google.actions.sdk.v2.interactionmodel.prompt.OpenUrl getOpen();
  /**
   * <pre>
   * Defines behavior when the user opens the link.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.OpenUrl open = 2;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.prompt.OpenUrlOrBuilder getOpenOrBuilder();
}