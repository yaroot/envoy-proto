// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UploadModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UploadModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location into which to upload the Model.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location into which to upload the Model.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The resource name of the model into which to upload the version. Only
   * specify this field when uploading a new version.
   * </pre>
   *
   * <code>string parent_model = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The parentModel.
   */
  java.lang.String getParentModel();
  /**
   * <pre>
   * Optional. The resource name of the model into which to upload the version. Only
   * specify this field when uploading a new version.
   * </pre>
   *
   * <code>string parent_model = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for parentModel.
   */
  com.google.protobuf.ByteString
      getParentModelBytes();

  /**
   * <pre>
   * Optional. The ID to use for the uploaded Model, which will become the final
   * component of the model resource name.
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <pre>
   * Optional. The ID to use for the uploaded Model, which will become the final
   * component of the model resource name.
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();

  /**
   * <pre>
   * Required. The Model to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Model model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * Required. The Model to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Model model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The model.
   */
  com.google.cloud.aiplatform.v1beta1.Model getModel();
  /**
   * <pre>
   * Required. The Model to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Model model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * Optional. The user-provided custom service account to use to do the model
   * upload. If empty, [Vertex AI Service
   * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
   * will be used. Users uploading the Model must have the
   * `iam.serviceAccounts.actAs` permission on this service account. Also, this
   * account must belong to the project specified in the `parent` field and have
   * all necessary read permissions.
   * </pre>
   *
   * <code>string service_account = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * Optional. The user-provided custom service account to use to do the model
   * upload. If empty, [Vertex AI Service
   * Agent](https://cloud.google.com/vertex-ai/docs/general/access-control#service-agents)
   * will be used. Users uploading the Model must have the
   * `iam.serviceAccounts.actAs` permission on this service account. Also, this
   * account must belong to the project specified in the `parent` field and have
   * all necessary read permissions.
   * </pre>
   *
   * <code>string service_account = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();
}