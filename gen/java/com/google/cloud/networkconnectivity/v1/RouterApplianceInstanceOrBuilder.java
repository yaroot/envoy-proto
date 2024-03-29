// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface RouterApplianceInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.RouterApplianceInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI of the VM.
   * </pre>
   *
   * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The virtualMachine.
   */
  java.lang.String getVirtualMachine();
  /**
   * <pre>
   * The URI of the VM.
   * </pre>
   *
   * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for virtualMachine.
   */
  com.google.protobuf.ByteString
      getVirtualMachineBytes();

  /**
   * <pre>
   * The IP address on the VM to use for peering.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <pre>
   * The IP address on the VM to use for peering.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();
}
