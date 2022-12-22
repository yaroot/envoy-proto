// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/request_stats.proto

package com.google.bigtable.v2;

public final class RequestStatsProto {
  private RequestStatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v2_ReadIterationStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_ReadIterationStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v2_RequestLatencyStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RequestLatencyStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v2_FullReadStatsView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_FullReadStatsView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v2_RequestStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v2_RequestStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/bigtable/v2/request_stats.proto" +
      "\022\022google.bigtable.v2\032\036google/protobuf/du" +
      "ration.proto\"\202\001\n\022ReadIterationStats\022\027\n\017r" +
      "ows_seen_count\030\001 \001(\003\022\033\n\023rows_returned_co" +
      "unt\030\002 \001(\003\022\030\n\020cells_seen_count\030\003 \001(\003\022\034\n\024c" +
      "ells_returned_count\030\004 \001(\003\"Q\n\023RequestLate" +
      "ncyStats\022:\n\027frontend_server_latency\030\001 \001(" +
      "\0132\031.google.protobuf.Duration\"\241\001\n\021FullRea" +
      "dStatsView\022D\n\024read_iteration_stats\030\001 \001(\013" +
      "2&.google.bigtable.v2.ReadIterationStats" +
      "\022F\n\025request_latency_stats\030\002 \001(\0132\'.google" +
      ".bigtable.v2.RequestLatencyStats\"c\n\014Requ" +
      "estStats\022E\n\024full_read_stats_view\030\001 \001(\0132%" +
      ".google.bigtable.v2.FullReadStatsViewH\000B" +
      "\014\n\nstats_viewB\275\001\n\026com.google.bigtable.v2" +
      "B\021RequestStatsProtoP\001Z:google.golang.org" +
      "/genproto/googleapis/bigtable/v2;bigtabl" +
      "e\252\002\030Google.Cloud.Bigtable.V2\312\002\030Google\\Cl" +
      "oud\\Bigtable\\V2\352\002\033Google::Cloud::Bigtabl" +
      "e::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_bigtable_v2_ReadIterationStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_v2_ReadIterationStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v2_ReadIterationStats_descriptor,
        new java.lang.String[] { "RowsSeenCount", "RowsReturnedCount", "CellsSeenCount", "CellsReturnedCount", });
    internal_static_google_bigtable_v2_RequestLatencyStats_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_v2_RequestLatencyStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v2_RequestLatencyStats_descriptor,
        new java.lang.String[] { "FrontendServerLatency", });
    internal_static_google_bigtable_v2_FullReadStatsView_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_v2_FullReadStatsView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v2_FullReadStatsView_descriptor,
        new java.lang.String[] { "ReadIterationStats", "RequestLatencyStats", });
    internal_static_google_bigtable_v2_RequestStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_v2_RequestStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v2_RequestStats_descriptor,
        new java.lang.String[] { "FullReadStatsView", "StatsView", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}