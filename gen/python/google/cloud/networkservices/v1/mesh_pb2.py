# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networkservices/v1/mesh.proto
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
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/networkservices/v1/mesh.proto\x12\x1fgoogle.cloud.networkservices.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xaf\x03\n\x04Mesh\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tself_link\x18\t \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x46\n\x06labels\x18\x04 \x03(\x0b\x32\x31.google.cloud.networkservices.v1.Mesh.LabelsEntryB\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12\x1e\n\x11interception_port\x18\x08 \x01(\x05\x42\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:_\xea\x41\\\n#networkservices.googleapis.com/Mesh\x12\x35projects/{project}/locations/{location}/meshes/{mesh}\"w\n\x11ListMeshesRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#networkservices.googleapis.com/Mesh\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"d\n\x12ListMeshesResponse\x12\x35\n\x06meshes\x18\x01 \x03(\x0b\x32%.google.cloud.networkservices.v1.Mesh\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"K\n\x0eGetMeshRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#networkservices.googleapis.com/Mesh\"\xa0\x01\n\x11\x43reateMeshRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#networkservices.googleapis.com/Mesh\x12\x14\n\x07mesh_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x38\n\x04mesh\x18\x03 \x01(\x0b\x32%.google.cloud.networkservices.v1.MeshB\x03\xe0\x41\x02\"\x83\x01\n\x11UpdateMeshRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x38\n\x04mesh\x18\x02 \x01(\x0b\x32%.google.cloud.networkservices.v1.MeshB\x03\xe0\x41\x02\"N\n\x11\x44\x65leteMeshRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#networkservices.googleapis.com/MeshB\xeb\x01\n#com.google.cloud.networkservices.v1B\tMeshProtoP\x01ZNgoogle.golang.org/genproto/googleapis/cloud/networkservices/v1;networkservices\xaa\x02\x1fGoogle.Cloud.NetworkServices.V1\xca\x02\x1fGoogle\\Cloud\\NetworkServices\\V1\xea\x02\"Google::Cloud::NetworkServices::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.networkservices.v1.mesh_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.networkservices.v1B\tMeshProtoP\001ZNgoogle.golang.org/genproto/googleapis/cloud/networkservices/v1;networkservices\252\002\037Google.Cloud.NetworkServices.V1\312\002\037Google\\Cloud\\NetworkServices\\V1\352\002\"Google::Cloud::NetworkServices::V1'
  _MESH_LABELSENTRY._options = None
  _MESH_LABELSENTRY._serialized_options = b'8\001'
  _MESH.fields_by_name['name']._options = None
  _MESH.fields_by_name['name']._serialized_options = b'\340A\002'
  _MESH.fields_by_name['self_link']._options = None
  _MESH.fields_by_name['self_link']._serialized_options = b'\340A\003'
  _MESH.fields_by_name['create_time']._options = None
  _MESH.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _MESH.fields_by_name['update_time']._options = None
  _MESH.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _MESH.fields_by_name['labels']._options = None
  _MESH.fields_by_name['labels']._serialized_options = b'\340A\001'
  _MESH.fields_by_name['description']._options = None
  _MESH.fields_by_name['description']._serialized_options = b'\340A\001'
  _MESH.fields_by_name['interception_port']._options = None
  _MESH.fields_by_name['interception_port']._serialized_options = b'\340A\001'
  _MESH._options = None
  _MESH._serialized_options = b'\352A\\\n#networkservices.googleapis.com/Mesh\0225projects/{project}/locations/{location}/meshes/{mesh}'
  _LISTMESHESREQUEST.fields_by_name['parent']._options = None
  _LISTMESHESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#networkservices.googleapis.com/Mesh'
  _GETMESHREQUEST.fields_by_name['name']._options = None
  _GETMESHREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#networkservices.googleapis.com/Mesh'
  _CREATEMESHREQUEST.fields_by_name['parent']._options = None
  _CREATEMESHREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#networkservices.googleapis.com/Mesh'
  _CREATEMESHREQUEST.fields_by_name['mesh_id']._options = None
  _CREATEMESHREQUEST.fields_by_name['mesh_id']._serialized_options = b'\340A\002'
  _CREATEMESHREQUEST.fields_by_name['mesh']._options = None
  _CREATEMESHREQUEST.fields_by_name['mesh']._serialized_options = b'\340A\002'
  _UPDATEMESHREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEMESHREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATEMESHREQUEST.fields_by_name['mesh']._options = None
  _UPDATEMESHREQUEST.fields_by_name['mesh']._serialized_options = b'\340A\002'
  _DELETEMESHREQUEST.fields_by_name['name']._options = None
  _DELETEMESHREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#networkservices.googleapis.com/Mesh'
  _MESH._serialized_start=207
  _MESH._serialized_end=638
  _MESH_LABELSENTRY._serialized_start=496
  _MESH_LABELSENTRY._serialized_end=541
  _LISTMESHESREQUEST._serialized_start=640
  _LISTMESHESREQUEST._serialized_end=759
  _LISTMESHESRESPONSE._serialized_start=761
  _LISTMESHESRESPONSE._serialized_end=861
  _GETMESHREQUEST._serialized_start=863
  _GETMESHREQUEST._serialized_end=938
  _CREATEMESHREQUEST._serialized_start=941
  _CREATEMESHREQUEST._serialized_end=1101
  _UPDATEMESHREQUEST._serialized_start=1104
  _UPDATEMESHREQUEST._serialized_end=1235
  _DELETEMESHREQUEST._serialized_start=1237
  _DELETEMESHREQUEST._serialized_end=1315
# @@protoc_insertion_point(module_scope)
