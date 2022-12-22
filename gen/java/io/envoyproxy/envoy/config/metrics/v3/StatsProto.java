// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/metrics/v3/stats.proto

package io.envoyproxy.envoy.config.metrics.v3;

public final class StatsProto {
  private StatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_StatsSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_StatsSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_StatsConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_StatsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_StatsMatcher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_StatsMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_TagSpecifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_TagSpecifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_HistogramBucketSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_HistogramBucketSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_StatsdSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_StatsdSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_DogStatsdSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_DogStatsdSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_metrics_v3_HystrixSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_metrics_v3_HystrixSink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#envoy/config/metrics/v3/stats.proto\022\027e" +
      "nvoy.config.metrics.v3\032\"envoy/config/cor" +
      "e/v3/address.proto\032\"envoy/type/matcher/v" +
      "3/string.proto\032\031google/protobuf/any.prot" +
      "o\032\036google/protobuf/wrappers.proto\032\035udpa/" +
      "annotations/status.proto\032!udpa/annotatio" +
      "ns/versioning.proto\032\027validate/validate.p" +
      "roto\"\216\001\n\tStatsSink\022\014\n\004name\030\001 \001(\t\022,\n\014type" +
      "d_config\030\003 \001(\0132\024.google.protobuf.AnyH\000:(" +
      "\232\305\210\036#\n!envoy.config.metrics.v2.StatsSink" +
      "B\r\n\013config_typeJ\004\010\002\020\003R\006config\"\301\002\n\013StatsC" +
      "onfig\0229\n\nstats_tags\030\001 \003(\0132%.envoy.config" +
      ".metrics.v3.TagSpecifier\0228\n\024use_all_defa" +
      "ult_tags\030\002 \001(\0132\032.google.protobuf.BoolVal" +
      "ue\022<\n\rstats_matcher\030\003 \001(\0132%.envoy.config" +
      ".metrics.v3.StatsMatcher\022S\n\031histogram_bu" +
      "cket_settings\030\004 \003(\01320.envoy.config.metri" +
      "cs.v3.HistogramBucketSettings:*\232\305\210\036%\n#en" +
      "voy.config.metrics.v2.StatsConfig\"\357\001\n\014St" +
      "atsMatcher\022\024\n\nreject_all\030\001 \001(\010H\000\022B\n\016excl" +
      "usion_list\030\002 \001(\0132(.envoy.type.matcher.v3" +
      ".ListStringMatcherH\000\022B\n\016inclusion_list\030\003" +
      " \001(\0132(.envoy.type.matcher.v3.ListStringM" +
      "atcherH\000:+\232\305\210\036&\n$envoy.config.metrics.v2" +
      ".StatsMatcherB\024\n\rstats_matcher\022\003\370B\001\"\214\001\n\014" +
      "TagSpecifier\022\020\n\010tag_name\030\001 \001(\t\022\031\n\005regex\030" +
      "\002 \001(\tB\010\372B\005r\003(\200\010H\000\022\025\n\013fixed_value\030\003 \001(\tH\000" +
      ":+\232\305\210\036&\n$envoy.config.metrics.v2.TagSpec" +
      "ifierB\013\n\ttag_value\"\202\001\n\027HistogramBucketSe" +
      "ttings\022=\n\005match\030\001 \001(\0132$.envoy.type.match" +
      "er.v3.StringMatcherB\010\372B\005\212\001\002\020\001\022(\n\007buckets" +
      "\030\002 \003(\001B\027\372B\024\222\001\021\010\001\030\001\"\013\022\t!\000\000\000\000\000\000\000\000\"\256\001\n\nStat" +
      "sdSink\0220\n\007address\030\001 \001(\0132\035.envoy.config.c" +
      "ore.v3.AddressH\000\022\032\n\020tcp_cluster_name\030\002 \001" +
      "(\tH\000\022\016\n\006prefix\030\003 \001(\t:)\232\305\210\036$\n\"envoy.confi" +
      "g.metrics.v2.StatsdSinkB\027\n\020statsd_specif" +
      "ier\022\003\370B\001\"\351\001\n\rDogStatsdSink\0220\n\007address\030\001 " +
      "\001(\0132\035.envoy.config.core.v3.AddressH\000\022\016\n\006" +
      "prefix\030\003 \001(\t\022E\n\026max_bytes_per_datagram\030\004" +
      " \001(\0132\034.google.protobuf.UInt64ValueB\007\372B\0042" +
      "\002 \000:,\232\305\210\036\'\n%envoy.config.metrics.v2.DogS" +
      "tatsdSinkB\033\n\024dog_statsd_specifier\022\003\370B\001J\004" +
      "\010\002\020\003\"N\n\013HystrixSink\022\023\n\013num_buckets\030\001 \001(\003" +
      ":*\232\305\210\036%\n#envoy.config.metrics.v2.Hystrix" +
      "SinkB\207\001\n%io.envoyproxy.envoy.config.metr" +
      "ics.v3B\nStatsProtoP\001ZHgithub.com/envoypr" +
      "oxy/go-control-plane/envoy/config/metric" +
      "s/v3;metricsv3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_metrics_v3_StatsSink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_metrics_v3_StatsSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_StatsSink_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", "ConfigType", });
    internal_static_envoy_config_metrics_v3_StatsConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_metrics_v3_StatsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_StatsConfig_descriptor,
        new java.lang.String[] { "StatsTags", "UseAllDefaultTags", "StatsMatcher", "HistogramBucketSettings", });
    internal_static_envoy_config_metrics_v3_StatsMatcher_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_metrics_v3_StatsMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_StatsMatcher_descriptor,
        new java.lang.String[] { "RejectAll", "ExclusionList", "InclusionList", "StatsMatcher", });
    internal_static_envoy_config_metrics_v3_TagSpecifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_metrics_v3_TagSpecifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_TagSpecifier_descriptor,
        new java.lang.String[] { "TagName", "Regex", "FixedValue", "TagValue", });
    internal_static_envoy_config_metrics_v3_HistogramBucketSettings_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_config_metrics_v3_HistogramBucketSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_HistogramBucketSettings_descriptor,
        new java.lang.String[] { "Match", "Buckets", });
    internal_static_envoy_config_metrics_v3_StatsdSink_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_config_metrics_v3_StatsdSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_StatsdSink_descriptor,
        new java.lang.String[] { "Address", "TcpClusterName", "Prefix", "StatsdSpecifier", });
    internal_static_envoy_config_metrics_v3_DogStatsdSink_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_config_metrics_v3_DogStatsdSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_DogStatsdSink_descriptor,
        new java.lang.String[] { "Address", "Prefix", "MaxBytesPerDatagram", "DogStatsdSpecifier", });
    internal_static_envoy_config_metrics_v3_HystrixSink_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_config_metrics_v3_HystrixSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_metrics_v3_HystrixSink_descriptor,
        new java.lang.String[] { "NumBuckets", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}