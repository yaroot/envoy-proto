// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/release_channel.proto

package com.google.actions.sdk.v2;

public final class ReleaseChannelProto {
  private ReleaseChannelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_ReleaseChannel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_ReleaseChannel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/actions/sdk/v2/release_channel." +
      "proto\022\025google.actions.sdk.v2\032\031google/api" +
      "/resource.proto\"\262\001\n\016ReleaseChannel\022\014\n\004na" +
      "me\030\001 \001(\t\022\027\n\017current_version\030\002 \001(\t\022\027\n\017pen" +
      "ding_version\030\003 \001(\t:`\352A]\n%actions.googlea" +
      "pis.com/ReleaseChannel\0224projects/{projec" +
      "t}/releaseChannels/{release_channel}Bl\n\031" +
      "com.google.actions.sdk.v2B\023ReleaseChanne" +
      "lProtoP\001Z8google.golang.org/genproto/goo" +
      "gleapis/actions/sdk/v2;sdkb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_actions_sdk_v2_ReleaseChannel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_actions_sdk_v2_ReleaseChannel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_ReleaseChannel_descriptor,
        new java.lang.String[] { "Name", "CurrentVersion", "PendingVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}