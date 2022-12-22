// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface ListNoteOccurrencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ListNoteOccurrencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<io.grafeas.v1.Occurrence> 
      getOccurrencesList();
  /**
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.Occurrence getOccurrences(int index);
  /**
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  int getOccurrencesCount();
  /**
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1.OccurrenceOrBuilder> 
      getOccurrencesOrBuilderList();
  /**
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.OccurrenceOrBuilder getOccurrencesOrBuilder(
      int index);

  /**
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}