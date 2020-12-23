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
// source: google/maps/playablelocations/v3/resources.proto

package playablelocations

import (
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	_ "google.golang.org/genproto/googleapis/type/latlng"
	_ "google.golang.org/genproto/protobuf/field_mask"
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

// The reason why the playable location is considered bad.
type PlayerReport_BadLocationReason int32

const (
	// Unspecified reason. Do not use.
	PlayerReport_BAD_LOCATION_REASON_UNSPECIFIED PlayerReport_BadLocationReason = 0
	// The reason isn't one of the reasons in this enumeration.
	PlayerReport_OTHER PlayerReport_BadLocationReason = 1
	// The playable location isn't accessible to pedestrians. For example, if
	// it's in the middle of a highway.
	PlayerReport_NOT_PEDESTRIAN_ACCESSIBLE PlayerReport_BadLocationReason = 2
	// The playable location isn't open to the public. For example, a private
	// office building.
	PlayerReport_NOT_OPEN_TO_PUBLIC PlayerReport_BadLocationReason = 4
	// The playable location is permanently closed. For example, when a business
	// has been shut down.
	PlayerReport_PERMANENTLY_CLOSED PlayerReport_BadLocationReason = 5
	// The playable location is temporarily inaccessible. For example, when a
	// business has closed for renovations.
	PlayerReport_TEMPORARILY_INACCESSIBLE PlayerReport_BadLocationReason = 6
)

// Enum value maps for PlayerReport_BadLocationReason.
var (
	PlayerReport_BadLocationReason_name = map[int32]string{
		0: "BAD_LOCATION_REASON_UNSPECIFIED",
		1: "OTHER",
		2: "NOT_PEDESTRIAN_ACCESSIBLE",
		4: "NOT_OPEN_TO_PUBLIC",
		5: "PERMANENTLY_CLOSED",
		6: "TEMPORARILY_INACCESSIBLE",
	}
	PlayerReport_BadLocationReason_value = map[string]int32{
		"BAD_LOCATION_REASON_UNSPECIFIED": 0,
		"OTHER":                           1,
		"NOT_PEDESTRIAN_ACCESSIBLE":       2,
		"NOT_OPEN_TO_PUBLIC":              4,
		"PERMANENTLY_CLOSED":              5,
		"TEMPORARILY_INACCESSIBLE":        6,
	}
)

func (x PlayerReport_BadLocationReason) Enum() *PlayerReport_BadLocationReason {
	p := new(PlayerReport_BadLocationReason)
	*p = x
	return p
}

func (x PlayerReport_BadLocationReason) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (PlayerReport_BadLocationReason) Descriptor() protoreflect.EnumDescriptor {
	return file_google_maps_playablelocations_v3_resources_proto_enumTypes[0].Descriptor()
}

func (PlayerReport_BadLocationReason) Type() protoreflect.EnumType {
	return &file_google_maps_playablelocations_v3_resources_proto_enumTypes[0]
}

func (x PlayerReport_BadLocationReason) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use PlayerReport_BadLocationReason.Descriptor instead.
func (PlayerReport_BadLocationReason) EnumDescriptor() ([]byte, []int) {
	return file_google_maps_playablelocations_v3_resources_proto_rawDescGZIP(), []int{0, 0}
}

// The type of impression event.
type Impression_ImpressionType int32

const (
	// Unspecified type. Do not use.
	Impression_IMPRESSION_TYPE_UNSPECIFIED Impression_ImpressionType = 0
	// The playable location was presented to a player.
	Impression_PRESENTED Impression_ImpressionType = 1
	// A player interacted with the playable location.
	Impression_INTERACTED Impression_ImpressionType = 2
)

// Enum value maps for Impression_ImpressionType.
var (
	Impression_ImpressionType_name = map[int32]string{
		0: "IMPRESSION_TYPE_UNSPECIFIED",
		1: "PRESENTED",
		2: "INTERACTED",
	}
	Impression_ImpressionType_value = map[string]int32{
		"IMPRESSION_TYPE_UNSPECIFIED": 0,
		"PRESENTED":                   1,
		"INTERACTED":                  2,
	}
)

func (x Impression_ImpressionType) Enum() *Impression_ImpressionType {
	p := new(Impression_ImpressionType)
	*p = x
	return p
}

func (x Impression_ImpressionType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Impression_ImpressionType) Descriptor() protoreflect.EnumDescriptor {
	return file_google_maps_playablelocations_v3_resources_proto_enumTypes[1].Descriptor()
}

func (Impression_ImpressionType) Type() protoreflect.EnumType {
	return &file_google_maps_playablelocations_v3_resources_proto_enumTypes[1]
}

func (x Impression_ImpressionType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Impression_ImpressionType.Descriptor instead.
func (Impression_ImpressionType) EnumDescriptor() ([]byte, []int) {
	return file_google_maps_playablelocations_v3_resources_proto_rawDescGZIP(), []int{1, 0}
}

// A report submitted by a player about a playable location that is considered
// inappropriate for use in the game.
type PlayerReport struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The name of the playable location.
	LocationName string `protobuf:"bytes,1,opt,name=location_name,json=locationName,proto3" json:"location_name,omitempty"`
	// Required. One or more reasons why this playable location is considered bad.
	Reasons []PlayerReport_BadLocationReason `protobuf:"varint,2,rep,packed,name=reasons,proto3,enum=google.maps.playablelocations.v3.PlayerReport_BadLocationReason" json:"reasons,omitempty"`
	// Required. A free-form description detailing why the playable location is
	// considered bad.
	ReasonDetails string `protobuf:"bytes,3,opt,name=reason_details,json=reasonDetails,proto3" json:"reason_details,omitempty"`
	// Language code (in BCP-47 format) indicating the language of the freeform
	// description provided in `reason_details`. Examples are "en", "en-US" or
	// "ja-Latn". For more information, see
	// http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
	LanguageCode string `protobuf:"bytes,4,opt,name=language_code,json=languageCode,proto3" json:"language_code,omitempty"`
}

func (x *PlayerReport) Reset() {
	*x = PlayerReport{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_maps_playablelocations_v3_resources_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PlayerReport) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PlayerReport) ProtoMessage() {}

func (x *PlayerReport) ProtoReflect() protoreflect.Message {
	mi := &file_google_maps_playablelocations_v3_resources_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PlayerReport.ProtoReflect.Descriptor instead.
func (*PlayerReport) Descriptor() ([]byte, []int) {
	return file_google_maps_playablelocations_v3_resources_proto_rawDescGZIP(), []int{0}
}

func (x *PlayerReport) GetLocationName() string {
	if x != nil {
		return x.LocationName
	}
	return ""
}

func (x *PlayerReport) GetReasons() []PlayerReport_BadLocationReason {
	if x != nil {
		return x.Reasons
	}
	return nil
}

func (x *PlayerReport) GetReasonDetails() string {
	if x != nil {
		return x.ReasonDetails
	}
	return ""
}

func (x *PlayerReport) GetLanguageCode() string {
	if x != nil {
		return x.LanguageCode
	}
	return ""
}

// Encapsulates impression event details.
type Impression struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. The name of the playable location.
	LocationName string `protobuf:"bytes,1,opt,name=location_name,json=locationName,proto3" json:"location_name,omitempty"`
	// Required. The type of impression event.
	ImpressionType Impression_ImpressionType `protobuf:"varint,2,opt,name=impression_type,json=impressionType,proto3,enum=google.maps.playablelocations.v3.Impression_ImpressionType" json:"impression_type,omitempty"`
	// An arbitrary, developer-defined type identifier for each type of game
	// object used in your game.
	//
	// Since players interact with differ types of game objects in different ways,
	// this field allows you to segregate impression data by type for analysis.
	//
	// You should assign a unique `game_object_type` ID to represent a distinct
	// type of game object in your game.
	//
	// For example, 1=monster location, 2=powerup location.
	GameObjectType int32 `protobuf:"varint,4,opt,name=game_object_type,json=gameObjectType,proto3" json:"game_object_type,omitempty"`
}

func (x *Impression) Reset() {
	*x = Impression{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_maps_playablelocations_v3_resources_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Impression) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Impression) ProtoMessage() {}

func (x *Impression) ProtoReflect() protoreflect.Message {
	mi := &file_google_maps_playablelocations_v3_resources_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Impression.ProtoReflect.Descriptor instead.
func (*Impression) Descriptor() ([]byte, []int) {
	return file_google_maps_playablelocations_v3_resources_proto_rawDescGZIP(), []int{1}
}

func (x *Impression) GetLocationName() string {
	if x != nil {
		return x.LocationName
	}
	return ""
}

func (x *Impression) GetImpressionType() Impression_ImpressionType {
	if x != nil {
		return x.ImpressionType
	}
	return Impression_IMPRESSION_TYPE_UNSPECIFIED
}

func (x *Impression) GetGameObjectType() int32 {
	if x != nil {
		return x.GameObjectType
	}
	return 0
}

var File_google_maps_playablelocations_v3_resources_proto protoreflect.FileDescriptor

var file_google_maps_playablelocations_v3_resources_proto_rawDesc = []byte{
	0x0a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x6d, 0x61, 0x70, 0x73, 0x2f, 0x70, 0x6c,
	0x61, 0x79, 0x61, 0x62, 0x6c, 0x65, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f,
	0x76, 0x33, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x6d, 0x61, 0x70, 0x73, 0x2e,
	0x70, 0x6c, 0x61, 0x79, 0x61, 0x62, 0x6c, 0x65, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2e, 0x76, 0x33, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x6d, 0x61, 0x73,
	0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x18, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x2f, 0x6c, 0x61, 0x74, 0x6c, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x9d, 0x03, 0x0a, 0x0c, 0x50, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x52, 0x65, 0x70, 0x6f,
	0x72, 0x74, 0x12, 0x28, 0x0a, 0x0d, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0c,
	0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x5f, 0x0a, 0x07,
	0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0e, 0x32, 0x40, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x6d, 0x61, 0x70, 0x73, 0x2e, 0x70, 0x6c, 0x61, 0x79,
	0x61, 0x62, 0x6c, 0x65, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x76, 0x33,
	0x2e, 0x50, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x52, 0x65, 0x70, 0x6f, 0x72, 0x74, 0x2e, 0x42, 0x61,
	0x64, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x42,
	0x03, 0xe0, 0x41, 0x02, 0x52, 0x07, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x73, 0x12, 0x2a, 0x0a,
	0x0e, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x5f, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0d, 0x72, 0x65, 0x61, 0x73,
	0x6f, 0x6e, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x12, 0x23, 0x0a, 0x0d, 0x6c, 0x61, 0x6e,
	0x67, 0x75, 0x61, 0x67, 0x65, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0c, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x43, 0x6f, 0x64, 0x65, 0x22, 0xb0,
	0x01, 0x0a, 0x11, 0x42, 0x61, 0x64, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x61, 0x73, 0x6f, 0x6e, 0x12, 0x23, 0x0a, 0x1f, 0x42, 0x41, 0x44, 0x5f, 0x4c, 0x4f, 0x43, 0x41,
	0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x52, 0x45, 0x41, 0x53, 0x4f, 0x4e, 0x5f, 0x55, 0x4e, 0x53, 0x50,
	0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x4f, 0x54, 0x48,
	0x45, 0x52, 0x10, 0x01, 0x12, 0x1d, 0x0a, 0x19, 0x4e, 0x4f, 0x54, 0x5f, 0x50, 0x45, 0x44, 0x45,
	0x53, 0x54, 0x52, 0x49, 0x41, 0x4e, 0x5f, 0x41, 0x43, 0x43, 0x45, 0x53, 0x53, 0x49, 0x42, 0x4c,
	0x45, 0x10, 0x02, 0x12, 0x16, 0x0a, 0x12, 0x4e, 0x4f, 0x54, 0x5f, 0x4f, 0x50, 0x45, 0x4e, 0x5f,
	0x54, 0x4f, 0x5f, 0x50, 0x55, 0x42, 0x4c, 0x49, 0x43, 0x10, 0x04, 0x12, 0x16, 0x0a, 0x12, 0x50,
	0x45, 0x52, 0x4d, 0x41, 0x4e, 0x45, 0x4e, 0x54, 0x4c, 0x59, 0x5f, 0x43, 0x4c, 0x4f, 0x53, 0x45,
	0x44, 0x10, 0x05, 0x12, 0x1c, 0x0a, 0x18, 0x54, 0x45, 0x4d, 0x50, 0x4f, 0x52, 0x41, 0x52, 0x49,
	0x4c, 0x59, 0x5f, 0x49, 0x4e, 0x41, 0x43, 0x43, 0x45, 0x53, 0x53, 0x49, 0x42, 0x4c, 0x45, 0x10,
	0x06, 0x22, 0x9d, 0x02, 0x0a, 0x0a, 0x49, 0x6d, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e,
	0x12, 0x28, 0x0a, 0x0d, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0c, 0x6c, 0x6f,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x69, 0x0a, 0x0f, 0x69, 0x6d,
	0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x3b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x6d, 0x61, 0x70,
	0x73, 0x2e, 0x70, 0x6c, 0x61, 0x79, 0x61, 0x62, 0x6c, 0x65, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x49, 0x6d, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f,
	0x6e, 0x2e, 0x49, 0x6d, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65,
	0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0e, 0x69, 0x6d, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f,
	0x6e, 0x54, 0x79, 0x70, 0x65, 0x12, 0x28, 0x0a, 0x10, 0x67, 0x61, 0x6d, 0x65, 0x5f, 0x6f, 0x62,
	0x6a, 0x65, 0x63, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x0e, 0x67, 0x61, 0x6d, 0x65, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x54, 0x79, 0x70, 0x65, 0x22,
	0x50, 0x0a, 0x0e, 0x49, 0x6d, 0x70, 0x72, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70,
	0x65, 0x12, 0x1f, 0x0a, 0x1b, 0x49, 0x4d, 0x50, 0x52, 0x45, 0x53, 0x53, 0x49, 0x4f, 0x4e, 0x5f,
	0x54, 0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44,
	0x10, 0x00, 0x12, 0x0d, 0x0a, 0x09, 0x50, 0x52, 0x45, 0x53, 0x45, 0x4e, 0x54, 0x45, 0x44, 0x10,
	0x01, 0x12, 0x0e, 0x0a, 0x0a, 0x49, 0x4e, 0x54, 0x45, 0x52, 0x41, 0x43, 0x54, 0x45, 0x44, 0x10,
	0x02, 0x42, 0xb5, 0x01, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x6d, 0x61, 0x70, 0x73, 0x2e, 0x70, 0x6c, 0x61, 0x79, 0x61, 0x62, 0x6c, 0x65, 0x6c, 0x6f,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x76, 0x33, 0x42, 0x0e, 0x52, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x51, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f,
	0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61,
	0x70, 0x69, 0x73, 0x2f, 0x6d, 0x61, 0x70, 0x73, 0x2f, 0x70, 0x6c, 0x61, 0x79, 0x61, 0x62, 0x6c,
	0x65, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x76, 0x33, 0x3b, 0x70, 0x6c,
	0x61, 0x79, 0x61, 0x62, 0x6c, 0x65, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0xa2,
	0x02, 0x04, 0x47, 0x4d, 0x50, 0x4c, 0xaa, 0x02, 0x20, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x4d, 0x61, 0x70, 0x73, 0x2e, 0x50, 0x6c, 0x61, 0x79, 0x61, 0x62, 0x6c, 0x65, 0x4c, 0x6f, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x56, 0x33, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_google_maps_playablelocations_v3_resources_proto_rawDescOnce sync.Once
	file_google_maps_playablelocations_v3_resources_proto_rawDescData = file_google_maps_playablelocations_v3_resources_proto_rawDesc
)

func file_google_maps_playablelocations_v3_resources_proto_rawDescGZIP() []byte {
	file_google_maps_playablelocations_v3_resources_proto_rawDescOnce.Do(func() {
		file_google_maps_playablelocations_v3_resources_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_maps_playablelocations_v3_resources_proto_rawDescData)
	})
	return file_google_maps_playablelocations_v3_resources_proto_rawDescData
}

var file_google_maps_playablelocations_v3_resources_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_google_maps_playablelocations_v3_resources_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_google_maps_playablelocations_v3_resources_proto_goTypes = []interface{}{
	(PlayerReport_BadLocationReason)(0), // 0: google.maps.playablelocations.v3.PlayerReport.BadLocationReason
	(Impression_ImpressionType)(0),      // 1: google.maps.playablelocations.v3.Impression.ImpressionType
	(*PlayerReport)(nil),                // 2: google.maps.playablelocations.v3.PlayerReport
	(*Impression)(nil),                  // 3: google.maps.playablelocations.v3.Impression
}
var file_google_maps_playablelocations_v3_resources_proto_depIdxs = []int32{
	0, // 0: google.maps.playablelocations.v3.PlayerReport.reasons:type_name -> google.maps.playablelocations.v3.PlayerReport.BadLocationReason
	1, // 1: google.maps.playablelocations.v3.Impression.impression_type:type_name -> google.maps.playablelocations.v3.Impression.ImpressionType
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_google_maps_playablelocations_v3_resources_proto_init() }
func file_google_maps_playablelocations_v3_resources_proto_init() {
	if File_google_maps_playablelocations_v3_resources_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_maps_playablelocations_v3_resources_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PlayerReport); i {
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
		file_google_maps_playablelocations_v3_resources_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Impression); i {
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
			RawDescriptor: file_google_maps_playablelocations_v3_resources_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_maps_playablelocations_v3_resources_proto_goTypes,
		DependencyIndexes: file_google_maps_playablelocations_v3_resources_proto_depIdxs,
		EnumInfos:         file_google_maps_playablelocations_v3_resources_proto_enumTypes,
		MessageInfos:      file_google_maps_playablelocations_v3_resources_proto_msgTypes,
	}.Build()
	File_google_maps_playablelocations_v3_resources_proto = out.File
	file_google_maps_playablelocations_v3_resources_proto_rawDesc = nil
	file_google_maps_playablelocations_v3_resources_proto_goTypes = nil
	file_google_maps_playablelocations_v3_resources_proto_depIdxs = nil
}
