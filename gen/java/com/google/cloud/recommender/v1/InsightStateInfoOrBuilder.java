// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/insight.proto

package com.google.cloud.recommender.v1;

public interface InsightStateInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.InsightStateInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Insight state.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Insight state.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1.InsightStateInfo.State state = 1;</code>
   * @return The state.
   */
  com.google.cloud.recommender.v1.InsightStateInfo.State getState();

  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  int getStateMetadataCount();
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
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
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getStateMetadataMap();
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  /* nullable */
java.lang.String getStateMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A map of metadata for the state, provided by user or automations systems.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.lang.String getStateMetadataOrThrow(
      java.lang.String key);
}
