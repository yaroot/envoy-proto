# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/event_logs.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.conversation import intent_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_intent__pb2
from google.actions.sdk.v2.conversation.prompt import prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_prompt__pb2
from google.actions.sdk.v2.conversation import scene_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_scene__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&google/actions/sdk/v2/event_logs.proto\x12\x15google.actions.sdk.v2\x1a/google/actions/sdk/v2/conversation/intent.proto\x1a\x36google/actions/sdk/v2/conversation/prompt/prompt.proto\x1a.google/actions/sdk/v2/conversation/scene.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xb7\x08\n\x0e\x45xecutionEvent\x12.\n\nevent_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12>\n\x0f\x65xecution_state\x18\x02 \x01(\x0b\x32%.google.actions.sdk.v2.ExecutionState\x12\"\n\x06status\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12\x42\n\nuser_input\x18\x04 \x01(\x0b\x32,.google.actions.sdk.v2.UserConversationInputH\x00\x12:\n\x0cintent_match\x18\x05 \x01(\x0b\x32\".google.actions.sdk.v2.IntentMatchH\x00\x12J\n\x14\x63onditions_evaluated\x18\x06 \x01(\x0b\x32*.google.actions.sdk.v2.ConditionsEvaluatedH\x00\x12=\n\x0eon_scene_enter\x18\x07 \x01(\x0b\x32#.google.actions.sdk.v2.OnSceneEnterH\x00\x12@\n\x0fwebhook_request\x18\x08 \x01(\x0b\x32%.google.actions.sdk.v2.WebhookRequestH\x00\x12\x42\n\x10webhook_response\x18\t \x01(\x0b\x32&.google.actions.sdk.v2.WebhookResponseH\x00\x12Y\n\x1cwebhook_initiated_transition\x18\n \x01(\x0b\x32\x31.google.actions.sdk.v2.WebhookInitiatedTransitionH\x00\x12\x36\n\nslot_match\x18\x0b \x01(\x0b\x32 .google.actions.sdk.v2.SlotMatchH\x00\x12>\n\x0eslot_requested\x18\x0c \x01(\x0b\x32$.google.actions.sdk.v2.SlotRequestedH\x00\x12>\n\x0eslot_validated\x18\r \x01(\x0b\x32$.google.actions.sdk.v2.SlotValidatedH\x00\x12\x38\n\x0b\x66orm_filled\x18\x0e \x01(\x0b\x32!.google.actions.sdk.v2.FormFilledH\x00\x12H\n\x12waiting_user_input\x18\x0f \x01(\x0b\x32*.google.actions.sdk.v2.WaitingForUserInputH\x00\x12\x42\n\x10\x65nd_conversation\x18\x10 \x01(\x0b\x32&.google.actions.sdk.v2.EndConversationH\x00\x12\x18\n\x10warning_messages\x18\x11 \x03(\tB\x0b\n\tEventData\"\xae\x02\n\x0e\x45xecutionState\x12\x18\n\x10\x63urrent_scene_id\x18\x01 \x01(\t\x12\x30\n\x0fsession_storage\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct\x12+\n\x05slots\x18\x05 \x01(\x0b\x32\x1c.google.actions.sdk.v2.Slots\x12@\n\x0cprompt_queue\x18\x07 \x03(\x0b\x32*.google.actions.sdk.v2.conversation.Prompt\x12-\n\x0cuser_storage\x18\x06 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x32\n\x11household_storage\x18\x08 \x01(\x0b\x32\x17.google.protobuf.Struct\"\xde\x01\n\x05Slots\x12\x45\n\x06status\x18\x02 \x01(\x0e\x32\x35.google.actions.sdk.v2.conversation.SlotFillingStatus\x12\x36\n\x05slots\x18\x03 \x03(\x0b\x32\'.google.actions.sdk.v2.Slots.SlotsEntry\x1aV\n\nSlotsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x37\n\x05value\x18\x02 \x01(\x0b\x32(.google.actions.sdk.v2.conversation.Slot:\x02\x38\x01\"=\n\x15UserConversationInput\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x16\n\x0eoriginal_query\x18\x02 \x01(\t\"\x90\x02\n\x0bIntentMatch\x12\x11\n\tintent_id\x18\x01 \x01(\t\x12S\n\x11intent_parameters\x18\x05 \x03(\x0b\x32\x38.google.actions.sdk.v2.IntentMatch.IntentParametersEntry\x12\x0f\n\x07handler\x18\x03 \x01(\t\x12\x15\n\rnext_scene_id\x18\x04 \x01(\t\x1aq\n\x15IntentParametersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12G\n\x05value\x18\x02 \x01(\x0b\x32\x38.google.actions.sdk.v2.conversation.IntentParameterValue:\x02\x38\x01\"\x8f\x01\n\x13\x43onditionsEvaluated\x12;\n\x11\x66\x61iled_conditions\x18\x01 \x03(\x0b\x32 .google.actions.sdk.v2.Condition\x12;\n\x11success_condition\x18\x02 \x01(\x0b\x32 .google.actions.sdk.v2.Condition\"G\n\tCondition\x12\x12\n\nexpression\x18\x01 \x01(\t\x12\x0f\n\x07handler\x18\x02 \x01(\t\x12\x15\n\rnext_scene_id\x18\x03 \x01(\t\"\x1f\n\x0cOnSceneEnter\x12\x0f\n\x07handler\x18\x01 \x01(\t\"3\n\x1aWebhookInitiatedTransition\x12\x15\n\rnext_scene_id\x18\x01 \x01(\t\"&\n\x0eWebhookRequest\x12\x14\n\x0crequest_json\x18\x01 \x01(\t\"(\n\x0fWebhookResponse\x12\x15\n\rresponse_json\x18\x01 \x01(\t\"\xc8\x01\n\tSlotMatch\x12K\n\x0enlu_parameters\x18\x02 \x03(\x0b\x32\x33.google.actions.sdk.v2.SlotMatch.NluParametersEntry\x1an\n\x12NluParametersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12G\n\x05value\x18\x02 \x01(\x0b\x32\x38.google.actions.sdk.v2.conversation.IntentParameterValue:\x02\x38\x01\"Y\n\rSlotRequested\x12\x0c\n\x04slot\x18\x01 \x01(\t\x12:\n\x06prompt\x18\x03 \x01(\x0b\x32*.google.actions.sdk.v2.conversation.Prompt\"\x0f\n\rSlotValidated\"\x0c\n\nFormFilled\"\x15\n\x13WaitingForUserInput\"\x11\n\x0f\x45ndConversationBg\n\x19\x63om.google.actions.sdk.v2B\x0e\x45ventLogsProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.actions.sdk.v2.event_logs_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.actions.sdk.v2B\016EventLogsProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk'
  _SLOTS_SLOTSENTRY._options = None
  _SLOTS_SLOTSENTRY._serialized_options = b'8\001'
  _INTENTMATCH_INTENTPARAMETERSENTRY._options = None
  _INTENTMATCH_INTENTPARAMETERSENTRY._serialized_options = b'8\001'
  _SLOTMATCH_NLUPARAMETERSENTRY._options = None
  _SLOTMATCH_NLUPARAMETERSENTRY._serialized_options = b'8\001'
  _EXECUTIONEVENT._serialized_start=307
  _EXECUTIONEVENT._serialized_end=1386
  _EXECUTIONSTATE._serialized_start=1389
  _EXECUTIONSTATE._serialized_end=1691
  _SLOTS._serialized_start=1694
  _SLOTS._serialized_end=1916
  _SLOTS_SLOTSENTRY._serialized_start=1830
  _SLOTS_SLOTSENTRY._serialized_end=1916
  _USERCONVERSATIONINPUT._serialized_start=1918
  _USERCONVERSATIONINPUT._serialized_end=1979
  _INTENTMATCH._serialized_start=1982
  _INTENTMATCH._serialized_end=2254
  _INTENTMATCH_INTENTPARAMETERSENTRY._serialized_start=2141
  _INTENTMATCH_INTENTPARAMETERSENTRY._serialized_end=2254
  _CONDITIONSEVALUATED._serialized_start=2257
  _CONDITIONSEVALUATED._serialized_end=2400
  _CONDITION._serialized_start=2402
  _CONDITION._serialized_end=2473
  _ONSCENEENTER._serialized_start=2475
  _ONSCENEENTER._serialized_end=2506
  _WEBHOOKINITIATEDTRANSITION._serialized_start=2508
  _WEBHOOKINITIATEDTRANSITION._serialized_end=2559
  _WEBHOOKREQUEST._serialized_start=2561
  _WEBHOOKREQUEST._serialized_end=2599
  _WEBHOOKRESPONSE._serialized_start=2601
  _WEBHOOKRESPONSE._serialized_end=2641
  _SLOTMATCH._serialized_start=2644
  _SLOTMATCH._serialized_end=2844
  _SLOTMATCH_NLUPARAMETERSENTRY._serialized_start=2734
  _SLOTMATCH_NLUPARAMETERSENTRY._serialized_end=2844
  _SLOTREQUESTED._serialized_start=2846
  _SLOTREQUESTED._serialized_end=2935
  _SLOTVALIDATED._serialized_start=2937
  _SLOTVALIDATED._serialized_end=2952
  _FORMFILLED._serialized_start=2954
  _FORMFILLED._serialized_end=2966
  _WAITINGFORUSERINPUT._serialized_start=2968
  _WAITINGFORUSERINPUT._serialized_end=2989
  _ENDCONVERSATION._serialized_start=2991
  _ENDCONVERSATION._serialized_end=3008
# @@protoc_insertion_point(module_scope)