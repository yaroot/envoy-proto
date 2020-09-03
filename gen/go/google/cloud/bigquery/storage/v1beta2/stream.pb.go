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
// source: google/cloud/bigquery/storage/v1beta2/stream.proto

package storage

import (
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
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

// Data format for input or output data.
type DataFormat int32

const (
	DataFormat_DATA_FORMAT_UNSPECIFIED DataFormat = 0
	// Avro is a standard open source row based file format.
	// See https://avro.apache.org/ for more details.
	DataFormat_AVRO DataFormat = 1
	// Arrow is a standard open source column-based message format.
	// See https://arrow.apache.org/ for more details.
	DataFormat_ARROW DataFormat = 2
)

// Enum value maps for DataFormat.
var (
	DataFormat_name = map[int32]string{
		0: "DATA_FORMAT_UNSPECIFIED",
		1: "AVRO",
		2: "ARROW",
	}
	DataFormat_value = map[string]int32{
		"DATA_FORMAT_UNSPECIFIED": 0,
		"AVRO":                    1,
		"ARROW":                   2,
	}
)

func (x DataFormat) Enum() *DataFormat {
	p := new(DataFormat)
	*p = x
	return p
}

func (x DataFormat) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DataFormat) Descriptor() protoreflect.EnumDescriptor {
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_enumTypes[0].Descriptor()
}

func (DataFormat) Type() protoreflect.EnumType {
	return &file_google_cloud_bigquery_storage_v1beta2_stream_proto_enumTypes[0]
}

func (x DataFormat) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DataFormat.Descriptor instead.
func (DataFormat) EnumDescriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescGZIP(), []int{0}
}

// Information about the ReadSession.
type ReadSession struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. Unique identifier for the session, in the form
	// `projects/{project_id}/locations/{location}/sessions/{session_id}`.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Output only. Time at which the session becomes invalid. After this time, subsequent
	// requests to read this Session will return errors. The expire_time is
	// automatically assigned and currently cannot be specified or updated.
	ExpireTime *timestamppb.Timestamp `protobuf:"bytes,2,opt,name=expire_time,json=expireTime,proto3" json:"expire_time,omitempty"`
	// Immutable. Data format of the output data.
	DataFormat DataFormat `protobuf:"varint,3,opt,name=data_format,json=dataFormat,proto3,enum=google.cloud.bigquery.storage.v1beta2.DataFormat" json:"data_format,omitempty"`
	// The schema for the read. If read_options.selected_fields is set, the
	// schema may be different from the table schema as it will only contain
	// the selected fields.
	//
	// Types that are assignable to Schema:
	//	*ReadSession_AvroSchema
	//	*ReadSession_ArrowSchema
	Schema isReadSession_Schema `protobuf_oneof:"schema"`
	// Immutable. Table that this ReadSession is reading from, in the form
	// `projects/{project_id}/datasets/{dataset_id}/tables/{table_id}
	Table string `protobuf:"bytes,6,opt,name=table,proto3" json:"table,omitempty"`
	// Optional. Any modifiers which are applied when reading from the specified table.
	TableModifiers *ReadSession_TableModifiers `protobuf:"bytes,7,opt,name=table_modifiers,json=tableModifiers,proto3" json:"table_modifiers,omitempty"`
	// Optional. Read options for this session (e.g. column selection, filters).
	ReadOptions *ReadSession_TableReadOptions `protobuf:"bytes,8,opt,name=read_options,json=readOptions,proto3" json:"read_options,omitempty"`
	// Output only. A list of streams created with the session.
	//
	// At least one stream is created with the session. In the future, larger
	// request_stream_count values *may* result in this list being unpopulated,
	// in that case, the user will need to use a List method to get the streams
	// instead, which is not yet available.
	Streams []*ReadStream `protobuf:"bytes,10,rep,name=streams,proto3" json:"streams,omitempty"`
}

func (x *ReadSession) Reset() {
	*x = ReadSession{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReadSession) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReadSession) ProtoMessage() {}

func (x *ReadSession) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReadSession.ProtoReflect.Descriptor instead.
func (*ReadSession) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescGZIP(), []int{0}
}

func (x *ReadSession) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ReadSession) GetExpireTime() *timestamppb.Timestamp {
	if x != nil {
		return x.ExpireTime
	}
	return nil
}

func (x *ReadSession) GetDataFormat() DataFormat {
	if x != nil {
		return x.DataFormat
	}
	return DataFormat_DATA_FORMAT_UNSPECIFIED
}

func (m *ReadSession) GetSchema() isReadSession_Schema {
	if m != nil {
		return m.Schema
	}
	return nil
}

func (x *ReadSession) GetAvroSchema() *AvroSchema {
	if x, ok := x.GetSchema().(*ReadSession_AvroSchema); ok {
		return x.AvroSchema
	}
	return nil
}

func (x *ReadSession) GetArrowSchema() *ArrowSchema {
	if x, ok := x.GetSchema().(*ReadSession_ArrowSchema); ok {
		return x.ArrowSchema
	}
	return nil
}

func (x *ReadSession) GetTable() string {
	if x != nil {
		return x.Table
	}
	return ""
}

func (x *ReadSession) GetTableModifiers() *ReadSession_TableModifiers {
	if x != nil {
		return x.TableModifiers
	}
	return nil
}

func (x *ReadSession) GetReadOptions() *ReadSession_TableReadOptions {
	if x != nil {
		return x.ReadOptions
	}
	return nil
}

func (x *ReadSession) GetStreams() []*ReadStream {
	if x != nil {
		return x.Streams
	}
	return nil
}

type isReadSession_Schema interface {
	isReadSession_Schema()
}

type ReadSession_AvroSchema struct {
	// Output only. Avro schema.
	AvroSchema *AvroSchema `protobuf:"bytes,4,opt,name=avro_schema,json=avroSchema,proto3,oneof"`
}

type ReadSession_ArrowSchema struct {
	// Output only. Arrow schema.
	ArrowSchema *ArrowSchema `protobuf:"bytes,5,opt,name=arrow_schema,json=arrowSchema,proto3,oneof"`
}

func (*ReadSession_AvroSchema) isReadSession_Schema() {}

func (*ReadSession_ArrowSchema) isReadSession_Schema() {}

// Information about a single stream that gets data out of the storage system.
// Most of the information about `ReadStream` instances is aggregated, making
// `ReadStream` lightweight.
type ReadStream struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. Name of the stream, in the form
	// `projects/{project_id}/locations/{location}/sessions/{session_id}/streams/{stream_id}`.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *ReadStream) Reset() {
	*x = ReadStream{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReadStream) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReadStream) ProtoMessage() {}

func (x *ReadStream) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReadStream.ProtoReflect.Descriptor instead.
func (*ReadStream) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescGZIP(), []int{1}
}

func (x *ReadStream) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// Additional attributes when reading a table.
type ReadSession_TableModifiers struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The snapshot time of the table. If not set, interpreted as now.
	SnapshotTime *timestamppb.Timestamp `protobuf:"bytes,1,opt,name=snapshot_time,json=snapshotTime,proto3" json:"snapshot_time,omitempty"`
}

func (x *ReadSession_TableModifiers) Reset() {
	*x = ReadSession_TableModifiers{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReadSession_TableModifiers) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReadSession_TableModifiers) ProtoMessage() {}

func (x *ReadSession_TableModifiers) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReadSession_TableModifiers.ProtoReflect.Descriptor instead.
func (*ReadSession_TableModifiers) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescGZIP(), []int{0, 0}
}

func (x *ReadSession_TableModifiers) GetSnapshotTime() *timestamppb.Timestamp {
	if x != nil {
		return x.SnapshotTime
	}
	return nil
}

// Options dictating how we read a table.
type ReadSession_TableReadOptions struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Names of the fields in the table that should be read. If empty, all
	// fields will be read. If the specified field is a nested field, all
	// the sub-fields in the field will be selected. The output field order is
	// unrelated to the order of fields in selected_fields.
	SelectedFields []string `protobuf:"bytes,1,rep,name=selected_fields,json=selectedFields,proto3" json:"selected_fields,omitempty"`
	// SQL text filtering statement, similar to a WHERE clause in a query.
	// Aggregates are not supported.
	//
	// Examples: "int_field > 5"
	//           "date_field = CAST('2014-9-27' as DATE)"
	//           "nullable_field is not NULL"
	//           "st_equals(geo_field, st_geofromtext("POINT(2, 2)"))"
	//           "numeric_field BETWEEN 1.0 AND 5.0"
	RowRestriction string `protobuf:"bytes,2,opt,name=row_restriction,json=rowRestriction,proto3" json:"row_restriction,omitempty"`
	// Optional. Options specific to the Apache Arrow output format.
	ArrowSerializationOptions *ArrowSerializationOptions `protobuf:"bytes,3,opt,name=arrow_serialization_options,json=arrowSerializationOptions,proto3" json:"arrow_serialization_options,omitempty"`
}

func (x *ReadSession_TableReadOptions) Reset() {
	*x = ReadSession_TableReadOptions{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReadSession_TableReadOptions) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReadSession_TableReadOptions) ProtoMessage() {}

func (x *ReadSession_TableReadOptions) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReadSession_TableReadOptions.ProtoReflect.Descriptor instead.
func (*ReadSession_TableReadOptions) Descriptor() ([]byte, []int) {
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescGZIP(), []int{0, 1}
}

func (x *ReadSession_TableReadOptions) GetSelectedFields() []string {
	if x != nil {
		return x.SelectedFields
	}
	return nil
}

func (x *ReadSession_TableReadOptions) GetRowRestriction() string {
	if x != nil {
		return x.RowRestriction
	}
	return ""
}

func (x *ReadSession_TableReadOptions) GetArrowSerializationOptions() *ArrowSerializationOptions {
	if x != nil {
		return x.ArrowSerializationOptions
	}
	return nil
}

var File_google_cloud_bigquery_storage_v1beta2_stream_proto protoreflect.FileDescriptor

var file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDesc = []byte{
	0x0a, 0x32, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x62,
	0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2f, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x25, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73, 0x74, 0x6f, 0x72,
	0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x1a, 0x1f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65,
	0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2f, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2f, 0x61,
	0x72, 0x72, 0x6f, 0x77, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72,
	0x79, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x32, 0x2f, 0x61, 0x76, 0x72, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69,
	0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa0, 0x09,
	0x0a, 0x0b, 0x52, 0x65, 0x61, 0x64, 0x53, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x17, 0x0a,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x03,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x40, 0x0a, 0x0b, 0x65, 0x78, 0x70, 0x69, 0x72, 0x65,
	0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69,
	0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x0a, 0x65, 0x78,
	0x70, 0x69, 0x72, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x57, 0x0a, 0x0b, 0x64, 0x61, 0x74, 0x61,
	0x5f, 0x66, 0x6f, 0x72, 0x6d, 0x61, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x31, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67,
	0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31,
	0x62, 0x65, 0x74, 0x61, 0x32, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x46, 0x6f, 0x72, 0x6d, 0x61, 0x74,
	0x42, 0x03, 0xe0, 0x41, 0x05, 0x52, 0x0a, 0x64, 0x61, 0x74, 0x61, 0x46, 0x6f, 0x72, 0x6d, 0x61,
	0x74, 0x12, 0x59, 0x0a, 0x0b, 0x61, 0x76, 0x72, 0x6f, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2e, 0x41,
	0x76, 0x72, 0x6f, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x00,
	0x52, 0x0a, 0x61, 0x76, 0x72, 0x6f, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x12, 0x5c, 0x0a, 0x0c,
	0x61, 0x72, 0x72, 0x6f, 0x77, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x32, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2e, 0x41, 0x72, 0x72, 0x6f, 0x77,
	0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x00, 0x52, 0x0b, 0x61,
	0x72, 0x72, 0x6f, 0x77, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x12, 0x3b, 0x0a, 0x05, 0x74, 0x61,
	0x62, 0x6c, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x42, 0x25, 0xe0, 0x41, 0x05, 0xfa, 0x41,
	0x1f, 0x0a, 0x1d, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x52, 0x05, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x6f, 0x0a, 0x0f, 0x74, 0x61, 0x62, 0x6c, 0x65,
	0x5f, 0x6d, 0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x72, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x41, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65,
	0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2e, 0x52, 0x65, 0x61, 0x64, 0x53, 0x65, 0x73,
	0x73, 0x69, 0x6f, 0x6e, 0x2e, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x6f, 0x64, 0x69, 0x66, 0x69,
	0x65, 0x72, 0x73, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x0e, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x4d,
	0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x72, 0x73, 0x12, 0x6b, 0x0a, 0x0c, 0x72, 0x65, 0x61, 0x64,
	0x5f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x43,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69,
	0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76,
	0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2e, 0x52, 0x65, 0x61, 0x64, 0x53, 0x65, 0x73, 0x73, 0x69,
	0x6f, 0x6e, 0x2e, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x65, 0x61, 0x64, 0x4f, 0x70, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x0b, 0x72, 0x65, 0x61, 0x64, 0x4f, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x50, 0x0a, 0x07, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x73,
	0x18, 0x0a, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2e, 0x52,
	0x65, 0x61, 0x64, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x07,
	0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x73, 0x1a, 0x51, 0x0a, 0x0e, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x4d, 0x6f, 0x64, 0x69, 0x66, 0x69, 0x65, 0x72, 0x73, 0x12, 0x3f, 0x0a, 0x0d, 0x73, 0x6e, 0x61,
	0x70, 0x73, 0x68, 0x6f, 0x74, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x0c, 0x73, 0x6e,
	0x61, 0x70, 0x73, 0x68, 0x6f, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x1a, 0xec, 0x01, 0x0a, 0x10, 0x54,
	0x61, 0x62, 0x6c, 0x65, 0x52, 0x65, 0x61, 0x64, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12,
	0x27, 0x0a, 0x0f, 0x73, 0x65, 0x6c, 0x65, 0x63, 0x74, 0x65, 0x64, 0x5f, 0x66, 0x69, 0x65, 0x6c,
	0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52, 0x0e, 0x73, 0x65, 0x6c, 0x65, 0x63, 0x74,
	0x65, 0x64, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x12, 0x27, 0x0a, 0x0f, 0x72, 0x6f, 0x77, 0x5f,
	0x72, 0x65, 0x73, 0x74, 0x72, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0e, 0x72, 0x6f, 0x77, 0x52, 0x65, 0x73, 0x74, 0x72, 0x69, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x12, 0x85, 0x01, 0x0a, 0x1b, 0x61, 0x72, 0x72, 0x6f, 0x77, 0x5f, 0x73, 0x65, 0x72, 0x69,
	0x61, 0x6c, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x40, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x2e,
	0x41, 0x72, 0x72, 0x6f, 0x77, 0x53, 0x65, 0x72, 0x69, 0x61, 0x6c, 0x69, 0x7a, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x19,
	0x61, 0x72, 0x72, 0x6f, 0x77, 0x53, 0x65, 0x72, 0x69, 0x61, 0x6c, 0x69, 0x7a, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x3a, 0x6b, 0xea, 0x41, 0x68, 0x0a, 0x2a,
	0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x52,
	0x65, 0x61, 0x64, 0x53, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x3a, 0x70, 0x72, 0x6f, 0x6a,
	0x65, 0x63, 0x74, 0x73, 0x2f, 0x7b, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x7d, 0x2f, 0x6c,
	0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x7b, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x7d, 0x2f, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x7b, 0x73, 0x65,
	0x73, 0x73, 0x69, 0x6f, 0x6e, 0x7d, 0x42, 0x08, 0x0a, 0x06, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61,
	0x22, 0xa2, 0x01, 0x0a, 0x0a, 0x52, 0x65, 0x61, 0x64, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x12,
	0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0,
	0x41, 0x03, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x3a, 0x7b, 0xea, 0x41, 0x78, 0x0a, 0x29, 0x62,
	0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x52, 0x65,
	0x61, 0x64, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x12, 0x4b, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63,
	0x74, 0x73, 0x2f, 0x7b, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x7d, 0x2f, 0x6c, 0x6f, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x7b, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x7d, 0x2f, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x7b, 0x73, 0x65, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x7d, 0x2f, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x73, 0x2f, 0x7b, 0x73, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x7d, 0x2a, 0x3e, 0x0a, 0x0a, 0x44, 0x61, 0x74, 0x61, 0x46, 0x6f, 0x72,
	0x6d, 0x61, 0x74, 0x12, 0x1b, 0x0a, 0x17, 0x44, 0x41, 0x54, 0x41, 0x5f, 0x46, 0x4f, 0x52, 0x4d,
	0x41, 0x54, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00,
	0x12, 0x08, 0x0a, 0x04, 0x41, 0x56, 0x52, 0x4f, 0x10, 0x01, 0x12, 0x09, 0x0a, 0x05, 0x41, 0x52,
	0x52, 0x4f, 0x57, 0x10, 0x02, 0x42, 0xe0, 0x01, 0x0a, 0x29, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x62, 0x69, 0x67, 0x71, 0x75,
	0x65, 0x72, 0x79, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x62, 0x65,
	0x74, 0x61, 0x32, 0x42, 0x0b, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x4c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e,
	0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f,
	0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65,
	0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x32, 0x3b, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65,
	0xea, 0x41, 0x55, 0x0a, 0x1d, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x54, 0x61, 0x62,
	0x6c, 0x65, 0x12, 0x34, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x7b, 0x70, 0x72,
	0x6f, 0x6a, 0x65, 0x63, 0x74, 0x7d, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x73, 0x2f,
	0x7b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x7d, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x73,
	0x2f, 0x7b, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x7d, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescOnce sync.Once
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescData = file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDesc
)

func file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescGZIP() []byte {
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescOnce.Do(func() {
		file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescData)
	})
	return file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDescData
}

var file_google_cloud_bigquery_storage_v1beta2_stream_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_google_cloud_bigquery_storage_v1beta2_stream_proto_goTypes = []interface{}{
	(DataFormat)(0),                      // 0: google.cloud.bigquery.storage.v1beta2.DataFormat
	(*ReadSession)(nil),                  // 1: google.cloud.bigquery.storage.v1beta2.ReadSession
	(*ReadStream)(nil),                   // 2: google.cloud.bigquery.storage.v1beta2.ReadStream
	(*ReadSession_TableModifiers)(nil),   // 3: google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiers
	(*ReadSession_TableReadOptions)(nil), // 4: google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions
	(*timestamppb.Timestamp)(nil),        // 5: google.protobuf.Timestamp
	(*AvroSchema)(nil),                   // 6: google.cloud.bigquery.storage.v1beta2.AvroSchema
	(*ArrowSchema)(nil),                  // 7: google.cloud.bigquery.storage.v1beta2.ArrowSchema
	(*ArrowSerializationOptions)(nil),    // 8: google.cloud.bigquery.storage.v1beta2.ArrowSerializationOptions
}
var file_google_cloud_bigquery_storage_v1beta2_stream_proto_depIdxs = []int32{
	5, // 0: google.cloud.bigquery.storage.v1beta2.ReadSession.expire_time:type_name -> google.protobuf.Timestamp
	0, // 1: google.cloud.bigquery.storage.v1beta2.ReadSession.data_format:type_name -> google.cloud.bigquery.storage.v1beta2.DataFormat
	6, // 2: google.cloud.bigquery.storage.v1beta2.ReadSession.avro_schema:type_name -> google.cloud.bigquery.storage.v1beta2.AvroSchema
	7, // 3: google.cloud.bigquery.storage.v1beta2.ReadSession.arrow_schema:type_name -> google.cloud.bigquery.storage.v1beta2.ArrowSchema
	3, // 4: google.cloud.bigquery.storage.v1beta2.ReadSession.table_modifiers:type_name -> google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiers
	4, // 5: google.cloud.bigquery.storage.v1beta2.ReadSession.read_options:type_name -> google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions
	2, // 6: google.cloud.bigquery.storage.v1beta2.ReadSession.streams:type_name -> google.cloud.bigquery.storage.v1beta2.ReadStream
	5, // 7: google.cloud.bigquery.storage.v1beta2.ReadSession.TableModifiers.snapshot_time:type_name -> google.protobuf.Timestamp
	8, // 8: google.cloud.bigquery.storage.v1beta2.ReadSession.TableReadOptions.arrow_serialization_options:type_name -> google.cloud.bigquery.storage.v1beta2.ArrowSerializationOptions
	9, // [9:9] is the sub-list for method output_type
	9, // [9:9] is the sub-list for method input_type
	9, // [9:9] is the sub-list for extension type_name
	9, // [9:9] is the sub-list for extension extendee
	0, // [0:9] is the sub-list for field type_name
}

func init() { file_google_cloud_bigquery_storage_v1beta2_stream_proto_init() }
func file_google_cloud_bigquery_storage_v1beta2_stream_proto_init() {
	if File_google_cloud_bigquery_storage_v1beta2_stream_proto != nil {
		return
	}
	file_google_cloud_bigquery_storage_v1beta2_arrow_proto_init()
	file_google_cloud_bigquery_storage_v1beta2_avro_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReadSession); i {
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
		file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReadStream); i {
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
		file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReadSession_TableModifiers); i {
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
		file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReadSession_TableReadOptions); i {
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
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*ReadSession_AvroSchema)(nil),
		(*ReadSession_ArrowSchema)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_bigquery_storage_v1beta2_stream_proto_goTypes,
		DependencyIndexes: file_google_cloud_bigquery_storage_v1beta2_stream_proto_depIdxs,
		EnumInfos:         file_google_cloud_bigquery_storage_v1beta2_stream_proto_enumTypes,
		MessageInfos:      file_google_cloud_bigquery_storage_v1beta2_stream_proto_msgTypes,
	}.Build()
	File_google_cloud_bigquery_storage_v1beta2_stream_proto = out.File
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_rawDesc = nil
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_goTypes = nil
	file_google_cloud_bigquery_storage_v1beta2_stream_proto_depIdxs = nil
}
