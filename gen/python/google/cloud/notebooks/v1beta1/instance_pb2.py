# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/notebooks/v1beta1/instance.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.notebooks.v1beta1 import environment_pb2 as google_dot_cloud_dot_notebooks_dot_v1beta1_dot_environment__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/notebooks/v1beta1/instance.proto',
  package='google.cloud.notebooks.v1beta1',
  syntax='proto3',
  serialized_options=b'\n\"com.google.cloud.notebooks.v1beta1B\rInstanceProtoP\001ZGgoogle.golang.org/genproto/googleapis/cloud/notebooks/v1beta1;notebooks\252\002\036Google.Cloud.Notebooks.V1Beta1\312\002\036Google\\Cloud\\Notebooks\\V1Beta1\352\002!Google::Cloud::Notebooks::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-google/cloud/notebooks/v1beta1/instance.proto\x12\x1egoogle.cloud.notebooks.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x30google/cloud/notebooks/v1beta1/environment.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xf8\x0f\n\x08Instance\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12;\n\x08vm_image\x18\x02 \x01(\x0b\x32\'.google.cloud.notebooks.v1beta1.VmImageH\x00\x12I\n\x0f\x63ontainer_image\x18\x03 \x01(\x0b\x32..google.cloud.notebooks.v1beta1.ContainerImageH\x00\x12\x1b\n\x13post_startup_script\x18\x04 \x01(\t\x12\x16\n\tproxy_uri\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x1c\n\x0finstance_owners\x18\x06 \x03(\tB\x03\xe0\x41\x04\x12\x17\n\x0fservice_account\x18\x07 \x01(\t\x12\x19\n\x0cmachine_type\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12V\n\x12\x61\x63\x63\x65lerator_config\x18\t \x01(\x0b\x32:.google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig\x12\x42\n\x05state\x18\n \x01(\x0e\x32..google.cloud.notebooks.v1beta1.Instance.StateB\x03\xe0\x41\x03\x12\x1a\n\x12install_gpu_driver\x18\x0b \x01(\x08\x12\x1e\n\x16\x63ustom_gpu_driver_path\x18\x0c \x01(\t\x12N\n\x0e\x62oot_disk_type\x18\r \x01(\x0e\x32\x31.google.cloud.notebooks.v1beta1.Instance.DiskTypeB\x03\xe0\x41\x04\x12\x1e\n\x11\x62oot_disk_size_gb\x18\x0e \x01(\x03\x42\x03\xe0\x41\x04\x12N\n\x0e\x64\x61ta_disk_type\x18\x19 \x01(\x0e\x32\x31.google.cloud.notebooks.v1beta1.Instance.DiskTypeB\x03\xe0\x41\x04\x12\x1e\n\x11\x64\x61ta_disk_size_gb\x18\x1a \x01(\x03\x42\x03\xe0\x41\x04\x12 \n\x13no_remove_data_disk\x18\x1b \x01(\x08\x42\x03\xe0\x41\x04\x12U\n\x0f\x64isk_encryption\x18\x0f \x01(\x0e\x32\x37.google.cloud.notebooks.v1beta1.Instance.DiskEncryptionB\x03\xe0\x41\x04\x12\x14\n\x07kms_key\x18\x10 \x01(\tB\x03\xe0\x41\x04\x12\x14\n\x0cno_public_ip\x18\x11 \x01(\x08\x12\x17\n\x0fno_proxy_access\x18\x12 \x01(\x08\x12\x0f\n\x07network\x18\x13 \x01(\t\x12\x0e\n\x06subnet\x18\x14 \x01(\t\x12\x44\n\x06labels\x18\x15 \x03(\x0b\x32\x34.google.cloud.notebooks.v1beta1.Instance.LabelsEntry\x12H\n\x08metadata\x18\x16 \x03(\x0b\x32\x36.google.cloud.notebooks.v1beta1.Instance.MetadataEntry\x12\x34\n\x0b\x63reate_time\x18\x17 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x18 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x1ao\n\x11\x41\x63\x63\x65leratorConfig\x12\x46\n\x04type\x18\x01 \x01(\x0e\x32\x38.google.cloud.notebooks.v1beta1.Instance.AcceleratorType\x12\x12\n\ncore_count\x18\x02 \x01(\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x86\x02\n\x0f\x41\x63\x63\x65leratorType\x12 \n\x1c\x41\x43\x43\x45LERATOR_TYPE_UNSPECIFIED\x10\x00\x12\x14\n\x10NVIDIA_TESLA_K80\x10\x01\x12\x15\n\x11NVIDIA_TESLA_P100\x10\x02\x12\x15\n\x11NVIDIA_TESLA_V100\x10\x03\x12\x13\n\x0fNVIDIA_TESLA_P4\x10\x04\x12\x13\n\x0fNVIDIA_TESLA_T4\x10\x05\x12\x17\n\x13NVIDIA_TESLA_T4_VWS\x10\x08\x12\x19\n\x15NVIDIA_TESLA_P100_VWS\x10\t\x12\x17\n\x13NVIDIA_TESLA_P4_VWS\x10\n\x12\n\n\x06TPU_V2\x10\x06\x12\n\n\x06TPU_V3\x10\x07\"r\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08STARTING\x10\x01\x12\x10\n\x0cPROVISIONING\x10\x02\x12\n\n\x06\x41\x43TIVE\x10\x03\x12\x0c\n\x08STOPPING\x10\x04\x12\x0b\n\x07STOPPED\x10\x05\x12\x0b\n\x07\x44\x45LETED\x10\x06\"B\n\x08\x44iskType\x12\x19\n\x15\x44ISK_TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bPD_STANDARD\x10\x01\x12\n\n\x06PD_SSD\x10\x02\"E\n\x0e\x44iskEncryption\x12\x1f\n\x1b\x44ISK_ENCRYPTION_UNSPECIFIED\x10\x00\x12\x08\n\x04GMEK\x10\x01\x12\x08\n\x04\x43MEK\x10\x02:O\xea\x41L\n!notebooks.googleapis.com/Instance\x12\'projects/{project}/instances/{instance}B\r\n\x0b\x65nvironmentB\xe4\x01\n\"com.google.cloud.notebooks.v1beta1B\rInstanceProtoP\x01ZGgoogle.golang.org/genproto/googleapis/cloud/notebooks/v1beta1;notebooks\xaa\x02\x1eGoogle.Cloud.Notebooks.V1Beta1\xca\x02\x1eGoogle\\Cloud\\Notebooks\\V1Beta1\xea\x02!Google::Cloud::Notebooks::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_notebooks_dot_v1beta1_dot_environment__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_INSTANCE_ACCELERATORTYPE = _descriptor.EnumDescriptor(
  name='AcceleratorType',
  full_name='google.cloud.notebooks.v1beta1.Instance.AcceleratorType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ACCELERATOR_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_K80', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_P100', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_V100', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_P4', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_T4', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_T4_VWS', index=6, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_P100_VWS', index=7, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NVIDIA_TESLA_P4_VWS', index=8, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TPU_V2', index=9, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TPU_V3', index=10, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1682,
  serialized_end=1944,
)
_sym_db.RegisterEnumDescriptor(_INSTANCE_ACCELERATORTYPE)

_INSTANCE_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.notebooks.v1beta1.Instance.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STARTING', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROVISIONING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACTIVE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STOPPING', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STOPPED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DELETED', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1946,
  serialized_end=2060,
)
_sym_db.RegisterEnumDescriptor(_INSTANCE_STATE)

_INSTANCE_DISKTYPE = _descriptor.EnumDescriptor(
  name='DiskType',
  full_name='google.cloud.notebooks.v1beta1.Instance.DiskType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DISK_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PD_STANDARD', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PD_SSD', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2062,
  serialized_end=2128,
)
_sym_db.RegisterEnumDescriptor(_INSTANCE_DISKTYPE)

_INSTANCE_DISKENCRYPTION = _descriptor.EnumDescriptor(
  name='DiskEncryption',
  full_name='google.cloud.notebooks.v1beta1.Instance.DiskEncryption',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DISK_ENCRYPTION_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GMEK', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CMEK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2130,
  serialized_end=2199,
)
_sym_db.RegisterEnumDescriptor(_INSTANCE_DISKENCRYPTION)


_INSTANCE_ACCELERATORCONFIG = _descriptor.Descriptor(
  name='AcceleratorConfig',
  full_name='google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='core_count', full_name='google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig.core_count', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=1472,
  serialized_end=1583,
)

_INSTANCE_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.notebooks.v1beta1.Instance.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.notebooks.v1beta1.Instance.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.notebooks.v1beta1.Instance.LabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1585,
  serialized_end=1630,
)

_INSTANCE_METADATAENTRY = _descriptor.Descriptor(
  name='MetadataEntry',
  full_name='google.cloud.notebooks.v1beta1.Instance.MetadataEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.notebooks.v1beta1.Instance.MetadataEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.notebooks.v1beta1.Instance.MetadataEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1632,
  serialized_end=1679,
)

_INSTANCE = _descriptor.Descriptor(
  name='Instance',
  full_name='google.cloud.notebooks.v1beta1.Instance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.notebooks.v1beta1.Instance.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_image', full_name='google.cloud.notebooks.v1beta1.Instance.vm_image', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='container_image', full_name='google.cloud.notebooks.v1beta1.Instance.container_image', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='post_startup_script', full_name='google.cloud.notebooks.v1beta1.Instance.post_startup_script', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='proxy_uri', full_name='google.cloud.notebooks.v1beta1.Instance.proxy_uri', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_owners', full_name='google.cloud.notebooks.v1beta1.Instance.instance_owners', index=5,
      number=6, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_account', full_name='google.cloud.notebooks.v1beta1.Instance.service_account', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='machine_type', full_name='google.cloud.notebooks.v1beta1.Instance.machine_type', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='accelerator_config', full_name='google.cloud.notebooks.v1beta1.Instance.accelerator_config', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.notebooks.v1beta1.Instance.state', index=9,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='install_gpu_driver', full_name='google.cloud.notebooks.v1beta1.Instance.install_gpu_driver', index=10,
      number=11, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='custom_gpu_driver_path', full_name='google.cloud.notebooks.v1beta1.Instance.custom_gpu_driver_path', index=11,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='boot_disk_type', full_name='google.cloud.notebooks.v1beta1.Instance.boot_disk_type', index=12,
      number=13, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='boot_disk_size_gb', full_name='google.cloud.notebooks.v1beta1.Instance.boot_disk_size_gb', index=13,
      number=14, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data_disk_type', full_name='google.cloud.notebooks.v1beta1.Instance.data_disk_type', index=14,
      number=25, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data_disk_size_gb', full_name='google.cloud.notebooks.v1beta1.Instance.data_disk_size_gb', index=15,
      number=26, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='no_remove_data_disk', full_name='google.cloud.notebooks.v1beta1.Instance.no_remove_data_disk', index=16,
      number=27, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='disk_encryption', full_name='google.cloud.notebooks.v1beta1.Instance.disk_encryption', index=17,
      number=15, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='kms_key', full_name='google.cloud.notebooks.v1beta1.Instance.kms_key', index=18,
      number=16, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='no_public_ip', full_name='google.cloud.notebooks.v1beta1.Instance.no_public_ip', index=19,
      number=17, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='no_proxy_access', full_name='google.cloud.notebooks.v1beta1.Instance.no_proxy_access', index=20,
      number=18, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='network', full_name='google.cloud.notebooks.v1beta1.Instance.network', index=21,
      number=19, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='subnet', full_name='google.cloud.notebooks.v1beta1.Instance.subnet', index=22,
      number=20, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.notebooks.v1beta1.Instance.labels', index=23,
      number=21, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='google.cloud.notebooks.v1beta1.Instance.metadata', index=24,
      number=22, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.notebooks.v1beta1.Instance.create_time', index=25,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.notebooks.v1beta1.Instance.update_time', index=26,
      number=24, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_INSTANCE_ACCELERATORCONFIG, _INSTANCE_LABELSENTRY, _INSTANCE_METADATAENTRY, ],
  enum_types=[
    _INSTANCE_ACCELERATORTYPE,
    _INSTANCE_STATE,
    _INSTANCE_DISKTYPE,
    _INSTANCE_DISKENCRYPTION,
  ],
  serialized_options=b'\352AL\n!notebooks.googleapis.com/Instance\022\'projects/{project}/instances/{instance}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='environment', full_name='google.cloud.notebooks.v1beta1.Instance.environment',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=255,
  serialized_end=2295,
)

_INSTANCE_ACCELERATORCONFIG.fields_by_name['type'].enum_type = _INSTANCE_ACCELERATORTYPE
_INSTANCE_ACCELERATORCONFIG.containing_type = _INSTANCE
_INSTANCE_LABELSENTRY.containing_type = _INSTANCE
_INSTANCE_METADATAENTRY.containing_type = _INSTANCE
_INSTANCE.fields_by_name['vm_image'].message_type = google_dot_cloud_dot_notebooks_dot_v1beta1_dot_environment__pb2._VMIMAGE
_INSTANCE.fields_by_name['container_image'].message_type = google_dot_cloud_dot_notebooks_dot_v1beta1_dot_environment__pb2._CONTAINERIMAGE
_INSTANCE.fields_by_name['accelerator_config'].message_type = _INSTANCE_ACCELERATORCONFIG
_INSTANCE.fields_by_name['state'].enum_type = _INSTANCE_STATE
_INSTANCE.fields_by_name['boot_disk_type'].enum_type = _INSTANCE_DISKTYPE
_INSTANCE.fields_by_name['data_disk_type'].enum_type = _INSTANCE_DISKTYPE
_INSTANCE.fields_by_name['disk_encryption'].enum_type = _INSTANCE_DISKENCRYPTION
_INSTANCE.fields_by_name['labels'].message_type = _INSTANCE_LABELSENTRY
_INSTANCE.fields_by_name['metadata'].message_type = _INSTANCE_METADATAENTRY
_INSTANCE.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_INSTANCE.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_INSTANCE_ACCELERATORTYPE.containing_type = _INSTANCE
_INSTANCE_STATE.containing_type = _INSTANCE
_INSTANCE_DISKTYPE.containing_type = _INSTANCE
_INSTANCE_DISKENCRYPTION.containing_type = _INSTANCE
_INSTANCE.oneofs_by_name['environment'].fields.append(
  _INSTANCE.fields_by_name['vm_image'])
_INSTANCE.fields_by_name['vm_image'].containing_oneof = _INSTANCE.oneofs_by_name['environment']
_INSTANCE.oneofs_by_name['environment'].fields.append(
  _INSTANCE.fields_by_name['container_image'])
_INSTANCE.fields_by_name['container_image'].containing_oneof = _INSTANCE.oneofs_by_name['environment']
DESCRIPTOR.message_types_by_name['Instance'] = _INSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Instance = _reflection.GeneratedProtocolMessageType('Instance', (_message.Message,), {

  'AcceleratorConfig' : _reflection.GeneratedProtocolMessageType('AcceleratorConfig', (_message.Message,), {
    'DESCRIPTOR' : _INSTANCE_ACCELERATORCONFIG,
    '__module__' : 'google.cloud.notebooks.v1beta1.instance_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.Instance.AcceleratorConfig)
    })
  ,

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _INSTANCE_LABELSENTRY,
    '__module__' : 'google.cloud.notebooks.v1beta1.instance_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.Instance.LabelsEntry)
    })
  ,

  'MetadataEntry' : _reflection.GeneratedProtocolMessageType('MetadataEntry', (_message.Message,), {
    'DESCRIPTOR' : _INSTANCE_METADATAENTRY,
    '__module__' : 'google.cloud.notebooks.v1beta1.instance_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.Instance.MetadataEntry)
    })
  ,
  'DESCRIPTOR' : _INSTANCE,
  '__module__' : 'google.cloud.notebooks.v1beta1.instance_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.Instance)
  })
_sym_db.RegisterMessage(Instance)
_sym_db.RegisterMessage(Instance.AcceleratorConfig)
_sym_db.RegisterMessage(Instance.LabelsEntry)
_sym_db.RegisterMessage(Instance.MetadataEntry)


DESCRIPTOR._options = None
_INSTANCE_LABELSENTRY._options = None
_INSTANCE_METADATAENTRY._options = None
_INSTANCE.fields_by_name['name']._options = None
_INSTANCE.fields_by_name['proxy_uri']._options = None
_INSTANCE.fields_by_name['instance_owners']._options = None
_INSTANCE.fields_by_name['machine_type']._options = None
_INSTANCE.fields_by_name['state']._options = None
_INSTANCE.fields_by_name['boot_disk_type']._options = None
_INSTANCE.fields_by_name['boot_disk_size_gb']._options = None
_INSTANCE.fields_by_name['data_disk_type']._options = None
_INSTANCE.fields_by_name['data_disk_size_gb']._options = None
_INSTANCE.fields_by_name['no_remove_data_disk']._options = None
_INSTANCE.fields_by_name['disk_encryption']._options = None
_INSTANCE.fields_by_name['kms_key']._options = None
_INSTANCE.fields_by_name['create_time']._options = None
_INSTANCE.fields_by_name['update_time']._options = None
_INSTANCE._options = None
# @@protoc_insertion_point(module_scope)
