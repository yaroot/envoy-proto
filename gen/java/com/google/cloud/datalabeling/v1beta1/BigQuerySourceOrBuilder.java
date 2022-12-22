// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface BigQuerySourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.BigQuerySource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. BigQuery URI to a table, up to 2,000 characters long. If you
   * specify the URI of a table that does not exist, Data Labeling Service
   * creates a table at the URI with the correct schema when you create your
   * [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob]. If you specify the URI of a table that already exists,
   * it must have the
   * [correct
   * schema](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
   * Provide the table URI in the following format:
   * "bq://&lt;var&gt;{your_project_id}&lt;/var&gt;/&lt;var&gt;{your_dataset_name}&lt;/var&gt;/&lt;var&gt;{your_table_name}&lt;/var&gt;"
   * [Learn
   * more](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   * <pre>
   * Required. BigQuery URI to a table, up to 2,000 characters long. If you
   * specify the URI of a table that does not exist, Data Labeling Service
   * creates a table at the URI with the correct schema when you create your
   * [EvaluationJob][google.cloud.datalabeling.v1beta1.EvaluationJob]. If you specify the URI of a table that already exists,
   * it must have the
   * [correct
   * schema](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
   * Provide the table URI in the following format:
   * "bq://&lt;var&gt;{your_project_id}&lt;/var&gt;/&lt;var&gt;{your_dataset_name}&lt;/var&gt;/&lt;var&gt;{your_table_name}&lt;/var&gt;"
   * [Learn
   * more](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString
      getInputUriBytes();
}