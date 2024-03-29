# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2alpha/control_service.proto
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
from google.cloud.retail.v2alpha import control_pb2 as google_dot_cloud_dot_retail_dot_v2alpha_dot_control__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/retail/v2alpha/control_service.proto\x12\x1bgoogle.cloud.retail.v2alpha\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a)google/cloud/retail/v2alpha/control.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xa2\x01\n\x14\x43reateControlRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12:\n\x07\x63ontrol\x18\x02 \x01(\x0b\x32$.google.cloud.retail.v2alpha.ControlB\x03\xe0\x41\x02\x12\x17\n\ncontrol_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\x83\x01\n\x14UpdateControlRequest\x12:\n\x07\x63ontrol\x18\x01 \x01(\x0b\x32$.google.cloud.retail.v2alpha.ControlB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"K\n\x14\x44\x65leteControlRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Control\"H\n\x11GetControlRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Control\"\x92\x01\n\x13ListControlsRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dretail.googleapis.com/Catalog\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06\x66ilter\x18\x04 \x01(\tB\x03\xe0\x41\x01\"g\n\x14ListControlsResponse\x12\x36\n\x08\x63ontrols\x18\x01 \x03(\x0b\x32$.google.cloud.retail.v2alpha.Control\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xaa\x08\n\x0e\x43ontrolService\x12\xd3\x01\n\rCreateControl\x12\x31.google.cloud.retail.v2alpha.CreateControlRequest\x1a$.google.cloud.retail.v2alpha.Control\"i\x82\xd3\xe4\x93\x02G\"</v2alpha/{parent=projects/*/locations/*/catalogs/*}/controls:\x07\x63ontrol\xda\x41\x19parent,control,control_id\x12\xa7\x01\n\rDeleteControl\x12\x31.google.cloud.retail.v2alpha.DeleteControlRequest\x1a\x16.google.protobuf.Empty\"K\x82\xd3\xe4\x93\x02>*</v2alpha/{name=projects/*/locations/*/catalogs/*/controls/*}\xda\x41\x04name\x12\xd5\x01\n\rUpdateControl\x12\x31.google.cloud.retail.v2alpha.UpdateControlRequest\x1a$.google.cloud.retail.v2alpha.Control\"k\x82\xd3\xe4\x93\x02O2D/v2alpha/{control.name=projects/*/locations/*/catalogs/*/controls/*}:\x07\x63ontrol\xda\x41\x13\x63ontrol,update_mask\x12\xaf\x01\n\nGetControl\x12..google.cloud.retail.v2alpha.GetControlRequest\x1a$.google.cloud.retail.v2alpha.Control\"K\x82\xd3\xe4\x93\x02>\x12</v2alpha/{name=projects/*/locations/*/catalogs/*/controls/*}\xda\x41\x04name\x12\xc2\x01\n\x0cListControls\x12\x30.google.cloud.retail.v2alpha.ListControlsRequest\x1a\x31.google.cloud.retail.v2alpha.ListControlsResponse\"M\x82\xd3\xe4\x93\x02>\x12</v2alpha/{parent=projects/*/locations/*/catalogs/*}/controls\xda\x41\x06parent\x1aI\xca\x41\x15retail.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xe1\x01\n\x1f\x63om.google.cloud.retail.v2alphaB\x13\x43ontrolServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\xa2\x02\x06RETAIL\xaa\x02\x1bGoogle.Cloud.Retail.V2Alpha\xca\x02\x1bGoogle\\Cloud\\Retail\\V2alpha\xea\x02\x1eGoogle::Cloud::Retail::V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.retail.v2alpha.control_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.retail.v2alphaB\023ControlServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/retail/v2alpha;retail\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Google::Cloud::Retail::V2alpha'
  _CREATECONTROLREQUEST.fields_by_name['parent']._options = None
  _CREATECONTROLREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog'
  _CREATECONTROLREQUEST.fields_by_name['control']._options = None
  _CREATECONTROLREQUEST.fields_by_name['control']._serialized_options = b'\340A\002'
  _CREATECONTROLREQUEST.fields_by_name['control_id']._options = None
  _CREATECONTROLREQUEST.fields_by_name['control_id']._serialized_options = b'\340A\002'
  _UPDATECONTROLREQUEST.fields_by_name['control']._options = None
  _UPDATECONTROLREQUEST.fields_by_name['control']._serialized_options = b'\340A\002'
  _DELETECONTROLREQUEST.fields_by_name['name']._options = None
  _DELETECONTROLREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Control'
  _GETCONTROLREQUEST.fields_by_name['name']._options = None
  _GETCONTROLREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Control'
  _LISTCONTROLSREQUEST.fields_by_name['parent']._options = None
  _LISTCONTROLSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035retail.googleapis.com/Catalog'
  _LISTCONTROLSREQUEST.fields_by_name['page_size']._options = None
  _LISTCONTROLSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTCONTROLSREQUEST.fields_by_name['page_token']._options = None
  _LISTCONTROLSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _LISTCONTROLSREQUEST.fields_by_name['filter']._options = None
  _LISTCONTROLSREQUEST.fields_by_name['filter']._serialized_options = b'\340A\001'
  _CONTROLSERVICE._options = None
  _CONTROLSERVICE._serialized_options = b'\312A\025retail.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _CONTROLSERVICE.methods_by_name['CreateControl']._options = None
  _CONTROLSERVICE.methods_by_name['CreateControl']._serialized_options = b'\202\323\344\223\002G\"</v2alpha/{parent=projects/*/locations/*/catalogs/*}/controls:\007control\332A\031parent,control,control_id'
  _CONTROLSERVICE.methods_by_name['DeleteControl']._options = None
  _CONTROLSERVICE.methods_by_name['DeleteControl']._serialized_options = b'\202\323\344\223\002>*</v2alpha/{name=projects/*/locations/*/catalogs/*/controls/*}\332A\004name'
  _CONTROLSERVICE.methods_by_name['UpdateControl']._options = None
  _CONTROLSERVICE.methods_by_name['UpdateControl']._serialized_options = b'\202\323\344\223\002O2D/v2alpha/{control.name=projects/*/locations/*/catalogs/*/controls/*}:\007control\332A\023control,update_mask'
  _CONTROLSERVICE.methods_by_name['GetControl']._options = None
  _CONTROLSERVICE.methods_by_name['GetControl']._serialized_options = b'\202\323\344\223\002>\022</v2alpha/{name=projects/*/locations/*/catalogs/*/controls/*}\332A\004name'
  _CONTROLSERVICE.methods_by_name['ListControls']._options = None
  _CONTROLSERVICE.methods_by_name['ListControls']._serialized_options = b'\202\323\344\223\002>\022</v2alpha/{parent=projects/*/locations/*/catalogs/*}/controls\332A\006parent'
  _CREATECONTROLREQUEST._serialized_start=304
  _CREATECONTROLREQUEST._serialized_end=466
  _UPDATECONTROLREQUEST._serialized_start=469
  _UPDATECONTROLREQUEST._serialized_end=600
  _DELETECONTROLREQUEST._serialized_start=602
  _DELETECONTROLREQUEST._serialized_end=677
  _GETCONTROLREQUEST._serialized_start=679
  _GETCONTROLREQUEST._serialized_end=751
  _LISTCONTROLSREQUEST._serialized_start=754
  _LISTCONTROLSREQUEST._serialized_end=900
  _LISTCONTROLSRESPONSE._serialized_start=902
  _LISTCONTROLSRESPONSE._serialized_end=1005
  _CONTROLSERVICE._serialized_start=1008
  _CONTROLSERVICE._serialized_end=2074
# @@protoc_insertion_point(module_scope)
