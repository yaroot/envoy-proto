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
// source: google/cloud/osconfig/v1beta/osconfig_service.proto

package osconfig

import (
	proto "github.com/golang/protobuf/proto"
	empty "github.com/golang/protobuf/ptypes/empty"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
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

var File_google_cloud_osconfig_v1beta_osconfig_service_proto protoreflect.FileDescriptor

var file_google_cloud_osconfig_v1beta_osconfig_service_proto_rawDesc = []byte{
	0x0a, 0x33, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x6f,
	0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x6f,
	0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62,
	0x65, 0x74, 0x61, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x67, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70,
	0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x34, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x6f, 0x73, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x70, 0x61, 0x74, 0x63,
	0x68, 0x5f, 0x64, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x2d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2f, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74,
	0x61, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x5f, 0x6a, 0x6f, 0x62, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32,
	0x81, 0x17, 0x0a, 0x0f, 0x4f, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x12, 0xa9, 0x01, 0x0a, 0x0f, 0x45, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x50,
	0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x12, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x45, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x50, 0x61,
	0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x50, 0x61, 0x74,
	0x63, 0x68, 0x4a, 0x6f, 0x62, 0x22, 0x38, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x32, 0x22, 0x2d, 0x2f,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70,
	0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68,
	0x4a, 0x6f, 0x62, 0x73, 0x3a, 0x65, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0x12,
	0x96, 0x01, 0x0a, 0x0b, 0x47, 0x65, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x12,
	0x30, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f,
	0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x47,
	0x65, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x2e, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x22, 0x2d, 0x82, 0xd3, 0xe4, 0x93, 0x02,
	0x27, 0x12, 0x25, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65,
	0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x70, 0x61, 0x74, 0x63,
	0x68, 0x4a, 0x6f, 0x62, 0x73, 0x2f, 0x2a, 0x7d, 0x12, 0xa6, 0x01, 0x0a, 0x0e, 0x43, 0x61, 0x6e,
	0x63, 0x65, 0x6c, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x12, 0x33, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x43, 0x61, 0x6e, 0x63, 0x65,
	0x6c, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e,
	0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x22, 0x37, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x31,
	0x22, 0x2c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d,
	0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68,
	0x4a, 0x6f, 0x62, 0x73, 0x2f, 0x2a, 0x7d, 0x3a, 0x63, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x3a, 0x01,
	0x2a, 0x12, 0xa7, 0x01, 0x0a, 0x0d, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a,
	0x6f, 0x62, 0x73, 0x12, 0x32, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65,
	0x74, 0x61, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x73,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68,
	0x4a, 0x6f, 0x62, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2d, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x27, 0x12, 0x25, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x70,
	0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a,
	0x7d, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0xec, 0x01, 0x0a, 0x1b,
	0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x12, 0x40, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x50,
	0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x44,
	0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x41, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c, 0x69, 0x73,
	0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63,
	0x65, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x22, 0x48, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x39, 0x12, 0x37, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74,
	0x61, 0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63,
	0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x73, 0x2f, 0x2a,
	0x7d, 0x2f, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c,
	0x73, 0xda, 0x41, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0xca, 0x01, 0x0a, 0x15, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79,
	0x6d, 0x65, 0x6e, 0x74, 0x12, 0x3a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62,
	0x65, 0x74, 0x61, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44,
	0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x2d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e,
	0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x22,
	0x46, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x40, 0x22, 0x2c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74,
	0x73, 0x2f, 0x2a, 0x7d, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79,
	0x6d, 0x65, 0x6e, 0x74, 0x73, 0x3a, 0x10, 0x70, 0x61, 0x74, 0x63, 0x68, 0x5f, 0x64, 0x65, 0x70,
	0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0xb2, 0x01, 0x0a, 0x12, 0x47, 0x65, 0x74, 0x50,
	0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x37,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73,
	0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x47, 0x65,
	0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c,
	0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x34, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2e, 0x12, 0x2c,
	0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72,
	0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65,
	0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0x12, 0xc3, 0x01, 0x0a,
	0x14, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79,
	0x6d, 0x65, 0x6e, 0x74, 0x73, 0x12, 0x39, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31,
	0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65,
	0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x3a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d,
	0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x34, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x2e, 0x12, 0x2c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x70,
	0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a,
	0x7d, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e,
	0x74, 0x73, 0x12, 0xa1, 0x01, 0x0a, 0x15, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x50, 0x61, 0x74,
	0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x3a, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x50, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e,
	0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x22, 0x34, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2e, 0x2a, 0x2c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74,
	0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73,
	0x2f, 0x2a, 0x2f, 0x70, 0x61, 0x74, 0x63, 0x68, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65,
	0x6e, 0x74, 0x73, 0x2f, 0x2a, 0x7d, 0x12, 0xce, 0x01, 0x0a, 0x11, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x12, 0x36, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x43, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x29, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62,
	0x65, 0x74, 0x61, 0x2e, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x22,
	0x56, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x39, 0x22, 0x29, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74,
	0x73, 0x2f, 0x2a, 0x7d, 0x2f, 0x67, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69,
	0x65, 0x73, 0x3a, 0x0c, 0x67, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0xda, 0x41, 0x14, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x2c, 0x20, 0x67, 0x75, 0x65, 0x73, 0x74,
	0x5f, 0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x12, 0xaa, 0x01, 0x0a, 0x0e, 0x47, 0x65, 0x74, 0x47,
	0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x12, 0x33, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66,
	0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x47, 0x65, 0x74, 0x47, 0x75, 0x65,
	0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x29, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f,
	0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x47,
	0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x22, 0x38, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x2b, 0x12, 0x29, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d,
	0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x67, 0x75, 0x65,
	0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0xc0, 0x01, 0x0a, 0x11, 0x4c, 0x69, 0x73, 0x74, 0x47, 0x75, 0x65,
	0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x12, 0x36, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66,
	0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x47, 0x75,
	0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x37, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74,
	0x61, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63,
	0x69, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x3a, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x2b, 0x12, 0x29, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b, 0x70, 0x61,
	0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x7d,
	0x2f, 0x67, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0xda, 0x41,
	0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0xdf, 0x01, 0x0a, 0x11, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x12, 0x36, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x29, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31,
	0x62, 0x65, 0x74, 0x61, 0x2e, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0x22, 0x67, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x46, 0x32, 0x36, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74,
	0x61, 0x2f, 0x7b, 0x67, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x2e,
	0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f,
	0x67, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x2f, 0x2a, 0x7d,
	0x3a, 0x0c, 0x67, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0xda, 0x41,
	0x18, 0x67, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x2c, 0x75, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x12, 0x9d, 0x01, 0x0a, 0x11, 0x44, 0x65,
	0x6c, 0x65, 0x74, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x12,
	0x36, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f,
	0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22,
	0x38, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2b, 0x2a, 0x29, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f,
	0x2a, 0x2f, 0x67, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x69, 0x65, 0x73, 0x2f,
	0x2a, 0x7d, 0xda, 0x41, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0xea, 0x01, 0x0a, 0x1a, 0x4c, 0x6f,
	0x6f, 0x6b, 0x75, 0x70, 0x45, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x47, 0x75, 0x65,
	0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x12, 0x3f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x4c, 0x6f, 0x6f, 0x6b, 0x75, 0x70, 0x45, 0x66,
	0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69,
	0x63, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x32, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2e, 0x45, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69,
	0x76, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x22, 0x57, 0x82,
	0xd3, 0xe4, 0x93, 0x02, 0x51, 0x22, 0x4c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x2f, 0x7b,
	0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74,
	0x73, 0x2f, 0x2a, 0x2f, 0x7a, 0x6f, 0x6e, 0x65, 0x73, 0x2f, 0x2a, 0x2f, 0x69, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0x3a, 0x6c, 0x6f, 0x6f, 0x6b, 0x75, 0x70, 0x45,
	0x66, 0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x47, 0x75, 0x65, 0x73, 0x74, 0x50, 0x6f, 0x6c,
	0x69, 0x63, 0x79, 0x3a, 0x01, 0x2a, 0x1a, 0x4b, 0xca, 0x41, 0x17, 0x6f, 0x73, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0xd2, 0x41, 0x2e, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77, 0x77,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x61, 0x75, 0x74, 0x68, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2d, 0x70, 0x6c, 0x61, 0x74, 0x66,
	0x6f, 0x72, 0x6d, 0x42, 0x77, 0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x42, 0x0d, 0x4f, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67,
	0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2f, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x76, 0x31, 0x62,
	0x65, 0x74, 0x61, 0x3b, 0x6f, 0x73, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var file_google_cloud_osconfig_v1beta_osconfig_service_proto_goTypes = []interface{}{
	(*ExecutePatchJobRequest)(nil),              // 0: google.cloud.osconfig.v1beta.ExecutePatchJobRequest
	(*GetPatchJobRequest)(nil),                  // 1: google.cloud.osconfig.v1beta.GetPatchJobRequest
	(*CancelPatchJobRequest)(nil),               // 2: google.cloud.osconfig.v1beta.CancelPatchJobRequest
	(*ListPatchJobsRequest)(nil),                // 3: google.cloud.osconfig.v1beta.ListPatchJobsRequest
	(*ListPatchJobInstanceDetailsRequest)(nil),  // 4: google.cloud.osconfig.v1beta.ListPatchJobInstanceDetailsRequest
	(*CreatePatchDeploymentRequest)(nil),        // 5: google.cloud.osconfig.v1beta.CreatePatchDeploymentRequest
	(*GetPatchDeploymentRequest)(nil),           // 6: google.cloud.osconfig.v1beta.GetPatchDeploymentRequest
	(*ListPatchDeploymentsRequest)(nil),         // 7: google.cloud.osconfig.v1beta.ListPatchDeploymentsRequest
	(*DeletePatchDeploymentRequest)(nil),        // 8: google.cloud.osconfig.v1beta.DeletePatchDeploymentRequest
	(*CreateGuestPolicyRequest)(nil),            // 9: google.cloud.osconfig.v1beta.CreateGuestPolicyRequest
	(*GetGuestPolicyRequest)(nil),               // 10: google.cloud.osconfig.v1beta.GetGuestPolicyRequest
	(*ListGuestPoliciesRequest)(nil),            // 11: google.cloud.osconfig.v1beta.ListGuestPoliciesRequest
	(*UpdateGuestPolicyRequest)(nil),            // 12: google.cloud.osconfig.v1beta.UpdateGuestPolicyRequest
	(*DeleteGuestPolicyRequest)(nil),            // 13: google.cloud.osconfig.v1beta.DeleteGuestPolicyRequest
	(*LookupEffectiveGuestPolicyRequest)(nil),   // 14: google.cloud.osconfig.v1beta.LookupEffectiveGuestPolicyRequest
	(*PatchJob)(nil),                            // 15: google.cloud.osconfig.v1beta.PatchJob
	(*ListPatchJobsResponse)(nil),               // 16: google.cloud.osconfig.v1beta.ListPatchJobsResponse
	(*ListPatchJobInstanceDetailsResponse)(nil), // 17: google.cloud.osconfig.v1beta.ListPatchJobInstanceDetailsResponse
	(*PatchDeployment)(nil),                     // 18: google.cloud.osconfig.v1beta.PatchDeployment
	(*ListPatchDeploymentsResponse)(nil),        // 19: google.cloud.osconfig.v1beta.ListPatchDeploymentsResponse
	(*empty.Empty)(nil),                         // 20: google.protobuf.Empty
	(*GuestPolicy)(nil),                         // 21: google.cloud.osconfig.v1beta.GuestPolicy
	(*ListGuestPoliciesResponse)(nil),           // 22: google.cloud.osconfig.v1beta.ListGuestPoliciesResponse
	(*EffectiveGuestPolicy)(nil),                // 23: google.cloud.osconfig.v1beta.EffectiveGuestPolicy
}
var file_google_cloud_osconfig_v1beta_osconfig_service_proto_depIdxs = []int32{
	0,  // 0: google.cloud.osconfig.v1beta.OsConfigService.ExecutePatchJob:input_type -> google.cloud.osconfig.v1beta.ExecutePatchJobRequest
	1,  // 1: google.cloud.osconfig.v1beta.OsConfigService.GetPatchJob:input_type -> google.cloud.osconfig.v1beta.GetPatchJobRequest
	2,  // 2: google.cloud.osconfig.v1beta.OsConfigService.CancelPatchJob:input_type -> google.cloud.osconfig.v1beta.CancelPatchJobRequest
	3,  // 3: google.cloud.osconfig.v1beta.OsConfigService.ListPatchJobs:input_type -> google.cloud.osconfig.v1beta.ListPatchJobsRequest
	4,  // 4: google.cloud.osconfig.v1beta.OsConfigService.ListPatchJobInstanceDetails:input_type -> google.cloud.osconfig.v1beta.ListPatchJobInstanceDetailsRequest
	5,  // 5: google.cloud.osconfig.v1beta.OsConfigService.CreatePatchDeployment:input_type -> google.cloud.osconfig.v1beta.CreatePatchDeploymentRequest
	6,  // 6: google.cloud.osconfig.v1beta.OsConfigService.GetPatchDeployment:input_type -> google.cloud.osconfig.v1beta.GetPatchDeploymentRequest
	7,  // 7: google.cloud.osconfig.v1beta.OsConfigService.ListPatchDeployments:input_type -> google.cloud.osconfig.v1beta.ListPatchDeploymentsRequest
	8,  // 8: google.cloud.osconfig.v1beta.OsConfigService.DeletePatchDeployment:input_type -> google.cloud.osconfig.v1beta.DeletePatchDeploymentRequest
	9,  // 9: google.cloud.osconfig.v1beta.OsConfigService.CreateGuestPolicy:input_type -> google.cloud.osconfig.v1beta.CreateGuestPolicyRequest
	10, // 10: google.cloud.osconfig.v1beta.OsConfigService.GetGuestPolicy:input_type -> google.cloud.osconfig.v1beta.GetGuestPolicyRequest
	11, // 11: google.cloud.osconfig.v1beta.OsConfigService.ListGuestPolicies:input_type -> google.cloud.osconfig.v1beta.ListGuestPoliciesRequest
	12, // 12: google.cloud.osconfig.v1beta.OsConfigService.UpdateGuestPolicy:input_type -> google.cloud.osconfig.v1beta.UpdateGuestPolicyRequest
	13, // 13: google.cloud.osconfig.v1beta.OsConfigService.DeleteGuestPolicy:input_type -> google.cloud.osconfig.v1beta.DeleteGuestPolicyRequest
	14, // 14: google.cloud.osconfig.v1beta.OsConfigService.LookupEffectiveGuestPolicy:input_type -> google.cloud.osconfig.v1beta.LookupEffectiveGuestPolicyRequest
	15, // 15: google.cloud.osconfig.v1beta.OsConfigService.ExecutePatchJob:output_type -> google.cloud.osconfig.v1beta.PatchJob
	15, // 16: google.cloud.osconfig.v1beta.OsConfigService.GetPatchJob:output_type -> google.cloud.osconfig.v1beta.PatchJob
	15, // 17: google.cloud.osconfig.v1beta.OsConfigService.CancelPatchJob:output_type -> google.cloud.osconfig.v1beta.PatchJob
	16, // 18: google.cloud.osconfig.v1beta.OsConfigService.ListPatchJobs:output_type -> google.cloud.osconfig.v1beta.ListPatchJobsResponse
	17, // 19: google.cloud.osconfig.v1beta.OsConfigService.ListPatchJobInstanceDetails:output_type -> google.cloud.osconfig.v1beta.ListPatchJobInstanceDetailsResponse
	18, // 20: google.cloud.osconfig.v1beta.OsConfigService.CreatePatchDeployment:output_type -> google.cloud.osconfig.v1beta.PatchDeployment
	18, // 21: google.cloud.osconfig.v1beta.OsConfigService.GetPatchDeployment:output_type -> google.cloud.osconfig.v1beta.PatchDeployment
	19, // 22: google.cloud.osconfig.v1beta.OsConfigService.ListPatchDeployments:output_type -> google.cloud.osconfig.v1beta.ListPatchDeploymentsResponse
	20, // 23: google.cloud.osconfig.v1beta.OsConfigService.DeletePatchDeployment:output_type -> google.protobuf.Empty
	21, // 24: google.cloud.osconfig.v1beta.OsConfigService.CreateGuestPolicy:output_type -> google.cloud.osconfig.v1beta.GuestPolicy
	21, // 25: google.cloud.osconfig.v1beta.OsConfigService.GetGuestPolicy:output_type -> google.cloud.osconfig.v1beta.GuestPolicy
	22, // 26: google.cloud.osconfig.v1beta.OsConfigService.ListGuestPolicies:output_type -> google.cloud.osconfig.v1beta.ListGuestPoliciesResponse
	21, // 27: google.cloud.osconfig.v1beta.OsConfigService.UpdateGuestPolicy:output_type -> google.cloud.osconfig.v1beta.GuestPolicy
	20, // 28: google.cloud.osconfig.v1beta.OsConfigService.DeleteGuestPolicy:output_type -> google.protobuf.Empty
	23, // 29: google.cloud.osconfig.v1beta.OsConfigService.LookupEffectiveGuestPolicy:output_type -> google.cloud.osconfig.v1beta.EffectiveGuestPolicy
	15, // [15:30] is the sub-list for method output_type
	0,  // [0:15] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_google_cloud_osconfig_v1beta_osconfig_service_proto_init() }
func file_google_cloud_osconfig_v1beta_osconfig_service_proto_init() {
	if File_google_cloud_osconfig_v1beta_osconfig_service_proto != nil {
		return
	}
	file_google_cloud_osconfig_v1beta_guest_policies_proto_init()
	file_google_cloud_osconfig_v1beta_patch_deployments_proto_init()
	file_google_cloud_osconfig_v1beta_patch_jobs_proto_init()
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_cloud_osconfig_v1beta_osconfig_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_cloud_osconfig_v1beta_osconfig_service_proto_goTypes,
		DependencyIndexes: file_google_cloud_osconfig_v1beta_osconfig_service_proto_depIdxs,
	}.Build()
	File_google_cloud_osconfig_v1beta_osconfig_service_proto = out.File
	file_google_cloud_osconfig_v1beta_osconfig_service_proto_rawDesc = nil
	file_google_cloud_osconfig_v1beta_osconfig_service_proto_goTypes = nil
	file_google_cloud_osconfig_v1beta_osconfig_service_proto_depIdxs = nil
}
