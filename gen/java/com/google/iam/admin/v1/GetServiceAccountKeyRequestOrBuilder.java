// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface GetServiceAccountKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.GetServiceAccountKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the service account key in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the service account key in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The output format of the public key. The default is `TYPE_NONE`, which
   * means that the public key is not returned.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountPublicKeyType public_key_type = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for publicKeyType.
   */
  int getPublicKeyTypeValue();
  /**
   * <pre>
   * Optional. The output format of the public key. The default is `TYPE_NONE`, which
   * means that the public key is not returned.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountPublicKeyType public_key_type = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The publicKeyType.
   */
  com.google.iam.admin.v1.ServiceAccountPublicKeyType getPublicKeyType();
}
