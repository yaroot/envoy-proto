# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/ad_group_criterion_label_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import ad_group_criterion_label_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__criterion__label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/ad_group_criterion_label_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB!AdGroupCriterionLabelServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nGgoogle/ads/googleads/v3/services/ad_group_criterion_label_service.proto\x12 google.ads.googleads.v3.services\x1a@google/ads/googleads/v3/resources/ad_group_criterion_label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"p\n\x1fGetAdGroupCriterionLabelRequest\x12M\n\rresource_name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.googleads.googleapis.com/AdGroupCriterionLabel\"\xca\x01\n#MutateAdGroupCriterionLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12Y\n\noperations\x18\x02 \x03(\x0b\x32@.google.ads.googleads.v3.services.AdGroupCriterionLabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\x8b\x01\n\x1e\x41\x64GroupCriterionLabelOperation\x12J\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x38.google.ads.googleads.v3.resources.AdGroupCriterionLabelH\x00\x12\x10\n\x06remove\x18\x02 \x01(\tH\x00\x42\x0b\n\toperation\"\xaf\x01\n$MutateAdGroupCriterionLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12T\n\x07results\x18\x02 \x03(\x0b\x32\x43.google.ads.googleads.v3.services.MutateAdGroupCriterionLabelResult\":\n!MutateAdGroupCriterionLabelResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xe2\x04\n\x1c\x41\x64GroupCriterionLabelService\x12\xe9\x01\n\x18GetAdGroupCriterionLabel\x12\x41.google.ads.googleads.v3.services.GetAdGroupCriterionLabelRequest\x1a\x38.google.ads.googleads.v3.resources.AdGroupCriterionLabel\"P\x82\xd3\xe4\x93\x02:\x12\x38/v3/{resource_name=customers/*/adGroupCriterionLabels/*}\xda\x41\rresource_name\x12\x8e\x02\n\x1cMutateAdGroupCriterionLabels\x12\x45.google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest\x1a\x46.google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsResponse\"_\x82\xd3\xe4\x93\x02@\";/v3/customers/{customer_id=*}/adGroupCriterionLabels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x88\x02\n$com.google.ads.googleads.v3.servicesB!AdGroupCriterionLabelServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__criterion__label__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADGROUPCRITERIONLABELREQUEST = _descriptor.Descriptor(
  name='GetAdGroupCriterionLabelRequest',
  full_name='google.ads.googleads.v3.services.GetAdGroupCriterionLabelRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetAdGroupCriterionLabelRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A0\n.googleads.googleapis.com/AdGroupCriterionLabel', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=315,
  serialized_end=427,
)


_MUTATEADGROUPCRITERIONLABELSREQUEST = _descriptor.Descriptor(
  name='MutateAdGroupCriterionLabelsRequest',
  full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest.validate_only', index=3,
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
  serialized_start=430,
  serialized_end=632,
)


_ADGROUPCRITERIONLABELOPERATION = _descriptor.Descriptor(
  name='AdGroupCriterionLabelOperation',
  full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelOperation.create', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelOperation.remove', index=1,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=635,
  serialized_end=774,
)


_MUTATEADGROUPCRITERIONLABELSRESPONSE = _descriptor.Descriptor(
  name='MutateAdGroupCriterionLabelsResponse',
  full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsResponse.results', index=1,
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
  serialized_start=777,
  serialized_end=952,
)


_MUTATEADGROUPCRITERIONLABELRESULT = _descriptor.Descriptor(
  name='MutateAdGroupCriterionLabelResult',
  full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateAdGroupCriterionLabelResult.resource_name', index=0,
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
  serialized_start=954,
  serialized_end=1012,
)

_MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['operations'].message_type = _ADGROUPCRITERIONLABELOPERATION
_ADGROUPCRITERIONLABELOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__criterion__label__pb2._ADGROUPCRITERIONLABEL
_ADGROUPCRITERIONLABELOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPCRITERIONLABELOPERATION.fields_by_name['create'])
_ADGROUPCRITERIONLABELOPERATION.fields_by_name['create'].containing_oneof = _ADGROUPCRITERIONLABELOPERATION.oneofs_by_name['operation']
_ADGROUPCRITERIONLABELOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPCRITERIONLABELOPERATION.fields_by_name['remove'])
_ADGROUPCRITERIONLABELOPERATION.fields_by_name['remove'].containing_oneof = _ADGROUPCRITERIONLABELOPERATION.oneofs_by_name['operation']
_MUTATEADGROUPCRITERIONLABELSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADGROUPCRITERIONLABELSRESPONSE.fields_by_name['results'].message_type = _MUTATEADGROUPCRITERIONLABELRESULT
DESCRIPTOR.message_types_by_name['GetAdGroupCriterionLabelRequest'] = _GETADGROUPCRITERIONLABELREQUEST
DESCRIPTOR.message_types_by_name['MutateAdGroupCriterionLabelsRequest'] = _MUTATEADGROUPCRITERIONLABELSREQUEST
DESCRIPTOR.message_types_by_name['AdGroupCriterionLabelOperation'] = _ADGROUPCRITERIONLABELOPERATION
DESCRIPTOR.message_types_by_name['MutateAdGroupCriterionLabelsResponse'] = _MUTATEADGROUPCRITERIONLABELSRESPONSE
DESCRIPTOR.message_types_by_name['MutateAdGroupCriterionLabelResult'] = _MUTATEADGROUPCRITERIONLABELRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupCriterionLabelRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupCriterionLabelRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPCRITERIONLABELREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_criterion_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetAdGroupCriterionLabelRequest)
  })
_sym_db.RegisterMessage(GetAdGroupCriterionLabelRequest)

MutateAdGroupCriterionLabelsRequest = _reflection.GeneratedProtocolMessageType('MutateAdGroupCriterionLabelsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPCRITERIONLABELSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_criterion_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsRequest)
  })
_sym_db.RegisterMessage(MutateAdGroupCriterionLabelsRequest)

AdGroupCriterionLabelOperation = _reflection.GeneratedProtocolMessageType('AdGroupCriterionLabelOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPCRITERIONLABELOPERATION,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_criterion_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.AdGroupCriterionLabelOperation)
  })
_sym_db.RegisterMessage(AdGroupCriterionLabelOperation)

MutateAdGroupCriterionLabelsResponse = _reflection.GeneratedProtocolMessageType('MutateAdGroupCriterionLabelsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPCRITERIONLABELSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_criterion_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdGroupCriterionLabelsResponse)
  })
_sym_db.RegisterMessage(MutateAdGroupCriterionLabelsResponse)

MutateAdGroupCriterionLabelResult = _reflection.GeneratedProtocolMessageType('MutateAdGroupCriterionLabelResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPCRITERIONLABELRESULT,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_criterion_label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdGroupCriterionLabelResult)
  })
_sym_db.RegisterMessage(MutateAdGroupCriterionLabelResult)


DESCRIPTOR._options = None
_GETADGROUPCRITERIONLABELREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['operations']._options = None

_ADGROUPCRITERIONLABELSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupCriterionLabelService',
  full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1015,
  serialized_end=1625,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupCriterionLabel',
    full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelService.GetAdGroupCriterionLabel',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPCRITERIONLABELREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__criterion__label__pb2._ADGROUPCRITERIONLABEL,
    serialized_options=b'\202\323\344\223\002:\0228/v3/{resource_name=customers/*/adGroupCriterionLabels/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdGroupCriterionLabels',
    full_name='google.ads.googleads.v3.services.AdGroupCriterionLabelService.MutateAdGroupCriterionLabels',
    index=1,
    containing_service=None,
    input_type=_MUTATEADGROUPCRITERIONLABELSREQUEST,
    output_type=_MUTATEADGROUPCRITERIONLABELSRESPONSE,
    serialized_options=b'\202\323\344\223\002@\";/v3/customers/{customer_id=*}/adGroupCriterionLabels:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPCRITERIONLABELSERVICE)

DESCRIPTOR.services_by_name['AdGroupCriterionLabelService'] = _ADGROUPCRITERIONLABELSERVICE

# @@protoc_insertion_point(module_scope)
