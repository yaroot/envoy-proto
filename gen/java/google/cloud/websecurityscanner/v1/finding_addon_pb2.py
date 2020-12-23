# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/websecurityscanner/v1/finding_addon.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/websecurityscanner/v1/finding_addon.proto',
  package='google.cloud.websecurityscanner.v1',
  syntax='proto3',
  serialized_options=b'\n&com.google.cloud.websecurityscanner.v1B\021FindingAddonProtoP\001ZTgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1;websecurityscanner\252\002\"Google.Cloud.WebSecurityScanner.V1\312\002\"Google\\Cloud\\WebSecurityScanner\\V1\352\002%Google::Cloud::WebSecurityScanner::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/cloud/websecurityscanner/v1/finding_addon.proto\x12\"google.cloud.websecurityscanner.v1\"*\n\x04\x46orm\x12\x12\n\naction_uri\x18\x01 \x01(\t\x12\x0e\n\x06\x66ields\x18\x02 \x03(\t\"Q\n\x0fOutdatedLibrary\x12\x14\n\x0clibrary_name\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\x17\n\x0flearn_more_urls\x18\x03 \x03(\t\"?\n\x11ViolatingResource\x12\x14\n\x0c\x63ontent_type\x18\x01 \x01(\t\x12\x14\n\x0cresource_url\x18\x02 \x01(\t\"/\n\x14VulnerableParameters\x12\x17\n\x0fparameter_names\x18\x01 \x03(\t\"\xe0\x01\n\x11VulnerableHeaders\x12M\n\x07headers\x18\x01 \x03(\x0b\x32<.google.cloud.websecurityscanner.v1.VulnerableHeaders.Header\x12U\n\x0fmissing_headers\x18\x02 \x03(\x0b\x32<.google.cloud.websecurityscanner.v1.VulnerableHeaders.Header\x1a%\n\x06Header\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t\"\xdb\x03\n\x03Xss\x12\x14\n\x0cstack_traces\x18\x01 \x03(\t\x12\x15\n\rerror_message\x18\x02 \x01(\t\x12K\n\rattack_vector\x18\x03 \x01(\x0e\x32\x34.google.cloud.websecurityscanner.v1.Xss.AttackVector\x12\x1e\n\x16stored_xss_seeding_url\x18\x04 \x01(\t\"\xb9\x02\n\x0c\x41ttackVector\x12\x1d\n\x19\x41TTACK_VECTOR_UNSPECIFIED\x10\x00\x12\x11\n\rLOCAL_STORAGE\x10\x01\x12\x13\n\x0fSESSION_STORAGE\x10\x02\x12\x0f\n\x0bWINDOW_NAME\x10\x03\x12\x0c\n\x08REFERRER\x10\x04\x12\x0e\n\nFORM_INPUT\x10\x05\x12\n\n\x06\x43OOKIE\x10\x06\x12\x10\n\x0cPOST_MESSAGE\x10\x07\x12\x12\n\x0eGET_PARAMETERS\x10\x08\x12\x10\n\x0cURL_FRAGMENT\x10\t\x12\x10\n\x0cHTML_COMMENT\x10\n\x12\x13\n\x0fPOST_PARAMETERS\x10\x0b\x12\x0c\n\x08PROTOCOL\x10\x0c\x12\x0e\n\nSTORED_XSS\x10\r\x12\x0f\n\x0bSAME_ORIGIN\x10\x0e\x12\x19\n\x15USER_CONTROLLABLE_URL\x10\x0f\x42\x85\x02\n&com.google.cloud.websecurityscanner.v1B\x11\x46indingAddonProtoP\x01ZTgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1;websecurityscanner\xaa\x02\"Google.Cloud.WebSecurityScanner.V1\xca\x02\"Google\\Cloud\\WebSecurityScanner\\V1\xea\x02%Google::Cloud::WebSecurityScanner::V1b\x06proto3'
)



_XSS_ATTACKVECTOR = _descriptor.EnumDescriptor(
  name='AttackVector',
  full_name='google.cloud.websecurityscanner.v1.Xss.AttackVector',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ATTACK_VECTOR_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOCAL_STORAGE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SESSION_STORAGE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WINDOW_NAME', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REFERRER', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FORM_INPUT', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COOKIE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POST_MESSAGE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GET_PARAMETERS', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='URL_FRAGMENT', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HTML_COMMENT', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POST_PARAMETERS', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROTOCOL', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STORED_XSS', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SAME_ORIGIN', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='USER_CONTROLLABLE_URL', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=725,
  serialized_end=1038,
)
_sym_db.RegisterEnumDescriptor(_XSS_ATTACKVECTOR)


_FORM = _descriptor.Descriptor(
  name='Form',
  full_name='google.cloud.websecurityscanner.v1.Form',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='action_uri', full_name='google.cloud.websecurityscanner.v1.Form.action_uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='fields', full_name='google.cloud.websecurityscanner.v1.Form.fields', index=1,
      number=2, type=9, cpp_type=9, label=3,
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
  serialized_start=94,
  serialized_end=136,
)


_OUTDATEDLIBRARY = _descriptor.Descriptor(
  name='OutdatedLibrary',
  full_name='google.cloud.websecurityscanner.v1.OutdatedLibrary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='library_name', full_name='google.cloud.websecurityscanner.v1.OutdatedLibrary.library_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='google.cloud.websecurityscanner.v1.OutdatedLibrary.version', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='learn_more_urls', full_name='google.cloud.websecurityscanner.v1.OutdatedLibrary.learn_more_urls', index=2,
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
  serialized_start=138,
  serialized_end=219,
)


_VIOLATINGRESOURCE = _descriptor.Descriptor(
  name='ViolatingResource',
  full_name='google.cloud.websecurityscanner.v1.ViolatingResource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='content_type', full_name='google.cloud.websecurityscanner.v1.ViolatingResource.content_type', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource_url', full_name='google.cloud.websecurityscanner.v1.ViolatingResource.resource_url', index=1,
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
  serialized_start=221,
  serialized_end=284,
)


_VULNERABLEPARAMETERS = _descriptor.Descriptor(
  name='VulnerableParameters',
  full_name='google.cloud.websecurityscanner.v1.VulnerableParameters',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parameter_names', full_name='google.cloud.websecurityscanner.v1.VulnerableParameters.parameter_names', index=0,
      number=1, type=9, cpp_type=9, label=3,
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
  serialized_start=286,
  serialized_end=333,
)


_VULNERABLEHEADERS_HEADER = _descriptor.Descriptor(
  name='Header',
  full_name='google.cloud.websecurityscanner.v1.VulnerableHeaders.Header',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.websecurityscanner.v1.VulnerableHeaders.Header.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.websecurityscanner.v1.VulnerableHeaders.Header.value', index=1,
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
  serialized_start=523,
  serialized_end=560,
)

_VULNERABLEHEADERS = _descriptor.Descriptor(
  name='VulnerableHeaders',
  full_name='google.cloud.websecurityscanner.v1.VulnerableHeaders',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='headers', full_name='google.cloud.websecurityscanner.v1.VulnerableHeaders.headers', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='missing_headers', full_name='google.cloud.websecurityscanner.v1.VulnerableHeaders.missing_headers', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_VULNERABLEHEADERS_HEADER, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=336,
  serialized_end=560,
)


_XSS = _descriptor.Descriptor(
  name='Xss',
  full_name='google.cloud.websecurityscanner.v1.Xss',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='stack_traces', full_name='google.cloud.websecurityscanner.v1.Xss.stack_traces', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='error_message', full_name='google.cloud.websecurityscanner.v1.Xss.error_message', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attack_vector', full_name='google.cloud.websecurityscanner.v1.Xss.attack_vector', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stored_xss_seeding_url', full_name='google.cloud.websecurityscanner.v1.Xss.stored_xss_seeding_url', index=3,
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
    _XSS_ATTACKVECTOR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=563,
  serialized_end=1038,
)

_VULNERABLEHEADERS_HEADER.containing_type = _VULNERABLEHEADERS
_VULNERABLEHEADERS.fields_by_name['headers'].message_type = _VULNERABLEHEADERS_HEADER
_VULNERABLEHEADERS.fields_by_name['missing_headers'].message_type = _VULNERABLEHEADERS_HEADER
_XSS.fields_by_name['attack_vector'].enum_type = _XSS_ATTACKVECTOR
_XSS_ATTACKVECTOR.containing_type = _XSS
DESCRIPTOR.message_types_by_name['Form'] = _FORM
DESCRIPTOR.message_types_by_name['OutdatedLibrary'] = _OUTDATEDLIBRARY
DESCRIPTOR.message_types_by_name['ViolatingResource'] = _VIOLATINGRESOURCE
DESCRIPTOR.message_types_by_name['VulnerableParameters'] = _VULNERABLEPARAMETERS
DESCRIPTOR.message_types_by_name['VulnerableHeaders'] = _VULNERABLEHEADERS
DESCRIPTOR.message_types_by_name['Xss'] = _XSS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Form = _reflection.GeneratedProtocolMessageType('Form', (_message.Message,), {
  'DESCRIPTOR' : _FORM,
  '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.Form)
  })
_sym_db.RegisterMessage(Form)

OutdatedLibrary = _reflection.GeneratedProtocolMessageType('OutdatedLibrary', (_message.Message,), {
  'DESCRIPTOR' : _OUTDATEDLIBRARY,
  '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.OutdatedLibrary)
  })
_sym_db.RegisterMessage(OutdatedLibrary)

ViolatingResource = _reflection.GeneratedProtocolMessageType('ViolatingResource', (_message.Message,), {
  'DESCRIPTOR' : _VIOLATINGRESOURCE,
  '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.ViolatingResource)
  })
_sym_db.RegisterMessage(ViolatingResource)

VulnerableParameters = _reflection.GeneratedProtocolMessageType('VulnerableParameters', (_message.Message,), {
  'DESCRIPTOR' : _VULNERABLEPARAMETERS,
  '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.VulnerableParameters)
  })
_sym_db.RegisterMessage(VulnerableParameters)

VulnerableHeaders = _reflection.GeneratedProtocolMessageType('VulnerableHeaders', (_message.Message,), {

  'Header' : _reflection.GeneratedProtocolMessageType('Header', (_message.Message,), {
    'DESCRIPTOR' : _VULNERABLEHEADERS_HEADER,
    '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.VulnerableHeaders.Header)
    })
  ,
  'DESCRIPTOR' : _VULNERABLEHEADERS,
  '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.VulnerableHeaders)
  })
_sym_db.RegisterMessage(VulnerableHeaders)
_sym_db.RegisterMessage(VulnerableHeaders.Header)

Xss = _reflection.GeneratedProtocolMessageType('Xss', (_message.Message,), {
  'DESCRIPTOR' : _XSS,
  '__module__' : 'google.cloud.websecurityscanner.v1.finding_addon_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.Xss)
  })
_sym_db.RegisterMessage(Xss)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
