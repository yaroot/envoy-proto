# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/home/graph/v1/homegraph.proto

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
from google.home.graph.v1 import device_pb2 as google_dot_home_dot_graph_dot_v1_dot_device__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/home/graph/v1/homegraph.proto',
  package='google.home.graph.v1',
  syntax='proto3',
  serialized_options=b'\n\030com.google.home.graph.v1B\030HomeGraphApiServiceProtoZ9google.golang.org/genproto/googleapis/home/graph/v1;graph\352AI\n&homegraph.googleapis.com/AgentUserPath\022\037agentUsers/{agent_user_path=**}',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$google/home/graph/v1/homegraph.proto\x12\x14google.home.graph.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a!google/home/graph/v1/device.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/protobuf/struct.proto\"K\n\x19RequestSyncDevicesRequest\x12\x1a\n\ragent_user_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\x05\x61sync\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\x1c\n\x1aRequestSyncDevicesResponse\"\xcb\x01\n!ReportStateAndNotificationRequest\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12\x10\n\x08\x65vent_id\x18\x04 \x01(\t\x12\x1a\n\ragent_user_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x1b\n\x0f\x66ollow_up_token\x18\x05 \x01(\tB\x02\x18\x01\x12G\n\x07payload\x18\x03 \x01(\x0b\x32\x31.google.home.graph.v1.StateAndNotificationPayloadB\x03\xe0\x41\x02\"8\n\"ReportStateAndNotificationResponse\x12\x12\n\nrequest_id\x18\x01 \x01(\t\"f\n\x1bStateAndNotificationPayload\x12G\n\x07\x64\x65vices\x18\x01 \x01(\x0b\x32\x36.google.home.graph.v1.ReportStateAndNotificationDevice\"{\n ReportStateAndNotificationDevice\x12\'\n\x06states\x18\x01 \x01(\x0b\x32\x17.google.protobuf.Struct\x12.\n\rnotifications\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct\"s\n\x16\x44\x65leteAgentUserRequest\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12\x45\n\ragent_user_id\x18\x02 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&homegraph.googleapis.com/AgentUserPath\"|\n\x0cQueryRequest\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12\x1a\n\ragent_user_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12<\n\x06inputs\x18\x03 \x03(\x0b\x32\'.google.home.graph.v1.QueryRequestInputB\x03\xe0\x41\x02\"O\n\x11QueryRequestInput\x12:\n\x07payload\x18\x01 \x01(\x0b\x32).google.home.graph.v1.QueryRequestPayload\"K\n\x13QueryRequestPayload\x12\x34\n\x07\x64\x65vices\x18\x01 \x03(\x0b\x32#.google.home.graph.v1.AgentDeviceId\"\x1b\n\rAgentDeviceId\x12\n\n\x02id\x18\x01 \x01(\t\"`\n\rQueryResponse\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12;\n\x07payload\x18\x02 \x01(\x0b\x32*.google.home.graph.v1.QueryResponsePayload\"\xa9\x01\n\x14QueryResponsePayload\x12H\n\x07\x64\x65vices\x18\x01 \x03(\x0b\x32\x37.google.home.graph.v1.QueryResponsePayload.DevicesEntry\x1aG\n\x0c\x44\x65vicesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12&\n\x05value\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct:\x02\x38\x01\"=\n\x0bSyncRequest\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12\x1a\n\ragent_user_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\"^\n\x0cSyncResponse\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12:\n\x07payload\x18\x02 \x01(\x0b\x32).google.home.graph.v1.SyncResponsePayload\"[\n\x13SyncResponsePayload\x12\x15\n\ragent_user_id\x18\x01 \x01(\t\x12-\n\x07\x64\x65vices\x18\x02 \x03(\x0b\x32\x1c.google.home.graph.v1.Device2\x8c\x07\n\x13HomeGraphApiService\x12\xab\x01\n\x12RequestSyncDevices\x12/.google.home.graph.v1.RequestSyncDevicesRequest\x1a\x30.google.home.graph.v1.RequestSyncDevicesResponse\"2\x82\xd3\xe4\x93\x02\x1c\"\x17/v1/devices:requestSync:\x01*\xda\x41\ragent_user_id\x12\xee\x01\n\x1aReportStateAndNotification\x12\x37.google.home.graph.v1.ReportStateAndNotificationRequest\x1a\x38.google.home.graph.v1.ReportStateAndNotificationResponse\"]\x82\xd3\xe4\x93\x02+\"&/v1/devices:reportStateAndNotification:\x01*\xda\x41)request_id,event_id,agent_user_id,payload\x12\x9d\x01\n\x0f\x44\x65leteAgentUser\x12,.google.home.graph.v1.DeleteAgentUserRequest\x1a\x16.google.protobuf.Empty\"D\x82\xd3\xe4\x93\x02#*!/v1/{agent_user_id=agentUsers/**}\xda\x41\x18request_id,agent_user_id\x12\x90\x01\n\x05Query\x12\".google.home.graph.v1.QueryRequest\x1a#.google.home.graph.v1.QueryResponse\">\x82\xd3\xe4\x93\x02\x16\"\x11/v1/devices:query:\x01*\xda\x41\x1frequest_id,agent_user_id,inputs\x12\x85\x01\n\x04Sync\x12!.google.home.graph.v1.SyncRequest\x1a\".google.home.graph.v1.SyncResponse\"6\x82\xd3\xe4\x93\x02\x15\"\x10/v1/devices:sync:\x01*\xda\x41\x18request_id,agent_user_id\x1a\x1b\xca\x41\x18homegraph.googleapis.comB\xbb\x01\n\x18\x63om.google.home.graph.v1B\x18HomeGraphApiServiceProtoZ9google.golang.org/genproto/googleapis/home/graph/v1;graph\xea\x41I\n&homegraph.googleapis.com/AgentUserPath\x12\x1f\x61gentUsers/{agent_user_path=**}b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_home_dot_graph_dot_v1_dot_device__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,])




_REQUESTSYNCDEVICESREQUEST = _descriptor.Descriptor(
  name='RequestSyncDevicesRequest',
  full_name='google.home.graph.v1.RequestSyncDevicesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='agent_user_id', full_name='google.home.graph.v1.RequestSyncDevicesRequest.agent_user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='async', full_name='google.home.graph.v1.RequestSyncDevicesRequest.async', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=271,
  serialized_end=346,
)


_REQUESTSYNCDEVICESRESPONSE = _descriptor.Descriptor(
  name='RequestSyncDevicesResponse',
  full_name='google.home.graph.v1.RequestSyncDevicesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=348,
  serialized_end=376,
)


_REPORTSTATEANDNOTIFICATIONREQUEST = _descriptor.Descriptor(
  name='ReportStateAndNotificationRequest',
  full_name='google.home.graph.v1.ReportStateAndNotificationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.ReportStateAndNotificationRequest.request_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event_id', full_name='google.home.graph.v1.ReportStateAndNotificationRequest.event_id', index=1,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='agent_user_id', full_name='google.home.graph.v1.ReportStateAndNotificationRequest.agent_user_id', index=2,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='follow_up_token', full_name='google.home.graph.v1.ReportStateAndNotificationRequest.follow_up_token', index=3,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payload', full_name='google.home.graph.v1.ReportStateAndNotificationRequest.payload', index=4,
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
  serialized_start=379,
  serialized_end=582,
)


_REPORTSTATEANDNOTIFICATIONRESPONSE = _descriptor.Descriptor(
  name='ReportStateAndNotificationResponse',
  full_name='google.home.graph.v1.ReportStateAndNotificationResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.ReportStateAndNotificationResponse.request_id', index=0,
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
  serialized_start=584,
  serialized_end=640,
)


_STATEANDNOTIFICATIONPAYLOAD = _descriptor.Descriptor(
  name='StateAndNotificationPayload',
  full_name='google.home.graph.v1.StateAndNotificationPayload',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='devices', full_name='google.home.graph.v1.StateAndNotificationPayload.devices', index=0,
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
  serialized_start=642,
  serialized_end=744,
)


_REPORTSTATEANDNOTIFICATIONDEVICE = _descriptor.Descriptor(
  name='ReportStateAndNotificationDevice',
  full_name='google.home.graph.v1.ReportStateAndNotificationDevice',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='states', full_name='google.home.graph.v1.ReportStateAndNotificationDevice.states', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='notifications', full_name='google.home.graph.v1.ReportStateAndNotificationDevice.notifications', index=1,
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
  serialized_start=746,
  serialized_end=869,
)


_DELETEAGENTUSERREQUEST = _descriptor.Descriptor(
  name='DeleteAgentUserRequest',
  full_name='google.home.graph.v1.DeleteAgentUserRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.DeleteAgentUserRequest.request_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='agent_user_id', full_name='google.home.graph.v1.DeleteAgentUserRequest.agent_user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A(\n&homegraph.googleapis.com/AgentUserPath', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=871,
  serialized_end=986,
)


_QUERYREQUEST = _descriptor.Descriptor(
  name='QueryRequest',
  full_name='google.home.graph.v1.QueryRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.QueryRequest.request_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='agent_user_id', full_name='google.home.graph.v1.QueryRequest.agent_user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='inputs', full_name='google.home.graph.v1.QueryRequest.inputs', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=988,
  serialized_end=1112,
)


_QUERYREQUESTINPUT = _descriptor.Descriptor(
  name='QueryRequestInput',
  full_name='google.home.graph.v1.QueryRequestInput',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='payload', full_name='google.home.graph.v1.QueryRequestInput.payload', index=0,
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
  serialized_start=1114,
  serialized_end=1193,
)


_QUERYREQUESTPAYLOAD = _descriptor.Descriptor(
  name='QueryRequestPayload',
  full_name='google.home.graph.v1.QueryRequestPayload',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='devices', full_name='google.home.graph.v1.QueryRequestPayload.devices', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=1195,
  serialized_end=1270,
)


_AGENTDEVICEID = _descriptor.Descriptor(
  name='AgentDeviceId',
  full_name='google.home.graph.v1.AgentDeviceId',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.home.graph.v1.AgentDeviceId.id', index=0,
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
  serialized_start=1272,
  serialized_end=1299,
)


_QUERYRESPONSE = _descriptor.Descriptor(
  name='QueryResponse',
  full_name='google.home.graph.v1.QueryResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.QueryResponse.request_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payload', full_name='google.home.graph.v1.QueryResponse.payload', index=1,
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
  serialized_start=1301,
  serialized_end=1397,
)


_QUERYRESPONSEPAYLOAD_DEVICESENTRY = _descriptor.Descriptor(
  name='DevicesEntry',
  full_name='google.home.graph.v1.QueryResponsePayload.DevicesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.home.graph.v1.QueryResponsePayload.DevicesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.home.graph.v1.QueryResponsePayload.DevicesEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1498,
  serialized_end=1569,
)

_QUERYRESPONSEPAYLOAD = _descriptor.Descriptor(
  name='QueryResponsePayload',
  full_name='google.home.graph.v1.QueryResponsePayload',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='devices', full_name='google.home.graph.v1.QueryResponsePayload.devices', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_QUERYRESPONSEPAYLOAD_DEVICESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1400,
  serialized_end=1569,
)


_SYNCREQUEST = _descriptor.Descriptor(
  name='SyncRequest',
  full_name='google.home.graph.v1.SyncRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.SyncRequest.request_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='agent_user_id', full_name='google.home.graph.v1.SyncRequest.agent_user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=1571,
  serialized_end=1632,
)


_SYNCRESPONSE = _descriptor.Descriptor(
  name='SyncResponse',
  full_name='google.home.graph.v1.SyncResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='request_id', full_name='google.home.graph.v1.SyncResponse.request_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payload', full_name='google.home.graph.v1.SyncResponse.payload', index=1,
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
  serialized_start=1634,
  serialized_end=1728,
)


_SYNCRESPONSEPAYLOAD = _descriptor.Descriptor(
  name='SyncResponsePayload',
  full_name='google.home.graph.v1.SyncResponsePayload',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='agent_user_id', full_name='google.home.graph.v1.SyncResponsePayload.agent_user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='devices', full_name='google.home.graph.v1.SyncResponsePayload.devices', index=1,
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
  serialized_start=1730,
  serialized_end=1821,
)

_REPORTSTATEANDNOTIFICATIONREQUEST.fields_by_name['payload'].message_type = _STATEANDNOTIFICATIONPAYLOAD
_STATEANDNOTIFICATIONPAYLOAD.fields_by_name['devices'].message_type = _REPORTSTATEANDNOTIFICATIONDEVICE
_REPORTSTATEANDNOTIFICATIONDEVICE.fields_by_name['states'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_REPORTSTATEANDNOTIFICATIONDEVICE.fields_by_name['notifications'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_QUERYREQUEST.fields_by_name['inputs'].message_type = _QUERYREQUESTINPUT
_QUERYREQUESTINPUT.fields_by_name['payload'].message_type = _QUERYREQUESTPAYLOAD
_QUERYREQUESTPAYLOAD.fields_by_name['devices'].message_type = _AGENTDEVICEID
_QUERYRESPONSE.fields_by_name['payload'].message_type = _QUERYRESPONSEPAYLOAD
_QUERYRESPONSEPAYLOAD_DEVICESENTRY.fields_by_name['value'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_QUERYRESPONSEPAYLOAD_DEVICESENTRY.containing_type = _QUERYRESPONSEPAYLOAD
_QUERYRESPONSEPAYLOAD.fields_by_name['devices'].message_type = _QUERYRESPONSEPAYLOAD_DEVICESENTRY
_SYNCRESPONSE.fields_by_name['payload'].message_type = _SYNCRESPONSEPAYLOAD
_SYNCRESPONSEPAYLOAD.fields_by_name['devices'].message_type = google_dot_home_dot_graph_dot_v1_dot_device__pb2._DEVICE
DESCRIPTOR.message_types_by_name['RequestSyncDevicesRequest'] = _REQUESTSYNCDEVICESREQUEST
DESCRIPTOR.message_types_by_name['RequestSyncDevicesResponse'] = _REQUESTSYNCDEVICESRESPONSE
DESCRIPTOR.message_types_by_name['ReportStateAndNotificationRequest'] = _REPORTSTATEANDNOTIFICATIONREQUEST
DESCRIPTOR.message_types_by_name['ReportStateAndNotificationResponse'] = _REPORTSTATEANDNOTIFICATIONRESPONSE
DESCRIPTOR.message_types_by_name['StateAndNotificationPayload'] = _STATEANDNOTIFICATIONPAYLOAD
DESCRIPTOR.message_types_by_name['ReportStateAndNotificationDevice'] = _REPORTSTATEANDNOTIFICATIONDEVICE
DESCRIPTOR.message_types_by_name['DeleteAgentUserRequest'] = _DELETEAGENTUSERREQUEST
DESCRIPTOR.message_types_by_name['QueryRequest'] = _QUERYREQUEST
DESCRIPTOR.message_types_by_name['QueryRequestInput'] = _QUERYREQUESTINPUT
DESCRIPTOR.message_types_by_name['QueryRequestPayload'] = _QUERYREQUESTPAYLOAD
DESCRIPTOR.message_types_by_name['AgentDeviceId'] = _AGENTDEVICEID
DESCRIPTOR.message_types_by_name['QueryResponse'] = _QUERYRESPONSE
DESCRIPTOR.message_types_by_name['QueryResponsePayload'] = _QUERYRESPONSEPAYLOAD
DESCRIPTOR.message_types_by_name['SyncRequest'] = _SYNCREQUEST
DESCRIPTOR.message_types_by_name['SyncResponse'] = _SYNCRESPONSE
DESCRIPTOR.message_types_by_name['SyncResponsePayload'] = _SYNCRESPONSEPAYLOAD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RequestSyncDevicesRequest = _reflection.GeneratedProtocolMessageType('RequestSyncDevicesRequest', (_message.Message,), {
  'DESCRIPTOR' : _REQUESTSYNCDEVICESREQUEST,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.RequestSyncDevicesRequest)
  })
_sym_db.RegisterMessage(RequestSyncDevicesRequest)

RequestSyncDevicesResponse = _reflection.GeneratedProtocolMessageType('RequestSyncDevicesResponse', (_message.Message,), {
  'DESCRIPTOR' : _REQUESTSYNCDEVICESRESPONSE,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.RequestSyncDevicesResponse)
  })
_sym_db.RegisterMessage(RequestSyncDevicesResponse)

ReportStateAndNotificationRequest = _reflection.GeneratedProtocolMessageType('ReportStateAndNotificationRequest', (_message.Message,), {
  'DESCRIPTOR' : _REPORTSTATEANDNOTIFICATIONREQUEST,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.ReportStateAndNotificationRequest)
  })
_sym_db.RegisterMessage(ReportStateAndNotificationRequest)

ReportStateAndNotificationResponse = _reflection.GeneratedProtocolMessageType('ReportStateAndNotificationResponse', (_message.Message,), {
  'DESCRIPTOR' : _REPORTSTATEANDNOTIFICATIONRESPONSE,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.ReportStateAndNotificationResponse)
  })
_sym_db.RegisterMessage(ReportStateAndNotificationResponse)

StateAndNotificationPayload = _reflection.GeneratedProtocolMessageType('StateAndNotificationPayload', (_message.Message,), {
  'DESCRIPTOR' : _STATEANDNOTIFICATIONPAYLOAD,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.StateAndNotificationPayload)
  })
_sym_db.RegisterMessage(StateAndNotificationPayload)

ReportStateAndNotificationDevice = _reflection.GeneratedProtocolMessageType('ReportStateAndNotificationDevice', (_message.Message,), {
  'DESCRIPTOR' : _REPORTSTATEANDNOTIFICATIONDEVICE,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.ReportStateAndNotificationDevice)
  })
_sym_db.RegisterMessage(ReportStateAndNotificationDevice)

DeleteAgentUserRequest = _reflection.GeneratedProtocolMessageType('DeleteAgentUserRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEAGENTUSERREQUEST,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.DeleteAgentUserRequest)
  })
_sym_db.RegisterMessage(DeleteAgentUserRequest)

QueryRequest = _reflection.GeneratedProtocolMessageType('QueryRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYREQUEST,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.QueryRequest)
  })
_sym_db.RegisterMessage(QueryRequest)

QueryRequestInput = _reflection.GeneratedProtocolMessageType('QueryRequestInput', (_message.Message,), {
  'DESCRIPTOR' : _QUERYREQUESTINPUT,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.QueryRequestInput)
  })
_sym_db.RegisterMessage(QueryRequestInput)

QueryRequestPayload = _reflection.GeneratedProtocolMessageType('QueryRequestPayload', (_message.Message,), {
  'DESCRIPTOR' : _QUERYREQUESTPAYLOAD,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.QueryRequestPayload)
  })
_sym_db.RegisterMessage(QueryRequestPayload)

AgentDeviceId = _reflection.GeneratedProtocolMessageType('AgentDeviceId', (_message.Message,), {
  'DESCRIPTOR' : _AGENTDEVICEID,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.AgentDeviceId)
  })
_sym_db.RegisterMessage(AgentDeviceId)

QueryResponse = _reflection.GeneratedProtocolMessageType('QueryResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYRESPONSE,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.QueryResponse)
  })
_sym_db.RegisterMessage(QueryResponse)

QueryResponsePayload = _reflection.GeneratedProtocolMessageType('QueryResponsePayload', (_message.Message,), {

  'DevicesEntry' : _reflection.GeneratedProtocolMessageType('DevicesEntry', (_message.Message,), {
    'DESCRIPTOR' : _QUERYRESPONSEPAYLOAD_DEVICESENTRY,
    '__module__' : 'google.home.graph.v1.homegraph_pb2'
    # @@protoc_insertion_point(class_scope:google.home.graph.v1.QueryResponsePayload.DevicesEntry)
    })
  ,
  'DESCRIPTOR' : _QUERYRESPONSEPAYLOAD,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.QueryResponsePayload)
  })
_sym_db.RegisterMessage(QueryResponsePayload)
_sym_db.RegisterMessage(QueryResponsePayload.DevicesEntry)

SyncRequest = _reflection.GeneratedProtocolMessageType('SyncRequest', (_message.Message,), {
  'DESCRIPTOR' : _SYNCREQUEST,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.SyncRequest)
  })
_sym_db.RegisterMessage(SyncRequest)

SyncResponse = _reflection.GeneratedProtocolMessageType('SyncResponse', (_message.Message,), {
  'DESCRIPTOR' : _SYNCRESPONSE,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.SyncResponse)
  })
_sym_db.RegisterMessage(SyncResponse)

SyncResponsePayload = _reflection.GeneratedProtocolMessageType('SyncResponsePayload', (_message.Message,), {
  'DESCRIPTOR' : _SYNCRESPONSEPAYLOAD,
  '__module__' : 'google.home.graph.v1.homegraph_pb2'
  # @@protoc_insertion_point(class_scope:google.home.graph.v1.SyncResponsePayload)
  })
_sym_db.RegisterMessage(SyncResponsePayload)


DESCRIPTOR._options = None
_REQUESTSYNCDEVICESREQUEST.fields_by_name['agent_user_id']._options = None
_REQUESTSYNCDEVICESREQUEST.fields_by_name['async']._options = None
_REPORTSTATEANDNOTIFICATIONREQUEST.fields_by_name['agent_user_id']._options = None
_REPORTSTATEANDNOTIFICATIONREQUEST.fields_by_name['follow_up_token']._options = None
_REPORTSTATEANDNOTIFICATIONREQUEST.fields_by_name['payload']._options = None
_DELETEAGENTUSERREQUEST.fields_by_name['agent_user_id']._options = None
_QUERYREQUEST.fields_by_name['agent_user_id']._options = None
_QUERYREQUEST.fields_by_name['inputs']._options = None
_QUERYRESPONSEPAYLOAD_DEVICESENTRY._options = None
_SYNCREQUEST.fields_by_name['agent_user_id']._options = None

_HOMEGRAPHAPISERVICE = _descriptor.ServiceDescriptor(
  name='HomeGraphApiService',
  full_name='google.home.graph.v1.HomeGraphApiService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030homegraph.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=1824,
  serialized_end=2732,
  methods=[
  _descriptor.MethodDescriptor(
    name='RequestSyncDevices',
    full_name='google.home.graph.v1.HomeGraphApiService.RequestSyncDevices',
    index=0,
    containing_service=None,
    input_type=_REQUESTSYNCDEVICESREQUEST,
    output_type=_REQUESTSYNCDEVICESRESPONSE,
    serialized_options=b'\202\323\344\223\002\034\"\027/v1/devices:requestSync:\001*\332A\ragent_user_id',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ReportStateAndNotification',
    full_name='google.home.graph.v1.HomeGraphApiService.ReportStateAndNotification',
    index=1,
    containing_service=None,
    input_type=_REPORTSTATEANDNOTIFICATIONREQUEST,
    output_type=_REPORTSTATEANDNOTIFICATIONRESPONSE,
    serialized_options=b'\202\323\344\223\002+\"&/v1/devices:reportStateAndNotification:\001*\332A)request_id,event_id,agent_user_id,payload',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteAgentUser',
    full_name='google.home.graph.v1.HomeGraphApiService.DeleteAgentUser',
    index=2,
    containing_service=None,
    input_type=_DELETEAGENTUSERREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002#*!/v1/{agent_user_id=agentUsers/**}\332A\030request_id,agent_user_id',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Query',
    full_name='google.home.graph.v1.HomeGraphApiService.Query',
    index=3,
    containing_service=None,
    input_type=_QUERYREQUEST,
    output_type=_QUERYRESPONSE,
    serialized_options=b'\202\323\344\223\002\026\"\021/v1/devices:query:\001*\332A\037request_id,agent_user_id,inputs',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Sync',
    full_name='google.home.graph.v1.HomeGraphApiService.Sync',
    index=4,
    containing_service=None,
    input_type=_SYNCREQUEST,
    output_type=_SYNCRESPONSE,
    serialized_options=b'\202\323\344\223\002\025\"\020/v1/devices:sync:\001*\332A\030request_id,agent_user_id',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_HOMEGRAPHAPISERVICE)

DESCRIPTOR.services_by_name['HomeGraphApiService'] = _HOMEGRAPHAPISERVICE

# @@protoc_insertion_point(module_scope)
