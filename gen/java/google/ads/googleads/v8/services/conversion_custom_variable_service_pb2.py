# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/conversion_custom_variable_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v8.resources import conversion_custom_variable_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_conversion__custom__variable__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/conversion_custom_variable_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB$ConversionCustomVariableServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nIgoogle/ads/googleads/v8/services/conversion_custom_variable_service.proto\x12 google.ads.googleads.v8.services\x1a\x39google/ads/googleads/v8/enums/response_content_type.proto\x1a\x42google/ads/googleads/v8/resources/conversion_custom_variable.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"v\n\"GetConversionCustomVariableRequest\x12P\n\rresource_name\x18\x01 \x01(\tB9\xe0\x41\x02\xfa\x41\x33\n1googleads.googleapis.com/ConversionCustomVariable\"\xbb\x02\n&MutateConversionCustomVariablesRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\\\n\noperations\x18\x02 \x03(\x0b\x32\x43.google.ads.googleads.v8.services.ConversionCustomVariableOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v8.enums.ResponseContentTypeEnum.ResponseContentType\"\xff\x01\n!ConversionCustomVariableOperation\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12M\n\x06\x63reate\x18\x01 \x01(\x0b\x32;.google.ads.googleads.v8.resources.ConversionCustomVariableH\x00\x12M\n\x06update\x18\x02 \x01(\x0b\x32;.google.ads.googleads.v8.resources.ConversionCustomVariableH\x00\x42\x0b\n\toperation\"\xb5\x01\n\'MutateConversionCustomVariablesResponse\x12\x31\n\x15partial_failure_error\x18\x01 \x01(\x0b\x32\x12.google.rpc.Status\x12W\n\x07results\x18\x02 \x03(\x0b\x32\x46.google.ads.googleads.v8.services.MutateConversionCustomVariableResult\"\x9e\x01\n$MutateConversionCustomVariableResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12_\n\x1a\x63onversion_custom_variable\x18\x02 \x01(\x0b\x32;.google.ads.googleads.v8.resources.ConversionCustomVariable2\xfd\x04\n\x1f\x43onversionCustomVariableService\x12\xf5\x01\n\x1bGetConversionCustomVariable\x12\x44.google.ads.googleads.v8.services.GetConversionCustomVariableRequest\x1a;.google.ads.googleads.v8.resources.ConversionCustomVariable\"S\x82\xd3\xe4\x93\x02=\x12;/v8/{resource_name=customers/*/conversionCustomVariables/*}\xda\x41\rresource_name\x12\x9a\x02\n\x1fMutateConversionCustomVariables\x12H.google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest\x1aI.google.ads.googleads.v8.services.MutateConversionCustomVariablesResponse\"b\x82\xd3\xe4\x93\x02\x43\">/v8/customers/{customer_id=*}/conversionCustomVariables:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8b\x02\n$com.google.ads.googleads.v8.servicesB$ConversionCustomVariableServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_conversion__custom__variable__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCONVERSIONCUSTOMVARIABLEREQUEST = _descriptor.Descriptor(
  name='GetConversionCustomVariableRequest',
  full_name='google.ads.googleads.v8.services.GetConversionCustomVariableRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetConversionCustomVariableRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A3\n1googleads.googleapis.com/ConversionCustomVariable', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=530,
)


_MUTATECONVERSIONCUSTOMVARIABLESREQUEST = _descriptor.Descriptor(
  name='MutateConversionCustomVariablesRequest',
  full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest.response_content_type', index=4,
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
  serialized_start=533,
  serialized_end=848,
)


_CONVERSIONCUSTOMVARIABLEOPERATION = _descriptor.Descriptor(
  name='ConversionCustomVariableOperation',
  full_name='google.ads.googleads.v8.services.ConversionCustomVariableOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v8.services.ConversionCustomVariableOperation.update_mask', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v8.services.ConversionCustomVariableOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v8.services.ConversionCustomVariableOperation.update', index=2,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v8.services.ConversionCustomVariableOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=851,
  serialized_end=1106,
)


_MUTATECONVERSIONCUSTOMVARIABLESRESPONSE = _descriptor.Descriptor(
  name='MutateConversionCustomVariablesResponse',
  full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesResponse.partial_failure_error', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariablesResponse.results', index=1,
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
  serialized_start=1109,
  serialized_end=1290,
)


_MUTATECONVERSIONCUSTOMVARIABLERESULT = _descriptor.Descriptor(
  name='MutateConversionCustomVariableResult',
  full_name='google.ads.googleads.v8.services.MutateConversionCustomVariableResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariableResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='conversion_custom_variable', full_name='google.ads.googleads.v8.services.MutateConversionCustomVariableResult.conversion_custom_variable', index=1,
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
  serialized_start=1293,
  serialized_end=1451,
)

_MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['operations'].message_type = _CONVERSIONCUSTOMVARIABLEOPERATION
_MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_conversion__custom__variable__pb2._CONVERSIONCUSTOMVARIABLE
_CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_conversion__custom__variable__pb2._CONVERSIONCUSTOMVARIABLE
_CONVERSIONCUSTOMVARIABLEOPERATION.oneofs_by_name['operation'].fields.append(
  _CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['create'])
_CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['create'].containing_oneof = _CONVERSIONCUSTOMVARIABLEOPERATION.oneofs_by_name['operation']
_CONVERSIONCUSTOMVARIABLEOPERATION.oneofs_by_name['operation'].fields.append(
  _CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['update'])
_CONVERSIONCUSTOMVARIABLEOPERATION.fields_by_name['update'].containing_oneof = _CONVERSIONCUSTOMVARIABLEOPERATION.oneofs_by_name['operation']
_MUTATECONVERSIONCUSTOMVARIABLESRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECONVERSIONCUSTOMVARIABLESRESPONSE.fields_by_name['results'].message_type = _MUTATECONVERSIONCUSTOMVARIABLERESULT
_MUTATECONVERSIONCUSTOMVARIABLERESULT.fields_by_name['conversion_custom_variable'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_conversion__custom__variable__pb2._CONVERSIONCUSTOMVARIABLE
DESCRIPTOR.message_types_by_name['GetConversionCustomVariableRequest'] = _GETCONVERSIONCUSTOMVARIABLEREQUEST
DESCRIPTOR.message_types_by_name['MutateConversionCustomVariablesRequest'] = _MUTATECONVERSIONCUSTOMVARIABLESREQUEST
DESCRIPTOR.message_types_by_name['ConversionCustomVariableOperation'] = _CONVERSIONCUSTOMVARIABLEOPERATION
DESCRIPTOR.message_types_by_name['MutateConversionCustomVariablesResponse'] = _MUTATECONVERSIONCUSTOMVARIABLESRESPONSE
DESCRIPTOR.message_types_by_name['MutateConversionCustomVariableResult'] = _MUTATECONVERSIONCUSTOMVARIABLERESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetConversionCustomVariableRequest = _reflection.GeneratedProtocolMessageType('GetConversionCustomVariableRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCONVERSIONCUSTOMVARIABLEREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.conversion_custom_variable_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetConversionCustomVariableRequest)
  })
_sym_db.RegisterMessage(GetConversionCustomVariableRequest)

MutateConversionCustomVariablesRequest = _reflection.GeneratedProtocolMessageType('MutateConversionCustomVariablesRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECONVERSIONCUSTOMVARIABLESREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.conversion_custom_variable_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateConversionCustomVariablesRequest)
  })
_sym_db.RegisterMessage(MutateConversionCustomVariablesRequest)

ConversionCustomVariableOperation = _reflection.GeneratedProtocolMessageType('ConversionCustomVariableOperation', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSIONCUSTOMVARIABLEOPERATION,
  '__module__' : 'google.ads.googleads.v8.services.conversion_custom_variable_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.ConversionCustomVariableOperation)
  })
_sym_db.RegisterMessage(ConversionCustomVariableOperation)

MutateConversionCustomVariablesResponse = _reflection.GeneratedProtocolMessageType('MutateConversionCustomVariablesResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECONVERSIONCUSTOMVARIABLESRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.conversion_custom_variable_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateConversionCustomVariablesResponse)
  })
_sym_db.RegisterMessage(MutateConversionCustomVariablesResponse)

MutateConversionCustomVariableResult = _reflection.GeneratedProtocolMessageType('MutateConversionCustomVariableResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECONVERSIONCUSTOMVARIABLERESULT,
  '__module__' : 'google.ads.googleads.v8.services.conversion_custom_variable_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateConversionCustomVariableResult)
  })
_sym_db.RegisterMessage(MutateConversionCustomVariableResult)


DESCRIPTOR._options = None
_GETCONVERSIONCUSTOMVARIABLEREQUEST.fields_by_name['resource_name']._options = None
_MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['customer_id']._options = None
_MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['operations']._options = None

_CONVERSIONCUSTOMVARIABLESERVICE = _descriptor.ServiceDescriptor(
  name='ConversionCustomVariableService',
  full_name='google.ads.googleads.v8.services.ConversionCustomVariableService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1454,
  serialized_end=2091,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetConversionCustomVariable',
    full_name='google.ads.googleads.v8.services.ConversionCustomVariableService.GetConversionCustomVariable',
    index=0,
    containing_service=None,
    input_type=_GETCONVERSIONCUSTOMVARIABLEREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_conversion__custom__variable__pb2._CONVERSIONCUSTOMVARIABLE,
    serialized_options=b'\202\323\344\223\002=\022;/v8/{resource_name=customers/*/conversionCustomVariables/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateConversionCustomVariables',
    full_name='google.ads.googleads.v8.services.ConversionCustomVariableService.MutateConversionCustomVariables',
    index=1,
    containing_service=None,
    input_type=_MUTATECONVERSIONCUSTOMVARIABLESREQUEST,
    output_type=_MUTATECONVERSIONCUSTOMVARIABLESRESPONSE,
    serialized_options=b'\202\323\344\223\002C\">/v8/customers/{customer_id=*}/conversionCustomVariables:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CONVERSIONCUSTOMVARIABLESERVICE)

DESCRIPTOR.services_by_name['ConversionCustomVariableService'] = _CONVERSIONCUSTOMVARIABLESERVICE

# @@protoc_insertion_point(module_scope)
