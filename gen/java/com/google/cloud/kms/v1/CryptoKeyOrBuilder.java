// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface CryptoKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CryptoKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name for this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name for this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. A copy of the "primary"
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that will be used
   * by [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] when this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] is given in
   * [EncryptRequest.name][google.cloud.kms.v1.EncryptRequest.name].
   * The [CryptoKey][google.cloud.kms.v1.CryptoKey]'s primary version can be
   * updated via
   * [UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion].
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * may have a primary. For other keys, this field will be omitted.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion primary = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the primary field is set.
   */
  boolean hasPrimary();
  /**
   * <pre>
   * Output only. A copy of the "primary"
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that will be used
   * by [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] when this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] is given in
   * [EncryptRequest.name][google.cloud.kms.v1.EncryptRequest.name].
   * The [CryptoKey][google.cloud.kms.v1.CryptoKey]'s primary version can be
   * updated via
   * [UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion].
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * may have a primary. For other keys, this field will be omitted.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion primary = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The primary.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion getPrimary();
  /**
   * <pre>
   * Output only. A copy of the "primary"
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that will be used
   * by [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] when this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] is given in
   * [EncryptRequest.name][google.cloud.kms.v1.EncryptRequest.name].
   * The [CryptoKey][google.cloud.kms.v1.CryptoKey]'s primary version can be
   * updated via
   * [UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion].
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * may have a primary. For other keys, this field will be omitted.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion primary = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getPrimaryOrBuilder();

  /**
   * <pre>
   * Immutable. The immutable purpose of this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose purpose = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for purpose.
   */
  int getPurposeValue();
  /**
   * <pre>
   * Immutable. The immutable purpose of this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose purpose = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The purpose.
   */
  com.google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose getPurpose();

  /**
   * <pre>
   * Output only. The time at which this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which this
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * At [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time],
   * the Key Management Service will automatically:
   * 1. Create a new version of this [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * 2. Mark the new version as primary.
   * Key rotations performed manually via
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion]
   * and
   * [UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion]
   * do not affect
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time].
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * support automatic rotation. For other keys, this field must be omitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp next_rotation_time = 7;</code>
   * @return Whether the nextRotationTime field is set.
   */
  boolean hasNextRotationTime();
  /**
   * <pre>
   * At [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time],
   * the Key Management Service will automatically:
   * 1. Create a new version of this [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * 2. Mark the new version as primary.
   * Key rotations performed manually via
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion]
   * and
   * [UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion]
   * do not affect
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time].
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * support automatic rotation. For other keys, this field must be omitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp next_rotation_time = 7;</code>
   * @return The nextRotationTime.
   */
  com.google.protobuf.Timestamp getNextRotationTime();
  /**
   * <pre>
   * At [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time],
   * the Key Management Service will automatically:
   * 1. Create a new version of this [CryptoKey][google.cloud.kms.v1.CryptoKey].
   * 2. Mark the new version as primary.
   * Key rotations performed manually via
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion]
   * and
   * [UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion]
   * do not affect
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time].
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * support automatic rotation. For other keys, this field must be omitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp next_rotation_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getNextRotationTimeOrBuilder();

  /**
   * <pre>
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time]
   * will be advanced by this period when the service automatically rotates a
   * key. Must be at least 24 hours and at most 876,000 hours.
   * If [rotation_period][google.cloud.kms.v1.CryptoKey.rotation_period] is
   * set,
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time]
   * must also be set.
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * support automatic rotation. For other keys, this field must be omitted.
   * </pre>
   *
   * <code>.google.protobuf.Duration rotation_period = 8;</code>
   * @return Whether the rotationPeriod field is set.
   */
  boolean hasRotationPeriod();
  /**
   * <pre>
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time]
   * will be advanced by this period when the service automatically rotates a
   * key. Must be at least 24 hours and at most 876,000 hours.
   * If [rotation_period][google.cloud.kms.v1.CryptoKey.rotation_period] is
   * set,
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time]
   * must also be set.
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * support automatic rotation. For other keys, this field must be omitted.
   * </pre>
   *
   * <code>.google.protobuf.Duration rotation_period = 8;</code>
   * @return The rotationPeriod.
   */
  com.google.protobuf.Duration getRotationPeriod();
  /**
   * <pre>
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time]
   * will be advanced by this period when the service automatically rotates a
   * key. Must be at least 24 hours and at most 876,000 hours.
   * If [rotation_period][google.cloud.kms.v1.CryptoKey.rotation_period] is
   * set,
   * [next_rotation_time][google.cloud.kms.v1.CryptoKey.next_rotation_time]
   * must also be set.
   * Keys with [purpose][google.cloud.kms.v1.CryptoKey.purpose]
   * [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT]
   * support automatic rotation. For other keys, this field must be omitted.
   * </pre>
   *
   * <code>.google.protobuf.Duration rotation_period = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getRotationPeriodOrBuilder();

  /**
   * <pre>
   * A template describing settings for new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] instances. The
   * properties of new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * instances created by either
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion]
   * or auto-rotation are controlled by this template.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersionTemplate version_template = 11;</code>
   * @return Whether the versionTemplate field is set.
   */
  boolean hasVersionTemplate();
  /**
   * <pre>
   * A template describing settings for new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] instances. The
   * properties of new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * instances created by either
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion]
   * or auto-rotation are controlled by this template.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersionTemplate version_template = 11;</code>
   * @return The versionTemplate.
   */
  com.google.cloud.kms.v1.CryptoKeyVersionTemplate getVersionTemplate();
  /**
   * <pre>
   * A template describing settings for new
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] instances. The
   * properties of new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * instances created by either
   * [CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion]
   * or auto-rotation are controlled by this template.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersionTemplate version_template = 11;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersionTemplateOrBuilder getVersionTemplateOrBuilder();

  /**
   * <pre>
   * Labels with user-defined metadata. For more information, see
   * [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels with user-defined metadata. For more information, see
   * [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels with user-defined metadata. For more information, see
   * [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels with user-defined metadata. For more information, see
   * [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Labels with user-defined metadata. For more information, see
   * [Labeling Keys](https://cloud.google.com/kms/docs/labeling-keys).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Immutable. Whether this key may contain imported versions only.
   * </pre>
   *
   * <code>bool import_only = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The importOnly.
   */
  boolean getImportOnly();

  /**
   * <pre>
   * Immutable. The period of time that versions of this key spend in the
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   * state before transitioning to
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * If not specified at creation time, the default duration is 24 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration destroy_scheduled_duration = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the destroyScheduledDuration field is set.
   */
  boolean hasDestroyScheduledDuration();
  /**
   * <pre>
   * Immutable. The period of time that versions of this key spend in the
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   * state before transitioning to
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * If not specified at creation time, the default duration is 24 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration destroy_scheduled_duration = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The destroyScheduledDuration.
   */
  com.google.protobuf.Duration getDestroyScheduledDuration();
  /**
   * <pre>
   * Immutable. The period of time that versions of this key spend in the
   * [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   * state before transitioning to
   * [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED].
   * If not specified at creation time, the default duration is 24 hours.
   * </pre>
   *
   * <code>.google.protobuf.Duration destroy_scheduled_duration = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.DurationOrBuilder getDestroyScheduledDurationOrBuilder();

  /**
   * <pre>
   * Immutable. The resource name of the backend environment where the key
   * material for all [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion]
   * associated with this [CryptoKey][google.cloud.kms.v1.CryptoKey] reside and
   * where all related cryptographic operations are performed. Only applicable
   * if [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] have a
   * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of
   * [EXTERNAL_VPC][CryptoKeyVersion.ProtectionLevel.EXTERNAL_VPC], with the
   * resource name in the format `projects/&#42;&#47;locations/&#42;&#47;ekmConnections/&#42;`.
   * Note, this list is non-exhaustive and may apply to additional
   * [ProtectionLevels][google.cloud.kms.v1.ProtectionLevel] in the future.
   * </pre>
   *
   * <code>string crypto_key_backend = 15 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The cryptoKeyBackend.
   */
  java.lang.String getCryptoKeyBackend();
  /**
   * <pre>
   * Immutable. The resource name of the backend environment where the key
   * material for all [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion]
   * associated with this [CryptoKey][google.cloud.kms.v1.CryptoKey] reside and
   * where all related cryptographic operations are performed. Only applicable
   * if [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] have a
   * [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] of
   * [EXTERNAL_VPC][CryptoKeyVersion.ProtectionLevel.EXTERNAL_VPC], with the
   * resource name in the format `projects/&#42;&#47;locations/&#42;&#47;ekmConnections/&#42;`.
   * Note, this list is non-exhaustive and may apply to additional
   * [ProtectionLevels][google.cloud.kms.v1.ProtectionLevel] in the future.
   * </pre>
   *
   * <code>string crypto_key_backend = 15 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for cryptoKeyBackend.
   */
  com.google.protobuf.ByteString
      getCryptoKeyBackendBytes();

  public com.google.cloud.kms.v1.CryptoKey.RotationScheduleCase getRotationScheduleCase();
}
