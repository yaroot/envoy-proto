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
// source: google/ads/googleads/v5/errors/media_upload_error.proto

package errors

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

// Enum describing possible media uploading errors.
type MediaUploadErrorEnum_MediaUploadError int32

const (
	// Enum unspecified.
	MediaUploadErrorEnum_UNSPECIFIED MediaUploadErrorEnum_MediaUploadError = 0
	// The received error code is not known in this version.
	MediaUploadErrorEnum_UNKNOWN MediaUploadErrorEnum_MediaUploadError = 1
	// The uploaded file is too big.
	MediaUploadErrorEnum_FILE_TOO_BIG MediaUploadErrorEnum_MediaUploadError = 2
	// Image data is unparseable.
	MediaUploadErrorEnum_UNPARSEABLE_IMAGE MediaUploadErrorEnum_MediaUploadError = 3
	// Animated images are not allowed.
	MediaUploadErrorEnum_ANIMATED_IMAGE_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 4
	// The image or media bundle format is not allowed.
	MediaUploadErrorEnum_FORMAT_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 5
	// Cannot reference URL external to the media bundle.
	MediaUploadErrorEnum_EXTERNAL_URL_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 6
	// HTML5 ad is trying to reference an asset not in .ZIP file.
	MediaUploadErrorEnum_INVALID_URL_REFERENCE MediaUploadErrorEnum_MediaUploadError = 7
	// The media bundle contains no primary entry.
	MediaUploadErrorEnum_MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY MediaUploadErrorEnum_MediaUploadError = 8
	// Animation has disallowed visual effects.
	MediaUploadErrorEnum_ANIMATED_VISUAL_EFFECT MediaUploadErrorEnum_MediaUploadError = 9
	// Animation longer than the allowed 30 second limit.
	MediaUploadErrorEnum_ANIMATION_TOO_LONG MediaUploadErrorEnum_MediaUploadError = 10
	// The aspect ratio of the image does not match the expected aspect ratios
	// provided in the asset spec.
	MediaUploadErrorEnum_ASPECT_RATIO_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 11
	// Audio files are not allowed in bundle.
	MediaUploadErrorEnum_AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE MediaUploadErrorEnum_MediaUploadError = 12
	// CMYK jpegs are not supported.
	MediaUploadErrorEnum_CMYK_JPEG_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 13
	// Flash movies are not allowed.
	MediaUploadErrorEnum_FLASH_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 14
	// The frame rate of the video is higher than the allowed 5fps.
	MediaUploadErrorEnum_FRAME_RATE_TOO_HIGH MediaUploadErrorEnum_MediaUploadError = 15
	// ZIP file from Google Web Designer is not published.
	MediaUploadErrorEnum_GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED MediaUploadErrorEnum_MediaUploadError = 16
	// Image constraints are violated, but more details (like
	// DIMENSIONS_NOT_ALLOWED or ASPECT_RATIO_NOT_ALLOWED) can not be provided.
	// This happens when asset spec contains more than one constraint and
	// criteria of different constraints are violated.
	MediaUploadErrorEnum_IMAGE_CONSTRAINTS_VIOLATED MediaUploadErrorEnum_MediaUploadError = 17
	// Media bundle data is unrecognizable.
	MediaUploadErrorEnum_INVALID_MEDIA_BUNDLE MediaUploadErrorEnum_MediaUploadError = 18
	// There was a problem with one or more of the media bundle entries.
	MediaUploadErrorEnum_INVALID_MEDIA_BUNDLE_ENTRY MediaUploadErrorEnum_MediaUploadError = 19
	// The asset has an invalid mime type.
	MediaUploadErrorEnum_INVALID_MIME_TYPE MediaUploadErrorEnum_MediaUploadError = 20
	// The media bundle contains an invalid asset path.
	MediaUploadErrorEnum_INVALID_PATH MediaUploadErrorEnum_MediaUploadError = 21
	// Image has layout problem.
	MediaUploadErrorEnum_LAYOUT_PROBLEM MediaUploadErrorEnum_MediaUploadError = 22
	// An asset had a URL reference that is malformed per RFC 1738 convention.
	MediaUploadErrorEnum_MALFORMED_URL MediaUploadErrorEnum_MediaUploadError = 23
	// The uploaded media bundle format is not allowed.
	MediaUploadErrorEnum_MEDIA_BUNDLE_NOT_ALLOWED MediaUploadErrorEnum_MediaUploadError = 24
	// The media bundle is not compatible with the asset spec product type.
	// (E.g. Gmail, dynamic remarketing, etc.)
	MediaUploadErrorEnum_MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE MediaUploadErrorEnum_MediaUploadError = 25
	// A bundle being uploaded that is incompatible with multiple assets for
	// different reasons.
	MediaUploadErrorEnum_MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS MediaUploadErrorEnum_MediaUploadError = 26
	// The media bundle contains too many files.
	MediaUploadErrorEnum_TOO_MANY_FILES_IN_MEDIA_BUNDLE MediaUploadErrorEnum_MediaUploadError = 27
	// Google Web Designer not created for "Google Ads" environment.
	MediaUploadErrorEnum_UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT MediaUploadErrorEnum_MediaUploadError = 28
	// Unsupported HTML5 feature in HTML5 asset.
	MediaUploadErrorEnum_UNSUPPORTED_HTML5_FEATURE MediaUploadErrorEnum_MediaUploadError = 29
	// URL in HTML5 entry is not SSL compliant.
	MediaUploadErrorEnum_URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT MediaUploadErrorEnum_MediaUploadError = 30
	// Video file name is longer than the 50 allowed characters.
	MediaUploadErrorEnum_VIDEO_FILE_NAME_TOO_LONG MediaUploadErrorEnum_MediaUploadError = 31
	// Multiple videos with same name in a bundle.
	MediaUploadErrorEnum_VIDEO_MULTIPLE_FILES_WITH_SAME_NAME MediaUploadErrorEnum_MediaUploadError = 32
	// Videos are not allowed in media bundle.
	MediaUploadErrorEnum_VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE MediaUploadErrorEnum_MediaUploadError = 33
)

// Enum value maps for MediaUploadErrorEnum_MediaUploadError.
var (
	MediaUploadErrorEnum_MediaUploadError_name = map[int32]string{
		0:  "UNSPECIFIED",
		1:  "UNKNOWN",
		2:  "FILE_TOO_BIG",
		3:  "UNPARSEABLE_IMAGE",
		4:  "ANIMATED_IMAGE_NOT_ALLOWED",
		5:  "FORMAT_NOT_ALLOWED",
		6:  "EXTERNAL_URL_NOT_ALLOWED",
		7:  "INVALID_URL_REFERENCE",
		8:  "MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY",
		9:  "ANIMATED_VISUAL_EFFECT",
		10: "ANIMATION_TOO_LONG",
		11: "ASPECT_RATIO_NOT_ALLOWED",
		12: "AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE",
		13: "CMYK_JPEG_NOT_ALLOWED",
		14: "FLASH_NOT_ALLOWED",
		15: "FRAME_RATE_TOO_HIGH",
		16: "GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED",
		17: "IMAGE_CONSTRAINTS_VIOLATED",
		18: "INVALID_MEDIA_BUNDLE",
		19: "INVALID_MEDIA_BUNDLE_ENTRY",
		20: "INVALID_MIME_TYPE",
		21: "INVALID_PATH",
		22: "LAYOUT_PROBLEM",
		23: "MALFORMED_URL",
		24: "MEDIA_BUNDLE_NOT_ALLOWED",
		25: "MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE",
		26: "MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS",
		27: "TOO_MANY_FILES_IN_MEDIA_BUNDLE",
		28: "UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT",
		29: "UNSUPPORTED_HTML5_FEATURE",
		30: "URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT",
		31: "VIDEO_FILE_NAME_TOO_LONG",
		32: "VIDEO_MULTIPLE_FILES_WITH_SAME_NAME",
		33: "VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE",
	}
	MediaUploadErrorEnum_MediaUploadError_value = map[string]int32{
		"UNSPECIFIED":                                   0,
		"UNKNOWN":                                       1,
		"FILE_TOO_BIG":                                  2,
		"UNPARSEABLE_IMAGE":                             3,
		"ANIMATED_IMAGE_NOT_ALLOWED":                    4,
		"FORMAT_NOT_ALLOWED":                            5,
		"EXTERNAL_URL_NOT_ALLOWED":                      6,
		"INVALID_URL_REFERENCE":                         7,
		"MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY":            8,
		"ANIMATED_VISUAL_EFFECT":                        9,
		"ANIMATION_TOO_LONG":                            10,
		"ASPECT_RATIO_NOT_ALLOWED":                      11,
		"AUDIO_NOT_ALLOWED_IN_MEDIA_BUNDLE":             12,
		"CMYK_JPEG_NOT_ALLOWED":                         13,
		"FLASH_NOT_ALLOWED":                             14,
		"FRAME_RATE_TOO_HIGH":                           15,
		"GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED":    16,
		"IMAGE_CONSTRAINTS_VIOLATED":                    17,
		"INVALID_MEDIA_BUNDLE":                          18,
		"INVALID_MEDIA_BUNDLE_ENTRY":                    19,
		"INVALID_MIME_TYPE":                             20,
		"INVALID_PATH":                                  21,
		"LAYOUT_PROBLEM":                                22,
		"MALFORMED_URL":                                 23,
		"MEDIA_BUNDLE_NOT_ALLOWED":                      24,
		"MEDIA_BUNDLE_NOT_COMPATIBLE_TO_PRODUCT_TYPE":   25,
		"MEDIA_BUNDLE_REJECTED_BY_MULTIPLE_ASSET_SPECS": 26,
		"TOO_MANY_FILES_IN_MEDIA_BUNDLE":                27,
		"UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT":   28,
		"UNSUPPORTED_HTML5_FEATURE":                     29,
		"URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT":         30,
		"VIDEO_FILE_NAME_TOO_LONG":                      31,
		"VIDEO_MULTIPLE_FILES_WITH_SAME_NAME":           32,
		"VIDEO_NOT_ALLOWED_IN_MEDIA_BUNDLE":             33,
	}
)

func (x MediaUploadErrorEnum_MediaUploadError) Enum() *MediaUploadErrorEnum_MediaUploadError {
	p := new(MediaUploadErrorEnum_MediaUploadError)
	*p = x
	return p
}

func (x MediaUploadErrorEnum_MediaUploadError) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (MediaUploadErrorEnum_MediaUploadError) Descriptor() protoreflect.EnumDescriptor {
	return file_google_ads_googleads_v5_errors_media_upload_error_proto_enumTypes[0].Descriptor()
}

func (MediaUploadErrorEnum_MediaUploadError) Type() protoreflect.EnumType {
	return &file_google_ads_googleads_v5_errors_media_upload_error_proto_enumTypes[0]
}

func (x MediaUploadErrorEnum_MediaUploadError) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use MediaUploadErrorEnum_MediaUploadError.Descriptor instead.
func (MediaUploadErrorEnum_MediaUploadError) EnumDescriptor() ([]byte, []int) {
	return file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescGZIP(), []int{0, 0}
}

// Container for enum describing possible media uploading errors.
type MediaUploadErrorEnum struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *MediaUploadErrorEnum) Reset() {
	*x = MediaUploadErrorEnum{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v5_errors_media_upload_error_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MediaUploadErrorEnum) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MediaUploadErrorEnum) ProtoMessage() {}

func (x *MediaUploadErrorEnum) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v5_errors_media_upload_error_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MediaUploadErrorEnum.ProtoReflect.Descriptor instead.
func (*MediaUploadErrorEnum) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescGZIP(), []int{0}
}

var File_google_ads_googleads_v5_errors_media_upload_error_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDesc = []byte{
	0x0a, 0x37, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x35, 0x2f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x73,
	0x2f, 0x6d, 0x65, 0x64, 0x69, 0x61, 0x5f, 0x75, 0x70, 0x6c, 0x6f, 0x61, 0x64, 0x5f, 0x65, 0x72,
	0x72, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x76, 0x35, 0x2e, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x73, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xb8, 0x08, 0x0a, 0x14, 0x4d, 0x65, 0x64, 0x69,
	0x61, 0x55, 0x70, 0x6c, 0x6f, 0x61, 0x64, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x45, 0x6e, 0x75, 0x6d,
	0x22, 0x9f, 0x08, 0x0a, 0x10, 0x4d, 0x65, 0x64, 0x69, 0x61, 0x55, 0x70, 0x6c, 0x6f, 0x61, 0x64,
	0x45, 0x72, 0x72, 0x6f, 0x72, 0x12, 0x0f, 0x0a, 0x0b, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49,
	0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57,
	0x4e, 0x10, 0x01, 0x12, 0x10, 0x0a, 0x0c, 0x46, 0x49, 0x4c, 0x45, 0x5f, 0x54, 0x4f, 0x4f, 0x5f,
	0x42, 0x49, 0x47, 0x10, 0x02, 0x12, 0x15, 0x0a, 0x11, 0x55, 0x4e, 0x50, 0x41, 0x52, 0x53, 0x45,
	0x41, 0x42, 0x4c, 0x45, 0x5f, 0x49, 0x4d, 0x41, 0x47, 0x45, 0x10, 0x03, 0x12, 0x1e, 0x0a, 0x1a,
	0x41, 0x4e, 0x49, 0x4d, 0x41, 0x54, 0x45, 0x44, 0x5f, 0x49, 0x4d, 0x41, 0x47, 0x45, 0x5f, 0x4e,
	0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44, 0x10, 0x04, 0x12, 0x16, 0x0a, 0x12,
	0x46, 0x4f, 0x52, 0x4d, 0x41, 0x54, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57,
	0x45, 0x44, 0x10, 0x05, 0x12, 0x1c, 0x0a, 0x18, 0x45, 0x58, 0x54, 0x45, 0x52, 0x4e, 0x41, 0x4c,
	0x5f, 0x55, 0x52, 0x4c, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44,
	0x10, 0x06, 0x12, 0x19, 0x0a, 0x15, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x5f, 0x55, 0x52,
	0x4c, 0x5f, 0x52, 0x45, 0x46, 0x45, 0x52, 0x45, 0x4e, 0x43, 0x45, 0x10, 0x07, 0x12, 0x26, 0x0a,
	0x22, 0x4d, 0x49, 0x53, 0x53, 0x49, 0x4e, 0x47, 0x5f, 0x50, 0x52, 0x49, 0x4d, 0x41, 0x52, 0x59,
	0x5f, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c, 0x45, 0x5f, 0x45, 0x4e,
	0x54, 0x52, 0x59, 0x10, 0x08, 0x12, 0x1a, 0x0a, 0x16, 0x41, 0x4e, 0x49, 0x4d, 0x41, 0x54, 0x45,
	0x44, 0x5f, 0x56, 0x49, 0x53, 0x55, 0x41, 0x4c, 0x5f, 0x45, 0x46, 0x46, 0x45, 0x43, 0x54, 0x10,
	0x09, 0x12, 0x16, 0x0a, 0x12, 0x41, 0x4e, 0x49, 0x4d, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x54,
	0x4f, 0x4f, 0x5f, 0x4c, 0x4f, 0x4e, 0x47, 0x10, 0x0a, 0x12, 0x1c, 0x0a, 0x18, 0x41, 0x53, 0x50,
	0x45, 0x43, 0x54, 0x5f, 0x52, 0x41, 0x54, 0x49, 0x4f, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c,
	0x4c, 0x4f, 0x57, 0x45, 0x44, 0x10, 0x0b, 0x12, 0x25, 0x0a, 0x21, 0x41, 0x55, 0x44, 0x49, 0x4f,
	0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44, 0x5f, 0x49, 0x4e, 0x5f,
	0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c, 0x45, 0x10, 0x0c, 0x12, 0x19,
	0x0a, 0x15, 0x43, 0x4d, 0x59, 0x4b, 0x5f, 0x4a, 0x50, 0x45, 0x47, 0x5f, 0x4e, 0x4f, 0x54, 0x5f,
	0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44, 0x10, 0x0d, 0x12, 0x15, 0x0a, 0x11, 0x46, 0x4c, 0x41,
	0x53, 0x48, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44, 0x10, 0x0e,
	0x12, 0x17, 0x0a, 0x13, 0x46, 0x52, 0x41, 0x4d, 0x45, 0x5f, 0x52, 0x41, 0x54, 0x45, 0x5f, 0x54,
	0x4f, 0x4f, 0x5f, 0x48, 0x49, 0x47, 0x48, 0x10, 0x0f, 0x12, 0x2e, 0x0a, 0x2a, 0x47, 0x4f, 0x4f,
	0x47, 0x4c, 0x45, 0x5f, 0x57, 0x45, 0x42, 0x5f, 0x44, 0x45, 0x53, 0x49, 0x47, 0x4e, 0x45, 0x52,
	0x5f, 0x5a, 0x49, 0x50, 0x5f, 0x46, 0x49, 0x4c, 0x45, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x50, 0x55,
	0x42, 0x4c, 0x49, 0x53, 0x48, 0x45, 0x44, 0x10, 0x10, 0x12, 0x1e, 0x0a, 0x1a, 0x49, 0x4d, 0x41,
	0x47, 0x45, 0x5f, 0x43, 0x4f, 0x4e, 0x53, 0x54, 0x52, 0x41, 0x49, 0x4e, 0x54, 0x53, 0x5f, 0x56,
	0x49, 0x4f, 0x4c, 0x41, 0x54, 0x45, 0x44, 0x10, 0x11, 0x12, 0x18, 0x0a, 0x14, 0x49, 0x4e, 0x56,
	0x41, 0x4c, 0x49, 0x44, 0x5f, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c,
	0x45, 0x10, 0x12, 0x12, 0x1e, 0x0a, 0x1a, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x5f, 0x4d,
	0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c, 0x45, 0x5f, 0x45, 0x4e, 0x54, 0x52,
	0x59, 0x10, 0x13, 0x12, 0x15, 0x0a, 0x11, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x5f, 0x4d,
	0x49, 0x4d, 0x45, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x10, 0x14, 0x12, 0x10, 0x0a, 0x0c, 0x49, 0x4e,
	0x56, 0x41, 0x4c, 0x49, 0x44, 0x5f, 0x50, 0x41, 0x54, 0x48, 0x10, 0x15, 0x12, 0x12, 0x0a, 0x0e,
	0x4c, 0x41, 0x59, 0x4f, 0x55, 0x54, 0x5f, 0x50, 0x52, 0x4f, 0x42, 0x4c, 0x45, 0x4d, 0x10, 0x16,
	0x12, 0x11, 0x0a, 0x0d, 0x4d, 0x41, 0x4c, 0x46, 0x4f, 0x52, 0x4d, 0x45, 0x44, 0x5f, 0x55, 0x52,
	0x4c, 0x10, 0x17, 0x12, 0x1c, 0x0a, 0x18, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e,
	0x44, 0x4c, 0x45, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44, 0x10,
	0x18, 0x12, 0x2f, 0x0a, 0x2b, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c,
	0x45, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x43, 0x4f, 0x4d, 0x50, 0x41, 0x54, 0x49, 0x42, 0x4c, 0x45,
	0x5f, 0x54, 0x4f, 0x5f, 0x50, 0x52, 0x4f, 0x44, 0x55, 0x43, 0x54, 0x5f, 0x54, 0x59, 0x50, 0x45,
	0x10, 0x19, 0x12, 0x31, 0x0a, 0x2d, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44,
	0x4c, 0x45, 0x5f, 0x52, 0x45, 0x4a, 0x45, 0x43, 0x54, 0x45, 0x44, 0x5f, 0x42, 0x59, 0x5f, 0x4d,
	0x55, 0x4c, 0x54, 0x49, 0x50, 0x4c, 0x45, 0x5f, 0x41, 0x53, 0x53, 0x45, 0x54, 0x5f, 0x53, 0x50,
	0x45, 0x43, 0x53, 0x10, 0x1a, 0x12, 0x22, 0x0a, 0x1e, 0x54, 0x4f, 0x4f, 0x5f, 0x4d, 0x41, 0x4e,
	0x59, 0x5f, 0x46, 0x49, 0x4c, 0x45, 0x53, 0x5f, 0x49, 0x4e, 0x5f, 0x4d, 0x45, 0x44, 0x49, 0x41,
	0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c, 0x45, 0x10, 0x1b, 0x12, 0x2f, 0x0a, 0x2b, 0x55, 0x4e, 0x53,
	0x55, 0x50, 0x50, 0x4f, 0x52, 0x54, 0x45, 0x44, 0x5f, 0x47, 0x4f, 0x4f, 0x47, 0x4c, 0x45, 0x5f,
	0x57, 0x45, 0x42, 0x5f, 0x44, 0x45, 0x53, 0x49, 0x47, 0x4e, 0x45, 0x52, 0x5f, 0x45, 0x4e, 0x56,
	0x49, 0x52, 0x4f, 0x4e, 0x4d, 0x45, 0x4e, 0x54, 0x10, 0x1c, 0x12, 0x1d, 0x0a, 0x19, 0x55, 0x4e,
	0x53, 0x55, 0x50, 0x50, 0x4f, 0x52, 0x54, 0x45, 0x44, 0x5f, 0x48, 0x54, 0x4d, 0x4c, 0x35, 0x5f,
	0x46, 0x45, 0x41, 0x54, 0x55, 0x52, 0x45, 0x10, 0x1d, 0x12, 0x29, 0x0a, 0x25, 0x55, 0x52, 0x4c,
	0x5f, 0x49, 0x4e, 0x5f, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c, 0x45,
	0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x53, 0x53, 0x4c, 0x5f, 0x43, 0x4f, 0x4d, 0x50, 0x4c, 0x49, 0x41,
	0x4e, 0x54, 0x10, 0x1e, 0x12, 0x1c, 0x0a, 0x18, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x46, 0x49,
	0x4c, 0x45, 0x5f, 0x4e, 0x41, 0x4d, 0x45, 0x5f, 0x54, 0x4f, 0x4f, 0x5f, 0x4c, 0x4f, 0x4e, 0x47,
	0x10, 0x1f, 0x12, 0x27, 0x0a, 0x23, 0x56, 0x49, 0x44, 0x45, 0x4f, 0x5f, 0x4d, 0x55, 0x4c, 0x54,
	0x49, 0x50, 0x4c, 0x45, 0x5f, 0x46, 0x49, 0x4c, 0x45, 0x53, 0x5f, 0x57, 0x49, 0x54, 0x48, 0x5f,
	0x53, 0x41, 0x4d, 0x45, 0x5f, 0x4e, 0x41, 0x4d, 0x45, 0x10, 0x20, 0x12, 0x25, 0x0a, 0x21, 0x56,
	0x49, 0x44, 0x45, 0x4f, 0x5f, 0x4e, 0x4f, 0x54, 0x5f, 0x41, 0x4c, 0x4c, 0x4f, 0x57, 0x45, 0x44,
	0x5f, 0x49, 0x4e, 0x5f, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x5f, 0x42, 0x55, 0x4e, 0x44, 0x4c, 0x45,
	0x10, 0x21, 0x42, 0xf0, 0x01, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x76, 0x35, 0x2e, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x73, 0x42, 0x15, 0x4d, 0x65, 0x64, 0x69, 0x61,
	0x55, 0x70, 0x6c, 0x6f, 0x61, 0x64, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x44, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e,
	0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x35, 0x2f, 0x65, 0x72, 0x72, 0x6f, 0x72,
	0x73, 0x3b, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02,
	0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x41, 0x64, 0x73, 0x2e, 0x56, 0x35, 0x2e, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x73, 0xca,
	0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x35, 0x5c, 0x45, 0x72, 0x72, 0x6f, 0x72, 0x73,
	0xea, 0x02, 0x22, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73, 0x3a, 0x3a,
	0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x35, 0x3a, 0x3a, 0x45,
	0x72, 0x72, 0x6f, 0x72, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescData = file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDesc
)

func file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescData)
	})
	return file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDescData
}

var file_google_ads_googleads_v5_errors_media_upload_error_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_google_ads_googleads_v5_errors_media_upload_error_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v5_errors_media_upload_error_proto_goTypes = []interface{}{
	(MediaUploadErrorEnum_MediaUploadError)(0), // 0: google.ads.googleads.v5.errors.MediaUploadErrorEnum.MediaUploadError
	(*MediaUploadErrorEnum)(nil),               // 1: google.ads.googleads.v5.errors.MediaUploadErrorEnum
}
var file_google_ads_googleads_v5_errors_media_upload_error_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v5_errors_media_upload_error_proto_init() }
func file_google_ads_googleads_v5_errors_media_upload_error_proto_init() {
	if File_google_ads_googleads_v5_errors_media_upload_error_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v5_errors_media_upload_error_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MediaUploadErrorEnum); i {
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
			RawDescriptor: file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v5_errors_media_upload_error_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v5_errors_media_upload_error_proto_depIdxs,
		EnumInfos:         file_google_ads_googleads_v5_errors_media_upload_error_proto_enumTypes,
		MessageInfos:      file_google_ads_googleads_v5_errors_media_upload_error_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v5_errors_media_upload_error_proto = out.File
	file_google_ads_googleads_v5_errors_media_upload_error_proto_rawDesc = nil
	file_google_ads_googleads_v5_errors_media_upload_error_proto_goTypes = nil
	file_google_ads_googleads_v5_errors_media_upload_error_proto_depIdxs = nil
}
