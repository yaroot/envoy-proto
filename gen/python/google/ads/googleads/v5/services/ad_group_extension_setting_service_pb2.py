# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/services/ad_group_extension_setting_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v5.resources import ad_group_extension_setting_pb2 as google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_ad__group__extension__setting__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/services/ad_group_extension_setting_service.proto',
  package='google.ads.googleads.v5.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v5.servicesB#AdGroupExtensionSettingServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v5/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V5.Services\312\002 Google\\Ads\\GoogleAds\\V5\\Services\352\002$Google::Ads::GoogleAds::V5::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nIgoogle/ads/googleads/v5/services/ad_group_extension_setting_service.proto\x12 google.ads.googleads.v5.services\x1a\x42google/ads/googleads/v5/resources/ad_group_extension_setting.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"t\n!GetAdGroupExtensionSettingRequest\x12O\n\rresource_name\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0googleads.googleapis.com/AdGroupExtensionSetting\"\xce\x01\n%MutateAdGroupExtensionSettingsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12[\n\noperations\x18\x02 \x03(\x0b\x32\x42.google.ads.googleads.v5.services.AdGroupExtensionSettingOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\x8e\x02\n AdGroupExtensionSettingOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12L\n\x06\x63reate\x18\x01 \x01(\x0b\x32:.google.ads.googleads.v5.resources.AdGroupExtensionSettingH\x00\x12L\n\x06update\x18\x02 \x01(\x0b\x32:.google.ads.googleads.v5.resources.AdGroupExtensionSettingH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xb3\x01\n&MutateAdGroupExtensionSettingsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12V\n\x07results\x18\x02 \x03(\x0b\x32\x45.google.ads.googleads.v5.services.MutateAdGroupExtensionSettingResult\"<\n#MutateAdGroupExtensionSettingResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xf4\x04\n\x1e\x41\x64GroupExtensionSettingService\x12\xf1\x01\n\x1aGetAdGroupExtensionSetting\x12\x43.google.ads.googleads.v5.services.GetAdGroupExtensionSettingRequest\x1a:.google.ads.googleads.v5.resources.AdGroupExtensionSetting\"R\x82\xd3\xe4\x93\x02<\x12:/v5/{resource_name=customers/*/adGroupExtensionSettings/*}\xda\x41\rresource_name\x12\x96\x02\n\x1eMutateAdGroupExtensionSettings\x12G.google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest\x1aH.google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsResponse\"a\x82\xd3\xe4\x93\x02\x42\"=/v5/customers/{customer_id=*}/adGroupExtensionSettings:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8a\x02\n$com.google.ads.googleads.v5.servicesB#AdGroupExtensionSettingServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v5/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V5.Services\xca\x02 Google\\Ads\\GoogleAds\\V5\\Services\xea\x02$Google::Ads::GoogleAds::V5::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_ad__group__extension__setting__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADGROUPEXTENSIONSETTINGREQUEST = _descriptor.Descriptor(
  name='GetAdGroupExtensionSettingRequest',
  full_name='google.ads.googleads.v5.services.GetAdGroupExtensionSettingRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.GetAdGroupExtensionSettingRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A2\n0googleads.googleapis.com/AdGroupExtensionSetting', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=353,
  serialized_end=469,
)


_MUTATEADGROUPEXTENSIONSETTINGSREQUEST = _descriptor.Descriptor(
  name='MutateAdGroupExtensionSettingsRequest',
  full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest.validate_only', index=3,
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
  serialized_start=472,
  serialized_end=678,
)


_ADGROUPEXTENSIONSETTINGOPERATION = _descriptor.Descriptor(
  name='AdGroupExtensionSettingOperation',
  full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=681,
  serialized_end=951,
)


_MUTATEADGROUPEXTENSIONSETTINGSRESPONSE = _descriptor.Descriptor(
  name='MutateAdGroupExtensionSettingsResponse',
  full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsResponse.results', index=1,
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
  serialized_start=954,
  serialized_end=1133,
)


_MUTATEADGROUPEXTENSIONSETTINGRESULT = _descriptor.Descriptor(
  name='MutateAdGroupExtensionSettingResult',
  full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.MutateAdGroupExtensionSettingResult.resource_name', index=0,
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
  serialized_start=1135,
  serialized_end=1195,
)

_MUTATEADGROUPEXTENSIONSETTINGSREQUEST.fields_by_name['operations'].message_type = _ADGROUPEXTENSIONSETTINGOPERATION
_ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_ad__group__extension__setting__pb2._ADGROUPEXTENSIONSETTING
_ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_ad__group__extension__setting__pb2._ADGROUPEXTENSIONSETTING
_ADGROUPEXTENSIONSETTINGOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['create'])
_ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['create'].containing_oneof = _ADGROUPEXTENSIONSETTINGOPERATION.oneofs_by_name['operation']
_ADGROUPEXTENSIONSETTINGOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['update'])
_ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['update'].containing_oneof = _ADGROUPEXTENSIONSETTINGOPERATION.oneofs_by_name['operation']
_ADGROUPEXTENSIONSETTINGOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['remove'])
_ADGROUPEXTENSIONSETTINGOPERATION.fields_by_name['remove'].containing_oneof = _ADGROUPEXTENSIONSETTINGOPERATION.oneofs_by_name['operation']
_MUTATEADGROUPEXTENSIONSETTINGSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADGROUPEXTENSIONSETTINGSRESPONSE.fields_by_name['results'].message_type = _MUTATEADGROUPEXTENSIONSETTINGRESULT
DESCRIPTOR.message_types_by_name['GetAdGroupExtensionSettingRequest'] = _GETADGROUPEXTENSIONSETTINGREQUEST
DESCRIPTOR.message_types_by_name['MutateAdGroupExtensionSettingsRequest'] = _MUTATEADGROUPEXTENSIONSETTINGSREQUEST
DESCRIPTOR.message_types_by_name['AdGroupExtensionSettingOperation'] = _ADGROUPEXTENSIONSETTINGOPERATION
DESCRIPTOR.message_types_by_name['MutateAdGroupExtensionSettingsResponse'] = _MUTATEADGROUPEXTENSIONSETTINGSRESPONSE
DESCRIPTOR.message_types_by_name['MutateAdGroupExtensionSettingResult'] = _MUTATEADGROUPEXTENSIONSETTINGRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupExtensionSettingRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupExtensionSettingRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPEXTENSIONSETTINGREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.ad_group_extension_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.GetAdGroupExtensionSettingRequest)
  })
_sym_db.RegisterMessage(GetAdGroupExtensionSettingRequest)

MutateAdGroupExtensionSettingsRequest = _reflection.GeneratedProtocolMessageType('MutateAdGroupExtensionSettingsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPEXTENSIONSETTINGSREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.ad_group_extension_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsRequest)
  })
_sym_db.RegisterMessage(MutateAdGroupExtensionSettingsRequest)

AdGroupExtensionSettingOperation = _reflection.GeneratedProtocolMessageType('AdGroupExtensionSettingOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPEXTENSIONSETTINGOPERATION,
  '__module__' : 'google.ads.googleads.v5.services.ad_group_extension_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.AdGroupExtensionSettingOperation)
  })
_sym_db.RegisterMessage(AdGroupExtensionSettingOperation)

MutateAdGroupExtensionSettingsResponse = _reflection.GeneratedProtocolMessageType('MutateAdGroupExtensionSettingsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPEXTENSIONSETTINGSRESPONSE,
  '__module__' : 'google.ads.googleads.v5.services.ad_group_extension_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateAdGroupExtensionSettingsResponse)
  })
_sym_db.RegisterMessage(MutateAdGroupExtensionSettingsResponse)

MutateAdGroupExtensionSettingResult = _reflection.GeneratedProtocolMessageType('MutateAdGroupExtensionSettingResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPEXTENSIONSETTINGRESULT,
  '__module__' : 'google.ads.googleads.v5.services.ad_group_extension_setting_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateAdGroupExtensionSettingResult)
  })
_sym_db.RegisterMessage(MutateAdGroupExtensionSettingResult)


DESCRIPTOR._options = None
_GETADGROUPEXTENSIONSETTINGREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADGROUPEXTENSIONSETTINGSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADGROUPEXTENSIONSETTINGSREQUEST.fields_by_name['operations']._options = None

_ADGROUPEXTENSIONSETTINGSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupExtensionSettingService',
  full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1198,
  serialized_end=1826,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupExtensionSetting',
    full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingService.GetAdGroupExtensionSetting',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPEXTENSIONSETTINGREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_ad__group__extension__setting__pb2._ADGROUPEXTENSIONSETTING,
    serialized_options=b'\202\323\344\223\002<\022:/v5/{resource_name=customers/*/adGroupExtensionSettings/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdGroupExtensionSettings',
    full_name='google.ads.googleads.v5.services.AdGroupExtensionSettingService.MutateAdGroupExtensionSettings',
    index=1,
    containing_service=None,
    input_type=_MUTATEADGROUPEXTENSIONSETTINGSREQUEST,
    output_type=_MUTATEADGROUPEXTENSIONSETTINGSRESPONSE,
    serialized_options=b'\202\323\344\223\002B\"=/v5/customers/{customer_id=*}/adGroupExtensionSettings:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPEXTENSIONSETTINGSERVICE)

DESCRIPTOR.services_by_name['AdGroupExtensionSettingService'] = _ADGROUPEXTENSIONSETTINGSERVICE

# @@protoc_insertion_point(module_scope)
