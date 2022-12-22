// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NetworkEdgeSecurityServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEdgeSecurityService)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString
      getCreationTimestampBytes();

  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a NetworkEdgeSecurityService. An up-to-date fingerprint must be provided in order to update the NetworkEdgeSecurityService, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a NetworkEdgeSecurityService.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a NetworkEdgeSecurityService. An up-to-date fingerprint must be provided in order to update the NetworkEdgeSecurityService, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a NetworkEdgeSecurityService.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a NetworkEdgeSecurityService. An up-to-date fingerprint must be provided in order to update the NetworkEdgeSecurityService, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a NetworkEdgeSecurityService.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString
      getFingerprintBytes();

  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * [Output only] Type of the resource. Always compute#networkEdgeSecurityService for NetworkEdgeSecurityServices
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output only] Type of the resource. Always compute#networkEdgeSecurityService for NetworkEdgeSecurityServices
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output only] Type of the resource. Always compute#networkEdgeSecurityService for NetworkEdgeSecurityServices
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [Output Only] URL of the region where the resource resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   * <pre>
   * [Output Only] URL of the region where the resource resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * [Output Only] URL of the region where the resource resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * The resource URL for the network edge security service associated with this network edge security service.
   * </pre>
   *
   * <code>optional string security_policy = 171082513;</code>
   * @return Whether the securityPolicy field is set.
   */
  boolean hasSecurityPolicy();
  /**
   * <pre>
   * The resource URL for the network edge security service associated with this network edge security service.
   * </pre>
   *
   * <code>optional string security_policy = 171082513;</code>
   * @return The securityPolicy.
   */
  java.lang.String getSecurityPolicy();
  /**
   * <pre>
   * The resource URL for the network edge security service associated with this network edge security service.
   * </pre>
   *
   * <code>optional string security_policy = 171082513;</code>
   * @return The bytes for securityPolicy.
   */
  com.google.protobuf.ByteString
      getSecurityPolicyBytes();

  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   * @return Whether the selfLinkWithId field is set.
   */
  boolean hasSelfLinkWithId();
  /**
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   * @return The selfLinkWithId.
   */
  java.lang.String getSelfLinkWithId();
  /**
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   * @return The bytes for selfLinkWithId.
   */
  com.google.protobuf.ByteString
      getSelfLinkWithIdBytes();
}