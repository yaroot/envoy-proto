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
// source: google/ads/googleads/v2/common/value.proto

package common

import (
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

// A generic data container.
type Value struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A value.
	//
	// Types that are assignable to Value:
	//	*Value_BooleanValue
	//	*Value_Int64Value
	//	*Value_FloatValue
	//	*Value_DoubleValue
	//	*Value_StringValue
	Value isValue_Value `protobuf_oneof:"value"`
}

func (x *Value) Reset() {
	*x = Value{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_common_value_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Value) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Value) ProtoMessage() {}

func (x *Value) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_common_value_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Value.ProtoReflect.Descriptor instead.
func (*Value) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_common_value_proto_rawDescGZIP(), []int{0}
}

func (m *Value) GetValue() isValue_Value {
	if m != nil {
		return m.Value
	}
	return nil
}

func (x *Value) GetBooleanValue() bool {
	if x, ok := x.GetValue().(*Value_BooleanValue); ok {
		return x.BooleanValue
	}
	return false
}

func (x *Value) GetInt64Value() int64 {
	if x, ok := x.GetValue().(*Value_Int64Value); ok {
		return x.Int64Value
	}
	return 0
}

func (x *Value) GetFloatValue() float32 {
	if x, ok := x.GetValue().(*Value_FloatValue); ok {
		return x.FloatValue
	}
	return 0
}

func (x *Value) GetDoubleValue() float64 {
	if x, ok := x.GetValue().(*Value_DoubleValue); ok {
		return x.DoubleValue
	}
	return 0
}

func (x *Value) GetStringValue() string {
	if x, ok := x.GetValue().(*Value_StringValue); ok {
		return x.StringValue
	}
	return ""
}

type isValue_Value interface {
	isValue_Value()
}

type Value_BooleanValue struct {
	// A boolean.
	BooleanValue bool `protobuf:"varint,1,opt,name=boolean_value,json=booleanValue,proto3,oneof"`
}

type Value_Int64Value struct {
	// An int64.
	Int64Value int64 `protobuf:"varint,2,opt,name=int64_value,json=int64Value,proto3,oneof"`
}

type Value_FloatValue struct {
	// A float.
	FloatValue float32 `protobuf:"fixed32,3,opt,name=float_value,json=floatValue,proto3,oneof"`
}

type Value_DoubleValue struct {
	// A double.
	DoubleValue float64 `protobuf:"fixed64,4,opt,name=double_value,json=doubleValue,proto3,oneof"`
}

type Value_StringValue struct {
	// A string.
	StringValue string `protobuf:"bytes,5,opt,name=string_value,json=stringValue,proto3,oneof"`
}

func (*Value_BooleanValue) isValue_Value() {}

func (*Value_Int64Value) isValue_Value() {}

func (*Value_FloatValue) isValue_Value() {}

func (*Value_DoubleValue) isValue_Value() {}

func (*Value_StringValue) isValue_Value() {}

var File_google_ads_googleads_v2_common_value_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v2_common_value_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x1a, 0x1c, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xc7, 0x01, 0x0a, 0x05, 0x56,
	0x61, 0x6c, 0x75, 0x65, 0x12, 0x25, 0x0a, 0x0d, 0x62, 0x6f, 0x6f, 0x6c, 0x65, 0x61, 0x6e, 0x5f,
	0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x08, 0x48, 0x00, 0x52, 0x0c, 0x62,
	0x6f, 0x6f, 0x6c, 0x65, 0x61, 0x6e, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x21, 0x0a, 0x0b, 0x69,
	0x6e, 0x74, 0x36, 0x34, 0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03,
	0x48, 0x00, 0x52, 0x0a, 0x69, 0x6e, 0x74, 0x36, 0x34, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x21,
	0x0a, 0x0b, 0x66, 0x6c, 0x6f, 0x61, 0x74, 0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x02, 0x48, 0x00, 0x52, 0x0a, 0x66, 0x6c, 0x6f, 0x61, 0x74, 0x56, 0x61, 0x6c, 0x75,
	0x65, 0x12, 0x23, 0x0a, 0x0c, 0x64, 0x6f, 0x75, 0x62, 0x6c, 0x65, 0x5f, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x01, 0x48, 0x00, 0x52, 0x0b, 0x64, 0x6f, 0x75, 0x62, 0x6c,
	0x65, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x23, 0x0a, 0x0c, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67,
	0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x0b,
	0x73, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x07, 0x0a, 0x05, 0x76,
	0x61, 0x6c, 0x75, 0x65, 0x42, 0xe5, 0x01, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2e, 0x76, 0x32, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x42, 0x0a, 0x56, 0x61, 0x6c,
	0x75, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76,
	0x32, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x3b, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xa2,
	0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41,
	0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x32, 0x2e,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xca, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c,
	0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x32,
	0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xea, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x3a, 0x3a, 0x56, 0x32, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v2_common_value_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v2_common_value_proto_rawDescData = file_google_ads_googleads_v2_common_value_proto_rawDesc
)

func file_google_ads_googleads_v2_common_value_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v2_common_value_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v2_common_value_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v2_common_value_proto_rawDescData)
	})
	return file_google_ads_googleads_v2_common_value_proto_rawDescData
}

var file_google_ads_googleads_v2_common_value_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v2_common_value_proto_goTypes = []interface{}{
	(*Value)(nil), // 0: google.ads.googleads.v2.common.Value
}
var file_google_ads_googleads_v2_common_value_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v2_common_value_proto_init() }
func file_google_ads_googleads_v2_common_value_proto_init() {
	if File_google_ads_googleads_v2_common_value_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v2_common_value_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Value); i {
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
	file_google_ads_googleads_v2_common_value_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*Value_BooleanValue)(nil),
		(*Value_Int64Value)(nil),
		(*Value_FloatValue)(nil),
		(*Value_DoubleValue)(nil),
		(*Value_StringValue)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v2_common_value_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v2_common_value_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v2_common_value_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v2_common_value_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v2_common_value_proto = out.File
	file_google_ads_googleads_v2_common_value_proto_rawDesc = nil
	file_google_ads_googleads_v2_common_value_proto_goTypes = nil
	file_google_ads_googleads_v2_common_value_proto_depIdxs = nil
}
