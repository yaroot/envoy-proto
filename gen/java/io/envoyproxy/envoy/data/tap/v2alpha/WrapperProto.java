// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/tap/v2alpha/wrapper.proto

package io.envoyproxy.envoy.data.tap.v2alpha;

public final class WrapperProto {
  private WrapperProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_tap_v2alpha_TraceWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_tap_v2alpha_TraceWrapper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/data/tap/v2alpha/wrapper.proto\022\026" +
      "envoy.data.tap.v2alpha\032!envoy/data/tap/v" +
      "2alpha/http.proto\032&envoy/data/tap/v2alph" +
      "a/transport.proto\032\035udpa/annotations/stat" +
      "us.proto\032\027validate/validate.proto\"\352\002\n\014Tr" +
      "aceWrapper\022H\n\023http_buffered_trace\030\001 \001(\0132" +
      ").envoy.data.tap.v2alpha.HttpBufferedTra" +
      "ceH\000\022W\n\033http_streamed_trace_segment\030\002 \001(" +
      "\01320.envoy.data.tap.v2alpha.HttpStreamedT" +
      "raceSegmentH\000\022L\n\025socket_buffered_trace\030\003" +
      " \001(\0132+.envoy.data.tap.v2alpha.SocketBuff" +
      "eredTraceH\000\022[\n\035socket_streamed_trace_seg" +
      "ment\030\004 \001(\01322.envoy.data.tap.v2alpha.Sock" +
      "etStreamedTraceSegmentH\000B\014\n\005trace\022\003\370B\001B}" +
      "\n$io.envoyproxy.envoy.data.tap.v2alphaB\014" +
      "WrapperProtoP\001Z=github.com/envoyproxy/go" +
      "-control-plane/envoy/data/tap/v2alpha\272\200\310" +
      "\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.data.tap.v2alpha.HttpProto.getDescriptor(),
          io.envoyproxy.envoy.data.tap.v2alpha.TransportProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_data_tap_v2alpha_TraceWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_data_tap_v2alpha_TraceWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_tap_v2alpha_TraceWrapper_descriptor,
        new java.lang.String[] { "HttpBufferedTrace", "HttpStreamedTraceSegment", "SocketBufferedTrace", "SocketStreamedTraceSegment", "Trace", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.data.tap.v2alpha.HttpProto.getDescriptor();
    io.envoyproxy.envoy.data.tap.v2alpha.TransportProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}