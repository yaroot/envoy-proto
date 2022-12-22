# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/webrisk/v1beta1/webrisk.proto
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
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/webrisk/v1beta1/webrisk.proto\x12\x1cgoogle.cloud.webrisk.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xf2\x02\n\x1c\x43omputeThreatListDiffRequest\x12\x42\n\x0bthreat_type\x18\x01 \x01(\x0e\x32(.google.cloud.webrisk.v1beta1.ThreatTypeB\x03\xe0\x41\x02\x12\x15\n\rversion_token\x18\x02 \x01(\x0c\x12`\n\x0b\x63onstraints\x18\x03 \x01(\x0b\x32\x46.google.cloud.webrisk.v1beta1.ComputeThreatListDiffRequest.ConstraintsB\x03\xe0\x41\x02\x1a\x94\x01\n\x0b\x43onstraints\x12\x18\n\x10max_diff_entries\x18\x01 \x01(\x05\x12\x1c\n\x14max_database_entries\x18\x02 \x01(\x05\x12M\n\x16supported_compressions\x18\x03 \x03(\x0e\x32-.google.cloud.webrisk.v1beta1.CompressionType\"\x9a\x04\n\x1d\x43omputeThreatListDiffResponse\x12_\n\rresponse_type\x18\x04 \x01(\x0e\x32H.google.cloud.webrisk.v1beta1.ComputeThreatListDiffResponse.ResponseType\x12\x45\n\tadditions\x18\x05 \x01(\x0b\x32\x32.google.cloud.webrisk.v1beta1.ThreatEntryAdditions\x12\x43\n\x08removals\x18\x06 \x01(\x0b\x32\x31.google.cloud.webrisk.v1beta1.ThreatEntryRemovals\x12\x19\n\x11new_version_token\x18\x07 \x01(\x0c\x12V\n\x08\x63hecksum\x18\x08 \x01(\x0b\x32\x44.google.cloud.webrisk.v1beta1.ComputeThreatListDiffResponse.Checksum\x12\x39\n\x15recommended_next_diff\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1a\x1a\n\x08\x43hecksum\x12\x0e\n\x06sha256\x18\x01 \x01(\x0c\"B\n\x0cResponseType\x12\x1d\n\x19RESPONSE_TYPE_UNSPECIFIED\x10\x00\x12\x08\n\x04\x44IFF\x10\x01\x12\t\n\x05RESET\x10\x02\"j\n\x11SearchUrisRequest\x12\x10\n\x03uri\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x43\n\x0cthreat_types\x18\x02 \x03(\x0e\x32(.google.cloud.webrisk.v1beta1.ThreatTypeB\x03\xe0\x41\x02\"\xde\x01\n\x12SearchUrisResponse\x12J\n\x06threat\x18\x01 \x01(\x0b\x32:.google.cloud.webrisk.v1beta1.SearchUrisResponse.ThreatUri\x1a|\n\tThreatUri\x12>\n\x0cthreat_types\x18\x01 \x03(\x0e\x32(.google.cloud.webrisk.v1beta1.ThreatType\x12/\n\x0b\x65xpire_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"o\n\x13SearchHashesRequest\x12\x13\n\x0bhash_prefix\x18\x01 \x01(\x0c\x12\x43\n\x0cthreat_types\x18\x02 \x03(\x0e\x32(.google.cloud.webrisk.v1beta1.ThreatTypeB\x03\xe0\x41\x02\"\xae\x02\n\x14SearchHashesResponse\x12N\n\x07threats\x18\x01 \x03(\x0b\x32=.google.cloud.webrisk.v1beta1.SearchHashesResponse.ThreatHash\x12\x38\n\x14negative_expire_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1a\x8b\x01\n\nThreatHash\x12>\n\x0cthreat_types\x18\x01 \x03(\x0e\x32(.google.cloud.webrisk.v1beta1.ThreatType\x12\x0c\n\x04hash\x18\x02 \x01(\x0c\x12/\n\x0b\x65xpire_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\x99\x01\n\x14ThreatEntryAdditions\x12;\n\nraw_hashes\x18\x01 \x03(\x0b\x32\'.google.cloud.webrisk.v1beta1.RawHashes\x12\x44\n\x0brice_hashes\x18\x02 \x01(\x0b\x32/.google.cloud.webrisk.v1beta1.RiceDeltaEncoding\"\x9b\x01\n\x13ThreatEntryRemovals\x12=\n\x0braw_indices\x18\x01 \x01(\x0b\x32(.google.cloud.webrisk.v1beta1.RawIndices\x12\x45\n\x0crice_indices\x18\x02 \x01(\x0b\x32/.google.cloud.webrisk.v1beta1.RiceDeltaEncoding\"\x1d\n\nRawIndices\x12\x0f\n\x07indices\x18\x01 \x03(\x05\"4\n\tRawHashes\x12\x13\n\x0bprefix_size\x18\x01 \x01(\x05\x12\x12\n\nraw_hashes\x18\x02 \x01(\x0c\"k\n\x11RiceDeltaEncoding\x12\x13\n\x0b\x66irst_value\x18\x01 \x01(\x03\x12\x16\n\x0erice_parameter\x18\x02 \x01(\x05\x12\x13\n\x0b\x65ntry_count\x18\x03 \x01(\x05\x12\x14\n\x0c\x65ncoded_data\x18\x04 \x01(\x0c*e\n\nThreatType\x12\x1b\n\x17THREAT_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07MALWARE\x10\x01\x12\x16\n\x12SOCIAL_ENGINEERING\x10\x02\x12\x15\n\x11UNWANTED_SOFTWARE\x10\x03*F\n\x0f\x43ompressionType\x12 \n\x1c\x43OMPRESSION_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03RAW\x10\x01\x12\x08\n\x04RICE\x10\x02\x32\x9e\x05\n\x15WebRiskServiceV1Beta1\x12\xe2\x01\n\x15\x43omputeThreatListDiff\x12:.google.cloud.webrisk.v1beta1.ComputeThreatListDiffRequest\x1a;.google.cloud.webrisk.v1beta1.ComputeThreatListDiffResponse\"P\x82\xd3\xe4\x93\x02\"\x12 /v1beta1/threatLists:computeDiff\xda\x41%threat_type,version_token,constraints\x12\xa0\x01\n\nSearchUris\x12/.google.cloud.webrisk.v1beta1.SearchUrisRequest\x1a\x30.google.cloud.webrisk.v1beta1.SearchUrisResponse\"/\x82\xd3\xe4\x93\x02\x16\x12\x14/v1beta1/uris:search\xda\x41\x10uri,threat_types\x12\xb0\x01\n\x0cSearchHashes\x12\x31.google.cloud.webrisk.v1beta1.SearchHashesRequest\x1a\x32.google.cloud.webrisk.v1beta1.SearchHashesResponse\"9\x82\xd3\xe4\x93\x02\x18\x12\x16/v1beta1/hashes:search\xda\x41\x18hash_prefix,threat_types\x1aJ\xca\x41\x16webrisk.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd8\x01\n\x1a\x63om.google.webrisk.v1beta1B\x0cWebRiskProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/webrisk/v1beta1;webrisk\xa2\x02\x04GCWR\xaa\x02\x1cGoogle.Cloud.WebRisk.V1Beta1\xca\x02\x1cGoogle\\Cloud\\WebRisk\\V1beta1\xea\x02\x1fGoogle::Cloud::WebRisk::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.webrisk.v1beta1.webrisk_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.webrisk.v1beta1B\014WebRiskProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/webrisk/v1beta1;webrisk\242\002\004GCWR\252\002\034Google.Cloud.WebRisk.V1Beta1\312\002\034Google\\Cloud\\WebRisk\\V1beta1\352\002\037Google::Cloud::WebRisk::V1beta1'
  _COMPUTETHREATLISTDIFFREQUEST.fields_by_name['threat_type']._options = None
  _COMPUTETHREATLISTDIFFREQUEST.fields_by_name['threat_type']._serialized_options = b'\340A\002'
  _COMPUTETHREATLISTDIFFREQUEST.fields_by_name['constraints']._options = None
  _COMPUTETHREATLISTDIFFREQUEST.fields_by_name['constraints']._serialized_options = b'\340A\002'
  _SEARCHURISREQUEST.fields_by_name['uri']._options = None
  _SEARCHURISREQUEST.fields_by_name['uri']._serialized_options = b'\340A\002'
  _SEARCHURISREQUEST.fields_by_name['threat_types']._options = None
  _SEARCHURISREQUEST.fields_by_name['threat_types']._serialized_options = b'\340A\002'
  _SEARCHHASHESREQUEST.fields_by_name['threat_types']._options = None
  _SEARCHHASHESREQUEST.fields_by_name['threat_types']._serialized_options = b'\340A\002'
  _WEBRISKSERVICEV1BETA1._options = None
  _WEBRISKSERVICEV1BETA1._serialized_options = b'\312A\026webrisk.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _WEBRISKSERVICEV1BETA1.methods_by_name['ComputeThreatListDiff']._options = None
  _WEBRISKSERVICEV1BETA1.methods_by_name['ComputeThreatListDiff']._serialized_options = b'\202\323\344\223\002\"\022 /v1beta1/threatLists:computeDiff\332A%threat_type,version_token,constraints'
  _WEBRISKSERVICEV1BETA1.methods_by_name['SearchUris']._options = None
  _WEBRISKSERVICEV1BETA1.methods_by_name['SearchUris']._serialized_options = b'\202\323\344\223\002\026\022\024/v1beta1/uris:search\332A\020uri,threat_types'
  _WEBRISKSERVICEV1BETA1.methods_by_name['SearchHashes']._options = None
  _WEBRISKSERVICEV1BETA1.methods_by_name['SearchHashes']._serialized_options = b'\202\323\344\223\002\030\022\026/v1beta1/hashes:search\332A\030hash_prefix,threat_types'
  _THREATTYPE._serialized_start=2370
  _THREATTYPE._serialized_end=2471
  _COMPRESSIONTYPE._serialized_start=2473
  _COMPRESSIONTYPE._serialized_end=2543
  _COMPUTETHREATLISTDIFFREQUEST._serialized_start=198
  _COMPUTETHREATLISTDIFFREQUEST._serialized_end=568
  _COMPUTETHREATLISTDIFFREQUEST_CONSTRAINTS._serialized_start=420
  _COMPUTETHREATLISTDIFFREQUEST_CONSTRAINTS._serialized_end=568
  _COMPUTETHREATLISTDIFFRESPONSE._serialized_start=571
  _COMPUTETHREATLISTDIFFRESPONSE._serialized_end=1109
  _COMPUTETHREATLISTDIFFRESPONSE_CHECKSUM._serialized_start=1015
  _COMPUTETHREATLISTDIFFRESPONSE_CHECKSUM._serialized_end=1041
  _COMPUTETHREATLISTDIFFRESPONSE_RESPONSETYPE._serialized_start=1043
  _COMPUTETHREATLISTDIFFRESPONSE_RESPONSETYPE._serialized_end=1109
  _SEARCHURISREQUEST._serialized_start=1111
  _SEARCHURISREQUEST._serialized_end=1217
  _SEARCHURISRESPONSE._serialized_start=1220
  _SEARCHURISRESPONSE._serialized_end=1442
  _SEARCHURISRESPONSE_THREATURI._serialized_start=1318
  _SEARCHURISRESPONSE_THREATURI._serialized_end=1442
  _SEARCHHASHESREQUEST._serialized_start=1444
  _SEARCHHASHESREQUEST._serialized_end=1555
  _SEARCHHASHESRESPONSE._serialized_start=1558
  _SEARCHHASHESRESPONSE._serialized_end=1860
  _SEARCHHASHESRESPONSE_THREATHASH._serialized_start=1721
  _SEARCHHASHESRESPONSE_THREATHASH._serialized_end=1860
  _THREATENTRYADDITIONS._serialized_start=1863
  _THREATENTRYADDITIONS._serialized_end=2016
  _THREATENTRYREMOVALS._serialized_start=2019
  _THREATENTRYREMOVALS._serialized_end=2174
  _RAWINDICES._serialized_start=2176
  _RAWINDICES._serialized_end=2205
  _RAWHASHES._serialized_start=2207
  _RAWHASHES._serialized_end=2259
  _RICEDELTAENCODING._serialized_start=2261
  _RICEDELTAENCODING._serialized_end=2368
  _WEBRISKSERVICEV1BETA1._serialized_start=2546
  _WEBRISKSERVICEV1BETA1._serialized_end=3216
# @@protoc_insertion_point(module_scope)