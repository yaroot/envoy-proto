# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/domains/v1beta1/domains.proto
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
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import money_pb2 as google_dot_type_dot_money__pb2
from google.type import postal_address_pb2 as google_dot_type_dot_postal__address__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/domains/v1beta1/domains.proto\x12\x1cgoogle.cloud.domains.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/type/money.proto\x1a google/type/postal_address.proto\"\x93\t\n\x0cRegistration\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0b\x64omain_name\x18\x02 \x01(\tB\x06\xe0\x41\x02\xe0\x41\x05\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0b\x65xpire_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x44\n\x05state\x18\x07 \x01(\x0e\x32\x30.google.cloud.domains.v1beta1.Registration.StateB\x03\xe0\x41\x03\x12\x45\n\x06issues\x18\x08 \x03(\x0e\x32\x30.google.cloud.domains.v1beta1.Registration.IssueB\x03\xe0\x41\x03\x12\x46\n\x06labels\x18\t \x03(\x0b\x32\x36.google.cloud.domains.v1beta1.Registration.LabelsEntry\x12M\n\x13management_settings\x18\n \x01(\x0b\x32\x30.google.cloud.domains.v1beta1.ManagementSettings\x12?\n\x0c\x64ns_settings\x18\x0b \x01(\x0b\x32).google.cloud.domains.v1beta1.DnsSettings\x12L\n\x10\x63ontact_settings\x18\x0c \x01(\x0b\x32-.google.cloud.domains.v1beta1.ContactSettingsB\x03\xe0\x41\x02\x12T\n\x18pending_contact_settings\x18\r \x01(\x0b\x32-.google.cloud.domains.v1beta1.ContactSettingsB\x03\xe0\x41\x03\x12L\n\x11supported_privacy\x18\x0e \x03(\x0e\x32,.google.cloud.domains.v1beta1.ContactPrivacyB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xa5\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x18\n\x14REGISTRATION_PENDING\x10\x01\x12\x17\n\x13REGISTRATION_FAILED\x10\x02\x12\x14\n\x10TRANSFER_PENDING\x10\x03\x12\x13\n\x0fTRANSFER_FAILED\x10\x04\x12\n\n\x06\x41\x43TIVE\x10\x06\x12\r\n\tSUSPENDED\x10\x07\x12\x0c\n\x08\x45XPORTED\x10\x08\"I\n\x05Issue\x12\x15\n\x11ISSUE_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x43ONTACT_SUPPORT\x10\x01\x12\x14\n\x10UNVERIFIED_EMAIL\x10\x02:n\xea\x41k\n#domains.googleapis.com/Registration\x12\x44projects/{project}/locations/{location}/registrations/{registration}\"\x9b\x02\n\x12ManagementSettings\x12[\n\x0erenewal_method\x18\x03 \x01(\x0e\x32>.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethodB\x03\xe0\x41\x03\x12L\n\x13transfer_lock_state\x18\x04 \x01(\x0e\x32/.google.cloud.domains.v1beta1.TransferLockState\"Z\n\rRenewalMethod\x12\x1e\n\x1aRENEWAL_METHOD_UNSPECIFIED\x10\x00\x12\x15\n\x11\x41UTOMATIC_RENEWAL\x10\x01\x12\x12\n\x0eMANUAL_RENEWAL\x10\x02\"\xc6\n\n\x0b\x44nsSettings\x12I\n\ncustom_dns\x18\x01 \x01(\x0b\x32\x33.google.cloud.domains.v1beta1.DnsSettings.CustomDnsH\x00\x12X\n\x12google_domains_dns\x18\x02 \x01(\x0b\x32:.google.cloud.domains.v1beta1.DnsSettings.GoogleDomainsDnsH\x00\x12J\n\x0cglue_records\x18\x04 \x03(\x0b\x32\x34.google.cloud.domains.v1beta1.DnsSettings.GlueRecord\x1an\n\tCustomDns\x12\x19\n\x0cname_servers\x18\x01 \x03(\tB\x03\xe0\x41\x02\x12\x46\n\nds_records\x18\x02 \x03(\x0b\x32\x32.google.cloud.domains.v1beta1.DnsSettings.DsRecord\x1a\xc4\x01\n\x10GoogleDomainsDns\x12\x19\n\x0cname_servers\x18\x01 \x03(\tB\x03\xe0\x41\x03\x12H\n\x08\x64s_state\x18\x02 \x01(\x0e\x32\x31.google.cloud.domains.v1beta1.DnsSettings.DsStateB\x03\xe0\x41\x02\x12K\n\nds_records\x18\x03 \x03(\x0b\x32\x32.google.cloud.domains.v1beta1.DnsSettings.DsRecordB\x03\xe0\x41\x03\x1a\xcd\x04\n\x08\x44sRecord\x12\x0f\n\x07key_tag\x18\x01 \x01(\x05\x12O\n\talgorithm\x18\x02 \x01(\x0e\x32<.google.cloud.domains.v1beta1.DnsSettings.DsRecord.Algorithm\x12R\n\x0b\x64igest_type\x18\x03 \x01(\x0e\x32=.google.cloud.domains.v1beta1.DnsSettings.DsRecord.DigestType\x12\x0e\n\x06\x64igest\x18\x04 \x01(\t\"\x9f\x02\n\tAlgorithm\x12\x19\n\x15\x41LGORITHM_UNSPECIFIED\x10\x00\x12\n\n\x06RSAMD5\x10\x01\x12\x06\n\x02\x44H\x10\x02\x12\x07\n\x03\x44SA\x10\x03\x12\x07\n\x03\x45\x43\x43\x10\x04\x12\x0b\n\x07RSASHA1\x10\x05\x12\x10\n\x0c\x44SANSEC3SHA1\x10\x06\x12\x14\n\x10RSASHA1NSEC3SHA1\x10\x07\x12\r\n\tRSASHA256\x10\x08\x12\r\n\tRSASHA512\x10\n\x12\x0b\n\x07\x45\x43\x43GOST\x10\x0c\x12\x13\n\x0f\x45\x43\x44SAP256SHA256\x10\r\x12\x13\n\x0f\x45\x43\x44SAP384SHA384\x10\x0e\x12\x0b\n\x07\x45\x44\x32\x35\x35\x31\x39\x10\x0f\x12\t\n\x05\x45\x44\x34\x34\x38\x10\x10\x12\r\n\x08INDIRECT\x10\xfc\x01\x12\x0f\n\nPRIVATEDNS\x10\xfd\x01\x12\x0f\n\nPRIVATEOID\x10\xfe\x01\"Y\n\nDigestType\x12\x1b\n\x17\x44IGEST_TYPE_UNSPECIFIED\x10\x00\x12\x08\n\x04SHA1\x10\x01\x12\n\n\x06SHA256\x10\x02\x12\x0c\n\x08GOST3411\x10\x03\x12\n\n\x06SHA384\x10\x04\x1aT\n\nGlueRecord\x12\x16\n\thost_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\x0eipv4_addresses\x18\x02 \x03(\t\x12\x16\n\x0eipv6_addresses\x18\x03 \x03(\t\"Y\n\x07\x44sState\x12\x18\n\x14\x44S_STATE_UNSPECIFIED\x10\x00\x12\x1a\n\x16\x44S_RECORDS_UNPUBLISHED\x10\x01\x12\x18\n\x14\x44S_RECORDS_PUBLISHED\x10\x02\x42\x0e\n\x0c\x64ns_provider\"\xdf\x03\n\x0f\x43ontactSettings\x12\x42\n\x07privacy\x18\x01 \x01(\x0e\x32,.google.cloud.domains.v1beta1.ContactPrivacyB\x03\xe0\x41\x02\x12V\n\x12registrant_contact\x18\x02 \x01(\x0b\x32\x35.google.cloud.domains.v1beta1.ContactSettings.ContactB\x03\xe0\x41\x02\x12Q\n\radmin_contact\x18\x03 \x01(\x0b\x32\x35.google.cloud.domains.v1beta1.ContactSettings.ContactB\x03\xe0\x41\x02\x12U\n\x11technical_contact\x18\x04 \x01(\x0b\x32\x35.google.cloud.domains.v1beta1.ContactSettings.ContactB\x03\xe0\x41\x02\x1a\x85\x01\n\x07\x43ontact\x12\x37\n\x0epostal_address\x18\x01 \x01(\x0b\x32\x1a.google.type.PostalAddressB\x03\xe0\x41\x02\x12\x12\n\x05\x65mail\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x19\n\x0cphone_number\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\nfax_number\x18\x04 \x01(\t\"g\n\x14SearchDomainsRequest\x12\x12\n\x05query\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12;\n\x08location\x18\x02 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\"f\n\x15SearchDomainsResponse\x12M\n\x13register_parameters\x18\x01 \x03(\x0b\x32\x30.google.cloud.domains.v1beta1.RegisterParameters\"z\n!RetrieveRegisterParametersRequest\x12\x18\n\x0b\x64omain_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12;\n\x08location\x18\x02 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\"s\n\"RetrieveRegisterParametersResponse\x12M\n\x13register_parameters\x18\x01 \x01(\x0b\x32\x30.google.cloud.domains.v1beta1.RegisterParameters\"\xe9\x02\n\x15RegisterDomainRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x45\n\x0cregistration\x18\x02 \x01(\x0b\x32*.google.cloud.domains.v1beta1.RegistrationB\x03\xe0\x41\x02\x12\x42\n\x0e\x64omain_notices\x18\x03 \x03(\x0e\x32*.google.cloud.domains.v1beta1.DomainNotice\x12\x44\n\x0f\x63ontact_notices\x18\x04 \x03(\x0e\x32+.google.cloud.domains.v1beta1.ContactNotice\x12-\n\x0cyearly_price\x18\x05 \x01(\x0b\x32\x12.google.type.MoneyB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x06 \x01(\x08\"z\n!RetrieveTransferParametersRequest\x12\x18\n\x0b\x64omain_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12;\n\x08location\x18\x02 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\"s\n\"RetrieveTransferParametersResponse\x12M\n\x13transfer_parameters\x18\x01 \x01(\x0b\x32\x30.google.cloud.domains.v1beta1.TransferParameters\"\xf2\x02\n\x15TransferDomainRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x45\n\x0cregistration\x18\x02 \x01(\x0b\x32*.google.cloud.domains.v1beta1.RegistrationB\x03\xe0\x41\x02\x12\x44\n\x0f\x63ontact_notices\x18\x03 \x03(\x0e\x32+.google.cloud.domains.v1beta1.ContactNotice\x12-\n\x0cyearly_price\x18\x04 \x01(\x0b\x32\x12.google.type.MoneyB\x03\xe0\x41\x02\x12K\n\x12\x61uthorization_code\x18\x05 \x01(\x0b\x32/.google.cloud.domains.v1beta1.AuthorizationCode\x12\x15\n\rvalidate_only\x18\x06 \x01(\x08\"\x8c\x01\n\x18ListRegistrationsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"w\n\x19ListRegistrationsResponse\x12\x41\n\rregistrations\x18\x01 \x03(\x0b\x32*.google.cloud.domains.v1beta1.Registration\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"S\n\x16GetRegistrationRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\"\x93\x01\n\x19UpdateRegistrationRequest\x12@\n\x0cregistration\x18\x01 \x01(\x0b\x32*.google.cloud.domains.v1beta1.Registration\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"\xec\x01\n\"ConfigureManagementSettingsRequest\x12\x41\n\x0cregistration\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\x12M\n\x13management_settings\x18\x02 \x01(\x0b\x32\x30.google.cloud.domains.v1beta1.ManagementSettings\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"\xee\x01\n\x1b\x43onfigureDnsSettingsRequest\x12\x41\n\x0cregistration\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\x12?\n\x0c\x64ns_settings\x18\x02 \x01(\x0b\x32).google.cloud.domains.v1beta1.DnsSettings\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xc0\x02\n\x1f\x43onfigureContactSettingsRequest\x12\x41\n\x0cregistration\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\x12G\n\x10\x63ontact_settings\x18\x02 \x01(\x0b\x32-.google.cloud.domains.v1beta1.ContactSettings\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x44\n\x0f\x63ontact_notices\x18\x04 \x03(\x0e\x32+.google.cloud.domains.v1beta1.ContactNotice\x12\x15\n\rvalidate_only\x18\x05 \x01(\x08\"V\n\x19\x45xportRegistrationRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\"V\n\x19\x44\x65leteRegistrationRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\"e\n RetrieveAuthorizationCodeRequest\x12\x41\n\x0cregistration\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\"b\n\x1dResetAuthorizationCodeRequest\x12\x41\n\x0cregistration\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#domains.googleapis.com/Registration\"\xa1\x03\n\x12RegisterParameters\x12\x13\n\x0b\x64omain_name\x18\x01 \x01(\t\x12S\n\x0c\x61vailability\x18\x02 \x01(\x0e\x32=.google.cloud.domains.v1beta1.RegisterParameters.Availability\x12G\n\x11supported_privacy\x18\x03 \x03(\x0e\x32,.google.cloud.domains.v1beta1.ContactPrivacy\x12\x42\n\x0e\x64omain_notices\x18\x04 \x03(\x0e\x32*.google.cloud.domains.v1beta1.DomainNotice\x12(\n\x0cyearly_price\x18\x05 \x01(\x0b\x32\x12.google.type.Money\"j\n\x0c\x41vailability\x12\x1c\n\x18\x41VAILABILITY_UNSPECIFIED\x10\x00\x12\r\n\tAVAILABLE\x10\x01\x12\x0f\n\x0bUNAVAILABLE\x10\x02\x12\x0f\n\x0bUNSUPPORTED\x10\x03\x12\x0b\n\x07UNKNOWN\x10\x04\"\x9b\x02\n\x12TransferParameters\x12\x13\n\x0b\x64omain_name\x18\x01 \x01(\t\x12\x19\n\x11\x63urrent_registrar\x18\x02 \x01(\t\x12\x14\n\x0cname_servers\x18\x03 \x03(\t\x12L\n\x13transfer_lock_state\x18\x04 \x01(\x0e\x32/.google.cloud.domains.v1beta1.TransferLockState\x12G\n\x11supported_privacy\x18\x05 \x03(\x0e\x32,.google.cloud.domains.v1beta1.ContactPrivacy\x12(\n\x0cyearly_price\x18\x06 \x01(\x0b\x32\x12.google.type.Money\"!\n\x11\x41uthorizationCode\x12\x0c\n\x04\x63ode\x18\x01 \x01(\t\"\xbc\x01\n\x11OperationMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06target\x18\x03 \x01(\t\x12\x0c\n\x04verb\x18\x04 \x01(\t\x12\x15\n\rstatus_detail\x18\x05 \x01(\t\x12\x13\n\x0b\x61pi_version\x18\x06 \x01(\t*\x7f\n\x0e\x43ontactPrivacy\x12\x1f\n\x1b\x43ONTACT_PRIVACY_UNSPECIFIED\x10\x00\x12\x17\n\x13PUBLIC_CONTACT_DATA\x10\x01\x12\x18\n\x14PRIVATE_CONTACT_DATA\x10\x02\x12\x19\n\x15REDACTED_CONTACT_DATA\x10\x03*A\n\x0c\x44omainNotice\x12\x1d\n\x19\x44OMAIN_NOTICE_UNSPECIFIED\x10\x00\x12\x12\n\x0eHSTS_PRELOADED\x10\x01*X\n\rContactNotice\x12\x1e\n\x1a\x43ONTACT_NOTICE_UNSPECIFIED\x10\x00\x12\'\n#PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT\x10\x01*R\n\x11TransferLockState\x12#\n\x1fTRANSFER_LOCK_STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08UNLOCKED\x10\x01\x12\n\n\x06LOCKED\x10\x02\x32\xca\x1e\n\x07\x44omains\x12\xd9\x01\n\rSearchDomains\x12\x32.google.cloud.domains.v1beta1.SearchDomainsRequest\x1a\x33.google.cloud.domains.v1beta1.SearchDomainsResponse\"_\x82\xd3\xe4\x93\x02H\x12\x46/v1beta1/{location=projects/*/locations/*}/registrations:searchDomains\xda\x41\x0elocation,query\x12\x93\x02\n\x1aRetrieveRegisterParameters\x12?.google.cloud.domains.v1beta1.RetrieveRegisterParametersRequest\x1a@.google.cloud.domains.v1beta1.RetrieveRegisterParametersResponse\"r\x82\xd3\xe4\x93\x02U\x12S/v1beta1/{location=projects/*/locations/*}/registrations:retrieveRegisterParameters\xda\x41\x14location,domain_name\x12\xf8\x01\n\x0eRegisterDomain\x12\x33.google.cloud.domains.v1beta1.RegisterDomainRequest\x1a\x1d.google.longrunning.Operation\"\x91\x01\x82\xd3\xe4\x93\x02\x44\"?/v1beta1/{parent=projects/*/locations/*}/registrations:register:\x01*\xda\x41 parent,registration,yearly_price\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\x93\x02\n\x1aRetrieveTransferParameters\x12?.google.cloud.domains.v1beta1.RetrieveTransferParametersRequest\x1a@.google.cloud.domains.v1beta1.RetrieveTransferParametersResponse\"r\x82\xd3\xe4\x93\x02U\x12S/v1beta1/{location=projects/*/locations/*}/registrations:retrieveTransferParameters\xda\x41\x14location,domain_name\x12\x8b\x02\n\x0eTransferDomain\x12\x33.google.cloud.domains.v1beta1.TransferDomainRequest\x1a\x1d.google.longrunning.Operation\"\xa4\x01\x82\xd3\xe4\x93\x02\x44\"?/v1beta1/{parent=projects/*/locations/*}/registrations:transfer:\x01*\xda\x41\x33parent,registration,yearly_price,authorization_code\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\xcd\x01\n\x11ListRegistrations\x12\x36.google.cloud.domains.v1beta1.ListRegistrationsRequest\x1a\x37.google.cloud.domains.v1beta1.ListRegistrationsResponse\"G\x82\xd3\xe4\x93\x02\x38\x12\x36/v1beta1/{parent=projects/*/locations/*}/registrations\xda\x41\x06parent\x12\xba\x01\n\x0fGetRegistration\x12\x34.google.cloud.domains.v1beta1.GetRegistrationRequest\x1a*.google.cloud.domains.v1beta1.Registration\"E\x82\xd3\xe4\x93\x02\x38\x12\x36/v1beta1/{name=projects/*/locations/*/registrations/*}\xda\x41\x04name\x12\x87\x02\n\x12UpdateRegistration\x12\x37.google.cloud.domains.v1beta1.UpdateRegistrationRequest\x1a\x1d.google.longrunning.Operation\"\x98\x01\x82\xd3\xe4\x93\x02S2C/v1beta1/{registration.name=projects/*/locations/*/registrations/*}:\x0cregistration\xda\x41\x18registration,update_mask\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\xb9\x02\n\x1b\x43onfigureManagementSettings\x12@.google.cloud.domains.v1beta1.ConfigureManagementSettingsRequest\x1a\x1d.google.longrunning.Operation\"\xb8\x01\x82\xd3\xe4\x93\x02_\"Z/v1beta1/{registration=projects/*/locations/*/registrations/*}:configureManagementSettings:\x01*\xda\x41,registration,management_settings,update_mask\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\x9d\x02\n\x14\x43onfigureDnsSettings\x12\x39.google.cloud.domains.v1beta1.ConfigureDnsSettingsRequest\x1a\x1d.google.longrunning.Operation\"\xaa\x01\x82\xd3\xe4\x93\x02X\"S/v1beta1/{registration=projects/*/locations/*/registrations/*}:configureDnsSettings:\x01*\xda\x41%registration,dns_settings,update_mask\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\xad\x02\n\x18\x43onfigureContactSettings\x12=.google.cloud.domains.v1beta1.ConfigureContactSettingsRequest\x1a\x1d.google.longrunning.Operation\"\xb2\x01\x82\xd3\xe4\x93\x02\\\"W/v1beta1/{registration=projects/*/locations/*/registrations/*}:configureContactSettings:\x01*\xda\x41)registration,contact_settings,update_mask\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\xe1\x01\n\x12\x45xportRegistration\x12\x37.google.cloud.domains.v1beta1.ExportRegistrationRequest\x1a\x1d.google.longrunning.Operation\"s\x82\xd3\xe4\x93\x02\x42\"=/v1beta1/{name=projects/*/locations/*/registrations/*}:export:\x01*\xda\x41\x04name\xca\x41!\n\x0cRegistration\x12\x11OperationMetadata\x12\xe0\x01\n\x12\x44\x65leteRegistration\x12\x37.google.cloud.domains.v1beta1.DeleteRegistrationRequest\x1a\x1d.google.longrunning.Operation\"r\x82\xd3\xe4\x93\x02\x38*6/v1beta1/{name=projects/*/locations/*/registrations/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xfd\x01\n\x19RetrieveAuthorizationCode\x12>.google.cloud.domains.v1beta1.RetrieveAuthorizationCodeRequest\x1a/.google.cloud.domains.v1beta1.AuthorizationCode\"o\x82\xd3\xe4\x93\x02Z\x12X/v1beta1/{registration=projects/*/locations/*/registrations/*}:retrieveAuthorizationCode\xda\x41\x0cregistration\x12\xf7\x01\n\x16ResetAuthorizationCode\x12;.google.cloud.domains.v1beta1.ResetAuthorizationCodeRequest\x1a/.google.cloud.domains.v1beta1.AuthorizationCode\"o\x82\xd3\xe4\x93\x02Z\"U/v1beta1/{registration=projects/*/locations/*/registrations/*}:resetAuthorizationCode:\x01*\xda\x41\x0cregistration\x1aJ\xca\x41\x16\x64omains.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformBw\n com.google.cloud.domains.v1beta1B\x0c\x44omainsProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/domains/v1beta1;domainsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.domains.v1beta1.domains_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.google.cloud.domains.v1beta1B\014DomainsProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/domains/v1beta1;domains'
  _REGISTRATION_LABELSENTRY._options = None
  _REGISTRATION_LABELSENTRY._serialized_options = b'8\001'
  _REGISTRATION.fields_by_name['name']._options = None
  _REGISTRATION.fields_by_name['name']._serialized_options = b'\340A\003'
  _REGISTRATION.fields_by_name['domain_name']._options = None
  _REGISTRATION.fields_by_name['domain_name']._serialized_options = b'\340A\002\340A\005'
  _REGISTRATION.fields_by_name['create_time']._options = None
  _REGISTRATION.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _REGISTRATION.fields_by_name['expire_time']._options = None
  _REGISTRATION.fields_by_name['expire_time']._serialized_options = b'\340A\003'
  _REGISTRATION.fields_by_name['state']._options = None
  _REGISTRATION.fields_by_name['state']._serialized_options = b'\340A\003'
  _REGISTRATION.fields_by_name['issues']._options = None
  _REGISTRATION.fields_by_name['issues']._serialized_options = b'\340A\003'
  _REGISTRATION.fields_by_name['contact_settings']._options = None
  _REGISTRATION.fields_by_name['contact_settings']._serialized_options = b'\340A\002'
  _REGISTRATION.fields_by_name['pending_contact_settings']._options = None
  _REGISTRATION.fields_by_name['pending_contact_settings']._serialized_options = b'\340A\003'
  _REGISTRATION.fields_by_name['supported_privacy']._options = None
  _REGISTRATION.fields_by_name['supported_privacy']._serialized_options = b'\340A\003'
  _REGISTRATION._options = None
  _REGISTRATION._serialized_options = b'\352Ak\n#domains.googleapis.com/Registration\022Dprojects/{project}/locations/{location}/registrations/{registration}'
  _MANAGEMENTSETTINGS.fields_by_name['renewal_method']._options = None
  _MANAGEMENTSETTINGS.fields_by_name['renewal_method']._serialized_options = b'\340A\003'
  _DNSSETTINGS_CUSTOMDNS.fields_by_name['name_servers']._options = None
  _DNSSETTINGS_CUSTOMDNS.fields_by_name['name_servers']._serialized_options = b'\340A\002'
  _DNSSETTINGS_GOOGLEDOMAINSDNS.fields_by_name['name_servers']._options = None
  _DNSSETTINGS_GOOGLEDOMAINSDNS.fields_by_name['name_servers']._serialized_options = b'\340A\003'
  _DNSSETTINGS_GOOGLEDOMAINSDNS.fields_by_name['ds_state']._options = None
  _DNSSETTINGS_GOOGLEDOMAINSDNS.fields_by_name['ds_state']._serialized_options = b'\340A\002'
  _DNSSETTINGS_GOOGLEDOMAINSDNS.fields_by_name['ds_records']._options = None
  _DNSSETTINGS_GOOGLEDOMAINSDNS.fields_by_name['ds_records']._serialized_options = b'\340A\003'
  _DNSSETTINGS_GLUERECORD.fields_by_name['host_name']._options = None
  _DNSSETTINGS_GLUERECORD.fields_by_name['host_name']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS_CONTACT.fields_by_name['postal_address']._options = None
  _CONTACTSETTINGS_CONTACT.fields_by_name['postal_address']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS_CONTACT.fields_by_name['email']._options = None
  _CONTACTSETTINGS_CONTACT.fields_by_name['email']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS_CONTACT.fields_by_name['phone_number']._options = None
  _CONTACTSETTINGS_CONTACT.fields_by_name['phone_number']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS.fields_by_name['privacy']._options = None
  _CONTACTSETTINGS.fields_by_name['privacy']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS.fields_by_name['registrant_contact']._options = None
  _CONTACTSETTINGS.fields_by_name['registrant_contact']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS.fields_by_name['admin_contact']._options = None
  _CONTACTSETTINGS.fields_by_name['admin_contact']._serialized_options = b'\340A\002'
  _CONTACTSETTINGS.fields_by_name['technical_contact']._options = None
  _CONTACTSETTINGS.fields_by_name['technical_contact']._serialized_options = b'\340A\002'
  _SEARCHDOMAINSREQUEST.fields_by_name['query']._options = None
  _SEARCHDOMAINSREQUEST.fields_by_name['query']._serialized_options = b'\340A\002'
  _SEARCHDOMAINSREQUEST.fields_by_name['location']._options = None
  _SEARCHDOMAINSREQUEST.fields_by_name['location']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _RETRIEVEREGISTERPARAMETERSREQUEST.fields_by_name['domain_name']._options = None
  _RETRIEVEREGISTERPARAMETERSREQUEST.fields_by_name['domain_name']._serialized_options = b'\340A\002'
  _RETRIEVEREGISTERPARAMETERSREQUEST.fields_by_name['location']._options = None
  _RETRIEVEREGISTERPARAMETERSREQUEST.fields_by_name['location']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _REGISTERDOMAINREQUEST.fields_by_name['parent']._options = None
  _REGISTERDOMAINREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _REGISTERDOMAINREQUEST.fields_by_name['registration']._options = None
  _REGISTERDOMAINREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002'
  _REGISTERDOMAINREQUEST.fields_by_name['yearly_price']._options = None
  _REGISTERDOMAINREQUEST.fields_by_name['yearly_price']._serialized_options = b'\340A\002'
  _RETRIEVETRANSFERPARAMETERSREQUEST.fields_by_name['domain_name']._options = None
  _RETRIEVETRANSFERPARAMETERSREQUEST.fields_by_name['domain_name']._serialized_options = b'\340A\002'
  _RETRIEVETRANSFERPARAMETERSREQUEST.fields_by_name['location']._options = None
  _RETRIEVETRANSFERPARAMETERSREQUEST.fields_by_name['location']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _TRANSFERDOMAINREQUEST.fields_by_name['parent']._options = None
  _TRANSFERDOMAINREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _TRANSFERDOMAINREQUEST.fields_by_name['registration']._options = None
  _TRANSFERDOMAINREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002'
  _TRANSFERDOMAINREQUEST.fields_by_name['yearly_price']._options = None
  _TRANSFERDOMAINREQUEST.fields_by_name['yearly_price']._serialized_options = b'\340A\002'
  _LISTREGISTRATIONSREQUEST.fields_by_name['parent']._options = None
  _LISTREGISTRATIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _GETREGISTRATIONREQUEST.fields_by_name['name']._options = None
  _GETREGISTRATIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _UPDATEREGISTRATIONREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEREGISTRATIONREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _CONFIGUREMANAGEMENTSETTINGSREQUEST.fields_by_name['registration']._options = None
  _CONFIGUREMANAGEMENTSETTINGSREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _CONFIGUREMANAGEMENTSETTINGSREQUEST.fields_by_name['update_mask']._options = None
  _CONFIGUREMANAGEMENTSETTINGSREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _CONFIGUREDNSSETTINGSREQUEST.fields_by_name['registration']._options = None
  _CONFIGUREDNSSETTINGSREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _CONFIGUREDNSSETTINGSREQUEST.fields_by_name['update_mask']._options = None
  _CONFIGUREDNSSETTINGSREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _CONFIGURECONTACTSETTINGSREQUEST.fields_by_name['registration']._options = None
  _CONFIGURECONTACTSETTINGSREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _CONFIGURECONTACTSETTINGSREQUEST.fields_by_name['update_mask']._options = None
  _CONFIGURECONTACTSETTINGSREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _EXPORTREGISTRATIONREQUEST.fields_by_name['name']._options = None
  _EXPORTREGISTRATIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _DELETEREGISTRATIONREQUEST.fields_by_name['name']._options = None
  _DELETEREGISTRATIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _RETRIEVEAUTHORIZATIONCODEREQUEST.fields_by_name['registration']._options = None
  _RETRIEVEAUTHORIZATIONCODEREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _RESETAUTHORIZATIONCODEREQUEST.fields_by_name['registration']._options = None
  _RESETAUTHORIZATIONCODEREQUEST.fields_by_name['registration']._serialized_options = b'\340A\002\372A%\n#domains.googleapis.com/Registration'
  _DOMAINS._options = None
  _DOMAINS._serialized_options = b'\312A\026domains.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _DOMAINS.methods_by_name['SearchDomains']._options = None
  _DOMAINS.methods_by_name['SearchDomains']._serialized_options = b'\202\323\344\223\002H\022F/v1beta1/{location=projects/*/locations/*}/registrations:searchDomains\332A\016location,query'
  _DOMAINS.methods_by_name['RetrieveRegisterParameters']._options = None
  _DOMAINS.methods_by_name['RetrieveRegisterParameters']._serialized_options = b'\202\323\344\223\002U\022S/v1beta1/{location=projects/*/locations/*}/registrations:retrieveRegisterParameters\332A\024location,domain_name'
  _DOMAINS.methods_by_name['RegisterDomain']._options = None
  _DOMAINS.methods_by_name['RegisterDomain']._serialized_options = b'\202\323\344\223\002D\"?/v1beta1/{parent=projects/*/locations/*}/registrations:register:\001*\332A parent,registration,yearly_price\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['RetrieveTransferParameters']._options = None
  _DOMAINS.methods_by_name['RetrieveTransferParameters']._serialized_options = b'\202\323\344\223\002U\022S/v1beta1/{location=projects/*/locations/*}/registrations:retrieveTransferParameters\332A\024location,domain_name'
  _DOMAINS.methods_by_name['TransferDomain']._options = None
  _DOMAINS.methods_by_name['TransferDomain']._serialized_options = b'\202\323\344\223\002D\"?/v1beta1/{parent=projects/*/locations/*}/registrations:transfer:\001*\332A3parent,registration,yearly_price,authorization_code\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['ListRegistrations']._options = None
  _DOMAINS.methods_by_name['ListRegistrations']._serialized_options = b'\202\323\344\223\0028\0226/v1beta1/{parent=projects/*/locations/*}/registrations\332A\006parent'
  _DOMAINS.methods_by_name['GetRegistration']._options = None
  _DOMAINS.methods_by_name['GetRegistration']._serialized_options = b'\202\323\344\223\0028\0226/v1beta1/{name=projects/*/locations/*/registrations/*}\332A\004name'
  _DOMAINS.methods_by_name['UpdateRegistration']._options = None
  _DOMAINS.methods_by_name['UpdateRegistration']._serialized_options = b'\202\323\344\223\002S2C/v1beta1/{registration.name=projects/*/locations/*/registrations/*}:\014registration\332A\030registration,update_mask\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['ConfigureManagementSettings']._options = None
  _DOMAINS.methods_by_name['ConfigureManagementSettings']._serialized_options = b'\202\323\344\223\002_\"Z/v1beta1/{registration=projects/*/locations/*/registrations/*}:configureManagementSettings:\001*\332A,registration,management_settings,update_mask\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['ConfigureDnsSettings']._options = None
  _DOMAINS.methods_by_name['ConfigureDnsSettings']._serialized_options = b'\202\323\344\223\002X\"S/v1beta1/{registration=projects/*/locations/*/registrations/*}:configureDnsSettings:\001*\332A%registration,dns_settings,update_mask\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['ConfigureContactSettings']._options = None
  _DOMAINS.methods_by_name['ConfigureContactSettings']._serialized_options = b'\202\323\344\223\002\\\"W/v1beta1/{registration=projects/*/locations/*/registrations/*}:configureContactSettings:\001*\332A)registration,contact_settings,update_mask\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['ExportRegistration']._options = None
  _DOMAINS.methods_by_name['ExportRegistration']._serialized_options = b'\202\323\344\223\002B\"=/v1beta1/{name=projects/*/locations/*/registrations/*}:export:\001*\332A\004name\312A!\n\014Registration\022\021OperationMetadata'
  _DOMAINS.methods_by_name['DeleteRegistration']._options = None
  _DOMAINS.methods_by_name['DeleteRegistration']._serialized_options = b'\202\323\344\223\0028*6/v1beta1/{name=projects/*/locations/*/registrations/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _DOMAINS.methods_by_name['RetrieveAuthorizationCode']._options = None
  _DOMAINS.methods_by_name['RetrieveAuthorizationCode']._serialized_options = b'\202\323\344\223\002Z\022X/v1beta1/{registration=projects/*/locations/*/registrations/*}:retrieveAuthorizationCode\332A\014registration'
  _DOMAINS.methods_by_name['ResetAuthorizationCode']._options = None
  _DOMAINS.methods_by_name['ResetAuthorizationCode']._serialized_options = b'\202\323\344\223\002Z\"U/v1beta1/{registration=projects/*/locations/*/registrations/*}:resetAuthorizationCode:\001*\332A\014registration'
  _CONTACTPRIVACY._serialized_start=7690
  _CONTACTPRIVACY._serialized_end=7817
  _DOMAINNOTICE._serialized_start=7819
  _DOMAINNOTICE._serialized_end=7884
  _CONTACTNOTICE._serialized_start=7886
  _CONTACTNOTICE._serialized_end=7974
  _TRANSFERLOCKSTATE._serialized_start=7976
  _TRANSFERLOCKSTATE._serialized_end=8058
  _REGISTRATION._serialized_start=355
  _REGISTRATION._serialized_end=1526
  _REGISTRATION_LABELSENTRY._serialized_start=1126
  _REGISTRATION_LABELSENTRY._serialized_end=1171
  _REGISTRATION_STATE._serialized_start=1174
  _REGISTRATION_STATE._serialized_end=1339
  _REGISTRATION_ISSUE._serialized_start=1341
  _REGISTRATION_ISSUE._serialized_end=1414
  _MANAGEMENTSETTINGS._serialized_start=1529
  _MANAGEMENTSETTINGS._serialized_end=1812
  _MANAGEMENTSETTINGS_RENEWALMETHOD._serialized_start=1722
  _MANAGEMENTSETTINGS_RENEWALMETHOD._serialized_end=1812
  _DNSSETTINGS._serialized_start=1815
  _DNSSETTINGS._serialized_end=3165
  _DNSSETTINGS_CUSTOMDNS._serialized_start=2071
  _DNSSETTINGS_CUSTOMDNS._serialized_end=2181
  _DNSSETTINGS_GOOGLEDOMAINSDNS._serialized_start=2184
  _DNSSETTINGS_GOOGLEDOMAINSDNS._serialized_end=2380
  _DNSSETTINGS_DSRECORD._serialized_start=2383
  _DNSSETTINGS_DSRECORD._serialized_end=2972
  _DNSSETTINGS_DSRECORD_ALGORITHM._serialized_start=2594
  _DNSSETTINGS_DSRECORD_ALGORITHM._serialized_end=2881
  _DNSSETTINGS_DSRECORD_DIGESTTYPE._serialized_start=2883
  _DNSSETTINGS_DSRECORD_DIGESTTYPE._serialized_end=2972
  _DNSSETTINGS_GLUERECORD._serialized_start=2974
  _DNSSETTINGS_GLUERECORD._serialized_end=3058
  _DNSSETTINGS_DSSTATE._serialized_start=3060
  _DNSSETTINGS_DSSTATE._serialized_end=3149
  _CONTACTSETTINGS._serialized_start=3168
  _CONTACTSETTINGS._serialized_end=3647
  _CONTACTSETTINGS_CONTACT._serialized_start=3514
  _CONTACTSETTINGS_CONTACT._serialized_end=3647
  _SEARCHDOMAINSREQUEST._serialized_start=3649
  _SEARCHDOMAINSREQUEST._serialized_end=3752
  _SEARCHDOMAINSRESPONSE._serialized_start=3754
  _SEARCHDOMAINSRESPONSE._serialized_end=3856
  _RETRIEVEREGISTERPARAMETERSREQUEST._serialized_start=3858
  _RETRIEVEREGISTERPARAMETERSREQUEST._serialized_end=3980
  _RETRIEVEREGISTERPARAMETERSRESPONSE._serialized_start=3982
  _RETRIEVEREGISTERPARAMETERSRESPONSE._serialized_end=4097
  _REGISTERDOMAINREQUEST._serialized_start=4100
  _REGISTERDOMAINREQUEST._serialized_end=4461
  _RETRIEVETRANSFERPARAMETERSREQUEST._serialized_start=4463
  _RETRIEVETRANSFERPARAMETERSREQUEST._serialized_end=4585
  _RETRIEVETRANSFERPARAMETERSRESPONSE._serialized_start=4587
  _RETRIEVETRANSFERPARAMETERSRESPONSE._serialized_end=4702
  _TRANSFERDOMAINREQUEST._serialized_start=4705
  _TRANSFERDOMAINREQUEST._serialized_end=5075
  _LISTREGISTRATIONSREQUEST._serialized_start=5078
  _LISTREGISTRATIONSREQUEST._serialized_end=5218
  _LISTREGISTRATIONSRESPONSE._serialized_start=5220
  _LISTREGISTRATIONSRESPONSE._serialized_end=5339
  _GETREGISTRATIONREQUEST._serialized_start=5341
  _GETREGISTRATIONREQUEST._serialized_end=5424
  _UPDATEREGISTRATIONREQUEST._serialized_start=5427
  _UPDATEREGISTRATIONREQUEST._serialized_end=5574
  _CONFIGUREMANAGEMENTSETTINGSREQUEST._serialized_start=5577
  _CONFIGUREMANAGEMENTSETTINGSREQUEST._serialized_end=5813
  _CONFIGUREDNSSETTINGSREQUEST._serialized_start=5816
  _CONFIGUREDNSSETTINGSREQUEST._serialized_end=6054
  _CONFIGURECONTACTSETTINGSREQUEST._serialized_start=6057
  _CONFIGURECONTACTSETTINGSREQUEST._serialized_end=6377
  _EXPORTREGISTRATIONREQUEST._serialized_start=6379
  _EXPORTREGISTRATIONREQUEST._serialized_end=6465
  _DELETEREGISTRATIONREQUEST._serialized_start=6467
  _DELETEREGISTRATIONREQUEST._serialized_end=6553
  _RETRIEVEAUTHORIZATIONCODEREQUEST._serialized_start=6555
  _RETRIEVEAUTHORIZATIONCODEREQUEST._serialized_end=6656
  _RESETAUTHORIZATIONCODEREQUEST._serialized_start=6658
  _RESETAUTHORIZATIONCODEREQUEST._serialized_end=6756
  _REGISTERPARAMETERS._serialized_start=6759
  _REGISTERPARAMETERS._serialized_end=7176
  _REGISTERPARAMETERS_AVAILABILITY._serialized_start=7070
  _REGISTERPARAMETERS_AVAILABILITY._serialized_end=7176
  _TRANSFERPARAMETERS._serialized_start=7179
  _TRANSFERPARAMETERS._serialized_end=7462
  _AUTHORIZATIONCODE._serialized_start=7464
  _AUTHORIZATIONCODE._serialized_end=7497
  _OPERATIONMETADATA._serialized_start=7500
  _OPERATIONMETADATA._serialized_end=7688
  _DOMAINS._serialized_start=8061
  _DOMAINS._serialized_end=11975
# @@protoc_insertion_point(module_scope)