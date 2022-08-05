# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/v1/write.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.firestore.v1 import common_pb2 as google_dot_firestore_dot_v1_dot_common__pb2
from google.firestore.v1 import document_pb2 as google_dot_firestore_dot_v1_dot_document__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fgoogle/firestore/v1/write.proto\x12\x13google.firestore.v1\x1a google/firestore/v1/common.proto\x1a\"google/firestore/v1/document.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xdb\x02\n\x05Write\x12/\n\x06update\x18\x01 \x01(\x0b\x32\x1d.google.firestore.v1.DocumentH\x00\x12\x10\n\x06\x64\x65lete\x18\x02 \x01(\tH\x00\x12;\n\ttransform\x18\x06 \x01(\x0b\x32&.google.firestore.v1.DocumentTransformH\x00\x12\x36\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\x12P\n\x11update_transforms\x18\x07 \x03(\x0b\x32\x35.google.firestore.v1.DocumentTransform.FieldTransform\x12;\n\x10\x63urrent_document\x18\x04 \x01(\x0b\x32!.google.firestore.v1.PreconditionB\x0b\n\toperation\"\xe5\x04\n\x11\x44ocumentTransform\x12\x10\n\x08\x64ocument\x18\x01 \x01(\t\x12O\n\x10\x66ield_transforms\x18\x02 \x03(\x0b\x32\x35.google.firestore.v1.DocumentTransform.FieldTransform\x1a\xec\x03\n\x0e\x46ieldTransform\x12\x12\n\nfield_path\x18\x01 \x01(\t\x12`\n\x13set_to_server_value\x18\x02 \x01(\x0e\x32\x41.google.firestore.v1.DocumentTransform.FieldTransform.ServerValueH\x00\x12/\n\tincrement\x18\x03 \x01(\x0b\x32\x1a.google.firestore.v1.ValueH\x00\x12-\n\x07maximum\x18\x04 \x01(\x0b\x32\x1a.google.firestore.v1.ValueH\x00\x12-\n\x07minimum\x18\x05 \x01(\x0b\x32\x1a.google.firestore.v1.ValueH\x00\x12\x42\n\x17\x61ppend_missing_elements\x18\x06 \x01(\x0b\x32\x1f.google.firestore.v1.ArrayValueH\x00\x12@\n\x15remove_all_from_array\x18\x07 \x01(\x0b\x32\x1f.google.firestore.v1.ArrayValueH\x00\"=\n\x0bServerValue\x12\x1c\n\x18SERVER_VALUE_UNSPECIFIED\x10\x00\x12\x10\n\x0cREQUEST_TIME\x10\x01\x42\x10\n\x0etransform_type\"u\n\x0bWriteResult\x12/\n\x0bupdate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x35\n\x11transform_results\x18\x02 \x03(\x0b\x32\x1a.google.firestore.v1.Value\"q\n\x0e\x44ocumentChange\x12/\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\x1d.google.firestore.v1.Document\x12\x12\n\ntarget_ids\x18\x05 \x03(\x05\x12\x1a\n\x12removed_target_ids\x18\x06 \x03(\x05\"m\n\x0e\x44ocumentDelete\x12\x10\n\x08\x64ocument\x18\x01 \x01(\t\x12\x1a\n\x12removed_target_ids\x18\x06 \x03(\x05\x12-\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"m\n\x0e\x44ocumentRemove\x12\x10\n\x08\x64ocument\x18\x01 \x01(\t\x12\x1a\n\x12removed_target_ids\x18\x02 \x03(\x05\x12-\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"3\n\x0f\x45xistenceFilter\x12\x11\n\ttarget_id\x18\x01 \x01(\x05\x12\r\n\x05\x63ount\x18\x02 \x01(\x05\x42\xc3\x01\n\x17\x63om.google.firestore.v1B\nWriteProtoP\x01Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\xa2\x02\x04GCFS\xaa\x02\x19Google.Cloud.Firestore.V1\xca\x02\x19Google\\Cloud\\Firestore\\V1\xea\x02\x1cGoogle::Cloud::Firestore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.v1.write_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.firestore.v1B\nWriteProtoP\001Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\242\002\004GCFS\252\002\031Google.Cloud.Firestore.V1\312\002\031Google\\Cloud\\Firestore\\V1\352\002\034Google::Cloud::Firestore::V1'
  _WRITE._serialized_start=160
  _WRITE._serialized_end=507
  _DOCUMENTTRANSFORM._serialized_start=510
  _DOCUMENTTRANSFORM._serialized_end=1123
  _DOCUMENTTRANSFORM_FIELDTRANSFORM._serialized_start=631
  _DOCUMENTTRANSFORM_FIELDTRANSFORM._serialized_end=1123
  _DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE._serialized_start=1044
  _DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE._serialized_end=1105
  _WRITERESULT._serialized_start=1125
  _WRITERESULT._serialized_end=1242
  _DOCUMENTCHANGE._serialized_start=1244
  _DOCUMENTCHANGE._serialized_end=1357
  _DOCUMENTDELETE._serialized_start=1359
  _DOCUMENTDELETE._serialized_end=1468
  _DOCUMENTREMOVE._serialized_start=1470
  _DOCUMENTREMOVE._serialized_end=1579
  _EXISTENCEFILTER._serialized_start=1581
  _EXISTENCEFILTER._serialized_end=1632
# @@protoc_insertion_point(module_scope)
