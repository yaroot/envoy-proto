// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/paymentgateway/issuerswitch/v1/transactions.proto

package com.google.cloud.paymentgateway.issuerswitch.v1;

public interface ListMandateTransactionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.paymentgateway.issuerswitch.v1.ListMandateTransactionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource. The format is `projects/{project}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource. The format is `projects/{project}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of transactions to return. The service may return fewer
   * than this value. If unspecified or if the specified value is less than 1,
   * at most 50 transactions will be returned. The maximum value is 1000; values
   * above 1000 will be coerced to 1000. While paginating, you can specify a new
   * page size parameter for each page of transactions to be listed.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous `ListMandateTransactions` call.
   * Specify this parameter to retrieve the next page of transactions.
   * When paginating, you must specify only the `page_token` parameter. The
   * filter that was specified in the initial call to the
   * `ListMandateTransactions` method that returned the page token will be
   * reused for all further calls where the page token parameter is specified.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous `ListMandateTransactions` call.
   * Specify this parameter to retrieve the next page of transactions.
   * When paginating, you must specify only the `page_token` parameter. The
   * filter that was specified in the initial call to the
   * `ListMandateTransactions` method that returned the page token will be
   * reused for all further calls where the page token parameter is specified.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * An expression that filters the list of mandate transactions.
   * A filter expression consists of a field name, a comparison operator, and
   * a value for filtering. The value must be a string, a number, or a
   * boolean. The comparison operator must be one of: `&lt;`, `&gt;`, or `=`.
   * Filters are not case sensitive.
   * The following fields in the `Mandate` are eligible for
   * filtering:
   *   * `uniqueMandateNumber` - UPI Unique Mandate Number (UMN). Allowed
   *   comparison operators: `=`.
   *   * `transactionID` - The transaction ID of the mandate transaction.
   *   Allowed comparison operators: `=`.
   *   * `transactionType` - The transaction type of the mandate
   *   transaction. Must be one of [TransactionType][google.cloud.paymentgateway.issuerswitch.v1.TransactionType] values. For mandate
   *   transactions, only valid transaction types are
   *   `TRANSACTION_TYPE_CREATE`, `TRANSACTION_TYPE_REVOKE` and
   *   `TRANSACTION_TYPE_UPDATE`. Allowed comparison operators: `=`.
   *   * `payerVPA` - The VPA of the payer in a mandate transaction. Allowed
   *   comparison operators: `=`.
   *   * `payeeVPA` - The VPA of the payee in a mandate transaction. Allowed
   *   comparison operators: `=`.
   *   * `payeeMerchantID` - The merchant ID of the payee in a mandate
   *   transaction. Allowed comparison operators: `=`.
   *   * `payerMobileNumber` - The mobile number of the payer in a mandate
   *   transaction. Allowed comparison operators: `=`.
   *   * `payeeMobileNumber` - The mobile number of the payee in a mandate
   *   transaction. Allowed comparison operators: `=`.
   *   * `createTime` - The time at which the transaction was created
   *   (received) by the issuer switch. The value should be in
   *   the format `YYYY-MM-DDTHH:MM:SSZ`. Allowed comparison
   *   operators: `&gt;`, `&lt;`.
   *   * `state` - The state of the transaction. Must be one of
   *   [TransactionInfo.State][google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.State] values. Allowed comparison operators: `=`.
   *   * `recurrencePattern` - The recurrence pattern of the mandate. Must be
   *   one of [MandateTransaction.RecurrencePatternType][google.cloud.paymentgateway.issuerswitch.v1.MandateTransaction.RecurrencePatternType] values. Allowed
   *   comparison operators: `=`.
   *   * `startDate` - The start date of the mandate. The value should be in
   *   the format `YYYY-MM-DD`. Allowed comparison operators: `&lt;` and `&gt;`.
   *   * `endDate` - The end date of the mandate. The value should be in
   *   the format `YYYY-MM-DD`. Allowed comparison operators: `&lt;` and `&gt;`.
   *   * `errorCode` - Use this filter to list mandate transactions which
   *   have failed a particular error code. Allowed comparison
   *   operators: `=`.
   *   * `bankAdapterRequestID` - Request ID used when invoking the Bank
   *   Adapter API for fulfilling a transaction request. Allowed comparison
   *   operators: `=`.
   * You can combine multiple expressions by enclosing each expression in
   * parentheses. Expressions are combined with AND logic. No other logical
   * operators are supported.
   * Here are a few examples:
   *   * `recurrencePattern = MONTHLY` - The recurrence pattern type is
   *   monthly.
   *   * `state = SUCCEEDED` - The transaction's state is _SUCCEEDED_.
   *   * `payerVPA = example&#64;okbank` - The VPA of the payer is the string
   *   _example&#64;okbank_.
   *   * `(payerVPA = example&#64;okbank) AND (createTime &lt;
   *   "2021-08-15T14:50:00Z")`
   *   - The payer VPA example&#64;okbank and the transaction was received
   *   before _2021-08-15 14:50:00 UTC_.
   *   * `createTime &gt; "2021-08-15T14:50:00Z" AND createTime &lt;
   *   "2021-08-16T14:50:00Z"` - The transaction was received between
   *   _2021-08-15 14:50:00 UTC_ and _2021-08-16 14:50:00 UTC_.
   *   * `startDate &gt; "2021-08-15" AND startDate &lt; "2021-08-17"` - The start
   *   date for mandate is between _2021-08-15_ and _2021-08-17_.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * An expression that filters the list of mandate transactions.
   * A filter expression consists of a field name, a comparison operator, and
   * a value for filtering. The value must be a string, a number, or a
   * boolean. The comparison operator must be one of: `&lt;`, `&gt;`, or `=`.
   * Filters are not case sensitive.
   * The following fields in the `Mandate` are eligible for
   * filtering:
   *   * `uniqueMandateNumber` - UPI Unique Mandate Number (UMN). Allowed
   *   comparison operators: `=`.
   *   * `transactionID` - The transaction ID of the mandate transaction.
   *   Allowed comparison operators: `=`.
   *   * `transactionType` - The transaction type of the mandate
   *   transaction. Must be one of [TransactionType][google.cloud.paymentgateway.issuerswitch.v1.TransactionType] values. For mandate
   *   transactions, only valid transaction types are
   *   `TRANSACTION_TYPE_CREATE`, `TRANSACTION_TYPE_REVOKE` and
   *   `TRANSACTION_TYPE_UPDATE`. Allowed comparison operators: `=`.
   *   * `payerVPA` - The VPA of the payer in a mandate transaction. Allowed
   *   comparison operators: `=`.
   *   * `payeeVPA` - The VPA of the payee in a mandate transaction. Allowed
   *   comparison operators: `=`.
   *   * `payeeMerchantID` - The merchant ID of the payee in a mandate
   *   transaction. Allowed comparison operators: `=`.
   *   * `payerMobileNumber` - The mobile number of the payer in a mandate
   *   transaction. Allowed comparison operators: `=`.
   *   * `payeeMobileNumber` - The mobile number of the payee in a mandate
   *   transaction. Allowed comparison operators: `=`.
   *   * `createTime` - The time at which the transaction was created
   *   (received) by the issuer switch. The value should be in
   *   the format `YYYY-MM-DDTHH:MM:SSZ`. Allowed comparison
   *   operators: `&gt;`, `&lt;`.
   *   * `state` - The state of the transaction. Must be one of
   *   [TransactionInfo.State][google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.State] values. Allowed comparison operators: `=`.
   *   * `recurrencePattern` - The recurrence pattern of the mandate. Must be
   *   one of [MandateTransaction.RecurrencePatternType][google.cloud.paymentgateway.issuerswitch.v1.MandateTransaction.RecurrencePatternType] values. Allowed
   *   comparison operators: `=`.
   *   * `startDate` - The start date of the mandate. The value should be in
   *   the format `YYYY-MM-DD`. Allowed comparison operators: `&lt;` and `&gt;`.
   *   * `endDate` - The end date of the mandate. The value should be in
   *   the format `YYYY-MM-DD`. Allowed comparison operators: `&lt;` and `&gt;`.
   *   * `errorCode` - Use this filter to list mandate transactions which
   *   have failed a particular error code. Allowed comparison
   *   operators: `=`.
   *   * `bankAdapterRequestID` - Request ID used when invoking the Bank
   *   Adapter API for fulfilling a transaction request. Allowed comparison
   *   operators: `=`.
   * You can combine multiple expressions by enclosing each expression in
   * parentheses. Expressions are combined with AND logic. No other logical
   * operators are supported.
   * Here are a few examples:
   *   * `recurrencePattern = MONTHLY` - The recurrence pattern type is
   *   monthly.
   *   * `state = SUCCEEDED` - The transaction's state is _SUCCEEDED_.
   *   * `payerVPA = example&#64;okbank` - The VPA of the payer is the string
   *   _example&#64;okbank_.
   *   * `(payerVPA = example&#64;okbank) AND (createTime &lt;
   *   "2021-08-15T14:50:00Z")`
   *   - The payer VPA example&#64;okbank and the transaction was received
   *   before _2021-08-15 14:50:00 UTC_.
   *   * `createTime &gt; "2021-08-15T14:50:00Z" AND createTime &lt;
   *   "2021-08-16T14:50:00Z"` - The transaction was received between
   *   _2021-08-15 14:50:00 UTC_ and _2021-08-16 14:50:00 UTC_.
   *   * `startDate &gt; "2021-08-15" AND startDate &lt; "2021-08-17"` - The start
   *   date for mandate is between _2021-08-15_ and _2021-08-17_.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}