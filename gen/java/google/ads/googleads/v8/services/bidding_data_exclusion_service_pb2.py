# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/bidding_data_exclusion_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v8.resources import bidding_data_exclusion_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_bidding__data__exclusion__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/bidding_data_exclusion_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB BiddingDataExclusionServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v8/services/bidding_data_exclusion_service.proto\x12 google.ads.googleads.v8.services\x1a\x39google/ads/googleads/v8/enums/response_content_type.proto\x1a>google/ads/googleads/v8/resources/bidding_data_exclusion.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"n\n\x1eGetBiddingDataExclusionRequest\x12L\n\rresource_name\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\n-googleads.googleapis.com/BiddingDataExclusion\"\xb3\x02\n\"MutateBiddingDataExclusionsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\noperations\x18\x02 \x03(\x0b\x32?.google.ads.googleads.v8.services.BiddingDataExclusionOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12i\n\x15response_content_type\x18\x05 \x01(\x0e\x32J.google.ads.googleads.v8.enums.ResponseContentTypeEnum.ResponseContentType\"\x85\x02\n\x1d\x42iddingDataExclusionOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12I\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x37.google.ads.googleads.v8.resources.BiddingDataExclusionH\x00\x12I\n\x06update\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v8.resources.BiddingDataExclusionH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\xae\x01\n#MutateBiddingDataExclusionsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12T\n\x07results\x18\x02 \x03(\x0b\x32\x43.google.ads.googleads.v8.services.MutateBiddingDataExclusionsResult\"\x93\x01\n!MutateBiddingDataExclusionsResult\x12\x15\n\rresource_name\x18\x01 \x01(\t\x12W\n\x16\x62idding_data_exclusion\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v8.resources.BiddingDataExclusion2\xd9\x04\n\x1b\x42iddingDataExclusionService\x12\xe5\x01\n\x17GetBiddingDataExclusion\x12@.google.ads.googleads.v8.services.GetBiddingDataExclusionRequest\x1a\x37.google.ads.googleads.v8.resources.BiddingDataExclusion\"O\x82\xd3\xe4\x93\x02\x39\x12\x37/v8/{resource_name=customers/*/biddingDataExclusions/*}\xda\x41\rresource_name\x12\x8a\x02\n\x1bMutateBiddingDataExclusions\x12\x44.google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest\x1a\x45.google.ads.googleads.v8.services.MutateBiddingDataExclusionsResponse\"^\x82\xd3\xe4\x93\x02?\":/v8/customers/{customer_id=*}/biddingDataExclusions:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x87\x02\n$com.google.ads.googleads.v8.servicesB BiddingDataExclusionServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_bidding__data__exclusion__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETBIDDINGDATAEXCLUSIONREQUEST = _descriptor.Descriptor(
  name='GetBiddingDataExclusionRequest',
  full_name='google.ads.googleads.v8.services.GetBiddingDataExclusionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetBiddingDataExclusionRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A/\n-googleads.googleapis.com/BiddingDataExclusion', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=404,
  serialized_end=514,
)


_MUTATEBIDDINGDATAEXCLUSIONSREQUEST = _descriptor.Descriptor(
  name='MutateBiddingDataExclusionsRequest',
  full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_content_type', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest.response_content_type', index=4,
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
  serialized_start=517,
  serialized_end=824,
)


_BIDDINGDATAEXCLUSIONOPERATION = _descriptor.Descriptor(
  name='BiddingDataExclusionOperation',
  full_name='google.ads.googleads.v8.services.BiddingDataExclusionOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v8.services.BiddingDataExclusionOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v8.services.BiddingDataExclusionOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v8.services.BiddingDataExclusionOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v8.services.BiddingDataExclusionOperation.remove', index=3,
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
      name='operation', full_name='google.ads.googleads.v8.services.BiddingDataExclusionOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=827,
  serialized_end=1088,
)


_MUTATEBIDDINGDATAEXCLUSIONSRESPONSE = _descriptor.Descriptor(
  name='MutateBiddingDataExclusionsResponse',
  full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsResponse.results', index=1,
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
  serialized_start=1091,
  serialized_end=1265,
)


_MUTATEBIDDINGDATAEXCLUSIONSRESULT = _descriptor.Descriptor(
  name='MutateBiddingDataExclusionsResult',
  full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsResult.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bidding_data_exclusion', full_name='google.ads.googleads.v8.services.MutateBiddingDataExclusionsResult.bidding_data_exclusion', index=1,
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
  serialized_start=1268,
  serialized_end=1415,
)

_MUTATEBIDDINGDATAEXCLUSIONSREQUEST.fields_by_name['operations'].message_type = _BIDDINGDATAEXCLUSIONOPERATION
_MUTATEBIDDINGDATAEXCLUSIONSREQUEST.fields_by_name['response_content_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_response__content__type__pb2._RESPONSECONTENTTYPEENUM_RESPONSECONTENTTYPE
_BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_bidding__data__exclusion__pb2._BIDDINGDATAEXCLUSION
_BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_bidding__data__exclusion__pb2._BIDDINGDATAEXCLUSION
_BIDDINGDATAEXCLUSIONOPERATION.oneofs_by_name['operation'].fields.append(
  _BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['create'])
_BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['create'].containing_oneof = _BIDDINGDATAEXCLUSIONOPERATION.oneofs_by_name['operation']
_BIDDINGDATAEXCLUSIONOPERATION.oneofs_by_name['operation'].fields.append(
  _BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['update'])
_BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['update'].containing_oneof = _BIDDINGDATAEXCLUSIONOPERATION.oneofs_by_name['operation']
_BIDDINGDATAEXCLUSIONOPERATION.oneofs_by_name['operation'].fields.append(
  _BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['remove'])
_BIDDINGDATAEXCLUSIONOPERATION.fields_by_name['remove'].containing_oneof = _BIDDINGDATAEXCLUSIONOPERATION.oneofs_by_name['operation']
_MUTATEBIDDINGDATAEXCLUSIONSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATEBIDDINGDATAEXCLUSIONSRESPONSE.fields_by_name['results'].message_type = _MUTATEBIDDINGDATAEXCLUSIONSRESULT
_MUTATEBIDDINGDATAEXCLUSIONSRESULT.fields_by_name['bidding_data_exclusion'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_bidding__data__exclusion__pb2._BIDDINGDATAEXCLUSION
DESCRIPTOR.message_types_by_name['GetBiddingDataExclusionRequest'] = _GETBIDDINGDATAEXCLUSIONREQUEST
DESCRIPTOR.message_types_by_name['MutateBiddingDataExclusionsRequest'] = _MUTATEBIDDINGDATAEXCLUSIONSREQUEST
DESCRIPTOR.message_types_by_name['BiddingDataExclusionOperation'] = _BIDDINGDATAEXCLUSIONOPERATION
DESCRIPTOR.message_types_by_name['MutateBiddingDataExclusionsResponse'] = _MUTATEBIDDINGDATAEXCLUSIONSRESPONSE
DESCRIPTOR.message_types_by_name['MutateBiddingDataExclusionsResult'] = _MUTATEBIDDINGDATAEXCLUSIONSRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetBiddingDataExclusionRequest = _reflection.GeneratedProtocolMessageType('GetBiddingDataExclusionRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETBIDDINGDATAEXCLUSIONREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.bidding_data_exclusion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetBiddingDataExclusionRequest)
  })
_sym_db.RegisterMessage(GetBiddingDataExclusionRequest)

MutateBiddingDataExclusionsRequest = _reflection.GeneratedProtocolMessageType('MutateBiddingDataExclusionsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBIDDINGDATAEXCLUSIONSREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.bidding_data_exclusion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateBiddingDataExclusionsRequest)
  })
_sym_db.RegisterMessage(MutateBiddingDataExclusionsRequest)

BiddingDataExclusionOperation = _reflection.GeneratedProtocolMessageType('BiddingDataExclusionOperation', (_message.Message,), {
  'DESCRIPTOR' : _BIDDINGDATAEXCLUSIONOPERATION,
  '__module__' : 'google.ads.googleads.v8.services.bidding_data_exclusion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.BiddingDataExclusionOperation)
  })
_sym_db.RegisterMessage(BiddingDataExclusionOperation)

MutateBiddingDataExclusionsResponse = _reflection.GeneratedProtocolMessageType('MutateBiddingDataExclusionsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBIDDINGDATAEXCLUSIONSRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.bidding_data_exclusion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateBiddingDataExclusionsResponse)
  })
_sym_db.RegisterMessage(MutateBiddingDataExclusionsResponse)

MutateBiddingDataExclusionsResult = _reflection.GeneratedProtocolMessageType('MutateBiddingDataExclusionsResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATEBIDDINGDATAEXCLUSIONSRESULT,
  '__module__' : 'google.ads.googleads.v8.services.bidding_data_exclusion_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.MutateBiddingDataExclusionsResult)
  })
_sym_db.RegisterMessage(MutateBiddingDataExclusionsResult)


DESCRIPTOR._options = None
_GETBIDDINGDATAEXCLUSIONREQUEST.fields_by_name['resource_name']._options = None
_MUTATEBIDDINGDATAEXCLUSIONSREQUEST.fields_by_name['customer_id']._options = None
_MUTATEBIDDINGDATAEXCLUSIONSREQUEST.fields_by_name['operations']._options = None

_BIDDINGDATAEXCLUSIONSERVICE = _descriptor.ServiceDescriptor(
  name='BiddingDataExclusionService',
  full_name='google.ads.googleads.v8.services.BiddingDataExclusionService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=1418,
  serialized_end=2019,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetBiddingDataExclusion',
    full_name='google.ads.googleads.v8.services.BiddingDataExclusionService.GetBiddingDataExclusion',
    index=0,
    containing_service=None,
    input_type=_GETBIDDINGDATAEXCLUSIONREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_bidding__data__exclusion__pb2._BIDDINGDATAEXCLUSION,
    serialized_options=b'\202\323\344\223\0029\0227/v8/{resource_name=customers/*/biddingDataExclusions/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateBiddingDataExclusions',
    full_name='google.ads.googleads.v8.services.BiddingDataExclusionService.MutateBiddingDataExclusions',
    index=1,
    containing_service=None,
    input_type=_MUTATEBIDDINGDATAEXCLUSIONSREQUEST,
    output_type=_MUTATEBIDDINGDATAEXCLUSIONSRESPONSE,
    serialized_options=b'\202\323\344\223\002?\":/v8/customers/{customer_id=*}/biddingDataExclusions:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_BIDDINGDATAEXCLUSIONSERVICE)

DESCRIPTOR.services_by_name['BiddingDataExclusionService'] = _BIDDINGDATAEXCLUSIONSERVICE

# @@protoc_insertion_point(module_scope)