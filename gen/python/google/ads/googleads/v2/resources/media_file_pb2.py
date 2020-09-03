# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/resources/media_file.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v2.enums import media_type_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_media__type__pb2
from google.ads.googleads.v2.enums import mime_type_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_mime__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/resources/media_file.proto',
  package='google.ads.googleads.v2.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v2.resourcesB\016MediaFileProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v2/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V2.Resources\312\002!Google\\Ads\\GoogleAds\\V2\\Resources\352\002%Google::Ads::GoogleAds::V2::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/ads/googleads/v2/resources/media_file.proto\x12!google.ads.googleads.v2.resources\x1a.google/ads/googleads/v2/enums/media_type.proto\x1a-google/ads/googleads/v2/enums/mime_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xb2\x06\n\tMediaFile\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x05\xfa\x41$\n\"googleads.googleapis.com/MediaFile\x12,\n\x02id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12I\n\x04type\x18\x05 \x01(\x0e\x32\x36.google.ads.googleads.v2.enums.MediaTypeEnum.MediaTypeB\x03\xe0\x41\x05\x12L\n\tmime_type\x18\x06 \x01(\x0e\x32\x34.google.ads.googleads.v2.enums.MimeTypeEnum.MimeTypeB\x03\xe0\x41\x03\x12\x35\n\nsource_url\x18\x07 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12/\n\x04name\x18\x08 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12\x33\n\tfile_size\x18\t \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12\x43\n\x05image\x18\x03 \x01(\x0b\x32-.google.ads.googleads.v2.resources.MediaImageB\x03\xe0\x41\x05H\x00\x12K\n\x0cmedia_bundle\x18\x04 \x01(\x0b\x32..google.ads.googleads.v2.resources.MediaBundleB\x03\xe0\x41\x05H\x00\x12\x43\n\x05\x61udio\x18\n \x01(\x0b\x32-.google.ads.googleads.v2.resources.MediaAudioB\x03\xe0\x41\x03H\x00\x12\x43\n\x05video\x18\x0b \x01(\x0b\x32-.google.ads.googleads.v2.resources.MediaVideoB\x03\xe0\x41\x05H\x00:U\xea\x41R\n\"googleads.googleapis.com/MediaFile\x12,customers/{customer}/mediaFiles/{media_file}B\x0b\n\tmediatype\"<\n\nMediaImage\x12.\n\x04\x64\x61ta\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.BytesValueB\x03\xe0\x41\x05\"=\n\x0bMediaBundle\x12.\n\x04\x64\x61ta\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.BytesValueB\x03\xe0\x41\x05\"J\n\nMediaAudio\x12<\n\x12\x61\x64_duration_millis\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\"\xfd\x01\n\nMediaVideo\x12<\n\x12\x61\x64_duration_millis\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12;\n\x10youtube_video_id\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12>\n\x13\x61\x64vertising_id_code\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12\x34\n\tisci_code\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x42\xfb\x01\n%com.google.ads.googleads.v2.resourcesB\x0eMediaFileProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v2/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V2.Resources\xca\x02!Google\\Ads\\GoogleAds\\V2\\Resources\xea\x02%Google::Ads::GoogleAds::V2::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_media__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_mime__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_MEDIAFILE = _descriptor.Descriptor(
  name='MediaFile',
  full_name='google.ads.googleads.v2.resources.MediaFile',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.resources.MediaFile.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A$\n\"googleads.googleapis.com/MediaFile', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v2.resources.MediaFile.id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v2.resources.MediaFile.type', index=2,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mime_type', full_name='google.ads.googleads.v2.resources.MediaFile.mime_type', index=3,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_url', full_name='google.ads.googleads.v2.resources.MediaFile.source_url', index=4,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v2.resources.MediaFile.name', index=5,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='file_size', full_name='google.ads.googleads.v2.resources.MediaFile.file_size', index=6,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image', full_name='google.ads.googleads.v2.resources.MediaFile.image', index=7,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='media_bundle', full_name='google.ads.googleads.v2.resources.MediaFile.media_bundle', index=8,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='audio', full_name='google.ads.googleads.v2.resources.MediaFile.audio', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='video', full_name='google.ads.googleads.v2.resources.MediaFile.video', index=10,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AR\n\"googleads.googleapis.com/MediaFile\022,customers/{customer}/mediaFiles/{media_file}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='mediatype', full_name='google.ads.googleads.v2.resources.MediaFile.mediatype',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=307,
  serialized_end=1125,
)


_MEDIAIMAGE = _descriptor.Descriptor(
  name='MediaImage',
  full_name='google.ads.googleads.v2.resources.MediaImage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='google.ads.googleads.v2.resources.MediaImage.data', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1127,
  serialized_end=1187,
)


_MEDIABUNDLE = _descriptor.Descriptor(
  name='MediaBundle',
  full_name='google.ads.googleads.v2.resources.MediaBundle',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='google.ads.googleads.v2.resources.MediaBundle.data', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1189,
  serialized_end=1250,
)


_MEDIAAUDIO = _descriptor.Descriptor(
  name='MediaAudio',
  full_name='google.ads.googleads.v2.resources.MediaAudio',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='ad_duration_millis', full_name='google.ads.googleads.v2.resources.MediaAudio.ad_duration_millis', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1252,
  serialized_end=1326,
)


_MEDIAVIDEO = _descriptor.Descriptor(
  name='MediaVideo',
  full_name='google.ads.googleads.v2.resources.MediaVideo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='ad_duration_millis', full_name='google.ads.googleads.v2.resources.MediaVideo.ad_duration_millis', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='youtube_video_id', full_name='google.ads.googleads.v2.resources.MediaVideo.youtube_video_id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='advertising_id_code', full_name='google.ads.googleads.v2.resources.MediaVideo.advertising_id_code', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='isci_code', full_name='google.ads.googleads.v2.resources.MediaVideo.isci_code', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1329,
  serialized_end=1582,
)

_MEDIAFILE.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_MEDIAFILE.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_media__type__pb2._MEDIATYPEENUM_MEDIATYPE
_MEDIAFILE.fields_by_name['mime_type'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_mime__type__pb2._MIMETYPEENUM_MIMETYPE
_MEDIAFILE.fields_by_name['source_url'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_MEDIAFILE.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_MEDIAFILE.fields_by_name['file_size'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_MEDIAFILE.fields_by_name['image'].message_type = _MEDIAIMAGE
_MEDIAFILE.fields_by_name['media_bundle'].message_type = _MEDIABUNDLE
_MEDIAFILE.fields_by_name['audio'].message_type = _MEDIAAUDIO
_MEDIAFILE.fields_by_name['video'].message_type = _MEDIAVIDEO
_MEDIAFILE.oneofs_by_name['mediatype'].fields.append(
  _MEDIAFILE.fields_by_name['image'])
_MEDIAFILE.fields_by_name['image'].containing_oneof = _MEDIAFILE.oneofs_by_name['mediatype']
_MEDIAFILE.oneofs_by_name['mediatype'].fields.append(
  _MEDIAFILE.fields_by_name['media_bundle'])
_MEDIAFILE.fields_by_name['media_bundle'].containing_oneof = _MEDIAFILE.oneofs_by_name['mediatype']
_MEDIAFILE.oneofs_by_name['mediatype'].fields.append(
  _MEDIAFILE.fields_by_name['audio'])
_MEDIAFILE.fields_by_name['audio'].containing_oneof = _MEDIAFILE.oneofs_by_name['mediatype']
_MEDIAFILE.oneofs_by_name['mediatype'].fields.append(
  _MEDIAFILE.fields_by_name['video'])
_MEDIAFILE.fields_by_name['video'].containing_oneof = _MEDIAFILE.oneofs_by_name['mediatype']
_MEDIAIMAGE.fields_by_name['data'].message_type = google_dot_protobuf_dot_wrappers__pb2._BYTESVALUE
_MEDIABUNDLE.fields_by_name['data'].message_type = google_dot_protobuf_dot_wrappers__pb2._BYTESVALUE
_MEDIAAUDIO.fields_by_name['ad_duration_millis'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_MEDIAVIDEO.fields_by_name['ad_duration_millis'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_MEDIAVIDEO.fields_by_name['youtube_video_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_MEDIAVIDEO.fields_by_name['advertising_id_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_MEDIAVIDEO.fields_by_name['isci_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
DESCRIPTOR.message_types_by_name['MediaFile'] = _MEDIAFILE
DESCRIPTOR.message_types_by_name['MediaImage'] = _MEDIAIMAGE
DESCRIPTOR.message_types_by_name['MediaBundle'] = _MEDIABUNDLE
DESCRIPTOR.message_types_by_name['MediaAudio'] = _MEDIAAUDIO
DESCRIPTOR.message_types_by_name['MediaVideo'] = _MEDIAVIDEO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MediaFile = _reflection.GeneratedProtocolMessageType('MediaFile', (_message.Message,), {
  'DESCRIPTOR' : _MEDIAFILE,
  '__module__' : 'google.ads.googleads.v2.resources.media_file_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.MediaFile)
  })
_sym_db.RegisterMessage(MediaFile)

MediaImage = _reflection.GeneratedProtocolMessageType('MediaImage', (_message.Message,), {
  'DESCRIPTOR' : _MEDIAIMAGE,
  '__module__' : 'google.ads.googleads.v2.resources.media_file_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.MediaImage)
  })
_sym_db.RegisterMessage(MediaImage)

MediaBundle = _reflection.GeneratedProtocolMessageType('MediaBundle', (_message.Message,), {
  'DESCRIPTOR' : _MEDIABUNDLE,
  '__module__' : 'google.ads.googleads.v2.resources.media_file_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.MediaBundle)
  })
_sym_db.RegisterMessage(MediaBundle)

MediaAudio = _reflection.GeneratedProtocolMessageType('MediaAudio', (_message.Message,), {
  'DESCRIPTOR' : _MEDIAAUDIO,
  '__module__' : 'google.ads.googleads.v2.resources.media_file_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.MediaAudio)
  })
_sym_db.RegisterMessage(MediaAudio)

MediaVideo = _reflection.GeneratedProtocolMessageType('MediaVideo', (_message.Message,), {
  'DESCRIPTOR' : _MEDIAVIDEO,
  '__module__' : 'google.ads.googleads.v2.resources.media_file_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.MediaVideo)
  })
_sym_db.RegisterMessage(MediaVideo)


DESCRIPTOR._options = None
_MEDIAFILE.fields_by_name['resource_name']._options = None
_MEDIAFILE.fields_by_name['id']._options = None
_MEDIAFILE.fields_by_name['type']._options = None
_MEDIAFILE.fields_by_name['mime_type']._options = None
_MEDIAFILE.fields_by_name['source_url']._options = None
_MEDIAFILE.fields_by_name['name']._options = None
_MEDIAFILE.fields_by_name['file_size']._options = None
_MEDIAFILE.fields_by_name['image']._options = None
_MEDIAFILE.fields_by_name['media_bundle']._options = None
_MEDIAFILE.fields_by_name['audio']._options = None
_MEDIAFILE.fields_by_name['video']._options = None
_MEDIAFILE._options = None
_MEDIAIMAGE.fields_by_name['data']._options = None
_MEDIABUNDLE.fields_by_name['data']._options = None
_MEDIAAUDIO.fields_by_name['ad_duration_millis']._options = None
_MEDIAVIDEO.fields_by_name['ad_duration_millis']._options = None
_MEDIAVIDEO.fields_by_name['youtube_video_id']._options = None
_MEDIAVIDEO.fields_by_name['advertising_id_code']._options = None
_MEDIAVIDEO.fields_by_name['isci_code']._options = None
# @@protoc_insertion_point(module_scope)
