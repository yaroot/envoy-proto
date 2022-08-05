# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/fulfillment.proto
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
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/dialogflow/v2beta1/fulfillment.proto\x12\x1fgoogle.cloud.dialogflow.v2beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"\x9f\x06\n\x0b\x46ulfillment\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12]\n\x13generic_web_service\x18\x03 \x01(\x0b\x32>.google.cloud.dialogflow.v2beta1.Fulfillment.GenericWebServiceH\x00\x12\x0f\n\x07\x65nabled\x18\x04 \x01(\x08\x12\x46\n\x08\x66\x65\x61tures\x18\x05 \x03(\x0b\x32\x34.google.cloud.dialogflow.v2beta1.Fulfillment.Feature\x1a\x8f\x02\n\x11GenericWebService\x12\x10\n\x03uri\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x10\n\x08username\x18\x02 \x01(\t\x12\x10\n\x08password\x18\x03 \x01(\t\x12k\n\x0frequest_headers\x18\x04 \x03(\x0b\x32R.google.cloud.dialogflow.v2beta1.Fulfillment.GenericWebService.RequestHeadersEntry\x12 \n\x11is_cloud_function\x18\x05 \x01(\x08\x42\x05\x18\x01\xe0\x41\x01\x1a\x35\n\x13RequestHeadersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\x7f\n\x07\x46\x65\x61ture\x12G\n\x04type\x18\x01 \x01(\x0e\x32\x39.google.cloud.dialogflow.v2beta1.Fulfillment.Feature.Type\"+\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\r\n\tSMALLTALK\x10\x01:\x8c\x01\xea\x41\x88\x01\n%dialogflow.googleapis.com/Fulfillment\x12$projects/{project}/agent/fulfillment\x12\x39projects/{project}/locations/{location}/agent/fulfillmentB\r\n\x0b\x66ulfillment\"T\n\x15GetFulfillmentRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Fulfillment\"\x98\x01\n\x18UpdateFulfillmentRequest\x12\x46\n\x0b\x66ulfillment\x18\x01 \x01(\x0b\x32,.google.cloud.dialogflow.v2beta1.FulfillmentB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x32\xb9\x05\n\x0c\x46ulfillments\x12\xef\x01\n\x0eGetFulfillment\x12\x36.google.cloud.dialogflow.v2beta1.GetFulfillmentRequest\x1a,.google.cloud.dialogflow.v2beta1.Fulfillment\"w\x82\xd3\xe4\x93\x02j\x12,/v2beta1/{name=projects/*/agent/fulfillment}Z:\x12\x38/v2beta1/{name=projects/*/locations/*/agent/fulfillment}\xda\x41\x04name\x12\xbc\x02\n\x11UpdateFulfillment\x12\x39.google.cloud.dialogflow.v2beta1.UpdateFulfillmentRequest\x1a,.google.cloud.dialogflow.v2beta1.Fulfillment\"\xbd\x01\x82\xd3\xe4\x93\x02\x9c\x01\x32\x38/v2beta1/{fulfillment.name=projects/*/agent/fulfillment}:\x0b\x66ulfillmentZS2D/v2beta1/{fulfillment.name=projects/*/locations/*/agent/fulfillment}:\x0b\x66ulfillment\xda\x41\x17\x66ulfillment,update_mask\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\xae\x01\n#com.google.cloud.dialogflow.v2beta1B\x10\x46ulfillmentProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1fGoogle.Cloud.Dialogflow.V2beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2beta1.fulfillment_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.dialogflow.v2beta1B\020FulfillmentProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1'
  _FULFILLMENT_GENERICWEBSERVICE_REQUESTHEADERSENTRY._options = None
  _FULFILLMENT_GENERICWEBSERVICE_REQUESTHEADERSENTRY._serialized_options = b'8\001'
  _FULFILLMENT_GENERICWEBSERVICE.fields_by_name['uri']._options = None
  _FULFILLMENT_GENERICWEBSERVICE.fields_by_name['uri']._serialized_options = b'\340A\002'
  _FULFILLMENT_GENERICWEBSERVICE.fields_by_name['is_cloud_function']._options = None
  _FULFILLMENT_GENERICWEBSERVICE.fields_by_name['is_cloud_function']._serialized_options = b'\030\001\340A\001'
  _FULFILLMENT.fields_by_name['name']._options = None
  _FULFILLMENT.fields_by_name['name']._serialized_options = b'\340A\002'
  _FULFILLMENT._options = None
  _FULFILLMENT._serialized_options = b'\352A\210\001\n%dialogflow.googleapis.com/Fulfillment\022$projects/{project}/agent/fulfillment\0229projects/{project}/locations/{location}/agent/fulfillment'
  _GETFULFILLMENTREQUEST.fields_by_name['name']._options = None
  _GETFULFILLMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Fulfillment'
  _UPDATEFULFILLMENTREQUEST.fields_by_name['fulfillment']._options = None
  _UPDATEFULFILLMENTREQUEST.fields_by_name['fulfillment']._serialized_options = b'\340A\002'
  _UPDATEFULFILLMENTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEFULFILLMENTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _FULFILLMENTS._options = None
  _FULFILLMENTS._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _FULFILLMENTS.methods_by_name['GetFulfillment']._options = None
  _FULFILLMENTS.methods_by_name['GetFulfillment']._serialized_options = b'\202\323\344\223\002j\022,/v2beta1/{name=projects/*/agent/fulfillment}Z:\0228/v2beta1/{name=projects/*/locations/*/agent/fulfillment}\332A\004name'
  _FULFILLMENTS.methods_by_name['UpdateFulfillment']._options = None
  _FULFILLMENTS.methods_by_name['UpdateFulfillment']._serialized_options = b'\202\323\344\223\002\234\00128/v2beta1/{fulfillment.name=projects/*/agent/fulfillment}:\013fulfillmentZS2D/v2beta1/{fulfillment.name=projects/*/locations/*/agent/fulfillment}:\013fulfillment\332A\027fulfillment,update_mask'
  _FULFILLMENT._serialized_start=236
  _FULFILLMENT._serialized_end=1035
  _FULFILLMENT_GENERICWEBSERVICE._serialized_start=477
  _FULFILLMENT_GENERICWEBSERVICE._serialized_end=748
  _FULFILLMENT_GENERICWEBSERVICE_REQUESTHEADERSENTRY._serialized_start=695
  _FULFILLMENT_GENERICWEBSERVICE_REQUESTHEADERSENTRY._serialized_end=748
  _FULFILLMENT_FEATURE._serialized_start=750
  _FULFILLMENT_FEATURE._serialized_end=877
  _FULFILLMENT_FEATURE_TYPE._serialized_start=834
  _FULFILLMENT_FEATURE_TYPE._serialized_end=877
  _GETFULFILLMENTREQUEST._serialized_start=1037
  _GETFULFILLMENTREQUEST._serialized_end=1121
  _UPDATEFULFILLMENTREQUEST._serialized_start=1124
  _UPDATEFULFILLMENTREQUEST._serialized_end=1276
  _FULFILLMENTS._serialized_start=1279
  _FULFILLMENTS._serialized_end=1976
# @@protoc_insertion_point(module_scope)
