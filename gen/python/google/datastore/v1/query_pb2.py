# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.datastore.v1 import entity_pb2 as google_dot_datastore_dot_v1_dot_entity__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fgoogle/datastore/v1/query.proto\x12\x13google.datastore.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a google/datastore/v1/entity.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xe0\x01\n\x0c\x45ntityResult\x12+\n\x06\x65ntity\x18\x01 \x01(\x0b\x32\x1b.google.datastore.v1.Entity\x12\x0f\n\x07version\x18\x04 \x01(\x03\x12/\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06\x63ursor\x18\x03 \x01(\x0c\"Q\n\nResultType\x12\x1b\n\x17RESULT_TYPE_UNSPECIFIED\x10\x00\x12\x08\n\x04\x46ULL\x10\x01\x12\x0e\n\nPROJECTION\x10\x02\x12\x0c\n\x08KEY_ONLY\x10\x03\"\xf2\x02\n\x05Query\x12\x33\n\nprojection\x18\x02 \x03(\x0b\x32\x1f.google.datastore.v1.Projection\x12\x31\n\x04kind\x18\x03 \x03(\x0b\x32#.google.datastore.v1.KindExpression\x12+\n\x06\x66ilter\x18\x04 \x01(\x0b\x32\x1b.google.datastore.v1.Filter\x12\x31\n\x05order\x18\x05 \x03(\x0b\x32\".google.datastore.v1.PropertyOrder\x12;\n\x0b\x64istinct_on\x18\x06 \x03(\x0b\x32&.google.datastore.v1.PropertyReference\x12\x14\n\x0cstart_cursor\x18\x07 \x01(\x0c\x12\x12\n\nend_cursor\x18\x08 \x01(\x0c\x12\x0e\n\x06offset\x18\n \x01(\x05\x12*\n\x05limit\x18\x0c \x01(\x0b\x32\x1b.google.protobuf.Int32Value\"\xd6\x02\n\x10\x41ggregationQuery\x12\x32\n\x0cnested_query\x18\x01 \x01(\x0b\x32\x1a.google.datastore.v1.QueryH\x00\x12L\n\x0c\x61ggregations\x18\x03 \x03(\x0b\x32\x31.google.datastore.v1.AggregationQuery.AggregationB\x03\xe0\x41\x01\x1a\xb1\x01\n\x0b\x41ggregation\x12H\n\x05\x63ount\x18\x01 \x01(\x0b\x32\x37.google.datastore.v1.AggregationQuery.Aggregation.CountH\x00\x12\x12\n\x05\x61lias\x18\x07 \x01(\tB\x03\xe0\x41\x01\x1a\x38\n\x05\x43ount\x12/\n\x05up_to\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x01\x42\n\n\x08operatorB\x0c\n\nquery_type\"\x1e\n\x0eKindExpression\x12\x0c\n\x04name\x18\x01 \x01(\t\"!\n\x11PropertyReference\x12\x0c\n\x04name\x18\x02 \x01(\t\"F\n\nProjection\x12\x38\n\x08property\x18\x01 \x01(\x0b\x32&.google.datastore.v1.PropertyReference\"\xd1\x01\n\rPropertyOrder\x12\x38\n\x08property\x18\x01 \x01(\x0b\x32&.google.datastore.v1.PropertyReference\x12?\n\tdirection\x18\x02 \x01(\x0e\x32,.google.datastore.v1.PropertyOrder.Direction\"E\n\tDirection\x12\x19\n\x15\x44IRECTION_UNSPECIFIED\x10\x00\x12\r\n\tASCENDING\x10\x01\x12\x0e\n\nDESCENDING\x10\x02\"\x99\x01\n\x06\x46ilter\x12@\n\x10\x63omposite_filter\x18\x01 \x01(\x0b\x32$.google.datastore.v1.CompositeFilterH\x00\x12>\n\x0fproperty_filter\x18\x02 \x01(\x0b\x32#.google.datastore.v1.PropertyFilterH\x00\x42\r\n\x0b\x66ilter_type\"\xa9\x01\n\x0f\x43ompositeFilter\x12\x39\n\x02op\x18\x01 \x01(\x0e\x32-.google.datastore.v1.CompositeFilter.Operator\x12,\n\x07\x66ilters\x18\x02 \x03(\x0b\x32\x1b.google.datastore.v1.Filter\"-\n\x08Operator\x12\x18\n\x14OPERATOR_UNSPECIFIED\x10\x00\x12\x07\n\x03\x41ND\x10\x01\"\xea\x02\n\x0ePropertyFilter\x12\x38\n\x08property\x18\x01 \x01(\x0b\x32&.google.datastore.v1.PropertyReference\x12\x38\n\x02op\x18\x02 \x01(\x0e\x32,.google.datastore.v1.PropertyFilter.Operator\x12)\n\x05value\x18\x03 \x01(\x0b\x32\x1a.google.datastore.v1.Value\"\xb8\x01\n\x08Operator\x12\x18\n\x14OPERATOR_UNSPECIFIED\x10\x00\x12\r\n\tLESS_THAN\x10\x01\x12\x16\n\x12LESS_THAN_OR_EQUAL\x10\x02\x12\x10\n\x0cGREATER_THAN\x10\x03\x12\x19\n\x15GREATER_THAN_OR_EQUAL\x10\x04\x12\t\n\x05\x45QUAL\x10\x05\x12\x06\n\x02IN\x10\x06\x12\r\n\tNOT_EQUAL\x10\t\x12\x10\n\x0cHAS_ANCESTOR\x10\x0b\x12\n\n\x06NOT_IN\x10\r\"\xa5\x02\n\x08GqlQuery\x12\x14\n\x0cquery_string\x18\x01 \x01(\t\x12\x16\n\x0e\x61llow_literals\x18\x02 \x01(\x08\x12H\n\x0enamed_bindings\x18\x05 \x03(\x0b\x32\x30.google.datastore.v1.GqlQuery.NamedBindingsEntry\x12\x43\n\x13positional_bindings\x18\x04 \x03(\x0b\x32&.google.datastore.v1.GqlQueryParameter\x1a\\\n\x12NamedBindingsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x35\n\x05value\x18\x02 \x01(\x0b\x32&.google.datastore.v1.GqlQueryParameter:\x02\x38\x01\"d\n\x11GqlQueryParameter\x12+\n\x05value\x18\x02 \x01(\x0b\x32\x1a.google.datastore.v1.ValueH\x00\x12\x10\n\x06\x63ursor\x18\x03 \x01(\x0cH\x00\x42\x10\n\x0eparameter_type\"\x8d\x04\n\x10QueryResultBatch\x12\x17\n\x0fskipped_results\x18\x06 \x01(\x05\x12\x16\n\x0eskipped_cursor\x18\x03 \x01(\x0c\x12H\n\x12\x65ntity_result_type\x18\x01 \x01(\x0e\x32,.google.datastore.v1.EntityResult.ResultType\x12\x39\n\x0e\x65ntity_results\x18\x02 \x03(\x0b\x32!.google.datastore.v1.EntityResult\x12\x12\n\nend_cursor\x18\x04 \x01(\x0c\x12K\n\x0cmore_results\x18\x05 \x01(\x0e\x32\x35.google.datastore.v1.QueryResultBatch.MoreResultsType\x12\x18\n\x10snapshot_version\x18\x07 \x01(\x03\x12-\n\tread_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\x98\x01\n\x0fMoreResultsType\x12!\n\x1dMORE_RESULTS_TYPE_UNSPECIFIED\x10\x00\x12\x10\n\x0cNOT_FINISHED\x10\x01\x12\x1c\n\x18MORE_RESULTS_AFTER_LIMIT\x10\x02\x12\x1d\n\x19MORE_RESULTS_AFTER_CURSOR\x10\x04\x12\x13\n\x0fNO_MORE_RESULTS\x10\x03\x42\xbc\x01\n\x17\x63om.google.datastore.v1B\nQueryProtoP\x01Z<google.golang.org/genproto/googleapis/datastore/v1;datastore\xaa\x02\x19Google.Cloud.Datastore.V1\xca\x02\x19Google\\Cloud\\Datastore\\V1\xea\x02\x1cGoogle::Cloud::Datastore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.datastore.v1.query_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.datastore.v1B\nQueryProtoP\001Z<google.golang.org/genproto/googleapis/datastore/v1;datastore\252\002\031Google.Cloud.Datastore.V1\312\002\031Google\\Cloud\\Datastore\\V1\352\002\034Google::Cloud::Datastore::V1'
  _AGGREGATIONQUERY_AGGREGATION_COUNT.fields_by_name['up_to']._options = None
  _AGGREGATIONQUERY_AGGREGATION_COUNT.fields_by_name['up_to']._serialized_options = b'\340A\001'
  _AGGREGATIONQUERY_AGGREGATION.fields_by_name['alias']._options = None
  _AGGREGATIONQUERY_AGGREGATION.fields_by_name['alias']._serialized_options = b'\340A\001'
  _AGGREGATIONQUERY.fields_by_name['aggregations']._options = None
  _AGGREGATIONQUERY.fields_by_name['aggregations']._serialized_options = b'\340A\001'
  _GQLQUERY_NAMEDBINDINGSENTRY._options = None
  _GQLQUERY_NAMEDBINDINGSENTRY._serialized_options = b'8\001'
  _ENTITYRESULT._serialized_start=189
  _ENTITYRESULT._serialized_end=413
  _ENTITYRESULT_RESULTTYPE._serialized_start=332
  _ENTITYRESULT_RESULTTYPE._serialized_end=413
  _QUERY._serialized_start=416
  _QUERY._serialized_end=786
  _AGGREGATIONQUERY._serialized_start=789
  _AGGREGATIONQUERY._serialized_end=1131
  _AGGREGATIONQUERY_AGGREGATION._serialized_start=940
  _AGGREGATIONQUERY_AGGREGATION._serialized_end=1117
  _AGGREGATIONQUERY_AGGREGATION_COUNT._serialized_start=1049
  _AGGREGATIONQUERY_AGGREGATION_COUNT._serialized_end=1105
  _KINDEXPRESSION._serialized_start=1133
  _KINDEXPRESSION._serialized_end=1163
  _PROPERTYREFERENCE._serialized_start=1165
  _PROPERTYREFERENCE._serialized_end=1198
  _PROJECTION._serialized_start=1200
  _PROJECTION._serialized_end=1270
  _PROPERTYORDER._serialized_start=1273
  _PROPERTYORDER._serialized_end=1482
  _PROPERTYORDER_DIRECTION._serialized_start=1413
  _PROPERTYORDER_DIRECTION._serialized_end=1482
  _FILTER._serialized_start=1485
  _FILTER._serialized_end=1638
  _COMPOSITEFILTER._serialized_start=1641
  _COMPOSITEFILTER._serialized_end=1810
  _COMPOSITEFILTER_OPERATOR._serialized_start=1765
  _COMPOSITEFILTER_OPERATOR._serialized_end=1810
  _PROPERTYFILTER._serialized_start=1813
  _PROPERTYFILTER._serialized_end=2175
  _PROPERTYFILTER_OPERATOR._serialized_start=1991
  _PROPERTYFILTER_OPERATOR._serialized_end=2175
  _GQLQUERY._serialized_start=2178
  _GQLQUERY._serialized_end=2471
  _GQLQUERY_NAMEDBINDINGSENTRY._serialized_start=2379
  _GQLQUERY_NAMEDBINDINGSENTRY._serialized_end=2471
  _GQLQUERYPARAMETER._serialized_start=2473
  _GQLQUERYPARAMETER._serialized_end=2573
  _QUERYRESULTBATCH._serialized_start=2576
  _QUERYRESULTBATCH._serialized_end=3101
  _QUERYRESULTBATCH_MORERESULTSTYPE._serialized_start=2949
  _QUERYRESULTBATCH_MORERESULTSTYPE._serialized_end=3101
# @@protoc_insertion_point(module_scope)