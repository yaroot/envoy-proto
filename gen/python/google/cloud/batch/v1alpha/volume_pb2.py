# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/batch/v1alpha/volume.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/cloud/batch/v1alpha/volume.proto\x12\x1agoogle.cloud.batch.v1alpha\"\xe6\x01\n\x06Volume\x12.\n\x03nfs\x18\x01 \x01(\x0b\x32\x1f.google.cloud.batch.v1alpha.NFSH\x00\x12\x30\n\x02pd\x18\x02 \x01(\x0b\x32\x1e.google.cloud.batch.v1alpha.PDB\x02\x18\x01H\x00\x12.\n\x03gcs\x18\x03 \x01(\x0b\x32\x1f.google.cloud.batch.v1alpha.GCSH\x00\x12\x15\n\x0b\x64\x65vice_name\x18\x06 \x01(\tH\x00\x12\x12\n\nmount_path\x18\x04 \x01(\t\x12\x15\n\rmount_options\x18\x05 \x03(\tB\x08\n\x06source\"*\n\x03NFS\x12\x0e\n\x06server\x18\x01 \x01(\t\x12\x13\n\x0bremote_path\x18\x02 \x01(\t\"8\n\x02PD\x12\x0c\n\x04\x64isk\x18\x01 \x01(\t\x12\x0e\n\x06\x64\x65vice\x18\x02 \x01(\t\x12\x14\n\x08\x65xisting\x18\x03 \x01(\x08\x42\x02\x18\x01\"\x1a\n\x03GCS\x12\x13\n\x0bremote_path\x18\x01 \x01(\tB\xd0\x01\n\x1e\x63om.google.cloud.batch.v1alphaB\x0bVolumeProtoP\x01Z?google.golang.org/genproto/googleapis/cloud/batch/v1alpha;batch\xa2\x02\x03GCB\xaa\x02\x1aGoogle.Cloud.Batch.V1Alpha\xca\x02\x1aGoogle\\Cloud\\Batch\\V1alpha\xea\x02\x1dGoogle::Cloud::Batch::V1alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.batch.v1alpha.volume_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.batch.v1alphaB\013VolumeProtoP\001Z?google.golang.org/genproto/googleapis/cloud/batch/v1alpha;batch\242\002\003GCB\252\002\032Google.Cloud.Batch.V1Alpha\312\002\032Google\\Cloud\\Batch\\V1alpha\352\002\035Google::Cloud::Batch::V1alpha'
  _VOLUME.fields_by_name['pd']._options = None
  _VOLUME.fields_by_name['pd']._serialized_options = b'\030\001'
  _PD.fields_by_name['existing']._options = None
  _PD.fields_by_name['existing']._serialized_options = b'\030\001'
  _VOLUME._serialized_start=72
  _VOLUME._serialized_end=302
  _NFS._serialized_start=304
  _NFS._serialized_end=346
  _PD._serialized_start=348
  _PD._serialized_end=404
  _GCS._serialized_start=406
  _GCS._serialized_end=432
# @@protoc_insertion_point(module_scope)