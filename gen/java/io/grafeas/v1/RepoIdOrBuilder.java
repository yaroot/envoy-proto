// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/provenance.proto

package io.grafeas.v1;

public interface RepoIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.RepoId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A combination of a project ID and a repo name.
   * </pre>
   *
   * <code>.grafeas.v1.ProjectRepoId project_repo_id = 1;</code>
   * @return Whether the projectRepoId field is set.
   */
  boolean hasProjectRepoId();
  /**
   * <pre>
   * A combination of a project ID and a repo name.
   * </pre>
   *
   * <code>.grafeas.v1.ProjectRepoId project_repo_id = 1;</code>
   * @return The projectRepoId.
   */
  io.grafeas.v1.ProjectRepoId getProjectRepoId();
  /**
   * <pre>
   * A combination of a project ID and a repo name.
   * </pre>
   *
   * <code>.grafeas.v1.ProjectRepoId project_repo_id = 1;</code>
   */
  io.grafeas.v1.ProjectRepoIdOrBuilder getProjectRepoIdOrBuilder();

  /**
   * <pre>
   * A server-assigned, globally unique identifier.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return Whether the uid field is set.
   */
  boolean hasUid();
  /**
   * <pre>
   * A server-assigned, globally unique identifier.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * A server-assigned, globally unique identifier.
   * </pre>
   *
   * <code>string uid = 2;</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  public io.grafeas.v1.RepoId.IdCase getIdCase();
}