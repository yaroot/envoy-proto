# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/coverage_summary.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.devtools.resultstore.v2 import common_pb2 as google_dot_devtools_dot_resultstore_dot_v2_dot_common__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/resultstore/v2/coverage_summary.proto',
  package='google.devtools.resultstore.v2',
  syntax='proto3',
  serialized_options=b'\n\"com.google.devtools.resultstore.v2P\001ZIgoogle.golang.org/genproto/googleapis/devtools/resultstore/v2;resultstore',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/devtools/resultstore/v2/coverage_summary.proto\x12\x1egoogle.devtools.resultstore.v2\x1a+google/devtools/resultstore/v2/common.proto\"S\n\x13LineCoverageSummary\x12\x1f\n\x17instrumented_line_count\x18\x01 \x01(\x05\x12\x1b\n\x13\x65xecuted_line_count\x18\x02 \x01(\x05\"n\n\x15\x42ranchCoverageSummary\x12\x1a\n\x12total_branch_count\x18\x01 \x01(\x05\x12\x1d\n\x15\x65xecuted_branch_count\x18\x02 \x01(\x05\x12\x1a\n\x12taken_branch_count\x18\x03 \x01(\x05\"\xef\x01\n\x17LanguageCoverageSummary\x12:\n\x08language\x18\x01 \x01(\x0e\x32(.google.devtools.resultstore.v2.Language\x12I\n\x0cline_summary\x18\x02 \x01(\x0b\x32\x33.google.devtools.resultstore.v2.LineCoverageSummary\x12M\n\x0e\x62ranch_summary\x18\x03 \x01(\x0b\x32\x35.google.devtools.resultstore.v2.BranchCoverageSummaryBq\n\"com.google.devtools.resultstore.v2P\x01ZIgoogle.golang.org/genproto/googleapis/devtools/resultstore/v2;resultstoreb\x06proto3'
  ,
  dependencies=[google_dot_devtools_dot_resultstore_dot_v2_dot_common__pb2.DESCRIPTOR,])




_LINECOVERAGESUMMARY = _descriptor.Descriptor(
  name='LineCoverageSummary',
  full_name='google.devtools.resultstore.v2.LineCoverageSummary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='instrumented_line_count', full_name='google.devtools.resultstore.v2.LineCoverageSummary.instrumented_line_count', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='executed_line_count', full_name='google.devtools.resultstore.v2.LineCoverageSummary.executed_line_count', index=1,
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
  serialized_start=134,
  serialized_end=217,
)


_BRANCHCOVERAGESUMMARY = _descriptor.Descriptor(
  name='BranchCoverageSummary',
  full_name='google.devtools.resultstore.v2.BranchCoverageSummary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='total_branch_count', full_name='google.devtools.resultstore.v2.BranchCoverageSummary.total_branch_count', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='executed_branch_count', full_name='google.devtools.resultstore.v2.BranchCoverageSummary.executed_branch_count', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='taken_branch_count', full_name='google.devtools.resultstore.v2.BranchCoverageSummary.taken_branch_count', index=2,
      number=3, type=5, cpp_type=1, label=1,
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
  serialized_start=219,
  serialized_end=329,
)


_LANGUAGECOVERAGESUMMARY = _descriptor.Descriptor(
  name='LanguageCoverageSummary',
  full_name='google.devtools.resultstore.v2.LanguageCoverageSummary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='language', full_name='google.devtools.resultstore.v2.LanguageCoverageSummary.language', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='line_summary', full_name='google.devtools.resultstore.v2.LanguageCoverageSummary.line_summary', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='branch_summary', full_name='google.devtools.resultstore.v2.LanguageCoverageSummary.branch_summary', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=332,
  serialized_end=571,
)

_LANGUAGECOVERAGESUMMARY.fields_by_name['language'].enum_type = google_dot_devtools_dot_resultstore_dot_v2_dot_common__pb2._LANGUAGE
_LANGUAGECOVERAGESUMMARY.fields_by_name['line_summary'].message_type = _LINECOVERAGESUMMARY
_LANGUAGECOVERAGESUMMARY.fields_by_name['branch_summary'].message_type = _BRANCHCOVERAGESUMMARY
DESCRIPTOR.message_types_by_name['LineCoverageSummary'] = _LINECOVERAGESUMMARY
DESCRIPTOR.message_types_by_name['BranchCoverageSummary'] = _BRANCHCOVERAGESUMMARY
DESCRIPTOR.message_types_by_name['LanguageCoverageSummary'] = _LANGUAGECOVERAGESUMMARY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LineCoverageSummary = _reflection.GeneratedProtocolMessageType('LineCoverageSummary', (_message.Message,), {
  'DESCRIPTOR' : _LINECOVERAGESUMMARY,
  '__module__' : 'google.devtools.resultstore.v2.coverage_summary_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.LineCoverageSummary)
  })
_sym_db.RegisterMessage(LineCoverageSummary)

BranchCoverageSummary = _reflection.GeneratedProtocolMessageType('BranchCoverageSummary', (_message.Message,), {
  'DESCRIPTOR' : _BRANCHCOVERAGESUMMARY,
  '__module__' : 'google.devtools.resultstore.v2.coverage_summary_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.BranchCoverageSummary)
  })
_sym_db.RegisterMessage(BranchCoverageSummary)

LanguageCoverageSummary = _reflection.GeneratedProtocolMessageType('LanguageCoverageSummary', (_message.Message,), {
  'DESCRIPTOR' : _LANGUAGECOVERAGESUMMARY,
  '__module__' : 'google.devtools.resultstore.v2.coverage_summary_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.resultstore.v2.LanguageCoverageSummary)
  })
_sym_db.RegisterMessage(LanguageCoverageSummary)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
