// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/type/matcher/v3/string.proto

package com.github.xds.type.matcher.v3;

/**
 * <pre>
 * Specifies a list of ways to match a string.
 * </pre>
 *
 * Protobuf type {@code xds.type.matcher.v3.ListStringMatcher}
 */
public final class ListStringMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xds.type.matcher.v3.ListStringMatcher)
    ListStringMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListStringMatcher.newBuilder() to construct.
  private ListStringMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListStringMatcher() {
    patterns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListStringMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.xds.type.matcher.v3.StringProto.internal_static_xds_type_matcher_v3_ListStringMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.xds.type.matcher.v3.StringProto.internal_static_xds_type_matcher_v3_ListStringMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.xds.type.matcher.v3.ListStringMatcher.class, com.github.xds.type.matcher.v3.ListStringMatcher.Builder.class);
  }

  public static final int PATTERNS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.github.xds.type.matcher.v3.StringMatcher> patterns_;
  /**
   * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<com.github.xds.type.matcher.v3.StringMatcher> getPatternsList() {
    return patterns_;
  }
  /**
   * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.xds.type.matcher.v3.StringMatcherOrBuilder> 
      getPatternsOrBuilderList() {
    return patterns_;
  }
  /**
   * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public int getPatternsCount() {
    return patterns_.size();
  }
  /**
   * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.github.xds.type.matcher.v3.StringMatcher getPatterns(int index) {
    return patterns_.get(index);
  }
  /**
   * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.github.xds.type.matcher.v3.StringMatcherOrBuilder getPatternsOrBuilder(
      int index) {
    return patterns_.get(index);
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
    for (int i = 0; i < patterns_.size(); i++) {
      output.writeMessage(1, patterns_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < patterns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, patterns_.get(i));
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
    if (!(obj instanceof com.github.xds.type.matcher.v3.ListStringMatcher)) {
      return super.equals(obj);
    }
    com.github.xds.type.matcher.v3.ListStringMatcher other = (com.github.xds.type.matcher.v3.ListStringMatcher) obj;

    if (!getPatternsList()
        .equals(other.getPatternsList())) return false;
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
    if (getPatternsCount() > 0) {
      hash = (37 * hash) + PATTERNS_FIELD_NUMBER;
      hash = (53 * hash) + getPatternsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.xds.type.matcher.v3.ListStringMatcher parseFrom(
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
  public static Builder newBuilder(com.github.xds.type.matcher.v3.ListStringMatcher prototype) {
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
   * Specifies a list of ways to match a string.
   * </pre>
   *
   * Protobuf type {@code xds.type.matcher.v3.ListStringMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xds.type.matcher.v3.ListStringMatcher)
      com.github.xds.type.matcher.v3.ListStringMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.xds.type.matcher.v3.StringProto.internal_static_xds_type_matcher_v3_ListStringMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.xds.type.matcher.v3.StringProto.internal_static_xds_type_matcher_v3_ListStringMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.xds.type.matcher.v3.ListStringMatcher.class, com.github.xds.type.matcher.v3.ListStringMatcher.Builder.class);
    }

    // Construct using com.github.xds.type.matcher.v3.ListStringMatcher.newBuilder()
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
      if (patternsBuilder_ == null) {
        patterns_ = java.util.Collections.emptyList();
      } else {
        patterns_ = null;
        patternsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.xds.type.matcher.v3.StringProto.internal_static_xds_type_matcher_v3_ListStringMatcher_descriptor;
    }

    @java.lang.Override
    public com.github.xds.type.matcher.v3.ListStringMatcher getDefaultInstanceForType() {
      return com.github.xds.type.matcher.v3.ListStringMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.xds.type.matcher.v3.ListStringMatcher build() {
      com.github.xds.type.matcher.v3.ListStringMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.xds.type.matcher.v3.ListStringMatcher buildPartial() {
      com.github.xds.type.matcher.v3.ListStringMatcher result = new com.github.xds.type.matcher.v3.ListStringMatcher(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.github.xds.type.matcher.v3.ListStringMatcher result) {
      if (patternsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          patterns_ = java.util.Collections.unmodifiableList(patterns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.patterns_ = patterns_;
      } else {
        result.patterns_ = patternsBuilder_.build();
      }
    }

    private void buildPartial0(com.github.xds.type.matcher.v3.ListStringMatcher result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.github.xds.type.matcher.v3.ListStringMatcher) {
        return mergeFrom((com.github.xds.type.matcher.v3.ListStringMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.xds.type.matcher.v3.ListStringMatcher other) {
      if (other == com.github.xds.type.matcher.v3.ListStringMatcher.getDefaultInstance()) return this;
      if (patternsBuilder_ == null) {
        if (!other.patterns_.isEmpty()) {
          if (patterns_.isEmpty()) {
            patterns_ = other.patterns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePatternsIsMutable();
            patterns_.addAll(other.patterns_);
          }
          onChanged();
        }
      } else {
        if (!other.patterns_.isEmpty()) {
          if (patternsBuilder_.isEmpty()) {
            patternsBuilder_.dispose();
            patternsBuilder_ = null;
            patterns_ = other.patterns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            patternsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPatternsFieldBuilder() : null;
          } else {
            patternsBuilder_.addAllMessages(other.patterns_);
          }
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
              com.github.xds.type.matcher.v3.StringMatcher m =
                  input.readMessage(
                      com.github.xds.type.matcher.v3.StringMatcher.parser(),
                      extensionRegistry);
              if (patternsBuilder_ == null) {
                ensurePatternsIsMutable();
                patterns_.add(m);
              } else {
                patternsBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<com.github.xds.type.matcher.v3.StringMatcher> patterns_ =
      java.util.Collections.emptyList();
    private void ensurePatternsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        patterns_ = new java.util.ArrayList<com.github.xds.type.matcher.v3.StringMatcher>(patterns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.xds.type.matcher.v3.StringMatcher, com.github.xds.type.matcher.v3.StringMatcher.Builder, com.github.xds.type.matcher.v3.StringMatcherOrBuilder> patternsBuilder_;

    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<com.github.xds.type.matcher.v3.StringMatcher> getPatternsList() {
      if (patternsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(patterns_);
      } else {
        return patternsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public int getPatternsCount() {
      if (patternsBuilder_ == null) {
        return patterns_.size();
      } else {
        return patternsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.matcher.v3.StringMatcher getPatterns(int index) {
      if (patternsBuilder_ == null) {
        return patterns_.get(index);
      } else {
        return patternsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setPatterns(
        int index, com.github.xds.type.matcher.v3.StringMatcher value) {
      if (patternsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePatternsIsMutable();
        patterns_.set(index, value);
        onChanged();
      } else {
        patternsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setPatterns(
        int index, com.github.xds.type.matcher.v3.StringMatcher.Builder builderForValue) {
      if (patternsBuilder_ == null) {
        ensurePatternsIsMutable();
        patterns_.set(index, builderForValue.build());
        onChanged();
      } else {
        patternsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addPatterns(com.github.xds.type.matcher.v3.StringMatcher value) {
      if (patternsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePatternsIsMutable();
        patterns_.add(value);
        onChanged();
      } else {
        patternsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addPatterns(
        int index, com.github.xds.type.matcher.v3.StringMatcher value) {
      if (patternsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePatternsIsMutable();
        patterns_.add(index, value);
        onChanged();
      } else {
        patternsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addPatterns(
        com.github.xds.type.matcher.v3.StringMatcher.Builder builderForValue) {
      if (patternsBuilder_ == null) {
        ensurePatternsIsMutable();
        patterns_.add(builderForValue.build());
        onChanged();
      } else {
        patternsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addPatterns(
        int index, com.github.xds.type.matcher.v3.StringMatcher.Builder builderForValue) {
      if (patternsBuilder_ == null) {
        ensurePatternsIsMutable();
        patterns_.add(index, builderForValue.build());
        onChanged();
      } else {
        patternsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addAllPatterns(
        java.lang.Iterable<? extends com.github.xds.type.matcher.v3.StringMatcher> values) {
      if (patternsBuilder_ == null) {
        ensurePatternsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, patterns_);
        onChanged();
      } else {
        patternsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearPatterns() {
      if (patternsBuilder_ == null) {
        patterns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        patternsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder removePatterns(int index) {
      if (patternsBuilder_ == null) {
        ensurePatternsIsMutable();
        patterns_.remove(index);
        onChanged();
      } else {
        patternsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.matcher.v3.StringMatcher.Builder getPatternsBuilder(
        int index) {
      return getPatternsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.matcher.v3.StringMatcherOrBuilder getPatternsOrBuilder(
        int index) {
      if (patternsBuilder_ == null) {
        return patterns_.get(index);  } else {
        return patternsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<? extends com.github.xds.type.matcher.v3.StringMatcherOrBuilder> 
         getPatternsOrBuilderList() {
      if (patternsBuilder_ != null) {
        return patternsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(patterns_);
      }
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.matcher.v3.StringMatcher.Builder addPatternsBuilder() {
      return getPatternsFieldBuilder().addBuilder(
          com.github.xds.type.matcher.v3.StringMatcher.getDefaultInstance());
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public com.github.xds.type.matcher.v3.StringMatcher.Builder addPatternsBuilder(
        int index) {
      return getPatternsFieldBuilder().addBuilder(
          index, com.github.xds.type.matcher.v3.StringMatcher.getDefaultInstance());
    }
    /**
     * <code>repeated .xds.type.matcher.v3.StringMatcher patterns = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<com.github.xds.type.matcher.v3.StringMatcher.Builder> 
         getPatternsBuilderList() {
      return getPatternsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.xds.type.matcher.v3.StringMatcher, com.github.xds.type.matcher.v3.StringMatcher.Builder, com.github.xds.type.matcher.v3.StringMatcherOrBuilder> 
        getPatternsFieldBuilder() {
      if (patternsBuilder_ == null) {
        patternsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.xds.type.matcher.v3.StringMatcher, com.github.xds.type.matcher.v3.StringMatcher.Builder, com.github.xds.type.matcher.v3.StringMatcherOrBuilder>(
                patterns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        patterns_ = null;
      }
      return patternsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:xds.type.matcher.v3.ListStringMatcher)
  }

  // @@protoc_insertion_point(class_scope:xds.type.matcher.v3.ListStringMatcher)
  private static final com.github.xds.type.matcher.v3.ListStringMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.xds.type.matcher.v3.ListStringMatcher();
  }

  public static com.github.xds.type.matcher.v3.ListStringMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStringMatcher>
      PARSER = new com.google.protobuf.AbstractParser<ListStringMatcher>() {
    @java.lang.Override
    public ListStringMatcher parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListStringMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStringMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.xds.type.matcher.v3.ListStringMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

