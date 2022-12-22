// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/paymentgateway/issuerswitch/v1/resolutions.proto

package com.google.cloud.paymentgateway.issuerswitch.v1;

public interface CaseDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.paymentgateway.issuerswitch.v1.CaseDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Details of original transaction.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.OriginalTransaction original_transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the originalTransaction field is set.
   */
  boolean hasOriginalTransaction();
  /**
   * <pre>
   * Required. Details of original transaction.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.OriginalTransaction original_transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The originalTransaction.
   */
  com.google.cloud.paymentgateway.issuerswitch.v1.OriginalTransaction getOriginalTransaction();
  /**
   * <pre>
   * Required. Details of original transaction.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.OriginalTransaction original_transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.paymentgateway.issuerswitch.v1.OriginalTransactionOrBuilder getOriginalTransactionOrBuilder();

  /**
   * <pre>
   * Required. Initiator of the complaint / dispute.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionSubType transaction_sub_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for transactionSubType.
   */
  int getTransactionSubTypeValue();
  /**
   * <pre>
   * Required. Initiator of the complaint / dispute.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.TransactionSubType transaction_sub_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The transactionSubType.
   */
  com.google.cloud.paymentgateway.issuerswitch.v1.TransactionSubType getTransactionSubType();

  /**
   * <pre>
   * Required. The adjustment amount in URCS for the complaint / dispute. This
   * maps to `reqAdjAmount` in complaint request.
   * </pre>
   *
   * <code>.google.type.Money amount = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <pre>
   * Required. The adjustment amount in URCS for the complaint / dispute. This
   * maps to `reqAdjAmount` in complaint request.
   * </pre>
   *
   * <code>.google.type.Money amount = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The amount.
   */
  com.google.type.Money getAmount();
  /**
   * <pre>
   * Required. The adjustment amount in URCS for the complaint / dispute. This
   * maps to `reqAdjAmount` in complaint request.
   * </pre>
   *
   * <code>.google.type.Money amount = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.MoneyOrBuilder getAmountOrBuilder();

  /**
   * <pre>
   * The original response code which has been updated in the complaint
   * Response. This should map to settlement response code currently available
   * in URCS system.
   * </pre>
   *
   * <code>string original_settlement_response_code = 4;</code>
   * @return The originalSettlementResponseCode.
   */
  java.lang.String getOriginalSettlementResponseCode();
  /**
   * <pre>
   * The original response code which has been updated in the complaint
   * Response. This should map to settlement response code currently available
   * in URCS system.
   * </pre>
   *
   * <code>string original_settlement_response_code = 4;</code>
   * @return The bytes for originalSettlementResponseCode.
   */
  com.google.protobuf.ByteString
      getOriginalSettlementResponseCodeBytes();

  /**
   * <pre>
   * Required. Set to true if the complaint / dispute belongs to current settlement cycle,
   * false otherwise.
   * </pre>
   *
   * <code>bool current_cycle = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The currentCycle.
   */
  boolean getCurrentCycle();
}