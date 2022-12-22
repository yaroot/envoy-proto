// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2beta/functions.proto

package com.google.cloud.functions.v2beta;

public interface SourceProvenanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.SourceProvenance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
   * @return Whether the resolvedStorageSource field is set.
   */
  boolean hasResolvedStorageSource();
  /**
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
   * @return The resolvedStorageSource.
   */
  com.google.cloud.functions.v2beta.StorageSource getResolvedStorageSource();
  /**
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource resolved_storage_source = 1;</code>
   */
  com.google.cloud.functions.v2beta.StorageSourceOrBuilder getResolvedStorageSourceOrBuilder();

  /**
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
   * @return Whether the resolvedRepoSource field is set.
   */
  boolean hasResolvedRepoSource();
  /**
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
   * @return The resolvedRepoSource.
   */
  com.google.cloud.functions.v2beta.RepoSource getResolvedRepoSource();
  /**
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource resolved_repo_source = 2;</code>
   */
  com.google.cloud.functions.v2beta.RepoSourceOrBuilder getResolvedRepoSourceOrBuilder();
}