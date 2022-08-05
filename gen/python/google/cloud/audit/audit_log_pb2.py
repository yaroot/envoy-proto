# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/audit/audit_log.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.rpc.context import attribute_context_pb2 as google_dot_rpc_dot_context_dot_attribute__context__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"google/cloud/audit/audit_log.proto\x12\x12google.cloud.audit\x1a\x19google/protobuf/any.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a*google/rpc/context/attribute_context.proto\x1a\x17google/rpc/status.proto\"\xfe\x04\n\x08\x41uditLog\x12\x14\n\x0cservice_name\x18\x07 \x01(\t\x12\x13\n\x0bmethod_name\x18\x08 \x01(\t\x12\x15\n\rresource_name\x18\x0b \x01(\t\x12?\n\x11resource_location\x18\x14 \x01(\x0b\x32$.google.cloud.audit.ResourceLocation\x12\x38\n\x17resource_original_state\x18\x13 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x1a\n\x12num_response_items\x18\x0c \x01(\x03\x12\"\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\x12\x43\n\x13\x61uthentication_info\x18\x03 \x01(\x0b\x32&.google.cloud.audit.AuthenticationInfo\x12\x41\n\x12\x61uthorization_info\x18\t \x03(\x0b\x32%.google.cloud.audit.AuthorizationInfo\x12=\n\x10request_metadata\x18\x04 \x01(\x0b\x32#.google.cloud.audit.RequestMetadata\x12(\n\x07request\x18\x10 \x01(\x0b\x32\x17.google.protobuf.Struct\x12)\n\x08response\x18\x11 \x01(\x0b\x32\x17.google.protobuf.Struct\x12)\n\x08metadata\x18\x12 \x01(\x0b\x32\x17.google.protobuf.Struct\x12.\n\x0cservice_data\x18\x0f \x01(\x0b\x32\x14.google.protobuf.AnyB\x02\x18\x01\"\x99\x02\n\x12\x41uthenticationInfo\x12\x17\n\x0fprincipal_email\x18\x01 \x01(\t\x12\x1a\n\x12\x61uthority_selector\x18\x02 \x01(\t\x12\x36\n\x15third_party_principal\x18\x04 \x01(\x0b\x32\x17.google.protobuf.Struct\x12 \n\x18service_account_key_name\x18\x05 \x01(\t\x12Y\n\x1fservice_account_delegation_info\x18\x06 \x03(\x0b\x32\x30.google.cloud.audit.ServiceAccountDelegationInfo\x12\x19\n\x11principal_subject\x18\x08 \x01(\t\"\x96\x01\n\x11\x41uthorizationInfo\x12\x10\n\x08resource\x18\x01 \x01(\t\x12\x12\n\npermission\x18\x02 \x01(\t\x12\x0f\n\x07granted\x18\x03 \x01(\x08\x12J\n\x13resource_attributes\x18\x05 \x01(\x0b\x32-.google.rpc.context.AttributeContext.Resource\"\xf5\x01\n\x0fRequestMetadata\x12\x11\n\tcaller_ip\x18\x01 \x01(\t\x12\"\n\x1a\x63\x61ller_supplied_user_agent\x18\x02 \x01(\t\x12\x16\n\x0e\x63\x61ller_network\x18\x03 \x01(\t\x12H\n\x12request_attributes\x18\x07 \x01(\x0b\x32,.google.rpc.context.AttributeContext.Request\x12I\n\x16\x64\x65stination_attributes\x18\x08 \x01(\x0b\x32).google.rpc.context.AttributeContext.Peer\"I\n\x10ResourceLocation\x12\x19\n\x11\x63urrent_locations\x18\x01 \x03(\t\x12\x1a\n\x12original_locations\x18\x02 \x03(\t\"\xc3\x03\n\x1cServiceAccountDelegationInfo\x12\x19\n\x11principal_subject\x18\x03 \x01(\t\x12\x65\n\x15\x66irst_party_principal\x18\x01 \x01(\x0b\x32\x44.google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipalH\x00\x12\x65\n\x15third_party_principal\x18\x02 \x01(\x0b\x32\x44.google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipalH\x00\x1a\x61\n\x13\x46irstPartyPrincipal\x12\x17\n\x0fprincipal_email\x18\x01 \x01(\t\x12\x31\n\x10service_metadata\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct\x1aJ\n\x13ThirdPartyPrincipal\x12\x33\n\x12third_party_claims\x18\x01 \x01(\x0b\x32\x17.google.protobuf.StructB\x0b\n\tAuthorityBe\n\x16\x63om.google.cloud.auditB\rAuditLogProtoP\x01Z7google.golang.org/genproto/googleapis/cloud/audit;audit\xf8\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.audit.audit_log_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.google.cloud.auditB\rAuditLogProtoP\001Z7google.golang.org/genproto/googleapis/cloud/audit;audit\370\001\001'
  _AUDITLOG.fields_by_name['service_data']._options = None
  _AUDITLOG.fields_by_name['service_data']._serialized_options = b'\030\001'
  _AUDITLOG._serialized_start=185
  _AUDITLOG._serialized_end=823
  _AUTHENTICATIONINFO._serialized_start=826
  _AUTHENTICATIONINFO._serialized_end=1107
  _AUTHORIZATIONINFO._serialized_start=1110
  _AUTHORIZATIONINFO._serialized_end=1260
  _REQUESTMETADATA._serialized_start=1263
  _REQUESTMETADATA._serialized_end=1508
  _RESOURCELOCATION._serialized_start=1510
  _RESOURCELOCATION._serialized_end=1583
  _SERVICEACCOUNTDELEGATIONINFO._serialized_start=1586
  _SERVICEACCOUNTDELEGATIONINFO._serialized_end=2037
  _SERVICEACCOUNTDELEGATIONINFO_FIRSTPARTYPRINCIPAL._serialized_start=1851
  _SERVICEACCOUNTDELEGATIONINFO_FIRSTPARTYPRINCIPAL._serialized_end=1948
  _SERVICEACCOUNTDELEGATIONINFO_THIRDPARTYPRINCIPAL._serialized_start=1950
  _SERVICEACCOUNTDELEGATIONINFO_THIRDPARTYPRINCIPAL._serialized_end=2024
# @@protoc_insertion_point(module_scope)
