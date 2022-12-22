// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface HybridContentItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.HybridContentItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   * @return The item.
   */
  com.google.privacy.dlp.v2.ContentItem getItem();
  /**
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder();

  /**
   * <pre>
   * Supplementary information that will be added to each finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
   * @return Whether the findingDetails field is set.
   */
  boolean hasFindingDetails();
  /**
   * <pre>
   * Supplementary information that will be added to each finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
   * @return The findingDetails.
   */
  com.google.privacy.dlp.v2.HybridFindingDetails getFindingDetails();
  /**
   * <pre>
   * Supplementary information that will be added to each finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
   */
  com.google.privacy.dlp.v2.HybridFindingDetailsOrBuilder getFindingDetailsOrBuilder();
}