# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/artifactregistry/v1beta2/tag.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/devtools/artifactregistry/v1beta2/tag.proto\x12(google.devtools.artifactregistry.v1beta2\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"\xb1\x01\n\x03Tag\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t:\x8a\x01\xea\x41\x86\x01\n#artifactregistry.googleapis.com/Tag\x12_projects/{project}/locations/{location}/repositories/{repository}/packages/{package}/tags/{tag}\"X\n\x0fListTagsRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"h\n\x10ListTagsResponse\x12;\n\x04tags\x18\x01 \x03(\x0b\x32-.google.devtools.artifactregistry.v1beta2.Tag\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x1d\n\rGetTagRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"n\n\x10\x43reateTagRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x0e\n\x06tag_id\x18\x02 \x01(\t\x12:\n\x03tag\x18\x03 \x01(\x0b\x32-.google.devtools.artifactregistry.v1beta2.Tag\"\x7f\n\x10UpdateTagRequest\x12:\n\x03tag\x18\x01 \x01(\x0b\x32-.google.devtools.artifactregistry.v1beta2.Tag\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\" \n\x10\x44\x65leteTagRequest\x12\x0c\n\x04name\x18\x01 \x01(\tB\x8f\x02\n,com.google.devtools.artifactregistry.v1beta2B\x08TagProtoP\x01ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\xaa\x02%Google.Cloud.ArtifactRegistry.V1Beta2\xca\x02%Google\\Cloud\\ArtifactRegistry\\V1beta2\xea\x02(Google::Cloud::ArtifactRegistry::V1beta2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.artifactregistry.v1beta2.tag_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n,com.google.devtools.artifactregistry.v1beta2B\010TagProtoP\001ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\252\002%Google.Cloud.ArtifactRegistry.V1Beta2\312\002%Google\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Google::Cloud::ArtifactRegistry::V1beta2'
  _TAG._options = None
  _TAG._serialized_options = b'\352A\206\001\n#artifactregistry.googleapis.com/Tag\022_projects/{project}/locations/{location}/repositories/{repository}/packages/{package}/tags/{tag}'
  _TAG._serialized_start=188
  _TAG._serialized_end=365
  _LISTTAGSREQUEST._serialized_start=367
  _LISTTAGSREQUEST._serialized_end=455
  _LISTTAGSRESPONSE._serialized_start=457
  _LISTTAGSRESPONSE._serialized_end=561
  _GETTAGREQUEST._serialized_start=563
  _GETTAGREQUEST._serialized_end=592
  _CREATETAGREQUEST._serialized_start=594
  _CREATETAGREQUEST._serialized_end=704
  _UPDATETAGREQUEST._serialized_start=706
  _UPDATETAGREQUEST._serialized_end=833
  _DELETETAGREQUEST._serialized_start=835
  _DELETETAGREQUEST._serialized_end=867
# @@protoc_insertion_point(module_scope)
