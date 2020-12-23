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
// source: google/ads/googleads/v6/common/keyword_plan_common.proto

package common

import (
	proto "github.com/golang/protobuf/proto"
	enums "google.golang.org/genproto/googleapis/ads/googleads/v6/enums"
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

// Historical metrics specific to the targeting options selected.
// Targeting options include geographies, network, etc.
// Refer to https://support.google.com/google-ads/answer/3022575 for more
// details.
type KeywordPlanHistoricalMetrics struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Approximate number of monthly searches on this query averaged
	// for the past 12 months.
	AvgMonthlySearches *int64 `protobuf:"varint,7,opt,name=avg_monthly_searches,json=avgMonthlySearches,proto3,oneof" json:"avg_monthly_searches,omitempty"`
	// Approximate number of searches on this query for the past twelve months.
	MonthlySearchVolumes []*MonthlySearchVolume `protobuf:"bytes,6,rep,name=monthly_search_volumes,json=monthlySearchVolumes,proto3" json:"monthly_search_volumes,omitempty"`
	// The competition level for the query.
	Competition enums.KeywordPlanCompetitionLevelEnum_KeywordPlanCompetitionLevel `protobuf:"varint,2,opt,name=competition,proto3,enum=google.ads.googleads.v6.enums.KeywordPlanCompetitionLevelEnum_KeywordPlanCompetitionLevel" json:"competition,omitempty"`
	// The competition index for the query in the range [0, 100].
	// Shows how competitive ad placement is for a keyword.
	// The level of competition from 0-100 is determined by the number of ad slots
	// filled divided by the total number of ad slots available. If not enough
	// data is available, null is returned.
	CompetitionIndex *int64 `protobuf:"varint,8,opt,name=competition_index,json=competitionIndex,proto3,oneof" json:"competition_index,omitempty"`
	// Top of page bid low range (20th percentile) in micros for the keyword.
	LowTopOfPageBidMicros *int64 `protobuf:"varint,9,opt,name=low_top_of_page_bid_micros,json=lowTopOfPageBidMicros,proto3,oneof" json:"low_top_of_page_bid_micros,omitempty"`
	// Top of page bid high range (80th percentile) in micros for the keyword.
	HighTopOfPageBidMicros *int64 `protobuf:"varint,10,opt,name=high_top_of_page_bid_micros,json=highTopOfPageBidMicros,proto3,oneof" json:"high_top_of_page_bid_micros,omitempty"`
}

func (x *KeywordPlanHistoricalMetrics) Reset() {
	*x = KeywordPlanHistoricalMetrics{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *KeywordPlanHistoricalMetrics) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*KeywordPlanHistoricalMetrics) ProtoMessage() {}

func (x *KeywordPlanHistoricalMetrics) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use KeywordPlanHistoricalMetrics.ProtoReflect.Descriptor instead.
func (*KeywordPlanHistoricalMetrics) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescGZIP(), []int{0}
}

func (x *KeywordPlanHistoricalMetrics) GetAvgMonthlySearches() int64 {
	if x != nil && x.AvgMonthlySearches != nil {
		return *x.AvgMonthlySearches
	}
	return 0
}

func (x *KeywordPlanHistoricalMetrics) GetMonthlySearchVolumes() []*MonthlySearchVolume {
	if x != nil {
		return x.MonthlySearchVolumes
	}
	return nil
}

func (x *KeywordPlanHistoricalMetrics) GetCompetition() enums.KeywordPlanCompetitionLevelEnum_KeywordPlanCompetitionLevel {
	if x != nil {
		return x.Competition
	}
	return enums.KeywordPlanCompetitionLevelEnum_UNSPECIFIED
}

func (x *KeywordPlanHistoricalMetrics) GetCompetitionIndex() int64 {
	if x != nil && x.CompetitionIndex != nil {
		return *x.CompetitionIndex
	}
	return 0
}

func (x *KeywordPlanHistoricalMetrics) GetLowTopOfPageBidMicros() int64 {
	if x != nil && x.LowTopOfPageBidMicros != nil {
		return *x.LowTopOfPageBidMicros
	}
	return 0
}

func (x *KeywordPlanHistoricalMetrics) GetHighTopOfPageBidMicros() int64 {
	if x != nil && x.HighTopOfPageBidMicros != nil {
		return *x.HighTopOfPageBidMicros
	}
	return 0
}

// Monthly search volume.
type MonthlySearchVolume struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The year of the search volume (e.g. 2020).
	Year *int64 `protobuf:"varint,4,opt,name=year,proto3,oneof" json:"year,omitempty"`
	// The month of the search volume.
	Month enums.MonthOfYearEnum_MonthOfYear `protobuf:"varint,2,opt,name=month,proto3,enum=google.ads.googleads.v6.enums.MonthOfYearEnum_MonthOfYear" json:"month,omitempty"`
	// Approximate number of searches for the month.
	// A null value indicates the search volume is unavailable for
	// that month.
	MonthlySearches *int64 `protobuf:"varint,5,opt,name=monthly_searches,json=monthlySearches,proto3,oneof" json:"monthly_searches,omitempty"`
}

func (x *MonthlySearchVolume) Reset() {
	*x = MonthlySearchVolume{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MonthlySearchVolume) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MonthlySearchVolume) ProtoMessage() {}

func (x *MonthlySearchVolume) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MonthlySearchVolume.ProtoReflect.Descriptor instead.
func (*MonthlySearchVolume) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescGZIP(), []int{1}
}

func (x *MonthlySearchVolume) GetYear() int64 {
	if x != nil && x.Year != nil {
		return *x.Year
	}
	return 0
}

func (x *MonthlySearchVolume) GetMonth() enums.MonthOfYearEnum_MonthOfYear {
	if x != nil {
		return x.Month
	}
	return enums.MonthOfYearEnum_UNSPECIFIED
}

func (x *MonthlySearchVolume) GetMonthlySearches() int64 {
	if x != nil && x.MonthlySearches != nil {
		return *x.MonthlySearches
	}
	return 0
}

var File_google_ads_googleads_v6_common_keyword_plan_common_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDesc = []byte{
	0x0a, 0x38, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x5f, 0x70, 0x6c, 0x61, 0x6e, 0x5f, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x1a, 0x42, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2f, 0x76, 0x36, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72,
	0x64, 0x5f, 0x70, 0x6c, 0x61, 0x6e, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69,
	0x6f, 0x6e, 0x5f, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x6d, 0x6f,
	0x6e, 0x74, 0x68, 0x5f, 0x6f, 0x66, 0x5f, 0x79, 0x65, 0x61, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0xe0, 0x04, 0x0a, 0x1c, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x48,
	0x69, 0x73, 0x74, 0x6f, 0x72, 0x69, 0x63, 0x61, 0x6c, 0x4d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x73,
	0x12, 0x35, 0x0a, 0x14, 0x61, 0x76, 0x67, 0x5f, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79, 0x5f,
	0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x65, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x03, 0x48, 0x00,
	0x52, 0x12, 0x61, 0x76, 0x67, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79, 0x53, 0x65, 0x61, 0x72,
	0x63, 0x68, 0x65, 0x73, 0x88, 0x01, 0x01, 0x12, 0x69, 0x0a, 0x16, 0x6d, 0x6f, 0x6e, 0x74, 0x68,
	0x6c, 0x79, 0x5f, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65,
	0x73, 0x18, 0x06, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79,
	0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x14, 0x6d, 0x6f,
	0x6e, 0x74, 0x68, 0x6c, 0x79, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x73, 0x12, 0x7c, 0x0a, 0x0b, 0x63, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x5a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50,
	0x6c, 0x61, 0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x4c, 0x65,
	0x76, 0x65, 0x6c, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50,
	0x6c, 0x61, 0x6e, 0x43, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x4c, 0x65,
	0x76, 0x65, 0x6c, 0x52, 0x0b, 0x63, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x30, 0x0a, 0x11, 0x63, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x69, 0x6e, 0x64, 0x65, 0x78, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x48, 0x01, 0x52, 0x10, 0x63,
	0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x6e, 0x64, 0x65, 0x78, 0x88,
	0x01, 0x01, 0x12, 0x3e, 0x0a, 0x1a, 0x6c, 0x6f, 0x77, 0x5f, 0x74, 0x6f, 0x70, 0x5f, 0x6f, 0x66,
	0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x62, 0x69, 0x64, 0x5f, 0x6d, 0x69, 0x63, 0x72, 0x6f, 0x73,
	0x18, 0x09, 0x20, 0x01, 0x28, 0x03, 0x48, 0x02, 0x52, 0x15, 0x6c, 0x6f, 0x77, 0x54, 0x6f, 0x70,
	0x4f, 0x66, 0x50, 0x61, 0x67, 0x65, 0x42, 0x69, 0x64, 0x4d, 0x69, 0x63, 0x72, 0x6f, 0x73, 0x88,
	0x01, 0x01, 0x12, 0x40, 0x0a, 0x1b, 0x68, 0x69, 0x67, 0x68, 0x5f, 0x74, 0x6f, 0x70, 0x5f, 0x6f,
	0x66, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x62, 0x69, 0x64, 0x5f, 0x6d, 0x69, 0x63, 0x72, 0x6f,
	0x73, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x03, 0x48, 0x03, 0x52, 0x16, 0x68, 0x69, 0x67, 0x68, 0x54,
	0x6f, 0x70, 0x4f, 0x66, 0x50, 0x61, 0x67, 0x65, 0x42, 0x69, 0x64, 0x4d, 0x69, 0x63, 0x72, 0x6f,
	0x73, 0x88, 0x01, 0x01, 0x42, 0x17, 0x0a, 0x15, 0x5f, 0x61, 0x76, 0x67, 0x5f, 0x6d, 0x6f, 0x6e,
	0x74, 0x68, 0x6c, 0x79, 0x5f, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x65, 0x73, 0x42, 0x14, 0x0a,
	0x12, 0x5f, 0x63, 0x6f, 0x6d, 0x70, 0x65, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x6e,
	0x64, 0x65, 0x78, 0x42, 0x1d, 0x0a, 0x1b, 0x5f, 0x6c, 0x6f, 0x77, 0x5f, 0x74, 0x6f, 0x70, 0x5f,
	0x6f, 0x66, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x62, 0x69, 0x64, 0x5f, 0x6d, 0x69, 0x63, 0x72,
	0x6f, 0x73, 0x42, 0x1e, 0x0a, 0x1c, 0x5f, 0x68, 0x69, 0x67, 0x68, 0x5f, 0x74, 0x6f, 0x70, 0x5f,
	0x6f, 0x66, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x62, 0x69, 0x64, 0x5f, 0x6d, 0x69, 0x63, 0x72,
	0x6f, 0x73, 0x22, 0xce, 0x01, 0x0a, 0x13, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79, 0x53, 0x65,
	0x61, 0x72, 0x63, 0x68, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x17, 0x0a, 0x04, 0x79, 0x65,
	0x61, 0x72, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x48, 0x00, 0x52, 0x04, 0x79, 0x65, 0x61, 0x72,
	0x88, 0x01, 0x01, 0x12, 0x50, 0x0a, 0x05, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x3a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x2e, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x4f, 0x66, 0x59, 0x65, 0x61, 0x72, 0x45, 0x6e,
	0x75, 0x6d, 0x2e, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x4f, 0x66, 0x59, 0x65, 0x61, 0x72, 0x52, 0x05,
	0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x12, 0x2e, 0x0a, 0x10, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79,
	0x5f, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x65, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x03, 0x48,
	0x01, 0x52, 0x0f, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68,
	0x65, 0x73, 0x88, 0x01, 0x01, 0x42, 0x07, 0x0a, 0x05, 0x5f, 0x79, 0x65, 0x61, 0x72, 0x42, 0x13,
	0x0a, 0x11, 0x5f, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x6c, 0x79, 0x5f, 0x73, 0x65, 0x61, 0x72, 0x63,
	0x68, 0x65, 0x73, 0x42, 0xf1, 0x01, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x42, 0x16, 0x4b, 0x65, 0x79, 0x77,
	0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x50, 0x01, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c,
	0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x3b, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41,
	0xaa, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x36, 0x2e, 0x43, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0xca, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x36, 0x5c, 0x43, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0xea, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73,
	0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x36, 0x3a,
	0x3a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescData = file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDesc
)

func file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescData)
	})
	return file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDescData
}

var file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_google_ads_googleads_v6_common_keyword_plan_common_proto_goTypes = []interface{}{
	(*KeywordPlanHistoricalMetrics)(nil),                                   // 0: google.ads.googleads.v6.common.KeywordPlanHistoricalMetrics
	(*MonthlySearchVolume)(nil),                                            // 1: google.ads.googleads.v6.common.MonthlySearchVolume
	(enums.KeywordPlanCompetitionLevelEnum_KeywordPlanCompetitionLevel)(0), // 2: google.ads.googleads.v6.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel
	(enums.MonthOfYearEnum_MonthOfYear)(0),                                 // 3: google.ads.googleads.v6.enums.MonthOfYearEnum.MonthOfYear
}
var file_google_ads_googleads_v6_common_keyword_plan_common_proto_depIdxs = []int32{
	1, // 0: google.ads.googleads.v6.common.KeywordPlanHistoricalMetrics.monthly_search_volumes:type_name -> google.ads.googleads.v6.common.MonthlySearchVolume
	2, // 1: google.ads.googleads.v6.common.KeywordPlanHistoricalMetrics.competition:type_name -> google.ads.googleads.v6.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel
	3, // 2: google.ads.googleads.v6.common.MonthlySearchVolume.month:type_name -> google.ads.googleads.v6.enums.MonthOfYearEnum.MonthOfYear
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v6_common_keyword_plan_common_proto_init() }
func file_google_ads_googleads_v6_common_keyword_plan_common_proto_init() {
	if File_google_ads_googleads_v6_common_keyword_plan_common_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*KeywordPlanHistoricalMetrics); i {
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
		file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MonthlySearchVolume); i {
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
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[0].OneofWrappers = []interface{}{}
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes[1].OneofWrappers = []interface{}{}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v6_common_keyword_plan_common_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v6_common_keyword_plan_common_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v6_common_keyword_plan_common_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v6_common_keyword_plan_common_proto = out.File
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_rawDesc = nil
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_goTypes = nil
	file_google_ads_googleads_v6_common_keyword_plan_common_proto_depIdxs = nil
}
