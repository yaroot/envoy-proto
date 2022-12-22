// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/references.proto

package com.google.genomics.v1;

public interface SearchReferenceSetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchReferenceSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If present, return reference sets for which the
   * [md5checksum][google.genomics.v1.ReferenceSet.md5checksum] matches exactly.
   * </pre>
   *
   * <code>repeated string md5checksums = 1;</code>
   * @return A list containing the md5checksums.
   */
  java.util.List<java.lang.String>
      getMd5ChecksumsList();
  /**
   * <pre>
   * If present, return reference sets for which the
   * [md5checksum][google.genomics.v1.ReferenceSet.md5checksum] matches exactly.
   * </pre>
   *
   * <code>repeated string md5checksums = 1;</code>
   * @return The count of md5checksums.
   */
  int getMd5ChecksumsCount();
  /**
   * <pre>
   * If present, return reference sets for which the
   * [md5checksum][google.genomics.v1.ReferenceSet.md5checksum] matches exactly.
   * </pre>
   *
   * <code>repeated string md5checksums = 1;</code>
   * @param index The index of the element to return.
   * @return The md5checksums at the given index.
   */
  java.lang.String getMd5Checksums(int index);
  /**
   * <pre>
   * If present, return reference sets for which the
   * [md5checksum][google.genomics.v1.ReferenceSet.md5checksum] matches exactly.
   * </pre>
   *
   * <code>repeated string md5checksums = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the md5checksums at the given index.
   */
  com.google.protobuf.ByteString
      getMd5ChecksumsBytes(int index);

  /**
   * <pre>
   * If present, return reference sets for which a prefix of any of
   * [sourceAccessions][google.genomics.v1.ReferenceSet.source_accessions]
   * match any of these strings. Accession numbers typically have a main number
   * and a version, for example `NC_000001.11`.
   * </pre>
   *
   * <code>repeated string accessions = 2;</code>
   * @return A list containing the accessions.
   */
  java.util.List<java.lang.String>
      getAccessionsList();
  /**
   * <pre>
   * If present, return reference sets for which a prefix of any of
   * [sourceAccessions][google.genomics.v1.ReferenceSet.source_accessions]
   * match any of these strings. Accession numbers typically have a main number
   * and a version, for example `NC_000001.11`.
   * </pre>
   *
   * <code>repeated string accessions = 2;</code>
   * @return The count of accessions.
   */
  int getAccessionsCount();
  /**
   * <pre>
   * If present, return reference sets for which a prefix of any of
   * [sourceAccessions][google.genomics.v1.ReferenceSet.source_accessions]
   * match any of these strings. Accession numbers typically have a main number
   * and a version, for example `NC_000001.11`.
   * </pre>
   *
   * <code>repeated string accessions = 2;</code>
   * @param index The index of the element to return.
   * @return The accessions at the given index.
   */
  java.lang.String getAccessions(int index);
  /**
   * <pre>
   * If present, return reference sets for which a prefix of any of
   * [sourceAccessions][google.genomics.v1.ReferenceSet.source_accessions]
   * match any of these strings. Accession numbers typically have a main number
   * and a version, for example `NC_000001.11`.
   * </pre>
   *
   * <code>repeated string accessions = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the accessions at the given index.
   */
  com.google.protobuf.ByteString
      getAccessionsBytes(int index);

  /**
   * <pre>
   * If present, return reference sets for which a substring of their
   * `assemblyId` matches this string (case insensitive).
   * </pre>
   *
   * <code>string assembly_id = 3;</code>
   * @return The assemblyId.
   */
  java.lang.String getAssemblyId();
  /**
   * <pre>
   * If present, return reference sets for which a substring of their
   * `assemblyId` matches this string (case insensitive).
   * </pre>
   *
   * <code>string assembly_id = 3;</code>
   * @return The bytes for assemblyId.
   */
  com.google.protobuf.ByteString
      getAssemblyIdBytes();

  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of results to return in a single page. If unspecified,
   * defaults to 1024. The maximum value is 4096.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   * @return The pageSize.
   */
  int getPageSize();
}