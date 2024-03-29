// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/catalog_service.proto

package com.google.cloud.retail.v2alpha;

public interface AddCatalogAttributeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.AddCatalogAttributeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The attributesConfig.
   */
  java.lang.String getAttributesConfig();
  /**
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for attributesConfig.
   */
  com.google.protobuf.ByteString
      getAttributesConfigBytes();

  /**
   * <pre>
   * Required. The
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the catalogAttribute field is set.
   */
  boolean hasCatalogAttribute();
  /**
   * <pre>
   * Required. The
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The catalogAttribute.
   */
  com.google.cloud.retail.v2alpha.CatalogAttribute getCatalogAttribute();
  /**
   * <pre>
   * Required. The
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute] to add.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CatalogAttribute catalog_attribute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2alpha.CatalogAttributeOrBuilder getCatalogAttributeOrBuilder();
}
