# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nEgoogle/devtools/containeranalysis/v1beta1/deployment/deployment.proto\x12\x1agrafeas.v1beta1.deployment\x1a\x1fgoogle/protobuf/timestamp.proto\"\"\n\nDeployable\x12\x14\n\x0cresource_uri\x18\x01 \x03(\t\"E\n\x07\x44\x65tails\x12:\n\ndeployment\x18\x01 \x01(\x0b\x32&.grafeas.v1beta1.deployment.Deployment\"\xc3\x02\n\nDeployment\x12\x12\n\nuser_email\x18\x01 \x01(\t\x12/\n\x0b\x64\x65ploy_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x31\n\rundeploy_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06\x63onfig\x18\x04 \x01(\t\x12\x0f\n\x07\x61\x64\x64ress\x18\x05 \x01(\t\x12\x14\n\x0cresource_uri\x18\x06 \x03(\t\x12\x41\n\x08platform\x18\x07 \x01(\x0e\x32/.grafeas.v1beta1.deployment.Deployment.Platform\"C\n\x08Platform\x12\x18\n\x14PLATFORM_UNSPECIFIED\x10\x00\x12\x07\n\x03GKE\x10\x01\x12\x08\n\x04\x46LEX\x10\x02\x12\n\n\x06\x43USTOM\x10\x03\x42\x87\x01\n\x1dio.grafeas.v1beta1.deploymentP\x01Z^google.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/deployment;deployment\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.containeranalysis.v1beta1.deployment.deployment_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035io.grafeas.v1beta1.deploymentP\001Z^google.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/deployment;deployment\242\002\003GRA'
  _DEPLOYABLE._serialized_start=134
  _DEPLOYABLE._serialized_end=168
  _DETAILS._serialized_start=170
  _DETAILS._serialized_end=239
  _DEPLOYMENT._serialized_start=242
  _DEPLOYMENT._serialized_end=565
  _DEPLOYMENT_PLATFORM._serialized_start=498
  _DEPLOYMENT_PLATFORM._serialized_end=565
# @@protoc_insertion_point(module_scope)