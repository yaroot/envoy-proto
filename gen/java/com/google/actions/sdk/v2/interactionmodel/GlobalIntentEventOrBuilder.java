// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/global_intent_event.proto

package com.google.actions.sdk.v2.interactionmodel;

public interface GlobalIntentEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.interactionmodel.GlobalIntentEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Destination scene which the conversation should jump to. The state of the
   * current scene is destroyed on the transition.
   * </pre>
   *
   * <code>string transition_to_scene = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The transitionToScene.
   */
  java.lang.String getTransitionToScene();
  /**
   * <pre>
   * Optional. Destination scene which the conversation should jump to. The state of the
   * current scene is destroyed on the transition.
   * </pre>
   *
   * <code>string transition_to_scene = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for transitionToScene.
   */
  com.google.protobuf.ByteString
      getTransitionToSceneBytes();

  /**
   * <pre>
   * Optional. Event handler which is triggered when the intent is matched. Should execute
   * before transitioning to the destination scene. Useful to generate Prompts
   * in response to events.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler handler = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the handler field is set.
   */
  boolean hasHandler();
  /**
   * <pre>
   * Optional. Event handler which is triggered when the intent is matched. Should execute
   * before transitioning to the destination scene. Useful to generate Prompts
   * in response to events.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler handler = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The handler.
   */
  com.google.actions.sdk.v2.interactionmodel.EventHandler getHandler();
  /**
   * <pre>
   * Optional. Event handler which is triggered when the intent is matched. Should execute
   * before transitioning to the destination scene. Useful to generate Prompts
   * in response to events.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler handler = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.actions.sdk.v2.interactionmodel.EventHandlerOrBuilder getHandlerOrBuilder();
}