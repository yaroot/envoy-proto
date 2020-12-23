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
// source: google/cloud/automl/v1beta1/image.proto

package automl

import (
	proto "github.com/golang/protobuf/proto"
	_ "github.com/golang/protobuf/ptypes/timestamp"
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

// Dataset metadata that is specific to image classification.
type ImageClassificationDatasetMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required. Type of the classification problem.
	ClassificationType ClassificationType `protobuf:"varint,1,opt,name=classification_type,json=classificationType,proto3,enum=google.cloud.automl.v1beta1.ClassificationType" json:"classification_type,omitempty"`
}

func (x *ImageClassificationDatasetMetadata) Reset() {
	*x = ImageClassificationDatasetMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageClassificationDatasetMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageClassificationDatasetMetadata) ProtoMessage() {}

func (x *ImageClassificationDatasetMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageClassificationDatasetMetadata.ProtoReflect.Descriptor instead.
func (*ImageClassificationDatasetMetadata) Descriptor() ([]byte, []int) {
	return file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP(), []int{0}
}

func (x *ImageClassificationDatasetMetadata) GetClassificationType() ClassificationType {
	if x != nil {
		return x.ClassificationType
	}
	return ClassificationType_CLASSIFICATION_TYPE_UNSPECIFIED
}

// Dataset metadata specific to image object detection.
type ImageObjectDetectionDatasetMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *ImageObjectDetectionDatasetMetadata) Reset() {
	*x = ImageObjectDetectionDatasetMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageObjectDetectionDatasetMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageObjectDetectionDatasetMetadata) ProtoMessage() {}

func (x *ImageObjectDetectionDatasetMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageObjectDetectionDatasetMetadata.ProtoReflect.Descriptor instead.
func (*ImageObjectDetectionDatasetMetadata) Descriptor() ([]byte, []int) {
	return file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP(), []int{1}
}

// Model metadata for image classification.
type ImageClassificationModelMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Optional. The ID of the `base` model. If it is specified, the new model
	// will be created based on the `base` model. Otherwise, the new model will be
	// created from scratch. The `base` model must be in the same
	// `project` and `location` as the new model to create, and have the same
	// `model_type`.
	BaseModelId string `protobuf:"bytes,1,opt,name=base_model_id,json=baseModelId,proto3" json:"base_model_id,omitempty"`
	// Required. The train budget of creating this model, expressed in hours. The
	// actual `train_cost` will be equal or less than this value.
	TrainBudget int64 `protobuf:"varint,2,opt,name=train_budget,json=trainBudget,proto3" json:"train_budget,omitempty"`
	// Output only. The actual train cost of creating this model, expressed in
	// hours. If this model is created from a `base` model, the train cost used
	// to create the `base` model are not included.
	TrainCost int64 `protobuf:"varint,3,opt,name=train_cost,json=trainCost,proto3" json:"train_cost,omitempty"`
	// Output only. The reason that this create model operation stopped,
	// e.g. `BUDGET_REACHED`, `MODEL_CONVERGED`.
	StopReason string `protobuf:"bytes,5,opt,name=stop_reason,json=stopReason,proto3" json:"stop_reason,omitempty"`
	// Optional. Type of the model. The available values are:
	// *   `cloud` - Model to be used via prediction calls to AutoML API.
	//               This is the default value.
	// *   `mobile-low-latency-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile or edge device
	//               with TensorFlow afterwards. Expected to have low latency, but
	//               may have lower prediction quality than other models.
	// *   `mobile-versatile-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile or edge device
	//               with TensorFlow afterwards.
	// *   `mobile-high-accuracy-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile or edge device
	//               with TensorFlow afterwards.  Expected to have a higher
	//               latency, but should also have a higher prediction quality
	//               than other models.
	// *   `mobile-core-ml-low-latency-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile device with Core
	//               ML afterwards. Expected to have low latency, but may have
	//               lower prediction quality than other models.
	// *   `mobile-core-ml-versatile-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile device with Core
	//               ML afterwards.
	// *   `mobile-core-ml-high-accuracy-1` - A model that, in addition to
	//               providing prediction via AutoML API, can also be exported
	//               (see [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile device with
	//               Core ML afterwards.  Expected to have a higher latency, but
	//               should also have a higher prediction quality than other
	//               models.
	ModelType string `protobuf:"bytes,7,opt,name=model_type,json=modelType,proto3" json:"model_type,omitempty"`
	// Output only. An approximate number of online prediction QPS that can
	// be supported by this model per each node on which it is deployed.
	NodeQps float64 `protobuf:"fixed64,13,opt,name=node_qps,json=nodeQps,proto3" json:"node_qps,omitempty"`
	// Output only. The number of nodes this model is deployed on. A node is an
	// abstraction of a machine resource, which can handle online prediction QPS
	// as given in the node_qps field.
	NodeCount int64 `protobuf:"varint,14,opt,name=node_count,json=nodeCount,proto3" json:"node_count,omitempty"`
}

func (x *ImageClassificationModelMetadata) Reset() {
	*x = ImageClassificationModelMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageClassificationModelMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageClassificationModelMetadata) ProtoMessage() {}

func (x *ImageClassificationModelMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageClassificationModelMetadata.ProtoReflect.Descriptor instead.
func (*ImageClassificationModelMetadata) Descriptor() ([]byte, []int) {
	return file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP(), []int{2}
}

func (x *ImageClassificationModelMetadata) GetBaseModelId() string {
	if x != nil {
		return x.BaseModelId
	}
	return ""
}

func (x *ImageClassificationModelMetadata) GetTrainBudget() int64 {
	if x != nil {
		return x.TrainBudget
	}
	return 0
}

func (x *ImageClassificationModelMetadata) GetTrainCost() int64 {
	if x != nil {
		return x.TrainCost
	}
	return 0
}

func (x *ImageClassificationModelMetadata) GetStopReason() string {
	if x != nil {
		return x.StopReason
	}
	return ""
}

func (x *ImageClassificationModelMetadata) GetModelType() string {
	if x != nil {
		return x.ModelType
	}
	return ""
}

func (x *ImageClassificationModelMetadata) GetNodeQps() float64 {
	if x != nil {
		return x.NodeQps
	}
	return 0
}

func (x *ImageClassificationModelMetadata) GetNodeCount() int64 {
	if x != nil {
		return x.NodeCount
	}
	return 0
}

// Model metadata specific to image object detection.
type ImageObjectDetectionModelMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Optional. Type of the model. The available values are:
	// *   `cloud-high-accuracy-1` - (default) A model to be used via prediction
	//               calls to AutoML API. Expected to have a higher latency, but
	//               should also have a higher prediction quality than other
	//               models.
	// *   `cloud-low-latency-1` -  A model to be used via prediction
	//               calls to AutoML API. Expected to have low latency, but may
	//               have lower prediction quality than other models.
	// *   `mobile-low-latency-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile or edge device
	//               with TensorFlow afterwards. Expected to have low latency, but
	//               may have lower prediction quality than other models.
	// *   `mobile-versatile-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile or edge device
	//               with TensorFlow afterwards.
	// *   `mobile-high-accuracy-1` - A model that, in addition to providing
	//               prediction via AutoML API, can also be exported (see
	//               [AutoMl.ExportModel][google.cloud.automl.v1beta1.AutoMl.ExportModel]) and used on a mobile or edge device
	//               with TensorFlow afterwards.  Expected to have a higher
	//               latency, but should also have a higher prediction quality
	//               than other models.
	ModelType string `protobuf:"bytes,1,opt,name=model_type,json=modelType,proto3" json:"model_type,omitempty"`
	// Output only. The number of nodes this model is deployed on. A node is an
	// abstraction of a machine resource, which can handle online prediction QPS
	// as given in the qps_per_node field.
	NodeCount int64 `protobuf:"varint,3,opt,name=node_count,json=nodeCount,proto3" json:"node_count,omitempty"`
	// Output only. An approximate number of online prediction QPS that can
	// be supported by this model per each node on which it is deployed.
	NodeQps float64 `protobuf:"fixed64,4,opt,name=node_qps,json=nodeQps,proto3" json:"node_qps,omitempty"`
	// Output only. The reason that this create model operation stopped,
	// e.g. `BUDGET_REACHED`, `MODEL_CONVERGED`.
	StopReason string `protobuf:"bytes,5,opt,name=stop_reason,json=stopReason,proto3" json:"stop_reason,omitempty"`
	// The train budget of creating this model, expressed in milli node
	// hours i.e. 1,000 value in this field means 1 node hour. The actual
	// `train_cost` will be equal or less than this value. If further model
	// training ceases to provide any improvements, it will stop without using
	// full budget and the stop_reason will be `MODEL_CONVERGED`.
	// Note, node_hour  = actual_hour * number_of_nodes_invovled.
	// For model type `cloud-high-accuracy-1`(default) and `cloud-low-latency-1`,
	// the train budget must be between 20,000 and 900,000 milli node hours,
	// inclusive. The default value is 216, 000 which represents one day in
	// wall time.
	// For model type `mobile-low-latency-1`, `mobile-versatile-1`,
	// `mobile-high-accuracy-1`, `mobile-core-ml-low-latency-1`,
	// `mobile-core-ml-versatile-1`, `mobile-core-ml-high-accuracy-1`, the train
	// budget must be between 1,000 and 100,000 milli node hours, inclusive.
	// The default value is 24, 000 which represents one day in wall time.
	TrainBudgetMilliNodeHours int64 `protobuf:"varint,6,opt,name=train_budget_milli_node_hours,json=trainBudgetMilliNodeHours,proto3" json:"train_budget_milli_node_hours,omitempty"`
	// Output only. The actual train cost of creating this model, expressed in
	// milli node hours, i.e. 1,000 value in this field means 1 node hour.
	// Guaranteed to not exceed the train budget.
	TrainCostMilliNodeHours int64 `protobuf:"varint,7,opt,name=train_cost_milli_node_hours,json=trainCostMilliNodeHours,proto3" json:"train_cost_milli_node_hours,omitempty"`
}

func (x *ImageObjectDetectionModelMetadata) Reset() {
	*x = ImageObjectDetectionModelMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageObjectDetectionModelMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageObjectDetectionModelMetadata) ProtoMessage() {}

func (x *ImageObjectDetectionModelMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageObjectDetectionModelMetadata.ProtoReflect.Descriptor instead.
func (*ImageObjectDetectionModelMetadata) Descriptor() ([]byte, []int) {
	return file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP(), []int{3}
}

func (x *ImageObjectDetectionModelMetadata) GetModelType() string {
	if x != nil {
		return x.ModelType
	}
	return ""
}

func (x *ImageObjectDetectionModelMetadata) GetNodeCount() int64 {
	if x != nil {
		return x.NodeCount
	}
	return 0
}

func (x *ImageObjectDetectionModelMetadata) GetNodeQps() float64 {
	if x != nil {
		return x.NodeQps
	}
	return 0
}

func (x *ImageObjectDetectionModelMetadata) GetStopReason() string {
	if x != nil {
		return x.StopReason
	}
	return ""
}

func (x *ImageObjectDetectionModelMetadata) GetTrainBudgetMilliNodeHours() int64 {
	if x != nil {
		return x.TrainBudgetMilliNodeHours
	}
	return 0
}

func (x *ImageObjectDetectionModelMetadata) GetTrainCostMilliNodeHours() int64 {
	if x != nil {
		return x.TrainCostMilliNodeHours
	}
	return 0
}

// Model deployment metadata specific to Image Classification.
type ImageClassificationModelDeploymentMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Input only. The number of nodes to deploy the model on. A node is an
	// abstraction of a machine resource, which can handle online prediction QPS
	// as given in the model's
	//
	// [node_qps][google.cloud.automl.v1beta1.ImageClassificationModelMetadata.node_qps].
	// Must be between 1 and 100, inclusive on both ends.
	NodeCount int64 `protobuf:"varint,1,opt,name=node_count,json=nodeCount,proto3" json:"node_count,omitempty"`
}

func (x *ImageClassificationModelDeploymentMetadata) Reset() {
	*x = ImageClassificationModelDeploymentMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageClassificationModelDeploymentMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageClassificationModelDeploymentMetadata) ProtoMessage() {}

func (x *ImageClassificationModelDeploymentMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageClassificationModelDeploymentMetadata.ProtoReflect.Descriptor instead.
func (*ImageClassificationModelDeploymentMetadata) Descriptor() ([]byte, []int) {
	return file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP(), []int{4}
}

func (x *ImageClassificationModelDeploymentMetadata) GetNodeCount() int64 {
	if x != nil {
		return x.NodeCount
	}
	return 0
}

// Model deployment metadata specific to Image Object Detection.
type ImageObjectDetectionModelDeploymentMetadata struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Input only. The number of nodes to deploy the model on. A node is an
	// abstraction of a machine resource, which can handle online prediction QPS
	// as given in the model's
	//
	// [qps_per_node][google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata.qps_per_node].
	// Must be between 1 and 100, inclusive on both ends.
	NodeCount int64 `protobuf:"varint,1,opt,name=node_count,json=nodeCount,proto3" json:"node_count,omitempty"`
}

func (x *ImageObjectDetectionModelDeploymentMetadata) Reset() {
	*x = ImageObjectDetectionModelDeploymentMetadata{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageObjectDetectionModelDeploymentMetadata) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageObjectDetectionModelDeploymentMetadata) ProtoMessage() {}

func (x *ImageObjectDetectionModelDeploymentMetadata) ProtoReflect() protoreflect.Message {
	mi := &file_google_cloud_automl_v1beta1_image_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageObjectDetectionModelDeploymentMetadata.ProtoReflect.Descriptor instead.
func (*ImageObjectDetectionModelDeploymentMetadata) Descriptor() ([]byte, []int) {
	return file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP(), []int{5}
}

func (x *ImageObjectDetectionModelDeploymentMetadata) GetNodeCount() int64 {
	if x != nil {
		return x.NodeCount
	}
	return 0
}

var File_google_cloud_automl_v1beta1_image_proto protoreflect.FileDescriptor

var file_google_cloud_automl_v1beta1_image_proto_rawDesc = []byte{
	0x0a, 0x27, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x61,
	0x75, 0x74, 0x6f, 0x6d, 0x6c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x2f, 0x69, 0x6d,
	0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x6c, 0x2e, 0x76,
	0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x31, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f,
	0x61, 0x75, 0x74, 0x6f, 0x6d, 0x6c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x2f, 0x61,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x70, 0x65, 0x63, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x30, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x63, 0x6c, 0x6f,
	0x75, 0x64, 0x2f, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x6c, 0x2f, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61,
	0x31, 0x2f, 0x63, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x86, 0x01, 0x0a, 0x22, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x43,
	0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x44, 0x61, 0x74,
	0x61, 0x73, 0x65, 0x74, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x12, 0x60, 0x0a, 0x13,
	0x63, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x2f, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x6c, 0x2e,
	0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x2e, 0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x52, 0x12, 0x63, 0x6c, 0x61, 0x73,
	0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x22, 0x25,
	0x0a, 0x23, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x44, 0x65, 0x74,
	0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x4d, 0x65, 0x74,
	0x61, 0x64, 0x61, 0x74, 0x61, 0x22, 0x82, 0x02, 0x0a, 0x20, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x43,
	0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4d, 0x6f, 0x64,
	0x65, 0x6c, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x12, 0x22, 0x0a, 0x0d, 0x62, 0x61,
	0x73, 0x65, 0x5f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x62, 0x61, 0x73, 0x65, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x49, 0x64, 0x12, 0x21,
	0x0a, 0x0c, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x5f, 0x62, 0x75, 0x64, 0x67, 0x65, 0x74, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x0b, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x42, 0x75, 0x64, 0x67, 0x65,
	0x74, 0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x5f, 0x63, 0x6f, 0x73, 0x74, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x43, 0x6f, 0x73, 0x74,
	0x12, 0x1f, 0x0a, 0x0b, 0x73, 0x74, 0x6f, 0x70, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x73, 0x74, 0x6f, 0x70, 0x52, 0x65, 0x61, 0x73, 0x6f,
	0x6e, 0x12, 0x1d, 0x0a, 0x0a, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18,
	0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x19, 0x0a, 0x08, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x71, 0x70, 0x73, 0x18, 0x0d, 0x20, 0x01,
	0x28, 0x01, 0x52, 0x07, 0x6e, 0x6f, 0x64, 0x65, 0x51, 0x70, 0x73, 0x12, 0x1d, 0x0a, 0x0a, 0x6e,
	0x6f, 0x64, 0x65, 0x5f, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x09, 0x6e, 0x6f, 0x64, 0x65, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x22, 0x9d, 0x02, 0x0a, 0x21, 0x49,
	0x6d, 0x61, 0x67, 0x65, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61,
	0x12, 0x1d, 0x0a, 0x0a, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65, 0x12,
	0x1d, 0x0a, 0x0a, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x09, 0x6e, 0x6f, 0x64, 0x65, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x19,
	0x0a, 0x08, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x71, 0x70, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x01,
	0x52, 0x07, 0x6e, 0x6f, 0x64, 0x65, 0x51, 0x70, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x73, 0x74, 0x6f,
	0x70, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a,
	0x73, 0x74, 0x6f, 0x70, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x40, 0x0a, 0x1d, 0x74, 0x72,
	0x61, 0x69, 0x6e, 0x5f, 0x62, 0x75, 0x64, 0x67, 0x65, 0x74, 0x5f, 0x6d, 0x69, 0x6c, 0x6c, 0x69,
	0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x68, 0x6f, 0x75, 0x72, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x19, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x42, 0x75, 0x64, 0x67, 0x65, 0x74, 0x4d, 0x69,
	0x6c, 0x6c, 0x69, 0x4e, 0x6f, 0x64, 0x65, 0x48, 0x6f, 0x75, 0x72, 0x73, 0x12, 0x3c, 0x0a, 0x1b,
	0x74, 0x72, 0x61, 0x69, 0x6e, 0x5f, 0x63, 0x6f, 0x73, 0x74, 0x5f, 0x6d, 0x69, 0x6c, 0x6c, 0x69,
	0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x68, 0x6f, 0x75, 0x72, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x17, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x43, 0x6f, 0x73, 0x74, 0x4d, 0x69, 0x6c, 0x6c,
	0x69, 0x4e, 0x6f, 0x64, 0x65, 0x48, 0x6f, 0x75, 0x72, 0x73, 0x22, 0x4b, 0x0a, 0x2a, 0x49, 0x6d,
	0x61, 0x67, 0x65, 0x43, 0x6c, 0x61, 0x73, 0x73, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74,
	0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x12, 0x1d, 0x0a, 0x0a, 0x6e, 0x6f, 0x64, 0x65,
	0x5f, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x6e, 0x6f,
	0x64, 0x65, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x22, 0x4c, 0x0a, 0x2b, 0x49, 0x6d, 0x61, 0x67, 0x65,
	0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x4d,
	0x6f, 0x64, 0x65, 0x6c, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x4d, 0x65,
	0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x12, 0x1d, 0x0a, 0x0a, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x6e, 0x6f, 0x64, 0x65,
	0x43, 0x6f, 0x75, 0x6e, 0x74, 0x42, 0xb1, 0x01, 0x0a, 0x1f, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x61, 0x75, 0x74, 0x6f, 0x6d,
	0x6c, 0x2e, 0x76, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x42, 0x0a, 0x49, 0x6d, 0x61, 0x67, 0x65,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x41, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x63,
	0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x6c, 0x2f, 0x76, 0x31, 0x62, 0x65,
	0x74, 0x61, 0x31, 0x3b, 0x61, 0x75, 0x74, 0x6f, 0x6d, 0x6c, 0xca, 0x02, 0x1b, 0x47, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x5c, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x5c, 0x41, 0x75, 0x74, 0x6f, 0x4d, 0x6c,
	0x5c, 0x56, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0xea, 0x02, 0x1e, 0x47, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x3a, 0x3a, 0x43, 0x6c, 0x6f, 0x75, 0x64, 0x3a, 0x3a, 0x41, 0x75, 0x74, 0x6f, 0x4d, 0x4c,
	0x3a, 0x3a, 0x56, 0x31, 0x62, 0x65, 0x74, 0x61, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_google_cloud_automl_v1beta1_image_proto_rawDescOnce sync.Once
	file_google_cloud_automl_v1beta1_image_proto_rawDescData = file_google_cloud_automl_v1beta1_image_proto_rawDesc
)

func file_google_cloud_automl_v1beta1_image_proto_rawDescGZIP() []byte {
	file_google_cloud_automl_v1beta1_image_proto_rawDescOnce.Do(func() {
		file_google_cloud_automl_v1beta1_image_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_cloud_automl_v1beta1_image_proto_rawDescData)
	})
	return file_google_cloud_automl_v1beta1_image_proto_rawDescData
}

var file_google_cloud_automl_v1beta1_image_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_google_cloud_automl_v1beta1_image_proto_goTypes = []interface{}{
	(*ImageClassificationDatasetMetadata)(nil),          // 0: google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
	(*ImageObjectDetectionDatasetMetadata)(nil),         // 1: google.cloud.automl.v1beta1.ImageObjectDetectionDatasetMetadata
	(*ImageClassificationModelMetadata)(nil),            // 2: google.cloud.automl.v1beta1.ImageClassificationModelMetadata
	(*ImageObjectDetectionModelMetadata)(nil),           // 3: google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata
	(*ImageClassificationModelDeploymentMetadata)(nil),  // 4: google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadata
	(*ImageObjectDetectionModelDeploymentMetadata)(nil), // 5: google.cloud.automl.v1beta1.ImageObjectDetectionModelDeploymentMetadata
	(ClassificationType)(0),                             // 6: google.cloud.automl.v1beta1.ClassificationType
}
var file_google_cloud_automl_v1beta1_image_proto_depIdxs = []int32{
	6, // 0: google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata.classification_type:type_name -> google.cloud.automl.v1beta1.ClassificationType
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_google_cloud_automl_v1beta1_image_proto_init() }
func file_google_cloud_automl_v1beta1_image_proto_init() {
	if File_google_cloud_automl_v1beta1_image_proto != nil {
		return
	}
	file_google_cloud_automl_v1beta1_annotation_spec_proto_init()
	file_google_cloud_automl_v1beta1_classification_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_google_cloud_automl_v1beta1_image_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageClassificationDatasetMetadata); i {
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
		file_google_cloud_automl_v1beta1_image_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageObjectDetectionDatasetMetadata); i {
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
		file_google_cloud_automl_v1beta1_image_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageClassificationModelMetadata); i {
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
		file_google_cloud_automl_v1beta1_image_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageObjectDetectionModelMetadata); i {
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
		file_google_cloud_automl_v1beta1_image_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageClassificationModelDeploymentMetadata); i {
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
		file_google_cloud_automl_v1beta1_image_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageObjectDetectionModelDeploymentMetadata); i {
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
			RawDescriptor: file_google_cloud_automl_v1beta1_image_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_cloud_automl_v1beta1_image_proto_goTypes,
		DependencyIndexes: file_google_cloud_automl_v1beta1_image_proto_depIdxs,
		MessageInfos:      file_google_cloud_automl_v1beta1_image_proto_msgTypes,
	}.Build()
	File_google_cloud_automl_v1beta1_image_proto = out.File
	file_google_cloud_automl_v1beta1_image_proto_rawDesc = nil
	file_google_cloud_automl_v1beta1_image_proto_goTypes = nil
	file_google_cloud_automl_v1beta1_image_proto_depIdxs = nil
}
