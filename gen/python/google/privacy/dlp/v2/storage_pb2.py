# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/storage.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/privacy/dlp/v2/storage.proto\x12\x15google.privacy.dlp.v2\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\")\n\x08InfoType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\"\xe1\x01\n\x10SensitivityScore\x12L\n\x05score\x18\x01 \x01(\x0e\x32=.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel\"\x7f\n\x15SensitivityScoreLevel\x12!\n\x1dSENSITIVITY_SCORE_UNSPECIFIED\x10\x00\x12\x13\n\x0fSENSITIVITY_LOW\x10\n\x12\x18\n\x14SENSITIVITY_MODERATE\x10\x14\x12\x14\n\x10SENSITIVITY_HIGH\x10\x1e\"K\n\nStoredType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12/\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xc8\x0b\n\x0e\x43ustomInfoType\x12\x32\n\tinfo_type\x18\x01 \x01(\x0b\x32\x1f.google.privacy.dlp.v2.InfoType\x12\x35\n\nlikelihood\x18\x06 \x01(\x0e\x32!.google.privacy.dlp.v2.Likelihood\x12\x46\n\ndictionary\x18\x02 \x01(\x0b\x32\x30.google.privacy.dlp.v2.CustomInfoType.DictionaryH\x00\x12<\n\x05regex\x18\x03 \x01(\x0b\x32+.google.privacy.dlp.v2.CustomInfoType.RegexH\x00\x12M\n\x0esurrogate_type\x18\x04 \x01(\x0b\x32\x33.google.privacy.dlp.v2.CustomInfoType.SurrogateTypeH\x00\x12\x38\n\x0bstored_type\x18\x05 \x01(\x0b\x32!.google.privacy.dlp.v2.StoredTypeH\x00\x12L\n\x0f\x64\x65tection_rules\x18\x07 \x03(\x0b\x32\x33.google.privacy.dlp.v2.CustomInfoType.DetectionRule\x12K\n\x0e\x65xclusion_type\x18\x08 \x01(\x0e\x32\x33.google.privacy.dlp.v2.CustomInfoType.ExclusionType\x1a\xc8\x01\n\nDictionary\x12N\n\tword_list\x18\x01 \x01(\x0b\x32\x39.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordListH\x00\x12\x45\n\x12\x63loud_storage_path\x18\x03 \x01(\x0b\x32\'.google.privacy.dlp.v2.CloudStoragePathH\x00\x1a\x19\n\x08WordList\x12\r\n\x05words\x18\x01 \x03(\tB\x08\n\x06source\x1a/\n\x05Regex\x12\x0f\n\x07pattern\x18\x01 \x01(\t\x12\x15\n\rgroup_indexes\x18\x02 \x03(\x05\x1a\x0f\n\rSurrogateType\x1a\xbe\x04\n\rDetectionRule\x12W\n\x0chotword_rule\x18\x01 \x01(\x0b\x32?.google.privacy.dlp.v2.CustomInfoType.DetectionRule.HotwordRuleH\x00\x1a\x38\n\tProximity\x12\x15\n\rwindow_before\x18\x01 \x01(\x05\x12\x14\n\x0cwindow_after\x18\x02 \x01(\x05\x1a\x82\x01\n\x14LikelihoodAdjustment\x12=\n\x10\x66ixed_likelihood\x18\x01 \x01(\x0e\x32!.google.privacy.dlp.v2.LikelihoodH\x00\x12\x1d\n\x13relative_likelihood\x18\x02 \x01(\x05H\x00\x42\x0c\n\nadjustment\x1a\x8c\x02\n\x0bHotwordRule\x12\x42\n\rhotword_regex\x18\x01 \x01(\x0b\x32+.google.privacy.dlp.v2.CustomInfoType.Regex\x12P\n\tproximity\x18\x02 \x01(\x0b\x32=.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity\x12g\n\x15likelihood_adjustment\x18\x03 \x01(\x0b\x32H.google.privacy.dlp.v2.CustomInfoType.DetectionRule.LikelihoodAdjustmentB\x06\n\x04type\"K\n\rExclusionType\x12\x1e\n\x1a\x45XCLUSION_TYPE_UNSPECIFIED\x10\x00\x12\x1a\n\x16\x45XCLUSION_TYPE_EXCLUDE\x10\x01\x42\x06\n\x04type\"\x17\n\x07\x46ieldId\x12\x0c\n\x04name\x18\x01 \x01(\t\"7\n\x0bPartitionId\x12\x12\n\nproject_id\x18\x02 \x01(\t\x12\x14\n\x0cnamespace_id\x18\x04 \x01(\t\"\x1e\n\x0eKindExpression\x12\x0c\n\x04name\x18\x01 \x01(\t\"\x81\x01\n\x10\x44\x61tastoreOptions\x12\x38\n\x0cpartition_id\x18\x01 \x01(\x0b\x32\".google.privacy.dlp.v2.PartitionId\x12\x33\n\x04kind\x18\x02 \x01(\x0b\x32%.google.privacy.dlp.v2.KindExpression\"]\n\x18\x43loudStorageRegexFileSet\x12\x13\n\x0b\x62ucket_name\x18\x01 \x01(\t\x12\x15\n\rinclude_regex\x18\x02 \x03(\t\x12\x15\n\rexclude_regex\x18\x03 \x03(\t\"\xec\x03\n\x13\x43loudStorageOptions\x12\x44\n\x08\x66ile_set\x18\x01 \x01(\x0b\x32\x32.google.privacy.dlp.v2.CloudStorageOptions.FileSet\x12\x1c\n\x14\x62ytes_limit_per_file\x18\x04 \x01(\x03\x12$\n\x1c\x62ytes_limit_per_file_percent\x18\x08 \x01(\x05\x12\x33\n\nfile_types\x18\x05 \x03(\x0e\x32\x1f.google.privacy.dlp.v2.FileType\x12N\n\rsample_method\x18\x06 \x01(\x0e\x32\x37.google.privacy.dlp.v2.CloudStorageOptions.SampleMethod\x12\x1b\n\x13\x66iles_limit_percent\x18\x07 \x01(\x05\x1a_\n\x07\x46ileSet\x12\x0b\n\x03url\x18\x01 \x01(\t\x12G\n\x0eregex_file_set\x18\x02 \x01(\x0b\x32/.google.privacy.dlp.v2.CloudStorageRegexFileSet\"H\n\x0cSampleMethod\x12\x1d\n\x19SAMPLE_METHOD_UNSPECIFIED\x10\x00\x12\x07\n\x03TOP\x10\x01\x12\x10\n\x0cRANDOM_START\x10\x02\"\"\n\x13\x43loudStorageFileSet\x12\x0b\n\x03url\x18\x01 \x01(\t\" \n\x10\x43loudStoragePath\x12\x0c\n\x04path\x18\x01 \x01(\t\"\xc4\x03\n\x0f\x42igQueryOptions\x12=\n\x0ftable_reference\x18\x01 \x01(\x0b\x32$.google.privacy.dlp.v2.BigQueryTable\x12:\n\x12identifying_fields\x18\x02 \x03(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId\x12\x12\n\nrows_limit\x18\x03 \x01(\x03\x12\x1a\n\x12rows_limit_percent\x18\x06 \x01(\x05\x12J\n\rsample_method\x18\x04 \x01(\x0e\x32\x33.google.privacy.dlp.v2.BigQueryOptions.SampleMethod\x12\x37\n\x0f\x65xcluded_fields\x18\x05 \x03(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId\x12\x37\n\x0fincluded_fields\x18\x07 \x03(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId\"H\n\x0cSampleMethod\x12\x1d\n\x19SAMPLE_METHOD_UNSPECIFIED\x10\x00\x12\x07\n\x03TOP\x10\x01\x12\x10\n\x0cRANDOM_START\x10\x02\"\xda\x04\n\rStorageConfig\x12\x44\n\x11\x64\x61tastore_options\x18\x02 \x01(\x0b\x32\'.google.privacy.dlp.v2.DatastoreOptionsH\x00\x12K\n\x15\x63loud_storage_options\x18\x03 \x01(\x0b\x32*.google.privacy.dlp.v2.CloudStorageOptionsH\x00\x12\x43\n\x11\x62ig_query_options\x18\x04 \x01(\x0b\x32&.google.privacy.dlp.v2.BigQueryOptionsH\x00\x12>\n\x0ehybrid_options\x18\t \x01(\x0b\x32$.google.privacy.dlp.v2.HybridOptionsH\x00\x12L\n\x0ftimespan_config\x18\x06 \x01(\x0b\x32\x33.google.privacy.dlp.v2.StorageConfig.TimespanConfig\x1a\xda\x01\n\x0eTimespanConfig\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x37\n\x0ftimestamp_field\x18\x03 \x01(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId\x12\x31\n)enable_auto_population_of_timespan_config\x18\x04 \x01(\x08\x42\x06\n\x04type\"\xf6\x01\n\rHybridOptions\x12\x13\n\x0b\x64\x65scription\x18\x01 \x01(\t\x12#\n\x1brequired_finding_label_keys\x18\x02 \x03(\t\x12@\n\x06labels\x18\x03 \x03(\x0b\x32\x30.google.privacy.dlp.v2.HybridOptions.LabelsEntry\x12:\n\rtable_options\x18\x04 \x01(\x0b\x32#.google.privacy.dlp.v2.TableOptions\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"`\n\x0b\x42igQueryKey\x12=\n\x0ftable_reference\x18\x01 \x01(\x0b\x32$.google.privacy.dlp.v2.BigQueryTable\x12\x12\n\nrow_number\x18\x02 \x01(\x03\">\n\x0c\x44\x61tastoreKey\x12.\n\nentity_key\x18\x01 \x01(\x0b\x32\x1a.google.privacy.dlp.v2.Key\"\xbb\x01\n\x03Key\x12\x38\n\x0cpartition_id\x18\x01 \x01(\x0b\x32\".google.privacy.dlp.v2.PartitionId\x12\x34\n\x04path\x18\x02 \x03(\x0b\x32&.google.privacy.dlp.v2.Key.PathElement\x1a\x44\n\x0bPathElement\x12\x0c\n\x04kind\x18\x01 \x01(\t\x12\x0c\n\x02id\x18\x02 \x01(\x03H\x00\x12\x0e\n\x04name\x18\x03 \x01(\tH\x00\x42\t\n\x07id_type\"\xa1\x01\n\tRecordKey\x12<\n\rdatastore_key\x18\x02 \x01(\x0b\x32#.google.privacy.dlp.v2.DatastoreKeyH\x00\x12;\n\rbig_query_key\x18\x03 \x01(\x0b\x32\".google.privacy.dlp.v2.BigQueryKeyH\x00\x12\x11\n\tid_values\x18\x05 \x03(\tB\x06\n\x04type\"I\n\rBigQueryTable\x12\x12\n\nproject_id\x18\x01 \x01(\t\x12\x12\n\ndataset_id\x18\x02 \x01(\t\x12\x10\n\x08table_id\x18\x03 \x01(\t\"s\n\rBigQueryField\x12\x33\n\x05table\x18\x01 \x01(\x0b\x32$.google.privacy.dlp.v2.BigQueryTable\x12-\n\x05\x66ield\x18\x02 \x01(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId\"9\n\x08\x45ntityId\x12-\n\x05\x66ield\x18\x01 \x01(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId\"J\n\x0cTableOptions\x12:\n\x12identifying_fields\x18\x01 \x03(\x0b\x32\x1e.google.privacy.dlp.v2.FieldId*t\n\nLikelihood\x12\x1a\n\x16LIKELIHOOD_UNSPECIFIED\x10\x00\x12\x11\n\rVERY_UNLIKELY\x10\x01\x12\x0c\n\x08UNLIKELY\x10\x02\x12\x0c\n\x08POSSIBLE\x10\x03\x12\n\n\x06LIKELY\x10\x04\x12\x0f\n\x0bVERY_LIKELY\x10\x05*\x9a\x01\n\x08\x46ileType\x12\x19\n\x15\x46ILE_TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0b\x42INARY_FILE\x10\x01\x12\r\n\tTEXT_FILE\x10\x02\x12\t\n\x05IMAGE\x10\x03\x12\x08\n\x04WORD\x10\x05\x12\x07\n\x03PDF\x10\x06\x12\x08\n\x04\x41VRO\x10\x07\x12\x07\n\x03\x43SV\x10\x08\x12\x07\n\x03TSV\x10\t\x12\x0e\n\nPOWERPOINT\x10\x0b\x12\t\n\x05\x45XCEL\x10\x0c\x42\xa8\x01\n\x19\x63om.google.privacy.dlp.v2B\nDlpStorageP\x01Z8google.golang.org/genproto/googleapis/privacy/dlp/v2;dlp\xaa\x02\x13Google.Cloud.Dlp.V2\xca\x02\x13Google\\Cloud\\Dlp\\V2\xea\x02\x16Google::Cloud::Dlp::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.privacy.dlp.v2.storage_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.privacy.dlp.v2B\nDlpStorageP\001Z8google.golang.org/genproto/googleapis/privacy/dlp/v2;dlp\252\002\023Google.Cloud.Dlp.V2\312\002\023Google\\Cloud\\Dlp\\V2\352\002\026Google::Cloud::Dlp::V2'
  _HYBRIDOPTIONS_LABELSENTRY._options = None
  _HYBRIDOPTIONS_LABELSENTRY._serialized_options = b'8\001'
  _LIKELIHOOD._serialized_start=5011
  _LIKELIHOOD._serialized_end=5127
  _FILETYPE._serialized_start=5130
  _FILETYPE._serialized_end=5284
  _INFOTYPE._serialized_start=122
  _INFOTYPE._serialized_end=163
  _SENSITIVITYSCORE._serialized_start=166
  _SENSITIVITYSCORE._serialized_end=391
  _SENSITIVITYSCORE_SENSITIVITYSCORELEVEL._serialized_start=264
  _SENSITIVITYSCORE_SENSITIVITYSCORELEVEL._serialized_end=391
  _STOREDTYPE._serialized_start=393
  _STOREDTYPE._serialized_end=468
  _CUSTOMINFOTYPE._serialized_start=471
  _CUSTOMINFOTYPE._serialized_end=1951
  _CUSTOMINFOTYPE_DICTIONARY._serialized_start=1023
  _CUSTOMINFOTYPE_DICTIONARY._serialized_end=1223
  _CUSTOMINFOTYPE_DICTIONARY_WORDLIST._serialized_start=1188
  _CUSTOMINFOTYPE_DICTIONARY_WORDLIST._serialized_end=1213
  _CUSTOMINFOTYPE_REGEX._serialized_start=1225
  _CUSTOMINFOTYPE_REGEX._serialized_end=1272
  _CUSTOMINFOTYPE_SURROGATETYPE._serialized_start=1274
  _CUSTOMINFOTYPE_SURROGATETYPE._serialized_end=1289
  _CUSTOMINFOTYPE_DETECTIONRULE._serialized_start=1292
  _CUSTOMINFOTYPE_DETECTIONRULE._serialized_end=1866
  _CUSTOMINFOTYPE_DETECTIONRULE_PROXIMITY._serialized_start=1398
  _CUSTOMINFOTYPE_DETECTIONRULE_PROXIMITY._serialized_end=1454
  _CUSTOMINFOTYPE_DETECTIONRULE_LIKELIHOODADJUSTMENT._serialized_start=1457
  _CUSTOMINFOTYPE_DETECTIONRULE_LIKELIHOODADJUSTMENT._serialized_end=1587
  _CUSTOMINFOTYPE_DETECTIONRULE_HOTWORDRULE._serialized_start=1590
  _CUSTOMINFOTYPE_DETECTIONRULE_HOTWORDRULE._serialized_end=1858
  _CUSTOMINFOTYPE_EXCLUSIONTYPE._serialized_start=1868
  _CUSTOMINFOTYPE_EXCLUSIONTYPE._serialized_end=1943
  _FIELDID._serialized_start=1953
  _FIELDID._serialized_end=1976
  _PARTITIONID._serialized_start=1978
  _PARTITIONID._serialized_end=2033
  _KINDEXPRESSION._serialized_start=2035
  _KINDEXPRESSION._serialized_end=2065
  _DATASTOREOPTIONS._serialized_start=2068
  _DATASTOREOPTIONS._serialized_end=2197
  _CLOUDSTORAGEREGEXFILESET._serialized_start=2199
  _CLOUDSTORAGEREGEXFILESET._serialized_end=2292
  _CLOUDSTORAGEOPTIONS._serialized_start=2295
  _CLOUDSTORAGEOPTIONS._serialized_end=2787
  _CLOUDSTORAGEOPTIONS_FILESET._serialized_start=2618
  _CLOUDSTORAGEOPTIONS_FILESET._serialized_end=2713
  _CLOUDSTORAGEOPTIONS_SAMPLEMETHOD._serialized_start=2715
  _CLOUDSTORAGEOPTIONS_SAMPLEMETHOD._serialized_end=2787
  _CLOUDSTORAGEFILESET._serialized_start=2789
  _CLOUDSTORAGEFILESET._serialized_end=2823
  _CLOUDSTORAGEPATH._serialized_start=2825
  _CLOUDSTORAGEPATH._serialized_end=2857
  _BIGQUERYOPTIONS._serialized_start=2860
  _BIGQUERYOPTIONS._serialized_end=3312
  _BIGQUERYOPTIONS_SAMPLEMETHOD._serialized_start=2715
  _BIGQUERYOPTIONS_SAMPLEMETHOD._serialized_end=2787
  _STORAGECONFIG._serialized_start=3315
  _STORAGECONFIG._serialized_end=3917
  _STORAGECONFIG_TIMESPANCONFIG._serialized_start=3691
  _STORAGECONFIG_TIMESPANCONFIG._serialized_end=3909
  _HYBRIDOPTIONS._serialized_start=3920
  _HYBRIDOPTIONS._serialized_end=4166
  _HYBRIDOPTIONS_LABELSENTRY._serialized_start=4121
  _HYBRIDOPTIONS_LABELSENTRY._serialized_end=4166
  _BIGQUERYKEY._serialized_start=4168
  _BIGQUERYKEY._serialized_end=4264
  _DATASTOREKEY._serialized_start=4266
  _DATASTOREKEY._serialized_end=4328
  _KEY._serialized_start=4331
  _KEY._serialized_end=4518
  _KEY_PATHELEMENT._serialized_start=4450
  _KEY_PATHELEMENT._serialized_end=4518
  _RECORDKEY._serialized_start=4521
  _RECORDKEY._serialized_end=4682
  _BIGQUERYTABLE._serialized_start=4684
  _BIGQUERYTABLE._serialized_end=4757
  _BIGQUERYFIELD._serialized_start=4759
  _BIGQUERYFIELD._serialized_end=4874
  _ENTITYID._serialized_start=4876
  _ENTITYID._serialized_end=4933
  _TABLEOPTIONS._serialized_start=4935
  _TABLEOPTIONS._serialized_end=5009
# @@protoc_insertion_point(module_scope)