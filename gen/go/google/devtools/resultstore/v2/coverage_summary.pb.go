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
// source: google/devtools/resultstore/v2/coverage_summary.proto

package resultstore

import (
	proto "github.com/golang/protobuf/proto"
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

// Summary of line coverage
type LineCoverageSummary struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Number of lines instrumented for coverage.
	InstrumentedLineCount int32 `protobuf:"varint,1,opt,name=instrumented_line_count,json=instrumentedLineCount,proto3" json:"instrumented_line_count,omitempty"`
	// Number of instrumented lines that were executed by the test.
	ExecutedLineCount int32 `protobuf:"varint,2,opt,name=executed_line_count,json=executedLineCount,proto3" json:"executed_line_count,omitempty"`
}

func (x *LineCoverageSummary) Reset() {
	*x = LineCoverageSummary{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LineCoverageSummary) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LineCoverageSummary) ProtoMessage() {}

func (x *LineCoverageSummary) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LineCoverageSummary.ProtoReflect.Descriptor instead.
func (*LineCoverageSummary) Descriptor() ([]byte, []int) {
	return file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescGZIP(), []int{0}
}

func (x *LineCoverageSummary) GetInstrumentedLineCount() int32 {
	if x != nil {
		return x.InstrumentedLineCount
	}
	return 0
}

func (x *LineCoverageSummary) GetExecutedLineCount() int32 {
	if x != nil {
		return x.ExecutedLineCount
	}
	return 0
}

// Summary of branch coverage
// A branch may be:
//  * not executed.  Counted only in total.
//  * executed but not taken.  Appears in total and executed.
//  * executed and taken.  Appears in all three fields.
type BranchCoverageSummary struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The number of branches present in the file.
	TotalBranchCount int32 `protobuf:"varint,1,opt,name=total_branch_count,json=totalBranchCount,proto3" json:"total_branch_count,omitempty"`
	// The number of branches executed out of the total branches present.
	// A branch is executed when its condition is evaluated.
	// This is <= total_branch_count as not all branches are executed.
	ExecutedBranchCount int32 `protobuf:"varint,2,opt,name=executed_branch_count,json=executedBranchCount,proto3" json:"executed_branch_count,omitempty"`
	// The number of branches taken out of the total branches executed.
	// A branch is taken when its condition is satisfied.
	// This is <= executed_branch_count as not all executed branches are taken.
	TakenBranchCount int32 `protobuf:"varint,3,opt,name=taken_branch_count,json=takenBranchCount,proto3" json:"taken_branch_count,omitempty"`
}

func (x *BranchCoverageSummary) Reset() {
	*x = BranchCoverageSummary{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BranchCoverageSummary) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BranchCoverageSummary) ProtoMessage() {}

func (x *BranchCoverageSummary) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BranchCoverageSummary.ProtoReflect.Descriptor instead.
func (*BranchCoverageSummary) Descriptor() ([]byte, []int) {
	return file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescGZIP(), []int{1}
}

func (x *BranchCoverageSummary) GetTotalBranchCount() int32 {
	if x != nil {
		return x.TotalBranchCount
	}
	return 0
}

func (x *BranchCoverageSummary) GetExecutedBranchCount() int32 {
	if x != nil {
		return x.ExecutedBranchCount
	}
	return 0
}

func (x *BranchCoverageSummary) GetTakenBranchCount() int32 {
	if x != nil {
		return x.TakenBranchCount
	}
	return 0
}

// Summary of coverage in each language
type LanguageCoverageSummary struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// This summary is for all files written in this programming language.
	Language Language `protobuf:"varint,1,opt,name=language,proto3,enum=google.devtools.resultstore.v2.Language" json:"language,omitempty"`
	// Summary of lines covered vs instrumented.
	LineSummary *LineCoverageSummary `protobuf:"bytes,2,opt,name=line_summary,json=lineSummary,proto3" json:"line_summary,omitempty"`
	// Summary of branch coverage.
	BranchSummary *BranchCoverageSummary `protobuf:"bytes,3,opt,name=branch_summary,json=branchSummary,proto3" json:"branch_summary,omitempty"`
}

func (x *LanguageCoverageSummary) Reset() {
	*x = LanguageCoverageSummary{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LanguageCoverageSummary) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LanguageCoverageSummary) ProtoMessage() {}

func (x *LanguageCoverageSummary) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LanguageCoverageSummary.ProtoReflect.Descriptor instead.
func (*LanguageCoverageSummary) Descriptor() ([]byte, []int) {
	return file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescGZIP(), []int{2}
}

func (x *LanguageCoverageSummary) GetLanguage() Language {
	if x != nil {
		return x.Language
	}
	return Language_LANGUAGE_UNSPECIFIED
}

func (x *LanguageCoverageSummary) GetLineSummary() *LineCoverageSummary {
	if x != nil {
		return x.LineSummary
	}
	return nil
}

func (x *LanguageCoverageSummary) GetBranchSummary() *BranchCoverageSummary {
	if x != nil {
		return x.BranchSummary
	}
	return nil
}

var File_google_devtools_resultstore_v2_coverage_summary_proto protoreflect.FileDescriptor

var file_google_devtools_resultstore_v2_coverage_summary_proto_rawDesc = []byte{
	0x0a, 0x35, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c,
	0x73, 0x2f, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x2f, 0x76, 0x32,
	0x2f, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x5f, 0x73, 0x75, 0x6d, 0x6d, 0x61, 0x72,
	0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73,
	0x74, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x32, 0x1a, 0x2b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2f, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73,
	0x74, 0x6f, 0x72, 0x65, 0x2f, 0x76, 0x32, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x7d, 0x0a, 0x13, 0x4c, 0x69, 0x6e, 0x65, 0x43, 0x6f, 0x76, 0x65,
	0x72, 0x61, 0x67, 0x65, 0x53, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x12, 0x36, 0x0a, 0x17, 0x69,
	0x6e, 0x73, 0x74, 0x72, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x65, 0x64, 0x5f, 0x6c, 0x69, 0x6e, 0x65,
	0x5f, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x15, 0x69, 0x6e,
	0x73, 0x74, 0x72, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x65, 0x64, 0x4c, 0x69, 0x6e, 0x65, 0x43, 0x6f,
	0x75, 0x6e, 0x74, 0x12, 0x2e, 0x0a, 0x13, 0x65, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x64, 0x5f,
	0x6c, 0x69, 0x6e, 0x65, 0x5f, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x11, 0x65, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x64, 0x4c, 0x69, 0x6e, 0x65, 0x43, 0x6f,
	0x75, 0x6e, 0x74, 0x22, 0xa7, 0x01, 0x0a, 0x15, 0x42, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x43, 0x6f,
	0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x53, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x12, 0x2c, 0x0a,
	0x12, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x5f, 0x62, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x5f, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x10, 0x74, 0x6f, 0x74, 0x61, 0x6c,
	0x42, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x32, 0x0a, 0x15, 0x65,
	0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x64, 0x5f, 0x62, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x5f, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x13, 0x65, 0x78, 0x65, 0x63,
	0x75, 0x74, 0x65, 0x64, 0x42, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12,
	0x2c, 0x0a, 0x12, 0x74, 0x61, 0x6b, 0x65, 0x6e, 0x5f, 0x62, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x5f,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x10, 0x74, 0x61, 0x6b,
	0x65, 0x6e, 0x42, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x22, 0x95, 0x02,
	0x0a, 0x17, 0x4c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x43, 0x6f, 0x76, 0x65, 0x72, 0x61,
	0x67, 0x65, 0x53, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x12, 0x44, 0x0a, 0x08, 0x6c, 0x61, 0x6e,
	0x67, 0x75, 0x61, 0x67, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x28, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x32, 0x2e, 0x4c, 0x61, 0x6e,
	0x67, 0x75, 0x61, 0x67, 0x65, 0x52, 0x08, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x12,
	0x56, 0x0a, 0x0c, 0x6c, 0x69, 0x6e, 0x65, 0x5f, 0x73, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64,
	0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x74,
	0x6f, 0x72, 0x65, 0x2e, 0x76, 0x32, 0x2e, 0x4c, 0x69, 0x6e, 0x65, 0x43, 0x6f, 0x76, 0x65, 0x72,
	0x61, 0x67, 0x65, 0x53, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x52, 0x0b, 0x6c, 0x69, 0x6e, 0x65,
	0x53, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x12, 0x5c, 0x0a, 0x0e, 0x62, 0x72, 0x61, 0x6e, 0x63,
	0x68, 0x5f, 0x73, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x35, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c,
	0x73, 0x2e, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x32,
	0x2e, 0x42, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x43, 0x6f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x53,
	0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x52, 0x0d, 0x62, 0x72, 0x61, 0x6e, 0x63, 0x68, 0x53, 0x75,
	0x6d, 0x6d, 0x61, 0x72, 0x79, 0x42, 0x71, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x72, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x32, 0x50, 0x01, 0x5a, 0x49, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67,
	0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x70, 0x69, 0x73, 0x2f, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x2f, 0x76, 0x32, 0x3b, 0x72, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x73, 0x74, 0x6f, 0x72, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescOnce sync.Once
	file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescData = file_google_devtools_resultstore_v2_coverage_summary_proto_rawDesc
)

func file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescGZIP() []byte {
	file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescOnce.Do(func() {
		file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescData)
	})
	return file_google_devtools_resultstore_v2_coverage_summary_proto_rawDescData
}

var file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_google_devtools_resultstore_v2_coverage_summary_proto_goTypes = []interface{}{
	(*LineCoverageSummary)(nil),     // 0: google.devtools.resultstore.v2.LineCoverageSummary
	(*BranchCoverageSummary)(nil),   // 1: google.devtools.resultstore.v2.BranchCoverageSummary
	(*LanguageCoverageSummary)(nil), // 2: google.devtools.resultstore.v2.LanguageCoverageSummary
	(Language)(0),                   // 3: google.devtools.resultstore.v2.Language
}
var file_google_devtools_resultstore_v2_coverage_summary_proto_depIdxs = []int32{
	3, // 0: google.devtools.resultstore.v2.LanguageCoverageSummary.language:type_name -> google.devtools.resultstore.v2.Language
	0, // 1: google.devtools.resultstore.v2.LanguageCoverageSummary.line_summary:type_name -> google.devtools.resultstore.v2.LineCoverageSummary
	1, // 2: google.devtools.resultstore.v2.LanguageCoverageSummary.branch_summary:type_name -> google.devtools.resultstore.v2.BranchCoverageSummary
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_google_devtools_resultstore_v2_coverage_summary_proto_init() }
func file_google_devtools_resultstore_v2_coverage_summary_proto_init() {
	if File_google_devtools_resultstore_v2_coverage_summary_proto != nil {
		return
	}
	file_google_devtools_resultstore_v2_common_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LineCoverageSummary); i {
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
		file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BranchCoverageSummary); i {
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
		file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LanguageCoverageSummary); i {
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
			RawDescriptor: file_google_devtools_resultstore_v2_coverage_summary_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_devtools_resultstore_v2_coverage_summary_proto_goTypes,
		DependencyIndexes: file_google_devtools_resultstore_v2_coverage_summary_proto_depIdxs,
		MessageInfos:      file_google_devtools_resultstore_v2_coverage_summary_proto_msgTypes,
	}.Build()
	File_google_devtools_resultstore_v2_coverage_summary_proto = out.File
	file_google_devtools_resultstore_v2_coverage_summary_proto_rawDesc = nil
	file_google_devtools_resultstore_v2_coverage_summary_proto_goTypes = nil
	file_google_devtools_resultstore_v2_coverage_summary_proto_depIdxs = nil
}
