// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteworkers/v1test2/command.proto

package com.google.devtools.remoteworkers.v1test2;

public interface CommandOutputsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.remoteworkers.v1test2.CommandOutputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * exit_code is only fully reliable if the status' code is OK. If the task
   * exceeded its deadline or was cancelled, the process may still produce an
   * exit code as it is cancelled, and this will be populated, but a successful
   * (zero) is unlikely to be correct unless the status code is OK.
   * </pre>
   *
   * <code>int32 exit_code = 1;</code>
   * @return The exitCode.
   */
  int getExitCode();

  /**
   * <pre>
   * The output files. The blob referenced by the digest should contain
   * one of the following (implementation-dependent):
   *    * A marshalled DirectoryMetadata of the returned filesystem
   *    * A LUCI-style .isolated file
   * </pre>
   *
   * <code>.google.devtools.remoteworkers.v1test2.Digest outputs = 2;</code>
   * @return Whether the outputs field is set.
   */
  boolean hasOutputs();
  /**
   * <pre>
   * The output files. The blob referenced by the digest should contain
   * one of the following (implementation-dependent):
   *    * A marshalled DirectoryMetadata of the returned filesystem
   *    * A LUCI-style .isolated file
   * </pre>
   *
   * <code>.google.devtools.remoteworkers.v1test2.Digest outputs = 2;</code>
   * @return The outputs.
   */
  com.google.devtools.remoteworkers.v1test2.Digest getOutputs();
  /**
   * <pre>
   * The output files. The blob referenced by the digest should contain
   * one of the following (implementation-dependent):
   *    * A marshalled DirectoryMetadata of the returned filesystem
   *    * A LUCI-style .isolated file
   * </pre>
   *
   * <code>.google.devtools.remoteworkers.v1test2.Digest outputs = 2;</code>
   */
  com.google.devtools.remoteworkers.v1test2.DigestOrBuilder getOutputsOrBuilder();
}