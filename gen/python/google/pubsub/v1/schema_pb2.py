# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/pubsub/v1/schema.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dgoogle/pubsub/v1/schema.proto\x12\x10google.pubsub.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\"\xe1\x01\n\x06Schema\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12+\n\x04type\x18\x02 \x01(\x0e\x32\x1d.google.pubsub.v1.Schema.Type\x12\x12\n\ndefinition\x18\x03 \x01(\t\";\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x13\n\x0fPROTOCOL_BUFFER\x10\x01\x12\x08\n\x04\x41VRO\x10\x02:F\xea\x41\x43\n\x1cpubsub.googleapis.com/Schema\x12#projects/{project}/schemas/{schema}\"\x8d\x01\n\x13\x43reateSchemaRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\x12\x1cpubsub.googleapis.com/Schema\x12-\n\x06schema\x18\x02 \x01(\x0b\x32\x18.google.pubsub.v1.SchemaB\x03\xe0\x41\x02\x12\x11\n\tschema_id\x18\x03 \x01(\t\"r\n\x10GetSchemaRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1cpubsub.googleapis.com/Schema\x12*\n\x04view\x18\x02 \x01(\x0e\x32\x1c.google.pubsub.v1.SchemaView\"\xac\x01\n\x12ListSchemasRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12*\n\x04view\x18\x02 \x01(\x0e\x32\x1c.google.pubsub.v1.SchemaView\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"Y\n\x13ListSchemasResponse\x12)\n\x07schemas\x18\x01 \x03(\x0b\x32\x18.google.pubsub.v1.Schema\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"I\n\x13\x44\x65leteSchemaRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1cpubsub.googleapis.com/Schema\"\x8b\x01\n\x15ValidateSchemaRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12-\n\x06schema\x18\x02 \x01(\x0b\x32\x18.google.pubsub.v1.SchemaB\x03\xe0\x41\x02\"\x18\n\x16ValidateSchemaResponse\"\x8a\x02\n\x16ValidateMessageRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12\x31\n\x04name\x18\x02 \x01(\tB!\xfa\x41\x1e\n\x1cpubsub.googleapis.com/SchemaH\x00\x12*\n\x06schema\x18\x03 \x01(\x0b\x32\x18.google.pubsub.v1.SchemaH\x00\x12\x0f\n\x07message\x18\x04 \x01(\x0c\x12,\n\x08\x65ncoding\x18\x05 \x01(\x0e\x32\x1a.google.pubsub.v1.EncodingB\r\n\x0bschema_spec\"\x19\n\x17ValidateMessageResponse*>\n\nSchemaView\x12\x1b\n\x17SCHEMA_VIEW_UNSPECIFIED\x10\x00\x12\t\n\x05\x42\x41SIC\x10\x01\x12\x08\n\x04\x46ULL\x10\x02*:\n\x08\x45ncoding\x12\x18\n\x14\x45NCODING_UNSPECIFIED\x10\x00\x12\x08\n\x04JSON\x10\x01\x12\n\n\x06\x42INARY\x10\x02\x32\xf7\x07\n\rSchemaService\x12\x9a\x01\n\x0c\x43reateSchema\x12%.google.pubsub.v1.CreateSchemaRequest\x1a\x18.google.pubsub.v1.Schema\"I\x82\xd3\xe4\x93\x02)\"\x1f/v1/{parent=projects/*}/schemas:\x06schema\xda\x41\x17parent,schema,schema_id\x12y\n\tGetSchema\x12\".google.pubsub.v1.GetSchemaRequest\x1a\x18.google.pubsub.v1.Schema\".\x82\xd3\xe4\x93\x02!\x12\x1f/v1/{name=projects/*/schemas/*}\xda\x41\x04name\x12\x8c\x01\n\x0bListSchemas\x12$.google.pubsub.v1.ListSchemasRequest\x1a%.google.pubsub.v1.ListSchemasResponse\"0\x82\xd3\xe4\x93\x02!\x12\x1f/v1/{parent=projects/*}/schemas\xda\x41\x06parent\x12}\n\x0c\x44\x65leteSchema\x12%.google.pubsub.v1.DeleteSchemaRequest\x1a\x16.google.protobuf.Empty\".\x82\xd3\xe4\x93\x02!*\x1f/v1/{name=projects/*/schemas/*}\xda\x41\x04name\x12\xa8\x01\n\x0eValidateSchema\x12\'.google.pubsub.v1.ValidateSchemaRequest\x1a(.google.pubsub.v1.ValidateSchemaResponse\"C\x82\xd3\xe4\x93\x02-\"(/v1/{parent=projects/*}/schemas:validate:\x01*\xda\x41\rparent,schema\x12\xa2\x01\n\x0fValidateMessage\x12(.google.pubsub.v1.ValidateMessageRequest\x1a).google.pubsub.v1.ValidateMessageResponse\":\x82\xd3\xe4\x93\x02\x34\"//v1/{parent=projects/*}/schemas:validateMessage:\x01*\x1ap\xca\x41\x15pubsub.googleapis.com\xd2\x41Uhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/pubsubB\xae\x01\n\x14\x63om.google.pubsub.v1B\x0bSchemaProtoP\x01Z6google.golang.org/genproto/googleapis/pubsub/v1;pubsub\xf8\x01\x01\xaa\x02\x16Google.Cloud.PubSub.V1\xca\x02\x16Google\\Cloud\\PubSub\\V1\xea\x02\x19Google::Cloud::PubSub::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.pubsub.v1.schema_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.google.pubsub.v1B\013SchemaProtoP\001Z6google.golang.org/genproto/googleapis/pubsub/v1;pubsub\370\001\001\252\002\026Google.Cloud.PubSub.V1\312\002\026Google\\Cloud\\PubSub\\V1\352\002\031Google::Cloud::PubSub::V1'
  _SCHEMA.fields_by_name['name']._options = None
  _SCHEMA.fields_by_name['name']._serialized_options = b'\340A\002'
  _SCHEMA._options = None
  _SCHEMA._serialized_options = b'\352AC\n\034pubsub.googleapis.com/Schema\022#projects/{project}/schemas/{schema}'
  _CREATESCHEMAREQUEST.fields_by_name['parent']._options = None
  _CREATESCHEMAREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\022\034pubsub.googleapis.com/Schema'
  _CREATESCHEMAREQUEST.fields_by_name['schema']._options = None
  _CREATESCHEMAREQUEST.fields_by_name['schema']._serialized_options = b'\340A\002'
  _GETSCHEMAREQUEST.fields_by_name['name']._options = None
  _GETSCHEMAREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034pubsub.googleapis.com/Schema'
  _LISTSCHEMASREQUEST.fields_by_name['parent']._options = None
  _LISTSCHEMASREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _DELETESCHEMAREQUEST.fields_by_name['name']._options = None
  _DELETESCHEMAREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034pubsub.googleapis.com/Schema'
  _VALIDATESCHEMAREQUEST.fields_by_name['parent']._options = None
  _VALIDATESCHEMAREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _VALIDATESCHEMAREQUEST.fields_by_name['schema']._options = None
  _VALIDATESCHEMAREQUEST.fields_by_name['schema']._serialized_options = b'\340A\002'
  _VALIDATEMESSAGEREQUEST.fields_by_name['parent']._options = None
  _VALIDATEMESSAGEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _VALIDATEMESSAGEREQUEST.fields_by_name['name']._options = None
  _VALIDATEMESSAGEREQUEST.fields_by_name['name']._serialized_options = b'\372A\036\n\034pubsub.googleapis.com/Schema'
  _SCHEMASERVICE._options = None
  _SCHEMASERVICE._serialized_options = b'\312A\025pubsub.googleapis.com\322AUhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/pubsub'
  _SCHEMASERVICE.methods_by_name['CreateSchema']._options = None
  _SCHEMASERVICE.methods_by_name['CreateSchema']._serialized_options = b'\202\323\344\223\002)\"\037/v1/{parent=projects/*}/schemas:\006schema\332A\027parent,schema,schema_id'
  _SCHEMASERVICE.methods_by_name['GetSchema']._options = None
  _SCHEMASERVICE.methods_by_name['GetSchema']._serialized_options = b'\202\323\344\223\002!\022\037/v1/{name=projects/*/schemas/*}\332A\004name'
  _SCHEMASERVICE.methods_by_name['ListSchemas']._options = None
  _SCHEMASERVICE.methods_by_name['ListSchemas']._serialized_options = b'\202\323\344\223\002!\022\037/v1/{parent=projects/*}/schemas\332A\006parent'
  _SCHEMASERVICE.methods_by_name['DeleteSchema']._options = None
  _SCHEMASERVICE.methods_by_name['DeleteSchema']._serialized_options = b'\202\323\344\223\002!*\037/v1/{name=projects/*/schemas/*}\332A\004name'
  _SCHEMASERVICE.methods_by_name['ValidateSchema']._options = None
  _SCHEMASERVICE.methods_by_name['ValidateSchema']._serialized_options = b'\202\323\344\223\002-\"(/v1/{parent=projects/*}/schemas:validate:\001*\332A\rparent,schema'
  _SCHEMASERVICE.methods_by_name['ValidateMessage']._options = None
  _SCHEMASERVICE.methods_by_name['ValidateMessage']._serialized_options = b'\202\323\344\223\0024\"//v1/{parent=projects/*}/schemas:validateMessage:\001*'
  _SCHEMAVIEW._serialized_start=1488
  _SCHEMAVIEW._serialized_end=1550
  _ENCODING._serialized_start=1552
  _ENCODING._serialized_end=1610
  _SCHEMA._serialized_start=196
  _SCHEMA._serialized_end=421
  _SCHEMA_TYPE._serialized_start=290
  _SCHEMA_TYPE._serialized_end=349
  _CREATESCHEMAREQUEST._serialized_start=424
  _CREATESCHEMAREQUEST._serialized_end=565
  _GETSCHEMAREQUEST._serialized_start=567
  _GETSCHEMAREQUEST._serialized_end=681
  _LISTSCHEMASREQUEST._serialized_start=684
  _LISTSCHEMASREQUEST._serialized_end=856
  _LISTSCHEMASRESPONSE._serialized_start=858
  _LISTSCHEMASRESPONSE._serialized_end=947
  _DELETESCHEMAREQUEST._serialized_start=949
  _DELETESCHEMAREQUEST._serialized_end=1022
  _VALIDATESCHEMAREQUEST._serialized_start=1025
  _VALIDATESCHEMAREQUEST._serialized_end=1164
  _VALIDATESCHEMARESPONSE._serialized_start=1166
  _VALIDATESCHEMARESPONSE._serialized_end=1190
  _VALIDATEMESSAGEREQUEST._serialized_start=1193
  _VALIDATEMESSAGEREQUEST._serialized_end=1459
  _VALIDATEMESSAGERESPONSE._serialized_start=1461
  _VALIDATEMESSAGERESPONSE._serialized_end=1486
  _SCHEMASERVICE._serialized_start=1613
  _SCHEMASERVICE._serialized_end=2628
# @@protoc_insertion_point(module_scope)
