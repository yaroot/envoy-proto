# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommender/v1/recommendation.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import money_pb2 as google_dot_type_dot_money__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/recommender/v1/recommendation.proto',
  package='google.cloud.recommender.v1',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.recommender.v1P\001ZFgoogle.golang.org/genproto/googleapis/cloud/recommender/v1;recommender\242\002\004CREC\252\002\033Google.Cloud.Recommender.V1\352Al\n&recommender.googleapis.com/Recommender\022Bprojects/{project}/locations/{location}/recommenders/{recommender}',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0google/cloud/recommender/v1/recommendation.proto\x12\x1bgoogle.cloud.recommender.v1\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/type/money.proto\"\xb8\x05\n\x0eRecommendation\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x1b\n\x13recommender_subtype\x18\x0c \x01(\t\x12\x35\n\x11last_refresh_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12;\n\x0eprimary_impact\x18\x05 \x01(\x0b\x32#.google.cloud.recommender.v1.Impact\x12>\n\x11\x61\x64\x64itional_impact\x18\x06 \x03(\x0b\x32#.google.cloud.recommender.v1.Impact\x12\x43\n\x07\x63ontent\x18\x07 \x01(\x0b\x32\x32.google.cloud.recommender.v1.RecommendationContent\x12H\n\nstate_info\x18\n \x01(\x0b\x32\x34.google.cloud.recommender.v1.RecommendationStateInfo\x12\x0c\n\x04\x65tag\x18\x0b \x01(\t\x12Y\n\x13\x61ssociated_insights\x18\x0e \x03(\x0b\x32<.google.cloud.recommender.v1.Recommendation.InsightReference\x1a#\n\x10InsightReference\x12\x0f\n\x07insight\x18\x01 \x01(\t:\x94\x01\xea\x41\x90\x01\n)recommender.googleapis.com/Recommendation\x12\x63projects/{project}/locations/{location}/recommenders/{recommender}/recommendations/{recommendation}\"^\n\x15RecommendationContent\x12\x45\n\x10operation_groups\x18\x02 \x03(\x0b\x32+.google.cloud.recommender.v1.OperationGroup\"L\n\x0eOperationGroup\x12:\n\noperations\x18\x01 \x03(\x0b\x32&.google.cloud.recommender.v1.Operation\"\xd7\x04\n\tOperation\x12\x0e\n\x06\x61\x63tion\x18\x01 \x01(\t\x12\x15\n\rresource_type\x18\x02 \x01(\t\x12\x10\n\x08resource\x18\x03 \x01(\t\x12\x0c\n\x04path\x18\x04 \x01(\t\x12\x17\n\x0fsource_resource\x18\x05 \x01(\t\x12\x13\n\x0bsource_path\x18\x06 \x01(\t\x12\'\n\x05value\x18\x07 \x01(\x0b\x32\x16.google.protobuf.ValueH\x00\x12\x42\n\rvalue_matcher\x18\n \x01(\x0b\x32).google.cloud.recommender.v1.ValueMatcherH\x00\x12M\n\x0cpath_filters\x18\x08 \x03(\x0b\x32\x37.google.cloud.recommender.v1.Operation.PathFiltersEntry\x12Z\n\x13path_value_matchers\x18\x0b \x03(\x0b\x32=.google.cloud.recommender.v1.Operation.PathValueMatchersEntry\x1aJ\n\x10PathFiltersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12%\n\x05value\x18\x02 \x01(\x0b\x32\x16.google.protobuf.Value:\x02\x38\x01\x1a\x63\n\x16PathValueMatchersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x38\n\x05value\x18\x02 \x01(\x0b\x32).google.cloud.recommender.v1.ValueMatcher:\x02\x38\x01\x42\x0c\n\npath_value\":\n\x0cValueMatcher\x12\x19\n\x0fmatches_pattern\x18\x01 \x01(\tH\x00\x42\x0f\n\rmatch_variant\"_\n\x0e\x43ostProjection\x12 \n\x04\x63ost\x18\x01 \x01(\x0b\x32\x12.google.type.Money\x12+\n\x08\x64uration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"\x80\x02\n\x06Impact\x12>\n\x08\x63\x61tegory\x18\x01 \x01(\x0e\x32,.google.cloud.recommender.v1.Impact.Category\x12\x46\n\x0f\x63ost_projection\x18\x64 \x01(\x0b\x32+.google.cloud.recommender.v1.CostProjectionH\x00\"`\n\x08\x43\x61tegory\x12\x18\n\x14\x43\x41TEGORY_UNSPECIFIED\x10\x00\x12\x08\n\x04\x43OST\x10\x01\x12\x0c\n\x08SECURITY\x10\x02\x12\x0f\n\x0bPERFORMANCE\x10\x03\x12\x11\n\rMANAGEABILITY\x10\x04\x42\x0c\n\nprojection\"\xde\x02\n\x17RecommendationStateInfo\x12I\n\x05state\x18\x01 \x01(\x0e\x32:.google.cloud.recommender.v1.RecommendationStateInfo.State\x12_\n\x0estate_metadata\x18\x02 \x03(\x0b\x32G.google.cloud.recommender.v1.RecommendationStateInfo.StateMetadataEntry\x1a\x34\n\x12StateMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"a\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\x0b\n\x07\x43LAIMED\x10\x06\x12\r\n\tSUCCEEDED\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04\x12\r\n\tDISMISSED\x10\x05\x42\xff\x01\n\x1f\x63om.google.cloud.recommender.v1P\x01ZFgoogle.golang.org/genproto/googleapis/cloud/recommender/v1;recommender\xa2\x02\x04\x43REC\xaa\x02\x1bGoogle.Cloud.Recommender.V1\xea\x41l\n&recommender.googleapis.com/Recommender\x12\x42projects/{project}/locations/{location}/recommenders/{recommender}b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_type_dot_money__pb2.DESCRIPTOR,])



_IMPACT_CATEGORY = _descriptor.EnumDescriptor(
  name='Category',
  full_name='google.cloud.recommender.v1.Impact.Category',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CATEGORY_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COST', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SECURITY', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PERFORMANCE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MANAGEABILITY', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2007,
  serialized_end=2103,
)
_sym_db.RegisterEnumDescriptor(_IMPACT_CATEGORY)

_RECOMMENDATIONSTATEINFO_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.recommender.v1.RecommendationStateInfo.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACTIVE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLAIMED', index=2, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SUCCEEDED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FAILED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DISMISSED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2373,
  serialized_end=2470,
)
_sym_db.RegisterEnumDescriptor(_RECOMMENDATIONSTATEINFO_STATE)


_RECOMMENDATION_INSIGHTREFERENCE = _descriptor.Descriptor(
  name='InsightReference',
  full_name='google.cloud.recommender.v1.Recommendation.InsightReference',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='insight', full_name='google.cloud.recommender.v1.Recommendation.InsightReference.insight', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=739,
  serialized_end=774,
)

_RECOMMENDATION = _descriptor.Descriptor(
  name='Recommendation',
  full_name='google.cloud.recommender.v1.Recommendation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.recommender.v1.Recommendation.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.recommender.v1.Recommendation.description', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='recommender_subtype', full_name='google.cloud.recommender.v1.Recommendation.recommender_subtype', index=2,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_refresh_time', full_name='google.cloud.recommender.v1.Recommendation.last_refresh_time', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='primary_impact', full_name='google.cloud.recommender.v1.Recommendation.primary_impact', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='additional_impact', full_name='google.cloud.recommender.v1.Recommendation.additional_impact', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content', full_name='google.cloud.recommender.v1.Recommendation.content', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state_info', full_name='google.cloud.recommender.v1.Recommendation.state_info', index=7,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.cloud.recommender.v1.Recommendation.etag', index=8,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='associated_insights', full_name='google.cloud.recommender.v1.Recommendation.associated_insights', index=9,
      number=14, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_RECOMMENDATION_INSIGHTREFERENCE, ],
  enum_types=[
  ],
  serialized_options=b'\352A\220\001\n)recommender.googleapis.com/Recommendation\022cprojects/{project}/locations/{location}/recommenders/{recommender}/recommendations/{recommendation}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=229,
  serialized_end=925,
)


_RECOMMENDATIONCONTENT = _descriptor.Descriptor(
  name='RecommendationContent',
  full_name='google.cloud.recommender.v1.RecommendationContent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operation_groups', full_name='google.cloud.recommender.v1.RecommendationContent.operation_groups', index=0,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=927,
  serialized_end=1021,
)


_OPERATIONGROUP = _descriptor.Descriptor(
  name='OperationGroup',
  full_name='google.cloud.recommender.v1.OperationGroup',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.cloud.recommender.v1.OperationGroup.operations', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=1023,
  serialized_end=1099,
)


_OPERATION_PATHFILTERSENTRY = _descriptor.Descriptor(
  name='PathFiltersEntry',
  full_name='google.cloud.recommender.v1.Operation.PathFiltersEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.recommender.v1.Operation.PathFiltersEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.recommender.v1.Operation.PathFiltersEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1512,
  serialized_end=1586,
)

_OPERATION_PATHVALUEMATCHERSENTRY = _descriptor.Descriptor(
  name='PathValueMatchersEntry',
  full_name='google.cloud.recommender.v1.Operation.PathValueMatchersEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.recommender.v1.Operation.PathValueMatchersEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.recommender.v1.Operation.PathValueMatchersEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1588,
  serialized_end=1687,
)

_OPERATION = _descriptor.Descriptor(
  name='Operation',
  full_name='google.cloud.recommender.v1.Operation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='action', full_name='google.cloud.recommender.v1.Operation.action', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource_type', full_name='google.cloud.recommender.v1.Operation.resource_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.cloud.recommender.v1.Operation.resource', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='path', full_name='google.cloud.recommender.v1.Operation.path', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_resource', full_name='google.cloud.recommender.v1.Operation.source_resource', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_path', full_name='google.cloud.recommender.v1.Operation.source_path', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.recommender.v1.Operation.value', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value_matcher', full_name='google.cloud.recommender.v1.Operation.value_matcher', index=7,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='path_filters', full_name='google.cloud.recommender.v1.Operation.path_filters', index=8,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='path_value_matchers', full_name='google.cloud.recommender.v1.Operation.path_value_matchers', index=9,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_OPERATION_PATHFILTERSENTRY, _OPERATION_PATHVALUEMATCHERSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='path_value', full_name='google.cloud.recommender.v1.Operation.path_value',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1102,
  serialized_end=1701,
)


_VALUEMATCHER = _descriptor.Descriptor(
  name='ValueMatcher',
  full_name='google.cloud.recommender.v1.ValueMatcher',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='matches_pattern', full_name='google.cloud.recommender.v1.ValueMatcher.matches_pattern', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
    _descriptor.OneofDescriptor(
      name='match_variant', full_name='google.cloud.recommender.v1.ValueMatcher.match_variant',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1703,
  serialized_end=1761,
)


_COSTPROJECTION = _descriptor.Descriptor(
  name='CostProjection',
  full_name='google.cloud.recommender.v1.CostProjection',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cost', full_name='google.cloud.recommender.v1.CostProjection.cost', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='duration', full_name='google.cloud.recommender.v1.CostProjection.duration', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=1763,
  serialized_end=1858,
)


_IMPACT = _descriptor.Descriptor(
  name='Impact',
  full_name='google.cloud.recommender.v1.Impact',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='category', full_name='google.cloud.recommender.v1.Impact.category', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cost_projection', full_name='google.cloud.recommender.v1.Impact.cost_projection', index=1,
      number=100, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _IMPACT_CATEGORY,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='projection', full_name='google.cloud.recommender.v1.Impact.projection',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1861,
  serialized_end=2117,
)


_RECOMMENDATIONSTATEINFO_STATEMETADATAENTRY = _descriptor.Descriptor(
  name='StateMetadataEntry',
  full_name='google.cloud.recommender.v1.RecommendationStateInfo.StateMetadataEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.recommender.v1.RecommendationStateInfo.StateMetadataEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.recommender.v1.RecommendationStateInfo.StateMetadataEntry.value', index=1,
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
  serialized_start=2319,
  serialized_end=2371,
)

_RECOMMENDATIONSTATEINFO = _descriptor.Descriptor(
  name='RecommendationStateInfo',
  full_name='google.cloud.recommender.v1.RecommendationStateInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.recommender.v1.RecommendationStateInfo.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state_metadata', full_name='google.cloud.recommender.v1.RecommendationStateInfo.state_metadata', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_RECOMMENDATIONSTATEINFO_STATEMETADATAENTRY, ],
  enum_types=[
    _RECOMMENDATIONSTATEINFO_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2120,
  serialized_end=2470,
)

_RECOMMENDATION_INSIGHTREFERENCE.containing_type = _RECOMMENDATION
_RECOMMENDATION.fields_by_name['last_refresh_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_RECOMMENDATION.fields_by_name['primary_impact'].message_type = _IMPACT
_RECOMMENDATION.fields_by_name['additional_impact'].message_type = _IMPACT
_RECOMMENDATION.fields_by_name['content'].message_type = _RECOMMENDATIONCONTENT
_RECOMMENDATION.fields_by_name['state_info'].message_type = _RECOMMENDATIONSTATEINFO
_RECOMMENDATION.fields_by_name['associated_insights'].message_type = _RECOMMENDATION_INSIGHTREFERENCE
_RECOMMENDATIONCONTENT.fields_by_name['operation_groups'].message_type = _OPERATIONGROUP
_OPERATIONGROUP.fields_by_name['operations'].message_type = _OPERATION
_OPERATION_PATHFILTERSENTRY.fields_by_name['value'].message_type = google_dot_protobuf_dot_struct__pb2._VALUE
_OPERATION_PATHFILTERSENTRY.containing_type = _OPERATION
_OPERATION_PATHVALUEMATCHERSENTRY.fields_by_name['value'].message_type = _VALUEMATCHER
_OPERATION_PATHVALUEMATCHERSENTRY.containing_type = _OPERATION
_OPERATION.fields_by_name['value'].message_type = google_dot_protobuf_dot_struct__pb2._VALUE
_OPERATION.fields_by_name['value_matcher'].message_type = _VALUEMATCHER
_OPERATION.fields_by_name['path_filters'].message_type = _OPERATION_PATHFILTERSENTRY
_OPERATION.fields_by_name['path_value_matchers'].message_type = _OPERATION_PATHVALUEMATCHERSENTRY
_OPERATION.oneofs_by_name['path_value'].fields.append(
  _OPERATION.fields_by_name['value'])
_OPERATION.fields_by_name['value'].containing_oneof = _OPERATION.oneofs_by_name['path_value']
_OPERATION.oneofs_by_name['path_value'].fields.append(
  _OPERATION.fields_by_name['value_matcher'])
_OPERATION.fields_by_name['value_matcher'].containing_oneof = _OPERATION.oneofs_by_name['path_value']
_VALUEMATCHER.oneofs_by_name['match_variant'].fields.append(
  _VALUEMATCHER.fields_by_name['matches_pattern'])
_VALUEMATCHER.fields_by_name['matches_pattern'].containing_oneof = _VALUEMATCHER.oneofs_by_name['match_variant']
_COSTPROJECTION.fields_by_name['cost'].message_type = google_dot_type_dot_money__pb2._MONEY
_COSTPROJECTION.fields_by_name['duration'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_IMPACT.fields_by_name['category'].enum_type = _IMPACT_CATEGORY
_IMPACT.fields_by_name['cost_projection'].message_type = _COSTPROJECTION
_IMPACT_CATEGORY.containing_type = _IMPACT
_IMPACT.oneofs_by_name['projection'].fields.append(
  _IMPACT.fields_by_name['cost_projection'])
_IMPACT.fields_by_name['cost_projection'].containing_oneof = _IMPACT.oneofs_by_name['projection']
_RECOMMENDATIONSTATEINFO_STATEMETADATAENTRY.containing_type = _RECOMMENDATIONSTATEINFO
_RECOMMENDATIONSTATEINFO.fields_by_name['state'].enum_type = _RECOMMENDATIONSTATEINFO_STATE
_RECOMMENDATIONSTATEINFO.fields_by_name['state_metadata'].message_type = _RECOMMENDATIONSTATEINFO_STATEMETADATAENTRY
_RECOMMENDATIONSTATEINFO_STATE.containing_type = _RECOMMENDATIONSTATEINFO
DESCRIPTOR.message_types_by_name['Recommendation'] = _RECOMMENDATION
DESCRIPTOR.message_types_by_name['RecommendationContent'] = _RECOMMENDATIONCONTENT
DESCRIPTOR.message_types_by_name['OperationGroup'] = _OPERATIONGROUP
DESCRIPTOR.message_types_by_name['Operation'] = _OPERATION
DESCRIPTOR.message_types_by_name['ValueMatcher'] = _VALUEMATCHER
DESCRIPTOR.message_types_by_name['CostProjection'] = _COSTPROJECTION
DESCRIPTOR.message_types_by_name['Impact'] = _IMPACT
DESCRIPTOR.message_types_by_name['RecommendationStateInfo'] = _RECOMMENDATIONSTATEINFO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Recommendation = _reflection.GeneratedProtocolMessageType('Recommendation', (_message.Message,), {

  'InsightReference' : _reflection.GeneratedProtocolMessageType('InsightReference', (_message.Message,), {
    'DESCRIPTOR' : _RECOMMENDATION_INSIGHTREFERENCE,
    '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.Recommendation.InsightReference)
    })
  ,
  'DESCRIPTOR' : _RECOMMENDATION,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.Recommendation)
  })
_sym_db.RegisterMessage(Recommendation)
_sym_db.RegisterMessage(Recommendation.InsightReference)

RecommendationContent = _reflection.GeneratedProtocolMessageType('RecommendationContent', (_message.Message,), {
  'DESCRIPTOR' : _RECOMMENDATIONCONTENT,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.RecommendationContent)
  })
_sym_db.RegisterMessage(RecommendationContent)

OperationGroup = _reflection.GeneratedProtocolMessageType('OperationGroup', (_message.Message,), {
  'DESCRIPTOR' : _OPERATIONGROUP,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.OperationGroup)
  })
_sym_db.RegisterMessage(OperationGroup)

Operation = _reflection.GeneratedProtocolMessageType('Operation', (_message.Message,), {

  'PathFiltersEntry' : _reflection.GeneratedProtocolMessageType('PathFiltersEntry', (_message.Message,), {
    'DESCRIPTOR' : _OPERATION_PATHFILTERSENTRY,
    '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.Operation.PathFiltersEntry)
    })
  ,

  'PathValueMatchersEntry' : _reflection.GeneratedProtocolMessageType('PathValueMatchersEntry', (_message.Message,), {
    'DESCRIPTOR' : _OPERATION_PATHVALUEMATCHERSENTRY,
    '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.Operation.PathValueMatchersEntry)
    })
  ,
  'DESCRIPTOR' : _OPERATION,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.Operation)
  })
_sym_db.RegisterMessage(Operation)
_sym_db.RegisterMessage(Operation.PathFiltersEntry)
_sym_db.RegisterMessage(Operation.PathValueMatchersEntry)

ValueMatcher = _reflection.GeneratedProtocolMessageType('ValueMatcher', (_message.Message,), {
  'DESCRIPTOR' : _VALUEMATCHER,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.ValueMatcher)
  })
_sym_db.RegisterMessage(ValueMatcher)

CostProjection = _reflection.GeneratedProtocolMessageType('CostProjection', (_message.Message,), {
  'DESCRIPTOR' : _COSTPROJECTION,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.CostProjection)
  })
_sym_db.RegisterMessage(CostProjection)

Impact = _reflection.GeneratedProtocolMessageType('Impact', (_message.Message,), {
  'DESCRIPTOR' : _IMPACT,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.Impact)
  })
_sym_db.RegisterMessage(Impact)

RecommendationStateInfo = _reflection.GeneratedProtocolMessageType('RecommendationStateInfo', (_message.Message,), {

  'StateMetadataEntry' : _reflection.GeneratedProtocolMessageType('StateMetadataEntry', (_message.Message,), {
    'DESCRIPTOR' : _RECOMMENDATIONSTATEINFO_STATEMETADATAENTRY,
    '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.RecommendationStateInfo.StateMetadataEntry)
    })
  ,
  'DESCRIPTOR' : _RECOMMENDATIONSTATEINFO,
  '__module__' : 'google.cloud.recommender.v1.recommendation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.RecommendationStateInfo)
  })
_sym_db.RegisterMessage(RecommendationStateInfo)
_sym_db.RegisterMessage(RecommendationStateInfo.StateMetadataEntry)


DESCRIPTOR._options = None
_RECOMMENDATION._options = None
_OPERATION_PATHFILTERSENTRY._options = None
_OPERATION_PATHVALUEMATCHERSENTRY._options = None
_RECOMMENDATIONSTATEINFO_STATEMETADATAENTRY._options = None
# @@protoc_insertion_point(module_scope)
