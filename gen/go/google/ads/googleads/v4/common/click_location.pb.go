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
// source: google/ads/googleads/v4/common/click_location.proto

package common

import (
	proto "github.com/golang/protobuf/proto"
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

// Location criteria associated with a click.
type ClickLocation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The city location criterion associated with the impression.
	City *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=city,proto3" json:"city,omitempty"`
	// The country location criterion associated with the impression.
	Country *wrapperspb.StringValue `protobuf:"bytes,2,opt,name=country,proto3" json:"country,omitempty"`
	// The metro location criterion associated with the impression.
	Metro *wrapperspb.StringValue `protobuf:"bytes,3,opt,name=metro,proto3" json:"metro,omitempty"`
	// The most specific location criterion associated with the impression.
	MostSpecific *wrapperspb.StringValue `protobuf:"bytes,4,opt,name=most_specific,json=mostSpecific,proto3" json:"most_specific,omitempty"`
	// The region location criterion associated with the impression.
	Region *wrapperspb.StringValue `protobuf:"bytes,5,opt,name=region,proto3" json:"region,omitempty"`
}

func (x *ClickLocation) Reset() {
	*x = ClickLocation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_common_click_location_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClickLocation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClickLocation) ProtoMessage() {}

func (x *ClickLocation) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_common_click_location_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClickLocation.ProtoReflect.Descriptor instead.
func (*ClickLocation) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_common_click_location_proto_rawDescGZIP(), []int{0}
}

func (x *ClickLocation) GetCity() *wrapperspb.StringValue {
	if x != nil {
		return x.City
	}
	return nil
}

func (x *ClickLocation) GetCountry() *wrapperspb.StringValue {
	if x != nil {
		return x.Country
	}
	return nil
}

func (x *ClickLocation) GetMetro() *wrapperspb.StringValue {
	if x != nil {
		return x.Metro
	}
	return nil
}

func (x *ClickLocation) GetMostSpecific() *wrapperspb.StringValue {
	if x != nil {
		return x.MostSpecific
	}
	return nil
}

func (x *ClickLocation) GetRegion() *wrapperspb.StringValue {
	if x != nil {
		return x.Region
	}
	return nil
}

var File_google_ads_googleads_v4_common_click_location_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v4_common_click_location_proto_rawDesc = []byte{
	0x0a, 0x33, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2f, 0x63, 0x6c, 0x69, 0x63, 0x6b, 0x5f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0xa6, 0x02, 0x0a, 0x0d, 0x43, 0x6c, 0x69, 0x63, 0x6b, 0x4c, 0x6f, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x30, 0x0a, 0x04, 0x63, 0x69, 0x74, 0x79, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75,
	0x65, 0x52, 0x04, 0x63, 0x69, 0x74, 0x79, 0x12, 0x36, 0x0a, 0x07, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x72, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e,
	0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x07, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x72, 0x79, 0x12,
	0x32, 0x0a, 0x05, 0x6d, 0x65, 0x74, 0x72, 0x6f, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x05, 0x6d, 0x65,
	0x74, 0x72, 0x6f, 0x12, 0x41, 0x0a, 0x0d, 0x6d, 0x6f, 0x73, 0x74, 0x5f, 0x73, 0x70, 0x65, 0x63,
	0x69, 0x66, 0x69, 0x63, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72,
	0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0c, 0x6d, 0x6f, 0x73, 0x74, 0x53, 0x70,
	0x65, 0x63, 0x69, 0x66, 0x69, 0x63, 0x12, 0x34, 0x0a, 0x06, 0x72, 0x65, 0x67, 0x69, 0x6f, 0x6e,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56,
	0x61, 0x6c, 0x75, 0x65, 0x52, 0x06, 0x72, 0x65, 0x67, 0x69, 0x6f, 0x6e, 0x42, 0xed, 0x01, 0x0a,
	0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x42, 0x12, 0x43, 0x6c, 0x69, 0x63, 0x6b, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76,
	0x34, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x3b, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xa2,
	0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41,
	0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x34, 0x2e,
	0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xca, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c,
	0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x34,
	0x5c, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xea, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x3a, 0x3a, 0x56, 0x34, 0x3a, 0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v4_common_click_location_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v4_common_click_location_proto_rawDescData = file_google_ads_googleads_v4_common_click_location_proto_rawDesc
)

func file_google_ads_googleads_v4_common_click_location_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v4_common_click_location_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v4_common_click_location_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v4_common_click_location_proto_rawDescData)
	})
	return file_google_ads_googleads_v4_common_click_location_proto_rawDescData
}

var file_google_ads_googleads_v4_common_click_location_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v4_common_click_location_proto_goTypes = []interface{}{
	(*ClickLocation)(nil),          // 0: google.ads.googleads.v4.common.ClickLocation
	(*wrapperspb.StringValue)(nil), // 1: google.protobuf.StringValue
}
var file_google_ads_googleads_v4_common_click_location_proto_depIdxs = []int32{
	1, // 0: google.ads.googleads.v4.common.ClickLocation.city:type_name -> google.protobuf.StringValue
	1, // 1: google.ads.googleads.v4.common.ClickLocation.country:type_name -> google.protobuf.StringValue
	1, // 2: google.ads.googleads.v4.common.ClickLocation.metro:type_name -> google.protobuf.StringValue
	1, // 3: google.ads.googleads.v4.common.ClickLocation.most_specific:type_name -> google.protobuf.StringValue
	1, // 4: google.ads.googleads.v4.common.ClickLocation.region:type_name -> google.protobuf.StringValue
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v4_common_click_location_proto_init() }
func file_google_ads_googleads_v4_common_click_location_proto_init() {
	if File_google_ads_googleads_v4_common_click_location_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v4_common_click_location_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClickLocation); i {
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
			RawDescriptor: file_google_ads_googleads_v4_common_click_location_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v4_common_click_location_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v4_common_click_location_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v4_common_click_location_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v4_common_click_location_proto = out.File
	file_google_ads_googleads_v4_common_click_location_proto_rawDesc = nil
	file_google_ads_googleads_v4_common_click_location_proto_goTypes = nil
	file_google_ads_googleads_v4_common_click_location_proto_depIdxs = nil
}
