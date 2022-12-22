// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/ekm_service.proto

package com.google.cloud.kms.v1;

public final class EkmServiceProto {
  private EkmServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_EkmConnection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_EkmConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/kms/v1/ekm_service.proto\022" +
      "\023google.cloud.kms.v1\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032 google/protobuf/field_m" +
      "ask.proto\032\037google/protobuf/timestamp.pro" +
      "to\"\263\001\n\031ListEkmConnectionsRequest\0229\n\006pare" +
      "nt\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.c" +
      "om/Location\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\np" +
      "age_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A" +
      "\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\206\001\n\032ListEkmConn" +
      "ectionsResponse\022;\n\017ekm_connections\030\001 \003(\013" +
      "2\".google.cloud.kms.v1.EkmConnection\022\027\n\017" +
      "next_page_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(" +
      "\005\"V\n\027GetEkmConnectionRequest\022;\n\004name\030\001 \001" +
      "(\tB-\340A\002\372A\'\n%cloudkms.googleapis.com/EkmC" +
      "onnection\"\270\001\n\032CreateEkmConnectionRequest" +
      "\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.goog" +
      "leapis.com/Location\022\036\n\021ekm_connection_id" +
      "\030\002 \001(\tB\003\340A\002\022?\n\016ekm_connection\030\003 \001(\0132\".go" +
      "ogle.cloud.kms.v1.EkmConnectionB\003\340A\002\"\223\001\n" +
      "\032UpdateEkmConnectionRequest\022?\n\016ekm_conne" +
      "ction\030\001 \001(\0132\".google.cloud.kms.v1.EkmCon" +
      "nectionB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goog" +
      "le.protobuf.FieldMaskB\003\340A\002\"\277\002\n\013Certifica" +
      "te\022\024\n\007raw_der\030\001 \001(\014B\003\340A\002\022\023\n\006parsed\030\002 \001(\010" +
      "B\003\340A\003\022\023\n\006issuer\030\003 \001(\tB\003\340A\003\022\024\n\007subject\030\004 " +
      "\001(\tB\003\340A\003\022*\n\035subject_alternative_dns_name" +
      "s\030\005 \003(\tB\003\340A\003\0228\n\017not_before_time\030\006 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\0227\n\016not_af" +
      "ter_time\030\007 \001(\0132\032.google.protobuf.Timesta" +
      "mpB\003\340A\003\022\032\n\rserial_number\030\010 \001(\tB\003\340A\003\022\037\n\022s" +
      "ha256_fingerprint\030\t \001(\tB\003\340A\003\"\220\004\n\rEkmConn" +
      "ection\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "M\n\021service_resolvers\030\003 \003(\01322.google.clou" +
      "d.kms.v1.EkmConnection.ServiceResolver\022\021" +
      "\n\004etag\030\005 \001(\tB\003\340A\001\032\336\001\n\017ServiceResolver\022R\n" +
      "\031service_directory_service\030\001 \001(\tB/\340A\002\372A)" +
      "\n\'servicedirectory.googleapis.com/Servic" +
      "e\022\034\n\017endpoint_filter\030\002 \001(\tB\003\340A\001\022\025\n\010hostn" +
      "ame\030\003 \001(\tB\003\340A\002\022B\n\023server_certificates\030\004 " +
      "\003(\0132 .google.cloud.kms.v1.CertificateB\003\340" +
      "A\002:s\352Ap\n%cloudkms.googleapis.com/EkmConn" +
      "ection\022Gprojects/{project}/locations/{lo" +
      "cation}/ekmConnections/{ekm_connection}2" +
      "\261\007\n\nEkmService\022\272\001\n\022ListEkmConnections\022.." +
      "google.cloud.kms.v1.ListEkmConnectionsRe" +
      "quest\032/.google.cloud.kms.v1.ListEkmConne" +
      "ctionsResponse\"C\202\323\344\223\0024\0222/v1/{parent=proj" +
      "ects/*/locations/*}/ekmConnections\332A\006par" +
      "ent\022\247\001\n\020GetEkmConnection\022,.google.cloud." +
      "kms.v1.GetEkmConnectionRequest\032\".google." +
      "cloud.kms.v1.EkmConnection\"A\202\323\344\223\0024\0222/v1/" +
      "{name=projects/*/locations/*/ekmConnecti" +
      "ons/*}\332A\004name\022\340\001\n\023CreateEkmConnection\022/." +
      "google.cloud.kms.v1.CreateEkmConnectionR" +
      "equest\032\".google.cloud.kms.v1.EkmConnecti" +
      "on\"t\202\323\344\223\002D\"2/v1/{parent=projects/*/locat" +
      "ions/*}/ekmConnections:\016ekm_connection\332A" +
      "\'parent,ekm_connection_id,ekm_connection" +
      "\022\342\001\n\023UpdateEkmConnection\022/.google.cloud." +
      "kms.v1.UpdateEkmConnectionRequest\032\".goog" +
      "le.cloud.kms.v1.EkmConnection\"v\202\323\344\223\002S2A/" +
      "v1/{ekm_connection.name=projects/*/locat" +
      "ions/*/ekmConnections/*}:\016ekm_connection" +
      "\332A\032ekm_connection,update_mask\032t\312A\027cloudk" +
      "ms.googleapis.com\322AWhttps://www.googleap" +
      "is.com/auth/cloud-platform,https://www.g" +
      "oogleapis.com/auth/cloudkmsB\222\002\n\027com.goog" +
      "le.cloud.kms.v1B\017EkmServiceProtoP\001Z6goog" +
      "le.golang.org/genproto/googleapis/cloud/" +
      "kms/v1;kms\370\001\001\252\002\023Google.Cloud.Kms.V1\312\002\023Go" +
      "ogle\\Cloud\\Kms\\V1\352A|\n\'servicedirectory.g" +
      "oogleapis.com/Service\022Qprojects/{project" +
      "}/locations/{location}/namespaces/{names" +
      "pace}/services/{service}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ListEkmConnectionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_ListEkmConnectionsResponse_descriptor,
        new java.lang.String[] { "EkmConnections", "NextPageToken", "TotalSize", });
    internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_GetEkmConnectionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_CreateEkmConnectionRequest_descriptor,
        new java.lang.String[] { "Parent", "EkmConnectionId", "EkmConnection", });
    internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_UpdateEkmConnectionRequest_descriptor,
        new java.lang.String[] { "EkmConnection", "UpdateMask", });
    internal_static_google_cloud_kms_v1_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_Certificate_descriptor,
        new java.lang.String[] { "RawDer", "Parsed", "Issuer", "Subject", "SubjectAlternativeDnsNames", "NotBeforeTime", "NotAfterTime", "SerialNumber", "Sha256Fingerprint", });
    internal_static_google_cloud_kms_v1_EkmConnection_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_EkmConnection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_EkmConnection_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "ServiceResolvers", "Etag", });
    internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_descriptor =
      internal_static_google_cloud_kms_v1_EkmConnection_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_kms_v1_EkmConnection_ServiceResolver_descriptor,
        new java.lang.String[] { "ServiceDirectoryService", "EndpointFilter", "Hostname", "ServerCertificates", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}