// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/appengine.proto

package com.google.appengine.v1beta;

public interface GetVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1beta.GetVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource requested. Example:
   * `apps/myapp/services/default/versions/v1`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource requested. Example:
   * `apps/myapp/services/default/versions/v1`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Controls the set of fields returned in the `Get` response.
   * </pre>
   *
   * <code>.google.appengine.v1beta.VersionView view = 2;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Controls the set of fields returned in the `Get` response.
   * </pre>
   *
   * <code>.google.appengine.v1beta.VersionView view = 2;</code>
   * @return The view.
   */
  com.google.appengine.v1beta.VersionView getView();
}