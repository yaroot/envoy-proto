// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/warehouse.proto

package com.google.cloud.visionai.v1alpha1;

public interface CreateSearchConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1alpha1.CreateSearchConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource where this search configuration will be created.
   * Format: projects/&#42;&#47;locations/&#42;&#47;corpora/&#42;
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource where this search configuration will be created.
   * Format: projects/&#42;&#47;locations/&#42;&#47;corpora/&#42;
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The search config to create.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1alpha1.SearchConfig search_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the searchConfig field is set.
   */
  boolean hasSearchConfig();
  /**
   * <pre>
   * Required. The search config to create.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1alpha1.SearchConfig search_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The searchConfig.
   */
  com.google.cloud.visionai.v1alpha1.SearchConfig getSearchConfig();
  /**
   * <pre>
   * Required. The search config to create.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1alpha1.SearchConfig search_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.visionai.v1alpha1.SearchConfigOrBuilder getSearchConfigOrBuilder();

  /**
   * <pre>
   * Required. ID to use for the new search config. Will become the final component of the
   * SearchConfig's resource name. This value should be up to 63 characters, and
   * valid characters are /[a-z][0-9]-_/. The first character must be a letter,
   * the last could be a letter or a number.
   * </pre>
   *
   * <code>string search_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The searchConfigId.
   */
  java.lang.String getSearchConfigId();
  /**
   * <pre>
   * Required. ID to use for the new search config. Will become the final component of the
   * SearchConfig's resource name. This value should be up to 63 characters, and
   * valid characters are /[a-z][0-9]-_/. The first character must be a letter,
   * the last could be a letter or a number.
   * </pre>
   *
   * <code>string search_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for searchConfigId.
   */
  com.google.protobuf.ByteString
      getSearchConfigIdBytes();
}