// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

public interface ReconConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.ReconConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configs for connected components.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig connected_components_config = 1;</code>
   * @return Whether the connectedComponentsConfig field is set.
   */
  boolean hasConnectedComponentsConfig();
  /**
   * <pre>
   * Configs for connected components.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig connected_components_config = 1;</code>
   * @return The connectedComponentsConfig.
   */
  com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig getConnectedComponentsConfig();
  /**
   * <pre>
   * Configs for connected components.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfig connected_components_config = 1;</code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.ConnectedComponentsConfigOrBuilder getConnectedComponentsConfigOrBuilder();

  /**
   * <pre>
   * Configs for affinity clustering.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.AffinityClusteringConfig affinity_clustering_config = 2;</code>
   * @return Whether the affinityClusteringConfig field is set.
   */
  boolean hasAffinityClusteringConfig();
  /**
   * <pre>
   * Configs for affinity clustering.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.AffinityClusteringConfig affinity_clustering_config = 2;</code>
   * @return The affinityClusteringConfig.
   */
  com.google.cloud.enterpriseknowledgegraph.v1.AffinityClusteringConfig getAffinityClusteringConfig();
  /**
   * <pre>
   * Configs for affinity clustering.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.AffinityClusteringConfig affinity_clustering_config = 2;</code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.AffinityClusteringConfigOrBuilder getAffinityClusteringConfigOrBuilder();

  /**
   * <pre>
   * Extra options that affect entity clustering behavior.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.Options options = 3;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   * Extra options that affect entity clustering behavior.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.Options options = 3;</code>
   * @return The options.
   */
  com.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.Options getOptions();
  /**
   * <pre>
   * Extra options that affect entity clustering behavior.
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.Options options = 3;</code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.OptionsOrBuilder getOptionsOrBuilder();

  /**
   * <pre>
   * Model Configs
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.ModelConfig model_config = 4;</code>
   * @return Whether the modelConfig field is set.
   */
  boolean hasModelConfig();
  /**
   * <pre>
   * Model Configs
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.ModelConfig model_config = 4;</code>
   * @return The modelConfig.
   */
  com.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.ModelConfig getModelConfig();
  /**
   * <pre>
   * Model Configs
   * </pre>
   *
   * <code>.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.ModelConfig model_config = 4;</code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.ModelConfigOrBuilder getModelConfigOrBuilder();

  public com.google.cloud.enterpriseknowledgegraph.v1.ReconConfig.ClusteringConfigCase getClusteringConfigCase();
}