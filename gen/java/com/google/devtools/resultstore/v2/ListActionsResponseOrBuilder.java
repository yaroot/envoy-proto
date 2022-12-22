// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_download.proto

package com.google.devtools.resultstore.v2;

public interface ListActionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.ListActionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Actions matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Action actions = 1;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.Action> 
      getActionsList();
  /**
   * <pre>
   * Actions matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Action actions = 1;</code>
   */
  com.google.devtools.resultstore.v2.Action getActions(int index);
  /**
   * <pre>
   * Actions matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Action actions = 1;</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * Actions matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Action actions = 1;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.ActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * Actions matching the request,
   * possibly capped at request.page_size or a server limit.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Action actions = 1;</code>
   */
  com.google.devtools.resultstore.v2.ActionOrBuilder getActionsOrBuilder(
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