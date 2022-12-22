// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/cluster/v3/outlier_detection.proto

package io.envoyproxy.envoy.config.cluster.v3;

public final class OutlierDetectionProto {
  private OutlierDetectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_cluster_v3_OutlierDetection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_cluster_v3_OutlierDetection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/envoy/config/cluster/v3/outlier_detect" +
      "ion.proto\022\027envoy.config.cluster.v3\032\036goog" +
      "le/protobuf/duration.proto\032\036google/proto" +
      "buf/wrappers.proto\032\035udpa/annotations/sta" +
      "tus.proto\032!udpa/annotations/versioning.p" +
      "roto\032\027validate/validate.proto\"\311\014\n\020Outlie" +
      "rDetection\0225\n\017consecutive_5xx\030\001 \001(\0132\034.go" +
      "ogle.protobuf.UInt32Value\0225\n\010interval\030\002 " +
      "\001(\0132\031.google.protobuf.DurationB\010\372B\005\252\001\002*\000" +
      "\022?\n\022base_ejection_time\030\003 \001(\0132\031.google.pr" +
      "otobuf.DurationB\010\372B\005\252\001\002*\000\022C\n\024max_ejectio" +
      "n_percent\030\004 \001(\0132\034.google.protobuf.UInt32" +
      "ValueB\007\372B\004*\002\030d\022H\n\031enforcing_consecutive_" +
      "5xx\030\005 \001(\0132\034.google.protobuf.UInt32ValueB" +
      "\007\372B\004*\002\030d\022E\n\026enforcing_success_rate\030\006 \001(\013" +
      "2\034.google.protobuf.UInt32ValueB\007\372B\004*\002\030d\022" +
      "@\n\032success_rate_minimum_hosts\030\007 \001(\0132\034.go" +
      "ogle.protobuf.UInt32Value\022A\n\033success_rat" +
      "e_request_volume\030\010 \001(\0132\034.google.protobuf" +
      ".UInt32Value\022?\n\031success_rate_stdev_facto" +
      "r\030\t \001(\0132\034.google.protobuf.UInt32Value\022A\n" +
      "\033consecutive_gateway_failure\030\n \001(\0132\034.goo" +
      "gle.protobuf.UInt32Value\022T\n%enforcing_co" +
      "nsecutive_gateway_failure\030\013 \001(\0132\034.google" +
      ".protobuf.UInt32ValueB\007\372B\004*\002\030d\022*\n\"split_" +
      "external_local_origin_errors\030\014 \001(\010\022F\n co" +
      "nsecutive_local_origin_failure\030\r \001(\0132\034.g" +
      "oogle.protobuf.UInt32Value\022Y\n*enforcing_" +
      "consecutive_local_origin_failure\030\016 \001(\0132\034" +
      ".google.protobuf.UInt32ValueB\007\372B\004*\002\030d\022R\n" +
      "#enforcing_local_origin_success_rate\030\017 \001" +
      "(\0132\034.google.protobuf.UInt32ValueB\007\372B\004*\002\030" +
      "d\022K\n\034failure_percentage_threshold\030\020 \001(\0132" +
      "\034.google.protobuf.UInt32ValueB\007\372B\004*\002\030d\022K" +
      "\n\034enforcing_failure_percentage\030\021 \001(\0132\034.g" +
      "oogle.protobuf.UInt32ValueB\007\372B\004*\002\030d\022X\n)e" +
      "nforcing_failure_percentage_local_origin" +
      "\030\022 \001(\0132\034.google.protobuf.UInt32ValueB\007\372B" +
      "\004*\002\030d\022F\n failure_percentage_minimum_host" +
      "s\030\023 \001(\0132\034.google.protobuf.UInt32Value\022G\n" +
      "!failure_percentage_request_volume\030\024 \001(\013" +
      "2\034.google.protobuf.UInt32Value\022>\n\021max_ej" +
      "ection_time\030\025 \001(\0132\031.google.protobuf.Dura" +
      "tionB\010\372B\005\252\001\002*\000\022;\n\030max_ejection_time_jitt" +
      "er\030\026 \001(\0132\031.google.protobuf.Duration:,\232\305\210" +
      "\036\'\n%envoy.api.v2.cluster.OutlierDetectio" +
      "nB\222\001\n%io.envoyproxy.envoy.config.cluster" +
      ".v3B\025OutlierDetectionProtoP\001ZHgithub.com" +
      "/envoyproxy/go-control-plane/envoy/confi" +
      "g/cluster/v3;clusterv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_cluster_v3_OutlierDetection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_cluster_v3_OutlierDetection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_cluster_v3_OutlierDetection_descriptor,
        new java.lang.String[] { "Consecutive5Xx", "Interval", "BaseEjectionTime", "MaxEjectionPercent", "EnforcingConsecutive5Xx", "EnforcingSuccessRate", "SuccessRateMinimumHosts", "SuccessRateRequestVolume", "SuccessRateStdevFactor", "ConsecutiveGatewayFailure", "EnforcingConsecutiveGatewayFailure", "SplitExternalLocalOriginErrors", "ConsecutiveLocalOriginFailure", "EnforcingConsecutiveLocalOriginFailure", "EnforcingLocalOriginSuccessRate", "FailurePercentageThreshold", "EnforcingFailurePercentage", "EnforcingFailurePercentageLocalOrigin", "FailurePercentageMinimumHosts", "FailurePercentageRequestVolume", "MaxEjectionTime", "MaxEjectionTimeJitter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}