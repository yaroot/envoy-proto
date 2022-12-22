// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/scene.proto

package com.google.actions.sdk.v2.interactionmodel;

public interface SceneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.interactionmodel.Scene)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Handler to invoke when transitioning into this scene.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler on_enter = 1;</code>
   * @return Whether the onEnter field is set.
   */
  boolean hasOnEnter();
  /**
   * <pre>
   * Handler to invoke when transitioning into this scene.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler on_enter = 1;</code>
   * @return The onEnter.
   */
  com.google.actions.sdk.v2.interactionmodel.EventHandler getOnEnter();
  /**
   * <pre>
   * Handler to invoke when transitioning into this scene.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler on_enter = 1;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.EventHandlerOrBuilder getOnEnterOrBuilder();

  /**
   * <pre>
   * The list of events that trigger based on intents. These events can
   * be triggered at any time after the on_load Handler has been called.
   * Important - these events define the set of intents which are scoped to
   * this scene and will take precedence over any globally defined events that
   * have the same intents or their triggering phrases. Intent names must be
   * unique within a scene.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.IntentEvent intent_events = 2;</code>
   */
  java.util.List<com.google.actions.sdk.v2.interactionmodel.IntentEvent> 
      getIntentEventsList();
  /**
   * <pre>
   * The list of events that trigger based on intents. These events can
   * be triggered at any time after the on_load Handler has been called.
   * Important - these events define the set of intents which are scoped to
   * this scene and will take precedence over any globally defined events that
   * have the same intents or their triggering phrases. Intent names must be
   * unique within a scene.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.IntentEvent intent_events = 2;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.IntentEvent getIntentEvents(int index);
  /**
   * <pre>
   * The list of events that trigger based on intents. These events can
   * be triggered at any time after the on_load Handler has been called.
   * Important - these events define the set of intents which are scoped to
   * this scene and will take precedence over any globally defined events that
   * have the same intents or their triggering phrases. Intent names must be
   * unique within a scene.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.IntentEvent intent_events = 2;</code>
   */
  int getIntentEventsCount();
  /**
   * <pre>
   * The list of events that trigger based on intents. These events can
   * be triggered at any time after the on_load Handler has been called.
   * Important - these events define the set of intents which are scoped to
   * this scene and will take precedence over any globally defined events that
   * have the same intents or their triggering phrases. Intent names must be
   * unique within a scene.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.IntentEvent intent_events = 2;</code>
   */
  java.util.List<? extends com.google.actions.sdk.v2.interactionmodel.IntentEventOrBuilder> 
      getIntentEventsOrBuilderList();
  /**
   * <pre>
   * The list of events that trigger based on intents. These events can
   * be triggered at any time after the on_load Handler has been called.
   * Important - these events define the set of intents which are scoped to
   * this scene and will take precedence over any globally defined events that
   * have the same intents or their triggering phrases. Intent names must be
   * unique within a scene.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.IntentEvent intent_events = 2;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.IntentEventOrBuilder getIntentEventsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of events to trigger based on conditional statements. These are
   * evaluated after the form has been filled or immediately after on_load if
   * this scene does not have a form (evaluation is only done once). Only the
   * first matching event will be triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.ConditionalEvent conditional_events = 3;</code>
   */
  java.util.List<com.google.actions.sdk.v2.interactionmodel.ConditionalEvent> 
      getConditionalEventsList();
  /**
   * <pre>
   * The list of events to trigger based on conditional statements. These are
   * evaluated after the form has been filled or immediately after on_load if
   * this scene does not have a form (evaluation is only done once). Only the
   * first matching event will be triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.ConditionalEvent conditional_events = 3;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.ConditionalEvent getConditionalEvents(int index);
  /**
   * <pre>
   * The list of events to trigger based on conditional statements. These are
   * evaluated after the form has been filled or immediately after on_load if
   * this scene does not have a form (evaluation is only done once). Only the
   * first matching event will be triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.ConditionalEvent conditional_events = 3;</code>
   */
  int getConditionalEventsCount();
  /**
   * <pre>
   * The list of events to trigger based on conditional statements. These are
   * evaluated after the form has been filled or immediately after on_load if
   * this scene does not have a form (evaluation is only done once). Only the
   * first matching event will be triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.ConditionalEvent conditional_events = 3;</code>
   */
  java.util.List<? extends com.google.actions.sdk.v2.interactionmodel.ConditionalEventOrBuilder> 
      getConditionalEventsOrBuilderList();
  /**
   * <pre>
   * The list of events to trigger based on conditional statements. These are
   * evaluated after the form has been filled or immediately after on_load if
   * this scene does not have a form (evaluation is only done once). Only the
   * first matching event will be triggered.
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.ConditionalEvent conditional_events = 3;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.ConditionalEventOrBuilder getConditionalEventsOrBuilder(
      int index);

  /**
   * <pre>
   * Ordered list of slots. Each slot defines the type of data
   * that it will resolve and configuration to customize the experience of this
   * resolution (e.g. prompts).
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.Slot slots = 4;</code>
   */
  java.util.List<com.google.actions.sdk.v2.interactionmodel.Slot> 
      getSlotsList();
  /**
   * <pre>
   * Ordered list of slots. Each slot defines the type of data
   * that it will resolve and configuration to customize the experience of this
   * resolution (e.g. prompts).
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.Slot slots = 4;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.Slot getSlots(int index);
  /**
   * <pre>
   * Ordered list of slots. Each slot defines the type of data
   * that it will resolve and configuration to customize the experience of this
   * resolution (e.g. prompts).
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.Slot slots = 4;</code>
   */
  int getSlotsCount();
  /**
   * <pre>
   * Ordered list of slots. Each slot defines the type of data
   * that it will resolve and configuration to customize the experience of this
   * resolution (e.g. prompts).
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.Slot slots = 4;</code>
   */
  java.util.List<? extends com.google.actions.sdk.v2.interactionmodel.SlotOrBuilder> 
      getSlotsOrBuilderList();
  /**
   * <pre>
   * Ordered list of slots. Each slot defines the type of data
   * that it will resolve and configuration to customize the experience of this
   * resolution (e.g. prompts).
   * </pre>
   *
   * <code>repeated .google.actions.sdk.v2.interactionmodel.Slot slots = 4;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.SlotOrBuilder getSlotsOrBuilder(
      int index);

  /**
   * <pre>
   * Handler called when there is a change in state of a slot not
   * caused by updates within another Handler. This allows slots to be
   * invalidated, the scene invalidated or other changes to scene state.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler on_slot_updated = 5;</code>
   * @return Whether the onSlotUpdated field is set.
   */
  boolean hasOnSlotUpdated();
  /**
   * <pre>
   * Handler called when there is a change in state of a slot not
   * caused by updates within another Handler. This allows slots to be
   * invalidated, the scene invalidated or other changes to scene state.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler on_slot_updated = 5;</code>
   * @return The onSlotUpdated.
   */
  com.google.actions.sdk.v2.interactionmodel.EventHandler getOnSlotUpdated();
  /**
   * <pre>
   * Handler called when there is a change in state of a slot not
   * caused by updates within another Handler. This allows slots to be
   * invalidated, the scene invalidated or other changes to scene state.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.EventHandler on_slot_updated = 5;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.EventHandlerOrBuilder getOnSlotUpdatedOrBuilder();
}