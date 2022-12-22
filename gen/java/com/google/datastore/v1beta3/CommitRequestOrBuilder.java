// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

public interface CommitRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.CommitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The type of commit to perform. Defaults to `TRANSACTIONAL`.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.CommitRequest.Mode mode = 5;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * The type of commit to perform. Defaults to `TRANSACTIONAL`.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.CommitRequest.Mode mode = 5;</code>
   * @return The mode.
   */
  com.google.datastore.v1beta3.CommitRequest.Mode getMode();

  /**
   * <pre>
   * The identifier of the transaction associated with the commit. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1beta3.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 1;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <pre>
   * The identifier of the transaction associated with the commit. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1beta3.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 1;</code>
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   * <pre>
   * The mutations to perform.
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Mutation mutations = 6;</code>
   */
  java.util.List<com.google.datastore.v1beta3.Mutation> 
      getMutationsList();
  /**
   * <pre>
   * The mutations to perform.
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Mutation mutations = 6;</code>
   */
  com.google.datastore.v1beta3.Mutation getMutations(int index);
  /**
   * <pre>
   * The mutations to perform.
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Mutation mutations = 6;</code>
   */
  int getMutationsCount();
  /**
   * <pre>
   * The mutations to perform.
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Mutation mutations = 6;</code>
   */
  java.util.List<? extends com.google.datastore.v1beta3.MutationOrBuilder> 
      getMutationsOrBuilderList();
  /**
   * <pre>
   * The mutations to perform.
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Mutation mutations = 6;</code>
   */
  com.google.datastore.v1beta3.MutationOrBuilder getMutationsOrBuilder(
      int index);

  public com.google.datastore.v1beta3.CommitRequest.TransactionSelectorCase getTransactionSelectorCase();
}