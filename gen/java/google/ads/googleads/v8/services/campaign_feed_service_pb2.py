# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/campaign_feed_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v8.resources import campaign_feed_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_campaign__feed__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/campaign_feed_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB\030CampaignFeedServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/ads/googleads/v8/services/campaign_feed_service.proto\x12 google.ads.googleads.v8.services\x1a\x39google/ads/googleads/v8/enums/response_content_type.proto\x1a\x35google/ads/googleads/v8/resources/campaign_feed.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"^\n\x16GetCampaignFeedRequest\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%googleads.googleapis.com/CampaignFeed\"\xa3\x02\n\x1aMutateCampaignFeedsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12P\n\noperations\x18\x02 \x03(\x0b\x32\x37.google.ads.googleads.v8.services.CampaignFeedOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v8.enums.ResponseContentTypeEnum.ResponseContentType\"\xed\x01\n\x15\x43\x61mpaignFeedOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x41\n\x06\x63reate\x18\x01 \x01(\x0b\x32/.google.ads.googleads.v8.resources.CampaignFeedH\x00\x12\x41\n\x06update\x18\x02 \x01(\x0b\x32/.google.ads.googleads.v8.resources.CampaignFeedH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x9d\x01\n\x1bMutateCampaignFeedsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12K\n\x07results\x18\x02 \x03(\x0b\x32:.google.ads.googleads.v8.services.MutateCampaignFeedResult\"y\n\x18MutateCampaignFeedResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12\x46\n\rcampaign_feed\x18\x02 \x01(\x0b\x32/.google.ads.googleads.v8.resources.CampaignFeed2\x91\x04\n\x13\x43\x61mpaignFeedService\x12\xc5\x01\n\x0fGetCampaignFeed\x12\x38.google.ads.googleads.v8.services.GetCampaignFeedRequest\x1a/.google.ads.googleads.v8.resources.CampaignFeed\"G\x82\xd3\xe4\x93\x02\x31\x12//v8/{resource_name=customers/*/campaignFeeds/*}\xda\x41\rresource_name\x12\xea\x01\n\x13MutateCampaignFeeds\x12<.google.ads.googleads.v8.services.MutateCampaignFeedsRequest\x1a=.google.ads.googleads.v8.services.MutateCampaignFeedsResponse\"V\x82\xd3\xe4\x93\x02\x37\"2/v8/customers/{customer_id=*}/campaignFeeds:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xff\x01\n$com.google.ads.googleads.v8.servicesB\x18\x43\x61mpaignFeedServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_campaign__feed__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETCAMPAIGNFEEDREQUEST = _descriptor.Descriptor(
  name='GetCampaignFeedRequest',
  full_name='google.ads.googleads.v8.services.GetCampaignFeedRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetCampaignFeedRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\'\n%googleads.googleapis.com/CampaignFeed', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=386,
  serialized_end=480,
)


_MUTATECAMPAIGNFEEDSREQUEST = _descriptor.Descriptor(
  name='MutateCampaignFeedsRequest',
  full_name='google.ads.googleads.v8.services.MutateCampaignFeedsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsRequest.response_content_type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=483,
  serialized_end=774,
)


_CAMPAIGNFEEDOPERATION = _descriptor.Descriptor(
  name='CampaignFeedOperation',
  full_name='google.ads.googleads.v8.services.CampaignFeedOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v8.services.CampaignFeedOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v8.services.CampaignFeedOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v8.services.CampaignFeedOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v8.services.CampaignFeedOperation.remove', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v8.services.CampaignFeedOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=777,
  serialized_end=1014,
)


_MUTATECAMPAIGNFEEDSRESPONSE = _descriptor.Descriptor(
  name='MutateCampaignFeedsResponse',
  full_name='google.ads.googleads.v8.services.MutateCampaignFeedsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v8.services.MutateCampaignFeedsResponse.results', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1017,
  serialized_end=1174,
)


_MUTATECAMPAIGNFEEDRESULT = _descriptor.Descriptor(
  name='MutateCampaignFeedResult',
  full_name='google.ads.googleads.v8.services.MutateCampaignFeedResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.MutateCampaignFeedResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign_feed', full_name='google.ads.googleads.v8.services.MutateCampaignFeedResult.campaign_feed', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1176,
  serialized_end=1297,
)

_MUTATECAMPAIGNFEEDSREQUEST.fields_by_name['operations'].message_type = _CAMPAIGNFEEDOPERATION
_MUTATECAMPAIGNFEEDSREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_CAMPAIGNFEEDOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CAMPAIGNFEEDOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_campaign__feed__pb2._CAMPAIGNFEED
_CAMPAIGNFEEDOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_campaign__feed__pb2._CAMPAIGNFEED
_CAMPAIGNFEEDOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNFEEDOPERATION.fields_by_name['create'])
_CAMPAIGNFEEDOPERATION.fields_by_name['create'].containing_oneof = _CAMPAIGNFEEDOPERATION.oneofs_by_name['operation']
_CAMPAIGNFEEDOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNFEEDOPERATION.fields_by_name['update'])
_CAMPAIGNFEEDOPERATION.fields_by_name['update'].containing_oneof = _CAMPAIGNFEEDOPERATION.oneofs_by_name['operation']
_CAMPAIGNFEEDOPERATION.oneofs_by_name['operation'].fields.append(
  _CAMPAIGNFEEDOPERATION.fields_by_name['remove'])
_CAMPAIGNFEEDOPERATION.fields_by_name['remove'].containing_oneof = _CAMPAIGNFEEDOPERATION.oneofs_by_name['operation']
_MUTATECAMPAIGNFEEDSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATECAMPAIGNFEEDSRESPONSE.fields_by_name['results'].message_type = _MUTATECAMPAIGNFEEDRESULT
_MUTATECAMPAIGNFEEDRESULT.fields_by_name['campaign_feed'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_campaign__feed__pb2._CAMPAIGNFEED
DESCRIPTOR.message_types_by_name['GetCampaignFeedRequest'] = _GETCAMPAIGNFEEDREQUEST
DESCRIPTOR.message_types_by_name['MutateCampaignFeedsRequest'] = _MUTATECAMPAIGNFEEDSREQUEST
DESCRIPTOR.message_types_by_name['CampaignFeedOperation'] = _CAMPAIGNFEEDOPERATION
DESCRIPTOR.message_types_by_name['MutateCampaignFeedsResponse'] = _MUTATECAMPAIGNFEEDSRESPONSE
DESCRIPTOR.message_types_by_name['MutateCampaignFeedResult'] = _MUTATECAMPAIGNFEEDRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCampaignFeedRequest = _reflection.GeneratedProtocolMessageType('GetCampaignFeedRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCAMPAIGNFEEDREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.campaign_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetCampaignFeedRequest)
  })
_sym_db.RegisterMessage(GetCampaignFeedRequest)

MutateCampaignFeedsRequest = _reflection.GeneratedProtocolMessageType('MutateCampaignFeedsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNFEEDSREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.campaign_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateCampaignFeedsRequest)
  })
_sym_db.RegisterMessage(MutateCampaignFeedsRequest)

CampaignFeedOperation = _reflection.GeneratedProtocolMessageType('CampaignFeedOperation', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNFEEDOPERATION,
  '__module__' : 'google.ads.googleads.v8.services.campaign_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.CampaignFeedOperation)
  })
_sym_db.RegisterMessage(CampaignFeedOperation)

MutateCampaignFeedsResponse = _reflection.GeneratedProtocolMessageType('MutateCampaignFeedsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNFEEDSRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.campaign_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateCampaignFeedsResponse)
  })
_sym_db.RegisterMessage(MutateCampaignFeedsResponse)

MutateCampaignFeedResult = _reflection.GeneratedProtocolMessageType('MutateCampaignFeedResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECAMPAIGNFEEDRESULT,
  '__module__' : 'google.ads.googleads.v8.services.campaign_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateCampaignFeedResult)
  })
_sym_db.RegisterMessage(MutateCampaignFeedResult)


DESCRIPTOR._options = None
_GETCAMPAIGNFEEDREQUEST.fields_by_name['resource_name']._options = None
_MUTATECAMPAIGNFEEDSREQUEST.fields_by_name['customer_id']._options = None
_MUTATECAMPAIGNFEEDSREQUEST.fields_by_name['operations']._options = None

_CAMPAIGNFEEDSERVICE = _descriptor.ServiceDescriptor(
  name='CampaignFeedService',
  full_name='google.ads.googleads.v8.services.CampaignFeedService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1300,
  serialized_end=1829,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCampaignFeed',
    full_name='google.ads.googleads.v8.services.CampaignFeedService.GetCampaignFeed',
    index=0,
    containing_service=None,
    input_type=_GETCAMPAIGNFEEDREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_campaign__feed__pb2._CAMPAIGNFEED,
    serialized_options=b'\202\323\344\223\0021\022//v8/{resource_name=customers/*/campaignFeeds/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateCampaignFeeds',
    full_name='google.ads.googleads.v8.services.CampaignFeedService.MutateCampaignFeeds',
    index=1,
    containing_service=None,
    input_type=_MUTATECAMPAIGNFEEDSREQUEST,
    output_type=_MUTATECAMPAIGNFEEDSRESPONSE,
    serialized_options=b'\202\323\344\223\0027\"2/v8/customers/{customer_id=*}/campaignFeeds:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CAMPAIGNFEEDSERVICE)

DESCRIPTOR.services_by_name['CampaignFeedService'] = _CAMPAIGNFEEDSERVICE

# @@protoc_insertion_point(module_scope)
