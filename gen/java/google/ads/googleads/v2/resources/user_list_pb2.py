# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/resources/user_list.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v2.common import user_lists_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2
from google.ads.googleads.v2.enums import access_reason_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_access__reason__pb2
from google.ads.googleads.v2.enums import user_list_access_status_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__access__status__pb2
from google.ads.googleads.v2.enums import user_list_closing_reason_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__closing__reason__pb2
from google.ads.googleads.v2.enums import user_list_membership_status_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__membership__status__pb2
from google.ads.googleads.v2.enums import user_list_size_range_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__size__range__pb2
from google.ads.googleads.v2.enums import user_list_type_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/resources/user_list.proto',
  package='google.ads.googleads.v2.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v2.resourcesB\rUserListProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v2/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V2.Resources\312\002!Google\\Ads\\GoogleAds\\V2\\Resources\352\002%Google::Ads::GoogleAds::V2::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/ads/googleads/v2/resources/user_list.proto\x12!google.ads.googleads.v2.resources\x1a/google/ads/googleads/v2/common/user_lists.proto\x1a\x31google/ads/googleads/v2/enums/access_reason.proto\x1a;google/ads/googleads/v2/enums/user_list_access_status.proto\x1a<google/ads/googleads/v2/enums/user_list_closing_reason.proto\x1a?google/ads/googleads/v2/enums/user_list_membership_status.proto\x1a\x38google/ads/googleads/v2/enums/user_list_size_range.proto\x1a\x32google/ads/googleads/v2/enums/user_list_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xc0\x0e\n\x08UserList\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/UserList\x12,\n\x02id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12\x32\n\tread_only\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\x03\xe0\x41\x03\x12*\n\x04name\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x31\n\x0b\x64\x65scription\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12o\n\x11membership_status\x18\x06 \x01(\x0e\x32T.google.ads.googleads.v2.enums.UserListMembershipStatusEnum.UserListMembershipStatus\x12\x36\n\x10integration_code\x18\x07 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x39\n\x14membership_life_span\x18\x08 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12:\n\x10size_for_display\x18\t \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12k\n\x16size_range_for_display\x18\n \x01(\x0e\x32\x46.google.ads.googleads.v2.enums.UserListSizeRangeEnum.UserListSizeRangeB\x03\xe0\x41\x03\x12\x39\n\x0fsize_for_search\x18\x0b \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12j\n\x15size_range_for_search\x18\x0c \x01(\x0e\x32\x46.google.ads.googleads.v2.enums.UserListSizeRangeEnum.UserListSizeRangeB\x03\xe0\x41\x03\x12O\n\x04type\x18\r \x01(\x0e\x32<.google.ads.googleads.v2.enums.UserListTypeEnum.UserListTypeB\x03\xe0\x41\x03\x12\x66\n\x0e\x63losing_reason\x18\x0e \x01(\x0e\x32N.google.ads.googleads.v2.enums.UserListClosingReasonEnum.UserListClosingReason\x12X\n\raccess_reason\x18\x0f \x01(\x0e\x32<.google.ads.googleads.v2.enums.AccessReasonEnum.AccessReasonB\x03\xe0\x41\x03\x12n\n\x18\x61\x63\x63ount_user_list_status\x18\x10 \x01(\x0e\x32L.google.ads.googleads.v2.enums.UserListAccessStatusEnum.UserListAccessStatus\x12\x37\n\x13\x65ligible_for_search\x18\x11 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12=\n\x14\x65ligible_for_display\x18\x12 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\x03\xe0\x41\x03\x12S\n\x13\x63rm_based_user_list\x18\x13 \x01(\x0b\x32\x34.google.ads.googleads.v2.common.CrmBasedUserListInfoH\x00\x12U\n\x11similar_user_list\x18\x14 \x01(\x0b\x32\x33.google.ads.googleads.v2.common.SimilarUserListInfoB\x03\xe0\x41\x03H\x00\x12U\n\x14rule_based_user_list\x18\x15 \x01(\x0b\x32\x35.google.ads.googleads.v2.common.RuleBasedUserListInfoH\x00\x12P\n\x11logical_user_list\x18\x16 \x01(\x0b\x32\x33.google.ads.googleads.v2.common.LogicalUserListInfoH\x00\x12L\n\x0f\x62\x61sic_user_list\x18\x17 \x01(\x0b\x32\x31.google.ads.googleads.v2.common.BasicUserListInfoH\x00:R\xea\x41O\n!googleads.googleapis.com/UserList\x12*customers/{customer}/userLists/{user_list}B\x0b\n\tuser_listB\xfa\x01\n%com.google.ads.googleads.v2.resourcesB\rUserListProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v2/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V2.Resources\xca\x02!Google\\Ads\\GoogleAds\\V2\\Resources\xea\x02%Google::Ads::GoogleAds::V2::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_access__reason__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__access__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__closing__reason__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__membership__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__size__range__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_USERLIST = _descriptor.Descriptor(
  name='UserList',
  full_name='google.ads.googleads.v2.resources.UserList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.resources.UserList.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/UserList', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v2.resources.UserList.id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='read_only', full_name='google.ads.googleads.v2.resources.UserList.read_only', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v2.resources.UserList.name', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.ads.googleads.v2.resources.UserList.description', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='membership_status', full_name='google.ads.googleads.v2.resources.UserList.membership_status', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='integration_code', full_name='google.ads.googleads.v2.resources.UserList.integration_code', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='membership_life_span', full_name='google.ads.googleads.v2.resources.UserList.membership_life_span', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_for_display', full_name='google.ads.googleads.v2.resources.UserList.size_for_display', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_range_for_display', full_name='google.ads.googleads.v2.resources.UserList.size_range_for_display', index=9,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_for_search', full_name='google.ads.googleads.v2.resources.UserList.size_for_search', index=10,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='size_range_for_search', full_name='google.ads.googleads.v2.resources.UserList.size_range_for_search', index=11,
      number=12, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v2.resources.UserList.type', index=12,
      number=13, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='closing_reason', full_name='google.ads.googleads.v2.resources.UserList.closing_reason', index=13,
      number=14, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='access_reason', full_name='google.ads.googleads.v2.resources.UserList.access_reason', index=14,
      number=15, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='account_user_list_status', full_name='google.ads.googleads.v2.resources.UserList.account_user_list_status', index=15,
      number=16, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eligible_for_search', full_name='google.ads.googleads.v2.resources.UserList.eligible_for_search', index=16,
      number=17, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eligible_for_display', full_name='google.ads.googleads.v2.resources.UserList.eligible_for_display', index=17,
      number=18, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='crm_based_user_list', full_name='google.ads.googleads.v2.resources.UserList.crm_based_user_list', index=18,
      number=19, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='similar_user_list', full_name='google.ads.googleads.v2.resources.UserList.similar_user_list', index=19,
      number=20, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rule_based_user_list', full_name='google.ads.googleads.v2.resources.UserList.rule_based_user_list', index=20,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='logical_user_list', full_name='google.ads.googleads.v2.resources.UserList.logical_user_list', index=21,
      number=22, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='basic_user_list', full_name='google.ads.googleads.v2.resources.UserList.basic_user_list', index=22,
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
  serialized_options=b'\352AO\n!googleads.googleapis.com/UserList\022*customers/{customer}/userLists/{user_list}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='user_list', full_name='google.ads.googleads.v2.resources.UserList.user_list',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=609,
  serialized_end=2465,
)

_USERLIST.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_USERLIST.fields_by_name['read_only'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_USERLIST.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERLIST.fields_by_name['description'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERLIST.fields_by_name['membership_status'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__membership__status__pb2._USERLISTMEMBERSHIPSTATUSENUM_USERLISTMEMBERSHIPSTATUS
_USERLIST.fields_by_name['integration_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_USERLIST.fields_by_name['membership_life_span'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_USERLIST.fields_by_name['size_for_display'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_USERLIST.fields_by_name['size_range_for_display'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__size__range__pb2._USERLISTSIZERANGEENUM_USERLISTSIZERANGE
_USERLIST.fields_by_name['size_for_search'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_USERLIST.fields_by_name['size_range_for_search'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__size__range__pb2._USERLISTSIZERANGEENUM_USERLISTSIZERANGE
_USERLIST.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__type__pb2._USERLISTTYPEENUM_USERLISTTYPE
_USERLIST.fields_by_name['closing_reason'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__closing__reason__pb2._USERLISTCLOSINGREASONENUM_USERLISTCLOSINGREASON
_USERLIST.fields_by_name['access_reason'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_access__reason__pb2._ACCESSREASONENUM_ACCESSREASON
_USERLIST.fields_by_name['account_user_list_status'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_user__list__access__status__pb2._USERLISTACCESSSTATUSENUM_USERLISTACCESSSTATUS
_USERLIST.fields_by_name['eligible_for_search'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_USERLIST.fields_by_name['eligible_for_display'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_USERLIST.fields_by_name['crm_based_user_list'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2._CRMBASEDUSERLISTINFO
_USERLIST.fields_by_name['similar_user_list'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2._SIMILARUSERLISTINFO
_USERLIST.fields_by_name['rule_based_user_list'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2._RULEBASEDUSERLISTINFO
_USERLIST.fields_by_name['logical_user_list'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2._LOGICALUSERLISTINFO
_USERLIST.fields_by_name['basic_user_list'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_common_dot_user__lists__pb2._BASICUSERLISTINFO
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
DESCRIPTOR.message_types_by_name['UserList'] = _USERLIST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UserList = _reflection.GeneratedProtocolMessageType('UserList', (_message.Message,), {
  'DESCRIPTOR' : _USERLIST,
  '__module__' : 'google.ads.googleads.v2.resources.user_list_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.UserList)
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
_USERLIST.fields_by_name['similar_user_list']._options = None
_USERLIST._options = None
# @@protoc_insertion_point(module_scope)
