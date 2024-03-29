// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/memory.proto

package io.envoyproxy.envoy.admin.v3;

/**
 * <pre>
 * Proto representation of the internal memory consumption of an Envoy instance. These represent
 * values extracted from an internal TCMalloc instance. For more information, see the section of the
 * docs entitled ["Generic Tcmalloc Status"](https://gperftools.github.io/gperftools/tcmalloc.html).
 * [#next-free-field: 7]
 * </pre>
 *
 * Protobuf type {@code envoy.admin.v3.Memory}
 */
public final class Memory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.admin.v3.Memory)
    MemoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Memory.newBuilder() to construct.
  private Memory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Memory() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Memory();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.admin.v3.MemoryProto.internal_static_envoy_admin_v3_Memory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.admin.v3.MemoryProto.internal_static_envoy_admin_v3_Memory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.admin.v3.Memory.class, io.envoyproxy.envoy.admin.v3.Memory.Builder.class);
  }

  public static final int ALLOCATED_FIELD_NUMBER = 1;
  private long allocated_ = 0L;
  /**
   * <pre>
   * The number of bytes allocated by the heap for Envoy. This is an alias for
   * ``generic.current_allocated_bytes``.
   * </pre>
   *
   * <code>uint64 allocated = 1;</code>
   * @return The allocated.
   */
  @java.lang.Override
  public long getAllocated() {
    return allocated_;
  }

  public static final int HEAP_SIZE_FIELD_NUMBER = 2;
  private long heapSize_ = 0L;
  /**
   * <pre>
   * The number of bytes reserved by the heap but not necessarily allocated. This is an alias for
   * ``generic.heap_size``.
   * </pre>
   *
   * <code>uint64 heap_size = 2;</code>
   * @return The heapSize.
   */
  @java.lang.Override
  public long getHeapSize() {
    return heapSize_;
  }

  public static final int PAGEHEAP_UNMAPPED_FIELD_NUMBER = 3;
  private long pageheapUnmapped_ = 0L;
  /**
   * <pre>
   * The number of bytes in free, unmapped pages in the page heap. These bytes always count towards
   * virtual memory usage, and depending on the OS, typically do not count towards physical memory
   * usage. This is an alias for ``tcmalloc.pageheap_unmapped_bytes``.
   * </pre>
   *
   * <code>uint64 pageheap_unmapped = 3;</code>
   * @return The pageheapUnmapped.
   */
  @java.lang.Override
  public long getPageheapUnmapped() {
    return pageheapUnmapped_;
  }

  public static final int PAGEHEAP_FREE_FIELD_NUMBER = 4;
  private long pageheapFree_ = 0L;
  /**
   * <pre>
   * The number of bytes in free, mapped pages in the page heap. These bytes always count towards
   * virtual memory usage, and unless the underlying memory is swapped out by the OS, they also
   * count towards physical memory usage. This is an alias for ``tcmalloc.pageheap_free_bytes``.
   * </pre>
   *
   * <code>uint64 pageheap_free = 4;</code>
   * @return The pageheapFree.
   */
  @java.lang.Override
  public long getPageheapFree() {
    return pageheapFree_;
  }

  public static final int TOTAL_THREAD_CACHE_FIELD_NUMBER = 5;
  private long totalThreadCache_ = 0L;
  /**
   * <pre>
   * The amount of memory used by the TCMalloc thread caches (for small objects). This is an alias
   * for ``tcmalloc.current_total_thread_cache_bytes``.
   * </pre>
   *
   * <code>uint64 total_thread_cache = 5;</code>
   * @return The totalThreadCache.
   */
  @java.lang.Override
  public long getTotalThreadCache() {
    return totalThreadCache_;
  }

  public static final int TOTAL_PHYSICAL_BYTES_FIELD_NUMBER = 6;
  private long totalPhysicalBytes_ = 0L;
  /**
   * <pre>
   * The number of bytes of the physical memory usage by the allocator. This is an alias for
   * ``generic.total_physical_bytes``.
   * </pre>
   *
   * <code>uint64 total_physical_bytes = 6;</code>
   * @return The totalPhysicalBytes.
   */
  @java.lang.Override
  public long getTotalPhysicalBytes() {
    return totalPhysicalBytes_;
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
    if (allocated_ != 0L) {
      output.writeUInt64(1, allocated_);
    }
    if (heapSize_ != 0L) {
      output.writeUInt64(2, heapSize_);
    }
    if (pageheapUnmapped_ != 0L) {
      output.writeUInt64(3, pageheapUnmapped_);
    }
    if (pageheapFree_ != 0L) {
      output.writeUInt64(4, pageheapFree_);
    }
    if (totalThreadCache_ != 0L) {
      output.writeUInt64(5, totalThreadCache_);
    }
    if (totalPhysicalBytes_ != 0L) {
      output.writeUInt64(6, totalPhysicalBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allocated_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, allocated_);
    }
    if (heapSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, heapSize_);
    }
    if (pageheapUnmapped_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, pageheapUnmapped_);
    }
    if (pageheapFree_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, pageheapFree_);
    }
    if (totalThreadCache_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, totalThreadCache_);
    }
    if (totalPhysicalBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, totalPhysicalBytes_);
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
    if (!(obj instanceof io.envoyproxy.envoy.admin.v3.Memory)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.admin.v3.Memory other = (io.envoyproxy.envoy.admin.v3.Memory) obj;

    if (getAllocated()
        != other.getAllocated()) return false;
    if (getHeapSize()
        != other.getHeapSize()) return false;
    if (getPageheapUnmapped()
        != other.getPageheapUnmapped()) return false;
    if (getPageheapFree()
        != other.getPageheapFree()) return false;
    if (getTotalThreadCache()
        != other.getTotalThreadCache()) return false;
    if (getTotalPhysicalBytes()
        != other.getTotalPhysicalBytes()) return false;
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
    hash = (37 * hash) + ALLOCATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAllocated());
    hash = (37 * hash) + HEAP_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeapSize());
    hash = (37 * hash) + PAGEHEAP_UNMAPPED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageheapUnmapped());
    hash = (37 * hash) + PAGEHEAP_FREE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageheapFree());
    hash = (37 * hash) + TOTAL_THREAD_CACHE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalThreadCache());
    hash = (37 * hash) + TOTAL_PHYSICAL_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalPhysicalBytes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.Memory parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.admin.v3.Memory prototype) {
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
   * Proto representation of the internal memory consumption of an Envoy instance. These represent
   * values extracted from an internal TCMalloc instance. For more information, see the section of the
   * docs entitled ["Generic Tcmalloc Status"](https://gperftools.github.io/gperftools/tcmalloc.html).
   * [#next-free-field: 7]
   * </pre>
   *
   * Protobuf type {@code envoy.admin.v3.Memory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.admin.v3.Memory)
      io.envoyproxy.envoy.admin.v3.MemoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.admin.v3.MemoryProto.internal_static_envoy_admin_v3_Memory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.admin.v3.MemoryProto.internal_static_envoy_admin_v3_Memory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.admin.v3.Memory.class, io.envoyproxy.envoy.admin.v3.Memory.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.admin.v3.Memory.newBuilder()
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
      allocated_ = 0L;
      heapSize_ = 0L;
      pageheapUnmapped_ = 0L;
      pageheapFree_ = 0L;
      totalThreadCache_ = 0L;
      totalPhysicalBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.admin.v3.MemoryProto.internal_static_envoy_admin_v3_Memory_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.Memory getDefaultInstanceForType() {
      return io.envoyproxy.envoy.admin.v3.Memory.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.Memory build() {
      io.envoyproxy.envoy.admin.v3.Memory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.Memory buildPartial() {
      io.envoyproxy.envoy.admin.v3.Memory result = new io.envoyproxy.envoy.admin.v3.Memory(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.envoyproxy.envoy.admin.v3.Memory result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allocated_ = allocated_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.heapSize_ = heapSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageheapUnmapped_ = pageheapUnmapped_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageheapFree_ = pageheapFree_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.totalThreadCache_ = totalThreadCache_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.totalPhysicalBytes_ = totalPhysicalBytes_;
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
      if (other instanceof io.envoyproxy.envoy.admin.v3.Memory) {
        return mergeFrom((io.envoyproxy.envoy.admin.v3.Memory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.admin.v3.Memory other) {
      if (other == io.envoyproxy.envoy.admin.v3.Memory.getDefaultInstance()) return this;
      if (other.getAllocated() != 0L) {
        setAllocated(other.getAllocated());
      }
      if (other.getHeapSize() != 0L) {
        setHeapSize(other.getHeapSize());
      }
      if (other.getPageheapUnmapped() != 0L) {
        setPageheapUnmapped(other.getPageheapUnmapped());
      }
      if (other.getPageheapFree() != 0L) {
        setPageheapFree(other.getPageheapFree());
      }
      if (other.getTotalThreadCache() != 0L) {
        setTotalThreadCache(other.getTotalThreadCache());
      }
      if (other.getTotalPhysicalBytes() != 0L) {
        setTotalPhysicalBytes(other.getTotalPhysicalBytes());
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
              allocated_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              heapSize_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              pageheapUnmapped_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              pageheapFree_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              totalThreadCache_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              totalPhysicalBytes_ = input.readUInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long allocated_ ;
    /**
     * <pre>
     * The number of bytes allocated by the heap for Envoy. This is an alias for
     * ``generic.current_allocated_bytes``.
     * </pre>
     *
     * <code>uint64 allocated = 1;</code>
     * @return The allocated.
     */
    @java.lang.Override
    public long getAllocated() {
      return allocated_;
    }
    /**
     * <pre>
     * The number of bytes allocated by the heap for Envoy. This is an alias for
     * ``generic.current_allocated_bytes``.
     * </pre>
     *
     * <code>uint64 allocated = 1;</code>
     * @param value The allocated to set.
     * @return This builder for chaining.
     */
    public Builder setAllocated(long value) {
      
      allocated_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes allocated by the heap for Envoy. This is an alias for
     * ``generic.current_allocated_bytes``.
     * </pre>
     *
     * <code>uint64 allocated = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllocated() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allocated_ = 0L;
      onChanged();
      return this;
    }

    private long heapSize_ ;
    /**
     * <pre>
     * The number of bytes reserved by the heap but not necessarily allocated. This is an alias for
     * ``generic.heap_size``.
     * </pre>
     *
     * <code>uint64 heap_size = 2;</code>
     * @return The heapSize.
     */
    @java.lang.Override
    public long getHeapSize() {
      return heapSize_;
    }
    /**
     * <pre>
     * The number of bytes reserved by the heap but not necessarily allocated. This is an alias for
     * ``generic.heap_size``.
     * </pre>
     *
     * <code>uint64 heap_size = 2;</code>
     * @param value The heapSize to set.
     * @return This builder for chaining.
     */
    public Builder setHeapSize(long value) {
      
      heapSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes reserved by the heap but not necessarily allocated. This is an alias for
     * ``generic.heap_size``.
     * </pre>
     *
     * <code>uint64 heap_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeapSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      heapSize_ = 0L;
      onChanged();
      return this;
    }

    private long pageheapUnmapped_ ;
    /**
     * <pre>
     * The number of bytes in free, unmapped pages in the page heap. These bytes always count towards
     * virtual memory usage, and depending on the OS, typically do not count towards physical memory
     * usage. This is an alias for ``tcmalloc.pageheap_unmapped_bytes``.
     * </pre>
     *
     * <code>uint64 pageheap_unmapped = 3;</code>
     * @return The pageheapUnmapped.
     */
    @java.lang.Override
    public long getPageheapUnmapped() {
      return pageheapUnmapped_;
    }
    /**
     * <pre>
     * The number of bytes in free, unmapped pages in the page heap. These bytes always count towards
     * virtual memory usage, and depending on the OS, typically do not count towards physical memory
     * usage. This is an alias for ``tcmalloc.pageheap_unmapped_bytes``.
     * </pre>
     *
     * <code>uint64 pageheap_unmapped = 3;</code>
     * @param value The pageheapUnmapped to set.
     * @return This builder for chaining.
     */
    public Builder setPageheapUnmapped(long value) {
      
      pageheapUnmapped_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes in free, unmapped pages in the page heap. These bytes always count towards
     * virtual memory usage, and depending on the OS, typically do not count towards physical memory
     * usage. This is an alias for ``tcmalloc.pageheap_unmapped_bytes``.
     * </pre>
     *
     * <code>uint64 pageheap_unmapped = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageheapUnmapped() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pageheapUnmapped_ = 0L;
      onChanged();
      return this;
    }

    private long pageheapFree_ ;
    /**
     * <pre>
     * The number of bytes in free, mapped pages in the page heap. These bytes always count towards
     * virtual memory usage, and unless the underlying memory is swapped out by the OS, they also
     * count towards physical memory usage. This is an alias for ``tcmalloc.pageheap_free_bytes``.
     * </pre>
     *
     * <code>uint64 pageheap_free = 4;</code>
     * @return The pageheapFree.
     */
    @java.lang.Override
    public long getPageheapFree() {
      return pageheapFree_;
    }
    /**
     * <pre>
     * The number of bytes in free, mapped pages in the page heap. These bytes always count towards
     * virtual memory usage, and unless the underlying memory is swapped out by the OS, they also
     * count towards physical memory usage. This is an alias for ``tcmalloc.pageheap_free_bytes``.
     * </pre>
     *
     * <code>uint64 pageheap_free = 4;</code>
     * @param value The pageheapFree to set.
     * @return This builder for chaining.
     */
    public Builder setPageheapFree(long value) {
      
      pageheapFree_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes in free, mapped pages in the page heap. These bytes always count towards
     * virtual memory usage, and unless the underlying memory is swapped out by the OS, they also
     * count towards physical memory usage. This is an alias for ``tcmalloc.pageheap_free_bytes``.
     * </pre>
     *
     * <code>uint64 pageheap_free = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageheapFree() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pageheapFree_ = 0L;
      onChanged();
      return this;
    }

    private long totalThreadCache_ ;
    /**
     * <pre>
     * The amount of memory used by the TCMalloc thread caches (for small objects). This is an alias
     * for ``tcmalloc.current_total_thread_cache_bytes``.
     * </pre>
     *
     * <code>uint64 total_thread_cache = 5;</code>
     * @return The totalThreadCache.
     */
    @java.lang.Override
    public long getTotalThreadCache() {
      return totalThreadCache_;
    }
    /**
     * <pre>
     * The amount of memory used by the TCMalloc thread caches (for small objects). This is an alias
     * for ``tcmalloc.current_total_thread_cache_bytes``.
     * </pre>
     *
     * <code>uint64 total_thread_cache = 5;</code>
     * @param value The totalThreadCache to set.
     * @return This builder for chaining.
     */
    public Builder setTotalThreadCache(long value) {
      
      totalThreadCache_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of memory used by the TCMalloc thread caches (for small objects). This is an alias
     * for ``tcmalloc.current_total_thread_cache_bytes``.
     * </pre>
     *
     * <code>uint64 total_thread_cache = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalThreadCache() {
      bitField0_ = (bitField0_ & ~0x00000010);
      totalThreadCache_ = 0L;
      onChanged();
      return this;
    }

    private long totalPhysicalBytes_ ;
    /**
     * <pre>
     * The number of bytes of the physical memory usage by the allocator. This is an alias for
     * ``generic.total_physical_bytes``.
     * </pre>
     *
     * <code>uint64 total_physical_bytes = 6;</code>
     * @return The totalPhysicalBytes.
     */
    @java.lang.Override
    public long getTotalPhysicalBytes() {
      return totalPhysicalBytes_;
    }
    /**
     * <pre>
     * The number of bytes of the physical memory usage by the allocator. This is an alias for
     * ``generic.total_physical_bytes``.
     * </pre>
     *
     * <code>uint64 total_physical_bytes = 6;</code>
     * @param value The totalPhysicalBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPhysicalBytes(long value) {
      
      totalPhysicalBytes_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes of the physical memory usage by the allocator. This is an alias for
     * ``generic.total_physical_bytes``.
     * </pre>
     *
     * <code>uint64 total_physical_bytes = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPhysicalBytes() {
      bitField0_ = (bitField0_ & ~0x00000020);
      totalPhysicalBytes_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:envoy.admin.v3.Memory)
  }

  // @@protoc_insertion_point(class_scope:envoy.admin.v3.Memory)
  private static final io.envoyproxy.envoy.admin.v3.Memory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.admin.v3.Memory();
  }

  public static io.envoyproxy.envoy.admin.v3.Memory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Memory>
      PARSER = new com.google.protobuf.AbstractParser<Memory>() {
    @java.lang.Override
    public Memory parsePartialFrom(
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

  public static com.google.protobuf.Parser<Memory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Memory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.admin.v3.Memory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

