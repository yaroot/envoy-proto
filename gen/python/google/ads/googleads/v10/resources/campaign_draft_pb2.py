# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/campaign_draft.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import campaign_draft_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_campaign__draft__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7google/ads/googleads/v10/resources/campaign_draft.proto\x12\"google.ads.googleads.v10.resources\x1a:google/ads/googleads/v10/enums/campaign_draft_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xae\x05\n\rCampaignDraft\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xe0\x41\x05\xfa\x41(\n&googleads.googleapis.com/CampaignDraft\x12\x1a\n\x08\x64raft_id\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x45\n\rbase_campaign\x18\n \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/CampaignH\x01\x88\x01\x01\x12\x11\n\x04name\x18\x0b \x01(\tH\x02\x88\x01\x01\x12\x46\n\x0e\x64raft_campaign\x18\x0c \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CampaignH\x03\x88\x01\x01\x12`\n\x06status\x18\x06 \x01(\x0e\x32K.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.CampaignDraftStatusB\x03\xe0\x41\x03\x12(\n\x16has_experiment_running\x18\r \x01(\x08\x42\x03\xe0\x41\x03H\x04\x88\x01\x01\x12(\n\x16long_running_operation\x18\x0e \x01(\tB\x03\xe0\x41\x03H\x05\x88\x01\x01:q\xea\x41n\n&googleads.googleapis.com/CampaignDraft\x12\x44\x63ustomers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}B\x0b\n\t_draft_idB\x10\n\x0e_base_campaignB\x07\n\x05_nameB\x11\n\x0f_draft_campaignB\x19\n\x17_has_experiment_runningB\x19\n\x17_long_running_operationB\x84\x02\n&com.google.ads.googleads.v10.resourcesB\x12\x43\x61mpaignDraftProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.campaign_draft_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\022CampaignDraftProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CAMPAIGNDRAFT.fields_by_name['resource_name']._options = None
  _CAMPAIGNDRAFT.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A(\n&googleads.googleapis.com/CampaignDraft'
  _CAMPAIGNDRAFT.fields_by_name['draft_id']._options = None
  _CAMPAIGNDRAFT.fields_by_name['draft_id']._serialized_options = b'\340A\003'
  _CAMPAIGNDRAFT.fields_by_name['base_campaign']._options = None
  _CAMPAIGNDRAFT.fields_by_name['base_campaign']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGNDRAFT.fields_by_name['draft_campaign']._options = None
  _CAMPAIGNDRAFT.fields_by_name['draft_campaign']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGNDRAFT.fields_by_name['status']._options = None
  _CAMPAIGNDRAFT.fields_by_name['status']._serialized_options = b'\340A\003'
  _CAMPAIGNDRAFT.fields_by_name['has_experiment_running']._options = None
  _CAMPAIGNDRAFT.fields_by_name['has_experiment_running']._serialized_options = b'\340A\003'
  _CAMPAIGNDRAFT.fields_by_name['long_running_operation']._options = None
  _CAMPAIGNDRAFT.fields_by_name['long_running_operation']._serialized_options = b'\340A\003'
  _CAMPAIGNDRAFT._options = None
  _CAMPAIGNDRAFT._serialized_options = b'\352An\n&googleads.googleapis.com/CampaignDraft\022Dcustomers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}'
  _CAMPAIGNDRAFT._serialized_start=216
  _CAMPAIGNDRAFT._serialized_end=902
# @@protoc_insertion_point(module_scope)