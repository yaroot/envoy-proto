# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1beta1/operations.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.automl.v1beta1 import io_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_io__pb2
from google.cloud.automl.v1beta1 import model_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_model__pb2
from google.cloud.automl.v1beta1 import model_evaluation_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_model__evaluation__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/automl/v1beta1/operations.proto',
  package='google.cloud.automl.v1beta1',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.automl.v1beta1P\001ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,google/cloud/automl/v1beta1/operations.proto\x12\x1bgoogle.cloud.automl.v1beta1\x1a$google/cloud/automl/v1beta1/io.proto\x1a\'google/cloud/automl/v1beta1/model.proto\x1a\x32google/cloud/automl/v1beta1/model_evaluation.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x1cgoogle/api/annotations.proto\"\x8b\x08\n\x11OperationMetadata\x12N\n\x0e\x64\x65lete_details\x18\x08 \x01(\x0b\x32\x34.google.cloud.automl.v1beta1.DeleteOperationMetadataH\x00\x12Y\n\x14\x64\x65ploy_model_details\x18\x18 \x01(\x0b\x32\x39.google.cloud.automl.v1beta1.DeployModelOperationMetadataH\x00\x12]\n\x16undeploy_model_details\x18\x19 \x01(\x0b\x32;.google.cloud.automl.v1beta1.UndeployModelOperationMetadataH\x00\x12Y\n\x14\x63reate_model_details\x18\n \x01(\x0b\x32\x39.google.cloud.automl.v1beta1.CreateModelOperationMetadataH\x00\x12W\n\x13import_data_details\x18\x0f \x01(\x0b\x32\x38.google.cloud.automl.v1beta1.ImportDataOperationMetadataH\x00\x12[\n\x15\x62\x61tch_predict_details\x18\x10 \x01(\x0b\x32:.google.cloud.automl.v1beta1.BatchPredictOperationMetadataH\x00\x12W\n\x13\x65xport_data_details\x18\x15 \x01(\x0b\x32\x38.google.cloud.automl.v1beta1.ExportDataOperationMetadataH\x00\x12Y\n\x14\x65xport_model_details\x18\x16 \x01(\x0b\x32\x39.google.cloud.automl.v1beta1.ExportModelOperationMetadataH\x00\x12r\n!export_evaluated_examples_details\x18\x1a \x01(\x0b\x32\x45.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadataH\x00\x12\x18\n\x10progress_percent\x18\r \x01(\x05\x12,\n\x10partial_failures\x18\x02 \x03(\x0b\x32\x12.google.rpc.Status\x12/\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\t\n\x07\x64\x65tails\"\x19\n\x17\x44\x65leteOperationMetadata\"\x1e\n\x1c\x44\x65ployModelOperationMetadata\" \n\x1eUndeployModelOperationMetadata\"\x1e\n\x1c\x43reateModelOperationMetadata\"\x1d\n\x1bImportDataOperationMetadata\"\xef\x01\n\x1b\x45xportDataOperationMetadata\x12\x62\n\x0boutput_info\x18\x01 \x01(\x0b\x32M.google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo\x1al\n\x14\x45xportDataOutputInfo\x12\x1e\n\x14gcs_output_directory\x18\x01 \x01(\tH\x00\x12!\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tH\x00\x42\x11\n\x0foutput_location\"\xc3\x02\n\x1d\x42\x61tchPredictOperationMetadata\x12J\n\x0cinput_config\x18\x01 \x01(\x0b\x32\x34.google.cloud.automl.v1beta1.BatchPredictInputConfig\x12\x66\n\x0boutput_info\x18\x02 \x01(\x0b\x32Q.google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo\x1an\n\x16\x42\x61tchPredictOutputInfo\x12\x1e\n\x14gcs_output_directory\x18\x01 \x01(\tH\x00\x12!\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tH\x00\x42\x11\n\x0foutput_location\"\xbb\x01\n\x1c\x45xportModelOperationMetadata\x12\x64\n\x0boutput_info\x18\x02 \x01(\x0b\x32O.google.cloud.automl.v1beta1.ExportModelOperationMetadata.ExportModelOutputInfo\x1a\x35\n\x15\x45xportModelOutputInfo\x12\x1c\n\x14gcs_output_directory\x18\x01 \x01(\t\"\xee\x01\n(ExportEvaluatedExamplesOperationMetadata\x12|\n\x0boutput_info\x18\x02 \x01(\x0b\x32g.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo\x1a\x44\n!ExportEvaluatedExamplesOutputInfo\x12\x1f\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tB\xa5\x01\n\x1f\x63om.google.cloud.automl.v1beta1P\x01ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\xca\x02\x1bGoogle\\Cloud\\AutoMl\\V1beta1\xea\x02\x1eGoogle::Cloud::AutoML::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_cloud_dot_automl_dot_v1beta1_dot_io__pb2.DESCRIPTOR,google_dot_cloud_dot_automl_dot_v1beta1_dot_model__pb2.DESCRIPTOR,google_dot_cloud_dot_automl_dot_v1beta1_dot_model__evaluation__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_OPERATIONMETADATA = _descriptor.Descriptor(
  name='OperationMetadata',
  full_name='google.cloud.automl.v1beta1.OperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='delete_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.delete_details', index=0,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='deploy_model_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.deploy_model_details', index=1,
      number=24, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='undeploy_model_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.undeploy_model_details', index=2,
      number=25, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_model_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.create_model_details', index=3,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='import_data_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.import_data_details', index=4,
      number=15, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='batch_predict_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.batch_predict_details', index=5,
      number=16, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='export_data_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.export_data_details', index=6,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='export_model_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.export_model_details', index=7,
      number=22, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='export_evaluated_examples_details', full_name='google.cloud.automl.v1beta1.OperationMetadata.export_evaluated_examples_details', index=8,
      number=26, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='progress_percent', full_name='google.cloud.automl.v1beta1.OperationMetadata.progress_percent', index=9,
      number=13, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failures', full_name='google.cloud.automl.v1beta1.OperationMetadata.partial_failures', index=10,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.automl.v1beta1.OperationMetadata.create_time', index=11,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.automl.v1beta1.OperationMetadata.update_time', index=12,
      number=4, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='details', full_name='google.cloud.automl.v1beta1.OperationMetadata.details',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=326,
  serialized_end=1361,
)


_DELETEOPERATIONMETADATA = _descriptor.Descriptor(
  name='DeleteOperationMetadata',
  full_name='google.cloud.automl.v1beta1.DeleteOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=1363,
  serialized_end=1388,
)


_DEPLOYMODELOPERATIONMETADATA = _descriptor.Descriptor(
  name='DeployModelOperationMetadata',
  full_name='google.cloud.automl.v1beta1.DeployModelOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=1390,
  serialized_end=1420,
)


_UNDEPLOYMODELOPERATIONMETADATA = _descriptor.Descriptor(
  name='UndeployModelOperationMetadata',
  full_name='google.cloud.automl.v1beta1.UndeployModelOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=1422,
  serialized_end=1454,
)


_CREATEMODELOPERATIONMETADATA = _descriptor.Descriptor(
  name='CreateModelOperationMetadata',
  full_name='google.cloud.automl.v1beta1.CreateModelOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=1456,
  serialized_end=1486,
)


_IMPORTDATAOPERATIONMETADATA = _descriptor.Descriptor(
  name='ImportDataOperationMetadata',
  full_name='google.cloud.automl.v1beta1.ImportDataOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=1488,
  serialized_end=1517,
)


_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO = _descriptor.Descriptor(
  name='ExportDataOutputInfo',
  full_name='google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='gcs_output_directory', full_name='google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo.gcs_output_directory', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bigquery_output_dataset', full_name='google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo.bigquery_output_dataset', index=1,
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
    _descriptor.OneofDescriptor(
      name='output_location', full_name='google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo.output_location',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1651,
  serialized_end=1759,
)

_EXPORTDATAOPERATIONMETADATA = _descriptor.Descriptor(
  name='ExportDataOperationMetadata',
  full_name='google.cloud.automl.v1beta1.ExportDataOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='output_info', full_name='google.cloud.automl.v1beta1.ExportDataOperationMetadata.output_info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1520,
  serialized_end=1759,
)


_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO = _descriptor.Descriptor(
  name='BatchPredictOutputInfo',
  full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='gcs_output_directory', full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo.gcs_output_directory', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bigquery_output_dataset', full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo.bigquery_output_dataset', index=1,
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
    _descriptor.OneofDescriptor(
      name='output_location', full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo.output_location',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1975,
  serialized_end=2085,
)

_BATCHPREDICTOPERATIONMETADATA = _descriptor.Descriptor(
  name='BatchPredictOperationMetadata',
  full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='input_config', full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata.input_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='output_info', full_name='google.cloud.automl.v1beta1.BatchPredictOperationMetadata.output_info', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1762,
  serialized_end=2085,
)


_EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO = _descriptor.Descriptor(
  name='ExportModelOutputInfo',
  full_name='google.cloud.automl.v1beta1.ExportModelOperationMetadata.ExportModelOutputInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='gcs_output_directory', full_name='google.cloud.automl.v1beta1.ExportModelOperationMetadata.ExportModelOutputInfo.gcs_output_directory', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=2222,
  serialized_end=2275,
)

_EXPORTMODELOPERATIONMETADATA = _descriptor.Descriptor(
  name='ExportModelOperationMetadata',
  full_name='google.cloud.automl.v1beta1.ExportModelOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='output_info', full_name='google.cloud.automl.v1beta1.ExportModelOperationMetadata.output_info', index=0,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2088,
  serialized_end=2275,
)


_EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO = _descriptor.Descriptor(
  name='ExportEvaluatedExamplesOutputInfo',
  full_name='google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='bigquery_output_dataset', full_name='google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo.bigquery_output_dataset', index=0,
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
  serialized_start=2448,
  serialized_end=2516,
)

_EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA = _descriptor.Descriptor(
  name='ExportEvaluatedExamplesOperationMetadata',
  full_name='google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='output_info', full_name='google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.output_info', index=0,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2278,
  serialized_end=2516,
)

_OPERATIONMETADATA.fields_by_name['delete_details'].message_type = _DELETEOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['deploy_model_details'].message_type = _DEPLOYMODELOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['undeploy_model_details'].message_type = _UNDEPLOYMODELOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['create_model_details'].message_type = _CREATEMODELOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['import_data_details'].message_type = _IMPORTDATAOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['batch_predict_details'].message_type = _BATCHPREDICTOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['export_data_details'].message_type = _EXPORTDATAOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['export_model_details'].message_type = _EXPORTMODELOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['export_evaluated_examples_details'].message_type = _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA
_OPERATIONMETADATA.fields_by_name['partial_failures'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_OPERATIONMETADATA.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_OPERATIONMETADATA.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['delete_details'])
_OPERATIONMETADATA.fields_by_name['delete_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['deploy_model_details'])
_OPERATIONMETADATA.fields_by_name['deploy_model_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['undeploy_model_details'])
_OPERATIONMETADATA.fields_by_name['undeploy_model_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['create_model_details'])
_OPERATIONMETADATA.fields_by_name['create_model_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['import_data_details'])
_OPERATIONMETADATA.fields_by_name['import_data_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['batch_predict_details'])
_OPERATIONMETADATA.fields_by_name['batch_predict_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['export_data_details'])
_OPERATIONMETADATA.fields_by_name['export_data_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['export_model_details'])
_OPERATIONMETADATA.fields_by_name['export_model_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_OPERATIONMETADATA.oneofs_by_name['details'].fields.append(
  _OPERATIONMETADATA.fields_by_name['export_evaluated_examples_details'])
_OPERATIONMETADATA.fields_by_name['export_evaluated_examples_details'].containing_oneof = _OPERATIONMETADATA.oneofs_by_name['details']
_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.containing_type = _EXPORTDATAOPERATIONMETADATA
_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.oneofs_by_name['output_location'].fields.append(
  _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.fields_by_name['gcs_output_directory'])
_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.fields_by_name['gcs_output_directory'].containing_oneof = _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.oneofs_by_name['output_location']
_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.oneofs_by_name['output_location'].fields.append(
  _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.fields_by_name['bigquery_output_dataset'])
_EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.fields_by_name['bigquery_output_dataset'].containing_oneof = _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO.oneofs_by_name['output_location']
_EXPORTDATAOPERATIONMETADATA.fields_by_name['output_info'].message_type = _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO
_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.containing_type = _BATCHPREDICTOPERATIONMETADATA
_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.oneofs_by_name['output_location'].fields.append(
  _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.fields_by_name['gcs_output_directory'])
_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.fields_by_name['gcs_output_directory'].containing_oneof = _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.oneofs_by_name['output_location']
_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.oneofs_by_name['output_location'].fields.append(
  _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.fields_by_name['bigquery_output_dataset'])
_BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.fields_by_name['bigquery_output_dataset'].containing_oneof = _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO.oneofs_by_name['output_location']
_BATCHPREDICTOPERATIONMETADATA.fields_by_name['input_config'].message_type = google_dot_cloud_dot_automl_dot_v1beta1_dot_io__pb2._BATCHPREDICTINPUTCONFIG
_BATCHPREDICTOPERATIONMETADATA.fields_by_name['output_info'].message_type = _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO
_EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO.containing_type = _EXPORTMODELOPERATIONMETADATA
_EXPORTMODELOPERATIONMETADATA.fields_by_name['output_info'].message_type = _EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO
_EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO.containing_type = _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA
_EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA.fields_by_name['output_info'].message_type = _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO
DESCRIPTOR.message_types_by_name['OperationMetadata'] = _OPERATIONMETADATA
DESCRIPTOR.message_types_by_name['DeleteOperationMetadata'] = _DELETEOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['DeployModelOperationMetadata'] = _DEPLOYMODELOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['UndeployModelOperationMetadata'] = _UNDEPLOYMODELOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['CreateModelOperationMetadata'] = _CREATEMODELOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['ImportDataOperationMetadata'] = _IMPORTDATAOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['ExportDataOperationMetadata'] = _EXPORTDATAOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['BatchPredictOperationMetadata'] = _BATCHPREDICTOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['ExportModelOperationMetadata'] = _EXPORTMODELOPERATIONMETADATA
DESCRIPTOR.message_types_by_name['ExportEvaluatedExamplesOperationMetadata'] = _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OperationMetadata = _reflection.GeneratedProtocolMessageType('OperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _OPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.OperationMetadata)
  })
_sym_db.RegisterMessage(OperationMetadata)

DeleteOperationMetadata = _reflection.GeneratedProtocolMessageType('DeleteOperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _DELETEOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.DeleteOperationMetadata)
  })
_sym_db.RegisterMessage(DeleteOperationMetadata)

DeployModelOperationMetadata = _reflection.GeneratedProtocolMessageType('DeployModelOperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _DEPLOYMODELOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.DeployModelOperationMetadata)
  })
_sym_db.RegisterMessage(DeployModelOperationMetadata)

UndeployModelOperationMetadata = _reflection.GeneratedProtocolMessageType('UndeployModelOperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _UNDEPLOYMODELOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.UndeployModelOperationMetadata)
  })
_sym_db.RegisterMessage(UndeployModelOperationMetadata)

CreateModelOperationMetadata = _reflection.GeneratedProtocolMessageType('CreateModelOperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _CREATEMODELOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.CreateModelOperationMetadata)
  })
_sym_db.RegisterMessage(CreateModelOperationMetadata)

ImportDataOperationMetadata = _reflection.GeneratedProtocolMessageType('ImportDataOperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _IMPORTDATAOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ImportDataOperationMetadata)
  })
_sym_db.RegisterMessage(ImportDataOperationMetadata)

ExportDataOperationMetadata = _reflection.GeneratedProtocolMessageType('ExportDataOperationMetadata', (_message.Message,), {

  'ExportDataOutputInfo' : _reflection.GeneratedProtocolMessageType('ExportDataOutputInfo', (_message.Message,), {
    'DESCRIPTOR' : _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO,
    '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo)
    })
  ,
  'DESCRIPTOR' : _EXPORTDATAOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExportDataOperationMetadata)
  })
_sym_db.RegisterMessage(ExportDataOperationMetadata)
_sym_db.RegisterMessage(ExportDataOperationMetadata.ExportDataOutputInfo)

BatchPredictOperationMetadata = _reflection.GeneratedProtocolMessageType('BatchPredictOperationMetadata', (_message.Message,), {

  'BatchPredictOutputInfo' : _reflection.GeneratedProtocolMessageType('BatchPredictOutputInfo', (_message.Message,), {
    'DESCRIPTOR' : _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO,
    '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo)
    })
  ,
  'DESCRIPTOR' : _BATCHPREDICTOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.BatchPredictOperationMetadata)
  })
_sym_db.RegisterMessage(BatchPredictOperationMetadata)
_sym_db.RegisterMessage(BatchPredictOperationMetadata.BatchPredictOutputInfo)

ExportModelOperationMetadata = _reflection.GeneratedProtocolMessageType('ExportModelOperationMetadata', (_message.Message,), {

  'ExportModelOutputInfo' : _reflection.GeneratedProtocolMessageType('ExportModelOutputInfo', (_message.Message,), {
    'DESCRIPTOR' : _EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO,
    '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExportModelOperationMetadata.ExportModelOutputInfo)
    })
  ,
  'DESCRIPTOR' : _EXPORTMODELOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExportModelOperationMetadata)
  })
_sym_db.RegisterMessage(ExportModelOperationMetadata)
_sym_db.RegisterMessage(ExportModelOperationMetadata.ExportModelOutputInfo)

ExportEvaluatedExamplesOperationMetadata = _reflection.GeneratedProtocolMessageType('ExportEvaluatedExamplesOperationMetadata', (_message.Message,), {

  'ExportEvaluatedExamplesOutputInfo' : _reflection.GeneratedProtocolMessageType('ExportEvaluatedExamplesOutputInfo', (_message.Message,), {
    'DESCRIPTOR' : _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO,
    '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo)
    })
  ,
  'DESCRIPTOR' : _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA,
  '__module__' : 'google.cloud.automl.v1beta1.operations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata)
  })
_sym_db.RegisterMessage(ExportEvaluatedExamplesOperationMetadata)
_sym_db.RegisterMessage(ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
