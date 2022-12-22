// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/metrics/v2/stats.proto

package io.envoyproxy.envoy.config.metrics.v2;

public interface TagSpecifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.metrics.v2.TagSpecifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Attaches an identifier to the tag values to identify the tag being in the
   * sink. Envoy has a set of default names and regexes to extract dynamic
   * portions of existing stats, which can be found in :repo:`well_known_names.h
   * &lt;source/common/config/well_known_names.h&gt;` in the Envoy repository. If a :ref:`tag_name
   * &lt;envoy_api_field_config.metrics.v2.TagSpecifier.tag_name&gt;` is provided in the config and
   * neither :ref:`regex &lt;envoy_api_field_config.metrics.v2.TagSpecifier.regex&gt;` or
   * :ref:`fixed_value &lt;envoy_api_field_config.metrics.v2.TagSpecifier.fixed_value&gt;` were specified,
   * Envoy will attempt to find that name in its set of defaults and use the accompanying regex.
   * .. note::
   *   It is invalid to specify the same tag name twice in a config.
   * </pre>
   *
   * <code>string tag_name = 1;</code>
   * @return The tagName.
   */
  java.lang.String getTagName();
  /**
   * <pre>
   * Attaches an identifier to the tag values to identify the tag being in the
   * sink. Envoy has a set of default names and regexes to extract dynamic
   * portions of existing stats, which can be found in :repo:`well_known_names.h
   * &lt;source/common/config/well_known_names.h&gt;` in the Envoy repository. If a :ref:`tag_name
   * &lt;envoy_api_field_config.metrics.v2.TagSpecifier.tag_name&gt;` is provided in the config and
   * neither :ref:`regex &lt;envoy_api_field_config.metrics.v2.TagSpecifier.regex&gt;` or
   * :ref:`fixed_value &lt;envoy_api_field_config.metrics.v2.TagSpecifier.fixed_value&gt;` were specified,
   * Envoy will attempt to find that name in its set of defaults and use the accompanying regex.
   * .. note::
   *   It is invalid to specify the same tag name twice in a config.
   * </pre>
   *
   * <code>string tag_name = 1;</code>
   * @return The bytes for tagName.
   */
  com.google.protobuf.ByteString
      getTagNameBytes();

  /**
   * <pre>
   * Designates a tag to strip from the tag extracted name and provide as a named
   * tag value for all statistics. This will only occur if any part of the name
   * matches the regex provided with one or more capture groups.
   * The first capture group identifies the portion of the name to remove. The
   * second capture group (which will normally be nested inside the first) will
   * designate the value of the tag for the statistic. If no second capture
   * group is provided, the first will also be used to set the value of the tag.
   * All other capture groups will be ignored.
   * Example 1. a stat name ``cluster.foo_cluster.upstream_rq_timeout`` and
   * one tag specifier:
   * .. code-block:: json
   *   {
   *     "tag_name": "envoy.cluster_name",
   *     "regex": "^cluster&#92;&#92;.((.+?)&#92;&#92;.)"
   *   }
   * Note that the regex will remove ``foo_cluster.`` making the tag extracted
   * name ``cluster.upstream_rq_timeout`` and the tag value for
   * ``envoy.cluster_name`` will be ``foo_cluster`` (note: there will be no
   * ``.`` character because of the second capture group).
   * Example 2. a stat name
   * ``http.connection_manager_1.user_agent.ios.downstream_cx_total`` and two
   * tag specifiers:
   * .. code-block:: json
   *   [
   *     {
   *       "tag_name": "envoy.http_user_agent",
   *       "regex": "^http(?=&#92;&#92;.).*?&#92;&#92;.user_agent&#92;&#92;.((.+?)&#92;&#92;.)&#92;&#92;w+?$"
   *     },
   *     {
   *       "tag_name": "envoy.http_conn_manager_prefix",
   *       "regex": "^http&#92;&#92;.((.*?)&#92;&#92;.)"
   *     }
   *   ]
   * The two regexes of the specifiers will be processed in the definition order.
   * The first regex will remove ``ios.``, leaving the tag extracted name
   * ``http.connection_manager_1.user_agent.downstream_cx_total``. The tag
   * ``envoy.http_user_agent`` will be added with tag value ``ios``.
   * The second regex will remove ``connection_manager_1.`` from the tag
   * extracted name produced by the first regex
   * ``http.connection_manager_1.user_agent.downstream_cx_total``, leaving
   * ``http.user_agent.downstream_cx_total`` as the tag extracted name. The tag
   * ``envoy.http_conn_manager_prefix`` will be added with the tag value
   * ``connection_manager_1``.
   * </pre>
   *
   * <code>string regex = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the regex field is set.
   */
  boolean hasRegex();
  /**
   * <pre>
   * Designates a tag to strip from the tag extracted name and provide as a named
   * tag value for all statistics. This will only occur if any part of the name
   * matches the regex provided with one or more capture groups.
   * The first capture group identifies the portion of the name to remove. The
   * second capture group (which will normally be nested inside the first) will
   * designate the value of the tag for the statistic. If no second capture
   * group is provided, the first will also be used to set the value of the tag.
   * All other capture groups will be ignored.
   * Example 1. a stat name ``cluster.foo_cluster.upstream_rq_timeout`` and
   * one tag specifier:
   * .. code-block:: json
   *   {
   *     "tag_name": "envoy.cluster_name",
   *     "regex": "^cluster&#92;&#92;.((.+?)&#92;&#92;.)"
   *   }
   * Note that the regex will remove ``foo_cluster.`` making the tag extracted
   * name ``cluster.upstream_rq_timeout`` and the tag value for
   * ``envoy.cluster_name`` will be ``foo_cluster`` (note: there will be no
   * ``.`` character because of the second capture group).
   * Example 2. a stat name
   * ``http.connection_manager_1.user_agent.ios.downstream_cx_total`` and two
   * tag specifiers:
   * .. code-block:: json
   *   [
   *     {
   *       "tag_name": "envoy.http_user_agent",
   *       "regex": "^http(?=&#92;&#92;.).*?&#92;&#92;.user_agent&#92;&#92;.((.+?)&#92;&#92;.)&#92;&#92;w+?$"
   *     },
   *     {
   *       "tag_name": "envoy.http_conn_manager_prefix",
   *       "regex": "^http&#92;&#92;.((.*?)&#92;&#92;.)"
   *     }
   *   ]
   * The two regexes of the specifiers will be processed in the definition order.
   * The first regex will remove ``ios.``, leaving the tag extracted name
   * ``http.connection_manager_1.user_agent.downstream_cx_total``. The tag
   * ``envoy.http_user_agent`` will be added with tag value ``ios``.
   * The second regex will remove ``connection_manager_1.`` from the tag
   * extracted name produced by the first regex
   * ``http.connection_manager_1.user_agent.downstream_cx_total``, leaving
   * ``http.user_agent.downstream_cx_total`` as the tag extracted name. The tag
   * ``envoy.http_conn_manager_prefix`` will be added with the tag value
   * ``connection_manager_1``.
   * </pre>
   *
   * <code>string regex = 2 [(.validate.rules) = { ... }</code>
   * @return The regex.
   */
  java.lang.String getRegex();
  /**
   * <pre>
   * Designates a tag to strip from the tag extracted name and provide as a named
   * tag value for all statistics. This will only occur if any part of the name
   * matches the regex provided with one or more capture groups.
   * The first capture group identifies the portion of the name to remove. The
   * second capture group (which will normally be nested inside the first) will
   * designate the value of the tag for the statistic. If no second capture
   * group is provided, the first will also be used to set the value of the tag.
   * All other capture groups will be ignored.
   * Example 1. a stat name ``cluster.foo_cluster.upstream_rq_timeout`` and
   * one tag specifier:
   * .. code-block:: json
   *   {
   *     "tag_name": "envoy.cluster_name",
   *     "regex": "^cluster&#92;&#92;.((.+?)&#92;&#92;.)"
   *   }
   * Note that the regex will remove ``foo_cluster.`` making the tag extracted
   * name ``cluster.upstream_rq_timeout`` and the tag value for
   * ``envoy.cluster_name`` will be ``foo_cluster`` (note: there will be no
   * ``.`` character because of the second capture group).
   * Example 2. a stat name
   * ``http.connection_manager_1.user_agent.ios.downstream_cx_total`` and two
   * tag specifiers:
   * .. code-block:: json
   *   [
   *     {
   *       "tag_name": "envoy.http_user_agent",
   *       "regex": "^http(?=&#92;&#92;.).*?&#92;&#92;.user_agent&#92;&#92;.((.+?)&#92;&#92;.)&#92;&#92;w+?$"
   *     },
   *     {
   *       "tag_name": "envoy.http_conn_manager_prefix",
   *       "regex": "^http&#92;&#92;.((.*?)&#92;&#92;.)"
   *     }
   *   ]
   * The two regexes of the specifiers will be processed in the definition order.
   * The first regex will remove ``ios.``, leaving the tag extracted name
   * ``http.connection_manager_1.user_agent.downstream_cx_total``. The tag
   * ``envoy.http_user_agent`` will be added with tag value ``ios``.
   * The second regex will remove ``connection_manager_1.`` from the tag
   * extracted name produced by the first regex
   * ``http.connection_manager_1.user_agent.downstream_cx_total``, leaving
   * ``http.user_agent.downstream_cx_total`` as the tag extracted name. The tag
   * ``envoy.http_conn_manager_prefix`` will be added with the tag value
   * ``connection_manager_1``.
   * </pre>
   *
   * <code>string regex = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for regex.
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  /**
   * <pre>
   * Specifies a fixed tag value for the ``tag_name``.
   * </pre>
   *
   * <code>string fixed_value = 3;</code>
   * @return Whether the fixedValue field is set.
   */
  boolean hasFixedValue();
  /**
   * <pre>
   * Specifies a fixed tag value for the ``tag_name``.
   * </pre>
   *
   * <code>string fixed_value = 3;</code>
   * @return The fixedValue.
   */
  java.lang.String getFixedValue();
  /**
   * <pre>
   * Specifies a fixed tag value for the ``tag_name``.
   * </pre>
   *
   * <code>string fixed_value = 3;</code>
   * @return The bytes for fixedValue.
   */
  com.google.protobuf.ByteString
      getFixedValueBytes();

  public io.envoyproxy.envoy.config.metrics.v2.TagSpecifier.TagValueCase getTagValueCase();
}