// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: udpa/type/v1/typed_struct.proto

package com.github.udpa.udpa.type.v1;

public final class TypedStructProto {
  private TypedStructProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_udpa_type_v1_TypedStruct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_udpa_type_v1_TypedStruct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037udpa/type/v1/typed_struct.proto\022\014udpa." +
      "type.v1\032\034google/protobuf/struct.proto\"G\n" +
      "\013TypedStruct\022\020\n\010type_url\030\001 \001(\t\022&\n\005value\030" +
      "\002 \001(\0132\027.google.protobuf.StructBW\n\034com.gi" +
      "thub.udpa.udpa.type.v1B\020TypedStructProto" +
      "P\001Z#github.com/cncf/xds/go/udpa/type/v1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_udpa_type_v1_TypedStruct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_udpa_type_v1_TypedStruct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_udpa_type_v1_TypedStruct_descriptor,
        new java.lang.String[] { "TypeUrl", "Value", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
