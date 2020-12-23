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
// source: google/ads/googleads/v3/services/campaign_shared_set_service.proto

package services

import (
	proto "github.com/golang/protobuf/proto"
	resources "google.golang.org/genproto/googleapis/ads/googleads/v3/resources"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	status "google.golang.org/genproto/googleapis/rpc/status"
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

// Request message for [CampaignSharedSetService.GetCampaignSharedSet][google.ads.googleads.v3.services.CampaignSharedSetService.GetCampaignSharedSet].
type GetCampaignSharedSetRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The resource name of the campaign shared set to fetch.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *GetCampaignSharedSetRequest) Reset() {
	*x = GetCampaignSharedSetRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetCampaignSharedSetRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetCampaignSharedSetRequest) ProtoMessage() {}

func (x *GetCampaignSharedSetRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetCampaignSharedSetRequest.ProtoReflect.Descriptor instead.
func (*GetCampaignSharedSetRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescGZIP(), []int{0}
}

func (x *GetCampaignSharedSetRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// Request message for [CampaignSharedSetService.MutateCampaignSharedSets][google.ads.googleads.v3.services.CampaignSharedSetService.MutateCampaignSharedSets].
type MutateCampaignSharedSetsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The ID of the customer whose campaign shared sets are being modified.
	CustomerId string `protobuf:"bytes,1,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
	// Required. The list of operations to perform on individual campaign shared sets.
	Operations []*CampaignSharedSetOperation `protobuf:"bytes,2,rep,name=operations,proto3" json:"operations,omitempty"`
	// If true, successful operations will be carried out and invalid
	// operations will return errors. If false, all operations will be carried
	// out in one transaction if and only if they are all valid.
	// Default is false.
	PartialFailure bool `protobuf:"varint,3,opt,name=partial_failure,json=partialFailure,proto3" json:"partial_failure,omitempty"`
	// If true, the request is validated but not executed. Only errors are
	// returned, not results.
	ValidateOnly bool `protobuf:"varint,4,opt,name=validate_only,json=validateOnly,proto3" json:"validate_only,omitempty"`
}

func (x *MutateCampaignSharedSetsRequest) Reset() {
	*x = MutateCampaignSharedSetsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateCampaignSharedSetsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateCampaignSharedSetsRequest) ProtoMessage() {}

func (x *MutateCampaignSharedSetsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateCampaignSharedSetsRequest.ProtoReflect.Descriptor instead.
func (*MutateCampaignSharedSetsRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescGZIP(), []int{1}
}

func (x *MutateCampaignSharedSetsRequest) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

func (x *MutateCampaignSharedSetsRequest) GetOperations() []*CampaignSharedSetOperation {
	if x != nil {
		return x.Operations
	}
	return nil
}

func (x *MutateCampaignSharedSetsRequest) GetPartialFailure() bool {
	if x != nil {
		return x.PartialFailure
	}
	return false
}

func (x *MutateCampaignSharedSetsRequest) GetValidateOnly() bool {
	if x != nil {
		return x.ValidateOnly
	}
	return false
}

// A single operation (create, remove) on an campaign shared set.
type CampaignSharedSetOperation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The mutate operation.
	//
	// Types that are assignable to Operation:
	//	*CampaignSharedSetOperation_Create
	//	*CampaignSharedSetOperation_Remove
	Operation isCampaignSharedSetOperation_Operation `protobuf_oneof:"operation"`
}

func (x *CampaignSharedSetOperation) Reset() {
	*x = CampaignSharedSetOperation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CampaignSharedSetOperation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CampaignSharedSetOperation) ProtoMessage() {}

func (x *CampaignSharedSetOperation) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CampaignSharedSetOperation.ProtoReflect.Descriptor instead.
func (*CampaignSharedSetOperation) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescGZIP(), []int{2}
}

func (m *CampaignSharedSetOperation) GetOperation() isCampaignSharedSetOperation_Operation {
	if m != nil {
		return m.Operation
	}
	return nil
}

func (x *CampaignSharedSetOperation) GetCreate() *resources.CampaignSharedSet {
	if x, ok := x.GetOperation().(*CampaignSharedSetOperation_Create); ok {
		return x.Create
	}
	return nil
}

func (x *CampaignSharedSetOperation) GetRemove() string {
	if x, ok := x.GetOperation().(*CampaignSharedSetOperation_Remove); ok {
		return x.Remove
	}
	return ""
}

type isCampaignSharedSetOperation_Operation interface {
	isCampaignSharedSetOperation_Operation()
}

type CampaignSharedSetOperation_Create struct {
	// Create operation: No resource name is expected for the new campaign
	// shared set.
	Create *resources.CampaignSharedSet `protobuf:"bytes,1,opt,name=create,proto3,oneof"`
}

type CampaignSharedSetOperation_Remove struct {
	// Remove operation: A resource name for the removed campaign shared set is
	// expected, in this format:
	//
	// `customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}`
	Remove string `protobuf:"bytes,3,opt,name=remove,proto3,oneof"`
}

func (*CampaignSharedSetOperation_Create) isCampaignSharedSetOperation_Operation() {}

func (*CampaignSharedSetOperation_Remove) isCampaignSharedSetOperation_Operation() {}

// Response message for a campaign shared set mutate.
type MutateCampaignSharedSetsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Errors that pertain to operation failures in the partial failure mode.
	// Returned only when partial_failure = true and all errors occur inside the
	// operations. If any errors occur outside the operations (e.g. auth errors),
	// we return an RPC level error.
	PartialFailureError *status.Status `protobuf:"bytes,3,opt,name=partial_failure_error,json=partialFailureError,proto3" json:"partial_failure_error,omitempty"`
	// All results for the mutate.
	Results []*MutateCampaignSharedSetResult `protobuf:"bytes,2,rep,name=results,proto3" json:"results,omitempty"`
}

func (x *MutateCampaignSharedSetsResponse) Reset() {
	*x = MutateCampaignSharedSetsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateCampaignSharedSetsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateCampaignSharedSetsResponse) ProtoMessage() {}

func (x *MutateCampaignSharedSetsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateCampaignSharedSetsResponse.ProtoReflect.Descriptor instead.
func (*MutateCampaignSharedSetsResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescGZIP(), []int{3}
}

func (x *MutateCampaignSharedSetsResponse) GetPartialFailureError() *status.Status {
	if x != nil {
		return x.PartialFailureError
	}
	return nil
}

func (x *MutateCampaignSharedSetsResponse) GetResults() []*MutateCampaignSharedSetResult {
	if x != nil {
		return x.Results
	}
	return nil
}

// The result for the campaign shared set mutate.
type MutateCampaignSharedSetResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Returned for successful operations.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *MutateCampaignSharedSetResult) Reset() {
	*x = MutateCampaignSharedSetResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateCampaignSharedSetResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateCampaignSharedSetResult) ProtoMessage() {}

func (x *MutateCampaignSharedSetResult) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateCampaignSharedSetResult.ProtoReflect.Descriptor instead.
func (*MutateCampaignSharedSetResult) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescGZIP(), []int{4}
}

func (x *MutateCampaignSharedSetResult) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

var File_google_ads_googleads_v3_services_campaign_shared_set_service_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDesc = []byte{
	0x0a, 0x42, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2f, 0x63, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x5f, 0x73, 0x68, 0x61, 0x72,
	0x65, 0x64, 0x5f, 0x73, 0x65, 0x74, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x1a, 0x3b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2f, 0x63, 0x61, 0x6d, 0x70, 0x61, 0x69,
	0x67, 0x6e, 0x5f, 0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x5f, 0x73, 0x65, 0x74, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68,
	0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x72,
	0x70, 0x63, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x76, 0x0a, 0x1b, 0x47, 0x65, 0x74, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68,
	0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x57,
	0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x32, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x2c, 0x0a, 0x2a, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e,
	0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x22, 0xf8, 0x01, 0x0a, 0x1f, 0x4d, 0x75, 0x74, 0x61,
	0x74, 0x65, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64,
	0x53, 0x65, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x0b, 0x63,
	0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x49,
	0x64, 0x12, 0x61, 0x0a, 0x0a, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18,
	0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67,
	0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x12, 0x27, 0x0a, 0x0f, 0x70, 0x61, 0x72, 0x74, 0x69, 0x61, 0x6c, 0x5f,
	0x66, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0e, 0x70,
	0x61, 0x72, 0x74, 0x69, 0x61, 0x6c, 0x46, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x12, 0x23, 0x0a,
	0x0d, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x6f, 0x6e, 0x6c, 0x79, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x0c, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4f, 0x6e,
	0x6c, 0x79, 0x22, 0x93, 0x01, 0x0a, 0x1a, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53,
	0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x12, 0x4e, 0x0a, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68,
	0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x48, 0x00, 0x52, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x12, 0x18, 0x0a, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x48, 0x00, 0x52, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x42, 0x0b, 0x0a, 0x09, 0x6f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0xc5, 0x01, 0x0a, 0x20, 0x4d, 0x75, 0x74,
	0x61, 0x74, 0x65, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65,
	0x64, 0x53, 0x65, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x46, 0x0a,
	0x15, 0x70, 0x61, 0x72, 0x74, 0x69, 0x61, 0x6c, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65,
	0x5f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x72, 0x70, 0x63, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x52, 0x13, 0x70, 0x61, 0x72, 0x74, 0x69, 0x61, 0x6c, 0x46, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65,
	0x45, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x59, 0x0a, 0x07, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73,
	0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33,
	0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65,
	0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65,
	0x74, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x07, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73,
	0x22, 0x44, 0x0a, 0x1d, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69,
	0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x52, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x12, 0x23, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x32, 0xbe, 0x04, 0x0a, 0x18, 0x43, 0x61, 0x6d, 0x70, 0x61,
	0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x12, 0xd9, 0x01, 0x0a, 0x14, 0x47, 0x65, 0x74, 0x43, 0x61, 0x6d, 0x70, 0x61,
	0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x12, 0x3d, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x47, 0x65, 0x74, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65,
	0x64, 0x53, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x34, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e,
	0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65,
	0x74, 0x22, 0x4c, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x36, 0x12, 0x34, 0x2f, 0x76, 0x33, 0x2f, 0x7b,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x63, 0x75,
	0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73, 0x2f, 0x2a, 0x2f, 0x63, 0x61, 0x6d, 0x70, 0x61, 0x69,
	0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0xda,
	0x41, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0xfe, 0x01, 0x0a, 0x18, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69,
	0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x73, 0x12, 0x41, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68,
	0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x42, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67,
	0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x5b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x3c, 0x22, 0x37, 0x2f, 0x76, 0x33,
	0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74,
	0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x3d, 0x2a, 0x7d, 0x2f, 0x63, 0x61, 0x6d, 0x70, 0x61,
	0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x53, 0x65, 0x74, 0x73, 0x3a, 0x6d, 0x75,
	0x74, 0x61, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0xda, 0x41, 0x16, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d,
	0x65, 0x72, 0x5f, 0x69, 0x64, 0x2c, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x1a, 0x45, 0xca, 0x41, 0x18, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0xd2, 0x41, 0x27,
	0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77, 0x77, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x2f,
	0x61, 0x64, 0x77, 0x6f, 0x72, 0x64, 0x73, 0x42, 0x84, 0x02, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x42, 0x1d, 0x43, 0x61, 0x6d, 0x70, 0x61, 0x69, 0x67, 0x6e, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64,
	0x53, 0x65, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50,
	0x01, 0x5a, 0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67,
	0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41,
	0x41, 0xaa, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x33, 0x2e, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x73, 0xca, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64,
	0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x33, 0x5c, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xea, 0x02, 0x24, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x3a, 0x3a, 0x56, 0x33, 0x3a, 0x3a, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescData = file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDesc
)

func file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescData)
	})
	return file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDescData
}

var file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_goTypes = []interface{}{
	(*GetCampaignSharedSetRequest)(nil),      // 0: google.ads.googleads.v3.services.GetCampaignSharedSetRequest
	(*MutateCampaignSharedSetsRequest)(nil),  // 1: google.ads.googleads.v3.services.MutateCampaignSharedSetsRequest
	(*CampaignSharedSetOperation)(nil),       // 2: google.ads.googleads.v3.services.CampaignSharedSetOperation
	(*MutateCampaignSharedSetsResponse)(nil), // 3: google.ads.googleads.v3.services.MutateCampaignSharedSetsResponse
	(*MutateCampaignSharedSetResult)(nil),    // 4: google.ads.googleads.v3.services.MutateCampaignSharedSetResult
	(*resources.CampaignSharedSet)(nil),      // 5: google.ads.googleads.v3.resources.CampaignSharedSet
	(*status.Status)(nil),                    // 6: google.rpc.Status
}
var file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_depIdxs = []int32{
	2, // 0: google.ads.googleads.v3.services.MutateCampaignSharedSetsRequest.operations:type_name -> google.ads.googleads.v3.services.CampaignSharedSetOperation
	5, // 1: google.ads.googleads.v3.services.CampaignSharedSetOperation.create:type_name -> google.ads.googleads.v3.resources.CampaignSharedSet
	6, // 2: google.ads.googleads.v3.services.MutateCampaignSharedSetsResponse.partial_failure_error:type_name -> google.rpc.Status
	4, // 3: google.ads.googleads.v3.services.MutateCampaignSharedSetsResponse.results:type_name -> google.ads.googleads.v3.services.MutateCampaignSharedSetResult
	0, // 4: google.ads.googleads.v3.services.CampaignSharedSetService.GetCampaignSharedSet:input_type -> google.ads.googleads.v3.services.GetCampaignSharedSetRequest
	1, // 5: google.ads.googleads.v3.services.CampaignSharedSetService.MutateCampaignSharedSets:input_type -> google.ads.googleads.v3.services.MutateCampaignSharedSetsRequest
	5, // 6: google.ads.googleads.v3.services.CampaignSharedSetService.GetCampaignSharedSet:output_type -> google.ads.googleads.v3.resources.CampaignSharedSet
	3, // 7: google.ads.googleads.v3.services.CampaignSharedSetService.MutateCampaignSharedSets:output_type -> google.ads.googleads.v3.services.MutateCampaignSharedSetsResponse
	6, // [6:8] is the sub-list for method output_type
	4, // [4:6] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_init() }
func file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_init() {
	if File_google_ads_googleads_v3_services_campaign_shared_set_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetCampaignSharedSetRequest); i {
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
		file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateCampaignSharedSetsRequest); i {
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
		file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CampaignSharedSetOperation); i {
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
		file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateCampaignSharedSetsResponse); i {
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
		file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateCampaignSharedSetResult); i {
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
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*CampaignSharedSetOperation_Create)(nil),
		(*CampaignSharedSetOperation_Remove)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v3_services_campaign_shared_set_service_proto = out.File
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_rawDesc = nil
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_goTypes = nil
	file_google_ads_googleads_v3_services_campaign_shared_set_service_proto_depIdxs = nil
}
