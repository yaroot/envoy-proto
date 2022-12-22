# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/apps/alertcenter/v1beta1/alertcenter.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/apps/alertcenter/v1beta1/alertcenter.proto\x12\x1fgoogle.apps.alertcenter.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/protobuf/any.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x17google/api/client.proto\"\xbb\x03\n\x05\x41lert\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\x12/\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12.\n\nstart_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04type\x18\x06 \x01(\t\x12\x0e\n\x06source\x18\x07 \x01(\t\x12\"\n\x04\x64\x61ta\x18\x08 \x01(\x0b\x32\x14.google.protobuf.Any\x12(\n security_investigation_tool_link\x18\t \x01(\t\x12\x0f\n\x07\x64\x65leted\x18\x0b \x01(\x08\x12@\n\x08metadata\x18\x0c \x01(\x0b\x32..google.apps.alertcenter.v1beta1.AlertMetadata\x12/\n\x0bupdate_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x65tag\x18\x0e \x01(\t\"\xcd\x01\n\rAlertFeedback\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\x12\x13\n\x0b\x66\x65\x65\x64\x62\x61\x63k_id\x18\x03 \x01(\t\x12/\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12@\n\x04type\x18\x05 \x01(\x0e\x32\x32.google.apps.alertcenter.v1beta1.AlertFeedbackType\x12\r\n\x05\x65mail\x18\x06 \x01(\t\"\xa9\x01\n\rAlertMetadata\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\x12\x0e\n\x06status\x18\x04 \x01(\t\x12\x10\n\x08\x61ssignee\x18\x05 \x01(\t\x12/\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x10\n\x08severity\x18\x07 \x01(\t\x12\x0c\n\x04\x65tag\x18\x08 \x01(\t\"\xa2\x03\n\x08Settings\x12M\n\rnotifications\x18\x01 \x03(\x0b\x32\x36.google.apps.alertcenter.v1beta1.Settings.Notification\x1a\xc6\x02\n\x0cNotification\x12\x65\n\x12\x63loud_pubsub_topic\x18\x01 \x01(\x0b\x32G.google.apps.alertcenter.v1beta1.Settings.Notification.CloudPubsubTopicH\x00\x1a\x84\x01\n\x10\x43loudPubsubTopic\x12\x12\n\ntopic_name\x18\x01 \x01(\t\x12\\\n\x0epayload_format\x18\x02 \x01(\x0e\x32\x44.google.apps.alertcenter.v1beta1.Settings.Notification.PayloadFormat\"9\n\rPayloadFormat\x12\x1e\n\x1aPAYLOAD_FORMAT_UNSPECIFIED\x10\x00\x12\x08\n\x04JSON\x10\x01\x42\r\n\x0b\x64\x65stination\"A\n\x18\x42\x61tchDeleteAlertsRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x03(\t\"\xf4\x01\n\x19\x42\x61tchDeleteAlertsResponse\x12\x19\n\x11success_alert_ids\x18\x01 \x03(\t\x12n\n\x13\x66\x61iled_alert_status\x18\x02 \x03(\x0b\x32Q.google.apps.alertcenter.v1beta1.BatchDeleteAlertsResponse.FailedAlertStatusEntry\x1aL\n\x16\x46\x61iledAlertStatusEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12!\n\x05value\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status:\x02\x38\x01\"C\n\x1a\x42\x61tchUndeleteAlertsRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x03(\t\"\xf8\x01\n\x1b\x42\x61tchUndeleteAlertsResponse\x12\x19\n\x11success_alert_ids\x18\x01 \x03(\t\x12p\n\x13\x66\x61iled_alert_status\x18\x02 \x03(\x0b\x32S.google.apps.alertcenter.v1beta1.BatchUndeleteAlertsResponse.FailedAlertStatusEntry\x1aL\n\x16\x46\x61iledAlertStatusEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12!\n\x05value\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status:\x02\x38\x01\"q\n\x11ListAlertsRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"e\n\x12ListAlertsResponse\x12\x36\n\x06\x61lerts\x18\x01 \x03(\x0b\x32&.google.apps.alertcenter.v1beta1.Alert\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"8\n\x0fGetAlertRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\";\n\x12\x44\x65leteAlertRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\"=\n\x14UndeleteAlertRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\"\x85\x01\n\x1a\x43reateAlertFeedbackRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\x12@\n\x08\x66\x65\x65\x64\x62\x61\x63k\x18\x03 \x01(\x0b\x32..google.apps.alertcenter.v1beta1.AlertFeedback\"Q\n\x18ListAlertFeedbackRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\"]\n\x19ListAlertFeedbackResponse\x12@\n\x08\x66\x65\x65\x64\x62\x61\x63k\x18\x01 \x03(\x0b\x32..google.apps.alertcenter.v1beta1.AlertFeedback\"@\n\x17GetAlertMetadataRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08\x61lert_id\x18\x02 \x01(\t\")\n\x12GetSettingsRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\"i\n\x15UpdateSettingsRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12;\n\x08settings\x18\x02 \x01(\x0b\x32).google.apps.alertcenter.v1beta1.Settings*n\n\x11\x41lertFeedbackType\x12#\n\x1f\x41LERT_FEEDBACK_TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nNOT_USEFUL\x10\x01\x12\x13\n\x0fSOMEWHAT_USEFUL\x10\x02\x12\x0f\n\x0bVERY_USEFUL\x10\x03\x32\xd8\x0e\n\x12\x41lertCenterService\x12\x8e\x01\n\nListAlerts\x12\x32.google.apps.alertcenter.v1beta1.ListAlertsRequest\x1a\x33.google.apps.alertcenter.v1beta1.ListAlertsResponse\"\x17\x82\xd3\xe4\x93\x02\x11\x12\x0f/v1beta1/alerts\x12\x88\x01\n\x08GetAlert\x12\x30.google.apps.alertcenter.v1beta1.GetAlertRequest\x1a&.google.apps.alertcenter.v1beta1.Alert\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1beta1/alerts/{alert_id}\x12~\n\x0b\x44\x65leteAlert\x12\x33.google.apps.alertcenter.v1beta1.DeleteAlertRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1beta1/alerts/{alert_id}\x12\x9e\x01\n\rUndeleteAlert\x12\x35.google.apps.alertcenter.v1beta1.UndeleteAlertRequest\x1a&.google.apps.alertcenter.v1beta1.Alert\".\x82\xd3\xe4\x93\x02(\"#/v1beta1/alerts/{alert_id}:undelete:\x01*\x12\xb9\x01\n\x13\x43reateAlertFeedback\x12;.google.apps.alertcenter.v1beta1.CreateAlertFeedbackRequest\x1a..google.apps.alertcenter.v1beta1.AlertFeedback\"5\x82\xd3\xe4\x93\x02/\"#/v1beta1/alerts/{alert_id}/feedback:\x08\x66\x65\x65\x64\x62\x61\x63k\x12\xb7\x01\n\x11ListAlertFeedback\x12\x39.google.apps.alertcenter.v1beta1.ListAlertFeedbackRequest\x1a:.google.apps.alertcenter.v1beta1.ListAlertFeedbackResponse\"+\x82\xd3\xe4\x93\x02%\x12#/v1beta1/alerts/{alert_id}/feedback\x12\xa9\x01\n\x10GetAlertMetadata\x12\x38.google.apps.alertcenter.v1beta1.GetAlertMetadataRequest\x1a..google.apps.alertcenter.v1beta1.AlertMetadata\"+\x82\xd3\xe4\x93\x02%\x12#/v1beta1/alerts/{alert_id}/metadata\x12\x88\x01\n\x0bGetSettings\x12\x33.google.apps.alertcenter.v1beta1.GetSettingsRequest\x1a).google.apps.alertcenter.v1beta1.Settings\"\x19\x82\xd3\xe4\x93\x02\x13\x12\x11/v1beta1/settings\x12\x98\x01\n\x0eUpdateSettings\x12\x36.google.apps.alertcenter.v1beta1.UpdateSettingsRequest\x1a).google.apps.alertcenter.v1beta1.Settings\"#\x82\xd3\xe4\x93\x02\x1d\x32\x11/v1beta1/settings:\x08settings\x12\xb2\x01\n\x11\x42\x61tchDeleteAlerts\x12\x39.google.apps.alertcenter.v1beta1.BatchDeleteAlertsRequest\x1a:.google.apps.alertcenter.v1beta1.BatchDeleteAlertsResponse\"&\x82\xd3\xe4\x93\x02 \"\x1b/v1beta1/alerts:batchDelete:\x01*\x12\xba\x01\n\x13\x42\x61tchUndeleteAlerts\x12;.google.apps.alertcenter.v1beta1.BatchUndeleteAlertsRequest\x1a<.google.apps.alertcenter.v1beta1.BatchUndeleteAlertsResponse\"(\x82\xd3\xe4\x93\x02\"\"\x1d/v1beta1/alerts:batchUndelete:\x01*\x1aK\xca\x41\x1a\x61lertcenter.googleapis.com\xd2\x41+https://www.googleapis.com/auth/apps.alertsB\xf5\x01\n#com.google.apps.alertcenter.v1beta1B\x10\x41lertCenterProtoP\x01ZJgoogle.golang.org/genproto/googleapis/apps/alertcenter/v1beta1;alertcenter\xa2\x02\x04GAIC\xaa\x02\x1fGoogle.Apps.AlertCenter.V1Beta1\xca\x02\x1fGoogle\\Apps\\AlertCenter\\V1beta1\xea\x02\"Google::Apps::AlertCenter::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.apps.alertcenter.v1beta1.alertcenter_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.apps.alertcenter.v1beta1B\020AlertCenterProtoP\001ZJgoogle.golang.org/genproto/googleapis/apps/alertcenter/v1beta1;alertcenter\242\002\004GAIC\252\002\037Google.Apps.AlertCenter.V1Beta1\312\002\037Google\\Apps\\AlertCenter\\V1beta1\352\002\"Google::Apps::AlertCenter::V1beta1'
  _BATCHDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._options = None
  _BATCHDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._serialized_options = b'8\001'
  _BATCHUNDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._options = None
  _BATCHUNDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._serialized_options = b'8\001'
  _ALERTCENTERSERVICE._options = None
  _ALERTCENTERSERVICE._serialized_options = b'\312A\032alertcenter.googleapis.com\322A+https://www.googleapis.com/auth/apps.alerts'
  _ALERTCENTERSERVICE.methods_by_name['ListAlerts']._options = None
  _ALERTCENTERSERVICE.methods_by_name['ListAlerts']._serialized_options = b'\202\323\344\223\002\021\022\017/v1beta1/alerts'
  _ALERTCENTERSERVICE.methods_by_name['GetAlert']._options = None
  _ALERTCENTERSERVICE.methods_by_name['GetAlert']._serialized_options = b'\202\323\344\223\002\034\022\032/v1beta1/alerts/{alert_id}'
  _ALERTCENTERSERVICE.methods_by_name['DeleteAlert']._options = None
  _ALERTCENTERSERVICE.methods_by_name['DeleteAlert']._serialized_options = b'\202\323\344\223\002\034*\032/v1beta1/alerts/{alert_id}'
  _ALERTCENTERSERVICE.methods_by_name['UndeleteAlert']._options = None
  _ALERTCENTERSERVICE.methods_by_name['UndeleteAlert']._serialized_options = b'\202\323\344\223\002(\"#/v1beta1/alerts/{alert_id}:undelete:\001*'
  _ALERTCENTERSERVICE.methods_by_name['CreateAlertFeedback']._options = None
  _ALERTCENTERSERVICE.methods_by_name['CreateAlertFeedback']._serialized_options = b'\202\323\344\223\002/\"#/v1beta1/alerts/{alert_id}/feedback:\010feedback'
  _ALERTCENTERSERVICE.methods_by_name['ListAlertFeedback']._options = None
  _ALERTCENTERSERVICE.methods_by_name['ListAlertFeedback']._serialized_options = b'\202\323\344\223\002%\022#/v1beta1/alerts/{alert_id}/feedback'
  _ALERTCENTERSERVICE.methods_by_name['GetAlertMetadata']._options = None
  _ALERTCENTERSERVICE.methods_by_name['GetAlertMetadata']._serialized_options = b'\202\323\344\223\002%\022#/v1beta1/alerts/{alert_id}/metadata'
  _ALERTCENTERSERVICE.methods_by_name['GetSettings']._options = None
  _ALERTCENTERSERVICE.methods_by_name['GetSettings']._serialized_options = b'\202\323\344\223\002\023\022\021/v1beta1/settings'
  _ALERTCENTERSERVICE.methods_by_name['UpdateSettings']._options = None
  _ALERTCENTERSERVICE.methods_by_name['UpdateSettings']._serialized_options = b'\202\323\344\223\002\0352\021/v1beta1/settings:\010settings'
  _ALERTCENTERSERVICE.methods_by_name['BatchDeleteAlerts']._options = None
  _ALERTCENTERSERVICE.methods_by_name['BatchDeleteAlerts']._serialized_options = b'\202\323\344\223\002 \"\033/v1beta1/alerts:batchDelete:\001*'
  _ALERTCENTERSERVICE.methods_by_name['BatchUndeleteAlerts']._options = None
  _ALERTCENTERSERVICE.methods_by_name['BatchUndeleteAlerts']._serialized_options = b'\202\323\344\223\002\"\"\035/v1beta1/alerts:batchUndelete:\001*'
  _ALERTFEEDBACKTYPE._serialized_start=3066
  _ALERTFEEDBACKTYPE._serialized_end=3176
  _ALERT._serialized_start=256
  _ALERT._serialized_end=699
  _ALERTFEEDBACK._serialized_start=702
  _ALERTFEEDBACK._serialized_end=907
  _ALERTMETADATA._serialized_start=910
  _ALERTMETADATA._serialized_end=1079
  _SETTINGS._serialized_start=1082
  _SETTINGS._serialized_end=1500
  _SETTINGS_NOTIFICATION._serialized_start=1174
  _SETTINGS_NOTIFICATION._serialized_end=1500
  _SETTINGS_NOTIFICATION_CLOUDPUBSUBTOPIC._serialized_start=1294
  _SETTINGS_NOTIFICATION_CLOUDPUBSUBTOPIC._serialized_end=1426
  _SETTINGS_NOTIFICATION_PAYLOADFORMAT._serialized_start=1428
  _SETTINGS_NOTIFICATION_PAYLOADFORMAT._serialized_end=1485
  _BATCHDELETEALERTSREQUEST._serialized_start=1502
  _BATCHDELETEALERTSREQUEST._serialized_end=1567
  _BATCHDELETEALERTSRESPONSE._serialized_start=1570
  _BATCHDELETEALERTSRESPONSE._serialized_end=1814
  _BATCHDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._serialized_start=1738
  _BATCHDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._serialized_end=1814
  _BATCHUNDELETEALERTSREQUEST._serialized_start=1816
  _BATCHUNDELETEALERTSREQUEST._serialized_end=1883
  _BATCHUNDELETEALERTSRESPONSE._serialized_start=1886
  _BATCHUNDELETEALERTSRESPONSE._serialized_end=2134
  _BATCHUNDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._serialized_start=1738
  _BATCHUNDELETEALERTSRESPONSE_FAILEDALERTSTATUSENTRY._serialized_end=1814
  _LISTALERTSREQUEST._serialized_start=2136
  _LISTALERTSREQUEST._serialized_end=2249
  _LISTALERTSRESPONSE._serialized_start=2251
  _LISTALERTSRESPONSE._serialized_end=2352
  _GETALERTREQUEST._serialized_start=2354
  _GETALERTREQUEST._serialized_end=2410
  _DELETEALERTREQUEST._serialized_start=2412
  _DELETEALERTREQUEST._serialized_end=2471
  _UNDELETEALERTREQUEST._serialized_start=2473
  _UNDELETEALERTREQUEST._serialized_end=2534
  _CREATEALERTFEEDBACKREQUEST._serialized_start=2537
  _CREATEALERTFEEDBACKREQUEST._serialized_end=2670
  _LISTALERTFEEDBACKREQUEST._serialized_start=2672
  _LISTALERTFEEDBACKREQUEST._serialized_end=2753
  _LISTALERTFEEDBACKRESPONSE._serialized_start=2755
  _LISTALERTFEEDBACKRESPONSE._serialized_end=2848
  _GETALERTMETADATAREQUEST._serialized_start=2850
  _GETALERTMETADATAREQUEST._serialized_end=2914
  _GETSETTINGSREQUEST._serialized_start=2916
  _GETSETTINGSREQUEST._serialized_end=2957
  _UPDATESETTINGSREQUEST._serialized_start=2959
  _UPDATESETTINGSREQUEST._serialized_end=3064
  _ALERTCENTERSERVICE._serialized_start=3179
  _ALERTCENTERSERVICE._serialized_end=5059
# @@protoc_insertion_point(module_scope)
