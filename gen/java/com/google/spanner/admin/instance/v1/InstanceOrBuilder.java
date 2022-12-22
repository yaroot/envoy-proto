// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface InstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A unique identifier for the instance, which cannot be changed
   * after the instance is created. Values are of the form
   * `projects/&lt;project&gt;/instances/[a-z][-a-z0-9]*[a-z0-9]`. The final
   * segment of the name must be between 2 and 64 characters in length.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. A unique identifier for the instance, which cannot be changed
   * after the instance is created. Values are of the form
   * `projects/&lt;project&gt;/instances/[a-z][-a-z0-9]*[a-z0-9]`. The final
   * segment of the name must be between 2 and 64 characters in length.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The name of the instance's configuration. Values are of the form
   * `projects/&lt;project&gt;/instanceConfigs/&lt;configuration&gt;`. See
   * also [InstanceConfig][google.spanner.admin.instance.v1.InstanceConfig] and
   * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs].
   * </pre>
   *
   * <code>string config = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The config.
   */
  java.lang.String getConfig();
  /**
   * <pre>
   * Required. The name of the instance's configuration. Values are of the form
   * `projects/&lt;project&gt;/instanceConfigs/&lt;configuration&gt;`. See
   * also [InstanceConfig][google.spanner.admin.instance.v1.InstanceConfig] and
   * [ListInstanceConfigs][google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs].
   * </pre>
   *
   * <code>string config = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for config.
   */
  com.google.protobuf.ByteString
      getConfigBytes();

  /**
   * <pre>
   * Required. The descriptive name for this instance as it appears in UIs.
   * Must be unique per project and between 4 and 30 characters in length.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The descriptive name for this instance as it appears in UIs.
   * Must be unique per project and between 4 and 30 characters in length.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The number of nodes allocated to this instance. At most one of either
   * node_count or processing_units should be present in the message. This
   * may be zero in API responses for instances that are not yet in state
   * `READY`.
   * See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity)
   * for more information about nodes and processing units.
   * </pre>
   *
   * <code>int32 node_count = 5;</code>
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   * <pre>
   * The number of processing units allocated to this instance. At most one of
   * processing_units or node_count should be present in the message. This may
   * be zero in API responses for instances that are not yet in state `READY`.
   * See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity)
   * for more information about nodes and processing units.
   * </pre>
   *
   * <code>int32 processing_units = 9;</code>
   * @return The processingUnits.
   */
  int getProcessingUnits();

  /**
   * <pre>
   * Output only. The current instance state. For
   * [CreateInstance][google.spanner.admin.instance.v1.InstanceAdmin.CreateInstance],
   * the state must be either omitted or set to `CREATING`. For
   * [UpdateInstance][google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance],
   * the state must be either omitted or set to `READY`.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current instance state. For
   * [CreateInstance][google.spanner.admin.instance.v1.InstanceAdmin.CreateInstance],
   * the state must be either omitted or set to `CREATING`. For
   * [UpdateInstance][google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance],
   * the state must be either omitted or set to `READY`.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.spanner.admin.instance.v1.Instance.State getState();

  /**
   * <pre>
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud
   * resources into groups that reflect a customer's organizational needs and
   * deployment strategies. Cloud Labels can be used to filter collections of
   * resources. They can be used to control how resource metrics are aggregated.
   * And they can be used as arguments to policy management rules (e.g. route,
   * firewall, load balancing, etc.).
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z][a-z0-9_-]{0,62}`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `[a-z0-9_-]{0,63}`.
   *  * No more than 64 labels can be associated with a given resource.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * If you plan to use labels in your own code, please note that additional
   * characters may be allowed in the future. And so you are advised to use an
   * internal label representation, such as JSON, which doesn't rely upon
   * specific characters being disallowed.  For example, representing labels
   * as the string:  name + "_" + value  would prove problematic if we were to
   * allow "_" in a future release.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud
   * resources into groups that reflect a customer's organizational needs and
   * deployment strategies. Cloud Labels can be used to filter collections of
   * resources. They can be used to control how resource metrics are aggregated.
   * And they can be used as arguments to policy management rules (e.g. route,
   * firewall, load balancing, etc.).
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z][a-z0-9_-]{0,62}`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `[a-z0-9_-]{0,63}`.
   *  * No more than 64 labels can be associated with a given resource.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * If you plan to use labels in your own code, please note that additional
   * characters may be allowed in the future. And so you are advised to use an
   * internal label representation, such as JSON, which doesn't rely upon
   * specific characters being disallowed.  For example, representing labels
   * as the string:  name + "_" + value  would prove problematic if we were to
   * allow "_" in a future release.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
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
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud
   * resources into groups that reflect a customer's organizational needs and
   * deployment strategies. Cloud Labels can be used to filter collections of
   * resources. They can be used to control how resource metrics are aggregated.
   * And they can be used as arguments to policy management rules (e.g. route,
   * firewall, load balancing, etc.).
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z][a-z0-9_-]{0,62}`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `[a-z0-9_-]{0,63}`.
   *  * No more than 64 labels can be associated with a given resource.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * If you plan to use labels in your own code, please note that additional
   * characters may be allowed in the future. And so you are advised to use an
   * internal label representation, such as JSON, which doesn't rely upon
   * specific characters being disallowed.  For example, representing labels
   * as the string:  name + "_" + value  would prove problematic if we were to
   * allow "_" in a future release.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud
   * resources into groups that reflect a customer's organizational needs and
   * deployment strategies. Cloud Labels can be used to filter collections of
   * resources. They can be used to control how resource metrics are aggregated.
   * And they can be used as arguments to policy management rules (e.g. route,
   * firewall, load balancing, etc.).
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z][a-z0-9_-]{0,62}`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `[a-z0-9_-]{0,63}`.
   *  * No more than 64 labels can be associated with a given resource.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * If you plan to use labels in your own code, please note that additional
   * characters may be allowed in the future. And so you are advised to use an
   * internal label representation, such as JSON, which doesn't rely upon
   * specific characters being disallowed.  For example, representing labels
   * as the string:  name + "_" + value  would prove problematic if we were to
   * allow "_" in a future release.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud
   * resources into groups that reflect a customer's organizational needs and
   * deployment strategies. Cloud Labels can be used to filter collections of
   * resources. They can be used to control how resource metrics are aggregated.
   * And they can be used as arguments to policy management rules (e.g. route,
   * firewall, load balancing, etc.).
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z][a-z0-9_-]{0,62}`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `[a-z0-9_-]{0,63}`.
   *  * No more than 64 labels can be associated with a given resource.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * If you plan to use labels in your own code, please note that additional
   * characters may be allowed in the future. And so you are advised to use an
   * internal label representation, such as JSON, which doesn't rely upon
   * specific characters being disallowed.  For example, representing labels
   * as the string:  name + "_" + value  would prove problematic if we were to
   * allow "_" in a future release.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Deprecated. This field is not populated.
   * </pre>
   *
   * <code>repeated string endpoint_uris = 8;</code>
   * @return A list containing the endpointUris.
   */
  java.util.List<java.lang.String>
      getEndpointUrisList();
  /**
   * <pre>
   * Deprecated. This field is not populated.
   * </pre>
   *
   * <code>repeated string endpoint_uris = 8;</code>
   * @return The count of endpointUris.
   */
  int getEndpointUrisCount();
  /**
   * <pre>
   * Deprecated. This field is not populated.
   * </pre>
   *
   * <code>repeated string endpoint_uris = 8;</code>
   * @param index The index of the element to return.
   * @return The endpointUris at the given index.
   */
  java.lang.String getEndpointUris(int index);
  /**
   * <pre>
   * Deprecated. This field is not populated.
   * </pre>
   *
   * <code>repeated string endpoint_uris = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the endpointUris at the given index.
   */
  com.google.protobuf.ByteString
      getEndpointUrisBytes(int index);

  /**
   * <pre>
   * Output only. The time at which the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time at which the instance was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time at which the instance was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time at which the instance was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}