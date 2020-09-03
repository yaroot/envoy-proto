# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/audio_config.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/dialogflow/v2beta1/audio_config.proto',
  package='google.cloud.dialogflow.v2beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.dialogflow.v2beta1B\020AudioConfigProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/cloud/dialogflow/v2beta1/audio_config.proto\x12\x1fgoogle.cloud.dialogflow.v2beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/duration.proto\x1a google/protobuf/field_mask.proto\x1a\x1cgoogle/api/annotations.proto\"/\n\rSpeechContext\x12\x0f\n\x07phrases\x18\x01 \x03(\t\x12\r\n\x05\x62oost\x18\x02 \x01(\x02\"\x92\x01\n\x0eSpeechWordInfo\x12\x0c\n\x04word\x18\x03 \x01(\t\x12/\n\x0cstart_offset\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x12-\n\nend_offset\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x12\n\nconfidence\x18\x04 \x01(\x02\"\xfe\x02\n\x10InputAudioConfig\x12\x46\n\x0e\x61udio_encoding\x18\x01 \x01(\x0e\x32..google.cloud.dialogflow.v2beta1.AudioEncoding\x12\x19\n\x11sample_rate_hertz\x18\x02 \x01(\x05\x12\x15\n\rlanguage_code\x18\x03 \x01(\t\x12\x18\n\x10\x65nable_word_info\x18\r \x01(\x08\x12\x18\n\x0cphrase_hints\x18\x04 \x03(\tB\x02\x18\x01\x12G\n\x0fspeech_contexts\x18\x0b \x03(\x0b\x32..google.cloud.dialogflow.v2beta1.SpeechContext\x12\r\n\x05model\x18\x07 \x01(\t\x12J\n\rmodel_variant\x18\n \x01(\x0e\x32\x33.google.cloud.dialogflow.v2beta1.SpeechModelVariant\x12\x18\n\x10single_utterance\x18\x08 \x01(\x08\"k\n\x14VoiceSelectionParams\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x45\n\x0bssml_gender\x18\x02 \x01(\x0e\x32\x30.google.cloud.dialogflow.v2beta1.SsmlVoiceGender\"\xb8\x01\n\x16SynthesizeSpeechConfig\x12\x15\n\rspeaking_rate\x18\x01 \x01(\x01\x12\r\n\x05pitch\x18\x02 \x01(\x01\x12\x16\n\x0evolume_gain_db\x18\x03 \x01(\x01\x12\x1a\n\x12\x65\x66\x66\x65\x63ts_profile_id\x18\x05 \x03(\t\x12\x44\n\x05voice\x18\x04 \x01(\x0b\x32\x35.google.cloud.dialogflow.v2beta1.VoiceSelectionParams\"\xdc\x01\n\x11OutputAudioConfig\x12Q\n\x0e\x61udio_encoding\x18\x01 \x01(\x0e\x32\x34.google.cloud.dialogflow.v2beta1.OutputAudioEncodingB\x03\xe0\x41\x02\x12\x19\n\x11sample_rate_hertz\x18\x02 \x01(\x05\x12Y\n\x18synthesize_speech_config\x18\x03 \x01(\x0b\x32\x37.google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig*\xfb\x01\n\rAudioEncoding\x12\x1e\n\x1a\x41UDIO_ENCODING_UNSPECIFIED\x10\x00\x12\x1c\n\x18\x41UDIO_ENCODING_LINEAR_16\x10\x01\x12\x17\n\x13\x41UDIO_ENCODING_FLAC\x10\x02\x12\x18\n\x14\x41UDIO_ENCODING_MULAW\x10\x03\x12\x16\n\x12\x41UDIO_ENCODING_AMR\x10\x04\x12\x19\n\x15\x41UDIO_ENCODING_AMR_WB\x10\x05\x12\x1b\n\x17\x41UDIO_ENCODING_OGG_OPUS\x10\x06\x12)\n%AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE\x10\x07*v\n\x12SpeechModelVariant\x12$\n SPEECH_MODEL_VARIANT_UNSPECIFIED\x10\x00\x12\x16\n\x12USE_BEST_AVAILABLE\x10\x01\x12\x10\n\x0cUSE_STANDARD\x10\x02\x12\x10\n\x0cUSE_ENHANCED\x10\x03*\x8d\x01\n\x0fSsmlVoiceGender\x12!\n\x1dSSML_VOICE_GENDER_UNSPECIFIED\x10\x00\x12\x1a\n\x16SSML_VOICE_GENDER_MALE\x10\x01\x12\x1c\n\x18SSML_VOICE_GENDER_FEMALE\x10\x02\x12\x1d\n\x19SSML_VOICE_GENDER_NEUTRAL\x10\x03*\xa4\x01\n\x13OutputAudioEncoding\x12%\n!OUTPUT_AUDIO_ENCODING_UNSPECIFIED\x10\x00\x12#\n\x1fOUTPUT_AUDIO_ENCODING_LINEAR_16\x10\x01\x12\x1d\n\x19OUTPUT_AUDIO_ENCODING_MP3\x10\x02\x12\"\n\x1eOUTPUT_AUDIO_ENCODING_OGG_OPUS\x10\x03\x42\xae\x01\n#com.google.cloud.dialogflow.v2beta1B\x10\x41udioConfigProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1fGoogle.Cloud.Dialogflow.V2beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])

_AUDIOENCODING = _descriptor.EnumDescriptor(
  name='AudioEncoding',
  full_name='google.cloud.dialogflow.v2beta1.AudioEncoding',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_LINEAR_16', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_FLAC', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_MULAW', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_AMR', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_AMR_WB', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_OGG_OPUS', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1346,
  serialized_end=1597,
)
_sym_db.RegisterEnumDescriptor(_AUDIOENCODING)

AudioEncoding = enum_type_wrapper.EnumTypeWrapper(_AUDIOENCODING)
_SPEECHMODELVARIANT = _descriptor.EnumDescriptor(
  name='SpeechModelVariant',
  full_name='google.cloud.dialogflow.v2beta1.SpeechModelVariant',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SPEECH_MODEL_VARIANT_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='USE_BEST_AVAILABLE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='USE_STANDARD', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='USE_ENHANCED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1599,
  serialized_end=1717,
)
_sym_db.RegisterEnumDescriptor(_SPEECHMODELVARIANT)

SpeechModelVariant = enum_type_wrapper.EnumTypeWrapper(_SPEECHMODELVARIANT)
_SSMLVOICEGENDER = _descriptor.EnumDescriptor(
  name='SsmlVoiceGender',
  full_name='google.cloud.dialogflow.v2beta1.SsmlVoiceGender',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SSML_VOICE_GENDER_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SSML_VOICE_GENDER_MALE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SSML_VOICE_GENDER_FEMALE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SSML_VOICE_GENDER_NEUTRAL', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1720,
  serialized_end=1861,
)
_sym_db.RegisterEnumDescriptor(_SSMLVOICEGENDER)

SsmlVoiceGender = enum_type_wrapper.EnumTypeWrapper(_SSMLVOICEGENDER)
_OUTPUTAUDIOENCODING = _descriptor.EnumDescriptor(
  name='OutputAudioEncoding',
  full_name='google.cloud.dialogflow.v2beta1.OutputAudioEncoding',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='OUTPUT_AUDIO_ENCODING_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OUTPUT_AUDIO_ENCODING_LINEAR_16', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OUTPUT_AUDIO_ENCODING_MP3', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OUTPUT_AUDIO_ENCODING_OGG_OPUS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1864,
  serialized_end=2028,
)
_sym_db.RegisterEnumDescriptor(_OUTPUTAUDIOENCODING)

OutputAudioEncoding = enum_type_wrapper.EnumTypeWrapper(_OUTPUTAUDIOENCODING)
AUDIO_ENCODING_UNSPECIFIED = 0
AUDIO_ENCODING_LINEAR_16 = 1
AUDIO_ENCODING_FLAC = 2
AUDIO_ENCODING_MULAW = 3
AUDIO_ENCODING_AMR = 4
AUDIO_ENCODING_AMR_WB = 5
AUDIO_ENCODING_OGG_OPUS = 6
AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE = 7
SPEECH_MODEL_VARIANT_UNSPECIFIED = 0
USE_BEST_AVAILABLE = 1
USE_STANDARD = 2
USE_ENHANCED = 3
SSML_VOICE_GENDER_UNSPECIFIED = 0
SSML_VOICE_GENDER_MALE = 1
SSML_VOICE_GENDER_FEMALE = 2
SSML_VOICE_GENDER_NEUTRAL = 3
OUTPUT_AUDIO_ENCODING_UNSPECIFIED = 0
OUTPUT_AUDIO_ENCODING_LINEAR_16 = 1
OUTPUT_AUDIO_ENCODING_MP3 = 2
OUTPUT_AUDIO_ENCODING_OGG_OPUS = 3



_SPEECHCONTEXT = _descriptor.Descriptor(
  name='SpeechContext',
  full_name='google.cloud.dialogflow.v2beta1.SpeechContext',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='phrases', full_name='google.cloud.dialogflow.v2beta1.SpeechContext.phrases', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='boost', full_name='google.cloud.dialogflow.v2beta1.SpeechContext.boost', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=243,
  serialized_end=290,
)


_SPEECHWORDINFO = _descriptor.Descriptor(
  name='SpeechWordInfo',
  full_name='google.cloud.dialogflow.v2beta1.SpeechWordInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='word', full_name='google.cloud.dialogflow.v2beta1.SpeechWordInfo.word', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_offset', full_name='google.cloud.dialogflow.v2beta1.SpeechWordInfo.start_offset', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_offset', full_name='google.cloud.dialogflow.v2beta1.SpeechWordInfo.end_offset', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='confidence', full_name='google.cloud.dialogflow.v2beta1.SpeechWordInfo.confidence', index=3,
      number=4, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=293,
  serialized_end=439,
)


_INPUTAUDIOCONFIG = _descriptor.Descriptor(
  name='InputAudioConfig',
  full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='audio_encoding', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.audio_encoding', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sample_rate_hertz', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.sample_rate_hertz', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.language_code', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enable_word_info', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.enable_word_info', index=3,
      number=13, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='phrase_hints', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.phrase_hints', index=4,
      number=4, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='speech_contexts', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.speech_contexts', index=5,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.model', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model_variant', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.model_variant', index=7,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='single_utterance', full_name='google.cloud.dialogflow.v2beta1.InputAudioConfig.single_utterance', index=8,
      number=8, type=8, cpp_type=7, label=1,
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
  serialized_start=442,
  serialized_end=824,
)


_VOICESELECTIONPARAMS = _descriptor.Descriptor(
  name='VoiceSelectionParams',
  full_name='google.cloud.dialogflow.v2beta1.VoiceSelectionParams',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.v2beta1.VoiceSelectionParams.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ssml_gender', full_name='google.cloud.dialogflow.v2beta1.VoiceSelectionParams.ssml_gender', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=826,
  serialized_end=933,
)


_SYNTHESIZESPEECHCONFIG = _descriptor.Descriptor(
  name='SynthesizeSpeechConfig',
  full_name='google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='speaking_rate', full_name='google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig.speaking_rate', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pitch', full_name='google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig.pitch', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='volume_gain_db', full_name='google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig.volume_gain_db', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='effects_profile_id', full_name='google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig.effects_profile_id', index=3,
      number=5, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='voice', full_name='google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig.voice', index=4,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=936,
  serialized_end=1120,
)


_OUTPUTAUDIOCONFIG = _descriptor.Descriptor(
  name='OutputAudioConfig',
  full_name='google.cloud.dialogflow.v2beta1.OutputAudioConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='audio_encoding', full_name='google.cloud.dialogflow.v2beta1.OutputAudioConfig.audio_encoding', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sample_rate_hertz', full_name='google.cloud.dialogflow.v2beta1.OutputAudioConfig.sample_rate_hertz', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='synthesize_speech_config', full_name='google.cloud.dialogflow.v2beta1.OutputAudioConfig.synthesize_speech_config', index=2,
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
  serialized_start=1123,
  serialized_end=1343,
)

_SPEECHWORDINFO.fields_by_name['start_offset'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_SPEECHWORDINFO.fields_by_name['end_offset'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_INPUTAUDIOCONFIG.fields_by_name['audio_encoding'].enum_type = _AUDIOENCODING
_INPUTAUDIOCONFIG.fields_by_name['speech_contexts'].message_type = _SPEECHCONTEXT
_INPUTAUDIOCONFIG.fields_by_name['model_variant'].enum_type = _SPEECHMODELVARIANT
_VOICESELECTIONPARAMS.fields_by_name['ssml_gender'].enum_type = _SSMLVOICEGENDER
_SYNTHESIZESPEECHCONFIG.fields_by_name['voice'].message_type = _VOICESELECTIONPARAMS
_OUTPUTAUDIOCONFIG.fields_by_name['audio_encoding'].enum_type = _OUTPUTAUDIOENCODING
_OUTPUTAUDIOCONFIG.fields_by_name['synthesize_speech_config'].message_type = _SYNTHESIZESPEECHCONFIG
DESCRIPTOR.message_types_by_name['SpeechContext'] = _SPEECHCONTEXT
DESCRIPTOR.message_types_by_name['SpeechWordInfo'] = _SPEECHWORDINFO
DESCRIPTOR.message_types_by_name['InputAudioConfig'] = _INPUTAUDIOCONFIG
DESCRIPTOR.message_types_by_name['VoiceSelectionParams'] = _VOICESELECTIONPARAMS
DESCRIPTOR.message_types_by_name['SynthesizeSpeechConfig'] = _SYNTHESIZESPEECHCONFIG
DESCRIPTOR.message_types_by_name['OutputAudioConfig'] = _OUTPUTAUDIOCONFIG
DESCRIPTOR.enum_types_by_name['AudioEncoding'] = _AUDIOENCODING
DESCRIPTOR.enum_types_by_name['SpeechModelVariant'] = _SPEECHMODELVARIANT
DESCRIPTOR.enum_types_by_name['SsmlVoiceGender'] = _SSMLVOICEGENDER
DESCRIPTOR.enum_types_by_name['OutputAudioEncoding'] = _OUTPUTAUDIOENCODING
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SpeechContext = _reflection.GeneratedProtocolMessageType('SpeechContext', (_message.Message,), {
  'DESCRIPTOR' : _SPEECHCONTEXT,
  '__module__' : 'google.cloud.dialogflow.v2beta1.audio_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SpeechContext)
  })
_sym_db.RegisterMessage(SpeechContext)

SpeechWordInfo = _reflection.GeneratedProtocolMessageType('SpeechWordInfo', (_message.Message,), {
  'DESCRIPTOR' : _SPEECHWORDINFO,
  '__module__' : 'google.cloud.dialogflow.v2beta1.audio_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SpeechWordInfo)
  })
_sym_db.RegisterMessage(SpeechWordInfo)

InputAudioConfig = _reflection.GeneratedProtocolMessageType('InputAudioConfig', (_message.Message,), {
  'DESCRIPTOR' : _INPUTAUDIOCONFIG,
  '__module__' : 'google.cloud.dialogflow.v2beta1.audio_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.InputAudioConfig)
  })
_sym_db.RegisterMessage(InputAudioConfig)

VoiceSelectionParams = _reflection.GeneratedProtocolMessageType('VoiceSelectionParams', (_message.Message,), {
  'DESCRIPTOR' : _VOICESELECTIONPARAMS,
  '__module__' : 'google.cloud.dialogflow.v2beta1.audio_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.VoiceSelectionParams)
  })
_sym_db.RegisterMessage(VoiceSelectionParams)

SynthesizeSpeechConfig = _reflection.GeneratedProtocolMessageType('SynthesizeSpeechConfig', (_message.Message,), {
  'DESCRIPTOR' : _SYNTHESIZESPEECHCONFIG,
  '__module__' : 'google.cloud.dialogflow.v2beta1.audio_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig)
  })
_sym_db.RegisterMessage(SynthesizeSpeechConfig)

OutputAudioConfig = _reflection.GeneratedProtocolMessageType('OutputAudioConfig', (_message.Message,), {
  'DESCRIPTOR' : _OUTPUTAUDIOCONFIG,
  '__module__' : 'google.cloud.dialogflow.v2beta1.audio_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.OutputAudioConfig)
  })
_sym_db.RegisterMessage(OutputAudioConfig)


DESCRIPTOR._options = None
_INPUTAUDIOCONFIG.fields_by_name['phrase_hints']._options = None
_OUTPUTAUDIOCONFIG.fields_by_name['audio_encoding']._options = None
# @@protoc_insertion_point(module_scope)
