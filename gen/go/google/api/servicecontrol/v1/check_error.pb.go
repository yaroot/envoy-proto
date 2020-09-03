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
// source: google/api/servicecontrol/v1/check_error.proto

package servicecontrol

import (
	proto "github.com/golang/protobuf/proto"
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

// Error codes for Check responses.
type CheckError_Code int32

const (
	// This is never used in `CheckResponse`.
	CheckError_ERROR_CODE_UNSPECIFIED CheckError_Code = 0
	// The consumer's project id, network container, or resource container was
	// not found. Same as [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND].
	CheckError_NOT_FOUND CheckError_Code = 5
	// The consumer doesn't have access to the specified resource.
	// Same as [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
	CheckError_PERMISSION_DENIED CheckError_Code = 7
	// Quota check failed. Same as [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED].
	CheckError_RESOURCE_EXHAUSTED CheckError_Code = 8
	// The consumer hasn't activated the service.
	CheckError_SERVICE_NOT_ACTIVATED CheckError_Code = 104
	// The consumer cannot access the service because billing is disabled.
	CheckError_BILLING_DISABLED CheckError_Code = 107
	// The consumer's project has been marked as deleted (soft deletion).
	CheckError_PROJECT_DELETED CheckError_Code = 108
	// The consumer's project number or id does not represent a valid project.
	CheckError_PROJECT_INVALID CheckError_Code = 114
	// The input consumer info does not represent a valid consumer folder or
	// organization.
	CheckError_CONSUMER_INVALID CheckError_Code = 125
	// The IP address of the consumer is invalid for the specific consumer
	// project.
	CheckError_IP_ADDRESS_BLOCKED CheckError_Code = 109
	// The referer address of the consumer request is invalid for the specific
	// consumer project.
	CheckError_REFERER_BLOCKED CheckError_Code = 110
	// The client application of the consumer request is invalid for the
	// specific consumer project.
	CheckError_CLIENT_APP_BLOCKED CheckError_Code = 111
	// The API targeted by this request is invalid for the specified consumer
	// project.
	CheckError_API_TARGET_BLOCKED CheckError_Code = 122
	// The consumer's API key is invalid.
	CheckError_API_KEY_INVALID CheckError_Code = 105
	// The consumer's API Key has expired.
	CheckError_API_KEY_EXPIRED CheckError_Code = 112
	// The consumer's API Key was not found in config record.
	CheckError_API_KEY_NOT_FOUND CheckError_Code = 113
	// The credential in the request can not be verified.
	CheckError_INVALID_CREDENTIAL CheckError_Code = 123
	// The backend server for looking up project id/number is unavailable.
	CheckError_NAMESPACE_LOOKUP_UNAVAILABLE CheckError_Code = 300
	// The backend server for checking service status is unavailable.
	CheckError_SERVICE_STATUS_UNAVAILABLE CheckError_Code = 301
	// The backend server for checking billing status is unavailable.
	CheckError_BILLING_STATUS_UNAVAILABLE CheckError_Code = 302
	// Cloud Resource Manager backend server is unavailable.
	CheckError_CLOUD_RESOURCE_MANAGER_BACKEND_UNAVAILABLE CheckError_Code = 305
)

// Enum value maps for CheckError_Code.
var (
	CheckError_Code_name = map[int32]string{
		0:   "ERROR_CODE_UNSPECIFIED",
		5:   "NOT_FOUND",
		7:   "PERMISSION_DENIED",
		8:   "RESOURCE_EXHAUSTED",
		104: "SERVICE_NOT_ACTIVATED",
		107: "BILLING_DISABLED",
		108: "PROJECT_DELETED",
		114: "PROJECT_INVALID",
		125: "CONSUMER_INVALID",
		109: "IP_ADDRESS_BLOCKED",
		110: "REFERER_BLOCKED",
		111: "CLIENT_APP_BLOCKED",
		122: "API_TARGET_BLOCKED",
		105: "API_KEY_INVALID",
		112: "API_KEY_EXPIRED",
		113: "API_KEY_NOT_FOUND",
		123: "INVALID_CREDENTIAL",
		300: "NAMESPACE_LOOKUP_UNAVAILABLE",
		301: "SERVICE_STATUS_UNAVAILABLE",
		302: "BILLING_STATUS_UNAVAILABLE",
		305: "CLOUD_RESOURCE_MANAGER_BACKEND_UNAVAILABLE",
	}
	CheckError_Code_value = map[string]int32{
		"ERROR_CODE_UNSPECIFIED":                     0,
		"NOT_FOUND":                                  5,
		"PERMISSION_DENIED":                          7,
		"RESOURCE_EXHAUSTED":                         8,
		"SERVICE_NOT_ACTIVATED":                      104,
		"BILLING_DISABLED":                           107,
		"PROJECT_DELETED":                            108,
		"PROJECT_INVALID":                            114,
		"CONSUMER_INVALID":                           125,
		"IP_ADDRESS_BLOCKED":                         109,
		"REFERER_BLOCKED":                            110,
		"CLIENT_APP_BLOCKED":                         111,
		"API_TARGET_BLOCKED":                         122,
		"API_KEY_INVALID":                            105,
		"API_KEY_EXPIRED":                            112,
		"API_KEY_NOT_FOUND":                          113,
		"INVALID_CREDENTIAL":                         123,
		"NAMESPACE_LOOKUP_UNAVAILABLE":               300,
		"SERVICE_STATUS_UNAVAILABLE":                 301,
		"BILLING_STATUS_UNAVAILABLE":                 302,
		"CLOUD_RESOURCE_MANAGER_BACKEND_UNAVAILABLE": 305,
	}
)

func (x CheckError_Code) Enum() *CheckError_Code {
	p := new(CheckError_Code)
	*p = x
	return p
}

func (x CheckError_Code) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (CheckError_Code) Descriptor() protoreflect.EnumDescriptor {
	return file_google_api_servicecontrol_v1_check_error_proto_enumTypes[0].Descriptor()
}

func (CheckError_Code) Type() protoreflect.EnumType {
	return &file_google_api_servicecontrol_v1_check_error_proto_enumTypes[0]
}

func (x CheckError_Code) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use CheckError_Code.Descriptor instead.
func (CheckError_Code) EnumDescriptor() ([]byte, []int) {
	return file_google_api_servicecontrol_v1_check_error_proto_rawDescGZIP(), []int{0, 0}
}

// Defines the errors to be returned in
// [google.api.servicecontrol.v1.CheckResponse.check_errors][google.api.servicecontrol.v1.CheckResponse.check_errors].
type CheckError struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The error code.
	Code CheckError_Code `protobuf:"varint,1,opt,name=code,proto3,enum=google.api.servicecontrol.v1.CheckError_Code" json:"code,omitempty"`
	// Subject to whom this error applies. See the specific code enum for more
	// details on this field. For example:
	//
	// - "project:<project-id or project-number>"
	// - "folder:<folder-id>"
	// - "organization:<organization-id>"
	Subject string `protobuf:"bytes,4,opt,name=subject,proto3" json:"subject,omitempty"`
	// Free-form text providing details on the error cause of the error.
	Detail string `protobuf:"bytes,2,opt,name=detail,proto3" json:"detail,omitempty"`
	// Contains public information about the check error. If available,
	// `status.code` will be non zero and client can propagate it out as public
	// error.
	Status *status.Status `protobuf:"bytes,3,opt,name=status,proto3" json:"status,omitempty"`
}

func (x *CheckError) Reset() {
	*x = CheckError{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_servicecontrol_v1_check_error_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CheckError) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CheckError) ProtoMessage() {}

func (x *CheckError) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_servicecontrol_v1_check_error_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CheckError.ProtoReflect.Descriptor instead.
func (*CheckError) Descriptor() ([]byte, []int) {
	return file_google_api_servicecontrol_v1_check_error_proto_rawDescGZIP(), []int{0}
}

func (x *CheckError) GetCode() CheckError_Code {
	if x != nil {
		return x.Code
	}
	return CheckError_ERROR_CODE_UNSPECIFIED
}

func (x *CheckError) GetSubject() string {
	if x != nil {
		return x.Subject
	}
	return ""
}

func (x *CheckError) GetDetail() string {
	if x != nil {
		return x.Detail
	}
	return ""
}

func (x *CheckError) GetStatus() *status.Status {
	if x != nil {
		return x.Status
	}
	return nil
}

var File_google_api_servicecontrol_v1_check_error_proto protoreflect.FileDescriptor

var file_google_api_servicecontrol_v1_check_error_proto_rawDesc = []byte{
	0x0a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x2f, 0x76, 0x31, 0x2f, 0x63,
	0x68, 0x65, 0x63, 0x6b, 0x5f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x2e, 0x76, 0x31, 0x1a, 0x17,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xcd, 0x05, 0x0a, 0x0a, 0x43, 0x68, 0x65, 0x63,
	0x6b, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x41, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0e, 0x32, 0x2d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70,
	0x69, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c,
	0x2e, 0x76, 0x31, 0x2e, 0x43, 0x68, 0x65, 0x63, 0x6b, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x2e, 0x43,
	0x6f, 0x64, 0x65, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x62,
	0x6a, 0x65, 0x63, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x75, 0x62, 0x6a,
	0x65, 0x63, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x06, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x12, 0x2a, 0x0a, 0x06, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x72, 0x70, 0x63, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52,
	0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x22, 0x9d, 0x04, 0x0a, 0x04, 0x43, 0x6f, 0x64, 0x65,
	0x12, 0x1a, 0x0a, 0x16, 0x45, 0x52, 0x52, 0x4f, 0x52, 0x5f, 0x43, 0x4f, 0x44, 0x45, 0x5f, 0x55,
	0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0d, 0x0a, 0x09,
	0x4e, 0x4f, 0x54, 0x5f, 0x46, 0x4f, 0x55, 0x4e, 0x44, 0x10, 0x05, 0x12, 0x15, 0x0a, 0x11, 0x50,
	0x45, 0x52, 0x4d, 0x49, 0x53, 0x53, 0x49, 0x4f, 0x4e, 0x5f, 0x44, 0x45, 0x4e, 0x49, 0x45, 0x44,
	0x10, 0x07, 0x12, 0x16, 0x0a, 0x12, 0x52, 0x45, 0x53, 0x4f, 0x55, 0x52, 0x43, 0x45, 0x5f, 0x45,
	0x58, 0x48, 0x41, 0x55, 0x53, 0x54, 0x45, 0x44, 0x10, 0x08, 0x12, 0x19, 0x0a, 0x15, 0x53, 0x45,
	0x52, 0x56, 0x49, 0x43, 0x45, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x43, 0x54, 0x49, 0x56, 0x41,
	0x54, 0x45, 0x44, 0x10, 0x68, 0x12, 0x14, 0x0a, 0x10, 0x42, 0x49, 0x4c, 0x4c, 0x49, 0x4e, 0x47,
	0x5f, 0x44, 0x49, 0x53, 0x41, 0x42, 0x4c, 0x45, 0x44, 0x10, 0x6b, 0x12, 0x13, 0x0a, 0x0f, 0x50,
	0x52, 0x4f, 0x4a, 0x45, 0x43, 0x54, 0x5f, 0x44, 0x45, 0x4c, 0x45, 0x54, 0x45, 0x44, 0x10, 0x6c,
	0x12, 0x13, 0x0a, 0x0f, 0x50, 0x52, 0x4f, 0x4a, 0x45, 0x43, 0x54, 0x5f, 0x49, 0x4e, 0x56, 0x41,
	0x4c, 0x49, 0x44, 0x10, 0x72, 0x12, 0x14, 0x0a, 0x10, 0x43, 0x4f, 0x4e, 0x53, 0x55, 0x4d, 0x45,
	0x52, 0x5f, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x10, 0x7d, 0x12, 0x16, 0x0a, 0x12, 0x49,
	0x50, 0x5f, 0x41, 0x44, 0x44, 0x52, 0x45, 0x53, 0x53, 0x5f, 0x42, 0x4c, 0x4f, 0x43, 0x4b, 0x45,
	0x44, 0x10, 0x6d, 0x12, 0x13, 0x0a, 0x0f, 0x52, 0x45, 0x46, 0x45, 0x52, 0x45, 0x52, 0x5f, 0x42,
	0x4c, 0x4f, 0x43, 0x4b, 0x45, 0x44, 0x10, 0x6e, 0x12, 0x16, 0x0a, 0x12, 0x43, 0x4c, 0x49, 0x45,
	0x4e, 0x54, 0x5f, 0x41, 0x50, 0x50, 0x5f, 0x42, 0x4c, 0x4f, 0x43, 0x4b, 0x45, 0x44, 0x10, 0x6f,
	0x12, 0x16, 0x0a, 0x12, 0x41, 0x50, 0x49, 0x5f, 0x54, 0x41, 0x52, 0x47, 0x45, 0x54, 0x5f, 0x42,
	0x4c, 0x4f, 0x43, 0x4b, 0x45, 0x44, 0x10, 0x7a, 0x12, 0x13, 0x0a, 0x0f, 0x41, 0x50, 0x49, 0x5f,
	0x4b, 0x45, 0x59, 0x5f, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x10, 0x69, 0x12, 0x13, 0x0a,
	0x0f, 0x41, 0x50, 0x49, 0x5f, 0x4b, 0x45, 0x59, 0x5f, 0x45, 0x58, 0x50, 0x49, 0x52, 0x45, 0x44,
	0x10, 0x70, 0x12, 0x15, 0x0a, 0x11, 0x41, 0x50, 0x49, 0x5f, 0x4b, 0x45, 0x59, 0x5f, 0x4e, 0x4f,
	0x54, 0x5f, 0x46, 0x4f, 0x55, 0x4e, 0x44, 0x10, 0x71, 0x12, 0x16, 0x0a, 0x12, 0x49, 0x4e, 0x56,
	0x41, 0x4c, 0x49, 0x44, 0x5f, 0x43, 0x52, 0x45, 0x44, 0x45, 0x4e, 0x54, 0x49, 0x41, 0x4c, 0x10,
	0x7b, 0x12, 0x21, 0x0a, 0x1c, 0x4e, 0x41, 0x4d, 0x45, 0x53, 0x50, 0x41, 0x43, 0x45, 0x5f, 0x4c,
	0x4f, 0x4f, 0x4b, 0x55, 0x50, 0x5f, 0x55, 0x4e, 0x41, 0x56, 0x41, 0x49, 0x4c, 0x41, 0x42, 0x4c,
	0x45, 0x10, 0xac, 0x02, 0x12, 0x1f, 0x0a, 0x1a, 0x53, 0x45, 0x52, 0x56, 0x49, 0x43, 0x45, 0x5f,
	0x53, 0x54, 0x41, 0x54, 0x55, 0x53, 0x5f, 0x55, 0x4e, 0x41, 0x56, 0x41, 0x49, 0x4c, 0x41, 0x42,
	0x4c, 0x45, 0x10, 0xad, 0x02, 0x12, 0x1f, 0x0a, 0x1a, 0x42, 0x49, 0x4c, 0x4c, 0x49, 0x4e, 0x47,
	0x5f, 0x53, 0x54, 0x41, 0x54, 0x55, 0x53, 0x5f, 0x55, 0x4e, 0x41, 0x56, 0x41, 0x49, 0x4c, 0x41,
	0x42, 0x4c, 0x45, 0x10, 0xae, 0x02, 0x12, 0x2f, 0x0a, 0x2a, 0x43, 0x4c, 0x4f, 0x55, 0x44, 0x5f,
	0x52, 0x45, 0x53, 0x4f, 0x55, 0x52, 0x43, 0x45, 0x5f, 0x4d, 0x41, 0x4e, 0x41, 0x47, 0x45, 0x52,
	0x5f, 0x42, 0x41, 0x43, 0x4b, 0x45, 0x4e, 0x44, 0x5f, 0x55, 0x4e, 0x41, 0x56, 0x41, 0x49, 0x4c,
	0x41, 0x42, 0x4c, 0x45, 0x10, 0xb1, 0x02, 0x42, 0x84, 0x01, 0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x2e, 0x76, 0x31, 0x42, 0x0f, 0x43, 0x68,
	0x65, 0x63, 0x6b, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x4a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f,
	0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x2f, 0x76, 0x31, 0x3b, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0xf8, 0x01, 0x01, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_api_servicecontrol_v1_check_error_proto_rawDescOnce sync.Once
	file_google_api_servicecontrol_v1_check_error_proto_rawDescData = file_google_api_servicecontrol_v1_check_error_proto_rawDesc
)

func file_google_api_servicecontrol_v1_check_error_proto_rawDescGZIP() []byte {
	file_google_api_servicecontrol_v1_check_error_proto_rawDescOnce.Do(func() {
		file_google_api_servicecontrol_v1_check_error_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_api_servicecontrol_v1_check_error_proto_rawDescData)
	})
	return file_google_api_servicecontrol_v1_check_error_proto_rawDescData
}

var file_google_api_servicecontrol_v1_check_error_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_api_servicecontrol_v1_check_error_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_api_servicecontrol_v1_check_error_proto_goTypes = []interface{}{
	(CheckError_Code)(0),  // 0: google.api.servicecontrol.v1.CheckError.Code
	(*CheckError)(nil),    // 1: google.api.servicecontrol.v1.CheckError
	(*status.Status)(nil), // 2: google.rpc.Status
}
var file_google_api_servicecontrol_v1_check_error_proto_depIdxs = []int32{
	0, // 0: google.api.servicecontrol.v1.CheckError.code:type_name -> google.api.servicecontrol.v1.CheckError.Code
	2, // 1: google.api.servicecontrol.v1.CheckError.status:type_name -> google.rpc.Status
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_api_servicecontrol_v1_check_error_proto_init() }
func file_google_api_servicecontrol_v1_check_error_proto_init() {
	if File_google_api_servicecontrol_v1_check_error_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_api_servicecontrol_v1_check_error_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CheckError); i {
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
			RawDescriptor: file_google_api_servicecontrol_v1_check_error_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_api_servicecontrol_v1_check_error_proto_goTypes,
		DependencyIndexes: file_google_api_servicecontrol_v1_check_error_proto_depIdxs,
		EnumInfos:         file_google_api_servicecontrol_v1_check_error_proto_enumTypes,
		MessageInfos:      file_google_api_servicecontrol_v1_check_error_proto_msgTypes,
	}.Build()
	File_google_api_servicecontrol_v1_check_error_proto = out.File
	file_google_api_servicecontrol_v1_check_error_proto_rawDesc = nil
	file_google_api_servicecontrol_v1_check_error_proto_goTypes = nil
	file_google_api_servicecontrol_v1_check_error_proto_depIdxs = nil
}
