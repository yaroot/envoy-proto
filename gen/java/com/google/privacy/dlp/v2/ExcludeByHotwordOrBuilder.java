// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ExcludeByHotwordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ExcludeByHotword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Regular expression pattern defining what qualifies as a hotword.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
   * @return Whether the hotwordRegex field is set.
   */
  boolean hasHotwordRegex();
  /**
   * <pre>
   * Regular expression pattern defining what qualifies as a hotword.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
   * @return The hotwordRegex.
   */
  com.google.privacy.dlp.v2.CustomInfoType.Regex getHotwordRegex();
  /**
   * <pre>
   * Regular expression pattern defining what qualifies as a hotword.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder getHotwordRegexOrBuilder();

  /**
   * <pre>
   * Range of characters within which the entire hotword must reside.
   * The total length of the window cannot exceed 1000 characters.
   * The windowBefore property in proximity should be set to 1 if the hotword
   * needs to be included in a column header.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
   * @return Whether the proximity field is set.
   */
  boolean hasProximity();
  /**
   * <pre>
   * Range of characters within which the entire hotword must reside.
   * The total length of the window cannot exceed 1000 characters.
   * The windowBefore property in proximity should be set to 1 if the hotword
   * needs to be included in a column header.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
   * @return The proximity.
   */
  com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity getProximity();
  /**
   * <pre>
   * Range of characters within which the entire hotword must reside.
   * The total length of the window cannot exceed 1000 characters.
   * The windowBefore property in proximity should be set to 1 if the hotword
   * needs to be included in a column header.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.ProximityOrBuilder getProximityOrBuilder();
}