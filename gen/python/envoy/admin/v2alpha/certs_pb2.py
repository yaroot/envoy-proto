# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/admin/v2alpha/certs.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x65nvoy/admin/v2alpha/certs.proto\x12\x13\x65nvoy.admin.v2alpha\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1dudpa/annotations/status.proto\"F\n\x0c\x43\x65rtificates\x12\x36\n\x0c\x63\x65rtificates\x18\x01 \x03(\x0b\x32 .envoy.admin.v2alpha.Certificate\"\x84\x01\n\x0b\x43\x65rtificate\x12\x38\n\x07\x63\x61_cert\x18\x01 \x03(\x0b\x32\'.envoy.admin.v2alpha.CertificateDetails\x12;\n\ncert_chain\x18\x02 \x03(\x0b\x32\'.envoy.admin.v2alpha.CertificateDetails\"\x83\x02\n\x12\x43\x65rtificateDetails\x12\x0c\n\x04path\x18\x01 \x01(\t\x12\x15\n\rserial_number\x18\x02 \x01(\t\x12\x44\n\x11subject_alt_names\x18\x03 \x03(\x0b\x32).envoy.admin.v2alpha.SubjectAlternateName\x12\x1d\n\x15\x64\x61ys_until_expiration\x18\x04 \x01(\x04\x12.\n\nvalid_from\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x33\n\x0f\x65xpiration_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"R\n\x14SubjectAlternateName\x12\r\n\x03\x64ns\x18\x01 \x01(\tH\x00\x12\r\n\x03uri\x18\x02 \x01(\tH\x00\x12\x14\n\nip_address\x18\x03 \x01(\tH\x00\x42\x06\n\x04nameBu\n!io.envoyproxy.envoy.admin.v2alphaB\nCertsProtoP\x01Z:github.com/envoyproxy/go-control-plane/envoy/admin/v2alpha\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.admin.v2alpha.certs_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!io.envoyproxy.envoy.admin.v2alphaB\nCertsProtoP\001Z:github.com/envoyproxy/go-control-plane/envoy/admin/v2alpha\272\200\310\321\006\002\020\001'
  _CERTIFICATES._serialized_start=120
  _CERTIFICATES._serialized_end=190
  _CERTIFICATE._serialized_start=193
  _CERTIFICATE._serialized_end=325
  _CERTIFICATEDETAILS._serialized_start=328
  _CERTIFICATEDETAILS._serialized_end=587
  _SUBJECTALTERNATENAME._serialized_start=589
  _SUBJECTALTERNATENAME._serialized_end=671
# @@protoc_insertion_point(module_scope)