// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

/**
 * <pre>
 * A reference to a file, used for user inputs.
 * </pre>
 *
 * Protobuf type {@code google.devtools.testing.v1.FileReference}
 */
public final class FileReference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.testing.v1.FileReference)
    FileReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileReference.newBuilder() to construct.
  private FileReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileReference() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileReference();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_FileReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_FileReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.testing.v1.FileReference.class, com.google.devtools.testing.v1.FileReference.Builder.class);
  }

  private int fileCase_ = 0;
  private java.lang.Object file_;
  public enum FileCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_PATH(1),
    FILE_NOT_SET(0);
    private final int value;
    private FileCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FileCase valueOf(int value) {
      return forNumber(value);
    }

    public static FileCase forNumber(int value) {
      switch (value) {
        case 1: return GCS_PATH;
        case 0: return FILE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FileCase
  getFileCase() {
    return FileCase.forNumber(
        fileCase_);
  }

  public static final int GCS_PATH_FIELD_NUMBER = 1;
  /**
   * <pre>
   * A path to a file in Google Cloud Storage.
   * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
   * These paths are expected to be url encoded (percent encoding)
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return Whether the gcsPath field is set.
   */
  public boolean hasGcsPath() {
    return fileCase_ == 1;
  }
  /**
   * <pre>
   * A path to a file in Google Cloud Storage.
   * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
   * These paths are expected to be url encoded (percent encoding)
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return The gcsPath.
   */
  public java.lang.String getGcsPath() {
    java.lang.Object ref = "";
    if (fileCase_ == 1) {
      ref = file_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (fileCase_ == 1) {
        file_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A path to a file in Google Cloud Storage.
   * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
   * These paths are expected to be url encoded (percent encoding)
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return The bytes for gcsPath.
   */
  public com.google.protobuf.ByteString
      getGcsPathBytes() {
    java.lang.Object ref = "";
    if (fileCase_ == 1) {
      ref = file_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (fileCase_ == 1) {
        file_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (fileCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fileCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
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
    if (!(obj instanceof com.google.devtools.testing.v1.FileReference)) {
      return super.equals(obj);
    }
    com.google.devtools.testing.v1.FileReference other = (com.google.devtools.testing.v1.FileReference) obj;

    if (!getFileCase().equals(other.getFileCase())) return false;
    switch (fileCase_) {
      case 1:
        if (!getGcsPath()
            .equals(other.getGcsPath())) return false;
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
    switch (fileCase_) {
      case 1:
        hash = (37 * hash) + GCS_PATH_FIELD_NUMBER;
        hash = (53 * hash) + getGcsPath().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.testing.v1.FileReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.FileReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.FileReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.FileReference parseFrom(
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
  public static Builder newBuilder(com.google.devtools.testing.v1.FileReference prototype) {
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
   * A reference to a file, used for user inputs.
   * </pre>
   *
   * Protobuf type {@code google.devtools.testing.v1.FileReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.testing.v1.FileReference)
      com.google.devtools.testing.v1.FileReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_FileReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_FileReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.testing.v1.FileReference.class, com.google.devtools.testing.v1.FileReference.Builder.class);
    }

    // Construct using com.google.devtools.testing.v1.FileReference.newBuilder()
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
      fileCase_ = 0;
      file_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_FileReference_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.FileReference getDefaultInstanceForType() {
      return com.google.devtools.testing.v1.FileReference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.FileReference build() {
      com.google.devtools.testing.v1.FileReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.FileReference buildPartial() {
      com.google.devtools.testing.v1.FileReference result = new com.google.devtools.testing.v1.FileReference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.testing.v1.FileReference result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.devtools.testing.v1.FileReference result) {
      result.fileCase_ = fileCase_;
      result.file_ = this.file_;
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
      if (other instanceof com.google.devtools.testing.v1.FileReference) {
        return mergeFrom((com.google.devtools.testing.v1.FileReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.testing.v1.FileReference other) {
      if (other == com.google.devtools.testing.v1.FileReference.getDefaultInstance()) return this;
      switch (other.getFileCase()) {
        case GCS_PATH: {
          fileCase_ = 1;
          file_ = other.file_;
          onChanged();
          break;
        }
        case FILE_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              fileCase_ = 1;
              file_ = s;
              break;
            } // case 10
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
    private int fileCase_ = 0;
    private java.lang.Object file_;
    public FileCase
        getFileCase() {
      return FileCase.forNumber(
          fileCase_);
    }

    public Builder clearFile() {
      fileCase_ = 0;
      file_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * A path to a file in Google Cloud Storage.
     * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
     * These paths are expected to be url encoded (percent encoding)
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     * @return Whether the gcsPath field is set.
     */
    @java.lang.Override
    public boolean hasGcsPath() {
      return fileCase_ == 1;
    }
    /**
     * <pre>
     * A path to a file in Google Cloud Storage.
     * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
     * These paths are expected to be url encoded (percent encoding)
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     * @return The gcsPath.
     */
    @java.lang.Override
    public java.lang.String getGcsPath() {
      java.lang.Object ref = "";
      if (fileCase_ == 1) {
        ref = file_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (fileCase_ == 1) {
          file_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A path to a file in Google Cloud Storage.
     * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
     * These paths are expected to be url encoded (percent encoding)
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     * @return The bytes for gcsPath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGcsPathBytes() {
      java.lang.Object ref = "";
      if (fileCase_ == 1) {
        ref = file_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (fileCase_ == 1) {
          file_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A path to a file in Google Cloud Storage.
     * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
     * These paths are expected to be url encoded (percent encoding)
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     * @param value The gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fileCase_ = 1;
      file_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A path to a file in Google Cloud Storage.
     * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
     * These paths are expected to be url encoded (percent encoding)
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcsPath() {
      if (fileCase_ == 1) {
        fileCase_ = 0;
        file_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A path to a file in Google Cloud Storage.
     * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
     * These paths are expected to be url encoded (percent encoding)
     * </pre>
     *
     * <code>string gcs_path = 1;</code>
     * @param value The bytes for gcsPath to set.
     * @return This builder for chaining.
     */
    public Builder setGcsPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fileCase_ = 1;
      file_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.testing.v1.FileReference)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.testing.v1.FileReference)
  private static final com.google.devtools.testing.v1.FileReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.testing.v1.FileReference();
  }

  public static com.google.devtools.testing.v1.FileReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileReference>
      PARSER = new com.google.protobuf.AbstractParser<FileReference>() {
    @java.lang.Override
    public FileReference parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.testing.v1.FileReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

