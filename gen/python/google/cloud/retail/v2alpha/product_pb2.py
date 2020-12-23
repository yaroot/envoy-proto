# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/product.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2alpha import common_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/retail/v2alpha/product.proto',
  package='google.cloud.retail.v2alpha',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.retail.v2alphaB\014ProductProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha\352Al\n\034retail.googleapis.com/Branch\022Lprojects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)google/cloud/retail/v2alpha/product.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/retail/v2alpha/common.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xea\x07\n\x07Product\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x0f\n\x02id\x18\x02 \x01(\tB\x03\xe0\x41\x05\x12<\n\x04type\x18\x03 \x01(\x0e\x32).google.cloud.retail.v2alpha.Product.TypeB\x03\xe0\x41\x05\x12\x1a\n\x12primary_product_id\x18\x04 \x01(\t\x12\x12\n\ncategories\x18\x07 \x03(\t\x12\x12\n\x05title\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\n \x01(\t\x12H\n\nattributes\x18\x0c \x03(\x0b\x32\x34.google.cloud.retail.v2alpha.Product.AttributesEntry\x12\x0c\n\x04tags\x18\r \x03(\t\x12:\n\nprice_info\x18\x0e \x01(\x0b\x32&.google.cloud.retail.v2alpha.PriceInfo\x12\x32\n\x0e\x61vailable_time\x18\x12 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12G\n\x0c\x61vailability\x18\x13 \x01(\x0e\x32\x31.google.cloud.retail.v2alpha.Product.Availability\x12\x37\n\x12\x61vailable_quantity\x18\x14 \x01(\x0b\x32\x1b.google.protobuf.Int32Value\x12\x0b\n\x03uri\x18\x16 \x01(\t\x12\x32\n\x06images\x18\x17 \x03(\x0b\x32\".google.cloud.retail.v2alpha.Image\x1a_\n\x0f\x41ttributesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12;\n\x05value\x18\x02 \x01(\x0b\x32,.google.cloud.retail.v2alpha.CustomAttribute:\x02\x38\x01\"F\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PRIMARY\x10\x01\x12\x0b\n\x07VARIANT\x10\x02\x12\x0e\n\nCOLLECTION\x10\x03\"i\n\x0c\x41vailability\x12\x1c\n\x18\x41VAILABILITY_UNSPECIFIED\x10\x00\x12\x0c\n\x08IN_STOCK\x10\x01\x12\x10\n\x0cOUT_OF_STOCK\x10\x02\x12\x0c\n\x08PREORDER\x10\x03\x12\r\n\tBACKORDER\x10\x04:\x84\x01\xea\x41\x80\x01\n\x1dretail.googleapis.com/Product\x12_projects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}/products/{product}B\xc9\x02\n\x1f\x63om.google.cloud.retail.v2alphaB\x0cProductProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alpha\xea\x41l\n\x1cretail.googleapis.com/Branch\x12Lprojects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,])



_PRODUCT_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='google.cloud.retail.v2alpha.Product.Type',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PRIMARY', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VARIANT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COLLECTION', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=996,
  serialized_end=1066,
)
_sym_db.RegisterEnumDescriptor(_PRODUCT_TYPE)

_PRODUCT_AVAILABILITY = _descriptor.EnumDescriptor(
  name='Availability',
  full_name='google.cloud.retail.v2alpha.Product.Availability',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='AVAILABILITY_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='IN_STOCK', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OUT_OF_STOCK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PREORDER', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BACKORDER', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1068,
  serialized_end=1173,
)
_sym_db.RegisterEnumDescriptor(_PRODUCT_AVAILABILITY)


_PRODUCT_ATTRIBUTESENTRY = _descriptor.Descriptor(
  name='AttributesEntry',
  full_name='google.cloud.retail.v2alpha.Product.AttributesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.retail.v2alpha.Product.AttributesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.retail.v2alpha.Product.AttributesEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=899,
  serialized_end=994,
)

_PRODUCT = _descriptor.Descriptor(
  name='Product',
  full_name='google.cloud.retail.v2alpha.Product',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.retail.v2alpha.Product.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.retail.v2alpha.Product.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.retail.v2alpha.Product.type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='primary_product_id', full_name='google.cloud.retail.v2alpha.Product.primary_product_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='categories', full_name='google.cloud.retail.v2alpha.Product.categories', index=4,
      number=7, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='title', full_name='google.cloud.retail.v2alpha.Product.title', index=5,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.retail.v2alpha.Product.description', index=6,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attributes', full_name='google.cloud.retail.v2alpha.Product.attributes', index=7,
      number=12, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tags', full_name='google.cloud.retail.v2alpha.Product.tags', index=8,
      number=13, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='price_info', full_name='google.cloud.retail.v2alpha.Product.price_info', index=9,
      number=14, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='available_time', full_name='google.cloud.retail.v2alpha.Product.available_time', index=10,
      number=18, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='availability', full_name='google.cloud.retail.v2alpha.Product.availability', index=11,
      number=19, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='available_quantity', full_name='google.cloud.retail.v2alpha.Product.available_quantity', index=12,
      number=20, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='uri', full_name='google.cloud.retail.v2alpha.Product.uri', index=13,
      number=22, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='images', full_name='google.cloud.retail.v2alpha.Product.images', index=14,
      number=23, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PRODUCT_ATTRIBUTESENTRY, ],
  enum_types=[
    _PRODUCT_TYPE,
    _PRODUCT_AVAILABILITY,
  ],
  serialized_options=b'\352A\200\001\n\035retail.googleapis.com/Product\022_projects/{project}/locations/{location}/catalogs/{catalog}/branches/{branch}/products/{product}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=306,
  serialized_end=1308,
)

_PRODUCT_ATTRIBUTESENTRY.fields_by_name['value'].message_type = google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2._CUSTOMATTRIBUTE
_PRODUCT_ATTRIBUTESENTRY.containing_type = _PRODUCT
_PRODUCT.fields_by_name['type'].enum_type = _PRODUCT_TYPE
_PRODUCT.fields_by_name['attributes'].message_type = _PRODUCT_ATTRIBUTESENTRY
_PRODUCT.fields_by_name['price_info'].message_type = google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2._PRICEINFO
_PRODUCT.fields_by_name['available_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_PRODUCT.fields_by_name['availability'].enum_type = _PRODUCT_AVAILABILITY
_PRODUCT.fields_by_name['available_quantity'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT32VALUE
_PRODUCT.fields_by_name['images'].message_type = google_dot_cloud_dot_retail_dot_v2alpha_dot_common__pb2._IMAGE
_PRODUCT_TYPE.containing_type = _PRODUCT
_PRODUCT_AVAILABILITY.containing_type = _PRODUCT
DESCRIPTOR.message_types_by_name['Product'] = _PRODUCT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Product = _reflection.GeneratedProtocolMessageType('Product', (_message.Message,), {

  'AttributesEntry' : _reflection.GeneratedProtocolMessageType('AttributesEntry', (_message.Message,), {
    'DESCRIPTOR' : _PRODUCT_ATTRIBUTESENTRY,
    '__module__' : 'google.cloud.retail.v2alpha.product_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.Product.AttributesEntry)
    })
  ,
  'DESCRIPTOR' : _PRODUCT,
  '__module__' : 'google.cloud.retail.v2alpha.product_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.Product)
  })
_sym_db.RegisterMessage(Product)
_sym_db.RegisterMessage(Product.AttributesEntry)


DESCRIPTOR._options = None
_PRODUCT_ATTRIBUTESENTRY._options = None
_PRODUCT.fields_by_name['name']._options = None
_PRODUCT.fields_by_name['id']._options = None
_PRODUCT.fields_by_name['type']._options = None
_PRODUCT.fields_by_name['title']._options = None
_PRODUCT._options = None
# @@protoc_insertion_point(module_scope)