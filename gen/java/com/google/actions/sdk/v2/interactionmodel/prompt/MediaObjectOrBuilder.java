// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/prompt/content/static_media_prompt.proto

package com.google.actions.sdk.v2.interactionmodel.prompt;

public interface MediaObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.interactionmodel.prompt.MediaObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of this media object.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this media object.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Description of this media object.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of this media object.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The url pointing to the media content.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The url pointing to the media content.
   * </pre>
   *
   * <code>string url = 3;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Image to show with the media card.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.MediaImage image = 4;</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <pre>
   * Image to show with the media card.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.MediaImage image = 4;</code>
   * @return The image.
   */
  com.google.actions.sdk.v2.interactionmodel.prompt.MediaImage getImage();
  /**
   * <pre>
   * Image to show with the media card.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.interactionmodel.prompt.MediaImage image = 4;</code>
   */
  com.google.actions.sdk.v2.interactionmodel.prompt.MediaImageOrBuilder getImageOrBuilder();
}