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
// source: google/ads/googleads/v6/enums/ad_group_type.proto

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

// Enum listing the possible types of an ad group.
type AdGroupTypeEnum_AdGroupType int32

const (
	// The type has not been specified.
	AdGroupTypeEnum_UNSPECIFIED AdGroupTypeEnum_AdGroupType = 0
	// The received value is not known in this version.
	//
	// This is a response-only value.
	AdGroupTypeEnum_UNKNOWN AdGroupTypeEnum_AdGroupType = 1
	// The default ad group type for Search campaigns.
	AdGroupTypeEnum_SEARCH_STANDARD AdGroupTypeEnum_AdGroupType = 2
	// The default ad group type for Display campaigns.
	AdGroupTypeEnum_DISPLAY_STANDARD AdGroupTypeEnum_AdGroupType = 3
	// The ad group type for Shopping campaigns serving standard product ads.
	AdGroupTypeEnum_SHOPPING_PRODUCT_ADS AdGroupTypeEnum_AdGroupType = 4
	// The default ad group type for Hotel campaigns.
	AdGroupTypeEnum_HOTEL_ADS AdGroupTypeEnum_AdGroupType = 6
	// The type for ad groups in Smart Shopping campaigns.
	AdGroupTypeEnum_SHOPPING_SMART_ADS AdGroupTypeEnum_AdGroupType = 7
	// Short unskippable in-stream video ads.
	AdGroupTypeEnum_VIDEO_BUMPER AdGroupTypeEnum_AdGroupType = 8
	// TrueView (skippable) in-stream video ads.
	AdGroupTypeEnum_VIDEO_TRUE_VIEW_IN_STREAM AdGroupTypeEnum_AdGroupType = 9
	// TrueView in-display video ads.
	AdGroupTypeEnum_VIDEO_TRUE_VIEW_IN_DISPLAY AdGroupTypeEnum_AdGroupType = 10
	// Unskippable in-stream video ads.
	AdGroupTypeEnum_VIDEO_NON_SKIPPABLE_IN_STREAM AdGroupTypeEnum_AdGroupType = 11
	// Outstream video ads.
	AdGroupTypeEnum_VIDEO_OUTSTREAM AdGroupTypeEnum_AdGroupType = 12
	// Ad group type for Dynamic Search Ads ad groups.
	AdGroupTypeEnum_SEARCH_DYNAMIC_ADS AdGroupTypeEnum_AdGroupType = 13
	// The type for ad groups in Shopping Comparison Listing campaigns.
	AdGroupTypeEnum_SHOPPING_COMPARISON_LISTING_ADS AdGroupTypeEnum_AdGroupType = 14
	// The ad group type for Promoted Hotel ad groups.
	AdGroupTypeEnum_PROMOTED_HOTEL_ADS AdGroupTypeEnum_AdGroupType = 15
	// Video responsive ad groups.
	AdGroupTypeEnum_VIDEO_RESPONSIVE AdGroupTypeEnum_AdGroupType = 16
)

// Enum value maps for AdGroupTypeEnum_AdGroupType.
var (
	AdGroupTypeEnum_AdGroupType_name = map[int32]string{
		0:  "UNSPECIFIED",
		1:  "UNKNOWN",
		2:  "SEARCH_STANDARD",
		3:  "DISPLAY_STANDARD",
		4:  "SHOPPING_PRODUCT_ADS",
		6:  "HOTEL_ADS",
		7:  "SHOPPING_SMART_ADS",
		8:  "VIDEO_BUMPER",
		9:  "VIDEO_TRUE_VIEW_IN_STREAM",
		10: "VIDEO_TRUE_VIEW_IN_DISPLAY",
		11: "VIDEO_NON_SKIPPABLE_IN_STREAM",
		12: "VIDEO_OUTSTREAM",
		13: "SEARCH_DYNAMIC_ADS",
		14: "SHOPPING_COMPARISON_LISTING_ADS",
		15: "PROMOTED_HOTEL_ADS",
		16: "VIDEO_RESPONSIVE",
	}
	AdGroupTypeEnum_AdGroupType_value = map[string]int32{
		"UNSPECIFIED":                     0,
		"UNKNOWN":                         1,
		"SEARCH_STANDARD":                 2,
		"DISPLAY_STANDARD":                3,
		"SHOPPING_PRODUCT_ADS":            4,
		"HOTEL_ADS":                       6,
		"SHOPPING_SMART_ADS":              7,
		"VIDEO_BUMPER":                    8,
		"VIDEO_TRUE_VIEW_IN_STREAM":       9,
		"VIDEO_TRUE_VIEW_IN_DISPLAY":      10,
		"VIDEO_NON_SKIPPABLE_IN_STREAM":   11,
		"VIDEO_OUTSTREAM":                 12,
		"SEARCH_DYNAMIC_ADS":              13,
		"SHOPPING_COMPARISON_LISTING_ADS": 14,
		"PROMOTED_HOTEL_ADS":              15,
		"VIDEO_RESPONSIVE":                16,
	}
)

func (x AdGroupTypeEnum_AdGroupType) Enum() *AdGroupTypeEnum_AdGroupType {
	p := new(AdGroupTypeEnum_AdGroupType)
	*p = x
	return p
}

func (x AdGroupTypeEnum_AdGroupType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (AdGroupTypeEnum_AdGroupType) Descriptor() protoreflect.EnumDescriptor {
	return file_google_ads_googleads_v6_enums_ad_group_type_proto_enumTypes[0].Descriptor()
}

func (AdGroupTypeEnum_AdGroupType) Type() protoreflect.EnumType {
	return &file_google_ads_googleads_v6_enums_ad_group_type_proto_enumTypes[0]
}

func (x AdGroupTypeEnum_AdGroupType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use AdGroupTypeEnum_AdGroupType.Descriptor instead.
func (AdGroupTypeEnum_AdGroupType) EnumDescriptor() ([]byte, []int) {
	return file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescGZIP(), []int{0, 0}
}

// Defines types of an ad group, specific to a particular campaign channel
// type. This type drives validations that restrict which entities can be
// added to the ad group.
type AdGroupTypeEnum struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *AdGroupTypeEnum) Reset() {
	*x = AdGroupTypeEnum{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v6_enums_ad_group_type_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AdGroupTypeEnum) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AdGroupTypeEnum) ProtoMessage() {}

func (x *AdGroupTypeEnum) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v6_enums_ad_group_type_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AdGroupTypeEnum.ProtoReflect.Descriptor instead.
func (*AdGroupTypeEnum) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescGZIP(), []int{0}
}

var File_google_ads_googleads_v6_enums_ad_group_type_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDesc = []byte{
	0x0a, 0x31, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x61, 0x64, 0x5f, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x1d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0x9f, 0x03, 0x0a, 0x0f, 0x41, 0x64, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x54, 0x79, 0x70, 0x65,
	0x45, 0x6e, 0x75, 0x6d, 0x22, 0x8b, 0x03, 0x0a, 0x0b, 0x41, 0x64, 0x47, 0x72, 0x6f, 0x75, 0x70,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x0f, 0x0a, 0x0b, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e,
	0x10, 0x01, 0x12, 0x13, 0x0a, 0x0f, 0x53, 0x45, 0x41, 0x52, 0x43, 0x48, 0x5f, 0x53, 0x54, 0x41,
	0x4e, 0x44, 0x41, 0x52, 0x44, 0x10, 0x02, 0x12, 0x14, 0x0a, 0x10, 0x44, 0x49, 0x53, 0x50, 0x4c,
	0x41, 0x59, 0x5f, 0x53, 0x54, 0x41, 0x4e, 0x44, 0x41, 0x52, 0x44, 0x10, 0x03, 0x12, 0x18, 0x0a,
	0x14, 0x53, 0x48, 0x4f, 0x50, 0x50, 0x49, 0x4e, 0x47, 0x5f, 0x50, 0x52, 0x4f, 0x44, 0x55, 0x43,
	0x54, 0x5f, 0x41, 0x44, 0x53, 0x10, 0x04, 0x12, 0x0d, 0x0a, 0x09, 0x48, 0x4f, 0x54, 0x45, 0x4c,
	0x5f, 0x41, 0x44, 0x53, 0x10, 0x06, 0x12, 0x16, 0x0a, 0x12, 0x53, 0x48, 0x4f, 0x50, 0x50, 0x49,
	0x4e, 0x47, 0x5f, 0x53, 0x4d, 0x41, 0x52, 0x54, 0x5f, 0x41, 0x44, 0x53, 0x10, 0x07, 0x12, 0x10,
	0x0a, 0x0c, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x42, 0x55, 0x4d, 0x50, 0x45, 0x52, 0x10, 0x08,
	0x12, 0x1d, 0x0a, 0x19, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x54, 0x52, 0x55, 0x45, 0x5f, 0x56,
	0x49, 0x45, 0x57, 0x5f, 0x49, 0x4e, 0x5f, 0x53, 0x54, 0x52, 0x45, 0x41, 0x4d, 0x10, 0x09, 0x12,
	0x1e, 0x0a, 0x1a, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x54, 0x52, 0x55, 0x45, 0x5f, 0x56, 0x49,
	0x45, 0x57, 0x5f, 0x49, 0x4e, 0x5f, 0x44, 0x49, 0x53, 0x50, 0x4c, 0x41, 0x59, 0x10, 0x0a, 0x12,
	0x21, 0x0a, 0x1d, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x4e, 0x4f, 0x4e, 0x5f, 0x53, 0x4b, 0x49,
	0x50, 0x50, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x49, 0x4e, 0x5f, 0x53, 0x54, 0x52, 0x45, 0x41, 0x4d,
	0x10, 0x0b, 0x12, 0x13, 0x0a, 0x0f, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x4f, 0x55, 0x54, 0x53,
	0x54, 0x52, 0x45, 0x41, 0x4d, 0x10, 0x0c, 0x12, 0x16, 0x0a, 0x12, 0x53, 0x45, 0x41, 0x52, 0x43,
	0x48, 0x5f, 0x44, 0x59, 0x4e, 0x41, 0x4d, 0x49, 0x43, 0x5f, 0x41, 0x44, 0x53, 0x10, 0x0d, 0x12,
	0x23, 0x0a, 0x1f, 0x53, 0x48, 0x4f, 0x50, 0x50, 0x49, 0x4e, 0x47, 0x5f, 0x43, 0x4f, 0x4d, 0x50,
	0x41, 0x52, 0x49, 0x53, 0x4f, 0x4e, 0x5f, 0x4c, 0x49, 0x53, 0x54, 0x49, 0x4e, 0x47, 0x5f, 0x41,
	0x44, 0x53, 0x10, 0x0e, 0x12, 0x16, 0x0a, 0x12, 0x50, 0x52, 0x4f, 0x4d, 0x4f, 0x54, 0x45, 0x44,
	0x5f, 0x48, 0x4f, 0x54, 0x45, 0x4c, 0x5f, 0x41, 0x44, 0x53, 0x10, 0x0f, 0x12, 0x14, 0x0a, 0x10,
	0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x52, 0x45, 0x53, 0x50, 0x4f, 0x4e, 0x53, 0x49, 0x56, 0x45,
	0x10, 0x10, 0x42, 0xe5, 0x01, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x10, 0x41, 0x64, 0x47, 0x72, 0x6f, 0x75,
	0x70, 0x54, 0x79, 0x70, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x42, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f,
	0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2f, 0x76, 0x36, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x3b, 0x65, 0x6e, 0x75, 0x6d, 0x73,
	0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x36,
	0x2e, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xca, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c,
	0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x36,
	0x5c, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xea, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a,
	0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a,
	0x3a, 0x56, 0x36, 0x3a, 0x3a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescData = file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDesc
)

func file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescData)
	})
	return file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDescData
}

var file_google_ads_googleads_v6_enums_ad_group_type_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_ads_googleads_v6_enums_ad_group_type_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v6_enums_ad_group_type_proto_goTypes = []interface{}{
	(AdGroupTypeEnum_AdGroupType)(0), // 0: google.ads.googleads.v6.enums.AdGroupTypeEnum.AdGroupType
	(*AdGroupTypeEnum)(nil),          // 1: google.ads.googleads.v6.enums.AdGroupTypeEnum
}
var file_google_ads_googleads_v6_enums_ad_group_type_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v6_enums_ad_group_type_proto_init() }
func file_google_ads_googleads_v6_enums_ad_group_type_proto_init() {
	if File_google_ads_googleads_v6_enums_ad_group_type_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v6_enums_ad_group_type_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AdGroupTypeEnum); i {
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
			RawDescriptor: file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v6_enums_ad_group_type_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v6_enums_ad_group_type_proto_depIdxs,
		EnumInfos:         file_google_ads_googleads_v6_enums_ad_group_type_proto_enumTypes,
		MessageInfos:      file_google_ads_googleads_v6_enums_ad_group_type_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v6_enums_ad_group_type_proto = out.File
	file_google_ads_googleads_v6_enums_ad_group_type_proto_rawDesc = nil
	file_google_ads_googleads_v6_enums_ad_group_type_proto_goTypes = nil
	file_google_ads_googleads_v6_enums_ad_group_type_proto_depIdxs = nil
}
