# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/apps/script/type/calendar/calendar_addon_manifest.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.apps.script.type import extension_point_pb2 as google_dot_apps_dot_script_dot_type_dot_extension__point__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/apps/script/type/calendar/calendar_addon_manifest.proto\x12 google.apps.script.type.calendar\x1a\x1fgoogle/api/field_behavior.proto\x1a-google/apps/script/type/extension_point.proto\"\xbf\x04\n\x15\x43\x61lendarAddOnManifest\x12I\n\x10homepage_trigger\x18\x06 \x01(\x0b\x32/.google.apps.script.type.HomepageExtensionPoint\x12Q\n\x13\x63onference_solution\x18\x03 \x03(\x0b\x32\x34.google.apps.script.type.calendar.ConferenceSolution\x12$\n\x1c\x63reate_settings_url_function\x18\x05 \x01(\t\x12T\n\x12\x65vent_open_trigger\x18\n \x01(\x0b\x32\x38.google.apps.script.type.calendar.CalendarExtensionPoint\x12V\n\x14\x65vent_update_trigger\x18\x0b \x01(\x0b\x32\x38.google.apps.script.type.calendar.CalendarExtensionPoint\x12\x61\n\x14\x63urrent_event_access\x18\x0c \x01(\x0e\x32\x43.google.apps.script.type.calendar.CalendarAddOnManifest.EventAccess\"Q\n\x0b\x45ventAccess\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0c\n\x08METADATA\x10\x01\x12\x08\n\x04READ\x10\x03\x12\t\n\x05WRITE\x10\x04\x12\x0e\n\nREAD_WRITE\x10\x05\"p\n\x12\x43onferenceSolution\x12\x1f\n\x12on_create_function\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x0f\n\x02id\x18\x04 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\x04name\x18\x05 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08logo_url\x18\x06 \x01(\tB\x03\xe0\x41\x02\"3\n\x16\x43\x61lendarExtensionPoint\x12\x19\n\x0crun_function\x18\x01 \x01(\tB\x03\xe0\x41\x02\x42\xf2\x01\n$com.google.apps.script.type.calendarB\x1a\x43\x61lendarAddOnManifestProtoP\x01Z?google.golang.org/genproto/googleapis/apps/script/type/calendar\xaa\x02 Google.Apps.Script.Type.Calendar\xca\x02 Google\\Apps\\Script\\Type\\Calendar\xea\x02$Google::Apps::Script::Type::Calendarb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.apps.script.type.calendar.calendar_addon_manifest_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.apps.script.type.calendarB\032CalendarAddOnManifestProtoP\001Z?google.golang.org/genproto/googleapis/apps/script/type/calendar\252\002 Google.Apps.Script.Type.Calendar\312\002 Google\\Apps\\Script\\Type\\Calendar\352\002$Google::Apps::Script::Type::Calendar'
  _CONFERENCESOLUTION.fields_by_name['on_create_function']._options = None
  _CONFERENCESOLUTION.fields_by_name['on_create_function']._serialized_options = b'\340A\002'
  _CONFERENCESOLUTION.fields_by_name['id']._options = None
  _CONFERENCESOLUTION.fields_by_name['id']._serialized_options = b'\340A\002'
  _CONFERENCESOLUTION.fields_by_name['name']._options = None
  _CONFERENCESOLUTION.fields_by_name['name']._serialized_options = b'\340A\002'
  _CONFERENCESOLUTION.fields_by_name['logo_url']._options = None
  _CONFERENCESOLUTION.fields_by_name['logo_url']._serialized_options = b'\340A\002'
  _CALENDAREXTENSIONPOINT.fields_by_name['run_function']._options = None
  _CALENDAREXTENSIONPOINT.fields_by_name['run_function']._serialized_options = b'\340A\002'
  _CALENDARADDONMANIFEST._serialized_start=181
  _CALENDARADDONMANIFEST._serialized_end=756
  _CALENDARADDONMANIFEST_EVENTACCESS._serialized_start=675
  _CALENDARADDONMANIFEST_EVENTACCESS._serialized_end=756
  _CONFERENCESOLUTION._serialized_start=758
  _CONFERENCESOLUTION._serialized_end=870
  _CALENDAREXTENSIONPOINT._serialized_start=872
  _CALENDAREXTENSIONPOINT._serialized_end=923
# @@protoc_insertion_point(module_scope)