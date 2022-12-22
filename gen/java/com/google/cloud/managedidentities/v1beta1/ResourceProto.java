// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/managedidentities/v1beta1/resource.proto

package com.google.cloud.managedidentities.v1beta1;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_managedidentities_v1beta1_Domain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1beta1_Domain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_managedidentities_v1beta1_Domain_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1beta1_Domain_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_managedidentities_v1beta1_Trust_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1beta1_Trust_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/managedidentities/v1beta1" +
      "/resource.proto\022&google.cloud.managedide" +
      "ntities.v1beta1\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032\037goo" +
      "gle/protobuf/timestamp.proto\"\255\006\n\006Domain\022" +
      "\021\n\004name\030\001 \001(\tB\003\340A\003\022O\n\006labels\030\002 \003(\0132:.goo" +
      "gle.cloud.managedidentities.v1beta1.Doma" +
      "in.LabelsEntryB\003\340A\001\022 \n\023authorized_networ" +
      "ks\030\003 \003(\tB\003\340A\001\022\036\n\021reserved_ip_range\030\004 \001(\t" +
      "B\003\340A\002\022\026\n\tlocations\030\005 \003(\tB\003\340A\002\022\022\n\005admin\030\006" +
      " \001(\tB\003\340A\001\022\021\n\004fqdn\030\n \001(\tB\003\340A\003\0224\n\013create_t" +
      "ime\030\013 \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\003\0224\n\013update_time\030\014 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\022H\n\005state\030\r \001(\01624.google" +
      ".cloud.managedidentities.v1beta1.Domain." +
      "StateB\003\340A\003\022\033\n\016status_message\030\016 \001(\tB\003\340A\003\022" +
      "B\n\006trusts\030\017 \003(\0132-.google.cloud.managedid" +
      "entities.v1beta1.TrustB\003\340A\003\032-\n\013LabelsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\217\001\n\005S" +
      "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020" +
      "\001\022\t\n\005READY\020\002\022\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004" +
      "\022\r\n\tREPAIRING\020\005\022\032\n\026PERFORMING_MAINTENANC" +
      "E\020\006\022\017\n\013UNAVAILABLE\020\007:f\352Ac\n\'managedidenti" +
      "ties.googleapis.com/Domain\0228projects/{pr" +
      "oject}/locations/{location}/domains/{dom" +
      "ain}\"\327\006\n\005Trust\022\032\n\022target_domain_name\030\001 \001" +
      "(\t\022K\n\ntrust_type\030\002 \001(\01627.google.cloud.ma" +
      "nagedidentities.v1beta1.Trust.TrustType\022" +
      "U\n\017trust_direction\030\003 \001(\0162<.google.cloud." +
      "managedidentities.v1beta1.Trust.TrustDir" +
      "ection\022 \n\030selective_authentication\030\004 \001(\010" +
      "\022\037\n\027target_dns_ip_addresses\030\005 \003(\t\022#\n\026tru" +
      "st_handshake_secret\030\006 \001(\tB\003\340A\004\0224\n\013create" +
      "_time\030\007 \001(\0132\032.google.protobuf.TimestampB" +
      "\003\340A\003\0224\n\013update_time\030\010 \001(\0132\032.google.proto" +
      "buf.TimestampB\003\340A\003\022G\n\005state\030\t \001(\01623.goog" +
      "le.cloud.managedidentities.v1beta1.Trust" +
      ".StateB\003\340A\003\022\036\n\021state_description\030\013 \001(\tB\003" +
      "\340A\003\022B\n\031last_trust_heartbeat_time\030\014 \001(\0132\032" +
      ".google.protobuf.TimestampB\003\340A\003\"i\n\005State" +
      "\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\014\n" +
      "\010UPDATING\020\002\022\014\n\010DELETING\020\003\022\r\n\tCONNECTED\020\004" +
      "\022\020\n\014DISCONNECTED\020\005\"A\n\tTrustType\022\032\n\026TRUST" +
      "_TYPE_UNSPECIFIED\020\000\022\n\n\006FOREST\020\001\022\014\n\010EXTER" +
      "NAL\020\002\"_\n\016TrustDirection\022\037\n\033TRUST_DIRECTI" +
      "ON_UNSPECIFIED\020\000\022\013\n\007INBOUND\020\001\022\014\n\010OUTBOUN" +
      "D\020\002\022\021\n\rBIDIRECTIONAL\020\003B\224\002\n*com.google.cl" +
      "oud.managedidentities.v1beta1B\rResourceP" +
      "rotoP\001ZWgoogle.golang.org/genproto/googl" +
      "eapis/cloud/managedidentities/v1beta1;ma" +
      "nagedidentities\252\002&Google.Cloud.ManagedId" +
      "entities.V1Beta1\312\002&Google\\Cloud\\ManagedI" +
      "dentities\\V1beta1\352\002)Google::Cloud::Manag" +
      "edIdentities::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_managedidentities_v1beta1_Domain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_managedidentities_v1beta1_Domain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_managedidentities_v1beta1_Domain_descriptor,
        new java.lang.String[] { "Name", "Labels", "AuthorizedNetworks", "ReservedIpRange", "Locations", "Admin", "Fqdn", "CreateTime", "UpdateTime", "State", "StatusMessage", "Trusts", });
    internal_static_google_cloud_managedidentities_v1beta1_Domain_LabelsEntry_descriptor =
      internal_static_google_cloud_managedidentities_v1beta1_Domain_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_managedidentities_v1beta1_Domain_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_managedidentities_v1beta1_Domain_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_managedidentities_v1beta1_Trust_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_managedidentities_v1beta1_Trust_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_managedidentities_v1beta1_Trust_descriptor,
        new java.lang.String[] { "TargetDomainName", "TrustType", "TrustDirection", "SelectiveAuthentication", "TargetDnsIpAddresses", "TrustHandshakeSecret", "CreateTime", "UpdateTime", "State", "StateDescription", "LastTrustHeartbeatTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
