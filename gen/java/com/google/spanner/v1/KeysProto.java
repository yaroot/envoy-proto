// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/keys.proto

package com.google.spanner.v1;

public final class KeysProto {
  private KeysProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_KeyRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_KeyRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_KeySet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_KeySet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034google/spanner/v1/keys.proto\022\021google.s" +
      "panner.v1\032\034google/protobuf/struct.proto\"" +
      "\364\001\n\010KeyRange\0222\n\014start_closed\030\001 \001(\0132\032.goo" +
      "gle.protobuf.ListValueH\000\0220\n\nstart_open\030\002" +
      " \001(\0132\032.google.protobuf.ListValueH\000\0220\n\nen" +
      "d_closed\030\003 \001(\0132\032.google.protobuf.ListVal" +
      "ueH\001\022.\n\010end_open\030\004 \001(\0132\032.google.protobuf" +
      ".ListValueH\001B\020\n\016start_key_typeB\016\n\014end_ke" +
      "y_type\"l\n\006KeySet\022(\n\004keys\030\001 \003(\0132\032.google." +
      "protobuf.ListValue\022+\n\006ranges\030\002 \003(\0132\033.goo" +
      "gle.spanner.v1.KeyRange\022\013\n\003all\030\003 \001(\010B\257\001\n" +
      "\025com.google.spanner.v1B\tKeysProtoP\001Z8goo" +
      "gle.golang.org/genproto/googleapis/spann" +
      "er/v1;spanner\252\002\027Google.Cloud.Spanner.V1\312" +
      "\002\027Google\\Cloud\\Spanner\\V1\352\002\032Google::Clou" +
      "d::Spanner::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_spanner_v1_KeyRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_KeyRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_KeyRange_descriptor,
        new java.lang.String[] { "StartClosed", "StartOpen", "EndClosed", "EndOpen", "StartKeyType", "EndKeyType", });
    internal_static_google_spanner_v1_KeySet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_KeySet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_KeySet_descriptor,
        new java.lang.String[] { "Keys", "Ranges", "All", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}