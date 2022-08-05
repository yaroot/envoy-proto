# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/participant.proto
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
from google.cloud.dialogflow.v2beta1 import audio_config_pb2 as google_dot_cloud_dot_dialogflow_dot_v2beta1_dot_audio__config__pb2
from google.cloud.dialogflow.v2beta1 import session_pb2 as google_dot_cloud_dot_dialogflow_dot_v2beta1_dot_session__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/dialogflow/v2beta1/participant.proto\x12\x1fgoogle.cloud.dialogflow.v2beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x32google/cloud/dialogflow/v2beta1/audio_config.proto\x1a-google/cloud/dialogflow/v2beta1/session.proto\x1a google/protobuf/field_mask.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xf3\x04\n\x0bParticipant\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x44\n\x04role\x18\x02 \x01(\x0e\x32\x31.google.cloud.dialogflow.v2beta1.Participant.RoleB\x03\xe0\x41\x05\x12(\n\x1bobfuscated_external_user_id\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12s\n\x1a\x64ocuments_metadata_filters\x18\x08 \x03(\x0b\x32J.google.cloud.dialogflow.v2beta1.Participant.DocumentsMetadataFiltersEntryB\x03\xe0\x41\x01\x1a?\n\x1d\x44ocumentsMetadataFiltersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"P\n\x04Role\x12\x14\n\x10ROLE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bHUMAN_AGENT\x10\x01\x12\x13\n\x0f\x41UTOMATED_AGENT\x10\x02\x12\x0c\n\x08\x45ND_USER\x10\x03:\xd8\x01\xea\x41\xd4\x01\n%dialogflow.googleapis.com/Participant\x12Jprojects/{project}/conversations/{conversation}/participants/{participant}\x12_projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}\"\x9b\x05\n\x07Message\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x14\n\x07\x63ontent\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x18\n\x0bparticipant\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12P\n\x10participant_role\x18\x05 \x01(\x0e\x32\x31.google.cloud.dialogflow.v2beta1.Participant.RoleB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x32\n\tsend_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12S\n\x12message_annotation\x18\x07 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.MessageAnnotationB\x03\xe0\x41\x03\x12Y\n\x12sentiment_analysis\x18\x08 \x01(\x0b\x32\x38.google.cloud.dialogflow.v2beta1.SentimentAnalysisResultB\x03\xe0\x41\x03:\xc4\x01\xea\x41\xc0\x01\n!dialogflow.googleapis.com/Message\x12\x42projects/{project}/conversations/{conversation}/messages/{message}\x12Wprojects/{project}/locations/{location}/conversations/{conversation}/messages/{message}\"\xa1\x01\n\x18\x43reateParticipantRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\x12%dialogflow.googleapis.com/Participant\x12\x46\n\x0bparticipant\x18\x02 \x01(\x0b\x32,.google.cloud.dialogflow.v2beta1.ParticipantB\x03\xe0\x41\x02\"T\n\x15GetParticipantRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Participant\"\x89\x01\n\x17ListParticipantsRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\x12%dialogflow.googleapis.com/Participant\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"w\n\x18ListParticipantsResponse\x12\x42\n\x0cparticipants\x18\x01 \x03(\x0b\x32,.google.cloud.dialogflow.v2beta1.Participant\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x98\x01\n\x18UpdateParticipantRequest\x12\x46\n\x0bparticipant\x18\x01 \x01(\x0b\x32,.google.cloud.dialogflow.v2beta1.ParticipantB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"^\n\nAudioInput\x12\x41\n\x06\x63onfig\x18\x01 \x01(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.InputAudioConfig\x12\r\n\x05\x61udio\x18\x02 \x01(\x0c\"`\n\x0bOutputAudio\x12\x42\n\x06\x63onfig\x18\x01 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.OutputAudioConfig\x12\r\n\x05\x61udio\x18\x02 \x01(\x0c\"\x8a\x05\n\x13\x41utomatedAgentReply\x12W\n\x16\x64\x65tect_intent_response\x18\x01 \x01(\x0b\x32\x35.google.cloud.dialogflow.v2beta1.DetectIntentResponseH\x00\x12K\n\x11response_messages\x18\x03 \x03(\x0b\x32\x30.google.cloud.dialogflow.v2beta1.ResponseMessage\x12\x37\n\x06intent\x18\x04 \x01(\tB%\xfa\x41\"\n dialogflow.googleapis.com/IntentH\x01\x12\x0f\n\x05\x65vent\x18\x05 \x01(\tH\x01\x12\x18\n\x10match_confidence\x18\t \x01(\x02\x12+\n\nparameters\x18\n \x01(\x0b\x32\x17.google.protobuf.Struct\x12:\n\x15\x63x_session_parameters\x18\x06 \x01(\x0b\x32\x17.google.protobuf.StructB\x02\x18\x01\x12p\n\x1a\x61utomated_agent_reply_type\x18\x07 \x01(\x0e\x32L.google.cloud.dialogflow.v2beta1.AutomatedAgentReply.AutomatedAgentReplyType\x12\x1a\n\x12\x61llow_cancellation\x18\x08 \x01(\x08\"]\n\x17\x41utomatedAgentReplyType\x12*\n&AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PARTIAL\x10\x01\x12\t\n\x05\x46INAL\x10\x02\x42\n\n\x08responseB\x07\n\x05match\"\xaa\x01\n\x11SuggestionFeature\x12\x45\n\x04type\x18\x01 \x01(\x0e\x32\x37.google.cloud.dialogflow.v2beta1.SuggestionFeature.Type\"N\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x16\n\x12\x41RTICLE_SUGGESTION\x10\x01\x12\x07\n\x03\x46\x41Q\x10\x02\x12\x0f\n\x0bSMART_REPLY\x10\x03\"\xd2\x01\n\x15\x41ssistQueryParameters\x12x\n\x1a\x64ocuments_metadata_filters\x18\x01 \x03(\x0b\x32T.google.cloud.dialogflow.v2beta1.AssistQueryParameters.DocumentsMetadataFiltersEntry\x1a?\n\x1d\x44ocumentsMetadataFiltersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xaf\x05\n\x15\x41nalyzeContentRequest\x12\x42\n\x0bparticipant\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Participant\x12@\n\ntext_input\x18\x06 \x01(\x0b\x32*.google.cloud.dialogflow.v2beta1.TextInputH\x00\x12\x42\n\x0b\x61udio_input\x18\x07 \x01(\x0b\x32+.google.cloud.dialogflow.v2beta1.AudioInputH\x00\x12\x42\n\x0b\x65vent_input\x18\x08 \x01(\x0b\x32+.google.cloud.dialogflow.v2beta1.EventInputH\x00\x12N\n\x12reply_audio_config\x18\x05 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.OutputAudioConfig\x12\x46\n\x0cquery_params\x18\t \x01(\x0b\x32\x30.google.cloud.dialogflow.v2beta1.QueryParameters\x12S\n\x13\x61ssist_query_params\x18\x0e \x01(\x0b\x32\x36.google.cloud.dialogflow.v2beta1.AssistQueryParameters\x12.\n\rcx_parameters\x18\x12 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x17\n\x0f\x63x_current_page\x18\x14 \x01(\t\x12\x35\n\x11message_send_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x12\n\nrequest_id\x18\x0b \x01(\tB\x07\n\x05input\",\n\x0e\x44tmfParameters\x12\x1a\n\x12\x61\x63\x63\x65pts_dtmf_input\x18\x01 \x01(\x08\"\xfc\x03\n\x16\x41nalyzeContentResponse\x12\x12\n\nreply_text\x18\x01 \x01(\t\x12\x41\n\x0breply_audio\x18\x02 \x01(\x0b\x32,.google.cloud.dialogflow.v2beta1.OutputAudio\x12S\n\x15\x61utomated_agent_reply\x18\x03 \x01(\x0b\x32\x34.google.cloud.dialogflow.v2beta1.AutomatedAgentReply\x12\x39\n\x07message\x18\x05 \x01(\x0b\x32(.google.cloud.dialogflow.v2beta1.Message\x12Y\n\x1ehuman_agent_suggestion_results\x18\x06 \x03(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.SuggestionResult\x12V\n\x1b\x65nd_user_suggestion_results\x18\x07 \x03(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.SuggestionResult\x12H\n\x0f\x64tmf_parameters\x18\t \x01(\x0b\x32/.google.cloud.dialogflow.v2beta1.DtmfParameters\"(\n\x0fInputTextConfig\x12\x15\n\rlanguage_code\x18\x01 \x01(\t\"\xe8\x05\n\x1eStreamingAnalyzeContentRequest\x12\x42\n\x0bparticipant\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Participant\x12I\n\x0c\x61udio_config\x18\x02 \x01(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.InputAudioConfigH\x00\x12G\n\x0btext_config\x18\x03 \x01(\x0b\x32\x30.google.cloud.dialogflow.v2beta1.InputTextConfigH\x00\x12N\n\x12reply_audio_config\x18\x04 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.OutputAudioConfig\x12\x15\n\x0binput_audio\x18\x05 \x01(\x0cH\x01\x12\x14\n\ninput_text\x18\x06 \x01(\tH\x01\x12J\n\ninput_dtmf\x18\t \x01(\x0b\x32\x34.google.cloud.dialogflow.v2beta1.TelephonyDtmfEventsH\x01\x12\x46\n\x0cquery_params\x18\x07 \x01(\x0b\x32\x30.google.cloud.dialogflow.v2beta1.QueryParameters\x12S\n\x13\x61ssist_query_params\x18\x08 \x01(\x0b\x32\x36.google.cloud.dialogflow.v2beta1.AssistQueryParameters\x12.\n\rcx_parameters\x18\r \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x17\n\x0f\x63x_current_page\x18\x0f \x01(\t\x12,\n$enable_partial_automated_agent_reply\x18\x0c \x01(\x08\x42\x08\n\x06\x63onfigB\x07\n\x05input\"\xde\x04\n\x1fStreamingAnalyzeContentResponse\x12W\n\x12recognition_result\x18\x01 \x01(\x0b\x32;.google.cloud.dialogflow.v2beta1.StreamingRecognitionResult\x12\x12\n\nreply_text\x18\x02 \x01(\t\x12\x41\n\x0breply_audio\x18\x03 \x01(\x0b\x32,.google.cloud.dialogflow.v2beta1.OutputAudio\x12S\n\x15\x61utomated_agent_reply\x18\x04 \x01(\x0b\x32\x34.google.cloud.dialogflow.v2beta1.AutomatedAgentReply\x12\x39\n\x07message\x18\x06 \x01(\x0b\x32(.google.cloud.dialogflow.v2beta1.Message\x12Y\n\x1ehuman_agent_suggestion_results\x18\x07 \x03(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.SuggestionResult\x12V\n\x1b\x65nd_user_suggestion_results\x18\x08 \x03(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.SuggestionResult\x12H\n\x0f\x64tmf_parameters\x18\n \x01(\x0b\x32/.google.cloud.dialogflow.v2beta1.DtmfParameters\"j\n\x14\x41nnotatedMessagePart\x12\x0c\n\x04text\x18\x01 \x01(\t\x12\x13\n\x0b\x65ntity_type\x18\x02 \x01(\t\x12/\n\x0f\x66ormatted_value\x18\x03 \x01(\x0b\x32\x16.google.protobuf.Value\"s\n\x11MessageAnnotation\x12\x44\n\x05parts\x18\x01 \x03(\x0b\x32\x35.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart\x12\x18\n\x10\x63ontain_entities\x18\x02 \x01(\x08\"\xd5\x01\n\rArticleAnswer\x12\r\n\x05title\x18\x01 \x01(\t\x12\x0b\n\x03uri\x18\x02 \x01(\t\x12\x10\n\x08snippets\x18\x03 \x03(\t\x12N\n\x08metadata\x18\x05 \x03(\x0b\x32<.google.cloud.dialogflow.v2beta1.ArticleAnswer.MetadataEntry\x12\x15\n\ranswer_record\x18\x06 \x01(\t\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xe5\x01\n\tFaqAnswer\x12\x0e\n\x06\x61nswer\x18\x01 \x01(\t\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x12\x10\n\x08question\x18\x03 \x01(\t\x12\x0e\n\x06source\x18\x04 \x01(\t\x12J\n\x08metadata\x18\x05 \x03(\x0b\x32\x38.google.cloud.dialogflow.v2beta1.FaqAnswer.MetadataEntry\x12\x15\n\ranswer_record\x18\x06 \x01(\t\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"y\n\x10SmartReplyAnswer\x12\r\n\x05reply\x18\x01 \x01(\t\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x12\x42\n\ranswer_record\x18\x03 \x01(\tB+\xfa\x41(\n&dialogflow.googleapis.com/AnswerRecord\"\xf9\x02\n\x10SuggestionResult\x12#\n\x05\x65rror\x18\x01 \x01(\x0b\x32\x12.google.rpc.StatusH\x00\x12]\n\x19suggest_articles_response\x18\x02 \x01(\x0b\x32\x38.google.cloud.dialogflow.v2beta1.SuggestArticlesResponseH\x00\x12\x62\n\x1csuggest_faq_answers_response\x18\x03 \x01(\x0b\x32:.google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponseH\x00\x12\x66\n\x1esuggest_smart_replies_response\x18\x04 \x01(\x0b\x32<.google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponseH\x00\x42\x15\n\x13suggestion_response\"\x8f\x02\n\x16SuggestArticlesRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Participant\x12\x41\n\x0elatest_message\x18\x02 \x01(\tB)\xe0\x41\x01\xfa\x41#\n!dialogflow.googleapis.com/Message\x12\x19\n\x0c\x63ontext_size\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x12X\n\x13\x61ssist_query_params\x18\x04 \x01(\x0b\x32\x36.google.cloud.dialogflow.v2beta1.AssistQueryParametersB\x03\xe0\x41\x01\"\x90\x01\n\x17SuggestArticlesResponse\x12G\n\x0f\x61rticle_answers\x18\x01 \x03(\x0b\x32..google.cloud.dialogflow.v2beta1.ArticleAnswer\x12\x16\n\x0elatest_message\x18\x02 \x01(\t\x12\x14\n\x0c\x63ontext_size\x18\x03 \x01(\x05\"\x91\x02\n\x18SuggestFaqAnswersRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Participant\x12\x41\n\x0elatest_message\x18\x02 \x01(\tB)\xe0\x41\x01\xfa\x41#\n!dialogflow.googleapis.com/Message\x12\x19\n\x0c\x63ontext_size\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x12X\n\x13\x61ssist_query_params\x18\x04 \x01(\x0b\x32\x36.google.cloud.dialogflow.v2beta1.AssistQueryParametersB\x03\xe0\x41\x01\"\x8a\x01\n\x19SuggestFaqAnswersResponse\x12?\n\x0b\x66\x61q_answers\x18\x01 \x03(\x0b\x32*.google.cloud.dialogflow.v2beta1.FaqAnswer\x12\x16\n\x0elatest_message\x18\x02 \x01(\t\x12\x14\n\x0c\x63ontext_size\x18\x03 \x01(\x05\"\xf9\x01\n\x1aSuggestSmartRepliesRequest\x12=\n\x06parent\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%dialogflow.googleapis.com/Participant\x12\x46\n\x12\x63urrent_text_input\x18\x04 \x01(\x0b\x32*.google.cloud.dialogflow.v2beta1.TextInput\x12>\n\x0elatest_message\x18\x02 \x01(\tB&\xfa\x41#\n!dialogflow.googleapis.com/Message\x12\x14\n\x0c\x63ontext_size\x18\x03 \x01(\x05\"\xc3\x01\n\x1bSuggestSmartRepliesResponse\x12N\n\x13smart_reply_answers\x18\x01 \x03(\x0b\x32\x31.google.cloud.dialogflow.v2beta1.SmartReplyAnswer\x12>\n\x0elatest_message\x18\x02 \x01(\tB&\xfa\x41#\n!dialogflow.googleapis.com/Message\x12\x14\n\x0c\x63ontext_size\x18\x03 \x01(\x05\"\xc4\x05\n\nSuggestion\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x45\n\x08\x61rticles\x18\x02 \x03(\x0b\x32\x33.google.cloud.dialogflow.v2beta1.Suggestion.Article\x12J\n\x0b\x66\x61q_answers\x18\x04 \x03(\x0b\x32\x35.google.cloud.dialogflow.v2beta1.Suggestion.FaqAnswer\x12/\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x16\n\x0elatest_message\x18\x07 \x01(\t\x1a\xd4\x01\n\x07\x41rticle\x12\r\n\x05title\x18\x01 \x01(\t\x12\x0b\n\x03uri\x18\x02 \x01(\t\x12\x10\n\x08snippets\x18\x03 \x03(\t\x12S\n\x08metadata\x18\x05 \x03(\x0b\x32\x41.google.cloud.dialogflow.v2beta1.Suggestion.Article.MetadataEntry\x12\x15\n\ranswer_record\x18\x06 \x01(\t\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\xf0\x01\n\tFaqAnswer\x12\x0e\n\x06\x61nswer\x18\x01 \x01(\t\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x12\x10\n\x08question\x18\x03 \x01(\t\x12\x0e\n\x06source\x18\x04 \x01(\t\x12U\n\x08metadata\x18\x05 \x03(\x0b\x32\x43.google.cloud.dialogflow.v2beta1.Suggestion.FaqAnswer.MetadataEntry\x12\x15\n\ranswer_record\x18\x06 \x01(\t\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x02\x18\x01\"c\n\x16ListSuggestionsRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t:\x02\x18\x01\"x\n\x17ListSuggestionsResponse\x12@\n\x0bsuggestions\x18\x01 \x03(\x0b\x32+.google.cloud.dialogflow.v2beta1.Suggestion\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t:\x02\x18\x01\"\\\n\x18\x43ompileSuggestionRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x16\n\x0elatest_message\x18\x02 \x01(\t\x12\x14\n\x0c\x63ontext_size\x18\x03 \x01(\x05:\x02\x18\x01\"\x8e\x01\n\x19\x43ompileSuggestionResponse\x12?\n\nsuggestion\x18\x01 \x01(\x0b\x32+.google.cloud.dialogflow.v2beta1.Suggestion\x12\x16\n\x0elatest_message\x18\x02 \x01(\t\x12\x14\n\x0c\x63ontext_size\x18\x03 \x01(\x05:\x02\x18\x01\"\x83\x07\n\x0fResponseMessage\x12\x45\n\x04text\x18\x01 \x01(\x0b\x32\x35.google.cloud.dialogflow.v2beta1.ResponseMessage.TextH\x00\x12*\n\x07payload\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructH\x00\x12_\n\x12live_agent_handoff\x18\x03 \x01(\x0b\x32\x41.google.cloud.dialogflow.v2beta1.ResponseMessage.LiveAgentHandoffH\x00\x12Z\n\x0f\x65nd_interaction\x18\x04 \x01(\x0b\x32?.google.cloud.dialogflow.v2beta1.ResponseMessage.EndInteractionH\x00\x12R\n\x0bmixed_audio\x18\x05 \x01(\x0b\x32;.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudioH\x00\x12i\n\x17telephony_transfer_call\x18\x06 \x01(\x0b\x32\x46.google.cloud.dialogflow.v2beta1.ResponseMessage.TelephonyTransferCallH\x00\x1a\x14\n\x04Text\x12\x0c\n\x04text\x18\x01 \x03(\t\x1a=\n\x10LiveAgentHandoff\x12)\n\x08metadata\x18\x01 \x01(\x0b\x32\x17.google.protobuf.Struct\x1a\x10\n\x0e\x45ndInteraction\x1a\xbe\x01\n\nMixedAudio\x12U\n\x08segments\x18\x01 \x03(\x0b\x32\x43.google.cloud.dialogflow.v2beta1.ResponseMessage.MixedAudio.Segment\x1aY\n\x07Segment\x12\x0f\n\x05\x61udio\x18\x01 \x01(\x0cH\x00\x12\r\n\x03uri\x18\x02 \x01(\tH\x00\x12#\n\x1b\x61llow_playback_interruption\x18\x03 \x01(\x08\x42\t\n\x07\x63ontent\x1aN\n\x15TelephonyTransferCall\x12\x16\n\x0cphone_number\x18\x01 \x01(\tH\x00\x12\x11\n\x07sip_uri\x18\x02 \x01(\tH\x00\x42\n\n\x08\x65ndpointB\t\n\x07message2\x87\x1b\n\x0cParticipants\x12\xb9\x02\n\x11\x43reateParticipant\x12\x39.google.cloud.dialogflow.v2beta1.CreateParticipantRequest\x1a,.google.cloud.dialogflow.v2beta1.Participant\"\xba\x01\x82\xd3\xe4\x93\x02\x9e\x01\"9/v2beta1/{parent=projects/*/conversations/*}/participants:\x0bparticipantZT\"E/v2beta1/{parent=projects/*/locations/*/conversations/*}/participants:\x0bparticipant\xda\x41\x12parent,participant\x12\x8b\x02\n\x0eGetParticipant\x12\x36.google.cloud.dialogflow.v2beta1.GetParticipantRequest\x1a,.google.cloud.dialogflow.v2beta1.Participant\"\x92\x01\x82\xd3\xe4\x93\x02\x84\x01\x12\x39/v2beta1/{name=projects/*/conversations/*/participants/*}ZG\x12\x45/v2beta1/{name=projects/*/locations/*/conversations/*/participants/*}\xda\x41\x04name\x12\x9e\x02\n\x10ListParticipants\x12\x38.google.cloud.dialogflow.v2beta1.ListParticipantsRequest\x1a\x39.google.cloud.dialogflow.v2beta1.ListParticipantsResponse\"\x94\x01\x82\xd3\xe4\x93\x02\x84\x01\x12\x39/v2beta1/{parent=projects/*/conversations/*}/participantsZG\x12\x45/v2beta1/{parent=projects/*/locations/*/conversations/*}/participants\xda\x41\x06parent\x12\xd6\x02\n\x11UpdateParticipant\x12\x39.google.cloud.dialogflow.v2beta1.UpdateParticipantRequest\x1a,.google.cloud.dialogflow.v2beta1.Participant\"\xd7\x01\x82\xd3\xe4\x93\x02\xb6\x01\x32\x45/v2beta1/{participant.name=projects/*/conversations/*/participants/*}:\x0bparticipantZ`2Q/v2beta1/{participant.name=projects/*/locations/*/conversations/*/participants/*}:\x0bparticipant\xda\x41\x17participant,update_mask\x12\x8e\x03\n\x0e\x41nalyzeContent\x12\x36.google.cloud.dialogflow.v2beta1.AnalyzeContentRequest\x1a\x37.google.cloud.dialogflow.v2beta1.AnalyzeContentResponse\"\x8a\x02\x82\xd3\xe4\x93\x02\xb6\x01\"O/v2beta1/{participant=projects/*/conversations/*/participants/*}:analyzeContent:\x01*Z`\"[/v2beta1/{participant=projects/*/locations/*/conversations/*/participants/*}:analyzeContent:\x01*\xda\x41\x16participant,text_input\xda\x41\x17participant,audio_input\xda\x41\x17participant,event_input\x12\xa2\x01\n\x17StreamingAnalyzeContent\x12?.google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest\x1a@.google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentResponse\"\x00(\x01\x30\x01\x12\xdd\x02\n\x0fSuggestArticles\x12\x37.google.cloud.dialogflow.v2beta1.SuggestArticlesRequest\x1a\x38.google.cloud.dialogflow.v2beta1.SuggestArticlesResponse\"\xd6\x01\x82\xd3\xe4\x93\x02\xc6\x01\"W/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:suggestArticles:\x01*Zh\"c/v2beta1/{parent=projects/*/locations/*/conversations/*/participants/*}/suggestions:suggestArticles:\x01*\xda\x41\x06parent\x12\xe7\x02\n\x11SuggestFaqAnswers\x12\x39.google.cloud.dialogflow.v2beta1.SuggestFaqAnswersRequest\x1a:.google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponse\"\xda\x01\x82\xd3\xe4\x93\x02\xca\x01\"Y/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:suggestFaqAnswers:\x01*Zj\"e/v2beta1/{parent=projects/*/locations/*/conversations/*/participants/*}/suggestions:suggestFaqAnswers:\x01*\xda\x41\x06parent\x12\xf1\x02\n\x13SuggestSmartReplies\x12;.google.cloud.dialogflow.v2beta1.SuggestSmartRepliesRequest\x1a<.google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse\"\xde\x01\x82\xd3\xe4\x93\x02\xce\x01\"[/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:suggestSmartReplies:\x01*Zl\"g/v2beta1/{parent=projects/*/locations/*/conversations/*/participants/*}/suggestions:suggestSmartReplies:\x01*\xda\x41\x06parent\x12\xd8\x01\n\x0fListSuggestions\x12\x37.google.cloud.dialogflow.v2beta1.ListSuggestionsRequest\x1a\x38.google.cloud.dialogflow.v2beta1.ListSuggestionsResponse\"R\x88\x02\x01\x82\xd3\xe4\x93\x02I\x12G/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions\x12\xe9\x01\n\x11\x43ompileSuggestion\x12\x39.google.cloud.dialogflow.v2beta1.CompileSuggestionRequest\x1a:.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse\"]\x88\x02\x01\x82\xd3\xe4\x93\x02T\"O/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:compile:\x01*\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\xae\x01\n#com.google.cloud.dialogflow.v2beta1B\x10ParticipantProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1fGoogle.Cloud.Dialogflow.V2beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2beta1.participant_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.dialogflow.v2beta1B\020ParticipantProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1'
  _PARTICIPANT_DOCUMENTSMETADATAFILTERSENTRY._options = None
  _PARTICIPANT_DOCUMENTSMETADATAFILTERSENTRY._serialized_options = b'8\001'
  _PARTICIPANT.fields_by_name['name']._options = None
  _PARTICIPANT.fields_by_name['name']._serialized_options = b'\340A\001'
  _PARTICIPANT.fields_by_name['role']._options = None
  _PARTICIPANT.fields_by_name['role']._serialized_options = b'\340A\005'
  _PARTICIPANT.fields_by_name['obfuscated_external_user_id']._options = None
  _PARTICIPANT.fields_by_name['obfuscated_external_user_id']._serialized_options = b'\340A\001'
  _PARTICIPANT.fields_by_name['documents_metadata_filters']._options = None
  _PARTICIPANT.fields_by_name['documents_metadata_filters']._serialized_options = b'\340A\001'
  _PARTICIPANT._options = None
  _PARTICIPANT._serialized_options = b'\352A\324\001\n%dialogflow.googleapis.com/Participant\022Jprojects/{project}/conversations/{conversation}/participants/{participant}\022_projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}'
  _MESSAGE.fields_by_name['name']._options = None
  _MESSAGE.fields_by_name['name']._serialized_options = b'\340A\001'
  _MESSAGE.fields_by_name['content']._options = None
  _MESSAGE.fields_by_name['content']._serialized_options = b'\340A\002'
  _MESSAGE.fields_by_name['language_code']._options = None
  _MESSAGE.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _MESSAGE.fields_by_name['participant']._options = None
  _MESSAGE.fields_by_name['participant']._serialized_options = b'\340A\003'
  _MESSAGE.fields_by_name['participant_role']._options = None
  _MESSAGE.fields_by_name['participant_role']._serialized_options = b'\340A\003'
  _MESSAGE.fields_by_name['create_time']._options = None
  _MESSAGE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _MESSAGE.fields_by_name['send_time']._options = None
  _MESSAGE.fields_by_name['send_time']._serialized_options = b'\340A\001'
  _MESSAGE.fields_by_name['message_annotation']._options = None
  _MESSAGE.fields_by_name['message_annotation']._serialized_options = b'\340A\003'
  _MESSAGE.fields_by_name['sentiment_analysis']._options = None
  _MESSAGE.fields_by_name['sentiment_analysis']._serialized_options = b'\340A\003'
  _MESSAGE._options = None
  _MESSAGE._serialized_options = b'\352A\300\001\n!dialogflow.googleapis.com/Message\022Bprojects/{project}/conversations/{conversation}/messages/{message}\022Wprojects/{project}/locations/{location}/conversations/{conversation}/messages/{message}'
  _CREATEPARTICIPANTREQUEST.fields_by_name['parent']._options = None
  _CREATEPARTICIPANTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\022%dialogflow.googleapis.com/Participant'
  _CREATEPARTICIPANTREQUEST.fields_by_name['participant']._options = None
  _CREATEPARTICIPANTREQUEST.fields_by_name['participant']._serialized_options = b'\340A\002'
  _GETPARTICIPANTREQUEST.fields_by_name['name']._options = None
  _GETPARTICIPANTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Participant'
  _LISTPARTICIPANTSREQUEST.fields_by_name['parent']._options = None
  _LISTPARTICIPANTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\022%dialogflow.googleapis.com/Participant'
  _LISTPARTICIPANTSREQUEST.fields_by_name['page_size']._options = None
  _LISTPARTICIPANTSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTPARTICIPANTSREQUEST.fields_by_name['page_token']._options = None
  _LISTPARTICIPANTSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _UPDATEPARTICIPANTREQUEST.fields_by_name['participant']._options = None
  _UPDATEPARTICIPANTREQUEST.fields_by_name['participant']._serialized_options = b'\340A\002'
  _UPDATEPARTICIPANTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEPARTICIPANTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _AUTOMATEDAGENTREPLY.fields_by_name['intent']._options = None
  _AUTOMATEDAGENTREPLY.fields_by_name['intent']._serialized_options = b'\372A\"\n dialogflow.googleapis.com/Intent'
  _AUTOMATEDAGENTREPLY.fields_by_name['cx_session_parameters']._options = None
  _AUTOMATEDAGENTREPLY.fields_by_name['cx_session_parameters']._serialized_options = b'\030\001'
  _ASSISTQUERYPARAMETERS_DOCUMENTSMETADATAFILTERSENTRY._options = None
  _ASSISTQUERYPARAMETERS_DOCUMENTSMETADATAFILTERSENTRY._serialized_options = b'8\001'
  _ANALYZECONTENTREQUEST.fields_by_name['participant']._options = None
  _ANALYZECONTENTREQUEST.fields_by_name['participant']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Participant'
  _STREAMINGANALYZECONTENTREQUEST.fields_by_name['participant']._options = None
  _STREAMINGANALYZECONTENTREQUEST.fields_by_name['participant']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Participant'
  _ARTICLEANSWER_METADATAENTRY._options = None
  _ARTICLEANSWER_METADATAENTRY._serialized_options = b'8\001'
  _FAQANSWER_METADATAENTRY._options = None
  _FAQANSWER_METADATAENTRY._serialized_options = b'8\001'
  _SMARTREPLYANSWER.fields_by_name['answer_record']._options = None
  _SMARTREPLYANSWER.fields_by_name['answer_record']._serialized_options = b'\372A(\n&dialogflow.googleapis.com/AnswerRecord'
  _SUGGESTARTICLESREQUEST.fields_by_name['parent']._options = None
  _SUGGESTARTICLESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Participant'
  _SUGGESTARTICLESREQUEST.fields_by_name['latest_message']._options = None
  _SUGGESTARTICLESREQUEST.fields_by_name['latest_message']._serialized_options = b'\340A\001\372A#\n!dialogflow.googleapis.com/Message'
  _SUGGESTARTICLESREQUEST.fields_by_name['context_size']._options = None
  _SUGGESTARTICLESREQUEST.fields_by_name['context_size']._serialized_options = b'\340A\001'
  _SUGGESTARTICLESREQUEST.fields_by_name['assist_query_params']._options = None
  _SUGGESTARTICLESREQUEST.fields_by_name['assist_query_params']._serialized_options = b'\340A\001'
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['parent']._options = None
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Participant'
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['latest_message']._options = None
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['latest_message']._serialized_options = b'\340A\001\372A#\n!dialogflow.googleapis.com/Message'
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['context_size']._options = None
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['context_size']._serialized_options = b'\340A\001'
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['assist_query_params']._options = None
  _SUGGESTFAQANSWERSREQUEST.fields_by_name['assist_query_params']._serialized_options = b'\340A\001'
  _SUGGESTSMARTREPLIESREQUEST.fields_by_name['parent']._options = None
  _SUGGESTSMARTREPLIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\'\n%dialogflow.googleapis.com/Participant'
  _SUGGESTSMARTREPLIESREQUEST.fields_by_name['latest_message']._options = None
  _SUGGESTSMARTREPLIESREQUEST.fields_by_name['latest_message']._serialized_options = b'\372A#\n!dialogflow.googleapis.com/Message'
  _SUGGESTSMARTREPLIESRESPONSE.fields_by_name['latest_message']._options = None
  _SUGGESTSMARTREPLIESRESPONSE.fields_by_name['latest_message']._serialized_options = b'\372A#\n!dialogflow.googleapis.com/Message'
  _SUGGESTION_ARTICLE_METADATAENTRY._options = None
  _SUGGESTION_ARTICLE_METADATAENTRY._serialized_options = b'8\001'
  _SUGGESTION_FAQANSWER_METADATAENTRY._options = None
  _SUGGESTION_FAQANSWER_METADATAENTRY._serialized_options = b'8\001'
  _SUGGESTION._options = None
  _SUGGESTION._serialized_options = b'\030\001'
  _LISTSUGGESTIONSREQUEST._options = None
  _LISTSUGGESTIONSREQUEST._serialized_options = b'\030\001'
  _LISTSUGGESTIONSRESPONSE._options = None
  _LISTSUGGESTIONSRESPONSE._serialized_options = b'\030\001'
  _COMPILESUGGESTIONREQUEST._options = None
  _COMPILESUGGESTIONREQUEST._serialized_options = b'\030\001'
  _COMPILESUGGESTIONRESPONSE._options = None
  _COMPILESUGGESTIONRESPONSE._serialized_options = b'\030\001'
  _PARTICIPANTS._options = None
  _PARTICIPANTS._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _PARTICIPANTS.methods_by_name['CreateParticipant']._options = None
  _PARTICIPANTS.methods_by_name['CreateParticipant']._serialized_options = b'\202\323\344\223\002\236\001\"9/v2beta1/{parent=projects/*/conversations/*}/participants:\013participantZT\"E/v2beta1/{parent=projects/*/locations/*/conversations/*}/participants:\013participant\332A\022parent,participant'
  _PARTICIPANTS.methods_by_name['GetParticipant']._options = None
  _PARTICIPANTS.methods_by_name['GetParticipant']._serialized_options = b'\202\323\344\223\002\204\001\0229/v2beta1/{name=projects/*/conversations/*/participants/*}ZG\022E/v2beta1/{name=projects/*/locations/*/conversations/*/participants/*}\332A\004name'
  _PARTICIPANTS.methods_by_name['ListParticipants']._options = None
  _PARTICIPANTS.methods_by_name['ListParticipants']._serialized_options = b'\202\323\344\223\002\204\001\0229/v2beta1/{parent=projects/*/conversations/*}/participantsZG\022E/v2beta1/{parent=projects/*/locations/*/conversations/*}/participants\332A\006parent'
  _PARTICIPANTS.methods_by_name['UpdateParticipant']._options = None
  _PARTICIPANTS.methods_by_name['UpdateParticipant']._serialized_options = b'\202\323\344\223\002\266\0012E/v2beta1/{participant.name=projects/*/conversations/*/participants/*}:\013participantZ`2Q/v2beta1/{participant.name=projects/*/locations/*/conversations/*/participants/*}:\013participant\332A\027participant,update_mask'
  _PARTICIPANTS.methods_by_name['AnalyzeContent']._options = None
  _PARTICIPANTS.methods_by_name['AnalyzeContent']._serialized_options = b'\202\323\344\223\002\266\001\"O/v2beta1/{participant=projects/*/conversations/*/participants/*}:analyzeContent:\001*Z`\"[/v2beta1/{participant=projects/*/locations/*/conversations/*/participants/*}:analyzeContent:\001*\332A\026participant,text_input\332A\027participant,audio_input\332A\027participant,event_input'
  _PARTICIPANTS.methods_by_name['SuggestArticles']._options = None
  _PARTICIPANTS.methods_by_name['SuggestArticles']._serialized_options = b'\202\323\344\223\002\306\001\"W/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:suggestArticles:\001*Zh\"c/v2beta1/{parent=projects/*/locations/*/conversations/*/participants/*}/suggestions:suggestArticles:\001*\332A\006parent'
  _PARTICIPANTS.methods_by_name['SuggestFaqAnswers']._options = None
  _PARTICIPANTS.methods_by_name['SuggestFaqAnswers']._serialized_options = b'\202\323\344\223\002\312\001\"Y/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:suggestFaqAnswers:\001*Zj\"e/v2beta1/{parent=projects/*/locations/*/conversations/*/participants/*}/suggestions:suggestFaqAnswers:\001*\332A\006parent'
  _PARTICIPANTS.methods_by_name['SuggestSmartReplies']._options = None
  _PARTICIPANTS.methods_by_name['SuggestSmartReplies']._serialized_options = b'\202\323\344\223\002\316\001\"[/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:suggestSmartReplies:\001*Zl\"g/v2beta1/{parent=projects/*/locations/*/conversations/*/participants/*}/suggestions:suggestSmartReplies:\001*\332A\006parent'
  _PARTICIPANTS.methods_by_name['ListSuggestions']._options = None
  _PARTICIPANTS.methods_by_name['ListSuggestions']._serialized_options = b'\210\002\001\202\323\344\223\002I\022G/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions'
  _PARTICIPANTS.methods_by_name['CompileSuggestion']._options = None
  _PARTICIPANTS.methods_by_name['CompileSuggestion']._serialized_options = b'\210\002\001\202\323\344\223\002T\"O/v2beta1/{parent=projects/*/conversations/*/participants/*}/suggestions:compile:\001*'
  _PARTICIPANT._serialized_start=423
  _PARTICIPANT._serialized_end=1050
  _PARTICIPANT_DOCUMENTSMETADATAFILTERSENTRY._serialized_start=686
  _PARTICIPANT_DOCUMENTSMETADATAFILTERSENTRY._serialized_end=749
  _PARTICIPANT_ROLE._serialized_start=751
  _PARTICIPANT_ROLE._serialized_end=831
  _MESSAGE._serialized_start=1053
  _MESSAGE._serialized_end=1720
  _CREATEPARTICIPANTREQUEST._serialized_start=1723
  _CREATEPARTICIPANTREQUEST._serialized_end=1884
  _GETPARTICIPANTREQUEST._serialized_start=1886
  _GETPARTICIPANTREQUEST._serialized_end=1970
  _LISTPARTICIPANTSREQUEST._serialized_start=1973
  _LISTPARTICIPANTSREQUEST._serialized_end=2110
  _LISTPARTICIPANTSRESPONSE._serialized_start=2112
  _LISTPARTICIPANTSRESPONSE._serialized_end=2231
  _UPDATEPARTICIPANTREQUEST._serialized_start=2234
  _UPDATEPARTICIPANTREQUEST._serialized_end=2386
  _AUDIOINPUT._serialized_start=2388
  _AUDIOINPUT._serialized_end=2482
  _OUTPUTAUDIO._serialized_start=2484
  _OUTPUTAUDIO._serialized_end=2580
  _AUTOMATEDAGENTREPLY._serialized_start=2583
  _AUTOMATEDAGENTREPLY._serialized_end=3233
  _AUTOMATEDAGENTREPLY_AUTOMATEDAGENTREPLYTYPE._serialized_start=3119
  _AUTOMATEDAGENTREPLY_AUTOMATEDAGENTREPLYTYPE._serialized_end=3212
  _SUGGESTIONFEATURE._serialized_start=3236
  _SUGGESTIONFEATURE._serialized_end=3406
  _SUGGESTIONFEATURE_TYPE._serialized_start=3328
  _SUGGESTIONFEATURE_TYPE._serialized_end=3406
  _ASSISTQUERYPARAMETERS._serialized_start=3409
  _ASSISTQUERYPARAMETERS._serialized_end=3619
  _ASSISTQUERYPARAMETERS_DOCUMENTSMETADATAFILTERSENTRY._serialized_start=686
  _ASSISTQUERYPARAMETERS_DOCUMENTSMETADATAFILTERSENTRY._serialized_end=749
  _ANALYZECONTENTREQUEST._serialized_start=3622
  _ANALYZECONTENTREQUEST._serialized_end=4309
  _DTMFPARAMETERS._serialized_start=4311
  _DTMFPARAMETERS._serialized_end=4355
  _ANALYZECONTENTRESPONSE._serialized_start=4358
  _ANALYZECONTENTRESPONSE._serialized_end=4866
  _INPUTTEXTCONFIG._serialized_start=4868
  _INPUTTEXTCONFIG._serialized_end=4908
  _STREAMINGANALYZECONTENTREQUEST._serialized_start=4911
  _STREAMINGANALYZECONTENTREQUEST._serialized_end=5655
  _STREAMINGANALYZECONTENTRESPONSE._serialized_start=5658
  _STREAMINGANALYZECONTENTRESPONSE._serialized_end=6264
  _ANNOTATEDMESSAGEPART._serialized_start=6266
  _ANNOTATEDMESSAGEPART._serialized_end=6372
  _MESSAGEANNOTATION._serialized_start=6374
  _MESSAGEANNOTATION._serialized_end=6489
  _ARTICLEANSWER._serialized_start=6492
  _ARTICLEANSWER._serialized_end=6705
  _ARTICLEANSWER_METADATAENTRY._serialized_start=6658
  _ARTICLEANSWER_METADATAENTRY._serialized_end=6705
  _FAQANSWER._serialized_start=6708
  _FAQANSWER._serialized_end=6937
  _FAQANSWER_METADATAENTRY._serialized_start=6658
  _FAQANSWER_METADATAENTRY._serialized_end=6705
  _SMARTREPLYANSWER._serialized_start=6939
  _SMARTREPLYANSWER._serialized_end=7060
  _SUGGESTIONRESULT._serialized_start=7063
  _SUGGESTIONRESULT._serialized_end=7440
  _SUGGESTARTICLESREQUEST._serialized_start=7443
  _SUGGESTARTICLESREQUEST._serialized_end=7714
  _SUGGESTARTICLESRESPONSE._serialized_start=7717
  _SUGGESTARTICLESRESPONSE._serialized_end=7861
  _SUGGESTFAQANSWERSREQUEST._serialized_start=7864
  _SUGGESTFAQANSWERSREQUEST._serialized_end=8137
  _SUGGESTFAQANSWERSRESPONSE._serialized_start=8140
  _SUGGESTFAQANSWERSRESPONSE._serialized_end=8278
  _SUGGESTSMARTREPLIESREQUEST._serialized_start=8281
  _SUGGESTSMARTREPLIESREQUEST._serialized_end=8530
  _SUGGESTSMARTREPLIESRESPONSE._serialized_start=8533
  _SUGGESTSMARTREPLIESRESPONSE._serialized_end=8728
  _SUGGESTION._serialized_start=8731
  _SUGGESTION._serialized_end=9439
  _SUGGESTION_ARTICLE._serialized_start=8980
  _SUGGESTION_ARTICLE._serialized_end=9192
  _SUGGESTION_ARTICLE_METADATAENTRY._serialized_start=6658
  _SUGGESTION_ARTICLE_METADATAENTRY._serialized_end=6705
  _SUGGESTION_FAQANSWER._serialized_start=9195
  _SUGGESTION_FAQANSWER._serialized_end=9435
  _SUGGESTION_FAQANSWER_METADATAENTRY._serialized_start=6658
  _SUGGESTION_FAQANSWER_METADATAENTRY._serialized_end=6705
  _LISTSUGGESTIONSREQUEST._serialized_start=9441
  _LISTSUGGESTIONSREQUEST._serialized_end=9540
  _LISTSUGGESTIONSRESPONSE._serialized_start=9542
  _LISTSUGGESTIONSRESPONSE._serialized_end=9662
  _COMPILESUGGESTIONREQUEST._serialized_start=9664
  _COMPILESUGGESTIONREQUEST._serialized_end=9756
  _COMPILESUGGESTIONRESPONSE._serialized_start=9759
  _COMPILESUGGESTIONRESPONSE._serialized_end=9901
  _RESPONSEMESSAGE._serialized_start=9904
  _RESPONSEMESSAGE._serialized_end=10803
  _RESPONSEMESSAGE_TEXT._serialized_start=10418
  _RESPONSEMESSAGE_TEXT._serialized_end=10438
  _RESPONSEMESSAGE_LIVEAGENTHANDOFF._serialized_start=10440
  _RESPONSEMESSAGE_LIVEAGENTHANDOFF._serialized_end=10501
  _RESPONSEMESSAGE_ENDINTERACTION._serialized_start=10503
  _RESPONSEMESSAGE_ENDINTERACTION._serialized_end=10519
  _RESPONSEMESSAGE_MIXEDAUDIO._serialized_start=10522
  _RESPONSEMESSAGE_MIXEDAUDIO._serialized_end=10712
  _RESPONSEMESSAGE_MIXEDAUDIO_SEGMENT._serialized_start=10623
  _RESPONSEMESSAGE_MIXEDAUDIO_SEGMENT._serialized_end=10712
  _RESPONSEMESSAGE_TELEPHONYTRANSFERCALL._serialized_start=10714
  _RESPONSEMESSAGE_TELEPHONYTRANSFERCALL._serialized_end=10792
  _PARTICIPANTS._serialized_start=10806
  _PARTICIPANTS._serialized_end=14269
# @@protoc_insertion_point(module_scope)
