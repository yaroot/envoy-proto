// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/identitytoolkit/v2/authentication_service.proto

package com.google.cloud.identitytoolkit.v2;

public interface StartMfaSignInResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.identitytoolkit.v2.StartMfaSignInResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * MultiFactor sign-in session information specific to SMS-type second
   * factors. Along with the one-time code retrieved from the sent SMS, the
   * contents of this session information should be passed to
   * FinalizeMfaSignIn to complete the sign in.
   * </pre>
   *
   * <code>.google.cloud.identitytoolkit.v2.StartMfaPhoneResponseInfo phone_response_info = 1;</code>
   * @return Whether the phoneResponseInfo field is set.
   */
  boolean hasPhoneResponseInfo();
  /**
   * <pre>
   * MultiFactor sign-in session information specific to SMS-type second
   * factors. Along with the one-time code retrieved from the sent SMS, the
   * contents of this session information should be passed to
   * FinalizeMfaSignIn to complete the sign in.
   * </pre>
   *
   * <code>.google.cloud.identitytoolkit.v2.StartMfaPhoneResponseInfo phone_response_info = 1;</code>
   * @return The phoneResponseInfo.
   */
  com.google.cloud.identitytoolkit.v2.StartMfaPhoneResponseInfo getPhoneResponseInfo();
  /**
   * <pre>
   * MultiFactor sign-in session information specific to SMS-type second
   * factors. Along with the one-time code retrieved from the sent SMS, the
   * contents of this session information should be passed to
   * FinalizeMfaSignIn to complete the sign in.
   * </pre>
   *
   * <code>.google.cloud.identitytoolkit.v2.StartMfaPhoneResponseInfo phone_response_info = 1;</code>
   */
  com.google.cloud.identitytoolkit.v2.StartMfaPhoneResponseInfoOrBuilder getPhoneResponseInfoOrBuilder();

  public com.google.cloud.identitytoolkit.v2.StartMfaSignInResponse.ResponseInfoCase getResponseInfoCase();
}