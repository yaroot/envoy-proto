# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/explanation.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.aiplatform.v1beta1 import explanation_metadata_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_explanation__metadata__pb2
from google.cloud.aiplatform.v1beta1 import io_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_io__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/aiplatform/v1beta1/explanation.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a:google/cloud/aiplatform/v1beta1/explanation_metadata.proto\x1a(google/cloud/aiplatform/v1beta1/io.proto\x1a\x1cgoogle/protobuf/struct.proto\"\x99\x01\n\x0b\x45xplanation\x12G\n\x0c\x61ttributions\x18\x01 \x03(\x0b\x32,.google.cloud.aiplatform.v1beta1.AttributionB\x03\xe0\x41\x03\x12\x41\n\tneighbors\x18\x02 \x03(\x0b\x32).google.cloud.aiplatform.v1beta1.NeighborB\x03\xe0\x41\x03\"`\n\x10ModelExplanation\x12L\n\x11mean_attributions\x18\x01 \x03(\x0b\x32,.google.cloud.aiplatform.v1beta1.AttributionB\x03\xe0\x41\x03\"\x89\x02\n\x0b\x41ttribution\x12\"\n\x15\x62\x61seline_output_value\x18\x01 \x01(\x01\x42\x03\xe0\x41\x03\x12\"\n\x15instance_output_value\x18\x02 \x01(\x01\x42\x03\xe0\x41\x03\x12\x39\n\x14\x66\x65\x61ture_attributions\x18\x03 \x01(\x0b\x32\x16.google.protobuf.ValueB\x03\xe0\x41\x03\x12\x19\n\x0coutput_index\x18\x04 \x03(\x05\x42\x03\xe0\x41\x03\x12 \n\x13output_display_name\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12 \n\x13\x61pproximation_error\x18\x06 \x01(\x01\x42\x03\xe0\x41\x03\x12\x18\n\x0boutput_name\x18\x07 \x01(\tB\x03\xe0\x41\x03\"D\n\x08Neighbor\x12\x18\n\x0bneighbor_id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1e\n\x11neighbor_distance\x18\x02 \x01(\x01\x42\x03\xe0\x41\x03\"\xaf\x01\n\x0f\x45xplanationSpec\x12O\n\nparameters\x18\x01 \x01(\x0b\x32\x36.google.cloud.aiplatform.v1beta1.ExplanationParametersB\x03\xe0\x41\x02\x12K\n\x08metadata\x18\x02 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1beta1.ExplanationMetadataB\x03\xe0\x41\x01\"\xc1\x03\n\x15\x45xplanationParameters\x12\x61\n\x1bsampled_shapley_attribution\x18\x01 \x01(\x0b\x32:.google.cloud.aiplatform.v1beta1.SampledShapleyAttributionH\x00\x12k\n integrated_gradients_attribution\x18\x02 \x01(\x0b\x32?.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttributionH\x00\x12L\n\x10xrai_attribution\x18\x03 \x01(\x0b\x32\x30.google.cloud.aiplatform.v1beta1.XraiAttributionH\x00\x12=\n\x08\x65xamples\x18\x07 \x01(\x0b\x32).google.cloud.aiplatform.v1beta1.ExamplesH\x00\x12\r\n\x05top_k\x18\x04 \x01(\x05\x12\x32\n\x0eoutput_indices\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.ListValueB\x08\n\x06method\"4\n\x19SampledShapleyAttribution\x12\x17\n\npath_count\x18\x01 \x01(\x05\x42\x03\xe0\x41\x02\"\xdb\x01\n\x1eIntegratedGradientsAttribution\x12\x17\n\nstep_count\x18\x01 \x01(\x05\x42\x03\xe0\x41\x02\x12M\n\x12smooth_grad_config\x18\x02 \x01(\x0b\x32\x31.google.cloud.aiplatform.v1beta1.SmoothGradConfig\x12Q\n\x14\x62lur_baseline_config\x18\x03 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.BlurBaselineConfig\"\xcc\x01\n\x0fXraiAttribution\x12\x17\n\nstep_count\x18\x01 \x01(\x05\x42\x03\xe0\x41\x02\x12M\n\x12smooth_grad_config\x18\x02 \x01(\x0b\x32\x31.google.cloud.aiplatform.v1beta1.SmoothGradConfig\x12Q\n\x14\x62lur_baseline_config\x18\x03 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.BlurBaselineConfig\"\xae\x01\n\x10SmoothGradConfig\x12\x15\n\x0bnoise_sigma\x18\x01 \x01(\x02H\x00\x12Q\n\x13\x66\x65\x61ture_noise_sigma\x18\x02 \x01(\x0b\x32\x32.google.cloud.aiplatform.v1beta1.FeatureNoiseSigmaH\x00\x12\x1a\n\x12noisy_sample_count\x18\x03 \x01(\x05\x42\x14\n\x12GradientNoiseSigma\"\xa6\x01\n\x11\x46\x65\x61tureNoiseSigma\x12\\\n\x0bnoise_sigma\x18\x01 \x03(\x0b\x32G.google.cloud.aiplatform.v1beta1.FeatureNoiseSigma.NoiseSigmaForFeature\x1a\x33\n\x14NoiseSigmaForFeature\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05sigma\x18\x02 \x01(\x02\",\n\x12\x42lurBaselineConfig\x12\x16\n\x0emax_blur_sigma\x18\x01 \x01(\x02\"\xeb\x01\n\x08\x45xamples\x12@\n\x1enearest_neighbor_search_config\x18\x02 \x01(\x0b\x32\x16.google.protobuf.ValueH\x00\x12;\n\x07presets\x18\x04 \x01(\x0b\x32(.google.cloud.aiplatform.v1beta1.PresetsH\x00\x12>\n\ngcs_source\x18\x01 \x01(\x0b\x32*.google.cloud.aiplatform.v1beta1.GcsSource\x12\x16\n\x0eneighbor_count\x18\x03 \x01(\x05\x42\x08\n\x06\x63onfig\"\x84\x02\n\x07Presets\x12\x42\n\x05query\x18\x01 \x01(\x0e\x32..google.cloud.aiplatform.v1beta1.Presets.QueryH\x00\x88\x01\x01\x12\x43\n\x08modality\x18\x02 \x01(\x0e\x32\x31.google.cloud.aiplatform.v1beta1.Presets.Modality\"\x1e\n\x05Query\x12\x0b\n\x07PRECISE\x10\x00\x12\x08\n\x04\x46\x41ST\x10\x01\"F\n\x08Modality\x12\x18\n\x14MODALITY_UNSPECIFIED\x10\x00\x12\t\n\x05IMAGE\x10\x01\x12\x08\n\x04TEXT\x10\x02\x12\x0b\n\x07TABULAR\x10\x03\x42\x08\n\x06_query\"\x83\x02\n\x17\x45xplanationSpecOverride\x12J\n\nparameters\x18\x01 \x01(\x0b\x32\x36.google.cloud.aiplatform.v1beta1.ExplanationParameters\x12N\n\x08metadata\x18\x02 \x01(\x0b\x32<.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride\x12L\n\x11\x65xamples_override\x18\x03 \x01(\x0b\x32\x31.google.cloud.aiplatform.v1beta1.ExamplesOverride\"\xca\x02\n\x1b\x45xplanationMetadataOverride\x12]\n\x06inputs\x18\x01 \x03(\x0b\x32H.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride.InputsEntryB\x03\xe0\x41\x02\x1aH\n\x15InputMetadataOverride\x12/\n\x0finput_baselines\x18\x01 \x03(\x0b\x32\x16.google.protobuf.Value\x1a\x81\x01\n\x0bInputsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x61\n\x05value\x18\x02 \x01(\x0b\x32R.google.cloud.aiplatform.v1beta1.ExplanationMetadataOverride.InputMetadataOverride:\x02\x38\x01\"\xd0\x02\n\x10\x45xamplesOverride\x12\x16\n\x0eneighbor_count\x18\x01 \x01(\x05\x12\x16\n\x0e\x63rowding_count\x18\x02 \x01(\x05\x12T\n\x0crestrictions\x18\x03 \x03(\x0b\x32>.google.cloud.aiplatform.v1beta1.ExamplesRestrictionsNamespace\x12\x19\n\x11return_embeddings\x18\x04 \x01(\x08\x12Q\n\x0b\x64\x61ta_format\x18\x05 \x01(\x0e\x32<.google.cloud.aiplatform.v1beta1.ExamplesOverride.DataFormat\"H\n\nDataFormat\x12\x1b\n\x17\x44\x41TA_FORMAT_UNSPECIFIED\x10\x00\x12\r\n\tINSTANCES\x10\x01\x12\x0e\n\nEMBEDDINGS\x10\x02\"T\n\x1d\x45xamplesRestrictionsNamespace\x12\x16\n\x0enamespace_name\x18\x01 \x01(\t\x12\r\n\x05\x61llow\x18\x02 \x03(\t\x12\x0c\n\x04\x64\x65ny\x18\x03 \x03(\tB\xed\x01\n#com.google.cloud.aiplatform.v1beta1B\x10\x45xplanationProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\xaa\x02\x1fGoogle.Cloud.AIPlatform.V1Beta1\xca\x02\x1fGoogle\\Cloud\\AIPlatform\\V1beta1\xea\x02\"Google::Cloud::AIPlatform::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.explanation_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.aiplatform.v1beta1B\020ExplanationProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1'
  _EXPLANATION.fields_by_name['attributions']._options = None
  _EXPLANATION.fields_by_name['attributions']._serialized_options = b'\340A\003'
  _EXPLANATION.fields_by_name['neighbors']._options = None
  _EXPLANATION.fields_by_name['neighbors']._serialized_options = b'\340A\003'
  _MODELEXPLANATION.fields_by_name['mean_attributions']._options = None
  _MODELEXPLANATION.fields_by_name['mean_attributions']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['baseline_output_value']._options = None
  _ATTRIBUTION.fields_by_name['baseline_output_value']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['instance_output_value']._options = None
  _ATTRIBUTION.fields_by_name['instance_output_value']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['feature_attributions']._options = None
  _ATTRIBUTION.fields_by_name['feature_attributions']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['output_index']._options = None
  _ATTRIBUTION.fields_by_name['output_index']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['output_display_name']._options = None
  _ATTRIBUTION.fields_by_name['output_display_name']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['approximation_error']._options = None
  _ATTRIBUTION.fields_by_name['approximation_error']._serialized_options = b'\340A\003'
  _ATTRIBUTION.fields_by_name['output_name']._options = None
  _ATTRIBUTION.fields_by_name['output_name']._serialized_options = b'\340A\003'
  _NEIGHBOR.fields_by_name['neighbor_id']._options = None
  _NEIGHBOR.fields_by_name['neighbor_id']._serialized_options = b'\340A\003'
  _NEIGHBOR.fields_by_name['neighbor_distance']._options = None
  _NEIGHBOR.fields_by_name['neighbor_distance']._serialized_options = b'\340A\003'
  _EXPLANATIONSPEC.fields_by_name['parameters']._options = None
  _EXPLANATIONSPEC.fields_by_name['parameters']._serialized_options = b'\340A\002'
  _EXPLANATIONSPEC.fields_by_name['metadata']._options = None
  _EXPLANATIONSPEC.fields_by_name['metadata']._serialized_options = b'\340A\001'
  _SAMPLEDSHAPLEYATTRIBUTION.fields_by_name['path_count']._options = None
  _SAMPLEDSHAPLEYATTRIBUTION.fields_by_name['path_count']._serialized_options = b'\340A\002'
  _INTEGRATEDGRADIENTSATTRIBUTION.fields_by_name['step_count']._options = None
  _INTEGRATEDGRADIENTSATTRIBUTION.fields_by_name['step_count']._serialized_options = b'\340A\002'
  _XRAIATTRIBUTION.fields_by_name['step_count']._options = None
  _XRAIATTRIBUTION.fields_by_name['step_count']._serialized_options = b'\340A\002'
  _EXPLANATIONMETADATAOVERRIDE_INPUTSENTRY._options = None
  _EXPLANATIONMETADATAOVERRIDE_INPUTSENTRY._serialized_options = b'8\001'
  _EXPLANATIONMETADATAOVERRIDE.fields_by_name['inputs']._options = None
  _EXPLANATIONMETADATAOVERRIDE.fields_by_name['inputs']._serialized_options = b'\340A\002'
  _EXPLANATION._serialized_start=252
  _EXPLANATION._serialized_end=405
  _MODELEXPLANATION._serialized_start=407
  _MODELEXPLANATION._serialized_end=503
  _ATTRIBUTION._serialized_start=506
  _ATTRIBUTION._serialized_end=771
  _NEIGHBOR._serialized_start=773
  _NEIGHBOR._serialized_end=841
  _EXPLANATIONSPEC._serialized_start=844
  _EXPLANATIONSPEC._serialized_end=1019
  _EXPLANATIONPARAMETERS._serialized_start=1022
  _EXPLANATIONPARAMETERS._serialized_end=1471
  _SAMPLEDSHAPLEYATTRIBUTION._serialized_start=1473
  _SAMPLEDSHAPLEYATTRIBUTION._serialized_end=1525
  _INTEGRATEDGRADIENTSATTRIBUTION._serialized_start=1528
  _INTEGRATEDGRADIENTSATTRIBUTION._serialized_end=1747
  _XRAIATTRIBUTION._serialized_start=1750
  _XRAIATTRIBUTION._serialized_end=1954
  _SMOOTHGRADCONFIG._serialized_start=1957
  _SMOOTHGRADCONFIG._serialized_end=2131
  _FEATURENOISESIGMA._serialized_start=2134
  _FEATURENOISESIGMA._serialized_end=2300
  _FEATURENOISESIGMA_NOISESIGMAFORFEATURE._serialized_start=2249
  _FEATURENOISESIGMA_NOISESIGMAFORFEATURE._serialized_end=2300
  _BLURBASELINECONFIG._serialized_start=2302
  _BLURBASELINECONFIG._serialized_end=2346
  _EXAMPLES._serialized_start=2349
  _EXAMPLES._serialized_end=2584
  _PRESETS._serialized_start=2587
  _PRESETS._serialized_end=2847
  _PRESETS_QUERY._serialized_start=2735
  _PRESETS_QUERY._serialized_end=2765
  _PRESETS_MODALITY._serialized_start=2767
  _PRESETS_MODALITY._serialized_end=2837
  _EXPLANATIONSPECOVERRIDE._serialized_start=2850
  _EXPLANATIONSPECOVERRIDE._serialized_end=3109
  _EXPLANATIONMETADATAOVERRIDE._serialized_start=3112
  _EXPLANATIONMETADATAOVERRIDE._serialized_end=3442
  _EXPLANATIONMETADATAOVERRIDE_INPUTMETADATAOVERRIDE._serialized_start=3238
  _EXPLANATIONMETADATAOVERRIDE_INPUTMETADATAOVERRIDE._serialized_end=3310
  _EXPLANATIONMETADATAOVERRIDE_INPUTSENTRY._serialized_start=3313
  _EXPLANATIONMETADATAOVERRIDE_INPUTSENTRY._serialized_end=3442
  _EXAMPLESOVERRIDE._serialized_start=3445
  _EXAMPLESOVERRIDE._serialized_end=3781
  _EXAMPLESOVERRIDE_DATAFORMAT._serialized_start=3709
  _EXAMPLESOVERRIDE_DATAFORMAT._serialized_end=3781
  _EXAMPLESRESTRICTIONSNAMESPACE._serialized_start=3783
  _EXAMPLESRESTRICTIONSNAMESPACE._serialized_end=3867
# @@protoc_insertion_point(module_scope)
