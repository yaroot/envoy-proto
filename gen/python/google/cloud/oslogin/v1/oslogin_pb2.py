# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/oslogin/v1/oslogin.proto
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
from google.cloud.oslogin.common import common_pb2 as google_dot_cloud_dot_oslogin_dot_common_dot_common__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%google/cloud/oslogin/v1/oslogin.proto\x12\x17google.cloud.oslogin.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/oslogin/common/common.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\x98\x02\n\x0cLoginProfile\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x41\n\x0eposix_accounts\x18\x02 \x03(\x0b\x32).google.cloud.oslogin.common.PosixAccount\x12Q\n\x0fssh_public_keys\x18\x03 \x03(\x0b\x32\x38.google.cloud.oslogin.v1.LoginProfile.SshPublicKeysEntry\x1a_\n\x12SshPublicKeysEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x38\n\x05value\x18\x02 \x01(\x0b\x32).google.cloud.oslogin.common.SshPublicKey:\x02\x38\x01\"V\n\x19\x44\x65letePosixAccountRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#oslogin.googleapis.com/PosixAccount\"V\n\x19\x44\x65leteSshPublicKeyRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#oslogin.googleapis.com/SshPublicKey\"z\n\x16GetLoginProfileRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#oslogin.googleapis.com/PosixAccount\x12\x12\n\nproject_id\x18\x02 \x01(\t\x12\x11\n\tsystem_id\x18\x03 \x01(\t\"S\n\x16GetSshPublicKeyRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#oslogin.googleapis.com/SshPublicKey\"\xb4\x01\n\x19ImportSshPublicKeyRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#oslogin.googleapis.com/SshPublicKey\x12\x46\n\x0essh_public_key\x18\x02 \x01(\x0b\x32).google.cloud.oslogin.common.SshPublicKeyB\x03\xe0\x41\x01\x12\x12\n\nproject_id\x18\x03 \x01(\t\"Z\n\x1aImportSshPublicKeyResponse\x12<\n\rlogin_profile\x18\x01 \x01(\x0b\x32%.google.cloud.oslogin.v1.LoginProfile\"\xcf\x01\n\x19UpdateSshPublicKeyRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#oslogin.googleapis.com/SshPublicKey\x12\x46\n\x0essh_public_key\x18\x02 \x01(\x0b\x32).google.cloud.oslogin.common.SshPublicKeyB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask2\xd0\t\n\x0eOsLoginService\x12\x8e\x01\n\x12\x44\x65letePosixAccount\x12\x32.google.cloud.oslogin.v1.DeletePosixAccountRequest\x1a\x16.google.protobuf.Empty\",\x82\xd3\xe4\x93\x02\x1f*\x1d/v1/{name=users/*/projects/*}\xda\x41\x04name\x12\x93\x01\n\x12\x44\x65leteSshPublicKey\x12\x32.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest\x1a\x16.google.protobuf.Empty\"1\x82\xd3\xe4\x93\x02$*\"/v1/{name=users/*/sshPublicKeys/*}\xda\x41\x04name\x12\x99\x01\n\x0fGetLoginProfile\x12/.google.cloud.oslogin.v1.GetLoginProfileRequest\x1a%.google.cloud.oslogin.v1.LoginProfile\".\x82\xd3\xe4\x93\x02!\x12\x1f/v1/{name=users/*}/loginProfile\xda\x41\x04name\x12\xa0\x01\n\x0fGetSshPublicKey\x12/.google.cloud.oslogin.v1.GetSshPublicKeyRequest\x1a).google.cloud.oslogin.common.SshPublicKey\"1\x82\xd3\xe4\x93\x02$\x12\"/v1/{name=users/*/sshPublicKeys/*}\xda\x41\x04name\x12\xf9\x01\n\x12ImportSshPublicKey\x12\x32.google.cloud.oslogin.v1.ImportSshPublicKeyRequest\x1a\x33.google.cloud.oslogin.v1.ImportSshPublicKeyResponse\"z\x82\xd3\xe4\x93\x02\x39\"\'/v1/{parent=users/*}:importSshPublicKey:\x0essh_public_key\xda\x41\x15parent,ssh_public_key\xda\x41 parent,ssh_public_key,project_id\x12\xe7\x01\n\x12UpdateSshPublicKey\x12\x32.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest\x1a).google.cloud.oslogin.common.SshPublicKey\"r\x82\xd3\xe4\x93\x02\x34\x32\"/v1/{name=users/*/sshPublicKeys/*}:\x0essh_public_key\xda\x41\x13name,ssh_public_key\xda\x41\x1fname,ssh_public_key,update_mask\x1ar\xca\x41\x16oslogin.googleapis.com\xd2\x41Vhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/computeB\xbe\x01\n\x1b\x63om.google.cloud.oslogin.v1B\x0cOsLoginProtoP\x01Z>google.golang.org/genproto/googleapis/cloud/oslogin/v1;oslogin\xaa\x02\x17Google.Cloud.OsLogin.V1\xca\x02\x17Google\\Cloud\\OsLogin\\V1\xea\x02\x1aGoogle::Cloud::OsLogin::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.oslogin.v1.oslogin_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.google.cloud.oslogin.v1B\014OsLoginProtoP\001Z>google.golang.org/genproto/googleapis/cloud/oslogin/v1;oslogin\252\002\027Google.Cloud.OsLogin.V1\312\002\027Google\\Cloud\\OsLogin\\V1\352\002\032Google::Cloud::OsLogin::V1'
  _LOGINPROFILE_SSHPUBLICKEYSENTRY._options = None
  _LOGINPROFILE_SSHPUBLICKEYSENTRY._serialized_options = b'8\001'
  _LOGINPROFILE.fields_by_name['name']._options = None
  _LOGINPROFILE.fields_by_name['name']._serialized_options = b'\340A\002'
  _DELETEPOSIXACCOUNTREQUEST.fields_by_name['name']._options = None
  _DELETEPOSIXACCOUNTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#oslogin.googleapis.com/PosixAccount'
  _DELETESSHPUBLICKEYREQUEST.fields_by_name['name']._options = None
  _DELETESSHPUBLICKEYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#oslogin.googleapis.com/SshPublicKey'
  _GETLOGINPROFILEREQUEST.fields_by_name['name']._options = None
  _GETLOGINPROFILEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\022#oslogin.googleapis.com/PosixAccount'
  _GETSSHPUBLICKEYREQUEST.fields_by_name['name']._options = None
  _GETSSHPUBLICKEYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#oslogin.googleapis.com/SshPublicKey'
  _IMPORTSSHPUBLICKEYREQUEST.fields_by_name['parent']._options = None
  _IMPORTSSHPUBLICKEYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#oslogin.googleapis.com/SshPublicKey'
  _IMPORTSSHPUBLICKEYREQUEST.fields_by_name['ssh_public_key']._options = None
  _IMPORTSSHPUBLICKEYREQUEST.fields_by_name['ssh_public_key']._serialized_options = b'\340A\001'
  _UPDATESSHPUBLICKEYREQUEST.fields_by_name['name']._options = None
  _UPDATESSHPUBLICKEYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#oslogin.googleapis.com/SshPublicKey'
  _UPDATESSHPUBLICKEYREQUEST.fields_by_name['ssh_public_key']._options = None
  _UPDATESSHPUBLICKEYREQUEST.fields_by_name['ssh_public_key']._serialized_options = b'\340A\002'
  _OSLOGINSERVICE._options = None
  _OSLOGINSERVICE._serialized_options = b'\312A\026oslogin.googleapis.com\322AVhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/compute'
  _OSLOGINSERVICE.methods_by_name['DeletePosixAccount']._options = None
  _OSLOGINSERVICE.methods_by_name['DeletePosixAccount']._serialized_options = b'\202\323\344\223\002\037*\035/v1/{name=users/*/projects/*}\332A\004name'
  _OSLOGINSERVICE.methods_by_name['DeleteSshPublicKey']._options = None
  _OSLOGINSERVICE.methods_by_name['DeleteSshPublicKey']._serialized_options = b'\202\323\344\223\002$*\"/v1/{name=users/*/sshPublicKeys/*}\332A\004name'
  _OSLOGINSERVICE.methods_by_name['GetLoginProfile']._options = None
  _OSLOGINSERVICE.methods_by_name['GetLoginProfile']._serialized_options = b'\202\323\344\223\002!\022\037/v1/{name=users/*}/loginProfile\332A\004name'
  _OSLOGINSERVICE.methods_by_name['GetSshPublicKey']._options = None
  _OSLOGINSERVICE.methods_by_name['GetSshPublicKey']._serialized_options = b'\202\323\344\223\002$\022\"/v1/{name=users/*/sshPublicKeys/*}\332A\004name'
  _OSLOGINSERVICE.methods_by_name['ImportSshPublicKey']._options = None
  _OSLOGINSERVICE.methods_by_name['ImportSshPublicKey']._serialized_options = b'\202\323\344\223\0029\"\'/v1/{parent=users/*}:importSshPublicKey:\016ssh_public_key\332A\025parent,ssh_public_key\332A parent,ssh_public_key,project_id'
  _OSLOGINSERVICE.methods_by_name['UpdateSshPublicKey']._options = None
  _OSLOGINSERVICE.methods_by_name['UpdateSshPublicKey']._serialized_options = b'\202\323\344\223\00242\"/v1/{name=users/*/sshPublicKeys/*}:\016ssh_public_key\332A\023name,ssh_public_key\332A\037name,ssh_public_key,update_mask'
  _LOGINPROFILE._serialized_start=287
  _LOGINPROFILE._serialized_end=567
  _LOGINPROFILE_SSHPUBLICKEYSENTRY._serialized_start=472
  _LOGINPROFILE_SSHPUBLICKEYSENTRY._serialized_end=567
  _DELETEPOSIXACCOUNTREQUEST._serialized_start=569
  _DELETEPOSIXACCOUNTREQUEST._serialized_end=655
  _DELETESSHPUBLICKEYREQUEST._serialized_start=657
  _DELETESSHPUBLICKEYREQUEST._serialized_end=743
  _GETLOGINPROFILEREQUEST._serialized_start=745
  _GETLOGINPROFILEREQUEST._serialized_end=867
  _GETSSHPUBLICKEYREQUEST._serialized_start=869
  _GETSSHPUBLICKEYREQUEST._serialized_end=952
  _IMPORTSSHPUBLICKEYREQUEST._serialized_start=955
  _IMPORTSSHPUBLICKEYREQUEST._serialized_end=1135
  _IMPORTSSHPUBLICKEYRESPONSE._serialized_start=1137
  _IMPORTSSHPUBLICKEYRESPONSE._serialized_end=1227
  _UPDATESSHPUBLICKEYREQUEST._serialized_start=1230
  _UPDATESSHPUBLICKEYREQUEST._serialized_end=1437
  _OSLOGINSERVICE._serialized_start=1440
  _OSLOGINSERVICE._serialized_end=2672
# @@protoc_insertion_point(module_scope)
