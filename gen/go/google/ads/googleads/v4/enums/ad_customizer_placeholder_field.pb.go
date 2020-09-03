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
// source: google/ads/googleads/v4/enums/ad_customizer_placeholder_field.proto

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

// Possible values for Ad Customizers placeholder fields.
type AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField int32

const (
	// Not specified.
	AdCustomizerPlaceholderFieldEnum_UNSPECIFIED AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField = 0
	// Used for return value only. Represents value unknown in this version.
	AdCustomizerPlaceholderFieldEnum_UNKNOWN AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField = 1
	// Data Type: INT64. Integer value to be inserted.
	AdCustomizerPlaceholderFieldEnum_INTEGER AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField = 2
	// Data Type: STRING. Price value to be inserted.
	AdCustomizerPlaceholderFieldEnum_PRICE AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField = 3
	// Data Type: DATE_TIME. Date value to be inserted.
	AdCustomizerPlaceholderFieldEnum_DATE AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField = 4
	// Data Type: STRING. String value to be inserted.
	AdCustomizerPlaceholderFieldEnum_STRING AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField = 5
)

// Enum value maps for AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField.
var (
	AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField_name = map[int32]string{
		0: "UNSPECIFIED",
		1: "UNKNOWN",
		2: "INTEGER",
		3: "PRICE",
		4: "DATE",
		5: "STRING",
	}
	AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField_value = map[string]int32{
		"UNSPECIFIED": 0,
		"UNKNOWN":     1,
		"INTEGER":     2,
		"PRICE":       3,
		"DATE":        4,
		"STRING":      5,
	}
)

func (x AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField) Enum() *AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField {
	p := new(AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField)
	*p = x
	return p
}

func (x AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField) Descriptor() protoreflect.EnumDescriptor {
	return file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_enumTypes[0].Descriptor()
}

func (AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField) Type() protoreflect.EnumType {
	return &file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_enumTypes[0]
}

func (x AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField.Descriptor instead.
func (AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField) EnumDescriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescGZIP(), []int{0, 0}
}

// Values for Ad Customizer placeholder fields.
type AdCustomizerPlaceholderFieldEnum struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *AdCustomizerPlaceholderFieldEnum) Reset() {
	*x = AdCustomizerPlaceholderFieldEnum{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AdCustomizerPlaceholderFieldEnum) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AdCustomizerPlaceholderFieldEnum) ProtoMessage() {}

func (x *AdCustomizerPlaceholderFieldEnum) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AdCustomizerPlaceholderFieldEnum.ProtoReflect.Descriptor instead.
func (*AdCustomizerPlaceholderFieldEnum) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescGZIP(), []int{0}
}

var File_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDesc = []byte{
	0x0a, 0x43, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x61, 0x64, 0x5f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x69, 0x7a, 0x65, 0x72, 0x5f, 0x70, 0x6c,
	0x61, 0x63, 0x65, 0x68, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x65,
	0x6e, 0x75, 0x6d, 0x73, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0x8e, 0x01, 0x0a, 0x20, 0x41, 0x64, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x69,
	0x7a, 0x65, 0x72, 0x50, 0x6c, 0x61, 0x63, 0x65, 0x68, 0x6f, 0x6c, 0x64, 0x65, 0x72, 0x46, 0x69,
	0x65, 0x6c, 0x64, 0x45, 0x6e, 0x75, 0x6d, 0x22, 0x6a, 0x0a, 0x1c, 0x41, 0x64, 0x43, 0x75, 0x73,
	0x74, 0x6f, 0x6d, 0x69, 0x7a, 0x65, 0x72, 0x50, 0x6c, 0x61, 0x63, 0x65, 0x68, 0x6f, 0x6c, 0x64,
	0x65, 0x72, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x12, 0x0f, 0x0a, 0x0b, 0x55, 0x4e, 0x53, 0x50, 0x45,
	0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e,
	0x4f, 0x57, 0x4e, 0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07, 0x49, 0x4e, 0x54, 0x45, 0x47, 0x45, 0x52,
	0x10, 0x02, 0x12, 0x09, 0x0a, 0x05, 0x50, 0x52, 0x49, 0x43, 0x45, 0x10, 0x03, 0x12, 0x08, 0x0a,
	0x04, 0x44, 0x41, 0x54, 0x45, 0x10, 0x04, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x54, 0x52, 0x49, 0x4e,
	0x47, 0x10, 0x05, 0x42, 0xf6, 0x01, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x34, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x21, 0x41, 0x64, 0x43, 0x75, 0x73,
	0x74, 0x6f, 0x6d, 0x69, 0x7a, 0x65, 0x72, 0x50, 0x6c, 0x61, 0x63, 0x65, 0x68, 0x6f, 0x6c, 0x64,
	0x65, 0x72, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x42,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72,
	0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x3b, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e,
	0x56, 0x34, 0x2e, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xca, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c,
	0x56, 0x34, 0x5c, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xea, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64,
	0x73, 0x3a, 0x3a, 0x56, 0x34, 0x3a, 0x3a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescData = file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDesc
)

func file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescData)
	})
	return file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDescData
}

var file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_goTypes = []interface{}{
	(AdCustomizerPlaceholderFieldEnum_AdCustomizerPlaceholderField)(0), // 0: google.ads.googleads.v4.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField
	(*AdCustomizerPlaceholderFieldEnum)(nil),                           // 1: google.ads.googleads.v4.enums.AdCustomizerPlaceholderFieldEnum
}
var file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_init() }
func file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_init() {
	if File_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AdCustomizerPlaceholderFieldEnum); i {
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
			RawDescriptor: file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_depIdxs,
		EnumInfos:         file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_enumTypes,
		MessageInfos:      file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto = out.File
	file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_rawDesc = nil
	file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_goTypes = nil
	file_google_ads_googleads_v4_enums_ad_customizer_placeholder_field_proto_depIdxs = nil
}
