// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/metricsscope/v1/metrics_scopes.proto

package com.google.monitoring.metricsscope.v1;

public final class MetricsScopesProto {
  private MetricsScopesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_metricsscope_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_metricsscope_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/monitoring/metricsscope/v1/metr" +
      "ics_scopes.proto\022!google.monitoring.metr" +
      "icsscope.v1\032\034google/api/annotations.prot" +
      "o\032\027google/api/client.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032#google/longrunning/operations.pr" +
      "oto\0325google/monitoring/metricsscope/v1/m" +
      "etrics_scope.proto\032\037google/protobuf/time" +
      "stamp.proto\"V\n\026GetMetricsScopeRequest\022<\n" +
      "\004name\030\001 \001(\tB.\340A\002\372A(\n&monitoring.googleap" +
      "is.com/MetricsScope\"W\n*ListMetricsScopes" +
      "ByMonitoredProjectRequest\022)\n\034monitored_r" +
      "esource_container\030\001 \001(\tB\003\340A\002\"v\n+ListMetr" +
      "icsScopesByMonitoredProjectResponse\022G\n\016m" +
      "etrics_scopes\030\001 \003(\0132/.google.monitoring." +
      "metricsscope.v1.MetricsScope\"\264\001\n\035CreateM" +
      "onitoredProjectRequest\022>\n\006parent\030\001 \001(\tB." +
      "\340A\002\372A(\n&monitoring.googleapis.com/Metric" +
      "sScope\022S\n\021monitored_project\030\002 \001(\01323.goog" +
      "le.monitoring.metricsscope.v1.MonitoredP" +
      "rojectB\003\340A\002\"a\n\035DeleteMonitoredProjectReq" +
      "uest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*monitoring.g" +
      "oogleapis.com/MonitoredProject\"\223\002\n\021Opera" +
      "tionMetadata\022I\n\005state\030\001 \001(\0162:.google.mon" +
      "itoring.metricsscope.v1.OperationMetadat" +
      "a.State\022/\n\013create_time\030\005 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022/\n\013update_time\030\006 \001(\0132\032." +
      "google.protobuf.Timestamp\"Q\n\005State\022\025\n\021ST" +
      "ATE_UNSPECIFIED\020\000\022\013\n\007CREATED\020\001\022\013\n\007RUNNIN" +
      "G\020\002\022\010\n\004DONE\020\003\022\r\n\tCANCELLED\020\0042\302\t\n\rMetrics" +
      "Scopes\022\271\001\n\017GetMetricsScope\0229.google.moni" +
      "toring.metricsscope.v1.GetMetricsScopeRe" +
      "quest\032/.google.monitoring.metricsscope.v" +
      "1.MetricsScope\":\202\323\344\223\002-\022+/v1/{name=locati" +
      "ons/global/metricsScopes/*}\332A\004name\022\224\002\n#L" +
      "istMetricsScopesByMonitoredProject\022M.goo" +
      "gle.monitoring.metricsscope.v1.ListMetri" +
      "csScopesByMonitoredProjectRequest\032N.goog" +
      "le.monitoring.metricsscope.v1.ListMetric" +
      "sScopesByMonitoredProjectResponse\"N\202\323\344\223\002" +
      "H\022F/v1/locations/global/metricsScopes:li" +
      "stMetricsScopesByMonitoredProject\022\220\002\n\026Cr" +
      "eateMonitoredProject\022@.google.monitoring" +
      ".metricsscope.v1.CreateMonitoredProjectR" +
      "equest\032\035.google.longrunning.Operation\"\224\001" +
      "\202\323\344\223\002K\"6/v1/{parent=locations/global/met" +
      "ricsScopes/*}/projects:\021monitored_projec" +
      "t\332A\030parent,monitored_project\312A%\n\020Monitor" +
      "edProject\022\021OperationMetadata\022\355\001\n\026DeleteM" +
      "onitoredProject\022@.google.monitoring.metr" +
      "icsscope.v1.DeleteMonitoredProjectReques" +
      "t\032\035.google.longrunning.Operation\"r\202\323\344\223\0028" +
      "*6/v1/{name=locations/global/metricsScop" +
      "es/*/projects/*}\332A\004name\312A*\n\025google.proto" +
      "buf.Empty\022\021OperationMetadata\032\332\001\312A\031monito" +
      "ring.googleapis.com\322A\272\001https://www.googl" +
      "eapis.com/auth/cloud-platform,https://ww" +
      "w.googleapis.com/auth/monitoring,https:/" +
      "/www.googleapis.com/auth/monitoring.read" +
      ",https://www.googleapis.com/auth/monitor" +
      "ing.writeB\216\002\n%com.google.monitoring.metr" +
      "icsscope.v1B\022MetricsScopesProtoP\001ZMgoogl" +
      "e.golang.org/genproto/googleapis/monitor" +
      "ing/metricsscope/v1;metricsscope\252\002\'Googl" +
      "e.Cloud.Monitoring.MetricsScope.V1\312\002\'Goo" +
      "gle\\Cloud\\Monitoring\\MetricsScope\\V1\352\002+G" +
      "oogle::Cloud::Monitoring::MetricsScope::" +
      "V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.monitoring.metricsscope.v1.MetricsScopeProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_metricsscope_v1_GetMetricsScopeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectRequest_descriptor,
        new java.lang.String[] { "MonitoredResourceContainer", });
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_metricsscope_v1_ListMetricsScopesByMonitoredProjectResponse_descriptor,
        new java.lang.String[] { "MetricsScopes", });
    internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor,
        new java.lang.String[] { "Parent", "MonitoredProject", });
    internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_metricsscope_v1_DeleteMonitoredProjectRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_metricsscope_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_metricsscope_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_metricsscope_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "State", "CreateTime", "UpdateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.monitoring.metricsscope.v1.MetricsScopeProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}