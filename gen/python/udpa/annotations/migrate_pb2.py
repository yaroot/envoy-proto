# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: udpa/annotations/migrate.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import descriptor_pb2 as google_dot_protobuf_dot_descriptor__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1eudpa/annotations/migrate.proto\x12\x10udpa.annotations\x1a google/protobuf/descriptor.proto\"#\n\x11MigrateAnnotation\x12\x0e\n\x06rename\x18\x01 \x01(\t\"A\n\x16\x46ieldMigrateAnnotation\x12\x0e\n\x06rename\x18\x01 \x01(\t\x12\x17\n\x0foneof_promotion\x18\x02 \x01(\t\"0\n\x15\x46ileMigrateAnnotation\x12\x17\n\x0fmove_to_package\x18\x02 \x01(\t:`\n\x0fmessage_migrate\x12\x1f.google.protobuf.MessageOptions\x18\x8e\xe3\xffQ \x01(\x0b\x32#.udpa.annotations.MigrateAnnotation:a\n\rfield_migrate\x12\x1d.google.protobuf.FieldOptions\x18\x8e\xe3\xffQ \x01(\x0b\x32(.udpa.annotations.FieldMigrateAnnotation:Z\n\x0c\x65num_migrate\x12\x1c.google.protobuf.EnumOptions\x18\x8e\xe3\xffQ \x01(\x0b\x32#.udpa.annotations.MigrateAnnotation:e\n\x12\x65num_value_migrate\x12!.google.protobuf.EnumValueOptions\x18\x8e\xe3\xffQ \x01(\x0b\x32#.udpa.annotations.MigrateAnnotation:^\n\x0c\x66ile_migrate\x12\x1c.google.protobuf.FileOptions\x18\x8e\xe3\xffQ \x01(\x0b\x32\'.udpa.annotations.FileMigrateAnnotationB$Z\"github.com/cncf/xds/go/annotationsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'udpa.annotations.migrate_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:
  google_dot_protobuf_dot_descriptor__pb2.MessageOptions.RegisterExtension(message_migrate)
  google_dot_protobuf_dot_descriptor__pb2.FieldOptions.RegisterExtension(field_migrate)
  google_dot_protobuf_dot_descriptor__pb2.EnumOptions.RegisterExtension(enum_migrate)
  google_dot_protobuf_dot_descriptor__pb2.EnumValueOptions.RegisterExtension(enum_value_migrate)
  google_dot_protobuf_dot_descriptor__pb2.FileOptions.RegisterExtension(file_migrate)

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z\"github.com/cncf/xds/go/annotations'
  _MIGRATEANNOTATION._serialized_start=86
  _MIGRATEANNOTATION._serialized_end=121
  _FIELDMIGRATEANNOTATION._serialized_start=123
  _FIELDMIGRATEANNOTATION._serialized_end=188
  _FILEMIGRATEANNOTATION._serialized_start=190
  _FILEMIGRATEANNOTATION._serialized_end=238
# @@protoc_insertion_point(module_scope)