# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/ad_group_feed_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import ad_group_feed_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__feed__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/ad_group_feed_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB\027AdGroupFeedServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/ads/googleads/v3/services/ad_group_feed_service.proto\x12 google.ads.googleads.v3.services\x1a\x35google/ads/googleads/v3/resources/ad_group_feed.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\\\n\x15GetAdGroupFeedRequest\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$googleads.googleapis.com/AdGroupFeed\"\xb6\x01\n\x19MutateAdGroupFeedsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12O\n\noperations\x18\x02 \x03(\x0b\x32\x36.google.ads.googleads.v3.services.AdGroupFeedOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xea\x01\n\x14\x41\x64GroupFeedOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12@\n\x06\x63reate\x18\x01 \x01(\x0b\x32..google.ads.googleads.v3.resources.AdGroupFeedH\x00\x12@\n\x06update\x18\x02 \x01(\x0b\x32..google.ads.googleads.v3.resources.AdGroupFeedH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x9b\x01\n\x1aMutateAdGroupFeedsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12J\n\x07results\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v3.services.MutateAdGroupFeedResult\"0\n\x17MutateAdGroupFeedResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\x88\x04\n\x12\x41\x64GroupFeedService\x12\xc1\x01\n\x0eGetAdGroupFeed\x12\x37.google.ads.googleads.v3.services.GetAdGroupFeedRequest\x1a..google.ads.googleads.v3.resources.AdGroupFeed\"F\x82\xd3\xe4\x93\x02\x30\x12./v3/{resource_name=customers/*/adGroupFeeds/*}\xda\x41\rresource_name\x12\xe6\x01\n\x12MutateAdGroupFeeds\x12;.google.ads.googleads.v3.services.MutateAdGroupFeedsRequest\x1a<.google.ads.googleads.v3.services.MutateAdGroupFeedsResponse\"U\x82\xd3\xe4\x93\x02\x36\"1/v3/customers/{customer_id=*}/adGroupFeeds:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfe\x01\n$com.google.ads.googleads.v3.servicesB\x17\x41\x64GroupFeedServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__feed__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETADGROUPFEEDREQUEST = _descriptor.Descriptor(
  name='GetAdGroupFeedRequest',
  full_name='google.ads.googleads.v3.services.GetAdGroupFeedRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetAdGroupFeedRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\n$googleads.googleapis.com/AdGroupFeed', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=327,
  serialized_end=419,
)


_MUTATEADGROUPFEEDSREQUEST = _descriptor.Descriptor(
  name='MutateAdGroupFeedsRequest',
  full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=422,
  serialized_end=604,
)


_ADGROUPFEEDOPERATION = _descriptor.Descriptor(
  name='AdGroupFeedOperation',
  full_name='google.ads.googleads.v3.services.AdGroupFeedOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v3.services.AdGroupFeedOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v3.services.AdGroupFeedOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v3.services.AdGroupFeedOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v3.services.AdGroupFeedOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v3.services.AdGroupFeedOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=607,
  serialized_end=841,
)


_MUTATEADGROUPFEEDSRESPONSE = _descriptor.Descriptor(
  name='MutateAdGroupFeedsResponse',
  full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedsResponse.results', index=1,
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
  serialized_start=844,
  serialized_end=999,
)


_MUTATEADGROUPFEEDRESULT = _descriptor.Descriptor(
  name='MutateAdGroupFeedResult',
  full_name='google.ads.googleads.v3.services.MutateAdGroupFeedResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.MutateAdGroupFeedResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  ],
  serialized_start=1001,
  serialized_end=1049,
)

_MUTATEADGROUPFEEDSREQUEST.fields_by_name['operations'].message_type = _ADGROUPFEEDOPERATION
_ADGROUPFEEDOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_ADGROUPFEEDOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__feed__pb2._ADGROUPFEED
_ADGROUPFEEDOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__feed__pb2._ADGROUPFEED
_ADGROUPFEEDOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPFEEDOPERATION.fields_by_name['create'])
_ADGROUPFEEDOPERATION.fields_by_name['create'].containing_oneof = _ADGROUPFEEDOPERATION.oneofs_by_name['operation']
_ADGROUPFEEDOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPFEEDOPERATION.fields_by_name['update'])
_ADGROUPFEEDOPERATION.fields_by_name['update'].containing_oneof = _ADGROUPFEEDOPERATION.oneofs_by_name['operation']
_ADGROUPFEEDOPERATION.oneofs_by_name['operation'].fields.append(
  _ADGROUPFEEDOPERATION.fields_by_name['remove'])
_ADGROUPFEEDOPERATION.fields_by_name['remove'].containing_oneof = _ADGROUPFEEDOPERATION.oneofs_by_name['operation']
_MUTATEADGROUPFEEDSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEADGROUPFEEDSRESPONSE.fields_by_name['results'].message_type = _MUTATEADGROUPFEEDRESULT
DESCRIPTOR.message_types_by_name['GetAdGroupFeedRequest'] = _GETADGROUPFEEDREQUEST
DESCRIPTOR.message_types_by_name['MutateAdGroupFeedsRequest'] = _MUTATEADGROUPFEEDSREQUEST
DESCRIPTOR.message_types_by_name['AdGroupFeedOperation'] = _ADGROUPFEEDOPERATION
DESCRIPTOR.message_types_by_name['MutateAdGroupFeedsResponse'] = _MUTATEADGROUPFEEDSRESPONSE
DESCRIPTOR.message_types_by_name['MutateAdGroupFeedResult'] = _MUTATEADGROUPFEEDRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupFeedRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupFeedRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPFEEDREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetAdGroupFeedRequest)
  })
_sym_db.RegisterMessage(GetAdGroupFeedRequest)

MutateAdGroupFeedsRequest = _reflection.GeneratedProtocolMessageType('MutateAdGroupFeedsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPFEEDSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdGroupFeedsRequest)
  })
_sym_db.RegisterMessage(MutateAdGroupFeedsRequest)

AdGroupFeedOperation = _reflection.GeneratedProtocolMessageType('AdGroupFeedOperation', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPFEEDOPERATION,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.AdGroupFeedOperation)
  })
_sym_db.RegisterMessage(AdGroupFeedOperation)

MutateAdGroupFeedsResponse = _reflection.GeneratedProtocolMessageType('MutateAdGroupFeedsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPFEEDSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdGroupFeedsResponse)
  })
_sym_db.RegisterMessage(MutateAdGroupFeedsResponse)

MutateAdGroupFeedResult = _reflection.GeneratedProtocolMessageType('MutateAdGroupFeedResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEADGROUPFEEDRESULT,
  '__module__' : 'google.ads.googleads.v3.services.ad_group_feed_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.MutateAdGroupFeedResult)
  })
_sym_db.RegisterMessage(MutateAdGroupFeedResult)


DESCRIPTOR._options = None
_GETADGROUPFEEDREQUEST.fields_by_name['resource_name']._options = None
_MUTATEADGROUPFEEDSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEADGROUPFEEDSREQUEST.fields_by_name['operations']._options = None

_ADGROUPFEEDSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupFeedService',
  full_name='google.ads.googleads.v3.services.AdGroupFeedService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1052,
  serialized_end=1572,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupFeed',
    full_name='google.ads.googleads.v3.services.AdGroupFeedService.GetAdGroupFeed',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPFEEDREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_ad__group__feed__pb2._ADGROUPFEED,
    serialized_options=b'\202\323\344\223\0020\022./v3/{resource_name=customers/*/adGroupFeeds/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateAdGroupFeeds',
    full_name='google.ads.googleads.v3.services.AdGroupFeedService.MutateAdGroupFeeds',
    index=1,
    containing_service=None,
    input_type=_MUTATEADGROUPFEEDSREQUEST,
    output_type=_MUTATEADGROUPFEEDSRESPONSE,
    serialized_options=b'\202\323\344\223\0026\"1/v3/customers/{customer_id=*}/adGroupFeeds:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPFEEDSERVICE)

DESCRIPTOR.services_by_name['AdGroupFeedService'] = _ADGROUPFEEDSERVICE

# @@protoc_insertion_point(module_scope)
