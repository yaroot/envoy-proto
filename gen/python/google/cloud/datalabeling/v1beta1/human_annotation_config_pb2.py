# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/cloud/datalabeling/v1beta1/human_annotation_config.proto\x12!google.cloud.datalabeling.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1egoogle/protobuf/duration.proto\"\xd4\x02\n\x15HumanAnnotationConfig\x12\x18\n\x0binstruction\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12+\n\x1e\x61nnotated_dataset_display_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12*\n\x1d\x61nnotated_dataset_description\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x18\n\x0blabel_group\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rlanguage_code\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rreplica_count\x18\x06 \x01(\x05\x42\x03\xe0\x41\x01\x12\x39\n\x11question_duration\x18\x07 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x01\x12\x1f\n\x12\x63ontributor_emails\x18\t \x03(\tB\x03\xe0\x41\x01\x12\x1a\n\x12user_email_address\x18\n \x01(\t\"\xbd\x01\n\x19ImageClassificationConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1e\n\x11\x61llow_multi_label\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\x12^\n\x17\x61nswer_aggregation_type\x18\x03 \x01(\x0e\x32\x38.google.cloud.datalabeling.v1beta1.StringAggregationTypeB\x03\xe0\x41\x01\"X\n\x12\x42oundingPolyConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12 \n\x13instruction_message\x18\x02 \x01(\tB\x03\xe0\x41\x01\"T\n\x0ePolylineConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12 \n\x13instruction_message\x18\x02 \x01(\tB\x03\xe0\x41\x01\"S\n\x12SegmentationConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1b\n\x13instruction_message\x18\x02 \x01(\t\"\x9b\x02\n\x19VideoClassificationConfig\x12~\n\x1b\x61nnotation_spec_set_configs\x18\x01 \x03(\x0b\x32T.google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfigB\x03\xe0\x41\x02\x12!\n\x14\x61pply_shot_detection\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\x1a[\n\x17\x41nnotationSpecSetConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1e\n\x11\x61llow_multi_label\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"]\n\x15ObjectDetectionConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\"\n\x15\x65xtraction_frame_rate\x18\x03 \x01(\x01\x42\x03\xe0\x41\x02\"8\n\x14ObjectTrackingConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\"0\n\x0b\x45ventConfig\x12!\n\x14\x61nnotation_spec_sets\x18\x01 \x03(\tB\x03\xe0\x41\x02\"\xaf\x01\n\x18TextClassificationConfig\x12\x1e\n\x11\x61llow_multi_label\x18\x01 \x01(\x08\x42\x03\xe0\x41\x01\x12 \n\x13\x61nnotation_spec_set\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12Q\n\x10sentiment_config\x18\x03 \x01(\x0b\x32\x32.google.cloud.datalabeling.v1beta1.SentimentConfigB\x03\xe0\x41\x01\";\n\x0fSentimentConfig\x12(\n enable_label_sentiment_selection\x18\x01 \x01(\x08\">\n\x1aTextEntityExtractionConfig\x12 \n\x13\x61nnotation_spec_set\x18\x01 \x01(\tB\x03\xe0\x41\x02*{\n\x15StringAggregationType\x12\'\n#STRING_AGGREGATION_TYPE_UNSPECIFIED\x10\x00\x12\x11\n\rMAJORITY_VOTE\x10\x01\x12\x12\n\x0eUNANIMOUS_VOTE\x10\x02\x12\x12\n\x0eNO_AGGREGATION\x10\x03\x42\xe7\x01\n%com.google.cloud.datalabeling.v1beta1P\x01ZMgoogle.golang.org/genproto/googleapis/cloud/datalabeling/v1beta1;datalabeling\xaa\x02!Google.Cloud.DataLabeling.V1Beta1\xca\x02!Google\\Cloud\\DataLabeling\\V1beta1\xea\x02$Google::Cloud::DataLabeling::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.datalabeling.v1beta1.human_annotation_config_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.cloud.datalabeling.v1beta1P\001ZMgoogle.golang.org/genproto/googleapis/cloud/datalabeling/v1beta1;datalabeling\252\002!Google.Cloud.DataLabeling.V1Beta1\312\002!Google\\Cloud\\DataLabeling\\V1beta1\352\002$Google::Cloud::DataLabeling::V1beta1'
  _HUMANANNOTATIONCONFIG.fields_by_name['instruction']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['instruction']._serialized_options = b'\340A\002'
  _HUMANANNOTATIONCONFIG.fields_by_name['annotated_dataset_display_name']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['annotated_dataset_display_name']._serialized_options = b'\340A\002'
  _HUMANANNOTATIONCONFIG.fields_by_name['annotated_dataset_description']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['annotated_dataset_description']._serialized_options = b'\340A\001'
  _HUMANANNOTATIONCONFIG.fields_by_name['label_group']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['label_group']._serialized_options = b'\340A\001'
  _HUMANANNOTATIONCONFIG.fields_by_name['language_code']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _HUMANANNOTATIONCONFIG.fields_by_name['replica_count']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['replica_count']._serialized_options = b'\340A\001'
  _HUMANANNOTATIONCONFIG.fields_by_name['question_duration']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['question_duration']._serialized_options = b'\340A\001'
  _HUMANANNOTATIONCONFIG.fields_by_name['contributor_emails']._options = None
  _HUMANANNOTATIONCONFIG.fields_by_name['contributor_emails']._serialized_options = b'\340A\001'
  _IMAGECLASSIFICATIONCONFIG.fields_by_name['annotation_spec_set']._options = None
  _IMAGECLASSIFICATIONCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _IMAGECLASSIFICATIONCONFIG.fields_by_name['allow_multi_label']._options = None
  _IMAGECLASSIFICATIONCONFIG.fields_by_name['allow_multi_label']._serialized_options = b'\340A\001'
  _IMAGECLASSIFICATIONCONFIG.fields_by_name['answer_aggregation_type']._options = None
  _IMAGECLASSIFICATIONCONFIG.fields_by_name['answer_aggregation_type']._serialized_options = b'\340A\001'
  _BOUNDINGPOLYCONFIG.fields_by_name['annotation_spec_set']._options = None
  _BOUNDINGPOLYCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _BOUNDINGPOLYCONFIG.fields_by_name['instruction_message']._options = None
  _BOUNDINGPOLYCONFIG.fields_by_name['instruction_message']._serialized_options = b'\340A\001'
  _POLYLINECONFIG.fields_by_name['annotation_spec_set']._options = None
  _POLYLINECONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _POLYLINECONFIG.fields_by_name['instruction_message']._options = None
  _POLYLINECONFIG.fields_by_name['instruction_message']._serialized_options = b'\340A\001'
  _SEGMENTATIONCONFIG.fields_by_name['annotation_spec_set']._options = None
  _SEGMENTATIONCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _VIDEOCLASSIFICATIONCONFIG_ANNOTATIONSPECSETCONFIG.fields_by_name['annotation_spec_set']._options = None
  _VIDEOCLASSIFICATIONCONFIG_ANNOTATIONSPECSETCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _VIDEOCLASSIFICATIONCONFIG_ANNOTATIONSPECSETCONFIG.fields_by_name['allow_multi_label']._options = None
  _VIDEOCLASSIFICATIONCONFIG_ANNOTATIONSPECSETCONFIG.fields_by_name['allow_multi_label']._serialized_options = b'\340A\001'
  _VIDEOCLASSIFICATIONCONFIG.fields_by_name['annotation_spec_set_configs']._options = None
  _VIDEOCLASSIFICATIONCONFIG.fields_by_name['annotation_spec_set_configs']._serialized_options = b'\340A\002'
  _VIDEOCLASSIFICATIONCONFIG.fields_by_name['apply_shot_detection']._options = None
  _VIDEOCLASSIFICATIONCONFIG.fields_by_name['apply_shot_detection']._serialized_options = b'\340A\001'
  _OBJECTDETECTIONCONFIG.fields_by_name['annotation_spec_set']._options = None
  _OBJECTDETECTIONCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _OBJECTDETECTIONCONFIG.fields_by_name['extraction_frame_rate']._options = None
  _OBJECTDETECTIONCONFIG.fields_by_name['extraction_frame_rate']._serialized_options = b'\340A\002'
  _OBJECTTRACKINGCONFIG.fields_by_name['annotation_spec_set']._options = None
  _OBJECTTRACKINGCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _EVENTCONFIG.fields_by_name['annotation_spec_sets']._options = None
  _EVENTCONFIG.fields_by_name['annotation_spec_sets']._serialized_options = b'\340A\002'
  _TEXTCLASSIFICATIONCONFIG.fields_by_name['allow_multi_label']._options = None
  _TEXTCLASSIFICATIONCONFIG.fields_by_name['allow_multi_label']._serialized_options = b'\340A\001'
  _TEXTCLASSIFICATIONCONFIG.fields_by_name['annotation_spec_set']._options = None
  _TEXTCLASSIFICATIONCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _TEXTCLASSIFICATIONCONFIG.fields_by_name['sentiment_config']._options = None
  _TEXTCLASSIFICATIONCONFIG.fields_by_name['sentiment_config']._serialized_options = b'\340A\001'
  _TEXTENTITYEXTRACTIONCONFIG.fields_by_name['annotation_spec_set']._options = None
  _TEXTENTITYEXTRACTIONCONFIG.fields_by_name['annotation_spec_set']._serialized_options = b'\340A\002'
  _STRINGAGGREGATIONTYPE._serialized_start=1755
  _STRINGAGGREGATIONTYPE._serialized_end=1878
  _HUMANANNOTATIONCONFIG._serialized_start=168
  _HUMANANNOTATIONCONFIG._serialized_end=508
  _IMAGECLASSIFICATIONCONFIG._serialized_start=511
  _IMAGECLASSIFICATIONCONFIG._serialized_end=700
  _BOUNDINGPOLYCONFIG._serialized_start=702
  _BOUNDINGPOLYCONFIG._serialized_end=790
  _POLYLINECONFIG._serialized_start=792
  _POLYLINECONFIG._serialized_end=876
  _SEGMENTATIONCONFIG._serialized_start=878
  _SEGMENTATIONCONFIG._serialized_end=961
  _VIDEOCLASSIFICATIONCONFIG._serialized_start=964
  _VIDEOCLASSIFICATIONCONFIG._serialized_end=1247
  _VIDEOCLASSIFICATIONCONFIG_ANNOTATIONSPECSETCONFIG._serialized_start=1156
  _VIDEOCLASSIFICATIONCONFIG_ANNOTATIONSPECSETCONFIG._serialized_end=1247
  _OBJECTDETECTIONCONFIG._serialized_start=1249
  _OBJECTDETECTIONCONFIG._serialized_end=1342
  _OBJECTTRACKINGCONFIG._serialized_start=1344
  _OBJECTTRACKINGCONFIG._serialized_end=1400
  _EVENTCONFIG._serialized_start=1402
  _EVENTCONFIG._serialized_end=1450
  _TEXTCLASSIFICATIONCONFIG._serialized_start=1453
  _TEXTCLASSIFICATIONCONFIG._serialized_end=1628
  _SENTIMENTCONFIG._serialized_start=1630
  _SENTIMENTCONFIG._serialized_end=1689
  _TEXTENTITYEXTRACTIONCONFIG._serialized_start=1691
  _TEXTENTITYEXTRACTIONCONFIG._serialized_end=1753
# @@protoc_insertion_point(module_scope)