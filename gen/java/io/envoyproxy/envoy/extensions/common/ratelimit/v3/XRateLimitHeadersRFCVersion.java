// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/common/ratelimit/v3/ratelimit.proto

package io.envoyproxy.envoy.extensions.common.ratelimit.v3;

/**
 * <pre>
 * Defines the version of the standard to use for X-RateLimit headers.
 * </pre>
 *
 * Protobuf enum {@code envoy.extensions.common.ratelimit.v3.XRateLimitHeadersRFCVersion}
 */
public enum XRateLimitHeadersRFCVersion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * X-RateLimit headers disabled.
   * </pre>
   *
   * <code>OFF = 0;</code>
   */
  OFF(0),
  /**
   * <pre>
   * Use `draft RFC Version 03 &lt;https://tools.ietf.org/id/draft-polli-ratelimit-headers-03.html&gt;`_ where 3 headers will be added:
   * * ``X-RateLimit-Limit`` - indicates the request-quota associated to the
   *   client in the current time-window followed by the description of the
   *   quota policy. The value is returned by the maximum tokens of the token bucket.
   * * ``X-RateLimit-Remaining`` - indicates the remaining requests in the
   *   current time-window. The value is returned by the remaining tokens in the token bucket.
   * * ``X-RateLimit-Reset`` - indicates the number of seconds until reset of
   *   the current time-window. The value is returned by the remaining fill interval of the token bucket.
   * </pre>
   *
   * <code>DRAFT_VERSION_03 = 1;</code>
   */
  DRAFT_VERSION_03(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * X-RateLimit headers disabled.
   * </pre>
   *
   * <code>OFF = 0;</code>
   */
  public static final int OFF_VALUE = 0;
  /**
   * <pre>
   * Use `draft RFC Version 03 &lt;https://tools.ietf.org/id/draft-polli-ratelimit-headers-03.html&gt;`_ where 3 headers will be added:
   * * ``X-RateLimit-Limit`` - indicates the request-quota associated to the
   *   client in the current time-window followed by the description of the
   *   quota policy. The value is returned by the maximum tokens of the token bucket.
   * * ``X-RateLimit-Remaining`` - indicates the remaining requests in the
   *   current time-window. The value is returned by the remaining tokens in the token bucket.
   * * ``X-RateLimit-Reset`` - indicates the number of seconds until reset of
   *   the current time-window. The value is returned by the remaining fill interval of the token bucket.
   * </pre>
   *
   * <code>DRAFT_VERSION_03 = 1;</code>
   */
  public static final int DRAFT_VERSION_03_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static XRateLimitHeadersRFCVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static XRateLimitHeadersRFCVersion forNumber(int value) {
    switch (value) {
      case 0: return OFF;
      case 1: return DRAFT_VERSION_03;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<XRateLimitHeadersRFCVersion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      XRateLimitHeadersRFCVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<XRateLimitHeadersRFCVersion>() {
          public XRateLimitHeadersRFCVersion findValueByNumber(int number) {
            return XRateLimitHeadersRFCVersion.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.common.ratelimit.v3.RatelimitProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final XRateLimitHeadersRFCVersion[] VALUES = values();

  public static XRateLimitHeadersRFCVersion valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private XRateLimitHeadersRFCVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:envoy.extensions.common.ratelimit.v3.XRateLimitHeadersRFCVersion)
}
