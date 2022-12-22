# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2/user_event_service.proto
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
from google.api import httpbody_pb2 as google_dot_api_dot_httpbody__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.retail.v2 import import_config_pb2 as google_dot_cloud_dot_retail_dot_v2_dot_import__config__pb2
from google.cloud.retail.v2 import purge_config_pb2 as google_dot_cloud_dot_retail_dot_v2_dot_purge__config__pb2
from google.cloud.retail.v2 import user_event_pb2 as google_dot_cloud_dot_retail_dot_v2_dot_user__event__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/retail/v2/user_event_service.proto\x12\x16google.cloud.retail.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/httpbody.proto\x1a\x19google/api/resource.proto\x1a*google/cloud/retail/v2/import_config.proto\x1a)google/cloud/retail/v2/purge_config.proto\x1a\'google/cloud/retail/v2/user_event.proto\x1a#google/longrunning/operations.proto\"}\n\x15WriteUserEventRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12:\n\nuser_event\x18\x02 \x01(\x0b\x32!.google.cloud.retail.v2.UserEventB\x03\xe0\x41\x02\x12\x13\n\x0bwrite_async\x18\x03 \x01(\x08\"\x9f\x01\n\x17\x43ollectUserEventRequest\x12\x17\n\rprebuilt_rule\x18\x06 \x01(\tH\x00\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\nuser_event\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x0b\n\x03uri\x18\x03 \x01(\t\x12\x0b\n\x03\x65ts\x18\x04 \x01(\x03\x12\x10\n\x08raw_json\x18\x05 \x01(\tB\x11\n\x0f\x63onversion_rule\"\xfe\x01\n\x17RejoinUserEventsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x65\n\x17user_event_rejoin_scope\x18\x02 \x01(\x0e\x32\x44.google.cloud.retail.v2.RejoinUserEventsRequest.UserEventRejoinScope\"g\n\x14UserEventRejoinScope\x12\'\n#USER_EVENT_REJOIN_SCOPE_UNSPECIFIED\x10\x00\x12\x11\n\rJOINED_EVENTS\x10\x01\x12\x13\n\x0fUNJOINED_EVENTS\x10\x02\">\n\x18RejoinUserEventsResponse\x12\"\n\x1arejoined_user_events_count\x18\x01 \x01(\x03\"\x1a\n\x18RejoinUserEventsMetadata2\xbf\t\n\x10UserEventService\x12\xb7\x01\n\x0eWriteUserEvent\x12-.google.cloud.retail.v2.WriteUserEventRequest\x1a!.google.cloud.retail.v2.UserEvent\"S\x82\xd3\xe4\x93\x02M\"?/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:write:\nuser_event\x12\xa4\x01\n\x10\x43ollectUserEvent\x12/.google.cloud.retail.v2.CollectUserEventRequest\x1a\x14.google.api.HttpBody\"I\x82\xd3\xe4\x93\x02\x43\x12\x41/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:collect\x12\x86\x02\n\x0fPurgeUserEvents\x12..google.cloud.retail.v2.PurgeUserEventsRequest\x1a\x1d.google.longrunning.Operation\"\xa3\x01\x82\xd3\xe4\x93\x02\x44\"?/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:purge:\x01*\xca\x41V\n.google.cloud.retail.v2.PurgeUserEventsResponse\x12$google.cloud.retail.v2.PurgeMetadata\x12\x8b\x02\n\x10ImportUserEvents\x12/.google.cloud.retail.v2.ImportUserEventsRequest\x1a\x1d.google.longrunning.Operation\"\xa6\x01\x82\xd3\xe4\x93\x02\x45\"@/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:import:\x01*\xca\x41X\n/google.cloud.retail.v2.ImportUserEventsResponse\x12%google.cloud.retail.v2.ImportMetadata\x12\xe7\x01\n\x10RejoinUserEvents\x12/.google.cloud.retail.v2.RejoinUserEventsRequest\x1a\x1d.google.longrunning.Operation\"\x82\x01\x82\xd3\xe4\x93\x02\x45\"@/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:rejoin:\x01*\xca\x41\x34\n\x18RejoinUserEventsResponse\x12\x18RejoinUserEventsMetadata\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xca\x01\n\x1a\x63om.google.cloud.retail.v2B\x15UserEventServiceProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\xa2\x02\x06RETAIL\xaa\x02\x16Google.Cloud.Retail.V2\xca\x02\x16Google\\Cloud\\Retail\\V2\xea\x02\x19Google::Cloud::Retail::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2.user_event_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.retail.v2B\025UserEventServiceProtoP\001Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail::V2'
  _WRITEUSEREVENTREQUEST.fields_by_name['parent']._options = None
  _WRITEUSEREVENTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _WRITEUSEREVENTREQUEST.fields_by_name['user_event']._options = None
  _WRITEUSEREVENTREQUEST.fields_by_name['user_event']._serialized_options = b'\340A\002'
  _COLLECTUSEREVENTREQUEST.fields_by_name['parent']._options = None
  _COLLECTUSEREVENTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _COLLECTUSEREVENTREQUEST.fields_by_name['user_event']._options = None
  _COLLECTUSEREVENTREQUEST.fields_by_name['user_event']._serialized_options = b'\340A\002'
  _REJOINUSEREVENTSREQUEST.fields_by_name['parent']._options = None
  _REJOINUSEREVENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _USEREVENTSERVICE._options = None
  _USEREVENTSERVICE._serialized_options = b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _USEREVENTSERVICE.methods_by_name['WriteUserEvent']._options = None
  _USEREVENTSERVICE.methods_by_name['WriteUserEvent']._serialized_options = b'\202\323\344\223\002M\"?/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:write:\nuser_event'
  _USEREVENTSERVICE.methods_by_name['CollectUserEvent']._options = None
  _USEREVENTSERVICE.methods_by_name['CollectUserEvent']._serialized_options = b'\202\323\344\223\002C\022A/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:collect'
  _USEREVENTSERVICE.methods_by_name['PurgeUserEvents']._options = None
  _USEREVENTSERVICE.methods_by_name['PurgeUserEvents']._serialized_options = b'\202\323\344\223\002D\"?/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:purge:\001*\312AV\n.google.cloud.retail.v2.PurgeUserEventsResponse\022$google.cloud.retail.v2.PurgeMetadata'
  _USEREVENTSERVICE.methods_by_name['ImportUserEvents']._options = None
  _USEREVENTSERVICE.methods_by_name['ImportUserEvents']._serialized_options = b'\202\323\344\223\002E\"@/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:import:\001*\312AX\n/google.cloud.retail.v2.ImportUserEventsResponse\022%google.cloud.retail.v2.ImportMetadata'
  _USEREVENTSERVICE.methods_by_name['RejoinUserEvents']._options = None
  _USEREVENTSERVICE.methods_by_name['RejoinUserEvents']._serialized_options = b'\202\323\344\223\002E\"@/v2/{parent=projects/*/locations/*/catalogs/*}/userEvents:rejoin:\001*\312A4\n\030RejoinUserEventsResponse\022\030RejoinUserEventsMetadata'
  _WRITEUSEREVENTREQUEST._serialized_start=382
  _WRITEUSEREVENTREQUEST._serialized_end=507
  _COLLECTUSEREVENTREQUEST._serialized_start=510
  _COLLECTUSEREVENTREQUEST._serialized_end=669
  _REJOINUSEREVENTSREQUEST._serialized_start=672
  _REJOINUSEREVENTSREQUEST._serialized_end=926
  _REJOINUSEREVENTSREQUEST_USEREVENTREJOINSCOPE._serialized_start=823
  _REJOINUSEREVENTSREQUEST_USEREVENTREJOINSCOPE._serialized_end=926
  _REJOINUSEREVENTSRESPONSE._serialized_start=928
  _REJOINUSEREVENTSRESPONSE._serialized_end=990
  _REJOINUSEREVENTSMETADATA._serialized_start=992
  _REJOINUSEREVENTSMETADATA._serialized_end=1018
  _USEREVENTSERVICE._serialized_start=1021
  _USEREVENTSERVICE._serialized_end=2236
# @@protoc_insertion_point(module_scope)