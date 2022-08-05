# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networkmanagement/v1beta1/reachability.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.networkmanagement.v1beta1 import connectivity_test_pb2 as google_dot_cloud_dot_networkmanagement_dot_v1beta1_dot_connectivity__test__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/cloud/networkmanagement/v1beta1/reachability.proto\x12&google.cloud.networkmanagement.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a>google/cloud/networkmanagement/v1beta1/connectivity_test.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"|\n\x1cListConnectivityTestsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x9a\x01\n\x1dListConnectivityTestsResponse\x12K\n\tresources\x18\x01 \x03(\x0b\x32\x38.google.cloud.networkmanagement.v1beta1.ConnectivityTest\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"/\n\x1aGetConnectivityTestRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\x9b\x01\n\x1d\x43reateConnectivityTestRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x07test_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12O\n\x08resource\x18\x03 \x01(\x0b\x32\x38.google.cloud.networkmanagement.v1beta1.ConnectivityTestB\x03\xe0\x41\x02\"\xa6\x01\n\x1dUpdateConnectivityTestRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12O\n\x08resource\x18\x02 \x01(\x0b\x32\x38.google.cloud.networkmanagement.v1beta1.ConnectivityTestB\x03\xe0\x41\x02\"2\n\x1d\x44\x65leteConnectivityTestRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"1\n\x1cRerunConnectivityTestRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\xd6\x01\n\x11OperationMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06target\x18\x03 \x01(\t\x12\x0c\n\x04verb\x18\x04 \x01(\t\x12\x15\n\rstatus_detail\x18\x05 \x01(\t\x12\x18\n\x10\x63\x61ncel_requested\x18\x06 \x01(\x08\x12\x13\n\x0b\x61pi_version\x18\x07 \x01(\t2\xa3\r\n\x13ReachabilityService\x12\xed\x01\n\x15ListConnectivityTests\x12\x44.google.cloud.networkmanagement.v1beta1.ListConnectivityTestsRequest\x1a\x45.google.cloud.networkmanagement.v1beta1.ListConnectivityTestsResponse\"G\x82\xd3\xe4\x93\x02\x41\x12?/v1beta1/{parent=projects/*/locations/global}/connectivityTests\x12\xdc\x01\n\x13GetConnectivityTest\x12\x42.google.cloud.networkmanagement.v1beta1.GetConnectivityTestRequest\x1a\x38.google.cloud.networkmanagement.v1beta1.ConnectivityTest\"G\x82\xd3\xe4\x93\x02\x41\x12?/v1beta1/{name=projects/*/locations/global/connectivityTests/*}\x12\xa1\x02\n\x16\x43reateConnectivityTest\x12\x45.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest\x1a\x1d.google.longrunning.Operation\"\xa0\x01\x82\xd3\xe4\x93\x02K\"?/v1beta1/{parent=projects/*/locations/global}/connectivityTests:\x08resource\xca\x41L\n7google.cloud.networkmanagement.v1beta1.ConnectivityTest\x12\x11OperationMetadata\x12\xaa\x02\n\x16UpdateConnectivityTest\x12\x45.google.cloud.networkmanagement.v1beta1.UpdateConnectivityTestRequest\x1a\x1d.google.longrunning.Operation\"\xa9\x01\x82\xd3\xe4\x93\x02T2H/v1beta1/{resource.name=projects/*/locations/global/connectivityTests/*}:\x08resource\xca\x41L\n7google.cloud.networkmanagement.v1beta1.ConnectivityTest\x12\x11OperationMetadata\x12\x9e\x02\n\x15RerunConnectivityTest\x12\x44.google.cloud.networkmanagement.v1beta1.RerunConnectivityTestRequest\x1a\x1d.google.longrunning.Operation\"\x9f\x01\x82\xd3\xe4\x93\x02J\"E/v1beta1/{name=projects/*/locations/global/connectivityTests/*}:rerun:\x01*\xca\x41L\n7google.cloud.networkmanagement.v1beta1.ConnectivityTest\x12\x11OperationMetadata\x12\xf4\x01\n\x16\x44\x65leteConnectivityTest\x12\x45.google.cloud.networkmanagement.v1beta1.DeleteConnectivityTestRequest\x1a\x1d.google.longrunning.Operation\"t\x82\xd3\xe4\x93\x02\x41*?/v1beta1/{name=projects/*/locations/global/connectivityTests/*}\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x1aT\xca\x41 networkmanagement.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x9f\x02\n*com.google.cloud.networkmanagement.v1beta1B\x18ReachabilityServiceProtoP\x01ZWgoogle.golang.org/genproto/googleapis/cloud/networkmanagement/v1beta1;networkmanagement\xaa\x02&Google.Cloud.NetworkManagement.V1Beta1\xca\x02&Google\\Cloud\\NetworkManagement\\V1beta1\xea\x02)Google::Cloud::NetworkManagement::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.networkmanagement.v1beta1.reachability_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.networkmanagement.v1beta1B\030ReachabilityServiceProtoP\001ZWgoogle.golang.org/genproto/googleapis/cloud/networkmanagement/v1beta1;networkmanagement\252\002&Google.Cloud.NetworkManagement.V1Beta1\312\002&Google\\Cloud\\NetworkManagement\\V1beta1\352\002)Google::Cloud::NetworkManagement::V1beta1'
  _LISTCONNECTIVITYTESTSREQUEST.fields_by_name['parent']._options = None
  _LISTCONNECTIVITYTESTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _GETCONNECTIVITYTESTREQUEST.fields_by_name['name']._options = None
  _GETCONNECTIVITYTESTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _CREATECONNECTIVITYTESTREQUEST.fields_by_name['parent']._options = None
  _CREATECONNECTIVITYTESTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _CREATECONNECTIVITYTESTREQUEST.fields_by_name['test_id']._options = None
  _CREATECONNECTIVITYTESTREQUEST.fields_by_name['test_id']._serialized_options = b'\340A\002'
  _CREATECONNECTIVITYTESTREQUEST.fields_by_name['resource']._options = None
  _CREATECONNECTIVITYTESTREQUEST.fields_by_name['resource']._serialized_options = b'\340A\002'
  _UPDATECONNECTIVITYTESTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATECONNECTIVITYTESTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATECONNECTIVITYTESTREQUEST.fields_by_name['resource']._options = None
  _UPDATECONNECTIVITYTESTREQUEST.fields_by_name['resource']._serialized_options = b'\340A\002'
  _DELETECONNECTIVITYTESTREQUEST.fields_by_name['name']._options = None
  _DELETECONNECTIVITYTESTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _RERUNCONNECTIVITYTESTREQUEST.fields_by_name['name']._options = None
  _RERUNCONNECTIVITYTESTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _REACHABILITYSERVICE._options = None
  _REACHABILITYSERVICE._serialized_options = b'\312A networkmanagement.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _REACHABILITYSERVICE.methods_by_name['ListConnectivityTests']._options = None
  _REACHABILITYSERVICE.methods_by_name['ListConnectivityTests']._serialized_options = b'\202\323\344\223\002A\022?/v1beta1/{parent=projects/*/locations/global}/connectivityTests'
  _REACHABILITYSERVICE.methods_by_name['GetConnectivityTest']._options = None
  _REACHABILITYSERVICE.methods_by_name['GetConnectivityTest']._serialized_options = b'\202\323\344\223\002A\022?/v1beta1/{name=projects/*/locations/global/connectivityTests/*}'
  _REACHABILITYSERVICE.methods_by_name['CreateConnectivityTest']._options = None
  _REACHABILITYSERVICE.methods_by_name['CreateConnectivityTest']._serialized_options = b'\202\323\344\223\002K\"?/v1beta1/{parent=projects/*/locations/global}/connectivityTests:\010resource\312AL\n7google.cloud.networkmanagement.v1beta1.ConnectivityTest\022\021OperationMetadata'
  _REACHABILITYSERVICE.methods_by_name['UpdateConnectivityTest']._options = None
  _REACHABILITYSERVICE.methods_by_name['UpdateConnectivityTest']._serialized_options = b'\202\323\344\223\002T2H/v1beta1/{resource.name=projects/*/locations/global/connectivityTests/*}:\010resource\312AL\n7google.cloud.networkmanagement.v1beta1.ConnectivityTest\022\021OperationMetadata'
  _REACHABILITYSERVICE.methods_by_name['RerunConnectivityTest']._options = None
  _REACHABILITYSERVICE.methods_by_name['RerunConnectivityTest']._serialized_options = b'\202\323\344\223\002J\"E/v1beta1/{name=projects/*/locations/global/connectivityTests/*}:rerun:\001*\312AL\n7google.cloud.networkmanagement.v1beta1.ConnectivityTest\022\021OperationMetadata'
  _REACHABILITYSERVICE.methods_by_name['DeleteConnectivityTest']._options = None
  _REACHABILITYSERVICE.methods_by_name['DeleteConnectivityTest']._serialized_options = b'\202\323\344\223\002A*?/v1beta1/{name=projects/*/locations/global/connectivityTests/*}\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _LISTCONNECTIVITYTESTSREQUEST._serialized_start=384
  _LISTCONNECTIVITYTESTSREQUEST._serialized_end=508
  _LISTCONNECTIVITYTESTSRESPONSE._serialized_start=511
  _LISTCONNECTIVITYTESTSRESPONSE._serialized_end=665
  _GETCONNECTIVITYTESTREQUEST._serialized_start=667
  _GETCONNECTIVITYTESTREQUEST._serialized_end=714
  _CREATECONNECTIVITYTESTREQUEST._serialized_start=717
  _CREATECONNECTIVITYTESTREQUEST._serialized_end=872
  _UPDATECONNECTIVITYTESTREQUEST._serialized_start=875
  _UPDATECONNECTIVITYTESTREQUEST._serialized_end=1041
  _DELETECONNECTIVITYTESTREQUEST._serialized_start=1043
  _DELETECONNECTIVITYTESTREQUEST._serialized_end=1093
  _RERUNCONNECTIVITYTESTREQUEST._serialized_start=1095
  _RERUNCONNECTIVITYTESTREQUEST._serialized_end=1144
  _OPERATIONMETADATA._serialized_start=1147
  _OPERATIONMETADATA._serialized_end=1361
  _REACHABILITYSERVICE._serialized_start=1364
  _REACHABILITYSERVICE._serialized_end=3063
# @@protoc_insertion_point(module_scope)
