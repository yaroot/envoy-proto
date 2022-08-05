# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto
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
from google.cloud.securitycenter.settings.v1beta1 import component_settings_pb2 as google_dot_cloud_dot_securitycenter_dot_settings_dot_v1beta1_dot_component__settings__pb2
from google.cloud.securitycenter.settings.v1beta1 import detector_pb2 as google_dot_cloud_dot_securitycenter_dot_settings_dot_v1beta1_dot_detector__pb2
from google.cloud.securitycenter.settings.v1beta1 import settings_pb2 as google_dot_cloud_dot_securitycenter_dot_settings_dot_v1beta1_dot_settings__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nRgoogle/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto\x12,google.cloud.securitycenter.settings.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x45google/cloud/securitycenter/settings/v1beta1/component_settings.proto\x1a;google/cloud/securitycenter/settings/v1beta1/detector.proto\x1a;google/cloud/securitycenter/settings/v1beta1/settings.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"^\n\x18GetServiceAccountRequest\x12\x42\n\x04name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,securitycenter.googleapis.com/ServiceAccount\"\x97\x01\n\x0eServiceAccount\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x17\n\x0fservice_account\x18\x02 \x01(\t:^\xea\x41[\n,securitycenter.googleapis.com/ServiceAccount\x12+organizations/{organization}/serviceAccount\"R\n\x12GetSettingsRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&securitycenter.googleapis.com/Settings\"\x97\x01\n\x15UpdateSettingsRequest\x12M\n\x08settings\x18\x01 \x01(\x0b\x32\x36.google.cloud.securitycenter.settings.v1beta1.SettingsB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"b\n\x14ResetSettingsRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&securitycenter.googleapis.com/Settings\x12\x0c\n\x04\x65tag\x18\x02 \x01(\t\"r\n\x17\x42\x61tchGetSettingsRequest\x12H\n\x06parent\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0cloudresourcemanager.googleapis.com/Organization\x12\r\n\x05names\x18\x02 \x03(\t\"d\n\x18\x42\x61tchGetSettingsResponse\x12H\n\x08settings\x18\x01 \x03(\x0b\x32\x36.google.cloud.securitycenter.settings.v1beta1.Settings\"a\n!CalculateEffectiveSettingsRequest\x12<\n\x04name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&securitycenter.googleapis.com/Settings\"\xd5\x01\n&BatchCalculateEffectiveSettingsRequest\x12H\n\x06parent\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0cloudresourcemanager.googleapis.com/Organization\x12\x61\n\x08requests\x18\x02 \x03(\x0b\x32O.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest\"s\n\'BatchCalculateEffectiveSettingsResponse\x12H\n\x08settings\x18\x01 \x03(\x0b\x32\x36.google.cloud.securitycenter.settings.v1beta1.Settings\"d\n\x1bGetComponentSettingsRequest\x12\x45\n\x04name\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\n/securitycenter.googleapis.com/ComponentSettings\"\xb3\x01\n\x1eUpdateComponentSettingsRequest\x12`\n\x12\x63omponent_settings\x18\x01 \x01(\x0b\x32?.google.cloud.securitycenter.settings.v1beta1.ComponentSettingsB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"t\n\x1dResetComponentSettingsRequest\x12\x45\n\x04name\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\n/securitycenter.googleapis.com/ComponentSettings\x12\x0c\n\x04\x65tag\x18\x02 \x01(\t\"s\n*CalculateEffectiveComponentSettingsRequest\x12\x45\n\x04name\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\n/securitycenter.googleapis.com/ComponentSettings\"\x97\x01\n\x14ListDetectorsRequest\x12H\n\x06parent\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0cloudresourcemanager.googleapis.com/Organization\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"{\n\x15ListDetectorsResponse\x12I\n\tdetectors\x18\x01 \x03(\x0b\x32\x36.google.cloud.securitycenter.settings.v1beta1.Detector\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x88\x01\n\x15ListComponentsRequest\x12H\n\x06parent\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0cloudresourcemanager.googleapis.com/Organization\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"E\n\x16ListComponentsResponse\x12\x12\n\ncomponents\x18\x01 \x03(\t\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\x84\x33\n\x1dSecurityCenterSettingsService\x12\xe1\x01\n\x11GetServiceAccount\x12\x46.google.cloud.securitycenter.settings.v1beta1.GetServiceAccountRequest\x1a<.google.cloud.securitycenter.settings.v1beta1.ServiceAccount\"F\x82\xd3\xe4\x93\x02\x39\x12\x37/settings/v1beta1/{name=organizations/*/serviceAccount}\xda\x41\x04name\x12\xf9\x03\n\x0bGetSettings\x12@.google.cloud.securitycenter.settings.v1beta1.GetSettingsRequest\x1a\x36.google.cloud.securitycenter.settings.v1beta1.Settings\"\xef\x02\x82\xd3\xe4\x93\x02\xe1\x02\x12\x31/settings/v1beta1/{name=organizations/*/settings}Z-\x12+/settings/v1beta1/{name=folders/*/settings}Z.\x12,/settings/v1beta1/{name=projects/*/settings}ZE\x12\x43/settings/v1beta1/{name=projects/*/locations/*/clusters/*/settings}ZC\x12\x41/settings/v1beta1/{name=projects/*/regions/*/clusters/*/settings}ZA\x12?/settings/v1beta1/{name=projects/*/zones/*/clusters/*/settings}\xda\x41\x04name\x12\x81\x05\n\x0eUpdateSettings\x12\x43.google.cloud.securitycenter.settings.v1beta1.UpdateSettingsRequest\x1a\x36.google.cloud.securitycenter.settings.v1beta1.Settings\"\xf1\x03\x82\xd3\xe4\x93\x02\xd3\x03\x32:/settings/v1beta1/{settings.name=organizations/*/settings}:\x08settingsZ@24/settings/v1beta1/{settings.name=folders/*/settings}:\x08settingsZA25/settings/v1beta1/{settings.name=projects/*/settings}:\x08settingsZX2L/settings/v1beta1/{settings.name=projects/*/locations/*/clusters/*/settings}:\x08settingsZV2J/settings/v1beta1/{settings.name=projects/*/regions/*/clusters/*/settings}:\x08settingsZT2H/settings/v1beta1/{settings.name=projects/*/zones/*/clusters/*/settings}:\x08settings\xda\x41\x14settings,update_mask\x12\x8c\x04\n\rResetSettings\x12\x42.google.cloud.securitycenter.settings.v1beta1.ResetSettingsRequest\x1a\x16.google.protobuf.Empty\"\x9e\x03\x82\xd3\xe4\x93\x02\x97\x03\"7/settings/v1beta1/{name=organizations/*/settings}:reset:\x01*Z6\"1/settings/v1beta1/{name=folders/*/settings}:reset:\x01*Z7\"2/settings/v1beta1/{name=projects/*/settings}:reset:\x01*ZN\"I/settings/v1beta1/{name=projects/*/locations/*/clusters/*/settings}:reset:\x01*ZL\"G/settings/v1beta1/{name=projects/*/regions/*/clusters/*/settings}:reset:\x01*ZJ\"E/settings/v1beta1/{name=projects/*/zones/*/clusters/*/settings}:reset:\x01*\x12\xe7\x01\n\x10\x42\x61tchGetSettings\x12\x45.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest\x1a\x46.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse\"D\x82\xd3\xe4\x93\x02>\x12</settings/v1beta1/{parent=organizations/*}/settings:batchGet\x12\x89\x05\n\x1a\x43\x61lculateEffectiveSettings\x12O.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest\x1a\x36.google.cloud.securitycenter.settings.v1beta1.Settings\"\xe1\x03\x82\xd3\xe4\x93\x02\xd3\x03\x12\x44/settings/v1beta1/{name=organizations/*/effectiveSettings}:calculateZ@\x12>/settings/v1beta1/{name=folders/*/effectiveSettings}:calculateZA\x12?/settings/v1beta1/{name=projects/*/effectiveSettings}:calculateZX\x12V/settings/v1beta1/{name=projects/*/locations/*/clusters/*/effectiveSettings}:calculateZV\x12T/settings/v1beta1/{name=projects/*/regions/*/clusters/*/effectiveSettings}:calculateZT\x12R/settings/v1beta1/{name=projects/*/zones/*/clusters/*/effectiveSettings}:calculate\xda\x41\x04name\x12\xa6\x02\n\x1f\x42\x61tchCalculateEffectiveSettings\x12T.google.cloud.securitycenter.settings.v1beta1.BatchCalculateEffectiveSettingsRequest\x1aU.google.cloud.securitycenter.settings.v1beta1.BatchCalculateEffectiveSettingsResponse\"V\x82\xd3\xe4\x93\x02P\"K/settings/v1beta1/{parent=organizations/*}/effectiveSettings:batchCalculate:\x01*\x12\xe2\x04\n\x14GetComponentSettings\x12I.google.cloud.securitycenter.settings.v1beta1.GetComponentSettingsRequest\x1a?.google.cloud.securitycenter.settings.v1beta1.ComponentSettings\"\xbd\x03\x82\xd3\xe4\x93\x02\xaf\x03\x12>/settings/v1beta1/{name=organizations/*/components/*/settings}Z:\x12\x38/settings/v1beta1/{name=folders/*/components/*/settings}Z;\x12\x39/settings/v1beta1/{name=projects/*/components/*/settings}ZR\x12P/settings/v1beta1/{name=projects/*/locations/*/clusters/*/components/*/settings}ZP\x12N/settings/v1beta1/{name=projects/*/regions/*/clusters/*/components/*/settings}ZN\x12L/settings/v1beta1/{name=projects/*/zones/*/clusters/*/components/*/settings}\xda\x41\x04name\x12\xec\x06\n\x17UpdateComponentSettings\x12L.google.cloud.securitycenter.settings.v1beta1.UpdateComponentSettingsRequest\x1a?.google.cloud.securitycenter.settings.v1beta1.ComponentSettings\"\xc1\x05\x82\xd3\xe4\x93\x02\x99\x05\x32Q/settings/v1beta1/{component_settings.name=organizations/*/components/*/settings}:\x12\x63omponent_settingsZa2K/settings/v1beta1/{component_settings.name=folders/*/components/*/settings}:\x12\x63omponent_settingsZb2L/settings/v1beta1/{component_settings.name=projects/*/components/*/settings}:\x12\x63omponent_settingsZy2c/settings/v1beta1/{component_settings.name=projects/*/locations/*/clusters/*/components/*/settings}:\x12\x63omponent_settingsZw2a/settings/v1beta1/{component_settings.name=projects/*/regions/*/clusters/*/components/*/settings}:\x12\x63omponent_settingsZu2_/settings/v1beta1/{component_settings.name=projects/*/zones/*/clusters/*/components/*/settings}:\x12\x63omponent_settings\xda\x41\x1e\x63omponent_settings,update_mask\x12\xec\x04\n\x16ResetComponentSettings\x12K.google.cloud.securitycenter.settings.v1beta1.ResetComponentSettingsRequest\x1a\x16.google.protobuf.Empty\"\xec\x03\x82\xd3\xe4\x93\x02\xe5\x03\"D/settings/v1beta1/{name=organizations/*/components/*/settings}:reset:\x01*ZC\">/settings/v1beta1/{name=folders/*/components/*/settings}:reset:\x01*ZD\"?/settings/v1beta1/{name=projects/*/components/*/settings}:reset:\x01*Z[\"V/settings/v1beta1/{name=projects/*/locations/*/clusters/*/components/*/settings}:reset:\x01*ZY\"T/settings/v1beta1/{name=projects/*/regions/*/clusters/*/components/*/settings}:reset:\x01*ZW\"R/settings/v1beta1/{name=projects/*/zones/*/clusters/*/components/*/settings}:reset:\x01*\x12\xf2\x05\n#CalculateEffectiveComponentSettings\x12X.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveComponentSettingsRequest\x1a?.google.cloud.securitycenter.settings.v1beta1.ComponentSettings\"\xaf\x04\x82\xd3\xe4\x93\x02\xa1\x04\x12Q/settings/v1beta1/{name=organizations/*/components/*/effectiveSettings}:calculateZM\x12K/settings/v1beta1/{name=folders/*/components/*/effectiveSettings}:calculateZN\x12L/settings/v1beta1/{name=projects/*/components/*/effectiveSettings}:calculateZe\x12\x63/settings/v1beta1/{name=projects/*/locations/*/clusters/*/components/*/effectiveSettings}:calculateZc\x12\x61/settings/v1beta1/{name=projects/*/regions/*/clusters/*/components/*/effectiveSettings}:calculateZa\x12_/settings/v1beta1/{name=projects/*/zones/*/clusters/*/components/*/effectiveSettings}:calculate\xda\x41\x04name\x12\xdf\x01\n\rListDetectors\x12\x42.google.cloud.securitycenter.settings.v1beta1.ListDetectorsRequest\x1a\x43.google.cloud.securitycenter.settings.v1beta1.ListDetectorsResponse\"E\x82\xd3\xe4\x93\x02\x36\x12\x34/settings/v1beta1/{parent=organizations/*}/detectors\xda\x41\x06parent\x12\xe3\x01\n\x0eListComponents\x12\x43.google.cloud.securitycenter.settings.v1beta1.ListComponentsRequest\x1a\x44.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse\"F\x82\xd3\xe4\x93\x02\x37\x12\x35/settings/v1beta1/{parent=organizations/*}/components\xda\x41\x06parent\x1aQ\xca\x41\x1dsecuritycenter.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xb4\x02\n0com.google.cloud.securitycenter.settings.v1beta1B\x14SettingsServiceProtoP\x01ZTgoogle.golang.org/genproto/googleapis/cloud/securitycenter/settings/v1beta1;settings\xf8\x01\x01\xaa\x02,Google.Cloud.SecurityCenter.Settings.V1Beta1\xca\x02,Google\\Cloud\\SecurityCenter\\Settings\\V1beta1\xea\x02\x30Google::Cloud::SecurityCenter::Settings::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.securitycenter.settings.v1beta1.securitycenter_settings_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n0com.google.cloud.securitycenter.settings.v1beta1B\024SettingsServiceProtoP\001ZTgoogle.golang.org/genproto/googleapis/cloud/securitycenter/settings/v1beta1;settings\370\001\001\252\002,Google.Cloud.SecurityCenter.Settings.V1Beta1\312\002,Google\\Cloud\\SecurityCenter\\Settings\\V1beta1\352\0020Google::Cloud::SecurityCenter::Settings::V1beta1'
  _GETSERVICEACCOUNTREQUEST.fields_by_name['name']._options = None
  _GETSERVICEACCOUNTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A.\n,securitycenter.googleapis.com/ServiceAccount'
  _SERVICEACCOUNT._options = None
  _SERVICEACCOUNT._serialized_options = b'\352A[\n,securitycenter.googleapis.com/ServiceAccount\022+organizations/{organization}/serviceAccount'
  _GETSETTINGSREQUEST.fields_by_name['name']._options = None
  _GETSETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A(\n&securitycenter.googleapis.com/Settings'
  _UPDATESETTINGSREQUEST.fields_by_name['settings']._options = None
  _UPDATESETTINGSREQUEST.fields_by_name['settings']._serialized_options = b'\340A\002'
  _RESETSETTINGSREQUEST.fields_by_name['name']._options = None
  _RESETSETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A(\n&securitycenter.googleapis.com/Settings'
  _BATCHGETSETTINGSREQUEST.fields_by_name['parent']._options = None
  _BATCHGETSETTINGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A2\n0cloudresourcemanager.googleapis.com/Organization'
  _CALCULATEEFFECTIVESETTINGSREQUEST.fields_by_name['name']._options = None
  _CALCULATEEFFECTIVESETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A(\n&securitycenter.googleapis.com/Settings'
  _BATCHCALCULATEEFFECTIVESETTINGSREQUEST.fields_by_name['parent']._options = None
  _BATCHCALCULATEEFFECTIVESETTINGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A2\n0cloudresourcemanager.googleapis.com/Organization'
  _GETCOMPONENTSETTINGSREQUEST.fields_by_name['name']._options = None
  _GETCOMPONENTSETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A1\n/securitycenter.googleapis.com/ComponentSettings'
  _UPDATECOMPONENTSETTINGSREQUEST.fields_by_name['component_settings']._options = None
  _UPDATECOMPONENTSETTINGSREQUEST.fields_by_name['component_settings']._serialized_options = b'\340A\002'
  _RESETCOMPONENTSETTINGSREQUEST.fields_by_name['name']._options = None
  _RESETCOMPONENTSETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A1\n/securitycenter.googleapis.com/ComponentSettings'
  _CALCULATEEFFECTIVECOMPONENTSETTINGSREQUEST.fields_by_name['name']._options = None
  _CALCULATEEFFECTIVECOMPONENTSETTINGSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A1\n/securitycenter.googleapis.com/ComponentSettings'
  _LISTDETECTORSREQUEST.fields_by_name['parent']._options = None
  _LISTDETECTORSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A2\n0cloudresourcemanager.googleapis.com/Organization'
  _LISTCOMPONENTSREQUEST.fields_by_name['parent']._options = None
  _LISTCOMPONENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A2\n0cloudresourcemanager.googleapis.com/Organization'
  _SECURITYCENTERSETTINGSSERVICE._options = None
  _SECURITYCENTERSETTINGSSERVICE._serialized_options = b'\312A\035securitycenter.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['GetServiceAccount']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['GetServiceAccount']._serialized_options = b'\202\323\344\223\0029\0227/settings/v1beta1/{name=organizations/*/serviceAccount}\332A\004name'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['GetSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['GetSettings']._serialized_options = b'\202\323\344\223\002\341\002\0221/settings/v1beta1/{name=organizations/*/settings}Z-\022+/settings/v1beta1/{name=folders/*/settings}Z.\022,/settings/v1beta1/{name=projects/*/settings}ZE\022C/settings/v1beta1/{name=projects/*/locations/*/clusters/*/settings}ZC\022A/settings/v1beta1/{name=projects/*/regions/*/clusters/*/settings}ZA\022?/settings/v1beta1/{name=projects/*/zones/*/clusters/*/settings}\332A\004name'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['UpdateSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['UpdateSettings']._serialized_options = b'\202\323\344\223\002\323\0032:/settings/v1beta1/{settings.name=organizations/*/settings}:\010settingsZ@24/settings/v1beta1/{settings.name=folders/*/settings}:\010settingsZA25/settings/v1beta1/{settings.name=projects/*/settings}:\010settingsZX2L/settings/v1beta1/{settings.name=projects/*/locations/*/clusters/*/settings}:\010settingsZV2J/settings/v1beta1/{settings.name=projects/*/regions/*/clusters/*/settings}:\010settingsZT2H/settings/v1beta1/{settings.name=projects/*/zones/*/clusters/*/settings}:\010settings\332A\024settings,update_mask'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ResetSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ResetSettings']._serialized_options = b'\202\323\344\223\002\227\003\"7/settings/v1beta1/{name=organizations/*/settings}:reset:\001*Z6\"1/settings/v1beta1/{name=folders/*/settings}:reset:\001*Z7\"2/settings/v1beta1/{name=projects/*/settings}:reset:\001*ZN\"I/settings/v1beta1/{name=projects/*/locations/*/clusters/*/settings}:reset:\001*ZL\"G/settings/v1beta1/{name=projects/*/regions/*/clusters/*/settings}:reset:\001*ZJ\"E/settings/v1beta1/{name=projects/*/zones/*/clusters/*/settings}:reset:\001*'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['BatchGetSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['BatchGetSettings']._serialized_options = b'\202\323\344\223\002>\022</settings/v1beta1/{parent=organizations/*}/settings:batchGet'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['CalculateEffectiveSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['CalculateEffectiveSettings']._serialized_options = b'\202\323\344\223\002\323\003\022D/settings/v1beta1/{name=organizations/*/effectiveSettings}:calculateZ@\022>/settings/v1beta1/{name=folders/*/effectiveSettings}:calculateZA\022?/settings/v1beta1/{name=projects/*/effectiveSettings}:calculateZX\022V/settings/v1beta1/{name=projects/*/locations/*/clusters/*/effectiveSettings}:calculateZV\022T/settings/v1beta1/{name=projects/*/regions/*/clusters/*/effectiveSettings}:calculateZT\022R/settings/v1beta1/{name=projects/*/zones/*/clusters/*/effectiveSettings}:calculate\332A\004name'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['BatchCalculateEffectiveSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['BatchCalculateEffectiveSettings']._serialized_options = b'\202\323\344\223\002P\"K/settings/v1beta1/{parent=organizations/*}/effectiveSettings:batchCalculate:\001*'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['GetComponentSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['GetComponentSettings']._serialized_options = b'\202\323\344\223\002\257\003\022>/settings/v1beta1/{name=organizations/*/components/*/settings}Z:\0228/settings/v1beta1/{name=folders/*/components/*/settings}Z;\0229/settings/v1beta1/{name=projects/*/components/*/settings}ZR\022P/settings/v1beta1/{name=projects/*/locations/*/clusters/*/components/*/settings}ZP\022N/settings/v1beta1/{name=projects/*/regions/*/clusters/*/components/*/settings}ZN\022L/settings/v1beta1/{name=projects/*/zones/*/clusters/*/components/*/settings}\332A\004name'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['UpdateComponentSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['UpdateComponentSettings']._serialized_options = b'\202\323\344\223\002\231\0052Q/settings/v1beta1/{component_settings.name=organizations/*/components/*/settings}:\022component_settingsZa2K/settings/v1beta1/{component_settings.name=folders/*/components/*/settings}:\022component_settingsZb2L/settings/v1beta1/{component_settings.name=projects/*/components/*/settings}:\022component_settingsZy2c/settings/v1beta1/{component_settings.name=projects/*/locations/*/clusters/*/components/*/settings}:\022component_settingsZw2a/settings/v1beta1/{component_settings.name=projects/*/regions/*/clusters/*/components/*/settings}:\022component_settingsZu2_/settings/v1beta1/{component_settings.name=projects/*/zones/*/clusters/*/components/*/settings}:\022component_settings\332A\036component_settings,update_mask'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ResetComponentSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ResetComponentSettings']._serialized_options = b'\202\323\344\223\002\345\003\"D/settings/v1beta1/{name=organizations/*/components/*/settings}:reset:\001*ZC\">/settings/v1beta1/{name=folders/*/components/*/settings}:reset:\001*ZD\"?/settings/v1beta1/{name=projects/*/components/*/settings}:reset:\001*Z[\"V/settings/v1beta1/{name=projects/*/locations/*/clusters/*/components/*/settings}:reset:\001*ZY\"T/settings/v1beta1/{name=projects/*/regions/*/clusters/*/components/*/settings}:reset:\001*ZW\"R/settings/v1beta1/{name=projects/*/zones/*/clusters/*/components/*/settings}:reset:\001*'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['CalculateEffectiveComponentSettings']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['CalculateEffectiveComponentSettings']._serialized_options = b'\202\323\344\223\002\241\004\022Q/settings/v1beta1/{name=organizations/*/components/*/effectiveSettings}:calculateZM\022K/settings/v1beta1/{name=folders/*/components/*/effectiveSettings}:calculateZN\022L/settings/v1beta1/{name=projects/*/components/*/effectiveSettings}:calculateZe\022c/settings/v1beta1/{name=projects/*/locations/*/clusters/*/components/*/effectiveSettings}:calculateZc\022a/settings/v1beta1/{name=projects/*/regions/*/clusters/*/components/*/effectiveSettings}:calculateZa\022_/settings/v1beta1/{name=projects/*/zones/*/clusters/*/components/*/effectiveSettings}:calculate\332A\004name'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ListDetectors']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ListDetectors']._serialized_options = b'\202\323\344\223\0026\0224/settings/v1beta1/{parent=organizations/*}/detectors\332A\006parent'
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ListComponents']._options = None
  _SECURITYCENTERSETTINGSSERVICE.methods_by_name['ListComponents']._serialized_options = b'\202\323\344\223\0027\0225/settings/v1beta1/{parent=organizations/*}/components\332A\006parent'
  _GETSERVICEACCOUNTREQUEST._serialized_start=503
  _GETSERVICEACCOUNTREQUEST._serialized_end=597
  _SERVICEACCOUNT._serialized_start=600
  _SERVICEACCOUNT._serialized_end=751
  _GETSETTINGSREQUEST._serialized_start=753
  _GETSETTINGSREQUEST._serialized_end=835
  _UPDATESETTINGSREQUEST._serialized_start=838
  _UPDATESETTINGSREQUEST._serialized_end=989
  _RESETSETTINGSREQUEST._serialized_start=991
  _RESETSETTINGSREQUEST._serialized_end=1089
  _BATCHGETSETTINGSREQUEST._serialized_start=1091
  _BATCHGETSETTINGSREQUEST._serialized_end=1205
  _BATCHGETSETTINGSRESPONSE._serialized_start=1207
  _BATCHGETSETTINGSRESPONSE._serialized_end=1307
  _CALCULATEEFFECTIVESETTINGSREQUEST._serialized_start=1309
  _CALCULATEEFFECTIVESETTINGSREQUEST._serialized_end=1406
  _BATCHCALCULATEEFFECTIVESETTINGSREQUEST._serialized_start=1409
  _BATCHCALCULATEEFFECTIVESETTINGSREQUEST._serialized_end=1622
  _BATCHCALCULATEEFFECTIVESETTINGSRESPONSE._serialized_start=1624
  _BATCHCALCULATEEFFECTIVESETTINGSRESPONSE._serialized_end=1739
  _GETCOMPONENTSETTINGSREQUEST._serialized_start=1741
  _GETCOMPONENTSETTINGSREQUEST._serialized_end=1841
  _UPDATECOMPONENTSETTINGSREQUEST._serialized_start=1844
  _UPDATECOMPONENTSETTINGSREQUEST._serialized_end=2023
  _RESETCOMPONENTSETTINGSREQUEST._serialized_start=2025
  _RESETCOMPONENTSETTINGSREQUEST._serialized_end=2141
  _CALCULATEEFFECTIVECOMPONENTSETTINGSREQUEST._serialized_start=2143
  _CALCULATEEFFECTIVECOMPONENTSETTINGSREQUEST._serialized_end=2258
  _LISTDETECTORSREQUEST._serialized_start=2261
  _LISTDETECTORSREQUEST._serialized_end=2412
  _LISTDETECTORSRESPONSE._serialized_start=2414
  _LISTDETECTORSRESPONSE._serialized_end=2537
  _LISTCOMPONENTSREQUEST._serialized_start=2540
  _LISTCOMPONENTSREQUEST._serialized_end=2676
  _LISTCOMPONENTSRESPONSE._serialized_start=2678
  _LISTCOMPONENTSRESPONSE._serialized_end=2747
  _SECURITYCENTERSETTINGSSERVICE._serialized_start=2750
  _SECURITYCENTERSETTINGSSERVICE._serialized_end=9282
# @@protoc_insertion_point(module_scope)
