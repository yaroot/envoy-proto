# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/v1/result_set.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.spanner.v1 import query_plan_pb2 as google_dot_spanner_dot_v1_dot_query__plan__pb2
from google.spanner.v1 import transaction_pb2 as google_dot_spanner_dot_v1_dot_transaction__pb2
from google.spanner.v1 import type_pb2 as google_dot_spanner_dot_v1_dot_type__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/spanner/v1/result_set.proto',
  package='google.spanner.v1',
  syntax='proto3',
  serialized_options=b'\n\025com.google.spanner.v1B\016ResultSetProtoP\001Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\370\001\001\252\002\027Google.Cloud.Spanner.V1\312\002\027Google\\Cloud\\Spanner\\V1\352\002\032Google::Cloud::Spanner::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\"google/spanner/v1/result_set.proto\x12\x11google.spanner.v1\x1a\x1cgoogle/protobuf/struct.proto\x1a\"google/spanner/v1/query_plan.proto\x1a#google/spanner/v1/transaction.proto\x1a\x1cgoogle/spanner/v1/type.proto\x1a\x1cgoogle/api/annotations.proto\"\x9f\x01\n\tResultSet\x12\x36\n\x08metadata\x18\x01 \x01(\x0b\x32$.google.spanner.v1.ResultSetMetadata\x12(\n\x04rows\x18\x02 \x03(\x0b\x32\x1a.google.protobuf.ListValue\x12\x30\n\x05stats\x18\x03 \x01(\x0b\x32!.google.spanner.v1.ResultSetStats\"\xd1\x01\n\x10PartialResultSet\x12\x36\n\x08metadata\x18\x01 \x01(\x0b\x32$.google.spanner.v1.ResultSetMetadata\x12&\n\x06values\x18\x02 \x03(\x0b\x32\x16.google.protobuf.Value\x12\x15\n\rchunked_value\x18\x03 \x01(\x08\x12\x14\n\x0cresume_token\x18\x04 \x01(\x0c\x12\x30\n\x05stats\x18\x05 \x01(\x0b\x32!.google.spanner.v1.ResultSetStats\"y\n\x11ResultSetMetadata\x12/\n\x08row_type\x18\x01 \x01(\x0b\x32\x1d.google.spanner.v1.StructType\x12\x33\n\x0btransaction\x18\x02 \x01(\x0b\x32\x1e.google.spanner.v1.Transaction\"\xb9\x01\n\x0eResultSetStats\x12\x30\n\nquery_plan\x18\x01 \x01(\x0b\x32\x1c.google.spanner.v1.QueryPlan\x12,\n\x0bquery_stats\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x19\n\x0frow_count_exact\x18\x03 \x01(\x03H\x00\x12\x1f\n\x15row_count_lower_bound\x18\x04 \x01(\x03H\x00\x42\x0b\n\trow_countB\xb7\x01\n\x15\x63om.google.spanner.v1B\x0eResultSetProtoP\x01Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\xf8\x01\x01\xaa\x02\x17Google.Cloud.Spanner.V1\xca\x02\x17Google\\Cloud\\Spanner\\V1\xea\x02\x1aGoogle::Cloud::Spanner::V1b\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_spanner_dot_v1_dot_query__plan__pb2.DESCRIPTOR,google_dot_spanner_dot_v1_dot_transaction__pb2.DESCRIPTOR,google_dot_spanner_dot_v1_dot_type__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_RESULTSET = _descriptor.Descriptor(
  name='ResultSet',
  full_name='google.spanner.v1.ResultSet',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.spanner.v1.ResultSet.metadata', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rows', full_name='google.spanner.v1.ResultSet.rows', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stats', full_name='google.spanner.v1.ResultSet.stats', index=2,
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
  serialized_start=221,
  serialized_end=380,
)


_PARTIALRESULTSET = _descriptor.Descriptor(
  name='PartialResultSet',
  full_name='google.spanner.v1.PartialResultSet',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.spanner.v1.PartialResultSet.metadata', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='values', full_name='google.spanner.v1.PartialResultSet.values', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='chunked_value', full_name='google.spanner.v1.PartialResultSet.chunked_value', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resume_token', full_name='google.spanner.v1.PartialResultSet.resume_token', index=3,
      number=4, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stats', full_name='google.spanner.v1.PartialResultSet.stats', index=4,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_start=383,
  serialized_end=592,
)


_RESULTSETMETADATA = _descriptor.Descriptor(
  name='ResultSetMetadata',
  full_name='google.spanner.v1.ResultSetMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='row_type', full_name='google.spanner.v1.ResultSetMetadata.row_type', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transaction', full_name='google.spanner.v1.ResultSetMetadata.transaction', index=1,
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
  serialized_start=594,
  serialized_end=715,
)


_RESULTSETSTATS = _descriptor.Descriptor(
  name='ResultSetStats',
  full_name='google.spanner.v1.ResultSetStats',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='query_plan', full_name='google.spanner.v1.ResultSetStats.query_plan', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='query_stats', full_name='google.spanner.v1.ResultSetStats.query_stats', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='row_count_exact', full_name='google.spanner.v1.ResultSetStats.row_count_exact', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='row_count_lower_bound', full_name='google.spanner.v1.ResultSetStats.row_count_lower_bound', index=3,
      number=4, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='row_count', full_name='google.spanner.v1.ResultSetStats.row_count',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=718,
  serialized_end=903,
)

_RESULTSET.fields_by_name['metadata'].message_type = _RESULTSETMETADATA
_RESULTSET.fields_by_name['rows'].message_type = google_dot_protobuf_dot_struct__pb2._LISTVALUE
_RESULTSET.fields_by_name['stats'].message_type = _RESULTSETSTATS
_PARTIALRESULTSET.fields_by_name['metadata'].message_type = _RESULTSETMETADATA
_PARTIALRESULTSET.fields_by_name['values'].message_type = google_dot_protobuf_dot_struct__pb2._VALUE
_PARTIALRESULTSET.fields_by_name['stats'].message_type = _RESULTSETSTATS
_RESULTSETMETADATA.fields_by_name['row_type'].message_type = google_dot_spanner_dot_v1_dot_type__pb2._STRUCTTYPE
_RESULTSETMETADATA.fields_by_name['transaction'].message_type = google_dot_spanner_dot_v1_dot_transaction__pb2._TRANSACTION
_RESULTSETSTATS.fields_by_name['query_plan'].message_type = google_dot_spanner_dot_v1_dot_query__plan__pb2._QUERYPLAN
_RESULTSETSTATS.fields_by_name['query_stats'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_RESULTSETSTATS.oneofs_by_name['row_count'].fields.append(
  _RESULTSETSTATS.fields_by_name['row_count_exact'])
_RESULTSETSTATS.fields_by_name['row_count_exact'].containing_oneof = _RESULTSETSTATS.oneofs_by_name['row_count']
_RESULTSETSTATS.oneofs_by_name['row_count'].fields.append(
  _RESULTSETSTATS.fields_by_name['row_count_lower_bound'])
_RESULTSETSTATS.fields_by_name['row_count_lower_bound'].containing_oneof = _RESULTSETSTATS.oneofs_by_name['row_count']
DESCRIPTOR.message_types_by_name['ResultSet'] = _RESULTSET
DESCRIPTOR.message_types_by_name['PartialResultSet'] = _PARTIALRESULTSET
DESCRIPTOR.message_types_by_name['ResultSetMetadata'] = _RESULTSETMETADATA
DESCRIPTOR.message_types_by_name['ResultSetStats'] = _RESULTSETSTATS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ResultSet = _reflection.GeneratedProtocolMessageType('ResultSet', (_message.Message,), {
  'DESCRIPTOR' : _RESULTSET,
  '__module__' : 'google.spanner.v1.result_set_pb2'
  # @@protoc_insertion_point(class_scope:google.spanner.v1.ResultSet)
  })
_sym_db.RegisterMessage(ResultSet)

PartialResultSet = _reflection.GeneratedProtocolMessageType('PartialResultSet', (_message.Message,), {
  'DESCRIPTOR' : _PARTIALRESULTSET,
  '__module__' : 'google.spanner.v1.result_set_pb2'
  # @@protoc_insertion_point(class_scope:google.spanner.v1.PartialResultSet)
  })
_sym_db.RegisterMessage(PartialResultSet)

ResultSetMetadata = _reflection.GeneratedProtocolMessageType('ResultSetMetadata', (_message.Message,), {
  'DESCRIPTOR' : _RESULTSETMETADATA,
  '__module__' : 'google.spanner.v1.result_set_pb2'
  # @@protoc_insertion_point(class_scope:google.spanner.v1.ResultSetMetadata)
  })
_sym_db.RegisterMessage(ResultSetMetadata)

ResultSetStats = _reflection.GeneratedProtocolMessageType('ResultSetStats', (_message.Message,), {
  'DESCRIPTOR' : _RESULTSETSTATS,
  '__module__' : 'google.spanner.v1.result_set_pb2'
  # @@protoc_insertion_point(class_scope:google.spanner.v1.ResultSetStats)
  })
_sym_db.RegisterMessage(ResultSetStats)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
