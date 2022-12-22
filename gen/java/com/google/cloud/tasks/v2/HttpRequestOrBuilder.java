// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/target.proto

package com.google.cloud.tasks.v2;

public interface HttpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.HttpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The full url path that the request will be sent to.
   * This string must begin with either "http://" or "https://". Some examples
   * are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will
   * encode some characters for safety and compatibility. The maximum allowed
   * URL length is 2083 characters after encoding.
   * The `Location` header response from a redirect response [`300` - `399`]
   * may be followed. The redirect is not counted as a separate attempt.
   * </pre>
   *
   * <code>string url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Required. The full url path that the request will be sent to.
   * This string must begin with either "http://" or "https://". Some examples
   * are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will
   * encode some characters for safety and compatibility. The maximum allowed
   * URL length is 2083 characters after encoding.
   * The `Location` header response from a redirect response [`300` - `399`]
   * may be followed. The redirect is not counted as a separate attempt.
   * </pre>
   *
   * <code>string url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The HTTP method to use for the request. The default is POST.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpMethod http_method = 2;</code>
   * @return The enum numeric value on the wire for httpMethod.
   */
  int getHttpMethodValue();
  /**
   * <pre>
   * The HTTP method to use for the request. The default is POST.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpMethod http_method = 2;</code>
   * @return The httpMethod.
   */
  com.google.cloud.tasks.v2.HttpMethod getHttpMethod();

  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   * These headers represent a subset of the headers that will accompany the
   * task's HTTP request. Some HTTP request headers will be ignored or replaced.
   * A partial list of headers that will be ignored or replaced is:
   * * Host: This will be computed by Cloud Tasks and derived from
   *   [HttpRequest.url][google.cloud.tasks.v2.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   * * `X-Google-*`: Google use only.
   * * `X-AppEngine-*`: Google use only.
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example, `Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`.
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   * The size of the headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   * These headers represent a subset of the headers that will accompany the
   * task's HTTP request. Some HTTP request headers will be ignored or replaced.
   * A partial list of headers that will be ignored or replaced is:
   * * Host: This will be computed by Cloud Tasks and derived from
   *   [HttpRequest.url][google.cloud.tasks.v2.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   * * `X-Google-*`: Google use only.
   * * `X-AppEngine-*`: Google use only.
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example, `Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`.
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   * The size of the headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   * These headers represent a subset of the headers that will accompany the
   * task's HTTP request. Some HTTP request headers will be ignored or replaced.
   * A partial list of headers that will be ignored or replaced is:
   * * Host: This will be computed by Cloud Tasks and derived from
   *   [HttpRequest.url][google.cloud.tasks.v2.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   * * `X-Google-*`: Google use only.
   * * `X-AppEngine-*`: Google use only.
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example, `Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`.
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   * The size of the headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   * These headers represent a subset of the headers that will accompany the
   * task's HTTP request. Some HTTP request headers will be ignored or replaced.
   * A partial list of headers that will be ignored or replaced is:
   * * Host: This will be computed by Cloud Tasks and derived from
   *   [HttpRequest.url][google.cloud.tasks.v2.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   * * `X-Google-*`: Google use only.
   * * `X-AppEngine-*`: Google use only.
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example, `Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`.
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   * The size of the headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  /* nullable */
java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   * These headers represent a subset of the headers that will accompany the
   * task's HTTP request. Some HTTP request headers will be ignored or replaced.
   * A partial list of headers that will be ignored or replaced is:
   * * Host: This will be computed by Cloud Tasks and derived from
   *   [HttpRequest.url][google.cloud.tasks.v2.HttpRequest.url].
   * * Content-Length: This will be computed by Cloud Tasks.
   * * User-Agent: This will be set to `"Google-Cloud-Tasks"`.
   * * `X-Google-*`: Google use only.
   * * `X-AppEngine-*`: Google use only.
   * `Content-Type` won't be set by Cloud Tasks. You can explicitly set
   * `Content-Type` to a media type when the
   *  [task is created][google.cloud.tasks.v2beta3.CloudTasks.CreateTask].
   *  For example, `Content-Type` can be set to `"application/octet-stream"` or
   *  `"application/json"`.
   * Headers which can have multiple values (according to RFC2616) can be
   * specified using comma-separated values.
   * The size of the headers must be less than 80KB.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 3;</code>
   */
  java.lang.String getHeadersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * HTTP request body.
   * A request body is allowed only if the
   * [HTTP method][google.cloud.tasks.v2.HttpRequest.http_method] is POST, PUT, or PATCH. It is an
   * error to set body on a task with an incompatible [HttpMethod][google.cloud.tasks.v2.HttpMethod].
   * </pre>
   *
   * <code>bytes body = 4;</code>
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();

  /**
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as an `Authorization` header in the HTTP
   * request.
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.OAuthToken oauth_token = 5;</code>
   * @return Whether the oauthToken field is set.
   */
  boolean hasOauthToken();
  /**
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as an `Authorization` header in the HTTP
   * request.
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.OAuthToken oauth_token = 5;</code>
   * @return The oauthToken.
   */
  com.google.cloud.tasks.v2.OAuthToken getOauthToken();
  /**
   * <pre>
   * If specified, an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2)
   * will be generated and attached as an `Authorization` header in the HTTP
   * request.
   * This type of authorization should generally only be used when calling
   * Google APIs hosted on *.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.OAuthToken oauth_token = 5;</code>
   */
  com.google.cloud.tasks.v2.OAuthTokenOrBuilder getOauthTokenOrBuilder();

  /**
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.OidcToken oidc_token = 6;</code>
   * @return Whether the oidcToken field is set.
   */
  boolean hasOidcToken();
  /**
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.OidcToken oidc_token = 6;</code>
   * @return The oidcToken.
   */
  com.google.cloud.tasks.v2.OidcToken getOidcToken();
  /**
   * <pre>
   * If specified, an
   * [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect)
   * token will be generated and attached as an `Authorization` header in the
   * HTTP request.
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.OidcToken oidc_token = 6;</code>
   */
  com.google.cloud.tasks.v2.OidcTokenOrBuilder getOidcTokenOrBuilder();

  public com.google.cloud.tasks.v2.HttpRequest.AuthorizationHeaderCase getAuthorizationHeaderCase();
}