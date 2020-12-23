# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/ad_parameter_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import ad_parameter_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__parameter__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/ad_parameter_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB\027AdParameterServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v3/services/ad_parameter_service.proto\x12 google.ads.googleads.v3.services\x1a\x34google/ads/googleads/v3/resources/ad_parameter.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\\\n\x15GetAdParameterRequest\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$googleads.googleapis.com/AdParameter\"\xb6\x01\n\x19MutateAdParametersRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12O\n\noperations\x18\x02 \x03(\x0b\x32\x36.google.ads.googleads.v3.services.AdParameterOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xea\x01\n\x14\x41\x64ParameterOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12@\n\x06\x63reate\x18\x01 \x01(\x0b\x32..google.ads.googleads.v3.resources.AdParameterH\x00\x12@\n\x06update\x18\x02 \x01(\x0b\x32..google.ads.googleads.v3.resources.AdParameterH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x9b\x01\n\x1aMutateAdParametersResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12J\n\x07results\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v3.services.MutateAdParameterResult\"0\n\x17MutateAdParameterResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\x88\x04\n\x12\x41\x64ParameterService\x12\xc1\x01\n\x0eGetAdParameter\x12\x37.google.ads.googleads.v3.services.GetAdParameterRequest\x1a..google.ads.googleads.v3.resources.AdParameter\"F\x82\xd3\xe4\x93\x02\x30\x12./v3/{resource_name=customers/*/adParameters/*}\xda\x41\rresource_name\x12\xe6\x01\n\x12MutateAdParameters\x12;.google.ads.googleads.v3.services.MutateAdParametersRequest\x1a<.google.ads.googleads.v3.services.MutateAdParametersResponse\"U\x82\xd3\xe4\x93\x02\x36\"1/v3/customers/{customer_id=*}/adParameters:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfe\x01\n$com.google.ads.googleads.v3.servicesB\x17\x41\x64ParameterServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__parameter__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADPARAMETERREQUEST = _descriptor.Descriptor(
  name='GetAdParameterRequest',
  full_name='google.ads.googleads.v3.services.GetAdParameterRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetAdParameterRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\n$googleads.googleapis.com/AdParameter', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=325,
  serialized_end=417,
)


_MUTATEADPARAMETERSREQUEST = _descriptor.Descriptor(
  name='MutateAdParametersRequest',
  full_name='google.ads.googleads.v3.services.MutateAdParametersRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateAdParametersRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v3.services.MutateAdParametersRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v3.services.MutateAdParametersRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateAdParametersRequest.validate_only', index=3,
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
  serialized_start=420,
  serialized_end=602,
)


_ADPARAMETEROPERATION = _descriptor.Descriptor(
  name='AdParameterOperation',
  full_name='google.ads.googleads.v3.services.AdParameterOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v3.services.AdParameterOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.AdParameterOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v3.services.AdParameterOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.AdParameterOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v3.services.AdParameterOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=605,
  serialized_end=839,
)


_MUTATEADPARAMETERSRESPONSE = _descriptor.Descriptor(
  name='MutateAdParametersResponse',
  full_name='google.ads.googleads.v3.services.MutateAdParametersResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v3.services.MutateAdParametersResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v3.services.MutateAdParametersResponse.results', index=1,
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
  serialized_start=842,
  serialized_end=997,
)


_MUTATEADPARAMETERRESULT = _descriptor.Descriptor(
  name='MutateAdParameterResult',
  full_name='google.ads.googleads.v3.services.MutateAdParameterResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateAdParameterResult.resource_name', index=0,
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
  serialized_start=999,
  serialized_end=1047,
)

_MUTATEADPARAMETERSREQUEST.fields_by_name['operations'].message_type = _ADPARAMETEROPERATION
_ADPARAMETEROPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ADPARAMETEROPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__parameter__pb2._ADPARAMETER
_ADPARAMETEROPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__parameter__pb2._ADPARAMETER
_ADPARAMETEROPERATION.oneofs_by_name['operation'].fields.append(
  _ADPARAMETEROPERATION.fields_by_name['create'])
_ADPARAMETEROPERATION.fields_by_name['create'].containing_oneof = _ADPARAMETEROPERATION.oneofs_by_name['operation']
_ADPARAMETEROPERATION.oneofs_by_name['operation'].fields.append(
  _ADPARAMETEROPERATION.fields_by_name['update'])
_ADPARAMETEROPERATION.fields_by_name['update'].containing_oneof = _ADPARAMETEROPERATION.oneofs_by_name['operation']
_ADPARAMETEROPERATION.oneofs_by_name['operation'].fields.append(
  _ADPARAMETEROPERATION.fields_by_name['remove'])
_ADPARAMETEROPERATION.fields_by_name['remove'].containing_oneof = _ADPARAMETEROPERATION.oneofs_by_name['operation']
_MUTATEADPARAMETERSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADPARAMETERSRESPONSE.fields_by_name['results'].message_type = _MUTATEADPARAMETERRESULT
DESCRIPTOR.message_types_by_name['GetAdParameterRequest'] = _GETADPARAMETERREQUEST
DESCRIPTOR.message_types_by_name['MutateAdParametersRequest'] = _MUTATEADPARAMETERSREQUEST
DESCRIPTOR.message_types_by_name['AdParameterOperation'] = _ADPARAMETEROPERATION
DESCRIPTOR.message_types_by_name['MutateAdParametersResponse'] = _MUTATEADPARAMETERSRESPONSE
DESCRIPTOR.message_types_by_name['MutateAdParameterResult'] = _MUTATEADPARAMETERRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdParameterRequest = _reflection.GeneratedProtocolMessageType('GetAdParameterRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADPARAMETERREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.ad_parameter_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetAdParameterRequest)
  })
_sym_db.RegisterMessage(GetAdParameterRequest)

MutateAdParametersRequest = _reflection.GeneratedProtocolMessageType('MutateAdParametersRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADPARAMETERSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.ad_parameter_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdParametersRequest)
  })
_sym_db.RegisterMessage(MutateAdParametersRequest)

AdParameterOperation = _reflection.GeneratedProtocolMessageType('AdParameterOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADPARAMETEROPERATION,
  '__module__' : 'google.ads.googleads.v3.services.ad_parameter_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.AdParameterOperation)
  })
_sym_db.RegisterMessage(AdParameterOperation)

MutateAdParametersResponse = _reflection.GeneratedProtocolMessageType('MutateAdParametersResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADPARAMETERSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.ad_parameter_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdParametersResponse)
  })
_sym_db.RegisterMessage(MutateAdParametersResponse)

MutateAdParameterResult = _reflection.GeneratedProtocolMessageType('MutateAdParameterResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADPARAMETERRESULT,
  '__module__' : 'google.ads.googleads.v3.services.ad_parameter_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdParameterResult)
  })
_sym_db.RegisterMessage(MutateAdParameterResult)


DESCRIPTOR._options = None
_GETADPARAMETERREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADPARAMETERSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADPARAMETERSREQUEST.fields_by_name['operations']._options = None

_ADPARAMETERSERVICE = _descriptor.ServiceDescriptor(
  name='AdParameterService',
  full_name='google.ads.googleads.v3.services.AdParameterService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1050,
  serialized_end=1570,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdParameter',
    full_name='google.ads.googleads.v3.services.AdParameterService.GetAdParameter',
    index=0,
    containing_service=None,
    input_type=_GETADPARAMETERREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__parameter__pb2._ADPARAMETER,
    serialized_options=b'\202\323\344\223\0020\022./v3/{resource_name=customers/*/adParameters/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdParameters',
    full_name='google.ads.googleads.v3.services.AdParameterService.MutateAdParameters',
    index=1,
    containing_service=None,
    input_type=_MUTATEADPARAMETERSREQUEST,
    output_type=_MUTATEADPARAMETERSRESPONSE,
    serialized_options=b'\202\323\344\223\0026\"1/v3/customers/{customer_id=*}/adParameters:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADPARAMETERSERVICE)

DESCRIPTOR.services_by_name['AdParameterService'] = _ADPARAMETERSERVICE

# @@protoc_insertion_point(module_scope)
