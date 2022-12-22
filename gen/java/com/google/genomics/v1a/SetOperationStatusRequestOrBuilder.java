// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1alpha2/pipelines.proto

package com.google.genomics.v1a;

public interface SetOperationStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1alpha2.SetOperationStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string operation_id = 1;</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <code>string operation_id = 1;</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <code>repeated .google.genomics.v1alpha2.TimestampEvent timestamp_events = 2;</code>
   */
  java.util.List<com.google.genomics.v1a.TimestampEvent> 
      getTimestampEventsList();
  /**
   * <code>repeated .google.genomics.v1alpha2.TimestampEvent timestamp_events = 2;</code>
   */
  com.google.genomics.v1a.TimestampEvent getTimestampEvents(int index);
  /**
   * <code>repeated .google.genomics.v1alpha2.TimestampEvent timestamp_events = 2;</code>
   */
  int getTimestampEventsCount();
  /**
   * <code>repeated .google.genomics.v1alpha2.TimestampEvent timestamp_events = 2;</code>
   */
  java.util.List<? extends com.google.genomics.v1a.TimestampEventOrBuilder> 
      getTimestampEventsOrBuilderList();
  /**
   * <code>repeated .google.genomics.v1alpha2.TimestampEvent timestamp_events = 2;</code>
   */
  com.google.genomics.v1a.TimestampEventOrBuilder getTimestampEventsOrBuilder(
      int index);

  /**
   * <code>.google.rpc.Code error_code = 3;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <code>.google.rpc.Code error_code = 3;</code>
   * @return The errorCode.
   */
  com.google.rpc.Code getErrorCode();

  /**
   * <code>string error_message = 4;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>string error_message = 4;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <code>uint64 validation_token = 5;</code>
   * @return The validationToken.
   */
  long getValidationToken();
}