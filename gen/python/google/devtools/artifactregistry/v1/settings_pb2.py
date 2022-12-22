# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/artifactregistry/v1/settings.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/devtools/artifactregistry/v1/settings.proto\x12#google.devtools.artifactregistry.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"\x8c\x03\n\x0fProjectSettings\x12\x0c\n\x04name\x18\x01 \x01(\t\x12g\n\x18legacy_redirection_state\x18\x02 \x01(\x0e\x32\x45.google.devtools.artifactregistry.v1.ProjectSettings.RedirectionState\"\xa7\x01\n\x10RedirectionState\x12!\n\x1dREDIRECTION_STATE_UNSPECIFIED\x10\x00\x12$\n REDIRECTION_FROM_GCR_IO_DISABLED\x10\x01\x12#\n\x1fREDIRECTION_FROM_GCR_IO_ENABLED\x10\x02\x12%\n!REDIRECTION_FROM_GCR_IO_FINALIZED\x10\x03:X\xea\x41U\n/artifactregistry.googleapis.com/ProjectSettings\x12\"projects/{project}/projectSettings\"b\n\x19GetProjectSettingsRequest\x12\x45\n\x04name\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\n/artifactregistry.googleapis.com/ProjectSettings\"\x9f\x01\n\x1cUpdateProjectSettingsRequest\x12N\n\x10project_settings\x18\x02 \x01(\x0b\x32\x34.google.devtools.artifactregistry.v1.ProjectSettings\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\xfb\x01\n\'com.google.devtools.artifactregistry.v1B\rSettingsProtoP\x01ZSgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1;artifactregistry\xaa\x02 Google.Cloud.ArtifactRegistry.V1\xca\x02 Google\\Cloud\\ArtifactRegistry\\V1\xea\x02#Google::Cloud::ArtifactRegistry::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.artifactregistry.v1.settings_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.google.devtools.artifactregistry.v1B\rSettingsProtoP\001ZSgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1;artifactregistry\252\002 Google.Cloud.ArtifactRegistry.V1\312\002 Google\\Cloud\\ArtifactRegistry\\V1\352\002#Google::Cloud::ArtifactRegistry::V1'
  _PROJECTSETTINGS._options = None
  _PROJECTSETTINGS._serialized_options = b'\352AU\n/artifactregistry.googleapis.com/ProjectSettings\022\"projects/{project}/projectSettings'
  _GETPROJECTSETTINGSREQUEST.fields_by_name['name']._options = None
  _GETPROJECTSETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A1\n/artifactregistry.googleapis.com/ProjectSettings'
  _PROJECTSETTINGS._serialized_start=186
  _PROJECTSETTINGS._serialized_end=582
  _PROJECTSETTINGS_REDIRECTIONSTATE._serialized_start=325
  _PROJECTSETTINGS_REDIRECTIONSTATE._serialized_end=492
  _GETPROJECTSETTINGSREQUEST._serialized_start=584
  _GETPROJECTSETTINGSREQUEST._serialized_end=682
  _UPDATEPROJECTSETTINGSREQUEST._serialized_start=685
  _UPDATEPROJECTSETTINGSREQUEST._serialized_end=844
# @@protoc_insertion_point(module_scope)