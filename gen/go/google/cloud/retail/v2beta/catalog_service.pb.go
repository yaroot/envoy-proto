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
// source: google/cloud/retail/v2beta/catalog_service.proto

package retail

import (
	proto "github.com/golang/protobuf/proto"
	_ "github.com/golang/protobuf/ptypes/empty"
	_ "github.com/golang/protobuf/ptypes/timestamp"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	field_mask "google.golang.org/genproto/protobuf/field_mask"
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

// Request for
// [CatalogService.ListCatalogs][google.cloud.retail.v2beta.CatalogService.ListCatalogs]
// method.
type ListCatalogsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The account resource name with an associated location.
	//
	// If the caller does not have permission to list
	// [Catalog][google.cloud.retail.v2beta.Catalog]s under this location,
	// regardless of whether or not this location exists, a PERMISSION_DENIED
	// error is returned.
	Parent string `protobuf:"bytes,1,opt,name=parent,proto3" json:"parent,omitempty"`
	// Maximum number of [Catalog][google.cloud.retail.v2beta.Catalog]s to return.
	// If unspecified, defaults to 50. The maximum allowed value is 1000. Values
	// above 1000 will be coerced to 1000.
	//
	// If this field is negative, an INVALID_ARGUMENT is returned.
	PageSize int32 `protobuf:"varint,2,opt,name=page_size,json=pageSize,proto3" json:"page_size,omitempty"`
	// A page token
	// [ListCatalogsResponse.next_page_token][google.cloud.retail.v2beta.ListCatalogsResponse.next_page_token],
	// received from a previous
	// [CatalogService.ListCatalogs][google.cloud.retail.v2beta.CatalogService.ListCatalogs]
	// call. Provide this to retrieve the subsequent page.
	//
	// When paginating, all other parameters provided to
	// [CatalogService.ListCatalogs][google.cloud.retail.v2beta.CatalogService.ListCatalogs]
	// must match the call that provided the page token. Otherwise, an
	// INVALID_ARGUMENT error is returned.
	PageToken string `protobuf:"bytes,3,opt,name=page_token,json=pageToken,proto3" json:"page_token,omitempty"`
}

func (x *ListCatalogsRequest) Reset() {
	*x = ListCatalogsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListCatalogsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListCatalogsRequest) ProtoMessage() {}

func (x *ListCatalogsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListCatalogsRequest.ProtoReflect.Descriptor instead.
func (*ListCatalogsRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_catalog_service_proto_rawDescGZIP(), []int{0}
}

func (x *ListCatalogsRequest) GetParent() string {
	if x != nil {
		return x.Parent
	}
	return ""
}

func (x *ListCatalogsRequest) GetPageSize() int32 {
	if x != nil {
		return x.PageSize
	}
	return 0
}

func (x *ListCatalogsRequest) GetPageToken() string {
	if x != nil {
		return x.PageToken
	}
	return ""
}

// Response for
// [CatalogService.ListCatalogs][google.cloud.retail.v2beta.CatalogService.ListCatalogs]
// method.
type ListCatalogsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// All the customer's [Catalog][google.cloud.retail.v2beta.Catalog]s.
	Catalogs []*Catalog `protobuf:"bytes,1,rep,name=catalogs,proto3" json:"catalogs,omitempty"`
	// A token that can be sent as
	// [ListCatalogsRequest.page_token][google.cloud.retail.v2beta.ListCatalogsRequest.page_token]
	// to retrieve the next page. If this field is omitted, there are no
	// subsequent pages.
	NextPageToken string `protobuf:"bytes,2,opt,name=next_page_token,json=nextPageToken,proto3" json:"next_page_token,omitempty"`
}

func (x *ListCatalogsResponse) Reset() {
	*x = ListCatalogsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListCatalogsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListCatalogsResponse) ProtoMessage() {}

func (x *ListCatalogsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListCatalogsResponse.ProtoReflect.Descriptor instead.
func (*ListCatalogsResponse) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_catalog_service_proto_rawDescGZIP(), []int{1}
}

func (x *ListCatalogsResponse) GetCatalogs() []*Catalog {
	if x != nil {
		return x.Catalogs
	}
	return nil
}

func (x *ListCatalogsResponse) GetNextPageToken() string {
	if x != nil {
		return x.NextPageToken
	}
	return ""
}

// Request for
// [CatalogService.UpdateCatalog][google.cloud.retail.v2beta.CatalogService.UpdateCatalog]
// method.
type UpdateCatalogRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The [Catalog][google.cloud.retail.v2beta.Catalog] to update.
	//
	// If the caller does not have permission to update the
	// [Catalog][google.cloud.retail.v2beta.Catalog], regardless of whether or not
	// it exists, a PERMISSION_DENIED error is returned.
	//
	// If the [Catalog][google.cloud.retail.v2beta.Catalog] to update does not
	// exist, a NOT_FOUND error is returned.
	Catalog *Catalog `protobuf:"bytes,1,opt,name=catalog,proto3" json:"catalog,omitempty"`
	// Indicates which fields in the provided
	// [Catalog][google.cloud.retail.v2beta.Catalog] to update. If not set, will
	// only update the
	// [Catalog.product_level_config][google.cloud.retail.v2beta.Catalog.product_level_config]
	// field, which is also the only currently supported field to update.
	//
	// If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
	// is returned.
	UpdateMask *field_mask.FieldMask `protobuf:"bytes,2,opt,name=update_mask,json=updateMask,proto3" json:"update_mask,omitempty"`
}

func (x *UpdateCatalogRequest) Reset() {
	*x = UpdateCatalogRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateCatalogRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateCatalogRequest) ProtoMessage() {}

func (x *UpdateCatalogRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateCatalogRequest.ProtoReflect.Descriptor instead.
func (*UpdateCatalogRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_catalog_service_proto_rawDescGZIP(), []int{2}
}

func (x *UpdateCatalogRequest) GetCatalog() *Catalog {
	if x != nil {
		return x.Catalog
	}
	return nil
}

func (x *UpdateCatalogRequest) GetUpdateMask() *field_mask.FieldMask {
	if x != nil {
		return x.UpdateMask
	}
	return nil
}

var File_google_cloud_retail_v2beta_catalog_service_proto protoreflect.FileDescriptor

var file_google_cloud_retail_v2beta_catalog_service_proto_rawDesc = []byte{
	0x0a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x72,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x63, 0x61, 0x74,
	0x61, 0x6c, 0x6f, 0x67, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x1a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x1a, 0x1c,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x28, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f,
	0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x63, 0x61,
	0x74, 0x61, 0x6c, 0x6f, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70,
	0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f,
	0x6d, 0x61, 0x73, 0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65,
	0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x94, 0x01, 0x0a, 0x13,
	0x4c, 0x69, 0x73, 0x74, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x41, 0x0a, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x29, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x23, 0x0a, 0x21, 0x6c, 0x6f, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69,
	0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x06,
	0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0x1b, 0x0a, 0x09, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x73,
	0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x08, 0x70, 0x61, 0x67, 0x65, 0x53,
	0x69, 0x7a, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b, 0x65,
	0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x70, 0x61, 0x67, 0x65, 0x54, 0x6f, 0x6b,
	0x65, 0x6e, 0x22, 0x7f, 0x0a, 0x14, 0x4c, 0x69, 0x73, 0x74, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f,
	0x67, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3f, 0x0a, 0x08, 0x63, 0x61,
	0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61,
	0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f,
	0x67, 0x52, 0x08, 0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0x12, 0x26, 0x0a, 0x0f, 0x6e,
	0x65, 0x78, 0x74, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6e, 0x65, 0x78, 0x74, 0x50, 0x61, 0x67, 0x65, 0x54, 0x6f,
	0x6b, 0x65, 0x6e, 0x22, 0x97, 0x01, 0x0a, 0x14, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x43, 0x61,
	0x74, 0x61, 0x6c, 0x6f, 0x67, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x42, 0x0a, 0x07,
	0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x43, 0x61, 0x74, 0x61, 0x6c,
	0x6f, 0x67, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x07, 0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67,
	0x12, 0x3b, 0x0a, 0x0b, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4d, 0x61, 0x73,
	0x6b, 0x52, 0x0a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x73, 0x6b, 0x32, 0xdc, 0x03,
	0x0a, 0x0e, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x12, 0xb4, 0x01, 0x0a, 0x0c, 0x4c, 0x69, 0x73, 0x74, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67,
	0x73, 0x12, 0x2f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c,
	0x69, 0x73, 0x74, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x30, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x41, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x32, 0x12, 0x30, 0x2f, 0x76,
	0x32, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72,
	0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x2f, 0x2a, 0x7d, 0x2f, 0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0xda, 0x41,
	0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0xc7, 0x01, 0x0a, 0x0d, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x12, 0x30, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e,
	0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x43, 0x61, 0x74,
	0x61, 0x6c, 0x6f, 0x67, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x23, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69,
	0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67,
	0x22, 0x5f, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x43, 0x32, 0x38, 0x2f, 0x76, 0x32, 0x62, 0x65, 0x74,
	0x61, 0x2f, 0x7b, 0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x2e, 0x6e, 0x61, 0x6d, 0x65, 0x3d,
	0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x6c, 0x6f, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x2f, 0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x73, 0x2f,
	0x2a, 0x7d, 0x3a, 0x07, 0x63, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0xda, 0x41, 0x13, 0x63, 0x61,
	0x74, 0x61, 0x6c, 0x6f, 0x67, 0x2c, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x6d, 0x61, 0x73,
	0x6b, 0x1a, 0x49, 0xca, 0x41, 0x15, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0xd2, 0x41, 0x2e, 0x68, 0x74,
	0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77, 0x77, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x2f, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2d, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d, 0x42, 0xdc, 0x01, 0x0a,
	0x1e, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x42,
	0x13, 0x43, 0x61, 0x74, 0x61, 0x6c, 0x6f, 0x67, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x40, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67,
	0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2f, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x62, 0x65, 0x74,
	0x61, 0x3b, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0xa2, 0x02, 0x06, 0x52, 0x45, 0x54, 0x41, 0x49,
	0x4c, 0xaa, 0x02, 0x1a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x52, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x56, 0x32, 0x42, 0x65, 0x74, 0x61, 0xca, 0x02,
	0x1a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x52, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0x5c, 0x56, 0x32, 0x62, 0x65, 0x74, 0x61, 0xea, 0x02, 0x1d, 0x47, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x52, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x3a, 0x3a, 0x56, 0x32, 0x62, 0x65, 0x74, 0x61, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_retail_v2beta_catalog_service_proto_rawDescOnce sync.Once
	file_google_cloud_retail_v2beta_catalog_service_proto_rawDescData = file_google_cloud_retail_v2beta_catalog_service_proto_rawDesc
)

func file_google_cloud_retail_v2beta_catalog_service_proto_rawDescGZIP() []byte {
	file_google_cloud_retail_v2beta_catalog_service_proto_rawDescOnce.Do(func() {
		file_google_cloud_retail_v2beta_catalog_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_retail_v2beta_catalog_service_proto_rawDescData)
	})
	return file_google_cloud_retail_v2beta_catalog_service_proto_rawDescData
}

var file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_google_cloud_retail_v2beta_catalog_service_proto_goTypes = []interface{}{
	(*ListCatalogsRequest)(nil),  // 0: google.cloud.retail.v2beta.ListCatalogsRequest
	(*ListCatalogsResponse)(nil), // 1: google.cloud.retail.v2beta.ListCatalogsResponse
	(*UpdateCatalogRequest)(nil), // 2: google.cloud.retail.v2beta.UpdateCatalogRequest
	(*Catalog)(nil),              // 3: google.cloud.retail.v2beta.Catalog
	(*field_mask.FieldMask)(nil), // 4: google.protobuf.FieldMask
}
var file_google_cloud_retail_v2beta_catalog_service_proto_depIdxs = []int32{
	3, // 0: google.cloud.retail.v2beta.ListCatalogsResponse.catalogs:type_name -> google.cloud.retail.v2beta.Catalog
	3, // 1: google.cloud.retail.v2beta.UpdateCatalogRequest.catalog:type_name -> google.cloud.retail.v2beta.Catalog
	4, // 2: google.cloud.retail.v2beta.UpdateCatalogRequest.update_mask:type_name -> google.protobuf.FieldMask
	0, // 3: google.cloud.retail.v2beta.CatalogService.ListCatalogs:input_type -> google.cloud.retail.v2beta.ListCatalogsRequest
	2, // 4: google.cloud.retail.v2beta.CatalogService.UpdateCatalog:input_type -> google.cloud.retail.v2beta.UpdateCatalogRequest
	1, // 5: google.cloud.retail.v2beta.CatalogService.ListCatalogs:output_type -> google.cloud.retail.v2beta.ListCatalogsResponse
	3, // 6: google.cloud.retail.v2beta.CatalogService.UpdateCatalog:output_type -> google.cloud.retail.v2beta.Catalog
	5, // [5:7] is the sub-list for method output_type
	3, // [3:5] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_google_cloud_retail_v2beta_catalog_service_proto_init() }
func file_google_cloud_retail_v2beta_catalog_service_proto_init() {
	if File_google_cloud_retail_v2beta_catalog_service_proto != nil {
		return
	}
	file_google_cloud_retail_v2beta_catalog_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListCatalogsRequest); i {
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
		file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListCatalogsResponse); i {
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
		file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateCatalogRequest); i {
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
			RawDescriptor: file_google_cloud_retail_v2beta_catalog_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_cloud_retail_v2beta_catalog_service_proto_goTypes,
		DependencyIndexes: file_google_cloud_retail_v2beta_catalog_service_proto_depIdxs,
		MessageInfos:      file_google_cloud_retail_v2beta_catalog_service_proto_msgTypes,
	}.Build()
	File_google_cloud_retail_v2beta_catalog_service_proto = out.File
	file_google_cloud_retail_v2beta_catalog_service_proto_rawDesc = nil
	file_google_cloud_retail_v2beta_catalog_service_proto_goTypes = nil
	file_google_cloud_retail_v2beta_catalog_service_proto_depIdxs = nil
}
