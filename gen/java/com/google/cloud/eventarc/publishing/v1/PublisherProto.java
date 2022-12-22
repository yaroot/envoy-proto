// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/publishing/v1/publisher.proto

package com.google.cloud.eventarc.publishing.v1;

public final class PublisherProto {
  private PublisherProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/eventarc/publishing/v1/pu" +
      "blisher.proto\022#google.cloud.eventarc.pub" +
      "lishing.v1\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\031google/protob" +
      "uf/any.proto\"~\n%PublishChannelConnection" +
      "EventsRequest\022\032\n\022channel_connection\030\001 \001(" +
      "\t\022$\n\006events\030\002 \003(\0132\024.google.protobuf.Any\022" +
      "\023\n\013text_events\030\003 \003(\t\"(\n&PublishChannelCo" +
      "nnectionEventsResponse\"b\n\024PublishEventsR" +
      "equest\022\017\n\007channel\030\001 \001(\t\022$\n\006events\030\002 \003(\0132" +
      "\024.google.protobuf.Any\022\023\n\013text_events\030\003 \003" +
      "(\t\"\027\n\025PublishEventsResponse2\320\004\n\tPublishe" +
      "r\022\230\002\n\036PublishChannelConnectionEvents\022J.g" +
      "oogle.cloud.eventarc.publishing.v1.Publi" +
      "shChannelConnectionEventsRequest\032K.googl" +
      "e.cloud.eventarc.publishing.v1.PublishCh" +
      "annelConnectionEventsResponse\"]\202\323\344\223\002W\"R/" +
      "v1/{channel_connection=projects/*/locati" +
      "ons/*/channelConnections/*}:publishEvent" +
      "s:\001*\022\320\001\n\rPublishEvents\0229.google.cloud.ev" +
      "entarc.publishing.v1.PublishEventsReques" +
      "t\032:.google.cloud.eventarc.publishing.v1." +
      "PublishEventsResponse\"H\202\323\344\223\002B\"=/v1/{chan" +
      "nel=projects/*/locations/*/channels/*}:p" +
      "ublishEvents:\001*\032U\312A!eventarcpublishing.g" +
      "oogleapis.com\322A.https://www.googleapis.c" +
      "om/auth/cloud-platformB\377\001\n\'com.google.cl" +
      "oud.eventarc.publishing.v1B\016PublisherPro" +
      "toP\001ZLgoogle.golang.org/genproto/googlea" +
      "pis/cloud/eventarc/publishing/v1;publish" +
      "er\252\002#Google.Cloud.Eventarc.Publishing.V1" +
      "\312\002#Google\\Cloud\\Eventarc\\Publishing\\V1\352\002" +
      "\'Google::Cloud::Eventarc::Publishing::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor,
        new java.lang.String[] { "ChannelConnection", "Events", "TextEvents", });
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_descriptor,
        new java.lang.String[] { "Channel", "Events", "TextEvents", });
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}