# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networksecurity/v1/client_tls_policy.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.networksecurity.v1 import tls_pb2 as google_dot_cloud_dot_networksecurity_dot_v1_dot_tls__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7google/cloud/networksecurity/v1/client_tls_policy.proto\x12\x1fgoogle.cloud.networksecurity.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a)google/cloud/networksecurity/v1/tls.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xec\x04\n\x0f\x43lientTlsPolicy\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12Q\n\x06labels\x18\x05 \x03(\x0b\x32<.google.cloud.networksecurity.v1.ClientTlsPolicy.LabelsEntryB\x03\xe0\x41\x01\x12\x10\n\x03sni\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12U\n\x12\x63lient_certificate\x18\x07 \x01(\x0b\x32\x34.google.cloud.networksecurity.v1.CertificateProviderB\x03\xe0\x41\x01\x12P\n\x14server_validation_ca\x18\x08 \x03(\x0b\x32-.google.cloud.networksecurity.v1.ValidationCAB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x82\x01\xea\x41\x7f\n.networksecurity.googleapis.com/ClientTlsPolicy\x12Mprojects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}\"\x80\x01\n\x1cListClientTlsPoliciesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x87\x01\n\x1dListClientTlsPoliciesResponse\x12M\n\x13\x63lient_tls_policies\x18\x01 \x03(\x0b\x32\x30.google.cloud.networksecurity.v1.ClientTlsPolicy\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"a\n\x19GetClientTlsPolicyRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.networksecurity.googleapis.com/ClientTlsPolicy\"\xdb\x01\n\x1c\x43reateClientTlsPolicyRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\x12.networksecurity.googleapis.com/ClientTlsPolicy\x12!\n\x14\x63lient_tls_policy_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12P\n\x11\x63lient_tls_policy\x18\x03 \x01(\x0b\x32\x30.google.cloud.networksecurity.v1.ClientTlsPolicyB\x03\xe0\x41\x02\"\xa6\x01\n\x1cUpdateClientTlsPolicyRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12P\n\x11\x63lient_tls_policy\x18\x02 \x01(\x0b\x32\x30.google.cloud.networksecurity.v1.ClientTlsPolicyB\x03\xe0\x41\x02\"d\n\x1c\x44\x65leteClientTlsPolicyRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.networksecurity.googleapis.com/ClientTlsPolicyB\xf6\x01\n#com.google.cloud.networksecurity.v1B\x14\x43lientTlsPolicyProtoP\x01ZNgoogle.golang.org/genproto/googleapis/cloud/networksecurity/v1;networksecurity\xaa\x02\x1fGoogle.Cloud.NetworkSecurity.V1\xca\x02\x1fGoogle\\Cloud\\NetworkSecurity\\V1\xea\x02\"Google::Cloud::NetworkSecurity::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.networksecurity.v1.client_tls_policy_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.networksecurity.v1B\024ClientTlsPolicyProtoP\001ZNgoogle.golang.org/genproto/googleapis/cloud/networksecurity/v1;networksecurity\252\002\037Google.Cloud.NetworkSecurity.V1\312\002\037Google\\Cloud\\NetworkSecurity\\V1\352\002\"Google::Cloud::NetworkSecurity::V1'
  _CLIENTTLSPOLICY_LABELSENTRY._options = None
  _CLIENTTLSPOLICY_LABELSENTRY._serialized_options = b'8\001'
  _CLIENTTLSPOLICY.fields_by_name['name']._options = None
  _CLIENTTLSPOLICY.fields_by_name['name']._serialized_options = b'\340A\002'
  _CLIENTTLSPOLICY.fields_by_name['description']._options = None
  _CLIENTTLSPOLICY.fields_by_name['description']._serialized_options = b'\340A\001'
  _CLIENTTLSPOLICY.fields_by_name['create_time']._options = None
  _CLIENTTLSPOLICY.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _CLIENTTLSPOLICY.fields_by_name['update_time']._options = None
  _CLIENTTLSPOLICY.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _CLIENTTLSPOLICY.fields_by_name['labels']._options = None
  _CLIENTTLSPOLICY.fields_by_name['labels']._serialized_options = b'\340A\001'
  _CLIENTTLSPOLICY.fields_by_name['sni']._options = None
  _CLIENTTLSPOLICY.fields_by_name['sni']._serialized_options = b'\340A\001'
  _CLIENTTLSPOLICY.fields_by_name['client_certificate']._options = None
  _CLIENTTLSPOLICY.fields_by_name['client_certificate']._serialized_options = b'\340A\001'
  _CLIENTTLSPOLICY.fields_by_name['server_validation_ca']._options = None
  _CLIENTTLSPOLICY.fields_by_name['server_validation_ca']._serialized_options = b'\340A\001'
  _CLIENTTLSPOLICY._options = None
  _CLIENTTLSPOLICY._serialized_options = b'\352A\177\n.networksecurity.googleapis.com/ClientTlsPolicy\022Mprojects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}'
  _LISTCLIENTTLSPOLICIESREQUEST.fields_by_name['parent']._options = None
  _LISTCLIENTTLSPOLICIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _GETCLIENTTLSPOLICYREQUEST.fields_by_name['name']._options = None
  _GETCLIENTTLSPOLICYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.networksecurity.googleapis.com/ClientTlsPolicy'
  _CREATECLIENTTLSPOLICYREQUEST.fields_by_name['parent']._options = None
  _CREATECLIENTTLSPOLICYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\022.networksecurity.googleapis.com/ClientTlsPolicy'
  _CREATECLIENTTLSPOLICYREQUEST.fields_by_name['client_tls_policy_id']._options = None
  _CREATECLIENTTLSPOLICYREQUEST.fields_by_name['client_tls_policy_id']._serialized_options = b'\340A\002'
  _CREATECLIENTTLSPOLICYREQUEST.fields_by_name['client_tls_policy']._options = None
  _CREATECLIENTTLSPOLICYREQUEST.fields_by_name['client_tls_policy']._serialized_options = b'\340A\002'
  _UPDATECLIENTTLSPOLICYREQUEST.fields_by_name['update_mask']._options = None
  _UPDATECLIENTTLSPOLICYREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATECLIENTTLSPOLICYREQUEST.fields_by_name['client_tls_policy']._options = None
  _UPDATECLIENTTLSPOLICYREQUEST.fields_by_name['client_tls_policy']._serialized_options = b'\340A\002'
  _DELETECLIENTTLSPOLICYREQUEST.fields_by_name['name']._options = None
  _DELETECLIENTTLSPOLICYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.networksecurity.googleapis.com/ClientTlsPolicy'
  _CLIENTTLSPOLICY._serialized_start=263
  _CLIENTTLSPOLICY._serialized_end=883
  _CLIENTTLSPOLICY_LABELSENTRY._serialized_start=705
  _CLIENTTLSPOLICY_LABELSENTRY._serialized_end=750
  _LISTCLIENTTLSPOLICIESREQUEST._serialized_start=886
  _LISTCLIENTTLSPOLICIESREQUEST._serialized_end=1014
  _LISTCLIENTTLSPOLICIESRESPONSE._serialized_start=1017
  _LISTCLIENTTLSPOLICIESRESPONSE._serialized_end=1152
  _GETCLIENTTLSPOLICYREQUEST._serialized_start=1154
  _GETCLIENTTLSPOLICYREQUEST._serialized_end=1251
  _CREATECLIENTTLSPOLICYREQUEST._serialized_start=1254
  _CREATECLIENTTLSPOLICYREQUEST._serialized_end=1473
  _UPDATECLIENTTLSPOLICYREQUEST._serialized_start=1476
  _UPDATECLIENTTLSPOLICYREQUEST._serialized_end=1642
  _DELETECLIENTTLSPOLICYREQUEST._serialized_start=1644
  _DELETECLIENTTLSPOLICYREQUEST._serialized_end=1744
# @@protoc_insertion_point(module_scope)
