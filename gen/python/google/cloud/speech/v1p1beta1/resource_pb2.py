# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/speech/v1p1beta1/resource.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/speech/v1p1beta1/resource.proto\x12\x1dgoogle.cloud.speech.v1p1beta1\x1a\x19google/api/resource.proto\"\x83\x02\n\x0b\x43ustomClass\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x17\n\x0f\x63ustom_class_id\x18\x02 \x01(\t\x12\x43\n\x05items\x18\x03 \x03(\x0b\x32\x34.google.cloud.speech.v1p1beta1.CustomClass.ClassItem\x1a\x1a\n\tClassItem\x12\r\n\x05value\x18\x01 \x01(\t:l\xea\x41i\n!speech.googleapis.com/CustomClass\x12\x44projects/{project}/locations/{location}/customClasses/{custom_class}\"\xf9\x01\n\tPhraseSet\x12\x0c\n\x04name\x18\x01 \x01(\t\x12@\n\x07phrases\x18\x02 \x03(\x0b\x32/.google.cloud.speech.v1p1beta1.PhraseSet.Phrase\x12\r\n\x05\x62oost\x18\x04 \x01(\x02\x1a&\n\x06Phrase\x12\r\n\x05value\x18\x01 \x01(\t\x12\r\n\x05\x62oost\x18\x02 \x01(\x02:e\xea\x41\x62\n\x1fspeech.googleapis.com/PhraseSet\x12?projects/{project}/locations/{location}/phraseSets/{phrase_set}\"\xda\x01\n\x10SpeechAdaptation\x12=\n\x0bphrase_sets\x18\x01 \x03(\x0b\x32(.google.cloud.speech.v1p1beta1.PhraseSet\x12\x43\n\x15phrase_set_references\x18\x02 \x03(\tB$\xfa\x41!\n\x1fspeech.googleapis.com/PhraseSet\x12\x42\n\x0e\x63ustom_classes\x18\x03 \x03(\x0b\x32*.google.cloud.speech.v1p1beta1.CustomClass\"\xaa\x01\n\x17TranscriptNormalization\x12M\n\x07\x65ntries\x18\x01 \x03(\x0b\x32<.google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry\x1a@\n\x05\x45ntry\x12\x0e\n\x06search\x18\x01 \x01(\t\x12\x0f\n\x07replace\x18\x02 \x01(\t\x12\x16\n\x0e\x63\x61se_sensitive\x18\x03 \x01(\x08\x42\x88\x01\n!com.google.cloud.speech.v1p1beta1B\x13SpeechResourceProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/speech/v1p1beta1;speech\xf8\x01\x01\xa2\x02\x03GCSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.speech.v1p1beta1.resource_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.speech.v1p1beta1B\023SpeechResourceProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/speech/v1p1beta1;speech\370\001\001\242\002\003GCS'
  _CUSTOMCLASS._options = None
  _CUSTOMCLASS._serialized_options = b'\352Ai\n!speech.googleapis.com/CustomClass\022Dprojects/{project}/locations/{location}/customClasses/{custom_class}'
  _PHRASESET._options = None
  _PHRASESET._serialized_options = b'\352Ab\n\037speech.googleapis.com/PhraseSet\022?projects/{project}/locations/{location}/phraseSets/{phrase_set}'
  _SPEECHADAPTATION.fields_by_name['phrase_set_references']._options = None
  _SPEECHADAPTATION.fields_by_name['phrase_set_references']._serialized_options = b'\372A!\n\037speech.googleapis.com/PhraseSet'
  _CUSTOMCLASS._serialized_start=107
  _CUSTOMCLASS._serialized_end=366
  _CUSTOMCLASS_CLASSITEM._serialized_start=230
  _CUSTOMCLASS_CLASSITEM._serialized_end=256
  _PHRASESET._serialized_start=369
  _PHRASESET._serialized_end=618
  _PHRASESET_PHRASE._serialized_start=477
  _PHRASESET_PHRASE._serialized_end=515
  _SPEECHADAPTATION._serialized_start=621
  _SPEECHADAPTATION._serialized_end=839
  _TRANSCRIPTNORMALIZATION._serialized_start=842
  _TRANSCRIPTNORMALIZATION._serialized_end=1012
  _TRANSCRIPTNORMALIZATION_ENTRY._serialized_start=948
  _TRANSCRIPTNORMALIZATION_ENTRY._serialized_end=1012
# @@protoc_insertion_point(module_scope)