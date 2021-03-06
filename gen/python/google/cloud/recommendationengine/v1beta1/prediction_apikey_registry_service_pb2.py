# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.recommendationengine.v1beta1 import recommendationengine_resources_pb2 as google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_recommendationengine__resources__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto',
  package='google.cloud.recommendationengine.v1beta1',
  syntax='proto3',
  serialized_options=b'\n-com.google.cloud.recommendationengine.v1beta1P\001Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\242\002\005RECAI\252\002)Google.Cloud.RecommendationEngine.V1Beta1\312\002)Google\\Cloud\\RecommendationEngine\\V1beta1\352\002,Google::Cloud::RecommendationEngine::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nRgoogle/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto\x12)google.cloud.recommendationengine.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x17google/api/client.proto\x1aNgoogle/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto\"/\n\x1cPredictionApiKeyRegistration\x12\x0f\n\x07\x61pi_key\x18\x01 \x01(\t\"\xea\x01\n)CreatePredictionApiKeyRegistrationRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.recommendationengine.googleapis.com/EventStore\x12u\n\x1fprediction_api_key_registration\x18\x02 \x01(\x0b\x32G.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistrationB\x03\xe0\x41\x02\"\xa3\x01\n(ListPredictionApiKeyRegistrationsRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.recommendationengine.googleapis.com/EventStore\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"\xb7\x01\n)ListPredictionApiKeyRegistrationsResponse\x12q\n prediction_api_key_registrations\x18\x01 \x03(\x0b\x32G.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x83\x01\n)DeletePredictionApiKeyRegistrationRequest\x12V\n\x04name\x18\x01 \x01(\tBH\xe0\x41\x02\xfa\x41\x42\n@recommendationengine.googleapis.com/PredictionApiKeyRegistration2\x97\x08\n\x18PredictionApiKeyRegistry\x12\xd9\x02\n\"CreatePredictionApiKeyRegistration\x12T.google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest\x1aG.google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration\"\x93\x01\x82\xd3\xe4\x93\x02\x64\"_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations:\x01*\xda\x41&parent,prediction_api_key_registration\x12\xc0\x02\n!ListPredictionApiKeyRegistrations\x12S.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest\x1aT.google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse\"p\x82\xd3\xe4\x93\x02\x61\x12_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations\xda\x41\x06parent\x12\x82\x02\n\"DeletePredictionApiKeyRegistration\x12T.google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest\x1a\x16.google.protobuf.Empty\"n\x82\xd3\xe4\x93\x02\x61*_/v1beta1/{name=projects/*/locations/*/catalogs/*/eventStores/*/predictionApiKeyRegistrations/*}\xda\x41\x04name\x1aW\xca\x41#recommendationengine.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x9f\x02\n-com.google.cloud.recommendationengine.v1beta1P\x01Z]google.golang.org/genproto/googleapis/cloud/recommendationengine/v1beta1;recommendationengine\xa2\x02\x05RECAI\xaa\x02)Google.Cloud.RecommendationEngine.V1Beta1\xca\x02)Google\\Cloud\\RecommendationEngine\\V1beta1\xea\x02,Google::Cloud::RecommendationEngine::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_cloud_dot_recommendationengine_dot_v1beta1_dot_recommendationengine__resources__pb2.DESCRIPTOR,])




_PREDICTIONAPIKEYREGISTRATION = _descriptor.Descriptor(
  name='PredictionApiKeyRegistration',
  full_name='google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='api_key', full_name='google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration.api_key', index=0,
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
  serialized_start=353,
  serialized_end=400,
)


_CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST = _descriptor.Descriptor(
  name='CreatePredictionApiKeyRegistrationRequest',
  full_name='google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A0\n.recommendationengine.googleapis.com/EventStore', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='prediction_api_key_registration', full_name='google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest.prediction_api_key_registration', index=1,
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
  serialized_start=403,
  serialized_end=637,
)


_LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST = _descriptor.Descriptor(
  name='ListPredictionApiKeyRegistrationsRequest',
  full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A0\n.recommendationengine.googleapis.com/EventStore', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest.page_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest.page_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=640,
  serialized_end=803,
)


_LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE = _descriptor.Descriptor(
  name='ListPredictionApiKeyRegistrationsResponse',
  full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='prediction_api_key_registrations', full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse.prediction_api_key_registrations', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse.next_page_token', index=1,
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
  serialized_start=806,
  serialized_end=989,
)


_DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST = _descriptor.Descriptor(
  name='DeletePredictionApiKeyRegistrationRequest',
  full_name='google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372AB\n@recommendationengine.googleapis.com/PredictionApiKeyRegistration', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=992,
  serialized_end=1123,
)

_CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['prediction_api_key_registration'].message_type = _PREDICTIONAPIKEYREGISTRATION
_LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE.fields_by_name['prediction_api_key_registrations'].message_type = _PREDICTIONAPIKEYREGISTRATION
DESCRIPTOR.message_types_by_name['PredictionApiKeyRegistration'] = _PREDICTIONAPIKEYREGISTRATION
DESCRIPTOR.message_types_by_name['CreatePredictionApiKeyRegistrationRequest'] = _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST
DESCRIPTOR.message_types_by_name['ListPredictionApiKeyRegistrationsRequest'] = _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST
DESCRIPTOR.message_types_by_name['ListPredictionApiKeyRegistrationsResponse'] = _LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE
DESCRIPTOR.message_types_by_name['DeletePredictionApiKeyRegistrationRequest'] = _DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PredictionApiKeyRegistration = _reflection.GeneratedProtocolMessageType('PredictionApiKeyRegistration', (_message.Message,), {
  'DESCRIPTOR' : _PREDICTIONAPIKEYREGISTRATION,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.prediction_apikey_registry_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistration)
  })
_sym_db.RegisterMessage(PredictionApiKeyRegistration)

CreatePredictionApiKeyRegistrationRequest = _reflection.GeneratedProtocolMessageType('CreatePredictionApiKeyRegistrationRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.prediction_apikey_registry_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.CreatePredictionApiKeyRegistrationRequest)
  })
_sym_db.RegisterMessage(CreatePredictionApiKeyRegistrationRequest)

ListPredictionApiKeyRegistrationsRequest = _reflection.GeneratedProtocolMessageType('ListPredictionApiKeyRegistrationsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.prediction_apikey_registry_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsRequest)
  })
_sym_db.RegisterMessage(ListPredictionApiKeyRegistrationsRequest)

ListPredictionApiKeyRegistrationsResponse = _reflection.GeneratedProtocolMessageType('ListPredictionApiKeyRegistrationsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.prediction_apikey_registry_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ListPredictionApiKeyRegistrationsResponse)
  })
_sym_db.RegisterMessage(ListPredictionApiKeyRegistrationsResponse)

DeletePredictionApiKeyRegistrationRequest = _reflection.GeneratedProtocolMessageType('DeletePredictionApiKeyRegistrationRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST,
  '__module__' : 'google.cloud.recommendationengine.v1beta1.prediction_apikey_registry_service_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.DeletePredictionApiKeyRegistrationRequest)
  })
_sym_db.RegisterMessage(DeletePredictionApiKeyRegistrationRequest)


DESCRIPTOR._options = None
_CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['parent']._options = None
_CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['prediction_api_key_registration']._options = None
_LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['parent']._options = None
_LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['page_size']._options = None
_LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST.fields_by_name['page_token']._options = None
_DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST.fields_by_name['name']._options = None

_PREDICTIONAPIKEYREGISTRY = _descriptor.ServiceDescriptor(
  name='PredictionApiKeyRegistry',
  full_name='google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A#recommendationengine.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=1126,
  serialized_end=2173,
  methods=[
  _descriptor.MethodDescriptor(
    name='CreatePredictionApiKeyRegistration',
    full_name='google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry.CreatePredictionApiKeyRegistration',
    index=0,
    containing_service=None,
    input_type=_CREATEPREDICTIONAPIKEYREGISTRATIONREQUEST,
    output_type=_PREDICTIONAPIKEYREGISTRATION,
    serialized_options=b'\202\323\344\223\002d\"_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations:\001*\332A&parent,prediction_api_key_registration',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListPredictionApiKeyRegistrations',
    full_name='google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry.ListPredictionApiKeyRegistrations',
    index=1,
    containing_service=None,
    input_type=_LISTPREDICTIONAPIKEYREGISTRATIONSREQUEST,
    output_type=_LISTPREDICTIONAPIKEYREGISTRATIONSRESPONSE,
    serialized_options=b'\202\323\344\223\002a\022_/v1beta1/{parent=projects/*/locations/*/catalogs/*/eventStores/*}/predictionApiKeyRegistrations\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeletePredictionApiKeyRegistration',
    full_name='google.cloud.recommendationengine.v1beta1.PredictionApiKeyRegistry.DeletePredictionApiKeyRegistration',
    index=2,
    containing_service=None,
    input_type=_DELETEPREDICTIONAPIKEYREGISTRATIONREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002a*_/v1beta1/{name=projects/*/locations/*/catalogs/*/eventStores/*/predictionApiKeyRegistrations/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_PREDICTIONAPIKEYREGISTRY)

DESCRIPTOR.services_by_name['PredictionApiKeyRegistry'] = _PREDICTIONAPIKEYREGISTRY

# @@protoc_insertion_point(module_scope)
