// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/home/enterprise/sdm/v1/smart_device_management_service.proto

package com.google.home.enterprise.sdm.v1;

public interface GetRoomRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.home.enterprise.sdm.v1.GetRoomRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the room requested. For example:
   * "enterprises/XYZ/structures/ABC/rooms/123".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the room requested. For example:
   * "enterprises/XYZ/structures/ABC/rooms/123".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}