# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/conversion_action_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import conversion_action_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_conversion__action__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/conversion_action_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB\034ConversionActionServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@google/ads/googleads/v3/services/conversion_action_service.proto\x12 google.ads.googleads.v3.services\x1a\x39google/ads/googleads/v3/resources/conversion_action.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"f\n\x1aGetConversionActionRequest\x12H\n\rresource_name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)googleads.googleapis.com/ConversionAction\"\xc0\x01\n\x1eMutateConversionActionsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12T\n\noperations\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v3.services.ConversionActionOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xf9\x01\n\x19\x43onversionActionOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x45\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x33.google.ads.googleads.v3.resources.ConversionActionH\x00\x12\x45\n\x06update\x18\x02 \x01(\x0b\x32\x33.google.ads.googleads.v3.resources.ConversionActionH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xa5\x01\n\x1fMutateConversionActionsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12O\n\x07results\x18\x02 \x03(\x0b\x32>.google.ads.googleads.v3.services.MutateConversionActionResult\"5\n\x1cMutateConversionActionResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xb5\x04\n\x17\x43onversionActionService\x12\xd5\x01\n\x13GetConversionAction\x12<.google.ads.googleads.v3.services.GetConversionActionRequest\x1a\x33.google.ads.googleads.v3.resources.ConversionAction\"K\x82\xd3\xe4\x93\x02\x35\x12\x33/v3/{resource_name=customers/*/conversionActions/*}\xda\x41\rresource_name\x12\xfa\x01\n\x17MutateConversionActions\x12@.google.ads.googleads.v3.services.MutateConversionActionsRequest\x1a\x41.google.ads.googleads.v3.services.MutateConversionActionsResponse\"Z\x82\xd3\xe4\x93\x02;\"6/v3/customers/{customer_id=*}/conversionActions:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x83\x02\n$com.google.ads.googleads.v3.servicesB\x1c\x43onversionActionServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_conversion__action__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCONVERSIONACTIONREQUEST = _descriptor.Descriptor(
  name='GetConversionActionRequest',
  full_name='google.ads.googleads.v3.services.GetConversionActionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetConversionActionRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A+\n)googleads.googleapis.com/ConversionAction', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=335,
  serialized_end=437,
)


_MUTATECONVERSIONACTIONSREQUEST = _descriptor.Descriptor(
  name='MutateConversionActionsRequest',
  full_name='google.ads.googleads.v3.services.MutateConversionActionsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateConversionActionsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v3.services.MutateConversionActionsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v3.services.MutateConversionActionsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateConversionActionsRequest.validate_only', index=3,
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
  serialized_start=440,
  serialized_end=632,
)


_CONVERSIONACTIONOPERATION = _descriptor.Descriptor(
  name='ConversionActionOperation',
  full_name='google.ads.googleads.v3.services.ConversionActionOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v3.services.ConversionActionOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.ConversionActionOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v3.services.ConversionActionOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.ConversionActionOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v3.services.ConversionActionOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=635,
  serialized_end=884,
)


_MUTATECONVERSIONACTIONSRESPONSE = _descriptor.Descriptor(
  name='MutateConversionActionsResponse',
  full_name='google.ads.googleads.v3.services.MutateConversionActionsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v3.services.MutateConversionActionsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v3.services.MutateConversionActionsResponse.results', index=1,
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
  serialized_start=887,
  serialized_end=1052,
)


_MUTATECONVERSIONACTIONRESULT = _descriptor.Descriptor(
  name='MutateConversionActionResult',
  full_name='google.ads.googleads.v3.services.MutateConversionActionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateConversionActionResult.resource_name', index=0,
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
  serialized_start=1054,
  serialized_end=1107,
)

_MUTATECONVERSIONACTIONSREQUEST.fields_by_name['operations'].message_type = _CONVERSIONACTIONOPERATION
_CONVERSIONACTIONOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CONVERSIONACTIONOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_conversion__action__pb2._CONVERSIONACTION
_CONVERSIONACTIONOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_conversion__action__pb2._CONVERSIONACTION
_CONVERSIONACTIONOPERATION.oneofs_by_name['operation'].fields.append(
  _CONVERSIONACTIONOPERATION.fields_by_name['create'])
_CONVERSIONACTIONOPERATION.fields_by_name['create'].containing_oneof = _CONVERSIONACTIONOPERATION.oneofs_by_name['operation']
_CONVERSIONACTIONOPERATION.oneofs_by_name['operation'].fields.append(
  _CONVERSIONACTIONOPERATION.fields_by_name['update'])
_CONVERSIONACTIONOPERATION.fields_by_name['update'].containing_oneof = _CONVERSIONACTIONOPERATION.oneofs_by_name['operation']
_CONVERSIONACTIONOPERATION.oneofs_by_name['operation'].fields.append(
  _CONVERSIONACTIONOPERATION.fields_by_name['remove'])
_CONVERSIONACTIONOPERATION.fields_by_name['remove'].containing_oneof = _CONVERSIONACTIONOPERATION.oneofs_by_name['operation']
_MUTATECONVERSIONACTIONSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECONVERSIONACTIONSRESPONSE.fields_by_name['results'].message_type = _MUTATECONVERSIONACTIONRESULT
DESCRIPTOR.message_types_by_name['GetConversionActionRequest'] = _GETCONVERSIONACTIONREQUEST
DESCRIPTOR.message_types_by_name['MutateConversionActionsRequest'] = _MUTATECONVERSIONACTIONSREQUEST
DESCRIPTOR.message_types_by_name['ConversionActionOperation'] = _CONVERSIONACTIONOPERATION
DESCRIPTOR.message_types_by_name['MutateConversionActionsResponse'] = _MUTATECONVERSIONACTIONSRESPONSE
DESCRIPTOR.message_types_by_name['MutateConversionActionResult'] = _MUTATECONVERSIONACTIONRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetConversionActionRequest = _reflection.GeneratedProtocolMessageType('GetConversionActionRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCONVERSIONACTIONREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.conversion_action_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetConversionActionRequest)
  })
_sym_db.RegisterMessage(GetConversionActionRequest)

MutateConversionActionsRequest = _reflection.GeneratedProtocolMessageType('MutateConversionActionsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECONVERSIONACTIONSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.conversion_action_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateConversionActionsRequest)
  })
_sym_db.RegisterMessage(MutateConversionActionsRequest)

ConversionActionOperation = _reflection.GeneratedProtocolMessageType('ConversionActionOperation', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSIONACTIONOPERATION,
  '__module__' : 'google.ads.googleads.v3.services.conversion_action_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.ConversionActionOperation)
  })
_sym_db.RegisterMessage(ConversionActionOperation)

MutateConversionActionsResponse = _reflection.GeneratedProtocolMessageType('MutateConversionActionsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECONVERSIONACTIONSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.conversion_action_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateConversionActionsResponse)
  })
_sym_db.RegisterMessage(MutateConversionActionsResponse)

MutateConversionActionResult = _reflection.GeneratedProtocolMessageType('MutateConversionActionResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECONVERSIONACTIONRESULT,
  '__module__' : 'google.ads.googleads.v3.services.conversion_action_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateConversionActionResult)
  })
_sym_db.RegisterMessage(MutateConversionActionResult)


DESCRIPTOR._options = None
_GETCONVERSIONACTIONREQUEST.fields_by_name['resource_name']._options = None
_MUTATECONVERSIONACTIONSREQUEST.fields_by_name['customer_id']._options = None
_MUTATECONVERSIONACTIONSREQUEST.fields_by_name['operations']._options = None

_CONVERSIONACTIONSERVICE = _descriptor.ServiceDescriptor(
  name='ConversionActionService',
  full_name='google.ads.googleads.v3.services.ConversionActionService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1110,
  serialized_end=1675,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetConversionAction',
    full_name='google.ads.googleads.v3.services.ConversionActionService.GetConversionAction',
    index=0,
    containing_service=None,
    input_type=_GETCONVERSIONACTIONREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_conversion__action__pb2._CONVERSIONACTION,
    serialized_options=b'\202\323\344\223\0025\0223/v3/{resource_name=customers/*/conversionActions/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateConversionActions',
    full_name='google.ads.googleads.v3.services.ConversionActionService.MutateConversionActions',
    index=1,
    containing_service=None,
    input_type=_MUTATECONVERSIONACTIONSREQUEST,
    output_type=_MUTATECONVERSIONACTIONSRESPONSE,
    serialized_options=b'\202\323\344\223\002;\"6/v3/customers/{customer_id=*}/conversionActions:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CONVERSIONACTIONSERVICE)

DESCRIPTOR.services_by_name['ConversionActionService'] = _CONVERSIONACTIONSERVICE

# @@protoc_insertion_point(module_scope)
