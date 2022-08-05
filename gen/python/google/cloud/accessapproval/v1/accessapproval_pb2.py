# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/accessapproval/v1/accessapproval.proto
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
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/accessapproval/v1/accessapproval.proto\x12\x1egoogle.cloud.accessapproval.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"`\n\x0f\x41\x63\x63\x65ssLocations\x12 \n\x18principal_office_country\x18\x01 \x01(\t\x12+\n#principal_physical_location_country\x18\x02 \x01(\t\"\xa0\x02\n\x0c\x41\x63\x63\x65ssReason\x12?\n\x04type\x18\x01 \x01(\x0e\x32\x31.google.cloud.accessapproval.v1.AccessReason.Type\x12\x0e\n\x06\x64\x65tail\x18\x02 \x01(\t\"\xbe\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x1e\n\x1a\x43USTOMER_INITIATED_SUPPORT\x10\x01\x12\x1c\n\x18GOOGLE_INITIATED_SERVICE\x10\x02\x12\x1b\n\x17GOOGLE_INITIATED_REVIEW\x10\x03\x12\x1c\n\x18THIRD_PARTY_DATA_REQUEST\x10\x04\x12\'\n#GOOGLE_RESPONSE_TO_PRODUCTION_ALERT\x10\x05\"|\n\rSignatureInfo\x12\x11\n\tsignature\x18\x01 \x01(\x0c\x12\x1f\n\x15google_public_key_pem\x18\x02 \x01(\tH\x00\x12\"\n\x18\x63ustomer_kms_key_version\x18\x03 \x01(\tH\x00\x42\x13\n\x11verification_info\"\x87\x02\n\x0f\x41pproveDecision\x12\x30\n\x0c\x61pprove_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x65xpire_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x33\n\x0finvalidate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x45\n\x0esignature_info\x18\x04 \x01(\x0b\x32-.google.cloud.accessapproval.v1.SignatureInfo\x12\x15\n\rauto_approved\x18\x05 \x01(\x08\"U\n\x0f\x44ismissDecision\x12\x30\n\x0c\x64ismiss_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x10\n\x08implicit\x18\x02 \x01(\x08\"2\n\x12ResourceProperties\x12\x1c\n\x14\x65xcludes_descendants\x18\x01 \x01(\x08\"\x97\x06\n\x0f\x41pprovalRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x1f\n\x17requested_resource_name\x18\x02 \x01(\t\x12Y\n\x1drequested_resource_properties\x18\t \x01(\x0b\x32\x32.google.cloud.accessapproval.v1.ResourceProperties\x12\x46\n\x10requested_reason\x18\x03 \x01(\x0b\x32,.google.cloud.accessapproval.v1.AccessReason\x12L\n\x13requested_locations\x18\x04 \x01(\x0b\x32/.google.cloud.accessapproval.v1.AccessLocations\x12\x30\n\x0crequest_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x38\n\x14requested_expiration\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x42\n\x07\x61pprove\x18\x07 \x01(\x0b\x32/.google.cloud.accessapproval.v1.ApproveDecisionH\x00\x12\x42\n\x07\x64ismiss\x18\x08 \x01(\x0b\x32/.google.cloud.accessapproval.v1.DismissDecisionH\x00:\xe3\x01\xea\x41\xdf\x01\n-accessapproval.googleapis.com/ApprovalRequest\x12\x36projects/{project}/approvalRequests/{approval_request}\x12\x34\x66olders/{folder}/approvalRequests/{approval_request}\x12@organizations/{organization}/approvalRequests/{approval_request}B\n\n\x08\x64\x65\x63ision\"s\n\x0f\x45nrolledService\x12\x15\n\rcloud_product\x18\x01 \x01(\t\x12I\n\x10\x65nrollment_level\x18\x02 \x01(\x0e\x32/.google.cloud.accessapproval.v1.EnrollmentLevel\"\x9c\x04\n\x16\x41\x63\x63\x65ssApprovalSettings\x12G\n\x04name\x18\x01 \x01(\tB9\xfa\x41\x36\n4accessapproval.googleapis.com/AccessApprovalSettings\x12\x1b\n\x13notification_emails\x18\x02 \x03(\t\x12J\n\x11\x65nrolled_services\x18\x03 \x03(\x0b\x32/.google.cloud.accessapproval.v1.EnrolledService\x12\x1e\n\x11\x65nrolled_ancestor\x18\x04 \x01(\x08\x42\x03\xe0\x41\x03\x12\x1a\n\x12\x61\x63tive_key_version\x18\x06 \x01(\t\x12,\n\x1f\x61ncestor_has_active_key_version\x18\x07 \x01(\x08\x42\x03\xe0\x41\x03\x12 \n\x13invalid_key_version\x18\x08 \x01(\x08\x42\x03\xe0\x41\x03:\xc3\x01\xea\x41\xbf\x01\n4accessapproval.googleapis.com/AccessApprovalSettings\x12)projects/{project}/accessApprovalSettings\x12\'folders/{folder}/accessApprovalSettings\x12\x33organizations/{organization}/accessApprovalSettings\"\xb8\x02\n\x1c\x41\x63\x63\x65ssApprovalServiceAccount\x12M\n\x04name\x18\x01 \x01(\tB?\xfa\x41<\n:accessapproval.googleapis.com/AccessApprovalServiceAccount\x12\x15\n\raccount_email\x18\x02 \x01(\t:\xb1\x01\xea\x41\xad\x01\n:accessapproval.googleapis.com/AccessApprovalServiceAccount\x12!projects/{project}/serviceAccount\x12\x1f\x66olders/{folder}/serviceAccount\x12+organizations/{organization}/serviceAccount\"\x98\x01\n\x1bListApprovalRequestsMessage\x12\x42\n\x06parent\x18\x01 \x01(\tB2\xfa\x41/\x12-accessapproval.googleapis.com/ApprovalRequest\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"\x83\x01\n\x1cListApprovalRequestsResponse\x12J\n\x11\x61pproval_requests\x18\x01 \x03(\x0b\x32/.google.cloud.accessapproval.v1.ApprovalRequest\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"]\n\x19GetApprovalRequestMessage\x12@\n\x04name\x18\x01 \x01(\tB2\xfa\x41/\n-accessapproval.googleapis.com/ApprovalRequest\"\x92\x01\n\x1d\x41pproveApprovalRequestMessage\x12@\n\x04name\x18\x01 \x01(\tB2\xfa\x41/\n-accessapproval.googleapis.com/ApprovalRequest\x12/\n\x0b\x65xpire_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"a\n\x1d\x44ismissApprovalRequestMessage\x12@\n\x04name\x18\x01 \x01(\tB2\xfa\x41/\n-accessapproval.googleapis.com/ApprovalRequest\"d\n InvalidateApprovalRequestMessage\x12@\n\x04name\x18\x01 \x01(\tB2\xfa\x41/\n-accessapproval.googleapis.com/ApprovalRequest\"k\n GetAccessApprovalSettingsMessage\x12G\n\x04name\x18\x01 \x01(\tB9\xfa\x41\x36\n4accessapproval.googleapis.com/AccessApprovalSettings\"\xa0\x01\n#UpdateAccessApprovalSettingsMessage\x12H\n\x08settings\x18\x01 \x01(\x0b\x32\x36.google.cloud.accessapproval.v1.AccessApprovalSettings\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"n\n#DeleteAccessApprovalSettingsMessage\x12G\n\x04name\x18\x01 \x01(\tB9\xfa\x41\x36\n4accessapproval.googleapis.com/AccessApprovalSettings\"6\n&GetAccessApprovalServiceAccountMessage\x12\x0c\n\x04name\x18\x01 \x01(\t*B\n\x0f\x45nrollmentLevel\x12 \n\x1c\x45NROLLMENT_LEVEL_UNSPECIFIED\x10\x00\x12\r\n\tBLOCK_ALL\x10\x01\x32\x87\x17\n\x0e\x41\x63\x63\x65ssApproval\x12\xaa\x02\n\x14ListApprovalRequests\x12;.google.cloud.accessapproval.v1.ListApprovalRequestsMessage\x1a<.google.cloud.accessapproval.v1.ListApprovalRequestsResponse\"\x96\x01\x82\xd3\xe4\x93\x02\x86\x01\x12(/v1/{parent=projects/*}/approvalRequestsZ)\x12\'/v1/{parent=folders/*}/approvalRequestsZ/\x12-/v1/{parent=organizations/*}/approvalRequests\xda\x41\x06parent\x12\x97\x02\n\x12GetApprovalRequest\x12\x39.google.cloud.accessapproval.v1.GetApprovalRequestMessage\x1a/.google.cloud.accessapproval.v1.ApprovalRequest\"\x94\x01\x82\xd3\xe4\x93\x02\x86\x01\x12(/v1/{name=projects/*/approvalRequests/*}Z)\x12\'/v1/{name=folders/*/approvalRequests/*}Z/\x12-/v1/{name=organizations/*/approvalRequests/*}\xda\x41\x04name\x12\xb9\x02\n\x16\x41pproveApprovalRequest\x12=.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage\x1a/.google.cloud.accessapproval.v1.ApprovalRequest\"\xae\x01\x82\xd3\xe4\x93\x02\xa7\x01\"0/v1/{name=projects/*/approvalRequests/*}:approve:\x01*Z4\"//v1/{name=folders/*/approvalRequests/*}:approve:\x01*Z:\"5/v1/{name=organizations/*/approvalRequests/*}:approve:\x01*\x12\xb9\x02\n\x16\x44ismissApprovalRequest\x12=.google.cloud.accessapproval.v1.DismissApprovalRequestMessage\x1a/.google.cloud.accessapproval.v1.ApprovalRequest\"\xae\x01\x82\xd3\xe4\x93\x02\xa7\x01\"0/v1/{name=projects/*/approvalRequests/*}:dismiss:\x01*Z4\"//v1/{name=folders/*/approvalRequests/*}:dismiss:\x01*Z:\"5/v1/{name=organizations/*/approvalRequests/*}:dismiss:\x01*\x12\xc8\x02\n\x19InvalidateApprovalRequest\x12@.google.cloud.accessapproval.v1.InvalidateApprovalRequestMessage\x1a/.google.cloud.accessapproval.v1.ApprovalRequest\"\xb7\x01\x82\xd3\xe4\x93\x02\xb0\x01\"3/v1/{name=projects/*/approvalRequests/*}:invalidate:\x01*Z7\"2/v1/{name=folders/*/approvalRequests/*}:invalidate:\x01*Z=\"8/v1/{name=organizations/*/approvalRequests/*}:invalidate:\x01*\x12\xb8\x02\n\x19GetAccessApprovalSettings\x12@.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage\x1a\x36.google.cloud.accessapproval.v1.AccessApprovalSettings\"\xa0\x01\x82\xd3\xe4\x93\x02\x92\x01\x12,/v1/{name=projects/*/accessApprovalSettings}Z-\x12+/v1/{name=folders/*/accessApprovalSettings}Z3\x12\x31/v1/{name=organizations/*/accessApprovalSettings}\xda\x41\x04name\x12\x87\x03\n\x1cUpdateAccessApprovalSettings\x12\x43.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage\x1a\x36.google.cloud.accessapproval.v1.AccessApprovalSettings\"\xe9\x01\x82\xd3\xe4\x93\x02\xcb\x01\x32\x35/v1/{settings.name=projects/*/accessApprovalSettings}:\x08settingsZ@24/v1/{settings.name=folders/*/accessApprovalSettings}:\x08settingsZF2:/v1/{settings.name=organizations/*/accessApprovalSettings}:\x08settings\xda\x41\x14settings,update_mask\x12\x9e\x02\n\x1c\x44\x65leteAccessApprovalSettings\x12\x43.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage\x1a\x16.google.protobuf.Empty\"\xa0\x01\x82\xd3\xe4\x93\x02\x92\x01*,/v1/{name=projects/*/accessApprovalSettings}Z-*+/v1/{name=folders/*/accessApprovalSettings}Z3*1/v1/{name=organizations/*/accessApprovalSettings}\xda\x41\x04name\x12\xb1\x02\n\x1fGetAccessApprovalServiceAccount\x12\x46.google.cloud.accessapproval.v1.GetAccessApprovalServiceAccountMessage\x1a<.google.cloud.accessapproval.v1.AccessApprovalServiceAccount\"\x87\x01\x82\xd3\xe4\x93\x02z\x12$/v1/{name=projects/*/serviceAccount}Z%\x12#/v1/{name=folders/*/serviceAccount}Z+\x12)/v1/{name=organizations/*/serviceAccount}\xda\x41\x04name\x1aQ\xca\x41\x1d\x61\x63\x63\x65ssapproval.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xef\x01\n\"com.google.cloud.accessapproval.v1B\x13\x41\x63\x63\x65ssApprovalProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/accessapproval/v1;accessapproval\xaa\x02\x1eGoogle.Cloud.AccessApproval.V1\xca\x02\x1eGoogle\\Cloud\\AccessApproval\\V1\xea\x02!Google::Cloud::AccessApproval::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.accessapproval.v1.accessapproval_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.cloud.accessapproval.v1B\023AccessApprovalProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/accessapproval/v1;accessapproval\252\002\036Google.Cloud.AccessApproval.V1\312\002\036Google\\Cloud\\AccessApproval\\V1\352\002!Google::Cloud::AccessApproval::V1'
  _APPROVALREQUEST._options = None
  _APPROVALREQUEST._serialized_options = b'\352A\337\001\n-accessapproval.googleapis.com/ApprovalRequest\0226projects/{project}/approvalRequests/{approval_request}\0224folders/{folder}/approvalRequests/{approval_request}\022@organizations/{organization}/approvalRequests/{approval_request}'
  _ACCESSAPPROVALSETTINGS.fields_by_name['name']._options = None
  _ACCESSAPPROVALSETTINGS.fields_by_name['name']._serialized_options = b'\372A6\n4accessapproval.googleapis.com/AccessApprovalSettings'
  _ACCESSAPPROVALSETTINGS.fields_by_name['enrolled_ancestor']._options = None
  _ACCESSAPPROVALSETTINGS.fields_by_name['enrolled_ancestor']._serialized_options = b'\340A\003'
  _ACCESSAPPROVALSETTINGS.fields_by_name['ancestor_has_active_key_version']._options = None
  _ACCESSAPPROVALSETTINGS.fields_by_name['ancestor_has_active_key_version']._serialized_options = b'\340A\003'
  _ACCESSAPPROVALSETTINGS.fields_by_name['invalid_key_version']._options = None
  _ACCESSAPPROVALSETTINGS.fields_by_name['invalid_key_version']._serialized_options = b'\340A\003'
  _ACCESSAPPROVALSETTINGS._options = None
  _ACCESSAPPROVALSETTINGS._serialized_options = b'\352A\277\001\n4accessapproval.googleapis.com/AccessApprovalSettings\022)projects/{project}/accessApprovalSettings\022\'folders/{folder}/accessApprovalSettings\0223organizations/{organization}/accessApprovalSettings'
  _ACCESSAPPROVALSERVICEACCOUNT.fields_by_name['name']._options = None
  _ACCESSAPPROVALSERVICEACCOUNT.fields_by_name['name']._serialized_options = b'\372A<\n:accessapproval.googleapis.com/AccessApprovalServiceAccount'
  _ACCESSAPPROVALSERVICEACCOUNT._options = None
  _ACCESSAPPROVALSERVICEACCOUNT._serialized_options = b'\352A\255\001\n:accessapproval.googleapis.com/AccessApprovalServiceAccount\022!projects/{project}/serviceAccount\022\037folders/{folder}/serviceAccount\022+organizations/{organization}/serviceAccount'
  _LISTAPPROVALREQUESTSMESSAGE.fields_by_name['parent']._options = None
  _LISTAPPROVALREQUESTSMESSAGE.fields_by_name['parent']._serialized_options = b'\372A/\022-accessapproval.googleapis.com/ApprovalRequest'
  _GETAPPROVALREQUESTMESSAGE.fields_by_name['name']._options = None
  _GETAPPROVALREQUESTMESSAGE.fields_by_name['name']._serialized_options = b'\372A/\n-accessapproval.googleapis.com/ApprovalRequest'
  _APPROVEAPPROVALREQUESTMESSAGE.fields_by_name['name']._options = None
  _APPROVEAPPROVALREQUESTMESSAGE.fields_by_name['name']._serialized_options = b'\372A/\n-accessapproval.googleapis.com/ApprovalRequest'
  _DISMISSAPPROVALREQUESTMESSAGE.fields_by_name['name']._options = None
  _DISMISSAPPROVALREQUESTMESSAGE.fields_by_name['name']._serialized_options = b'\372A/\n-accessapproval.googleapis.com/ApprovalRequest'
  _INVALIDATEAPPROVALREQUESTMESSAGE.fields_by_name['name']._options = None
  _INVALIDATEAPPROVALREQUESTMESSAGE.fields_by_name['name']._serialized_options = b'\372A/\n-accessapproval.googleapis.com/ApprovalRequest'
  _GETACCESSAPPROVALSETTINGSMESSAGE.fields_by_name['name']._options = None
  _GETACCESSAPPROVALSETTINGSMESSAGE.fields_by_name['name']._serialized_options = b'\372A6\n4accessapproval.googleapis.com/AccessApprovalSettings'
  _DELETEACCESSAPPROVALSETTINGSMESSAGE.fields_by_name['name']._options = None
  _DELETEACCESSAPPROVALSETTINGSMESSAGE.fields_by_name['name']._serialized_options = b'\372A6\n4accessapproval.googleapis.com/AccessApprovalSettings'
  _ACCESSAPPROVAL._options = None
  _ACCESSAPPROVAL._serialized_options = b'\312A\035accessapproval.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _ACCESSAPPROVAL.methods_by_name['ListApprovalRequests']._options = None
  _ACCESSAPPROVAL.methods_by_name['ListApprovalRequests']._serialized_options = b'\202\323\344\223\002\206\001\022(/v1/{parent=projects/*}/approvalRequestsZ)\022\'/v1/{parent=folders/*}/approvalRequestsZ/\022-/v1/{parent=organizations/*}/approvalRequests\332A\006parent'
  _ACCESSAPPROVAL.methods_by_name['GetApprovalRequest']._options = None
  _ACCESSAPPROVAL.methods_by_name['GetApprovalRequest']._serialized_options = b'\202\323\344\223\002\206\001\022(/v1/{name=projects/*/approvalRequests/*}Z)\022\'/v1/{name=folders/*/approvalRequests/*}Z/\022-/v1/{name=organizations/*/approvalRequests/*}\332A\004name'
  _ACCESSAPPROVAL.methods_by_name['ApproveApprovalRequest']._options = None
  _ACCESSAPPROVAL.methods_by_name['ApproveApprovalRequest']._serialized_options = b'\202\323\344\223\002\247\001\"0/v1/{name=projects/*/approvalRequests/*}:approve:\001*Z4\"//v1/{name=folders/*/approvalRequests/*}:approve:\001*Z:\"5/v1/{name=organizations/*/approvalRequests/*}:approve:\001*'
  _ACCESSAPPROVAL.methods_by_name['DismissApprovalRequest']._options = None
  _ACCESSAPPROVAL.methods_by_name['DismissApprovalRequest']._serialized_options = b'\202\323\344\223\002\247\001\"0/v1/{name=projects/*/approvalRequests/*}:dismiss:\001*Z4\"//v1/{name=folders/*/approvalRequests/*}:dismiss:\001*Z:\"5/v1/{name=organizations/*/approvalRequests/*}:dismiss:\001*'
  _ACCESSAPPROVAL.methods_by_name['InvalidateApprovalRequest']._options = None
  _ACCESSAPPROVAL.methods_by_name['InvalidateApprovalRequest']._serialized_options = b'\202\323\344\223\002\260\001\"3/v1/{name=projects/*/approvalRequests/*}:invalidate:\001*Z7\"2/v1/{name=folders/*/approvalRequests/*}:invalidate:\001*Z=\"8/v1/{name=organizations/*/approvalRequests/*}:invalidate:\001*'
  _ACCESSAPPROVAL.methods_by_name['GetAccessApprovalSettings']._options = None
  _ACCESSAPPROVAL.methods_by_name['GetAccessApprovalSettings']._serialized_options = b'\202\323\344\223\002\222\001\022,/v1/{name=projects/*/accessApprovalSettings}Z-\022+/v1/{name=folders/*/accessApprovalSettings}Z3\0221/v1/{name=organizations/*/accessApprovalSettings}\332A\004name'
  _ACCESSAPPROVAL.methods_by_name['UpdateAccessApprovalSettings']._options = None
  _ACCESSAPPROVAL.methods_by_name['UpdateAccessApprovalSettings']._serialized_options = b'\202\323\344\223\002\313\00125/v1/{settings.name=projects/*/accessApprovalSettings}:\010settingsZ@24/v1/{settings.name=folders/*/accessApprovalSettings}:\010settingsZF2:/v1/{settings.name=organizations/*/accessApprovalSettings}:\010settings\332A\024settings,update_mask'
  _ACCESSAPPROVAL.methods_by_name['DeleteAccessApprovalSettings']._options = None
  _ACCESSAPPROVAL.methods_by_name['DeleteAccessApprovalSettings']._serialized_options = b'\202\323\344\223\002\222\001*,/v1/{name=projects/*/accessApprovalSettings}Z-*+/v1/{name=folders/*/accessApprovalSettings}Z3*1/v1/{name=organizations/*/accessApprovalSettings}\332A\004name'
  _ACCESSAPPROVAL.methods_by_name['GetAccessApprovalServiceAccount']._options = None
  _ACCESSAPPROVAL.methods_by_name['GetAccessApprovalServiceAccount']._serialized_options = b'\202\323\344\223\002z\022$/v1/{name=projects/*/serviceAccount}Z%\022#/v1/{name=folders/*/serviceAccount}Z+\022)/v1/{name=organizations/*/serviceAccount}\332A\004name'
  _ENROLLMENTLEVEL._serialized_start=4161
  _ENROLLMENTLEVEL._serialized_end=4227
  _ACCESSLOCATIONS._serialized_start=298
  _ACCESSLOCATIONS._serialized_end=394
  _ACCESSREASON._serialized_start=397
  _ACCESSREASON._serialized_end=685
  _ACCESSREASON_TYPE._serialized_start=495
  _ACCESSREASON_TYPE._serialized_end=685
  _SIGNATUREINFO._serialized_start=687
  _SIGNATUREINFO._serialized_end=811
  _APPROVEDECISION._serialized_start=814
  _APPROVEDECISION._serialized_end=1077
  _DISMISSDECISION._serialized_start=1079
  _DISMISSDECISION._serialized_end=1164
  _RESOURCEPROPERTIES._serialized_start=1166
  _RESOURCEPROPERTIES._serialized_end=1216
  _APPROVALREQUEST._serialized_start=1219
  _APPROVALREQUEST._serialized_end=2010
  _ENROLLEDSERVICE._serialized_start=2012
  _ENROLLEDSERVICE._serialized_end=2127
  _ACCESSAPPROVALSETTINGS._serialized_start=2130
  _ACCESSAPPROVALSETTINGS._serialized_end=2670
  _ACCESSAPPROVALSERVICEACCOUNT._serialized_start=2673
  _ACCESSAPPROVALSERVICEACCOUNT._serialized_end=2985
  _LISTAPPROVALREQUESTSMESSAGE._serialized_start=2988
  _LISTAPPROVALREQUESTSMESSAGE._serialized_end=3140
  _LISTAPPROVALREQUESTSRESPONSE._serialized_start=3143
  _LISTAPPROVALREQUESTSRESPONSE._serialized_end=3274
  _GETAPPROVALREQUESTMESSAGE._serialized_start=3276
  _GETAPPROVALREQUESTMESSAGE._serialized_end=3369
  _APPROVEAPPROVALREQUESTMESSAGE._serialized_start=3372
  _APPROVEAPPROVALREQUESTMESSAGE._serialized_end=3518
  _DISMISSAPPROVALREQUESTMESSAGE._serialized_start=3520
  _DISMISSAPPROVALREQUESTMESSAGE._serialized_end=3617
  _INVALIDATEAPPROVALREQUESTMESSAGE._serialized_start=3619
  _INVALIDATEAPPROVALREQUESTMESSAGE._serialized_end=3719
  _GETACCESSAPPROVALSETTINGSMESSAGE._serialized_start=3721
  _GETACCESSAPPROVALSETTINGSMESSAGE._serialized_end=3828
  _UPDATEACCESSAPPROVALSETTINGSMESSAGE._serialized_start=3831
  _UPDATEACCESSAPPROVALSETTINGSMESSAGE._serialized_end=3991
  _DELETEACCESSAPPROVALSETTINGSMESSAGE._serialized_start=3993
  _DELETEACCESSAPPROVALSETTINGSMESSAGE._serialized_end=4103
  _GETACCESSAPPROVALSERVICEACCOUNTMESSAGE._serialized_start=4105
  _GETACCESSAPPROVALSERVICEACCOUNTMESSAGE._serialized_end=4159
  _ACCESSAPPROVAL._serialized_start=4230
  _ACCESSAPPROVAL._serialized_end=7181
# @@protoc_insertion_point(module_scope)
