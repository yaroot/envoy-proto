# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2
from google.type import money_pb2 as google_dot_type_dot_money__pb2
from google.type import postal_address_pb2 as google_dot_type_dot_postal__address__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/cloud/talent/v4/common.proto\x12\x16google.cloud.talent.v4\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x18google/type/latlng.proto\x1a\x17google/type/money.proto\x1a google/type/postal_address.proto\"n\n\x0eTimestampRange\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xb2\x03\n\x08Location\x12\x44\n\rlocation_type\x18\x01 \x01(\x0e\x32-.google.cloud.talent.v4.Location.LocationType\x12\x32\n\x0epostal_address\x18\x02 \x01(\x0b\x32\x1a.google.type.PostalAddress\x12$\n\x07lat_lng\x18\x03 \x01(\x0b\x32\x13.google.type.LatLng\x12\x14\n\x0cradius_miles\x18\x04 \x01(\x01\"\xef\x01\n\x0cLocationType\x12\x1d\n\x19LOCATION_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x43OUNTRY\x10\x01\x12\x17\n\x13\x41\x44MINISTRATIVE_AREA\x10\x02\x12\x1b\n\x17SUB_ADMINISTRATIVE_AREA\x10\x03\x12\x0c\n\x08LOCALITY\x10\x04\x12\x0f\n\x0bPOSTAL_CODE\x10\x05\x12\x10\n\x0cSUB_LOCALITY\x10\x06\x12\x12\n\x0eSUB_LOCALITY_1\x10\x07\x12\x12\n\x0eSUB_LOCALITY_2\x10\x08\x12\x10\n\x0cNEIGHBORHOOD\x10\t\x12\x12\n\x0eSTREET_ADDRESS\x10\n\"\x9a\x01\n\x0fRequestMetadata\x12\x0e\n\x06\x64omain\x18\x01 \x01(\t\x12\x12\n\nsession_id\x18\x02 \x01(\t\x12\x0f\n\x07user_id\x18\x03 \x01(\t\x12\x19\n\x11\x61llow_missing_ids\x18\x04 \x01(\x08\x12\x37\n\x0b\x64\x65vice_info\x18\x05 \x01(\x0b\x32\".google.cloud.talent.v4.DeviceInfo\"&\n\x10ResponseMetadata\x12\x12\n\nrequest_id\x18\x01 \x01(\t\"\xca\x01\n\nDeviceInfo\x12\x42\n\x0b\x64\x65vice_type\x18\x01 \x01(\x0e\x32-.google.cloud.talent.v4.DeviceInfo.DeviceType\x12\n\n\x02id\x18\x02 \x01(\t\"l\n\nDeviceType\x12\x1b\n\x17\x44\x45VICE_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03WEB\x10\x01\x12\x0e\n\nMOBILE_WEB\x10\x02\x12\x0b\n\x07\x41NDROID\x10\x03\x12\x07\n\x03IOS\x10\x04\x12\x07\n\x03\x42OT\x10\x05\x12\t\n\x05OTHER\x10\x06\"m\n\x0f\x43ustomAttribute\x12\x15\n\rstring_values\x18\x01 \x03(\t\x12\x13\n\x0blong_values\x18\x02 \x03(\x03\x12\x12\n\nfilterable\x18\x03 \x01(\x08\x12\x1a\n\x12keyword_searchable\x18\x04 \x01(\x08\"W\n\x12SpellingCorrection\x12\x11\n\tcorrected\x18\x01 \x01(\x08\x12\x16\n\x0e\x63orrected_text\x18\x02 \x01(\t\x12\x16\n\x0e\x63orrected_html\x18\x03 \x01(\t\"\x88\t\n\x10\x43ompensationInfo\x12K\n\x07\x65ntries\x18\x01 \x03(\x0b\x32:.google.cloud.talent.v4.CompensationInfo.CompensationEntry\x12k\n\"annualized_base_compensation_range\x18\x02 \x01(\x0b\x32:.google.cloud.talent.v4.CompensationInfo.CompensationRangeB\x03\xe0\x41\x03\x12l\n#annualized_total_compensation_range\x18\x03 \x01(\x0b\x32:.google.cloud.talent.v4.CompensationInfo.CompensationRangeB\x03\xe0\x41\x03\x1a\x83\x03\n\x11\x43ompensationEntry\x12G\n\x04type\x18\x01 \x01(\x0e\x32\x39.google.cloud.talent.v4.CompensationInfo.CompensationType\x12G\n\x04unit\x18\x02 \x01(\x0e\x32\x39.google.cloud.talent.v4.CompensationInfo.CompensationUnit\x12$\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x12.google.type.MoneyH\x00\x12K\n\x05range\x18\x04 \x01(\x0b\x32:.google.cloud.talent.v4.CompensationInfo.CompensationRangeH\x00\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\x12=\n\x17\x65xpected_units_per_year\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.DoubleValueB\x15\n\x13\x63ompensation_amount\x1ao\n\x11\x43ompensationRange\x12,\n\x10max_compensation\x18\x02 \x01(\x0b\x32\x12.google.type.Money\x12,\n\x10min_compensation\x18\x01 \x01(\x0b\x32\x12.google.type.Money\"\xb5\x01\n\x10\x43ompensationType\x12!\n\x1d\x43OMPENSATION_TYPE_UNSPECIFIED\x10\x00\x12\x08\n\x04\x42\x41SE\x10\x01\x12\t\n\x05\x42ONUS\x10\x02\x12\x11\n\rSIGNING_BONUS\x10\x03\x12\n\n\x06\x45QUITY\x10\x04\x12\x12\n\x0ePROFIT_SHARING\x10\x05\x12\x0f\n\x0b\x43OMMISSIONS\x10\x06\x12\x08\n\x04TIPS\x10\x07\x12\x1b\n\x17OTHER_COMPENSATION_TYPE\x10\x08\"\x9c\x01\n\x10\x43ompensationUnit\x12!\n\x1d\x43OMPENSATION_UNIT_UNSPECIFIED\x10\x00\x12\n\n\x06HOURLY\x10\x01\x12\t\n\x05\x44\x41ILY\x10\x02\x12\n\n\x06WEEKLY\x10\x03\x12\x0b\n\x07MONTHLY\x10\x04\x12\n\n\x06YEARLY\x10\x05\x12\x0c\n\x08ONE_TIME\x10\x06\x12\x1b\n\x17OTHER_COMPENSATION_UNIT\x10\x07\"\xc7\x03\n\x16\x42\x61tchOperationMetadata\x12\x43\n\x05state\x18\x01 \x01(\x0e\x32\x34.google.cloud.talent.v4.BatchOperationMetadata.State\x12\x19\n\x11state_description\x18\x02 \x01(\t\x12\x15\n\rsuccess_count\x18\x03 \x01(\x05\x12\x15\n\rfailure_count\x18\x04 \x01(\x05\x12\x13\n\x0btotal_count\x18\x05 \x01(\x05\x12/\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"z\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x10\n\x0cINITIALIZING\x10\x01\x12\x0e\n\nPROCESSING\x10\x02\x12\r\n\tSUCCEEDED\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04\x12\x0e\n\nCANCELLING\x10\x05\x12\r\n\tCANCELLED\x10\x06*y\n\x0b\x43ompanySize\x12\x1c\n\x18\x43OMPANY_SIZE_UNSPECIFIED\x10\x00\x12\x08\n\x04MINI\x10\x01\x12\t\n\x05SMALL\x10\x02\x12\x0b\n\x07SMEDIUM\x10\x03\x12\n\n\x06MEDIUM\x10\x04\x12\x07\n\x03\x42IG\x10\x05\x12\n\n\x06\x42IGGER\x10\x06\x12\t\n\x05GIANT\x10\x07*\xe2\x01\n\nJobBenefit\x12\x1b\n\x17JOB_BENEFIT_UNSPECIFIED\x10\x00\x12\x0e\n\nCHILD_CARE\x10\x01\x12\n\n\x06\x44\x45NTAL\x10\x02\x12\x14\n\x10\x44OMESTIC_PARTNER\x10\x03\x12\x12\n\x0e\x46LEXIBLE_HOURS\x10\x04\x12\x0b\n\x07MEDICAL\x10\x05\x12\x12\n\x0eLIFE_INSURANCE\x10\x06\x12\x12\n\x0ePARENTAL_LEAVE\x10\x07\x12\x13\n\x0fRETIREMENT_PLAN\x10\x08\x12\r\n\tSICK_DAYS\x10\t\x12\x0c\n\x08VACATION\x10\n\x12\n\n\x06VISION\x10\x0b*\x8e\x02\n\nDegreeType\x12\x1b\n\x17\x44\x45GREE_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11PRIMARY_EDUCATION\x10\x01\x12\x1d\n\x19LOWER_SECONDARY_EDUCATION\x10\x02\x12\x1d\n\x19UPPER_SECONDARY_EDUCATION\x10\x03\x12\x1c\n\x18\x41\x44ULT_REMEDIAL_EDUCATION\x10\x04\x12\x1c\n\x18\x41SSOCIATES_OR_EQUIVALENT\x10\x05\x12\x1b\n\x17\x42\x41\x43HELORS_OR_EQUIVALENT\x10\x06\x12\x19\n\x15MASTERS_OR_EQUIVALENT\x10\x07\x12\x1a\n\x16\x44OCTORAL_OR_EQUIVALENT\x10\x08*\xdc\x01\n\x0e\x45mploymentType\x12\x1f\n\x1b\x45MPLOYMENT_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tFULL_TIME\x10\x01\x12\r\n\tPART_TIME\x10\x02\x12\x0e\n\nCONTRACTOR\x10\x03\x12\x14\n\x10\x43ONTRACT_TO_HIRE\x10\x04\x12\r\n\tTEMPORARY\x10\x05\x12\n\n\x06INTERN\x10\x06\x12\r\n\tVOLUNTEER\x10\x07\x12\x0c\n\x08PER_DIEM\x10\x08\x12\x12\n\x0e\x46LY_IN_FLY_OUT\x10\t\x12\x19\n\x15OTHER_EMPLOYMENT_TYPE\x10\n*q\n\x08JobLevel\x12\x19\n\x15JOB_LEVEL_UNSPECIFIED\x10\x00\x12\x0f\n\x0b\x45NTRY_LEVEL\x10\x01\x12\x0f\n\x0b\x45XPERIENCED\x10\x02\x12\x0b\n\x07MANAGER\x10\x03\x12\x0c\n\x08\x44IRECTOR\x10\x04\x12\r\n\tEXECUTIVE\x10\x05*\xba\x06\n\x0bJobCategory\x12\x1c\n\x18JOB_CATEGORY_UNSPECIFIED\x10\x00\x12\x1a\n\x16\x41\x43\x43OUNTING_AND_FINANCE\x10\x01\x12\x1d\n\x19\x41\x44MINISTRATIVE_AND_OFFICE\x10\x02\x12\x1d\n\x19\x41\x44VERTISING_AND_MARKETING\x10\x03\x12\x0f\n\x0b\x41NIMAL_CARE\x10\x04\x12\x1a\n\x16\x41RT_FASHION_AND_DESIGN\x10\x05\x12\x17\n\x13\x42USINESS_OPERATIONS\x10\x06\x12\x1b\n\x17\x43LEANING_AND_FACILITIES\x10\x07\x12\x13\n\x0f\x43OMPUTER_AND_IT\x10\x08\x12\x10\n\x0c\x43ONSTRUCTION\x10\t\x12\x14\n\x10\x43USTOMER_SERVICE\x10\n\x12\r\n\tEDUCATION\x10\x0b\x12\x1c\n\x18\x45NTERTAINMENT_AND_TRAVEL\x10\x0c\x12\x18\n\x14\x46\x41RMING_AND_OUTDOORS\x10\r\x12\x0e\n\nHEALTHCARE\x10\x0e\x12\x13\n\x0fHUMAN_RESOURCES\x10\x0f\x12\'\n#INSTALLATION_MAINTENANCE_AND_REPAIR\x10\x10\x12\t\n\x05LEGAL\x10\x11\x12\x0e\n\nMANAGEMENT\x10\x12\x12\x1f\n\x1bMANUFACTURING_AND_WAREHOUSE\x10\x13\x12$\n MEDIA_COMMUNICATIONS_AND_WRITING\x10\x14\x12\x16\n\x12OIL_GAS_AND_MINING\x10\x15\x12\x1e\n\x1aPERSONAL_CARE_AND_SERVICES\x10\x16\x12\x17\n\x13PROTECTIVE_SERVICES\x10\x17\x12\x0f\n\x0bREAL_ESTATE\x10\x18\x12\x1e\n\x1aRESTAURANT_AND_HOSPITALITY\x10\x19\x12\x14\n\x10SALES_AND_RETAIL\x10\x1a\x12\x1b\n\x17SCIENCE_AND_ENGINEERING\x10\x1b\x12\"\n\x1eSOCIAL_SERVICES_AND_NON_PROFIT\x10\x1c\x12!\n\x1dSPORTS_FITNESS_AND_RECREATION\x10\x1d\x12 \n\x1cTRANSPORTATION_AND_LOGISTICS\x10\x1e*e\n\rPostingRegion\x12\x1e\n\x1aPOSTING_REGION_UNSPECIFIED\x10\x00\x12\x17\n\x13\x41\x44MINISTRATIVE_AREA\x10\x01\x12\n\n\x06NATION\x10\x02\x12\x0f\n\x0bTELECOMMUTE\x10\x03*n\n\nVisibility\x12\x1a\n\x16VISIBILITY_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x41\x43\x43OUNT_ONLY\x10\x01\x12\x16\n\x12SHARED_WITH_GOOGLE\x10\x02\x12\x16\n\x12SHARED_WITH_PUBLIC\x10\x03\x1a\x02\x18\x01*q\n\x10HtmlSanitization\x12!\n\x1dHTML_SANITIZATION_UNSPECIFIED\x10\x00\x12\x1e\n\x1aHTML_SANITIZATION_DISABLED\x10\x01\x12\x1a\n\x16SIMPLE_FORMATTING_ONLY\x10\x02*{\n\rCommuteMethod\x12\x1e\n\x1a\x43OMMUTE_METHOD_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x44RIVING\x10\x01\x12\x0b\n\x07TRANSIT\x10\x02\x12\x0b\n\x07WALKING\x10\x03\x12\x0b\n\x07\x43YCLING\x10\x04\x12\x16\n\x12TRANSIT_ACCESSIBLE\x10\x05\x42o\n\x1a\x63om.google.cloud.talent.v4B\x0b\x43ommonProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.talent.v4B\013CommonProtoP\001Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\242\002\003CTS'
  _VISIBILITY._options = None
  _VISIBILITY._serialized_options = b'\030\001'
  _COMPENSATIONINFO.fields_by_name['annualized_base_compensation_range']._options = None
  _COMPENSATIONINFO.fields_by_name['annualized_base_compensation_range']._serialized_options = b'\340A\003'
  _COMPENSATIONINFO.fields_by_name['annualized_total_compensation_range']._options = None
  _COMPENSATIONINFO.fields_by_name['annualized_total_compensation_range']._serialized_options = b'\340A\003'
  _COMPANYSIZE._serialized_start=3018
  _COMPANYSIZE._serialized_end=3139
  _JOBBENEFIT._serialized_start=3142
  _JOBBENEFIT._serialized_end=3368
  _DEGREETYPE._serialized_start=3371
  _DEGREETYPE._serialized_end=3641
  _EMPLOYMENTTYPE._serialized_start=3644
  _EMPLOYMENTTYPE._serialized_end=3864
  _JOBLEVEL._serialized_start=3866
  _JOBLEVEL._serialized_end=3979
  _JOBCATEGORY._serialized_start=3982
  _JOBCATEGORY._serialized_end=4808
  _POSTINGREGION._serialized_start=4810
  _POSTINGREGION._serialized_end=4911
  _VISIBILITY._serialized_start=4913
  _VISIBILITY._serialized_end=5023
  _HTMLSANITIZATION._serialized_start=5025
  _HTMLSANITIZATION._serialized_end=5138
  _COMMUTEMETHOD._serialized_start=5140
  _COMMUTEMETHOD._serialized_end=5263
  _TIMESTAMPRANGE._serialized_start=246
  _TIMESTAMPRANGE._serialized_end=356
  _LOCATION._serialized_start=359
  _LOCATION._serialized_end=793
  _LOCATION_LOCATIONTYPE._serialized_start=554
  _LOCATION_LOCATIONTYPE._serialized_end=793
  _REQUESTMETADATA._serialized_start=796
  _REQUESTMETADATA._serialized_end=950
  _RESPONSEMETADATA._serialized_start=952
  _RESPONSEMETADATA._serialized_end=990
  _DEVICEINFO._serialized_start=993
  _DEVICEINFO._serialized_end=1195
  _DEVICEINFO_DEVICETYPE._serialized_start=1087
  _DEVICEINFO_DEVICETYPE._serialized_end=1195
  _CUSTOMATTRIBUTE._serialized_start=1197
  _CUSTOMATTRIBUTE._serialized_end=1306
  _SPELLINGCORRECTION._serialized_start=1308
  _SPELLINGCORRECTION._serialized_end=1395
  _COMPENSATIONINFO._serialized_start=1398
  _COMPENSATIONINFO._serialized_end=2558
  _COMPENSATIONINFO_COMPENSATIONENTRY._serialized_start=1715
  _COMPENSATIONINFO_COMPENSATIONENTRY._serialized_end=2102
  _COMPENSATIONINFO_COMPENSATIONRANGE._serialized_start=2104
  _COMPENSATIONINFO_COMPENSATIONRANGE._serialized_end=2215
  _COMPENSATIONINFO_COMPENSATIONTYPE._serialized_start=2218
  _COMPENSATIONINFO_COMPENSATIONTYPE._serialized_end=2399
  _COMPENSATIONINFO_COMPENSATIONUNIT._serialized_start=2402
  _COMPENSATIONINFO_COMPENSATIONUNIT._serialized_end=2558
  _BATCHOPERATIONMETADATA._serialized_start=2561
  _BATCHOPERATIONMETADATA._serialized_end=3016
  _BATCHOPERATIONMETADATA_STATE._serialized_start=2894
  _BATCHOPERATIONMETADATA_STATE._serialized_end=3016
# @@protoc_insertion_point(module_scope)
