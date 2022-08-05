# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/common/criteria.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import age_range_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_age__range__type__pb2
from google.ads.googleads.v10.enums import app_payment_model_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_app__payment__model__type__pb2
from google.ads.googleads.v10.enums import content_label_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_content__label__type__pb2
from google.ads.googleads.v10.enums import day_of_week_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_day__of__week__pb2
from google.ads.googleads.v10.enums import device_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_device__pb2
from google.ads.googleads.v10.enums import gender_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_gender__type__pb2
from google.ads.googleads.v10.enums import hotel_date_selection_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_hotel__date__selection__type__pb2
from google.ads.googleads.v10.enums import income_range_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_income__range__type__pb2
from google.ads.googleads.v10.enums import interaction_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_interaction__type__pb2
from google.ads.googleads.v10.enums import keyword_match_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_keyword__match__type__pb2
from google.ads.googleads.v10.enums import listing_group_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_listing__group__type__pb2
from google.ads.googleads.v10.enums import location_group_radius_units_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_location__group__radius__units__pb2
from google.ads.googleads.v10.enums import minute_of_hour_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_minute__of__hour__pb2
from google.ads.googleads.v10.enums import parental_status_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_parental__status__type__pb2
from google.ads.googleads.v10.enums import preferred_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_preferred__content__type__pb2
from google.ads.googleads.v10.enums import product_bidding_category_level_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_product__bidding__category__level__pb2
from google.ads.googleads.v10.enums import product_channel_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_product__channel__pb2
from google.ads.googleads.v10.enums import product_channel_exclusivity_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_product__channel__exclusivity__pb2
from google.ads.googleads.v10.enums import product_condition_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_product__condition__pb2
from google.ads.googleads.v10.enums import product_custom_attribute_index_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_product__custom__attribute__index__pb2
from google.ads.googleads.v10.enums import product_type_level_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_product__type__level__pb2
from google.ads.googleads.v10.enums import proximity_radius_units_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_proximity__radius__units__pb2
from google.ads.googleads.v10.enums import webpage_condition_operand_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_webpage__condition__operand__pb2
from google.ads.googleads.v10.enums import webpage_condition_operator_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_webpage__condition__operator__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/ads/googleads/v10/common/criteria.proto\x12\x1fgoogle.ads.googleads.v10.common\x1a\x33google/ads/googleads/v10/enums/age_range_type.proto\x1a;google/ads/googleads/v10/enums/app_payment_model_type.proto\x1a\x37google/ads/googleads/v10/enums/content_label_type.proto\x1a\x30google/ads/googleads/v10/enums/day_of_week.proto\x1a+google/ads/googleads/v10/enums/device.proto\x1a\x30google/ads/googleads/v10/enums/gender_type.proto\x1a>google/ads/googleads/v10/enums/hotel_date_selection_type.proto\x1a\x36google/ads/googleads/v10/enums/income_range_type.proto\x1a\x35google/ads/googleads/v10/enums/interaction_type.proto\x1a\x37google/ads/googleads/v10/enums/keyword_match_type.proto\x1a\x37google/ads/googleads/v10/enums/listing_group_type.proto\x1a@google/ads/googleads/v10/enums/location_group_radius_units.proto\x1a\x33google/ads/googleads/v10/enums/minute_of_hour.proto\x1a\x39google/ads/googleads/v10/enums/parental_status_type.proto\x1a;google/ads/googleads/v10/enums/preferred_content_type.proto\x1a\x43google/ads/googleads/v10/enums/product_bidding_category_level.proto\x1a\x34google/ads/googleads/v10/enums/product_channel.proto\x1a@google/ads/googleads/v10/enums/product_channel_exclusivity.proto\x1a\x36google/ads/googleads/v10/enums/product_condition.proto\x1a\x43google/ads/googleads/v10/enums/product_custom_attribute_index.proto\x1a\x37google/ads/googleads/v10/enums/product_type_level.proto\x1a;google/ads/googleads/v10/enums/proximity_radius_units.proto\x1a>google/ads/googleads/v10/enums/webpage_condition_operand.proto\x1a?google/ads/googleads/v10/enums/webpage_condition_operator.proto\"\x84\x01\n\x0bKeywordInfo\x12\x11\n\x04text\x18\x03 \x01(\tH\x00\x88\x01\x01\x12Y\n\nmatch_type\x18\x02 \x01(\x0e\x32\x45.google.ads.googleads.v10.enums.KeywordMatchTypeEnum.KeywordMatchTypeB\x07\n\x05_text\")\n\rPlacementInfo\x12\x10\n\x03url\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x06\n\x04_url\"c\n\x15MobileAppCategoryInfo\x12)\n\x1cmobile_app_category_constant\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x1f\n\x1d_mobile_app_category_constant\"S\n\x15MobileApplicationInfo\x12\x13\n\x06\x61pp_id\x18\x04 \x01(\tH\x00\x88\x01\x01\x12\x11\n\x04name\x18\x05 \x01(\tH\x01\x88\x01\x01\x42\t\n\x07_app_idB\x07\n\x05_name\"H\n\x0cLocationInfo\x12 \n\x13geo_target_constant\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x16\n\x14_geo_target_constant\"M\n\nDeviceInfo\x12?\n\x04type\x18\x01 \x01(\x0e\x32\x31.google.ads.googleads.v10.enums.DeviceEnum.Device\"s\n\x14PreferredContentInfo\x12[\n\x04type\x18\x02 \x01(\x0e\x32M.google.ads.googleads.v10.enums.PreferredContentTypeEnum.PreferredContentType\"\xf8\x01\n\x10ListingGroupInfo\x12S\n\x04type\x18\x01 \x01(\x0e\x32\x45.google.ads.googleads.v10.enums.ListingGroupTypeEnum.ListingGroupType\x12I\n\ncase_value\x18\x02 \x01(\x0b\x32\x35.google.ads.googleads.v10.common.ListingDimensionInfo\x12&\n\x19parent_ad_group_criterion\x18\x04 \x01(\tH\x00\x88\x01\x01\x42\x1c\n\x1a_parent_ad_group_criterion\"]\n\x10ListingScopeInfo\x12I\n\ndimensions\x18\x02 \x03(\x0b\x32\x35.google.ads.googleads.v10.common.ListingDimensionInfo\"\xfd\x0b\n\x14ListingDimensionInfo\x12@\n\x08hotel_id\x18\x02 \x01(\x0b\x32,.google.ads.googleads.v10.common.HotelIdInfoH\x00\x12\x46\n\x0bhotel_class\x18\x03 \x01(\x0b\x32/.google.ads.googleads.v10.common.HotelClassInfoH\x00\x12W\n\x14hotel_country_region\x18\x04 \x01(\x0b\x32\x37.google.ads.googleads.v10.common.HotelCountryRegionInfoH\x00\x12\x46\n\x0bhotel_state\x18\x05 \x01(\x0b\x32/.google.ads.googleads.v10.common.HotelStateInfoH\x00\x12\x44\n\nhotel_city\x18\x06 \x01(\x0b\x32..google.ads.googleads.v10.common.HotelCityInfoH\x00\x12_\n\x18product_bidding_category\x18\r \x01(\x0b\x32;.google.ads.googleads.v10.common.ProductBiddingCategoryInfoH\x00\x12J\n\rproduct_brand\x18\x0f \x01(\x0b\x32\x31.google.ads.googleads.v10.common.ProductBrandInfoH\x00\x12N\n\x0fproduct_channel\x18\x08 \x01(\x0b\x32\x33.google.ads.googleads.v10.common.ProductChannelInfoH\x00\x12\x65\n\x1bproduct_channel_exclusivity\x18\t \x01(\x0b\x32>.google.ads.googleads.v10.common.ProductChannelExclusivityInfoH\x00\x12R\n\x11product_condition\x18\n \x01(\x0b\x32\x35.google.ads.googleads.v10.common.ProductConditionInfoH\x00\x12_\n\x18product_custom_attribute\x18\x10 \x01(\x0b\x32;.google.ads.googleads.v10.common.ProductCustomAttributeInfoH\x00\x12M\n\x0fproduct_item_id\x18\x0b \x01(\x0b\x32\x32.google.ads.googleads.v10.common.ProductItemIdInfoH\x00\x12H\n\x0cproduct_type\x18\x0c \x01(\x0b\x32\x30.google.ads.googleads.v10.common.ProductTypeInfoH\x00\x12P\n\x10product_grouping\x18\x11 \x01(\x0b\x32\x34.google.ads.googleads.v10.common.ProductGroupingInfoH\x00\x12L\n\x0eproduct_labels\x18\x12 \x01(\x0b\x32\x32.google.ads.googleads.v10.common.ProductLabelsInfoH\x00\x12_\n\x18product_legacy_condition\x18\x13 \x01(\x0b\x32;.google.ads.googleads.v10.common.ProductLegacyConditionInfoH\x00\x12Q\n\x11product_type_full\x18\x14 \x01(\x0b\x32\x34.google.ads.googleads.v10.common.ProductTypeFullInfoH\x00\x12\x61\n\x19unknown_listing_dimension\x18\x0e \x01(\x0b\x32<.google.ads.googleads.v10.common.UnknownListingDimensionInfoH\x00\x42\x0b\n\tdimension\"+\n\x0bHotelIdInfo\x12\x12\n\x05value\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\".\n\x0eHotelClassInfo\x12\x12\n\x05value\x18\x02 \x01(\x03H\x00\x88\x01\x01\x42\x08\n\x06_value\"\\\n\x16HotelCountryRegionInfo\x12%\n\x18\x63ountry_region_criterion\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x1b\n\x19_country_region_criterion\"B\n\x0eHotelStateInfo\x12\x1c\n\x0fstate_criterion\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x12\n\x10_state_criterion\"?\n\rHotelCityInfo\x12\x1b\n\x0e\x63ity_criterion\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x11\n\x0f_city_criterion\"\xcc\x01\n\x1aProductBiddingCategoryInfo\x12\x0f\n\x02id\x18\x04 \x01(\x03H\x00\x88\x01\x01\x12\x19\n\x0c\x63ountry_code\x18\x05 \x01(\tH\x01\x88\x01\x01\x12j\n\x05level\x18\x03 \x01(\x0e\x32[.google.ads.googleads.v10.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevelB\x05\n\x03_idB\x0f\n\r_country_code\"0\n\x10ProductBrandInfo\x12\x12\n\x05value\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\"h\n\x12ProductChannelInfo\x12R\n\x07\x63hannel\x18\x01 \x01(\x0e\x32\x41.google.ads.googleads.v10.enums.ProductChannelEnum.ProductChannel\"\x95\x01\n\x1dProductChannelExclusivityInfo\x12t\n\x13\x63hannel_exclusivity\x18\x01 \x01(\x0e\x32W.google.ads.googleads.v10.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity\"p\n\x14ProductConditionInfo\x12X\n\tcondition\x18\x01 \x01(\x0e\x32\x45.google.ads.googleads.v10.enums.ProductConditionEnum.ProductCondition\"\xa6\x01\n\x1aProductCustomAttributeInfo\x12\x12\n\x05value\x18\x03 \x01(\tH\x00\x88\x01\x01\x12j\n\x05index\x18\x02 \x01(\x0e\x32[.google.ads.googleads.v10.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndexB\x08\n\x06_value\"1\n\x11ProductItemIdInfo\x12\x12\n\x05value\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\"\x85\x01\n\x0fProductTypeInfo\x12\x12\n\x05value\x18\x03 \x01(\tH\x00\x88\x01\x01\x12T\n\x05level\x18\x02 \x01(\x0e\x32\x45.google.ads.googleads.v10.enums.ProductTypeLevelEnum.ProductTypeLevelB\x08\n\x06_value\"3\n\x13ProductGroupingInfo\x12\x12\n\x05value\x18\x01 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\"1\n\x11ProductLabelsInfo\x12\x12\n\x05value\x18\x01 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\":\n\x1aProductLegacyConditionInfo\x12\x12\n\x05value\x18\x01 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\"3\n\x13ProductTypeFullInfo\x12\x12\n\x05value\x18\x01 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_value\"\x1d\n\x1bUnknownListingDimensionInfo\"}\n\x1aHotelDateSelectionTypeInfo\x12_\n\x04type\x18\x01 \x01(\x0e\x32Q.google.ads.googleads.v10.enums.HotelDateSelectionTypeEnum.HotelDateSelectionType\"g\n\x1dHotelAdvanceBookingWindowInfo\x12\x15\n\x08min_days\x18\x03 \x01(\x03H\x00\x88\x01\x01\x12\x15\n\x08max_days\x18\x04 \x01(\x03H\x01\x88\x01\x01\x42\x0b\n\t_min_daysB\x0b\n\t_max_days\"g\n\x15HotelLengthOfStayInfo\x12\x17\n\nmin_nights\x18\x03 \x01(\x03H\x00\x88\x01\x01\x12\x17\n\nmax_nights\x18\x04 \x01(\x03H\x01\x88\x01\x01\x42\r\n\x0b_min_nightsB\r\n\x0b_max_nights\"A\n\x19HotelCheckInDateRangeInfo\x12\x12\n\nstart_date\x18\x01 \x01(\t\x12\x10\n\x08\x65nd_date\x18\x02 \x01(\t\"c\n\x13HotelCheckInDayInfo\x12L\n\x0b\x64\x61y_of_week\x18\x01 \x01(\x0e\x32\x37.google.ads.googleads.v10.enums.DayOfWeekEnum.DayOfWeek\"h\n\x13InteractionTypeInfo\x12Q\n\x04type\x18\x01 \x01(\x0e\x32\x43.google.ads.googleads.v10.enums.InteractionTypeEnum.InteractionType\"\xd2\x02\n\x0e\x41\x64ScheduleInfo\x12S\n\x0cstart_minute\x18\x01 \x01(\x0e\x32=.google.ads.googleads.v10.enums.MinuteOfHourEnum.MinuteOfHour\x12Q\n\nend_minute\x18\x02 \x01(\x0e\x32=.google.ads.googleads.v10.enums.MinuteOfHourEnum.MinuteOfHour\x12\x17\n\nstart_hour\x18\x06 \x01(\x05H\x00\x88\x01\x01\x12\x15\n\x08\x65nd_hour\x18\x07 \x01(\x05H\x01\x88\x01\x01\x12L\n\x0b\x64\x61y_of_week\x18\x05 \x01(\x0e\x32\x37.google.ads.googleads.v10.enums.DayOfWeekEnum.DayOfWeekB\r\n\x0b_start_hourB\x0b\n\t_end_hour\"[\n\x0c\x41geRangeInfo\x12K\n\x04type\x18\x01 \x01(\x0e\x32=.google.ads.googleads.v10.enums.AgeRangeTypeEnum.AgeRangeType\"U\n\nGenderInfo\x12G\n\x04type\x18\x01 \x01(\x0e\x32\x39.google.ads.googleads.v10.enums.GenderTypeEnum.GenderType\"d\n\x0fIncomeRangeInfo\x12Q\n\x04type\x18\x01 \x01(\x0e\x32\x43.google.ads.googleads.v10.enums.IncomeRangeTypeEnum.IncomeRangeType\"m\n\x12ParentalStatusInfo\x12W\n\x04type\x18\x01 \x01(\x0e\x32I.google.ads.googleads.v10.enums.ParentalStatusTypeEnum.ParentalStatusType\"6\n\x10YouTubeVideoInfo\x12\x15\n\x08video_id\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x0b\n\t_video_id\"<\n\x12YouTubeChannelInfo\x12\x17\n\nchannel_id\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\r\n\x0b_channel_id\"4\n\x0cUserListInfo\x12\x16\n\tuser_list\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x0c\n\n_user_list\"\x95\x02\n\rProximityInfo\x12@\n\tgeo_point\x18\x01 \x01(\x0b\x32-.google.ads.googleads.v10.common.GeoPointInfo\x12\x13\n\x06radius\x18\x05 \x01(\x01H\x00\x88\x01\x01\x12\x63\n\x0cradius_units\x18\x03 \x01(\x0e\x32M.google.ads.googleads.v10.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits\x12=\n\x07\x61\x64\x64ress\x18\x04 \x01(\x0b\x32,.google.ads.googleads.v10.common.AddressInfoB\t\n\x07_radius\"\x9c\x01\n\x0cGeoPointInfo\x12\'\n\x1alongitude_in_micro_degrees\x18\x03 \x01(\x05H\x00\x88\x01\x01\x12&\n\x19latitude_in_micro_degrees\x18\x04 \x01(\x05H\x01\x88\x01\x01\x42\x1d\n\x1b_longitude_in_micro_degreesB\x1c\n\x1a_latitude_in_micro_degrees\"\xc7\x02\n\x0b\x41\x64\x64ressInfo\x12\x18\n\x0bpostal_code\x18\x08 \x01(\tH\x00\x88\x01\x01\x12\x1a\n\rprovince_code\x18\t \x01(\tH\x01\x88\x01\x01\x12\x19\n\x0c\x63ountry_code\x18\n \x01(\tH\x02\x88\x01\x01\x12\x1a\n\rprovince_name\x18\x0b \x01(\tH\x03\x88\x01\x01\x12\x1b\n\x0estreet_address\x18\x0c \x01(\tH\x04\x88\x01\x01\x12\x1c\n\x0fstreet_address2\x18\r \x01(\tH\x05\x88\x01\x01\x12\x16\n\tcity_name\x18\x0e \x01(\tH\x06\x88\x01\x01\x42\x0e\n\x0c_postal_codeB\x10\n\x0e_province_codeB\x0f\n\r_country_codeB\x10\n\x0e_province_nameB\x11\n\x0f_street_addressB\x12\n\x10_street_address2B\x0c\n\n_city_name\"I\n\tTopicInfo\x12\x1b\n\x0etopic_constant\x18\x03 \x01(\tH\x00\x88\x01\x01\x12\x0c\n\x04path\x18\x04 \x03(\tB\x11\n\x0f_topic_constant\"D\n\x0cLanguageInfo\x12\x1e\n\x11language_constant\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x14\n\x12_language_constant\"5\n\x0bIpBlockInfo\x12\x17\n\nip_address\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\r\n\x0b_ip_address\"g\n\x10\x43ontentLabelInfo\x12S\n\x04type\x18\x01 \x01(\x0e\x32\x45.google.ads.googleads.v10.enums.ContentLabelTypeEnum.ContentLabelType\"A\n\x0b\x43\x61rrierInfo\x12\x1d\n\x10\x63\x61rrier_constant\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x13\n\x11_carrier_constant\"R\n\x10UserInterestInfo\x12#\n\x16user_interest_category\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x19\n\x17_user_interest_category\"\xe9\x01\n\x0bWebpageInfo\x12\x1b\n\x0e\x63riterion_name\x18\x03 \x01(\tH\x00\x88\x01\x01\x12I\n\nconditions\x18\x02 \x03(\x0b\x32\x35.google.ads.googleads.v10.common.WebpageConditionInfo\x12\x1b\n\x13\x63overage_percentage\x18\x04 \x01(\x01\x12\x42\n\x06sample\x18\x05 \x01(\x0b\x32\x32.google.ads.googleads.v10.common.WebpageSampleInfoB\x11\n\x0f_criterion_name\"\x89\x02\n\x14WebpageConditionInfo\x12\x64\n\x07operand\x18\x01 \x01(\x0e\x32S.google.ads.googleads.v10.enums.WebpageConditionOperandEnum.WebpageConditionOperand\x12g\n\x08operator\x18\x02 \x01(\x0e\x32U.google.ads.googleads.v10.enums.WebpageConditionOperatorEnum.WebpageConditionOperator\x12\x15\n\x08\x61rgument\x18\x04 \x01(\tH\x00\x88\x01\x01\x42\x0b\n\t_argument\"(\n\x11WebpageSampleInfo\x12\x13\n\x0bsample_urls\x18\x01 \x03(\t\"r\n\x1aOperatingSystemVersionInfo\x12.\n!operating_system_version_constant\x18\x02 \x01(\tH\x00\x88\x01\x01\x42$\n\"_operating_system_version_constant\"p\n\x13\x41ppPaymentModelInfo\x12Y\n\x04type\x18\x01 \x01(\x0e\x32K.google.ads.googleads.v10.enums.AppPaymentModelTypeEnum.AppPaymentModelType\"R\n\x10MobileDeviceInfo\x12#\n\x16mobile_device_constant\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x19\n\x17_mobile_device_constant\"F\n\x12\x43ustomAffinityInfo\x12\x1c\n\x0f\x63ustom_affinity\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x12\n\x10_custom_affinity\"@\n\x10\x43ustomIntentInfo\x12\x1a\n\rcustom_intent\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x10\n\x0e_custom_intent\"\xf2\x01\n\x11LocationGroupInfo\x12\x11\n\x04\x66\x65\x65\x64\x18\x05 \x01(\tH\x00\x88\x01\x01\x12\x1c\n\x14geo_target_constants\x18\x06 \x03(\t\x12\x13\n\x06radius\x18\x07 \x01(\x03H\x01\x88\x01\x01\x12k\n\x0cradius_units\x18\x04 \x01(\x0e\x32U.google.ads.googleads.v10.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits\x12\x16\n\x0e\x66\x65\x65\x64_item_sets\x18\x08 \x03(\tB\x07\n\x05_feedB\t\n\x07_radius\"-\n\x12\x43ustomAudienceInfo\x12\x17\n\x0f\x63ustom_audience\x18\x01 \x01(\t\"1\n\x14\x43ombinedAudienceInfo\x12\x19\n\x11\x63ombined_audience\x18\x01 \x01(\t\" \n\x0c\x41udienceInfo\x12\x10\n\x08\x61udience\x18\x01 \x01(\t\"h\n\x10KeywordThemeInfo\x12 \n\x16keyword_theme_constant\x18\x01 \x01(\tH\x00\x12!\n\x17\x66ree_form_keyword_theme\x18\x02 \x01(\tH\x00\x42\x0f\n\rkeyword_themeB\xed\x01\n#com.google.ads.googleads.v10.commonB\rCriteriaProtoP\x01ZEgoogle.golang.org/genproto/googleapis/ads/googleads/v10/common;common\xa2\x02\x03GAA\xaa\x02\x1fGoogle.Ads.GoogleAds.V10.Common\xca\x02\x1fGoogle\\Ads\\GoogleAds\\V10\\Common\xea\x02#Google::Ads::GoogleAds::V10::Commonb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.common.criteria_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.ads.googleads.v10.commonB\rCriteriaProtoP\001ZEgoogle.golang.org/genproto/googleapis/ads/googleads/v10/common;common\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Common\312\002\037Google\\Ads\\GoogleAds\\V10\\Common\352\002#Google::Ads::GoogleAds::V10::Common'
  _KEYWORDINFO._serialized_start=1489
  _KEYWORDINFO._serialized_end=1621
  _PLACEMENTINFO._serialized_start=1623
  _PLACEMENTINFO._serialized_end=1664
  _MOBILEAPPCATEGORYINFO._serialized_start=1666
  _MOBILEAPPCATEGORYINFO._serialized_end=1765
  _MOBILEAPPLICATIONINFO._serialized_start=1767
  _MOBILEAPPLICATIONINFO._serialized_end=1850
  _LOCATIONINFO._serialized_start=1852
  _LOCATIONINFO._serialized_end=1924
  _DEVICEINFO._serialized_start=1926
  _DEVICEINFO._serialized_end=2003
  _PREFERREDCONTENTINFO._serialized_start=2005
  _PREFERREDCONTENTINFO._serialized_end=2120
  _LISTINGGROUPINFO._serialized_start=2123
  _LISTINGGROUPINFO._serialized_end=2371
  _LISTINGSCOPEINFO._serialized_start=2373
  _LISTINGSCOPEINFO._serialized_end=2466
  _LISTINGDIMENSIONINFO._serialized_start=2469
  _LISTINGDIMENSIONINFO._serialized_end=4002
  _HOTELIDINFO._serialized_start=4004
  _HOTELIDINFO._serialized_end=4047
  _HOTELCLASSINFO._serialized_start=4049
  _HOTELCLASSINFO._serialized_end=4095
  _HOTELCOUNTRYREGIONINFO._serialized_start=4097
  _HOTELCOUNTRYREGIONINFO._serialized_end=4189
  _HOTELSTATEINFO._serialized_start=4191
  _HOTELSTATEINFO._serialized_end=4257
  _HOTELCITYINFO._serialized_start=4259
  _HOTELCITYINFO._serialized_end=4322
  _PRODUCTBIDDINGCATEGORYINFO._serialized_start=4325
  _PRODUCTBIDDINGCATEGORYINFO._serialized_end=4529
  _PRODUCTBRANDINFO._serialized_start=4531
  _PRODUCTBRANDINFO._serialized_end=4579
  _PRODUCTCHANNELINFO._serialized_start=4581
  _PRODUCTCHANNELINFO._serialized_end=4685
  _PRODUCTCHANNELEXCLUSIVITYINFO._serialized_start=4688
  _PRODUCTCHANNELEXCLUSIVITYINFO._serialized_end=4837
  _PRODUCTCONDITIONINFO._serialized_start=4839
  _PRODUCTCONDITIONINFO._serialized_end=4951
  _PRODUCTCUSTOMATTRIBUTEINFO._serialized_start=4954
  _PRODUCTCUSTOMATTRIBUTEINFO._serialized_end=5120
  _PRODUCTITEMIDINFO._serialized_start=5122
  _PRODUCTITEMIDINFO._serialized_end=5171
  _PRODUCTTYPEINFO._serialized_start=5174
  _PRODUCTTYPEINFO._serialized_end=5307
  _PRODUCTGROUPINGINFO._serialized_start=5309
  _PRODUCTGROUPINGINFO._serialized_end=5360
  _PRODUCTLABELSINFO._serialized_start=5362
  _PRODUCTLABELSINFO._serialized_end=5411
  _PRODUCTLEGACYCONDITIONINFO._serialized_start=5413
  _PRODUCTLEGACYCONDITIONINFO._serialized_end=5471
  _PRODUCTTYPEFULLINFO._serialized_start=5473
  _PRODUCTTYPEFULLINFO._serialized_end=5524
  _UNKNOWNLISTINGDIMENSIONINFO._serialized_start=5526
  _UNKNOWNLISTINGDIMENSIONINFO._serialized_end=5555
  _HOTELDATESELECTIONTYPEINFO._serialized_start=5557
  _HOTELDATESELECTIONTYPEINFO._serialized_end=5682
  _HOTELADVANCEBOOKINGWINDOWINFO._serialized_start=5684
  _HOTELADVANCEBOOKINGWINDOWINFO._serialized_end=5787
  _HOTELLENGTHOFSTAYINFO._serialized_start=5789
  _HOTELLENGTHOFSTAYINFO._serialized_end=5892
  _HOTELCHECKINDATERANGEINFO._serialized_start=5894
  _HOTELCHECKINDATERANGEINFO._serialized_end=5959
  _HOTELCHECKINDAYINFO._serialized_start=5961
  _HOTELCHECKINDAYINFO._serialized_end=6060
  _INTERACTIONTYPEINFO._serialized_start=6062
  _INTERACTIONTYPEINFO._serialized_end=6166
  _ADSCHEDULEINFO._serialized_start=6169
  _ADSCHEDULEINFO._serialized_end=6507
  _AGERANGEINFO._serialized_start=6509
  _AGERANGEINFO._serialized_end=6600
  _GENDERINFO._serialized_start=6602
  _GENDERINFO._serialized_end=6687
  _INCOMERANGEINFO._serialized_start=6689
  _INCOMERANGEINFO._serialized_end=6789
  _PARENTALSTATUSINFO._serialized_start=6791
  _PARENTALSTATUSINFO._serialized_end=6900
  _YOUTUBEVIDEOINFO._serialized_start=6902
  _YOUTUBEVIDEOINFO._serialized_end=6956
  _YOUTUBECHANNELINFO._serialized_start=6958
  _YOUTUBECHANNELINFO._serialized_end=7018
  _USERLISTINFO._serialized_start=7020
  _USERLISTINFO._serialized_end=7072
  _PROXIMITYINFO._serialized_start=7075
  _PROXIMITYINFO._serialized_end=7352
  _GEOPOINTINFO._serialized_start=7355
  _GEOPOINTINFO._serialized_end=7511
  _ADDRESSINFO._serialized_start=7514
  _ADDRESSINFO._serialized_end=7841
  _TOPICINFO._serialized_start=7843
  _TOPICINFO._serialized_end=7916
  _LANGUAGEINFO._serialized_start=7918
  _LANGUAGEINFO._serialized_end=7986
  _IPBLOCKINFO._serialized_start=7988
  _IPBLOCKINFO._serialized_end=8041
  _CONTENTLABELINFO._serialized_start=8043
  _CONTENTLABELINFO._serialized_end=8146
  _CARRIERINFO._serialized_start=8148
  _CARRIERINFO._serialized_end=8213
  _USERINTERESTINFO._serialized_start=8215
  _USERINTERESTINFO._serialized_end=8297
  _WEBPAGEINFO._serialized_start=8300
  _WEBPAGEINFO._serialized_end=8533
  _WEBPAGECONDITIONINFO._serialized_start=8536
  _WEBPAGECONDITIONINFO._serialized_end=8801
  _WEBPAGESAMPLEINFO._serialized_start=8803
  _WEBPAGESAMPLEINFO._serialized_end=8843
  _OPERATINGSYSTEMVERSIONINFO._serialized_start=8845
  _OPERATINGSYSTEMVERSIONINFO._serialized_end=8959
  _APPPAYMENTMODELINFO._serialized_start=8961
  _APPPAYMENTMODELINFO._serialized_end=9073
  _MOBILEDEVICEINFO._serialized_start=9075
  _MOBILEDEVICEINFO._serialized_end=9157
  _CUSTOMAFFINITYINFO._serialized_start=9159
  _CUSTOMAFFINITYINFO._serialized_end=9229
  _CUSTOMINTENTINFO._serialized_start=9231
  _CUSTOMINTENTINFO._serialized_end=9295
  _LOCATIONGROUPINFO._serialized_start=9298
  _LOCATIONGROUPINFO._serialized_end=9540
  _CUSTOMAUDIENCEINFO._serialized_start=9542
  _CUSTOMAUDIENCEINFO._serialized_end=9587
  _COMBINEDAUDIENCEINFO._serialized_start=9589
  _COMBINEDAUDIENCEINFO._serialized_end=9638
  _AUDIENCEINFO._serialized_start=9640
  _AUDIENCEINFO._serialized_end=9672
  _KEYWORDTHEMEINFO._serialized_start=9674
  _KEYWORDTHEMEINFO._serialized_end=9778
# @@protoc_insertion_point(module_scope)
