// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/invoice.proto

package com.google.ads.googleads.v12.resources;

public final class InvoiceProto {
  private InvoiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_Invoice_AccountSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_Invoice_AccountSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_Invoice_AccountBudgetSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_Invoice_AccountBudgetSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v12/resources/inv" +
      "oice.proto\022\"google.ads.googleads.v12.res" +
      "ources\032+google/ads/googleads/v12/common/" +
      "dates.proto\0321google/ads/googleads/v12/en" +
      "ums/invoice_type.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"\216\036\n\007Invoice\022?\n\rresource_name\030\001 \001(\tB(\340" +
      "A\003\372A\"\n googleads.googleapis.com/Invoice\022" +
      "\024\n\002id\030\031 \001(\tB\003\340A\003H\000\210\001\001\022N\n\004type\030\003 \001(\0162;.go" +
      "ogle.ads.googleads.v12.enums.InvoiceType" +
      "Enum.InvoiceTypeB\003\340A\003\022\037\n\rbilling_setup\030\032" +
      " \001(\tB\003\340A\003H\001\210\001\001\022%\n\023payments_account_id\030\033 " +
      "\001(\tB\003\340A\003H\002\210\001\001\022%\n\023payments_profile_id\030\034 \001" +
      "(\tB\003\340A\003H\003\210\001\001\022\034\n\nissue_date\030\035 \001(\tB\003\340A\003H\004\210" +
      "\001\001\022\032\n\010due_date\030\036 \001(\tB\003\340A\003H\005\210\001\001\022K\n\022servic" +
      "e_date_range\030\t \001(\0132*.google.ads.googlead" +
      "s.v12.common.DateRangeB\003\340A\003\022\037\n\rcurrency_" +
      "code\030\037 \001(\tB\003\340A\003H\006\210\001\001\022/\n\"adjustments_subt" +
      "otal_amount_micros\030\023 \001(\003B\003\340A\003\022*\n\035adjustm" +
      "ents_tax_amount_micros\030\024 \001(\003B\003\340A\003\022,\n\037adj" +
      "ustments_total_amount_micros\030\025 \001(\003B\003\340A\003\022" +
      "4\n\'regulatory_costs_subtotal_amount_micr" +
      "os\030\026 \001(\003B\003\340A\003\022/\n\"regulatory_costs_tax_am" +
      "ount_micros\030\027 \001(\003B\003\340A\003\0221\n$regulatory_cos" +
      "ts_total_amount_micros\030\030 \001(\003B\003\340A\003\022(\n\026sub" +
      "total_amount_micros\030! \001(\003B\003\340A\003H\007\210\001\001\022#\n\021t" +
      "ax_amount_micros\030\" \001(\003B\003\340A\003H\010\210\001\001\022%\n\023tota" +
      "l_amount_micros\030# \001(\003B\003\340A\003H\t\210\001\001\022#\n\021corre" +
      "cted_invoice\030$ \001(\tB\003\340A\003H\n\210\001\001\022\036\n\021replaced" +
      "_invoices\030% \003(\tB\003\340A\003\022\031\n\007pdf_url\030& \001(\tB\003\340" +
      "A\003H\013\210\001\001\022g\n\030account_budget_summaries\030\022 \003(" +
      "\0132@.google.ads.googleads.v12.resources.I" +
      "nvoice.AccountBudgetSummaryB\003\340A\003\022Z\n\021acco" +
      "unt_summaries\030\' \003(\0132:.google.ads.googlea" +
      "ds.v12.resources.Invoice.AccountSummaryB" +
      "\003\340A\003\032\316\013\n\016AccountSummary\022\032\n\010customer\030\001 \001(" +
      "\tB\003\340A\003H\000\210\001\001\022;\n)billing_correction_subtot" +
      "al_amount_micros\030\002 \001(\003B\003\340A\003H\001\210\001\001\0226\n$bill" +
      "ing_correction_tax_amount_micros\030\003 \001(\003B\003" +
      "\340A\003H\002\210\001\001\0228\n&billing_correction_total_amo" +
      "unt_micros\030\004 \001(\003B\003\340A\003H\003\210\001\001\022:\n(coupon_adj" +
      "ustment_subtotal_amount_micros\030\005 \001(\003B\003\340A" +
      "\003H\004\210\001\001\0225\n#coupon_adjustment_tax_amount_m" +
      "icros\030\006 \001(\003B\003\340A\003H\005\210\001\001\0227\n%coupon_adjustme" +
      "nt_total_amount_micros\030\007 \001(\003B\003\340A\003H\006\210\001\001\022A" +
      "\n/excess_credit_adjustment_subtotal_amou" +
      "nt_micros\030\010 \001(\003B\003\340A\003H\007\210\001\001\022<\n*excess_cred" +
      "it_adjustment_tax_amount_micros\030\t \001(\003B\003\340" +
      "A\003H\010\210\001\001\022>\n,excess_credit_adjustment_tota" +
      "l_amount_micros\030\n \001(\003B\003\340A\003H\t\210\001\001\0229\n\'regul" +
      "atory_costs_subtotal_amount_micros\030\013 \001(\003" +
      "B\003\340A\003H\n\210\001\001\0224\n\"regulatory_costs_tax_amoun" +
      "t_micros\030\014 \001(\003B\003\340A\003H\013\210\001\001\0226\n$regulatory_c" +
      "osts_total_amount_micros\030\r \001(\003B\003\340A\003H\014\210\001\001" +
      "\022(\n\026subtotal_amount_micros\030\016 \001(\003B\003\340A\003H\r\210" +
      "\001\001\022#\n\021tax_amount_micros\030\017 \001(\003B\003\340A\003H\016\210\001\001\022" +
      "%\n\023total_amount_micros\030\020 \001(\003B\003\340A\003H\017\210\001\001B\013" +
      "\n\t_customerB,\n*_billing_correction_subto" +
      "tal_amount_microsB\'\n%_billing_correction" +
      "_tax_amount_microsB)\n\'_billing_correctio" +
      "n_total_amount_microsB+\n)_coupon_adjustm" +
      "ent_subtotal_amount_microsB&\n$_coupon_ad" +
      "justment_tax_amount_microsB(\n&_coupon_ad" +
      "justment_total_amount_microsB2\n0_excess_" +
      "credit_adjustment_subtotal_amount_micros" +
      "B-\n+_excess_credit_adjustment_tax_amount" +
      "_microsB/\n-_excess_credit_adjustment_tot" +
      "al_amount_microsB*\n(_regulatory_costs_su" +
      "btotal_amount_microsB%\n#_regulatory_cost" +
      "s_tax_amount_microsB\'\n%_regulatory_costs" +
      "_total_amount_microsB\031\n\027_subtotal_amount" +
      "_microsB\024\n\022_tax_amount_microsB\026\n\024_total_" +
      "amount_micros\032\373\006\n\024AccountBudgetSummary\022\032" +
      "\n\010customer\030\n \001(\tB\003\340A\003H\000\210\001\001\022+\n\031customer_d" +
      "escriptive_name\030\013 \001(\tB\003\340A\003H\001\210\001\001\022 \n\016accou" +
      "nt_budget\030\014 \001(\tB\003\340A\003H\002\210\001\001\022%\n\023account_bud" +
      "get_name\030\r \001(\tB\003\340A\003H\003\210\001\001\022\'\n\025purchase_ord" +
      "er_number\030\016 \001(\tB\003\340A\003H\004\210\001\001\022(\n\026subtotal_am" +
      "ount_micros\030\017 \001(\003B\003\340A\003H\005\210\001\001\022#\n\021tax_amoun" +
      "t_micros\030\020 \001(\003B\003\340A\003H\006\210\001\001\022%\n\023total_amount" +
      "_micros\030\021 \001(\003B\003\340A\003H\007\210\001\001\022U\n\034billable_acti" +
      "vity_date_range\030\t \001(\0132*.google.ads.googl" +
      "eads.v12.common.DateRangeB\003\340A\003\022&\n\024served" +
      "_amount_micros\030\022 \001(\003B\003\340A\003H\010\210\001\001\022&\n\024billed" +
      "_amount_micros\030\023 \001(\003B\003\340A\003H\t\210\001\001\022,\n\032overde" +
      "livery_amount_micros\030\024 \001(\003B\003\340A\003H\n\210\001\001\0220\n\036" +
      "invalid_activity_amount_micros\030\025 \001(\003B\003\340A" +
      "\003H\013\210\001\001B\013\n\t_customerB\034\n\032_customer_descrip" +
      "tive_nameB\021\n\017_account_budgetB\026\n\024_account" +
      "_budget_nameB\030\n\026_purchase_order_numberB\031" +
      "\n\027_subtotal_amount_microsB\024\n\022_tax_amount" +
      "_microsB\026\n\024_total_amount_microsB\027\n\025_serv" +
      "ed_amount_microsB\027\n\025_billed_amount_micro" +
      "sB\035\n\033_overdelivery_amount_microsB!\n\037_inv" +
      "alid_activity_amount_micros:T\352AQ\n google" +
      "ads.googleapis.com/Invoice\022-customers/{c" +
      "ustomer_id}/invoices/{invoice_id}B\005\n\003_id" +
      "B\020\n\016_billing_setupB\026\n\024_payments_account_" +
      "idB\026\n\024_payments_profile_idB\r\n\013_issue_dat" +
      "eB\013\n\t_due_dateB\020\n\016_currency_codeB\031\n\027_sub" +
      "total_amount_microsB\024\n\022_tax_amount_micro" +
      "sB\026\n\024_total_amount_microsB\024\n\022_corrected_" +
      "invoiceB\n\n\010_pdf_urlB\376\001\n&com.google.ads.g" +
      "oogleads.v12.resourcesB\014InvoiceProtoP\001ZK" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v12/resources;resources\242\002\003GA" +
      "A\252\002\"Google.Ads.GoogleAds.V12.Resources\312\002" +
      "\"Google\\Ads\\GoogleAds\\V12\\Resources\352\002&Go" +
      "ogle::Ads::GoogleAds::V12::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.InvoiceTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_Invoice_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "ServiceDateRange", "CurrencyCode", "AdjustmentsSubtotalAmountMicros", "AdjustmentsTaxAmountMicros", "AdjustmentsTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "ReplacedInvoices", "PdfUrl", "AccountBudgetSummaries", "AccountSummaries", "Id", "BillingSetup", "PaymentsAccountId", "PaymentsProfileId", "IssueDate", "DueDate", "CurrencyCode", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "CorrectedInvoice", "PdfUrl", });
    internal_static_google_ads_googleads_v12_resources_Invoice_AccountSummary_descriptor =
      internal_static_google_ads_googleads_v12_resources_Invoice_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_Invoice_AccountSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_Invoice_AccountSummary_descriptor,
        new java.lang.String[] { "Customer", "BillingCorrectionSubtotalAmountMicros", "BillingCorrectionTaxAmountMicros", "BillingCorrectionTotalAmountMicros", "CouponAdjustmentSubtotalAmountMicros", "CouponAdjustmentTaxAmountMicros", "CouponAdjustmentTotalAmountMicros", "ExcessCreditAdjustmentSubtotalAmountMicros", "ExcessCreditAdjustmentTaxAmountMicros", "ExcessCreditAdjustmentTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "Customer", "BillingCorrectionSubtotalAmountMicros", "BillingCorrectionTaxAmountMicros", "BillingCorrectionTotalAmountMicros", "CouponAdjustmentSubtotalAmountMicros", "CouponAdjustmentTaxAmountMicros", "CouponAdjustmentTotalAmountMicros", "ExcessCreditAdjustmentSubtotalAmountMicros", "ExcessCreditAdjustmentTaxAmountMicros", "ExcessCreditAdjustmentTotalAmountMicros", "RegulatoryCostsSubtotalAmountMicros", "RegulatoryCostsTaxAmountMicros", "RegulatoryCostsTotalAmountMicros", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", });
    internal_static_google_ads_googleads_v12_resources_Invoice_AccountBudgetSummary_descriptor =
      internal_static_google_ads_googleads_v12_resources_Invoice_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v12_resources_Invoice_AccountBudgetSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_Invoice_AccountBudgetSummary_descriptor,
        new java.lang.String[] { "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "BillableActivityDateRange", "ServedAmountMicros", "BilledAmountMicros", "OverdeliveryAmountMicros", "InvalidActivityAmountMicros", "Customer", "CustomerDescriptiveName", "AccountBudget", "AccountBudgetName", "PurchaseOrderNumber", "SubtotalAmountMicros", "TaxAmountMicros", "TotalAmountMicros", "ServedAmountMicros", "BilledAmountMicros", "OverdeliveryAmountMicros", "InvalidActivityAmountMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v12.enums.InvoiceTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}