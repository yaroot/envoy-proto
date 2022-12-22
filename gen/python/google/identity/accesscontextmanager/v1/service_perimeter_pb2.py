# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/identity/accesscontextmanager/v1/service_perimeter.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/identity/accesscontextmanager/v1/service_perimeter.proto\x12\'google.identity.accesscontextmanager.v1\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x93\x05\n\x10ServicePerimeter\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05title\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12/\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12_\n\x0eperimeter_type\x18\x06 \x01(\x0e\x32G.google.identity.accesscontextmanager.v1.ServicePerimeter.PerimeterType\x12O\n\x06status\x18\x07 \x01(\x0b\x32?.google.identity.accesscontextmanager.v1.ServicePerimeterConfig\x12M\n\x04spec\x18\x08 \x01(\x0b\x32?.google.identity.accesscontextmanager.v1.ServicePerimeterConfig\x12!\n\x19use_explicit_dry_run_spec\x18\t \x01(\x08\"F\n\rPerimeterType\x12\x1a\n\x16PERIMETER_TYPE_REGULAR\x10\x00\x12\x19\n\x15PERIMETER_TYPE_BRIDGE\x10\x01:\x7f\xea\x41|\n4accesscontextmanager.googleapis.com/ServicePerimeter\x12\x44\x61\x63\x63\x65ssPolicies/{access_policy}/servicePerimeters/{service_perimeter}\"\xb5\x0f\n\x16ServicePerimeterConfig\x12\x11\n\tresources\x18\x01 \x03(\t\x12\x15\n\raccess_levels\x18\x02 \x03(\t\x12\x1b\n\x13restricted_services\x18\x04 \x03(\t\x12v\n\x17vpc_accessible_services\x18\n \x01(\x0b\x32U.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.VpcAccessibleServices\x12g\n\x10ingress_policies\x18\x08 \x03(\x0b\x32M.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy\x12\x65\n\x0f\x65gress_policies\x18\t \x03(\x0b\x32L.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy\x1aM\n\x15VpcAccessibleServices\x12\x1a\n\x12\x65nable_restriction\x18\x01 \x01(\x08\x12\x18\n\x10\x61llowed_services\x18\x02 \x03(\t\x1a@\n\x0eMethodSelector\x12\x10\n\x06method\x18\x01 \x01(\tH\x00\x12\x14\n\npermission\x18\x02 \x01(\tH\x00\x42\x06\n\x04kind\x1a\x8e\x01\n\x0c\x41piOperation\x12\x14\n\x0cservice_name\x18\x01 \x01(\t\x12h\n\x10method_selectors\x18\x02 \x03(\x0b\x32N.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.MethodSelector\x1a\x45\n\rIngressSource\x12\x16\n\x0c\x61\x63\x63\x65ss_level\x18\x01 \x01(\tH\x00\x12\x12\n\x08resource\x18\x02 \x01(\tH\x00\x42\x08\n\x06source\x1a\xe6\x01\n\x0bIngressFrom\x12^\n\x07sources\x18\x01 \x03(\x0b\x32M.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressSource\x12\x12\n\nidentities\x18\x02 \x03(\t\x12\x63\n\ridentity_type\x18\x03 \x01(\x0e\x32L.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IdentityType\x1a\x80\x01\n\tIngressTo\x12`\n\noperations\x18\x01 \x03(\x0b\x32L.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.ApiOperation\x12\x11\n\tresources\x18\x02 \x03(\t\x1a\xd1\x01\n\rIngressPolicy\x12\x61\n\x0cingress_from\x18\x01 \x01(\x0b\x32K.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressFrom\x12]\n\ningress_to\x18\x02 \x01(\x0b\x32I.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressTo\x1a\x85\x01\n\nEgressFrom\x12\x12\n\nidentities\x18\x01 \x03(\t\x12\x63\n\ridentity_type\x18\x02 \x01(\x0e\x32L.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IdentityType\x1a\x9b\x01\n\x08\x45gressTo\x12\x11\n\tresources\x18\x01 \x03(\t\x12`\n\noperations\x18\x02 \x03(\x0b\x32L.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.ApiOperation\x12\x1a\n\x12\x65xternal_resources\x18\x03 \x03(\t\x1a\xcc\x01\n\x0c\x45gressPolicy\x12_\n\x0b\x65gress_from\x18\x01 \x01(\x0b\x32J.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressFrom\x12[\n\tegress_to\x18\x02 \x01(\x0b\x32H.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressTo\"n\n\x0cIdentityType\x12\x1d\n\x19IDENTITY_TYPE_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x41NY_IDENTITY\x10\x01\x12\x14\n\x10\x41NY_USER_ACCOUNT\x10\x02\x12\x17\n\x13\x41NY_SERVICE_ACCOUNT\x10\x03\x42\xab\x02\n+com.google.identity.accesscontextmanager.v1B\x15ServicePerimeterProtoP\x01Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\xa2\x02\x04GACM\xaa\x02\'Google.Identity.AccessContextManager.V1\xca\x02\'Google\\Identity\\AccessContextManager\\V1\xea\x02*Google::Identity::AccessContextManager::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.identity.accesscontextmanager.v1.service_perimeter_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n+com.google.identity.accesscontextmanager.v1B\025ServicePerimeterProtoP\001Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\242\002\004GACM\252\002\'Google.Identity.AccessContextManager.V1\312\002\'Google\\Identity\\AccessContextManager\\V1\352\002*Google::Identity::AccessContextManager::V1'
  _SERVICEPERIMETER._options = None
  _SERVICEPERIMETER._serialized_options = b'\352A|\n4accesscontextmanager.googleapis.com/ServicePerimeter\022DaccessPolicies/{access_policy}/servicePerimeters/{service_perimeter}'
  _SERVICEPERIMETER._serialized_start=169
  _SERVICEPERIMETER._serialized_end=828
  _SERVICEPERIMETER_PERIMETERTYPE._serialized_start=629
  _SERVICEPERIMETER_PERIMETERTYPE._serialized_end=699
  _SERVICEPERIMETERCONFIG._serialized_start=831
  _SERVICEPERIMETERCONFIG._serialized_end=2804
  _SERVICEPERIMETERCONFIG_VPCACCESSIBLESERVICES._serialized_start=1256
  _SERVICEPERIMETERCONFIG_VPCACCESSIBLESERVICES._serialized_end=1333
  _SERVICEPERIMETERCONFIG_METHODSELECTOR._serialized_start=1335
  _SERVICEPERIMETERCONFIG_METHODSELECTOR._serialized_end=1399
  _SERVICEPERIMETERCONFIG_APIOPERATION._serialized_start=1402
  _SERVICEPERIMETERCONFIG_APIOPERATION._serialized_end=1544
  _SERVICEPERIMETERCONFIG_INGRESSSOURCE._serialized_start=1546
  _SERVICEPERIMETERCONFIG_INGRESSSOURCE._serialized_end=1615
  _SERVICEPERIMETERCONFIG_INGRESSFROM._serialized_start=1618
  _SERVICEPERIMETERCONFIG_INGRESSFROM._serialized_end=1848
  _SERVICEPERIMETERCONFIG_INGRESSTO._serialized_start=1851
  _SERVICEPERIMETERCONFIG_INGRESSTO._serialized_end=1979
  _SERVICEPERIMETERCONFIG_INGRESSPOLICY._serialized_start=1982
  _SERVICEPERIMETERCONFIG_INGRESSPOLICY._serialized_end=2191
  _SERVICEPERIMETERCONFIG_EGRESSFROM._serialized_start=2194
  _SERVICEPERIMETERCONFIG_EGRESSFROM._serialized_end=2327
  _SERVICEPERIMETERCONFIG_EGRESSTO._serialized_start=2330
  _SERVICEPERIMETERCONFIG_EGRESSTO._serialized_end=2485
  _SERVICEPERIMETERCONFIG_EGRESSPOLICY._serialized_start=2488
  _SERVICEPERIMETERCONFIG_EGRESSPOLICY._serialized_end=2692
  _SERVICEPERIMETERCONFIG_IDENTITYTYPE._serialized_start=2694
  _SERVICEPERIMETERCONFIG_IDENTITYTYPE._serialized_end=2804
# @@protoc_insertion_point(module_scope)