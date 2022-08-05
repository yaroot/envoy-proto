# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/servicedirectory/v1beta1/lookup_service.proto
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
from google.cloud.servicedirectory.v1beta1 import service_pb2 as google_dot_cloud_dot_servicedirectory_dot_v1beta1_dot_service__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:google/cloud/servicedirectory/v1beta1/lookup_service.proto\x12%google.cloud.servicedirectory.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x33google/cloud/servicedirectory/v1beta1/service.proto\x1a\x17google/api/client.proto\"\x90\x01\n\x15ResolveServiceRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'servicedirectory.googleapis.com/Service\x12\x1a\n\rmax_endpoints\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x1c\n\x0f\x65ndpoint_filter\x18\x03 \x01(\tB\x03\xe0\x41\x01\"Y\n\x16ResolveServiceResponse\x12?\n\x07service\x18\x01 \x01(\x0b\x32..google.cloud.servicedirectory.v1beta1.Service2\xc7\x02\n\rLookupService\x12\xe0\x01\n\x0eResolveService\x12<.google.cloud.servicedirectory.v1beta1.ResolveServiceRequest\x1a=.google.cloud.servicedirectory.v1beta1.ResolveServiceResponse\"Q\x82\xd3\xe4\x93\x02K\"F/v1beta1/{name=projects/*/locations/*/namespaces/*/services/*}:resolve:\x01*\x1aS\xca\x41\x1fservicedirectory.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x96\x02\n)com.google.cloud.servicedirectory.v1beta1B\x12LookupServiceProtoP\x01ZUgoogle.golang.org/genproto/googleapis/cloud/servicedirectory/v1beta1;servicedirectory\xf8\x01\x01\xaa\x02%Google.Cloud.ServiceDirectory.V1Beta1\xca\x02%Google\\Cloud\\ServiceDirectory\\V1beta1\xea\x02(Google::Cloud::ServiceDirectory::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.servicedirectory.v1beta1.lookup_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.google.cloud.servicedirectory.v1beta1B\022LookupServiceProtoP\001ZUgoogle.golang.org/genproto/googleapis/cloud/servicedirectory/v1beta1;servicedirectory\370\001\001\252\002%Google.Cloud.ServiceDirectory.V1Beta1\312\002%Google\\Cloud\\ServiceDirectory\\V1beta1\352\002(Google::Cloud::ServiceDirectory::V1beta1'
  _RESOLVESERVICEREQUEST.fields_by_name['name']._options = None
  _RESOLVESERVICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'servicedirectory.googleapis.com/Service'
  _RESOLVESERVICEREQUEST.fields_by_name['max_endpoints']._options = None
  _RESOLVESERVICEREQUEST.fields_by_name['max_endpoints']._serialized_options = b'\340A\001'
  _RESOLVESERVICEREQUEST.fields_by_name['endpoint_filter']._options = None
  _RESOLVESERVICEREQUEST.fields_by_name['endpoint_filter']._serialized_options = b'\340A\001'
  _LOOKUPSERVICE._options = None
  _LOOKUPSERVICE._serialized_options = b'\312A\037servicedirectory.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _LOOKUPSERVICE.methods_by_name['ResolveService']._options = None
  _LOOKUPSERVICE.methods_by_name['ResolveService']._serialized_options = b'\202\323\344\223\002K\"F/v1beta1/{name=projects/*/locations/*/namespaces/*/services/*}:resolve:\001*'
  _RESOLVESERVICEREQUEST._serialized_start=270
  _RESOLVESERVICEREQUEST._serialized_end=414
  _RESOLVESERVICERESPONSE._serialized_start=416
  _RESOLVESERVICERESPONSE._serialized_end=505
  _LOOKUPSERVICE._serialized_start=508
  _LOOKUPSERVICE._serialized_end=835
# @@protoc_insertion_point(module_scope)
