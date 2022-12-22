// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/common.proto

package com.google.devtools.resultstore.v2;

/**
 * <pre>
 * Status of a resource.
 * </pre>
 *
 * Protobuf enum {@code google.devtools.resultstore.v2.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The implicit default enum value. Should never be set.
   * </pre>
   *
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * Displays as "Building". Means the target is compiling, linking, etc.
   * </pre>
   *
   * <code>BUILDING = 1;</code>
   */
  BUILDING(1),
  /**
   * <pre>
   * Displays as "Built". Means the target was built successfully.
   * If testing was requested, it should never reach this status: it should go
   * straight from BUILDING to TESTING.
   * </pre>
   *
   * <code>BUILT = 2;</code>
   */
  BUILT(2),
  /**
   * <pre>
   * Displays as "Broken". Means build failure such as compile error.
   * </pre>
   *
   * <code>FAILED_TO_BUILD = 3;</code>
   */
  FAILED_TO_BUILD(3),
  /**
   * <pre>
   * Displays as "Testing". Means the test is running.
   * </pre>
   *
   * <code>TESTING = 4;</code>
   */
  TESTING(4),
  /**
   * <pre>
   * Displays as "Passed". Means the test was run and passed.
   * </pre>
   *
   * <code>PASSED = 5;</code>
   */
  PASSED(5),
  /**
   * <pre>
   * Displays as "Failed". Means the test was run and failed.
   * </pre>
   *
   * <code>FAILED = 6;</code>
   */
  FAILED(6),
  /**
   * <pre>
   * Displays as "Timed out". Means the test didn't finish in time.
   * </pre>
   *
   * <code>TIMED_OUT = 7;</code>
   */
  TIMED_OUT(7),
  /**
   * <pre>
   * Displays as "Cancelled". Means the build or test was cancelled.
   * E.g. User hit control-C.
   * </pre>
   *
   * <code>CANCELLED = 8;</code>
   */
  CANCELLED(8),
  /**
   * <pre>
   * Displays as "Tool Failed". Means the build or test had internal tool
   * failure.
   * </pre>
   *
   * <code>TOOL_FAILED = 9;</code>
   */
  TOOL_FAILED(9),
  /**
   * <pre>
   * Displays as "Incomplete". Means the build or test did not complete.  This
   * might happen when a build breakage or test failure causes the tool to stop
   * trying to build anything more or run any more tests, with the default
   * bazel --nokeep_going option or the --notest_keep_going option.
   * </pre>
   *
   * <code>INCOMPLETE = 10;</code>
   */
  INCOMPLETE(10),
  /**
   * <pre>
   * Displays as "Flaky". Means the aggregate status contains some runs that
   * were successful, and some that were not.
   * </pre>
   *
   * <code>FLAKY = 11;</code>
   */
  FLAKY(11),
  /**
   * <pre>
   * Displays as "Unknown". Means the tool uploading to the server died
   * mid-upload or does not know the state.
   * </pre>
   *
   * <code>UNKNOWN = 12;</code>
   */
  UNKNOWN(12),
  /**
   * <pre>
   * Displays as "Skipped". Means building and testing were skipped.
   * (E.g. Restricted to a different configuration.)
   * </pre>
   *
   * <code>SKIPPED = 13;</code>
   */
  SKIPPED(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The implicit default enum value. Should never be set.
   * </pre>
   *
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Displays as "Building". Means the target is compiling, linking, etc.
   * </pre>
   *
   * <code>BUILDING = 1;</code>
   */
  public static final int BUILDING_VALUE = 1;
  /**
   * <pre>
   * Displays as "Built". Means the target was built successfully.
   * If testing was requested, it should never reach this status: it should go
   * straight from BUILDING to TESTING.
   * </pre>
   *
   * <code>BUILT = 2;</code>
   */
  public static final int BUILT_VALUE = 2;
  /**
   * <pre>
   * Displays as "Broken". Means build failure such as compile error.
   * </pre>
   *
   * <code>FAILED_TO_BUILD = 3;</code>
   */
  public static final int FAILED_TO_BUILD_VALUE = 3;
  /**
   * <pre>
   * Displays as "Testing". Means the test is running.
   * </pre>
   *
   * <code>TESTING = 4;</code>
   */
  public static final int TESTING_VALUE = 4;
  /**
   * <pre>
   * Displays as "Passed". Means the test was run and passed.
   * </pre>
   *
   * <code>PASSED = 5;</code>
   */
  public static final int PASSED_VALUE = 5;
  /**
   * <pre>
   * Displays as "Failed". Means the test was run and failed.
   * </pre>
   *
   * <code>FAILED = 6;</code>
   */
  public static final int FAILED_VALUE = 6;
  /**
   * <pre>
   * Displays as "Timed out". Means the test didn't finish in time.
   * </pre>
   *
   * <code>TIMED_OUT = 7;</code>
   */
  public static final int TIMED_OUT_VALUE = 7;
  /**
   * <pre>
   * Displays as "Cancelled". Means the build or test was cancelled.
   * E.g. User hit control-C.
   * </pre>
   *
   * <code>CANCELLED = 8;</code>
   */
  public static final int CANCELLED_VALUE = 8;
  /**
   * <pre>
   * Displays as "Tool Failed". Means the build or test had internal tool
   * failure.
   * </pre>
   *
   * <code>TOOL_FAILED = 9;</code>
   */
  public static final int TOOL_FAILED_VALUE = 9;
  /**
   * <pre>
   * Displays as "Incomplete". Means the build or test did not complete.  This
   * might happen when a build breakage or test failure causes the tool to stop
   * trying to build anything more or run any more tests, with the default
   * bazel --nokeep_going option or the --notest_keep_going option.
   * </pre>
   *
   * <code>INCOMPLETE = 10;</code>
   */
  public static final int INCOMPLETE_VALUE = 10;
  /**
   * <pre>
   * Displays as "Flaky". Means the aggregate status contains some runs that
   * were successful, and some that were not.
   * </pre>
   *
   * <code>FLAKY = 11;</code>
   */
  public static final int FLAKY_VALUE = 11;
  /**
   * <pre>
   * Displays as "Unknown". Means the tool uploading to the server died
   * mid-upload or does not know the state.
   * </pre>
   *
   * <code>UNKNOWN = 12;</code>
   */
  public static final int UNKNOWN_VALUE = 12;
  /**
   * <pre>
   * Displays as "Skipped". Means building and testing were skipped.
   * (E.g. Restricted to a different configuration.)
   * </pre>
   *
   * <code>SKIPPED = 13;</code>
   */
  public static final int SKIPPED_VALUE = 13;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return STATUS_UNSPECIFIED;
      case 1: return BUILDING;
      case 2: return BUILT;
      case 3: return FAILED_TO_BUILD;
      case 4: return TESTING;
      case 5: return PASSED;
      case 6: return FAILED;
      case 7: return TIMED_OUT;
      case 8: return CANCELLED;
      case 9: return TOOL_FAILED;
      case 10: return INCOMPLETE;
      case 11: return FLAKY;
      case 12: return UNKNOWN;
      case 13: return SKIPPED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.devtools.resultstore.v2.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.devtools.resultstore.v2.Status)
}
