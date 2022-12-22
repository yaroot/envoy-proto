# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/baremetalsolution/v2/baremetalsolution.proto
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
from google.cloud.baremetalsolution.v2 import instance_pb2 as google_dot_cloud_dot_baremetalsolution_dot_v2_dot_instance__pb2
from google.cloud.baremetalsolution.v2 import lun_pb2 as google_dot_cloud_dot_baremetalsolution_dot_v2_dot_lun__pb2
from google.cloud.baremetalsolution.v2 import network_pb2 as google_dot_cloud_dot_baremetalsolution_dot_v2_dot_network__pb2
from google.cloud.baremetalsolution.v2 import nfs_share_pb2 as google_dot_cloud_dot_baremetalsolution_dot_v2_dot_nfs__share__pb2
from google.cloud.baremetalsolution.v2 import volume_pb2 as google_dot_cloud_dot_baremetalsolution_dot_v2_dot_volume__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/cloud/baremetalsolution/v2/baremetalsolution.proto\x12!google.cloud.baremetalsolution.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x30google/cloud/baremetalsolution/v2/instance.proto\x1a+google/cloud/baremetalsolution/v2/lun.proto\x1a/google/cloud/baremetalsolution/v2/network.proto\x1a\x31google/cloud/baremetalsolution/v2/nfs_share.proto\x1a.google/cloud/baremetalsolution/v2/volume.proto\x1a#google/longrunning/operations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x80\x02\n\x11OperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0estatus_message\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12#\n\x16requested_cancellation\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\"\x17\n\x15ResetInstanceResponse2\xdd \n\x11\x42\x61reMetalSolution\x12\xc2\x01\n\rListInstances\x12\x37.google.cloud.baremetalsolution.v2.ListInstancesRequest\x1a\x38.google.cloud.baremetalsolution.v2.ListInstancesResponse\">\x82\xd3\xe4\x93\x02/\x12-/v2/{parent=projects/*/locations/*}/instances\xda\x41\x06parent\x12\xaf\x01\n\x0bGetInstance\x12\x35.google.cloud.baremetalsolution.v2.GetInstanceRequest\x1a+.google.cloud.baremetalsolution.v2.Instance\"<\x82\xd3\xe4\x93\x02/\x12-/v2/{name=projects/*/locations/*/instances/*}\xda\x41\x04name\x12\xea\x01\n\x0eUpdateInstance\x12\x38.google.cloud.baremetalsolution.v2.UpdateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\x7f\x82\xd3\xe4\x93\x02\x42\x32\x36/v2/{instance.name=projects/*/locations/*/instances/*}:\x08instance\xda\x41\x14instance,update_mask\xca\x41\x1d\n\x08Instance\x12\x11OperationMetadata\x12\xdb\x01\n\rResetInstance\x12\x37.google.cloud.baremetalsolution.v2.ResetInstanceRequest\x1a\x1d.google.longrunning.Operation\"r\x82\xd3\xe4\x93\x02\x38\"3/v2/{name=projects/*/locations/*/instances/*}:reset:\x01*\xda\x41\x04name\xca\x41*\n\x15ResetInstanceResponse\x12\x11OperationMetadata\x12\xdb\x01\n\rStartInstance\x12\x37.google.cloud.baremetalsolution.v2.StartInstanceRequest\x1a\x1d.google.longrunning.Operation\"r\x82\xd3\xe4\x93\x02\x38\"3/v2/{name=projects/*/locations/*/instances/*}:start:\x01*\xda\x41\x04name\xca\x41*\n\x15StartInstanceResponse\x12\x11OperationMetadata\x12\xd7\x01\n\x0cStopInstance\x12\x36.google.cloud.baremetalsolution.v2.StopInstanceRequest\x1a\x1d.google.longrunning.Operation\"p\x82\xd3\xe4\x93\x02\x37\"2/v2/{name=projects/*/locations/*/instances/*}:stop:\x01*\xda\x41\x04name\xca\x41)\n\x14StopInstanceResponse\x12\x11OperationMetadata\x12\xd6\x01\n\tDetachLun\x12\x33.google.cloud.baremetalsolution.v2.DetachLunRequest\x1a\x1d.google.longrunning.Operation\"u\x82\xd3\xe4\x93\x02@\";/v2/{instance=projects/*/locations/*/instances/*}:detachLun:\x01*\xda\x41\x0cinstance,lun\xca\x41\x1d\n\x08Instance\x12\x11OperationMetadata\x12\xba\x01\n\x0bListVolumes\x12\x35.google.cloud.baremetalsolution.v2.ListVolumesRequest\x1a\x36.google.cloud.baremetalsolution.v2.ListVolumesResponse\"<\x82\xd3\xe4\x93\x02-\x12+/v2/{parent=projects/*/locations/*}/volumes\xda\x41\x06parent\x12\xa7\x01\n\tGetVolume\x12\x33.google.cloud.baremetalsolution.v2.GetVolumeRequest\x1a).google.cloud.baremetalsolution.v2.Volume\":\x82\xd3\xe4\x93\x02-\x12+/v2/{name=projects/*/locations/*/volumes/*}\xda\x41\x04name\x12\xdc\x01\n\x0cUpdateVolume\x12\x36.google.cloud.baremetalsolution.v2.UpdateVolumeRequest\x1a\x1d.google.longrunning.Operation\"u\x82\xd3\xe4\x93\x02<22/v2/{volume.name=projects/*/locations/*/volumes/*}:\x06volume\xda\x41\x12volume,update_mask\xca\x41\x1b\n\x06Volume\x12\x11OperationMetadata\x12\xd6\x01\n\x0cResizeVolume\x12\x36.google.cloud.baremetalsolution.v2.ResizeVolumeRequest\x1a\x1d.google.longrunning.Operation\"o\x82\xd3\xe4\x93\x02\x39\"4/v2/{volume=projects/*/locations/*/volumes/*}:resize:\x01*\xda\x41\x0fvolume,size_gib\xca\x41\x1b\n\x06Volume\x12\x11OperationMetadata\x12\xbe\x01\n\x0cListNetworks\x12\x36.google.cloud.baremetalsolution.v2.ListNetworksRequest\x1a\x37.google.cloud.baremetalsolution.v2.ListNetworksResponse\"=\x82\xd3\xe4\x93\x02.\x12,/v2/{parent=projects/*/locations/*}/networks\xda\x41\x06parent\x12\xdf\x01\n\x10ListNetworkUsage\x12:.google.cloud.baremetalsolution.v2.ListNetworkUsageRequest\x1a;.google.cloud.baremetalsolution.v2.ListNetworkUsageResponse\"R\x82\xd3\xe4\x93\x02\x41\x12?/v2/{location=projects/*/locations/*}/networks:listNetworkUsage\xda\x41\x08location\x12\xab\x01\n\nGetNetwork\x12\x34.google.cloud.baremetalsolution.v2.GetNetworkRequest\x1a*.google.cloud.baremetalsolution.v2.Network\";\x82\xd3\xe4\x93\x02.\x12,/v2/{name=projects/*/locations/*/networks/*}\xda\x41\x04name\x12\xe3\x01\n\rUpdateNetwork\x12\x37.google.cloud.baremetalsolution.v2.UpdateNetworkRequest\x1a\x1d.google.longrunning.Operation\"z\x82\xd3\xe4\x93\x02?24/v2/{network.name=projects/*/locations/*/networks/*}:\x07network\xda\x41\x13network,update_mask\xca\x41\x1c\n\x07Network\x12\x11OperationMetadata\x12\xa5\x01\n\x06GetLun\x12\x30.google.cloud.baremetalsolution.v2.GetLunRequest\x1a&.google.cloud.baremetalsolution.v2.Lun\"A\x82\xd3\xe4\x93\x02\x34\x12\x32/v2/{name=projects/*/locations/*/volumes/*/luns/*}\xda\x41\x04name\x12\xb8\x01\n\x08ListLuns\x12\x32.google.cloud.baremetalsolution.v2.ListLunsRequest\x1a\x33.google.cloud.baremetalsolution.v2.ListLunsResponse\"C\x82\xd3\xe4\x93\x02\x34\x12\x32/v2/{parent=projects/*/locations/*/volumes/*}/luns\xda\x41\x06parent\x12\xaf\x01\n\x0bGetNfsShare\x12\x35.google.cloud.baremetalsolution.v2.GetNfsShareRequest\x1a+.google.cloud.baremetalsolution.v2.NfsShare\"<\x82\xd3\xe4\x93\x02/\x12-/v2/{name=projects/*/locations/*/nfsShares/*}\xda\x41\x04name\x12\xc2\x01\n\rListNfsShares\x12\x37.google.cloud.baremetalsolution.v2.ListNfsSharesRequest\x1a\x38.google.cloud.baremetalsolution.v2.ListNfsSharesResponse\">\x82\xd3\xe4\x93\x02/\x12-/v2/{parent=projects/*/locations/*}/nfsShares\xda\x41\x06parent\x12\xee\x01\n\x0eUpdateNfsShare\x12\x38.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest\x1a\x1d.google.longrunning.Operation\"\x82\x01\x82\xd3\xe4\x93\x02\x44\x32\x37/v2/{nfs_share.name=projects/*/locations/*/nfsShares/*}:\tnfs_share\xda\x41\x15nfs_share,update_mask\xca\x41\x1d\n\x08NfsShare\x12\x11OperationMetadata\x1aT\xca\x41 baremetalsolution.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x84\x02\n%com.google.cloud.baremetalsolution.v2B\x16\x42\x61reMetalSolutionProtoP\x01ZRgoogle.golang.org/genproto/googleapis/cloud/baremetalsolution/v2;baremetalsolution\xaa\x02!Google.Cloud.BareMetalSolution.V2\xca\x02!Google\\Cloud\\BareMetalSolution\\V2\xea\x02$Google::Cloud::BareMetalSolution::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.baremetalsolution.v2.baremetalsolution_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.cloud.baremetalsolution.v2B\026BareMetalSolutionProtoP\001ZRgoogle.golang.org/genproto/googleapis/cloud/baremetalsolution/v2;baremetalsolution\252\002!Google.Cloud.BareMetalSolution.V2\312\002!Google\\Cloud\\BareMetalSolution\\V2\352\002$Google::Cloud::BareMetalSolution::V2'
  _OPERATIONMETADATA.fields_by_name['create_time']._options = None
  _OPERATIONMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['end_time']._options = None
  _OPERATIONMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['target']._options = None
  _OPERATIONMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['verb']._options = None
  _OPERATIONMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['status_message']._options = None
  _OPERATIONMETADATA.fields_by_name['status_message']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._options = None
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['api_version']._options = None
  _OPERATIONMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _BAREMETALSOLUTION._options = None
  _BAREMETALSOLUTION._serialized_options = b'\312A baremetalsolution.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _BAREMETALSOLUTION.methods_by_name['ListInstances']._options = None
  _BAREMETALSOLUTION.methods_by_name['ListInstances']._serialized_options = b'\202\323\344\223\002/\022-/v2/{parent=projects/*/locations/*}/instances\332A\006parent'
  _BAREMETALSOLUTION.methods_by_name['GetInstance']._options = None
  _BAREMETALSOLUTION.methods_by_name['GetInstance']._serialized_options = b'\202\323\344\223\002/\022-/v2/{name=projects/*/locations/*/instances/*}\332A\004name'
  _BAREMETALSOLUTION.methods_by_name['UpdateInstance']._options = None
  _BAREMETALSOLUTION.methods_by_name['UpdateInstance']._serialized_options = b'\202\323\344\223\002B26/v2/{instance.name=projects/*/locations/*/instances/*}:\010instance\332A\024instance,update_mask\312A\035\n\010Instance\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['ResetInstance']._options = None
  _BAREMETALSOLUTION.methods_by_name['ResetInstance']._serialized_options = b'\202\323\344\223\0028\"3/v2/{name=projects/*/locations/*/instances/*}:reset:\001*\332A\004name\312A*\n\025ResetInstanceResponse\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['StartInstance']._options = None
  _BAREMETALSOLUTION.methods_by_name['StartInstance']._serialized_options = b'\202\323\344\223\0028\"3/v2/{name=projects/*/locations/*/instances/*}:start:\001*\332A\004name\312A*\n\025StartInstanceResponse\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['StopInstance']._options = None
  _BAREMETALSOLUTION.methods_by_name['StopInstance']._serialized_options = b'\202\323\344\223\0027\"2/v2/{name=projects/*/locations/*/instances/*}:stop:\001*\332A\004name\312A)\n\024StopInstanceResponse\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['DetachLun']._options = None
  _BAREMETALSOLUTION.methods_by_name['DetachLun']._serialized_options = b'\202\323\344\223\002@\";/v2/{instance=projects/*/locations/*/instances/*}:detachLun:\001*\332A\014instance,lun\312A\035\n\010Instance\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['ListVolumes']._options = None
  _BAREMETALSOLUTION.methods_by_name['ListVolumes']._serialized_options = b'\202\323\344\223\002-\022+/v2/{parent=projects/*/locations/*}/volumes\332A\006parent'
  _BAREMETALSOLUTION.methods_by_name['GetVolume']._options = None
  _BAREMETALSOLUTION.methods_by_name['GetVolume']._serialized_options = b'\202\323\344\223\002-\022+/v2/{name=projects/*/locations/*/volumes/*}\332A\004name'
  _BAREMETALSOLUTION.methods_by_name['UpdateVolume']._options = None
  _BAREMETALSOLUTION.methods_by_name['UpdateVolume']._serialized_options = b'\202\323\344\223\002<22/v2/{volume.name=projects/*/locations/*/volumes/*}:\006volume\332A\022volume,update_mask\312A\033\n\006Volume\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['ResizeVolume']._options = None
  _BAREMETALSOLUTION.methods_by_name['ResizeVolume']._serialized_options = b'\202\323\344\223\0029\"4/v2/{volume=projects/*/locations/*/volumes/*}:resize:\001*\332A\017volume,size_gib\312A\033\n\006Volume\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['ListNetworks']._options = None
  _BAREMETALSOLUTION.methods_by_name['ListNetworks']._serialized_options = b'\202\323\344\223\002.\022,/v2/{parent=projects/*/locations/*}/networks\332A\006parent'
  _BAREMETALSOLUTION.methods_by_name['ListNetworkUsage']._options = None
  _BAREMETALSOLUTION.methods_by_name['ListNetworkUsage']._serialized_options = b'\202\323\344\223\002A\022?/v2/{location=projects/*/locations/*}/networks:listNetworkUsage\332A\010location'
  _BAREMETALSOLUTION.methods_by_name['GetNetwork']._options = None
  _BAREMETALSOLUTION.methods_by_name['GetNetwork']._serialized_options = b'\202\323\344\223\002.\022,/v2/{name=projects/*/locations/*/networks/*}\332A\004name'
  _BAREMETALSOLUTION.methods_by_name['UpdateNetwork']._options = None
  _BAREMETALSOLUTION.methods_by_name['UpdateNetwork']._serialized_options = b'\202\323\344\223\002?24/v2/{network.name=projects/*/locations/*/networks/*}:\007network\332A\023network,update_mask\312A\034\n\007Network\022\021OperationMetadata'
  _BAREMETALSOLUTION.methods_by_name['GetLun']._options = None
  _BAREMETALSOLUTION.methods_by_name['GetLun']._serialized_options = b'\202\323\344\223\0024\0222/v2/{name=projects/*/locations/*/volumes/*/luns/*}\332A\004name'
  _BAREMETALSOLUTION.methods_by_name['ListLuns']._options = None
  _BAREMETALSOLUTION.methods_by_name['ListLuns']._serialized_options = b'\202\323\344\223\0024\0222/v2/{parent=projects/*/locations/*/volumes/*}/luns\332A\006parent'
  _BAREMETALSOLUTION.methods_by_name['GetNfsShare']._options = None
  _BAREMETALSOLUTION.methods_by_name['GetNfsShare']._serialized_options = b'\202\323\344\223\002/\022-/v2/{name=projects/*/locations/*/nfsShares/*}\332A\004name'
  _BAREMETALSOLUTION.methods_by_name['ListNfsShares']._options = None
  _BAREMETALSOLUTION.methods_by_name['ListNfsShares']._serialized_options = b'\202\323\344\223\002/\022-/v2/{parent=projects/*/locations/*}/nfsShares\332A\006parent'
  _BAREMETALSOLUTION.methods_by_name['UpdateNfsShare']._options = None
  _BAREMETALSOLUTION.methods_by_name['UpdateNfsShare']._serialized_options = b'\202\323\344\223\002D27/v2/{nfs_share.name=projects/*/locations/*/nfsShares/*}:\tnfs_share\332A\025nfs_share,update_mask\312A\035\n\010NfsShare\022\021OperationMetadata'
  _OPERATIONMETADATA._serialized_start=498
  _OPERATIONMETADATA._serialized_end=754
  _RESETINSTANCERESPONSE._serialized_start=756
  _RESETINSTANCERESPONSE._serialized_end=779
  _BAREMETALSOLUTION._serialized_start=782
  _BAREMETALSOLUTION._serialized_end=4971
# @@protoc_insertion_point(module_scope)