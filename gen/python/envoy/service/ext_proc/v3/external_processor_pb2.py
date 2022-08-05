# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/ext_proc/v3/external_processor.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.extensions.filters.http.ext_proc.v3 import processing_mode_pb2 as envoy_dot_extensions_dot_filters_dot_http_dot_ext__proc_dot_v3_dot_processing__mode__pb2
from envoy.type.v3 import http_status_pb2 as envoy_dot_type_dot_v3_dot_http__status__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from xds.annotations.v3 import status_pb2 as xds_dot_annotations_dot_v3_dot_status__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2envoy/service/ext_proc/v3/external_processor.proto\x12\x19\x65nvoy.service.ext_proc.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a?envoy/extensions/filters/http/ext_proc/v3/processing_mode.proto\x1a\x1f\x65nvoy/type/v3/http_status.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fxds/annotations/v3/status.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xc4\x03\n\x11ProcessingRequest\x12\x12\n\nasync_mode\x18\x01 \x01(\x08\x12\x41\n\x0frequest_headers\x18\x02 \x01(\x0b\x32&.envoy.service.ext_proc.v3.HttpHeadersH\x00\x12\x42\n\x10response_headers\x18\x03 \x01(\x0b\x32&.envoy.service.ext_proc.v3.HttpHeadersH\x00\x12;\n\x0crequest_body\x18\x04 \x01(\x0b\x32#.envoy.service.ext_proc.v3.HttpBodyH\x00\x12<\n\rresponse_body\x18\x05 \x01(\x0b\x32#.envoy.service.ext_proc.v3.HttpBodyH\x00\x12\x43\n\x10request_trailers\x18\x06 \x01(\x0b\x32\'.envoy.service.ext_proc.v3.HttpTrailersH\x00\x12\x44\n\x11response_trailers\x18\x07 \x01(\x0b\x32\'.envoy.service.ext_proc.v3.HttpTrailersH\x00\x42\x0e\n\x07request\x12\x03\xf8\x42\x01\"\x9b\x05\n\x12ProcessingResponse\x12\x45\n\x0frequest_headers\x18\x01 \x01(\x0b\x32*.envoy.service.ext_proc.v3.HeadersResponseH\x00\x12\x46\n\x10response_headers\x18\x02 \x01(\x0b\x32*.envoy.service.ext_proc.v3.HeadersResponseH\x00\x12?\n\x0crequest_body\x18\x03 \x01(\x0b\x32\'.envoy.service.ext_proc.v3.BodyResponseH\x00\x12@\n\rresponse_body\x18\x04 \x01(\x0b\x32\'.envoy.service.ext_proc.v3.BodyResponseH\x00\x12G\n\x10request_trailers\x18\x05 \x01(\x0b\x32+.envoy.service.ext_proc.v3.TrailersResponseH\x00\x12H\n\x11response_trailers\x18\x06 \x01(\x0b\x32+.envoy.service.ext_proc.v3.TrailersResponseH\x00\x12J\n\x12immediate_response\x18\x07 \x01(\x0b\x32,.envoy.service.ext_proc.v3.ImmediateResponseH\x00\x12\x31\n\x10\x64ynamic_metadata\x18\x08 \x01(\x0b\x32\x17.google.protobuf.Struct\x12P\n\rmode_override\x18\t \x01(\x0b\x32\x39.envoy.extensions.filters.http.ext_proc.v3.ProcessingModeB\x0f\n\x08response\x12\x03\xf8\x42\x01\"\xee\x01\n\x0bHttpHeaders\x12\x30\n\x07headers\x18\x01 \x01(\x0b\x32\x1f.envoy.config.core.v3.HeaderMap\x12J\n\nattributes\x18\x02 \x03(\x0b\x32\x36.envoy.service.ext_proc.v3.HttpHeaders.AttributesEntry\x12\x15\n\rend_of_stream\x18\x03 \x01(\x08\x1aJ\n\x0f\x41ttributesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12&\n\x05value\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct:\x02\x38\x01\"/\n\x08HttpBody\x12\x0c\n\x04\x62ody\x18\x01 \x01(\x0c\x12\x15\n\rend_of_stream\x18\x02 \x01(\x08\"A\n\x0cHttpTrailers\x12\x31\n\x08trailers\x18\x01 \x01(\x0b\x32\x1f.envoy.config.core.v3.HeaderMap\"N\n\x0fHeadersResponse\x12;\n\x08response\x18\x01 \x01(\x0b\x32).envoy.service.ext_proc.v3.CommonResponse\"V\n\x10TrailersResponse\x12\x42\n\x0fheader_mutation\x18\x01 \x01(\x0b\x32).envoy.service.ext_proc.v3.HeaderMutation\"K\n\x0c\x42odyResponse\x12;\n\x08response\x18\x01 \x01(\x0b\x32).envoy.service.ext_proc.v3.CommonResponse\"\xf0\x02\n\x0e\x43ommonResponse\x12R\n\x06status\x18\x01 \x01(\x0e\x32\x38.envoy.service.ext_proc.v3.CommonResponse.ResponseStatusB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12\x42\n\x0fheader_mutation\x18\x02 \x01(\x0b\x32).envoy.service.ext_proc.v3.HeaderMutation\x12>\n\rbody_mutation\x18\x03 \x01(\x0b\x32\'.envoy.service.ext_proc.v3.BodyMutation\x12\x31\n\x08trailers\x18\x04 \x01(\x0b\x32\x1f.envoy.config.core.v3.HeaderMap\x12\x19\n\x11\x63lear_route_cache\x18\x05 \x01(\x08\"8\n\x0eResponseStatus\x12\x0c\n\x08\x43ONTINUE\x10\x00\x12\x18\n\x14\x43ONTINUE_AND_REPLACE\x10\x01\"\xdf\x01\n\x11ImmediateResponse\x12\x33\n\x06status\x18\x01 \x01(\x0b\x32\x19.envoy.type.v3.HttpStatusB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12:\n\x07headers\x18\x02 \x01(\x0b\x32).envoy.service.ext_proc.v3.HeaderMutation\x12\x0c\n\x04\x62ody\x18\x03 \x01(\t\x12:\n\x0bgrpc_status\x18\x04 \x01(\x0b\x32%.envoy.service.ext_proc.v3.GrpcStatus\x12\x0f\n\x07\x64\x65tails\x18\x05 \x01(\t\"\x1c\n\nGrpcStatus\x12\x0e\n\x06status\x18\x01 \x01(\r\"f\n\x0eHeaderMutation\x12<\n\x0bset_headers\x18\x01 \x03(\x0b\x32\'.envoy.config.core.v3.HeaderValueOption\x12\x16\n\x0eremove_headers\x18\x02 \x03(\t\"@\n\x0c\x42odyMutation\x12\x0e\n\x04\x62ody\x18\x01 \x01(\x0cH\x00\x12\x14\n\nclear_body\x18\x02 \x01(\x08H\x00\x42\n\n\x08mutation2\x81\x01\n\x11\x45xternalProcessor\x12l\n\x07Process\x12,.envoy.service.ext_proc.v3.ProcessingRequest\x1a-.envoy.service.ext_proc.v3.ProcessingResponse\"\x00(\x01\x30\x01\x42\xa3\x01\n\'io.envoyproxy.envoy.service.ext_proc.v3B\x16\x45xternalProcessorProtoP\x01ZKgithub.com/envoyproxy/go-control-plane/envoy/service/ext_proc/v3;ext_procv3\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\xd2\xc6\xa4\xe1\x06\x02\x08\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.service.ext_proc.v3.external_processor_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'io.envoyproxy.envoy.service.ext_proc.v3B\026ExternalProcessorProtoP\001ZKgithub.com/envoyproxy/go-control-plane/envoy/service/ext_proc/v3;ext_procv3\210\001\001\272\200\310\321\006\002\020\002\322\306\244\341\006\002\010\001'
  _PROCESSINGREQUEST.oneofs_by_name['request']._options = None
  _PROCESSINGREQUEST.oneofs_by_name['request']._serialized_options = b'\370B\001'
  _PROCESSINGRESPONSE.oneofs_by_name['response']._options = None
  _PROCESSINGRESPONSE.oneofs_by_name['response']._serialized_options = b'\370B\001'
  _HTTPHEADERS_ATTRIBUTESENTRY._options = None
  _HTTPHEADERS_ATTRIBUTESENTRY._serialized_options = b'8\001'
  _COMMONRESPONSE.fields_by_name['status']._options = None
  _COMMONRESPONSE.fields_by_name['status']._serialized_options = b'\372B\005\202\001\002\020\001'
  _IMMEDIATERESPONSE.fields_by_name['status']._options = None
  _IMMEDIATERESPONSE.fields_by_name['status']._serialized_options = b'\372B\005\212\001\002\020\001'
  _PROCESSINGREQUEST._serialized_start=332
  _PROCESSINGREQUEST._serialized_end=784
  _PROCESSINGRESPONSE._serialized_start=787
  _PROCESSINGRESPONSE._serialized_end=1454
  _HTTPHEADERS._serialized_start=1457
  _HTTPHEADERS._serialized_end=1695
  _HTTPHEADERS_ATTRIBUTESENTRY._serialized_start=1621
  _HTTPHEADERS_ATTRIBUTESENTRY._serialized_end=1695
  _HTTPBODY._serialized_start=1697
  _HTTPBODY._serialized_end=1744
  _HTTPTRAILERS._serialized_start=1746
  _HTTPTRAILERS._serialized_end=1811
  _HEADERSRESPONSE._serialized_start=1813
  _HEADERSRESPONSE._serialized_end=1891
  _TRAILERSRESPONSE._serialized_start=1893
  _TRAILERSRESPONSE._serialized_end=1979
  _BODYRESPONSE._serialized_start=1981
  _BODYRESPONSE._serialized_end=2056
  _COMMONRESPONSE._serialized_start=2059
  _COMMONRESPONSE._serialized_end=2427
  _COMMONRESPONSE_RESPONSESTATUS._serialized_start=2371
  _COMMONRESPONSE_RESPONSESTATUS._serialized_end=2427
  _IMMEDIATERESPONSE._serialized_start=2430
  _IMMEDIATERESPONSE._serialized_end=2653
  _GRPCSTATUS._serialized_start=2655
  _GRPCSTATUS._serialized_end=2683
  _HEADERMUTATION._serialized_start=2685
  _HEADERMUTATION._serialized_end=2787
  _BODYMUTATION._serialized_start=2789
  _BODYMUTATION._serialized_end=2853
  _EXTERNALPROCESSOR._serialized_start=2856
  _EXTERNALPROCESSOR._serialized_end=2985
# @@protoc_insertion_point(module_scope)
