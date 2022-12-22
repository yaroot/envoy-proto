// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/subscriber_event.proto

package com.google.cloud.channel.v1;

public final class SubscriberEventProto {
  private SubscriberEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_channel_v1_CustomerEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_CustomerEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_channel_v1_EntitlementEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_EntitlementEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_channel_v1_SubscriberEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_SubscriberEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/channel/v1/subscriber_eve" +
      "nt.proto\022\027google.cloud.channel.v1\032\031googl" +
      "e/api/resource.proto\"\344\001\n\rCustomerEvent\022;" +
      "\n\010customer\030\001 \001(\tB)\372A&\n$cloudchannel.goog" +
      "leapis.com/Customer\022?\n\nevent_type\030\002 \001(\0162" +
      "+.google.cloud.channel.v1.CustomerEvent." +
      "Type\"U\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\032\n\026PR" +
      "IMARY_DOMAIN_CHANGED\020\001\022\033\n\027PRIMARY_DOMAIN" +
      "_VERIFIED\020\002\"\261\003\n\020EntitlementEvent\022A\n\013enti" +
      "tlement\030\001 \001(\tB,\372A)\n\'cloudchannel.googlea" +
      "pis.com/Entitlement\022B\n\nevent_type\030\002 \001(\0162" +
      "..google.cloud.channel.v1.EntitlementEve" +
      "nt.Type\"\225\002\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\013" +
      "\n\007CREATED\020\001\022\027\n\023PRICE_PLAN_SWITCHED\020\003\022\026\n\022" +
      "COMMITMENT_CHANGED\020\004\022\013\n\007RENEWED\020\005\022\r\n\tSUS" +
      "PENDED\020\006\022\r\n\tACTIVATED\020\007\022\r\n\tCANCELLED\020\010\022\017" +
      "\n\013SKU_CHANGED\020\t\022\033\n\027RENEWAL_SETTING_CHANG" +
      "ED\020\n\022\030\n\024PAID_SERVICE_STARTED\020\013\022\036\n\032LICENS" +
      "E_ASSIGNMENT_CHANGED\020\014\022\027\n\023LICENSE_CAP_CH" +
      "ANGED\020\r\"\244\001\n\017SubscriberEvent\022@\n\016customer_" +
      "event\030\001 \001(\0132&.google.cloud.channel.v1.Cu" +
      "stomerEventH\000\022F\n\021entitlement_event\030\002 \001(\013" +
      "2).google.cloud.channel.v1.EntitlementEv" +
      "entH\000B\007\n\005eventBu\n\033com.google.cloud.chann" +
      "el.v1B\024SubscriberEventProtoP\001Z>google.go" +
      "lang.org/genproto/googleapis/cloud/chann" +
      "el/v1;channelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_channel_v1_CustomerEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_CustomerEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_channel_v1_CustomerEvent_descriptor,
        new java.lang.String[] { "Customer", "EventType", });
    internal_static_google_cloud_channel_v1_EntitlementEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_channel_v1_EntitlementEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_channel_v1_EntitlementEvent_descriptor,
        new java.lang.String[] { "Entitlement", "EventType", });
    internal_static_google_cloud_channel_v1_SubscriberEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_channel_v1_SubscriberEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_channel_v1_SubscriberEvent_descriptor,
        new java.lang.String[] { "CustomerEvent", "EntitlementEvent", "Event", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}