# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/appengine/v1beta/domain_mapping.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/appengine/v1beta/domain_mapping.proto\x12\x17google.appengine.v1beta\"\xa8\x01\n\rDomainMapping\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\n\n\x02id\x18\x02 \x01(\t\x12:\n\x0cssl_settings\x18\x03 \x01(\x0b\x32$.google.appengine.v1beta.SslSettings\x12\x41\n\x10resource_records\x18\x04 \x03(\x0b\x32\'.google.appengine.v1beta.ResourceRecord\"\xd2\x01\n\x0bSslSettings\x12\x16\n\x0e\x63\x65rtificate_id\x18\x01 \x01(\t\x12S\n\x13ssl_management_type\x18\x03 \x01(\x0e\x32\x36.google.appengine.v1beta.SslSettings.SslManagementType\x12&\n\x1epending_managed_certificate_id\x18\x04 \x01(\t\".\n\x11SslManagementType\x12\r\n\tAUTOMATIC\x10\x00\x12\n\n\x06MANUAL\x10\x01\"\x9a\x01\n\x0eResourceRecord\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06rrdata\x18\x02 \x01(\t\x12@\n\x04type\x18\x03 \x01(\x0e\x32\x32.google.appengine.v1beta.ResourceRecord.RecordType\"(\n\nRecordType\x12\x05\n\x01\x41\x10\x00\x12\x08\n\x04\x41\x41\x41\x41\x10\x01\x12\t\n\x05\x43NAME\x10\x02\x42\xd8\x01\n\x1b\x63om.google.appengine.v1betaB\x12\x44omainMappingProtoP\x01Z@google.golang.org/genproto/googleapis/appengine/v1beta;appengine\xaa\x02\x1dGoogle.Cloud.AppEngine.V1Beta\xca\x02\x1dGoogle\\Cloud\\AppEngine\\V1beta\xea\x02 Google::Cloud::AppEngine::V1betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.appengine.v1beta.domain_mapping_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.google.appengine.v1betaB\022DomainMappingProtoP\001Z@google.golang.org/genproto/googleapis/appengine/v1beta;appengine\252\002\035Google.Cloud.AppEngine.V1Beta\312\002\035Google\\Cloud\\AppEngine\\V1beta\352\002 Google::Cloud::AppEngine::V1beta'
  _DOMAINMAPPING._serialized_start=74
  _DOMAINMAPPING._serialized_end=242
  _SSLSETTINGS._serialized_start=245
  _SSLSETTINGS._serialized_end=455
  _SSLSETTINGS_SSLMANAGEMENTTYPE._serialized_start=409
  _SSLSETTINGS_SSLMANAGEMENTTYPE._serialized_end=455
  _RESOURCERECORD._serialized_start=458
  _RESOURCERECORD._serialized_end=612
  _RESOURCERECORD_RECORDTYPE._serialized_start=572
  _RESOURCERECORD_RECORDTYPE._serialized_end=612
# @@protoc_insertion_point(module_scope)
