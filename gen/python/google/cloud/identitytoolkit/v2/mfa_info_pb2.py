# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/identitytoolkit/v2/mfa_info.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/identitytoolkit/v2/mfa_info.proto\x12\x1fgoogle.cloud.identitytoolkit.v2\x1a\x1fgoogle/protobuf/timestamp.proto\"/\n\x11\x41utoRetrievalInfo\x12\x1a\n\x12\x61pp_signature_hash\x18\x01 \x01(\t\"\xdd\x01\n\x18StartMfaPhoneRequestInfo\x12\x14\n\x0cphone_number\x18\x01 \x01(\t\x12\x13\n\x0bios_receipt\x18\x02 \x01(\t\x12\x12\n\nios_secret\x18\x03 \x01(\t\x12\x17\n\x0frecaptcha_token\x18\x04 \x01(\t\x12O\n\x13\x61uto_retrieval_info\x18\x05 \x01(\x0b\x32\x32.google.cloud.identitytoolkit.v2.AutoRetrievalInfo\x12\x18\n\x10safety_net_token\x18\x06 \x01(\t\"1\n\x19StartMfaPhoneResponseInfo\x12\x14\n\x0csession_info\x18\x01 \x01(\t\"{\n\x1b\x46inalizeMfaPhoneRequestInfo\x12\x14\n\x0csession_info\x18\x01 \x01(\t\x12\x0c\n\x04\x63ode\x18\x02 \x01(\t\x12\"\n\x1a\x61ndroid_verification_proof\x18\x03 \x01(\t\x12\x14\n\x0cphone_number\x18\x04 \x01(\t\"\xa4\x01\n\x1c\x46inalizeMfaPhoneResponseInfo\x12\"\n\x1a\x61ndroid_verification_proof\x18\x01 \x01(\t\x12J\n&android_verification_proof_expire_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x14\n\x0cphone_number\x18\x03 \x01(\tB\xe0\x01\n#com.google.cloud.identitytoolkit.v2P\x01ZNgoogle.golang.org/genproto/googleapis/cloud/identitytoolkit/v2;identitytoolkit\xaa\x02\x1fGoogle.Cloud.IdentityToolkit.V2\xca\x02\x1fGoogle\\Cloud\\IdentityToolkit\\V2\xea\x02\"Google::Cloud::IdentityToolkit::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.identitytoolkit.v2.mfa_info_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.identitytoolkit.v2P\001ZNgoogle.golang.org/genproto/googleapis/cloud/identitytoolkit/v2;identitytoolkit\252\002\037Google.Cloud.IdentityToolkit.V2\312\002\037Google\\Cloud\\IdentityToolkit\\V2\352\002\"Google::Cloud::IdentityToolkit::V2'
  _AUTORETRIEVALINFO._serialized_start=116
  _AUTORETRIEVALINFO._serialized_end=163
  _STARTMFAPHONEREQUESTINFO._serialized_start=166
  _STARTMFAPHONEREQUESTINFO._serialized_end=387
  _STARTMFAPHONERESPONSEINFO._serialized_start=389
  _STARTMFAPHONERESPONSEINFO._serialized_end=438
  _FINALIZEMFAPHONEREQUESTINFO._serialized_start=440
  _FINALIZEMFAPHONEREQUESTINFO._serialized_end=563
  _FINALIZEMFAPHONERESPONSEINFO._serialized_start=566
  _FINALIZEMFAPHONERESPONSEINFO._serialized_end=730
# @@protoc_insertion_point(module_scope)