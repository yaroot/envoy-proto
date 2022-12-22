# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/paymentgateway/issuerswitch/v1/transactions.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.paymentgateway.issuerswitch.v1 import common_fields_pb2 as google_dot_cloud_dot_paymentgateway_dot_issuerswitch_dot_v1_dot_common__fields__pb2
from google.cloud.paymentgateway.issuerswitch.v1 import resolutions_pb2 as google_dot_cloud_dot_paymentgateway_dot_issuerswitch_dot_v1_dot_resolutions__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import date_pb2 as google_dot_type_dot_date__pb2
from google.type import money_pb2 as google_dot_type_dot_money__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/cloud/paymentgateway/issuerswitch/v1/transactions.proto\x12+google.cloud.paymentgateway.issuerswitch.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a?google/cloud/paymentgateway/issuerswitch/v1/common_fields.proto\x1a=google/cloud/paymentgateway/issuerswitch/v1/resolutions.proto\x1a#google/longrunning/operations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x16google/type/date.proto\x1a\x17google/type/money.proto\"\xb4\x06\n\x0fTransactionInfo\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12K\n\x08\x61pi_type\x18\x02 \x01(\x0e\x32\x34.google.cloud.paymentgateway.issuerswitch.v1.ApiTypeB\x03\xe0\x41\x03\x12[\n\x10transaction_type\x18\x03 \x01(\x0e\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionTypeB\x03\xe0\x41\x03\x12r\n\x14transaction_sub_type\x18\x04 \x01(\x0e\x32O.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.TransactionSubTypeB\x03\xe0\x41\x03\x12V\n\x05state\x18\x05 \x01(\x0e\x32\x42.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo.StateB\x03\xe0\x41\x03\x12\x17\n\nerror_code\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12\x1a\n\rerror_message\x18\x07 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12%\n\x18\x62\x61nk_adapter_request_ids\x18\n \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0eupi_error_code\x18\x0b \x01(\tB\x03\xe0\x41\x03\"9\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tSUCCEEDED\x10\x01\x12\n\n\x06\x46\x41ILED\x10\x02\"z\n\x12TransactionSubType\x12$\n TRANSACTION_SUB_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x43OLLECT\x10\x01\x12\t\n\x05\x44\x45\x42IT\x10\x02\x12\x07\n\x03PAY\x10\x03\x12\x0f\n\x0b\x42\x45NEFICIARY\x10\x04\x12\x0c\n\x08REMITTER\x10\x05\"\xf5\x01\n\x13MetadataTransaction\x12\x0c\n\x04name\x18\x01 \x01(\t\x12J\n\x04info\x18\x02 \x01(\x0b\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo\x12\x17\n\norigin_vpa\x18\x03 \x01(\tB\x03\xe0\x41\x03:k\xea\x41h\n/issuerswitch.googleapis.com/MetadataTransaction\x12\x35projects/{project}/metadataTransactions/{transaction}\"\xe1\x03\n\x14\x46inancialTransaction\x12\x0c\n\x04name\x18\x01 \x01(\t\x12J\n\x04info\x18\x02 \x01(\x0b\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo\x12\'\n\x1aretrieval_reference_number\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12V\n\x05payer\x18\x04 \x01(\x0b\x32\x42.google.cloud.paymentgateway.issuerswitch.v1.SettlementParticipantB\x03\xe0\x41\x03\x12V\n\x05payee\x18\x05 \x01(\x0b\x32\x42.google.cloud.paymentgateway.issuerswitch.v1.SettlementParticipantB\x03\xe0\x41\x03\x12\'\n\x06\x61mount\x18\x06 \x01(\x0b\x32\x12.google.type.MoneyB\x03\xe0\x41\x03:m\xea\x41j\n0issuerswitch.googleapis.com/FinancialTransaction\x12\x36projects/{project}/financialTransactions/{transaction}\"\x89\x0b\n\x12MandateTransaction\x12\x0c\n\x04name\x18\x01 \x01(\t\x12V\n\x10transaction_info\x18\x02 \x01(\x0b\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo\x12\"\n\x15unique_mandate_number\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\tpayer_vpa\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\tpayee_vpa\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x1e\n\x11payee_merchant_id\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12 \n\x13payer_mobile_number\x18\x07 \x01(\tB\x03\xe0\x41\x03\x12 \n\x13payee_mobile_number\x18\x08 \x01(\tB\x03\xe0\x41\x03\x12v\n\x12recurrence_pattern\x18\t \x01(\x0e\x32U.google.cloud.paymentgateway.issuerswitch.v1.MandateTransaction.RecurrencePatternTypeB\x03\xe0\x41\x03\x12u\n\x14recurrence_rule_type\x18\n \x01(\x0e\x32R.google.cloud.paymentgateway.issuerswitch.v1.MandateTransaction.RecurrenceRuleTypeB\x03\xe0\x41\x03\x12\"\n\x15recurrence_rule_value\x18\x0b \x01(\x05\x42\x03\xe0\x41\x03\x12*\n\nstart_date\x18\x0c \x01(\x0b\x32\x11.google.type.DateB\x03\xe0\x41\x03\x12(\n\x08\x65nd_date\x18\r \x01(\x0b\x32\x11.google.type.DateB\x03\xe0\x41\x03\x12\x16\n\trevokable\x18\x0e \x01(\x08\x42\x03\xe0\x41\x03\x12\x13\n\x06\x61mount\x18\x0f \x01(\x01\x42\x03\xe0\x41\x03\x12h\n\x0b\x61mount_rule\x18\x10 \x01(\x0e\x32N.google.cloud.paymentgateway.issuerswitch.v1.MandateTransaction.AmountRuleTypeB\x03\xe0\x41\x03\x12\x1f\n\x12\x61pproval_reference\x18\x11 \x01(\tB\x03\xe0\x41\x03\x12\x18\n\x0b\x62lock_funds\x18\x12 \x01(\x08\x42\x03\xe0\x41\x03\x12\x39\n\x10last_update_time\x18\x13 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"\xd0\x01\n\x15RecurrencePatternType\x12\'\n#RECURRENCE_PATTERN_TYPE_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x41S_PRESENTED\x10\x01\x12\r\n\tBIMONTHLY\x10\x02\x12\t\n\x05\x44\x41ILY\x10\x03\x12\x0f\n\x0b\x46ORTNIGHTLY\x10\x04\x12\x0f\n\x0bHALF_YEARLY\x10\x05\x12\x0b\n\x07MONTHLY\x10\x06\x12\x0c\n\x08ONE_TIME\x10\x07\x12\r\n\tQUARTERLY\x10\x08\x12\n\n\x06WEEKLY\x10\t\x12\n\n\x06YEARLY\x10\n\"Y\n\x12RecurrenceRuleType\x12$\n RECURRENCE_RULE_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x41\x46TER\x10\x01\x12\n\n\x06\x42\x45\x46ORE\x10\x02\x12\x06\n\x02ON\x10\x03\"F\n\x0e\x41mountRuleType\x12 \n\x1c\x41MOUNT_RULE_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x45XACT\x10\x01\x12\x07\n\x03MAX\x10\x02:i\xea\x41\x66\n.issuerswitch.googleapis.com/MandateTransaction\x12\x34projects/{project}/mandateTransactions/{transaction}\"\x87\x03\n\x14\x43omplaintTransaction\x12\x0c\n\x04name\x18\x01 \x01(\t\x12J\n\x04info\x18\x02 \x01(\x0b\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionInfo\x12P\n\tcomplaint\x18\x03 \x01(\x0b\x32\x36.google.cloud.paymentgateway.issuerswitch.v1.ComplaintB\x03\xe0\x41\x03H\x00\x12L\n\x07\x64ispute\x18\x04 \x01(\x0b\x32\x34.google.cloud.paymentgateway.issuerswitch.v1.DisputeB\x03\xe0\x41\x03H\x00:m\xea\x41j\n0issuerswitch.googleapis.com/ComplaintTransaction\x12\x36projects/{project}/complaintTransactions/{transaction}B\x06\n\x04\x63\x61se\"\xa1\x01\n\x1fListMetadataTransactionsRequest\x12G\n\x06parent\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\x12/issuerswitch.googleapis.com/MetadataTransaction\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"\xa3\x01\n ListFinancialTransactionsRequest\x12H\n\x06parent\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\x12\x30issuerswitch.googleapis.com/FinancialTransaction\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"\x9f\x01\n\x1eListMandateTransactionsRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\x12.issuerswitch.googleapis.com/MandateTransaction\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"\xa3\x01\n ListComplaintTransactionsRequest\x12H\n\x06parent\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\x12\x30issuerswitch.googleapis.com/ComplaintTransaction\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"\x9c\x01\n ListMetadataTransactionsResponse\x12_\n\x15metadata_transactions\x18\x01 \x03(\x0b\x32@.google.cloud.paymentgateway.issuerswitch.v1.MetadataTransaction\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x9f\x01\n!ListFinancialTransactionsResponse\x12\x61\n\x16\x66inancial_transactions\x18\x01 \x03(\x0b\x32\x41.google.cloud.paymentgateway.issuerswitch.v1.FinancialTransaction\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x99\x01\n\x1fListMandateTransactionsResponse\x12]\n\x14mandate_transactions\x18\x01 \x03(\x0b\x32?.google.cloud.paymentgateway.issuerswitch.v1.MandateTransaction\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x9f\x01\n!ListComplaintTransactionsResponse\x12\x61\n\x16\x63omplaint_transactions\x18\x01 \x03(\x0b\x32\x41.google.cloud.paymentgateway.issuerswitch.v1.ComplaintTransaction\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xef\x01\n\"ExportFinancialTransactionsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\x10transaction_type\x18\x02 \x01(\x0e\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionType\x12.\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xde\x01\n!ExportMetadataTransactionsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x46\n\x08\x61pi_type\x18\x02 \x01(\x0e\x32\x34.google.cloud.paymentgateway.issuerswitch.v1.ApiType\x12.\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xed\x01\n ExportMandateTransactionsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\x10transaction_type\x18\x02 \x01(\x0e\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionType\x12.\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xef\x01\n\"ExportComplaintTransactionsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\x10transaction_type\x18\x02 \x01(\x0e\x32<.google.cloud.paymentgateway.issuerswitch.v1.TransactionType\x12.\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"9\n#ExportFinancialTransactionsResponse\x12\x12\n\ntarget_uri\x18\x01 \x01(\t\"8\n\"ExportMetadataTransactionsResponse\x12\x12\n\ntarget_uri\x18\x01 \x01(\t\"7\n!ExportMandateTransactionsResponse\x12\x12\n\ntarget_uri\x18\x01 \x01(\t\"9\n#ExportComplaintTransactionsResponse\x12\x12\n\ntarget_uri\x18\x01 \x01(\t\"[\n#ExportFinancialTransactionsMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"Y\n!ExportMandateTransactionsMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"Z\n\"ExportMetadataTransactionsMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"[\n#ExportComplaintTransactionsMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x32\xc0\x11\n\x18IssuerSwitchTransactions\x12\xf6\x01\n\x18ListMetadataTransactions\x12L.google.cloud.paymentgateway.issuerswitch.v1.ListMetadataTransactionsRequest\x1aM.google.cloud.paymentgateway.issuerswitch.v1.ListMetadataTransactionsResponse\"=\x82\xd3\xe4\x93\x02.\x12,/v1/{parent=projects/*}/metadataTransactions\xda\x41\x06parent\x12\xfa\x01\n\x19ListFinancialTransactions\x12M.google.cloud.paymentgateway.issuerswitch.v1.ListFinancialTransactionsRequest\x1aN.google.cloud.paymentgateway.issuerswitch.v1.ListFinancialTransactionsResponse\">\x82\xd3\xe4\x93\x02/\x12-/v1/{parent=projects/*}/financialTransactions\xda\x41\x06parent\x12\xf2\x01\n\x17ListMandateTransactions\x12K.google.cloud.paymentgateway.issuerswitch.v1.ListMandateTransactionsRequest\x1aL.google.cloud.paymentgateway.issuerswitch.v1.ListMandateTransactionsResponse\"<\x82\xd3\xe4\x93\x02-\x12+/v1/{parent=projects/*}/mandateTransactions\xda\x41\x06parent\x12\xfa\x01\n\x19ListComplaintTransactions\x12M.google.cloud.paymentgateway.issuerswitch.v1.ListComplaintTransactionsRequest\x1aN.google.cloud.paymentgateway.issuerswitch.v1.ListComplaintTransactionsResponse\">\x82\xd3\xe4\x93\x02/\x12-/v1/{parent=projects/*}/complaintTransactions\xda\x41\x06parent\x12\x9c\x02\n\x1b\x45xportFinancialTransactions\x12O.google.cloud.paymentgateway.issuerswitch.v1.ExportFinancialTransactionsRequest\x1a\x1d.google.longrunning.Operation\"\x8c\x01\x82\xd3\xe4\x93\x02\x39\"4/v1/{parent=projects/*}/financialTransactions:export:\x01*\xca\x41J\n#ExportFinancialTransactionsResponse\x12#ExportFinancialTransactionsMetadata\x12\x97\x02\n\x1a\x45xportMetadataTransactions\x12N.google.cloud.paymentgateway.issuerswitch.v1.ExportMetadataTransactionsRequest\x1a\x1d.google.longrunning.Operation\"\x89\x01\x82\xd3\xe4\x93\x02\x38\"3/v1/{parent=projects/*}/metadataTransactions:export:\x01*\xca\x41H\n\"ExportMetadataTransactionsResponse\x12\"ExportMetadataTransactionsMetadata\x12\x92\x02\n\x19\x45xportMandateTransactions\x12M.google.cloud.paymentgateway.issuerswitch.v1.ExportMandateTransactionsRequest\x1a\x1d.google.longrunning.Operation\"\x86\x01\x82\xd3\xe4\x93\x02\x37\"2/v1/{parent=projects/*}/mandateTransactions:export:\x01*\xca\x41\x46\n!ExportMandateTransactionsResponse\x12!ExportMandateTransactionsMetadata\x12\x9c\x02\n\x1b\x45xportComplaintTransactions\x12O.google.cloud.paymentgateway.issuerswitch.v1.ExportComplaintTransactionsRequest\x1a\x1d.google.longrunning.Operation\"\x8c\x01\x82\xd3\xe4\x93\x02\x39\"4/v1/{parent=projects/*}/complaintTransactions:export:\x01*\xca\x41J\n#ExportComplaintTransactionsResponse\x12#ExportComplaintTransactionsMetadata\x1aO\xca\x41\x1bissuerswitch.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xad\x02\n/com.google.cloud.paymentgateway.issuerswitch.v1B\x11TransactionsProtoP\x01ZWgoogle.golang.org/genproto/googleapis/cloud/paymentgateway/issuerswitch/v1;issuerswitch\xaa\x02+Google.Cloud.PaymentGateway.IssuerSwitch.V1\xca\x02+Google\\Cloud\\PaymentGateway\\IssuerSwitch\\V1\xea\x02/Google::Cloud::PaymentGateway::IssuerSwitch::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.paymentgateway.issuerswitch.v1.transactions_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n/com.google.cloud.paymentgateway.issuerswitch.v1B\021TransactionsProtoP\001ZWgoogle.golang.org/genproto/googleapis/cloud/paymentgateway/issuerswitch/v1;issuerswitch\252\002+Google.Cloud.PaymentGateway.IssuerSwitch.V1\312\002+Google\\Cloud\\PaymentGateway\\IssuerSwitch\\V1\352\002/Google::Cloud::PaymentGateway::IssuerSwitch::V1'
  _TRANSACTIONINFO.fields_by_name['id']._options = None
  _TRANSACTIONINFO.fields_by_name['id']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['api_type']._options = None
  _TRANSACTIONINFO.fields_by_name['api_type']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['transaction_type']._options = None
  _TRANSACTIONINFO.fields_by_name['transaction_type']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['transaction_sub_type']._options = None
  _TRANSACTIONINFO.fields_by_name['transaction_sub_type']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['state']._options = None
  _TRANSACTIONINFO.fields_by_name['state']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['error_code']._options = None
  _TRANSACTIONINFO.fields_by_name['error_code']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['error_message']._options = None
  _TRANSACTIONINFO.fields_by_name['error_message']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['create_time']._options = None
  _TRANSACTIONINFO.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['update_time']._options = None
  _TRANSACTIONINFO.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['bank_adapter_request_ids']._options = None
  _TRANSACTIONINFO.fields_by_name['bank_adapter_request_ids']._serialized_options = b'\340A\003'
  _TRANSACTIONINFO.fields_by_name['upi_error_code']._options = None
  _TRANSACTIONINFO.fields_by_name['upi_error_code']._serialized_options = b'\340A\003'
  _METADATATRANSACTION.fields_by_name['origin_vpa']._options = None
  _METADATATRANSACTION.fields_by_name['origin_vpa']._serialized_options = b'\340A\003'
  _METADATATRANSACTION._options = None
  _METADATATRANSACTION._serialized_options = b'\352Ah\n/issuerswitch.googleapis.com/MetadataTransaction\0225projects/{project}/metadataTransactions/{transaction}'
  _FINANCIALTRANSACTION.fields_by_name['retrieval_reference_number']._options = None
  _FINANCIALTRANSACTION.fields_by_name['retrieval_reference_number']._serialized_options = b'\340A\003'
  _FINANCIALTRANSACTION.fields_by_name['payer']._options = None
  _FINANCIALTRANSACTION.fields_by_name['payer']._serialized_options = b'\340A\003'
  _FINANCIALTRANSACTION.fields_by_name['payee']._options = None
  _FINANCIALTRANSACTION.fields_by_name['payee']._serialized_options = b'\340A\003'
  _FINANCIALTRANSACTION.fields_by_name['amount']._options = None
  _FINANCIALTRANSACTION.fields_by_name['amount']._serialized_options = b'\340A\003'
  _FINANCIALTRANSACTION._options = None
  _FINANCIALTRANSACTION._serialized_options = b'\352Aj\n0issuerswitch.googleapis.com/FinancialTransaction\0226projects/{project}/financialTransactions/{transaction}'
  _MANDATETRANSACTION.fields_by_name['unique_mandate_number']._options = None
  _MANDATETRANSACTION.fields_by_name['unique_mandate_number']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['payer_vpa']._options = None
  _MANDATETRANSACTION.fields_by_name['payer_vpa']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['payee_vpa']._options = None
  _MANDATETRANSACTION.fields_by_name['payee_vpa']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['payee_merchant_id']._options = None
  _MANDATETRANSACTION.fields_by_name['payee_merchant_id']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['payer_mobile_number']._options = None
  _MANDATETRANSACTION.fields_by_name['payer_mobile_number']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['payee_mobile_number']._options = None
  _MANDATETRANSACTION.fields_by_name['payee_mobile_number']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['recurrence_pattern']._options = None
  _MANDATETRANSACTION.fields_by_name['recurrence_pattern']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['recurrence_rule_type']._options = None
  _MANDATETRANSACTION.fields_by_name['recurrence_rule_type']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['recurrence_rule_value']._options = None
  _MANDATETRANSACTION.fields_by_name['recurrence_rule_value']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['start_date']._options = None
  _MANDATETRANSACTION.fields_by_name['start_date']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['end_date']._options = None
  _MANDATETRANSACTION.fields_by_name['end_date']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['revokable']._options = None
  _MANDATETRANSACTION.fields_by_name['revokable']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['amount']._options = None
  _MANDATETRANSACTION.fields_by_name['amount']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['amount_rule']._options = None
  _MANDATETRANSACTION.fields_by_name['amount_rule']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['approval_reference']._options = None
  _MANDATETRANSACTION.fields_by_name['approval_reference']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['block_funds']._options = None
  _MANDATETRANSACTION.fields_by_name['block_funds']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION.fields_by_name['last_update_time']._options = None
  _MANDATETRANSACTION.fields_by_name['last_update_time']._serialized_options = b'\340A\003'
  _MANDATETRANSACTION._options = None
  _MANDATETRANSACTION._serialized_options = b'\352Af\n.issuerswitch.googleapis.com/MandateTransaction\0224projects/{project}/mandateTransactions/{transaction}'
  _COMPLAINTTRANSACTION.fields_by_name['complaint']._options = None
  _COMPLAINTTRANSACTION.fields_by_name['complaint']._serialized_options = b'\340A\003'
  _COMPLAINTTRANSACTION.fields_by_name['dispute']._options = None
  _COMPLAINTTRANSACTION.fields_by_name['dispute']._serialized_options = b'\340A\003'
  _COMPLAINTTRANSACTION._options = None
  _COMPLAINTTRANSACTION._serialized_options = b'\352Aj\n0issuerswitch.googleapis.com/ComplaintTransaction\0226projects/{project}/complaintTransactions/{transaction}'
  _LISTMETADATATRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _LISTMETADATATRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A1\022/issuerswitch.googleapis.com/MetadataTransaction'
  _LISTFINANCIALTRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _LISTFINANCIALTRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A2\0220issuerswitch.googleapis.com/FinancialTransaction'
  _LISTMANDATETRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _LISTMANDATETRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\022.issuerswitch.googleapis.com/MandateTransaction'
  _LISTCOMPLAINTTRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _LISTCOMPLAINTTRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A2\0220issuerswitch.googleapis.com/ComplaintTransaction'
  _EXPORTFINANCIALTRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _EXPORTFINANCIALTRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _EXPORTMETADATATRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _EXPORTMETADATATRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _EXPORTMANDATETRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _EXPORTMANDATETRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _EXPORTCOMPLAINTTRANSACTIONSREQUEST.fields_by_name['parent']._options = None
  _EXPORTCOMPLAINTTRANSACTIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _EXPORTFINANCIALTRANSACTIONSMETADATA.fields_by_name['create_time']._options = None
  _EXPORTFINANCIALTRANSACTIONSMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _EXPORTMANDATETRANSACTIONSMETADATA.fields_by_name['create_time']._options = None
  _EXPORTMANDATETRANSACTIONSMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _EXPORTMETADATATRANSACTIONSMETADATA.fields_by_name['create_time']._options = None
  _EXPORTMETADATATRANSACTIONSMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _EXPORTCOMPLAINTTRANSACTIONSMETADATA.fields_by_name['create_time']._options = None
  _EXPORTCOMPLAINTTRANSACTIONSMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ISSUERSWITCHTRANSACTIONS._options = None
  _ISSUERSWITCHTRANSACTIONS._serialized_options = b'\312A\033issuerswitch.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListMetadataTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListMetadataTransactions']._serialized_options = b'\202\323\344\223\002.\022,/v1/{parent=projects/*}/metadataTransactions\332A\006parent'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListFinancialTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListFinancialTransactions']._serialized_options = b'\202\323\344\223\002/\022-/v1/{parent=projects/*}/financialTransactions\332A\006parent'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListMandateTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListMandateTransactions']._serialized_options = b'\202\323\344\223\002-\022+/v1/{parent=projects/*}/mandateTransactions\332A\006parent'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListComplaintTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ListComplaintTransactions']._serialized_options = b'\202\323\344\223\002/\022-/v1/{parent=projects/*}/complaintTransactions\332A\006parent'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportFinancialTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportFinancialTransactions']._serialized_options = b'\202\323\344\223\0029\"4/v1/{parent=projects/*}/financialTransactions:export:\001*\312AJ\n#ExportFinancialTransactionsResponse\022#ExportFinancialTransactionsMetadata'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportMetadataTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportMetadataTransactions']._serialized_options = b'\202\323\344\223\0028\"3/v1/{parent=projects/*}/metadataTransactions:export:\001*\312AH\n\"ExportMetadataTransactionsResponse\022\"ExportMetadataTransactionsMetadata'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportMandateTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportMandateTransactions']._serialized_options = b'\202\323\344\223\0027\"2/v1/{parent=projects/*}/mandateTransactions:export:\001*\312AF\n!ExportMandateTransactionsResponse\022!ExportMandateTransactionsMetadata'
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportComplaintTransactions']._options = None
  _ISSUERSWITCHTRANSACTIONS.methods_by_name['ExportComplaintTransactions']._serialized_options = b'\202\323\344\223\0029\"4/v1/{parent=projects/*}/complaintTransactions:export:\001*\312AJ\n#ExportComplaintTransactionsResponse\022#ExportComplaintTransactionsMetadata'
  _TRANSACTIONINFO._serialized_start=474
  _TRANSACTIONINFO._serialized_end=1294
  _TRANSACTIONINFO_STATE._serialized_start=1113
  _TRANSACTIONINFO_STATE._serialized_end=1170
  _TRANSACTIONINFO_TRANSACTIONSUBTYPE._serialized_start=1172
  _TRANSACTIONINFO_TRANSACTIONSUBTYPE._serialized_end=1294
  _METADATATRANSACTION._serialized_start=1297
  _METADATATRANSACTION._serialized_end=1542
  _FINANCIALTRANSACTION._serialized_start=1545
  _FINANCIALTRANSACTION._serialized_end=2026
  _MANDATETRANSACTION._serialized_start=2029
  _MANDATETRANSACTION._serialized_end=3446
  _MANDATETRANSACTION_RECURRENCEPATTERNTYPE._serialized_start=2968
  _MANDATETRANSACTION_RECURRENCEPATTERNTYPE._serialized_end=3176
  _MANDATETRANSACTION_RECURRENCERULETYPE._serialized_start=3178
  _MANDATETRANSACTION_RECURRENCERULETYPE._serialized_end=3267
  _MANDATETRANSACTION_AMOUNTRULETYPE._serialized_start=3269
  _MANDATETRANSACTION_AMOUNTRULETYPE._serialized_end=3339
  _COMPLAINTTRANSACTION._serialized_start=3449
  _COMPLAINTTRANSACTION._serialized_end=3840
  _LISTMETADATATRANSACTIONSREQUEST._serialized_start=3843
  _LISTMETADATATRANSACTIONSREQUEST._serialized_end=4004
  _LISTFINANCIALTRANSACTIONSREQUEST._serialized_start=4007
  _LISTFINANCIALTRANSACTIONSREQUEST._serialized_end=4170
  _LISTMANDATETRANSACTIONSREQUEST._serialized_start=4173
  _LISTMANDATETRANSACTIONSREQUEST._serialized_end=4332
  _LISTCOMPLAINTTRANSACTIONSREQUEST._serialized_start=4335
  _LISTCOMPLAINTTRANSACTIONSREQUEST._serialized_end=4498
  _LISTMETADATATRANSACTIONSRESPONSE._serialized_start=4501
  _LISTMETADATATRANSACTIONSRESPONSE._serialized_end=4657
  _LISTFINANCIALTRANSACTIONSRESPONSE._serialized_start=4660
  _LISTFINANCIALTRANSACTIONSRESPONSE._serialized_end=4819
  _LISTMANDATETRANSACTIONSRESPONSE._serialized_start=4822
  _LISTMANDATETRANSACTIONSRESPONSE._serialized_end=4975
  _LISTCOMPLAINTTRANSACTIONSRESPONSE._serialized_start=4978
  _LISTCOMPLAINTTRANSACTIONSRESPONSE._serialized_end=5137
  _EXPORTFINANCIALTRANSACTIONSREQUEST._serialized_start=5140
  _EXPORTFINANCIALTRANSACTIONSREQUEST._serialized_end=5379
  _EXPORTMETADATATRANSACTIONSREQUEST._serialized_start=5382
  _EXPORTMETADATATRANSACTIONSREQUEST._serialized_end=5604
  _EXPORTMANDATETRANSACTIONSREQUEST._serialized_start=5607
  _EXPORTMANDATETRANSACTIONSREQUEST._serialized_end=5844
  _EXPORTCOMPLAINTTRANSACTIONSREQUEST._serialized_start=5847
  _EXPORTCOMPLAINTTRANSACTIONSREQUEST._serialized_end=6086
  _EXPORTFINANCIALTRANSACTIONSRESPONSE._serialized_start=6088
  _EXPORTFINANCIALTRANSACTIONSRESPONSE._serialized_end=6145
  _EXPORTMETADATATRANSACTIONSRESPONSE._serialized_start=6147
  _EXPORTMETADATATRANSACTIONSRESPONSE._serialized_end=6203
  _EXPORTMANDATETRANSACTIONSRESPONSE._serialized_start=6205
  _EXPORTMANDATETRANSACTIONSRESPONSE._serialized_end=6260
  _EXPORTCOMPLAINTTRANSACTIONSRESPONSE._serialized_start=6262
  _EXPORTCOMPLAINTTRANSACTIONSRESPONSE._serialized_end=6319
  _EXPORTFINANCIALTRANSACTIONSMETADATA._serialized_start=6321
  _EXPORTFINANCIALTRANSACTIONSMETADATA._serialized_end=6412
  _EXPORTMANDATETRANSACTIONSMETADATA._serialized_start=6414
  _EXPORTMANDATETRANSACTIONSMETADATA._serialized_end=6503
  _EXPORTMETADATATRANSACTIONSMETADATA._serialized_start=6505
  _EXPORTMETADATATRANSACTIONSMETADATA._serialized_end=6595
  _EXPORTCOMPLAINTTRANSACTIONSMETADATA._serialized_start=6597
  _EXPORTCOMPLAINTTRANSACTIONSMETADATA._serialized_end=6688
  _ISSUERSWITCHTRANSACTIONS._serialized_start=6691
  _ISSUERSWITCHTRANSACTIONS._serialized_end=8931
# @@protoc_insertion_point(module_scope)