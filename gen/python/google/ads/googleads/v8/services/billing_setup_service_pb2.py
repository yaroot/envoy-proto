# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/billing_setup_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.resources import billing_setup_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_billing__setup__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/billing_setup_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB\030BillingSetupServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/ads/googleads/v8/services/billing_setup_service.proto\x12 google.ads.googleads.v8.services\x1a\x35google/ads/googleads/v8/resources/billing_setup.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"^\n\x16GetBillingSetupRequest\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%googleads.googleapis.com/BillingSetup\"\x86\x01\n\x19MutateBillingSetupRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12O\n\toperation\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v8.services.BillingSetupOperationB\x03\xe0\x41\x02\"y\n\x15\x42illingSetupOperation\x12\x41\n\x06\x63reate\x18\x02 \x01(\x0b\x32/.google.ads.googleads.v8.resources.BillingSetupH\x00\x12\x10\n\x06remove\x18\x01 \x01(\tH\x00\x42\x0b\n\toperation\"h\n\x1aMutateBillingSetupResponse\x12J\n\x06result\x18\x01 \x01(\x0b\x32:.google.ads.googleads.v8.services.MutateBillingSetupResult\"1\n\x18MutateBillingSetupResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\x8d\x04\n\x13\x42illingSetupService\x12\xc5\x01\n\x0fGetBillingSetup\x12\x38.google.ads.googleads.v8.services.GetBillingSetupRequest\x1a/.google.ads.googleads.v8.resources.BillingSetup\"G\x82\xd3\xe4\x93\x02\x31\x12//v8/{resource_name=customers/*/billingSetups/*}\xda\x41\rresource_name\x12\xe6\x01\n\x12MutateBillingSetup\x12;.google.ads.googleads.v8.services.MutateBillingSetupRequest\x1a<.google.ads.googleads.v8.services.MutateBillingSetupResponse\"U\x82\xd3\xe4\x93\x02\x37\"2/v8/customers/{customer_id=*}/billingSetups:mutate:\x01*\xda\x41\x15\x63ustomer_id,operation\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xff\x01\n$com.google.ads.googleads.v8.servicesB\x18\x42illingSetupServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_billing__setup__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETBILLINGSETUPREQUEST = _descriptor.Descriptor(
  name='GetBillingSetupRequest',
  full_name='google.ads.googleads.v8.services.GetBillingSetupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetBillingSetupRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\'\n%googleads.googleapis.com/BillingSetup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=268,
  serialized_end=362,
)


_MUTATEBILLINGSETUPREQUEST = _descriptor.Descriptor(
  name='MutateBillingSetupRequest',
  full_name='google.ads.googleads.v8.services.MutateBillingSetupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.MutateBillingSetupRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operation', full_name='google.ads.googleads.v8.services.MutateBillingSetupRequest.operation', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=365,
  serialized_end=499,
)


_BILLINGSETUPOPERATION = _descriptor.Descriptor(
  name='BillingSetupOperation',
  full_name='google.ads.googleads.v8.services.BillingSetupOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v8.services.BillingSetupOperation.create', index=0,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v8.services.BillingSetupOperation.remove', index=1,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v8.services.BillingSetupOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=501,
  serialized_end=622,
)


_MUTATEBILLINGSETUPRESPONSE = _descriptor.Descriptor(
  name='MutateBillingSetupResponse',
  full_name='google.ads.googleads.v8.services.MutateBillingSetupResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='google.ads.googleads.v8.services.MutateBillingSetupResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=624,
  serialized_end=728,
)


_MUTATEBILLINGSETUPRESULT = _descriptor.Descriptor(
  name='MutateBillingSetupResult',
  full_name='google.ads.googleads.v8.services.MutateBillingSetupResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.MutateBillingSetupResult.resource_name', index=0,
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
  serialized_start=730,
  serialized_end=779,
)

_MUTATEBILLINGSETUPREQUEST.fields_by_name['operation'].message_type = _BILLINGSETUPOPERATION
_BILLINGSETUPOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_billing__setup__pb2._BILLINGSETUP
_BILLINGSETUPOPERATION.oneofs_by_name['operation'].fields.append(
  _BILLINGSETUPOPERATION.fields_by_name['create'])
_BILLINGSETUPOPERATION.fields_by_name['create'].containing_oneof = _BILLINGSETUPOPERATION.oneofs_by_name['operation']
_BILLINGSETUPOPERATION.oneofs_by_name['operation'].fields.append(
  _BILLINGSETUPOPERATION.fields_by_name['remove'])
_BILLINGSETUPOPERATION.fields_by_name['remove'].containing_oneof = _BILLINGSETUPOPERATION.oneofs_by_name['operation']
_MUTATEBILLINGSETUPRESPONSE.fields_by_name['result'].message_type = _MUTATEBILLINGSETUPRESULT
DESCRIPTOR.message_types_by_name['GetBillingSetupRequest'] = _GETBILLINGSETUPREQUEST
DESCRIPTOR.message_types_by_name['MutateBillingSetupRequest'] = _MUTATEBILLINGSETUPREQUEST
DESCRIPTOR.message_types_by_name['BillingSetupOperation'] = _BILLINGSETUPOPERATION
DESCRIPTOR.message_types_by_name['MutateBillingSetupResponse'] = _MUTATEBILLINGSETUPRESPONSE
DESCRIPTOR.message_types_by_name['MutateBillingSetupResult'] = _MUTATEBILLINGSETUPRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetBillingSetupRequest = _reflection.GeneratedProtocolMessageType('GetBillingSetupRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETBILLINGSETUPREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.billing_setup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetBillingSetupRequest)
  })
_sym_db.RegisterMessage(GetBillingSetupRequest)

MutateBillingSetupRequest = _reflection.GeneratedProtocolMessageType('MutateBillingSetupRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBILLINGSETUPREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.billing_setup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateBillingSetupRequest)
  })
_sym_db.RegisterMessage(MutateBillingSetupRequest)

BillingSetupOperation = _reflection.GeneratedProtocolMessageType('BillingSetupOperation', (_message.Message,), {
  'DESCRIPTOR' : _BILLINGSETUPOPERATION,
  '__module__' : 'google.ads.googleads.v8.services.billing_setup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.BillingSetupOperation)
  })
_sym_db.RegisterMessage(BillingSetupOperation)

MutateBillingSetupResponse = _reflection.GeneratedProtocolMessageType('MutateBillingSetupResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBILLINGSETUPRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.billing_setup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateBillingSetupResponse)
  })
_sym_db.RegisterMessage(MutateBillingSetupResponse)

MutateBillingSetupResult = _reflection.GeneratedProtocolMessageType('MutateBillingSetupResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBILLINGSETUPRESULT,
  '__module__' : 'google.ads.googleads.v8.services.billing_setup_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateBillingSetupResult)
  })
_sym_db.RegisterMessage(MutateBillingSetupResult)


DESCRIPTOR._options = None
_GETBILLINGSETUPREQUEST.fields_by_name['resource_name']._options = None
_MUTATEBILLINGSETUPREQUEST.fields_by_name['customer_id']._options = None
_MUTATEBILLINGSETUPREQUEST.fields_by_name['operation']._options = None

_BILLINGSETUPSERVICE = _descriptor.ServiceDescriptor(
  name='BillingSetupService',
  full_name='google.ads.googleads.v8.services.BillingSetupService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=782,
  serialized_end=1307,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetBillingSetup',
    full_name='google.ads.googleads.v8.services.BillingSetupService.GetBillingSetup',
    index=0,
    containing_service=None,
    input_type=_GETBILLINGSETUPREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_billing__setup__pb2._BILLINGSETUP,
    serialized_options=b'\202\323\344\223\0021\022//v8/{resource_name=customers/*/billingSetups/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateBillingSetup',
    full_name='google.ads.googleads.v8.services.BillingSetupService.MutateBillingSetup',
    index=1,
    containing_service=None,
    input_type=_MUTATEBILLINGSETUPREQUEST,
    output_type=_MUTATEBILLINGSETUPRESPONSE,
    serialized_options=b'\202\323\344\223\0027\"2/v8/customers/{customer_id=*}/billingSetups:mutate:\001*\332A\025customer_id,operation',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_BILLINGSETUPSERVICE)

DESCRIPTOR.services_by_name['BillingSetupService'] = _BILLINGSETUPSERVICE

# @@protoc_insertion_point(module_scope)
