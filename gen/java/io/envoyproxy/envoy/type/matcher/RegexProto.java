// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/regex.proto

package io.envoyproxy.envoy.type.matcher;

public final class RegexProto {
  private RegexProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_RegexMatcher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_RegexMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_RegexMatcher_GoogleRE2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_RegexMatcher_GoogleRE2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_RegexMatchAndSubstitute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_RegexMatchAndSubstitute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036envoy/type/matcher/regex.proto\022\022envoy." +
      "type.matcher\032\036google/protobuf/wrappers.p" +
      "roto\032\035udpa/annotations/status.proto\032\027val" +
      "idate/validate.proto\"\317\001\n\014RegexMatcher\022J\n" +
      "\ngoogle_re2\030\001 \001(\0132*.envoy.type.matcher.R" +
      "egexMatcher.GoogleRE2B\010\372B\005\212\001\002\020\001H\000\022\026\n\005reg" +
      "ex\030\002 \001(\tB\007\372B\004r\002\020\001\032G\n\tGoogleRE2\022:\n\020max_pr" +
      "ogram_size\030\001 \001(\0132\034.google.protobuf.UInt3" +
      "2ValueB\002\030\001B\022\n\013engine_type\022\003\370B\001\"b\n\027RegexM" +
      "atchAndSubstitute\0221\n\007pattern\030\001 \001(\0132 .env" +
      "oy.type.matcher.RegexMatcher\022\024\n\014substitu" +
      "tion\030\002 \001(\tBs\n io.envoyproxy.envoy.type.m" +
      "atcherB\nRegexProtoP\001Z9github.com/envoypr" +
      "oxy/go-control-plane/envoy/type/matcher\272" +
      "\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_type_matcher_RegexMatcher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_type_matcher_RegexMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_RegexMatcher_descriptor,
        new java.lang.String[] { "GoogleRe2", "Regex", "EngineType", });
    internal_static_envoy_type_matcher_RegexMatcher_GoogleRE2_descriptor =
      internal_static_envoy_type_matcher_RegexMatcher_descriptor.getNestedTypes().get(0);
    internal_static_envoy_type_matcher_RegexMatcher_GoogleRE2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_RegexMatcher_GoogleRE2_descriptor,
        new java.lang.String[] { "MaxProgramSize", });
    internal_static_envoy_type_matcher_RegexMatchAndSubstitute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_type_matcher_RegexMatchAndSubstitute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_RegexMatchAndSubstitute_descriptor,
        new java.lang.String[] { "Pattern", "Substitution", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}