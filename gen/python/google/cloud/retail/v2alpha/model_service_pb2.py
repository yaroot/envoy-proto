# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/model_service.proto
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
from google.cloud.retail.v2alpha import model_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_model__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/retail/v2alpha/model_service.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\'google/cloud/retail/v2alpha/model.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\x99\x01\n\x12\x43reateModelRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12\x36\n\x05model\x18\x02 \x01(\x0b\x32\".google.cloud.retail.v2alpha.ModelB\x03\xe0\x41\x02\x12\x14\n\x07\x64ry_run\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x82\x01\n\x12UpdateModelRequest\x12\x36\n\x05model\x18\x01 \x01(\x0b\x32\".google.cloud.retail.v2alpha.ModelB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"F\n\x11PauseModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bretail.googleapis.com/Model\"\'\n\x12ResumeModelRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"{\n\x11ListModelsRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"G\n\x12\x44\x65leteModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bretail.googleapis.com/Model\"a\n\x12ListModelsResponse\x12\x32\n\x06models\x18\x01 \x03(\x0b\x32\".google.cloud.retail.v2alpha.Model\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"E\n\x10TuneModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bretail.googleapis.com/Model\"$\n\x13\x43reateModelMetadata\x12\r\n\x05model\x18\x01 \x01(\t\"\"\n\x11TuneModelMetadata\x12\r\n\x05model\x18\x01 \x01(\t\"\x13\n\x11TuneModelResponse2\x98\x0c\n\x0cModelService\x12\x8f\x02\n\x0b\x43reateModel\x12/.google.cloud.retail.v2alpha.CreateModelRequest\x1a\x1d.google.longrunning.Operation\"\xaf\x01\x82\xd3\xe4\x93\x02\x43\":/v2alpha/{parent=projects/*/locations/*/catalogs/*}/models:\x05model\xda\x41\x0cparent,model\xca\x41T\n!google.cloud.retail.v2alpha.Model\x12/google.cloud.retail.v2alpha.CreateModelMetadata\x12\xb4\x01\n\nPauseModel\x12..google.cloud.retail.v2alpha.PauseModelRequest\x1a\".google.cloud.retail.v2alpha.Model\"R\x82\xd3\xe4\x93\x02\x45\"@/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}:pause:\x01*\xda\x41\x04name\x12\xb7\x01\n\x0bResumeModel\x12/.google.cloud.retail.v2alpha.ResumeModelRequest\x1a\".google.cloud.retail.v2alpha.Model\"S\x82\xd3\xe4\x93\x02\x46\"A/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}:resume:\x01*\xda\x41\x04name\x12\xa1\x01\n\x0b\x44\x65leteModel\x12/.google.cloud.retail.v2alpha.DeleteModelRequest\x1a\x16.google.protobuf.Empty\"I\x82\xd3\xe4\x93\x02<*:/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}\xda\x41\x04name\x12\xba\x01\n\nListModels\x12..google.cloud.retail.v2alpha.ListModelsRequest\x1a/.google.cloud.retail.v2alpha.ListModelsResponse\"K\x82\xd3\xe4\x93\x02<\x12:/v2alpha/{parent=projects/*/locations/*/catalogs/*}/models\xda\x41\x06parent\x12\xc7\x01\n\x0bUpdateModel\x12/.google.cloud.retail.v2alpha.UpdateModelRequest\x1a\".google.cloud.retail.v2alpha.Model\"c\x82\xd3\xe4\x93\x02I2@/v2alpha/{model.name=projects/*/locations/*/catalogs/*/models/*}:\x05model\xda\x41\x11model,update_mask\x12\x8e\x02\n\tTuneModel\x12-.google.cloud.retail.v2alpha.TuneModelRequest\x1a\x1d.google.longrunning.Operation\"\xb2\x01\x82\xd3\xe4\x93\x02\x44\"?/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}:tune:\x01*\xda\x41\x04name\xca\x41^\n-google.cloud.retail.v2alpha.TuneModelResponse\x12-google.cloud.retail.v2alpha.TuneModelMetadata\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xdf\x01\n\x1f\x63om.google.cloud.retail.v2alphaB\x11ModelServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2alpha.model_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.retail.v2alphaB\021ModelServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha'
  _CREATEMODELREQUEST.fields_by_name['parent']._options = None
  _CREATEMODELREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog'
  _CREATEMODELREQUEST.fields_by_name['model']._options = None
  _CREATEMODELREQUEST.fields_by_name['model']._serialized_options = b'\340A\002'
  _CREATEMODELREQUEST.fields_by_name['dry_run']._options = None
  _CREATEMODELREQUEST.fields_by_name['dry_run']._serialized_options = b'\340A\001'
  _UPDATEMODELREQUEST.fields_by_name['model']._options = None
  _UPDATEMODELREQUEST.fields_by_name['model']._serialized_options = b'\340A\002'
  _UPDATEMODELREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEMODELREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _PAUSEMODELREQUEST.fields_by_name['name']._options = None
  _PAUSEMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033retail.googleapis.com/Model'
  _RESUMEMODELREQUEST.fields_by_name['name']._options = None
  _RESUMEMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _LISTMODELSREQUEST.fields_by_name['parent']._options = None
  _LISTMODELSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog'
  _LISTMODELSREQUEST.fields_by_name['page_size']._options = None
  _LISTMODELSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTMODELSREQUEST.fields_by_name['page_token']._options = None
  _LISTMODELSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _DELETEMODELREQUEST.fields_by_name['name']._options = None
  _DELETEMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033retail.googleapis.com/Model'
  _TUNEMODELREQUEST.fields_by_name['name']._options = None
  _TUNEMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033retail.googleapis.com/Model'
  _MODELSERVICE._options = None
  _MODELSERVICE._serialized_options = b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _MODELSERVICE.methods_by_name['CreateModel']._options = None
  _MODELSERVICE.methods_by_name['CreateModel']._serialized_options = b'\202\323\344\223\002C\":/v2alpha/{parent=projects/*/locations/*/catalogs/*}/models:\005model\332A\014parent,model\312AT\n!google.cloud.retail.v2alpha.Model\022/google.cloud.retail.v2alpha.CreateModelMetadata'
  _MODELSERVICE.methods_by_name['PauseModel']._options = None
  _MODELSERVICE.methods_by_name['PauseModel']._serialized_options = b'\202\323\344\223\002E\"@/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}:pause:\001*\332A\004name'
  _MODELSERVICE.methods_by_name['ResumeModel']._options = None
  _MODELSERVICE.methods_by_name['ResumeModel']._serialized_options = b'\202\323\344\223\002F\"A/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}:resume:\001*\332A\004name'
  _MODELSERVICE.methods_by_name['DeleteModel']._options = None
  _MODELSERVICE.methods_by_name['DeleteModel']._serialized_options = b'\202\323\344\223\002<*:/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}\332A\004name'
  _MODELSERVICE.methods_by_name['ListModels']._options = None
  _MODELSERVICE.methods_by_name['ListModels']._serialized_options = b'\202\323\344\223\002<\022:/v2alpha/{parent=projects/*/locations/*/catalogs/*}/models\332A\006parent'
  _MODELSERVICE.methods_by_name['UpdateModel']._options = None
  _MODELSERVICE.methods_by_name['UpdateModel']._serialized_options = b'\202\323\344\223\002I2@/v2alpha/{model.name=projects/*/locations/*/catalogs/*/models/*}:\005model\332A\021model,update_mask'
  _MODELSERVICE.methods_by_name['TuneModel']._options = None
  _MODELSERVICE.methods_by_name['TuneModel']._serialized_options = b'\202\323\344\223\002D\"?/v2alpha/{name=projects/*/locations/*/catalogs/*/models/*}:tune:\001*\332A\004name\312A^\n-google.cloud.retail.v2alpha.TuneModelResponse\022-google.cloud.retail.v2alpha.TuneModelMetadata'
  _CREATEMODELREQUEST._serialized_start=337
  _CREATEMODELREQUEST._serialized_end=490
  _UPDATEMODELREQUEST._serialized_start=493
  _UPDATEMODELREQUEST._serialized_end=623
  _PAUSEMODELREQUEST._serialized_start=625
  _PAUSEMODELREQUEST._serialized_end=695
  _RESUMEMODELREQUEST._serialized_start=697
  _RESUMEMODELREQUEST._serialized_end=736
  _LISTMODELSREQUEST._serialized_start=738
  _LISTMODELSREQUEST._serialized_end=861
  _DELETEMODELREQUEST._serialized_start=863
  _DELETEMODELREQUEST._serialized_end=934
  _LISTMODELSRESPONSE._serialized_start=936
  _LISTMODELSRESPONSE._serialized_end=1033
  _TUNEMODELREQUEST._serialized_start=1035
  _TUNEMODELREQUEST._serialized_end=1104
  _CREATEMODELMETADATA._serialized_start=1106
  _CREATEMODELMETADATA._serialized_end=1142
  _TUNEMODELMETADATA._serialized_start=1144
  _TUNEMODELMETADATA._serialized_end=1178
  _TUNEMODELRESPONSE._serialized_start=1180
  _TUNEMODELRESPONSE._serialized_end=1199
  _MODELSERVICE._serialized_start=1202
  _MODELSERVICE._serialized_end=2762
# @@protoc_insertion_point(module_scope)