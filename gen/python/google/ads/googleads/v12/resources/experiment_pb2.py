# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/resources/experiment.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.common import metric_goal_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_common_dot_metric__goal__pb2
from google.ads.googleads.v12.enums import async_action_status_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_async__action__status__pb2
from google.ads.googleads.v12.enums import experiment_status_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_experiment__status__pb2
from google.ads.googleads.v12.enums import experiment_type_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_experiment__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/ads/googleads/v12/resources/experiment.proto\x12\"google.ads.googleads.v12.resources\x1a\x31google/ads/googleads/v12/common/metric_goal.proto\x1a\x38google/ads/googleads/v12/enums/async_action_status.proto\x1a\x36google/ads/googleads/v12/enums/experiment_status.proto\x1a\x34google/ads/googleads/v12/enums/experiment_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xf5\x05\n\nExperiment\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xe0\x41\x05\xfa\x41%\n#googleads.googleapis.com/Experiment\x12\x1f\n\rexperiment_id\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x11\n\x04name\x18\n \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x0b \x01(\t\x12\x0e\n\x06suffix\x18\x0c \x01(\t\x12T\n\x04type\x18\r \x01(\x0e\x32\x41.google.ads.googleads.v12.enums.ExperimentTypeEnum.ExperimentTypeB\x03\xe0\x41\x02\x12U\n\x06status\x18\x0e \x01(\x0e\x32\x45.google.ads.googleads.v12.enums.ExperimentStatusEnum.ExperimentStatus\x12\x17\n\nstart_date\x18\x0f \x01(\tH\x01\x88\x01\x01\x12\x15\n\x08\x65nd_date\x18\x10 \x01(\tH\x02\x88\x01\x01\x12:\n\x05goals\x18\x11 \x03(\x0b\x32+.google.ads.googleads.v12.common.MetricGoal\x12(\n\x16long_running_operation\x18\x12 \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12\x64\n\x0epromote_status\x18\x13 \x01(\x0e\x32G.google.ads.googleads.v12.enums.AsyncActionStatusEnum.AsyncActionStatusB\x03\xe0\x41\x03:X\xea\x41U\n#googleads.googleapis.com/Experiment\x12.customers/{customer_id}/experiments/{trial_id}B\x10\n\x0e_experiment_idB\r\n\x0b_start_dateB\x0b\n\t_end_dateB\x19\n\x17_long_running_operationB\x81\x02\n&com.google.ads.googleads.v12.resourcesB\x0f\x45xperimentProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V12.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V12\\Resources\xea\x02&Google::Ads::GoogleAds::V12::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.resources.experiment_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v12.resourcesB\017ExperimentProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources\352\002&Google::Ads::GoogleAds::V12::Resources'
  _EXPERIMENT.fields_by_name['resource_name']._options = None
  _EXPERIMENT.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A%\n#googleads.googleapis.com/Experiment'
  _EXPERIMENT.fields_by_name['experiment_id']._options = None
  _EXPERIMENT.fields_by_name['experiment_id']._serialized_options = b'\340A\003'
  _EXPERIMENT.fields_by_name['name']._options = None
  _EXPERIMENT.fields_by_name['name']._serialized_options = b'\340A\002'
  _EXPERIMENT.fields_by_name['type']._options = None
  _EXPERIMENT.fields_by_name['type']._serialized_options = b'\340A\002'
  _EXPERIMENT.fields_by_name['long_running_operation']._options = None
  _EXPERIMENT.fields_by_name['long_running_operation']._serialized_options = b'\340A\003'
  _EXPERIMENT.fields_by_name['promote_status']._options = None
  _EXPERIMENT.fields_by_name['promote_status']._serialized_options = b'\340A\003'
  _EXPERIMENT._options = None
  _EXPERIMENT._serialized_options = b'\352AU\n#googleads.googleapis.com/Experiment\022.customers/{customer_id}/experiments/{trial_id}'
  _EXPERIMENT._serialized_start=371
  _EXPERIMENT._serialized_end=1128
# @@protoc_insertion_point(module_scope)