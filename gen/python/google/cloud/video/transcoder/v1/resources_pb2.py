# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/video/transcoder/v1/resources.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/video/transcoder/v1/resources.proto\x12 google.cloud.video.transcoder.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x95\x06\n\x03Job\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x16\n\tinput_uri\x18\x02 \x01(\tB\x03\xe0\x41\x04\x12\x17\n\noutput_uri\x18\x03 \x01(\tB\x03\xe0\x41\x04\x12\x1a\n\x0btemplate_id\x18\x04 \x01(\tB\x03\xe0\x41\x04H\x00\x12=\n\x06\x63onfig\x18\x05 \x01(\x0b\x32+.google.cloud.video.transcoder.v1.JobConfigH\x00\x12I\n\x05state\x18\x08 \x01(\x0e\x32\x35.google.cloud.video.transcoder.v1.Job.ProcessingStateB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x33\n\nstart_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12!\n\x19ttl_after_completion_days\x18\x0f \x01(\x05\x12\x41\n\x06labels\x18\x10 \x03(\x0b\x32\x31.google.cloud.video.transcoder.v1.Job.LabelsEntry\x12&\n\x05\x65rror\x18\x11 \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"h\n\x0fProcessingState\x12 \n\x1cPROCESSING_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\r\n\tSUCCEEDED\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04:V\xea\x41S\n\x1dtranscoder.googleapis.com/Job\x12\x32projects/{project}/locations/{location}/jobs/{job}B\x0c\n\njob_config\"\xc3\x02\n\x0bJobTemplate\x12\x0c\n\x04name\x18\x01 \x01(\t\x12;\n\x06\x63onfig\x18\x02 \x01(\x0b\x32+.google.cloud.video.transcoder.v1.JobConfig\x12I\n\x06labels\x18\x03 \x03(\x0b\x32\x39.google.cloud.video.transcoder.v1.JobTemplate.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:o\xea\x41l\n%transcoder.googleapis.com/JobTemplate\x12\x43projects/{project}/locations/{location}/jobTemplates/{job_template}\"\xa0\x05\n\tJobConfig\x12\x37\n\x06inputs\x18\x01 \x03(\x0b\x32\'.google.cloud.video.transcoder.v1.Input\x12=\n\tedit_list\x18\x02 \x03(\x0b\x32*.google.cloud.video.transcoder.v1.EditAtom\x12N\n\x12\x65lementary_streams\x18\x03 \x03(\x0b\x32\x32.google.cloud.video.transcoder.v1.ElementaryStream\x12@\n\x0bmux_streams\x18\x04 \x03(\x0b\x32+.google.cloud.video.transcoder.v1.MuxStream\x12=\n\tmanifests\x18\x05 \x03(\x0b\x32*.google.cloud.video.transcoder.v1.Manifest\x12\x38\n\x06output\x18\x06 \x01(\x0b\x32(.google.cloud.video.transcoder.v1.Output\x12<\n\tad_breaks\x18\x07 \x03(\x0b\x32).google.cloud.video.transcoder.v1.AdBreak\x12O\n\x12pubsub_destination\x18\x08 \x01(\x0b\x32\x33.google.cloud.video.transcoder.v1.PubsubDestination\x12\x44\n\rsprite_sheets\x18\t \x03(\x0b\x32-.google.cloud.video.transcoder.v1.SpriteSheet\x12;\n\x08overlays\x18\n \x03(\x0b\x32).google.cloud.video.transcoder.v1.Overlay\"v\n\x05Input\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x0b\n\x03uri\x18\x02 \x01(\t\x12S\n\x14preprocessing_config\x18\x03 \x01(\x0b\x32\x35.google.cloud.video.transcoder.v1.PreprocessingConfig\"\x15\n\x06Output\x12\x0b\n\x03uri\x18\x01 \x01(\t\"\x91\x01\n\x08\x45\x64itAtom\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x0e\n\x06inputs\x18\x02 \x03(\t\x12\x32\n\x0f\x65nd_time_offset\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x34\n\x11start_time_offset\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\"?\n\x07\x41\x64\x42reak\x12\x34\n\x11start_time_offset\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\"\x87\x02\n\x10\x45lementaryStream\x12\x0b\n\x03key\x18\x04 \x01(\t\x12\x45\n\x0cvideo_stream\x18\x01 \x01(\x0b\x32-.google.cloud.video.transcoder.v1.VideoStreamH\x00\x12\x45\n\x0c\x61udio_stream\x18\x02 \x01(\x0b\x32-.google.cloud.video.transcoder.v1.AudioStreamH\x00\x12\x43\n\x0btext_stream\x18\x03 \x01(\x0b\x32,.google.cloud.video.transcoder.v1.TextStreamH\x00\x42\x13\n\x11\x65lementary_stream\"\xa7\x01\n\tMuxStream\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x11\n\tfile_name\x18\x02 \x01(\t\x12\x11\n\tcontainer\x18\x03 \x01(\t\x12\x1a\n\x12\x65lementary_streams\x18\x04 \x03(\t\x12K\n\x10segment_settings\x18\x05 \x01(\x0b\x32\x31.google.cloud.video.transcoder.v1.SegmentSettings\"\xc5\x01\n\x08Manifest\x12\x11\n\tfile_name\x18\x01 \x01(\t\x12J\n\x04type\x18\x02 \x01(\x0e\x32\x37.google.cloud.video.transcoder.v1.Manifest.ManifestTypeB\x03\xe0\x41\x02\x12\x18\n\x0bmux_streams\x18\x03 \x03(\tB\x03\xe0\x41\x02\"@\n\x0cManifestType\x12\x1d\n\x19MANIFEST_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03HLS\x10\x01\x12\x08\n\x04\x44\x41SH\x10\x02\"\"\n\x11PubsubDestination\x12\r\n\x05topic\x18\x01 \x01(\t\"\xfd\x02\n\x0bSpriteSheet\x12\x0e\n\x06\x66ormat\x18\x01 \x01(\t\x12\x18\n\x0b\x66ile_prefix\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12 \n\x13sprite_width_pixels\x18\x03 \x01(\x05\x42\x03\xe0\x41\x02\x12!\n\x14sprite_height_pixels\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x14\n\x0c\x63olumn_count\x18\x05 \x01(\x05\x12\x11\n\trow_count\x18\x06 \x01(\x05\x12\x34\n\x11start_time_offset\x18\x07 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0f\x65nd_time_offset\x18\x08 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x15\n\x0btotal_count\x18\t \x01(\x05H\x00\x12-\n\x08interval\x18\n \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x12\x0f\n\x07quality\x18\x0b \x01(\x05\x42\x15\n\x13\x65xtraction_strategy\"\x8b\t\n\x07Overlay\x12>\n\x05image\x18\x01 \x01(\x0b\x32/.google.cloud.video.transcoder.v1.Overlay.Image\x12G\n\nanimations\x18\x02 \x03(\x0b\x32\x33.google.cloud.video.transcoder.v1.Overlay.Animation\x1a,\n\x14NormalizedCoordinate\x12\t\n\x01x\x18\x01 \x01(\x01\x12\t\n\x01y\x18\x02 \x01(\x01\x1a|\n\x05Image\x12\x10\n\x03uri\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12R\n\nresolution\x18\x02 \x01(\x0b\x32>.google.cloud.video.transcoder.v1.Overlay.NormalizedCoordinate\x12\r\n\x05\x61lpha\x18\x03 \x01(\x01\x1a\x93\x01\n\x0f\x41nimationStatic\x12J\n\x02xy\x18\x01 \x01(\x0b\x32>.google.cloud.video.transcoder.v1.Overlay.NormalizedCoordinate\x12\x34\n\x11start_time_offset\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x1a\x91\x02\n\rAnimationFade\x12J\n\tfade_type\x18\x01 \x01(\x0e\x32\x32.google.cloud.video.transcoder.v1.Overlay.FadeTypeB\x03\xe0\x41\x02\x12J\n\x02xy\x18\x02 \x01(\x0b\x32>.google.cloud.video.transcoder.v1.Overlay.NormalizedCoordinate\x12\x34\n\x11start_time_offset\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0f\x65nd_time_offset\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x1a\x44\n\x0c\x41nimationEnd\x12\x34\n\x11start_time_offset\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x1a\x98\x02\n\tAnimation\x12U\n\x10\x61nimation_static\x18\x01 \x01(\x0b\x32\x39.google.cloud.video.transcoder.v1.Overlay.AnimationStaticH\x00\x12Q\n\x0e\x61nimation_fade\x18\x02 \x01(\x0b\x32\x37.google.cloud.video.transcoder.v1.Overlay.AnimationFadeH\x00\x12O\n\ranimation_end\x18\x03 \x01(\x0b\x32\x36.google.cloud.video.transcoder.v1.Overlay.AnimationEndH\x00\x42\x10\n\x0e\x61nimation_type\"@\n\x08\x46\x61\x64\x65Type\x12\x19\n\x15\x46\x41\x44\x45_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x46\x41\x44\x45_IN\x10\x01\x12\x0c\n\x08\x46\x41\x44\x45_OUT\x10\x02\"\xf3\n\n\x13PreprocessingConfig\x12J\n\x05\x63olor\x18\x01 \x01(\x0b\x32;.google.cloud.video.transcoder.v1.PreprocessingConfig.Color\x12N\n\x07\x64\x65noise\x18\x02 \x01(\x0b\x32=.google.cloud.video.transcoder.v1.PreprocessingConfig.Denoise\x12N\n\x07\x64\x65\x62lock\x18\x03 \x01(\x0b\x32=.google.cloud.video.transcoder.v1.PreprocessingConfig.Deblock\x12J\n\x05\x61udio\x18\x04 \x01(\x0b\x32;.google.cloud.video.transcoder.v1.PreprocessingConfig.Audio\x12H\n\x04\x63rop\x18\x05 \x01(\x0b\x32:.google.cloud.video.transcoder.v1.PreprocessingConfig.Crop\x12\x46\n\x03pad\x18\x06 \x01(\x0b\x32\x39.google.cloud.video.transcoder.v1.PreprocessingConfig.Pad\x12V\n\x0b\x64\x65interlace\x18\x07 \x01(\x0b\x32\x41.google.cloud.video.transcoder.v1.PreprocessingConfig.Deinterlace\x1a\x41\n\x05\x43olor\x12\x12\n\nsaturation\x18\x01 \x01(\x01\x12\x10\n\x08\x63ontrast\x18\x02 \x01(\x01\x12\x12\n\nbrightness\x18\x03 \x01(\x01\x1a)\n\x07\x44\x65noise\x12\x10\n\x08strength\x18\x01 \x01(\x01\x12\x0c\n\x04tune\x18\x02 \x01(\t\x1a,\n\x07\x44\x65\x62lock\x12\x10\n\x08strength\x18\x01 \x01(\x01\x12\x0f\n\x07\x65nabled\x18\x02 \x01(\x08\x1a<\n\x05\x41udio\x12\x0c\n\x04lufs\x18\x01 \x01(\x01\x12\x12\n\nhigh_boost\x18\x02 \x01(\x08\x12\x11\n\tlow_boost\x18\x03 \x01(\x08\x1a\\\n\x04\x43rop\x12\x12\n\ntop_pixels\x18\x01 \x01(\x05\x12\x15\n\rbottom_pixels\x18\x02 \x01(\x05\x12\x13\n\x0bleft_pixels\x18\x03 \x01(\x05\x12\x14\n\x0cright_pixels\x18\x04 \x01(\x05\x1a[\n\x03Pad\x12\x12\n\ntop_pixels\x18\x01 \x01(\x05\x12\x15\n\rbottom_pixels\x18\x02 \x01(\x05\x12\x13\n\x0bleft_pixels\x18\x03 \x01(\x05\x12\x14\n\x0cright_pixels\x18\x04 \x01(\x05\x1a\xa4\x03\n\x0b\x44\x65interlace\x12^\n\x05yadif\x18\x01 \x01(\x0b\x32M.google.cloud.video.transcoder.v1.PreprocessingConfig.Deinterlace.YadifConfigH\x00\x12^\n\x05\x62wdif\x18\x02 \x01(\x0b\x32M.google.cloud.video.transcoder.v1.PreprocessingConfig.Deinterlace.BwdifConfigH\x00\x1ap\n\x0bYadifConfig\x12\x0c\n\x04mode\x18\x01 \x01(\t\x12#\n\x1b\x64isable_spatial_interlacing\x18\x02 \x01(\x08\x12\x0e\n\x06parity\x18\x03 \x01(\t\x12\x1e\n\x16\x64\x65interlace_all_frames\x18\x04 \x01(\x08\x1aK\n\x0b\x42wdifConfig\x12\x0c\n\x04mode\x18\x01 \x01(\t\x12\x0e\n\x06parity\x18\x02 \x01(\t\x12\x1e\n\x16\x64\x65interlace_all_frames\x18\x03 \x01(\x08\x42\x16\n\x14\x64\x65interlacing_filter\"\x95\x0c\n\x0bVideoStream\x12O\n\x04h264\x18\x01 \x01(\x0b\x32?.google.cloud.video.transcoder.v1.VideoStream.H264CodecSettingsH\x00\x12O\n\x04h265\x18\x02 \x01(\x0b\x32?.google.cloud.video.transcoder.v1.VideoStream.H265CodecSettingsH\x00\x12M\n\x03vp9\x18\x03 \x01(\x0b\x32>.google.cloud.video.transcoder.v1.VideoStream.Vp9CodecSettingsH\x00\x1a\xf9\x03\n\x11H264CodecSettings\x12\x14\n\x0cwidth_pixels\x18\x01 \x01(\x05\x12\x15\n\rheight_pixels\x18\x02 \x01(\x05\x12\x17\n\nframe_rate\x18\x03 \x01(\x01\x42\x03\xe0\x41\x02\x12\x18\n\x0b\x62itrate_bps\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x14\n\x0cpixel_format\x18\x05 \x01(\t\x12\x19\n\x11rate_control_mode\x18\x06 \x01(\t\x12\x11\n\tcrf_level\x18\x07 \x01(\x05\x12\x16\n\x0e\x61llow_open_gop\x18\x08 \x01(\x08\x12\x19\n\x0fgop_frame_count\x18\t \x01(\x05H\x00\x12\x31\n\x0cgop_duration\x18\n \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x12\x17\n\x0f\x65nable_two_pass\x18\x0b \x01(\x08\x12\x15\n\rvbv_size_bits\x18\x0c \x01(\x05\x12\x19\n\x11vbv_fullness_bits\x18\r \x01(\x05\x12\x15\n\rentropy_coder\x18\x0e \x01(\t\x12\x11\n\tb_pyramid\x18\x0f \x01(\x08\x12\x15\n\rb_frame_count\x18\x10 \x01(\x05\x12\x13\n\x0b\x61q_strength\x18\x11 \x01(\x01\x12\x0f\n\x07profile\x18\x12 \x01(\t\x12\x0c\n\x04tune\x18\x13 \x01(\t\x12\x0e\n\x06preset\x18\x14 \x01(\tB\n\n\x08gop_mode\x1a\xe2\x03\n\x11H265CodecSettings\x12\x14\n\x0cwidth_pixels\x18\x01 \x01(\x05\x12\x15\n\rheight_pixels\x18\x02 \x01(\x05\x12\x17\n\nframe_rate\x18\x03 \x01(\x01\x42\x03\xe0\x41\x02\x12\x18\n\x0b\x62itrate_bps\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x14\n\x0cpixel_format\x18\x05 \x01(\t\x12\x19\n\x11rate_control_mode\x18\x06 \x01(\t\x12\x11\n\tcrf_level\x18\x07 \x01(\x05\x12\x16\n\x0e\x61llow_open_gop\x18\x08 \x01(\x08\x12\x19\n\x0fgop_frame_count\x18\t \x01(\x05H\x00\x12\x31\n\x0cgop_duration\x18\n \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x12\x17\n\x0f\x65nable_two_pass\x18\x0b \x01(\x08\x12\x15\n\rvbv_size_bits\x18\x0c \x01(\x05\x12\x19\n\x11vbv_fullness_bits\x18\r \x01(\x05\x12\x11\n\tb_pyramid\x18\x0e \x01(\x08\x12\x15\n\rb_frame_count\x18\x0f \x01(\x05\x12\x13\n\x0b\x61q_strength\x18\x10 \x01(\x01\x12\x0f\n\x07profile\x18\x11 \x01(\t\x12\x0c\n\x04tune\x18\x12 \x01(\t\x12\x0e\n\x06preset\x18\x13 \x01(\tB\n\n\x08gop_mode\x1a\xa1\x02\n\x10Vp9CodecSettings\x12\x14\n\x0cwidth_pixels\x18\x01 \x01(\x05\x12\x15\n\rheight_pixels\x18\x02 \x01(\x05\x12\x17\n\nframe_rate\x18\x03 \x01(\x01\x42\x03\xe0\x41\x02\x12\x18\n\x0b\x62itrate_bps\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x14\n\x0cpixel_format\x18\x05 \x01(\t\x12\x19\n\x11rate_control_mode\x18\x06 \x01(\t\x12\x11\n\tcrf_level\x18\x07 \x01(\x05\x12\x19\n\x0fgop_frame_count\x18\x08 \x01(\x05H\x00\x12\x31\n\x0cgop_duration\x18\t \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x12\x0f\n\x07profile\x18\n \x01(\tB\n\n\x08gop_modeB\x10\n\x0e\x63odec_settings\"\xf1\x02\n\x0b\x41udioStream\x12\r\n\x05\x63odec\x18\x01 \x01(\t\x12\x18\n\x0b\x62itrate_bps\x18\x02 \x01(\x05\x42\x03\xe0\x41\x02\x12\x15\n\rchannel_count\x18\x03 \x01(\x05\x12\x16\n\x0e\x63hannel_layout\x18\x04 \x03(\t\x12K\n\x07mapping\x18\x05 \x03(\x0b\x32:.google.cloud.video.transcoder.v1.AudioStream.AudioMapping\x12\x19\n\x11sample_rate_hertz\x18\x06 \x01(\x05\x1a\xa1\x01\n\x0c\x41udioMapping\x12\x15\n\x08\x61tom_key\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tinput_key\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0binput_track\x18\x03 \x01(\x05\x42\x03\xe0\x41\x02\x12\x1a\n\rinput_channel\x18\x04 \x01(\x05\x42\x03\xe0\x41\x02\x12\x1b\n\x0eoutput_channel\x18\x05 \x01(\x05\x42\x03\xe0\x41\x02\x12\x0f\n\x07gain_db\x18\x06 \x01(\x01\"\xbe\x01\n\nTextStream\x12\r\n\x05\x63odec\x18\x01 \x01(\t\x12I\n\x07mapping\x18\x03 \x03(\x0b\x32\x38.google.cloud.video.transcoder.v1.TextStream.TextMapping\x1aV\n\x0bTextMapping\x12\x15\n\x08\x61tom_key\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tinput_key\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0binput_track\x18\x03 \x01(\x05\x42\x03\xe0\x41\x02\"h\n\x0fSegmentSettings\x12\x33\n\x10segment_duration\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x12 \n\x13individual_segments\x18\x03 \x01(\x08\x42\x03\xe0\x41\x02\x42\x84\x01\n$com.google.cloud.video.transcoder.v1B\x0eResourcesProtoP\x01ZJgoogle.golang.org/genproto/googleapis/cloud/video/transcoder/v1;transcoderb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.video.transcoder.v1.resources_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.video.transcoder.v1B\016ResourcesProtoP\001ZJgoogle.golang.org/genproto/googleapis/cloud/video/transcoder/v1;transcoder'
  _JOB_LABELSENTRY._options = None
  _JOB_LABELSENTRY._serialized_options = b'8\001'
  _JOB.fields_by_name['input_uri']._options = None
  _JOB.fields_by_name['input_uri']._serialized_options = b'\340A\004'
  _JOB.fields_by_name['output_uri']._options = None
  _JOB.fields_by_name['output_uri']._serialized_options = b'\340A\004'
  _JOB.fields_by_name['template_id']._options = None
  _JOB.fields_by_name['template_id']._serialized_options = b'\340A\004'
  _JOB.fields_by_name['state']._options = None
  _JOB.fields_by_name['state']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['create_time']._options = None
  _JOB.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['start_time']._options = None
  _JOB.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['end_time']._options = None
  _JOB.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['error']._options = None
  _JOB.fields_by_name['error']._serialized_options = b'\340A\003'
  _JOB._options = None
  _JOB._serialized_options = b'\352AS\n\035transcoder.googleapis.com/Job\0222projects/{project}/locations/{location}/jobs/{job}'
  _JOBTEMPLATE_LABELSENTRY._options = None
  _JOBTEMPLATE_LABELSENTRY._serialized_options = b'8\001'
  _JOBTEMPLATE._options = None
  _JOBTEMPLATE._serialized_options = b'\352Al\n%transcoder.googleapis.com/JobTemplate\022Cprojects/{project}/locations/{location}/jobTemplates/{job_template}'
  _MANIFEST.fields_by_name['type']._options = None
  _MANIFEST.fields_by_name['type']._serialized_options = b'\340A\002'
  _MANIFEST.fields_by_name['mux_streams']._options = None
  _MANIFEST.fields_by_name['mux_streams']._serialized_options = b'\340A\002'
  _SPRITESHEET.fields_by_name['file_prefix']._options = None
  _SPRITESHEET.fields_by_name['file_prefix']._serialized_options = b'\340A\002'
  _SPRITESHEET.fields_by_name['sprite_width_pixels']._options = None
  _SPRITESHEET.fields_by_name['sprite_width_pixels']._serialized_options = b'\340A\002'
  _SPRITESHEET.fields_by_name['sprite_height_pixels']._options = None
  _SPRITESHEET.fields_by_name['sprite_height_pixels']._serialized_options = b'\340A\002'
  _OVERLAY_IMAGE.fields_by_name['uri']._options = None
  _OVERLAY_IMAGE.fields_by_name['uri']._serialized_options = b'\340A\002'
  _OVERLAY_ANIMATIONFADE.fields_by_name['fade_type']._options = None
  _OVERLAY_ANIMATIONFADE.fields_by_name['fade_type']._serialized_options = b'\340A\002'
  _VIDEOSTREAM_H264CODECSETTINGS.fields_by_name['frame_rate']._options = None
  _VIDEOSTREAM_H264CODECSETTINGS.fields_by_name['frame_rate']._serialized_options = b'\340A\002'
  _VIDEOSTREAM_H264CODECSETTINGS.fields_by_name['bitrate_bps']._options = None
  _VIDEOSTREAM_H264CODECSETTINGS.fields_by_name['bitrate_bps']._serialized_options = b'\340A\002'
  _VIDEOSTREAM_H265CODECSETTINGS.fields_by_name['frame_rate']._options = None
  _VIDEOSTREAM_H265CODECSETTINGS.fields_by_name['frame_rate']._serialized_options = b'\340A\002'
  _VIDEOSTREAM_H265CODECSETTINGS.fields_by_name['bitrate_bps']._options = None
  _VIDEOSTREAM_H265CODECSETTINGS.fields_by_name['bitrate_bps']._serialized_options = b'\340A\002'
  _VIDEOSTREAM_VP9CODECSETTINGS.fields_by_name['frame_rate']._options = None
  _VIDEOSTREAM_VP9CODECSETTINGS.fields_by_name['frame_rate']._serialized_options = b'\340A\002'
  _VIDEOSTREAM_VP9CODECSETTINGS.fields_by_name['bitrate_bps']._options = None
  _VIDEOSTREAM_VP9CODECSETTINGS.fields_by_name['bitrate_bps']._serialized_options = b'\340A\002'
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['atom_key']._options = None
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['atom_key']._serialized_options = b'\340A\002'
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['input_key']._options = None
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['input_key']._serialized_options = b'\340A\002'
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['input_track']._options = None
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['input_track']._serialized_options = b'\340A\002'
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['input_channel']._options = None
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['input_channel']._serialized_options = b'\340A\002'
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['output_channel']._options = None
  _AUDIOSTREAM_AUDIOMAPPING.fields_by_name['output_channel']._serialized_options = b'\340A\002'
  _AUDIOSTREAM.fields_by_name['bitrate_bps']._options = None
  _AUDIOSTREAM.fields_by_name['bitrate_bps']._serialized_options = b'\340A\002'
  _TEXTSTREAM_TEXTMAPPING.fields_by_name['atom_key']._options = None
  _TEXTSTREAM_TEXTMAPPING.fields_by_name['atom_key']._serialized_options = b'\340A\002'
  _TEXTSTREAM_TEXTMAPPING.fields_by_name['input_key']._options = None
  _TEXTSTREAM_TEXTMAPPING.fields_by_name['input_key']._serialized_options = b'\340A\002'
  _TEXTSTREAM_TEXTMAPPING.fields_by_name['input_track']._options = None
  _TEXTSTREAM_TEXTMAPPING.fields_by_name['input_track']._serialized_options = b'\340A\002'
  _SEGMENTSETTINGS.fields_by_name['individual_segments']._options = None
  _SEGMENTSETTINGS.fields_by_name['individual_segments']._serialized_options = b'\340A\002'
  _JOB._serialized_start=237
  _JOB._serialized_end=1026
  _JOB_LABELSENTRY._serialized_start=773
  _JOB_LABELSENTRY._serialized_end=818
  _JOB_PROCESSINGSTATE._serialized_start=820
  _JOB_PROCESSINGSTATE._serialized_end=924
  _JOBTEMPLATE._serialized_start=1029
  _JOBTEMPLATE._serialized_end=1352
  _JOBTEMPLATE_LABELSENTRY._serialized_start=773
  _JOBTEMPLATE_LABELSENTRY._serialized_end=818
  _JOBCONFIG._serialized_start=1355
  _JOBCONFIG._serialized_end=2027
  _INPUT._serialized_start=2029
  _INPUT._serialized_end=2147
  _OUTPUT._serialized_start=2149
  _OUTPUT._serialized_end=2170
  _EDITATOM._serialized_start=2173
  _EDITATOM._serialized_end=2318
  _ADBREAK._serialized_start=2320
  _ADBREAK._serialized_end=2383
  _ELEMENTARYSTREAM._serialized_start=2386
  _ELEMENTARYSTREAM._serialized_end=2649
  _MUXSTREAM._serialized_start=2652
  _MUXSTREAM._serialized_end=2819
  _MANIFEST._serialized_start=2822
  _MANIFEST._serialized_end=3019
  _MANIFEST_MANIFESTTYPE._serialized_start=2955
  _MANIFEST_MANIFESTTYPE._serialized_end=3019
  _PUBSUBDESTINATION._serialized_start=3021
  _PUBSUBDESTINATION._serialized_end=3055
  _SPRITESHEET._serialized_start=3058
  _SPRITESHEET._serialized_end=3439
  _OVERLAY._serialized_start=3442
  _OVERLAY._serialized_end=4605
  _OVERLAY_NORMALIZEDCOORDINATE._serialized_start=3590
  _OVERLAY_NORMALIZEDCOORDINATE._serialized_end=3634
  _OVERLAY_IMAGE._serialized_start=3636
  _OVERLAY_IMAGE._serialized_end=3760
  _OVERLAY_ANIMATIONSTATIC._serialized_start=3763
  _OVERLAY_ANIMATIONSTATIC._serialized_end=3910
  _OVERLAY_ANIMATIONFADE._serialized_start=3913
  _OVERLAY_ANIMATIONFADE._serialized_end=4186
  _OVERLAY_ANIMATIONEND._serialized_start=4188
  _OVERLAY_ANIMATIONEND._serialized_end=4256
  _OVERLAY_ANIMATION._serialized_start=4259
  _OVERLAY_ANIMATION._serialized_end=4539
  _OVERLAY_FADETYPE._serialized_start=4541
  _OVERLAY_FADETYPE._serialized_end=4605
  _PREPROCESSINGCONFIG._serialized_start=4608
  _PREPROCESSINGCONFIG._serialized_end=6003
  _PREPROCESSINGCONFIG_COLOR._serialized_start=5177
  _PREPROCESSINGCONFIG_COLOR._serialized_end=5242
  _PREPROCESSINGCONFIG_DENOISE._serialized_start=5244
  _PREPROCESSINGCONFIG_DENOISE._serialized_end=5285
  _PREPROCESSINGCONFIG_DEBLOCK._serialized_start=5287
  _PREPROCESSINGCONFIG_DEBLOCK._serialized_end=5331
  _PREPROCESSINGCONFIG_AUDIO._serialized_start=5333
  _PREPROCESSINGCONFIG_AUDIO._serialized_end=5393
  _PREPROCESSINGCONFIG_CROP._serialized_start=5395
  _PREPROCESSINGCONFIG_CROP._serialized_end=5487
  _PREPROCESSINGCONFIG_PAD._serialized_start=5489
  _PREPROCESSINGCONFIG_PAD._serialized_end=5580
  _PREPROCESSINGCONFIG_DEINTERLACE._serialized_start=5583
  _PREPROCESSINGCONFIG_DEINTERLACE._serialized_end=6003
  _PREPROCESSINGCONFIG_DEINTERLACE_YADIFCONFIG._serialized_start=5790
  _PREPROCESSINGCONFIG_DEINTERLACE_YADIFCONFIG._serialized_end=5902
  _PREPROCESSINGCONFIG_DEINTERLACE_BWDIFCONFIG._serialized_start=5904
  _PREPROCESSINGCONFIG_DEINTERLACE_BWDIFCONFIG._serialized_end=5979
  _VIDEOSTREAM._serialized_start=6006
  _VIDEOSTREAM._serialized_end=7563
  _VIDEOSTREAM_H264CODECSETTINGS._serialized_start=6263
  _VIDEOSTREAM_H264CODECSETTINGS._serialized_end=6768
  _VIDEOSTREAM_H265CODECSETTINGS._serialized_start=6771
  _VIDEOSTREAM_H265CODECSETTINGS._serialized_end=7253
  _VIDEOSTREAM_VP9CODECSETTINGS._serialized_start=7256
  _VIDEOSTREAM_VP9CODECSETTINGS._serialized_end=7545
  _AUDIOSTREAM._serialized_start=7566
  _AUDIOSTREAM._serialized_end=7935
  _AUDIOSTREAM_AUDIOMAPPING._serialized_start=7774
  _AUDIOSTREAM_AUDIOMAPPING._serialized_end=7935
  _TEXTSTREAM._serialized_start=7938
  _TEXTSTREAM._serialized_end=8128
  _TEXTSTREAM_TEXTMAPPING._serialized_start=8042
  _TEXTSTREAM_TEXTMAPPING._serialized_end=8128
  _SEGMENTSETTINGS._serialized_start=8130
  _SEGMENTSETTINGS._serialized_end=8234
# @@protoc_insertion_point(module_scope)