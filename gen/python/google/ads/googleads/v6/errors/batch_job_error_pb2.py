# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/errors/batch_job_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/errors/batch_job_error.proto',
  package='google.ads.googleads.v6.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v6.errorsB\022BatchJobErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6.Errors\312\002\036Google\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::Ads::GoogleAds::V6::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v6/errors/batch_job_error.proto\x12\x1egoogle.ads.googleads.v6.errors\x1a\x1cgoogle/api/annotations.proto\"\xf4\x01\n\x11\x42\x61tchJobErrorEnum\"\xde\x01\n\rBatchJobError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12.\n*CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING\x10\x02\x12\x14\n\x10\x45MPTY_OPERATIONS\x10\x03\x12\x1a\n\x16INVALID_SEQUENCE_TOKEN\x10\x04\x12\x15\n\x11RESULTS_NOT_READY\x10\x05\x12\x15\n\x11INVALID_PAGE_SIZE\x10\x06\x12\x1f\n\x1b\x43\x41N_ONLY_REMOVE_PENDING_JOB\x10\x07\x42\xed\x01\n\"com.google.ads.googleads.v6.errorsB\x12\x42\x61tchJobErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V6.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V6\\Errors\xea\x02\"Google::Ads::GoogleAds::V6::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_BATCHJOBERRORENUM_BATCHJOBERROR = _descriptor.EnumDescriptor(
  name='BatchJobError',
  full_name='google.ads.googleads.v6.errors.BatchJobErrorEnum.BatchJobError',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EMPTY_OPERATIONS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_SEQUENCE_TOKEN', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESULTS_NOT_READY', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PAGE_SIZE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAN_ONLY_REMOVE_PENDING_JOB', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=141,
  serialized_end=363,
)
_sym_db.RegisterEnumDescriptor(_BATCHJOBERRORENUM_BATCHJOBERROR)


_BATCHJOBERRORENUM = _descriptor.Descriptor(
  name='BatchJobErrorEnum',
  full_name='google.ads.googleads.v6.errors.BatchJobErrorEnum',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _BATCHJOBERRORENUM_BATCHJOBERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=119,
  serialized_end=363,
)

_BATCHJOBERRORENUM_BATCHJOBERROR.containing_type = _BATCHJOBERRORENUM
DESCRIPTOR.message_types_by_name['BatchJobErrorEnum'] = _BATCHJOBERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BatchJobErrorEnum = _reflection.GeneratedProtocolMessageType('BatchJobErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _BATCHJOBERRORENUM,
  '__module__' : 'google.ads.googleads.v6.errors.batch_job_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.errors.BatchJobErrorEnum)
  })
_sym_db.RegisterMessage(BatchJobErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
