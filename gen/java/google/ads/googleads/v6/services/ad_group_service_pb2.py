# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/services/ad_group_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v6.resources import ad_group_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/services/ad_group_service.proto',
  package='google.ads.googleads.v6.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v6.servicesB\023AdGroupServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002$Google::Ads::GoogleAds::V6::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/ads/googleads/v6/services/ad_group_service.proto\x12 google.ads.googleads.v6.services\x1a\x39google/ads/googleads/v6/enums/response_content_type.proto\x1a\x30google/ads/googleads/v6/resources/ad_group.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"T\n\x11GetAdGroupRequest\x12?\n\rresource_name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n googleads.googleapis.com/AdGroup\"\x99\x02\n\x15MutateAdGroupsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12K\n\noperations\x18\x02 \x03(\x0b\x32\x32.google.ads.googleads.v6.services.AdGroupOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v6.enums.ResponseContentTypeEnum.ResponseContentType\"\xde\x01\n\x10\x41\x64GroupOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12<\n\x06\x63reate\x18\x01 \x01(\x0b\x32*.google.ads.googleads.v6.resources.AdGroupH\x00\x12<\n\x06update\x18\x02 \x01(\x0b\x32*.google.ads.googleads.v6.resources.AdGroupH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x93\x01\n\x16MutateAdGroupsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12\x46\n\x07results\x18\x02 \x03(\x0b\x32\x35.google.ads.googleads.v6.services.MutateAdGroupResult\"j\n\x13MutateAdGroupResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12<\n\x08\x61\x64_group\x18\x02 \x01(\x0b\x32*.google.ads.googleads.v6.resources.AdGroup2\xe4\x03\n\x0e\x41\x64GroupService\x12\xb1\x01\n\nGetAdGroup\x12\x33.google.ads.googleads.v6.services.GetAdGroupRequest\x1a*.google.ads.googleads.v6.resources.AdGroup\"B\x82\xd3\xe4\x93\x02,\x12*/v6/{resource_name=customers/*/adGroups/*}\xda\x41\rresource_name\x12\xd6\x01\n\x0eMutateAdGroups\x12\x37.google.ads.googleads.v6.services.MutateAdGroupsRequest\x1a\x38.google.ads.googleads.v6.services.MutateAdGroupsResponse\"Q\x82\xd3\xe4\x93\x02\x32\"-/v6/customers/{customer_id=*}/adGroups:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfa\x01\n$com.google.ads.googleads.v6.servicesB\x13\x41\x64GroupServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V6.Services\xca\x02 Google\\Ads\\GoogleAds\\V6\\Services\xea\x02$Google::Ads::GoogleAds::V6::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADGROUPREQUEST = _descriptor.Descriptor(
  name='GetAdGroupRequest',
  full_name='google.ads.googleads.v6.services.GetAdGroupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.services.GetAdGroupRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\"\n googleads.googleapis.com/AdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=376,
  serialized_end=460,
)


_MUTATEADGROUPSREQUEST = _descriptor.Descriptor(
  name='MutateAdGroupsRequest',
  full_name='google.ads.googleads.v6.services.MutateAdGroupsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v6.services.MutateAdGroupsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v6.services.MutateAdGroupsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v6.services.MutateAdGroupsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v6.services.MutateAdGroupsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v6.services.MutateAdGroupsRequest.response_content_type', index=4,
      number=5, type=14, cpp_type=8, label=1,
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
  serialized_start=463,
  serialized_end=744,
)


_ADGROUPOPERATION = _descriptor.Descriptor(
  name='AdGroupOperation',
  full_name='google.ads.googleads.v6.services.AdGroupOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v6.services.AdGroupOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v6.services.AdGroupOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v6.services.AdGroupOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v6.services.AdGroupOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v6.services.AdGroupOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=747,
  serialized_end=969,
)


_MUTATEADGROUPSRESPONSE = _descriptor.Descriptor(
  name='MutateAdGroupsResponse',
  full_name='google.ads.googleads.v6.services.MutateAdGroupsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v6.services.MutateAdGroupsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v6.services.MutateAdGroupsResponse.results', index=1,
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
  serialized_start=972,
  serialized_end=1119,
)


_MUTATEADGROUPRESULT = _descriptor.Descriptor(
  name='MutateAdGroupResult',
  full_name='google.ads.googleads.v6.services.MutateAdGroupResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.services.MutateAdGroupResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group', full_name='google.ads.googleads.v6.services.MutateAdGroupResult.ad_group', index=1,
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
  serialized_start=1121,
  serialized_end=1227,
)

_MUTATEADGROUPSREQUEST.fields_by_name['operations'].message_type = _ADGROUPOPERATION
_MUTATEADGROUPSREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_ADGROUPOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ADGROUPOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__pb2._ADGROUP
_ADGROUPOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__pb2._ADGROUP
_ADGROUPOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPOPERATION.fields_by_name['create'])
_ADGROUPOPERATION.fields_by_name['create'].containing_oneof = _ADGROUPOPERATION.oneofs_by_name['operation']
_ADGROUPOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPOPERATION.fields_by_name['update'])
_ADGROUPOPERATION.fields_by_name['update'].containing_oneof = _ADGROUPOPERATION.oneofs_by_name['operation']
_ADGROUPOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPOPERATION.fields_by_name['remove'])
_ADGROUPOPERATION.fields_by_name['remove'].containing_oneof = _ADGROUPOPERATION.oneofs_by_name['operation']
_MUTATEADGROUPSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADGROUPSRESPONSE.fields_by_name['results'].message_type = _MUTATEADGROUPRESULT
_MUTATEADGROUPRESULT.fields_by_name['ad_group'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__pb2._ADGROUP
DESCRIPTOR.message_types_by_name['GetAdGroupRequest'] = _GETADGROUPREQUEST
DESCRIPTOR.message_types_by_name['MutateAdGroupsRequest'] = _MUTATEADGROUPSREQUEST
DESCRIPTOR.message_types_by_name['AdGroupOperation'] = _ADGROUPOPERATION
DESCRIPTOR.message_types_by_name['MutateAdGroupsResponse'] = _MUTATEADGROUPSRESPONSE
DESCRIPTOR.message_types_by_name['MutateAdGroupResult'] = _MUTATEADGROUPRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPREQUEST,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.GetAdGroupRequest)
  })
_sym_db.RegisterMessage(GetAdGroupRequest)

MutateAdGroupsRequest = _reflection.GeneratedProtocolMessageType('MutateAdGroupsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPSREQUEST,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.MutateAdGroupsRequest)
  })
_sym_db.RegisterMessage(MutateAdGroupsRequest)

AdGroupOperation = _reflection.GeneratedProtocolMessageType('AdGroupOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPOPERATION,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.AdGroupOperation)
  })
_sym_db.RegisterMessage(AdGroupOperation)

MutateAdGroupsResponse = _reflection.GeneratedProtocolMessageType('MutateAdGroupsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPSRESPONSE,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.MutateAdGroupsResponse)
  })
_sym_db.RegisterMessage(MutateAdGroupsResponse)

MutateAdGroupResult = _reflection.GeneratedProtocolMessageType('MutateAdGroupResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPRESULT,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.MutateAdGroupResult)
  })
_sym_db.RegisterMessage(MutateAdGroupResult)


DESCRIPTOR._options = None
_GETADGROUPREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADGROUPSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADGROUPSREQUEST.fields_by_name['operations']._options = None

_ADGROUPSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupService',
  full_name='google.ads.googleads.v6.services.AdGroupService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1230,
  serialized_end=1714,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroup',
    full_name='google.ads.googleads.v6.services.AdGroupService.GetAdGroup',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__pb2._ADGROUP,
    serialized_options=b'\202\323\344\223\002,\022*/v6/{resource_name=customers/*/adGroups/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdGroups',
    full_name='google.ads.googleads.v6.services.AdGroupService.MutateAdGroups',
    index=1,
    containing_service=None,
    input_type=_MUTATEADGROUPSREQUEST,
    output_type=_MUTATEADGROUPSRESPONSE,
    serialized_options=b'\202\323\344\223\0022\"-/v6/customers/{customer_id=*}/adGroups:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPSERVICE)

DESCRIPTOR.services_by_name['AdGroupService'] = _ADGROUPSERVICE

# @@protoc_insertion_point(module_scope)
