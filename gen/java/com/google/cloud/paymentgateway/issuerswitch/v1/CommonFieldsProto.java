// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/paymentgateway/issuerswitch/v1/common_fields.proto

package com.google.cloud.paymentgateway.issuerswitch.v1;

public final class CommonFieldsProto {
  private CommonFieldsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_AccountReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_paymentgateway_issuerswitch_v1_AccountReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_SettlementParticipant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_paymentgateway_issuerswitch_v1_SettlementParticipant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_Participant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_paymentgateway_issuerswitch_v1_Participant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantAdditionalInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantAdditionalInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/paymentgateway/issuerswit" +
      "ch/v1/common_fields.proto\022+google.cloud." +
      "paymentgateway.issuerswitch.v1\032\037google/a" +
      "pi/field_behavior.proto\"S\n\020AccountRefere" +
      "nce\022\021\n\tifsc_code\030\001 \001(\t\022\024\n\014account_type\030\002" +
      " \001(\t\022\026\n\016account_number\030\003 \001(\t\"\265\002\n\025Settlem" +
      "entParticipant\022M\n\013participant\030\001 \001(\01328.go" +
      "ogle.cloud.paymentgateway.issuerswitch.v" +
      "1.Participant\022N\n\007account\030\002 \001(\0132=.google." +
      "cloud.paymentgateway.issuerswitch.v1.Acc" +
      "ountReference\022P\n\rmerchant_info\030\003 \001(\01329.g" +
      "oogle.cloud.paymentgateway.issuerswitch." +
      "v1.MerchantInfo\022\023\n\006mobile\030\004 \001(\tB\003\340A\003\022\026\n\t" +
      "device_id\030\005 \001(\tB\003\340A\003\"\313\001\n\013Participant\022\037\n\027" +
      "virtual_payment_address\030\001 \001(\t\022Q\n\007persona" +
      "\030\002 \001(\0162@.google.cloud.paymentgateway.iss" +
      "uerswitch.v1.Participant.Persona\022\014\n\004user" +
      "\030\003 \001(\t\":\n\007Persona\022\027\n\023PERSONA_UNSPECIFIED" +
      "\020\000\022\n\n\006ENTITY\020\001\022\n\n\006PERSON\020\002\"\305\001\n\014MerchantI" +
      "nfo\022\n\n\002id\030\001 \001(\t\022K\n\010merchant\030\002 \001(\01329.goog" +
      "le.cloud.paymentgateway.issuerswitch.v1." +
      "MerchantName\022\\\n\017additional_info\030\003 \001(\0132C." +
      "google.cloud.paymentgateway.issuerswitch" +
      ".v1.MerchantAdditionalInfo\"?\n\014MerchantNa" +
      "me\022\r\n\005brand\030\001 \001(\t\022\r\n\005legal\030\002 \001(\t\022\021\n\tfran" +
      "chise\030\003 \001(\t\"\251\006\n\026MerchantAdditionalInfo\022\025" +
      "\n\rcategory_code\030\001 \001(\t\022\020\n\010store_id\030\002 \001(\t\022" +
      "\023\n\013terminal_id\030\003 \001(\t\022V\n\004type\030\004 \001(\0162H.goo" +
      "gle.cloud.paymentgateway.issuerswitch.v1" +
      ".MerchantAdditionalInfo.Type\022X\n\005genre\030\005 " +
      "\001(\0162I.google.cloud.paymentgateway.issuer" +
      "switch.v1.MerchantAdditionalInfo.Genre\022k" +
      "\n\017onboarding_type\030\006 \001(\0162R.google.cloud.p" +
      "aymentgateway.issuerswitch.v1.MerchantAd" +
      "ditionalInfo.OnboardingType\022i\n\016ownership" +
      "_type\030\007 \001(\0162Q.google.cloud.paymentgatewa" +
      "y.issuerswitch.v1.MerchantAdditionalInfo" +
      ".OwnershipType\"2\n\004Type\022\024\n\020TYPE_UNSPECIFI" +
      "ED\020\000\022\t\n\005LARGE\020\001\022\t\n\005SMALL\020\002\"7\n\005Genre\022\025\n\021G" +
      "ENRE_UNSPECIFIED\020\000\022\013\n\007OFFLINE\020\001\022\n\n\006ONLIN" +
      "E\020\002\"b\n\016OnboardingType\022\037\n\033ONBOARDING_TYPE" +
      "_UNSPECIFIED\020\000\022\016\n\nAGGREGATOR\020\001\022\010\n\004BANK\020\002" +
      "\022\013\n\007NETWORK\020\003\022\010\n\004TPAP\020\004\"v\n\rOwnershipType" +
      "\022\036\n\032OWNERSHIP_TYPE_UNSPECIFIED\020\000\022\017\n\013PROP" +
      "RIETARY\020\001\022\017\n\013PARTNERSHIP\020\002\022\n\n\006PUBLIC\020\003\022\013" +
      "\n\007PRIVATE\020\004\022\n\n\006OTHERS\020\005*\273\002\n\007ApiType\022\030\n\024A" +
      "PI_TYPE_UNSPECIFIED\020\000\022\013\n\007BALANCE\020\001\022\020\n\014CH" +
      "ECK_STATUS\020\002\022\r\n\tCOMPLAINT\020\003\022\016\n\nHEART_BEA" +
      "T\020\004\022\031\n\025INITIATE_REGISTRATION\020\005\022\021\n\rLIST_A" +
      "CCOUNTS\020\006\022\013\n\007MANDATE\020\007\022\030\n\024MANDATE_CONFIR" +
      "MATION\020\010\022\022\n\016SETTLE_PAYMENT\020\t\022\026\n\022UPDATE_C" +
      "REDENTIALS\020\n\022\031\n\025VALIDATE_REGISTRATION\020\013\022" +
      "\025\n\021VALIDATE_CUSTOMER\020\014\022\013\n\007VOUCHER\020\r\022\030\n\024V" +
      "OUCHER_CONFIRMATION\020\016*\357\006\n\017TransactionTyp" +
      "e\022 \n\034TRANSACTION_TYPE_UNSPECIFIED\020\000\022\037\n\033T" +
      "RANSACTION_TYPE_AUTOUPDATE\020\001\022\"\n\036TRANSACT" +
      "ION_TYPE_BALANCE_CHECK\020\002\022$\n TRANSACTION_" +
      "TYPE_BALANCE_ENQUIRY\020\003\022!\n\035TRANSACTION_TY" +
      "PE_CHECK_STATUS\020\004\022&\n\"TRANSACTION_TYPE_CH" +
      "ECK_TRANSACTION\020\005\022\036\n\032TRANSACTION_TYPE_CO" +
      "MPLAINT\020\006\022\033\n\027TRANSACTION_TYPE_CREATE\020\007\022\033" +
      "\n\027TRANSACTION_TYPE_CREDIT\020\010\022\032\n\026TRANSACTI" +
      "ON_TYPE_DEBIT\020\t\022\034\n\030TRANSACTION_TYPE_DISP" +
      "UTE\020\n\022\037\n\033TRANSACTION_TYPE_HEART_BEAT\020\013\022\"" +
      "\n\036TRANSACTION_TYPE_LIST_ACCOUNTS\020\014\022)\n%TR" +
      "ANSACTION_TYPE_MANDATE_NOTIFICATION\020\r\022\030\n" +
      "\024TRANSACTION_TYPE_OTP\020\016\022\032\n\026TRANSACTION_T" +
      "YPE_PAUSE\020\017\022\033\n\027TRANSACTION_TYPE_REDEEM\020\020" +
      "\022\033\n\027TRANSACTION_TYPE_REFUND\020\021\022$\n TRANSAC" +
      "TION_TYPE_REGISTER_MOBILE\020\022\022\035\n\031TRANSACTI" +
      "ON_TYPE_REVERSAL\020\023\022\033\n\027TRANSACTION_TYPE_R" +
      "EVOKE\020\024\022\"\n\036TRANSACTION_TYPE_STATUS_UPDAT" +
      "E\020\025\022\034\n\030TRANSACTION_TYPE_UNPAUSE\020\026\022\033\n\027TRA" +
      "NSACTION_TYPE_UPDATE\020\027\022\'\n#TRANSACTION_TY" +
      "PE_UPDATE_CREDENTIALS\020\030\022&\n\"TRANSACTION_T" +
      "YPE_VALIDATE_CUSTOMER\020\031*\365\004\n\nXmlApiType\022\034" +
      "\n\030XML_API_TYPE_UNSPECIFIED\020\000\022\017\n\013REQ_BAL_" +
      "ENQ\020\001\022\017\n\013REQ_CHK_TXN\020\002\022\021\n\rREQ_COMPLAINT\020" +
      "\003\022\013\n\007REQ_HBT\020\004\022\024\n\020REQ_LIST_ACCOUNT\020\005\022\017\n\013" +
      "REQ_MANDATE\020\006\022\034\n\030REQ_MANDATE_CONFIRMATIO" +
      "N\020\007\022\013\n\007REQ_OTP\020\010\022\013\n\007REQ_PAY\020\t\022\017\n\013REQ_REG" +
      "_MOB\020\n\022\017\n\013REQ_SET_CRE\020\013\022\020\n\014REQ_VAL_CUST\020" +
      "\014\022\017\n\013REQ_VOUCHER\020\r\022\034\n\030REQ_VOUCHER_CONFIR" +
      "MATION\020\016\022\030\n\024REQ_TXN_CONFIRMATION\020\017\022\020\n\014RE" +
      "SP_BAL_ENQ\020\020\022\020\n\014RESP_CHK_TXN\020\021\022\022\n\016RESP_C" +
      "OMPLAINT\020\022\022\014\n\010RESP_HBT\020\023\022\025\n\021RESP_LIST_AC" +
      "COUNT\020\024\022\020\n\014RESP_MANDATE\020\025\022\035\n\031RESP_MANDAT" +
      "E_CONFIRMATION\020\026\022\014\n\010RESP_OTP\020\027\022\014\n\010RESP_P" +
      "AY\020\030\022\020\n\014RESP_REG_MOB\020\031\022\020\n\014RESP_SET_CRE\020\032" +
      "\022\021\n\rRESP_VAL_CUST\020\033\022\020\n\014RESP_VOUCHER\020\034\022\035\n" +
      "\031RESP_VOUCHER_CONFIRMATION\020\035\022\031\n\025RESP_TXN" +
      "_CONFIRMATION\020\036B\255\002\n/com.google.cloud.pay" +
      "mentgateway.issuerswitch.v1B\021CommonField" +
      "sProtoP\001ZWgoogle.golang.org/genproto/goo" +
      "gleapis/cloud/paymentgateway/issuerswitc" +
      "h/v1;issuerswitch\252\002+Google.Cloud.Payment" +
      "Gateway.IssuerSwitch.V1\312\002+Google\\Cloud\\P" +
      "aymentGateway\\IssuerSwitch\\V1\352\002/Google::" +
      "Cloud::PaymentGateway::IssuerSwitch::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_AccountReference_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_AccountReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_paymentgateway_issuerswitch_v1_AccountReference_descriptor,
        new java.lang.String[] { "IfscCode", "AccountType", "AccountNumber", });
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_SettlementParticipant_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_SettlementParticipant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_paymentgateway_issuerswitch_v1_SettlementParticipant_descriptor,
        new java.lang.String[] { "Participant", "Account", "MerchantInfo", "Mobile", "DeviceId", });
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_Participant_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_Participant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_paymentgateway_issuerswitch_v1_Participant_descriptor,
        new java.lang.String[] { "VirtualPaymentAddress", "Persona", "User", });
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantInfo_descriptor,
        new java.lang.String[] { "Id", "Merchant", "AdditionalInfo", });
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantName_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantName_descriptor,
        new java.lang.String[] { "Brand", "Legal", "Franchise", });
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantAdditionalInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantAdditionalInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_paymentgateway_issuerswitch_v1_MerchantAdditionalInfo_descriptor,
        new java.lang.String[] { "CategoryCode", "StoreId", "TerminalId", "Type", "Genre", "OnboardingType", "OwnershipType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}