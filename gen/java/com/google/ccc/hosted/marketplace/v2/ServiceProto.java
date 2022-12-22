// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/market/v2/services.proto

package com.google.ccc.hosted.marketplace.v2;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ccc_hosted_marketplace_v2_CustomerLicenseGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ccc_hosted_marketplace_v2_CustomerLicenseGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ccc_hosted_marketplace_v2_UserLicenseGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ccc_hosted_marketplace_v2_UserLicenseGetRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/apps/market/v2/services.proto\022\031" +
      "ccc.hosted.marketplace.v2\032\034google/api/an" +
      "notations.proto\032%google/apps/market/v2/r" +
      "esources.proto\032\027google/api/client.proto\"" +
      "H\n\031CustomerLicenseGetRequest\022\026\n\016applicat" +
      "ion_id\030\001 \001(\t\022\023\n\013customer_id\030\002 \001(\t\"u\n\036Lic" +
      "enseNotificationListRequest\022\026\n\016applicati" +
      "on_id\030\001 \001(\t\022\023\n\013max_results\030\002 \001(\r\022\023\n\013star" +
      "t_token\030\003 \001(\t\022\021\n\ttimestamp\030\004 \001(\004\"@\n\025User" +
      "LicenseGetRequest\022\026\n\016application_id\030\001 \001(" +
      "\t\022\017\n\007user_id\030\002 \001(\t2\241\002\n\026CustomerLicenseSe" +
      "rvice\022\256\001\n\003Get\0224.ccc.hosted.marketplace.v" +
      "2.CustomerLicenseGetRequest\032*.ccc.hosted" +
      ".marketplace.v2.CustomerLicense\"E\202\323\344\223\002?\022" +
      "=/appsmarket/v2/customerLicense/{applica" +
      "tion_id}/{customer_id}\032V\312A\031appsmarket.go" +
      "ogleapis.com\322A7https://www.googleapis.co" +
      "m/auth/appsmarketplace.license2\254\002\n\032Licen" +
      "seNotificationService\022\265\001\n\004List\0229.ccc.hos" +
      "ted.marketplace.v2.LicenseNotificationLi" +
      "stRequest\0322.ccc.hosted.marketplace.v2.Li" +
      "censeNotificationList\">\202\323\344\223\0028\0223/appsmark" +
      "et/v2/licenseNotification/{application_i" +
      "d}:\001*\032V\312A\031appsmarket.googleapis.com\322A7ht" +
      "tps://www.googleapis.com/auth/appsmarket" +
      "place.license2\215\002\n\022UserLicenseService\022\236\001\n" +
      "\003Get\0220.ccc.hosted.marketplace.v2.UserLic" +
      "enseGetRequest\032&.ccc.hosted.marketplace." +
      "v2.UserLicense\"=\202\323\344\223\0027\0225/appsmarket/v2/u" +
      "serLicense/{application_id}/{user_id}\032V\312" +
      "A\031appsmarket.googleapis.com\322A7https://ww" +
      "w.googleapis.com/auth/appsmarketplace.li" +
      "censeB\233\001\n$com.google.ccc.hosted.marketpl" +
      "ace.v2B\014ServiceProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ccc/hosted/marketp" +
      "lace/v2;marketplace\312\002\025Google\\Apps\\Market" +
      "\\V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.ccc.hosted.marketplace.v2.ResourcesProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_ccc_hosted_marketplace_v2_CustomerLicenseGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ccc_hosted_marketplace_v2_CustomerLicenseGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ccc_hosted_marketplace_v2_CustomerLicenseGetRequest_descriptor,
        new java.lang.String[] { "ApplicationId", "CustomerId", });
    internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ccc_hosted_marketplace_v2_LicenseNotificationListRequest_descriptor,
        new java.lang.String[] { "ApplicationId", "MaxResults", "StartToken", "Timestamp", });
    internal_static_ccc_hosted_marketplace_v2_UserLicenseGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ccc_hosted_marketplace_v2_UserLicenseGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ccc_hosted_marketplace_v2_UserLicenseGetRequest_descriptor,
        new java.lang.String[] { "ApplicationId", "UserId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.ccc.hosted.marketplace.v2.ResourcesProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}