// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface EntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.Entity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The representative name for the entity.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The representative name for the entity.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The entity type.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Entity.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The entity type.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Entity.Type type = 2;</code>
   * @return The type.
   */
  com.google.cloud.language.v1beta2.Entity.Type getType();

  /**
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The salience score associated with the entity in the [0, 1.0] range.
   * The salience score for an entity provides information about the
   * importance or centrality of that entity to the entire document text.
   * Scores closer to 0 are less salient, while scores closer to 1.0 are highly
   * salient.
   * </pre>
   *
   * <code>float salience = 4;</code>
   * @return The salience.
   */
  float getSalience();

  /**
   * <pre>
   * The mentions of this entity in the input document. The API currently
   * supports proper noun mentions.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.EntityMention mentions = 5;</code>
   */
  java.util.List<com.google.cloud.language.v1beta2.EntityMention> 
      getMentionsList();
  /**
   * <pre>
   * The mentions of this entity in the input document. The API currently
   * supports proper noun mentions.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.EntityMention mentions = 5;</code>
   */
  com.google.cloud.language.v1beta2.EntityMention getMentions(int index);
  /**
   * <pre>
   * The mentions of this entity in the input document. The API currently
   * supports proper noun mentions.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.EntityMention mentions = 5;</code>
   */
  int getMentionsCount();
  /**
   * <pre>
   * The mentions of this entity in the input document. The API currently
   * supports proper noun mentions.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.EntityMention mentions = 5;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1beta2.EntityMentionOrBuilder> 
      getMentionsOrBuilderList();
  /**
   * <pre>
   * The mentions of this entity in the input document. The API currently
   * supports proper noun mentions.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.EntityMention mentions = 5;</code>
   */
  com.google.cloud.language.v1beta2.EntityMentionOrBuilder getMentionsOrBuilder(
      int index);

  /**
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the aggregate sentiment expressed for this
   * entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 6;</code>
   * @return Whether the sentiment field is set.
   */
  boolean hasSentiment();
  /**
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the aggregate sentiment expressed for this
   * entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 6;</code>
   * @return The sentiment.
   */
  com.google.cloud.language.v1beta2.Sentiment getSentiment();
  /**
   * <pre>
   * For calls to [AnalyzeEntitySentiment][] or if
   * [AnnotateTextRequest.Features.extract_entity_sentiment][google.cloud.language.v1beta2.AnnotateTextRequest.Features.extract_entity_sentiment] is set to
   * true, this field will contain the aggregate sentiment expressed for this
   * entity in the provided document.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Sentiment sentiment = 6;</code>
   */
  com.google.cloud.language.v1beta2.SentimentOrBuilder getSentimentOrBuilder();
}
