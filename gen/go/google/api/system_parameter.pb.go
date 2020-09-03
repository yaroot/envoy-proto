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
// source: google/api/system_parameter.proto

package serviceconfig

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
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

// ### System parameter configuration
//
// A system parameter is a special kind of parameter defined by the API
// system, not by an individual API. It is typically mapped to an HTTP header
// and/or a URL query parameter. This configuration specifies which methods
// change the names of the system parameters.
type SystemParameters struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Define system parameters.
	//
	// The parameters defined here will override the default parameters
	// implemented by the system. If this field is missing from the service
	// config, default system parameters will be used. Default system parameters
	// and names is implementation-dependent.
	//
	// Example: define api key for all methods
	//
	//     system_parameters
	//       rules:
	//         - selector: "*"
	//           parameters:
	//             - name: api_key
	//               url_query_parameter: api_key
	//
	//
	// Example: define 2 api key names for a specific method.
	//
	//     system_parameters
	//       rules:
	//         - selector: "/ListShelves"
	//           parameters:
	//             - name: api_key
	//               http_header: Api-Key1
	//             - name: api_key
	//               http_header: Api-Key2
	//
	// **NOTE:** All service configuration rules follow "last one wins" order.
	Rules []*SystemParameterRule `protobuf:"bytes,1,rep,name=rules,proto3" json:"rules,omitempty"`
}

func (x *SystemParameters) Reset() {
	*x = SystemParameters{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_system_parameter_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SystemParameters) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SystemParameters) ProtoMessage() {}

func (x *SystemParameters) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_system_parameter_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SystemParameters.ProtoReflect.Descriptor instead.
func (*SystemParameters) Descriptor() ([]byte, []int) {
	return file_google_api_system_parameter_proto_rawDescGZIP(), []int{0}
}

func (x *SystemParameters) GetRules() []*SystemParameterRule {
	if x != nil {
		return x.Rules
	}
	return nil
}

// Define a system parameter rule mapping system parameter definitions to
// methods.
type SystemParameterRule struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Selects the methods to which this rule applies. Use '*' to indicate all
	// methods in all APIs.
	//
	// Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
	Selector string `protobuf:"bytes,1,opt,name=selector,proto3" json:"selector,omitempty"`
	// Define parameters. Multiple names may be defined for a parameter.
	// For a given method call, only one of them should be used. If multiple
	// names are used the behavior is implementation-dependent.
	// If none of the specified names are present the behavior is
	// parameter-dependent.
	Parameters []*SystemParameter `protobuf:"bytes,2,rep,name=parameters,proto3" json:"parameters,omitempty"`
}

func (x *SystemParameterRule) Reset() {
	*x = SystemParameterRule{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_system_parameter_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SystemParameterRule) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SystemParameterRule) ProtoMessage() {}

func (x *SystemParameterRule) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_system_parameter_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SystemParameterRule.ProtoReflect.Descriptor instead.
func (*SystemParameterRule) Descriptor() ([]byte, []int) {
	return file_google_api_system_parameter_proto_rawDescGZIP(), []int{1}
}

func (x *SystemParameterRule) GetSelector() string {
	if x != nil {
		return x.Selector
	}
	return ""
}

func (x *SystemParameterRule) GetParameters() []*SystemParameter {
	if x != nil {
		return x.Parameters
	}
	return nil
}

// Define a parameter's name and location. The parameter may be passed as either
// an HTTP header or a URL query parameter, and if both are passed the behavior
// is implementation-dependent.
type SystemParameter struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Define the name of the parameter, such as "api_key" . It is case sensitive.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Define the HTTP header name to use for the parameter. It is case
	// insensitive.
	HttpHeader string `protobuf:"bytes,2,opt,name=http_header,json=httpHeader,proto3" json:"http_header,omitempty"`
	// Define the URL query parameter name to use for the parameter. It is case
	// sensitive.
	UrlQueryParameter string `protobuf:"bytes,3,opt,name=url_query_parameter,json=urlQueryParameter,proto3" json:"url_query_parameter,omitempty"`
}

func (x *SystemParameter) Reset() {
	*x = SystemParameter{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_system_parameter_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SystemParameter) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SystemParameter) ProtoMessage() {}

func (x *SystemParameter) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_system_parameter_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SystemParameter.ProtoReflect.Descriptor instead.
func (*SystemParameter) Descriptor() ([]byte, []int) {
	return file_google_api_system_parameter_proto_rawDescGZIP(), []int{2}
}

func (x *SystemParameter) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *SystemParameter) GetHttpHeader() string {
	if x != nil {
		return x.HttpHeader
	}
	return ""
}

func (x *SystemParameter) GetUrlQueryParameter() string {
	if x != nil {
		return x.UrlQueryParameter
	}
	return ""
}

var File_google_api_system_parameter_proto protoreflect.FileDescriptor

var file_google_api_system_parameter_proto_rawDesc = []byte{
	0x0a, 0x21, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x79, 0x73,
	0x74, 0x65, 0x6d, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x22,
	0x49, 0x0a, 0x10, 0x53, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74,
	0x65, 0x72, 0x73, 0x12, 0x35, 0x0a, 0x05, 0x72, 0x75, 0x6c, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e,
	0x53, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x52,
	0x75, 0x6c, 0x65, 0x52, 0x05, 0x72, 0x75, 0x6c, 0x65, 0x73, 0x22, 0x6e, 0x0a, 0x13, 0x53, 0x79,
	0x73, 0x74, 0x65, 0x6d, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x52, 0x75, 0x6c,
	0x65, 0x12, 0x1a, 0x0a, 0x08, 0x73, 0x65, 0x6c, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x08, 0x73, 0x65, 0x6c, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x12, 0x3b, 0x0a,
	0x0a, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x53,
	0x79, 0x73, 0x74, 0x65, 0x6d, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x52, 0x0a,
	0x70, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x73, 0x22, 0x76, 0x0a, 0x0f, 0x53, 0x79,
	0x73, 0x74, 0x65, 0x6d, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x12, 0x12, 0x0a,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x68, 0x74, 0x74, 0x70, 0x5f, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x68, 0x74, 0x74, 0x70, 0x48, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x12, 0x2e, 0x0a, 0x13, 0x75, 0x72, 0x6c, 0x5f, 0x71, 0x75, 0x65, 0x72, 0x79, 0x5f,
	0x70, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x11, 0x75, 0x72, 0x6c, 0x51, 0x75, 0x65, 0x72, 0x79, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74,
	0x65, 0x72, 0x42, 0x76, 0x0a, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x70, 0x69, 0x42, 0x14, 0x53, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x50, 0x61, 0x72, 0x61,
	0x6d, 0x65, 0x74, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f,
	0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0xa2, 0x02, 0x04, 0x47, 0x41, 0x50, 0x49, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_google_api_system_parameter_proto_rawDescOnce sync.Once
	file_google_api_system_parameter_proto_rawDescData = file_google_api_system_parameter_proto_rawDesc
)

func file_google_api_system_parameter_proto_rawDescGZIP() []byte {
	file_google_api_system_parameter_proto_rawDescOnce.Do(func() {
		file_google_api_system_parameter_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_api_system_parameter_proto_rawDescData)
	})
	return file_google_api_system_parameter_proto_rawDescData
}

var file_google_api_system_parameter_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_google_api_system_parameter_proto_goTypes = []interface{}{
	(*SystemParameters)(nil),    // 0: google.api.SystemParameters
	(*SystemParameterRule)(nil), // 1: google.api.SystemParameterRule
	(*SystemParameter)(nil),     // 2: google.api.SystemParameter
}
var file_google_api_system_parameter_proto_depIdxs = []int32{
	1, // 0: google.api.SystemParameters.rules:type_name -> google.api.SystemParameterRule
	2, // 1: google.api.SystemParameterRule.parameters:type_name -> google.api.SystemParameter
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_api_system_parameter_proto_init() }
func file_google_api_system_parameter_proto_init() {
	if File_google_api_system_parameter_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_api_system_parameter_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SystemParameters); i {
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
		file_google_api_system_parameter_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SystemParameterRule); i {
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
		file_google_api_system_parameter_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SystemParameter); i {
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
			RawDescriptor: file_google_api_system_parameter_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_api_system_parameter_proto_goTypes,
		DependencyIndexes: file_google_api_system_parameter_proto_depIdxs,
		MessageInfos:      file_google_api_system_parameter_proto_msgTypes,
	}.Build()
	File_google_api_system_parameter_proto = out.File
	file_google_api_system_parameter_proto_rawDesc = nil
	file_google_api_system_parameter_proto_goTypes = nil
	file_google_api_system_parameter_proto_depIdxs = nil
}
