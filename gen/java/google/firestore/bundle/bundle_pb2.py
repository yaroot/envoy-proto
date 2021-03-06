# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/bundle/bundle.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.firestore.v1 import document_pb2 as google_dot_firestore_dot_v1_dot_document__pb2
from google.firestore.v1 import query_pb2 as google_dot_firestore_dot_v1_dot_query__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/firestore/bundle/bundle.proto',
  package='google.firestore.bundle',
  syntax='proto3',
  serialized_options=b'\n\033com.google.firestore.bundleB\013BundleProtoP\001Z5google.golang.org/genproto/firestore/bundle;firestore\242\002\005FSTPB\252\002\020Firestore.Bundle\312\002\020Firestore\\Bundle',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$google/firestore/bundle/bundle.proto\x12\x17google.firestore.bundle\x1a\"google/firestore/v1/document.proto\x1a\x1fgoogle/firestore/v1/query.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd5\x01\n\x0c\x42undledQuery\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12@\n\x10structured_query\x18\x02 \x01(\x0b\x32$.google.firestore.v1.StructuredQueryH\x00\x12\x43\n\nlimit_type\x18\x03 \x01(\x0e\x32/.google.firestore.bundle.BundledQuery.LimitType\" \n\tLimitType\x12\t\n\x05\x46IRST\x10\x00\x12\x08\n\x04LAST\x10\x01\x42\x0c\n\nquery_type\"\x87\x01\n\nNamedQuery\x12\x0c\n\x04name\x18\x01 \x01(\t\x12<\n\rbundled_query\x18\x02 \x01(\x0b\x32%.google.firestore.bundle.BundledQuery\x12-\n\tread_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"w\n\x17\x42undledDocumentMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12-\n\tread_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06\x65xists\x18\x03 \x01(\x08\x12\x0f\n\x07queries\x18\x04 \x03(\t\"\x8c\x01\n\x0e\x42undleMetadata\x12\n\n\x02id\x18\x01 \x01(\t\x12/\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0f\n\x07version\x18\x03 \x01(\r\x12\x17\n\x0ftotal_documents\x18\x04 \x01(\r\x12\x13\n\x0btotal_bytes\x18\x05 \x01(\x04\"\x9a\x02\n\rBundleElement\x12;\n\x08metadata\x18\x01 \x01(\x0b\x32\'.google.firestore.bundle.BundleMetadataH\x00\x12:\n\x0bnamed_query\x18\x02 \x01(\x0b\x32#.google.firestore.bundle.NamedQueryH\x00\x12M\n\x11\x64ocument_metadata\x18\x03 \x01(\x0b\x32\x30.google.firestore.bundle.BundledDocumentMetadataH\x00\x12\x31\n\x08\x64ocument\x18\x04 \x01(\x0b\x32\x1d.google.firestore.v1.DocumentH\x00\x42\x0e\n\x0c\x65lement_typeB\x91\x01\n\x1b\x63om.google.firestore.bundleB\x0b\x42undleProtoP\x01Z5google.golang.org/genproto/firestore/bundle;firestore\xa2\x02\x05\x46STPB\xaa\x02\x10\x46irestore.Bundle\xca\x02\x10\x46irestore\\Bundleb\x06proto3'
  ,
  dependencies=[google_dot_firestore_dot_v1_dot_document__pb2.DESCRIPTOR,google_dot_firestore_dot_v1_dot_query__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])



_BUNDLEDQUERY_LIMITTYPE = _descriptor.EnumDescriptor(
  name='LimitType',
  full_name='google.firestore.bundle.BundledQuery.LimitType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='FIRST', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LAST', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=335,
  serialized_end=367,
)
_sym_db.RegisterEnumDescriptor(_BUNDLEDQUERY_LIMITTYPE)


_BUNDLEDQUERY = _descriptor.Descriptor(
  name='BundledQuery',
  full_name='google.firestore.bundle.BundledQuery',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.firestore.bundle.BundledQuery.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='structured_query', full_name='google.firestore.bundle.BundledQuery.structured_query', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit_type', full_name='google.firestore.bundle.BundledQuery.limit_type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _BUNDLEDQUERY_LIMITTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='query_type', full_name='google.firestore.bundle.BundledQuery.query_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=168,
  serialized_end=381,
)


_NAMEDQUERY = _descriptor.Descriptor(
  name='NamedQuery',
  full_name='google.firestore.bundle.NamedQuery',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.firestore.bundle.NamedQuery.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bundled_query', full_name='google.firestore.bundle.NamedQuery.bundled_query', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_time', full_name='google.firestore.bundle.NamedQuery.read_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=384,
  serialized_end=519,
)


_BUNDLEDDOCUMENTMETADATA = _descriptor.Descriptor(
  name='BundledDocumentMetadata',
  full_name='google.firestore.bundle.BundledDocumentMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.firestore.bundle.BundledDocumentMetadata.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_time', full_name='google.firestore.bundle.BundledDocumentMetadata.read_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exists', full_name='google.firestore.bundle.BundledDocumentMetadata.exists', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='queries', full_name='google.firestore.bundle.BundledDocumentMetadata.queries', index=3,
      number=4, type=9, cpp_type=9, label=3,
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
  serialized_start=521,
  serialized_end=640,
)


_BUNDLEMETADATA = _descriptor.Descriptor(
  name='BundleMetadata',
  full_name='google.firestore.bundle.BundleMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.firestore.bundle.BundleMetadata.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.firestore.bundle.BundleMetadata.create_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='google.firestore.bundle.BundleMetadata.version', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_documents', full_name='google.firestore.bundle.BundleMetadata.total_documents', index=3,
      number=4, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_bytes', full_name='google.firestore.bundle.BundleMetadata.total_bytes', index=4,
      number=5, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=643,
  serialized_end=783,
)


_BUNDLEELEMENT = _descriptor.Descriptor(
  name='BundleElement',
  full_name='google.firestore.bundle.BundleElement',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.firestore.bundle.BundleElement.metadata', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='named_query', full_name='google.firestore.bundle.BundleElement.named_query', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='document_metadata', full_name='google.firestore.bundle.BundleElement.document_metadata', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='document', full_name='google.firestore.bundle.BundleElement.document', index=3,
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
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='element_type', full_name='google.firestore.bundle.BundleElement.element_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=786,
  serialized_end=1068,
)

_BUNDLEDQUERY.fields_by_name['structured_query'].message_type = google_dot_firestore_dot_v1_dot_query__pb2._STRUCTUREDQUERY
_BUNDLEDQUERY.fields_by_name['limit_type'].enum_type = _BUNDLEDQUERY_LIMITTYPE
_BUNDLEDQUERY_LIMITTYPE.containing_type = _BUNDLEDQUERY
_BUNDLEDQUERY.oneofs_by_name['query_type'].fields.append(
  _BUNDLEDQUERY.fields_by_name['structured_query'])
_BUNDLEDQUERY.fields_by_name['structured_query'].containing_oneof = _BUNDLEDQUERY.oneofs_by_name['query_type']
_NAMEDQUERY.fields_by_name['bundled_query'].message_type = _BUNDLEDQUERY
_NAMEDQUERY.fields_by_name['read_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_BUNDLEDDOCUMENTMETADATA.fields_by_name['read_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_BUNDLEMETADATA.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_BUNDLEELEMENT.fields_by_name['metadata'].message_type = _BUNDLEMETADATA
_BUNDLEELEMENT.fields_by_name['named_query'].message_type = _NAMEDQUERY
_BUNDLEELEMENT.fields_by_name['document_metadata'].message_type = _BUNDLEDDOCUMENTMETADATA
_BUNDLEELEMENT.fields_by_name['document'].message_type = google_dot_firestore_dot_v1_dot_document__pb2._DOCUMENT
_BUNDLEELEMENT.oneofs_by_name['element_type'].fields.append(
  _BUNDLEELEMENT.fields_by_name['metadata'])
_BUNDLEELEMENT.fields_by_name['metadata'].containing_oneof = _BUNDLEELEMENT.oneofs_by_name['element_type']
_BUNDLEELEMENT.oneofs_by_name['element_type'].fields.append(
  _BUNDLEELEMENT.fields_by_name['named_query'])
_BUNDLEELEMENT.fields_by_name['named_query'].containing_oneof = _BUNDLEELEMENT.oneofs_by_name['element_type']
_BUNDLEELEMENT.oneofs_by_name['element_type'].fields.append(
  _BUNDLEELEMENT.fields_by_name['document_metadata'])
_BUNDLEELEMENT.fields_by_name['document_metadata'].containing_oneof = _BUNDLEELEMENT.oneofs_by_name['element_type']
_BUNDLEELEMENT.oneofs_by_name['element_type'].fields.append(
  _BUNDLEELEMENT.fields_by_name['document'])
_BUNDLEELEMENT.fields_by_name['document'].containing_oneof = _BUNDLEELEMENT.oneofs_by_name['element_type']
DESCRIPTOR.message_types_by_name['BundledQuery'] = _BUNDLEDQUERY
DESCRIPTOR.message_types_by_name['NamedQuery'] = _NAMEDQUERY
DESCRIPTOR.message_types_by_name['BundledDocumentMetadata'] = _BUNDLEDDOCUMENTMETADATA
DESCRIPTOR.message_types_by_name['BundleMetadata'] = _BUNDLEMETADATA
DESCRIPTOR.message_types_by_name['BundleElement'] = _BUNDLEELEMENT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BundledQuery = _reflection.GeneratedProtocolMessageType('BundledQuery', (_message.Message,), {
  'DESCRIPTOR' : _BUNDLEDQUERY,
  '__module__' : 'google.firestore.bundle.bundle_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.bundle.BundledQuery)
  })
_sym_db.RegisterMessage(BundledQuery)

NamedQuery = _reflection.GeneratedProtocolMessageType('NamedQuery', (_message.Message,), {
  'DESCRIPTOR' : _NAMEDQUERY,
  '__module__' : 'google.firestore.bundle.bundle_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.bundle.NamedQuery)
  })
_sym_db.RegisterMessage(NamedQuery)

BundledDocumentMetadata = _reflection.GeneratedProtocolMessageType('BundledDocumentMetadata', (_message.Message,), {
  'DESCRIPTOR' : _BUNDLEDDOCUMENTMETADATA,
  '__module__' : 'google.firestore.bundle.bundle_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.bundle.BundledDocumentMetadata)
  })
_sym_db.RegisterMessage(BundledDocumentMetadata)

BundleMetadata = _reflection.GeneratedProtocolMessageType('BundleMetadata', (_message.Message,), {
  'DESCRIPTOR' : _BUNDLEMETADATA,
  '__module__' : 'google.firestore.bundle.bundle_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.bundle.BundleMetadata)
  })
_sym_db.RegisterMessage(BundleMetadata)

BundleElement = _reflection.GeneratedProtocolMessageType('BundleElement', (_message.Message,), {
  'DESCRIPTOR' : _BUNDLEELEMENT,
  '__module__' : 'google.firestore.bundle.bundle_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.bundle.BundleElement)
  })
_sym_db.RegisterMessage(BundleElement)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
