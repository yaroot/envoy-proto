// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/prompt/content/static_card_prompt.proto

package com.google.actions.sdk.v2.interactionmodel.prompt;

public final class StaticCardPromptProto {
  private StaticCardPromptProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticCardPrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticCardPrompt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/actions/sdk/v2/interactionmodel" +
      "/prompt/content/static_card_prompt.proto" +
      "\022-google.actions.sdk.v2.interactionmodel" +
      ".prompt\032Ogoogle/actions/sdk/v2/interacti" +
      "onmodel/prompt/content/static_image_prom" +
      "pt.proto\032Ngoogle/actions/sdk/v2/interact" +
      "ionmodel/prompt/content/static_link_prom" +
      "pt.proto\032\037google/api/field_behavior.prot" +
      "o\"\341\002\n\020StaticCardPrompt\022\022\n\005title\030\001 \001(\tB\003\340" +
      "A\001\022\025\n\010subtitle\030\002 \001(\tB\003\340A\001\022\021\n\004text\030\003 \001(\tB" +
      "\003\340A\002\022T\n\005image\030\004 \001(\0132@.google.actions.sdk" +
      ".v2.interactionmodel.prompt.StaticImageP" +
      "romptB\003\340A\001\022c\n\nimage_fill\030\005 \001(\0162J.google." +
      "actions.sdk.v2.interactionmodel.prompt.S" +
      "taticImagePrompt.ImageFillB\003\340A\001\022T\n\006butto" +
      "n\030\006 \001(\0132?.google.actions.sdk.v2.interact" +
      "ionmodel.prompt.StaticLinkPromptB\003\340A\001B\241\001" +
      "\n1com.google.actions.sdk.v2.interactionm" +
      "odel.promptB\025StaticCardPromptProtoP\001ZSgo" +
      "ogle.golang.org/genproto/googleapis/acti" +
      "ons/sdk/v2/interactionmodel/prompt;promp" +
      "tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.actions.sdk.v2.interactionmodel.prompt.StaticImagePromptProto.getDescriptor(),
          com.google.actions.sdk.v2.interactionmodel.prompt.StaticLinkPromptProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticCardPrompt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticCardPrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_prompt_StaticCardPrompt_descriptor,
        new java.lang.String[] { "Title", "Subtitle", "Text", "Image", "ImageFill", "Button", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.actions.sdk.v2.interactionmodel.prompt.StaticImagePromptProto.getDescriptor();
    com.google.actions.sdk.v2.interactionmodel.prompt.StaticLinkPromptProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}