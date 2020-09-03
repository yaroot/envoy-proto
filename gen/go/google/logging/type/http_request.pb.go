// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: google/logging/type/http_request.proto

package ltype

import (
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	durationpb "google.golang.org/protobuf/types/known/durationpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

// A common proto for logging HTTP requests. Only contains semantics
// defined by the HTTP specification. Product-specific logging
// information MUST be defined in a separate message.
type HttpRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
	RequestMethod string `protobuf:"bytes,1,opt,name=request_method,json=requestMethod,proto3" json:"request_method,omitempty"`
	// The scheme (http, https), the host name, the path and the query
	// portion of the URL that was requested.
	// Example: `"http://example.com/some/info?color=red"`.
	RequestUrl string `protobuf:"bytes,2,opt,name=request_url,json=requestUrl,proto3" json:"request_url,omitempty"`
	// The size of the HTTP request message in bytes, including the request
	// headers and the request body.
	RequestSize int64 `protobuf:"varint,3,opt,name=request_size,json=requestSize,proto3" json:"request_size,omitempty"`
	// The response code indicating the status of response.
	// Examples: 200, 404.
	Status int32 `protobuf:"varint,4,opt,name=status,proto3" json:"status,omitempty"`
	// The size of the HTTP response message sent back to the client, in bytes,
	// including the response headers and the response body.
	ResponseSize int64 `protobuf:"varint,5,opt,name=response_size,json=responseSize,proto3" json:"response_size,omitempty"`
	// The user agent sent by the client. Example:
	// `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET
	// CLR 1.0.3705)"`.
	UserAgent string `protobuf:"bytes,6,opt,name=user_agent,json=userAgent,proto3" json:"user_agent,omitempty"`
	// The IP address (IPv4 or IPv6) of the client that issued the HTTP
	// request. Examples: `"192.168.1.1"`, `"FE80::0202:B3FF:FE1E:8329"`.
	RemoteIp string `protobuf:"bytes,7,opt,name=remote_ip,json=remoteIp,proto3" json:"remote_ip,omitempty"`
	// The IP address (IPv4 or IPv6) of the origin server that the request was
	// sent to.
	ServerIp string `protobuf:"bytes,13,opt,name=server_ip,json=serverIp,proto3" json:"server_ip,omitempty"`
	// The referer URL of the request, as defined in
	// [HTTP/1.1 Header Field
	// Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
	Referer string `protobuf:"bytes,8,opt,name=referer,proto3" json:"referer,omitempty"`
	// The request processing latency on the server, from the time the request was
	// received until the response was sent.
	Latency *durationpb.Duration `protobuf:"bytes,14,opt,name=latency,proto3" json:"latency,omitempty"`
	// Whether or not a cache lookup was attempted.
	CacheLookup bool `protobuf:"varint,11,opt,name=cache_lookup,json=cacheLookup,proto3" json:"cache_lookup,omitempty"`
	// Whether or not an entity was served from cache
	// (with or without validation).
	CacheHit bool `protobuf:"varint,9,opt,name=cache_hit,json=cacheHit,proto3" json:"cache_hit,omitempty"`
	// Whether or not the response was validated with the origin server before
	// being served from cache. This field is only meaningful if `cache_hit` is
	// True.
	CacheValidatedWithOriginServer bool `protobuf:"varint,10,opt,name=cache_validated_with_origin_server,json=cacheValidatedWithOriginServer,proto3" json:"cache_validated_with_origin_server,omitempty"`
	// The number of HTTP response bytes inserted into cache. Set only when a
	// cache fill was attempted.
	CacheFillBytes int64 `protobuf:"varint,12,opt,name=cache_fill_bytes,json=cacheFillBytes,proto3" json:"cache_fill_bytes,omitempty"`
	// Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
	Protocol string `protobuf:"bytes,15,opt,name=protocol,proto3" json:"protocol,omitempty"`
}

func (x *HttpRequest) Reset() {
	*x = HttpRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_logging_type_http_request_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HttpRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HttpRequest) ProtoMessage() {}

func (x *HttpRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_logging_type_http_request_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HttpRequest.ProtoReflect.Descriptor instead.
func (*HttpRequest) Descriptor() ([]byte, []int) {
	return file_google_logging_type_http_request_proto_rawDescGZIP(), []int{0}
}

func (x *HttpRequest) GetRequestMethod() string {
	if x != nil {
		return x.RequestMethod
	}
	return ""
}

func (x *HttpRequest) GetRequestUrl() string {
	if x != nil {
		return x.RequestUrl
	}
	return ""
}

func (x *HttpRequest) GetRequestSize() int64 {
	if x != nil {
		return x.RequestSize
	}
	return 0
}

func (x *HttpRequest) GetStatus() int32 {
	if x != nil {
		return x.Status
	}
	return 0
}

func (x *HttpRequest) GetResponseSize() int64 {
	if x != nil {
		return x.ResponseSize
	}
	return 0
}

func (x *HttpRequest) GetUserAgent() string {
	if x != nil {
		return x.UserAgent
	}
	return ""
}

func (x *HttpRequest) GetRemoteIp() string {
	if x != nil {
		return x.RemoteIp
	}
	return ""
}

func (x *HttpRequest) GetServerIp() string {
	if x != nil {
		return x.ServerIp
	}
	return ""
}

func (x *HttpRequest) GetReferer() string {
	if x != nil {
		return x.Referer
	}
	return ""
}

func (x *HttpRequest) GetLatency() *durationpb.Duration {
	if x != nil {
		return x.Latency
	}
	return nil
}

func (x *HttpRequest) GetCacheLookup() bool {
	if x != nil {
		return x.CacheLookup
	}
	return false
}

func (x *HttpRequest) GetCacheHit() bool {
	if x != nil {
		return x.CacheHit
	}
	return false
}

func (x *HttpRequest) GetCacheValidatedWithOriginServer() bool {
	if x != nil {
		return x.CacheValidatedWithOriginServer
	}
	return false
}

func (x *HttpRequest) GetCacheFillBytes() int64 {
	if x != nil {
		return x.CacheFillBytes
	}
	return 0
}

func (x *HttpRequest) GetProtocol() string {
	if x != nil {
		return x.Protocol
	}
	return ""
}

var File_google_logging_type_http_request_proto protoreflect.FileDescriptor

var file_google_logging_type_http_request_proto_rawDesc = []byte{
	0x0a, 0x26, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x68, 0x74, 0x74, 0x70, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x13, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x1a, 0x1e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x64,
	0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xaf, 0x04, 0x0a, 0x0b,
	0x48, 0x74, 0x74, 0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x25, 0x0a, 0x0e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0d, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x4d, 0x65, 0x74, 0x68,
	0x6f, 0x64, 0x12, 0x1f, 0x0a, 0x0b, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x75, 0x72,
	0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x55, 0x72, 0x6c, 0x12, 0x21, 0x0a, 0x0c, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x73,
	0x69, 0x7a, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0b, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x53, 0x69, 0x7a, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x23,
	0x0a, 0x0d, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x53,
	0x69, 0x7a, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x61, 0x67, 0x65, 0x6e,
	0x74, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x75, 0x73, 0x65, 0x72, 0x41, 0x67, 0x65,
	0x6e, 0x74, 0x12, 0x1b, 0x0a, 0x09, 0x72, 0x65, 0x6d, 0x6f, 0x74, 0x65, 0x5f, 0x69, 0x70, 0x18,
	0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x72, 0x65, 0x6d, 0x6f, 0x74, 0x65, 0x49, 0x70, 0x12,
	0x1b, 0x0a, 0x09, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x5f, 0x69, 0x70, 0x18, 0x0d, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x08, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x49, 0x70, 0x12, 0x18, 0x0a, 0x07,
	0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x72, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x72,
	0x65, 0x66, 0x65, 0x72, 0x65, 0x72, 0x12, 0x33, 0x0a, 0x07, 0x6c, 0x61, 0x74, 0x65, 0x6e, 0x63,
	0x79, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x44, 0x75, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x07, 0x6c, 0x61, 0x74, 0x65, 0x6e, 0x63, 0x79, 0x12, 0x21, 0x0a, 0x0c, 0x63,
	0x61, 0x63, 0x68, 0x65, 0x5f, 0x6c, 0x6f, 0x6f, 0x6b, 0x75, 0x70, 0x18, 0x0b, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x0b, 0x63, 0x61, 0x63, 0x68, 0x65, 0x4c, 0x6f, 0x6f, 0x6b, 0x75, 0x70, 0x12, 0x1b,
	0x0a, 0x09, 0x63, 0x61, 0x63, 0x68, 0x65, 0x5f, 0x68, 0x69, 0x74, 0x18, 0x09, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x08, 0x63, 0x61, 0x63, 0x68, 0x65, 0x48, 0x69, 0x74, 0x12, 0x4a, 0x0a, 0x22, 0x63,
	0x61, 0x63, 0x68, 0x65, 0x5f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x77,
	0x69, 0x74, 0x68, 0x5f, 0x6f, 0x72, 0x69, 0x67, 0x69, 0x6e, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x65,
	0x72, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x08, 0x52, 0x1e, 0x63, 0x61, 0x63, 0x68, 0x65, 0x56, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x64, 0x57, 0x69, 0x74, 0x68, 0x4f, 0x72, 0x69, 0x67, 0x69,
	0x6e, 0x53, 0x65, 0x72, 0x76, 0x65, 0x72, 0x12, 0x28, 0x0a, 0x10, 0x63, 0x61, 0x63, 0x68, 0x65,
	0x5f, 0x66, 0x69, 0x6c, 0x6c, 0x5f, 0x62, 0x79, 0x74, 0x65, 0x73, 0x18, 0x0c, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x0e, 0x63, 0x61, 0x63, 0x68, 0x65, 0x46, 0x69, 0x6c, 0x6c, 0x42, 0x79, 0x74, 0x65,
	0x73, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x18, 0x0f, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x42, 0xbe, 0x01,
	0x0a, 0x17, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x6c, 0x6f, 0x67,
	0x67, 0x69, 0x6e, 0x67, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x42, 0x10, 0x48, 0x74, 0x74, 0x70, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x38, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67,
	0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x70, 0x69, 0x73, 0x2f, 0x6c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x3b, 0x6c, 0x74, 0x79, 0x70, 0x65, 0xaa, 0x02, 0x19, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x2e, 0x54,
	0x79, 0x70, 0x65, 0xca, 0x02, 0x19, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c, 0x6f,
	0x75, 0x64, 0x5c, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x5c, 0x54, 0x79, 0x70, 0x65, 0xea,
	0x02, 0x1c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a,
	0x3a, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x3a, 0x3a, 0x54, 0x79, 0x70, 0x65, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_logging_type_http_request_proto_rawDescOnce sync.Once
	file_google_logging_type_http_request_proto_rawDescData = file_google_logging_type_http_request_proto_rawDesc
)

func file_google_logging_type_http_request_proto_rawDescGZIP() []byte {
	file_google_logging_type_http_request_proto_rawDescOnce.Do(func() {
		file_google_logging_type_http_request_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_logging_type_http_request_proto_rawDescData)
	})
	return file_google_logging_type_http_request_proto_rawDescData
}

var file_google_logging_type_http_request_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_logging_type_http_request_proto_goTypes = []interface{}{
	(*HttpRequest)(nil),         // 0: google.logging.type.HttpRequest
	(*durationpb.Duration)(nil), // 1: google.protobuf.Duration
}
var file_google_logging_type_http_request_proto_depIdxs = []int32{
	1, // 0: google.logging.type.HttpRequest.latency:type_name -> google.protobuf.Duration
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_google_logging_type_http_request_proto_init() }
func file_google_logging_type_http_request_proto_init() {
	if File_google_logging_type_http_request_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_logging_type_http_request_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HttpRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_logging_type_http_request_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_logging_type_http_request_proto_goTypes,
		DependencyIndexes: file_google_logging_type_http_request_proto_depIdxs,
		MessageInfos:      file_google_logging_type_http_request_proto_msgTypes,
	}.Build()
	File_google_logging_type_http_request_proto = out.File
	file_google_logging_type_http_request_proto_rawDesc = nil
	file_google_logging_type_http_request_proto_goTypes = nil
	file_google_logging_type_http_request_proto_depIdxs = nil
}
