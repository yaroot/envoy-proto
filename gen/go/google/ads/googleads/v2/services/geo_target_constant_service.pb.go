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
// source: google/ads/googleads/v2/services/geo_target_constant_service.proto

package services

import (
	proto "github.com/golang/protobuf/proto"
	resources "google.golang.org/genproto/googleapis/ads/googleads/v2/resources"
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

// Request message for [GeoTargetConstantService.GetGeoTargetConstant][google.ads.googleads.v2.services.GeoTargetConstantService.GetGeoTargetConstant].
type GetGeoTargetConstantRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The resource name of the geo target constant to fetch.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *GetGeoTargetConstantRequest) Reset() {
	*x = GetGeoTargetConstantRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetGeoTargetConstantRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetGeoTargetConstantRequest) ProtoMessage() {}

func (x *GetGeoTargetConstantRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetGeoTargetConstantRequest.ProtoReflect.Descriptor instead.
func (*GetGeoTargetConstantRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP(), []int{0}
}

func (x *GetGeoTargetConstantRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// Request message for
// [GeoTargetConstantService.SuggestGeoTargetConstants][google.ads.googleads.v2.services.GeoTargetConstantService.SuggestGeoTargetConstants].
type SuggestGeoTargetConstantsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// If possible, returned geo targets are translated using this locale. If not,
	// en is used by default. This is also used as a hint for returned geo
	// targets.
	Locale *wrapperspb.StringValue `protobuf:"bytes,3,opt,name=locale,proto3" json:"locale,omitempty"`
	// Returned geo targets are restricted to this country code.
	CountryCode *wrapperspb.StringValue `protobuf:"bytes,5,opt,name=country_code,json=countryCode,proto3" json:"country_code,omitempty"`
	// Required. A selector of geo target constants.
	//
	// Types that are assignable to Query:
	//	*SuggestGeoTargetConstantsRequest_LocationNames_
	//	*SuggestGeoTargetConstantsRequest_GeoTargets_
	Query isSuggestGeoTargetConstantsRequest_Query `protobuf_oneof:"query"`
}

func (x *SuggestGeoTargetConstantsRequest) Reset() {
	*x = SuggestGeoTargetConstantsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestGeoTargetConstantsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestGeoTargetConstantsRequest) ProtoMessage() {}

func (x *SuggestGeoTargetConstantsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestGeoTargetConstantsRequest.ProtoReflect.Descriptor instead.
func (*SuggestGeoTargetConstantsRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP(), []int{1}
}

func (x *SuggestGeoTargetConstantsRequest) GetLocale() *wrapperspb.StringValue {
	if x != nil {
		return x.Locale
	}
	return nil
}

func (x *SuggestGeoTargetConstantsRequest) GetCountryCode() *wrapperspb.StringValue {
	if x != nil {
		return x.CountryCode
	}
	return nil
}

func (m *SuggestGeoTargetConstantsRequest) GetQuery() isSuggestGeoTargetConstantsRequest_Query {
	if m != nil {
		return m.Query
	}
	return nil
}

func (x *SuggestGeoTargetConstantsRequest) GetLocationNames() *SuggestGeoTargetConstantsRequest_LocationNames {
	if x, ok := x.GetQuery().(*SuggestGeoTargetConstantsRequest_LocationNames_); ok {
		return x.LocationNames
	}
	return nil
}

func (x *SuggestGeoTargetConstantsRequest) GetGeoTargets() *SuggestGeoTargetConstantsRequest_GeoTargets {
	if x, ok := x.GetQuery().(*SuggestGeoTargetConstantsRequest_GeoTargets_); ok {
		return x.GeoTargets
	}
	return nil
}

type isSuggestGeoTargetConstantsRequest_Query interface {
	isSuggestGeoTargetConstantsRequest_Query()
}

type SuggestGeoTargetConstantsRequest_LocationNames_ struct {
	// The location names to search by. At most 25 names can be set.
	LocationNames *SuggestGeoTargetConstantsRequest_LocationNames `protobuf:"bytes,1,opt,name=location_names,json=locationNames,proto3,oneof"`
}

type SuggestGeoTargetConstantsRequest_GeoTargets_ struct {
	// The geo target constant resource names to filter by.
	GeoTargets *SuggestGeoTargetConstantsRequest_GeoTargets `protobuf:"bytes,2,opt,name=geo_targets,json=geoTargets,proto3,oneof"`
}

func (*SuggestGeoTargetConstantsRequest_LocationNames_) isSuggestGeoTargetConstantsRequest_Query() {}

func (*SuggestGeoTargetConstantsRequest_GeoTargets_) isSuggestGeoTargetConstantsRequest_Query() {}

// Response message for [GeoTargetConstantService.SuggestGeoTargetConstants][google.ads.googleads.v2.services.GeoTargetConstantService.SuggestGeoTargetConstants].
type SuggestGeoTargetConstantsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Geo target constant suggestions.
	GeoTargetConstantSuggestions []*GeoTargetConstantSuggestion `protobuf:"bytes,1,rep,name=geo_target_constant_suggestions,json=geoTargetConstantSuggestions,proto3" json:"geo_target_constant_suggestions,omitempty"`
}

func (x *SuggestGeoTargetConstantsResponse) Reset() {
	*x = SuggestGeoTargetConstantsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestGeoTargetConstantsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestGeoTargetConstantsResponse) ProtoMessage() {}

func (x *SuggestGeoTargetConstantsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestGeoTargetConstantsResponse.ProtoReflect.Descriptor instead.
func (*SuggestGeoTargetConstantsResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP(), []int{2}
}

func (x *SuggestGeoTargetConstantsResponse) GetGeoTargetConstantSuggestions() []*GeoTargetConstantSuggestion {
	if x != nil {
		return x.GeoTargetConstantSuggestions
	}
	return nil
}

// A geo target constant suggestion.
type GeoTargetConstantSuggestion struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The language this GeoTargetConstantSuggestion is currently translated to.
	// It affects the name of geo target fields. For example, if locale=en, then
	// name=Spain. If locale=es, then name=España. The default locale will be
	// returned if no translation exists for the locale in the request.
	Locale *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=locale,proto3" json:"locale,omitempty"`
	// Approximate user population that will be targeted, rounded to the
	// nearest 100.
	Reach *wrapperspb.Int64Value `protobuf:"bytes,2,opt,name=reach,proto3" json:"reach,omitempty"`
	// If the request searched by location name, this is the location name that
	// matched the geo target.
	SearchTerm *wrapperspb.StringValue `protobuf:"bytes,3,opt,name=search_term,json=searchTerm,proto3" json:"search_term,omitempty"`
	// The GeoTargetConstant result.
	GeoTargetConstant *resources.GeoTargetConstant `protobuf:"bytes,4,opt,name=geo_target_constant,json=geoTargetConstant,proto3" json:"geo_target_constant,omitempty"`
	// The list of parents of the geo target constant.
	GeoTargetConstantParents []*resources.GeoTargetConstant `protobuf:"bytes,5,rep,name=geo_target_constant_parents,json=geoTargetConstantParents,proto3" json:"geo_target_constant_parents,omitempty"`
}

func (x *GeoTargetConstantSuggestion) Reset() {
	*x = GeoTargetConstantSuggestion{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GeoTargetConstantSuggestion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GeoTargetConstantSuggestion) ProtoMessage() {}

func (x *GeoTargetConstantSuggestion) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GeoTargetConstantSuggestion.ProtoReflect.Descriptor instead.
func (*GeoTargetConstantSuggestion) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP(), []int{3}
}

func (x *GeoTargetConstantSuggestion) GetLocale() *wrapperspb.StringValue {
	if x != nil {
		return x.Locale
	}
	return nil
}

func (x *GeoTargetConstantSuggestion) GetReach() *wrapperspb.Int64Value {
	if x != nil {
		return x.Reach
	}
	return nil
}

func (x *GeoTargetConstantSuggestion) GetSearchTerm() *wrapperspb.StringValue {
	if x != nil {
		return x.SearchTerm
	}
	return nil
}

func (x *GeoTargetConstantSuggestion) GetGeoTargetConstant() *resources.GeoTargetConstant {
	if x != nil {
		return x.GeoTargetConstant
	}
	return nil
}

func (x *GeoTargetConstantSuggestion) GetGeoTargetConstantParents() []*resources.GeoTargetConstant {
	if x != nil {
		return x.GeoTargetConstantParents
	}
	return nil
}

// A list of location names.
type SuggestGeoTargetConstantsRequest_LocationNames struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A list of location names.
	Names []*wrapperspb.StringValue `protobuf:"bytes,1,rep,name=names,proto3" json:"names,omitempty"`
}

func (x *SuggestGeoTargetConstantsRequest_LocationNames) Reset() {
	*x = SuggestGeoTargetConstantsRequest_LocationNames{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestGeoTargetConstantsRequest_LocationNames) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestGeoTargetConstantsRequest_LocationNames) ProtoMessage() {}

func (x *SuggestGeoTargetConstantsRequest_LocationNames) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestGeoTargetConstantsRequest_LocationNames.ProtoReflect.Descriptor instead.
func (*SuggestGeoTargetConstantsRequest_LocationNames) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP(), []int{1, 0}
}

func (x *SuggestGeoTargetConstantsRequest_LocationNames) GetNames() []*wrapperspb.StringValue {
	if x != nil {
		return x.Names
	}
	return nil
}

// A list of geo target constant resource names.
type SuggestGeoTargetConstantsRequest_GeoTargets struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A list of geo target constant resource names.
	GeoTargetConstants []*wrapperspb.StringValue `protobuf:"bytes,1,rep,name=geo_target_constants,json=geoTargetConstants,proto3" json:"geo_target_constants,omitempty"`
}

func (x *SuggestGeoTargetConstantsRequest_GeoTargets) Reset() {
	*x = SuggestGeoTargetConstantsRequest_GeoTargets{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestGeoTargetConstantsRequest_GeoTargets) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestGeoTargetConstantsRequest_GeoTargets) ProtoMessage() {}

func (x *SuggestGeoTargetConstantsRequest_GeoTargets) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestGeoTargetConstantsRequest_GeoTargets.ProtoReflect.Descriptor instead.
func (*SuggestGeoTargetConstantsRequest_GeoTargets) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP(), []int{1, 1}
}

func (x *SuggestGeoTargetConstantsRequest_GeoTargets) GetGeoTargetConstants() []*wrapperspb.StringValue {
	if x != nil {
		return x.GeoTargetConstants
	}
	return nil
}

var File_google_ads_googleads_v2_services_geo_target_constant_service_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDesc = []byte{
	0x0a, 0x42, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2f, 0x67, 0x65, 0x6f, 0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x63, 0x6f,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x1a, 0x3b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2f, 0x67, 0x65, 0x6f, 0x5f, 0x74, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68,
	0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x76, 0x0a, 0x1b, 0x47, 0x65, 0x74, 0x47, 0x65, 0x6f,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x57, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x32, 0xe0, 0x41,
	0x02, 0xfa, 0x41, 0x2c, 0x0a, 0x2a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x47,
	0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74,
	0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x22, 0xb2,
	0x04, 0x0a, 0x20, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x34, 0x0a, 0x06, 0x6c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75,
	0x65, 0x52, 0x06, 0x6c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x12, 0x3f, 0x0a, 0x0c, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x72, 0x79, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0b, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x72, 0x79, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x79, 0x0a, 0x0e, 0x6c, 0x6f,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x73, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x50, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x47, 0x65, 0x6f,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4e,
	0x61, 0x6d, 0x65, 0x73, 0x48, 0x00, 0x52, 0x0d, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x4e, 0x61, 0x6d, 0x65, 0x73, 0x12, 0x70, 0x0a, 0x0b, 0x67, 0x65, 0x6f, 0x5f, 0x74, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x4d, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x75,
	0x67, 0x67, 0x65, 0x73, 0x74, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47,
	0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73, 0x48, 0x00, 0x52, 0x0a, 0x67, 0x65, 0x6f,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73, 0x1a, 0x43, 0x0a, 0x0d, 0x4c, 0x6f, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x73, 0x12, 0x32, 0x0a, 0x05, 0x6e, 0x61, 0x6d, 0x65,
	0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67,
	0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x05, 0x6e, 0x61, 0x6d, 0x65, 0x73, 0x1a, 0x5c, 0x0a, 0x0a,
	0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73, 0x12, 0x4e, 0x0a, 0x14, 0x67, 0x65,
	0x6f, 0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e,
	0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e,
	0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x12, 0x67, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x42, 0x07, 0x0a, 0x05, 0x71, 0x75,
	0x65, 0x72, 0x79, 0x22, 0xaa, 0x01, 0x0a, 0x21, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x47,
	0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x84, 0x01, 0x0a, 0x1f, 0x67, 0x65,
	0x6f, 0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e,
	0x74, 0x5f, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x3d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x1c, 0x67, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e,
	0x73, 0x74, 0x61, 0x6e, 0x74, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x22, 0xa0, 0x03, 0x0a, 0x1b, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x34, 0x0a, 0x06, 0x6c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x06,
	0x6c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x12, 0x31, 0x0a, 0x05, 0x72, 0x65, 0x61, 0x63, 0x68, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x49, 0x6e, 0x74, 0x36, 0x34, 0x56, 0x61, 0x6c,
	0x75, 0x65, 0x52, 0x05, 0x72, 0x65, 0x61, 0x63, 0x68, 0x12, 0x3d, 0x0a, 0x0b, 0x73, 0x65, 0x61,
	0x72, 0x63, 0x68, 0x5f, 0x74, 0x65, 0x72, 0x6d, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0a, 0x73, 0x65,
	0x61, 0x72, 0x63, 0x68, 0x54, 0x65, 0x72, 0x6d, 0x12, 0x64, 0x0a, 0x13, 0x67, 0x65, 0x6f, 0x5f,
	0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x52, 0x11, 0x67, 0x65, 0x6f,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x12, 0x73,
	0x0a, 0x1b, 0x67, 0x65, 0x6f, 0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x63, 0x6f, 0x6e,
	0x73, 0x74, 0x61, 0x6e, 0x74, 0x5f, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x73, 0x18, 0x05, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x52, 0x18, 0x67, 0x65, 0x6f, 0x54, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x50, 0x61, 0x72, 0x65,
	0x6e, 0x74, 0x73, 0x32, 0xd9, 0x03, 0x0a, 0x18, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x12, 0xcd, 0x01, 0x0a, 0x14, 0x47, 0x65, 0x74, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x12, 0x3d, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x74,
	0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e,
	0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x76, 0x32, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x6f,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x22, 0x40,
	0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2a, 0x12, 0x28, 0x2f, 0x76, 0x32, 0x2f, 0x7b, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x67, 0x65, 0x6f, 0x54, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x2f, 0x2a, 0x7d,
	0xda, 0x41, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65,
	0x12, 0xcf, 0x01, 0x0a, 0x19, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x47, 0x65, 0x6f, 0x54,
	0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x12, 0x42,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x73, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x43, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x47, 0x65, 0x6f,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x29, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x23, 0x22,
	0x1e, 0x2f, 0x76, 0x32, 0x2f, 0x67, 0x65, 0x6f, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x43, 0x6f,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x73, 0x3a, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x3a,
	0x01, 0x2a, 0x1a, 0x1b, 0xca, 0x41, 0x18, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x42,
	0x84, 0x02, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x42, 0x1d, 0x47, 0x65, 0x6f, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76,
	0x32, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x2e, 0x56, 0x32, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xca, 0x02, 0x20, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x41, 0x64, 0x73, 0x5c, 0x56, 0x32, 0x5c, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xea,
	0x02, 0x24, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x32, 0x3a, 0x3a, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescData = file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDesc
)

func file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescData)
	})
	return file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDescData
}

var file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_google_ads_googleads_v2_services_geo_target_constant_service_proto_goTypes = []interface{}{
	(*GetGeoTargetConstantRequest)(nil),                    // 0: google.ads.googleads.v2.services.GetGeoTargetConstantRequest
	(*SuggestGeoTargetConstantsRequest)(nil),               // 1: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest
	(*SuggestGeoTargetConstantsResponse)(nil),              // 2: google.ads.googleads.v2.services.SuggestGeoTargetConstantsResponse
	(*GeoTargetConstantSuggestion)(nil),                    // 3: google.ads.googleads.v2.services.GeoTargetConstantSuggestion
	(*SuggestGeoTargetConstantsRequest_LocationNames)(nil), // 4: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.LocationNames
	(*SuggestGeoTargetConstantsRequest_GeoTargets)(nil),    // 5: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.GeoTargets
	(*wrapperspb.StringValue)(nil),                         // 6: google.protobuf.StringValue
	(*wrapperspb.Int64Value)(nil),                          // 7: google.protobuf.Int64Value
	(*resources.GeoTargetConstant)(nil),                    // 8: google.ads.googleads.v2.resources.GeoTargetConstant
}
var file_google_ads_googleads_v2_services_geo_target_constant_service_proto_depIdxs = []int32{
	6,  // 0: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.locale:type_name -> google.protobuf.StringValue
	6,  // 1: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.country_code:type_name -> google.protobuf.StringValue
	4,  // 2: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.location_names:type_name -> google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.LocationNames
	5,  // 3: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.geo_targets:type_name -> google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.GeoTargets
	3,  // 4: google.ads.googleads.v2.services.SuggestGeoTargetConstantsResponse.geo_target_constant_suggestions:type_name -> google.ads.googleads.v2.services.GeoTargetConstantSuggestion
	6,  // 5: google.ads.googleads.v2.services.GeoTargetConstantSuggestion.locale:type_name -> google.protobuf.StringValue
	7,  // 6: google.ads.googleads.v2.services.GeoTargetConstantSuggestion.reach:type_name -> google.protobuf.Int64Value
	6,  // 7: google.ads.googleads.v2.services.GeoTargetConstantSuggestion.search_term:type_name -> google.protobuf.StringValue
	8,  // 8: google.ads.googleads.v2.services.GeoTargetConstantSuggestion.geo_target_constant:type_name -> google.ads.googleads.v2.resources.GeoTargetConstant
	8,  // 9: google.ads.googleads.v2.services.GeoTargetConstantSuggestion.geo_target_constant_parents:type_name -> google.ads.googleads.v2.resources.GeoTargetConstant
	6,  // 10: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.LocationNames.names:type_name -> google.protobuf.StringValue
	6,  // 11: google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest.GeoTargets.geo_target_constants:type_name -> google.protobuf.StringValue
	0,  // 12: google.ads.googleads.v2.services.GeoTargetConstantService.GetGeoTargetConstant:input_type -> google.ads.googleads.v2.services.GetGeoTargetConstantRequest
	1,  // 13: google.ads.googleads.v2.services.GeoTargetConstantService.SuggestGeoTargetConstants:input_type -> google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest
	8,  // 14: google.ads.googleads.v2.services.GeoTargetConstantService.GetGeoTargetConstant:output_type -> google.ads.googleads.v2.resources.GeoTargetConstant
	2,  // 15: google.ads.googleads.v2.services.GeoTargetConstantService.SuggestGeoTargetConstants:output_type -> google.ads.googleads.v2.services.SuggestGeoTargetConstantsResponse
	14, // [14:16] is the sub-list for method output_type
	12, // [12:14] is the sub-list for method input_type
	12, // [12:12] is the sub-list for extension type_name
	12, // [12:12] is the sub-list for extension extendee
	0,  // [0:12] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v2_services_geo_target_constant_service_proto_init() }
func file_google_ads_googleads_v2_services_geo_target_constant_service_proto_init() {
	if File_google_ads_googleads_v2_services_geo_target_constant_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetGeoTargetConstantRequest); i {
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
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestGeoTargetConstantsRequest); i {
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
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestGeoTargetConstantsResponse); i {
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
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GeoTargetConstantSuggestion); i {
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
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestGeoTargetConstantsRequest_LocationNames); i {
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
		file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestGeoTargetConstantsRequest_GeoTargets); i {
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
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*SuggestGeoTargetConstantsRequest_LocationNames_)(nil),
		(*SuggestGeoTargetConstantsRequest_GeoTargets_)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_ads_googleads_v2_services_geo_target_constant_service_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v2_services_geo_target_constant_service_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v2_services_geo_target_constant_service_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v2_services_geo_target_constant_service_proto = out.File
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_rawDesc = nil
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_goTypes = nil
	file_google_ads_googleads_v2_services_geo_target_constant_service_proto_depIdxs = nil
}
