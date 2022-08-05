# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/iot/v1/device_manager.proto
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
from google.cloud.iot.v1 import resources_pb2 as google_dot_cloud_dot_iot_dot_v1_dot_resources__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(google/cloud/iot/v1/device_manager.proto\x12\x13google.cloud.iot.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/cloud/iot/v1/resources.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\x9b\x01\n\x1b\x43reateDeviceRegistryRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x41\n\x0f\x64\x65vice_registry\x18\x02 \x01(\x0b\x32#.google.cloud.iot.v1.DeviceRegistryB\x03\xe0\x41\x02\"R\n\x18GetDeviceRegistryRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n cloudiot.googleapis.com/Registry\"U\n\x1b\x44\x65leteDeviceRegistryRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n cloudiot.googleapis.com/Registry\"\x96\x01\n\x1bUpdateDeviceRegistryRequest\x12\x41\n\x0f\x64\x65vice_registry\x18\x01 \x01(\x0b\x32#.google.cloud.iot.v1.DeviceRegistryB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"\x7f\n\x1bListDeviceRegistriesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"w\n\x1cListDeviceRegistriesResponse\x12>\n\x11\x64\x65vice_registries\x18\x01 \x03(\x0b\x32#.google.cloud.iot.v1.DeviceRegistry\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x81\x01\n\x13\x43reateDeviceRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n cloudiot.googleapis.com/Registry\x12\x30\n\x06\x64\x65vice\x18\x02 \x01(\x0b\x32\x1b.google.cloud.iot.v1.DeviceB\x03\xe0\x41\x02\"x\n\x10GetDeviceRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudiot.googleapis.com/Device\x12.\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"}\n\x13UpdateDeviceRequest\x12\x30\n\x06\x64\x65vice\x18\x02 \x01(\x0b\x32\x1b.google.cloud.iot.v1.DeviceB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"K\n\x13\x44\x65leteDeviceRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudiot.googleapis.com/Device\"\x98\x02\n\x12ListDevicesRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n cloudiot.googleapis.com/Registry\x12\x16\n\x0e\x64\x65vice_num_ids\x18\x02 \x03(\x04\x12\x12\n\ndevice_ids\x18\x03 \x03(\t\x12.\n\nfield_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x45\n\x14gateway_list_options\x18\x06 \x01(\x0b\x32\'.google.cloud.iot.v1.GatewayListOptions\x12\x11\n\tpage_size\x18\x64 \x01(\x05\x12\x12\n\npage_token\x18\x65 \x01(\t\"\x9d\x01\n\x12GatewayListOptions\x12\x38\n\x0cgateway_type\x18\x01 \x01(\x0e\x32 .google.cloud.iot.v1.GatewayTypeH\x00\x12!\n\x17\x61ssociations_gateway_id\x18\x02 \x01(\tH\x00\x12 \n\x16\x61ssociations_device_id\x18\x03 \x01(\tH\x00\x42\x08\n\x06\x66ilter\"\\\n\x13ListDevicesResponse\x12,\n\x07\x64\x65vices\x18\x01 \x03(\x0b\x32\x1b.google.cloud.iot.v1.Device\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8d\x01\n ModifyCloudToDeviceConfigRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudiot.googleapis.com/Device\x12\x19\n\x11version_to_update\x18\x02 \x01(\x03\x12\x18\n\x0b\x62inary_data\x18\x03 \x01(\x0c\x42\x03\xe0\x41\x02\"m\n\x1fListDeviceConfigVersionsRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudiot.googleapis.com/Device\x12\x14\n\x0cnum_versions\x18\x02 \x01(\x05\"]\n ListDeviceConfigVersionsResponse\x12\x39\n\x0e\x64\x65vice_configs\x18\x01 \x03(\x0b\x32!.google.cloud.iot.v1.DeviceConfig\"c\n\x17ListDeviceStatesRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudiot.googleapis.com/Device\x12\x12\n\nnum_states\x18\x02 \x01(\x05\"S\n\x18ListDeviceStatesResponse\x12\x37\n\rdevice_states\x18\x01 \x03(\x0b\x32 .google.cloud.iot.v1.DeviceState\"\x7f\n\x1aSendCommandToDeviceRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudiot.googleapis.com/Device\x12\x18\n\x0b\x62inary_data\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x02\x12\x11\n\tsubfolder\x18\x03 \x01(\t\"\x1d\n\x1bSendCommandToDeviceResponse\"\x87\x01\n\x1a\x42indDeviceToGatewayRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n cloudiot.googleapis.com/Registry\x12\x17\n\ngateway_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tdevice_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\x1d\n\x1b\x42indDeviceToGatewayResponse\"\x8b\x01\n\x1eUnbindDeviceFromGatewayRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n cloudiot.googleapis.com/Registry\x12\x17\n\ngateway_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tdevice_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"!\n\x1fUnbindDeviceFromGatewayResponse2\xa6&\n\rDeviceManager\x12\xcf\x01\n\x14\x43reateDeviceRegistry\x12\x30.google.cloud.iot.v1.CreateDeviceRegistryRequest\x1a#.google.cloud.iot.v1.DeviceRegistry\"`\x82\xd3\xe4\x93\x02\x41\"./v1/{parent=projects/*/locations/*}/registries:\x0f\x64\x65vice_registry\xda\x41\x16parent,device_registry\x12\xa6\x01\n\x11GetDeviceRegistry\x12-.google.cloud.iot.v1.GetDeviceRegistryRequest\x1a#.google.cloud.iot.v1.DeviceRegistry\"=\x82\xd3\xe4\x93\x02\x30\x12./v1/{name=projects/*/locations/*/registries/*}\xda\x41\x04name\x12\xe4\x01\n\x14UpdateDeviceRegistry\x12\x30.google.cloud.iot.v1.UpdateDeviceRegistryRequest\x1a#.google.cloud.iot.v1.DeviceRegistry\"u\x82\xd3\xe4\x93\x02Q2>/v1/{device_registry.name=projects/*/locations/*/registries/*}:\x0f\x64\x65vice_registry\xda\x41\x1b\x64\x65vice_registry,update_mask\x12\x9f\x01\n\x14\x44\x65leteDeviceRegistry\x12\x30.google.cloud.iot.v1.DeleteDeviceRegistryRequest\x1a\x16.google.protobuf.Empty\"=\x82\xd3\xe4\x93\x02\x30*./v1/{name=projects/*/locations/*/registries/*}\xda\x41\x04name\x12\xbc\x01\n\x14ListDeviceRegistries\x12\x30.google.cloud.iot.v1.ListDeviceRegistriesRequest\x1a\x31.google.cloud.iot.v1.ListDeviceRegistriesResponse\"?\x82\xd3\xe4\x93\x02\x30\x12./v1/{parent=projects/*/locations/*}/registries\xda\x41\x06parent\x12\xaf\x01\n\x0c\x43reateDevice\x12(.google.cloud.iot.v1.CreateDeviceRequest\x1a\x1b.google.cloud.iot.v1.Device\"X\x82\xd3\xe4\x93\x02\x42\"8/v1/{parent=projects/*/locations/*/registries/*}/devices:\x06\x64\x65vice\xda\x41\rparent,device\x12\xde\x01\n\tGetDevice\x12%.google.cloud.iot.v1.GetDeviceRequest\x1a\x1b.google.cloud.iot.v1.Device\"\x8c\x01\x82\xd3\xe4\x93\x02\x7f\x12\x38/v1/{name=projects/*/locations/*/registries/*/devices/*}ZC\x12\x41/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}\xda\x41\x04name\x12\x91\x02\n\x0cUpdateDevice\x12(.google.cloud.iot.v1.UpdateDeviceRequest\x1a\x1b.google.cloud.iot.v1.Device\"\xb9\x01\x82\xd3\xe4\x93\x02\x9d\x01\x32?/v1/{device.name=projects/*/locations/*/registries/*/devices/*}:\x06\x64\x65viceZR2H/v1/{device.name=projects/*/locations/*/registries/*/groups/*/devices/*}:\x06\x64\x65vice\xda\x41\x12\x64\x65vice,update_mask\x12\x99\x01\n\x0c\x44\x65leteDevice\x12(.google.cloud.iot.v1.DeleteDeviceRequest\x1a\x16.google.protobuf.Empty\"G\x82\xd3\xe4\x93\x02:*8/v1/{name=projects/*/locations/*/registries/*/devices/*}\xda\x41\x04name\x12\xf1\x01\n\x0bListDevices\x12\'.google.cloud.iot.v1.ListDevicesRequest\x1a(.google.cloud.iot.v1.ListDevicesResponse\"\x8e\x01\x82\xd3\xe4\x93\x02\x7f\x12\x38/v1/{parent=projects/*/locations/*/registries/*}/devicesZC\x12\x41/v1/{parent=projects/*/locations/*/registries/*/groups/*}/devices\xda\x41\x06parent\x12\xcb\x02\n\x19ModifyCloudToDeviceConfig\x12\x35.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest\x1a!.google.cloud.iot.v1.DeviceConfig\"\xd3\x01\x82\xd3\xe4\x93\x02\xb9\x01\"R/v1/{name=projects/*/locations/*/registries/*/devices/*}:modifyCloudToDeviceConfig:\x01*Z`\"[/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}:modifyCloudToDeviceConfig:\x01*\xda\x41\x10name,binary_data\x12\xb5\x02\n\x18ListDeviceConfigVersions\x12\x34.google.cloud.iot.v1.ListDeviceConfigVersionsRequest\x1a\x35.google.cloud.iot.v1.ListDeviceConfigVersionsResponse\"\xab\x01\x82\xd3\xe4\x93\x02\x9d\x01\x12G/v1/{name=projects/*/locations/*/registries/*/devices/*}/configVersionsZR\x12P/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}/configVersions\xda\x41\x04name\x12\x8d\x02\n\x10ListDeviceStates\x12,.google.cloud.iot.v1.ListDeviceStatesRequest\x1a-.google.cloud.iot.v1.ListDeviceStatesResponse\"\x9b\x01\x82\xd3\xe4\x93\x02\x8d\x01\x12?/v1/{name=projects/*/locations/*/registries/*/devices/*}/statesZJ\x12H/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}/states\xda\x41\x04name\x12\xf8\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\xac\x01\x82\xd3\xe4\x93\x02\x93\x01\"?/v1/{resource=projects/*/locations/*/registries/*}:setIamPolicy:\x01*ZM\"H/v1/{resource=projects/*/locations/*/registries/*/groups/*}:setIamPolicy:\x01*\xda\x41\x0fresource,policy\x12\xf1\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\xa5\x01\x82\xd3\xe4\x93\x02\x93\x01\"?/v1/{resource=projects/*/locations/*/registries/*}:getIamPolicy:\x01*ZM\"H/v1/{resource=projects/*/locations/*/registries/*/groups/*}:getIamPolicy:\x01*\xda\x41\x08resource\x12\xa9\x02\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"\xbd\x01\x82\xd3\xe4\x93\x02\x9f\x01\"E/v1/{resource=projects/*/locations/*/registries/*}:testIamPermissions:\x01*ZS\"N/v1/{resource=projects/*/locations/*/registries/*/groups/*}:testIamPermissions:\x01*\xda\x41\x14resource,permissions\x12\xdf\x02\n\x13SendCommandToDevice\x12/.google.cloud.iot.v1.SendCommandToDeviceRequest\x1a\x30.google.cloud.iot.v1.SendCommandToDeviceResponse\"\xe4\x01\x82\xd3\xe4\x93\x02\xad\x01\"L/v1/{name=projects/*/locations/*/registries/*/devices/*}:sendCommandToDevice:\x01*ZZ\"U/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}:sendCommandToDevice:\x01*\xda\x41\x10name,binary_data\xda\x41\x1aname,binary_data,subfolder\x12\xbd\x02\n\x13\x42indDeviceToGateway\x12/.google.cloud.iot.v1.BindDeviceToGatewayRequest\x1a\x30.google.cloud.iot.v1.BindDeviceToGatewayResponse\"\xc2\x01\x82\xd3\xe4\x93\x02\x9d\x01\"D/v1/{parent=projects/*/locations/*/registries/*}:bindDeviceToGateway:\x01*ZR\"M/v1/{parent=projects/*/locations/*/registries/*/groups/*}:bindDeviceToGateway:\x01*\xda\x41\x1bparent,gateway_id,device_id\x12\xd1\x02\n\x17UnbindDeviceFromGateway\x12\x33.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest\x1a\x34.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse\"\xca\x01\x82\xd3\xe4\x93\x02\xa5\x01\"H/v1/{parent=projects/*/locations/*/registries/*}:unbindDeviceFromGateway:\x01*ZV\"Q/v1/{parent=projects/*/locations/*/registries/*/groups/*}:unbindDeviceFromGateway:\x01*\xda\x41\x1bparent,gateway_id,device_id\x1at\xca\x41\x17\x63loudiot.googleapis.com\xd2\x41Whttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloudiotBj\n\x17\x63om.google.cloud.iot.v1B\x12\x44\x65viceManagerProtoP\x01Z6google.golang.org/genproto/googleapis/cloud/iot/v1;iot\xf8\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.iot.v1.device_manager_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.cloud.iot.v1B\022DeviceManagerProtoP\001Z6google.golang.org/genproto/googleapis/cloud/iot/v1;iot\370\001\001'
  _CREATEDEVICEREGISTRYREQUEST.fields_by_name['parent']._options = None
  _CREATEDEVICEREGISTRYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEDEVICEREGISTRYREQUEST.fields_by_name['device_registry']._options = None
  _CREATEDEVICEREGISTRYREQUEST.fields_by_name['device_registry']._serialized_options = b'\340A\002'
  _GETDEVICEREGISTRYREQUEST.fields_by_name['name']._options = None
  _GETDEVICEREGISTRYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n cloudiot.googleapis.com/Registry'
  _DELETEDEVICEREGISTRYREQUEST.fields_by_name['name']._options = None
  _DELETEDEVICEREGISTRYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n cloudiot.googleapis.com/Registry'
  _UPDATEDEVICEREGISTRYREQUEST.fields_by_name['device_registry']._options = None
  _UPDATEDEVICEREGISTRYREQUEST.fields_by_name['device_registry']._serialized_options = b'\340A\002'
  _UPDATEDEVICEREGISTRYREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEDEVICEREGISTRYREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _LISTDEVICEREGISTRIESREQUEST.fields_by_name['parent']._options = None
  _LISTDEVICEREGISTRIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEDEVICEREQUEST.fields_by_name['parent']._options = None
  _CREATEDEVICEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n cloudiot.googleapis.com/Registry'
  _CREATEDEVICEREQUEST.fields_by_name['device']._options = None
  _CREATEDEVICEREQUEST.fields_by_name['device']._serialized_options = b'\340A\002'
  _GETDEVICEREQUEST.fields_by_name['name']._options = None
  _GETDEVICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudiot.googleapis.com/Device'
  _UPDATEDEVICEREQUEST.fields_by_name['device']._options = None
  _UPDATEDEVICEREQUEST.fields_by_name['device']._serialized_options = b'\340A\002'
  _UPDATEDEVICEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEDEVICEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _DELETEDEVICEREQUEST.fields_by_name['name']._options = None
  _DELETEDEVICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudiot.googleapis.com/Device'
  _LISTDEVICESREQUEST.fields_by_name['parent']._options = None
  _LISTDEVICESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n cloudiot.googleapis.com/Registry'
  _MODIFYCLOUDTODEVICECONFIGREQUEST.fields_by_name['name']._options = None
  _MODIFYCLOUDTODEVICECONFIGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudiot.googleapis.com/Device'
  _MODIFYCLOUDTODEVICECONFIGREQUEST.fields_by_name['binary_data']._options = None
  _MODIFYCLOUDTODEVICECONFIGREQUEST.fields_by_name['binary_data']._serialized_options = b'\340A\002'
  _LISTDEVICECONFIGVERSIONSREQUEST.fields_by_name['name']._options = None
  _LISTDEVICECONFIGVERSIONSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudiot.googleapis.com/Device'
  _LISTDEVICESTATESREQUEST.fields_by_name['name']._options = None
  _LISTDEVICESTATESREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudiot.googleapis.com/Device'
  _SENDCOMMANDTODEVICEREQUEST.fields_by_name['name']._options = None
  _SENDCOMMANDTODEVICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudiot.googleapis.com/Device'
  _SENDCOMMANDTODEVICEREQUEST.fields_by_name['binary_data']._options = None
  _SENDCOMMANDTODEVICEREQUEST.fields_by_name['binary_data']._serialized_options = b'\340A\002'
  _BINDDEVICETOGATEWAYREQUEST.fields_by_name['parent']._options = None
  _BINDDEVICETOGATEWAYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n cloudiot.googleapis.com/Registry'
  _BINDDEVICETOGATEWAYREQUEST.fields_by_name['gateway_id']._options = None
  _BINDDEVICETOGATEWAYREQUEST.fields_by_name['gateway_id']._serialized_options = b'\340A\002'
  _BINDDEVICETOGATEWAYREQUEST.fields_by_name['device_id']._options = None
  _BINDDEVICETOGATEWAYREQUEST.fields_by_name['device_id']._serialized_options = b'\340A\002'
  _UNBINDDEVICEFROMGATEWAYREQUEST.fields_by_name['parent']._options = None
  _UNBINDDEVICEFROMGATEWAYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n cloudiot.googleapis.com/Registry'
  _UNBINDDEVICEFROMGATEWAYREQUEST.fields_by_name['gateway_id']._options = None
  _UNBINDDEVICEFROMGATEWAYREQUEST.fields_by_name['gateway_id']._serialized_options = b'\340A\002'
  _UNBINDDEVICEFROMGATEWAYREQUEST.fields_by_name['device_id']._options = None
  _UNBINDDEVICEFROMGATEWAYREQUEST.fields_by_name['device_id']._serialized_options = b'\340A\002'
  _DEVICEMANAGER._options = None
  _DEVICEMANAGER._serialized_options = b'\312A\027cloudiot.googleapis.com\322AWhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloudiot'
  _DEVICEMANAGER.methods_by_name['CreateDeviceRegistry']._options = None
  _DEVICEMANAGER.methods_by_name['CreateDeviceRegistry']._serialized_options = b'\202\323\344\223\002A\"./v1/{parent=projects/*/locations/*}/registries:\017device_registry\332A\026parent,device_registry'
  _DEVICEMANAGER.methods_by_name['GetDeviceRegistry']._options = None
  _DEVICEMANAGER.methods_by_name['GetDeviceRegistry']._serialized_options = b'\202\323\344\223\0020\022./v1/{name=projects/*/locations/*/registries/*}\332A\004name'
  _DEVICEMANAGER.methods_by_name['UpdateDeviceRegistry']._options = None
  _DEVICEMANAGER.methods_by_name['UpdateDeviceRegistry']._serialized_options = b'\202\323\344\223\002Q2>/v1/{device_registry.name=projects/*/locations/*/registries/*}:\017device_registry\332A\033device_registry,update_mask'
  _DEVICEMANAGER.methods_by_name['DeleteDeviceRegistry']._options = None
  _DEVICEMANAGER.methods_by_name['DeleteDeviceRegistry']._serialized_options = b'\202\323\344\223\0020*./v1/{name=projects/*/locations/*/registries/*}\332A\004name'
  _DEVICEMANAGER.methods_by_name['ListDeviceRegistries']._options = None
  _DEVICEMANAGER.methods_by_name['ListDeviceRegistries']._serialized_options = b'\202\323\344\223\0020\022./v1/{parent=projects/*/locations/*}/registries\332A\006parent'
  _DEVICEMANAGER.methods_by_name['CreateDevice']._options = None
  _DEVICEMANAGER.methods_by_name['CreateDevice']._serialized_options = b'\202\323\344\223\002B\"8/v1/{parent=projects/*/locations/*/registries/*}/devices:\006device\332A\rparent,device'
  _DEVICEMANAGER.methods_by_name['GetDevice']._options = None
  _DEVICEMANAGER.methods_by_name['GetDevice']._serialized_options = b'\202\323\344\223\002\177\0228/v1/{name=projects/*/locations/*/registries/*/devices/*}ZC\022A/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}\332A\004name'
  _DEVICEMANAGER.methods_by_name['UpdateDevice']._options = None
  _DEVICEMANAGER.methods_by_name['UpdateDevice']._serialized_options = b'\202\323\344\223\002\235\0012?/v1/{device.name=projects/*/locations/*/registries/*/devices/*}:\006deviceZR2H/v1/{device.name=projects/*/locations/*/registries/*/groups/*/devices/*}:\006device\332A\022device,update_mask'
  _DEVICEMANAGER.methods_by_name['DeleteDevice']._options = None
  _DEVICEMANAGER.methods_by_name['DeleteDevice']._serialized_options = b'\202\323\344\223\002:*8/v1/{name=projects/*/locations/*/registries/*/devices/*}\332A\004name'
  _DEVICEMANAGER.methods_by_name['ListDevices']._options = None
  _DEVICEMANAGER.methods_by_name['ListDevices']._serialized_options = b'\202\323\344\223\002\177\0228/v1/{parent=projects/*/locations/*/registries/*}/devicesZC\022A/v1/{parent=projects/*/locations/*/registries/*/groups/*}/devices\332A\006parent'
  _DEVICEMANAGER.methods_by_name['ModifyCloudToDeviceConfig']._options = None
  _DEVICEMANAGER.methods_by_name['ModifyCloudToDeviceConfig']._serialized_options = b'\202\323\344\223\002\271\001\"R/v1/{name=projects/*/locations/*/registries/*/devices/*}:modifyCloudToDeviceConfig:\001*Z`\"[/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}:modifyCloudToDeviceConfig:\001*\332A\020name,binary_data'
  _DEVICEMANAGER.methods_by_name['ListDeviceConfigVersions']._options = None
  _DEVICEMANAGER.methods_by_name['ListDeviceConfigVersions']._serialized_options = b'\202\323\344\223\002\235\001\022G/v1/{name=projects/*/locations/*/registries/*/devices/*}/configVersionsZR\022P/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}/configVersions\332A\004name'
  _DEVICEMANAGER.methods_by_name['ListDeviceStates']._options = None
  _DEVICEMANAGER.methods_by_name['ListDeviceStates']._serialized_options = b'\202\323\344\223\002\215\001\022?/v1/{name=projects/*/locations/*/registries/*/devices/*}/statesZJ\022H/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}/states\332A\004name'
  _DEVICEMANAGER.methods_by_name['SetIamPolicy']._options = None
  _DEVICEMANAGER.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002\223\001\"?/v1/{resource=projects/*/locations/*/registries/*}:setIamPolicy:\001*ZM\"H/v1/{resource=projects/*/locations/*/registries/*/groups/*}:setIamPolicy:\001*\332A\017resource,policy'
  _DEVICEMANAGER.methods_by_name['GetIamPolicy']._options = None
  _DEVICEMANAGER.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002\223\001\"?/v1/{resource=projects/*/locations/*/registries/*}:getIamPolicy:\001*ZM\"H/v1/{resource=projects/*/locations/*/registries/*/groups/*}:getIamPolicy:\001*\332A\010resource'
  _DEVICEMANAGER.methods_by_name['TestIamPermissions']._options = None
  _DEVICEMANAGER.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002\237\001\"E/v1/{resource=projects/*/locations/*/registries/*}:testIamPermissions:\001*ZS\"N/v1/{resource=projects/*/locations/*/registries/*/groups/*}:testIamPermissions:\001*\332A\024resource,permissions'
  _DEVICEMANAGER.methods_by_name['SendCommandToDevice']._options = None
  _DEVICEMANAGER.methods_by_name['SendCommandToDevice']._serialized_options = b'\202\323\344\223\002\255\001\"L/v1/{name=projects/*/locations/*/registries/*/devices/*}:sendCommandToDevice:\001*ZZ\"U/v1/{name=projects/*/locations/*/registries/*/groups/*/devices/*}:sendCommandToDevice:\001*\332A\020name,binary_data\332A\032name,binary_data,subfolder'
  _DEVICEMANAGER.methods_by_name['BindDeviceToGateway']._options = None
  _DEVICEMANAGER.methods_by_name['BindDeviceToGateway']._serialized_options = b'\202\323\344\223\002\235\001\"D/v1/{parent=projects/*/locations/*/registries/*}:bindDeviceToGateway:\001*ZR\"M/v1/{parent=projects/*/locations/*/registries/*/groups/*}:bindDeviceToGateway:\001*\332A\033parent,gateway_id,device_id'
  _DEVICEMANAGER.methods_by_name['UnbindDeviceFromGateway']._options = None
  _DEVICEMANAGER.methods_by_name['UnbindDeviceFromGateway']._serialized_options = b'\202\323\344\223\002\245\001\"H/v1/{parent=projects/*/locations/*/registries/*}:unbindDeviceFromGateway:\001*ZV\"Q/v1/{parent=projects/*/locations/*/registries/*/groups/*}:unbindDeviceFromGateway:\001*\332A\033parent,gateway_id,device_id'
  _CREATEDEVICEREGISTRYREQUEST._serialized_start=366
  _CREATEDEVICEREGISTRYREQUEST._serialized_end=521
  _GETDEVICEREGISTRYREQUEST._serialized_start=523
  _GETDEVICEREGISTRYREQUEST._serialized_end=605
  _DELETEDEVICEREGISTRYREQUEST._serialized_start=607
  _DELETEDEVICEREGISTRYREQUEST._serialized_end=692
  _UPDATEDEVICEREGISTRYREQUEST._serialized_start=695
  _UPDATEDEVICEREGISTRYREQUEST._serialized_end=845
  _LISTDEVICEREGISTRIESREQUEST._serialized_start=847
  _LISTDEVICEREGISTRIESREQUEST._serialized_end=974
  _LISTDEVICEREGISTRIESRESPONSE._serialized_start=976
  _LISTDEVICEREGISTRIESRESPONSE._serialized_end=1095
  _CREATEDEVICEREQUEST._serialized_start=1098
  _CREATEDEVICEREQUEST._serialized_end=1227
  _GETDEVICEREQUEST._serialized_start=1229
  _GETDEVICEREQUEST._serialized_end=1349
  _UPDATEDEVICEREQUEST._serialized_start=1351
  _UPDATEDEVICEREQUEST._serialized_end=1476
  _DELETEDEVICEREQUEST._serialized_start=1478
  _DELETEDEVICEREQUEST._serialized_end=1553
  _LISTDEVICESREQUEST._serialized_start=1556
  _LISTDEVICESREQUEST._serialized_end=1836
  _GATEWAYLISTOPTIONS._serialized_start=1839
  _GATEWAYLISTOPTIONS._serialized_end=1996
  _LISTDEVICESRESPONSE._serialized_start=1998
  _LISTDEVICESRESPONSE._serialized_end=2090
  _MODIFYCLOUDTODEVICECONFIGREQUEST._serialized_start=2093
  _MODIFYCLOUDTODEVICECONFIGREQUEST._serialized_end=2234
  _LISTDEVICECONFIGVERSIONSREQUEST._serialized_start=2236
  _LISTDEVICECONFIGVERSIONSREQUEST._serialized_end=2345
  _LISTDEVICECONFIGVERSIONSRESPONSE._serialized_start=2347
  _LISTDEVICECONFIGVERSIONSRESPONSE._serialized_end=2440
  _LISTDEVICESTATESREQUEST._serialized_start=2442
  _LISTDEVICESTATESREQUEST._serialized_end=2541
  _LISTDEVICESTATESRESPONSE._serialized_start=2543
  _LISTDEVICESTATESRESPONSE._serialized_end=2626
  _SENDCOMMANDTODEVICEREQUEST._serialized_start=2628
  _SENDCOMMANDTODEVICEREQUEST._serialized_end=2755
  _SENDCOMMANDTODEVICERESPONSE._serialized_start=2757
  _SENDCOMMANDTODEVICERESPONSE._serialized_end=2786
  _BINDDEVICETOGATEWAYREQUEST._serialized_start=2789
  _BINDDEVICETOGATEWAYREQUEST._serialized_end=2924
  _BINDDEVICETOGATEWAYRESPONSE._serialized_start=2926
  _BINDDEVICETOGATEWAYRESPONSE._serialized_end=2955
  _UNBINDDEVICEFROMGATEWAYREQUEST._serialized_start=2958
  _UNBINDDEVICEFROMGATEWAYREQUEST._serialized_end=3097
  _UNBINDDEVICEFROMGATEWAYRESPONSE._serialized_start=3099
  _UNBINDDEVICEFROMGATEWAYRESPONSE._serialized_end=3132
  _DEVICEMANAGER._serialized_start=3135
  _DEVICEMANAGER._serialized_end=8037
# @@protoc_insertion_point(module_scope)
