# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/cx/v3/session.proto
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
from google.cloud.dialogflow.cx.v3 import audio_config_pb2 as google_dot_cloud_dot_dialogflow_dot_cx_dot_v3_dot_audio__config__pb2
from google.cloud.dialogflow.cx.v3 import intent_pb2 as google_dot_cloud_dot_dialogflow_dot_cx_dot_v3_dot_intent__pb2
from google.cloud.dialogflow.cx.v3 import page_pb2 as google_dot_cloud_dot_dialogflow_dot_cx_dot_v3_dot_page__pb2
from google.cloud.dialogflow.cx.v3 import response_message_pb2 as google_dot_cloud_dot_dialogflow_dot_cx_dot_v3_dot_response__message__pb2
from google.cloud.dialogflow.cx.v3 import session_entity_type_pb2 as google_dot_cloud_dot_dialogflow_dot_cx_dot_v3_dot_session__entity__type__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/cloud/dialogflow/cx/v3/session.proto\x12\x1dgoogle.cloud.dialogflow.cx.v3\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x30google/cloud/dialogflow/cx/v3/audio_config.proto\x1a*google/cloud/dialogflow/cx/v3/intent.proto\x1a(google/cloud/dialogflow/cx/v3/page.proto\x1a\x34google/cloud/dialogflow/cx/v3/response_message.proto\x1a\x37google/cloud/dialogflow/cx/v3/session_entity_type.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x17google/rpc/status.proto\x1a\x18google/type/latlng.proto\"\xab\x02\n\x13\x44\x65tectIntentRequest\x12:\n\x07session\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!dialogflow.googleapis.com/Session\x12\x44\n\x0cquery_params\x18\x02 \x01(\x0b\x32..google.cloud.dialogflow.cx.v3.QueryParameters\x12\x43\n\x0bquery_input\x18\x03 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.QueryInputB\x03\xe0\x41\x02\x12M\n\x13output_audio_config\x18\x04 \x01(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.OutputAudioConfig\"\x8e\x03\n\x14\x44\x65tectIntentResponse\x12\x13\n\x0bresponse_id\x18\x01 \x01(\t\x12@\n\x0cquery_result\x18\x02 \x01(\x0b\x32*.google.cloud.dialogflow.cx.v3.QueryResult\x12\x14\n\x0coutput_audio\x18\x04 \x01(\x0c\x12M\n\x13output_audio_config\x18\x05 \x01(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.OutputAudioConfig\x12W\n\rresponse_type\x18\x06 \x01(\x0e\x32@.google.cloud.dialogflow.cx.v3.DetectIntentResponse.ResponseType\x12\x1a\n\x12\x61llow_cancellation\x18\x07 \x01(\x08\"E\n\x0cResponseType\x12\x1d\n\x19RESPONSE_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PARTIAL\x10\x01\x12\t\n\x05\x46INAL\x10\x02\"\xd2\x02\n\x1cStreamingDetectIntentRequest\x12\x37\n\x07session\x18\x01 \x01(\tB&\xfa\x41#\n!dialogflow.googleapis.com/Session\x12\x44\n\x0cquery_params\x18\x02 \x01(\x0b\x32..google.cloud.dialogflow.cx.v3.QueryParameters\x12\x43\n\x0bquery_input\x18\x03 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.QueryInputB\x03\xe0\x41\x02\x12M\n\x13output_audio_config\x18\x04 \x01(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.OutputAudioConfig\x12\x1f\n\x17\x65nable_partial_response\x18\x05 \x01(\x08\"\xdb\x01\n\x1dStreamingDetectIntentResponse\x12W\n\x12recognition_result\x18\x01 \x01(\x0b\x32\x39.google.cloud.dialogflow.cx.v3.StreamingRecognitionResultH\x00\x12U\n\x16\x64\x65tect_intent_response\x18\x02 \x01(\x0b\x32\x33.google.cloud.dialogflow.cx.v3.DetectIntentResponseH\x00\x42\n\n\x08response\"\xb6\x03\n\x1aStreamingRecognitionResult\x12[\n\x0cmessage_type\x18\x01 \x01(\x0e\x32\x45.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult.MessageType\x12\x12\n\ntranscript\x18\x02 \x01(\t\x12\x10\n\x08is_final\x18\x03 \x01(\x08\x12\x12\n\nconfidence\x18\x04 \x01(\x02\x12\x11\n\tstability\x18\x06 \x01(\x02\x12G\n\x10speech_word_info\x18\x07 \x03(\x0b\x32-.google.cloud.dialogflow.cx.v3.SpeechWordInfo\x12\x34\n\x11speech_end_offset\x18\x08 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x15\n\rlanguage_code\x18\n \x01(\t\"X\n\x0bMessageType\x12\x1c\n\x18MESSAGE_TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nTRANSCRIPT\x10\x01\x12\x1b\n\x17\x45ND_OF_SINGLE_UTTERANCE\x10\x02\"\xc3\x04\n\x0fQueryParameters\x12\x11\n\ttime_zone\x18\x01 \x01(\t\x12)\n\x0cgeo_location\x18\x02 \x01(\x0b\x32\x13.google.type.LatLng\x12N\n\x14session_entity_types\x18\x03 \x03(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.SessionEntityType\x12(\n\x07payload\x18\x04 \x01(\x0b\x32\x17.google.protobuf.Struct\x12+\n\nparameters\x18\x05 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x39\n\x0c\x63urrent_page\x18\x06 \x01(\tB#\xfa\x41 \n\x1e\x64ialogflow.googleapis.com/Page\x12\x17\n\x0f\x64isable_webhook\x18\x07 \x01(\x08\x12$\n\x1c\x61nalyze_query_text_sentiment\x18\x08 \x01(\x08\x12[\n\x0fwebhook_headers\x18\n \x03(\x0b\x32\x42.google.cloud.dialogflow.cx.v3.QueryParameters.WebhookHeadersEntry\x12=\n\rflow_versions\x18\x0e \x03(\tB&\xfa\x41#\n!dialogflow.googleapis.com/Version\x1a\x35\n\x13WebhookHeadersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xdb\x02\n\nQueryInput\x12\x38\n\x04text\x18\x02 \x01(\x0b\x32(.google.cloud.dialogflow.cx.v3.TextInputH\x00\x12<\n\x06intent\x18\x03 \x01(\x0b\x32*.google.cloud.dialogflow.cx.v3.IntentInputH\x00\x12:\n\x05\x61udio\x18\x05 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.AudioInputH\x00\x12:\n\x05\x65vent\x18\x06 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.EventInputH\x00\x12\x38\n\x04\x64tmf\x18\x07 \x01(\x0b\x32(.google.cloud.dialogflow.cx.v3.DtmfInputH\x00\x12\x1a\n\rlanguage_code\x18\x04 \x01(\tB\x03\xe0\x41\x02\x42\x07\n\x05input\"\xa1\x06\n\x0bQueryResult\x12\x0e\n\x04text\x18\x01 \x01(\tH\x00\x12?\n\x0etrigger_intent\x18\x0b \x01(\tB%\xfa\x41\"\n dialogflow.googleapis.com/IntentH\x00\x12\x14\n\ntranscript\x18\x0c \x01(\tH\x00\x12\x17\n\rtrigger_event\x18\x0e \x01(\tH\x00\x12\x38\n\x04\x64tmf\x18\x17 \x01(\x0b\x32(.google.cloud.dialogflow.cx.v3.DtmfInputH\x00\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\x12+\n\nparameters\x18\x03 \x01(\x0b\x32\x17.google.protobuf.Struct\x12I\n\x11response_messages\x18\x04 \x03(\x0b\x32..google.cloud.dialogflow.cx.v3.ResponseMessage\x12,\n\x10webhook_statuses\x18\r \x03(\x0b\x32\x12.google.rpc.Status\x12\x31\n\x10webhook_payloads\x18\x06 \x03(\x0b\x32\x17.google.protobuf.Struct\x12\x39\n\x0c\x63urrent_page\x18\x07 \x01(\x0b\x32#.google.cloud.dialogflow.cx.v3.Page\x12\x39\n\x06intent\x18\x08 \x01(\x0b\x32%.google.cloud.dialogflow.cx.v3.IntentB\x02\x18\x01\x12\'\n\x1bintent_detection_confidence\x18\t \x01(\x02\x42\x02\x18\x01\x12\x33\n\x05match\x18\x0f \x01(\x0b\x32$.google.cloud.dialogflow.cx.v3.Match\x12\x30\n\x0f\x64iagnostic_info\x18\n \x01(\x0b\x32\x17.google.protobuf.Struct\x12Y\n\x19sentiment_analysis_result\x18\x11 \x01(\x0b\x32\x36.google.cloud.dialogflow.cx.v3.SentimentAnalysisResultB\x07\n\x05query\"\x1e\n\tTextInput\x12\x11\n\x04text\x18\x01 \x01(\tB\x03\xe0\x41\x02\"G\n\x0bIntentInput\x12\x38\n\x06intent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n dialogflow.googleapis.com/Intent\"a\n\nAudioInput\x12\x44\n\x06\x63onfig\x18\x01 \x01(\x0b\x32/.google.cloud.dialogflow.cx.v3.InputAudioConfigB\x03\xe0\x41\x02\x12\r\n\x05\x61udio\x18\x02 \x01(\x0c\"\x1b\n\nEventInput\x12\r\n\x05\x65vent\x18\x01 \x01(\t\"1\n\tDtmfInput\x12\x0e\n\x06\x64igits\x18\x01 \x01(\t\x12\x14\n\x0c\x66inish_digit\x18\x02 \x01(\t\"\xf1\x02\n\x05Match\x12\x35\n\x06intent\x18\x01 \x01(\x0b\x32%.google.cloud.dialogflow.cx.v3.Intent\x12\r\n\x05\x65vent\x18\x06 \x01(\t\x12+\n\nparameters\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x16\n\x0eresolved_input\x18\x03 \x01(\t\x12\x42\n\nmatch_type\x18\x04 \x01(\x0e\x32..google.cloud.dialogflow.cx.v3.Match.MatchType\x12\x12\n\nconfidence\x18\x05 \x01(\x02\"\x84\x01\n\tMatchType\x12\x1a\n\x16MATCH_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06INTENT\x10\x01\x12\x11\n\rDIRECT_INTENT\x10\x02\x12\x15\n\x11PARAMETER_FILLING\x10\x03\x12\x0c\n\x08NO_MATCH\x10\x04\x12\x0c\n\x08NO_INPUT\x10\x05\x12\t\n\x05\x45VENT\x10\x06\"\xdb\x01\n\x12MatchIntentRequest\x12:\n\x07session\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!dialogflow.googleapis.com/Session\x12\x44\n\x0cquery_params\x18\x02 \x01(\x0b\x32..google.cloud.dialogflow.cx.v3.QueryParameters\x12\x43\n\x0bquery_input\x18\x03 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.QueryInputB\x03\xe0\x41\x02\"\x90\x02\n\x13MatchIntentResponse\x12\x0e\n\x04text\x18\x01 \x01(\tH\x00\x12?\n\x0etrigger_intent\x18\x02 \x01(\tB%\xfa\x41\"\n dialogflow.googleapis.com/IntentH\x00\x12\x14\n\ntranscript\x18\x03 \x01(\tH\x00\x12\x17\n\rtrigger_event\x18\x06 \x01(\tH\x00\x12\x35\n\x07matches\x18\x04 \x03(\x0b\x32$.google.cloud.dialogflow.cx.v3.Match\x12\x39\n\x0c\x63urrent_page\x18\x05 \x01(\x0b\x32#.google.cloud.dialogflow.cx.v3.PageB\x07\n\x05query\"\xeb\x01\n\x14\x46ulfillIntentRequest\x12O\n\x14match_intent_request\x18\x01 \x01(\x0b\x32\x31.google.cloud.dialogflow.cx.v3.MatchIntentRequest\x12\x33\n\x05match\x18\x02 \x01(\x0b\x32$.google.cloud.dialogflow.cx.v3.Match\x12M\n\x13output_audio_config\x18\x03 \x01(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.OutputAudioConfig\"\xd3\x01\n\x15\x46ulfillIntentResponse\x12\x13\n\x0bresponse_id\x18\x01 \x01(\t\x12@\n\x0cquery_result\x18\x02 \x01(\x0b\x32*.google.cloud.dialogflow.cx.v3.QueryResult\x12\x14\n\x0coutput_audio\x18\x03 \x01(\x0c\x12M\n\x13output_audio_config\x18\x04 \x01(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.OutputAudioConfig\";\n\x17SentimentAnalysisResult\x12\r\n\x05score\x18\x01 \x01(\x02\x12\x11\n\tmagnitude\x18\x02 \x01(\x02\x32\xc4\t\n\x08Sessions\x12\xa6\x02\n\x0c\x44\x65tectIntent\x12\x32.google.cloud.dialogflow.cx.v3.DetectIntentRequest\x1a\x33.google.cloud.dialogflow.cx.v3.DetectIntentResponse\"\xac\x01\x82\xd3\xe4\x93\x02\xa5\x01\"E/v3/{session=projects/*/locations/*/agents/*/sessions/*}:detectIntent:\x01*ZY\"T/v3/{session=projects/*/locations/*/agents/*/environments/*/sessions/*}:detectIntent:\x01*\x12\x98\x01\n\x15StreamingDetectIntent\x12;.google.cloud.dialogflow.cx.v3.StreamingDetectIntentRequest\x1a<.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse\"\x00(\x01\x30\x01\x12\xa1\x02\n\x0bMatchIntent\x12\x31.google.cloud.dialogflow.cx.v3.MatchIntentRequest\x1a\x32.google.cloud.dialogflow.cx.v3.MatchIntentResponse\"\xaa\x01\x82\xd3\xe4\x93\x02\xa3\x01\"D/v3/{session=projects/*/locations/*/agents/*/sessions/*}:matchIntent:\x01*ZX\"S/v3/{session=projects/*/locations/*/agents/*/environments/*/sessions/*}:matchIntent:\x01*\x12\xd5\x02\n\rFulfillIntent\x12\x33.google.cloud.dialogflow.cx.v3.FulfillIntentRequest\x1a\x34.google.cloud.dialogflow.cx.v3.FulfillIntentResponse\"\xd8\x01\x82\xd3\xe4\x93\x02\xd1\x01\"[/v3/{match_intent_request.session=projects/*/locations/*/agents/*/sessions/*}:fulfillIntent:\x01*Zo\"j/v3/{match_intent_request.session=projects/*/locations/*/agents/*/environments/*/sessions/*}:fulfillIntent:\x01*\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\x98\x03\n!com.google.cloud.dialogflow.cx.v3B\x0cSessionProtoP\x01Z?google.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3;cx\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1dGoogle.Cloud.Dialogflow.Cx.V3\xea\x02!Google::Cloud::Dialogflow::CX::V3\xea\x41\xd4\x01\n!dialogflow.googleapis.com/Session\x12Iprojects/{project}/locations/{location}/agents/{agent}/sessions/{session}\x12\x64projects/{project}/locations/{location}/agents/{agent}/environments/{environment}/sessions/{session}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.cx.v3.session_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.dialogflow.cx.v3B\014SessionProtoP\001Z?google.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.Cx.V3\352\002!Google::Cloud::Dialogflow::CX::V3\352A\324\001\n!dialogflow.googleapis.com/Session\022Iprojects/{project}/locations/{location}/agents/{agent}/sessions/{session}\022dprojects/{project}/locations/{location}/agents/{agent}/environments/{environment}/sessions/{session}'
  _DETECTINTENTREQUEST.fields_by_name['session']._options = None
  _DETECTINTENTREQUEST.fields_by_name['session']._serialized_options = b'\340A\002\372A#\n!dialogflow.googleapis.com/Session'
  _DETECTINTENTREQUEST.fields_by_name['query_input']._options = None
  _DETECTINTENTREQUEST.fields_by_name['query_input']._serialized_options = b'\340A\002'
  _STREAMINGDETECTINTENTREQUEST.fields_by_name['session']._options = None
  _STREAMINGDETECTINTENTREQUEST.fields_by_name['session']._serialized_options = b'\372A#\n!dialogflow.googleapis.com/Session'
  _STREAMINGDETECTINTENTREQUEST.fields_by_name['query_input']._options = None
  _STREAMINGDETECTINTENTREQUEST.fields_by_name['query_input']._serialized_options = b'\340A\002'
  _QUERYPARAMETERS_WEBHOOKHEADERSENTRY._options = None
  _QUERYPARAMETERS_WEBHOOKHEADERSENTRY._serialized_options = b'8\001'
  _QUERYPARAMETERS.fields_by_name['current_page']._options = None
  _QUERYPARAMETERS.fields_by_name['current_page']._serialized_options = b'\372A \n\036dialogflow.googleapis.com/Page'
  _QUERYPARAMETERS.fields_by_name['flow_versions']._options = None
  _QUERYPARAMETERS.fields_by_name['flow_versions']._serialized_options = b'\372A#\n!dialogflow.googleapis.com/Version'
  _QUERYINPUT.fields_by_name['language_code']._options = None
  _QUERYINPUT.fields_by_name['language_code']._serialized_options = b'\340A\002'
  _QUERYRESULT.fields_by_name['trigger_intent']._options = None
  _QUERYRESULT.fields_by_name['trigger_intent']._serialized_options = b'\372A\"\n dialogflow.googleapis.com/Intent'
  _QUERYRESULT.fields_by_name['intent']._options = None
  _QUERYRESULT.fields_by_name['intent']._serialized_options = b'\030\001'
  _QUERYRESULT.fields_by_name['intent_detection_confidence']._options = None
  _QUERYRESULT.fields_by_name['intent_detection_confidence']._serialized_options = b'\030\001'
  _TEXTINPUT.fields_by_name['text']._options = None
  _TEXTINPUT.fields_by_name['text']._serialized_options = b'\340A\002'
  _INTENTINPUT.fields_by_name['intent']._options = None
  _INTENTINPUT.fields_by_name['intent']._serialized_options = b'\340A\002\372A\"\n dialogflow.googleapis.com/Intent'
  _AUDIOINPUT.fields_by_name['config']._options = None
  _AUDIOINPUT.fields_by_name['config']._serialized_options = b'\340A\002'
  _MATCHINTENTREQUEST.fields_by_name['session']._options = None
  _MATCHINTENTREQUEST.fields_by_name['session']._serialized_options = b'\340A\002\372A#\n!dialogflow.googleapis.com/Session'
  _MATCHINTENTREQUEST.fields_by_name['query_input']._options = None
  _MATCHINTENTREQUEST.fields_by_name['query_input']._serialized_options = b'\340A\002'
  _MATCHINTENTRESPONSE.fields_by_name['trigger_intent']._options = None
  _MATCHINTENTRESPONSE.fields_by_name['trigger_intent']._serialized_options = b'\372A\"\n dialogflow.googleapis.com/Intent'
  _SESSIONS._options = None
  _SESSIONS._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _SESSIONS.methods_by_name['DetectIntent']._options = None
  _SESSIONS.methods_by_name['DetectIntent']._serialized_options = b'\202\323\344\223\002\245\001\"E/v3/{session=projects/*/locations/*/agents/*/sessions/*}:detectIntent:\001*ZY\"T/v3/{session=projects/*/locations/*/agents/*/environments/*/sessions/*}:detectIntent:\001*'
  _SESSIONS.methods_by_name['MatchIntent']._options = None
  _SESSIONS.methods_by_name['MatchIntent']._serialized_options = b'\202\323\344\223\002\243\001\"D/v3/{session=projects/*/locations/*/agents/*/sessions/*}:matchIntent:\001*ZX\"S/v3/{session=projects/*/locations/*/agents/*/environments/*/sessions/*}:matchIntent:\001*'
  _SESSIONS.methods_by_name['FulfillIntent']._options = None
  _SESSIONS.methods_by_name['FulfillIntent']._serialized_options = b'\202\323\344\223\002\321\001\"[/v3/{match_intent_request.session=projects/*/locations/*/agents/*/sessions/*}:fulfillIntent:\001*Zo\"j/v3/{match_intent_request.session=projects/*/locations/*/agents/*/environments/*/sessions/*}:fulfillIntent:\001*'
  _DETECTINTENTREQUEST._serialized_start=554
  _DETECTINTENTREQUEST._serialized_end=853
  _DETECTINTENTRESPONSE._serialized_start=856
  _DETECTINTENTRESPONSE._serialized_end=1254
  _DETECTINTENTRESPONSE_RESPONSETYPE._serialized_start=1185
  _DETECTINTENTRESPONSE_RESPONSETYPE._serialized_end=1254
  _STREAMINGDETECTINTENTREQUEST._serialized_start=1257
  _STREAMINGDETECTINTENTREQUEST._serialized_end=1595
  _STREAMINGDETECTINTENTRESPONSE._serialized_start=1598
  _STREAMINGDETECTINTENTRESPONSE._serialized_end=1817
  _STREAMINGRECOGNITIONRESULT._serialized_start=1820
  _STREAMINGRECOGNITIONRESULT._serialized_end=2258
  _STREAMINGRECOGNITIONRESULT_MESSAGETYPE._serialized_start=2170
  _STREAMINGRECOGNITIONRESULT_MESSAGETYPE._serialized_end=2258
  _QUERYPARAMETERS._serialized_start=2261
  _QUERYPARAMETERS._serialized_end=2840
  _QUERYPARAMETERS_WEBHOOKHEADERSENTRY._serialized_start=2787
  _QUERYPARAMETERS_WEBHOOKHEADERSENTRY._serialized_end=2840
  _QUERYINPUT._serialized_start=2843
  _QUERYINPUT._serialized_end=3190
  _QUERYRESULT._serialized_start=3193
  _QUERYRESULT._serialized_end=3994
  _TEXTINPUT._serialized_start=3996
  _TEXTINPUT._serialized_end=4026
  _INTENTINPUT._serialized_start=4028
  _INTENTINPUT._serialized_end=4099
  _AUDIOINPUT._serialized_start=4101
  _AUDIOINPUT._serialized_end=4198
  _EVENTINPUT._serialized_start=4200
  _EVENTINPUT._serialized_end=4227
  _DTMFINPUT._serialized_start=4229
  _DTMFINPUT._serialized_end=4278
  _MATCH._serialized_start=4281
  _MATCH._serialized_end=4650
  _MATCH_MATCHTYPE._serialized_start=4518
  _MATCH_MATCHTYPE._serialized_end=4650
  _MATCHINTENTREQUEST._serialized_start=4653
  _MATCHINTENTREQUEST._serialized_end=4872
  _MATCHINTENTRESPONSE._serialized_start=4875
  _MATCHINTENTRESPONSE._serialized_end=5147
  _FULFILLINTENTREQUEST._serialized_start=5150
  _FULFILLINTENTREQUEST._serialized_end=5385
  _FULFILLINTENTRESPONSE._serialized_start=5388
  _FULFILLINTENTRESPONSE._serialized_end=5599
  _SENTIMENTANALYSISRESULT._serialized_start=5601
  _SENTIMENTANALYSISRESULT._serialized_end=5660
  _SESSIONS._serialized_start=5663
  _SESSIONS._serialized_end=6883
# @@protoc_insertion_point(module_scope)