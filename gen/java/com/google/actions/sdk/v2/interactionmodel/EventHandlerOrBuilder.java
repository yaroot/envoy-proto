// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/event_handler.proto

package com.google.actions.sdk.v2.interactionmodel;

public interface EventHandlerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.interactionmodel.EventHandler)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the webhook handler to call.
   * </pre>
   *
   * <code>string webhook_handler = 1;</code>
   * @return The webhookHandler.
   */
  java.lang.String getWebhookHandler();
  /**
   * <pre>
   * Name of the webhook handler to call.
   * </pre>
   *
   * <code>string webhook_handler = 1;</code>
   * @return The bytes for webhookHandler.
   */
  com.google.protobuf.ByteString
      getWebhookHandlerBytes();

  /**
   * <pre>
   * Inlined static prompt. Can contain references to string resources in
   * bundles.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.StaticPrompt static_prompt = 2;</code>
   * @return Whether the staticPrompt field is set.
   */
  boolean hasStaticPrompt();
  /**
   * <pre>
   * Inlined static prompt. Can contain references to string resources in
   * bundles.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.StaticPrompt static_prompt = 2;</code>
   * @return The staticPrompt.
   */
  com.google.actions.sdk.v2.interactionmodel.prompt.StaticPrompt getStaticPrompt();
  /**
   * <pre>
   * Inlined static prompt. Can contain references to string resources in
   * bundles.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.StaticPrompt static_prompt = 2;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.prompt.StaticPromptOrBuilder getStaticPromptOrBuilder();

  /**
   * <pre>
   * Name of the static prompt to invoke.
   * </pre>
   *
   * <code>string static_prompt_name = 3;</code>
   * @return Whether the staticPromptName field is set.
   */
  boolean hasStaticPromptName();
  /**
   * <pre>
   * Name of the static prompt to invoke.
   * </pre>
   *
   * <code>string static_prompt_name = 3;</code>
   * @return The staticPromptName.
   */
  java.lang.String getStaticPromptName();
  /**
   * <pre>
   * Name of the static prompt to invoke.
   * </pre>
   *
   * <code>string static_prompt_name = 3;</code>
   * @return The bytes for staticPromptName.
   */
  com.google.protobuf.ByteString
      getStaticPromptNameBytes();

  public com.google.actions.sdk.v2.interactionmodel.EventHandler.PromptCase getPromptCase();
}