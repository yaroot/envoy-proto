# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/upgrade.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from grafeas.v1 import package_pb2 as grafeas_dot_v1_dot_package__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18grafeas/v1/upgrade.proto\x12\ngrafeas.v1\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x18grafeas/v1/package.proto\"\xaf\x01\n\x0bUpgradeNote\x12\x0f\n\x07package\x18\x01 \x01(\t\x12$\n\x07version\x18\x02 \x01(\x0b\x32\x13.grafeas.v1.Version\x12\x36\n\rdistributions\x18\x03 \x03(\x0b\x32\x1f.grafeas.v1.UpgradeDistribution\x12\x31\n\x0ewindows_update\x18\x04 \x01(\x0b\x32\x19.grafeas.v1.WindowsUpdate\"]\n\x13UpgradeDistribution\x12\x0f\n\x07\x63pe_uri\x18\x01 \x01(\t\x12\x16\n\x0e\x63lassification\x18\x02 \x01(\t\x12\x10\n\x08severity\x18\x03 \x01(\t\x12\x0b\n\x03\x63ve\x18\x04 \x03(\t\"\xec\x02\n\rWindowsUpdate\x12\x34\n\x08identity\x18\x01 \x01(\x0b\x32\".grafeas.v1.WindowsUpdate.Identity\x12\r\n\x05title\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x36\n\ncategories\x18\x04 \x03(\x0b\x32\".grafeas.v1.WindowsUpdate.Category\x12\x16\n\x0ekb_article_ids\x18\x05 \x03(\t\x12\x13\n\x0bsupport_url\x18\x06 \x01(\t\x12<\n\x18last_published_timestamp\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1a/\n\x08Identity\x12\x11\n\tupdate_id\x18\x01 \x01(\t\x12\x10\n\x08revision\x18\x02 \x01(\x05\x1a-\n\x08\x43\x61tegory\x12\x13\n\x0b\x63\x61tegory_id\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\"\xbb\x01\n\x11UpgradeOccurrence\x12\x0f\n\x07package\x18\x01 \x01(\t\x12+\n\x0eparsed_version\x18\x03 \x01(\x0b\x32\x13.grafeas.v1.Version\x12\x35\n\x0c\x64istribution\x18\x04 \x01(\x0b\x32\x1f.grafeas.v1.UpgradeDistribution\x12\x31\n\x0ewindows_update\x18\x05 \x01(\x0b\x32\x19.grafeas.v1.WindowsUpdateBQ\n\rio.grafeas.v1P\x01Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'grafeas.v1.upgrade_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rio.grafeas.v1P\001Z8google.golang.org/genproto/googleapis/grafeas/v1;grafeas\242\002\003GRA'
  _UPGRADENOTE._serialized_start=100
  _UPGRADENOTE._serialized_end=275
  _UPGRADEDISTRIBUTION._serialized_start=277
  _UPGRADEDISTRIBUTION._serialized_end=370
  _WINDOWSUPDATE._serialized_start=373
  _WINDOWSUPDATE._serialized_end=737
  _WINDOWSUPDATE_IDENTITY._serialized_start=643
  _WINDOWSUPDATE_IDENTITY._serialized_end=690
  _WINDOWSUPDATE_CATEGORY._serialized_start=692
  _WINDOWSUPDATE_CATEGORY._serialized_end=737
  _UPGRADEOCCURRENCE._serialized_start=740
  _UPGRADEOCCURRENCE._serialized_end=927
# @@protoc_insertion_point(module_scope)