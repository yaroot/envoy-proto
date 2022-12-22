// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/slot.proto

package com.google.actions.sdk.v2.interactionmodel;

public final class SlotProto {
  private SlotProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_PromptSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_PromptSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_CommitBehavior_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_CommitBehavior_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_DefaultValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_DefaultValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/actions/sdk/v2/interactionmodel" +
      "/slot.proto\022&google.actions.sdk.v2.inter" +
      "actionmodel\032:google/actions/sdk/v2/inter" +
      "actionmodel/event_handler.proto\032Agoogle/" +
      "actions/sdk/v2/interactionmodel/type/cla" +
      "ss_reference.proto\032\037google/api/field_beh" +
      "avior.proto\032\034google/protobuf/struct.prot" +
      "o\"\217\t\n\004Slot\022\021\n\004name\030\001 \001(\tB\003\340A\002\022N\n\004type\030\002 " +
      "\001(\0132;.google.actions.sdk.v2.interactionm" +
      "odel.type.ClassReferenceB\003\340A\002\022\025\n\010require" +
      "d\030\003 \001(\010B\003\340A\001\022Y\n\017prompt_settings\030\004 \001(\0132;." +
      "google.actions.sdk.v2.interactionmodel.S" +
      "lot.PromptSettingsB\003\340A\001\022Y\n\017commit_behavi" +
      "or\030\005 \001(\0132;.google.actions.sdk.v2.interac" +
      "tionmodel.Slot.CommitBehaviorB\003\340A\001\022+\n\006co" +
      "nfig\030\006 \001(\0132\026.google.protobuf.ValueB\003\340A\001\022" +
      "U\n\rdefault_value\030\007 \001(\01329.google.actions." +
      "sdk.v2.interactionmodel.Slot.DefaultValu" +
      "eB\003\340A\001\032\310\004\n\016PromptSettings\022L\n\016initial_pro" +
      "mpt\030\001 \001(\01324.google.actions.sdk.v2.intera" +
      "ctionmodel.EventHandler\022N\n\020no_match_prom" +
      "pt1\030\002 \001(\01324.google.actions.sdk.v2.intera" +
      "ctionmodel.EventHandler\022N\n\020no_match_prom" +
      "pt2\030\003 \001(\01324.google.actions.sdk.v2.intera" +
      "ctionmodel.EventHandler\022S\n\025no_match_fina" +
      "l_prompt\030\004 \001(\01324.google.actions.sdk.v2.i" +
      "nteractionmodel.EventHandler\022N\n\020no_input" +
      "_prompt1\030\005 \001(\01324.google.actions.sdk.v2.i" +
      "nteractionmodel.EventHandler\022N\n\020no_input" +
      "_prompt2\030\006 \001(\01324.google.actions.sdk.v2.i" +
      "nteractionmodel.EventHandler\022S\n\025no_input" +
      "_final_prompt\030\007 \001(\01324.google.actions.sdk" +
      ".v2.interactionmodel.EventHandler\032-\n\016Com" +
      "mitBehavior\022\033\n\023write_session_param\030\001 \001(\t" +
      "\032Y\n\014DefaultValue\022\032\n\rsession_param\030\001 \001(\tB" +
      "\003\340A\001\022-\n\010constant\030\002 \001(\0132\026.google.protobuf" +
      ".ValueB\003\340A\001B\221\001\n*com.google.actions.sdk.v" +
      "2.interactionmodelB\tSlotProtoP\001ZVgoogle." +
      "golang.org/genproto/googleapis/actions/s" +
      "dk/v2/interactionmodel;interactionmodelb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.actions.sdk.v2.interactionmodel.EventHandlerProto.getDescriptor(),
          com.google.actions.sdk.v2.interactionmodel.type.ClassReferenceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_Slot_descriptor,
        new java.lang.String[] { "Name", "Type", "Required", "PromptSettings", "CommitBehavior", "Config", "DefaultValue", });
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_PromptSettings_descriptor =
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_descriptor.getNestedTypes().get(0);
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_PromptSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_Slot_PromptSettings_descriptor,
        new java.lang.String[] { "InitialPrompt", "NoMatchPrompt1", "NoMatchPrompt2", "NoMatchFinalPrompt", "NoInputPrompt1", "NoInputPrompt2", "NoInputFinalPrompt", });
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_CommitBehavior_descriptor =
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_descriptor.getNestedTypes().get(1);
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_CommitBehavior_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_Slot_CommitBehavior_descriptor,
        new java.lang.String[] { "WriteSessionParam", });
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_DefaultValue_descriptor =
      internal_static_google_actions_sdk_v2_interactionmodel_Slot_descriptor.getNestedTypes().get(2);
    internal_static_google_actions_sdk_v2_interactionmodel_Slot_DefaultValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_Slot_DefaultValue_descriptor,
        new java.lang.String[] { "SessionParam", "Constant", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.actions.sdk.v2.interactionmodel.EventHandlerProto.getDescriptor();
    com.google.actions.sdk.v2.interactionmodel.type.ClassReferenceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}