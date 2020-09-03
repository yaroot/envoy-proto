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
// source: google/ads/googleads/v4/common/ad_asset.proto

package common

import (
	proto "github.com/golang/protobuf/proto"
	enums "google.golang.org/genproto/googleapis/ads/googleads/v4/enums"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
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

// A text asset used inside an ad.
type AdTextAsset struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Asset text.
	Text *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	// The pinned field of the asset. This restricts the asset to only serve
	// within this field. Multiple assets can be pinned to the same field. An
	// asset that is unpinned or pinned to a different field will not serve in a
	// field where some other asset has been pinned.
	PinnedField enums.ServedAssetFieldTypeEnum_ServedAssetFieldType `protobuf:"varint,2,opt,name=pinned_field,json=pinnedField,proto3,enum=google.ads.googleads.v4.enums.ServedAssetFieldTypeEnum_ServedAssetFieldType" json:"pinned_field,omitempty"`
}

func (x *AdTextAsset) Reset() {
	*x = AdTextAsset{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AdTextAsset) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AdTextAsset) ProtoMessage() {}

func (x *AdTextAsset) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AdTextAsset.ProtoReflect.Descriptor instead.
func (*AdTextAsset) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_common_ad_asset_proto_rawDescGZIP(), []int{0}
}

func (x *AdTextAsset) GetText() *wrapperspb.StringValue {
	if x != nil {
		return x.Text
	}
	return nil
}

func (x *AdTextAsset) GetPinnedField() enums.ServedAssetFieldTypeEnum_ServedAssetFieldType {
	if x != nil {
		return x.PinnedField
	}
	return enums.ServedAssetFieldTypeEnum_UNSPECIFIED
}

// An image asset used inside an ad.
type AdImageAsset struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The Asset resource name of this image.
	Asset *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=asset,proto3" json:"asset,omitempty"`
}

func (x *AdImageAsset) Reset() {
	*x = AdImageAsset{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AdImageAsset) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AdImageAsset) ProtoMessage() {}

func (x *AdImageAsset) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AdImageAsset.ProtoReflect.Descriptor instead.
func (*AdImageAsset) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_common_ad_asset_proto_rawDescGZIP(), []int{1}
}

func (x *AdImageAsset) GetAsset() *wrapperspb.StringValue {
	if x != nil {
		return x.Asset
	}
	return nil
}

// A video asset used inside an ad.
type AdVideoAsset struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The Asset resource name of this video.
	Asset *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=asset,proto3" json:"asset,omitempty"`
}

func (x *AdVideoAsset) Reset() {
	*x = AdVideoAsset{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AdVideoAsset) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AdVideoAsset) ProtoMessage() {}

func (x *AdVideoAsset) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AdVideoAsset.ProtoReflect.Descriptor instead.
func (*AdVideoAsset) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_common_ad_asset_proto_rawDescGZIP(), []int{2}
}

func (x *AdVideoAsset) GetAsset() *wrapperspb.StringValue {
	if x != nil {
		return x.Asset
	}
	return nil
}

// A media bundle asset used inside an ad.
type AdMediaBundleAsset struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The Asset resource name of this media bundle.
	Asset *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=asset,proto3" json:"asset,omitempty"`
}

func (x *AdMediaBundleAsset) Reset() {
	*x = AdMediaBundleAsset{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AdMediaBundleAsset) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AdMediaBundleAsset) ProtoMessage() {}

func (x *AdMediaBundleAsset) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AdMediaBundleAsset.ProtoReflect.Descriptor instead.
func (*AdMediaBundleAsset) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_common_ad_asset_proto_rawDescGZIP(), []int{3}
}

func (x *AdMediaBundleAsset) GetAsset() *wrapperspb.StringValue {
	if x != nil {
		return x.Asset
	}
	return nil
}

var File_google_ads_googleads_v4_common_ad_asset_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v4_common_ad_asset_proto_rawDesc = []byte{
	0x0a, 0x2d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2f, 0x61, 0x64, 0x5f, 0x61, 0x73, 0x73, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x1a,
	0x3b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x73,
	0x65, 0x72, 0x76, 0x65, 0x64, 0x5f, 0x61, 0x73, 0x73, 0x65, 0x74, 0x5f, 0x66, 0x69, 0x65, 0x6c,
	0x64, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72,
	0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xb0, 0x01, 0x0a, 0x0b, 0x41,
	0x64, 0x54, 0x65, 0x78, 0x74, 0x41, 0x73, 0x73, 0x65, 0x74, 0x12, 0x30, 0x0a, 0x04, 0x74, 0x65,
	0x78, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e,
	0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x12, 0x6f, 0x0a, 0x0c,
	0x70, 0x69, 0x6e, 0x6e, 0x65, 0x64, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x4c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x65, 0x64, 0x41, 0x73, 0x73, 0x65, 0x74, 0x46, 0x69,
	0x65, 0x6c, 0x64, 0x54, 0x79, 0x70, 0x65, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x53, 0x65, 0x72, 0x76,
	0x65, 0x64, 0x41, 0x73, 0x73, 0x65, 0x74, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x54, 0x79, 0x70, 0x65,
	0x52, 0x0b, 0x70, 0x69, 0x6e, 0x6e, 0x65, 0x64, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x22, 0x42, 0x0a,
	0x0c, 0x41, 0x64, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x41, 0x73, 0x73, 0x65, 0x74, 0x12, 0x32, 0x0a,
	0x05, 0x61, 0x73, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53,
	0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x05, 0x61, 0x73, 0x73, 0x65,
	0x74, 0x22, 0x42, 0x0a, 0x0c, 0x41, 0x64, 0x56, 0x69, 0x64, 0x65, 0x6f, 0x41, 0x73, 0x73, 0x65,
	0x74, 0x12, 0x32, 0x0a, 0x05, 0x61, 0x73, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x05,
	0x61, 0x73, 0x73, 0x65, 0x74, 0x22, 0x48, 0x0a, 0x12, 0x41, 0x64, 0x4d, 0x65, 0x64, 0x69, 0x61,
	0x42, 0x75, 0x6e, 0x64, 0x6c, 0x65, 0x41, 0x73, 0x73, 0x65, 0x74, 0x12, 0x32, 0x0a, 0x05, 0x61,
	0x73, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72,
	0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x05, 0x61, 0x73, 0x73, 0x65, 0x74, 0x42,
	0xe7, 0x01, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x42, 0x0c, 0x41, 0x64, 0x41, 0x73, 0x73, 0x65, 0x74, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67,
	0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64,
	0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x3b, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xa2, 0x02, 0x03, 0x47,
	0x41, 0x41, 0xaa, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x34, 0x2e, 0x43, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0xca, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73,
	0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x34, 0x5c, 0x43, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0xea, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41,
	0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56,
	0x34, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_google_ads_googleads_v4_common_ad_asset_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v4_common_ad_asset_proto_rawDescData = file_google_ads_googleads_v4_common_ad_asset_proto_rawDesc
)

func file_google_ads_googleads_v4_common_ad_asset_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v4_common_ad_asset_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v4_common_ad_asset_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v4_common_ad_asset_proto_rawDescData)
	})
	return file_google_ads_googleads_v4_common_ad_asset_proto_rawDescData
}

var file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_google_ads_googleads_v4_common_ad_asset_proto_goTypes = []interface{}{
	(*AdTextAsset)(nil),                                      // 0: google.ads.googleads.v4.common.AdTextAsset
	(*AdImageAsset)(nil),                                     // 1: google.ads.googleads.v4.common.AdImageAsset
	(*AdVideoAsset)(nil),                                     // 2: google.ads.googleads.v4.common.AdVideoAsset
	(*AdMediaBundleAsset)(nil),                               // 3: google.ads.googleads.v4.common.AdMediaBundleAsset
	(*wrapperspb.StringValue)(nil),                           // 4: google.protobuf.StringValue
	(enums.ServedAssetFieldTypeEnum_ServedAssetFieldType)(0), // 5: google.ads.googleads.v4.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType
}
var file_google_ads_googleads_v4_common_ad_asset_proto_depIdxs = []int32{
	4, // 0: google.ads.googleads.v4.common.AdTextAsset.text:type_name -> google.protobuf.StringValue
	5, // 1: google.ads.googleads.v4.common.AdTextAsset.pinned_field:type_name -> google.ads.googleads.v4.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType
	4, // 2: google.ads.googleads.v4.common.AdImageAsset.asset:type_name -> google.protobuf.StringValue
	4, // 3: google.ads.googleads.v4.common.AdVideoAsset.asset:type_name -> google.protobuf.StringValue
	4, // 4: google.ads.googleads.v4.common.AdMediaBundleAsset.asset:type_name -> google.protobuf.StringValue
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v4_common_ad_asset_proto_init() }
func file_google_ads_googleads_v4_common_ad_asset_proto_init() {
	if File_google_ads_googleads_v4_common_ad_asset_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AdTextAsset); i {
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
		file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AdImageAsset); i {
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
		file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AdVideoAsset); i {
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
		file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AdMediaBundleAsset); i {
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
			RawDescriptor: file_google_ads_googleads_v4_common_ad_asset_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v4_common_ad_asset_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v4_common_ad_asset_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v4_common_ad_asset_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v4_common_ad_asset_proto = out.File
	file_google_ads_googleads_v4_common_ad_asset_proto_rawDesc = nil
	file_google_ads_googleads_v4_common_ad_asset_proto_goTypes = nil
	file_google_ads_googleads_v4_common_ad_asset_proto_depIdxs = nil
}
