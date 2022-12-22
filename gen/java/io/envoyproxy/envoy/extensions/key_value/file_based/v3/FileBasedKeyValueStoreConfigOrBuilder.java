// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/key_value/file_based/v3/config.proto

package io.envoyproxy.envoy.extensions.key_value.file_based.v3;

public interface FileBasedKeyValueStoreConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.key_value.file_based.v3.FileBasedKeyValueStoreConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The filename to read the keys and values from, and write the keys and
   * values to.
   * </pre>
   *
   * <code>string filename = 1 [(.validate.rules) = { ... }</code>
   * @return The filename.
   */
  java.lang.String getFilename();
  /**
   * <pre>
   * The filename to read the keys and values from, and write the keys and
   * values to.
   * </pre>
   *
   * <code>string filename = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for filename.
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <pre>
   * The interval at which the key value store should be flushed to the file.
   * </pre>
   *
   * <code>.google.protobuf.Duration flush_interval = 2;</code>
   * @return Whether the flushInterval field is set.
   */
  boolean hasFlushInterval();
  /**
   * <pre>
   * The interval at which the key value store should be flushed to the file.
   * </pre>
   *
   * <code>.google.protobuf.Duration flush_interval = 2;</code>
   * @return The flushInterval.
   */
  com.google.protobuf.Duration getFlushInterval();
  /**
   * <pre>
   * The interval at which the key value store should be flushed to the file.
   * </pre>
   *
   * <code>.google.protobuf.Duration flush_interval = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getFlushIntervalOrBuilder();

  /**
   * <pre>
   * The maximum number of entries to cache, or 0 to allow for unlimited entries.
   * Defaults to 1000 if not present.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_entries = 3;</code>
   * @return Whether the maxEntries field is set.
   */
  boolean hasMaxEntries();
  /**
   * <pre>
   * The maximum number of entries to cache, or 0 to allow for unlimited entries.
   * Defaults to 1000 if not present.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_entries = 3;</code>
   * @return The maxEntries.
   */
  com.google.protobuf.UInt32Value getMaxEntries();
  /**
   * <pre>
   * The maximum number of entries to cache, or 0 to allow for unlimited entries.
   * Defaults to 1000 if not present.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_entries = 3;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getMaxEntriesOrBuilder();
}