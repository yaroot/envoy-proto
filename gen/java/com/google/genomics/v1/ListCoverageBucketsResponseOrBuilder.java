// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

public interface ListCoverageBucketsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.ListCoverageBucketsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The length of each coverage bucket in base pairs. Note that buckets at the
   * end of a reference sequence may be shorter. This value is omitted if the
   * bucket width is infinity (the default behaviour, with no range or
   * `targetBucketWidth`).
   * </pre>
   *
   * <code>int64 bucket_width = 1;</code>
   * @return The bucketWidth.
   */
  long getBucketWidth();

  /**
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   */
  java.util.List<com.google.genomics.v1.CoverageBucket> 
      getCoverageBucketsList();
  /**
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   */
  com.google.genomics.v1.CoverageBucket getCoverageBuckets(int index);
  /**
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   */
  int getCoverageBucketsCount();
  /**
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   */
  java.util.List<? extends com.google.genomics.v1.CoverageBucketOrBuilder> 
      getCoverageBucketsOrBuilderList();
  /**
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   */
  com.google.genomics.v1.CoverageBucketOrBuilder getCoverageBucketsOrBuilder(
      int index);

  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}