# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networkmanagement/v1beta1/connectivity_test.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.networkmanagement.v1beta1 import trace_pb2 as google_dot_cloud_dot_networkmanagement_dot_v1beta1_dot_trace__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/cloud/networkmanagement/v1beta1/connectivity_test.proto\x12&google.cloud.networkmanagement.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x32google/cloud/networkmanagement/v1beta1/trace.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xb1\x06\n\x10\x43onnectivityTest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x45\n\x06source\x18\x03 \x01(\x0b\x32\x30.google.cloud.networkmanagement.v1beta1.EndpointB\x03\xe0\x41\x02\x12J\n\x0b\x64\x65stination\x18\x04 \x01(\x0b\x32\x30.google.cloud.networkmanagement.v1beta1.EndpointB\x03\xe0\x41\x02\x12\x10\n\x08protocol\x18\x05 \x01(\t\x12\x18\n\x10related_projects\x18\x06 \x03(\t\x12\x19\n\x0c\x64isplay_name\x18\x07 \x01(\tB\x03\xe0\x41\x03\x12T\n\x06labels\x18\x08 \x03(\x0b\x32\x44.google.cloud.networkmanagement.v1beta1.ConnectivityTest.LabelsEntry\x12\x34\n\x0b\x63reate_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12^\n\x14reachability_details\x18\x0c \x01(\x0b\x32;.google.cloud.networkmanagement.v1beta1.ReachabilityDetailsB\x03\xe0\x41\x03\x12T\n\x0fprobing_details\x18\x0e \x01(\x0b\x32\x36.google.cloud.networkmanagement.v1beta1.ProbingDetailsB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:t\xea\x41q\n1networkmanagement.googleapis.com/ConnectivityTest\x12<projects/{project}/locations/global/connectivityTests/{test}\"\xc8\x03\n\x08\x45ndpoint\x12\x12\n\nip_address\x18\x01 \x01(\t\x12\x0c\n\x04port\x18\x02 \x01(\x05\x12\x10\n\x08instance\x18\x03 \x01(\t\x12\x1a\n\x12gke_master_cluster\x18\x07 \x01(\t\x12\x1a\n\x12\x63loud_sql_instance\x18\x08 \x01(\t\x12^\n\x0e\x63loud_function\x18\n \x01(\x0b\x32\x46.google.cloud.networkmanagement.v1beta1.Endpoint.CloudFunctionEndpoint\x12\x0f\n\x07network\x18\x04 \x01(\t\x12R\n\x0cnetwork_type\x18\x05 \x01(\x0e\x32<.google.cloud.networkmanagement.v1beta1.Endpoint.NetworkType\x12\x12\n\nproject_id\x18\x06 \x01(\t\x1a$\n\x15\x43loudFunctionEndpoint\x12\x0b\n\x03uri\x18\x01 \x01(\t\"Q\n\x0bNetworkType\x12\x1c\n\x18NETWORK_TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bGCP_NETWORK\x10\x01\x12\x13\n\x0fNON_GCP_NETWORK\x10\x02\"\xdf\x02\n\x13ReachabilityDetails\x12R\n\x06result\x18\x01 \x01(\x0e\x32\x42.google.cloud.networkmanagement.v1beta1.ReachabilityDetails.Result\x12/\n\x0bverify_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12!\n\x05\x65rror\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12=\n\x06traces\x18\x05 \x03(\x0b\x32-.google.cloud.networkmanagement.v1beta1.Trace\"a\n\x06Result\x12\x16\n\x12RESULT_UNSPECIFIED\x10\x00\x12\r\n\tREACHABLE\x10\x01\x12\x0f\n\x0bUNREACHABLE\x10\x02\x12\r\n\tAMBIGUOUS\x10\x04\x12\x10\n\x0cUNDETERMINED\x10\x05\"<\n\x11LatencyPercentile\x12\x0f\n\x07percent\x18\x01 \x01(\x05\x12\x16\n\x0elatency_micros\x18\x02 \x01(\x03\"m\n\x13LatencyDistribution\x12V\n\x13latency_percentiles\x18\x01 \x03(\x0b\x32\x39.google.cloud.networkmanagement.v1beta1.LatencyPercentile\"\xf7\x06\n\x0eProbingDetails\x12T\n\x06result\x18\x01 \x01(\x0e\x32\x44.google.cloud.networkmanagement.v1beta1.ProbingDetails.ProbingResult\x12/\n\x0bverify_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12!\n\x05\x65rror\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12]\n\x0b\x61\x62ort_cause\x18\x04 \x01(\x0e\x32H.google.cloud.networkmanagement.v1beta1.ProbingDetails.ProbingAbortCause\x12\x18\n\x10sent_probe_count\x18\x05 \x01(\x05\x12\x1e\n\x16successful_probe_count\x18\x06 \x01(\x05\x12K\n\rendpoint_info\x18\x07 \x01(\x0b\x32\x34.google.cloud.networkmanagement.v1beta1.EndpointInfo\x12T\n\x0fprobing_latency\x18\x08 \x01(\x0b\x32;.google.cloud.networkmanagement.v1beta1.LatencyDistribution\x12h\n\x1b\x64\x65stination_egress_location\x18\t \x01(\x0b\x32\x43.google.cloud.networkmanagement.v1beta1.ProbingDetails.EdgeLocation\x1a)\n\x0c\x45\x64geLocation\x12\x19\n\x11metropolitan_area\x18\x01 \x01(\t\"\x80\x01\n\rProbingResult\x12\x1e\n\x1aPROBING_RESULT_UNSPECIFIED\x10\x00\x12\r\n\tREACHABLE\x10\x01\x12\x0f\n\x0bUNREACHABLE\x10\x02\x12\x1d\n\x19REACHABILITY_INCONSISTENT\x10\x03\x12\x10\n\x0cUNDETERMINED\x10\x04\"g\n\x11ProbingAbortCause\x12#\n\x1fPROBING_ABORT_CAUSE_UNSPECIFIED\x10\x00\x12\x15\n\x11PERMISSION_DENIED\x10\x01\x12\x16\n\x12NO_SOURCE_LOCATION\x10\x02\x42\x95\x02\n*com.google.cloud.networkmanagement.v1beta1B\x0eTestOuterClassP\x01ZWgoogle.golang.org/genproto/googleapis/cloud/networkmanagement/v1beta1;networkmanagement\xaa\x02&Google.Cloud.NetworkManagement.V1Beta1\xca\x02&Google\\Cloud\\NetworkManagement\\V1beta1\xea\x02)Google::Cloud::NetworkManagement::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.networkmanagement.v1beta1.connectivity_test_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.networkmanagement.v1beta1B\016TestOuterClassP\001ZWgoogle.golang.org/genproto/googleapis/cloud/networkmanagement/v1beta1;networkmanagement\252\002&Google.Cloud.NetworkManagement.V1Beta1\312\002&Google\\Cloud\\NetworkManagement\\V1beta1\352\002)Google::Cloud::NetworkManagement::V1beta1'
  _CONNECTIVITYTEST_LABELSENTRY._options = None
  _CONNECTIVITYTEST_LABELSENTRY._serialized_options = b'8\001'
  _CONNECTIVITYTEST.fields_by_name['name']._options = None
  _CONNECTIVITYTEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _CONNECTIVITYTEST.fields_by_name['source']._options = None
  _CONNECTIVITYTEST.fields_by_name['source']._serialized_options = b'\340A\002'
  _CONNECTIVITYTEST.fields_by_name['destination']._options = None
  _CONNECTIVITYTEST.fields_by_name['destination']._serialized_options = b'\340A\002'
  _CONNECTIVITYTEST.fields_by_name['display_name']._options = None
  _CONNECTIVITYTEST.fields_by_name['display_name']._serialized_options = b'\340A\003'
  _CONNECTIVITYTEST.fields_by_name['create_time']._options = None
  _CONNECTIVITYTEST.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _CONNECTIVITYTEST.fields_by_name['update_time']._options = None
  _CONNECTIVITYTEST.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _CONNECTIVITYTEST.fields_by_name['reachability_details']._options = None
  _CONNECTIVITYTEST.fields_by_name['reachability_details']._serialized_options = b'\340A\003'
  _CONNECTIVITYTEST.fields_by_name['probing_details']._options = None
  _CONNECTIVITYTEST.fields_by_name['probing_details']._serialized_options = b'\340A\003'
  _CONNECTIVITYTEST._options = None
  _CONNECTIVITYTEST._serialized_options = b'\352Aq\n1networkmanagement.googleapis.com/ConnectivityTest\022<projects/{project}/locations/global/connectivityTests/{test}'
  _CONNECTIVITYTEST._serialized_start=307
  _CONNECTIVITYTEST._serialized_end=1124
  _CONNECTIVITYTEST_LABELSENTRY._serialized_start=961
  _CONNECTIVITYTEST_LABELSENTRY._serialized_end=1006
  _ENDPOINT._serialized_start=1127
  _ENDPOINT._serialized_end=1583
  _ENDPOINT_CLOUDFUNCTIONENDPOINT._serialized_start=1464
  _ENDPOINT_CLOUDFUNCTIONENDPOINT._serialized_end=1500
  _ENDPOINT_NETWORKTYPE._serialized_start=1502
  _ENDPOINT_NETWORKTYPE._serialized_end=1583
  _REACHABILITYDETAILS._serialized_start=1586
  _REACHABILITYDETAILS._serialized_end=1937
  _REACHABILITYDETAILS_RESULT._serialized_start=1840
  _REACHABILITYDETAILS_RESULT._serialized_end=1937
  _LATENCYPERCENTILE._serialized_start=1939
  _LATENCYPERCENTILE._serialized_end=1999
  _LATENCYDISTRIBUTION._serialized_start=2001
  _LATENCYDISTRIBUTION._serialized_end=2110
  _PROBINGDETAILS._serialized_start=2113
  _PROBINGDETAILS._serialized_end=3000
  _PROBINGDETAILS_EDGELOCATION._serialized_start=2723
  _PROBINGDETAILS_EDGELOCATION._serialized_end=2764
  _PROBINGDETAILS_PROBINGRESULT._serialized_start=2767
  _PROBINGDETAILS_PROBINGRESULT._serialized_end=2895
  _PROBINGDETAILS_PROBINGABORTCAUSE._serialized_start=2897
  _PROBINGDETAILS_PROBINGABORTCAUSE._serialized_end=3000
# @@protoc_insertion_point(module_scope)
