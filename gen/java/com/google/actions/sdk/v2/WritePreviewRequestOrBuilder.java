// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/actions_sdk.proto

package com.google.actions.sdk.v2;

public interface WritePreviewRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.WritePreviewRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource name in the format `projects/{project}`. The
   * `{project}` is the cloud project ID associated with the project.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource name in the format `projects/{project}`. The
   * `{project}` is the cloud project ID associated with the project.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * List of files sent to the server at a time. This is a list of config
   * files or data files.
   * 1. The first request must be a ConfigFiles.
   * 2. The first request must have a ConfigFile with 'settings'.
   * 3. The first request must have a ConfigFile with 'manifest'.
   * 4. The webhook ConfigFile corresponding to inline cloud function must be
   *    streamed before the DataFile corresponding to its source code.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.Files files = 5;</code>
   * @return Whether the files field is set.
   */
  boolean hasFiles();
  /**
   * <pre>
   * List of files sent to the server at a time. This is a list of config
   * files or data files.
   * 1. The first request must be a ConfigFiles.
   * 2. The first request must have a ConfigFile with 'settings'.
   * 3. The first request must have a ConfigFile with 'manifest'.
   * 4. The webhook ConfigFile corresponding to inline cloud function must be
   *    streamed before the DataFile corresponding to its source code.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.Files files = 5;</code>
   * @return The files.
   */
  com.google.actions.sdk.v2.Files getFiles();
  /**
   * <pre>
   * List of files sent to the server at a time. This is a list of config
   * files or data files.
   * 1. The first request must be a ConfigFiles.
   * 2. The first request must have a ConfigFile with 'settings'.
   * 3. The first request must have a ConfigFile with 'manifest'.
   * 4. The webhook ConfigFile corresponding to inline cloud function must be
   *    streamed before the DataFile corresponding to its source code.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.Files files = 5;</code>
   */
  com.google.actions.sdk.v2.FilesOrBuilder getFilesOrBuilder();

  /**
   * <pre>
   * Content sourced from the project draft.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.ContentFromDraft draft = 6;</code>
   * @return Whether the draft field is set.
   */
  boolean hasDraft();
  /**
   * <pre>
   * Content sourced from the project draft.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.ContentFromDraft draft = 6;</code>
   * @return The draft.
   */
  com.google.actions.sdk.v2.WritePreviewRequest.ContentFromDraft getDraft();
  /**
   * <pre>
   * Content sourced from the project draft.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.ContentFromDraft draft = 6;</code>
   */
  com.google.actions.sdk.v2.WritePreviewRequest.ContentFromDraftOrBuilder getDraftOrBuilder();

  /**
   * <pre>
   * Content sourced from the an exiting version.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.ContentFromSubmittedVersion submitted_version = 7;</code>
   * @return Whether the submittedVersion field is set.
   */
  boolean hasSubmittedVersion();
  /**
   * <pre>
   * Content sourced from the an exiting version.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.ContentFromSubmittedVersion submitted_version = 7;</code>
   * @return The submittedVersion.
   */
  com.google.actions.sdk.v2.WritePreviewRequest.ContentFromSubmittedVersion getSubmittedVersion();
  /**
   * <pre>
   * Content sourced from the an exiting version.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.ContentFromSubmittedVersion submitted_version = 7;</code>
   */
  com.google.actions.sdk.v2.WritePreviewRequest.ContentFromSubmittedVersionOrBuilder getSubmittedVersionOrBuilder();

  /**
   * <pre>
   * Required. The settings for updating the user's preview.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.PreviewSettings preview_settings = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the previewSettings field is set.
   */
  boolean hasPreviewSettings();
  /**
   * <pre>
   * Required. The settings for updating the user's preview.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.PreviewSettings preview_settings = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The previewSettings.
   */
  com.google.actions.sdk.v2.WritePreviewRequest.PreviewSettings getPreviewSettings();
  /**
   * <pre>
   * Required. The settings for updating the user's preview.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.WritePreviewRequest.PreviewSettings preview_settings = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.actions.sdk.v2.WritePreviewRequest.PreviewSettingsOrBuilder getPreviewSettingsOrBuilder();

  public com.google.actions.sdk.v2.WritePreviewRequest.SourceCase getSourceCase();
}