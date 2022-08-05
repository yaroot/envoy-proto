# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1beta1/document.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.documentai.v1beta1 import geometry_pb2 as google_dot_cloud_dot_documentai_dot_v1beta1_dot_geometry__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.type import color_pb2 as google_dot_type_dot_color__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/documentai/v1beta1/document.proto\x12\x1fgoogle.cloud.documentai.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a.google/cloud/documentai/v1beta1/geometry.proto\x1a\x17google/rpc/status.proto\x1a\x17google/type/color.proto\"\xff$\n\x08\x44ocument\x12\r\n\x03uri\x18\x01 \x01(\tH\x00\x12\x11\n\x07\x63ontent\x18\x02 \x01(\x0cH\x00\x12\x11\n\tmime_type\x18\x03 \x01(\t\x12\x0c\n\x04text\x18\x04 \x01(\t\x12\x44\n\x0btext_styles\x18\x05 \x03(\x0b\x32/.google.cloud.documentai.v1beta1.Document.Style\x12=\n\x05pages\x18\x06 \x03(\x0b\x32..google.cloud.documentai.v1beta1.Document.Page\x12\x42\n\x08\x65ntities\x18\x07 \x03(\x0b\x32\x30.google.cloud.documentai.v1beta1.Document.Entity\x12R\n\x10\x65ntity_relations\x18\x08 \x03(\x0b\x32\x38.google.cloud.documentai.v1beta1.Document.EntityRelation\x12G\n\nshard_info\x18\t \x01(\x0b\x32\x33.google.cloud.documentai.v1beta1.Document.ShardInfo\x12!\n\x05\x65rror\x18\n \x01(\x0b\x32\x12.google.rpc.Status\x1aJ\n\tShardInfo\x12\x13\n\x0bshard_index\x18\x01 \x01(\x03\x12\x13\n\x0bshard_count\x18\x02 \x01(\x03\x12\x13\n\x0btext_offset\x18\x03 \x01(\x03\x1a\xda\x02\n\x05Style\x12I\n\x0btext_anchor\x18\x01 \x01(\x0b\x32\x34.google.cloud.documentai.v1beta1.Document.TextAnchor\x12!\n\x05\x63olor\x18\x02 \x01(\x0b\x32\x12.google.type.Color\x12,\n\x10\x62\x61\x63kground_color\x18\x03 \x01(\x0b\x32\x12.google.type.Color\x12\x13\n\x0b\x66ont_weight\x18\x04 \x01(\t\x12\x12\n\ntext_style\x18\x05 \x01(\t\x12\x17\n\x0ftext_decoration\x18\x06 \x01(\t\x12K\n\tfont_size\x18\x07 \x01(\x0b\x32\x38.google.cloud.documentai.v1beta1.Document.Style.FontSize\x1a&\n\x08\x46ontSize\x12\x0c\n\x04size\x18\x01 \x01(\x02\x12\x0c\n\x04unit\x18\x02 \x01(\t\x1a\xf6\x1a\n\x04Page\x12\x13\n\x0bpage_number\x18\x01 \x01(\x05\x12K\n\tdimension\x18\x02 \x01(\x0b\x32\x38.google.cloud.documentai.v1beta1.Document.Page.Dimension\x12\x45\n\x06layout\x18\x03 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12[\n\x12\x64\x65tected_languages\x18\x04 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x12\x44\n\x06\x62locks\x18\x05 \x03(\x0b\x32\x34.google.cloud.documentai.v1beta1.Document.Page.Block\x12L\n\nparagraphs\x18\x06 \x03(\x0b\x32\x38.google.cloud.documentai.v1beta1.Document.Page.Paragraph\x12\x42\n\x05lines\x18\x07 \x03(\x0b\x32\x33.google.cloud.documentai.v1beta1.Document.Page.Line\x12\x44\n\x06tokens\x18\x08 \x03(\x0b\x32\x34.google.cloud.documentai.v1beta1.Document.Page.Token\x12U\n\x0fvisual_elements\x18\t \x03(\x0b\x32<.google.cloud.documentai.v1beta1.Document.Page.VisualElement\x12\x44\n\x06tables\x18\n \x03(\x0b\x32\x34.google.cloud.documentai.v1beta1.Document.Page.Table\x12M\n\x0b\x66orm_fields\x18\x0b \x03(\x0b\x32\x38.google.cloud.documentai.v1beta1.Document.Page.FormField\x1a\x38\n\tDimension\x12\r\n\x05width\x18\x01 \x01(\x02\x12\x0e\n\x06height\x18\x02 \x01(\x02\x12\x0c\n\x04unit\x18\x03 \x01(\t\x1a\xec\x02\n\x06Layout\x12I\n\x0btext_anchor\x18\x01 \x01(\x0b\x32\x34.google.cloud.documentai.v1beta1.Document.TextAnchor\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x12\x44\n\rbounding_poly\x18\x03 \x01(\x0b\x32-.google.cloud.documentai.v1beta1.BoundingPoly\x12V\n\x0borientation\x18\x04 \x01(\x0e\x32\x41.google.cloud.documentai.v1beta1.Document.Page.Layout.Orientation\"e\n\x0bOrientation\x12\x1b\n\x17ORIENTATION_UNSPECIFIED\x10\x00\x12\x0b\n\x07PAGE_UP\x10\x01\x12\x0e\n\nPAGE_RIGHT\x10\x02\x12\r\n\tPAGE_DOWN\x10\x03\x12\r\n\tPAGE_LEFT\x10\x04\x1a\xab\x01\n\x05\x42lock\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12[\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a\xaf\x01\n\tParagraph\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12[\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a\xaa\x01\n\x04Line\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12[\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a\xb5\x03\n\x05Token\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12Z\n\x0e\x64\x65tected_break\x18\x02 \x01(\x0b\x32\x42.google.cloud.documentai.v1beta1.Document.Page.Token.DetectedBreak\x12[\n\x12\x64\x65tected_languages\x18\x03 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a\xab\x01\n\rDetectedBreak\x12U\n\x04type\x18\x01 \x01(\x0e\x32G.google.cloud.documentai.v1beta1.Document.Page.Token.DetectedBreak.Type\"C\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05SPACE\x10\x01\x12\x0e\n\nWIDE_SPACE\x10\x02\x12\n\n\x06HYPHEN\x10\x03\x1a\xc1\x01\n\rVisualElement\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12\x0c\n\x04type\x18\x02 \x01(\t\x12[\n\x12\x64\x65tected_languages\x18\x03 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a\x82\x05\n\x05Table\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12R\n\x0bheader_rows\x18\x02 \x03(\x0b\x32=.google.cloud.documentai.v1beta1.Document.Page.Table.TableRow\x12P\n\tbody_rows\x18\x03 \x03(\x0b\x32=.google.cloud.documentai.v1beta1.Document.Page.Table.TableRow\x12[\n\x12\x64\x65tected_languages\x18\x04 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1aY\n\x08TableRow\x12M\n\x05\x63\x65lls\x18\x01 \x03(\x0b\x32>.google.cloud.documentai.v1beta1.Document.Page.Table.TableCell\x1a\xd3\x01\n\tTableCell\x12\x45\n\x06layout\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12\x10\n\x08row_span\x18\x02 \x01(\x05\x12\x10\n\x08\x63ol_span\x18\x03 \x01(\x05\x12[\n\x12\x64\x65tected_languages\x18\x04 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a\xe7\x02\n\tFormField\x12I\n\nfield_name\x18\x01 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12J\n\x0b\x66ield_value\x18\x02 \x01(\x0b\x32\x35.google.cloud.documentai.v1beta1.Document.Page.Layout\x12`\n\x17name_detected_languages\x18\x03 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x12\x61\n\x18value_detected_languages\x18\x04 \x03(\x0b\x32?.google.cloud.documentai.v1beta1.Document.Page.DetectedLanguage\x1a=\n\x10\x44\x65tectedLanguage\x12\x15\n\rlanguage_code\x18\x01 \x01(\t\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x1a\x90\x01\n\x06\x45ntity\x12I\n\x0btext_anchor\x18\x01 \x01(\x0b\x32\x34.google.cloud.documentai.v1beta1.Document.TextAnchor\x12\x11\n\x04type\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x0cmention_text\x18\x03 \x01(\t\x12\x12\n\nmention_id\x18\x04 \x01(\t\x1aI\n\x0e\x45ntityRelation\x12\x12\n\nsubject_id\x18\x01 \x01(\t\x12\x11\n\tobject_id\x18\x02 \x01(\t\x12\x10\n\x08relation\x18\x03 \x01(\t\x1a\x9c\x01\n\nTextAnchor\x12W\n\rtext_segments\x18\x01 \x03(\x0b\x32@.google.cloud.documentai.v1beta1.Document.TextAnchor.TextSegment\x1a\x35\n\x0bTextSegment\x12\x13\n\x0bstart_index\x18\x01 \x01(\x03\x12\x11\n\tend_index\x18\x02 \x01(\x03\x42\x08\n\x06sourceB\xea\x01\n#com.google.cloud.documentai.v1beta1B\rDocumentProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta1;documentai\xaa\x02\x1fGoogle.Cloud.DocumentAI.V1Beta1\xca\x02\x1fGoogle\\Cloud\\DocumentAI\\V1beta1\xea\x02\"Google::Cloud::DocumentAI::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.documentai.v1beta1.document_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.documentai.v1beta1B\rDocumentProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta1;documentai\252\002\037Google.Cloud.DocumentAI.V1Beta1\312\002\037Google\\Cloud\\DocumentAI\\V1beta1\352\002\"Google::Cloud::DocumentAI::V1beta1'
  _DOCUMENT_ENTITY.fields_by_name['type']._options = None
  _DOCUMENT_ENTITY.fields_by_name['type']._serialized_options = b'\340A\002'
  _DOCUMENT._serialized_start=245
  _DOCUMENT._serialized_end=4980
  _DOCUMENT_SHARDINFO._serialized_start=717
  _DOCUMENT_SHARDINFO._serialized_end=791
  _DOCUMENT_STYLE._serialized_start=794
  _DOCUMENT_STYLE._serialized_end=1140
  _DOCUMENT_STYLE_FONTSIZE._serialized_start=1102
  _DOCUMENT_STYLE_FONTSIZE._serialized_end=1140
  _DOCUMENT_PAGE._serialized_start=1143
  _DOCUMENT_PAGE._serialized_end=4589
  _DOCUMENT_PAGE_DIMENSION._serialized_start=1935
  _DOCUMENT_PAGE_DIMENSION._serialized_end=1991
  _DOCUMENT_PAGE_LAYOUT._serialized_start=1994
  _DOCUMENT_PAGE_LAYOUT._serialized_end=2358
  _DOCUMENT_PAGE_LAYOUT_ORIENTATION._serialized_start=2257
  _DOCUMENT_PAGE_LAYOUT_ORIENTATION._serialized_end=2358
  _DOCUMENT_PAGE_BLOCK._serialized_start=2361
  _DOCUMENT_PAGE_BLOCK._serialized_end=2532
  _DOCUMENT_PAGE_PARAGRAPH._serialized_start=2535
  _DOCUMENT_PAGE_PARAGRAPH._serialized_end=2710
  _DOCUMENT_PAGE_LINE._serialized_start=2713
  _DOCUMENT_PAGE_LINE._serialized_end=2883
  _DOCUMENT_PAGE_TOKEN._serialized_start=2886
  _DOCUMENT_PAGE_TOKEN._serialized_end=3323
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK._serialized_start=3152
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK._serialized_end=3323
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK_TYPE._serialized_start=3256
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK_TYPE._serialized_end=3323
  _DOCUMENT_PAGE_VISUALELEMENT._serialized_start=3326
  _DOCUMENT_PAGE_VISUALELEMENT._serialized_end=3519
  _DOCUMENT_PAGE_TABLE._serialized_start=3522
  _DOCUMENT_PAGE_TABLE._serialized_end=4164
  _DOCUMENT_PAGE_TABLE_TABLEROW._serialized_start=3861
  _DOCUMENT_PAGE_TABLE_TABLEROW._serialized_end=3950
  _DOCUMENT_PAGE_TABLE_TABLECELL._serialized_start=3953
  _DOCUMENT_PAGE_TABLE_TABLECELL._serialized_end=4164
  _DOCUMENT_PAGE_FORMFIELD._serialized_start=4167
  _DOCUMENT_PAGE_FORMFIELD._serialized_end=4526
  _DOCUMENT_PAGE_DETECTEDLANGUAGE._serialized_start=4528
  _DOCUMENT_PAGE_DETECTEDLANGUAGE._serialized_end=4589
  _DOCUMENT_ENTITY._serialized_start=4592
  _DOCUMENT_ENTITY._serialized_end=4736
  _DOCUMENT_ENTITYRELATION._serialized_start=4738
  _DOCUMENT_ENTITYRELATION._serialized_end=4811
  _DOCUMENT_TEXTANCHOR._serialized_start=4814
  _DOCUMENT_TEXTANCHOR._serialized_end=4970
  _DOCUMENT_TEXTANCHOR_TEXTSEGMENT._serialized_start=4917
  _DOCUMENT_TEXTANCHOR_TEXTSEGMENT._serialized_end=4970
# @@protoc_insertion_point(module_scope)
