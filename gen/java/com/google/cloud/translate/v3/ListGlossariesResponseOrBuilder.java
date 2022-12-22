// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface ListGlossariesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.ListGlossariesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  java.util.List<com.google.cloud.translate.v3.Glossary> 
      getGlossariesList();
  /**
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  com.google.cloud.translate.v3.Glossary getGlossaries(int index);
  /**
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  int getGlossariesCount();
  /**
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.GlossaryOrBuilder> 
      getGlossariesOrBuilderList();
  /**
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Glossary glossaries = 1;</code>
   */
  com.google.cloud.translate.v3.GlossaryOrBuilder getGlossariesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to
   * `ListGlossaries` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to
   * `ListGlossaries` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}