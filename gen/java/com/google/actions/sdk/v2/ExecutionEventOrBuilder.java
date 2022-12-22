// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/event_logs.proto

package com.google.actions.sdk.v2;

public interface ExecutionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.ExecutionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp when the event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Timestamp when the event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * Timestamp when the event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * State of the execution during this event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.ExecutionState execution_state = 2;</code>
   * @return Whether the executionState field is set.
   */
  boolean hasExecutionState();
  /**
   * <pre>
   * State of the execution during this event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.ExecutionState execution_state = 2;</code>
   * @return The executionState.
   */
  com.google.actions.sdk.v2.ExecutionState getExecutionState();
  /**
   * <pre>
   * State of the execution during this event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.ExecutionState execution_state = 2;</code>
   */
  com.google.actions.sdk.v2.ExecutionStateOrBuilder getExecutionStateOrBuilder();

  /**
   * <pre>
   * Resulting status of particular execution step.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Resulting status of particular execution step.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Resulting status of particular execution step.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * User input handling event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.UserConversationInput user_input = 4;</code>
   * @return Whether the userInput field is set.
   */
  boolean hasUserInput();
  /**
   * <pre>
   * User input handling event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.UserConversationInput user_input = 4;</code>
   * @return The userInput.
   */
  com.google.actions.sdk.v2.UserConversationInput getUserInput();
  /**
   * <pre>
   * User input handling event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.UserConversationInput user_input = 4;</code>
   */
  com.google.actions.sdk.v2.UserConversationInputOrBuilder getUserInputOrBuilder();

  /**
   * <pre>
   * Intent matching event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.IntentMatch intent_match = 5;</code>
   * @return Whether the intentMatch field is set.
   */
  boolean hasIntentMatch();
  /**
   * <pre>
   * Intent matching event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.IntentMatch intent_match = 5;</code>
   * @return The intentMatch.
   */
  com.google.actions.sdk.v2.IntentMatch getIntentMatch();
  /**
   * <pre>
   * Intent matching event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.IntentMatch intent_match = 5;</code>
   */
  com.google.actions.sdk.v2.IntentMatchOrBuilder getIntentMatchOrBuilder();

  /**
   * <pre>
   * Condition evaluation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.ConditionsEvaluated conditions_evaluated = 6;</code>
   * @return Whether the conditionsEvaluated field is set.
   */
  boolean hasConditionsEvaluated();
  /**
   * <pre>
   * Condition evaluation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.ConditionsEvaluated conditions_evaluated = 6;</code>
   * @return The conditionsEvaluated.
   */
  com.google.actions.sdk.v2.ConditionsEvaluated getConditionsEvaluated();
  /**
   * <pre>
   * Condition evaluation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.ConditionsEvaluated conditions_evaluated = 6;</code>
   */
  com.google.actions.sdk.v2.ConditionsEvaluatedOrBuilder getConditionsEvaluatedOrBuilder();

  /**
   * <pre>
   * OnSceneEnter execution event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.OnSceneEnter on_scene_enter = 7;</code>
   * @return Whether the onSceneEnter field is set.
   */
  boolean hasOnSceneEnter();
  /**
   * <pre>
   * OnSceneEnter execution event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.OnSceneEnter on_scene_enter = 7;</code>
   * @return The onSceneEnter.
   */
  com.google.actions.sdk.v2.OnSceneEnter getOnSceneEnter();
  /**
   * <pre>
   * OnSceneEnter execution event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.OnSceneEnter on_scene_enter = 7;</code>
   */
  com.google.actions.sdk.v2.OnSceneEnterOrBuilder getOnSceneEnterOrBuilder();

  /**
   * <pre>
   * Webhook request dispatch event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookRequest webhook_request = 8;</code>
   * @return Whether the webhookRequest field is set.
   */
  boolean hasWebhookRequest();
  /**
   * <pre>
   * Webhook request dispatch event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookRequest webhook_request = 8;</code>
   * @return The webhookRequest.
   */
  com.google.actions.sdk.v2.WebhookRequest getWebhookRequest();
  /**
   * <pre>
   * Webhook request dispatch event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookRequest webhook_request = 8;</code>
   */
  com.google.actions.sdk.v2.WebhookRequestOrBuilder getWebhookRequestOrBuilder();

  /**
   * <pre>
   * Webhook response receipt event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookResponse webhook_response = 9;</code>
   * @return Whether the webhookResponse field is set.
   */
  boolean hasWebhookResponse();
  /**
   * <pre>
   * Webhook response receipt event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookResponse webhook_response = 9;</code>
   * @return The webhookResponse.
   */
  com.google.actions.sdk.v2.WebhookResponse getWebhookResponse();
  /**
   * <pre>
   * Webhook response receipt event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookResponse webhook_response = 9;</code>
   */
  com.google.actions.sdk.v2.WebhookResponseOrBuilder getWebhookResponseOrBuilder();

  /**
   * <pre>
   * Webhook-initiated transition event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookInitiatedTransition webhook_initiated_transition = 10;</code>
   * @return Whether the webhookInitiatedTransition field is set.
   */
  boolean hasWebhookInitiatedTransition();
  /**
   * <pre>
   * Webhook-initiated transition event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookInitiatedTransition webhook_initiated_transition = 10;</code>
   * @return The webhookInitiatedTransition.
   */
  com.google.actions.sdk.v2.WebhookInitiatedTransition getWebhookInitiatedTransition();
  /**
   * <pre>
   * Webhook-initiated transition event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WebhookInitiatedTransition webhook_initiated_transition = 10;</code>
   */
  com.google.actions.sdk.v2.WebhookInitiatedTransitionOrBuilder getWebhookInitiatedTransitionOrBuilder();

  /**
   * <pre>
   * Slot matching event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotMatch slot_match = 11;</code>
   * @return Whether the slotMatch field is set.
   */
  boolean hasSlotMatch();
  /**
   * <pre>
   * Slot matching event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotMatch slot_match = 11;</code>
   * @return The slotMatch.
   */
  com.google.actions.sdk.v2.SlotMatch getSlotMatch();
  /**
   * <pre>
   * Slot matching event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotMatch slot_match = 11;</code>
   */
  com.google.actions.sdk.v2.SlotMatchOrBuilder getSlotMatchOrBuilder();

  /**
   * <pre>
   * Slot requesting event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotRequested slot_requested = 12;</code>
   * @return Whether the slotRequested field is set.
   */
  boolean hasSlotRequested();
  /**
   * <pre>
   * Slot requesting event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotRequested slot_requested = 12;</code>
   * @return The slotRequested.
   */
  com.google.actions.sdk.v2.SlotRequested getSlotRequested();
  /**
   * <pre>
   * Slot requesting event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotRequested slot_requested = 12;</code>
   */
  com.google.actions.sdk.v2.SlotRequestedOrBuilder getSlotRequestedOrBuilder();

  /**
   * <pre>
   * Slot validation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotValidated slot_validated = 13;</code>
   * @return Whether the slotValidated field is set.
   */
  boolean hasSlotValidated();
  /**
   * <pre>
   * Slot validation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotValidated slot_validated = 13;</code>
   * @return The slotValidated.
   */
  com.google.actions.sdk.v2.SlotValidated getSlotValidated();
  /**
   * <pre>
   * Slot validation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.SlotValidated slot_validated = 13;</code>
   */
  com.google.actions.sdk.v2.SlotValidatedOrBuilder getSlotValidatedOrBuilder();

  /**
   * <pre>
   * Form filling event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.FormFilled form_filled = 14;</code>
   * @return Whether the formFilled field is set.
   */
  boolean hasFormFilled();
  /**
   * <pre>
   * Form filling event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.FormFilled form_filled = 14;</code>
   * @return The formFilled.
   */
  com.google.actions.sdk.v2.FormFilled getFormFilled();
  /**
   * <pre>
   * Form filling event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.FormFilled form_filled = 14;</code>
   */
  com.google.actions.sdk.v2.FormFilledOrBuilder getFormFilledOrBuilder();

  /**
   * <pre>
   * Waiting-for-user-input event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WaitingForUserInput waiting_user_input = 15;</code>
   * @return Whether the waitingUserInput field is set.
   */
  boolean hasWaitingUserInput();
  /**
   * <pre>
   * Waiting-for-user-input event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WaitingForUserInput waiting_user_input = 15;</code>
   * @return The waitingUserInput.
   */
  com.google.actions.sdk.v2.WaitingForUserInput getWaitingUserInput();
  /**
   * <pre>
   * Waiting-for-user-input event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WaitingForUserInput waiting_user_input = 15;</code>
   */
  com.google.actions.sdk.v2.WaitingForUserInputOrBuilder getWaitingUserInputOrBuilder();

  /**
   * <pre>
   * End-of-conversation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.EndConversation end_conversation = 16;</code>
   * @return Whether the endConversation field is set.
   */
  boolean hasEndConversation();
  /**
   * <pre>
   * End-of-conversation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.EndConversation end_conversation = 16;</code>
   * @return The endConversation.
   */
  com.google.actions.sdk.v2.EndConversation getEndConversation();
  /**
   * <pre>
   * End-of-conversation event.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.EndConversation end_conversation = 16;</code>
   */
  com.google.actions.sdk.v2.EndConversationOrBuilder getEndConversationOrBuilder();

  /**
   * <pre>
   * List of warnings generated during execution of this Event. Warnings are
   * tips for the developer discovered during the conversation request. These
   * are usually non-critical and do not halt the execution of the request. For
   * example, a warnings might be generated when webhook tries to override a
   * custom Type which does not exist. Errors are reported as a failed status
   * code, but warnings can be present even when the status is OK.
   * </pre>
   *
   * <code>repeated string warning_messages = 17;</code>
   * @return A list containing the warningMessages.
   */
  java.util.List<java.lang.String>
      getWarningMessagesList();
  /**
   * <pre>
   * List of warnings generated during execution of this Event. Warnings are
   * tips for the developer discovered during the conversation request. These
   * are usually non-critical and do not halt the execution of the request. For
   * example, a warnings might be generated when webhook tries to override a
   * custom Type which does not exist. Errors are reported as a failed status
   * code, but warnings can be present even when the status is OK.
   * </pre>
   *
   * <code>repeated string warning_messages = 17;</code>
   * @return The count of warningMessages.
   */
  int getWarningMessagesCount();
  /**
   * <pre>
   * List of warnings generated during execution of this Event. Warnings are
   * tips for the developer discovered during the conversation request. These
   * are usually non-critical and do not halt the execution of the request. For
   * example, a warnings might be generated when webhook tries to override a
   * custom Type which does not exist. Errors are reported as a failed status
   * code, but warnings can be present even when the status is OK.
   * </pre>
   *
   * <code>repeated string warning_messages = 17;</code>
   * @param index The index of the element to return.
   * @return The warningMessages at the given index.
   */
  java.lang.String getWarningMessages(int index);
  /**
   * <pre>
   * List of warnings generated during execution of this Event. Warnings are
   * tips for the developer discovered during the conversation request. These
   * are usually non-critical and do not halt the execution of the request. For
   * example, a warnings might be generated when webhook tries to override a
   * custom Type which does not exist. Errors are reported as a failed status
   * code, but warnings can be present even when the status is OK.
   * </pre>
   *
   * <code>repeated string warning_messages = 17;</code>
   * @param index The index of the value to return.
   * @return The bytes of the warningMessages at the given index.
   */
  com.google.protobuf.ByteString
      getWarningMessagesBytes(int index);

  public com.google.actions.sdk.v2.ExecutionEvent.EventDataCase getEventDataCase();
}