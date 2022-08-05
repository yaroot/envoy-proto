# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/import_config.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2alpha import product_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_product__pb2
from google.cloud.retail.v2alpha import user_event_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_user__event__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.type import date_pb2 as google_dot_type_dot_date__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/retail/v2alpha/import_config.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a)google/cloud/retail/v2alpha/product.proto\x1a,google/cloud/retail/v2alpha/user_event.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x16google/type/date.proto\"9\n\tGcsSource\x12\x17\n\ninput_uris\x18\x01 \x03(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61ta_schema\x18\x02 \x01(\t\"\xbc\x01\n\x0e\x42igQuerySource\x12+\n\x0epartition_date\x18\x06 \x01(\x0b\x32\x11.google.type.DateH\x00\x12\x12\n\nproject_id\x18\x05 \x01(\t\x12\x17\n\ndataset_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08table_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\x0fgcs_staging_dir\x18\x03 \x01(\t\x12\x13\n\x0b\x64\x61ta_schema\x18\x04 \x01(\tB\x0b\n\tpartition\"R\n\x13ProductInlineSource\x12;\n\x08products\x18\x01 \x03(\x0b\x32$.google.cloud.retail.v2alpha.ProductB\x03\xe0\x41\x02\"Y\n\x15UserEventInlineSource\x12@\n\x0buser_events\x18\x01 \x03(\x0b\x32&.google.cloud.retail.v2alpha.UserEventB\x03\xe0\x41\x02\"9\n\x12ImportErrorsConfig\x12\x14\n\ngcs_prefix\x18\x01 \x01(\tH\x00\x42\r\n\x0b\x64\x65stination\"\xaf\x04\n\x15ImportProductsRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1cretail.googleapis.com/Branch\x12\x16\n\nrequest_id\x18\x06 \x01(\tB\x02\x18\x01\x12J\n\x0cinput_config\x18\x02 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ProductInputConfigB\x03\xe0\x41\x02\x12\x46\n\rerrors_config\x18\x03 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ImportErrorsConfig\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x62\n\x13reconciliation_mode\x18\x05 \x01(\x0e\x32\x45.google.cloud.retail.v2alpha.ImportProductsRequest.ReconciliationMode\x12!\n\x19notification_pubsub_topic\x18\x07 \x01(\t\x12&\n\x1eskip_default_branch_protection\x18\x08 \x01(\x08\"T\n\x12ReconciliationMode\x12#\n\x1fRECONCILIATION_MODE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bINCREMENTAL\x10\x01\x12\x08\n\x04\x46ULL\x10\x02\"\xe6\x01\n\x17ImportUserEventsRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12L\n\x0cinput_config\x18\x02 \x01(\x0b\x32\x31.google.cloud.retail.v2alpha.UserEventInputConfigB\x03\xe0\x41\x02\x12\x46\n\rerrors_config\x18\x03 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ImportErrorsConfig\"\xca\x01\n\x1bImportCompletionDataRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12Q\n\x0cinput_config\x18\x02 \x01(\x0b\x32\x36.google.cloud.retail.v2alpha.CompletionDataInputConfigB\x03\xe0\x41\x02\x12!\n\x19notification_pubsub_topic\x18\x03 \x01(\t\"\xf8\x01\n\x12ProductInputConfig\x12Q\n\x15product_inline_source\x18\x01 \x01(\x0b\x32\x30.google.cloud.retail.v2alpha.ProductInlineSourceH\x00\x12<\n\ngcs_source\x18\x02 \x01(\x0b\x32&.google.cloud.retail.v2alpha.GcsSourceH\x00\x12G\n\x10\x62ig_query_source\x18\x03 \x01(\x0b\x32+.google.cloud.retail.v2alpha.BigQuerySourceH\x00\x42\x08\n\x06source\"\x8e\x02\n\x14UserEventInputConfig\x12[\n\x18user_event_inline_source\x18\x01 \x01(\x0b\x32\x32.google.cloud.retail.v2alpha.UserEventInlineSourceB\x03\xe0\x41\x02H\x00\x12\x41\n\ngcs_source\x18\x02 \x01(\x0b\x32&.google.cloud.retail.v2alpha.GcsSourceB\x03\xe0\x41\x02H\x00\x12L\n\x10\x62ig_query_source\x18\x03 \x01(\x0b\x32+.google.cloud.retail.v2alpha.BigQuerySourceB\x03\xe0\x41\x02H\x00\x42\x08\n\x06source\"s\n\x19\x43ompletionDataInputConfig\x12L\n\x10\x62ig_query_source\x18\x01 \x01(\x0b\x32+.google.cloud.retail.v2alpha.BigQuerySourceB\x03\xe0\x41\x02H\x00\x42\x08\n\x06source\"\xdb\x01\n\x0eImportMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rsuccess_count\x18\x03 \x01(\x03\x12\x15\n\rfailure_count\x18\x04 \x01(\x03\x12\x16\n\nrequest_id\x18\x05 \x01(\tB\x02\x18\x01\x12!\n\x19notification_pubsub_topic\x18\x06 \x01(\t\"\x8b\x01\n\x16ImportProductsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x46\n\rerrors_config\x18\x02 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ImportErrorsConfig\"\xda\x01\n\x18ImportUserEventsResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x46\n\rerrors_config\x18\x02 \x01(\x0b\x32/.google.cloud.retail.v2alpha.ImportErrorsConfig\x12K\n\x0eimport_summary\x18\x03 \x01(\x0b\x32\x33.google.cloud.retail.v2alpha.UserEventImportSummary\"T\n\x16UserEventImportSummary\x12\x1b\n\x13joined_events_count\x18\x01 \x01(\x03\x12\x1d\n\x15unjoined_events_count\x18\x02 \x01(\x03\"I\n\x1cImportCompletionDataResponse\x12)\n\rerror_samples\x18\x01 \x03(\x0b\x32\x12.google.rpc.StatusB\xdf\x01\n\x1f\x63om.google.cloud.retail.v2alphaB\x11ImportConfigProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2alpha.import_config_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.retail.v2alphaB\021ImportConfigProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha'
  _GCSSOURCE.fields_by_name['input_uris']._options = None
  _GCSSOURCE.fields_by_name['input_uris']._serialized_options = b'\340A\002'
  _BIGQUERYSOURCE.fields_by_name['dataset_id']._options = None
  _BIGQUERYSOURCE.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _BIGQUERYSOURCE.fields_by_name['table_id']._options = None
  _BIGQUERYSOURCE.fields_by_name['table_id']._serialized_options = b'\340A\002'
  _PRODUCTINLINESOURCE.fields_by_name['products']._options = None
  _PRODUCTINLINESOURCE.fields_by_name['products']._serialized_options = b'\340A\002'
  _USEREVENTINLINESOURCE.fields_by_name['user_events']._options = None
  _USEREVENTINLINESOURCE.fields_by_name['user_events']._serialized_options = b'\340A\002'
  _IMPORTPRODUCTSREQUEST.fields_by_name['parent']._options = None
  _IMPORTPRODUCTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034retail.googleapis.com/Branch'
  _IMPORTPRODUCTSREQUEST.fields_by_name['request_id']._options = None
  _IMPORTPRODUCTSREQUEST.fields_by_name['request_id']._serialized_options = b'\030\001'
  _IMPORTPRODUCTSREQUEST.fields_by_name['input_config']._options = None
  _IMPORTPRODUCTSREQUEST.fields_by_name['input_config']._serialized_options = b'\340A\002'
  _IMPORTUSEREVENTSREQUEST.fields_by_name['parent']._options = None
  _IMPORTUSEREVENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog'
  _IMPORTUSEREVENTSREQUEST.fields_by_name['input_config']._options = None
  _IMPORTUSEREVENTSREQUEST.fields_by_name['input_config']._serialized_options = b'\340A\002'
  _IMPORTCOMPLETIONDATAREQUEST.fields_by_name['parent']._options = None
  _IMPORTCOMPLETIONDATAREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog'
  _IMPORTCOMPLETIONDATAREQUEST.fields_by_name['input_config']._options = None
  _IMPORTCOMPLETIONDATAREQUEST.fields_by_name['input_config']._serialized_options = b'\340A\002'
  _USEREVENTINPUTCONFIG.fields_by_name['user_event_inline_source']._options = None
  _USEREVENTINPUTCONFIG.fields_by_name['user_event_inline_source']._serialized_options = b'\340A\002'
  _USEREVENTINPUTCONFIG.fields_by_name['gcs_source']._options = None
  _USEREVENTINPUTCONFIG.fields_by_name['gcs_source']._serialized_options = b'\340A\002'
  _USEREVENTINPUTCONFIG.fields_by_name['big_query_source']._options = None
  _USEREVENTINPUTCONFIG.fields_by_name['big_query_source']._serialized_options = b'\340A\002'
  _COMPLETIONDATAINPUTCONFIG.fields_by_name['big_query_source']._options = None
  _COMPLETIONDATAINPUTCONFIG.fields_by_name['big_query_source']._serialized_options = b'\340A\002'
  _IMPORTMETADATA.fields_by_name['request_id']._options = None
  _IMPORTMETADATA.fields_by_name['request_id']._serialized_options = b'\030\001'
  _GCSSOURCE._serialized_start=345
  _GCSSOURCE._serialized_end=402
  _BIGQUERYSOURCE._serialized_start=405
  _BIGQUERYSOURCE._serialized_end=593
  _PRODUCTINLINESOURCE._serialized_start=595
  _PRODUCTINLINESOURCE._serialized_end=677
  _USEREVENTINLINESOURCE._serialized_start=679
  _USEREVENTINLINESOURCE._serialized_end=768
  _IMPORTERRORSCONFIG._serialized_start=770
  _IMPORTERRORSCONFIG._serialized_end=827
  _IMPORTPRODUCTSREQUEST._serialized_start=830
  _IMPORTPRODUCTSREQUEST._serialized_end=1389
  _IMPORTPRODUCTSREQUEST_RECONCILIATIONMODE._serialized_start=1305
  _IMPORTPRODUCTSREQUEST_RECONCILIATIONMODE._serialized_end=1389
  _IMPORTUSEREVENTSREQUEST._serialized_start=1392
  _IMPORTUSEREVENTSREQUEST._serialized_end=1622
  _IMPORTCOMPLETIONDATAREQUEST._serialized_start=1625
  _IMPORTCOMPLETIONDATAREQUEST._serialized_end=1827
  _PRODUCTINPUTCONFIG._serialized_start=1830
  _PRODUCTINPUTCONFIG._serialized_end=2078
  _USEREVENTINPUTCONFIG._serialized_start=2081
  _USEREVENTINPUTCONFIG._serialized_end=2351
  _COMPLETIONDATAINPUTCONFIG._serialized_start=2353
  _COMPLETIONDATAINPUTCONFIG._serialized_end=2468
  _IMPORTMETADATA._serialized_start=2471
  _IMPORTMETADATA._serialized_end=2690
  _IMPORTPRODUCTSRESPONSE._serialized_start=2693
  _IMPORTPRODUCTSRESPONSE._serialized_end=2832
  _IMPORTUSEREVENTSRESPONSE._serialized_start=2835
  _IMPORTUSEREVENTSRESPONSE._serialized_end=3053
  _USEREVENTIMPORTSUMMARY._serialized_start=3055
  _USEREVENTIMPORTSUMMARY._serialized_end=3139
  _IMPORTCOMPLETIONDATARESPONSE._serialized_start=3141
  _IMPORTCOMPLETIONDATARESPONSE._serialized_end=3214
# @@protoc_insertion_point(module_scope)
