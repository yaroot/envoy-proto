# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2beta/product_service.proto
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
from google.cloud.retail.v2beta import common_pb2 as google_dot_cloud_dot_retail_dot_v2beta_dot_common__pb2
from google.cloud.retail.v2beta import import_config_pb2 as google_dot_cloud_dot_retail_dot_v2beta_dot_import__config__pb2
from google.cloud.retail.v2beta import product_pb2 as google_dot_cloud_dot_retail_dot_v2beta_dot_product__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/retail/v2beta/product_service.proto\x12\x1agoogle.cloud.retail.v2beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\'google/cloud/retail/v2beta/common.proto\x1a.google/cloud/retail/v2beta/import_config.proto\x1a(google/cloud/retail/v2beta/product.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa0\x01\n\x14\x43reateProductRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1cretail.googleapis.com/Branch\x12\x39\n\x07product\x18\x02 \x01(\x0b\x32#.google.cloud.retail.v2beta.ProductB\x03\xe0\x41\x02\x12\x17\n\nproduct_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"H\n\x11GetProductRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Product\"\x99\x01\n\x14UpdateProductRequest\x12\x39\n\x07product\x18\x01 \x01(\x0b\x32#.google.cloud.retail.v2beta.ProductB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"K\n\x14\x44\x65leteProductRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Product\"\xb1\x01\n\x13ListProductsRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1cretail.googleapis.com/Branch\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"f\n\x14ListProductsResponse\x12\x35\n\x08products\x18\x01 \x03(\x0b\x32#.google.cloud.retail.v2beta.Product\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xc5\x01\n\x13SetInventoryRequest\x12;\n\tinventory\x18\x01 \x01(\x0b\x32#.google.cloud.retail.v2beta.ProductB\x03\xe0\x41\x02\x12,\n\x08set_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12,\n\x08set_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rallow_missing\x18\x04 \x01(\x08\"\x16\n\x14SetInventoryMetadata\"\x16\n\x14SetInventoryResponse\"\xc5\x01\n\x1b\x41\x64\x64\x46ulfillmentPlacesRequest\x12\x36\n\x07product\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Product\x12\x11\n\x04type\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tplace_ids\x18\x03 \x03(\tB\x03\xe0\x41\x02\x12,\n\x08\x61\x64\x64_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rallow_missing\x18\x05 \x01(\x08\"\x1e\n\x1c\x41\x64\x64\x46ulfillmentPlacesMetadata\"\x1e\n\x1c\x41\x64\x64\x46ulfillmentPlacesResponse\"\x93\x02\n\x1a\x41\x64\x64LocalInventoriesRequest\x12\x36\n\x07product\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Product\x12J\n\x11local_inventories\x18\x02 \x03(\x0b\x32*.google.cloud.retail.v2beta.LocalInventoryB\x03\xe0\x41\x02\x12,\n\x08\x61\x64\x64_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12,\n\x08\x61\x64\x64_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rallow_missing\x18\x06 \x01(\x08\"\x1d\n\x1b\x41\x64\x64LocalInventoriesMetadata\"\x1d\n\x1b\x41\x64\x64LocalInventoriesResponse\"\xb7\x01\n\x1dRemoveLocalInventoriesRequest\x12\x36\n\x07product\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Product\x12\x16\n\tplace_ids\x18\x02 \x03(\tB\x03\xe0\x41\x02\x12/\n\x0bremove_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\" \n\x1eRemoveLocalInventoriesMetadata\" \n\x1eRemoveLocalInventoriesResponse\"\xcb\x01\n\x1eRemoveFulfillmentPlacesRequest\x12\x36\n\x07product\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Product\x12\x11\n\x04type\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tplace_ids\x18\x03 \x03(\tB\x03\xe0\x41\x02\x12/\n\x0bremove_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x15\n\rallow_missing\x18\x05 \x01(\x08\"!\n\x1fRemoveFulfillmentPlacesMetadata\"!\n\x1fRemoveFulfillmentPlacesResponse2\xc6\x18\n\x0eProductService\x12\xdb\x01\n\rCreateProduct\x12\x30.google.cloud.retail.v2beta.CreateProductRequest\x1a#.google.cloud.retail.v2beta.Product\"s\x82\xd3\xe4\x93\x02Q\"F/v2beta/{parent=projects/*/locations/*/catalogs/*/branches/*}/products:\x07product\xda\x41\x19parent,product,product_id\x12\xb8\x01\n\nGetProduct\x12-.google.cloud.retail.v2beta.GetProductRequest\x1a#.google.cloud.retail.v2beta.Product\"V\x82\xd3\xe4\x93\x02I\x12G/v2beta/{name=projects/*/locations/*/catalogs/*/branches/*/products/**}\xda\x41\x04name\x12\xca\x01\n\x0cListProducts\x12/.google.cloud.retail.v2beta.ListProductsRequest\x1a\x30.google.cloud.retail.v2beta.ListProductsResponse\"W\x82\xd3\xe4\x93\x02H\x12\x46/v2beta/{parent=projects/*/locations/*/catalogs/*/branches/*}/products\xda\x41\x06parent\x12\xde\x01\n\rUpdateProduct\x12\x30.google.cloud.retail.v2beta.UpdateProductRequest\x1a#.google.cloud.retail.v2beta.Product\"v\x82\xd3\xe4\x93\x02Z2O/v2beta/{product.name=projects/*/locations/*/catalogs/*/branches/*/products/**}:\x07product\xda\x41\x13product,update_mask\x12\xb1\x01\n\rDeleteProduct\x12\x30.google.cloud.retail.v2beta.DeleteProductRequest\x1a\x16.google.protobuf.Empty\"V\x82\xd3\xe4\x93\x02I*G/v2beta/{name=projects/*/locations/*/catalogs/*/branches/*/products/**}\xda\x41\x04name\x12\x9e\x02\n\x0eImportProducts\x12\x31.google.cloud.retail.v2beta.ImportProductsRequest\x1a\x1d.google.longrunning.Operation\"\xb9\x01\x82\xd3\xe4\x93\x02R\"M/v2beta/{parent=projects/*/locations/*/catalogs/*/branches/*}/products:import:\x01*\xca\x41^\n1google.cloud.retail.v2beta.ImportProductsResponse\x12)google.cloud.retail.v2beta.ImportMetadata\x12\xc4\x02\n\x0cSetInventory\x12/.google.cloud.retail.v2beta.SetInventoryRequest\x1a\x1d.google.longrunning.Operation\"\xe3\x01\x82\xd3\xe4\x93\x02\x63\"^/v2beta/{inventory.name=projects/*/locations/*/catalogs/*/branches/*/products/**}:setInventory:\x01*\xda\x41\x12inventory,set_mask\xca\x41\x62\n/google.cloud.retail.v2beta.SetInventoryResponse\x12/google.cloud.retail.v2beta.SetInventoryMetadata\x12\xda\x02\n\x14\x41\x64\x64\x46ulfillmentPlaces\x12\x37.google.cloud.retail.v2beta.AddFulfillmentPlacesRequest\x1a\x1d.google.longrunning.Operation\"\xe9\x01\x82\xd3\xe4\x93\x02\x64\"_/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:addFulfillmentPlaces:\x01*\xda\x41\x07product\xca\x41r\n7google.cloud.retail.v2beta.AddFulfillmentPlacesResponse\x12\x37google.cloud.retail.v2beta.AddFulfillmentPlacesMetadata\x12\xe9\x02\n\x17RemoveFulfillmentPlaces\x12:.google.cloud.retail.v2beta.RemoveFulfillmentPlacesRequest\x1a\x1d.google.longrunning.Operation\"\xf2\x01\x82\xd3\xe4\x93\x02g\"b/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:removeFulfillmentPlaces:\x01*\xda\x41\x07product\xca\x41x\n:google.cloud.retail.v2beta.RemoveFulfillmentPlacesResponse\x12:google.cloud.retail.v2beta.RemoveFulfillmentPlacesMetadata\x12\xd5\x02\n\x13\x41\x64\x64LocalInventories\x12\x36.google.cloud.retail.v2beta.AddLocalInventoriesRequest\x1a\x1d.google.longrunning.Operation\"\xe6\x01\x82\xd3\xe4\x93\x02\x63\"^/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:addLocalInventories:\x01*\xda\x41\x07product\xca\x41p\n6google.cloud.retail.v2beta.AddLocalInventoriesResponse\x12\x36google.cloud.retail.v2beta.AddLocalInventoriesMetadata\x12\xe4\x02\n\x16RemoveLocalInventories\x12\x39.google.cloud.retail.v2beta.RemoveLocalInventoriesRequest\x1a\x1d.google.longrunning.Operation\"\xef\x01\x82\xd3\xe4\x93\x02\x66\"a/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:removeLocalInventories:\x01*\xda\x41\x07product\xca\x41v\n9google.cloud.retail.v2beta.RemoveLocalInventoriesResponse\x12\x39google.cloud.retail.v2beta.RemoveLocalInventoriesMetadata\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xdc\x01\n\x1e\x63om.google.cloud.retail.v2betaB\x13ProductServiceProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\xa2\x02\x06RETAIL\xaa\x02\x1aGoogle.Cloud.Retail.V2Beta\xca\x02\x1aGoogle\\Cloud\\Retail\\V2beta\xea\x02\x1dGoogle::Cloud::Retail::V2betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2beta.product_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.retail.v2betaB\023ProductServiceProtoP\001Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::Cloud::Retail::V2beta'
  _CREATEPRODUCTREQUEST.fields_by_name['parent']._options = None
  _CREATEPRODUCTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034retail.googleapis.com/Branch'
  _CREATEPRODUCTREQUEST.fields_by_name['product']._options = None
  _CREATEPRODUCTREQUEST.fields_by_name['product']._serialized_options = b'\340A\002'
  _CREATEPRODUCTREQUEST.fields_by_name['product_id']._options = None
  _CREATEPRODUCTREQUEST.fields_by_name['product_id']._serialized_options = b'\340A\002'
  _GETPRODUCTREQUEST.fields_by_name['name']._options = None
  _GETPRODUCTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Product'
  _UPDATEPRODUCTREQUEST.fields_by_name['product']._options = None
  _UPDATEPRODUCTREQUEST.fields_by_name['product']._serialized_options = b'\340A\002'
  _DELETEPRODUCTREQUEST.fields_by_name['name']._options = None
  _DELETEPRODUCTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Product'
  _LISTPRODUCTSREQUEST.fields_by_name['parent']._options = None
  _LISTPRODUCTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034retail.googleapis.com/Branch'
  _SETINVENTORYREQUEST.fields_by_name['inventory']._options = None
  _SETINVENTORYREQUEST.fields_by_name['inventory']._serialized_options = b'\340A\002'
  _ADDFULFILLMENTPLACESREQUEST.fields_by_name['product']._options = None
  _ADDFULFILLMENTPLACESREQUEST.fields_by_name['product']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Product'
  _ADDFULFILLMENTPLACESREQUEST.fields_by_name['type']._options = None
  _ADDFULFILLMENTPLACESREQUEST.fields_by_name['type']._serialized_options = b'\340A\002'
  _ADDFULFILLMENTPLACESREQUEST.fields_by_name['place_ids']._options = None
  _ADDFULFILLMENTPLACESREQUEST.fields_by_name['place_ids']._serialized_options = b'\340A\002'
  _ADDLOCALINVENTORIESREQUEST.fields_by_name['product']._options = None
  _ADDLOCALINVENTORIESREQUEST.fields_by_name['product']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Product'
  _ADDLOCALINVENTORIESREQUEST.fields_by_name['local_inventories']._options = None
  _ADDLOCALINVENTORIESREQUEST.fields_by_name['local_inventories']._serialized_options = b'\340A\002'
  _REMOVELOCALINVENTORIESREQUEST.fields_by_name['product']._options = None
  _REMOVELOCALINVENTORIESREQUEST.fields_by_name['product']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Product'
  _REMOVELOCALINVENTORIESREQUEST.fields_by_name['place_ids']._options = None
  _REMOVELOCALINVENTORIESREQUEST.fields_by_name['place_ids']._serialized_options = b'\340A\002'
  _REMOVEFULFILLMENTPLACESREQUEST.fields_by_name['product']._options = None
  _REMOVEFULFILLMENTPLACESREQUEST.fields_by_name['product']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Product'
  _REMOVEFULFILLMENTPLACESREQUEST.fields_by_name['type']._options = None
  _REMOVEFULFILLMENTPLACESREQUEST.fields_by_name['type']._serialized_options = b'\340A\002'
  _REMOVEFULFILLMENTPLACESREQUEST.fields_by_name['place_ids']._options = None
  _REMOVEFULFILLMENTPLACESREQUEST.fields_by_name['place_ids']._serialized_options = b'\340A\002'
  _PRODUCTSERVICE._options = None
  _PRODUCTSERVICE._serialized_options = b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _PRODUCTSERVICE.methods_by_name['CreateProduct']._options = None
  _PRODUCTSERVICE.methods_by_name['CreateProduct']._serialized_options = b'\202\323\344\223\002Q\"F/v2beta/{parent=projects/*/locations/*/catalogs/*/branches/*}/products:\007product\332A\031parent,product,product_id'
  _PRODUCTSERVICE.methods_by_name['GetProduct']._options = None
  _PRODUCTSERVICE.methods_by_name['GetProduct']._serialized_options = b'\202\323\344\223\002I\022G/v2beta/{name=projects/*/locations/*/catalogs/*/branches/*/products/**}\332A\004name'
  _PRODUCTSERVICE.methods_by_name['ListProducts']._options = None
  _PRODUCTSERVICE.methods_by_name['ListProducts']._serialized_options = b'\202\323\344\223\002H\022F/v2beta/{parent=projects/*/locations/*/catalogs/*/branches/*}/products\332A\006parent'
  _PRODUCTSERVICE.methods_by_name['UpdateProduct']._options = None
  _PRODUCTSERVICE.methods_by_name['UpdateProduct']._serialized_options = b'\202\323\344\223\002Z2O/v2beta/{product.name=projects/*/locations/*/catalogs/*/branches/*/products/**}:\007product\332A\023product,update_mask'
  _PRODUCTSERVICE.methods_by_name['DeleteProduct']._options = None
  _PRODUCTSERVICE.methods_by_name['DeleteProduct']._serialized_options = b'\202\323\344\223\002I*G/v2beta/{name=projects/*/locations/*/catalogs/*/branches/*/products/**}\332A\004name'
  _PRODUCTSERVICE.methods_by_name['ImportProducts']._options = None
  _PRODUCTSERVICE.methods_by_name['ImportProducts']._serialized_options = b'\202\323\344\223\002R\"M/v2beta/{parent=projects/*/locations/*/catalogs/*/branches/*}/products:import:\001*\312A^\n1google.cloud.retail.v2beta.ImportProductsResponse\022)google.cloud.retail.v2beta.ImportMetadata'
  _PRODUCTSERVICE.methods_by_name['SetInventory']._options = None
  _PRODUCTSERVICE.methods_by_name['SetInventory']._serialized_options = b'\202\323\344\223\002c\"^/v2beta/{inventory.name=projects/*/locations/*/catalogs/*/branches/*/products/**}:setInventory:\001*\332A\022inventory,set_mask\312Ab\n/google.cloud.retail.v2beta.SetInventoryResponse\022/google.cloud.retail.v2beta.SetInventoryMetadata'
  _PRODUCTSERVICE.methods_by_name['AddFulfillmentPlaces']._options = None
  _PRODUCTSERVICE.methods_by_name['AddFulfillmentPlaces']._serialized_options = b'\202\323\344\223\002d\"_/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:addFulfillmentPlaces:\001*\332A\007product\312Ar\n7google.cloud.retail.v2beta.AddFulfillmentPlacesResponse\0227google.cloud.retail.v2beta.AddFulfillmentPlacesMetadata'
  _PRODUCTSERVICE.methods_by_name['RemoveFulfillmentPlaces']._options = None
  _PRODUCTSERVICE.methods_by_name['RemoveFulfillmentPlaces']._serialized_options = b'\202\323\344\223\002g\"b/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:removeFulfillmentPlaces:\001*\332A\007product\312Ax\n:google.cloud.retail.v2beta.RemoveFulfillmentPlacesResponse\022:google.cloud.retail.v2beta.RemoveFulfillmentPlacesMetadata'
  _PRODUCTSERVICE.methods_by_name['AddLocalInventories']._options = None
  _PRODUCTSERVICE.methods_by_name['AddLocalInventories']._serialized_options = b'\202\323\344\223\002c\"^/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:addLocalInventories:\001*\332A\007product\312Ap\n6google.cloud.retail.v2beta.AddLocalInventoriesResponse\0226google.cloud.retail.v2beta.AddLocalInventoriesMetadata'
  _PRODUCTSERVICE.methods_by_name['RemoveLocalInventories']._options = None
  _PRODUCTSERVICE.methods_by_name['RemoveLocalInventories']._serialized_options = b'\202\323\344\223\002f\"a/v2beta/{product=projects/*/locations/*/catalogs/*/branches/*/products/**}:removeLocalInventories:\001*\332A\007product\312Av\n9google.cloud.retail.v2beta.RemoveLocalInventoriesResponse\0229google.cloud.retail.v2beta.RemoveLocalInventoriesMetadata'
  _CREATEPRODUCTREQUEST._serialized_start=460
  _CREATEPRODUCTREQUEST._serialized_end=620
  _GETPRODUCTREQUEST._serialized_start=622
  _GETPRODUCTREQUEST._serialized_end=694
  _UPDATEPRODUCTREQUEST._serialized_start=697
  _UPDATEPRODUCTREQUEST._serialized_end=850
  _DELETEPRODUCTREQUEST._serialized_start=852
  _DELETEPRODUCTREQUEST._serialized_end=927
  _LISTPRODUCTSREQUEST._serialized_start=930
  _LISTPRODUCTSREQUEST._serialized_end=1107
  _LISTPRODUCTSRESPONSE._serialized_start=1109
  _LISTPRODUCTSRESPONSE._serialized_end=1211
  _SETINVENTORYREQUEST._serialized_start=1214
  _SETINVENTORYREQUEST._serialized_end=1411
  _SETINVENTORYMETADATA._serialized_start=1413
  _SETINVENTORYMETADATA._serialized_end=1435
  _SETINVENTORYRESPONSE._serialized_start=1437
  _SETINVENTORYRESPONSE._serialized_end=1459
  _ADDFULFILLMENTPLACESREQUEST._serialized_start=1462
  _ADDFULFILLMENTPLACESREQUEST._serialized_end=1659
  _ADDFULFILLMENTPLACESMETADATA._serialized_start=1661
  _ADDFULFILLMENTPLACESMETADATA._serialized_end=1691
  _ADDFULFILLMENTPLACESRESPONSE._serialized_start=1693
  _ADDFULFILLMENTPLACESRESPONSE._serialized_end=1723
  _ADDLOCALINVENTORIESREQUEST._serialized_start=1726
  _ADDLOCALINVENTORIESREQUEST._serialized_end=2001
  _ADDLOCALINVENTORIESMETADATA._serialized_start=2003
  _ADDLOCALINVENTORIESMETADATA._serialized_end=2032
  _ADDLOCALINVENTORIESRESPONSE._serialized_start=2034
  _ADDLOCALINVENTORIESRESPONSE._serialized_end=2063
  _REMOVELOCALINVENTORIESREQUEST._serialized_start=2066
  _REMOVELOCALINVENTORIESREQUEST._serialized_end=2249
  _REMOVELOCALINVENTORIESMETADATA._serialized_start=2251
  _REMOVELOCALINVENTORIESMETADATA._serialized_end=2283
  _REMOVELOCALINVENTORIESRESPONSE._serialized_start=2285
  _REMOVELOCALINVENTORIESRESPONSE._serialized_end=2317
  _REMOVEFULFILLMENTPLACESREQUEST._serialized_start=2320
  _REMOVEFULFILLMENTPLACESREQUEST._serialized_end=2523
  _REMOVEFULFILLMENTPLACESMETADATA._serialized_start=2525
  _REMOVEFULFILLMENTPLACESMETADATA._serialized_end=2558
  _REMOVEFULFILLMENTPLACESRESPONSE._serialized_start=2560
  _REMOVEFULFILLMENTPLACESRESPONSE._serialized_end=2593
  _PRODUCTSERVICE._serialized_start=2596
  _PRODUCTSERVICE._serialized_end=5738
# @@protoc_insertion_point(module_scope)
