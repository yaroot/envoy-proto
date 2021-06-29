# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/chromeos/moblab/v1beta1/resources.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/chromeos/moblab/v1beta1/resources.proto',
  package='google.chromeos.moblab.v1beta1',
  syntax='proto3',
  serialized_options=b'\n\"com.google.chromeos.moblab.v1beta1B\016ResourcesProtoH\001P\001ZDgoogle.golang.org/genproto/googleapis/chromeos/moblab/v1beta1;moblab',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.google/chromeos/moblab/v1beta1/resources.proto\x12\x1egoogle.chromeos.moblab.v1beta1\x1a\x19google/api/resource.proto\"h\n\x0b\x42uildTarget\x12\x0c\n\x04name\x18\x01 \x01(\t:K\xea\x41H\n)chromeosmoblab.googleapis.com/BuildTarget\x12\x1b\x62uildTargets/{build_target}\"k\n\x05Model\x12\x0c\n\x04name\x18\x01 \x01(\t:T\xea\x41Q\n#chromeosmoblab.googleapis.com/Model\x12*buildTargets/{build_target}/models/{model}\"_\n\tMilestone\x12\x0c\n\x04name\x18\x01 \x01(\t:D\xea\x41\x41\n\'chromeosmoblab.googleapis.com/Milestone\x12\x16milestones/{milestone}\"\x83\x04\n\x05\x42uild\x12\x0c\n\x04name\x18\x01 \x01(\t\x12?\n\tmilestone\x18\x02 \x01(\tB,\xfa\x41)\n\'chromeosmoblab.googleapis.com/Milestone\x12\x15\n\rbuild_version\x18\x03 \x01(\t\x12\x41\n\x06status\x18\x04 \x01(\x0e\x32\x31.google.chromeos.moblab.v1beta1.Build.BuildStatus\x12=\n\x04type\x18\x05 \x01(\x0e\x32/.google.chromeos.moblab.v1beta1.Build.BuildType\x12\x0e\n\x06\x62ranch\x18\x06 \x01(\t\"Y\n\x0b\x42uildStatus\x12\x1c\n\x18\x42UILD_STATUS_UNSPECIFIED\x10\x00\x12\x08\n\x04PASS\x10\x01\x12\x08\n\x04\x46\x41IL\x10\x02\x12\x0b\n\x07RUNNING\x10\x03\x12\x0b\n\x07\x41\x42ORTED\x10\x04\"B\n\tBuildType\x12\x1a\n\x16\x42UILD_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07RELEASE\x10\x01\x12\x0c\n\x08\x46IRMWARE\x10\x02:c\xea\x41`\n#chromeosmoblab.googleapis.com/Build\x12\x39\x62uildTargets/{build_target}/models/{model}/builds/{build}\"\x8d\x02\n\rBuildArtifact\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x37\n\x05\x62uild\x18\x02 \x01(\tB(\xfa\x41%\n#chromeosmoblab.googleapis.com/Build\x12\x0e\n\x06\x62ucket\x18\x03 \x01(\t\x12\x0c\n\x04path\x18\x04 \x01(\t\x12\x14\n\x0cobject_count\x18\x05 \x01(\r:\x80\x01\xea\x41}\n+chromeosmoblab.googleapis.com/BuildArtifact\x12NbuildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}B~\n\"com.google.chromeos.moblab.v1beta1B\x0eResourcesProtoH\x01P\x01ZDgoogle.golang.org/genproto/googleapis/chromeos/moblab/v1beta1;moblabb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,])



_BUILD_BUILDSTATUS = _descriptor.EnumDescriptor(
  name='BuildStatus',
  full_name='google.chromeos.moblab.v1beta1.Build.BuildStatus',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='BUILD_STATUS_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PASS', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FAIL', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RUNNING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ABORTED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=679,
  serialized_end=768,
)
_sym_db.RegisterEnumDescriptor(_BUILD_BUILDSTATUS)

_BUILD_BUILDTYPE = _descriptor.EnumDescriptor(
  name='BuildType',
  full_name='google.chromeos.moblab.v1beta1.Build.BuildType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='BUILD_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RELEASE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FIRMWARE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=770,
  serialized_end=836,
)
_sym_db.RegisterEnumDescriptor(_BUILD_BUILDTYPE)


_BUILDTARGET = _descriptor.Descriptor(
  name='BuildTarget',
  full_name='google.chromeos.moblab.v1beta1.BuildTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.chromeos.moblab.v1beta1.BuildTarget.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_options=b'\352AH\n)chromeosmoblab.googleapis.com/BuildTarget\022\033buildTargets/{build_target}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=109,
  serialized_end=213,
)


_MODEL = _descriptor.Descriptor(
  name='Model',
  full_name='google.chromeos.moblab.v1beta1.Model',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.chromeos.moblab.v1beta1.Model.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_options=b'\352AQ\n#chromeosmoblab.googleapis.com/Model\022*buildTargets/{build_target}/models/{model}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=215,
  serialized_end=322,
)


_MILESTONE = _descriptor.Descriptor(
  name='Milestone',
  full_name='google.chromeos.moblab.v1beta1.Milestone',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.chromeos.moblab.v1beta1.Milestone.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_options=b'\352AA\n\'chromeosmoblab.googleapis.com/Milestone\022\026milestones/{milestone}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=324,
  serialized_end=419,
)


_BUILD = _descriptor.Descriptor(
  name='Build',
  full_name='google.chromeos.moblab.v1beta1.Build',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.chromeos.moblab.v1beta1.Build.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='milestone', full_name='google.chromeos.moblab.v1beta1.Build.milestone', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A)\n\'chromeosmoblab.googleapis.com/Milestone', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='build_version', full_name='google.chromeos.moblab.v1beta1.Build.build_version', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.chromeos.moblab.v1beta1.Build.status', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.chromeos.moblab.v1beta1.Build.type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='branch', full_name='google.chromeos.moblab.v1beta1.Build.branch', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _BUILD_BUILDSTATUS,
    _BUILD_BUILDTYPE,
  ],
  serialized_options=b'\352A`\n#chromeosmoblab.googleapis.com/Build\0229buildTargets/{build_target}/models/{model}/builds/{build}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=422,
  serialized_end=937,
)


_BUILDARTIFACT = _descriptor.Descriptor(
  name='BuildArtifact',
  full_name='google.chromeos.moblab.v1beta1.BuildArtifact',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.chromeos.moblab.v1beta1.BuildArtifact.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='build', full_name='google.chromeos.moblab.v1beta1.BuildArtifact.build', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A%\n#chromeosmoblab.googleapis.com/Build', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bucket', full_name='google.chromeos.moblab.v1beta1.BuildArtifact.bucket', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='path', full_name='google.chromeos.moblab.v1beta1.BuildArtifact.path', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='object_count', full_name='google.chromeos.moblab.v1beta1.BuildArtifact.object_count', index=4,
      number=5, type=13, cpp_type=3, label=1,
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
  serialized_options=b'\352A}\n+chromeosmoblab.googleapis.com/BuildArtifact\022NbuildTargets/{build_target}/models/{model}/builds/{build}/artifacts/{artifact}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=940,
  serialized_end=1209,
)

_BUILD.fields_by_name['status'].enum_type = _BUILD_BUILDSTATUS
_BUILD.fields_by_name['type'].enum_type = _BUILD_BUILDTYPE
_BUILD_BUILDSTATUS.containing_type = _BUILD
_BUILD_BUILDTYPE.containing_type = _BUILD
DESCRIPTOR.message_types_by_name['BuildTarget'] = _BUILDTARGET
DESCRIPTOR.message_types_by_name['Model'] = _MODEL
DESCRIPTOR.message_types_by_name['Milestone'] = _MILESTONE
DESCRIPTOR.message_types_by_name['Build'] = _BUILD
DESCRIPTOR.message_types_by_name['BuildArtifact'] = _BUILDARTIFACT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BuildTarget = _reflection.GeneratedProtocolMessageType('BuildTarget', (_message.Message,), {
  'DESCRIPTOR' : _BUILDTARGET,
  '__module__' : 'google.chromeos.moblab.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.BuildTarget)
  })
_sym_db.RegisterMessage(BuildTarget)

Model = _reflection.GeneratedProtocolMessageType('Model', (_message.Message,), {
  'DESCRIPTOR' : _MODEL,
  '__module__' : 'google.chromeos.moblab.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.Model)
  })
_sym_db.RegisterMessage(Model)

Milestone = _reflection.GeneratedProtocolMessageType('Milestone', (_message.Message,), {
  'DESCRIPTOR' : _MILESTONE,
  '__module__' : 'google.chromeos.moblab.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.Milestone)
  })
_sym_db.RegisterMessage(Milestone)

Build = _reflection.GeneratedProtocolMessageType('Build', (_message.Message,), {
  'DESCRIPTOR' : _BUILD,
  '__module__' : 'google.chromeos.moblab.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.Build)
  })
_sym_db.RegisterMessage(Build)

BuildArtifact = _reflection.GeneratedProtocolMessageType('BuildArtifact', (_message.Message,), {
  'DESCRIPTOR' : _BUILDARTIFACT,
  '__module__' : 'google.chromeos.moblab.v1beta1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.chromeos.moblab.v1beta1.BuildArtifact)
  })
_sym_db.RegisterMessage(BuildArtifact)


DESCRIPTOR._options = None
_BUILDTARGET._options = None
_MODEL._options = None
_MILESTONE._options = None
_BUILD.fields_by_name['milestone']._options = None
_BUILD._options = None
_BUILDARTIFACT.fields_by_name['build']._options = None
_BUILDARTIFACT._options = None
# @@protoc_insertion_point(module_scope)
