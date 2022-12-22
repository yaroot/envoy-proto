# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_classification.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n_google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_classification.proto\x12=google.cloud.aiplatform.v1beta1.schema.trainingjob.definition\"\xff\x01\n\x19\x41utoMlImageClassification\x12n\n\x06inputs\x18\x01 \x01(\x0b\x32^.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationInputs\x12r\n\x08metadata\x18\x02 \x01(\x0b\x32`.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata\"\x98\x03\n\x1f\x41utoMlImageClassificationInputs\x12|\n\nmodel_type\x18\x01 \x01(\x0e\x32h.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationInputs.ModelType\x12\x15\n\rbase_model_id\x18\x02 \x01(\t\x12\x1f\n\x17\x62udget_milli_node_hours\x18\x03 \x01(\x03\x12\x1e\n\x16\x64isable_early_stopping\x18\x04 \x01(\x08\x12\x13\n\x0bmulti_label\x18\x05 \x01(\x08\"\x89\x01\n\tModelType\x12\x1a\n\x16MODEL_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x43LOUD\x10\x01\x12\x1b\n\x17MOBILE_TF_LOW_LATENCY_1\x10\x02\x12\x19\n\x15MOBILE_TF_VERSATILE_1\x10\x03\x12\x1d\n\x19MOBILE_TF_HIGH_ACCURACY_1\x10\x04\"\xc3\x02\n!AutoMlImageClassificationMetadata\x12\x1d\n\x15\x63ost_milli_node_hours\x18\x01 \x01(\x03\x12\x95\x01\n\x16successful_stop_reason\x18\x02 \x01(\x0e\x32u.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason\"g\n\x14SuccessfulStopReason\x12&\n\"SUCCESSFUL_STOP_REASON_UNSPECIFIED\x10\x00\x12\x12\n\x0e\x42UDGET_REACHED\x10\x01\x12\x13\n\x0fMODEL_CONVERGED\x10\x02\x42\x94\x03\nAcom.google.cloud.aiplatform.v1beta1.schema.trainingjob.definitionB\x1e\x41utoMLImageClassificationProtoP\x01Zggoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/trainingjob/definition;definition\xaa\x02=Google.Cloud.AIPlatform.V1Beta1.Schema.TrainingJob.Definition\xca\x02=Google\\Cloud\\AIPlatform\\V1beta1\\Schema\\TrainingJob\\Definition\xea\x02\x43Google::Cloud::AIPlatform::V1beta1::Schema::TrainingJob::Definitionb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.automl_image_classification_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\nAcom.google.cloud.aiplatform.v1beta1.schema.trainingjob.definitionB\036AutoMLImageClassificationProtoP\001Zggoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/trainingjob/definition;definition\252\002=Google.Cloud.AIPlatform.V1Beta1.Schema.TrainingJob.Definition\312\002=Google\\Cloud\\AIPlatform\\V1beta1\\Schema\\TrainingJob\\Definition\352\002CGoogle::Cloud::AIPlatform::V1beta1::Schema::TrainingJob::Definition'
  _AUTOMLIMAGECLASSIFICATION._serialized_start=163
  _AUTOMLIMAGECLASSIFICATION._serialized_end=418
  _AUTOMLIMAGECLASSIFICATIONINPUTS._serialized_start=421
  _AUTOMLIMAGECLASSIFICATIONINPUTS._serialized_end=829
  _AUTOMLIMAGECLASSIFICATIONINPUTS_MODELTYPE._serialized_start=692
  _AUTOMLIMAGECLASSIFICATIONINPUTS_MODELTYPE._serialized_end=829
  _AUTOMLIMAGECLASSIFICATIONMETADATA._serialized_start=832
  _AUTOMLIMAGECLASSIFICATIONMETADATA._serialized_end=1155
  _AUTOMLIMAGECLASSIFICATIONMETADATA_SUCCESSFULSTOPREASON._serialized_start=1052
  _AUTOMLIMAGECLASSIFICATIONMETADATA_SUCCESSFULSTOPREASON._serialized_end=1155
# @@protoc_insertion_point(module_scope)