# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1/mitre_attack.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/securitycenter/v1/mitre_attack.proto\x12\x1egoogle.cloud.securitycenter.v1\"\xe8\x0c\n\x0bMitreAttack\x12J\n\x0eprimary_tactic\x18\x01 \x01(\x0e\x32\x32.google.cloud.securitycenter.v1.MitreAttack.Tactic\x12Q\n\x12primary_techniques\x18\x02 \x03(\x0e\x32\x35.google.cloud.securitycenter.v1.MitreAttack.Technique\x12N\n\x12\x61\x64\x64itional_tactics\x18\x03 \x03(\x0e\x32\x32.google.cloud.securitycenter.v1.MitreAttack.Tactic\x12T\n\x15\x61\x64\x64itional_techniques\x18\x04 \x03(\x0e\x32\x35.google.cloud.securitycenter.v1.MitreAttack.Technique\x12\x0f\n\x07version\x18\x05 \x01(\t\"\xb4\x02\n\x06Tactic\x12\x16\n\x12TACTIC_UNSPECIFIED\x10\x00\x12\x12\n\x0eRECONNAISSANCE\x10\x01\x12\x18\n\x14RESOURCE_DEVELOPMENT\x10\x02\x12\x12\n\x0eINITIAL_ACCESS\x10\x05\x12\r\n\tEXECUTION\x10\x03\x12\x0f\n\x0bPERSISTENCE\x10\x06\x12\x18\n\x14PRIVILEGE_ESCALATION\x10\x08\x12\x13\n\x0f\x44\x45\x46\x45NSE_EVASION\x10\x07\x12\x15\n\x11\x43REDENTIAL_ACCESS\x10\t\x12\r\n\tDISCOVERY\x10\n\x12\x14\n\x10LATERAL_MOVEMENT\x10\x0b\x12\x0e\n\nCOLLECTION\x10\x0c\x12\x17\n\x13\x43OMMAND_AND_CONTROL\x10\x04\x12\x10\n\x0c\x45XFILTRATION\x10\r\x12\n\n\x06IMPACT\x10\x0e\"\xcb\x07\n\tTechnique\x12\x19\n\x15TECHNIQUE_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x41\x43TIVE_SCANNING\x10\x01\x12\x16\n\x12SCANNING_IP_BLOCKS\x10\x02\x12\x19\n\x15INGRESS_TOOL_TRANSFER\x10\x03\x12\x0e\n\nNATIVE_API\x10\x04\x12\x12\n\x0eSHARED_MODULES\x10\x05\x12%\n!COMMAND_AND_SCRIPTING_INTERPRETER\x10\x06\x12\x0e\n\nUNIX_SHELL\x10\x07\x12\x16\n\x12RESOURCE_HIJACKING\x10\x08\x12\t\n\x05PROXY\x10\t\x12\x12\n\x0e\x45XTERNAL_PROXY\x10\n\x12\x13\n\x0fMULTI_HOP_PROXY\x10\x0b\x12\x16\n\x12\x44YNAMIC_RESOLUTION\x10\x0c\x12\x19\n\x15UNSECURED_CREDENTIALS\x10\r\x12\x12\n\x0eVALID_ACCOUNTS\x10\x0e\x12\x12\n\x0eLOCAL_ACCOUNTS\x10\x0f\x12\x12\n\x0e\x43LOUD_ACCOUNTS\x10\x10\x12\x1d\n\x19NETWORK_DENIAL_OF_SERVICE\x10\x11\x12\x1f\n\x1bPERMISSION_GROUPS_DISCOVERY\x10\x12\x12\x10\n\x0c\x43LOUD_GROUPS\x10\x13\x12!\n\x1d\x45XFILTRATION_OVER_WEB_SERVICE\x10\x14\x12!\n\x1d\x45XFILTRATION_TO_CLOUD_STORAGE\x10\x15\x12\x18\n\x14\x41\x43\x43OUNT_MANIPULATION\x10\x16\x12\x17\n\x13SSH_AUTHORIZED_KEYS\x10\x17\x12#\n\x1f\x43REATE_OR_MODIFY_SYSTEM_PROCESS\x10\x18\x12\x1c\n\x18STEAL_WEB_SESSION_COOKIE\x10\x19\x12\'\n#MODIFY_CLOUD_COMPUTE_INFRASTRUCTURE\x10\x1a\x12%\n!EXPLOIT_PUBLIC_FACING_APPLICATION\x10\x1b\x12!\n\x1dMODIFY_AUTHENTICATION_PROCESS\x10\x1c\x12\x14\n\x10\x44\x41TA_DESTRUCTION\x10\x1d\x12\x1e\n\x1a\x44OMAIN_POLICY_MODIFICATION\x10\x1e\x12\x13\n\x0fIMPAIR_DEFENSES\x10\x1f\x12\x1d\n\x19NETWORK_SERVICE_DISCOVERY\x10 \x12\x1d\n\x19\x41\x43\x43\x45SS_TOKEN_MANIPULATION\x10!\x12%\n!ABUSE_ELEVATION_CONTROL_MECHANISM\x10\"\x12\x14\n\x10\x44\x45\x46\x41ULT_ACCOUNTS\x10#B\xec\x01\n\"com.google.cloud.securitycenter.v1B\x10MitreAttackProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1;securitycenter\xaa\x02\x1eGoogle.Cloud.SecurityCenter.V1\xca\x02\x1eGoogle\\Cloud\\SecurityCenter\\V1\xea\x02!Google::Cloud::SecurityCenter::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.securitycenter.v1.mitre_attack_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.cloud.securitycenter.v1B\020MitreAttackProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1;securitycenter\252\002\036Google.Cloud.SecurityCenter.V1\312\002\036Google\\Cloud\\SecurityCenter\\V1\352\002!Google::Cloud::SecurityCenter::V1'
  _MITREATTACK._serialized_start=86
  _MITREATTACK._serialized_end=1726
  _MITREATTACK_TACTIC._serialized_start=444
  _MITREATTACK_TACTIC._serialized_end=752
  _MITREATTACK_TECHNIQUE._serialized_start=755
  _MITREATTACK_TECHNIQUE._serialized_end=1726
# @@protoc_insertion_point(module_scope)
