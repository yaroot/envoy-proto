// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface ParticipantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Participant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The unique identifier of this participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional. The unique identifier of this participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Immutable. The role this participant plays in the conversation. This field must be set
   * during participant creation and is then immutable.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <pre>
   * Immutable. The role this participant plays in the conversation. This field must be set
   * during participant creation and is then immutable.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The role.
   */
  com.google.cloud.dialogflow.v2.Participant.Role getRole();

  /**
   * <pre>
   * Optional. Label applied to streams representing this participant in SIPREC
   * XML metadata and SDP. This is used to assign transcriptions from that
   * media stream to this participant. This field can be updated.
   * </pre>
   *
   * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sipRecordingMediaLabel.
   */
  java.lang.String getSipRecordingMediaLabel();
  /**
   * <pre>
   * Optional. Label applied to streams representing this participant in SIPREC
   * XML metadata and SDP. This is used to assign transcriptions from that
   * media stream to this participant. This field can be updated.
   * </pre>
   *
   * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for sipRecordingMediaLabel.
   */
  com.google.protobuf.ByteString
      getSipRecordingMediaLabelBytes();

  /**
   * <pre>
   * Optional. Obfuscated user id that should be associated with the created participant.
   * You can specify a user id as follows:
   * 1. If you set this field in
   *    [CreateParticipantRequest][google.cloud.dialogflow.v2.CreateParticipantRequest.participant] or
   *    [UpdateParticipantRequest][google.cloud.dialogflow.v2.UpdateParticipantRequest.participant],
   *    Dialogflow adds the obfuscated user id with the participant.
   * 2. If you set this field in
   *    [AnalyzeContent][google.cloud.dialogflow.v2.AnalyzeContentRequest.obfuscated_external_user_id] or
   *    [StreamingAnalyzeContent][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest.obfuscated_external_user_id],
   *    Dialogflow will update [Participant.obfuscated_external_user_id][google.cloud.dialogflow.v2.Participant.obfuscated_external_user_id].
   * Dialogflow returns an error if you try to add a user id for a
   * non-[END_USER][google.cloud.dialogflow.v2.Participant.Role.END_USER] participant.
   * Dialogflow uses this user id for billing and measurement purposes. For
   * example, Dialogflow determines whether a user in one conversation returned
   * in a later conversation.
   * Note:
   * * Please never pass raw user ids to Dialogflow. Always obfuscate your user
   *   id first.
   * * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a
   *   hash function like SHA-512.
   * * The length of the user id must be &lt;= 256 characters.
   * </pre>
   *
   * <code>string obfuscated_external_user_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The obfuscatedExternalUserId.
   */
  java.lang.String getObfuscatedExternalUserId();
  /**
   * <pre>
   * Optional. Obfuscated user id that should be associated with the created participant.
   * You can specify a user id as follows:
   * 1. If you set this field in
   *    [CreateParticipantRequest][google.cloud.dialogflow.v2.CreateParticipantRequest.participant] or
   *    [UpdateParticipantRequest][google.cloud.dialogflow.v2.UpdateParticipantRequest.participant],
   *    Dialogflow adds the obfuscated user id with the participant.
   * 2. If you set this field in
   *    [AnalyzeContent][google.cloud.dialogflow.v2.AnalyzeContentRequest.obfuscated_external_user_id] or
   *    [StreamingAnalyzeContent][google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest.obfuscated_external_user_id],
   *    Dialogflow will update [Participant.obfuscated_external_user_id][google.cloud.dialogflow.v2.Participant.obfuscated_external_user_id].
   * Dialogflow returns an error if you try to add a user id for a
   * non-[END_USER][google.cloud.dialogflow.v2.Participant.Role.END_USER] participant.
   * Dialogflow uses this user id for billing and measurement purposes. For
   * example, Dialogflow determines whether a user in one conversation returned
   * in a later conversation.
   * Note:
   * * Please never pass raw user ids to Dialogflow. Always obfuscate your user
   *   id first.
   * * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a
   *   hash function like SHA-512.
   * * The length of the user id must be &lt;= 256 characters.
   * </pre>
   *
   * <code>string obfuscated_external_user_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for obfuscatedExternalUserId.
   */
  com.google.protobuf.ByteString
      getObfuscatedExternalUserIdBytes();

  /**
   * <pre>
   * Optional. Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getDocumentsMetadataFiltersCount();
  /**
   * <pre>
   * Optional. Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsDocumentsMetadataFilters(
      java.lang.String key);
  /**
   * Use {@link #getDocumentsMetadataFiltersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDocumentsMetadataFilters();
  /**
   * <pre>
   * Optional. Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDocumentsMetadataFiltersMap();
  /**
   * <pre>
   * Optional. Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getDocumentsMetadataFiltersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * ```
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getDocumentsMetadataFiltersOrThrow(
      java.lang.String key);
}
