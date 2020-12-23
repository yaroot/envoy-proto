# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/intent_event.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel import event_handler_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_event__handler__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/intent_event.proto',
  package='google.actions.sdk.v2.interactionmodel',
  syntax='proto3',
  serialized_options=b'\n*com.google.actions.sdk.v2.interactionmodelB\020IntentEventProtoP\001ZVgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel;interactionmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/actions/sdk/v2/interactionmodel/intent_event.proto\x12&google.actions.sdk.v2.interactionmodel\x1a:google/actions/sdk/v2/interactionmodel/event_handler.proto\x1a\x1fgoogle/api/field_behavior.proto\"\x90\x01\n\x0bIntentEvent\x12\x13\n\x06intent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12 \n\x13transition_to_scene\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12J\n\x07handler\x18\x03 \x01(\x0b\x32\x34.google.actions.sdk.v2.interactionmodel.EventHandlerB\x03\xe0\x41\x01\x42\x98\x01\n*com.google.actions.sdk.v2.interactionmodelB\x10IntentEventProtoP\x01ZVgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel;interactionmodelb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_event__handler__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_INTENTEVENT = _descriptor.Descriptor(
  name='IntentEvent',
  full_name='google.actions.sdk.v2.interactionmodel.IntentEvent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='intent', full_name='google.actions.sdk.v2.interactionmodel.IntentEvent.intent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transition_to_scene', full_name='google.actions.sdk.v2.interactionmodel.IntentEvent.transition_to_scene', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='handler', full_name='google.actions.sdk.v2.interactionmodel.IntentEvent.handler', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=195,
  serialized_end=339,
)

_INTENTEVENT.fields_by_name['handler'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_event__handler__pb2._EVENTHANDLER
DESCRIPTOR.message_types_by_name['IntentEvent'] = _INTENTEVENT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

IntentEvent = _reflection.GeneratedProtocolMessageType('IntentEvent', (_message.Message,), {
  'DESCRIPTOR' : _INTENTEVENT,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.intent_event_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.IntentEvent)
  })
_sym_db.RegisterMessage(IntentEvent)


DESCRIPTOR._options = None
_INTENTEVENT.fields_by_name['intent']._options = None
_INTENTEVENT.fields_by_name['transition_to_scene']._options = None
_INTENTEVENT.fields_by_name['handler']._options = None
# @@protoc_insertion_point(module_scope)
