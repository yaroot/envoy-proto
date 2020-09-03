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
// source: google/ads/googleads/v3/services/feed_item_target_service.proto

package services

import (
	proto "github.com/golang/protobuf/proto"
	resources "google.golang.org/genproto/googleapis/ads/googleads/v3/resources"
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

// Request message for [FeedItemTargetService.GetFeedItemTarget][google.ads.googleads.v3.services.FeedItemTargetService.GetFeedItemTarget].
type GetFeedItemTargetRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The resource name of the feed item targets to fetch.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *GetFeedItemTargetRequest) Reset() {
	*x = GetFeedItemTargetRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetFeedItemTargetRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetFeedItemTargetRequest) ProtoMessage() {}

func (x *GetFeedItemTargetRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetFeedItemTargetRequest.ProtoReflect.Descriptor instead.
func (*GetFeedItemTargetRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescGZIP(), []int{0}
}

func (x *GetFeedItemTargetRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// Request message for [FeedItemTargetService.MutateFeedItemTargets][google.ads.googleads.v3.services.FeedItemTargetService.MutateFeedItemTargets].
type MutateFeedItemTargetsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The ID of the customer whose feed item targets are being modified.
	CustomerId string `protobuf:"bytes,1,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
	// Required. The list of operations to perform on individual feed item targets.
	Operations []*FeedItemTargetOperation `protobuf:"bytes,2,rep,name=operations,proto3" json:"operations,omitempty"`
}

func (x *MutateFeedItemTargetsRequest) Reset() {
	*x = MutateFeedItemTargetsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateFeedItemTargetsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateFeedItemTargetsRequest) ProtoMessage() {}

func (x *MutateFeedItemTargetsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateFeedItemTargetsRequest.ProtoReflect.Descriptor instead.
func (*MutateFeedItemTargetsRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescGZIP(), []int{1}
}

func (x *MutateFeedItemTargetsRequest) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

func (x *MutateFeedItemTargetsRequest) GetOperations() []*FeedItemTargetOperation {
	if x != nil {
		return x.Operations
	}
	return nil
}

// A single operation (create, remove) on an feed item target.
type FeedItemTargetOperation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The mutate operation.
	//
	// Types that are assignable to Operation:
	//	*FeedItemTargetOperation_Create
	//	*FeedItemTargetOperation_Remove
	Operation isFeedItemTargetOperation_Operation `protobuf_oneof:"operation"`
}

func (x *FeedItemTargetOperation) Reset() {
	*x = FeedItemTargetOperation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FeedItemTargetOperation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FeedItemTargetOperation) ProtoMessage() {}

func (x *FeedItemTargetOperation) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FeedItemTargetOperation.ProtoReflect.Descriptor instead.
func (*FeedItemTargetOperation) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescGZIP(), []int{2}
}

func (m *FeedItemTargetOperation) GetOperation() isFeedItemTargetOperation_Operation {
	if m != nil {
		return m.Operation
	}
	return nil
}

func (x *FeedItemTargetOperation) GetCreate() *resources.FeedItemTarget {
	if x, ok := x.GetOperation().(*FeedItemTargetOperation_Create); ok {
		return x.Create
	}
	return nil
}

func (x *FeedItemTargetOperation) GetRemove() string {
	if x, ok := x.GetOperation().(*FeedItemTargetOperation_Remove); ok {
		return x.Remove
	}
	return ""
}

type isFeedItemTargetOperation_Operation interface {
	isFeedItemTargetOperation_Operation()
}

type FeedItemTargetOperation_Create struct {
	// Create operation: No resource name is expected for the new feed item
	// target.
	Create *resources.FeedItemTarget `protobuf:"bytes,1,opt,name=create,proto3,oneof"`
}

type FeedItemTargetOperation_Remove struct {
	// Remove operation: A resource name for the removed feed item target is
	// expected, in this format:
	//
	// `customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}`
	Remove string `protobuf:"bytes,2,opt,name=remove,proto3,oneof"`
}

func (*FeedItemTargetOperation_Create) isFeedItemTargetOperation_Operation() {}

func (*FeedItemTargetOperation_Remove) isFeedItemTargetOperation_Operation() {}

// Response message for an feed item target mutate.
type MutateFeedItemTargetsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// All results for the mutate.
	Results []*MutateFeedItemTargetResult `protobuf:"bytes,2,rep,name=results,proto3" json:"results,omitempty"`
}

func (x *MutateFeedItemTargetsResponse) Reset() {
	*x = MutateFeedItemTargetsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateFeedItemTargetsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateFeedItemTargetsResponse) ProtoMessage() {}

func (x *MutateFeedItemTargetsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateFeedItemTargetsResponse.ProtoReflect.Descriptor instead.
func (*MutateFeedItemTargetsResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescGZIP(), []int{3}
}

func (x *MutateFeedItemTargetsResponse) GetResults() []*MutateFeedItemTargetResult {
	if x != nil {
		return x.Results
	}
	return nil
}

// The result for the feed item target mutate.
type MutateFeedItemTargetResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Returned for successful operations.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *MutateFeedItemTargetResult) Reset() {
	*x = MutateFeedItemTargetResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateFeedItemTargetResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateFeedItemTargetResult) ProtoMessage() {}

func (x *MutateFeedItemTargetResult) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateFeedItemTargetResult.ProtoReflect.Descriptor instead.
func (*MutateFeedItemTargetResult) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescGZIP(), []int{4}
}

func (x *MutateFeedItemTargetResult) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

var File_google_ads_googleads_v3_services_feed_item_target_service_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDesc = []byte{
	0x0a, 0x3f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2f, 0x66, 0x65, 0x65, 0x64, 0x5f, 0x69, 0x74, 0x65, 0x6d, 0x5f, 0x74, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x1a, 0x38, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2f, 0x66, 0x65, 0x65, 0x64, 0x5f, 0x69, 0x74, 0x65, 0x6d,
	0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0x70, 0x0a, 0x18, 0x47, 0x65, 0x74, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54,
	0x61, 0x72, 0x67, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x54, 0x0a, 0x0d,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x2f, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x29, 0x0a, 0x27, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69,
	0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61,
	0x6d, 0x65, 0x22, 0xa4, 0x01, 0x0a, 0x1c, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65,
	0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x0b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x63,
	0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x49, 0x64, 0x12, 0x5e, 0x0a, 0x0a, 0x6f, 0x70, 0x65,
	0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x39, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2e, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x4f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x6f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x8d, 0x01, 0x0a, 0x17, 0x46, 0x65,
	0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x4b, 0x0a, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74,
	0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x48, 0x00, 0x52, 0x06, 0x63, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x12, 0x18, 0x0a, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x48, 0x00, 0x52, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x42, 0x0b, 0x0a, 0x09,
	0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x77, 0x0a, 0x1d, 0x4d, 0x75, 0x74,
	0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x56, 0x0a, 0x07, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3c, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d,
	0x75, 0x74, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x07, 0x72, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x73, 0x22, 0x41, 0x0a, 0x1a, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64,
	0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74,
	0x12, 0x23, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x4e, 0x61, 0x6d, 0x65, 0x32, 0xf9, 0x03, 0x0a, 0x15, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74,
	0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12,
	0xcd, 0x01, 0x0a, 0x11, 0x47, 0x65, 0x74, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54,
	0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x3a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x74, 0x46, 0x65, 0x65, 0x64,
	0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x22, 0x49, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x33, 0x12, 0x31, 0x2f, 0x76,
	0x33, 0x2f, 0x7b, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65,
	0x3d, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73, 0x2f, 0x2a, 0x2f, 0x66, 0x65, 0x65,
	0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0xda,
	0x41, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0xf2, 0x01, 0x0a, 0x15, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74,
	0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73, 0x12, 0x3e, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74,
	0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x3f, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74,
	0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x58, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x39, 0x22, 0x34, 0x2f, 0x76, 0x33, 0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72,
	0x73, 0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x3d, 0x2a,
	0x7d, 0x2f, 0x66, 0x65, 0x65, 0x64, 0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x73, 0x3a, 0x6d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0xda, 0x41, 0x16, 0x63, 0x75,
	0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x2c, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x1a, 0x1b, 0xca, 0x41, 0x18, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x42, 0x81, 0x02, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x42, 0x1a, 0x46, 0x65, 0x65, 0x64,
	0x49, 0x74, 0x65, 0x6d, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f,
	0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33,
	0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e,
	0x56, 0x33, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xca, 0x02, 0x20, 0x47, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41,
	0x64, 0x73, 0x5c, 0x56, 0x33, 0x5c, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xea, 0x02,
	0x24, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x33, 0x3a, 0x3a, 0x53, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescData = file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDesc
)

func file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescData)
	})
	return file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDescData
}

var file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_google_ads_googleads_v3_services_feed_item_target_service_proto_goTypes = []interface{}{
	(*GetFeedItemTargetRequest)(nil),      // 0: google.ads.googleads.v3.services.GetFeedItemTargetRequest
	(*MutateFeedItemTargetsRequest)(nil),  // 1: google.ads.googleads.v3.services.MutateFeedItemTargetsRequest
	(*FeedItemTargetOperation)(nil),       // 2: google.ads.googleads.v3.services.FeedItemTargetOperation
	(*MutateFeedItemTargetsResponse)(nil), // 3: google.ads.googleads.v3.services.MutateFeedItemTargetsResponse
	(*MutateFeedItemTargetResult)(nil),    // 4: google.ads.googleads.v3.services.MutateFeedItemTargetResult
	(*resources.FeedItemTarget)(nil),      // 5: google.ads.googleads.v3.resources.FeedItemTarget
}
var file_google_ads_googleads_v3_services_feed_item_target_service_proto_depIdxs = []int32{
	2, // 0: google.ads.googleads.v3.services.MutateFeedItemTargetsRequest.operations:type_name -> google.ads.googleads.v3.services.FeedItemTargetOperation
	5, // 1: google.ads.googleads.v3.services.FeedItemTargetOperation.create:type_name -> google.ads.googleads.v3.resources.FeedItemTarget
	4, // 2: google.ads.googleads.v3.services.MutateFeedItemTargetsResponse.results:type_name -> google.ads.googleads.v3.services.MutateFeedItemTargetResult
	0, // 3: google.ads.googleads.v3.services.FeedItemTargetService.GetFeedItemTarget:input_type -> google.ads.googleads.v3.services.GetFeedItemTargetRequest
	1, // 4: google.ads.googleads.v3.services.FeedItemTargetService.MutateFeedItemTargets:input_type -> google.ads.googleads.v3.services.MutateFeedItemTargetsRequest
	5, // 5: google.ads.googleads.v3.services.FeedItemTargetService.GetFeedItemTarget:output_type -> google.ads.googleads.v3.resources.FeedItemTarget
	3, // 6: google.ads.googleads.v3.services.FeedItemTargetService.MutateFeedItemTargets:output_type -> google.ads.googleads.v3.services.MutateFeedItemTargetsResponse
	5, // [5:7] is the sub-list for method output_type
	3, // [3:5] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v3_services_feed_item_target_service_proto_init() }
func file_google_ads_googleads_v3_services_feed_item_target_service_proto_init() {
	if File_google_ads_googleads_v3_services_feed_item_target_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetFeedItemTargetRequest); i {
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
		file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateFeedItemTargetsRequest); i {
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
		file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FeedItemTargetOperation); i {
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
		file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateFeedItemTargetsResponse); i {
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
		file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateFeedItemTargetResult); i {
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
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*FeedItemTargetOperation_Create)(nil),
		(*FeedItemTargetOperation_Remove)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_ads_googleads_v3_services_feed_item_target_service_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v3_services_feed_item_target_service_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v3_services_feed_item_target_service_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v3_services_feed_item_target_service_proto = out.File
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_rawDesc = nil
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_goTypes = nil
	file_google_ads_googleads_v3_services_feed_item_target_service_proto_depIdxs = nil
}
