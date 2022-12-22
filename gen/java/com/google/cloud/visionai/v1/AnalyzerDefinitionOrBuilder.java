// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/lva.proto

package com.google.cloud.visionai.v1;

public interface AnalyzerDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.AnalyzerDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this analyzer.
   * Tentatively [a-z][a-z0-9]*(_[a-z0-9]+)*.
   * </pre>
   *
   * <code>string analyzer = 1;</code>
   * @return The analyzer.
   */
  java.lang.String getAnalyzer();
  /**
   * <pre>
   * The name of this analyzer.
   * Tentatively [a-z][a-z0-9]*(_[a-z0-9]+)*.
   * </pre>
   *
   * <code>string analyzer = 1;</code>
   * @return The bytes for analyzer.
   */
  com.google.protobuf.ByteString
      getAnalyzerBytes();

  /**
   * <pre>
   * The name of the operator that this analyzer runs.
   * Must match the name of a supported operator.
   * </pre>
   *
   * <code>string operator = 2;</code>
   * @return The operator.
   */
  java.lang.String getOperator();
  /**
   * <pre>
   * The name of the operator that this analyzer runs.
   * Must match the name of a supported operator.
   * </pre>
   *
   * <code>string operator = 2;</code>
   * @return The bytes for operator.
   */
  com.google.protobuf.ByteString
      getOperatorBytes();

  /**
   * <pre>
   * Input streams.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.AnalyzerDefinition.StreamInput inputs = 3;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.AnalyzerDefinition.StreamInput> 
      getInputsList();
  /**
   * <pre>
   * Input streams.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.AnalyzerDefinition.StreamInput inputs = 3;</code>
   */
  com.google.cloud.visionai.v1.AnalyzerDefinition.StreamInput getInputs(int index);
  /**
   * <pre>
   * Input streams.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.AnalyzerDefinition.StreamInput inputs = 3;</code>
   */
  int getInputsCount();
  /**
   * <pre>
   * Input streams.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.AnalyzerDefinition.StreamInput inputs = 3;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.AnalyzerDefinition.StreamInputOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <pre>
   * Input streams.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.AnalyzerDefinition.StreamInput inputs = 3;</code>
   */
  com.google.cloud.visionai.v1.AnalyzerDefinition.StreamInputOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <pre>
   * The attribute values that this analyzer applies to the operator.
   * Supply a mapping between the attribute names and the actual value you wish
   * to apply. If an attribute name is omitted, then it will take a
   * preconfigured default value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AttributeValue&gt; attrs = 4;</code>
   */
  int getAttrsCount();
  /**
   * <pre>
   * The attribute values that this analyzer applies to the operator.
   * Supply a mapping between the attribute names and the actual value you wish
   * to apply. If an attribute name is omitted, then it will take a
   * preconfigured default value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AttributeValue&gt; attrs = 4;</code>
   */
  boolean containsAttrs(
      java.lang.String key);
  /**
   * Use {@link #getAttrsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.visionai.v1.AttributeValue>
  getAttrs();
  /**
   * <pre>
   * The attribute values that this analyzer applies to the operator.
   * Supply a mapping between the attribute names and the actual value you wish
   * to apply. If an attribute name is omitted, then it will take a
   * preconfigured default value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AttributeValue&gt; attrs = 4;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.visionai.v1.AttributeValue>
  getAttrsMap();
  /**
   * <pre>
   * The attribute values that this analyzer applies to the operator.
   * Supply a mapping between the attribute names and the actual value you wish
   * to apply. If an attribute name is omitted, then it will take a
   * preconfigured default value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AttributeValue&gt; attrs = 4;</code>
   */
  /* nullable */
com.google.cloud.visionai.v1.AttributeValue getAttrsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.visionai.v1.AttributeValue defaultValue);
  /**
   * <pre>
   * The attribute values that this analyzer applies to the operator.
   * Supply a mapping between the attribute names and the actual value you wish
   * to apply. If an attribute name is omitted, then it will take a
   * preconfigured default value.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.visionai.v1.AttributeValue&gt; attrs = 4;</code>
   */
  com.google.cloud.visionai.v1.AttributeValue getAttrsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Debug options.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AnalyzerDefinition.DebugOptions debug_options = 5;</code>
   * @return Whether the debugOptions field is set.
   */
  boolean hasDebugOptions();
  /**
   * <pre>
   * Debug options.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AnalyzerDefinition.DebugOptions debug_options = 5;</code>
   * @return The debugOptions.
   */
  com.google.cloud.visionai.v1.AnalyzerDefinition.DebugOptions getDebugOptions();
  /**
   * <pre>
   * Debug options.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.AnalyzerDefinition.DebugOptions debug_options = 5;</code>
   */
  com.google.cloud.visionai.v1.AnalyzerDefinition.DebugOptionsOrBuilder getDebugOptionsOrBuilder();
}