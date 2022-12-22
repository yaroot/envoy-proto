// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

public interface UpdateListingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.UpdateListingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Field mask specifies the fields to update in the listing resource. The
   * fields specified in the `updateMask` are relative to the resource and are
   * not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Field mask specifies the fields to update in the listing resource. The
   * fields specified in the `updateMask` are relative to the resource and are
   * not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Field mask specifies the fields to update in the listing resource. The
   * fields specified in the `updateMask` are relative to the resource and are
   * not a full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. The listing to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the listing field is set.
   */
  boolean hasListing();
  /**
   * <pre>
   * Required. The listing to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The listing.
   */
  com.google.cloud.bigquery.analyticshub.v1.Listing getListing();
  /**
   * <pre>
   * Required. The listing to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.analyticshub.v1.Listing listing = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.bigquery.analyticshub.v1.ListingOrBuilder getListingOrBuilder();
}