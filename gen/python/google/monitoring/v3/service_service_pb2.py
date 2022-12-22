# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/v3/service_service.proto
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
from google.monitoring.v3 import service_pb2 as google_dot_monitoring_dot_v3_dot_service__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/monitoring/v3/service_service.proto\x12\x14google.monitoring.v3\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\"google/monitoring/v3/service.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\x9a\x01\n\x14\x43reateServiceRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\x12!monitoring.googleapis.com/Service\x12\x12\n\nservice_id\x18\x03 \x01(\t\x12\x33\n\x07service\x18\x02 \x01(\x0b\x32\x1d.google.monitoring.v3.ServiceB\x03\xe0\x41\x02\"L\n\x11GetServiceRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!monitoring.googleapis.com/Service\"\x87\x01\n\x13ListServicesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\x12!monitoring.googleapis.com/Service\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"`\n\x14ListServicesResponse\x12/\n\x08services\x18\x01 \x03(\x0b\x32\x1d.google.monitoring.v3.Service\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"|\n\x14UpdateServiceRequest\x12\x33\n\x07service\x18\x01 \x01(\x0b\x32\x1d.google.monitoring.v3.ServiceB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"O\n\x14\x44\x65leteServiceRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!monitoring.googleapis.com/Service\"\xd6\x01\n\"CreateServiceLevelObjectiveRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!monitoring.googleapis.com/Service\x12\"\n\x1aservice_level_objective_id\x18\x03 \x01(\t\x12Q\n\x17service_level_objective\x18\x02 \x01(\x0b\x32+.google.monitoring.v3.ServiceLevelObjectiveB\x03\xe0\x41\x02\"\xa8\x01\n\x1fGetServiceLevelObjectiveRequest\x12\x45\n\x04name\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\n/monitoring.googleapis.com/ServiceLevelObjective\x12>\n\x04view\x18\x02 \x01(\x0e\x32\x30.google.monitoring.v3.ServiceLevelObjective.View\"\xd5\x01\n!ListServiceLevelObjectivesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!monitoring.googleapis.com/Service\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12>\n\x04view\x18\x05 \x01(\x0e\x32\x30.google.monitoring.v3.ServiceLevelObjective.View\"\x8c\x01\n\"ListServiceLevelObjectivesResponse\x12M\n\x18service_level_objectives\x18\x01 \x03(\x0b\x32+.google.monitoring.v3.ServiceLevelObjective\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xa8\x01\n\"UpdateServiceLevelObjectiveRequest\x12Q\n\x17service_level_objective\x18\x01 \x01(\x0b\x32+.google.monitoring.v3.ServiceLevelObjectiveB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"k\n\"DeleteServiceLevelObjectiveRequest\x12\x45\n\x04name\x18\x01 \x01(\tB7\xe0\x41\x02\xfa\x41\x31\n/monitoring.googleapis.com/ServiceLevelObjective2\xea\x0f\n\x18ServiceMonitoringService\x12\x97\x01\n\rCreateService\x12*.google.monitoring.v3.CreateServiceRequest\x1a\x1d.google.monitoring.v3.Service\";\x82\xd3\xe4\x93\x02$\"\x19/v3/{parent=*/*}/services:\x07service\xda\x41\x0eparent,service\x12~\n\nGetService\x12\'.google.monitoring.v3.GetServiceRequest\x1a\x1d.google.monitoring.v3.Service\"(\x82\xd3\xe4\x93\x02\x1b\x12\x19/v3/{name=*/*/services/*}\xda\x41\x04name\x12\x91\x01\n\x0cListServices\x12).google.monitoring.v3.ListServicesRequest\x1a*.google.monitoring.v3.ListServicesResponse\"*\x82\xd3\xe4\x93\x02\x1b\x12\x19/v3/{parent=*/*}/services\xda\x41\x06parent\x12\x98\x01\n\rUpdateService\x12*.google.monitoring.v3.UpdateServiceRequest\x1a\x1d.google.monitoring.v3.Service\"<\x82\xd3\xe4\x93\x02,2!/v3/{service.name=*/*/services/*}:\x07service\xda\x41\x07service\x12}\n\rDeleteService\x12*.google.monitoring.v3.DeleteServiceRequest\x1a\x16.google.protobuf.Empty\"(\x82\xd3\xe4\x93\x02\x1b*\x19/v3/{name=*/*/services/*}\xda\x41\x04name\x12\xfa\x01\n\x1b\x43reateServiceLevelObjective\x12\x38.google.monitoring.v3.CreateServiceLevelObjectiveRequest\x1a+.google.monitoring.v3.ServiceLevelObjective\"t\x82\xd3\xe4\x93\x02M\"2/v3/{parent=*/*/services/*}/serviceLevelObjectives:\x17service_level_objective\xda\x41\x1eparent,service_level_objective\x12\xc1\x01\n\x18GetServiceLevelObjective\x12\x35.google.monitoring.v3.GetServiceLevelObjectiveRequest\x1a+.google.monitoring.v3.ServiceLevelObjective\"A\x82\xd3\xe4\x93\x02\x34\x12\x32/v3/{name=*/*/services/*/serviceLevelObjectives/*}\xda\x41\x04name\x12\xd4\x01\n\x1aListServiceLevelObjectives\x12\x37.google.monitoring.v3.ListServiceLevelObjectivesRequest\x1a\x38.google.monitoring.v3.ListServiceLevelObjectivesResponse\"C\x82\xd3\xe4\x93\x02\x34\x12\x32/v3/{parent=*/*/services/*}/serviceLevelObjectives\xda\x41\x06parent\x12\x8c\x02\n\x1bUpdateServiceLevelObjective\x12\x38.google.monitoring.v3.UpdateServiceLevelObjectiveRequest\x1a+.google.monitoring.v3.ServiceLevelObjective\"\x85\x01\x82\xd3\xe4\x93\x02\x65\x32J/v3/{service_level_objective.name=*/*/services/*/serviceLevelObjectives/*}:\x17service_level_objective\xda\x41\x17service_level_objective\x12\xb2\x01\n\x1b\x44\x65leteServiceLevelObjective\x12\x38.google.monitoring.v3.DeleteServiceLevelObjectiveRequest\x1a\x16.google.protobuf.Empty\"A\x82\xd3\xe4\x93\x02\x34*2/v3/{name=*/*/services/*/serviceLevelObjectives/*}\xda\x41\x04name\x1a\xa9\x01\xca\x41\x19monitoring.googleapis.com\xd2\x41\x89\x01https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https://www.googleapis.com/auth/monitoring.readB\xd5\x01\n\x18\x63om.google.monitoring.v3B\x1dServiceMonitoringServiceProtoP\x01Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\xaa\x02\x1aGoogle.Cloud.Monitoring.V3\xca\x02\x1aGoogle\\Cloud\\Monitoring\\V3\xea\x02\x1dGoogle::Cloud::Monitoring::V3b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.monitoring.v3.service_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.google.monitoring.v3B\035ServiceMonitoringServiceProtoP\001Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\252\002\032Google.Cloud.Monitoring.V3\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Google::Cloud::Monitoring::V3'
  _CREATESERVICEREQUEST.fields_by_name['parent']._options = None
  _CREATESERVICEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\022!monitoring.googleapis.com/Service'
  _CREATESERVICEREQUEST.fields_by_name['service']._options = None
  _CREATESERVICEREQUEST.fields_by_name['service']._serialized_options = b'\340A\002'
  _GETSERVICEREQUEST.fields_by_name['name']._options = None
  _GETSERVICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!monitoring.googleapis.com/Service'
  _LISTSERVICESREQUEST.fields_by_name['parent']._options = None
  _LISTSERVICESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\022!monitoring.googleapis.com/Service'
  _UPDATESERVICEREQUEST.fields_by_name['service']._options = None
  _UPDATESERVICEREQUEST.fields_by_name['service']._serialized_options = b'\340A\002'
  _DELETESERVICEREQUEST.fields_by_name['name']._options = None
  _DELETESERVICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!monitoring.googleapis.com/Service'
  _CREATESERVICELEVELOBJECTIVEREQUEST.fields_by_name['parent']._options = None
  _CREATESERVICELEVELOBJECTIVEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!monitoring.googleapis.com/Service'
  _CREATESERVICELEVELOBJECTIVEREQUEST.fields_by_name['service_level_objective']._options = None
  _CREATESERVICELEVELOBJECTIVEREQUEST.fields_by_name['service_level_objective']._serialized_options = b'\340A\002'
  _GETSERVICELEVELOBJECTIVEREQUEST.fields_by_name['name']._options = None
  _GETSERVICELEVELOBJECTIVEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A1\n/monitoring.googleapis.com/ServiceLevelObjective'
  _LISTSERVICELEVELOBJECTIVESREQUEST.fields_by_name['parent']._options = None
  _LISTSERVICELEVELOBJECTIVESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!monitoring.googleapis.com/Service'
  _UPDATESERVICELEVELOBJECTIVEREQUEST.fields_by_name['service_level_objective']._options = None
  _UPDATESERVICELEVELOBJECTIVEREQUEST.fields_by_name['service_level_objective']._serialized_options = b'\340A\002'
  _DELETESERVICELEVELOBJECTIVEREQUEST.fields_by_name['name']._options = None
  _DELETESERVICELEVELOBJECTIVEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A1\n/monitoring.googleapis.com/ServiceLevelObjective'
  _SERVICEMONITORINGSERVICE._options = None
  _SERVICEMONITORINGSERVICE._serialized_options = b'\312A\031monitoring.googleapis.com\322A\211\001https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https://www.googleapis.com/auth/monitoring.read'
  _SERVICEMONITORINGSERVICE.methods_by_name['CreateService']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['CreateService']._serialized_options = b'\202\323\344\223\002$\"\031/v3/{parent=*/*}/services:\007service\332A\016parent,service'
  _SERVICEMONITORINGSERVICE.methods_by_name['GetService']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['GetService']._serialized_options = b'\202\323\344\223\002\033\022\031/v3/{name=*/*/services/*}\332A\004name'
  _SERVICEMONITORINGSERVICE.methods_by_name['ListServices']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['ListServices']._serialized_options = b'\202\323\344\223\002\033\022\031/v3/{parent=*/*}/services\332A\006parent'
  _SERVICEMONITORINGSERVICE.methods_by_name['UpdateService']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['UpdateService']._serialized_options = b'\202\323\344\223\002,2!/v3/{service.name=*/*/services/*}:\007service\332A\007service'
  _SERVICEMONITORINGSERVICE.methods_by_name['DeleteService']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['DeleteService']._serialized_options = b'\202\323\344\223\002\033*\031/v3/{name=*/*/services/*}\332A\004name'
  _SERVICEMONITORINGSERVICE.methods_by_name['CreateServiceLevelObjective']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['CreateServiceLevelObjective']._serialized_options = b'\202\323\344\223\002M\"2/v3/{parent=*/*/services/*}/serviceLevelObjectives:\027service_level_objective\332A\036parent,service_level_objective'
  _SERVICEMONITORINGSERVICE.methods_by_name['GetServiceLevelObjective']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['GetServiceLevelObjective']._serialized_options = b'\202\323\344\223\0024\0222/v3/{name=*/*/services/*/serviceLevelObjectives/*}\332A\004name'
  _SERVICEMONITORINGSERVICE.methods_by_name['ListServiceLevelObjectives']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['ListServiceLevelObjectives']._serialized_options = b'\202\323\344\223\0024\0222/v3/{parent=*/*/services/*}/serviceLevelObjectives\332A\006parent'
  _SERVICEMONITORINGSERVICE.methods_by_name['UpdateServiceLevelObjective']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['UpdateServiceLevelObjective']._serialized_options = b'\202\323\344\223\002e2J/v3/{service_level_objective.name=*/*/services/*/serviceLevelObjectives/*}:\027service_level_objective\332A\027service_level_objective'
  _SERVICEMONITORINGSERVICE.methods_by_name['DeleteServiceLevelObjective']._options = None
  _SERVICEMONITORINGSERVICE.methods_by_name['DeleteServiceLevelObjective']._serialized_options = b'\202\323\344\223\0024*2/v3/{name=*/*/services/*/serviceLevelObjectives/*}\332A\004name'
  _CREATESERVICEREQUEST._serialized_start=283
  _CREATESERVICEREQUEST._serialized_end=437
  _GETSERVICEREQUEST._serialized_start=439
  _GETSERVICEREQUEST._serialized_end=515
  _LISTSERVICESREQUEST._serialized_start=518
  _LISTSERVICESREQUEST._serialized_end=653
  _LISTSERVICESRESPONSE._serialized_start=655
  _LISTSERVICESRESPONSE._serialized_end=751
  _UPDATESERVICEREQUEST._serialized_start=753
  _UPDATESERVICEREQUEST._serialized_end=877
  _DELETESERVICEREQUEST._serialized_start=879
  _DELETESERVICEREQUEST._serialized_end=958
  _CREATESERVICELEVELOBJECTIVEREQUEST._serialized_start=961
  _CREATESERVICELEVELOBJECTIVEREQUEST._serialized_end=1175
  _GETSERVICELEVELOBJECTIVEREQUEST._serialized_start=1178
  _GETSERVICELEVELOBJECTIVEREQUEST._serialized_end=1346
  _LISTSERVICELEVELOBJECTIVESREQUEST._serialized_start=1349
  _LISTSERVICELEVELOBJECTIVESREQUEST._serialized_end=1562
  _LISTSERVICELEVELOBJECTIVESRESPONSE._serialized_start=1565
  _LISTSERVICELEVELOBJECTIVESRESPONSE._serialized_end=1705
  _UPDATESERVICELEVELOBJECTIVEREQUEST._serialized_start=1708
  _UPDATESERVICELEVELOBJECTIVEREQUEST._serialized_end=1876
  _DELETESERVICELEVELOBJECTIVEREQUEST._serialized_start=1878
  _DELETESERVICELEVELOBJECTIVEREQUEST._serialized_end=1985
  _SERVICEMONITORINGSERVICE._serialized_start=1988
  _SERVICEMONITORINGSERVICE._serialized_end=4014
# @@protoc_insertion_point(module_scope)