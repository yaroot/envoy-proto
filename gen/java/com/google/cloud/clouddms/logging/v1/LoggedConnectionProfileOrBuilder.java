// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/logging/v1/clouddms_platform_logs.proto

package com.google.cloud.clouddms.logging.v1;

public interface LoggedConnectionProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.logging.v1.LoggedConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier for a connection profile.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique identifier for a connection profile.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The current connection profile state.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.LoggedConnectionProfile.State state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The current connection profile state.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.LoggedConnectionProfile.State state = 3;</code>
   * @return The state.
   */
  com.google.cloud.clouddms.logging.v1.LoggedConnectionProfile.State getState();

  /**
   * <pre>
   * The display name.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A MySQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.MySqlConnectionProfile mysql = 100;</code>
   * @return Whether the mysql field is set.
   */
  boolean hasMysql();
  /**
   * <pre>
   * A MySQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.MySqlConnectionProfile mysql = 100;</code>
   * @return The mysql.
   */
  com.google.cloud.clouddms.logging.v1.MySqlConnectionProfile getMysql();
  /**
   * <pre>
   * A MySQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.MySqlConnectionProfile mysql = 100;</code>
   */
  com.google.cloud.clouddms.logging.v1.MySqlConnectionProfileOrBuilder getMysqlOrBuilder();

  /**
   * <pre>
   * A PostgreSQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile postgresql = 101;</code>
   * @return Whether the postgresql field is set.
   */
  boolean hasPostgresql();
  /**
   * <pre>
   * A PostgreSQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile postgresql = 101;</code>
   * @return The postgresql.
   */
  com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile getPostgresql();
  /**
   * <pre>
   * A PostgreSQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfile postgresql = 101;</code>
   */
  com.google.cloud.clouddms.logging.v1.PostgreSqlConnectionProfileOrBuilder getPostgresqlOrBuilder();

  /**
   * <pre>
   * A CloudSQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.CloudSqlConnectionProfile cloudsql = 102;</code>
   * @return Whether the cloudsql field is set.
   */
  boolean hasCloudsql();
  /**
   * <pre>
   * A CloudSQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.CloudSqlConnectionProfile cloudsql = 102;</code>
   * @return The cloudsql.
   */
  com.google.cloud.clouddms.logging.v1.CloudSqlConnectionProfile getCloudsql();
  /**
   * <pre>
   * A CloudSQL database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.CloudSqlConnectionProfile cloudsql = 102;</code>
   */
  com.google.cloud.clouddms.logging.v1.CloudSqlConnectionProfileOrBuilder getCloudsqlOrBuilder();

  /**
   * <pre>
   * An Oracle database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile oracle = 103;</code>
   * @return Whether the oracle field is set.
   */
  boolean hasOracle();
  /**
   * <pre>
   * An Oracle database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile oracle = 103;</code>
   * @return The oracle.
   */
  com.google.cloud.clouddms.logging.v1.OracleConnectionProfile getOracle();
  /**
   * <pre>
   * An Oracle database connection profile.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.OracleConnectionProfile oracle = 103;</code>
   */
  com.google.cloud.clouddms.logging.v1.OracleConnectionProfileOrBuilder getOracleOrBuilder();

  /**
   * <pre>
   * The error details in case of state FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error details in case of state FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error details in case of state FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 5;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.DatabaseProvider provider = 6;</code>
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.cloud.clouddms.logging.v1.DatabaseProvider provider = 6;</code>
   * @return The provider.
   */
  com.google.cloud.clouddms.logging.v1.DatabaseProvider getProvider();

  public com.google.cloud.clouddms.logging.v1.LoggedConnectionProfile.ConnectionProfileCase getConnectionProfileCase();
}