# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/workflows/v1beta/workflows.proto
"""Generated protocol buffer code."""
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
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/workflows/v1beta/workflows.proto',
  package='google.cloud.workflows.v1beta',
  syntax='proto3',
  serialized_options=b'\n!com.google.cloud.workflows.v1betaB\016WorkflowsProtoP\001ZFgoogle.golang.org/genproto/googleapis/cloud/workflows/v1beta;workflows',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-google/cloud/workflows/v1beta/workflows.proto\x12\x1dgoogle.cloud.workflows.v1beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xfe\x04\n\x08Workflow\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x41\n\x05state\x18\x03 \x01(\x0e\x32-.google.cloud.workflows.v1beta.Workflow.StateB\x03\xe0\x41\x03\x12\x18\n\x0brevision_id\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12=\n\x14revision_create_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x43\n\x06labels\x18\x08 \x03(\x0b\x32\x33.google.cloud.workflows.v1beta.Workflow.LabelsEntry\x12\x17\n\x0fservice_account\x18\t \x01(\t\x12\x19\n\x0fsource_contents\x18\n \x01(\tH\x00\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"*\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01:d\xea\x41\x61\n!workflows.googleapis.com/Workflow\x12<projects/{project}/locations/{location}/workflows/{workflow}B\r\n\x0bsource_code\"\x9a\x01\n\x14ListWorkflowsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x81\x01\n\x15ListWorkflowsResponse\x12:\n\tworkflows\x18\x01 \x03(\x0b\x32\'.google.cloud.workflows.v1beta.Workflow\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"M\n\x12GetWorkflowRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!workflows.googleapis.com/Workflow\"\xac\x01\n\x15\x43reateWorkflowRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12>\n\x08workflow\x18\x02 \x01(\x0b\x32\'.google.cloud.workflows.v1beta.WorkflowB\x03\xe0\x41\x02\x12\x18\n\x0bworkflow_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"P\n\x15\x44\x65leteWorkflowRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!workflows.googleapis.com/Workflow\"\x88\x01\n\x15UpdateWorkflowRequest\x12>\n\x08workflow\x18\x01 \x01(\x0b\x32\'.google.cloud.workflows.v1beta.WorkflowB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xa5\x01\n\x11OperationMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06target\x18\x03 \x01(\t\x12\x0c\n\x04verb\x18\x04 \x01(\t\x12\x13\n\x0b\x61pi_version\x18\x05 \x01(\t2\xf9\x08\n\tWorkflows\x12\xbe\x01\n\rListWorkflows\x12\x33.google.cloud.workflows.v1beta.ListWorkflowsRequest\x1a\x34.google.cloud.workflows.v1beta.ListWorkflowsResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1beta/{parent=projects/*/locations/*}/workflows\xda\x41\x06parent\x12\xab\x01\n\x0bGetWorkflow\x12\x31.google.cloud.workflows.v1beta.GetWorkflowRequest\x1a\'.google.cloud.workflows.v1beta.Workflow\"@\x82\xd3\xe4\x93\x02\x33\x12\x31/v1beta/{name=projects/*/locations/*/workflows/*}\xda\x41\x04name\x12\xe9\x01\n\x0e\x43reateWorkflow\x12\x34.google.cloud.workflows.v1beta.CreateWorkflowRequest\x1a\x1d.google.longrunning.Operation\"\x81\x01\x82\xd3\xe4\x93\x02=\"1/v1beta/{parent=projects/*/locations/*}/workflows:\x08workflow\xda\x41\x1bparent,workflow,workflow_id\xca\x41\x1d\n\x08Workflow\x12\x11OperationMetadata\x12\xd4\x01\n\x0e\x44\x65leteWorkflow\x12\x34.google.cloud.workflows.v1beta.DeleteWorkflowRequest\x1a\x1d.google.longrunning.Operation\"m\x82\xd3\xe4\x93\x02\x33*1/v1beta/{name=projects/*/locations/*/workflows/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xeb\x01\n\x0eUpdateWorkflow\x12\x34.google.cloud.workflows.v1beta.UpdateWorkflowRequest\x1a\x1d.google.longrunning.Operation\"\x83\x01\x82\xd3\xe4\x93\x02\x46\x32:/v1beta/{workflow.name=projects/*/locations/*/workflows/*}:\x08workflow\xda\x41\x14workflow,update_mask\xca\x41\x1d\n\x08Workflow\x12\x11OperationMetadata\x1aL\xca\x41\x18workflows.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB}\n!com.google.cloud.workflows.v1betaB\x0eWorkflowsProtoP\x01ZFgoogle.golang.org/genproto/googleapis/cloud/workflows/v1beta;workflowsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])



_WORKFLOW_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.workflows.v1beta.Workflow.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACTIVE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=779,
  serialized_end=821,
)
_sym_db.RegisterEnumDescriptor(_WORKFLOW_STATE)


_WORKFLOW_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.workflows.v1beta.Workflow.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.workflows.v1beta.Workflow.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.workflows.v1beta.Workflow.LabelsEntry.value', index=1,
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
  serialized_start=732,
  serialized_end=777,
)

_WORKFLOW = _descriptor.Descriptor(
  name='Workflow',
  full_name='google.cloud.workflows.v1beta.Workflow',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.workflows.v1beta.Workflow.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.workflows.v1beta.Workflow.description', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.workflows.v1beta.Workflow.state', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='revision_id', full_name='google.cloud.workflows.v1beta.Workflow.revision_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.workflows.v1beta.Workflow.create_time', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.workflows.v1beta.Workflow.update_time', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='revision_create_time', full_name='google.cloud.workflows.v1beta.Workflow.revision_create_time', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.workflows.v1beta.Workflow.labels', index=7,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_account', full_name='google.cloud.workflows.v1beta.Workflow.service_account', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_contents', full_name='google.cloud.workflows.v1beta.Workflow.source_contents', index=9,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_WORKFLOW_LABELSENTRY, ],
  enum_types=[
    _WORKFLOW_STATE,
  ],
  serialized_options=b'\352Aa\n!workflows.googleapis.com/Workflow\022<projects/{project}/locations/{location}/workflows/{workflow}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='source_code', full_name='google.cloud.workflows.v1beta.Workflow.source_code',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=300,
  serialized_end=938,
)


_LISTWORKFLOWSREQUEST = _descriptor.Descriptor(
  name='ListWorkflowsRequest',
  full_name='google.cloud.workflows.v1beta.ListWorkflowsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.workflows.v1beta.ListWorkflowsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!locations.googleapis.com/Location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.workflows.v1beta.ListWorkflowsRequest.page_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.workflows.v1beta.ListWorkflowsRequest.page_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.cloud.workflows.v1beta.ListWorkflowsRequest.filter', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='order_by', full_name='google.cloud.workflows.v1beta.ListWorkflowsRequest.order_by', index=4,
      number=5, type=9, cpp_type=9, label=1,
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
  serialized_start=941,
  serialized_end=1095,
)


_LISTWORKFLOWSRESPONSE = _descriptor.Descriptor(
  name='ListWorkflowsResponse',
  full_name='google.cloud.workflows.v1beta.ListWorkflowsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='workflows', full_name='google.cloud.workflows.v1beta.ListWorkflowsResponse.workflows', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.workflows.v1beta.ListWorkflowsResponse.next_page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='unreachable', full_name='google.cloud.workflows.v1beta.ListWorkflowsResponse.unreachable', index=2,
      number=3, type=9, cpp_type=9, label=3,
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
  serialized_start=1098,
  serialized_end=1227,
)


_GETWORKFLOWREQUEST = _descriptor.Descriptor(
  name='GetWorkflowRequest',
  full_name='google.cloud.workflows.v1beta.GetWorkflowRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.workflows.v1beta.GetWorkflowRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!workflows.googleapis.com/Workflow', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1229,
  serialized_end=1306,
)


_CREATEWORKFLOWREQUEST = _descriptor.Descriptor(
  name='CreateWorkflowRequest',
  full_name='google.cloud.workflows.v1beta.CreateWorkflowRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.workflows.v1beta.CreateWorkflowRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!locations.googleapis.com/Location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='workflow', full_name='google.cloud.workflows.v1beta.CreateWorkflowRequest.workflow', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='workflow_id', full_name='google.cloud.workflows.v1beta.CreateWorkflowRequest.workflow_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=1309,
  serialized_end=1481,
)


_DELETEWORKFLOWREQUEST = _descriptor.Descriptor(
  name='DeleteWorkflowRequest',
  full_name='google.cloud.workflows.v1beta.DeleteWorkflowRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.workflows.v1beta.DeleteWorkflowRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!workflows.googleapis.com/Workflow', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1483,
  serialized_end=1563,
)


_UPDATEWORKFLOWREQUEST = _descriptor.Descriptor(
  name='UpdateWorkflowRequest',
  full_name='google.cloud.workflows.v1beta.UpdateWorkflowRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='workflow', full_name='google.cloud.workflows.v1beta.UpdateWorkflowRequest.workflow', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.cloud.workflows.v1beta.UpdateWorkflowRequest.update_mask', index=1,
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
  serialized_start=1566,
  serialized_end=1702,
)


_OPERATIONMETADATA = _descriptor.Descriptor(
  name='OperationMetadata',
  full_name='google.cloud.workflows.v1beta.OperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.workflows.v1beta.OperationMetadata.create_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='google.cloud.workflows.v1beta.OperationMetadata.end_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target', full_name='google.cloud.workflows.v1beta.OperationMetadata.target', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='verb', full_name='google.cloud.workflows.v1beta.OperationMetadata.verb', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='api_version', full_name='google.cloud.workflows.v1beta.OperationMetadata.api_version', index=4,
      number=5, type=9, cpp_type=9, label=1,
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
  serialized_start=1705,
  serialized_end=1870,
)

_WORKFLOW_LABELSENTRY.containing_type = _WORKFLOW
_WORKFLOW.fields_by_name['state'].enum_type = _WORKFLOW_STATE
_WORKFLOW.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_WORKFLOW.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_WORKFLOW.fields_by_name['revision_create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_WORKFLOW.fields_by_name['labels'].message_type = _WORKFLOW_LABELSENTRY
_WORKFLOW_STATE.containing_type = _WORKFLOW
_WORKFLOW.oneofs_by_name['source_code'].fields.append(
  _WORKFLOW.fields_by_name['source_contents'])
_WORKFLOW.fields_by_name['source_contents'].containing_oneof = _WORKFLOW.oneofs_by_name['source_code']
_LISTWORKFLOWSRESPONSE.fields_by_name['workflows'].message_type = _WORKFLOW
_CREATEWORKFLOWREQUEST.fields_by_name['workflow'].message_type = _WORKFLOW
_UPDATEWORKFLOWREQUEST.fields_by_name['workflow'].message_type = _WORKFLOW
_UPDATEWORKFLOWREQUEST.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_OPERATIONMETADATA.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_OPERATIONMETADATA.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['Workflow'] = _WORKFLOW
DESCRIPTOR.message_types_by_name['ListWorkflowsRequest'] = _LISTWORKFLOWSREQUEST
DESCRIPTOR.message_types_by_name['ListWorkflowsResponse'] = _LISTWORKFLOWSRESPONSE
DESCRIPTOR.message_types_by_name['GetWorkflowRequest'] = _GETWORKFLOWREQUEST
DESCRIPTOR.message_types_by_name['CreateWorkflowRequest'] = _CREATEWORKFLOWREQUEST
DESCRIPTOR.message_types_by_name['DeleteWorkflowRequest'] = _DELETEWORKFLOWREQUEST
DESCRIPTOR.message_types_by_name['UpdateWorkflowRequest'] = _UPDATEWORKFLOWREQUEST
DESCRIPTOR.message_types_by_name['OperationMetadata'] = _OPERATIONMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Workflow = _reflection.GeneratedProtocolMessageType('Workflow', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _WORKFLOW_LABELSENTRY,
    '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.Workflow.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _WORKFLOW,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.Workflow)
  })
_sym_db.RegisterMessage(Workflow)
_sym_db.RegisterMessage(Workflow.LabelsEntry)

ListWorkflowsRequest = _reflection.GeneratedProtocolMessageType('ListWorkflowsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTWORKFLOWSREQUEST,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.ListWorkflowsRequest)
  })
_sym_db.RegisterMessage(ListWorkflowsRequest)

ListWorkflowsResponse = _reflection.GeneratedProtocolMessageType('ListWorkflowsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTWORKFLOWSRESPONSE,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.ListWorkflowsResponse)
  })
_sym_db.RegisterMessage(ListWorkflowsResponse)

GetWorkflowRequest = _reflection.GeneratedProtocolMessageType('GetWorkflowRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETWORKFLOWREQUEST,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.GetWorkflowRequest)
  })
_sym_db.RegisterMessage(GetWorkflowRequest)

CreateWorkflowRequest = _reflection.GeneratedProtocolMessageType('CreateWorkflowRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEWORKFLOWREQUEST,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.CreateWorkflowRequest)
  })
_sym_db.RegisterMessage(CreateWorkflowRequest)

DeleteWorkflowRequest = _reflection.GeneratedProtocolMessageType('DeleteWorkflowRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEWORKFLOWREQUEST,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.DeleteWorkflowRequest)
  })
_sym_db.RegisterMessage(DeleteWorkflowRequest)

UpdateWorkflowRequest = _reflection.GeneratedProtocolMessageType('UpdateWorkflowRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEWORKFLOWREQUEST,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.UpdateWorkflowRequest)
  })
_sym_db.RegisterMessage(UpdateWorkflowRequest)

OperationMetadata = _reflection.GeneratedProtocolMessageType('OperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _OPERATIONMETADATA,
  '__module__' : 'google.cloud.workflows.v1beta.workflows_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.workflows.v1beta.OperationMetadata)
  })
_sym_db.RegisterMessage(OperationMetadata)


DESCRIPTOR._options = None
_WORKFLOW_LABELSENTRY._options = None
_WORKFLOW.fields_by_name['state']._options = None
_WORKFLOW.fields_by_name['revision_id']._options = None
_WORKFLOW.fields_by_name['create_time']._options = None
_WORKFLOW.fields_by_name['update_time']._options = None
_WORKFLOW.fields_by_name['revision_create_time']._options = None
_WORKFLOW._options = None
_LISTWORKFLOWSREQUEST.fields_by_name['parent']._options = None
_GETWORKFLOWREQUEST.fields_by_name['name']._options = None
_CREATEWORKFLOWREQUEST.fields_by_name['parent']._options = None
_CREATEWORKFLOWREQUEST.fields_by_name['workflow']._options = None
_CREATEWORKFLOWREQUEST.fields_by_name['workflow_id']._options = None
_DELETEWORKFLOWREQUEST.fields_by_name['name']._options = None
_UPDATEWORKFLOWREQUEST.fields_by_name['workflow']._options = None

_WORKFLOWS = _descriptor.ServiceDescriptor(
  name='Workflows',
  full_name='google.cloud.workflows.v1beta.Workflows',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030workflows.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=1873,
  serialized_end=3018,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListWorkflows',
    full_name='google.cloud.workflows.v1beta.Workflows.ListWorkflows',
    index=0,
    containing_service=None,
    input_type=_LISTWORKFLOWSREQUEST,
    output_type=_LISTWORKFLOWSRESPONSE,
    serialized_options=b'\202\323\344\223\0023\0221/v1beta/{parent=projects/*/locations/*}/workflows\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetWorkflow',
    full_name='google.cloud.workflows.v1beta.Workflows.GetWorkflow',
    index=1,
    containing_service=None,
    input_type=_GETWORKFLOWREQUEST,
    output_type=_WORKFLOW,
    serialized_options=b'\202\323\344\223\0023\0221/v1beta/{name=projects/*/locations/*/workflows/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateWorkflow',
    full_name='google.cloud.workflows.v1beta.Workflows.CreateWorkflow',
    index=2,
    containing_service=None,
    input_type=_CREATEWORKFLOWREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002=\"1/v1beta/{parent=projects/*/locations/*}/workflows:\010workflow\332A\033parent,workflow,workflow_id\312A\035\n\010Workflow\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteWorkflow',
    full_name='google.cloud.workflows.v1beta.Workflows.DeleteWorkflow',
    index=3,
    containing_service=None,
    input_type=_DELETEWORKFLOWREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\0023*1/v1beta/{name=projects/*/locations/*/workflows/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateWorkflow',
    full_name='google.cloud.workflows.v1beta.Workflows.UpdateWorkflow',
    index=4,
    containing_service=None,
    input_type=_UPDATEWORKFLOWREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002F2:/v1beta/{workflow.name=projects/*/locations/*/workflows/*}:\010workflow\332A\024workflow,update_mask\312A\035\n\010Workflow\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_WORKFLOWS)

DESCRIPTOR.services_by_name['Workflows'] = _WORKFLOWS

# @@protoc_insertion_point(module_scope)
