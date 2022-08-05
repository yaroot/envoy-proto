# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4/job.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.talent.v4 import common_pb2 as google_dot_cloud_dot_talent_dot_v4_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n google/cloud/talent/v4/job.proto\x12\x16google.cloud.talent.v4\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/cloud/talent/v4/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xf5\x0e\n\x03Job\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x34\n\x07\x63ompany\x18\x02 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bjobs.googleapis.com/Company\x12\x1b\n\x0erequisition_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\x05title\x18\x04 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\taddresses\x18\x06 \x03(\t\x12\x45\n\x10\x61pplication_info\x18\x07 \x01(\x0b\x32+.google.cloud.talent.v4.Job.ApplicationInfo\x12\x38\n\x0cjob_benefits\x18\x08 \x03(\x0e\x32\".google.cloud.talent.v4.JobBenefit\x12\x43\n\x11\x63ompensation_info\x18\t \x01(\x0b\x32(.google.cloud.talent.v4.CompensationInfo\x12L\n\x11\x63ustom_attributes\x18\n \x03(\x0b\x32\x31.google.cloud.talent.v4.Job.CustomAttributesEntry\x12\x38\n\x0c\x64\x65gree_types\x18\x0b \x03(\x0e\x32\".google.cloud.talent.v4.DegreeType\x12\x12\n\ndepartment\x18\x0c \x01(\t\x12@\n\x10\x65mployment_types\x18\r \x03(\x0e\x32&.google.cloud.talent.v4.EmploymentType\x12\x12\n\nincentives\x18\x0e \x01(\t\x12\x15\n\rlanguage_code\x18\x0f \x01(\t\x12\x33\n\tjob_level\x18\x10 \x01(\x0e\x32 .google.cloud.talent.v4.JobLevel\x12\x17\n\x0fpromotion_value\x18\x11 \x01(\x05\x12\x16\n\x0equalifications\x18\x12 \x01(\t\x12\x18\n\x10responsibilities\x18\x13 \x01(\t\x12=\n\x0eposting_region\x18\x14 \x01(\x0e\x32%.google.cloud.talent.v4.PostingRegion\x12:\n\nvisibility\x18\x15 \x01(\x0e\x32\".google.cloud.talent.v4.VisibilityB\x02\x18\x01\x12\x32\n\x0ejob_start_time\x18\x16 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x30\n\x0cjob_end_time\x18\x17 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x38\n\x14posting_publish_time\x18\x18 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x37\n\x13posting_expire_time\x18\x19 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12<\n\x13posting_create_time\x18\x1a \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12<\n\x13posting_update_time\x18\x1b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12!\n\x14\x63ompany_display_name\x18\x1c \x01(\tB\x03\xe0\x41\x03\x12\x42\n\x0c\x64\x65rived_info\x18\x1d \x01(\x0b\x32\'.google.cloud.talent.v4.Job.DerivedInfoB\x03\xe0\x41\x03\x12I\n\x12processing_options\x18\x1e \x01(\x0b\x32-.google.cloud.talent.v4.Job.ProcessingOptions\x1a\x44\n\x0f\x41pplicationInfo\x12\x0e\n\x06\x65mails\x18\x01 \x03(\t\x12\x13\n\x0binstruction\x18\x02 \x01(\t\x12\x0c\n\x04uris\x18\x03 \x03(\t\x1a\x7f\n\x0b\x44\x65rivedInfo\x12\x33\n\tlocations\x18\x01 \x03(\x0b\x32 .google.cloud.talent.v4.Location\x12;\n\x0ejob_categories\x18\x03 \x03(\x0e\x32#.google.cloud.talent.v4.JobCategory\x1a\x83\x01\n\x11ProcessingOptions\x12)\n!disable_street_address_resolution\x18\x01 \x01(\x08\x12\x43\n\x11html_sanitization\x18\x02 \x01(\x0e\x32(.google.cloud.talent.v4.HtmlSanitization\x1a`\n\x15\x43ustomAttributesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x36\n\x05value\x18\x02 \x01(\x0b\x32\'.google.cloud.talent.v4.CustomAttribute:\x02\x38\x01:L\xea\x41I\n\x17jobs.googleapis.com/Job\x12.projects/{project}/tenants/{tenant}/jobs/{job}Bl\n\x1a\x63om.google.cloud.talent.v4B\x08JobProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4.job_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.talent.v4B\010JobProtoP\001Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\242\002\003CTS'
  _JOB_CUSTOMATTRIBUTESENTRY._options = None
  _JOB_CUSTOMATTRIBUTESENTRY._serialized_options = b'8\001'
  _JOB.fields_by_name['company']._options = None
  _JOB.fields_by_name['company']._serialized_options = b'\340A\002\372A\035\n\033jobs.googleapis.com/Company'
  _JOB.fields_by_name['requisition_id']._options = None
  _JOB.fields_by_name['requisition_id']._serialized_options = b'\340A\002'
  _JOB.fields_by_name['title']._options = None
  _JOB.fields_by_name['title']._serialized_options = b'\340A\002'
  _JOB.fields_by_name['description']._options = None
  _JOB.fields_by_name['description']._serialized_options = b'\340A\002'
  _JOB.fields_by_name['visibility']._options = None
  _JOB.fields_by_name['visibility']._serialized_options = b'\030\001'
  _JOB.fields_by_name['posting_create_time']._options = None
  _JOB.fields_by_name['posting_create_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['posting_update_time']._options = None
  _JOB.fields_by_name['posting_update_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['company_display_name']._options = None
  _JOB.fields_by_name['company_display_name']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['derived_info']._options = None
  _JOB.fields_by_name['derived_info']._serialized_options = b'\340A\003'
  _JOB._options = None
  _JOB._serialized_options = b'\352AI\n\027jobs.googleapis.com/Job\022.projects/{project}/tenants/{tenant}/jobs/{job}'
  _JOB._serialized_start=191
  _JOB._serialized_end=2100
  _JOB_APPLICATIONINFO._serialized_start=1593
  _JOB_APPLICATIONINFO._serialized_end=1661
  _JOB_DERIVEDINFO._serialized_start=1663
  _JOB_DERIVEDINFO._serialized_end=1790
  _JOB_PROCESSINGOPTIONS._serialized_start=1793
  _JOB_PROCESSINGOPTIONS._serialized_end=1924
  _JOB_CUSTOMATTRIBUTESENTRY._serialized_start=1926
  _JOB_CUSTOMATTRIBUTESENTRY._serialized_end=2022
# @@protoc_insertion_point(module_scope)
