# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/core/v3/health_check.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.config.core.v3 import event_service_config_pb2 as envoy_dot_config_dot_core_dot_v3_dot_event__service__config__pb2
from envoy.type.matcher.v3 import string_pb2 as envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2
from envoy.type.v3 import http_pb2 as envoy_dot_type_dot_v3_dot_http__pb2
from envoy.type.v3 import range_pb2 as envoy_dot_type_dot_v3_dot_range__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'envoy/config/core/v3/health_check.proto\x12\x14\x65nvoy.config.core.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a/envoy/config/core/v3/event_service_config.proto\x1a\"envoy/type/matcher/v3/string.proto\x1a\x18\x65nvoy/type/v3/http.proto\x1a\x19\x65nvoy/type/v3/range.proto\x1a\x19google/protobuf/any.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"V\n\x0fHealthStatusSet\x12\x43\n\x08statuses\x18\x01 \x03(\x0e\x32\".envoy.config.core.v3.HealthStatusB\r\xfa\x42\n\x92\x01\x07\"\x05\x82\x01\x02\x10\x01\"\xd7\x18\n\x0bHealthCheck\x12\x36\n\x07timeout\x18\x01 \x01(\x0b\x32\x19.google.protobuf.DurationB\n\xfa\x42\x07\xaa\x01\x04\x08\x01*\x00\x12\x37\n\x08interval\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB\n\xfa\x42\x07\xaa\x01\x04\x08\x01*\x00\x12\x31\n\x0einitial_jitter\x18\x14 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0finterval_jitter\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x1f\n\x17interval_jitter_percent\x18\x12 \x01(\r\x12\x43\n\x13unhealthy_threshold\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x41\n\x11healthy_threshold\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12.\n\x08\x61lt_port\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x12\x34\n\x10reuse_connection\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12N\n\x11http_health_check\x18\x08 \x01(\x0b\x32\x31.envoy.config.core.v3.HealthCheck.HttpHealthCheckH\x00\x12L\n\x10tcp_health_check\x18\t \x01(\x0b\x32\x30.envoy.config.core.v3.HealthCheck.TcpHealthCheckH\x00\x12N\n\x11grpc_health_check\x18\x0b \x01(\x0b\x32\x31.envoy.config.core.v3.HealthCheck.GrpcHealthCheckH\x00\x12R\n\x13\x63ustom_health_check\x18\r \x01(\x0b\x32\x33.envoy.config.core.v3.HealthCheck.CustomHealthCheckH\x00\x12@\n\x13no_traffic_interval\x18\x0c \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12H\n\x1bno_traffic_healthy_interval\x18\x18 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12?\n\x12unhealthy_interval\x18\x0e \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12\x44\n\x17unhealthy_edge_interval\x18\x0f \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12\x42\n\x15healthy_edge_interval\x18\x10 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12\x16\n\x0e\x65vent_log_path\x18\x11 \x01(\t\x12?\n\revent_service\x18\x16 \x01(\x0b\x32(.envoy.config.core.v3.EventServiceConfig\x12(\n always_log_health_check_failures\x18\x13 \x01(\x08\x12\x41\n\x0btls_options\x18\x15 \x01(\x0b\x32,.envoy.config.core.v3.HealthCheck.TlsOptions\x12@\n\x1ftransport_socket_match_criteria\x18\x17 \x01(\x0b\x32\x17.google.protobuf.Struct\x1ar\n\x07Payload\x12\x17\n\x04text\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01H\x00\x12\x10\n\x06\x62inary\x18\x02 \x01(\x0cH\x00:,\x9a\xc5\x88\x1e\'\n%envoy.api.v2.core.HealthCheck.PayloadB\x0e\n\x07payload\x12\x03\xf8\x42\x01\x1a\x9e\x06\n\x0fHttpHealthCheck\x12\x19\n\x04host\x18\x01 \x01(\tB\x0b\xfa\x42\x08r\x06\xc0\x01\x02\xc8\x01\x00\x12\x1b\n\x04path\x18\x02 \x01(\tB\r\xfa\x42\nr\x08\x10\x01\xc0\x01\x02\xc8\x01\x00\x12\x37\n\x04send\x18\x03 \x01(\x0b\x32).envoy.config.core.v3.HealthCheck.Payload\x12:\n\x07receive\x18\x04 \x03(\x0b\x32).envoy.config.core.v3.HealthCheck.Payload\x12\x43\n\x14response_buffer_size\x18\x0e \x01(\x0b\x32\x1c.google.protobuf.UInt64ValueB\x07\xfa\x42\x04\x32\x02(\x00\x12R\n\x16request_headers_to_add\x18\x06 \x03(\x0b\x32\'.envoy.config.core.v3.HeaderValueOptionB\t\xfa\x42\x06\x92\x01\x03\x10\xe8\x07\x12\x33\n\x19request_headers_to_remove\x18\x08 \x03(\tB\x10\xfa\x42\r\x92\x01\n\"\x08r\x06\xc0\x01\x01\xc8\x01\x00\x12\x34\n\x11\x65xpected_statuses\x18\t \x03(\x0b\x32\x19.envoy.type.v3.Int64Range\x12\x35\n\x12retriable_statuses\x18\x0c \x03(\x0b\x32\x19.envoy.type.v3.Int64Range\x12\x43\n\x11\x63odec_client_type\x18\n \x01(\x0e\x32\x1e.envoy.type.v3.CodecClientTypeB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12\x42\n\x14service_name_matcher\x18\x0b \x01(\x0b\x32$.envoy.type.matcher.v3.StringMatcher\x12?\n\x06method\x18\r \x01(\x0e\x32#.envoy.config.core.v3.RequestMethodB\n\xfa\x42\x07\x82\x01\x04\x10\x01 \x06:4\x9a\xc5\x88\x1e/\n-envoy.api.v2.core.HealthCheck.HttpHealthCheckJ\x04\x08\x05\x10\x06J\x04\x08\x07\x10\x08R\x0cservice_nameR\tuse_http2\x1a\xba\x01\n\x0eTcpHealthCheck\x12\x37\n\x04send\x18\x01 \x01(\x0b\x32).envoy.config.core.v3.HealthCheck.Payload\x12:\n\x07receive\x18\x02 \x03(\x0b\x32).envoy.config.core.v3.HealthCheck.Payload:3\x9a\xc5\x88\x1e.\n,envoy.api.v2.core.HealthCheck.TcpHealthCheck\x1aV\n\x10RedisHealthCheck\x12\x0b\n\x03key\x18\x01 \x01(\t:5\x9a\xc5\x88\x1e\x30\n.envoy.api.v2.core.HealthCheck.RedisHealthCheck\x1a\xcb\x01\n\x0fGrpcHealthCheck\x12\x14\n\x0cservice_name\x18\x01 \x01(\t\x12\x1e\n\tauthority\x18\x02 \x01(\tB\x0b\xfa\x42\x08r\x06\xc0\x01\x02\xc8\x01\x00\x12L\n\x10initial_metadata\x18\x03 \x03(\x0b\x32\'.envoy.config.core.v3.HeaderValueOptionB\t\xfa\x42\x06\x92\x01\x03\x10\xe8\x07:4\x9a\xc5\x88\x1e/\n-envoy.api.v2.core.HealthCheck.GrpcHealthCheck\x1a\xad\x01\n\x11\x43ustomHealthCheck\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12,\n\x0ctyped_config\x18\x03 \x01(\x0b\x32\x14.google.protobuf.AnyH\x00:6\x9a\xc5\x88\x1e\x31\n/envoy.api.v2.core.HealthCheck.CustomHealthCheckB\r\n\x0b\x63onfig_typeJ\x04\x08\x02\x10\x03R\x06\x63onfig\x1aU\n\nTlsOptions\x12\x16\n\x0e\x61lpn_protocols\x18\x01 \x03(\t:/\x9a\xc5\x88\x1e*\n(envoy.api.v2.core.HealthCheck.TlsOptions:$\x9a\xc5\x88\x1e\x1f\n\x1d\x65nvoy.api.v2.core.HealthCheckB\x15\n\x0ehealth_checker\x12\x03\xf8\x42\x01J\x04\x08\n\x10\x0b*`\n\x0cHealthStatus\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x0b\n\x07HEALTHY\x10\x01\x12\r\n\tUNHEALTHY\x10\x02\x12\x0c\n\x08\x44RAINING\x10\x03\x12\x0b\n\x07TIMEOUT\x10\x04\x12\x0c\n\x08\x44\x45GRADED\x10\x05\x42\x84\x01\n\"io.envoyproxy.envoy.config.core.v3B\x10HealthCheckProtoP\x01ZBgithub.com/envoyproxy/go-control-plane/envoy/config/core/v3;corev3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.config.core.v3.health_check_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"io.envoyproxy.envoy.config.core.v3B\020HealthCheckProtoP\001ZBgithub.com/envoyproxy/go-control-plane/envoy/config/core/v3;corev3\272\200\310\321\006\002\020\002'
  _HEALTHSTATUSSET.fields_by_name['statuses']._options = None
  _HEALTHSTATUSSET.fields_by_name['statuses']._serialized_options = b'\372B\n\222\001\007\"\005\202\001\002\020\001'
  _HEALTHCHECK_PAYLOAD.oneofs_by_name['payload']._options = None
  _HEALTHCHECK_PAYLOAD.oneofs_by_name['payload']._serialized_options = b'\370B\001'
  _HEALTHCHECK_PAYLOAD.fields_by_name['text']._options = None
  _HEALTHCHECK_PAYLOAD.fields_by_name['text']._serialized_options = b'\372B\004r\002\020\001'
  _HEALTHCHECK_PAYLOAD._options = None
  _HEALTHCHECK_PAYLOAD._serialized_options = b'\232\305\210\036\'\n%envoy.api.v2.core.HealthCheck.Payload'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['host']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['host']._serialized_options = b'\372B\010r\006\300\001\002\310\001\000'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['path']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['path']._serialized_options = b'\372B\nr\010\020\001\300\001\002\310\001\000'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['response_buffer_size']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['response_buffer_size']._serialized_options = b'\372B\0042\002(\000'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['request_headers_to_add']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['request_headers_to_add']._serialized_options = b'\372B\006\222\001\003\020\350\007'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['request_headers_to_remove']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['request_headers_to_remove']._serialized_options = b'\372B\r\222\001\n\"\010r\006\300\001\001\310\001\000'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['codec_client_type']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['codec_client_type']._serialized_options = b'\372B\005\202\001\002\020\001'
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['method']._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK.fields_by_name['method']._serialized_options = b'\372B\007\202\001\004\020\001 \006'
  _HEALTHCHECK_HTTPHEALTHCHECK._options = None
  _HEALTHCHECK_HTTPHEALTHCHECK._serialized_options = b'\232\305\210\036/\n-envoy.api.v2.core.HealthCheck.HttpHealthCheck'
  _HEALTHCHECK_TCPHEALTHCHECK._options = None
  _HEALTHCHECK_TCPHEALTHCHECK._serialized_options = b'\232\305\210\036.\n,envoy.api.v2.core.HealthCheck.TcpHealthCheck'
  _HEALTHCHECK_REDISHEALTHCHECK._options = None
  _HEALTHCHECK_REDISHEALTHCHECK._serialized_options = b'\232\305\210\0360\n.envoy.api.v2.core.HealthCheck.RedisHealthCheck'
  _HEALTHCHECK_GRPCHEALTHCHECK.fields_by_name['authority']._options = None
  _HEALTHCHECK_GRPCHEALTHCHECK.fields_by_name['authority']._serialized_options = b'\372B\010r\006\300\001\002\310\001\000'
  _HEALTHCHECK_GRPCHEALTHCHECK.fields_by_name['initial_metadata']._options = None
  _HEALTHCHECK_GRPCHEALTHCHECK.fields_by_name['initial_metadata']._serialized_options = b'\372B\006\222\001\003\020\350\007'
  _HEALTHCHECK_GRPCHEALTHCHECK._options = None
  _HEALTHCHECK_GRPCHEALTHCHECK._serialized_options = b'\232\305\210\036/\n-envoy.api.v2.core.HealthCheck.GrpcHealthCheck'
  _HEALTHCHECK_CUSTOMHEALTHCHECK.fields_by_name['name']._options = None
  _HEALTHCHECK_CUSTOMHEALTHCHECK.fields_by_name['name']._serialized_options = b'\372B\004r\002\020\001'
  _HEALTHCHECK_CUSTOMHEALTHCHECK._options = None
  _HEALTHCHECK_CUSTOMHEALTHCHECK._serialized_options = b'\232\305\210\0361\n/envoy.api.v2.core.HealthCheck.CustomHealthCheck'
  _HEALTHCHECK_TLSOPTIONS._options = None
  _HEALTHCHECK_TLSOPTIONS._serialized_options = b'\232\305\210\036*\n(envoy.api.v2.core.HealthCheck.TlsOptions'
  _HEALTHCHECK.oneofs_by_name['health_checker']._options = None
  _HEALTHCHECK.oneofs_by_name['health_checker']._serialized_options = b'\370B\001'
  _HEALTHCHECK.fields_by_name['timeout']._options = None
  _HEALTHCHECK.fields_by_name['timeout']._serialized_options = b'\372B\007\252\001\004\010\001*\000'
  _HEALTHCHECK.fields_by_name['interval']._options = None
  _HEALTHCHECK.fields_by_name['interval']._serialized_options = b'\372B\007\252\001\004\010\001*\000'
  _HEALTHCHECK.fields_by_name['unhealthy_threshold']._options = None
  _HEALTHCHECK.fields_by_name['unhealthy_threshold']._serialized_options = b'\372B\005\212\001\002\020\001'
  _HEALTHCHECK.fields_by_name['healthy_threshold']._options = None
  _HEALTHCHECK.fields_by_name['healthy_threshold']._serialized_options = b'\372B\005\212\001\002\020\001'
  _HEALTHCHECK.fields_by_name['no_traffic_interval']._options = None
  _HEALTHCHECK.fields_by_name['no_traffic_interval']._serialized_options = b'\372B\005\252\001\002*\000'
  _HEALTHCHECK.fields_by_name['no_traffic_healthy_interval']._options = None
  _HEALTHCHECK.fields_by_name['no_traffic_healthy_interval']._serialized_options = b'\372B\005\252\001\002*\000'
  _HEALTHCHECK.fields_by_name['unhealthy_interval']._options = None
  _HEALTHCHECK.fields_by_name['unhealthy_interval']._serialized_options = b'\372B\005\252\001\002*\000'
  _HEALTHCHECK.fields_by_name['unhealthy_edge_interval']._options = None
  _HEALTHCHECK.fields_by_name['unhealthy_edge_interval']._serialized_options = b'\372B\005\252\001\002*\000'
  _HEALTHCHECK.fields_by_name['healthy_edge_interval']._options = None
  _HEALTHCHECK.fields_by_name['healthy_edge_interval']._serialized_options = b'\372B\005\252\001\002*\000'
  _HEALTHCHECK._options = None
  _HEALTHCHECK._serialized_options = b'\232\305\210\036\037\n\035envoy.api.v2.core.HealthCheck'
  _HEALTHSTATUS._serialized_start=3698
  _HEALTHSTATUS._serialized_end=3794
  _HEALTHSTATUSSET._serialized_start=448
  _HEALTHSTATUSSET._serialized_end=534
  _HEALTHCHECK._serialized_start=537
  _HEALTHCHECK._serialized_end=3696
  _HEALTHCHECK_PAYLOAD._serialized_start=1968
  _HEALTHCHECK_PAYLOAD._serialized_end=2082
  _HEALTHCHECK_HTTPHEALTHCHECK._serialized_start=2085
  _HEALTHCHECK_HTTPHEALTHCHECK._serialized_end=2883
  _HEALTHCHECK_TCPHEALTHCHECK._serialized_start=2886
  _HEALTHCHECK_TCPHEALTHCHECK._serialized_end=3072
  _HEALTHCHECK_REDISHEALTHCHECK._serialized_start=3074
  _HEALTHCHECK_REDISHEALTHCHECK._serialized_end=3160
  _HEALTHCHECK_GRPCHEALTHCHECK._serialized_start=3163
  _HEALTHCHECK_GRPCHEALTHCHECK._serialized_end=3366
  _HEALTHCHECK_CUSTOMHEALTHCHECK._serialized_start=3369
  _HEALTHCHECK_CUSTOMHEALTHCHECK._serialized_end=3542
  _HEALTHCHECK_TLSOPTIONS._serialized_start=3544
  _HEALTHCHECK_TLSOPTIONS._serialized_end=3629
# @@protoc_insertion_point(module_scope)
