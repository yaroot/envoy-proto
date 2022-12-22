// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

package com.google.cloud.bigquery.datapolicies.v1;

public interface DeleteDataPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v1.DeleteDataPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the data policy to delete. Format is
   * `projects/{project_number}/locations/{location_id}/dataPolicies/{data_policy_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the data policy to delete. Format is
   * `projects/{project_number}/locations/{location_id}/dataPolicies/{data_policy_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}