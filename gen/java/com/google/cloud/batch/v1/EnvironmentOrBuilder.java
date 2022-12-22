// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

public interface EnvironmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.Environment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  int getVariablesCount();
  /**
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  boolean containsVariables(
      java.lang.String key);
  /**
   * Use {@link #getVariablesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getVariables();
  /**
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVariablesMap();
  /**
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  /* nullable */
java.lang.String getVariablesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  java.lang.String getVariablesOrThrow(
      java.lang.String key);
}
