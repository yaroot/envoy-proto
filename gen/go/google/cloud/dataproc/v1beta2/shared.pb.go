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
// source: google/cloud/dataproc/v1beta2/shared.proto

package dataproc

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

// Cluster components that can be activated.
type Component int32

const (
	// Unspecified component.
	Component_COMPONENT_UNSPECIFIED Component = 0
	// The Anaconda python distribution.
	Component_ANACONDA Component = 5
	// Docker
	Component_DOCKER Component = 13
	// The Druid query engine.
	Component_DRUID Component = 9
	// Flink
	Component_FLINK Component = 14
	// The Hive Web HCatalog (the REST service for accessing HCatalog).
	Component_HIVE_WEBHCAT Component = 3
	// The Jupyter Notebook.
	Component_JUPYTER Component = 1
	// The Kerberos security feature.
	Component_KERBEROS Component = 7
	// The Presto query engine.
	Component_PRESTO Component = 6
	// The Ranger service.
	Component_RANGER Component = 12
	// The Solr service.
	Component_SOLR Component = 10
	// The Zeppelin notebook.
	Component_ZEPPELIN Component = 4
	// The Zookeeper service.
	Component_ZOOKEEPER Component = 8
)

// Enum value maps for Component.
var (
	Component_name = map[int32]string{
		0:  "COMPONENT_UNSPECIFIED",
		5:  "ANACONDA",
		13: "DOCKER",
		9:  "DRUID",
		14: "FLINK",
		3:  "HIVE_WEBHCAT",
		1:  "JUPYTER",
		7:  "KERBEROS",
		6:  "PRESTO",
		12: "RANGER",
		10: "SOLR",
		4:  "ZEPPELIN",
		8:  "ZOOKEEPER",
	}
	Component_value = map[string]int32{
		"COMPONENT_UNSPECIFIED": 0,
		"ANACONDA":              5,
		"DOCKER":                13,
		"DRUID":                 9,
		"FLINK":                 14,
		"HIVE_WEBHCAT":          3,
		"JUPYTER":               1,
		"KERBEROS":              7,
		"PRESTO":                6,
		"RANGER":                12,
		"SOLR":                  10,
		"ZEPPELIN":              4,
		"ZOOKEEPER":             8,
	}
)

func (x Component) Enum() *Component {
	p := new(Component)
	*p = x
	return p
}

func (x Component) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Component) Descriptor() protoreflect.EnumDescriptor {
	return file_google_cloud_dataproc_v1beta2_shared_proto_enumTypes[0].Descriptor()
}

func (Component) Type() protoreflect.EnumType {
	return &file_google_cloud_dataproc_v1beta2_shared_proto_enumTypes[0]
}

func (x Component) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Component.Descriptor instead.
func (Component) EnumDescriptor() ([]byte, []int) {
	return file_google_cloud_dataproc_v1beta2_shared_proto_rawDescGZIP(), []int{0}
}

var File_google_cloud_dataproc_v1beta2_shared_proto protoreflect.FileDescriptor

var file_google_cloud_dataproc_v1beta2_shared_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x70, 0x72, 0x6f, 0x63, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2f,
	0x73, 0x68, 0x61, 0x72, 0x65, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1d, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x70,
	0x72, 0x6f, 0x63, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x1a, 0x1c, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2a, 0xc2, 0x01, 0x0a, 0x09, 0x43, 0x6f,
	0x6d, 0x70, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x12, 0x19, 0x0a, 0x15, 0x43, 0x4f, 0x4d, 0x50, 0x4f,
	0x4e, 0x45, 0x4e, 0x54, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44,
	0x10, 0x00, 0x12, 0x0c, 0x0a, 0x08, 0x41, 0x4e, 0x41, 0x43, 0x4f, 0x4e, 0x44, 0x41, 0x10, 0x05,
	0x12, 0x0a, 0x0a, 0x06, 0x44, 0x4f, 0x43, 0x4b, 0x45, 0x52, 0x10, 0x0d, 0x12, 0x09, 0x0a, 0x05,
	0x44, 0x52, 0x55, 0x49, 0x44, 0x10, 0x09, 0x12, 0x09, 0x0a, 0x05, 0x46, 0x4c, 0x49, 0x4e, 0x4b,
	0x10, 0x0e, 0x12, 0x10, 0x0a, 0x0c, 0x48, 0x49, 0x56, 0x45, 0x5f, 0x57, 0x45, 0x42, 0x48, 0x43,
	0x41, 0x54, 0x10, 0x03, 0x12, 0x0b, 0x0a, 0x07, 0x4a, 0x55, 0x50, 0x59, 0x54, 0x45, 0x52, 0x10,
	0x01, 0x12, 0x0c, 0x0a, 0x08, 0x4b, 0x45, 0x52, 0x42, 0x45, 0x52, 0x4f, 0x53, 0x10, 0x07, 0x12,
	0x0a, 0x0a, 0x06, 0x50, 0x52, 0x45, 0x53, 0x54, 0x4f, 0x10, 0x06, 0x12, 0x0a, 0x0a, 0x06, 0x52,
	0x41, 0x4e, 0x47, 0x45, 0x52, 0x10, 0x0c, 0x12, 0x08, 0x0a, 0x04, 0x53, 0x4f, 0x4c, 0x52, 0x10,
	0x0a, 0x12, 0x0c, 0x0a, 0x08, 0x5a, 0x45, 0x50, 0x50, 0x45, 0x4c, 0x49, 0x4e, 0x10, 0x04, 0x12,
	0x0d, 0x0a, 0x09, 0x5a, 0x4f, 0x4f, 0x4b, 0x45, 0x45, 0x50, 0x45, 0x52, 0x10, 0x08, 0x42, 0x79,
	0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x70, 0x72, 0x6f, 0x63, 0x2e, 0x76, 0x31, 0x62, 0x65,
	0x74, 0x61, 0x32, 0x42, 0x0b, 0x53, 0x68, 0x61, 0x72, 0x65, 0x64, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x45, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e,
	0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x70, 0x72, 0x6f, 0x63, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32,
	0x3b, 0x64, 0x61, 0x74, 0x61, 0x70, 0x72, 0x6f, 0x63, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_google_cloud_dataproc_v1beta2_shared_proto_rawDescOnce sync.Once
	file_google_cloud_dataproc_v1beta2_shared_proto_rawDescData = file_google_cloud_dataproc_v1beta2_shared_proto_rawDesc
)

func file_google_cloud_dataproc_v1beta2_shared_proto_rawDescGZIP() []byte {
	file_google_cloud_dataproc_v1beta2_shared_proto_rawDescOnce.Do(func() {
		file_google_cloud_dataproc_v1beta2_shared_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_dataproc_v1beta2_shared_proto_rawDescData)
	})
	return file_google_cloud_dataproc_v1beta2_shared_proto_rawDescData
}

var file_google_cloud_dataproc_v1beta2_shared_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_cloud_dataproc_v1beta2_shared_proto_goTypes = []interface{}{
	(Component)(0), // 0: google.cloud.dataproc.v1beta2.Component
}
var file_google_cloud_dataproc_v1beta2_shared_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_cloud_dataproc_v1beta2_shared_proto_init() }
func file_google_cloud_dataproc_v1beta2_shared_proto_init() {
	if File_google_cloud_dataproc_v1beta2_shared_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_cloud_dataproc_v1beta2_shared_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_dataproc_v1beta2_shared_proto_goTypes,
		DependencyIndexes: file_google_cloud_dataproc_v1beta2_shared_proto_depIdxs,
		EnumInfos:         file_google_cloud_dataproc_v1beta2_shared_proto_enumTypes,
	}.Build()
	File_google_cloud_dataproc_v1beta2_shared_proto = out.File
	file_google_cloud_dataproc_v1beta2_shared_proto_rawDesc = nil
	file_google_cloud_dataproc_v1beta2_shared_proto_goTypes = nil
	file_google_cloud_dataproc_v1beta2_shared_proto_depIdxs = nil
}
