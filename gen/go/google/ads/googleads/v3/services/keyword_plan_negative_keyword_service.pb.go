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
// source: google/ads/googleads/v3/services/keyword_plan_negative_keyword_service.proto

package services

import (
	proto "github.com/golang/protobuf/proto"
	resources "google.golang.org/genproto/googleapis/ads/googleads/v3/resources"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	status "google.golang.org/genproto/googleapis/rpc/status"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	fieldmaskpb "google.golang.org/protobuf/types/known/fieldmaskpb"
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

// Request message for
// [KeywordPlanNegativeKeywordService.GetKeywordPlanNegativeKeyword][google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService.GetKeywordPlanNegativeKeyword].
type GetKeywordPlanNegativeKeywordRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The resource name of the plan to fetch.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *GetKeywordPlanNegativeKeywordRequest) Reset() {
	*x = GetKeywordPlanNegativeKeywordRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetKeywordPlanNegativeKeywordRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetKeywordPlanNegativeKeywordRequest) ProtoMessage() {}

func (x *GetKeywordPlanNegativeKeywordRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetKeywordPlanNegativeKeywordRequest.ProtoReflect.Descriptor instead.
func (*GetKeywordPlanNegativeKeywordRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescGZIP(), []int{0}
}

func (x *GetKeywordPlanNegativeKeywordRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// Request message for
// [KeywordPlanNegativeKeywordService.MutateKeywordPlanNegativeKeywords][google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService.MutateKeywordPlanNegativeKeywords].
type MutateKeywordPlanNegativeKeywordsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The ID of the customer whose negative keywords are being modified.
	CustomerId string `protobuf:"bytes,1,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
	// Required. The list of operations to perform on individual Keyword Plan negative
	// keywords.
	Operations []*KeywordPlanNegativeKeywordOperation `protobuf:"bytes,2,rep,name=operations,proto3" json:"operations,omitempty"`
	// If true, successful operations will be carried out and invalid
	// operations will return errors. If false, all operations will be carried
	// out in one transaction if and only if they are all valid.
	// Default is false.
	PartialFailure bool `protobuf:"varint,3,opt,name=partial_failure,json=partialFailure,proto3" json:"partial_failure,omitempty"`
	// If true, the request is validated but not executed. Only errors are
	// returned, not results.
	ValidateOnly bool `protobuf:"varint,4,opt,name=validate_only,json=validateOnly,proto3" json:"validate_only,omitempty"`
}

func (x *MutateKeywordPlanNegativeKeywordsRequest) Reset() {
	*x = MutateKeywordPlanNegativeKeywordsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateKeywordPlanNegativeKeywordsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateKeywordPlanNegativeKeywordsRequest) ProtoMessage() {}

func (x *MutateKeywordPlanNegativeKeywordsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateKeywordPlanNegativeKeywordsRequest.ProtoReflect.Descriptor instead.
func (*MutateKeywordPlanNegativeKeywordsRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescGZIP(), []int{1}
}

func (x *MutateKeywordPlanNegativeKeywordsRequest) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

func (x *MutateKeywordPlanNegativeKeywordsRequest) GetOperations() []*KeywordPlanNegativeKeywordOperation {
	if x != nil {
		return x.Operations
	}
	return nil
}

func (x *MutateKeywordPlanNegativeKeywordsRequest) GetPartialFailure() bool {
	if x != nil {
		return x.PartialFailure
	}
	return false
}

func (x *MutateKeywordPlanNegativeKeywordsRequest) GetValidateOnly() bool {
	if x != nil {
		return x.ValidateOnly
	}
	return false
}

// A single operation (create, update, remove) on a Keyword Plan negative
// keyword.
type KeywordPlanNegativeKeywordOperation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The FieldMask that determines which resource fields are modified in an
	// update.
	UpdateMask *fieldmaskpb.FieldMask `protobuf:"bytes,4,opt,name=update_mask,json=updateMask,proto3" json:"update_mask,omitempty"`
	// The mutate operation.
	//
	// Types that are assignable to Operation:
	//	*KeywordPlanNegativeKeywordOperation_Create
	//	*KeywordPlanNegativeKeywordOperation_Update
	//	*KeywordPlanNegativeKeywordOperation_Remove
	Operation isKeywordPlanNegativeKeywordOperation_Operation `protobuf_oneof:"operation"`
}

func (x *KeywordPlanNegativeKeywordOperation) Reset() {
	*x = KeywordPlanNegativeKeywordOperation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *KeywordPlanNegativeKeywordOperation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*KeywordPlanNegativeKeywordOperation) ProtoMessage() {}

func (x *KeywordPlanNegativeKeywordOperation) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use KeywordPlanNegativeKeywordOperation.ProtoReflect.Descriptor instead.
func (*KeywordPlanNegativeKeywordOperation) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescGZIP(), []int{2}
}

func (x *KeywordPlanNegativeKeywordOperation) GetUpdateMask() *fieldmaskpb.FieldMask {
	if x != nil {
		return x.UpdateMask
	}
	return nil
}

func (m *KeywordPlanNegativeKeywordOperation) GetOperation() isKeywordPlanNegativeKeywordOperation_Operation {
	if m != nil {
		return m.Operation
	}
	return nil
}

func (x *KeywordPlanNegativeKeywordOperation) GetCreate() *resources.KeywordPlanNegativeKeyword {
	if x, ok := x.GetOperation().(*KeywordPlanNegativeKeywordOperation_Create); ok {
		return x.Create
	}
	return nil
}

func (x *KeywordPlanNegativeKeywordOperation) GetUpdate() *resources.KeywordPlanNegativeKeyword {
	if x, ok := x.GetOperation().(*KeywordPlanNegativeKeywordOperation_Update); ok {
		return x.Update
	}
	return nil
}

func (x *KeywordPlanNegativeKeywordOperation) GetRemove() string {
	if x, ok := x.GetOperation().(*KeywordPlanNegativeKeywordOperation_Remove); ok {
		return x.Remove
	}
	return ""
}

type isKeywordPlanNegativeKeywordOperation_Operation interface {
	isKeywordPlanNegativeKeywordOperation_Operation()
}

type KeywordPlanNegativeKeywordOperation_Create struct {
	// Create operation: No resource name is expected for the new Keyword Plan
	// negative keyword.
	Create *resources.KeywordPlanNegativeKeyword `protobuf:"bytes,1,opt,name=create,proto3,oneof"`
}

type KeywordPlanNegativeKeywordOperation_Update struct {
	// Update operation: The Keyword Plan negative keyword expected to have a
	// valid resource name.
	Update *resources.KeywordPlanNegativeKeyword `protobuf:"bytes,2,opt,name=update,proto3,oneof"`
}

type KeywordPlanNegativeKeywordOperation_Remove struct {
	// Remove operation: A resource name for the removed Keyword Plan negative
	// keywords expected in this format:
	//
	// `customers/{customer_id}/keywordPlanNegativeKeywords/{kp_negative_keyword_id}`
	Remove string `protobuf:"bytes,3,opt,name=remove,proto3,oneof"`
}

func (*KeywordPlanNegativeKeywordOperation_Create) isKeywordPlanNegativeKeywordOperation_Operation() {
}

func (*KeywordPlanNegativeKeywordOperation_Update) isKeywordPlanNegativeKeywordOperation_Operation() {
}

func (*KeywordPlanNegativeKeywordOperation_Remove) isKeywordPlanNegativeKeywordOperation_Operation() {
}

// Response message for a Keyword Plan negative keyword mutate.
type MutateKeywordPlanNegativeKeywordsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Errors that pertain to operation failures in the partial failure mode.
	// Returned only when partial_failure = true and all errors occur inside the
	// operations. If any errors occur outside the operations (e.g. auth errors),
	// we return an RPC level error.
	PartialFailureError *status.Status `protobuf:"bytes,3,opt,name=partial_failure_error,json=partialFailureError,proto3" json:"partial_failure_error,omitempty"`
	// All results for the mutate.
	Results []*MutateKeywordPlanNegativeKeywordResult `protobuf:"bytes,2,rep,name=results,proto3" json:"results,omitempty"`
}

func (x *MutateKeywordPlanNegativeKeywordsResponse) Reset() {
	*x = MutateKeywordPlanNegativeKeywordsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateKeywordPlanNegativeKeywordsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateKeywordPlanNegativeKeywordsResponse) ProtoMessage() {}

func (x *MutateKeywordPlanNegativeKeywordsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateKeywordPlanNegativeKeywordsResponse.ProtoReflect.Descriptor instead.
func (*MutateKeywordPlanNegativeKeywordsResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescGZIP(), []int{3}
}

func (x *MutateKeywordPlanNegativeKeywordsResponse) GetPartialFailureError() *status.Status {
	if x != nil {
		return x.PartialFailureError
	}
	return nil
}

func (x *MutateKeywordPlanNegativeKeywordsResponse) GetResults() []*MutateKeywordPlanNegativeKeywordResult {
	if x != nil {
		return x.Results
	}
	return nil
}

// The result for the Keyword Plan negative keyword mutate.
type MutateKeywordPlanNegativeKeywordResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Returned for successful operations.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *MutateKeywordPlanNegativeKeywordResult) Reset() {
	*x = MutateKeywordPlanNegativeKeywordResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateKeywordPlanNegativeKeywordResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateKeywordPlanNegativeKeywordResult) ProtoMessage() {}

func (x *MutateKeywordPlanNegativeKeywordResult) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateKeywordPlanNegativeKeywordResult.ProtoReflect.Descriptor instead.
func (*MutateKeywordPlanNegativeKeywordResult) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescGZIP(), []int{4}
}

func (x *MutateKeywordPlanNegativeKeywordResult) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

var File_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDesc = []byte{
	0x0a, 0x4c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x5f, 0x70, 0x6c, 0x61, 0x6e, 0x5f,
	0x6e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64,
	0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x20,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x1a, 0x45, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x73, 0x2f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x5f, 0x70, 0x6c, 0x61, 0x6e,
	0x5f, 0x6e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72,
	0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64,
	0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c,
	0x64, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x88, 0x01, 0x0a, 0x24, 0x47, 0x65, 0x74, 0x4b, 0x65, 0x79,
	0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65,
	0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x60,
	0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x3b, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x35, 0x0a, 0x33, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50,
	0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f,
	0x72, 0x64, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65,
	0x22, 0x8a, 0x02, 0x0a, 0x28, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f,
	0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65,
	0x79, 0x77, 0x6f, 0x72, 0x64, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a,
	0x0b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65,
	0x72, 0x49, 0x64, 0x12, 0x6a, 0x0a, 0x0a, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x45, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76,
	0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4b, 0x65, 0x79, 0x77, 0x6f,
	0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65,
	0x79, 0x77, 0x6f, 0x72, 0x64, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x03,
	0xe0, 0x41, 0x02, 0x52, 0x0a, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12,
	0x27, 0x0a, 0x0f, 0x70, 0x61, 0x72, 0x74, 0x69, 0x61, 0x6c, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x75,
	0x72, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x61,
	0x6c, 0x46, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x12, 0x23, 0x0a, 0x0d, 0x76, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x65, 0x5f, 0x6f, 0x6e, 0x6c, 0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x08, 0x52,
	0x0c, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4f, 0x6e, 0x6c, 0x79, 0x22, 0xbb, 0x02,
	0x0a, 0x23, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67,
	0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x4f, 0x70, 0x65, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3b, 0x0a, 0x0b, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f,
	0x6d, 0x61, 0x73, 0x6b, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65,
	0x6c, 0x64, 0x4d, 0x61, 0x73, 0x6b, 0x52, 0x0a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61,
	0x73, 0x6b, 0x12, 0x57, 0x0a, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x3d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c,
	0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72,
	0x64, 0x48, 0x00, 0x52, 0x06, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x12, 0x57, 0x0a, 0x06, 0x75,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x3d, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e,
	0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74,
	0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x48, 0x00, 0x52, 0x06, 0x75, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x12, 0x18, 0x0a, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x42, 0x0b,
	0x0a, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0xd7, 0x01, 0x0a, 0x29,
	0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61,
	0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x46, 0x0a, 0x15, 0x70, 0x61, 0x72,
	0x74, 0x69, 0x61, 0x6c, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x5f, 0x65, 0x72, 0x72,
	0x6f, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x72, 0x70, 0x63, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x13, 0x70, 0x61,
	0x72, 0x74, 0x69, 0x61, 0x6c, 0x46, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x45, 0x72, 0x72, 0x6f,
	0x72, 0x12, 0x62, 0x0a, 0x07, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x48, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x77,
	0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b,
	0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x07, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x73, 0x22, 0x4d, 0x0a, 0x26, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4b,
	0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69,
	0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12,
	0x23, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x4e, 0x61, 0x6d, 0x65, 0x32, 0xe5, 0x04, 0x0a, 0x21, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64,
	0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77,
	0x6f, 0x72, 0x64, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0xfd, 0x01, 0x0a, 0x1d, 0x47,
	0x65, 0x74, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67,
	0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x46, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x47, 0x65, 0x74, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65,
	0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x3d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64,
	0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77,
	0x6f, 0x72, 0x64, 0x22, 0x55, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x3f, 0x12, 0x3d, 0x2f, 0x76, 0x33,
	0x2f, 0x7b, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x3d,
	0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73, 0x2f, 0x2a, 0x2f, 0x6b, 0x65, 0x79, 0x77,
	0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b,
	0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x0d, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0xa2, 0x02, 0x0a, 0x21, 0x4d,
	0x75, 0x74, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e,
	0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x73,
	0x12, 0x4a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72,
	0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79,
	0x77, 0x6f, 0x72, 0x64, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x4b, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61,
	0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x64, 0x82, 0xd3, 0xe4, 0x93, 0x02,
	0x45, 0x22, 0x40, 0x2f, 0x76, 0x33, 0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73,
	0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x3d, 0x2a, 0x7d,
	0x2f, 0x6b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c, 0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61,
	0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x73, 0x3a, 0x6d, 0x75, 0x74,
	0x61, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0xda, 0x41, 0x16, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65,
	0x72, 0x5f, 0x69, 0x64, 0x2c, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x1a,
	0x1b, 0xca, 0x41, 0x18, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x42, 0x8d, 0x02, 0x0a,
	0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x42, 0x26, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72, 0x64, 0x50, 0x6c,
	0x61, 0x6e, 0x4e, 0x65, 0x67, 0x61, 0x74, 0x69, 0x76, 0x65, 0x4b, 0x65, 0x79, 0x77, 0x6f, 0x72,
	0x64, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f,
	0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa,
	0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x33, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0xca, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x33, 0x5c, 0x53, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0xea, 0x02, 0x24, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a,
	0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a,
	0x56, 0x33, 0x3a, 0x3a, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescData = file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDesc
)

func file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescData)
	})
	return file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDescData
}

var file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_goTypes = []interface{}{
	(*GetKeywordPlanNegativeKeywordRequest)(nil),      // 0: google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest
	(*MutateKeywordPlanNegativeKeywordsRequest)(nil),  // 1: google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest
	(*KeywordPlanNegativeKeywordOperation)(nil),       // 2: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordOperation
	(*MutateKeywordPlanNegativeKeywordsResponse)(nil), // 3: google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse
	(*MutateKeywordPlanNegativeKeywordResult)(nil),    // 4: google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordResult
	(*fieldmaskpb.FieldMask)(nil),                     // 5: google.protobuf.FieldMask
	(*resources.KeywordPlanNegativeKeyword)(nil),      // 6: google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword
	(*status.Status)(nil),                             // 7: google.rpc.Status
}
var file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_depIdxs = []int32{
	2, // 0: google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest.operations:type_name -> google.ads.googleads.v3.services.KeywordPlanNegativeKeywordOperation
	5, // 1: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordOperation.update_mask:type_name -> google.protobuf.FieldMask
	6, // 2: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordOperation.create:type_name -> google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword
	6, // 3: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordOperation.update:type_name -> google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword
	7, // 4: google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse.partial_failure_error:type_name -> google.rpc.Status
	4, // 5: google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse.results:type_name -> google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordResult
	0, // 6: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService.GetKeywordPlanNegativeKeyword:input_type -> google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest
	1, // 7: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService.MutateKeywordPlanNegativeKeywords:input_type -> google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest
	6, // 8: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService.GetKeywordPlanNegativeKeyword:output_type -> google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword
	3, // 9: google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService.MutateKeywordPlanNegativeKeywords:output_type -> google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse
	8, // [8:10] is the sub-list for method output_type
	6, // [6:8] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_init() }
func file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_init() {
	if File_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetKeywordPlanNegativeKeywordRequest); i {
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
		file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateKeywordPlanNegativeKeywordsRequest); i {
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
		file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*KeywordPlanNegativeKeywordOperation); i {
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
		file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateKeywordPlanNegativeKeywordsResponse); i {
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
		file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateKeywordPlanNegativeKeywordResult); i {
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
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*KeywordPlanNegativeKeywordOperation_Create)(nil),
		(*KeywordPlanNegativeKeywordOperation_Update)(nil),
		(*KeywordPlanNegativeKeywordOperation_Remove)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto = out.File
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_rawDesc = nil
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_goTypes = nil
	file_google_ads_googleads_v3_services_keyword_plan_negative_keyword_service_proto_depIdxs = nil
}
