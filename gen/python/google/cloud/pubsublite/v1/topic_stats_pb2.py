# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/pubsublite/v1/topic_stats.proto
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
from google.cloud.pubsublite.v1 import common_pb2 as google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/pubsublite/v1/topic_stats.proto',
  package='google.cloud.pubsublite.v1',
  syntax='proto3',
  serialized_options=b'\n!com.google.cloud.pubsublite.protoB\017TopicStatsProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/pubsublite/v1;pubsublite\252\002\032Google.Cloud.PubSubLite.V1\312\002\032Google\\Cloud\\PubSubLite\\V1\352\002\035Google::Cloud::PubSubLite::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,google/cloud/pubsublite/v1/topic_stats.proto\x12\x1agoogle.cloud.pubsublite.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\'google/cloud/pubsublite/v1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/api/client.proto\"\xde\x01\n\x1a\x43omputeMessageStatsRequest\x12\x36\n\x05topic\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1fpubsublite.googleapis.com/Topic\x12\x16\n\tpartition\x18\x02 \x01(\x03\x42\x03\xe0\x41\x02\x12\x38\n\x0cstart_cursor\x18\x03 \x01(\x0b\x32\".google.cloud.pubsublite.v1.Cursor\x12\x36\n\nend_cursor\x18\x04 \x01(\x0b\x32\".google.cloud.pubsublite.v1.Cursor\"\xbd\x01\n\x1b\x43omputeMessageStatsResponse\x12\x15\n\rmessage_count\x18\x01 \x01(\x03\x12\x15\n\rmessage_bytes\x18\x02 \x01(\x03\x12\x38\n\x14minimum_publish_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x36\n\x12minimum_event_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"j\n\x18\x43omputeHeadCursorRequest\x12\x36\n\x05topic\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1fpubsublite.googleapis.com/Topic\x12\x16\n\tpartition\x18\x02 \x01(\x03\x42\x03\xe0\x41\x02\"T\n\x19\x43omputeHeadCursorResponse\x12\x37\n\x0bhead_cursor\x18\x01 \x01(\x0b\x32\".google.cloud.pubsublite.v1.Cursor\"\xa7\x01\n\x18\x43omputeTimeCursorRequest\x12\x36\n\x05topic\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1fpubsublite.googleapis.com/Topic\x12\x16\n\tpartition\x18\x02 \x01(\x03\x42\x03\xe0\x41\x02\x12;\n\x06target\x18\x03 \x01(\x0b\x32&.google.cloud.pubsublite.v1.TimeTargetB\x03\xe0\x41\x02\"O\n\x19\x43omputeTimeCursorResponse\x12\x32\n\x06\x63ursor\x18\x01 \x01(\x0b\x32\".google.cloud.pubsublite.v1.Cursor2\xf2\x05\n\x11TopicStatsService\x12\xdd\x01\n\x13\x43omputeMessageStats\x12\x36.google.cloud.pubsublite.v1.ComputeMessageStatsRequest\x1a\x37.google.cloud.pubsublite.v1.ComputeMessageStatsResponse\"U\x82\xd3\xe4\x93\x02O\"J/v1/topicStats/{topic=projects/*/locations/*/topics/*}:computeMessageStats:\x01*\x12\xd5\x01\n\x11\x43omputeHeadCursor\x12\x34.google.cloud.pubsublite.v1.ComputeHeadCursorRequest\x1a\x35.google.cloud.pubsublite.v1.ComputeHeadCursorResponse\"S\x82\xd3\xe4\x93\x02M\"H/v1/topicStats/{topic=projects/*/locations/*/topics/*}:computeHeadCursor:\x01*\x12\xd5\x01\n\x11\x43omputeTimeCursor\x12\x34.google.cloud.pubsublite.v1.ComputeTimeCursorRequest\x1a\x35.google.cloud.pubsublite.v1.ComputeTimeCursorResponse\"S\x82\xd3\xe4\x93\x02M\"H/v1/topicStats/{topic=projects/*/locations/*/topics/*}:computeTimeCursor:\x01*\x1aM\xca\x41\x19pubsublite.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd6\x01\n!com.google.cloud.pubsublite.protoB\x0fTopicStatsProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/pubsublite/v1;pubsublite\xaa\x02\x1aGoogle.Cloud.PubSubLite.V1\xca\x02\x1aGoogle\\Cloud\\PubSubLite\\V1\xea\x02\x1dGoogle::Cloud::PubSubLite::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])




_COMPUTEMESSAGESTATSREQUEST = _descriptor.Descriptor(
  name='ComputeMessageStatsRequest',
  full_name='google.cloud.pubsublite.v1.ComputeMessageStatsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsRequest.topic', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A!\n\037pubsublite.googleapis.com/Topic', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partition', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsRequest.partition', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_cursor', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsRequest.start_cursor', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_cursor', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsRequest.end_cursor', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=266,
  serialized_end=488,
)


_COMPUTEMESSAGESTATSRESPONSE = _descriptor.Descriptor(
  name='ComputeMessageStatsResponse',
  full_name='google.cloud.pubsublite.v1.ComputeMessageStatsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='message_count', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsResponse.message_count', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message_bytes', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsResponse.message_bytes', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='minimum_publish_time', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsResponse.minimum_publish_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='minimum_event_time', full_name='google.cloud.pubsublite.v1.ComputeMessageStatsResponse.minimum_event_time', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=491,
  serialized_end=680,
)


_COMPUTEHEADCURSORREQUEST = _descriptor.Descriptor(
  name='ComputeHeadCursorRequest',
  full_name='google.cloud.pubsublite.v1.ComputeHeadCursorRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='google.cloud.pubsublite.v1.ComputeHeadCursorRequest.topic', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A!\n\037pubsublite.googleapis.com/Topic', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partition', full_name='google.cloud.pubsublite.v1.ComputeHeadCursorRequest.partition', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=682,
  serialized_end=788,
)


_COMPUTEHEADCURSORRESPONSE = _descriptor.Descriptor(
  name='ComputeHeadCursorResponse',
  full_name='google.cloud.pubsublite.v1.ComputeHeadCursorResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='head_cursor', full_name='google.cloud.pubsublite.v1.ComputeHeadCursorResponse.head_cursor', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=790,
  serialized_end=874,
)


_COMPUTETIMECURSORREQUEST = _descriptor.Descriptor(
  name='ComputeTimeCursorRequest',
  full_name='google.cloud.pubsublite.v1.ComputeTimeCursorRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='google.cloud.pubsublite.v1.ComputeTimeCursorRequest.topic', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A!\n\037pubsublite.googleapis.com/Topic', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='partition', full_name='google.cloud.pubsublite.v1.ComputeTimeCursorRequest.partition', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target', full_name='google.cloud.pubsublite.v1.ComputeTimeCursorRequest.target', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=877,
  serialized_end=1044,
)


_COMPUTETIMECURSORRESPONSE = _descriptor.Descriptor(
  name='ComputeTimeCursorResponse',
  full_name='google.cloud.pubsublite.v1.ComputeTimeCursorResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cursor', full_name='google.cloud.pubsublite.v1.ComputeTimeCursorResponse.cursor', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=1046,
  serialized_end=1125,
)

_COMPUTEMESSAGESTATSREQUEST.fields_by_name['start_cursor'].message_type = google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2._CURSOR
_COMPUTEMESSAGESTATSREQUEST.fields_by_name['end_cursor'].message_type = google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2._CURSOR
_COMPUTEMESSAGESTATSRESPONSE.fields_by_name['minimum_publish_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_COMPUTEMESSAGESTATSRESPONSE.fields_by_name['minimum_event_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_COMPUTEHEADCURSORRESPONSE.fields_by_name['head_cursor'].message_type = google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2._CURSOR
_COMPUTETIMECURSORREQUEST.fields_by_name['target'].message_type = google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2._TIMETARGET
_COMPUTETIMECURSORRESPONSE.fields_by_name['cursor'].message_type = google_dot_cloud_dot_pubsublite_dot_v1_dot_common__pb2._CURSOR
DESCRIPTOR.message_types_by_name['ComputeMessageStatsRequest'] = _COMPUTEMESSAGESTATSREQUEST
DESCRIPTOR.message_types_by_name['ComputeMessageStatsResponse'] = _COMPUTEMESSAGESTATSRESPONSE
DESCRIPTOR.message_types_by_name['ComputeHeadCursorRequest'] = _COMPUTEHEADCURSORREQUEST
DESCRIPTOR.message_types_by_name['ComputeHeadCursorResponse'] = _COMPUTEHEADCURSORRESPONSE
DESCRIPTOR.message_types_by_name['ComputeTimeCursorRequest'] = _COMPUTETIMECURSORREQUEST
DESCRIPTOR.message_types_by_name['ComputeTimeCursorResponse'] = _COMPUTETIMECURSORRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ComputeMessageStatsRequest = _reflection.GeneratedProtocolMessageType('ComputeMessageStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTEMESSAGESTATSREQUEST,
  '__module__' : 'google.cloud.pubsublite.v1.topic_stats_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeMessageStatsRequest)
  })
_sym_db.RegisterMessage(ComputeMessageStatsRequest)

ComputeMessageStatsResponse = _reflection.GeneratedProtocolMessageType('ComputeMessageStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTEMESSAGESTATSRESPONSE,
  '__module__' : 'google.cloud.pubsublite.v1.topic_stats_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeMessageStatsResponse)
  })
_sym_db.RegisterMessage(ComputeMessageStatsResponse)

ComputeHeadCursorRequest = _reflection.GeneratedProtocolMessageType('ComputeHeadCursorRequest', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTEHEADCURSORREQUEST,
  '__module__' : 'google.cloud.pubsublite.v1.topic_stats_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeHeadCursorRequest)
  })
_sym_db.RegisterMessage(ComputeHeadCursorRequest)

ComputeHeadCursorResponse = _reflection.GeneratedProtocolMessageType('ComputeHeadCursorResponse', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTEHEADCURSORRESPONSE,
  '__module__' : 'google.cloud.pubsublite.v1.topic_stats_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeHeadCursorResponse)
  })
_sym_db.RegisterMessage(ComputeHeadCursorResponse)

ComputeTimeCursorRequest = _reflection.GeneratedProtocolMessageType('ComputeTimeCursorRequest', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTETIMECURSORREQUEST,
  '__module__' : 'google.cloud.pubsublite.v1.topic_stats_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeTimeCursorRequest)
  })
_sym_db.RegisterMessage(ComputeTimeCursorRequest)

ComputeTimeCursorResponse = _reflection.GeneratedProtocolMessageType('ComputeTimeCursorResponse', (_message.Message,), {
  'DESCRIPTOR' : _COMPUTETIMECURSORRESPONSE,
  '__module__' : 'google.cloud.pubsublite.v1.topic_stats_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.ComputeTimeCursorResponse)
  })
_sym_db.RegisterMessage(ComputeTimeCursorResponse)


DESCRIPTOR._options = None
_COMPUTEMESSAGESTATSREQUEST.fields_by_name['topic']._options = None
_COMPUTEMESSAGESTATSREQUEST.fields_by_name['partition']._options = None
_COMPUTEHEADCURSORREQUEST.fields_by_name['topic']._options = None
_COMPUTEHEADCURSORREQUEST.fields_by_name['partition']._options = None
_COMPUTETIMECURSORREQUEST.fields_by_name['topic']._options = None
_COMPUTETIMECURSORREQUEST.fields_by_name['partition']._options = None
_COMPUTETIMECURSORREQUEST.fields_by_name['target']._options = None

_TOPICSTATSSERVICE = _descriptor.ServiceDescriptor(
  name='TopicStatsService',
  full_name='google.cloud.pubsublite.v1.TopicStatsService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\031pubsublite.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=1128,
  serialized_end=1882,
  methods=[
  _descriptor.MethodDescriptor(
    name='ComputeMessageStats',
    full_name='google.cloud.pubsublite.v1.TopicStatsService.ComputeMessageStats',
    index=0,
    containing_service=None,
    input_type=_COMPUTEMESSAGESTATSREQUEST,
    output_type=_COMPUTEMESSAGESTATSRESPONSE,
    serialized_options=b'\202\323\344\223\002O\"J/v1/topicStats/{topic=projects/*/locations/*/topics/*}:computeMessageStats:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ComputeHeadCursor',
    full_name='google.cloud.pubsublite.v1.TopicStatsService.ComputeHeadCursor',
    index=1,
    containing_service=None,
    input_type=_COMPUTEHEADCURSORREQUEST,
    output_type=_COMPUTEHEADCURSORRESPONSE,
    serialized_options=b'\202\323\344\223\002M\"H/v1/topicStats/{topic=projects/*/locations/*/topics/*}:computeHeadCursor:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ComputeTimeCursor',
    full_name='google.cloud.pubsublite.v1.TopicStatsService.ComputeTimeCursor',
    index=2,
    containing_service=None,
    input_type=_COMPUTETIMECURSORREQUEST,
    output_type=_COMPUTETIMECURSORRESPONSE,
    serialized_options=b'\202\323\344\223\002M\"H/v1/topicStats/{topic=projects/*/locations/*/topics/*}:computeTimeCursor:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_TOPICSTATSSERVICE)

DESCRIPTOR.services_by_name['TopicStatsService'] = _TOPICSTATSSERVICE

# @@protoc_insertion_point(module_scope)
