// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

/**
 * <pre>
 * The Google Cloud Storage location for a csv file which preserves a list of
 * ImportProductSetRequests in each line.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.ImportProductSetsGcsSource}
 */
public final class ImportProductSetsGcsSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.ImportProductSetsGcsSource)
    ImportProductSetsGcsSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportProductSetsGcsSource.newBuilder() to construct.
  private ImportProductSetsGcsSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportProductSetsGcsSource() {
    csvFileUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportProductSetsGcsSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1_ImportProductSetsGcsSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1_ImportProductSetsGcsSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.ImportProductSetsGcsSource.class, com.google.cloud.vision.v1.ImportProductSetsGcsSource.Builder.class);
  }

  public static final int CSV_FILE_URI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object csvFileUri_ = "";
  /**
   * <pre>
   * The Google Cloud Storage URI of the input csv file.
   * The URI must start with `gs://`.
   * The format of the input csv file should be one image per line.
   * In each line, there are 8 columns.
   * 1.  image-uri
   * 2.  image-id
   * 3.  product-set-id
   * 4.  product-id
   * 5.  product-category
   * 6.  product-display-name
   * 7.  labels
   * 8.  bounding-poly
   * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
   * columns are required. All other columns are optional.
   * If the `ProductSet` or `Product` specified by the `product-set-id` and
   * `product-id` values does not exist, then the system will create a new
   * `ProductSet` or `Product` for the image. In this case, the
   * `product-display-name` column refers to
   * [display_name][google.cloud.vision.v1.Product.display_name], the
   * `product-category` column refers to
   * [product_category][google.cloud.vision.v1.Product.product_category], and the
   * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
   * The `image-id` column is optional but must be unique if provided. If it is
   * empty, the system will automatically assign a unique id to the image.
   * The `product-display-name` column is optional. If it is empty, the system
   * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
   * space (" "). You can update the `display_name` later by using the API.
   * If a `Product` with the specified `product-id` already exists, then the
   * system ignores the `product-display-name`, `product-category`, and `labels`
   * columns.
   * The `labels` column (optional) is a line containing a list of
   * comma-separated key-value pairs, in the following format:
   *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
   * The `bounding-poly` column (optional) identifies one region of
   * interest from the image in the same manner as `CreateReferenceImage`. If
   * you do not specify the `bounding-poly` column, then the system will try to
   * detect regions of interest automatically.
   * At most one `bounding-poly` column is allowed per line. If the image
   * contains multiple regions of interest, add a line to the CSV file that
   * includes the same product information, and the `bounding-poly` values for
   * each region of interest.
   * The `bounding-poly` column must contain an even number of comma-separated
   * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
   * non-negative integers for absolute bounding polygons, and float values
   * in [0, 1] for normalized bounding polygons.
   * The system will resize the image if the image resolution is too
   * large to process (larger than 20MP).
   * </pre>
   *
   * <code>string csv_file_uri = 1;</code>
   * @return The csvFileUri.
   */
  @java.lang.Override
  public java.lang.String getCsvFileUri() {
    java.lang.Object ref = csvFileUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      csvFileUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Cloud Storage URI of the input csv file.
   * The URI must start with `gs://`.
   * The format of the input csv file should be one image per line.
   * In each line, there are 8 columns.
   * 1.  image-uri
   * 2.  image-id
   * 3.  product-set-id
   * 4.  product-id
   * 5.  product-category
   * 6.  product-display-name
   * 7.  labels
   * 8.  bounding-poly
   * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
   * columns are required. All other columns are optional.
   * If the `ProductSet` or `Product` specified by the `product-set-id` and
   * `product-id` values does not exist, then the system will create a new
   * `ProductSet` or `Product` for the image. In this case, the
   * `product-display-name` column refers to
   * [display_name][google.cloud.vision.v1.Product.display_name], the
   * `product-category` column refers to
   * [product_category][google.cloud.vision.v1.Product.product_category], and the
   * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
   * The `image-id` column is optional but must be unique if provided. If it is
   * empty, the system will automatically assign a unique id to the image.
   * The `product-display-name` column is optional. If it is empty, the system
   * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
   * space (" "). You can update the `display_name` later by using the API.
   * If a `Product` with the specified `product-id` already exists, then the
   * system ignores the `product-display-name`, `product-category`, and `labels`
   * columns.
   * The `labels` column (optional) is a line containing a list of
   * comma-separated key-value pairs, in the following format:
   *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
   * The `bounding-poly` column (optional) identifies one region of
   * interest from the image in the same manner as `CreateReferenceImage`. If
   * you do not specify the `bounding-poly` column, then the system will try to
   * detect regions of interest automatically.
   * At most one `bounding-poly` column is allowed per line. If the image
   * contains multiple regions of interest, add a line to the CSV file that
   * includes the same product information, and the `bounding-poly` values for
   * each region of interest.
   * The `bounding-poly` column must contain an even number of comma-separated
   * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
   * non-negative integers for absolute bounding polygons, and float values
   * in [0, 1] for normalized bounding polygons.
   * The system will resize the image if the image resolution is too
   * large to process (larger than 20MP).
   * </pre>
   *
   * <code>string csv_file_uri = 1;</code>
   * @return The bytes for csvFileUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCsvFileUriBytes() {
    java.lang.Object ref = csvFileUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      csvFileUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(csvFileUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, csvFileUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(csvFileUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, csvFileUri_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.ImportProductSetsGcsSource)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.ImportProductSetsGcsSource other = (com.google.cloud.vision.v1.ImportProductSetsGcsSource) obj;

    if (!getCsvFileUri()
        .equals(other.getCsvFileUri())) return false;
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
    hash = (37 * hash) + CSV_FILE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getCsvFileUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1.ImportProductSetsGcsSource prototype) {
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
   * The Google Cloud Storage location for a csv file which preserves a list of
   * ImportProductSetRequests in each line.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.ImportProductSetsGcsSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.ImportProductSetsGcsSource)
      com.google.cloud.vision.v1.ImportProductSetsGcsSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1_ImportProductSetsGcsSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1_ImportProductSetsGcsSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.ImportProductSetsGcsSource.class, com.google.cloud.vision.v1.ImportProductSetsGcsSource.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.ImportProductSetsGcsSource.newBuilder()
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
      csvFileUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1_ImportProductSetsGcsSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.ImportProductSetsGcsSource getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.ImportProductSetsGcsSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.ImportProductSetsGcsSource build() {
      com.google.cloud.vision.v1.ImportProductSetsGcsSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.ImportProductSetsGcsSource buildPartial() {
      com.google.cloud.vision.v1.ImportProductSetsGcsSource result = new com.google.cloud.vision.v1.ImportProductSetsGcsSource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1.ImportProductSetsGcsSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.csvFileUri_ = csvFileUri_;
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
      if (other instanceof com.google.cloud.vision.v1.ImportProductSetsGcsSource) {
        return mergeFrom((com.google.cloud.vision.v1.ImportProductSetsGcsSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.ImportProductSetsGcsSource other) {
      if (other == com.google.cloud.vision.v1.ImportProductSetsGcsSource.getDefaultInstance()) return this;
      if (!other.getCsvFileUri().isEmpty()) {
        csvFileUri_ = other.csvFileUri_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              csvFileUri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object csvFileUri_ = "";
    /**
     * <pre>
     * The Google Cloud Storage URI of the input csv file.
     * The URI must start with `gs://`.
     * The format of the input csv file should be one image per line.
     * In each line, there are 8 columns.
     * 1.  image-uri
     * 2.  image-id
     * 3.  product-set-id
     * 4.  product-id
     * 5.  product-category
     * 6.  product-display-name
     * 7.  labels
     * 8.  bounding-poly
     * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
     * columns are required. All other columns are optional.
     * If the `ProductSet` or `Product` specified by the `product-set-id` and
     * `product-id` values does not exist, then the system will create a new
     * `ProductSet` or `Product` for the image. In this case, the
     * `product-display-name` column refers to
     * [display_name][google.cloud.vision.v1.Product.display_name], the
     * `product-category` column refers to
     * [product_category][google.cloud.vision.v1.Product.product_category], and the
     * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
     * The `image-id` column is optional but must be unique if provided. If it is
     * empty, the system will automatically assign a unique id to the image.
     * The `product-display-name` column is optional. If it is empty, the system
     * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
     * space (" "). You can update the `display_name` later by using the API.
     * If a `Product` with the specified `product-id` already exists, then the
     * system ignores the `product-display-name`, `product-category`, and `labels`
     * columns.
     * The `labels` column (optional) is a line containing a list of
     * comma-separated key-value pairs, in the following format:
     *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
     * The `bounding-poly` column (optional) identifies one region of
     * interest from the image in the same manner as `CreateReferenceImage`. If
     * you do not specify the `bounding-poly` column, then the system will try to
     * detect regions of interest automatically.
     * At most one `bounding-poly` column is allowed per line. If the image
     * contains multiple regions of interest, add a line to the CSV file that
     * includes the same product information, and the `bounding-poly` values for
     * each region of interest.
     * The `bounding-poly` column must contain an even number of comma-separated
     * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
     * non-negative integers for absolute bounding polygons, and float values
     * in [0, 1] for normalized bounding polygons.
     * The system will resize the image if the image resolution is too
     * large to process (larger than 20MP).
     * </pre>
     *
     * <code>string csv_file_uri = 1;</code>
     * @return The csvFileUri.
     */
    public java.lang.String getCsvFileUri() {
      java.lang.Object ref = csvFileUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        csvFileUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Storage URI of the input csv file.
     * The URI must start with `gs://`.
     * The format of the input csv file should be one image per line.
     * In each line, there are 8 columns.
     * 1.  image-uri
     * 2.  image-id
     * 3.  product-set-id
     * 4.  product-id
     * 5.  product-category
     * 6.  product-display-name
     * 7.  labels
     * 8.  bounding-poly
     * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
     * columns are required. All other columns are optional.
     * If the `ProductSet` or `Product` specified by the `product-set-id` and
     * `product-id` values does not exist, then the system will create a new
     * `ProductSet` or `Product` for the image. In this case, the
     * `product-display-name` column refers to
     * [display_name][google.cloud.vision.v1.Product.display_name], the
     * `product-category` column refers to
     * [product_category][google.cloud.vision.v1.Product.product_category], and the
     * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
     * The `image-id` column is optional but must be unique if provided. If it is
     * empty, the system will automatically assign a unique id to the image.
     * The `product-display-name` column is optional. If it is empty, the system
     * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
     * space (" "). You can update the `display_name` later by using the API.
     * If a `Product` with the specified `product-id` already exists, then the
     * system ignores the `product-display-name`, `product-category`, and `labels`
     * columns.
     * The `labels` column (optional) is a line containing a list of
     * comma-separated key-value pairs, in the following format:
     *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
     * The `bounding-poly` column (optional) identifies one region of
     * interest from the image in the same manner as `CreateReferenceImage`. If
     * you do not specify the `bounding-poly` column, then the system will try to
     * detect regions of interest automatically.
     * At most one `bounding-poly` column is allowed per line. If the image
     * contains multiple regions of interest, add a line to the CSV file that
     * includes the same product information, and the `bounding-poly` values for
     * each region of interest.
     * The `bounding-poly` column must contain an even number of comma-separated
     * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
     * non-negative integers for absolute bounding polygons, and float values
     * in [0, 1] for normalized bounding polygons.
     * The system will resize the image if the image resolution is too
     * large to process (larger than 20MP).
     * </pre>
     *
     * <code>string csv_file_uri = 1;</code>
     * @return The bytes for csvFileUri.
     */
    public com.google.protobuf.ByteString
        getCsvFileUriBytes() {
      java.lang.Object ref = csvFileUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        csvFileUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Storage URI of the input csv file.
     * The URI must start with `gs://`.
     * The format of the input csv file should be one image per line.
     * In each line, there are 8 columns.
     * 1.  image-uri
     * 2.  image-id
     * 3.  product-set-id
     * 4.  product-id
     * 5.  product-category
     * 6.  product-display-name
     * 7.  labels
     * 8.  bounding-poly
     * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
     * columns are required. All other columns are optional.
     * If the `ProductSet` or `Product` specified by the `product-set-id` and
     * `product-id` values does not exist, then the system will create a new
     * `ProductSet` or `Product` for the image. In this case, the
     * `product-display-name` column refers to
     * [display_name][google.cloud.vision.v1.Product.display_name], the
     * `product-category` column refers to
     * [product_category][google.cloud.vision.v1.Product.product_category], and the
     * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
     * The `image-id` column is optional but must be unique if provided. If it is
     * empty, the system will automatically assign a unique id to the image.
     * The `product-display-name` column is optional. If it is empty, the system
     * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
     * space (" "). You can update the `display_name` later by using the API.
     * If a `Product` with the specified `product-id` already exists, then the
     * system ignores the `product-display-name`, `product-category`, and `labels`
     * columns.
     * The `labels` column (optional) is a line containing a list of
     * comma-separated key-value pairs, in the following format:
     *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
     * The `bounding-poly` column (optional) identifies one region of
     * interest from the image in the same manner as `CreateReferenceImage`. If
     * you do not specify the `bounding-poly` column, then the system will try to
     * detect regions of interest automatically.
     * At most one `bounding-poly` column is allowed per line. If the image
     * contains multiple regions of interest, add a line to the CSV file that
     * includes the same product information, and the `bounding-poly` values for
     * each region of interest.
     * The `bounding-poly` column must contain an even number of comma-separated
     * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
     * non-negative integers for absolute bounding polygons, and float values
     * in [0, 1] for normalized bounding polygons.
     * The system will resize the image if the image resolution is too
     * large to process (larger than 20MP).
     * </pre>
     *
     * <code>string csv_file_uri = 1;</code>
     * @param value The csvFileUri to set.
     * @return This builder for chaining.
     */
    public Builder setCsvFileUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      csvFileUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Storage URI of the input csv file.
     * The URI must start with `gs://`.
     * The format of the input csv file should be one image per line.
     * In each line, there are 8 columns.
     * 1.  image-uri
     * 2.  image-id
     * 3.  product-set-id
     * 4.  product-id
     * 5.  product-category
     * 6.  product-display-name
     * 7.  labels
     * 8.  bounding-poly
     * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
     * columns are required. All other columns are optional.
     * If the `ProductSet` or `Product` specified by the `product-set-id` and
     * `product-id` values does not exist, then the system will create a new
     * `ProductSet` or `Product` for the image. In this case, the
     * `product-display-name` column refers to
     * [display_name][google.cloud.vision.v1.Product.display_name], the
     * `product-category` column refers to
     * [product_category][google.cloud.vision.v1.Product.product_category], and the
     * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
     * The `image-id` column is optional but must be unique if provided. If it is
     * empty, the system will automatically assign a unique id to the image.
     * The `product-display-name` column is optional. If it is empty, the system
     * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
     * space (" "). You can update the `display_name` later by using the API.
     * If a `Product` with the specified `product-id` already exists, then the
     * system ignores the `product-display-name`, `product-category`, and `labels`
     * columns.
     * The `labels` column (optional) is a line containing a list of
     * comma-separated key-value pairs, in the following format:
     *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
     * The `bounding-poly` column (optional) identifies one region of
     * interest from the image in the same manner as `CreateReferenceImage`. If
     * you do not specify the `bounding-poly` column, then the system will try to
     * detect regions of interest automatically.
     * At most one `bounding-poly` column is allowed per line. If the image
     * contains multiple regions of interest, add a line to the CSV file that
     * includes the same product information, and the `bounding-poly` values for
     * each region of interest.
     * The `bounding-poly` column must contain an even number of comma-separated
     * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
     * non-negative integers for absolute bounding polygons, and float values
     * in [0, 1] for normalized bounding polygons.
     * The system will resize the image if the image resolution is too
     * large to process (larger than 20MP).
     * </pre>
     *
     * <code>string csv_file_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCsvFileUri() {
      csvFileUri_ = getDefaultInstance().getCsvFileUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Storage URI of the input csv file.
     * The URI must start with `gs://`.
     * The format of the input csv file should be one image per line.
     * In each line, there are 8 columns.
     * 1.  image-uri
     * 2.  image-id
     * 3.  product-set-id
     * 4.  product-id
     * 5.  product-category
     * 6.  product-display-name
     * 7.  labels
     * 8.  bounding-poly
     * The `image-uri`, `product-set-id`, `product-id`, and `product-category`
     * columns are required. All other columns are optional.
     * If the `ProductSet` or `Product` specified by the `product-set-id` and
     * `product-id` values does not exist, then the system will create a new
     * `ProductSet` or `Product` for the image. In this case, the
     * `product-display-name` column refers to
     * [display_name][google.cloud.vision.v1.Product.display_name], the
     * `product-category` column refers to
     * [product_category][google.cloud.vision.v1.Product.product_category], and the
     * `labels` column refers to [product_labels][google.cloud.vision.v1.Product.product_labels].
     * The `image-id` column is optional but must be unique if provided. If it is
     * empty, the system will automatically assign a unique id to the image.
     * The `product-display-name` column is optional. If it is empty, the system
     * sets the [display_name][google.cloud.vision.v1.Product.display_name] field for the product to a
     * space (" "). You can update the `display_name` later by using the API.
     * If a `Product` with the specified `product-id` already exists, then the
     * system ignores the `product-display-name`, `product-category`, and `labels`
     * columns.
     * The `labels` column (optional) is a line containing a list of
     * comma-separated key-value pairs, in the following format:
     *     "key_1=value_1,key_2=value_2,...,key_n=value_n"
     * The `bounding-poly` column (optional) identifies one region of
     * interest from the image in the same manner as `CreateReferenceImage`. If
     * you do not specify the `bounding-poly` column, then the system will try to
     * detect regions of interest automatically.
     * At most one `bounding-poly` column is allowed per line. If the image
     * contains multiple regions of interest, add a line to the CSV file that
     * includes the same product information, and the `bounding-poly` values for
     * each region of interest.
     * The `bounding-poly` column must contain an even number of comma-separated
     * numbers, in the format "p1_x,p1_y,p2_x,p2_y,...,pn_x,pn_y". Use
     * non-negative integers for absolute bounding polygons, and float values
     * in [0, 1] for normalized bounding polygons.
     * The system will resize the image if the image resolution is too
     * large to process (larger than 20MP).
     * </pre>
     *
     * <code>string csv_file_uri = 1;</code>
     * @param value The bytes for csvFileUri to set.
     * @return This builder for chaining.
     */
    public Builder setCsvFileUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      csvFileUri_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.ImportProductSetsGcsSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.ImportProductSetsGcsSource)
  private static final com.google.cloud.vision.v1.ImportProductSetsGcsSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.ImportProductSetsGcsSource();
  }

  public static com.google.cloud.vision.v1.ImportProductSetsGcsSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportProductSetsGcsSource>
      PARSER = new com.google.protobuf.AbstractParser<ImportProductSetsGcsSource>() {
    @java.lang.Override
    public ImportProductSetsGcsSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportProductSetsGcsSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportProductSetsGcsSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.ImportProductSetsGcsSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

