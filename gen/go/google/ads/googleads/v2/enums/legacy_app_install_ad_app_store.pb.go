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
// source: google/ads/googleads/v2/enums/legacy_app_install_ad_app_store.proto

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

// App store type in a legacy app install ad.
type LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore int32

const (
	// Not specified.
	LegacyAppInstallAdAppStoreEnum_UNSPECIFIED LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 0
	// Used for return value only. Represents value unknown in this version.
	LegacyAppInstallAdAppStoreEnum_UNKNOWN LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 1
	// Apple iTunes.
	LegacyAppInstallAdAppStoreEnum_APPLE_APP_STORE LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 2
	// Google Play.
	LegacyAppInstallAdAppStoreEnum_GOOGLE_PLAY LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 3
	// Windows Store.
	LegacyAppInstallAdAppStoreEnum_WINDOWS_STORE LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 4
	// Windows Phone Store.
	LegacyAppInstallAdAppStoreEnum_WINDOWS_PHONE_STORE LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 5
	// The app is hosted in a Chinese app store.
	LegacyAppInstallAdAppStoreEnum_CN_APP_STORE LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore = 6
)

// Enum value maps for LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore.
var (
	LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore_name = map[int32]string{
		0: "UNSPECIFIED",
		1: "UNKNOWN",
		2: "APPLE_APP_STORE",
		3: "GOOGLE_PLAY",
		4: "WINDOWS_STORE",
		5: "WINDOWS_PHONE_STORE",
		6: "CN_APP_STORE",
	}
	LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore_value = map[string]int32{
		"UNSPECIFIED":         0,
		"UNKNOWN":             1,
		"APPLE_APP_STORE":     2,
		"GOOGLE_PLAY":         3,
		"WINDOWS_STORE":       4,
		"WINDOWS_PHONE_STORE": 5,
		"CN_APP_STORE":        6,
	}
)

func (x LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore) Enum() *LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore {
	p := new(LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore)
	*p = x
	return p
}

func (x LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore) Descriptor() protoreflect.EnumDescriptor {
	return file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_enumTypes[0].Descriptor()
}

func (LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore) Type() protoreflect.EnumType {
	return &file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_enumTypes[0]
}

func (x LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore.Descriptor instead.
func (LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore) EnumDescriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescGZIP(), []int{0, 0}
}

// Container for enum describing app store type in a legacy app install ad.
type LegacyAppInstallAdAppStoreEnum struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *LegacyAppInstallAdAppStoreEnum) Reset() {
	*x = LegacyAppInstallAdAppStoreEnum{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LegacyAppInstallAdAppStoreEnum) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LegacyAppInstallAdAppStoreEnum) ProtoMessage() {}

func (x *LegacyAppInstallAdAppStoreEnum) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LegacyAppInstallAdAppStoreEnum.ProtoReflect.Descriptor instead.
func (*LegacyAppInstallAdAppStoreEnum) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescGZIP(), []int{0}
}

var File_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDesc = []byte{
	0x0a, 0x43, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x6c, 0x65, 0x67, 0x61, 0x63, 0x79, 0x5f, 0x61, 0x70, 0x70, 0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61,
	0x6c, 0x6c, 0x5f, 0x61, 0x64, 0x5f, 0x61, 0x70, 0x70, 0x5f, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x65,
	0x6e, 0x75, 0x6d, 0x73, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0xc1, 0x01, 0x0a, 0x1e, 0x4c, 0x65, 0x67, 0x61, 0x63, 0x79, 0x41, 0x70, 0x70,
	0x49, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x41, 0x64, 0x41, 0x70, 0x70, 0x53, 0x74, 0x6f, 0x72,
	0x65, 0x45, 0x6e, 0x75, 0x6d, 0x22, 0x9e, 0x01, 0x0a, 0x1a, 0x4c, 0x65, 0x67, 0x61, 0x63, 0x79,
	0x41, 0x70, 0x70, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x41, 0x64, 0x41, 0x70, 0x70, 0x53,
	0x74, 0x6f, 0x72, 0x65, 0x12, 0x0f, 0x0a, 0x0b, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46,
	0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e,
	0x10, 0x01, 0x12, 0x13, 0x0a, 0x0f, 0x41, 0x50, 0x50, 0x4c, 0x45, 0x5f, 0x41, 0x50, 0x50, 0x5f,
	0x53, 0x54, 0x4f, 0x52, 0x45, 0x10, 0x02, 0x12, 0x0f, 0x0a, 0x0b, 0x47, 0x4f, 0x4f, 0x47, 0x4c,
	0x45, 0x5f, 0x50, 0x4c, 0x41, 0x59, 0x10, 0x03, 0x12, 0x11, 0x0a, 0x0d, 0x57, 0x49, 0x4e, 0x44,
	0x4f, 0x57, 0x53, 0x5f, 0x53, 0x54, 0x4f, 0x52, 0x45, 0x10, 0x04, 0x12, 0x17, 0x0a, 0x13, 0x57,
	0x49, 0x4e, 0x44, 0x4f, 0x57, 0x53, 0x5f, 0x50, 0x48, 0x4f, 0x4e, 0x45, 0x5f, 0x53, 0x54, 0x4f,
	0x52, 0x45, 0x10, 0x05, 0x12, 0x10, 0x0a, 0x0c, 0x43, 0x4e, 0x5f, 0x41, 0x50, 0x50, 0x5f, 0x53,
	0x54, 0x4f, 0x52, 0x45, 0x10, 0x06, 0x42, 0xf4, 0x01, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x42, 0x1f, 0x4c, 0x65,
	0x67, 0x61, 0x63, 0x79, 0x41, 0x70, 0x70, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6c, 0x6c, 0x41, 0x64,
	0x41, 0x70, 0x70, 0x53, 0x74, 0x6f, 0x72, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x42, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f,
	0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x3b, 0x65, 0x6e,
	0x75, 0x6d, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x2e, 0x56, 0x32, 0x2e, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xca, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x5c, 0x56, 0x32, 0x5c, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0xea, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41,
	0x64, 0x73, 0x3a, 0x3a, 0x56, 0x32, 0x3a, 0x3a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescData = file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDesc
)

func file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescData)
	})
	return file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDescData
}

var file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_goTypes = []interface{}{
	(LegacyAppInstallAdAppStoreEnum_LegacyAppInstallAdAppStore)(0), // 0: google.ads.googleads.v2.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore
	(*LegacyAppInstallAdAppStoreEnum)(nil),                         // 1: google.ads.googleads.v2.enums.LegacyAppInstallAdAppStoreEnum
}
var file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_init() }
func file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_init() {
	if File_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LegacyAppInstallAdAppStoreEnum); i {
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
			RawDescriptor: file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_depIdxs,
		EnumInfos:         file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_enumTypes,
		MessageInfos:      file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto = out.File
	file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_rawDesc = nil
	file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_goTypes = nil
	file_google_ads_googleads_v2_enums_legacy_app_install_ad_app_store_proto_depIdxs = nil
}
