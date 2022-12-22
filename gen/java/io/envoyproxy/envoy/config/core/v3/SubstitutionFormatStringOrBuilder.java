// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/substitution_format_string.proto

package io.envoyproxy.envoy.config.core.v3;

public interface SubstitutionFormatStringOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.SubstitutionFormatString)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specify a format with command operators to form a text string.
   * Its details is described in :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * For example, setting ``text_format`` like below,
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   text_format: "%LOCAL_REPLY_BODY%:%RESPONSE_CODE%:path=%REQ(:path)%&#92;n"
   * generates plain text similar to:
   * .. code-block:: text
   *   upstream connect error:503:path=/foo
   * Deprecated in favor of :ref:`text_format_source &lt;envoy_v3_api_field_config.core.v3.SubstitutionFormatString.text_format_source&gt;`. To migrate text format strings, use the :ref:`inline_string &lt;envoy_v3_api_field_config.core.v3.DataSource.inline_string&gt;` field.
   * </pre>
   *
   * <code>string text_format = 1 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.config.core.v3.SubstitutionFormatString.text_format is deprecated.
   *     See envoy/config/core/v3/substitution_format_string.proto;l=45
   * @return Whether the textFormat field is set.
   */
  @java.lang.Deprecated boolean hasTextFormat();
  /**
   * <pre>
   * Specify a format with command operators to form a text string.
   * Its details is described in :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * For example, setting ``text_format`` like below,
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   text_format: "%LOCAL_REPLY_BODY%:%RESPONSE_CODE%:path=%REQ(:path)%&#92;n"
   * generates plain text similar to:
   * .. code-block:: text
   *   upstream connect error:503:path=/foo
   * Deprecated in favor of :ref:`text_format_source &lt;envoy_v3_api_field_config.core.v3.SubstitutionFormatString.text_format_source&gt;`. To migrate text format strings, use the :ref:`inline_string &lt;envoy_v3_api_field_config.core.v3.DataSource.inline_string&gt;` field.
   * </pre>
   *
   * <code>string text_format = 1 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.config.core.v3.SubstitutionFormatString.text_format is deprecated.
   *     See envoy/config/core/v3/substitution_format_string.proto;l=45
   * @return The textFormat.
   */
  @java.lang.Deprecated java.lang.String getTextFormat();
  /**
   * <pre>
   * Specify a format with command operators to form a text string.
   * Its details is described in :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * For example, setting ``text_format`` like below,
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   text_format: "%LOCAL_REPLY_BODY%:%RESPONSE_CODE%:path=%REQ(:path)%&#92;n"
   * generates plain text similar to:
   * .. code-block:: text
   *   upstream connect error:503:path=/foo
   * Deprecated in favor of :ref:`text_format_source &lt;envoy_v3_api_field_config.core.v3.SubstitutionFormatString.text_format_source&gt;`. To migrate text format strings, use the :ref:`inline_string &lt;envoy_v3_api_field_config.core.v3.DataSource.inline_string&gt;` field.
   * </pre>
   *
   * <code>string text_format = 1 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.config.core.v3.SubstitutionFormatString.text_format is deprecated.
   *     See envoy/config/core/v3/substitution_format_string.proto;l=45
   * @return The bytes for textFormat.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getTextFormatBytes();

  /**
   * <pre>
   * Specify a format with command operators to form a JSON string.
   * Its details is described in :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`.
   * Values are rendered as strings, numbers, or boolean values as appropriate.
   * Nested JSON objects may be produced by some command operators (e.g. FILTER_STATE or DYNAMIC_METADATA).
   * See the documentation for a specific command operator for details.
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   json_format:
   *     status: "%RESPONSE_CODE%"
   *     message: "%LOCAL_REPLY_BODY%"
   * The following JSON object would be created:
   * .. code-block:: json
   *  {
   *    "status": 500,
   *    "message": "My error message"
   *  }
   * </pre>
   *
   * <code>.google.protobuf.Struct json_format = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the jsonFormat field is set.
   */
  boolean hasJsonFormat();
  /**
   * <pre>
   * Specify a format with command operators to form a JSON string.
   * Its details is described in :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`.
   * Values are rendered as strings, numbers, or boolean values as appropriate.
   * Nested JSON objects may be produced by some command operators (e.g. FILTER_STATE or DYNAMIC_METADATA).
   * See the documentation for a specific command operator for details.
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   json_format:
   *     status: "%RESPONSE_CODE%"
   *     message: "%LOCAL_REPLY_BODY%"
   * The following JSON object would be created:
   * .. code-block:: json
   *  {
   *    "status": 500,
   *    "message": "My error message"
   *  }
   * </pre>
   *
   * <code>.google.protobuf.Struct json_format = 2 [(.validate.rules) = { ... }</code>
   * @return The jsonFormat.
   */
  com.google.protobuf.Struct getJsonFormat();
  /**
   * <pre>
   * Specify a format with command operators to form a JSON string.
   * Its details is described in :ref:`format dictionary&lt;config_access_log_format_dictionaries&gt;`.
   * Values are rendered as strings, numbers, or boolean values as appropriate.
   * Nested JSON objects may be produced by some command operators (e.g. FILTER_STATE or DYNAMIC_METADATA).
   * See the documentation for a specific command operator for details.
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   json_format:
   *     status: "%RESPONSE_CODE%"
   *     message: "%LOCAL_REPLY_BODY%"
   * The following JSON object would be created:
   * .. code-block:: json
   *  {
   *    "status": 500,
   *    "message": "My error message"
   *  }
   * </pre>
   *
   * <code>.google.protobuf.Struct json_format = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.StructOrBuilder getJsonFormatOrBuilder();

  /**
   * <pre>
   * Specify a format with command operators to form a text string.
   * Its details is described in :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * For example, setting ``text_format`` like below,
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   text_format_source:
   *     inline_string: "%LOCAL_REPLY_BODY%:%RESPONSE_CODE%:path=%REQ(:path)%&#92;n"
   * generates plain text similar to:
   * .. code-block:: text
   *   upstream connect error:503:path=/foo
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource text_format_source = 5;</code>
   * @return Whether the textFormatSource field is set.
   */
  boolean hasTextFormatSource();
  /**
   * <pre>
   * Specify a format with command operators to form a text string.
   * Its details is described in :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * For example, setting ``text_format`` like below,
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   text_format_source:
   *     inline_string: "%LOCAL_REPLY_BODY%:%RESPONSE_CODE%:path=%REQ(:path)%&#92;n"
   * generates plain text similar to:
   * .. code-block:: text
   *   upstream connect error:503:path=/foo
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource text_format_source = 5;</code>
   * @return The textFormatSource.
   */
  io.envoyproxy.envoy.config.core.v3.DataSource getTextFormatSource();
  /**
   * <pre>
   * Specify a format with command operators to form a text string.
   * Its details is described in :ref:`format string&lt;config_access_log_format_strings&gt;`.
   * For example, setting ``text_format`` like below,
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   text_format_source:
   *     inline_string: "%LOCAL_REPLY_BODY%:%RESPONSE_CODE%:path=%REQ(:path)%&#92;n"
   * generates plain text similar to:
   * .. code-block:: text
   *   upstream connect error:503:path=/foo
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource text_format_source = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getTextFormatSourceOrBuilder();

  /**
   * <pre>
   * If set to true, when command operators are evaluated to null,
   * * for ``text_format``, the output of the empty operator is changed from ``-`` to an
   *   empty string, so that empty values are omitted entirely.
   * * for ``json_format`` the keys with null values are omitted in the output structure.
   * </pre>
   *
   * <code>bool omit_empty_values = 3;</code>
   * @return The omitEmptyValues.
   */
  boolean getOmitEmptyValues();

  /**
   * <pre>
   * Specify a ``content_type`` field.
   * If this field is not set then ``text/plain`` is used for ``text_format`` and
   * ``application/json`` is used for ``json_format``.
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   content_type: "text/html; charset=UTF-8"
   * </pre>
   *
   * <code>string content_type = 4 [(.validate.rules) = { ... }</code>
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   * <pre>
   * Specify a ``content_type`` field.
   * If this field is not set then ``text/plain`` is used for ``text_format`` and
   * ``application/json`` is used for ``json_format``.
   * .. validated-code-block:: yaml
   *   :type-name: envoy.config.core.v3.SubstitutionFormatString
   *   content_type: "text/html; charset=UTF-8"
   * </pre>
   *
   * <code>string content_type = 4 [(.validate.rules) = { ... }</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <pre>
   * Specifies a collection of Formatter plugins that can be called from the access log configuration.
   * See the formatters extensions documentation for details.
   * [#extension-category: envoy.formatter]
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.TypedExtensionConfig formatters = 6;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig> 
      getFormattersList();
  /**
   * <pre>
   * Specifies a collection of Formatter plugins that can be called from the access log configuration.
   * See the formatters extensions documentation for details.
   * [#extension-category: envoy.formatter]
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.TypedExtensionConfig formatters = 6;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getFormatters(int index);
  /**
   * <pre>
   * Specifies a collection of Formatter plugins that can be called from the access log configuration.
   * See the formatters extensions documentation for details.
   * [#extension-category: envoy.formatter]
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.TypedExtensionConfig formatters = 6;</code>
   */
  int getFormattersCount();
  /**
   * <pre>
   * Specifies a collection of Formatter plugins that can be called from the access log configuration.
   * See the formatters extensions documentation for details.
   * [#extension-category: envoy.formatter]
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.TypedExtensionConfig formatters = 6;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder> 
      getFormattersOrBuilderList();
  /**
   * <pre>
   * Specifies a collection of Formatter plugins that can be called from the access log configuration.
   * See the formatters extensions documentation for details.
   * [#extension-category: envoy.formatter]
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.TypedExtensionConfig formatters = 6;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder getFormattersOrBuilder(
      int index);

  public io.envoyproxy.envoy.config.core.v3.SubstitutionFormatString.FormatCase getFormatCase();
}