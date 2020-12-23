# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/services/batch_job_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v5.resources import batch_job_pb2 as google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_batch__job__pb2
from google.ads.googleads.v5.services import google_ads_service_pb2 as google_dot_ads_dot_googleads_dot_v5_dot_services_dot_google__ads__service__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/services/batch_job_service.proto',
  package='google.ads.googleads.v5.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v5.servicesB\024BatchJobServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v5/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V5.Services\312\002 Google\\Ads\\GoogleAds\\V5\\Services\352\002$Google::Ads::GoogleAds::V5::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8google/ads/googleads/v5/services/batch_job_service.proto\x12 google.ads.googleads.v5.services\x1a\x31google/ads/googleads/v5/resources/batch_job.proto\x1a\x39google/ads/googleads/v5/services/google_ads_service.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x17google/rpc/status.proto\"~\n\x15MutateBatchJobRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12K\n\toperation\x18\x02 \x01(\x0b\x32\x33.google.ads.googleads.v5.services.BatchJobOperationB\x03\xe0\x41\x02\"_\n\x11\x42\x61tchJobOperation\x12=\n\x06\x63reate\x18\x01 \x01(\x0b\x32+.google.ads.googleads.v5.resources.BatchJobH\x00\x42\x0b\n\toperation\"`\n\x16MutateBatchJobResponse\x12\x46\n\x06result\x18\x01 \x01(\x0b\x32\x36.google.ads.googleads.v5.services.MutateBatchJobResult\"-\n\x14MutateBatchJobResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\"V\n\x12GetBatchJobRequest\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!googleads.googleapis.com/BatchJob\"V\n\x12RunBatchJobRequest\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!googleads.googleapis.com/BatchJob\"\xcb\x01\n\x1c\x41\x64\x64\x42\x61tchJobOperationsRequest\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!googleads.googleapis.com/BatchJob\x12\x16\n\x0esequence_token\x18\x02 \x01(\t\x12Q\n\x11mutate_operations\x18\x03 \x03(\x0b\x32\x31.google.ads.googleads.v5.services.MutateOperationB\x03\xe0\x41\x02\"V\n\x1d\x41\x64\x64\x42\x61tchJobOperationsResponse\x12\x18\n\x10total_operations\x18\x01 \x01(\x03\x12\x1b\n\x13next_sequence_token\x18\x02 \x01(\t\"\x85\x01\n\x1aListBatchJobResultsRequest\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!googleads.googleapis.com/BatchJob\x12\x12\n\npage_token\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\"y\n\x1bListBatchJobResultsResponse\x12\x41\n\x07results\x18\x01 \x03(\x0b\x32\x30.google.ads.googleads.v5.services.BatchJobResult\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xab\x01\n\x0e\x42\x61tchJobResult\x12\x17\n\x0foperation_index\x18\x01 \x01(\x03\x12\\\n\x19mutate_operation_response\x18\x02 \x01(\x0b\x32\x39.google.ads.googleads.v5.services.MutateOperationResponse\x12\"\n\x06status\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status2\x8d\n\n\x0f\x42\x61tchJobService\x12\xd6\x01\n\x0eMutateBatchJob\x12\x37.google.ads.googleads.v5.services.MutateBatchJobRequest\x1a\x38.google.ads.googleads.v5.services.MutateBatchJobResponse\"Q\x82\xd3\xe4\x93\x02\x33\"./v5/customers/{customer_id=*}/batchJobs:mutate:\x01*\xda\x41\x15\x63ustomer_id,operation\x12\xb5\x01\n\x0bGetBatchJob\x12\x34.google.ads.googleads.v5.services.GetBatchJobRequest\x1a+.google.ads.googleads.v5.resources.BatchJob\"C\x82\xd3\xe4\x93\x02-\x12+/v5/{resource_name=customers/*/batchJobs/*}\xda\x41\rresource_name\x12\xe3\x01\n\x13ListBatchJobResults\x12<.google.ads.googleads.v5.services.ListBatchJobResultsRequest\x1a=.google.ads.googleads.v5.services.ListBatchJobResultsResponse\"O\x82\xd3\xe4\x93\x02\x39\x12\x37/v5/{resource_name=customers/*/batchJobs/*}:listResults\xda\x41\rresource_name\x12\x86\x02\n\x0bRunBatchJob\x12\x34.google.ads.googleads.v5.services.RunBatchJobRequest\x1a\x1d.google.longrunning.Operation\"\xa1\x01\x82\xd3\xe4\x93\x02\x34\"//v5/{resource_name=customers/*/batchJobs/*}:run:\x01*\xda\x41\rresource_name\xca\x41T\n\x15google.protobuf.Empty\x12;google.ads.googleads.v5.resources.BatchJob.BatchJobMetadata\x12\xb2\x02\n\x15\x41\x64\x64\x42\x61tchJobOperations\x12>.google.ads.googleads.v5.services.AddBatchJobOperationsRequest\x1a?.google.ads.googleads.v5.services.AddBatchJobOperationsResponse\"\x97\x01\x82\xd3\xe4\x93\x02>\"9/v5/{resource_name=customers/*/batchJobs/*}:addOperations:\x01*\xda\x41.resource_name,sequence_token,mutate_operations\xda\x41\x1fresource_name,mutate_operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfb\x01\n$com.google.ads.googleads.v5.servicesB\x14\x42\x61tchJobServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v5/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V5.Services\xca\x02 Google\\Ads\\GoogleAds\\V5\\Services\xea\x02$Google::Ads::GoogleAds::V5::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_batch__job__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v5_dot_services_dot_google__ads__service__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_MUTATEBATCHJOBREQUEST = _descriptor.Descriptor(
  name='MutateBatchJobRequest',
  full_name='google.ads.googleads.v5.services.MutateBatchJobRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v5.services.MutateBatchJobRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operation', full_name='google.ads.googleads.v5.services.MutateBatchJobRequest.operation', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=381,
  serialized_end=507,
)


_BATCHJOBOPERATION = _descriptor.Descriptor(
  name='BatchJobOperation',
  full_name='google.ads.googleads.v5.services.BatchJobOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v5.services.BatchJobOperation.create', index=0,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v5.services.BatchJobOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=509,
  serialized_end=604,
)


_MUTATEBATCHJOBRESPONSE = _descriptor.Descriptor(
  name='MutateBatchJobResponse',
  full_name='google.ads.googleads.v5.services.MutateBatchJobResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='result', full_name='google.ads.googleads.v5.services.MutateBatchJobResponse.result', index=0,
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
  serialized_start=606,
  serialized_end=702,
)


_MUTATEBATCHJOBRESULT = _descriptor.Descriptor(
  name='MutateBatchJobResult',
  full_name='google.ads.googleads.v5.services.MutateBatchJobResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.MutateBatchJobResult.resource_name', index=0,
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
  serialized_start=704,
  serialized_end=749,
)


_GETBATCHJOBREQUEST = _descriptor.Descriptor(
  name='GetBatchJobRequest',
  full_name='google.ads.googleads.v5.services.GetBatchJobRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.GetBatchJobRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!googleads.googleapis.com/BatchJob', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=751,
  serialized_end=837,
)


_RUNBATCHJOBREQUEST = _descriptor.Descriptor(
  name='RunBatchJobRequest',
  full_name='google.ads.googleads.v5.services.RunBatchJobRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.RunBatchJobRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!googleads.googleapis.com/BatchJob', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=839,
  serialized_end=925,
)


_ADDBATCHJOBOPERATIONSREQUEST = _descriptor.Descriptor(
  name='AddBatchJobOperationsRequest',
  full_name='google.ads.googleads.v5.services.AddBatchJobOperationsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.AddBatchJobOperationsRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!googleads.googleapis.com/BatchJob', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sequence_token', full_name='google.ads.googleads.v5.services.AddBatchJobOperationsRequest.sequence_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mutate_operations', full_name='google.ads.googleads.v5.services.AddBatchJobOperationsRequest.mutate_operations', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=928,
  serialized_end=1131,
)


_ADDBATCHJOBOPERATIONSRESPONSE = _descriptor.Descriptor(
  name='AddBatchJobOperationsResponse',
  full_name='google.ads.googleads.v5.services.AddBatchJobOperationsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='total_operations', full_name='google.ads.googleads.v5.services.AddBatchJobOperationsResponse.total_operations', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_sequence_token', full_name='google.ads.googleads.v5.services.AddBatchJobOperationsResponse.next_sequence_token', index=1,
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
  serialized_start=1133,
  serialized_end=1219,
)


_LISTBATCHJOBRESULTSREQUEST = _descriptor.Descriptor(
  name='ListBatchJobResultsRequest',
  full_name='google.ads.googleads.v5.services.ListBatchJobResultsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v5.services.ListBatchJobResultsRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!googleads.googleapis.com/BatchJob', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.ads.googleads.v5.services.ListBatchJobResultsRequest.page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.ads.googleads.v5.services.ListBatchJobResultsRequest.page_size', index=2,
      number=3, type=5, cpp_type=1, label=1,
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
  serialized_start=1222,
  serialized_end=1355,
)


_LISTBATCHJOBRESULTSRESPONSE = _descriptor.Descriptor(
  name='ListBatchJobResultsResponse',
  full_name='google.ads.googleads.v5.services.ListBatchJobResultsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v5.services.ListBatchJobResultsResponse.results', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.ads.googleads.v5.services.ListBatchJobResultsResponse.next_page_token', index=1,
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
  serialized_start=1357,
  serialized_end=1478,
)


_BATCHJOBRESULT = _descriptor.Descriptor(
  name='BatchJobResult',
  full_name='google.ads.googleads.v5.services.BatchJobResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operation_index', full_name='google.ads.googleads.v5.services.BatchJobResult.operation_index', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mutate_operation_response', full_name='google.ads.googleads.v5.services.BatchJobResult.mutate_operation_response', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v5.services.BatchJobResult.status', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=1481,
  serialized_end=1652,
)

_MUTATEBATCHJOBREQUEST.fields_by_name['operation'].message_type = _BATCHJOBOPERATION
_BATCHJOBOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_batch__job__pb2._BATCHJOB
_BATCHJOBOPERATION.oneofs_by_name['operation'].fields.append(
  _BATCHJOBOPERATION.fields_by_name['create'])
_BATCHJOBOPERATION.fields_by_name['create'].containing_oneof = _BATCHJOBOPERATION.oneofs_by_name['operation']
_MUTATEBATCHJOBRESPONSE.fields_by_name['result'].message_type = _MUTATEBATCHJOBRESULT
_ADDBATCHJOBOPERATIONSREQUEST.fields_by_name['mutate_operations'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_services_dot_google__ads__service__pb2._MUTATEOPERATION
_LISTBATCHJOBRESULTSRESPONSE.fields_by_name['results'].message_type = _BATCHJOBRESULT
_BATCHJOBRESULT.fields_by_name['mutate_operation_response'].message_type = google_dot_ads_dot_googleads_dot_v5_dot_services_dot_google__ads__service__pb2._MUTATEOPERATIONRESPONSE
_BATCHJOBRESULT.fields_by_name['status'].message_type = google_dot_rpc_dot_status__pb2._STATUS
DESCRIPTOR.message_types_by_name['MutateBatchJobRequest'] = _MUTATEBATCHJOBREQUEST
DESCRIPTOR.message_types_by_name['BatchJobOperation'] = _BATCHJOBOPERATION
DESCRIPTOR.message_types_by_name['MutateBatchJobResponse'] = _MUTATEBATCHJOBRESPONSE
DESCRIPTOR.message_types_by_name['MutateBatchJobResult'] = _MUTATEBATCHJOBRESULT
DESCRIPTOR.message_types_by_name['GetBatchJobRequest'] = _GETBATCHJOBREQUEST
DESCRIPTOR.message_types_by_name['RunBatchJobRequest'] = _RUNBATCHJOBREQUEST
DESCRIPTOR.message_types_by_name['AddBatchJobOperationsRequest'] = _ADDBATCHJOBOPERATIONSREQUEST
DESCRIPTOR.message_types_by_name['AddBatchJobOperationsResponse'] = _ADDBATCHJOBOPERATIONSRESPONSE
DESCRIPTOR.message_types_by_name['ListBatchJobResultsRequest'] = _LISTBATCHJOBRESULTSREQUEST
DESCRIPTOR.message_types_by_name['ListBatchJobResultsResponse'] = _LISTBATCHJOBRESULTSRESPONSE
DESCRIPTOR.message_types_by_name['BatchJobResult'] = _BATCHJOBRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MutateBatchJobRequest = _reflection.GeneratedProtocolMessageType('MutateBatchJobRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBATCHJOBREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateBatchJobRequest)
  })
_sym_db.RegisterMessage(MutateBatchJobRequest)

BatchJobOperation = _reflection.GeneratedProtocolMessageType('BatchJobOperation', (_message.Message,), {
  'DESCRIPTOR' : _BATCHJOBOPERATION,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.BatchJobOperation)
  })
_sym_db.RegisterMessage(BatchJobOperation)

MutateBatchJobResponse = _reflection.GeneratedProtocolMessageType('MutateBatchJobResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBATCHJOBRESPONSE,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateBatchJobResponse)
  })
_sym_db.RegisterMessage(MutateBatchJobResponse)

MutateBatchJobResult = _reflection.GeneratedProtocolMessageType('MutateBatchJobResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBATCHJOBRESULT,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateBatchJobResult)
  })
_sym_db.RegisterMessage(MutateBatchJobResult)

GetBatchJobRequest = _reflection.GeneratedProtocolMessageType('GetBatchJobRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETBATCHJOBREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.GetBatchJobRequest)
  })
_sym_db.RegisterMessage(GetBatchJobRequest)

RunBatchJobRequest = _reflection.GeneratedProtocolMessageType('RunBatchJobRequest', (_message.Message,), {
  'DESCRIPTOR' : _RUNBATCHJOBREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.RunBatchJobRequest)
  })
_sym_db.RegisterMessage(RunBatchJobRequest)

AddBatchJobOperationsRequest = _reflection.GeneratedProtocolMessageType('AddBatchJobOperationsRequest', (_message.Message,), {
  'DESCRIPTOR' : _ADDBATCHJOBOPERATIONSREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.AddBatchJobOperationsRequest)
  })
_sym_db.RegisterMessage(AddBatchJobOperationsRequest)

AddBatchJobOperationsResponse = _reflection.GeneratedProtocolMessageType('AddBatchJobOperationsResponse', (_message.Message,), {
  'DESCRIPTOR' : _ADDBATCHJOBOPERATIONSRESPONSE,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.AddBatchJobOperationsResponse)
  })
_sym_db.RegisterMessage(AddBatchJobOperationsResponse)

ListBatchJobResultsRequest = _reflection.GeneratedProtocolMessageType('ListBatchJobResultsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTBATCHJOBRESULTSREQUEST,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.ListBatchJobResultsRequest)
  })
_sym_db.RegisterMessage(ListBatchJobResultsRequest)

ListBatchJobResultsResponse = _reflection.GeneratedProtocolMessageType('ListBatchJobResultsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTBATCHJOBRESULTSRESPONSE,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.ListBatchJobResultsResponse)
  })
_sym_db.RegisterMessage(ListBatchJobResultsResponse)

BatchJobResult = _reflection.GeneratedProtocolMessageType('BatchJobResult', (_message.Message,), {
  'DESCRIPTOR' : _BATCHJOBRESULT,
  '__module__' : 'google.ads.googleads.v5.services.batch_job_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.BatchJobResult)
  })
_sym_db.RegisterMessage(BatchJobResult)


DESCRIPTOR._options = None
_MUTATEBATCHJOBREQUEST.fields_by_name['customer_id']._options = None
_MUTATEBATCHJOBREQUEST.fields_by_name['operation']._options = None
_GETBATCHJOBREQUEST.fields_by_name['resource_name']._options = None
_RUNBATCHJOBREQUEST.fields_by_name['resource_name']._options = None
_ADDBATCHJOBOPERATIONSREQUEST.fields_by_name['resource_name']._options = None
_ADDBATCHJOBOPERATIONSREQUEST.fields_by_name['mutate_operations']._options = None
_LISTBATCHJOBRESULTSREQUEST.fields_by_name['resource_name']._options = None

_BATCHJOBSERVICE = _descriptor.ServiceDescriptor(
  name='BatchJobService',
  full_name='google.ads.googleads.v5.services.BatchJobService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1655,
  serialized_end=2948,
  methods=[
  _descriptor.MethodDescriptor(
    name='MutateBatchJob',
    full_name='google.ads.googleads.v5.services.BatchJobService.MutateBatchJob',
    index=0,
    containing_service=None,
    input_type=_MUTATEBATCHJOBREQUEST,
    output_type=_MUTATEBATCHJOBRESPONSE,
    serialized_options=b'\202\323\344\223\0023\"./v5/customers/{customer_id=*}/batchJobs:mutate:\001*\332A\025customer_id,operation',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetBatchJob',
    full_name='google.ads.googleads.v5.services.BatchJobService.GetBatchJob',
    index=1,
    containing_service=None,
    input_type=_GETBATCHJOBREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v5_dot_resources_dot_batch__job__pb2._BATCHJOB,
    serialized_options=b'\202\323\344\223\002-\022+/v5/{resource_name=customers/*/batchJobs/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListBatchJobResults',
    full_name='google.ads.googleads.v5.services.BatchJobService.ListBatchJobResults',
    index=2,
    containing_service=None,
    input_type=_LISTBATCHJOBRESULTSREQUEST,
    output_type=_LISTBATCHJOBRESULTSRESPONSE,
    serialized_options=b'\202\323\344\223\0029\0227/v5/{resource_name=customers/*/batchJobs/*}:listResults\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RunBatchJob',
    full_name='google.ads.googleads.v5.services.BatchJobService.RunBatchJob',
    index=3,
    containing_service=None,
    input_type=_RUNBATCHJOBREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\0024\"//v5/{resource_name=customers/*/batchJobs/*}:run:\001*\332A\rresource_name\312AT\n\025google.protobuf.Empty\022;google.ads.googleads.v5.resources.BatchJob.BatchJobMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='AddBatchJobOperations',
    full_name='google.ads.googleads.v5.services.BatchJobService.AddBatchJobOperations',
    index=4,
    containing_service=None,
    input_type=_ADDBATCHJOBOPERATIONSREQUEST,
    output_type=_ADDBATCHJOBOPERATIONSRESPONSE,
    serialized_options=b'\202\323\344\223\002>\"9/v5/{resource_name=customers/*/batchJobs/*}:addOperations:\001*\332A.resource_name,sequence_token,mutate_operations\332A\037resource_name,mutate_operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_BATCHJOBSERVICE)

DESCRIPTOR.services_by_name['BatchJobService'] = _BATCHJOBSERVICE

# @@protoc_insertion_point(module_scope)
