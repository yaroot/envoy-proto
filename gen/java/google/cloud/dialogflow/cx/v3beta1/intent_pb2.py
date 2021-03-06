# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/cx/v3beta1/intent.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/dialogflow/cx/v3beta1/intent.proto',
  package='google.cloud.dialogflow.cx.v3beta1',
  syntax='proto3',
  serialized_options=b'\n&com.google.cloud.dialogflow.cx.v3beta1B\013IntentProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/google/cloud/dialogflow/cx/v3beta1/intent.proto\x12\"google.cloud.dialogflow.cx.v3beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb0\x06\n\x06Intent\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12S\n\x10training_phrases\x18\x03 \x03(\x0b\x32\x39.google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase\x12H\n\nparameters\x18\x04 \x03(\x0b\x32\x34.google.cloud.dialogflow.cx.v3beta1.Intent.Parameter\x12\x10\n\x08priority\x18\x05 \x01(\x05\x12\x13\n\x0bis_fallback\x18\x06 \x01(\x08\x12\x46\n\x06labels\x18\x07 \x03(\x0b\x32\x36.google.cloud.dialogflow.cx.v3beta1.Intent.LabelsEntry\x12\x13\n\x0b\x64\x65scription\x18\x08 \x01(\t\x1a\xb7\x01\n\x0eTrainingPhrase\x12\n\n\x02id\x18\x01 \x01(\t\x12R\n\x05parts\x18\x02 \x03(\x0b\x32>.google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.PartB\x03\xe0\x41\x02\x12\x14\n\x0crepeat_count\x18\x03 \x01(\x05\x1a/\n\x04Part\x12\x11\n\x04text\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x0cparameter_id\x18\x02 \x01(\t\x1a\x80\x01\n\tParameter\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x41\n\x0b\x65ntity_type\x18\x02 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\x0f\n\x07is_list\x18\x03 \x01(\x08\x12\x0e\n\x06redact\x18\x04 \x01(\x08\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:n\xea\x41k\n dialogflow.googleapis.com/Intent\x12Gprojects/{project}/locations/{location}/agents/{agent}/intents/{intent}\"\xd1\x01\n\x12ListIntentsRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\x12 dialogflow.googleapis.com/Intent\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\x12\x43\n\x0bintent_view\x18\x05 \x01(\x0e\x32..google.cloud.dialogflow.cx.v3beta1.IntentView\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"k\n\x13ListIntentsResponse\x12;\n\x07intents\x18\x01 \x03(\x0b\x32*.google.cloud.dialogflow.cx.v3beta1.Intent\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"a\n\x10GetIntentRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n dialogflow.googleapis.com/Intent\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\"\xa7\x01\n\x13\x43reateIntentRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\x12 dialogflow.googleapis.com/Intent\x12?\n\x06intent\x18\x02 \x01(\x0b\x32*.google.cloud.dialogflow.cx.v3beta1.IntentB\x03\xe0\x41\x02\x12\x15\n\rlanguage_code\x18\x03 \x01(\t\"\x9e\x01\n\x13UpdateIntentRequest\x12?\n\x06intent\x18\x01 \x01(\x0b\x32*.google.cloud.dialogflow.cx.v3beta1.IntentB\x03\xe0\x41\x02\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"M\n\x13\x44\x65leteIntentRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n dialogflow.googleapis.com/Intent*X\n\nIntentView\x12\x1b\n\x17INTENT_VIEW_UNSPECIFIED\x10\x00\x12\x17\n\x13INTENT_VIEW_PARTIAL\x10\x01\x12\x14\n\x10INTENT_VIEW_FULL\x10\x02\x32\xe4\x08\n\x07Intents\x12\xca\x01\n\x0bListIntents\x12\x36.google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest\x1a\x37.google.cloud.dialogflow.cx.v3beta1.ListIntentsResponse\"J\x82\xd3\xe4\x93\x02;\x12\x39/v3beta1/{parent=projects/*/locations/*/agents/*}/intents\xda\x41\x06parent\x12\xb7\x01\n\tGetIntent\x12\x34.google.cloud.dialogflow.cx.v3beta1.GetIntentRequest\x1a*.google.cloud.dialogflow.cx.v3beta1.Intent\"H\x82\xd3\xe4\x93\x02;\x12\x39/v3beta1/{name=projects/*/locations/*/agents/*/intents/*}\xda\x41\x04name\x12\xce\x01\n\x0c\x43reateIntent\x12\x37.google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest\x1a*.google.cloud.dialogflow.cx.v3beta1.Intent\"Y\x82\xd3\xe4\x93\x02\x43\"9/v3beta1/{parent=projects/*/locations/*/agents/*}/intents:\x06intent\xda\x41\rparent,intent\x12\xda\x01\n\x0cUpdateIntent\x12\x37.google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest\x1a*.google.cloud.dialogflow.cx.v3beta1.Intent\"e\x82\xd3\xe4\x93\x02J2@/v3beta1/{intent.name=projects/*/locations/*/agents/*/intents/*}:\x06intent\xda\x41\x12intent,update_mask\x12\xa9\x01\n\x0c\x44\x65leteIntent\x12\x37.google.cloud.dialogflow.cx.v3beta1.DeleteIntentRequest\x1a\x16.google.protobuf.Empty\"H\x82\xd3\xe4\x93\x02;*9/v3beta1/{name=projects/*/locations/*/agents/*/intents/*}\xda\x41\x04name\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\xaa\x01\n&com.google.cloud.dialogflow.cx.v3beta1B\x0bIntentProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3beta1;cx\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\"Google.Cloud.Dialogflow.Cx.V3Beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])

_INTENTVIEW = _descriptor.EnumDescriptor(
  name='IntentView',
  full_name='google.cloud.dialogflow.cx.v3beta1.IntentView',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='INTENT_VIEW_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INTENT_VIEW_PARTIAL', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INTENT_VIEW_FULL', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1947,
  serialized_end=2035,
)
_sym_db.RegisterEnumDescriptor(_INTENTVIEW)

IntentView = enum_type_wrapper.EnumTypeWrapper(_INTENTVIEW)
INTENT_VIEW_UNSPECIFIED = 0
INTENT_VIEW_PARTIAL = 1
INTENT_VIEW_FULL = 2



_INTENT_TRAININGPHRASE_PART = _descriptor.Descriptor(
  name='Part',
  full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.Part',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.Part.text', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parameter_id', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.Part.parameter_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=778,
  serialized_end=825,
)

_INTENT_TRAININGPHRASE = _descriptor.Descriptor(
  name='TrainingPhrase',
  full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parts', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.parts', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='repeat_count', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.repeat_count', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_INTENT_TRAININGPHRASE_PART, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=642,
  serialized_end=825,
)

_INTENT_PARAMETER = _descriptor.Descriptor(
  name='Parameter',
  full_name='google.cloud.dialogflow.cx.v3beta1.Intent.Parameter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.Parameter.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='entity_type', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.Parameter.entity_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_list', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.Parameter.is_list', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='redact', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.Parameter.redact', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=828,
  serialized_end=956,
)

_INTENT_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.dialogflow.cx.v3beta1.Intent.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.LabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=958,
  serialized_end=1003,
)

_INTENT = _descriptor.Descriptor(
  name='Intent',
  full_name='google.cloud.dialogflow.cx.v3beta1.Intent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='training_phrases', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.training_phrases', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parameters', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.parameters', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='priority', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.priority', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_fallback', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.is_fallback', index=5,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.labels', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.dialogflow.cx.v3beta1.Intent.description', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_INTENT_TRAININGPHRASE, _INTENT_PARAMETER, _INTENT_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352Ak\n dialogflow.googleapis.com/Intent\022Gprojects/{project}/locations/{location}/agents/{agent}/intents/{intent}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=299,
  serialized_end=1115,
)


_LISTINTENTSREQUEST = _descriptor.Descriptor(
  name='ListIntentsRequest',
  full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\"\022 dialogflow.googleapis.com/Intent', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest.language_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='intent_view', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest.intent_view', index=2,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest.page_size', index=3,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest.page_token', index=4,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1118,
  serialized_end=1327,
)


_LISTINTENTSRESPONSE = _descriptor.Descriptor(
  name='ListIntentsResponse',
  full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='intents', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsResponse.intents', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.dialogflow.cx.v3beta1.ListIntentsResponse.next_page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1329,
  serialized_end=1436,
)


_GETINTENTREQUEST = _descriptor.Descriptor(
  name='GetIntentRequest',
  full_name='google.cloud.dialogflow.cx.v3beta1.GetIntentRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.cx.v3beta1.GetIntentRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\"\n dialogflow.googleapis.com/Intent', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3beta1.GetIntentRequest.language_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1438,
  serialized_end=1535,
)


_CREATEINTENTREQUEST = _descriptor.Descriptor(
  name='CreateIntentRequest',
  full_name='google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\"\022 dialogflow.googleapis.com/Intent', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='intent', full_name='google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest.intent', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest.language_code', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1538,
  serialized_end=1705,
)


_UPDATEINTENTREQUEST = _descriptor.Descriptor(
  name='UpdateIntentRequest',
  full_name='google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='intent', full_name='google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest.intent', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest.language_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest.update_mask', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1708,
  serialized_end=1866,
)


_DELETEINTENTREQUEST = _descriptor.Descriptor(
  name='DeleteIntentRequest',
  full_name='google.cloud.dialogflow.cx.v3beta1.DeleteIntentRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.cx.v3beta1.DeleteIntentRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\"\n dialogflow.googleapis.com/Intent', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1868,
  serialized_end=1945,
)

_INTENT_TRAININGPHRASE_PART.containing_type = _INTENT_TRAININGPHRASE
_INTENT_TRAININGPHRASE.fields_by_name['parts'].message_type = _INTENT_TRAININGPHRASE_PART
_INTENT_TRAININGPHRASE.containing_type = _INTENT
_INTENT_PARAMETER.containing_type = _INTENT
_INTENT_LABELSENTRY.containing_type = _INTENT
_INTENT.fields_by_name['training_phrases'].message_type = _INTENT_TRAININGPHRASE
_INTENT.fields_by_name['parameters'].message_type = _INTENT_PARAMETER
_INTENT.fields_by_name['labels'].message_type = _INTENT_LABELSENTRY
_LISTINTENTSREQUEST.fields_by_name['intent_view'].enum_type = _INTENTVIEW
_LISTINTENTSRESPONSE.fields_by_name['intents'].message_type = _INTENT
_CREATEINTENTREQUEST.fields_by_name['intent'].message_type = _INTENT
_UPDATEINTENTREQUEST.fields_by_name['intent'].message_type = _INTENT
_UPDATEINTENTREQUEST.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
DESCRIPTOR.message_types_by_name['Intent'] = _INTENT
DESCRIPTOR.message_types_by_name['ListIntentsRequest'] = _LISTINTENTSREQUEST
DESCRIPTOR.message_types_by_name['ListIntentsResponse'] = _LISTINTENTSRESPONSE
DESCRIPTOR.message_types_by_name['GetIntentRequest'] = _GETINTENTREQUEST
DESCRIPTOR.message_types_by_name['CreateIntentRequest'] = _CREATEINTENTREQUEST
DESCRIPTOR.message_types_by_name['UpdateIntentRequest'] = _UPDATEINTENTREQUEST
DESCRIPTOR.message_types_by_name['DeleteIntentRequest'] = _DELETEINTENTREQUEST
DESCRIPTOR.enum_types_by_name['IntentView'] = _INTENTVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Intent = _reflection.GeneratedProtocolMessageType('Intent', (_message.Message,), {

  'TrainingPhrase' : _reflection.GeneratedProtocolMessageType('TrainingPhrase', (_message.Message,), {

    'Part' : _reflection.GeneratedProtocolMessageType('Part', (_message.Message,), {
      'DESCRIPTOR' : _INTENT_TRAININGPHRASE_PART,
      '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
      # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase.Part)
      })
    ,
    'DESCRIPTOR' : _INTENT_TRAININGPHRASE,
    '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.Intent.TrainingPhrase)
    })
  ,

  'Parameter' : _reflection.GeneratedProtocolMessageType('Parameter', (_message.Message,), {
    'DESCRIPTOR' : _INTENT_PARAMETER,
    '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.Intent.Parameter)
    })
  ,

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _INTENT_LABELSENTRY,
    '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.Intent.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _INTENT,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.Intent)
  })
_sym_db.RegisterMessage(Intent)
_sym_db.RegisterMessage(Intent.TrainingPhrase)
_sym_db.RegisterMessage(Intent.TrainingPhrase.Part)
_sym_db.RegisterMessage(Intent.Parameter)
_sym_db.RegisterMessage(Intent.LabelsEntry)

ListIntentsRequest = _reflection.GeneratedProtocolMessageType('ListIntentsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTINTENTSREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest)
  })
_sym_db.RegisterMessage(ListIntentsRequest)

ListIntentsResponse = _reflection.GeneratedProtocolMessageType('ListIntentsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTINTENTSRESPONSE,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListIntentsResponse)
  })
_sym_db.RegisterMessage(ListIntentsResponse)

GetIntentRequest = _reflection.GeneratedProtocolMessageType('GetIntentRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETINTENTREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.GetIntentRequest)
  })
_sym_db.RegisterMessage(GetIntentRequest)

CreateIntentRequest = _reflection.GeneratedProtocolMessageType('CreateIntentRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEINTENTREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest)
  })
_sym_db.RegisterMessage(CreateIntentRequest)

UpdateIntentRequest = _reflection.GeneratedProtocolMessageType('UpdateIntentRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEINTENTREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest)
  })
_sym_db.RegisterMessage(UpdateIntentRequest)

DeleteIntentRequest = _reflection.GeneratedProtocolMessageType('DeleteIntentRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEINTENTREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3beta1.intent_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.DeleteIntentRequest)
  })
_sym_db.RegisterMessage(DeleteIntentRequest)


DESCRIPTOR._options = None
_INTENT_TRAININGPHRASE_PART.fields_by_name['text']._options = None
_INTENT_TRAININGPHRASE.fields_by_name['parts']._options = None
_INTENT_PARAMETER.fields_by_name['id']._options = None
_INTENT_PARAMETER.fields_by_name['entity_type']._options = None
_INTENT_LABELSENTRY._options = None
_INTENT.fields_by_name['display_name']._options = None
_INTENT._options = None
_LISTINTENTSREQUEST.fields_by_name['parent']._options = None
_GETINTENTREQUEST.fields_by_name['name']._options = None
_CREATEINTENTREQUEST.fields_by_name['parent']._options = None
_CREATEINTENTREQUEST.fields_by_name['intent']._options = None
_UPDATEINTENTREQUEST.fields_by_name['intent']._options = None
_DELETEINTENTREQUEST.fields_by_name['name']._options = None

_INTENTS = _descriptor.ServiceDescriptor(
  name='Intents',
  full_name='google.cloud.dialogflow.cx.v3beta1.Intents',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow',
  create_key=_descriptor._internal_create_key,
  serialized_start=2038,
  serialized_end=3162,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListIntents',
    full_name='google.cloud.dialogflow.cx.v3beta1.Intents.ListIntents',
    index=0,
    containing_service=None,
    input_type=_LISTINTENTSREQUEST,
    output_type=_LISTINTENTSRESPONSE,
    serialized_options=b'\202\323\344\223\002;\0229/v3beta1/{parent=projects/*/locations/*/agents/*}/intents\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetIntent',
    full_name='google.cloud.dialogflow.cx.v3beta1.Intents.GetIntent',
    index=1,
    containing_service=None,
    input_type=_GETINTENTREQUEST,
    output_type=_INTENT,
    serialized_options=b'\202\323\344\223\002;\0229/v3beta1/{name=projects/*/locations/*/agents/*/intents/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateIntent',
    full_name='google.cloud.dialogflow.cx.v3beta1.Intents.CreateIntent',
    index=2,
    containing_service=None,
    input_type=_CREATEINTENTREQUEST,
    output_type=_INTENT,
    serialized_options=b'\202\323\344\223\002C\"9/v3beta1/{parent=projects/*/locations/*/agents/*}/intents:\006intent\332A\rparent,intent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateIntent',
    full_name='google.cloud.dialogflow.cx.v3beta1.Intents.UpdateIntent',
    index=3,
    containing_service=None,
    input_type=_UPDATEINTENTREQUEST,
    output_type=_INTENT,
    serialized_options=b'\202\323\344\223\002J2@/v3beta1/{intent.name=projects/*/locations/*/agents/*/intents/*}:\006intent\332A\022intent,update_mask',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteIntent',
    full_name='google.cloud.dialogflow.cx.v3beta1.Intents.DeleteIntent',
    index=4,
    containing_service=None,
    input_type=_DELETEINTENTREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002;*9/v3beta1/{name=projects/*/locations/*/agents/*/intents/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_INTENTS)

DESCRIPTOR.services_by_name['Intents'] = _INTENTS

# @@protoc_insertion_point(module_scope)
