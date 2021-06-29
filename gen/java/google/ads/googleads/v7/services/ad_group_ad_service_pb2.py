# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/ad_group_ad_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_common_dot_policy__pb2
from google.ads.googleads.v7.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v7.resources import ad_group_ad_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__ad__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/ad_group_ad_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB\025AdGroupAdServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v7/services/ad_group_ad_service.proto\x12 google.ads.googleads.v7.services\x1a+google/ads/googleads/v7/common/policy.proto\x1a\x39google/ads/googleads/v7/enums/response_content_type.proto\x1a\x33google/ads/googleads/v7/resources/ad_group_ad.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"X\n\x13GetAdGroupAdRequest\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"googleads.googleapis.com/AdGroupAd\"\x9d\x02\n\x17MutateAdGroupAdsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12M\n\noperations\x18\x02 \x03(\x0b\x32\x34.google.ads.googleads.v7.services.AdGroupAdOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v7.enums.ResponseContentTypeEnum.ResponseContentType\"\xc4\x02\n\x12\x41\x64GroupAdOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12^\n\x1bpolicy_validation_parameter\x18\x05 \x01(\x0b\x32\x39.google.ads.googleads.v7.common.PolicyValidationParameter\x12>\n\x06\x63reate\x18\x01 \x01(\x0b\x32,.google.ads.googleads.v7.resources.AdGroupAdH\x00\x12>\n\x06update\x18\x02 \x01(\x0b\x32,.google.ads.googleads.v7.resources.AdGroupAdH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x97\x01\n\x18MutateAdGroupAdsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12H\n\x07results\x18\x02 \x03(\x0b\x32\x37.google.ads.googleads.v7.services.MutateAdGroupAdResult\"q\n\x15MutateAdGroupAdResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12\x41\n\x0b\x61\x64_group_ad\x18\x02 \x01(\x0b\x32,.google.ads.googleads.v7.resources.AdGroupAd2\xf6\x03\n\x10\x41\x64GroupAdService\x12\xb9\x01\n\x0cGetAdGroupAd\x12\x35.google.ads.googleads.v7.services.GetAdGroupAdRequest\x1a,.google.ads.googleads.v7.resources.AdGroupAd\"D\x82\xd3\xe4\x93\x02.\x12,/v7/{resource_name=customers/*/adGroupAds/*}\xda\x41\rresource_name\x12\xde\x01\n\x10MutateAdGroupAds\x12\x39.google.ads.googleads.v7.services.MutateAdGroupAdsRequest\x1a:.google.ads.googleads.v7.services.MutateAdGroupAdsResponse\"S\x82\xd3\xe4\x93\x02\x34\"//v7/customers/{customer_id=*}/adGroupAds:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfc\x01\n$com.google.ads.googleads.v7.servicesB\x15\x41\x64GroupAdServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_common_dot_policy__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__ad__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADGROUPADREQUEST = _descriptor.Descriptor(
  name='GetAdGroupAdRequest',
  full_name='google.ads.googleads.v7.services.GetAdGroupAdRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetAdGroupAdRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A$\n\"googleads.googleapis.com/AdGroupAd', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=427,
  serialized_end=515,
)


_MUTATEADGROUPADSREQUEST = _descriptor.Descriptor(
  name='MutateAdGroupAdsRequest',
  full_name='google.ads.googleads.v7.services.MutateAdGroupAdsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsRequest.response_content_type', index=4,
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
  serialized_start=518,
  serialized_end=803,
)


_ADGROUPADOPERATION = _descriptor.Descriptor(
  name='AdGroupAdOperation',
  full_name='google.ads.googleads.v7.services.AdGroupAdOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v7.services.AdGroupAdOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policy_validation_parameter', full_name='google.ads.googleads.v7.services.AdGroupAdOperation.policy_validation_parameter', index=1,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v7.services.AdGroupAdOperation.create', index=2,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v7.services.AdGroupAdOperation.update', index=3,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v7.services.AdGroupAdOperation.remove', index=4,
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
      name='operation', full_name='google.ads.googleads.v7.services.AdGroupAdOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=806,
  serialized_end=1130,
)


_MUTATEADGROUPADSRESPONSE = _descriptor.Descriptor(
  name='MutateAdGroupAdsResponse',
  full_name='google.ads.googleads.v7.services.MutateAdGroupAdsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v7.services.MutateAdGroupAdsResponse.results', index=1,
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
  serialized_start=1133,
  serialized_end=1284,
)


_MUTATEADGROUPADRESULT = _descriptor.Descriptor(
  name='MutateAdGroupAdResult',
  full_name='google.ads.googleads.v7.services.MutateAdGroupAdResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.MutateAdGroupAdResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group_ad', full_name='google.ads.googleads.v7.services.MutateAdGroupAdResult.ad_group_ad', index=1,
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
  serialized_start=1286,
  serialized_end=1399,
)

_MUTATEADGROUPADSREQUEST.fields_by_name['operations'].message_type = _ADGROUPADOPERATION
_MUTATEADGROUPADSREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_ADGROUPADOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ADGROUPADOPERATION.fields_by_name['policy_validation_parameter'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_policy__pb2._POLICYVALIDATIONPARAMETER
_ADGROUPADOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__ad__pb2._ADGROUPAD
_ADGROUPADOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__ad__pb2._ADGROUPAD
_ADGROUPADOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPADOPERATION.fields_by_name['create'])
_ADGROUPADOPERATION.fields_by_name['create'].containing_oneof = _ADGROUPADOPERATION.oneofs_by_name['operation']
_ADGROUPADOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPADOPERATION.fields_by_name['update'])
_ADGROUPADOPERATION.fields_by_name['update'].containing_oneof = _ADGROUPADOPERATION.oneofs_by_name['operation']
_ADGROUPADOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPADOPERATION.fields_by_name['remove'])
_ADGROUPADOPERATION.fields_by_name['remove'].containing_oneof = _ADGROUPADOPERATION.oneofs_by_name['operation']
_MUTATEADGROUPADSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADGROUPADSRESPONSE.fields_by_name['results'].message_type = _MUTATEADGROUPADRESULT
_MUTATEADGROUPADRESULT.fields_by_name['ad_group_ad'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__ad__pb2._ADGROUPAD
DESCRIPTOR.message_types_by_name['GetAdGroupAdRequest'] = _GETADGROUPADREQUEST
DESCRIPTOR.message_types_by_name['MutateAdGroupAdsRequest'] = _MUTATEADGROUPADSREQUEST
DESCRIPTOR.message_types_by_name['AdGroupAdOperation'] = _ADGROUPADOPERATION
DESCRIPTOR.message_types_by_name['MutateAdGroupAdsResponse'] = _MUTATEADGROUPADSRESPONSE
DESCRIPTOR.message_types_by_name['MutateAdGroupAdResult'] = _MUTATEADGROUPADRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupAdRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupAdRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPADREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_ad_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetAdGroupAdRequest)
  })
_sym_db.RegisterMessage(GetAdGroupAdRequest)

MutateAdGroupAdsRequest = _reflection.GeneratedProtocolMessageType('MutateAdGroupAdsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPADSREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_ad_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateAdGroupAdsRequest)
  })
_sym_db.RegisterMessage(MutateAdGroupAdsRequest)

AdGroupAdOperation = _reflection.GeneratedProtocolMessageType('AdGroupAdOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPADOPERATION,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_ad_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.AdGroupAdOperation)
  })
_sym_db.RegisterMessage(AdGroupAdOperation)

MutateAdGroupAdsResponse = _reflection.GeneratedProtocolMessageType('MutateAdGroupAdsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPADSRESPONSE,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_ad_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateAdGroupAdsResponse)
  })
_sym_db.RegisterMessage(MutateAdGroupAdsResponse)

MutateAdGroupAdResult = _reflection.GeneratedProtocolMessageType('MutateAdGroupAdResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPADRESULT,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_ad_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.MutateAdGroupAdResult)
  })
_sym_db.RegisterMessage(MutateAdGroupAdResult)


DESCRIPTOR._options = None
_GETADGROUPADREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADGROUPADSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADGROUPADSREQUEST.fields_by_name['operations']._options = None

_ADGROUPADSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupAdService',
  full_name='google.ads.googleads.v7.services.AdGroupAdService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1402,
  serialized_end=1904,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupAd',
    full_name='google.ads.googleads.v7.services.AdGroupAdService.GetAdGroupAd',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPADREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__ad__pb2._ADGROUPAD,
    serialized_options=b'\202\323\344\223\002.\022,/v7/{resource_name=customers/*/adGroupAds/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdGroupAds',
    full_name='google.ads.googleads.v7.services.AdGroupAdService.MutateAdGroupAds',
    index=1,
    containing_service=None,
    input_type=_MUTATEADGROUPADSREQUEST,
    output_type=_MUTATEADGROUPADSRESPONSE,
    serialized_options=b'\202\323\344\223\0024\"//v7/customers/{customer_id=*}/adGroupAds:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPADSERVICE)

DESCRIPTOR.services_by_name['AdGroupAdService'] = _ADGROUPADSERVICE

# @@protoc_insertion_point(module_scope)
