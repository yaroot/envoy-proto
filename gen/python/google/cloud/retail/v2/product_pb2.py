# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2/product.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2 import common_pb2 as google_dot_cloud_dot_retail_dot_v2_dot_common__pb2
from google.cloud.retail.v2 import promotion_pb2 as google_dot_cloud_dot_retail_dot_v2_dot_promotion__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$google/cloud/retail/v2/product.proto\x12\x16google.cloud.retail.v2\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/cloud/retail/v2/common.proto\x1a&google/cloud/retail/v2/promotion.proto\x1a\x1egoogle/protobuf/duration.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xdb\r\n\x07Product\x12\x31\n\x0b\x65xpire_time\x18\x10 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x12-\n\x03ttl\x18\x11 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x04H\x00\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x0f\n\x02id\x18\x02 \x01(\tB\x03\xe0\x41\x05\x12\x37\n\x04type\x18\x03 \x01(\x0e\x32$.google.cloud.retail.v2.Product.TypeB\x03\xe0\x41\x05\x12\x1a\n\x12primary_product_id\x18\x04 \x01(\t\x12\x1d\n\x15\x63ollection_member_ids\x18\x05 \x03(\t\x12\x0c\n\x04gtin\x18\x06 \x01(\t\x12\x12\n\ncategories\x18\x07 \x03(\t\x12\x12\n\x05title\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x0e\n\x06\x62rands\x18\t \x03(\t\x12\x13\n\x0b\x64\x65scription\x18\n \x01(\t\x12\x15\n\rlanguage_code\x18\x0b \x01(\t\x12\x43\n\nattributes\x18\x0c \x03(\x0b\x32/.google.cloud.retail.v2.Product.AttributesEntry\x12\x0c\n\x04tags\x18\r \x03(\t\x12\x35\n\nprice_info\x18\x0e \x01(\x0b\x32!.google.cloud.retail.v2.PriceInfo\x12.\n\x06rating\x18\x0f \x01(\x0b\x32\x1e.google.cloud.retail.v2.Rating\x12\x32\n\x0e\x61vailable_time\x18\x12 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x42\n\x0c\x61vailability\x18\x13 \x01(\x0e\x32,.google.cloud.retail.v2.Product.Availability\x12\x37\n\x12\x61vailable_quantity\x18\x14 \x01(\x0b\x32\x1b.google.protobuf.Int32Value\x12\x41\n\x10\x66ulfillment_info\x18\x15 \x03(\x0b\x32\'.google.cloud.retail.v2.FulfillmentInfo\x12\x0b\n\x03uri\x18\x16 \x01(\t\x12-\n\x06images\x18\x17 \x03(\x0b\x32\x1d.google.cloud.retail.v2.Image\x12\x32\n\x08\x61udience\x18\x18 \x01(\x0b\x32 .google.cloud.retail.v2.Audience\x12\x35\n\ncolor_info\x18\x19 \x01(\x0b\x32!.google.cloud.retail.v2.ColorInfo\x12\r\n\x05sizes\x18\x1a \x03(\t\x12\x11\n\tmaterials\x18\x1b \x03(\t\x12\x10\n\x08patterns\x18\x1c \x03(\t\x12\x12\n\nconditions\x18\x1d \x03(\t\x12\x35\n\npromotions\x18\" \x03(\x0b\x32!.google.cloud.retail.v2.Promotion\x12\x30\n\x0cpublish_time\x18! \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12:\n\x12retrievable_fields\x18\x1e \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x02\x18\x01\x12\x36\n\x08variants\x18\x1f \x03(\x0b\x32\x1f.google.cloud.retail.v2.ProductB\x03\xe0\x41\x03\x12\x46\n\x11local_inventories\x18# \x03(\x0b\x32&.google.cloud.retail.v2.LocalInventoryB\x03\xe0\x41\x03\x1aZ\n\x0f\x41ttributesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x36\n\x05value\x18\x02 \x01(\x0b\x32\'.google.cloud.retail.v2.CustomAttribute:\x02\x38\x01\"F\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PRIMARY\x10\x01\x12\x0b\n\x07VARIANT\x10\x02\x12\x0e\n\nCOLLECTION\x10\x03\"i\n\x0c\x41vailability\x12\x1c\n\x18\x41VAILABILITY_UNSPECIFIED\x10\x00\x12\x0c\n\x08IN_STOCK\x10\x01\x12\x10\n\x0cOUT_OF_STOCK\x10\x02\x12\x0c\n\x08PREORDER\x10\x03\x12\r\n\tBACKORDER\x10\x04:\x84\x01\xea\x41\x80\x01\n\x1dretail.googleapis.com/Product\x12_projects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}/products/{product}B\x0c\n\nexpirationB\xb0\x02\n\x1a\x63om.google.cloud.retail.v2B\x0cProductProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\xa2\x02\x06RETAIL\xaa\x02\x16Google.Cloud.Retail.V2\xca\x02\x16Google\\Cloud\\Retail\\V2\xea\x02\x19Google::Cloud::Retail::V2\xea\x41l\n\x1cretail.googleapis.com/Branch\x12Lprojects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2.product_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.retail.v2B\014ProductProtoP\001Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail::V2\352Al\n\034retail.googleapis.com/Branch\022Lprojects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}'
  _PRODUCT_ATTRIBUTESENTRY._options = None
  _PRODUCT_ATTRIBUTESENTRY._serialized_options = b'8\001'
  _PRODUCT.fields_by_name['ttl']._options = None
  _PRODUCT.fields_by_name['ttl']._serialized_options = b'\340A\004'
  _PRODUCT.fields_by_name['name']._options = None
  _PRODUCT.fields_by_name['name']._serialized_options = b'\340A\005'
  _PRODUCT.fields_by_name['id']._options = None
  _PRODUCT.fields_by_name['id']._serialized_options = b'\340A\005'
  _PRODUCT.fields_by_name['type']._options = None
  _PRODUCT.fields_by_name['type']._serialized_options = b'\340A\005'
  _PRODUCT.fields_by_name['title']._options = None
  _PRODUCT.fields_by_name['title']._serialized_options = b'\340A\002'
  _PRODUCT.fields_by_name['retrievable_fields']._options = None
  _PRODUCT.fields_by_name['retrievable_fields']._serialized_options = b'\030\001'
  _PRODUCT.fields_by_name['variants']._options = None
  _PRODUCT.fields_by_name['variants']._serialized_options = b'\340A\003'
  _PRODUCT.fields_by_name['local_inventories']._options = None
  _PRODUCT.fields_by_name['local_inventories']._serialized_options = b'\340A\003'
  _PRODUCT._options = None
  _PRODUCT._serialized_options = b'\352A\200\001\n\035retail.googleapis.com/Product\022_projects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}/products/{product}'
  _PRODUCT._serialized_start=333
  _PRODUCT._serialized_end=2088
  _PRODUCT_ATTRIBUTESENTRY._serialized_start=1670
  _PRODUCT_ATTRIBUTESENTRY._serialized_end=1760
  _PRODUCT_TYPE._serialized_start=1762
  _PRODUCT_TYPE._serialized_end=1832
  _PRODUCT_AVAILABILITY._serialized_start=1834
  _PRODUCT_AVAILABILITY._serialized_end=1939
# @@protoc_insertion_point(module_scope)
