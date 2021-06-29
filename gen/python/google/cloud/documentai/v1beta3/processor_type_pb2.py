# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1beta3/processor_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/documentai/v1beta3/processor_type.proto',
  package='google.cloud.documentai.v1beta3',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.documentai.v1beta3B\027DocumentAiProcessorTypeP\001ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta3;documentai\252\002\037Google.Cloud.DocumentAI.V1Beta3\312\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"Google::Cloud::DocumentAI::V1beta3',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/cloud/documentai/v1beta3/processor_type.proto\x12\x1fgoogle.cloud.documentai.v1beta3\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xcb\x02\n\rProcessorType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x10\n\x08\x63\x61tegory\x18\x03 \x01(\t\x12X\n\x13\x61vailable_locations\x18\x04 \x03(\x0b\x32;.google.cloud.documentai.v1beta3.ProcessorType.LocationInfo\x12\x16\n\x0e\x61llow_creation\x18\x06 \x01(\x08\x1a#\n\x0cLocationInfo\x12\x13\n\x0blocation_id\x18\x01 \x01(\t:u\xea\x41r\n\'documentai.googleapis.com/ProcessorType\x12Gprojects/{project}/locations/{location}/processorTypes/{processor_type}B\xf4\x01\n#com.google.cloud.documentai.v1beta3B\x17\x44ocumentAiProcessorTypeP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta3;documentai\xaa\x02\x1fGoogle.Cloud.DocumentAI.V1Beta3\xca\x02\x1fGoogle\\Cloud\\DocumentAI\\V1beta3\xea\x02\"Google::Cloud::DocumentAI::V1beta3b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_PROCESSORTYPE_LOCATIONINFO = _descriptor.Descriptor(
  name='LocationInfo',
  full_name='google.cloud.documentai.v1beta3.ProcessorType.LocationInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='location_id', full_name='google.cloud.documentai.v1beta3.ProcessorType.LocationInfo.location_id', index=0,
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
  serialized_start=324,
  serialized_end=359,
)

_PROCESSORTYPE = _descriptor.Descriptor(
  name='ProcessorType',
  full_name='google.cloud.documentai.v1beta3.ProcessorType',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.documentai.v1beta3.ProcessorType.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.documentai.v1beta3.ProcessorType.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='category', full_name='google.cloud.documentai.v1beta3.ProcessorType.category', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='available_locations', full_name='google.cloud.documentai.v1beta3.ProcessorType.available_locations', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allow_creation', full_name='google.cloud.documentai.v1beta3.ProcessorType.allow_creation', index=4,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PROCESSORTYPE_LOCATIONINFO, ],
  enum_types=[
  ],
  serialized_options=b'\352Ar\n\'documentai.googleapis.com/ProcessorType\022Gprojects/{project}/locations/{location}/processorTypes/{processor_type}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=147,
  serialized_end=478,
)

_PROCESSORTYPE_LOCATIONINFO.containing_type = _PROCESSORTYPE
_PROCESSORTYPE.fields_by_name['available_locations'].message_type = _PROCESSORTYPE_LOCATIONINFO
DESCRIPTOR.message_types_by_name['ProcessorType'] = _PROCESSORTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ProcessorType = _reflection.GeneratedProtocolMessageType('ProcessorType', (_message.Message,), {

  'LocationInfo' : _reflection.GeneratedProtocolMessageType('LocationInfo', (_message.Message,), {
    'DESCRIPTOR' : _PROCESSORTYPE_LOCATIONINFO,
    '__module__' : 'google.cloud.documentai.v1beta3.processor_type_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.ProcessorType.LocationInfo)
    })
  ,
  'DESCRIPTOR' : _PROCESSORTYPE,
  '__module__' : 'google.cloud.documentai.v1beta3.processor_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.ProcessorType)
  })
_sym_db.RegisterMessage(ProcessorType)
_sym_db.RegisterMessage(ProcessorType.LocationInfo)


DESCRIPTOR._options = None
_PROCESSORTYPE._options = None
# @@protoc_insertion_point(module_scope)