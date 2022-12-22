# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/resources/invoice.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.common import dates_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_common_dot_dates__pb2
from google.ads.googleads.v12.enums import invoice_type_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_invoice__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/ads/googleads/v12/resources/invoice.proto\x12\"google.ads.googleads.v12.resources\x1a+google/ads/googleads/v12/common/dates.proto\x1a\x31google/ads/googleads/v12/enums/invoice_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x8e\x1e\n\x07Invoice\x12?\n\rresource_name\x18\x01 \x01(\tB(\xe0\x41\x03\xfa\x41\"\n googleads.googleapis.com/Invoice\x12\x14\n\x02id\x18\x19 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12N\n\x04type\x18\x03 \x01(\x0e\x32;.google.ads.googleads.v12.enums.InvoiceTypeEnum.InvoiceTypeB\x03\xe0\x41\x03\x12\x1f\n\rbilling_setup\x18\x1a \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12%\n\x13payments_account_id\x18\x1b \x01(\tB\x03\xe0\x41\x03H\x02\x88\x01\x01\x12%\n\x13payments_profile_id\x18\x1c \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12\x1c\n\nissue_date\x18\x1d \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x12\x1a\n\x08\x64ue_date\x18\x1e \x01(\tB\x03\xe0\x41\x03H\x05\x88\x01\x01\x12K\n\x12service_date_range\x18\t \x01(\x0b\x32*.google.ads.googleads.v12.common.DateRangeB\x03\xe0\x41\x03\x12\x1f\n\rcurrency_code\x18\x1f \x01(\tB\x03\xe0\x41\x03H\x06\x88\x01\x01\x12/\n\"adjustments_subtotal_amount_micros\x18\x13 \x01(\x03\x42\x03\xe0\x41\x03\x12*\n\x1d\x61\x64justments_tax_amount_micros\x18\x14 \x01(\x03\x42\x03\xe0\x41\x03\x12,\n\x1f\x61\x64justments_total_amount_micros\x18\x15 \x01(\x03\x42\x03\xe0\x41\x03\x12\x34\n\'regulatory_costs_subtotal_amount_micros\x18\x16 \x01(\x03\x42\x03\xe0\x41\x03\x12/\n\"regulatory_costs_tax_amount_micros\x18\x17 \x01(\x03\x42\x03\xe0\x41\x03\x12\x31\n$regulatory_costs_total_amount_micros\x18\x18 \x01(\x03\x42\x03\xe0\x41\x03\x12(\n\x16subtotal_amount_micros\x18! \x01(\x03\x42\x03\xe0\x41\x03H\x07\x88\x01\x01\x12#\n\x11tax_amount_micros\x18\" \x01(\x03\x42\x03\xe0\x41\x03H\x08\x88\x01\x01\x12%\n\x13total_amount_micros\x18# \x01(\x03\x42\x03\xe0\x41\x03H\t\x88\x01\x01\x12#\n\x11\x63orrected_invoice\x18$ \x01(\tB\x03\xe0\x41\x03H\n\x88\x01\x01\x12\x1e\n\x11replaced_invoices\x18% \x03(\tB\x03\xe0\x41\x03\x12\x19\n\x07pdf_url\x18& \x01(\tB\x03\xe0\x41\x03H\x0b\x88\x01\x01\x12g\n\x18\x61\x63\x63ount_budget_summaries\x18\x12 \x03(\x0b\x32@.google.ads.googleads.v12.resources.Invoice.AccountBudgetSummaryB\x03\xe0\x41\x03\x12Z\n\x11\x61\x63\x63ount_summaries\x18\' \x03(\x0b\x32:.google.ads.googleads.v12.resources.Invoice.AccountSummaryB\x03\xe0\x41\x03\x1a\xce\x0b\n\x0e\x41\x63\x63ountSummary\x12\x1a\n\x08\x63ustomer\x18\x01 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12;\n)billing_correction_subtotal_amount_micros\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x36\n$billing_correction_tax_amount_micros\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x38\n&billing_correction_total_amount_micros\x18\x04 \x01(\x03\x42\x03\xe0\x41\x03H\x03\x88\x01\x01\x12:\n(coupon_adjustment_subtotal_amount_micros\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03H\x04\x88\x01\x01\x12\x35\n#coupon_adjustment_tax_amount_micros\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03H\x05\x88\x01\x01\x12\x37\n%coupon_adjustment_total_amount_micros\x18\x07 \x01(\x03\x42\x03\xe0\x41\x03H\x06\x88\x01\x01\x12\x41\n/excess_credit_adjustment_subtotal_amount_micros\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03H\x07\x88\x01\x01\x12<\n*excess_credit_adjustment_tax_amount_micros\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x08\x88\x01\x01\x12>\n,excess_credit_adjustment_total_amount_micros\x18\n \x01(\x03\x42\x03\xe0\x41\x03H\t\x88\x01\x01\x12\x39\n\'regulatory_costs_subtotal_amount_micros\x18\x0b \x01(\x03\x42\x03\xe0\x41\x03H\n\x88\x01\x01\x12\x34\n\"regulatory_costs_tax_amount_micros\x18\x0c \x01(\x03\x42\x03\xe0\x41\x03H\x0b\x88\x01\x01\x12\x36\n$regulatory_costs_total_amount_micros\x18\r \x01(\x03\x42\x03\xe0\x41\x03H\x0c\x88\x01\x01\x12(\n\x16subtotal_amount_micros\x18\x0e \x01(\x03\x42\x03\xe0\x41\x03H\r\x88\x01\x01\x12#\n\x11tax_amount_micros\x18\x0f \x01(\x03\x42\x03\xe0\x41\x03H\x0e\x88\x01\x01\x12%\n\x13total_amount_micros\x18\x10 \x01(\x03\x42\x03\xe0\x41\x03H\x0f\x88\x01\x01\x42\x0b\n\t_customerB,\n*_billing_correction_subtotal_amount_microsB\'\n%_billing_correction_tax_amount_microsB)\n\'_billing_correction_total_amount_microsB+\n)_coupon_adjustment_subtotal_amount_microsB&\n$_coupon_adjustment_tax_amount_microsB(\n&_coupon_adjustment_total_amount_microsB2\n0_excess_credit_adjustment_subtotal_amount_microsB-\n+_excess_credit_adjustment_tax_amount_microsB/\n-_excess_credit_adjustment_total_amount_microsB*\n(_regulatory_costs_subtotal_amount_microsB%\n#_regulatory_costs_tax_amount_microsB\'\n%_regulatory_costs_total_amount_microsB\x19\n\x17_subtotal_amount_microsB\x14\n\x12_tax_amount_microsB\x16\n\x14_total_amount_micros\x1a\xfb\x06\n\x14\x41\x63\x63ountBudgetSummary\x12\x1a\n\x08\x63ustomer\x18\n \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12+\n\x19\x63ustomer_descriptive_name\x18\x0b \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12 \n\x0e\x61\x63\x63ount_budget\x18\x0c \x01(\tB\x03\xe0\x41\x03H\x02\x88\x01\x01\x12%\n\x13\x61\x63\x63ount_budget_name\x18\r \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12\'\n\x15purchase_order_number\x18\x0e \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x12(\n\x16subtotal_amount_micros\x18\x0f \x01(\x03\x42\x03\xe0\x41\x03H\x05\x88\x01\x01\x12#\n\x11tax_amount_micros\x18\x10 \x01(\x03\x42\x03\xe0\x41\x03H\x06\x88\x01\x01\x12%\n\x13total_amount_micros\x18\x11 \x01(\x03\x42\x03\xe0\x41\x03H\x07\x88\x01\x01\x12U\n\x1c\x62illable_activity_date_range\x18\t \x01(\x0b\x32*.google.ads.googleads.v12.common.DateRangeB\x03\xe0\x41\x03\x12&\n\x14served_amount_micros\x18\x12 \x01(\x03\x42\x03\xe0\x41\x03H\x08\x88\x01\x01\x12&\n\x14\x62illed_amount_micros\x18\x13 \x01(\x03\x42\x03\xe0\x41\x03H\t\x88\x01\x01\x12,\n\x1aoverdelivery_amount_micros\x18\x14 \x01(\x03\x42\x03\xe0\x41\x03H\n\x88\x01\x01\x12\x30\n\x1einvalid_activity_amount_micros\x18\x15 \x01(\x03\x42\x03\xe0\x41\x03H\x0b\x88\x01\x01\x42\x0b\n\t_customerB\x1c\n\x1a_customer_descriptive_nameB\x11\n\x0f_account_budgetB\x16\n\x14_account_budget_nameB\x18\n\x16_purchase_order_numberB\x19\n\x17_subtotal_amount_microsB\x14\n\x12_tax_amount_microsB\x16\n\x14_total_amount_microsB\x17\n\x15_served_amount_microsB\x17\n\x15_billed_amount_microsB\x1d\n\x1b_overdelivery_amount_microsB!\n\x1f_invalid_activity_amount_micros:T\xea\x41Q\n googleads.googleapis.com/Invoice\x12-customers/{customer_id}/invoices/{invoice_id}B\x05\n\x03_idB\x10\n\x0e_billing_setupB\x16\n\x14_payments_account_idB\x16\n\x14_payments_profile_idB\r\n\x0b_issue_dateB\x0b\n\t_due_dateB\x10\n\x0e_currency_codeB\x19\n\x17_subtotal_amount_microsB\x14\n\x12_tax_amount_microsB\x16\n\x14_total_amount_microsB\x14\n\x12_corrected_invoiceB\n\n\x08_pdf_urlB\xfe\x01\n&com.google.ads.googleads.v12.resourcesB\x0cInvoiceProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V12.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V12\\Resources\xea\x02&Google::Ads::GoogleAds::V12::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.resources.invoice_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v12.resourcesB\014InvoiceProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources\352\002&Google::Ads::GoogleAds::V12::Resources'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['customer']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['customer']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['billing_correction_subtotal_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['billing_correction_subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['billing_correction_tax_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['billing_correction_tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['billing_correction_total_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['billing_correction_total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['coupon_adjustment_subtotal_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['coupon_adjustment_subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['coupon_adjustment_tax_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['coupon_adjustment_tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['coupon_adjustment_total_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['coupon_adjustment_total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['excess_credit_adjustment_subtotal_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['excess_credit_adjustment_subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['excess_credit_adjustment_tax_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['excess_credit_adjustment_tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['excess_credit_adjustment_total_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['excess_credit_adjustment_total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['regulatory_costs_subtotal_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['regulatory_costs_subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['regulatory_costs_tax_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['regulatory_costs_tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['regulatory_costs_total_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['regulatory_costs_total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['subtotal_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['tax_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['total_amount_micros']._options = None
  _INVOICE_ACCOUNTSUMMARY.fields_by_name['total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['customer']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['customer']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['customer_descriptive_name']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['customer_descriptive_name']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['account_budget']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['account_budget']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['account_budget_name']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['account_budget_name']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['purchase_order_number']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['purchase_order_number']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['subtotal_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['tax_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['total_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['billable_activity_date_range']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['billable_activity_date_range']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['served_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['served_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['billed_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['billed_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['overdelivery_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['overdelivery_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['invalid_activity_amount_micros']._options = None
  _INVOICE_ACCOUNTBUDGETSUMMARY.fields_by_name['invalid_activity_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['resource_name']._options = None
  _INVOICE.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A\"\n googleads.googleapis.com/Invoice'
  _INVOICE.fields_by_name['id']._options = None
  _INVOICE.fields_by_name['id']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['type']._options = None
  _INVOICE.fields_by_name['type']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['billing_setup']._options = None
  _INVOICE.fields_by_name['billing_setup']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['payments_account_id']._options = None
  _INVOICE.fields_by_name['payments_account_id']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['payments_profile_id']._options = None
  _INVOICE.fields_by_name['payments_profile_id']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['issue_date']._options = None
  _INVOICE.fields_by_name['issue_date']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['due_date']._options = None
  _INVOICE.fields_by_name['due_date']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['service_date_range']._options = None
  _INVOICE.fields_by_name['service_date_range']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['currency_code']._options = None
  _INVOICE.fields_by_name['currency_code']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['adjustments_subtotal_amount_micros']._options = None
  _INVOICE.fields_by_name['adjustments_subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['adjustments_tax_amount_micros']._options = None
  _INVOICE.fields_by_name['adjustments_tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['adjustments_total_amount_micros']._options = None
  _INVOICE.fields_by_name['adjustments_total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['regulatory_costs_subtotal_amount_micros']._options = None
  _INVOICE.fields_by_name['regulatory_costs_subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['regulatory_costs_tax_amount_micros']._options = None
  _INVOICE.fields_by_name['regulatory_costs_tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['regulatory_costs_total_amount_micros']._options = None
  _INVOICE.fields_by_name['regulatory_costs_total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['subtotal_amount_micros']._options = None
  _INVOICE.fields_by_name['subtotal_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['tax_amount_micros']._options = None
  _INVOICE.fields_by_name['tax_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['total_amount_micros']._options = None
  _INVOICE.fields_by_name['total_amount_micros']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['corrected_invoice']._options = None
  _INVOICE.fields_by_name['corrected_invoice']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['replaced_invoices']._options = None
  _INVOICE.fields_by_name['replaced_invoices']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['pdf_url']._options = None
  _INVOICE.fields_by_name['pdf_url']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['account_budget_summaries']._options = None
  _INVOICE.fields_by_name['account_budget_summaries']._serialized_options = b'\340A\003'
  _INVOICE.fields_by_name['account_summaries']._options = None
  _INVOICE.fields_by_name['account_summaries']._serialized_options = b'\340A\003'
  _INVOICE._options = None
  _INVOICE._serialized_options = b'\352AQ\n googleads.googleapis.com/Invoice\022-customers/{customer_id}/invoices/{invoice_id}'
  _INVOICE._serialized_start=245
  _INVOICE._serialized_end=4099
  _INVOICE_ACCOUNTSUMMARY._serialized_start=1407
  _INVOICE_ACCOUNTSUMMARY._serialized_end=2893
  _INVOICE_ACCOUNTBUDGETSUMMARY._serialized_start=2896
  _INVOICE_ACCOUNTBUDGETSUMMARY._serialized_end=3787
# @@protoc_insertion_point(module_scope)