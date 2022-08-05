# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1/document.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.documentai.v1 import geometry_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_geometry__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.type import color_pb2 as google_dot_type_dot_color__pb2
from google.type import date_pb2 as google_dot_type_dot_date__pb2
from google.type import datetime_pb2 as google_dot_type_dot_datetime__pb2
from google.type import money_pb2 as google_dot_type_dot_money__pb2
from google.type import postal_address_pb2 as google_dot_type_dot_postal__address__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/cloud/documentai/v1/document.proto\x12\x1agoogle.cloud.documentai.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a)google/cloud/documentai/v1/geometry.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x17google/type/color.proto\x1a\x16google/type/date.proto\x1a\x1agoogle/type/datetime.proto\x1a\x17google/type/money.proto\x1a google/type/postal_address.proto\"\xb4;\n\x08\x44ocument\x12\x12\n\x03uri\x18\x01 \x01(\tB\x03\xe0\x41\x01H\x00\x12\x16\n\x07\x63ontent\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x01H\x00\x12\x11\n\tmime_type\x18\x03 \x01(\t\x12\x11\n\x04text\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12?\n\x0btext_styles\x18\x05 \x03(\x0b\x32*.google.cloud.documentai.v1.Document.Style\x12\x38\n\x05pages\x18\x06 \x03(\x0b\x32).google.cloud.documentai.v1.Document.Page\x12=\n\x08\x65ntities\x18\x07 \x03(\x0b\x32+.google.cloud.documentai.v1.Document.Entity\x12M\n\x10\x65ntity_relations\x18\x08 \x03(\x0b\x32\x33.google.cloud.documentai.v1.Document.EntityRelation\x12\x45\n\x0ctext_changes\x18\x0e \x03(\x0b\x32/.google.cloud.documentai.v1.Document.TextChange\x12\x42\n\nshard_info\x18\t \x01(\x0b\x32..google.cloud.documentai.v1.Document.ShardInfo\x12!\n\x05\x65rror\x18\n \x01(\x0b\x32\x12.google.rpc.Status\x12@\n\trevisions\x18\r \x03(\x0b\x32-.google.cloud.documentai.v1.Document.Revision\x1aJ\n\tShardInfo\x12\x13\n\x0bshard_index\x18\x01 \x01(\x03\x12\x13\n\x0bshard_count\x18\x02 \x01(\x03\x12\x13\n\x0btext_offset\x18\x03 \x01(\x03\x1a\xd0\x02\n\x05Style\x12\x44\n\x0btext_anchor\x18\x01 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.TextAnchor\x12!\n\x05\x63olor\x18\x02 \x01(\x0b\x32\x12.google.type.Color\x12,\n\x10\x62\x61\x63kground_color\x18\x03 \x01(\x0b\x32\x12.google.type.Color\x12\x13\n\x0b\x66ont_weight\x18\x04 \x01(\t\x12\x12\n\ntext_style\x18\x05 \x01(\t\x12\x17\n\x0ftext_decoration\x18\x06 \x01(\t\x12\x46\n\tfont_size\x18\x07 \x01(\x0b\x32\x33.google.cloud.documentai.v1.Document.Style.FontSize\x1a&\n\x08\x46ontSize\x12\x0c\n\x04size\x18\x01 \x01(\x02\x12\x0c\n\x04unit\x18\x02 \x01(\t\x1a\xf0 \n\x04Page\x12\x13\n\x0bpage_number\x18\x01 \x01(\x05\x12>\n\x05image\x18\r \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Page.Image\x12\x44\n\ntransforms\x18\x0e \x03(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Matrix\x12\x46\n\tdimension\x18\x02 \x01(\x0b\x32\x33.google.cloud.documentai.v1.Document.Page.Dimension\x12@\n\x06layout\x18\x03 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12V\n\x12\x64\x65tected_languages\x18\x04 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12?\n\x06\x62locks\x18\x05 \x03(\x0b\x32/.google.cloud.documentai.v1.Document.Page.Block\x12G\n\nparagraphs\x18\x06 \x03(\x0b\x32\x33.google.cloud.documentai.v1.Document.Page.Paragraph\x12=\n\x05lines\x18\x07 \x03(\x0b\x32..google.cloud.documentai.v1.Document.Page.Line\x12?\n\x06tokens\x18\x08 \x03(\x0b\x32/.google.cloud.documentai.v1.Document.Page.Token\x12P\n\x0fvisual_elements\x18\t \x03(\x0b\x32\x37.google.cloud.documentai.v1.Document.Page.VisualElement\x12?\n\x06tables\x18\n \x03(\x0b\x32/.google.cloud.documentai.v1.Document.Page.Table\x12H\n\x0b\x66orm_fields\x18\x0b \x03(\x0b\x32\x33.google.cloud.documentai.v1.Document.Page.FormField\x12\x41\n\x07symbols\x18\x0c \x03(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Symbol\x12\x43\n\nprovenance\x18\x10 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Provenance\x1a\x38\n\tDimension\x12\r\n\x05width\x18\x01 \x01(\x02\x12\x0e\n\x06height\x18\x02 \x01(\x02\x12\x0c\n\x04unit\x18\x03 \x01(\t\x1aJ\n\x05Image\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\x0c\x12\x11\n\tmime_type\x18\x02 \x01(\t\x12\r\n\x05width\x18\x03 \x01(\x05\x12\x0e\n\x06height\x18\x04 \x01(\x05\x1a@\n\x06Matrix\x12\x0c\n\x04rows\x18\x01 \x01(\x05\x12\x0c\n\x04\x63ols\x18\x02 \x01(\x05\x12\x0c\n\x04type\x18\x03 \x01(\x05\x12\x0c\n\x04\x64\x61ta\x18\x04 \x01(\x0c\x1a\xdd\x02\n\x06Layout\x12\x44\n\x0btext_anchor\x18\x01 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.TextAnchor\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x12?\n\rbounding_poly\x18\x03 \x01(\x0b\x32(.google.cloud.documentai.v1.BoundingPoly\x12Q\n\x0borientation\x18\x04 \x01(\x0e\x32<.google.cloud.documentai.v1.Document.Page.Layout.Orientation\"e\n\x0bOrientation\x12\x1b\n\x17ORIENTATION_UNSPECIFIED\x10\x00\x12\x0b\n\x07PAGE_UP\x10\x01\x12\x0e\n\nPAGE_RIGHT\x10\x02\x12\r\n\tPAGE_DOWN\x10\x03\x12\r\n\tPAGE_LEFT\x10\x04\x1a\xe6\x01\n\x05\x42lock\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12V\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12\x43\n\nprovenance\x18\x03 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Provenance\x1a\xea\x01\n\tParagraph\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12V\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12\x43\n\nprovenance\x18\x03 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Provenance\x1a\xe5\x01\n\x04Line\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12V\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12\x43\n\nprovenance\x18\x03 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Provenance\x1a\xe6\x03\n\x05Token\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12U\n\x0e\x64\x65tected_break\x18\x02 \x01(\x0b\x32=.google.cloud.documentai.v1.Document.Page.Token.DetectedBreak\x12V\n\x12\x64\x65tected_languages\x18\x03 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12\x43\n\nprovenance\x18\x04 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Provenance\x1a\xa6\x01\n\rDetectedBreak\x12P\n\x04type\x18\x01 \x01(\x0e\x32\x42.google.cloud.documentai.v1.Document.Page.Token.DetectedBreak.Type\"C\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05SPACE\x10\x01\x12\x0e\n\nWIDE_SPACE\x10\x02\x12\n\n\x06HYPHEN\x10\x03\x1a\xa2\x01\n\x06Symbol\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12V\n\x12\x64\x65tected_languages\x18\x02 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x1a\xb7\x01\n\rVisualElement\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12\x0c\n\x04type\x18\x02 \x01(\t\x12V\n\x12\x64\x65tected_languages\x18\x03 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x1a\xdf\x04\n\x05Table\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12M\n\x0bheader_rows\x18\x02 \x03(\x0b\x32\x38.google.cloud.documentai.v1.Document.Page.Table.TableRow\x12K\n\tbody_rows\x18\x03 \x03(\x0b\x32\x38.google.cloud.documentai.v1.Document.Page.Table.TableRow\x12V\n\x12\x64\x65tected_languages\x18\x04 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x1aT\n\x08TableRow\x12H\n\x05\x63\x65lls\x18\x01 \x03(\x0b\x32\x39.google.cloud.documentai.v1.Document.Page.Table.TableCell\x1a\xc9\x01\n\tTableCell\x12@\n\x06layout\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12\x10\n\x08row_span\x18\x02 \x01(\x05\x12\x10\n\x08\x63ol_span\x18\x03 \x01(\x05\x12V\n\x12\x64\x65tected_languages\x18\x04 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x1a\xac\x03\n\tFormField\x12\x44\n\nfield_name\x18\x01 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12\x45\n\x0b\x66ield_value\x18\x02 \x01(\x0b\x32\x30.google.cloud.documentai.v1.Document.Page.Layout\x12[\n\x17name_detected_languages\x18\x03 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12\\\n\x18value_detected_languages\x18\x04 \x03(\x0b\x32:.google.cloud.documentai.v1.Document.Page.DetectedLanguage\x12\x12\n\nvalue_type\x18\x05 \x01(\t\x12\x43\n\nprovenance\x18\x08 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.Provenance\x1a=\n\x10\x44\x65tectedLanguage\x12\x15\n\rlanguage_code\x18\x01 \x01(\t\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x1a\xa0\x06\n\x06\x45ntity\x12I\n\x0btext_anchor\x18\x01 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.TextAnchorB\x03\xe0\x41\x01\x12\x11\n\x04type\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x19\n\x0cmention_text\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x17\n\nmention_id\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x17\n\nconfidence\x18\x05 \x01(\x02\x42\x03\xe0\x41\x01\x12I\n\x0bpage_anchor\x18\x06 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.PageAnchorB\x03\xe0\x41\x01\x12\x0f\n\x02id\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12Z\n\x10normalized_value\x18\t \x01(\x0b\x32;.google.cloud.documentai.v1.Document.Entity.NormalizedValueB\x03\xe0\x41\x01\x12\x44\n\nproperties\x18\n \x03(\x0b\x32+.google.cloud.documentai.v1.Document.EntityB\x03\xe0\x41\x01\x12H\n\nprovenance\x18\x0b \x01(\x0b\x32/.google.cloud.documentai.v1.Document.ProvenanceB\x03\xe0\x41\x01\x12\x15\n\x08redacted\x18\x0c \x01(\x08\x42\x03\xe0\x41\x01\x1a\x8b\x02\n\x0fNormalizedValue\x12)\n\x0bmoney_value\x18\x02 \x01(\x0b\x32\x12.google.type.MoneyH\x00\x12\'\n\ndate_value\x18\x03 \x01(\x0b\x32\x11.google.type.DateH\x00\x12/\n\x0e\x64\x61tetime_value\x18\x04 \x01(\x0b\x32\x15.google.type.DateTimeH\x00\x12\x33\n\raddress_value\x18\x05 \x01(\x0b\x32\x1a.google.type.PostalAddressH\x00\x12\x17\n\rboolean_value\x18\x06 \x01(\x08H\x00\x12\x11\n\x04text\x18\x01 \x01(\tB\x03\xe0\x41\x01\x42\x12\n\x10structured_value\x1aI\n\x0e\x45ntityRelation\x12\x12\n\nsubject_id\x18\x01 \x01(\t\x12\x11\n\tobject_id\x18\x02 \x01(\t\x12\x10\n\x08relation\x18\x03 \x01(\t\x1a\xa8\x01\n\nTextAnchor\x12R\n\rtext_segments\x18\x01 \x03(\x0b\x32;.google.cloud.documentai.v1.Document.TextAnchor.TextSegment\x12\x0f\n\x07\x63ontent\x18\x02 \x01(\t\x1a\x35\n\x0bTextSegment\x12\x13\n\x0bstart_index\x18\x01 \x01(\x03\x12\x11\n\tend_index\x18\x02 \x01(\x03\x1a\xd8\x03\n\nPageAnchor\x12J\n\tpage_refs\x18\x01 \x03(\x0b\x32\x37.google.cloud.documentai.v1.Document.PageAnchor.PageRef\x1a\xfd\x02\n\x07PageRef\x12\x11\n\x04page\x18\x01 \x01(\x03\x42\x03\xe0\x41\x02\x12\\\n\x0blayout_type\x18\x02 \x01(\x0e\x32\x42.google.cloud.documentai.v1.Document.PageAnchor.PageRef.LayoutTypeB\x03\xe0\x41\x01\x12\x18\n\tlayout_id\x18\x03 \x01(\tB\x05\x18\x01\xe0\x41\x01\x12\x44\n\rbounding_poly\x18\x04 \x01(\x0b\x32(.google.cloud.documentai.v1.BoundingPolyB\x03\xe0\x41\x01\x12\x17\n\nconfidence\x18\x05 \x01(\x02\x42\x03\xe0\x41\x01\"\x87\x01\n\nLayoutType\x12\x1b\n\x17LAYOUT_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x42LOCK\x10\x01\x12\r\n\tPARAGRAPH\x10\x02\x12\x08\n\x04LINE\x10\x03\x12\t\n\x05TOKEN\x10\x04\x12\x12\n\x0eVISUAL_ELEMENT\x10\x05\x12\t\n\x05TABLE\x10\x06\x12\x0e\n\nFORM_FIELD\x10\x07\x1a\x8c\x03\n\nProvenance\x12\x10\n\x08revision\x18\x01 \x01(\x05\x12\x0e\n\x02id\x18\x02 \x01(\x05\x42\x02\x18\x01\x12G\n\x07parents\x18\x03 \x03(\x0b\x32\x36.google.cloud.documentai.v1.Document.Provenance.Parent\x12K\n\x04type\x18\x04 \x01(\x0e\x32=.google.cloud.documentai.v1.Document.Provenance.OperationType\x1a\x39\n\x06Parent\x12\x10\n\x08revision\x18\x01 \x01(\x05\x12\r\n\x05index\x18\x03 \x01(\x05\x12\x0e\n\x02id\x18\x02 \x01(\x05\x42\x02\x18\x01\"\x8a\x01\n\rOperationType\x12\x1e\n\x1aOPERATION_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03\x41\x44\x44\x10\x01\x12\n\n\x06REMOVE\x10\x02\x12\x0b\n\x07REPLACE\x10\x03\x12\x12\n\x0e\x45VAL_REQUESTED\x10\x04\x12\x11\n\rEVAL_APPROVED\x10\x05\x12\x10\n\x0c\x45VAL_SKIPPED\x10\x06\x1a\x8d\x02\n\x08Revision\x12\x0f\n\x05\x61gent\x18\x04 \x01(\tH\x00\x12\x13\n\tprocessor\x18\x05 \x01(\tH\x00\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0e\n\x06parent\x18\x02 \x03(\x05\x12/\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12O\n\x0chuman_review\x18\x06 \x01(\x0b\x32\x39.google.cloud.documentai.v1.Document.Revision.HumanReview\x1a\x33\n\x0bHumanReview\x12\r\n\x05state\x18\x01 \x01(\t\x12\x15\n\rstate_message\x18\x02 \x01(\tB\x08\n\x06source\x1a\xad\x01\n\nTextChange\x12\x44\n\x0btext_anchor\x18\x01 \x01(\x0b\x32/.google.cloud.documentai.v1.Document.TextAnchor\x12\x14\n\x0c\x63hanged_text\x18\x02 \x01(\t\x12\x43\n\nprovenance\x18\x03 \x03(\x0b\x32/.google.cloud.documentai.v1.Document.ProvenanceB\x08\n\x06sourceB\xd1\x01\n\x1e\x63om.google.cloud.documentai.v1B\rDocumentProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/documentai/v1;documentai\xaa\x02\x1aGoogle.Cloud.DocumentAI.V1\xca\x02\x1aGoogle\\Cloud\\DocumentAI\\V1\xea\x02\x1dGoogle::Cloud::DocumentAI::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.documentai.v1.document_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.documentai.v1B\rDocumentProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/documentai/v1;documentai\252\002\032Google.Cloud.DocumentAI.V1\312\002\032Google\\Cloud\\DocumentAI\\V1\352\002\035Google::Cloud::DocumentAI::V1'
  _DOCUMENT_ENTITY_NORMALIZEDVALUE.fields_by_name['text']._options = None
  _DOCUMENT_ENTITY_NORMALIZEDVALUE.fields_by_name['text']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['text_anchor']._options = None
  _DOCUMENT_ENTITY.fields_by_name['text_anchor']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['type']._options = None
  _DOCUMENT_ENTITY.fields_by_name['type']._serialized_options = b'\340A\002'
  _DOCUMENT_ENTITY.fields_by_name['mention_text']._options = None
  _DOCUMENT_ENTITY.fields_by_name['mention_text']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['mention_id']._options = None
  _DOCUMENT_ENTITY.fields_by_name['mention_id']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['confidence']._options = None
  _DOCUMENT_ENTITY.fields_by_name['confidence']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['page_anchor']._options = None
  _DOCUMENT_ENTITY.fields_by_name['page_anchor']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['id']._options = None
  _DOCUMENT_ENTITY.fields_by_name['id']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['normalized_value']._options = None
  _DOCUMENT_ENTITY.fields_by_name['normalized_value']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['properties']._options = None
  _DOCUMENT_ENTITY.fields_by_name['properties']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['provenance']._options = None
  _DOCUMENT_ENTITY.fields_by_name['provenance']._serialized_options = b'\340A\001'
  _DOCUMENT_ENTITY.fields_by_name['redacted']._options = None
  _DOCUMENT_ENTITY.fields_by_name['redacted']._serialized_options = b'\340A\001'
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['page']._options = None
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['page']._serialized_options = b'\340A\002'
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['layout_type']._options = None
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['layout_type']._serialized_options = b'\340A\001'
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['layout_id']._options = None
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['layout_id']._serialized_options = b'\030\001\340A\001'
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['bounding_poly']._options = None
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['bounding_poly']._serialized_options = b'\340A\001'
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['confidence']._options = None
  _DOCUMENT_PAGEANCHOR_PAGEREF.fields_by_name['confidence']._serialized_options = b'\340A\001'
  _DOCUMENT_PROVENANCE_PARENT.fields_by_name['id']._options = None
  _DOCUMENT_PROVENANCE_PARENT.fields_by_name['id']._serialized_options = b'\030\001'
  _DOCUMENT_PROVENANCE.fields_by_name['id']._options = None
  _DOCUMENT_PROVENANCE.fields_by_name['id']._serialized_options = b'\030\001'
  _DOCUMENT.fields_by_name['uri']._options = None
  _DOCUMENT.fields_by_name['uri']._serialized_options = b'\340A\001'
  _DOCUMENT.fields_by_name['content']._options = None
  _DOCUMENT.fields_by_name['content']._serialized_options = b'\340A\001'
  _DOCUMENT.fields_by_name['text']._options = None
  _DOCUMENT.fields_by_name['text']._serialized_options = b'\340A\001'
  _DOCUMENT._serialized_start=344
  _DOCUMENT._serialized_end=7948
  _DOCUMENT_SHARDINFO._serialized_start=943
  _DOCUMENT_SHARDINFO._serialized_end=1017
  _DOCUMENT_STYLE._serialized_start=1020
  _DOCUMENT_STYLE._serialized_end=1356
  _DOCUMENT_STYLE_FONTSIZE._serialized_start=1318
  _DOCUMENT_STYLE_FONTSIZE._serialized_end=1356
  _DOCUMENT_PAGE._serialized_start=1359
  _DOCUMENT_PAGE._serialized_end=5567
  _DOCUMENT_PAGE_DIMENSION._serialized_start=2371
  _DOCUMENT_PAGE_DIMENSION._serialized_end=2427
  _DOCUMENT_PAGE_IMAGE._serialized_start=2429
  _DOCUMENT_PAGE_IMAGE._serialized_end=2503
  _DOCUMENT_PAGE_MATRIX._serialized_start=2505
  _DOCUMENT_PAGE_MATRIX._serialized_end=2569
  _DOCUMENT_PAGE_LAYOUT._serialized_start=2572
  _DOCUMENT_PAGE_LAYOUT._serialized_end=2921
  _DOCUMENT_PAGE_LAYOUT_ORIENTATION._serialized_start=2820
  _DOCUMENT_PAGE_LAYOUT_ORIENTATION._serialized_end=2921
  _DOCUMENT_PAGE_BLOCK._serialized_start=2924
  _DOCUMENT_PAGE_BLOCK._serialized_end=3154
  _DOCUMENT_PAGE_PARAGRAPH._serialized_start=3157
  _DOCUMENT_PAGE_PARAGRAPH._serialized_end=3391
  _DOCUMENT_PAGE_LINE._serialized_start=3394
  _DOCUMENT_PAGE_LINE._serialized_end=3623
  _DOCUMENT_PAGE_TOKEN._serialized_start=3626
  _DOCUMENT_PAGE_TOKEN._serialized_end=4112
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK._serialized_start=3946
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK._serialized_end=4112
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK_TYPE._serialized_start=4045
  _DOCUMENT_PAGE_TOKEN_DETECTEDBREAK_TYPE._serialized_end=4112
  _DOCUMENT_PAGE_SYMBOL._serialized_start=4115
  _DOCUMENT_PAGE_SYMBOL._serialized_end=4277
  _DOCUMENT_PAGE_VISUALELEMENT._serialized_start=4280
  _DOCUMENT_PAGE_VISUALELEMENT._serialized_end=4463
  _DOCUMENT_PAGE_TABLE._serialized_start=4466
  _DOCUMENT_PAGE_TABLE._serialized_end=5073
  _DOCUMENT_PAGE_TABLE_TABLEROW._serialized_start=4785
  _DOCUMENT_PAGE_TABLE_TABLEROW._serialized_end=4869
  _DOCUMENT_PAGE_TABLE_TABLECELL._serialized_start=4872
  _DOCUMENT_PAGE_TABLE_TABLECELL._serialized_end=5073
  _DOCUMENT_PAGE_FORMFIELD._serialized_start=5076
  _DOCUMENT_PAGE_FORMFIELD._serialized_end=5504
  _DOCUMENT_PAGE_DETECTEDLANGUAGE._serialized_start=5506
  _DOCUMENT_PAGE_DETECTEDLANGUAGE._serialized_end=5567
  _DOCUMENT_ENTITY._serialized_start=5570
  _DOCUMENT_ENTITY._serialized_end=6370
  _DOCUMENT_ENTITY_NORMALIZEDVALUE._serialized_start=6103
  _DOCUMENT_ENTITY_NORMALIZEDVALUE._serialized_end=6370
  _DOCUMENT_ENTITYRELATION._serialized_start=6372
  _DOCUMENT_ENTITYRELATION._serialized_end=6445
  _DOCUMENT_TEXTANCHOR._serialized_start=6448
  _DOCUMENT_TEXTANCHOR._serialized_end=6616
  _DOCUMENT_TEXTANCHOR_TEXTSEGMENT._serialized_start=6563
  _DOCUMENT_TEXTANCHOR_TEXTSEGMENT._serialized_end=6616
  _DOCUMENT_PAGEANCHOR._serialized_start=6619
  _DOCUMENT_PAGEANCHOR._serialized_end=7091
  _DOCUMENT_PAGEANCHOR_PAGEREF._serialized_start=6710
  _DOCUMENT_PAGEANCHOR_PAGEREF._serialized_end=7091
  _DOCUMENT_PAGEANCHOR_PAGEREF_LAYOUTTYPE._serialized_start=6956
  _DOCUMENT_PAGEANCHOR_PAGEREF_LAYOUTTYPE._serialized_end=7091
  _DOCUMENT_PROVENANCE._serialized_start=7094
  _DOCUMENT_PROVENANCE._serialized_end=7490
  _DOCUMENT_PROVENANCE_PARENT._serialized_start=7292
  _DOCUMENT_PROVENANCE_PARENT._serialized_end=7349
  _DOCUMENT_PROVENANCE_OPERATIONTYPE._serialized_start=7352
  _DOCUMENT_PROVENANCE_OPERATIONTYPE._serialized_end=7490
  _DOCUMENT_REVISION._serialized_start=7493
  _DOCUMENT_REVISION._serialized_end=7762
  _DOCUMENT_REVISION_HUMANREVIEW._serialized_start=7701
  _DOCUMENT_REVISION_HUMANREVIEW._serialized_end=7752
  _DOCUMENT_TEXTCHANGE._serialized_start=7765
  _DOCUMENT_TEXTCHANGE._serialized_end=7938
# @@protoc_insertion_point(module_scope)
