// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/token_bucket.proto

package io.envoyproxy.envoy.type;

public final class TokenBucketProto {
  private TokenBucketProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_TokenBucket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_TokenBucket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035envoy/type/token_bucket.proto\022\nenvoy.t" +
      "ype\032\036google/protobuf/duration.proto\032\036goo" +
      "gle/protobuf/wrappers.proto\032\035udpa/annota" +
      "tions/status.proto\032\027validate/validate.pr" +
      "oto\"\250\001\n\013TokenBucket\022\033\n\nmax_tokens\030\001 \001(\rB" +
      "\007\372B\004*\002 \000\022>\n\017tokens_per_fill\030\002 \001(\0132\034.goog" +
      "le.protobuf.UInt32ValueB\007\372B\004*\002 \000\022<\n\rfill" +
      "_interval\030\003 \001(\0132\031.google.protobuf.Durati" +
      "onB\n\372B\007\252\001\004\010\001*\000Bi\n\030io.envoyproxy.envoy.ty" +
      "peB\020TokenBucketProtoP\001Z1github.com/envoy" +
      "proxy/go-control-plane/envoy/type\272\200\310\321\006\002\020" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_type_TokenBucket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_type_TokenBucket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_TokenBucket_descriptor,
        new java.lang.String[] { "MaxTokens", "TokensPerFill", "FillInterval", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}