// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

public interface CommonObjectRequestParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.CommonObjectRequestParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Encryption algorithm used with the Customer-Supplied Encryption Keys
   * feature.
   * </pre>
   *
   * <code>string encryption_algorithm = 1;</code>
   * @return The encryptionAlgorithm.
   */
  java.lang.String getEncryptionAlgorithm();
  /**
   * <pre>
   * Encryption algorithm used with the Customer-Supplied Encryption Keys
   * feature.
   * </pre>
   *
   * <code>string encryption_algorithm = 1;</code>
   * @return The bytes for encryptionAlgorithm.
   */
  com.google.protobuf.ByteString
      getEncryptionAlgorithmBytes();

  /**
   * <pre>
   * Encryption key used with the Customer-Supplied Encryption Keys feature.
   * In raw bytes format (not base64-encoded).
   * </pre>
   *
   * <code>bytes encryption_key_bytes = 4;</code>
   * @return The encryptionKeyBytes.
   */
  com.google.protobuf.ByteString getEncryptionKeyBytes();

  /**
   * <pre>
   * SHA256 hash of encryption key used with the Customer-Supplied Encryption
   * Keys feature.
   * </pre>
   *
   * <code>bytes encryption_key_sha256_bytes = 5;</code>
   * @return The encryptionKeySha256Bytes.
   */
  com.google.protobuf.ByteString getEncryptionKeySha256Bytes();
}