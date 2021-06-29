# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/common/matching_function.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.enums import matching_function_context_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_matching__function__context__type__pb2
from google.ads.googleads.v7.enums import matching_function_operator_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_matching__function__operator__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/common/matching_function.proto',
  package='google.ads.googleads.v7.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.commonB\025MatchingFunctionProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Common\312\002\036Google\\Ads\\GoogleAds\\V7\\Common\352\002\"Google::Ads::GoogleAds::V7::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v7/common/matching_function.proto\x12\x1egoogle.ads.googleads.v7.common\x1a\x42google/ads/googleads/v7/enums/matching_function_context_type.proto\x1a>google/ads/googleads/v7/enums/matching_function_operator.proto\x1a\x1cgoogle/api/annotations.proto\"\xad\x02\n\x10MatchingFunction\x12\x1c\n\x0f\x66unction_string\x18\x05 \x01(\tH\x00\x88\x01\x01\x12\x66\n\x08operator\x18\x04 \x01(\x0e\x32T.google.ads.googleads.v7.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator\x12>\n\rleft_operands\x18\x02 \x03(\x0b\x32\'.google.ads.googleads.v7.common.Operand\x12?\n\x0eright_operands\x18\x03 \x03(\x0b\x32\'.google.ads.googleads.v7.common.OperandB\x12\n\x10_function_string\"\xfb\x06\n\x07Operand\x12S\n\x10\x63onstant_operand\x18\x01 \x01(\x0b\x32\x37.google.ads.googleads.v7.common.Operand.ConstantOperandH\x00\x12^\n\x16\x66\x65\x65\x64_attribute_operand\x18\x02 \x01(\x0b\x32<.google.ads.googleads.v7.common.Operand.FeedAttributeOperandH\x00\x12S\n\x10\x66unction_operand\x18\x03 \x01(\x0b\x32\x37.google.ads.googleads.v7.common.Operand.FunctionOperandH\x00\x12`\n\x17request_context_operand\x18\x04 \x01(\x0b\x32=.google.ads.googleads.v7.common.Operand.RequestContextOperandH\x00\x1a\x8a\x01\n\x0f\x43onstantOperand\x12\x16\n\x0cstring_value\x18\x05 \x01(\tH\x00\x12\x14\n\nlong_value\x18\x06 \x01(\x03H\x00\x12\x17\n\rboolean_value\x18\x07 \x01(\x08H\x00\x12\x16\n\x0c\x64ouble_value\x18\x08 \x01(\x01H\x00\x42\x18\n\x16\x63onstant_operand_value\x1an\n\x14\x46\x65\x65\x64\x41ttributeOperand\x12\x14\n\x07\x66\x65\x65\x64_id\x18\x03 \x01(\x03H\x00\x88\x01\x01\x12\x1e\n\x11\x66\x65\x65\x64_attribute_id\x18\x04 \x01(\x03H\x01\x88\x01\x01\x42\n\n\x08_feed_idB\x14\n\x12_feed_attribute_id\x1a^\n\x0f\x46unctionOperand\x12K\n\x11matching_function\x18\x01 \x01(\x0b\x32\x30.google.ads.googleads.v7.common.MatchingFunction\x1a\x89\x01\n\x15RequestContextOperand\x12p\n\x0c\x63ontext_type\x18\x01 \x01(\x0e\x32Z.google.ads.googleads.v7.enums.MatchingFunctionContextTypeEnum.MatchingFunctionContextTypeB\x1b\n\x19\x66unction_argument_operandB\xf0\x01\n\"com.google.ads.googleads.v7.commonB\x15MatchingFunctionProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Common\xea\x02\"Google::Ads::GoogleAds::V7::Commonb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_matching__function__context__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_matching__function__operator__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_MATCHINGFUNCTION = _descriptor.Descriptor(
  name='MatchingFunction',
  full_name='google.ads.googleads.v7.common.MatchingFunction',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='function_string', full_name='google.ads.googleads.v7.common.MatchingFunction.function_string', index=0,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operator', full_name='google.ads.googleads.v7.common.MatchingFunction.operator', index=1,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='left_operands', full_name='google.ads.googleads.v7.common.MatchingFunction.left_operands', index=2,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='right_operands', full_name='google.ads.googleads.v7.common.MatchingFunction.right_operands', index=3,
      number=3, type=11, cpp_type=10, label=3,
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
    _descriptor.OneofDescriptor(
      name='_function_string', full_name='google.ads.googleads.v7.common.MatchingFunction._function_string',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=253,
  serialized_end=554,
)


_OPERAND_CONSTANTOPERAND = _descriptor.Descriptor(
  name='ConstantOperand',
  full_name='google.ads.googleads.v7.common.Operand.ConstantOperand',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='string_value', full_name='google.ads.googleads.v7.common.Operand.ConstantOperand.string_value', index=0,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='long_value', full_name='google.ads.googleads.v7.common.Operand.ConstantOperand.long_value', index=1,
      number=6, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='boolean_value', full_name='google.ads.googleads.v7.common.Operand.ConstantOperand.boolean_value', index=2,
      number=7, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='double_value', full_name='google.ads.googleads.v7.common.Operand.ConstantOperand.double_value', index=3,
      number=8, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
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
      name='constant_operand_value', full_name='google.ads.googleads.v7.common.Operand.ConstantOperand.constant_operand_value',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=933,
  serialized_end=1071,
)

_OPERAND_FEEDATTRIBUTEOPERAND = _descriptor.Descriptor(
  name='FeedAttributeOperand',
  full_name='google.ads.googleads.v7.common.Operand.FeedAttributeOperand',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='feed_id', full_name='google.ads.googleads.v7.common.Operand.FeedAttributeOperand.feed_id', index=0,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_attribute_id', full_name='google.ads.googleads.v7.common.Operand.FeedAttributeOperand.feed_attribute_id', index=1,
      number=4, type=3, cpp_type=2, label=1,
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
    _descriptor.OneofDescriptor(
      name='_feed_id', full_name='google.ads.googleads.v7.common.Operand.FeedAttributeOperand._feed_id',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_feed_attribute_id', full_name='google.ads.googleads.v7.common.Operand.FeedAttributeOperand._feed_attribute_id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1073,
  serialized_end=1183,
)

_OPERAND_FUNCTIONOPERAND = _descriptor.Descriptor(
  name='FunctionOperand',
  full_name='google.ads.googleads.v7.common.Operand.FunctionOperand',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='matching_function', full_name='google.ads.googleads.v7.common.Operand.FunctionOperand.matching_function', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=1185,
  serialized_end=1279,
)

_OPERAND_REQUESTCONTEXTOPERAND = _descriptor.Descriptor(
  name='RequestContextOperand',
  full_name='google.ads.googleads.v7.common.Operand.RequestContextOperand',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='context_type', full_name='google.ads.googleads.v7.common.Operand.RequestContextOperand.context_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
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
  serialized_start=1282,
  serialized_end=1419,
)

_OPERAND = _descriptor.Descriptor(
  name='Operand',
  full_name='google.ads.googleads.v7.common.Operand',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='constant_operand', full_name='google.ads.googleads.v7.common.Operand.constant_operand', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_attribute_operand', full_name='google.ads.googleads.v7.common.Operand.feed_attribute_operand', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='function_operand', full_name='google.ads.googleads.v7.common.Operand.function_operand', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_context_operand', full_name='google.ads.googleads.v7.common.Operand.request_context_operand', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_OPERAND_CONSTANTOPERAND, _OPERAND_FEEDATTRIBUTEOPERAND, _OPERAND_FUNCTIONOPERAND, _OPERAND_REQUESTCONTEXTOPERAND, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='function_argument_operand', full_name='google.ads.googleads.v7.common.Operand.function_argument_operand',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=557,
  serialized_end=1448,
)

_MATCHINGFUNCTION.fields_by_name['operator'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_matching__function__operator__pb2._MATCHINGFUNCTIONOPERATORENUM_MATCHINGFUNCTIONOPERATOR
_MATCHINGFUNCTION.fields_by_name['left_operands'].message_type = _OPERAND
_MATCHINGFUNCTION.fields_by_name['right_operands'].message_type = _OPERAND
_MATCHINGFUNCTION.oneofs_by_name['_function_string'].fields.append(
  _MATCHINGFUNCTION.fields_by_name['function_string'])
_MATCHINGFUNCTION.fields_by_name['function_string'].containing_oneof = _MATCHINGFUNCTION.oneofs_by_name['_function_string']
_OPERAND_CONSTANTOPERAND.containing_type = _OPERAND
_OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value'].fields.append(
  _OPERAND_CONSTANTOPERAND.fields_by_name['string_value'])
_OPERAND_CONSTANTOPERAND.fields_by_name['string_value'].containing_oneof = _OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value']
_OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value'].fields.append(
  _OPERAND_CONSTANTOPERAND.fields_by_name['long_value'])
_OPERAND_CONSTANTOPERAND.fields_by_name['long_value'].containing_oneof = _OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value']
_OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value'].fields.append(
  _OPERAND_CONSTANTOPERAND.fields_by_name['boolean_value'])
_OPERAND_CONSTANTOPERAND.fields_by_name['boolean_value'].containing_oneof = _OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value']
_OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value'].fields.append(
  _OPERAND_CONSTANTOPERAND.fields_by_name['double_value'])
_OPERAND_CONSTANTOPERAND.fields_by_name['double_value'].containing_oneof = _OPERAND_CONSTANTOPERAND.oneofs_by_name['constant_operand_value']
_OPERAND_FEEDATTRIBUTEOPERAND.containing_type = _OPERAND
_OPERAND_FEEDATTRIBUTEOPERAND.oneofs_by_name['_feed_id'].fields.append(
  _OPERAND_FEEDATTRIBUTEOPERAND.fields_by_name['feed_id'])
_OPERAND_FEEDATTRIBUTEOPERAND.fields_by_name['feed_id'].containing_oneof = _OPERAND_FEEDATTRIBUTEOPERAND.oneofs_by_name['_feed_id']
_OPERAND_FEEDATTRIBUTEOPERAND.oneofs_by_name['_feed_attribute_id'].fields.append(
  _OPERAND_FEEDATTRIBUTEOPERAND.fields_by_name['feed_attribute_id'])
_OPERAND_FEEDATTRIBUTEOPERAND.fields_by_name['feed_attribute_id'].containing_oneof = _OPERAND_FEEDATTRIBUTEOPERAND.oneofs_by_name['_feed_attribute_id']
_OPERAND_FUNCTIONOPERAND.fields_by_name['matching_function'].message_type = _MATCHINGFUNCTION
_OPERAND_FUNCTIONOPERAND.containing_type = _OPERAND
_OPERAND_REQUESTCONTEXTOPERAND.fields_by_name['context_type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_matching__function__context__type__pb2._MATCHINGFUNCTIONCONTEXTTYPEENUM_MATCHINGFUNCTIONCONTEXTTYPE
_OPERAND_REQUESTCONTEXTOPERAND.containing_type = _OPERAND
_OPERAND.fields_by_name['constant_operand'].message_type = _OPERAND_CONSTANTOPERAND
_OPERAND.fields_by_name['feed_attribute_operand'].message_type = _OPERAND_FEEDATTRIBUTEOPERAND
_OPERAND.fields_by_name['function_operand'].message_type = _OPERAND_FUNCTIONOPERAND
_OPERAND.fields_by_name['request_context_operand'].message_type = _OPERAND_REQUESTCONTEXTOPERAND
_OPERAND.oneofs_by_name['function_argument_operand'].fields.append(
  _OPERAND.fields_by_name['constant_operand'])
_OPERAND.fields_by_name['constant_operand'].containing_oneof = _OPERAND.oneofs_by_name['function_argument_operand']
_OPERAND.oneofs_by_name['function_argument_operand'].fields.append(
  _OPERAND.fields_by_name['feed_attribute_operand'])
_OPERAND.fields_by_name['feed_attribute_operand'].containing_oneof = _OPERAND.oneofs_by_name['function_argument_operand']
_OPERAND.oneofs_by_name['function_argument_operand'].fields.append(
  _OPERAND.fields_by_name['function_operand'])
_OPERAND.fields_by_name['function_operand'].containing_oneof = _OPERAND.oneofs_by_name['function_argument_operand']
_OPERAND.oneofs_by_name['function_argument_operand'].fields.append(
  _OPERAND.fields_by_name['request_context_operand'])
_OPERAND.fields_by_name['request_context_operand'].containing_oneof = _OPERAND.oneofs_by_name['function_argument_operand']
DESCRIPTOR.message_types_by_name['MatchingFunction'] = _MATCHINGFUNCTION
DESCRIPTOR.message_types_by_name['Operand'] = _OPERAND
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MatchingFunction = _reflection.GeneratedProtocolMessageType('MatchingFunction', (_message.Message,), {
  'DESCRIPTOR' : _MATCHINGFUNCTION,
  '__module__' : 'google.ads.googleads.v7.common.matching_function_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.MatchingFunction)
  })
_sym_db.RegisterMessage(MatchingFunction)

Operand = _reflection.GeneratedProtocolMessageType('Operand', (_message.Message,), {

  'ConstantOperand' : _reflection.GeneratedProtocolMessageType('ConstantOperand', (_message.Message,), {
    'DESCRIPTOR' : _OPERAND_CONSTANTOPERAND,
    '__module__' : 'google.ads.googleads.v7.common.matching_function_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.Operand.ConstantOperand)
    })
  ,

  'FeedAttributeOperand' : _reflection.GeneratedProtocolMessageType('FeedAttributeOperand', (_message.Message,), {
    'DESCRIPTOR' : _OPERAND_FEEDATTRIBUTEOPERAND,
    '__module__' : 'google.ads.googleads.v7.common.matching_function_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.Operand.FeedAttributeOperand)
    })
  ,

  'FunctionOperand' : _reflection.GeneratedProtocolMessageType('FunctionOperand', (_message.Message,), {
    'DESCRIPTOR' : _OPERAND_FUNCTIONOPERAND,
    '__module__' : 'google.ads.googleads.v7.common.matching_function_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.Operand.FunctionOperand)
    })
  ,

  'RequestContextOperand' : _reflection.GeneratedProtocolMessageType('RequestContextOperand', (_message.Message,), {
    'DESCRIPTOR' : _OPERAND_REQUESTCONTEXTOPERAND,
    '__module__' : 'google.ads.googleads.v7.common.matching_function_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.Operand.RequestContextOperand)
    })
  ,
  'DESCRIPTOR' : _OPERAND,
  '__module__' : 'google.ads.googleads.v7.common.matching_function_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.Operand)
  })
_sym_db.RegisterMessage(Operand)
_sym_db.RegisterMessage(Operand.ConstantOperand)
_sym_db.RegisterMessage(Operand.FeedAttributeOperand)
_sym_db.RegisterMessage(Operand.FunctionOperand)
_sym_db.RegisterMessage(Operand.RequestContextOperand)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
