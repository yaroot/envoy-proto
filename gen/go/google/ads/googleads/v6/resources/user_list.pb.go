// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.4
// source: google/ads/googleads/v6/resources/user_list.proto

package resources

import (
	proto "github.com/golang/protobuf/proto"
	common "google.golang.org/genproto/googleapis/ads/googleads/v6/common"
	enums "google.golang.org/genproto/googleapis/ads/googleads/v6/enums"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

// A user list. This is a list of users a customer may target.
type UserList struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Immutable. The resource name of the user list.
	// User list resource names have the form:
	//
	// `customers/{customer_id}/userLists/{user_list_id}`
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
	// Output only. Id of the user list.
	Id *int64 `protobuf:"varint,25,opt,name=id,proto3,oneof" json:"id,omitempty"`
	// Output only. A flag that indicates if a user may edit a list. Depends on the list
	// ownership and list type. For example, external remarketing user lists are
	// not editable.
	//
	// This field is read-only.
	ReadOnly *bool `protobuf:"varint,26,opt,name=read_only,json=readOnly,proto3,oneof" json:"read_only,omitempty"`
	// Name of this user list. Depending on its access_reason, the user list name
	// may not be unique (e.g. if access_reason=SHARED)
	Name *string `protobuf:"bytes,27,opt,name=name,proto3,oneof" json:"name,omitempty"`
	// Description of this user list.
	Description *string `protobuf:"bytes,28,opt,name=description,proto3,oneof" json:"description,omitempty"`
	// Membership status of this user list. Indicates whether a user list is open
	// or active. Only open user lists can accumulate more users and can be
	// targeted to.
	MembershipStatus enums.UserListMembershipStatusEnum_UserListMembershipStatus `protobuf:"varint,6,opt,name=membership_status,json=membershipStatus,proto3,enum=google.ads.googleads.v6.enums.UserListMembershipStatusEnum_UserListMembershipStatus" json:"membership_status,omitempty"`
	// An ID from external system. It is used by user list sellers to correlate
	// IDs on their systems.
	IntegrationCode *string `protobuf:"bytes,29,opt,name=integration_code,json=integrationCode,proto3,oneof" json:"integration_code,omitempty"`
	// Number of days a user's cookie stays on your list since its most recent
	// addition to the list. This field must be between 0 and 540 inclusive.
	// However, for CRM based userlists, this field can be set to 10000 which
	// means no expiration.
	//
	// It'll be ignored for logical_user_list.
	MembershipLifeSpan *int64 `protobuf:"varint,30,opt,name=membership_life_span,json=membershipLifeSpan,proto3,oneof" json:"membership_life_span,omitempty"`
	// Output only. Estimated number of users in this user list, on the Google Display Network.
	// This value is null if the number of users has not yet been determined.
	//
	// This field is read-only.
	SizeForDisplay *int64 `protobuf:"varint,31,opt,name=size_for_display,json=sizeForDisplay,proto3,oneof" json:"size_for_display,omitempty"`
	// Output only. Size range in terms of number of users of the UserList, on the Google
	// Display Network.
	//
	// This field is read-only.
	SizeRangeForDisplay enums.UserListSizeRangeEnum_UserListSizeRange `protobuf:"varint,10,opt,name=size_range_for_display,json=sizeRangeForDisplay,proto3,enum=google.ads.googleads.v6.enums.UserListSizeRangeEnum_UserListSizeRange" json:"size_range_for_display,omitempty"`
	// Output only. Estimated number of users in this user list in the google.com domain.
	// These are the users available for targeting in Search campaigns.
	// This value is null if the number of users has not yet been determined.
	//
	// This field is read-only.
	SizeForSearch *int64 `protobuf:"varint,32,opt,name=size_for_search,json=sizeForSearch,proto3,oneof" json:"size_for_search,omitempty"`
	// Output only. Size range in terms of number of users of the UserList, for Search ads.
	//
	// This field is read-only.
	SizeRangeForSearch enums.UserListSizeRangeEnum_UserListSizeRange `protobuf:"varint,12,opt,name=size_range_for_search,json=sizeRangeForSearch,proto3,enum=google.ads.googleads.v6.enums.UserListSizeRangeEnum_UserListSizeRange" json:"size_range_for_search,omitempty"`
	// Output only. Type of this list.
	//
	// This field is read-only.
	Type enums.UserListTypeEnum_UserListType `protobuf:"varint,13,opt,name=type,proto3,enum=google.ads.googleads.v6.enums.UserListTypeEnum_UserListType" json:"type,omitempty"`
	// Indicating the reason why this user list membership status is closed. It is
	// only populated on lists that were automatically closed due to inactivity,
	// and will be cleared once the list membership status becomes open.
	ClosingReason enums.UserListClosingReasonEnum_UserListClosingReason `protobuf:"varint,14,opt,name=closing_reason,json=closingReason,proto3,enum=google.ads.googleads.v6.enums.UserListClosingReasonEnum_UserListClosingReason" json:"closing_reason,omitempty"`
	// Output only. Indicates the reason this account has been granted access to the list.
	// The reason can be SHARED, OWNED, LICENSED or SUBSCRIBED.
	//
	// This field is read-only.
	AccessReason enums.AccessReasonEnum_AccessReason `protobuf:"varint,15,opt,name=access_reason,json=accessReason,proto3,enum=google.ads.googleads.v6.enums.AccessReasonEnum_AccessReason" json:"access_reason,omitempty"`
	// Indicates if this share is still enabled. When a UserList is shared with
	// the user this field is set to ENABLED. Later the userList owner can decide
	// to revoke the share and make it DISABLED.
	// The default value of this field is set to ENABLED.
	AccountUserListStatus enums.UserListAccessStatusEnum_UserListAccessStatus `protobuf:"varint,16,opt,name=account_user_list_status,json=accountUserListStatus,proto3,enum=google.ads.googleads.v6.enums.UserListAccessStatusEnum_UserListAccessStatus" json:"account_user_list_status,omitempty"`
	// Indicates if this user list is eligible for Google Search Network.
	EligibleForSearch *bool `protobuf:"varint,33,opt,name=eligible_for_search,json=eligibleForSearch,proto3,oneof" json:"eligible_for_search,omitempty"`
	// Output only. Indicates this user list is eligible for Google Display Network.
	//
	// This field is read-only.
	EligibleForDisplay *bool `protobuf:"varint,34,opt,name=eligible_for_display,json=eligibleForDisplay,proto3,oneof" json:"eligible_for_display,omitempty"`
	// Output only. Indicates match rate for Customer Match lists. The range of this field is
	// [0-100]. This will be null for other list types or when it's not possible
	// to calculate the match rate.
	//
	// This field is read-only.
	MatchRatePercentage *int32 `protobuf:"varint,24,opt,name=match_rate_percentage,json=matchRatePercentage,proto3,oneof" json:"match_rate_percentage,omitempty"`
	// The user list.
	//
	// Exactly one must be set.
	//
	// Types that are assignable to UserList:
	//	*UserList_CrmBasedUserList
	//	*UserList_SimilarUserList
	//	*UserList_RuleBasedUserList
	//	*UserList_LogicalUserList
	//	*UserList_BasicUserList
	UserList isUserList_UserList `protobuf_oneof:"user_list"`
}

func (x *UserList) Reset() {
	*x = UserList{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_ads_googleads_v6_resources_user_list_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserList) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserList) ProtoMessage() {}

func (x *UserList) ProtoReflect() protoreflect.Message {
	mi := &file_google_ads_googleads_v6_resources_user_list_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserList.ProtoReflect.Descriptor instead.
func (*UserList) Descriptor() ([]byte, []int) {
	return file_google_ads_googleads_v6_resources_user_list_proto_rawDescGZIP(), []int{0}
}

func (x *UserList) GetResourceName() string {
	if x != nil {
		return x.ResourceName
	}
	return ""
}

func (x *UserList) GetId() int64 {
	if x != nil && x.Id != nil {
		return *x.Id
	}
	return 0
}

func (x *UserList) GetReadOnly() bool {
	if x != nil && x.ReadOnly != nil {
		return *x.ReadOnly
	}
	return false
}

func (x *UserList) GetName() string {
	if x != nil && x.Name != nil {
		return *x.Name
	}
	return ""
}

func (x *UserList) GetDescription() string {
	if x != nil && x.Description != nil {
		return *x.Description
	}
	return ""
}

func (x *UserList) GetMembershipStatus() enums.UserListMembershipStatusEnum_UserListMembershipStatus {
	if x != nil {
		return x.MembershipStatus
	}
	return enums.UserListMembershipStatusEnum_UNSPECIFIED
}

func (x *UserList) GetIntegrationCode() string {
	if x != nil && x.IntegrationCode != nil {
		return *x.IntegrationCode
	}
	return ""
}

func (x *UserList) GetMembershipLifeSpan() int64 {
	if x != nil && x.MembershipLifeSpan != nil {
		return *x.MembershipLifeSpan
	}
	return 0
}

func (x *UserList) GetSizeForDisplay() int64 {
	if x != nil && x.SizeForDisplay != nil {
		return *x.SizeForDisplay
	}
	return 0
}

func (x *UserList) GetSizeRangeForDisplay() enums.UserListSizeRangeEnum_UserListSizeRange {
	if x != nil {
		return x.SizeRangeForDisplay
	}
	return enums.UserListSizeRangeEnum_UNSPECIFIED
}

func (x *UserList) GetSizeForSearch() int64 {
	if x != nil && x.SizeForSearch != nil {
		return *x.SizeForSearch
	}
	return 0
}

func (x *UserList) GetSizeRangeForSearch() enums.UserListSizeRangeEnum_UserListSizeRange {
	if x != nil {
		return x.SizeRangeForSearch
	}
	return enums.UserListSizeRangeEnum_UNSPECIFIED
}

func (x *UserList) GetType() enums.UserListTypeEnum_UserListType {
	if x != nil {
		return x.Type
	}
	return enums.UserListTypeEnum_UNSPECIFIED
}

func (x *UserList) GetClosingReason() enums.UserListClosingReasonEnum_UserListClosingReason {
	if x != nil {
		return x.ClosingReason
	}
	return enums.UserListClosingReasonEnum_UNSPECIFIED
}

func (x *UserList) GetAccessReason() enums.AccessReasonEnum_AccessReason {
	if x != nil {
		return x.AccessReason
	}
	return enums.AccessReasonEnum_UNSPECIFIED
}

func (x *UserList) GetAccountUserListStatus() enums.UserListAccessStatusEnum_UserListAccessStatus {
	if x != nil {
		return x.AccountUserListStatus
	}
	return enums.UserListAccessStatusEnum_UNSPECIFIED
}

func (x *UserList) GetEligibleForSearch() bool {
	if x != nil && x.EligibleForSearch != nil {
		return *x.EligibleForSearch
	}
	return false
}

func (x *UserList) GetEligibleForDisplay() bool {
	if x != nil && x.EligibleForDisplay != nil {
		return *x.EligibleForDisplay
	}
	return false
}

func (x *UserList) GetMatchRatePercentage() int32 {
	if x != nil && x.MatchRatePercentage != nil {
		return *x.MatchRatePercentage
	}
	return 0
}

func (m *UserList) GetUserList() isUserList_UserList {
	if m != nil {
		return m.UserList
	}
	return nil
}

func (x *UserList) GetCrmBasedUserList() *common.CrmBasedUserListInfo {
	if x, ok := x.GetUserList().(*UserList_CrmBasedUserList); ok {
		return x.CrmBasedUserList
	}
	return nil
}

func (x *UserList) GetSimilarUserList() *common.SimilarUserListInfo {
	if x, ok := x.GetUserList().(*UserList_SimilarUserList); ok {
		return x.SimilarUserList
	}
	return nil
}

func (x *UserList) GetRuleBasedUserList() *common.RuleBasedUserListInfo {
	if x, ok := x.GetUserList().(*UserList_RuleBasedUserList); ok {
		return x.RuleBasedUserList
	}
	return nil
}

func (x *UserList) GetLogicalUserList() *common.LogicalUserListInfo {
	if x, ok := x.GetUserList().(*UserList_LogicalUserList); ok {
		return x.LogicalUserList
	}
	return nil
}

func (x *UserList) GetBasicUserList() *common.BasicUserListInfo {
	if x, ok := x.GetUserList().(*UserList_BasicUserList); ok {
		return x.BasicUserList
	}
	return nil
}

type isUserList_UserList interface {
	isUserList_UserList()
}

type UserList_CrmBasedUserList struct {
	// User list of CRM users provided by the advertiser.
	CrmBasedUserList *common.CrmBasedUserListInfo `protobuf:"bytes,19,opt,name=crm_based_user_list,json=crmBasedUserList,proto3,oneof"`
}

type UserList_SimilarUserList struct {
	// Output only. User list which are similar to users from another UserList.
	// These lists are readonly and automatically created by google.
	SimilarUserList *common.SimilarUserListInfo `protobuf:"bytes,20,opt,name=similar_user_list,json=similarUserList,proto3,oneof"`
}

type UserList_RuleBasedUserList struct {
	// User list generated by a rule.
	RuleBasedUserList *common.RuleBasedUserListInfo `protobuf:"bytes,21,opt,name=rule_based_user_list,json=ruleBasedUserList,proto3,oneof"`
}

type UserList_LogicalUserList struct {
	// User list that is a custom combination of user lists and user interests.
	LogicalUserList *common.LogicalUserListInfo `protobuf:"bytes,22,opt,name=logical_user_list,json=logicalUserList,proto3,oneof"`
}

type UserList_BasicUserList struct {
	// User list targeting as a collection of conversion or remarketing actions.
	BasicUserList *common.BasicUserListInfo `protobuf:"bytes,23,opt,name=basic_user_list,json=basicUserList,proto3,oneof"`
}

func (*UserList_CrmBasedUserList) isUserList_UserList() {}

func (*UserList_SimilarUserList) isUserList_UserList() {}

func (*UserList_RuleBasedUserList) isUserList_UserList() {}

func (*UserList_LogicalUserList) isUserList_UserList() {}

func (*UserList_BasicUserList) isUserList_UserList() {}

var File_google_ads_googleads_v6_resources_user_list_proto protoreflect.FileDescriptor

var file_google_ads_googleads_v6_resources_user_list_proto_rawDesc = []byte{
	0x0a, 0x31, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x21, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x72, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x1a, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36,
	0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x72, 0x65,
	0x61, 0x73, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x3b, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2f, 0x76, 0x36, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c,
	0x69, 0x73, 0x74, 0x5f, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x3c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36,
	0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74,
	0x5f, 0x63, 0x6c, 0x6f, 0x73, 0x69, 0x6e, 0x67, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x3f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64,
	0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x65,
	0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x5f, 0x6d,
	0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x38, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f,
	0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x5f,
	0x73, 0x69, 0x7a, 0x65, 0x5f, 0x72, 0x61, 0x6e, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x32, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36, 0x2f, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2f,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69,
	0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e,
	0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xcc,
	0x11, 0x0a, 0x08, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x4e, 0x0a, 0x0d, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x29, 0xe0, 0x41, 0x05, 0xfa, 0x41, 0x23, 0x0a, 0x21, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x0c, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x02, 0x69,
	0x64, 0x18, 0x19, 0x20, 0x01, 0x28, 0x03, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x01, 0x52, 0x02,
	0x69, 0x64, 0x88, 0x01, 0x01, 0x12, 0x25, 0x0a, 0x09, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x6f, 0x6e,
	0x6c, 0x79, 0x18, 0x1a, 0x20, 0x01, 0x28, 0x08, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x02, 0x52,
	0x08, 0x72, 0x65, 0x61, 0x64, 0x4f, 0x6e, 0x6c, 0x79, 0x88, 0x01, 0x01, 0x12, 0x17, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x1b, 0x20, 0x01, 0x28, 0x09, 0x48, 0x03, 0x52, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x88, 0x01, 0x01, 0x12, 0x25, 0x0a, 0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x18, 0x1c, 0x20, 0x01, 0x28, 0x09, 0x48, 0x04, 0x52, 0x0b, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x88, 0x01, 0x01, 0x12, 0x81, 0x01, 0x0a,
	0x11, 0x6d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x5f, 0x73, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x54, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e,
	0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73,
	0x74, 0x4d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x53, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65,
	0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x10,
	0x6d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x12, 0x2e, 0x0a, 0x10, 0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x63, 0x6f, 0x64, 0x65, 0x18, 0x1d, 0x20, 0x01, 0x28, 0x09, 0x48, 0x05, 0x52, 0x0f, 0x69, 0x6e,
	0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f, 0x64, 0x65, 0x88, 0x01, 0x01,
	0x12, 0x35, 0x0a, 0x14, 0x6d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x5f, 0x6c,
	0x69, 0x66, 0x65, 0x5f, 0x73, 0x70, 0x61, 0x6e, 0x18, 0x1e, 0x20, 0x01, 0x28, 0x03, 0x48, 0x06,
	0x52, 0x12, 0x6d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x4c, 0x69, 0x66, 0x65,
	0x53, 0x70, 0x61, 0x6e, 0x88, 0x01, 0x01, 0x12, 0x32, 0x0a, 0x10, 0x73, 0x69, 0x7a, 0x65, 0x5f,
	0x66, 0x6f, 0x72, 0x5f, 0x64, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x18, 0x1f, 0x20, 0x01, 0x28,
	0x03, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x07, 0x52, 0x0e, 0x73, 0x69, 0x7a, 0x65, 0x46, 0x6f,
	0x72, 0x44, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x88, 0x01, 0x01, 0x12, 0x80, 0x01, 0x0a, 0x16,
	0x73, 0x69, 0x7a, 0x65, 0x5f, 0x72, 0x61, 0x6e, 0x67, 0x65, 0x5f, 0x66, 0x6f, 0x72, 0x5f, 0x64,
	0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x46, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x55, 0x73, 0x65,
	0x72, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x69, 0x7a, 0x65, 0x52, 0x61, 0x6e, 0x67, 0x65, 0x45, 0x6e,
	0x75, 0x6d, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x69, 0x7a, 0x65, 0x52,
	0x61, 0x6e, 0x67, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x13, 0x73, 0x69, 0x7a, 0x65, 0x52,
	0x61, 0x6e, 0x67, 0x65, 0x46, 0x6f, 0x72, 0x44, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x12, 0x30,
	0x0a, 0x0f, 0x73, 0x69, 0x7a, 0x65, 0x5f, 0x66, 0x6f, 0x72, 0x5f, 0x73, 0x65, 0x61, 0x72, 0x63,
	0x68, 0x18, 0x20, 0x20, 0x01, 0x28, 0x03, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x08, 0x52, 0x0d,
	0x73, 0x69, 0x7a, 0x65, 0x46, 0x6f, 0x72, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x88, 0x01, 0x01,
	0x12, 0x7e, 0x0a, 0x15, 0x73, 0x69, 0x7a, 0x65, 0x5f, 0x72, 0x61, 0x6e, 0x67, 0x65, 0x5f, 0x66,
	0x6f, 0x72, 0x5f, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x46, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e,
	0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x69, 0x7a, 0x65, 0x52, 0x61, 0x6e, 0x67,
	0x65, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x69,
	0x7a, 0x65, 0x52, 0x61, 0x6e, 0x67, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x12, 0x73, 0x69,
	0x7a, 0x65, 0x52, 0x61, 0x6e, 0x67, 0x65, 0x46, 0x6f, 0x72, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68,
	0x12, 0x55, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x3c,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x55,
	0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x79, 0x70, 0x65, 0x45, 0x6e, 0x75, 0x6d, 0x2e,
	0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x54, 0x79, 0x70, 0x65, 0x42, 0x03, 0xe0, 0x41,
	0x03, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x75, 0x0a, 0x0e, 0x63, 0x6c, 0x6f, 0x73, 0x69,
	0x6e, 0x67, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x4e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e,
	0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x43, 0x6c, 0x6f, 0x73, 0x69, 0x6e, 0x67, 0x52,
	0x65, 0x61, 0x73, 0x6f, 0x6e, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69,
	0x73, 0x74, 0x43, 0x6c, 0x6f, 0x73, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x52,
	0x0d, 0x63, 0x6c, 0x6f, 0x73, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x66,
	0x0a, 0x0d, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18,
	0x0f, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x3c, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e,
	0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x61, 0x73,
	0x6f, 0x6e, 0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x61,
	0x73, 0x6f, 0x6e, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x0c, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73,
	0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x85, 0x01, 0x0a, 0x18, 0x61, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x5f, 0x73, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x18, 0x10, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x4c, 0x2e, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73,
	0x2e, 0x76, 0x36, 0x2e, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69,
	0x73, 0x74, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x45, 0x6e,
	0x75, 0x6d, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x63, 0x63, 0x65, 0x73,
	0x73, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x15, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x33,
	0x0a, 0x13, 0x65, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x6c, 0x65, 0x5f, 0x66, 0x6f, 0x72, 0x5f, 0x73,
	0x65, 0x61, 0x72, 0x63, 0x68, 0x18, 0x21, 0x20, 0x01, 0x28, 0x08, 0x48, 0x09, 0x52, 0x11, 0x65,
	0x6c, 0x69, 0x67, 0x69, 0x62, 0x6c, 0x65, 0x46, 0x6f, 0x72, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68,
	0x88, 0x01, 0x01, 0x12, 0x3a, 0x0a, 0x14, 0x65, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x6c, 0x65, 0x5f,
	0x66, 0x6f, 0x72, 0x5f, 0x64, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x18, 0x22, 0x20, 0x01, 0x28,
	0x08, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x0a, 0x52, 0x12, 0x65, 0x6c, 0x69, 0x67, 0x69, 0x62,
	0x6c, 0x65, 0x46, 0x6f, 0x72, 0x44, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x88, 0x01, 0x01, 0x12,
	0x3c, 0x0a, 0x15, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x5f, 0x72, 0x61, 0x74, 0x65, 0x5f, 0x70, 0x65,
	0x72, 0x63, 0x65, 0x6e, 0x74, 0x61, 0x67, 0x65, 0x18, 0x18, 0x20, 0x01, 0x28, 0x05, 0x42, 0x03,
	0xe0, 0x41, 0x03, 0x48, 0x0b, 0x52, 0x13, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x52, 0x61, 0x74, 0x65,
	0x50, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x61, 0x67, 0x65, 0x88, 0x01, 0x01, 0x12, 0x65, 0x0a,
	0x13, 0x63, 0x72, 0x6d, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x64, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x5f,
	0x6c, 0x69, 0x73, 0x74, 0x18, 0x13, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x34, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x43, 0x72, 0x6d, 0x42,
	0x61, 0x73, 0x65, 0x64, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x49, 0x6e, 0x66, 0x6f,
	0x48, 0x00, 0x52, 0x10, 0x63, 0x72, 0x6d, 0x42, 0x61, 0x73, 0x65, 0x64, 0x55, 0x73, 0x65, 0x72,
	0x4c, 0x69, 0x73, 0x74, 0x12, 0x66, 0x0a, 0x11, 0x73, 0x69, 0x6d, 0x69, 0x6c, 0x61, 0x72, 0x5f,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x18, 0x14, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2e, 0x53, 0x69, 0x6d, 0x69, 0x6c, 0x61, 0x72, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74,
	0x49, 0x6e, 0x66, 0x6f, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x48, 0x00, 0x52, 0x0f, 0x73, 0x69, 0x6d,
	0x69, 0x6c, 0x61, 0x72, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x68, 0x0a, 0x14,
	0x72, 0x75, 0x6c, 0x65, 0x5f, 0x62, 0x61, 0x73, 0x65, 0x64, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x5f,
	0x6c, 0x69, 0x73, 0x74, 0x18, 0x15, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x35, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64,
	0x73, 0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x75, 0x6c, 0x65,
	0x42, 0x61, 0x73, 0x65, 0x64, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x49, 0x6e, 0x66,
	0x6f, 0x48, 0x00, 0x52, 0x11, 0x72, 0x75, 0x6c, 0x65, 0x42, 0x61, 0x73, 0x65, 0x64, 0x55, 0x73,
	0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x61, 0x0a, 0x11, 0x6c, 0x6f, 0x67, 0x69, 0x63, 0x61,
	0x6c, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x18, 0x16, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x33, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2e, 0x4c, 0x6f, 0x67, 0x69, 0x63, 0x61, 0x6c, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69,
	0x73, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x48, 0x00, 0x52, 0x0f, 0x6c, 0x6f, 0x67, 0x69, 0x63, 0x61,
	0x6c, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x5b, 0x0a, 0x0f, 0x62, 0x61, 0x73,
	0x69, 0x63, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x18, 0x17, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x31, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x42, 0x61, 0x73, 0x69, 0x63, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73,
	0x74, 0x49, 0x6e, 0x66, 0x6f, 0x48, 0x00, 0x52, 0x0d, 0x62, 0x61, 0x73, 0x69, 0x63, 0x55, 0x73,
	0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x3a, 0x58, 0xea, 0x41, 0x55, 0x0a, 0x21, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69,
	0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x30,
	0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x63, 0x75, 0x73, 0x74, 0x6f,
	0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x7d, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73, 0x74,
	0x73, 0x2f, 0x7b, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x5f, 0x69, 0x64, 0x7d,
	0x42, 0x0b, 0x0a, 0x09, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x6c, 0x69, 0x73, 0x74, 0x42, 0x05, 0x0a,
	0x03, 0x5f, 0x69, 0x64, 0x42, 0x0c, 0x0a, 0x0a, 0x5f, 0x72, 0x65, 0x61, 0x64, 0x5f, 0x6f, 0x6e,
	0x6c, 0x79, 0x42, 0x07, 0x0a, 0x05, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x42, 0x0e, 0x0a, 0x0c, 0x5f,
	0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x13, 0x0a, 0x11, 0x5f,
	0x69, 0x6e, 0x74, 0x65, 0x67, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x64, 0x65,
	0x42, 0x17, 0x0a, 0x15, 0x5f, 0x6d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x68, 0x69, 0x70, 0x5f,
	0x6c, 0x69, 0x66, 0x65, 0x5f, 0x73, 0x70, 0x61, 0x6e, 0x42, 0x13, 0x0a, 0x11, 0x5f, 0x73, 0x69,
	0x7a, 0x65, 0x5f, 0x66, 0x6f, 0x72, 0x5f, 0x64, 0x69, 0x73, 0x70, 0x6c, 0x61, 0x79, 0x42, 0x12,
	0x0a, 0x10, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x5f, 0x66, 0x6f, 0x72, 0x5f, 0x73, 0x65, 0x61, 0x72,
	0x63, 0x68, 0x42, 0x16, 0x0a, 0x14, 0x5f, 0x65, 0x6c, 0x69, 0x67, 0x69, 0x62, 0x6c, 0x65, 0x5f,
	0x66, 0x6f, 0x72, 0x5f, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x42, 0x17, 0x0a, 0x15, 0x5f, 0x65,
	0x6c, 0x69, 0x67, 0x69, 0x62, 0x6c, 0x65, 0x5f, 0x66, 0x6f, 0x72, 0x5f, 0x64, 0x69, 0x73, 0x70,
	0x6c, 0x61, 0x79, 0x42, 0x18, 0x0a, 0x16, 0x5f, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x5f, 0x72, 0x61,
	0x74, 0x65, 0x5f, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x61, 0x67, 0x65, 0x42, 0xfa, 0x01,
	0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x64, 0x73,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2e, 0x76, 0x36, 0x2e, 0x72, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x42, 0x0d, 0x55, 0x73, 0x65, 0x72, 0x4c, 0x69, 0x73,
	0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73, 0x2f,
	0x61, 0x64, 0x73, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x64, 0x73, 0x2f, 0x76, 0x36,
	0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x3b, 0x72, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x73, 0xa2, 0x02, 0x03, 0x47, 0x41, 0x41, 0xaa, 0x02, 0x21, 0x47, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x41, 0x64, 0x73, 0x2e, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64,
	0x73, 0x2e, 0x56, 0x36, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0xca, 0x02,
	0x21, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x5c, 0x41, 0x64, 0x73, 0x5c, 0x47, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x41, 0x64, 0x73, 0x5c, 0x56, 0x36, 0x5c, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x73, 0xea, 0x02, 0x25, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x3a, 0x3a, 0x41, 0x64, 0x73,
	0x3a, 0x3a, 0x47, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x41, 0x64, 0x73, 0x3a, 0x3a, 0x56, 0x36, 0x3a,
	0x3a, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_google_ads_googleads_v6_resources_user_list_proto_rawDescOnce sync.Once
	file_google_ads_googleads_v6_resources_user_list_proto_rawDescData = file_google_ads_googleads_v6_resources_user_list_proto_rawDesc
)

func file_google_ads_googleads_v6_resources_user_list_proto_rawDescGZIP() []byte {
	file_google_ads_googleads_v6_resources_user_list_proto_rawDescOnce.Do(func() {
		file_google_ads_googleads_v6_resources_user_list_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_ads_googleads_v6_resources_user_list_proto_rawDescData)
	})
	return file_google_ads_googleads_v6_resources_user_list_proto_rawDescData
}

var file_google_ads_googleads_v6_resources_user_list_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_ads_googleads_v6_resources_user_list_proto_goTypes = []interface{}{
	(*UserList)(nil), // 0: google.ads.googleads.v6.resources.UserList
	(enums.UserListMembershipStatusEnum_UserListMembershipStatus)(0), // 1: google.ads.googleads.v6.enums.UserListMembershipStatusEnum.UserListMembershipStatus
	(enums.UserListSizeRangeEnum_UserListSizeRange)(0),               // 2: google.ads.googleads.v6.enums.UserListSizeRangeEnum.UserListSizeRange
	(enums.UserListTypeEnum_UserListType)(0),                         // 3: google.ads.googleads.v6.enums.UserListTypeEnum.UserListType
	(enums.UserListClosingReasonEnum_UserListClosingReason)(0),       // 4: google.ads.googleads.v6.enums.UserListClosingReasonEnum.UserListClosingReason
	(enums.AccessReasonEnum_AccessReason)(0),                         // 5: google.ads.googleads.v6.enums.AccessReasonEnum.AccessReason
	(enums.UserListAccessStatusEnum_UserListAccessStatus)(0),         // 6: google.ads.googleads.v6.enums.UserListAccessStatusEnum.UserListAccessStatus
	(*common.CrmBasedUserListInfo)(nil),                              // 7: google.ads.googleads.v6.common.CrmBasedUserListInfo
	(*common.SimilarUserListInfo)(nil),                               // 8: google.ads.googleads.v6.common.SimilarUserListInfo
	(*common.RuleBasedUserListInfo)(nil),                             // 9: google.ads.googleads.v6.common.RuleBasedUserListInfo
	(*common.LogicalUserListInfo)(nil),                               // 10: google.ads.googleads.v6.common.LogicalUserListInfo
	(*common.BasicUserListInfo)(nil),                                 // 11: google.ads.googleads.v6.common.BasicUserListInfo
}
var file_google_ads_googleads_v6_resources_user_list_proto_depIdxs = []int32{
	1,  // 0: google.ads.googleads.v6.resources.UserList.membership_status:type_name -> google.ads.googleads.v6.enums.UserListMembershipStatusEnum.UserListMembershipStatus
	2,  // 1: google.ads.googleads.v6.resources.UserList.size_range_for_display:type_name -> google.ads.googleads.v6.enums.UserListSizeRangeEnum.UserListSizeRange
	2,  // 2: google.ads.googleads.v6.resources.UserList.size_range_for_search:type_name -> google.ads.googleads.v6.enums.UserListSizeRangeEnum.UserListSizeRange
	3,  // 3: google.ads.googleads.v6.resources.UserList.type:type_name -> google.ads.googleads.v6.enums.UserListTypeEnum.UserListType
	4,  // 4: google.ads.googleads.v6.resources.UserList.closing_reason:type_name -> google.ads.googleads.v6.enums.UserListClosingReasonEnum.UserListClosingReason
	5,  // 5: google.ads.googleads.v6.resources.UserList.access_reason:type_name -> google.ads.googleads.v6.enums.AccessReasonEnum.AccessReason
	6,  // 6: google.ads.googleads.v6.resources.UserList.account_user_list_status:type_name -> google.ads.googleads.v6.enums.UserListAccessStatusEnum.UserListAccessStatus
	7,  // 7: google.ads.googleads.v6.resources.UserList.crm_based_user_list:type_name -> google.ads.googleads.v6.common.CrmBasedUserListInfo
	8,  // 8: google.ads.googleads.v6.resources.UserList.similar_user_list:type_name -> google.ads.googleads.v6.common.SimilarUserListInfo
	9,  // 9: google.ads.googleads.v6.resources.UserList.rule_based_user_list:type_name -> google.ads.googleads.v6.common.RuleBasedUserListInfo
	10, // 10: google.ads.googleads.v6.resources.UserList.logical_user_list:type_name -> google.ads.googleads.v6.common.LogicalUserListInfo
	11, // 11: google.ads.googleads.v6.resources.UserList.basic_user_list:type_name -> google.ads.googleads.v6.common.BasicUserListInfo
	12, // [12:12] is the sub-list for method output_type
	12, // [12:12] is the sub-list for method input_type
	12, // [12:12] is the sub-list for extension type_name
	12, // [12:12] is the sub-list for extension extendee
	0,  // [0:12] is the sub-list for field type_name
}

func init() { file_google_ads_googleads_v6_resources_user_list_proto_init() }
func file_google_ads_googleads_v6_resources_user_list_proto_init() {
	if File_google_ads_googleads_v6_resources_user_list_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_ads_googleads_v6_resources_user_list_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserList); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_google_ads_googleads_v6_resources_user_list_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*UserList_CrmBasedUserList)(nil),
		(*UserList_SimilarUserList)(nil),
		(*UserList_RuleBasedUserList)(nil),
		(*UserList_LogicalUserList)(nil),
		(*UserList_BasicUserList)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_ads_googleads_v6_resources_user_list_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_ads_googleads_v6_resources_user_list_proto_goTypes,
		DependencyIndexes: file_google_ads_googleads_v6_resources_user_list_proto_depIdxs,
		MessageInfos:      file_google_ads_googleads_v6_resources_user_list_proto_msgTypes,
	}.Build()
	File_google_ads_googleads_v6_resources_user_list_proto = out.File
	file_google_ads_googleads_v6_resources_user_list_proto_rawDesc = nil
	file_google_ads_googleads_v6_resources_user_list_proto_goTypes = nil
	file_google_ads_googleads_v6_resources_user_list_proto_depIdxs = nil
}
