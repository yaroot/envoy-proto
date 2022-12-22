// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_download.proto

package com.google.devtools.resultstore.v2;

public interface ListConfiguredTargetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.ListConfiguredTargetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ConfiguredTargets matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.ConfiguredTarget configured_targets = 1;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.ConfiguredTarget> 
      getConfiguredTargetsList();
  /**
   * <pre>
   * ConfiguredTargets matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.ConfiguredTarget configured_targets = 1;</code>
   */
  com.google.devtools.resultstore.v2.ConfiguredTarget getConfiguredTargets(int index);
  /**
   * <pre>
   * ConfiguredTargets matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.ConfiguredTarget configured_targets = 1;</code>
   */
  int getConfiguredTargetsCount();
  /**
   * <pre>
   * ConfiguredTargets matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.ConfiguredTarget configured_targets = 1;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.ConfiguredTargetOrBuilder> 
      getConfiguredTargetsOrBuilderList();
  /**
   * <pre>
   * ConfiguredTargets matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.ConfiguredTarget configured_targets = 1;</code>
   */
  com.google.devtools.resultstore.v2.ConfiguredTargetOrBuilder getConfiguredTargetsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}