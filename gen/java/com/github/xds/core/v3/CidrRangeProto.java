// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/cidr.proto

package com.github.xds.core.v3;

public final class CidrRangeProto {
  private CidrRangeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xds_core_v3_CidrRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xds_core_v3_CidrRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026xds/core/v3/cidr.proto\022\013xds.core.v3\032\037x" +
      "ds/annotations/v3/status.proto\032\036google/p" +
      "rotobuf/wrappers.proto\032\027validate/validat" +
      "e.proto\"h\n\tCidrRange\022\037\n\016address_prefix\030\001" +
      " \001(\tB\007\372B\004r\002\020\001\022:\n\nprefix_len\030\002 \001(\0132\034.goog" +
      "le.protobuf.UInt32ValueB\010\372B\005*\003\030\200\001BV\n\026com" +
      ".github.xds.core.v3B\016CidrRangeProtoP\001Z\"g" +
      "ithub.com/cncf/xds/go/xds/core/v3\322\306\244\341\006\002\010" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          xds.annotations.v3.Status.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_xds_core_v3_CidrRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xds_core_v3_CidrRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xds_core_v3_CidrRange_descriptor,
        new java.lang.String[] { "AddressPrefix", "PrefixLen", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    registry.add(xds.annotations.v3.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    xds.annotations.v3.Status.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}