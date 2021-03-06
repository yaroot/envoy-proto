# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommendationengine/v1beta1/import.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.recommendationengine.v1beta1 import catalog_pb2 as google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_catalog__pb2
from google.cloud.recommendationengine.v1beta1 import user_event_pb2 as google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_user__event__pb2
from google.cloud.recommendationengine.v1beta1 import recommendationengine_resources_pb2 as google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_recommendationengine__resources__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/recommendationengine/v1beta1/import.proto',
  package='google.cloud.recommendationengine.v1beta1',
  syntax='proto3',
  serialized_options=b'\n-com.google.cloud.recommendationengine.v1beta1P\001Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\242\002\005RECAI\252\002)Google.Cloud.RecommendationEngine.V1Beta1\312\002)Google\\Cloud\\RecommendationEngine\\V1beta1\352\002,Google::Cloud::RecommendationEngine::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/cloud/recommendationengine/v1beta1/import.proto\x12)google.cloud.recommendationengine.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x37google/cloud/recommendationengine/v1beta1/catalog.proto\x1a:google/cloud/recommendationengine/v1beta1/user_event.proto\x1aNgoogle/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x1cgoogle/api/annotations.proto\"$\n\tGcsSource\x12\x17\n\ninput_uris\x18\x01 \x03(\tB\x03\xe0\x41\x02\"i\n\x13\x43\x61talogInlineSource\x12R\n\rcatalog_items\x18\x01 \x03(\x0b\x32\x36.google.cloud.recommendationengine.v1beta1.CatalogItemB\x03\xe0\x41\x01\"g\n\x15UserEventInlineSource\x12N\n\x0buser_events\x18\x01 \x03(\x0b\x32\x34.google.cloud.recommendationengine.v1beta1.UserEventB\x03\xe0\x41\x01\"9\n\x12ImportErrorsConfig\x12\x14\n\ngcs_prefix\x18\x01 \x01(\tH\x00\x42\r\n\x0b\x64\x65stination\"\xa7\x02\n\x19ImportCatalogItemsRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+recommendationengine.googleapis.com/Catalog\x12\x17\n\nrequest_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12Q\n\x0cinput_config\x18\x03 \x01(\x0b\x32\x36.google.cloud.recommendationengine.v1beta1.InputConfigB\x03\xe0\x41\x02\x12Y\n\rerrors_config\x18\x04 \x01(\x0b\x32=.google.cloud.recommendationengine.v1beta1.ImportErrorsConfigB\x03\xe0\x41\x01\"\xa8\x02\n\x17ImportUserEventsRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.recommendationengine.googleapis.com/EventStore\x12\x17\n\nrequest_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12Q\n\x0cinput_config\x18\x03 \x01(\x0b\x32\x36.google.cloud.recommendationengine.v1beta1.InputConfigB\x03\xe0\x41\x02\x12Y\n\rerrors_config\x18\x04 \x01(\x0b\x32=.google.cloud.recommendationengine.v1beta1.ImportErrorsConfigB\x03\xe0\x41\x01\"\xaa\x02\n\x0bInputConfig\x12_\n\x15\x63\x61talog_inline_source\x18\x01 \x01(\x0b\x32>.google.cloud.recommendationengine.v1beta1.CatalogInlineSourceH\x00\x12J\n\ngcs_source\x18\x02 \x01(\x0b\x32\x34.google.cloud.recommendationengine.v1beta1.GcsSourceH\x00\x12\x64\n\x18user_event_inline_source\x18\x03 \x01(\x0b\x32@.google.cloud.recommendationengine.v1beta1.UserEventInlineSourceH\x00\x42\x08\n\x06source\"\xcc\x01\n\x0eImportMetadata\x12\x16\n\x0eoperation_name\x18\x05 \x01(\t\x12\x12\n\nrequest_id\x18\x03 \x01(\t\x12/\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rsuccess_count\x18\x01 \x01(\x03\x12\x15\n\rfailure_count\x18\x02 \x01(\x03\x12/\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\x9d\x01\n\x1aImportCatalogItemsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12T\n\rerrors_config\x18\x02 \x01(\x0b\x32=.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig\"\xf6\x01\n\x18ImportUserEventsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12T\n\rerrors_config\x18\x02 \x01(\x0b\x32=.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig\x12Y\n\x0eimport_summary\x18\x03 \x01(\x0b\x32\x41.google.cloud.recommendationengine.v1beta1.UserEventImportSummary\"T\n\x16UserEventImportSummary\x12\x1b\n\x13joined_events_count\x18\x01 \x01(\x03\x12\x1d\n\x15unjoined_events_count\x18\x02 \x01(\x03\x42\x9f\x02\n-com.google.cloud.recommendationengine.v1beta1P\x01Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\xa2\x02\x05RECAI\xaa\x02)Google.Cloud.RecommendationEngine.V1Beta1\xca\x02)Google\\Cloud\\RecommendationEngine\\V1beta1\xea\x02,Google::Cloud::RecommendationEngine::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_catalog__pb2.DESCRIPTOR,google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_user__event__pb2.DESCRIPTOR,google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_recommendationengine__resources__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_GCSSOURCE = _descriptor.Descriptor(
  name='GcsSource',
  full_name='google.cloud.recommendationengine.v1beta1.GcsSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='input_uris', full_name='google.cloud.recommendationengine.v1beta1.GcsSource.input_uris', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=446,
  serialized_end=482,
)


_CATALOGINLINESOURCE = _descriptor.Descriptor(
  name='CatalogInlineSource',
  full_name='google.cloud.recommendationengine.v1beta1.CatalogInlineSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='catalog_items', full_name='google.cloud.recommendationengine.v1beta1.CatalogInlineSource.catalog_items', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=484,
  serialized_end=589,
)


_USEREVENTINLINESOURCE = _descriptor.Descriptor(
  name='UserEventInlineSource',
  full_name='google.cloud.recommendationengine.v1beta1.UserEventInlineSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_events', full_name='google.cloud.recommendationengine.v1beta1.UserEventInlineSource.user_events', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=591,
  serialized_end=694,
)


_IMPORTERRORSCONFIG = _descriptor.Descriptor(
  name='ImportErrorsConfig',
  full_name='google.cloud.recommendationengine.v1beta1.ImportErrorsConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='gcs_prefix', full_name='google.cloud.recommendationengine.v1beta1.ImportErrorsConfig.gcs_prefix', index=0,
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
      name='destination', full_name='google.cloud.recommendationengine.v1beta1.ImportErrorsConfig.destination',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=696,
  serialized_end=753,
)


_IMPORTCATALOGITEMSREQUEST = _descriptor.Descriptor(
  name='ImportCatalogItemsRequest',
  full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A-\n+recommendationengine.googleapis.com/Catalog', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest.request_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='input_config', full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest.input_config', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='errors_config', full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest.errors_config', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=756,
  serialized_end=1051,
)


_IMPORTUSEREVENTSREQUEST = _descriptor.Descriptor(
  name='ImportUserEventsRequest',
  full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A0\n.recommendationengine.googleapis.com/EventStore', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest.request_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='input_config', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest.input_config', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='errors_config', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest.errors_config', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=1054,
  serialized_end=1350,
)


_INPUTCONFIG = _descriptor.Descriptor(
  name='InputConfig',
  full_name='google.cloud.recommendationengine.v1beta1.InputConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='catalog_inline_source', full_name='google.cloud.recommendationengine.v1beta1.InputConfig.catalog_inline_source', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='gcs_source', full_name='google.cloud.recommendationengine.v1beta1.InputConfig.gcs_source', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_event_inline_source', full_name='google.cloud.recommendationengine.v1beta1.InputConfig.user_event_inline_source', index=2,
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
    _descriptor.OneofDescriptor(
      name='source', full_name='google.cloud.recommendationengine.v1beta1.InputConfig.source',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1353,
  serialized_end=1651,
)


_IMPORTMETADATA = _descriptor.Descriptor(
  name='ImportMetadata',
  full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operation_name', full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata.operation_name', index=0,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata.request_id', index=1,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata.create_time', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='success_count', full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata.success_count', index=3,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='failure_count', full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata.failure_count', index=4,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.recommendationengine.v1beta1.ImportMetadata.update_time', index=5,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_start=1654,
  serialized_end=1858,
)


_IMPORTCATALOGITEMSRESPONSE = _descriptor.Descriptor(
  name='ImportCatalogItemsResponse',
  full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='error_samples', full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsResponse.error_samples', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='errors_config', full_name='google.cloud.recommendationengine.v1beta1.ImportCatalogItemsResponse.errors_config', index=1,
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
  serialized_start=1861,
  serialized_end=2018,
)


_IMPORTUSEREVENTSRESPONSE = _descriptor.Descriptor(
  name='ImportUserEventsResponse',
  full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='error_samples', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsResponse.error_samples', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='errors_config', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsResponse.errors_config', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='import_summary', full_name='google.cloud.recommendationengine.v1beta1.ImportUserEventsResponse.import_summary', index=2,
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
  serialized_start=2021,
  serialized_end=2267,
)


_USEREVENTIMPORTSUMMARY = _descriptor.Descriptor(
  name='UserEventImportSummary',
  full_name='google.cloud.recommendationengine.v1beta1.UserEventImportSummary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='joined_events_count', full_name='google.cloud.recommendationengine.v1beta1.UserEventImportSummary.joined_events_count', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='unjoined_events_count', full_name='google.cloud.recommendationengine.v1beta1.UserEventImportSummary.unjoined_events_count', index=1,
      number=2, type=3, cpp_type=2, label=1,
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
  serialized_start=2269,
  serialized_end=2353,
)

_CATALOGINLINESOURCE.fields_by_name['catalog_items'].message_type = google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_catalog__pb2._CATALOGITEM
_USEREVENTINLINESOURCE.fields_by_name['user_events'].message_type = google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_user__event__pb2._USEREVENT
_IMPORTERRORSCONFIG.oneofs_by_name['destination'].fields.append(
  _IMPORTERRORSCONFIG.fields_by_name['gcs_prefix'])
_IMPORTERRORSCONFIG.fields_by_name['gcs_prefix'].containing_oneof = _IMPORTERRORSCONFIG.oneofs_by_name['destination']
_IMPORTCATALOGITEMSREQUEST.fields_by_name['input_config'].message_type = _INPUTCONFIG
_IMPORTCATALOGITEMSREQUEST.fields_by_name['errors_config'].message_type = _IMPORTERRORSCONFIG
_IMPORTUSEREVENTSREQUEST.fields_by_name['input_config'].message_type = _INPUTCONFIG
_IMPORTUSEREVENTSREQUEST.fields_by_name['errors_config'].message_type = _IMPORTERRORSCONFIG
_INPUTCONFIG.fields_by_name['catalog_inline_source'].message_type = _CATALOGINLINESOURCE
_INPUTCONFIG.fields_by_name['gcs_source'].message_type = _GCSSOURCE
_INPUTCONFIG.fields_by_name['user_event_inline_source'].message_type = _USEREVENTINLINESOURCE
_INPUTCONFIG.oneofs_by_name['source'].fields.append(
  _INPUTCONFIG.fields_by_name['catalog_inline_source'])
_INPUTCONFIG.fields_by_name['catalog_inline_source'].containing_oneof = _INPUTCONFIG.oneofs_by_name['source']
_INPUTCONFIG.oneofs_by_name['source'].fields.append(
  _INPUTCONFIG.fields_by_name['gcs_source'])
_INPUTCONFIG.fields_by_name['gcs_source'].containing_oneof = _INPUTCONFIG.oneofs_by_name['source']
_INPUTCONFIG.oneofs_by_name['source'].fields.append(
  _INPUTCONFIG.fields_by_name['user_event_inline_source'])
_INPUTCONFIG.fields_by_name['user_event_inline_source'].containing_oneof = _INPUTCONFIG.oneofs_by_name['source']
_IMPORTMETADATA.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_IMPORTMETADATA.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_IMPORTCATALOGITEMSRESPONSE.fields_by_name['error_samples'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_IMPORTCATALOGITEMSRESPONSE.fields_by_name['errors_config'].message_type = _IMPORTERRORSCONFIG
_IMPORTUSEREVENTSRESPONSE.fields_by_name['error_samples'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_IMPORTUSEREVENTSRESPONSE.fields_by_name['errors_config'].message_type = _IMPORTERRORSCONFIG
_IMPORTUSEREVENTSRESPONSE.fields_by_name['import_summary'].message_type = _USEREVENTIMPORTSUMMARY
DESCRIPTOR.message_types_by_name['GcsSource'] = _GCSSOURCE
DESCRIPTOR.message_types_by_name['CatalogInlineSource'] = _CATALOGINLINESOURCE
DESCRIPTOR.message_types_by_name['UserEventInlineSource'] = _USEREVENTINLINESOURCE
DESCRIPTOR.message_types_by_name['ImportErrorsConfig'] = _IMPORTERRORSCONFIG
DESCRIPTOR.message_types_by_name['ImportCatalogItemsRequest'] = _IMPORTCATALOGITEMSREQUEST
DESCRIPTOR.message_types_by_name['ImportUserEventsRequest'] = _IMPORTUSEREVENTSREQUEST
DESCRIPTOR.message_types_by_name['InputConfig'] = _INPUTCONFIG
DESCRIPTOR.message_types_by_name['ImportMetadata'] = _IMPORTMETADATA
DESCRIPTOR.message_types_by_name['ImportCatalogItemsResponse'] = _IMPORTCATALOGITEMSRESPONSE
DESCRIPTOR.message_types_by_name['ImportUserEventsResponse'] = _IMPORTUSEREVENTSRESPONSE
DESCRIPTOR.message_types_by_name['UserEventImportSummary'] = _USEREVENTIMPORTSUMMARY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GcsSource = _reflection.GeneratedProtocolMessageType('GcsSource', (_message.Message,), {
  'DESCRIPTOR' : _GCSSOURCE,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.GcsSource)
  })
_sym_db.RegisterMessage(GcsSource)

CatalogInlineSource = _reflection.GeneratedProtocolMessageType('CatalogInlineSource', (_message.Message,), {
  'DESCRIPTOR' : _CATALOGINLINESOURCE,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.CatalogInlineSource)
  })
_sym_db.RegisterMessage(CatalogInlineSource)

UserEventInlineSource = _reflection.GeneratedProtocolMessageType('UserEventInlineSource', (_message.Message,), {
  'DESCRIPTOR' : _USEREVENTINLINESOURCE,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.UserEventInlineSource)
  })
_sym_db.RegisterMessage(UserEventInlineSource)

ImportErrorsConfig = _reflection.GeneratedProtocolMessageType('ImportErrorsConfig', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTERRORSCONFIG,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ImportErrorsConfig)
  })
_sym_db.RegisterMessage(ImportErrorsConfig)

ImportCatalogItemsRequest = _reflection.GeneratedProtocolMessageType('ImportCatalogItemsRequest', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTCATALOGITEMSREQUEST,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest)
  })
_sym_db.RegisterMessage(ImportCatalogItemsRequest)

ImportUserEventsRequest = _reflection.GeneratedProtocolMessageType('ImportUserEventsRequest', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTUSEREVENTSREQUEST,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest)
  })
_sym_db.RegisterMessage(ImportUserEventsRequest)

InputConfig = _reflection.GeneratedProtocolMessageType('InputConfig', (_message.Message,), {
  'DESCRIPTOR' : _INPUTCONFIG,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.InputConfig)
  })
_sym_db.RegisterMessage(InputConfig)

ImportMetadata = _reflection.GeneratedProtocolMessageType('ImportMetadata', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTMETADATA,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ImportMetadata)
  })
_sym_db.RegisterMessage(ImportMetadata)

ImportCatalogItemsResponse = _reflection.GeneratedProtocolMessageType('ImportCatalogItemsResponse', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTCATALOGITEMSRESPONSE,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ImportCatalogItemsResponse)
  })
_sym_db.RegisterMessage(ImportCatalogItemsResponse)

ImportUserEventsResponse = _reflection.GeneratedProtocolMessageType('ImportUserEventsResponse', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTUSEREVENTSRESPONSE,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ImportUserEventsResponse)
  })
_sym_db.RegisterMessage(ImportUserEventsResponse)

UserEventImportSummary = _reflection.GeneratedProtocolMessageType('UserEventImportSummary', (_message.Message,), {
  'DESCRIPTOR' : _USEREVENTIMPORTSUMMARY,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.import_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.UserEventImportSummary)
  })
_sym_db.RegisterMessage(UserEventImportSummary)


DESCRIPTOR._options = None
_GCSSOURCE.fields_by_name['input_uris']._options = None
_CATALOGINLINESOURCE.fields_by_name['catalog_items']._options = None
_USEREVENTINLINESOURCE.fields_by_name['user_events']._options = None
_IMPORTCATALOGITEMSREQUEST.fields_by_name['parent']._options = None
_IMPORTCATALOGITEMSREQUEST.fields_by_name['request_id']._options = None
_IMPORTCATALOGITEMSREQUEST.fields_by_name['input_config']._options = None
_IMPORTCATALOGITEMSREQUEST.fields_by_name['errors_config']._options = None
_IMPORTUSEREVENTSREQUEST.fields_by_name['parent']._options = None
_IMPORTUSEREVENTSREQUEST.fields_by_name['request_id']._options = None
_IMPORTUSEREVENTSREQUEST.fields_by_name['input_config']._options = None
_IMPORTUSEREVENTSREQUEST.fields_by_name['errors_config']._options = None
# @@protoc_insertion_point(module_scope)
