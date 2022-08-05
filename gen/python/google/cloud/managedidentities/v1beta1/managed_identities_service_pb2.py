# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/managedidentities/v1beta1/managed_identities_service.proto
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
from google.cloud.managedidentities.v1beta1 import resource_pb2 as google_dot_cloud_dot_managedidentities_dot_v1beta1_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nGgoogle/cloud/managedidentities/v1beta1/managed_identities_service.proto\x12&google.cloud.managedidentities.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x35google/cloud/managedidentities/v1beta1/resource.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xdc\x01\n\nOpMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12#\n\x16requested_cancellation\x18\x05 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x06 \x01(\tB\x03\xe0\x41\x03\"\xc0\x01\n\x1e\x43reateMicrosoftAdDomainRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\x12\'managedidentities.googleapis.com/Domain\x12\x18\n\x0b\x64omain_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x43\n\x06\x64omain\x18\x03 \x01(\x0b\x32..google.cloud.managedidentities.v1beta1.DomainB\x03\xe0\x41\x02\"Z\n\x19ResetAdminPasswordRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\".\n\x1aResetAdminPasswordResponse\x12\x10\n\x08password\x18\x01 \x01(\t\"\x9e\x01\n\x12ListDomainsRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\x12\'managedidentities.googleapis.com/Domain\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x84\x01\n\x13ListDomainsResponse\x12?\n\x07\x64omains\x18\x01 \x03(\x0b\x32..google.cloud.managedidentities.v1beta1.Domain\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"Q\n\x10GetDomainRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\"\x90\x01\n\x13UpdateDomainRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x43\n\x06\x64omain\x18\x02 \x01(\x0b\x32..google.cloud.managedidentities.v1beta1.DomainB\x03\xe0\x41\x02\"T\n\x13\x44\x65leteDomainRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\"\x96\x01\n\x12\x41ttachTrustRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\x12\x41\n\x05trust\x18\x02 \x01(\x0b\x32-.google.cloud.managedidentities.v1beta1.TrustB\x03\xe0\x41\x02\"\x9f\x01\n\x17ReconfigureTrustRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\x12\x1f\n\x12target_domain_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12$\n\x17target_dns_ip_addresses\x18\x03 \x03(\tB\x03\xe0\x41\x02\"\x96\x01\n\x12\x44\x65tachTrustRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\x12\x41\n\x05trust\x18\x02 \x01(\x0b\x32-.google.cloud.managedidentities.v1beta1.TrustB\x03\xe0\x41\x02\"\x98\x01\n\x14ValidateTrustRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'managedidentities.googleapis.com/Domain\x12\x41\n\x05trust\x18\x02 \x01(\x0b\x32-.google.cloud.managedidentities.v1beta1.TrustB\x03\xe0\x41\x02\x32\xe5\x12\n\x18ManagedIdentitiesService\x12\xfa\x01\n\x17\x43reateMicrosoftAdDomain\x12\x46.google.cloud.managedidentities.v1beta1.CreateMicrosoftAdDomainRequest\x1a\x1d.google.longrunning.Operation\"x\x82\xd3\xe4\x93\x02?\"5/v1beta1/{parent=projects/*/locations/global}/domains:\x06\x64omain\xda\x41\x19parent,domain_name,domain\xca\x41\x14\n\x06\x44omain\x12\nOpMetadata\x12\xf7\x01\n\x12ResetAdminPassword\x12\x41.google.cloud.managedidentities.v1beta1.ResetAdminPasswordRequest\x1a\x42.google.cloud.managedidentities.v1beta1.ResetAdminPasswordResponse\"Z\x82\xd3\xe4\x93\x02M\"H/v1beta1/{name=projects/*/locations/global/domains/*}:resetAdminPassword:\x01*\xda\x41\x04name\x12\xce\x01\n\x0bListDomains\x12:.google.cloud.managedidentities.v1beta1.ListDomainsRequest\x1a;.google.cloud.managedidentities.v1beta1.ListDomainsResponse\"F\x82\xd3\xe4\x93\x02\x37\x12\x35/v1beta1/{parent=projects/*/locations/global}/domains\xda\x41\x06parent\x12\xbb\x01\n\tGetDomain\x12\x38.google.cloud.managedidentities.v1beta1.GetDomainRequest\x1a..google.cloud.managedidentities.v1beta1.Domain\"D\x82\xd3\xe4\x93\x02\x37\x12\x35/v1beta1/{name=projects/*/locations/global/domains/*}\xda\x41\x04name\x12\xe4\x01\n\x0cUpdateDomain\x12;.google.cloud.managedidentities.v1beta1.UpdateDomainRequest\x1a\x1d.google.longrunning.Operation\"x\x82\xd3\xe4\x93\x02\x46\x32</v1beta1/{domain.name=projects/*/locations/global/domains/*}:\x06\x64omain\xda\x41\x12\x64omain,update_mask\xca\x41\x14\n\x06\x44omain\x12\nOpMetadata\x12\xd6\x01\n\x0c\x44\x65leteDomain\x12;.google.cloud.managedidentities.v1beta1.DeleteDomainRequest\x1a\x1d.google.longrunning.Operation\"j\x82\xd3\xe4\x93\x02\x37*5/v1beta1/{name=projects/*/locations/global/domains/*}\xda\x41\x04name\xca\x41#\n\x15google.protobuf.Empty\x12\nOpMetadata\x12\xda\x01\n\x0b\x41ttachTrust\x12:.google.cloud.managedidentities.v1beta1.AttachTrustRequest\x1a\x1d.google.longrunning.Operation\"p\x82\xd3\xe4\x93\x02\x46\"A/v1beta1/{name=projects/*/locations/global/domains/*}:attachTrust:\x01*\xda\x41\nname,trust\xca\x41\x14\n\x06\x44omain\x12\nOpMetadata\x12\x8f\x02\n\x10ReconfigureTrust\x12?.google.cloud.managedidentities.v1beta1.ReconfigureTrustRequest\x1a\x1d.google.longrunning.Operation\"\x9a\x01\x82\xd3\xe4\x93\x02K\"F/v1beta1/{name=projects/*/locations/global/domains/*}:reconfigureTrust:\x01*\xda\x41/name,target_domain_name,target_dns_ip_addresses\xca\x41\x14\n\x06\x44omain\x12\nOpMetadata\x12\xda\x01\n\x0b\x44\x65tachTrust\x12:.google.cloud.managedidentities.v1beta1.DetachTrustRequest\x1a\x1d.google.longrunning.Operation\"p\x82\xd3\xe4\x93\x02\x46\"A/v1beta1/{name=projects/*/locations/global/domains/*}:detachTrust:\x01*\xda\x41\nname,trust\xca\x41\x14\n\x06\x44omain\x12\nOpMetadata\x12\xe0\x01\n\rValidateTrust\x12<.google.cloud.managedidentities.v1beta1.ValidateTrustRequest\x1a\x1d.google.longrunning.Operation\"r\x82\xd3\xe4\x93\x02H\"C/v1beta1/{name=projects/*/locations/global/domains/*}:validateTrust:\x01*\xda\x41\nname,trust\xca\x41\x14\n\x06\x44omain\x12\nOpMetadata\x1aT\xca\x41 managedidentities.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xab\x02\n*com.google.cloud.managedidentities.v1beta1B\x1dManagedIdentitiesServiceProtoP\x01ZWgoogle.golang.org/genproto/googleapis/cloud/managedidentities/v1beta1;managedidentities\xa2\x02\x04GCMI\xaa\x02&Google.Cloud.ManagedIdentities.V1Beta1\xca\x02&Google\\Cloud\\ManagedIdentities\\V1beta1\xea\x02)Google::Cloud::ManagedIdentities::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.managedidentities.v1beta1.managed_identities_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.managedidentities.v1beta1B\035ManagedIdentitiesServiceProtoP\001ZWgoogle.golang.org/genproto/googleapis/cloud/managedidentities/v1beta1;managedidentities\242\002\004GCMI\252\002&Google.Cloud.ManagedIdentities.V1Beta1\312\002&Google\\Cloud\\ManagedIdentities\\V1beta1\352\002)Google::Cloud::ManagedIdentities::V1beta1'
  _OPMETADATA.fields_by_name['create_time']._options = None
  _OPMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _OPMETADATA.fields_by_name['end_time']._options = None
  _OPMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _OPMETADATA.fields_by_name['target']._options = None
  _OPMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _OPMETADATA.fields_by_name['verb']._options = None
  _OPMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _OPMETADATA.fields_by_name['requested_cancellation']._options = None
  _OPMETADATA.fields_by_name['requested_cancellation']._serialized_options = b'\340A\003'
  _OPMETADATA.fields_by_name['api_version']._options = None
  _OPMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _CREATEMICROSOFTADDOMAINREQUEST.fields_by_name['parent']._options = None
  _CREATEMICROSOFTADDOMAINREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\022\'managedidentities.googleapis.com/Domain'
  _CREATEMICROSOFTADDOMAINREQUEST.fields_by_name['domain_name']._options = None
  _CREATEMICROSOFTADDOMAINREQUEST.fields_by_name['domain_name']._serialized_options = b'\340A\002'
  _CREATEMICROSOFTADDOMAINREQUEST.fields_by_name['domain']._options = None
  _CREATEMICROSOFTADDOMAINREQUEST.fields_by_name['domain']._serialized_options = b'\340A\002'
  _RESETADMINPASSWORDREQUEST.fields_by_name['name']._options = None
  _RESETADMINPASSWORDREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _LISTDOMAINSREQUEST.fields_by_name['parent']._options = None
  _LISTDOMAINSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\022\'managedidentities.googleapis.com/Domain'
  _GETDOMAINREQUEST.fields_by_name['name']._options = None
  _GETDOMAINREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _UPDATEDOMAINREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEDOMAINREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATEDOMAINREQUEST.fields_by_name['domain']._options = None
  _UPDATEDOMAINREQUEST.fields_by_name['domain']._serialized_options = b'\340A\002'
  _DELETEDOMAINREQUEST.fields_by_name['name']._options = None
  _DELETEDOMAINREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _ATTACHTRUSTREQUEST.fields_by_name['name']._options = None
  _ATTACHTRUSTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _ATTACHTRUSTREQUEST.fields_by_name['trust']._options = None
  _ATTACHTRUSTREQUEST.fields_by_name['trust']._serialized_options = b'\340A\002'
  _RECONFIGURETRUSTREQUEST.fields_by_name['name']._options = None
  _RECONFIGURETRUSTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _RECONFIGURETRUSTREQUEST.fields_by_name['target_domain_name']._options = None
  _RECONFIGURETRUSTREQUEST.fields_by_name['target_domain_name']._serialized_options = b'\340A\002'
  _RECONFIGURETRUSTREQUEST.fields_by_name['target_dns_ip_addresses']._options = None
  _RECONFIGURETRUSTREQUEST.fields_by_name['target_dns_ip_addresses']._serialized_options = b'\340A\002'
  _DETACHTRUSTREQUEST.fields_by_name['name']._options = None
  _DETACHTRUSTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _DETACHTRUSTREQUEST.fields_by_name['trust']._options = None
  _DETACHTRUSTREQUEST.fields_by_name['trust']._serialized_options = b'\340A\002'
  _VALIDATETRUSTREQUEST.fields_by_name['name']._options = None
  _VALIDATETRUSTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'managedidentities.googleapis.com/Domain'
  _VALIDATETRUSTREQUEST.fields_by_name['trust']._options = None
  _VALIDATETRUSTREQUEST.fields_by_name['trust']._serialized_options = b'\340A\002'
  _MANAGEDIDENTITIESSERVICE._options = None
  _MANAGEDIDENTITIESSERVICE._serialized_options = b'\312A managedidentities.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['CreateMicrosoftAdDomain']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['CreateMicrosoftAdDomain']._serialized_options = b'\202\323\344\223\002?\"5/v1beta1/{parent=projects/*/locations/global}/domains:\006domain\332A\031parent,domain_name,domain\312A\024\n\006Domain\022\nOpMetadata'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ResetAdminPassword']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ResetAdminPassword']._serialized_options = b'\202\323\344\223\002M\"H/v1beta1/{name=projects/*/locations/global/domains/*}:resetAdminPassword:\001*\332A\004name'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ListDomains']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ListDomains']._serialized_options = b'\202\323\344\223\0027\0225/v1beta1/{parent=projects/*/locations/global}/domains\332A\006parent'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['GetDomain']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['GetDomain']._serialized_options = b'\202\323\344\223\0027\0225/v1beta1/{name=projects/*/locations/global/domains/*}\332A\004name'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['UpdateDomain']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['UpdateDomain']._serialized_options = b'\202\323\344\223\002F2</v1beta1/{domain.name=projects/*/locations/global/domains/*}:\006domain\332A\022domain,update_mask\312A\024\n\006Domain\022\nOpMetadata'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['DeleteDomain']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['DeleteDomain']._serialized_options = b'\202\323\344\223\0027*5/v1beta1/{name=projects/*/locations/global/domains/*}\332A\004name\312A#\n\025google.protobuf.Empty\022\nOpMetadata'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['AttachTrust']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['AttachTrust']._serialized_options = b'\202\323\344\223\002F\"A/v1beta1/{name=projects/*/locations/global/domains/*}:attachTrust:\001*\332A\nname,trust\312A\024\n\006Domain\022\nOpMetadata'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ReconfigureTrust']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ReconfigureTrust']._serialized_options = b'\202\323\344\223\002K\"F/v1beta1/{name=projects/*/locations/global/domains/*}:reconfigureTrust:\001*\332A/name,target_domain_name,target_dns_ip_addresses\312A\024\n\006Domain\022\nOpMetadata'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['DetachTrust']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['DetachTrust']._serialized_options = b'\202\323\344\223\002F\"A/v1beta1/{name=projects/*/locations/global/domains/*}:detachTrust:\001*\332A\nname,trust\312A\024\n\006Domain\022\nOpMetadata'
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ValidateTrust']._options = None
  _MANAGEDIDENTITIESSERVICE.methods_by_name['ValidateTrust']._serialized_options = b'\202\323\344\223\002H\"C/v1beta1/{name=projects/*/locations/global/domains/*}:validateTrust:\001*\332A\nname,trust\312A\024\n\006Domain\022\nOpMetadata'
  _OPMETADATA._serialized_start=390
  _OPMETADATA._serialized_end=610
  _CREATEMICROSOFTADDOMAINREQUEST._serialized_start=613
  _CREATEMICROSOFTADDOMAINREQUEST._serialized_end=805
  _RESETADMINPASSWORDREQUEST._serialized_start=807
  _RESETADMINPASSWORDREQUEST._serialized_end=897
  _RESETADMINPASSWORDRESPONSE._serialized_start=899
  _RESETADMINPASSWORDRESPONSE._serialized_end=945
  _LISTDOMAINSREQUEST._serialized_start=948
  _LISTDOMAINSREQUEST._serialized_end=1106
  _LISTDOMAINSRESPONSE._serialized_start=1109
  _LISTDOMAINSRESPONSE._serialized_end=1241
  _GETDOMAINREQUEST._serialized_start=1243
  _GETDOMAINREQUEST._serialized_end=1324
  _UPDATEDOMAINREQUEST._serialized_start=1327
  _UPDATEDOMAINREQUEST._serialized_end=1471
  _DELETEDOMAINREQUEST._serialized_start=1473
  _DELETEDOMAINREQUEST._serialized_end=1557
  _ATTACHTRUSTREQUEST._serialized_start=1560
  _ATTACHTRUSTREQUEST._serialized_end=1710
  _RECONFIGURETRUSTREQUEST._serialized_start=1713
  _RECONFIGURETRUSTREQUEST._serialized_end=1872
  _DETACHTRUSTREQUEST._serialized_start=1875
  _DETACHTRUSTREQUEST._serialized_end=2025
  _VALIDATETRUSTREQUEST._serialized_start=2028
  _VALIDATETRUSTREQUEST._serialized_end=2180
  _MANAGEDIDENTITIESSERVICE._serialized_start=2183
  _MANAGEDIDENTITIESSERVICE._serialized_end=4588
# @@protoc_insertion_point(module_scope)
