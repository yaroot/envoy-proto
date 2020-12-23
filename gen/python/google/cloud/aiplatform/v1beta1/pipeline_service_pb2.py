# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1beta1 import training_pipeline_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_training__pipeline__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/pipeline_service.proto',
  package='google.cloud.aiplatform.v1beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.aiplatform.v1beta1B\024PipelineServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/cloud/aiplatform/v1beta1/pipeline_service.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x37google/cloud/aiplatform/v1beta1/training_pipeline.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xad\x01\n\x1d\x43reateTrainingPipelineRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12Q\n\x11training_pipeline\x18\x02 \x01(\x0b\x32\x31.google.cloud.aiplatform.v1beta1.TrainingPipelineB\x03\xe0\x41\x02\"^\n\x1aGetTrainingPipelineRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*aiplatform.googleapis.com/TrainingPipeline\"\xbf\x01\n\x1cListTrainingPipelinesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x87\x01\n\x1dListTrainingPipelinesResponse\x12M\n\x12training_pipelines\x18\x01 \x03(\x0b\x32\x31.google.cloud.aiplatform.v1beta1.TrainingPipeline\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"a\n\x1d\x44\x65leteTrainingPipelineRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*aiplatform.googleapis.com/TrainingPipeline\"a\n\x1d\x43\x61ncelTrainingPipelineRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*aiplatform.googleapis.com/TrainingPipeline2\xd9\t\n\x0fPipelineService\x12\xfd\x01\n\x16\x43reateTrainingPipeline\x12>.google.cloud.aiplatform.v1beta1.CreateTrainingPipelineRequest\x1a\x31.google.cloud.aiplatform.v1beta1.TrainingPipeline\"p\x82\xd3\xe4\x93\x02O\":/v1beta1/{parent=projects/*/locations/*}/trainingPipelines:\x11training_pipeline\xda\x41\x18parent,training_pipeline\x12\xd0\x01\n\x13GetTrainingPipeline\x12;.google.cloud.aiplatform.v1beta1.GetTrainingPipelineRequest\x1a\x31.google.cloud.aiplatform.v1beta1.TrainingPipeline\"I\x82\xd3\xe4\x93\x02<\x12:/v1beta1/{name=projects/*/locations/*/trainingPipelines/*}\xda\x41\x04name\x12\xe3\x01\n\x15ListTrainingPipelines\x12=.google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest\x1a>.google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse\"K\x82\xd3\xe4\x93\x02<\x12:/v1beta1/{parent=projects/*/locations/*}/trainingPipelines\xda\x41\x06parent\x12\xf5\x01\n\x16\x44\x65leteTrainingPipeline\x12>.google.cloud.aiplatform.v1beta1.DeleteTrainingPipelineRequest\x1a\x1d.google.longrunning.Operation\"|\x82\xd3\xe4\x93\x02<*:/v1beta1/{name=projects/*/locations/*/trainingPipelines/*}\xda\x41\x04name\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\xc5\x01\n\x16\x43\x61ncelTrainingPipeline\x12>.google.cloud.aiplatform.v1beta1.CancelTrainingPipelineRequest\x1a\x16.google.protobuf.Empty\"S\x82\xd3\xe4\x93\x02\x46\"A/v1beta1/{name=projects/*/locations/*/trainingPipelines/*}:cancel:\x01*\xda\x41\x04name\x1aM\xca\x41\x19\x61iplatform.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x88\x01\n#com.google.cloud.aiplatform.v1beta1B\x14PipelineServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatformb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_training__pipeline__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,])




_CREATETRAININGPIPELINEREQUEST = _descriptor.Descriptor(
  name='CreateTrainingPipelineRequest',
  full_name='google.cloud.aiplatform.v1beta1.CreateTrainingPipelineRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.aiplatform.v1beta1.CreateTrainingPipelineRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!locations.googleapis.com/Location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='training_pipeline', full_name='google.cloud.aiplatform.v1beta1.CreateTrainingPipelineRequest.training_pipeline', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=364,
  serialized_end=537,
)


_GETTRAININGPIPELINEREQUEST = _descriptor.Descriptor(
  name='GetTrainingPipelineRequest',
  full_name='google.cloud.aiplatform.v1beta1.GetTrainingPipelineRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.aiplatform.v1beta1.GetTrainingPipelineRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A,\n*aiplatform.googleapis.com/TrainingPipeline', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=539,
  serialized_end=633,
)


_LISTTRAININGPIPELINESREQUEST = _descriptor.Descriptor(
  name='ListTrainingPipelinesRequest',
  full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!locations.googleapis.com/Location', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.filter', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.page_size', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.page_token', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_mask', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest.read_mask', index=4,
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
  ],
  serialized_start=636,
  serialized_end=827,
)


_LISTTRAININGPIPELINESRESPONSE = _descriptor.Descriptor(
  name='ListTrainingPipelinesResponse',
  full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='training_pipelines', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse.training_pipelines', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse.next_page_token', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=830,
  serialized_end=965,
)


_DELETETRAININGPIPELINEREQUEST = _descriptor.Descriptor(
  name='DeleteTrainingPipelineRequest',
  full_name='google.cloud.aiplatform.v1beta1.DeleteTrainingPipelineRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.aiplatform.v1beta1.DeleteTrainingPipelineRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A,\n*aiplatform.googleapis.com/TrainingPipeline', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=967,
  serialized_end=1064,
)


_CANCELTRAININGPIPELINEREQUEST = _descriptor.Descriptor(
  name='CancelTrainingPipelineRequest',
  full_name='google.cloud.aiplatform.v1beta1.CancelTrainingPipelineRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.aiplatform.v1beta1.CancelTrainingPipelineRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A,\n*aiplatform.googleapis.com/TrainingPipeline', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1066,
  serialized_end=1163,
)

_CREATETRAININGPIPELINEREQUEST.fields_by_name['training_pipeline'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_training__pipeline__pb2._TRAININGPIPELINE
_LISTTRAININGPIPELINESREQUEST.fields_by_name['read_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_LISTTRAININGPIPELINESRESPONSE.fields_by_name['training_pipelines'].message_type = google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_training__pipeline__pb2._TRAININGPIPELINE
DESCRIPTOR.message_types_by_name['CreateTrainingPipelineRequest'] = _CREATETRAININGPIPELINEREQUEST
DESCRIPTOR.message_types_by_name['GetTrainingPipelineRequest'] = _GETTRAININGPIPELINEREQUEST
DESCRIPTOR.message_types_by_name['ListTrainingPipelinesRequest'] = _LISTTRAININGPIPELINESREQUEST
DESCRIPTOR.message_types_by_name['ListTrainingPipelinesResponse'] = _LISTTRAININGPIPELINESRESPONSE
DESCRIPTOR.message_types_by_name['DeleteTrainingPipelineRequest'] = _DELETETRAININGPIPELINEREQUEST
DESCRIPTOR.message_types_by_name['CancelTrainingPipelineRequest'] = _CANCELTRAININGPIPELINEREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CreateTrainingPipelineRequest = _reflection.GeneratedProtocolMessageType('CreateTrainingPipelineRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATETRAININGPIPELINEREQUEST,
  '__module__' : 'google.cloud.aiplatform.v1beta1.pipeline_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateTrainingPipelineRequest)
  })
_sym_db.RegisterMessage(CreateTrainingPipelineRequest)

GetTrainingPipelineRequest = _reflection.GeneratedProtocolMessageType('GetTrainingPipelineRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETTRAININGPIPELINEREQUEST,
  '__module__' : 'google.cloud.aiplatform.v1beta1.pipeline_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.GetTrainingPipelineRequest)
  })
_sym_db.RegisterMessage(GetTrainingPipelineRequest)

ListTrainingPipelinesRequest = _reflection.GeneratedProtocolMessageType('ListTrainingPipelinesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTTRAININGPIPELINESREQUEST,
  '__module__' : 'google.cloud.aiplatform.v1beta1.pipeline_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListTrainingPipelinesRequest)
  })
_sym_db.RegisterMessage(ListTrainingPipelinesRequest)

ListTrainingPipelinesResponse = _reflection.GeneratedProtocolMessageType('ListTrainingPipelinesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTTRAININGPIPELINESRESPONSE,
  '__module__' : 'google.cloud.aiplatform.v1beta1.pipeline_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListTrainingPipelinesResponse)
  })
_sym_db.RegisterMessage(ListTrainingPipelinesResponse)

DeleteTrainingPipelineRequest = _reflection.GeneratedProtocolMessageType('DeleteTrainingPipelineRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETETRAININGPIPELINEREQUEST,
  '__module__' : 'google.cloud.aiplatform.v1beta1.pipeline_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.DeleteTrainingPipelineRequest)
  })
_sym_db.RegisterMessage(DeleteTrainingPipelineRequest)

CancelTrainingPipelineRequest = _reflection.GeneratedProtocolMessageType('CancelTrainingPipelineRequest', (_message.Message,), {
  'DESCRIPTOR' : _CANCELTRAININGPIPELINEREQUEST,
  '__module__' : 'google.cloud.aiplatform.v1beta1.pipeline_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CancelTrainingPipelineRequest)
  })
_sym_db.RegisterMessage(CancelTrainingPipelineRequest)


DESCRIPTOR._options = None
_CREATETRAININGPIPELINEREQUEST.fields_by_name['parent']._options = None
_CREATETRAININGPIPELINEREQUEST.fields_by_name['training_pipeline']._options = None
_GETTRAININGPIPELINEREQUEST.fields_by_name['name']._options = None
_LISTTRAININGPIPELINESREQUEST.fields_by_name['parent']._options = None
_DELETETRAININGPIPELINEREQUEST.fields_by_name['name']._options = None
_CANCELTRAININGPIPELINEREQUEST.fields_by_name['name']._options = None

_PIPELINESERVICE = _descriptor.ServiceDescriptor(
  name='PipelineService',
  full_name='google.cloud.aiplatform.v1beta1.PipelineService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\031aiplatform.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=1166,
  serialized_end=2407,
  methods=[
  _descriptor.MethodDescriptor(
    name='CreateTrainingPipeline',
    full_name='google.cloud.aiplatform.v1beta1.PipelineService.CreateTrainingPipeline',
    index=0,
    containing_service=None,
    input_type=_CREATETRAININGPIPELINEREQUEST,
    output_type=google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_training__pipeline__pb2._TRAININGPIPELINE,
    serialized_options=b'\202\323\344\223\002O\":/v1beta1/{parent=projects/*/locations/*}/trainingPipelines:\021training_pipeline\332A\030parent,training_pipeline',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetTrainingPipeline',
    full_name='google.cloud.aiplatform.v1beta1.PipelineService.GetTrainingPipeline',
    index=1,
    containing_service=None,
    input_type=_GETTRAININGPIPELINEREQUEST,
    output_type=google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_training__pipeline__pb2._TRAININGPIPELINE,
    serialized_options=b'\202\323\344\223\002<\022:/v1beta1/{name=projects/*/locations/*/trainingPipelines/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListTrainingPipelines',
    full_name='google.cloud.aiplatform.v1beta1.PipelineService.ListTrainingPipelines',
    index=2,
    containing_service=None,
    input_type=_LISTTRAININGPIPELINESREQUEST,
    output_type=_LISTTRAININGPIPELINESRESPONSE,
    serialized_options=b'\202\323\344\223\002<\022:/v1beta1/{parent=projects/*/locations/*}/trainingPipelines\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteTrainingPipeline',
    full_name='google.cloud.aiplatform.v1beta1.PipelineService.DeleteTrainingPipeline',
    index=3,
    containing_service=None,
    input_type=_DELETETRAININGPIPELINEREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002<*:/v1beta1/{name=projects/*/locations/*/trainingPipelines/*}\332A\004name\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CancelTrainingPipeline',
    full_name='google.cloud.aiplatform.v1beta1.PipelineService.CancelTrainingPipeline',
    index=4,
    containing_service=None,
    input_type=_CANCELTRAININGPIPELINEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002F\"A/v1beta1/{name=projects/*/locations/*/trainingPipelines/*}:cancel:\001*\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_PIPELINESERVICE)

DESCRIPTOR.services_by_name['PipelineService'] = _PIPELINESERVICE

# @@protoc_insertion_point(module_scope)
