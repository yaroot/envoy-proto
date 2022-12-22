// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/synonymset.proto

package com.google.cloud.contentwarehouse.v1;

public interface SynonymSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.SynonymSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the SynonymSet
   * This is mandatory for google.api.resource.
   * Format:
   * projects/{project_number}/locations/{location}/synonymSets/{context}.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the SynonymSet
   * This is mandatory for google.api.resource.
   * Format:
   * projects/{project_number}/locations/{location}/synonymSets/{context}.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This is a freeform field. Example contexts can be "sales," "engineering,"
   * "real estate," "accounting," etc.
   * The context can be supplied during search requests.
   * </pre>
   *
   * <code>string context = 2;</code>
   * @return The context.
   */
  java.lang.String getContext();
  /**
   * <pre>
   * This is a freeform field. Example contexts can be "sales," "engineering,"
   * "real estate," "accounting," etc.
   * The context can be supplied during search requests.
   * </pre>
   *
   * <code>string context = 2;</code>
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString
      getContextBytes();

  /**
   * <pre>
   * List of Synonyms for the context.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.SynonymSet.Synonym synonyms = 3;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.SynonymSet.Synonym> 
      getSynonymsList();
  /**
   * <pre>
   * List of Synonyms for the context.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.SynonymSet.Synonym synonyms = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.SynonymSet.Synonym getSynonyms(int index);
  /**
   * <pre>
   * List of Synonyms for the context.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.SynonymSet.Synonym synonyms = 3;</code>
   */
  int getSynonymsCount();
  /**
   * <pre>
   * List of Synonyms for the context.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.SynonymSet.Synonym synonyms = 3;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.SynonymSet.SynonymOrBuilder> 
      getSynonymsOrBuilderList();
  /**
   * <pre>
   * List of Synonyms for the context.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.SynonymSet.Synonym synonyms = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.SynonymSet.SynonymOrBuilder getSynonymsOrBuilder(
      int index);
}