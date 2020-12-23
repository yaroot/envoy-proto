# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/services/shared_set_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.resources import shared_set_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_shared__set__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/services/shared_set_service.proto',
  package='google.ads.googleads.v4.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v4.servicesB\025SharedSetServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4.Services\312\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002$Google::Ads::GoogleAds::V4::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/ads/googleads/v4/services/shared_set_service.proto\x12 google.ads.googleads.v4.services\x1a\x32google/ads/googleads/v4/resources/shared_set.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"X\n\x13GetSharedSetRequest\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"googleads.googleapis.com/SharedSet\"\xb2\x01\n\x17MutateSharedSetsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12M\n\noperations\x18\x02 \x03(\x0b\x32\x34.google.ads.googleads.v4.services.SharedSetOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xe4\x01\n\x12SharedSetOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12>\n\x06\x63reate\x18\x01 \x01(\x0b\x32,.google.ads.googleads.v4.resources.SharedSetH\x00\x12>\n\x06update\x18\x02 \x01(\x0b\x32,.google.ads.googleads.v4.resources.SharedSetH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x97\x01\n\x18MutateSharedSetsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12H\n\x07results\x18\x02 \x03(\x0b\x32\x37.google.ads.googleads.v4.services.MutateSharedSetResult\".\n\x15MutateSharedSetResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xf6\x03\n\x10SharedSetService\x12\xb9\x01\n\x0cGetSharedSet\x12\x35.google.ads.googleads.v4.services.GetSharedSetRequest\x1a,.google.ads.googleads.v4.resources.SharedSet\"D\x82\xd3\xe4\x93\x02.\x12,/v4/{resource_name=customers/*/sharedSets/*}\xda\x41\rresource_name\x12\xde\x01\n\x10MutateSharedSets\x12\x39.google.ads.googleads.v4.services.MutateSharedSetsRequest\x1a:.google.ads.googleads.v4.services.MutateSharedSetsResponse\"S\x82\xd3\xe4\x93\x02\x34\"//v4/customers/{customer_id=*}/sharedSets:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfc\x01\n$com.google.ads.googleads.v4.servicesB\x15SharedSetServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V4.Services\xca\x02 Google\\Ads\\GoogleAds\\V4\\Services\xea\x02$Google::Ads::GoogleAds::V4::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_shared__set__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETSHAREDSETREQUEST = _descriptor.Descriptor(
  name='GetSharedSetRequest',
  full_name='google.ads.googleads.v4.services.GetSharedSetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.GetSharedSetRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A$\n\"googleads.googleapis.com/SharedSet', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=321,
  serialized_end=409,
)


_MUTATESHAREDSETSREQUEST = _descriptor.Descriptor(
  name='MutateSharedSetsRequest',
  full_name='google.ads.googleads.v4.services.MutateSharedSetsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v4.services.MutateSharedSetsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v4.services.MutateSharedSetsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v4.services.MutateSharedSetsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v4.services.MutateSharedSetsRequest.validate_only', index=3,
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
  serialized_start=412,
  serialized_end=590,
)


_SHAREDSETOPERATION = _descriptor.Descriptor(
  name='SharedSetOperation',
  full_name='google.ads.googleads.v4.services.SharedSetOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v4.services.SharedSetOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v4.services.SharedSetOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v4.services.SharedSetOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v4.services.SharedSetOperation.remove', index=3,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v4.services.SharedSetOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=593,
  serialized_end=821,
)


_MUTATESHAREDSETSRESPONSE = _descriptor.Descriptor(
  name='MutateSharedSetsResponse',
  full_name='google.ads.googleads.v4.services.MutateSharedSetsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v4.services.MutateSharedSetsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v4.services.MutateSharedSetsResponse.results', index=1,
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
  serialized_start=824,
  serialized_end=975,
)


_MUTATESHAREDSETRESULT = _descriptor.Descriptor(
  name='MutateSharedSetResult',
  full_name='google.ads.googleads.v4.services.MutateSharedSetResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.MutateSharedSetResult.resource_name', index=0,
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
  serialized_start=977,
  serialized_end=1023,
)

_MUTATESHAREDSETSREQUEST.fields_by_name['operations'].message_type = _SHAREDSETOPERATION
_SHAREDSETOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_SHAREDSETOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_shared__set__pb2._SHAREDSET
_SHAREDSETOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_shared__set__pb2._SHAREDSET
_SHAREDSETOPERATION.oneofs_by_name['operation'].fields.append(
  _SHAREDSETOPERATION.fields_by_name['create'])
_SHAREDSETOPERATION.fields_by_name['create'].containing_oneof = _SHAREDSETOPERATION.oneofs_by_name['operation']
_SHAREDSETOPERATION.oneofs_by_name['operation'].fields.append(
  _SHAREDSETOPERATION.fields_by_name['update'])
_SHAREDSETOPERATION.fields_by_name['update'].containing_oneof = _SHAREDSETOPERATION.oneofs_by_name['operation']
_SHAREDSETOPERATION.oneofs_by_name['operation'].fields.append(
  _SHAREDSETOPERATION.fields_by_name['remove'])
_SHAREDSETOPERATION.fields_by_name['remove'].containing_oneof = _SHAREDSETOPERATION.oneofs_by_name['operation']
_MUTATESHAREDSETSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATESHAREDSETSRESPONSE.fields_by_name['results'].message_type = _MUTATESHAREDSETRESULT
DESCRIPTOR.message_types_by_name['GetSharedSetRequest'] = _GETSHAREDSETREQUEST
DESCRIPTOR.message_types_by_name['MutateSharedSetsRequest'] = _MUTATESHAREDSETSREQUEST
DESCRIPTOR.message_types_by_name['SharedSetOperation'] = _SHAREDSETOPERATION
DESCRIPTOR.message_types_by_name['MutateSharedSetsResponse'] = _MUTATESHAREDSETSRESPONSE
DESCRIPTOR.message_types_by_name['MutateSharedSetResult'] = _MUTATESHAREDSETRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetSharedSetRequest = _reflection.GeneratedProtocolMessageType('GetSharedSetRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETSHAREDSETREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.shared_set_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.GetSharedSetRequest)
  })
_sym_db.RegisterMessage(GetSharedSetRequest)

MutateSharedSetsRequest = _reflection.GeneratedProtocolMessageType('MutateSharedSetsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATESHAREDSETSREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.shared_set_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateSharedSetsRequest)
  })
_sym_db.RegisterMessage(MutateSharedSetsRequest)

SharedSetOperation = _reflection.GeneratedProtocolMessageType('SharedSetOperation', (_message.Message,), {
  'DESCRIPTOR' : _SHAREDSETOPERATION,
  '__module__' : 'google.ads.googleads.v4.services.shared_set_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.SharedSetOperation)
  })
_sym_db.RegisterMessage(SharedSetOperation)

MutateSharedSetsResponse = _reflection.GeneratedProtocolMessageType('MutateSharedSetsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATESHAREDSETSRESPONSE,
  '__module__' : 'google.ads.googleads.v4.services.shared_set_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateSharedSetsResponse)
  })
_sym_db.RegisterMessage(MutateSharedSetsResponse)

MutateSharedSetResult = _reflection.GeneratedProtocolMessageType('MutateSharedSetResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATESHAREDSETRESULT,
  '__module__' : 'google.ads.googleads.v4.services.shared_set_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateSharedSetResult)
  })
_sym_db.RegisterMessage(MutateSharedSetResult)


DESCRIPTOR._options = None
_GETSHAREDSETREQUEST.fields_by_name['resource_name']._options = None
_MUTATESHAREDSETSREQUEST.fields_by_name['customer_id']._options = None
_MUTATESHAREDSETSREQUEST.fields_by_name['operations']._options = None

_SHAREDSETSERVICE = _descriptor.ServiceDescriptor(
  name='SharedSetService',
  full_name='google.ads.googleads.v4.services.SharedSetService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1026,
  serialized_end=1528,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetSharedSet',
    full_name='google.ads.googleads.v4.services.SharedSetService.GetSharedSet',
    index=0,
    containing_service=None,
    input_type=_GETSHAREDSETREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_shared__set__pb2._SHAREDSET,
    serialized_options=b'\202\323\344\223\002.\022,/v4/{resource_name=customers/*/sharedSets/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateSharedSets',
    full_name='google.ads.googleads.v4.services.SharedSetService.MutateSharedSets',
    index=1,
    containing_service=None,
    input_type=_MUTATESHAREDSETSREQUEST,
    output_type=_MUTATESHAREDSETSRESPONSE,
    serialized_options=b'\202\323\344\223\0024\"//v4/customers/{customer_id=*}/sharedSets:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_SHAREDSETSERVICE)

DESCRIPTOR.services_by_name['SharedSetService'] = _SHAREDSETSERVICE

# @@protoc_insertion_point(module_scope)
