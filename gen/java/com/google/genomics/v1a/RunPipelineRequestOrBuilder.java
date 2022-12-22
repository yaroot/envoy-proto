// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1alpha2/pipelines.proto

package com.google.genomics.v1a;

public interface RunPipelineRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1alpha2.RunPipelineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The already created pipeline to run.
   * </pre>
   *
   * <code>string pipeline_id = 1;</code>
   * @return Whether the pipelineId field is set.
   */
  boolean hasPipelineId();
  /**
   * <pre>
   * The already created pipeline to run.
   * </pre>
   *
   * <code>string pipeline_id = 1;</code>
   * @return The pipelineId.
   */
  java.lang.String getPipelineId();
  /**
   * <pre>
   * The already created pipeline to run.
   * </pre>
   *
   * <code>string pipeline_id = 1;</code>
   * @return The bytes for pipelineId.
   */
  com.google.protobuf.ByteString
      getPipelineIdBytes();

  /**
   * <pre>
   * A new pipeline object to run once and then delete.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.Pipeline ephemeral_pipeline = 2;</code>
   * @return Whether the ephemeralPipeline field is set.
   */
  boolean hasEphemeralPipeline();
  /**
   * <pre>
   * A new pipeline object to run once and then delete.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.Pipeline ephemeral_pipeline = 2;</code>
   * @return The ephemeralPipeline.
   */
  com.google.genomics.v1a.Pipeline getEphemeralPipeline();
  /**
   * <pre>
   * A new pipeline object to run once and then delete.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.Pipeline ephemeral_pipeline = 2;</code>
   */
  com.google.genomics.v1a.PipelineOrBuilder getEphemeralPipelineOrBuilder();

  /**
   * <pre>
   * The arguments to use when running this pipeline.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.RunPipelineArgs pipeline_args = 3;</code>
   * @return Whether the pipelineArgs field is set.
   */
  boolean hasPipelineArgs();
  /**
   * <pre>
   * The arguments to use when running this pipeline.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.RunPipelineArgs pipeline_args = 3;</code>
   * @return The pipelineArgs.
   */
  com.google.genomics.v1a.RunPipelineArgs getPipelineArgs();
  /**
   * <pre>
   * The arguments to use when running this pipeline.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.RunPipelineArgs pipeline_args = 3;</code>
   */
  com.google.genomics.v1a.RunPipelineArgsOrBuilder getPipelineArgsOrBuilder();

  public com.google.genomics.v1a.RunPipelineRequest.PipelineCase getPipelineCase();
}