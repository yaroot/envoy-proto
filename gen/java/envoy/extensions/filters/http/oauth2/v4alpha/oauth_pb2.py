# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/oauth2/v4alpha/oauth.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import http_uri_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_http__uri__pb2
from envoy.config.route.v4alpha import route_components_pb2 as envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2
from envoy.extensions.transport_sockets.tls.v4alpha import secret_pb2 as envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_secret__pb2
from envoy.type.matcher.v4alpha import path_pb2 as envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/http/oauth2/v4alpha/oauth.proto',
  package='envoy.extensions.filters.http.oauth2.v4alpha',
  syntax='proto3',
  serialized_options=b'\n:io.envoyproxy.envoy.extensions.filters.http.oauth2.v4alphaB\nOauthProtoP\001\272\200\310\321\006\002\010\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8envoy/extensions/filters/http/oauth2/v4alpha/oauth.proto\x12,envoy.extensions.filters.http.oauth2.v4alpha\x1a(envoy/config/core/v4alpha/http_uri.proto\x1a\x31\x65nvoy/config/route/v4alpha/route_components.proto\x1a;envoy/extensions/transport_sockets/tls/v4alpha/secret.proto\x1a%envoy/type/matcher/v4alpha/path.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xd1\x02\n\x11OAuth2Credentials\x12\x1a\n\tclient_id\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12_\n\x0ctoken_secret\x18\x02 \x01(\x0b\x32?.envoy.extensions.transport_sockets.tls.v4alpha.SdsSecretConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12`\n\x0bhmac_secret\x18\x03 \x01(\x0b\x32?.envoy.extensions.transport_sockets.tls.v4alpha.SdsSecretConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01H\x00:E\x9a\xc5\x88\x1e@\n>envoy.extensions.filters.http.oauth2.v3alpha.OAuth2CredentialsB\x16\n\x0ftoken_formation\x12\x03\xf8\x42\x01\"\xb6\x04\n\x0cOAuth2Config\x12:\n\x0etoken_endpoint\x18\x01 \x01(\x0b\x32\".envoy.config.core.v4alpha.HttpUri\x12\'\n\x16\x61uthorization_endpoint\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12^\n\x0b\x63redentials\x18\x03 \x01(\x0b\x32?.envoy.extensions.filters.http.oauth2.v4alpha.OAuth2CredentialsB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x1d\n\x0credirect_uri\x18\x04 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12P\n\x15redirect_path_matcher\x18\x05 \x01(\x0b\x32\'.envoy.type.matcher.v4alpha.PathMatcherB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12G\n\x0csignout_path\x18\x06 \x01(\x0b\x32\'.envoy.type.matcher.v4alpha.PathMatcherB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x1c\n\x14\x66orward_bearer_token\x18\x07 \x01(\x08\x12G\n\x14pass_through_matcher\x18\x08 \x03(\x0b\x32).envoy.config.route.v4alpha.HeaderMatcher:@\x9a\xc5\x88\x1e;\n9envoy.extensions.filters.http.oauth2.v3alpha.OAuth2Config\"\x90\x01\n\x06OAuth2\x12J\n\x06\x63onfig\x18\x01 \x01(\x0b\x32:.envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config::\x9a\xc5\x88\x1e\x35\n3envoy.extensions.filters.http.oauth2.v3alpha.OAuth2BZ\n:io.envoyproxy.envoy.extensions.filters.http.oauth2.v4alphaB\nOauthProtoP\x01\xba\x80\xc8\xd1\x06\x02\x08\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_http__uri__pb2.DESCRIPTOR,envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2.DESCRIPTOR,envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_secret__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_OAUTH2CREDENTIALS = _descriptor.Descriptor(
  name='OAuth2Credentials',
  full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Credentials',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='client_id', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Credentials.client_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='token_secret', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Credentials.token_secret', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hmac_secret', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Credentials.hmac_secret', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036@\n>envoy.extensions.filters.http.oauth2.v3alpha.OAuth2Credentials',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='token_formation', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Credentials.token_formation',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=423,
  serialized_end=760,
)


_OAUTH2CONFIG = _descriptor.Descriptor(
  name='OAuth2Config',
  full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='token_endpoint', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.token_endpoint', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='authorization_endpoint', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.authorization_endpoint', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='credentials', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.credentials', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='redirect_uri', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.redirect_uri', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='redirect_path_matcher', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.redirect_path_matcher', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='signout_path', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.signout_path', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='forward_bearer_token', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.forward_bearer_token', index=6,
      number=7, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pass_through_matcher', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config.pass_through_matcher', index=7,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036;\n9envoy.extensions.filters.http.oauth2.v3alpha.OAuth2Config',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=763,
  serialized_end=1329,
)


_OAUTH2 = _descriptor.Descriptor(
  name='OAuth2',
  full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config', full_name='envoy.extensions.filters.http.oauth2.v4alpha.OAuth2.config', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\0365\n3envoy.extensions.filters.http.oauth2.v3alpha.OAuth2',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1332,
  serialized_end=1476,
)

_OAUTH2CREDENTIALS.fields_by_name['token_secret'].message_type = envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_secret__pb2._SDSSECRETCONFIG
_OAUTH2CREDENTIALS.fields_by_name['hmac_secret'].message_type = envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_secret__pb2._SDSSECRETCONFIG
_OAUTH2CREDENTIALS.oneofs_by_name['token_formation'].fields.append(
  _OAUTH2CREDENTIALS.fields_by_name['hmac_secret'])
_OAUTH2CREDENTIALS.fields_by_name['hmac_secret'].containing_oneof = _OAUTH2CREDENTIALS.oneofs_by_name['token_formation']
_OAUTH2CONFIG.fields_by_name['token_endpoint'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_http__uri__pb2._HTTPURI
_OAUTH2CONFIG.fields_by_name['credentials'].message_type = _OAUTH2CREDENTIALS
_OAUTH2CONFIG.fields_by_name['redirect_path_matcher'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2._PATHMATCHER
_OAUTH2CONFIG.fields_by_name['signout_path'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2._PATHMATCHER
_OAUTH2CONFIG.fields_by_name['pass_through_matcher'].message_type = envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2._HEADERMATCHER
_OAUTH2.fields_by_name['config'].message_type = _OAUTH2CONFIG
DESCRIPTOR.message_types_by_name['OAuth2Credentials'] = _OAUTH2CREDENTIALS
DESCRIPTOR.message_types_by_name['OAuth2Config'] = _OAUTH2CONFIG
DESCRIPTOR.message_types_by_name['OAuth2'] = _OAUTH2
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OAuth2Credentials = _reflection.GeneratedProtocolMessageType('OAuth2Credentials', (_message.Message,), {
  'DESCRIPTOR' : _OAUTH2CREDENTIALS,
  '__module__' : 'envoy.extensions.filters.http.oauth2.v4alpha.oauth_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Credentials)
  })
_sym_db.RegisterMessage(OAuth2Credentials)

OAuth2Config = _reflection.GeneratedProtocolMessageType('OAuth2Config', (_message.Message,), {
  'DESCRIPTOR' : _OAUTH2CONFIG,
  '__module__' : 'envoy.extensions.filters.http.oauth2.v4alpha.oauth_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.oauth2.v4alpha.OAuth2Config)
  })
_sym_db.RegisterMessage(OAuth2Config)

OAuth2 = _reflection.GeneratedProtocolMessageType('OAuth2', (_message.Message,), {
  'DESCRIPTOR' : _OAUTH2,
  '__module__' : 'envoy.extensions.filters.http.oauth2.v4alpha.oauth_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.oauth2.v4alpha.OAuth2)
  })
_sym_db.RegisterMessage(OAuth2)


DESCRIPTOR._options = None
_OAUTH2CREDENTIALS.oneofs_by_name['token_formation']._options = None
_OAUTH2CREDENTIALS.fields_by_name['client_id']._options = None
_OAUTH2CREDENTIALS.fields_by_name['token_secret']._options = None
_OAUTH2CREDENTIALS.fields_by_name['hmac_secret']._options = None
_OAUTH2CREDENTIALS._options = None
_OAUTH2CONFIG.fields_by_name['authorization_endpoint']._options = None
_OAUTH2CONFIG.fields_by_name['credentials']._options = None
_OAUTH2CONFIG.fields_by_name['redirect_uri']._options = None
_OAUTH2CONFIG.fields_by_name['redirect_path_matcher']._options = None
_OAUTH2CONFIG.fields_by_name['signout_path']._options = None
_OAUTH2CONFIG._options = None
_OAUTH2._options = None
# @@protoc_insertion_point(module_scope)