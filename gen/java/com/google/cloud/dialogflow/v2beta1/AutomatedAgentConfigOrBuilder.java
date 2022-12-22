// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation_profile.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AutomatedAgentConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AutomatedAgentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the Dialogflow agent environment to use.
   * This project needs to either be the same project as the conversation or you
   * need to grant `service-&lt;Conversation Project
   * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API
   * Service Agent` role in this project.
   * - For ES agents, use format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agent/environments/&lt;Environment ID or '-'&gt;`. If environment is not
   * specified, the default `draft` environment is used. Refer to
   * [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest)
   * for more details.
   * - For CX agents, use format `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID
   * or '-'&gt;`. If environment is not specified, the default `draft` environment
   * is used.
   * </pre>
   *
   * <code>string agent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The agent.
   */
  java.lang.String getAgent();
  /**
   * <pre>
   * Required. ID of the Dialogflow agent environment to use.
   * This project needs to either be the same project as the conversation or you
   * need to grant `service-&lt;Conversation Project
   * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API
   * Service Agent` role in this project.
   * - For ES agents, use format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agent/environments/&lt;Environment ID or '-'&gt;`. If environment is not
   * specified, the default `draft` environment is used. Refer to
   * [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest)
   * for more details.
   * - For CX agents, use format `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID
   * or '-'&gt;`. If environment is not specified, the default `draft` environment
   * is used.
   * </pre>
   *
   * <code>string agent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for agent.
   */
  com.google.protobuf.ByteString
      getAgentBytes();
}