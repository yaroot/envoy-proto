# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/services/customer_manager_link_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.resources import customer_manager_link_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_customer__manager__link__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/services/customer_manager_link_service.proto',
  package='google.ads.googleads.v4.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v4.servicesB\037CustomerManagerLinkServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4.Services\312\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002$Google::Ads::GoogleAds::V4::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDgoogle/ads/googleads/v4/services/customer_manager_link_service.proto\x12 google.ads.googleads.v4.services\x1a=google/ads/googleads/v4/resources/customer_manager_link.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"l\n\x1dGetCustomerManagerLinkRequest\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,googleads.googleapis.com/CustomerManagerLink\"\x95\x01\n MutateCustomerManagerLinkRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12W\n\noperations\x18\x02 \x03(\x0b\x32>.google.ads.googleads.v4.services.CustomerManagerLinkOperationB\x03\xe0\x41\x02\"y\n\x16MoveManagerLinkRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12+\n\x1eprevious_customer_manager_link\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0bnew_manager\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\xa6\x01\n\x1c\x43ustomerManagerLinkOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12H\n\x06update\x18\x02 \x01(\x0b\x32\x36.google.ads.googleads.v4.resources.CustomerManagerLinkH\x00\x42\x0b\n\toperation\"w\n!MutateCustomerManagerLinkResponse\x12R\n\x07results\x18\x01 \x03(\x0b\x32\x41.google.ads.googleads.v4.services.MutateCustomerManagerLinkResult\"0\n\x17MoveManagerLinkResponse\x12\x15\n\rresource_name\x18\x01 \x01(\t\"8\n\x1fMutateCustomerManagerLinkResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xb5\x06\n\x1a\x43ustomerManagerLinkService\x12\xe1\x01\n\x16GetCustomerManagerLink\x12?.google.ads.googleads.v4.services.GetCustomerManagerLinkRequest\x1a\x36.google.ads.googleads.v4.resources.CustomerManagerLink\"N\x82\xd3\xe4\x93\x02\x38\x12\x36/v4/{resource_name=customers/*/customerManagerLinks/*}\xda\x41\rresource_name\x12\x83\x02\n\x19MutateCustomerManagerLink\x12\x42.google.ads.googleads.v4.services.MutateCustomerManagerLinkRequest\x1a\x43.google.ads.googleads.v4.services.MutateCustomerManagerLinkResponse\"]\x82\xd3\xe4\x93\x02>\"9/v4/customers/{customer_id=*}/customerManagerLinks:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x12\x8f\x02\n\x0fMoveManagerLink\x12\x38.google.ads.googleads.v4.services.MoveManagerLinkRequest\x1a\x39.google.ads.googleads.v4.services.MoveManagerLinkResponse\"\x86\x01\x82\xd3\xe4\x93\x02G\"B/v4/customers/{customer_id=*}/customerManagerLinks:moveManagerLink:\x01*\xda\x41\x36\x63ustomer_id,previous_customer_manager_link,new_manager\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x86\x02\n$com.google.ads.googleads.v4.servicesB\x1f\x43ustomerManagerLinkServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V4.Services\xca\x02 Google\\Ads\\GoogleAds\\V4\\Services\xea\x02$Google::Ads::GoogleAds::V4::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_customer__manager__link__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,])




_GETCUSTOMERMANAGERLINKREQUEST = _descriptor.Descriptor(
  name='GetCustomerManagerLinkRequest',
  full_name='google.ads.googleads.v4.services.GetCustomerManagerLinkRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.GetCustomerManagerLinkRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A.\n,googleads.googleapis.com/CustomerManagerLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=318,
  serialized_end=426,
)


_MUTATECUSTOMERMANAGERLINKREQUEST = _descriptor.Descriptor(
  name='MutateCustomerManagerLinkRequest',
  full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operations', full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkRequest.operations', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=429,
  serialized_end=578,
)


_MOVEMANAGERLINKREQUEST = _descriptor.Descriptor(
  name='MoveManagerLinkRequest',
  full_name='google.ads.googleads.v4.services.MoveManagerLinkRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='google.ads.googleads.v4.services.MoveManagerLinkRequest.customer_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='previous_customer_manager_link', full_name='google.ads.googleads.v4.services.MoveManagerLinkRequest.previous_customer_manager_link', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='new_manager', full_name='google.ads.googleads.v4.services.MoveManagerLinkRequest.new_manager', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=580,
  serialized_end=701,
)


_CUSTOMERMANAGERLINKOPERATION = _descriptor.Descriptor(
  name='CustomerManagerLinkOperation',
  full_name='google.ads.googleads.v4.services.CustomerManagerLinkOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.ads.googleads.v4.services.CustomerManagerLinkOperation.update_mask', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.ads.googleads.v4.services.CustomerManagerLinkOperation.update', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.ads.googleads.v4.services.CustomerManagerLinkOperation.operation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=704,
  serialized_end=870,
)


_MUTATECUSTOMERMANAGERLINKRESPONSE = _descriptor.Descriptor(
  name='MutateCustomerManagerLinkResponse',
  full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='results', full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkResponse.results', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=872,
  serialized_end=991,
)


_MOVEMANAGERLINKRESPONSE = _descriptor.Descriptor(
  name='MoveManagerLinkResponse',
  full_name='google.ads.googleads.v4.services.MoveManagerLinkResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.MoveManagerLinkResponse.resource_name', index=0,
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
  serialized_start=993,
  serialized_end=1041,
)


_MUTATECUSTOMERMANAGERLINKRESULT = _descriptor.Descriptor(
  name='MutateCustomerManagerLinkResult',
  full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.MutateCustomerManagerLinkResult.resource_name', index=0,
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
  serialized_start=1043,
  serialized_end=1099,
)

_MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['operations'].message_type = _CUSTOMERMANAGERLINKOPERATION
_CUSTOMERMANAGERLINKOPERATION.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
_CUSTOMERMANAGERLINKOPERATION.fields_by_name['update'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_customer__manager__link__pb2._CUSTOMERMANAGERLINK
_CUSTOMERMANAGERLINKOPERATION.oneofs_by_name['operation'].fields.append(
  _CUSTOMERMANAGERLINKOPERATION.fields_by_name['update'])
_CUSTOMERMANAGERLINKOPERATION.fields_by_name['update'].containing_oneof = _CUSTOMERMANAGERLINKOPERATION.oneofs_by_name['operation']
_MUTATECUSTOMERMANAGERLINKRESPONSE.fields_by_name['results'].message_type = _MUTATECUSTOMERMANAGERLINKRESULT
DESCRIPTOR.message_types_by_name['GetCustomerManagerLinkRequest'] = _GETCUSTOMERMANAGERLINKREQUEST
DESCRIPTOR.message_types_by_name['MutateCustomerManagerLinkRequest'] = _MUTATECUSTOMERMANAGERLINKREQUEST
DESCRIPTOR.message_types_by_name['MoveManagerLinkRequest'] = _MOVEMANAGERLINKREQUEST
DESCRIPTOR.message_types_by_name['CustomerManagerLinkOperation'] = _CUSTOMERMANAGERLINKOPERATION
DESCRIPTOR.message_types_by_name['MutateCustomerManagerLinkResponse'] = _MUTATECUSTOMERMANAGERLINKRESPONSE
DESCRIPTOR.message_types_by_name['MoveManagerLinkResponse'] = _MOVEMANAGERLINKRESPONSE
DESCRIPTOR.message_types_by_name['MutateCustomerManagerLinkResult'] = _MUTATECUSTOMERMANAGERLINKRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCustomerManagerLinkRequest = _reflection.GeneratedProtocolMessageType('GetCustomerManagerLinkRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCUSTOMERMANAGERLINKREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.GetCustomerManagerLinkRequest)
  })
_sym_db.RegisterMessage(GetCustomerManagerLinkRequest)

MutateCustomerManagerLinkRequest = _reflection.GeneratedProtocolMessageType('MutateCustomerManagerLinkRequest', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECUSTOMERMANAGERLINKREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateCustomerManagerLinkRequest)
  })
_sym_db.RegisterMessage(MutateCustomerManagerLinkRequest)

MoveManagerLinkRequest = _reflection.GeneratedProtocolMessageType('MoveManagerLinkRequest', (_message.Message,), {
  'DESCRIPTOR' : _MOVEMANAGERLINKREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MoveManagerLinkRequest)
  })
_sym_db.RegisterMessage(MoveManagerLinkRequest)

CustomerManagerLinkOperation = _reflection.GeneratedProtocolMessageType('CustomerManagerLinkOperation', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMERMANAGERLINKOPERATION,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.CustomerManagerLinkOperation)
  })
_sym_db.RegisterMessage(CustomerManagerLinkOperation)

MutateCustomerManagerLinkResponse = _reflection.GeneratedProtocolMessageType('MutateCustomerManagerLinkResponse', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECUSTOMERMANAGERLINKRESPONSE,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateCustomerManagerLinkResponse)
  })
_sym_db.RegisterMessage(MutateCustomerManagerLinkResponse)

MoveManagerLinkResponse = _reflection.GeneratedProtocolMessageType('MoveManagerLinkResponse', (_message.Message,), {
  'DESCRIPTOR' : _MOVEMANAGERLINKRESPONSE,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MoveManagerLinkResponse)
  })
_sym_db.RegisterMessage(MoveManagerLinkResponse)

MutateCustomerManagerLinkResult = _reflection.GeneratedProtocolMessageType('MutateCustomerManagerLinkResult', (_message.Message,), {
  'DESCRIPTOR' : _MUTATECUSTOMERMANAGERLINKRESULT,
  '__module__' : 'google.ads.googleads.v4.services.customer_manager_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.MutateCustomerManagerLinkResult)
  })
_sym_db.RegisterMessage(MutateCustomerManagerLinkResult)


DESCRIPTOR._options = None
_GETCUSTOMERMANAGERLINKREQUEST.fields_by_name['resource_name']._options = None
_MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['customer_id']._options = None
_MUTATECUSTOMERMANAGERLINKREQUEST.fields_by_name['operations']._options = None
_MOVEMANAGERLINKREQUEST.fields_by_name['customer_id']._options = None
_MOVEMANAGERLINKREQUEST.fields_by_name['previous_customer_manager_link']._options = None
_MOVEMANAGERLINKREQUEST.fields_by_name['new_manager']._options = None

_CUSTOMERMANAGERLINKSERVICE = _descriptor.ServiceDescriptor(
  name='CustomerManagerLinkService',
  full_name='google.ads.googleads.v4.services.CustomerManagerLinkService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=1102,
  serialized_end=1923,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCustomerManagerLink',
    full_name='google.ads.googleads.v4.services.CustomerManagerLinkService.GetCustomerManagerLink',
    index=0,
    containing_service=None,
    input_type=_GETCUSTOMERMANAGERLINKREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_customer__manager__link__pb2._CUSTOMERMANAGERLINK,
    serialized_options=b'\202\323\344\223\0028\0226/v4/{resource_name=customers/*/customerManagerLinks/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MutateCustomerManagerLink',
    full_name='google.ads.googleads.v4.services.CustomerManagerLinkService.MutateCustomerManagerLink',
    index=1,
    containing_service=None,
    input_type=_MUTATECUSTOMERMANAGERLINKREQUEST,
    output_type=_MUTATECUSTOMERMANAGERLINKRESPONSE,
    serialized_options=b'\202\323\344\223\002>\"9/v4/customers/{customer_id=*}/customerManagerLinks:mutate:\001*\332A\026customer_id,operations',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='MoveManagerLink',
    full_name='google.ads.googleads.v4.services.CustomerManagerLinkService.MoveManagerLink',
    index=2,
    containing_service=None,
    input_type=_MOVEMANAGERLINKREQUEST,
    output_type=_MOVEMANAGERLINKRESPONSE,
    serialized_options=b'\202\323\344\223\002G\"B/v4/customers/{customer_id=*}/customerManagerLinks:moveManagerLink:\001*\332A6customer_id,previous_customer_manager_link,new_manager',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CUSTOMERMANAGERLINKSERVICE)

DESCRIPTOR.services_by_name['CustomerManagerLinkService'] = _CUSTOMERMANAGERLINKSERVICE

# @@protoc_insertion_point(module_scope)
