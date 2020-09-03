# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/services/label_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.resources import label_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/services/label_service.proto',
  package='google.ads.googleads.v4.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v4.servicesB\021LabelServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4.Services\312\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002$Google::Ads::GoogleAds::V4::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v4/services/label_service.proto\x12 google.ads.googleads.v4.services\x1a-google/ads/googleads/v4/resources/label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"P\n\x0fGetLabelRequest\x12=\n\rresource_name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1egoogleads.googleapis.com/Label\"\xaa\x01\n\x13MutateLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12I\n\noperations\x18\x02 \x03(\x0b\x32\x30.google.ads.googleads.v4.services.LabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xd8\x01\n\x0eLabelOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12:\n\x06\x63reate\x18\x01 \x01(\x0b\x32(.google.ads.googleads.v4.resources.LabelH\x00\x12:\n\x06update\x18\x02 \x01(\x0b\x32(.google.ads.googleads.v4.resources.LabelH\x00\x12\x10\n\x06remove\x18\x03 \x01(\tH\x00\x42\x0b\n\toperation\"\x8f\x01\n\x14MutateLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12\x44\n\x07results\x18\x02 \x03(\x0b\x32\x33.google.ads.googleads.v4.services.MutateLabelResult\"*\n\x11MutateLabelResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xa8\x03\n\x0cLabelService\x12\xa9\x01\n\x08GetLabel\x12\x31.google.ads.googleads.v4.services.GetLabelRequest\x1a(.google.ads.googleads.v4.resources.Label\"@\x82\xd3\xe4\x93\x02*\x12(/v4/{resource_name=customers/*/labels/*}\xda\x41\rresource_name\x12\xce\x01\n\x0cMutateLabels\x12\x35.google.ads.googleads.v4.services.MutateLabelsRequest\x1a\x36.google.ads.googleads.v4.services.MutateLabelsResponse\"O\x82\xd3\xe4\x93\x02\x30\"+/v4/customers/{customer_id=*}/labels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x1b\xca\x41\x18googleads.googleapis.comB\xf8\x01\n$com.google.ads.googleads.v4.servicesB\x11LabelServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V4.Services\xca\x02 Google\\Ads\\GoogleAds\\V4\\Services\xea\x02$Google::Ads::GoogleAds::V4::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_label__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,])




_GETLABELREQUEST = _descriptor.Descriptor(
  name='GetLabelRequest',
  full_name='google.ads.googleads.v4.services.GetLabelRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.GetLabelRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A \n\036googleads.googleapis.com/Label', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=311,
  serialized_end=391,
)


_MUTATELABELSREQUEST = _descriptor.Descriptor(
  name='MutateLabelsRequest',
  full_name='google.ads.googleads.v4.services.MutateLabelsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v4.services.MutateLabelsRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v4.services.MutateLabelsRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_failure', full_name='google.ads.googleads.v4.services.MutateLabelsRequest.partial_failure', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validate_only', full_name='google.ads.googleads.v4.services.MutateLabelsRequest.validate_only', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=394,
  serialized_end=564,
)


_LABELOPERATION = _descriptor.Descriptor(
  name='LabelOperation',
  full_name='google.ads.googleads.v4.services.LabelOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v4.services.LabelOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create', full_name='google.ads.googleads.v4.services.LabelOperation.create', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v4.services.LabelOperation.update', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remove', full_name='google.ads.googleads.v4.services.LabelOperation.remove', index=3,
      number=3, type=9, cpp_type=9, label=1,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v4.services.LabelOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=567,
  serialized_end=783,
)


_MUTATELABELSRESPONSE = _descriptor.Descriptor(
  name='MutateLabelsResponse',
  full_name='google.ads.googleads.v4.services.MutateLabelsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='partial_failure_error', full_name='google.ads.googleads.v4.services.MutateLabelsResponse.partial_failure_error', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v4.services.MutateLabelsResponse.results', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=786,
  serialized_end=929,
)


_MUTATELABELRESULT = _descriptor.Descriptor(
  name='MutateLabelResult',
  full_name='google.ads.googleads.v4.services.MutateLabelResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.MutateLabelResult.resource_name', index=0,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=931,
  serialized_end=973,
)

_MUTATELABELSREQUEST.fields_by_name['operations'].message_type = _LABELOPERATION
_LABELOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_LABELOPERATION.fields_by_name['create'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_label__pb2._LABEL
_LABELOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_label__pb2._LABEL
_LABELOPERATION.oneofs_by_name['operation'].fields.append(
  _LABELOPERATION.fields_by_name['create'])
_LABELOPERATION.fields_by_name['create'].containing_oneof = _LABELOPERATION.oneofs_by_name['operation']
_LABELOPERATION.oneofs_by_name['operation'].fields.append(
  _LABELOPERATION.fields_by_name['update'])
_LABELOPERATION.fields_by_name['update'].containing_oneof = _LABELOPERATION.oneofs_by_name['operation']
_LABELOPERATION.oneofs_by_name['operation'].fields.append(
  _LABELOPERATION.fields_by_name['remove'])
_LABELOPERATION.fields_by_name['remove'].containing_oneof = _LABELOPERATION.oneofs_by_name['operation']
_MUTATELABELSRESPONSE.fields_by_name['partial_failure_error'].message_type = google_dot_rpc_dot_status__pb2._STATUS
_MUTATELABELSRESPONSE.fields_by_name['results'].message_type = _MUTATELABELRESULT
DESCRIPTOR.message_types_by_name['GetLabelRequest'] = _GETLABELREQUEST
DESCRIPTOR.message_types_by_name['MutateLabelsRequest'] = _MUTATELABELSREQUEST
DESCRIPTOR.message_types_by_name['LabelOperation'] = _LABELOPERATION
DESCRIPTOR.message_types_by_name['MutateLabelsResponse'] = _MUTATELABELSRESPONSE
DESCRIPTOR.message_types_by_name['MutateLabelResult'] = _MUTATELABELRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetLabelRequest = _reflection.GeneratedProtocolMessageType('GetLabelRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETLABELREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.GetLabelRequest)
  })
_sym_db.RegisterMessage(GetLabelRequest)

MutateLabelsRequest = _reflection.GeneratedProtocolMessageType('MutateLabelsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATELABELSREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateLabelsRequest)
  })
_sym_db.RegisterMessage(MutateLabelsRequest)

LabelOperation = _reflection.GeneratedProtocolMessageType('LabelOperation', (_message.Message,), {
  'DESCRIPTOR' : _LABELOPERATION,
  '__module__' : 'google.ads.googleads.v4.services.label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.LabelOperation)
  })
_sym_db.RegisterMessage(LabelOperation)

MutateLabelsResponse = _reflection.GeneratedProtocolMessageType('MutateLabelsResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATELABELSRESPONSE,
  '__module__' : 'google.ads.googleads.v4.services.label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateLabelsResponse)
  })
_sym_db.RegisterMessage(MutateLabelsResponse)

MutateLabelResult = _reflection.GeneratedProtocolMessageType('MutateLabelResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATELABELRESULT,
  '__module__' : 'google.ads.googleads.v4.services.label_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateLabelResult)
  })
_sym_db.RegisterMessage(MutateLabelResult)


DESCRIPTOR._options = None
_GETLABELREQUEST.fields_by_name['resource_name']._options = None
_MUTATELABELSREQUEST.fields_by_name['customer_id']._options = None
_MUTATELABELSREQUEST.fields_by_name['operations']._options = None

_LABELSERVICE = _descriptor.ServiceDescriptor(
  name='LabelService',
  full_name='google.ads.googleads.v4.services.LabelService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=976,
  serialized_end=1400,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetLabel',
    full_name='google.ads.googleads.v4.services.LabelService.GetLabel',
    index=0,
    containing_service=None,
    input_type=_GETLABELREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_label__pb2._LABEL,
    serialized_options=b'\202\323\344\223\002*\022(/v4/{resource_name=customers/*/labels/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateLabels',
    full_name='google.ads.googleads.v4.services.LabelService.MutateLabels',
    index=1,
    containing_service=None,
    input_type=_MUTATELABELSREQUEST,
    output_type=_MUTATELABELSRESPONSE,
    serialized_options=b'\202\323\344\223\0020\"+/v4/customers/{customer_id=*}/labels:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_LABELSERVICE)

DESCRIPTOR.services_by_name['LabelService'] = _LABELSERVICE

# @@protoc_insertion_point(module_scope)
