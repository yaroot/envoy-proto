# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/home/graph/v1/device.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!google/home/graph/v1/device.proto\x12\x14google.home.graph.v1\x1a\x1cgoogle/protobuf/struct.proto\"\xa8\x03\n\x06\x44\x65vice\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x0e\n\x06traits\x18\x03 \x03(\t\x12/\n\x04name\x18\x04 \x01(\x0b\x32!.google.home.graph.v1.DeviceNames\x12\x19\n\x11will_report_state\x18\x05 \x01(\x08\x12\x11\n\troom_hint\x18\x06 \x01(\t\x12\x16\n\x0estructure_hint\x18\x07 \x01(\t\x12\x35\n\x0b\x64\x65vice_info\x18\x08 \x01(\x0b\x32 .google.home.graph.v1.DeviceInfo\x12+\n\nattributes\x18\t \x01(\x0b\x32\x17.google.protobuf.Struct\x12,\n\x0b\x63ustom_data\x18\n \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x42\n\x10other_device_ids\x18\x0b \x03(\x0b\x32(.google.home.graph.v1.AgentOtherDeviceId\x12\'\n\x1fnotification_supported_by_agent\x18\x0c \x01(\x08\"E\n\x0b\x44\x65viceNames\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x11\n\tnicknames\x18\x02 \x03(\t\x12\x15\n\rdefault_names\x18\x03 \x03(\t\"Y\n\nDeviceInfo\x12\x14\n\x0cmanufacturer\x18\x01 \x01(\t\x12\r\n\x05model\x18\x02 \x01(\t\x12\x12\n\nhw_version\x18\x03 \x01(\t\x12\x12\n\nsw_version\x18\x04 \x01(\t\"9\n\x12\x41gentOtherDeviceId\x12\x10\n\x08\x61gent_id\x18\x01 \x01(\t\x12\x11\n\tdevice_id\x18\x02 \x01(\tBy\n\x18\x63om.google.home.graph.v1B\x0b\x44\x65viceProtoZ9google.golang.org/genproto/googleapis/home/graph/v1;graph\xca\x02\x14Google\\Home\\Graph\\V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.home.graph.v1.device_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.google.home.graph.v1B\013DeviceProtoZ9google.golang.org/genproto/googleapis/home/graph/v1;graph\312\002\024Google\\Home\\Graph\\V1'
  _DEVICE._serialized_start=90
  _DEVICE._serialized_end=514
  _DEVICENAMES._serialized_start=516
  _DEVICENAMES._serialized_end=585
  _DEVICEINFO._serialized_start=587
  _DEVICEINFO._serialized_end=676
  _AGENTOTHERDEVICEID._serialized_start=678
  _AGENTOTHERDEVICEID._serialized_end=735
# @@protoc_insertion_point(module_scope)