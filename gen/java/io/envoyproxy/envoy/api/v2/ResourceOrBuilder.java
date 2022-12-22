// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/discovery.proto

package io.envoyproxy.envoy.api.v2;

public interface ResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource's name, to distinguish it from others of the same type of resource.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource's name, to distinguish it from others of the same type of resource.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The aliases are a list of other names that this resource can go by.
   * </pre>
   *
   * <code>repeated string aliases = 4;</code>
   * @return A list containing the aliases.
   */
  java.util.List<java.lang.String>
      getAliasesList();
  /**
   * <pre>
   * The aliases are a list of other names that this resource can go by.
   * </pre>
   *
   * <code>repeated string aliases = 4;</code>
   * @return The count of aliases.
   */
  int getAliasesCount();
  /**
   * <pre>
   * The aliases are a list of other names that this resource can go by.
   * </pre>
   *
   * <code>repeated string aliases = 4;</code>
   * @param index The index of the element to return.
   * @return The aliases at the given index.
   */
  java.lang.String getAliases(int index);
  /**
   * <pre>
   * The aliases are a list of other names that this resource can go by.
   * </pre>
   *
   * <code>repeated string aliases = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the aliases at the given index.
   */
  com.google.protobuf.ByteString
      getAliasesBytes(int index);

  /**
   * <pre>
   * The resource level version. It allows xDS to track the state of individual
   * resources.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The resource level version. It allows xDS to track the state of individual
   * resources.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The resource being tracked.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 2;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * The resource being tracked.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 2;</code>
   * @return The resource.
   */
  com.google.protobuf.Any getResource();
  /**
   * <pre>
   * The resource being tracked.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getResourceOrBuilder();
}