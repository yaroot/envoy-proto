# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommendationengine/v1beta1/catalog.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.recommendationengine.v1beta1 import common_pb2 as google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_common__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7google/cloud/recommendationengine/v1beta1/catalog.proto\x12)google.cloud.recommendationengine.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x36google/cloud/recommendationengine/v1beta1/common.proto\"\xfe\x03\n\x0b\x43\x61talogItem\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12k\n\x14\x63\x61tegory_hierarchies\x18\x02 \x03(\x0b\x32H.google.cloud.recommendationengine.v1beta1.CatalogItem.CategoryHierarchyB\x03\xe0\x41\x02\x12\x12\n\x05title\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12S\n\x0fitem_attributes\x18\x05 \x01(\x0b\x32\x35.google.cloud.recommendationengine.v1beta1.FeatureMapB\x03\xe0\x41\x01\x12\x1a\n\rlanguage_code\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12\x11\n\x04tags\x18\x08 \x03(\tB\x03\xe0\x41\x01\x12\x1a\n\ritem_group_id\x18\t \x01(\tB\x03\xe0\x41\x01\x12^\n\x10product_metadata\x18\n \x01(\x0b\x32=.google.cloud.recommendationengine.v1beta1.ProductCatalogItemB\x03\xe0\x41\x01H\x00\x1a,\n\x11\x43\x61tegoryHierarchy\x12\x17\n\ncategories\x18\x01 \x03(\tB\x03\xe0\x41\x02\x42\x15\n\x13recommendation_type\"\xe6\x06\n\x12ProductCatalogItem\x12\x64\n\x0b\x65xact_price\x18\x01 \x01(\x0b\x32H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.ExactPriceB\x03\xe0\x41\x01H\x00\x12\x64\n\x0bprice_range\x18\x02 \x01(\x0b\x32H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.PriceRangeB\x03\xe0\x41\x01H\x00\x12\\\n\x05\x63osts\x18\x03 \x03(\x0b\x32H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.CostsEntryB\x03\xe0\x41\x01\x12\x1a\n\rcurrency_code\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x62\n\x0bstock_state\x18\x05 \x01(\x0e\x32H.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockStateB\x03\xe0\x41\x01\x12\x1f\n\x12\x61vailable_quantity\x18\x06 \x01(\x03\x42\x03\xe0\x41\x01\x12\"\n\x15\x63\x61nonical_product_uri\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12\x45\n\x06images\x18\x08 \x03(\x0b\x32\x30.google.cloud.recommendationengine.v1beta1.ImageB\x03\xe0\x41\x01\x1a\x45\n\nExactPrice\x12\x1a\n\rdisplay_price\x18\x01 \x01(\x02\x42\x03\xe0\x41\x01\x12\x1b\n\x0eoriginal_price\x18\x02 \x01(\x02\x42\x03\xe0\x41\x01\x1a\x30\n\nPriceRange\x12\x10\n\x03min\x18\x01 \x01(\x02\x42\x03\xe0\x41\x02\x12\x10\n\x03max\x18\x02 \x01(\x02\x42\x03\xe0\x41\x02\x1a,\n\nCostsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x02:\x02\x38\x01\"j\n\nStockState\x12\x1b\n\x17STOCK_STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08IN_STOCK\x10\x00\x12\x10\n\x0cOUT_OF_STOCK\x10\x01\x12\x0c\n\x08PREORDER\x10\x02\x12\r\n\tBACKORDER\x10\x03\x1a\x02\x10\x01\x42\x07\n\x05price\"B\n\x05Image\x12\x10\n\x03uri\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x06height\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x12\n\x05width\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x42\x9f\x02\n-com.google.cloud.recommendationengine.v1beta1P\x01Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\xa2\x02\x05RECAI\xaa\x02)Google.Cloud.RecommendationEngine.V1Beta1\xca\x02)Google\\Cloud\\RecommendationEngine\\V1beta1\xea\x02,Google::Cloud::RecommendationEngine::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.recommendationengine.v1beta1.catalog_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n-com.google.cloud.recommendationengine.v1beta1P\001Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\242\002\005RECAI\252\002)Google.Cloud.RecommendationEngine.V1Beta1\312\002)Google\\Cloud\\RecommendationEngine\\V1beta1\352\002,Google::Cloud::RecommendationEngine::V1beta1'
  _CATALOGITEM_CATEGORYHIERARCHY.fields_by_name['categories']._options = None
  _CATALOGITEM_CATEGORYHIERARCHY.fields_by_name['categories']._serialized_options = b'\340A\002'
  _CATALOGITEM.fields_by_name['id']._options = None
  _CATALOGITEM.fields_by_name['id']._serialized_options = b'\340A\002'
  _CATALOGITEM.fields_by_name['category_hierarchies']._options = None
  _CATALOGITEM.fields_by_name['category_hierarchies']._serialized_options = b'\340A\002'
  _CATALOGITEM.fields_by_name['title']._options = None
  _CATALOGITEM.fields_by_name['title']._serialized_options = b'\340A\002'
  _CATALOGITEM.fields_by_name['description']._options = None
  _CATALOGITEM.fields_by_name['description']._serialized_options = b'\340A\001'
  _CATALOGITEM.fields_by_name['item_attributes']._options = None
  _CATALOGITEM.fields_by_name['item_attributes']._serialized_options = b'\340A\001'
  _CATALOGITEM.fields_by_name['language_code']._options = None
  _CATALOGITEM.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _CATALOGITEM.fields_by_name['tags']._options = None
  _CATALOGITEM.fields_by_name['tags']._serialized_options = b'\340A\001'
  _CATALOGITEM.fields_by_name['item_group_id']._options = None
  _CATALOGITEM.fields_by_name['item_group_id']._serialized_options = b'\340A\001'
  _CATALOGITEM.fields_by_name['product_metadata']._options = None
  _CATALOGITEM.fields_by_name['product_metadata']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM_EXACTPRICE.fields_by_name['display_price']._options = None
  _PRODUCTCATALOGITEM_EXACTPRICE.fields_by_name['display_price']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM_EXACTPRICE.fields_by_name['original_price']._options = None
  _PRODUCTCATALOGITEM_EXACTPRICE.fields_by_name['original_price']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM_PRICERANGE.fields_by_name['min']._options = None
  _PRODUCTCATALOGITEM_PRICERANGE.fields_by_name['min']._serialized_options = b'\340A\002'
  _PRODUCTCATALOGITEM_PRICERANGE.fields_by_name['max']._options = None
  _PRODUCTCATALOGITEM_PRICERANGE.fields_by_name['max']._serialized_options = b'\340A\002'
  _PRODUCTCATALOGITEM_COSTSENTRY._options = None
  _PRODUCTCATALOGITEM_COSTSENTRY._serialized_options = b'8\001'
  _PRODUCTCATALOGITEM_STOCKSTATE._options = None
  _PRODUCTCATALOGITEM_STOCKSTATE._serialized_options = b'\020\001'
  _PRODUCTCATALOGITEM.fields_by_name['exact_price']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['exact_price']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['price_range']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['price_range']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['costs']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['costs']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['currency_code']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['currency_code']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['stock_state']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['stock_state']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['available_quantity']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['available_quantity']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['canonical_product_uri']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['canonical_product_uri']._serialized_options = b'\340A\001'
  _PRODUCTCATALOGITEM.fields_by_name['images']._options = None
  _PRODUCTCATALOGITEM.fields_by_name['images']._serialized_options = b'\340A\001'
  _IMAGE.fields_by_name['uri']._options = None
  _IMAGE.fields_by_name['uri']._serialized_options = b'\340A\002'
  _IMAGE.fields_by_name['height']._options = None
  _IMAGE.fields_by_name['height']._serialized_options = b'\340A\001'
  _IMAGE.fields_by_name['width']._options = None
  _IMAGE.fields_by_name['width']._serialized_options = b'\340A\001'
  _CATALOGITEM._serialized_start=192
  _CATALOGITEM._serialized_end=702
  _CATALOGITEM_CATEGORYHIERARCHY._serialized_start=635
  _CATALOGITEM_CATEGORYHIERARCHY._serialized_end=679
  _PRODUCTCATALOGITEM._serialized_start=705
  _PRODUCTCATALOGITEM._serialized_end=1575
  _PRODUCTCATALOGITEM_EXACTPRICE._serialized_start=1293
  _PRODUCTCATALOGITEM_EXACTPRICE._serialized_end=1362
  _PRODUCTCATALOGITEM_PRICERANGE._serialized_start=1364
  _PRODUCTCATALOGITEM_PRICERANGE._serialized_end=1412
  _PRODUCTCATALOGITEM_COSTSENTRY._serialized_start=1414
  _PRODUCTCATALOGITEM_COSTSENTRY._serialized_end=1458
  _PRODUCTCATALOGITEM_STOCKSTATE._serialized_start=1460
  _PRODUCTCATALOGITEM_STOCKSTATE._serialized_end=1566
  _IMAGE._serialized_start=1577
  _IMAGE._serialized_end=1643
# @@protoc_insertion_point(module_scope)