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
// source: google/cloud/bigquery/v2/standard_sql.proto

package bigquery

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

type StandardSqlDataType_TypeKind int32

const (
	// Invalid type.
	StandardSqlDataType_TYPE_KIND_UNSPECIFIED StandardSqlDataType_TypeKind = 0
	// Encoded as a string in decimal format.
	StandardSqlDataType_INT64 StandardSqlDataType_TypeKind = 2
	// Encoded as a boolean "false" or "true".
	StandardSqlDataType_BOOL StandardSqlDataType_TypeKind = 5
	// Encoded as a number, or string "NaN", "Infinity" or "-Infinity".
	StandardSqlDataType_FLOAT64 StandardSqlDataType_TypeKind = 7
	// Encoded as a string value.
	StandardSqlDataType_STRING StandardSqlDataType_TypeKind = 8
	// Encoded as a base64 string per RFC 4648, section 4.
	StandardSqlDataType_BYTES StandardSqlDataType_TypeKind = 9
	// Encoded as an RFC 3339 timestamp with mandatory "Z" time zone string:
	// 1985-04-12T23:20:50.52Z
	StandardSqlDataType_TIMESTAMP StandardSqlDataType_TypeKind = 19
	// Encoded as RFC 3339 full-date format string: 1985-04-12
	StandardSqlDataType_DATE StandardSqlDataType_TypeKind = 10
	// Encoded as RFC 3339 partial-time format string: 23:20:50.52
	StandardSqlDataType_TIME StandardSqlDataType_TypeKind = 20
	// Encoded as RFC 3339 full-date "T" partial-time: 1985-04-12T23:20:50.52
	StandardSqlDataType_DATETIME StandardSqlDataType_TypeKind = 21
	// Encoded as WKT
	StandardSqlDataType_GEOGRAPHY StandardSqlDataType_TypeKind = 22
	// Encoded as a decimal string.
	StandardSqlDataType_NUMERIC StandardSqlDataType_TypeKind = 23
	// Encoded as a list with types matching Type.array_type.
	StandardSqlDataType_ARRAY StandardSqlDataType_TypeKind = 16
	// Encoded as a list with fields of type Type.struct_type[i]. List is used
	// because a JSON object cannot have duplicate field names.
	StandardSqlDataType_STRUCT StandardSqlDataType_TypeKind = 17
)

// Enum value maps for StandardSqlDataType_TypeKind.
var (
	StandardSqlDataType_TypeKind_name = map[int32]string{
		0:  "TYPE_KIND_UNSPECIFIED",
		2:  "INT64",
		5:  "BOOL",
		7:  "FLOAT64",
		8:  "STRING",
		9:  "BYTES",
		19: "TIMESTAMP",
		10: "DATE",
		20: "TIME",
		21: "DATETIME",
		22: "GEOGRAPHY",
		23: "NUMERIC",
		16: "ARRAY",
		17: "STRUCT",
	}
	StandardSqlDataType_TypeKind_value = map[string]int32{
		"TYPE_KIND_UNSPECIFIED": 0,
		"INT64":                 2,
		"BOOL":                  5,
		"FLOAT64":               7,
		"STRING":                8,
		"BYTES":                 9,
		"TIMESTAMP":             19,
		"DATE":                  10,
		"TIME":                  20,
		"DATETIME":              21,
		"GEOGRAPHY":             22,
		"NUMERIC":               23,
		"ARRAY":                 16,
		"STRUCT":                17,
	}
)

func (x StandardSqlDataType_TypeKind) Enum() *StandardSqlDataType_TypeKind {
	p := new(StandardSqlDataType_TypeKind)
	*p = x
	return p
}

func (x StandardSqlDataType_TypeKind) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (StandardSqlDataType_TypeKind) Descriptor() protoreflect.EnumDescriptor {
	return file_google_cloud_bigquery_v2_standard_sql_proto_enumTypes[0].Descriptor()
}

func (StandardSqlDataType_TypeKind) Type() protoreflect.EnumType {
	return &file_google_cloud_bigquery_v2_standard_sql_proto_enumTypes[0]
}

func (x StandardSqlDataType_TypeKind) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use StandardSqlDataType_TypeKind.Descriptor instead.
func (StandardSqlDataType_TypeKind) EnumDescriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_v2_standard_sql_proto_rawDescGZIP(), []int{0, 0}
}

// The type of a variable, e.g., a function argument.
// Examples:
// INT64: {type_kind="INT64"}
// ARRAY<STRING>: {type_kind="ARRAY", array_element_type="STRING"}
// STRUCT<x STRING, y ARRAY<DATE>>:
//   {type_kind="STRUCT",
//    struct_type={fields=[
//      {name="x", type={type_kind="STRING"}},
//      {name="y", type={type_kind="ARRAY", array_element_type="DATE"}}
//    ]}}
type StandardSqlDataType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The top level type of this field.
	// Can be any standard SQL data type (e.g., "INT64", "DATE", "ARRAY").
	TypeKind StandardSqlDataType_TypeKind `protobuf:"varint,1,opt,name=type_kind,json=typeKind,proto3,enum=google.cloud.bigquery.v2.StandardSqlDataType_TypeKind" json:"type_kind,omitempty"`
	// Types that are assignable to SubType:
	//	*StandardSqlDataType_ArrayElementType
	//	*StandardSqlDataType_StructType
	SubType isStandardSqlDataType_SubType `protobuf_oneof:"sub_type"`
}

func (x *StandardSqlDataType) Reset() {
	*x = StandardSqlDataType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StandardSqlDataType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StandardSqlDataType) ProtoMessage() {}

func (x *StandardSqlDataType) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StandardSqlDataType.ProtoReflect.Descriptor instead.
func (*StandardSqlDataType) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_v2_standard_sql_proto_rawDescGZIP(), []int{0}
}

func (x *StandardSqlDataType) GetTypeKind() StandardSqlDataType_TypeKind {
	if x != nil {
		return x.TypeKind
	}
	return StandardSqlDataType_TYPE_KIND_UNSPECIFIED
}

func (m *StandardSqlDataType) GetSubType() isStandardSqlDataType_SubType {
	if m != nil {
		return m.SubType
	}
	return nil
}

func (x *StandardSqlDataType) GetArrayElementType() *StandardSqlDataType {
	if x, ok := x.GetSubType().(*StandardSqlDataType_ArrayElementType); ok {
		return x.ArrayElementType
	}
	return nil
}

func (x *StandardSqlDataType) GetStructType() *StandardSqlStructType {
	if x, ok := x.GetSubType().(*StandardSqlDataType_StructType); ok {
		return x.StructType
	}
	return nil
}

type isStandardSqlDataType_SubType interface {
	isStandardSqlDataType_SubType()
}

type StandardSqlDataType_ArrayElementType struct {
	// The type of the array's elements, if type_kind = "ARRAY".
	ArrayElementType *StandardSqlDataType `protobuf:"bytes,2,opt,name=array_element_type,json=arrayElementType,proto3,oneof"`
}

type StandardSqlDataType_StructType struct {
	// The fields of this struct, in order, if type_kind = "STRUCT".
	StructType *StandardSqlStructType `protobuf:"bytes,3,opt,name=struct_type,json=structType,proto3,oneof"`
}

func (*StandardSqlDataType_ArrayElementType) isStandardSqlDataType_SubType() {}

func (*StandardSqlDataType_StructType) isStandardSqlDataType_SubType() {}

// A field or a column.
type StandardSqlField struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Optional. The name of this field. Can be absent for struct fields.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Optional. The type of this parameter. Absent if not explicitly
	// specified (e.g., CREATE FUNCTION statement can omit the return type;
	// in this case the output parameter does not have this "type" field).
	Type *StandardSqlDataType `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
}

func (x *StandardSqlField) Reset() {
	*x = StandardSqlField{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StandardSqlField) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StandardSqlField) ProtoMessage() {}

func (x *StandardSqlField) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StandardSqlField.ProtoReflect.Descriptor instead.
func (*StandardSqlField) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_v2_standard_sql_proto_rawDescGZIP(), []int{1}
}

func (x *StandardSqlField) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *StandardSqlField) GetType() *StandardSqlDataType {
	if x != nil {
		return x.Type
	}
	return nil
}

type StandardSqlStructType struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Fields []*StandardSqlField `protobuf:"bytes,1,rep,name=fields,proto3" json:"fields,omitempty"`
}

func (x *StandardSqlStructType) Reset() {
	*x = StandardSqlStructType{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StandardSqlStructType) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StandardSqlStructType) ProtoMessage() {}

func (x *StandardSqlStructType) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StandardSqlStructType.ProtoReflect.Descriptor instead.
func (*StandardSqlStructType) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_v2_standard_sql_proto_rawDescGZIP(), []int{2}
}

func (x *StandardSqlStructType) GetFields() []*StandardSqlField {
	if x != nil {
		return x.Fields
	}
	return nil
}

var File_google_cloud_bigquery_v2_standard_sql_proto protoreflect.FileDescriptor

var file_google_cloud_bigquery_v2_standard_sql_proto_rawDesc = []byte{
	0x0a, 0x2b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x62,
	0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2f, 0x76, 0x32, 0x2f, 0x73, 0x74, 0x61, 0x6e, 0x64,
	0x61, 0x72, 0x64, 0x5f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x18, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71,
	0x75, 0x65, 0x72, 0x79, 0x2e, 0x76, 0x32, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69,
	0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf3, 0x03, 0x0a, 0x13, 0x53, 0x74, 0x61, 0x6e, 0x64,
	0x61, 0x72, 0x64, 0x53, 0x71, 0x6c, 0x44, 0x61, 0x74, 0x61, 0x54, 0x79, 0x70, 0x65, 0x12, 0x58,
	0x0a, 0x09, 0x74, 0x79, 0x70, 0x65, 0x5f, 0x6b, 0x69, 0x6e, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0e, 0x32, 0x36, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x76, 0x32, 0x2e, 0x53, 0x74, 0x61,
	0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71, 0x6c, 0x44, 0x61, 0x74, 0x61, 0x54, 0x79, 0x70, 0x65,
	0x2e, 0x54, 0x79, 0x70, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x08,
	0x74, 0x79, 0x70, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x12, 0x5d, 0x0a, 0x12, 0x61, 0x72, 0x72, 0x61,
	0x79, 0x5f, 0x65, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x2d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x76, 0x32, 0x2e,
	0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71, 0x6c, 0x44, 0x61, 0x74, 0x61, 0x54,
	0x79, 0x70, 0x65, 0x48, 0x00, 0x52, 0x10, 0x61, 0x72, 0x72, 0x61, 0x79, 0x45, 0x6c, 0x65, 0x6d,
	0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x52, 0x0a, 0x0b, 0x73, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2f, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71,
	0x75, 0x65, 0x72, 0x79, 0x2e, 0x76, 0x32, 0x2e, 0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64,
	0x53, 0x71, 0x6c, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x54, 0x79, 0x70, 0x65, 0x48, 0x00, 0x52,
	0x0a, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x54, 0x79, 0x70, 0x65, 0x22, 0xc2, 0x01, 0x0a, 0x08,
	0x54, 0x79, 0x70, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x12, 0x19, 0x0a, 0x15, 0x54, 0x59, 0x50, 0x45,
	0x5f, 0x4b, 0x49, 0x4e, 0x44, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45,
	0x44, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x49, 0x4e, 0x54, 0x36, 0x34, 0x10, 0x02, 0x12, 0x08,
	0x0a, 0x04, 0x42, 0x4f, 0x4f, 0x4c, 0x10, 0x05, 0x12, 0x0b, 0x0a, 0x07, 0x46, 0x4c, 0x4f, 0x41,
	0x54, 0x36, 0x34, 0x10, 0x07, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x54, 0x52, 0x49, 0x4e, 0x47, 0x10,
	0x08, 0x12, 0x09, 0x0a, 0x05, 0x42, 0x59, 0x54, 0x45, 0x53, 0x10, 0x09, 0x12, 0x0d, 0x0a, 0x09,
	0x54, 0x49, 0x4d, 0x45, 0x53, 0x54, 0x41, 0x4d, 0x50, 0x10, 0x13, 0x12, 0x08, 0x0a, 0x04, 0x44,
	0x41, 0x54, 0x45, 0x10, 0x0a, 0x12, 0x08, 0x0a, 0x04, 0x54, 0x49, 0x4d, 0x45, 0x10, 0x14, 0x12,
	0x0c, 0x0a, 0x08, 0x44, 0x41, 0x54, 0x45, 0x54, 0x49, 0x4d, 0x45, 0x10, 0x15, 0x12, 0x0d, 0x0a,
	0x09, 0x47, 0x45, 0x4f, 0x47, 0x52, 0x41, 0x50, 0x48, 0x59, 0x10, 0x16, 0x12, 0x0b, 0x0a, 0x07,
	0x4e, 0x55, 0x4d, 0x45, 0x52, 0x49, 0x43, 0x10, 0x17, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x52, 0x52,
	0x41, 0x59, 0x10, 0x10, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x10, 0x11,
	0x42, 0x0a, 0x0a, 0x08, 0x73, 0x75, 0x62, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x22, 0x73, 0x0a, 0x10,
	0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71, 0x6c, 0x46, 0x69, 0x65, 0x6c, 0x64,
	0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03,
	0xe0, 0x41, 0x01, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x46, 0x0a, 0x04, 0x74, 0x79, 0x70,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e,
	0x76, 0x32, 0x2e, 0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71, 0x6c, 0x44, 0x61,
	0x74, 0x61, 0x54, 0x79, 0x70, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x04, 0x74, 0x79, 0x70,
	0x65, 0x22, 0x5b, 0x0a, 0x15, 0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71, 0x6c,
	0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x42, 0x0a, 0x06, 0x66, 0x69,
	0x65, 0x6c, 0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65,
	0x72, 0x79, 0x2e, 0x76, 0x32, 0x2e, 0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71,
	0x6c, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x52, 0x06, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x42, 0x72,
	0x0a, 0x1c, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x76, 0x32, 0x42, 0x10,
	0x53, 0x74, 0x61, 0x6e, 0x64, 0x61, 0x72, 0x64, 0x53, 0x71, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x5a, 0x40, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e,
	0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x62, 0x69,
	0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2f, 0x76, 0x32, 0x3b, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65,
	0x72, 0x79, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_bigquery_v2_standard_sql_proto_rawDescOnce sync.Once
	file_google_cloud_bigquery_v2_standard_sql_proto_rawDescData = file_google_cloud_bigquery_v2_standard_sql_proto_rawDesc
)

func file_google_cloud_bigquery_v2_standard_sql_proto_rawDescGZIP() []byte {
	file_google_cloud_bigquery_v2_standard_sql_proto_rawDescOnce.Do(func() {
		file_google_cloud_bigquery_v2_standard_sql_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_bigquery_v2_standard_sql_proto_rawDescData)
	})
	return file_google_cloud_bigquery_v2_standard_sql_proto_rawDescData
}

var file_google_cloud_bigquery_v2_standard_sql_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_google_cloud_bigquery_v2_standard_sql_proto_goTypes = []interface{}{
	(StandardSqlDataType_TypeKind)(0), // 0: google.cloud.bigquery.v2.StandardSqlDataType.TypeKind
	(*StandardSqlDataType)(nil),       // 1: google.cloud.bigquery.v2.StandardSqlDataType
	(*StandardSqlField)(nil),          // 2: google.cloud.bigquery.v2.StandardSqlField
	(*StandardSqlStructType)(nil),     // 3: google.cloud.bigquery.v2.StandardSqlStructType
}
var file_google_cloud_bigquery_v2_standard_sql_proto_depIdxs = []int32{
	0, // 0: google.cloud.bigquery.v2.StandardSqlDataType.type_kind:type_name -> google.cloud.bigquery.v2.StandardSqlDataType.TypeKind
	1, // 1: google.cloud.bigquery.v2.StandardSqlDataType.array_element_type:type_name -> google.cloud.bigquery.v2.StandardSqlDataType
	3, // 2: google.cloud.bigquery.v2.StandardSqlDataType.struct_type:type_name -> google.cloud.bigquery.v2.StandardSqlStructType
	1, // 3: google.cloud.bigquery.v2.StandardSqlField.type:type_name -> google.cloud.bigquery.v2.StandardSqlDataType
	2, // 4: google.cloud.bigquery.v2.StandardSqlStructType.fields:type_name -> google.cloud.bigquery.v2.StandardSqlField
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_google_cloud_bigquery_v2_standard_sql_proto_init() }
func file_google_cloud_bigquery_v2_standard_sql_proto_init() {
	if File_google_cloud_bigquery_v2_standard_sql_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StandardSqlDataType); i {
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
		file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StandardSqlField); i {
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
		file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StandardSqlStructType); i {
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
	file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*StandardSqlDataType_ArrayElementType)(nil),
		(*StandardSqlDataType_StructType)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_cloud_bigquery_v2_standard_sql_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_bigquery_v2_standard_sql_proto_goTypes,
		DependencyIndexes: file_google_cloud_bigquery_v2_standard_sql_proto_depIdxs,
		EnumInfos:         file_google_cloud_bigquery_v2_standard_sql_proto_enumTypes,
		MessageInfos:      file_google_cloud_bigquery_v2_standard_sql_proto_msgTypes,
	}.Build()
	File_google_cloud_bigquery_v2_standard_sql_proto = out.File
	file_google_cloud_bigquery_v2_standard_sql_proto_rawDesc = nil
	file_google_cloud_bigquery_v2_standard_sql_proto_goTypes = nil
	file_google_cloud_bigquery_v2_standard_sql_proto_depIdxs = nil
}
