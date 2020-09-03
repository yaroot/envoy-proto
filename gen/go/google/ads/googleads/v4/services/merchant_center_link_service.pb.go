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
// source: google/ads/googleads/v4/services/merchant_center_link_service.proto

package services

import (
	proto "github.com/golang/protobuf/proto"
	resources "google.golang.org/genproto/googleapis/ads/googleads/v4/resources"
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

// Request message for [MerchantCenterLinkService.ListMerchantCenterLinks][google.ads.googleads.v4.services.MerchantCenterLinkService.ListMerchantCenterLinks].
type ListMerchantCenterLinksRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The ID of the customer onto which to apply the Merchant Center link list
	// operation.
	CustomerId string `protobuf:"bytes,1,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
}

func (x *ListMerchantCenterLinksRequest) Reset() {
	*x = ListMerchantCenterLinksRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListMerchantCenterLinksRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListMerchantCenterLinksRequest) ProtoMessage() {}

func (x *ListMerchantCenterLinksRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListMerchantCenterLinksRequest.ProtoReflect.Descriptor instead.
func (*ListMerchantCenterLinksRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{0}
}

func (x *ListMerchantCenterLinksRequest) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

// Response message for [MerchantCenterLinkService.ListMerchantCenterLinks][google.ads.googleads.v4.services.MerchantCenterLinkService.ListMerchantCenterLinks].
type ListMerchantCenterLinksResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Merchant Center links available for the requested customer
	MerchantCenterLinks []*resources.MerchantCenterLink `protobuf:"bytes,1,rep,name=merchant_center_links,json=merchantCenterLinks,proto3" json:"merchant_center_links,omitempty"`
}

func (x *ListMerchantCenterLinksResponse) Reset() {
	*x = ListMerchantCenterLinksResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListMerchantCenterLinksResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListMerchantCenterLinksResponse) ProtoMessage() {}

func (x *ListMerchantCenterLinksResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListMerchantCenterLinksResponse.ProtoReflect.Descriptor instead.
func (*ListMerchantCenterLinksResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{1}
}

func (x *ListMerchantCenterLinksResponse) GetMerchantCenterLinks() []*resources.MerchantCenterLink {
	if x != nil {
		return x.MerchantCenterLinks
	}
	return nil
}

// Request message for [MerchantCenterLinkService.GetMerchantCenterLink][google.ads.googleads.v4.services.MerchantCenterLinkService.GetMerchantCenterLink].
type GetMerchantCenterLinkRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. Resource name of the Merchant Center link.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *GetMerchantCenterLinkRequest) Reset() {
	*x = GetMerchantCenterLinkRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetMerchantCenterLinkRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetMerchantCenterLinkRequest) ProtoMessage() {}

func (x *GetMerchantCenterLinkRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetMerchantCenterLinkRequest.ProtoReflect.Descriptor instead.
func (*GetMerchantCenterLinkRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{2}
}

func (x *GetMerchantCenterLinkRequest) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

// Request message for [MerchantCenterLinkService.MutateMerchantCenterLink][google.ads.googleads.v4.services.MerchantCenterLinkService.MutateMerchantCenterLink].
type MutateMerchantCenterLinkRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The ID of the customer being modified.
	CustomerId string `protobuf:"bytes,1,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
	// Required. The operation to perform on the link
	Operation *MerchantCenterLinkOperation `protobuf:"bytes,2,opt,name=operation,proto3" json:"operation,omitempty"`
}

func (x *MutateMerchantCenterLinkRequest) Reset() {
	*x = MutateMerchantCenterLinkRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateMerchantCenterLinkRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateMerchantCenterLinkRequest) ProtoMessage() {}

func (x *MutateMerchantCenterLinkRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateMerchantCenterLinkRequest.ProtoReflect.Descriptor instead.
func (*MutateMerchantCenterLinkRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{3}
}

func (x *MutateMerchantCenterLinkRequest) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

func (x *MutateMerchantCenterLinkRequest) GetOperation() *MerchantCenterLinkOperation {
	if x != nil {
		return x.Operation
	}
	return nil
}

// A single update on a Merchant Center link.
type MerchantCenterLinkOperation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// FieldMask that determines which resource fields are modified in an update.
	UpdateMask *fieldmaskpb.FieldMask `protobuf:"bytes,3,opt,name=update_mask,json=updateMask,proto3" json:"update_mask,omitempty"`
	// The operation to perform
	//
	// Types that are assignable to Operation:
	//	*MerchantCenterLinkOperation_Update
	//	*MerchantCenterLinkOperation_Remove
	Operation isMerchantCenterLinkOperation_Operation `protobuf_oneof:"operation"`
}

func (x *MerchantCenterLinkOperation) Reset() {
	*x = MerchantCenterLinkOperation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MerchantCenterLinkOperation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MerchantCenterLinkOperation) ProtoMessage() {}

func (x *MerchantCenterLinkOperation) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MerchantCenterLinkOperation.ProtoReflect.Descriptor instead.
func (*MerchantCenterLinkOperation) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{4}
}

func (x *MerchantCenterLinkOperation) GetUpdateMask() *fieldmaskpb.FieldMask {
	if x != nil {
		return x.UpdateMask
	}
	return nil
}

func (m *MerchantCenterLinkOperation) GetOperation() isMerchantCenterLinkOperation_Operation {
	if m != nil {
		return m.Operation
	}
	return nil
}

func (x *MerchantCenterLinkOperation) GetUpdate() *resources.MerchantCenterLink {
	if x, ok := x.GetOperation().(*MerchantCenterLinkOperation_Update); ok {
		return x.Update
	}
	return nil
}

func (x *MerchantCenterLinkOperation) GetRemove() string {
	if x, ok := x.GetOperation().(*MerchantCenterLinkOperation_Remove); ok {
		return x.Remove
	}
	return ""
}

type isMerchantCenterLinkOperation_Operation interface {
	isMerchantCenterLinkOperation_Operation()
}

type MerchantCenterLinkOperation_Update struct {
	// Update operation: The merchant center link is expected to have a valid
	// resource name.
	Update *resources.MerchantCenterLink `protobuf:"bytes,1,opt,name=update,proto3,oneof"`
}

type MerchantCenterLinkOperation_Remove struct {
	// Remove operation: A resource name for the removed merchant center link is
	// expected, in this format:
	//
	// `customers/{customer_id}/merchantCenterLinks/{merchant_center_id}`
	Remove string `protobuf:"bytes,2,opt,name=remove,proto3,oneof"`
}

func (*MerchantCenterLinkOperation_Update) isMerchantCenterLinkOperation_Operation() {}

func (*MerchantCenterLinkOperation_Remove) isMerchantCenterLinkOperation_Operation() {}

// Response message for Merchant Center link mutate.
type MutateMerchantCenterLinkResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Result for the mutate.
	Result *MutateMerchantCenterLinkResult `protobuf:"bytes,2,opt,name=result,proto3" json:"result,omitempty"`
}

func (x *MutateMerchantCenterLinkResponse) Reset() {
	*x = MutateMerchantCenterLinkResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateMerchantCenterLinkResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateMerchantCenterLinkResponse) ProtoMessage() {}

func (x *MutateMerchantCenterLinkResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateMerchantCenterLinkResponse.ProtoReflect.Descriptor instead.
func (*MutateMerchantCenterLinkResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{5}
}

func (x *MutateMerchantCenterLinkResponse) GetResult() *MutateMerchantCenterLinkResult {
	if x != nil {
		return x.Result
	}
	return nil
}

// The result for the Merchant Center link mutate.
type MutateMerchantCenterLinkResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Returned for successful operations.
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
}

func (x *MutateMerchantCenterLinkResult) Reset() {
	*x = MutateMerchantCenterLinkResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MutateMerchantCenterLinkResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MutateMerchantCenterLinkResult) ProtoMessage() {}

func (x *MutateMerchantCenterLinkResult) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MutateMerchantCenterLinkResult.ProtoReflect.Descriptor instead.
func (*MutateMerchantCenterLinkResult) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP(), []int{6}
}

func (x *MutateMerchantCenterLinkResult) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

var File_google_ads_googleads_v4_services_merchant_center_link_service_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDesc = []byte{
	0x0a, 0x43, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2f, 0x6d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x5f, 0x63, 0x65, 0x6e, 0x74,
	0x65, 0x72, 0x5f, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x1a, 0x3c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34,
	0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2f, 0x6d, 0x65, 0x72, 0x63, 0x68,
	0x61, 0x6e, 0x74, 0x5f, 0x63, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x6e, 0x6b, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62,
	0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f,
	0x6d, 0x61, 0x73, 0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x46, 0x0a, 0x1e, 0x4c, 0x69,
	0x73, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72,
	0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x0b,
	0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72,
	0x49, 0x64, 0x22, 0x8c, 0x01, 0x0a, 0x1f, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68,
	0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x69, 0x0a, 0x15, 0x6d, 0x65, 0x72, 0x63, 0x68, 0x61,
	0x6e, 0x74, 0x5f, 0x63, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x6e, 0x6b, 0x73, 0x18,
	0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x35, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61,
	0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x13, 0x6d, 0x65,
	0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b,
	0x73, 0x22, 0x78, 0x0a, 0x1c, 0x47, 0x65, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74,
	0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x58, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x33, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x2d,
	0x0a, 0x2b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x4d, 0x65, 0x72, 0x63, 0x68,
	0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x0c, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x22, 0xa9, 0x01, 0x0a, 0x1f,
	0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65,
	0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12,
	0x24, 0x0a, 0x0b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a, 0x63, 0x75, 0x73, 0x74, 0x6f,
	0x6d, 0x65, 0x72, 0x49, 0x64, 0x12, 0x60, 0x0a, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x3d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x76, 0x34, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x65, 0x72, 0x63,
	0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x4f, 0x70,
	0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x09, 0x6f, 0x70,
	0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0xd2, 0x01, 0x0a, 0x1b, 0x4d, 0x65, 0x72, 0x63,
	0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x4f, 0x70,
	0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3b, 0x0a, 0x0b, 0x75, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46,
	0x69, 0x65, 0x6c, 0x64, 0x4d, 0x61, 0x73, 0x6b, 0x52, 0x0a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x4d, 0x61, 0x73, 0x6b, 0x12, 0x4f, 0x0a, 0x06, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x35, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e,
	0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x48, 0x00, 0x52, 0x06, 0x75,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x12, 0x18, 0x0a, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x06, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x42,
	0x0b, 0x0a, 0x09, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x7c, 0x0a, 0x20,
	0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65,
	0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x58, 0x0a, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x40, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61,
	0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x73, 0x75,
	0x6c, 0x74, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x22, 0x45, 0x0a, 0x1e, 0x4d, 0x75,
	0x74, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74,
	0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x23, 0x0a, 0x0d,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d,
	0x65, 0x32, 0x83, 0x06, 0x0a, 0x19, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65,
	0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12,
	0xe7, 0x01, 0x0a, 0x17, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74,
	0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x12, 0x40, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4c,
	0x69, 0x73, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65,
	0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x41, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2e, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e,
	0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x22, 0x47, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x33, 0x12, 0x31, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x75,
	0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65,
	0x72, 0x5f, 0x69, 0x64, 0x3d, 0x2a, 0x7d, 0x2f, 0x6d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74,
	0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0xda, 0x41, 0x0b, 0x63, 0x75,
	0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x12, 0xdd, 0x01, 0x0a, 0x15, 0x47, 0x65,
	0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c,
	0x69, 0x6e, 0x6b, 0x12, 0x3e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x74, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61,
	0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x35, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74,
	0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x22, 0x4d, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x37, 0x12, 0x35, 0x2f, 0x76, 0x34, 0x2f, 0x7b, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73,
	0x2f, 0x2a, 0x2f, 0x6d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65,
	0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x0d, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0xfe, 0x01, 0x0a, 0x18, 0x4d, 0x75,
	0x74, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74,
	0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x12, 0x41, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34,
	0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74, 0x61, 0x74, 0x65,
	0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x4c, 0x69,
	0x6e, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x42, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x34, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x4d, 0x75, 0x74,
	0x61, 0x74, 0x65, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65,
	0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x5b, 0x82,
	0xd3, 0xe4, 0x93, 0x02, 0x3d, 0x22, 0x38, 0x2f, 0x76, 0x34, 0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f,
	0x6d, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69,
	0x64, 0x3d, 0x2a, 0x7d, 0x2f, 0x6d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e,
	0x74, 0x65, 0x72, 0x4c, 0x69, 0x6e, 0x6b, 0x73, 0x3a, 0x6d, 0x75, 0x74, 0x61, 0x74, 0x65, 0x3a,
	0x01, 0x2a, 0xda, 0x41, 0x15, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64,
	0x2c, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x1a, 0x1b, 0xca, 0x41, 0x18, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x42, 0x85, 0x02, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x34, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x42, 0x1e, 0x4d, 0x65, 0x72, 0x63, 0x68, 0x61, 0x6e, 0x74, 0x43, 0x65, 0x6e, 0x74, 0x65, 0x72,
	0x4c, 0x69, 0x6e, 0x6b, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e,
	0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x34, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47,
	0x41, 0x41, 0xaa, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x34, 0x2e, 0x53, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0xca, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41,
	0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x34, 0x5c,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0xea, 0x02, 0x24, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64,
	0x73, 0x3a, 0x3a, 0x56, 0x34, 0x3a, 0x3a, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescData = file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDesc
)

func file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescData)
	})
	return file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDescData
}

var file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_google_ads_googleads_v4_services_merchant_center_link_service_proto_goTypes = []interface{}{
	(*ListMerchantCenterLinksRequest)(nil),   // 0: google.ads.googleads.v4.services.ListMerchantCenterLinksRequest
	(*ListMerchantCenterLinksResponse)(nil),  // 1: google.ads.googleads.v4.services.ListMerchantCenterLinksResponse
	(*GetMerchantCenterLinkRequest)(nil),     // 2: google.ads.googleads.v4.services.GetMerchantCenterLinkRequest
	(*MutateMerchantCenterLinkRequest)(nil),  // 3: google.ads.googleads.v4.services.MutateMerchantCenterLinkRequest
	(*MerchantCenterLinkOperation)(nil),      // 4: google.ads.googleads.v4.services.MerchantCenterLinkOperation
	(*MutateMerchantCenterLinkResponse)(nil), // 5: google.ads.googleads.v4.services.MutateMerchantCenterLinkResponse
	(*MutateMerchantCenterLinkResult)(nil),   // 6: google.ads.googleads.v4.services.MutateMerchantCenterLinkResult
	(*resources.MerchantCenterLink)(nil),     // 7: google.ads.googleads.v4.resources.MerchantCenterLink
	(*fieldmaskpb.FieldMask)(nil),            // 8: google.protobuf.FieldMask
}
var file_google_ads_googleads_v4_services_merchant_center_link_service_proto_depIdxs = []int32{
	7, // 0: google.ads.googleads.v4.services.ListMerchantCenterLinksResponse.merchant_center_links:type_name -> google.ads.googleads.v4.resources.MerchantCenterLink
	4, // 1: google.ads.googleads.v4.services.MutateMerchantCenterLinkRequest.operation:type_name -> google.ads.googleads.v4.services.MerchantCenterLinkOperation
	8, // 2: google.ads.googleads.v4.services.MerchantCenterLinkOperation.update_mask:type_name -> google.protobuf.FieldMask
	7, // 3: google.ads.googleads.v4.services.MerchantCenterLinkOperation.update:type_name -> google.ads.googleads.v4.resources.MerchantCenterLink
	6, // 4: google.ads.googleads.v4.services.MutateMerchantCenterLinkResponse.result:type_name -> google.ads.googleads.v4.services.MutateMerchantCenterLinkResult
	0, // 5: google.ads.googleads.v4.services.MerchantCenterLinkService.ListMerchantCenterLinks:input_type -> google.ads.googleads.v4.services.ListMerchantCenterLinksRequest
	2, // 6: google.ads.googleads.v4.services.MerchantCenterLinkService.GetMerchantCenterLink:input_type -> google.ads.googleads.v4.services.GetMerchantCenterLinkRequest
	3, // 7: google.ads.googleads.v4.services.MerchantCenterLinkService.MutateMerchantCenterLink:input_type -> google.ads.googleads.v4.services.MutateMerchantCenterLinkRequest
	1, // 8: google.ads.googleads.v4.services.MerchantCenterLinkService.ListMerchantCenterLinks:output_type -> google.ads.googleads.v4.services.ListMerchantCenterLinksResponse
	7, // 9: google.ads.googleads.v4.services.MerchantCenterLinkService.GetMerchantCenterLink:output_type -> google.ads.googleads.v4.resources.MerchantCenterLink
	5, // 10: google.ads.googleads.v4.services.MerchantCenterLinkService.MutateMerchantCenterLink:output_type -> google.ads.googleads.v4.services.MutateMerchantCenterLinkResponse
	8, // [8:11] is the sub-list for method output_type
	5, // [5:8] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v4_services_merchant_center_link_service_proto_init() }
func file_google_ads_googleads_v4_services_merchant_center_link_service_proto_init() {
	if File_google_ads_googleads_v4_services_merchant_center_link_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListMerchantCenterLinksRequest); i {
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
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListMerchantCenterLinksResponse); i {
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
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetMerchantCenterLinkRequest); i {
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
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateMerchantCenterLinkRequest); i {
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
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MerchantCenterLinkOperation); i {
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
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateMerchantCenterLinkResponse); i {
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
		file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MutateMerchantCenterLinkResult); i {
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
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes[4].OneofWrappers = []interface{}{
		(*MerchantCenterLinkOperation_Update)(nil),
		(*MerchantCenterLinkOperation_Remove)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_ads_googleads_v4_services_merchant_center_link_service_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v4_services_merchant_center_link_service_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v4_services_merchant_center_link_service_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v4_services_merchant_center_link_service_proto = out.File
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_rawDesc = nil
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_goTypes = nil
	file_google_ads_googleads_v4_services_merchant_center_link_service_proto_depIdxs = nil
}
