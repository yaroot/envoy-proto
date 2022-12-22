// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/address.proto

package io.envoyproxy.envoy.config.core.v3;

public final class AddressProto {
  private AddressProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Pipe_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Pipe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_EnvoyInternalAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_EnvoyInternalAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_SocketAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_SocketAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_TcpKeepalive_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_TcpKeepalive_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_ExtraSourceAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_ExtraSourceAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_BindConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_BindConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_CidrRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_CidrRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"envoy/config/core/v3/address.proto\022\024en" +
      "voy.config.core.v3\032(envoy/config/core/v3" +
      "/socket_option.proto\032\036google/protobuf/wr" +
      "appers.proto\032#envoy/annotations/deprecat" +
      "ion.proto\032\035udpa/annotations/status.proto" +
      "\032!udpa/annotations/versioning.proto\032\027val" +
      "idate/validate.proto\"T\n\004Pipe\022\025\n\004path\030\001 \001" +
      "(\tB\007\372B\004r\002\020\001\022\026\n\004mode\030\002 \001(\rB\010\372B\005*\003\030\377\003:\035\232\305\210" +
      "\036\030\n\026envoy.api.v2.core.Pipe\"j\n\024EnvoyInter" +
      "nalAddress\022\036\n\024server_listener_name\030\001 \001(\t" +
      "H\000\022\023\n\013endpoint_id\030\002 \001(\tB\035\n\026address_name_" +
      "specifier\022\003\370B\001\"\263\002\n\rSocketAddress\022H\n\010prot" +
      "ocol\030\001 \001(\0162,.envoy.config.core.v3.Socket" +
      "Address.ProtocolB\010\372B\005\202\001\002\020\001\022\030\n\007address\030\002 " +
      "\001(\tB\007\372B\004r\002\020\001\022\037\n\nport_value\030\003 \001(\rB\t\372B\006*\004\030" +
      "\377\377\003H\000\022\024\n\nnamed_port\030\004 \001(\tH\000\022\025\n\rresolver_" +
      "name\030\005 \001(\t\022\023\n\013ipv4_compat\030\006 \001(\010\"\034\n\010Proto" +
      "col\022\007\n\003TCP\020\000\022\007\n\003UDP\020\001:&\232\305\210\036!\n\037envoy.api." +
      "v2.core.SocketAddressB\025\n\016port_specifier\022" +
      "\003\370B\001\"\335\001\n\014TcpKeepalive\0226\n\020keepalive_probe" +
      "s\030\001 \001(\0132\034.google.protobuf.UInt32Value\0224\n" +
      "\016keepalive_time\030\002 \001(\0132\034.google.protobuf." +
      "UInt32Value\0228\n\022keepalive_interval\030\003 \001(\0132" +
      "\034.google.protobuf.UInt32Value:%\232\305\210\036 \n\036en" +
      "voy.api.v2.core.TcpKeepalive\"\231\001\n\022ExtraSo" +
      "urceAddress\022>\n\007address\030\001 \001(\0132#.envoy.con" +
      "fig.core.v3.SocketAddressB\010\372B\005\212\001\002\020\001\022C\n\016s" +
      "ocket_options\030\002 \001(\0132+.envoy.config.core." +
      "v3.SocketOptionsOverride\"\371\002\n\nBindConfig\022" +
      ";\n\016source_address\030\001 \001(\0132#.envoy.config.c" +
      "ore.v3.SocketAddress\022,\n\010freebind\030\002 \001(\0132\032" +
      ".google.protobuf.BoolValue\022:\n\016socket_opt" +
      "ions\030\003 \003(\0132\".envoy.config.core.v3.Socket" +
      "Option\022H\n\026extra_source_addresses\030\005 \003(\0132(" +
      ".envoy.config.core.v3.ExtraSourceAddress" +
      "\022U\n\033additional_source_addresses\030\004 \003(\0132#." +
      "envoy.config.core.v3.SocketAddressB\013\030\001\222\307" +
      "\206\330\004\0033.0:#\232\305\210\036\036\n\034envoy.api.v2.core.BindCo" +
      "nfig\"\364\001\n\007Address\022=\n\016socket_address\030\001 \001(\013" +
      "2#.envoy.config.core.v3.SocketAddressH\000\022" +
      "*\n\004pipe\030\002 \001(\0132\032.envoy.config.core.v3.Pip" +
      "eH\000\022L\n\026envoy_internal_address\030\003 \001(\0132*.en" +
      "voy.config.core.v3.EnvoyInternalAddressH" +
      "\000: \232\305\210\036\033\n\031envoy.api.v2.core.AddressB\016\n\007a" +
      "ddress\022\003\370B\001\"\214\001\n\tCidrRange\022\037\n\016address_pre" +
      "fix\030\001 \001(\tB\007\372B\004r\002\020\001\022:\n\nprefix_len\030\002 \001(\0132\034" +
      ".google.protobuf.UInt32ValueB\010\372B\005*\003\030\200\001:\"" +
      "\232\305\210\036\035\n\033envoy.api.v2.core.CidrRangeB\200\001\n\"i" +
      "o.envoyproxy.envoy.config.core.v3B\014Addre" +
      "ssProtoP\001ZBgithub.com/envoyproxy/go-cont" +
      "rol-plane/envoy/config/core/v3;corev3\272\200\310" +
      "\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.SocketOptionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          envoy.annotations.Deprecation.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_core_v3_Pipe_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_core_v3_Pipe_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Pipe_descriptor,
        new java.lang.String[] { "Path", "Mode", });
    internal_static_envoy_config_core_v3_EnvoyInternalAddress_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_core_v3_EnvoyInternalAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_EnvoyInternalAddress_descriptor,
        new java.lang.String[] { "ServerListenerName", "EndpointId", "AddressNameSpecifier", });
    internal_static_envoy_config_core_v3_SocketAddress_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_core_v3_SocketAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_SocketAddress_descriptor,
        new java.lang.String[] { "Protocol", "Address", "PortValue", "NamedPort", "ResolverName", "Ipv4Compat", "PortSpecifier", });
    internal_static_envoy_config_core_v3_TcpKeepalive_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_core_v3_TcpKeepalive_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_TcpKeepalive_descriptor,
        new java.lang.String[] { "KeepaliveProbes", "KeepaliveTime", "KeepaliveInterval", });
    internal_static_envoy_config_core_v3_ExtraSourceAddress_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_config_core_v3_ExtraSourceAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_ExtraSourceAddress_descriptor,
        new java.lang.String[] { "Address", "SocketOptions", });
    internal_static_envoy_config_core_v3_BindConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_config_core_v3_BindConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_BindConfig_descriptor,
        new java.lang.String[] { "SourceAddress", "Freebind", "SocketOptions", "ExtraSourceAddresses", "AdditionalSourceAddresses", });
    internal_static_envoy_config_core_v3_Address_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_config_core_v3_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Address_descriptor,
        new java.lang.String[] { "SocketAddress", "Pipe", "EnvoyInternalAddress", "Address", });
    internal_static_envoy_config_core_v3_CidrRange_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_config_core_v3_CidrRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_CidrRange_descriptor,
        new java.lang.String[] { "AddressPrefix", "PrefixLen", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(envoy.annotations.Deprecation.deprecatedAtMinorVersion);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.SocketOptionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    envoy.annotations.Deprecation.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
