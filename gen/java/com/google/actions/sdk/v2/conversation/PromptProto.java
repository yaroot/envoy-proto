// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/conversation/prompt/prompt.proto

package com.google.actions.sdk.v2.conversation;

public final class PromptProto {
  private PromptProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_conversation_Prompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_conversation_Prompt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/actions/sdk/v2/conversation/pro" +
      "mpt/prompt.proto\022\"google.actions.sdk.v2." +
      "conversation\032>google/actions/sdk/v2/conv" +
      "ersation/prompt/content/canvas.proto\032?go" +
      "ogle/actions/sdk/v2/conversation/prompt/" +
      "content/content.proto\032<google/actions/sd" +
      "k/v2/conversation/prompt/content/link.pr" +
      "oto\0326google/actions/sdk/v2/conversation/" +
      "prompt/simple.proto\032:google/actions/sdk/" +
      "v2/conversation/prompt/suggestion.proto\"" +
      "\250\003\n\006Prompt\022\022\n\006append\030\001 \001(\010B\002\030\001\022\020\n\010overri" +
      "de\030\010 \001(\010\022@\n\014first_simple\030\002 \001(\0132*.google." +
      "actions.sdk.v2.conversation.Simple\022<\n\007co" +
      "ntent\030\003 \001(\0132+.google.actions.sdk.v2.conv" +
      "ersation.Content\022?\n\013last_simple\030\004 \001(\0132*." +
      "google.actions.sdk.v2.conversation.Simpl" +
      "e\022C\n\013suggestions\030\005 \003(\0132..google.actions." +
      "sdk.v2.conversation.Suggestion\0226\n\004link\030\006" +
      " \001(\0132(.google.actions.sdk.v2.conversatio" +
      "n.Link\022:\n\006canvas\030\t \001(\0132*.google.actions." +
      "sdk.v2.conversation.CanvasB\207\001\n&com.googl" +
      "e.actions.sdk.v2.conversationB\013PromptPro" +
      "toP\001ZNgoogle.golang.org/genproto/googlea" +
      "pis/actions/sdk/v2/conversation;conversa" +
      "tionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.actions.sdk.v2.conversation.CanvasProto.getDescriptor(),
          com.google.actions.sdk.v2.conversation.ContentProto.getDescriptor(),
          com.google.actions.sdk.v2.conversation.LinkProto.getDescriptor(),
          com.google.actions.sdk.v2.conversation.SimpleProto.getDescriptor(),
          com.google.actions.sdk.v2.conversation.SuggestionProto.getDescriptor(),
        });
    internal_static_google_actions_sdk_v2_conversation_Prompt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_actions_sdk_v2_conversation_Prompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_conversation_Prompt_descriptor,
        new java.lang.String[] { "Append", "Override", "FirstSimple", "Content", "LastSimple", "Suggestions", "Link", "Canvas", });
    com.google.actions.sdk.v2.conversation.CanvasProto.getDescriptor();
    com.google.actions.sdk.v2.conversation.ContentProto.getDescriptor();
    com.google.actions.sdk.v2.conversation.LinkProto.getDescriptor();
    com.google.actions.sdk.v2.conversation.SimpleProto.getDescriptor();
    com.google.actions.sdk.v2.conversation.SuggestionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}