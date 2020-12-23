// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: envoy/config/core/v3/extension.proto

package envoy_config_core_v3

import (
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	proto "github.com/golang/protobuf/proto"
	any "github.com/golang/protobuf/ptypes/any"
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

// Message type for extension configuration.
// [#next-major-version: revisit all existing typed_config that doesn't use this wrapper.].
type TypedExtensionConfig struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The name of an extension. This is not used to select the extension, instead
	// it serves the role of an opaque identifier.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// The typed config for the extension. The type URL will be used to identify
	// the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
	// the inner type URL of *TypedStruct* will be utilized. See the
	// :ref:`extension configuration overview
	// <config_overview_extension_configuration>` for further details.
	TypedConfig *any.Any `protobuf:"bytes,2,opt,name=typed_config,json=typedConfig,proto3" json:"typed_config,omitempty"`
}

func (x *TypedExtensionConfig) Reset() {
	*x = TypedExtensionConfig{}
	if protoimpl.UnsafeEnabled {
		mi := &file_envoy_config_core_v3_extension_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TypedExtensionConfig) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TypedExtensionConfig) ProtoMessage() {}

func (x *TypedExtensionConfig) ProtoReflect() protoreflect.Message {
	mi := &file_envoy_config_core_v3_extension_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TypedExtensionConfig.ProtoReflect.Descriptor instead.
func (*TypedExtensionConfig) Descriptor() ([]byte, []int) {
	return file_envoy_config_core_v3_extension_proto_rawDescGZIP(), []int{0}
}

func (x *TypedExtensionConfig) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *TypedExtensionConfig) GetTypedConfig() *any.Any {
	if x != nil {
		return x.TypedConfig
	}
	return nil
}

// Configuration source specifier for a late-bound extension configuration. The
// parent resource is warmed until all the initial extension configurations are
// received, unless the flag to apply the default configuration is set.
// Subsequent extension updates are atomic on a per-worker basis. Once an
// extension configuration is applied to a request or a connection, it remains
// constant for the duration of processing. If the initial delivery of the
// extension configuration fails, due to a timeout for example, the optional
// default configuration is applied. Without a default configuration, the
// extension is disabled, until an extension configuration is received. The
// behavior of a disabled extension depends on the context. For example, a
// filter chain with a disabled extension filter rejects all incoming streams.
type ExtensionConfigSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ConfigSource *ConfigSource `protobuf:"bytes,1,opt,name=config_source,json=configSource,proto3" json:"config_source,omitempty"`
	// Optional default configuration to use as the initial configuration if
	// there is a failure to receive the initial extension configuration or if
	// `apply_default_config_without_warming` flag is set.
	DefaultConfig *any.Any `protobuf:"bytes,2,opt,name=default_config,json=defaultConfig,proto3" json:"default_config,omitempty"`
	// Use the default config as the initial configuration without warming and
	// waiting for the first discovery response. Requires the default configuration
	// to be supplied.
	ApplyDefaultConfigWithoutWarming bool `protobuf:"varint,3,opt,name=apply_default_config_without_warming,json=applyDefaultConfigWithoutWarming,proto3" json:"apply_default_config_without_warming,omitempty"`
	// A set of permitted extension type URLs. Extension configuration updates are rejected
	// if they do not match any type URL in the set.
	TypeUrls []string `protobuf:"bytes,4,rep,name=type_urls,json=typeUrls,proto3" json:"type_urls,omitempty"`
}

func (x *ExtensionConfigSource) Reset() {
	*x = ExtensionConfigSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_envoy_config_core_v3_extension_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ExtensionConfigSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ExtensionConfigSource) ProtoMessage() {}

func (x *ExtensionConfigSource) ProtoReflect() protoreflect.Message {
	mi := &file_envoy_config_core_v3_extension_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ExtensionConfigSource.ProtoReflect.Descriptor instead.
func (*ExtensionConfigSource) Descriptor() ([]byte, []int) {
	return file_envoy_config_core_v3_extension_proto_rawDescGZIP(), []int{1}
}

func (x *ExtensionConfigSource) GetConfigSource() *ConfigSource {
	if x != nil {
		return x.ConfigSource
	}
	return nil
}

func (x *ExtensionConfigSource) GetDefaultConfig() *any.Any {
	if x != nil {
		return x.DefaultConfig
	}
	return nil
}

func (x *ExtensionConfigSource) GetApplyDefaultConfigWithoutWarming() bool {
	if x != nil {
		return x.ApplyDefaultConfigWithoutWarming
	}
	return false
}

func (x *ExtensionConfigSource) GetTypeUrls() []string {
	if x != nil {
		return x.TypeUrls
	}
	return nil
}

var File_envoy_config_core_v3_extension_proto protoreflect.FileDescriptor

var file_envoy_config_core_v3_extension_proto_rawDesc = []byte{
	0x0a, 0x24, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x63,
	0x6f, 0x72, 0x65, 0x2f, 0x76, 0x33, 0x2f, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x14, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x67, 0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x33, 0x1a, 0x28, 0x65, 0x6e,
	0x76, 0x6f, 0x79, 0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x63, 0x6f, 0x72, 0x65, 0x2f,
	0x76, 0x33, 0x2f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x5f, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x61, 0x6e, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1d, 0x75, 0x64, 0x70, 0x61, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x76, 0x0a, 0x14, 0x54, 0x79, 0x70,
	0x65, 0x64, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x12, 0x1b, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x07, 0xfa, 0x42, 0x04, 0x72, 0x02, 0x10, 0x01, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x41,
	0x0a, 0x0c, 0x74, 0x79, 0x70, 0x65, 0x64, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x41, 0x6e, 0x79, 0x42, 0x08, 0xfa, 0x42, 0x05, 0xa2,
	0x01, 0x02, 0x08, 0x01, 0x52, 0x0b, 0x74, 0x79, 0x70, 0x65, 0x64, 0x43, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x22, 0x9e, 0x02, 0x0a, 0x15, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x43,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x51, 0x0a, 0x0d, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x5f, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x22, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69,
	0x67, 0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x33, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0x08, 0xfa, 0x42, 0x05, 0xa2, 0x01, 0x02, 0x08, 0x01,
	0x52, 0x0c, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x3b,
	0x0a, 0x0e, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x41, 0x6e, 0x79, 0x52, 0x0d, 0x64, 0x65,
	0x66, 0x61, 0x75, 0x6c, 0x74, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x4e, 0x0a, 0x24, 0x61,
	0x70, 0x70, 0x6c, 0x79, 0x5f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x5f, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x5f, 0x77, 0x69, 0x74, 0x68, 0x6f, 0x75, 0x74, 0x5f, 0x77, 0x61, 0x72, 0x6d,
	0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x20, 0x61, 0x70, 0x70, 0x6c, 0x79,
	0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x57, 0x69, 0x74,
	0x68, 0x6f, 0x75, 0x74, 0x57, 0x61, 0x72, 0x6d, 0x69, 0x6e, 0x67, 0x12, 0x25, 0x0a, 0x09, 0x74,
	0x79, 0x70, 0x65, 0x5f, 0x75, 0x72, 0x6c, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x09, 0x42, 0x08,
	0xfa, 0x42, 0x05, 0x92, 0x01, 0x02, 0x08, 0x01, 0x52, 0x08, 0x74, 0x79, 0x70, 0x65, 0x55, 0x72,
	0x6c, 0x73, 0x42, 0x3e, 0x0a, 0x22, 0x69, 0x6f, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x70, 0x72,
	0x6f, 0x78, 0x79, 0x2e, 0x65, 0x6e, 0x76, 0x6f, 0x79, 0x2e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x76, 0x33, 0x42, 0x0e, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73,
	0x69, 0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0xba, 0x80, 0xc8, 0xd1, 0x06, 0x02,
	0x10, 0x02, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_envoy_config_core_v3_extension_proto_rawDescOnce sync.Once
	file_envoy_config_core_v3_extension_proto_rawDescData = file_envoy_config_core_v3_extension_proto_rawDesc
)

func file_envoy_config_core_v3_extension_proto_rawDescGZIP() []byte {
	file_envoy_config_core_v3_extension_proto_rawDescOnce.Do(func() {
		file_envoy_config_core_v3_extension_proto_rawDescData = protoimpl.X.CompressGZIP(file_envoy_config_core_v3_extension_proto_rawDescData)
	})
	return file_envoy_config_core_v3_extension_proto_rawDescData
}

var file_envoy_config_core_v3_extension_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_envoy_config_core_v3_extension_proto_goTypes = []interface{}{
	(*TypedExtensionConfig)(nil),  // 0: envoy.config.core.v3.TypedExtensionConfig
	(*ExtensionConfigSource)(nil), // 1: envoy.config.core.v3.ExtensionConfigSource
	(*any.Any)(nil),               // 2: google.protobuf.Any
	(*ConfigSource)(nil),          // 3: envoy.config.core.v3.ConfigSource
}
var file_envoy_config_core_v3_extension_proto_depIdxs = []int32{
	2, // 0: envoy.config.core.v3.TypedExtensionConfig.typed_config:type_name -> google.protobuf.Any
	3, // 1: envoy.config.core.v3.ExtensionConfigSource.config_source:type_name -> envoy.config.core.v3.ConfigSource
	2, // 2: envoy.config.core.v3.ExtensionConfigSource.default_config:type_name -> google.protobuf.Any
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_envoy_config_core_v3_extension_proto_init() }
func file_envoy_config_core_v3_extension_proto_init() {
	if File_envoy_config_core_v3_extension_proto != nil {
		return
	}
	file_envoy_config_core_v3_config_source_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_envoy_config_core_v3_extension_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TypedExtensionConfig); i {
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
		file_envoy_config_core_v3_extension_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ExtensionConfigSource); i {
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
			RawDescriptor: file_envoy_config_core_v3_extension_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_envoy_config_core_v3_extension_proto_goTypes,
		DependencyIndexes: file_envoy_config_core_v3_extension_proto_depIdxs,
		MessageInfos:      file_envoy_config_core_v3_extension_proto_msgTypes,
	}.Build()
	File_envoy_config_core_v3_extension_proto = out.File
	file_envoy_config_core_v3_extension_proto_rawDesc = nil
	file_envoy_config_core_v3_extension_proto_goTypes = nil
	file_envoy_config_core_v3_extension_proto_depIdxs = nil
}
