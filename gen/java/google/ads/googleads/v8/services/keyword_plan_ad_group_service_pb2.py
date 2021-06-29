# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/keyword_plan_ad_group_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.resources import keyword_plan_ad_group_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_keyword__plan__ad__group__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/keyword_plan_ad_group_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB\036KeywordPlanAdGroupServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDgoogle/ads/googleads/v8/services/keyword_plan_ad_group_service.proto\x12 google.ads.googleads.v8.services\x1a=google/ads/googleads/v8/resources/keyword_plan_ad_group.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"j\n\x1cGetKeywordPlanAdGroupRequest\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/KeywordPlanAdGroup\"\xc4\x01\n MutateKeywordPlanAdGroupsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\noperations\x18\x02 \x03(\x0b\x32=.google.ads.googleads.v8.services.KeywordPlanAdGroupOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xb1\x02\n\x1bKeywordPlanAdGroupOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12G\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x35.google.ads.googleads.v8.resources.KeywordPlanAdGroupH\x00\x12G\n\x06update\x18\x02 \x01(\x0b\x32\x35.google.ads.googleads.v8.resources.KeywordPlanAdGroupH\x00\x12\x42\n\x06remove\x18\x03 \x01(\tB0\xfa\x41-\n+googleads.googleapis.com/KeywordPlanAdGroupH\x00\x42\x0b\n\toperation\"\xa9\x01\n!MutateKeywordPlanAdGroupsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Q\n\x07results\x18\x02 \x03(\x0b\x32@.google.ads.googleads.v8.services.MutateKeywordPlanAdGroupResult\"7\n\x1eMutateKeywordPlanAdGroupResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xc7\x04\n\x19KeywordPlanAdGroupService\x12\xdd\x01\n\x15GetKeywordPlanAdGroup\x12>.google.ads.googleads.v8.services.GetKeywordPlanAdGroupRequest\x1a\x35.google.ads.googleads.v8.resources.KeywordPlanAdGroup\"M\x82\xd3\xe4\x93\x02\x37\x12\x35/v8/{resource_name=customers/*/keywordPlanAdGroups/*}\xda\x41\rresource_name\x12\x82\x02\n\x19MutateKeywordPlanAdGroups\x12\x42.google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest\x1a\x43.google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsResponse\"\\\x82\xd3\xe4\x93\x02=\"8/v8/customers/{customer_id=*}/keywordPlanAdGroups:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x85\x02\n$com.google.ads.googleads.v8.servicesB\x1eKeywordPlanAdGroupServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_keyword__plan__ad__group__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETKEYWORDPLANADGROUPREQUEST = _descriptor.Descriptor(
  name='GetKeywordPlanAdGroupRequest',
  full_name='google.ads.googleads.v8.services.GetKeywordPlanAdGroupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetKeywordPlanAdGroupRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A-\n+googleads.googleapis.com/KeywordPlanAdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=343,
  serialized_end=449,
)


_MUTATEKEYWORDPLANADGROUPSREQUEST = _descriptor.Descriptor(
  name='MutateKeywordPlanAdGroupsRequest',
  full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest.validate_only', index=3,
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
  serialized_start=452,
  serialized_end=648,
)


_KEYWORDPLANADGROUPOPERATION = _descriptor.Descriptor(
  name='KeywordPlanAdGroupOperation',
  full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupOperation.remove', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A-\n+googleads.googleapis.com/KeywordPlanAdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='operation', full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=651,
  serialized_end=956,
)


_MUTATEKEYWORDPLANADGROUPSRESPONSE = _descriptor.Descriptor(
  name='MutateKeywordPlanAdGroupsResponse',
  full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsResponse.results', index=1,
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
  serialized_start=959,
  serialized_end=1128,
)


_MUTATEKEYWORDPLANADGROUPRESULT = _descriptor.Descriptor(
  name='MutateKeywordPlanAdGroupResult',
  full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.MutateKeywordPlanAdGroupResult.resource_name', index=0,
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
  serialized_start=1130,
  serialized_end=1185,
)

_MUTATEKEYWORDPLANADGROUPSREQUEST.fields_by_name['operations'].message_type = _KEYWORDPLANADGROUPOPERATION
_KEYWORDPLANADGROUPOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_KEYWORDPLANADGROUPOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_keyword__plan__ad__group__pb2._KEYWORDPLANADGROUP
_KEYWORDPLANADGROUPOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_keyword__plan__ad__group__pb2._KEYWORDPLANADGROUP
_KEYWORDPLANADGROUPOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANADGROUPOPERATION.fields_by_name['create'])
_KEYWORDPLANADGROUPOPERATION.fields_by_name['create'].containing_oneof = _KEYWORDPLANADGROUPOPERATION.oneofs_by_name['operation']
_KEYWORDPLANADGROUPOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANADGROUPOPERATION.fields_by_name['update'])
_KEYWORDPLANADGROUPOPERATION.fields_by_name['update'].containing_oneof = _KEYWORDPLANADGROUPOPERATION.oneofs_by_name['operation']
_KEYWORDPLANADGROUPOPERATION.oneofs_by_name['operation'].fields.append(
  _KEYWORDPLANADGROUPOPERATION.fields_by_name['remove'])
_KEYWORDPLANADGROUPOPERATION.fields_by_name['remove'].containing_oneof = _KEYWORDPLANADGROUPOPERATION.oneofs_by_name['operation']
_MUTATEKEYWORDPLANADGROUPSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEKEYWORDPLANADGROUPSRESPONSE.fields_by_name['results'].message_type = _MUTATEKEYWORDPLANADGROUPRESULT
DESCRIPTOR.message_types_by_name['GetKeywordPlanAdGroupRequest'] = _GETKEYWORDPLANADGROUPREQUEST
DESCRIPTOR.message_types_by_name['MutateKeywordPlanAdGroupsRequest'] = _MUTATEKEYWORDPLANADGROUPSREQUEST
DESCRIPTOR.message_types_by_name['KeywordPlanAdGroupOperation'] = _KEYWORDPLANADGROUPOPERATION
DESCRIPTOR.message_types_by_name['MutateKeywordPlanAdGroupsResponse'] = _MUTATEKEYWORDPLANADGROUPSRESPONSE
DESCRIPTOR.message_types_by_name['MutateKeywordPlanAdGroupResult'] = _MUTATEKEYWORDPLANADGROUPRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetKeywordPlanAdGroupRequest = _reflection.GeneratedProtocolMessageType('GetKeywordPlanAdGroupRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETKEYWORDPLANADGROUPREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetKeywordPlanAdGroupRequest)
  })
_sym_db.RegisterMessage(GetKeywordPlanAdGroupRequest)

MutateKeywordPlanAdGroupsRequest = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanAdGroupsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANADGROUPSREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsRequest)
  })
_sym_db.RegisterMessage(MutateKeywordPlanAdGroupsRequest)

KeywordPlanAdGroupOperation = _reflection.GeneratedProtocolMessageType('KeywordPlanAdGroupOperation', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANADGROUPOPERATION,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.KeywordPlanAdGroupOperation)
  })
_sym_db.RegisterMessage(KeywordPlanAdGroupOperation)

MutateKeywordPlanAdGroupsResponse = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanAdGroupsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANADGROUPSRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateKeywordPlanAdGroupsResponse)
  })
_sym_db.RegisterMessage(MutateKeywordPlanAdGroupsResponse)

MutateKeywordPlanAdGroupResult = _reflection.GeneratedProtocolMessageType('MutateKeywordPlanAdGroupResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEKEYWORDPLANADGROUPRESULT,
  '__module__' : 'google.ads.googleads.v8.services.keyword_plan_ad_group_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateKeywordPlanAdGroupResult)
  })
_sym_db.RegisterMessage(MutateKeywordPlanAdGroupResult)


DESCRIPTOR._options = None
_GETKEYWORDPLANADGROUPREQUEST.fields_by_name['resource_name']._options = None
_MUTATEKEYWORDPLANADGROUPSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEKEYWORDPLANADGROUPSREQUEST.fields_by_name['operations']._options = None
_KEYWORDPLANADGROUPOPERATION.fields_by_name['remove']._options = None

_KEYWORDPLANADGROUPSERVICE = _descriptor.ServiceDescriptor(
  name='KeywordPlanAdGroupService',
  full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1188,
  serialized_end=1771,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetKeywordPlanAdGroup',
    full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupService.GetKeywordPlanAdGroup',
    index=0,
    containing_service=None,
    input_type=_GETKEYWORDPLANADGROUPREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_keyword__plan__ad__group__pb2._KEYWORDPLANADGROUP,
    serialized_options=b'\202\323\344\223\0027\0225/v8/{resource_name=customers/*/keywordPlanAdGroups/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateKeywordPlanAdGroups',
    full_name='google.ads.googleads.v8.services.KeywordPlanAdGroupService.MutateKeywordPlanAdGroups',
    index=1,
    containing_service=None,
    input_type=_MUTATEKEYWORDPLANADGROUPSREQUEST,
    output_type=_MUTATEKEYWORDPLANADGROUPSRESPONSE,
    serialized_options=b'\202\323\344\223\002=\"8/v8/customers/{customer_id=*}/keywordPlanAdGroups:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_KEYWORDPLANADGROUPSERVICE)

DESCRIPTOR.services_by_name['KeywordPlanAdGroupService'] = _KEYWORDPLANADGROUPSERVICE

# @@protoc_insertion_point(module_scope)
