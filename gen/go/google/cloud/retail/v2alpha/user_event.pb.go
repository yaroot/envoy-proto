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
// source: google/cloud/retail/v2alpha/user_event.proto

package retail

import (
	proto "github.com/golang/protobuf/proto"
	timestamp "github.com/golang/protobuf/ptypes/timestamp"
	wrappers "github.com/golang/protobuf/ptypes/wrappers"
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

// UserEvent captures all metadata information Retail API needs to know about
// how end users interact with customers' website.
type UserEvent struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. User event type. Allowed values are:
	//
	// * `add-to-cart`: Products being added to cart.
	// * `category-page-view`: Special pages such as sale or promotion pages
	//   viewed.
	// * `detail-page-view`: Products detail page viewed.
	// * `home-page-view`: Homepage viewed.
	// * `purchase-complete`: User finishing a purchase.
	// * `search`: Product search.
	// * `shopping-cart-page-view`: User viewing a shopping cart.
	EventType string `protobuf:"bytes,1,opt,name=event_type,json=eventType,proto3" json:"event_type,omitempty"`
	// Required. A unique identifier for tracking visitors.
	//
	// For example, this could be implemented with an HTTP cookie, which should be
	// able to uniquely identify a visitor on a single device. This unique
	// identifier should not change if the visitor log in/out of the website.
	//
	// The field must be a UTF-8 encoded string with a length limit of 128
	// characters. Otherwise, an INVALID_ARGUMENT error is returned.
	VisitorId string `protobuf:"bytes,2,opt,name=visitor_id,json=visitorId,proto3" json:"visitor_id,omitempty"`
	// Only required for
	// [UserEventService.ImportUserEvents][google.cloud.retail.v2alpha.UserEventService.ImportUserEvents]
	// method. Timestamp of when the user event happened.
	EventTime *timestamp.Timestamp `protobuf:"bytes,3,opt,name=event_time,json=eventTime,proto3" json:"event_time,omitempty"`
	// A list of identifiers for the independent experiment groups this user event
	// belongs to. This is used to distinguish between user events associated with
	// different experiment setups (e.g. using Retail API, using different
	// recommendation models).
	ExperimentIds []string `protobuf:"bytes,4,rep,name=experiment_ids,json=experimentIds,proto3" json:"experiment_ids,omitempty"`
	// Highly recommended for user events that are the result of
	// [PredictionService.Predict][google.cloud.retail.v2alpha.PredictionService.Predict].
	// This field enables accurate attribution of recommendation model
	// performance.
	//
	// The value must be a valid
	// [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
	// for user events that are the result of
	// [PredictionService.Predict][google.cloud.retail.v2alpha.PredictionService.Predict].
	//
	// This token enables us to accurately attribute page view or purchase back to
	// the event and the particular predict response containing this
	// clicked/purchased product. If user clicks on product K in the
	// recommendation results, pass
	// [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
	// as a URL parameter to product K's page. When recording events on product
	// K's page, log the
	// [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
	// to this field.
	AttributionToken string `protobuf:"bytes,5,opt,name=attribution_token,json=attributionToken,proto3" json:"attribution_token,omitempty"`
	// The main product details related to the event.
	//
	// This field is required for the following event types:
	//
	// * `add-to-cart`
	// * `detail-page-view`
	// * `purchase-complete`
	//
	// In a `search` event, this field represents the products returned to the end
	// user on the current page (the end user may have not finished broswing the
	// whole page yet). When a new page is returned to the end user, after
	// pagination/filtering/ordering even for the same query, a new `search` event
	// with different
	// [product_details][google.cloud.retail.v2alpha.UserEvent.product_details] is
	// desired. The end user may have not finished broswing the whole page yet.
	ProductDetails []*ProductDetail `protobuf:"bytes,6,rep,name=product_details,json=productDetails,proto3" json:"product_details,omitempty"`
	// Extra user event features to include in the recommendation model.
	//
	// The key must be a UTF-8 encoded string with a length limit of 5,000
	// characters. Otherwise, an INVALID_ARGUMENT error is returned.
	//
	// For product recommendation, an example of extra user information is
	// traffic_channel, i.e. how user arrives at the site. Users can arrive
	// at the site by coming to the site directly, or coming through Google
	// search, and etc.
	Attributes map[string]*CustomAttribute `protobuf:"bytes,7,rep,name=attributes,proto3" json:"attributes,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// The id or name of the associated shopping cart. This id is used
	// to associate multiple items added or present in the cart before purchase.
	//
	// This can only be set for `add-to-cart`, `purchase-complete`, or
	// `shopping-cart-page-view` events.
	CartId string `protobuf:"bytes,8,opt,name=cart_id,json=cartId,proto3" json:"cart_id,omitempty"`
	// A transaction represents the entire purchase transaction.
	//
	// Required for `purchase-complete` events. Other event types should not set
	// this field. Otherwise, an INVALID_ARGUMENT error is returned.
	PurchaseTransaction *PurchaseTransaction `protobuf:"bytes,9,opt,name=purchase_transaction,json=purchaseTransaction,proto3" json:"purchase_transaction,omitempty"`
	// The user's search query.
	//
	// The value must be a UTF-8 encoded string with a length limit of 5,000
	// characters. Otherwise, an INVALID_ARGUMENT error is returned.
	//
	// Required for `search` events. Other event types should not set this field.
	// Otherwise, an INVALID_ARGUMENT error is returned.
	SearchQuery string `protobuf:"bytes,10,opt,name=search_query,json=searchQuery,proto3" json:"search_query,omitempty"`
	// The categories associated with a category page.
	//
	// To represent full path of category, use '>' sign to separate different
	// hierarchies. If '>' is part of the category name, please replace it with
	// other character(s).
	//
	// Category pages include special pages such as sales or promotions. For
	// instance, a special sale page may have the category hierarchy:
	// "pageCategories" : ["Sales > 2017 Black Friday Deals"].
	//
	// Required for `category-page-view` events. Other event types should not set
	// this field. Otherwise, an INVALID_ARGUMENT error is returned.
	PageCategories []string `protobuf:"bytes,11,rep,name=page_categories,json=pageCategories,proto3" json:"page_categories,omitempty"`
	// User information.
	UserInfo *UserInfo `protobuf:"bytes,12,opt,name=user_info,json=userInfo,proto3" json:"user_info,omitempty"`
	// Complete URL (window.location.href) of the user's current page.
	//
	// When using the client side event reporting with JavaScript pixel and Google
	// Tag Manager, this value is filled in automatically. Maximum length 5,000
	// characters.
	Uri string `protobuf:"bytes,13,opt,name=uri,proto3" json:"uri,omitempty"`
	// The referrer URL of the current page.
	//
	// When using the client side event reporting with JavaScript pixel and Google
	// Tag Manager, this value is filled in automatically.
	ReferrerUri string `protobuf:"bytes,14,opt,name=referrer_uri,json=referrerUri,proto3" json:"referrer_uri,omitempty"`
	// A unique id of a web page view.
	//
	// This should be kept the same for all user events triggered from the same
	// pageview. For example, an item detail page view could trigger multiple
	// events as the user is browsing the page. The `pageViewId` property should
	// be kept the same for all these events so that they can be grouped together
	// properly.
	//
	// When using the client side event reporting with JavaScript pixel and Google
	// Tag Manager, this value is filled in automatically.
	PageViewId string `protobuf:"bytes,15,opt,name=page_view_id,json=pageViewId,proto3" json:"page_view_id,omitempty"`
}

func (x *UserEvent) Reset() {
	*x = UserEvent{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserEvent) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserEvent) ProtoMessage() {}

func (x *UserEvent) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserEvent.ProtoReflect.Descriptor instead.
func (*UserEvent) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2alpha_user_event_proto_rawDescGZIP(), []int{0}
}

func (x *UserEvent) GetEventType() string {
	if x != nil {
		return x.EventType
	}
	return ""
}

func (x *UserEvent) GetVisitorId() string {
	if x != nil {
		return x.VisitorId
	}
	return ""
}

func (x *UserEvent) GetEventTime() *timestamp.Timestamp {
	if x != nil {
		return x.EventTime
	}
	return nil
}

func (x *UserEvent) GetExperimentIds() []string {
	if x != nil {
		return x.ExperimentIds
	}
	return nil
}

func (x *UserEvent) GetAttributionToken() string {
	if x != nil {
		return x.AttributionToken
	}
	return ""
}

func (x *UserEvent) GetProductDetails() []*ProductDetail {
	if x != nil {
		return x.ProductDetails
	}
	return nil
}

func (x *UserEvent) GetAttributes() map[string]*CustomAttribute {
	if x != nil {
		return x.Attributes
	}
	return nil
}

func (x *UserEvent) GetCartId() string {
	if x != nil {
		return x.CartId
	}
	return ""
}

func (x *UserEvent) GetPurchaseTransaction() *PurchaseTransaction {
	if x != nil {
		return x.PurchaseTransaction
	}
	return nil
}

func (x *UserEvent) GetSearchQuery() string {
	if x != nil {
		return x.SearchQuery
	}
	return ""
}

func (x *UserEvent) GetPageCategories() []string {
	if x != nil {
		return x.PageCategories
	}
	return nil
}

func (x *UserEvent) GetUserInfo() *UserInfo {
	if x != nil {
		return x.UserInfo
	}
	return nil
}

func (x *UserEvent) GetUri() string {
	if x != nil {
		return x.Uri
	}
	return ""
}

func (x *UserEvent) GetReferrerUri() string {
	if x != nil {
		return x.ReferrerUri
	}
	return ""
}

func (x *UserEvent) GetPageViewId() string {
	if x != nil {
		return x.PageViewId
	}
	return ""
}

// Detailed product information associated with a user event.
type ProductDetail struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. [Product][google.cloud.retail.v2alpha.Product] information.
	//
	// Only [Product.id][google.cloud.retail.v2alpha.Product.id] field is used
	// when ingesting an event, all other product fields are ignored as we will
	// look them up from the catalog.
	Product *Product `protobuf:"bytes,1,opt,name=product,proto3" json:"product,omitempty"`
	// Quantity of the product associated with the user event.
	//
	// For example, this field will be 2 if two products are added to the shopping
	// cart for `purchase-complete` event. Required for `add-to-cart` and
	// `purchase-complete` event types.
	Quantity *wrappers.Int32Value `protobuf:"bytes,2,opt,name=quantity,proto3" json:"quantity,omitempty"`
}

func (x *ProductDetail) Reset() {
	*x = ProductDetail{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ProductDetail) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ProductDetail) ProtoMessage() {}

func (x *ProductDetail) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ProductDetail.ProtoReflect.Descriptor instead.
func (*ProductDetail) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2alpha_user_event_proto_rawDescGZIP(), []int{1}
}

func (x *ProductDetail) GetProduct() *Product {
	if x != nil {
		return x.Product
	}
	return nil
}

func (x *ProductDetail) GetQuantity() *wrappers.Int32Value {
	if x != nil {
		return x.Quantity
	}
	return nil
}

// A transaction represents the entire purchase transaction.
type PurchaseTransaction struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The transaction ID with a length limit of 128 characters.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// Required. Total non-zero revenue or grand total associated with the
	// transaction. This value include shipping, tax, or other adjustments to
	// total revenue that you want to include as part of your revenue
	// calculations.
	Revenue float32 `protobuf:"fixed32,2,opt,name=revenue,proto3" json:"revenue,omitempty"`
	// All the taxes associated with the transaction.
	Tax float32 `protobuf:"fixed32,3,opt,name=tax,proto3" json:"tax,omitempty"`
	// All the costs associated with the products. These can be manufacturing
	// costs, shipping expenses not borne by the end user, or any other costs,
	// such that:
	//
	// * Profit =
	// [revenue][google.cloud.retail.v2alpha.PurchaseTransaction.revenue] -
	// [tax][google.cloud.retail.v2alpha.PurchaseTransaction.tax] -
	// [cost][google.cloud.retail.v2alpha.PurchaseTransaction.cost]
	Cost float32 `protobuf:"fixed32,4,opt,name=cost,proto3" json:"cost,omitempty"`
	// Required. Currency code. Use three-character ISO-4217 code.
	CurrencyCode string `protobuf:"bytes,5,opt,name=currency_code,json=currencyCode,proto3" json:"currency_code,omitempty"`
}

func (x *PurchaseTransaction) Reset() {
	*x = PurchaseTransaction{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PurchaseTransaction) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PurchaseTransaction) ProtoMessage() {}

func (x *PurchaseTransaction) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PurchaseTransaction.ProtoReflect.Descriptor instead.
func (*PurchaseTransaction) Descriptor() ([]byte, []int) {
	return file_google_cloud_retail_v2alpha_user_event_proto_rawDescGZIP(), []int{2}
}

func (x *PurchaseTransaction) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *PurchaseTransaction) GetRevenue() float32 {
	if x != nil {
		return x.Revenue
	}
	return 0
}

func (x *PurchaseTransaction) GetTax() float32 {
	if x != nil {
		return x.Tax
	}
	return 0
}

func (x *PurchaseTransaction) GetCost() float32 {
	if x != nil {
		return x.Cost
	}
	return 0
}

func (x *PurchaseTransaction) GetCurrencyCode() string {
	if x != nil {
		return x.CurrencyCode
	}
	return ""
}

var File_google_cloud_retail_v2alpha_user_event_proto protoreflect.FileDescriptor

var file_google_cloud_retail_v2alpha_user_event_proto_rawDesc = []byte{
	0x0a, 0x2c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x72,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2f, 0x75, 0x73,
	0x65, 0x72, 0x5f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1b,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x1a, 0x1c, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61,
	0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f,
	0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x29, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2f, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2f, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xe1, 0x06, 0x0a, 0x09, 0x55, 0x73, 0x65, 0x72, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x22,
	0x0a, 0x0a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x09, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x79,
	0x70, 0x65, 0x12, 0x22, 0x0a, 0x0a, 0x76, 0x69, 0x73, 0x69, 0x74, 0x6f, 0x72, 0x5f, 0x69, 0x64,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x09, 0x76, 0x69, 0x73,
	0x69, 0x74, 0x6f, 0x72, 0x49, 0x64, 0x12, 0x39, 0x0a, 0x0a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f,
	0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d,
	0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x09, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x69, 0x6d,
	0x65, 0x12, 0x25, 0x0a, 0x0e, 0x65, 0x78, 0x70, 0x65, 0x72, 0x69, 0x6d, 0x65, 0x6e, 0x74, 0x5f,
	0x69, 0x64, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x09, 0x52, 0x0d, 0x65, 0x78, 0x70, 0x65, 0x72,
	0x69, 0x6d, 0x65, 0x6e, 0x74, 0x49, 0x64, 0x73, 0x12, 0x2b, 0x0a, 0x11, 0x61, 0x74, 0x74, 0x72,
	0x69, 0x62, 0x75, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x10, 0x61, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x69, 0x6f, 0x6e,
	0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x12, 0x53, 0x0a, 0x0f, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74,
	0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x18, 0x06, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x2a,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x50, 0x72, 0x6f,
	0x64, 0x75, 0x63, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x52, 0x0e, 0x70, 0x72, 0x6f, 0x64,
	0x75, 0x63, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x12, 0x56, 0x0a, 0x0a, 0x61, 0x74,
	0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x73, 0x18, 0x07, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x36,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x55, 0x73, 0x65,
	0x72, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x2e, 0x41, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65,
	0x73, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x0a, 0x61, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74,
	0x65, 0x73, 0x12, 0x17, 0x0a, 0x07, 0x63, 0x61, 0x72, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x08, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x06, 0x63, 0x61, 0x72, 0x74, 0x49, 0x64, 0x12, 0x63, 0x0a, 0x14, 0x70,
	0x75, 0x72, 0x63, 0x68, 0x61, 0x73, 0x65, 0x5f, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e,
	0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x50, 0x75, 0x72, 0x63, 0x68, 0x61, 0x73, 0x65,
	0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x13, 0x70, 0x75, 0x72,
	0x63, 0x68, 0x61, 0x73, 0x65, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x21, 0x0a, 0x0c, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x5f, 0x71, 0x75, 0x65, 0x72, 0x79,
	0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x51, 0x75,
	0x65, 0x72, 0x79, 0x12, 0x27, 0x0a, 0x0f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x63, 0x61, 0x74, 0x65,
	0x67, 0x6f, 0x72, 0x69, 0x65, 0x73, 0x18, 0x0b, 0x20, 0x03, 0x28, 0x09, 0x52, 0x0e, 0x70, 0x61,
	0x67, 0x65, 0x43, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x69, 0x65, 0x73, 0x12, 0x42, 0x0a, 0x09,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x25, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x55, 0x73,
	0x65, 0x72, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x49, 0x6e, 0x66, 0x6f,
	0x12, 0x10, 0x0a, 0x03, 0x75, 0x72, 0x69, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x75,
	0x72, 0x69, 0x12, 0x21, 0x0a, 0x0c, 0x72, 0x65, 0x66, 0x65, 0x72, 0x72, 0x65, 0x72, 0x5f, 0x75,
	0x72, 0x69, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x72, 0x65, 0x66, 0x65, 0x72, 0x72,
	0x65, 0x72, 0x55, 0x72, 0x69, 0x12, 0x20, 0x0a, 0x0c, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x76, 0x69,
	0x65, 0x77, 0x5f, 0x69, 0x64, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x70, 0x61, 0x67,
	0x65, 0x56, 0x69, 0x65, 0x77, 0x49, 0x64, 0x1a, 0x6b, 0x0a, 0x0f, 0x41, 0x74, 0x74, 0x72, 0x69,
	0x62, 0x75, 0x74, 0x65, 0x73, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65,
	0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x42, 0x0a, 0x05,
	0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2c, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69,
	0x6c, 0x2e, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d,
	0x41, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x3a, 0x02, 0x38, 0x01, 0x22, 0x8d, 0x01, 0x0a, 0x0d, 0x50, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74,
	0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x12, 0x43, 0x0a, 0x07, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32,
	0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x50, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x42, 0x03, 0xe0,
	0x41, 0x02, 0x52, 0x07, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x12, 0x37, 0x0a, 0x08, 0x71,
	0x75, 0x61, 0x6e, 0x74, 0x69, 0x74, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e,
	0x49, 0x6e, 0x74, 0x33, 0x32, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x08, 0x71, 0x75, 0x61, 0x6e,
	0x74, 0x69, 0x74, 0x79, 0x22, 0x94, 0x01, 0x0a, 0x13, 0x50, 0x75, 0x72, 0x63, 0x68, 0x61, 0x73,
	0x65, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x0e, 0x0a, 0x02,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x1d, 0x0a, 0x07,
	0x72, 0x65, 0x76, 0x65, 0x6e, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x02, 0x42, 0x03, 0xe0,
	0x41, 0x02, 0x52, 0x07, 0x72, 0x65, 0x76, 0x65, 0x6e, 0x75, 0x65, 0x12, 0x10, 0x0a, 0x03, 0x74,
	0x61, 0x78, 0x18, 0x03, 0x20, 0x01, 0x28, 0x02, 0x52, 0x03, 0x74, 0x61, 0x78, 0x12, 0x12, 0x0a,
	0x04, 0x63, 0x6f, 0x73, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x02, 0x52, 0x04, 0x63, 0x6f, 0x73,
	0x74, 0x12, 0x28, 0x0a, 0x0d, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x5f, 0x63, 0x6f,
	0x64, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0c, 0x63,
	0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x43, 0x6f, 0x64, 0x65, 0x42, 0xdc, 0x01, 0x0a, 0x1f,
	0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x72, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x2e, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x42,
	0x0e, 0x55, 0x73, 0x65, 0x72, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50,
	0x01, 0x5a, 0x41, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67,
	0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x72,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x2f, 0x76, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x3b, 0x72, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0xa2, 0x02, 0x06, 0x52, 0x45, 0x54, 0x41, 0x49, 0x4c, 0xaa, 0x02, 0x1b,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x52, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x2e, 0x56, 0x32, 0x41, 0x6c, 0x70, 0x68, 0x61, 0xca, 0x02, 0x1b, 0x47, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x52, 0x65, 0x74, 0x61, 0x69,
	0x6c, 0x5c, 0x56, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0xea, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x52, 0x65, 0x74, 0x61, 0x69,
	0x6c, 0x3a, 0x3a, 0x56, 0x32, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_google_cloud_retail_v2alpha_user_event_proto_rawDescOnce sync.Once
	file_google_cloud_retail_v2alpha_user_event_proto_rawDescData = file_google_cloud_retail_v2alpha_user_event_proto_rawDesc
)

func file_google_cloud_retail_v2alpha_user_event_proto_rawDescGZIP() []byte {
	file_google_cloud_retail_v2alpha_user_event_proto_rawDescOnce.Do(func() {
		file_google_cloud_retail_v2alpha_user_event_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_retail_v2alpha_user_event_proto_rawDescData)
	})
	return file_google_cloud_retail_v2alpha_user_event_proto_rawDescData
}

var file_google_cloud_retail_v2alpha_user_event_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_google_cloud_retail_v2alpha_user_event_proto_goTypes = []interface{}{
	(*UserEvent)(nil),           // 0: google.cloud.retail.v2alpha.UserEvent
	(*ProductDetail)(nil),       // 1: google.cloud.retail.v2alpha.ProductDetail
	(*PurchaseTransaction)(nil), // 2: google.cloud.retail.v2alpha.PurchaseTransaction
	nil,                         // 3: google.cloud.retail.v2alpha.UserEvent.AttributesEntry
	(*timestamp.Timestamp)(nil), // 4: google.protobuf.Timestamp
	(*UserInfo)(nil),            // 5: google.cloud.retail.v2alpha.UserInfo
	(*Product)(nil),             // 6: google.cloud.retail.v2alpha.Product
	(*wrappers.Int32Value)(nil), // 7: google.protobuf.Int32Value
	(*CustomAttribute)(nil),     // 8: google.cloud.retail.v2alpha.CustomAttribute
}
var file_google_cloud_retail_v2alpha_user_event_proto_depIdxs = []int32{
	4, // 0: google.cloud.retail.v2alpha.UserEvent.event_time:type_name -> google.protobuf.Timestamp
	1, // 1: google.cloud.retail.v2alpha.UserEvent.product_details:type_name -> google.cloud.retail.v2alpha.ProductDetail
	3, // 2: google.cloud.retail.v2alpha.UserEvent.attributes:type_name -> google.cloud.retail.v2alpha.UserEvent.AttributesEntry
	2, // 3: google.cloud.retail.v2alpha.UserEvent.purchase_transaction:type_name -> google.cloud.retail.v2alpha.PurchaseTransaction
	5, // 4: google.cloud.retail.v2alpha.UserEvent.user_info:type_name -> google.cloud.retail.v2alpha.UserInfo
	6, // 5: google.cloud.retail.v2alpha.ProductDetail.product:type_name -> google.cloud.retail.v2alpha.Product
	7, // 6: google.cloud.retail.v2alpha.ProductDetail.quantity:type_name -> google.protobuf.Int32Value
	8, // 7: google.cloud.retail.v2alpha.UserEvent.AttributesEntry.value:type_name -> google.cloud.retail.v2alpha.CustomAttribute
	8, // [8:8] is the sub-list for method output_type
	8, // [8:8] is the sub-list for method input_type
	8, // [8:8] is the sub-list for extension type_name
	8, // [8:8] is the sub-list for extension extendee
	0, // [0:8] is the sub-list for field type_name
}

func init() { file_google_cloud_retail_v2alpha_user_event_proto_init() }
func file_google_cloud_retail_v2alpha_user_event_proto_init() {
	if File_google_cloud_retail_v2alpha_user_event_proto != nil {
		return
	}
	file_google_cloud_retail_v2alpha_common_proto_init()
	file_google_cloud_retail_v2alpha_product_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserEvent); i {
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
		file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ProductDetail); i {
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
		file_google_cloud_retail_v2alpha_user_event_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PurchaseTransaction); i {
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
			RawDescriptor: file_google_cloud_retail_v2alpha_user_event_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_retail_v2alpha_user_event_proto_goTypes,
		DependencyIndexes: file_google_cloud_retail_v2alpha_user_event_proto_depIdxs,
		MessageInfos:      file_google_cloud_retail_v2alpha_user_event_proto_msgTypes,
	}.Build()
	File_google_cloud_retail_v2alpha_user_event_proto = out.File
	file_google_cloud_retail_v2alpha_user_event_proto_rawDesc = nil
	file_google_cloud_retail_v2alpha_user_event_proto_goTypes = nil
	file_google_cloud_retail_v2alpha_user_event_proto_depIdxs = nil
}
