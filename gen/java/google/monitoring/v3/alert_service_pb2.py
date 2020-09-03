# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/v3/alert_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.monitoring.v3 import alert_pb2 as google_dot_monitoring_dot_v3_dot_alert__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/monitoring/v3/alert_service.proto',
  package='google.monitoring.v3',
  syntax='proto3',
  serialized_options=b'\n\030com.google.monitoring.v3B\021AlertServiceProtoP\001Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\252\002\032Google.Cloud.Monitoring.V3\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Google::Cloud::Monitoring::V3',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(google/monitoring/v3/alert_service.proto\x12\x14google.monitoring.v3\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/monitoring/v3/alert.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\x95\x01\n\x18\x43reateAlertPolicyRequest\x12;\n\x04name\x18\x03 \x01(\tB-\xe0\x41\x02\xfa\x41\'\x12%monitoring.googleapis.com/AlertPolicy\x12<\n\x0c\x61lert_policy\x18\x02 \x01(\x0b\x32!.google.monitoring.v3.AlertPolicyB\x03\xe0\x41\x02\"T\n\x15GetAlertPolicyRequest\x12;\n\x04name\x18\x03 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%monitoring.googleapis.com/AlertPolicy\"\xa0\x01\n\x18ListAlertPoliciesRequest\x12;\n\x04name\x18\x04 \x01(\tB-\xe0\x41\x02\xfa\x41\'\x12%monitoring.googleapis.com/AlertPolicy\x12\x0e\n\x06\x66ilter\x18\x05 \x01(\t\x12\x10\n\x08order_by\x18\x06 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"o\n\x19ListAlertPoliciesResponse\x12\x39\n\x0e\x61lert_policies\x18\x03 \x03(\x0b\x32!.google.monitoring.v3.AlertPolicy\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x89\x01\n\x18UpdateAlertPolicyRequest\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12<\n\x0c\x61lert_policy\x18\x03 \x01(\x0b\x32!.google.monitoring.v3.AlertPolicyB\x03\xe0\x41\x02\"W\n\x18\x44\x65leteAlertPolicyRequest\x12;\n\x04name\x18\x03 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%monitoring.googleapis.com/AlertPolicy2\x9e\x08\n\x12\x41lertPolicyService\x12\xa8\x01\n\x11ListAlertPolicies\x12..google.monitoring.v3.ListAlertPoliciesRequest\x1a/.google.monitoring.v3.ListAlertPoliciesResponse\"2\x82\xd3\xe4\x93\x02%\x12#/v3/{name=projects/*}/alertPolicies\xda\x41\x04name\x12\x96\x01\n\x0eGetAlertPolicy\x12+.google.monitoring.v3.GetAlertPolicyRequest\x1a!.google.monitoring.v3.AlertPolicy\"4\x82\xd3\xe4\x93\x02\'\x12%/v3/{name=projects/*/alertPolicies/*}\xda\x41\x04name\x12\xb5\x01\n\x11\x43reateAlertPolicy\x12..google.monitoring.v3.CreateAlertPolicyRequest\x1a!.google.monitoring.v3.AlertPolicy\"M\x82\xd3\xe4\x93\x02\x33\"#/v3/{name=projects/*}/alertPolicies:\x0c\x61lert_policy\xda\x41\x11name,alert_policy\x12\x91\x01\n\x11\x44\x65leteAlertPolicy\x12..google.monitoring.v3.DeleteAlertPolicyRequest\x1a\x16.google.protobuf.Empty\"4\x82\xd3\xe4\x93\x02\'*%/v3/{name=projects/*/alertPolicies/*}\xda\x41\x04name\x12\xcb\x01\n\x11UpdateAlertPolicy\x12..google.monitoring.v3.UpdateAlertPolicyRequest\x1a!.google.monitoring.v3.AlertPolicy\"c\x82\xd3\xe4\x93\x02\x42\x32\x32/v3/{alert_policy.name=projects/*/alertPolicies/*}:\x0c\x61lert_policy\xda\x41\x18update_mask,alert_policy\x1a\xa9\x01\xca\x41\x19monitoring.googleapis.com\xd2\x41\x89\x01https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https://www.googleapis.com/auth/monitoring.readB\xc9\x01\n\x18\x63om.google.monitoring.v3B\x11\x41lertServiceProtoP\x01Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\xaa\x02\x1aGoogle.Cloud.Monitoring.V3\xca\x02\x1aGoogle\\Cloud\\Monitoring\\V3\xea\x02\x1dGoogle::Cloud::Monitoring::V3b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_monitoring_dot_v3_dot_alert__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,])




_CREATEALERTPOLICYREQUEST = _descriptor.Descriptor(
  name='CreateAlertPolicyRequest',
  full_name='google.monitoring.v3.CreateAlertPolicyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.v3.CreateAlertPolicyRequest.name', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\'\022%monitoring.googleapis.com/AlertPolicy', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='alert_policy', full_name='google.monitoring.v3.CreateAlertPolicyRequest.alert_policy', index=1,
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
  serialized_start=279,
  serialized_end=428,
)


_GETALERTPOLICYREQUEST = _descriptor.Descriptor(
  name='GetAlertPolicyRequest',
  full_name='google.monitoring.v3.GetAlertPolicyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.v3.GetAlertPolicyRequest.name', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\'\n%monitoring.googleapis.com/AlertPolicy', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=514,
)


_LISTALERTPOLICIESREQUEST = _descriptor.Descriptor(
  name='ListAlertPoliciesRequest',
  full_name='google.monitoring.v3.ListAlertPoliciesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.v3.ListAlertPoliciesRequest.name', index=0,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\'\022%monitoring.googleapis.com/AlertPolicy', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.monitoring.v3.ListAlertPoliciesRequest.filter', index=1,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='order_by', full_name='google.monitoring.v3.ListAlertPoliciesRequest.order_by', index=2,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.monitoring.v3.ListAlertPoliciesRequest.page_size', index=3,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.monitoring.v3.ListAlertPoliciesRequest.page_token', index=4,
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
  ],
  serialized_start=517,
  serialized_end=677,
)


_LISTALERTPOLICIESRESPONSE = _descriptor.Descriptor(
  name='ListAlertPoliciesResponse',
  full_name='google.monitoring.v3.ListAlertPoliciesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='alert_policies', full_name='google.monitoring.v3.ListAlertPoliciesResponse.alert_policies', index=0,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.monitoring.v3.ListAlertPoliciesResponse.next_page_token', index=1,
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
  ],
  serialized_start=679,
  serialized_end=790,
)


_UPDATEALERTPOLICYREQUEST = _descriptor.Descriptor(
  name='UpdateAlertPolicyRequest',
  full_name='google.monitoring.v3.UpdateAlertPolicyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.monitoring.v3.UpdateAlertPolicyRequest.update_mask', index=0,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='alert_policy', full_name='google.monitoring.v3.UpdateAlertPolicyRequest.alert_policy', index=1,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=793,
  serialized_end=930,
)


_DELETEALERTPOLICYREQUEST = _descriptor.Descriptor(
  name='DeleteAlertPolicyRequest',
  full_name='google.monitoring.v3.DeleteAlertPolicyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.v3.DeleteAlertPolicyRequest.name', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\'\n%monitoring.googleapis.com/AlertPolicy', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=932,
  serialized_end=1019,
)

_CREATEALERTPOLICYREQUEST.fields_by_name['alert_policy'].message_type = google_dot_monitoring_dot_v3_dot_alert__pb2._ALERTPOLICY
_LISTALERTPOLICIESRESPONSE.fields_by_name['alert_policies'].message_type = google_dot_monitoring_dot_v3_dot_alert__pb2._ALERTPOLICY
_UPDATEALERTPOLICYREQUEST.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_UPDATEALERTPOLICYREQUEST.fields_by_name['alert_policy'].message_type = google_dot_monitoring_dot_v3_dot_alert__pb2._ALERTPOLICY
DESCRIPTOR.message_types_by_name['CreateAlertPolicyRequest'] = _CREATEALERTPOLICYREQUEST
DESCRIPTOR.message_types_by_name['GetAlertPolicyRequest'] = _GETALERTPOLICYREQUEST
DESCRIPTOR.message_types_by_name['ListAlertPoliciesRequest'] = _LISTALERTPOLICIESREQUEST
DESCRIPTOR.message_types_by_name['ListAlertPoliciesResponse'] = _LISTALERTPOLICIESRESPONSE
DESCRIPTOR.message_types_by_name['UpdateAlertPolicyRequest'] = _UPDATEALERTPOLICYREQUEST
DESCRIPTOR.message_types_by_name['DeleteAlertPolicyRequest'] = _DELETEALERTPOLICYREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CreateAlertPolicyRequest = _reflection.GeneratedProtocolMessageType('CreateAlertPolicyRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEALERTPOLICYREQUEST,
  '__module__' : 'google.monitoring.v3.alert_service_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateAlertPolicyRequest)
  })
_sym_db.RegisterMessage(CreateAlertPolicyRequest)

GetAlertPolicyRequest = _reflection.GeneratedProtocolMessageType('GetAlertPolicyRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETALERTPOLICYREQUEST,
  '__module__' : 'google.monitoring.v3.alert_service_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.GetAlertPolicyRequest)
  })
_sym_db.RegisterMessage(GetAlertPolicyRequest)

ListAlertPoliciesRequest = _reflection.GeneratedProtocolMessageType('ListAlertPoliciesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTALERTPOLICIESREQUEST,
  '__module__' : 'google.monitoring.v3.alert_service_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.ListAlertPoliciesRequest)
  })
_sym_db.RegisterMessage(ListAlertPoliciesRequest)

ListAlertPoliciesResponse = _reflection.GeneratedProtocolMessageType('ListAlertPoliciesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTALERTPOLICIESRESPONSE,
  '__module__' : 'google.monitoring.v3.alert_service_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.ListAlertPoliciesResponse)
  })
_sym_db.RegisterMessage(ListAlertPoliciesResponse)

UpdateAlertPolicyRequest = _reflection.GeneratedProtocolMessageType('UpdateAlertPolicyRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEALERTPOLICYREQUEST,
  '__module__' : 'google.monitoring.v3.alert_service_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.UpdateAlertPolicyRequest)
  })
_sym_db.RegisterMessage(UpdateAlertPolicyRequest)

DeleteAlertPolicyRequest = _reflection.GeneratedProtocolMessageType('DeleteAlertPolicyRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEALERTPOLICYREQUEST,
  '__module__' : 'google.monitoring.v3.alert_service_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.v3.DeleteAlertPolicyRequest)
  })
_sym_db.RegisterMessage(DeleteAlertPolicyRequest)


DESCRIPTOR._options = None
_CREATEALERTPOLICYREQUEST.fields_by_name['name']._options = None
_CREATEALERTPOLICYREQUEST.fields_by_name['alert_policy']._options = None
_GETALERTPOLICYREQUEST.fields_by_name['name']._options = None
_LISTALERTPOLICIESREQUEST.fields_by_name['name']._options = None
_UPDATEALERTPOLICYREQUEST.fields_by_name['alert_policy']._options = None
_DELETEALERTPOLICYREQUEST.fields_by_name['name']._options = None

_ALERTPOLICYSERVICE = _descriptor.ServiceDescriptor(
  name='AlertPolicyService',
  full_name='google.monitoring.v3.AlertPolicyService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\031monitoring.googleapis.com\322A\211\001https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https://www.googleapis.com/auth/monitoring.read',
  create_key=_descriptor._internal_create_key,
  serialized_start=1022,
  serialized_end=2076,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListAlertPolicies',
    full_name='google.monitoring.v3.AlertPolicyService.ListAlertPolicies',
    index=0,
    containing_service=None,
    input_type=_LISTALERTPOLICIESREQUEST,
    output_type=_LISTALERTPOLICIESRESPONSE,
    serialized_options=b'\202\323\344\223\002%\022#/v3/{name=projects/*}/alertPolicies\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetAlertPolicy',
    full_name='google.monitoring.v3.AlertPolicyService.GetAlertPolicy',
    index=1,
    containing_service=None,
    input_type=_GETALERTPOLICYREQUEST,
    output_type=google_dot_monitoring_dot_v3_dot_alert__pb2._ALERTPOLICY,
    serialized_options=b'\202\323\344\223\002\'\022%/v3/{name=projects/*/alertPolicies/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateAlertPolicy',
    full_name='google.monitoring.v3.AlertPolicyService.CreateAlertPolicy',
    index=2,
    containing_service=None,
    input_type=_CREATEALERTPOLICYREQUEST,
    output_type=google_dot_monitoring_dot_v3_dot_alert__pb2._ALERTPOLICY,
    serialized_options=b'\202\323\344\223\0023\"#/v3/{name=projects/*}/alertPolicies:\014alert_policy\332A\021name,alert_policy',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteAlertPolicy',
    full_name='google.monitoring.v3.AlertPolicyService.DeleteAlertPolicy',
    index=3,
    containing_service=None,
    input_type=_DELETEALERTPOLICYREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002\'*%/v3/{name=projects/*/alertPolicies/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateAlertPolicy',
    full_name='google.monitoring.v3.AlertPolicyService.UpdateAlertPolicy',
    index=4,
    containing_service=None,
    input_type=_UPDATEALERTPOLICYREQUEST,
    output_type=google_dot_monitoring_dot_v3_dot_alert__pb2._ALERTPOLICY,
    serialized_options=b'\202\323\344\223\002B22/v3/{alert_policy.name=projects/*/alertPolicies/*}:\014alert_policy\332A\030update_mask,alert_policy',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ALERTPOLICYSERVICE)

DESCRIPTOR.services_by_name['AlertPolicyService'] = _ALERTPOLICYSERVICE

# @@protoc_insertion_point(module_scope)
