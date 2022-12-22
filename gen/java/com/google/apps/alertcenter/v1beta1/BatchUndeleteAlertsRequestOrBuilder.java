// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/alertcenter/v1beta1/alertcenter.proto

package com.google.apps.alertcenter.v1beta1;

public interface BatchUndeleteAlertsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.alertcenter.v1beta1.BatchUndeleteAlertsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The unique identifier of the Google Workspace organization
   * account of the customer the alerts are associated with.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Optional. The unique identifier of the Google Workspace organization
   * account of the customer the alerts are associated with.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. list of alert IDs.
   * </pre>
   *
   * <code>repeated string alert_id = 2;</code>
   * @return A list containing the alertId.
   */
  java.util.List<java.lang.String>
      getAlertIdList();
  /**
   * <pre>
   * Required. list of alert IDs.
   * </pre>
   *
   * <code>repeated string alert_id = 2;</code>
   * @return The count of alertId.
   */
  int getAlertIdCount();
  /**
   * <pre>
   * Required. list of alert IDs.
   * </pre>
   *
   * <code>repeated string alert_id = 2;</code>
   * @param index The index of the element to return.
   * @return The alertId at the given index.
   */
  java.lang.String getAlertId(int index);
  /**
   * <pre>
   * Required. list of alert IDs.
   * </pre>
   *
   * <code>repeated string alert_id = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the alertId at the given index.
   */
  com.google.protobuf.ByteString
      getAlertIdBytes(int index);
}