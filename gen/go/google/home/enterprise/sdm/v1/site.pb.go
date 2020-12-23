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
// source: google/home/enterprise/sdm/v1/site.proto

package sdm

import (
	proto "github.com/golang/protobuf/proto"
	_struct "github.com/golang/protobuf/ptypes/struct"
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

// Structure resource represents an instance of enterprise managed home or hotel
// room.
type Structure struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The resource name of the structure. For example:
	// "enterprises/XYZ/structures/ABC".
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Structure traits.
	Traits *_struct.Struct `protobuf:"bytes,2,opt,name=traits,proto3" json:"traits,omitempty"`
}

func (x *Structure) Reset() {
	*x = Structure{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_home_enterprise_sdm_v1_site_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Structure) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Structure) ProtoMessage() {}

func (x *Structure) ProtoReflect() protoreflect.Message {
	mi := &file_google_home_enterprise_sdm_v1_site_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Structure.ProtoReflect.Descriptor instead.
func (*Structure) Descriptor() ([]byte, []int) {
	return file_google_home_enterprise_sdm_v1_site_proto_rawDescGZIP(), []int{0}
}

func (x *Structure) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Structure) GetTraits() *_struct.Struct {
	if x != nil {
		return x.Traits
	}
	return nil
}

// Room resource represents an instance of sub-space within a structure such as
// rooms in a hotel suite or rental apartment.
type Room struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The resource name of the room. For example:
	// "enterprises/XYZ/structures/ABC/rooms/123".
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Room traits.
	Traits *_struct.Struct `protobuf:"bytes,2,opt,name=traits,proto3" json:"traits,omitempty"`
}

func (x *Room) Reset() {
	*x = Room{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_home_enterprise_sdm_v1_site_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Room) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Room) ProtoMessage() {}

func (x *Room) ProtoReflect() protoreflect.Message {
	mi := &file_google_home_enterprise_sdm_v1_site_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Room.ProtoReflect.Descriptor instead.
func (*Room) Descriptor() ([]byte, []int) {
	return file_google_home_enterprise_sdm_v1_site_proto_rawDescGZIP(), []int{1}
}

func (x *Room) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Room) GetTraits() *_struct.Struct {
	if x != nil {
		return x.Traits
	}
	return nil
}

var File_google_home_enterprise_sdm_v1_site_proto protoreflect.FileDescriptor

var file_google_home_enterprise_sdm_v1_site_proto_rawDesc = []byte{
	0x0a, 0x28, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x68, 0x6f, 0x6d, 0x65, 0x2f, 0x65, 0x6e,
	0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65, 0x2f, 0x73, 0x64, 0x6d, 0x2f, 0x76, 0x31, 0x2f,
	0x73, 0x69, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1d, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x68, 0x6f, 0x6d, 0x65, 0x2e, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69,
	0x73, 0x65, 0x2e, 0x73, 0x64, 0x6d, 0x2e, 0x76, 0x31, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61,
	0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0xbb, 0x01, 0x0a, 0x09, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x75, 0x72,
	0x65, 0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x03, 0xe0, 0x41, 0x03, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x2f, 0x0a, 0x06, 0x74, 0x72,
	0x61, 0x69, 0x74, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x52, 0x06, 0x74, 0x72, 0x61, 0x69, 0x74, 0x73, 0x3a, 0x64, 0xea, 0x41, 0x61,
	0x0a, 0x2e, 0x73, 0x6d, 0x61, 0x72, 0x74, 0x64, 0x65, 0x76, 0x69, 0x63, 0x65, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70,
	0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x75, 0x72, 0x65,
	0x12, 0x2f, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65, 0x73, 0x2f, 0x7b, 0x65,
	0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65, 0x7d, 0x2f, 0x73, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x75, 0x72, 0x65, 0x73, 0x2f, 0x7b, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x75, 0x72, 0x65,
	0x7d, 0x22, 0xbe, 0x01, 0x0a, 0x04, 0x52, 0x6f, 0x6f, 0x6d, 0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0x2f, 0x0a, 0x06, 0x74, 0x72, 0x61, 0x69, 0x74, 0x73, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x52, 0x06, 0x74, 0x72,
	0x61, 0x69, 0x74, 0x73, 0x3a, 0x6c, 0xea, 0x41, 0x69, 0x0a, 0x29, 0x73, 0x6d, 0x61, 0x72, 0x74,
	0x64, 0x65, 0x76, 0x69, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x6d, 0x65, 0x6e, 0x74,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x52, 0x6f, 0x6f, 0x6d, 0x12, 0x3c, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65,
	0x73, 0x2f, 0x7b, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65, 0x7d, 0x2f, 0x73,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x75, 0x72, 0x65, 0x73, 0x2f, 0x7b, 0x73, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x75, 0x72, 0x65, 0x7d, 0x2f, 0x72, 0x6f, 0x6f, 0x6d, 0x73, 0x2f, 0x7b, 0x72, 0x6f, 0x6f,
	0x6d, 0x7d, 0x42, 0xb2, 0x01, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x68, 0x6f, 0x6d, 0x65, 0x2e, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73,
	0x65, 0x2e, 0x73, 0x64, 0x6d, 0x2e, 0x76, 0x31, 0x50, 0x01, 0x5a, 0x40, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65,
	0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69,
	0x73, 0x2f, 0x68, 0x6f, 0x6d, 0x65, 0x2f, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73,
	0x65, 0x2f, 0x73, 0x64, 0x6d, 0x2f, 0x76, 0x31, 0x3b, 0x73, 0x64, 0x6d, 0xa2, 0x02, 0x08, 0x47,
	0x48, 0x45, 0x4e, 0x54, 0x53, 0x44, 0x4d, 0xaa, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x48, 0x6f, 0x6d, 0x65, 0x2e, 0x45, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65,
	0x2e, 0x53, 0x64, 0x6d, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x1d, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x5c, 0x48, 0x6f, 0x6d, 0x65, 0x5c, 0x45, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x69, 0x73, 0x65,
	0x5c, 0x53, 0x64, 0x6d, 0x5c, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_home_enterprise_sdm_v1_site_proto_rawDescOnce sync.Once
	file_google_home_enterprise_sdm_v1_site_proto_rawDescData = file_google_home_enterprise_sdm_v1_site_proto_rawDesc
)

func file_google_home_enterprise_sdm_v1_site_proto_rawDescGZIP() []byte {
	file_google_home_enterprise_sdm_v1_site_proto_rawDescOnce.Do(func() {
		file_google_home_enterprise_sdm_v1_site_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_home_enterprise_sdm_v1_site_proto_rawDescData)
	})
	return file_google_home_enterprise_sdm_v1_site_proto_rawDescData
}

var file_google_home_enterprise_sdm_v1_site_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_google_home_enterprise_sdm_v1_site_proto_goTypes = []interface{}{
	(*Structure)(nil),      // 0: google.home.enterprise.sdm.v1.Structure
	(*Room)(nil),           // 1: google.home.enterprise.sdm.v1.Room
	(*_struct.Struct)(nil), // 2: google.protobuf.Struct
}
var file_google_home_enterprise_sdm_v1_site_proto_depIdxs = []int32{
	2, // 0: google.home.enterprise.sdm.v1.Structure.traits:type_name -> google.protobuf.Struct
	2, // 1: google.home.enterprise.sdm.v1.Room.traits:type_name -> google.protobuf.Struct
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_home_enterprise_sdm_v1_site_proto_init() }
func file_google_home_enterprise_sdm_v1_site_proto_init() {
	if File_google_home_enterprise_sdm_v1_site_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_home_enterprise_sdm_v1_site_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Structure); i {
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
		file_google_home_enterprise_sdm_v1_site_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Room); i {
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
			RawDescriptor: file_google_home_enterprise_sdm_v1_site_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_home_enterprise_sdm_v1_site_proto_goTypes,
		DependencyIndexes: file_google_home_enterprise_sdm_v1_site_proto_depIdxs,
		MessageInfos:      file_google_home_enterprise_sdm_v1_site_proto_msgTypes,
	}.Build()
	File_google_home_enterprise_sdm_v1_site_proto = out.File
	file_google_home_enterprise_sdm_v1_site_proto_rawDesc = nil
	file_google_home_enterprise_sdm_v1_site_proto_goTypes = nil
	file_google_home_enterprise_sdm_v1_site_proto_depIdxs = nil
}
