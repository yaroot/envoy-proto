// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/app_yaml.proto

package com.google.appengine.v1beta;

public interface StaticFilesHandlerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1beta.StaticFilesHandler)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path to the static files matched by the URL pattern, from the
   * application root directory. The path can refer to text matched in groupings
   * in the URL pattern.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Path to the static files matched by the URL pattern, from the
   * application root directory. The path can refer to text matched in groupings
   * in the URL pattern.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Regular expression that matches the file paths for all files that should be
   * referenced by this handler.
   * </pre>
   *
   * <code>string upload_path_regex = 2;</code>
   * @return The uploadPathRegex.
   */
  java.lang.String getUploadPathRegex();
  /**
   * <pre>
   * Regular expression that matches the file paths for all files that should be
   * referenced by this handler.
   * </pre>
   *
   * <code>string upload_path_regex = 2;</code>
   * @return The bytes for uploadPathRegex.
   */
  com.google.protobuf.ByteString
      getUploadPathRegexBytes();

  /**
   * <pre>
   * HTTP headers to use for all responses from these URLs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; http_headers = 3;</code>
   */
  int getHttpHeadersCount();
  /**
   * <pre>
   * HTTP headers to use for all responses from these URLs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; http_headers = 3;</code>
   */
  boolean containsHttpHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHttpHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHttpHeaders();
  /**
   * <pre>
   * HTTP headers to use for all responses from these URLs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; http_headers = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHttpHeadersMap();
  /**
   * <pre>
   * HTTP headers to use for all responses from these URLs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; http_headers = 3;</code>
   */
  /* nullable */
java.lang.String getHttpHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * HTTP headers to use for all responses from these URLs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; http_headers = 3;</code>
   */
  java.lang.String getHttpHeadersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * MIME type used to serve all files served by this handler.
   * Defaults to file-specific MIME types, which are derived from each file's
   * filename extension.
   * </pre>
   *
   * <code>string mime_type = 4;</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * MIME type used to serve all files served by this handler.
   * Defaults to file-specific MIME types, which are derived from each file's
   * filename extension.
   * </pre>
   *
   * <code>string mime_type = 4;</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  /**
   * <pre>
   * Time a static file served by this handler should be cached
   * by web proxies and browsers.
   * </pre>
   *
   * <code>.google.protobuf.Duration expiration = 5;</code>
   * @return Whether the expiration field is set.
   */
  boolean hasExpiration();
  /**
   * <pre>
   * Time a static file served by this handler should be cached
   * by web proxies and browsers.
   * </pre>
   *
   * <code>.google.protobuf.Duration expiration = 5;</code>
   * @return The expiration.
   */
  com.google.protobuf.Duration getExpiration();
  /**
   * <pre>
   * Time a static file served by this handler should be cached
   * by web proxies and browsers.
   * </pre>
   *
   * <code>.google.protobuf.Duration expiration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getExpirationOrBuilder();

  /**
   * <pre>
   * Whether this handler should match the request if the file
   * referenced by the handler does not exist.
   * </pre>
   *
   * <code>bool require_matching_file = 6;</code>
   * @return The requireMatchingFile.
   */
  boolean getRequireMatchingFile();

  /**
   * <pre>
   * Whether files should also be uploaded as code data. By default, files
   * declared in static file handlers are uploaded as static
   * data and are only served to end users; they cannot be read by the
   * application. If enabled, uploads are charged against both your code and
   * static data storage resource quotas.
   * </pre>
   *
   * <code>bool application_readable = 7;</code>
   * @return The applicationReadable.
   */
  boolean getApplicationReadable();
}
