# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/v1alpha/config_common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/osconfig/v1alpha/config_common.proto',
  package='google.cloud.osconfig.v1alpha',
  syntax='proto3',
  serialized_options=b'\n!com.google.cloud.osconfig.v1alphaB\021ConfigCommonProtoP\001ZEgoogle.golang.org/genproto/googleapis/cloud/osconfig/v1alpha;osconfig\252\002\035Google.Cloud.OsConfig.V1Alpha\312\002\035Google\\Cloud\\OsConfig\\V1alpha\352\002 Google::Cloud::OsConfig::V1alpha',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/cloud/osconfig/v1alpha/config_common.proto\x12\x1dgoogle.cloud.osconfig.v1alpha\"\xa5\x03\n\x1aOSPolicyResourceConfigStep\x12L\n\x04type\x18\x01 \x01(\x0e\x32>.google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.Type\x12R\n\x07outcome\x18\x02 \x01(\x0e\x32\x41.google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.Outcome\x12\x15\n\rerror_message\x18\x03 \x01(\t\"\x8e\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nVALIDATION\x10\x01\x12\x17\n\x13\x44\x45SIRED_STATE_CHECK\x10\x02\x12\x1d\n\x19\x44\x45SIRED_STATE_ENFORCEMENT\x10\x03\x12(\n$DESIRED_STATE_CHECK_POST_ENFORCEMENT\x10\x04\"=\n\x07Outcome\x12\x17\n\x13OUTCOME_UNSPECIFIED\x10\x00\x12\r\n\tSUCCEEDED\x10\x01\x12\n\n\x06\x46\x41ILED\x10\x02\"\xfd\x02\n\x1aOSPolicyResourceCompliance\x12\x1d\n\x15os_policy_resource_id\x18\x01 \x01(\t\x12O\n\x0c\x63onfig_steps\x18\x02 \x03(\x0b\x32\x39.google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep\x12\x45\n\x05state\x18\x03 \x01(\x0e\x32\x36.google.cloud.osconfig.v1alpha.OSPolicyComplianceState\x12l\n\x14\x65xec_resource_output\x18\x04 \x01(\x0b\x32L.google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.ExecResourceOutputH\x00\x1a\x30\n\x12\x45xecResourceOutput\x12\x1a\n\x12\x65nforcement_output\x18\x02 \x01(\x0c\x42\x08\n\x06output*\x93\x01\n\x17OSPolicyComplianceState\x12*\n&OS_POLICY_COMPLIANCE_STATE_UNSPECIFIED\x10\x00\x12\r\n\tCOMPLIANT\x10\x01\x12\x11\n\rNON_COMPLIANT\x10\x02\x12\x0b\n\x07UNKNOWN\x10\x03\x12\x1d\n\x19NO_OS_POLICIES_APPLICABLE\x10\x04\x42\xe2\x01\n!com.google.cloud.osconfig.v1alphaB\x11\x43onfigCommonProtoP\x01ZEgoogle.golang.org/genproto/googleapis/cloud/osconfig/v1alpha;osconfig\xaa\x02\x1dGoogle.Cloud.OsConfig.V1Alpha\xca\x02\x1dGoogle\\Cloud\\OsConfig\\V1alpha\xea\x02 Google::Cloud::OsConfig::V1alphab\x06proto3'
)

_OSPOLICYCOMPLIANCESTATE = _descriptor.EnumDescriptor(
  name='OSPolicyComplianceState',
  full_name='google.cloud.osconfig.v1alpha.OSPolicyComplianceState',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='OS_POLICY_COMPLIANCE_STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMPLIANT', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NON_COMPLIANT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NO_OS_POLICIES_APPLICABLE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=893,
  serialized_end=1040,
)
_sym_db.RegisterEnumDescriptor(_OSPOLICYCOMPLIANCESTATE)

OSPolicyComplianceState = enum_type_wrapper.EnumTypeWrapper(_OSPOLICYCOMPLIANCESTATE)
OS_POLICY_COMPLIANCE_STATE_UNSPECIFIED = 0
COMPLIANT = 1
NON_COMPLIANT = 2
UNKNOWN = 3
NO_OS_POLICIES_APPLICABLE = 4


_OSPOLICYRESOURCECONFIGSTEP_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.Type',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VALIDATION', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESIRED_STATE_CHECK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESIRED_STATE_ENFORCEMENT', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESIRED_STATE_CHECK_POST_ENFORCEMENT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=301,
  serialized_end=443,
)
_sym_db.RegisterEnumDescriptor(_OSPOLICYRESOURCECONFIGSTEP_TYPE)

_OSPOLICYRESOURCECONFIGSTEP_OUTCOME = _descriptor.EnumDescriptor(
  name='Outcome',
  full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.Outcome',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='OUTCOME_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SUCCEEDED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FAILED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=445,
  serialized_end=506,
)
_sym_db.RegisterEnumDescriptor(_OSPOLICYRESOURCECONFIGSTEP_OUTCOME)


_OSPOLICYRESOURCECONFIGSTEP = _descriptor.Descriptor(
  name='OSPolicyResourceConfigStep',
  full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='outcome', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.outcome', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='error_message', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.error_message', index=2,
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
    _OSPOLICYRESOURCECONFIGSTEP_TYPE,
    _OSPOLICYRESOURCECONFIGSTEP_OUTCOME,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=85,
  serialized_end=506,
)


_OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT = _descriptor.Descriptor(
  name='ExecResourceOutput',
  full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.ExecResourceOutput',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='enforcement_output', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.ExecResourceOutput.enforcement_output', index=0,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
  serialized_start=832,
  serialized_end=880,
)

_OSPOLICYRESOURCECOMPLIANCE = _descriptor.Descriptor(
  name='OSPolicyResourceCompliance',
  full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='os_policy_resource_id', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.os_policy_resource_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='config_steps', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.config_steps', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.state', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exec_resource_output', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.exec_resource_output', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='output', full_name='google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.output',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=509,
  serialized_end=890,
)

_OSPOLICYRESOURCECONFIGSTEP.fields_by_name['type'].enum_type = _OSPOLICYRESOURCECONFIGSTEP_TYPE
_OSPOLICYRESOURCECONFIGSTEP.fields_by_name['outcome'].enum_type = _OSPOLICYRESOURCECONFIGSTEP_OUTCOME
_OSPOLICYRESOURCECONFIGSTEP_TYPE.containing_type = _OSPOLICYRESOURCECONFIGSTEP
_OSPOLICYRESOURCECONFIGSTEP_OUTCOME.containing_type = _OSPOLICYRESOURCECONFIGSTEP
_OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT.containing_type = _OSPOLICYRESOURCECOMPLIANCE
_OSPOLICYRESOURCECOMPLIANCE.fields_by_name['config_steps'].message_type = _OSPOLICYRESOURCECONFIGSTEP
_OSPOLICYRESOURCECOMPLIANCE.fields_by_name['state'].enum_type = _OSPOLICYCOMPLIANCESTATE
_OSPOLICYRESOURCECOMPLIANCE.fields_by_name['exec_resource_output'].message_type = _OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT
_OSPOLICYRESOURCECOMPLIANCE.oneofs_by_name['output'].fields.append(
  _OSPOLICYRESOURCECOMPLIANCE.fields_by_name['exec_resource_output'])
_OSPOLICYRESOURCECOMPLIANCE.fields_by_name['exec_resource_output'].containing_oneof = _OSPOLICYRESOURCECOMPLIANCE.oneofs_by_name['output']
DESCRIPTOR.message_types_by_name['OSPolicyResourceConfigStep'] = _OSPOLICYRESOURCECONFIGSTEP
DESCRIPTOR.message_types_by_name['OSPolicyResourceCompliance'] = _OSPOLICYRESOURCECOMPLIANCE
DESCRIPTOR.enum_types_by_name['OSPolicyComplianceState'] = _OSPOLICYCOMPLIANCESTATE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OSPolicyResourceConfigStep = _reflection.GeneratedProtocolMessageType('OSPolicyResourceConfigStep', (_message.Message,), {
  'DESCRIPTOR' : _OSPOLICYRESOURCECONFIGSTEP,
  '__module__' : 'google.cloud.osconfig.v1alpha.config_common_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep)
  })
_sym_db.RegisterMessage(OSPolicyResourceConfigStep)

OSPolicyResourceCompliance = _reflection.GeneratedProtocolMessageType('OSPolicyResourceCompliance', (_message.Message,), {

  'ExecResourceOutput' : _reflection.GeneratedProtocolMessageType('ExecResourceOutput', (_message.Message,), {
    'DESCRIPTOR' : _OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT,
    '__module__' : 'google.cloud.osconfig.v1alpha.config_common_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.ExecResourceOutput)
    })
  ,
  'DESCRIPTOR' : _OSPOLICYRESOURCECOMPLIANCE,
  '__module__' : 'google.cloud.osconfig.v1alpha.config_common_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance)
  })
_sym_db.RegisterMessage(OSPolicyResourceCompliance)
_sym_db.RegisterMessage(OSPolicyResourceCompliance.ExecResourceOutput)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)