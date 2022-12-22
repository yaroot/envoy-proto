// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

public interface DocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the document.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * The name is ignored when creating a document.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the document.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * The name is ignored when creating a document.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The reference ID set by customers. Must be unique per project and location.
   * </pre>
   *
   * <code>string reference_id = 11;</code>
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   * <pre>
   * The reference ID set by customers. Must be unique per project and location.
   * </pre>
   *
   * <code>string reference_id = 11;</code>
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString
      getReferenceIdBytes();

  /**
   * <pre>
   * Required. Display name of the document given by the user. This name will be displayed
   * in the UI.
   * Customer can populate this field with the name of the document. This
   * differs from the 'title' field as 'title' is optional and stores the top
   * heading in the document.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. Display name of the document given by the user. This name will be displayed
   * in the UI.
   * Customer can populate this field with the name of the document. This
   * differs from the 'title' field as 'title' is optional and stores the top
   * heading in the document.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Title that describes the document.
   * This is usually present in the top section of the document, and is a
   * mandatory field for the question-answering feature.
   * </pre>
   *
   * <code>string title = 18;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Title that describes the document.
   * This is usually present in the top section of the document, and is a
   * mandatory field for the question-answering feature.
   * </pre>
   *
   * <code>string title = 18;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Uri to display the document, for example, in the UI.
   * </pre>
   *
   * <code>string display_uri = 17;</code>
   * @return The displayUri.
   */
  java.lang.String getDisplayUri();
  /**
   * <pre>
   * Uri to display the document, for example, in the UI.
   * </pre>
   *
   * <code>string display_uri = 17;</code>
   * @return The bytes for displayUri.
   */
  com.google.protobuf.ByteString
      getDisplayUriBytes();

  /**
   * <pre>
   * The Document schema name.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>string document_schema_name = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The documentSchemaName.
   */
  java.lang.String getDocumentSchemaName();
  /**
   * <pre>
   * The Document schema name.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>string document_schema_name = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for documentSchemaName.
   */
  com.google.protobuf.ByteString
      getDocumentSchemaNameBytes();

  /**
   * <pre>
   * Other document format, such as PPTX, XLXS
   * </pre>
   *
   * <code>string plain_text = 15;</code>
   * @return Whether the plainText field is set.
   */
  boolean hasPlainText();
  /**
   * <pre>
   * Other document format, such as PPTX, XLXS
   * </pre>
   *
   * <code>string plain_text = 15;</code>
   * @return The plainText.
   */
  java.lang.String getPlainText();
  /**
   * <pre>
   * Other document format, such as PPTX, XLXS
   * </pre>
   *
   * <code>string plain_text = 15;</code>
   * @return The bytes for plainText.
   */
  com.google.protobuf.ByteString
      getPlainTextBytes();

  /**
   * <pre>
   * Document AI format to save the structured content, including OCR.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document cloud_ai_document = 4;</code>
   * @return Whether the cloudAiDocument field is set.
   */
  boolean hasCloudAiDocument();
  /**
   * <pre>
   * Document AI format to save the structured content, including OCR.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document cloud_ai_document = 4;</code>
   * @return The cloudAiDocument.
   */
  com.google.cloud.documentai.v1.Document getCloudAiDocument();
  /**
   * <pre>
   * Document AI format to save the structured content, including OCR.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document cloud_ai_document = 4;</code>
   */
  com.google.cloud.documentai.v1.DocumentOrBuilder getCloudAiDocumentOrBuilder();

  /**
   * <pre>
   * A path linked to structured content file.
   * </pre>
   *
   * <code>string structured_content_uri = 16;</code>
   * @return The structuredContentUri.
   */
  java.lang.String getStructuredContentUri();
  /**
   * <pre>
   * A path linked to structured content file.
   * </pre>
   *
   * <code>string structured_content_uri = 16;</code>
   * @return The bytes for structuredContentUri.
   */
  com.google.protobuf.ByteString
      getStructuredContentUriBytes();

  /**
   * <pre>
   * Raw document file in Cloud Storage path.
   * </pre>
   *
   * <code>string raw_document_path = 5;</code>
   * @return Whether the rawDocumentPath field is set.
   */
  boolean hasRawDocumentPath();
  /**
   * <pre>
   * Raw document file in Cloud Storage path.
   * </pre>
   *
   * <code>string raw_document_path = 5;</code>
   * @return The rawDocumentPath.
   */
  java.lang.String getRawDocumentPath();
  /**
   * <pre>
   * Raw document file in Cloud Storage path.
   * </pre>
   *
   * <code>string raw_document_path = 5;</code>
   * @return The bytes for rawDocumentPath.
   */
  com.google.protobuf.ByteString
      getRawDocumentPathBytes();

  /**
   * <pre>
   * Raw document content.
   * </pre>
   *
   * <code>bytes inline_raw_document = 6;</code>
   * @return Whether the inlineRawDocument field is set.
   */
  boolean hasInlineRawDocument();
  /**
   * <pre>
   * Raw document content.
   * </pre>
   *
   * <code>bytes inline_raw_document = 6;</code>
   * @return The inlineRawDocument.
   */
  com.google.protobuf.ByteString getInlineRawDocument();

  /**
   * <pre>
   * List of values that are user supplied metadata.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Property properties = 7;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.Property> 
      getPropertiesList();
  /**
   * <pre>
   * List of values that are user supplied metadata.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Property properties = 7;</code>
   */
  com.google.cloud.contentwarehouse.v1.Property getProperties(int index);
  /**
   * <pre>
   * List of values that are user supplied metadata.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Property properties = 7;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * List of values that are user supplied metadata.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Property properties = 7;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.PropertyOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <pre>
   * List of values that are user supplied metadata.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Property properties = 7;</code>
   */
  com.google.cloud.contentwarehouse.v1.PropertyOrBuilder getPropertiesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The time when the document is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time when the document is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time when the document is last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time when the document is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time when the document is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time when the document is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * This is used when DocAI was not used to load the document and parsing/
   * extracting is needed for the inline_raw_document.  For example, if
   * inline_raw_document is the byte representation of a PDF file, then
   * this should be set to: RAW_DOCUMENT_FILE_TYPE_PDF.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RawDocumentFileType raw_document_file_type = 10;</code>
   * @return The enum numeric value on the wire for rawDocumentFileType.
   */
  int getRawDocumentFileTypeValue();
  /**
   * <pre>
   * This is used when DocAI was not used to load the document and parsing/
   * extracting is needed for the inline_raw_document.  For example, if
   * inline_raw_document is the byte representation of a PDF file, then
   * this should be set to: RAW_DOCUMENT_FILE_TYPE_PDF.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RawDocumentFileType raw_document_file_type = 10;</code>
   * @return The rawDocumentFileType.
   */
  com.google.cloud.contentwarehouse.v1.RawDocumentFileType getRawDocumentFileType();

  /**
   * <pre>
   * If true, makes the document visible to asynchronous policies and rules.
   * </pre>
   *
   * <code>bool async_enabled = 12;</code>
   * @return The asyncEnabled.
   */
  boolean getAsyncEnabled();

  /**
   * <pre>
   * If true, text extraction will not be performed.
   * </pre>
   *
   * <code>bool text_extraction_disabled = 19;</code>
   * @return The textExtractionDisabled.
   */
  boolean getTextExtractionDisabled();

  /**
   * <pre>
   * The user who creates the document.
   * </pre>
   *
   * <code>string creator = 13;</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <pre>
   * The user who creates the document.
   * </pre>
   *
   * <code>string creator = 13;</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <pre>
   * The user who lastly updates the document.
   * </pre>
   *
   * <code>string updater = 14;</code>
   * @return The updater.
   */
  java.lang.String getUpdater();
  /**
   * <pre>
   * The user who lastly updates the document.
   * </pre>
   *
   * <code>string updater = 14;</code>
   * @return The bytes for updater.
   */
  com.google.protobuf.ByteString
      getUpdaterBytes();

  public com.google.cloud.contentwarehouse.v1.Document.StructuredContentCase getStructuredContentCase();

  public com.google.cloud.contentwarehouse.v1.Document.RawDocumentCase getRawDocumentCase();
}