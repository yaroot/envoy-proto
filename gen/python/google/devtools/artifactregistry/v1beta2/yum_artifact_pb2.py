# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/artifactregistry/v1beta2/yum_artifact.proto
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
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/devtools/artifactregistry/v1beta2/yum_artifact.proto\x12(google.devtools.artifactregistry.v1beta2\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x17google/rpc/status.proto\"\x8c\x03\n\x0bYumArtifact\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0cpackage_name\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\\\n\x0cpackage_type\x18\x03 \x01(\x0e\x32\x41.google.devtools.artifactregistry.v1beta2.YumArtifact.PackageTypeB\x03\xe0\x41\x03\x12\x19\n\x0c\x61rchitecture\x18\x04 \x01(\tB\x03\xe0\x41\x03\"C\n\x0bPackageType\x12\x1c\n\x18PACKAGE_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06\x42INARY\x10\x01\x12\n\n\x06SOURCE\x10\x02:\x90\x01\xea\x41\x8c\x01\n+artifactregistry.googleapis.com/YumArtifact\x12]projects/{project}/locations/{location}/repositories/{repository}/yumArtifacts/{yum_artifact}\"B\n\x1bImportYumArtifactsGcsSource\x12\x0c\n\x04uris\x18\x01 \x03(\t\x12\x15\n\ruse_wildcards\x18\x02 \x01(\x08\"\x92\x01\n\x19ImportYumArtifactsRequest\x12[\n\ngcs_source\x18\x02 \x01(\x0b\x32\x45.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSourceH\x00\x12\x0e\n\x06parent\x18\x01 \x01(\tB\x08\n\x06source\"\xa7\x01\n\x1bImportYumArtifactsErrorInfo\x12[\n\ngcs_source\x18\x01 \x01(\x0b\x32\x45.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsGcsSourceH\x00\x12!\n\x05\x65rror\x18\x02 \x01(\x0b\x32\x12.google.rpc.StatusB\x08\n\x06source\"\xc1\x01\n\x1aImportYumArtifactsResponse\x12L\n\ryum_artifacts\x18\x01 \x03(\x0b\x32\x35.google.devtools.artifactregistry.v1beta2.YumArtifact\x12U\n\x06\x65rrors\x18\x02 \x03(\x0b\x32\x45.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsErrorInfo\"\x1c\n\x1aImportYumArtifactsMetadataB\x97\x02\n,com.google.devtools.artifactregistry.v1beta2B\x10YumArtifactProtoP\x01ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\xaa\x02%Google.Cloud.ArtifactRegistry.V1Beta2\xca\x02%Google\\Cloud\\ArtifactRegistry\\V1beta2\xea\x02(Google::Cloud::ArtifactRegistry::V1beta2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.artifactregistry.v1beta2.yum_artifact_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n,com.google.devtools.artifactregistry.v1beta2B\020YumArtifactProtoP\001ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\252\002%Google.Cloud.ArtifactRegistry.V1Beta2\312\002%Google\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Google::Cloud::ArtifactRegistry::V1beta2'
  _YUMARTIFACT.fields_by_name['name']._options = None
  _YUMARTIFACT.fields_by_name['name']._serialized_options = b'\340A\003'
  _YUMARTIFACT.fields_by_name['package_name']._options = None
  _YUMARTIFACT.fields_by_name['package_name']._serialized_options = b'\340A\003'
  _YUMARTIFACT.fields_by_name['package_type']._options = None
  _YUMARTIFACT.fields_by_name['package_type']._serialized_options = b'\340A\003'
  _YUMARTIFACT.fields_by_name['architecture']._options = None
  _YUMARTIFACT.fields_by_name['architecture']._serialized_options = b'\340A\003'
  _YUMARTIFACT._options = None
  _YUMARTIFACT._serialized_options = b'\352A\214\001\n+artifactregistry.googleapis.com/YumArtifact\022]projects/{project}/locations/{location}/repositories/{repository}/yumArtifacts/{yum_artifact}'
  _YUMARTIFACT._serialized_start=258
  _YUMARTIFACT._serialized_end=654
  _YUMARTIFACT_PACKAGETYPE._serialized_start=440
  _YUMARTIFACT_PACKAGETYPE._serialized_end=507
  _IMPORTYUMARTIFACTSGCSSOURCE._serialized_start=656
  _IMPORTYUMARTIFACTSGCSSOURCE._serialized_end=722
  _IMPORTYUMARTIFACTSREQUEST._serialized_start=725
  _IMPORTYUMARTIFACTSREQUEST._serialized_end=871
  _IMPORTYUMARTIFACTSERRORINFO._serialized_start=874
  _IMPORTYUMARTIFACTSERRORINFO._serialized_end=1041
  _IMPORTYUMARTIFACTSRESPONSE._serialized_start=1044
  _IMPORTYUMARTIFACTSRESPONSE._serialized_end=1237
  _IMPORTYUMARTIFACTSMETADATA._serialized_start=1239
  _IMPORTYUMARTIFACTSMETADATA._serialized_end=1267
# @@protoc_insertion_point(module_scope)
