// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

public interface ImportReadGroupSetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ImportReadGroupSetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @return A list containing the readGroupSetIds.
   */
  java.util.List<java.lang.String>
      getReadGroupSetIdsList();
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @return The count of readGroupSetIds.
   */
  int getReadGroupSetIdsCount();
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The readGroupSetIds at the given index.
   */
  java.lang.String getReadGroupSetIds(int index);
  /**
   * <pre>
   * IDs of the read group sets that were created.
   * </pre>
   *
   * <code>repeated string read_group_set_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the readGroupSetIds at the given index.
   */
  com.google.protobuf.ByteString
      getReadGroupSetIdsBytes(int index);
}