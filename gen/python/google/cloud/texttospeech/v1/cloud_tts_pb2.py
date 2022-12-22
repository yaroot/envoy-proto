# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/texttospeech/v1/cloud_tts.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/texttospeech/v1/cloud_tts.proto\x12\x1cgoogle.cloud.texttospeech.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"/\n\x11ListVoicesRequest\x12\x1a\n\rlanguage_code\x18\x01 \x01(\tB\x03\xe0\x41\x01\"I\n\x12ListVoicesResponse\x12\x33\n\x06voices\x18\x01 \x03(\x0b\x32#.google.cloud.texttospeech.v1.Voice\"\x94\x01\n\x05Voice\x12\x16\n\x0elanguage_codes\x18\x01 \x03(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x42\n\x0bssml_gender\x18\x03 \x01(\x0e\x32-.google.cloud.texttospeech.v1.SsmlVoiceGender\x12!\n\x19natural_sample_rate_hertz\x18\x04 \x01(\x05\"\xe9\x01\n\x17SynthesizeSpeechRequest\x12@\n\x05input\x18\x01 \x01(\x0b\x32,.google.cloud.texttospeech.v1.SynthesisInputB\x03\xe0\x41\x02\x12\x46\n\x05voice\x18\x02 \x01(\x0b\x32\x32.google.cloud.texttospeech.v1.VoiceSelectionParamsB\x03\xe0\x41\x02\x12\x44\n\x0c\x61udio_config\x18\x03 \x01(\x0b\x32).google.cloud.texttospeech.v1.AudioConfigB\x03\xe0\x41\x02\"@\n\x0eSynthesisInput\x12\x0e\n\x04text\x18\x01 \x01(\tH\x00\x12\x0e\n\x04ssml\x18\x02 \x01(\tH\x00\x42\x0e\n\x0cinput_source\"\xcb\x01\n\x14VoiceSelectionParams\x12\x1a\n\rlanguage_code\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x42\n\x0bssml_gender\x18\x03 \x01(\x0e\x32-.google.cloud.texttospeech.v1.SsmlVoiceGender\x12\x45\n\x0c\x63ustom_voice\x18\x04 \x01(\x0b\x32/.google.cloud.texttospeech.v1.CustomVoiceParams\"\xf1\x01\n\x0b\x41udioConfig\x12H\n\x0e\x61udio_encoding\x18\x01 \x01(\x0e\x32+.google.cloud.texttospeech.v1.AudioEncodingB\x03\xe0\x41\x02\x12\x1d\n\rspeaking_rate\x18\x02 \x01(\x01\x42\x06\xe0\x41\x04\xe0\x41\x01\x12\x15\n\x05pitch\x18\x03 \x01(\x01\x42\x06\xe0\x41\x04\xe0\x41\x01\x12\x1e\n\x0evolume_gain_db\x18\x04 \x01(\x01\x42\x06\xe0\x41\x04\xe0\x41\x01\x12\x1e\n\x11sample_rate_hertz\x18\x05 \x01(\x05\x42\x03\xe0\x41\x01\x12\"\n\x12\x65\x66\x66\x65\x63ts_profile_id\x18\x06 \x03(\tB\x06\xe0\x41\x04\xe0\x41\x01\"\xef\x01\n\x11\x43ustomVoiceParams\x12\x32\n\x05model\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\x12Z\n\x0ereported_usage\x18\x03 \x01(\x0e\x32=.google.cloud.texttospeech.v1.CustomVoiceParams.ReportedUsageB\x03\xe0\x41\x01\"J\n\rReportedUsage\x12\x1e\n\x1aREPORTED_USAGE_UNSPECIFIED\x10\x00\x12\x0c\n\x08REALTIME\x10\x01\x12\x0b\n\x07OFFLINE\x10\x02\"1\n\x18SynthesizeSpeechResponse\x12\x15\n\raudio_content\x18\x01 \x01(\x0c*W\n\x0fSsmlVoiceGender\x12!\n\x1dSSML_VOICE_GENDER_UNSPECIFIED\x10\x00\x12\x08\n\x04MALE\x10\x01\x12\n\n\x06\x46\x45MALE\x10\x02\x12\x0b\n\x07NEUTRAL\x10\x03*i\n\rAudioEncoding\x12\x1e\n\x1a\x41UDIO_ENCODING_UNSPECIFIED\x10\x00\x12\x0c\n\x08LINEAR16\x10\x01\x12\x07\n\x03MP3\x10\x02\x12\x0c\n\x08OGG_OPUS\x10\x03\x12\t\n\x05MULAW\x10\x05\x12\x08\n\x04\x41LAW\x10\x06\x32\xb4\x03\n\x0cTextToSpeech\x12\x93\x01\n\nListVoices\x12/.google.cloud.texttospeech.v1.ListVoicesRequest\x1a\x30.google.cloud.texttospeech.v1.ListVoicesResponse\"\"\x82\xd3\xe4\x93\x02\x0c\x12\n/v1/voices\xda\x41\rlanguage_code\x12\xbc\x01\n\x10SynthesizeSpeech\x12\x35.google.cloud.texttospeech.v1.SynthesizeSpeechRequest\x1a\x36.google.cloud.texttospeech.v1.SynthesizeSpeechResponse\"9\x82\xd3\xe4\x93\x02\x18\"\x13/v1/text:synthesize:\x01*\xda\x41\x18input,voice,audio_config\x1aO\xca\x41\x1btexttospeech.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xbc\x02\n com.google.cloud.texttospeech.v1B\x11TextToSpeechProtoP\x01ZHgoogle.golang.org/genproto/googleapis/cloud/texttospeech/v1;texttospeech\xf8\x01\x01\xaa\x02\x1cGoogle.Cloud.TextToSpeech.V1\xca\x02\x1cGoogle\\Cloud\\TextToSpeech\\V1\xea\x02\x1fGoogle::Cloud::TextToSpeech::V1\xea\x41U\n\x1b\x61utoml.googleapis.com/Model\x12\x36projects/{project}/locations/{location}/models/{model}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.texttospeech.v1.cloud_tts_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.google.cloud.texttospeech.v1B\021TextToSpeechProtoP\001ZHgoogle.golang.org/genproto/googleapis/cloud/texttospeech/v1;texttospeech\370\001\001\252\002\034Google.Cloud.TextToSpeech.V1\312\002\034Google\\Cloud\\TextToSpeech\\V1\352\002\037Google::Cloud::TextToSpeech::V1\352AU\n\033automl.googleapis.com/Model\0226projects/{project}/locations/{location}/models/{model}'
  _LISTVOICESREQUEST.fields_by_name['language_code']._options = None
  _LISTVOICESREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _SYNTHESIZESPEECHREQUEST.fields_by_name['input']._options = None
  _SYNTHESIZESPEECHREQUEST.fields_by_name['input']._serialized_options = b'\340A\002'
  _SYNTHESIZESPEECHREQUEST.fields_by_name['voice']._options = None
  _SYNTHESIZESPEECHREQUEST.fields_by_name['voice']._serialized_options = b'\340A\002'
  _SYNTHESIZESPEECHREQUEST.fields_by_name['audio_config']._options = None
  _SYNTHESIZESPEECHREQUEST.fields_by_name['audio_config']._serialized_options = b'\340A\002'
  _VOICESELECTIONPARAMS.fields_by_name['language_code']._options = None
  _VOICESELECTIONPARAMS.fields_by_name['language_code']._serialized_options = b'\340A\002'
  _AUDIOCONFIG.fields_by_name['audio_encoding']._options = None
  _AUDIOCONFIG.fields_by_name['audio_encoding']._serialized_options = b'\340A\002'
  _AUDIOCONFIG.fields_by_name['speaking_rate']._options = None
  _AUDIOCONFIG.fields_by_name['speaking_rate']._serialized_options = b'\340A\004\340A\001'
  _AUDIOCONFIG.fields_by_name['pitch']._options = None
  _AUDIOCONFIG.fields_by_name['pitch']._serialized_options = b'\340A\004\340A\001'
  _AUDIOCONFIG.fields_by_name['volume_gain_db']._options = None
  _AUDIOCONFIG.fields_by_name['volume_gain_db']._serialized_options = b'\340A\004\340A\001'
  _AUDIOCONFIG.fields_by_name['sample_rate_hertz']._options = None
  _AUDIOCONFIG.fields_by_name['sample_rate_hertz']._serialized_options = b'\340A\001'
  _AUDIOCONFIG.fields_by_name['effects_profile_id']._options = None
  _AUDIOCONFIG.fields_by_name['effects_profile_id']._serialized_options = b'\340A\004\340A\001'
  _CUSTOMVOICEPARAMS.fields_by_name['model']._options = None
  _CUSTOMVOICEPARAMS.fields_by_name['model']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _CUSTOMVOICEPARAMS.fields_by_name['reported_usage']._options = None
  _CUSTOMVOICEPARAMS.fields_by_name['reported_usage']._serialized_options = b'\340A\001'
  _TEXTTOSPEECH._options = None
  _TEXTTOSPEECH._serialized_options = b'\312A\033texttospeech.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _TEXTTOSPEECH.methods_by_name['ListVoices']._options = None
  _TEXTTOSPEECH.methods_by_name['ListVoices']._serialized_options = b'\202\323\344\223\002\014\022\n/v1/voices\332A\rlanguage_code'
  _TEXTTOSPEECH.methods_by_name['SynthesizeSpeech']._options = None
  _TEXTTOSPEECH.methods_by_name['SynthesizeSpeech']._serialized_options = b'\202\323\344\223\002\030\"\023/v1/text:synthesize:\001*\332A\030input,voice,audio_config'
  _SSMLVOICEGENDER._serialized_start=1513
  _SSMLVOICEGENDER._serialized_end=1600
  _AUDIOENCODING._serialized_start=1602
  _AUDIOENCODING._serialized_end=1707
  _LISTVOICESREQUEST._serialized_start=193
  _LISTVOICESREQUEST._serialized_end=240
  _LISTVOICESRESPONSE._serialized_start=242
  _LISTVOICESRESPONSE._serialized_end=315
  _VOICE._serialized_start=318
  _VOICE._serialized_end=466
  _SYNTHESIZESPEECHREQUEST._serialized_start=469
  _SYNTHESIZESPEECHREQUEST._serialized_end=702
  _SYNTHESISINPUT._serialized_start=704
  _SYNTHESISINPUT._serialized_end=768
  _VOICESELECTIONPARAMS._serialized_start=771
  _VOICESELECTIONPARAMS._serialized_end=974
  _AUDIOCONFIG._serialized_start=977
  _AUDIOCONFIG._serialized_end=1218
  _CUSTOMVOICEPARAMS._serialized_start=1221
  _CUSTOMVOICEPARAMS._serialized_end=1460
  _CUSTOMVOICEPARAMS_REPORTEDUSAGE._serialized_start=1386
  _CUSTOMVOICEPARAMS_REPORTEDUSAGE._serialized_end=1460
  _SYNTHESIZESPEECHRESPONSE._serialized_start=1462
  _SYNTHESIZESPEECHRESPONSE._serialized_end=1511
  _TEXTTOSPEECH._serialized_start=1710
  _TEXTTOSPEECH._serialized_end=2146
# @@protoc_insertion_point(module_scope)