# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/job_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.talent.v4beta1 import common_pb2 as google_dot_cloud_dot_talent_dot_v4beta1_dot_common__pb2
from google.cloud.talent.v4beta1 import filters_pb2 as google_dot_cloud_dot_talent_dot_v4beta1_dot_filters__pb2
from google.cloud.talent.v4beta1 import histogram_pb2 as google_dot_cloud_dot_talent_dot_v4beta1_dot_histogram__pb2
from google.cloud.talent.v4beta1 import job_pb2 as google_dot_cloud_dot_talent_dot_v4beta1_dot_job__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-google/cloud/talent/v4beta1/job_service.proto\x12\x1bgoogle.cloud.talent.v4beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/talent/v4beta1/common.proto\x1a)google/cloud/talent/v4beta1/filters.proto\x1a+google/cloud/talent/v4beta1/histogram.proto\x1a%google/cloud/talent/v4beta1/job.proto\x1a#google/longrunning/operations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"w\n\x10\x43reateJobRequest\x12/\n\x06parent\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\x12\x17jobs.googleapis.com/Job\x12\x32\n\x03job\x18\x02 \x01(\x0b\x32 .google.cloud.talent.v4beta1.JobB\x03\xe0\x41\x02\">\n\rGetJobRequest\x12-\n\x04name\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\n\x17jobs.googleapis.com/Job\"w\n\x10UpdateJobRequest\x12\x32\n\x03job\x18\x01 \x01(\x0b\x32 .google.cloud.talent.v4beta1.JobB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"A\n\x10\x44\x65leteJobRequest\x12-\n\x04name\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\n\x17jobs.googleapis.com/Job\"^\n\x16\x42\x61tchDeleteJobsRequest\x12/\n\x06parent\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\x12\x17jobs.googleapis.com/Job\x12\x13\n\x06\x66ilter\x18\x02 \x01(\tB\x03\xe0\x41\x02\"\xb6\x01\n\x0fListJobsRequest\x12/\n\x06parent\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\x12\x17jobs.googleapis.com/Job\x12\x13\n\x06\x66ilter\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x36\n\x08job_view\x18\x05 \x01(\x0e\x32$.google.cloud.talent.v4beta1.JobView\"\x9c\x01\n\x10ListJobsResponse\x12.\n\x04jobs\x18\x01 \x03(\x0b\x32 .google.cloud.talent.v4beta1.Job\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12?\n\x08metadata\x18\x03 \x01(\x0b\x32-.google.cloud.talent.v4beta1.ResponseMetadata\"\xbb\x0b\n\x11SearchJobsRequest\x12/\n\x06parent\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\x12\x17jobs.googleapis.com/Job\x12N\n\x0bsearch_mode\x18\x02 \x01(\x0e\x32\x39.google.cloud.talent.v4beta1.SearchJobsRequest.SearchMode\x12K\n\x10request_metadata\x18\x03 \x01(\x0b\x32,.google.cloud.talent.v4beta1.RequestMetadataB\x03\xe0\x41\x02\x12\x38\n\tjob_query\x18\x04 \x01(\x0b\x32%.google.cloud.talent.v4beta1.JobQuery\x12\x19\n\x11\x65nable_broadening\x18\x05 \x01(\x08\x12\'\n\x1brequire_precise_result_size\x18\x06 \x01(\x08\x42\x02\x18\x01\x12\x46\n\x11histogram_queries\x18\x07 \x03(\x0b\x32+.google.cloud.talent.v4beta1.HistogramQuery\x12\x36\n\x08job_view\x18\x08 \x01(\x0e\x32$.google.cloud.talent.v4beta1.JobView\x12\x0e\n\x06offset\x18\t \x01(\x05\x12\x11\n\tpage_size\x18\n \x01(\x05\x12\x12\n\npage_token\x18\x0b \x01(\t\x12\x10\n\x08order_by\x18\x0c \x01(\t\x12\x62\n\x15\x64iversification_level\x18\r \x01(\x0e\x32\x43.google.cloud.talent.v4beta1.SearchJobsRequest.DiversificationLevel\x12]\n\x13\x63ustom_ranking_info\x18\x0e \x01(\x0b\x32@.google.cloud.talent.v4beta1.SearchJobsRequest.CustomRankingInfo\x12\x1d\n\x15\x64isable_keyword_match\x18\x10 \x01(\x08\x12[\n\x12keyword_match_mode\x18\x12 \x01(\x0e\x32?.google.cloud.talent.v4beta1.SearchJobsRequest.KeywordMatchMode\x1a\x9a\x02\n\x11\x43ustomRankingInfo\x12o\n\x10importance_level\x18\x01 \x01(\x0e\x32P.google.cloud.talent.v4beta1.SearchJobsRequest.CustomRankingInfo.ImportanceLevelB\x03\xe0\x41\x02\x12\x1f\n\x12ranking_expression\x18\x02 \x01(\tB\x03\xe0\x41\x02\"s\n\x0fImportanceLevel\x12 \n\x1cIMPORTANCE_LEVEL_UNSPECIFIED\x10\x00\x12\x08\n\x04NONE\x10\x01\x12\x07\n\x03LOW\x10\x02\x12\x08\n\x04MILD\x10\x03\x12\n\n\x06MEDIUM\x10\x04\x12\x08\n\x04HIGH\x10\x05\x12\x0b\n\x07\x45XTREME\x10\x06\"R\n\nSearchMode\x12\x1b\n\x17SEARCH_MODE_UNSPECIFIED\x10\x00\x12\x0e\n\nJOB_SEARCH\x10\x01\x12\x17\n\x13\x46\x45\x41TURED_JOB_SEARCH\x10\x02\"W\n\x14\x44iversificationLevel\x12%\n!DIVERSIFICATION_LEVEL_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x44ISABLED\x10\x01\x12\n\n\x06SIMPLE\x10\x02\"\x87\x01\n\x10KeywordMatchMode\x12\"\n\x1eKEYWORD_MATCH_MODE_UNSPECIFIED\x10\x00\x12\x1a\n\x16KEYWORD_MATCH_DISABLED\x10\x01\x12\x15\n\x11KEYWORD_MATCH_ALL\x10\x02\x12\x1c\n\x18KEYWORD_MATCH_TITLE_ONLY\x10\x03\"\xd7\x06\n\x12SearchJobsResponse\x12R\n\rmatching_jobs\x18\x01 \x03(\x0b\x32;.google.cloud.talent.v4beta1.SearchJobsResponse.MatchingJob\x12R\n\x17histogram_query_results\x18\x02 \x03(\x0b\x32\x31.google.cloud.talent.v4beta1.HistogramQueryResult\x12\x17\n\x0fnext_page_token\x18\x03 \x01(\t\x12?\n\x10location_filters\x18\x04 \x03(\x0b\x32%.google.cloud.talent.v4beta1.Location\x12\x1c\n\x14\x65stimated_total_size\x18\x05 \x01(\x05\x12\x12\n\ntotal_size\x18\x06 \x01(\x05\x12?\n\x08metadata\x18\x07 \x01(\x0b\x32-.google.cloud.talent.v4beta1.ResponseMetadata\x12\"\n\x1a\x62roadened_query_jobs_count\x18\x08 \x01(\x05\x12I\n\x10spell_correction\x18\t \x01(\x0b\x32/.google.cloud.talent.v4beta1.SpellingCorrection\x1a\xdc\x01\n\x0bMatchingJob\x12-\n\x03job\x18\x01 \x01(\x0b\x32 .google.cloud.talent.v4beta1.Job\x12\x13\n\x0bjob_summary\x18\x02 \x01(\t\x12\x19\n\x11job_title_snippet\x18\x03 \x01(\t\x12\x1b\n\x13search_text_snippet\x18\x04 \x01(\t\x12Q\n\x0c\x63ommute_info\x18\x05 \x01(\x0b\x32;.google.cloud.talent.v4beta1.SearchJobsResponse.CommuteInfo\x1a~\n\x0b\x43ommuteInfo\x12;\n\x0cjob_location\x18\x01 \x01(\x0b\x32%.google.cloud.talent.v4beta1.Location\x12\x32\n\x0ftravel_duration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"~\n\x16\x42\x61tchCreateJobsRequest\x12/\n\x06parent\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\x12\x17jobs.googleapis.com/Job\x12\x33\n\x04jobs\x18\x02 \x03(\x0b\x32 .google.cloud.talent.v4beta1.JobB\x03\xe0\x41\x02\"\xaf\x01\n\x16\x42\x61tchUpdateJobsRequest\x12/\n\x06parent\x18\x01 \x01(\tB\x1f\xe0\x41\x02\xfa\x41\x19\x12\x17jobs.googleapis.com/Job\x12\x33\n\x04jobs\x18\x02 \x03(\x0b\x32 .google.cloud.talent.v4beta1.JobB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xc4\x01\n\x12JobOperationResult\x12N\n\x0bjob_results\x18\x01 \x03(\x0b\x32\x39.google.cloud.talent.v4beta1.JobOperationResult.JobResult\x1a^\n\tJobResult\x12-\n\x03job\x18\x01 \x01(\x0b\x32 .google.cloud.talent.v4beta1.Job\x12\"\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status*v\n\x07JobView\x12\x18\n\x14JOB_VIEW_UNSPECIFIED\x10\x00\x12\x14\n\x10JOB_VIEW_ID_ONLY\x10\x01\x12\x14\n\x10JOB_VIEW_MINIMAL\x10\x02\x12\x12\n\x0eJOB_VIEW_SMALL\x10\x03\x12\x11\n\rJOB_VIEW_FULL\x10\x04\x32\xce\x12\n\nJobService\x12\xc9\x01\n\tCreateJob\x12-.google.cloud.talent.v4beta1.CreateJobRequest\x1a .google.cloud.talent.v4beta1.Job\"k\x82\xd3\xe4\x93\x02X\"+/v4beta1/{parent=projects/*/tenants/*}/jobs:\x01*Z&\"!/v4beta1/{parent=projects/*}/jobs:\x01*\xda\x41\nparent,job\x12\x9b\x02\n\x0f\x42\x61tchCreateJobs\x12\x33.google.cloud.talent.v4beta1.BatchCreateJobsRequest\x1a\x1d.google.longrunning.Operation\"\xb3\x01\x82\xd3\xe4\x93\x02p\"7/v4beta1/{parent=projects/*/tenants/*}/jobs:batchCreate:\x01*Z2\"-/v4beta1/{parent=projects/*}/jobs:batchCreate:\x01*\xda\x41\x0bparent,jobs\xca\x41,\n\x12JobOperationResult\x12\x16\x42\x61tchOperationMetadata\x12\xb7\x01\n\x06GetJob\x12*.google.cloud.talent.v4beta1.GetJobRequest\x1a .google.cloud.talent.v4beta1.Job\"_\x82\xd3\xe4\x93\x02R\x12+/v4beta1/{name=projects/*/tenants/*/jobs/*}Z#\x12!/v4beta1/{name=projects/*/jobs/*}\xda\x41\x04name\x12\xca\x01\n\tUpdateJob\x12-.google.cloud.talent.v4beta1.UpdateJobRequest\x1a .google.cloud.talent.v4beta1.Job\"l\x82\xd3\xe4\x93\x02`2//v4beta1/{job.name=projects/*/tenants/*/jobs/*}:\x01*Z*2%/v4beta1/{job.name=projects/*/jobs/*}:\x01*\xda\x41\x03job\x12\x9b\x02\n\x0f\x42\x61tchUpdateJobs\x12\x33.google.cloud.talent.v4beta1.BatchUpdateJobsRequest\x1a\x1d.google.longrunning.Operation\"\xb3\x01\x82\xd3\xe4\x93\x02p\"7/v4beta1/{parent=projects/*/tenants/*}/jobs:batchUpdate:\x01*Z2\"-/v4beta1/{parent=projects/*}/jobs:batchUpdate:\x01*\xda\x41\x0bparent,jobs\xca\x41,\n\x12JobOperationResult\x12\x16\x42\x61tchOperationMetadata\x12\xb3\x01\n\tDeleteJob\x12-.google.cloud.talent.v4beta1.DeleteJobRequest\x1a\x16.google.protobuf.Empty\"_\x82\xd3\xe4\x93\x02R*+/v4beta1/{name=projects/*/tenants/*/jobs/*}Z#*!/v4beta1/{name=projects/*/jobs/*}\xda\x41\x04name\x12\xe4\x01\n\x0f\x42\x61tchDeleteJobs\x12\x33.google.cloud.talent.v4beta1.BatchDeleteJobsRequest\x1a\x16.google.protobuf.Empty\"\x83\x01\x82\xd3\xe4\x93\x02m\"7/v4beta1/{parent=projects/*/tenants/*}/jobs:batchDelete:\x01*Z/\"-/v4beta1/{parent=projects/*}/jobs:batchDelete\xda\x41\rparent,filter\x12\xd1\x01\n\x08ListJobs\x12,.google.cloud.talent.v4beta1.ListJobsRequest\x1a-.google.cloud.talent.v4beta1.ListJobsResponse\"h\x82\xd3\xe4\x93\x02R\x12+/v4beta1/{parent=projects/*/tenants/*}/jobsZ#\x12!/v4beta1/{parent=projects/*}/jobs\xda\x41\rparent,filter\x12\xdb\x01\n\nSearchJobs\x12..google.cloud.talent.v4beta1.SearchJobsRequest\x1a/.google.cloud.talent.v4beta1.SearchJobsResponse\"l\x82\xd3\xe4\x93\x02\x66\"2/v4beta1/{parent=projects/*/tenants/*}/jobs:search:\x01*Z-\"(/v4beta1/{parent=projects/*}/jobs:search:\x01*\x12\xf3\x01\n\x12SearchJobsForAlert\x12..google.cloud.talent.v4beta1.SearchJobsRequest\x1a/.google.cloud.talent.v4beta1.SearchJobsResponse\"|\x82\xd3\xe4\x93\x02v\":/v4beta1/{parent=projects/*/tenants/*}/jobs:searchForAlert:\x01*Z5\"0/v4beta1/{parent=projects/*}/jobs:searchForAlert:\x01*\x1al\xca\x41\x13jobs.googleapis.com\xd2\x41Shttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobsB}\n\x1f\x63om.google.cloud.talent.v4beta1B\x0fJobServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4beta1.job_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.talent.v4beta1B\017JobServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\242\002\003CTS'
  _CREATEJOBREQUEST.fields_by_name['parent']._options = None
  _CREATEJOBREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\031\022\027jobs.googleapis.com/Job'
  _CREATEJOBREQUEST.fields_by_name['job']._options = None
  _CREATEJOBREQUEST.fields_by_name['job']._serialized_options = b'\340A\002'
  _GETJOBREQUEST.fields_by_name['name']._options = None
  _GETJOBREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\031\n\027jobs.googleapis.com/Job'
  _UPDATEJOBREQUEST.fields_by_name['job']._options = None
  _UPDATEJOBREQUEST.fields_by_name['job']._serialized_options = b'\340A\002'
  _DELETEJOBREQUEST.fields_by_name['name']._options = None
  _DELETEJOBREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\031\n\027jobs.googleapis.com/Job'
  _BATCHDELETEJOBSREQUEST.fields_by_name['parent']._options = None
  _BATCHDELETEJOBSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\031\022\027jobs.googleapis.com/Job'
  _BATCHDELETEJOBSREQUEST.fields_by_name['filter']._options = None
  _BATCHDELETEJOBSREQUEST.fields_by_name['filter']._serialized_options = b'\340A\002'
  _LISTJOBSREQUEST.fields_by_name['parent']._options = None
  _LISTJOBSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\031\022\027jobs.googleapis.com/Job'
  _LISTJOBSREQUEST.fields_by_name['filter']._options = None
  _LISTJOBSREQUEST.fields_by_name['filter']._serialized_options = b'\340A\002'
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO.fields_by_name['importance_level']._options = None
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO.fields_by_name['importance_level']._serialized_options = b'\340A\002'
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO.fields_by_name['ranking_expression']._options = None
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO.fields_by_name['ranking_expression']._serialized_options = b'\340A\002'
  _SEARCHJOBSREQUEST.fields_by_name['parent']._options = None
  _SEARCHJOBSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\031\022\027jobs.googleapis.com/Job'
  _SEARCHJOBSREQUEST.fields_by_name['request_metadata']._options = None
  _SEARCHJOBSREQUEST.fields_by_name['request_metadata']._serialized_options = b'\340A\002'
  _SEARCHJOBSREQUEST.fields_by_name['require_precise_result_size']._options = None
  _SEARCHJOBSREQUEST.fields_by_name['require_precise_result_size']._serialized_options = b'\030\001'
  _BATCHCREATEJOBSREQUEST.fields_by_name['parent']._options = None
  _BATCHCREATEJOBSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\031\022\027jobs.googleapis.com/Job'
  _BATCHCREATEJOBSREQUEST.fields_by_name['jobs']._options = None
  _BATCHCREATEJOBSREQUEST.fields_by_name['jobs']._serialized_options = b'\340A\002'
  _BATCHUPDATEJOBSREQUEST.fields_by_name['parent']._options = None
  _BATCHUPDATEJOBSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\031\022\027jobs.googleapis.com/Job'
  _BATCHUPDATEJOBSREQUEST.fields_by_name['jobs']._options = None
  _BATCHUPDATEJOBSREQUEST.fields_by_name['jobs']._serialized_options = b'\340A\002'
  _JOBSERVICE._options = None
  _JOBSERVICE._serialized_options = b'\312A\023jobs.googleapis.com\322AShttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/jobs'
  _JOBSERVICE.methods_by_name['CreateJob']._options = None
  _JOBSERVICE.methods_by_name['CreateJob']._serialized_options = b'\202\323\344\223\002X\"+/v4beta1/{parent=projects/*/tenants/*}/jobs:\001*Z&\"!/v4beta1/{parent=projects/*}/jobs:\001*\332A\nparent,job'
  _JOBSERVICE.methods_by_name['BatchCreateJobs']._options = None
  _JOBSERVICE.methods_by_name['BatchCreateJobs']._serialized_options = b'\202\323\344\223\002p\"7/v4beta1/{parent=projects/*/tenants/*}/jobs:batchCreate:\001*Z2\"-/v4beta1/{parent=projects/*}/jobs:batchCreate:\001*\332A\013parent,jobs\312A,\n\022JobOperationResult\022\026BatchOperationMetadata'
  _JOBSERVICE.methods_by_name['GetJob']._options = None
  _JOBSERVICE.methods_by_name['GetJob']._serialized_options = b'\202\323\344\223\002R\022+/v4beta1/{name=projects/*/tenants/*/jobs/*}Z#\022!/v4beta1/{name=projects/*/jobs/*}\332A\004name'
  _JOBSERVICE.methods_by_name['UpdateJob']._options = None
  _JOBSERVICE.methods_by_name['UpdateJob']._serialized_options = b'\202\323\344\223\002`2//v4beta1/{job.name=projects/*/tenants/*/jobs/*}:\001*Z*2%/v4beta1/{job.name=projects/*/jobs/*}:\001*\332A\003job'
  _JOBSERVICE.methods_by_name['BatchUpdateJobs']._options = None
  _JOBSERVICE.methods_by_name['BatchUpdateJobs']._serialized_options = b'\202\323\344\223\002p\"7/v4beta1/{parent=projects/*/tenants/*}/jobs:batchUpdate:\001*Z2\"-/v4beta1/{parent=projects/*}/jobs:batchUpdate:\001*\332A\013parent,jobs\312A,\n\022JobOperationResult\022\026BatchOperationMetadata'
  _JOBSERVICE.methods_by_name['DeleteJob']._options = None
  _JOBSERVICE.methods_by_name['DeleteJob']._serialized_options = b'\202\323\344\223\002R*+/v4beta1/{name=projects/*/tenants/*/jobs/*}Z#*!/v4beta1/{name=projects/*/jobs/*}\332A\004name'
  _JOBSERVICE.methods_by_name['BatchDeleteJobs']._options = None
  _JOBSERVICE.methods_by_name['BatchDeleteJobs']._serialized_options = b'\202\323\344\223\002m\"7/v4beta1/{parent=projects/*/tenants/*}/jobs:batchDelete:\001*Z/\"-/v4beta1/{parent=projects/*}/jobs:batchDelete\332A\rparent,filter'
  _JOBSERVICE.methods_by_name['ListJobs']._options = None
  _JOBSERVICE.methods_by_name['ListJobs']._serialized_options = b'\202\323\344\223\002R\022+/v4beta1/{parent=projects/*/tenants/*}/jobsZ#\022!/v4beta1/{parent=projects/*}/jobs\332A\rparent,filter'
  _JOBSERVICE.methods_by_name['SearchJobs']._options = None
  _JOBSERVICE.methods_by_name['SearchJobs']._serialized_options = b'\202\323\344\223\002f\"2/v4beta1/{parent=projects/*/tenants/*}/jobs:search:\001*Z-\"(/v4beta1/{parent=projects/*}/jobs:search:\001*'
  _JOBSERVICE.methods_by_name['SearchJobsForAlert']._options = None
  _JOBSERVICE.methods_by_name['SearchJobsForAlert']._serialized_options = b'\202\323\344\223\002v\":/v4beta1/{parent=projects/*/tenants/*}/jobs:searchForAlert:\001*Z5\"0/v4beta1/{parent=projects/*}/jobs:searchForAlert:\001*'
  _JOBVIEW._serialized_start=4165
  _JOBVIEW._serialized_end=4283
  _CREATEJOBREQUEST._serialized_start=519
  _CREATEJOBREQUEST._serialized_end=638
  _GETJOBREQUEST._serialized_start=640
  _GETJOBREQUEST._serialized_end=702
  _UPDATEJOBREQUEST._serialized_start=704
  _UPDATEJOBREQUEST._serialized_end=823
  _DELETEJOBREQUEST._serialized_start=825
  _DELETEJOBREQUEST._serialized_end=890
  _BATCHDELETEJOBSREQUEST._serialized_start=892
  _BATCHDELETEJOBSREQUEST._serialized_end=986
  _LISTJOBSREQUEST._serialized_start=989
  _LISTJOBSREQUEST._serialized_end=1171
  _LISTJOBSRESPONSE._serialized_start=1174
  _LISTJOBSRESPONSE._serialized_end=1330
  _SEARCHJOBSREQUEST._serialized_start=1333
  _SEARCHJOBSREQUEST._serialized_end=2800
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO._serialized_start=2207
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO._serialized_end=2489
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO_IMPORTANCELEVEL._serialized_start=2374
  _SEARCHJOBSREQUEST_CUSTOMRANKINGINFO_IMPORTANCELEVEL._serialized_end=2489
  _SEARCHJOBSREQUEST_SEARCHMODE._serialized_start=2491
  _SEARCHJOBSREQUEST_SEARCHMODE._serialized_end=2573
  _SEARCHJOBSREQUEST_DIVERSIFICATIONLEVEL._serialized_start=2575
  _SEARCHJOBSREQUEST_DIVERSIFICATIONLEVEL._serialized_end=2662
  _SEARCHJOBSREQUEST_KEYWORDMATCHMODE._serialized_start=2665
  _SEARCHJOBSREQUEST_KEYWORDMATCHMODE._serialized_end=2800
  _SEARCHJOBSRESPONSE._serialized_start=2803
  _SEARCHJOBSRESPONSE._serialized_end=3658
  _SEARCHJOBSRESPONSE_MATCHINGJOB._serialized_start=3310
  _SEARCHJOBSRESPONSE_MATCHINGJOB._serialized_end=3530
  _SEARCHJOBSRESPONSE_COMMUTEINFO._serialized_start=3532
  _SEARCHJOBSRESPONSE_COMMUTEINFO._serialized_end=3658
  _BATCHCREATEJOBSREQUEST._serialized_start=3660
  _BATCHCREATEJOBSREQUEST._serialized_end=3786
  _BATCHUPDATEJOBSREQUEST._serialized_start=3789
  _BATCHUPDATEJOBSREQUEST._serialized_end=3964
  _JOBOPERATIONRESULT._serialized_start=3967
  _JOBOPERATIONRESULT._serialized_end=4163
  _JOBOPERATIONRESULT_JOBRESULT._serialized_start=4069
  _JOBOPERATIONRESULT_JOBRESULT._serialized_end=4163
  _JOBSERVICE._serialized_start=4286
  _JOBSERVICE._serialized_end=6668
# @@protoc_insertion_point(module_scope)