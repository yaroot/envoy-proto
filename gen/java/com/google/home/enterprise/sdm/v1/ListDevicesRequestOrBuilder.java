// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/home/enterprise/sdm/v1/smart_device_management_service.proto

package com.google.home.enterprise.sdm.v1;

public interface ListDevicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.home.enterprise.sdm.v1.ListDevicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent enterprise to list devices under. E.g. "enterprises/XYZ".
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent enterprise to list devices under. E.g. "enterprises/XYZ".
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional requested page size. Server may return fewer devices than
   * requested. If unspecified, server will pick an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional token of the page to retrieve.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional token of the page to retrieve.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional filter to list devices.
   * Filters can match the exact parent (could be a structure or a room):
   * 'parent=enterprises/XYZ/structures/jkl'
   * or filter by device custom name (substring match):
   * 'customName=wing'
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional filter to list devices.
   * Filters can match the exact parent (could be a structure or a room):
   * 'parent=enterprises/XYZ/structures/jkl'
   * or filter by device custom name (substring match):
   * 'customName=wing'
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}