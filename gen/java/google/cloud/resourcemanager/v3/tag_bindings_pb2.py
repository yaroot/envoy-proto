# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/resourcemanager/v3/tag_bindings.proto
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


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/resourcemanager/v3/tag_bindings.proto',
  package='google.cloud.resourcemanager.v3',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.resourcemanager.v3B\020TagBindingsProtoP\001ZNgoogle.golang.org/genproto/googleapis/cloud/resourcemanager/v3;resourcemanager\252\002\037Google.Cloud.ResourceManager.V3\312\002\037Google\\Cloud\\ResourceManager\\V3',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/cloud/resourcemanager/v3/tag_bindings.proto\x12\x1fgoogle.cloud.resourcemanager.v3\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\"\x92\x01\n\nTagBinding\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x0e\n\x06parent\x18\x02 \x01(\t\x12\x11\n\ttag_value\x18\x03 \x01(\t:N\xea\x41K\n.cloudresourcemanager.googleapis.com/TagBinding\x12\x19tagBindings/{tag_binding}\"\x1a\n\x18\x43reateTagBindingMetadata\"|\n\x17\x43reateTagBindingRequest\x12\x45\n\x0btag_binding\x18\x01 \x01(\x0b\x32+.google.cloud.resourcemanager.v3.TagBindingB\x03\xe0\x41\x02\x12\x1a\n\rvalidate_only\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\x1a\n\x18\x44\x65leteTagBindingMetadata\"_\n\x17\x44\x65leteTagBindingRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.cloudresourcemanager.googleapis.com/TagBinding\"d\n\x16ListTagBindingsRequest\x12\x19\n\x06parent\x18\x01 \x01(\tB\t\xe0\x41\x02\xfa\x41\x03\x12\x01*\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"u\n\x17ListTagBindingsResponse\x12\x41\n\x0ctag_bindings\x18\x01 \x03(\x0b\x32+.google.cloud.resourcemanager.v3.TagBinding\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xe0\x05\n\x0bTagBindings\x12\xa6\x01\n\x0fListTagBindings\x12\x37.google.cloud.resourcemanager.v3.ListTagBindingsRequest\x1a\x38.google.cloud.resourcemanager.v3.ListTagBindingsResponse\" \x82\xd3\xe4\x93\x02\x11\x12\x0f/v3/tagBindings\xda\x41\x06parent\x12\xc8\x01\n\x10\x43reateTagBinding\x12\x38.google.cloud.resourcemanager.v3.CreateTagBindingRequest\x1a\x1d.google.longrunning.Operation\"[\x82\xd3\xe4\x93\x02\x1e\"\x0f/v3/tagBindings:\x0btag_binding\xda\x41\x0btag_binding\xca\x41&\n\nTagBinding\x12\x18\x43reateTagBindingMetadata\x12\xc9\x01\n\x10\x44\x65leteTagBinding\x12\x38.google.cloud.resourcemanager.v3.DeleteTagBindingRequest\x1a\x1d.google.longrunning.Operation\"\\\x82\xd3\xe4\x93\x02\x1b*\x19/v3/{name=tagBindings/**}\xda\x41\x04name\xca\x41\x31\n\x15google.protobuf.Empty\x12\x18\x44\x65leteTagBindingMetadata\x1a\x90\x01\xca\x41#cloudresourcemanager.googleapis.com\xd2\x41ghttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-onlyB\xcd\x01\n#com.google.cloud.resourcemanager.v3B\x10TagBindingsProtoP\x01ZNgoogle.golang.org/genproto/googleapis/cloud/resourcemanager/v3;resourcemanager\xaa\x02\x1fGoogle.Cloud.ResourceManager.V3\xca\x02\x1fGoogle\\Cloud\\ResourceManager\\V3b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,])




_TAGBINDING = _descriptor.Descriptor(
  name='TagBinding',
  full_name='google.cloud.resourcemanager.v3.TagBinding',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.resourcemanager.v3.TagBinding.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.resourcemanager.v3.TagBinding.parent', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tag_value', full_name='google.cloud.resourcemanager.v3.TagBinding.tag_value', index=2,
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
  serialized_options=b'\352AK\n.cloudresourcemanager.googleapis.com/TagBinding\022\031tagBindings/{tag_binding}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=240,
  serialized_end=386,
)


_CREATETAGBINDINGMETADATA = _descriptor.Descriptor(
  name='CreateTagBindingMetadata',
  full_name='google.cloud.resourcemanager.v3.CreateTagBindingMetadata',
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
  serialized_start=388,
  serialized_end=414,
)


_CREATETAGBINDINGREQUEST = _descriptor.Descriptor(
  name='CreateTagBindingRequest',
  full_name='google.cloud.resourcemanager.v3.CreateTagBindingRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='tag_binding', full_name='google.cloud.resourcemanager.v3.CreateTagBindingRequest.tag_binding', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.cloud.resourcemanager.v3.CreateTagBindingRequest.validate_only', index=1,
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
  serialized_start=416,
  serialized_end=540,
)


_DELETETAGBINDINGMETADATA = _descriptor.Descriptor(
  name='DeleteTagBindingMetadata',
  full_name='google.cloud.resourcemanager.v3.DeleteTagBindingMetadata',
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
  serialized_start=542,
  serialized_end=568,
)


_DELETETAGBINDINGREQUEST = _descriptor.Descriptor(
  name='DeleteTagBindingRequest',
  full_name='google.cloud.resourcemanager.v3.DeleteTagBindingRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.resourcemanager.v3.DeleteTagBindingRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A0\n.cloudresourcemanager.googleapis.com/TagBinding', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=570,
  serialized_end=665,
)


_LISTTAGBINDINGSREQUEST = _descriptor.Descriptor(
  name='ListTagBindingsRequest',
  full_name='google.cloud.resourcemanager.v3.ListTagBindingsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.resourcemanager.v3.ListTagBindingsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\003\022\001*', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.resourcemanager.v3.ListTagBindingsRequest.page_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.resourcemanager.v3.ListTagBindingsRequest.page_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=667,
  serialized_end=767,
)


_LISTTAGBINDINGSRESPONSE = _descriptor.Descriptor(
  name='ListTagBindingsResponse',
  full_name='google.cloud.resourcemanager.v3.ListTagBindingsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='tag_bindings', full_name='google.cloud.resourcemanager.v3.ListTagBindingsResponse.tag_bindings', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.resourcemanager.v3.ListTagBindingsResponse.next_page_token', index=1,
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
  serialized_start=769,
  serialized_end=886,
)

_CREATETAGBINDINGREQUEST.fields_by_name['tag_binding'].message_type = _TAGBINDING
_LISTTAGBINDINGSRESPONSE.fields_by_name['tag_bindings'].message_type = _TAGBINDING
DESCRIPTOR.message_types_by_name['TagBinding'] = _TAGBINDING
DESCRIPTOR.message_types_by_name['CreateTagBindingMetadata'] = _CREATETAGBINDINGMETADATA
DESCRIPTOR.message_types_by_name['CreateTagBindingRequest'] = _CREATETAGBINDINGREQUEST
DESCRIPTOR.message_types_by_name['DeleteTagBindingMetadata'] = _DELETETAGBINDINGMETADATA
DESCRIPTOR.message_types_by_name['DeleteTagBindingRequest'] = _DELETETAGBINDINGREQUEST
DESCRIPTOR.message_types_by_name['ListTagBindingsRequest'] = _LISTTAGBINDINGSREQUEST
DESCRIPTOR.message_types_by_name['ListTagBindingsResponse'] = _LISTTAGBINDINGSRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TagBinding = _reflection.GeneratedProtocolMessageType('TagBinding', (_message.Message,), {
  'DESCRIPTOR' : _TAGBINDING,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.TagBinding)
  })
_sym_db.RegisterMessage(TagBinding)

CreateTagBindingMetadata = _reflection.GeneratedProtocolMessageType('CreateTagBindingMetadata', (_message.Message,), {
  'DESCRIPTOR' : _CREATETAGBINDINGMETADATA,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.CreateTagBindingMetadata)
  })
_sym_db.RegisterMessage(CreateTagBindingMetadata)

CreateTagBindingRequest = _reflection.GeneratedProtocolMessageType('CreateTagBindingRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATETAGBINDINGREQUEST,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.CreateTagBindingRequest)
  })
_sym_db.RegisterMessage(CreateTagBindingRequest)

DeleteTagBindingMetadata = _reflection.GeneratedProtocolMessageType('DeleteTagBindingMetadata', (_message.Message,), {
  'DESCRIPTOR' : _DELETETAGBINDINGMETADATA,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.DeleteTagBindingMetadata)
  })
_sym_db.RegisterMessage(DeleteTagBindingMetadata)

DeleteTagBindingRequest = _reflection.GeneratedProtocolMessageType('DeleteTagBindingRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETETAGBINDINGREQUEST,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.DeleteTagBindingRequest)
  })
_sym_db.RegisterMessage(DeleteTagBindingRequest)

ListTagBindingsRequest = _reflection.GeneratedProtocolMessageType('ListTagBindingsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTTAGBINDINGSREQUEST,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.ListTagBindingsRequest)
  })
_sym_db.RegisterMessage(ListTagBindingsRequest)

ListTagBindingsResponse = _reflection.GeneratedProtocolMessageType('ListTagBindingsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTTAGBINDINGSRESPONSE,
  '__module__' : 'google.cloud.resourcemanager.v3.tag_bindings_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.ListTagBindingsResponse)
  })
_sym_db.RegisterMessage(ListTagBindingsResponse)


DESCRIPTOR._options = None
_TAGBINDING.fields_by_name['name']._options = None
_TAGBINDING._options = None
_CREATETAGBINDINGREQUEST.fields_by_name['tag_binding']._options = None
_CREATETAGBINDINGREQUEST.fields_by_name['validate_only']._options = None
_DELETETAGBINDINGREQUEST.fields_by_name['name']._options = None
_LISTTAGBINDINGSREQUEST.fields_by_name['parent']._options = None
_LISTTAGBINDINGSREQUEST.fields_by_name['page_size']._options = None
_LISTTAGBINDINGSREQUEST.fields_by_name['page_token']._options = None

_TAGBINDINGS = _descriptor.ServiceDescriptor(
  name='TagBindings',
  full_name='google.cloud.resourcemanager.v3.TagBindings',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A#cloudresourcemanager.googleapis.com\322Aghttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-only',
  create_key=_descriptor._internal_create_key,
  serialized_start=889,
  serialized_end=1625,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListTagBindings',
    full_name='google.cloud.resourcemanager.v3.TagBindings.ListTagBindings',
    index=0,
    containing_service=None,
    input_type=_LISTTAGBINDINGSREQUEST,
    output_type=_LISTTAGBINDINGSRESPONSE,
    serialized_options=b'\202\323\344\223\002\021\022\017/v3/tagBindings\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateTagBinding',
    full_name='google.cloud.resourcemanager.v3.TagBindings.CreateTagBinding',
    index=1,
    containing_service=None,
    input_type=_CREATETAGBINDINGREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002\036\"\017/v3/tagBindings:\013tag_binding\332A\013tag_binding\312A&\n\nTagBinding\022\030CreateTagBindingMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteTagBinding',
    full_name='google.cloud.resourcemanager.v3.TagBindings.DeleteTagBinding',
    index=2,
    containing_service=None,
    input_type=_DELETETAGBINDINGREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002\033*\031/v3/{name=tagBindings/**}\332A\004name\312A1\n\025google.protobuf.Empty\022\030DeleteTagBindingMetadata',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_TAGBINDINGS)

DESCRIPTOR.services_by_name['TagBindings'] = _TAGBINDINGS

# @@protoc_insertion_point(module_scope)