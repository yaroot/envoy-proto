// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

/**
 * <pre>
 * When a raw document is supplied, this indicates the file format
 * </pre>
 *
 * Protobuf enum {@code google.cloud.contentwarehouse.v1.RawDocumentFileType}
 */
public enum RawDocumentFileType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No raw document specified or it is non-parsable
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_UNSPECIFIED = 0;</code>
   */
  RAW_DOCUMENT_FILE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Adobe PDF format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_PDF = 1;</code>
   */
  RAW_DOCUMENT_FILE_TYPE_PDF(1),
  /**
   * <pre>
   * Microsoft Word format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_DOCX = 2;</code>
   */
  RAW_DOCUMENT_FILE_TYPE_DOCX(2),
  /**
   * <pre>
   * Microsoft Excel format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_XLSX = 3;</code>
   */
  RAW_DOCUMENT_FILE_TYPE_XLSX(3),
  /**
   * <pre>
   * Microsoft Powerpoint format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_PPTX = 4;</code>
   */
  RAW_DOCUMENT_FILE_TYPE_PPTX(4),
  /**
   * <pre>
   * UTF-8 encoded text format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_TEXT = 5;</code>
   */
  RAW_DOCUMENT_FILE_TYPE_TEXT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No raw document specified or it is non-parsable
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RAW_DOCUMENT_FILE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Adobe PDF format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_PDF = 1;</code>
   */
  public static final int RAW_DOCUMENT_FILE_TYPE_PDF_VALUE = 1;
  /**
   * <pre>
   * Microsoft Word format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_DOCX = 2;</code>
   */
  public static final int RAW_DOCUMENT_FILE_TYPE_DOCX_VALUE = 2;
  /**
   * <pre>
   * Microsoft Excel format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_XLSX = 3;</code>
   */
  public static final int RAW_DOCUMENT_FILE_TYPE_XLSX_VALUE = 3;
  /**
   * <pre>
   * Microsoft Powerpoint format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_PPTX = 4;</code>
   */
  public static final int RAW_DOCUMENT_FILE_TYPE_PPTX_VALUE = 4;
  /**
   * <pre>
   * UTF-8 encoded text format
   * </pre>
   *
   * <code>RAW_DOCUMENT_FILE_TYPE_TEXT = 5;</code>
   */
  public static final int RAW_DOCUMENT_FILE_TYPE_TEXT_VALUE = 5;


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
  public static RawDocumentFileType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RawDocumentFileType forNumber(int value) {
    switch (value) {
      case 0: return RAW_DOCUMENT_FILE_TYPE_UNSPECIFIED;
      case 1: return RAW_DOCUMENT_FILE_TYPE_PDF;
      case 2: return RAW_DOCUMENT_FILE_TYPE_DOCX;
      case 3: return RAW_DOCUMENT_FILE_TYPE_XLSX;
      case 4: return RAW_DOCUMENT_FILE_TYPE_PPTX;
      case 5: return RAW_DOCUMENT_FILE_TYPE_TEXT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RawDocumentFileType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RawDocumentFileType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RawDocumentFileType>() {
          public RawDocumentFileType findValueByNumber(int number) {
            return RawDocumentFileType.forNumber(number);
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
    return com.google.cloud.contentwarehouse.v1.DocumentProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RawDocumentFileType[] VALUES = values();

  public static RawDocumentFileType valueOf(
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

  private RawDocumentFileType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.contentwarehouse.v1.RawDocumentFileType)
}
