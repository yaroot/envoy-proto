// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public interface IndexEndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.IndexEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the IndexEndpoint.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the IndexEndpoint.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The display name of the IndexEndpoint.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The display name of the IndexEndpoint.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The description of the IndexEndpoint.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the IndexEndpoint.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. The indexes deployed in this endpoint.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedIndex deployed_indexes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.DeployedIndex> 
      getDeployedIndexesList();
  /**
   * <pre>
   * Output only. The indexes deployed in this endpoint.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedIndex deployed_indexes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedIndex getDeployedIndexes(int index);
  /**
   * <pre>
   * Output only. The indexes deployed in this endpoint.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedIndex deployed_indexes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getDeployedIndexesCount();
  /**
   * <pre>
   * Output only. The indexes deployed in this endpoint.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedIndex deployed_indexes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DeployedIndexOrBuilder> 
      getDeployedIndexesOrBuilderList();
  /**
   * <pre>
   * Output only. The indexes deployed in this endpoint.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedIndex deployed_indexes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedIndexOrBuilder getDeployedIndexesOrBuilder(
      int index);

  /**
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * The labels with user-defined metadata to organize your IndexEndpoints.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels with user-defined metadata to organize your IndexEndpoints.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
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
   * The labels with user-defined metadata to organize your IndexEndpoints.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels with user-defined metadata to organize your IndexEndpoints.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The labels with user-defined metadata to organize your IndexEndpoints.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Timestamp when this IndexEndpoint was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this IndexEndpoint was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this IndexEndpoint was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this IndexEndpoint was last updated.
   * This timestamp is not updated when the endpoint's DeployedIndexes are
   * updated, e.g. due to updates of the original Indexes they are the
   * deployments of.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this IndexEndpoint was last updated.
   * This timestamp is not updated when the endpoint's DeployedIndexes are
   * updated, e.g. due to updates of the original Indexes they are the
   * deployments of.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this IndexEndpoint was last updated.
   * This timestamp is not updated when the endpoint's DeployedIndexes are
   * updated, e.g. due to updates of the original Indexes they are the
   * deployments of.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the IndexEndpoint should be peered.
   * Private services access must already be configured for the network. If left
   * unspecified, the Endpoint is not peered with any network.
   * [network][google.cloud.aiplatform.v1beta1.IndexEndpoint.network] and
   * [private_service_connect_config][google.cloud.aiplatform.v1beta1.IndexEndpoint.private_service_connect_config]
   * are mutually exclusive.
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert):
   * `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in '12345', and {network} is
   * network name.
   * </pre>
   *
   * <code>string network = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the IndexEndpoint should be peered.
   * Private services access must already be configured for the network. If left
   * unspecified, the Endpoint is not peered with any network.
   * [network][google.cloud.aiplatform.v1beta1.IndexEndpoint.network] and
   * [private_service_connect_config][google.cloud.aiplatform.v1beta1.IndexEndpoint.private_service_connect_config]
   * are mutually exclusive.
   * [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert):
   * `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in '12345', and {network} is
   * network name.
   * </pre>
   *
   * <code>string network = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * Optional. Deprecated: If true, expose the IndexEndpoint via private service connect.
   * Only one of the fields, [network][google.cloud.aiplatform.v1beta1.IndexEndpoint.network] or
   * [enable_private_service_connect][google.cloud.aiplatform.v1beta1.IndexEndpoint.enable_private_service_connect],
   * can be set.
   * </pre>
   *
   * <code>bool enable_private_service_connect = 10 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   * @deprecated google.cloud.aiplatform.v1beta1.IndexEndpoint.enable_private_service_connect is deprecated.
   *     See google/cloud/aiplatform/v1beta1/index_endpoint.proto;l=97
   * @return The enablePrivateServiceConnect.
   */
  @java.lang.Deprecated boolean getEnablePrivateServiceConnect();
}
