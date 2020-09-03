# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/storage/v1beta2/stream.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.bigquery.storage.v1beta2 import arrow_pb2 as google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_arrow__pb2
from google.cloud.bigquery.storage.v1beta2 import avro_pb2 as google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_avro__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/bigquery/storage/v1beta2/stream.proto',
  package='google.cloud.bigquery.storage.v1beta2',
  syntax='proto3',
  serialized_options=b'\n)com.google.cloud.bigquery.storage.v1beta2B\013StreamProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1beta2;storage\352AU\n\035bigquery.googleapis.com/Table\0224projects/{project}/datasets/{dataset}/tables/{table}',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/cloud/bigquery/storage/v1beta2/stream.proto\x12%google.cloud.bigquery.storage.v1beta2\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x31google/cloud/bigquery/storage/v1beta2/arrow.proto\x1a\x30google/cloud/bigquery/storage/v1beta2/avro.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xf2\x07\n\x0bReadSession\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x65xpire_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12K\n\x0b\x64\x61ta_format\x18\x03 \x01(\x0e\x32\x31.google.cloud.bigquery.storage.v1beta2.DataFormatB\x03\xe0\x41\x05\x12M\n\x0b\x61vro_schema\x18\x04 \x01(\x0b\x32\x31.google.cloud.bigquery.storage.v1beta2.AvroSchemaB\x03\xe0\x41\x03H\x00\x12O\n\x0c\x61rrow_schema\x18\x05 \x01(\x0b\x32\x32.google.cloud.bigquery.storage.v1beta2.ArrowSchemaB\x03\xe0\x41\x03H\x00\x12\x34\n\x05table\x18\x06 \x01(\tB%\xe0\x41\x05\xfa\x41\x1f\n\x1d\x62igquery.googleapis.com/Table\x12_\n\x0ftable_modifiers\x18\x07 \x01(\x0b\x32\x41.google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiersB\x03\xe0\x41\x01\x12^\n\x0cread_options\x18\x08 \x01(\x0b\x32\x43.google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptionsB\x03\xe0\x41\x01\x12G\n\x07streams\x18\n \x03(\x0b\x32\x31.google.cloud.bigquery.storage.v1beta2.ReadStreamB\x03\xe0\x41\x03\x1a\x43\n\x0eTableModifiers\x12\x31\n\rsnapshot_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1a\xb0\x01\n\x10TableReadOptions\x12\x17\n\x0fselected_fields\x18\x01 \x03(\t\x12\x17\n\x0frow_restriction\x18\x02 \x01(\t\x12j\n\x1b\x61rrow_serialization_options\x18\x03 \x01(\x0b\x32@.google.cloud.bigquery.storage.v1beta2.ArrowSerializationOptionsB\x03\xe0\x41\x01:k\xea\x41h\n*bigquerystorage.googleapis.com/ReadSession\x12:projects/{project}/locations/{location}/sessions/{session}B\x08\n\x06schema\"\x9c\x01\n\nReadStream\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03:{\xea\x41x\n)bigquerystorage.googleapis.com/ReadStream\x12Kprojects/{project}/locations/{location}/sessions/{session}/streams/{stream}*>\n\nDataFormat\x12\x1b\n\x17\x44\x41TA_FORMAT_UNSPECIFIED\x10\x00\x12\x08\n\x04\x41VRO\x10\x01\x12\t\n\x05\x41RROW\x10\x02\x42\xe0\x01\n)com.google.cloud.bigquery.storage.v1beta2B\x0bStreamProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1beta2;storage\xea\x41U\n\x1d\x62igquery.googleapis.com/Table\x12\x34projects/{project}/datasets/{dataset}/tables/{table}b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_arrow__pb2.DESCRIPTOR,google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_avro__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])

_DATAFORMAT = _descriptor.EnumDescriptor(
  name='DataFormat',
  full_name='google.cloud.bigquery.storage.v1beta2.DataFormat',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DATA_FORMAT_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AVRO', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ARROW', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1459,
  serialized_end=1521,
)
_sym_db.RegisterEnumDescriptor(_DATAFORMAT)

DataFormat = enum_type_wrapper.EnumTypeWrapper(_DATAFORMAT)
DATA_FORMAT_UNSPECIFIED = 0
AVRO = 1
ARROW = 2



_READSESSION_TABLEMODIFIERS = _descriptor.Descriptor(
  name='TableModifiers',
  full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiers',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='snapshot_time', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiers.snapshot_time', index=0,
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
  serialized_start=933,
  serialized_end=1000,
)

_READSESSION_TABLEREADOPTIONS = _descriptor.Descriptor(
  name='TableReadOptions',
  full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='selected_fields', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions.selected_fields', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='row_restriction', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions.row_restriction', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='arrow_serialization_options', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions.arrow_serialization_options', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=1003,
  serialized_end=1179,
)

_READSESSION = _descriptor.Descriptor(
  name='ReadSession',
  full_name='google.cloud.bigquery.storage.v1beta2.ReadSession',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='expire_time', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.expire_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data_format', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.data_format', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='avro_schema', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.avro_schema', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='arrow_schema', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.arrow_schema', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='table', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.table', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\037\n\035bigquery.googleapis.com/Table', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='table_modifiers', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.table_modifiers', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_options', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.read_options', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='streams', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.streams', index=8,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_READSESSION_TABLEMODIFIERS, _READSESSION_TABLEREADOPTIONS, ],
  enum_types=[
  ],
  serialized_options=b'\352Ah\n*bigquerystorage.googleapis.com/ReadSession\022:projects/{project}/locations/{location}/sessions/{session}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='schema', full_name='google.cloud.bigquery.storage.v1beta2.ReadSession.schema',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=288,
  serialized_end=1298,
)


_READSTREAM = _descriptor.Descriptor(
  name='ReadStream',
  full_name='google.cloud.bigquery.storage.v1beta2.ReadStream',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.bigquery.storage.v1beta2.ReadStream.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352Ax\n)bigquerystorage.googleapis.com/ReadStream\022Kprojects/{project}/locations/{location}/sessions/{session}/streams/{stream}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1301,
  serialized_end=1457,
)

_READSESSION_TABLEMODIFIERS.fields_by_name['snapshot_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_READSESSION_TABLEMODIFIERS.containing_type = _READSESSION
_READSESSION_TABLEREADOPTIONS.fields_by_name['arrow_serialization_options'].message_type = google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_arrow__pb2._ARROWSERIALIZATIONOPTIONS
_READSESSION_TABLEREADOPTIONS.containing_type = _READSESSION
_READSESSION.fields_by_name['expire_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_READSESSION.fields_by_name['data_format'].enum_type = _DATAFORMAT
_READSESSION.fields_by_name['avro_schema'].message_type = google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_avro__pb2._AVROSCHEMA
_READSESSION.fields_by_name['arrow_schema'].message_type = google_dot_cloud_dot_bigquery_dot_storage_dot_v1beta2_dot_arrow__pb2._ARROWSCHEMA
_READSESSION.fields_by_name['table_modifiers'].message_type = _READSESSION_TABLEMODIFIERS
_READSESSION.fields_by_name['read_options'].message_type = _READSESSION_TABLEREADOPTIONS
_READSESSION.fields_by_name['streams'].message_type = _READSTREAM
_READSESSION.oneofs_by_name['schema'].fields.append(
  _READSESSION.fields_by_name['avro_schema'])
_READSESSION.fields_by_name['avro_schema'].containing_oneof = _READSESSION.oneofs_by_name['schema']
_READSESSION.oneofs_by_name['schema'].fields.append(
  _READSESSION.fields_by_name['arrow_schema'])
_READSESSION.fields_by_name['arrow_schema'].containing_oneof = _READSESSION.oneofs_by_name['schema']
DESCRIPTOR.message_types_by_name['ReadSession'] = _READSESSION
DESCRIPTOR.message_types_by_name['ReadStream'] = _READSTREAM
DESCRIPTOR.enum_types_by_name['DataFormat'] = _DATAFORMAT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ReadSession = _reflection.GeneratedProtocolMessageType('ReadSession', (_message.Message,), {

  'TableModifiers' : _reflection.GeneratedProtocolMessageType('TableModifiers', (_message.Message,), {
    'DESCRIPTOR' : _READSESSION_TABLEMODIFIERS,
    '__module__' : 'google.cloud.bigquery.storage.v1beta2.stream_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiers)
    })
  ,

  'TableReadOptions' : _reflection.GeneratedProtocolMessageType('TableReadOptions', (_message.Message,), {
    'DESCRIPTOR' : _READSESSION_TABLEREADOPTIONS,
    '__module__' : 'google.cloud.bigquery.storage.v1beta2.stream_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions)
    })
  ,
  'DESCRIPTOR' : _READSESSION,
  '__module__' : 'google.cloud.bigquery.storage.v1beta2.stream_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.ReadSession)
  })
_sym_db.RegisterMessage(ReadSession)
_sym_db.RegisterMessage(ReadSession.TableModifiers)
_sym_db.RegisterMessage(ReadSession.TableReadOptions)

ReadStream = _reflection.GeneratedProtocolMessageType('ReadStream', (_message.Message,), {
  'DESCRIPTOR' : _READSTREAM,
  '__module__' : 'google.cloud.bigquery.storage.v1beta2.stream_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.ReadStream)
  })
_sym_db.RegisterMessage(ReadStream)


DESCRIPTOR._options = None
_READSESSION_TABLEREADOPTIONS.fields_by_name['arrow_serialization_options']._options = None
_READSESSION.fields_by_name['name']._options = None
_READSESSION.fields_by_name['expire_time']._options = None
_READSESSION.fields_by_name['data_format']._options = None
_READSESSION.fields_by_name['avro_schema']._options = None
_READSESSION.fields_by_name['arrow_schema']._options = None
_READSESSION.fields_by_name['table']._options = None
_READSESSION.fields_by_name['table_modifiers']._options = None
_READSESSION.fields_by_name['read_options']._options = None
_READSESSION.fields_by_name['streams']._options = None
_READSESSION._options = None
_READSTREAM.fields_by_name['name']._options = None
_READSTREAM._options = None
# @@protoc_insertion_point(module_scope)
