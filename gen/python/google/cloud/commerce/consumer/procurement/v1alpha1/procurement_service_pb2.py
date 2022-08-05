# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/commerce/consumer/procurement/v1alpha1/procurement_service.proto
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
from google.cloud.commerce.consumer.procurement.v1alpha1 import order_pb2 as google_dot_cloud_dot_commerce_dot_consumer_dot_procurement_dot_v1alpha1_dot_order__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nMgoogle/cloud/commerce/consumer/procurement/v1alpha1/procurement_service.proto\x12\x33google.cloud.commerce.consumer.procurement.v1alpha1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a?google/cloud/commerce/consumer/procurement/v1alpha1/order.proto\x1a#google/longrunning/operations.proto\"\xeb\x01\n\x11PlaceOrderRequest\x12\x42\n\x06parent\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*cloudbilling.googleapis.com/BillingAccount\x12\x19\n\x0c\x64isplay_name\x18\x06 \x01(\tB\x03\xe0\x41\x02\x12^\n\x0eline_item_info\x18\n \x03(\x0b\x32\x41.google.cloud.commerce.consumer.procurement.v1alpha1.LineItemInfoB\x03\xe0\x41\x01\x12\x17\n\nrequest_id\x18\x07 \x01(\tB\x03\xe0\x41\x01\"\x14\n\x12PlaceOrderMetadata\"$\n\x0fGetOrderRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"_\n\x11ListOrdersRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"y\n\x12ListOrdersResponse\x12J\n\x06orders\x18\x01 \x03(\x0b\x32:.google.cloud.commerce.consumer.procurement.v1alpha1.Order\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xec\x05\n\x1a\x43onsumerProcurementService\x12\xcf\x01\n\nPlaceOrder\x12\x46.google.cloud.commerce.consumer.procurement.v1alpha1.PlaceOrderRequest\x1a\x1d.google.longrunning.Operation\"Z\x82\xd3\xe4\x93\x02\x36\"1/v1alpha1/{parent=billingAccounts/*}/orders:place:\x01*\xca\x41\x1b\n\x05Order\x12\x12PlaceOrderMetadata\x12\xc1\x01\n\x08GetOrder\x12\x44.google.cloud.commerce.consumer.procurement.v1alpha1.GetOrderRequest\x1a:.google.cloud.commerce.consumer.procurement.v1alpha1.Order\"3\x82\xd3\xe4\x93\x02-\x12+/v1alpha1/{name=billingAccounts/*/orders/*}\x12\xd2\x01\n\nListOrders\x12\x46.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersRequest\x1aG.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse\"3\x82\xd3\xe4\x93\x02-\x12+/v1alpha1/{parent=billingAccounts/*}/orders\x1a\x63\xca\x41/cloudcommerceconsumerprocurement.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x9b\x01\n7com.google.cloud.commerce.consumer.procurement.v1alpha1P\x01Z^google.golang.org/genproto/googleapis/cloud/commerce/consumer/procurement/v1alpha1;procurementb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.commerce.consumer.procurement.v1alpha1.procurement_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n7com.google.cloud.commerce.consumer.procurement.v1alpha1P\001Z^google.golang.org/genproto/googleapis/cloud/commerce/consumer/procurement/v1alpha1;procurement'
  _PLACEORDERREQUEST.fields_by_name['parent']._options = None
  _PLACEORDERREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A,\n*cloudbilling.googleapis.com/BillingAccount'
  _PLACEORDERREQUEST.fields_by_name['display_name']._options = None
  _PLACEORDERREQUEST.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _PLACEORDERREQUEST.fields_by_name['line_item_info']._options = None
  _PLACEORDERREQUEST.fields_by_name['line_item_info']._serialized_options = b'\340A\001'
  _PLACEORDERREQUEST.fields_by_name['request_id']._options = None
  _PLACEORDERREQUEST.fields_by_name['request_id']._serialized_options = b'\340A\001'
  _GETORDERREQUEST.fields_by_name['name']._options = None
  _GETORDERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _LISTORDERSREQUEST.fields_by_name['parent']._options = None
  _LISTORDERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _CONSUMERPROCUREMENTSERVICE._options = None
  _CONSUMERPROCUREMENTSERVICE._serialized_options = b'\312A/cloudcommerceconsumerprocurement.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _CONSUMERPROCUREMENTSERVICE.methods_by_name['PlaceOrder']._options = None
  _CONSUMERPROCUREMENTSERVICE.methods_by_name['PlaceOrder']._serialized_options = b'\202\323\344\223\0026\"1/v1alpha1/{parent=billingAccounts/*}/orders:place:\001*\312A\033\n\005Order\022\022PlaceOrderMetadata'
  _CONSUMERPROCUREMENTSERVICE.methods_by_name['GetOrder']._options = None
  _CONSUMERPROCUREMENTSERVICE.methods_by_name['GetOrder']._serialized_options = b'\202\323\344\223\002-\022+/v1alpha1/{name=billingAccounts/*/orders/*}'
  _CONSUMERPROCUREMENTSERVICE.methods_by_name['ListOrders']._options = None
  _CONSUMERPROCUREMENTSERVICE.methods_by_name['ListOrders']._serialized_options = b'\202\323\344\223\002-\022+/v1alpha1/{parent=billingAccounts/*}/orders'
  _PLACEORDERREQUEST._serialized_start=352
  _PLACEORDERREQUEST._serialized_end=587
  _PLACEORDERMETADATA._serialized_start=589
  _PLACEORDERMETADATA._serialized_end=609
  _GETORDERREQUEST._serialized_start=611
  _GETORDERREQUEST._serialized_end=647
  _LISTORDERSREQUEST._serialized_start=649
  _LISTORDERSREQUEST._serialized_end=744
  _LISTORDERSRESPONSE._serialized_start=746
  _LISTORDERSRESPONSE._serialized_end=867
  _CONSUMERPROCUREMENTSERVICE._serialized_start=870
  _CONSUMERPROCUREMENTSERVICE._serialized_end=1618
# @@protoc_insertion_point(module_scope)
