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
// source: google/api/auth.proto

package serviceconfig

import (
	proto "github.com/golang/protobuf/proto"
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

// `Authentication` defines the authentication configuration for an API.
//
// Example for an API targeted for external use:
//
//     name: calendar.googleapis.com
//     authentication:
//       providers:
//       - id: google_calendar_auth
//         jwks_uri: https://www.googleapis.com/oauth2/v1/certs
//         issuer: https://securetoken.google.com
//       rules:
//       - selector: "*"
//         requirements:
//           provider_id: google_calendar_auth
type Authentication struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A list of authentication rules that apply to individual API methods.
	//
	// **NOTE:** All service configuration rules follow "last one wins" order.
	Rules []*AuthenticationRule `protobuf:"bytes,3,rep,name=rules,proto3" json:"rules,omitempty"`
	// Defines a set of authentication providers that a service supports.
	Providers []*AuthProvider `protobuf:"bytes,4,rep,name=providers,proto3" json:"providers,omitempty"`
}

func (x *Authentication) Reset() {
	*x = Authentication{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_auth_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Authentication) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Authentication) ProtoMessage() {}

func (x *Authentication) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_auth_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Authentication.ProtoReflect.Descriptor instead.
func (*Authentication) Descriptor() ([]byte, []int) {
	return file_google_api_auth_proto_rawDescGZIP(), []int{0}
}

func (x *Authentication) GetRules() []*AuthenticationRule {
	if x != nil {
		return x.Rules
	}
	return nil
}

func (x *Authentication) GetProviders() []*AuthProvider {
	if x != nil {
		return x.Providers
	}
	return nil
}

// Authentication rules for the service.
//
// By default, if a method has any authentication requirements, every request
// must include a valid credential matching one of the requirements.
// It's an error to include more than one kind of credential in a single
// request.
//
// If a method doesn't have any auth requirements, request credentials will be
// ignored.
type AuthenticationRule struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Selects the methods to which this rule applies.
	//
	// Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
	Selector string `protobuf:"bytes,1,opt,name=selector,proto3" json:"selector,omitempty"`
	// The requirements for OAuth credentials.
	Oauth *OAuthRequirements `protobuf:"bytes,2,opt,name=oauth,proto3" json:"oauth,omitempty"`
	// If true, the service accepts API keys without any other credential.
	AllowWithoutCredential bool `protobuf:"varint,5,opt,name=allow_without_credential,json=allowWithoutCredential,proto3" json:"allow_without_credential,omitempty"`
	// Requirements for additional authentication providers.
	Requirements []*AuthRequirement `protobuf:"bytes,7,rep,name=requirements,proto3" json:"requirements,omitempty"`
}

func (x *AuthenticationRule) Reset() {
	*x = AuthenticationRule{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_auth_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AuthenticationRule) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AuthenticationRule) ProtoMessage() {}

func (x *AuthenticationRule) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_auth_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AuthenticationRule.ProtoReflect.Descriptor instead.
func (*AuthenticationRule) Descriptor() ([]byte, []int) {
	return file_google_api_auth_proto_rawDescGZIP(), []int{1}
}

func (x *AuthenticationRule) GetSelector() string {
	if x != nil {
		return x.Selector
	}
	return ""
}

func (x *AuthenticationRule) GetOauth() *OAuthRequirements {
	if x != nil {
		return x.Oauth
	}
	return nil
}

func (x *AuthenticationRule) GetAllowWithoutCredential() bool {
	if x != nil {
		return x.AllowWithoutCredential
	}
	return false
}

func (x *AuthenticationRule) GetRequirements() []*AuthRequirement {
	if x != nil {
		return x.Requirements
	}
	return nil
}

// Specifies a location to extract JWT from an API request.
type JwtLocation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to In:
	//	*JwtLocation_Header
	//	*JwtLocation_Query
	In isJwtLocation_In `protobuf_oneof:"in"`
	// The value prefix. The value format is "value_prefix{token}"
	// Only applies to "in" header type. Must be empty for "in" query type.
	// If not empty, the header value has to match (case sensitive) this prefix.
	// If not matched, JWT will not be extracted. If matched, JWT will be
	// extracted after the prefix is removed.
	//
	// For example, for "Authorization: Bearer {JWT}",
	// value_prefix="Bearer " with a space at the end.
	ValuePrefix string `protobuf:"bytes,3,opt,name=value_prefix,json=valuePrefix,proto3" json:"value_prefix,omitempty"`
}

func (x *JwtLocation) Reset() {
	*x = JwtLocation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_auth_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JwtLocation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JwtLocation) ProtoMessage() {}

func (x *JwtLocation) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_auth_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JwtLocation.ProtoReflect.Descriptor instead.
func (*JwtLocation) Descriptor() ([]byte, []int) {
	return file_google_api_auth_proto_rawDescGZIP(), []int{2}
}

func (m *JwtLocation) GetIn() isJwtLocation_In {
	if m != nil {
		return m.In
	}
	return nil
}

func (x *JwtLocation) GetHeader() string {
	if x, ok := x.GetIn().(*JwtLocation_Header); ok {
		return x.Header
	}
	return ""
}

func (x *JwtLocation) GetQuery() string {
	if x, ok := x.GetIn().(*JwtLocation_Query); ok {
		return x.Query
	}
	return ""
}

func (x *JwtLocation) GetValuePrefix() string {
	if x != nil {
		return x.ValuePrefix
	}
	return ""
}

type isJwtLocation_In interface {
	isJwtLocation_In()
}

type JwtLocation_Header struct {
	// Specifies HTTP header name to extract JWT token.
	Header string `protobuf:"bytes,1,opt,name=header,proto3,oneof"`
}

type JwtLocation_Query struct {
	// Specifies URL query parameter name to extract JWT token.
	Query string `protobuf:"bytes,2,opt,name=query,proto3,oneof"`
}

func (*JwtLocation_Header) isJwtLocation_In() {}

func (*JwtLocation_Query) isJwtLocation_In() {}

// Configuration for an authentication provider, including support for
// [JSON Web Token
// (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
type AuthProvider struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The unique identifier of the auth provider. It will be referred to by
	// `AuthRequirement.provider_id`.
	//
	// Example: "bookstore_auth".
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// Identifies the principal that issued the JWT. See
	// https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
	// Usually a URL or an email address.
	//
	// Example: https://securetoken.google.com
	// Example: 1234567-compute@developer.gserviceaccount.com
	Issuer string `protobuf:"bytes,2,opt,name=issuer,proto3" json:"issuer,omitempty"`
	// URL of the provider's public key set to validate signature of the JWT. See
	// [OpenID
	// Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
	// Optional if the key set document:
	//  - can be retrieved from
	//    [OpenID
	//    Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html of
	//    the issuer.
	//  - can be inferred from the email domain of the issuer (e.g. a Google
	//  service account).
	//
	// Example: https://www.googleapis.com/oauth2/v1/certs
	JwksUri string `protobuf:"bytes,3,opt,name=jwks_uri,json=jwksUri,proto3" json:"jwks_uri,omitempty"`
	// The list of JWT
	// [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
	// that are allowed to access. A JWT containing any of these audiences will
	// be accepted. When this setting is absent, JWTs with audiences:
	//   - "https://[service.name]/[google.protobuf.Api.name]"
	//   - "https://[service.name]/"
	// will be accepted.
	// For example, if no audiences are in the setting, LibraryService API will
	// accept JWTs with the following audiences:
	//   -
	//   https://library-example.googleapis.com/google.example.library.v1.LibraryService
	//   - https://library-example.googleapis.com/
	//
	// Example:
	//
	//     audiences: bookstore_android.apps.googleusercontent.com,
	//                bookstore_web.apps.googleusercontent.com
	Audiences string `protobuf:"bytes,4,opt,name=audiences,proto3" json:"audiences,omitempty"`
	// Redirect URL if JWT token is required but not present or is expired.
	// Implement authorizationUrl of securityDefinitions in OpenAPI spec.
	AuthorizationUrl string `protobuf:"bytes,5,opt,name=authorization_url,json=authorizationUrl,proto3" json:"authorization_url,omitempty"`
	// Defines the locations to extract the JWT.
	//
	// JWT locations can be either from HTTP headers or URL query parameters.
	// The rule is that the first match wins. The checking order is: checking
	// all headers first, then URL query parameters.
	//
	// If not specified,  default to use following 3 locations:
	//    1) Authorization: Bearer
	//    2) x-goog-iap-jwt-assertion
	//    3) access_token query parameter
	//
	// Default locations can be specified as followings:
	//    jwt_locations:
	//    - header: Authorization
	//      value_prefix: "Bearer "
	//    - header: x-goog-iap-jwt-assertion
	//    - query: access_token
	JwtLocations []*JwtLocation `protobuf:"bytes,6,rep,name=jwt_locations,json=jwtLocations,proto3" json:"jwt_locations,omitempty"`
}

func (x *AuthProvider) Reset() {
	*x = AuthProvider{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_auth_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AuthProvider) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AuthProvider) ProtoMessage() {}

func (x *AuthProvider) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_auth_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AuthProvider.ProtoReflect.Descriptor instead.
func (*AuthProvider) Descriptor() ([]byte, []int) {
	return file_google_api_auth_proto_rawDescGZIP(), []int{3}
}

func (x *AuthProvider) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *AuthProvider) GetIssuer() string {
	if x != nil {
		return x.Issuer
	}
	return ""
}

func (x *AuthProvider) GetJwksUri() string {
	if x != nil {
		return x.JwksUri
	}
	return ""
}

func (x *AuthProvider) GetAudiences() string {
	if x != nil {
		return x.Audiences
	}
	return ""
}

func (x *AuthProvider) GetAuthorizationUrl() string {
	if x != nil {
		return x.AuthorizationUrl
	}
	return ""
}

func (x *AuthProvider) GetJwtLocations() []*JwtLocation {
	if x != nil {
		return x.JwtLocations
	}
	return nil
}

// OAuth scopes are a way to define data and permissions on data. For example,
// there are scopes defined for "Read-only access to Google Calendar" and
// "Access to Cloud Platform". Users can consent to a scope for an application,
// giving it permission to access that data on their behalf.
//
// OAuth scope specifications should be fairly coarse grained; a user will need
// to see and understand the text description of what your scope means.
//
// In most cases: use one or at most two OAuth scopes for an entire family of
// products. If your product has multiple APIs, you should probably be sharing
// the OAuth scope across all of those APIs.
//
// When you need finer grained OAuth consent screens: talk with your product
// management about how developers will use them in practice.
//
// Please note that even though each of the canonical scopes is enough for a
// request to be accepted and passed to the backend, a request can still fail
// due to the backend requiring additional scopes or permissions.
type OAuthRequirements struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The list of publicly documented OAuth scopes that are allowed access. An
	// OAuth token containing any of these scopes will be accepted.
	//
	// Example:
	//
	//      canonical_scopes: https://www.googleapis.com/auth/calendar,
	//                        https://www.googleapis.com/auth/calendar.read
	CanonicalScopes string `protobuf:"bytes,1,opt,name=canonical_scopes,json=canonicalScopes,proto3" json:"canonical_scopes,omitempty"`
}

func (x *OAuthRequirements) Reset() {
	*x = OAuthRequirements{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_auth_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OAuthRequirements) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OAuthRequirements) ProtoMessage() {}

func (x *OAuthRequirements) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_auth_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OAuthRequirements.ProtoReflect.Descriptor instead.
func (*OAuthRequirements) Descriptor() ([]byte, []int) {
	return file_google_api_auth_proto_rawDescGZIP(), []int{4}
}

func (x *OAuthRequirements) GetCanonicalScopes() string {
	if x != nil {
		return x.CanonicalScopes
	}
	return ""
}

// User-defined authentication requirements, including support for
// [JSON Web Token
// (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
type AuthRequirement struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// [id][google.api.AuthProvider.id] from authentication provider.
	//
	// Example:
	//
	//     provider_id: bookstore_auth
	ProviderId string `protobuf:"bytes,1,opt,name=provider_id,json=providerId,proto3" json:"provider_id,omitempty"`
	// NOTE: This will be deprecated soon, once AuthProvider.audiences is
	// implemented and accepted in all the runtime components.
	//
	// The list of JWT
	// [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
	// that are allowed to access. A JWT containing any of these audiences will
	// be accepted. When this setting is absent, only JWTs with audience
	// "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
	// will be accepted. For example, if no audiences are in the setting,
	// LibraryService API will only accept JWTs with the following audience
	// "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
	//
	// Example:
	//
	//     audiences: bookstore_android.apps.googleusercontent.com,
	//                bookstore_web.apps.googleusercontent.com
	Audiences string `protobuf:"bytes,2,opt,name=audiences,proto3" json:"audiences,omitempty"`
}

func (x *AuthRequirement) Reset() {
	*x = AuthRequirement{}
	if protoimpl.UnsafeEnabled {
		mi := &file_google_api_auth_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AuthRequirement) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AuthRequirement) ProtoMessage() {}

func (x *AuthRequirement) ProtoReflect() protoreflect.Message {
	mi := &file_google_api_auth_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AuthRequirement.ProtoReflect.Descriptor instead.
func (*AuthRequirement) Descriptor() ([]byte, []int) {
	return file_google_api_auth_proto_rawDescGZIP(), []int{5}
}

func (x *AuthRequirement) GetProviderId() string {
	if x != nil {
		return x.ProviderId
	}
	return ""
}

func (x *AuthRequirement) GetAudiences() string {
	if x != nil {
		return x.Audiences
	}
	return ""
}

var File_google_api_auth_proto protoreflect.FileDescriptor

var file_google_api_auth_proto_rawDesc = []byte{
	0x0a, 0x15, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x75, 0x74,
	0x68, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x70, 0x69, 0x22, 0x7e, 0x0a, 0x0e, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x34, 0x0a, 0x05, 0x72, 0x75, 0x6c, 0x65, 0x73, 0x18, 0x03,
	0x20, 0x03, 0x28, 0x0b, 0x32, 0x1e, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70,
	0x69, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x52, 0x75, 0x6c, 0x65, 0x52, 0x05, 0x72, 0x75, 0x6c, 0x65, 0x73, 0x12, 0x36, 0x0a, 0x09, 0x70,
	0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x18,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x41, 0x75, 0x74, 0x68,
	0x50, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x52, 0x09, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64,
	0x65, 0x72, 0x73, 0x22, 0xe0, 0x01, 0x0a, 0x12, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x75, 0x6c, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x73, 0x65,
	0x6c, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x73, 0x65,
	0x6c, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x12, 0x33, 0x0a, 0x05, 0x6f, 0x61, 0x75, 0x74, 0x68, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61,
	0x70, 0x69, 0x2e, 0x4f, 0x41, 0x75, 0x74, 0x68, 0x52, 0x65, 0x71, 0x75, 0x69, 0x72, 0x65, 0x6d,
	0x65, 0x6e, 0x74, 0x73, 0x52, 0x05, 0x6f, 0x61, 0x75, 0x74, 0x68, 0x12, 0x38, 0x0a, 0x18, 0x61,
	0x6c, 0x6c, 0x6f, 0x77, 0x5f, 0x77, 0x69, 0x74, 0x68, 0x6f, 0x75, 0x74, 0x5f, 0x63, 0x72, 0x65,
	0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x16, 0x61,
	0x6c, 0x6c, 0x6f, 0x77, 0x57, 0x69, 0x74, 0x68, 0x6f, 0x75, 0x74, 0x43, 0x72, 0x65, 0x64, 0x65,
	0x6e, 0x74, 0x69, 0x61, 0x6c, 0x12, 0x3f, 0x0a, 0x0c, 0x72, 0x65, 0x71, 0x75, 0x69, 0x72, 0x65,
	0x6d, 0x65, 0x6e, 0x74, 0x73, 0x18, 0x07, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x52, 0x65, 0x71,
	0x75, 0x69, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x52, 0x0c, 0x72, 0x65, 0x71, 0x75, 0x69, 0x72,
	0x65, 0x6d, 0x65, 0x6e, 0x74, 0x73, 0x22, 0x68, 0x0a, 0x0b, 0x4a, 0x77, 0x74, 0x4c, 0x6f, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x18, 0x0a, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x06, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12,
	0x16, 0x0a, 0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00,
	0x52, 0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x12, 0x21, 0x0a, 0x0c, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x5f, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x76,
	0x61, 0x6c, 0x75, 0x65, 0x50, 0x72, 0x65, 0x66, 0x69, 0x78, 0x42, 0x04, 0x0a, 0x02, 0x69, 0x6e,
	0x22, 0xda, 0x01, 0x0a, 0x0c, 0x41, 0x75, 0x74, 0x68, 0x50, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65,
	0x72, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69,
	0x64, 0x12, 0x16, 0x0a, 0x06, 0x69, 0x73, 0x73, 0x75, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x06, 0x69, 0x73, 0x73, 0x75, 0x65, 0x72, 0x12, 0x19, 0x0a, 0x08, 0x6a, 0x77, 0x6b,
	0x73, 0x5f, 0x75, 0x72, 0x69, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6a, 0x77, 0x6b,
	0x73, 0x55, 0x72, 0x69, 0x12, 0x1c, 0x0a, 0x09, 0x61, 0x75, 0x64, 0x69, 0x65, 0x6e, 0x63, 0x65,
	0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x61, 0x75, 0x64, 0x69, 0x65, 0x6e, 0x63,
	0x65, 0x73, 0x12, 0x2b, 0x0a, 0x11, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x61,
	0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x55, 0x72, 0x6c, 0x12,
	0x3c, 0x0a, 0x0d, 0x6a, 0x77, 0x74, 0x5f, 0x6c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x18, 0x06, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x61, 0x70, 0x69, 0x2e, 0x4a, 0x77, 0x74, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x0c, 0x6a, 0x77, 0x74, 0x4c, 0x6f, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x3e, 0x0a,
	0x11, 0x4f, 0x41, 0x75, 0x74, 0x68, 0x52, 0x65, 0x71, 0x75, 0x69, 0x72, 0x65, 0x6d, 0x65, 0x6e,
	0x74, 0x73, 0x12, 0x29, 0x0a, 0x10, 0x63, 0x61, 0x6e, 0x6f, 0x6e, 0x69, 0x63, 0x61, 0x6c, 0x5f,
	0x73, 0x63, 0x6f, 0x70, 0x65, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x63, 0x61,
	0x6e, 0x6f, 0x6e, 0x69, 0x63, 0x61, 0x6c, 0x53, 0x63, 0x6f, 0x70, 0x65, 0x73, 0x22, 0x50, 0x0a,
	0x0f, 0x41, 0x75, 0x74, 0x68, 0x52, 0x65, 0x71, 0x75, 0x69, 0x72, 0x65, 0x6d, 0x65, 0x6e, 0x74,
	0x12, 0x1f, 0x0a, 0x0b, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x70, 0x72, 0x6f, 0x76, 0x69, 0x64, 0x65, 0x72, 0x49,
	0x64, 0x12, 0x1c, 0x0a, 0x09, 0x61, 0x75, 0x64, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x73, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x61, 0x75, 0x64, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x73, 0x42,
	0x6b, 0x0a, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x61, 0x70,
	0x69, 0x42, 0x09, 0x41, 0x75, 0x74, 0x68, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x45,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72,
	0x67, 0x2f, 0x67, 0x65, 0x6e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x3b, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0xa2, 0x02, 0x04, 0x47, 0x41, 0x50, 0x49, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_api_auth_proto_rawDescOnce sync.Once
	file_google_api_auth_proto_rawDescData = file_google_api_auth_proto_rawDesc
)

func file_google_api_auth_proto_rawDescGZIP() []byte {
	file_google_api_auth_proto_rawDescOnce.Do(func() {
		file_google_api_auth_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_api_auth_proto_rawDescData)
	})
	return file_google_api_auth_proto_rawDescData
}

var file_google_api_auth_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_google_api_auth_proto_goTypes = []interface{}{
	(*Authentication)(nil),     // 0: google.api.Authentication
	(*AuthenticationRule)(nil), // 1: google.api.AuthenticationRule
	(*JwtLocation)(nil),        // 2: google.api.JwtLocation
	(*AuthProvider)(nil),       // 3: google.api.AuthProvider
	(*OAuthRequirements)(nil),  // 4: google.api.OAuthRequirements
	(*AuthRequirement)(nil),    // 5: google.api.AuthRequirement
}
var file_google_api_auth_proto_depIdxs = []int32{
	1, // 0: google.api.Authentication.rules:type_name -> google.api.AuthenticationRule
	3, // 1: google.api.Authentication.providers:type_name -> google.api.AuthProvider
	4, // 2: google.api.AuthenticationRule.oauth:type_name -> google.api.OAuthRequirements
	5, // 3: google.api.AuthenticationRule.requirements:type_name -> google.api.AuthRequirement
	2, // 4: google.api.AuthProvider.jwt_locations:type_name -> google.api.JwtLocation
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_google_api_auth_proto_init() }
func file_google_api_auth_proto_init() {
	if File_google_api_auth_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_google_api_auth_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Authentication); i {
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
		file_google_api_auth_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AuthenticationRule); i {
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
		file_google_api_auth_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JwtLocation); i {
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
		file_google_api_auth_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AuthProvider); i {
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
		file_google_api_auth_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OAuthRequirements); i {
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
		file_google_api_auth_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AuthRequirement); i {
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
	file_google_api_auth_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*JwtLocation_Header)(nil),
		(*JwtLocation_Query)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_api_auth_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_api_auth_proto_goTypes,
		DependencyIndexes: file_google_api_auth_proto_depIdxs,
		MessageInfos:      file_google_api_auth_proto_msgTypes,
	}.Build()
	File_google_api_auth_proto = out.File
	file_google_api_auth_proto_rawDesc = nil
	file_google_api_auth_proto_goTypes = nil
	file_google_api_auth_proto_depIdxs = nil
}
