// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2/error_details.proto

package com.google.apps.drive.labels.v2;

public final class ErrorDetailsProto {
  private ErrorDetailsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2_InvalidArgument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2_InvalidArgument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2_InvalidArgument_FieldViolation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2_InvalidArgument_FieldViolation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2_PreconditionFailure_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2_PreconditionFailure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2_PreconditionFailure_Violation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2_PreconditionFailure_Violation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/apps/drive/labels/v2/error_deta" +
      "ils.proto\022\033google.apps.drive.labels.v2\"\271" +
      "\003\n\017InvalidArgument\022U\n\020field_violations\030\001" +
      " \003(\0132;.google.apps.drive.labels.v2.Inval" +
      "idArgument.FieldViolation\032\316\002\n\016FieldViola" +
      "tion\022\r\n\005field\030\001 \001(\t\022R\n\006reason\030\002 \001(\0162B.go" +
      "ogle.apps.drive.labels.v2.InvalidArgumen" +
      "t.FieldViolation.Reason\022\027\n\017display_messa" +
      "ge\030\003 \001(\t\"\277\001\n\006Reason\022\026\n\022REASON_UNSPECIFIE" +
      "D\020\000\022\022\n\016FIELD_REQUIRED\020\001\022\021\n\rINVALID_VALUE" +
      "\020\002\022\026\n\022VALUE_OUT_OF_RANGE\020\003\022\031\n\025STRING_VAL" +
      "UE_TOO_LONG\020\004\022\030\n\024MAX_ENTRIES_EXCEEDED\020\005\022" +
      "\023\n\017FIELD_NOT_FOUND\020\006\022\024\n\020CHOICE_NOT_FOUND" +
      "\020\007\"\235\004\n\023PreconditionFailure\022M\n\tviolation\030" +
      "\001 \003(\0132:.google.apps.drive.labels.v2.Prec" +
      "onditionFailure.Violation\032\266\003\n\tViolation\022" +
      "\r\n\005field\030\001 \001(\t\022Q\n\006reason\030\002 \001(\0162A.google." +
      "apps.drive.labels.v2.PreconditionFailure" +
      ".Violation.Reason\022\027\n\017display_message\030\003 \001" +
      "(\t\"\255\002\n\006Reason\022\026\n\022REASON_UNSPECIFIED\020\000\022\022\n" +
      "\016CANNOT_DISABLE\020\001\022\021\n\rCANNOT_ENABLE\020\002\022\022\n\016" +
      "CANNOT_PUBLISH\020\003\022\024\n\020CANNOT_UNPUBLISH\020\004\022\021" +
      "\n\rCANNOT_DELETE\020\005\022\031\n\025CANNOT_RESTRICT_RAN" +
      "GE\020\006\022!\n\035CANNOT_CHANGE_PUBLISHED_FIELD\020\007\022" +
      "\035\n\031CANNOT_CREATE_MORE_LABELS\020\010\022&\n\"CANNOT" +
      "_CHANGE_PUBLISHED_FIELD_TYPE\020\t\022\"\n\036CANNOT" +
      "_MODIFY_LOCKED_COMPONENT\020\nBy\n\037com.google" +
      ".apps.drive.labels.v2B\021ErrorDetailsProto" +
      "P\001ZAgoogle.golang.org/genproto/googleapi" +
      "s/apps/drive/labels/v2;labelsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_apps_drive_labels_v2_InvalidArgument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_drive_labels_v2_InvalidArgument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2_InvalidArgument_descriptor,
        new java.lang.String[] { "FieldViolations", });
    internal_static_google_apps_drive_labels_v2_InvalidArgument_FieldViolation_descriptor =
      internal_static_google_apps_drive_labels_v2_InvalidArgument_descriptor.getNestedTypes().get(0);
    internal_static_google_apps_drive_labels_v2_InvalidArgument_FieldViolation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2_InvalidArgument_FieldViolation_descriptor,
        new java.lang.String[] { "Field", "Reason", "DisplayMessage", });
    internal_static_google_apps_drive_labels_v2_PreconditionFailure_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_drive_labels_v2_PreconditionFailure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2_PreconditionFailure_descriptor,
        new java.lang.String[] { "Violation", });
    internal_static_google_apps_drive_labels_v2_PreconditionFailure_Violation_descriptor =
      internal_static_google_apps_drive_labels_v2_PreconditionFailure_descriptor.getNestedTypes().get(0);
    internal_static_google_apps_drive_labels_v2_PreconditionFailure_Violation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2_PreconditionFailure_Violation_descriptor,
        new java.lang.String[] { "Field", "Reason", "DisplayMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}