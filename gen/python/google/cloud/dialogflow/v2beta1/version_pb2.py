# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/version.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-google/cloud/dialogflow/v2beta1/version.proto\x12\x1fgoogle.cloud.dialogflow.v2beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc8\x03\n\x07Version\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x1b\n\x0eversion_number\x18\x03 \x01(\x05\x42\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12K\n\x06status\x18\x06 \x01(\x0e\x32\x36.google.cloud.dialogflow.v2beta1.Version.VersionStatusB\x03\xe0\x41\x03\"W\n\rVersionStatus\x12\x1e\n\x1aVERSION_STATUS_UNSPECIFIED\x10\x00\x12\x0f\n\x0bIN_PROGRESS\x10\x01\x12\t\n\x05READY\x10\x02\x12\n\n\x06\x46\x41ILED\x10\x03:\x96\x01\xea\x41\x92\x01\n!dialogflow.googleapis.com/Version\x12+projects/{project}/agent/versions/{version}\x12@projects/{project}/locations/{location}/agent/versions/{version}\"\x81\x01\n\x13ListVersionsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\x12!dialogflow.googleapis.com/Version\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"k\n\x14ListVersionsResponse\x12:\n\x08versions\x18\x01 \x03(\x0b\x32(.google.cloud.dialogflow.v2beta1.Version\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"L\n\x11GetVersionRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!dialogflow.googleapis.com/Version\"\x91\x01\n\x14\x43reateVersionRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\x12!dialogflow.googleapis.com/Version\x12>\n\x07version\x18\x02 \x01(\x0b\x32(.google.cloud.dialogflow.v2beta1.VersionB\x03\xe0\x41\x02\"\x8c\x01\n\x14UpdateVersionRequest\x12>\n\x07version\x18\x01 \x01(\x0b\x32(.google.cloud.dialogflow.v2beta1.VersionB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"O\n\x14\x44\x65leteVersionRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!dialogflow.googleapis.com/Version2\xdb\n\n\x08Versions\x12\xf4\x01\n\x0cListVersions\x12\x34.google.cloud.dialogflow.v2beta1.ListVersionsRequest\x1a\x35.google.cloud.dialogflow.v2beta1.ListVersionsResponse\"w\x82\xd3\xe4\x93\x02h\x12+/v2beta1/{parent=projects/*/agent}/versionsZ9\x12\x37/v2beta1/{parent=projects/*/locations/*/agent}/versions\xda\x41\x06parent\x12\xe1\x01\n\nGetVersion\x12\x32.google.cloud.dialogflow.v2beta1.GetVersionRequest\x1a(.google.cloud.dialogflow.v2beta1.Version\"u\x82\xd3\xe4\x93\x02h\x12+/v2beta1/{name=projects/*/agent/versions/*}Z9\x12\x37/v2beta1/{name=projects/*/locations/*/agent/versions/*}\xda\x41\x04name\x12\x84\x02\n\rCreateVersion\x12\x35.google.cloud.dialogflow.v2beta1.CreateVersionRequest\x1a(.google.cloud.dialogflow.v2beta1.Version\"\x91\x01\x82\xd3\xe4\x93\x02z\"+/v2beta1/{parent=projects/*/agent}/versions:\x07versionZB\"7/v2beta1/{parent=projects/*/locations/*/agent}/versions:\x07version\xda\x41\x0eparent,version\x12\x9a\x02\n\rUpdateVersion\x12\x35.google.cloud.dialogflow.v2beta1.UpdateVersionRequest\x1a(.google.cloud.dialogflow.v2beta1.Version\"\xa7\x01\x82\xd3\xe4\x93\x02\x8a\x01\x32\x33/v2beta1/{version.name=projects/*/agent/versions/*}:\x07versionZJ2?/v2beta1/{version.name=projects/*/locations/*/agent/versions/*}:\x07version\xda\x41\x13version,update_mask\x12\xd5\x01\n\rDeleteVersion\x12\x35.google.cloud.dialogflow.v2beta1.DeleteVersionRequest\x1a\x16.google.protobuf.Empty\"u\x82\xd3\xe4\x93\x02h*+/v2beta1/{name=projects/*/agent/versions/*}Z9*7/v2beta1/{name=projects/*/locations/*/agent/versions/*}\xda\x41\x04name\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\xaa\x01\n#com.google.cloud.dialogflow.v2beta1B\x0cVersionProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1fGoogle.Cloud.Dialogflow.V2beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2beta1.version_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.dialogflow.v2beta1B\014VersionProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1'
  _VERSION.fields_by_name['name']._options = None
  _VERSION.fields_by_name['name']._serialized_options = b'\340A\003'
  _VERSION.fields_by_name['description']._options = None
  _VERSION.fields_by_name['description']._serialized_options = b'\340A\001'
  _VERSION.fields_by_name['version_number']._options = None
  _VERSION.fields_by_name['version_number']._serialized_options = b'\340A\003'
  _VERSION.fields_by_name['create_time']._options = None
  _VERSION.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _VERSION.fields_by_name['status']._options = None
  _VERSION.fields_by_name['status']._serialized_options = b'\340A\003'
  _VERSION._options = None
  _VERSION._serialized_options = b'\352A\222\001\n!dialogflow.googleapis.com/Version\022+projects/{project}/agent/versions/{version}\022@projects/{project}/locations/{location}/agent/versions/{version}'
  _LISTVERSIONSREQUEST.fields_by_name['parent']._options = None
  _LISTVERSIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\022!dialogflow.googleapis.com/Version'
  _LISTVERSIONSREQUEST.fields_by_name['page_size']._options = None
  _LISTVERSIONSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTVERSIONSREQUEST.fields_by_name['page_token']._options = None
  _LISTVERSIONSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETVERSIONREQUEST.fields_by_name['name']._options = None
  _GETVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!dialogflow.googleapis.com/Version'
  _CREATEVERSIONREQUEST.fields_by_name['parent']._options = None
  _CREATEVERSIONREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\022!dialogflow.googleapis.com/Version'
  _CREATEVERSIONREQUEST.fields_by_name['version']._options = None
  _CREATEVERSIONREQUEST.fields_by_name['version']._serialized_options = b'\340A\002'
  _UPDATEVERSIONREQUEST.fields_by_name['version']._options = None
  _UPDATEVERSIONREQUEST.fields_by_name['version']._serialized_options = b'\340A\002'
  _UPDATEVERSIONREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEVERSIONREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _DELETEVERSIONREQUEST.fields_by_name['name']._options = None
  _DELETEVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!dialogflow.googleapis.com/Version'
  _VERSIONS._options = None
  _VERSIONS._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _VERSIONS.methods_by_name['ListVersions']._options = None
  _VERSIONS.methods_by_name['ListVersions']._serialized_options = b'\202\323\344\223\002h\022+/v2beta1/{parent=projects/*/agent}/versionsZ9\0227/v2beta1/{parent=projects/*/locations/*/agent}/versions\332A\006parent'
  _VERSIONS.methods_by_name['GetVersion']._options = None
  _VERSIONS.methods_by_name['GetVersion']._serialized_options = b'\202\323\344\223\002h\022+/v2beta1/{name=projects/*/agent/versions/*}Z9\0227/v2beta1/{name=projects/*/locations/*/agent/versions/*}\332A\004name'
  _VERSIONS.methods_by_name['CreateVersion']._options = None
  _VERSIONS.methods_by_name['CreateVersion']._serialized_options = b'\202\323\344\223\002z\"+/v2beta1/{parent=projects/*/agent}/versions:\007versionZB\"7/v2beta1/{parent=projects/*/locations/*/agent}/versions:\007version\332A\016parent,version'
  _VERSIONS.methods_by_name['UpdateVersion']._options = None
  _VERSIONS.methods_by_name['UpdateVersion']._serialized_options = b'\202\323\344\223\002\212\00123/v2beta1/{version.name=projects/*/agent/versions/*}:\007versionZJ2?/v2beta1/{version.name=projects/*/locations/*/agent/versions/*}:\007version\332A\023version,update_mask'
  _VERSIONS.methods_by_name['DeleteVersion']._options = None
  _VERSIONS.methods_by_name['DeleteVersion']._serialized_options = b'\202\323\344\223\002h*+/v2beta1/{name=projects/*/agent/versions/*}Z9*7/v2beta1/{name=projects/*/locations/*/agent/versions/*}\332A\004name'
  _VERSION._serialized_start=294
  _VERSION._serialized_end=750
  _VERSION_VERSIONSTATUS._serialized_start=510
  _VERSION_VERSIONSTATUS._serialized_end=597
  _LISTVERSIONSREQUEST._serialized_start=753
  _LISTVERSIONSREQUEST._serialized_end=882
  _LISTVERSIONSRESPONSE._serialized_start=884
  _LISTVERSIONSRESPONSE._serialized_end=991
  _GETVERSIONREQUEST._serialized_start=993
  _GETVERSIONREQUEST._serialized_end=1069
  _CREATEVERSIONREQUEST._serialized_start=1072
  _CREATEVERSIONREQUEST._serialized_end=1217
  _UPDATEVERSIONREQUEST._serialized_start=1220
  _UPDATEVERSIONREQUEST._serialized_end=1360
  _DELETEVERSIONREQUEST._serialized_start=1362
  _DELETEVERSIONREQUEST._serialized_end=1441
  _VERSIONS._serialized_start=1444
  _VERSIONS._serialized_end=2815
# @@protoc_insertion_point(module_scope)