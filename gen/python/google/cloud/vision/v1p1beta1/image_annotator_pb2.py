# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/vision/v1p1beta1/image_annotator.proto
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
from google.cloud.vision.v1p1beta1 import geometry_pb2 as google_dot_cloud_dot_vision_dot_v1p1beta1_dot_geometry__pb2
from google.cloud.vision.v1p1beta1 import text_annotation_pb2 as google_dot_cloud_dot_vision_dot_v1p1beta1_dot_text__annotation__pb2
from google.cloud.vision.v1p1beta1 import web_detection_pb2 as google_dot_cloud_dot_vision_dot_v1p1beta1_dot_web__detection__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.type import color_pb2 as google_dot_type_dot_color__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/vision/v1p1beta1/image_annotator.proto\x12\x1dgoogle.cloud.vision.v1p1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a,google/cloud/vision/v1p1beta1/geometry.proto\x1a\x33google/cloud/vision/v1p1beta1/text_annotation.proto\x1a\x31google/cloud/vision/v1p1beta1/web_detection.proto\x1a\x17google/rpc/status.proto\x1a\x17google/type/color.proto\x1a\x18google/type/latlng.proto\"\xe1\x02\n\x07\x46\x65\x61ture\x12\x39\n\x04type\x18\x01 \x01(\x0e\x32+.google.cloud.vision.v1p1beta1.Feature.Type\x12\x13\n\x0bmax_results\x18\x02 \x01(\x05\x12\r\n\x05model\x18\x03 \x01(\t\"\xf6\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x12\n\x0e\x46\x41\x43\x45_DETECTION\x10\x01\x12\x16\n\x12LANDMARK_DETECTION\x10\x02\x12\x12\n\x0eLOGO_DETECTION\x10\x03\x12\x13\n\x0fLABEL_DETECTION\x10\x04\x12\x12\n\x0eTEXT_DETECTION\x10\x05\x12\x1b\n\x17\x44OCUMENT_TEXT_DETECTION\x10\x0b\x12\x19\n\x15SAFE_SEARCH_DETECTION\x10\x06\x12\x14\n\x10IMAGE_PROPERTIES\x10\x07\x12\x0e\n\nCROP_HINTS\x10\t\x12\x11\n\rWEB_DETECTION\x10\n\"7\n\x0bImageSource\x12\x15\n\rgcs_image_uri\x18\x01 \x01(\t\x12\x11\n\timage_uri\x18\x02 \x01(\t\"T\n\x05Image\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\x0c\x12:\n\x06source\x18\x02 \x01(\x0b\x32*.google.cloud.vision.v1p1beta1.ImageSource\"\x9b\x0e\n\x0e\x46\x61\x63\x65\x41nnotation\x12\x42\n\rbounding_poly\x18\x01 \x01(\x0b\x32+.google.cloud.vision.v1p1beta1.BoundingPoly\x12\x45\n\x10\x66\x64_bounding_poly\x18\x02 \x01(\x0b\x32+.google.cloud.vision.v1p1beta1.BoundingPoly\x12I\n\tlandmarks\x18\x03 \x03(\x0b\x32\x36.google.cloud.vision.v1p1beta1.FaceAnnotation.Landmark\x12\x12\n\nroll_angle\x18\x04 \x01(\x02\x12\x11\n\tpan_angle\x18\x05 \x01(\x02\x12\x12\n\ntilt_angle\x18\x06 \x01(\x02\x12\x1c\n\x14\x64\x65tection_confidence\x18\x07 \x01(\x02\x12\x1e\n\x16landmarking_confidence\x18\x08 \x01(\x02\x12\x41\n\x0ejoy_likelihood\x18\t \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x44\n\x11sorrow_likelihood\x18\n \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x43\n\x10\x61nger_likelihood\x18\x0b \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x46\n\x13surprise_likelihood\x18\x0c \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12K\n\x18under_exposed_likelihood\x18\r \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x45\n\x12\x62lurred_likelihood\x18\x0e \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x46\n\x13headwear_likelihood\x18\x0f \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x1a\xc7\x07\n\x08Landmark\x12I\n\x04type\x18\x03 \x01(\x0e\x32;.google.cloud.vision.v1p1beta1.FaceAnnotation.Landmark.Type\x12\x39\n\x08position\x18\x04 \x01(\x0b\x32\'.google.cloud.vision.v1p1beta1.Position\"\xb4\x06\n\x04Type\x12\x14\n\x10UNKNOWN_LANDMARK\x10\x00\x12\x0c\n\x08LEFT_EYE\x10\x01\x12\r\n\tRIGHT_EYE\x10\x02\x12\x18\n\x14LEFT_OF_LEFT_EYEBROW\x10\x03\x12\x19\n\x15RIGHT_OF_LEFT_EYEBROW\x10\x04\x12\x19\n\x15LEFT_OF_RIGHT_EYEBROW\x10\x05\x12\x1a\n\x16RIGHT_OF_RIGHT_EYEBROW\x10\x06\x12\x19\n\x15MIDPOINT_BETWEEN_EYES\x10\x07\x12\x0c\n\x08NOSE_TIP\x10\x08\x12\r\n\tUPPER_LIP\x10\t\x12\r\n\tLOWER_LIP\x10\n\x12\x0e\n\nMOUTH_LEFT\x10\x0b\x12\x0f\n\x0bMOUTH_RIGHT\x10\x0c\x12\x10\n\x0cMOUTH_CENTER\x10\r\x12\x15\n\x11NOSE_BOTTOM_RIGHT\x10\x0e\x12\x14\n\x10NOSE_BOTTOM_LEFT\x10\x0f\x12\x16\n\x12NOSE_BOTTOM_CENTER\x10\x10\x12\x19\n\x15LEFT_EYE_TOP_BOUNDARY\x10\x11\x12\x19\n\x15LEFT_EYE_RIGHT_CORNER\x10\x12\x12\x1c\n\x18LEFT_EYE_BOTTOM_BOUNDARY\x10\x13\x12\x18\n\x14LEFT_EYE_LEFT_CORNER\x10\x14\x12\x1a\n\x16RIGHT_EYE_TOP_BOUNDARY\x10\x15\x12\x1a\n\x16RIGHT_EYE_RIGHT_CORNER\x10\x16\x12\x1d\n\x19RIGHT_EYE_BOTTOM_BOUNDARY\x10\x17\x12\x19\n\x15RIGHT_EYE_LEFT_CORNER\x10\x18\x12\x1f\n\x1bLEFT_EYEBROW_UPPER_MIDPOINT\x10\x19\x12 \n\x1cRIGHT_EYEBROW_UPPER_MIDPOINT\x10\x1a\x12\x14\n\x10LEFT_EAR_TRAGION\x10\x1b\x12\x15\n\x11RIGHT_EAR_TRAGION\x10\x1c\x12\x12\n\x0eLEFT_EYE_PUPIL\x10\x1d\x12\x13\n\x0fRIGHT_EYE_PUPIL\x10\x1e\x12\x15\n\x11\x46OREHEAD_GLABELLA\x10\x1f\x12\x11\n\rCHIN_GNATHION\x10 \x12\x14\n\x10\x43HIN_LEFT_GONION\x10!\x12\x15\n\x11\x43HIN_RIGHT_GONION\x10\"\"4\n\x0cLocationInfo\x12$\n\x07lat_lng\x18\x01 \x01(\x0b\x32\x13.google.type.LatLng\"=\n\x08Property\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t\x12\x14\n\x0cuint64_value\x18\x03 \x01(\x04\"\xbc\x02\n\x10\x45ntityAnnotation\x12\x0b\n\x03mid\x18\x01 \x01(\t\x12\x0e\n\x06locale\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\r\n\x05score\x18\x04 \x01(\x02\x12\x12\n\nconfidence\x18\x05 \x01(\x02\x12\x12\n\ntopicality\x18\x06 \x01(\x02\x12\x42\n\rbounding_poly\x18\x07 \x01(\x0b\x32+.google.cloud.vision.v1p1beta1.BoundingPoly\x12>\n\tlocations\x18\x08 \x03(\x0b\x32+.google.cloud.vision.v1p1beta1.LocationInfo\x12;\n\nproperties\x18\t \x03(\x0b\x32\'.google.cloud.vision.v1p1beta1.Property\"\xbc\x02\n\x14SafeSearchAnnotation\x12\x38\n\x05\x61\x64ult\x18\x01 \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x38\n\x05spoof\x18\x02 \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12:\n\x07medical\x18\x03 \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12;\n\x08violence\x18\x04 \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\x12\x37\n\x04racy\x18\t \x01(\x0e\x32).google.cloud.vision.v1p1beta1.Likelihood\"a\n\x0bLatLongRect\x12(\n\x0bmin_lat_lng\x18\x01 \x01(\x0b\x32\x13.google.type.LatLng\x12(\n\x0bmax_lat_lng\x18\x02 \x01(\x0b\x32\x13.google.type.LatLng\"U\n\tColorInfo\x12!\n\x05\x63olor\x18\x01 \x01(\x0b\x32\x12.google.type.Color\x12\r\n\x05score\x18\x02 \x01(\x02\x12\x16\n\x0epixel_fraction\x18\x03 \x01(\x02\"T\n\x18\x44ominantColorsAnnotation\x12\x38\n\x06\x63olors\x18\x01 \x03(\x0b\x32(.google.cloud.vision.v1p1beta1.ColorInfo\"c\n\x0fImageProperties\x12P\n\x0f\x64ominant_colors\x18\x01 \x01(\x0b\x32\x37.google.cloud.vision.v1p1beta1.DominantColorsAnnotation\"\x7f\n\x08\x43ropHint\x12\x42\n\rbounding_poly\x18\x01 \x01(\x0b\x32+.google.cloud.vision.v1p1beta1.BoundingPoly\x12\x12\n\nconfidence\x18\x02 \x01(\x02\x12\x1b\n\x13importance_fraction\x18\x03 \x01(\x02\"R\n\x13\x43ropHintsAnnotation\x12;\n\ncrop_hints\x18\x01 \x03(\x0b\x32\'.google.cloud.vision.v1p1beta1.CropHint\"(\n\x0f\x43ropHintsParams\x12\x15\n\raspect_ratios\x18\x01 \x03(\x02\"1\n\x12WebDetectionParams\x12\x1b\n\x13include_geo_results\x18\x02 \x01(\x08\"c\n\x13TextDetectionParams\x12.\n&enable_text_detection_confidence_score\x18\t \x01(\x08\x12\x1c\n\x14\x61\x64vanced_ocr_options\x18\x0b \x03(\t\"\xd8\x02\n\x0cImageContext\x12\x41\n\rlat_long_rect\x18\x01 \x01(\x0b\x32*.google.cloud.vision.v1p1beta1.LatLongRect\x12\x16\n\x0elanguage_hints\x18\x02 \x03(\t\x12I\n\x11\x63rop_hints_params\x18\x04 \x01(\x0b\x32..google.cloud.vision.v1p1beta1.CropHintsParams\x12O\n\x14web_detection_params\x18\x06 \x01(\x0b\x32\x31.google.cloud.vision.v1p1beta1.WebDetectionParams\x12Q\n\x15text_detection_params\x18\x0c \x01(\x0b\x32\x32.google.cloud.vision.v1p1beta1.TextDetectionParams\"\xc9\x01\n\x14\x41nnotateImageRequest\x12\x33\n\x05image\x18\x01 \x01(\x0b\x32$.google.cloud.vision.v1p1beta1.Image\x12\x38\n\x08\x66\x65\x61tures\x18\x02 \x03(\x0b\x32&.google.cloud.vision.v1p1beta1.Feature\x12\x42\n\rimage_context\x18\x03 \x01(\x0b\x32+.google.cloud.vision.v1p1beta1.ImageContext\"\xc2\x06\n\x15\x41nnotateImageResponse\x12G\n\x10\x66\x61\x63\x65_annotations\x18\x01 \x03(\x0b\x32-.google.cloud.vision.v1p1beta1.FaceAnnotation\x12M\n\x14landmark_annotations\x18\x02 \x03(\x0b\x32/.google.cloud.vision.v1p1beta1.EntityAnnotation\x12I\n\x10logo_annotations\x18\x03 \x03(\x0b\x32/.google.cloud.vision.v1p1beta1.EntityAnnotation\x12J\n\x11label_annotations\x18\x04 \x03(\x0b\x32/.google.cloud.vision.v1p1beta1.EntityAnnotation\x12I\n\x10text_annotations\x18\x05 \x03(\x0b\x32/.google.cloud.vision.v1p1beta1.EntityAnnotation\x12K\n\x14\x66ull_text_annotation\x18\x0c \x01(\x0b\x32-.google.cloud.vision.v1p1beta1.TextAnnotation\x12S\n\x16safe_search_annotation\x18\x06 \x01(\x0b\x32\x33.google.cloud.vision.v1p1beta1.SafeSearchAnnotation\x12S\n\x1bimage_properties_annotation\x18\x08 \x01(\x0b\x32..google.cloud.vision.v1p1beta1.ImageProperties\x12Q\n\x15\x63rop_hints_annotation\x18\x0b \x01(\x0b\x32\x32.google.cloud.vision.v1p1beta1.CropHintsAnnotation\x12\x42\n\rweb_detection\x18\r \x01(\x0b\x32+.google.cloud.vision.v1p1beta1.WebDetection\x12!\n\x05\x65rror\x18\t \x01(\x0b\x32\x12.google.rpc.Status\"h\n\x1a\x42\x61tchAnnotateImagesRequest\x12J\n\x08requests\x18\x01 \x03(\x0b\x32\x33.google.cloud.vision.v1p1beta1.AnnotateImageRequestB\x03\xe0\x41\x02\"f\n\x1b\x42\x61tchAnnotateImagesResponse\x12G\n\tresponses\x18\x01 \x03(\x0b\x32\x34.google.cloud.vision.v1p1beta1.AnnotateImageResponse*e\n\nLikelihood\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x11\n\rVERY_UNLIKELY\x10\x01\x12\x0c\n\x08UNLIKELY\x10\x02\x12\x0c\n\x08POSSIBLE\x10\x03\x12\n\n\x06LIKELY\x10\x04\x12\x0f\n\x0bVERY_LIKELY\x10\x05\x32\xc9\x02\n\x0eImageAnnotator\x12\xbe\x01\n\x13\x42\x61tchAnnotateImages\x12\x39.google.cloud.vision.v1p1beta1.BatchAnnotateImagesRequest\x1a:.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse\"0\x82\xd3\xe4\x93\x02\x1f\"\x1a/v1p1beta1/images:annotate:\x01*\xda\x41\x08requests\x1av\xca\x41\x15vision.googleapis.com\xd2\x41[https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-visionB\x82\x01\n!com.google.cloud.vision.v1p1beta1B\x13ImageAnnotatorProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p1beta1;vision\xf8\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.vision.v1p1beta1.image_annotator_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.vision.v1p1beta1B\023ImageAnnotatorProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p1beta1;vision\370\001\001'
  _BATCHANNOTATEIMAGESREQUEST.fields_by_name['requests']._options = None
  _BATCHANNOTATEIMAGESREQUEST.fields_by_name['requests']._serialized_options = b'\340A\002'
  _IMAGEANNOTATOR._options = None
  _IMAGEANNOTATOR._serialized_options = b'\312A\025vision.googleapis.com\322A[https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-vision'
  _IMAGEANNOTATOR.methods_by_name['BatchAnnotateImages']._options = None
  _IMAGEANNOTATOR.methods_by_name['BatchAnnotateImages']._serialized_options = b'\202\323\344\223\002\037\"\032/v1p1beta1/images:annotate:\001*\332A\010requests'
  _LIKELIHOOD._serialized_start=5854
  _LIKELIHOOD._serialized_end=5955
  _FEATURE._serialized_start=401
  _FEATURE._serialized_end=754
  _FEATURE_TYPE._serialized_start=508
  _FEATURE_TYPE._serialized_end=754
  _IMAGESOURCE._serialized_start=756
  _IMAGESOURCE._serialized_end=811
  _IMAGE._serialized_start=813
  _IMAGE._serialized_end=897
  _FACEANNOTATION._serialized_start=900
  _FACEANNOTATION._serialized_end=2719
  _FACEANNOTATION_LANDMARK._serialized_start=1752
  _FACEANNOTATION_LANDMARK._serialized_end=2719
  _FACEANNOTATION_LANDMARK_TYPE._serialized_start=1899
  _FACEANNOTATION_LANDMARK_TYPE._serialized_end=2719
  _LOCATIONINFO._serialized_start=2721
  _LOCATIONINFO._serialized_end=2773
  _PROPERTY._serialized_start=2775
  _PROPERTY._serialized_end=2836
  _ENTITYANNOTATION._serialized_start=2839
  _ENTITYANNOTATION._serialized_end=3155
  _SAFESEARCHANNOTATION._serialized_start=3158
  _SAFESEARCHANNOTATION._serialized_end=3474
  _LATLONGRECT._serialized_start=3476
  _LATLONGRECT._serialized_end=3573
  _COLORINFO._serialized_start=3575
  _COLORINFO._serialized_end=3660
  _DOMINANTCOLORSANNOTATION._serialized_start=3662
  _DOMINANTCOLORSANNOTATION._serialized_end=3746
  _IMAGEPROPERTIES._serialized_start=3748
  _IMAGEPROPERTIES._serialized_end=3847
  _CROPHINT._serialized_start=3849
  _CROPHINT._serialized_end=3976
  _CROPHINTSANNOTATION._serialized_start=3978
  _CROPHINTSANNOTATION._serialized_end=4060
  _CROPHINTSPARAMS._serialized_start=4062
  _CROPHINTSPARAMS._serialized_end=4102
  _WEBDETECTIONPARAMS._serialized_start=4104
  _WEBDETECTIONPARAMS._serialized_end=4153
  _TEXTDETECTIONPARAMS._serialized_start=4155
  _TEXTDETECTIONPARAMS._serialized_end=4254
  _IMAGECONTEXT._serialized_start=4257
  _IMAGECONTEXT._serialized_end=4601
  _ANNOTATEIMAGEREQUEST._serialized_start=4604
  _ANNOTATEIMAGEREQUEST._serialized_end=4805
  _ANNOTATEIMAGERESPONSE._serialized_start=4808
  _ANNOTATEIMAGERESPONSE._serialized_end=5642
  _BATCHANNOTATEIMAGESREQUEST._serialized_start=5644
  _BATCHANNOTATEIMAGESREQUEST._serialized_end=5748
  _BATCHANNOTATEIMAGESRESPONSE._serialized_start=5750
  _BATCHANNOTATEIMAGESRESPONSE._serialized_end=5852
  _IMAGEANNOTATOR._serialized_start=5958
  _IMAGEANNOTATOR._serialized_end=6287
# @@protoc_insertion_point(module_scope)
