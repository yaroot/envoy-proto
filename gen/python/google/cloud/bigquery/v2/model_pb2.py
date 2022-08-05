# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/v2/model.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.bigquery.v2 import encryption_config_pb2 as google_dot_cloud_dot_bigquery_dot_v2_dot_encryption__config__pb2
from google.cloud.bigquery.v2 import model_reference_pb2 as google_dot_cloud_dot_bigquery_dot_v2_dot_model__reference__pb2
from google.cloud.bigquery.v2 import standard_sql_pb2 as google_dot_cloud_dot_bigquery_dot_v2_dot_standard__sql__pb2
from google.cloud.bigquery.v2 import table_reference_pb2 as google_dot_cloud_dot_bigquery_dot_v2_dot_table__reference__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$google/cloud/bigquery/v2/model.proto\x12\x18google.cloud.bigquery.v2\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x30google/cloud/bigquery/v2/encryption_config.proto\x1a.google/cloud/bigquery/v2/model_reference.proto\x1a+google/cloud/bigquery/v2/standard_sql.proto\x1a.google/cloud/bigquery/v2/table_reference.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xc7_\n\x05Model\x12\x11\n\x04\x65tag\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x46\n\x0fmodel_reference\x18\x02 \x01(\x0b\x32(.google.cloud.bigquery.v2.ModelReferenceB\x03\xe0\x41\x02\x12\x1a\n\rcreation_time\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03\x12\x1f\n\x12last_modified_time\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x64\x65scription\x18\x0c \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rfriendly_name\x18\x0e \x01(\tB\x03\xe0\x41\x01\x12;\n\x06labels\x18\x0f \x03(\x0b\x32+.google.cloud.bigquery.v2.Model.LabelsEntry\x12\x1c\n\x0f\x65xpiration_time\x18\x10 \x01(\x03\x42\x03\xe0\x41\x01\x12\x15\n\x08location\x18\r \x01(\tB\x03\xe0\x41\x03\x12S\n\x18\x65ncryption_configuration\x18\x11 \x01(\x0b\x32\x31.google.cloud.bigquery.v2.EncryptionConfiguration\x12\x42\n\nmodel_type\x18\x07 \x01(\x0e\x32).google.cloud.bigquery.v2.Model.ModelTypeB\x03\xe0\x41\x03\x12G\n\rtraining_runs\x18\t \x03(\x0b\x32+.google.cloud.bigquery.v2.Model.TrainingRunB\x03\xe0\x41\x03\x12H\n\x0f\x66\x65\x61ture_columns\x18\n \x03(\x0b\x32*.google.cloud.bigquery.v2.StandardSqlFieldB\x03\xe0\x41\x03\x12\x46\n\rlabel_columns\x18\x0b \x03(\x0b\x32*.google.cloud.bigquery.v2.StandardSqlFieldB\x03\xe0\x41\x03\x12\x19\n\rbest_trial_id\x18\x13 \x01(\x03\x42\x02\x18\x01\x1a\xa0\x01\n\x0eSeasonalPeriod\"\x8d\x01\n\x12SeasonalPeriodType\x12$\n SEASONAL_PERIOD_TYPE_UNSPECIFIED\x10\x00\x12\x12\n\x0eNO_SEASONALITY\x10\x01\x12\t\n\x05\x44\x41ILY\x10\x02\x12\n\n\x06WEEKLY\x10\x03\x12\x0b\n\x07MONTHLY\x10\x04\x12\r\n\tQUARTERLY\x10\x05\x12\n\n\x06YEARLY\x10\x06\x1a\x87\x01\n\x0bKmeansEnums\"x\n\x1aKmeansInitializationMethod\x12,\n(KMEANS_INITIALIZATION_METHOD_UNSPECIFIED\x10\x00\x12\n\n\x06RANDOM\x10\x01\x12\n\n\x06\x43USTOM\x10\x02\x12\x14\n\x10KMEANS_PLUS_PLUS\x10\x03\x1a\xb4\x02\n\x11RegressionMetrics\x12\x39\n\x13mean_absolute_error\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x38\n\x12mean_squared_error\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12<\n\x16mean_squared_log_error\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12;\n\x15median_absolute_error\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12/\n\tr_squared\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x1a\xef\x02\n\x1e\x41ggregateClassificationMetrics\x12/\n\tprecision\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12,\n\x06recall\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12.\n\x08\x61\x63\x63uracy\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12/\n\tthreshold\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12.\n\x08\x66\x31_score\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12.\n\x08log_loss\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12-\n\x07roc_auc\x18\x07 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x1a\x9f\x06\n\x1b\x42inaryClassificationMetrics\x12h\n aggregate_classification_metrics\x18\x01 \x01(\x0b\x32>.google.cloud.bigquery.v2.Model.AggregateClassificationMetrics\x12w\n\x1c\x62inary_confusion_matrix_list\x18\x02 \x03(\x0b\x32Q.google.cloud.bigquery.v2.Model.BinaryClassificationMetrics.BinaryConfusionMatrix\x12\x16\n\x0epositive_label\x18\x03 \x01(\t\x12\x16\n\x0enegative_label\x18\x04 \x01(\t\x1a\xec\x03\n\x15\x42inaryConfusionMatrix\x12>\n\x18positive_class_threshold\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x33\n\x0etrue_positives\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x34\n\x0f\x66\x61lse_positives\x18\x03 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x33\n\x0etrue_negatives\x18\x04 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x34\n\x0f\x66\x61lse_negatives\x18\x05 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12/\n\tprecision\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12,\n\x06recall\x18\x07 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12.\n\x08\x66\x31_score\x18\x08 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12.\n\x08\x61\x63\x63uracy\x18\t \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x1a\x87\x05\n\x1fMultiClassClassificationMetrics\x12h\n aggregate_classification_metrics\x18\x01 \x01(\x0b\x32>.google.cloud.bigquery.v2.Model.AggregateClassificationMetrics\x12n\n\x15\x63onfusion_matrix_list\x18\x02 \x03(\x0b\x32O.google.cloud.bigquery.v2.Model.MultiClassClassificationMetrics.ConfusionMatrix\x1a\x89\x03\n\x0f\x43onfusionMatrix\x12:\n\x14\x63onfidence_threshold\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x61\n\x04rows\x18\x02 \x03(\x0b\x32S.google.cloud.bigquery.v2.Model.MultiClassClassificationMetrics.ConfusionMatrix.Row\x1aQ\n\x05\x45ntry\x12\x17\n\x0fpredicted_label\x18\x01 \x01(\t\x12/\n\nitem_count\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x1a\x83\x01\n\x03Row\x12\x14\n\x0c\x61\x63tual_label\x18\x01 \x01(\t\x12\x66\n\x07\x65ntries\x18\x02 \x03(\x0b\x32U.google.cloud.bigquery.v2.Model.MultiClassClassificationMetrics.ConfusionMatrix.Entry\x1a\xcb\x06\n\x11\x43lusteringMetrics\x12:\n\x14\x64\x61vies_bouldin_index\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12;\n\x15mean_squared_distance\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12K\n\x08\x63lusters\x18\x03 \x03(\x0b\x32\x39.google.cloud.bigquery.v2.Model.ClusteringMetrics.Cluster\x1a\xef\x04\n\x07\x43luster\x12\x13\n\x0b\x63\x65ntroid_id\x18\x01 \x01(\x03\x12^\n\x0e\x66\x65\x61ture_values\x18\x02 \x03(\x0b\x32\x46.google.cloud.bigquery.v2.Model.ClusteringMetrics.Cluster.FeatureValue\x12*\n\x05\x63ount\x18\x03 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x1a\xc2\x03\n\x0c\x46\x65\x61tureValue\x12\x16\n\x0e\x66\x65\x61ture_column\x18\x01 \x01(\t\x12\x37\n\x0fnumerical_value\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValueH\x00\x12t\n\x11\x63\x61tegorical_value\x18\x03 \x01(\x0b\x32W.google.cloud.bigquery.v2.Model.ClusteringMetrics.Cluster.FeatureValue.CategoricalValueH\x00\x1a\xe1\x01\n\x10\x43\x61tegoricalValue\x12~\n\x0f\x63\x61tegory_counts\x18\x01 \x03(\x0b\x32\x65.google.cloud.bigquery.v2.Model.ClusteringMetrics.Cluster.FeatureValue.CategoricalValue.CategoryCount\x1aM\n\rCategoryCount\x12\x10\n\x08\x63\x61tegory\x18\x01 \x01(\t\x12*\n\x05\x63ount\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x07\n\x05value\x1a\x89\x02\n\x0eRankingMetrics\x12<\n\x16mean_average_precision\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x38\n\x12mean_squared_error\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12K\n%normalized_discounted_cumulative_gain\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x32\n\x0c\x61verage_rank\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x1a\xe9\x07\n\x17\x41rimaForecastingMetrics\x12J\n\x12non_seasonal_order\x18\x01 \x03(\x0b\x32*.google.cloud.bigquery.v2.Model.ArimaOrderB\x02\x18\x01\x12V\n\x15\x61rima_fitting_metrics\x18\x02 \x03(\x0b\x32\x33.google.cloud.bigquery.v2.Model.ArimaFittingMetricsB\x02\x18\x01\x12_\n\x10seasonal_periods\x18\x03 \x03(\x0e\x32\x41.google.cloud.bigquery.v2.Model.SeasonalPeriod.SeasonalPeriodTypeB\x02\x18\x01\x12\x15\n\thas_drift\x18\x04 \x03(\x08\x42\x02\x18\x01\x12\x1a\n\x0etime_series_id\x18\x05 \x03(\tB\x02\x18\x01\x12\x8a\x01\n&arima_single_model_forecasting_metrics\x18\x06 \x03(\x0b\x32Z.google.cloud.bigquery.v2.Model.ArimaForecastingMetrics.ArimaSingleModelForecastingMetrics\x1a\x88\x04\n\"ArimaSingleModelForecastingMetrics\x12\x46\n\x12non_seasonal_order\x18\x01 \x01(\x0b\x32*.google.cloud.bigquery.v2.Model.ArimaOrder\x12R\n\x15\x61rima_fitting_metrics\x18\x02 \x01(\x0b\x32\x33.google.cloud.bigquery.v2.Model.ArimaFittingMetrics\x12\x11\n\thas_drift\x18\x03 \x01(\x08\x12\x16\n\x0etime_series_id\x18\x04 \x01(\t\x12\x17\n\x0ftime_series_ids\x18\t \x03(\t\x12[\n\x10seasonal_periods\x18\x05 \x03(\x0e\x32\x41.google.cloud.bigquery.v2.Model.SeasonalPeriod.SeasonalPeriodType\x12\x36\n\x12has_holiday_effect\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x37\n\x13has_spikes_and_dips\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x34\n\x10has_step_changes\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x1a\xbe\x04\n\x11\x45valuationMetrics\x12O\n\x12regression_metrics\x18\x01 \x01(\x0b\x32\x31.google.cloud.bigquery.v2.Model.RegressionMetricsH\x00\x12\x64\n\x1d\x62inary_classification_metrics\x18\x02 \x01(\x0b\x32;.google.cloud.bigquery.v2.Model.BinaryClassificationMetricsH\x00\x12m\n\"multi_class_classification_metrics\x18\x03 \x01(\x0b\x32?.google.cloud.bigquery.v2.Model.MultiClassClassificationMetricsH\x00\x12O\n\x12\x63lustering_metrics\x18\x04 \x01(\x0b\x32\x31.google.cloud.bigquery.v2.Model.ClusteringMetricsH\x00\x12I\n\x0franking_metrics\x18\x05 \x01(\x0b\x32..google.cloud.bigquery.v2.Model.RankingMetricsH\x00\x12\\\n\x19\x61rima_forecasting_metrics\x18\x06 \x01(\x0b\x32\x37.google.cloud.bigquery.v2.Model.ArimaForecastingMetricsH\x00\x42\t\n\x07metrics\x1a\x97\x01\n\x0f\x44\x61taSplitResult\x12@\n\x0etraining_table\x18\x01 \x01(\x0b\x32(.google.cloud.bigquery.v2.TableReference\x12\x42\n\x10\x65valuation_table\x18\x02 \x01(\x0b\x32(.google.cloud.bigquery.v2.TableReference\x1a-\n\nArimaOrder\x12\t\n\x01p\x18\x01 \x01(\x03\x12\t\n\x01\x64\x18\x02 \x01(\x03\x12\t\n\x01q\x18\x03 \x01(\x03\x1aL\n\x13\x41rimaFittingMetrics\x12\x16\n\x0elog_likelihood\x18\x01 \x01(\x01\x12\x0b\n\x03\x61ic\x18\x02 \x01(\x01\x12\x10\n\x08variance\x18\x03 \x01(\x01\x1a\xd5\x01\n\x11GlobalExplanation\x12S\n\x0c\x65xplanations\x18\x01 \x03(\x0b\x32=.google.cloud.bigquery.v2.Model.GlobalExplanation.Explanation\x12\x13\n\x0b\x63lass_label\x18\x02 \x01(\t\x1aV\n\x0b\x45xplanation\x12\x14\n\x0c\x66\x65\x61ture_name\x18\x01 \x01(\t\x12\x31\n\x0b\x61ttribution\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x1a\xe7 \n\x0bTrainingRun\x12U\n\x10training_options\x18\x01 \x01(\x0b\x32;.google.cloud.bigquery.v2.Model.TrainingRun.TrainingOptions\x12.\n\nstart_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12L\n\x07results\x18\x06 \x03(\x0b\x32;.google.cloud.bigquery.v2.Model.TrainingRun.IterationResult\x12M\n\x12\x65valuation_metrics\x18\x07 \x01(\x0b\x32\x31.google.cloud.bigquery.v2.Model.EvaluationMetrics\x12J\n\x11\x64\x61ta_split_result\x18\t \x01(\x0b\x32/.google.cloud.bigquery.v2.Model.DataSplitResult\x12N\n\x13global_explanations\x18\n \x03(\x0b\x32\x31.google.cloud.bigquery.v2.Model.GlobalExplanation\x1a\x92\x11\n\x0fTrainingOptions\x12\x16\n\x0emax_iterations\x18\x01 \x01(\x03\x12;\n\tloss_type\x18\x02 \x01(\x0e\x32(.google.cloud.bigquery.v2.Model.LossType\x12\x12\n\nlearn_rate\x18\x03 \x01(\x01\x12\x37\n\x11l1_regularization\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x37\n\x11l2_regularization\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12;\n\x15min_relative_progress\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12.\n\nwarm_start\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12.\n\nearly_stop\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x1b\n\x13input_label_columns\x18\t \x03(\t\x12J\n\x11\x64\x61ta_split_method\x18\n \x01(\x0e\x32/.google.cloud.bigquery.v2.Model.DataSplitMethod\x12 \n\x18\x64\x61ta_split_eval_fraction\x18\x0b \x01(\x01\x12\x19\n\x11\x64\x61ta_split_column\x18\x0c \x01(\t\x12N\n\x13learn_rate_strategy\x18\r \x01(\x0e\x32\x31.google.cloud.bigquery.v2.Model.LearnRateStrategy\x12\x1a\n\x12initial_learn_rate\x18\x10 \x01(\x01\x12o\n\x13label_class_weights\x18\x11 \x03(\x0b\x32R.google.cloud.bigquery.v2.Model.TrainingRun.TrainingOptions.LabelClassWeightsEntry\x12\x13\n\x0buser_column\x18\x12 \x01(\t\x12\x13\n\x0bitem_column\x18\x13 \x01(\t\x12\x43\n\rdistance_type\x18\x14 \x01(\x0e\x32,.google.cloud.bigquery.v2.Model.DistanceType\x12\x14\n\x0cnum_clusters\x18\x15 \x01(\x03\x12\x11\n\tmodel_uri\x18\x16 \x01(\t\x12S\n\x15optimization_strategy\x18\x17 \x01(\x0e\x32\x34.google.cloud.bigquery.v2.Model.OptimizationStrategy\x12\x14\n\x0chidden_units\x18\x18 \x03(\x03\x12\x12\n\nbatch_size\x18\x19 \x01(\x03\x12-\n\x07\x64ropout\x18\x1a \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x16\n\x0emax_tree_depth\x18\x1b \x01(\x03\x12\x11\n\tsubsample\x18\x1c \x01(\x01\x12\x34\n\x0emin_split_loss\x18\x1d \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x13\n\x0bnum_factors\x18\x1e \x01(\x03\x12\x43\n\rfeedback_type\x18\x1f \x01(\x0e\x32,.google.cloud.bigquery.v2.Model.FeedbackType\x12\x30\n\nwals_alpha\x18  \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12l\n\x1ckmeans_initialization_method\x18! \x01(\x0e\x32\x46.google.cloud.bigquery.v2.Model.KmeansEnums.KmeansInitializationMethod\x12$\n\x1ckmeans_initialization_column\x18\" \x01(\t\x12$\n\x1ctime_series_timestamp_column\x18# \x01(\t\x12\x1f\n\x17time_series_data_column\x18$ \x01(\t\x12\x12\n\nauto_arima\x18% \x01(\x08\x12\x46\n\x12non_seasonal_order\x18& \x01(\x0b\x32*.google.cloud.bigquery.v2.Model.ArimaOrder\x12\x45\n\x0e\x64\x61ta_frequency\x18\' \x01(\x0e\x32-.google.cloud.bigquery.v2.Model.DataFrequency\x12\x15\n\rinclude_drift\x18) \x01(\x08\x12\x45\n\x0eholiday_region\x18* \x01(\x0e\x32-.google.cloud.bigquery.v2.Model.HolidayRegion\x12\x1d\n\x15time_series_id_column\x18+ \x01(\t\x12\x1e\n\x16time_series_id_columns\x18\x33 \x03(\t\x12\x0f\n\x07horizon\x18, \x01(\x03\x12\x1e\n\x16preserve_input_structs\x18- \x01(\x08\x12\x1c\n\x14\x61uto_arima_max_order\x18. \x01(\x03\x12\x39\n\x15\x64\x65\x63ompose_time_series\x18\x32 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x39\n\x15\x63lean_spikes_and_dips\x18\x34 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x37\n\x13\x61\x64just_step_changes\x18\x35 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x1a\x38\n\x16LabelClassWeightsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x01:\x02\x38\x01\x1a\x82\x0c\n\x0fIterationResult\x12*\n\x05index\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.Int32Value\x12\x30\n\x0b\x64uration_ms\x18\x04 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x33\n\rtraining_loss\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12/\n\teval_loss\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x12\n\nlearn_rate\x18\x07 \x01(\x01\x12^\n\rcluster_infos\x18\x08 \x03(\x0b\x32G.google.cloud.bigquery.v2.Model.TrainingRun.IterationResult.ClusterInfo\x12]\n\x0c\x61rima_result\x18\t \x01(\x0b\x32G.google.cloud.bigquery.v2.Model.TrainingRun.IterationResult.ArimaResult\x1a\x8b\x01\n\x0b\x43lusterInfo\x12\x13\n\x0b\x63\x65ntroid_id\x18\x01 \x01(\x03\x12\x34\n\x0e\x63luster_radius\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.DoubleValue\x12\x31\n\x0c\x63luster_size\x18\x03 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x1a\xc9\x07\n\x0b\x41rimaResult\x12p\n\x10\x61rima_model_info\x18\x01 \x03(\x0b\x32V.google.cloud.bigquery.v2.Model.TrainingRun.IterationResult.ArimaResult.ArimaModelInfo\x12[\n\x10seasonal_periods\x18\x02 \x03(\x0e\x32\x41.google.cloud.bigquery.v2.Model.SeasonalPeriod.SeasonalPeriodType\x1a}\n\x11\x41rimaCoefficients\x12$\n\x1c\x61uto_regressive_coefficients\x18\x01 \x03(\x01\x12#\n\x1bmoving_average_coefficients\x18\x02 \x03(\x01\x12\x1d\n\x15intercept_coefficient\x18\x03 \x01(\x01\x1a\xeb\x04\n\x0e\x41rimaModelInfo\x12\x46\n\x12non_seasonal_order\x18\x01 \x01(\x0b\x32*.google.cloud.bigquery.v2.Model.ArimaOrder\x12u\n\x12\x61rima_coefficients\x18\x02 \x01(\x0b\x32Y.google.cloud.bigquery.v2.Model.TrainingRun.IterationResult.ArimaResult.ArimaCoefficients\x12R\n\x15\x61rima_fitting_metrics\x18\x03 \x01(\x0b\x32\x33.google.cloud.bigquery.v2.Model.ArimaFittingMetrics\x12\x11\n\thas_drift\x18\x04 \x01(\x08\x12\x16\n\x0etime_series_id\x18\x05 \x01(\t\x12\x17\n\x0ftime_series_ids\x18\n \x03(\t\x12[\n\x10seasonal_periods\x18\x06 \x03(\x0e\x32\x41.google.cloud.bigquery.v2.Model.SeasonalPeriod.SeasonalPeriodType\x12\x36\n\x12has_holiday_effect\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x37\n\x13has_spikes_and_dips\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12\x34\n\x10has_step_changes\x18\t \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xb5\x02\n\tModelType\x12\x1a\n\x16MODEL_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11LINEAR_REGRESSION\x10\x01\x12\x17\n\x13LOGISTIC_REGRESSION\x10\x02\x12\n\n\x06KMEANS\x10\x03\x12\x18\n\x14MATRIX_FACTORIZATION\x10\x04\x12\x12\n\x0e\x44NN_CLASSIFIER\x10\x05\x12\x0e\n\nTENSORFLOW\x10\x06\x12\x11\n\rDNN_REGRESSOR\x10\x07\x12\x1a\n\x16\x42OOSTED_TREE_REGRESSOR\x10\t\x12\x1b\n\x17\x42OOSTED_TREE_CLASSIFIER\x10\n\x12\t\n\x05\x41RIMA\x10\x0b\x12\x14\n\x10\x41UTOML_REGRESSOR\x10\x0c\x12\x15\n\x11\x41UTOML_CLASSIFIER\x10\r\x12\x0e\n\nARIMA_PLUS\x10\x13\"O\n\x08LossType\x12\x19\n\x15LOSS_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11MEAN_SQUARED_LOSS\x10\x01\x12\x11\n\rMEAN_LOG_LOSS\x10\x02\"H\n\x0c\x44istanceType\x12\x1d\n\x19\x44ISTANCE_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tEUCLIDEAN\x10\x01\x12\n\n\x06\x43OSINE\x10\x02\"z\n\x0f\x44\x61taSplitMethod\x12!\n\x1d\x44\x41TA_SPLIT_METHOD_UNSPECIFIED\x10\x00\x12\n\n\x06RANDOM\x10\x01\x12\n\n\x06\x43USTOM\x10\x02\x12\x0e\n\nSEQUENTIAL\x10\x03\x12\x0c\n\x08NO_SPLIT\x10\x04\x12\x0e\n\nAUTO_SPLIT\x10\x05\"\x9e\x01\n\rDataFrequency\x12\x1e\n\x1a\x44\x41TA_FREQUENCY_UNSPECIFIED\x10\x00\x12\x12\n\x0e\x41UTO_FREQUENCY\x10\x01\x12\n\n\x06YEARLY\x10\x02\x12\r\n\tQUARTERLY\x10\x03\x12\x0b\n\x07MONTHLY\x10\x04\x12\n\n\x06WEEKLY\x10\x05\x12\t\n\x05\x44\x41ILY\x10\x06\x12\n\n\x06HOURLY\x10\x07\x12\x0e\n\nPER_MINUTE\x10\x08\"\xd9\x04\n\rHolidayRegion\x12\x1e\n\x1aHOLIDAY_REGION_UNSPECIFIED\x10\x00\x12\n\n\x06GLOBAL\x10\x01\x12\x06\n\x02NA\x10\x02\x12\t\n\x05JAPAC\x10\x03\x12\x08\n\x04\x45MEA\x10\x04\x12\x07\n\x03LAC\x10\x05\x12\x06\n\x02\x41\x45\x10\x06\x12\x06\n\x02\x41R\x10\x07\x12\x06\n\x02\x41T\x10\x08\x12\x06\n\x02\x41U\x10\t\x12\x06\n\x02\x42\x45\x10\n\x12\x06\n\x02\x42R\x10\x0b\x12\x06\n\x02\x43\x41\x10\x0c\x12\x06\n\x02\x43H\x10\r\x12\x06\n\x02\x43L\x10\x0e\x12\x06\n\x02\x43N\x10\x0f\x12\x06\n\x02\x43O\x10\x10\x12\x06\n\x02\x43S\x10\x11\x12\x06\n\x02\x43Z\x10\x12\x12\x06\n\x02\x44\x45\x10\x13\x12\x06\n\x02\x44K\x10\x14\x12\x06\n\x02\x44Z\x10\x15\x12\x06\n\x02\x45\x43\x10\x16\x12\x06\n\x02\x45\x45\x10\x17\x12\x06\n\x02\x45G\x10\x18\x12\x06\n\x02\x45S\x10\x19\x12\x06\n\x02\x46I\x10\x1a\x12\x06\n\x02\x46R\x10\x1b\x12\x06\n\x02GB\x10\x1c\x12\x06\n\x02GR\x10\x1d\x12\x06\n\x02HK\x10\x1e\x12\x06\n\x02HU\x10\x1f\x12\x06\n\x02ID\x10 \x12\x06\n\x02IE\x10!\x12\x06\n\x02IL\x10\"\x12\x06\n\x02IN\x10#\x12\x06\n\x02IR\x10$\x12\x06\n\x02IT\x10%\x12\x06\n\x02JP\x10&\x12\x06\n\x02KR\x10\'\x12\x06\n\x02LV\x10(\x12\x06\n\x02MA\x10)\x12\x06\n\x02MX\x10*\x12\x06\n\x02MY\x10+\x12\x06\n\x02NG\x10,\x12\x06\n\x02NL\x10-\x12\x06\n\x02NO\x10.\x12\x06\n\x02NZ\x10/\x12\x06\n\x02PE\x10\x30\x12\x06\n\x02PH\x10\x31\x12\x06\n\x02PK\x10\x32\x12\x06\n\x02PL\x10\x33\x12\x06\n\x02PT\x10\x34\x12\x06\n\x02RO\x10\x35\x12\x06\n\x02RS\x10\x36\x12\x06\n\x02RU\x10\x37\x12\x06\n\x02SA\x10\x38\x12\x06\n\x02SE\x10\x39\x12\x06\n\x02SG\x10:\x12\x06\n\x02SI\x10;\x12\x06\n\x02SK\x10<\x12\x06\n\x02TH\x10=\x12\x06\n\x02TR\x10>\x12\x06\n\x02TW\x10?\x12\x06\n\x02UA\x10@\x12\x06\n\x02US\x10\x41\x12\x06\n\x02VE\x10\x42\x12\x06\n\x02VN\x10\x43\x12\x06\n\x02ZA\x10\x44\"W\n\x11LearnRateStrategy\x12#\n\x1fLEARN_RATE_STRATEGY_UNSPECIFIED\x10\x00\x12\x0f\n\x0bLINE_SEARCH\x10\x01\x12\x0c\n\x08\x43ONSTANT\x10\x02\"n\n\x14OptimizationStrategy\x12%\n!OPTIMIZATION_STRATEGY_UNSPECIFIED\x10\x00\x12\x1a\n\x16\x42\x41TCH_GRADIENT_DESCENT\x10\x01\x12\x13\n\x0fNORMAL_EQUATION\x10\x02\"I\n\x0c\x46\x65\x65\x64\x62\x61\x63kType\x12\x1d\n\x19\x46\x45\x45\x44\x42\x41\x43K_TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08IMPLICIT\x10\x01\x12\x0c\n\x08\x45XPLICIT\x10\x02\"Z\n\x0fGetModelRequest\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\ndataset_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08model_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\x91\x01\n\x11PatchModelRequest\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\ndataset_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08model_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x33\n\x05model\x18\x04 \x01(\x0b\x32\x1f.google.cloud.bigquery.v2.ModelB\x03\xe0\x41\x02\"]\n\x12\x44\x65leteModelRequest\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\ndataset_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08model_id\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\x8c\x01\n\x11ListModelsRequest\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\ndataset_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x31\n\x0bmax_results\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x12\x12\n\npage_token\x18\x04 \x01(\t\"^\n\x12ListModelsResponse\x12/\n\x06models\x18\x01 \x03(\x0b\x32\x1f.google.cloud.bigquery.v2.Model\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xd7\x08\n\x0cModelService\x12\xd1\x01\n\x08GetModel\x12).google.cloud.bigquery.v2.GetModelRequest\x1a\x1f.google.cloud.bigquery.v2.Model\"y\x82\xd3\xe4\x93\x02R\x12P/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models/{model_id=*}\xda\x41\x1eproject_id,dataset_id,model_id\x12\xd8\x01\n\nListModels\x12+.google.cloud.bigquery.v2.ListModelsRequest\x1a,.google.cloud.bigquery.v2.ListModelsResponse\"o\x82\xd3\xe4\x93\x02\x45\x12\x43/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models\xda\x41!project_id,dataset_id,max_results\x12\xe3\x01\n\nPatchModel\x12+.google.cloud.bigquery.v2.PatchModelRequest\x1a\x1f.google.cloud.bigquery.v2.Model\"\x86\x01\x82\xd3\xe4\x93\x02Y2P/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models/{model_id=*}:\x05model\xda\x41$project_id,dataset_id,model_id,model\x12\xce\x01\n\x0b\x44\x65leteModel\x12,.google.cloud.bigquery.v2.DeleteModelRequest\x1a\x16.google.protobuf.Empty\"y\x82\xd3\xe4\x93\x02R*P/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models/{model_id=*}\xda\x41\x1eproject_id,dataset_id,model_id\x1a\xe0\x01\xca\x41\x17\x62igquery.googleapis.com\xd2\x41\xc2\x01https://www.googleapis.com/auth/bigquery,https://www.googleapis.com/auth/bigquery.readonly,https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-onlyBl\n\x1c\x63om.google.cloud.bigquery.v2B\nModelProtoZ@google.golang.org/genproto/googleapis/cloud/bigquery/v2;bigqueryb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.v2.model_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.bigquery.v2B\nModelProtoZ@google.golang.org/genproto/googleapis/cloud/bigquery/v2;bigquery'
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['non_seasonal_order']._options = None
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['non_seasonal_order']._serialized_options = b'\030\001'
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['arima_fitting_metrics']._options = None
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['arima_fitting_metrics']._serialized_options = b'\030\001'
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['seasonal_periods']._options = None
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['seasonal_periods']._serialized_options = b'\030\001'
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['has_drift']._options = None
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['has_drift']._serialized_options = b'\030\001'
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['time_series_id']._options = None
  _MODEL_ARIMAFORECASTINGMETRICS.fields_by_name['time_series_id']._serialized_options = b'\030\001'
  _MODEL_TRAININGRUN_TRAININGOPTIONS_LABELCLASSWEIGHTSENTRY._options = None
  _MODEL_TRAININGRUN_TRAININGOPTIONS_LABELCLASSWEIGHTSENTRY._serialized_options = b'8\001'
  _MODEL_LABELSENTRY._options = None
  _MODEL_LABELSENTRY._serialized_options = b'8\001'
  _MODEL.fields_by_name['etag']._options = None
  _MODEL.fields_by_name['etag']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['model_reference']._options = None
  _MODEL.fields_by_name['model_reference']._serialized_options = b'\340A\002'
  _MODEL.fields_by_name['creation_time']._options = None
  _MODEL.fields_by_name['creation_time']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['last_modified_time']._options = None
  _MODEL.fields_by_name['last_modified_time']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['description']._options = None
  _MODEL.fields_by_name['description']._serialized_options = b'\340A\001'
  _MODEL.fields_by_name['friendly_name']._options = None
  _MODEL.fields_by_name['friendly_name']._serialized_options = b'\340A\001'
  _MODEL.fields_by_name['expiration_time']._options = None
  _MODEL.fields_by_name['expiration_time']._serialized_options = b'\340A\001'
  _MODEL.fields_by_name['location']._options = None
  _MODEL.fields_by_name['location']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['model_type']._options = None
  _MODEL.fields_by_name['model_type']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['training_runs']._options = None
  _MODEL.fields_by_name['training_runs']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['feature_columns']._options = None
  _MODEL.fields_by_name['feature_columns']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['label_columns']._options = None
  _MODEL.fields_by_name['label_columns']._serialized_options = b'\340A\003'
  _MODEL.fields_by_name['best_trial_id']._options = None
  _MODEL.fields_by_name['best_trial_id']._serialized_options = b'\030\001'
  _GETMODELREQUEST.fields_by_name['project_id']._options = None
  _GETMODELREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _GETMODELREQUEST.fields_by_name['dataset_id']._options = None
  _GETMODELREQUEST.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _GETMODELREQUEST.fields_by_name['model_id']._options = None
  _GETMODELREQUEST.fields_by_name['model_id']._serialized_options = b'\340A\002'
  _PATCHMODELREQUEST.fields_by_name['project_id']._options = None
  _PATCHMODELREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _PATCHMODELREQUEST.fields_by_name['dataset_id']._options = None
  _PATCHMODELREQUEST.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _PATCHMODELREQUEST.fields_by_name['model_id']._options = None
  _PATCHMODELREQUEST.fields_by_name['model_id']._serialized_options = b'\340A\002'
  _PATCHMODELREQUEST.fields_by_name['model']._options = None
  _PATCHMODELREQUEST.fields_by_name['model']._serialized_options = b'\340A\002'
  _DELETEMODELREQUEST.fields_by_name['project_id']._options = None
  _DELETEMODELREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _DELETEMODELREQUEST.fields_by_name['dataset_id']._options = None
  _DELETEMODELREQUEST.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _DELETEMODELREQUEST.fields_by_name['model_id']._options = None
  _DELETEMODELREQUEST.fields_by_name['model_id']._serialized_options = b'\340A\002'
  _LISTMODELSREQUEST.fields_by_name['project_id']._options = None
  _LISTMODELSREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _LISTMODELSREQUEST.fields_by_name['dataset_id']._options = None
  _LISTMODELSREQUEST.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _MODELSERVICE._options = None
  _MODELSERVICE._serialized_options = b'\312A\027bigquery.googleapis.com\322A\302\001https://www.googleapis.com/auth/bigquery,https://www.googleapis.com/auth/bigquery.readonly,https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-only'
  _MODELSERVICE.methods_by_name['GetModel']._options = None
  _MODELSERVICE.methods_by_name['GetModel']._serialized_options = b'\202\323\344\223\002R\022P/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models/{model_id=*}\332A\036project_id,dataset_id,model_id'
  _MODELSERVICE.methods_by_name['ListModels']._options = None
  _MODELSERVICE.methods_by_name['ListModels']._serialized_options = b'\202\323\344\223\002E\022C/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models\332A!project_id,dataset_id,max_results'
  _MODELSERVICE.methods_by_name['PatchModel']._options = None
  _MODELSERVICE.methods_by_name['PatchModel']._serialized_options = b'\202\323\344\223\002Y2P/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models/{model_id=*}:\005model\332A$project_id,dataset_id,model_id,model'
  _MODELSERVICE.methods_by_name['DeleteModel']._options = None
  _MODELSERVICE.methods_by_name['DeleteModel']._serialized_options = b'\202\323\344\223\002R*P/bigquery/v2/projects/{project_id=*}/datasets/{dataset_id=*}/models/{model_id=*}\332A\036project_id,dataset_id,model_id'
  _MODEL._serialized_start=440
  _MODEL._serialized_end=12671
  _MODEL_SEASONALPERIOD._serialized_start=1169
  _MODEL_SEASONALPERIOD._serialized_end=1329
  _MODEL_SEASONALPERIOD_SEASONALPERIODTYPE._serialized_start=1188
  _MODEL_SEASONALPERIOD_SEASONALPERIODTYPE._serialized_end=1329
  _MODEL_KMEANSENUMS._serialized_start=1332
  _MODEL_KMEANSENUMS._serialized_end=1467
  _MODEL_KMEANSENUMS_KMEANSINITIALIZATIONMETHOD._serialized_start=1347
  _MODEL_KMEANSENUMS_KMEANSINITIALIZATIONMETHOD._serialized_end=1467
  _MODEL_REGRESSIONMETRICS._serialized_start=1470
  _MODEL_REGRESSIONMETRICS._serialized_end=1778
  _MODEL_AGGREGATECLASSIFICATIONMETRICS._serialized_start=1781
  _MODEL_AGGREGATECLASSIFICATIONMETRICS._serialized_end=2148
  _MODEL_BINARYCLASSIFICATIONMETRICS._serialized_start=2151
  _MODEL_BINARYCLASSIFICATIONMETRICS._serialized_end=2950
  _MODEL_BINARYCLASSIFICATIONMETRICS_BINARYCONFUSIONMATRIX._serialized_start=2458
  _MODEL_BINARYCLASSIFICATIONMETRICS_BINARYCONFUSIONMATRIX._serialized_end=2950
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS._serialized_start=2953
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS._serialized_end=3600
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS_CONFUSIONMATRIX._serialized_start=3207
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS_CONFUSIONMATRIX._serialized_end=3600
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS_CONFUSIONMATRIX_ENTRY._serialized_start=3385
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS_CONFUSIONMATRIX_ENTRY._serialized_end=3466
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS_CONFUSIONMATRIX_ROW._serialized_start=3469
  _MODEL_MULTICLASSCLASSIFICATIONMETRICS_CONFUSIONMATRIX_ROW._serialized_end=3600
  _MODEL_CLUSTERINGMETRICS._serialized_start=3603
  _MODEL_CLUSTERINGMETRICS._serialized_end=4446
  _MODEL_CLUSTERINGMETRICS_CLUSTER._serialized_start=3823
  _MODEL_CLUSTERINGMETRICS_CLUSTER._serialized_end=4446
  _MODEL_CLUSTERINGMETRICS_CLUSTER_FEATUREVALUE._serialized_start=3996
  _MODEL_CLUSTERINGMETRICS_CLUSTER_FEATUREVALUE._serialized_end=4446
  _MODEL_CLUSTERINGMETRICS_CLUSTER_FEATUREVALUE_CATEGORICALVALUE._serialized_start=4212
  _MODEL_CLUSTERINGMETRICS_CLUSTER_FEATUREVALUE_CATEGORICALVALUE._serialized_end=4437
  _MODEL_CLUSTERINGMETRICS_CLUSTER_FEATUREVALUE_CATEGORICALVALUE_CATEGORYCOUNT._serialized_start=4360
  _MODEL_CLUSTERINGMETRICS_CLUSTER_FEATUREVALUE_CATEGORICALVALUE_CATEGORYCOUNT._serialized_end=4437
  _MODEL_RANKINGMETRICS._serialized_start=4449
  _MODEL_RANKINGMETRICS._serialized_end=4714
  _MODEL_ARIMAFORECASTINGMETRICS._serialized_start=4717
  _MODEL_ARIMAFORECASTINGMETRICS._serialized_end=5718
  _MODEL_ARIMAFORECASTINGMETRICS_ARIMASINGLEMODELFORECASTINGMETRICS._serialized_start=5198
  _MODEL_ARIMAFORECASTINGMETRICS_ARIMASINGLEMODELFORECASTINGMETRICS._serialized_end=5718
  _MODEL_EVALUATIONMETRICS._serialized_start=5721
  _MODEL_EVALUATIONMETRICS._serialized_end=6295
  _MODEL_DATASPLITRESULT._serialized_start=6298
  _MODEL_DATASPLITRESULT._serialized_end=6449
  _MODEL_ARIMAORDER._serialized_start=6451
  _MODEL_ARIMAORDER._serialized_end=6496
  _MODEL_ARIMAFITTINGMETRICS._serialized_start=6498
  _MODEL_ARIMAFITTINGMETRICS._serialized_end=6574
  _MODEL_GLOBALEXPLANATION._serialized_start=6577
  _MODEL_GLOBALEXPLANATION._serialized_end=6790
  _MODEL_GLOBALEXPLANATION_EXPLANATION._serialized_start=6704
  _MODEL_GLOBALEXPLANATION_EXPLANATION._serialized_end=6790
  _MODEL_TRAININGRUN._serialized_start=6793
  _MODEL_TRAININGRUN._serialized_end=10992
  _MODEL_TRAININGRUN_TRAININGOPTIONS._serialized_start=7257
  _MODEL_TRAININGRUN_TRAININGOPTIONS._serialized_end=9451
  _MODEL_TRAININGRUN_TRAININGOPTIONS_LABELCLASSWEIGHTSENTRY._serialized_start=9395
  _MODEL_TRAININGRUN_TRAININGOPTIONS_LABELCLASSWEIGHTSENTRY._serialized_end=9451
  _MODEL_TRAININGRUN_ITERATIONRESULT._serialized_start=9454
  _MODEL_TRAININGRUN_ITERATIONRESULT._serialized_end=10992
  _MODEL_TRAININGRUN_ITERATIONRESULT_CLUSTERINFO._serialized_start=9881
  _MODEL_TRAININGRUN_ITERATIONRESULT_CLUSTERINFO._serialized_end=10020
  _MODEL_TRAININGRUN_ITERATIONRESULT_ARIMARESULT._serialized_start=10023
  _MODEL_TRAININGRUN_ITERATIONRESULT_ARIMARESULT._serialized_end=10992
  _MODEL_TRAININGRUN_ITERATIONRESULT_ARIMARESULT_ARIMACOEFFICIENTS._serialized_start=10245
  _MODEL_TRAININGRUN_ITERATIONRESULT_ARIMARESULT_ARIMACOEFFICIENTS._serialized_end=10370
  _MODEL_TRAININGRUN_ITERATIONRESULT_ARIMARESULT_ARIMAMODELINFO._serialized_start=10373
  _MODEL_TRAININGRUN_ITERATIONRESULT_ARIMARESULT_ARIMAMODELINFO._serialized_end=10992
  _MODEL_LABELSENTRY._serialized_start=10994
  _MODEL_LABELSENTRY._serialized_end=11039
  _MODEL_MODELTYPE._serialized_start=11042
  _MODEL_MODELTYPE._serialized_end=11351
  _MODEL_LOSSTYPE._serialized_start=11353
  _MODEL_LOSSTYPE._serialized_end=11432
  _MODEL_DISTANCETYPE._serialized_start=11434
  _MODEL_DISTANCETYPE._serialized_end=11506
  _MODEL_DATASPLITMETHOD._serialized_start=11508
  _MODEL_DATASPLITMETHOD._serialized_end=11630
  _MODEL_DATAFREQUENCY._serialized_start=11633
  _MODEL_DATAFREQUENCY._serialized_end=11791
  _MODEL_HOLIDAYREGION._serialized_start=11794
  _MODEL_HOLIDAYREGION._serialized_end=12395
  _MODEL_LEARNRATESTRATEGY._serialized_start=12397
  _MODEL_LEARNRATESTRATEGY._serialized_end=12484
  _MODEL_OPTIMIZATIONSTRATEGY._serialized_start=12486
  _MODEL_OPTIMIZATIONSTRATEGY._serialized_end=12596
  _MODEL_FEEDBACKTYPE._serialized_start=12598
  _MODEL_FEEDBACKTYPE._serialized_end=12671
  _GETMODELREQUEST._serialized_start=12673
  _GETMODELREQUEST._serialized_end=12763
  _PATCHMODELREQUEST._serialized_start=12766
  _PATCHMODELREQUEST._serialized_end=12911
  _DELETEMODELREQUEST._serialized_start=12913
  _DELETEMODELREQUEST._serialized_end=13006
  _LISTMODELSREQUEST._serialized_start=13009
  _LISTMODELSREQUEST._serialized_end=13149
  _LISTMODELSRESPONSE._serialized_start=13151
  _LISTMODELSRESPONSE._serialized_end=13245
  _MODELSERVICE._serialized_start=13248
  _MODELSERVICE._serialized_end=14359
# @@protoc_insertion_point(module_scope)
