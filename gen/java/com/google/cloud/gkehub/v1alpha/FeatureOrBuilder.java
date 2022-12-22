// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/feature.proto

package com.google.cloud.gkehub.v1alpha;

public interface FeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha.Feature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The full, unique name of this Feature resource in the format
   * `projects/&#42;&#47;locations/&#42;&#47;features/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The full, unique name of this Feature resource in the format
   * `projects/&#42;&#47;locations/&#42;&#47;features/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * GCP labels for this Feature.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * GCP labels for this Feature.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
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
   * GCP labels for this Feature.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * GCP labels for this Feature.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * GCP labels for this Feature.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. State of the Feature resource itself.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.FeatureResourceState resource_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the resourceState field is set.
   */
  boolean hasResourceState();
  /**
   * <pre>
   * Output only. State of the Feature resource itself.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.FeatureResourceState resource_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The resourceState.
   */
  com.google.cloud.gkehub.v1alpha.FeatureResourceState getResourceState();
  /**
   * <pre>
   * Output only. State of the Feature resource itself.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.FeatureResourceState resource_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha.FeatureResourceStateOrBuilder getResourceStateOrBuilder();

  /**
   * <pre>
   * Optional. Hub-wide Feature configuration. If this Feature does not support any
   * Hub-wide configuration, this field may be unused.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.CommonFeatureSpec spec = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * Optional. Hub-wide Feature configuration. If this Feature does not support any
   * Hub-wide configuration, this field may be unused.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.CommonFeatureSpec spec = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The spec.
   */
  com.google.cloud.gkehub.v1alpha.CommonFeatureSpec getSpec();
  /**
   * <pre>
   * Optional. Hub-wide Feature configuration. If this Feature does not support any
   * Hub-wide configuration, this field may be unused.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.CommonFeatureSpec spec = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkehub.v1alpha.CommonFeatureSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * Optional. Membership-specific configuration for this Feature. If this Feature does
   * not support any per-Membership configuration, this field may be unused.
   * The keys indicate which Membership the configuration is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} WILL match the Feature's
   * project.
   * {p} will always be returned as the project number, but the project ID is
   * also accepted during input. If the same Membership is specified in the map
   * twice (using the project ID form, and the project number form), exactly
   * ONE of the entries will be saved, with no guarantees as to which. For this
   * reason, it is recommended the same format be used for all entries when
   * mutating a Feature.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureSpec&gt; membership_specs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getMembershipSpecsCount();
  /**
   * <pre>
   * Optional. Membership-specific configuration for this Feature. If this Feature does
   * not support any per-Membership configuration, this field may be unused.
   * The keys indicate which Membership the configuration is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} WILL match the Feature's
   * project.
   * {p} will always be returned as the project number, but the project ID is
   * also accepted during input. If the same Membership is specified in the map
   * twice (using the project ID form, and the project number form), exactly
   * ONE of the entries will be saved, with no guarantees as to which. For this
   * reason, it is recommended the same format be used for all entries when
   * mutating a Feature.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureSpec&gt; membership_specs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsMembershipSpecs(
      java.lang.String key);
  /**
   * Use {@link #getMembershipSpecsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec>
  getMembershipSpecs();
  /**
   * <pre>
   * Optional. Membership-specific configuration for this Feature. If this Feature does
   * not support any per-Membership configuration, this field may be unused.
   * The keys indicate which Membership the configuration is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} WILL match the Feature's
   * project.
   * {p} will always be returned as the project number, but the project ID is
   * also accepted during input. If the same Membership is specified in the map
   * twice (using the project ID form, and the project number form), exactly
   * ONE of the entries will be saved, with no guarantees as to which. For this
   * reason, it is recommended the same format be used for all entries when
   * mutating a Feature.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureSpec&gt; membership_specs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec>
  getMembershipSpecsMap();
  /**
   * <pre>
   * Optional. Membership-specific configuration for this Feature. If this Feature does
   * not support any per-Membership configuration, this field may be unused.
   * The keys indicate which Membership the configuration is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} WILL match the Feature's
   * project.
   * {p} will always be returned as the project number, but the project ID is
   * also accepted during input. If the same Membership is specified in the map
   * twice (using the project ID form, and the project number form), exactly
   * ONE of the entries will be saved, with no guarantees as to which. For this
   * reason, it is recommended the same format be used for all entries when
   * mutating a Feature.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureSpec&gt; membership_specs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec getMembershipSpecsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec defaultValue);
  /**
   * <pre>
   * Optional. Membership-specific configuration for this Feature. If this Feature does
   * not support any per-Membership configuration, this field may be unused.
   * The keys indicate which Membership the configuration is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} WILL match the Feature's
   * project.
   * {p} will always be returned as the project number, but the project ID is
   * also accepted during input. If the same Membership is specified in the map
   * twice (using the project ID form, and the project number form), exactly
   * ONE of the entries will be saved, with no guarantees as to which. For this
   * reason, it is recommended the same format be used for all entries when
   * mutating a Feature.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureSpec&gt; membership_specs = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkehub.v1alpha.MembershipFeatureSpec getMembershipSpecsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. The Hub-wide Feature state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.CommonFeatureState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <pre>
   * Output only. The Hub-wide Feature state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.CommonFeatureState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.gkehub.v1alpha.CommonFeatureState getState();
  /**
   * <pre>
   * Output only. The Hub-wide Feature state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha.CommonFeatureState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha.CommonFeatureStateOrBuilder getStateOrBuilder();

  /**
   * <pre>
   * Output only. Membership-specific Feature status. If this Feature does
   * report any per-Membership status, this field may be unused.
   * The keys indicate which Membership the state is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project number, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} MUST match the Feature's
   * project number.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureState&gt; membership_states = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getMembershipStatesCount();
  /**
   * <pre>
   * Output only. Membership-specific Feature status. If this Feature does
   * report any per-Membership status, this field may be unused.
   * The keys indicate which Membership the state is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project number, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} MUST match the Feature's
   * project number.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureState&gt; membership_states = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsMembershipStates(
      java.lang.String key);
  /**
   * Use {@link #getMembershipStatesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.gkehub.v1alpha.MembershipFeatureState>
  getMembershipStates();
  /**
   * <pre>
   * Output only. Membership-specific Feature status. If this Feature does
   * report any per-Membership status, this field may be unused.
   * The keys indicate which Membership the state is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project number, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} MUST match the Feature's
   * project number.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureState&gt; membership_states = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.gkehub.v1alpha.MembershipFeatureState>
  getMembershipStatesMap();
  /**
   * <pre>
   * Output only. Membership-specific Feature status. If this Feature does
   * report any per-Membership status, this field may be unused.
   * The keys indicate which Membership the state is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project number, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} MUST match the Feature's
   * project number.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureState&gt; membership_states = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  /* nullable */
com.google.cloud.gkehub.v1alpha.MembershipFeatureState getMembershipStatesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.gkehub.v1alpha.MembershipFeatureState defaultValue);
  /**
   * <pre>
   * Output only. Membership-specific Feature status. If this Feature does
   * report any per-Membership status, this field may be unused.
   * The keys indicate which Membership the state is for, in the form:
   *     projects/{p}/locations/{l}/memberships/{m}
   * Where {p} is the project number, {l} is a valid location and {m} is a valid
   * Membership in this project at that location. {p} MUST match the Feature's
   * project number.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.gkehub.v1alpha.MembershipFeatureState&gt; membership_states = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1alpha.MembershipFeatureState getMembershipStatesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. When the Feature resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. When the Feature resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. When the Feature resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. When the Feature resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. When the Feature resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. When the Feature resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. When the Feature resource was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * Output only. When the Feature resource was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * Output only. When the Feature resource was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();
}