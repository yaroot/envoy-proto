// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/annotations.proto

package com.google.genomics.v1;

public interface UpdateAnnotationSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.UpdateAnnotationSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the annotation set to be updated.
   * </pre>
   *
   * <code>string annotation_set_id = 1;</code>
   * @return The annotationSetId.
   */
  java.lang.String getAnnotationSetId();
  /**
   * <pre>
   * The ID of the annotation set to be updated.
   * </pre>
   *
   * <code>string annotation_set_id = 1;</code>
   * @return The bytes for annotationSetId.
   */
  com.google.protobuf.ByteString
      getAnnotationSetIdBytes();

  /**
   * <pre>
   * The new annotation set.
   * </pre>
   *
   * <code>.google.genomics.v1.AnnotationSet annotation_set = 2;</code>
   * @return Whether the annotationSet field is set.
   */
  boolean hasAnnotationSet();
  /**
   * <pre>
   * The new annotation set.
   * </pre>
   *
   * <code>.google.genomics.v1.AnnotationSet annotation_set = 2;</code>
   * @return The annotationSet.
   */
  com.google.genomics.v1.AnnotationSet getAnnotationSet();
  /**
   * <pre>
   * The new annotation set.
   * </pre>
   *
   * <code>.google.genomics.v1.AnnotationSet annotation_set = 2;</code>
   */
  com.google.genomics.v1.AnnotationSetOrBuilder getAnnotationSetOrBuilder();

  /**
   * <pre>
   * An optional mask specifying which fields to update. Mutable fields are
   * [name][google.genomics.v1.AnnotationSet.name],
   * [source_uri][google.genomics.v1.AnnotationSet.source_uri], and
   * [info][google.genomics.v1.AnnotationSet.info]. If unspecified, all
   * mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * An optional mask specifying which fields to update. Mutable fields are
   * [name][google.genomics.v1.AnnotationSet.name],
   * [source_uri][google.genomics.v1.AnnotationSet.source_uri], and
   * [info][google.genomics.v1.AnnotationSet.info]. If unspecified, all
   * mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * An optional mask specifying which fields to update. Mutable fields are
   * [name][google.genomics.v1.AnnotationSet.name],
   * [source_uri][google.genomics.v1.AnnotationSet.source_uri], and
   * [info][google.genomics.v1.AnnotationSet.info]. If unspecified, all
   * mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}