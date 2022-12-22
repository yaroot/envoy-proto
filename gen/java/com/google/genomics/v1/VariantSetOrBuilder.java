// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface VariantSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.VariantSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The dataset to which this variant set belongs.
   * </pre>
   *
   * <code>string dataset_id = 1;</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * The dataset to which this variant set belongs.
   * </pre>
   *
   * <code>string dataset_id = 1;</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <pre>
   * The server-generated variant set ID, unique across all variant sets.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The server-generated variant set ID, unique across all variant sets.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The reference set to which the variant set is mapped. The reference set
   * describes the alignment provenance of the variant set, while the
   * `referenceBounds` describe the shape of the actual variant data. The
   * reference set's reference names are a superset of those found in the
   * `referenceBounds`.
   * For example, given a variant set that is mapped to the GRCh38 reference set
   * and contains a single variant on reference 'X', `referenceBounds` would
   * contain only an entry for 'X', while the associated reference set
   * enumerates all possible references: '1', '2', 'X', 'Y', 'MT', etc.
   * </pre>
   *
   * <code>string reference_set_id = 6;</code>
   * @return The referenceSetId.
   */
  java.lang.String getReferenceSetId();
  /**
   * <pre>
   * The reference set to which the variant set is mapped. The reference set
   * describes the alignment provenance of the variant set, while the
   * `referenceBounds` describe the shape of the actual variant data. The
   * reference set's reference names are a superset of those found in the
   * `referenceBounds`.
   * For example, given a variant set that is mapped to the GRCh38 reference set
   * and contains a single variant on reference 'X', `referenceBounds` would
   * contain only an entry for 'X', while the associated reference set
   * enumerates all possible references: '1', '2', 'X', 'Y', 'MT', etc.
   * </pre>
   *
   * <code>string reference_set_id = 6;</code>
   * @return The bytes for referenceSetId.
   */
  com.google.protobuf.ByteString
      getReferenceSetIdBytes();

  /**
   * <pre>
   * A list of all references used by the variants in a variant set
   * with associated coordinate upper bounds for each one.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReferenceBound reference_bounds = 5;</code>
   */
  java.util.List<com.google.genomics.v1.ReferenceBound> 
      getReferenceBoundsList();
  /**
   * <pre>
   * A list of all references used by the variants in a variant set
   * with associated coordinate upper bounds for each one.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReferenceBound reference_bounds = 5;</code>
   */
  com.google.genomics.v1.ReferenceBound getReferenceBounds(int index);
  /**
   * <pre>
   * A list of all references used by the variants in a variant set
   * with associated coordinate upper bounds for each one.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReferenceBound reference_bounds = 5;</code>
   */
  int getReferenceBoundsCount();
  /**
   * <pre>
   * A list of all references used by the variants in a variant set
   * with associated coordinate upper bounds for each one.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReferenceBound reference_bounds = 5;</code>
   */
  java.util.List<? extends com.google.genomics.v1.ReferenceBoundOrBuilder> 
      getReferenceBoundsOrBuilderList();
  /**
   * <pre>
   * A list of all references used by the variants in a variant set
   * with associated coordinate upper bounds for each one.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.ReferenceBound reference_bounds = 5;</code>
   */
  com.google.genomics.v1.ReferenceBoundOrBuilder getReferenceBoundsOrBuilder(
      int index);

  /**
   * <pre>
   * The metadata associated with this variant set.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.VariantSetMetadata metadata = 4;</code>
   */
  java.util.List<com.google.genomics.v1.VariantSetMetadata> 
      getMetadataList();
  /**
   * <pre>
   * The metadata associated with this variant set.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.VariantSetMetadata metadata = 4;</code>
   */
  com.google.genomics.v1.VariantSetMetadata getMetadata(int index);
  /**
   * <pre>
   * The metadata associated with this variant set.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.VariantSetMetadata metadata = 4;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * The metadata associated with this variant set.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.VariantSetMetadata metadata = 4;</code>
   */
  java.util.List<? extends com.google.genomics.v1.VariantSetMetadataOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <pre>
   * The metadata associated with this variant set.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.VariantSetMetadata metadata = 4;</code>
   */
  com.google.genomics.v1.VariantSetMetadataOrBuilder getMetadataOrBuilder(
      int index);

  /**
   * <pre>
   * User-specified, mutable name.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * User-specified, mutable name.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A textual description of this variant set.
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A textual description of this variant set.
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}