// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1beta1/endpoint_policy.proto

package com.google.cloud.networkservices.v1beta1;

public final class EndpointPolicyProto {
  private EndpointPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_GetEndpointPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_GetEndpointPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_CreateEndpointPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_CreateEndpointPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_UpdateEndpointPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_UpdateEndpointPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkservices_v1beta1_DeleteEndpointPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkservices_v1beta1_DeleteEndpointPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/networkservices/v1beta1/e" +
      "ndpoint_policy.proto\022$google.cloud.netwo" +
      "rkservices.v1beta1\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\0321" +
      "google/cloud/networkservices/v1beta1/com" +
      "mon.proto\032 google/protobuf/field_mask.pr" +
      "oto\032\037google/protobuf/timestamp.proto\"\240\010\n" +
      "\016EndpointPolicy\022\021\n\004name\030\001 \001(\tB\003\340A\002\0224\n\013cr" +
      "eate_time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "ampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003\022U\n\006labels\030\004 \003(\0132@" +
      ".google.cloud.networkservices.v1beta1.En" +
      "dpointPolicy.LabelsEntryB\003\340A\001\022Z\n\004type\030\005 " +
      "\001(\0162G.google.cloud.networkservices.v1bet" +
      "a1.EndpointPolicy.EndpointPolicyTypeB\003\340A" +
      "\002\022X\n\024authorization_policy\030\007 \001(\tB:\340A\001\372A4\n" +
      "2networksecurity.googleapis.com/Authoriz" +
      "ationPolicy\022T\n\020endpoint_matcher\030\t \001(\01325." +
      "google.cloud.networkservices.v1beta1.End" +
      "pointMatcherB\003\340A\002\022]\n\025traffic_port_select" +
      "or\030\n \001(\01329.google.cloud.networkservices." +
      "v1beta1.TrafficPortSelectorB\003\340A\001\022\030\n\013desc" +
      "ription\030\013 \001(\tB\003\340A\001\022Q\n\021server_tls_policy\030" +
      "\014 \001(\tB6\340A\001\372A0\n.networksecurity.googleapi" +
      "s.com/ServerTlsPolicy\022Q\n\021client_tls_poli" +
      "cy\030\r \001(\tB6\340A\001\372A0\n.networksecurity.google" +
      "apis.com/ClientTlsPolicy\032-\n\013LabelsEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"^\n\022Endpo" +
      "intPolicyType\022$\n ENDPOINT_POLICY_TYPE_UN" +
      "SPECIFIED\020\000\022\021\n\rSIDECAR_PROXY\020\001\022\017\n\013GRPC_S" +
      "ERVER\020\002:~\352A{\n-networkservices.googleapis" +
      ".com/EndpointPolicy\022Jprojects/{project}/" +
      "locations/{location}/endpointPolicies/{e" +
      "ndpoint_policy}\"\213\001\n\033ListEndpointPolicies" +
      "Request\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-network" +
      "services.googleapis.com/EndpointPolicy\022\021" +
      "\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\210\001" +
      "\n\034ListEndpointPoliciesResponse\022O\n\021endpoi" +
      "nt_policies\030\001 \003(\01324.google.cloud.network" +
      "services.v1beta1.EndpointPolicy\022\027\n\017next_" +
      "page_token\030\002 \001(\t\"_\n\030GetEndpointPolicyReq" +
      "uest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-networkservi" +
      "ces.googleapis.com/EndpointPolicy\"\331\001\n\033Cr" +
      "eateEndpointPolicyRequest\022E\n\006parent\030\001 \001(" +
      "\tB5\340A\002\372A/\022-networkservices.googleapis.co" +
      "m/EndpointPolicy\022\037\n\022endpoint_policy_id\030\002" +
      " \001(\tB\003\340A\002\022R\n\017endpoint_policy\030\003 \001(\01324.goo" +
      "gle.cloud.networkservices.v1beta1.Endpoi" +
      "ntPolicyB\003\340A\002\"\247\001\n\033UpdateEndpointPolicyRe" +
      "quest\0224\n\013update_mask\030\001 \001(\0132\032.google.prot" +
      "obuf.FieldMaskB\003\340A\001\022R\n\017endpoint_policy\030\002" +
      " \001(\01324.google.cloud.networkservices.v1be" +
      "ta1.EndpointPolicyB\003\340A\002\"b\n\033DeleteEndpoin" +
      "tPolicyRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-ne" +
      "tworkservices.googleapis.com/EndpointPol" +
      "icyB\240\005\n(com.google.cloud.networkservices" +
      ".v1beta1B\023EndpointPolicyProtoP\001ZSgoogle." +
      "golang.org/genproto/googleapis/cloud/net" +
      "workservices/v1beta1;networkservices\252\002$G" +
      "oogle.Cloud.NetworkServices.V1Beta1\312\002$Go" +
      "ogle\\Cloud\\NetworkServices\\V1beta1\352\002\'Goo" +
      "gle::Cloud::NetworkServices::V1beta1\352A\212\001" +
      "\n2networksecurity.googleapis.com/Authori" +
      "zationPolicy\022Tprojects/{project}/locatio" +
      "ns/{location}/authorizationPolicies/{aut" +
      "horization_policy}\352A\177\n.networksecurity.g" +
      "oogleapis.com/ServerTlsPolicy\022Mprojects/" +
      "{project}/locations/{location}/serverTls" +
      "Policies/{server_tls_policy}\352A\177\n.network" +
      "security.googleapis.com/ClientTlsPolicy\022" +
      "Mprojects/{project}/locations/{location}" +
      "/clientTlsPolicies/{client_tls_policy}b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.networkservices.v1beta1.CommonProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Type", "AuthorizationPolicy", "EndpointMatcher", "TrafficPortSelector", "Description", "ServerTlsPolicy", "ClientTlsPolicy", });
    internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_LabelsEntry_descriptor =
      internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_EndpointPolicy_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_ListEndpointPoliciesResponse_descriptor,
        new java.lang.String[] { "EndpointPolicies", "NextPageToken", });
    internal_static_google_cloud_networkservices_v1beta1_GetEndpointPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkservices_v1beta1_GetEndpointPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_GetEndpointPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkservices_v1beta1_CreateEndpointPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkservices_v1beta1_CreateEndpointPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_CreateEndpointPolicyRequest_descriptor,
        new java.lang.String[] { "Parent", "EndpointPolicyId", "EndpointPolicy", });
    internal_static_google_cloud_networkservices_v1beta1_UpdateEndpointPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkservices_v1beta1_UpdateEndpointPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_UpdateEndpointPolicyRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "EndpointPolicy", });
    internal_static_google_cloud_networkservices_v1beta1_DeleteEndpointPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkservices_v1beta1_DeleteEndpointPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkservices_v1beta1_DeleteEndpointPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networkservices.v1beta1.CommonProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}