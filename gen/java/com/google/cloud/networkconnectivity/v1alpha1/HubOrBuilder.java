// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1alpha1/hub.proto

package com.google.cloud.networkconnectivity.v1alpha1;

public interface HubOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1alpha1.Hub)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The name of a Hub resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The name of a Hub resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Time when the Hub was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Time when the Hub was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Time when the Hub was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Time when the Hub was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Time when the Hub was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Time when the Hub was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Short description of the hub resource.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Short description of the hub resource.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. A list of the URIs of all attached spokes
   * </pre>
   *
   * <code>repeated string spokes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the spokes.
   */
  java.util.List<java.lang.String>
      getSpokesList();
  /**
   * <pre>
   * Output only. A list of the URIs of all attached spokes
   * </pre>
   *
   * <code>repeated string spokes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The count of spokes.
   */
  int getSpokesCount();
  /**
   * <pre>
   * Output only. A list of the URIs of all attached spokes
   * </pre>
   *
   * <code>repeated string spokes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The spokes at the given index.
   */
  java.lang.String getSpokes(int index);
  /**
   * <pre>
   * Output only. A list of the URIs of all attached spokes
   * </pre>
   *
   * <code>repeated string spokes = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the spokes at the given index.
   */
  com.google.protobuf.ByteString
      getSpokesBytes(int index);

  /**
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across all Hub
   * resources. If a Hub resource is deleted and another with the same name is
   * created, it gets a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across all Hub
   * resources. If a Hub resource is deleted and another with the same name is
   * created, it gets a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString
      getUniqueIdBytes();

  /**
   * <pre>
   * Output only. The current lifecycle state of this Hub.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1alpha1.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current lifecycle state of this Hub.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1alpha1.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.networkconnectivity.v1alpha1.State getState();
}