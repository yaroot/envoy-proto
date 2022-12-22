# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/cx/v3beta1/transition_route_group.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.dialogflow.cx.v3beta1 import page_pb2 as google_dot_cloud_dot_dialogflow_dot_cx_dot_v3beta1_dot_page__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/cloud/dialogflow/cx/v3beta1/transition_route_group.proto\x12\"google.cloud.dialogflow.cx.v3beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a-google/cloud/dialogflow/cx/v3beta1/page.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xba\x02\n\x14TransitionRouteGroup\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12N\n\x11transition_routes\x18\x05 \x03(\x0b\x32\x33.google.cloud.dialogflow.cx.v3beta1.TransitionRoute:\xa8\x01\xea\x41\xa4\x01\n.dialogflow.googleapis.com/TransitionRouteGroup\x12rprojects/{project}/locations/{location}/agents/{agent}/flows/{flow}/transitionRouteGroups/{transition_route_group}\"\xa8\x01\n ListTransitionRouteGroupsRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\x12.dialogflow.googleapis.com/TransitionRouteGroup\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x15\n\rlanguage_code\x18\x04 \x01(\t\"\x97\x01\n!ListTransitionRouteGroupsResponse\x12Y\n\x17transition_route_groups\x18\x01 \x03(\x0b\x32\x38.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"}\n\x1eGetTransitionRouteGroupRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.dialogflow.googleapis.com/TransitionRouteGroup\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\"\xe1\x01\n!CreateTransitionRouteGroupRequest\x12\x46\n\x06parent\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\x12.dialogflow.googleapis.com/TransitionRouteGroup\x12]\n\x16transition_route_group\x18\x02 \x01(\x0b\x32\x38.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupB\x03\xe0\x41\x02\x12\x15\n\rlanguage_code\x18\x03 \x01(\t\"\xca\x01\n!UpdateTransitionRouteGroupRequest\x12]\n\x16transition_route_group\x18\x01 \x01(\x0b\x32\x38.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rlanguage_code\x18\x03 \x01(\t\"x\n!DeleteTransitionRouteGroupRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.dialogflow.googleapis.com/TransitionRouteGroup\x12\r\n\x05\x66orce\x18\x02 \x01(\x08\x32\xf7\x0b\n\x15TransitionRouteGroups\x12\x8a\x02\n\x19ListTransitionRouteGroups\x12\x44.google.cloud.dialogflow.cx.v3beta1.ListTransitionRouteGroupsRequest\x1a\x45.google.cloud.dialogflow.cx.v3beta1.ListTransitionRouteGroupsResponse\"`\x82\xd3\xe4\x93\x02Q\x12O/v3beta1/{parent=projects/*/locations/*/agents/*/flows/*}/transitionRouteGroups\xda\x41\x06parent\x12\xf7\x01\n\x17GetTransitionRouteGroup\x12\x42.google.cloud.dialogflow.cx.v3beta1.GetTransitionRouteGroupRequest\x1a\x38.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup\"^\x82\xd3\xe4\x93\x02Q\x12O/v3beta1/{name=projects/*/locations/*/agents/*/flows/*/transitionRouteGroups/*}\xda\x41\x04name\x12\xaf\x02\n\x1a\x43reateTransitionRouteGroup\x12\x45.google.cloud.dialogflow.cx.v3beta1.CreateTransitionRouteGroupRequest\x1a\x38.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup\"\x8f\x01\x82\xd3\xe4\x93\x02i\"O/v3beta1/{parent=projects/*/locations/*/agents/*/flows/*}/transitionRouteGroups:\x16transition_route_group\xda\x41\x1dparent,transition_route_group\x12\xcc\x02\n\x1aUpdateTransitionRouteGroup\x12\x45.google.cloud.dialogflow.cx.v3beta1.UpdateTransitionRouteGroupRequest\x1a\x38.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup\"\xac\x01\x82\xd3\xe4\x93\x02\x80\x01\x32\x66/v3beta1/{transition_route_group.name=projects/*/locations/*/agents/*/flows/*/transitionRouteGroups/*}:\x16transition_route_group\xda\x41\"transition_route_group,update_mask\x12\xdb\x01\n\x1a\x44\x65leteTransitionRouteGroup\x12\x45.google.cloud.dialogflow.cx.v3beta1.DeleteTransitionRouteGroupRequest\x1a\x16.google.protobuf.Empty\"^\x82\xd3\xe4\x93\x02Q*O/v3beta1/{name=projects/*/locations/*/agents/*/flows/*/transitionRouteGroups/*}\xda\x41\x04name\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\xe1\x01\n&com.google.cloud.dialogflow.cx.v3beta1B\x19TransitionRouteGroupProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3beta1;cx\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\"Google.Cloud.Dialogflow.Cx.V3Beta1\xea\x02&Google::Cloud::Dialogflow::CX::V3beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.cx.v3beta1.transition_route_group_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.cloud.dialogflow.cx.v3beta1B\031TransitionRouteGroupProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1\352\002&Google::Cloud::Dialogflow::CX::V3beta1'
  _TRANSITIONROUTEGROUP.fields_by_name['display_name']._options = None
  _TRANSITIONROUTEGROUP.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _TRANSITIONROUTEGROUP._options = None
  _TRANSITIONROUTEGROUP._serialized_options = b'\352A\244\001\n.dialogflow.googleapis.com/TransitionRouteGroup\022rprojects/{project}/locations/{location}/agents/{agent}/flows/{flow}/transitionRouteGroups/{transition_route_group}'
  _LISTTRANSITIONROUTEGROUPSREQUEST.fields_by_name['parent']._options = None
  _LISTTRANSITIONROUTEGROUPSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\022.dialogflow.googleapis.com/TransitionRouteGroup'
  _GETTRANSITIONROUTEGROUPREQUEST.fields_by_name['name']._options = None
  _GETTRANSITIONROUTEGROUPREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.dialogflow.googleapis.com/TransitionRouteGroup'
  _CREATETRANSITIONROUTEGROUPREQUEST.fields_by_name['parent']._options = None
  _CREATETRANSITIONROUTEGROUPREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A0\022.dialogflow.googleapis.com/TransitionRouteGroup'
  _CREATETRANSITIONROUTEGROUPREQUEST.fields_by_name['transition_route_group']._options = None
  _CREATETRANSITIONROUTEGROUPREQUEST.fields_by_name['transition_route_group']._serialized_options = b'\340A\002'
  _UPDATETRANSITIONROUTEGROUPREQUEST.fields_by_name['transition_route_group']._options = None
  _UPDATETRANSITIONROUTEGROUPREQUEST.fields_by_name['transition_route_group']._serialized_options = b'\340A\002'
  _DELETETRANSITIONROUTEGROUPREQUEST.fields_by_name['name']._options = None
  _DELETETRANSITIONROUTEGROUPREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.dialogflow.googleapis.com/TransitionRouteGroup'
  _TRANSITIONROUTEGROUPS._options = None
  _TRANSITIONROUTEGROUPS._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _TRANSITIONROUTEGROUPS.methods_by_name['ListTransitionRouteGroups']._options = None
  _TRANSITIONROUTEGROUPS.methods_by_name['ListTransitionRouteGroups']._serialized_options = b'\202\323\344\223\002Q\022O/v3beta1/{parent=projects/*/locations/*/agents/*/flows/*}/transitionRouteGroups\332A\006parent'
  _TRANSITIONROUTEGROUPS.methods_by_name['GetTransitionRouteGroup']._options = None
  _TRANSITIONROUTEGROUPS.methods_by_name['GetTransitionRouteGroup']._serialized_options = b'\202\323\344\223\002Q\022O/v3beta1/{name=projects/*/locations/*/agents/*/flows/*/transitionRouteGroups/*}\332A\004name'
  _TRANSITIONROUTEGROUPS.methods_by_name['CreateTransitionRouteGroup']._options = None
  _TRANSITIONROUTEGROUPS.methods_by_name['CreateTransitionRouteGroup']._serialized_options = b'\202\323\344\223\002i\"O/v3beta1/{parent=projects/*/locations/*/agents/*/flows/*}/transitionRouteGroups:\026transition_route_group\332A\035parent,transition_route_group'
  _TRANSITIONROUTEGROUPS.methods_by_name['UpdateTransitionRouteGroup']._options = None
  _TRANSITIONROUTEGROUPS.methods_by_name['UpdateTransitionRouteGroup']._serialized_options = b'\202\323\344\223\002\200\0012f/v3beta1/{transition_route_group.name=projects/*/locations/*/agents/*/flows/*/transitionRouteGroups/*}:\026transition_route_group\332A\"transition_route_group,update_mask'
  _TRANSITIONROUTEGROUPS.methods_by_name['DeleteTransitionRouteGroup']._options = None
  _TRANSITIONROUTEGROUPS.methods_by_name['DeleteTransitionRouteGroup']._serialized_options = b'\202\323\344\223\002Q*O/v3beta1/{name=projects/*/locations/*/agents/*/flows/*/transitionRouteGroups/*}\332A\004name'
  _TRANSITIONROUTEGROUP._serialized_start=329
  _TRANSITIONROUTEGROUP._serialized_end=643
  _LISTTRANSITIONROUTEGROUPSREQUEST._serialized_start=646
  _LISTTRANSITIONROUTEGROUPSREQUEST._serialized_end=814
  _LISTTRANSITIONROUTEGROUPSRESPONSE._serialized_start=817
  _LISTTRANSITIONROUTEGROUPSRESPONSE._serialized_end=968
  _GETTRANSITIONROUTEGROUPREQUEST._serialized_start=970
  _GETTRANSITIONROUTEGROUPREQUEST._serialized_end=1095
  _CREATETRANSITIONROUTEGROUPREQUEST._serialized_start=1098
  _CREATETRANSITIONROUTEGROUPREQUEST._serialized_end=1323
  _UPDATETRANSITIONROUTEGROUPREQUEST._serialized_start=1326
  _UPDATETRANSITIONROUTEGROUPREQUEST._serialized_end=1528
  _DELETETRANSITIONROUTEGROUPREQUEST._serialized_start=1530
  _DELETETRANSITIONROUTEGROUPREQUEST._serialized_end=1650
  _TRANSITIONROUTEGROUPS._serialized_start=1653
  _TRANSITIONROUTEGROUPS._serialized_end=3180
# @@protoc_insertion_point(module_scope)