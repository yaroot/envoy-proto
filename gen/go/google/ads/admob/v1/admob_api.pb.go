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
// source: google/ads/admob/v1/admob_api.proto

package admob

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

// Request to retrieve the specified publisher account.
type GetPublisherAccountRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Resource name of the publisher account to retrieve.
	// Example: accounts/pub-9876543210987654
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *GetPublisherAccountRequest) Reset() {
	*x = GetPublisherAccountRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetPublisherAccountRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetPublisherAccountRequest) ProtoMessage() {}

func (x *GetPublisherAccountRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetPublisherAccountRequest.ProtoReflect.Descriptor instead.
func (*GetPublisherAccountRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{0}
}

func (x *GetPublisherAccountRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// Request to retrieve the AdMob publisher account accessible with the client
// credential. Currently all credentials have access to at most 1 account.
type ListPublisherAccountsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Maximum number of accounts to return.
	PageSize int32 `protobuf:"varint,1,opt,name=page_size,json=pageSize,proto3" json:"page_size,omitempty"`
	// The value returned by the last `ListPublisherAccountsResponse`; indicates
	// that this is a continuation of a prior `ListPublisherAccounts` call, and
	// that the system should return the next page of data.
	PageToken string `protobuf:"bytes,2,opt,name=page_token,json=pageToken,proto3" json:"page_token,omitempty"`
}

func (x *ListPublisherAccountsRequest) Reset() {
	*x = ListPublisherAccountsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListPublisherAccountsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListPublisherAccountsRequest) ProtoMessage() {}

func (x *ListPublisherAccountsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListPublisherAccountsRequest.ProtoReflect.Descriptor instead.
func (*ListPublisherAccountsRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{1}
}

func (x *ListPublisherAccountsRequest) GetPageSize() int32 {
	if x != nil {
		return x.PageSize
	}
	return 0
}

func (x *ListPublisherAccountsRequest) GetPageToken() string {
	if x != nil {
		return x.PageToken
	}
	return ""
}

// Response for the publisher account list request.
type ListPublisherAccountsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Publisher that the client credentials can access.
	Account []*PublisherAccount `protobuf:"bytes,1,rep,name=account,proto3" json:"account,omitempty"`
	// If not empty, indicates that there might be more accounts for the request;
	// you must pass this value in a new `ListPublisherAccountsRequest`.
	NextPageToken string `protobuf:"bytes,2,opt,name=next_page_token,json=nextPageToken,proto3" json:"next_page_token,omitempty"`
}

func (x *ListPublisherAccountsResponse) Reset() {
	*x = ListPublisherAccountsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListPublisherAccountsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListPublisherAccountsResponse) ProtoMessage() {}

func (x *ListPublisherAccountsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListPublisherAccountsResponse.ProtoReflect.Descriptor instead.
func (*ListPublisherAccountsResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{2}
}

func (x *ListPublisherAccountsResponse) GetAccount() []*PublisherAccount {
	if x != nil {
		return x.Account
	}
	return nil
}

func (x *ListPublisherAccountsResponse) GetNextPageToken() string {
	if x != nil {
		return x.NextPageToken
	}
	return ""
}

// Request to generate an AdMob Mediation report.
type GenerateMediationReportRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Resource name of the account to generate the report for.
	// Example: accounts/pub-9876543210987654
	Parent string `protobuf:"bytes,1,opt,name=parent,proto3" json:"parent,omitempty"`
	// Network report specification.
	ReportSpec *MediationReportSpec `protobuf:"bytes,2,opt,name=report_spec,json=reportSpec,proto3" json:"report_spec,omitempty"`
}

func (x *GenerateMediationReportRequest) Reset() {
	*x = GenerateMediationReportRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateMediationReportRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateMediationReportRequest) ProtoMessage() {}

func (x *GenerateMediationReportRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateMediationReportRequest.ProtoReflect.Descriptor instead.
func (*GenerateMediationReportRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{3}
}

func (x *GenerateMediationReportRequest) GetParent() string {
	if x != nil {
		return x.Parent
	}
	return ""
}

func (x *GenerateMediationReportRequest) GetReportSpec() *MediationReportSpec {
	if x != nil {
		return x.ReportSpec
	}
	return nil
}

// The streaming response for the AdMob Mediation report where the first
// response contains the report header, then a stream of row responses, and
// finally a footer as the last response message.
//
// For example:
//
//     [{
//       "header": {
//         "date_range": {
//           "start_date": {"year": 2018, "month": 9, "day": 1},
//           "end_date": {"year": 2018, "month": 9, "day": 1}
//         },
//         "localization_settings": {
//           "currency_code": "USD",
//           "language_code": "en-US"
//         }
//       }
//     },
//     {
//       "row": {
//         "dimension_values": {
//           "DATE": {"value": "20180918"},
//           "APP": {
//             "value": "ca-app-pub-8123415297019784~1001342552",
//              "display_label": "My app name!"
//           }
//         },
//         "metric_values": {
//           "ESTIMATED_EARNINGS": {"decimal_value": "1324746"}
//         }
//       }
//     },
//     {
//       "footer": {"matching_row_count": 1}
//     }]
type GenerateMediationReportResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Each stream response message contains one type of payload.
	//
	// Types that are assignable to Payload:
	//	*GenerateMediationReportResponse_Header
	//	*GenerateMediationReportResponse_Row
	//	*GenerateMediationReportResponse_Footer
	Payload isGenerateMediationReportResponse_Payload `protobuf_oneof:"payload"`
}

func (x *GenerateMediationReportResponse) Reset() {
	*x = GenerateMediationReportResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateMediationReportResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateMediationReportResponse) ProtoMessage() {}

func (x *GenerateMediationReportResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateMediationReportResponse.ProtoReflect.Descriptor instead.
func (*GenerateMediationReportResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{4}
}

func (m *GenerateMediationReportResponse) GetPayload() isGenerateMediationReportResponse_Payload {
	if m != nil {
		return m.Payload
	}
	return nil
}

func (x *GenerateMediationReportResponse) GetHeader() *ReportHeader {
	if x, ok := x.GetPayload().(*GenerateMediationReportResponse_Header); ok {
		return x.Header
	}
	return nil
}

func (x *GenerateMediationReportResponse) GetRow() *ReportRow {
	if x, ok := x.GetPayload().(*GenerateMediationReportResponse_Row); ok {
		return x.Row
	}
	return nil
}

func (x *GenerateMediationReportResponse) GetFooter() *ReportFooter {
	if x, ok := x.GetPayload().(*GenerateMediationReportResponse_Footer); ok {
		return x.Footer
	}
	return nil
}

type isGenerateMediationReportResponse_Payload interface {
	isGenerateMediationReportResponse_Payload()
}

type GenerateMediationReportResponse_Header struct {
	// Report generation settings that describes the report contents, such as
	// the report date range and localization settings.
	Header *ReportHeader `protobuf:"bytes,1,opt,name=header,proto3,oneof"`
}

type GenerateMediationReportResponse_Row struct {
	// Actual report data.
	Row *ReportRow `protobuf:"bytes,2,opt,name=row,proto3,oneof"`
}

type GenerateMediationReportResponse_Footer struct {
	// Additional information about the generated report, such as warnings about
	// the data.
	Footer *ReportFooter `protobuf:"bytes,3,opt,name=footer,proto3,oneof"`
}

func (*GenerateMediationReportResponse_Header) isGenerateMediationReportResponse_Payload() {}

func (*GenerateMediationReportResponse_Row) isGenerateMediationReportResponse_Payload() {}

func (*GenerateMediationReportResponse_Footer) isGenerateMediationReportResponse_Payload() {}

// Request to generate an AdMob Network report.
type GenerateNetworkReportRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Resource name of the account to generate the report for.
	// Example: accounts/pub-9876543210987654
	Parent string `protobuf:"bytes,1,opt,name=parent,proto3" json:"parent,omitempty"`
	// Network report specification.
	ReportSpec *NetworkReportSpec `protobuf:"bytes,2,opt,name=report_spec,json=reportSpec,proto3" json:"report_spec,omitempty"`
}

func (x *GenerateNetworkReportRequest) Reset() {
	*x = GenerateNetworkReportRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateNetworkReportRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateNetworkReportRequest) ProtoMessage() {}

func (x *GenerateNetworkReportRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateNetworkReportRequest.ProtoReflect.Descriptor instead.
func (*GenerateNetworkReportRequest) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{5}
}

func (x *GenerateNetworkReportRequest) GetParent() string {
	if x != nil {
		return x.Parent
	}
	return ""
}

func (x *GenerateNetworkReportRequest) GetReportSpec() *NetworkReportSpec {
	if x != nil {
		return x.ReportSpec
	}
	return nil
}

// The streaming response for the AdMob Network report where the first response
// contains the report header, then a stream of row responses, and finally a
// footer as the last response message.
//
// For example:
//
//     [{
//       "header": {
//         "dateRange": {
//           "startDate": {"year": 2018, "month": 9, "day": 1},
//           "endDate": {"year": 2018, "month": 9, "day": 1}
//         },
//         "localizationSettings": {
//           "currencyCode": "USD",
//           "languageCode": "en-US"
//         }
//       }
//     },
//     {
//       "row": {
//         "dimensionValues": {
//           "DATE": {"value": "20180918"},
//           "APP": {
//             "value": "ca-app-pub-8123415297019784~1001342552",
//              displayLabel: "My app name!"
//           }
//         },
//         "metricValues": {
//           "ESTIMATED_EARNINGS": {"microsValue": 6500000}
//         }
//       }
//     },
//     {
//       "footer": {"matchingRowCount": 1}
//     }]
type GenerateNetworkReportResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Each stream response message contains one type of payload.
	//
	// Types that are assignable to Payload:
	//	*GenerateNetworkReportResponse_Header
	//	*GenerateNetworkReportResponse_Row
	//	*GenerateNetworkReportResponse_Footer
	Payload isGenerateNetworkReportResponse_Payload `protobuf_oneof:"payload"`
}

func (x *GenerateNetworkReportResponse) Reset() {
	*x = GenerateNetworkReportResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateNetworkReportResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateNetworkReportResponse) ProtoMessage() {}

func (x *GenerateNetworkReportResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_admob_v1_admob_api_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateNetworkReportResponse.ProtoReflect.Descriptor instead.
func (*GenerateNetworkReportResponse) Descriptor() ([]byte, []int) {
	return file_google_ads_admob_v1_admob_api_proto_rawDescGZIP(), []int{6}
}

func (m *GenerateNetworkReportResponse) GetPayload() isGenerateNetworkReportResponse_Payload {
	if m != nil {
		return m.Payload
	}
	return nil
}

func (x *GenerateNetworkReportResponse) GetHeader() *ReportHeader {
	if x, ok := x.GetPayload().(*GenerateNetworkReportResponse_Header); ok {
		return x.Header
	}
	return nil
}

func (x *GenerateNetworkReportResponse) GetRow() *ReportRow {
	if x, ok := x.GetPayload().(*GenerateNetworkReportResponse_Row); ok {
		return x.Row
	}
	return nil
}

func (x *GenerateNetworkReportResponse) GetFooter() *ReportFooter {
	if x, ok := x.GetPayload().(*GenerateNetworkReportResponse_Footer); ok {
		return x.Footer
	}
	return nil
}

type isGenerateNetworkReportResponse_Payload interface {
	isGenerateNetworkReportResponse_Payload()
}

type GenerateNetworkReportResponse_Header struct {
	// Report generation settings that describes the report contents, such as
	// the report date range and localization settings.
	Header *ReportHeader `protobuf:"bytes,1,opt,name=header,proto3,oneof"`
}

type GenerateNetworkReportResponse_Row struct {
	// Actual report data.
	Row *ReportRow `protobuf:"bytes,2,opt,name=row,proto3,oneof"`
}

type GenerateNetworkReportResponse_Footer struct {
	// Additional information about the generated report, such as warnings about
	// the data.
	Footer *ReportFooter `protobuf:"bytes,3,opt,name=footer,proto3,oneof"`
}

func (*GenerateNetworkReportResponse_Header) isGenerateNetworkReportResponse_Payload() {}

func (*GenerateNetworkReportResponse_Row) isGenerateNetworkReportResponse_Payload() {}

func (*GenerateNetworkReportResponse_Footer) isGenerateNetworkReportResponse_Payload() {}

var File_google_ads_admob_v1_admob_api_proto protoreflect.FileDescriptor

var file_google_ads_admob_v1_admob_api_proto_rawDesc = []byte{
	0x0a, 0x23, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x61, 0x64, 0x6d,
	0x6f, 0x62, 0x2f, 0x76, 0x31, 0x2f, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x13, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x1a, 0x29, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2f, 0x76, 0x31, 0x2f,
	0x61, 0x64, 0x6d, 0x6f, 0x62, 0x5f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62,
	0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x30, 0x0a, 0x1a, 0x47, 0x65, 0x74, 0x50,
	0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x5a, 0x0a, 0x1c, 0x4c, 0x69,
	0x73, 0x74, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1b, 0x0a, 0x09, 0x70, 0x61,
	0x67, 0x65, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x08, 0x70,
	0x61, 0x67, 0x65, 0x53, 0x69, 0x7a, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x70, 0x61, 0x67, 0x65, 0x5f,
	0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x70, 0x61, 0x67,
	0x65, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x88, 0x01, 0x0a, 0x1d, 0x4c, 0x69, 0x73, 0x74, 0x50,
	0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3f, 0x0a, 0x07, 0x61, 0x63, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e,
	0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x52, 0x07, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x26, 0x0a, 0x0f, 0x6e, 0x65, 0x78,
	0x74, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0d, 0x6e, 0x65, 0x78, 0x74, 0x50, 0x61, 0x67, 0x65, 0x54, 0x6f, 0x6b, 0x65,
	0x6e, 0x22, 0x83, 0x01, 0x0a, 0x1e, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4d, 0x65,
	0x64, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0x49, 0x0a, 0x0b,
	0x72, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x5f, 0x73, 0x70, 0x65, 0x63, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x28, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61,
	0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x4d, 0x65, 0x64, 0x69, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x53, 0x70, 0x65, 0x63, 0x52, 0x0a, 0x72, 0x65, 0x70,
	0x6f, 0x72, 0x74, 0x53, 0x70, 0x65, 0x63, 0x22, 0xda, 0x01, 0x0a, 0x1f, 0x47, 0x65, 0x6e, 0x65,
	0x72, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x64, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x70,
	0x6f, 0x72, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3b, 0x0a, 0x06, 0x68,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76,
	0x31, 0x2e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x48, 0x00,
	0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x32, 0x0a, 0x03, 0x72, 0x6f, 0x77, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x70, 0x6f,
	0x72, 0x74, 0x52, 0x6f, 0x77, 0x48, 0x00, 0x52, 0x03, 0x72, 0x6f, 0x77, 0x12, 0x3b, 0x0a, 0x06,
	0x66, 0x6f, 0x6f, 0x74, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e,
	0x76, 0x31, 0x2e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x46, 0x6f, 0x6f, 0x74, 0x65, 0x72, 0x48,
	0x00, 0x52, 0x06, 0x66, 0x6f, 0x6f, 0x74, 0x65, 0x72, 0x42, 0x09, 0x0a, 0x07, 0x70, 0x61, 0x79,
	0x6c, 0x6f, 0x61, 0x64, 0x22, 0x7f, 0x0a, 0x1c, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65,
	0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0x47, 0x0a, 0x0b,
	0x72, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x5f, 0x73, 0x70, 0x65, 0x63, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61,
	0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52,
	0x65, 0x70, 0x6f, 0x72, 0x74, 0x53, 0x70, 0x65, 0x63, 0x52, 0x0a, 0x72, 0x65, 0x70, 0x6f, 0x72,
	0x74, 0x53, 0x70, 0x65, 0x63, 0x22, 0xd8, 0x01, 0x0a, 0x1d, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61,
	0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3b, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65,
	0x70, 0x6f, 0x72, 0x74, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x48, 0x00, 0x52, 0x06, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x12, 0x32, 0x0a, 0x03, 0x72, 0x6f, 0x77, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x1e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61,
	0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x6f,
	0x77, 0x48, 0x00, 0x52, 0x03, 0x72, 0x6f, 0x77, 0x12, 0x3b, 0x0a, 0x06, 0x66, 0x6f, 0x6f, 0x74,
	0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x52,
	0x65, 0x70, 0x6f, 0x72, 0x74, 0x46, 0x6f, 0x6f, 0x74, 0x65, 0x72, 0x48, 0x00, 0x52, 0x06, 0x66,
	0x6f, 0x6f, 0x74, 0x65, 0x72, 0x42, 0x09, 0x0a, 0x07, 0x70, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64,
	0x32, 0x83, 0x06, 0x0a, 0x08, 0x41, 0x64, 0x4d, 0x6f, 0x62, 0x41, 0x70, 0x69, 0x12, 0x93, 0x01,
	0x0a, 0x13, 0x47, 0x65, 0x74, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x2f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x50,
	0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x25, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x50, 0x75, 0x62,
	0x6c, 0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x22, 0x24, 0x82,
	0xd3, 0xe4, 0x93, 0x02, 0x17, 0x12, 0x15, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65,
	0x3d, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0x94, 0x01, 0x0a, 0x15, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x75, 0x62, 0x6c,
	0x69, 0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x12, 0x31, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62,
	0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x65,
	0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x32, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64,
	0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x75, 0x62, 0x6c, 0x69,
	0x73, 0x68, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x14, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0e, 0x12, 0x0c, 0x2f, 0x76,
	0x31, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x12, 0xbb, 0x01, 0x0a, 0x15, 0x47,
	0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x65,
	0x70, 0x6f, 0x72, 0x74, 0x12, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x32, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65,
	0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x65, 0x70,
	0x6f, 0x72, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x39, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x33, 0x22, 0x2e, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74,
	0x3d, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0x2f, 0x6e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x3a, 0x67, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0x30, 0x01, 0x12, 0xc3, 0x01, 0x0a, 0x17, 0x47, 0x65, 0x6e,
	0x65, 0x72, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x64, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x70, 0x6f, 0x72, 0x74, 0x12, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64,
	0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x65, 0x4d, 0x65, 0x64, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x70, 0x6f,
	0x72, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76, 0x31, 0x2e,
	0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4d, 0x65, 0x64, 0x69, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x3b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x35, 0x22, 0x30, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x70, 0x61,
	0x72, 0x65, 0x6e, 0x74, 0x3d, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x73, 0x2f, 0x2a, 0x7d,
	0x2f, 0x6d, 0x65, 0x64, 0x69, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74,
	0x3a, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0x30, 0x01, 0x1a, 0x46,
	0xca, 0x41, 0x14, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0xd2, 0x41, 0x2c, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a,
	0x2f, 0x2f, 0x77, 0x77, 0x77, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x2f, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e,
	0x72, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x42, 0x62, 0x0a, 0x17, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x2e, 0x76,
	0x31, 0x42, 0x0d, 0x41, 0x64, 0x4d, 0x6f, 0x62, 0x41, 0x70, 0x69, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x5a, 0x38, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e,
	0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x61, 0x64, 0x6d, 0x6f,
	0x62, 0x2f, 0x76, 0x31, 0x3b, 0x61, 0x64, 0x6d, 0x6f, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_google_ads_admob_v1_admob_api_proto_rawDescOnce sync.Once
	file_google_ads_admob_v1_admob_api_proto_rawDescData = file_google_ads_admob_v1_admob_api_proto_rawDesc
)

func file_google_ads_admob_v1_admob_api_proto_rawDescGZIP() []byte {
	file_google_ads_admob_v1_admob_api_proto_rawDescOnce.Do(func() {
		file_google_ads_admob_v1_admob_api_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_admob_v1_admob_api_proto_rawDescData)
	})
	return file_google_ads_admob_v1_admob_api_proto_rawDescData
}

var file_google_ads_admob_v1_admob_api_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_google_ads_admob_v1_admob_api_proto_goTypes = []interface{}{
	(*GetPublisherAccountRequest)(nil),      // 0: google.ads.admob.v1.GetPublisherAccountRequest
	(*ListPublisherAccountsRequest)(nil),    // 1: google.ads.admob.v1.ListPublisherAccountsRequest
	(*ListPublisherAccountsResponse)(nil),   // 2: google.ads.admob.v1.ListPublisherAccountsResponse
	(*GenerateMediationReportRequest)(nil),  // 3: google.ads.admob.v1.GenerateMediationReportRequest
	(*GenerateMediationReportResponse)(nil), // 4: google.ads.admob.v1.GenerateMediationReportResponse
	(*GenerateNetworkReportRequest)(nil),    // 5: google.ads.admob.v1.GenerateNetworkReportRequest
	(*GenerateNetworkReportResponse)(nil),   // 6: google.ads.admob.v1.GenerateNetworkReportResponse
	(*PublisherAccount)(nil),                // 7: google.ads.admob.v1.PublisherAccount
	(*MediationReportSpec)(nil),             // 8: google.ads.admob.v1.MediationReportSpec
	(*ReportHeader)(nil),                    // 9: google.ads.admob.v1.ReportHeader
	(*ReportRow)(nil),                       // 10: google.ads.admob.v1.ReportRow
	(*ReportFooter)(nil),                    // 11: google.ads.admob.v1.ReportFooter
	(*NetworkReportSpec)(nil),               // 12: google.ads.admob.v1.NetworkReportSpec
}
var file_google_ads_admob_v1_admob_api_proto_depIdxs = []int32{
	7,  // 0: google.ads.admob.v1.ListPublisherAccountsResponse.account:type_name -> google.ads.admob.v1.PublisherAccount
	8,  // 1: google.ads.admob.v1.GenerateMediationReportRequest.report_spec:type_name -> google.ads.admob.v1.MediationReportSpec
	9,  // 2: google.ads.admob.v1.GenerateMediationReportResponse.header:type_name -> google.ads.admob.v1.ReportHeader
	10, // 3: google.ads.admob.v1.GenerateMediationReportResponse.row:type_name -> google.ads.admob.v1.ReportRow
	11, // 4: google.ads.admob.v1.GenerateMediationReportResponse.footer:type_name -> google.ads.admob.v1.ReportFooter
	12, // 5: google.ads.admob.v1.GenerateNetworkReportRequest.report_spec:type_name -> google.ads.admob.v1.NetworkReportSpec
	9,  // 6: google.ads.admob.v1.GenerateNetworkReportResponse.header:type_name -> google.ads.admob.v1.ReportHeader
	10, // 7: google.ads.admob.v1.GenerateNetworkReportResponse.row:type_name -> google.ads.admob.v1.ReportRow
	11, // 8: google.ads.admob.v1.GenerateNetworkReportResponse.footer:type_name -> google.ads.admob.v1.ReportFooter
	0,  // 9: google.ads.admob.v1.AdMobApi.GetPublisherAccount:input_type -> google.ads.admob.v1.GetPublisherAccountRequest
	1,  // 10: google.ads.admob.v1.AdMobApi.ListPublisherAccounts:input_type -> google.ads.admob.v1.ListPublisherAccountsRequest
	5,  // 11: google.ads.admob.v1.AdMobApi.GenerateNetworkReport:input_type -> google.ads.admob.v1.GenerateNetworkReportRequest
	3,  // 12: google.ads.admob.v1.AdMobApi.GenerateMediationReport:input_type -> google.ads.admob.v1.GenerateMediationReportRequest
	7,  // 13: google.ads.admob.v1.AdMobApi.GetPublisherAccount:output_type -> google.ads.admob.v1.PublisherAccount
	2,  // 14: google.ads.admob.v1.AdMobApi.ListPublisherAccounts:output_type -> google.ads.admob.v1.ListPublisherAccountsResponse
	6,  // 15: google.ads.admob.v1.AdMobApi.GenerateNetworkReport:output_type -> google.ads.admob.v1.GenerateNetworkReportResponse
	4,  // 16: google.ads.admob.v1.AdMobApi.GenerateMediationReport:output_type -> google.ads.admob.v1.GenerateMediationReportResponse
	13, // [13:17] is the sub-list for method output_type
	9,  // [9:13] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_google_ads_admob_v1_admob_api_proto_init() }
func file_google_ads_admob_v1_admob_api_proto_init() {
	if File_google_ads_admob_v1_admob_api_proto != nil {
		return
	}
	file_google_ads_admob_v1_admob_resources_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_ads_admob_v1_admob_api_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetPublisherAccountRequest); i {
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
		file_google_ads_admob_v1_admob_api_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListPublisherAccountsRequest); i {
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
		file_google_ads_admob_v1_admob_api_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListPublisherAccountsResponse); i {
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
		file_google_ads_admob_v1_admob_api_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateMediationReportRequest); i {
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
		file_google_ads_admob_v1_admob_api_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateMediationReportResponse); i {
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
		file_google_ads_admob_v1_admob_api_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateNetworkReportRequest); i {
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
		file_google_ads_admob_v1_admob_api_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateNetworkReportResponse); i {
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
	file_google_ads_admob_v1_admob_api_proto_msgTypes[4].OneofWrappers = []interface{}{
		(*GenerateMediationReportResponse_Header)(nil),
		(*GenerateMediationReportResponse_Row)(nil),
		(*GenerateMediationReportResponse_Footer)(nil),
	}
	file_google_ads_admob_v1_admob_api_proto_msgTypes[6].OneofWrappers = []interface{}{
		(*GenerateNetworkReportResponse_Header)(nil),
		(*GenerateNetworkReportResponse_Row)(nil),
		(*GenerateNetworkReportResponse_Footer)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_admob_v1_admob_api_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_ads_admob_v1_admob_api_proto_goTypes,
		DependencyIndexes: file_google_ads_admob_v1_admob_api_proto_depIdxs,
		MessageInfos:      file_google_ads_admob_v1_admob_api_proto_msgTypes,
	}.Build()
	File_google_ads_admob_v1_admob_api_proto = out.File
	file_google_ads_admob_v1_admob_api_proto_rawDesc = nil
	file_google_ads_admob_v1_admob_api_proto_goTypes = nil
	file_google_ads_admob_v1_admob_api_proto_depIdxs = nil
}
