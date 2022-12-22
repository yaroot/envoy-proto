// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v11.services;

public interface ConversionAdjustmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.ConversionAdjustment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * For adjustments, uniquely identifies a conversion that was reported
   * without an order ID specified. If the adjustment_type is ENHANCEMENT, this
   * value is optional but may be set in addition to the order_id.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.GclidDateTimePair gclid_date_time_pair = 12;</code>
   * @return Whether the gclidDateTimePair field is set.
   */
  boolean hasGclidDateTimePair();
  /**
   * <pre>
   * For adjustments, uniquely identifies a conversion that was reported
   * without an order ID specified. If the adjustment_type is ENHANCEMENT, this
   * value is optional but may be set in addition to the order_id.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.GclidDateTimePair gclid_date_time_pair = 12;</code>
   * @return The gclidDateTimePair.
   */
  com.google.ads.googleads.v11.services.GclidDateTimePair getGclidDateTimePair();
  /**
   * <pre>
   * For adjustments, uniquely identifies a conversion that was reported
   * without an order ID specified. If the adjustment_type is ENHANCEMENT, this
   * value is optional but may be set in addition to the order_id.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.GclidDateTimePair gclid_date_time_pair = 12;</code>
   */
  com.google.ads.googleads.v11.services.GclidDateTimePairOrBuilder getGclidDateTimePairOrBuilder();

  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here. The order ID is required for enhancements.
   * </pre>
   *
   * <code>optional string order_id = 13;</code>
   * @return Whether the orderId field is set.
   */
  boolean hasOrderId();
  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here. The order ID is required for enhancements.
   * </pre>
   *
   * <code>optional string order_id = 13;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here. The order ID is required for enhancements.
   * </pre>
   *
   * <code>optional string order_id = 13;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 8;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 8;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>optional string conversion_action = 8;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string adjustment_date_time = 9;</code>
   * @return Whether the adjustmentDateTime field is set.
   */
  boolean hasAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string adjustment_date_time = 9;</code>
   * @return The adjustmentDateTime.
   */
  java.lang.String getAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string adjustment_date_time = 9;</code>
   * @return The bytes for adjustmentDateTime.
   */
  com.google.protobuf.ByteString
      getAdjustmentDateTimeBytes();

  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   * @return The enum numeric value on the wire for adjustmentType.
   */
  int getAdjustmentTypeValue();
  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   * @return The adjustmentType.
   */
  com.google.ads.googleads.v11.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType getAdjustmentType();

  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * NOTE: If you want to upload a second restatement with a different adjusted
   * value, it must have a new, more recent, adjustment occurrence time.
   * Otherwise, it will be treated as a duplicate of the previous restatement
   * and ignored.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.RestatementValue restatement_value = 6;</code>
   * @return Whether the restatementValue field is set.
   */
  boolean hasRestatementValue();
  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * NOTE: If you want to upload a second restatement with a different adjusted
   * value, it must have a new, more recent, adjustment occurrence time.
   * Otherwise, it will be treated as a duplicate of the previous restatement
   * and ignored.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.RestatementValue restatement_value = 6;</code>
   * @return The restatementValue.
   */
  com.google.ads.googleads.v11.services.RestatementValue getRestatementValue();
  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * NOTE: If you want to upload a second restatement with a different adjusted
   * value, it must have a new, more recent, adjustment occurrence time.
   * Otherwise, it will be treated as a duplicate of the previous restatement
   * and ignored.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.RestatementValue restatement_value = 6;</code>
   */
  com.google.ads.googleads.v11.services.RestatementValueOrBuilder getRestatementValueOrBuilder();

  /**
   * <pre>
   * The user identifiers to enhance the original conversion.
   * ConversionAdjustmentUploadService only accepts user identifiers in
   * enhancements. The maximum number of user identifiers for each
   * enhancement is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.UserIdentifier user_identifiers = 10;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.UserIdentifier> 
      getUserIdentifiersList();
  /**
   * <pre>
   * The user identifiers to enhance the original conversion.
   * ConversionAdjustmentUploadService only accepts user identifiers in
   * enhancements. The maximum number of user identifiers for each
   * enhancement is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.UserIdentifier user_identifiers = 10;</code>
   */
  com.google.ads.googleads.v11.common.UserIdentifier getUserIdentifiers(int index);
  /**
   * <pre>
   * The user identifiers to enhance the original conversion.
   * ConversionAdjustmentUploadService only accepts user identifiers in
   * enhancements. The maximum number of user identifiers for each
   * enhancement is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.UserIdentifier user_identifiers = 10;</code>
   */
  int getUserIdentifiersCount();
  /**
   * <pre>
   * The user identifiers to enhance the original conversion.
   * ConversionAdjustmentUploadService only accepts user identifiers in
   * enhancements. The maximum number of user identifiers for each
   * enhancement is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.UserIdentifier user_identifiers = 10;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.UserIdentifierOrBuilder> 
      getUserIdentifiersOrBuilderList();
  /**
   * <pre>
   * The user identifiers to enhance the original conversion.
   * ConversionAdjustmentUploadService only accepts user identifiers in
   * enhancements. The maximum number of user identifiers for each
   * enhancement is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.UserIdentifier user_identifiers = 10;</code>
   */
  com.google.ads.googleads.v11.common.UserIdentifierOrBuilder getUserIdentifiersOrBuilder(
      int index);

  /**
   * <pre>
   * The user agent to enhance the original conversion. This can be found in
   * your user's HTTP request header when they convert on your web page.
   * Example, "Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X)". User
   * agent can only be specified in enhancements with user identifiers. This
   * should match the user agent of the request that sent the original
   * conversion so the conversion and its enhancement are either both attributed
   * as same-device or both attributed as cross-device.
   * </pre>
   *
   * <code>optional string user_agent = 11;</code>
   * @return Whether the userAgent field is set.
   */
  boolean hasUserAgent();
  /**
   * <pre>
   * The user agent to enhance the original conversion. This can be found in
   * your user's HTTP request header when they convert on your web page.
   * Example, "Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X)". User
   * agent can only be specified in enhancements with user identifiers. This
   * should match the user agent of the request that sent the original
   * conversion so the conversion and its enhancement are either both attributed
   * as same-device or both attributed as cross-device.
   * </pre>
   *
   * <code>optional string user_agent = 11;</code>
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   * <pre>
   * The user agent to enhance the original conversion. This can be found in
   * your user's HTTP request header when they convert on your web page.
   * Example, "Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X)". User
   * agent can only be specified in enhancements with user identifiers. This
   * should match the user agent of the request that sent the original
   * conversion so the conversion and its enhancement are either both attributed
   * as same-device or both attributed as cross-device.
   * </pre>
   *
   * <code>optional string user_agent = 11;</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();
}
