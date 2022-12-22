# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/eventarc/publishing/v1/publisher.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/eventarc/publishing/v1/publisher.proto\x12#google.cloud.eventarc.publishing.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x19google/protobuf/any.proto\"~\n%PublishChannelConnectionEventsRequest\x12\x1a\n\x12\x63hannel_connection\x18\x01 \x01(\t\x12$\n\x06\x65vents\x18\x02 \x03(\x0b\x32\x14.google.protobuf.Any\x12\x13\n\x0btext_events\x18\x03 \x03(\t\"(\n&PublishChannelConnectionEventsResponse\"b\n\x14PublishEventsRequest\x12\x0f\n\x07\x63hannel\x18\x01 \x01(\t\x12$\n\x06\x65vents\x18\x02 \x03(\x0b\x32\x14.google.protobuf.Any\x12\x13\n\x0btext_events\x18\x03 \x03(\t\"\x17\n\x15PublishEventsResponse2\xd0\x04\n\tPublisher\x12\x98\x02\n\x1ePublishChannelConnectionEvents\x12J.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest\x1aK.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse\"]\x82\xd3\xe4\x93\x02W\"R/v1/{channel_connection=projects/*/locations/*/channelConnections/*}:publishEvents:\x01*\x12\xd0\x01\n\rPublishEvents\x12\x39.google.cloud.eventarc.publishing.v1.PublishEventsRequest\x1a:.google.cloud.eventarc.publishing.v1.PublishEventsResponse\"H\x82\xd3\xe4\x93\x02\x42\"=/v1/{channel=projects/*/locations/*/channels/*}:publishEvents:\x01*\x1aU\xca\x41!eventarcpublishing.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xff\x01\n\'com.google.cloud.eventarc.publishing.v1B\x0ePublisherProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/eventarc/publishing/v1;publisher\xaa\x02#Google.Cloud.Eventarc.Publishing.V1\xca\x02#Google\\Cloud\\Eventarc\\Publishing\\V1\xea\x02\'Google::Cloud::Eventarc::Publishing::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.eventarc.publishing.v1.publisher_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.google.cloud.eventarc.publishing.v1B\016PublisherProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/eventarc/publishing/v1;publisher\252\002#Google.Cloud.Eventarc.Publishing.V1\312\002#Google\\Cloud\\Eventarc\\Publishing\\V1\352\002\'Google::Cloud::Eventarc::Publishing::V1'
  _PUBLISHER._options = None
  _PUBLISHER._serialized_options = b'\312A!eventarcpublishing.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _PUBLISHER.methods_by_name['PublishChannelConnectionEvents']._options = None
  _PUBLISHER.methods_by_name['PublishChannelConnectionEvents']._serialized_options = b'\202\323\344\223\002W\"R/v1/{channel_connection=projects/*/locations/*/channelConnections/*}:publishEvents:\001*'
  _PUBLISHER.methods_by_name['PublishEvents']._options = None
  _PUBLISHER.methods_by_name['PublishEvents']._serialized_options = b'\202\323\344\223\002B\"=/v1/{channel=projects/*/locations/*/channels/*}:publishEvents:\001*'
  _PUBLISHCHANNELCONNECTIONEVENTSREQUEST._serialized_start=174
  _PUBLISHCHANNELCONNECTIONEVENTSREQUEST._serialized_end=300
  _PUBLISHCHANNELCONNECTIONEVENTSRESPONSE._serialized_start=302
  _PUBLISHCHANNELCONNECTIONEVENTSRESPONSE._serialized_end=342
  _PUBLISHEVENTSREQUEST._serialized_start=344
  _PUBLISHEVENTSREQUEST._serialized_end=442
  _PUBLISHEVENTSRESPONSE._serialized_start=444
  _PUBLISHEVENTSRESPONSE._serialized_end=467
  _PUBLISHER._serialized_start=470
  _PUBLISHER._serialized_end=1062
# @@protoc_insertion_point(module_scope)
