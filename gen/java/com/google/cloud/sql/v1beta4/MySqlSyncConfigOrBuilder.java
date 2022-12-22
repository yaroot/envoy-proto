// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

public interface MySqlSyncConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.MySqlSyncConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Flags to use for the initial dump.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.SyncFlags initial_sync_flags = 1;</code>
   */
  java.util.List<com.google.cloud.sql.v1beta4.SyncFlags> 
      getInitialSyncFlagsList();
  /**
   * <pre>
   * Flags to use for the initial dump.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.SyncFlags initial_sync_flags = 1;</code>
   */
  com.google.cloud.sql.v1beta4.SyncFlags getInitialSyncFlags(int index);
  /**
   * <pre>
   * Flags to use for the initial dump.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.SyncFlags initial_sync_flags = 1;</code>
   */
  int getInitialSyncFlagsCount();
  /**
   * <pre>
   * Flags to use for the initial dump.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.SyncFlags initial_sync_flags = 1;</code>
   */
  java.util.List<? extends com.google.cloud.sql.v1beta4.SyncFlagsOrBuilder> 
      getInitialSyncFlagsOrBuilderList();
  /**
   * <pre>
   * Flags to use for the initial dump.
   * </pre>
   *
   * <code>repeated .google.cloud.sql.v1beta4.SyncFlags initial_sync_flags = 1;</code>
   */
  com.google.cloud.sql.v1beta4.SyncFlagsOrBuilder getInitialSyncFlagsOrBuilder(
      int index);
}