// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface BackendServiceCdnPolicyNegativeCachingPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
   * </pre>
   *
   * <code>optional int32 code = 3059181;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
   * </pre>
   *
   * <code>optional int32 code = 3059181;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * </pre>
   *
   * <code>optional int32 ttl = 115180;</code>
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   * <pre>
   * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * </pre>
   *
   * <code>optional int32 ttl = 115180;</code>
   * @return The ttl.
   */
  int getTtl();
}