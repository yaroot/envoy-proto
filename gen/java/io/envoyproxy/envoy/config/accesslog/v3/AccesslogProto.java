// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

public final class AccesslogProto {
  private AccesslogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_AccessLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_AccessLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_AccessLogFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_AccessLogFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_ComparisonFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_ComparisonFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_StatusCodeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_StatusCodeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_DurationFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_DurationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_TraceableFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_TraceableFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_RuntimeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_AndFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_AndFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_OrFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_OrFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_HeaderFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_HeaderFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_MetadataFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_MetadataFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_ExtensionFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_ExtensionFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)envoy/config/accesslog/v3/accesslog.pr" +
      "oto\022\031envoy.config.accesslog.v3\032\037envoy/co" +
      "nfig/core/v3/base.proto\032,envoy/config/ro" +
      "ute/v3/route_components.proto\032$envoy/typ" +
      "e/matcher/v3/metadata.proto\032\033envoy/type/" +
      "v3/percent.proto\032\031google/protobuf/any.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\035udp" +
      "a/annotations/status.proto\032!udpa/annotat" +
      "ions/versioning.proto\032\027validate/validate" +
      ".proto\"\323\001\n\tAccessLog\022\014\n\004name\030\001 \001(\t\022:\n\006fi" +
      "lter\030\002 \001(\0132*.envoy.config.accesslog.v3.A" +
      "ccessLogFilter\022,\n\014typed_config\030\004 \001(\0132\024.g" +
      "oogle.protobuf.AnyH\000:1\232\305\210\036,\n*envoy.confi" +
      "g.filter.accesslog.v2.AccessLogB\r\n\013confi" +
      "g_typeJ\004\010\003\020\004R\006config\"\264\007\n\017AccessLogFilter" +
      "\022I\n\022status_code_filter\030\001 \001(\0132+.envoy.con" +
      "fig.accesslog.v3.StatusCodeFilterH\000\022D\n\017d" +
      "uration_filter\030\002 \001(\0132).envoy.config.acce" +
      "sslog.v3.DurationFilterH\000\022R\n\027not_health_" +
      "check_filter\030\003 \001(\0132/.envoy.config.access" +
      "log.v3.NotHealthCheckFilterH\000\022F\n\020traceab" +
      "le_filter\030\004 \001(\0132*.envoy.config.accesslog" +
      ".v3.TraceableFilterH\000\022B\n\016runtime_filter\030" +
      "\005 \001(\0132(.envoy.config.accesslog.v3.Runtim" +
      "eFilterH\000\022:\n\nand_filter\030\006 \001(\0132$.envoy.co" +
      "nfig.accesslog.v3.AndFilterH\000\0228\n\tor_filt" +
      "er\030\007 \001(\0132#.envoy.config.accesslog.v3.OrF" +
      "ilterH\000\022@\n\rheader_filter\030\010 \001(\0132\'.envoy.c" +
      "onfig.accesslog.v3.HeaderFilterH\000\022M\n\024res" +
      "ponse_flag_filter\030\t \001(\0132-.envoy.config.a" +
      "ccesslog.v3.ResponseFlagFilterH\000\022I\n\022grpc" +
      "_status_filter\030\n \001(\0132+.envoy.config.acce" +
      "sslog.v3.GrpcStatusFilterH\000\022F\n\020extension" +
      "_filter\030\013 \001(\0132*.envoy.config.accesslog.v" +
      "3.ExtensionFilterH\000\022D\n\017metadata_filter\030\014" +
      " \001(\0132).envoy.config.accesslog.v3.Metadat" +
      "aFilterH\000:7\232\305\210\0362\n0envoy.config.filter.ac" +
      "cesslog.v2.AccessLogFilterB\027\n\020filter_spe" +
      "cifier\022\003\370B\001\"\356\001\n\020ComparisonFilter\022D\n\002op\030\001" +
      " \001(\0162..envoy.config.accesslog.v3.Compari" +
      "sonFilter.OpB\010\372B\005\202\001\002\020\001\022<\n\005value\030\002 \001(\0132#." +
      "envoy.config.core.v3.RuntimeUInt32B\010\372B\005\212" +
      "\001\002\020\001\"\034\n\002Op\022\006\n\002EQ\020\000\022\006\n\002GE\020\001\022\006\n\002LE\020\002:8\232\305\210\036" +
      "3\n1envoy.config.filter.accesslog.v2.Comp" +
      "arisonFilter\"\227\001\n\020StatusCodeFilter\022I\n\ncom" +
      "parison\030\001 \001(\0132+.envoy.config.accesslog.v" +
      "3.ComparisonFilterB\010\372B\005\212\001\002\020\001:8\232\305\210\0363\n1env" +
      "oy.config.filter.accesslog.v2.StatusCode" +
      "Filter\"\223\001\n\016DurationFilter\022I\n\ncomparison\030" +
      "\001 \001(\0132+.envoy.config.accesslog.v3.Compar" +
      "isonFilterB\010\372B\005\212\001\002\020\001:6\232\305\210\0361\n/envoy.confi" +
      "g.filter.accesslog.v2.DurationFilter\"T\n\024" +
      "NotHealthCheckFilter:<\232\305\210\0367\n5envoy.confi" +
      "g.filter.accesslog.v2.NotHealthCheckFilt" +
      "er\"J\n\017TraceableFilter:7\232\305\210\0362\n0envoy.conf" +
      "ig.filter.accesslog.v2.TraceableFilter\"\303" +
      "\001\n\rRuntimeFilter\022\034\n\013runtime_key\030\001 \001(\tB\007\372" +
      "B\004r\002\020\001\0229\n\017percent_sampled\030\002 \001(\0132 .envoy." +
      "type.v3.FractionalPercent\022\"\n\032use_indepen" +
      "dent_randomness\030\003 \001(\010:5\232\305\210\0360\n.envoy.conf" +
      "ig.filter.accesslog.v2.RuntimeFilter\"\205\001\n" +
      "\tAndFilter\022E\n\007filters\030\001 \003(\0132*.envoy.conf" +
      "ig.accesslog.v3.AccessLogFilterB\010\372B\005\222\001\002\010" +
      "\002:1\232\305\210\036,\n*envoy.config.filter.accesslog." +
      "v2.AndFilter\"\203\001\n\010OrFilter\022E\n\007filters\030\002 \003" +
      "(\0132*.envoy.config.accesslog.v3.AccessLog" +
      "FilterB\010\372B\005\222\001\002\010\002:0\232\305\210\036+\n)envoy.config.fi" +
      "lter.accesslog.v2.OrFilter\"\204\001\n\014HeaderFil" +
      "ter\022>\n\006header\030\001 \001(\0132$.envoy.config.route" +
      ".v3.HeaderMatcherB\010\372B\005\212\001\002\020\001:4\232\305\210\036/\n-envo" +
      "y.config.filter.accesslog.v2.HeaderFilte" +
      "r\"\343\001\n\022ResponseFlagFilter\022\220\001\n\005flags\030\001 \003(\t" +
      "B\200\001\372B}\222\001z\"xrvR\002LHR\002UHR\002UTR\002LRR\002URR\002UFR\002U" +
      "CR\002UOR\002NRR\002DIR\002FIR\002RLR\004UAEXR\004RLSER\002DCR\003U" +
      "RXR\002SIR\002IHR\003DPER\005UMSDRR\004RFCFR\004NFCFR\002DTR\003" +
      "UPER\002NCR\002OM::\232\305\210\0365\n3envoy.config.filter." +
      "accesslog.v2.ResponseFlagFilter\"\355\003\n\020Grpc" +
      "StatusFilter\022S\n\010statuses\030\001 \003(\01622.envoy.c" +
      "onfig.accesslog.v3.GrpcStatusFilter.Stat" +
      "usB\r\372B\n\222\001\007\"\005\202\001\002\020\001\022\017\n\007exclude\030\002 \001(\010\"\270\002\n\006S" +
      "tatus\022\006\n\002OK\020\000\022\014\n\010CANCELED\020\001\022\013\n\007UNKNOWN\020\002" +
      "\022\024\n\020INVALID_ARGUMENT\020\003\022\025\n\021DEADLINE_EXCEE" +
      "DED\020\004\022\r\n\tNOT_FOUND\020\005\022\022\n\016ALREADY_EXISTS\020\006" +
      "\022\025\n\021PERMISSION_DENIED\020\007\022\026\n\022RESOURCE_EXHA" +
      "USTED\020\010\022\027\n\023FAILED_PRECONDITION\020\t\022\013\n\007ABOR" +
      "TED\020\n\022\020\n\014OUT_OF_RANGE\020\013\022\021\n\rUNIMPLEMENTED" +
      "\020\014\022\014\n\010INTERNAL\020\r\022\017\n\013UNAVAILABLE\020\016\022\r\n\tDAT" +
      "A_LOSS\020\017\022\023\n\017UNAUTHENTICATED\020\020:8\232\305\210\0363\n1en" +
      "voy.config.filter.accesslog.v2.GrpcStatu" +
      "sFilter\"\275\001\n\016MetadataFilter\0227\n\007matcher\030\001 " +
      "\001(\0132&.envoy.type.matcher.v3.MetadataMatc" +
      "her\022:\n\026match_if_key_not_found\030\002 \001(\0132\032.go" +
      "ogle.protobuf.BoolValue:6\232\305\210\0361\n/envoy.co" +
      "nfig.filter.accesslog.v2.MetadataFilter\"" +
      "\243\001\n\017ExtensionFilter\022\014\n\004name\030\001 \001(\t\022,\n\014typ" +
      "ed_config\030\003 \001(\0132\024.google.protobuf.AnyH\000:" +
      "7\232\305\210\0362\n0envoy.config.filter.accesslog.v2" +
      ".ExtensionFilterB\r\n\013config_typeJ\004\010\002\020\003R\006c" +
      "onfigB\221\001\n\'io.envoyproxy.envoy.config.acc" +
      "esslog.v3B\016AccesslogProtoP\001ZLgithub.com/" +
      "envoyproxy/go-control-plane/envoy/config" +
      "/accesslog/v3;accesslogv3\272\200\310\321\006\002\020\002b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.MetadataProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_accesslog_v3_AccessLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_accesslog_v3_AccessLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_AccessLog_descriptor,
        new java.lang.String[] { "Name", "Filter", "TypedConfig", "ConfigType", });
    internal_static_envoy_config_accesslog_v3_AccessLogFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_accesslog_v3_AccessLogFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_AccessLogFilter_descriptor,
        new java.lang.String[] { "StatusCodeFilter", "DurationFilter", "NotHealthCheckFilter", "TraceableFilter", "RuntimeFilter", "AndFilter", "OrFilter", "HeaderFilter", "ResponseFlagFilter", "GrpcStatusFilter", "ExtensionFilter", "MetadataFilter", "FilterSpecifier", });
    internal_static_envoy_config_accesslog_v3_ComparisonFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_accesslog_v3_ComparisonFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_ComparisonFilter_descriptor,
        new java.lang.String[] { "Op", "Value", });
    internal_static_envoy_config_accesslog_v3_StatusCodeFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_accesslog_v3_StatusCodeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_StatusCodeFilter_descriptor,
        new java.lang.String[] { "Comparison", });
    internal_static_envoy_config_accesslog_v3_DurationFilter_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_config_accesslog_v3_DurationFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_DurationFilter_descriptor,
        new java.lang.String[] { "Comparison", });
    internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_accesslog_v3_TraceableFilter_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_config_accesslog_v3_TraceableFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_TraceableFilter_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_config_accesslog_v3_RuntimeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor,
        new java.lang.String[] { "RuntimeKey", "PercentSampled", "UseIndependentRandomness", });
    internal_static_envoy_config_accesslog_v3_AndFilter_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_envoy_config_accesslog_v3_AndFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_AndFilter_descriptor,
        new java.lang.String[] { "Filters", });
    internal_static_envoy_config_accesslog_v3_OrFilter_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_envoy_config_accesslog_v3_OrFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_OrFilter_descriptor,
        new java.lang.String[] { "Filters", });
    internal_static_envoy_config_accesslog_v3_HeaderFilter_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_envoy_config_accesslog_v3_HeaderFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_HeaderFilter_descriptor,
        new java.lang.String[] { "Header", });
    internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_descriptor,
        new java.lang.String[] { "Flags", });
    internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_descriptor,
        new java.lang.String[] { "Statuses", "Exclude", });
    internal_static_envoy_config_accesslog_v3_MetadataFilter_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_envoy_config_accesslog_v3_MetadataFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_MetadataFilter_descriptor,
        new java.lang.String[] { "Matcher", "MatchIfKeyNotFound", });
    internal_static_envoy_config_accesslog_v3_ExtensionFilter_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_envoy_config_accesslog_v3_ExtensionFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_ExtensionFilter_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", "ConfigType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.MetadataProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}