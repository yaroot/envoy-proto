# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/v1beta1/write.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.firestore.v1beta1 import common_pb2 as google_dot_firestore_dot_v1beta1_dot_common__pb2
from google.firestore.v1beta1 import document_pb2 as google_dot_firestore_dot_v1beta1_dot_document__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/firestore/v1beta1/write.proto',
  package='google.firestore.v1beta1',
  syntax='proto3',
  serialized_options=b'\n\034com.google.firestore.v1beta1B\nWriteProtoP\001ZAgoogle.golang.org/genproto/googleapis/firestore/v1beta1;firestore\242\002\004GCFS\252\002\036Google.Cloud.Firestore.V1Beta1\312\002\036Google\\Cloud\\Firestore\\V1beta1\352\002!Google::Cloud::Firestore::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$google/firestore/v1beta1/write.proto\x12\x18google.firestore.v1beta1\x1a%google/firestore/v1beta1/common.proto\x1a\'google/firestore/v1beta1/document.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\x9d\x02\n\x05Write\x12\x34\n\x06update\x18\x01 \x01(\x0b\x32\".google.firestore.v1beta1.DocumentH\x00\x12\x10\n\x06\x64\x65lete\x18\x02 \x01(\tH\x00\x12@\n\ttransform\x18\x06 \x01(\x0b\x32+.google.firestore.v1beta1.DocumentTransformH\x00\x12;\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32&.google.firestore.v1beta1.DocumentMask\x12@\n\x10\x63urrent_document\x18\x04 \x01(\x0b\x32&.google.firestore.v1beta1.PreconditionB\x0b\n\toperation\"\x88\x05\n\x11\x44ocumentTransform\x12\x10\n\x08\x64ocument\x18\x01 \x01(\t\x12T\n\x10\x66ield_transforms\x18\x02 \x03(\x0b\x32:.google.firestore.v1beta1.DocumentTransform.FieldTransform\x1a\x8a\x04\n\x0e\x46ieldTransform\x12\x12\n\nfield_path\x18\x01 \x01(\t\x12\x65\n\x13set_to_server_value\x18\x02 \x01(\x0e\x32\x46.google.firestore.v1beta1.DocumentTransform.FieldTransform.ServerValueH\x00\x12\x34\n\tincrement\x18\x03 \x01(\x0b\x32\x1f.google.firestore.v1beta1.ValueH\x00\x12\x32\n\x07maximum\x18\x04 \x01(\x0b\x32\x1f.google.firestore.v1beta1.ValueH\x00\x12\x32\n\x07minimum\x18\x05 \x01(\x0b\x32\x1f.google.firestore.v1beta1.ValueH\x00\x12G\n\x17\x61ppend_missing_elements\x18\x06 \x01(\x0b\x32$.google.firestore.v1beta1.ArrayValueH\x00\x12\x45\n\x15remove_all_from_array\x18\x07 \x01(\x0b\x32$.google.firestore.v1beta1.ArrayValueH\x00\"=\n\x0bServerValue\x12\x1c\n\x18SERVER_VALUE_UNSPECIFIED\x10\x00\x12\x10\n\x0cREQUEST_TIME\x10\x01\x42\x10\n\x0etransform_type\"z\n\x0bWriteResult\x12/\n\x0bupdate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12:\n\x11transform_results\x18\x02 \x03(\x0b\x32\x1f.google.firestore.v1beta1.Value\"v\n\x0e\x44ocumentChange\x12\x34\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\".google.firestore.v1beta1.Document\x12\x12\n\ntarget_ids\x18\x05 \x03(\x05\x12\x1a\n\x12removed_target_ids\x18\x06 \x03(\x05\"m\n\x0e\x44ocumentDelete\x12\x10\n\x08\x64ocument\x18\x01 \x01(\t\x12\x1a\n\x12removed_target_ids\x18\x06 \x03(\x05\x12-\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"m\n\x0e\x44ocumentRemove\x12\x10\n\x08\x64ocument\x18\x01 \x01(\t\x12\x1a\n\x12removed_target_ids\x18\x02 \x03(\x05\x12-\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"3\n\x0f\x45xistenceFilter\x12\x11\n\ttarget_id\x18\x01 \x01(\x05\x12\r\n\x05\x63ount\x18\x02 \x01(\x05\x42\xdc\x01\n\x1c\x63om.google.firestore.v1beta1B\nWriteProtoP\x01ZAgoogle.golang.org/genproto/googleapis/firestore/v1beta1;firestore\xa2\x02\x04GCFS\xaa\x02\x1eGoogle.Cloud.Firestore.V1Beta1\xca\x02\x1eGoogle\\Cloud\\Firestore\\V1beta1\xea\x02!Google::Cloud::Firestore::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_firestore_dot_v1beta1_dot_common__pb2.DESCRIPTOR,google_dot_firestore_dot_v1beta1_dot_document__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE = _descriptor.EnumDescriptor(
  name='ServerValue',
  full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.ServerValue',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SERVER_VALUE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REQUEST_TIME', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1067,
  serialized_end=1128,
)
_sym_db.RegisterEnumDescriptor(_DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE)


_WRITE = _descriptor.Descriptor(
  name='Write',
  full_name='google.firestore.v1beta1.Write',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update', full_name='google.firestore.v1beta1.Write.update', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='delete', full_name='google.firestore.v1beta1.Write.delete', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transform', full_name='google.firestore.v1beta1.Write.transform', index=2,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.firestore.v1beta1.Write.update_mask', index=3,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='current_document', full_name='google.firestore.v1beta1.Write.current_document', index=4,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.firestore.v1beta1.Write.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=210,
  serialized_end=495,
)


_DOCUMENTTRANSFORM_FIELDTRANSFORM = _descriptor.Descriptor(
  name='FieldTransform',
  full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='field_path', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.field_path', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='set_to_server_value', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.set_to_server_value', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='increment', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.increment', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='maximum', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.maximum', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='minimum', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.minimum', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='append_missing_elements', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.append_missing_elements', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove_all_from_array', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.remove_all_from_array', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='transform_type', full_name='google.firestore.v1beta1.DocumentTransform.FieldTransform.transform_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=624,
  serialized_end=1146,
)

_DOCUMENTTRANSFORM = _descriptor.Descriptor(
  name='DocumentTransform',
  full_name='google.firestore.v1beta1.DocumentTransform',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='document', full_name='google.firestore.v1beta1.DocumentTransform.document', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='field_transforms', full_name='google.firestore.v1beta1.DocumentTransform.field_transforms', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_DOCUMENTTRANSFORM_FIELDTRANSFORM, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=498,
  serialized_end=1146,
)


_WRITERESULT = _descriptor.Descriptor(
  name='WriteResult',
  full_name='google.firestore.v1beta1.WriteResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.firestore.v1beta1.WriteResult.update_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transform_results', full_name='google.firestore.v1beta1.WriteResult.transform_results', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1148,
  serialized_end=1270,
)


_DOCUMENTCHANGE = _descriptor.Descriptor(
  name='DocumentChange',
  full_name='google.firestore.v1beta1.DocumentChange',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='document', full_name='google.firestore.v1beta1.DocumentChange.document', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_ids', full_name='google.firestore.v1beta1.DocumentChange.target_ids', index=1,
      number=5, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='removed_target_ids', full_name='google.firestore.v1beta1.DocumentChange.removed_target_ids', index=2,
      number=6, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1272,
  serialized_end=1390,
)


_DOCUMENTDELETE = _descriptor.Descriptor(
  name='DocumentDelete',
  full_name='google.firestore.v1beta1.DocumentDelete',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='document', full_name='google.firestore.v1beta1.DocumentDelete.document', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='removed_target_ids', full_name='google.firestore.v1beta1.DocumentDelete.removed_target_ids', index=1,
      number=6, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_time', full_name='google.firestore.v1beta1.DocumentDelete.read_time', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1392,
  serialized_end=1501,
)


_DOCUMENTREMOVE = _descriptor.Descriptor(
  name='DocumentRemove',
  full_name='google.firestore.v1beta1.DocumentRemove',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='document', full_name='google.firestore.v1beta1.DocumentRemove.document', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='removed_target_ids', full_name='google.firestore.v1beta1.DocumentRemove.removed_target_ids', index=1,
      number=2, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_time', full_name='google.firestore.v1beta1.DocumentRemove.read_time', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1503,
  serialized_end=1612,
)


_EXISTENCEFILTER = _descriptor.Descriptor(
  name='ExistenceFilter',
  full_name='google.firestore.v1beta1.ExistenceFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_id', full_name='google.firestore.v1beta1.ExistenceFilter.target_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='count', full_name='google.firestore.v1beta1.ExistenceFilter.count', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1614,
  serialized_end=1665,
)

_WRITE.fields_by_name['update'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._DOCUMENT
_WRITE.fields_by_name['transform'].message_type = _DOCUMENTTRANSFORM
_WRITE.fields_by_name['update_mask'].message_type = google_dot_firestore_dot_v1beta1_dot_common__pb2._DOCUMENTMASK
_WRITE.fields_by_name['current_document'].message_type = google_dot_firestore_dot_v1beta1_dot_common__pb2._PRECONDITION
_WRITE.oneofs_by_name['operation'].fields.append(
  _WRITE.fields_by_name['update'])
_WRITE.fields_by_name['update'].containing_oneof = _WRITE.oneofs_by_name['operation']
_WRITE.oneofs_by_name['operation'].fields.append(
  _WRITE.fields_by_name['delete'])
_WRITE.fields_by_name['delete'].containing_oneof = _WRITE.oneofs_by_name['operation']
_WRITE.oneofs_by_name['operation'].fields.append(
  _WRITE.fields_by_name['transform'])
_WRITE.fields_by_name['transform'].containing_oneof = _WRITE.oneofs_by_name['operation']
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['set_to_server_value'].enum_type = _DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['increment'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._VALUE
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['maximum'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._VALUE
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['minimum'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._VALUE
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['append_missing_elements'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._ARRAYVALUE
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['remove_all_from_array'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._ARRAYVALUE
_DOCUMENTTRANSFORM_FIELDTRANSFORM.containing_type = _DOCUMENTTRANSFORM
_DOCUMENTTRANSFORM_FIELDTRANSFORM_SERVERVALUE.containing_type = _DOCUMENTTRANSFORM_FIELDTRANSFORM
_DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type'].fields.append(
  _DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['set_to_server_value'])
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['set_to_server_value'].containing_oneof = _DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type']
_DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type'].fields.append(
  _DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['increment'])
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['increment'].containing_oneof = _DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type']
_DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type'].fields.append(
  _DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['maximum'])
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['maximum'].containing_oneof = _DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type']
_DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type'].fields.append(
  _DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['minimum'])
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['minimum'].containing_oneof = _DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type']
_DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type'].fields.append(
  _DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['append_missing_elements'])
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['append_missing_elements'].containing_oneof = _DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type']
_DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type'].fields.append(
  _DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['remove_all_from_array'])
_DOCUMENTTRANSFORM_FIELDTRANSFORM.fields_by_name['remove_all_from_array'].containing_oneof = _DOCUMENTTRANSFORM_FIELDTRANSFORM.oneofs_by_name['transform_type']
_DOCUMENTTRANSFORM.fields_by_name['field_transforms'].message_type = _DOCUMENTTRANSFORM_FIELDTRANSFORM
_WRITERESULT.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_WRITERESULT.fields_by_name['transform_results'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._VALUE
_DOCUMENTCHANGE.fields_by_name['document'].message_type = google_dot_firestore_dot_v1beta1_dot_document__pb2._DOCUMENT
_DOCUMENTDELETE.fields_by_name['read_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_DOCUMENTREMOVE.fields_by_name['read_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['Write'] = _WRITE
DESCRIPTOR.message_types_by_name['DocumentTransform'] = _DOCUMENTTRANSFORM
DESCRIPTOR.message_types_by_name['WriteResult'] = _WRITERESULT
DESCRIPTOR.message_types_by_name['DocumentChange'] = _DOCUMENTCHANGE
DESCRIPTOR.message_types_by_name['DocumentDelete'] = _DOCUMENTDELETE
DESCRIPTOR.message_types_by_name['DocumentRemove'] = _DOCUMENTREMOVE
DESCRIPTOR.message_types_by_name['ExistenceFilter'] = _EXISTENCEFILTER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Write = _reflection.GeneratedProtocolMessageType('Write', (_message.Message,), {
  'DESCRIPTOR' : _WRITE,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.Write)
  })
_sym_db.RegisterMessage(Write)

DocumentTransform = _reflection.GeneratedProtocolMessageType('DocumentTransform', (_message.Message,), {

  'FieldTransform' : _reflection.GeneratedProtocolMessageType('FieldTransform', (_message.Message,), {
    'DESCRIPTOR' : _DOCUMENTTRANSFORM_FIELDTRANSFORM,
    '__module__' : 'google.firestore.v1beta1.write_pb2'
    # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.DocumentTransform.FieldTransform)
    })
  ,
  'DESCRIPTOR' : _DOCUMENTTRANSFORM,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.DocumentTransform)
  })
_sym_db.RegisterMessage(DocumentTransform)
_sym_db.RegisterMessage(DocumentTransform.FieldTransform)

WriteResult = _reflection.GeneratedProtocolMessageType('WriteResult', (_message.Message,), {
  'DESCRIPTOR' : _WRITERESULT,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.WriteResult)
  })
_sym_db.RegisterMessage(WriteResult)

DocumentChange = _reflection.GeneratedProtocolMessageType('DocumentChange', (_message.Message,), {
  'DESCRIPTOR' : _DOCUMENTCHANGE,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.DocumentChange)
  })
_sym_db.RegisterMessage(DocumentChange)

DocumentDelete = _reflection.GeneratedProtocolMessageType('DocumentDelete', (_message.Message,), {
  'DESCRIPTOR' : _DOCUMENTDELETE,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.DocumentDelete)
  })
_sym_db.RegisterMessage(DocumentDelete)

DocumentRemove = _reflection.GeneratedProtocolMessageType('DocumentRemove', (_message.Message,), {
  'DESCRIPTOR' : _DOCUMENTREMOVE,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.DocumentRemove)
  })
_sym_db.RegisterMessage(DocumentRemove)

ExistenceFilter = _reflection.GeneratedProtocolMessageType('ExistenceFilter', (_message.Message,), {
  'DESCRIPTOR' : _EXISTENCEFILTER,
  '__module__' : 'google.firestore.v1beta1.write_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.v1beta1.ExistenceFilter)
  })
_sym_db.RegisterMessage(ExistenceFilter)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
