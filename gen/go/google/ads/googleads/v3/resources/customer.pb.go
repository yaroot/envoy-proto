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
// source: google/ads/googleads/v3/resources/customer.proto

package resources

import (
	proto "github.com/golang/protobuf/proto"
	enums "google.golang.org/genproto/googleapis/ads/googleads/v3/enums"
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

// A customer.
type Customer struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Immutable. The resource name of the customer.
	// Customer resource names have the form:
	//
	// `customers/{customer_id}`
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
	// Output only. The ID of the customer.
	Id *wrapperspb.Int64Value `protobuf:"bytes,3,opt,name=id,proto3" json:"id,omitempty"`
	// Optional, non-unique descriptive name of the customer.
	DescriptiveName *wrapperspb.StringValue `protobuf:"bytes,4,opt,name=descriptive_name,json=descriptiveName,proto3" json:"descriptive_name,omitempty"`
	// Immutable. The currency in which the account operates.
	// A subset of the currency codes from the ISO 4217 standard is
	// supported.
	CurrencyCode *wrapperspb.StringValue `protobuf:"bytes,5,opt,name=currency_code,json=currencyCode,proto3" json:"currency_code,omitempty"`
	// Immutable. The local timezone ID of the customer.
	TimeZone *wrapperspb.StringValue `protobuf:"bytes,6,opt,name=time_zone,json=timeZone,proto3" json:"time_zone,omitempty"`
	// The URL template for constructing a tracking URL out of parameters.
	TrackingUrlTemplate *wrapperspb.StringValue `protobuf:"bytes,7,opt,name=tracking_url_template,json=trackingUrlTemplate,proto3" json:"tracking_url_template,omitempty"`
	// The URL template for appending params to the final URL
	FinalUrlSuffix *wrapperspb.StringValue `protobuf:"bytes,11,opt,name=final_url_suffix,json=finalUrlSuffix,proto3" json:"final_url_suffix,omitempty"`
	// Whether auto-tagging is enabled for the customer.
	AutoTaggingEnabled *wrapperspb.BoolValue `protobuf:"bytes,8,opt,name=auto_tagging_enabled,json=autoTaggingEnabled,proto3" json:"auto_tagging_enabled,omitempty"`
	// Output only. Whether the Customer has a Partners program badge. If the Customer is not
	// associated with the Partners program, this will be false. For more
	// information, see https://support.google.com/partners/answer/3125774.
	HasPartnersBadge *wrapperspb.BoolValue `protobuf:"bytes,9,opt,name=has_partners_badge,json=hasPartnersBadge,proto3" json:"has_partners_badge,omitempty"`
	// Output only. Whether the customer is a manager.
	Manager *wrapperspb.BoolValue `protobuf:"bytes,12,opt,name=manager,proto3" json:"manager,omitempty"`
	// Output only. Whether the customer is a test account.
	TestAccount *wrapperspb.BoolValue `protobuf:"bytes,13,opt,name=test_account,json=testAccount,proto3" json:"test_account,omitempty"`
	// Call reporting setting for a customer.
	CallReportingSetting *CallReportingSetting `protobuf:"bytes,10,opt,name=call_reporting_setting,json=callReportingSetting,proto3" json:"call_reporting_setting,omitempty"`
	// Output only. Conversion tracking setting for a customer.
	ConversionTrackingSetting *ConversionTrackingSetting `protobuf:"bytes,14,opt,name=conversion_tracking_setting,json=conversionTrackingSetting,proto3" json:"conversion_tracking_setting,omitempty"`
	// Output only. Remarketing setting for a customer.
	RemarketingSetting *RemarketingSetting `protobuf:"bytes,15,opt,name=remarketing_setting,json=remarketingSetting,proto3" json:"remarketing_setting,omitempty"`
	// Output only. Reasons why the customer is not eligible to use PaymentMode.CONVERSIONS. If
	// the list is empty, the customer is eligible. This field is read-only.
	PayPerConversionEligibilityFailureReasons []enums.CustomerPayPerConversionEligibilityFailureReasonEnum_CustomerPayPerConversionEligibilityFailureReason `protobuf:"varint,16,rep,packed,name=pay_per_conversion_eligibility_failure_reasons,json=payPerConversionEligibilityFailureReasons,proto3,enum=google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum_CustomerPayPerConversionEligibilityFailureReason" json:"pay_per_conversion_eligibility_failure_reasons,omitempty"`
}

func (x *Customer) Reset() {
	*x = Customer{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Customer) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Customer) ProtoMessage() {}

func (x *Customer) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Customer.ProtoReflect.Descriptor instead.
func (*Customer) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_resources_customer_proto_rawDescGZIP(), []int{0}
}

func (x *Customer) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

func (x *Customer) GetId() *wrapperspb.Int64Value {
	if x != nil {
		return x.Id
	}
	return nil
}

func (x *Customer) GetDescriptiveName() *wrapperspb.StringValue {
	if x != nil {
		return x.DescriptiveName
	}
	return nil
}

func (x *Customer) GetCurrencyCode() *wrapperspb.StringValue {
	if x != nil {
		return x.CurrencyCode
	}
	return nil
}

func (x *Customer) GetTimeZone() *wrapperspb.StringValue {
	if x != nil {
		return x.TimeZone
	}
	return nil
}

func (x *Customer) GetTrackingUrlTemplate() *wrapperspb.StringValue {
	if x != nil {
		return x.TrackingUrlTemplate
	}
	return nil
}

func (x *Customer) GetFinalUrlSuffix() *wrapperspb.StringValue {
	if x != nil {
		return x.FinalUrlSuffix
	}
	return nil
}

func (x *Customer) GetAutoTaggingEnabled() *wrapperspb.BoolValue {
	if x != nil {
		return x.AutoTaggingEnabled
	}
	return nil
}

func (x *Customer) GetHasPartnersBadge() *wrapperspb.BoolValue {
	if x != nil {
		return x.HasPartnersBadge
	}
	return nil
}

func (x *Customer) GetManager() *wrapperspb.BoolValue {
	if x != nil {
		return x.Manager
	}
	return nil
}

func (x *Customer) GetTestAccount() *wrapperspb.BoolValue {
	if x != nil {
		return x.TestAccount
	}
	return nil
}

func (x *Customer) GetCallReportingSetting() *CallReportingSetting {
	if x != nil {
		return x.CallReportingSetting
	}
	return nil
}

func (x *Customer) GetConversionTrackingSetting() *ConversionTrackingSetting {
	if x != nil {
		return x.ConversionTrackingSetting
	}
	return nil
}

func (x *Customer) GetRemarketingSetting() *RemarketingSetting {
	if x != nil {
		return x.RemarketingSetting
	}
	return nil
}

func (x *Customer) GetPayPerConversionEligibilityFailureReasons() []enums.CustomerPayPerConversionEligibilityFailureReasonEnum_CustomerPayPerConversionEligibilityFailureReason {
	if x != nil {
		return x.PayPerConversionEligibilityFailureReasons
	}
	return nil
}

// Call reporting setting for a customer.
type CallReportingSetting struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Enable reporting of phone call events by redirecting them via Google
	// System.
	CallReportingEnabled *wrapperspb.BoolValue `protobuf:"bytes,1,opt,name=call_reporting_enabled,json=callReportingEnabled,proto3" json:"call_reporting_enabled,omitempty"`
	// Whether to enable call conversion reporting.
	CallConversionReportingEnabled *wrapperspb.BoolValue `protobuf:"bytes,2,opt,name=call_conversion_reporting_enabled,json=callConversionReportingEnabled,proto3" json:"call_conversion_reporting_enabled,omitempty"`
	// Customer-level call conversion action to attribute a call conversion to.
	// If not set a default conversion action is used. Only in effect when
	// call_conversion_reporting_enabled is set to true.
	CallConversionAction *wrapperspb.StringValue `protobuf:"bytes,9,opt,name=call_conversion_action,json=callConversionAction,proto3" json:"call_conversion_action,omitempty"`
}

func (x *CallReportingSetting) Reset() {
	*x = CallReportingSetting{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CallReportingSetting) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CallReportingSetting) ProtoMessage() {}

func (x *CallReportingSetting) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CallReportingSetting.ProtoReflect.Descriptor instead.
func (*CallReportingSetting) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_resources_customer_proto_rawDescGZIP(), []int{1}
}

func (x *CallReportingSetting) GetCallReportingEnabled() *wrapperspb.BoolValue {
	if x != nil {
		return x.CallReportingEnabled
	}
	return nil
}

func (x *CallReportingSetting) GetCallConversionReportingEnabled() *wrapperspb.BoolValue {
	if x != nil {
		return x.CallConversionReportingEnabled
	}
	return nil
}

func (x *CallReportingSetting) GetCallConversionAction() *wrapperspb.StringValue {
	if x != nil {
		return x.CallConversionAction
	}
	return nil
}

// A collection of customer-wide settings related to Google Ads Conversion
// Tracking.
type ConversionTrackingSetting struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The conversion tracking id used for this account. This id is automatically
	// assigned after any conversion tracking feature is used. If the customer
	// doesn't use conversion tracking, this is 0. This field is read-only.
	ConversionTrackingId *wrapperspb.Int64Value `protobuf:"bytes,1,opt,name=conversion_tracking_id,json=conversionTrackingId,proto3" json:"conversion_tracking_id,omitempty"`
	// Output only. The conversion tracking id of the customer's manager. This is set when the
	// customer is opted into cross account conversion tracking, and it overrides
	// conversion_tracking_id. This field can only be managed through the Google
	// Ads UI. This field is read-only.
	CrossAccountConversionTrackingId *wrapperspb.Int64Value `protobuf:"bytes,2,opt,name=cross_account_conversion_tracking_id,json=crossAccountConversionTrackingId,proto3" json:"cross_account_conversion_tracking_id,omitempty"`
}

func (x *ConversionTrackingSetting) Reset() {
	*x = ConversionTrackingSetting{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ConversionTrackingSetting) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ConversionTrackingSetting) ProtoMessage() {}

func (x *ConversionTrackingSetting) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ConversionTrackingSetting.ProtoReflect.Descriptor instead.
func (*ConversionTrackingSetting) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_resources_customer_proto_rawDescGZIP(), []int{2}
}

func (x *ConversionTrackingSetting) GetConversionTrackingId() *wrapperspb.Int64Value {
	if x != nil {
		return x.ConversionTrackingId
	}
	return nil
}

func (x *ConversionTrackingSetting) GetCrossAccountConversionTrackingId() *wrapperspb.Int64Value {
	if x != nil {
		return x.CrossAccountConversionTrackingId
	}
	return nil
}

// Remarketing setting for a customer.
type RemarketingSetting struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The Google global site tag.
	GoogleGlobalSiteTag *wrapperspb.StringValue `protobuf:"bytes,1,opt,name=google_global_site_tag,json=googleGlobalSiteTag,proto3" json:"google_global_site_tag,omitempty"`
}

func (x *RemarketingSetting) Reset() {
	*x = RemarketingSetting{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RemarketingSetting) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RemarketingSetting) ProtoMessage() {}

func (x *RemarketingSetting) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v3_resources_customer_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RemarketingSetting.ProtoReflect.Descriptor instead.
func (*RemarketingSetting) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v3_resources_customer_proto_rawDescGZIP(), []int{3}
}

func (x *RemarketingSetting) GetGoogleGlobalSiteTag() *wrapperspb.StringValue {
	if x != nil {
		return x.GoogleGlobalSiteTag
	}
	return nil
}

var File_google_ads_googleads_v3_resources_customer_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v3_resources_customer_proto_rawDesc = []byte{
	0x0a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x73, 0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x21, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x1a, 0x5a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64,
	0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x65,
	0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x70, 0x61,
	0x79, 0x5f, 0x70, 0x65, 0x72, 0x5f, 0x63, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x5f, 0x65, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x5f, 0x66, 0x61, 0x69,
	0x6c, 0x75, 0x72, 0x65, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69,
	0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77,
	0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa1, 0x0b, 0x0a, 0x08,
	0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x12, 0x4e, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x29, 0xe0, 0x41, 0x05, 0xfa, 0x41, 0x23, 0x0a, 0x21, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x52, 0x0c, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x30, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x49, 0x6e, 0x74, 0x36, 0x34, 0x56, 0x61, 0x6c, 0x75,
	0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x02, 0x69, 0x64, 0x12, 0x47, 0x0a, 0x10, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c,
	0x75, 0x65, 0x52, 0x0f, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x76, 0x65, 0x4e,
	0x61, 0x6d, 0x65, 0x12, 0x46, 0x0a, 0x0d, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x5f,
	0x63, 0x6f, 0x64, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72,
	0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x05, 0x52, 0x0c, 0x63,
	0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x3e, 0x0a, 0x09, 0x74,
	0x69, 0x6d, 0x65, 0x5f, 0x7a, 0x6f, 0x6e, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x03, 0xe0, 0x41,
	0x05, 0x52, 0x08, 0x74, 0x69, 0x6d, 0x65, 0x5a, 0x6f, 0x6e, 0x65, 0x12, 0x50, 0x0a, 0x15, 0x74,
	0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x5f, 0x75, 0x72, 0x6c, 0x5f, 0x74, 0x65, 0x6d, 0x70,
	0x6c, 0x61, 0x74, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72,
	0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x13, 0x74, 0x72, 0x61, 0x63, 0x6b, 0x69,
	0x6e, 0x67, 0x55, 0x72, 0x6c, 0x54, 0x65, 0x6d, 0x70, 0x6c, 0x61, 0x74, 0x65, 0x12, 0x46, 0x0a,
	0x10, 0x66, 0x69, 0x6e, 0x61, 0x6c, 0x5f, 0x75, 0x72, 0x6c, 0x5f, 0x73, 0x75, 0x66, 0x66, 0x69,
	0x78, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67,
	0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0e, 0x66, 0x69, 0x6e, 0x61, 0x6c, 0x55, 0x72, 0x6c, 0x53,
	0x75, 0x66, 0x66, 0x69, 0x78, 0x12, 0x4c, 0x0a, 0x14, 0x61, 0x75, 0x74, 0x6f, 0x5f, 0x74, 0x61,
	0x67, 0x67, 0x69, 0x6e, 0x67, 0x5f, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x18, 0x08, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52,
	0x12, 0x61, 0x75, 0x74, 0x6f, 0x54, 0x61, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x45, 0x6e, 0x61, 0x62,
	0x6c, 0x65, 0x64, 0x12, 0x4d, 0x0a, 0x12, 0x68, 0x61, 0x73, 0x5f, 0x70, 0x61, 0x72, 0x74, 0x6e,
	0x65, 0x72, 0x73, 0x5f, 0x62, 0x61, 0x64, 0x67, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x03,
	0x52, 0x10, 0x68, 0x61, 0x73, 0x50, 0x61, 0x72, 0x74, 0x6e, 0x65, 0x72, 0x73, 0x42, 0x61, 0x64,
	0x67, 0x65, 0x12, 0x39, 0x0a, 0x07, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x18, 0x0c, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42,
	0x03, 0xe0, 0x41, 0x03, 0x52, 0x07, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x12, 0x42, 0x0a,
	0x0c, 0x74, 0x65, 0x73, 0x74, 0x5f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x0d, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42,
	0x03, 0xe0, 0x41, 0x03, 0x52, 0x0b, 0x74, 0x65, 0x73, 0x74, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e,
	0x74, 0x12, 0x6d, 0x0a, 0x16, 0x63, 0x61, 0x6c, 0x6c, 0x5f, 0x72, 0x65, 0x70, 0x6f, 0x72, 0x74,
	0x69, 0x6e, 0x67, 0x5f, 0x73, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x18, 0x0a, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x37, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x43, 0x61, 0x6c, 0x6c, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74,
	0x69, 0x6e, 0x67, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x52, 0x14, 0x63, 0x61, 0x6c, 0x6c,
	0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67,
	0x12, 0x81, 0x01, 0x0a, 0x1b, 0x63, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f,
	0x74, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x5f, 0x73, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67,
	0x18, 0x0e, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x3c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33,
	0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x43, 0x6f, 0x6e, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x54, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x53, 0x65, 0x74,
	0x74, 0x69, 0x6e, 0x67, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x19, 0x63, 0x6f, 0x6e, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x54, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x53, 0x65, 0x74,
	0x74, 0x69, 0x6e, 0x67, 0x12, 0x6b, 0x0a, 0x13, 0x72, 0x65, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74,
	0x69, 0x6e, 0x67, 0x5f, 0x73, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x18, 0x0f, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x35, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x52, 0x65, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x69, 0x6e,
	0x67, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x12, 0x72,
	0x65, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x69, 0x6e, 0x67, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e,
	0x67, 0x12, 0xed, 0x01, 0x0a, 0x2e, 0x70, 0x61, 0x79, 0x5f, 0x70, 0x65, 0x72, 0x5f, 0x63, 0x6f,
	0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x65, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x69,
	0x6c, 0x69, 0x74, 0x79, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x5f, 0x72, 0x65, 0x61,
	0x73, 0x6f, 0x6e, 0x73, 0x18, 0x10, 0x20, 0x03, 0x28, 0x0e, 0x32, 0x84, 0x01, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x43, 0x75, 0x73, 0x74,
	0x6f, 0x6d, 0x65, 0x72, 0x50, 0x61, 0x79, 0x50, 0x65, 0x72, 0x43, 0x6f, 0x6e, 0x76, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x45, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x46,
	0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x45, 0x6e, 0x75, 0x6d,
	0x2e, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x50, 0x61, 0x79, 0x50, 0x65, 0x72, 0x43,
	0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x45, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x69,
	0x6c, 0x69, 0x74, 0x79, 0x46, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x52, 0x65, 0x61, 0x73, 0x6f,
	0x6e, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x29, 0x70, 0x61, 0x79, 0x50, 0x65, 0x72, 0x43, 0x6f,
	0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x45, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x69, 0x6c,
	0x69, 0x74, 0x79, 0x46, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e,
	0x73, 0x3a, 0x3c, 0xea, 0x41, 0x39, 0x0a, 0x21, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x12, 0x14, 0x63, 0x75, 0x73, 0x74, 0x6f,
	0x6d, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x7d, 0x22,
	0xd4, 0x02, 0x0a, 0x14, 0x43, 0x61, 0x6c, 0x6c, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6e,
	0x67, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x12, 0x50, 0x0a, 0x16, 0x63, 0x61, 0x6c, 0x6c,
	0x5f, 0x72, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x5f, 0x65, 0x6e, 0x61, 0x62, 0x6c,
	0x65, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56,
	0x61, 0x6c, 0x75, 0x65, 0x52, 0x14, 0x63, 0x61, 0x6c, 0x6c, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74,
	0x69, 0x6e, 0x67, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x12, 0x65, 0x0a, 0x21, 0x63, 0x61,
	0x6c, 0x6c, 0x5f, 0x63, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x72, 0x65,
	0x70, 0x6f, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x5f, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75,
	0x65, 0x52, 0x1e, 0x63, 0x61, 0x6c, 0x6c, 0x43, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f,
	0x6e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65,
	0x64, 0x12, 0x82, 0x01, 0x0a, 0x16, 0x63, 0x61, 0x6c, 0x6c, 0x5f, 0x63, 0x6f, 0x6e, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x09, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c, 0x75, 0x65,
	0x42, 0x2e, 0xfa, 0x41, 0x2b, 0x0a, 0x29, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x43, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x52, 0x14, 0x63, 0x61, 0x6c, 0x6c, 0x43, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0xe5, 0x01, 0x0a, 0x19, 0x43, 0x6f, 0x6e, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x54, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x53, 0x65, 0x74,
	0x74, 0x69, 0x6e, 0x67, 0x12, 0x56, 0x0a, 0x16, 0x63, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x5f, 0x74, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x5f, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x49, 0x6e, 0x74, 0x36, 0x34, 0x56, 0x61, 0x6c, 0x75,
	0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x14, 0x63, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x54, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x49, 0x64, 0x12, 0x70, 0x0a, 0x24,
	0x63, 0x72, 0x6f, 0x73, 0x73, 0x5f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x5f, 0x63, 0x6f,
	0x6e, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x74, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e,
	0x67, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x49, 0x6e, 0x74,
	0x36, 0x34, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x20, 0x63, 0x72,
	0x6f, 0x73, 0x73, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x43, 0x6f, 0x6e, 0x76, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x54, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x49, 0x64, 0x22, 0x6c,
	0x0a, 0x12, 0x52, 0x65, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x69, 0x6e, 0x67, 0x53, 0x65, 0x74,
	0x74, 0x69, 0x6e, 0x67, 0x12, 0x56, 0x0a, 0x16, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5f, 0x67,
	0x6c, 0x6f, 0x62, 0x61, 0x6c, 0x5f, 0x73, 0x69, 0x74, 0x65, 0x5f, 0x74, 0x61, 0x67, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x56, 0x61, 0x6c,
	0x75, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x13, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x47,
	0x6c, 0x6f, 0x62, 0x61, 0x6c, 0x53, 0x69, 0x74, 0x65, 0x54, 0x61, 0x67, 0x42, 0xfa, 0x01, 0x0a,
	0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x42, 0x0d, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x33, 0x2f,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x3b, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x21, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73,
	0x2e, 0x56, 0x33, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0xca, 0x02, 0x21,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x33, 0x5c, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x73, 0xea, 0x02, 0x25, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a,
	0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x33, 0x3a, 0x3a,
	0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_google_ads_googleads_v3_resources_customer_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v3_resources_customer_proto_rawDescData = file_google_ads_googleads_v3_resources_customer_proto_rawDesc
)

func file_google_ads_googleads_v3_resources_customer_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v3_resources_customer_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v3_resources_customer_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v3_resources_customer_proto_rawDescData)
	})
	return file_google_ads_googleads_v3_resources_customer_proto_rawDescData
}

var file_google_ads_googleads_v3_resources_customer_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_google_ads_googleads_v3_resources_customer_proto_goTypes = []interface{}{
	(*Customer)(nil),                  // 0: google.ads.googleads.v3.resources.Customer
	(*CallReportingSetting)(nil),      // 1: google.ads.googleads.v3.resources.CallReportingSetting
	(*ConversionTrackingSetting)(nil), // 2: google.ads.googleads.v3.resources.ConversionTrackingSetting
	(*RemarketingSetting)(nil),        // 3: google.ads.googleads.v3.resources.RemarketingSetting
	(*wrapperspb.Int64Value)(nil),     // 4: google.protobuf.Int64Value
	(*wrapperspb.StringValue)(nil),    // 5: google.protobuf.StringValue
	(*wrapperspb.BoolValue)(nil),      // 6: google.protobuf.BoolValue
	(enums.CustomerPayPerConversionEligibilityFailureReasonEnum_CustomerPayPerConversionEligibilityFailureReason)(0), // 7: google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason
}
var file_google_ads_googleads_v3_resources_customer_proto_depIdxs = []int32{
	4,  // 0: google.ads.googleads.v3.resources.Customer.id:type_name -> google.protobuf.Int64Value
	5,  // 1: google.ads.googleads.v3.resources.Customer.descriptive_name:type_name -> google.protobuf.StringValue
	5,  // 2: google.ads.googleads.v3.resources.Customer.currency_code:type_name -> google.protobuf.StringValue
	5,  // 3: google.ads.googleads.v3.resources.Customer.time_zone:type_name -> google.protobuf.StringValue
	5,  // 4: google.ads.googleads.v3.resources.Customer.tracking_url_template:type_name -> google.protobuf.StringValue
	5,  // 5: google.ads.googleads.v3.resources.Customer.final_url_suffix:type_name -> google.protobuf.StringValue
	6,  // 6: google.ads.googleads.v3.resources.Customer.auto_tagging_enabled:type_name -> google.protobuf.BoolValue
	6,  // 7: google.ads.googleads.v3.resources.Customer.has_partners_badge:type_name -> google.protobuf.BoolValue
	6,  // 8: google.ads.googleads.v3.resources.Customer.manager:type_name -> google.protobuf.BoolValue
	6,  // 9: google.ads.googleads.v3.resources.Customer.test_account:type_name -> google.protobuf.BoolValue
	1,  // 10: google.ads.googleads.v3.resources.Customer.call_reporting_setting:type_name -> google.ads.googleads.v3.resources.CallReportingSetting
	2,  // 11: google.ads.googleads.v3.resources.Customer.conversion_tracking_setting:type_name -> google.ads.googleads.v3.resources.ConversionTrackingSetting
	3,  // 12: google.ads.googleads.v3.resources.Customer.remarketing_setting:type_name -> google.ads.googleads.v3.resources.RemarketingSetting
	7,  // 13: google.ads.googleads.v3.resources.Customer.pay_per_conversion_eligibility_failure_reasons:type_name -> google.ads.googleads.v3.enums.CustomerPayPerConversionEligibilityFailureReasonEnum.CustomerPayPerConversionEligibilityFailureReason
	6,  // 14: google.ads.googleads.v3.resources.CallReportingSetting.call_reporting_enabled:type_name -> google.protobuf.BoolValue
	6,  // 15: google.ads.googleads.v3.resources.CallReportingSetting.call_conversion_reporting_enabled:type_name -> google.protobuf.BoolValue
	5,  // 16: google.ads.googleads.v3.resources.CallReportingSetting.call_conversion_action:type_name -> google.protobuf.StringValue
	4,  // 17: google.ads.googleads.v3.resources.ConversionTrackingSetting.conversion_tracking_id:type_name -> google.protobuf.Int64Value
	4,  // 18: google.ads.googleads.v3.resources.ConversionTrackingSetting.cross_account_conversion_tracking_id:type_name -> google.protobuf.Int64Value
	5,  // 19: google.ads.googleads.v3.resources.RemarketingSetting.google_global_site_tag:type_name -> google.protobuf.StringValue
	20, // [20:20] is the sub-list for method output_type
	20, // [20:20] is the sub-list for method input_type
	20, // [20:20] is the sub-list for extension type_name
	20, // [20:20] is the sub-list for extension extendee
	0,  // [0:20] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v3_resources_customer_proto_init() }
func file_google_ads_googleads_v3_resources_customer_proto_init() {
	if File_google_ads_googleads_v3_resources_customer_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v3_resources_customer_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Customer); i {
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
		file_google_ads_googleads_v3_resources_customer_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CallReportingSetting); i {
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
		file_google_ads_googleads_v3_resources_customer_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ConversionTrackingSetting); i {
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
		file_google_ads_googleads_v3_resources_customer_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RemarketingSetting); i {
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
			RawDescriptor: file_google_ads_googleads_v3_resources_customer_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v3_resources_customer_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v3_resources_customer_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v3_resources_customer_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v3_resources_customer_proto = out.File
	file_google_ads_googleads_v3_resources_customer_proto_rawDesc = nil
	file_google_ads_googleads_v3_resources_customer_proto_goTypes = nil
	file_google_ads_googleads_v3_resources_customer_proto_depIdxs = nil
}
