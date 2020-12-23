# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataqna/v1alpha/user_feedback.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/dataqna/v1alpha/user_feedback.proto',
  package='google.cloud.dataqna.v1alpha',
  syntax='proto3',
  serialized_options=b'\n com.google.cloud.dataqna.v1alphaB\021UserFeedbackProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/dataqna/v1alpha;dataqna\252\002\034Google.Cloud.DataQnA.V1Alpha\312\002\034Google\\Cloud\\DataQnA\\V1alpha\352\002\037Google::Cloud::DataQnA::V1alpha',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0google/cloud/dataqna/v1alpha/user_feedback.proto\x12\x1cgoogle.cloud.dataqna.v1alpha\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xd9\x02\n\x0cUserFeedback\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\x12\x66ree_form_feedback\x18\x02 \x01(\t\x12M\n\x06rating\x18\x03 \x01(\x0e\x32=.google.cloud.dataqna.v1alpha.UserFeedback.UserFeedbackRating\"V\n\x12UserFeedbackRating\x12$\n USER_FEEDBACK_RATING_UNSPECIFIED\x10\x00\x12\x0c\n\x08POSITIVE\x10\x01\x12\x0c\n\x08NEGATIVE\x10\x02:s\xea\x41p\n#dataqna.googleapis.com/UserFeedback\x12Iprojects/{project}/locations/{location}/questions/{question}/userFeedbackB\xdc\x01\n com.google.cloud.dataqna.v1alphaB\x11UserFeedbackProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/dataqna/v1alpha;dataqna\xaa\x02\x1cGoogle.Cloud.DataQnA.V1Alpha\xca\x02\x1cGoogle\\Cloud\\DataQnA\\V1alpha\xea\x02\x1fGoogle::Cloud::DataQnA::V1alphab\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])



_USERFEEDBACK_USERFEEDBACKRATING = _descriptor.EnumDescriptor(
  name='UserFeedbackRating',
  full_name='google.cloud.dataqna.v1alpha.UserFeedback.UserFeedbackRating',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='USER_FEEDBACK_RATING_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POSITIVE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NEGATIVE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=285,
  serialized_end=371,
)
_sym_db.RegisterEnumDescriptor(_USERFEEDBACK_USERFEEDBACKRATING)


_USERFEEDBACK = _descriptor.Descriptor(
  name='UserFeedback',
  full_name='google.cloud.dataqna.v1alpha.UserFeedback',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dataqna.v1alpha.UserFeedback.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='free_form_feedback', full_name='google.cloud.dataqna.v1alpha.UserFeedback.free_form_feedback', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rating', full_name='google.cloud.dataqna.v1alpha.UserFeedback.rating', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _USERFEEDBACK_USERFEEDBACKRATING,
  ],
  serialized_options=b'\352Ap\n#dataqna.googleapis.com/UserFeedback\022Iprojects/{project}/locations/{location}/questions/{question}/userFeedback',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=143,
  serialized_end=488,
)

_USERFEEDBACK.fields_by_name['rating'].enum_type = _USERFEEDBACK_USERFEEDBACKRATING
_USERFEEDBACK_USERFEEDBACKRATING.containing_type = _USERFEEDBACK
DESCRIPTOR.message_types_by_name['UserFeedback'] = _USERFEEDBACK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UserFeedback = _reflection.GeneratedProtocolMessageType('UserFeedback', (_message.Message,), {
  'DESCRIPTOR' : _USERFEEDBACK,
  '__module__' : 'google.cloud.dataqna.v1alpha.user_feedback_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dataqna.v1alpha.UserFeedback)
  })
_sym_db.RegisterMessage(UserFeedback)


DESCRIPTOR._options = None
_USERFEEDBACK.fields_by_name['name']._options = None
_USERFEEDBACK._options = None
# @@protoc_insertion_point(module_scope)