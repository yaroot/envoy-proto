// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

package io.grafeas.v1beta1.attestation;

public interface AttestationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.attestation.Attestation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A PGP signed attestation.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.PgpSignedAttestation pgp_signed_attestation = 1;</code>
   * @return Whether the pgpSignedAttestation field is set.
   */
  boolean hasPgpSignedAttestation();
  /**
   * <pre>
   * A PGP signed attestation.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.PgpSignedAttestation pgp_signed_attestation = 1;</code>
   * @return The pgpSignedAttestation.
   */
  io.grafeas.v1beta1.attestation.PgpSignedAttestation getPgpSignedAttestation();
  /**
   * <pre>
   * A PGP signed attestation.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.PgpSignedAttestation pgp_signed_attestation = 1;</code>
   */
  io.grafeas.v1beta1.attestation.PgpSignedAttestationOrBuilder getPgpSignedAttestationOrBuilder();

  /**
   * <code>.grafeas.v1beta1.attestation.GenericSignedAttestation generic_signed_attestation = 2;</code>
   * @return Whether the genericSignedAttestation field is set.
   */
  boolean hasGenericSignedAttestation();
  /**
   * <code>.grafeas.v1beta1.attestation.GenericSignedAttestation generic_signed_attestation = 2;</code>
   * @return The genericSignedAttestation.
   */
  io.grafeas.v1beta1.attestation.GenericSignedAttestation getGenericSignedAttestation();
  /**
   * <code>.grafeas.v1beta1.attestation.GenericSignedAttestation generic_signed_attestation = 2;</code>
   */
  io.grafeas.v1beta1.attestation.GenericSignedAttestationOrBuilder getGenericSignedAttestationOrBuilder();

  public io.grafeas.v1beta1.attestation.Attestation.SignatureCase getSignatureCase();
}