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
// source: google/devtools/clouddebugger/v2/controller.proto

package clouddebugger

import (
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	_ "google.golang.org/protobuf/types/known/emptypb"
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

// Request to register a debuggee.
type RegisterDebuggeeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. Debuggee information to register.
	// The fields `project`, `uniquifier`, `description` and `agent_version`
	// of the debuggee must be set.
	Debuggee *Debuggee `protobuf:"bytes,1,opt,name=debuggee,proto3" json:"debuggee,omitempty"`
}

func (x *RegisterDebuggeeRequest) Reset() {
	*x = RegisterDebuggeeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RegisterDebuggeeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RegisterDebuggeeRequest) ProtoMessage() {}

func (x *RegisterDebuggeeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RegisterDebuggeeRequest.ProtoReflect.Descriptor instead.
func (*RegisterDebuggeeRequest) Descriptor() ([]byte, []int) {
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP(), []int{0}
}

func (x *RegisterDebuggeeRequest) GetDebuggee() *Debuggee {
	if x != nil {
		return x.Debuggee
	}
	return nil
}

// Response for registering a debuggee.
type RegisterDebuggeeResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Debuggee resource.
	// The field `id` is guaranteed to be set (in addition to the echoed fields).
	// If the field `is_disabled` is set to `true`, the agent should disable
	// itself by removing all breakpoints and detaching from the application.
	// It should however continue to poll `RegisterDebuggee` until reenabled.
	Debuggee *Debuggee `protobuf:"bytes,1,opt,name=debuggee,proto3" json:"debuggee,omitempty"`
}

func (x *RegisterDebuggeeResponse) Reset() {
	*x = RegisterDebuggeeResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RegisterDebuggeeResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RegisterDebuggeeResponse) ProtoMessage() {}

func (x *RegisterDebuggeeResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RegisterDebuggeeResponse.ProtoReflect.Descriptor instead.
func (*RegisterDebuggeeResponse) Descriptor() ([]byte, []int) {
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP(), []int{1}
}

func (x *RegisterDebuggeeResponse) GetDebuggee() *Debuggee {
	if x != nil {
		return x.Debuggee
	}
	return nil
}

// Request to list active breakpoints.
type ListActiveBreakpointsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. Identifies the debuggee.
	DebuggeeId string `protobuf:"bytes,1,opt,name=debuggee_id,json=debuggeeId,proto3" json:"debuggee_id,omitempty"`
	// A token that, if specified, blocks the method call until the list
	// of active breakpoints has changed, or a server-selected timeout has
	// expired. The value should be set from the `next_wait_token` field in
	// the last response. The initial value should be set to `"init"`.
	WaitToken string `protobuf:"bytes,2,opt,name=wait_token,json=waitToken,proto3" json:"wait_token,omitempty"`
	// If set to `true` (recommended), returns `google.rpc.Code.OK` status and
	// sets the `wait_expired` response field to `true` when the server-selected
	// timeout has expired.
	//
	// If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status
	// when the server-selected timeout has expired.
	SuccessOnTimeout bool `protobuf:"varint,3,opt,name=success_on_timeout,json=successOnTimeout,proto3" json:"success_on_timeout,omitempty"`
}

func (x *ListActiveBreakpointsRequest) Reset() {
	*x = ListActiveBreakpointsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListActiveBreakpointsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListActiveBreakpointsRequest) ProtoMessage() {}

func (x *ListActiveBreakpointsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListActiveBreakpointsRequest.ProtoReflect.Descriptor instead.
func (*ListActiveBreakpointsRequest) Descriptor() ([]byte, []int) {
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP(), []int{2}
}

func (x *ListActiveBreakpointsRequest) GetDebuggeeId() string {
	if x != nil {
		return x.DebuggeeId
	}
	return ""
}

func (x *ListActiveBreakpointsRequest) GetWaitToken() string {
	if x != nil {
		return x.WaitToken
	}
	return ""
}

func (x *ListActiveBreakpointsRequest) GetSuccessOnTimeout() bool {
	if x != nil {
		return x.SuccessOnTimeout
	}
	return false
}

// Response for listing active breakpoints.
type ListActiveBreakpointsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// List of all active breakpoints.
	// The fields `id` and `location` are guaranteed to be set on each breakpoint.
	Breakpoints []*Breakpoint `protobuf:"bytes,1,rep,name=breakpoints,proto3" json:"breakpoints,omitempty"`
	// A token that can be used in the next method call to block until
	// the list of breakpoints changes.
	NextWaitToken string `protobuf:"bytes,2,opt,name=next_wait_token,json=nextWaitToken,proto3" json:"next_wait_token,omitempty"`
	// If set to `true`, indicates that there is no change to the
	// list of active breakpoints and the server-selected timeout has expired.
	// The `breakpoints` field would be empty and should be ignored.
	WaitExpired bool `protobuf:"varint,3,opt,name=wait_expired,json=waitExpired,proto3" json:"wait_expired,omitempty"`
}

func (x *ListActiveBreakpointsResponse) Reset() {
	*x = ListActiveBreakpointsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListActiveBreakpointsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListActiveBreakpointsResponse) ProtoMessage() {}

func (x *ListActiveBreakpointsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListActiveBreakpointsResponse.ProtoReflect.Descriptor instead.
func (*ListActiveBreakpointsResponse) Descriptor() ([]byte, []int) {
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP(), []int{3}
}

func (x *ListActiveBreakpointsResponse) GetBreakpoints() []*Breakpoint {
	if x != nil {
		return x.Breakpoints
	}
	return nil
}

func (x *ListActiveBreakpointsResponse) GetNextWaitToken() string {
	if x != nil {
		return x.NextWaitToken
	}
	return ""
}

func (x *ListActiveBreakpointsResponse) GetWaitExpired() bool {
	if x != nil {
		return x.WaitExpired
	}
	return false
}

// Request to update an active breakpoint.
type UpdateActiveBreakpointRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. Identifies the debuggee being debugged.
	DebuggeeId string `protobuf:"bytes,1,opt,name=debuggee_id,json=debuggeeId,proto3" json:"debuggee_id,omitempty"`
	// Required. Updated breakpoint information.
	// The field `id` must be set.
	// The agent must echo all Breakpoint specification fields in the update.
	Breakpoint *Breakpoint `protobuf:"bytes,2,opt,name=breakpoint,proto3" json:"breakpoint,omitempty"`
}

func (x *UpdateActiveBreakpointRequest) Reset() {
	*x = UpdateActiveBreakpointRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateActiveBreakpointRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateActiveBreakpointRequest) ProtoMessage() {}

func (x *UpdateActiveBreakpointRequest) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateActiveBreakpointRequest.ProtoReflect.Descriptor instead.
func (*UpdateActiveBreakpointRequest) Descriptor() ([]byte, []int) {
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP(), []int{4}
}

func (x *UpdateActiveBreakpointRequest) GetDebuggeeId() string {
	if x != nil {
		return x.DebuggeeId
	}
	return ""
}

func (x *UpdateActiveBreakpointRequest) GetBreakpoint() *Breakpoint {
	if x != nil {
		return x.Breakpoint
	}
	return nil
}

// Response for updating an active breakpoint.
// The message is defined to allow future extensions.
type UpdateActiveBreakpointResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *UpdateActiveBreakpointResponse) Reset() {
	*x = UpdateActiveBreakpointResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateActiveBreakpointResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateActiveBreakpointResponse) ProtoMessage() {}

func (x *UpdateActiveBreakpointResponse) ProtoReflect() protoreflect.Message {
	mi := &file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateActiveBreakpointResponse.ProtoReflect.Descriptor instead.
func (*UpdateActiveBreakpointResponse) Descriptor() ([]byte, []int) {
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP(), []int{5}
}

var File_google_devtools_clouddebugger_v2_controller_proto protoreflect.FileDescriptor

var file_google_devtools_clouddebugger_v2_controller_proto_rawDesc = []byte{
	0x0a, 0x31, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c,
	0x73, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2f,
	0x76, 0x32, 0x2f, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x6c, 0x65, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74,
	0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67,
	0x65, 0x72, 0x2e, 0x76, 0x32, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62,
	0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2b, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2f, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2f, 0x76, 0x32, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74,
	0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x66, 0x0a, 0x17, 0x52, 0x65, 0x67, 0x69, 0x73,
	0x74, 0x65, 0x72, 0x44, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x12, 0x4b, 0x0a, 0x08, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65,
	0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75,
	0x67, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x32, 0x2e, 0x44, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65,
	0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x08, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x22,
	0x62, 0x0a, 0x18, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x44, 0x65, 0x62, 0x75, 0x67,
	0x67, 0x65, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x46, 0x0a, 0x08, 0x64,
	0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2a, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x32,
	0x2e, 0x44, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x52, 0x08, 0x64, 0x65, 0x62, 0x75, 0x67,
	0x67, 0x65, 0x65, 0x22, 0x91, 0x01, 0x0a, 0x1c, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x63, 0x74, 0x69,
	0x76, 0x65, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x0b, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0a,
	0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x49, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x77, 0x61,
	0x69, 0x74, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09,
	0x77, 0x61, 0x69, 0x74, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x12, 0x2c, 0x0a, 0x12, 0x73, 0x75, 0x63,
	0x63, 0x65, 0x73, 0x73, 0x5f, 0x6f, 0x6e, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x6f, 0x75, 0x74, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x10, 0x73, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x4f, 0x6e,
	0x54, 0x69, 0x6d, 0x65, 0x6f, 0x75, 0x74, 0x22, 0xba, 0x01, 0x0a, 0x1d, 0x4c, 0x69, 0x73, 0x74,
	0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4e, 0x0a, 0x0b, 0x62, 0x72, 0x65,
	0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x2c,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x76,
	0x32, 0x2e, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x52, 0x0b, 0x62, 0x72,
	0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x12, 0x26, 0x0a, 0x0f, 0x6e, 0x65, 0x78,
	0x74, 0x5f, 0x77, 0x61, 0x69, 0x74, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0d, 0x6e, 0x65, 0x78, 0x74, 0x57, 0x61, 0x69, 0x74, 0x54, 0x6f, 0x6b, 0x65,
	0x6e, 0x12, 0x21, 0x0a, 0x0c, 0x77, 0x61, 0x69, 0x74, 0x5f, 0x65, 0x78, 0x70, 0x69, 0x72, 0x65,
	0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0b, 0x77, 0x61, 0x69, 0x74, 0x45, 0x78, 0x70,
	0x69, 0x72, 0x65, 0x64, 0x22, 0x98, 0x01, 0x0a, 0x1d, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41,
	0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x0b, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67,
	0x65, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02,
	0x52, 0x0a, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x49, 0x64, 0x12, 0x51, 0x0a, 0x0a,
	0x62, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x2c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f,
	0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72,
	0x2e, 0x76, 0x32, 0x2e, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x42, 0x03,
	0xe0, 0x41, 0x02, 0x52, 0x0a, 0x62, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x22,
	0x20, 0x0a, 0x1e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42,
	0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x32, 0xbe, 0x06, 0x0a, 0x0b, 0x43, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x6c, 0x65, 0x72,
	0x32, 0x12, 0xc2, 0x01, 0x0a, 0x10, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x44, 0x65,
	0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x12, 0x39, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65,
	0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x32, 0x2e, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74,
	0x65, 0x72, 0x44, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x3a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f,
	0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65,
	0x72, 0x2e, 0x76, 0x32, 0x2e, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x44, 0x65, 0x62,
	0x75, 0x67, 0x67, 0x65, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x37, 0x82,
	0xd3, 0xe4, 0x93, 0x02, 0x26, 0x22, 0x21, 0x2f, 0x76, 0x32, 0x2f, 0x63, 0x6f, 0x6e, 0x74, 0x72,
	0x6f, 0x6c, 0x6c, 0x65, 0x72, 0x2f, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x73, 0x2f,
	0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x3a, 0x01, 0x2a, 0xda, 0x41, 0x08, 0x64, 0x65,
	0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x12, 0xe2, 0x01, 0x0a, 0x15, 0x4c, 0x69, 0x73, 0x74, 0x41,
	0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73,
	0x12, 0x3e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f,
	0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72,
	0x2e, 0x76, 0x32, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72,
	0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x3f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f,
	0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72,
	0x2e, 0x76, 0x32, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72,
	0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x48, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x34, 0x12, 0x32, 0x2f, 0x76, 0x32, 0x2f, 0x63,
	0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x6c, 0x65, 0x72, 0x2f, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67,
	0x65, 0x65, 0x73, 0x2f, 0x7b, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x5f, 0x69, 0x64,
	0x7d, 0x2f, 0x62, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0xda, 0x41, 0x0b,
	0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x5f, 0x69, 0x64, 0x12, 0x83, 0x02, 0x0a, 0x16,
	0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72, 0x65, 0x61,
	0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x12, 0x3f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65,
	0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x32, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e, 0x74,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x40, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64,
	0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x32, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x41, 0x63, 0x74, 0x69, 0x76, 0x65, 0x42, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e,
	0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x66, 0x82, 0xd3, 0xe4, 0x93, 0x02,
	0x47, 0x1a, 0x42, 0x2f, 0x76, 0x32, 0x2f, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x6c, 0x65,
	0x72, 0x2f, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x65, 0x73, 0x2f, 0x7b, 0x64, 0x65, 0x62,
	0x75, 0x67, 0x67, 0x65, 0x65, 0x5f, 0x69, 0x64, 0x7d, 0x2f, 0x62, 0x72, 0x65, 0x61, 0x6b, 0x70,
	0x6f, 0x69, 0x6e, 0x74, 0x73, 0x2f, 0x7b, 0x62, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e,
	0x74, 0x2e, 0x69, 0x64, 0x7d, 0x3a, 0x01, 0x2a, 0xda, 0x41, 0x16, 0x64, 0x65, 0x62, 0x75, 0x67,
	0x67, 0x65, 0x65, 0x5f, 0x69, 0x64, 0x2c, 0x62, 0x72, 0x65, 0x61, 0x6b, 0x70, 0x6f, 0x69, 0x6e,
	0x74, 0x1a, 0x7f, 0xca, 0x41, 0x1c, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67,
	0x67, 0x65, 0x72, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0xd2, 0x41, 0x5d, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77, 0x77,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x61, 0x75, 0x74, 0x68, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2d, 0x70, 0x6c, 0x61, 0x74, 0x66,
	0x6f, 0x72, 0x6d, 0x2c, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x77, 0x77, 0x77, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61,
	0x75, 0x74, 0x68, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x5f, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67,
	0x65, 0x72, 0x42, 0xdc, 0x01, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64,
	0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x32, 0x42, 0x0f, 0x43, 0x6f, 0x6e,
	0x74, 0x72, 0x6f, 0x6c, 0x6c, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4d,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72,
	0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x64, 0x65, 0x76, 0x74, 0x6f, 0x6f, 0x6c, 0x73, 0x2f, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x2f, 0x76, 0x32, 0x3b,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x64, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0xaa, 0x02, 0x18,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x44, 0x65, 0x62,
	0x75, 0x67, 0x67, 0x65, 0x72, 0x2e, 0x56, 0x32, 0xca, 0x02, 0x18, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x44, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72,
	0x5c, 0x56, 0x32, 0xea, 0x02, 0x1b, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c,
	0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x44, 0x65, 0x62, 0x75, 0x67, 0x67, 0x65, 0x72, 0x3a, 0x3a, 0x56,
	0x32, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_devtools_clouddebugger_v2_controller_proto_rawDescOnce sync.Once
	file_google_devtools_clouddebugger_v2_controller_proto_rawDescData = file_google_devtools_clouddebugger_v2_controller_proto_rawDesc
)

func file_google_devtools_clouddebugger_v2_controller_proto_rawDescGZIP() []byte {
	file_google_devtools_clouddebugger_v2_controller_proto_rawDescOnce.Do(func() {
		file_google_devtools_clouddebugger_v2_controller_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_devtools_clouddebugger_v2_controller_proto_rawDescData)
	})
	return file_google_devtools_clouddebugger_v2_controller_proto_rawDescData
}

var file_google_devtools_clouddebugger_v2_controller_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_google_devtools_clouddebugger_v2_controller_proto_goTypes = []interface{}{
	(*RegisterDebuggeeRequest)(nil),        // 0: google.devtools.clouddebugger.v2.RegisterDebuggeeRequest
	(*RegisterDebuggeeResponse)(nil),       // 1: google.devtools.clouddebugger.v2.RegisterDebuggeeResponse
	(*ListActiveBreakpointsRequest)(nil),   // 2: google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest
	(*ListActiveBreakpointsResponse)(nil),  // 3: google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse
	(*UpdateActiveBreakpointRequest)(nil),  // 4: google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest
	(*UpdateActiveBreakpointResponse)(nil), // 5: google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse
	(*Debuggee)(nil),                       // 6: google.devtools.clouddebugger.v2.Debuggee
	(*Breakpoint)(nil),                     // 7: google.devtools.clouddebugger.v2.Breakpoint
}
var file_google_devtools_clouddebugger_v2_controller_proto_depIdxs = []int32{
	6, // 0: google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.debuggee:type_name -> google.devtools.clouddebugger.v2.Debuggee
	6, // 1: google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.debuggee:type_name -> google.devtools.clouddebugger.v2.Debuggee
	7, // 2: google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse.breakpoints:type_name -> google.devtools.clouddebugger.v2.Breakpoint
	7, // 3: google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest.breakpoint:type_name -> google.devtools.clouddebugger.v2.Breakpoint
	0, // 4: google.devtools.clouddebugger.v2.Controller2.RegisterDebuggee:input_type -> google.devtools.clouddebugger.v2.RegisterDebuggeeRequest
	2, // 5: google.devtools.clouddebugger.v2.Controller2.ListActiveBreakpoints:input_type -> google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest
	4, // 6: google.devtools.clouddebugger.v2.Controller2.UpdateActiveBreakpoint:input_type -> google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest
	1, // 7: google.devtools.clouddebugger.v2.Controller2.RegisterDebuggee:output_type -> google.devtools.clouddebugger.v2.RegisterDebuggeeResponse
	3, // 8: google.devtools.clouddebugger.v2.Controller2.ListActiveBreakpoints:output_type -> google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse
	5, // 9: google.devtools.clouddebugger.v2.Controller2.UpdateActiveBreakpoint:output_type -> google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse
	7, // [7:10] is the sub-list for method output_type
	4, // [4:7] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_google_devtools_clouddebugger_v2_controller_proto_init() }
func file_google_devtools_clouddebugger_v2_controller_proto_init() {
	if File_google_devtools_clouddebugger_v2_controller_proto != nil {
		return
	}
	file_google_devtools_clouddebugger_v2_data_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RegisterDebuggeeRequest); i {
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
		file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RegisterDebuggeeResponse); i {
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
		file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListActiveBreakpointsRequest); i {
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
		file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListActiveBreakpointsResponse); i {
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
		file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateActiveBreakpointRequest); i {
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
		file_google_devtools_clouddebugger_v2_controller_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateActiveBreakpointResponse); i {
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
			RawDescriptor: file_google_devtools_clouddebugger_v2_controller_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_google_devtools_clouddebugger_v2_controller_proto_goTypes,
		DependencyIndexes: file_google_devtools_clouddebugger_v2_controller_proto_depIdxs,
		MessageInfos:      file_google_devtools_clouddebugger_v2_controller_proto_msgTypes,
	}.Build()
	File_google_devtools_clouddebugger_v2_controller_proto = out.File
	file_google_devtools_clouddebugger_v2_controller_proto_rawDesc = nil
	file_google_devtools_clouddebugger_v2_controller_proto_goTypes = nil
	file_google_devtools_clouddebugger_v2_controller_proto_depIdxs = nil
}
