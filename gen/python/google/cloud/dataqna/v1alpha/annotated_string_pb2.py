# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataqna/v1alpha/annotated_string.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/dataqna/v1alpha/annotated_string.proto\x12\x1cgoogle.cloud.dataqna.v1alpha\"\x99\x03\n\x0f\x41nnotatedString\x12\x16\n\x0etext_formatted\x18\x01 \x01(\t\x12\x16\n\x0ehtml_formatted\x18\x02 \x01(\t\x12M\n\x07markups\x18\x03 \x03(\x0b\x32<.google.cloud.dataqna.v1alpha.AnnotatedString.SemanticMarkup\x1a\x8a\x01\n\x0eSemanticMarkup\x12N\n\x04type\x18\x01 \x01(\x0e\x32@.google.cloud.dataqna.v1alpha.AnnotatedString.SemanticMarkupType\x12\x18\n\x10start_char_index\x18\x02 \x01(\x05\x12\x0e\n\x06length\x18\x03 \x01(\x05\"z\n\x12SemanticMarkupType\x12\x1b\n\x17MARKUP_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06METRIC\x10\x01\x12\r\n\tDIMENSION\x10\x02\x12\n\n\x06\x46ILTER\x10\x03\x12\n\n\x06UNUSED\x10\x04\x12\x0b\n\x07\x42LOCKED\x10\x05\x12\x07\n\x03ROW\x10\x06\x42\xdf\x01\n com.google.cloud.dataqna.v1alphaB\x14\x41nnotatedStringProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/dataqna/v1alpha;dataqna\xaa\x02\x1cGoogle.Cloud.DataQnA.V1Alpha\xca\x02\x1cGoogle\\Cloud\\DataQnA\\V1alpha\xea\x02\x1fGoogle::Cloud::DataQnA::V1alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dataqna.v1alpha.annotated_string_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.google.cloud.dataqna.v1alphaB\024AnnotatedStringProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/dataqna/v1alpha;dataqna\252\002\034Google.Cloud.DataQnA.V1Alpha\312\002\034Google\\Cloud\\DataQnA\\V1alpha\352\002\037Google::Cloud::DataQnA::V1alpha'
  _ANNOTATEDSTRING._serialized_start=86
  _ANNOTATEDSTRING._serialized_end=495
  _ANNOTATEDSTRING_SEMANTICMARKUP._serialized_start=233
  _ANNOTATEDSTRING_SEMANTICMARKUP._serialized_end=371
  _ANNOTATEDSTRING_SEMANTICMARKUPTYPE._serialized_start=373
  _ANNOTATEDSTRING_SEMANTICMARKUPTYPE._serialized_end=495
# @@protoc_insertion_point(module_scope)
