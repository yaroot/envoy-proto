// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/write.proto

package com.google.firestore.v1beta1;

public final class WriteProto {
  private WriteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_Write_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Write_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_DocumentTransform_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_WriteResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_WriteResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_DocumentChange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentChange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_DocumentDelete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentDelete_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_DocumentRemove_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentRemove_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_v1beta1_ExistenceFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_ExistenceFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/firestore/v1beta1/write.proto\022\030" +
      "google.firestore.v1beta1\032%google/firesto" +
      "re/v1beta1/common.proto\032\'google/firestor" +
      "e/v1beta1/document.proto\032\037google/protobu" +
      "f/timestamp.proto\"\364\002\n\005Write\0224\n\006update\030\001 " +
      "\001(\0132\".google.firestore.v1beta1.DocumentH" +
      "\000\022\020\n\006delete\030\002 \001(\tH\000\022@\n\ttransform\030\006 \001(\0132+" +
      ".google.firestore.v1beta1.DocumentTransf" +
      "ormH\000\022;\n\013update_mask\030\003 \001(\0132&.google.fire" +
      "store.v1beta1.DocumentMask\022U\n\021update_tra" +
      "nsforms\030\007 \003(\0132:.google.firestore.v1beta1" +
      ".DocumentTransform.FieldTransform\022@\n\020cur" +
      "rent_document\030\004 \001(\0132&.google.firestore.v" +
      "1beta1.PreconditionB\013\n\toperation\"\210\005\n\021Doc" +
      "umentTransform\022\020\n\010document\030\001 \001(\t\022T\n\020fiel" +
      "d_transforms\030\002 \003(\0132:.google.firestore.v1" +
      "beta1.DocumentTransform.FieldTransform\032\212" +
      "\004\n\016FieldTransform\022\022\n\nfield_path\030\001 \001(\t\022e\n" +
      "\023set_to_server_value\030\002 \001(\0162F.google.fire" +
      "store.v1beta1.DocumentTransform.FieldTra" +
      "nsform.ServerValueH\000\0224\n\tincrement\030\003 \001(\0132" +
      "\037.google.firestore.v1beta1.ValueH\000\0222\n\007ma" +
      "ximum\030\004 \001(\0132\037.google.firestore.v1beta1.V" +
      "alueH\000\0222\n\007minimum\030\005 \001(\0132\037.google.firesto" +
      "re.v1beta1.ValueH\000\022G\n\027append_missing_ele" +
      "ments\030\006 \001(\0132$.google.firestore.v1beta1.A" +
      "rrayValueH\000\022E\n\025remove_all_from_array\030\007 \001" +
      "(\0132$.google.firestore.v1beta1.ArrayValue" +
      "H\000\"=\n\013ServerValue\022\034\n\030SERVER_VALUE_UNSPEC" +
      "IFIED\020\000\022\020\n\014REQUEST_TIME\020\001B\020\n\016transform_t" +
      "ype\"z\n\013WriteResult\022/\n\013update_time\030\001 \001(\0132" +
      "\032.google.protobuf.Timestamp\022:\n\021transform" +
      "_results\030\002 \003(\0132\037.google.firestore.v1beta" +
      "1.Value\"v\n\016DocumentChange\0224\n\010document\030\001 " +
      "\001(\0132\".google.firestore.v1beta1.Document\022" +
      "\022\n\ntarget_ids\030\005 \003(\005\022\032\n\022removed_target_id" +
      "s\030\006 \003(\005\"m\n\016DocumentDelete\022\020\n\010document\030\001 " +
      "\001(\t\022\032\n\022removed_target_ids\030\006 \003(\005\022-\n\tread_" +
      "time\030\004 \001(\0132\032.google.protobuf.Timestamp\"m" +
      "\n\016DocumentRemove\022\020\n\010document\030\001 \001(\t\022\032\n\022re" +
      "moved_target_ids\030\002 \003(\005\022-\n\tread_time\030\004 \001(" +
      "\0132\032.google.protobuf.Timestamp\"3\n\017Existen" +
      "ceFilter\022\021\n\ttarget_id\030\001 \001(\005\022\r\n\005count\030\002 \001" +
      "(\005B\334\001\n\034com.google.firestore.v1beta1B\nWri" +
      "teProtoP\001ZAgoogle.golang.org/genproto/go" +
      "ogleapis/firestore/v1beta1;firestore\242\002\004G" +
      "CFS\252\002\036Google.Cloud.Firestore.V1Beta1\312\002\036G" +
      "oogle\\Cloud\\Firestore\\V1beta1\352\002!Google::" +
      "Cloud::Firestore::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.firestore.v1beta1.CommonProto.getDescriptor(),
          com.google.firestore.v1beta1.DocumentProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_firestore_v1beta1_Write_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1beta1_Write_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_Write_descriptor,
        new java.lang.String[] { "Update", "Delete", "Transform", "UpdateMask", "UpdateTransforms", "CurrentDocument", "Operation", });
    internal_static_google_firestore_v1beta1_DocumentTransform_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1beta1_DocumentTransform_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_DocumentTransform_descriptor,
        new java.lang.String[] { "Document", "FieldTransforms", });
    internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_descriptor =
      internal_static_google_firestore_v1beta1_DocumentTransform_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_descriptor,
        new java.lang.String[] { "FieldPath", "SetToServerValue", "Increment", "Maximum", "Minimum", "AppendMissingElements", "RemoveAllFromArray", "TransformType", });
    internal_static_google_firestore_v1beta1_WriteResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1beta1_WriteResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_WriteResult_descriptor,
        new java.lang.String[] { "UpdateTime", "TransformResults", });
    internal_static_google_firestore_v1beta1_DocumentChange_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_v1beta1_DocumentChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_DocumentChange_descriptor,
        new java.lang.String[] { "Document", "TargetIds", "RemovedTargetIds", });
    internal_static_google_firestore_v1beta1_DocumentDelete_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_firestore_v1beta1_DocumentDelete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_DocumentDelete_descriptor,
        new java.lang.String[] { "Document", "RemovedTargetIds", "ReadTime", });
    internal_static_google_firestore_v1beta1_DocumentRemove_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_firestore_v1beta1_DocumentRemove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_DocumentRemove_descriptor,
        new java.lang.String[] { "Document", "RemovedTargetIds", "ReadTime", });
    internal_static_google_firestore_v1beta1_ExistenceFilter_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_firestore_v1beta1_ExistenceFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_v1beta1_ExistenceFilter_descriptor,
        new java.lang.String[] { "TargetId", "Count", });
    com.google.firestore.v1beta1.CommonProto.getDescriptor();
    com.google.firestore.v1beta1.DocumentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
