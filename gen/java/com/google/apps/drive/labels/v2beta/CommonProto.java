// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/common.proto

package com.google.apps.drive.labels.v2beta;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2beta_Lifecycle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2beta_Lifecycle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2beta_Lifecycle_DisabledPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2beta_Lifecycle_DisabledPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2beta_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2beta_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2beta_BadgeConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2beta_BadgeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2beta_BadgeColors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2beta_BadgeColors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2beta_LockStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2beta_LockStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/apps/drive/labels/v2beta/common" +
      ".proto\022\037google.apps.drive.labels.v2beta\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\027google/type/color.p" +
      "roto\"\355\002\n\tLifecycle\022D\n\005state\030\001 \001(\01620.goog" +
      "le.apps.drive.labels.v2beta.Lifecycle.St" +
      "ateB\003\340A\003\022$\n\027has_unpublished_changes\030\002 \001(" +
      "\010B\003\340A\003\022R\n\017disabled_policy\030\003 \001(\01329.google" +
      ".apps.drive.labels.v2beta.Lifecycle.Disa" +
      "bledPolicy\032?\n\016DisabledPolicy\022\026\n\016hide_in_" +
      "search\030\001 \001(\010\022\025\n\rshow_in_apply\030\002 \001(\010\"_\n\005S" +
      "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\025\n\021UNPUBLISH" +
      "ED_DRAFT\020\001\022\r\n\tPUBLISHED\020\002\022\014\n\010DISABLED\020\003\022" +
      "\013\n\007DELETED\020\004\"=\n\010UserInfo\0221\n\006person\030\001 \001(\t" +
      "B!\372A\036\n\034people.googleapis.com/Person\"K\n\013B" +
      "adgeConfig\022!\n\005color\030\001 \001(\0132\022.google.type." +
      "Color\022\031\n\021priority_override\030\002 \001(\003\"\240\001\n\013Bad" +
      "geColors\0221\n\020background_color\030\001 \001(\0132\022.goo" +
      "gle.type.ColorB\003\340A\003\0221\n\020foreground_color\030" +
      "\002 \001(\0132\022.google.type.ColorB\003\340A\003\022+\n\nsolo_c" +
      "olor\030\003 \001(\0132\022.google.type.ColorB\003\340A\003\"!\n\nL" +
      "ockStatus\022\023\n\006locked\030\001 \001(\010B\003\340A\003B\265\001\n#com.g" +
      "oogle.apps.drive.labels.v2betaB\013CommonPr" +
      "otoP\001ZEgoogle.golang.org/genproto/google" +
      "apis/apps/drive/labels/v2beta;labels\242\002\004D" +
      "LBL\352A0\n\034people.googleapis.com/Person\022\020pe" +
      "rsons/{person}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.type.ColorProto.getDescriptor(),
        });
    internal_static_google_apps_drive_labels_v2beta_Lifecycle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_drive_labels_v2beta_Lifecycle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2beta_Lifecycle_descriptor,
        new java.lang.String[] { "State", "HasUnpublishedChanges", "DisabledPolicy", });
    internal_static_google_apps_drive_labels_v2beta_Lifecycle_DisabledPolicy_descriptor =
      internal_static_google_apps_drive_labels_v2beta_Lifecycle_descriptor.getNestedTypes().get(0);
    internal_static_google_apps_drive_labels_v2beta_Lifecycle_DisabledPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2beta_Lifecycle_DisabledPolicy_descriptor,
        new java.lang.String[] { "HideInSearch", "ShowInApply", });
    internal_static_google_apps_drive_labels_v2beta_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_drive_labels_v2beta_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2beta_UserInfo_descriptor,
        new java.lang.String[] { "Person", });
    internal_static_google_apps_drive_labels_v2beta_BadgeConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_apps_drive_labels_v2beta_BadgeConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2beta_BadgeConfig_descriptor,
        new java.lang.String[] { "Color", "PriorityOverride", });
    internal_static_google_apps_drive_labels_v2beta_BadgeColors_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_apps_drive_labels_v2beta_BadgeColors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2beta_BadgeColors_descriptor,
        new java.lang.String[] { "BackgroundColor", "ForegroundColor", "SoloColor", });
    internal_static_google_apps_drive_labels_v2beta_LockStatus_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_apps_drive_labels_v2beta_LockStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2beta_LockStatus_descriptor,
        new java.lang.String[] { "Locked", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.type.ColorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}