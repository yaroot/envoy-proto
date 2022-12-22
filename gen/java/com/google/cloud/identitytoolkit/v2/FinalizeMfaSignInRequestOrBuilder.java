// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/identitytoolkit/v2/authentication_service.proto

package com.google.cloud.identitytoolkit.v2;

public interface FinalizeMfaSignInRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.identitytoolkit.v2.FinalizeMfaSignInRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Pending credential from first factor sign-in.
   * </pre>
   *
   * <code>string mfa_pending_credential = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The mfaPendingCredential.
   */
  java.lang.String getMfaPendingCredential();
  /**
   * <pre>
   * Required. Pending credential from first factor sign-in.
   * </pre>
   *
   * <code>string mfa_pending_credential = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for mfaPendingCredential.
   */
  com.google.protobuf.ByteString
      getMfaPendingCredentialBytes();

  /**
   * <pre>
   * Proof of completion of the SMS based MFA challenge.
   * </pre>
   *
   * <code>.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneRequestInfo phone_verification_info = 3;</code>
   * @return Whether the phoneVerificationInfo field is set.
   */
  boolean hasPhoneVerificationInfo();
  /**
   * <pre>
   * Proof of completion of the SMS based MFA challenge.
   * </pre>
   *
   * <code>.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneRequestInfo phone_verification_info = 3;</code>
   * @return The phoneVerificationInfo.
   */
  com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneRequestInfo getPhoneVerificationInfo();
  /**
   * <pre>
   * Proof of completion of the SMS based MFA challenge.
   * </pre>
   *
   * <code>.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneRequestInfo phone_verification_info = 3;</code>
   */
  com.google.cloud.identitytoolkit.v2.FinalizeMfaPhoneRequestInfoOrBuilder getPhoneVerificationInfoOrBuilder();

  /**
   * <pre>
   * The ID of the Identity Platform tenant the user is signing in to. If not
   * set, the user will sign in to the default Identity Platform project.
   * </pre>
   *
   * <code>string tenant_id = 4;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * The ID of the Identity Platform tenant the user is signing in to. If not
   * set, the user will sign in to the default Identity Platform project.
   * </pre>
   *
   * <code>string tenant_id = 4;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  public com.google.cloud.identitytoolkit.v2.FinalizeMfaSignInRequest.VerificationInfoCase getVerificationInfoCase();
}