// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha1/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha1;

public final class AssistantProto {
  private AssistantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_AudioOutConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_AudioOutConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_ConverseState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_ConverseState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_AudioOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_AudioOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_ConverseResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_ConverseResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_ConverseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_ConverseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_assistant_embedded_v1alpha1_ConverseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_assistant_embedded_v1alpha1_ConverseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/assistant/embedded/v1alpha1/emb" +
      "edded_assistant.proto\022\"google.assistant." +
      "embedded.v1alpha1\032\034google/api/annotation" +
      "s.proto\032\027google/rpc/status.proto\"\365\001\n\016Con" +
      "verseConfig\022J\n\017audio_in_config\030\001 \001(\01321.g" +
      "oogle.assistant.embedded.v1alpha1.AudioI" +
      "nConfig\022L\n\020audio_out_config\030\002 \001(\01322.goog" +
      "le.assistant.embedded.v1alpha1.AudioOutC" +
      "onfig\022I\n\016converse_state\030\003 \001(\01321.google.a" +
      "ssistant.embedded.v1alpha1.ConverseState" +
      "\"\266\001\n\rAudioInConfig\022L\n\010encoding\030\001 \001(\0162:.g" +
      "oogle.assistant.embedded.v1alpha1.AudioI" +
      "nConfig.Encoding\022\031\n\021sample_rate_hertz\030\002 " +
      "\001(\005\"<\n\010Encoding\022\030\n\024ENCODING_UNSPECIFIED\020" +
      "\000\022\014\n\010LINEAR16\020\001\022\010\n\004FLAC\020\002\"\343\001\n\016AudioOutCo" +
      "nfig\022M\n\010encoding\030\001 \001(\0162;.google.assistan" +
      "t.embedded.v1alpha1.AudioOutConfig.Encod" +
      "ing\022\031\n\021sample_rate_hertz\030\002 \001(\005\022\031\n\021volume" +
      "_percentage\030\003 \001(\005\"L\n\010Encoding\022\030\n\024ENCODIN" +
      "G_UNSPECIFIED\020\000\022\014\n\010LINEAR16\020\001\022\007\n\003MP3\020\002\022\017" +
      "\n\013OPUS_IN_OGG\020\003\"+\n\rConverseState\022\032\n\022conv" +
      "ersation_state\030\001 \001(\014\"\036\n\010AudioOut\022\022\n\naudi" +
      "o_data\030\001 \001(\014\"\275\002\n\016ConverseResult\022\033\n\023spoke" +
      "n_request_text\030\001 \001(\t\022\034\n\024spoken_response_" +
      "text\030\002 \001(\t\022\032\n\022conversation_state\030\003 \001(\014\022Z" +
      "\n\017microphone_mode\030\004 \001(\0162A.google.assista" +
      "nt.embedded.v1alpha1.ConverseResult.Micr" +
      "ophoneMode\022\031\n\021volume_percentage\030\005 \001(\005\"]\n" +
      "\016MicrophoneMode\022\037\n\033MICROPHONE_MODE_UNSPE" +
      "CIFIED\020\000\022\024\n\020CLOSE_MICROPHONE\020\001\022\024\n\020DIALOG" +
      "_FOLLOW_ON\020\002\"\177\n\017ConverseRequest\022D\n\006confi" +
      "g\030\001 \001(\01322.google.assistant.embedded.v1al" +
      "pha1.ConverseConfigH\000\022\022\n\010audio_in\030\002 \001(\014H" +
      "\000B\022\n\020converse_request\"\352\002\n\020ConverseRespon" +
      "se\022#\n\005error\030\001 \001(\0132\022.google.rpc.StatusH\000\022" +
      "T\n\nevent_type\030\002 \001(\0162>.google.assistant.e" +
      "mbedded.v1alpha1.ConverseResponse.EventT" +
      "ypeH\000\022A\n\taudio_out\030\003 \001(\0132,.google.assist" +
      "ant.embedded.v1alpha1.AudioOutH\000\022D\n\006resu" +
      "lt\030\005 \001(\01322.google.assistant.embedded.v1a" +
      "lpha1.ConverseResultH\000\"=\n\tEventType\022\032\n\026E" +
      "VENT_TYPE_UNSPECIFIED\020\000\022\024\n\020END_OF_UTTERA" +
      "NCE\020\001B\023\n\021converse_response2\216\001\n\021EmbeddedA" +
      "ssistant\022y\n\010Converse\0223.google.assistant." +
      "embedded.v1alpha1.ConverseRequest\0324.goog" +
      "le.assistant.embedded.v1alpha1.ConverseR" +
      "esponse(\0010\001B\206\001\n&com.google.assistant.emb" +
      "edded.v1alpha1B\016AssistantProtoP\001ZJgoogle" +
      ".golang.org/genproto/googleapis/assistan" +
      "t/embedded/v1alpha1;embeddedb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_descriptor,
        new java.lang.String[] { "AudioInConfig", "AudioOutConfig", "ConverseState", });
    internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_descriptor,
        new java.lang.String[] { "Encoding", "SampleRateHertz", });
    internal_static_google_assistant_embedded_v1alpha1_AudioOutConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_assistant_embedded_v1alpha1_AudioOutConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_AudioOutConfig_descriptor,
        new java.lang.String[] { "Encoding", "SampleRateHertz", "VolumePercentage", });
    internal_static_google_assistant_embedded_v1alpha1_ConverseState_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_assistant_embedded_v1alpha1_ConverseState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_ConverseState_descriptor,
        new java.lang.String[] { "ConversationState", });
    internal_static_google_assistant_embedded_v1alpha1_AudioOut_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_assistant_embedded_v1alpha1_AudioOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_AudioOut_descriptor,
        new java.lang.String[] { "AudioData", });
    internal_static_google_assistant_embedded_v1alpha1_ConverseResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_assistant_embedded_v1alpha1_ConverseResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_ConverseResult_descriptor,
        new java.lang.String[] { "SpokenRequestText", "SpokenResponseText", "ConversationState", "MicrophoneMode", "VolumePercentage", });
    internal_static_google_assistant_embedded_v1alpha1_ConverseRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_assistant_embedded_v1alpha1_ConverseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_ConverseRequest_descriptor,
        new java.lang.String[] { "Config", "AudioIn", "ConverseRequest", });
    internal_static_google_assistant_embedded_v1alpha1_ConverseResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_assistant_embedded_v1alpha1_ConverseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_assistant_embedded_v1alpha1_ConverseResponse_descriptor,
        new java.lang.String[] { "Error", "EventType", "AudioOut", "Result", "ConverseResponse", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
