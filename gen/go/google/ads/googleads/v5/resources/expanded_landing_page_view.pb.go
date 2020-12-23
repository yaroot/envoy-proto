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
// source: google/ads/googleads/v5/resources/expanded_landing_page_view.proto

package resources

import (
	proto "github.com/golang/protobuf/proto"
	wrappers "github.com/golang/protobuf/ptypes/wrappers"
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

// A landing page view with metrics aggregated at the expanded final URL
// level.
type ExpandedLandingPageView struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The resource name of the expanded landing page view.
	// Expanded landing page view resource names have the form:
	//
	// `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
	// Output only. The final URL that clicks are directed to.
	ExpandedFinalUrl *wrappers.StringValue `protobuf:"bytes,2,opt,name=expanded_final_url,json=expandedFinalUrl,proto3" json:"expanded_final_url,omitempty"`
}

func (x *ExpandedLandingPageView) Reset() {
	*x = ExpandedLandingPageView{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ExpandedLandingPageView) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ExpandedLandingPageView) ProtoMessage() {}

func (x *ExpandedLandingPageView) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ExpandedLandingPageView.ProtoReflect.Descriptor instead.
func (*ExpandedLandingPageView) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescGZIP(), []int{0}
}

func (x *ExpandedLandingPageView) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

func (x *ExpandedLandingPageView) GetExpandedFinalUrl() *wrappers.StringValue {
	if x != nil {
		return x.ExpandedFinalUrl
	}
	return nil
}

var File_google_ads_googleads_v5_resources_expanded_landing_page_view_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDesc = []byte{
	0x0a, 0x42, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x35, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x73, 0x2f, 0x65, 0x78, 0x70, 0x61, 0x6e, 0x64, 0x65, 0x64, 0x5f, 0x6c, 0x61, 0x6e,
	0x64, 0x69, 0x6e, 0x67, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x76, 0x69, 0x65, 0x77, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x21, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x35, 0x2e, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69,
	0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0xcd, 0x02, 0x0a, 0x17, 0x45, 0x78, 0x70, 0x61, 0x6e, 0x64, 0x65, 0x64, 0x4c, 0x61,
	0x6e, 0x64, 0x69, 0x6e, 0x67, 0x50, 0x61, 0x67, 0x65, 0x56, 0x69, 0x65, 0x77, 0x12, 0x5d, 0x0a,
	0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x38, 0xe0, 0x41, 0x03, 0xfa, 0x41, 0x32, 0x0a, 0x30, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70,
	0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x45, 0x78, 0x70, 0x61, 0x6e, 0x64, 0x65, 0x64, 0x4c,
	0x61, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x50, 0x61, 0x67, 0x65, 0x56, 0x69, 0x65, 0x77, 0x52, 0x0c,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x4f, 0x0a, 0x12,
	0x65, 0x78, 0x70, 0x61, 0x6e, 0x64, 0x65, 0x64, 0x5f, 0x66, 0x69, 0x6e, 0x61, 0x6c, 0x5f, 0x75,
	0x72, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e,
	0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x10, 0x65, 0x78, 0x70,
	0x61, 0x6e, 0x64, 0x65, 0x64, 0x46, 0x69, 0x6e, 0x61, 0x6c, 0x55, 0x72, 0x6c, 0x3a, 0x81, 0x01,
	0xea, 0x41, 0x7e, 0x0a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x45, 0x78,
	0x70, 0x61, 0x6e, 0x64, 0x65, 0x64, 0x4c, 0x61, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x50, 0x61, 0x67,
	0x65, 0x56, 0x69, 0x65, 0x77, 0x12, 0x4a, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73,
	0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x7d, 0x2f, 0x65, 0x78, 0x70, 0x61,
	0x6e, 0x64, 0x65, 0x64, 0x4c, 0x61, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x50, 0x61, 0x67, 0x65, 0x56,
	0x69, 0x65, 0x77, 0x73, 0x2f, 0x7b, 0x65, 0x78, 0x70, 0x61, 0x6e, 0x64, 0x65, 0x64, 0x5f, 0x6c,
	0x61, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x76, 0x69, 0x65, 0x77,
	0x7d, 0x42, 0x89, 0x02, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x35, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x42, 0x1c, 0x45, 0x78, 0x70,
	0x61, 0x6e, 0x64, 0x65, 0x64, 0x4c, 0x61, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x50, 0x61, 0x67, 0x65,
	0x56, 0x69, 0x65, 0x77, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4a, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67,
	0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70,
	0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2f, 0x76, 0x35, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x3b, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x21,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x35, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x73, 0xca, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x35, 0x5c, 0x52, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0xea, 0x02, 0x25, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a,
	0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a,
	0x56, 0x35, 0x3a, 0x3a, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescData = file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDesc
)

func file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescData)
	})
	return file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDescData
}

var file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_goTypes = []interface{}{
	(*ExpandedLandingPageView)(nil), // 0: google.ads.googleads.v5.resources.ExpandedLandingPageView
	(*wrappers.StringValue)(nil),    // 1: google.protobuf.StringValue
}
var file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_depIdxs = []int32{
	1, // 0: google.ads.googleads.v5.resources.ExpandedLandingPageView.expanded_final_url:type_name -> google.protobuf.StringValue
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_init() }
func file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_init() {
	if File_google_ads_googleads_v5_resources_expanded_landing_page_view_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ExpandedLandingPageView); i {
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
			RawDescriptor: file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v5_resources_expanded_landing_page_view_proto = out.File
	file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_rawDesc = nil
	file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_goTypes = nil
	file_google_ads_googleads_v5_resources_expanded_landing_page_view_proto_depIdxs = nil
}
