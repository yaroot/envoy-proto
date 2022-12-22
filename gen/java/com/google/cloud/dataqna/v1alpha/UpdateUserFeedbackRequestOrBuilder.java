// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataqna/v1alpha/question_service.proto

package com.google.cloud.dataqna.v1alpha;

public interface UpdateUserFeedbackRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataqna.v1alpha.UpdateUserFeedbackRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The user feedback to update. This can be called even if there is no
   * user feedback so far.
   * The feedback's name field is used to identify the user feedback (and the
   * corresponding question) to update.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.UserFeedback user_feedback = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the userFeedback field is set.
   */
  boolean hasUserFeedback();
  /**
   * <pre>
   * Required. The user feedback to update. This can be called even if there is no
   * user feedback so far.
   * The feedback's name field is used to identify the user feedback (and the
   * corresponding question) to update.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.UserFeedback user_feedback = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userFeedback.
   */
  com.google.cloud.dataqna.v1alpha.UserFeedback getUserFeedback();
  /**
   * <pre>
   * Required. The user feedback to update. This can be called even if there is no
   * user feedback so far.
   * The feedback's name field is used to identify the user feedback (and the
   * corresponding question) to update.
   * </pre>
   *
   * <code>.google.cloud.dataqna.v1alpha.UserFeedback user_feedback = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataqna.v1alpha.UserFeedbackOrBuilder getUserFeedbackOrBuilder();

  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}