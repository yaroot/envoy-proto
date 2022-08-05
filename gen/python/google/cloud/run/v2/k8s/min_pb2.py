# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/run/v2/k8s.min.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!google/cloud/run/v2/k8s.min.proto\x12\x13google.cloud.run.v2\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xa0\x02\n\tContainer\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\x05image\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x0f\n\x07\x63ommand\x18\x03 \x03(\t\x12\x0c\n\x04\x61rgs\x18\x04 \x03(\t\x12(\n\x03\x65nv\x18\x05 \x03(\x0b\x32\x1b.google.cloud.run.v2.EnvVar\x12<\n\tresources\x18\x06 \x01(\x0b\x32).google.cloud.run.v2.ResourceRequirements\x12\x31\n\x05ports\x18\x07 \x03(\x0b\x32\".google.cloud.run.v2.ContainerPort\x12\x37\n\rvolume_mounts\x18\x08 \x03(\x0b\x32 .google.cloud.run.v2.VolumeMount\"\x9e\x01\n\x14ResourceRequirements\x12\x45\n\x06limits\x18\x01 \x03(\x0b\x32\x35.google.cloud.run.v2.ResourceRequirements.LimitsEntry\x12\x10\n\x08\x63pu_idle\x18\x02 \x01(\x08\x1a-\n\x0bLimitsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"q\n\x06\x45nvVar\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x0f\n\x05value\x18\x02 \x01(\tH\x00\x12\x39\n\x0cvalue_source\x18\x03 \x01(\x0b\x32!.google.cloud.run.v2.EnvVarSourceH\x00\x42\x08\n\x06values\"N\n\x0c\x45nvVarSource\x12>\n\x0esecret_key_ref\x18\x01 \x01(\x0b\x32&.google.cloud.run.v2.SecretKeySelector\"\x92\x01\n\x11SecretKeySelector\x12;\n\x06secret\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#secretmanager.googleapis.com/Secret\x12@\n\x07version\x18\x02 \x01(\tB/\xfa\x41,\n*secretmanager.googleapis.com/SecretVersion\"5\n\rContainerPort\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x16\n\x0e\x63ontainer_port\x18\x03 \x01(\x05\"9\n\x0bVolumeMount\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\nmount_path\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\xaa\x01\n\x06Volume\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x39\n\x06secret\x18\x02 \x01(\x0b\x32\'.google.cloud.run.v2.SecretVolumeSourceH\x00\x12\x43\n\x12\x63loud_sql_instance\x18\x03 \x01(\x0b\x32%.google.cloud.run.v2.CloudSqlInstanceH\x00\x42\r\n\x0bvolume_type\"r\n\x12SecretVolumeSource\x12\x13\n\x06secret\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x31\n\x05items\x18\x02 \x03(\x0b\x32\".google.cloud.run.v2.VersionToPath\x12\x14\n\x0c\x64\x65\x66\x61ult_mode\x18\x03 \x01(\x05\"A\n\rVersionToPath\x12\x11\n\x04path\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\x0c\n\x04mode\x18\x03 \x01(\x05\"%\n\x10\x43loudSqlInstance\x12\x11\n\tinstances\x18\x01 \x03(\tB\xf6\x03\n\x17\x63om.google.cloud.run.v2B\x0bK8sMinProtoP\x01Z6google.golang.org/genproto/googleapis/cloud/run/v2;run\xea\x41x\n!cloudkms.googleapis.com/CryptoKey\x12Sprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}\xea\x41J\n#secretmanager.googleapis.com/Secret\x12#projects/{project}/secrets/{secret}\xea\x41\x64\n*secretmanager.googleapis.com/SecretVersion\x12\x36projects/{project}/secrets/{secret}/versions/{version}\xea\x41\x64\n\"vpcaccess.googleapis.com/Connector\x12>projects/{project}/locations/{location}/connectors/{connector}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.run.v2.k8s.min_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.cloud.run.v2B\013K8sMinProtoP\001Z6google.golang.org/genproto/googleapis/cloud/run/v2;run\352Ax\n!cloudkms.googleapis.com/CryptoKey\022Sprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}\352AJ\n#secretmanager.googleapis.com/Secret\022#projects/{project}/secrets/{secret}\352Ad\n*secretmanager.googleapis.com/SecretVersion\0226projects/{project}/secrets/{secret}/versions/{version}\352Ad\n\"vpcaccess.googleapis.com/Connector\022>projects/{project}/locations/{location}/connectors/{connector}'
  _CONTAINER.fields_by_name['image']._options = None
  _CONTAINER.fields_by_name['image']._serialized_options = b'\340A\002'
  _RESOURCEREQUIREMENTS_LIMITSENTRY._options = None
  _RESOURCEREQUIREMENTS_LIMITSENTRY._serialized_options = b'8\001'
  _ENVVAR.fields_by_name['name']._options = None
  _ENVVAR.fields_by_name['name']._serialized_options = b'\340A\002'
  _SECRETKEYSELECTOR.fields_by_name['secret']._options = None
  _SECRETKEYSELECTOR.fields_by_name['secret']._serialized_options = b'\340A\002\372A%\n#secretmanager.googleapis.com/Secret'
  _SECRETKEYSELECTOR.fields_by_name['version']._options = None
  _SECRETKEYSELECTOR.fields_by_name['version']._serialized_options = b'\372A,\n*secretmanager.googleapis.com/SecretVersion'
  _VOLUMEMOUNT.fields_by_name['name']._options = None
  _VOLUMEMOUNT.fields_by_name['name']._serialized_options = b'\340A\002'
  _VOLUMEMOUNT.fields_by_name['mount_path']._options = None
  _VOLUMEMOUNT.fields_by_name['mount_path']._serialized_options = b'\340A\002'
  _VOLUME.fields_by_name['name']._options = None
  _VOLUME.fields_by_name['name']._serialized_options = b'\340A\002'
  _SECRETVOLUMESOURCE.fields_by_name['secret']._options = None
  _SECRETVOLUMESOURCE.fields_by_name['secret']._serialized_options = b'\340A\002'
  _VERSIONTOPATH.fields_by_name['path']._options = None
  _VERSIONTOPATH.fields_by_name['path']._serialized_options = b'\340A\002'
  _CONTAINER._serialized_start=119
  _CONTAINER._serialized_end=407
  _RESOURCEREQUIREMENTS._serialized_start=410
  _RESOURCEREQUIREMENTS._serialized_end=568
  _RESOURCEREQUIREMENTS_LIMITSENTRY._serialized_start=523
  _RESOURCEREQUIREMENTS_LIMITSENTRY._serialized_end=568
  _ENVVAR._serialized_start=570
  _ENVVAR._serialized_end=683
  _ENVVARSOURCE._serialized_start=685
  _ENVVARSOURCE._serialized_end=763
  _SECRETKEYSELECTOR._serialized_start=766
  _SECRETKEYSELECTOR._serialized_end=912
  _CONTAINERPORT._serialized_start=914
  _CONTAINERPORT._serialized_end=967
  _VOLUMEMOUNT._serialized_start=969
  _VOLUMEMOUNT._serialized_end=1026
  _VOLUME._serialized_start=1029
  _VOLUME._serialized_end=1199
  _SECRETVOLUMESOURCE._serialized_start=1201
  _SECRETVOLUMESOURCE._serialized_end=1315
  _VERSIONTOPATH._serialized_start=1317
  _VERSIONTOPATH._serialized_end=1382
  _CLOUDSQLINSTANCE._serialized_start=1384
  _CLOUDSQLINSTANCE._serialized_end=1421
# @@protoc_insertion_point(module_scope)
