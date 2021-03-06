# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2beta/catalog_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2beta import catalog_pb2 as google_dot_cloud_dot_retail_dot_v2beta_dot_catalog__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/retail/v2beta/catalog_service.proto',
  package='google.cloud.retail.v2beta',
  syntax='proto3',
  serialized_options=b'\n\036com.google.cloud.retail.v2betaB\023CatalogServiceProtoP\001Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::Cloud::Retail::V2beta',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0google/cloud/retail/v2beta/catalog_service.proto\x12\x1agoogle.cloud.retail.v2beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/retail/v2beta/catalog.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"w\n\x13ListCatalogsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"f\n\x14ListCatalogsResponse\x12\x35\n\x08\x63\x61talogs\x18\x01 \x03(\x0b\x32#.google.cloud.retail.v2beta.Catalog\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x82\x01\n\x14UpdateCatalogRequest\x12\x39\n\x07\x63\x61talog\x18\x01 \x01(\x0b\x32#.google.cloud.retail.v2beta.CatalogB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask2\xdc\x03\n\x0e\x43\x61talogService\x12\xb4\x01\n\x0cListCatalogs\x12/.google.cloud.retail.v2beta.ListCatalogsRequest\x1a\x30.google.cloud.retail.v2beta.ListCatalogsResponse\"A\x82\xd3\xe4\x93\x02\x32\x12\x30/v2beta/{parent=projects/*/locations/*}/catalogs\xda\x41\x06parent\x12\xc7\x01\n\rUpdateCatalog\x12\x30.google.cloud.retail.v2beta.UpdateCatalogRequest\x1a#.google.cloud.retail.v2beta.Catalog\"_\x82\xd3\xe4\x93\x02\x43\x32\x38/v2beta/{catalog.name=projects/*/locations/*/catalogs/*}:\x07\x63\x61talog\xda\x41\x13\x63\x61talog,update_mask\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xdc\x01\n\x1e\x63om.google.cloud.retail.v2betaB\x13\x43\x61talogServiceProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/retail/v2beta;retail\xa2\x02\x06RETAIL\xaa\x02\x1aGoogle.Cloud.Retail.V2Beta\xca\x02\x1aGoogle\\Cloud\\Retail\\V2beta\xea\x02\x1dGoogle::Cloud::Retail::V2betab\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_retail_dot_v2beta_dot_catalog__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_LISTCATALOGSREQUEST = _descriptor.Descriptor(
  name='ListCatalogsRequest',
  full_name='google.cloud.retail.v2beta.ListCatalogsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.retail.v2beta.ListCatalogsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!locations.googleapis.com/Location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.retail.v2beta.ListCatalogsRequest.page_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.retail.v2beta.ListCatalogsRequest.page_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_start=333,
  serialized_end=452,
)


_LISTCATALOGSRESPONSE = _descriptor.Descriptor(
  name='ListCatalogsResponse',
  full_name='google.cloud.retail.v2beta.ListCatalogsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='catalogs', full_name='google.cloud.retail.v2beta.ListCatalogsResponse.catalogs', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.retail.v2beta.ListCatalogsResponse.next_page_token', index=1,
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
  serialized_start=454,
  serialized_end=556,
)


_UPDATECATALOGREQUEST = _descriptor.Descriptor(
  name='UpdateCatalogRequest',
  full_name='google.cloud.retail.v2beta.UpdateCatalogRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='catalog', full_name='google.cloud.retail.v2beta.UpdateCatalogRequest.catalog', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.cloud.retail.v2beta.UpdateCatalogRequest.update_mask', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=559,
  serialized_end=689,
)

_LISTCATALOGSRESPONSE.fields_by_name['catalogs'].message_type = google_dot_cloud_dot_retail_dot_v2beta_dot_catalog__pb2._CATALOG
_UPDATECATALOGREQUEST.fields_by_name['catalog'].message_type = google_dot_cloud_dot_retail_dot_v2beta_dot_catalog__pb2._CATALOG
_UPDATECATALOGREQUEST.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
DESCRIPTOR.message_types_by_name['ListCatalogsRequest'] = _LISTCATALOGSREQUEST
DESCRIPTOR.message_types_by_name['ListCatalogsResponse'] = _LISTCATALOGSRESPONSE
DESCRIPTOR.message_types_by_name['UpdateCatalogRequest'] = _UPDATECATALOGREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListCatalogsRequest = _reflection.GeneratedProtocolMessageType('ListCatalogsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTCATALOGSREQUEST,
  '__module__' : 'google.cloud.retail.v2beta.catalog_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.ListCatalogsRequest)
  })
_sym_db.RegisterMessage(ListCatalogsRequest)

ListCatalogsResponse = _reflection.GeneratedProtocolMessageType('ListCatalogsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTCATALOGSRESPONSE,
  '__module__' : 'google.cloud.retail.v2beta.catalog_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.ListCatalogsResponse)
  })
_sym_db.RegisterMessage(ListCatalogsResponse)

UpdateCatalogRequest = _reflection.GeneratedProtocolMessageType('UpdateCatalogRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATECATALOGREQUEST,
  '__module__' : 'google.cloud.retail.v2beta.catalog_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.UpdateCatalogRequest)
  })
_sym_db.RegisterMessage(UpdateCatalogRequest)


DESCRIPTOR._options = None
_LISTCATALOGSREQUEST.fields_by_name['parent']._options = None
_UPDATECATALOGREQUEST.fields_by_name['catalog']._options = None

_CATALOGSERVICE = _descriptor.ServiceDescriptor(
  name='CatalogService',
  full_name='google.cloud.retail.v2beta.CatalogService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=692,
  serialized_end=1168,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListCatalogs',
    full_name='google.cloud.retail.v2beta.CatalogService.ListCatalogs',
    index=0,
    containing_service=None,
    input_type=_LISTCATALOGSREQUEST,
    output_type=_LISTCATALOGSRESPONSE,
    serialized_options=b'\202\323\344\223\0022\0220/v2beta/{parent=projects/*/locations/*}/catalogs\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateCatalog',
    full_name='google.cloud.retail.v2beta.CatalogService.UpdateCatalog',
    index=1,
    containing_service=None,
    input_type=_UPDATECATALOGREQUEST,
    output_type=google_dot_cloud_dot_retail_dot_v2beta_dot_catalog__pb2._CATALOG,
    serialized_options=b'\202\323\344\223\002C28/v2beta/{catalog.name=projects/*/locations/*/catalogs/*}:\007catalog\332A\023catalog,update_mask',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CATALOGSERVICE)

DESCRIPTOR.services_by_name['CatalogService'] = _CATALOGSERVICE

# @@protoc_insertion_point(module_scope)
