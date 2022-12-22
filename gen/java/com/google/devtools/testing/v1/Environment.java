// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

/**
 * <pre>
 * The environment in which the test is run.
 * </pre>
 *
 * Protobuf type {@code google.devtools.testing.v1.Environment}
 */
public final class Environment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.testing.v1.Environment)
    EnvironmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Environment.newBuilder() to construct.
  private Environment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Environment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Environment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Environment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Environment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.testing.v1.Environment.class, com.google.devtools.testing.v1.Environment.Builder.class);
  }

  private int environmentCase_ = 0;
  private java.lang.Object environment_;
  public enum EnvironmentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ANDROID_DEVICE(1),
    IOS_DEVICE(2),
    ENVIRONMENT_NOT_SET(0);
    private final int value;
    private EnvironmentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EnvironmentCase valueOf(int value) {
      return forNumber(value);
    }

    public static EnvironmentCase forNumber(int value) {
      switch (value) {
        case 1: return ANDROID_DEVICE;
        case 2: return IOS_DEVICE;
        case 0: return ENVIRONMENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EnvironmentCase
  getEnvironmentCase() {
    return EnvironmentCase.forNumber(
        environmentCase_);
  }

  public static final int ANDROID_DEVICE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * An Android device which must be used with an Android test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
   * @return Whether the androidDevice field is set.
   */
  @java.lang.Override
  public boolean hasAndroidDevice() {
    return environmentCase_ == 1;
  }
  /**
   * <pre>
   * An Android device which must be used with an Android test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
   * @return The androidDevice.
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.AndroidDevice getAndroidDevice() {
    if (environmentCase_ == 1) {
       return (com.google.devtools.testing.v1.AndroidDevice) environment_;
    }
    return com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance();
  }
  /**
   * <pre>
   * An Android device which must be used with an Android test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.AndroidDeviceOrBuilder getAndroidDeviceOrBuilder() {
    if (environmentCase_ == 1) {
       return (com.google.devtools.testing.v1.AndroidDevice) environment_;
    }
    return com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance();
  }

  public static final int IOS_DEVICE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * An iOS device which must be used with an iOS test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
   * @return Whether the iosDevice field is set.
   */
  @java.lang.Override
  public boolean hasIosDevice() {
    return environmentCase_ == 2;
  }
  /**
   * <pre>
   * An iOS device which must be used with an iOS test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
   * @return The iosDevice.
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.IosDevice getIosDevice() {
    if (environmentCase_ == 2) {
       return (com.google.devtools.testing.v1.IosDevice) environment_;
    }
    return com.google.devtools.testing.v1.IosDevice.getDefaultInstance();
  }
  /**
   * <pre>
   * An iOS device which must be used with an iOS test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.IosDeviceOrBuilder getIosDeviceOrBuilder() {
    if (environmentCase_ == 2) {
       return (com.google.devtools.testing.v1.IosDevice) environment_;
    }
    return com.google.devtools.testing.v1.IosDevice.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (environmentCase_ == 1) {
      output.writeMessage(1, (com.google.devtools.testing.v1.AndroidDevice) environment_);
    }
    if (environmentCase_ == 2) {
      output.writeMessage(2, (com.google.devtools.testing.v1.IosDevice) environment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (environmentCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.devtools.testing.v1.AndroidDevice) environment_);
    }
    if (environmentCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.devtools.testing.v1.IosDevice) environment_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.devtools.testing.v1.Environment)) {
      return super.equals(obj);
    }
    com.google.devtools.testing.v1.Environment other = (com.google.devtools.testing.v1.Environment) obj;

    if (!getEnvironmentCase().equals(other.getEnvironmentCase())) return false;
    switch (environmentCase_) {
      case 1:
        if (!getAndroidDevice()
            .equals(other.getAndroidDevice())) return false;
        break;
      case 2:
        if (!getIosDevice()
            .equals(other.getIosDevice())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (environmentCase_) {
      case 1:
        hash = (37 * hash) + ANDROID_DEVICE_FIELD_NUMBER;
        hash = (53 * hash) + getAndroidDevice().hashCode();
        break;
      case 2:
        hash = (37 * hash) + IOS_DEVICE_FIELD_NUMBER;
        hash = (53 * hash) + getIosDevice().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.testing.v1.Environment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Environment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.Environment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.Environment parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.devtools.testing.v1.Environment prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The environment in which the test is run.
   * </pre>
   *
   * Protobuf type {@code google.devtools.testing.v1.Environment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.testing.v1.Environment)
      com.google.devtools.testing.v1.EnvironmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Environment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Environment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.testing.v1.Environment.class, com.google.devtools.testing.v1.Environment.Builder.class);
    }

    // Construct using com.google.devtools.testing.v1.Environment.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (androidDeviceBuilder_ != null) {
        androidDeviceBuilder_.clear();
      }
      if (iosDeviceBuilder_ != null) {
        iosDeviceBuilder_.clear();
      }
      environmentCase_ = 0;
      environment_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Environment_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.Environment getDefaultInstanceForType() {
      return com.google.devtools.testing.v1.Environment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.Environment build() {
      com.google.devtools.testing.v1.Environment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.Environment buildPartial() {
      com.google.devtools.testing.v1.Environment result = new com.google.devtools.testing.v1.Environment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.testing.v1.Environment result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.devtools.testing.v1.Environment result) {
      result.environmentCase_ = environmentCase_;
      result.environment_ = this.environment_;
      if (environmentCase_ == 1 &&
          androidDeviceBuilder_ != null) {
        result.environment_ = androidDeviceBuilder_.build();
      }
      if (environmentCase_ == 2 &&
          iosDeviceBuilder_ != null) {
        result.environment_ = iosDeviceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.testing.v1.Environment) {
        return mergeFrom((com.google.devtools.testing.v1.Environment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.testing.v1.Environment other) {
      if (other == com.google.devtools.testing.v1.Environment.getDefaultInstance()) return this;
      switch (other.getEnvironmentCase()) {
        case ANDROID_DEVICE: {
          mergeAndroidDevice(other.getAndroidDevice());
          break;
        }
        case IOS_DEVICE: {
          mergeIosDevice(other.getIosDevice());
          break;
        }
        case ENVIRONMENT_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getAndroidDeviceFieldBuilder().getBuilder(),
                  extensionRegistry);
              environmentCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getIosDeviceFieldBuilder().getBuilder(),
                  extensionRegistry);
              environmentCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int environmentCase_ = 0;
    private java.lang.Object environment_;
    public EnvironmentCase
        getEnvironmentCase() {
      return EnvironmentCase.forNumber(
          environmentCase_);
    }

    public Builder clearEnvironment() {
      environmentCase_ = 0;
      environment_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.testing.v1.AndroidDevice, com.google.devtools.testing.v1.AndroidDevice.Builder, com.google.devtools.testing.v1.AndroidDeviceOrBuilder> androidDeviceBuilder_;
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     * @return Whether the androidDevice field is set.
     */
    @java.lang.Override
    public boolean hasAndroidDevice() {
      return environmentCase_ == 1;
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     * @return The androidDevice.
     */
    @java.lang.Override
    public com.google.devtools.testing.v1.AndroidDevice getAndroidDevice() {
      if (androidDeviceBuilder_ == null) {
        if (environmentCase_ == 1) {
          return (com.google.devtools.testing.v1.AndroidDevice) environment_;
        }
        return com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance();
      } else {
        if (environmentCase_ == 1) {
          return androidDeviceBuilder_.getMessage();
        }
        return com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    public Builder setAndroidDevice(com.google.devtools.testing.v1.AndroidDevice value) {
      if (androidDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
        onChanged();
      } else {
        androidDeviceBuilder_.setMessage(value);
      }
      environmentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    public Builder setAndroidDevice(
        com.google.devtools.testing.v1.AndroidDevice.Builder builderForValue) {
      if (androidDeviceBuilder_ == null) {
        environment_ = builderForValue.build();
        onChanged();
      } else {
        androidDeviceBuilder_.setMessage(builderForValue.build());
      }
      environmentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    public Builder mergeAndroidDevice(com.google.devtools.testing.v1.AndroidDevice value) {
      if (androidDeviceBuilder_ == null) {
        if (environmentCase_ == 1 &&
            environment_ != com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance()) {
          environment_ = com.google.devtools.testing.v1.AndroidDevice.newBuilder((com.google.devtools.testing.v1.AndroidDevice) environment_)
              .mergeFrom(value).buildPartial();
        } else {
          environment_ = value;
        }
        onChanged();
      } else {
        if (environmentCase_ == 1) {
          androidDeviceBuilder_.mergeFrom(value);
        } else {
          androidDeviceBuilder_.setMessage(value);
        }
      }
      environmentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    public Builder clearAndroidDevice() {
      if (androidDeviceBuilder_ == null) {
        if (environmentCase_ == 1) {
          environmentCase_ = 0;
          environment_ = null;
          onChanged();
        }
      } else {
        if (environmentCase_ == 1) {
          environmentCase_ = 0;
          environment_ = null;
        }
        androidDeviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    public com.google.devtools.testing.v1.AndroidDevice.Builder getAndroidDeviceBuilder() {
      return getAndroidDeviceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    @java.lang.Override
    public com.google.devtools.testing.v1.AndroidDeviceOrBuilder getAndroidDeviceOrBuilder() {
      if ((environmentCase_ == 1) && (androidDeviceBuilder_ != null)) {
        return androidDeviceBuilder_.getMessageOrBuilder();
      } else {
        if (environmentCase_ == 1) {
          return (com.google.devtools.testing.v1.AndroidDevice) environment_;
        }
        return com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An Android device which must be used with an Android test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.AndroidDevice android_device = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.testing.v1.AndroidDevice, com.google.devtools.testing.v1.AndroidDevice.Builder, com.google.devtools.testing.v1.AndroidDeviceOrBuilder> 
        getAndroidDeviceFieldBuilder() {
      if (androidDeviceBuilder_ == null) {
        if (!(environmentCase_ == 1)) {
          environment_ = com.google.devtools.testing.v1.AndroidDevice.getDefaultInstance();
        }
        androidDeviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.testing.v1.AndroidDevice, com.google.devtools.testing.v1.AndroidDevice.Builder, com.google.devtools.testing.v1.AndroidDeviceOrBuilder>(
                (com.google.devtools.testing.v1.AndroidDevice) environment_,
                getParentForChildren(),
                isClean());
        environment_ = null;
      }
      environmentCase_ = 1;
      onChanged();
      return androidDeviceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.testing.v1.IosDevice, com.google.devtools.testing.v1.IosDevice.Builder, com.google.devtools.testing.v1.IosDeviceOrBuilder> iosDeviceBuilder_;
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     * @return Whether the iosDevice field is set.
     */
    @java.lang.Override
    public boolean hasIosDevice() {
      return environmentCase_ == 2;
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     * @return The iosDevice.
     */
    @java.lang.Override
    public com.google.devtools.testing.v1.IosDevice getIosDevice() {
      if (iosDeviceBuilder_ == null) {
        if (environmentCase_ == 2) {
          return (com.google.devtools.testing.v1.IosDevice) environment_;
        }
        return com.google.devtools.testing.v1.IosDevice.getDefaultInstance();
      } else {
        if (environmentCase_ == 2) {
          return iosDeviceBuilder_.getMessage();
        }
        return com.google.devtools.testing.v1.IosDevice.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    public Builder setIosDevice(com.google.devtools.testing.v1.IosDevice value) {
      if (iosDeviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
        onChanged();
      } else {
        iosDeviceBuilder_.setMessage(value);
      }
      environmentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    public Builder setIosDevice(
        com.google.devtools.testing.v1.IosDevice.Builder builderForValue) {
      if (iosDeviceBuilder_ == null) {
        environment_ = builderForValue.build();
        onChanged();
      } else {
        iosDeviceBuilder_.setMessage(builderForValue.build());
      }
      environmentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    public Builder mergeIosDevice(com.google.devtools.testing.v1.IosDevice value) {
      if (iosDeviceBuilder_ == null) {
        if (environmentCase_ == 2 &&
            environment_ != com.google.devtools.testing.v1.IosDevice.getDefaultInstance()) {
          environment_ = com.google.devtools.testing.v1.IosDevice.newBuilder((com.google.devtools.testing.v1.IosDevice) environment_)
              .mergeFrom(value).buildPartial();
        } else {
          environment_ = value;
        }
        onChanged();
      } else {
        if (environmentCase_ == 2) {
          iosDeviceBuilder_.mergeFrom(value);
        } else {
          iosDeviceBuilder_.setMessage(value);
        }
      }
      environmentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    public Builder clearIosDevice() {
      if (iosDeviceBuilder_ == null) {
        if (environmentCase_ == 2) {
          environmentCase_ = 0;
          environment_ = null;
          onChanged();
        }
      } else {
        if (environmentCase_ == 2) {
          environmentCase_ = 0;
          environment_ = null;
        }
        iosDeviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    public com.google.devtools.testing.v1.IosDevice.Builder getIosDeviceBuilder() {
      return getIosDeviceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    @java.lang.Override
    public com.google.devtools.testing.v1.IosDeviceOrBuilder getIosDeviceOrBuilder() {
      if ((environmentCase_ == 2) && (iosDeviceBuilder_ != null)) {
        return iosDeviceBuilder_.getMessageOrBuilder();
      } else {
        if (environmentCase_ == 2) {
          return (com.google.devtools.testing.v1.IosDevice) environment_;
        }
        return com.google.devtools.testing.v1.IosDevice.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An iOS device which must be used with an iOS test.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.IosDevice ios_device = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.testing.v1.IosDevice, com.google.devtools.testing.v1.IosDevice.Builder, com.google.devtools.testing.v1.IosDeviceOrBuilder> 
        getIosDeviceFieldBuilder() {
      if (iosDeviceBuilder_ == null) {
        if (!(environmentCase_ == 2)) {
          environment_ = com.google.devtools.testing.v1.IosDevice.getDefaultInstance();
        }
        iosDeviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.testing.v1.IosDevice, com.google.devtools.testing.v1.IosDevice.Builder, com.google.devtools.testing.v1.IosDeviceOrBuilder>(
                (com.google.devtools.testing.v1.IosDevice) environment_,
                getParentForChildren(),
                isClean());
        environment_ = null;
      }
      environmentCase_ = 2;
      onChanged();
      return iosDeviceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.testing.v1.Environment)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.testing.v1.Environment)
  private static final com.google.devtools.testing.v1.Environment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.testing.v1.Environment();
  }

  public static com.google.devtools.testing.v1.Environment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Environment>
      PARSER = new com.google.protobuf.AbstractParser<Environment>() {
    @java.lang.Override
    public Environment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Environment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Environment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.testing.v1.Environment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

