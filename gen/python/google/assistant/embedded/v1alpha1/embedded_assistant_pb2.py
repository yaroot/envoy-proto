# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/assistant/embedded/v1alpha1/embedded_assistant.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/assistant/embedded/v1alpha1/embedded_assistant.proto',
  package='google.assistant.embedded.v1alpha1',
  syntax='proto3',
  serialized_options=b'\n&com.google.assistant.embedded.v1alpha1B\016AssistantProtoP\001ZJgoogle.golang.org/genproto/googleapis/assistant/embedded/v1alpha1;embedded',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/assistant/embedded/v1alpha1/embedded_assistant.proto\x12\"google.assistant.embedded.v1alpha1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/rpc/status.proto\"\xf5\x01\n\x0e\x43onverseConfig\x12J\n\x0f\x61udio_in_config\x18\x01 \x01(\x0b\x32\x31.google.assistant.embedded.v1alpha1.AudioInConfig\x12L\n\x10\x61udio_out_config\x18\x02 \x01(\x0b\x32\x32.google.assistant.embedded.v1alpha1.AudioOutConfig\x12I\n\x0e\x63onverse_state\x18\x03 \x01(\x0b\x32\x31.google.assistant.embedded.v1alpha1.ConverseState\"\xb6\x01\n\rAudioInConfig\x12L\n\x08\x65ncoding\x18\x01 \x01(\x0e\x32:.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding\x12\x19\n\x11sample_rate_hertz\x18\x02 \x01(\x05\"<\n\x08\x45ncoding\x12\x18\n\x14\x45NCODING_UNSPECIFIED\x10\x00\x12\x0c\n\x08LINEAR16\x10\x01\x12\x08\n\x04\x46LAC\x10\x02\"\xe3\x01\n\x0e\x41udioOutConfig\x12M\n\x08\x65ncoding\x18\x01 \x01(\x0e\x32;.google.assistant.embedded.v1alpha1.AudioOutConfig.Encoding\x12\x19\n\x11sample_rate_hertz\x18\x02 \x01(\x05\x12\x19\n\x11volume_percentage\x18\x03 \x01(\x05\"L\n\x08\x45ncoding\x12\x18\n\x14\x45NCODING_UNSPECIFIED\x10\x00\x12\x0c\n\x08LINEAR16\x10\x01\x12\x07\n\x03MP3\x10\x02\x12\x0f\n\x0bOPUS_IN_OGG\x10\x03\"+\n\rConverseState\x12\x1a\n\x12\x63onversation_state\x18\x01 \x01(\x0c\"\x1e\n\x08\x41udioOut\x12\x12\n\naudio_data\x18\x01 \x01(\x0c\"\xbd\x02\n\x0e\x43onverseResult\x12\x1b\n\x13spoken_request_text\x18\x01 \x01(\t\x12\x1c\n\x14spoken_response_text\x18\x02 \x01(\t\x12\x1a\n\x12\x63onversation_state\x18\x03 \x01(\x0c\x12Z\n\x0fmicrophone_mode\x18\x04 \x01(\x0e\x32\x41.google.assistant.embedded.v1alpha1.ConverseResult.MicrophoneMode\x12\x19\n\x11volume_percentage\x18\x05 \x01(\x05\"]\n\x0eMicrophoneMode\x12\x1f\n\x1bMICROPHONE_MODE_UNSPECIFIED\x10\x00\x12\x14\n\x10\x43LOSE_MICROPHONE\x10\x01\x12\x14\n\x10\x44IALOG_FOLLOW_ON\x10\x02\"\x7f\n\x0f\x43onverseRequest\x12\x44\n\x06\x63onfig\x18\x01 \x01(\x0b\x32\x32.google.assistant.embedded.v1alpha1.ConverseConfigH\x00\x12\x12\n\x08\x61udio_in\x18\x02 \x01(\x0cH\x00\x42\x12\n\x10\x63onverse_request\"\xea\x02\n\x10\x43onverseResponse\x12#\n\x05\x65rror\x18\x01 \x01(\x0b\x32\x12.google.rpc.StatusH\x00\x12T\n\nevent_type\x18\x02 \x01(\x0e\x32>.google.assistant.embedded.v1alpha1.ConverseResponse.EventTypeH\x00\x12\x41\n\taudio_out\x18\x03 \x01(\x0b\x32,.google.assistant.embedded.v1alpha1.AudioOutH\x00\x12\x44\n\x06result\x18\x05 \x01(\x0b\x32\x32.google.assistant.embedded.v1alpha1.ConverseResultH\x00\"=\n\tEventType\x12\x1a\n\x16\x45VENT_TYPE_UNSPECIFIED\x10\x00\x12\x14\n\x10\x45ND_OF_UTTERANCE\x10\x01\x42\x13\n\x11\x63onverse_response2\x8e\x01\n\x11\x45mbeddedAssistant\x12y\n\x08\x43onverse\x12\x33.google.assistant.embedded.v1alpha1.ConverseRequest\x1a\x34.google.assistant.embedded.v1alpha1.ConverseResponse(\x01\x30\x01\x42\x86\x01\n&com.google.assistant.embedded.v1alpha1B\x0e\x41ssistantProtoP\x01ZJgoogle.golang.org/genproto/googleapis/assistant/embedded/v1alpha1;embeddedb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])



_AUDIOINCONFIG_ENCODING = _descriptor.EnumDescriptor(
  name='Encoding',
  full_name='google.assistant.embedded.v1alpha1.AudioInConfig.Encoding',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ENCODING_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LINEAR16', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FLAC', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=525,
  serialized_end=585,
)
_sym_db.RegisterEnumDescriptor(_AUDIOINCONFIG_ENCODING)

_AUDIOOUTCONFIG_ENCODING = _descriptor.EnumDescriptor(
  name='Encoding',
  full_name='google.assistant.embedded.v1alpha1.AudioOutConfig.Encoding',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ENCODING_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LINEAR16', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MP3', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OPUS_IN_OGG', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=739,
  serialized_end=815,
)
_sym_db.RegisterEnumDescriptor(_AUDIOOUTCONFIG_ENCODING)

_CONVERSERESULT_MICROPHONEMODE = _descriptor.EnumDescriptor(
  name='MicrophoneMode',
  full_name='google.assistant.embedded.v1alpha1.ConverseResult.MicrophoneMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='MICROPHONE_MODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOSE_MICROPHONE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DIALOG_FOLLOW_ON', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1119,
  serialized_end=1212,
)
_sym_db.RegisterEnumDescriptor(_CONVERSERESULT_MICROPHONEMODE)

_CONVERSERESPONSE_EVENTTYPE = _descriptor.EnumDescriptor(
  name='EventType',
  full_name='google.assistant.embedded.v1alpha1.ConverseResponse.EventType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='EVENT_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='END_OF_UTTERANCE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1624,
  serialized_end=1685,
)
_sym_db.RegisterEnumDescriptor(_CONVERSERESPONSE_EVENTTYPE)


_CONVERSECONFIG = _descriptor.Descriptor(
  name='ConverseConfig',
  full_name='google.assistant.embedded.v1alpha1.ConverseConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='audio_in_config', full_name='google.assistant.embedded.v1alpha1.ConverseConfig.audio_in_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='audio_out_config', full_name='google.assistant.embedded.v1alpha1.ConverseConfig.audio_out_config', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='converse_state', full_name='google.assistant.embedded.v1alpha1.ConverseConfig.converse_state', index=2,
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
  serialized_start=155,
  serialized_end=400,
)


_AUDIOINCONFIG = _descriptor.Descriptor(
  name='AudioInConfig',
  full_name='google.assistant.embedded.v1alpha1.AudioInConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='encoding', full_name='google.assistant.embedded.v1alpha1.AudioInConfig.encoding', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sample_rate_hertz', full_name='google.assistant.embedded.v1alpha1.AudioInConfig.sample_rate_hertz', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _AUDIOINCONFIG_ENCODING,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=403,
  serialized_end=585,
)


_AUDIOOUTCONFIG = _descriptor.Descriptor(
  name='AudioOutConfig',
  full_name='google.assistant.embedded.v1alpha1.AudioOutConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='encoding', full_name='google.assistant.embedded.v1alpha1.AudioOutConfig.encoding', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sample_rate_hertz', full_name='google.assistant.embedded.v1alpha1.AudioOutConfig.sample_rate_hertz', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='volume_percentage', full_name='google.assistant.embedded.v1alpha1.AudioOutConfig.volume_percentage', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _AUDIOOUTCONFIG_ENCODING,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=588,
  serialized_end=815,
)


_CONVERSESTATE = _descriptor.Descriptor(
  name='ConverseState',
  full_name='google.assistant.embedded.v1alpha1.ConverseState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='conversation_state', full_name='google.assistant.embedded.v1alpha1.ConverseState.conversation_state', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
  serialized_start=817,
  serialized_end=860,
)


_AUDIOOUT = _descriptor.Descriptor(
  name='AudioOut',
  full_name='google.assistant.embedded.v1alpha1.AudioOut',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='audio_data', full_name='google.assistant.embedded.v1alpha1.AudioOut.audio_data', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
  serialized_start=862,
  serialized_end=892,
)


_CONVERSERESULT = _descriptor.Descriptor(
  name='ConverseResult',
  full_name='google.assistant.embedded.v1alpha1.ConverseResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='spoken_request_text', full_name='google.assistant.embedded.v1alpha1.ConverseResult.spoken_request_text', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='spoken_response_text', full_name='google.assistant.embedded.v1alpha1.ConverseResult.spoken_response_text', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='conversation_state', full_name='google.assistant.embedded.v1alpha1.ConverseResult.conversation_state', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='microphone_mode', full_name='google.assistant.embedded.v1alpha1.ConverseResult.microphone_mode', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='volume_percentage', full_name='google.assistant.embedded.v1alpha1.ConverseResult.volume_percentage', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CONVERSERESULT_MICROPHONEMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=895,
  serialized_end=1212,
)


_CONVERSEREQUEST = _descriptor.Descriptor(
  name='ConverseRequest',
  full_name='google.assistant.embedded.v1alpha1.ConverseRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config', full_name='google.assistant.embedded.v1alpha1.ConverseRequest.config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='audio_in', full_name='google.assistant.embedded.v1alpha1.ConverseRequest.audio_in', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
    _descriptor.OneofDescriptor(
      name='converse_request', full_name='google.assistant.embedded.v1alpha1.ConverseRequest.converse_request',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1214,
  serialized_end=1341,
)


_CONVERSERESPONSE = _descriptor.Descriptor(
  name='ConverseResponse',
  full_name='google.assistant.embedded.v1alpha1.ConverseResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='error', full_name='google.assistant.embedded.v1alpha1.ConverseResponse.error', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event_type', full_name='google.assistant.embedded.v1alpha1.ConverseResponse.event_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='audio_out', full_name='google.assistant.embedded.v1alpha1.ConverseResponse.audio_out', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='result', full_name='google.assistant.embedded.v1alpha1.ConverseResponse.result', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CONVERSERESPONSE_EVENTTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='converse_response', full_name='google.assistant.embedded.v1alpha1.ConverseResponse.converse_response',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1344,
  serialized_end=1706,
)

_CONVERSECONFIG.fields_by_name['audio_in_config'].message_type = _AUDIOINCONFIG
_CONVERSECONFIG.fields_by_name['audio_out_config'].message_type = _AUDIOOUTCONFIG
_CONVERSECONFIG.fields_by_name['converse_state'].message_type = _CONVERSESTATE
_AUDIOINCONFIG.fields_by_name['encoding'].enum_type = _AUDIOINCONFIG_ENCODING
_AUDIOINCONFIG_ENCODING.containing_type = _AUDIOINCONFIG
_AUDIOOUTCONFIG.fields_by_name['encoding'].enum_type = _AUDIOOUTCONFIG_ENCODING
_AUDIOOUTCONFIG_ENCODING.containing_type = _AUDIOOUTCONFIG
_CONVERSERESULT.fields_by_name['microphone_mode'].enum_type = _CONVERSERESULT_MICROPHONEMODE
_CONVERSERESULT_MICROPHONEMODE.containing_type = _CONVERSERESULT
_CONVERSEREQUEST.fields_by_name['config'].message_type = _CONVERSECONFIG
_CONVERSEREQUEST.oneofs_by_name['converse_request'].fields.append(
  _CONVERSEREQUEST.fields_by_name['config'])
_CONVERSEREQUEST.fields_by_name['config'].containing_oneof = _CONVERSEREQUEST.oneofs_by_name['converse_request']
_CONVERSEREQUEST.oneofs_by_name['converse_request'].fields.append(
  _CONVERSEREQUEST.fields_by_name['audio_in'])
_CONVERSEREQUEST.fields_by_name['audio_in'].containing_oneof = _CONVERSEREQUEST.oneofs_by_name['converse_request']
_CONVERSERESPONSE.fields_by_name['error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_CONVERSERESPONSE.fields_by_name['event_type'].enum_type = _CONVERSERESPONSE_EVENTTYPE
_CONVERSERESPONSE.fields_by_name['audio_out'].message_type = _AUDIOOUT
_CONVERSERESPONSE.fields_by_name['result'].message_type = _CONVERSERESULT
_CONVERSERESPONSE_EVENTTYPE.containing_type = _CONVERSERESPONSE
_CONVERSERESPONSE.oneofs_by_name['converse_response'].fields.append(
  _CONVERSERESPONSE.fields_by_name['error'])
_CONVERSERESPONSE.fields_by_name['error'].containing_oneof = _CONVERSERESPONSE.oneofs_by_name['converse_response']
_CONVERSERESPONSE.oneofs_by_name['converse_response'].fields.append(
  _CONVERSERESPONSE.fields_by_name['event_type'])
_CONVERSERESPONSE.fields_by_name['event_type'].containing_oneof = _CONVERSERESPONSE.oneofs_by_name['converse_response']
_CONVERSERESPONSE.oneofs_by_name['converse_response'].fields.append(
  _CONVERSERESPONSE.fields_by_name['audio_out'])
_CONVERSERESPONSE.fields_by_name['audio_out'].containing_oneof = _CONVERSERESPONSE.oneofs_by_name['converse_response']
_CONVERSERESPONSE.oneofs_by_name['converse_response'].fields.append(
  _CONVERSERESPONSE.fields_by_name['result'])
_CONVERSERESPONSE.fields_by_name['result'].containing_oneof = _CONVERSERESPONSE.oneofs_by_name['converse_response']
DESCRIPTOR.message_types_by_name['ConverseConfig'] = _CONVERSECONFIG
DESCRIPTOR.message_types_by_name['AudioInConfig'] = _AUDIOINCONFIG
DESCRIPTOR.message_types_by_name['AudioOutConfig'] = _AUDIOOUTCONFIG
DESCRIPTOR.message_types_by_name['ConverseState'] = _CONVERSESTATE
DESCRIPTOR.message_types_by_name['AudioOut'] = _AUDIOOUT
DESCRIPTOR.message_types_by_name['ConverseResult'] = _CONVERSERESULT
DESCRIPTOR.message_types_by_name['ConverseRequest'] = _CONVERSEREQUEST
DESCRIPTOR.message_types_by_name['ConverseResponse'] = _CONVERSERESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ConverseConfig = _reflection.GeneratedProtocolMessageType('ConverseConfig', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSECONFIG,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.ConverseConfig)
  })
_sym_db.RegisterMessage(ConverseConfig)

AudioInConfig = _reflection.GeneratedProtocolMessageType('AudioInConfig', (_message.Message,), {
  'DESCRIPTOR' : _AUDIOINCONFIG,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.AudioInConfig)
  })
_sym_db.RegisterMessage(AudioInConfig)

AudioOutConfig = _reflection.GeneratedProtocolMessageType('AudioOutConfig', (_message.Message,), {
  'DESCRIPTOR' : _AUDIOOUTCONFIG,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.AudioOutConfig)
  })
_sym_db.RegisterMessage(AudioOutConfig)

ConverseState = _reflection.GeneratedProtocolMessageType('ConverseState', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSESTATE,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.ConverseState)
  })
_sym_db.RegisterMessage(ConverseState)

AudioOut = _reflection.GeneratedProtocolMessageType('AudioOut', (_message.Message,), {
  'DESCRIPTOR' : _AUDIOOUT,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.AudioOut)
  })
_sym_db.RegisterMessage(AudioOut)

ConverseResult = _reflection.GeneratedProtocolMessageType('ConverseResult', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSERESULT,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.ConverseResult)
  })
_sym_db.RegisterMessage(ConverseResult)

ConverseRequest = _reflection.GeneratedProtocolMessageType('ConverseRequest', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSEREQUEST,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.ConverseRequest)
  })
_sym_db.RegisterMessage(ConverseRequest)

ConverseResponse = _reflection.GeneratedProtocolMessageType('ConverseResponse', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSERESPONSE,
  '__module__' : 'google.assistant.embedded.v1alpha1.embedded_assistant_pb2'
  # @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.ConverseResponse)
  })
_sym_db.RegisterMessage(ConverseResponse)


DESCRIPTOR._options = None

_EMBEDDEDASSISTANT = _descriptor.ServiceDescriptor(
  name='EmbeddedAssistant',
  full_name='google.assistant.embedded.v1alpha1.EmbeddedAssistant',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1709,
  serialized_end=1851,
  methods=[
  _descriptor.MethodDescriptor(
    name='Converse',
    full_name='google.assistant.embedded.v1alpha1.EmbeddedAssistant.Converse',
    index=0,
    containing_service=None,
    input_type=_CONVERSEREQUEST,
    output_type=_CONVERSERESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_EMBEDDEDASSISTANT)

DESCRIPTOR.services_by_name['EmbeddedAssistant'] = _EMBEDDEDASSISTANT

# @@protoc_insertion_point(module_scope)
