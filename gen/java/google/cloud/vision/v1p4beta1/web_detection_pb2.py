# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/vision/v1p4beta1/web_detection.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/vision/v1p4beta1/web_detection.proto',
  package='google.cloud.vision.v1p4beta1',
  syntax='proto3',
  serialized_options=b'\n!com.google.cloud.vision.v1p4beta1B\021WebDetectionProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p4beta1;vision\370\001\001\242\002\004GCVN',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/cloud/vision/v1p4beta1/web_detection.proto\x12\x1dgoogle.cloud.vision.v1p4beta1\x1a\x1cgoogle/api/annotations.proto\"\x8c\x07\n\x0cWebDetection\x12K\n\x0cweb_entities\x18\x01 \x03(\x0b\x32\x35.google.cloud.vision.v1p4beta1.WebDetection.WebEntity\x12R\n\x14\x66ull_matching_images\x18\x02 \x03(\x0b\x32\x34.google.cloud.vision.v1p4beta1.WebDetection.WebImage\x12U\n\x17partial_matching_images\x18\x03 \x03(\x0b\x32\x34.google.cloud.vision.v1p4beta1.WebDetection.WebImage\x12W\n\x1apages_with_matching_images\x18\x04 \x03(\x0b\x32\x33.google.cloud.vision.v1p4beta1.WebDetection.WebPage\x12U\n\x17visually_similar_images\x18\x06 \x03(\x0b\x32\x34.google.cloud.vision.v1p4beta1.WebDetection.WebImage\x12O\n\x11\x62\x65st_guess_labels\x18\x08 \x03(\x0b\x32\x34.google.cloud.vision.v1p4beta1.WebDetection.WebLabel\x1a\x42\n\tWebEntity\x12\x11\n\tentity_id\x18\x01 \x01(\t\x12\r\n\x05score\x18\x02 \x01(\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x1a&\n\x08WebImage\x12\x0b\n\x03url\x18\x01 \x01(\t\x12\r\n\x05score\x18\x02 \x01(\x02\x1a\xe4\x01\n\x07WebPage\x12\x0b\n\x03url\x18\x01 \x01(\t\x12\r\n\x05score\x18\x02 \x01(\x02\x12\x12\n\npage_title\x18\x03 \x01(\t\x12R\n\x14\x66ull_matching_images\x18\x04 \x03(\x0b\x32\x34.google.cloud.vision.v1p4beta1.WebDetection.WebImage\x12U\n\x17partial_matching_images\x18\x05 \x03(\x0b\x32\x34.google.cloud.vision.v1p4beta1.WebDetection.WebImage\x1a\x30\n\x08WebLabel\x12\r\n\x05label\x18\x01 \x01(\t\x12\x15\n\rlanguage_code\x18\x02 \x01(\tB\x87\x01\n!com.google.cloud.vision.v1p4beta1B\x11WebDetectionProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p4beta1;vision\xf8\x01\x01\xa2\x02\x04GCVNb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_WEBDETECTION_WEBENTITY = _descriptor.Descriptor(
  name='WebEntity',
  full_name='google.cloud.vision.v1p4beta1.WebDetection.WebEntity',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entity_id', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebEntity.entity_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='score', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebEntity.score', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebEntity.description', index=2,
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
  ],
  serialized_start=636,
  serialized_end=702,
)

_WEBDETECTION_WEBIMAGE = _descriptor.Descriptor(
  name='WebImage',
  full_name='google.cloud.vision.v1p4beta1.WebDetection.WebImage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='url', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebImage.url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='score', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebImage.score', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=704,
  serialized_end=742,
)

_WEBDETECTION_WEBPAGE = _descriptor.Descriptor(
  name='WebPage',
  full_name='google.cloud.vision.v1p4beta1.WebDetection.WebPage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='url', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebPage.url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='score', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebPage.score', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_title', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebPage.page_title', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='full_matching_images', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebPage.full_matching_images', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_matching_images', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebPage.partial_matching_images', index=4,
      number=5, type=11, cpp_type=10, label=3,
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
  serialized_start=745,
  serialized_end=973,
)

_WEBDETECTION_WEBLABEL = _descriptor.Descriptor(
  name='WebLabel',
  full_name='google.cloud.vision.v1p4beta1.WebDetection.WebLabel',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='label', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebLabel.label', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.vision.v1p4beta1.WebDetection.WebLabel.language_code', index=1,
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
  serialized_start=975,
  serialized_end=1023,
)

_WEBDETECTION = _descriptor.Descriptor(
  name='WebDetection',
  full_name='google.cloud.vision.v1p4beta1.WebDetection',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='web_entities', full_name='google.cloud.vision.v1p4beta1.WebDetection.web_entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='full_matching_images', full_name='google.cloud.vision.v1p4beta1.WebDetection.full_matching_images', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partial_matching_images', full_name='google.cloud.vision.v1p4beta1.WebDetection.partial_matching_images', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pages_with_matching_images', full_name='google.cloud.vision.v1p4beta1.WebDetection.pages_with_matching_images', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='visually_similar_images', full_name='google.cloud.vision.v1p4beta1.WebDetection.visually_similar_images', index=4,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='best_guess_labels', full_name='google.cloud.vision.v1p4beta1.WebDetection.best_guess_labels', index=5,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_WEBDETECTION_WEBENTITY, _WEBDETECTION_WEBIMAGE, _WEBDETECTION_WEBPAGE, _WEBDETECTION_WEBLABEL, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=115,
  serialized_end=1023,
)

_WEBDETECTION_WEBENTITY.containing_type = _WEBDETECTION
_WEBDETECTION_WEBIMAGE.containing_type = _WEBDETECTION
_WEBDETECTION_WEBPAGE.fields_by_name['full_matching_images'].message_type = _WEBDETECTION_WEBIMAGE
_WEBDETECTION_WEBPAGE.fields_by_name['partial_matching_images'].message_type = _WEBDETECTION_WEBIMAGE
_WEBDETECTION_WEBPAGE.containing_type = _WEBDETECTION
_WEBDETECTION_WEBLABEL.containing_type = _WEBDETECTION
_WEBDETECTION.fields_by_name['web_entities'].message_type = _WEBDETECTION_WEBENTITY
_WEBDETECTION.fields_by_name['full_matching_images'].message_type = _WEBDETECTION_WEBIMAGE
_WEBDETECTION.fields_by_name['partial_matching_images'].message_type = _WEBDETECTION_WEBIMAGE
_WEBDETECTION.fields_by_name['pages_with_matching_images'].message_type = _WEBDETECTION_WEBPAGE
_WEBDETECTION.fields_by_name['visually_similar_images'].message_type = _WEBDETECTION_WEBIMAGE
_WEBDETECTION.fields_by_name['best_guess_labels'].message_type = _WEBDETECTION_WEBLABEL
DESCRIPTOR.message_types_by_name['WebDetection'] = _WEBDETECTION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

WebDetection = _reflection.GeneratedProtocolMessageType('WebDetection', (_message.Message,), {

  'WebEntity' : _reflection.GeneratedProtocolMessageType('WebEntity', (_message.Message,), {
    'DESCRIPTOR' : _WEBDETECTION_WEBENTITY,
    '__module__' : 'google.cloud.vision.v1p4beta1.web_detection_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.WebDetection.WebEntity)
    })
  ,

  'WebImage' : _reflection.GeneratedProtocolMessageType('WebImage', (_message.Message,), {
    'DESCRIPTOR' : _WEBDETECTION_WEBIMAGE,
    '__module__' : 'google.cloud.vision.v1p4beta1.web_detection_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.WebDetection.WebImage)
    })
  ,

  'WebPage' : _reflection.GeneratedProtocolMessageType('WebPage', (_message.Message,), {
    'DESCRIPTOR' : _WEBDETECTION_WEBPAGE,
    '__module__' : 'google.cloud.vision.v1p4beta1.web_detection_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.WebDetection.WebPage)
    })
  ,

  'WebLabel' : _reflection.GeneratedProtocolMessageType('WebLabel', (_message.Message,), {
    'DESCRIPTOR' : _WEBDETECTION_WEBLABEL,
    '__module__' : 'google.cloud.vision.v1p4beta1.web_detection_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.WebDetection.WebLabel)
    })
  ,
  'DESCRIPTOR' : _WEBDETECTION,
  '__module__' : 'google.cloud.vision.v1p4beta1.web_detection_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.WebDetection)
  })
_sym_db.RegisterMessage(WebDetection)
_sym_db.RegisterMessage(WebDetection.WebEntity)
_sym_db.RegisterMessage(WebDetection.WebImage)
_sym_db.RegisterMessage(WebDetection.WebPage)
_sym_db.RegisterMessage(WebDetection.WebLabel)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
