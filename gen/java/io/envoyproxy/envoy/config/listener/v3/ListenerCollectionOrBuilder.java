// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/listener.proto

package io.envoyproxy.envoy.config.listener.v3;

public interface ListenerCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.listener.v3.ListenerCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .xds.core.v3.CollectionEntry entries = 1;</code>
   */
  java.util.List<com.github.xds.core.v3.CollectionEntry> 
      getEntriesList();
  /**
   * <code>repeated .xds.core.v3.CollectionEntry entries = 1;</code>
   */
  com.github.xds.core.v3.CollectionEntry getEntries(int index);
  /**
   * <code>repeated .xds.core.v3.CollectionEntry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .xds.core.v3.CollectionEntry entries = 1;</code>
   */
  java.util.List<? extends com.github.xds.core.v3.CollectionEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .xds.core.v3.CollectionEntry entries = 1;</code>
   */
  com.github.xds.core.v3.CollectionEntryOrBuilder getEntriesOrBuilder(
      int index);
}
