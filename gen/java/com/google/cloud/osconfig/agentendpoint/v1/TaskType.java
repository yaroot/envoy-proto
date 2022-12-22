// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/agentendpoint/v1/tasks.proto

package com.google.cloud.osconfig.agentendpoint.v1;

/**
 * <pre>
 * Specifies the type of task to perform.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.osconfig.agentendpoint.v1.TaskType}
 */
public enum TaskType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified is invalid.
   * </pre>
   *
   * <code>TASK_TYPE_UNSPECIFIED = 0;</code>
   */
  TASK_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The apply patches task.
   * </pre>
   *
   * <code>APPLY_PATCHES = 1;</code>
   */
  APPLY_PATCHES(1),
  /**
   * <pre>
   * The exec step task.
   * </pre>
   *
   * <code>EXEC_STEP_TASK = 2;</code>
   */
  EXEC_STEP_TASK(2),
  /**
   * <pre>
   * The apply config task
   * </pre>
   *
   * <code>APPLY_CONFIG_TASK = 3;</code>
   */
  APPLY_CONFIG_TASK(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified is invalid.
   * </pre>
   *
   * <code>TASK_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TASK_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The apply patches task.
   * </pre>
   *
   * <code>APPLY_PATCHES = 1;</code>
   */
  public static final int APPLY_PATCHES_VALUE = 1;
  /**
   * <pre>
   * The exec step task.
   * </pre>
   *
   * <code>EXEC_STEP_TASK = 2;</code>
   */
  public static final int EXEC_STEP_TASK_VALUE = 2;
  /**
   * <pre>
   * The apply config task
   * </pre>
   *
   * <code>APPLY_CONFIG_TASK = 3;</code>
   */
  public static final int APPLY_CONFIG_TASK_VALUE = 3;


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
  public static TaskType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TaskType forNumber(int value) {
    switch (value) {
      case 0: return TASK_TYPE_UNSPECIFIED;
      case 1: return APPLY_PATCHES;
      case 2: return EXEC_STEP_TASK;
      case 3: return APPLY_CONFIG_TASK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TaskType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TaskType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TaskType>() {
          public TaskType findValueByNumber(int number) {
            return TaskType.forNumber(number);
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
    return com.google.cloud.osconfig.agentendpoint.v1.Tasks.getDescriptor().getEnumTypes().get(1);
  }

  private static final TaskType[] VALUES = values();

  public static TaskType valueOf(
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

  private TaskType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.osconfig.agentendpoint.v1.TaskType)
}
