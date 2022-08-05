# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/paymentgateway/issuerswitch/v1/common_fields.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/cloud/paymentgateway/issuerswitch/v1/common_fields.proto\x12+google.cloud.paymentgateway.issuerswitch.v1\x1a\x1fgoogle/api/field_behavior.proto\"S\n\x10\x41\x63\x63ountReference\x12\x11\n\tifsc_code\x18\x01 \x01(\t\x12\x14\n\x0c\x61\x63\x63ount_type\x18\x02 \x01(\t\x12\x16\n\x0e\x61\x63\x63ount_number\x18\x03 \x01(\t\"\xb5\x02\n\x15SettlementParticipant\x12M\n\x0bparticipant\x18\x01 \x01(\x0b\x32\x38.google.cloud.paymentgateway.issuerswitch.v1.Participant\x12N\n\x07\x61\x63\x63ount\x18\x02 \x01(\x0b\x32=.google.cloud.paymentgateway.issuerswitch.v1.AccountReference\x12P\n\rmerchant_info\x18\x03 \x01(\x0b\x32\x39.google.cloud.paymentgateway.issuerswitch.v1.MerchantInfo\x12\x13\n\x06mobile\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\tdevice_id\x18\x05 \x01(\tB\x03\xe0\x41\x03\"\xcb\x01\n\x0bParticipant\x12\x1f\n\x17virtual_payment_address\x18\x01 \x01(\t\x12Q\n\x07persona\x18\x02 \x01(\x0e\x32@.google.cloud.paymentgateway.issuerswitch.v1.Participant.Persona\x12\x0c\n\x04user\x18\x03 \x01(\t\":\n\x07Persona\x12\x17\n\x13PERSONA_UNSPECIFIED\x10\x00\x12\n\n\x06\x45NTITY\x10\x01\x12\n\n\x06PERSON\x10\x02\"\xc5\x01\n\x0cMerchantInfo\x12\n\n\x02id\x18\x01 \x01(\t\x12K\n\x08merchant\x18\x02 \x01(\x0b\x32\x39.google.cloud.paymentgateway.issuerswitch.v1.MerchantName\x12\\\n\x0f\x61\x64\x64itional_info\x18\x03 \x01(\x0b\x32\x43.google.cloud.paymentgateway.issuerswitch.v1.MerchantAdditionalInfo\"?\n\x0cMerchantName\x12\r\n\x05\x62rand\x18\x01 \x01(\t\x12\r\n\x05legal\x18\x02 \x01(\t\x12\x11\n\tfranchise\x18\x03 \x01(\t\"\xa9\x06\n\x16MerchantAdditionalInfo\x12\x15\n\rcategory_code\x18\x01 \x01(\t\x12\x10\n\x08store_id\x18\x02 \x01(\t\x12\x13\n\x0bterminal_id\x18\x03 \x01(\t\x12V\n\x04type\x18\x04 \x01(\x0e\x32H.google.cloud.paymentgateway.issuerswitch.v1.MerchantAdditionalInfo.Type\x12X\n\x05genre\x18\x05 \x01(\x0e\x32I.google.cloud.paymentgateway.issuerswitch.v1.MerchantAdditionalInfo.Genre\x12k\n\x0fonboarding_type\x18\x06 \x01(\x0e\x32R.google.cloud.paymentgateway.issuerswitch.v1.MerchantAdditionalInfo.OnboardingType\x12i\n\x0eownership_type\x18\x07 \x01(\x0e\x32Q.google.cloud.paymentgateway.issuerswitch.v1.MerchantAdditionalInfo.OwnershipType\"2\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05LARGE\x10\x01\x12\t\n\x05SMALL\x10\x02\"7\n\x05Genre\x12\x15\n\x11GENRE_UNSPECIFIED\x10\x00\x12\x0b\n\x07OFFLINE\x10\x01\x12\n\n\x06ONLINE\x10\x02\"b\n\x0eOnboardingType\x12\x1f\n\x1bONBOARDING_TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nAGGREGATOR\x10\x01\x12\x08\n\x04\x42\x41NK\x10\x02\x12\x0b\n\x07NETWORK\x10\x03\x12\x08\n\x04TPAP\x10\x04\"v\n\rOwnershipType\x12\x1e\n\x1aOWNERSHIP_TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bPROPRIETARY\x10\x01\x12\x0f\n\x0bPARTNERSHIP\x10\x02\x12\n\n\x06PUBLIC\x10\x03\x12\x0b\n\x07PRIVATE\x10\x04\x12\n\n\x06OTHERS\x10\x05*\xfd\x01\n\x07\x41piType\x12\x18\n\x14\x41PI_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x42\x41LANCE\x10\x01\x12\x10\n\x0c\x43HECK_STATUS\x10\x02\x12\r\n\tCOMPLAINT\x10\x03\x12\x0e\n\nHEART_BEAT\x10\x04\x12\x19\n\x15INITIATE_REGISTRATION\x10\x05\x12\x11\n\rLIST_ACCOUNTS\x10\x06\x12\x0b\n\x07MANDATE\x10\x07\x12\x12\n\x0eSETTLE_PAYMENT\x10\x08\x12\x16\n\x12UPDATE_CREDENTIALS\x10\t\x12\x19\n\x15VALIDATE_REGISTRATION\x10\n\x12\x18\n\x14VOUCHER_CONFIRMATION\x10\x0b*\xe2\x05\n\x0fTransactionType\x12 \n\x1cTRANSACTION_TYPE_UNSPECIFIED\x10\x00\x12\x1f\n\x1bTRANSACTION_TYPE_AUTOUPDATE\x10\x01\x12\"\n\x1eTRANSACTION_TYPE_BALANCE_CHECK\x10\x03\x12$\n TRANSACTION_TYPE_BALANCE_ENQUIRY\x10\x04\x12!\n\x1dTRANSACTION_TYPE_CHECK_STATUS\x10\x05\x12&\n\"TRANSACTION_TYPE_CHECK_TRANSACTION\x10\x06\x12\x1e\n\x1aTRANSACTION_TYPE_COMPLAINT\x10\x07\x12\x1b\n\x17TRANSACTION_TYPE_CREATE\x10\x08\x12\x1b\n\x17TRANSACTION_TYPE_CREDIT\x10\t\x12\x1a\n\x16TRANSACTION_TYPE_DEBIT\x10\n\x12\x1c\n\x18TRANSACTION_TYPE_DISPUTE\x10\x0b\x12\x1f\n\x1bTRANSACTION_TYPE_HEART_BEAT\x10\x0c\x12\"\n\x1eTRANSACTION_TYPE_LIST_ACCOUNTS\x10\r\x12\x18\n\x14TRANSACTION_TYPE_OTP\x10\x0e\x12$\n TRANSACTION_TYPE_REGISTER_MOBILE\x10\x0f\x12\x1b\n\x17TRANSACTION_TYPE_REFUND\x10\x10\x12\x1d\n\x19TRANSACTION_TYPE_REVERSAL\x10\x11\x12\x1b\n\x17TRANSACTION_TYPE_REVOKE\x10\x12\x12\"\n\x1eTRANSACTION_TYPE_STATUS_UPDATE\x10\x13\x12\x1b\n\x17TRANSACTION_TYPE_UPDATE\x10\x14\x12\'\n#TRANSACTION_TYPE_UPDATE_CREDENTIALS\x10\x15\x12\x1b\n\x17TRANSACTION_TYPE_REDEEM\x10\x16\x42\xad\x02\n/com.google.cloud.paymentgateway.issuerswitch.v1B\x11\x43ommonFieldsProtoP\x01ZWgoogle.golang.org/genproto/googleapis/cloud/paymentgateway/issuerswitch/v1;issuerswitch\xaa\x02+Google.Cloud.PaymentGateway.IssuerSwitch.V1\xca\x02+Google\\Cloud\\PaymentGateway\\IssuerSwitch\\V1\xea\x02/Google::Cloud::PaymentGateway::IssuerSwitch::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.paymentgateway.issuerswitch.v1.common_fields_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n/com.google.cloud.paymentgateway.issuerswitch.v1B\021CommonFieldsProtoP\001ZWgoogle.golang.org/genproto/googleapis/cloud/paymentgateway/issuerswitch/v1;issuerswitch\252\002+Google.Cloud.PaymentGateway.IssuerSwitch.V1\312\002+Google\\Cloud\\PaymentGateway\\IssuerSwitch\\V1\352\002/Google::Cloud::PaymentGateway::IssuerSwitch::V1'
  _SETTLEMENTPARTICIPANT.fields_by_name['mobile']._options = None
  _SETTLEMENTPARTICIPANT.fields_by_name['mobile']._serialized_options = b'\340A\003'
  _SETTLEMENTPARTICIPANT.fields_by_name['device_id']._options = None
  _SETTLEMENTPARTICIPANT.fields_by_name['device_id']._serialized_options = b'\340A\003'
  _APITYPE._serialized_start=1826
  _APITYPE._serialized_end=2079
  _TRANSACTIONTYPE._serialized_start=2082
  _TRANSACTIONTYPE._serialized_end=2820
  _ACCOUNTREFERENCE._serialized_start=145
  _ACCOUNTREFERENCE._serialized_end=228
  _SETTLEMENTPARTICIPANT._serialized_start=231
  _SETTLEMENTPARTICIPANT._serialized_end=540
  _PARTICIPANT._serialized_start=543
  _PARTICIPANT._serialized_end=746
  _PARTICIPANT_PERSONA._serialized_start=688
  _PARTICIPANT_PERSONA._serialized_end=746
  _MERCHANTINFO._serialized_start=749
  _MERCHANTINFO._serialized_end=946
  _MERCHANTNAME._serialized_start=948
  _MERCHANTNAME._serialized_end=1011
  _MERCHANTADDITIONALINFO._serialized_start=1014
  _MERCHANTADDITIONALINFO._serialized_end=1823
  _MERCHANTADDITIONALINFO_TYPE._serialized_start=1496
  _MERCHANTADDITIONALINFO_TYPE._serialized_end=1546
  _MERCHANTADDITIONALINFO_GENRE._serialized_start=1548
  _MERCHANTADDITIONALINFO_GENRE._serialized_end=1603
  _MERCHANTADDITIONALINFO_ONBOARDINGTYPE._serialized_start=1605
  _MERCHANTADDITIONALINFO_ONBOARDINGTYPE._serialized_end=1703
  _MERCHANTADDITIONALINFO_OWNERSHIPTYPE._serialized_start=1705
  _MERCHANTADDITIONALINFO_OWNERSHIPTYPE._serialized_end=1823
# @@protoc_insertion_point(module_scope)
