// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/maneuver.proto

package com.google.maps.routing.v2;

public final class ManeuverProto {
  private ManeuverProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/maps/routing/v2/maneuver.proto\022" +
      "\026google.maps.routing.v2*\332\002\n\010Maneuver\022\030\n\024" +
      "MANEUVER_UNSPECIFIED\020\000\022\024\n\020TURN_SLIGHT_LE" +
      "FT\020\001\022\023\n\017TURN_SHARP_LEFT\020\002\022\016\n\nUTURN_LEFT\020" +
      "\003\022\r\n\tTURN_LEFT\020\004\022\025\n\021TURN_SLIGHT_RIGHT\020\005\022" +
      "\024\n\020TURN_SHARP_RIGHT\020\006\022\017\n\013UTURN_RIGHT\020\007\022\016" +
      "\n\nTURN_RIGHT\020\010\022\014\n\010STRAIGHT\020\t\022\r\n\tRAMP_LEF" +
      "T\020\n\022\016\n\nRAMP_RIGHT\020\013\022\t\n\005MERGE\020\014\022\r\n\tFORK_L" +
      "EFT\020\r\022\016\n\nFORK_RIGHT\020\016\022\t\n\005FERRY\020\017\022\017\n\013FERR" +
      "Y_TRAIN\020\020\022\023\n\017ROUNDABOUT_LEFT\020\021\022\024\n\020ROUNDA" +
      "BOUT_RIGHT\020\022B\305\001\n\032com.google.maps.routing" +
      ".v2B\rManeuverProtoP\001Z=google.golang.org/" +
      "genproto/googleapis/maps/routing/v2;rout" +
      "ing\370\001\001\242\002\005GMRV2\252\002\026Google.Maps.Routing.V2\312" +
      "\002\026Google\\Maps\\Routing\\V2\352\002\031Google::Maps:" +
      ":Routing::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}