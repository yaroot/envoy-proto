// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AwsNodeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsNodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The AWS instance type.
   * When unspecified, it uses a default based on the node pool's version.
   * </pre>
   *
   * <code>string instance_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The instanceType.
   */
  java.lang.String getInstanceType();
  /**
   * <pre>
   * Optional. The AWS instance type.
   * When unspecified, it uses a default based on the node pool's version.
   * </pre>
   *
   * <code>string instance_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for instanceType.
   */
  com.google.protobuf.ByteString
      getInstanceTypeBytes();

  /**
   * <pre>
   * Optional. Template for the root volume provisioned for node pool nodes.
   * Volumes will be provisioned in the availability zone assigned
   * to the node pool subnet.
   * When unspecified, it defaults to 32 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsVolumeTemplate root_volume = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the rootVolume field is set.
   */
  boolean hasRootVolume();
  /**
   * <pre>
   * Optional. Template for the root volume provisioned for node pool nodes.
   * Volumes will be provisioned in the availability zone assigned
   * to the node pool subnet.
   * When unspecified, it defaults to 32 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsVolumeTemplate root_volume = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rootVolume.
   */
  com.google.cloud.gkemulticloud.v1.AwsVolumeTemplate getRootVolume();
  /**
   * <pre>
   * Optional. Template for the root volume provisioned for node pool nodes.
   * Volumes will be provisioned in the availability zone assigned
   * to the node pool subnet.
   * When unspecified, it defaults to 32 GiB with the GP2 volume type.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsVolumeTemplate root_volume = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsVolumeTemplateOrBuilder getRootVolumeOrBuilder();

  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.NodeTaint> 
      getTaintsList();
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.NodeTaint getTaints(int index);
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getTaintsCount();
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.NodeTaintOrBuilder> 
      getTaintsOrBuilderList();
  /**
   * <pre>
   * Optional. The initial taints assigned to nodes of this node pool.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.NodeTaint taints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.NodeTaintOrBuilder getTaintsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The initial labels assigned to nodes of this node pool. An object
   * containing a list of "key": value pairs. Example: { "name": "wrench",
   * "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Key/value metadata to assign to each underlying AWS resource.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Optional. Key/value metadata to assign to each underlying AWS resource.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Optional. Key/value metadata to assign to each underlying AWS resource.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Optional. Key/value metadata to assign to each underlying AWS resource.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Key/value metadata to assign to each underlying AWS resource.
   * Specify at most 50 pairs containing alphanumerics, spaces, and symbols
   * (.+-=_:&#64;/). Keys can be up to 127 Unicode characters. Values can be up to
   * 255 Unicode characters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. The name or ARN of the AWS IAM role assigned to nodes in the
   * pool.
   * </pre>
   *
   * <code>string iam_instance_profile = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The iamInstanceProfile.
   */
  java.lang.String getIamInstanceProfile();
  /**
   * <pre>
   * Required. The name or ARN of the AWS IAM role assigned to nodes in the
   * pool.
   * </pre>
   *
   * <code>string iam_instance_profile = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for iamInstanceProfile.
   */
  com.google.protobuf.ByteString
      getIamInstanceProfileBytes();

  /**
   * <pre>
   * Optional. The OS image type to use on node pool instances.
   * Can have a value of `ubuntu`, or `windows` if the cluster enables
   * the Windows node pool preview feature.
   * When unspecified, it defaults to `ubuntu`.
   * </pre>
   *
   * <code>string image_type = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The imageType.
   */
  java.lang.String getImageType();
  /**
   * <pre>
   * Optional. The OS image type to use on node pool instances.
   * Can have a value of `ubuntu`, or `windows` if the cluster enables
   * the Windows node pool preview feature.
   * When unspecified, it defaults to `ubuntu`.
   * </pre>
   *
   * <code>string image_type = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for imageType.
   */
  com.google.protobuf.ByteString
      getImageTypeBytes();

  /**
   * <pre>
   * Optional. The SSH configuration.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsSshConfig ssh_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the sshConfig field is set.
   */
  boolean hasSshConfig();
  /**
   * <pre>
   * Optional. The SSH configuration.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsSshConfig ssh_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sshConfig.
   */
  com.google.cloud.gkemulticloud.v1.AwsSshConfig getSshConfig();
  /**
   * <pre>
   * Optional. The SSH configuration.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsSshConfig ssh_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsSshConfigOrBuilder getSshConfigOrBuilder();

  /**
   * <pre>
   * Optional. The IDs of additional security groups to add to nodes in this
   * pool. The manager will automatically create security groups with minimum
   * rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the securityGroupIds.
   */
  java.util.List<java.lang.String>
      getSecurityGroupIdsList();
  /**
   * <pre>
   * Optional. The IDs of additional security groups to add to nodes in this
   * pool. The manager will automatically create security groups with minimum
   * rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of securityGroupIds.
   */
  int getSecurityGroupIdsCount();
  /**
   * <pre>
   * Optional. The IDs of additional security groups to add to nodes in this
   * pool. The manager will automatically create security groups with minimum
   * rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The securityGroupIds at the given index.
   */
  java.lang.String getSecurityGroupIds(int index);
  /**
   * <pre>
   * Optional. The IDs of additional security groups to add to nodes in this
   * pool. The manager will automatically create security groups with minimum
   * rules needed for a functioning cluster.
   * </pre>
   *
   * <code>repeated string security_group_ids = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the securityGroupIds at the given index.
   */
  com.google.protobuf.ByteString
      getSecurityGroupIdsBytes(int index);

  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsProxyConfig proxy_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the proxyConfig field is set.
   */
  boolean hasProxyConfig();
  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsProxyConfig proxy_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The proxyConfig.
   */
  com.google.cloud.gkemulticloud.v1.AwsProxyConfig getProxyConfig();
  /**
   * <pre>
   * Optional. Proxy configuration for outbound HTTP(S) traffic.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsProxyConfig proxy_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsProxyConfigOrBuilder getProxyConfigOrBuilder();

  /**
   * <pre>
   * Required. Config encryption for user data.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsConfigEncryption config_encryption = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the configEncryption field is set.
   */
  boolean hasConfigEncryption();
  /**
   * <pre>
   * Required. Config encryption for user data.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsConfigEncryption config_encryption = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The configEncryption.
   */
  com.google.cloud.gkemulticloud.v1.AwsConfigEncryption getConfigEncryption();
  /**
   * <pre>
   * Required. Config encryption for user data.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsConfigEncryption config_encryption = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsConfigEncryptionOrBuilder getConfigEncryptionOrBuilder();

  /**
   * <pre>
   * Optional. Placement related info for this node.
   * When unspecified, the VPC's default tenancy will be used.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsInstancePlacement instance_placement = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the instancePlacement field is set.
   */
  boolean hasInstancePlacement();
  /**
   * <pre>
   * Optional. Placement related info for this node.
   * When unspecified, the VPC's default tenancy will be used.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsInstancePlacement instance_placement = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The instancePlacement.
   */
  com.google.cloud.gkemulticloud.v1.AwsInstancePlacement getInstancePlacement();
  /**
   * <pre>
   * Optional. Placement related info for this node.
   * When unspecified, the VPC's default tenancy will be used.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsInstancePlacement instance_placement = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsInstancePlacementOrBuilder getInstancePlacementOrBuilder();

  /**
   * <pre>
   * Optional. Configuration related to CloudWatch metrics collection on the
   * Auto Scaling group of the node pool.
   * When unspecified, metrics collection is disabled.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection autoscaling_metrics_collection = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the autoscalingMetricsCollection field is set.
   */
  boolean hasAutoscalingMetricsCollection();
  /**
   * <pre>
   * Optional. Configuration related to CloudWatch metrics collection on the
   * Auto Scaling group of the node pool.
   * When unspecified, metrics collection is disabled.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection autoscaling_metrics_collection = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The autoscalingMetricsCollection.
   */
  com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection getAutoscalingMetricsCollection();
  /**
   * <pre>
   * Optional. Configuration related to CloudWatch metrics collection on the
   * Auto Scaling group of the node pool.
   * When unspecified, metrics collection is disabled.
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection autoscaling_metrics_collection = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollectionOrBuilder getAutoscalingMetricsCollectionOrBuilder();
}