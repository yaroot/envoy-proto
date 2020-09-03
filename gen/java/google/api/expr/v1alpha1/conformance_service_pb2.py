# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/api/expr/v1alpha1/conformance_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api.expr.v1alpha1 import checked_pb2 as google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2
from google.api.expr.v1alpha1 import eval_pb2 as google_dot_api_dot_expr_dot_v1alpha1_dot_eval__pb2
from google.api.expr.v1alpha1 import syntax_pb2 as google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/api/expr/v1alpha1/conformance_service.proto',
  package='google.api.expr.v1alpha1',
  syntax='proto3',
  serialized_options=b'\n\034com.google.api.expr.v1alpha1B\027ConformanceServiceProtoP\001ZJgoogle.golang.org/genproto/googleapis/api/expr/conformance/v1alpha1;confpb\370\001\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/api/expr/v1alpha1/conformance_service.proto\x12\x18google.api.expr.v1alpha1\x1a&google/api/expr/v1alpha1/checked.proto\x1a#google/api/expr/v1alpha1/eval.proto\x1a%google/api/expr/v1alpha1/syntax.proto\x1a\x17google/rpc/status.proto\"k\n\x0cParseRequest\x12\x12\n\ncel_source\x18\x01 \x01(\t\x12\x16\n\x0esyntax_version\x18\x02 \x01(\t\x12\x17\n\x0fsource_location\x18\x03 \x01(\t\x12\x16\n\x0e\x64isable_macros\x18\x04 \x01(\x08\"n\n\rParseResponse\x12\x39\n\x0bparsed_expr\x18\x01 \x01(\x0b\x32$.google.api.expr.v1alpha1.ParsedExpr\x12\"\n\x06issues\x18\x02 \x03(\x0b\x32\x12.google.rpc.Status\"\xa2\x01\n\x0c\x43heckRequest\x12\x39\n\x0bparsed_expr\x18\x01 \x01(\x0b\x32$.google.api.expr.v1alpha1.ParsedExpr\x12\x30\n\x08type_env\x18\x02 \x03(\x0b\x32\x1e.google.api.expr.v1alpha1.Decl\x12\x11\n\tcontainer\x18\x03 \x01(\t\x12\x12\n\nno_std_env\x18\x04 \x01(\x08\"p\n\rCheckResponse\x12;\n\x0c\x63hecked_expr\x18\x01 \x01(\x0b\x32%.google.api.expr.v1alpha1.CheckedExpr\x12\"\n\x06issues\x18\x02 \x03(\x0b\x32\x12.google.rpc.Status\"\xc6\x02\n\x0b\x45valRequest\x12;\n\x0bparsed_expr\x18\x01 \x01(\x0b\x32$.google.api.expr.v1alpha1.ParsedExprH\x00\x12=\n\x0c\x63hecked_expr\x18\x02 \x01(\x0b\x32%.google.api.expr.v1alpha1.CheckedExprH\x00\x12\x45\n\x08\x62indings\x18\x03 \x03(\x0b\x32\x33.google.api.expr.v1alpha1.EvalRequest.BindingsEntry\x12\x11\n\tcontainer\x18\x04 \x01(\t\x1aT\n\rBindingsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x32\n\x05value\x18\x02 \x01(\x0b\x32#.google.api.expr.v1alpha1.ExprValue:\x02\x38\x01\x42\x0b\n\texpr_kind\"g\n\x0c\x45valResponse\x12\x33\n\x06result\x18\x01 \x01(\x0b\x32#.google.api.expr.v1alpha1.ExprValue\x12\"\n\x06issues\x18\x02 \x03(\x0b\x32\x12.google.rpc.Status\"\xe8\x01\n\x0cIssueDetails\x12\x41\n\x08severity\x18\x01 \x01(\x0e\x32/.google.api.expr.v1alpha1.IssueDetails.Severity\x12:\n\x08position\x18\x02 \x01(\x0b\x32(.google.api.expr.v1alpha1.SourcePosition\x12\n\n\x02id\x18\x03 \x01(\x03\"M\n\x08Severity\x12\x18\n\x14SEVERITY_UNSPECIFIED\x10\x00\x12\x0f\n\x0b\x44\x45PRECATION\x10\x01\x12\x0b\n\x07WARNING\x10\x02\x12\t\n\x05\x45RROR\x10\x03\x32\xa5\x02\n\x12\x43onformanceService\x12Z\n\x05Parse\x12&.google.api.expr.v1alpha1.ParseRequest\x1a\'.google.api.expr.v1alpha1.ParseResponse\"\x00\x12Z\n\x05\x43heck\x12&.google.api.expr.v1alpha1.CheckRequest\x1a\'.google.api.expr.v1alpha1.CheckResponse\"\x00\x12W\n\x04\x45val\x12%.google.api.expr.v1alpha1.EvalRequest\x1a&.google.api.expr.v1alpha1.EvalResponse\"\x00\x42\x88\x01\n\x1c\x63om.google.api.expr.v1alpha1B\x17\x43onformanceServiceProtoP\x01ZJgoogle.golang.org/genproto/googleapis/api/expr/conformance/v1alpha1;confpb\xf8\x01\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2.DESCRIPTOR,google_dot_api_dot_expr_dot_v1alpha1_dot_eval__pb2.DESCRIPTOR,google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])



_ISSUEDETAILS_SEVERITY = _descriptor.EnumDescriptor(
  name='Severity',
  full_name='google.api.expr.v1alpha1.IssueDetails.Severity',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SEVERITY_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DEPRECATION', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WARNING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ERROR', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1311,
  serialized_end=1388,
)
_sym_db.RegisterEnumDescriptor(_ISSUEDETAILS_SEVERITY)


_PARSEREQUEST = _descriptor.Descriptor(
  name='ParseRequest',
  full_name='google.api.expr.v1alpha1.ParseRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cel_source', full_name='google.api.expr.v1alpha1.ParseRequest.cel_source', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='syntax_version', full_name='google.api.expr.v1alpha1.ParseRequest.syntax_version', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_location', full_name='google.api.expr.v1alpha1.ParseRequest.source_location', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='disable_macros', full_name='google.api.expr.v1alpha1.ParseRequest.disable_macros', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=221,
  serialized_end=328,
)


_PARSERESPONSE = _descriptor.Descriptor(
  name='ParseResponse',
  full_name='google.api.expr.v1alpha1.ParseResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parsed_expr', full_name='google.api.expr.v1alpha1.ParseResponse.parsed_expr', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='issues', full_name='google.api.expr.v1alpha1.ParseResponse.issues', index=1,
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
  serialized_start=330,
  serialized_end=440,
)


_CHECKREQUEST = _descriptor.Descriptor(
  name='CheckRequest',
  full_name='google.api.expr.v1alpha1.CheckRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parsed_expr', full_name='google.api.expr.v1alpha1.CheckRequest.parsed_expr', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type_env', full_name='google.api.expr.v1alpha1.CheckRequest.type_env', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='container', full_name='google.api.expr.v1alpha1.CheckRequest.container', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='no_std_env', full_name='google.api.expr.v1alpha1.CheckRequest.no_std_env', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=443,
  serialized_end=605,
)


_CHECKRESPONSE = _descriptor.Descriptor(
  name='CheckResponse',
  full_name='google.api.expr.v1alpha1.CheckResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='checked_expr', full_name='google.api.expr.v1alpha1.CheckResponse.checked_expr', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='issues', full_name='google.api.expr.v1alpha1.CheckResponse.issues', index=1,
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
  serialized_start=607,
  serialized_end=719,
)


_EVALREQUEST_BINDINGSENTRY = _descriptor.Descriptor(
  name='BindingsEntry',
  full_name='google.api.expr.v1alpha1.EvalRequest.BindingsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.api.expr.v1alpha1.EvalRequest.BindingsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.api.expr.v1alpha1.EvalRequest.BindingsEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=951,
  serialized_end=1035,
)

_EVALREQUEST = _descriptor.Descriptor(
  name='EvalRequest',
  full_name='google.api.expr.v1alpha1.EvalRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parsed_expr', full_name='google.api.expr.v1alpha1.EvalRequest.parsed_expr', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='checked_expr', full_name='google.api.expr.v1alpha1.EvalRequest.checked_expr', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bindings', full_name='google.api.expr.v1alpha1.EvalRequest.bindings', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='container', full_name='google.api.expr.v1alpha1.EvalRequest.container', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_EVALREQUEST_BINDINGSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='expr_kind', full_name='google.api.expr.v1alpha1.EvalRequest.expr_kind',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=722,
  serialized_end=1048,
)


_EVALRESPONSE = _descriptor.Descriptor(
  name='EvalResponse',
  full_name='google.api.expr.v1alpha1.EvalResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='google.api.expr.v1alpha1.EvalResponse.result', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='issues', full_name='google.api.expr.v1alpha1.EvalResponse.issues', index=1,
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
  serialized_start=1050,
  serialized_end=1153,
)


_ISSUEDETAILS = _descriptor.Descriptor(
  name='IssueDetails',
  full_name='google.api.expr.v1alpha1.IssueDetails',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='severity', full_name='google.api.expr.v1alpha1.IssueDetails.severity', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='position', full_name='google.api.expr.v1alpha1.IssueDetails.position', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.api.expr.v1alpha1.IssueDetails.id', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _ISSUEDETAILS_SEVERITY,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1156,
  serialized_end=1388,
)

_PARSERESPONSE.fields_by_name['parsed_expr'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2._PARSEDEXPR
_PARSERESPONSE.fields_by_name['issues'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_CHECKREQUEST.fields_by_name['parsed_expr'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2._PARSEDEXPR
_CHECKREQUEST.fields_by_name['type_env'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2._DECL
_CHECKRESPONSE.fields_by_name['checked_expr'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2._CHECKEDEXPR
_CHECKRESPONSE.fields_by_name['issues'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_EVALREQUEST_BINDINGSENTRY.fields_by_name['value'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_eval__pb2._EXPRVALUE
_EVALREQUEST_BINDINGSENTRY.containing_type = _EVALREQUEST
_EVALREQUEST.fields_by_name['parsed_expr'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2._PARSEDEXPR
_EVALREQUEST.fields_by_name['checked_expr'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2._CHECKEDEXPR
_EVALREQUEST.fields_by_name['bindings'].message_type = _EVALREQUEST_BINDINGSENTRY
_EVALREQUEST.oneofs_by_name['expr_kind'].fields.append(
  _EVALREQUEST.fields_by_name['parsed_expr'])
_EVALREQUEST.fields_by_name['parsed_expr'].containing_oneof = _EVALREQUEST.oneofs_by_name['expr_kind']
_EVALREQUEST.oneofs_by_name['expr_kind'].fields.append(
  _EVALREQUEST.fields_by_name['checked_expr'])
_EVALREQUEST.fields_by_name['checked_expr'].containing_oneof = _EVALREQUEST.oneofs_by_name['expr_kind']
_EVALRESPONSE.fields_by_name['result'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_eval__pb2._EXPRVALUE
_EVALRESPONSE.fields_by_name['issues'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_ISSUEDETAILS.fields_by_name['severity'].enum_type = _ISSUEDETAILS_SEVERITY
_ISSUEDETAILS.fields_by_name['position'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2._SOURCEPOSITION
_ISSUEDETAILS_SEVERITY.containing_type = _ISSUEDETAILS
DESCRIPTOR.message_types_by_name['ParseRequest'] = _PARSEREQUEST
DESCRIPTOR.message_types_by_name['ParseResponse'] = _PARSERESPONSE
DESCRIPTOR.message_types_by_name['CheckRequest'] = _CHECKREQUEST
DESCRIPTOR.message_types_by_name['CheckResponse'] = _CHECKRESPONSE
DESCRIPTOR.message_types_by_name['EvalRequest'] = _EVALREQUEST
DESCRIPTOR.message_types_by_name['EvalResponse'] = _EVALRESPONSE
DESCRIPTOR.message_types_by_name['IssueDetails'] = _ISSUEDETAILS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ParseRequest = _reflection.GeneratedProtocolMessageType('ParseRequest', (_message.Message,), {
  'DESCRIPTOR' : _PARSEREQUEST,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.ParseRequest)
  })
_sym_db.RegisterMessage(ParseRequest)

ParseResponse = _reflection.GeneratedProtocolMessageType('ParseResponse', (_message.Message,), {
  'DESCRIPTOR' : _PARSERESPONSE,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.ParseResponse)
  })
_sym_db.RegisterMessage(ParseResponse)

CheckRequest = _reflection.GeneratedProtocolMessageType('CheckRequest', (_message.Message,), {
  'DESCRIPTOR' : _CHECKREQUEST,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.CheckRequest)
  })
_sym_db.RegisterMessage(CheckRequest)

CheckResponse = _reflection.GeneratedProtocolMessageType('CheckResponse', (_message.Message,), {
  'DESCRIPTOR' : _CHECKRESPONSE,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.CheckResponse)
  })
_sym_db.RegisterMessage(CheckResponse)

EvalRequest = _reflection.GeneratedProtocolMessageType('EvalRequest', (_message.Message,), {

  'BindingsEntry' : _reflection.GeneratedProtocolMessageType('BindingsEntry', (_message.Message,), {
    'DESCRIPTOR' : _EVALREQUEST_BINDINGSENTRY,
    '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
    # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.EvalRequest.BindingsEntry)
    })
  ,
  'DESCRIPTOR' : _EVALREQUEST,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.EvalRequest)
  })
_sym_db.RegisterMessage(EvalRequest)
_sym_db.RegisterMessage(EvalRequest.BindingsEntry)

EvalResponse = _reflection.GeneratedProtocolMessageType('EvalResponse', (_message.Message,), {
  'DESCRIPTOR' : _EVALRESPONSE,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.EvalResponse)
  })
_sym_db.RegisterMessage(EvalResponse)

IssueDetails = _reflection.GeneratedProtocolMessageType('IssueDetails', (_message.Message,), {
  'DESCRIPTOR' : _ISSUEDETAILS,
  '__module__' : 'google.api.expr.v1alpha1.conformance_service_pb2'
  # @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.IssueDetails)
  })
_sym_db.RegisterMessage(IssueDetails)


DESCRIPTOR._options = None
_EVALREQUEST_BINDINGSENTRY._options = None

_CONFORMANCESERVICE = _descriptor.ServiceDescriptor(
  name='ConformanceService',
  full_name='google.api.expr.v1alpha1.ConformanceService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1391,
  serialized_end=1684,
  methods=[
  _descriptor.MethodDescriptor(
    name='Parse',
    full_name='google.api.expr.v1alpha1.ConformanceService.Parse',
    index=0,
    containing_service=None,
    input_type=_PARSEREQUEST,
    output_type=_PARSERESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Check',
    full_name='google.api.expr.v1alpha1.ConformanceService.Check',
    index=1,
    containing_service=None,
    input_type=_CHECKREQUEST,
    output_type=_CHECKRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Eval',
    full_name='google.api.expr.v1alpha1.ConformanceService.Eval',
    index=2,
    containing_service=None,
    input_type=_EVALREQUEST,
    output_type=_EVALRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CONFORMANCESERVICE)

DESCRIPTOR.services_by_name['ConformanceService'] = _CONFORMANCESERVICE

# @@protoc_insertion_point(module_scope)
