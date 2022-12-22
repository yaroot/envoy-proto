// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/test_suite.proto

package com.google.devtools.resultstore.v2;

public interface TestSuiteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.TestSuite)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full name of this suite, as reported in the name attribute. For Java
   * tests, this is normally the fully qualified class name. Eg.
   * "com.google.common.hash.BloomFilterTest".
   * </pre>
   *
   * <code>string suite_name = 1;</code>
   * @return The suiteName.
   */
  java.lang.String getSuiteName();
  /**
   * <pre>
   * The full name of this suite, as reported in the name attribute. For Java
   * tests, this is normally the fully qualified class name. Eg.
   * "com.google.common.hash.BloomFilterTest".
   * </pre>
   *
   * <code>string suite_name = 1;</code>
   * @return The bytes for suiteName.
   */
  com.google.protobuf.ByteString
      getSuiteNameBytes();

  /**
   * <pre>
   * The results of the test cases and test suites contained in this suite,
   * as reported in the &lt;testcase&gt; and &lt;testsuite&gt; elements contained within
   * this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Test tests = 2;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.Test> 
      getTestsList();
  /**
   * <pre>
   * The results of the test cases and test suites contained in this suite,
   * as reported in the &lt;testcase&gt; and &lt;testsuite&gt; elements contained within
   * this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Test tests = 2;</code>
   */
  com.google.devtools.resultstore.v2.Test getTests(int index);
  /**
   * <pre>
   * The results of the test cases and test suites contained in this suite,
   * as reported in the &lt;testcase&gt; and &lt;testsuite&gt; elements contained within
   * this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Test tests = 2;</code>
   */
  int getTestsCount();
  /**
   * <pre>
   * The results of the test cases and test suites contained in this suite,
   * as reported in the &lt;testcase&gt; and &lt;testsuite&gt; elements contained within
   * this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Test tests = 2;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.TestOrBuilder> 
      getTestsOrBuilderList();
  /**
   * <pre>
   * The results of the test cases and test suites contained in this suite,
   * as reported in the &lt;testcase&gt; and &lt;testsuite&gt; elements contained within
   * this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Test tests = 2;</code>
   */
  com.google.devtools.resultstore.v2.TestOrBuilder getTestsOrBuilder(
      int index);

  /**
   * <pre>
   * Failures reported in &lt;failure&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestFailure failures = 3;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.TestFailure> 
      getFailuresList();
  /**
   * <pre>
   * Failures reported in &lt;failure&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestFailure failures = 3;</code>
   */
  com.google.devtools.resultstore.v2.TestFailure getFailures(int index);
  /**
   * <pre>
   * Failures reported in &lt;failure&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestFailure failures = 3;</code>
   */
  int getFailuresCount();
  /**
   * <pre>
   * Failures reported in &lt;failure&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestFailure failures = 3;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.TestFailureOrBuilder> 
      getFailuresOrBuilderList();
  /**
   * <pre>
   * Failures reported in &lt;failure&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestFailure failures = 3;</code>
   */
  com.google.devtools.resultstore.v2.TestFailureOrBuilder getFailuresOrBuilder(
      int index);

  /**
   * <pre>
   * Errors reported in &lt;error&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestError errors = 4;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.TestError> 
      getErrorsList();
  /**
   * <pre>
   * Errors reported in &lt;error&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestError errors = 4;</code>
   */
  com.google.devtools.resultstore.v2.TestError getErrors(int index);
  /**
   * <pre>
   * Errors reported in &lt;error&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestError errors = 4;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * Errors reported in &lt;error&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestError errors = 4;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.TestErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * Errors reported in &lt;error&gt; elements within this &lt;testsuite&gt;.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.TestError errors = 4;</code>
   */
  com.google.devtools.resultstore.v2.TestErrorOrBuilder getErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * The timing for the entire TestSuite, as reported by the time attribute.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.Timing timing = 6;</code>
   * @return Whether the timing field is set.
   */
  boolean hasTiming();
  /**
   * <pre>
   * The timing for the entire TestSuite, as reported by the time attribute.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.Timing timing = 6;</code>
   * @return The timing.
   */
  com.google.devtools.resultstore.v2.Timing getTiming();
  /**
   * <pre>
   * The timing for the entire TestSuite, as reported by the time attribute.
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.Timing timing = 6;</code>
   */
  com.google.devtools.resultstore.v2.TimingOrBuilder getTimingOrBuilder();

  /**
   * <pre>
   * Arbitrary name-value pairs, as reported in custom attributes or in a
   * &lt;properties&gt; element within this &lt;testsuite&gt;. Multiple properties are
   * allowed with the same key. Properties will be returned in lexicographical
   * order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 7;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.Property> 
      getPropertiesList();
  /**
   * <pre>
   * Arbitrary name-value pairs, as reported in custom attributes or in a
   * &lt;properties&gt; element within this &lt;testsuite&gt;. Multiple properties are
   * allowed with the same key. Properties will be returned in lexicographical
   * order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 7;</code>
   */
  com.google.devtools.resultstore.v2.Property getProperties(int index);
  /**
   * <pre>
   * Arbitrary name-value pairs, as reported in custom attributes or in a
   * &lt;properties&gt; element within this &lt;testsuite&gt;. Multiple properties are
   * allowed with the same key. Properties will be returned in lexicographical
   * order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 7;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Arbitrary name-value pairs, as reported in custom attributes or in a
   * &lt;properties&gt; element within this &lt;testsuite&gt;. Multiple properties are
   * allowed with the same key. Properties will be returned in lexicographical
   * order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 7;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.PropertyOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <pre>
   * Arbitrary name-value pairs, as reported in custom attributes or in a
   * &lt;properties&gt; element within this &lt;testsuite&gt;. Multiple properties are
   * allowed with the same key. Properties will be returned in lexicographical
   * order by key.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.Property properties = 7;</code>
   */
  com.google.devtools.resultstore.v2.PropertyOrBuilder getPropertiesOrBuilder(
      int index);

  /**
   * <pre>
   * Files produced by this test suite, as reported by undeclared output
   * annotations.
   * The file IDs must be unique within this list. Duplicate file IDs will
   * result in an error. Files will be returned in lexicographical order by ID.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.File files = 8;</code>
   */
  java.util.List<com.google.devtools.resultstore.v2.File> 
      getFilesList();
  /**
   * <pre>
   * Files produced by this test suite, as reported by undeclared output
   * annotations.
   * The file IDs must be unique within this list. Duplicate file IDs will
   * result in an error. Files will be returned in lexicographical order by ID.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.File files = 8;</code>
   */
  com.google.devtools.resultstore.v2.File getFiles(int index);
  /**
   * <pre>
   * Files produced by this test suite, as reported by undeclared output
   * annotations.
   * The file IDs must be unique within this list. Duplicate file IDs will
   * result in an error. Files will be returned in lexicographical order by ID.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.File files = 8;</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * Files produced by this test suite, as reported by undeclared output
   * annotations.
   * The file IDs must be unique within this list. Duplicate file IDs will
   * result in an error. Files will be returned in lexicographical order by ID.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.File files = 8;</code>
   */
  java.util.List<? extends com.google.devtools.resultstore.v2.FileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * Files produced by this test suite, as reported by undeclared output
   * annotations.
   * The file IDs must be unique within this list. Duplicate file IDs will
   * result in an error. Files will be returned in lexicographical order by ID.
   * </pre>
   *
   * <code>repeated .google.devtools.resultstore.v2.File files = 8;</code>
   */
  com.google.devtools.resultstore.v2.FileOrBuilder getFilesOrBuilder(
      int index);
}