// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2/exception_detail.proto

package com.google.apps.drive.labels.v2;

public final class ExceptionDetailProto {
  private ExceptionDetailProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_apps_drive_labels_v2_ExceptionDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_drive_labels_v2_ExceptionDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/apps/drive/labels/v2/exception_" +
      "detail.proto\022\033google.apps.drive.labels.v" +
      "2\"Q\n\017ExceptionDetail\022>\n\nerror_type\030\001 \001(\016" +
      "2*.google.apps.drive.labels.v2.Exception" +
      "Type*\341\006\n\rExceptionType\022\036\n\032EXCEPTION_TYPE" +
      "_UNSPECIFIED\020\000\022\022\n\016FIELD_REQUIRED\020\001\022\034\n\030ME" +
      "TAMODEL_ALREADY_EXISTS\020\002\022\027\n\023METAMODEL_NO" +
      "T_FOUND\020\003\022&\n\"ILLEGAL_METAMODEL_STATE_TRA" +
      "NSITION\020\004\022(\n$INVALID_METAMODEL_DEPRECATI" +
      "ON_POLICY\020\005\022#\n\037METAMODEL_DELETION_DENIED" +
      "_UNTIL\020\006\022\021\n\rINVALID_FIELD\020\007\022!\n\035METAMODEL" +
      "_PRECONDITION_FAILED\020\010\022\027\n\023DUPLICATE_FIEL" +
      "D_KEY\020\t\022\031\n\025ILLEGAL_FIELD_REMOVAL\020\n\022#\n\037IL" +
      "LEGAL_FIELD_OPTIONS_FOR_FIELD\020\013\022-\n)UNSUP" +
      "PORTED_CHANGE_TO_PUBLISHED_METAMODEL\020\014\0220" +
      "\n,ILLEGAL_METAMODEL_STATE_TRANSITION_IN_" +
      "UPDATE\020\r\022\026\n\022PAGE_TOKEN_EXPIRED\020\016\022\022\n\016NOT_" +
      "AUTHORIZED\020\017\022\"\n\036ILLEGAL_FIELD_STATE_TRAN" +
      "SITION\020\020\022.\n*ILLEGAL_CHOICE_SET_OPTION_ST" +
      "ATE_TRANSITION\020\021\022\036\n\032INVALID_CHOICE_SET_O" +
      "PTIONS\020\022\022\025\n\021INVALID_FIELD_KEY\020\023\022 \n\034INVAL" +
      "ID_FIELD_PROPERTY_RANGE\020\024\022\034\n\030INVALID_LOC" +
      "ALIZED_STRING\020\025\022%\n!ILLEGAL_CHANGE_TO_PUB" +
      "LISHED_FIELD\020\026\022&\n\"INVALID_FIELD_UPDATE_N" +
      "OT_INCLUSIVE\020\027\022\034\n\030INVALID_CHOICE_SET_STA" +
      "TE\020\030\022\032\n\025INTERNAL_SERVER_ERROR\020\364\003B|\n\037com." +
      "google.apps.drive.labels.v2B\024ExceptionDe" +
      "tailProtoP\001ZAgoogle.golang.org/genproto/" +
      "googleapis/apps/drive/labels/v2;labelsb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_apps_drive_labels_v2_ExceptionDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_drive_labels_v2_ExceptionDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_apps_drive_labels_v2_ExceptionDetail_descriptor,
        new java.lang.String[] { "ErrorType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}