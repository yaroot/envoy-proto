# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/v1beta1/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%google/firestore/v1beta1/common.proto\x12\x18google.firestore.v1beta1\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"#\n\x0c\x44ocumentMask\x12\x13\n\x0b\x66ield_paths\x18\x01 \x03(\t\"e\n\x0cPrecondition\x12\x10\n\x06\x65xists\x18\x01 \x01(\x08H\x00\x12\x31\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x10\n\x0e\x63ondition_type\"\xb3\x02\n\x12TransactionOptions\x12J\n\tread_only\x18\x02 \x01(\x0b\x32\x35.google.firestore.v1beta1.TransactionOptions.ReadOnlyH\x00\x12L\n\nread_write\x18\x03 \x01(\x0b\x32\x36.google.firestore.v1beta1.TransactionOptions.ReadWriteH\x00\x1a&\n\tReadWrite\x12\x19\n\x11retry_transaction\x18\x01 \x01(\x0c\x1aS\n\x08ReadOnly\x12/\n\tread_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x16\n\x14\x63onsistency_selectorB\x06\n\x04modeB\xdd\x01\n\x1c\x63om.google.firestore.v1beta1B\x0b\x43ommonProtoP\x01ZAgoogle.golang.org/genproto/googleapis/firestore/v1beta1;firestore\xa2\x02\x04GCFS\xaa\x02\x1eGoogle.Cloud.Firestore.V1Beta1\xca\x02\x1eGoogle\\Cloud\\Firestore\\V1beta1\xea\x02!Google::Cloud::Firestore::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.v1beta1.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.firestore.v1beta1B\013CommonProtoP\001ZAgoogle.golang.org/genproto/googleapis/firestore/v1beta1;firestore\242\002\004GCFS\252\002\036Google.Cloud.Firestore.V1Beta1\312\002\036Google\\Cloud\\Firestore\\V1beta1\352\002!Google::Cloud::Firestore::V1beta1'
  _DOCUMENTMASK._serialized_start=130
  _DOCUMENTMASK._serialized_end=165
  _PRECONDITION._serialized_start=167
  _PRECONDITION._serialized_end=268
  _TRANSACTIONOPTIONS._serialized_start=271
  _TRANSACTIONOPTIONS._serialized_end=578
  _TRANSACTIONOPTIONS_READWRITE._serialized_start=447
  _TRANSACTIONOPTIONS_READWRITE._serialized_end=485
  _TRANSACTIONOPTIONS_READONLY._serialized_start=487
  _TRANSACTIONOPTIONS_READONLY._serialized_end=570
# @@protoc_insertion_point(module_scope)
