# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/beyondcorp/clientgateways/v1/client_gateways_service.proto
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
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nGgoogle/cloud/beyondcorp/clientgateways/v1/client_gateways_service.proto\x12)google.cloud.beyondcorp.clientgateways.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xfd\x03\n\rClientGateway\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12R\n\x05state\x18\x04 \x01(\x0e\x32>.google.cloud.beyondcorp.clientgateways.v1.ClientGateway.StateB\x03\xe0\x41\x03\x12\x0f\n\x02id\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12%\n\x18\x63lient_connector_service\x18\x06 \x01(\tB\x03\xe0\x41\x03\"j\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x0c\n\x08UPDATING\x10\x02\x12\x0c\n\x08\x44\x45LETING\x10\x03\x12\x0b\n\x07RUNNING\x10\x04\x12\x08\n\x04\x44OWN\x10\x05\x12\t\n\x05\x45RROR\x10\x06:u\xea\x41r\n\'beyondcorp.googleapis.com/ClientGateway\x12Gprojects/{project}/locations/{location}/clientGateways/{client_gateway}\"\xb9\x01\n\x19ListClientGatewaysRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\x12\'beyondcorp.googleapis.com/ClientGateway\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06\x66ilter\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x15\n\x08order_by\x18\x05 \x01(\tB\x03\xe0\x41\x01\"\x9d\x01\n\x1aListClientGatewaysResponse\x12Q\n\x0f\x63lient_gateways\x18\x01 \x03(\x0b\x32\x38.google.cloud.beyondcorp.clientgateways.v1.ClientGateway\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"X\n\x17GetClientGatewayRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'beyondcorp.googleapis.com/ClientGateway\"\x89\x02\n\x1a\x43reateClientGatewayRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\x12\'beyondcorp.googleapis.com/ClientGateway\x12\x1e\n\x11\x63lient_gateway_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12U\n\x0e\x63lient_gateway\x18\x03 \x01(\x0b\x32\x38.google.cloud.beyondcorp.clientgateways.v1.ClientGatewayB\x03\xe0\x41\x02\x12\x17\n\nrequest_id\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rvalidate_only\x18\x05 \x01(\x08\x42\x03\xe0\x41\x01\"\x90\x01\n\x1a\x44\x65leteClientGatewayRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'beyondcorp.googleapis.com/ClientGateway\x12\x17\n\nrequest_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rvalidate_only\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x8d\x02\n\x1e\x43lientGatewayOperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0estatus_message\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12#\n\x16requested_cancellation\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\x32\xc7\x08\n\x15\x43lientGatewaysService\x12\xe6\x01\n\x12ListClientGateways\x12\x44.google.cloud.beyondcorp.clientgateways.v1.ListClientGatewaysRequest\x1a\x45.google.cloud.beyondcorp.clientgateways.v1.ListClientGatewaysResponse\"C\x82\xd3\xe4\x93\x02\x34\x12\x32/v1/{parent=projects/*/locations/*}/clientGateways\xda\x41\x06parent\x12\xd3\x01\n\x10GetClientGateway\x12\x42.google.cloud.beyondcorp.clientgateways.v1.GetClientGatewayRequest\x1a\x38.google.cloud.beyondcorp.clientgateways.v1.ClientGateway\"A\x82\xd3\xe4\x93\x02\x34\x12\x32/v1/{name=projects/*/locations/*/clientGateways/*}\xda\x41\x04name\x12\xa4\x02\n\x13\x43reateClientGateway\x12\x45.google.cloud.beyondcorp.clientgateways.v1.CreateClientGatewayRequest\x1a\x1d.google.longrunning.Operation\"\xa6\x01\x82\xd3\xe4\x93\x02\x44\"2/v1/{parent=projects/*/locations/*}/clientGateways:\x0e\x63lient_gateway\xda\x41\'parent,client_gateway,client_gateway_id\xca\x41/\n\rClientGateway\x12\x1e\x43lientGatewayOperationMetadata\x12\xf8\x01\n\x13\x44\x65leteClientGateway\x12\x45.google.cloud.beyondcorp.clientgateways.v1.DeleteClientGatewayRequest\x1a\x1d.google.longrunning.Operation\"{\x82\xd3\xe4\x93\x02\x34*2/v1/{name=projects/*/locations/*/clientGateways/*}\xda\x41\x04name\xca\x41\x37\n\x15google.protobuf.Empty\x12\x1e\x43lientGatewayOperationMetadata\x1aM\xca\x41\x19\x62\x65yondcorp.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xae\x02\n-com.google.cloud.beyondcorp.clientgateways.v1B\x1a\x43lientGatewaysServiceProtoP\x01ZWgoogle.golang.org/genproto/googleapis/cloud/beyondcorp/clientgateways/v1;clientgateways\xaa\x02)Google.Cloud.BeyondCorp.ClientGateways.V1\xca\x02)Google\\Cloud\\BeyondCorp\\ClientGateways\\V1\xea\x02-Google::Cloud::BeyondCorp::ClientGateways::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.beyondcorp.clientgateways.v1.client_gateways_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n-com.google.cloud.beyondcorp.clientgateways.v1B\032ClientGatewaysServiceProtoP\001ZWgoogle.golang.org/genproto/googleapis/cloud/beyondcorp/clientgateways/v1;clientgateways\252\002)Google.Cloud.BeyondCorp.ClientGateways.V1\312\002)Google\\Cloud\\BeyondCorp\\ClientGateways\\V1\352\002-Google::Cloud::BeyondCorp::ClientGateways::V1'
  _CLIENTGATEWAY.fields_by_name['name']._options = None
  _CLIENTGATEWAY.fields_by_name['name']._serialized_options = b'\340A\002'
  _CLIENTGATEWAY.fields_by_name['create_time']._options = None
  _CLIENTGATEWAY.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _CLIENTGATEWAY.fields_by_name['update_time']._options = None
  _CLIENTGATEWAY.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _CLIENTGATEWAY.fields_by_name['state']._options = None
  _CLIENTGATEWAY.fields_by_name['state']._serialized_options = b'\340A\003'
  _CLIENTGATEWAY.fields_by_name['id']._options = None
  _CLIENTGATEWAY.fields_by_name['id']._serialized_options = b'\340A\003'
  _CLIENTGATEWAY.fields_by_name['client_connector_service']._options = None
  _CLIENTGATEWAY.fields_by_name['client_connector_service']._serialized_options = b'\340A\003'
  _CLIENTGATEWAY._options = None
  _CLIENTGATEWAY._serialized_options = b'\352Ar\n\'beyondcorp.googleapis.com/ClientGateway\022Gprojects/{project}/locations/{location}/clientGateways/{client_gateway}'
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['parent']._options = None
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\022\'beyondcorp.googleapis.com/ClientGateway'
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['page_size']._options = None
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['page_token']._options = None
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['filter']._options = None
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['filter']._serialized_options = b'\340A\001'
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['order_by']._options = None
  _LISTCLIENTGATEWAYSREQUEST.fields_by_name['order_by']._serialized_options = b'\340A\001'
  _GETCLIENTGATEWAYREQUEST.fields_by_name['name']._options = None
  _GETCLIENTGATEWAYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'beyondcorp.googleapis.com/ClientGateway'
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['parent']._options = None
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\022\'beyondcorp.googleapis.com/ClientGateway'
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['client_gateway_id']._options = None
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['client_gateway_id']._serialized_options = b'\340A\001'
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['client_gateway']._options = None
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['client_gateway']._serialized_options = b'\340A\002'
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['request_id']._options = None
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['request_id']._serialized_options = b'\340A\001'
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['validate_only']._options = None
  _CREATECLIENTGATEWAYREQUEST.fields_by_name['validate_only']._serialized_options = b'\340A\001'
  _DELETECLIENTGATEWAYREQUEST.fields_by_name['name']._options = None
  _DELETECLIENTGATEWAYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'beyondcorp.googleapis.com/ClientGateway'
  _DELETECLIENTGATEWAYREQUEST.fields_by_name['request_id']._options = None
  _DELETECLIENTGATEWAYREQUEST.fields_by_name['request_id']._serialized_options = b'\340A\001'
  _DELETECLIENTGATEWAYREQUEST.fields_by_name['validate_only']._options = None
  _DELETECLIENTGATEWAYREQUEST.fields_by_name['validate_only']._serialized_options = b'\340A\001'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['create_time']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['end_time']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['target']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['verb']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['status_message']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['status_message']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['requested_cancellation']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['requested_cancellation']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['api_version']._options = None
  _CLIENTGATEWAYOPERATIONMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _CLIENTGATEWAYSSERVICE._options = None
  _CLIENTGATEWAYSSERVICE._serialized_options = b'\312A\031beyondcorp.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _CLIENTGATEWAYSSERVICE.methods_by_name['ListClientGateways']._options = None
  _CLIENTGATEWAYSSERVICE.methods_by_name['ListClientGateways']._serialized_options = b'\202\323\344\223\0024\0222/v1/{parent=projects/*/locations/*}/clientGateways\332A\006parent'
  _CLIENTGATEWAYSSERVICE.methods_by_name['GetClientGateway']._options = None
  _CLIENTGATEWAYSSERVICE.methods_by_name['GetClientGateway']._serialized_options = b'\202\323\344\223\0024\0222/v1/{name=projects/*/locations/*/clientGateways/*}\332A\004name'
  _CLIENTGATEWAYSSERVICE.methods_by_name['CreateClientGateway']._options = None
  _CLIENTGATEWAYSSERVICE.methods_by_name['CreateClientGateway']._serialized_options = b'\202\323\344\223\002D\"2/v1/{parent=projects/*/locations/*}/clientGateways:\016client_gateway\332A\'parent,client_gateway,client_gateway_id\312A/\n\rClientGateway\022\036ClientGatewayOperationMetadata'
  _CLIENTGATEWAYSSERVICE.methods_by_name['DeleteClientGateway']._options = None
  _CLIENTGATEWAYSSERVICE.methods_by_name['DeleteClientGateway']._serialized_options = b'\202\323\344\223\0024*2/v1/{name=projects/*/locations/*/clientGateways/*}\332A\004name\312A7\n\025google.protobuf.Empty\022\036ClientGatewayOperationMetadata'
  _CLIENTGATEWAY._serialized_start=304
  _CLIENTGATEWAY._serialized_end=813
  _CLIENTGATEWAY_STATE._serialized_start=588
  _CLIENTGATEWAY_STATE._serialized_end=694
  _LISTCLIENTGATEWAYSREQUEST._serialized_start=816
  _LISTCLIENTGATEWAYSREQUEST._serialized_end=1001
  _LISTCLIENTGATEWAYSRESPONSE._serialized_start=1004
  _LISTCLIENTGATEWAYSRESPONSE._serialized_end=1161
  _GETCLIENTGATEWAYREQUEST._serialized_start=1163
  _GETCLIENTGATEWAYREQUEST._serialized_end=1251
  _CREATECLIENTGATEWAYREQUEST._serialized_start=1254
  _CREATECLIENTGATEWAYREQUEST._serialized_end=1519
  _DELETECLIENTGATEWAYREQUEST._serialized_start=1522
  _DELETECLIENTGATEWAYREQUEST._serialized_end=1666
  _CLIENTGATEWAYOPERATIONMETADATA._serialized_start=1669
  _CLIENTGATEWAYOPERATIONMETADATA._serialized_end=1938
  _CLIENTGATEWAYSSERVICE._serialized_start=1941
  _CLIENTGATEWAYSSERVICE._serialized_end=3036
# @@protoc_insertion_point(module_scope)
