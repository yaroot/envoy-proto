// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

/**
 * <pre>
 * Identifies an account and how to log into it.
 * </pre>
 *
 * Protobuf type {@code google.devtools.testing.v1.Account}
 */
public final class Account extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.testing.v1.Account)
    AccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Account.newBuilder() to construct.
  private Account(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Account() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Account();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Account_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Account_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.testing.v1.Account.class, com.google.devtools.testing.v1.Account.Builder.class);
  }

  private int accountTypeCase_ = 0;
  private java.lang.Object accountType_;
  public enum AccountTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GOOGLE_AUTO(1),
    ACCOUNTTYPE_NOT_SET(0);
    private final int value;
    private AccountTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AccountTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static AccountTypeCase forNumber(int value) {
      switch (value) {
        case 1: return GOOGLE_AUTO;
        case 0: return ACCOUNTTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AccountTypeCase
  getAccountTypeCase() {
    return AccountTypeCase.forNumber(
        accountTypeCase_);
  }

  public static final int GOOGLE_AUTO_FIELD_NUMBER = 1;
  /**
   * <pre>
   * An automatic google login account.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
   * @return Whether the googleAuto field is set.
   */
  @java.lang.Override
  public boolean hasGoogleAuto() {
    return accountTypeCase_ == 1;
  }
  /**
   * <pre>
   * An automatic google login account.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
   * @return The googleAuto.
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.GoogleAuto getGoogleAuto() {
    if (accountTypeCase_ == 1) {
       return (com.google.devtools.testing.v1.GoogleAuto) accountType_;
    }
    return com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance();
  }
  /**
   * <pre>
   * An automatic google login account.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.testing.v1.GoogleAutoOrBuilder getGoogleAutoOrBuilder() {
    if (accountTypeCase_ == 1) {
       return (com.google.devtools.testing.v1.GoogleAuto) accountType_;
    }
    return com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance();
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
    if (accountTypeCase_ == 1) {
      output.writeMessage(1, (com.google.devtools.testing.v1.GoogleAuto) accountType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.devtools.testing.v1.GoogleAuto) accountType_);
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
    if (!(obj instanceof com.google.devtools.testing.v1.Account)) {
      return super.equals(obj);
    }
    com.google.devtools.testing.v1.Account other = (com.google.devtools.testing.v1.Account) obj;

    if (!getAccountTypeCase().equals(other.getAccountTypeCase())) return false;
    switch (accountTypeCase_) {
      case 1:
        if (!getGoogleAuto()
            .equals(other.getGoogleAuto())) return false;
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
    switch (accountTypeCase_) {
      case 1:
        hash = (37 * hash) + GOOGLE_AUTO_FIELD_NUMBER;
        hash = (53 * hash) + getGoogleAuto().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.testing.v1.Account parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Account parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.Account parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.testing.v1.Account parseFrom(
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
  public static Builder newBuilder(com.google.devtools.testing.v1.Account prototype) {
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
   * Identifies an account and how to log into it.
   * </pre>
   *
   * Protobuf type {@code google.devtools.testing.v1.Account}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.testing.v1.Account)
      com.google.devtools.testing.v1.AccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Account_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Account_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.testing.v1.Account.class, com.google.devtools.testing.v1.Account.Builder.class);
    }

    // Construct using com.google.devtools.testing.v1.Account.newBuilder()
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
      if (googleAutoBuilder_ != null) {
        googleAutoBuilder_.clear();
      }
      accountTypeCase_ = 0;
      accountType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.testing.v1.TestExecutionProto.internal_static_google_devtools_testing_v1_Account_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.Account getDefaultInstanceForType() {
      return com.google.devtools.testing.v1.Account.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.Account build() {
      com.google.devtools.testing.v1.Account result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.testing.v1.Account buildPartial() {
      com.google.devtools.testing.v1.Account result = new com.google.devtools.testing.v1.Account(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.testing.v1.Account result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.devtools.testing.v1.Account result) {
      result.accountTypeCase_ = accountTypeCase_;
      result.accountType_ = this.accountType_;
      if (accountTypeCase_ == 1 &&
          googleAutoBuilder_ != null) {
        result.accountType_ = googleAutoBuilder_.build();
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
      if (other instanceof com.google.devtools.testing.v1.Account) {
        return mergeFrom((com.google.devtools.testing.v1.Account)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.testing.v1.Account other) {
      if (other == com.google.devtools.testing.v1.Account.getDefaultInstance()) return this;
      switch (other.getAccountTypeCase()) {
        case GOOGLE_AUTO: {
          mergeGoogleAuto(other.getGoogleAuto());
          break;
        }
        case ACCOUNTTYPE_NOT_SET: {
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
                  getGoogleAutoFieldBuilder().getBuilder(),
                  extensionRegistry);
              accountTypeCase_ = 1;
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
    private int accountTypeCase_ = 0;
    private java.lang.Object accountType_;
    public AccountTypeCase
        getAccountTypeCase() {
      return AccountTypeCase.forNumber(
          accountTypeCase_);
    }

    public Builder clearAccountType() {
      accountTypeCase_ = 0;
      accountType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.testing.v1.GoogleAuto, com.google.devtools.testing.v1.GoogleAuto.Builder, com.google.devtools.testing.v1.GoogleAutoOrBuilder> googleAutoBuilder_;
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     * @return Whether the googleAuto field is set.
     */
    @java.lang.Override
    public boolean hasGoogleAuto() {
      return accountTypeCase_ == 1;
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     * @return The googleAuto.
     */
    @java.lang.Override
    public com.google.devtools.testing.v1.GoogleAuto getGoogleAuto() {
      if (googleAutoBuilder_ == null) {
        if (accountTypeCase_ == 1) {
          return (com.google.devtools.testing.v1.GoogleAuto) accountType_;
        }
        return com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance();
      } else {
        if (accountTypeCase_ == 1) {
          return googleAutoBuilder_.getMessage();
        }
        return com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    public Builder setGoogleAuto(com.google.devtools.testing.v1.GoogleAuto value) {
      if (googleAutoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accountType_ = value;
        onChanged();
      } else {
        googleAutoBuilder_.setMessage(value);
      }
      accountTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    public Builder setGoogleAuto(
        com.google.devtools.testing.v1.GoogleAuto.Builder builderForValue) {
      if (googleAutoBuilder_ == null) {
        accountType_ = builderForValue.build();
        onChanged();
      } else {
        googleAutoBuilder_.setMessage(builderForValue.build());
      }
      accountTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    public Builder mergeGoogleAuto(com.google.devtools.testing.v1.GoogleAuto value) {
      if (googleAutoBuilder_ == null) {
        if (accountTypeCase_ == 1 &&
            accountType_ != com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance()) {
          accountType_ = com.google.devtools.testing.v1.GoogleAuto.newBuilder((com.google.devtools.testing.v1.GoogleAuto) accountType_)
              .mergeFrom(value).buildPartial();
        } else {
          accountType_ = value;
        }
        onChanged();
      } else {
        if (accountTypeCase_ == 1) {
          googleAutoBuilder_.mergeFrom(value);
        } else {
          googleAutoBuilder_.setMessage(value);
        }
      }
      accountTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    public Builder clearGoogleAuto() {
      if (googleAutoBuilder_ == null) {
        if (accountTypeCase_ == 1) {
          accountTypeCase_ = 0;
          accountType_ = null;
          onChanged();
        }
      } else {
        if (accountTypeCase_ == 1) {
          accountTypeCase_ = 0;
          accountType_ = null;
        }
        googleAutoBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    public com.google.devtools.testing.v1.GoogleAuto.Builder getGoogleAutoBuilder() {
      return getGoogleAutoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    @java.lang.Override
    public com.google.devtools.testing.v1.GoogleAutoOrBuilder getGoogleAutoOrBuilder() {
      if ((accountTypeCase_ == 1) && (googleAutoBuilder_ != null)) {
        return googleAutoBuilder_.getMessageOrBuilder();
      } else {
        if (accountTypeCase_ == 1) {
          return (com.google.devtools.testing.v1.GoogleAuto) accountType_;
        }
        return com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An automatic google login account.
     * </pre>
     *
     * <code>.google.devtools.testing.v1.GoogleAuto google_auto = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.testing.v1.GoogleAuto, com.google.devtools.testing.v1.GoogleAuto.Builder, com.google.devtools.testing.v1.GoogleAutoOrBuilder> 
        getGoogleAutoFieldBuilder() {
      if (googleAutoBuilder_ == null) {
        if (!(accountTypeCase_ == 1)) {
          accountType_ = com.google.devtools.testing.v1.GoogleAuto.getDefaultInstance();
        }
        googleAutoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.testing.v1.GoogleAuto, com.google.devtools.testing.v1.GoogleAuto.Builder, com.google.devtools.testing.v1.GoogleAutoOrBuilder>(
                (com.google.devtools.testing.v1.GoogleAuto) accountType_,
                getParentForChildren(),
                isClean());
        accountType_ = null;
      }
      accountTypeCase_ = 1;
      onChanged();
      return googleAutoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.testing.v1.Account)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.testing.v1.Account)
  private static final com.google.devtools.testing.v1.Account DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.testing.v1.Account();
  }

  public static com.google.devtools.testing.v1.Account getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Account>
      PARSER = new com.google.protobuf.AbstractParser<Account>() {
    @java.lang.Override
    public Account parsePartialFrom(
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

  public static com.google.protobuf.Parser<Account> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Account> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.testing.v1.Account getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
