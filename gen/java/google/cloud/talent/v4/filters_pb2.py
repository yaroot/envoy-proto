# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4/filters.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.talent.v4 import common_pb2 as google_dot_cloud_dot_talent_dot_v4_dot_common__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2
from google.type import timeofday_pb2 as google_dot_type_dot_timeofday__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/talent/v4/filters.proto',
  package='google.cloud.talent.v4',
  syntax='proto3',
  serialized_options=b'\n\032com.google.cloud.talent.v4B\014FiltersProtoP\001Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\242\002\003CTS',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$google/cloud/talent/v4/filters.proto\x12\x16google.cloud.talent.v4\x1a\x1fgoogle/api/field_behavior.proto\x1a#google/cloud/talent/v4/common.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x18google/type/latlng.proto\x1a\x1bgoogle/type/timeofday.proto\x1a\x1cgoogle/api/annotations.proto\"\xe2\x04\n\x08JobQuery\x12\r\n\x05query\x18\x01 \x01(\t\x12\x1b\n\x13query_language_code\x18\x0e \x01(\t\x12\x11\n\tcompanies\x18\x02 \x03(\t\x12@\n\x10location_filters\x18\x03 \x03(\x0b\x32&.google.cloud.talent.v4.LocationFilter\x12;\n\x0ejob_categories\x18\x04 \x03(\x0e\x32#.google.cloud.talent.v4.JobCategory\x12=\n\x0e\x63ommute_filter\x18\x05 \x01(\x0b\x32%.google.cloud.talent.v4.CommuteFilter\x12\x1d\n\x15\x63ompany_display_names\x18\x06 \x03(\t\x12G\n\x13\x63ompensation_filter\x18\x07 \x01(\x0b\x32*.google.cloud.talent.v4.CompensationFilter\x12\x1f\n\x17\x63ustom_attribute_filter\x18\x08 \x01(\t\x12\x1b\n\x13\x64isable_spell_check\x18\t \x01(\x08\x12@\n\x10\x65mployment_types\x18\n \x03(\x0e\x32&.google.cloud.talent.v4.EmploymentType\x12\x16\n\x0elanguage_codes\x18\x0b \x03(\t\x12\x42\n\x12publish_time_range\x18\x0c \x01(\x0b\x32&.google.cloud.talent.v4.TimestampRange\x12\x15\n\rexcluded_jobs\x18\r \x03(\t\"\xc9\x02\n\x0eLocationFilter\x12\x0f\n\x07\x61\x64\x64ress\x18\x01 \x01(\t\x12\x13\n\x0bregion_code\x18\x02 \x01(\t\x12$\n\x07lat_lng\x18\x03 \x01(\x0b\x32\x13.google.type.LatLng\x12\x19\n\x11\x64istance_in_miles\x18\x04 \x01(\x01\x12\\\n\x16telecommute_preference\x18\x05 \x01(\x0e\x32<.google.cloud.talent.v4.LocationFilter.TelecommutePreference\"r\n\x15TelecommutePreference\x12&\n\"TELECOMMUTE_PREFERENCE_UNSPECIFIED\x10\x00\x12\x18\n\x14TELECOMMUTE_EXCLUDED\x10\x01\x12\x17\n\x13TELECOMMUTE_ALLOWED\x10\x02\"\xbb\x03\n\x12\x43ompensationFilter\x12H\n\x04type\x18\x01 \x01(\x0e\x32\x35.google.cloud.talent.v4.CompensationFilter.FilterTypeB\x03\xe0\x41\x02\x12M\n\x05units\x18\x02 \x03(\x0e\x32\x39.google.cloud.talent.v4.CompensationInfo.CompensationUnitB\x03\xe0\x41\x02\x12I\n\x05range\x18\x03 \x01(\x0b\x32:.google.cloud.talent.v4.CompensationInfo.CompensationRange\x12\x38\n0include_jobs_with_unspecified_compensation_range\x18\x04 \x01(\x08\"\x86\x01\n\nFilterType\x12\x1b\n\x17\x46ILTER_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tUNIT_ONLY\x10\x01\x12\x13\n\x0fUNIT_AND_AMOUNT\x10\x02\x12\x1a\n\x16\x41NNUALIZED_BASE_AMOUNT\x10\x03\x12\x1b\n\x17\x41NNUALIZED_TOTAL_AMOUNT\x10\x04\"\xc1\x03\n\rCommuteFilter\x12\x42\n\x0e\x63ommute_method\x18\x01 \x01(\x0e\x32%.google.cloud.talent.v4.CommuteMethodB\x03\xe0\x41\x02\x12\x33\n\x11start_coordinates\x18\x02 \x01(\x0b\x32\x13.google.type.LatLngB\x03\xe0\x41\x02\x12\x37\n\x0ftravel_duration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x02\x12!\n\x19\x61llow_imprecise_addresses\x18\x04 \x01(\x08\x12I\n\x0croad_traffic\x18\x05 \x01(\x0e\x32\x31.google.cloud.talent.v4.CommuteFilter.RoadTrafficH\x00\x12\x30\n\x0e\x64\x65parture_time\x18\x06 \x01(\x0b\x32\x16.google.type.TimeOfDayH\x00\"L\n\x0bRoadTraffic\x12\x1c\n\x18ROAD_TRAFFIC_UNSPECIFIED\x10\x00\x12\x10\n\x0cTRAFFIC_FREE\x10\x01\x12\r\n\tBUSY_HOUR\x10\x02\x42\x10\n\x0etraffic_optionBp\n\x1a\x63om.google.cloud.talent.v4B\x0c\x46iltersProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\xa2\x02\x03\x43TSb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_cloud_dot_talent_dot_v4_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_type_dot_latlng__pb2.DESCRIPTOR,google_dot_type_dot_timeofday__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_LOCATIONFILTER_TELECOMMUTEPREFERENCE = _descriptor.EnumDescriptor(
  name='TelecommutePreference',
  full_name='google.cloud.talent.v4.LocationFilter.TelecommutePreference',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TELECOMMUTE_PREFERENCE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TELECOMMUTE_EXCLUDED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TELECOMMUTE_ALLOWED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1080,
  serialized_end=1194,
)
_sym_db.RegisterEnumDescriptor(_LOCATIONFILTER_TELECOMMUTEPREFERENCE)

_COMPENSATIONFILTER_FILTERTYPE = _descriptor.EnumDescriptor(
  name='FilterType',
  full_name='google.cloud.talent.v4.CompensationFilter.FilterType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='FILTER_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNIT_ONLY', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNIT_AND_AMOUNT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ANNUALIZED_BASE_AMOUNT', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ANNUALIZED_TOTAL_AMOUNT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1506,
  serialized_end=1640,
)
_sym_db.RegisterEnumDescriptor(_COMPENSATIONFILTER_FILTERTYPE)

_COMMUTEFILTER_ROADTRAFFIC = _descriptor.EnumDescriptor(
  name='RoadTraffic',
  full_name='google.cloud.talent.v4.CommuteFilter.RoadTraffic',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ROAD_TRAFFIC_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRAFFIC_FREE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BUSY_HOUR', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1998,
  serialized_end=2074,
)
_sym_db.RegisterEnumDescriptor(_COMMUTEFILTER_ROADTRAFFIC)


_JOBQUERY = _descriptor.Descriptor(
  name='JobQuery',
  full_name='google.cloud.talent.v4.JobQuery',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='query', full_name='google.cloud.talent.v4.JobQuery.query', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='query_language_code', full_name='google.cloud.talent.v4.JobQuery.query_language_code', index=1,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='companies', full_name='google.cloud.talent.v4.JobQuery.companies', index=2,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location_filters', full_name='google.cloud.talent.v4.JobQuery.location_filters', index=3,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_categories', full_name='google.cloud.talent.v4.JobQuery.job_categories', index=4,
      number=4, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='commute_filter', full_name='google.cloud.talent.v4.JobQuery.commute_filter', index=5,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='company_display_names', full_name='google.cloud.talent.v4.JobQuery.company_display_names', index=6,
      number=6, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='compensation_filter', full_name='google.cloud.talent.v4.JobQuery.compensation_filter', index=7,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='custom_attribute_filter', full_name='google.cloud.talent.v4.JobQuery.custom_attribute_filter', index=8,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='disable_spell_check', full_name='google.cloud.talent.v4.JobQuery.disable_spell_check', index=9,
      number=9, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='employment_types', full_name='google.cloud.talent.v4.JobQuery.employment_types', index=10,
      number=10, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_codes', full_name='google.cloud.talent.v4.JobQuery.language_codes', index=11,
      number=11, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='publish_time_range', full_name='google.cloud.talent.v4.JobQuery.publish_time_range', index=12,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='excluded_jobs', full_name='google.cloud.talent.v4.JobQuery.excluded_jobs', index=13,
      number=13, type=9, cpp_type=9, label=3,
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
  serialized_start=252,
  serialized_end=862,
)


_LOCATIONFILTER = _descriptor.Descriptor(
  name='LocationFilter',
  full_name='google.cloud.talent.v4.LocationFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='address', full_name='google.cloud.talent.v4.LocationFilter.address', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='region_code', full_name='google.cloud.talent.v4.LocationFilter.region_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lat_lng', full_name='google.cloud.talent.v4.LocationFilter.lat_lng', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='distance_in_miles', full_name='google.cloud.talent.v4.LocationFilter.distance_in_miles', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='telecommute_preference', full_name='google.cloud.talent.v4.LocationFilter.telecommute_preference', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _LOCATIONFILTER_TELECOMMUTEPREFERENCE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=865,
  serialized_end=1194,
)


_COMPENSATIONFILTER = _descriptor.Descriptor(
  name='CompensationFilter',
  full_name='google.cloud.talent.v4.CompensationFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.talent.v4.CompensationFilter.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='units', full_name='google.cloud.talent.v4.CompensationFilter.units', index=1,
      number=2, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='range', full_name='google.cloud.talent.v4.CompensationFilter.range', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='include_jobs_with_unspecified_compensation_range', full_name='google.cloud.talent.v4.CompensationFilter.include_jobs_with_unspecified_compensation_range', index=3,
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
    _COMPENSATIONFILTER_FILTERTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1197,
  serialized_end=1640,
)


_COMMUTEFILTER = _descriptor.Descriptor(
  name='CommuteFilter',
  full_name='google.cloud.talent.v4.CommuteFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='commute_method', full_name='google.cloud.talent.v4.CommuteFilter.commute_method', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_coordinates', full_name='google.cloud.talent.v4.CommuteFilter.start_coordinates', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='travel_duration', full_name='google.cloud.talent.v4.CommuteFilter.travel_duration', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allow_imprecise_addresses', full_name='google.cloud.talent.v4.CommuteFilter.allow_imprecise_addresses', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='road_traffic', full_name='google.cloud.talent.v4.CommuteFilter.road_traffic', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='departure_time', full_name='google.cloud.talent.v4.CommuteFilter.departure_time', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _COMMUTEFILTER_ROADTRAFFIC,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='traffic_option', full_name='google.cloud.talent.v4.CommuteFilter.traffic_option',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1643,
  serialized_end=2092,
)

_JOBQUERY.fields_by_name['location_filters'].message_type = _LOCATIONFILTER
_JOBQUERY.fields_by_name['job_categories'].enum_type = google_dot_cloud_dot_talent_dot_v4_dot_common__pb2._JOBCATEGORY
_JOBQUERY.fields_by_name['commute_filter'].message_type = _COMMUTEFILTER
_JOBQUERY.fields_by_name['compensation_filter'].message_type = _COMPENSATIONFILTER
_JOBQUERY.fields_by_name['employment_types'].enum_type = google_dot_cloud_dot_talent_dot_v4_dot_common__pb2._EMPLOYMENTTYPE
_JOBQUERY.fields_by_name['publish_time_range'].message_type = google_dot_cloud_dot_talent_dot_v4_dot_common__pb2._TIMESTAMPRANGE
_LOCATIONFILTER.fields_by_name['lat_lng'].message_type = google_dot_type_dot_latlng__pb2._LATLNG
_LOCATIONFILTER.fields_by_name['telecommute_preference'].enum_type = _LOCATIONFILTER_TELECOMMUTEPREFERENCE
_LOCATIONFILTER_TELECOMMUTEPREFERENCE.containing_type = _LOCATIONFILTER
_COMPENSATIONFILTER.fields_by_name['type'].enum_type = _COMPENSATIONFILTER_FILTERTYPE
_COMPENSATIONFILTER.fields_by_name['units'].enum_type = google_dot_cloud_dot_talent_dot_v4_dot_common__pb2._COMPENSATIONINFO_COMPENSATIONUNIT
_COMPENSATIONFILTER.fields_by_name['range'].message_type = google_dot_cloud_dot_talent_dot_v4_dot_common__pb2._COMPENSATIONINFO_COMPENSATIONRANGE
_COMPENSATIONFILTER_FILTERTYPE.containing_type = _COMPENSATIONFILTER
_COMMUTEFILTER.fields_by_name['commute_method'].enum_type = google_dot_cloud_dot_talent_dot_v4_dot_common__pb2._COMMUTEMETHOD
_COMMUTEFILTER.fields_by_name['start_coordinates'].message_type = google_dot_type_dot_latlng__pb2._LATLNG
_COMMUTEFILTER.fields_by_name['travel_duration'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_COMMUTEFILTER.fields_by_name['road_traffic'].enum_type = _COMMUTEFILTER_ROADTRAFFIC
_COMMUTEFILTER.fields_by_name['departure_time'].message_type = google_dot_type_dot_timeofday__pb2._TIMEOFDAY
_COMMUTEFILTER_ROADTRAFFIC.containing_type = _COMMUTEFILTER
_COMMUTEFILTER.oneofs_by_name['traffic_option'].fields.append(
  _COMMUTEFILTER.fields_by_name['road_traffic'])
_COMMUTEFILTER.fields_by_name['road_traffic'].containing_oneof = _COMMUTEFILTER.oneofs_by_name['traffic_option']
_COMMUTEFILTER.oneofs_by_name['traffic_option'].fields.append(
  _COMMUTEFILTER.fields_by_name['departure_time'])
_COMMUTEFILTER.fields_by_name['departure_time'].containing_oneof = _COMMUTEFILTER.oneofs_by_name['traffic_option']
DESCRIPTOR.message_types_by_name['JobQuery'] = _JOBQUERY
DESCRIPTOR.message_types_by_name['LocationFilter'] = _LOCATIONFILTER
DESCRIPTOR.message_types_by_name['CompensationFilter'] = _COMPENSATIONFILTER
DESCRIPTOR.message_types_by_name['CommuteFilter'] = _COMMUTEFILTER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

JobQuery = _reflection.GeneratedProtocolMessageType('JobQuery', (_message.Message,), {
  'DESCRIPTOR' : _JOBQUERY,
  '__module__' : 'google.cloud.talent.v4.filters_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4.JobQuery)
  })
_sym_db.RegisterMessage(JobQuery)

LocationFilter = _reflection.GeneratedProtocolMessageType('LocationFilter', (_message.Message,), {
  'DESCRIPTOR' : _LOCATIONFILTER,
  '__module__' : 'google.cloud.talent.v4.filters_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4.LocationFilter)
  })
_sym_db.RegisterMessage(LocationFilter)

CompensationFilter = _reflection.GeneratedProtocolMessageType('CompensationFilter', (_message.Message,), {
  'DESCRIPTOR' : _COMPENSATIONFILTER,
  '__module__' : 'google.cloud.talent.v4.filters_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4.CompensationFilter)
  })
_sym_db.RegisterMessage(CompensationFilter)

CommuteFilter = _reflection.GeneratedProtocolMessageType('CommuteFilter', (_message.Message,), {
  'DESCRIPTOR' : _COMMUTEFILTER,
  '__module__' : 'google.cloud.talent.v4.filters_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4.CommuteFilter)
  })
_sym_db.RegisterMessage(CommuteFilter)


DESCRIPTOR._options = None
_COMPENSATIONFILTER.fields_by_name['type']._options = None
_COMPENSATIONFILTER.fields_by_name['units']._options = None
_COMMUTEFILTER.fields_by_name['commute_method']._options = None
_COMMUTEFILTER.fields_by_name['start_coordinates']._options = None
_COMMUTEFILTER.fields_by_name['travel_duration']._options = None
# @@protoc_insertion_point(module_scope)