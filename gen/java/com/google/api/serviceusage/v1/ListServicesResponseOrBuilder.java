// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1/serviceusage.proto

package com.google.api.serviceusage.v1;

public interface ListServicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.ListServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The available services for the requested project.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  java.util.List<com.google.api.serviceusage.v1.Service> 
      getServicesList();
  /**
   * <pre>
   * The available services for the requested project.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  com.google.api.serviceusage.v1.Service getServices(int index);
  /**
   * <pre>
   * The available services for the requested project.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  int getServicesCount();
  /**
   * <pre>
   * The available services for the requested project.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1.ServiceOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <pre>
   * The available services for the requested project.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1.Service services = 1;</code>
   */
  com.google.api.serviceusage.v1.ServiceOrBuilder getServicesOrBuilder(
      int index);

  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated
   * query.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token that can be passed to `ListServices` to resume a paginated
   * query.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}