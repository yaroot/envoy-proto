# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/smart_campaign_setting_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v8.resources import smart_campaign_setting_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_smart__campaign__setting__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/smart_campaign_setting_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB SmartCampaignSettingServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v8/services/smart_campaign_setting_service.proto\x12 google.ads.googleads.v8.services\x1a\x39google/ads/googleads/v8/enums/response_content_type.proto\x1a>google/ads/googleads/v8/resources/smart_campaign_setting.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"n\n\x1eGetSmartCampaignSettingRequest\x12L\n\rresource_name\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\n-googleads.googleapis.com/SmartCampaignSetting\"\xb3\x02\n\"MutateSmartCampaignSettingsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\noperations\x18\x02 \x03(\x0b\x32?.google.ads.googleads.v8.services.SmartCampaignSettingOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v8.enums.ResponseContentTypeEnum.ResponseContentType\"\x99\x01\n\x1dSmartCampaignSettingOperation\x12G\n\x06update\x18\x01 \x01(\x0b\x32\x37.google.ads.googleads.v8.resources.SmartCampaignSetting\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xad\x01\n#MutateSmartCampaignSettingsResponse\x12\x31\n\x15partial_failure_error\x18\x01 \x01(\x0b\x32\x12.google.rpc.Status\x12S\n\x07results\x18\x02 \x03(\x0b\x32\x42.google.ads.googleads.v8.services.MutateSmartCampaignSettingResult\"\x92\x01\n MutateSmartCampaignSettingResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12W\n\x16smart_campaign_setting\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v8.resources.SmartCampaignSetting2\xd9\x04\n\x1bSmartCampaignSettingService\x12\xe5\x01\n\x17GetSmartCampaignSetting\x12@.google.ads.googleads.v8.services.GetSmartCampaignSettingRequest\x1a\x37.google.ads.googleads.v8.resources.SmartCampaignSetting\"O\x82\xd3\xe4\x93\x02\x39\x12\x37/v8/{resource_name=customers/*/smartCampaignSettings/*}\xda\x41\rresource_name\x12\x8a\x02\n\x1bMutateSmartCampaignSettings\x12\x44.google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest\x1a\x45.google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse\"^\x82\xd3\xe4\x93\x02?\":/v8/customers/{customer_id=*}/smartCampaignSettings:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x87\x02\n$com.google.ads.googleads.v8.servicesB SmartCampaignSettingServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_smart__campaign__setting__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETSMARTCAMPAIGNSETTINGREQUEST = _descriptor.Descriptor(
  name='GetSmartCampaignSettingRequest',
  full_name='google.ads.googleads.v8.services.GetSmartCampaignSettingRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetSmartCampaignSettingRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A/\n-googleads.googleapis.com/SmartCampaignSetting', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=404,
  serialized_end=514,
)


_MUTATESMARTCAMPAIGNSETTINGSREQUEST = _descriptor.Descriptor(
  name='MutateSmartCampaignSettingsRequest',
  full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest.response_content_type', index=4,
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
  serialized_start=517,
  serialized_end=824,
)


_SMARTCAMPAIGNSETTINGOPERATION = _descriptor.Descriptor(
  name='SmartCampaignSettingOperation',
  full_name='google.ads.googleads.v8.services.SmartCampaignSettingOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v8.services.SmartCampaignSettingOperation.update', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v8.services.SmartCampaignSettingOperation.update_mask', index=1,
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
  serialized_start=827,
  serialized_end=980,
)


_MUTATESMARTCAMPAIGNSETTINGSRESPONSE = _descriptor.Descriptor(
  name='MutateSmartCampaignSettingsResponse',
  full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse.partial_failure_error', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse.results', index=1,
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
  serialized_start=983,
  serialized_end=1156,
)


_MUTATESMARTCAMPAIGNSETTINGRESULT = _descriptor.Descriptor(
  name='MutateSmartCampaignSettingResult',
  full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='smart_campaign_setting', full_name='google.ads.googleads.v8.services.MutateSmartCampaignSettingResult.smart_campaign_setting', index=1,
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
  serialized_start=1159,
  serialized_end=1305,
)

_MUTATESMARTCAMPAIGNSETTINGSREQUEST.fields_by_name['operations'].message_type = _SMARTCAMPAIGNSETTINGOPERATION
_MUTATESMARTCAMPAIGNSETTINGSREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_SMARTCAMPAIGNSETTINGOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_smart__campaign__setting__pb2._SMARTCAMPAIGNSETTING
_SMARTCAMPAIGNSETTINGOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_MUTATESMARTCAMPAIGNSETTINGSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATESMARTCAMPAIGNSETTINGSRESPONSE.fields_by_name['results'].message_type = _MUTATESMARTCAMPAIGNSETTINGRESULT
_MUTATESMARTCAMPAIGNSETTINGRESULT.fields_by_name['smart_campaign_setting'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_smart__campaign__setting__pb2._SMARTCAMPAIGNSETTING
DESCRIPTOR.message_types_by_name['GetSmartCampaignSettingRequest'] = _GETSMARTCAMPAIGNSETTINGREQUEST
DESCRIPTOR.message_types_by_name['MutateSmartCampaignSettingsRequest'] = _MUTATESMARTCAMPAIGNSETTINGSREQUEST
DESCRIPTOR.message_types_by_name['SmartCampaignSettingOperation'] = _SMARTCAMPAIGNSETTINGOPERATION
DESCRIPTOR.message_types_by_name['MutateSmartCampaignSettingsResponse'] = _MUTATESMARTCAMPAIGNSETTINGSRESPONSE
DESCRIPTOR.message_types_by_name['MutateSmartCampaignSettingResult'] = _MUTATESMARTCAMPAIGNSETTINGRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetSmartCampaignSettingRequest = _reflection.GeneratedProtocolMessageType('GetSmartCampaignSettingRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETSMARTCAMPAIGNSETTINGREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.smart_campaign_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetSmartCampaignSettingRequest)
  })
_sym_db.RegisterMessage(GetSmartCampaignSettingRequest)

MutateSmartCampaignSettingsRequest = _reflection.GeneratedProtocolMessageType('MutateSmartCampaignSettingsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATESMARTCAMPAIGNSETTINGSREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.smart_campaign_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateSmartCampaignSettingsRequest)
  })
_sym_db.RegisterMessage(MutateSmartCampaignSettingsRequest)

SmartCampaignSettingOperation = _reflection.GeneratedProtocolMessageType('SmartCampaignSettingOperation', (_message.Message,), {
  'DESCRIPTOR' : _SMARTCAMPAIGNSETTINGOPERATION,
  '__module__' : 'google.ads.googleads.v8.services.smart_campaign_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.SmartCampaignSettingOperation)
  })
_sym_db.RegisterMessage(SmartCampaignSettingOperation)

MutateSmartCampaignSettingsResponse = _reflection.GeneratedProtocolMessageType('MutateSmartCampaignSettingsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATESMARTCAMPAIGNSETTINGSRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.smart_campaign_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateSmartCampaignSettingsResponse)
  })
_sym_db.RegisterMessage(MutateSmartCampaignSettingsResponse)

MutateSmartCampaignSettingResult = _reflection.GeneratedProtocolMessageType('MutateSmartCampaignSettingResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATESMARTCAMPAIGNSETTINGRESULT,
  '__module__' : 'google.ads.googleads.v8.services.smart_campaign_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateSmartCampaignSettingResult)
  })
_sym_db.RegisterMessage(MutateSmartCampaignSettingResult)


DESCRIPTOR._options = None
_GETSMARTCAMPAIGNSETTINGREQUEST.fields_by_name['resource_name']._options = None
_MUTATESMARTCAMPAIGNSETTINGSREQUEST.fields_by_name['customer_id']._options = None
_MUTATESMARTCAMPAIGNSETTINGSREQUEST.fields_by_name['operations']._options = None

_SMARTCAMPAIGNSETTINGSERVICE = _descriptor.ServiceDescriptor(
  name='SmartCampaignSettingService',
  full_name='google.ads.googleads.v8.services.SmartCampaignSettingService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1308,
  serialized_end=1909,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetSmartCampaignSetting',
    full_name='google.ads.googleads.v8.services.SmartCampaignSettingService.GetSmartCampaignSetting',
    index=0,
    containing_service=None,
    input_type=_GETSMARTCAMPAIGNSETTINGREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_smart__campaign__setting__pb2._SMARTCAMPAIGNSETTING,
    serialized_options=b'\202\323\344\223\0029\0227/v8/{resource_name=customers/*/smartCampaignSettings/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateSmartCampaignSettings',
    full_name='google.ads.googleads.v8.services.SmartCampaignSettingService.MutateSmartCampaignSettings',
    index=1,
    containing_service=None,
    input_type=_MUTATESMARTCAMPAIGNSETTINGSREQUEST,
    output_type=_MUTATESMARTCAMPAIGNSETTINGSRESPONSE,
    serialized_options=b'\202\323\344\223\002?\":/v8/customers/{customer_id=*}/smartCampaignSettings:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_SMARTCAMPAIGNSETTINGSERVICE)

DESCRIPTOR.services_by_name['SmartCampaignSettingService'] = _SMARTCAMPAIGNSETTINGSERVICE

# @@protoc_insertion_point(module_scope)
