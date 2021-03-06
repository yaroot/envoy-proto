# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/hyperparameter_tuning_job.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1 import custom_job_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_custom__job__pb2
from google.cloud.aiplatform.v1 import encryption_spec_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_encryption__spec__pb2
from google.cloud.aiplatform.v1 import job_state_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_job__state__pb2
from google.cloud.aiplatform.v1 import study_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_study__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1/hyperparameter_tuning_job.proto',
  package='google.cloud.aiplatform.v1',
  syntax='proto3',
  serialized_options=b'\n\036com.google.cloud.aiplatform.v1B\034HyperparameterTuningJobProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/cloud/aiplatform/v1/hyperparameter_tuning_job.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a+google/cloud/aiplatform/v1/custom_job.proto\x1a\x30google/cloud/aiplatform/v1/encryption_spec.proto\x1a*google/cloud/aiplatform/v1/job_state.proto\x1a&google/cloud/aiplatform/v1/study.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x1cgoogle/api/annotations.proto\"\xfb\x07\n\x17HyperparameterTuningJob\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12>\n\nstudy_spec\x18\x04 \x01(\x0b\x32%.google.cloud.aiplatform.v1.StudySpecB\x03\xe0\x41\x02\x12\x1c\n\x0fmax_trial_count\x18\x05 \x01(\x05\x42\x03\xe0\x41\x02\x12!\n\x14parallel_trial_count\x18\x06 \x01(\x05\x42\x03\xe0\x41\x02\x12\x1e\n\x16max_failed_trial_count\x18\x07 \x01(\x05\x12\x46\n\x0etrial_job_spec\x18\x08 \x01(\x0b\x32).google.cloud.aiplatform.v1.CustomJobSpecB\x03\xe0\x41\x02\x12\x36\n\x06trials\x18\t \x03(\x0b\x32!.google.cloud.aiplatform.v1.TrialB\x03\xe0\x41\x03\x12\x38\n\x05state\x18\n \x01(\x0e\x32$.google.cloud.aiplatform.v1.JobStateB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x33\n\nstart_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12&\n\x05\x65rror\x18\x0f \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x12O\n\x06labels\x18\x10 \x03(\x0b\x32?.google.cloud.aiplatform.v1.HyperparameterTuningJob.LabelsEntry\x12\x43\n\x0f\x65ncryption_spec\x18\x11 \x01(\x0b\x32*.google.cloud.aiplatform.v1.EncryptionSpec\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x95\x01\xea\x41\x91\x01\n1aiplatform.googleapis.com/HyperparameterTuningJob\x12\\projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}B\xe0\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x1cHyperparameterTuningJobProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1_dot_custom__job__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1_dot_encryption__spec__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1_dot_job__state__pb2.DESCRIPTOR,google_dot_cloud_dot_aiplatform_dot_v1_dot_study__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_HYPERPARAMETERTUNINGJOB_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.LabelsEntry.value', index=1,
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
  serialized_start=1240,
  serialized_end=1285,
)

_HYPERPARAMETERTUNINGJOB = _descriptor.Descriptor(
  name='HyperparameterTuningJob',
  full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='study_spec', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.study_spec', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_trial_count', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.max_trial_count', index=3,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parallel_trial_count', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.parallel_trial_count', index=4,
      number=6, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_failed_trial_count', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.max_failed_trial_count', index=5,
      number=7, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trial_job_spec', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.trial_job_spec', index=6,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trials', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.trials', index=7,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.state', index=8,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.create_time', index=9,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_time', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.start_time', index=10,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.end_time', index=11,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.update_time', index=12,
      number=14, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='error', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.error', index=13,
      number=15, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.labels', index=14,
      number=16, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='encryption_spec', full_name='google.cloud.aiplatform.v1.HyperparameterTuningJob.encryption_spec', index=15,
      number=17, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_HYPERPARAMETERTUNINGJOB_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352A\221\001\n1aiplatform.googleapis.com/HyperparameterTuningJob\022\\projects/{project}/locations/{location}/hyperparameterTuningJobs/{hyperparameter_tuning_job}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=418,
  serialized_end=1437,
)

_HYPERPARAMETERTUNINGJOB_LABELSENTRY.containing_type = _HYPERPARAMETERTUNINGJOB
_HYPERPARAMETERTUNINGJOB.fields_by_name['study_spec'].message_type = google_dot_cloud_dot_aiplatform_dot_v1_dot_study__pb2._STUDYSPEC
_HYPERPARAMETERTUNINGJOB.fields_by_name['trial_job_spec'].message_type = google_dot_cloud_dot_aiplatform_dot_v1_dot_custom__job__pb2._CUSTOMJOBSPEC
_HYPERPARAMETERTUNINGJOB.fields_by_name['trials'].message_type = google_dot_cloud_dot_aiplatform_dot_v1_dot_study__pb2._TRIAL
_HYPERPARAMETERTUNINGJOB.fields_by_name['state'].enum_type = google_dot_cloud_dot_aiplatform_dot_v1_dot_job__state__pb2._JOBSTATE
_HYPERPARAMETERTUNINGJOB.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_HYPERPARAMETERTUNINGJOB.fields_by_name['start_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_HYPERPARAMETERTUNINGJOB.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_HYPERPARAMETERTUNINGJOB.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_HYPERPARAMETERTUNINGJOB.fields_by_name['error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_HYPERPARAMETERTUNINGJOB.fields_by_name['labels'].message_type = _HYPERPARAMETERTUNINGJOB_LABELSENTRY
_HYPERPARAMETERTUNINGJOB.fields_by_name['encryption_spec'].message_type = google_dot_cloud_dot_aiplatform_dot_v1_dot_encryption__spec__pb2._ENCRYPTIONSPEC
DESCRIPTOR.message_types_by_name['HyperparameterTuningJob'] = _HYPERPARAMETERTUNINGJOB
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

HyperparameterTuningJob = _reflection.GeneratedProtocolMessageType('HyperparameterTuningJob', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _HYPERPARAMETERTUNINGJOB_LABELSENTRY,
    '__module__' : 'google.cloud.aiplatform.v1.hyperparameter_tuning_job_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.HyperparameterTuningJob.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _HYPERPARAMETERTUNINGJOB,
  '__module__' : 'google.cloud.aiplatform.v1.hyperparameter_tuning_job_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.HyperparameterTuningJob)
  })
_sym_db.RegisterMessage(HyperparameterTuningJob)
_sym_db.RegisterMessage(HyperparameterTuningJob.LabelsEntry)


DESCRIPTOR._options = None
_HYPERPARAMETERTUNINGJOB_LABELSENTRY._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['name']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['display_name']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['study_spec']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['max_trial_count']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['parallel_trial_count']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['trial_job_spec']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['trials']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['state']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['create_time']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['start_time']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['end_time']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['update_time']._options = None
_HYPERPARAMETERTUNINGJOB.fields_by_name['error']._options = None
_HYPERPARAMETERTUNINGJOB._options = None
# @@protoc_insertion_point(module_scope)
