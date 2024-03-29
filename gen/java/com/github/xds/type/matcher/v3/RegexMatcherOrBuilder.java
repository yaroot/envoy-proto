// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/type/matcher/v3/regex.proto

package com.github.xds.type.matcher.v3;

public interface RegexMatcherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xds.type.matcher.v3.RegexMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Google's RE2 regex engine.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.RegexMatcher.GoogleRE2 google_re2 = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the googleRe2 field is set.
   */
  boolean hasGoogleRe2();
  /**
   * <pre>
   * Google's RE2 regex engine.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.RegexMatcher.GoogleRE2 google_re2 = 1 [(.validate.rules) = { ... }</code>
   * @return The googleRe2.
   */
  com.github.xds.type.matcher.v3.RegexMatcher.GoogleRE2 getGoogleRe2();
  /**
   * <pre>
   * Google's RE2 regex engine.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.RegexMatcher.GoogleRE2 google_re2 = 1 [(.validate.rules) = { ... }</code>
   */
  com.github.xds.type.matcher.v3.RegexMatcher.GoogleRE2OrBuilder getGoogleRe2OrBuilder();

  /**
   * <pre>
   * The regex match string. The string must be supported by the configured
   * engine.
   * </pre>
   *
   * <code>string regex = 2 [(.validate.rules) = { ... }</code>
   * @return The regex.
   */
  java.lang.String getRegex();
  /**
   * <pre>
   * The regex match string. The string must be supported by the configured
   * engine.
   * </pre>
   *
   * <code>string regex = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for regex.
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  public com.github.xds.type.matcher.v3.RegexMatcher.EngineTypeCase getEngineTypeCase();
}
