// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/customer_asset_set_service.proto

package com.google.ads.googleads.v12.services;

public interface CustomerAssetSetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.CustomerAssetSetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer asset
   * set.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomerAssetSet create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer asset
   * set.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomerAssetSet create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v12.resources.CustomerAssetSet getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer asset
   * set.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomerAssetSet create = 1;</code>
   */
  com.google.ads.googleads.v12.resources.CustomerAssetSetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed customer asset set is
   * expected, in this format:
   * `customers/{customer_id}/customerAssetSets/{asset_set_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customer asset set is
   * expected, in this format:
   * `customers/{customer_id}/customerAssetSets/{asset_set_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customer asset set is
   * expected, in this format:
   * `customers/{customer_id}/customerAssetSets/{asset_set_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v12.services.CustomerAssetSetOperation.OperationCase getOperationCase();
}