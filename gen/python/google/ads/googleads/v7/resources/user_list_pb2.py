# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/user_list.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.common import user_lists_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2
from google.ads.googleads.v7.enums import access_reason_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_access__reason__pb2
from google.ads.googleads.v7.enums import user_list_access_status_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__access__status__pb2
from google.ads.googleads.v7.enums import user_list_closing_reason_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__closing__reason__pb2
from google.ads.googleads.v7.enums import user_list_membership_status_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__membership__status__pb2
from google.ads.googleads.v7.enums import user_list_size_range_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__size__range__pb2
from google.ads.googleads.v7.enums import user_list_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/user_list.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\rUserListProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/ads/googleads/v7/resources/user_list.proto\x12!google.ads.googleads.v7.resources\x1a/google/ads/googleads/v7/common/user_lists.proto\x1a\x31google/ads/googleads/v7/enums/access_reason.proto\x1a;google/ads/googleads/v7/enums/user_list_access_status.proto\x1a<google/ads/googleads/v7/enums/user_list_closing_reason.proto\x1a?google/ads/googleads/v7/enums/user_list_membership_status.proto\x1a\x38google/ads/googleads/v7/enums/user_list_size_range.proto\x1a\x32google/ads/googleads/v7/enums/user_list_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xcf\x0e\n\x08UserList\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/UserList\x12\x14\n\x02id\x18\x19 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1b\n\tread_only\x18\x1a \x01(\x08\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x11\n\x04name\x18\x1b \x01(\tH\x03\x88\x01\x01\x12\x18\n\x0b\x64\x65scription\x18\x1c \x01(\tH\x04\x88\x01\x01\x12o\n\x11membership_status\x18\x06 \x01(\x0e\x32T.google.ads.googleads.v7.enums.UserListMembershipStatusEnum.UserListMembershipStatus\x12\x1d\n\x10integration_code\x18\x1d \x01(\tH\x05\x88\x01\x01\x12!\n\x14membership_life_span\x18\x1e \x01(\x03H\x06\x88\x01\x01\x12\"\n\x10size_for_display\x18\x1f \x01(\x03\x42\x03\xe0\x41\x03H\x07\x88\x01\x01\x12k\n\x16size_range_for_display\x18\n \x01(\x0e\x32\x46.google.ads.googleads.v7.enums.UserListSizeRangeEnum.UserListSizeRangeB\x03\xe0\x41\x03\x12!\n\x0fsize_for_search\x18  \x01(\x03\x42\x03\xe0\x41\x03H\x08\x88\x01\x01\x12j\n\x15size_range_for_search\x18\x0c \x01(\x0e\x32\x46.google.ads.googleads.v7.enums.UserListSizeRangeEnum.UserListSizeRangeB\x03\xe0\x41\x03\x12O\n\x04type\x18\r \x01(\x0e\x32<.google.ads.googleads.v7.enums.UserListTypeEnum.UserListTypeB\x03\xe0\x41\x03\x12\x66\n\x0e\x63losing_reason\x18\x0e \x01(\x0e\x32N.google.ads.googleads.v7.enums.UserListClosingReasonEnum.UserListClosingReason\x12X\n\raccess_reason\x18\x0f \x01(\x0e\x32<.google.ads.googleads.v7.enums.AccessReasonEnum.AccessReasonB\x03\xe0\x41\x03\x12n\n\x18\x61\x63\x63ount_user_list_status\x18\x10 \x01(\x0e\x32L.google.ads.googleads.v7.enums.UserListAccessStatusEnum.UserListAccessStatus\x12 \n\x13\x65ligible_for_search\x18! \x01(\x08H\t\x88\x01\x01\x12&\n\x14\x65ligible_for_display\x18\" \x01(\x08\x42\x03\xe0\x41\x03H\n\x88\x01\x01\x12\'\n\x15match_rate_percentage\x18\x18 \x01(\x05\x42\x03\xe0\x41\x03H\x0b\x88\x01\x01\x12S\n\x13\x63rm_based_user_list\x18\x13 \x01(\x0b\x32\x34.google.ads.googleads.v7.common.CrmBasedUserListInfoH\x00\x12U\n\x11similar_user_list\x18\x14 \x01(\x0b\x32\x33.google.ads.googleads.v7.common.SimilarUserListInfoB\x03\xe0\x41\x03H\x00\x12U\n\x14rule_based_user_list\x18\x15 \x01(\x0b\x32\x35.google.ads.googleads.v7.common.RuleBasedUserListInfoH\x00\x12P\n\x11logical_user_list\x18\x16 \x01(\x0b\x32\x33.google.ads.googleads.v7.common.LogicalUserListInfoH\x00\x12L\n\x0f\x62\x61sic_user_list\x18\x17 \x01(\x0b\x32\x31.google.ads.googleads.v7.common.BasicUserListInfoH\x00:X\xea\x41U\n!googleads.googleapis.com/UserList\x12\x30\x63ustomers/{customer_id}/userLists/{user_list_id}B\x0b\n\tuser_listB\x05\n\x03_idB\x0c\n\n_read_onlyB\x07\n\x05_nameB\x0e\n\x0c_descriptionB\x13\n\x11_integration_codeB\x17\n\x15_membership_life_spanB\x13\n\x11_size_for_displayB\x12\n\x10_size_for_searchB\x16\n\x14_eligible_for_searchB\x17\n\x15_eligible_for_displayB\x18\n\x16_match_rate_percentageB\xfa\x01\n%com.google.ads.googleads.v7.resourcesB\rUserListProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_access__reason__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__access__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__closing__reason__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__membership__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__size__range__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_USERLIST = _descriptor.Descriptor(
  name='UserList',
  full_name='google.ads.googleads.v7.resources.UserList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.UserList.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/UserList', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v7.resources.UserList.id', index=1,
      number=25, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_only', full_name='google.ads.googleads.v7.resources.UserList.read_only', index=2,
      number=26, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v7.resources.UserList.name', index=3,
      number=27, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.ads.googleads.v7.resources.UserList.description', index=4,
      number=28, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='membership_status', full_name='google.ads.googleads.v7.resources.UserList.membership_status', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='integration_code', full_name='google.ads.googleads.v7.resources.UserList.integration_code', index=6,
      number=29, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='membership_life_span', full_name='google.ads.googleads.v7.resources.UserList.membership_life_span', index=7,
      number=30, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_for_display', full_name='google.ads.googleads.v7.resources.UserList.size_for_display', index=8,
      number=31, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_range_for_display', full_name='google.ads.googleads.v7.resources.UserList.size_range_for_display', index=9,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_for_search', full_name='google.ads.googleads.v7.resources.UserList.size_for_search', index=10,
      number=32, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_range_for_search', full_name='google.ads.googleads.v7.resources.UserList.size_range_for_search', index=11,
      number=12, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v7.resources.UserList.type', index=12,
      number=13, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='closing_reason', full_name='google.ads.googleads.v7.resources.UserList.closing_reason', index=13,
      number=14, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='access_reason', full_name='google.ads.googleads.v7.resources.UserList.access_reason', index=14,
      number=15, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='account_user_list_status', full_name='google.ads.googleads.v7.resources.UserList.account_user_list_status', index=15,
      number=16, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eligible_for_search', full_name='google.ads.googleads.v7.resources.UserList.eligible_for_search', index=16,
      number=33, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eligible_for_display', full_name='google.ads.googleads.v7.resources.UserList.eligible_for_display', index=17,
      number=34, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='match_rate_percentage', full_name='google.ads.googleads.v7.resources.UserList.match_rate_percentage', index=18,
      number=24, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='crm_based_user_list', full_name='google.ads.googleads.v7.resources.UserList.crm_based_user_list', index=19,
      number=19, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='similar_user_list', full_name='google.ads.googleads.v7.resources.UserList.similar_user_list', index=20,
      number=20, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rule_based_user_list', full_name='google.ads.googleads.v7.resources.UserList.rule_based_user_list', index=21,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='logical_user_list', full_name='google.ads.googleads.v7.resources.UserList.logical_user_list', index=22,
      number=22, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='basic_user_list', full_name='google.ads.googleads.v7.resources.UserList.basic_user_list', index=23,
      number=23, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\352AU\n!googleads.googleapis.com/UserList\0220customers/{customer_id}/userLists/{user_list_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='user_list', full_name='google.ads.googleads.v7.resources.UserList.user_list',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v7.resources.UserList._id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_read_only', full_name='google.ads.googleads.v7.resources.UserList._read_only',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_name', full_name='google.ads.googleads.v7.resources.UserList._name',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_description', full_name='google.ads.googleads.v7.resources.UserList._description',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_integration_code', full_name='google.ads.googleads.v7.resources.UserList._integration_code',
      index=5, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_membership_life_span', full_name='google.ads.googleads.v7.resources.UserList._membership_life_span',
      index=6, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_size_for_display', full_name='google.ads.googleads.v7.resources.UserList._size_for_display',
      index=7, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_size_for_search', full_name='google.ads.googleads.v7.resources.UserList._size_for_search',
      index=8, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_eligible_for_search', full_name='google.ads.googleads.v7.resources.UserList._eligible_for_search',
      index=9, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_eligible_for_display', full_name='google.ads.googleads.v7.resources.UserList._eligible_for_display',
      index=10, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_match_rate_percentage', full_name='google.ads.googleads.v7.resources.UserList._match_rate_percentage',
      index=11, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=577,
  serialized_end=2448,
)

_USERLIST.fields_by_name['membership_status'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__membership__status__pb2._USERLISTMEMBERSHIPSTATUSENUM_USERLISTMEMBERSHIPSTATUS
_USERLIST.fields_by_name['size_range_for_display'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__size__range__pb2._USERLISTSIZERANGEENUM_USERLISTSIZERANGE
_USERLIST.fields_by_name['size_range_for_search'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__size__range__pb2._USERLISTSIZERANGEENUM_USERLISTSIZERANGE
_USERLIST.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__type__pb2._USERLISTTYPEENUM_USERLISTTYPE
_USERLIST.fields_by_name['closing_reason'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__closing__reason__pb2._USERLISTCLOSINGREASONENUM_USERLISTCLOSINGREASON
_USERLIST.fields_by_name['access_reason'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_access__reason__pb2._ACCESSREASONENUM_ACCESSREASON
_USERLIST.fields_by_name['account_user_list_status'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_user__list__access__status__pb2._USERLISTACCESSSTATUSENUM_USERLISTACCESSSTATUS
_USERLIST.fields_by_name['crm_based_user_list'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2._CRMBASEDUSERLISTINFO
_USERLIST.fields_by_name['similar_user_list'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2._SIMILARUSERLISTINFO
_USERLIST.fields_by_name['rule_based_user_list'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2._RULEBASEDUSERLISTINFO
_USERLIST.fields_by_name['logical_user_list'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2._LOGICALUSERLISTINFO
_USERLIST.fields_by_name['basic_user_list'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_user__lists__pb2._BASICUSERLISTINFO
_USERLIST.oneofs_by_name['user_list'].fields.append(
  _USERLIST.fields_by_name['crm_based_user_list'])
_USERLIST.fields_by_name['crm_based_user_list'].containing_oneof = _USERLIST.oneofs_by_name['user_list']
_USERLIST.oneofs_by_name['user_list'].fields.append(
  _USERLIST.fields_by_name['similar_user_list'])
_USERLIST.fields_by_name['similar_user_list'].containing_oneof = _USERLIST.oneofs_by_name['user_list']
_USERLIST.oneofs_by_name['user_list'].fields.append(
  _USERLIST.fields_by_name['rule_based_user_list'])
_USERLIST.fields_by_name['rule_based_user_list'].containing_oneof = _USERLIST.oneofs_by_name['user_list']
_USERLIST.oneofs_by_name['user_list'].fields.append(
  _USERLIST.fields_by_name['logical_user_list'])
_USERLIST.fields_by_name['logical_user_list'].containing_oneof = _USERLIST.oneofs_by_name['user_list']
_USERLIST.oneofs_by_name['user_list'].fields.append(
  _USERLIST.fields_by_name['basic_user_list'])
_USERLIST.fields_by_name['basic_user_list'].containing_oneof = _USERLIST.oneofs_by_name['user_list']
_USERLIST.oneofs_by_name['_id'].fields.append(
  _USERLIST.fields_by_name['id'])
_USERLIST.fields_by_name['id'].containing_oneof = _USERLIST.oneofs_by_name['_id']
_USERLIST.oneofs_by_name['_read_only'].fields.append(
  _USERLIST.fields_by_name['read_only'])
_USERLIST.fields_by_name['read_only'].containing_oneof = _USERLIST.oneofs_by_name['_read_only']
_USERLIST.oneofs_by_name['_name'].fields.append(
  _USERLIST.fields_by_name['name'])
_USERLIST.fields_by_name['name'].containing_oneof = _USERLIST.oneofs_by_name['_name']
_USERLIST.oneofs_by_name['_description'].fields.append(
  _USERLIST.fields_by_name['description'])
_USERLIST.fields_by_name['description'].containing_oneof = _USERLIST.oneofs_by_name['_description']
_USERLIST.oneofs_by_name['_integration_code'].fields.append(
  _USERLIST.fields_by_name['integration_code'])
_USERLIST.fields_by_name['integration_code'].containing_oneof = _USERLIST.oneofs_by_name['_integration_code']
_USERLIST.oneofs_by_name['_membership_life_span'].fields.append(
  _USERLIST.fields_by_name['membership_life_span'])
_USERLIST.fields_by_name['membership_life_span'].containing_oneof = _USERLIST.oneofs_by_name['_membership_life_span']
_USERLIST.oneofs_by_name['_size_for_display'].fields.append(
  _USERLIST.fields_by_name['size_for_display'])
_USERLIST.fields_by_name['size_for_display'].containing_oneof = _USERLIST.oneofs_by_name['_size_for_display']
_USERLIST.oneofs_by_name['_size_for_search'].fields.append(
  _USERLIST.fields_by_name['size_for_search'])
_USERLIST.fields_by_name['size_for_search'].containing_oneof = _USERLIST.oneofs_by_name['_size_for_search']
_USERLIST.oneofs_by_name['_eligible_for_search'].fields.append(
  _USERLIST.fields_by_name['eligible_for_search'])
_USERLIST.fields_by_name['eligible_for_search'].containing_oneof = _USERLIST.oneofs_by_name['_eligible_for_search']
_USERLIST.oneofs_by_name['_eligible_for_display'].fields.append(
  _USERLIST.fields_by_name['eligible_for_display'])
_USERLIST.fields_by_name['eligible_for_display'].containing_oneof = _USERLIST.oneofs_by_name['_eligible_for_display']
_USERLIST.oneofs_by_name['_match_rate_percentage'].fields.append(
  _USERLIST.fields_by_name['match_rate_percentage'])
_USERLIST.fields_by_name['match_rate_percentage'].containing_oneof = _USERLIST.oneofs_by_name['_match_rate_percentage']
DESCRIPTOR.message_types_by_name['UserList'] = _USERLIST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UserList = _reflection.GeneratedProtocolMessageType('UserList', (_message.Message,), {
  'DESCRIPTOR' : _USERLIST,
  '__module__' : 'google.ads.googleads.v7.resources.user_list_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.UserList)
  })
_sym_db.RegisterMessage(UserList)


DESCRIPTOR._options = None
_USERLIST.fields_by_name['resource_name']._options = None
_USERLIST.fields_by_name['id']._options = None
_USERLIST.fields_by_name['read_only']._options = None
_USERLIST.fields_by_name['size_for_display']._options = None
_USERLIST.fields_by_name['size_range_for_display']._options = None
_USERLIST.fields_by_name['size_for_search']._options = None
_USERLIST.fields_by_name['size_range_for_search']._options = None
_USERLIST.fields_by_name['type']._options = None
_USERLIST.fields_by_name['access_reason']._options = None
_USERLIST.fields_by_name['eligible_for_display']._options = None
_USERLIST.fields_by_name['match_rate_percentage']._options = None
_USERLIST.fields_by_name['similar_user_list']._options = None
_USERLIST._options = None
# @@protoc_insertion_point(module_scope)
