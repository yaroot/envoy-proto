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
// source: google/ads/googleads/v4/enums/feed_item_quality_disapproval_reason.proto

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

// The possible quality evaluation disapproval reasons of a feed item.
type FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason int32

const (
	// No value has been specified.
	FeedItemQualityDisapprovalReasonEnum_UNSPECIFIED FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 0
	// Used for return value only. Represents value unknown in this version.
	FeedItemQualityDisapprovalReasonEnum_UNKNOWN FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 1
	// Price contains repetitive headers.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_REPETITIVE_HEADERS FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 2
	// Price contains repetitive description.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_REPETITIVE_DESCRIPTION FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 3
	// Price contains inconsistent items.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_INCONSISTENT_ROWS FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 4
	// Price contains qualifiers in description.
	FeedItemQualityDisapprovalReasonEnum_PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 5
	// Price contains an unsupported language.
	FeedItemQualityDisapprovalReasonEnum_PRICE_UNSUPPORTED_LANGUAGE FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 6
	// Price item header is not relevant to the price type.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 7
	// Price item header has promotional text.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 8
	// Price item description is not relevant to the item header.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 9
	// Price item description contains promotional text.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 10
	// Price item header and description are repetitive.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 11
	// Price item is in a foreign language, nonsense, or can't be rated.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_UNRATEABLE FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 12
	// Price item price is invalid or inaccurate.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_PRICE_INVALID FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 13
	// Price item URL is invalid or irrelevant.
	FeedItemQualityDisapprovalReasonEnum_PRICE_TABLE_ROW_URL_INVALID FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 14
	// Price item header or description has price.
	FeedItemQualityDisapprovalReasonEnum_PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 15
	// Structured snippet values do not match the header.
	FeedItemQualityDisapprovalReasonEnum_STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 16
	// Structured snippet values are repeated.
	FeedItemQualityDisapprovalReasonEnum_STRUCTURED_SNIPPETS_REPEATED_VALUES FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 17
	// Structured snippet values violate editorial guidelines like punctuation.
	FeedItemQualityDisapprovalReasonEnum_STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 18
	// Structured snippet contain promotional text.
	FeedItemQualityDisapprovalReasonEnum_STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason = 19
)

// Enum value maps for FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason.
var (
	FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason_name = map[int32]string{
		0:  "UNSPECIFIED",
		1:  "UNKNOWN",
		2:  "PRICE_TABLE_REPETITIVE_HEADERS",
		3:  "PRICE_TABLE_REPETITIVE_DESCRIPTION",
		4:  "PRICE_TABLE_INCONSISTENT_ROWS",
		5:  "PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS",
		6:  "PRICE_UNSUPPORTED_LANGUAGE",
		7:  "PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH",
		8:  "PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT",
		9:  "PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT",
		10: "PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT",
		11: "PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE",
		12: "PRICE_TABLE_ROW_UNRATEABLE",
		13: "PRICE_TABLE_ROW_PRICE_INVALID",
		14: "PRICE_TABLE_ROW_URL_INVALID",
		15: "PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE",
		16: "STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED",
		17: "STRUCTURED_SNIPPETS_REPEATED_VALUES",
		18: "STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES",
		19: "STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT",
	}
	FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason_value = map[string]int32{
		"UNSPECIFIED":                                      0,
		"UNKNOWN":                                          1,
		"PRICE_TABLE_REPETITIVE_HEADERS":                   2,
		"PRICE_TABLE_REPETITIVE_DESCRIPTION":               3,
		"PRICE_TABLE_INCONSISTENT_ROWS":                    4,
		"PRICE_DESCRIPTION_HAS_PRICE_QUALIFIERS":           5,
		"PRICE_UNSUPPORTED_LANGUAGE":                       6,
		"PRICE_TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH":       7,
		"PRICE_TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT":      8,
		"PRICE_TABLE_ROW_DESCRIPTION_NOT_RELEVANT":         9,
		"PRICE_TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT": 10,
		"PRICE_TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE":    11,
		"PRICE_TABLE_ROW_UNRATEABLE":                       12,
		"PRICE_TABLE_ROW_PRICE_INVALID":                    13,
		"PRICE_TABLE_ROW_URL_INVALID":                      14,
		"PRICE_HEADER_OR_DESCRIPTION_HAS_PRICE":            15,
		"STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED":       16,
		"STRUCTURED_SNIPPETS_REPEATED_VALUES":              17,
		"STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES":         18,
		"STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT":         19,
	}
)

func (x FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason) Enum() *FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason {
	p := new(FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason)
	*p = x
	return p
}

func (x FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason) Descriptor() protoreflect.EnumDescriptor {
	return file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_enumTypes[0].Descriptor()
}

func (FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason) Type() protoreflect.EnumType {
	return &file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_enumTypes[0]
}

func (x FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason.Descriptor instead.
func (FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason) EnumDescriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescGZIP(), []int{0, 0}
}

// Container for enum describing possible quality evaluation disapproval reasons
// of a feed item.
type FeedItemQualityDisapprovalReasonEnum struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *FeedItemQualityDisapprovalReasonEnum) Reset() {
	*x = FeedItemQualityDisapprovalReasonEnum{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FeedItemQualityDisapprovalReasonEnum) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FeedItemQualityDisapprovalReasonEnum) ProtoMessage() {}

func (x *FeedItemQualityDisapprovalReasonEnum) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FeedItemQualityDisapprovalReasonEnum.ProtoReflect.Descriptor instead.
func (*FeedItemQualityDisapprovalReasonEnum) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescGZIP(), []int{0}
}

var File_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDesc = []byte{
	0x0a, 0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x66, 0x65, 0x65, 0x64, 0x5f, 0x69, 0x74, 0x65, 0x6d, 0x5f, 0x71, 0x75, 0x61, 0x6c, 0x69, 0x74,
	0x79, 0x5f, 0x64, 0x69, 0x73, 0x61, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x5f, 0x72, 0x65,
	0x61, 0x73, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1d, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x34, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xe0, 0x06, 0x0a, 0x24, 0x46, 0x65, 0x65, 0x64,
	0x49, 0x74, 0x65, 0x6d, 0x51, 0x75, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x44, 0x69, 0x73, 0x61, 0x70,
	0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x45, 0x6e, 0x75, 0x6d,
	0x22, 0xb7, 0x06, 0x0a, 0x20, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x51, 0x75, 0x61,
	0x6c, 0x69, 0x74, 0x79, 0x44, 0x69, 0x73, 0x61, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x52,
	0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x0f, 0x0a, 0x0b, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49,
	0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57,
	0x4e, 0x10, 0x01, 0x12, 0x22, 0x0a, 0x1e, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42,
	0x4c, 0x45, 0x5f, 0x52, 0x45, 0x50, 0x45, 0x54, 0x49, 0x54, 0x49, 0x56, 0x45, 0x5f, 0x48, 0x45,
	0x41, 0x44, 0x45, 0x52, 0x53, 0x10, 0x02, 0x12, 0x26, 0x0a, 0x22, 0x50, 0x52, 0x49, 0x43, 0x45,
	0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x45, 0x50, 0x45, 0x54, 0x49, 0x54, 0x49, 0x56,
	0x45, 0x5f, 0x44, 0x45, 0x53, 0x43, 0x52, 0x49, 0x50, 0x54, 0x49, 0x4f, 0x4e, 0x10, 0x03, 0x12,
	0x21, 0x0a, 0x1d, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x49,
	0x4e, 0x43, 0x4f, 0x4e, 0x53, 0x49, 0x53, 0x54, 0x45, 0x4e, 0x54, 0x5f, 0x52, 0x4f, 0x57, 0x53,
	0x10, 0x04, 0x12, 0x2a, 0x0a, 0x26, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x44, 0x45, 0x53, 0x43,
	0x52, 0x49, 0x50, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x48, 0x41, 0x53, 0x5f, 0x50, 0x52, 0x49, 0x43,
	0x45, 0x5f, 0x51, 0x55, 0x41, 0x4c, 0x49, 0x46, 0x49, 0x45, 0x52, 0x53, 0x10, 0x05, 0x12, 0x1e,
	0x0a, 0x1a, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x55, 0x50, 0x50, 0x4f, 0x52,
	0x54, 0x45, 0x44, 0x5f, 0x4c, 0x41, 0x4e, 0x47, 0x55, 0x41, 0x47, 0x45, 0x10, 0x06, 0x12, 0x2e,
	0x0a, 0x2a, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x4f,
	0x57, 0x5f, 0x48, 0x45, 0x41, 0x44, 0x45, 0x52, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x54,
	0x59, 0x50, 0x45, 0x5f, 0x4d, 0x49, 0x53, 0x4d, 0x41, 0x54, 0x43, 0x48, 0x10, 0x07, 0x12, 0x2f,
	0x0a, 0x2b, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x4f,
	0x57, 0x5f, 0x48, 0x45, 0x41, 0x44, 0x45, 0x52, 0x5f, 0x48, 0x41, 0x53, 0x5f, 0x50, 0x52, 0x4f,
	0x4d, 0x4f, 0x54, 0x49, 0x4f, 0x4e, 0x41, 0x4c, 0x5f, 0x54, 0x45, 0x58, 0x54, 0x10, 0x08, 0x12,
	0x2c, 0x0a, 0x28, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52,
	0x4f, 0x57, 0x5f, 0x44, 0x45, 0x53, 0x43, 0x52, 0x49, 0x50, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x4e,
	0x4f, 0x54, 0x5f, 0x52, 0x45, 0x4c, 0x45, 0x56, 0x41, 0x4e, 0x54, 0x10, 0x09, 0x12, 0x34, 0x0a,
	0x30, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x4f, 0x57,
	0x5f, 0x44, 0x45, 0x53, 0x43, 0x52, 0x49, 0x50, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x48, 0x41, 0x53,
	0x5f, 0x50, 0x52, 0x4f, 0x4d, 0x4f, 0x54, 0x49, 0x4f, 0x4e, 0x41, 0x4c, 0x5f, 0x54, 0x45, 0x58,
	0x54, 0x10, 0x0a, 0x12, 0x31, 0x0a, 0x2d, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f, 0x54, 0x41, 0x42,
	0x4c, 0x45, 0x5f, 0x52, 0x4f, 0x57, 0x5f, 0x48, 0x45, 0x41, 0x44, 0x45, 0x52, 0x5f, 0x44, 0x45,
	0x53, 0x43, 0x52, 0x49, 0x50, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x52, 0x45, 0x50, 0x45, 0x54, 0x49,
	0x54, 0x49, 0x56, 0x45, 0x10, 0x0b, 0x12, 0x1e, 0x0a, 0x1a, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f,
	0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x4f, 0x57, 0x5f, 0x55, 0x4e, 0x52, 0x41, 0x54, 0x45,
	0x41, 0x42, 0x4c, 0x45, 0x10, 0x0c, 0x12, 0x21, 0x0a, 0x1d, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f,
	0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x4f, 0x57, 0x5f, 0x50, 0x52, 0x49, 0x43, 0x45, 0x5f,
	0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x10, 0x0d, 0x12, 0x1f, 0x0a, 0x1b, 0x50, 0x52, 0x49,
	0x43, 0x45, 0x5f, 0x54, 0x41, 0x42, 0x4c, 0x45, 0x5f, 0x52, 0x4f, 0x57, 0x5f, 0x55, 0x52, 0x4c,
	0x5f, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x10, 0x0e, 0x12, 0x29, 0x0a, 0x25, 0x50, 0x52,
	0x49, 0x43, 0x45, 0x5f, 0x48, 0x45, 0x41, 0x44, 0x45, 0x52, 0x5f, 0x4f, 0x52, 0x5f, 0x44, 0x45,
	0x53, 0x43, 0x52, 0x49, 0x50, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x48, 0x41, 0x53, 0x5f, 0x50, 0x52,
	0x49, 0x43, 0x45, 0x10, 0x0f, 0x12, 0x2e, 0x0a, 0x2a, 0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x55,
	0x52, 0x45, 0x44, 0x5f, 0x53, 0x4e, 0x49, 0x50, 0x50, 0x45, 0x54, 0x53, 0x5f, 0x48, 0x45, 0x41,
	0x44, 0x45, 0x52, 0x5f, 0x50, 0x4f, 0x4c, 0x49, 0x43, 0x59, 0x5f, 0x56, 0x49, 0x4f, 0x4c, 0x41,
	0x54, 0x45, 0x44, 0x10, 0x10, 0x12, 0x27, 0x0a, 0x23, 0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x55,
	0x52, 0x45, 0x44, 0x5f, 0x53, 0x4e, 0x49, 0x50, 0x50, 0x45, 0x54, 0x53, 0x5f, 0x52, 0x45, 0x50,
	0x45, 0x41, 0x54, 0x45, 0x44, 0x5f, 0x56, 0x41, 0x4c, 0x55, 0x45, 0x53, 0x10, 0x11, 0x12, 0x2c,
	0x0a, 0x28, 0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x55, 0x52, 0x45, 0x44, 0x5f, 0x53, 0x4e, 0x49,
	0x50, 0x50, 0x45, 0x54, 0x53, 0x5f, 0x45, 0x44, 0x49, 0x54, 0x4f, 0x52, 0x49, 0x41, 0x4c, 0x5f,
	0x47, 0x55, 0x49, 0x44, 0x45, 0x4c, 0x49, 0x4e, 0x45, 0x53, 0x10, 0x12, 0x12, 0x2c, 0x0a, 0x28,
	0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x55, 0x52, 0x45, 0x44, 0x5f, 0x53, 0x4e, 0x49, 0x50, 0x50,
	0x45, 0x54, 0x53, 0x5f, 0x48, 0x41, 0x53, 0x5f, 0x50, 0x52, 0x4f, 0x4d, 0x4f, 0x54, 0x49, 0x4f,
	0x4e, 0x41, 0x4c, 0x5f, 0x54, 0x45, 0x58, 0x54, 0x10, 0x13, 0x42, 0xfa, 0x01, 0x0a, 0x21, 0x63,
	0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73,
	0x42, 0x25, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x51, 0x75, 0x61, 0x6c, 0x69, 0x74,
	0x79, 0x44, 0x69, 0x73, 0x61, 0x70, 0x70, 0x72, 0x6f, 0x76, 0x61, 0x6c, 0x52, 0x65, 0x61, 0x73,
	0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x42, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76,
	0x34, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x3b, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0xa2, 0x02, 0x03,
	0x47, 0x41, 0x41, 0xaa, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73,
	0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x34, 0x2e, 0x45, 0x6e,
	0x75, 0x6d, 0x73, 0xca, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73,
	0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x34, 0x5c, 0x45, 0x6e,
	0x75, 0x6d, 0x73, 0xea, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64,
	0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x34,
	0x3a, 0x3a, 0x45, 0x6e, 0x75, 0x6d, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescData = file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDesc
)

func file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescData)
	})
	return file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDescData
}

var file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_goTypes = []interface{}{
	(FeedItemQualityDisapprovalReasonEnum_FeedItemQualityDisapprovalReason)(0), // 0: google.ads.googleads.v4.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReason
	(*FeedItemQualityDisapprovalReasonEnum)(nil),                               // 1: google.ads.googleads.v4.enums.FeedItemQualityDisapprovalReasonEnum
}
var file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_init() }
func file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_init() {
	if File_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FeedItemQualityDisapprovalReasonEnum); i {
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
			RawDescriptor: file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_depIdxs,
		EnumInfos:         file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_enumTypes,
		MessageInfos:      file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto = out.File
	file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_rawDesc = nil
	file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_goTypes = nil
	file_google_ads_googleads_v4_enums_feed_item_quality_disapproval_reason_proto_depIdxs = nil
}
