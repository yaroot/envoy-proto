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
// source: google/cloud/retail/v2beta/common.proto

package retail

import (
	proto "github.com/golang/protobuf/proto"
	_ "github.com/golang/protobuf/ptypes/timestamp"
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

// A custom attribute that is not explicitly modeled in
// [Product][google.cloud.retail.v2beta.Product]].
type CustomAttribute struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The textual values of this custom attribute. For example, `["yellow",
	// "green"]` when the key is "color".
	//
	// At most 400 values are allowed. Empty values are not allowed. Each value
	// must be a UTF-8 encoded string with a length limit of 256 characters.
	// Otherwise, an INVALID_ARGUMENT error is returned.
	//
	// Exactly one of [text][google.cloud.retail.v2beta.CustomAttribute.text] or
	// [numbers][google.cloud.retail.v2beta.CustomAttribute.numbers] should be
	// set. Otherwise, an INVALID_ARGUMENT error is returned.
	Text []string `protobuf:"bytes,1,rep,name=text,proto3" json:"text,omitempty"`
	// The numerical values of this custom attribute. For example, `[2.3, 15.4]`
	// when the key is "lengths_cm".
	//
	// At most 400 values are allowed.Otherwise, an INVALID_ARGUMENT error is
	// returned.
	//
	// Exactly one of [text][google.cloud.retail.v2beta.CustomAttribute.text] or
	// [numbers][google.cloud.retail.v2beta.CustomAttribute.numbers] should be
	// set. Otherwise, an INVALID_ARGUMENT error is returned.
	Numbers []float64 `protobuf:"fixed64,2,rep,packed,name=numbers,proto3" json:"numbers,omitempty"`
}

func (x *CustomAttribute) Reset() {
	*x = CustomAttribute{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CustomAttribute) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CustomAttribute) ProtoMessage() {}

func (x *CustomAttribute) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CustomAttribute.ProtoReflect.Descriptor instead.
func (*CustomAttribute) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_common_proto_rawDescGZIP(), []int{0}
}

func (x *CustomAttribute) GetText() []string {
	if x != nil {
		return x.Text
	}
	return nil
}

func (x *CustomAttribute) GetNumbers() []float64 {
	if x != nil {
		return x.Numbers
	}
	return nil
}

// [Product][google.cloud.retail.v2beta.Product] thumbnail/detail image.
type Image struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. URI of the image.
	//
	// This field must be a valid UTF-8 encoded URI with a length limit of 5,000
	// characters. Otherwise, an INVALID_ARGUMENT error is returned.
	//
	// Google Merchant Center property
	// [image_link](https://support.google.com/merchants/answer/6324350).
	// Schema.org property [Product.image](https://schema.org/image).
	Uri string `protobuf:"bytes,1,opt,name=uri,proto3" json:"uri,omitempty"`
	// Height of the image in number of pixels.
	//
	// This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
	// returned.
	Height int32 `protobuf:"varint,2,opt,name=height,proto3" json:"height,omitempty"`
	// Width of the image in number of pixels.
	//
	// This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
	// returned.
	Width int32 `protobuf:"varint,3,opt,name=width,proto3" json:"width,omitempty"`
}

func (x *Image) Reset() {
	*x = Image{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Image) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Image) ProtoMessage() {}

func (x *Image) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Image.ProtoReflect.Descriptor instead.
func (*Image) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_common_proto_rawDescGZIP(), []int{1}
}

func (x *Image) GetUri() string {
	if x != nil {
		return x.Uri
	}
	return ""
}

func (x *Image) GetHeight() int32 {
	if x != nil {
		return x.Height
	}
	return 0
}

func (x *Image) GetWidth() int32 {
	if x != nil {
		return x.Width
	}
	return 0
}

// The price information of a [Product][google.cloud.retail.v2beta.Product].
type PriceInfo struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The 3-letter currency code defined in [ISO
	// 4217](https://www.iso.org/iso-4217-currency-codes.html).
	//
	// If this field is an unrecognizable currency code, an INVALID_ARGUMENT
	// error is returned.
	CurrencyCode string `protobuf:"bytes,1,opt,name=currency_code,json=currencyCode,proto3" json:"currency_code,omitempty"`
	// Price of the product.
	//
	// Google Merchant Center property
	// [price](https://support.google.com/merchants/answer/6324371). Schema.org
	// property [Offer.priceSpecification](https://schema.org/priceSpecification).
	Price float32 `protobuf:"fixed32,2,opt,name=price,proto3" json:"price,omitempty"`
	// Price of the product without any discount. If zero, by default set to be
	// the [price][google.cloud.retail.v2beta.PriceInfo.price].
	OriginalPrice float32 `protobuf:"fixed32,3,opt,name=original_price,json=originalPrice,proto3" json:"original_price,omitempty"`
	// The costs associated with the sale of a particular product. Used for gross
	// profit reporting.
	//
	// * Profit = [price][google.cloud.retail.v2beta.PriceInfo.price] -
	// [cost][google.cloud.retail.v2beta.PriceInfo.cost]
	//
	// Google Merchant Center property
	// [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
	Cost float32 `protobuf:"fixed32,4,opt,name=cost,proto3" json:"cost,omitempty"`
}

func (x *PriceInfo) Reset() {
	*x = PriceInfo{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PriceInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PriceInfo) ProtoMessage() {}

func (x *PriceInfo) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PriceInfo.ProtoReflect.Descriptor instead.
func (*PriceInfo) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_common_proto_rawDescGZIP(), []int{2}
}

func (x *PriceInfo) GetCurrencyCode() string {
	if x != nil {
		return x.CurrencyCode
	}
	return ""
}

func (x *PriceInfo) GetPrice() float32 {
	if x != nil {
		return x.Price
	}
	return 0
}

func (x *PriceInfo) GetOriginalPrice() float32 {
	if x != nil {
		return x.OriginalPrice
	}
	return 0
}

func (x *PriceInfo) GetCost() float32 {
	if x != nil {
		return x.Cost
	}
	return 0
}

// Information of an end user.
type UserInfo struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Highly recommended for logged-in users. Unique identifier for logged-in
	// user, such as a user name.
	//
	// The field must be a UTF-8 encoded string with a length limit of 128
	// characters. Otherwise, an INVALID_ARGUMENT error is returned.
	UserId string `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	// The end user's IP address. This field is used to extract location
	// information for personalization.
	//
	// This field must be either an IPv4 address (e.g. "104.133.9.80") or an IPv6
	// address (e.g. "2001:0db8:85a3:0000:0000:8a2e:0370:7334"). Otherwise, an
	// INVALID_ARGUMENT error is returned.
	//
	// This should not be set when using the JavaScript tag in
	// [UserEventService.CollectUserEvent][google.cloud.retail.v2beta.UserEventService.CollectUserEvent]
	// or if
	// [direct_user_request][google.cloud.retail.v2beta.UserInfo.direct_user_request]
	// is set.
	IpAddress string `protobuf:"bytes,2,opt,name=ip_address,json=ipAddress,proto3" json:"ip_address,omitempty"`
	// User agent as included in the HTTP header.
	//
	// The field must be a UTF-8 encoded string with a length limit of 1,000
	// characters. Otherwise, an INVALID_ARGUMENT error is returned.
	//
	// This should not be set when using the client side event reporting with
	// GTM or JavaScript tag in
	// [UserEventService.CollectUserEvent][google.cloud.retail.v2beta.UserEventService.CollectUserEvent]
	// or if
	// [direct_user_request][google.cloud.retail.v2beta.UserInfo.direct_user_request]
	// is set.
	UserAgent string `protobuf:"bytes,3,opt,name=user_agent,json=userAgent,proto3" json:"user_agent,omitempty"`
	// True if the request is made directly from the end user, in which case the
	// [ip_address][google.cloud.retail.v2beta.UserInfo.ip_address] and
	// [user_agent][google.cloud.retail.v2beta.UserInfo.user_agent] can be
	// populated from the HTTP request. This flag should be set only if the API
	// request is made directly from the end user such as a mobile app (and not if
	// a gateway or a server is processing and pushing the user events).
	//
	// This should not be set when using the JavaScript tag in
	// [UserEventService.CollectUserEvent][google.cloud.retail.v2beta.UserEventService.CollectUserEvent].
	DirectUserRequest bool `protobuf:"varint,4,opt,name=direct_user_request,json=directUserRequest,proto3" json:"direct_user_request,omitempty"`
}

func (x *UserInfo) Reset() {
	*x = UserInfo{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserInfo) ProtoMessage() {}

func (x *UserInfo) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2beta_common_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserInfo.ProtoReflect.Descriptor instead.
func (*UserInfo) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2beta_common_proto_rawDescGZIP(), []int{3}
}

func (x *UserInfo) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *UserInfo) GetIpAddress() string {
	if x != nil {
		return x.IpAddress
	}
	return ""
}

func (x *UserInfo) GetUserAgent() string {
	if x != nil {
		return x.UserAgent
	}
	return ""
}

func (x *UserInfo) GetDirectUserRequest() bool {
	if x != nil {
		return x.DirectUserRequest
	}
	return false
}

var File_google_cloud_retail_v2beta_common_proto protoreflect.FileDescriptor

var file_google_cloud_retail_v2beta_common_proto_rawDesc = []byte{
	0x0a, 0x27, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x72,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1a, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76,
	0x32, 0x62, 0x65, 0x74, 0x61, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x3f, 0x0a, 0x0f, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x41,
	0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74,
	0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x12, 0x18, 0x0a, 0x07,
	0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x01, 0x52, 0x07, 0x6e,
	0x75, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x22, 0x4c, 0x0a, 0x05, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x12,
	0x15, 0x0a, 0x03, 0x75, 0x72, 0x69, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41,
	0x02, 0x52, 0x03, 0x75, 0x72, 0x69, 0x12, 0x16, 0x0a, 0x06, 0x68, 0x65, 0x69, 0x67, 0x68, 0x74,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x68, 0x65, 0x69, 0x67, 0x68, 0x74, 0x12, 0x14,
	0x0a, 0x05, 0x77, 0x69, 0x64, 0x74, 0x68, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x05, 0x77,
	0x69, 0x64, 0x74, 0x68, 0x22, 0x81, 0x01, 0x0a, 0x09, 0x50, 0x72, 0x69, 0x63, 0x65, 0x49, 0x6e,
	0x66, 0x6f, 0x12, 0x23, 0x0a, 0x0d, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x5f, 0x63,
	0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x63, 0x75, 0x72, 0x72, 0x65,
	0x6e, 0x63, 0x79, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x70, 0x72, 0x69, 0x63, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x02, 0x52, 0x05, 0x70, 0x72, 0x69, 0x63, 0x65, 0x12, 0x25, 0x0a,
	0x0e, 0x6f, 0x72, 0x69, 0x67, 0x69, 0x6e, 0x61, 0x6c, 0x5f, 0x70, 0x72, 0x69, 0x63, 0x65, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x02, 0x52, 0x0d, 0x6f, 0x72, 0x69, 0x67, 0x69, 0x6e, 0x61, 0x6c, 0x50,
	0x72, 0x69, 0x63, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x63, 0x6f, 0x73, 0x74, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x02, 0x52, 0x04, 0x63, 0x6f, 0x73, 0x74, 0x22, 0x91, 0x01, 0x0a, 0x08, 0x55, 0x73, 0x65,
	0x72, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x1d,
	0x0a, 0x0a, 0x69, 0x70, 0x5f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x09, 0x69, 0x70, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x12, 0x1d, 0x0a,
	0x0a, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x61, 0x67, 0x65, 0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x09, 0x75, 0x73, 0x65, 0x72, 0x41, 0x67, 0x65, 0x6e, 0x74, 0x12, 0x2e, 0x0a, 0x13,
	0x64, 0x69, 0x72, 0x65, 0x63, 0x74, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x08, 0x52, 0x11, 0x64, 0x69, 0x72, 0x65, 0x63,
	0x74, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0xd4, 0x01, 0x0a,
	0x1e, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x42,
	0x0b, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x40,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72,
	0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x72, 0x65, 0x74, 0x61,
	0x69, 0x6c, 0x2f, 0x76, 0x32, 0x62, 0x65, 0x74, 0x61, 0x3b, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c,
	0xa2, 0x02, 0x06, 0x52, 0x45, 0x54, 0x41, 0x49, 0x4c, 0xaa, 0x02, 0x1a, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x52, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e,
	0x56, 0x32, 0x42, 0x65, 0x74, 0x61, 0xca, 0x02, 0x1a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c,
	0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x52, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x5c, 0x56, 0x32, 0x62,
	0x65, 0x74, 0x61, 0xea, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c,
	0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x52, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x3a, 0x3a, 0x56, 0x32, 0x62,
	0x65, 0x74, 0x61, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_retail_v2beta_common_proto_rawDescOnce sync.Once
	file_google_cloud_retail_v2beta_common_proto_rawDescData = file_google_cloud_retail_v2beta_common_proto_rawDesc
)

func file_google_cloud_retail_v2beta_common_proto_rawDescGZIP() []byte {
	file_google_cloud_retail_v2beta_common_proto_rawDescOnce.Do(func() {
		file_google_cloud_retail_v2beta_common_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_retail_v2beta_common_proto_rawDescData)
	})
	return file_google_cloud_retail_v2beta_common_proto_rawDescData
}

var file_google_cloud_retail_v2beta_common_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_google_cloud_retail_v2beta_common_proto_goTypes = []interface{}{
	(*CustomAttribute)(nil), // 0: google.cloud.retail.v2beta.CustomAttribute
	(*Image)(nil),           // 1: google.cloud.retail.v2beta.Image
	(*PriceInfo)(nil),       // 2: google.cloud.retail.v2beta.PriceInfo
	(*UserInfo)(nil),        // 3: google.cloud.retail.v2beta.UserInfo
}
var file_google_cloud_retail_v2beta_common_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_cloud_retail_v2beta_common_proto_init() }
func file_google_cloud_retail_v2beta_common_proto_init() {
	if File_google_cloud_retail_v2beta_common_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_retail_v2beta_common_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CustomAttribute); i {
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
		file_google_cloud_retail_v2beta_common_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Image); i {
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
		file_google_cloud_retail_v2beta_common_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PriceInfo); i {
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
		file_google_cloud_retail_v2beta_common_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserInfo); i {
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
			RawDescriptor: file_google_cloud_retail_v2beta_common_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_retail_v2beta_common_proto_goTypes,
		DependencyIndexes: file_google_cloud_retail_v2beta_common_proto_depIdxs,
		MessageInfos:      file_google_cloud_retail_v2beta_common_proto_msgTypes,
	}.Build()
	File_google_cloud_retail_v2beta_common_proto = out.File
	file_google_cloud_retail_v2beta_common_proto_rawDesc = nil
	file_google_cloud_retail_v2beta_common_proto_goTypes = nil
	file_google_cloud_retail_v2beta_common_proto_depIdxs = nil
}
