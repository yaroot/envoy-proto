# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4/completion_service.proto
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
from google.cloud.talent.v4 import common_pb2 as google_dot_cloud_dot_talent_dot_v4_dot_common__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/talent/v4/completion_service.proto\x12\x16google.cloud.talent.v4\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/cloud/talent/v4/common.proto\"\x88\x04\n\x14\x43ompleteQueryRequest\x12\x32\n\x06tenant\x18\x01 \x01(\tB\"\xe0\x41\x02\xfa\x41\x1c\n\x1ajobs.googleapis.com/Tenant\x12\x12\n\x05query\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\x0elanguage_codes\x18\x03 \x03(\t\x12\x16\n\tpage_size\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x31\n\x07\x63ompany\x18\x05 \x01(\tB \xfa\x41\x1d\n\x1bjobs.googleapis.com/Company\x12K\n\x05scope\x18\x06 \x01(\x0e\x32<.google.cloud.talent.v4.CompleteQueryRequest.CompletionScope\x12I\n\x04type\x18\x07 \x01(\x0e\x32;.google.cloud.talent.v4.CompleteQueryRequest.CompletionType\"K\n\x0f\x43ompletionScope\x12 \n\x1c\x43OMPLETION_SCOPE_UNSPECIFIED\x10\x00\x12\n\n\x06TENANT\x10\x01\x12\n\n\x06PUBLIC\x10\x02\"`\n\x0e\x43ompletionType\x12\x1f\n\x1b\x43OMPLETION_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tJOB_TITLE\x10\x01\x12\x10\n\x0c\x43OMPANY_NAME\x10\x02\x12\x0c\n\x08\x43OMBINED\x10\x03\"\xb6\x02\n\x15\x43ompleteQueryResponse\x12Z\n\x12\x63ompletion_results\x18\x01 \x03(\x0b\x32>.google.cloud.talent.v4.CompleteQueryResponse.CompletionResult\x12:\n\x08metadata\x18\x02 \x01(\x0b\x32(.google.cloud.talent.v4.ResponseMetadata\x1a\x84\x01\n\x10\x43ompletionResult\x12\x12\n\nsuggestion\x18\x01 \x01(\t\x12I\n\x04type\x18\x02 \x01(\x0e\x32;.google.cloud.talent.v4.CompleteQueryRequest.CompletionType\x12\x11\n\timage_uri\x18\x03 \x01(\t2\xa2\x02\n\nCompletion\x12\xa5\x01\n\rCompleteQuery\x12,.google.cloud.talent.v4.CompleteQueryRequest\x1a-.google.cloud.talent.v4.CompleteQueryResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//v4/{tenant=projects/*/tenants/*}:completeQuery\x1al\xca\x41\x13jobs.googleapis.com\xd2\x41Shttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobsBz\n\x1a\x63om.google.cloud.talent.v4B\x16\x43ompletionServiceProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4.completion_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.talent.v4B\026CompletionServiceProtoP\001Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\242\002\003CTS'
  _COMPLETEQUERYREQUEST.fields_by_name['tenant']._options = None
  _COMPLETEQUERYREQUEST.fields_by_name['tenant']._serialized_options = b'\340A\002\372A\034\n\032jobs.googleapis.com/Tenant'
  _COMPLETEQUERYREQUEST.fields_by_name['query']._options = None
  _COMPLETEQUERYREQUEST.fields_by_name['query']._serialized_options = b'\340A\002'
  _COMPLETEQUERYREQUEST.fields_by_name['page_size']._options = None
  _COMPLETEQUERYREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\002'
  _COMPLETEQUERYREQUEST.fields_by_name['company']._options = None
  _COMPLETEQUERYREQUEST.fields_by_name['company']._serialized_options = b'\372A\035\n\033jobs.googleapis.com/Company'
  _COMPLETION._options = None
  _COMPLETION._serialized_options = b'\312A\023jobs.googleapis.com\322AShttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobs'
  _COMPLETION.methods_by_name['CompleteQuery']._options = None
  _COMPLETION.methods_by_name['CompleteQuery']._serialized_options = b'\202\323\344\223\0021\022//v4/{tenant=projects/*/tenants/*}:completeQuery'
  _COMPLETEQUERYREQUEST._serialized_start=228
  _COMPLETEQUERYREQUEST._serialized_end=748
  _COMPLETEQUERYREQUEST_COMPLETIONSCOPE._serialized_start=575
  _COMPLETEQUERYREQUEST_COMPLETIONSCOPE._serialized_end=650
  _COMPLETEQUERYREQUEST_COMPLETIONTYPE._serialized_start=652
  _COMPLETEQUERYREQUEST_COMPLETIONTYPE._serialized_end=748
  _COMPLETEQUERYRESPONSE._serialized_start=751
  _COMPLETEQUERYRESPONSE._serialized_end=1061
  _COMPLETEQUERYRESPONSE_COMPLETIONRESULT._serialized_start=929
  _COMPLETEQUERYRESPONSE_COMPLETIONRESULT._serialized_end=1061
  _COMPLETION._serialized_start=1064
  _COMPLETION._serialized_end=1354
# @@protoc_insertion_point(module_scope)
