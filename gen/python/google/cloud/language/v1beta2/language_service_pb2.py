# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/language/v1beta2/language_service.proto
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
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/cloud/language/v1beta2/language_service.proto\x12\x1dgoogle.cloud.language.v1beta2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc8\x01\n\x08\x44ocument\x12:\n\x04type\x18\x01 \x01(\x0e\x32,.google.cloud.language.v1beta2.Document.Type\x12\x11\n\x07\x63ontent\x18\x02 \x01(\tH\x00\x12\x19\n\x0fgcs_content_uri\x18\x03 \x01(\tH\x00\x12\x10\n\x08language\x18\x04 \x01(\t\"6\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nPLAIN_TEXT\x10\x01\x12\x08\n\x04HTML\x10\x02\x42\x08\n\x06source\"~\n\x08Sentence\x12\x35\n\x04text\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.TextSpan\x12;\n\tsentiment\x18\x02 \x01(\x0b\x32(.google.cloud.language.v1beta2.Sentiment\"\x93\x04\n\x06\x45ntity\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x38\n\x04type\x18\x02 \x01(\x0e\x32*.google.cloud.language.v1beta2.Entity.Type\x12\x45\n\x08metadata\x18\x03 \x03(\x0b\x32\x33.google.cloud.language.v1beta2.Entity.MetadataEntry\x12\x10\n\x08salience\x18\x04 \x01(\x02\x12>\n\x08mentions\x18\x05 \x03(\x0b\x32,.google.cloud.language.v1beta2.EntityMention\x12;\n\tsentiment\x18\x06 \x01(\x0b\x32(.google.cloud.language.v1beta2.Sentiment\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xb9\x01\n\x04Type\x12\x0b\n\x07UNKNOWN\x10\x00\x12\n\n\x06PERSON\x10\x01\x12\x0c\n\x08LOCATION\x10\x02\x12\x10\n\x0cORGANIZATION\x10\x03\x12\t\n\x05\x45VENT\x10\x04\x12\x0f\n\x0bWORK_OF_ART\x10\x05\x12\x11\n\rCONSUMER_GOOD\x10\x06\x12\t\n\x05OTHER\x10\x07\x12\x10\n\x0cPHONE_NUMBER\x10\t\x12\x0b\n\x07\x41\x44\x44RESS\x10\n\x12\x08\n\x04\x44\x41TE\x10\x0b\x12\n\n\x06NUMBER\x10\x0c\x12\t\n\x05PRICE\x10\r\"\xda\x01\n\x05Token\x12\x35\n\x04text\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.TextSpan\x12\x43\n\x0epart_of_speech\x18\x02 \x01(\x0b\x32+.google.cloud.language.v1beta2.PartOfSpeech\x12\x46\n\x0f\x64\x65pendency_edge\x18\x03 \x01(\x0b\x32-.google.cloud.language.v1beta2.DependencyEdge\x12\r\n\x05lemma\x18\x04 \x01(\t\"-\n\tSentiment\x12\x11\n\tmagnitude\x18\x02 \x01(\x02\x12\r\n\x05score\x18\x03 \x01(\x02\"\xdf\x10\n\x0cPartOfSpeech\x12<\n\x03tag\x18\x01 \x01(\x0e\x32/.google.cloud.language.v1beta2.PartOfSpeech.Tag\x12\x42\n\x06\x61spect\x18\x02 \x01(\x0e\x32\x32.google.cloud.language.v1beta2.PartOfSpeech.Aspect\x12>\n\x04\x63\x61se\x18\x03 \x01(\x0e\x32\x30.google.cloud.language.v1beta2.PartOfSpeech.Case\x12>\n\x04\x66orm\x18\x04 \x01(\x0e\x32\x30.google.cloud.language.v1beta2.PartOfSpeech.Form\x12\x42\n\x06gender\x18\x05 \x01(\x0e\x32\x32.google.cloud.language.v1beta2.PartOfSpeech.Gender\x12>\n\x04mood\x18\x06 \x01(\x0e\x32\x30.google.cloud.language.v1beta2.PartOfSpeech.Mood\x12\x42\n\x06number\x18\x07 \x01(\x0e\x32\x32.google.cloud.language.v1beta2.PartOfSpeech.Number\x12\x42\n\x06person\x18\x08 \x01(\x0e\x32\x32.google.cloud.language.v1beta2.PartOfSpeech.Person\x12\x42\n\x06proper\x18\t \x01(\x0e\x32\x32.google.cloud.language.v1beta2.PartOfSpeech.Proper\x12L\n\x0breciprocity\x18\n \x01(\x0e\x32\x37.google.cloud.language.v1beta2.PartOfSpeech.Reciprocity\x12@\n\x05tense\x18\x0b \x01(\x0e\x32\x31.google.cloud.language.v1beta2.PartOfSpeech.Tense\x12@\n\x05voice\x18\x0c \x01(\x0e\x32\x31.google.cloud.language.v1beta2.PartOfSpeech.Voice\"\x8d\x01\n\x03Tag\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x07\n\x03\x41\x44J\x10\x01\x12\x07\n\x03\x41\x44P\x10\x02\x12\x07\n\x03\x41\x44V\x10\x03\x12\x08\n\x04\x43ONJ\x10\x04\x12\x07\n\x03\x44\x45T\x10\x05\x12\x08\n\x04NOUN\x10\x06\x12\x07\n\x03NUM\x10\x07\x12\x08\n\x04PRON\x10\x08\x12\x07\n\x03PRT\x10\t\x12\t\n\x05PUNCT\x10\n\x12\x08\n\x04VERB\x10\x0b\x12\x05\n\x01X\x10\x0c\x12\t\n\x05\x41\x46\x46IX\x10\r\"O\n\x06\x41spect\x12\x12\n\x0e\x41SPECT_UNKNOWN\x10\x00\x12\x0e\n\nPERFECTIVE\x10\x01\x12\x10\n\x0cIMPERFECTIVE\x10\x02\x12\x0f\n\x0bPROGRESSIVE\x10\x03\"\xf8\x01\n\x04\x43\x61se\x12\x10\n\x0c\x43\x41SE_UNKNOWN\x10\x00\x12\x0e\n\nACCUSATIVE\x10\x01\x12\r\n\tADVERBIAL\x10\x02\x12\x11\n\rCOMPLEMENTIVE\x10\x03\x12\n\n\x06\x44\x41TIVE\x10\x04\x12\x0c\n\x08GENITIVE\x10\x05\x12\x10\n\x0cINSTRUMENTAL\x10\x06\x12\x0c\n\x08LOCATIVE\x10\x07\x12\x0e\n\nNOMINATIVE\x10\x08\x12\x0b\n\x07OBLIQUE\x10\t\x12\r\n\tPARTITIVE\x10\n\x12\x11\n\rPREPOSITIONAL\x10\x0b\x12\x12\n\x0eREFLEXIVE_CASE\x10\x0c\x12\x11\n\rRELATIVE_CASE\x10\r\x12\x0c\n\x08VOCATIVE\x10\x0e\"\xaf\x01\n\x04\x46orm\x12\x10\n\x0c\x46ORM_UNKNOWN\x10\x00\x12\x0c\n\x08\x41\x44NOMIAL\x10\x01\x12\r\n\tAUXILIARY\x10\x02\x12\x12\n\x0e\x43OMPLEMENTIZER\x10\x03\x12\x10\n\x0c\x46INAL_ENDING\x10\x04\x12\n\n\x06GERUND\x10\x05\x12\n\n\x06REALIS\x10\x06\x12\x0c\n\x08IRREALIS\x10\x07\x12\t\n\x05SHORT\x10\x08\x12\x08\n\x04LONG\x10\t\x12\t\n\x05ORDER\x10\n\x12\x0c\n\x08SPECIFIC\x10\x0b\"E\n\x06Gender\x12\x12\n\x0eGENDER_UNKNOWN\x10\x00\x12\x0c\n\x08\x46\x45MININE\x10\x01\x12\r\n\tMASCULINE\x10\x02\x12\n\n\x06NEUTER\x10\x03\"\x7f\n\x04Mood\x12\x10\n\x0cMOOD_UNKNOWN\x10\x00\x12\x14\n\x10\x43ONDITIONAL_MOOD\x10\x01\x12\x0e\n\nIMPERATIVE\x10\x02\x12\x0e\n\nINDICATIVE\x10\x03\x12\x11\n\rINTERROGATIVE\x10\x04\x12\x0b\n\x07JUSSIVE\x10\x05\x12\x0f\n\x0bSUBJUNCTIVE\x10\x06\"@\n\x06Number\x12\x12\n\x0eNUMBER_UNKNOWN\x10\x00\x12\x0c\n\x08SINGULAR\x10\x01\x12\n\n\x06PLURAL\x10\x02\x12\x08\n\x04\x44UAL\x10\x03\"T\n\x06Person\x12\x12\n\x0ePERSON_UNKNOWN\x10\x00\x12\t\n\x05\x46IRST\x10\x01\x12\n\n\x06SECOND\x10\x02\x12\t\n\x05THIRD\x10\x03\x12\x14\n\x10REFLEXIVE_PERSON\x10\x04\"8\n\x06Proper\x12\x12\n\x0ePROPER_UNKNOWN\x10\x00\x12\n\n\x06PROPER\x10\x01\x12\x0e\n\nNOT_PROPER\x10\x02\"J\n\x0bReciprocity\x12\x17\n\x13RECIPROCITY_UNKNOWN\x10\x00\x12\x0e\n\nRECIPROCAL\x10\x01\x12\x12\n\x0eNON_RECIPROCAL\x10\x02\"s\n\x05Tense\x12\x11\n\rTENSE_UNKNOWN\x10\x00\x12\x15\n\x11\x43ONDITIONAL_TENSE\x10\x01\x12\n\n\x06\x46UTURE\x10\x02\x12\x08\n\x04PAST\x10\x03\x12\x0b\n\x07PRESENT\x10\x04\x12\r\n\tIMPERFECT\x10\x05\x12\x0e\n\nPLUPERFECT\x10\x06\"B\n\x05Voice\x12\x11\n\rVOICE_UNKNOWN\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\r\n\tCAUSATIVE\x10\x02\x12\x0b\n\x07PASSIVE\x10\x03\"\x9a\x08\n\x0e\x44\x65pendencyEdge\x12\x18\n\x10head_token_index\x18\x01 \x01(\x05\x12\x42\n\x05label\x18\x02 \x01(\x0e\x32\x33.google.cloud.language.v1beta2.DependencyEdge.Label\"\xa9\x07\n\x05Label\x12\x0b\n\x07UNKNOWN\x10\x00\x12\n\n\x06\x41\x42\x42REV\x10\x01\x12\t\n\x05\x41\x43OMP\x10\x02\x12\t\n\x05\x41\x44VCL\x10\x03\x12\n\n\x06\x41\x44VMOD\x10\x04\x12\x08\n\x04\x41MOD\x10\x05\x12\t\n\x05\x41PPOS\x10\x06\x12\x08\n\x04\x41TTR\x10\x07\x12\x07\n\x03\x41UX\x10\x08\x12\x0b\n\x07\x41UXPASS\x10\t\x12\x06\n\x02\x43\x43\x10\n\x12\t\n\x05\x43\x43OMP\x10\x0b\x12\x08\n\x04\x43ONJ\x10\x0c\x12\t\n\x05\x43SUBJ\x10\r\x12\r\n\tCSUBJPASS\x10\x0e\x12\x07\n\x03\x44\x45P\x10\x0f\x12\x07\n\x03\x44\x45T\x10\x10\x12\r\n\tDISCOURSE\x10\x11\x12\x08\n\x04\x44OBJ\x10\x12\x12\x08\n\x04\x45XPL\x10\x13\x12\x0c\n\x08GOESWITH\x10\x14\x12\x08\n\x04IOBJ\x10\x15\x12\x08\n\x04MARK\x10\x16\x12\x07\n\x03MWE\x10\x17\x12\x07\n\x03MWV\x10\x18\x12\x07\n\x03NEG\x10\x19\x12\x06\n\x02NN\x10\x1a\x12\x0c\n\x08NPADVMOD\x10\x1b\x12\t\n\x05NSUBJ\x10\x1c\x12\r\n\tNSUBJPASS\x10\x1d\x12\x07\n\x03NUM\x10\x1e\x12\n\n\x06NUMBER\x10\x1f\x12\x05\n\x01P\x10 \x12\r\n\tPARATAXIS\x10!\x12\x0b\n\x07PARTMOD\x10\"\x12\t\n\x05PCOMP\x10#\x12\x08\n\x04POBJ\x10$\x12\x08\n\x04POSS\x10%\x12\x0b\n\x07POSTNEG\x10&\x12\x0b\n\x07PRECOMP\x10\'\x12\x0b\n\x07PRECONJ\x10(\x12\n\n\x06PREDET\x10)\x12\x08\n\x04PREF\x10*\x12\x08\n\x04PREP\x10+\x12\t\n\x05PRONL\x10,\x12\x07\n\x03PRT\x10-\x12\x06\n\x02PS\x10.\x12\x0c\n\x08QUANTMOD\x10/\x12\t\n\x05RCMOD\x10\x30\x12\x0c\n\x08RCMODREL\x10\x31\x12\t\n\x05RDROP\x10\x32\x12\x07\n\x03REF\x10\x33\x12\x0b\n\x07REMNANT\x10\x34\x12\x0e\n\nREPARANDUM\x10\x35\x12\x08\n\x04ROOT\x10\x36\x12\x08\n\x04SNUM\x10\x37\x12\x08\n\x04SUFF\x10\x38\x12\x08\n\x04TMOD\x10\x39\x12\t\n\x05TOPIC\x10:\x12\x08\n\x04VMOD\x10;\x12\x0c\n\x08VOCATIVE\x10<\x12\t\n\x05XCOMP\x10=\x12\n\n\x06SUFFIX\x10>\x12\t\n\x05TITLE\x10?\x12\x0c\n\x08\x41\x44VPHMOD\x10@\x12\x0b\n\x07\x41UXCAUS\x10\x41\x12\t\n\x05\x41UXVV\x10\x42\x12\t\n\x05\x44TMOD\x10\x43\x12\x0b\n\x07\x46OREIGN\x10\x44\x12\x06\n\x02KW\x10\x45\x12\x08\n\x04LIST\x10\x46\x12\x08\n\x04NOMC\x10G\x12\x0c\n\x08NOMCSUBJ\x10H\x12\x10\n\x0cNOMCSUBJPASS\x10I\x12\x08\n\x04NUMC\x10J\x12\x07\n\x03\x43OP\x10K\x12\x0e\n\nDISLOCATED\x10L\x12\x07\n\x03\x41SP\x10M\x12\x08\n\x04GMOD\x10N\x12\x08\n\x04GOBJ\x10O\x12\n\n\x06INFMOD\x10P\x12\x07\n\x03MES\x10Q\x12\t\n\x05NCOMP\x10R\"\xf6\x01\n\rEntityMention\x12\x35\n\x04text\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.TextSpan\x12?\n\x04type\x18\x02 \x01(\x0e\x32\x31.google.cloud.language.v1beta2.EntityMention.Type\x12;\n\tsentiment\x18\x03 \x01(\x0b\x32(.google.cloud.language.v1beta2.Sentiment\"0\n\x04Type\x12\x10\n\x0cTYPE_UNKNOWN\x10\x00\x12\n\n\x06PROPER\x10\x01\x12\n\n\x06\x43OMMON\x10\x02\"1\n\x08TextSpan\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\t\x12\x14\n\x0c\x62\x65gin_offset\x18\x02 \x01(\x05\":\n\x16\x43lassificationCategory\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nconfidence\x18\x02 \x01(\x02\"\x9d\x01\n\x17\x41nalyzeSentimentRequest\x12>\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.DocumentB\x03\xe0\x41\x02\x12\x42\n\rencoding_type\x18\x02 \x01(\x0e\x32+.google.cloud.language.v1beta2.EncodingType\"\xae\x01\n\x18\x41nalyzeSentimentResponse\x12\x44\n\x12\x64ocument_sentiment\x18\x01 \x01(\x0b\x32(.google.cloud.language.v1beta2.Sentiment\x12\x10\n\x08language\x18\x02 \x01(\t\x12:\n\tsentences\x18\x03 \x03(\x0b\x32\'.google.cloud.language.v1beta2.Sentence\"\xa3\x01\n\x1d\x41nalyzeEntitySentimentRequest\x12>\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.DocumentB\x03\xe0\x41\x02\x12\x42\n\rencoding_type\x18\x02 \x01(\x0e\x32+.google.cloud.language.v1beta2.EncodingType\"k\n\x1e\x41nalyzeEntitySentimentResponse\x12\x37\n\x08\x65ntities\x18\x01 \x03(\x0b\x32%.google.cloud.language.v1beta2.Entity\x12\x10\n\x08language\x18\x02 \x01(\t\"\x9c\x01\n\x16\x41nalyzeEntitiesRequest\x12>\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.DocumentB\x03\xe0\x41\x02\x12\x42\n\rencoding_type\x18\x02 \x01(\x0e\x32+.google.cloud.language.v1beta2.EncodingType\"d\n\x17\x41nalyzeEntitiesResponse\x12\x37\n\x08\x65ntities\x18\x01 \x03(\x0b\x32%.google.cloud.language.v1beta2.Entity\x12\x10\n\x08language\x18\x02 \x01(\t\"\x9a\x01\n\x14\x41nalyzeSyntaxRequest\x12>\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.DocumentB\x03\xe0\x41\x02\x12\x42\n\rencoding_type\x18\x02 \x01(\x0e\x32+.google.cloud.language.v1beta2.EncodingType\"\x9b\x01\n\x15\x41nalyzeSyntaxResponse\x12:\n\tsentences\x18\x01 \x03(\x0b\x32\'.google.cloud.language.v1beta2.Sentence\x12\x34\n\x06tokens\x18\x02 \x03(\x0b\x32$.google.cloud.language.v1beta2.Token\x12\x10\n\x08language\x18\x03 \x01(\t\"U\n\x13\x43lassifyTextRequest\x12>\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.DocumentB\x03\xe0\x41\x02\"a\n\x14\x43lassifyTextResponse\x12I\n\ncategories\x18\x01 \x03(\x0b\x32\x35.google.cloud.language.v1beta2.ClassificationCategory\"\x89\x03\n\x13\x41nnotateTextRequest\x12>\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\'.google.cloud.language.v1beta2.DocumentB\x03\xe0\x41\x02\x12R\n\x08\x66\x65\x61tures\x18\x02 \x01(\x0b\x32;.google.cloud.language.v1beta2.AnnotateTextRequest.FeaturesB\x03\xe0\x41\x02\x12\x42\n\rencoding_type\x18\x03 \x01(\x0e\x32+.google.cloud.language.v1beta2.EncodingType\x1a\x99\x01\n\x08\x46\x65\x61tures\x12\x16\n\x0e\x65xtract_syntax\x18\x01 \x01(\x08\x12\x18\n\x10\x65xtract_entities\x18\x02 \x01(\x08\x12\"\n\x1a\x65xtract_document_sentiment\x18\x03 \x01(\x08\x12 \n\x18\x65xtract_entity_sentiment\x18\x04 \x01(\x08\x12\x15\n\rclassify_text\x18\x06 \x01(\x08\"\xe4\x02\n\x14\x41nnotateTextResponse\x12:\n\tsentences\x18\x01 \x03(\x0b\x32\'.google.cloud.language.v1beta2.Sentence\x12\x34\n\x06tokens\x18\x02 \x03(\x0b\x32$.google.cloud.language.v1beta2.Token\x12\x37\n\x08\x65ntities\x18\x03 \x03(\x0b\x32%.google.cloud.language.v1beta2.Entity\x12\x44\n\x12\x64ocument_sentiment\x18\x04 \x01(\x0b\x32(.google.cloud.language.v1beta2.Sentiment\x12\x10\n\x08language\x18\x05 \x01(\t\x12I\n\ncategories\x18\x06 \x03(\x0b\x32\x35.google.cloud.language.v1beta2.ClassificationCategory*8\n\x0c\x45ncodingType\x12\x08\n\x04NONE\x10\x00\x12\x08\n\x04UTF8\x10\x01\x12\t\n\x05UTF16\x10\x02\x12\t\n\x05UTF32\x10\x03\x32\x8a\x0b\n\x0fLanguageService\x12\xd7\x01\n\x10\x41nalyzeSentiment\x12\x36.google.cloud.language.v1beta2.AnalyzeSentimentRequest\x1a\x37.google.cloud.language.v1beta2.AnalyzeSentimentResponse\"R\x82\xd3\xe4\x93\x02(\"#/v1beta2/documents:analyzeSentiment:\x01*\xda\x41\x16\x64ocument,encoding_type\xda\x41\x08\x64ocument\x12\xd3\x01\n\x0f\x41nalyzeEntities\x12\x35.google.cloud.language.v1beta2.AnalyzeEntitiesRequest\x1a\x36.google.cloud.language.v1beta2.AnalyzeEntitiesResponse\"Q\x82\xd3\xe4\x93\x02\'\"\"/v1beta2/documents:analyzeEntities:\x01*\xda\x41\x16\x64ocument,encoding_type\xda\x41\x08\x64ocument\x12\xef\x01\n\x16\x41nalyzeEntitySentiment\x12<.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest\x1a=.google.cloud.language.v1beta2.AnalyzeEntitySentimentResponse\"X\x82\xd3\xe4\x93\x02.\")/v1beta2/documents:analyzeEntitySentiment:\x01*\xda\x41\x16\x64ocument,encoding_type\xda\x41\x08\x64ocument\x12\xcb\x01\n\rAnalyzeSyntax\x12\x33.google.cloud.language.v1beta2.AnalyzeSyntaxRequest\x1a\x34.google.cloud.language.v1beta2.AnalyzeSyntaxResponse\"O\x82\xd3\xe4\x93\x02%\" /v1beta2/documents:analyzeSyntax:\x01*\xda\x41\x16\x64ocument,encoding_type\xda\x41\x08\x64ocument\x12\xae\x01\n\x0c\x43lassifyText\x12\x32.google.cloud.language.v1beta2.ClassifyTextRequest\x1a\x33.google.cloud.language.v1beta2.ClassifyTextResponse\"5\x82\xd3\xe4\x93\x02$\"\x1f/v1beta2/documents:classifyText:\x01*\xda\x41\x08\x64ocument\x12\xd9\x01\n\x0c\x41nnotateText\x12\x32.google.cloud.language.v1beta2.AnnotateTextRequest\x1a\x33.google.cloud.language.v1beta2.AnnotateTextResponse\"`\x82\xd3\xe4\x93\x02$\"\x1f/v1beta2/documents:annotateText:\x01*\xda\x41\x1f\x64ocument,features,encoding_type\xda\x41\x11\x64ocument,features\x1az\xca\x41\x17language.googleapis.com\xd2\x41]https://www.googleapis.com/auth/cloud-language,https://www.googleapis.com/auth/cloud-platformB\x82\x01\n!com.google.cloud.language.v1beta2B\x14LanguageServiceProtoP\x01ZEgoogle.golang.org/genproto/googleapis/cloud/language/v1beta2;languageb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.language.v1beta2.language_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.language.v1beta2B\024LanguageServiceProtoP\001ZEgoogle.golang.org/genproto/googleapis/cloud/language/v1beta2;language'
  _ENTITY_METADATAENTRY._options = None
  _ENTITY_METADATAENTRY._serialized_options = b'8\001'
  _ANALYZESENTIMENTREQUEST.fields_by_name['document']._options = None
  _ANALYZESENTIMENTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _ANALYZEENTITYSENTIMENTREQUEST.fields_by_name['document']._options = None
  _ANALYZEENTITYSENTIMENTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _ANALYZEENTITIESREQUEST.fields_by_name['document']._options = None
  _ANALYZEENTITIESREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _ANALYZESYNTAXREQUEST.fields_by_name['document']._options = None
  _ANALYZESYNTAXREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _CLASSIFYTEXTREQUEST.fields_by_name['document']._options = None
  _CLASSIFYTEXTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _ANNOTATETEXTREQUEST.fields_by_name['document']._options = None
  _ANNOTATETEXTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _ANNOTATETEXTREQUEST.fields_by_name['features']._options = None
  _ANNOTATETEXTREQUEST.fields_by_name['features']._serialized_options = b'\340A\002'
  _LANGUAGESERVICE._options = None
  _LANGUAGESERVICE._serialized_options = b'\312A\027language.googleapis.com\322A]https://www.googleapis.com/auth/cloud-language,https://www.googleapis.com/auth/cloud-platform'
  _LANGUAGESERVICE.methods_by_name['AnalyzeSentiment']._options = None
  _LANGUAGESERVICE.methods_by_name['AnalyzeSentiment']._serialized_options = b'\202\323\344\223\002(\"#/v1beta2/documents:analyzeSentiment:\001*\332A\026document,encoding_type\332A\010document'
  _LANGUAGESERVICE.methods_by_name['AnalyzeEntities']._options = None
  _LANGUAGESERVICE.methods_by_name['AnalyzeEntities']._serialized_options = b'\202\323\344\223\002\'\"\"/v1beta2/documents:analyzeEntities:\001*\332A\026document,encoding_type\332A\010document'
  _LANGUAGESERVICE.methods_by_name['AnalyzeEntitySentiment']._options = None
  _LANGUAGESERVICE.methods_by_name['AnalyzeEntitySentiment']._serialized_options = b'\202\323\344\223\002.\")/v1beta2/documents:analyzeEntitySentiment:\001*\332A\026document,encoding_type\332A\010document'
  _LANGUAGESERVICE.methods_by_name['AnalyzeSyntax']._options = None
  _LANGUAGESERVICE.methods_by_name['AnalyzeSyntax']._serialized_options = b'\202\323\344\223\002%\" /v1beta2/documents:analyzeSyntax:\001*\332A\026document,encoding_type\332A\010document'
  _LANGUAGESERVICE.methods_by_name['ClassifyText']._options = None
  _LANGUAGESERVICE.methods_by_name['ClassifyText']._serialized_options = b'\202\323\344\223\002$\"\037/v1beta2/documents:classifyText:\001*\332A\010document'
  _LANGUAGESERVICE.methods_by_name['AnnotateText']._options = None
  _LANGUAGESERVICE.methods_by_name['AnnotateText']._serialized_options = b'\202\323\344\223\002$\"\037/v1beta2/documents:annotateText:\001*\332A\037document,features,encoding_type\332A\021document,features'
  _ENCODINGTYPE._serialized_start=7029
  _ENCODINGTYPE._serialized_end=7085
  _DOCUMENT._serialized_start=209
  _DOCUMENT._serialized_end=409
  _DOCUMENT_TYPE._serialized_start=345
  _DOCUMENT_TYPE._serialized_end=399
  _SENTENCE._serialized_start=411
  _SENTENCE._serialized_end=537
  _ENTITY._serialized_start=540
  _ENTITY._serialized_end=1071
  _ENTITY_METADATAENTRY._serialized_start=836
  _ENTITY_METADATAENTRY._serialized_end=883
  _ENTITY_TYPE._serialized_start=886
  _ENTITY_TYPE._serialized_end=1071
  _TOKEN._serialized_start=1074
  _TOKEN._serialized_end=1292
  _SENTIMENT._serialized_start=1294
  _SENTIMENT._serialized_end=1339
  _PARTOFSPEECH._serialized_start=1342
  _PARTOFSPEECH._serialized_end=3485
  _PARTOFSPEECH_TAG._serialized_start=2163
  _PARTOFSPEECH_TAG._serialized_end=2304
  _PARTOFSPEECH_ASPECT._serialized_start=2306
  _PARTOFSPEECH_ASPECT._serialized_end=2385
  _PARTOFSPEECH_CASE._serialized_start=2388
  _PARTOFSPEECH_CASE._serialized_end=2636
  _PARTOFSPEECH_FORM._serialized_start=2639
  _PARTOFSPEECH_FORM._serialized_end=2814
  _PARTOFSPEECH_GENDER._serialized_start=2816
  _PARTOFSPEECH_GENDER._serialized_end=2885
  _PARTOFSPEECH_MOOD._serialized_start=2887
  _PARTOFSPEECH_MOOD._serialized_end=3014
  _PARTOFSPEECH_NUMBER._serialized_start=3016
  _PARTOFSPEECH_NUMBER._serialized_end=3080
  _PARTOFSPEECH_PERSON._serialized_start=3082
  _PARTOFSPEECH_PERSON._serialized_end=3166
  _PARTOFSPEECH_PROPER._serialized_start=3168
  _PARTOFSPEECH_PROPER._serialized_end=3224
  _PARTOFSPEECH_RECIPROCITY._serialized_start=3226
  _PARTOFSPEECH_RECIPROCITY._serialized_end=3300
  _PARTOFSPEECH_TENSE._serialized_start=3302
  _PARTOFSPEECH_TENSE._serialized_end=3417
  _PARTOFSPEECH_VOICE._serialized_start=3419
  _PARTOFSPEECH_VOICE._serialized_end=3485
  _DEPENDENCYEDGE._serialized_start=3488
  _DEPENDENCYEDGE._serialized_end=4538
  _DEPENDENCYEDGE_LABEL._serialized_start=3601
  _DEPENDENCYEDGE_LABEL._serialized_end=4538
  _ENTITYMENTION._serialized_start=4541
  _ENTITYMENTION._serialized_end=4787
  _ENTITYMENTION_TYPE._serialized_start=4739
  _ENTITYMENTION_TYPE._serialized_end=4787
  _TEXTSPAN._serialized_start=4789
  _TEXTSPAN._serialized_end=4838
  _CLASSIFICATIONCATEGORY._serialized_start=4840
  _CLASSIFICATIONCATEGORY._serialized_end=4898
  _ANALYZESENTIMENTREQUEST._serialized_start=4901
  _ANALYZESENTIMENTREQUEST._serialized_end=5058
  _ANALYZESENTIMENTRESPONSE._serialized_start=5061
  _ANALYZESENTIMENTRESPONSE._serialized_end=5235
  _ANALYZEENTITYSENTIMENTREQUEST._serialized_start=5238
  _ANALYZEENTITYSENTIMENTREQUEST._serialized_end=5401
  _ANALYZEENTITYSENTIMENTRESPONSE._serialized_start=5403
  _ANALYZEENTITYSENTIMENTRESPONSE._serialized_end=5510
  _ANALYZEENTITIESREQUEST._serialized_start=5513
  _ANALYZEENTITIESREQUEST._serialized_end=5669
  _ANALYZEENTITIESRESPONSE._serialized_start=5671
  _ANALYZEENTITIESRESPONSE._serialized_end=5771
  _ANALYZESYNTAXREQUEST._serialized_start=5774
  _ANALYZESYNTAXREQUEST._serialized_end=5928
  _ANALYZESYNTAXRESPONSE._serialized_start=5931
  _ANALYZESYNTAXRESPONSE._serialized_end=6086
  _CLASSIFYTEXTREQUEST._serialized_start=6088
  _CLASSIFYTEXTREQUEST._serialized_end=6173
  _CLASSIFYTEXTRESPONSE._serialized_start=6175
  _CLASSIFYTEXTRESPONSE._serialized_end=6272
  _ANNOTATETEXTREQUEST._serialized_start=6275
  _ANNOTATETEXTREQUEST._serialized_end=6668
  _ANNOTATETEXTREQUEST_FEATURES._serialized_start=6515
  _ANNOTATETEXTREQUEST_FEATURES._serialized_end=6668
  _ANNOTATETEXTRESPONSE._serialized_start=6671
  _ANNOTATETEXTRESPONSE._serialized_end=7027
  _LANGUAGESERVICE._serialized_start=7088
  _LANGUAGESERVICE._serialized_end=8506
# @@protoc_insertion_point(module_scope)
