// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/context_params.proto

package com.github.xds.core.v3;

public final class ContextParamsProto {
  private ContextParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xds_core_v3_ContextParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xds_core_v3_ContextParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_xds_core_v3_ContextParams_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_xds_core_v3_ContextParams_ParamsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n xds/core/v3/context_params.proto\022\013xds." +
      "core.v3\032\037xds/annotations/v3/status.proto" +
      "\"v\n\rContextParams\0226\n\006params\030\001 \003(\0132&.xds." +
      "core.v3.ContextParams.ParamsEntry\032-\n\013Par" +
      "amsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "BZ\n\026com.github.xds.core.v3B\022ContextParam" +
      "sProtoP\001Z\"github.com/cncf/xds/go/xds/cor" +
      "e/v3\322\306\244\341\006\002\010\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          xds.annotations.v3.Status.getDescriptor(),
        });
    internal_static_xds_core_v3_ContextParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_xds_core_v3_ContextParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xds_core_v3_ContextParams_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_xds_core_v3_ContextParams_ParamsEntry_descriptor =
      internal_static_xds_core_v3_ContextParams_descriptor.getNestedTypes().get(0);
    internal_static_xds_core_v3_ContextParams_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_xds_core_v3_ContextParams_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(xds.annotations.v3.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    xds.annotations.v3.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}