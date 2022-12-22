# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1beta1/data_items.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.automl.v1beta1 import geometry_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_geometry__pb2
from google.cloud.automl.v1beta1 import io_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_io__pb2
from google.cloud.automl.v1beta1 import temporal_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_temporal__pb2
from google.cloud.automl.v1beta1 import text_segment_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_text__segment__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/automl/v1beta1/data_items.proto\x12\x1bgoogle.cloud.automl.v1beta1\x1a*google/cloud/automl/v1beta1/geometry.proto\x1a$google/cloud/automl/v1beta1/io.proto\x1a*google/cloud/automl/v1beta1/temporal.proto\x1a.google/cloud/automl/v1beta1/text_segment.proto\x1a\x1cgoogle/protobuf/struct.proto\"\x7f\n\x05Image\x12\x15\n\x0bimage_bytes\x18\x01 \x01(\x0cH\x00\x12@\n\x0cinput_config\x18\x06 \x01(\x0b\x32(.google.cloud.automl.v1beta1.InputConfigH\x00\x12\x15\n\rthumbnail_uri\x18\x04 \x01(\tB\x06\n\x04\x64\x61ta\"F\n\x0bTextSnippet\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\t\x12\x11\n\tmime_type\x18\x02 \x01(\t\x12\x13\n\x0b\x63ontent_uri\x18\x04 \x01(\t\"\xef\x01\n\x12\x44ocumentDimensions\x12S\n\x04unit\x18\x01 \x01(\x0e\x32\x45.google.cloud.automl.v1beta1.DocumentDimensions.DocumentDimensionUnit\x12\r\n\x05width\x18\x02 \x01(\x02\x12\x0e\n\x06height\x18\x03 \x01(\x02\"e\n\x15\x44ocumentDimensionUnit\x12\'\n#DOCUMENT_DIMENSION_UNIT_UNSPECIFIED\x10\x00\x12\x08\n\x04INCH\x10\x01\x12\x0e\n\nCENTIMETER\x10\x02\x12\t\n\x05POINT\x10\x03\"\xf9\x05\n\x08\x44ocument\x12\x46\n\x0cinput_config\x18\x01 \x01(\x0b\x32\x30.google.cloud.automl.v1beta1.DocumentInputConfig\x12?\n\rdocument_text\x18\x02 \x01(\x0b\x32(.google.cloud.automl.v1beta1.TextSnippet\x12<\n\x06layout\x18\x03 \x03(\x0b\x32,.google.cloud.automl.v1beta1.Document.Layout\x12L\n\x13\x64ocument_dimensions\x18\x04 \x01(\x0b\x32/.google.cloud.automl.v1beta1.DocumentDimensions\x12\x12\n\npage_count\x18\x05 \x01(\x05\x1a\xc3\x03\n\x06Layout\x12>\n\x0ctext_segment\x18\x01 \x01(\x0b\x32(.google.cloud.automl.v1beta1.TextSegment\x12\x13\n\x0bpage_number\x18\x02 \x01(\x05\x12@\n\rbounding_poly\x18\x03 \x01(\x0b\x32).google.cloud.automl.v1beta1.BoundingPoly\x12W\n\x11text_segment_type\x18\x04 \x01(\x0e\x32<.google.cloud.automl.v1beta1.Document.Layout.TextSegmentType\"\xc8\x01\n\x0fTextSegmentType\x12!\n\x1dTEXT_SEGMENT_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05TOKEN\x10\x01\x12\r\n\tPARAGRAPH\x10\x02\x12\x0e\n\nFORM_FIELD\x10\x03\x12\x13\n\x0f\x46ORM_FIELD_NAME\x10\x04\x12\x17\n\x13\x46ORM_FIELD_CONTENTS\x10\x05\x12\t\n\x05TABLE\x10\x06\x12\x10\n\x0cTABLE_HEADER\x10\x07\x12\r\n\tTABLE_ROW\x10\x08\x12\x0e\n\nTABLE_CELL\x10\t\"F\n\x03Row\x12\x17\n\x0f\x63olumn_spec_ids\x18\x02 \x03(\t\x12&\n\x06values\x18\x03 \x03(\x0b\x32\x16.google.protobuf.Value\"\xfe\x01\n\x0e\x45xamplePayload\x12\x33\n\x05image\x18\x01 \x01(\x0b\x32\".google.cloud.automl.v1beta1.ImageH\x00\x12@\n\x0ctext_snippet\x18\x02 \x01(\x0b\x32(.google.cloud.automl.v1beta1.TextSnippetH\x00\x12\x39\n\x08\x64ocument\x18\x04 \x01(\x0b\x32%.google.cloud.automl.v1beta1.DocumentH\x00\x12/\n\x03row\x18\x03 \x01(\x0b\x32 .google.cloud.automl.v1beta1.RowH\x00\x42\t\n\x07payloadB\xa5\x01\n\x1f\x63om.google.cloud.automl.v1beta1P\x01ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\xca\x02\x1bGoogle\\Cloud\\AutoMl\\V1beta1\xea\x02\x1eGoogle::Cloud::AutoML::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.automl.v1beta1.data_items_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.automl.v1beta1P\001ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1beta1'
  _IMAGE._serialized_start=281
  _IMAGE._serialized_end=408
  _TEXTSNIPPET._serialized_start=410
  _TEXTSNIPPET._serialized_end=480
  _DOCUMENTDIMENSIONS._serialized_start=483
  _DOCUMENTDIMENSIONS._serialized_end=722
  _DOCUMENTDIMENSIONS_DOCUMENTDIMENSIONUNIT._serialized_start=621
  _DOCUMENTDIMENSIONS_DOCUMENTDIMENSIONUNIT._serialized_end=722
  _DOCUMENT._serialized_start=725
  _DOCUMENT._serialized_end=1486
  _DOCUMENT_LAYOUT._serialized_start=1035
  _DOCUMENT_LAYOUT._serialized_end=1486
  _DOCUMENT_LAYOUT_TEXTSEGMENTTYPE._serialized_start=1286
  _DOCUMENT_LAYOUT_TEXTSEGMENTTYPE._serialized_end=1486
  _ROW._serialized_start=1488
  _ROW._serialized_end=1558
  _EXAMPLEPAYLOAD._serialized_start=1561
  _EXAMPLEPAYLOAD._serialized_end=1815
# @@protoc_insertion_point(module_scope)