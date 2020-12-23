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
// source: google/cloud/websecurityscanner/v1/finding.proto

package websecurityscanner

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

// The severity level of a vulnerability.
type Finding_Severity int32

const (
	// No severity specified. The default value.
	Finding_SEVERITY_UNSPECIFIED Finding_Severity = 0
	// Critical severity.
	Finding_CRITICAL Finding_Severity = 1
	// High severity.
	Finding_HIGH Finding_Severity = 2
	// Medium severity.
	Finding_MEDIUM Finding_Severity = 3
	// Low severity.
	Finding_LOW Finding_Severity = 4
)

// Enum value maps for Finding_Severity.
var (
	Finding_Severity_name = map[int32]string{
		0: "SEVERITY_UNSPECIFIED",
		1: "CRITICAL",
		2: "HIGH",
		3: "MEDIUM",
		4: "LOW",
	}
	Finding_Severity_value = map[string]int32{
		"SEVERITY_UNSPECIFIED": 0,
		"CRITICAL":             1,
		"HIGH":                 2,
		"MEDIUM":               3,
		"LOW":                  4,
	}
)

func (x Finding_Severity) Enum() *Finding_Severity {
	p := new(Finding_Severity)
	*p = x
	return p
}

func (x Finding_Severity) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Finding_Severity) Descriptor() protoreflect.EnumDescriptor {
	return file_google_cloud_websecurityscanner_v1_finding_proto_enumTypes[0].Descriptor()
}

func (Finding_Severity) Type() protoreflect.EnumType {
	return &file_google_cloud_websecurityscanner_v1_finding_proto_enumTypes[0]
}

func (x Finding_Severity) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Finding_Severity.Descriptor instead.
func (Finding_Severity) EnumDescriptor() ([]byte, []int) {
	return file_google_cloud_websecurityscanner_v1_finding_proto_rawDescGZIP(), []int{0, 0}
}

// A Finding resource represents a vulnerability instance identified during a
// ScanRun.
type Finding struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The resource name of the Finding. The name follows the format of
	// 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
	// The finding IDs are generated by the system.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Output only. The type of the Finding.
	// Detailed and up-to-date information on findings can be found here:
	// https://cloud.google.com/security-command-center/docs/how-to-remediate-web-security-scanner-findings
	FindingType string `protobuf:"bytes,2,opt,name=finding_type,json=findingType,proto3" json:"finding_type,omitempty"`
	// Output only. The severity level of the reported vulnerability.
	Severity Finding_Severity `protobuf:"varint,17,opt,name=severity,proto3,enum=google.cloud.websecurityscanner.v1.Finding_Severity" json:"severity,omitempty"`
	// Output only. The http method of the request that triggered the vulnerability, in
	// uppercase.
	HttpMethod string `protobuf:"bytes,3,opt,name=http_method,json=httpMethod,proto3" json:"http_method,omitempty"`
	// Output only. The URL produced by the server-side fuzzer and used in the request that
	// triggered the vulnerability.
	FuzzedUrl string `protobuf:"bytes,4,opt,name=fuzzed_url,json=fuzzedUrl,proto3" json:"fuzzed_url,omitempty"`
	// Output only. The body of the request that triggered the vulnerability.
	Body string `protobuf:"bytes,5,opt,name=body,proto3" json:"body,omitempty"`
	// Output only. The description of the vulnerability.
	Description string `protobuf:"bytes,6,opt,name=description,proto3" json:"description,omitempty"`
	// Output only. The URL containing human-readable payload that user can leverage to
	// reproduce the vulnerability.
	ReproductionUrl string `protobuf:"bytes,7,opt,name=reproduction_url,json=reproductionUrl,proto3" json:"reproduction_url,omitempty"`
	// Output only. If the vulnerability was originated from nested IFrame, the immediate
	// parent IFrame is reported.
	FrameUrl string `protobuf:"bytes,8,opt,name=frame_url,json=frameUrl,proto3" json:"frame_url,omitempty"`
	// Output only. The URL where the browser lands when the vulnerability is detected.
	FinalUrl string `protobuf:"bytes,9,opt,name=final_url,json=finalUrl,proto3" json:"final_url,omitempty"`
	// Output only. The tracking ID uniquely identifies a vulnerability instance across
	// multiple ScanRuns.
	TrackingId string `protobuf:"bytes,10,opt,name=tracking_id,json=trackingId,proto3" json:"tracking_id,omitempty"`
	// Output only. An addon containing information reported for a vulnerability with an HTML
	// form, if any.
	Form *Form `protobuf:"bytes,16,opt,name=form,proto3" json:"form,omitempty"`
	// Output only. An addon containing information about outdated libraries.
	OutdatedLibrary *OutdatedLibrary `protobuf:"bytes,11,opt,name=outdated_library,json=outdatedLibrary,proto3" json:"outdated_library,omitempty"`
	// Output only. An addon containing detailed information regarding any resource causing the
	// vulnerability such as JavaScript sources, image, audio files, etc.
	ViolatingResource *ViolatingResource `protobuf:"bytes,12,opt,name=violating_resource,json=violatingResource,proto3" json:"violating_resource,omitempty"`
	// Output only. An addon containing information about vulnerable or missing HTTP headers.
	VulnerableHeaders *VulnerableHeaders `protobuf:"bytes,15,opt,name=vulnerable_headers,json=vulnerableHeaders,proto3" json:"vulnerable_headers,omitempty"`
	// Output only. An addon containing information about request parameters which were found
	// to be vulnerable.
	VulnerableParameters *VulnerableParameters `protobuf:"bytes,13,opt,name=vulnerable_parameters,json=vulnerableParameters,proto3" json:"vulnerable_parameters,omitempty"`
	// Output only. An addon containing information reported for an XSS, if any.
	Xss *Xss `protobuf:"bytes,14,opt,name=xss,proto3" json:"xss,omitempty"`
}

func (x *Finding) Reset() {
	*x = Finding{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_websecurityscanner_v1_finding_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Finding) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Finding) ProtoMessage() {}

func (x *Finding) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_websecurityscanner_v1_finding_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Finding.ProtoReflect.Descriptor instead.
func (*Finding) Descriptor() ([]byte, []int) {
	return file_google_cloud_websecurityscanner_v1_finding_proto_rawDescGZIP(), []int{0}
}

func (x *Finding) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Finding) GetFindingType() string {
	if x != nil {
		return x.FindingType
	}
	return ""
}

func (x *Finding) GetSeverity() Finding_Severity {
	if x != nil {
		return x.Severity
	}
	return Finding_SEVERITY_UNSPECIFIED
}

func (x *Finding) GetHttpMethod() string {
	if x != nil {
		return x.HttpMethod
	}
	return ""
}

func (x *Finding) GetFuzzedUrl() string {
	if x != nil {
		return x.FuzzedUrl
	}
	return ""
}

func (x *Finding) GetBody() string {
	if x != nil {
		return x.Body
	}
	return ""
}

func (x *Finding) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *Finding) GetReproductionUrl() string {
	if x != nil {
		return x.ReproductionUrl
	}
	return ""
}

func (x *Finding) GetFrameUrl() string {
	if x != nil {
		return x.FrameUrl
	}
	return ""
}

func (x *Finding) GetFinalUrl() string {
	if x != nil {
		return x.FinalUrl
	}
	return ""
}

func (x *Finding) GetTrackingId() string {
	if x != nil {
		return x.TrackingId
	}
	return ""
}

func (x *Finding) GetForm() *Form {
	if x != nil {
		return x.Form
	}
	return nil
}

func (x *Finding) GetOutdatedLibrary() *OutdatedLibrary {
	if x != nil {
		return x.OutdatedLibrary
	}
	return nil
}

func (x *Finding) GetViolatingResource() *ViolatingResource {
	if x != nil {
		return x.ViolatingResource
	}
	return nil
}

func (x *Finding) GetVulnerableHeaders() *VulnerableHeaders {
	if x != nil {
		return x.VulnerableHeaders
	}
	return nil
}

func (x *Finding) GetVulnerableParameters() *VulnerableParameters {
	if x != nil {
		return x.VulnerableParameters
	}
	return nil
}

func (x *Finding) GetXss() *Xss {
	if x != nil {
		return x.Xss
	}
	return nil
}

var File_google_cloud_websecurityscanner_v1_finding_proto protoreflect.FileDescriptor

var file_google_cloud_websecurityscanner_v1_finding_proto_rawDesc = []byte{
	0x0a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x77,
	0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65,
	0x72, 0x2f, 0x76, 0x31, 0x2f, 0x66, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x22, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e,
	0x6e, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f,
	0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x36, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2f, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e,
	0x6e, 0x65, 0x72, 0x2f, 0x76, 0x31, 0x2f, 0x66, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x61,
	0x64, 0x64, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x81, 0x09, 0x0a, 0x07, 0x46,
	0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x66, 0x69,
	0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0b, 0x66, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x54, 0x79, 0x70, 0x65, 0x12, 0x55, 0x0a,
	0x08, 0x73, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79, 0x18, 0x11, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x77,
	0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65,
	0x72, 0x2e, 0x76, 0x31, 0x2e, 0x46, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x2e, 0x53, 0x65, 0x76,
	0x65, 0x72, 0x69, 0x74, 0x79, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x08, 0x73, 0x65, 0x76, 0x65,
	0x72, 0x69, 0x74, 0x79, 0x12, 0x1f, 0x0a, 0x0b, 0x68, 0x74, 0x74, 0x70, 0x5f, 0x6d, 0x65, 0x74,
	0x68, 0x6f, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x68, 0x74, 0x74, 0x70, 0x4d,
	0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x66, 0x75, 0x7a, 0x7a, 0x65, 0x64, 0x5f,
	0x75, 0x72, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x66, 0x75, 0x7a, 0x7a, 0x65,
	0x64, 0x55, 0x72, 0x6c, 0x12, 0x12, 0x0a, 0x04, 0x62, 0x6f, 0x64, 0x79, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x62, 0x6f, 0x64, 0x79, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x64,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x29, 0x0a, 0x10, 0x72, 0x65,
	0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x72, 0x65, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x55, 0x72, 0x6c, 0x12, 0x1b, 0x0a, 0x09, 0x66, 0x72, 0x61, 0x6d, 0x65, 0x5f, 0x75,
	0x72, 0x6c, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x66, 0x72, 0x61, 0x6d, 0x65, 0x55,
	0x72, 0x6c, 0x12, 0x1b, 0x0a, 0x09, 0x66, 0x69, 0x6e, 0x61, 0x6c, 0x5f, 0x75, 0x72, 0x6c, 0x18,
	0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x66, 0x69, 0x6e, 0x61, 0x6c, 0x55, 0x72, 0x6c, 0x12,
	0x1f, 0x0a, 0x0b, 0x74, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x5f, 0x69, 0x64, 0x18, 0x0a,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x74, 0x72, 0x61, 0x63, 0x6b, 0x69, 0x6e, 0x67, 0x49, 0x64,
	0x12, 0x3c, 0x0a, 0x04, 0x66, 0x6f, 0x72, 0x6d, 0x18, 0x10, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x28,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x77, 0x65,
	0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72,
	0x2e, 0x76, 0x31, 0x2e, 0x46, 0x6f, 0x72, 0x6d, 0x52, 0x04, 0x66, 0x6f, 0x72, 0x6d, 0x12, 0x5e,
	0x0a, 0x10, 0x6f, 0x75, 0x74, 0x64, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x6c, 0x69, 0x62, 0x72, 0x61,
	0x72, 0x79, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72,
	0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x75,
	0x74, 0x64, 0x61, 0x74, 0x65, 0x64, 0x4c, 0x69, 0x62, 0x72, 0x61, 0x72, 0x79, 0x52, 0x0f, 0x6f,
	0x75, 0x74, 0x64, 0x61, 0x74, 0x65, 0x64, 0x4c, 0x69, 0x62, 0x72, 0x61, 0x72, 0x79, 0x12, 0x64,
	0x0a, 0x12, 0x76, 0x69, 0x6f, 0x6c, 0x61, 0x74, 0x69, 0x6e, 0x67, 0x5f, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x35, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63,
	0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e,
	0x56, 0x69, 0x6f, 0x6c, 0x61, 0x74, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x52, 0x11, 0x76, 0x69, 0x6f, 0x6c, 0x61, 0x74, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x12, 0x64, 0x0a, 0x12, 0x76, 0x75, 0x6c, 0x6e, 0x65, 0x72, 0x61, 0x62,
	0x6c, 0x65, 0x5f, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x35, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e,
	0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x56, 0x75, 0x6c, 0x6e, 0x65, 0x72, 0x61, 0x62, 0x6c, 0x65,
	0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x52, 0x11, 0x76, 0x75, 0x6c, 0x6e, 0x65, 0x72, 0x61,
	0x62, 0x6c, 0x65, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x12, 0x6d, 0x0a, 0x15, 0x76, 0x75,
	0x6c, 0x6e, 0x65, 0x72, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74,
	0x65, 0x72, 0x73, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x38, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75,
	0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x56,
	0x75, 0x6c, 0x6e, 0x65, 0x72, 0x61, 0x62, 0x6c, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74,
	0x65, 0x72, 0x73, 0x52, 0x14, 0x76, 0x75, 0x6c, 0x6e, 0x65, 0x72, 0x61, 0x62, 0x6c, 0x65, 0x50,
	0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x73, 0x12, 0x39, 0x0a, 0x03, 0x78, 0x73, 0x73,
	0x18, 0x0e, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74,
	0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x58, 0x73, 0x73, 0x52,
	0x03, 0x78, 0x73, 0x73, 0x22, 0x51, 0x0a, 0x08, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79,
	0x12, 0x18, 0x0a, 0x14, 0x53, 0x45, 0x56, 0x45, 0x52, 0x49, 0x54, 0x59, 0x5f, 0x55, 0x4e, 0x53,
	0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0c, 0x0a, 0x08, 0x43, 0x52,
	0x49, 0x54, 0x49, 0x43, 0x41, 0x4c, 0x10, 0x01, 0x12, 0x08, 0x0a, 0x04, 0x48, 0x49, 0x47, 0x48,
	0x10, 0x02, 0x12, 0x0a, 0x0a, 0x06, 0x4d, 0x45, 0x44, 0x49, 0x55, 0x4d, 0x10, 0x03, 0x12, 0x07,
	0x0a, 0x03, 0x4c, 0x4f, 0x57, 0x10, 0x04, 0x3a, 0x84, 0x01, 0xea, 0x41, 0x80, 0x01, 0x0a, 0x29,
	0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e,
	0x65, 0x72, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x46, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x53, 0x70, 0x72, 0x6f, 0x6a, 0x65,
	0x63, 0x74, 0x73, 0x2f, 0x7b, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x7d, 0x2f, 0x73, 0x63,
	0x61, 0x6e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x73, 0x2f, 0x7b, 0x73, 0x63, 0x61, 0x6e, 0x5f,
	0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x7d, 0x2f, 0x73, 0x63, 0x61, 0x6e, 0x52, 0x75, 0x6e, 0x73,
	0x2f, 0x7b, 0x73, 0x63, 0x61, 0x6e, 0x5f, 0x72, 0x75, 0x6e, 0x7d, 0x2f, 0x66, 0x69, 0x6e, 0x64,
	0x69, 0x6e, 0x67, 0x73, 0x2f, 0x7b, 0x66, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x7d, 0x42, 0x80,
	0x02, 0x0a, 0x26, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73,
	0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x42, 0x0c, 0x46, 0x69, 0x6e, 0x64, 0x69,
	0x6e, 0x67, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x54, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x77, 0x65, 0x62, 0x73, 0x65, 0x63, 0x75, 0x72, 0x69,
	0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x2f, 0x76, 0x31, 0x3b, 0x77, 0x65, 0x62,
	0x73, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x73, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0xaa,
	0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x57,
	0x65, 0x62, 0x53, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x53, 0x63, 0x61, 0x6e, 0x6e, 0x65,
	0x72, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c,
	0x6f, 0x75, 0x64, 0x5c, 0x57, 0x65, 0x62, 0x53, 0x65, 0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x53,
	0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x5c, 0x56, 0x31, 0xea, 0x02, 0x25, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x57, 0x65, 0x62, 0x53, 0x65,
	0x63, 0x75, 0x72, 0x69, 0x74, 0x79, 0x53, 0x63, 0x61, 0x6e, 0x6e, 0x65, 0x72, 0x3a, 0x3a, 0x56,
	0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_websecurityscanner_v1_finding_proto_rawDescOnce sync.Once
	file_google_cloud_websecurityscanner_v1_finding_proto_rawDescData = file_google_cloud_websecurityscanner_v1_finding_proto_rawDesc
)

func file_google_cloud_websecurityscanner_v1_finding_proto_rawDescGZIP() []byte {
	file_google_cloud_websecurityscanner_v1_finding_proto_rawDescOnce.Do(func() {
		file_google_cloud_websecurityscanner_v1_finding_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_websecurityscanner_v1_finding_proto_rawDescData)
	})
	return file_google_cloud_websecurityscanner_v1_finding_proto_rawDescData
}

var file_google_cloud_websecurityscanner_v1_finding_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_cloud_websecurityscanner_v1_finding_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_cloud_websecurityscanner_v1_finding_proto_goTypes = []interface{}{
	(Finding_Severity)(0),        // 0: google.cloud.websecurityscanner.v1.Finding.Severity
	(*Finding)(nil),              // 1: google.cloud.websecurityscanner.v1.Finding
	(*Form)(nil),                 // 2: google.cloud.websecurityscanner.v1.Form
	(*OutdatedLibrary)(nil),      // 3: google.cloud.websecurityscanner.v1.OutdatedLibrary
	(*ViolatingResource)(nil),    // 4: google.cloud.websecurityscanner.v1.ViolatingResource
	(*VulnerableHeaders)(nil),    // 5: google.cloud.websecurityscanner.v1.VulnerableHeaders
	(*VulnerableParameters)(nil), // 6: google.cloud.websecurityscanner.v1.VulnerableParameters
	(*Xss)(nil),                  // 7: google.cloud.websecurityscanner.v1.Xss
}
var file_google_cloud_websecurityscanner_v1_finding_proto_depIdxs = []int32{
	0, // 0: google.cloud.websecurityscanner.v1.Finding.severity:type_name -> google.cloud.websecurityscanner.v1.Finding.Severity
	2, // 1: google.cloud.websecurityscanner.v1.Finding.form:type_name -> google.cloud.websecurityscanner.v1.Form
	3, // 2: google.cloud.websecurityscanner.v1.Finding.outdated_library:type_name -> google.cloud.websecurityscanner.v1.OutdatedLibrary
	4, // 3: google.cloud.websecurityscanner.v1.Finding.violating_resource:type_name -> google.cloud.websecurityscanner.v1.ViolatingResource
	5, // 4: google.cloud.websecurityscanner.v1.Finding.vulnerable_headers:type_name -> google.cloud.websecurityscanner.v1.VulnerableHeaders
	6, // 5: google.cloud.websecurityscanner.v1.Finding.vulnerable_parameters:type_name -> google.cloud.websecurityscanner.v1.VulnerableParameters
	7, // 6: google.cloud.websecurityscanner.v1.Finding.xss:type_name -> google.cloud.websecurityscanner.v1.Xss
	7, // [7:7] is the sub-list for method output_type
	7, // [7:7] is the sub-list for method input_type
	7, // [7:7] is the sub-list for extension type_name
	7, // [7:7] is the sub-list for extension extendee
	0, // [0:7] is the sub-list for field type_name
}

func init() { file_google_cloud_websecurityscanner_v1_finding_proto_init() }
func file_google_cloud_websecurityscanner_v1_finding_proto_init() {
	if File_google_cloud_websecurityscanner_v1_finding_proto != nil {
		return
	}
	file_google_cloud_websecurityscanner_v1_finding_addon_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_websecurityscanner_v1_finding_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Finding); i {
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
			RawDescriptor: file_google_cloud_websecurityscanner_v1_finding_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_websecurityscanner_v1_finding_proto_goTypes,
		DependencyIndexes: file_google_cloud_websecurityscanner_v1_finding_proto_depIdxs,
		EnumInfos:         file_google_cloud_websecurityscanner_v1_finding_proto_enumTypes,
		MessageInfos:      file_google_cloud_websecurityscanner_v1_finding_proto_msgTypes,
	}.Build()
	File_google_cloud_websecurityscanner_v1_finding_proto = out.File
	file_google_cloud_websecurityscanner_v1_finding_proto_rawDesc = nil
	file_google_cloud_websecurityscanner_v1_finding_proto_goTypes = nil
	file_google_cloud_websecurityscanner_v1_finding_proto_depIdxs = nil
}
