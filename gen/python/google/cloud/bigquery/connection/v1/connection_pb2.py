# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/connection/v1/connection.proto
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
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/cloud/bigquery/connection/v1/connection.proto\x12#google.cloud.bigquery.connection.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xba\x01\n\x17\x43reateConnectionRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x1a\n\rconnection_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12H\n\nconnection\x18\x03 \x01(\x0b\x32/.google.cloud.bigquery.connection.v1.ConnectionB\x03\xe0\x41\x02\"Z\n\x14GetConnectionRequest\x12\x42\n\x04name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,bigqueryconnection.googleapis.com/Connection\"\x7f\n\x16ListConnectionsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x16\n\tpage_size\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x12\n\npage_token\x18\x03 \x01(\t\"x\n\x17ListConnectionsResponse\x12\x17\n\x0fnext_page_token\x18\x01 \x01(\t\x12\x44\n\x0b\x63onnections\x18\x02 \x03(\x0b\x32/.google.cloud.bigquery.connection.v1.Connection\"\xdd\x01\n\x17UpdateConnectionRequest\x12\x42\n\x04name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,bigqueryconnection.googleapis.com/Connection\x12H\n\nconnection\x18\x02 \x01(\x0b\x32/.google.cloud.bigquery.connection.v1.ConnectionB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"]\n\x17\x44\x65leteConnectionRequest\x12\x42\n\x04name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,bigqueryconnection.googleapis.com/Connection\"\xa9\x05\n\nConnection\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x15\n\rfriendly_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12L\n\tcloud_sql\x18\x04 \x01(\x0b\x32\x37.google.cloud.bigquery.connection.v1.CloudSqlPropertiesH\x00\x12\x41\n\x03\x61ws\x18\x08 \x01(\x0b\x32\x32.google.cloud.bigquery.connection.v1.AwsPropertiesH\x00\x12\x45\n\x05\x61zure\x18\x0b \x01(\x0b\x32\x34.google.cloud.bigquery.connection.v1.AzurePropertiesH\x00\x12T\n\rcloud_spanner\x18\x15 \x01(\x0b\x32;.google.cloud.bigquery.connection.v1.CloudSpannerPropertiesH\x00\x12V\n\x0e\x63loud_resource\x18\x16 \x01(\x0b\x32<.google.cloud.bigquery.connection.v1.CloudResourcePropertiesH\x00\x12\x1a\n\rcreation_time\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03\x12\x1f\n\x12last_modified_time\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03\x12\x1b\n\x0ehas_credential\x18\x07 \x01(\x08\x42\x03\xe0\x41\x03:s\xea\x41p\n,bigqueryconnection.googleapis.com/Connection\x12@projects/{project}/locations/{location}/connections/{connection}B\x0c\n\nproperties\"\xca\x02\n\x12\x43loudSqlProperties\x12\x13\n\x0binstance_id\x18\x01 \x01(\t\x12\x10\n\x08\x64\x61tabase\x18\x02 \x01(\t\x12R\n\x04type\x18\x03 \x01(\x0e\x32\x44.google.cloud.bigquery.connection.v1.CloudSqlProperties.DatabaseType\x12P\n\ncredential\x18\x04 \x01(\x0b\x32\x37.google.cloud.bigquery.connection.v1.CloudSqlCredentialB\x03\xe0\x41\x04\x12\x1f\n\x12service_account_id\x18\x05 \x01(\tB\x03\xe0\x41\x03\"F\n\x0c\x44\x61tabaseType\x12\x1d\n\x19\x44\x41TABASE_TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08POSTGRES\x10\x01\x12\t\n\x05MYSQL\x10\x02\"8\n\x12\x43loudSqlCredential\x12\x10\n\x08username\x18\x01 \x01(\t\x12\x10\n\x08password\x18\x02 \x01(\t\"C\n\x16\x43loudSpannerProperties\x12\x10\n\x08\x64\x61tabase\x18\x01 \x01(\t\x12\x17\n\x0fuse_parallelism\x18\x02 \x01(\x08\"\xcf\x01\n\rAwsProperties\x12Z\n\x12\x63ross_account_role\x18\x02 \x01(\x0b\x32\x38.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleB\x02\x18\x01H\x00\x12I\n\x0b\x61\x63\x63\x65ss_role\x18\x03 \x01(\x0b\x32\x32.google.cloud.bigquery.connection.v1.AwsAccessRoleH\x00\x42\x17\n\x15\x61uthentication_method\"^\n\x13\x41wsCrossAccountRole\x12\x13\n\x0biam_role_id\x18\x01 \x01(\t\x12\x18\n\x0biam_user_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x18\n\x0b\x65xternal_id\x18\x03 \x01(\tB\x03\xe0\x41\x03\"6\n\rAwsAccessRole\x12\x13\n\x0biam_role_id\x18\x01 \x01(\t\x12\x10\n\x08identity\x18\x02 \x01(\t\"\xcd\x01\n\x0f\x41zureProperties\x12\x18\n\x0b\x61pplication\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\tclient_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\tobject_id\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x1a\n\x12\x63ustomer_tenant_id\x18\x04 \x01(\t\x12\x14\n\x0credirect_uri\x18\x05 \x01(\t\x12\'\n\x1f\x66\x65\x64\x65rated_application_client_id\x18\x06 \x01(\t\x12\x15\n\x08identity\x18\x07 \x01(\tB\x03\xe0\x41\x03\":\n\x17\x43loudResourceProperties\x12\x1f\n\x12service_account_id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x32\xcc\r\n\x11\x43onnectionService\x12\xe8\x01\n\x10\x43reateConnection\x12<.google.cloud.bigquery.connection.v1.CreateConnectionRequest\x1a/.google.cloud.bigquery.connection.v1.Connection\"e\x82\xd3\xe4\x93\x02=\"//v1/{parent=projects/*/locations/*}/connections:\nconnection\xda\x41\x1fparent,connection,connection_id\x12\xbb\x01\n\rGetConnection\x12\x39.google.cloud.bigquery.connection.v1.GetConnectionRequest\x1a/.google.cloud.bigquery.connection.v1.Connection\">\x82\xd3\xe4\x93\x02\x31\x12//v1/{name=projects/*/locations/*/connections/*}\xda\x41\x04name\x12\xce\x01\n\x0fListConnections\x12;.google.cloud.bigquery.connection.v1.ListConnectionsRequest\x1a<.google.cloud.bigquery.connection.v1.ListConnectionsResponse\"@\x82\xd3\xe4\x93\x02\x31\x12//v1/{parent=projects/*/locations/*}/connections\xda\x41\x06parent\x12\xe4\x01\n\x10UpdateConnection\x12<.google.cloud.bigquery.connection.v1.UpdateConnectionRequest\x1a/.google.cloud.bigquery.connection.v1.Connection\"a\x82\xd3\xe4\x93\x02=2//v1/{name=projects/*/locations/*/connections/*}:\nconnection\xda\x41\x1bname,connection,update_mask\x12\xa8\x01\n\x10\x44\x65leteConnection\x12<.google.cloud.bigquery.connection.v1.DeleteConnectionRequest\x1a\x16.google.protobuf.Empty\">\x82\xd3\xe4\x93\x02\x31*//v1/{name=projects/*/locations/*/connections/*}\xda\x41\x04name\x12\xa9\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"^\x82\xd3\xe4\x93\x02\x45\"@/v1/{resource=projects/*/locations/*/connections/*}:getIamPolicy:\x01*\xda\x41\x10resource,options\x12\xa8\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"]\x82\xd3\xe4\x93\x02\x45\"@/v1/{resource=projects/*/locations/*/connections/*}:setIamPolicy:\x01*\xda\x41\x0fresource,policy\x12\xd3\x01\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"h\x82\xd3\xe4\x93\x02K\"F/v1/{resource=projects/*/locations/*/connections/*}:testIamPermissions:\x01*\xda\x41\x14resource,permissions\x1a~\xca\x41!bigqueryconnection.googleapis.com\xd2\x41Whttps://www.googleapis.com/auth/bigquery,https://www.googleapis.com/auth/cloud-platformB\xc6\x01\n\'com.google.cloud.bigquery.connection.v1P\x01ZMgoogle.golang.org/genproto/googleapis/cloud/bigquery/connection/v1;connection\xaa\x02#Google.Cloud.BigQuery.Connection.V1\xca\x02#Google\\Cloud\\BigQuery\\Connection\\V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.connection.v1.connection_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.google.cloud.bigquery.connection.v1P\001ZMgoogle.golang.org/genproto/googleapis/cloud/bigquery/connection/v1;connection\252\002#Google.Cloud.BigQuery.Connection.V1\312\002#Google\\Cloud\\BigQuery\\Connection\\V1'
  _CREATECONNECTIONREQUEST.fields_by_name['parent']._options = None
  _CREATECONNECTIONREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATECONNECTIONREQUEST.fields_by_name['connection_id']._options = None
  _CREATECONNECTIONREQUEST.fields_by_name['connection_id']._serialized_options = b'\340A\001'
  _CREATECONNECTIONREQUEST.fields_by_name['connection']._options = None
  _CREATECONNECTIONREQUEST.fields_by_name['connection']._serialized_options = b'\340A\002'
  _GETCONNECTIONREQUEST.fields_by_name['name']._options = None
  _GETCONNECTIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A.\n,bigqueryconnection.googleapis.com/Connection'
  _LISTCONNECTIONSREQUEST.fields_by_name['parent']._options = None
  _LISTCONNECTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _LISTCONNECTIONSREQUEST.fields_by_name['page_size']._options = None
  _LISTCONNECTIONSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\002'
  _UPDATECONNECTIONREQUEST.fields_by_name['name']._options = None
  _UPDATECONNECTIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A.\n,bigqueryconnection.googleapis.com/Connection'
  _UPDATECONNECTIONREQUEST.fields_by_name['connection']._options = None
  _UPDATECONNECTIONREQUEST.fields_by_name['connection']._serialized_options = b'\340A\002'
  _UPDATECONNECTIONREQUEST.fields_by_name['update_mask']._options = None
  _UPDATECONNECTIONREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _DELETECONNECTIONREQUEST.fields_by_name['name']._options = None
  _DELETECONNECTIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A.\n,bigqueryconnection.googleapis.com/Connection'
  _CONNECTION.fields_by_name['creation_time']._options = None
  _CONNECTION.fields_by_name['creation_time']._serialized_options = b'\340A\003'
  _CONNECTION.fields_by_name['last_modified_time']._options = None
  _CONNECTION.fields_by_name['last_modified_time']._serialized_options = b'\340A\003'
  _CONNECTION.fields_by_name['has_credential']._options = None
  _CONNECTION.fields_by_name['has_credential']._serialized_options = b'\340A\003'
  _CONNECTION._options = None
  _CONNECTION._serialized_options = b'\352Ap\n,bigqueryconnection.googleapis.com/Connection\022@projects/{project}/locations/{location}/connections/{connection}'
  _CLOUDSQLPROPERTIES.fields_by_name['credential']._options = None
  _CLOUDSQLPROPERTIES.fields_by_name['credential']._serialized_options = b'\340A\004'
  _CLOUDSQLPROPERTIES.fields_by_name['service_account_id']._options = None
  _CLOUDSQLPROPERTIES.fields_by_name['service_account_id']._serialized_options = b'\340A\003'
  _AWSPROPERTIES.fields_by_name['cross_account_role']._options = None
  _AWSPROPERTIES.fields_by_name['cross_account_role']._serialized_options = b'\030\001'
  _AWSCROSSACCOUNTROLE.fields_by_name['iam_user_id']._options = None
  _AWSCROSSACCOUNTROLE.fields_by_name['iam_user_id']._serialized_options = b'\340A\003'
  _AWSCROSSACCOUNTROLE.fields_by_name['external_id']._options = None
  _AWSCROSSACCOUNTROLE.fields_by_name['external_id']._serialized_options = b'\340A\003'
  _AZUREPROPERTIES.fields_by_name['application']._options = None
  _AZUREPROPERTIES.fields_by_name['application']._serialized_options = b'\340A\003'
  _AZUREPROPERTIES.fields_by_name['client_id']._options = None
  _AZUREPROPERTIES.fields_by_name['client_id']._serialized_options = b'\340A\003'
  _AZUREPROPERTIES.fields_by_name['object_id']._options = None
  _AZUREPROPERTIES.fields_by_name['object_id']._serialized_options = b'\340A\003'
  _AZUREPROPERTIES.fields_by_name['identity']._options = None
  _AZUREPROPERTIES.fields_by_name['identity']._serialized_options = b'\340A\003'
  _CLOUDRESOURCEPROPERTIES.fields_by_name['service_account_id']._options = None
  _CLOUDRESOURCEPROPERTIES.fields_by_name['service_account_id']._serialized_options = b'\340A\003'
  _CONNECTIONSERVICE._options = None
  _CONNECTIONSERVICE._serialized_options = b'\312A!bigqueryconnection.googleapis.com\322AWhttps://www.googleapis.com/auth/bigquery,https://www.googleapis.com/auth/cloud-platform'
  _CONNECTIONSERVICE.methods_by_name['CreateConnection']._options = None
  _CONNECTIONSERVICE.methods_by_name['CreateConnection']._serialized_options = b'\202\323\344\223\002=\"//v1/{parent=projects/*/locations/*}/connections:\nconnection\332A\037parent,connection,connection_id'
  _CONNECTIONSERVICE.methods_by_name['GetConnection']._options = None
  _CONNECTIONSERVICE.methods_by_name['GetConnection']._serialized_options = b'\202\323\344\223\0021\022//v1/{name=projects/*/locations/*/connections/*}\332A\004name'
  _CONNECTIONSERVICE.methods_by_name['ListConnections']._options = None
  _CONNECTIONSERVICE.methods_by_name['ListConnections']._serialized_options = b'\202\323\344\223\0021\022//v1/{parent=projects/*/locations/*}/connections\332A\006parent'
  _CONNECTIONSERVICE.methods_by_name['UpdateConnection']._options = None
  _CONNECTIONSERVICE.methods_by_name['UpdateConnection']._serialized_options = b'\202\323\344\223\002=2//v1/{name=projects/*/locations/*/connections/*}:\nconnection\332A\033name,connection,update_mask'
  _CONNECTIONSERVICE.methods_by_name['DeleteConnection']._options = None
  _CONNECTIONSERVICE.methods_by_name['DeleteConnection']._serialized_options = b'\202\323\344\223\0021*//v1/{name=projects/*/locations/*/connections/*}\332A\004name'
  _CONNECTIONSERVICE.methods_by_name['GetIamPolicy']._options = None
  _CONNECTIONSERVICE.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002E\"@/v1/{resource=projects/*/locations/*/connections/*}:getIamPolicy:\001*\332A\020resource,options'
  _CONNECTIONSERVICE.methods_by_name['SetIamPolicy']._options = None
  _CONNECTIONSERVICE.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002E\"@/v1/{resource=projects/*/locations/*/connections/*}:setIamPolicy:\001*\332A\017resource,policy'
  _CONNECTIONSERVICE.methods_by_name['TestIamPermissions']._options = None
  _CONNECTIONSERVICE.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002K\"F/v1/{resource=projects/*/locations/*/connections/*}:testIamPermissions:\001*\332A\024resource,permissions'
  _CREATECONNECTIONREQUEST._serialized_start=332
  _CREATECONNECTIONREQUEST._serialized_end=518
  _GETCONNECTIONREQUEST._serialized_start=520
  _GETCONNECTIONREQUEST._serialized_end=610
  _LISTCONNECTIONSREQUEST._serialized_start=612
  _LISTCONNECTIONSREQUEST._serialized_end=739
  _LISTCONNECTIONSRESPONSE._serialized_start=741
  _LISTCONNECTIONSRESPONSE._serialized_end=861
  _UPDATECONNECTIONREQUEST._serialized_start=864
  _UPDATECONNECTIONREQUEST._serialized_end=1085
  _DELETECONNECTIONREQUEST._serialized_start=1087
  _DELETECONNECTIONREQUEST._serialized_end=1180
  _CONNECTION._serialized_start=1183
  _CONNECTION._serialized_end=1864
  _CLOUDSQLPROPERTIES._serialized_start=1867
  _CLOUDSQLPROPERTIES._serialized_end=2197
  _CLOUDSQLPROPERTIES_DATABASETYPE._serialized_start=2127
  _CLOUDSQLPROPERTIES_DATABASETYPE._serialized_end=2197
  _CLOUDSQLCREDENTIAL._serialized_start=2199
  _CLOUDSQLCREDENTIAL._serialized_end=2255
  _CLOUDSPANNERPROPERTIES._serialized_start=2257
  _CLOUDSPANNERPROPERTIES._serialized_end=2324
  _AWSPROPERTIES._serialized_start=2327
  _AWSPROPERTIES._serialized_end=2534
  _AWSCROSSACCOUNTROLE._serialized_start=2536
  _AWSCROSSACCOUNTROLE._serialized_end=2630
  _AWSACCESSROLE._serialized_start=2632
  _AWSACCESSROLE._serialized_end=2686
  _AZUREPROPERTIES._serialized_start=2689
  _AZUREPROPERTIES._serialized_end=2894
  _CLOUDRESOURCEPROPERTIES._serialized_start=2896
  _CLOUDRESOURCEPROPERTIES._serialized_end=2954
  _CONNECTIONSERVICE._serialized_start=2957
  _CONNECTIONSERVICE._serialized_end=4697
# @@protoc_insertion_point(module_scope)
