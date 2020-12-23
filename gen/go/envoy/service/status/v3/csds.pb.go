// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: envoy/service/status/v3/csds.proto

package envoy_service_status_v3

import (
	v32 "envoy/admin/v3"
	v31 "envoy/config/core/v3"
	v3 "envoy/type/matcher/v3"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/golang/protobuf/ptypes/struct"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
	_ "udpa/annotations"
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

// Status of a config from a management server view.
type ConfigStatus int32

const (
	// Status info is not available/unknown.
	ConfigStatus_UNKNOWN ConfigStatus = 0
	// Management server has sent the config to client and received ACK.
	ConfigStatus_SYNCED ConfigStatus = 1
	// Config is not sent.
	ConfigStatus_NOT_SENT ConfigStatus = 2
	// Management server has sent the config to client but hasn’t received
	// ACK/NACK.
	ConfigStatus_STALE ConfigStatus = 3
	// Management server has sent the config to client but received NACK. The
	// attached config dump will be the latest config (the rejected one), since
	// it is the persisted version in the management server.
	ConfigStatus_ERROR ConfigStatus = 4
)

// Enum value maps for ConfigStatus.
var (
	ConfigStatus_name = map[int32]string{
		0: "UNKNOWN",
		1: "SYNCED",
		2: "NOT_SENT",
		3: "STALE",
		4: "ERROR",
	}
	ConfigStatus_value = map[string]int32{
		"UNKNOWN":  0,
		"SYNCED":   1,
		"NOT_SENT": 2,
		"STALE":    3,
		"ERROR":    4,
	}
)

func (x ConfigStatus) Enum() *ConfigStatus {
	p := new(ConfigStatus)
	*p = x
	return p
}

func (x ConfigStatus) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ConfigStatus) Descriptor() protoreflect.EnumDescriptor {
	return file_envoy_service_status_v3_csds_proto_enumTypes[0].Descriptor()
}

func (ConfigStatus) Type() protoreflect.EnumType {
	return &file_envoy_service_status_v3_csds_proto_enumTypes[0]
}

func (x ConfigStatus) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ConfigStatus.Descriptor instead.
func (ConfigStatus) EnumDescriptor() ([]byte, []int) {
	return file_envoy_service_status_v3_csds_proto_rawDescGZIP(), []int{0}
}

// Config status from a client-side view.
type ClientConfigStatus int32

const (
	// Config status is not available/unknown.
	ClientConfigStatus_CLIENT_UNKNOWN ClientConfigStatus = 0
	// Client requested the config but hasn't received any config from management
	// server yet.
	ClientConfigStatus_CLIENT_REQUESTED ClientConfigStatus = 1
	// Client received the config and replied with ACK.
	ClientConfigStatus_CLIENT_ACKED ClientConfigStatus = 2
	// Client received the config and replied with NACK. Notably, the attached
	// config dump is not the NACKed version, but the most recent accepted one. If
	// no config is accepted yet, the attached config dump will be empty.
	ClientConfigStatus_CLIENT_NACKED ClientConfigStatus = 3
)

// Enum value maps for ClientConfigStatus.
var (
	ClientConfigStatus_name = map[int32]string{
		0: "CLIENT_UNKNOWN",
		1: "CLIENT_REQUESTED",
		2: "CLIENT_ACKED",
		3: "CLIENT_NACKED",
	}
	ClientConfigStatus_value = map[string]int32{
		"CLIENT_UNKNOWN":   0,
		"CLIENT_REQUESTED": 1,
		"CLIENT_ACKED":     2,
		"CLIENT_NACKED":    3,
	}
)

func (x ClientConfigStatus) Enum() *ClientConfigStatus {
	p := new(ClientConfigStatus)
	*p = x
	return p
}

func (x ClientConfigStatus) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ClientConfigStatus) Descriptor() protoreflect.EnumDescriptor {
	return file_envoy_service_status_v3_csds_proto_enumTypes[1].Descriptor()
}

func (ClientConfigStatus) Type() protoreflect.EnumType {
	return &file_envoy_service_status_v3_csds_proto_enumTypes[1]
}

func (x ClientConfigStatus) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ClientConfigStatus.Descriptor instead.
func (ClientConfigStatus) EnumDescriptor() ([]byte, []int) {
	return file_envoy_service_status_v3_csds_proto_rawDescGZIP(), []int{1}
}

// Request for client status of clients identified by a list of NodeMatchers.
type ClientStatusRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Management server can use these match criteria to identify clients.
	// The match follows OR semantics.
	NodeMatchers []*v3.NodeMatcher `protobuf:"bytes,1,rep,name=node_matchers,json=nodeMatchers,proto3" json:"node_matchers,omitempty"`
	// The node making the csds request.
	Node *v31.Node `protobuf:"bytes,2,opt,name=node,proto3" json:"node,omitempty"`
}

func (x *ClientStatusRequest) Reset() {
	*x = ClientStatusRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_envoy_service_status_v3_csds_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClientStatusRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClientStatusRequest) ProtoMessage() {}

func (x *ClientStatusRequest) ProtoReflect() protoreflect.Message {
	mi := &file_envoy_service_status_v3_csds_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClientStatusRequest.ProtoReflect.Descriptor instead.
func (*ClientStatusRequest) Descriptor() ([]byte, []int) {
	return file_envoy_service_status_v3_csds_proto_rawDescGZIP(), []int{0}
}

func (x *ClientStatusRequest) GetNodeMatchers() []*v3.NodeMatcher {
	if x != nil {
		return x.NodeMatchers
	}
	return nil
}

func (x *ClientStatusRequest) GetNode() *v31.Node {
	if x != nil {
		return x.Node
	}
	return nil
}

// Detailed config (per xDS) with status.
// [#next-free-field: 8]
type PerXdsConfig struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Config status generated by management servers. Will not be present if the
	// CSDS server is an xDS client.
	Status ConfigStatus `protobuf:"varint,1,opt,name=status,proto3,enum=envoy.service.status.v3.ConfigStatus" json:"status,omitempty"`
	// Client config status is populated by xDS clients. Will not be present if
	// the CSDS server is an xDS server. No matter what the client config status
	// is, xDS clients should always dump the most recent accepted xDS config.
	ClientStatus ClientConfigStatus `protobuf:"varint,7,opt,name=client_status,json=clientStatus,proto3,enum=envoy.service.status.v3.ClientConfigStatus" json:"client_status,omitempty"`
	// Types that are assignable to PerXdsConfig:
	//	*PerXdsConfig_ListenerConfig
	//	*PerXdsConfig_ClusterConfig
	//	*PerXdsConfig_RouteConfig
	//	*PerXdsConfig_ScopedRouteConfig
	//	*PerXdsConfig_EndpointConfig
	PerXdsConfig isPerXdsConfig_PerXdsConfig `protobuf_oneof:"per_xds_config"`
}

func (x *PerXdsConfig) Reset() {
	*x = PerXdsConfig{}
	if protoimpl.UnsafeEnabled {
		mi := &file_envoy_service_status_v3_csds_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PerXdsConfig) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PerXdsConfig) ProtoMessage() {}

func (x *PerXdsConfig) ProtoReflect() protoreflect.Message {
	mi := &file_envoy_service_status_v3_csds_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PerXdsConfig.ProtoReflect.Descriptor instead.
func (*PerXdsConfig) Descriptor() ([]byte, []int) {
	return file_envoy_service_status_v3_csds_proto_rawDescGZIP(), []int{1}
}

func (x *PerXdsConfig) GetStatus() ConfigStatus {
	if x != nil {
		return x.Status
	}
	return ConfigStatus_UNKNOWN
}

func (x *PerXdsConfig) GetClientStatus() ClientConfigStatus {
	if x != nil {
		return x.ClientStatus
	}
	return ClientConfigStatus_CLIENT_UNKNOWN
}

func (m *PerXdsConfig) GetPerXdsConfig() isPerXdsConfig_PerXdsConfig {
	if m != nil {
		return m.PerXdsConfig
	}
	return nil
}

func (x *PerXdsConfig) GetListenerConfig() *v32.ListenersConfigDump {
	if x, ok := x.GetPerXdsConfig().(*PerXdsConfig_ListenerConfig); ok {
		return x.ListenerConfig
	}
	return nil
}

func (x *PerXdsConfig) GetClusterConfig() *v32.ClustersConfigDump {
	if x, ok := x.GetPerXdsConfig().(*PerXdsConfig_ClusterConfig); ok {
		return x.ClusterConfig
	}
	return nil
}

func (x *PerXdsConfig) GetRouteConfig() *v32.RoutesConfigDump {
	if x, ok := x.GetPerXdsConfig().(*PerXdsConfig_RouteConfig); ok {
		return x.RouteConfig
	}
	return nil
}

func (x *PerXdsConfig) GetScopedRouteConfig() *v32.ScopedRoutesConfigDump {
	if x, ok := x.GetPerXdsConfig().(*PerXdsConfig_ScopedRouteConfig); ok {
		return x.ScopedRouteConfig
	}
	return nil
}

func (x *PerXdsConfig) GetEndpointConfig() *v32.EndpointsConfigDump {
	if x, ok := x.GetPerXdsConfig().(*PerXdsConfig_EndpointConfig); ok {
		return x.EndpointConfig
	}
	return nil
}

type isPerXdsConfig_PerXdsConfig interface {
	isPerXdsConfig_PerXdsConfig()
}

type PerXdsConfig_ListenerConfig struct {
	ListenerConfig *v32.ListenersConfigDump `protobuf:"bytes,2,opt,name=listener_config,json=listenerConfig,proto3,oneof"`
}

type PerXdsConfig_ClusterConfig struct {
	ClusterConfig *v32.ClustersConfigDump `protobuf:"bytes,3,opt,name=cluster_config,json=clusterConfig,proto3,oneof"`
}

type PerXdsConfig_RouteConfig struct {
	RouteConfig *v32.RoutesConfigDump `protobuf:"bytes,4,opt,name=route_config,json=routeConfig,proto3,oneof"`
}

type PerXdsConfig_ScopedRouteConfig struct {
	ScopedRouteConfig *v32.ScopedRoutesConfigDump `protobuf:"bytes,5,opt,name=scoped_route_config,json=scopedRouteConfig,proto3,oneof"`
}

type PerXdsConfig_EndpointConfig struct {
	EndpointConfig *v32.EndpointsConfigDump `protobuf:"bytes,6,opt,name=endpoint_config,json=endpointConfig,proto3,oneof"`
}

func (*PerXdsConfig_ListenerConfig) isPerXdsConfig_PerXdsConfig() {}

func (*PerXdsConfig_ClusterConfig) isPerXdsConfig_PerXdsConfig() {}

func (*PerXdsConfig_RouteConfig) isPerXdsConfig_PerXdsConfig() {}

func (*PerXdsConfig_ScopedRouteConfig) isPerXdsConfig_PerXdsConfig() {}

func (*PerXdsConfig_EndpointConfig) isPerXdsConfig_PerXdsConfig() {}

// All xds configs for a particular client.
type ClientConfig struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Node for a particular client.
	Node      *v31.Node       `protobuf:"bytes,1,opt,name=node,proto3" json:"node,omitempty"`
	XdsConfig []*PerXdsConfig `protobuf:"bytes,2,rep,name=xds_config,json=xdsConfig,proto3" json:"xds_config,omitempty"`
}

func (x *ClientConfig) Reset() {
	*x = ClientConfig{}
	if protoimpl.UnsafeEnabled {
		mi := &file_envoy_service_status_v3_csds_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClientConfig) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClientConfig) ProtoMessage() {}

func (x *ClientConfig) ProtoReflect() protoreflect.Message {
	mi := &file_envoy_service_status_v3_csds_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClientConfig.ProtoReflect.Descriptor instead.
func (*ClientConfig) Descriptor() ([]byte, []int) {
	return file_envoy_service_status_v3_csds_proto_rawDescGZIP(), []int{2}
}

func (x *ClientConfig) GetNode() *v31.Node {
	if x != nil {
		return x.Node
	}
	return nil
}

func (x *ClientConfig) GetXdsConfig() []*PerXdsConfig {
	if x != nil {
		return x.XdsConfig
	}
	return nil
}

type ClientStatusResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Client configs for the clients specified in the ClientStatusRequest.
	Config []*ClientConfig `protobuf:"bytes,1,rep,name=config,proto3" json:"config,omitempty"`
}

func (x *ClientStatusResponse) Reset() {
	*x = ClientStatusResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_envoy_service_status_v3_csds_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClientStatusResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClientStatusResponse) ProtoMessage() {}

func (x *ClientStatusResponse) ProtoReflect() protoreflect.Message {
	mi := &file_envoy_service_status_v3_csds_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClientStatusResponse.ProtoReflect.Descriptor instead.
func (*ClientStatusResponse) Descriptor() ([]byte, []int) {
	return file_envoy_service_status_v3_csds_proto_rawDescGZIP(), []int{3}
}

func (x *ClientStatusResponse) GetConfig() []*ClientConfig {
	if x != nil {
		return x.Config
	}
	return nil
}

var File_envoy_service_status_v3_csds_proto protoreflect.FileDescriptor

var file_envoy_service_status_v3_csds_proto_rawDesc = []byte{
	0x0a, 0x22, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2f, 0x76, 0x33, 0x2f, 0x63, 0x73, 0x64, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x17, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x1a, 0x20, 0x65,
	0x6e, 0x76, 0x6f, 0x79, 0x2f, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2f, 0x76, 0x33, 0x2f, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x5f, 0x64, 0x75, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1f, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x63, 0x6f,
	0x72, 0x65, 0x2f, 0x76, 0x33, 0x2f, 0x62, 0x61, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x20, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d, 0x61, 0x74,
	0x63, 0x68, 0x65, 0x72, 0x2f, 0x76, 0x33, 0x2f, 0x6e, 0x6f, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2f, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e,
	0x75, 0x64, 0x70, 0x61, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x2f, 0x6d, 0x69, 0x67, 0x72, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1d,
	0x75, 0x64, 0x70, 0x61, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x21, 0x75,
	0x64, 0x70, 0x61, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f,
	0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x69, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xc2, 0x01, 0x0a, 0x13, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x47, 0x0a, 0x0d, 0x6e, 0x6f, 0x64, 0x65,
	0x5f, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x22, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x6d, 0x61, 0x74,
	0x63, 0x68, 0x65, 0x72, 0x2e, 0x76, 0x33, 0x2e, 0x4e, 0x6f, 0x64, 0x65, 0x4d, 0x61, 0x74, 0x63,
	0x68, 0x65, 0x72, 0x52, 0x0c, 0x6e, 0x6f, 0x64, 0x65, 0x4d, 0x61, 0x74, 0x63, 0x68, 0x65, 0x72,
	0x73, 0x12, 0x2e, 0x0a, 0x04, 0x6e, 0x6f, 0x64, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1a, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e, 0x63,
	0x6f, 0x72, 0x65, 0x2e, 0x76, 0x33, 0x2e, 0x4e, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x6e, 0x6f, 0x64,
	0x65, 0x3a, 0x32, 0x9a, 0xc5, 0x88, 0x1e, 0x2d, 0x0a, 0x2b, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76,
	0x32, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x9a, 0x05, 0x0a, 0x0c, 0x50, 0x65, 0x72, 0x58, 0x64, 0x73,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x54, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x25, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33,
	0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x15, 0xf2,
	0x98, 0xfe, 0x8f, 0x05, 0x0f, 0x12, 0x0d, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x5f, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x67, 0x0a, 0x0d,
	0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x2b, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x43, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x42, 0x15, 0xf2, 0x98, 0xfe, 0x8f, 0x05, 0x0f, 0x12, 0x0d, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x52, 0x0c, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x4e, 0x0a, 0x0f, 0x6c, 0x69, 0x73, 0x74, 0x65, 0x6e, 0x65,
	0x72, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23,
	0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x33, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x65, 0x6e, 0x65, 0x72, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x44,
	0x75, 0x6d, 0x70, 0x48, 0x00, 0x52, 0x0e, 0x6c, 0x69, 0x73, 0x74, 0x65, 0x6e, 0x65, 0x72, 0x43,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x4b, 0x0a, 0x0e, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72,
	0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x22, 0x2e,
	0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x33, 0x2e, 0x43,
	0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x44, 0x75, 0x6d,
	0x70, 0x48, 0x00, 0x52, 0x0d, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x43, 0x6f, 0x6e, 0x66,
	0x69, 0x67, 0x12, 0x45, 0x0a, 0x0c, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x6e, 0x66,
	0x69, 0x67, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79,
	0x2e, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x33, 0x2e, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x73,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x44, 0x75, 0x6d, 0x70, 0x48, 0x00, 0x52, 0x0b, 0x72, 0x6f,
	0x75, 0x74, 0x65, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x58, 0x0a, 0x13, 0x73, 0x63, 0x6f,
	0x70, 0x65, 0x64, 0x5f, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x61,
	0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x33, 0x2e, 0x53, 0x63, 0x6f, 0x70, 0x65, 0x64, 0x52, 0x6f,
	0x75, 0x74, 0x65, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x44, 0x75, 0x6d, 0x70, 0x48, 0x00,
	0x52, 0x11, 0x73, 0x63, 0x6f, 0x70, 0x65, 0x64, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x43, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x12, 0x4e, 0x0a, 0x0f, 0x65, 0x6e, 0x64, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x5f,
	0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x65,
	0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x2e, 0x76, 0x33, 0x2e, 0x45, 0x6e,
	0x64, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x44, 0x75, 0x6d,
	0x70, 0x48, 0x00, 0x52, 0x0e, 0x65, 0x6e, 0x64, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x43, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x3a, 0x2b, 0x9a, 0xc5, 0x88, 0x1e, 0x26, 0x0a, 0x24, 0x65, 0x6e, 0x76, 0x6f,
	0x79, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x2e, 0x76, 0x32, 0x2e, 0x50, 0x65, 0x72, 0x58, 0x64, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x42, 0x10, 0x0a, 0x0e, 0x70, 0x65, 0x72, 0x5f, 0x78, 0x64, 0x73, 0x5f, 0x63, 0x6f, 0x6e, 0x66,
	0x69, 0x67, 0x22, 0xb1, 0x01, 0x0a, 0x0c, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x43, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x12, 0x2e, 0x0a, 0x04, 0x6e, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x1a, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x33, 0x2e, 0x4e, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x6e,
	0x6f, 0x64, 0x65, 0x12, 0x44, 0x0a, 0x0a, 0x78, 0x64, 0x73, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76,
	0x33, 0x2e, 0x50, 0x65, 0x72, 0x58, 0x64, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x52, 0x09,
	0x78, 0x64, 0x73, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3a, 0x2b, 0x9a, 0xc5, 0x88, 0x1e, 0x26,
	0x0a, 0x24, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x22, 0x8a, 0x01, 0x0a, 0x14, 0x43, 0x6c, 0x69, 0x65, 0x6e,
	0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x3d, 0x0a, 0x06, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x25, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x52, 0x06, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3a, 0x33,
	0x9a, 0xc5, 0x88, 0x1e, 0x2e, 0x0a, 0x2c, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x32, 0x2e, 0x43,
	0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x2a, 0x4b, 0x0a, 0x0c, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e, 0x10, 0x00,
	0x12, 0x0a, 0x0a, 0x06, 0x53, 0x59, 0x4e, 0x43, 0x45, 0x44, 0x10, 0x01, 0x12, 0x0c, 0x0a, 0x08,
	0x4e, 0x4f, 0x54, 0x5f, 0x53, 0x45, 0x4e, 0x54, 0x10, 0x02, 0x12, 0x09, 0x0a, 0x05, 0x53, 0x54,
	0x41, 0x4c, 0x45, 0x10, 0x03, 0x12, 0x09, 0x0a, 0x05, 0x45, 0x52, 0x52, 0x4f, 0x52, 0x10, 0x04,
	0x2a, 0x63, 0x0a, 0x12, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x12, 0x0a, 0x0e, 0x43, 0x4c, 0x49, 0x45, 0x4e, 0x54,
	0x5f, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e, 0x10, 0x00, 0x12, 0x14, 0x0a, 0x10, 0x43, 0x4c,
	0x49, 0x45, 0x4e, 0x54, 0x5f, 0x52, 0x45, 0x51, 0x55, 0x45, 0x53, 0x54, 0x45, 0x44, 0x10, 0x01,
	0x12, 0x10, 0x0a, 0x0c, 0x43, 0x4c, 0x49, 0x45, 0x4e, 0x54, 0x5f, 0x41, 0x43, 0x4b, 0x45, 0x44,
	0x10, 0x02, 0x12, 0x11, 0x0a, 0x0d, 0x43, 0x4c, 0x49, 0x45, 0x4e, 0x54, 0x5f, 0x4e, 0x41, 0x43,
	0x4b, 0x45, 0x44, 0x10, 0x03, 0x32, 0xb8, 0x02, 0x0a, 0x1c, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74,
	0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x44, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x77, 0x0a, 0x12, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x2c, 0x2e, 0x65,
	0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2d, 0x2e, 0x65, 0x6e, 0x76,
	0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x2e, 0x76, 0x33, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x28, 0x01, 0x30, 0x01, 0x12,
	0x9e, 0x01, 0x0a, 0x11, 0x46, 0x65, 0x74, 0x63, 0x68, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x2c, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x2e,
	0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x2d, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2e, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x2e, 0x43, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x22, 0x2c, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1d, 0x22, 0x1b, 0x2f, 0x76, 0x33, 0x2f,
	0x64, 0x69, 0x73, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x79, 0x3a, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74,
	0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x03, 0x3a, 0x01, 0x2a,
	0x42, 0x3f, 0x0a, 0x25, 0x69, 0x6f, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x70, 0x72, 0x6f, 0x78,
	0x79, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x76, 0x33, 0x42, 0x09, 0x43, 0x73, 0x64, 0x73, 0x50,
	0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x88, 0x01, 0x01, 0xba, 0x80, 0xc8, 0xd1, 0x06, 0x02, 0x10,
	0x02, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_envoy_service_status_v3_csds_proto_rawDescOnce sync.Once
	file_envoy_service_status_v3_csds_proto_rawDescData = file_envoy_service_status_v3_csds_proto_rawDesc
)

func file_envoy_service_status_v3_csds_proto_rawDescGZIP() []byte {
	file_envoy_service_status_v3_csds_proto_rawDescOnce.Do(func() {
		file_envoy_service_status_v3_csds_proto_rawDescData = protoimpl.X.CompressGZIP(file_envoy_service_status_v3_csds_proto_rawDescData)
	})
	return file_envoy_service_status_v3_csds_proto_rawDescData
}

var file_envoy_service_status_v3_csds_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_envoy_service_status_v3_csds_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_envoy_service_status_v3_csds_proto_goTypes = []interface{}{
	(ConfigStatus)(0),                  // 0: envoy.service.status.v3.ConfigStatus
	(ClientConfigStatus)(0),            // 1: envoy.service.status.v3.ClientConfigStatus
	(*ClientStatusRequest)(nil),        // 2: envoy.service.status.v3.ClientStatusRequest
	(*PerXdsConfig)(nil),               // 3: envoy.service.status.v3.PerXdsConfig
	(*ClientConfig)(nil),               // 4: envoy.service.status.v3.ClientConfig
	(*ClientStatusResponse)(nil),       // 5: envoy.service.status.v3.ClientStatusResponse
	(*v3.NodeMatcher)(nil),             // 6: envoy.type.matcher.v3.NodeMatcher
	(*v31.Node)(nil),                   // 7: envoy.config.core.v3.Node
	(*v32.ListenersConfigDump)(nil),    // 8: envoy.admin.v3.ListenersConfigDump
	(*v32.ClustersConfigDump)(nil),     // 9: envoy.admin.v3.ClustersConfigDump
	(*v32.RoutesConfigDump)(nil),       // 10: envoy.admin.v3.RoutesConfigDump
	(*v32.ScopedRoutesConfigDump)(nil), // 11: envoy.admin.v3.ScopedRoutesConfigDump
	(*v32.EndpointsConfigDump)(nil),    // 12: envoy.admin.v3.EndpointsConfigDump
}
var file_envoy_service_status_v3_csds_proto_depIdxs = []int32{
	6,  // 0: envoy.service.status.v3.ClientStatusRequest.node_matchers:type_name -> envoy.type.matcher.v3.NodeMatcher
	7,  // 1: envoy.service.status.v3.ClientStatusRequest.node:type_name -> envoy.config.core.v3.Node
	0,  // 2: envoy.service.status.v3.PerXdsConfig.status:type_name -> envoy.service.status.v3.ConfigStatus
	1,  // 3: envoy.service.status.v3.PerXdsConfig.client_status:type_name -> envoy.service.status.v3.ClientConfigStatus
	8,  // 4: envoy.service.status.v3.PerXdsConfig.listener_config:type_name -> envoy.admin.v3.ListenersConfigDump
	9,  // 5: envoy.service.status.v3.PerXdsConfig.cluster_config:type_name -> envoy.admin.v3.ClustersConfigDump
	10, // 6: envoy.service.status.v3.PerXdsConfig.route_config:type_name -> envoy.admin.v3.RoutesConfigDump
	11, // 7: envoy.service.status.v3.PerXdsConfig.scoped_route_config:type_name -> envoy.admin.v3.ScopedRoutesConfigDump
	12, // 8: envoy.service.status.v3.PerXdsConfig.endpoint_config:type_name -> envoy.admin.v3.EndpointsConfigDump
	7,  // 9: envoy.service.status.v3.ClientConfig.node:type_name -> envoy.config.core.v3.Node
	3,  // 10: envoy.service.status.v3.ClientConfig.xds_config:type_name -> envoy.service.status.v3.PerXdsConfig
	4,  // 11: envoy.service.status.v3.ClientStatusResponse.config:type_name -> envoy.service.status.v3.ClientConfig
	2,  // 12: envoy.service.status.v3.ClientStatusDiscoveryService.StreamClientStatus:input_type -> envoy.service.status.v3.ClientStatusRequest
	2,  // 13: envoy.service.status.v3.ClientStatusDiscoveryService.FetchClientStatus:input_type -> envoy.service.status.v3.ClientStatusRequest
	5,  // 14: envoy.service.status.v3.ClientStatusDiscoveryService.StreamClientStatus:output_type -> envoy.service.status.v3.ClientStatusResponse
	5,  // 15: envoy.service.status.v3.ClientStatusDiscoveryService.FetchClientStatus:output_type -> envoy.service.status.v3.ClientStatusResponse
	14, // [14:16] is the sub-list for method output_type
	12, // [12:14] is the sub-list for method input_type
	12, // [12:12] is the sub-list for extension type_name
	12, // [12:12] is the sub-list for extension extendee
	0,  // [0:12] is the sub-list for field type_name
}

func init() { file_envoy_service_status_v3_csds_proto_init() }
func file_envoy_service_status_v3_csds_proto_init() {
	if File_envoy_service_status_v3_csds_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_envoy_service_status_v3_csds_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClientStatusRequest); i {
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
		file_envoy_service_status_v3_csds_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PerXdsConfig); i {
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
		file_envoy_service_status_v3_csds_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClientConfig); i {
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
		file_envoy_service_status_v3_csds_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClientStatusResponse); i {
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
	file_envoy_service_status_v3_csds_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*PerXdsConfig_ListenerConfig)(nil),
		(*PerXdsConfig_ClusterConfig)(nil),
		(*PerXdsConfig_RouteConfig)(nil),
		(*PerXdsConfig_ScopedRouteConfig)(nil),
		(*PerXdsConfig_EndpointConfig)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_envoy_service_status_v3_csds_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_envoy_service_status_v3_csds_proto_goTypes,
		DependencyIndexes: file_envoy_service_status_v3_csds_proto_depIdxs,
		EnumInfos:         file_envoy_service_status_v3_csds_proto_enumTypes,
		MessageInfos:      file_envoy_service_status_v3_csds_proto_msgTypes,
	}.Build()
	File_envoy_service_status_v3_csds_proto = out.File
	file_envoy_service_status_v3_csds_proto_rawDesc = nil
	file_envoy_service_status_v3_csds_proto_goTypes = nil
	file_envoy_service_status_v3_csds_proto_depIdxs = nil
}
