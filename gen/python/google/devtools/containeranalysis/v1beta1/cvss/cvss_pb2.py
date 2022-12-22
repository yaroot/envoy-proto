# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/cvss/cvss.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/devtools/containeranalysis/v1beta1/cvss/cvss.proto\x12\x1dgrafeas.v1beta1.vulnerability\"\xdd\n\n\x06\x43VSSv3\x12\x12\n\nbase_score\x18\x01 \x01(\x02\x12\x1c\n\x14\x65xploitability_score\x18\x02 \x01(\x02\x12\x14\n\x0cimpact_score\x18\x03 \x01(\x02\x12I\n\rattack_vector\x18\x05 \x01(\x0e\x32\x32.grafeas.v1beta1.vulnerability.CVSSv3.AttackVector\x12Q\n\x11\x61ttack_complexity\x18\x06 \x01(\x0e\x32\x36.grafeas.v1beta1.vulnerability.CVSSv3.AttackComplexity\x12U\n\x13privileges_required\x18\x07 \x01(\x0e\x32\x38.grafeas.v1beta1.vulnerability.CVSSv3.PrivilegesRequired\x12O\n\x10user_interaction\x18\x08 \x01(\x0e\x32\x35.grafeas.v1beta1.vulnerability.CVSSv3.UserInteraction\x12:\n\x05scope\x18\t \x01(\x0e\x32+.grafeas.v1beta1.vulnerability.CVSSv3.Scope\x12L\n\x16\x63onfidentiality_impact\x18\n \x01(\x0e\x32,.grafeas.v1beta1.vulnerability.CVSSv3.Impact\x12\x46\n\x10integrity_impact\x18\x0b \x01(\x0e\x32,.grafeas.v1beta1.vulnerability.CVSSv3.Impact\x12I\n\x13\x61vailability_impact\x18\x0c \x01(\x0e\x32,.grafeas.v1beta1.vulnerability.CVSSv3.Impact\"\x99\x01\n\x0c\x41ttackVector\x12\x1d\n\x19\x41TTACK_VECTOR_UNSPECIFIED\x10\x00\x12\x19\n\x15\x41TTACK_VECTOR_NETWORK\x10\x01\x12\x1a\n\x16\x41TTACK_VECTOR_ADJACENT\x10\x02\x12\x17\n\x13\x41TTACK_VECTOR_LOCAL\x10\x03\x12\x1a\n\x16\x41TTACK_VECTOR_PHYSICAL\x10\x04\"l\n\x10\x41ttackComplexity\x12!\n\x1d\x41TTACK_COMPLEXITY_UNSPECIFIED\x10\x00\x12\x19\n\x15\x41TTACK_COMPLEXITY_LOW\x10\x01\x12\x1a\n\x16\x41TTACK_COMPLEXITY_HIGH\x10\x02\"\x92\x01\n\x12PrivilegesRequired\x12#\n\x1fPRIVILEGES_REQUIRED_UNSPECIFIED\x10\x00\x12\x1c\n\x18PRIVILEGES_REQUIRED_NONE\x10\x01\x12\x1b\n\x17PRIVILEGES_REQUIRED_LOW\x10\x02\x12\x1c\n\x18PRIVILEGES_REQUIRED_HIGH\x10\x03\"m\n\x0fUserInteraction\x12 \n\x1cUSER_INTERACTION_UNSPECIFIED\x10\x00\x12\x19\n\x15USER_INTERACTION_NONE\x10\x01\x12\x1d\n\x19USER_INTERACTION_REQUIRED\x10\x02\"F\n\x05Scope\x12\x15\n\x11SCOPE_UNSPECIFIED\x10\x00\x12\x13\n\x0fSCOPE_UNCHANGED\x10\x01\x12\x11\n\rSCOPE_CHANGED\x10\x02\"R\n\x06Impact\x12\x16\n\x12IMPACT_UNSPECIFIED\x10\x00\x12\x0f\n\x0bIMPACT_HIGH\x10\x01\x12\x0e\n\nIMPACT_LOW\x10\x02\x12\x0f\n\x0bIMPACT_NONE\x10\x03\x42~\n io.grafeas.v1beta1.vulnerabilityP\x01ZRgoogle.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/cvss;cvss\xa2\x02\x03GRAb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.containeranalysis.v1beta1.cvss.cvss_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n io.grafeas.v1beta1.vulnerabilityP\001ZRgoogle.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/cvss;cvss\242\002\003GRA'
  _CVSSV3._serialized_start=93
  _CVSSV3._serialized_end=1466
  _CVSSV3_ATTACKVECTOR._serialized_start=787
  _CVSSV3_ATTACKVECTOR._serialized_end=940
  _CVSSV3_ATTACKCOMPLEXITY._serialized_start=942
  _CVSSV3_ATTACKCOMPLEXITY._serialized_end=1050
  _CVSSV3_PRIVILEGESREQUIRED._serialized_start=1053
  _CVSSV3_PRIVILEGESREQUIRED._serialized_end=1199
  _CVSSV3_USERINTERACTION._serialized_start=1201
  _CVSSV3_USERINTERACTION._serialized_end=1310
  _CVSSV3_SCOPE._serialized_start=1312
  _CVSSV3_SCOPE._serialized_end=1382
  _CVSSV3_IMPACT._serialized_start=1384
  _CVSSV3_IMPACT._serialized_end=1466
# @@protoc_insertion_point(module_scope)