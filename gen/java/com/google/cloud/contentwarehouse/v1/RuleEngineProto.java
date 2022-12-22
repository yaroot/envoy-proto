// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public final class RuleEngineProto {
  private RuleEngineProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_RuleSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RuleSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_Rule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_Rule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_Action_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_AccessControlAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_AccessControlAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_ConditionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_ConditionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_EntriesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_EntriesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_PublishAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_PublishAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_RuleEngineOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RuleEngineOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_RuleEvaluatorOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RuleEvaluatorOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_InvalidRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_InvalidRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_contentwarehouse_v1_ActionOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ActionOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/contentwarehouse/v1/rule_" +
      "engine.proto\022 google.cloud.contentwareho" +
      "use.v1\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\032\032google/iam/v" +
      "1/policy.proto\"\336\001\n\007RuleSet\022\014\n\004name\030\006 \001(\t" +
      "\022\023\n\013description\030\001 \001(\t\022\016\n\006source\030\002 \001(\t\0225\n" +
      "\005rules\030\003 \003(\0132&.google.cloud.contentwareh" +
      "ouse.v1.Rule:i\352Af\n\'contentwarehouse.goog" +
      "leapis.com/RuleSet\022;projects/{project}/l" +
      "ocations/{location}/ruleSets/{rule_set}\"" +
      "\376\001\n\004Rule\022\023\n\013description\030\001 \001(\t\022\017\n\007rule_id" +
      "\030\002 \001(\t\022H\n\014trigger_type\030\003 \001(\01622.google.cl" +
      "oud.contentwarehouse.v1.Rule.TriggerType" +
      "\022\021\n\tcondition\030\004 \001(\t\0229\n\007actions\030\005 \003(\0132(.g" +
      "oogle.cloud.contentwarehouse.v1.Action\"8" +
      "\n\013TriggerType\022\013\n\007UNKNOWN\020\000\022\r\n\tON_CREATE\020" +
      "\001\022\r\n\tON_UPDATE\020\004\"\352\004\n\006Action\022\021\n\taction_id" +
      "\030\001 \001(\t\022O\n\016access_control\030\002 \001(\01325.google." +
      "cloud.contentwarehouse.v1.AccessControlA" +
      "ctionH\000\022Q\n\017data_validation\030\003 \001(\01326.googl" +
      "e.cloud.contentwarehouse.v1.DataValidati" +
      "onActionH\000\022I\n\013data_update\030\004 \001(\01322.google" +
      ".cloud.contentwarehouse.v1.DataUpdateAct" +
      "ionH\000\022L\n\radd_to_folder\030\005 \001(\01323.google.cl" +
      "oud.contentwarehouse.v1.AddToFolderActio" +
      "nH\000\022M\n\022publish_to_pub_sub\030\006 \001(\0132/.google" +
      ".cloud.contentwarehouse.v1.PublishAction" +
      "H\000\022]\n\031remove_from_folder_action\030\t \001(\01328." +
      "google.cloud.contentwarehouse.v1.RemoveF" +
      "romFolderActionH\000\022X\n\026delete_document_act" +
      "ion\030\n \001(\01326.google.cloud.contentwarehous" +
      "e.v1.DeleteDocumentActionH\000B\010\n\006action\"\206\002" +
      "\n\023AccessControlAction\022[\n\016operation_type\030" +
      "\001 \001(\0162C.google.cloud.contentwarehouse.v1" +
      ".AccessControlAction.OperationType\022%\n\006po" +
      "licy\030\002 \001(\0132\025.google.iam.v1.Policy\"k\n\rOpe" +
      "rationType\022\013\n\007UNKNOWN\020\000\022\026\n\022ADD_POLICY_BI" +
      "NDING\020\001\022\031\n\025REMOVE_POLICY_BINDING\020\002\022\032\n\026RE" +
      "PLACE_POLICY_BINDING\020\003\"\245\001\n\024DataValidatio" +
      "nAction\022Z\n\nconditions\030\001 \003(\0132F.google.clo" +
      "ud.contentwarehouse.v1.DataValidationAct" +
      "ion.ConditionsEntry\0321\n\017ConditionsEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\224\001\n\020DataU" +
      "pdateAction\022P\n\007entries\030\001 \003(\0132?.google.cl" +
      "oud.contentwarehouse.v1.DataUpdateAction" +
      ".EntriesEntry\032.\n\014EntriesEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"S\n\021AddToFolderActi" +
      "on\022>\n\007folders\030\001 \003(\tB-\372A*\n(contentwarehou" +
      "se.googleapis.com/Document\"j\n\026RemoveFrom" +
      "FolderAction\022\021\n\tcondition\030\001 \001(\t\022=\n\006folde" +
      "r\030\002 \001(\tB-\372A*\n(contentwarehouse.googleapi" +
      "s.com/Document\"3\n\rPublishAction\022\020\n\010topic" +
      "_id\030\001 \001(\t\022\020\n\010messages\030\002 \003(\t\"2\n\024DeleteDoc" +
      "umentAction\022\032\n\022enable_hard_delete\030\001 \001(\010\"" +
      "\327\001\n\020RuleEngineOutput\022\025\n\rdocument_name\030\003 " +
      "\001(\t\022T\n\025rule_evaluator_output\030\001 \001(\01325.goo" +
      "gle.cloud.contentwarehouse.v1.RuleEvalua" +
      "torOutput\022V\n\026action_executor_output\030\002 \001(" +
      "\01326.google.cloud.contentwarehouse.v1.Act" +
      "ionExecutorOutput\"\333\001\n\023RuleEvaluatorOutpu" +
      "t\022?\n\017triggered_rules\030\001 \003(\0132&.google.clou" +
      "d.contentwarehouse.v1.Rule\022=\n\rmatched_ru" +
      "les\030\002 \003(\0132&.google.cloud.contentwarehous" +
      "e.v1.Rule\022D\n\rinvalid_rules\030\003 \003(\0132-.googl" +
      "e.cloud.contentwarehouse.v1.InvalidRule\"" +
      "R\n\013InvalidRule\0224\n\004rule\030\001 \001(\0132&.google.cl" +
      "oud.contentwarehouse.v1.Rule\022\r\n\005error\030\002 " +
      "\001(\t\"e\n\024ActionExecutorOutput\022M\n\022rule_acti" +
      "ons_pairs\030\001 \003(\01321.google.cloud.contentwa" +
      "rehouse.v1.RuleActionsPair\"\217\001\n\017RuleActio" +
      "nsPair\0224\n\004rule\030\001 \001(\0132&.google.cloud.cont" +
      "entwarehouse.v1.Rule\022F\n\016action_outputs\030\002" +
      " \003(\0132..google.cloud.contentwarehouse.v1." +
      "ActionOutput\"\356\001\n\014ActionOutput\022\021\n\taction_" +
      "id\030\001 \001(\t\022J\n\014action_state\030\002 \001(\01624.google." +
      "cloud.contentwarehouse.v1.ActionOutput.S" +
      "tate\022\026\n\016output_message\030\003 \001(\t\"g\n\005State\022\013\n" +
      "\007UNKNOWN\020\000\022\024\n\020ACTION_SUCCEEDED\020\001\022\021\n\rACTI" +
      "ON_FAILED\020\002\022\024\n\020ACTION_TIMED_OUT\020\003\022\022\n\016ACT" +
      "ION_PENDING\020\004B\213\001\n$com.google.cloud.conte" +
      "ntwarehouse.v1B\017RuleEngineProtoP\001ZPgoogl" +
      "e.golang.org/genproto/googleapis/cloud/c" +
      "ontentwarehouse/v1;contentwarehouseb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
        });
    internal_static_google_cloud_contentwarehouse_v1_RuleSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_RuleSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_RuleSet_descriptor,
        new java.lang.String[] { "Name", "Description", "Source", "Rules", });
    internal_static_google_cloud_contentwarehouse_v1_Rule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_Rule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_Rule_descriptor,
        new java.lang.String[] { "Description", "RuleId", "TriggerType", "Condition", "Actions", });
    internal_static_google_cloud_contentwarehouse_v1_Action_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_Action_descriptor,
        new java.lang.String[] { "ActionId", "AccessControl", "DataValidation", "DataUpdate", "AddToFolder", "PublishToPubSub", "RemoveFromFolderAction", "DeleteDocumentAction", "Action", });
    internal_static_google_cloud_contentwarehouse_v1_AccessControlAction_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_AccessControlAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_AccessControlAction_descriptor,
        new java.lang.String[] { "OperationType", "Policy", });
    internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor,
        new java.lang.String[] { "Conditions", });
    internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_ConditionsEntry_descriptor =
      internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_ConditionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_DataValidationAction_ConditionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor,
        new java.lang.String[] { "Entries", });
    internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_EntriesEntry_descriptor =
      internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_EntriesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_DataUpdateAction_EntriesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_descriptor,
        new java.lang.String[] { "Folders", });
    internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_descriptor,
        new java.lang.String[] { "Condition", "Folder", });
    internal_static_google_cloud_contentwarehouse_v1_PublishAction_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_contentwarehouse_v1_PublishAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_PublishAction_descriptor,
        new java.lang.String[] { "TopicId", "Messages", });
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentAction_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_DeleteDocumentAction_descriptor,
        new java.lang.String[] { "EnableHardDelete", });
    internal_static_google_cloud_contentwarehouse_v1_RuleEngineOutput_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_contentwarehouse_v1_RuleEngineOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_RuleEngineOutput_descriptor,
        new java.lang.String[] { "DocumentName", "RuleEvaluatorOutput", "ActionExecutorOutput", });
    internal_static_google_cloud_contentwarehouse_v1_RuleEvaluatorOutput_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_contentwarehouse_v1_RuleEvaluatorOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_RuleEvaluatorOutput_descriptor,
        new java.lang.String[] { "TriggeredRules", "MatchedRules", "InvalidRules", });
    internal_static_google_cloud_contentwarehouse_v1_InvalidRule_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_contentwarehouse_v1_InvalidRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_InvalidRule_descriptor,
        new java.lang.String[] { "Rule", "Error", });
    internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_ActionExecutorOutput_descriptor,
        new java.lang.String[] { "RuleActionsPairs", });
    internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_descriptor,
        new java.lang.String[] { "Rule", "ActionOutputs", });
    internal_static_google_cloud_contentwarehouse_v1_ActionOutput_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_contentwarehouse_v1_ActionOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_contentwarehouse_v1_ActionOutput_descriptor,
        new java.lang.String[] { "ActionId", "ActionState", "OutputMessage", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}