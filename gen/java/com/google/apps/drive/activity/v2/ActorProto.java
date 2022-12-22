// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/activity/v2/actor.proto

package com.google.apps.drive.activity.v2;

public final class ActorProto {
  private ActorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_Actor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_Actor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_User_KnownUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_User_KnownUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_User_DeletedUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_User_DeletedUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_User_UnknownUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_User_UnknownUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_AnonymousUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_AnonymousUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_Impersonation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_Impersonation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_SystemEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_SystemEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_activity_v2_Administrator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_activity_v2_Administrator_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/apps/drive/activity/v2/actor.pr" +
      "oto\022\035google.apps.drive.activity.v2\"\323\002\n\005A" +
      "ctor\0223\n\004user\030\001 \001(\0132#.google.apps.drive.a" +
      "ctivity.v2.UserH\000\022A\n\tanonymous\030\002 \001(\0132,.g" +
      "oogle.apps.drive.activity.v2.AnonymousUs" +
      "erH\000\022E\n\rimpersonation\030\003 \001(\0132,.google.app" +
      "s.drive.activity.v2.ImpersonationH\000\022<\n\006s" +
      "ystem\030\004 \001(\0132*.google.apps.drive.activity" +
      ".v2.SystemEventH\000\022E\n\radministrator\030\005 \001(\013" +
      "2,.google.apps.drive.activity.v2.Adminis" +
      "tratorH\000B\006\n\004type\"\276\002\n\004User\022C\n\nknown_user\030" +
      "\002 \001(\0132-.google.apps.drive.activity.v2.Us" +
      "er.KnownUserH\000\022G\n\014deleted_user\030\003 \001(\0132/.g" +
      "oogle.apps.drive.activity.v2.User.Delete" +
      "dUserH\000\022G\n\014unknown_user\030\004 \001(\0132/.google.a" +
      "pps.drive.activity.v2.User.UnknownUserH\000" +
      "\0329\n\tKnownUser\022\023\n\013person_name\030\001 \001(\t\022\027\n\017is" +
      "_current_user\030\002 \001(\010\032\r\n\013DeletedUser\032\r\n\013Un" +
      "knownUserB\006\n\004type\"\017\n\rAnonymousUser\"O\n\rIm" +
      "personation\022>\n\021impersonated_user\030\001 \001(\0132#" +
      ".google.apps.drive.activity.v2.User\"\223\001\n\013" +
      "SystemEvent\022=\n\004type\030\001 \001(\0162/.google.apps." +
      "drive.activity.v2.SystemEvent.Type\"E\n\004Ty" +
      "pe\022\024\n\020TYPE_UNSPECIFIED\020\000\022\021\n\rUSER_DELETIO" +
      "N\020\001\022\024\n\020TRASH_AUTO_PURGE\020\002\"\017\n\rAdministrat" +
      "orB\277\001\n!com.google.apps.drive.activity.v2" +
      "B\nActorProtoP\001ZEgoogle.golang.org/genpro" +
      "to/googleapis/apps/drive/activity/v2;act" +
      "ivity\242\002\004GADA\252\002\035Google.Apps.Drive.Activit" +
      "y.V2\312\002\035Google\\Apps\\Drive\\Activity\\V2b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_apps_drive_activity_v2_Actor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_drive_activity_v2_Actor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_Actor_descriptor,
        new java.lang.String[] { "User", "Anonymous", "Impersonation", "System", "Administrator", "Type", });
    internal_static_google_apps_drive_activity_v2_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_drive_activity_v2_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_User_descriptor,
        new java.lang.String[] { "KnownUser", "DeletedUser", "UnknownUser", "Type", });
    internal_static_google_apps_drive_activity_v2_User_KnownUser_descriptor =
      internal_static_google_apps_drive_activity_v2_User_descriptor.getNestedTypes().get(0);
    internal_static_google_apps_drive_activity_v2_User_KnownUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_User_KnownUser_descriptor,
        new java.lang.String[] { "PersonName", "IsCurrentUser", });
    internal_static_google_apps_drive_activity_v2_User_DeletedUser_descriptor =
      internal_static_google_apps_drive_activity_v2_User_descriptor.getNestedTypes().get(1);
    internal_static_google_apps_drive_activity_v2_User_DeletedUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_User_DeletedUser_descriptor,
        new java.lang.String[] { });
    internal_static_google_apps_drive_activity_v2_User_UnknownUser_descriptor =
      internal_static_google_apps_drive_activity_v2_User_descriptor.getNestedTypes().get(2);
    internal_static_google_apps_drive_activity_v2_User_UnknownUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_User_UnknownUser_descriptor,
        new java.lang.String[] { });
    internal_static_google_apps_drive_activity_v2_AnonymousUser_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_apps_drive_activity_v2_AnonymousUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_AnonymousUser_descriptor,
        new java.lang.String[] { });
    internal_static_google_apps_drive_activity_v2_Impersonation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_apps_drive_activity_v2_Impersonation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_Impersonation_descriptor,
        new java.lang.String[] { "ImpersonatedUser", });
    internal_static_google_apps_drive_activity_v2_SystemEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_apps_drive_activity_v2_SystemEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_SystemEvent_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_google_apps_drive_activity_v2_Administrator_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_apps_drive_activity_v2_Administrator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_activity_v2_Administrator_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}