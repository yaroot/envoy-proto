// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/prompt/content/static_image_prompt.proto

package com.google.actions.sdk.v2.interactionmodel.prompt;

public final class StaticImagePromptProto {
  private StaticImagePromptProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticImagePrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticImagePrompt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/actions/sdk/v2/interactionmodel" +
      "/prompt/content/static_image_prompt.prot" +
      "o\022-google.actions.sdk.v2.interactionmode" +
      "l.prompt\032\037google/api/field_behavior.prot" +
      "o\"\240\001\n\021StaticImagePrompt\022\020\n\003url\030\001 \001(\tB\003\340A" +
      "\002\022\020\n\003alt\030\002 \001(\tB\003\340A\002\022\023\n\006height\030\003 \001(\005B\003\340A\001" +
      "\022\022\n\005width\030\004 \001(\005B\003\340A\001\">\n\tImageFill\022\017\n\013UNS" +
      "PECIFIED\020\000\022\010\n\004GRAY\020\001\022\t\n\005WHITE\020\002\022\013\n\007CROPP" +
      "ED\020\003B\242\001\n1com.google.actions.sdk.v2.inter" +
      "actionmodel.promptB\026StaticImagePromptPro" +
      "toP\001ZSgoogle.golang.org/genproto/googlea" +
      "pis/actions/sdk/v2/interactionmodel/prom" +
      "pt;promptb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticImagePrompt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticImagePrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticImagePrompt_descriptor,
        new java.lang.String[] { "Url", "Alt", "Height", "Width", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}