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
// source: google/cloud/dataqna/v1alpha/question_service.proto

package dataqna

import (
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	field_mask "google.golang.org/genproto/protobuf/field_mask"
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

// A request to get a previously created question.
type GetQuestionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The unique identifier for the question.
	// Example: `projects/foo/locations/bar/questions/1234`
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// The list of fields to be retrieved.
	ReadMask *field_mask.FieldMask `protobuf:"bytes,2,opt,name=read_mask,json=readMask,proto3" json:"read_mask,omitempty"`
}

func (x *GetQuestionRequest) Reset() {
	*x = GetQuestionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetQuestionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetQuestionRequest) ProtoMessage() {}

func (x *GetQuestionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetQuestionRequest.ProtoReflect.Descriptor instead.
func (*GetQuestionRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescGZIP(), []int{0}
}

func (x *GetQuestionRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *GetQuestionRequest) GetReadMask() *field_mask.FieldMask {
	if x != nil {
		return x.ReadMask
	}
	return nil
}

// Request to create a question resource.
type CreateQuestionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The name of the project this data source reference belongs to.
	// Example: `projects/foo/locations/bar`
	Parent string `protobuf:"bytes,1,opt,name=parent,proto3" json:"parent,omitempty"`
	// Required. The question to create.
	Question *Question `protobuf:"bytes,2,opt,name=question,proto3" json:"question,omitempty"`
}

func (x *CreateQuestionRequest) Reset() {
	*x = CreateQuestionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateQuestionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateQuestionRequest) ProtoMessage() {}

func (x *CreateQuestionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateQuestionRequest.ProtoReflect.Descriptor instead.
func (*CreateQuestionRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescGZIP(), []int{1}
}

func (x *CreateQuestionRequest) GetParent() string {
	if x != nil {
		return x.Parent
	}
	return ""
}

func (x *CreateQuestionRequest) GetQuestion() *Question {
	if x != nil {
		return x.Question
	}
	return nil
}

// Request to execute an interpretation.
type ExecuteQuestionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The unique identifier for the question.
	// Example: `projects/foo/locations/bar/questions/1234`
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Required. Index of the interpretation to execute.
	InterpretationIndex int32 `protobuf:"varint,2,opt,name=interpretation_index,json=interpretationIndex,proto3" json:"interpretation_index,omitempty"`
}

func (x *ExecuteQuestionRequest) Reset() {
	*x = ExecuteQuestionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ExecuteQuestionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ExecuteQuestionRequest) ProtoMessage() {}

func (x *ExecuteQuestionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ExecuteQuestionRequest.ProtoReflect.Descriptor instead.
func (*ExecuteQuestionRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescGZIP(), []int{2}
}

func (x *ExecuteQuestionRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ExecuteQuestionRequest) GetInterpretationIndex() int32 {
	if x != nil {
		return x.InterpretationIndex
	}
	return 0
}

// Request to get user feedback.
type GetUserFeedbackRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The unique identifier for the user feedback.
	// User feedback is a singleton resource on a Question.
	// Example: `projects/foo/locations/bar/questions/1234/userFeedback`
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *GetUserFeedbackRequest) Reset() {
	*x = GetUserFeedbackRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUserFeedbackRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUserFeedbackRequest) ProtoMessage() {}

func (x *GetUserFeedbackRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUserFeedbackRequest.ProtoReflect.Descriptor instead.
func (*GetUserFeedbackRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescGZIP(), []int{3}
}

func (x *GetUserFeedbackRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// Request to updates user feedback.
type UpdateUserFeedbackRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The user feedback to update. This can be called even if there is no
	// user feedback so far.
	// The feedback's name field is used to identify the user feedback (and the
	// corresponding question) to update.
	UserFeedback *UserFeedback `protobuf:"bytes,1,opt,name=user_feedback,json=userFeedback,proto3" json:"user_feedback,omitempty"`
	// The list of fields to be updated.
	UpdateMask *field_mask.FieldMask `protobuf:"bytes,2,opt,name=update_mask,json=updateMask,proto3" json:"update_mask,omitempty"`
}

func (x *UpdateUserFeedbackRequest) Reset() {
	*x = UpdateUserFeedbackRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateUserFeedbackRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateUserFeedbackRequest) ProtoMessage() {}

func (x *UpdateUserFeedbackRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateUserFeedbackRequest.ProtoReflect.Descriptor instead.
func (*UpdateUserFeedbackRequest) Descriptor() ([]byte, []int) {
	return file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescGZIP(), []int{4}
}

func (x *UpdateUserFeedbackRequest) GetUserFeedback() *UserFeedback {
	if x != nil {
		return x.UserFeedback
	}
	return nil
}

func (x *UpdateUserFeedbackRequest) GetUpdateMask() *field_mask.FieldMask {
	if x != nil {
		return x.UpdateMask
	}
	return nil
}

var File_google_cloud_dataqna_v1alpha_question_service_proto protoreflect.FileDescriptor

var file_google_cloud_dataqna_v1alpha_question_service_proto_rawDesc = []byte{
	0x0a, 0x33, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2f, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c,
	0x70, 0x68, 0x61, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68,
	0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2f, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2f, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x6d, 0x61, 0x73,
	0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8a, 0x01, 0x0a, 0x12, 0x47, 0x65, 0x74, 0x51,
	0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b,
	0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x27, 0xe0, 0x41,
	0x02, 0xfa, 0x41, 0x21, 0x0a, 0x1f, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x51, 0x75, 0x65,
	0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x37, 0x0a, 0x09, 0x72,
	0x65, 0x61, 0x64, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4d, 0x61, 0x73, 0x6b, 0x52, 0x08, 0x72, 0x65, 0x61, 0x64,
	0x4d, 0x61, 0x73, 0x6b, 0x22, 0xa3, 0x01, 0x0a, 0x15, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x51,
	0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x41,
	0x0a, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x29,
	0xe0, 0x41, 0x02, 0xfa, 0x41, 0x23, 0x0a, 0x21, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x06, 0x70, 0x61, 0x72, 0x65, 0x6e,
	0x74, 0x12, 0x47, 0x0a, 0x08, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x2e, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x03, 0xe0, 0x41, 0x02,
	0x52, 0x08, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x69, 0x0a, 0x16, 0x45, 0x78,
	0x65, 0x63, 0x75, 0x74, 0x65, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x36, 0x0a,
	0x14, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x65, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x69, 0x6e, 0x64, 0x65, 0x78, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x03, 0xe0, 0x41, 0x02,
	0x52, 0x13, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x70, 0x72, 0x65, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x49, 0x6e, 0x64, 0x65, 0x78, 0x22, 0x59, 0x0a, 0x16, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72,
	0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12,
	0x3f, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x2b, 0xe0,
	0x41, 0x02, 0xfa, 0x41, 0x25, 0x0a, 0x23, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x55, 0x73,
	0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x22, 0xae, 0x01, 0x0a, 0x19, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x46,
	0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x54,
	0x0a, 0x0d, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63,
	0x6b, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0c, 0x75, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64,
	0x62, 0x61, 0x63, 0x6b, 0x12, 0x3b, 0x0a, 0x0b, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x6d,
	0x61, 0x73, 0x6b, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c,
	0x64, 0x4d, 0x61, 0x73, 0x6b, 0x52, 0x0a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x73,
	0x6b, 0x32, 0xec, 0x08, 0x0a, 0x0f, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0xaa, 0x01, 0x0a, 0x0b, 0x47, 0x65, 0x74, 0x51, 0x75, 0x65,
	0x73, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x30, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2e, 0x47, 0x65, 0x74, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76,
	0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x22,
	0x41, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x34, 0x12, 0x32, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73,
	0x2f, 0x2a, 0x2f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x2f, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x12, 0xc5, 0x01, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x51, 0x75, 0x65,
	0x73, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x51, 0x75, 0x65, 0x73, 0x74,
	0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e,
	0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69,
	0x6f, 0x6e, 0x22, 0x56, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x3e, 0x22, 0x32, 0x2f, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x3d, 0x70, 0x72, 0x6f,
	0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2f, 0x2a, 0x7d, 0x2f, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x3a, 0x08,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0xda, 0x41, 0x0f, 0x70, 0x61, 0x72, 0x65, 0x6e,
	0x74, 0x2c, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0xd2, 0x01, 0x0a, 0x0f, 0x45,
	0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x34,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61,
	0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x45, 0x78,
	0x65, 0x63, 0x75, 0x74, 0x65, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c,
	0x70, 0x68, 0x61, 0x2e, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x61, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x3f, 0x22, 0x3a, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2f, 0x7b,
	0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f,
	0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x2f, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x7d, 0x3a, 0x65, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65,
	0x3a, 0x01, 0x2a, 0xda, 0x41, 0x19, 0x6e, 0x61, 0x6d, 0x65, 0x2c, 0x69, 0x6e, 0x74, 0x65, 0x72,
	0x70, 0x72, 0x65, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x6e, 0x64, 0x65, 0x78, 0x12,
	0xc3, 0x01, 0x0a, 0x0f, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62,
	0x61, 0x63, 0x6b, 0x12, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x2e, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61,
	0x63, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2a, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61,
	0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65,
	0x64, 0x62, 0x61, 0x63, 0x6b, 0x22, 0x4e, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x41, 0x12, 0x3f, 0x2f,
	0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72,
	0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f, 0x2a, 0x2f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x2f, 0x2a, 0x2f, 0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a,
	0x2f, 0x75, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x7d, 0xda, 0x41,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0xfc, 0x01, 0x0a, 0x12, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x37, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61,
	0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63,
	0x6b, 0x22, 0x80, 0x01, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x5e, 0x32, 0x4d, 0x2f, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x2f, 0x7b, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x66, 0x65, 0x65, 0x64, 0x62,
	0x61, 0x63, 0x6b, 0x2e, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74,
	0x73, 0x2f, 0x2a, 0x2f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x2f,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x2a, 0x2f, 0x75, 0x73, 0x65, 0x72,
	0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x7d, 0x3a, 0x0d, 0x75, 0x73, 0x65, 0x72, 0x5f,
	0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0xda, 0x41, 0x19, 0x75, 0x73, 0x65, 0x72, 0x5f,
	0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x2c, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f,
	0x6d, 0x61, 0x73, 0x6b, 0x1a, 0x4a, 0xca, 0x41, 0x16, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0xd2,
	0x41, 0x2e, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77, 0x77, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61, 0x75, 0x74,
	0x68, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2d, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d,
	0x42, 0xdf, 0x01, 0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x71, 0x6e, 0x61, 0x2e, 0x76, 0x31,
	0x61, 0x6c, 0x70, 0x68, 0x61, 0x42, 0x14, 0x51, 0x75, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x43, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67,
	0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x70, 0x69, 0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x71,
	0x6e, 0x61, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x3b, 0x64, 0x61, 0x74, 0x61, 0x71,
	0x6e, 0x61, 0xaa, 0x02, 0x1c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x51, 0x6e, 0x41, 0x2e, 0x56, 0x31, 0x41, 0x6c, 0x70, 0x68,
	0x61, 0xca, 0x02, 0x1c, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64,
	0x5c, 0x44, 0x61, 0x74, 0x61, 0x51, 0x6e, 0x41, 0x5c, 0x56, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61,
	0xea, 0x02, 0x1f, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64,
	0x3a, 0x3a, 0x44, 0x61, 0x74, 0x61, 0x51, 0x6e, 0x41, 0x3a, 0x3a, 0x56, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescOnce sync.Once
	file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescData = file_google_cloud_dataqna_v1alpha_question_service_proto_rawDesc
)

func file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescGZIP() []byte {
	file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescOnce.Do(func() {
		file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescData)
	})
	return file_google_cloud_dataqna_v1alpha_question_service_proto_rawDescData
}

var file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_google_cloud_dataqna_v1alpha_question_service_proto_goTypes = []interface{}{
	(*GetQuestionRequest)(nil),        // 0: google.cloud.dataqna.v1alpha.GetQuestionRequest
	(*CreateQuestionRequest)(nil),     // 1: google.cloud.dataqna.v1alpha.CreateQuestionRequest
	(*ExecuteQuestionRequest)(nil),    // 2: google.cloud.dataqna.v1alpha.ExecuteQuestionRequest
	(*GetUserFeedbackRequest)(nil),    // 3: google.cloud.dataqna.v1alpha.GetUserFeedbackRequest
	(*UpdateUserFeedbackRequest)(nil), // 4: google.cloud.dataqna.v1alpha.UpdateUserFeedbackRequest
	(*field_mask.FieldMask)(nil),      // 5: google.protobuf.FieldMask
	(*Question)(nil),                  // 6: google.cloud.dataqna.v1alpha.Question
	(*UserFeedback)(nil),              // 7: google.cloud.dataqna.v1alpha.UserFeedback
}
var file_google_cloud_dataqna_v1alpha_question_service_proto_depIdxs = []int32{
	5, // 0: google.cloud.dataqna.v1alpha.GetQuestionRequest.read_mask:type_name -> google.protobuf.FieldMask
	6, // 1: google.cloud.dataqna.v1alpha.CreateQuestionRequest.question:type_name -> google.cloud.dataqna.v1alpha.Question
	7, // 2: google.cloud.dataqna.v1alpha.UpdateUserFeedbackRequest.user_feedback:type_name -> google.cloud.dataqna.v1alpha.UserFeedback
	5, // 3: google.cloud.dataqna.v1alpha.UpdateUserFeedbackRequest.update_mask:type_name -> google.protobuf.FieldMask
	0, // 4: google.cloud.dataqna.v1alpha.QuestionService.GetQuestion:input_type -> google.cloud.dataqna.v1alpha.GetQuestionRequest
	1, // 5: google.cloud.dataqna.v1alpha.QuestionService.CreateQuestion:input_type -> google.cloud.dataqna.v1alpha.CreateQuestionRequest
	2, // 6: google.cloud.dataqna.v1alpha.QuestionService.ExecuteQuestion:input_type -> google.cloud.dataqna.v1alpha.ExecuteQuestionRequest
	3, // 7: google.cloud.dataqna.v1alpha.QuestionService.GetUserFeedback:input_type -> google.cloud.dataqna.v1alpha.GetUserFeedbackRequest
	4, // 8: google.cloud.dataqna.v1alpha.QuestionService.UpdateUserFeedback:input_type -> google.cloud.dataqna.v1alpha.UpdateUserFeedbackRequest
	6, // 9: google.cloud.dataqna.v1alpha.QuestionService.GetQuestion:output_type -> google.cloud.dataqna.v1alpha.Question
	6, // 10: google.cloud.dataqna.v1alpha.QuestionService.CreateQuestion:output_type -> google.cloud.dataqna.v1alpha.Question
	6, // 11: google.cloud.dataqna.v1alpha.QuestionService.ExecuteQuestion:output_type -> google.cloud.dataqna.v1alpha.Question
	7, // 12: google.cloud.dataqna.v1alpha.QuestionService.GetUserFeedback:output_type -> google.cloud.dataqna.v1alpha.UserFeedback
	7, // 13: google.cloud.dataqna.v1alpha.QuestionService.UpdateUserFeedback:output_type -> google.cloud.dataqna.v1alpha.UserFeedback
	9, // [9:14] is the sub-list for method output_type
	4, // [4:9] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_google_cloud_dataqna_v1alpha_question_service_proto_init() }
func file_google_cloud_dataqna_v1alpha_question_service_proto_init() {
	if File_google_cloud_dataqna_v1alpha_question_service_proto != nil {
		return
	}
	file_google_cloud_dataqna_v1alpha_question_proto_init()
	file_google_cloud_dataqna_v1alpha_user_feedback_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetQuestionRequest); i {
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
		file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateQuestionRequest); i {
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
		file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ExecuteQuestionRequest); i {
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
		file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUserFeedbackRequest); i {
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
		file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateUserFeedbackRequest); i {
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
			RawDescriptor: file_google_cloud_dataqna_v1alpha_question_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_cloud_dataqna_v1alpha_question_service_proto_goTypes,
		DependencyIndexes: file_google_cloud_dataqna_v1alpha_question_service_proto_depIdxs,
		MessageInfos:      file_google_cloud_dataqna_v1alpha_question_service_proto_msgTypes,
	}.Build()
	File_google_cloud_dataqna_v1alpha_question_service_proto = out.File
	file_google_cloud_dataqna_v1alpha_question_service_proto_rawDesc = nil
	file_google_cloud_dataqna_v1alpha_question_service_proto_goTypes = nil
	file_google_cloud_dataqna_v1alpha_question_service_proto_depIdxs = nil
}
