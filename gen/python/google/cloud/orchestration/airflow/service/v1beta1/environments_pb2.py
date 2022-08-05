# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto
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
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nEgoogle/cloud/orchestration/airflow/service/v1beta1/environments.proto\x12\x32google.cloud.orchestration.airflow.service.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x80\x01\n\x18\x43reateEnvironmentRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12T\n\x0b\x65nvironment\x18\x02 \x01(\x0b\x32?.google.cloud.orchestration.airflow.service.v1beta1.Environment\"%\n\x15GetEnvironmentRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"P\n\x17ListEnvironmentsRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x8a\x01\n\x18ListEnvironmentsResponse\x12U\n\x0c\x65nvironments\x18\x01 \x03(\x0b\x32?.google.cloud.orchestration.airflow.service.v1beta1.Environment\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"(\n\x18\x44\x65leteEnvironmentRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"\xb4\x01\n\x18UpdateEnvironmentRequest\x12\x0c\n\x04name\x18\x02 \x01(\t\x12T\n\x0b\x65nvironment\x18\x01 \x01(\x0b\x32?.google.cloud.orchestration.airflow.service.v1beta1.Environment\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"\'\n\x17RestartWebServerRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"\x9a\n\n\x11\x45nvironmentConfig\x12\x18\n\x0bgke_cluster\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0e\x64\x61g_gcs_prefix\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x12\n\nnode_count\x18\x03 \x01(\x05\x12[\n\x0fsoftware_config\x18\x04 \x01(\x0b\x32\x42.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig\x12S\n\x0bnode_config\x18\x05 \x01(\x0b\x32>.google.cloud.orchestration.airflow.service.v1beta1.NodeConfig\x12p\n\x1aprivate_environment_config\x18\x07 \x01(\x0b\x32L.google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfig\x12\x81\x01\n!web_server_network_access_control\x18\t \x01(\x0b\x32Q.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControlB\x03\xe0\x41\x01\x12`\n\x0f\x64\x61tabase_config\x18\n \x01(\x0b\x32\x42.google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfigB\x03\xe0\x41\x01\x12\x63\n\x11web_server_config\x18\x0b \x01(\x0b\x32\x43.google.cloud.orchestration.airflow.service.v1beta1.WebServerConfigB\x03\xe0\x41\x01\x12\x18\n\x0b\x61irflow_uri\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12\x64\n\x11\x65ncryption_config\x18\x0c \x01(\x0b\x32\x44.google.cloud.orchestration.airflow.service.v1beta1.EncryptionConfigB\x03\xe0\x41\x01\x12\x66\n\x12maintenance_window\x18\r \x01(\x0b\x32\x45.google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindowB\x03\xe0\x41\x01\x12\x62\n\x10workloads_config\x18\x0f \x01(\x0b\x32\x43.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfigB\x03\xe0\x41\x01\x12t\n\x10\x65nvironment_size\x18\x10 \x01(\x0e\x32U.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig.EnvironmentSizeB\x03\xe0\x41\x01\"\x88\x01\n\x0f\x45nvironmentSize\x12 \n\x1c\x45NVIRONMENT_SIZE_UNSPECIFIED\x10\x00\x12\x1a\n\x16\x45NVIRONMENT_SIZE_SMALL\x10\x01\x12\x1b\n\x17\x45NVIRONMENT_SIZE_MEDIUM\x10\x02\x12\x1a\n\x16\x45NVIRONMENT_SIZE_LARGE\x10\x03\"\xd7\x01\n\x1dWebServerNetworkAccessControl\x12{\n\x11\x61llowed_ip_ranges\x18\x01 \x03(\x0b\x32`.google.cloud.orchestration.airflow.service.v1beta1.WebServerNetworkAccessControl.AllowedIpRange\x1a\x39\n\x0e\x41llowedIpRange\x12\r\n\x05value\x18\x01 \x01(\t\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\"\xd9\x04\n\x0eSoftwareConfig\x12\x15\n\rimage_version\x18\x01 \x01(\t\x12\x85\x01\n\x18\x61irflow_config_overrides\x18\x02 \x03(\x0b\x32^.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig.AirflowConfigOverridesEntryB\x03\xe0\x41\x01\x12p\n\rpypi_packages\x18\x03 \x03(\x0b\x32T.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig.PypiPackagesEntryB\x03\xe0\x41\x01\x12p\n\renv_variables\x18\x04 \x03(\x0b\x32T.google.cloud.orchestration.airflow.service.v1beta1.SoftwareConfig.EnvVariablesEntryB\x03\xe0\x41\x01\x12\x1b\n\x0epython_version\x18\x06 \x01(\tB\x03\xe0\x41\x01\x1a=\n\x1b\x41irflowConfigOverridesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\x33\n\x11PypiPackagesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\x33\n\x11\x45nvVariablesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xd5\x01\n\x12IPAllocationPolicy\x12\x1b\n\x0euse_ip_aliases\x18\x01 \x01(\x08\x42\x03\xe0\x41\x01\x12)\n\x1c\x63luster_secondary_range_name\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12*\n\x1dservices_secondary_range_name\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12$\n\x17\x63luster_ipv4_cidr_block\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12%\n\x18services_ipv4_cidr_block\x18\x05 \x01(\tB\x03\xe0\x41\x01\"\xdf\x02\n\nNodeConfig\x12\x15\n\x08location\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0cmachine_type\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x14\n\x07network\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x17\n\nsubnetwork\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0c\x64isk_size_gb\x18\x05 \x01(\x05\x42\x03\xe0\x41\x01\x12\x19\n\x0coauth_scopes\x18\x06 \x03(\tB\x03\xe0\x41\x01\x12\x1c\n\x0fservice_account\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12\x11\n\x04tags\x18\x08 \x03(\tB\x03\xe0\x41\x01\x12i\n\x14ip_allocation_policy\x18\t \x01(\x0b\x32\x46.google.cloud.orchestration.airflow.service.v1beta1.IPAllocationPolicyB\x03\xe0\x41\x01\x12\x1e\n\x11max_pods_per_node\x18\n \x01(\x05\x42\x03\xe0\x41\x01\"\x8a\x01\n\x14PrivateClusterConfig\x12$\n\x17\x65nable_private_endpoint\x18\x01 \x01(\x08\x42\x03\xe0\x41\x01\x12#\n\x16master_ipv4_cidr_block\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\'\n\x1amaster_ipv4_reserved_range\x18\x03 \x01(\tB\x03\xe0\x41\x03\"\x9e\x03\n\x18PrivateEnvironmentConfig\x12\'\n\x1a\x65nable_private_environment\x18\x01 \x01(\x08\x42\x03\xe0\x41\x01\x12m\n\x16private_cluster_config\x18\x02 \x01(\x0b\x32H.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfigB\x03\xe0\x41\x01\x12\'\n\x1aweb_server_ipv4_cidr_block\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12&\n\x19\x63loud_sql_ipv4_cidr_block\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12+\n\x1eweb_server_ipv4_reserved_range\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x33\n&cloud_composer_network_ipv4_cidr_block\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12\x37\n*cloud_composer_network_ipv4_reserved_range\x18\x08 \x01(\tB\x03\xe0\x41\x03\"+\n\x0e\x44\x61tabaseConfig\x12\x19\n\x0cmachine_type\x18\x01 \x01(\tB\x03\xe0\x41\x01\",\n\x0fWebServerConfig\x12\x19\n\x0cmachine_type\x18\x01 \x01(\tB\x03\xe0\x41\x01\"-\n\x10\x45ncryptionConfig\x12\x19\n\x0ckms_key_name\x18\x01 \x01(\tB\x03\xe0\x41\x01\"\x94\x01\n\x11MaintenanceWindow\x12\x33\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\x12\x17\n\nrecurrence\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\xa3\x05\n\x0fWorkloadsConfig\x12m\n\tscheduler\x18\x01 \x01(\x0b\x32U.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.SchedulerResourceB\x03\xe0\x41\x01\x12n\n\nweb_server\x18\x02 \x01(\x0b\x32U.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WebServerResourceB\x03\xe0\x41\x01\x12g\n\x06worker\x18\x03 \x01(\x0b\x32R.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WorkerResourceB\x03\xe0\x41\x01\x1aj\n\x11SchedulerResource\x12\x10\n\x03\x63pu\x18\x01 \x01(\x02\x42\x03\xe0\x41\x01\x12\x16\n\tmemory_gb\x18\x02 \x01(\x02\x42\x03\xe0\x41\x01\x12\x17\n\nstorage_gb\x18\x03 \x01(\x02\x42\x03\xe0\x41\x01\x12\x12\n\x05\x63ount\x18\x04 \x01(\x05\x42\x03\xe0\x41\x01\x1aV\n\x11WebServerResource\x12\x10\n\x03\x63pu\x18\x01 \x01(\x02\x42\x03\xe0\x41\x01\x12\x16\n\tmemory_gb\x18\x02 \x01(\x02\x42\x03\xe0\x41\x01\x12\x17\n\nstorage_gb\x18\x03 \x01(\x02\x42\x03\xe0\x41\x01\x1a\x83\x01\n\x0eWorkerResource\x12\x10\n\x03\x63pu\x18\x01 \x01(\x02\x42\x03\xe0\x41\x01\x12\x16\n\tmemory_gb\x18\x02 \x01(\x02\x42\x03\xe0\x41\x01\x12\x17\n\nstorage_gb\x18\x03 \x01(\x02\x42\x03\xe0\x41\x01\x12\x16\n\tmin_count\x18\x04 \x01(\x05\x42\x03\xe0\x41\x01\x12\x16\n\tmax_count\x18\x05 \x01(\x05\x42\x03\xe0\x41\x01\"\xa8\x05\n\x0b\x45nvironment\x12\x0c\n\x04name\x18\x01 \x01(\t\x12U\n\x06\x63onfig\x18\x02 \x01(\x0b\x32\x45.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig\x12\x11\n\x04uuid\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12T\n\x05state\x18\x04 \x01(\x0e\x32\x45.google.cloud.orchestration.airflow.service.v1beta1.Environment.State\x12\x34\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12`\n\x06labels\x18\x07 \x03(\x0b\x32K.google.cloud.orchestration.airflow.service.v1beta1.Environment.LabelsEntryB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"`\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\x0c\n\x08UPDATING\x10\x03\x12\x0c\n\x08\x44\x45LETING\x10\x04\x12\t\n\x05\x45RROR\x10\x05:l\xea\x41i\n#composer.googleapis.com/Environment\x12\x42projects/{project}/locations/{location}/environments/{environment}\"A\n\x13\x43heckUpgradeRequest\x12\x13\n\x0b\x65nvironment\x18\x01 \x01(\t\x12\x15\n\rimage_version\x18\x02 \x01(\t\"\x84\x04\n\x14\x43heckUpgradeResponse\x12\x1a\n\rbuild_log_uri\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x84\x01\n\x1e\x63ontains_pypi_modules_conflict\x18\x04 \x01(\x0e\x32W.google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse.ConflictResultB\x03\xe0\x41\x03\x12,\n\x1fpypi_conflict_build_log_extract\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x15\n\rimage_version\x18\x05 \x01(\t\x12y\n\x11pypi_dependencies\x18\x06 \x03(\x0b\x32^.google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse.PypiDependenciesEntry\x1a\x37\n\x15PypiDependenciesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"P\n\x0e\x43onflictResult\x12\x1f\n\x1b\x43ONFLICT_RESULT_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43ONFLICT\x10\x01\x12\x0f\n\x0bNO_CONFLICT\x10\x02\x32\xf0\x10\n\x0c\x45nvironments\x12\xb8\x02\n\x11\x43reateEnvironment\x12L.google.cloud.orchestration.airflow.service.v1beta1.CreateEnvironmentRequest\x1a\x1d.google.longrunning.Operation\"\xb5\x01\x82\xd3\xe4\x93\x02\x44\"5/v1beta1/{parent=projects/*/locations/*}/environments:\x0b\x65nvironment\xda\x41\x12parent,environment\xca\x41S\n\x0b\x45nvironment\x12\x44google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata\x12\xe2\x01\n\x0eGetEnvironment\x12I.google.cloud.orchestration.airflow.service.v1beta1.GetEnvironmentRequest\x1a?.google.cloud.orchestration.airflow.service.v1beta1.Environment\"D\x82\xd3\xe4\x93\x02\x37\x12\x35/v1beta1/{name=projects/*/locations/*/environments/*}\xda\x41\x04name\x12\xf5\x01\n\x10ListEnvironments\x12K.google.cloud.orchestration.airflow.service.v1beta1.ListEnvironmentsRequest\x1aL.google.cloud.orchestration.airflow.service.v1beta1.ListEnvironmentsResponse\"F\x82\xd3\xe4\x93\x02\x37\x12\x35/v1beta1/{parent=projects/*/locations/*}/environments\xda\x41\x06parent\x12\xc2\x02\n\x11UpdateEnvironment\x12L.google.cloud.orchestration.airflow.service.v1beta1.UpdateEnvironmentRequest\x1a\x1d.google.longrunning.Operation\"\xbf\x01\x82\xd3\xe4\x93\x02\x44\x32\x35/v1beta1/{name=projects/*/locations/*/environments/*}:\x0b\x65nvironment\xda\x41\x1cname,environment,update_mask\xca\x41S\n\x0b\x45nvironment\x12\x44google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata\x12\xa7\x02\n\x11\x44\x65leteEnvironment\x12L.google.cloud.orchestration.airflow.service.v1beta1.DeleteEnvironmentRequest\x1a\x1d.google.longrunning.Operation\"\xa4\x01\x82\xd3\xe4\x93\x02\x37*5/v1beta1/{name=projects/*/locations/*/environments/*}\xda\x41\x04name\xca\x41]\n\x15google.protobuf.Empty\x12\x44google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata\x12\xa8\x02\n\x10RestartWebServer\x12K.google.cloud.orchestration.airflow.service.v1beta1.RestartWebServerRequest\x1a\x1d.google.longrunning.Operation\"\xa7\x01\x82\xd3\xe4\x93\x02K\"F/v1beta1/{name=projects/*/locations/*/environments/*}:restartWebServer:\x01*\xca\x41S\n\x0b\x45nvironment\x12\x44google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata\x12\xe0\x02\n\x0c\x43heckUpgrade\x12G.google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeRequest\x1a\x1d.google.longrunning.Operation\"\xe7\x01\x82\xd3\xe4\x93\x02N\"I/v1beta1/{environment=projects/*/locations/*/environments/*}:checkUpgrade:\x01*\xca\x41\x8f\x01\nGgoogle.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse\x12\x44google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata\x1aK\xca\x41\x17\x63omposer.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x95\x01\n6com.google.cloud.orchestration.airflow.service.v1beta1P\x01ZYgoogle.golang.org/genproto/googleapis/cloud/orchestration/airflow/service/v1beta1;serviceb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.orchestration.airflow.service.v1beta1.environments_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n6com.google.cloud.orchestration.airflow.service.v1beta1P\001ZYgoogle.golang.org/genproto/googleapis/cloud/orchestration/airflow/service/v1beta1;service'
  _UPDATEENVIRONMENTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEENVIRONMENTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _ENVIRONMENTCONFIG.fields_by_name['gke_cluster']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['gke_cluster']._serialized_options = b'\340A\003'
  _ENVIRONMENTCONFIG.fields_by_name['dag_gcs_prefix']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['dag_gcs_prefix']._serialized_options = b'\340A\003'
  _ENVIRONMENTCONFIG.fields_by_name['web_server_network_access_control']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['web_server_network_access_control']._serialized_options = b'\340A\001'
  _ENVIRONMENTCONFIG.fields_by_name['database_config']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['database_config']._serialized_options = b'\340A\001'
  _ENVIRONMENTCONFIG.fields_by_name['web_server_config']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['web_server_config']._serialized_options = b'\340A\001'
  _ENVIRONMENTCONFIG.fields_by_name['airflow_uri']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['airflow_uri']._serialized_options = b'\340A\003'
  _ENVIRONMENTCONFIG.fields_by_name['encryption_config']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['encryption_config']._serialized_options = b'\340A\001'
  _ENVIRONMENTCONFIG.fields_by_name['maintenance_window']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['maintenance_window']._serialized_options = b'\340A\001'
  _ENVIRONMENTCONFIG.fields_by_name['workloads_config']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['workloads_config']._serialized_options = b'\340A\001'
  _ENVIRONMENTCONFIG.fields_by_name['environment_size']._options = None
  _ENVIRONMENTCONFIG.fields_by_name['environment_size']._serialized_options = b'\340A\001'
  _WEBSERVERNETWORKACCESSCONTROL_ALLOWEDIPRANGE.fields_by_name['description']._options = None
  _WEBSERVERNETWORKACCESSCONTROL_ALLOWEDIPRANGE.fields_by_name['description']._serialized_options = b'\340A\001'
  _SOFTWARECONFIG_AIRFLOWCONFIGOVERRIDESENTRY._options = None
  _SOFTWARECONFIG_AIRFLOWCONFIGOVERRIDESENTRY._serialized_options = b'8\001'
  _SOFTWARECONFIG_PYPIPACKAGESENTRY._options = None
  _SOFTWARECONFIG_PYPIPACKAGESENTRY._serialized_options = b'8\001'
  _SOFTWARECONFIG_ENVVARIABLESENTRY._options = None
  _SOFTWARECONFIG_ENVVARIABLESENTRY._serialized_options = b'8\001'
  _SOFTWARECONFIG.fields_by_name['airflow_config_overrides']._options = None
  _SOFTWARECONFIG.fields_by_name['airflow_config_overrides']._serialized_options = b'\340A\001'
  _SOFTWARECONFIG.fields_by_name['pypi_packages']._options = None
  _SOFTWARECONFIG.fields_by_name['pypi_packages']._serialized_options = b'\340A\001'
  _SOFTWARECONFIG.fields_by_name['env_variables']._options = None
  _SOFTWARECONFIG.fields_by_name['env_variables']._serialized_options = b'\340A\001'
  _SOFTWARECONFIG.fields_by_name['python_version']._options = None
  _SOFTWARECONFIG.fields_by_name['python_version']._serialized_options = b'\340A\001'
  _IPALLOCATIONPOLICY.fields_by_name['use_ip_aliases']._options = None
  _IPALLOCATIONPOLICY.fields_by_name['use_ip_aliases']._serialized_options = b'\340A\001'
  _IPALLOCATIONPOLICY.fields_by_name['cluster_secondary_range_name']._options = None
  _IPALLOCATIONPOLICY.fields_by_name['cluster_secondary_range_name']._serialized_options = b'\340A\001'
  _IPALLOCATIONPOLICY.fields_by_name['services_secondary_range_name']._options = None
  _IPALLOCATIONPOLICY.fields_by_name['services_secondary_range_name']._serialized_options = b'\340A\001'
  _IPALLOCATIONPOLICY.fields_by_name['cluster_ipv4_cidr_block']._options = None
  _IPALLOCATIONPOLICY.fields_by_name['cluster_ipv4_cidr_block']._serialized_options = b'\340A\001'
  _IPALLOCATIONPOLICY.fields_by_name['services_ipv4_cidr_block']._options = None
  _IPALLOCATIONPOLICY.fields_by_name['services_ipv4_cidr_block']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['location']._options = None
  _NODECONFIG.fields_by_name['location']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['machine_type']._options = None
  _NODECONFIG.fields_by_name['machine_type']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['network']._options = None
  _NODECONFIG.fields_by_name['network']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['subnetwork']._options = None
  _NODECONFIG.fields_by_name['subnetwork']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['disk_size_gb']._options = None
  _NODECONFIG.fields_by_name['disk_size_gb']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['oauth_scopes']._options = None
  _NODECONFIG.fields_by_name['oauth_scopes']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['service_account']._options = None
  _NODECONFIG.fields_by_name['service_account']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['tags']._options = None
  _NODECONFIG.fields_by_name['tags']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['ip_allocation_policy']._options = None
  _NODECONFIG.fields_by_name['ip_allocation_policy']._serialized_options = b'\340A\001'
  _NODECONFIG.fields_by_name['max_pods_per_node']._options = None
  _NODECONFIG.fields_by_name['max_pods_per_node']._serialized_options = b'\340A\001'
  _PRIVATECLUSTERCONFIG.fields_by_name['enable_private_endpoint']._options = None
  _PRIVATECLUSTERCONFIG.fields_by_name['enable_private_endpoint']._serialized_options = b'\340A\001'
  _PRIVATECLUSTERCONFIG.fields_by_name['master_ipv4_cidr_block']._options = None
  _PRIVATECLUSTERCONFIG.fields_by_name['master_ipv4_cidr_block']._serialized_options = b'\340A\001'
  _PRIVATECLUSTERCONFIG.fields_by_name['master_ipv4_reserved_range']._options = None
  _PRIVATECLUSTERCONFIG.fields_by_name['master_ipv4_reserved_range']._serialized_options = b'\340A\003'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['enable_private_environment']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['enable_private_environment']._serialized_options = b'\340A\001'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['private_cluster_config']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['private_cluster_config']._serialized_options = b'\340A\001'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['web_server_ipv4_cidr_block']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['web_server_ipv4_cidr_block']._serialized_options = b'\340A\001'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['cloud_sql_ipv4_cidr_block']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['cloud_sql_ipv4_cidr_block']._serialized_options = b'\340A\001'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['web_server_ipv4_reserved_range']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['web_server_ipv4_reserved_range']._serialized_options = b'\340A\003'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['cloud_composer_network_ipv4_cidr_block']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['cloud_composer_network_ipv4_cidr_block']._serialized_options = b'\340A\001'
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['cloud_composer_network_ipv4_reserved_range']._options = None
  _PRIVATEENVIRONMENTCONFIG.fields_by_name['cloud_composer_network_ipv4_reserved_range']._serialized_options = b'\340A\003'
  _DATABASECONFIG.fields_by_name['machine_type']._options = None
  _DATABASECONFIG.fields_by_name['machine_type']._serialized_options = b'\340A\001'
  _WEBSERVERCONFIG.fields_by_name['machine_type']._options = None
  _WEBSERVERCONFIG.fields_by_name['machine_type']._serialized_options = b'\340A\001'
  _ENCRYPTIONCONFIG.fields_by_name['kms_key_name']._options = None
  _ENCRYPTIONCONFIG.fields_by_name['kms_key_name']._serialized_options = b'\340A\001'
  _MAINTENANCEWINDOW.fields_by_name['start_time']._options = None
  _MAINTENANCEWINDOW.fields_by_name['start_time']._serialized_options = b'\340A\002'
  _MAINTENANCEWINDOW.fields_by_name['end_time']._options = None
  _MAINTENANCEWINDOW.fields_by_name['end_time']._serialized_options = b'\340A\002'
  _MAINTENANCEWINDOW.fields_by_name['recurrence']._options = None
  _MAINTENANCEWINDOW.fields_by_name['recurrence']._serialized_options = b'\340A\002'
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['cpu']._options = None
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['cpu']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['memory_gb']._options = None
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['memory_gb']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['storage_gb']._options = None
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['storage_gb']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['count']._options = None
  _WORKLOADSCONFIG_SCHEDULERRESOURCE.fields_by_name['count']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WEBSERVERRESOURCE.fields_by_name['cpu']._options = None
  _WORKLOADSCONFIG_WEBSERVERRESOURCE.fields_by_name['cpu']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WEBSERVERRESOURCE.fields_by_name['memory_gb']._options = None
  _WORKLOADSCONFIG_WEBSERVERRESOURCE.fields_by_name['memory_gb']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WEBSERVERRESOURCE.fields_by_name['storage_gb']._options = None
  _WORKLOADSCONFIG_WEBSERVERRESOURCE.fields_by_name['storage_gb']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['cpu']._options = None
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['cpu']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['memory_gb']._options = None
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['memory_gb']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['storage_gb']._options = None
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['storage_gb']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['min_count']._options = None
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['min_count']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['max_count']._options = None
  _WORKLOADSCONFIG_WORKERRESOURCE.fields_by_name['max_count']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG.fields_by_name['scheduler']._options = None
  _WORKLOADSCONFIG.fields_by_name['scheduler']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG.fields_by_name['web_server']._options = None
  _WORKLOADSCONFIG.fields_by_name['web_server']._serialized_options = b'\340A\001'
  _WORKLOADSCONFIG.fields_by_name['worker']._options = None
  _WORKLOADSCONFIG.fields_by_name['worker']._serialized_options = b'\340A\001'
  _ENVIRONMENT_LABELSENTRY._options = None
  _ENVIRONMENT_LABELSENTRY._serialized_options = b'8\001'
  _ENVIRONMENT.fields_by_name['uuid']._options = None
  _ENVIRONMENT.fields_by_name['uuid']._serialized_options = b'\340A\003'
  _ENVIRONMENT.fields_by_name['create_time']._options = None
  _ENVIRONMENT.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ENVIRONMENT.fields_by_name['update_time']._options = None
  _ENVIRONMENT.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _ENVIRONMENT.fields_by_name['labels']._options = None
  _ENVIRONMENT.fields_by_name['labels']._serialized_options = b'\340A\001'
  _ENVIRONMENT._options = None
  _ENVIRONMENT._serialized_options = b'\352Ai\n#composer.googleapis.com/Environment\022Bprojects/{project}/locations/{location}/environments/{environment}'
  _CHECKUPGRADERESPONSE_PYPIDEPENDENCIESENTRY._options = None
  _CHECKUPGRADERESPONSE_PYPIDEPENDENCIESENTRY._serialized_options = b'8\001'
  _CHECKUPGRADERESPONSE.fields_by_name['build_log_uri']._options = None
  _CHECKUPGRADERESPONSE.fields_by_name['build_log_uri']._serialized_options = b'\340A\003'
  _CHECKUPGRADERESPONSE.fields_by_name['contains_pypi_modules_conflict']._options = None
  _CHECKUPGRADERESPONSE.fields_by_name['contains_pypi_modules_conflict']._serialized_options = b'\340A\003'
  _CHECKUPGRADERESPONSE.fields_by_name['pypi_conflict_build_log_extract']._options = None
  _CHECKUPGRADERESPONSE.fields_by_name['pypi_conflict_build_log_extract']._serialized_options = b'\340A\003'
  _ENVIRONMENTS._options = None
  _ENVIRONMENTS._serialized_options = b'\312A\027composer.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _ENVIRONMENTS.methods_by_name['CreateEnvironment']._options = None
  _ENVIRONMENTS.methods_by_name['CreateEnvironment']._serialized_options = b'\202\323\344\223\002D\"5/v1beta1/{parent=projects/*/locations/*}/environments:\013environment\332A\022parent,environment\312AS\n\013Environment\022Dgoogle.cloud.orchestration.airflow.service.v1beta1.OperationMetadata'
  _ENVIRONMENTS.methods_by_name['GetEnvironment']._options = None
  _ENVIRONMENTS.methods_by_name['GetEnvironment']._serialized_options = b'\202\323\344\223\0027\0225/v1beta1/{name=projects/*/locations/*/environments/*}\332A\004name'
  _ENVIRONMENTS.methods_by_name['ListEnvironments']._options = None
  _ENVIRONMENTS.methods_by_name['ListEnvironments']._serialized_options = b'\202\323\344\223\0027\0225/v1beta1/{parent=projects/*/locations/*}/environments\332A\006parent'
  _ENVIRONMENTS.methods_by_name['UpdateEnvironment']._options = None
  _ENVIRONMENTS.methods_by_name['UpdateEnvironment']._serialized_options = b'\202\323\344\223\002D25/v1beta1/{name=projects/*/locations/*/environments/*}:\013environment\332A\034name,environment,update_mask\312AS\n\013Environment\022Dgoogle.cloud.orchestration.airflow.service.v1beta1.OperationMetadata'
  _ENVIRONMENTS.methods_by_name['DeleteEnvironment']._options = None
  _ENVIRONMENTS.methods_by_name['DeleteEnvironment']._serialized_options = b'\202\323\344\223\0027*5/v1beta1/{name=projects/*/locations/*/environments/*}\332A\004name\312A]\n\025google.protobuf.Empty\022Dgoogle.cloud.orchestration.airflow.service.v1beta1.OperationMetadata'
  _ENVIRONMENTS.methods_by_name['RestartWebServer']._options = None
  _ENVIRONMENTS.methods_by_name['RestartWebServer']._serialized_options = b'\202\323\344\223\002K\"F/v1beta1/{name=projects/*/locations/*/environments/*}:restartWebServer:\001*\312AS\n\013Environment\022Dgoogle.cloud.orchestration.airflow.service.v1beta1.OperationMetadata'
  _ENVIRONMENTS.methods_by_name['CheckUpgrade']._options = None
  _ENVIRONMENTS.methods_by_name['CheckUpgrade']._serialized_options = b'\202\323\344\223\002N\"I/v1beta1/{environment=projects/*/locations/*/environments/*}:checkUpgrade:\001*\312A\217\001\nGgoogle.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse\022Dgoogle.cloud.orchestration.airflow.service.v1beta1.OperationMetadata'
  _CREATEENVIRONMENTREQUEST._serialized_start=345
  _CREATEENVIRONMENTREQUEST._serialized_end=473
  _GETENVIRONMENTREQUEST._serialized_start=475
  _GETENVIRONMENTREQUEST._serialized_end=512
  _LISTENVIRONMENTSREQUEST._serialized_start=514
  _LISTENVIRONMENTSREQUEST._serialized_end=594
  _LISTENVIRONMENTSRESPONSE._serialized_start=597
  _LISTENVIRONMENTSRESPONSE._serialized_end=735
  _DELETEENVIRONMENTREQUEST._serialized_start=737
  _DELETEENVIRONMENTREQUEST._serialized_end=777
  _UPDATEENVIRONMENTREQUEST._serialized_start=780
  _UPDATEENVIRONMENTREQUEST._serialized_end=960
  _RESTARTWEBSERVERREQUEST._serialized_start=962
  _RESTARTWEBSERVERREQUEST._serialized_end=1001
  _ENVIRONMENTCONFIG._serialized_start=1004
  _ENVIRONMENTCONFIG._serialized_end=2310
  _ENVIRONMENTCONFIG_ENVIRONMENTSIZE._serialized_start=2174
  _ENVIRONMENTCONFIG_ENVIRONMENTSIZE._serialized_end=2310
  _WEBSERVERNETWORKACCESSCONTROL._serialized_start=2313
  _WEBSERVERNETWORKACCESSCONTROL._serialized_end=2528
  _WEBSERVERNETWORKACCESSCONTROL_ALLOWEDIPRANGE._serialized_start=2471
  _WEBSERVERNETWORKACCESSCONTROL_ALLOWEDIPRANGE._serialized_end=2528
  _SOFTWARECONFIG._serialized_start=2531
  _SOFTWARECONFIG._serialized_end=3132
  _SOFTWARECONFIG_AIRFLOWCONFIGOVERRIDESENTRY._serialized_start=2965
  _SOFTWARECONFIG_AIRFLOWCONFIGOVERRIDESENTRY._serialized_end=3026
  _SOFTWARECONFIG_PYPIPACKAGESENTRY._serialized_start=3028
  _SOFTWARECONFIG_PYPIPACKAGESENTRY._serialized_end=3079
  _SOFTWARECONFIG_ENVVARIABLESENTRY._serialized_start=3081
  _SOFTWARECONFIG_ENVVARIABLESENTRY._serialized_end=3132
  _IPALLOCATIONPOLICY._serialized_start=3135
  _IPALLOCATIONPOLICY._serialized_end=3348
  _NODECONFIG._serialized_start=3351
  _NODECONFIG._serialized_end=3702
  _PRIVATECLUSTERCONFIG._serialized_start=3705
  _PRIVATECLUSTERCONFIG._serialized_end=3843
  _PRIVATEENVIRONMENTCONFIG._serialized_start=3846
  _PRIVATEENVIRONMENTCONFIG._serialized_end=4260
  _DATABASECONFIG._serialized_start=4262
  _DATABASECONFIG._serialized_end=4305
  _WEBSERVERCONFIG._serialized_start=4307
  _WEBSERVERCONFIG._serialized_end=4351
  _ENCRYPTIONCONFIG._serialized_start=4353
  _ENCRYPTIONCONFIG._serialized_end=4398
  _MAINTENANCEWINDOW._serialized_start=4401
  _MAINTENANCEWINDOW._serialized_end=4549
  _WORKLOADSCONFIG._serialized_start=4552
  _WORKLOADSCONFIG._serialized_end=5227
  _WORKLOADSCONFIG_SCHEDULERRESOURCE._serialized_start=4899
  _WORKLOADSCONFIG_SCHEDULERRESOURCE._serialized_end=5005
  _WORKLOADSCONFIG_WEBSERVERRESOURCE._serialized_start=5007
  _WORKLOADSCONFIG_WEBSERVERRESOURCE._serialized_end=5093
  _WORKLOADSCONFIG_WORKERRESOURCE._serialized_start=5096
  _WORKLOADSCONFIG_WORKERRESOURCE._serialized_end=5227
  _ENVIRONMENT._serialized_start=5230
  _ENVIRONMENT._serialized_end=5910
  _ENVIRONMENT_LABELSENTRY._serialized_start=5657
  _ENVIRONMENT_LABELSENTRY._serialized_end=5702
  _ENVIRONMENT_STATE._serialized_start=5704
  _ENVIRONMENT_STATE._serialized_end=5800
  _CHECKUPGRADEREQUEST._serialized_start=5912
  _CHECKUPGRADEREQUEST._serialized_end=5977
  _CHECKUPGRADERESPONSE._serialized_start=5980
  _CHECKUPGRADERESPONSE._serialized_end=6496
  _CHECKUPGRADERESPONSE_PYPIDEPENDENCIESENTRY._serialized_start=6359
  _CHECKUPGRADERESPONSE_PYPIDEPENDENCIESENTRY._serialized_end=6414
  _CHECKUPGRADERESPONSE_CONFLICTRESULT._serialized_start=6416
  _CHECKUPGRADERESPONSE_CONFLICTRESULT._serialized_end=6496
  _ENVIRONMENTS._serialized_start=6499
  _ENVIRONMENTS._serialized_end=8659
# @@protoc_insertion_point(module_scope)
