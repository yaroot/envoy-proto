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
// source: google/cloud/secretmanager/v1/resources.proto

package secretmanager

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

// The state of a [SecretVersion][google.cloud.secretmanager.v1.SecretVersion], indicating if it can be accessed.
type SecretVersion_State int32

const (
	// Not specified. This value is unused and invalid.
	SecretVersion_STATE_UNSPECIFIED SecretVersion_State = 0
	// The [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] may be accessed.
	SecretVersion_ENABLED SecretVersion_State = 1
	// The [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] may not be accessed, but the secret data
	// is still available and can be placed back into the [ENABLED][google.cloud.secretmanager.v1.SecretVersion.State.ENABLED]
	// state.
	SecretVersion_DISABLED SecretVersion_State = 2
	// The [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] is destroyed and the secret data is no longer
	// stored. A version may not leave this state once entered.
	SecretVersion_DESTROYED SecretVersion_State = 3
)

// Enum value maps for SecretVersion_State.
var (
	SecretVersion_State_name = map[int32]string{
		0: "STATE_UNSPECIFIED",
		1: "ENABLED",
		2: "DISABLED",
		3: "DESTROYED",
	}
	SecretVersion_State_value = map[string]int32{
		"STATE_UNSPECIFIED": 0,
		"ENABLED":           1,
		"DISABLED":          2,
		"DESTROYED":         3,
	}
)

func (x SecretVersion_State) Enum() *SecretVersion_State {
	p := new(SecretVersion_State)
	*p = x
	return p
}

func (x SecretVersion_State) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (SecretVersion_State) Descriptor() protoreflect.EnumDescriptor {
	return file_google_cloud_secretmanager_v1_resources_proto_enumTypes[0].Descriptor()
}

func (SecretVersion_State) Type() protoreflect.EnumType {
	return &file_google_cloud_secretmanager_v1_resources_proto_enumTypes[0]
}

func (x SecretVersion_State) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use SecretVersion_State.Descriptor instead.
func (SecretVersion_State) EnumDescriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{1, 0}
}

// A [Secret][google.cloud.secretmanager.v1.Secret] is a logical secret whose value and versions can
// be accessed.
//
// A [Secret][google.cloud.secretmanager.v1.Secret] is made up of zero or more [SecretVersions][google.cloud.secretmanager.v1.SecretVersion] that
// represent the secret data.
type Secret struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The resource name of the [Secret][google.cloud.secretmanager.v1.Secret] in the format `projects/*/secrets/*`.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Required. Immutable. The replication policy of the secret data attached to the [Secret][google.cloud.secretmanager.v1.Secret].
	//
	// The replication policy cannot be changed after the Secret has been created.
	Replication *Replication `protobuf:"bytes,2,opt,name=replication,proto3" json:"replication,omitempty"`
	// Output only. The time at which the [Secret][google.cloud.secretmanager.v1.Secret] was created.
	CreateTime *timestamppb.Timestamp `protobuf:"bytes,3,opt,name=create_time,json=createTime,proto3" json:"create_time,omitempty"`
	// The labels assigned to this Secret.
	//
	// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding
	// of maximum 128 bytes, and must conform to the following PCRE regular
	// expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
	//
	// Label values must be between 0 and 63 characters long, have a UTF-8
	// encoding of maximum 128 bytes, and must conform to the following PCRE
	// regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
	//
	// No more than 64 labels can be assigned to a given resource.
	Labels map[string]string `protobuf:"bytes,4,rep,name=labels,proto3" json:"labels,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
}

func (x *Secret) Reset() {
	*x = Secret{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Secret) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Secret) ProtoMessage() {}

func (x *Secret) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Secret.ProtoReflect.Descriptor instead.
func (*Secret) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{0}
}

func (x *Secret) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Secret) GetReplication() *Replication {
	if x != nil {
		return x.Replication
	}
	return nil
}

func (x *Secret) GetCreateTime() *timestamppb.Timestamp {
	if x != nil {
		return x.CreateTime
	}
	return nil
}

func (x *Secret) GetLabels() map[string]string {
	if x != nil {
		return x.Labels
	}
	return nil
}

// A secret version resource in the Secret Manager API.
type SecretVersion struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Output only. The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the
	// format `projects/*/secrets/*/versions/*`.
	//
	// [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] IDs in a [Secret][google.cloud.secretmanager.v1.Secret] start at 1 and
	// are incremented for each subsequent version of the secret.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Output only. The time at which the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was created.
	CreateTime *timestamppb.Timestamp `protobuf:"bytes,2,opt,name=create_time,json=createTime,proto3" json:"create_time,omitempty"`
	// Output only. The time this [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was destroyed.
	// Only present if [state][google.cloud.secretmanager.v1.SecretVersion.state] is
	// [DESTROYED][google.cloud.secretmanager.v1.SecretVersion.State.DESTROYED].
	DestroyTime *timestamppb.Timestamp `protobuf:"bytes,3,opt,name=destroy_time,json=destroyTime,proto3" json:"destroy_time,omitempty"`
	// Output only. The current state of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
	State SecretVersion_State `protobuf:"varint,4,opt,name=state,proto3,enum=google.cloud.secretmanager.v1.SecretVersion_State" json:"state,omitempty"`
}

func (x *SecretVersion) Reset() {
	*x = SecretVersion{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretVersion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretVersion) ProtoMessage() {}

func (x *SecretVersion) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretVersion.ProtoReflect.Descriptor instead.
func (*SecretVersion) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{1}
}

func (x *SecretVersion) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *SecretVersion) GetCreateTime() *timestamppb.Timestamp {
	if x != nil {
		return x.CreateTime
	}
	return nil
}

func (x *SecretVersion) GetDestroyTime() *timestamppb.Timestamp {
	if x != nil {
		return x.DestroyTime
	}
	return nil
}

func (x *SecretVersion) GetState() SecretVersion_State {
	if x != nil {
		return x.State
	}
	return SecretVersion_STATE_UNSPECIFIED
}

// A policy that defines the replication configuration of data.
//
type Replication struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The replication policy for this secret.
	//
	// Types that are assignable to Replication:
	//	*Replication_Automatic_
	//	*Replication_UserManaged_
	Replication isReplication_Replication `protobuf_oneof:"replication"`
}

func (x *Replication) Reset() {
	*x = Replication{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Replication) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Replication) ProtoMessage() {}

func (x *Replication) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Replication.ProtoReflect.Descriptor instead.
func (*Replication) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{2}
}

func (m *Replication) GetReplication() isReplication_Replication {
	if m != nil {
		return m.Replication
	}
	return nil
}

func (x *Replication) GetAutomatic() *Replication_Automatic {
	if x, ok := x.GetReplication().(*Replication_Automatic_); ok {
		return x.Automatic
	}
	return nil
}

func (x *Replication) GetUserManaged() *Replication_UserManaged {
	if x, ok := x.GetReplication().(*Replication_UserManaged_); ok {
		return x.UserManaged
	}
	return nil
}

type isReplication_Replication interface {
	isReplication_Replication()
}

type Replication_Automatic_ struct {
	// The [Secret][google.cloud.secretmanager.v1.Secret] will automatically be replicated without any restrictions.
	Automatic *Replication_Automatic `protobuf:"bytes,1,opt,name=automatic,proto3,oneof"`
}

type Replication_UserManaged_ struct {
	// The [Secret][google.cloud.secretmanager.v1.Secret] will only be replicated into the locations specified.
	UserManaged *Replication_UserManaged `protobuf:"bytes,2,opt,name=user_managed,json=userManaged,proto3,oneof"`
}

func (*Replication_Automatic_) isReplication_Replication() {}

func (*Replication_UserManaged_) isReplication_Replication() {}

// A secret payload resource in the Secret Manager API. This contains the
// sensitive secret payload that is associated with a [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
type SecretPayload struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The secret data. Must be no larger than 64KiB.
	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *SecretPayload) Reset() {
	*x = SecretPayload{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SecretPayload) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SecretPayload) ProtoMessage() {}

func (x *SecretPayload) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SecretPayload.ProtoReflect.Descriptor instead.
func (*SecretPayload) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{3}
}

func (x *SecretPayload) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

// A replication policy that replicates the [Secret][google.cloud.secretmanager.v1.Secret] payload without any
// restrictions.
type Replication_Automatic struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *Replication_Automatic) Reset() {
	*x = Replication_Automatic{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Replication_Automatic) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Replication_Automatic) ProtoMessage() {}

func (x *Replication_Automatic) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Replication_Automatic.ProtoReflect.Descriptor instead.
func (*Replication_Automatic) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{2, 0}
}

// A replication policy that replicates the [Secret][google.cloud.secretmanager.v1.Secret] payload into the
// locations specified in [Secret.replication.user_managed.replicas][]
type Replication_UserManaged struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The list of Replicas for this [Secret][google.cloud.secretmanager.v1.Secret].
	//
	// Cannot be empty.
	Replicas []*Replication_UserManaged_Replica `protobuf:"bytes,1,rep,name=replicas,proto3" json:"replicas,omitempty"`
}

func (x *Replication_UserManaged) Reset() {
	*x = Replication_UserManaged{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Replication_UserManaged) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Replication_UserManaged) ProtoMessage() {}

func (x *Replication_UserManaged) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Replication_UserManaged.ProtoReflect.Descriptor instead.
func (*Replication_UserManaged) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{2, 1}
}

func (x *Replication_UserManaged) GetReplicas() []*Replication_UserManaged_Replica {
	if x != nil {
		return x.Replicas
	}
	return nil
}

// Represents a Replica for this [Secret][google.cloud.secretmanager.v1.Secret].
type Replication_UserManaged_Replica struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The canonical IDs of the location to replicate data.
	// For example: `"us-east1"`.
	Location string `protobuf:"bytes,1,opt,name=location,proto3" json:"location,omitempty"`
}

func (x *Replication_UserManaged_Replica) Reset() {
	*x = Replication_UserManaged_Replica{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Replication_UserManaged_Replica) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Replication_UserManaged_Replica) ProtoMessage() {}

func (x *Replication_UserManaged_Replica) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_secretmanager_v1_resources_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Replication_UserManaged_Replica.ProtoReflect.Descriptor instead.
func (*Replication_UserManaged_Replica) Descriptor() ([]byte, []int) {
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP(), []int{2, 1, 0}
}

func (x *Replication_UserManaged_Replica) GetLocation() string {
	if x != nil {
		return x.Location
	}
	return ""
}

var File_google_cloud_secretmanager_v1_resources_proto protoreflect.FileDescriptor

var file_google_cloud_secretmanager_v1_resources_proto_rawDesc = []byte{
	0x0a, 0x2d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x73,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2f, 0x76, 0x31, 0x2f,
	0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x1d, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x73, 0x65,
	0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x1a, 0x1f,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64,
	0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65,
	0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8e, 0x03, 0x0a, 0x06, 0x53, 0x65,
	0x63, 0x72, 0x65, 0x74, 0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x54, 0x0a,
	0x0b, 0x72, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75,
	0x64, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e,
	0x76, 0x31, 0x2e, 0x52, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x06,
	0xe0, 0x41, 0x05, 0xe0, 0x41, 0x02, 0x52, 0x0b, 0x72, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x12, 0x40, 0x0a, 0x0b, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x5f, 0x74, 0x69,
	0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73,
	0x74, 0x61, 0x6d, 0x70, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x49, 0x0a, 0x06, 0x6c, 0x61, 0x62, 0x65, 0x6c, 0x73, 0x18,
	0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x2e, 0x4c, 0x61, 0x62,
	0x65, 0x6c, 0x73, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x06, 0x6c, 0x61, 0x62, 0x65, 0x6c, 0x73,
	0x1a, 0x39, 0x0a, 0x0b, 0x4c, 0x61, 0x62, 0x65, 0x6c, 0x73, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12,
	0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65,
	0x79, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x3a, 0x4d, 0xea, 0x41, 0x4a,
	0x0a, 0x23, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x53,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x12, 0x23, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f,
	0x7b, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x7d, 0x2f, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74,
	0x73, 0x2f, 0x7b, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x7d, 0x22, 0xb7, 0x03, 0x0a, 0x0d, 0x53,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x17, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x40, 0x0a, 0x0b, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x5f,
	0x74, 0x69, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54, 0x69, 0x6d,
	0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x0a, 0x63, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x42, 0x0a, 0x0c, 0x64, 0x65, 0x73, 0x74, 0x72,
	0x6f, 0x79, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e,
	0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x0b,
	0x64, 0x65, 0x73, 0x74, 0x72, 0x6f, 0x79, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x4d, 0x0a, 0x05, 0x73,
	0x74, 0x61, 0x74, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x32, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74,
	0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x65, 0x63, 0x72, 0x65,
	0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x42, 0x03,
	0xe0, 0x41, 0x03, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x22, 0x48, 0x0a, 0x05, 0x53, 0x74,
	0x61, 0x74, 0x65, 0x12, 0x15, 0x0a, 0x11, 0x53, 0x54, 0x41, 0x54, 0x45, 0x5f, 0x55, 0x4e, 0x53,
	0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x45, 0x4e,
	0x41, 0x42, 0x4c, 0x45, 0x44, 0x10, 0x01, 0x12, 0x0c, 0x0a, 0x08, 0x44, 0x49, 0x53, 0x41, 0x42,
	0x4c, 0x45, 0x44, 0x10, 0x02, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x45, 0x53, 0x54, 0x52, 0x4f, 0x59,
	0x45, 0x44, 0x10, 0x03, 0x3a, 0x6e, 0xea, 0x41, 0x6b, 0x0a, 0x2a, 0x73, 0x65, 0x63, 0x72, 0x65,
	0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x3d, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x73, 0x2f,
	0x7b, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x7d, 0x2f, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74,
	0x73, 0x2f, 0x7b, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x7d, 0x2f, 0x76, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x73, 0x2f, 0x7b, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5f, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x7d, 0x22, 0xf4, 0x02, 0x0a, 0x0b, 0x52, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x12, 0x54, 0x0a, 0x09, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x61, 0x74, 0x69,
	0x63, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x34, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x2e, 0x41, 0x75, 0x74, 0x6f, 0x6d, 0x61, 0x74, 0x69, 0x63, 0x48, 0x00, 0x52,
	0x09, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x61, 0x74, 0x69, 0x63, 0x12, 0x5b, 0x0a, 0x0c, 0x75, 0x73,
	0x65, 0x72, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x36, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e, 0x76, 0x31,
	0x2e, 0x52, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65,
	0x72, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x64, 0x48, 0x00, 0x52, 0x0b, 0x75, 0x73, 0x65, 0x72,
	0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x64, 0x1a, 0x0b, 0x0a, 0x09, 0x41, 0x75, 0x74, 0x6f, 0x6d,
	0x61, 0x74, 0x69, 0x63, 0x1a, 0x95, 0x01, 0x0a, 0x0b, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x64, 0x12, 0x5f, 0x0a, 0x08, 0x72, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x73,
	0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61,
	0x67, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x64, 0x2e, 0x52,
	0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x08, 0x72, 0x65, 0x70,
	0x6c, 0x69, 0x63, 0x61, 0x73, 0x1a, 0x25, 0x0a, 0x07, 0x52, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61,
	0x12, 0x1a, 0x0a, 0x08, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x08, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x0d, 0x0a, 0x0b,
	0x72, 0x65, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x23, 0x0a, 0x0d, 0x53,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x50, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x12, 0x12, 0x0a, 0x04,
	0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61,
	0x42, 0xed, 0x01, 0x0a, 0x21, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61,
	0x67, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x42, 0x0e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e, 0x61,
	0x67, 0x65, 0x72, 0x2f, 0x76, 0x31, 0x3b, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x72, 0xf8, 0x01, 0x01, 0xa2, 0x02, 0x03, 0x47, 0x53, 0x4d, 0xaa, 0x02, 0x1d,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x53, 0x65, 0x63,
	0x72, 0x65, 0x74, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x1d,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x53, 0x65, 0x63,
	0x72, 0x65, 0x74, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x5c, 0x56, 0x31, 0xea, 0x02, 0x20,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x53,
	0x65, 0x63, 0x72, 0x65, 0x74, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x3a, 0x3a, 0x56, 0x31,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_cloud_secretmanager_v1_resources_proto_rawDescOnce sync.Once
	file_google_cloud_secretmanager_v1_resources_proto_rawDescData = file_google_cloud_secretmanager_v1_resources_proto_rawDesc
)

func file_google_cloud_secretmanager_v1_resources_proto_rawDescGZIP() []byte {
	file_google_cloud_secretmanager_v1_resources_proto_rawDescOnce.Do(func() {
		file_google_cloud_secretmanager_v1_resources_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_secretmanager_v1_resources_proto_rawDescData)
	})
	return file_google_cloud_secretmanager_v1_resources_proto_rawDescData
}

var file_google_cloud_secretmanager_v1_resources_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_cloud_secretmanager_v1_resources_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_google_cloud_secretmanager_v1_resources_proto_goTypes = []interface{}{
	(SecretVersion_State)(0),                // 0: google.cloud.secretmanager.v1.SecretVersion.State
	(*Secret)(nil),                          // 1: google.cloud.secretmanager.v1.Secret
	(*SecretVersion)(nil),                   // 2: google.cloud.secretmanager.v1.SecretVersion
	(*Replication)(nil),                     // 3: google.cloud.secretmanager.v1.Replication
	(*SecretPayload)(nil),                   // 4: google.cloud.secretmanager.v1.SecretPayload
	nil,                                     // 5: google.cloud.secretmanager.v1.Secret.LabelsEntry
	(*Replication_Automatic)(nil),           // 6: google.cloud.secretmanager.v1.Replication.Automatic
	(*Replication_UserManaged)(nil),         // 7: google.cloud.secretmanager.v1.Replication.UserManaged
	(*Replication_UserManaged_Replica)(nil), // 8: google.cloud.secretmanager.v1.Replication.UserManaged.Replica
	(*timestamppb.Timestamp)(nil),           // 9: google.protobuf.Timestamp
}
var file_google_cloud_secretmanager_v1_resources_proto_depIdxs = []int32{
	3, // 0: google.cloud.secretmanager.v1.Secret.replication:type_name -> google.cloud.secretmanager.v1.Replication
	9, // 1: google.cloud.secretmanager.v1.Secret.create_time:type_name -> google.protobuf.Timestamp
	5, // 2: google.cloud.secretmanager.v1.Secret.labels:type_name -> google.cloud.secretmanager.v1.Secret.LabelsEntry
	9, // 3: google.cloud.secretmanager.v1.SecretVersion.create_time:type_name -> google.protobuf.Timestamp
	9, // 4: google.cloud.secretmanager.v1.SecretVersion.destroy_time:type_name -> google.protobuf.Timestamp
	0, // 5: google.cloud.secretmanager.v1.SecretVersion.state:type_name -> google.cloud.secretmanager.v1.SecretVersion.State
	6, // 6: google.cloud.secretmanager.v1.Replication.automatic:type_name -> google.cloud.secretmanager.v1.Replication.Automatic
	7, // 7: google.cloud.secretmanager.v1.Replication.user_managed:type_name -> google.cloud.secretmanager.v1.Replication.UserManaged
	8, // 8: google.cloud.secretmanager.v1.Replication.UserManaged.replicas:type_name -> google.cloud.secretmanager.v1.Replication.UserManaged.Replica
	9, // [9:9] is the sub-list for method output_type
	9, // [9:9] is the sub-list for method input_type
	9, // [9:9] is the sub-list for extension type_name
	9, // [9:9] is the sub-list for extension extendee
	0, // [0:9] is the sub-list for field type_name
}

func init() { file_google_cloud_secretmanager_v1_resources_proto_init() }
func file_google_cloud_secretmanager_v1_resources_proto_init() {
	if File_google_cloud_secretmanager_v1_resources_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Secret); i {
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
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretVersion); i {
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
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Replication); i {
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
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SecretPayload); i {
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
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Replication_Automatic); i {
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
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Replication_UserManaged); i {
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
		file_google_cloud_secretmanager_v1_resources_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Replication_UserManaged_Replica); i {
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
	file_google_cloud_secretmanager_v1_resources_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*Replication_Automatic_)(nil),
		(*Replication_UserManaged_)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_cloud_secretmanager_v1_resources_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_secretmanager_v1_resources_proto_goTypes,
		DependencyIndexes: file_google_cloud_secretmanager_v1_resources_proto_depIdxs,
		EnumInfos:         file_google_cloud_secretmanager_v1_resources_proto_enumTypes,
		MessageInfos:      file_google_cloud_secretmanager_v1_resources_proto_msgTypes,
	}.Build()
	File_google_cloud_secretmanager_v1_resources_proto = out.File
	file_google_cloud_secretmanager_v1_resources_proto_rawDesc = nil
	file_google_cloud_secretmanager_v1_resources_proto_goTypes = nil
	file_google_cloud_secretmanager_v1_resources_proto_depIdxs = nil
}
