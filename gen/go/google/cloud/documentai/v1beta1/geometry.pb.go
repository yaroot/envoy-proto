// Copyright 2019 Google LLC.
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
//

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: google/cloud/documentai/v1beta1/geometry.proto

package documentai

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

// A vertex represents a 2D point in the image.
// NOTE: the vertex coordinates are in the same scale as the original image.
type Vertex struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// X coordinate.
	X int32 `protobuf:"varint,1,opt,name=x,proto3" json:"x,omitempty"`
	// Y coordinate.
	Y int32 `protobuf:"varint,2,opt,name=y,proto3" json:"y,omitempty"`
}

func (x *Vertex) Reset() {
	*x = Vertex{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Vertex) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Vertex) ProtoMessage() {}

func (x *Vertex) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Vertex.ProtoReflect.Descriptor instead.
func (*Vertex) Descriptor() ([]byte, []int) {
	return file_google_cloud_documentai_v1beta1_geometry_proto_rawDescGZIP(), []int{0}
}

func (x *Vertex) GetX() int32 {
	if x != nil {
		return x.X
	}
	return 0
}

func (x *Vertex) GetY() int32 {
	if x != nil {
		return x.Y
	}
	return 0
}

// A vertex represents a 2D point in the image.
// NOTE: the normalized vertex coordinates are relative to the original image
// and range from 0 to 1.
type NormalizedVertex struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// X coordinate.
	X float32 `protobuf:"fixed32,1,opt,name=x,proto3" json:"x,omitempty"`
	// Y coordinate.
	Y float32 `protobuf:"fixed32,2,opt,name=y,proto3" json:"y,omitempty"`
}

func (x *NormalizedVertex) Reset() {
	*x = NormalizedVertex{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NormalizedVertex) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NormalizedVertex) ProtoMessage() {}

func (x *NormalizedVertex) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NormalizedVertex.ProtoReflect.Descriptor instead.
func (*NormalizedVertex) Descriptor() ([]byte, []int) {
	return file_google_cloud_documentai_v1beta1_geometry_proto_rawDescGZIP(), []int{1}
}

func (x *NormalizedVertex) GetX() float32 {
	if x != nil {
		return x.X
	}
	return 0
}

func (x *NormalizedVertex) GetY() float32 {
	if x != nil {
		return x.Y
	}
	return 0
}

// A bounding polygon for the detected image annotation.
type BoundingPoly struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The bounding polygon vertices.
	Vertices []*Vertex `protobuf:"bytes,1,rep,name=vertices,proto3" json:"vertices,omitempty"`
	// The bounding polygon normalized vertices.
	NormalizedVertices []*NormalizedVertex `protobuf:"bytes,2,rep,name=normalized_vertices,json=normalizedVertices,proto3" json:"normalized_vertices,omitempty"`
}

func (x *BoundingPoly) Reset() {
	*x = BoundingPoly{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BoundingPoly) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BoundingPoly) ProtoMessage() {}

func (x *BoundingPoly) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BoundingPoly.ProtoReflect.Descriptor instead.
func (*BoundingPoly) Descriptor() ([]byte, []int) {
	return file_google_cloud_documentai_v1beta1_geometry_proto_rawDescGZIP(), []int{2}
}

func (x *BoundingPoly) GetVertices() []*Vertex {
	if x != nil {
		return x.Vertices
	}
	return nil
}

func (x *BoundingPoly) GetNormalizedVertices() []*NormalizedVertex {
	if x != nil {
		return x.NormalizedVertices
	}
	return nil
}

var File_google_cloud_documentai_v1beta1_geometry_proto protoreflect.FileDescriptor

var file_google_cloud_documentai_v1beta1_geometry_proto_rawDesc = []byte{
	0x0a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x64,
	0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x61, 0x69, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x31, 0x2f, 0x67, 0x65, 0x6f, 0x6d, 0x65, 0x74, 0x72, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64,
	0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x31, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x24, 0x0a, 0x06, 0x56, 0x65, 0x72, 0x74, 0x65, 0x78, 0x12, 0x0c, 0x0a, 0x01, 0x78, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x05, 0x52, 0x01, 0x78, 0x12, 0x0c, 0x0a, 0x01, 0x79, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x01, 0x79, 0x22, 0x2e, 0x0a, 0x10, 0x4e, 0x6f, 0x72, 0x6d, 0x61, 0x6c, 0x69,
	0x7a, 0x65, 0x64, 0x56, 0x65, 0x72, 0x74, 0x65, 0x78, 0x12, 0x0c, 0x0a, 0x01, 0x78, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x02, 0x52, 0x01, 0x78, 0x12, 0x0c, 0x0a, 0x01, 0x79, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x02, 0x52, 0x01, 0x79, 0x22, 0xb7, 0x01, 0x0a, 0x0c, 0x42, 0x6f, 0x75, 0x6e, 0x64, 0x69,
	0x6e, 0x67, 0x50, 0x6f, 0x6c, 0x79, 0x12, 0x43, 0x0a, 0x08, 0x76, 0x65, 0x72, 0x74, 0x69, 0x63,
	0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74,
	0x61, 0x69, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x2e, 0x56, 0x65, 0x72, 0x74, 0x65,
	0x78, 0x52, 0x08, 0x76, 0x65, 0x72, 0x74, 0x69, 0x63, 0x65, 0x73, 0x12, 0x62, 0x0a, 0x13, 0x6e,
	0x6f, 0x72, 0x6d, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64, 0x5f, 0x76, 0x65, 0x72, 0x74, 0x69, 0x63,
	0x65, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74,
	0x61, 0x69, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x2e, 0x4e, 0x6f, 0x72, 0x6d, 0x61,
	0x6c, 0x69, 0x7a, 0x65, 0x64, 0x56, 0x65, 0x72, 0x74, 0x65, 0x78, 0x52, 0x12, 0x6e, 0x6f, 0x72,
	0x6d, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64, 0x56, 0x65, 0x72, 0x74, 0x69, 0x63, 0x65, 0x73, 0x42,
	0xea, 0x01, 0x0a, 0x23, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x61, 0x69, 0x2e,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x42, 0x0d, 0x47, 0x65, 0x6f, 0x6d, 0x65, 0x74, 0x72,
	0x79, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x49, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x61, 0x69,
	0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x3b, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e,
	0x74, 0x61, 0x69, 0xaa, 0x02, 0x1f, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x41, 0x49, 0x2e, 0x56, 0x31,
	0x42, 0x65, 0x74, 0x61, 0x31, 0xca, 0x02, 0x1f, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43,
	0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x41, 0x69, 0x5c,
	0x56, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0xea, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e,
	0x74, 0x41, 0x49, 0x3a, 0x3a, 0x56, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_documentai_v1beta1_geometry_proto_rawDescOnce sync.Once
	file_google_cloud_documentai_v1beta1_geometry_proto_rawDescData = file_google_cloud_documentai_v1beta1_geometry_proto_rawDesc
)

func file_google_cloud_documentai_v1beta1_geometry_proto_rawDescGZIP() []byte {
	file_google_cloud_documentai_v1beta1_geometry_proto_rawDescOnce.Do(func() {
		file_google_cloud_documentai_v1beta1_geometry_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_documentai_v1beta1_geometry_proto_rawDescData)
	})
	return file_google_cloud_documentai_v1beta1_geometry_proto_rawDescData
}

var file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_google_cloud_documentai_v1beta1_geometry_proto_goTypes = []interface{}{
	(*Vertex)(nil),           // 0: google.cloud.documentai.v1beta1.Vertex
	(*NormalizedVertex)(nil), // 1: google.cloud.documentai.v1beta1.NormalizedVertex
	(*BoundingPoly)(nil),     // 2: google.cloud.documentai.v1beta1.BoundingPoly
}
var file_google_cloud_documentai_v1beta1_geometry_proto_depIdxs = []int32{
	0, // 0: google.cloud.documentai.v1beta1.BoundingPoly.vertices:type_name -> google.cloud.documentai.v1beta1.Vertex
	1, // 1: google.cloud.documentai.v1beta1.BoundingPoly.normalized_vertices:type_name -> google.cloud.documentai.v1beta1.NormalizedVertex
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_cloud_documentai_v1beta1_geometry_proto_init() }
func file_google_cloud_documentai_v1beta1_geometry_proto_init() {
	if File_google_cloud_documentai_v1beta1_geometry_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Vertex); i {
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
		file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NormalizedVertex); i {
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
		file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BoundingPoly); i {
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
			RawDescriptor: file_google_cloud_documentai_v1beta1_geometry_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_documentai_v1beta1_geometry_proto_goTypes,
		DependencyIndexes: file_google_cloud_documentai_v1beta1_geometry_proto_depIdxs,
		MessageInfos:      file_google_cloud_documentai_v1beta1_geometry_proto_msgTypes,
	}.Build()
	File_google_cloud_documentai_v1beta1_geometry_proto = out.File
	file_google_cloud_documentai_v1beta1_geometry_proto_rawDesc = nil
	file_google_cloud_documentai_v1beta1_geometry_proto_goTypes = nil
	file_google_cloud_documentai_v1beta1_geometry_proto_depIdxs = nil
}
