// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DeidentifyConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DeidentifyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Treat the dataset as free-form text and apply the same free text
   * transformation everywhere.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoTypeTransformations info_type_transformations = 1;</code>
   * @return Whether the infoTypeTransformations field is set.
   */
  boolean hasInfoTypeTransformations();
  /**
   * <pre>
   * Treat the dataset as free-form text and apply the same free text
   * transformation everywhere.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoTypeTransformations info_type_transformations = 1;</code>
   * @return The infoTypeTransformations.
   */
  com.google.privacy.dlp.v2.InfoTypeTransformations getInfoTypeTransformations();
  /**
   * <pre>
   * Treat the dataset as free-form text and apply the same free text
   * transformation everywhere.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoTypeTransformations info_type_transformations = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeTransformationsOrBuilder getInfoTypeTransformationsOrBuilder();

  /**
   * <pre>
   * Treat the dataset as structured. Transformations can be applied to
   * specific locations within structured datasets, such as transforming
   * a column within a table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordTransformations record_transformations = 2;</code>
   * @return Whether the recordTransformations field is set.
   */
  boolean hasRecordTransformations();
  /**
   * <pre>
   * Treat the dataset as structured. Transformations can be applied to
   * specific locations within structured datasets, such as transforming
   * a column within a table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordTransformations record_transformations = 2;</code>
   * @return The recordTransformations.
   */
  com.google.privacy.dlp.v2.RecordTransformations getRecordTransformations();
  /**
   * <pre>
   * Treat the dataset as structured. Transformations can be applied to
   * specific locations within structured datasets, such as transforming
   * a column within a table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordTransformations record_transformations = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordTransformationsOrBuilder getRecordTransformationsOrBuilder();

  /**
   * <pre>
   * Treat the dataset as an image and redact.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageTransformations image_transformations = 4;</code>
   * @return Whether the imageTransformations field is set.
   */
  boolean hasImageTransformations();
  /**
   * <pre>
   * Treat the dataset as an image and redact.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageTransformations image_transformations = 4;</code>
   * @return The imageTransformations.
   */
  com.google.privacy.dlp.v2.ImageTransformations getImageTransformations();
  /**
   * <pre>
   * Treat the dataset as an image and redact.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ImageTransformations image_transformations = 4;</code>
   */
  com.google.privacy.dlp.v2.ImageTransformationsOrBuilder getImageTransformationsOrBuilder();

  /**
   * <pre>
   * Mode for handling transformation errors. If left unspecified, the default
   * mode is `TransformationErrorHandling.ThrowError`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationErrorHandling transformation_error_handling = 3;</code>
   * @return Whether the transformationErrorHandling field is set.
   */
  boolean hasTransformationErrorHandling();
  /**
   * <pre>
   * Mode for handling transformation errors. If left unspecified, the default
   * mode is `TransformationErrorHandling.ThrowError`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationErrorHandling transformation_error_handling = 3;</code>
   * @return The transformationErrorHandling.
   */
  com.google.privacy.dlp.v2.TransformationErrorHandling getTransformationErrorHandling();
  /**
   * <pre>
   * Mode for handling transformation errors. If left unspecified, the default
   * mode is `TransformationErrorHandling.ThrowError`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationErrorHandling transformation_error_handling = 3;</code>
   */
  com.google.privacy.dlp.v2.TransformationErrorHandlingOrBuilder getTransformationErrorHandlingOrBuilder();

  public com.google.privacy.dlp.v2.DeidentifyConfig.TransformationCase getTransformationCase();
}
