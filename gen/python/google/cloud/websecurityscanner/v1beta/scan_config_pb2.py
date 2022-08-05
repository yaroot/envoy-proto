# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/websecurityscanner/v1beta/scan_config.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.websecurityscanner.v1beta import scan_run_pb2 as google_dot_cloud_dot_websecurityscanner_dot_v1beta_dot_scan__run__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8google/cloud/websecurityscanner/v1beta/scan_config.proto\x12&google.cloud.websecurityscanner.v1beta\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x35google/cloud/websecurityscanner/v1beta/scan_run.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa6\r\n\nScanConfig\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x0f\n\x07max_qps\x18\x03 \x01(\x05\x12\x1a\n\rstarting_urls\x18\x04 \x03(\tB\x03\xe0\x41\x02\x12Y\n\x0e\x61uthentication\x18\x05 \x01(\x0b\x32\x41.google.cloud.websecurityscanner.v1beta.ScanConfig.Authentication\x12P\n\nuser_agent\x18\x06 \x01(\x0e\x32<.google.cloud.websecurityscanner.v1beta.ScanConfig.UserAgent\x12\x1a\n\x12\x62lacklist_patterns\x18\x07 \x03(\t\x12M\n\x08schedule\x18\x08 \x01(\x0b\x32;.google.cloud.websecurityscanner.v1beta.ScanConfig.Schedule\x12[\n\x10target_platforms\x18\t \x03(\x0e\x32\x41.google.cloud.websecurityscanner.v1beta.ScanConfig.TargetPlatform\x12{\n!export_to_security_command_center\x18\n \x01(\x0e\x32P.google.cloud.websecurityscanner.v1beta.ScanConfig.ExportToSecurityCommandCenter\x12\x43\n\nlatest_run\x18\x0b \x01(\x0b\x32/.google.cloud.websecurityscanner.v1beta.ScanRun\x12P\n\nrisk_level\x18\x0c \x01(\x0e\x32<.google.cloud.websecurityscanner.v1beta.ScanConfig.RiskLevel\x1a\x94\x03\n\x0e\x41uthentication\x12i\n\x0egoogle_account\x18\x01 \x01(\x0b\x32O.google.cloud.websecurityscanner.v1beta.ScanConfig.Authentication.GoogleAccountH\x00\x12i\n\x0e\x63ustom_account\x18\x02 \x01(\x0b\x32O.google.cloud.websecurityscanner.v1beta.ScanConfig.Authentication.CustomAccountH\x00\x1a@\n\rGoogleAccount\x12\x15\n\x08username\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x08password\x18\x02 \x01(\tB\x06\xe0\x41\x02\xe0\x41\x04\x1aX\n\rCustomAccount\x12\x15\n\x08username\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x08password\x18\x02 \x01(\tB\x06\xe0\x41\x02\xe0\x41\x04\x12\x16\n\tlogin_url\x18\x03 \x01(\tB\x03\xe0\x41\x02\x42\x10\n\x0e\x61uthentication\x1a\x62\n\x08Schedule\x12\x31\n\rschedule_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12#\n\x16interval_duration_days\x18\x02 \x01(\x05\x42\x03\xe0\x41\x02\"`\n\tUserAgent\x12\x1a\n\x16USER_AGENT_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x43HROME_LINUX\x10\x01\x12\x12\n\x0e\x43HROME_ANDROID\x10\x02\x12\x11\n\rSAFARI_IPHONE\x10\x03\"N\n\x0eTargetPlatform\x12\x1f\n\x1bTARGET_PLATFORM_UNSPECIFIED\x10\x00\x12\x0e\n\nAPP_ENGINE\x10\x01\x12\x0b\n\x07\x43OMPUTE\x10\x02\"<\n\tRiskLevel\x12\x1a\n\x16RISK_LEVEL_UNSPECIFIED\x10\x00\x12\n\n\x06NORMAL\x10\x01\x12\x07\n\x03LOW\x10\x02\"m\n\x1d\x45xportToSecurityCommandCenter\x12\x31\n-EXPORT_TO_SECURITY_COMMAND_CENTER_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x45NABLED\x10\x01\x12\x0c\n\x08\x44ISABLED\x10\x02:_\xea\x41\\\n,websecurityscanner.googleapis.com/ScanConfig\x12,projects/{project}/scanConfigs/{scan_config}B\x97\x02\n*com.google.cloud.websecurityscanner.v1betaB\x0fScanConfigProtoP\x01ZXgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1beta;websecurityscanner\xaa\x02&Google.Cloud.WebSecurityScanner.V1Beta\xca\x02&Google\\Cloud\\WebSecurityScanner\\V1beta\xea\x02)Google::Cloud::WebSecurityScanner::V1betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.websecurityscanner.v1beta.scan_config_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.websecurityscanner.v1betaB\017ScanConfigProtoP\001ZXgoogle.golang.org/genproto/googleapis/cloud/websecurityscanner/v1beta;websecurityscanner\252\002&Google.Cloud.WebSecurityScanner.V1Beta\312\002&Google\\Cloud\\WebSecurityScanner\\V1beta\352\002)Google::Cloud::WebSecurityScanner::V1beta'
  _SCANCONFIG_AUTHENTICATION_GOOGLEACCOUNT.fields_by_name['username']._options = None
  _SCANCONFIG_AUTHENTICATION_GOOGLEACCOUNT.fields_by_name['username']._serialized_options = b'\340A\002'
  _SCANCONFIG_AUTHENTICATION_GOOGLEACCOUNT.fields_by_name['password']._options = None
  _SCANCONFIG_AUTHENTICATION_GOOGLEACCOUNT.fields_by_name['password']._serialized_options = b'\340A\002\340A\004'
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT.fields_by_name['username']._options = None
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT.fields_by_name['username']._serialized_options = b'\340A\002'
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT.fields_by_name['password']._options = None
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT.fields_by_name['password']._serialized_options = b'\340A\002\340A\004'
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT.fields_by_name['login_url']._options = None
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT.fields_by_name['login_url']._serialized_options = b'\340A\002'
  _SCANCONFIG_SCHEDULE.fields_by_name['interval_duration_days']._options = None
  _SCANCONFIG_SCHEDULE.fields_by_name['interval_duration_days']._serialized_options = b'\340A\002'
  _SCANCONFIG.fields_by_name['display_name']._options = None
  _SCANCONFIG.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _SCANCONFIG.fields_by_name['starting_urls']._options = None
  _SCANCONFIG.fields_by_name['starting_urls']._serialized_options = b'\340A\002'
  _SCANCONFIG._options = None
  _SCANCONFIG._serialized_options = b'\352A\\\n,websecurityscanner.googleapis.com/ScanConfig\022,projects/{project}/scanConfigs/{scan_config}'
  _SCANCONFIG._serialized_start=249
  _SCANCONFIG._serialized_end=1951
  _SCANCONFIG_AUTHENTICATION._serialized_start=999
  _SCANCONFIG_AUTHENTICATION._serialized_end=1403
  _SCANCONFIG_AUTHENTICATION_GOOGLEACCOUNT._serialized_start=1231
  _SCANCONFIG_AUTHENTICATION_GOOGLEACCOUNT._serialized_end=1295
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT._serialized_start=1297
  _SCANCONFIG_AUTHENTICATION_CUSTOMACCOUNT._serialized_end=1385
  _SCANCONFIG_SCHEDULE._serialized_start=1405
  _SCANCONFIG_SCHEDULE._serialized_end=1503
  _SCANCONFIG_USERAGENT._serialized_start=1505
  _SCANCONFIG_USERAGENT._serialized_end=1601
  _SCANCONFIG_TARGETPLATFORM._serialized_start=1603
  _SCANCONFIG_TARGETPLATFORM._serialized_end=1681
  _SCANCONFIG_RISKLEVEL._serialized_start=1683
  _SCANCONFIG_RISKLEVEL._serialized_end=1743
  _SCANCONFIG_EXPORTTOSECURITYCOMMANDCENTER._serialized_start=1745
  _SCANCONFIG_EXPORTTOSECURITYCOMMANDCENTER._serialized_end=1854
# @@protoc_insertion_point(module_scope)
