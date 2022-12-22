// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ExclusionRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ExclusionRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dictionary which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 1;</code>
   * @return Whether the dictionary field is set.
   */
  boolean hasDictionary();
  /**
   * <pre>
   * Dictionary which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 1;</code>
   * @return The dictionary.
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary getDictionary();
  /**
   * <pre>
   * Dictionary which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary dictionary = 1;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.DictionaryOrBuilder getDictionaryOrBuilder();

  /**
   * <pre>
   * Regular expression which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 2;</code>
   * @return Whether the regex field is set.
   */
  boolean hasRegex();
  /**
   * <pre>
   * Regular expression which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 2;</code>
   * @return The regex.
   */
  com.google.privacy.dlp.v2.CustomInfoType.Regex getRegex();
  /**
   * <pre>
   * Regular expression which defines the rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex regex = 2;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder getRegexOrBuilder();

  /**
   * <pre>
   * Set of infoTypes for which findings would affect this rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeInfoTypes exclude_info_types = 3;</code>
   * @return Whether the excludeInfoTypes field is set.
   */
  boolean hasExcludeInfoTypes();
  /**
   * <pre>
   * Set of infoTypes for which findings would affect this rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeInfoTypes exclude_info_types = 3;</code>
   * @return The excludeInfoTypes.
   */
  com.google.privacy.dlp.v2.ExcludeInfoTypes getExcludeInfoTypes();
  /**
   * <pre>
   * Set of infoTypes for which findings would affect this rule.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeInfoTypes exclude_info_types = 3;</code>
   */
  com.google.privacy.dlp.v2.ExcludeInfoTypesOrBuilder getExcludeInfoTypesOrBuilder();

  /**
   * <pre>
   * Drop if the hotword rule is contained in the proximate context. For
   * tabular data, the context includes the column name.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeByHotword exclude_by_hotword = 5;</code>
   * @return Whether the excludeByHotword field is set.
   */
  boolean hasExcludeByHotword();
  /**
   * <pre>
   * Drop if the hotword rule is contained in the proximate context. For
   * tabular data, the context includes the column name.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeByHotword exclude_by_hotword = 5;</code>
   * @return The excludeByHotword.
   */
  com.google.privacy.dlp.v2.ExcludeByHotword getExcludeByHotword();
  /**
   * <pre>
   * Drop if the hotword rule is contained in the proximate context. For
   * tabular data, the context includes the column name.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ExcludeByHotword exclude_by_hotword = 5;</code>
   */
  com.google.privacy.dlp.v2.ExcludeByHotwordOrBuilder getExcludeByHotwordOrBuilder();

  /**
   * <pre>
   * How the rule is applied, see MatchingType documentation for details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MatchingType matching_type = 4;</code>
   * @return The enum numeric value on the wire for matchingType.
   */
  int getMatchingTypeValue();
  /**
   * <pre>
   * How the rule is applied, see MatchingType documentation for details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.MatchingType matching_type = 4;</code>
   * @return The matchingType.
   */
  com.google.privacy.dlp.v2.MatchingType getMatchingType();

  public com.google.privacy.dlp.v2.ExclusionRule.TypeCase getTypeCase();
}
