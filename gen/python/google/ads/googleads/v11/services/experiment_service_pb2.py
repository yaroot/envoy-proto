# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/experiment_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.resources import experiment_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_experiment__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:google/ads/googleads/v11/services/experiment_service.proto\x12!google.ads.googleads.v11.services\x1a\x33google/ads/googleads/v11/resources/experiment.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xb5\x01\n\x18MutateExperimentsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12O\n\noperations\x18\x02 \x03(\x0b\x32\x36.google.ads.googleads.v11.services.ExperimentOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\x93\x02\n\x13\x45xperimentOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12@\n\x06\x63reate\x18\x01 \x01(\x0b\x32..google.ads.googleads.v11.resources.ExperimentH\x00\x12@\n\x06update\x18\x02 \x01(\x0b\x32..google.ads.googleads.v11.resources.ExperimentH\x00\x12:\n\x06remove\x18\x03 \x01(\tB(\xfa\x41%\n#googleads.googleapis.com/ExperimentH\x00\x42\x0b\n\toperation\"\x9a\x01\n\x19MutateExperimentsResponse\x12\x31\n\x15partial_failure_error\x18\x01 \x01(\x0b\x32\x12.google.rpc.Status\x12J\n\x07results\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v11.services.MutateExperimentResult\"Y\n\x16MutateExperimentResult\x12?\n\rresource_name\x18\x01 \x01(\tB(\xfa\x41%\n#googleads.googleapis.com/Experiment\"n\n\x14\x45ndExperimentRequest\x12?\n\nexperiment\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment\x12\x15\n\rvalidate_only\x18\x02 \x01(\x08\"\x8d\x01\n ListExperimentAsyncErrorsRequest\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment\x12\x12\n\npage_token\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\"`\n!ListExperimentAsyncErrorsResponse\x12\"\n\x06\x65rrors\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xd4\x01\n\x19GraduateExperimentRequest\x12?\n\nexperiment\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment\x12_\n\x18\x63\x61mpaign_budget_mappings\x18\x02 \x03(\x0b\x32\x38.google.ads.googleads.v11.services.CampaignBudgetMappingB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"\xa9\x01\n\x15\x43\x61mpaignBudgetMapping\x12\x46\n\x13\x65xperiment_campaign\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!googleads.googleapis.com/Campaign\x12H\n\x0f\x63\x61mpaign_budget\x18\x02 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'googleads.googleapis.com/CampaignBudget\"v\n\x19ScheduleExperimentRequest\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment\x12\x15\n\rvalidate_only\x18\x02 \x01(\x08\"]\n\x1aScheduleExperimentMetadata\x12?\n\nexperiment\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment\"u\n\x18PromoteExperimentRequest\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment\x12\x15\n\rvalidate_only\x18\x02 \x01(\x08\"\\\n\x19PromoteExperimentMetadata\x12?\n\nexperiment\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/Experiment2\xb3\x0c\n\x11\x45xperimentService\x12\xe5\x01\n\x11MutateExperiments\x12;.google.ads.googleads.v11.services.MutateExperimentsRequest\x1a<.google.ads.googleads.v11.services.MutateExperimentsResponse\"U\x82\xd3\xe4\x93\x02\x36\"1/v11/customers/{customer_id=*}/experiments:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x12\xb3\x01\n\rEndExperiment\x12\x37.google.ads.googleads.v11.services.EndExperimentRequest\x1a\x16.google.protobuf.Empty\"Q\x82\xd3\xe4\x93\x02>\"9/v11/{experiment=customers/*/experiments/*}:endExperiment:\x01*\xda\x41\nexperiment\x12\x88\x02\n\x19ListExperimentAsyncErrors\x12\x43.google.ads.googleads.v11.services.ListExperimentAsyncErrorsRequest\x1a\x44.google.ads.googleads.v11.services.ListExperimentAsyncErrorsResponse\"`\x82\xd3\xe4\x93\x02J\x12H/v11/{resource_name=customers/*/experiments/*}:listExperimentAsyncErrors\xda\x41\rresource_name\x12\xdb\x01\n\x12GraduateExperiment\x12<.google.ads.googleads.v11.services.GraduateExperimentRequest\x1a\x16.google.protobuf.Empty\"o\x82\xd3\xe4\x93\x02\x43\">/v11/{experiment=customers/*/experiments/*}:graduateExperiment:\x01*\xda\x41#experiment,campaign_budget_mappings\x12\xa8\x02\n\x12ScheduleExperiment\x12<.google.ads.googleads.v11.services.ScheduleExperimentRequest\x1a\x1d.google.longrunning.Operation\"\xb4\x01\x82\xd3\xe4\x93\x02\x46\"A/v11/{resource_name=customers/*/experiments/*}:scheduleExperiment:\x01*\xda\x41\rresource_name\xca\x41U\n\x15google.protobuf.Empty\x12<google.ads.googleads.v11.services.ScheduleExperimentMetadata\x12\xa4\x02\n\x11PromoteExperiment\x12;.google.ads.googleads.v11.services.PromoteExperimentRequest\x1a\x1d.google.longrunning.Operation\"\xb2\x01\x82\xd3\xe4\x93\x02\x45\"@/v11/{resource_name=customers/*/experiments/*}:promoteExperiment:\x01*\xda\x41\rresource_name\xca\x41T\n\x15google.protobuf.Empty\x12;google.ads.googleads.v11.services.PromoteExperimentMetadata\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x82\x02\n%com.google.ads.googleads.v11.servicesB\x16\x45xperimentServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.experiment_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\026ExperimentServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATEEXPERIMENTSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEEXPERIMENTSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEEXPERIMENTSREQUEST.fields_by_name['operations']._options = None
  _MUTATEEXPERIMENTSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _EXPERIMENTOPERATION.fields_by_name['remove']._options = None
  _EXPERIMENTOPERATION.fields_by_name['remove']._serialized_options = b'\372A%\n#googleads.googleapis.com/Experiment'
  _MUTATEEXPERIMENTRESULT.fields_by_name['resource_name']._options = None
  _MUTATEEXPERIMENTRESULT.fields_by_name['resource_name']._serialized_options = b'\372A%\n#googleads.googleapis.com/Experiment'
  _ENDEXPERIMENTREQUEST.fields_by_name['experiment']._options = None
  _ENDEXPERIMENTREQUEST.fields_by_name['experiment']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _LISTEXPERIMENTASYNCERRORSREQUEST.fields_by_name['resource_name']._options = None
  _LISTEXPERIMENTASYNCERRORSREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _GRADUATEEXPERIMENTREQUEST.fields_by_name['experiment']._options = None
  _GRADUATEEXPERIMENTREQUEST.fields_by_name['experiment']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _GRADUATEEXPERIMENTREQUEST.fields_by_name['campaign_budget_mappings']._options = None
  _GRADUATEEXPERIMENTREQUEST.fields_by_name['campaign_budget_mappings']._serialized_options = b'\340A\002'
  _CAMPAIGNBUDGETMAPPING.fields_by_name['experiment_campaign']._options = None
  _CAMPAIGNBUDGETMAPPING.fields_by_name['experiment_campaign']._serialized_options = b'\340A\002\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGNBUDGETMAPPING.fields_by_name['campaign_budget']._options = None
  _CAMPAIGNBUDGETMAPPING.fields_by_name['campaign_budget']._serialized_options = b'\340A\002\372A)\n\'googleads.googleapis.com/CampaignBudget'
  _SCHEDULEEXPERIMENTREQUEST.fields_by_name['resource_name']._options = None
  _SCHEDULEEXPERIMENTREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _SCHEDULEEXPERIMENTMETADATA.fields_by_name['experiment']._options = None
  _SCHEDULEEXPERIMENTMETADATA.fields_by_name['experiment']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _PROMOTEEXPERIMENTREQUEST.fields_by_name['resource_name']._options = None
  _PROMOTEEXPERIMENTREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _PROMOTEEXPERIMENTMETADATA.fields_by_name['experiment']._options = None
  _PROMOTEEXPERIMENTMETADATA.fields_by_name['experiment']._serialized_options = b'\340A\002\372A%\n#googleads.googleapis.com/Experiment'
  _EXPERIMENTSERVICE._options = None
  _EXPERIMENTSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _EXPERIMENTSERVICE.methods_by_name['MutateExperiments']._options = None
  _EXPERIMENTSERVICE.methods_by_name['MutateExperiments']._serialized_options = b'\202\323\344\223\0026\"1/v11/customers/{customer_id=*}/experiments:mutate:\001*\332A\026customer_id,operations'
  _EXPERIMENTSERVICE.methods_by_name['EndExperiment']._options = None
  _EXPERIMENTSERVICE.methods_by_name['EndExperiment']._serialized_options = b'\202\323\344\223\002>\"9/v11/{experiment=customers/*/experiments/*}:endExperiment:\001*\332A\nexperiment'
  _EXPERIMENTSERVICE.methods_by_name['ListExperimentAsyncErrors']._options = None
  _EXPERIMENTSERVICE.methods_by_name['ListExperimentAsyncErrors']._serialized_options = b'\202\323\344\223\002J\022H/v11/{resource_name=customers/*/experiments/*}:listExperimentAsyncErrors\332A\rresource_name'
  _EXPERIMENTSERVICE.methods_by_name['GraduateExperiment']._options = None
  _EXPERIMENTSERVICE.methods_by_name['GraduateExperiment']._serialized_options = b'\202\323\344\223\002C\">/v11/{experiment=customers/*/experiments/*}:graduateExperiment:\001*\332A#experiment,campaign_budget_mappings'
  _EXPERIMENTSERVICE.methods_by_name['ScheduleExperiment']._options = None
  _EXPERIMENTSERVICE.methods_by_name['ScheduleExperiment']._serialized_options = b'\202\323\344\223\002F\"A/v11/{resource_name=customers/*/experiments/*}:scheduleExperiment:\001*\332A\rresource_name\312AU\n\025google.protobuf.Empty\022<google.ads.googleads.v11.services.ScheduleExperimentMetadata'
  _EXPERIMENTSERVICE.methods_by_name['PromoteExperiment']._options = None
  _EXPERIMENTSERVICE.methods_by_name['PromoteExperiment']._serialized_options = b'\202\323\344\223\002E\"@/v11/{resource_name=customers/*/experiments/*}:promoteExperiment:\001*\332A\rresource_name\312AT\n\025google.protobuf.Empty\022;google.ads.googleads.v11.services.PromoteExperimentMetadata'
  _MUTATEEXPERIMENTSREQUEST._serialized_start=391
  _MUTATEEXPERIMENTSREQUEST._serialized_end=572
  _EXPERIMENTOPERATION._serialized_start=575
  _EXPERIMENTOPERATION._serialized_end=850
  _MUTATEEXPERIMENTSRESPONSE._serialized_start=853
  _MUTATEEXPERIMENTSRESPONSE._serialized_end=1007
  _MUTATEEXPERIMENTRESULT._serialized_start=1009
  _MUTATEEXPERIMENTRESULT._serialized_end=1098
  _ENDEXPERIMENTREQUEST._serialized_start=1100
  _ENDEXPERIMENTREQUEST._serialized_end=1210
  _LISTEXPERIMENTASYNCERRORSREQUEST._serialized_start=1213
  _LISTEXPERIMENTASYNCERRORSREQUEST._serialized_end=1354
  _LISTEXPERIMENTASYNCERRORSRESPONSE._serialized_start=1356
  _LISTEXPERIMENTASYNCERRORSRESPONSE._serialized_end=1452
  _GRADUATEEXPERIMENTREQUEST._serialized_start=1455
  _GRADUATEEXPERIMENTREQUEST._serialized_end=1667
  _CAMPAIGNBUDGETMAPPING._serialized_start=1670
  _CAMPAIGNBUDGETMAPPING._serialized_end=1839
  _SCHEDULEEXPERIMENTREQUEST._serialized_start=1841
  _SCHEDULEEXPERIMENTREQUEST._serialized_end=1959
  _SCHEDULEEXPERIMENTMETADATA._serialized_start=1961
  _SCHEDULEEXPERIMENTMETADATA._serialized_end=2054
  _PROMOTEEXPERIMENTREQUEST._serialized_start=2056
  _PROMOTEEXPERIMENTREQUEST._serialized_end=2173
  _PROMOTEEXPERIMENTMETADATA._serialized_start=2175
  _PROMOTEEXPERIMENTMETADATA._serialized_end=2267
  _EXPERIMENTSERVICE._serialized_start=2270
  _EXPERIMENTSERVICE._serialized_end=3857
# @@protoc_insertion_point(module_scope)
