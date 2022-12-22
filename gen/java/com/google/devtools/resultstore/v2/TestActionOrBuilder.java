// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/action.proto

package com.google.devtools.resultstore.v2;

public interface TestActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.TestAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timing data for execution of the test action.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestTiming test_timing = 1;</code>
   * @return Whether the testTiming field is set.
   */
  boolean hasTestTiming();
  /**
   * <pre>
   * Timing data for execution of the test action.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestTiming test_timing = 1;</code>
   * @return The testTiming.
   */
  com.google.devtools.resultstore.v2.TestTiming getTestTiming();
  /**
   * <pre>
   * Timing data for execution of the test action.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestTiming test_timing = 1;</code>
   */
  com.google.devtools.resultstore.v2.TestTimingOrBuilder getTestTimingOrBuilder();

  /**
   * <pre>
   * If the test is divided up into shards to improve performance, set this to
   * indicate which shard this test action is for. Value must be in interval
   * [0, total_shard_count). Defaults to 0, which is appropriate if all test
   * cases are run in the same process.
   * </pre>
   *
   * <code>int32 shard_number = 2;</code>
   * @return The shardNumber.
   */
  int getShardNumber();

  /**
   * <pre>
   * If the user requested that every test be run multiple times, as is often
   * done to measure flakiness, set this to indicate which run this test action
   * is for. Value must be in interval [0, total_run_count). Defaults to 0,
   * which is appropriate if multiple runs were not requested.
   * </pre>
   *
   * <code>int32 run_number = 3;</code>
   * @return The runNumber.
   */
  int getRunNumber();

  /**
   * <pre>
   * If flaky tests are automatically retried, set this to indicate which
   * attempt this test action is for. (e.g. 0 for the first attempt, 1 for
   * second, and so on). Defaults to 0, which is appropriate if this is the only
   * attempt.
   * </pre>
   *
   * <code>int32 attempt_number = 4;</code>
   * @return The attemptNumber.
   */
  int getAttemptNumber();

  /**
   * <pre>
   * A tree of test suites and test cases that were run by this test action.
   * Each test case has its own status information, including stack traces.
   * Typically produced by parsing an XML Log, but may also be provided directly
   * by clients.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 5;</code>
   * @return Whether the testSuite field is set.
   */
  boolean hasTestSuite();
  /**
   * <pre>
   * A tree of test suites and test cases that were run by this test action.
   * Each test case has its own status information, including stack traces.
   * Typically produced by parsing an XML Log, but may also be provided directly
   * by clients.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 5;</code>
   * @return The testSuite.
   */
  com.google.devtools.resultstore.v2.TestSuite getTestSuite();
  /**
   * <pre>
   * A tree of test suites and test cases that were run by this test action.
   * Each test case has its own status information, including stack traces.
   * Typically produced by parsing an XML Log, but may also be provided directly
   * by clients.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.TestSuite test_suite = 5;</code>
   */
  com.google.devtools.resultstore.v2.TestSuiteOrBuilder getTestSuiteOrBuilder();

  /**
   * <pre>
   * Warnings for this test action.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestWarning warnings = 8;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.TestWarning> 
      getWarningsList();
  /**
   * <pre>
   * Warnings for this test action.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestWarning warnings = 8;</code>
   */
  com.google.devtools.resultstore.v2.TestWarning getWarnings(int index);
  /**
   * <pre>
   * Warnings for this test action.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestWarning warnings = 8;</code>
   */
  int getWarningsCount();
  /**
   * <pre>
   * Warnings for this test action.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestWarning warnings = 8;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.TestWarningOrBuilder> 
      getWarningsOrBuilderList();
  /**
   * <pre>
   * Warnings for this test action.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestWarning warnings = 8;</code>
   */
  com.google.devtools.resultstore.v2.TestWarningOrBuilder getWarningsOrBuilder(
      int index);

  /**
   * <pre>
   * Estimated memory consumption of the test action, in bytes. A default value
   * of 0 means there is no memory consumption estimate specified.
   * </pre>
   *
   * <code>int64 estimated_memory_bytes = 10;</code>
   * @return The estimatedMemoryBytes.
   */
  long getEstimatedMemoryBytes();
}