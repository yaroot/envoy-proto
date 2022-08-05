# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/vision/v1/web_detection.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/vision/v1/web_detection.proto\x12\x16google.cloud.vision.v1\"\xd4\x06\n\x0cWebDetection\x12\x44\n\x0cweb_entities\x18\x01 \x03(\x0b\x32..google.cloud.vision.v1.WebDetection.WebEntity\x12K\n\x14\x66ull_matching_images\x18\x02 \x03(\x0b\x32-.google.cloud.vision.v1.WebDetection.WebImage\x12N\n\x17partial_matching_images\x18\x03 \x03(\x0b\x32-.google.cloud.vision.v1.WebDetection.WebImage\x12P\n\x1apages_with_matching_images\x18\x04 \x03(\x0b\x32,.google.cloud.vision.v1.WebDetection.WebPage\x12N\n\x17visually_similar_images\x18\x06 \x03(\x0b\x32-.google.cloud.vision.v1.WebDetection.WebImage\x12H\n\x11\x62\x65st_guess_labels\x18\x08 \x03(\x0b\x32-.google.cloud.vision.v1.WebDetection.WebLabel\x1a\x42\n\tWebEntity\x12\x11\n\tentity_id\x18\x01 \x01(\t\x12\r\n\x05score\x18\x02 \x01(\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x1a&\n\x08WebImage\x12\x0b\n\x03url\x18\x01 \x01(\t\x12\r\n\x05score\x18\x02 \x01(\x02\x1a\xd6\x01\n\x07WebPage\x12\x0b\n\x03url\x18\x01 \x01(\t\x12\r\n\x05score\x18\x02 \x01(\x02\x12\x12\n\npage_title\x18\x03 \x01(\t\x12K\n\x14\x66ull_matching_images\x18\x04 \x03(\x0b\x32-.google.cloud.vision.v1.WebDetection.WebImage\x12N\n\x17partial_matching_images\x18\x05 \x03(\x0b\x32-.google.cloud.vision.v1.WebDetection.WebImage\x1a\x30\n\x08WebLabel\x12\r\n\x05label\x18\x01 \x01(\t\x12\x15\n\rlanguage_code\x18\x02 \x01(\tBy\n\x1a\x63om.google.cloud.vision.v1B\x11WebDetectionProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/vision/v1;vision\xf8\x01\x01\xa2\x02\x04GCVNb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.vision.v1.web_detection_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.vision.v1B\021WebDetectionProtoP\001Z<google.golang.org/genproto/googleapis/cloud/vision/v1;vision\370\001\001\242\002\004GCVN'
  _WEBDETECTION._serialized_start=71
  _WEBDETECTION._serialized_end=923
  _WEBDETECTION_WEBENTITY._serialized_start=550
  _WEBDETECTION_WEBENTITY._serialized_end=616
  _WEBDETECTION_WEBIMAGE._serialized_start=618
  _WEBDETECTION_WEBIMAGE._serialized_end=656
  _WEBDETECTION_WEBPAGE._serialized_start=659
  _WEBDETECTION_WEBPAGE._serialized_end=873
  _WEBDETECTION_WEBLABEL._serialized_start=875
  _WEBDETECTION_WEBLABEL._serialized_end=923
# @@protoc_insertion_point(module_scope)
