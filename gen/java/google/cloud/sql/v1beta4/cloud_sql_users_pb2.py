# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/sql/v1beta4/cloud_sql_users.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.sql.v1beta4 import cloud_sql_resources_pb2 as google_dot_cloud_dot_sql_dot_v1beta4_dot_cloud__sql__resources__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/sql/v1beta4/cloud_sql_users.proto',
  package='google.cloud.sql.v1beta4',
  syntax='proto3',
  serialized_options=b'\n\034com.google.cloud.sql.v1beta4B\022CloudSqlUsersProtoP\001Z;google.golang.org/genproto/googleapis/cloud/sql/v1beta4;sql',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.google/cloud/sql/v1beta4/cloud_sql_users.proto\x12\x18google.cloud.sql.v1beta4\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x32google/cloud/sql/v1beta4/cloud_sql_resources.proto\x1a\x17google/api/client.proto\"V\n\x15SqlUsersDeleteRequest\x12\x0c\n\x04host\x18\x01 \x01(\t\x12\x10\n\x08instance\x18\x02 \x01(\t\x12\x0c\n\x04name\x18\x03 \x01(\t\x12\x0f\n\x07project\x18\x04 \x01(\t\"\x89\x01\n\x15SqlUsersUpdateRequest\x12\x11\n\x04host\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x10\n\x08instance\x18\x02 \x01(\t\x12\x0c\n\x04name\x18\x03 \x01(\t\x12\x0f\n\x07project\x18\x04 \x01(\t\x12,\n\x04\x62ody\x18\x64 \x01(\x0b\x32\x1e.google.cloud.sql.v1beta4.User\"h\n\x15SqlUsersInsertRequest\x12\x10\n\x08instance\x18\x01 \x01(\t\x12\x0f\n\x07project\x18\x02 \x01(\t\x12,\n\x04\x62ody\x18\x64 \x01(\x0b\x32\x1e.google.cloud.sql.v1beta4.User\"8\n\x13SqlUsersListRequest\x12\x10\n\x08instance\x18\x01 \x01(\t\x12\x0f\n\x07project\x18\x02 \x01(\t\"\xdf\x02\n\x04User\x12\x0c\n\x04kind\x18\x01 \x01(\t\x12\x10\n\x08password\x18\x02 \x01(\t\x12\x0c\n\x04\x65tag\x18\x03 \x01(\t\x12\x0c\n\x04name\x18\x04 \x01(\t\x12\x0c\n\x04host\x18\x05 \x01(\t\x12\x10\n\x08instance\x18\x06 \x01(\t\x12\x0f\n\x07project\x18\x07 \x01(\t\x12\x38\n\x04type\x18\x08 \x01(\x0e\x32*.google.cloud.sql.v1beta4.User.SqlUserType\x12P\n\x16sqlserver_user_details\x18\t \x01(\x0b\x32..google.cloud.sql.v1beta4.SqlServerUserDetailsH\x00\"N\n\x0bSqlUserType\x12\x0c\n\x08\x42UILT_IN\x10\x00\x12\x12\n\x0e\x43LOUD_IAM_USER\x10\x01\x12\x1d\n\x19\x43LOUD_IAM_SERVICE_ACCOUNT\x10\x02\x42\x0e\n\x0cuser_details\">\n\x14SqlServerUserDetails\x12\x10\n\x08\x64isabled\x18\x01 \x01(\x08\x12\x14\n\x0cserver_roles\x18\x02 \x03(\t\"i\n\x11UsersListResponse\x12\x0c\n\x04kind\x18\x01 \x01(\t\x12-\n\x05items\x18\x02 \x03(\x0b\x32\x1e.google.cloud.sql.v1beta4.User\x12\x17\n\x0fnext_page_token\x18\x03 \x01(\t2\xb3\x06\n\x0fSqlUsersService\x12\xa2\x01\n\x06\x44\x65lete\x12/.google.cloud.sql.v1beta4.SqlUsersDeleteRequest\x1a#.google.cloud.sql.v1beta4.Operation\"B\x82\xd3\xe4\x93\x02<*:/sql/v1beta4/projects/{project}/instances/{instance}/users\x12\xa8\x01\n\x06Insert\x12/.google.cloud.sql.v1beta4.SqlUsersInsertRequest\x1a#.google.cloud.sql.v1beta4.Operation\"H\x82\xd3\xe4\x93\x02\x42\":/sql/v1beta4/projects/{project}/instances/{instance}/users:\x04\x62ody\x12\xa6\x01\n\x04List\x12-.google.cloud.sql.v1beta4.SqlUsersListRequest\x1a+.google.cloud.sql.v1beta4.UsersListResponse\"B\x82\xd3\xe4\x93\x02<\x12:/sql/v1beta4/projects/{project}/instances/{instance}/users\x12\xa8\x01\n\x06Update\x12/.google.cloud.sql.v1beta4.SqlUsersUpdateRequest\x1a#.google.cloud.sql.v1beta4.Operation\"H\x82\xd3\xe4\x93\x02\x42\x1a:/sql/v1beta4/projects/{project}/instances/{instance}/users:\x04\x62ody\x1a|\xca\x41\x17sqladmin.googleapis.com\xd2\x41_https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/sqlservice.adminBq\n\x1c\x63om.google.cloud.sql.v1beta4B\x12\x43loudSqlUsersProtoP\x01Z;google.golang.org/genproto/googleapis/cloud/sql/v1beta4;sqlb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_cloud_dot_sql_dot_v1beta4_dot_cloud__sql__resources__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])



_USER_SQLUSERTYPE = _descriptor.EnumDescriptor(
  name='SqlUserType',
  full_name='google.cloud.sql.v1beta4.User.SqlUserType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='BUILT_IN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOUD_IAM_USER', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOUD_IAM_SERVICE_ACCOUNT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=866,
  serialized_end=944,
)
_sym_db.RegisterEnumDescriptor(_USER_SQLUSERTYPE)


_SQLUSERSDELETEREQUEST = _descriptor.Descriptor(
  name='SqlUsersDeleteRequest',
  full_name='google.cloud.sql.v1beta4.SqlUsersDeleteRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='host', full_name='google.cloud.sql.v1beta4.SqlUsersDeleteRequest.host', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance', full_name='google.cloud.sql.v1beta4.SqlUsersDeleteRequest.instance', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.sql.v1beta4.SqlUsersDeleteRequest.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='project', full_name='google.cloud.sql.v1beta4.SqlUsersDeleteRequest.project', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=216,
  serialized_end=302,
)


_SQLUSERSUPDATEREQUEST = _descriptor.Descriptor(
  name='SqlUsersUpdateRequest',
  full_name='google.cloud.sql.v1beta4.SqlUsersUpdateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='host', full_name='google.cloud.sql.v1beta4.SqlUsersUpdateRequest.host', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance', full_name='google.cloud.sql.v1beta4.SqlUsersUpdateRequest.instance', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.sql.v1beta4.SqlUsersUpdateRequest.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='project', full_name='google.cloud.sql.v1beta4.SqlUsersUpdateRequest.project', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='body', full_name='google.cloud.sql.v1beta4.SqlUsersUpdateRequest.body', index=4,
      number=100, type=11, cpp_type=10, label=1,
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
  serialized_start=305,
  serialized_end=442,
)


_SQLUSERSINSERTREQUEST = _descriptor.Descriptor(
  name='SqlUsersInsertRequest',
  full_name='google.cloud.sql.v1beta4.SqlUsersInsertRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='instance', full_name='google.cloud.sql.v1beta4.SqlUsersInsertRequest.instance', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='project', full_name='google.cloud.sql.v1beta4.SqlUsersInsertRequest.project', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='body', full_name='google.cloud.sql.v1beta4.SqlUsersInsertRequest.body', index=2,
      number=100, type=11, cpp_type=10, label=1,
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
  serialized_start=444,
  serialized_end=548,
)


_SQLUSERSLISTREQUEST = _descriptor.Descriptor(
  name='SqlUsersListRequest',
  full_name='google.cloud.sql.v1beta4.SqlUsersListRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='instance', full_name='google.cloud.sql.v1beta4.SqlUsersListRequest.instance', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='project', full_name='google.cloud.sql.v1beta4.SqlUsersListRequest.project', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=550,
  serialized_end=606,
)


_USER = _descriptor.Descriptor(
  name='User',
  full_name='google.cloud.sql.v1beta4.User',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='kind', full_name='google.cloud.sql.v1beta4.User.kind', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='password', full_name='google.cloud.sql.v1beta4.User.password', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.cloud.sql.v1beta4.User.etag', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.sql.v1beta4.User.name', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host', full_name='google.cloud.sql.v1beta4.User.host', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance', full_name='google.cloud.sql.v1beta4.User.instance', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='project', full_name='google.cloud.sql.v1beta4.User.project', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.sql.v1beta4.User.type', index=7,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sqlserver_user_details', full_name='google.cloud.sql.v1beta4.User.sqlserver_user_details', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _USER_SQLUSERTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='user_details', full_name='google.cloud.sql.v1beta4.User.user_details',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=609,
  serialized_end=960,
)


_SQLSERVERUSERDETAILS = _descriptor.Descriptor(
  name='SqlServerUserDetails',
  full_name='google.cloud.sql.v1beta4.SqlServerUserDetails',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='disabled', full_name='google.cloud.sql.v1beta4.SqlServerUserDetails.disabled', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='server_roles', full_name='google.cloud.sql.v1beta4.SqlServerUserDetails.server_roles', index=1,
      number=2, type=9, cpp_type=9, label=3,
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
  serialized_start=962,
  serialized_end=1024,
)


_USERSLISTRESPONSE = _descriptor.Descriptor(
  name='UsersListResponse',
  full_name='google.cloud.sql.v1beta4.UsersListResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='kind', full_name='google.cloud.sql.v1beta4.UsersListResponse.kind', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='items', full_name='google.cloud.sql.v1beta4.UsersListResponse.items', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.sql.v1beta4.UsersListResponse.next_page_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=1026,
  serialized_end=1131,
)

_SQLUSERSUPDATEREQUEST.fields_by_name['body'].message_type = _USER
_SQLUSERSINSERTREQUEST.fields_by_name['body'].message_type = _USER
_USER.fields_by_name['type'].enum_type = _USER_SQLUSERTYPE
_USER.fields_by_name['sqlserver_user_details'].message_type = _SQLSERVERUSERDETAILS
_USER_SQLUSERTYPE.containing_type = _USER
_USER.oneofs_by_name['user_details'].fields.append(
  _USER.fields_by_name['sqlserver_user_details'])
_USER.fields_by_name['sqlserver_user_details'].containing_oneof = _USER.oneofs_by_name['user_details']
_USERSLISTRESPONSE.fields_by_name['items'].message_type = _USER
DESCRIPTOR.message_types_by_name['SqlUsersDeleteRequest'] = _SQLUSERSDELETEREQUEST
DESCRIPTOR.message_types_by_name['SqlUsersUpdateRequest'] = _SQLUSERSUPDATEREQUEST
DESCRIPTOR.message_types_by_name['SqlUsersInsertRequest'] = _SQLUSERSINSERTREQUEST
DESCRIPTOR.message_types_by_name['SqlUsersListRequest'] = _SQLUSERSLISTREQUEST
DESCRIPTOR.message_types_by_name['User'] = _USER
DESCRIPTOR.message_types_by_name['SqlServerUserDetails'] = _SQLSERVERUSERDETAILS
DESCRIPTOR.message_types_by_name['UsersListResponse'] = _USERSLISTRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SqlUsersDeleteRequest = _reflection.GeneratedProtocolMessageType('SqlUsersDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _SQLUSERSDELETEREQUEST,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlUsersDeleteRequest)
  })
_sym_db.RegisterMessage(SqlUsersDeleteRequest)

SqlUsersUpdateRequest = _reflection.GeneratedProtocolMessageType('SqlUsersUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _SQLUSERSUPDATEREQUEST,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlUsersUpdateRequest)
  })
_sym_db.RegisterMessage(SqlUsersUpdateRequest)

SqlUsersInsertRequest = _reflection.GeneratedProtocolMessageType('SqlUsersInsertRequest', (_message.Message,), {
  'DESCRIPTOR' : _SQLUSERSINSERTREQUEST,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlUsersInsertRequest)
  })
_sym_db.RegisterMessage(SqlUsersInsertRequest)

SqlUsersListRequest = _reflection.GeneratedProtocolMessageType('SqlUsersListRequest', (_message.Message,), {
  'DESCRIPTOR' : _SQLUSERSLISTREQUEST,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlUsersListRequest)
  })
_sym_db.RegisterMessage(SqlUsersListRequest)

User = _reflection.GeneratedProtocolMessageType('User', (_message.Message,), {
  'DESCRIPTOR' : _USER,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.User)
  })
_sym_db.RegisterMessage(User)

SqlServerUserDetails = _reflection.GeneratedProtocolMessageType('SqlServerUserDetails', (_message.Message,), {
  'DESCRIPTOR' : _SQLSERVERUSERDETAILS,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.SqlServerUserDetails)
  })
_sym_db.RegisterMessage(SqlServerUserDetails)

UsersListResponse = _reflection.GeneratedProtocolMessageType('UsersListResponse', (_message.Message,), {
  'DESCRIPTOR' : _USERSLISTRESPONSE,
  '__module__' : 'google.cloud.sql.v1beta4.cloud_sql_users_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.sql.v1beta4.UsersListResponse)
  })
_sym_db.RegisterMessage(UsersListResponse)


DESCRIPTOR._options = None
_SQLUSERSUPDATEREQUEST.fields_by_name['host']._options = None

_SQLUSERSSERVICE = _descriptor.ServiceDescriptor(
  name='SqlUsersService',
  full_name='google.cloud.sql.v1beta4.SqlUsersService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\027sqladmin.googleapis.com\322A_https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/sqlservice.admin',
  create_key=_descriptor._internal_create_key,
  serialized_start=1134,
  serialized_end=1953,
  methods=[
  _descriptor.MethodDescriptor(
    name='Delete',
    full_name='google.cloud.sql.v1beta4.SqlUsersService.Delete',
    index=0,
    containing_service=None,
    input_type=_SQLUSERSDELETEREQUEST,
    output_type=google_dot_cloud_dot_sql_dot_v1beta4_dot_cloud__sql__resources__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002<*:/sql/v1beta4/projects/{project}/instances/{instance}/users',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Insert',
    full_name='google.cloud.sql.v1beta4.SqlUsersService.Insert',
    index=1,
    containing_service=None,
    input_type=_SQLUSERSINSERTREQUEST,
    output_type=google_dot_cloud_dot_sql_dot_v1beta4_dot_cloud__sql__resources__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002B\":/sql/v1beta4/projects/{project}/instances/{instance}/users:\004body',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='List',
    full_name='google.cloud.sql.v1beta4.SqlUsersService.List',
    index=2,
    containing_service=None,
    input_type=_SQLUSERSLISTREQUEST,
    output_type=_USERSLISTRESPONSE,
    serialized_options=b'\202\323\344\223\002<\022:/sql/v1beta4/projects/{project}/instances/{instance}/users',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Update',
    full_name='google.cloud.sql.v1beta4.SqlUsersService.Update',
    index=3,
    containing_service=None,
    input_type=_SQLUSERSUPDATEREQUEST,
    output_type=google_dot_cloud_dot_sql_dot_v1beta4_dot_cloud__sql__resources__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002B\032:/sql/v1beta4/projects/{project}/instances/{instance}/users:\004body',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_SQLUSERSSERVICE)

DESCRIPTOR.services_by_name['SqlUsersService'] = _SQLUSERSSERVICE

# @@protoc_insertion_point(module_scope)
