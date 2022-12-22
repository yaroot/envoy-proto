# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/notebooks/v1/runtime.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.notebooks.v1 import environment_pb2 as google_dot_cloud_dot_notebooks_dot_v1_dot_environment__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/cloud/notebooks/v1/runtime.proto\x12\x19google.cloud.notebooks.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a+google/cloud/notebooks/v1/environment.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xad\x07\n\x07Runtime\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x44\n\x0fvirtual_machine\x18\x02 \x01(\x0b\x32).google.cloud.notebooks.v1.VirtualMachineH\x00\x12<\n\x05state\x18\x03 \x01(\x0e\x32(.google.cloud.notebooks.v1.Runtime.StateB\x03\xe0\x41\x03\x12I\n\x0chealth_state\x18\x04 \x01(\x0e\x32..google.cloud.notebooks.v1.Runtime.HealthStateB\x03\xe0\x41\x03\x12\x45\n\raccess_config\x18\x05 \x01(\x0b\x32..google.cloud.notebooks.v1.RuntimeAccessConfig\x12I\n\x0fsoftware_config\x18\x06 \x01(\x0b\x32\x30.google.cloud.notebooks.v1.RuntimeSoftwareConfig\x12?\n\x07metrics\x18\x07 \x01(\x0b\x32).google.cloud.notebooks.v1.RuntimeMetricsB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x14 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x15 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"\x94\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08STARTING\x10\x01\x12\x10\n\x0cPROVISIONING\x10\x02\x12\n\n\x06\x41\x43TIVE\x10\x03\x12\x0c\n\x08STOPPING\x10\x04\x12\x0b\n\x07STOPPED\x10\x05\x12\x0c\n\x08\x44\x45LETING\x10\x06\x12\r\n\tUPGRADING\x10\x07\x12\x10\n\x0cINITIALIZING\x10\x08\"w\n\x0bHealthState\x12\x1c\n\x18HEALTH_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07HEALTHY\x10\x01\x12\r\n\tUNHEALTHY\x10\x02\x12\x17\n\x13\x41GENT_NOT_INSTALLED\x10\x03\x12\x15\n\x11\x41GENT_NOT_RUNNING\x10\x04:a\xea\x41^\n notebooks.googleapis.com/Runtime\x12:projects/{project}/locations/{location}/runtimes/{runtime}B\x0e\n\x0cruntime_type\"\xa5\x03\n\x18RuntimeAcceleratorConfig\x12Q\n\x04type\x18\x01 \x01(\x0e\x32\x43.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType\x12\x12\n\ncore_count\x18\x02 \x01(\x03\"\xa1\x02\n\x0f\x41\x63\x63\x65leratorType\x12 \n\x1c\x41\x43\x43\x45LERATOR_TYPE_UNSPECIFIED\x10\x00\x12\x18\n\x10NVIDIA_TESLA_K80\x10\x01\x1a\x02\x08\x01\x12\x15\n\x11NVIDIA_TESLA_P100\x10\x02\x12\x15\n\x11NVIDIA_TESLA_V100\x10\x03\x12\x13\n\x0fNVIDIA_TESLA_P4\x10\x04\x12\x13\n\x0fNVIDIA_TESLA_T4\x10\x05\x12\x15\n\x11NVIDIA_TESLA_A100\x10\x06\x12\n\n\x06TPU_V2\x10\x07\x12\n\n\x06TPU_V3\x10\x08\x12\x17\n\x13NVIDIA_TESLA_T4_VWS\x10\t\x12\x19\n\x15NVIDIA_TESLA_P100_VWS\x10\n\x12\x17\n\x13NVIDIA_TESLA_P4_VWS\x10\x0b\"#\n\x10\x45ncryptionConfig\x12\x0f\n\x07kms_key\x18\x01 \x01(\t\"\xa8\x03\n\tLocalDisk\x12\x18\n\x0b\x61uto_delete\x18\x01 \x01(\x08\x42\x03\xe0\x41\x03\x12\x11\n\x04\x62oot\x18\x02 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x64\x65vice_name\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12Z\n\x11guest_os_features\x18\x04 \x03(\x0b\x32:.google.cloud.notebooks.v1.LocalDisk.RuntimeGuestOsFeatureB\x03\xe0\x41\x03\x12\x12\n\x05index\x18\x05 \x01(\x05\x42\x03\xe0\x41\x03\x12T\n\x11initialize_params\x18\x06 \x01(\x0b\x32\x34.google.cloud.notebooks.v1.LocalDiskInitializeParamsB\x03\xe0\x41\x04\x12\x11\n\tinterface\x18\x07 \x01(\t\x12\x11\n\x04kind\x18\x08 \x01(\tB\x03\xe0\x41\x03\x12\x15\n\x08licenses\x18\t \x03(\tB\x03\xe0\x41\x03\x12\x0c\n\x04mode\x18\n \x01(\t\x12\x0e\n\x06source\x18\x0b \x01(\t\x12\x0c\n\x04type\x18\x0c \x01(\t\x1a%\n\x15RuntimeGuestOsFeature\x12\x0c\n\x04type\x18\x01 \x01(\t\"\xaa\x03\n\x19LocalDiskInitializeParams\x12\x18\n\x0b\x64\x65scription\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x16\n\tdisk_name\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0c\x64isk_size_gb\x18\x03 \x01(\x03\x42\x03\xe0\x41\x01\x12U\n\tdisk_type\x18\x04 \x01(\x0e\x32=.google.cloud.notebooks.v1.LocalDiskInitializeParams.DiskTypeB\x03\xe0\x41\x04\x12U\n\x06labels\x18\x05 \x03(\x0b\x32@.google.cloud.notebooks.v1.LocalDiskInitializeParams.LabelsEntryB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"c\n\x08\x44iskType\x12\x19\n\x15\x44ISK_TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bPD_STANDARD\x10\x01\x12\n\n\x06PD_SSD\x10\x02\x12\x0f\n\x0bPD_BALANCED\x10\x03\x12\x0e\n\nPD_EXTREME\x10\x04\"\xfb\x01\n\x13RuntimeAccessConfig\x12U\n\x0b\x61\x63\x63\x65ss_type\x18\x01 \x01(\x0e\x32@.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType\x12\x15\n\rruntime_owner\x18\x02 \x01(\t\x12\x16\n\tproxy_uri\x18\x03 \x01(\tB\x03\xe0\x41\x03\"^\n\x11RuntimeAccessType\x12#\n\x1fRUNTIME_ACCESS_TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bSINGLE_USER\x10\x01\x12\x13\n\x0fSERVICE_ACCOUNT\x10\x02\"\xe4\x05\n\x15RuntimeSoftwareConfig\x12!\n\x19notebook_upgrade_schedule\x18\x01 \x01(\t\x12%\n\x18\x65nable_health_monitoring\x18\x02 \x01(\x08H\x00\x88\x01\x01\x12\x1a\n\ridle_shutdown\x18\x03 \x01(\x08H\x01\x88\x01\x01\x12\x1d\n\x15idle_shutdown_timeout\x18\x04 \x01(\x05\x12\x1a\n\x12install_gpu_driver\x18\x05 \x01(\x08\x12\x1e\n\x16\x63ustom_gpu_driver_path\x18\x06 \x01(\t\x12\x1b\n\x13post_startup_script\x18\x07 \x01(\t\x12?\n\x07kernels\x18\x08 \x03(\x0b\x32).google.cloud.notebooks.v1.ContainerImageB\x03\xe0\x41\x01\x12\x1d\n\x0bupgradeable\x18\t \x01(\x08\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12p\n\x1cpost_startup_script_behavior\x18\n \x01(\x0e\x32J.google.cloud.notebooks.v1.RuntimeSoftwareConfig.PostStartupScriptBehavior\x12\x1d\n\x10\x64isable_terminal\x18\x0b \x01(\x08H\x03\x88\x01\x01\x12\x19\n\x07version\x18\x0c \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\"\x80\x01\n\x19PostStartupScriptBehavior\x12,\n(POST_STARTUP_SCRIPT_BEHAVIOR_UNSPECIFIED\x10\x00\x12\x13\n\x0fRUN_EVERY_START\x10\x01\x12 \n\x1c\x44OWNLOAD_AND_RUN_EVERY_START\x10\x02\x42\x1b\n\x19_enable_health_monitoringB\x10\n\x0e_idle_shutdownB\x0e\n\x0c_upgradeableB\x13\n\x11_disable_terminalB\n\n\x08_version\"\xa1\x01\n\x0eRuntimeMetrics\x12Y\n\x0esystem_metrics\x18\x01 \x03(\x0b\x32<.google.cloud.notebooks.v1.RuntimeMetrics.SystemMetricsEntryB\x03\xe0\x41\x03\x1a\x34\n\x12SystemMetricsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"u\n\x1dRuntimeShieldedInstanceConfig\x12\x1a\n\x12\x65nable_secure_boot\x18\x01 \x01(\x08\x12\x13\n\x0b\x65nable_vtpm\x18\x02 \x01(\x08\x12#\n\x1b\x65nable_integrity_monitoring\x18\x03 \x01(\x08\"\x97\x01\n\x0eVirtualMachine\x12\x1a\n\rinstance_name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x18\n\x0binstance_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12O\n\x16virtual_machine_config\x18\x03 \x01(\x0b\x32/.google.cloud.notebooks.v1.VirtualMachineConfig\"\xe3\t\n\x14VirtualMachineConfig\x12\x11\n\x04zone\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0cmachine_type\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12H\n\x10\x63ontainer_images\x18\x03 \x03(\x0b\x32).google.cloud.notebooks.v1.ContainerImageB\x03\xe0\x41\x01\x12<\n\tdata_disk\x18\x04 \x01(\x0b\x32$.google.cloud.notebooks.v1.LocalDiskB\x03\xe0\x41\x02\x12K\n\x11\x65ncryption_config\x18\x05 \x01(\x0b\x32+.google.cloud.notebooks.v1.EncryptionConfigB\x03\xe0\x41\x01\x12_\n\x18shielded_instance_config\x18\x06 \x01(\x0b\x32\x38.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfigB\x03\xe0\x41\x01\x12T\n\x12\x61\x63\x63\x65lerator_config\x18\x07 \x01(\x0b\x32\x33.google.cloud.notebooks.v1.RuntimeAcceleratorConfigB\x03\xe0\x41\x01\x12\x14\n\x07network\x18\x08 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06subnet\x18\t \x01(\tB\x03\xe0\x41\x01\x12\x1d\n\x10internal_ip_only\x18\n \x01(\x08\x42\x03\xe0\x41\x01\x12\x11\n\x04tags\x18\r \x03(\tB\x03\xe0\x41\x01\x12\x63\n\x10guest_attributes\x18\x0e \x03(\x0b\x32\x44.google.cloud.notebooks.v1.VirtualMachineConfig.GuestAttributesEntryB\x03\xe0\x41\x03\x12T\n\x08metadata\x18\x0f \x03(\x0b\x32=.google.cloud.notebooks.v1.VirtualMachineConfig.MetadataEntryB\x03\xe0\x41\x01\x12P\n\x06labels\x18\x10 \x03(\x0b\x32;.google.cloud.notebooks.v1.VirtualMachineConfig.LabelsEntryB\x03\xe0\x41\x01\x12N\n\x08nic_type\x18\x11 \x01(\x0e\x32\x37.google.cloud.notebooks.v1.VirtualMachineConfig.NicTypeB\x03\xe0\x41\x01\x12\x1e\n\x11reserved_ip_range\x18\x12 \x01(\tB\x03\xe0\x41\x01\x12R\n\nboot_image\x18\x13 \x01(\x0b\x32\x39.google.cloud.notebooks.v1.VirtualMachineConfig.BootImageB\x03\xe0\x41\x01\x1a\x0b\n\tBootImage\x1a\x36\n\x14GuestAttributesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\">\n\x07NicType\x12\x18\n\x14UNSPECIFIED_NIC_TYPE\x10\x00\x12\x0e\n\nVIRTIO_NET\x10\x01\x12\t\n\x05GVNIC\x10\x02\x42\xca\x01\n\x1d\x63om.google.cloud.notebooks.v1B\x0cRuntimeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/cloud/notebooks/v1;notebooks\xaa\x02\x19Google.Cloud.Notebooks.V1\xca\x02\x19Google\\Cloud\\Notebooks\\V1\xea\x02\x1cGoogle::Cloud::Notebooks::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.notebooks.v1.runtime_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.cloud.notebooks.v1B\014RuntimeProtoP\001ZBgoogle.golang.org/genproto/googleapis/cloud/notebooks/v1;notebooks\252\002\031Google.Cloud.Notebooks.V1\312\002\031Google\\Cloud\\Notebooks\\V1\352\002\034Google::Cloud::Notebooks::V1'
  _RUNTIME.fields_by_name['name']._options = None
  _RUNTIME.fields_by_name['name']._serialized_options = b'\340A\003'
  _RUNTIME.fields_by_name['state']._options = None
  _RUNTIME.fields_by_name['state']._serialized_options = b'\340A\003'
  _RUNTIME.fields_by_name['health_state']._options = None
  _RUNTIME.fields_by_name['health_state']._serialized_options = b'\340A\003'
  _RUNTIME.fields_by_name['metrics']._options = None
  _RUNTIME.fields_by_name['metrics']._serialized_options = b'\340A\003'
  _RUNTIME.fields_by_name['create_time']._options = None
  _RUNTIME.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _RUNTIME.fields_by_name['update_time']._options = None
  _RUNTIME.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _RUNTIME._options = None
  _RUNTIME._serialized_options = b'\352A^\n notebooks.googleapis.com/Runtime\022:projects/{project}/locations/{location}/runtimes/{runtime}'
  _RUNTIMEACCELERATORCONFIG_ACCELERATORTYPE.values_by_name["NVIDIA_TESLA_K80"]._options = None
  _RUNTIMEACCELERATORCONFIG_ACCELERATORTYPE.values_by_name["NVIDIA_TESLA_K80"]._serialized_options = b'\010\001'
  _LOCALDISK.fields_by_name['auto_delete']._options = None
  _LOCALDISK.fields_by_name['auto_delete']._serialized_options = b'\340A\003'
  _LOCALDISK.fields_by_name['boot']._options = None
  _LOCALDISK.fields_by_name['boot']._serialized_options = b'\340A\003'
  _LOCALDISK.fields_by_name['device_name']._options = None
  _LOCALDISK.fields_by_name['device_name']._serialized_options = b'\340A\003'
  _LOCALDISK.fields_by_name['guest_os_features']._options = None
  _LOCALDISK.fields_by_name['guest_os_features']._serialized_options = b'\340A\003'
  _LOCALDISK.fields_by_name['index']._options = None
  _LOCALDISK.fields_by_name['index']._serialized_options = b'\340A\003'
  _LOCALDISK.fields_by_name['initialize_params']._options = None
  _LOCALDISK.fields_by_name['initialize_params']._serialized_options = b'\340A\004'
  _LOCALDISK.fields_by_name['kind']._options = None
  _LOCALDISK.fields_by_name['kind']._serialized_options = b'\340A\003'
  _LOCALDISK.fields_by_name['licenses']._options = None
  _LOCALDISK.fields_by_name['licenses']._serialized_options = b'\340A\003'
  _LOCALDISKINITIALIZEPARAMS_LABELSENTRY._options = None
  _LOCALDISKINITIALIZEPARAMS_LABELSENTRY._serialized_options = b'8\001'
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['description']._options = None
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['description']._serialized_options = b'\340A\001'
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['disk_name']._options = None
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['disk_name']._serialized_options = b'\340A\001'
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['disk_size_gb']._options = None
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['disk_size_gb']._serialized_options = b'\340A\001'
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['disk_type']._options = None
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['disk_type']._serialized_options = b'\340A\004'
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['labels']._options = None
  _LOCALDISKINITIALIZEPARAMS.fields_by_name['labels']._serialized_options = b'\340A\001'
  _RUNTIMEACCESSCONFIG.fields_by_name['proxy_uri']._options = None
  _RUNTIMEACCESSCONFIG.fields_by_name['proxy_uri']._serialized_options = b'\340A\003'
  _RUNTIMESOFTWARECONFIG.fields_by_name['kernels']._options = None
  _RUNTIMESOFTWARECONFIG.fields_by_name['kernels']._serialized_options = b'\340A\001'
  _RUNTIMESOFTWARECONFIG.fields_by_name['upgradeable']._options = None
  _RUNTIMESOFTWARECONFIG.fields_by_name['upgradeable']._serialized_options = b'\340A\003'
  _RUNTIMESOFTWARECONFIG.fields_by_name['version']._options = None
  _RUNTIMESOFTWARECONFIG.fields_by_name['version']._serialized_options = b'\340A\003'
  _RUNTIMEMETRICS_SYSTEMMETRICSENTRY._options = None
  _RUNTIMEMETRICS_SYSTEMMETRICSENTRY._serialized_options = b'8\001'
  _RUNTIMEMETRICS.fields_by_name['system_metrics']._options = None
  _RUNTIMEMETRICS.fields_by_name['system_metrics']._serialized_options = b'\340A\003'
  _VIRTUALMACHINE.fields_by_name['instance_name']._options = None
  _VIRTUALMACHINE.fields_by_name['instance_name']._serialized_options = b'\340A\003'
  _VIRTUALMACHINE.fields_by_name['instance_id']._options = None
  _VIRTUALMACHINE.fields_by_name['instance_id']._serialized_options = b'\340A\003'
  _VIRTUALMACHINECONFIG_GUESTATTRIBUTESENTRY._options = None
  _VIRTUALMACHINECONFIG_GUESTATTRIBUTESENTRY._serialized_options = b'8\001'
  _VIRTUALMACHINECONFIG_METADATAENTRY._options = None
  _VIRTUALMACHINECONFIG_METADATAENTRY._serialized_options = b'8\001'
  _VIRTUALMACHINECONFIG_LABELSENTRY._options = None
  _VIRTUALMACHINECONFIG_LABELSENTRY._serialized_options = b'8\001'
  _VIRTUALMACHINECONFIG.fields_by_name['zone']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['zone']._serialized_options = b'\340A\003'
  _VIRTUALMACHINECONFIG.fields_by_name['machine_type']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['machine_type']._serialized_options = b'\340A\002'
  _VIRTUALMACHINECONFIG.fields_by_name['container_images']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['container_images']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['data_disk']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['data_disk']._serialized_options = b'\340A\002'
  _VIRTUALMACHINECONFIG.fields_by_name['encryption_config']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['encryption_config']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['shielded_instance_config']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['shielded_instance_config']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['accelerator_config']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['accelerator_config']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['network']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['network']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['subnet']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['subnet']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['internal_ip_only']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['internal_ip_only']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['tags']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['tags']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['guest_attributes']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['guest_attributes']._serialized_options = b'\340A\003'
  _VIRTUALMACHINECONFIG.fields_by_name['metadata']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['metadata']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['labels']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['labels']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['nic_type']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['nic_type']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['reserved_ip_range']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['reserved_ip_range']._serialized_options = b'\340A\001'
  _VIRTUALMACHINECONFIG.fields_by_name['boot_image']._options = None
  _VIRTUALMACHINECONFIG.fields_by_name['boot_image']._serialized_options = b'\340A\001'
  _RUNTIME._serialized_start=209
  _RUNTIME._serialized_end=1150
  _RUNTIME_STATE._serialized_start=766
  _RUNTIME_STATE._serialized_end=914
  _RUNTIME_HEALTHSTATE._serialized_start=916
  _RUNTIME_HEALTHSTATE._serialized_end=1035
  _RUNTIMEACCELERATORCONFIG._serialized_start=1153
  _RUNTIMEACCELERATORCONFIG._serialized_end=1574
  _RUNTIMEACCELERATORCONFIG_ACCELERATORTYPE._serialized_start=1285
  _RUNTIMEACCELERATORCONFIG_ACCELERATORTYPE._serialized_end=1574
  _ENCRYPTIONCONFIG._serialized_start=1576
  _ENCRYPTIONCONFIG._serialized_end=1611
  _LOCALDISK._serialized_start=1614
  _LOCALDISK._serialized_end=2038
  _LOCALDISK_RUNTIMEGUESTOSFEATURE._serialized_start=2001
  _LOCALDISK_RUNTIMEGUESTOSFEATURE._serialized_end=2038
  _LOCALDISKINITIALIZEPARAMS._serialized_start=2041
  _LOCALDISKINITIALIZEPARAMS._serialized_end=2467
  _LOCALDISKINITIALIZEPARAMS_LABELSENTRY._serialized_start=2321
  _LOCALDISKINITIALIZEPARAMS_LABELSENTRY._serialized_end=2366
  _LOCALDISKINITIALIZEPARAMS_DISKTYPE._serialized_start=2368
  _LOCALDISKINITIALIZEPARAMS_DISKTYPE._serialized_end=2467
  _RUNTIMEACCESSCONFIG._serialized_start=2470
  _RUNTIMEACCESSCONFIG._serialized_end=2721
  _RUNTIMEACCESSCONFIG_RUNTIMEACCESSTYPE._serialized_start=2627
  _RUNTIMEACCESSCONFIG_RUNTIMEACCESSTYPE._serialized_end=2721
  _RUNTIMESOFTWARECONFIG._serialized_start=2724
  _RUNTIMESOFTWARECONFIG._serialized_end=3464
  _RUNTIMESOFTWARECONFIG_POSTSTARTUPSCRIPTBEHAVIOR._serialized_start=3240
  _RUNTIMESOFTWARECONFIG_POSTSTARTUPSCRIPTBEHAVIOR._serialized_end=3368
  _RUNTIMEMETRICS._serialized_start=3467
  _RUNTIMEMETRICS._serialized_end=3628
  _RUNTIMEMETRICS_SYSTEMMETRICSENTRY._serialized_start=3576
  _RUNTIMEMETRICS_SYSTEMMETRICSENTRY._serialized_end=3628
  _RUNTIMESHIELDEDINSTANCECONFIG._serialized_start=3630
  _RUNTIMESHIELDEDINSTANCECONFIG._serialized_end=3747
  _VIRTUALMACHINE._serialized_start=3750
  _VIRTUALMACHINE._serialized_end=3901
  _VIRTUALMACHINECONFIG._serialized_start=3904
  _VIRTUALMACHINECONFIG._serialized_end=5155
  _VIRTUALMACHINECONFIG_BOOTIMAGE._serialized_start=4928
  _VIRTUALMACHINECONFIG_BOOTIMAGE._serialized_end=4939
  _VIRTUALMACHINECONFIG_GUESTATTRIBUTESENTRY._serialized_start=4941
  _VIRTUALMACHINECONFIG_GUESTATTRIBUTESENTRY._serialized_end=4995
  _VIRTUALMACHINECONFIG_METADATAENTRY._serialized_start=4997
  _VIRTUALMACHINECONFIG_METADATAENTRY._serialized_end=5044
  _VIRTUALMACHINECONFIG_LABELSENTRY._serialized_start=2321
  _VIRTUALMACHINECONFIG_LABELSENTRY._serialized_end=2366
  _VIRTUALMACHINECONFIG_NICTYPE._serialized_start=5093
  _VIRTUALMACHINECONFIG_NICTYPE._serialized_end=5155
# @@protoc_insertion_point(module_scope)