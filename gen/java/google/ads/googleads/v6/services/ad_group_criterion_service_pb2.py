# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/services/ad_group_criterion_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_common_dot_policy__pb2
from google.ads.googleads.v6.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v6.resources import ad_group_criterion_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__criterion__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/services/ad_group_criterion_service.proto',
  package='google.ads.googleads.v6.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v6.servicesB\034AdGroupCriterionServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002$Google::Ads::GoogleAds::V6::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nAgoogle/ads/googleads/v6/services/ad_group_criterion_service.proto\x12 google.ads.googleads.v6.services\x1a+google/ads/googleads/v6/common/policy.proto\x1a\x39google/ads/googleads/v6/enums/response_content_type.proto\x1a:google/ads/googleads/v6/resources/ad_group_criterion.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"f\n\x1aGetAdGroupCriterionRequest\x12H\n\rresource_name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)googleads.googleapis.com/AdGroupCriterion\"\xa9\x02\n\x1cMutateAdGroupCriteriaRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12T\n\noperations\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v6.services.AdGroupCriterionOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v6.enums.ResponseContentTypeEnum.ResponseContentType\"\xd3\x02\n\x19\x41\x64GroupCriterionOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12X\n\x1c\x65xempt_policy_violation_keys\x18\x05 \x03(\x0b\x32\x32.google.ads.googleads.v6.common.PolicyViolationKey\x12\x45\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x33.google.ads.googleads.v6.resources.AdGroupCriterionH\x00\x12\x45\n\x06update\x18\x02 \x01(\x0b\x32\x33.google.ads.googleads.v6.resources.AdGroupCriterionH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xa3\x01\n\x1dMutateAdGroupCriteriaResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12O\n\x07results\x18\x02 \x03(\x0b\x32>.google.ads.googleads.v6.services.MutateAdGroupCriterionResult\"\x86\x01\n\x1cMutateAdGroupCriterionResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12O\n\x12\x61\x64_group_criterion\x18\x02 \x01(\x0b\x32\x33.google.ads.googleads.v6.resources.AdGroupCriterion2\xab\x04\n\x17\x41\x64GroupCriterionService\x12\xd3\x01\n\x13GetAdGroupCriterion\x12<.google.ads.googleads.v6.services.GetAdGroupCriterionRequest\x1a\x33.google.ads.googleads.v6.resources.AdGroupCriterion\"I\x82\xd3\xe4\x93\x02\x33\x12\x31/v6/{resource_name=customers/*/adGroupCriteria/*}\xda\x41\rresource_name\x12\xf2\x01\n\x15MutateAdGroupCriteria\x12>.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest\x1a?.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse\"X\x82\xd3\xe4\x93\x02\x39\"4/v6/customers/{customer_id=*}/adGroupCriteria:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x83\x02\n$com.google.ads.googleads.v6.servicesB\x1c\x41\x64GroupCriterionServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V6.Services\xca\x02 Google\\Ads\\GoogleAds\\V6\\Services\xea\x02$Google::Ads::GoogleAds::V6::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_common_dot_policy__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__criterion__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADGROUPCRITERIONREQUEST = _descriptor.Descriptor(
  name='GetAdGroupCriterionRequest',
  full_name='google.ads.googleads.v6.services.GetAdGroupCriterionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.services.GetAdGroupCriterionRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A+\n)googleads.googleapis.com/AdGroupCriterion', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=441,
  serialized_end=543,
)


_MUTATEADGROUPCRITERIAREQUEST = _descriptor.Descriptor(
  name='MutateAdGroupCriteriaRequest',
  full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.response_content_type', index=4,
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
  serialized_start=546,
  serialized_end=843,
)


_ADGROUPCRITERIONOPERATION = _descriptor.Descriptor(
  name='AdGroupCriterionOperation',
  full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exempt_policy_violation_keys', full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation.exempt_policy_violation_keys', index=1,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation.create', index=2,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation.update', index=3,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation.remove', index=4,
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
      name='operation', full_name='google.ads.googleads.v6.services.AdGroupCriterionOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=846,
  serialized_end=1185,
)


_MUTATEADGROUPCRITERIARESPONSE = _descriptor.Descriptor(
  name='MutateAdGroupCriteriaResponse',
  full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse.results', index=1,
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
  serialized_start=1188,
  serialized_end=1351,
)


_MUTATEADGROUPCRITERIONRESULT = _descriptor.Descriptor(
  name='MutateAdGroupCriterionResult',
  full_name='google.ads.googleads.v6.services.MutateAdGroupCriterionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.services.MutateAdGroupCriterionResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group_criterion', full_name='google.ads.googleads.v6.services.MutateAdGroupCriterionResult.ad_group_criterion', index=1,
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
  serialized_start=1354,
  serialized_end=1488,
)

_MUTATEADGROUPCRITERIAREQUEST.fields_by_name['operations'].message_type = _ADGROUPCRITERIONOPERATION
_MUTATEADGROUPCRITERIAREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_ADGROUPCRITERIONOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ADGROUPCRITERIONOPERATION.fields_by_name['exempt_policy_violation_keys'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_common_dot_policy__pb2._POLICYVIOLATIONKEY
_ADGROUPCRITERIONOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__criterion__pb2._ADGROUPCRITERION
_ADGROUPCRITERIONOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__criterion__pb2._ADGROUPCRITERION
_ADGROUPCRITERIONOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPCRITERIONOPERATION.fields_by_name['create'])
_ADGROUPCRITERIONOPERATION.fields_by_name['create'].containing_oneof = _ADGROUPCRITERIONOPERATION.oneofs_by_name['operation']
_ADGROUPCRITERIONOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPCRITERIONOPERATION.fields_by_name['update'])
_ADGROUPCRITERIONOPERATION.fields_by_name['update'].containing_oneof = _ADGROUPCRITERIONOPERATION.oneofs_by_name['operation']
_ADGROUPCRITERIONOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPCRITERIONOPERATION.fields_by_name['remove'])
_ADGROUPCRITERIONOPERATION.fields_by_name['remove'].containing_oneof = _ADGROUPCRITERIONOPERATION.oneofs_by_name['operation']
_MUTATEADGROUPCRITERIARESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADGROUPCRITERIARESPONSE.fields_by_name['results'].message_type = _MUTATEADGROUPCRITERIONRESULT
_MUTATEADGROUPCRITERIONRESULT.fields_by_name['ad_group_criterion'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__criterion__pb2._ADGROUPCRITERION
DESCRIPTOR.message_types_by_name['GetAdGroupCriterionRequest'] = _GETADGROUPCRITERIONREQUEST
DESCRIPTOR.message_types_by_name['MutateAdGroupCriteriaRequest'] = _MUTATEADGROUPCRITERIAREQUEST
DESCRIPTOR.message_types_by_name['AdGroupCriterionOperation'] = _ADGROUPCRITERIONOPERATION
DESCRIPTOR.message_types_by_name['MutateAdGroupCriteriaResponse'] = _MUTATEADGROUPCRITERIARESPONSE
DESCRIPTOR.message_types_by_name['MutateAdGroupCriterionResult'] = _MUTATEADGROUPCRITERIONRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupCriterionRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupCriterionRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPCRITERIONREQUEST,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.GetAdGroupCriterionRequest)
  })
_sym_db.RegisterMessage(GetAdGroupCriterionRequest)

MutateAdGroupCriteriaRequest = _reflection.GeneratedProtocolMessageType('MutateAdGroupCriteriaRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPCRITERIAREQUEST,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest)
  })
_sym_db.RegisterMessage(MutateAdGroupCriteriaRequest)

AdGroupCriterionOperation = _reflection.GeneratedProtocolMessageType('AdGroupCriterionOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPCRITERIONOPERATION,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.AdGroupCriterionOperation)
  })
_sym_db.RegisterMessage(AdGroupCriterionOperation)

MutateAdGroupCriteriaResponse = _reflection.GeneratedProtocolMessageType('MutateAdGroupCriteriaResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPCRITERIARESPONSE,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse)
  })
_sym_db.RegisterMessage(MutateAdGroupCriteriaResponse)

MutateAdGroupCriterionResult = _reflection.GeneratedProtocolMessageType('MutateAdGroupCriterionResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPCRITERIONRESULT,
  '__module__' : 'google.ads.googleads.v6.services.ad_group_criterion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.MutateAdGroupCriterionResult)
  })
_sym_db.RegisterMessage(MutateAdGroupCriterionResult)


DESCRIPTOR._options = None
_GETADGROUPCRITERIONREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADGROUPCRITERIAREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADGROUPCRITERIAREQUEST.fields_by_name['operations']._options = None

_ADGROUPCRITERIONSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupCriterionService',
  full_name='google.ads.googleads.v6.services.AdGroupCriterionService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1491,
  serialized_end=2046,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupCriterion',
    full_name='google.ads.googleads.v6.services.AdGroupCriterionService.GetAdGroupCriterion',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPCRITERIONREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_ad__group__criterion__pb2._ADGROUPCRITERION,
    serialized_options=b'\202\323\344\223\0023\0221/v6/{resource_name=customers/*/adGroupCriteria/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdGroupCriteria',
    full_name='google.ads.googleads.v6.services.AdGroupCriterionService.MutateAdGroupCriteria',
    index=1,
    containing_service=None,
    input_type=_MUTATEADGROUPCRITERIAREQUEST,
    output_type=_MUTATEADGROUPCRITERIARESPONSE,
    serialized_options=b'\202\323\344\223\0029\"4/v6/customers/{customer_id=*}/adGroupCriteria:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPCRITERIONSERVICE)

DESCRIPTOR.services_by_name['AdGroupCriterionService'] = _ADGROUPCRITERIONSERVICE

# @@protoc_insertion_point(module_scope)
