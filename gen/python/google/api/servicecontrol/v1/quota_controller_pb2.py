# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/api/servicecontrol/v1/quota_controller.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api.servicecontrol.v1 import metric_value_pb2 as google_dot_api_dot_servicecontrol_dot_v1_dot_metric__value__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/api/servicecontrol/v1/quota_controller.proto',
  package='google.api.servicecontrol.v1',
  syntax='proto3',
  serialized_options=b'\n com.google.api.servicecontrol.v1B\024QuotaControllerProtoP\001ZJgoogle.golang.org/genproto/googleapis/api/servicecontrol/v1;servicecontrol\370\001\001\252\002\036Google.Cloud.ServiceControl.V1\312\002\036Google\\Cloud\\ServiceControl\\V1\352\002!Google::Cloud::ServiceControl::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/api/servicecontrol/v1/quota_controller.proto\x12\x1cgoogle.api.servicecontrol.v1\x1a\x1cgoogle/api/annotations.proto\x1a/google/api/servicecontrol/v1/metric_value.proto\x1a\x17google/rpc/status.proto\x1a\x17google/api/client.proto\"\x91\x01\n\x14\x41llocateQuotaRequest\x12\x14\n\x0cservice_name\x18\x01 \x01(\t\x12H\n\x12\x61llocate_operation\x18\x02 \x01(\x0b\x32,.google.api.servicecontrol.v1.QuotaOperation\x12\x19\n\x11service_config_id\x18\x04 \x01(\t\"\xc6\x03\n\x0eQuotaOperation\x12\x14\n\x0coperation_id\x18\x01 \x01(\t\x12\x13\n\x0bmethod_name\x18\x02 \x01(\t\x12\x13\n\x0b\x63onsumer_id\x18\x03 \x01(\t\x12H\n\x06labels\x18\x04 \x03(\x0b\x32\x38.google.api.servicecontrol.v1.QuotaOperation.LabelsEntry\x12\x43\n\rquota_metrics\x18\x05 \x03(\x0b\x32,.google.api.servicecontrol.v1.MetricValueSet\x12J\n\nquota_mode\x18\x06 \x01(\x0e\x32\x36.google.api.servicecontrol.v1.QuotaOperation.QuotaMode\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"j\n\tQuotaMode\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\n\n\x06NORMAL\x10\x01\x12\x0f\n\x0b\x42\x45ST_EFFORT\x10\x02\x12\x0e\n\nCHECK_ONLY\x10\x03\x12\x0e\n\nQUERY_ONLY\x10\x04\x12\x0f\n\x0b\x41\x44JUST_ONLY\x10\x05\"\xd0\x01\n\x15\x41llocateQuotaResponse\x12\x14\n\x0coperation_id\x18\x01 \x01(\t\x12\x41\n\x0f\x61llocate_errors\x18\x02 \x03(\x0b\x32(.google.api.servicecontrol.v1.QuotaError\x12\x43\n\rquota_metrics\x18\x03 \x03(\x0b\x32,.google.api.servicecontrol.v1.MetricValueSet\x12\x19\n\x11service_config_id\x18\x04 \x01(\t\"\x9c\x02\n\nQuotaError\x12;\n\x04\x63ode\x18\x01 \x01(\x0e\x32-.google.api.servicecontrol.v1.QuotaError.Code\x12\x0f\n\x07subject\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\"\n\x06status\x18\x04 \x01(\x0b\x32\x12.google.rpc.Status\"\x86\x01\n\x04\x43ode\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x16\n\x12RESOURCE_EXHAUSTED\x10\x08\x12\x16\n\x12\x42ILLING_NOT_ACTIVE\x10k\x12\x13\n\x0fPROJECT_DELETED\x10l\x12\x13\n\x0f\x41PI_KEY_INVALID\x10i\x12\x13\n\x0f\x41PI_KEY_EXPIRED\x10p2\xc5\x02\n\x0fQuotaController\x12\xae\x01\n\rAllocateQuota\x12\x32.google.api.servicecontrol.v1.AllocateQuotaRequest\x1a\x33.google.api.servicecontrol.v1.AllocateQuotaResponse\"4\x82\xd3\xe4\x93\x02.\")/v1/services/{service_name}:allocateQuota:\x01*\x1a\x80\x01\xca\x41\x1dservicecontrol.googleapis.com\xd2\x41]https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/servicecontrolB\xef\x01\n com.google.api.servicecontrol.v1B\x14QuotaControllerProtoP\x01ZJgoogle.golang.org/genproto/googleapis/api/servicecontrol/v1;servicecontrol\xf8\x01\x01\xaa\x02\x1eGoogle.Cloud.ServiceControl.V1\xca\x02\x1eGoogle\\Cloud\\ServiceControl\\V1\xea\x02!Google::Cloud::ServiceControl::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_servicecontrol_dot_v1_dot_metric__value__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])



_QUOTAOPERATION_QUOTAMODE = _descriptor.EnumDescriptor(
  name='QuotaMode',
  full_name='google.api.servicecontrol.v1.QuotaOperation.QuotaMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NORMAL', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BEST_EFFORT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CHECK_ONLY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='QUERY_ONLY', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADJUST_ONLY', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=711,
  serialized_end=817,
)
_sym_db.RegisterEnumDescriptor(_QUOTAOPERATION_QUOTAMODE)

_QUOTAERROR_CODE = _descriptor.EnumDescriptor(
  name='Code',
  full_name='google.api.servicecontrol.v1.QuotaError.Code',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESOURCE_EXHAUSTED', index=1, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BILLING_NOT_ACTIVE', index=2, number=107,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROJECT_DELETED', index=3, number=108,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='API_KEY_INVALID', index=4, number=105,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='API_KEY_EXPIRED', index=5, number=112,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1181,
  serialized_end=1315,
)
_sym_db.RegisterEnumDescriptor(_QUOTAERROR_CODE)


_ALLOCATEQUOTAREQUEST = _descriptor.Descriptor(
  name='AllocateQuotaRequest',
  full_name='google.api.servicecontrol.v1.AllocateQuotaRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='service_name', full_name='google.api.servicecontrol.v1.AllocateQuotaRequest.service_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allocate_operation', full_name='google.api.servicecontrol.v1.AllocateQuotaRequest.allocate_operation', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_config_id', full_name='google.api.servicecontrol.v1.AllocateQuotaRequest.service_config_id', index=2,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_start=215,
  serialized_end=360,
)


_QUOTAOPERATION_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.api.servicecontrol.v1.QuotaOperation.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.api.servicecontrol.v1.QuotaOperation.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.api.servicecontrol.v1.QuotaOperation.LabelsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=664,
  serialized_end=709,
)

_QUOTAOPERATION = _descriptor.Descriptor(
  name='QuotaOperation',
  full_name='google.api.servicecontrol.v1.QuotaOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operation_id', full_name='google.api.servicecontrol.v1.QuotaOperation.operation_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='method_name', full_name='google.api.servicecontrol.v1.QuotaOperation.method_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='consumer_id', full_name='google.api.servicecontrol.v1.QuotaOperation.consumer_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.api.servicecontrol.v1.QuotaOperation.labels', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota_metrics', full_name='google.api.servicecontrol.v1.QuotaOperation.quota_metrics', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota_mode', full_name='google.api.servicecontrol.v1.QuotaOperation.quota_mode', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_QUOTAOPERATION_LABELSENTRY, ],
  enum_types=[
    _QUOTAOPERATION_QUOTAMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=363,
  serialized_end=817,
)


_ALLOCATEQUOTARESPONSE = _descriptor.Descriptor(
  name='AllocateQuotaResponse',
  full_name='google.api.servicecontrol.v1.AllocateQuotaResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operation_id', full_name='google.api.servicecontrol.v1.AllocateQuotaResponse.operation_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allocate_errors', full_name='google.api.servicecontrol.v1.AllocateQuotaResponse.allocate_errors', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota_metrics', full_name='google.api.servicecontrol.v1.AllocateQuotaResponse.quota_metrics', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_config_id', full_name='google.api.servicecontrol.v1.AllocateQuotaResponse.service_config_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_start=820,
  serialized_end=1028,
)


_QUOTAERROR = _descriptor.Descriptor(
  name='QuotaError',
  full_name='google.api.servicecontrol.v1.QuotaError',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='google.api.servicecontrol.v1.QuotaError.code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='subject', full_name='google.api.servicecontrol.v1.QuotaError.subject', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.api.servicecontrol.v1.QuotaError.description', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.api.servicecontrol.v1.QuotaError.status', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _QUOTAERROR_CODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1031,
  serialized_end=1315,
)

_ALLOCATEQUOTAREQUEST.fields_by_name['allocate_operation'].message_type = _QUOTAOPERATION
_QUOTAOPERATION_LABELSENTRY.containing_type = _QUOTAOPERATION
_QUOTAOPERATION.fields_by_name['labels'].message_type = _QUOTAOPERATION_LABELSENTRY
_QUOTAOPERATION.fields_by_name['quota_metrics'].message_type = google_dot_api_dot_servicecontrol_dot_v1_dot_metric__value__pb2._METRICVALUESET
_QUOTAOPERATION.fields_by_name['quota_mode'].enum_type = _QUOTAOPERATION_QUOTAMODE
_QUOTAOPERATION_QUOTAMODE.containing_type = _QUOTAOPERATION
_ALLOCATEQUOTARESPONSE.fields_by_name['allocate_errors'].message_type = _QUOTAERROR
_ALLOCATEQUOTARESPONSE.fields_by_name['quota_metrics'].message_type = google_dot_api_dot_servicecontrol_dot_v1_dot_metric__value__pb2._METRICVALUESET
_QUOTAERROR.fields_by_name['code'].enum_type = _QUOTAERROR_CODE
_QUOTAERROR.fields_by_name['status'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_QUOTAERROR_CODE.containing_type = _QUOTAERROR
DESCRIPTOR.message_types_by_name['AllocateQuotaRequest'] = _ALLOCATEQUOTAREQUEST
DESCRIPTOR.message_types_by_name['QuotaOperation'] = _QUOTAOPERATION
DESCRIPTOR.message_types_by_name['AllocateQuotaResponse'] = _ALLOCATEQUOTARESPONSE
DESCRIPTOR.message_types_by_name['QuotaError'] = _QUOTAERROR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AllocateQuotaRequest = _reflection.GeneratedProtocolMessageType('AllocateQuotaRequest', (_message.Message,), {
  'DESCRIPTOR' : _ALLOCATEQUOTAREQUEST,
  '__module__' : 'google.api.servicecontrol.v1.quota_controller_pb2'
  # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.AllocateQuotaRequest)
  })
_sym_db.RegisterMessage(AllocateQuotaRequest)

QuotaOperation = _reflection.GeneratedProtocolMessageType('QuotaOperation', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _QUOTAOPERATION_LABELSENTRY,
    '__module__' : 'google.api.servicecontrol.v1.quota_controller_pb2'
    # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.QuotaOperation.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _QUOTAOPERATION,
  '__module__' : 'google.api.servicecontrol.v1.quota_controller_pb2'
  # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.QuotaOperation)
  })
_sym_db.RegisterMessage(QuotaOperation)
_sym_db.RegisterMessage(QuotaOperation.LabelsEntry)

AllocateQuotaResponse = _reflection.GeneratedProtocolMessageType('AllocateQuotaResponse', (_message.Message,), {
  'DESCRIPTOR' : _ALLOCATEQUOTARESPONSE,
  '__module__' : 'google.api.servicecontrol.v1.quota_controller_pb2'
  # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.AllocateQuotaResponse)
  })
_sym_db.RegisterMessage(AllocateQuotaResponse)

QuotaError = _reflection.GeneratedProtocolMessageType('QuotaError', (_message.Message,), {
  'DESCRIPTOR' : _QUOTAERROR,
  '__module__' : 'google.api.servicecontrol.v1.quota_controller_pb2'
  # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.QuotaError)
  })
_sym_db.RegisterMessage(QuotaError)


DESCRIPTOR._options = None
_QUOTAOPERATION_LABELSENTRY._options = None

_QUOTACONTROLLER = _descriptor.ServiceDescriptor(
  name='QuotaController',
  full_name='google.api.servicecontrol.v1.QuotaController',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\035servicecontrol.googleapis.com\322A]https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/servicecontrol',
  create_key=_descriptor._internal_create_key,
  serialized_start=1318,
  serialized_end=1643,
  methods=[
  _descriptor.MethodDescriptor(
    name='AllocateQuota',
    full_name='google.api.servicecontrol.v1.QuotaController.AllocateQuota',
    index=0,
    containing_service=None,
    input_type=_ALLOCATEQUOTAREQUEST,
    output_type=_ALLOCATEQUOTARESPONSE,
    serialized_options=b'\202\323\344\223\002.\")/v1/services/{service_name}:allocateQuota:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_QUOTACONTROLLER)

DESCRIPTOR.services_by_name['QuotaController'] = _QUOTACONTROLLER

# @@protoc_insertion_point(module_scope)
