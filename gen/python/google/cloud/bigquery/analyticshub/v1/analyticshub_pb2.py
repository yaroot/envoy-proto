# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8google/cloud/bigquery/analyticshub/v1/analyticshub.proto\x12%google.cloud.bigquery.analyticshub.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xb5\x02\n\x0c\x44\x61taExchange\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x1c\n\x0fprimary_contact\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rdocumentation\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rlisting_count\x18\x06 \x01(\x05\x42\x03\xe0\x41\x03\x12\x11\n\x04icon\x18\x07 \x01(\x0c\x42\x03\xe0\x41\x01:t\xea\x41q\n(analyticshub.googleapis.com/DataExchange\x12\x45projects/{project}/locations/{location}/dataExchanges/{data_exchange}\"?\n\x0c\x44\x61taProvider\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x1c\n\x0fprimary_contact\x18\x02 \x01(\tB\x03\xe0\x41\x01\"<\n\tPublisher\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x1c\n\x0fprimary_contact\x18\x02 \x01(\tB\x03\xe0\x41\x01\"O\n\x1b\x44\x65stinationDatasetReference\x12\x17\n\ndataset_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\nproject_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\"\x8c\x03\n\x12\x44\x65stinationDataset\x12\x62\n\x11\x64\x61taset_reference\x18\x01 \x01(\x0b\x32\x42.google.cloud.bigquery.analyticshub.v1.DestinationDatasetReferenceB\x03\xe0\x41\x02\x12\x38\n\rfriendly_name\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x01\x12\x36\n\x0b\x64\x65scription\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x01\x12Z\n\x06labels\x18\x04 \x03(\x0b\x32\x45.google.cloud.bigquery.analyticshub.v1.DestinationDataset.LabelsEntryB\x03\xe0\x41\x01\x12\x15\n\x08location\x18\x05 \x01(\tB\x03\xe0\x41\x02\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x9e\x0b\n\x07Listing\x12\x65\n\x10\x62igquery_dataset\x18\x06 \x01(\x0b\x32\x44.google.cloud.bigquery.analyticshub.v1.Listing.BigQueryDatasetSourceB\x03\xe0\x41\x02H\x00\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x1c\n\x0fprimary_contact\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rdocumentation\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12H\n\x05state\x18\x07 \x01(\x0e\x32\x34.google.cloud.bigquery.analyticshub.v1.Listing.StateB\x03\xe0\x41\x03\x12\x11\n\x04icon\x18\x08 \x01(\x0c\x42\x03\xe0\x41\x01\x12O\n\rdata_provider\x18\t \x01(\x0b\x32\x33.google.cloud.bigquery.analyticshub.v1.DataProviderB\x03\xe0\x41\x01\x12P\n\ncategories\x18\n \x03(\x0e\x32\x37.google.cloud.bigquery.analyticshub.v1.Listing.CategoryB\x03\xe0\x41\x01\x12H\n\tpublisher\x18\x0b \x01(\x0b\x32\x30.google.cloud.bigquery.analyticshub.v1.PublisherB\x03\xe0\x41\x01\x12\x1b\n\x0erequest_access\x18\x0c \x01(\tB\x03\xe0\x41\x01\x1aN\n\x15\x42igQueryDatasetSource\x12\x35\n\x07\x64\x61taset\x18\x01 \x01(\tB$\xfa\x41!\n\x1f\x62igquery.googleapis.com/Dataset\"*\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\"\xb7\x04\n\x08\x43\x61tegory\x12\x18\n\x14\x43\x41TEGORY_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x43\x41TEGORY_OTHERS\x10\x01\x12&\n\"CATEGORY_ADVERTISING_AND_MARKETING\x10\x02\x12\x15\n\x11\x43\x41TEGORY_COMMERCE\x10\x03\x12$\n CATEGORY_CLIMATE_AND_ENVIRONMENT\x10\x04\x12\x19\n\x15\x43\x41TEGORY_DEMOGRAPHICS\x10\x05\x12\x16\n\x12\x43\x41TEGORY_ECONOMICS\x10\x06\x12\x16\n\x12\x43\x41TEGORY_EDUCATION\x10\x07\x12\x13\n\x0f\x43\x41TEGORY_ENERGY\x10\x08\x12\x16\n\x12\x43\x41TEGORY_FINANCIAL\x10\t\x12\x13\n\x0f\x43\x41TEGORY_GAMING\x10\n\x12\x17\n\x13\x43\x41TEGORY_GEOSPATIAL\x10\x0b\x12(\n$CATEGORY_HEALTHCARE_AND_LIFE_SCIENCE\x10\x0c\x12\x12\n\x0e\x43\x41TEGORY_MEDIA\x10\r\x12\x1a\n\x16\x43\x41TEGORY_PUBLIC_SECTOR\x10\x0e\x12\x13\n\x0f\x43\x41TEGORY_RETAIL\x10\x0f\x12\x13\n\x0f\x43\x41TEGORY_SPORTS\x10\x10\x12!\n\x1d\x43\x41TEGORY_SCIENCE_AND_RESEARCH\x10\x11\x12)\n%CATEGORY_TRANSPORTATION_AND_LOGISTICS\x10\x12\x12\x1f\n\x1b\x43\x41TEGORY_TRAVEL_AND_TOURISM\x10\x13:\x82\x01\xea\x41\x7f\n#analyticshub.googleapis.com/Listing\x12Xprojects/{project}/locations/{location}/dataExchanges/{data_exchange}/listings/{listing}B\x08\n\x06source\"|\n\x18ListDataExchangesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x81\x01\n\x19ListDataExchangesResponse\x12K\n\x0e\x64\x61ta_exchanges\x18\x01 \x03(\x0b\x32\x33.google.cloud.bigquery.analyticshub.v1.DataExchange\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x1bListOrgDataExchangesRequest\x12\x19\n\x0corganization\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x84\x01\n\x1cListOrgDataExchangesResponse\x12K\n\x0e\x64\x61ta_exchanges\x18\x01 \x03(\x0b\x32\x33.google.cloud.bigquery.analyticshub.v1.DataExchange\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"X\n\x16GetDataExchangeRequest\x12>\n\x04name\x18\x01 \x01(\tB0\xe0\x41\x02\xfa\x41*\n(analyticshub.googleapis.com/DataExchange\"\xc6\x01\n\x19\x43reateDataExchangeRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x1d\n\x10\x64\x61ta_exchange_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12O\n\rdata_exchange\x18\x03 \x01(\x0b\x32\x33.google.cloud.bigquery.analyticshub.v1.DataExchangeB\x03\xe0\x41\x02\"\xa2\x01\n\x19UpdateDataExchangeRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12O\n\rdata_exchange\x18\x02 \x01(\x0b\x32\x33.google.cloud.bigquery.analyticshub.v1.DataExchangeB\x03\xe0\x41\x02\"[\n\x19\x44\x65leteDataExchangeRequest\x12>\n\x04name\x18\x01 \x01(\tB0\xe0\x41\x02\xfa\x41*\n(analyticshub.googleapis.com/DataExchange\"~\n\x13ListListingsRequest\x12@\n\x06parent\x18\x01 \x01(\tB0\xe0\x41\x02\xfa\x41*\n(analyticshub.googleapis.com/DataExchange\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"q\n\x14ListListingsResponse\x12@\n\x08listings\x18\x01 \x03(\x0b\x32..google.cloud.bigquery.analyticshub.v1.Listing\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"N\n\x11GetListingRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#analyticshub.googleapis.com/Listing\"\xb7\x01\n\x14\x43reateListingRequest\x12@\n\x06parent\x18\x01 \x01(\tB0\xe0\x41\x02\xfa\x41*\n(analyticshub.googleapis.com/DataExchange\x12\x17\n\nlisting_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x44\n\x07listing\x18\x03 \x01(\x0b\x32..google.cloud.bigquery.analyticshub.v1.ListingB\x03\xe0\x41\x02\"\x92\x01\n\x14UpdateListingRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x44\n\x07listing\x18\x02 \x01(\x0b\x32..google.cloud.bigquery.analyticshub.v1.ListingB\x03\xe0\x41\x02\"Q\n\x14\x44\x65leteListingRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#analyticshub.googleapis.com/Listing\"\xbd\x01\n\x17SubscribeListingRequest\x12X\n\x13\x64\x65stination_dataset\x18\x03 \x01(\x0b\x32\x39.google.cloud.bigquery.analyticshub.v1.DestinationDatasetH\x00\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#analyticshub.googleapis.com/ListingB\r\n\x0b\x64\x65stination\"\x1a\n\x18SubscribeListingResponse2\xde\x1b\n\x13\x41nalyticsHubService\x12\xda\x01\n\x11ListDataExchanges\x12?.google.cloud.bigquery.analyticshub.v1.ListDataExchangesRequest\x1a@.google.cloud.bigquery.analyticshub.v1.ListDataExchangesResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1/{parent=projects/*/locations/*}/dataExchanges\xda\x41\x06parent\x12\xf4\x01\n\x14ListOrgDataExchanges\x12\x42.google.cloud.bigquery.analyticshub.v1.ListOrgDataExchangesRequest\x1a\x43.google.cloud.bigquery.analyticshub.v1.ListOrgDataExchangesResponse\"S\x82\xd3\xe4\x93\x02>\x12</v1/{organization=organizations/*/locations/*}/dataExchanges\xda\x41\x0corganization\x12\xc7\x01\n\x0fGetDataExchange\x12=.google.cloud.bigquery.analyticshub.v1.GetDataExchangeRequest\x1a\x33.google.cloud.bigquery.analyticshub.v1.DataExchange\"@\x82\xd3\xe4\x93\x02\x33\x12\x31/v1/{name=projects/*/locations/*/dataExchanges/*}\xda\x41\x04name\x12\xec\x01\n\x12\x43reateDataExchange\x12@.google.cloud.bigquery.analyticshub.v1.CreateDataExchangeRequest\x1a\x33.google.cloud.bigquery.analyticshub.v1.DataExchange\"_\x82\xd3\xe4\x93\x02\x42\"1/v1/{parent=projects/*/locations/*}/dataExchanges:\rdata_exchange\xda\x41\x14parent,data_exchange\x12\xff\x01\n\x12UpdateDataExchange\x12@.google.cloud.bigquery.analyticshub.v1.UpdateDataExchangeRequest\x1a\x33.google.cloud.bigquery.analyticshub.v1.DataExchange\"r\x82\xd3\xe4\x93\x02P2?/v1/{data_exchange.name=projects/*/locations/*/dataExchanges/*}:\rdata_exchange\xda\x41\x19\x64\x61ta_exchange,update_mask\x12\xb0\x01\n\x12\x44\x65leteDataExchange\x12@.google.cloud.bigquery.analyticshub.v1.DeleteDataExchangeRequest\x1a\x16.google.protobuf.Empty\"@\x82\xd3\xe4\x93\x02\x33*1/v1/{name=projects/*/locations/*/dataExchanges/*}\xda\x41\x04name\x12\xd6\x01\n\x0cListListings\x12:.google.cloud.bigquery.analyticshub.v1.ListListingsRequest\x1a;.google.cloud.bigquery.analyticshub.v1.ListListingsResponse\"M\x82\xd3\xe4\x93\x02>\x12</v1/{parent=projects/*/locations/*/dataExchanges/*}/listings\xda\x41\x06parent\x12\xc3\x01\n\nGetListing\x12\x38.google.cloud.bigquery.analyticshub.v1.GetListingRequest\x1a..google.cloud.bigquery.analyticshub.v1.Listing\"K\x82\xd3\xe4\x93\x02>\x12</v1/{name=projects/*/locations/*/dataExchanges/*/listings/*}\xda\x41\x04name\x12\xdc\x01\n\rCreateListing\x12;.google.cloud.bigquery.analyticshub.v1.CreateListingRequest\x1a..google.cloud.bigquery.analyticshub.v1.Listing\"^\x82\xd3\xe4\x93\x02G\"</v1/{parent=projects/*/locations/*/dataExchanges/*}/listings:\x07listing\xda\x41\x0eparent,listing\x12\xe9\x01\n\rUpdateListing\x12;.google.cloud.bigquery.analyticshub.v1.UpdateListingRequest\x1a..google.cloud.bigquery.analyticshub.v1.Listing\"k\x82\xd3\xe4\x93\x02O2D/v1/{listing.name=projects/*/locations/*/dataExchanges/*/listings/*}:\x07listing\xda\x41\x13listing,update_mask\x12\xb1\x01\n\rDeleteListing\x12;.google.cloud.bigquery.analyticshub.v1.DeleteListingRequest\x1a\x16.google.protobuf.Empty\"K\x82\xd3\xe4\x93\x02>*</v1/{name=projects/*/locations/*/dataExchanges/*/listings/*}\xda\x41\x04name\x12\xed\x01\n\x10SubscribeListing\x12>.google.cloud.bigquery.analyticshub.v1.SubscribeListingRequest\x1a?.google.cloud.bigquery.analyticshub.v1.SubscribeListingResponse\"X\x82\xd3\xe4\x93\x02K\"F/v1/{name=projects/*/locations/*/dataExchanges/*/listings/*}:subscribe:\x01*\xda\x41\x04name\x12\xee\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\xa2\x01\x82\xd3\xe4\x93\x02\x9b\x01\"B/v1/{resource=projects/*/locations/*/dataExchanges/*}:getIamPolicy:\x01*ZR\"M/v1/{resource=projects/*/locations/*/dataExchanges/*/listings/*}:getIamPolicy:\x01*\x12\xee\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\xa2\x01\x82\xd3\xe4\x93\x02\x9b\x01\"B/v1/{resource=projects/*/locations/*/dataExchanges/*}:setIamPolicy:\x01*ZR\"M/v1/{resource=projects/*/locations/*/dataExchanges/*/listings/*}:setIamPolicy:\x01*\x12\x9a\x02\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"\xae\x01\x82\xd3\xe4\x93\x02\xa7\x01\"H/v1/{resource=projects/*/locations/*/dataExchanges/*}:testIamPermissions:\x01*ZX\"S/v1/{resource=projects/*/locations/*/dataExchanges/*/listings/*}:testIamPermissions:\x01*\x1ax\xca\x41\x1b\x61nalyticshub.googleapis.com\xd2\x41Whttps://www.googleapis.com/auth/bigquery,https://www.googleapis.com/auth/cloud-platformB\xda\x02\n)com.google.cloud.bigquery.analyticshub.v1B\x11\x41nalyticsHubProtoP\x01ZQgoogle.golang.org/genproto/googleapis/cloud/bigquery/analyticshub/v1;analyticshub\xaa\x02%Google.Cloud.BigQuery.AnalyticsHub.V1\xca\x02%Google\\Cloud\\BigQuery\\AnalyticsHub\\V1\xea\x02)Google::Cloud::Bigquery::AnalyticsHub::V1\xea\x41H\n\x1f\x62igquery.googleapis.com/Dataset\x12%projects/{project}/datasets/{dataset}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.analyticshub.v1.analyticshub_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.google.cloud.bigquery.analyticshub.v1B\021AnalyticsHubProtoP\001ZQgoogle.golang.org/genproto/googleapis/cloud/bigquery/analyticshub/v1;analyticshub\252\002%Google.Cloud.BigQuery.AnalyticsHub.V1\312\002%Google\\Cloud\\BigQuery\\AnalyticsHub\\V1\352\002)Google::Cloud::Bigquery::AnalyticsHub::V1\352AH\n\037bigquery.googleapis.com/Dataset\022%projects/{project}/datasets/{dataset}'
  _DATAEXCHANGE.fields_by_name['name']._options = None
  _DATAEXCHANGE.fields_by_name['name']._serialized_options = b'\340A\003'
  _DATAEXCHANGE.fields_by_name['display_name']._options = None
  _DATAEXCHANGE.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _DATAEXCHANGE.fields_by_name['description']._options = None
  _DATAEXCHANGE.fields_by_name['description']._serialized_options = b'\340A\001'
  _DATAEXCHANGE.fields_by_name['primary_contact']._options = None
  _DATAEXCHANGE.fields_by_name['primary_contact']._serialized_options = b'\340A\001'
  _DATAEXCHANGE.fields_by_name['documentation']._options = None
  _DATAEXCHANGE.fields_by_name['documentation']._serialized_options = b'\340A\001'
  _DATAEXCHANGE.fields_by_name['listing_count']._options = None
  _DATAEXCHANGE.fields_by_name['listing_count']._serialized_options = b'\340A\003'
  _DATAEXCHANGE.fields_by_name['icon']._options = None
  _DATAEXCHANGE.fields_by_name['icon']._serialized_options = b'\340A\001'
  _DATAEXCHANGE._options = None
  _DATAEXCHANGE._serialized_options = b'\352Aq\n(analyticshub.googleapis.com/DataExchange\022Eprojects/{project}/locations/{location}/dataExchanges/{data_exchange}'
  _DATAPROVIDER.fields_by_name['name']._options = None
  _DATAPROVIDER.fields_by_name['name']._serialized_options = b'\340A\001'
  _DATAPROVIDER.fields_by_name['primary_contact']._options = None
  _DATAPROVIDER.fields_by_name['primary_contact']._serialized_options = b'\340A\001'
  _PUBLISHER.fields_by_name['name']._options = None
  _PUBLISHER.fields_by_name['name']._serialized_options = b'\340A\001'
  _PUBLISHER.fields_by_name['primary_contact']._options = None
  _PUBLISHER.fields_by_name['primary_contact']._serialized_options = b'\340A\001'
  _DESTINATIONDATASETREFERENCE.fields_by_name['dataset_id']._options = None
  _DESTINATIONDATASETREFERENCE.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _DESTINATIONDATASETREFERENCE.fields_by_name['project_id']._options = None
  _DESTINATIONDATASETREFERENCE.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _DESTINATIONDATASET_LABELSENTRY._options = None
  _DESTINATIONDATASET_LABELSENTRY._serialized_options = b'8\001'
  _DESTINATIONDATASET.fields_by_name['dataset_reference']._options = None
  _DESTINATIONDATASET.fields_by_name['dataset_reference']._serialized_options = b'\340A\002'
  _DESTINATIONDATASET.fields_by_name['friendly_name']._options = None
  _DESTINATIONDATASET.fields_by_name['friendly_name']._serialized_options = b'\340A\001'
  _DESTINATIONDATASET.fields_by_name['description']._options = None
  _DESTINATIONDATASET.fields_by_name['description']._serialized_options = b'\340A\001'
  _DESTINATIONDATASET.fields_by_name['labels']._options = None
  _DESTINATIONDATASET.fields_by_name['labels']._serialized_options = b'\340A\001'
  _DESTINATIONDATASET.fields_by_name['location']._options = None
  _DESTINATIONDATASET.fields_by_name['location']._serialized_options = b'\340A\002'
  _LISTING_BIGQUERYDATASETSOURCE.fields_by_name['dataset']._options = None
  _LISTING_BIGQUERYDATASETSOURCE.fields_by_name['dataset']._serialized_options = b'\372A!\n\037bigquery.googleapis.com/Dataset'
  _LISTING.fields_by_name['bigquery_dataset']._options = None
  _LISTING.fields_by_name['bigquery_dataset']._serialized_options = b'\340A\002'
  _LISTING.fields_by_name['name']._options = None
  _LISTING.fields_by_name['name']._serialized_options = b'\340A\003'
  _LISTING.fields_by_name['display_name']._options = None
  _LISTING.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _LISTING.fields_by_name['description']._options = None
  _LISTING.fields_by_name['description']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['primary_contact']._options = None
  _LISTING.fields_by_name['primary_contact']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['documentation']._options = None
  _LISTING.fields_by_name['documentation']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['state']._options = None
  _LISTING.fields_by_name['state']._serialized_options = b'\340A\003'
  _LISTING.fields_by_name['icon']._options = None
  _LISTING.fields_by_name['icon']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['data_provider']._options = None
  _LISTING.fields_by_name['data_provider']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['categories']._options = None
  _LISTING.fields_by_name['categories']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['publisher']._options = None
  _LISTING.fields_by_name['publisher']._serialized_options = b'\340A\001'
  _LISTING.fields_by_name['request_access']._options = None
  _LISTING.fields_by_name['request_access']._serialized_options = b'\340A\001'
  _LISTING._options = None
  _LISTING._serialized_options = b'\352A\177\n#analyticshub.googleapis.com/Listing\022Xprojects/{project}/locations/{location}/dataExchanges/{data_exchange}/listings/{listing}'
  _LISTDATAEXCHANGESREQUEST.fields_by_name['parent']._options = None
  _LISTDATAEXCHANGESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _LISTORGDATAEXCHANGESREQUEST.fields_by_name['organization']._options = None
  _LISTORGDATAEXCHANGESREQUEST.fields_by_name['organization']._serialized_options = b'\340A\002'
  _GETDATAEXCHANGEREQUEST.fields_by_name['name']._options = None
  _GETDATAEXCHANGEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A*\n(analyticshub.googleapis.com/DataExchange'
  _CREATEDATAEXCHANGEREQUEST.fields_by_name['parent']._options = None
  _CREATEDATAEXCHANGEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEDATAEXCHANGEREQUEST.fields_by_name['data_exchange_id']._options = None
  _CREATEDATAEXCHANGEREQUEST.fields_by_name['data_exchange_id']._serialized_options = b'\340A\002'
  _CREATEDATAEXCHANGEREQUEST.fields_by_name['data_exchange']._options = None
  _CREATEDATAEXCHANGEREQUEST.fields_by_name['data_exchange']._serialized_options = b'\340A\002'
  _UPDATEDATAEXCHANGEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEDATAEXCHANGEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATEDATAEXCHANGEREQUEST.fields_by_name['data_exchange']._options = None
  _UPDATEDATAEXCHANGEREQUEST.fields_by_name['data_exchange']._serialized_options = b'\340A\002'
  _DELETEDATAEXCHANGEREQUEST.fields_by_name['name']._options = None
  _DELETEDATAEXCHANGEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A*\n(analyticshub.googleapis.com/DataExchange'
  _LISTLISTINGSREQUEST.fields_by_name['parent']._options = None
  _LISTLISTINGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A*\n(analyticshub.googleapis.com/DataExchange'
  _GETLISTINGREQUEST.fields_by_name['name']._options = None
  _GETLISTINGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#analyticshub.googleapis.com/Listing'
  _CREATELISTINGREQUEST.fields_by_name['parent']._options = None
  _CREATELISTINGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A*\n(analyticshub.googleapis.com/DataExchange'
  _CREATELISTINGREQUEST.fields_by_name['listing_id']._options = None
  _CREATELISTINGREQUEST.fields_by_name['listing_id']._serialized_options = b'\340A\002'
  _CREATELISTINGREQUEST.fields_by_name['listing']._options = None
  _CREATELISTINGREQUEST.fields_by_name['listing']._serialized_options = b'\340A\002'
  _UPDATELISTINGREQUEST.fields_by_name['update_mask']._options = None
  _UPDATELISTINGREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATELISTINGREQUEST.fields_by_name['listing']._options = None
  _UPDATELISTINGREQUEST.fields_by_name['listing']._serialized_options = b'\340A\002'
  _DELETELISTINGREQUEST.fields_by_name['name']._options = None
  _DELETELISTINGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#analyticshub.googleapis.com/Listing'
  _SUBSCRIBELISTINGREQUEST.fields_by_name['name']._options = None
  _SUBSCRIBELISTINGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#analyticshub.googleapis.com/Listing'
  _ANALYTICSHUBSERVICE._options = None
  _ANALYTICSHUBSERVICE._serialized_options = b'\312A\033analyticshub.googleapis.com\322AWhttps://www.googleapis.com/auth/bigquery,https://www.googleapis.com/auth/cloud-platform'
  _ANALYTICSHUBSERVICE.methods_by_name['ListDataExchanges']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['ListDataExchanges']._serialized_options = b'\202\323\344\223\0023\0221/v1/{parent=projects/*/locations/*}/dataExchanges\332A\006parent'
  _ANALYTICSHUBSERVICE.methods_by_name['ListOrgDataExchanges']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['ListOrgDataExchanges']._serialized_options = b'\202\323\344\223\002>\022</v1/{organization=organizations/*/locations/*}/dataExchanges\332A\014organization'
  _ANALYTICSHUBSERVICE.methods_by_name['GetDataExchange']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['GetDataExchange']._serialized_options = b'\202\323\344\223\0023\0221/v1/{name=projects/*/locations/*/dataExchanges/*}\332A\004name'
  _ANALYTICSHUBSERVICE.methods_by_name['CreateDataExchange']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['CreateDataExchange']._serialized_options = b'\202\323\344\223\002B\"1/v1/{parent=projects/*/locations/*}/dataExchanges:\rdata_exchange\332A\024parent,data_exchange'
  _ANALYTICSHUBSERVICE.methods_by_name['UpdateDataExchange']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['UpdateDataExchange']._serialized_options = b'\202\323\344\223\002P2?/v1/{data_exchange.name=projects/*/locations/*/dataExchanges/*}:\rdata_exchange\332A\031data_exchange,update_mask'
  _ANALYTICSHUBSERVICE.methods_by_name['DeleteDataExchange']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['DeleteDataExchange']._serialized_options = b'\202\323\344\223\0023*1/v1/{name=projects/*/locations/*/dataExchanges/*}\332A\004name'
  _ANALYTICSHUBSERVICE.methods_by_name['ListListings']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['ListListings']._serialized_options = b'\202\323\344\223\002>\022</v1/{parent=projects/*/locations/*/dataExchanges/*}/listings\332A\006parent'
  _ANALYTICSHUBSERVICE.methods_by_name['GetListing']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['GetListing']._serialized_options = b'\202\323\344\223\002>\022</v1/{name=projects/*/locations/*/dataExchanges/*/listings/*}\332A\004name'
  _ANALYTICSHUBSERVICE.methods_by_name['CreateListing']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['CreateListing']._serialized_options = b'\202\323\344\223\002G\"</v1/{parent=projects/*/locations/*/dataExchanges/*}/listings:\007listing\332A\016parent,listing'
  _ANALYTICSHUBSERVICE.methods_by_name['UpdateListing']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['UpdateListing']._serialized_options = b'\202\323\344\223\002O2D/v1/{listing.name=projects/*/locations/*/dataExchanges/*/listings/*}:\007listing\332A\023listing,update_mask'
  _ANALYTICSHUBSERVICE.methods_by_name['DeleteListing']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['DeleteListing']._serialized_options = b'\202\323\344\223\002>*</v1/{name=projects/*/locations/*/dataExchanges/*/listings/*}\332A\004name'
  _ANALYTICSHUBSERVICE.methods_by_name['SubscribeListing']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['SubscribeListing']._serialized_options = b'\202\323\344\223\002K\"F/v1/{name=projects/*/locations/*/dataExchanges/*/listings/*}:subscribe:\001*\332A\004name'
  _ANALYTICSHUBSERVICE.methods_by_name['GetIamPolicy']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002\233\001\"B/v1/{resource=projects/*/locations/*/dataExchanges/*}:getIamPolicy:\001*ZR\"M/v1/{resource=projects/*/locations/*/dataExchanges/*/listings/*}:getIamPolicy:\001*'
  _ANALYTICSHUBSERVICE.methods_by_name['SetIamPolicy']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002\233\001\"B/v1/{resource=projects/*/locations/*/dataExchanges/*}:setIamPolicy:\001*ZR\"M/v1/{resource=projects/*/locations/*/dataExchanges/*/listings/*}:setIamPolicy:\001*'
  _ANALYTICSHUBSERVICE.methods_by_name['TestIamPermissions']._options = None
  _ANALYTICSHUBSERVICE.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002\247\001\"H/v1/{resource=projects/*/locations/*/dataExchanges/*}:testIamPermissions:\001*ZX\"S/v1/{resource=projects/*/locations/*/dataExchanges/*/listings/*}:testIamPermissions:\001*'
  _DATAEXCHANGE._serialized_start=370
  _DATAEXCHANGE._serialized_end=679
  _DATAPROVIDER._serialized_start=681
  _DATAPROVIDER._serialized_end=744
  _PUBLISHER._serialized_start=746
  _PUBLISHER._serialized_end=806
  _DESTINATIONDATASETREFERENCE._serialized_start=808
  _DESTINATIONDATASETREFERENCE._serialized_end=887
  _DESTINATIONDATASET._serialized_start=890
  _DESTINATIONDATASET._serialized_end=1286
  _DESTINATIONDATASET_LABELSENTRY._serialized_start=1241
  _DESTINATIONDATASET_LABELSENTRY._serialized_end=1286
  _LISTING._serialized_start=1289
  _LISTING._serialized_end=2727
  _LISTING_BIGQUERYDATASETSOURCE._serialized_start=1892
  _LISTING_BIGQUERYDATASETSOURCE._serialized_end=1970
  _LISTING_STATE._serialized_start=1972
  _LISTING_STATE._serialized_end=2014
  _LISTING_CATEGORY._serialized_start=2017
  _LISTING_CATEGORY._serialized_end=2584
  _LISTDATAEXCHANGESREQUEST._serialized_start=2729
  _LISTDATAEXCHANGESREQUEST._serialized_end=2853
  _LISTDATAEXCHANGESRESPONSE._serialized_start=2856
  _LISTDATAEXCHANGESRESPONSE._serialized_end=2985
  _LISTORGDATAEXCHANGESREQUEST._serialized_start=2987
  _LISTORGDATAEXCHANGESREQUEST._serialized_end=3082
  _LISTORGDATAEXCHANGESRESPONSE._serialized_start=3085
  _LISTORGDATAEXCHANGESRESPONSE._serialized_end=3217
  _GETDATAEXCHANGEREQUEST._serialized_start=3219
  _GETDATAEXCHANGEREQUEST._serialized_end=3307
  _CREATEDATAEXCHANGEREQUEST._serialized_start=3310
  _CREATEDATAEXCHANGEREQUEST._serialized_end=3508
  _UPDATEDATAEXCHANGEREQUEST._serialized_start=3511
  _UPDATEDATAEXCHANGEREQUEST._serialized_end=3673
  _DELETEDATAEXCHANGEREQUEST._serialized_start=3675
  _DELETEDATAEXCHANGEREQUEST._serialized_end=3766
  _LISTLISTINGSREQUEST._serialized_start=3768
  _LISTLISTINGSREQUEST._serialized_end=3894
  _LISTLISTINGSRESPONSE._serialized_start=3896
  _LISTLISTINGSRESPONSE._serialized_end=4009
  _GETLISTINGREQUEST._serialized_start=4011
  _GETLISTINGREQUEST._serialized_end=4089
  _CREATELISTINGREQUEST._serialized_start=4092
  _CREATELISTINGREQUEST._serialized_end=4275
  _UPDATELISTINGREQUEST._serialized_start=4278
  _UPDATELISTINGREQUEST._serialized_end=4424
  _DELETELISTINGREQUEST._serialized_start=4426
  _DELETELISTINGREQUEST._serialized_end=4507
  _SUBSCRIBELISTINGREQUEST._serialized_start=4510
  _SUBSCRIBELISTINGREQUEST._serialized_end=4699
  _SUBSCRIBELISTINGRESPONSE._serialized_start=4701
  _SUBSCRIBELISTINGRESPONSE._serialized_end=4727
  _ANALYTICSHUBSERVICE._serialized_start=4730
  _ANALYTICSHUBSERVICE._serialized_end=8280
# @@protoc_insertion_point(module_scope)