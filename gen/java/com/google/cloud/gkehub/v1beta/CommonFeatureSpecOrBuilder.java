// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/feature.proto

package com.google.cloud.gkehub.v1beta;

public interface CommonFeatureSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta.CommonFeatureSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1beta.FeatureSpec multiclusteringress = 102;</code>
   * @return Whether the multiclusteringress field is set.
   */
  boolean hasMulticlusteringress();
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1beta.FeatureSpec multiclusteringress = 102;</code>
   * @return The multiclusteringress.
   */
  com.google.cloud.gkehub.multiclusteringress.v1beta.FeatureSpec getMulticlusteringress();
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1beta.FeatureSpec multiclusteringress = 102;</code>
   */
  com.google.cloud.gkehub.multiclusteringress.v1beta.FeatureSpecOrBuilder getMulticlusteringressOrBuilder();

  public com.google.cloud.gkehub.v1beta.CommonFeatureSpec.FeatureSpecCase getFeatureSpecCase();
}