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
// source: google/actions/sdk/v2/interactionmodel/prompt/static_simple_prompt.proto

package prompt

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

// Represents a simple prompt to be send to a user.
type StaticSimplePrompt struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// List of possible variants.
	Variants []*StaticSimplePrompt_Variant `protobuf:"bytes,1,rep,name=variants,proto3" json:"variants,omitempty"`
}

func (x *StaticSimplePrompt) Reset() {
	*x = StaticSimplePrompt{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StaticSimplePrompt) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StaticSimplePrompt) ProtoMessage() {}

func (x *StaticSimplePrompt) ProtoReflect() protoreflect.Message {
	mi := &file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StaticSimplePrompt.ProtoReflect.Descriptor instead.
func (*StaticSimplePrompt) Descriptor() ([]byte, []int) {
	return file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescGZIP(), []int{0}
}

func (x *StaticSimplePrompt) GetVariants() []*StaticSimplePrompt_Variant {
	if x != nil {
		return x.Variants
	}
	return nil
}

// Represents a variant which is part of the simple prompt.
type StaticSimplePrompt_Variant struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Optional. Represents the speech to be spoken to the user.  Can be SSML or text to
	// speech.
	// By default, speech will be appended to previous Simple prompt's
	// speech. If the `override` field in the containing prompt is `true` the
	// speech defined in this field will override previous Simple prompt's
	// speech.
	Speech string `protobuf:"bytes,1,opt,name=speech,proto3" json:"speech,omitempty"`
	// Optional. Text to display in the chat bubble. If not given, a display rendering of
	// the speech field above will be used. Limited to 640 chars.
	// By default, text will be appended to previous Simple prompt's text.
	// If the `override` field in the containing prompt is `true` the text
	// defined in this field will override previous Simple prompt's text.
	Text string `protobuf:"bytes,2,opt,name=text,proto3" json:"text,omitempty"`
}

func (x *StaticSimplePrompt_Variant) Reset() {
	*x = StaticSimplePrompt_Variant{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StaticSimplePrompt_Variant) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StaticSimplePrompt_Variant) ProtoMessage() {}

func (x *StaticSimplePrompt_Variant) ProtoReflect() protoreflect.Message {
	mi := &file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StaticSimplePrompt_Variant.ProtoReflect.Descriptor instead.
func (*StaticSimplePrompt_Variant) Descriptor() ([]byte, []int) {
	return file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescGZIP(), []int{0, 0}
}

func (x *StaticSimplePrompt_Variant) GetSpeech() string {
	if x != nil {
		return x.Speech
	}
	return ""
}

func (x *StaticSimplePrompt_Variant) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

var File_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto protoreflect.FileDescriptor

var file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDesc = []byte{
	0x0a, 0x48, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x76, 0x32, 0x2f, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x2f,
	0x73, 0x74, 0x61, 0x74, 0x69, 0x63, 0x5f, 0x73, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x5f, 0x70, 0x72,
	0x6f, 0x6d, 0x70, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x2d, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x76,
	0x32, 0x2e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61,
	0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xbc, 0x01, 0x0a, 0x12, 0x53,
	0x74, 0x61, 0x74, 0x69, 0x63, 0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x50, 0x72, 0x6f, 0x6d, 0x70,
	0x74, 0x12, 0x65, 0x0a, 0x08, 0x76, 0x61, 0x72, 0x69, 0x61, 0x6e, 0x74, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x49, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x76, 0x32, 0x2e, 0x69, 0x6e, 0x74, 0x65,
	0x72, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f,
	0x6d, 0x70, 0x74, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x69, 0x63, 0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65,
	0x50, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x2e, 0x56, 0x61, 0x72, 0x69, 0x61, 0x6e, 0x74, 0x52, 0x08,
	0x76, 0x61, 0x72, 0x69, 0x61, 0x6e, 0x74, 0x73, 0x1a, 0x3f, 0x0a, 0x07, 0x56, 0x61, 0x72, 0x69,
	0x61, 0x6e, 0x74, 0x12, 0x1b, 0x0a, 0x06, 0x73, 0x70, 0x65, 0x65, 0x63, 0x68, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x06, 0x73, 0x70, 0x65, 0x65, 0x63, 0x68,
	0x12, 0x17, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03,
	0xe0, 0x41, 0x01, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x42, 0xa3, 0x01, 0x0a, 0x31, 0x63, 0x6f,
	0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x2e, 0x73, 0x64, 0x6b, 0x2e, 0x76, 0x32, 0x2e, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x42,
	0x17, 0x53, 0x74, 0x61, 0x74, 0x69, 0x63, 0x53, 0x69, 0x6d, 0x70, 0x6c, 0x65, 0x50, 0x72, 0x6f,
	0x6d, 0x70, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x53, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65,
	0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69,
	0x73, 0x2f, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x73, 0x64, 0x6b, 0x2f, 0x76, 0x32,
	0x2f, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2f, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x3b, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescOnce sync.Once
	file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescData = file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDesc
)

func file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescGZIP() []byte {
	file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescOnce.Do(func() {
		file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescData)
	})
	return file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDescData
}

var file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_goTypes = []interface{}{
	(*StaticSimplePrompt)(nil),         // 0: google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt
	(*StaticSimplePrompt_Variant)(nil), // 1: google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant
}
var file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_depIdxs = []int32{
	1, // 0: google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.variants:type_name -> google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_init() }
func file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_init() {
	if File_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StaticSimplePrompt); i {
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
		file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StaticSimplePrompt_Variant); i {
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
			RawDescriptor: file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_goTypes,
		DependencyIndexes: file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_depIdxs,
		MessageInfos:      file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_msgTypes,
	}.Build()
	File_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto = out.File
	file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_rawDesc = nil
	file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_goTypes = nil
	file_google_actions_sdk_v2_interactionmodel_prompt_static_simple_prompt_proto_depIdxs = nil
}
