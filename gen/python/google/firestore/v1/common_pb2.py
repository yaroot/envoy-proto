# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/v1/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n google/firestore/v1/common.proto\x12\x13google.firestore.v1\x1a\x1fgoogle/protobuf/timestamp.proto\"#\n\x0c\x44ocumentMask\x12\x13\n\x0b\x66ield_paths\x18\x01 \x03(\t\"e\n\x0cPrecondition\x12\x10\n\x06\x65xists\x18\x01 \x01(\x08H\x00\x12\x31\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x10\n\x0e\x63ondition_type\"\xa9\x02\n\x12TransactionOptions\x12\x45\n\tread_only\x18\x02 \x01(\x0b\x32\x30.google.firestore.v1.TransactionOptions.ReadOnlyH\x00\x12G\n\nread_write\x18\x03 \x01(\x0b\x32\x31.google.firestore.v1.TransactionOptions.ReadWriteH\x00\x1a&\n\tReadWrite\x12\x19\n\x11retry_transaction\x18\x01 \x01(\x0c\x1aS\n\x08ReadOnly\x12/\n\tread_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x16\n\x14\x63onsistency_selectorB\x06\n\x04modeB\xc4\x01\n\x17\x63om.google.firestore.v1B\x0b\x43ommonProtoP\x01Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\xa2\x02\x04GCFS\xaa\x02\x19Google.Cloud.Firestore.V1\xca\x02\x19Google\\Cloud\\Firestore\\V1\xea\x02\x1cGoogle::Cloud::Firestore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.v1.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.firestore.v1B\013CommonProtoP\001Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\242\002\004GCFS\252\002\031Google.Cloud.Firestore.V1\312\002\031Google\\Cloud\\Firestore\\V1\352\002\034Google::Cloud::Firestore::V1'
  _DOCUMENTMASK._serialized_start=90
  _DOCUMENTMASK._serialized_end=125
  _PRECONDITION._serialized_start=127
  _PRECONDITION._serialized_end=228
  _TRANSACTIONOPTIONS._serialized_start=231
  _TRANSACTIONOPTIONS._serialized_end=528
  _TRANSACTIONOPTIONS_READWRITE._serialized_start=397
  _TRANSACTIONOPTIONS_READWRITE._serialized_end=435
  _TRANSACTIONOPTIONS_READONLY._serialized_start=437
  _TRANSACTIONOPTIONS_READONLY._serialized_end=520
# @@protoc_insertion_point(module_scope)
