# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/featurestore_service.proto
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
from google.cloud.aiplatform.v1 import entity_type_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_entity__type__pb2
from google.cloud.aiplatform.v1 import feature_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_feature__pb2
from google.cloud.aiplatform.v1 import feature_selector_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_feature__selector__pb2
from google.cloud.aiplatform.v1 import featurestore_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_featurestore__pb2
from google.cloud.aiplatform.v1 import io_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_io__pb2
from google.cloud.aiplatform.v1 import operation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_operation__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n5google/cloud/aiplatform/v1/featurestore_service.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a,google/cloud/aiplatform/v1/entity_type.proto\x1a(google/cloud/aiplatform/v1/feature.proto\x1a\x31google/cloud/aiplatform/v1/feature_selector.proto\x1a-google/cloud/aiplatform/v1/featurestore.proto\x1a#google/cloud/aiplatform/v1/io.proto\x1a*google/cloud/aiplatform/v1/operation.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xbe\x01\n\x19\x43reateFeaturestoreRequest\x12>\n\x06parent\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\x12&aiplatform.googleapis.com/Featurestore\x12\x43\n\x0c\x66\x65\x61turestore\x18\x02 \x01(\x0b\x32(.google.cloud.aiplatform.v1.FeaturestoreB\x03\xe0\x41\x02\x12\x1c\n\x0f\x66\x65\x61turestore_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"V\n\x16GetFeaturestoreRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&aiplatform.googleapis.com/Featurestore\"\xd2\x01\n\x18ListFeaturestoresRequest\x12>\n\x06parent\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\x12&aiplatform.googleapis.com/Featurestore\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\x12-\n\tread_mask\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"u\n\x19ListFeaturestoresResponse\x12?\n\rfeaturestores\x18\x01 \x03(\x0b\x32(.google.cloud.aiplatform.v1.Featurestore\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x91\x01\n\x19UpdateFeaturestoreRequest\x12\x43\n\x0c\x66\x65\x61turestore\x18\x01 \x01(\x0b\x32(.google.cloud.aiplatform.v1.FeaturestoreB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"h\n\x19\x44\x65leteFeaturestoreRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&aiplatform.googleapis.com/Featurestore\x12\r\n\x05\x66orce\x18\x02 \x01(\x08\"\x9e\x05\n\x1aImportFeatureValuesRequest\x12=\n\x0b\x61vro_source\x18\x02 \x01(\x0b\x32&.google.cloud.aiplatform.v1.AvroSourceH\x00\x12\x45\n\x0f\x62igquery_source\x18\x03 \x01(\x0b\x32*.google.cloud.aiplatform.v1.BigQuerySourceH\x00\x12;\n\ncsv_source\x18\x04 \x01(\x0b\x32%.google.cloud.aiplatform.v1.CsvSourceH\x00\x12\x1c\n\x12\x66\x65\x61ture_time_field\x18\x06 \x01(\tH\x01\x12\x32\n\x0c\x66\x65\x61ture_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x01\x12\x41\n\x0b\x65ntity_type\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$aiplatform.googleapis.com/EntityType\x12\x17\n\x0f\x65ntity_id_field\x18\x05 \x01(\t\x12^\n\rfeature_specs\x18\x08 \x03(\x0b\x32\x42.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpecB\x03\xe0\x41\x02\x12\x1e\n\x16\x64isable_online_serving\x18\t \x01(\x08\x12\x14\n\x0cworker_count\x18\x0b \x01(\x05\x12\"\n\x1a\x64isable_ingestion_analysis\x18\x0c \x01(\x08\x1a\x34\n\x0b\x46\x65\x61tureSpec\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x0csource_field\x18\x02 \x01(\tB\x08\n\x06sourceB\x15\n\x13\x66\x65\x61ture_time_source\"\xad\x01\n\x1bImportFeatureValuesResponse\x12\x1d\n\x15imported_entity_count\x18\x01 \x01(\x03\x12$\n\x1cimported_feature_value_count\x18\x02 \x01(\x03\x12\x19\n\x11invalid_row_count\x18\x06 \x01(\x03\x12.\n&timestamp_outside_retention_rows_count\x18\x04 \x01(\x03\"\xd1\x06\n\x1d\x42\x61tchReadFeatureValuesRequest\x12\x43\n\x12\x63sv_read_instances\x18\x03 \x01(\x0b\x32%.google.cloud.aiplatform.v1.CsvSourceH\x00\x12M\n\x17\x62igquery_read_instances\x18\x05 \x01(\x0b\x32*.google.cloud.aiplatform.v1.BigQuerySourceH\x00\x12\x44\n\x0c\x66\x65\x61turestore\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&aiplatform.googleapis.com/Featurestore\x12M\n\x0b\x64\x65stination\x18\x04 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1.FeatureValueDestinationB\x03\xe0\x41\x02\x12g\n\x13pass_through_fields\x18\x08 \x03(\x0b\x32J.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.PassThroughField\x12h\n\x11\x65ntity_type_specs\x18\x07 \x03(\x0b\x32H.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest.EntityTypeSpecB\x03\xe0\x41\x02\x12\x33\n\nstart_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x1a+\n\x10PassThroughField\x12\x17\n\nfield_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x1a\xc2\x01\n\x0e\x45ntityTypeSpec\x12\x1b\n\x0e\x65ntity_type_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12J\n\x10\x66\x65\x61ture_selector\x18\x02 \x01(\x0b\x32+.google.cloud.aiplatform.v1.FeatureSelectorB\x03\xe0\x41\x02\x12G\n\x08settings\x18\x03 \x03(\x0b\x32\x35.google.cloud.aiplatform.v1.DestinationFeatureSettingB\r\n\x0bread_option\"\xe8\x05\n\x1a\x45xportFeatureValuesRequest\x12`\n\x0fsnapshot_export\x18\x03 \x01(\x0b\x32\x45.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.SnapshotExportH\x00\x12X\n\x0b\x66ull_export\x18\x07 \x01(\x0b\x32\x41.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.FullExportH\x00\x12\x41\n\x0b\x65ntity_type\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$aiplatform.googleapis.com/EntityType\x12M\n\x0b\x64\x65stination\x18\x04 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1.FeatureValueDestinationB\x03\xe0\x41\x02\x12J\n\x10\x66\x65\x61ture_selector\x18\x05 \x01(\x0b\x32+.google.cloud.aiplatform.v1.FeatureSelectorB\x03\xe0\x41\x02\x12G\n\x08settings\x18\x06 \x03(\x0b\x32\x35.google.cloud.aiplatform.v1.DestinationFeatureSetting\x1as\n\x0eSnapshotExport\x12\x31\n\rsnapshot_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1aj\n\nFullExport\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x06\n\x04mode\"O\n\x19\x44\x65stinationFeatureSetting\x12\x17\n\nfeature_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x19\n\x11\x64\x65stination_field\x18\x02 \x01(\t\"\x91\x02\n\x17\x46\x65\x61tureValueDestination\x12O\n\x14\x62igquery_destination\x18\x01 \x01(\x0b\x32/.google.cloud.aiplatform.v1.BigQueryDestinationH\x00\x12O\n\x14tfrecord_destination\x18\x02 \x01(\x0b\x32/.google.cloud.aiplatform.v1.TFRecordDestinationH\x00\x12\x45\n\x0f\x63sv_destination\x18\x03 \x01(\x0b\x32*.google.cloud.aiplatform.v1.CsvDestinationH\x00\x42\r\n\x0b\x64\x65stination\"\x1d\n\x1b\x45xportFeatureValuesResponse\" \n\x1e\x42\x61tchReadFeatureValuesResponse\"\xb3\x01\n\x17\x43reateEntityTypeRequest\x12>\n\x06parent\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&aiplatform.googleapis.com/Featurestore\x12;\n\x0b\x65ntity_type\x18\x02 \x01(\x0b\x32&.google.cloud.aiplatform.v1.EntityType\x12\x1b\n\x0e\x65ntity_type_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"R\n\x14GetEntityTypeRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$aiplatform.googleapis.com/EntityType\"\xce\x01\n\x16ListEntityTypesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$aiplatform.googleapis.com/EntityType\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\x12-\n\tread_mask\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"p\n\x17ListEntityTypesResponse\x12<\n\x0c\x65ntity_types\x18\x01 \x03(\x0b\x32&.google.cloud.aiplatform.v1.EntityType\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8c\x01\n\x17UpdateEntityTypeRequest\x12@\n\x0b\x65ntity_type\x18\x01 \x01(\x0b\x32&.google.cloud.aiplatform.v1.EntityTypeB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"d\n\x17\x44\x65leteEntityTypeRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$aiplatform.googleapis.com/EntityType\x12\r\n\x05\x66orce\x18\x02 \x01(\x08\"\xa8\x01\n\x14\x43reateFeatureRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$aiplatform.googleapis.com/EntityType\x12\x39\n\x07\x66\x65\x61ture\x18\x02 \x01(\x0b\x32#.google.cloud.aiplatform.v1.FeatureB\x03\xe0\x41\x02\x12\x17\n\nfeature_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\xa3\x01\n\x1a\x42\x61tchCreateFeaturesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$aiplatform.googleapis.com/EntityType\x12G\n\x08requests\x18\x02 \x03(\x0b\x32\x30.google.cloud.aiplatform.v1.CreateFeatureRequestB\x03\xe0\x41\x02\"T\n\x1b\x42\x61tchCreateFeaturesResponse\x12\x35\n\x08\x66\x65\x61tures\x18\x01 \x03(\x0b\x32#.google.cloud.aiplatform.v1.Feature\"L\n\x11GetFeatureRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!aiplatform.googleapis.com/Feature\"\xe4\x01\n\x13ListFeaturesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\x12!aiplatform.googleapis.com/Feature\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\x12-\n\tread_mask\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x1a\n\x12latest_stats_count\x18\x07 \x01(\x05\"f\n\x14ListFeaturesResponse\x12\x35\n\x08\x66\x65\x61tures\x18\x01 \x03(\x0b\x32#.google.cloud.aiplatform.v1.Feature\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8a\x01\n\x15SearchFeaturesRequest\x12;\n\x08location\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\r\n\x05query\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x05 \x01(\t\"h\n\x16SearchFeaturesResponse\x12\x35\n\x08\x66\x65\x61tures\x18\x01 \x03(\x0b\x32#.google.cloud.aiplatform.v1.Feature\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x82\x01\n\x14UpdateFeatureRequest\x12\x39\n\x07\x66\x65\x61ture\x18\x01 \x01(\x0b\x32#.google.cloud.aiplatform.v1.FeatureB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"O\n\x14\x44\x65leteFeatureRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!aiplatform.googleapis.com/Feature\"u\n#CreateFeaturestoreOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\"u\n#UpdateFeaturestoreOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\"\x9b\x02\n$ImportFeatureValuesOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\x12\x1d\n\x15imported_entity_count\x18\x02 \x01(\x03\x12$\n\x1cimported_feature_value_count\x18\x03 \x01(\x03\x12\x13\n\x0bsource_uris\x18\x04 \x03(\t\x12\x19\n\x11invalid_row_count\x18\x06 \x01(\x03\x12.\n&timestamp_outside_retention_rows_count\x18\x07 \x01(\x03\"v\n$ExportFeatureValuesOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\"y\n\'BatchReadFeatureValuesOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\"s\n!CreateEntityTypeOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\"p\n\x1e\x43reateFeatureOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\"v\n$BatchCreateFeaturesOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata2\xbb\'\n\x13\x46\x65\x61turestoreService\x12\xa6\x02\n\x12\x43reateFeaturestore\x12\x35.google.cloud.aiplatform.v1.CreateFeaturestoreRequest\x1a\x1d.google.longrunning.Operation\"\xb9\x01\x82\xd3\xe4\x93\x02\x41\"1/v1/{parent=projects/*/locations/*}/featurestores:\x0c\x66\x65\x61turestore\xda\x41\x13parent,featurestore\xda\x41#parent,featurestore,featurestore_id\xca\x41\x33\n\x0c\x46\x65\x61turestore\x12#CreateFeaturestoreOperationMetadata\x12\xb1\x01\n\x0fGetFeaturestore\x12\x32.google.cloud.aiplatform.v1.GetFeaturestoreRequest\x1a(.google.cloud.aiplatform.v1.Featurestore\"@\x82\xd3\xe4\x93\x02\x33\x12\x31/v1/{name=projects/*/locations/*/featurestores/*}\xda\x41\x04name\x12\xc4\x01\n\x11ListFeaturestores\x12\x34.google.cloud.aiplatform.v1.ListFeaturestoresRequest\x1a\x35.google.cloud.aiplatform.v1.ListFeaturestoresResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1/{parent=projects/*/locations/*}/featurestores\xda\x41\x06parent\x12\x92\x02\n\x12UpdateFeaturestore\x12\x35.google.cloud.aiplatform.v1.UpdateFeaturestoreRequest\x1a\x1d.google.longrunning.Operation\"\xa5\x01\x82\xd3\xe4\x93\x02N2>/v1/{featurestore.name=projects/*/locations/*/featurestores/*}:\x0c\x66\x65\x61turestore\xda\x41\x18\x66\x65\x61turestore,update_mask\xca\x41\x33\n\x0c\x46\x65\x61turestore\x12#UpdateFeaturestoreOperationMetadata\x12\xed\x01\n\x12\x44\x65leteFeaturestore\x12\x35.google.cloud.aiplatform.v1.DeleteFeaturestoreRequest\x1a\x1d.google.longrunning.Operation\"\x80\x01\x82\xd3\xe4\x93\x02\x33*1/v1/{name=projects/*/locations/*/featurestores/*}\xda\x41\x04name\xda\x41\nname,force\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\xa8\x02\n\x10\x43reateEntityType\x12\x33.google.cloud.aiplatform.v1.CreateEntityTypeRequest\x1a\x1d.google.longrunning.Operation\"\xbf\x01\x82\xd3\xe4\x93\x02N\"?/v1/{parent=projects/*/locations/*/featurestores/*}/entityTypes:\x0b\x65ntity_type\xda\x41\x12parent,entity_type\xda\x41!parent,entity_type,entity_type_id\xca\x41/\n\nEntityType\x12!CreateEntityTypeOperationMetadata\x12\xb9\x01\n\rGetEntityType\x12\x30.google.cloud.aiplatform.v1.GetEntityTypeRequest\x1a&.google.cloud.aiplatform.v1.EntityType\"N\x82\xd3\xe4\x93\x02\x41\x12?/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*}\xda\x41\x04name\x12\xcc\x01\n\x0fListEntityTypes\x12\x32.google.cloud.aiplatform.v1.ListEntityTypesRequest\x1a\x33.google.cloud.aiplatform.v1.ListEntityTypesResponse\"P\x82\xd3\xe4\x93\x02\x41\x12?/v1/{parent=projects/*/locations/*/featurestores/*}/entityTypes\xda\x41\x06parent\x12\xeb\x01\n\x10UpdateEntityType\x12\x33.google.cloud.aiplatform.v1.UpdateEntityTypeRequest\x1a&.google.cloud.aiplatform.v1.EntityType\"z\x82\xd3\xe4\x93\x02Z2K/v1/{entity_type.name=projects/*/locations/*/featurestores/*/entityTypes/*}:\x0b\x65ntity_type\xda\x41\x17\x65ntity_type,update_mask\x12\xf7\x01\n\x10\x44\x65leteEntityType\x12\x33.google.cloud.aiplatform.v1.DeleteEntityTypeRequest\x1a\x1d.google.longrunning.Operation\"\x8e\x01\x82\xd3\xe4\x93\x02\x41*?/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*}\xda\x41\x04name\xda\x41\nname,force\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\x97\x02\n\rCreateFeature\x12\x30.google.cloud.aiplatform.v1.CreateFeatureRequest\x1a\x1d.google.longrunning.Operation\"\xb4\x01\x82\xd3\xe4\x93\x02U\"J/v1/{parent=projects/*/locations/*/featurestores/*/entityTypes/*}/features:\x07\x66\x65\x61ture\xda\x41\x0eparent,feature\xda\x41\x19parent,feature,feature_id\xca\x41)\n\x07\x46\x65\x61ture\x12\x1e\x43reateFeatureOperationMetadata\x12\xa8\x02\n\x13\x42\x61tchCreateFeatures\x12\x36.google.cloud.aiplatform.v1.BatchCreateFeaturesRequest\x1a\x1d.google.longrunning.Operation\"\xb9\x01\x82\xd3\xe4\x93\x02[\"V/v1/{parent=projects/*/locations/*/featurestores/*/entityTypes/*}/features:batchCreate:\x01*\xda\x41\x0fparent,requests\xca\x41\x43\n\x1b\x42\x61tchCreateFeaturesResponse\x12$BatchCreateFeaturesOperationMetadata\x12\xbb\x01\n\nGetFeature\x12-.google.cloud.aiplatform.v1.GetFeatureRequest\x1a#.google.cloud.aiplatform.v1.Feature\"Y\x82\xd3\xe4\x93\x02L\x12J/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*/features/*}\xda\x41\x04name\x12\xce\x01\n\x0cListFeatures\x12/.google.cloud.aiplatform.v1.ListFeaturesRequest\x1a\x30.google.cloud.aiplatform.v1.ListFeaturesResponse\"[\x82\xd3\xe4\x93\x02L\x12J/v1/{parent=projects/*/locations/*/featurestores/*/entityTypes/*}/features\xda\x41\x06parent\x12\xe1\x01\n\rUpdateFeature\x12\x30.google.cloud.aiplatform.v1.UpdateFeatureRequest\x1a#.google.cloud.aiplatform.v1.Feature\"y\x82\xd3\xe4\x93\x02]2R/v1/{feature.name=projects/*/locations/*/featurestores/*/entityTypes/*/features/*}:\x07\x66\x65\x61ture\xda\x41\x13\x66\x65\x61ture,update_mask\x12\xef\x01\n\rDeleteFeature\x12\x30.google.cloud.aiplatform.v1.DeleteFeatureRequest\x1a\x1d.google.longrunning.Operation\"\x8c\x01\x82\xd3\xe4\x93\x02L*J/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*/features/*}\xda\x41\x04name\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\xa8\x02\n\x13ImportFeatureValues\x12\x36.google.cloud.aiplatform.v1.ImportFeatureValuesRequest\x1a\x1d.google.longrunning.Operation\"\xb9\x01\x82\xd3\xe4\x93\x02_\"Z/v1/{entity_type=projects/*/locations/*/featurestores/*/entityTypes/*}:importFeatureValues:\x01*\xda\x41\x0b\x65ntity_type\xca\x41\x43\n\x1bImportFeatureValuesResponse\x12$ImportFeatureValuesOperationMetadata\x12\xab\x02\n\x16\x42\x61tchReadFeatureValues\x12\x39.google.cloud.aiplatform.v1.BatchReadFeatureValuesRequest\x1a\x1d.google.longrunning.Operation\"\xb6\x01\x82\xd3\xe4\x93\x02U\"P/v1/{featurestore=projects/*/locations/*/featurestores/*}:batchReadFeatureValues:\x01*\xda\x41\x0c\x66\x65\x61turestore\xca\x41I\n\x1e\x42\x61tchReadFeatureValuesResponse\x12\'BatchReadFeatureValuesOperationMetadata\x12\xa8\x02\n\x13\x45xportFeatureValues\x12\x36.google.cloud.aiplatform.v1.ExportFeatureValuesRequest\x1a\x1d.google.longrunning.Operation\"\xb9\x01\x82\xd3\xe4\x93\x02_\"Z/v1/{entity_type=projects/*/locations/*/featurestores/*/entityTypes/*}:exportFeatureValues:\x01*\xda\x41\x0b\x65ntity_type\xca\x41\x43\n\x1b\x45xportFeatureValuesResponse\x12$ExportFeatureValuesOperationMetadata\x12\xdf\x01\n\x0eSearchFeatures\x12\x31.google.cloud.aiplatform.v1.SearchFeaturesRequest\x1a\x32.google.cloud.aiplatform.v1.SearchFeaturesResponse\"f\x82\xd3\xe4\x93\x02\x44\x12\x42/v1/{location=projects/*/locations/*}/featurestores:searchFeatures\xda\x41\x08location\xda\x41\x0elocation,query\x1aM\xca\x41\x19\x61iplatform.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xdc\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x18\x46\x65\x61turestoreServiceProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.featurestore_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\030FeaturestoreServiceProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _CREATEFEATURESTOREREQUEST.fields_by_name['parent']._options = None
  _CREATEFEATURESTOREREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A(\022&aiplatform.googleapis.com/Featurestore'
  _CREATEFEATURESTOREREQUEST.fields_by_name['featurestore']._options = None
  _CREATEFEATURESTOREREQUEST.fields_by_name['featurestore']._serialized_options = b'\340A\002'
  _CREATEFEATURESTOREREQUEST.fields_by_name['featurestore_id']._options = None
  _CREATEFEATURESTOREREQUEST.fields_by_name['featurestore_id']._serialized_options = b'\340A\002'
  _GETFEATURESTOREREQUEST.fields_by_name['name']._options = None
  _GETFEATURESTOREREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A(\n&aiplatform.googleapis.com/Featurestore'
  _LISTFEATURESTORESREQUEST.fields_by_name['parent']._options = None
  _LISTFEATURESTORESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A(\022&aiplatform.googleapis.com/Featurestore'
  _UPDATEFEATURESTOREREQUEST.fields_by_name['featurestore']._options = None
  _UPDATEFEATURESTOREREQUEST.fields_by_name['featurestore']._serialized_options = b'\340A\002'
  _DELETEFEATURESTOREREQUEST.fields_by_name['name']._options = None
  _DELETEFEATURESTOREREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A(\n&aiplatform.googleapis.com/Featurestore'
  _IMPORTFEATUREVALUESREQUEST_FEATURESPEC.fields_by_name['id']._options = None
  _IMPORTFEATUREVALUESREQUEST_FEATURESPEC.fields_by_name['id']._serialized_options = b'\340A\002'
  _IMPORTFEATUREVALUESREQUEST.fields_by_name['entity_type']._options = None
  _IMPORTFEATUREVALUESREQUEST.fields_by_name['entity_type']._serialized_options = b'\340A\002\372A&\n$aiplatform.googleapis.com/EntityType'
  _IMPORTFEATUREVALUESREQUEST.fields_by_name['feature_specs']._options = None
  _IMPORTFEATUREVALUESREQUEST.fields_by_name['feature_specs']._serialized_options = b'\340A\002'
  _BATCHREADFEATUREVALUESREQUEST_PASSTHROUGHFIELD.fields_by_name['field_name']._options = None
  _BATCHREADFEATUREVALUESREQUEST_PASSTHROUGHFIELD.fields_by_name['field_name']._serialized_options = b'\340A\002'
  _BATCHREADFEATUREVALUESREQUEST_ENTITYTYPESPEC.fields_by_name['entity_type_id']._options = None
  _BATCHREADFEATUREVALUESREQUEST_ENTITYTYPESPEC.fields_by_name['entity_type_id']._serialized_options = b'\340A\002'
  _BATCHREADFEATUREVALUESREQUEST_ENTITYTYPESPEC.fields_by_name['feature_selector']._options = None
  _BATCHREADFEATUREVALUESREQUEST_ENTITYTYPESPEC.fields_by_name['feature_selector']._serialized_options = b'\340A\002'
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['featurestore']._options = None
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['featurestore']._serialized_options = b'\340A\002\372A(\n&aiplatform.googleapis.com/Featurestore'
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['destination']._options = None
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['destination']._serialized_options = b'\340A\002'
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['entity_type_specs']._options = None
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['entity_type_specs']._serialized_options = b'\340A\002'
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['start_time']._options = None
  _BATCHREADFEATUREVALUESREQUEST.fields_by_name['start_time']._serialized_options = b'\340A\001'
  _EXPORTFEATUREVALUESREQUEST.fields_by_name['entity_type']._options = None
  _EXPORTFEATUREVALUESREQUEST.fields_by_name['entity_type']._serialized_options = b'\340A\002\372A&\n$aiplatform.googleapis.com/EntityType'
  _EXPORTFEATUREVALUESREQUEST.fields_by_name['destination']._options = None
  _EXPORTFEATUREVALUESREQUEST.fields_by_name['destination']._serialized_options = b'\340A\002'
  _EXPORTFEATUREVALUESREQUEST.fields_by_name['feature_selector']._options = None
  _EXPORTFEATUREVALUESREQUEST.fields_by_name['feature_selector']._serialized_options = b'\340A\002'
  _DESTINATIONFEATURESETTING.fields_by_name['feature_id']._options = None
  _DESTINATIONFEATURESETTING.fields_by_name['feature_id']._serialized_options = b'\340A\002'
  _CREATEENTITYTYPEREQUEST.fields_by_name['parent']._options = None
  _CREATEENTITYTYPEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A(\n&aiplatform.googleapis.com/Featurestore'
  _CREATEENTITYTYPEREQUEST.fields_by_name['entity_type_id']._options = None
  _CREATEENTITYTYPEREQUEST.fields_by_name['entity_type_id']._serialized_options = b'\340A\002'
  _GETENTITYTYPEREQUEST.fields_by_name['name']._options = None
  _GETENTITYTYPEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$aiplatform.googleapis.com/EntityType'
  _LISTENTITYTYPESREQUEST.fields_by_name['parent']._options = None
  _LISTENTITYTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$aiplatform.googleapis.com/EntityType'
  _UPDATEENTITYTYPEREQUEST.fields_by_name['entity_type']._options = None
  _UPDATEENTITYTYPEREQUEST.fields_by_name['entity_type']._serialized_options = b'\340A\002'
  _DELETEENTITYTYPEREQUEST.fields_by_name['name']._options = None
  _DELETEENTITYTYPEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$aiplatform.googleapis.com/EntityType'
  _CREATEFEATUREREQUEST.fields_by_name['parent']._options = None
  _CREATEFEATUREREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$aiplatform.googleapis.com/EntityType'
  _CREATEFEATUREREQUEST.fields_by_name['feature']._options = None
  _CREATEFEATUREREQUEST.fields_by_name['feature']._serialized_options = b'\340A\002'
  _CREATEFEATUREREQUEST.fields_by_name['feature_id']._options = None
  _CREATEFEATUREREQUEST.fields_by_name['feature_id']._serialized_options = b'\340A\002'
  _BATCHCREATEFEATURESREQUEST.fields_by_name['parent']._options = None
  _BATCHCREATEFEATURESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$aiplatform.googleapis.com/EntityType'
  _BATCHCREATEFEATURESREQUEST.fields_by_name['requests']._options = None
  _BATCHCREATEFEATURESREQUEST.fields_by_name['requests']._serialized_options = b'\340A\002'
  _GETFEATUREREQUEST.fields_by_name['name']._options = None
  _GETFEATUREREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!aiplatform.googleapis.com/Feature'
  _LISTFEATURESREQUEST.fields_by_name['parent']._options = None
  _LISTFEATURESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\022!aiplatform.googleapis.com/Feature'
  _SEARCHFEATURESREQUEST.fields_by_name['location']._options = None
  _SEARCHFEATURESREQUEST.fields_by_name['location']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _UPDATEFEATUREREQUEST.fields_by_name['feature']._options = None
  _UPDATEFEATUREREQUEST.fields_by_name['feature']._serialized_options = b'\340A\002'
  _DELETEFEATUREREQUEST.fields_by_name['name']._options = None
  _DELETEFEATUREREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!aiplatform.googleapis.com/Feature'
  _FEATURESTORESERVICE._options = None
  _FEATURESTORESERVICE._serialized_options = b'\312A\031aiplatform.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _FEATURESTORESERVICE.methods_by_name['CreateFeaturestore']._options = None
  _FEATURESTORESERVICE.methods_by_name['CreateFeaturestore']._serialized_options = b'\202\323\344\223\002A\"1/v1/{parent=projects/*/locations/*}/featurestores:\014featurestore\332A\023parent,featurestore\332A#parent,featurestore,featurestore_id\312A3\n\014Featurestore\022#CreateFeaturestoreOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['GetFeaturestore']._options = None
  _FEATURESTORESERVICE.methods_by_name['GetFeaturestore']._serialized_options = b'\202\323\344\223\0023\0221/v1/{name=projects/*/locations/*/featurestores/*}\332A\004name'
  _FEATURESTORESERVICE.methods_by_name['ListFeaturestores']._options = None
  _FEATURESTORESERVICE.methods_by_name['ListFeaturestores']._serialized_options = b'\202\323\344\223\0023\0221/v1/{parent=projects/*/locations/*}/featurestores\332A\006parent'
  _FEATURESTORESERVICE.methods_by_name['UpdateFeaturestore']._options = None
  _FEATURESTORESERVICE.methods_by_name['UpdateFeaturestore']._serialized_options = b'\202\323\344\223\002N2>/v1/{featurestore.name=projects/*/locations/*/featurestores/*}:\014featurestore\332A\030featurestore,update_mask\312A3\n\014Featurestore\022#UpdateFeaturestoreOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['DeleteFeaturestore']._options = None
  _FEATURESTORESERVICE.methods_by_name['DeleteFeaturestore']._serialized_options = b'\202\323\344\223\0023*1/v1/{name=projects/*/locations/*/featurestores/*}\332A\004name\332A\nname,force\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['CreateEntityType']._options = None
  _FEATURESTORESERVICE.methods_by_name['CreateEntityType']._serialized_options = b'\202\323\344\223\002N\"?/v1/{parent=projects/*/locations/*/featurestores/*}/entityTypes:\013entity_type\332A\022parent,entity_type\332A!parent,entity_type,entity_type_id\312A/\n\nEntityType\022!CreateEntityTypeOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['GetEntityType']._options = None
  _FEATURESTORESERVICE.methods_by_name['GetEntityType']._serialized_options = b'\202\323\344\223\002A\022?/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*}\332A\004name'
  _FEATURESTORESERVICE.methods_by_name['ListEntityTypes']._options = None
  _FEATURESTORESERVICE.methods_by_name['ListEntityTypes']._serialized_options = b'\202\323\344\223\002A\022?/v1/{parent=projects/*/locations/*/featurestores/*}/entityTypes\332A\006parent'
  _FEATURESTORESERVICE.methods_by_name['UpdateEntityType']._options = None
  _FEATURESTORESERVICE.methods_by_name['UpdateEntityType']._serialized_options = b'\202\323\344\223\002Z2K/v1/{entity_type.name=projects/*/locations/*/featurestores/*/entityTypes/*}:\013entity_type\332A\027entity_type,update_mask'
  _FEATURESTORESERVICE.methods_by_name['DeleteEntityType']._options = None
  _FEATURESTORESERVICE.methods_by_name['DeleteEntityType']._serialized_options = b'\202\323\344\223\002A*?/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*}\332A\004name\332A\nname,force\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['CreateFeature']._options = None
  _FEATURESTORESERVICE.methods_by_name['CreateFeature']._serialized_options = b'\202\323\344\223\002U\"J/v1/{parent=projects/*/locations/*/featurestores/*/entityTypes/*}/features:\007feature\332A\016parent,feature\332A\031parent,feature,feature_id\312A)\n\007Feature\022\036CreateFeatureOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['BatchCreateFeatures']._options = None
  _FEATURESTORESERVICE.methods_by_name['BatchCreateFeatures']._serialized_options = b'\202\323\344\223\002[\"V/v1/{parent=projects/*/locations/*/featurestores/*/entityTypes/*}/features:batchCreate:\001*\332A\017parent,requests\312AC\n\033BatchCreateFeaturesResponse\022$BatchCreateFeaturesOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['GetFeature']._options = None
  _FEATURESTORESERVICE.methods_by_name['GetFeature']._serialized_options = b'\202\323\344\223\002L\022J/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*/features/*}\332A\004name'
  _FEATURESTORESERVICE.methods_by_name['ListFeatures']._options = None
  _FEATURESTORESERVICE.methods_by_name['ListFeatures']._serialized_options = b'\202\323\344\223\002L\022J/v1/{parent=projects/*/locations/*/featurestores/*/entityTypes/*}/features\332A\006parent'
  _FEATURESTORESERVICE.methods_by_name['UpdateFeature']._options = None
  _FEATURESTORESERVICE.methods_by_name['UpdateFeature']._serialized_options = b'\202\323\344\223\002]2R/v1/{feature.name=projects/*/locations/*/featurestores/*/entityTypes/*/features/*}:\007feature\332A\023feature,update_mask'
  _FEATURESTORESERVICE.methods_by_name['DeleteFeature']._options = None
  _FEATURESTORESERVICE.methods_by_name['DeleteFeature']._serialized_options = b'\202\323\344\223\002L*J/v1/{name=projects/*/locations/*/featurestores/*/entityTypes/*/features/*}\332A\004name\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['ImportFeatureValues']._options = None
  _FEATURESTORESERVICE.methods_by_name['ImportFeatureValues']._serialized_options = b'\202\323\344\223\002_\"Z/v1/{entity_type=projects/*/locations/*/featurestores/*/entityTypes/*}:importFeatureValues:\001*\332A\013entity_type\312AC\n\033ImportFeatureValuesResponse\022$ImportFeatureValuesOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['BatchReadFeatureValues']._options = None
  _FEATURESTORESERVICE.methods_by_name['BatchReadFeatureValues']._serialized_options = b'\202\323\344\223\002U\"P/v1/{featurestore=projects/*/locations/*/featurestores/*}:batchReadFeatureValues:\001*\332A\014featurestore\312AI\n\036BatchReadFeatureValuesResponse\022\'BatchReadFeatureValuesOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['ExportFeatureValues']._options = None
  _FEATURESTORESERVICE.methods_by_name['ExportFeatureValues']._serialized_options = b'\202\323\344\223\002_\"Z/v1/{entity_type=projects/*/locations/*/featurestores/*/entityTypes/*}:exportFeatureValues:\001*\332A\013entity_type\312AC\n\033ExportFeatureValuesResponse\022$ExportFeatureValuesOperationMetadata'
  _FEATURESTORESERVICE.methods_by_name['SearchFeatures']._options = None
  _FEATURESTORESERVICE.methods_by_name['SearchFeatures']._serialized_options = b'\202\323\344\223\002D\022B/v1/{location=projects/*/locations/*}/featurestores:searchFeatures\332A\010location\332A\016location,query'
  _CREATEFEATURESTOREREQUEST._serialized_start=572
  _CREATEFEATURESTOREREQUEST._serialized_end=762
  _GETFEATURESTOREREQUEST._serialized_start=764
  _GETFEATURESTOREREQUEST._serialized_end=850
  _LISTFEATURESTORESREQUEST._serialized_start=853
  _LISTFEATURESTORESREQUEST._serialized_end=1063
  _LISTFEATURESTORESRESPONSE._serialized_start=1065
  _LISTFEATURESTORESRESPONSE._serialized_end=1182
  _UPDATEFEATURESTOREREQUEST._serialized_start=1185
  _UPDATEFEATURESTOREREQUEST._serialized_end=1330
  _DELETEFEATURESTOREREQUEST._serialized_start=1332
  _DELETEFEATURESTOREREQUEST._serialized_end=1436
  _IMPORTFEATUREVALUESREQUEST._serialized_start=1439
  _IMPORTFEATUREVALUESREQUEST._serialized_end=2109
  _IMPORTFEATUREVALUESREQUEST_FEATURESPEC._serialized_start=2024
  _IMPORTFEATUREVALUESREQUEST_FEATURESPEC._serialized_end=2076
  _IMPORTFEATUREVALUESRESPONSE._serialized_start=2112
  _IMPORTFEATUREVALUESRESPONSE._serialized_end=2285
  _BATCHREADFEATUREVALUESREQUEST._serialized_start=2288
  _BATCHREADFEATUREVALUESREQUEST._serialized_end=3137
  _BATCHREADFEATUREVALUESREQUEST_PASSTHROUGHFIELD._serialized_start=2882
  _BATCHREADFEATUREVALUESREQUEST_PASSTHROUGHFIELD._serialized_end=2925
  _BATCHREADFEATUREVALUESREQUEST_ENTITYTYPESPEC._serialized_start=2928
  _BATCHREADFEATUREVALUESREQUEST_ENTITYTYPESPEC._serialized_end=3122
  _EXPORTFEATUREVALUESREQUEST._serialized_start=3140
  _EXPORTFEATUREVALUESREQUEST._serialized_end=3884
  _EXPORTFEATUREVALUESREQUEST_SNAPSHOTEXPORT._serialized_start=3653
  _EXPORTFEATUREVALUESREQUEST_SNAPSHOTEXPORT._serialized_end=3768
  _EXPORTFEATUREVALUESREQUEST_FULLEXPORT._serialized_start=3770
  _EXPORTFEATUREVALUESREQUEST_FULLEXPORT._serialized_end=3876
  _DESTINATIONFEATURESETTING._serialized_start=3886
  _DESTINATIONFEATURESETTING._serialized_end=3965
  _FEATUREVALUEDESTINATION._serialized_start=3968
  _FEATUREVALUEDESTINATION._serialized_end=4241
  _EXPORTFEATUREVALUESRESPONSE._serialized_start=4243
  _EXPORTFEATUREVALUESRESPONSE._serialized_end=4272
  _BATCHREADFEATUREVALUESRESPONSE._serialized_start=4274
  _BATCHREADFEATUREVALUESRESPONSE._serialized_end=4306
  _CREATEENTITYTYPEREQUEST._serialized_start=4309
  _CREATEENTITYTYPEREQUEST._serialized_end=4488
  _GETENTITYTYPEREQUEST._serialized_start=4490
  _GETENTITYTYPEREQUEST._serialized_end=4572
  _LISTENTITYTYPESREQUEST._serialized_start=4575
  _LISTENTITYTYPESREQUEST._serialized_end=4781
  _LISTENTITYTYPESRESPONSE._serialized_start=4783
  _LISTENTITYTYPESRESPONSE._serialized_end=4895
  _UPDATEENTITYTYPEREQUEST._serialized_start=4898
  _UPDATEENTITYTYPEREQUEST._serialized_end=5038
  _DELETEENTITYTYPEREQUEST._serialized_start=5040
  _DELETEENTITYTYPEREQUEST._serialized_end=5140
  _CREATEFEATUREREQUEST._serialized_start=5143
  _CREATEFEATUREREQUEST._serialized_end=5311
  _BATCHCREATEFEATURESREQUEST._serialized_start=5314
  _BATCHCREATEFEATURESREQUEST._serialized_end=5477
  _BATCHCREATEFEATURESRESPONSE._serialized_start=5479
  _BATCHCREATEFEATURESRESPONSE._serialized_end=5563
  _GETFEATUREREQUEST._serialized_start=5565
  _GETFEATUREREQUEST._serialized_end=5641
  _LISTFEATURESREQUEST._serialized_start=5644
  _LISTFEATURESREQUEST._serialized_end=5872
  _LISTFEATURESRESPONSE._serialized_start=5874
  _LISTFEATURESRESPONSE._serialized_end=5976
  _SEARCHFEATURESREQUEST._serialized_start=5979
  _SEARCHFEATURESREQUEST._serialized_end=6117
  _SEARCHFEATURESRESPONSE._serialized_start=6119
  _SEARCHFEATURESRESPONSE._serialized_end=6223
  _UPDATEFEATUREREQUEST._serialized_start=6226
  _UPDATEFEATUREREQUEST._serialized_end=6356
  _DELETEFEATUREREQUEST._serialized_start=6358
  _DELETEFEATUREREQUEST._serialized_end=6437
  _CREATEFEATURESTOREOPERATIONMETADATA._serialized_start=6439
  _CREATEFEATURESTOREOPERATIONMETADATA._serialized_end=6556
  _UPDATEFEATURESTOREOPERATIONMETADATA._serialized_start=6558
  _UPDATEFEATURESTOREOPERATIONMETADATA._serialized_end=6675
  _IMPORTFEATUREVALUESOPERATIONMETADATA._serialized_start=6678
  _IMPORTFEATUREVALUESOPERATIONMETADATA._serialized_end=6961
  _EXPORTFEATUREVALUESOPERATIONMETADATA._serialized_start=6963
  _EXPORTFEATUREVALUESOPERATIONMETADATA._serialized_end=7081
  _BATCHREADFEATUREVALUESOPERATIONMETADATA._serialized_start=7083
  _BATCHREADFEATUREVALUESOPERATIONMETADATA._serialized_end=7204
  _CREATEENTITYTYPEOPERATIONMETADATA._serialized_start=7206
  _CREATEENTITYTYPEOPERATIONMETADATA._serialized_end=7321
  _CREATEFEATUREOPERATIONMETADATA._serialized_start=7323
  _CREATEFEATUREOPERATIONMETADATA._serialized_end=7435
  _BATCHCREATEFEATURESOPERATIONMETADATA._serialized_start=7437
  _BATCHCREATEFEATURESOPERATIONMETADATA._serialized_end=7555
  _FEATURESTORESERVICE._serialized_start=7558
  _FEATURESTORESERVICE._serialized_end=12609
# @@protoc_insertion_point(module_scope)