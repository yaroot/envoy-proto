// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CharsToIgnoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CharsToIgnore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Characters to not transform when masking.
   * </pre>
   *
   * <code>string characters_to_skip = 1;</code>
   * @return Whether the charactersToSkip field is set.
   */
  boolean hasCharactersToSkip();
  /**
   * <pre>
   * Characters to not transform when masking.
   * </pre>
   *
   * <code>string characters_to_skip = 1;</code>
   * @return The charactersToSkip.
   */
  java.lang.String getCharactersToSkip();
  /**
   * <pre>
   * Characters to not transform when masking.
   * </pre>
   *
   * <code>string characters_to_skip = 1;</code>
   * @return The bytes for charactersToSkip.
   */
  com.google.protobuf.ByteString
      getCharactersToSkipBytes();

  /**
   * <pre>
   * Common characters to not transform when masking. Useful to avoid removing
   * punctuation.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;</code>
   * @return Whether the commonCharactersToIgnore field is set.
   */
  boolean hasCommonCharactersToIgnore();
  /**
   * <pre>
   * Common characters to not transform when masking. Useful to avoid removing
   * punctuation.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;</code>
   * @return The enum numeric value on the wire for commonCharactersToIgnore.
   */
  int getCommonCharactersToIgnoreValue();
  /**
   * <pre>
   * Common characters to not transform when masking. Useful to avoid removing
   * punctuation.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore common_characters_to_ignore = 2;</code>
   * @return The commonCharactersToIgnore.
   */
  com.google.privacy.dlp.v2.CharsToIgnore.CommonCharsToIgnore getCommonCharactersToIgnore();

  public com.google.privacy.dlp.v2.CharsToIgnore.CharactersCase getCharactersCase();
}