// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/actions_testing.proto

package com.google.actions.sdk.v2;

public interface MatchIntentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.MatchIntentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project being tested, indicated by the Project ID.
   * Format: projects/{project}
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Required. The project being tested, indicated by the Project ID.
   * Format: projects/{project}
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Required. User query as plain text.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required. User query as plain text.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Required. Locale to use to evaluate the query, such as "en".
   * The format should follow BCP 47: https://tools.ietf.org/html/bcp47
   * See the list of supported languages in
   * https://developers.google.com/assistant/console/languages-locales
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * Required. Locale to use to evaluate the query, such as "en".
   * The format should follow BCP 47: https://tools.ietf.org/html/bcp47
   * See the list of supported languages in
   * https://developers.google.com/assistant/console/languages-locales
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();
}
