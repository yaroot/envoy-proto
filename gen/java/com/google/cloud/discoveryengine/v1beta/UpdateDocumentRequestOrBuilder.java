// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1beta/document_service.proto

package com.google.cloud.discoveryengine.v1beta;

public interface UpdateDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.UpdateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The document to update/create.
   * If the caller does not have permission to update the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   * If the [Document][google.cloud.discoveryengine.v1beta.Document] to update
   * does not exist and
   * [allow_missing][google.cloud.discoveryengine.v1beta.UpdateDocumentRequest.allow_missing]
   * is not set, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Document document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   * <pre>
   * Required. The document to update/create.
   * If the caller does not have permission to update the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   * If the [Document][google.cloud.discoveryengine.v1beta.Document] to update
   * does not exist and
   * [allow_missing][google.cloud.discoveryengine.v1beta.UpdateDocumentRequest.allow_missing]
   * is not set, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Document document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The document.
   */
  com.google.cloud.discoveryengine.v1beta.Document getDocument();
  /**
   * <pre>
   * Required. The document to update/create.
   * If the caller does not have permission to update the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   * If the [Document][google.cloud.discoveryengine.v1beta.Document] to update
   * does not exist and
   * [allow_missing][google.cloud.discoveryengine.v1beta.UpdateDocumentRequest.allow_missing]
   * is not set, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.Document document = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.discoveryengine.v1beta.DocumentOrBuilder getDocumentOrBuilder();

  /**
   * <pre>
   * If set to true, and the
   * [Document][google.cloud.discoveryengine.v1beta.Document] is not found, a
   * new [Document][google.cloud.discoveryengine.v1beta.Document] will be
   * created.
   * </pre>
   *
   * <code>bool allow_missing = 2;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}