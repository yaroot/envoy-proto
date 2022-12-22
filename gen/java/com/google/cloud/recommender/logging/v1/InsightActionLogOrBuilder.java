// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/logging/v1/action_log.proto

package com.google.cloud.recommender.logging.v1;

public interface InsightActionLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.logging.v1.InsightActionLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. User that executed this action. Eg, foo&#64;gmail.com
   * </pre>
   *
   * <code>string actor = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The actor.
   */
  java.lang.String getActor();
  /**
   * <pre>
   * Required. User that executed this action. Eg, foo&#64;gmail.com
   * </pre>
   *
   * <code>string actor = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for actor.
   */
  com.google.protobuf.ByteString
      getActorBytes();

  /**
   * <pre>
   * Required. State change that was made by the actor. Eg, ACCEPTED.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Required. State change that was made by the actor. Eg, ACCEPTED.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The state.
   */
  com.google.cloud.recommender.v1.InsightStateInfo.State getState();

  /**
   * <pre>
   * Optional. Metadata that was included with the action that was taken.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getStateMetadataCount();
  /**
   * <pre>
   * Optional. Metadata that was included with the action that was taken.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsStateMetadata(
      java.lang.String key);
  /**
   * Use {@link #getStateMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getStateMetadata();
  /**
   * <pre>
   * Optional. Metadata that was included with the action that was taken.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getStateMetadataMap();
  /**
   * <pre>
   * Optional. Metadata that was included with the action that was taken.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getStateMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Metadata that was included with the action that was taken.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getStateMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. Name of the insight which was acted on. Eg, :
   * 'projects/123/locations/global/insightTypes/roleInsight/insights/i1'
   * </pre>
   *
   * <code>string insight = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The insight.
   */
  java.lang.String getInsight();
  /**
   * <pre>
   * Required. Name of the insight which was acted on. Eg, :
   * 'projects/123/locations/global/insightTypes/roleInsight/insights/i1'
   * </pre>
   *
   * <code>string insight = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for insight.
   */
  com.google.protobuf.ByteString
      getInsightBytes();
}
