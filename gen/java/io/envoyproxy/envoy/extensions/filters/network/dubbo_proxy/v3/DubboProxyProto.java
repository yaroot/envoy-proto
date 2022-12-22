// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/dubbo_proxy/v3/dubbo_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3;

public final class DubboProxyProto {
  private DubboProxyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Drds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Drds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboProxy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboProxy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAenvoy/extensions/filters/network/dubbo" +
      "_proxy/v3/dubbo_proxy.proto\022/envoy.exten" +
      "sions.filters.network.dubbo_proxy.v3\032(en" +
      "voy/config/core/v3/config_source.proto\032;" +
      "envoy/extensions/filters/network/dubbo_p" +
      "roxy/v3/route.proto\032\031google/protobuf/any" +
      ".proto\032#envoy/annotations/deprecation.pr" +
      "oto\032\036udpa/annotations/migrate.proto\032\035udp" +
      "a/annotations/status.proto\032!udpa/annotat" +
      "ions/versioning.proto\032\027validate/validate" +
      ".proto\"f\n\004Drds\022C\n\rconfig_source\030\001 \001(\0132\"." +
      "envoy.config.core.v3.ConfigSourceB\010\372B\005\212\001" +
      "\002\020\001\022\031\n\021route_config_name\030\002 \001(\t\"\326\005\n\nDubbo" +
      "Proxy\022\034\n\013stat_prefix\030\001 \001(\tB\007\372B\004r\002\020\001\022^\n\rp" +
      "rotocol_type\030\002 \001(\0162=.envoy.extensions.fi" +
      "lters.network.dubbo_proxy.v3.ProtocolTyp" +
      "eB\010\372B\005\202\001\002\020\001\022h\n\022serialization_type\030\003 \001(\0162" +
      "B.envoy.extensions.filters.network.dubbo" +
      "_proxy.v3.SerializationTypeB\010\372B\005\202\001\002\020\001\022f\n" +
      "\014route_config\030\004 \003(\0132C.envoy.extensions.f" +
      "ilters.network.dubbo_proxy.v3.RouteConfi" +
      "gurationB\013\030\001\222\307\206\330\004\0033.0\022^\n\004drds\030\006 \001(\01325.en" +
      "voy.extensions.filters.network.dubbo_pro" +
      "xy.v3.DrdsB\027\362\230\376\217\005\021\022\017route_specifierH\000\022l\n" +
      "\025multiple_route_config\030\007 \001(\0132K.envoy.ext" +
      "ensions.filters.network.dubbo_proxy.v3.M" +
      "ultipleRouteConfigurationH\000\022S\n\rdubbo_fil" +
      "ters\030\005 \003(\0132<.envoy.extensions.filters.ne" +
      "twork.dubbo_proxy.v3.DubboFilter:B\232\305\210\036=\n" +
      ";envoy.config.filter.network.dubbo_proxy" +
      ".v2alpha1.DubboProxyB\021\n\017route_specifier\"" +
      "\217\001\n\013DubboFilter\022\025\n\004name\030\001 \001(\tB\007\372B\004r\002\020\001\022$" +
      "\n\006config\030\002 \001(\0132\024.google.protobuf.Any:C\232\305" +
      "\210\036>\n<envoy.config.filter.network.dubbo_p" +
      "roxy.v2alpha1.DubboFilter*\031\n\014ProtocolTyp" +
      "e\022\t\n\005Dubbo\020\000*!\n\021SerializationType\022\014\n\010Hes" +
      "sian2\020\000B\300\001\n=io.envoyproxy.envoy.extensio" +
      "ns.filters.network.dubbo_proxy.v3B\017Dubbo" +
      "ProxyProtoP\001Zdgithub.com/envoyproxy/go-c" +
      "ontrol-plane/envoy/extensions/filters/ne" +
      "twork/dubbo_proxy/v3;dubbo_proxyv3\272\200\310\321\006\002" +
      "\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          envoy.annotations.Deprecation.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Drds_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Drds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Drds_descriptor,
        new java.lang.String[] { "ConfigSource", "RouteConfigName", });
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboProxy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboProxy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboProxy_descriptor,
        new java.lang.String[] { "StatPrefix", "ProtocolType", "SerializationType", "RouteConfig", "Drds", "MultipleRouteConfig", "DubboFilters", "RouteSpecifier", });
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_DubboFilter_descriptor,
        new java.lang.String[] { "Name", "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(envoy.annotations.Deprecation.deprecatedAtMinorVersion);
    registry.add(udpa.annotations.Migrate.fieldMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor();
    io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    envoy.annotations.Deprecation.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}