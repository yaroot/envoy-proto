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
// source: google/ads/googleads/v2/common/criterion_category_availability.proto

package common

import (
	proto "github.com/golang/protobuf/proto"
	enums "google.golang.org/genproto/googleapis/ads/googleads/v2/enums"
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

// Information of category availability, per advertising channel.
type CriterionCategoryAvailability struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Channel types and subtypes that are available to the category.
	Channel *CriterionCategoryChannelAvailability `protobuf:"bytes,1,opt,name=channel,proto3" json:"channel,omitempty"`
	// Locales that are available to the category for the channel.
	Locale []*CriterionCategoryLocaleAvailability `protobuf:"bytes,2,rep,name=locale,proto3" json:"locale,omitempty"`
}

func (x *CriterionCategoryAvailability) Reset() {
	*x = CriterionCategoryAvailability{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CriterionCategoryAvailability) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CriterionCategoryAvailability) ProtoMessage() {}

func (x *CriterionCategoryAvailability) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CriterionCategoryAvailability.ProtoReflect.Descriptor instead.
func (*CriterionCategoryAvailability) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescGZIP(), []int{0}
}

func (x *CriterionCategoryAvailability) GetChannel() *CriterionCategoryChannelAvailability {
	if x != nil {
		return x.Channel
	}
	return nil
}

func (x *CriterionCategoryAvailability) GetLocale() []*CriterionCategoryLocaleAvailability {
	if x != nil {
		return x.Locale
	}
	return nil
}

// Information of advertising channel type and subtypes a category is available
// in.
type CriterionCategoryChannelAvailability struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Format of the channel availability. Can be ALL_CHANNELS (the rest of the
	// fields will not be set), CHANNEL_TYPE (only advertising_channel_type type
	// will be set, the category is available to all sub types under it) or
	// CHANNEL_TYPE_AND_SUBTYPES (advertising_channel_type,
	// advertising_channel_sub_type, and include_default_channel_sub_type will all
	// be set).
	AvailabilityMode enums.CriterionCategoryChannelAvailabilityModeEnum_CriterionCategoryChannelAvailabilityMode `protobuf:"varint,1,opt,name=availability_mode,json=availabilityMode,proto3,enum=google.ads.googleads.v2.enums.CriterionCategoryChannelAvailabilityModeEnum_CriterionCategoryChannelAvailabilityMode" json:"availability_mode,omitempty"`
	// Channel type the category is available to.
	AdvertisingChannelType enums.AdvertisingChannelTypeEnum_AdvertisingChannelType `protobuf:"varint,2,opt,name=advertising_channel_type,json=advertisingChannelType,proto3,enum=google.ads.googleads.v2.enums.AdvertisingChannelTypeEnum_AdvertisingChannelType" json:"advertising_channel_type,omitempty"`
	// Channel subtypes under the channel type the category is available to.
	AdvertisingChannelSubType []enums.AdvertisingChannelSubTypeEnum_AdvertisingChannelSubType `protobuf:"varint,3,rep,packed,name=advertising_channel_sub_type,json=advertisingChannelSubType,proto3,enum=google.ads.googleads.v2.enums.AdvertisingChannelSubTypeEnum_AdvertisingChannelSubType" json:"advertising_channel_sub_type,omitempty"`
	// Whether default channel sub type is included. For example,
	// advertising_channel_type being DISPLAY and include_default_channel_sub_type
	// being false means that the default display campaign where channel sub type
	// is not set is not included in this availability configuration.
	IncludeDefaultChannelSubType *wrapperspb.BoolValue `protobuf:"bytes,4,opt,name=include_default_channel_sub_type,json=includeDefaultChannelSubType,proto3" json:"include_default_channel_sub_type,omitempty"`
}

func (x *CriterionCategoryChannelAvailability) Reset() {
	*x = CriterionCategoryChannelAvailability{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CriterionCategoryChannelAvailability) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CriterionCategoryChannelAvailability) ProtoMessage() {}

func (x *CriterionCategoryChannelAvailability) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CriterionCategoryChannelAvailability.ProtoReflect.Descriptor instead.
func (*CriterionCategoryChannelAvailability) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescGZIP(), []int{1}
}

func (x *CriterionCategoryChannelAvailability) GetAvailabilityMode() enums.CriterionCategoryChannelAvailabilityModeEnum_CriterionCategoryChannelAvailabilityMode {
	if x != nil {
		return x.AvailabilityMode
	}
	return enums.CriterionCategoryChannelAvailabilityModeEnum_UNSPECIFIED
}

func (x *CriterionCategoryChannelAvailability) GetAdvertisingChannelType() enums.AdvertisingChannelTypeEnum_AdvertisingChannelType {
	if x != nil {
		return x.AdvertisingChannelType
	}
	return enums.AdvertisingChannelTypeEnum_UNSPECIFIED
}

func (x *CriterionCategoryChannelAvailability) GetAdvertisingChannelSubType() []enums.AdvertisingChannelSubTypeEnum_AdvertisingChannelSubType {
	if x != nil {
		return x.AdvertisingChannelSubType
	}
	return nil
}

func (x *CriterionCategoryChannelAvailability) GetIncludeDefaultChannelSubType() *wrapperspb.BoolValue {
	if x != nil {
		return x.IncludeDefaultChannelSubType
	}
	return nil
}

// Information about which locales a category is available in.
type CriterionCategoryLocaleAvailability struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
	// language will be empty), COUNTRY (only country will be set), LANGUAGE (only
	// language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
	// be set).
	AvailabilityMode enums.CriterionCategoryLocaleAvailabilityModeEnum_CriterionCategoryLocaleAvailabilityMode `protobuf:"varint,1,opt,name=availability_mode,json=availabilityMode,proto3,enum=google.ads.googleads.v2.enums.CriterionCategoryLocaleAvailabilityModeEnum_CriterionCategoryLocaleAvailabilityMode" json:"availability_mode,omitempty"`
	// Code of the country.
	CountryCode *wrapperspb.StringValue `protobuf:"bytes,2,opt,name=country_code,json=countryCode,proto3" json:"country_code,omitempty"`
	// Code of the language.
	LanguageCode *wrapperspb.StringValue `protobuf:"bytes,3,opt,name=language_code,json=languageCode,proto3" json:"language_code,omitempty"`
}

func (x *CriterionCategoryLocaleAvailability) Reset() {
	*x = CriterionCategoryLocaleAvailability{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CriterionCategoryLocaleAvailability) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CriterionCategoryLocaleAvailability) ProtoMessage() {}

func (x *CriterionCategoryLocaleAvailability) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CriterionCategoryLocaleAvailability.ProtoReflect.Descriptor instead.
func (*CriterionCategoryLocaleAvailability) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescGZIP(), []int{2}
}

func (x *CriterionCategoryLocaleAvailability) GetAvailabilityMode() enums.CriterionCategoryLocaleAvailabilityModeEnum_CriterionCategoryLocaleAvailabilityMode {
	if x != nil {
		return x.AvailabilityMode
	}
	return enums.CriterionCategoryLocaleAvailabilityModeEnum_UNSPECIFIED
}

func (x *CriterionCategoryLocaleAvailability) GetCountryCode() *wrapperspb.StringValue {
	if x != nil {
		return x.CountryCode
	}
	return nil
}

func (x *CriterionCategoryLocaleAvailability) GetLanguageCode() *wrapperspb.StringValue {
	if x != nil {
		return x.LanguageCode
	}
	return nil
}

var File_google_ads_googleads_v2_common_criterion_category_availability_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDesc = []byte{
	0x0a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2f, 0x63, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x61, 0x74, 0x65, 0x67,
	0x6f, 0x72, 0x79, 0x5f, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x1a, 0x40, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f,
	0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x61, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73, 0x69, 0x6e,
	0x67, 0x5f, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x5f, 0x73, 0x75, 0x62, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x3c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76,
	0x32, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x61, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73,
	0x69, 0x6e, 0x67, 0x5f, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x50, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x32, 0x2f,
	0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x63, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f, 0x6e, 0x5f,
	0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x5f, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c,
	0x5f, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x5f, 0x6d, 0x6f,
	0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x4f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76,
	0x32, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x63, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f,
	0x6e, 0x5f, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x5f, 0x6c, 0x6f, 0x63, 0x61, 0x6c,
	0x65, 0x5f, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x5f, 0x6d,
	0x6f, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70,
	0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xdc, 0x01, 0x0a, 0x1d, 0x43, 0x72, 0x69, 0x74,
	0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x41, 0x76, 0x61,
	0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x5e, 0x0a, 0x07, 0x63, 0x68, 0x61,
	0x6e, 0x6e, 0x65, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x44, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2e, 0x76, 0x32, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x43, 0x72, 0x69, 0x74,
	0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x43, 0x68, 0x61,
	0x6e, 0x6e, 0x65, 0x6c, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79,
	0x52, 0x07, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x12, 0x5b, 0x0a, 0x06, 0x6c, 0x6f, 0x63,
	0x61, 0x6c, 0x65, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x43, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x32, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x43, 0x72, 0x69, 0x74, 0x65,
	0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x4c, 0x6f, 0x63, 0x61,
	0x6c, 0x65, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x52, 0x06,
	0x6c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x22, 0xd5, 0x04, 0x0a, 0x24, 0x43, 0x72, 0x69, 0x74, 0x65,
	0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x43, 0x68, 0x61, 0x6e,
	0x6e, 0x65, 0x6c, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x12,
	0xa1, 0x01, 0x0a, 0x11, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79,
	0x5f, 0x6d, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x74, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x43, 0x72, 0x69, 0x74,
	0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x43, 0x68, 0x61,
	0x6e, 0x6e, 0x65, 0x6c, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79,
	0x4d, 0x6f, 0x64, 0x65, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69,
	0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x43, 0x68, 0x61, 0x6e, 0x6e, 0x65,
	0x6c, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x4d, 0x6f, 0x64,
	0x65, 0x52, 0x10, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x4d,
	0x6f, 0x64, 0x65, 0x12, 0x8a, 0x01, 0x0a, 0x18, 0x61, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73,
	0x69, 0x6e, 0x67, 0x5f, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x50, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32,
	0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x41, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73, 0x69,
	0x6e, 0x67, 0x43, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65, 0x45, 0x6e, 0x75,
	0x6d, 0x2e, 0x41, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73, 0x69, 0x6e, 0x67, 0x43, 0x68, 0x61,
	0x6e, 0x6e, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65, 0x52, 0x16, 0x61, 0x64, 0x76, 0x65, 0x72, 0x74,
	0x69, 0x73, 0x69, 0x6e, 0x67, 0x43, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x97, 0x01, 0x0a, 0x1c, 0x61, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73, 0x69, 0x6e, 0x67,
	0x5f, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x5f, 0x73, 0x75, 0x62, 0x5f, 0x74, 0x79, 0x70,
	0x65, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0e, 0x32, 0x56, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x32, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x41, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73,
	0x69, 0x6e, 0x67, 0x43, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x53, 0x75, 0x62, 0x54, 0x79, 0x70,
	0x65, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x41, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73, 0x69, 0x6e,
	0x67, 0x43, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x53, 0x75, 0x62, 0x54, 0x79, 0x70, 0x65, 0x52,
	0x19, 0x61, 0x64, 0x76, 0x65, 0x72, 0x74, 0x69, 0x73, 0x69, 0x6e, 0x67, 0x43, 0x68, 0x61, 0x6e,
	0x6e, 0x65, 0x6c, 0x53, 0x75, 0x62, 0x54, 0x79, 0x70, 0x65, 0x12, 0x62, 0x0a, 0x20, 0x69, 0x6e,
	0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x5f, 0x63, 0x68,
	0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x5f, 0x73, 0x75, 0x62, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65,
	0x52, 0x1c, 0x69, 0x6e, 0x63, 0x6c, 0x75, 0x64, 0x65, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74,
	0x43, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c, 0x53, 0x75, 0x62, 0x54, 0x79, 0x70, 0x65, 0x22, 0xcb,
	0x02, 0x0a, 0x23, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65,
	0x67, 0x6f, 0x72, 0x79, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61,
	0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x9f, 0x01, 0x0a, 0x11, 0x61, 0x76, 0x61, 0x69, 0x6c,
	0x61, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x5f, 0x6d, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x72, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x2e, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65,
	0x67, 0x6f, 0x72, 0x79, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61,
	0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x4d, 0x6f, 0x64, 0x65, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x43,
	0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79,
	0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69,
	0x74, 0x79, 0x4d, 0x6f, 0x64, 0x65, 0x52, 0x10, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69,
	0x6c, 0x69, 0x74, 0x79, 0x4d, 0x6f, 0x64, 0x65, 0x12, 0x3f, 0x0a, 0x0c, 0x63, 0x6f, 0x75, 0x6e,
	0x74, 0x72, 0x79, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0b, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x72, 0x79, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x41, 0x0a, 0x0d, 0x6c, 0x61, 0x6e,
	0x67, 0x75, 0x61, 0x67, 0x65, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0c,
	0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x43, 0x6f, 0x64, 0x65, 0x42, 0xfd, 0x01, 0x0a,
	0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x42, 0x22, 0x43, 0x72, 0x69, 0x74, 0x65, 0x72, 0x69, 0x6f, 0x6e, 0x43, 0x61,
	0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x69, 0x6c, 0x69,
	0x74, 0x79, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
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
	file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescData = file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDesc
)

func file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescData)
	})
	return file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDescData
}

var file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_google_ads_googleads_v2_common_criterion_category_availability_proto_goTypes = []interface{}{
	(*CriterionCategoryAvailability)(nil),                                                            // 0: google.ads.googleads.v2.common.CriterionCategoryAvailability
	(*CriterionCategoryChannelAvailability)(nil),                                                     // 1: google.ads.googleads.v2.common.CriterionCategoryChannelAvailability
	(*CriterionCategoryLocaleAvailability)(nil),                                                      // 2: google.ads.googleads.v2.common.CriterionCategoryLocaleAvailability
	(enums.CriterionCategoryChannelAvailabilityModeEnum_CriterionCategoryChannelAvailabilityMode)(0), // 3: google.ads.googleads.v2.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode
	(enums.AdvertisingChannelTypeEnum_AdvertisingChannelType)(0),                                     // 4: google.ads.googleads.v2.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType
	(enums.AdvertisingChannelSubTypeEnum_AdvertisingChannelSubType)(0),                               // 5: google.ads.googleads.v2.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType
	(*wrapperspb.BoolValue)(nil),                                                                     // 6: google.protobuf.BoolValue
	(enums.CriterionCategoryLocaleAvailabilityModeEnum_CriterionCategoryLocaleAvailabilityMode)(0),   // 7: google.ads.googleads.v2.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode
	(*wrapperspb.StringValue)(nil),                                                                   // 8: google.protobuf.StringValue
}
var file_google_ads_googleads_v2_common_criterion_category_availability_proto_depIdxs = []int32{
	1, // 0: google.ads.googleads.v2.common.CriterionCategoryAvailability.channel:type_name -> google.ads.googleads.v2.common.CriterionCategoryChannelAvailability
	2, // 1: google.ads.googleads.v2.common.CriterionCategoryAvailability.locale:type_name -> google.ads.googleads.v2.common.CriterionCategoryLocaleAvailability
	3, // 2: google.ads.googleads.v2.common.CriterionCategoryChannelAvailability.availability_mode:type_name -> google.ads.googleads.v2.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode
	4, // 3: google.ads.googleads.v2.common.CriterionCategoryChannelAvailability.advertising_channel_type:type_name -> google.ads.googleads.v2.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType
	5, // 4: google.ads.googleads.v2.common.CriterionCategoryChannelAvailability.advertising_channel_sub_type:type_name -> google.ads.googleads.v2.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType
	6, // 5: google.ads.googleads.v2.common.CriterionCategoryChannelAvailability.include_default_channel_sub_type:type_name -> google.protobuf.BoolValue
	7, // 6: google.ads.googleads.v2.common.CriterionCategoryLocaleAvailability.availability_mode:type_name -> google.ads.googleads.v2.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode
	8, // 7: google.ads.googleads.v2.common.CriterionCategoryLocaleAvailability.country_code:type_name -> google.protobuf.StringValue
	8, // 8: google.ads.googleads.v2.common.CriterionCategoryLocaleAvailability.language_code:type_name -> google.protobuf.StringValue
	9, // [9:9] is the sub-list for method output_type
	9, // [9:9] is the sub-list for method input_type
	9, // [9:9] is the sub-list for extension type_name
	9, // [9:9] is the sub-list for extension extendee
	0, // [0:9] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v2_common_criterion_category_availability_proto_init() }
func file_google_ads_googleads_v2_common_criterion_category_availability_proto_init() {
	if File_google_ads_googleads_v2_common_criterion_category_availability_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CriterionCategoryAvailability); i {
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
		file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CriterionCategoryChannelAvailability); i {
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
		file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CriterionCategoryLocaleAvailability); i {
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
			RawDescriptor: file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v2_common_criterion_category_availability_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v2_common_criterion_category_availability_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v2_common_criterion_category_availability_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v2_common_criterion_category_availability_proto = out.File
	file_google_ads_googleads_v2_common_criterion_category_availability_proto_rawDesc = nil
	file_google_ads_googleads_v2_common_criterion_category_availability_proto_goTypes = nil
	file_google_ads_googleads_v2_common_criterion_category_availability_proto_depIdxs = nil
}
