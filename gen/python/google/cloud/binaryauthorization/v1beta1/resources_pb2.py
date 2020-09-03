# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/binaryauthorization/v1beta1/resources.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/binaryauthorization/v1beta1/resources.proto',
  package='google.cloud.binaryauthorization.v1beta1',
  syntax='proto3',
  serialized_options=b'Z[google.golang.org/genproto/googleapis/cloud/binaryauthorization/v1beta1;binaryauthorization\370\001\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8google/cloud/binaryauthorization/v1beta1/resources.proto\x12(google.cloud.binaryauthorization.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xcd\x06\n\x06Policy\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x18\n\x0b\x64\x65scription\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12w\n\x1dglobal_policy_evaluation_mode\x18\x07 \x01(\x0e\x32K.google.cloud.binaryauthorization.v1beta1.Policy.GlobalPolicyEvaluationModeB\x03\xe0\x41\x01\x12n\n\x1c\x61\x64mission_whitelist_patterns\x18\x02 \x03(\x0b\x32\x43.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPatternB\x03\xe0\x41\x01\x12q\n\x17\x63luster_admission_rules\x18\x03 \x03(\x0b\x32K.google.cloud.binaryauthorization.v1beta1.Policy.ClusterAdmissionRulesEntryB\x03\xe0\x41\x01\x12\\\n\x16\x64\x65\x66\x61ult_admission_rule\x18\x04 \x01(\x0b\x32\x37.google.cloud.binaryauthorization.v1beta1.AdmissionRuleB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x1au\n\x1a\x43lusterAdmissionRulesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x46\n\x05value\x18\x02 \x01(\x0b\x32\x37.google.cloud.binaryauthorization.v1beta1.AdmissionRule:\x02\x38\x01\"d\n\x1aGlobalPolicyEvaluationMode\x12-\n)GLOBAL_POLICY_EVALUATION_MODE_UNSPECIFIED\x10\x00\x12\n\n\x06\x45NABLE\x10\x01\x12\x0b\n\x07\x44ISABLE\x10\x02:I\xea\x41\x46\n)binaryauthorization.googleapis.com/Policy\x12\x19projects/{project}/policy\"1\n\x19\x41\x64missionWhitelistPattern\x12\x14\n\x0cname_pattern\x18\x01 \x01(\t\"\xe4\x03\n\rAdmissionRule\x12\x64\n\x0f\x65valuation_mode\x18\x01 \x01(\x0e\x32\x46.google.cloud.binaryauthorization.v1beta1.AdmissionRule.EvaluationModeB\x03\xe0\x41\x02\x12$\n\x17require_attestations_by\x18\x02 \x03(\tB\x03\xe0\x41\x01\x12\x66\n\x10\x65nforcement_mode\x18\x03 \x01(\x0e\x32G.google.cloud.binaryauthorization.v1beta1.AdmissionRule.EnforcementModeB\x03\xe0\x41\x02\"m\n\x0e\x45valuationMode\x12\x1f\n\x1b\x45VALUATION_MODE_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x41LWAYS_ALLOW\x10\x01\x12\x17\n\x13REQUIRE_ATTESTATION\x10\x02\x12\x0f\n\x0b\x41LWAYS_DENY\x10\x03\"p\n\x0f\x45nforcementMode\x12 \n\x1c\x45NFORCEMENT_MODE_UNSPECIFIED\x10\x00\x12 \n\x1c\x45NFORCED_BLOCK_AND_AUDIT_LOG\x10\x01\x12\x19\n\x15\x44RYRUN_AUDIT_LOG_ONLY\x10\x02\"\xbc\x02\n\x08\x41ttestor\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12\x61\n\x17user_owned_drydock_note\x18\x03 \x01(\x0b\x32>.google.cloud.binaryauthorization.v1beta1.UserOwnedDrydockNoteH\x00\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03:Y\xea\x41V\n+binaryauthorization.googleapis.com/Attestor\x12\'projects/{project}/attestors/{attestor}B\x0f\n\rattestor_type\"\xb9\x01\n\x14UserOwnedDrydockNote\x12\x1b\n\x0enote_reference\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12U\n\x0bpublic_keys\x18\x02 \x03(\x0b\x32;.google.cloud.binaryauthorization.v1beta1.AttestorPublicKeyB\x03\xe0\x41\x01\x12-\n delegation_service_account_email\x18\x03 \x01(\tB\x03\xe0\x41\x03\"\xf5\x03\n\rPkixPublicKey\x12\x16\n\x0epublic_key_pem\x18\x01 \x01(\t\x12g\n\x13signature_algorithm\x18\x02 \x01(\x0e\x32J.google.cloud.binaryauthorization.v1beta1.PkixPublicKey.SignatureAlgorithm\"\xe2\x02\n\x12SignatureAlgorithm\x12#\n\x1fSIGNATURE_ALGORITHM_UNSPECIFIED\x10\x00\x12\x17\n\x13RSA_PSS_2048_SHA256\x10\x01\x12\x17\n\x13RSA_PSS_3072_SHA256\x10\x02\x12\x17\n\x13RSA_PSS_4096_SHA256\x10\x03\x12\x17\n\x13RSA_PSS_4096_SHA512\x10\x04\x12\x1e\n\x1aRSA_SIGN_PKCS1_2048_SHA256\x10\x05\x12\x1e\n\x1aRSA_SIGN_PKCS1_3072_SHA256\x10\x06\x12\x1e\n\x1aRSA_SIGN_PKCS1_4096_SHA256\x10\x07\x12\x1e\n\x1aRSA_SIGN_PKCS1_4096_SHA512\x10\x08\x12\x15\n\x11\x45\x43\x44SA_P256_SHA256\x10\t\x12\x15\n\x11\x45\x43\x44SA_P384_SHA384\x10\n\x12\x15\n\x11\x45\x43\x44SA_P521_SHA512\x10\x0b\"\xbf\x01\n\x11\x41ttestorPublicKey\x12\x14\n\x07\x63omment\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\n\n\x02id\x18\x02 \x01(\t\x12&\n\x1c\x61scii_armored_pgp_public_key\x18\x03 \x01(\tH\x00\x12R\n\x0fpkix_public_key\x18\x05 \x01(\x0b\x32\x37.google.cloud.binaryauthorization.v1beta1.PkixPublicKeyH\x00\x42\x0c\n\npublic_keyB`Z[google.golang.org/genproto/googleapis/cloud/binaryauthorization/v1beta1;binaryauthorization\xf8\x01\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_POLICY_GLOBALPOLICYEVALUATIONMODE = _descriptor.EnumDescriptor(
  name='GlobalPolicyEvaluationMode',
  full_name='google.cloud.binaryauthorization.v1beta1.Policy.GlobalPolicyEvaluationMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='GLOBAL_POLICY_EVALUATION_MODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENABLE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DISABLE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=896,
  serialized_end=996,
)
_sym_db.RegisterEnumDescriptor(_POLICY_GLOBALPOLICYEVALUATIONMODE)

_ADMISSIONRULE_EVALUATIONMODE = _descriptor.EnumDescriptor(
  name='EvaluationMode',
  full_name='google.cloud.binaryauthorization.v1beta1.AdmissionRule.EvaluationMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='EVALUATION_MODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ALWAYS_ALLOW', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REQUIRE_ATTESTATION', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ALWAYS_DENY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1386,
  serialized_end=1495,
)
_sym_db.RegisterEnumDescriptor(_ADMISSIONRULE_EVALUATIONMODE)

_ADMISSIONRULE_ENFORCEMENTMODE = _descriptor.EnumDescriptor(
  name='EnforcementMode',
  full_name='google.cloud.binaryauthorization.v1beta1.AdmissionRule.EnforcementMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ENFORCEMENT_MODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENFORCED_BLOCK_AND_AUDIT_LOG', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DRYRUN_AUDIT_LOG_ONLY', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1497,
  serialized_end=1609,
)
_sym_db.RegisterEnumDescriptor(_ADMISSIONRULE_ENFORCEMENTMODE)

_PKIXPUBLICKEY_SIGNATUREALGORITHM = _descriptor.EnumDescriptor(
  name='SignatureAlgorithm',
  full_name='google.cloud.binaryauthorization.v1beta1.PkixPublicKey.SignatureAlgorithm',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SIGNATURE_ALGORITHM_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_PSS_2048_SHA256', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_PSS_3072_SHA256', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_PSS_4096_SHA256', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_PSS_4096_SHA512', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_SIGN_PKCS1_2048_SHA256', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_SIGN_PKCS1_3072_SHA256', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_SIGN_PKCS1_4096_SHA256', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RSA_SIGN_PKCS1_4096_SHA512', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ECDSA_P256_SHA256', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ECDSA_P384_SHA384', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ECDSA_P521_SHA512', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2266,
  serialized_end=2620,
)
_sym_db.RegisterEnumDescriptor(_PKIXPUBLICKEY_SIGNATUREALGORITHM)


_POLICY_CLUSTERADMISSIONRULESENTRY = _descriptor.Descriptor(
  name='ClusterAdmissionRulesEntry',
  full_name='google.cloud.binaryauthorization.v1beta1.Policy.ClusterAdmissionRulesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.binaryauthorization.v1beta1.Policy.ClusterAdmissionRulesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.binaryauthorization.v1beta1.Policy.ClusterAdmissionRulesEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=777,
  serialized_end=894,
)

_POLICY = _descriptor.Descriptor(
  name='Policy',
  full_name='google.cloud.binaryauthorization.v1beta1.Policy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.binaryauthorization.v1beta1.Policy.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.binaryauthorization.v1beta1.Policy.description', index=1,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='global_policy_evaluation_mode', full_name='google.cloud.binaryauthorization.v1beta1.Policy.global_policy_evaluation_mode', index=2,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='admission_whitelist_patterns', full_name='google.cloud.binaryauthorization.v1beta1.Policy.admission_whitelist_patterns', index=3,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_admission_rules', full_name='google.cloud.binaryauthorization.v1beta1.Policy.cluster_admission_rules', index=4,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='default_admission_rule', full_name='google.cloud.binaryauthorization.v1beta1.Policy.default_admission_rule', index=5,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.binaryauthorization.v1beta1.Policy.update_time', index=6,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_POLICY_CLUSTERADMISSIONRULESENTRY, ],
  enum_types=[
    _POLICY_GLOBALPOLICYEVALUATIONMODE,
  ],
  serialized_options=b'\352AF\n)binaryauthorization.googleapis.com/Policy\022\031projects/{project}/policy',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=226,
  serialized_end=1071,
)


_ADMISSIONWHITELISTPATTERN = _descriptor.Descriptor(
  name='AdmissionWhitelistPattern',
  full_name='google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name_pattern', full_name='google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern.name_pattern', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1073,
  serialized_end=1122,
)


_ADMISSIONRULE = _descriptor.Descriptor(
  name='AdmissionRule',
  full_name='google.cloud.binaryauthorization.v1beta1.AdmissionRule',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='evaluation_mode', full_name='google.cloud.binaryauthorization.v1beta1.AdmissionRule.evaluation_mode', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='require_attestations_by', full_name='google.cloud.binaryauthorization.v1beta1.AdmissionRule.require_attestations_by', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enforcement_mode', full_name='google.cloud.binaryauthorization.v1beta1.AdmissionRule.enforcement_mode', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _ADMISSIONRULE_EVALUATIONMODE,
    _ADMISSIONRULE_ENFORCEMENTMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1125,
  serialized_end=1609,
)


_ATTESTOR = _descriptor.Descriptor(
  name='Attestor',
  full_name='google.cloud.binaryauthorization.v1beta1.Attestor',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.binaryauthorization.v1beta1.Attestor.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.binaryauthorization.v1beta1.Attestor.description', index=1,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_owned_drydock_note', full_name='google.cloud.binaryauthorization.v1beta1.Attestor.user_owned_drydock_note', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.binaryauthorization.v1beta1.Attestor.update_time', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AV\n+binaryauthorization.googleapis.com/Attestor\022\'projects/{project}/attestors/{attestor}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='attestor_type', full_name='google.cloud.binaryauthorization.v1beta1.Attestor.attestor_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1612,
  serialized_end=1928,
)


_USEROWNEDDRYDOCKNOTE = _descriptor.Descriptor(
  name='UserOwnedDrydockNote',
  full_name='google.cloud.binaryauthorization.v1beta1.UserOwnedDrydockNote',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='note_reference', full_name='google.cloud.binaryauthorization.v1beta1.UserOwnedDrydockNote.note_reference', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='public_keys', full_name='google.cloud.binaryauthorization.v1beta1.UserOwnedDrydockNote.public_keys', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='delegation_service_account_email', full_name='google.cloud.binaryauthorization.v1beta1.UserOwnedDrydockNote.delegation_service_account_email', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1931,
  serialized_end=2116,
)


_PKIXPUBLICKEY = _descriptor.Descriptor(
  name='PkixPublicKey',
  full_name='google.cloud.binaryauthorization.v1beta1.PkixPublicKey',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='public_key_pem', full_name='google.cloud.binaryauthorization.v1beta1.PkixPublicKey.public_key_pem', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='signature_algorithm', full_name='google.cloud.binaryauthorization.v1beta1.PkixPublicKey.signature_algorithm', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _PKIXPUBLICKEY_SIGNATUREALGORITHM,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2119,
  serialized_end=2620,
)


_ATTESTORPUBLICKEY = _descriptor.Descriptor(
  name='AttestorPublicKey',
  full_name='google.cloud.binaryauthorization.v1beta1.AttestorPublicKey',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='comment', full_name='google.cloud.binaryauthorization.v1beta1.AttestorPublicKey.comment', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.binaryauthorization.v1beta1.AttestorPublicKey.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ascii_armored_pgp_public_key', full_name='google.cloud.binaryauthorization.v1beta1.AttestorPublicKey.ascii_armored_pgp_public_key', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pkix_public_key', full_name='google.cloud.binaryauthorization.v1beta1.AttestorPublicKey.pkix_public_key', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='public_key', full_name='google.cloud.binaryauthorization.v1beta1.AttestorPublicKey.public_key',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=2623,
  serialized_end=2814,
)

_POLICY_CLUSTERADMISSIONRULESENTRY.fields_by_name['value'].message_type = _ADMISSIONRULE
_POLICY_CLUSTERADMISSIONRULESENTRY.containing_type = _POLICY
_POLICY.fields_by_name['global_policy_evaluation_mode'].enum_type = _POLICY_GLOBALPOLICYEVALUATIONMODE
_POLICY.fields_by_name['admission_whitelist_patterns'].message_type = _ADMISSIONWHITELISTPATTERN
_POLICY.fields_by_name['cluster_admission_rules'].message_type = _POLICY_CLUSTERADMISSIONRULESENTRY
_POLICY.fields_by_name['default_admission_rule'].message_type = _ADMISSIONRULE
_POLICY.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_POLICY_GLOBALPOLICYEVALUATIONMODE.containing_type = _POLICY
_ADMISSIONRULE.fields_by_name['evaluation_mode'].enum_type = _ADMISSIONRULE_EVALUATIONMODE
_ADMISSIONRULE.fields_by_name['enforcement_mode'].enum_type = _ADMISSIONRULE_ENFORCEMENTMODE
_ADMISSIONRULE_EVALUATIONMODE.containing_type = _ADMISSIONRULE
_ADMISSIONRULE_ENFORCEMENTMODE.containing_type = _ADMISSIONRULE
_ATTESTOR.fields_by_name['user_owned_drydock_note'].message_type = _USEROWNEDDRYDOCKNOTE
_ATTESTOR.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ATTESTOR.oneofs_by_name['attestor_type'].fields.append(
  _ATTESTOR.fields_by_name['user_owned_drydock_note'])
_ATTESTOR.fields_by_name['user_owned_drydock_note'].containing_oneof = _ATTESTOR.oneofs_by_name['attestor_type']
_USEROWNEDDRYDOCKNOTE.fields_by_name['public_keys'].message_type = _ATTESTORPUBLICKEY
_PKIXPUBLICKEY.fields_by_name['signature_algorithm'].enum_type = _PKIXPUBLICKEY_SIGNATUREALGORITHM
_PKIXPUBLICKEY_SIGNATUREALGORITHM.containing_type = _PKIXPUBLICKEY
_ATTESTORPUBLICKEY.fields_by_name['pkix_public_key'].message_type = _PKIXPUBLICKEY
_ATTESTORPUBLICKEY.oneofs_by_name['public_key'].fields.append(
  _ATTESTORPUBLICKEY.fields_by_name['ascii_armored_pgp_public_key'])
_ATTESTORPUBLICKEY.fields_by_name['ascii_armored_pgp_public_key'].containing_oneof = _ATTESTORPUBLICKEY.oneofs_by_name['public_key']
_ATTESTORPUBLICKEY.oneofs_by_name['public_key'].fields.append(
  _ATTESTORPUBLICKEY.fields_by_name['pkix_public_key'])
_ATTESTORPUBLICKEY.fields_by_name['pkix_public_key'].containing_oneof = _ATTESTORPUBLICKEY.oneofs_by_name['public_key']
DESCRIPTOR.message_types_by_name['Policy'] = _POLICY
DESCRIPTOR.message_types_by_name['AdmissionWhitelistPattern'] = _ADMISSIONWHITELISTPATTERN
DESCRIPTOR.message_types_by_name['AdmissionRule'] = _ADMISSIONRULE
DESCRIPTOR.message_types_by_name['Attestor'] = _ATTESTOR
DESCRIPTOR.message_types_by_name['UserOwnedDrydockNote'] = _USEROWNEDDRYDOCKNOTE
DESCRIPTOR.message_types_by_name['PkixPublicKey'] = _PKIXPUBLICKEY
DESCRIPTOR.message_types_by_name['AttestorPublicKey'] = _ATTESTORPUBLICKEY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Policy = _reflection.GeneratedProtocolMessageType('Policy', (_message.Message,), {

  'ClusterAdmissionRulesEntry' : _reflection.GeneratedProtocolMessageType('ClusterAdmissionRulesEntry', (_message.Message,), {
    'DESCRIPTOR' : _POLICY_CLUSTERADMISSIONRULESENTRY,
    '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.Policy.ClusterAdmissionRulesEntry)
    })
  ,
  'DESCRIPTOR' : _POLICY,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.Policy)
  })
_sym_db.RegisterMessage(Policy)
_sym_db.RegisterMessage(Policy.ClusterAdmissionRulesEntry)

AdmissionWhitelistPattern = _reflection.GeneratedProtocolMessageType('AdmissionWhitelistPattern', (_message.Message,), {
  'DESCRIPTOR' : _ADMISSIONWHITELISTPATTERN,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)
  })
_sym_db.RegisterMessage(AdmissionWhitelistPattern)

AdmissionRule = _reflection.GeneratedProtocolMessageType('AdmissionRule', (_message.Message,), {
  'DESCRIPTOR' : _ADMISSIONRULE,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.AdmissionRule)
  })
_sym_db.RegisterMessage(AdmissionRule)

Attestor = _reflection.GeneratedProtocolMessageType('Attestor', (_message.Message,), {
  'DESCRIPTOR' : _ATTESTOR,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.Attestor)
  })
_sym_db.RegisterMessage(Attestor)

UserOwnedDrydockNote = _reflection.GeneratedProtocolMessageType('UserOwnedDrydockNote', (_message.Message,), {
  'DESCRIPTOR' : _USEROWNEDDRYDOCKNOTE,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.UserOwnedDrydockNote)
  })
_sym_db.RegisterMessage(UserOwnedDrydockNote)

PkixPublicKey = _reflection.GeneratedProtocolMessageType('PkixPublicKey', (_message.Message,), {
  'DESCRIPTOR' : _PKIXPUBLICKEY,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.PkixPublicKey)
  })
_sym_db.RegisterMessage(PkixPublicKey)

AttestorPublicKey = _reflection.GeneratedProtocolMessageType('AttestorPublicKey', (_message.Message,), {
  'DESCRIPTOR' : _ATTESTORPUBLICKEY,
  '__module__' : 'google.cloud.binaryauthorization.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.AttestorPublicKey)
  })
_sym_db.RegisterMessage(AttestorPublicKey)


DESCRIPTOR._options = None
_POLICY_CLUSTERADMISSIONRULESENTRY._options = None
_POLICY.fields_by_name['name']._options = None
_POLICY.fields_by_name['description']._options = None
_POLICY.fields_by_name['global_policy_evaluation_mode']._options = None
_POLICY.fields_by_name['admission_whitelist_patterns']._options = None
_POLICY.fields_by_name['cluster_admission_rules']._options = None
_POLICY.fields_by_name['default_admission_rule']._options = None
_POLICY.fields_by_name['update_time']._options = None
_POLICY._options = None
_ADMISSIONRULE.fields_by_name['evaluation_mode']._options = None
_ADMISSIONRULE.fields_by_name['require_attestations_by']._options = None
_ADMISSIONRULE.fields_by_name['enforcement_mode']._options = None
_ATTESTOR.fields_by_name['name']._options = None
_ATTESTOR.fields_by_name['description']._options = None
_ATTESTOR.fields_by_name['update_time']._options = None
_ATTESTOR._options = None
_USEROWNEDDRYDOCKNOTE.fields_by_name['note_reference']._options = None
_USEROWNEDDRYDOCKNOTE.fields_by_name['public_keys']._options = None
_USEROWNEDDRYDOCKNOTE.fields_by_name['delegation_service_account_email']._options = None
_ATTESTORPUBLICKEY.fields_by_name['comment']._options = None
# @@protoc_insertion_point(module_scope)
