// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/platform.proto

package com.google.cloud.visionai.v1;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * By default, the output of the node will only be available to downstream
   * nodes. To consume the direct output from the application node, the output
   * must be sent to Vision AI Streams at first.
   * By setting output_all_output_channels_to_stream to true, App Platform
   * will automatically send all the outputs of the current node to Vision AI
   * Stream resources (one stream per output channel). The output stream
   * resource will be created by App Platform automatically during deployment
   * and deleted after application un-deployment.
   * Note that this config applies to all the Application Instances.
   * The output stream can be override at instance level by
   * configuring the `output_resources` section of Instance resource.
   * `producer_node` should be current node, `output_resource_binding` should
   * be the output channel name (or leave it blank if there is only 1 output
   * channel of the processor) and `output_resource` should be the target
   * output stream.
   * </pre>
   *
   * <code>bool output_all_output_channels_to_stream = 6;</code>
   * @return Whether the outputAllOutputChannelsToStream field is set.
   */
  boolean hasOutputAllOutputChannelsToStream();
  /**
   * <pre>
   * By default, the output of the node will only be available to downstream
   * nodes. To consume the direct output from the application node, the output
   * must be sent to Vision AI Streams at first.
   * By setting output_all_output_channels_to_stream to true, App Platform
   * will automatically send all the outputs of the current node to Vision AI
   * Stream resources (one stream per output channel). The output stream
   * resource will be created by App Platform automatically during deployment
   * and deleted after application un-deployment.
   * Note that this config applies to all the Application Instances.
   * The output stream can be override at instance level by
   * configuring the `output_resources` section of Instance resource.
   * `producer_node` should be current node, `output_resource_binding` should
   * be the output channel name (or leave it blank if there is only 1 output
   * channel of the processor) and `output_resource` should be the target
   * output stream.
   * </pre>
   *
   * <code>bool output_all_output_channels_to_stream = 6;</code>
   * @return The outputAllOutputChannelsToStream.
   */
  boolean getOutputAllOutputChannelsToStream();

  /**
   * <pre>
   * Required. A unique name for the node.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. A unique name for the node.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A user friendly display name for the node.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A user friendly display name for the node.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Node config.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ProcessorConfig node_config = 3;</code>
   * @return Whether the nodeConfig field is set.
   */
  boolean hasNodeConfig();
  /**
   * <pre>
   * Node config.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ProcessorConfig node_config = 3;</code>
   * @return The nodeConfig.
   */
  com.google.cloud.visionai.v1.ProcessorConfig getNodeConfig();
  /**
   * <pre>
   * Node config.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ProcessorConfig node_config = 3;</code>
   */
  com.google.cloud.visionai.v1.ProcessorConfigOrBuilder getNodeConfigOrBuilder();

  /**
   * <pre>
   * Processor name refer to the chosen processor resource.
   * </pre>
   *
   * <code>string processor = 4;</code>
   * @return The processor.
   */
  java.lang.String getProcessor();
  /**
   * <pre>
   * Processor name refer to the chosen processor resource.
   * </pre>
   *
   * <code>string processor = 4;</code>
   * @return The bytes for processor.
   */
  com.google.protobuf.ByteString
      getProcessorBytes();

  /**
   * <pre>
   * Parent node. Input node should not have parent node. For V1 Alpha1/Beta
   * only media warehouse node can have multiple parents, other types of nodes
   * will only have one parent.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Node.InputEdge parents = 5;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.Node.InputEdge> 
      getParentsList();
  /**
   * <pre>
   * Parent node. Input node should not have parent node. For V1 Alpha1/Beta
   * only media warehouse node can have multiple parents, other types of nodes
   * will only have one parent.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Node.InputEdge parents = 5;</code>
   */
  com.google.cloud.visionai.v1.Node.InputEdge getParents(int index);
  /**
   * <pre>
   * Parent node. Input node should not have parent node. For V1 Alpha1/Beta
   * only media warehouse node can have multiple parents, other types of nodes
   * will only have one parent.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Node.InputEdge parents = 5;</code>
   */
  int getParentsCount();
  /**
   * <pre>
   * Parent node. Input node should not have parent node. For V1 Alpha1/Beta
   * only media warehouse node can have multiple parents, other types of nodes
   * will only have one parent.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Node.InputEdge parents = 5;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.Node.InputEdgeOrBuilder> 
      getParentsOrBuilderList();
  /**
   * <pre>
   * Parent node. Input node should not have parent node. For V1 Alpha1/Beta
   * only media warehouse node can have multiple parents, other types of nodes
   * will only have one parent.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Node.InputEdge parents = 5;</code>
   */
  com.google.cloud.visionai.v1.Node.InputEdgeOrBuilder getParentsOrBuilder(
      int index);

  public com.google.cloud.visionai.v1.Node.StreamOutputConfigCase getStreamOutputConfigCase();
}