// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface InlineSecretOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.InlineSecret)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
   * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   * <pre>
   * Resource name of Cloud KMS crypto key to decrypt the encrypted value.
   * In format: projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;
   * </pre>
   *
   * <code>string kms_key_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString
      getKmsKeyNameBytes();

  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  int getEnvMapCount();
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  boolean containsEnvMap(
      java.lang.String key);
  /**
   * Use {@link #getEnvMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getEnvMap();
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getEnvMapMap();
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  /* nullable */
com.google.protobuf.ByteString getEnvMapOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.ByteString defaultValue);
  /**
   * <pre>
   * Map of environment variable name to its encrypted value.
   * Secret environment variables must be unique across all of a build's
   * secrets, and must be used by at least one build step. Values can be at most
   * 64 KB in size. There can be at most 100 secret values across all of a
   * build's secrets.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; env_map = 2;</code>
   */
  com.google.protobuf.ByteString getEnvMapOrThrow(
      java.lang.String key);
}
