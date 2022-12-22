// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/cigar.proto

package com.google.genomics.v1;

/**
 * <pre>
 * A single CIGAR operation.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1.CigarUnit}
 */
public final class CigarUnit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.CigarUnit)
    CigarUnitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CigarUnit.newBuilder() to construct.
  private CigarUnit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CigarUnit() {
    operation_ = 0;
    referenceSequence_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CigarUnit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.CigarUnit.class, com.google.genomics.v1.CigarUnit.Builder.class);
  }

  /**
   * <pre>
   * Describes the different types of CIGAR alignment operations that exist.
   * Used wherever CIGAR alignments are used.
   * </pre>
   *
   * Protobuf enum {@code google.genomics.v1.CigarUnit.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    OPERATION_UNSPECIFIED(0),
    /**
     * <pre>
     * An alignment match indicates that a sequence can be aligned to the
     * reference without evidence of an INDEL. Unlike the
     * `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators,
     * the `ALIGNMENT_MATCH` operator does not indicate whether the
     * reference and read sequences are an exact match. This operator is
     * equivalent to SAM's `M`.
     * </pre>
     *
     * <code>ALIGNMENT_MATCH = 1;</code>
     */
    ALIGNMENT_MATCH(1),
    /**
     * <pre>
     * The insert operator indicates that the read contains evidence of bases
     * being inserted into the reference. This operator is equivalent to SAM's
     * `I`.
     * </pre>
     *
     * <code>INSERT = 2;</code>
     */
    INSERT(2),
    /**
     * <pre>
     * The delete operator indicates that the read contains evidence of bases
     * being deleted from the reference. This operator is equivalent to SAM's
     * `D`.
     * </pre>
     *
     * <code>DELETE = 3;</code>
     */
    DELETE(3),
    /**
     * <pre>
     * The skip operator indicates that this read skips a long segment of the
     * reference, but the bases have not been deleted. This operator is commonly
     * used when working with RNA-seq data, where reads may skip long segments
     * of the reference between exons. This operator is equivalent to SAM's
     * `N`.
     * </pre>
     *
     * <code>SKIP = 4;</code>
     */
    SKIP(4),
    /**
     * <pre>
     * The soft clip operator indicates that bases at the start/end of a read
     * have not been considered during alignment. This may occur if the majority
     * of a read maps, except for low quality bases at the start/end of a read.
     * This operator is equivalent to SAM's `S`. Bases that are soft
     * clipped will still be stored in the read.
     * </pre>
     *
     * <code>CLIP_SOFT = 5;</code>
     */
    CLIP_SOFT(5),
    /**
     * <pre>
     * The hard clip operator indicates that bases at the start/end of a read
     * have been omitted from this alignment. This may occur if this linear
     * alignment is part of a chimeric alignment, or if the read has been
     * trimmed (for example, during error correction or to trim poly-A tails for
     * RNA-seq). This operator is equivalent to SAM's `H`.
     * </pre>
     *
     * <code>CLIP_HARD = 6;</code>
     */
    CLIP_HARD(6),
    /**
     * <pre>
     * The pad operator indicates that there is padding in an alignment. This
     * operator is equivalent to SAM's `P`.
     * </pre>
     *
     * <code>PAD = 7;</code>
     */
    PAD(7),
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence exactly
     * matches the reference. This operator is equivalent to SAM's `=`.
     * </pre>
     *
     * <code>SEQUENCE_MATCH = 8;</code>
     */
    SEQUENCE_MATCH(8),
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence is an
     * alignment match to the reference, but a sequence mismatch. This can
     * indicate a SNP or a read error. This operator is equivalent to SAM's
     * `X`.
     * </pre>
     *
     * <code>SEQUENCE_MISMATCH = 9;</code>
     */
    SEQUENCE_MISMATCH(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * An alignment match indicates that a sequence can be aligned to the
     * reference without evidence of an INDEL. Unlike the
     * `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators,
     * the `ALIGNMENT_MATCH` operator does not indicate whether the
     * reference and read sequences are an exact match. This operator is
     * equivalent to SAM's `M`.
     * </pre>
     *
     * <code>ALIGNMENT_MATCH = 1;</code>
     */
    public static final int ALIGNMENT_MATCH_VALUE = 1;
    /**
     * <pre>
     * The insert operator indicates that the read contains evidence of bases
     * being inserted into the reference. This operator is equivalent to SAM's
     * `I`.
     * </pre>
     *
     * <code>INSERT = 2;</code>
     */
    public static final int INSERT_VALUE = 2;
    /**
     * <pre>
     * The delete operator indicates that the read contains evidence of bases
     * being deleted from the reference. This operator is equivalent to SAM's
     * `D`.
     * </pre>
     *
     * <code>DELETE = 3;</code>
     */
    public static final int DELETE_VALUE = 3;
    /**
     * <pre>
     * The skip operator indicates that this read skips a long segment of the
     * reference, but the bases have not been deleted. This operator is commonly
     * used when working with RNA-seq data, where reads may skip long segments
     * of the reference between exons. This operator is equivalent to SAM's
     * `N`.
     * </pre>
     *
     * <code>SKIP = 4;</code>
     */
    public static final int SKIP_VALUE = 4;
    /**
     * <pre>
     * The soft clip operator indicates that bases at the start/end of a read
     * have not been considered during alignment. This may occur if the majority
     * of a read maps, except for low quality bases at the start/end of a read.
     * This operator is equivalent to SAM's `S`. Bases that are soft
     * clipped will still be stored in the read.
     * </pre>
     *
     * <code>CLIP_SOFT = 5;</code>
     */
    public static final int CLIP_SOFT_VALUE = 5;
    /**
     * <pre>
     * The hard clip operator indicates that bases at the start/end of a read
     * have been omitted from this alignment. This may occur if this linear
     * alignment is part of a chimeric alignment, or if the read has been
     * trimmed (for example, during error correction or to trim poly-A tails for
     * RNA-seq). This operator is equivalent to SAM's `H`.
     * </pre>
     *
     * <code>CLIP_HARD = 6;</code>
     */
    public static final int CLIP_HARD_VALUE = 6;
    /**
     * <pre>
     * The pad operator indicates that there is padding in an alignment. This
     * operator is equivalent to SAM's `P`.
     * </pre>
     *
     * <code>PAD = 7;</code>
     */
    public static final int PAD_VALUE = 7;
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence exactly
     * matches the reference. This operator is equivalent to SAM's `=`.
     * </pre>
     *
     * <code>SEQUENCE_MATCH = 8;</code>
     */
    public static final int SEQUENCE_MATCH_VALUE = 8;
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence is an
     * alignment match to the reference, but a sequence mismatch. This can
     * indicate a SNP or a read error. This operator is equivalent to SAM's
     * `X`.
     * </pre>
     *
     * <code>SEQUENCE_MISMATCH = 9;</code>
     */
    public static final int SEQUENCE_MISMATCH_VALUE = 9;


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
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return OPERATION_UNSPECIFIED;
        case 1: return ALIGNMENT_MATCH;
        case 2: return INSERT;
        case 3: return DELETE;
        case 4: return SKIP;
        case 5: return CLIP_SOFT;
        case 6: return CLIP_HARD;
        case 7: return PAD;
        case 8: return SEQUENCE_MATCH;
        case 9: return SEQUENCE_MISMATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
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
      return com.google.genomics.v1.CigarUnit.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
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

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.genomics.v1.CigarUnit.Operation)
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  private int operation_ = 0;
  /**
   * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   * @return The enum numeric value on the wire for operation.
   */
  @java.lang.Override public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   * @return The operation.
   */
  @java.lang.Override public com.google.genomics.v1.CigarUnit.Operation getOperation() {
    com.google.genomics.v1.CigarUnit.Operation result = com.google.genomics.v1.CigarUnit.Operation.forNumber(operation_);
    return result == null ? com.google.genomics.v1.CigarUnit.Operation.UNRECOGNIZED : result;
  }

  public static final int OPERATION_LENGTH_FIELD_NUMBER = 2;
  private long operationLength_ = 0L;
  /**
   * <pre>
   * The number of genomic bases that the operation runs for. Required.
   * </pre>
   *
   * <code>int64 operation_length = 2;</code>
   * @return The operationLength.
   */
  @java.lang.Override
  public long getOperationLength() {
    return operationLength_;
  }

  public static final int REFERENCE_SEQUENCE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object referenceSequence_ = "";
  /**
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   *
   * <code>string reference_sequence = 3;</code>
   * @return The referenceSequence.
   */
  @java.lang.Override
  public java.lang.String getReferenceSequence() {
    java.lang.Object ref = referenceSequence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceSequence_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   *
   * <code>string reference_sequence = 3;</code>
   * @return The bytes for referenceSequence.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferenceSequenceBytes() {
    java.lang.Object ref = referenceSequence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceSequence_ = b;
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
    if (operation_ != com.google.genomics.v1.CigarUnit.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operation_);
    }
    if (operationLength_ != 0L) {
      output.writeInt64(2, operationLength_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceSequence_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, referenceSequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operation_ != com.google.genomics.v1.CigarUnit.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operation_);
    }
    if (operationLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, operationLength_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceSequence_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, referenceSequence_);
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
    if (!(obj instanceof com.google.genomics.v1.CigarUnit)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.CigarUnit other = (com.google.genomics.v1.CigarUnit) obj;

    if (operation_ != other.operation_) return false;
    if (getOperationLength()
        != other.getOperationLength()) return false;
    if (!getReferenceSequence()
        .equals(other.getReferenceSequence())) return false;
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
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (37 * hash) + OPERATION_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOperationLength());
    hash = (37 * hash) + REFERENCE_SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceSequence().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.CigarUnit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CigarUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.CigarUnit prototype) {
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
   * A single CIGAR operation.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1.CigarUnit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.CigarUnit)
      com.google.genomics.v1.CigarUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.CigarUnit.class, com.google.genomics.v1.CigarUnit.Builder.class);
    }

    // Construct using com.google.genomics.v1.CigarUnit.newBuilder()
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
      operation_ = 0;
      operationLength_ = 0L;
      referenceSequence_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
    }

    @java.lang.Override
    public com.google.genomics.v1.CigarUnit getDefaultInstanceForType() {
      return com.google.genomics.v1.CigarUnit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.genomics.v1.CigarUnit build() {
      com.google.genomics.v1.CigarUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.genomics.v1.CigarUnit buildPartial() {
      com.google.genomics.v1.CigarUnit result = new com.google.genomics.v1.CigarUnit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.genomics.v1.CigarUnit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operation_ = operation_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operationLength_ = operationLength_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.referenceSequence_ = referenceSequence_;
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
      if (other instanceof com.google.genomics.v1.CigarUnit) {
        return mergeFrom((com.google.genomics.v1.CigarUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.CigarUnit other) {
      if (other == com.google.genomics.v1.CigarUnit.getDefaultInstance()) return this;
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
      }
      if (other.getOperationLength() != 0L) {
        setOperationLength(other.getOperationLength());
      }
      if (!other.getReferenceSequence().isEmpty()) {
        referenceSequence_ = other.referenceSequence_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 8: {
              operation_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              operationLength_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              referenceSequence_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int operation_ = 0;
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     * @return The enum numeric value on the wire for operation.
     */
    @java.lang.Override public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     * @param value The enum numeric value on the wire for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     * @return The operation.
     */
    @java.lang.Override
    public com.google.genomics.v1.CigarUnit.Operation getOperation() {
      com.google.genomics.v1.CigarUnit.Operation result = com.google.genomics.v1.CigarUnit.Operation.forNumber(operation_);
      return result == null ? com.google.genomics.v1.CigarUnit.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(com.google.genomics.v1.CigarUnit.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operation_ = 0;
      onChanged();
      return this;
    }

    private long operationLength_ ;
    /**
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     *
     * <code>int64 operation_length = 2;</code>
     * @return The operationLength.
     */
    @java.lang.Override
    public long getOperationLength() {
      return operationLength_;
    }
    /**
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     *
     * <code>int64 operation_length = 2;</code>
     * @param value The operationLength to set.
     * @return This builder for chaining.
     */
    public Builder setOperationLength(long value) {
      
      operationLength_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     *
     * <code>int64 operation_length = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperationLength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      operationLength_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object referenceSequence_ = "";
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     * @return The referenceSequence.
     */
    public java.lang.String getReferenceSequence() {
      java.lang.Object ref = referenceSequence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceSequence_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     * @return The bytes for referenceSequence.
     */
    public com.google.protobuf.ByteString
        getReferenceSequenceBytes() {
      java.lang.Object ref = referenceSequence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceSequence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     * @param value The referenceSequence to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceSequence(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      referenceSequence_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferenceSequence() {
      referenceSequence_ = getDefaultInstance().getReferenceSequence();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     * @param value The bytes for referenceSequence to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceSequenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      referenceSequence_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.CigarUnit)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.CigarUnit)
  private static final com.google.genomics.v1.CigarUnit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.CigarUnit();
  }

  public static com.google.genomics.v1.CigarUnit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CigarUnit>
      PARSER = new com.google.protobuf.AbstractParser<CigarUnit>() {
    @java.lang.Override
    public CigarUnit parsePartialFrom(
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

  public static com.google.protobuf.Parser<CigarUnit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CigarUnit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.genomics.v1.CigarUnit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
