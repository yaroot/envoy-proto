// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface BackendBucketCdnPolicyCacheKeyPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendBucketCdnPolicyCacheKeyPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @return A list containing the includeHttpHeaders.
   */
  java.util.List<java.lang.String>
      getIncludeHttpHeadersList();
  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @return The count of includeHttpHeaders.
   */
  int getIncludeHttpHeadersCount();
  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @param index The index of the element to return.
   * @return The includeHttpHeaders at the given index.
   */
  java.lang.String getIncludeHttpHeaders(int index);
  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @param index The index of the value to return.
   * @return The bytes of the includeHttpHeaders at the given index.
   */
  com.google.protobuf.ByteString
      getIncludeHttpHeadersBytes(int index);

  /**
   * <pre>
   * Names of query string parameters to include in cache keys. Default parameters are always included. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @return A list containing the queryStringWhitelist.
   */
  java.util.List<java.lang.String>
      getQueryStringWhitelistList();
  /**
   * <pre>
   * Names of query string parameters to include in cache keys. Default parameters are always included. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @return The count of queryStringWhitelist.
   */
  int getQueryStringWhitelistCount();
  /**
   * <pre>
   * Names of query string parameters to include in cache keys. Default parameters are always included. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @param index The index of the element to return.
   * @return The queryStringWhitelist at the given index.
   */
  java.lang.String getQueryStringWhitelist(int index);
  /**
   * <pre>
   * Names of query string parameters to include in cache keys. Default parameters are always included. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @param index The index of the value to return.
   * @return The bytes of the queryStringWhitelist at the given index.
   */
  com.google.protobuf.ByteString
      getQueryStringWhitelistBytes(int index);
}