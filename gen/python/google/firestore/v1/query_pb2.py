# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.firestore.v1 import document_pb2 as google_dot_firestore_dot_v1_dot_document__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fgoogle/firestore/v1/query.proto\x12\x13google.firestore.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\"google/firestore/v1/document.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xb6\x0f\n\x0fStructuredQuery\x12?\n\x06select\x18\x01 \x01(\x0b\x32/.google.firestore.v1.StructuredQuery.Projection\x12\x45\n\x04\x66rom\x18\x02 \x03(\x0b\x32\x37.google.firestore.v1.StructuredQuery.CollectionSelector\x12:\n\x05where\x18\x03 \x01(\x0b\x32+.google.firestore.v1.StructuredQuery.Filter\x12<\n\x08order_by\x18\x04 \x03(\x0b\x32*.google.firestore.v1.StructuredQuery.Order\x12-\n\x08start_at\x18\x07 \x01(\x0b\x32\x1b.google.firestore.v1.Cursor\x12+\n\x06\x65nd_at\x18\x08 \x01(\x0b\x32\x1b.google.firestore.v1.Cursor\x12\x0e\n\x06offset\x18\x06 \x01(\x05\x12*\n\x05limit\x18\x05 \x01(\x0b\x32\x1b.google.protobuf.Int32Value\x1a\x44\n\x12\x43ollectionSelector\x12\x15\n\rcollection_id\x18\x02 \x01(\t\x12\x17\n\x0f\x61ll_descendants\x18\x03 \x01(\x08\x1a\xfd\x01\n\x06\x46ilter\x12P\n\x10\x63omposite_filter\x18\x01 \x01(\x0b\x32\x34.google.firestore.v1.StructuredQuery.CompositeFilterH\x00\x12H\n\x0c\x66ield_filter\x18\x02 \x01(\x0b\x32\x30.google.firestore.v1.StructuredQuery.FieldFilterH\x00\x12H\n\x0cunary_filter\x18\x03 \x01(\x0b\x32\x30.google.firestore.v1.StructuredQuery.UnaryFilterH\x00\x42\r\n\x0b\x66ilter_type\x1a\xc9\x01\n\x0f\x43ompositeFilter\x12I\n\x02op\x18\x01 \x01(\x0e\x32=.google.firestore.v1.StructuredQuery.CompositeFilter.Operator\x12<\n\x07\x66ilters\x18\x02 \x03(\x0b\x32+.google.firestore.v1.StructuredQuery.Filter\"-\n\x08Operator\x12\x18\n\x14OPERATOR_UNSPECIFIED\x10\x00\x12\x07\n\x03\x41ND\x10\x01\x1a\x98\x03\n\x0b\x46ieldFilter\x12\x42\n\x05\x66ield\x18\x01 \x01(\x0b\x32\x33.google.firestore.v1.StructuredQuery.FieldReference\x12\x45\n\x02op\x18\x02 \x01(\x0e\x32\x39.google.firestore.v1.StructuredQuery.FieldFilter.Operator\x12)\n\x05value\x18\x03 \x01(\x0b\x32\x1a.google.firestore.v1.Value\"\xd2\x01\n\x08Operator\x12\x18\n\x14OPERATOR_UNSPECIFIED\x10\x00\x12\r\n\tLESS_THAN\x10\x01\x12\x16\n\x12LESS_THAN_OR_EQUAL\x10\x02\x12\x10\n\x0cGREATER_THAN\x10\x03\x12\x19\n\x15GREATER_THAN_OR_EQUAL\x10\x04\x12\t\n\x05\x45QUAL\x10\x05\x12\r\n\tNOT_EQUAL\x10\x06\x12\x12\n\x0e\x41RRAY_CONTAINS\x10\x07\x12\x06\n\x02IN\x10\x08\x12\x16\n\x12\x41RRAY_CONTAINS_ANY\x10\t\x12\n\n\x06NOT_IN\x10\n\x1a\x8a\x02\n\x0bUnaryFilter\x12\x45\n\x02op\x18\x01 \x01(\x0e\x32\x39.google.firestore.v1.StructuredQuery.UnaryFilter.Operator\x12\x44\n\x05\x66ield\x18\x02 \x01(\x0b\x32\x33.google.firestore.v1.StructuredQuery.FieldReferenceH\x00\"^\n\x08Operator\x12\x18\n\x14OPERATOR_UNSPECIFIED\x10\x00\x12\n\n\x06IS_NAN\x10\x02\x12\x0b\n\x07IS_NULL\x10\x03\x12\x0e\n\nIS_NOT_NAN\x10\x04\x12\x0f\n\x0bIS_NOT_NULL\x10\x05\x42\x0e\n\x0coperand_type\x1a\x8e\x01\n\x05Order\x12\x42\n\x05\x66ield\x18\x01 \x01(\x0b\x32\x33.google.firestore.v1.StructuredQuery.FieldReference\x12\x41\n\tdirection\x18\x02 \x01(\x0e\x32..google.firestore.v1.StructuredQuery.Direction\x1a$\n\x0e\x46ieldReference\x12\x12\n\nfield_path\x18\x02 \x01(\t\x1aQ\n\nProjection\x12\x43\n\x06\x66ields\x18\x02 \x03(\x0b\x32\x33.google.firestore.v1.StructuredQuery.FieldReference\"E\n\tDirection\x12\x19\n\x15\x44IRECTION_UNSPECIFIED\x10\x00\x12\r\n\tASCENDING\x10\x01\x12\x0e\n\nDESCENDING\x10\x02\"D\n\x06\x43ursor\x12*\n\x06values\x18\x01 \x03(\x0b\x32\x1a.google.firestore.v1.Value\x12\x0e\n\x06\x62\x65\x66ore\x18\x02 \x01(\x08\x42\xc3\x01\n\x17\x63om.google.firestore.v1B\nQueryProtoP\x01Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\xa2\x02\x04GCFS\xaa\x02\x19Google.Cloud.Firestore.V1\xca\x02\x19Google\\Cloud\\Firestore\\V1\xea\x02\x1cGoogle::Cloud::Firestore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.v1.query_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.firestore.v1B\nQueryProtoP\001Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\242\002\004GCFS\252\002\031Google.Cloud.Firestore.V1\312\002\031Google\\Cloud\\Firestore\\V1\352\002\034Google::Cloud::Firestore::V1'
  _STRUCTUREDQUERY._serialized_start=158
  _STRUCTUREDQUERY._serialized_end=2132
  _STRUCTUREDQUERY_COLLECTIONSELECTOR._serialized_start=587
  _STRUCTUREDQUERY_COLLECTIONSELECTOR._serialized_end=655
  _STRUCTUREDQUERY_FILTER._serialized_start=658
  _STRUCTUREDQUERY_FILTER._serialized_end=911
  _STRUCTUREDQUERY_COMPOSITEFILTER._serialized_start=914
  _STRUCTUREDQUERY_COMPOSITEFILTER._serialized_end=1115
  _STRUCTUREDQUERY_COMPOSITEFILTER_OPERATOR._serialized_start=1070
  _STRUCTUREDQUERY_COMPOSITEFILTER_OPERATOR._serialized_end=1115
  _STRUCTUREDQUERY_FIELDFILTER._serialized_start=1118
  _STRUCTUREDQUERY_FIELDFILTER._serialized_end=1526
  _STRUCTUREDQUERY_FIELDFILTER_OPERATOR._serialized_start=1316
  _STRUCTUREDQUERY_FIELDFILTER_OPERATOR._serialized_end=1526
  _STRUCTUREDQUERY_UNARYFILTER._serialized_start=1529
  _STRUCTUREDQUERY_UNARYFILTER._serialized_end=1795
  _STRUCTUREDQUERY_UNARYFILTER_OPERATOR._serialized_start=1685
  _STRUCTUREDQUERY_UNARYFILTER_OPERATOR._serialized_end=1779
  _STRUCTUREDQUERY_ORDER._serialized_start=1798
  _STRUCTUREDQUERY_ORDER._serialized_end=1940
  _STRUCTUREDQUERY_FIELDREFERENCE._serialized_start=1942
  _STRUCTUREDQUERY_FIELDREFERENCE._serialized_end=1978
  _STRUCTUREDQUERY_PROJECTION._serialized_start=1980
  _STRUCTUREDQUERY_PROJECTION._serialized_end=2061
  _STRUCTUREDQUERY_DIRECTION._serialized_start=2063
  _STRUCTUREDQUERY_DIRECTION._serialized_end=2132
  _CURSOR._serialized_start=2134
  _CURSOR._serialized_end=2202
# @@protoc_insertion_point(module_scope)
