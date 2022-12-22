# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/pubsublite/v1/publisher.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.pubsublite.v1 import common_pb2 as google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/pubsublite/v1/publisher.proto\x12\x1agoogle.cloud.pubsublite.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\'google/cloud/pubsublite/v1/common.proto\"9\n\x15InitialPublishRequest\x12\r\n\x05topic\x18\x01 \x01(\t\x12\x11\n\tpartition\x18\x02 \x01(\x03\"\x18\n\x16InitialPublishResponse\"T\n\x15MessagePublishRequest\x12;\n\x08messages\x18\x01 \x03(\x0b\x32).google.cloud.pubsublite.v1.PubSubMessage\"R\n\x16MessagePublishResponse\x12\x38\n\x0cstart_cursor\x18\x01 \x01(\x0b\x32\".google.cloud.pubsublite.v1.Cursor\"\xc4\x01\n\x0ePublishRequest\x12L\n\x0finitial_request\x18\x01 \x01(\x0b\x32\x31.google.cloud.pubsublite.v1.InitialPublishRequestH\x00\x12T\n\x17message_publish_request\x18\x02 \x01(\x0b\x32\x31.google.cloud.pubsublite.v1.MessagePublishRequestH\x00\x42\x0e\n\x0crequest_type\"\xc2\x01\n\x0fPublishResponse\x12N\n\x10initial_response\x18\x01 \x01(\x0b\x32\x32.google.cloud.pubsublite.v1.InitialPublishResponseH\x00\x12N\n\x10message_response\x18\x02 \x01(\x0b\x32\x32.google.cloud.pubsublite.v1.MessagePublishResponseH\x00\x42\x0f\n\rresponse_type2\xcb\x01\n\x10PublisherService\x12h\n\x07Publish\x12*.google.cloud.pubsublite.v1.PublishRequest\x1a+.google.cloud.pubsublite.v1.PublishResponse\"\x00(\x01\x30\x01\x1aM\xca\x41\x19pubsublite.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd8\x01\n!com.google.cloud.pubsublite.protoB\x0ePublisherProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/pubsublite/v1;pubsublite\xf8\x01\x01\xaa\x02\x1aGoogle.Cloud.PubSubLite.V1\xca\x02\x1aGoogle\\Cloud\\PubSubLite\\V1\xea\x02\x1dGoogle::Cloud::PubSubLite::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.pubsublite.v1.publisher_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.pubsublite.protoB\016PublisherProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/pubsublite/v1;pubsublite\370\001\001\252\002\032Google.Cloud.PubSubLite.V1\312\002\032Google\\Cloud\\PubSubLite\\V1\352\002\035Google::Cloud::PubSubLite::V1'
  _PUBLISHERSERVICE._options = None
  _PUBLISHERSERVICE._serialized_options = b'\312A\031pubsublite.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _INITIALPUBLISHREQUEST._serialized_start=170
  _INITIALPUBLISHREQUEST._serialized_end=227
  _INITIALPUBLISHRESPONSE._serialized_start=229
  _INITIALPUBLISHRESPONSE._serialized_end=253
  _MESSAGEPUBLISHREQUEST._serialized_start=255
  _MESSAGEPUBLISHREQUEST._serialized_end=339
  _MESSAGEPUBLISHRESPONSE._serialized_start=341
  _MESSAGEPUBLISHRESPONSE._serialized_end=423
  _PUBLISHREQUEST._serialized_start=426
  _PUBLISHREQUEST._serialized_end=622
  _PUBLISHRESPONSE._serialized_start=625
  _PUBLISHRESPONSE._serialized_end=819
  _PUBLISHERSERVICE._serialized_start=822
  _PUBLISHERSERVICE._serialized_end=1025
# @@protoc_insertion_point(module_scope)
