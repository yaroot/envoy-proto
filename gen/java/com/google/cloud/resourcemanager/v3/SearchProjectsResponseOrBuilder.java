// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/projects.proto

package com.google.cloud.resourcemanager.v3;

public interface SearchProjectsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.SearchProjectsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  java.util.List<com.google.cloud.resourcemanager.v3.Project> 
      getProjectsList();
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.Project getProjects(int index);
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  int getProjectsCount();
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  java.util.List<? extends com.google.cloud.resourcemanager.v3.ProjectOrBuilder> 
      getProjectsOrBuilderList();
  /**
   * <pre>
   * The list of Projects that matched the list filter query. This list can
   * be paginated.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Project projects = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.ProjectOrBuilder getProjectsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token.
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   * Pagination tokens have a limited lifetime.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token.
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   * Pagination tokens have a limited lifetime.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}