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
// source: google/ads/googleads/v3/enums/webpage_condition_operand.proto

package enums

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

// The webpage condition operand in webpage criterion.
type WebpageConditionOperandEnum_WebpageConditionOperand int32

const (
	// Not specified.
	WebpageConditionOperandEnum_UNSPECIFIED WebpageConditionOperandEnum_WebpageConditionOperand = 0
	// Used for return value only. Represents value unknown in this version.
	WebpageConditionOperandEnum_UNKNOWN WebpageConditionOperandEnum_WebpageConditionOperand = 1
	// Operand denoting a webpage URL targeting condition.
	WebpageConditionOperandEnum_URL WebpageConditionOperandEnum_WebpageConditionOperand = 2
	// Operand denoting a webpage category targeting condition.
	WebpageConditionOperandEnum_CATEGORY WebpageConditionOperandEnum_WebpageConditionOperand = 3
	// Operand denoting a webpage title targeting condition.
	WebpageConditionOperandEnum_PAGE_TITLE WebpageConditionOperandEnum_WebpageConditionOperand = 4
	// Operand denoting a webpage content targeting condition.
	WebpageConditionOperandEnum_PAGE_CONTENT WebpageConditionOperandEnum_WebpageConditionOperand = 5
	// Operand denoting a webpage custom label targeting condition.
	WebpageConditionOperandEnum_CUSTOM_LABEL WebpageConditionOperandEnum_WebpageConditionOperand = 6
)

// Enum value maps for WebpageConditionOperandEnum_WebpageConditionOperand.
var (
	WebpageConditionOperandEnum_WebpageConditionOperand_name = map[int32]string{
		0: "UNSPECIFIED",
		1: "UNKNOWN",
		2: "URL",
		3: "CATEGORY",
		4: "PAGE_TITLE",
		5: "PAGE_CONTENT",
		6: "CUSTOM_LABEL",
	}
	WebpageConditionOperandEnum_WebpageConditionOperand_value = map[string]int32{
		"UNSPECIFIED":  0,
		"UNKNOWN":      1,
		"URL":          2,
		"CATEGORY":     3,
		"PAGE_TITLE":   4,
		"PAGE_CONTENT": 5,
		"CUSTOM_LABEL": 6,
	}
)

func (x WebpageConditionOperandEnum_WebpageConditionOperand) Enum() *WebpageConditionOperandEnum_WebpageConditionOperand {
	p := new(WebpageConditionOperandEnum_WebpageConditionOperand)
	*p = x
	return p
}

func (x WebpageConditionOperandEnum_WebpageConditionOperand) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (WebpageConditionOperandEnum_WebpageConditionOperand) Descriptor() protoreflect.EnumDescriptor {
	return file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_enumTypes[0].Descriptor()
}

func (WebpageConditionOperandEnum_WebpageConditionOperand) Type() protoreflect.EnumType {
	return &file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_enumTypes[0]
}

func (x WebpageConditionOperandEnum_WebpageConditionOperand) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use WebpageConditionOperandEnum_WebpageConditionOperand.Descriptor instead.
func (WebpageConditionOperandEnum_WebpageConditionOperand) EnumDescriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescGZIP(), []int{0, 0}
}

// Container for enum describing webpage condition operand in webpage criterion.
type WebpageConditionOperandEnum struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *WebpageConditionOperandEnum) Reset() {
	*x = WebpageConditionOperandEnum{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WebpageConditionOperandEnum) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WebpageConditionOperandEnum) ProtoMessage() {}

func (x *WebpageConditionOperandEnum) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WebpageConditionOperandEnum.ProtoReflect.Descriptor instead.
func (*WebpageConditionOperandEnum) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescGZIP(), []int{0}
}

var File_google_ads_googleads_v3_enums_webpage_condition_operand_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDesc = []byte{
	0x0a, 0x3d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x77, 0x65, 0x62, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x63, 0x6f, 0x6e, 0x64, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x5f, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x6e, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x1d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x1a, 0x1c,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa2, 0x01, 0x0a,
	0x1b, 0x57, 0x65, 0x62, 0x70, 0x61, 0x67, 0x65, 0x43, 0x6f, 0x6e, 0x64, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x6e, 0x64, 0x45, 0x6e, 0x75, 0x6d, 0x22, 0x82, 0x01, 0x0a,
	0x17, 0x57, 0x65, 0x62, 0x70, 0x61, 0x67, 0x65, 0x43, 0x6f, 0x6e, 0x64, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x6e, 0x64, 0x12, 0x0f, 0x0a, 0x0b, 0x55, 0x4e, 0x53, 0x50,
	0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b,
	0x4e, 0x4f, 0x57, 0x4e, 0x10, 0x01, 0x12, 0x07, 0x0a, 0x03, 0x55, 0x52, 0x4c, 0x10, 0x02, 0x12,
	0x0c, 0x0a, 0x08, 0x43, 0x41, 0x54, 0x45, 0x47, 0x4f, 0x52, 0x59, 0x10, 0x03, 0x12, 0x0e, 0x0a,
	0x0a, 0x50, 0x41, 0x47, 0x45, 0x5f, 0x54, 0x49, 0x54, 0x4c, 0x45, 0x10, 0x04, 0x12, 0x10, 0x0a,
	0x0c, 0x50, 0x41, 0x47, 0x45, 0x5f, 0x43, 0x4f, 0x4e, 0x54, 0x45, 0x4e, 0x54, 0x10, 0x05, 0x12,
	0x10, 0x0a, 0x0c, 0x43, 0x55, 0x53, 0x54, 0x4f, 0x4d, 0x5f, 0x4c, 0x41, 0x42, 0x45, 0x4c, 0x10,
	0x06, 0x42, 0xf1, 0x01, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x33, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x1c, 0x57, 0x65, 0x62, 0x70, 0x61, 0x67, 0x65,
	0x43, 0x6f, 0x6e, 0x64, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x6e, 0x64,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x42, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f,
	0x65, 0x6e, 0x75, 0x6d, 0x73, 0x3b, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41,
	0x41, 0xaa, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x33, 0x2e, 0x45, 0x6e, 0x75, 0x6d,
	0x73, 0xca, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x33, 0x5c, 0x45, 0x6e, 0x75, 0x6d,
	0x73, 0xea, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a,
	0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x33, 0x3a, 0x3a,
	0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescData = file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDesc
)

func file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescData)
	})
	return file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDescData
}

var file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_goTypes = []interface{}{
	(WebpageConditionOperandEnum_WebpageConditionOperand)(0), // 0: google.ads.googleads.v3.enums.WebpageConditionOperandEnum.WebpageConditionOperand
	(*WebpageConditionOperandEnum)(nil),                      // 1: google.ads.googleads.v3.enums.WebpageConditionOperandEnum
}
var file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_init() }
func file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_init() {
	if File_google_ads_googleads_v3_enums_webpage_condition_operand_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WebpageConditionOperandEnum); i {
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
			RawDescriptor: file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_depIdxs,
		EnumInfos:         file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_enumTypes,
		MessageInfos:      file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v3_enums_webpage_condition_operand_proto = out.File
	file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_rawDesc = nil
	file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_goTypes = nil
	file_google_ads_googleads_v3_enums_webpage_condition_operand_proto_depIdxs = nil
}
