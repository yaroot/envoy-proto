// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/paymentgateway/issuerswitch/v1/resolutions.proto

package com.google.cloud.paymentgateway.issuerswitch.v1;

public interface RaiseComplaintAdjustmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The adjustment flag in URCS for the complaint transaction. This maps to
   * `reqAdjFlag` in complaint request and `respAdjFlag` in complaint response.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment.AdjustmentFlag adjustment_flag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for adjustmentFlag.
   */
  int getAdjustmentFlagValue();
  /**
   * <pre>
   * Required. The adjustment flag in URCS for the complaint transaction. This maps to
   * `reqAdjFlag` in complaint request and `respAdjFlag` in complaint response.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment.AdjustmentFlag adjustment_flag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adjustmentFlag.
   */
  com.google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment.AdjustmentFlag getAdjustmentFlag();

  /**
   * <pre>
   * Required. The adjustment code in URCS for the complaint transaction. This maps to
   * `reqAdjCode` in complaint request.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment.ReasonCode adjustment_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for adjustmentCode.
   */
  int getAdjustmentCodeValue();
  /**
   * <pre>
   * Required. The adjustment code in URCS for the complaint transaction. This maps to
   * `reqAdjCode` in complaint request.
   * </pre>
   *
   * <code>.google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment.ReasonCode adjustment_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adjustmentCode.
   */
  com.google.cloud.paymentgateway.issuerswitch.v1.RaiseComplaintAdjustment.ReasonCode getAdjustmentCode();
}