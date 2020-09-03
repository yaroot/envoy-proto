# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/account_budget_proposal_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import account_budget_proposal_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_account__budget__proposal__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/account_budget_proposal_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB!AccountBudgetProposalServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nFgoogle/ads/googleads/v3/services/account_budget_proposal_service.proto\x12 google.ads.googleads.v3.services\x1a?google/ads/googleads/v3/resources/account_budget_proposal.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"p\n\x1fGetAccountBudgetProposalRequest\x12M\n\rresource_name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.googleads.googleapis.com/AccountBudgetProposal\"\xaf\x01\n\"MutateAccountBudgetProposalRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\toperation\x18\x02 \x01(\x0b\x32@.google.ads.googleads.v3.services.AccountBudgetProposalOperationB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"\xbc\x01\n\x1e\x41\x63\x63ountBudgetProposalOperation\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12J\n\x06\x63reate\x18\x02 \x01(\x0b\x32\x38.google.ads.googleads.v3.resources.AccountBudgetProposalH\x00\x12\x10\n\x06remove\x18\x01 \x01(\tH\x00\x42\x0b\n\toperation\"z\n#MutateAccountBudgetProposalResponse\x12S\n\x06result\x18\x02 \x01(\x0b\x32\x43.google.ads.googleads.v3.services.MutateAccountBudgetProposalResult\":\n!MutateAccountBudgetProposalResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xb4\x04\n\x1c\x41\x63\x63ountBudgetProposalService\x12\xe9\x01\n\x18GetAccountBudgetProposal\x12\x41.google.ads.googleads.v3.services.GetAccountBudgetProposalRequest\x1a\x38.google.ads.googleads.v3.resources.AccountBudgetProposal\"P\x82\xd3\xe4\x93\x02:\x12\x38/v3/{resource_name=customers/*/accountBudgetProposals/*}\xda\x41\rresource_name\x12\x8a\x02\n\x1bMutateAccountBudgetProposal\x12\x44.google.ads.googleads.v3.services.MutateAccountBudgetProposalRequest\x1a\x45.google.ads.googleads.v3.services.MutateAccountBudgetProposalResponse\"^\x82\xd3\xe4\x93\x02@\";/v3/customers/{customer_id=*}/accountBudgetProposals:mutate:\x01*\xda\x41\x15\x63ustomer_id,operation\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x88\x02\n$com.google.ads.googleads.v3.servicesB!AccountBudgetProposalServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_account__budget__proposal__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,])




_GETACCOUNTBUDGETPROPOSALREQUEST = _descriptor.Descriptor(
  name='GetAccountBudgetProposalRequest',
  full_name='google.ads.googleads.v3.services.GetAccountBudgetProposalRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetAccountBudgetProposalRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A0\n.googleads.googleapis.com/AccountBudgetProposal', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=322,
  serialized_end=434,
)


_MUTATEACCOUNTBUDGETPROPOSALREQUEST = _descriptor.Descriptor(
  name='MutateAccountBudgetProposalRequest',
  full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operation', full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalRequest.operation', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalRequest.validate_only', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_start=437,
  serialized_end=612,
)


_ACCOUNTBUDGETPROPOSALOPERATION = _descriptor.Descriptor(
  name='AccountBudgetProposalOperation',
  full_name='google.ads.googleads.v3.services.AccountBudgetProposalOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v3.services.AccountBudgetProposalOperation.update_mask', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.AccountBudgetProposalOperation.create', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.AccountBudgetProposalOperation.remove', index=2,
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
      name='operation', full_name='google.ads.googleads.v3.services.AccountBudgetProposalOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=615,
  serialized_end=803,
)


_MUTATEACCOUNTBUDGETPROPOSALRESPONSE = _descriptor.Descriptor(
  name='MutateAccountBudgetProposalResponse',
  full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalResponse.result', index=0,
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
  serialized_start=805,
  serialized_end=927,
)


_MUTATEACCOUNTBUDGETPROPOSALRESULT = _descriptor.Descriptor(
  name='MutateAccountBudgetProposalResult',
  full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateAccountBudgetProposalResult.resource_name', index=0,
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
  serialized_start=929,
  serialized_end=987,
)

_MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['operation'].message_type = _ACCOUNTBUDGETPROPOSALOPERATION
_ACCOUNTBUDGETPROPOSALOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ACCOUNTBUDGETPROPOSALOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_account__budget__proposal__pb2._ACCOUNTBUDGETPROPOSAL
_ACCOUNTBUDGETPROPOSALOPERATION.oneofs_by_name['operation'].fields.append(
  _ACCOUNTBUDGETPROPOSALOPERATION.fields_by_name['create'])
_ACCOUNTBUDGETPROPOSALOPERATION.fields_by_name['create'].containing_oneof = _ACCOUNTBUDGETPROPOSALOPERATION.oneofs_by_name['operation']
_ACCOUNTBUDGETPROPOSALOPERATION.oneofs_by_name['operation'].fields.append(
  _ACCOUNTBUDGETPROPOSALOPERATION.fields_by_name['remove'])
_ACCOUNTBUDGETPROPOSALOPERATION.fields_by_name['remove'].containing_oneof = _ACCOUNTBUDGETPROPOSALOPERATION.oneofs_by_name['operation']
_MUTATEACCOUNTBUDGETPROPOSALRESPONSE.fields_by_name['result'].message_type = _MUTATEACCOUNTBUDGETPROPOSALRESULT
DESCRIPTOR.message_types_by_name['GetAccountBudgetProposalRequest'] = _GETACCOUNTBUDGETPROPOSALREQUEST
DESCRIPTOR.message_types_by_name['MutateAccountBudgetProposalRequest'] = _MUTATEACCOUNTBUDGETPROPOSALREQUEST
DESCRIPTOR.message_types_by_name['AccountBudgetProposalOperation'] = _ACCOUNTBUDGETPROPOSALOPERATION
DESCRIPTOR.message_types_by_name['MutateAccountBudgetProposalResponse'] = _MUTATEACCOUNTBUDGETPROPOSALRESPONSE
DESCRIPTOR.message_types_by_name['MutateAccountBudgetProposalResult'] = _MUTATEACCOUNTBUDGETPROPOSALRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAccountBudgetProposalRequest = _reflection.GeneratedProtocolMessageType('GetAccountBudgetProposalRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETACCOUNTBUDGETPROPOSALREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.account_budget_proposal_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetAccountBudgetProposalRequest)
  })
_sym_db.RegisterMessage(GetAccountBudgetProposalRequest)

MutateAccountBudgetProposalRequest = _reflection.GeneratedProtocolMessageType('MutateAccountBudgetProposalRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEACCOUNTBUDGETPROPOSALREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.account_budget_proposal_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAccountBudgetProposalRequest)
  })
_sym_db.RegisterMessage(MutateAccountBudgetProposalRequest)

AccountBudgetProposalOperation = _reflection.GeneratedProtocolMessageType('AccountBudgetProposalOperation', (_message.Message,), {
  'DESCRIPTOR' : _ACCOUNTBUDGETPROPOSALOPERATION,
  '__module__' : 'google.ads.googleads.v3.services.account_budget_proposal_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.AccountBudgetProposalOperation)
  })
_sym_db.RegisterMessage(AccountBudgetProposalOperation)

MutateAccountBudgetProposalResponse = _reflection.GeneratedProtocolMessageType('MutateAccountBudgetProposalResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEACCOUNTBUDGETPROPOSALRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.account_budget_proposal_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAccountBudgetProposalResponse)
  })
_sym_db.RegisterMessage(MutateAccountBudgetProposalResponse)

MutateAccountBudgetProposalResult = _reflection.GeneratedProtocolMessageType('MutateAccountBudgetProposalResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEACCOUNTBUDGETPROPOSALRESULT,
  '__module__' : 'google.ads.googleads.v3.services.account_budget_proposal_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAccountBudgetProposalResult)
  })
_sym_db.RegisterMessage(MutateAccountBudgetProposalResult)


DESCRIPTOR._options = None
_GETACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['resource_name']._options = None
_MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['customer_id']._options = None
_MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['operation']._options = None

_ACCOUNTBUDGETPROPOSALSERVICE = _descriptor.ServiceDescriptor(
  name='AccountBudgetProposalService',
  full_name='google.ads.googleads.v3.services.AccountBudgetProposalService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=990,
  serialized_end=1554,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAccountBudgetProposal',
    full_name='google.ads.googleads.v3.services.AccountBudgetProposalService.GetAccountBudgetProposal',
    index=0,
    containing_service=None,
    input_type=_GETACCOUNTBUDGETPROPOSALREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_account__budget__proposal__pb2._ACCOUNTBUDGETPROPOSAL,
    serialized_options=b'\202\323\344\223\002:\0228/v3/{resource_name=customers/*/accountBudgetProposals/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAccountBudgetProposal',
    full_name='google.ads.googleads.v3.services.AccountBudgetProposalService.MutateAccountBudgetProposal',
    index=1,
    containing_service=None,
    input_type=_MUTATEACCOUNTBUDGETPROPOSALREQUEST,
    output_type=_MUTATEACCOUNTBUDGETPROPOSALRESPONSE,
    serialized_options=b'\202\323\344\223\002@\";/v3/customers/{customer_id=*}/accountBudgetProposals:mutate:\001*\332A\025customer_id,operation',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ACCOUNTBUDGETPROPOSALSERVICE)

DESCRIPTOR.services_by_name['AccountBudgetProposalService'] = _ACCOUNTBUDGETPROPOSALSERVICE

# @@protoc_insertion_point(module_scope)
