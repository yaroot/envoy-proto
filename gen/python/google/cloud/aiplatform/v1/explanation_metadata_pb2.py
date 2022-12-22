# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/explanation_metadata.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n5google/cloud/aiplatform/v1/explanation_metadata.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1cgoogle/protobuf/struct.proto\"\xcf\x12\n\x13\x45xplanationMetadata\x12P\n\x06inputs\x18\x01 \x03(\x0b\x32;.google.cloud.aiplatform.v1.ExplanationMetadata.InputsEntryB\x03\xe0\x41\x02\x12R\n\x07outputs\x18\x02 \x03(\x0b\x32<.google.cloud.aiplatform.v1.ExplanationMetadata.OutputsEntryB\x03\xe0\x41\x02\x12\'\n\x1f\x66\x65\x61ture_attributions_schema_uri\x18\x03 \x01(\t\x12\x1b\n\x13latent_space_source\x18\x05 \x01(\t\x1a\xc4\r\n\rInputMetadata\x12/\n\x0finput_baselines\x18\x01 \x03(\x0b\x32\x16.google.protobuf.Value\x12\x19\n\x11input_tensor_name\x18\x02 \x01(\t\x12X\n\x08\x65ncoding\x18\x03 \x01(\x0e\x32\x46.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.Encoding\x12\x10\n\x08modality\x18\x04 \x01(\t\x12n\n\x14\x66\x65\x61ture_value_domain\x18\x05 \x01(\x0b\x32P.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.FeatureValueDomain\x12\x1b\n\x13indices_tensor_name\x18\x06 \x01(\t\x12\x1f\n\x17\x64\x65nse_shape_tensor_name\x18\x07 \x01(\t\x12\x1d\n\x15index_feature_mapping\x18\x08 \x03(\t\x12\x1b\n\x13\x65ncoded_tensor_name\x18\t \x01(\t\x12\x31\n\x11\x65ncoded_baselines\x18\n \x03(\x0b\x32\x16.google.protobuf.Value\x12\x62\n\rvisualization\x18\x0b \x01(\x0b\x32K.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.Visualization\x12\x12\n\ngroup_name\x18\x0c \x01(\t\x1aj\n\x12\x46\x65\x61tureValueDomain\x12\x11\n\tmin_value\x18\x01 \x01(\x02\x12\x11\n\tmax_value\x18\x02 \x01(\x02\x12\x15\n\roriginal_mean\x18\x03 \x01(\x02\x12\x17\n\x0foriginal_stddev\x18\x04 \x01(\x02\x1a\xd6\x06\n\rVisualization\x12^\n\x04type\x18\x01 \x01(\x0e\x32P.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.Visualization.Type\x12\x66\n\x08polarity\x18\x02 \x01(\x0e\x32T.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.Visualization.Polarity\x12g\n\tcolor_map\x18\x03 \x01(\x0e\x32T.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.Visualization.ColorMap\x12\x1f\n\x17\x63lip_percent_upperbound\x18\x04 \x01(\x02\x12\x1f\n\x17\x63lip_percent_lowerbound\x18\x05 \x01(\x02\x12m\n\x0coverlay_type\x18\x06 \x01(\x0e\x32W.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata.Visualization.OverlayType\"6\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06PIXELS\x10\x01\x12\x0c\n\x08OUTLINES\x10\x02\"J\n\x08Polarity\x12\x18\n\x14POLARITY_UNSPECIFIED\x10\x00\x12\x0c\n\x08POSITIVE\x10\x01\x12\x0c\n\x08NEGATIVE\x10\x02\x12\x08\n\x04\x42OTH\x10\x03\"{\n\x08\x43olorMap\x12\x19\n\x15\x43OLOR_MAP_UNSPECIFIED\x10\x00\x12\x0e\n\nPINK_GREEN\x10\x01\x12\x0b\n\x07VIRIDIS\x10\x02\x12\x07\n\x03RED\x10\x03\x12\t\n\x05GREEN\x10\x04\x12\r\n\tRED_GREEN\x10\x06\x12\x14\n\x10PINK_WHITE_GREEN\x10\x05\"b\n\x0bOverlayType\x12\x1c\n\x18OVERLAY_TYPE_UNSPECIFIED\x10\x00\x12\x08\n\x04NONE\x10\x01\x12\x0c\n\x08ORIGINAL\x10\x02\x12\r\n\tGRAYSCALE\x10\x03\x12\x0e\n\nMASK_BLACK\x10\x04\"\xa0\x01\n\x08\x45ncoding\x12\x18\n\x14\x45NCODING_UNSPECIFIED\x10\x00\x12\x0c\n\x08IDENTITY\x10\x01\x12\x13\n\x0f\x42\x41G_OF_FEATURES\x10\x02\x12\x1a\n\x16\x42\x41G_OF_FEATURES_SPARSE\x10\x03\x12\r\n\tINDICATOR\x10\x04\x12\x16\n\x12\x43OMBINED_EMBEDDING\x10\x05\x12\x14\n\x10\x43ONCAT_EMBEDDING\x10\x06\x1a\xa6\x01\n\x0eOutputMetadata\x12<\n\x1aindex_display_name_mapping\x18\x01 \x01(\x0b\x32\x16.google.protobuf.ValueH\x00\x12\"\n\x18\x64isplay_name_mapping_key\x18\x02 \x01(\tH\x00\x12\x1a\n\x12output_tensor_name\x18\x03 \x01(\tB\x16\n\x14\x64isplay_name_mapping\x1al\n\x0bInputsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12L\n\x05value\x18\x02 \x01(\x0b\x32=.google.cloud.aiplatform.v1.ExplanationMetadata.InputMetadata:\x02\x38\x01\x1an\n\x0cOutputsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12M\n\x05value\x18\x02 \x01(\x0b\x32>.google.cloud.aiplatform.v1.ExplanationMetadata.OutputMetadata:\x02\x38\x01\x42\xdc\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x18\x45xplanationMetadataProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.explanation_metadata_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\030ExplanationMetadataProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _EXPLANATIONMETADATA_INPUTSENTRY._options = None
  _EXPLANATIONMETADATA_INPUTSENTRY._serialized_options = b'8\001'
  _EXPLANATIONMETADATA_OUTPUTSENTRY._options = None
  _EXPLANATIONMETADATA_OUTPUTSENTRY._serialized_options = b'8\001'
  _EXPLANATIONMETADATA.fields_by_name['inputs']._options = None
  _EXPLANATIONMETADATA.fields_by_name['inputs']._serialized_options = b'\340A\002'
  _EXPLANATIONMETADATA.fields_by_name['outputs']._options = None
  _EXPLANATIONMETADATA.fields_by_name['outputs']._serialized_options = b'\340A\002'
  _EXPLANATIONMETADATA._serialized_start=149
  _EXPLANATIONMETADATA._serialized_end=2532
  _EXPLANATIONMETADATA_INPUTMETADATA._serialized_start=409
  _EXPLANATIONMETADATA_INPUTMETADATA._serialized_end=2141
  _EXPLANATIONMETADATA_INPUTMETADATA_FEATUREVALUEDOMAIN._serialized_start=1015
  _EXPLANATIONMETADATA_INPUTMETADATA_FEATUREVALUEDOMAIN._serialized_end=1121
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION._serialized_start=1124
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION._serialized_end=1978
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_TYPE._serialized_start=1623
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_TYPE._serialized_end=1677
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_POLARITY._serialized_start=1679
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_POLARITY._serialized_end=1753
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_COLORMAP._serialized_start=1755
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_COLORMAP._serialized_end=1878
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_OVERLAYTYPE._serialized_start=1880
  _EXPLANATIONMETADATA_INPUTMETADATA_VISUALIZATION_OVERLAYTYPE._serialized_end=1978
  _EXPLANATIONMETADATA_INPUTMETADATA_ENCODING._serialized_start=1981
  _EXPLANATIONMETADATA_INPUTMETADATA_ENCODING._serialized_end=2141
  _EXPLANATIONMETADATA_OUTPUTMETADATA._serialized_start=2144
  _EXPLANATIONMETADATA_OUTPUTMETADATA._serialized_end=2310
  _EXPLANATIONMETADATA_INPUTSENTRY._serialized_start=2312
  _EXPLANATIONMETADATA_INPUTSENTRY._serialized_end=2420
  _EXPLANATIONMETADATA_OUTPUTSENTRY._serialized_start=2422
  _EXPLANATIONMETADATA_OUTPUTSENTRY._serialized_end=2532
# @@protoc_insertion_point(module_scope)