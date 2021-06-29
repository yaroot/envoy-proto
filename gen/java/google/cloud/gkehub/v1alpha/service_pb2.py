# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkehub/v1alpha/service.proto
"""Generated protocol buffer code."""
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
from google.cloud.gkehub.v1alpha import feature_pb2 as google_dot_cloud_dot_gkehub_dot_v1alpha_dot_feature__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/gkehub/v1alpha/service.proto',
  package='google.cloud.gkehub.v1alpha',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.gkehub.v1alphaB\014ServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/gkehub/v1alpha;gkehub\252\002\033Google.Cloud.GkeHub.V1Alpha\312\002\033Google\\Cloud\\GkeHub\\V1alpha\352\002\036Google::Cloud::GkeHub::V1alpha',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)google/cloud/gkehub/v1alpha/service.proto\x12\x1bgoogle.cloud.gkehub.v1alpha\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a)google/cloud/gkehub/v1alpha/feature.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"n\n\x13ListFeaturesRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"h\n\x14ListFeaturesResponse\x12\x37\n\tresources\x18\x01 \x03(\x0b\x32$.google.cloud.gkehub.v1alpha.Feature\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"!\n\x11GetFeatureRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"\x8b\x01\n\x14\x43reateFeatureRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x12\n\nfeature_id\x18\x02 \x01(\t\x12\x36\n\x08resource\x18\x03 \x01(\x0b\x32$.google.cloud.gkehub.v1alpha.Feature\x12\x17\n\nrequest_id\x18\x04 \x01(\tB\x03\xe0\x41\x01\"L\n\x14\x44\x65leteFeatureRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05\x66orce\x18\x02 \x01(\x08\x12\x17\n\nrequest_id\x18\x03 \x01(\tB\x03\xe0\x41\x01\"\xa6\x01\n\x14UpdateFeatureRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x36\n\x08resource\x18\x03 \x01(\x0b\x32$.google.cloud.gkehub.v1alpha.Feature\x12\x17\n\nrequest_id\x18\x04 \x01(\tB\x03\xe0\x41\x01\"\xf9\x01\n\x11OperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1a\n\rstatus_detail\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10\x63\x61ncel_requested\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\x32\xd0\x08\n\x06GkeHub\x12\xb7\x01\n\x0cListFeatures\x12\x30.google.cloud.gkehub.v1alpha.ListFeaturesRequest\x1a\x31.google.cloud.gkehub.v1alpha.ListFeaturesResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1alpha/{parent=projects/*/locations/*}/features\xda\x41\x06parent\x12\xa4\x01\n\nGetFeature\x12..google.cloud.gkehub.v1alpha.GetFeatureRequest\x1a$.google.cloud.gkehub.v1alpha.Feature\"@\x82\xd3\xe4\x93\x02\x33\x12\x31/v1alpha/{name=projects/*/locations/*/features/*}\xda\x41\x04name\x12\xe2\x01\n\rCreateFeature\x12\x31.google.cloud.gkehub.v1alpha.CreateFeatureRequest\x1a\x1d.google.longrunning.Operation\"\x7f\x82\xd3\xe4\x93\x02=\"1/v1alpha/{parent=projects/*/locations/*}/features:\x08resource\xda\x41\x1aparent,resource,feature_id\xca\x41\x1c\n\x07\x46\x65\x61ture\x12\x11OperationMetadata\x12\xd0\x01\n\rDeleteFeature\x12\x31.google.cloud.gkehub.v1alpha.DeleteFeatureRequest\x1a\x1d.google.longrunning.Operation\"m\x82\xd3\xe4\x93\x02\x33*1/v1alpha/{name=projects/*/locations/*/features/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xe1\x01\n\rUpdateFeature\x12\x31.google.cloud.gkehub.v1alpha.UpdateFeatureRequest\x1a\x1d.google.longrunning.Operation\"~\x82\xd3\xe4\x93\x02=21/v1alpha/{name=projects/*/locations/*/features/*}:\x08resource\xda\x41\x19name,resource,update_mask\xca\x41\x1c\n\x07\x46\x65\x61ture\x12\x11OperationMetadata\x1aI\xca\x41\x15gkehub.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd1\x01\n\x1f\x63om.google.cloud.gkehub.v1alphaB\x0cServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/gkehub/v1alpha;gkehub\xaa\x02\x1bGoogle.Cloud.GkeHub.V1Alpha\xca\x02\x1bGoogle\\Cloud\\GkeHub\\V1alpha\xea\x02\x1eGoogle::Cloud::GkeHub::V1alphab\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_gkehub_dot_v1alpha_dot_feature__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_LISTFEATURESREQUEST = _descriptor.Descriptor(
  name='ListFeaturesRequest',
  full_name='google.cloud.gkehub.v1alpha.ListFeaturesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.gkehub.v1alpha.ListFeaturesRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.gkehub.v1alpha.ListFeaturesRequest.page_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.gkehub.v1alpha.ListFeaturesRequest.page_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.cloud.gkehub.v1alpha.ListFeaturesRequest.filter', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='order_by', full_name='google.cloud.gkehub.v1alpha.ListFeaturesRequest.order_by', index=4,
      number=5, type=9, cpp_type=9, label=1,
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
  serialized_start=336,
  serialized_end=446,
)


_LISTFEATURESRESPONSE = _descriptor.Descriptor(
  name='ListFeaturesResponse',
  full_name='google.cloud.gkehub.v1alpha.ListFeaturesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resources', full_name='google.cloud.gkehub.v1alpha.ListFeaturesResponse.resources', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.gkehub.v1alpha.ListFeaturesResponse.next_page_token', index=1,
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
  serialized_start=448,
  serialized_end=552,
)


_GETFEATUREREQUEST = _descriptor.Descriptor(
  name='GetFeatureRequest',
  full_name='google.cloud.gkehub.v1alpha.GetFeatureRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.gkehub.v1alpha.GetFeatureRequest.name', index=0,
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
  serialized_start=554,
  serialized_end=587,
)


_CREATEFEATUREREQUEST = _descriptor.Descriptor(
  name='CreateFeatureRequest',
  full_name='google.cloud.gkehub.v1alpha.CreateFeatureRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.gkehub.v1alpha.CreateFeatureRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feature_id', full_name='google.cloud.gkehub.v1alpha.CreateFeatureRequest.feature_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.cloud.gkehub.v1alpha.CreateFeatureRequest.resource', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.cloud.gkehub.v1alpha.CreateFeatureRequest.request_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=590,
  serialized_end=729,
)


_DELETEFEATUREREQUEST = _descriptor.Descriptor(
  name='DeleteFeatureRequest',
  full_name='google.cloud.gkehub.v1alpha.DeleteFeatureRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.gkehub.v1alpha.DeleteFeatureRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='force', full_name='google.cloud.gkehub.v1alpha.DeleteFeatureRequest.force', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.cloud.gkehub.v1alpha.DeleteFeatureRequest.request_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=731,
  serialized_end=807,
)


_UPDATEFEATUREREQUEST = _descriptor.Descriptor(
  name='UpdateFeatureRequest',
  full_name='google.cloud.gkehub.v1alpha.UpdateFeatureRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.gkehub.v1alpha.UpdateFeatureRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.cloud.gkehub.v1alpha.UpdateFeatureRequest.update_mask', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.cloud.gkehub.v1alpha.UpdateFeatureRequest.resource', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.cloud.gkehub.v1alpha.UpdateFeatureRequest.request_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=810,
  serialized_end=976,
)


_OPERATIONMETADATA = _descriptor.Descriptor(
  name='OperationMetadata',
  full_name='google.cloud.gkehub.v1alpha.OperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.create_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.end_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.target', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='verb', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.verb', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status_detail', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.status_detail', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cancel_requested', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.cancel_requested', index=5,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='api_version', full_name='google.cloud.gkehub.v1alpha.OperationMetadata.api_version', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=979,
  serialized_end=1228,
)

_LISTFEATURESRESPONSE.fields_by_name['resources'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_feature__pb2._FEATURE
_CREATEFEATUREREQUEST.fields_by_name['resource'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_feature__pb2._FEATURE
_UPDATEFEATUREREQUEST.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_UPDATEFEATUREREQUEST.fields_by_name['resource'].message_type = google_dot_cloud_dot_gkehub_dot_v1alpha_dot_feature__pb2._FEATURE
_OPERATIONMETADATA.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_OPERATIONMETADATA.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['ListFeaturesRequest'] = _LISTFEATURESREQUEST
DESCRIPTOR.message_types_by_name['ListFeaturesResponse'] = _LISTFEATURESRESPONSE
DESCRIPTOR.message_types_by_name['GetFeatureRequest'] = _GETFEATUREREQUEST
DESCRIPTOR.message_types_by_name['CreateFeatureRequest'] = _CREATEFEATUREREQUEST
DESCRIPTOR.message_types_by_name['DeleteFeatureRequest'] = _DELETEFEATUREREQUEST
DESCRIPTOR.message_types_by_name['UpdateFeatureRequest'] = _UPDATEFEATUREREQUEST
DESCRIPTOR.message_types_by_name['OperationMetadata'] = _OPERATIONMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListFeaturesRequest = _reflection.GeneratedProtocolMessageType('ListFeaturesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTFEATURESREQUEST,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.ListFeaturesRequest)
  })
_sym_db.RegisterMessage(ListFeaturesRequest)

ListFeaturesResponse = _reflection.GeneratedProtocolMessageType('ListFeaturesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTFEATURESRESPONSE,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.ListFeaturesResponse)
  })
_sym_db.RegisterMessage(ListFeaturesResponse)

GetFeatureRequest = _reflection.GeneratedProtocolMessageType('GetFeatureRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETFEATUREREQUEST,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.GetFeatureRequest)
  })
_sym_db.RegisterMessage(GetFeatureRequest)

CreateFeatureRequest = _reflection.GeneratedProtocolMessageType('CreateFeatureRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEFEATUREREQUEST,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.CreateFeatureRequest)
  })
_sym_db.RegisterMessage(CreateFeatureRequest)

DeleteFeatureRequest = _reflection.GeneratedProtocolMessageType('DeleteFeatureRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEFEATUREREQUEST,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.DeleteFeatureRequest)
  })
_sym_db.RegisterMessage(DeleteFeatureRequest)

UpdateFeatureRequest = _reflection.GeneratedProtocolMessageType('UpdateFeatureRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEFEATUREREQUEST,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.UpdateFeatureRequest)
  })
_sym_db.RegisterMessage(UpdateFeatureRequest)

OperationMetadata = _reflection.GeneratedProtocolMessageType('OperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _OPERATIONMETADATA,
  '__module__' : 'google.cloud.gkehub.v1alpha.service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha.OperationMetadata)
  })
_sym_db.RegisterMessage(OperationMetadata)


DESCRIPTOR._options = None
_CREATEFEATUREREQUEST.fields_by_name['request_id']._options = None
_DELETEFEATUREREQUEST.fields_by_name['request_id']._options = None
_UPDATEFEATUREREQUEST.fields_by_name['request_id']._options = None
_OPERATIONMETADATA.fields_by_name['create_time']._options = None
_OPERATIONMETADATA.fields_by_name['end_time']._options = None
_OPERATIONMETADATA.fields_by_name['target']._options = None
_OPERATIONMETADATA.fields_by_name['verb']._options = None
_OPERATIONMETADATA.fields_by_name['status_detail']._options = None
_OPERATIONMETADATA.fields_by_name['cancel_requested']._options = None
_OPERATIONMETADATA.fields_by_name['api_version']._options = None

_GKEHUB = _descriptor.ServiceDescriptor(
  name='GkeHub',
  full_name='google.cloud.gkehub.v1alpha.GkeHub',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\025gkehub.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=1231,
  serialized_end=2335,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListFeatures',
    full_name='google.cloud.gkehub.v1alpha.GkeHub.ListFeatures',
    index=0,
    containing_service=None,
    input_type=_LISTFEATURESREQUEST,
    output_type=_LISTFEATURESRESPONSE,
    serialized_options=b'\202\323\344\223\0023\0221/v1alpha/{parent=projects/*/locations/*}/features\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFeature',
    full_name='google.cloud.gkehub.v1alpha.GkeHub.GetFeature',
    index=1,
    containing_service=None,
    input_type=_GETFEATUREREQUEST,
    output_type=google_dot_cloud_dot_gkehub_dot_v1alpha_dot_feature__pb2._FEATURE,
    serialized_options=b'\202\323\344\223\0023\0221/v1alpha/{name=projects/*/locations/*/features/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateFeature',
    full_name='google.cloud.gkehub.v1alpha.GkeHub.CreateFeature',
    index=2,
    containing_service=None,
    input_type=_CREATEFEATUREREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002=\"1/v1alpha/{parent=projects/*/locations/*}/features:\010resource\332A\032parent,resource,feature_id\312A\034\n\007Feature\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteFeature',
    full_name='google.cloud.gkehub.v1alpha.GkeHub.DeleteFeature',
    index=3,
    containing_service=None,
    input_type=_DELETEFEATUREREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\0023*1/v1alpha/{name=projects/*/locations/*/features/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateFeature',
    full_name='google.cloud.gkehub.v1alpha.GkeHub.UpdateFeature',
    index=4,
    containing_service=None,
    input_type=_UPDATEFEATUREREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002=21/v1alpha/{name=projects/*/locations/*/features/*}:\010resource\332A\031name,resource,update_mask\312A\034\n\007Feature\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_GKEHUB)

DESCRIPTOR.services_by_name['GkeHub'] = _GKEHUB

# @@protoc_insertion_point(module_scope)
