# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/config_file.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2 import account_linking_secret_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_account__linking__secret__pb2
from google.actions.sdk.v2 import action_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_action__pb2
from google.actions.sdk.v2.interactionmodel import entity_set_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_entity__set__pb2
from google.actions.sdk.v2.interactionmodel import global_intent_event_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_global__intent__event__pb2
from google.actions.sdk.v2.interactionmodel import intent_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_intent__pb2
from google.actions.sdk.v2.interactionmodel.prompt import static_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_static__prompt__pb2
from google.actions.sdk.v2.interactionmodel import scene_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_scene__pb2
from google.actions.sdk.v2.interactionmodel.type import type_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_type__pb2
from google.actions.sdk.v2 import manifest_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_manifest__pb2
from google.actions.sdk.v2 import settings_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_settings__pb2
from google.actions.sdk.v2 import webhook_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_webhook__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/config_file.proto',
  package='google.actions.sdk.v2',
  syntax='proto3',
  serialized_options=b'\n\031com.google.actions.sdk.v2B\017ConfigFileProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'google/actions/sdk/v2/config_file.proto\x12\x15google.actions.sdk.v2\x1a\x32google/actions/sdk/v2/account_linking_secret.proto\x1a\"google/actions/sdk/v2/action.proto\x1a\x37google/actions/sdk/v2/interactionmodel/entity_set.proto\x1a@google/actions/sdk/v2/interactionmodel/global_intent_event.proto\x1a\x33google/actions/sdk/v2/interactionmodel/intent.proto\x1a\x41google/actions/sdk/v2/interactionmodel/prompt/static_prompt.proto\x1a\x32google/actions/sdk/v2/interactionmodel/scene.proto\x1a\x36google/actions/sdk/v2/interactionmodel/type/type.proto\x1a$google/actions/sdk/v2/manifest.proto\x1a$google/actions/sdk/v2/settings.proto\x1a#google/actions/sdk/v2/webhook.proto\x1a\x1cgoogle/protobuf/struct.proto\"F\n\x0b\x43onfigFiles\x12\x37\n\x0c\x63onfig_files\x18\x01 \x03(\x0b\x32!.google.actions.sdk.v2.ConfigFile\"\xb8\x06\n\nConfigFile\x12\x11\n\tfile_path\x18\x01 \x01(\t\x12\x33\n\x08manifest\x18\x02 \x01(\x0b\x32\x1f.google.actions.sdk.v2.ManifestH\x00\x12\x31\n\x07\x61\x63tions\x18\x03 \x01(\x0b\x32\x1e.google.actions.sdk.v2.ActionsH\x00\x12\x33\n\x08settings\x18\x04 \x01(\x0b\x32\x1f.google.actions.sdk.v2.SettingsH\x00\x12\x31\n\x07webhook\x18\x06 \x01(\x0b\x32\x1e.google.actions.sdk.v2.WebhookH\x00\x12@\n\x06intent\x18\x07 \x01(\x0b\x32..google.actions.sdk.v2.interactionmodel.IntentH\x00\x12\x41\n\x04type\x18\x08 \x01(\x0b\x32\x31.google.actions.sdk.v2.interactionmodel.type.TypeH\x00\x12G\n\nentity_set\x18\x0f \x01(\x0b\x32\x31.google.actions.sdk.v2.interactionmodel.EntitySetH\x00\x12X\n\x13global_intent_event\x18\t \x01(\x0b\x32\x39.google.actions.sdk.v2.interactionmodel.GlobalIntentEventH\x00\x12>\n\x05scene\x18\n \x01(\x0b\x32-.google.actions.sdk.v2.interactionmodel.SceneH\x00\x12T\n\rstatic_prompt\x18\x0b \x01(\x0b\x32;.google.actions.sdk.v2.interactionmodel.prompt.StaticPromptH\x00\x12M\n\x16\x61\x63\x63ount_linking_secret\x18\r \x01(\x0b\x32+.google.actions.sdk.v2.AccountLinkingSecretH\x00\x12\x32\n\x0fresource_bundle\x18\x0c \x01(\x0b\x32\x17.google.protobuf.StructH\x00\x42\x06\n\x04\x66ileBh\n\x19\x63om.google.actions.sdk.v2B\x0f\x43onfigFileProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_account__linking__secret__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_action__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_entity__set__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_global__intent__event__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_intent__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_static__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_scene__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_type__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_manifest__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_settings__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_webhook__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,])




_CONFIGFILES = _descriptor.Descriptor(
  name='ConfigFiles',
  full_name='google.actions.sdk.v2.ConfigFiles',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config_files', full_name='google.actions.sdk.v2.ConfigFiles.config_files', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=648,
  serialized_end=718,
)


_CONFIGFILE = _descriptor.Descriptor(
  name='ConfigFile',
  full_name='google.actions.sdk.v2.ConfigFile',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='file_path', full_name='google.actions.sdk.v2.ConfigFile.file_path', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='manifest', full_name='google.actions.sdk.v2.ConfigFile.manifest', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='actions', full_name='google.actions.sdk.v2.ConfigFile.actions', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='settings', full_name='google.actions.sdk.v2.ConfigFile.settings', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='webhook', full_name='google.actions.sdk.v2.ConfigFile.webhook', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='intent', full_name='google.actions.sdk.v2.ConfigFile.intent', index=5,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.actions.sdk.v2.ConfigFile.type', index=6,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='entity_set', full_name='google.actions.sdk.v2.ConfigFile.entity_set', index=7,
      number=15, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='global_intent_event', full_name='google.actions.sdk.v2.ConfigFile.global_intent_event', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scene', full_name='google.actions.sdk.v2.ConfigFile.scene', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='static_prompt', full_name='google.actions.sdk.v2.ConfigFile.static_prompt', index=10,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='account_linking_secret', full_name='google.actions.sdk.v2.ConfigFile.account_linking_secret', index=11,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource_bundle', full_name='google.actions.sdk.v2.ConfigFile.resource_bundle', index=12,
      number=12, type=11, cpp_type=10, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='file', full_name='google.actions.sdk.v2.ConfigFile.file',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=721,
  serialized_end=1545,
)

_CONFIGFILES.fields_by_name['config_files'].message_type = _CONFIGFILE
_CONFIGFILE.fields_by_name['manifest'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_manifest__pb2._MANIFEST
_CONFIGFILE.fields_by_name['actions'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_action__pb2._ACTIONS
_CONFIGFILE.fields_by_name['settings'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_settings__pb2._SETTINGS
_CONFIGFILE.fields_by_name['webhook'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_webhook__pb2._WEBHOOK
_CONFIGFILE.fields_by_name['intent'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_intent__pb2._INTENT
_CONFIGFILE.fields_by_name['type'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_type__pb2._TYPE
_CONFIGFILE.fields_by_name['entity_set'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_entity__set__pb2._ENTITYSET
_CONFIGFILE.fields_by_name['global_intent_event'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_global__intent__event__pb2._GLOBALINTENTEVENT
_CONFIGFILE.fields_by_name['scene'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_scene__pb2._SCENE
_CONFIGFILE.fields_by_name['static_prompt'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_static__prompt__pb2._STATICPROMPT
_CONFIGFILE.fields_by_name['account_linking_secret'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_account__linking__secret__pb2._ACCOUNTLINKINGSECRET
_CONFIGFILE.fields_by_name['resource_bundle'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['manifest'])
_CONFIGFILE.fields_by_name['manifest'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['actions'])
_CONFIGFILE.fields_by_name['actions'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['settings'])
_CONFIGFILE.fields_by_name['settings'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['webhook'])
_CONFIGFILE.fields_by_name['webhook'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['intent'])
_CONFIGFILE.fields_by_name['intent'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['type'])
_CONFIGFILE.fields_by_name['type'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['entity_set'])
_CONFIGFILE.fields_by_name['entity_set'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['global_intent_event'])
_CONFIGFILE.fields_by_name['global_intent_event'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['scene'])
_CONFIGFILE.fields_by_name['scene'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['static_prompt'])
_CONFIGFILE.fields_by_name['static_prompt'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['account_linking_secret'])
_CONFIGFILE.fields_by_name['account_linking_secret'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
_CONFIGFILE.oneofs_by_name['file'].fields.append(
  _CONFIGFILE.fields_by_name['resource_bundle'])
_CONFIGFILE.fields_by_name['resource_bundle'].containing_oneof = _CONFIGFILE.oneofs_by_name['file']
DESCRIPTOR.message_types_by_name['ConfigFiles'] = _CONFIGFILES
DESCRIPTOR.message_types_by_name['ConfigFile'] = _CONFIGFILE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ConfigFiles = _reflection.GeneratedProtocolMessageType('ConfigFiles', (_message.Message,), {
  'DESCRIPTOR' : _CONFIGFILES,
  '__module__' : 'google.actions.sdk.v2.config_file_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.ConfigFiles)
  })
_sym_db.RegisterMessage(ConfigFiles)

ConfigFile = _reflection.GeneratedProtocolMessageType('ConfigFile', (_message.Message,), {
  'DESCRIPTOR' : _CONFIGFILE,
  '__module__' : 'google.actions.sdk.v2.config_file_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.ConfigFile)
  })
_sym_db.RegisterMessage(ConfigFile)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
