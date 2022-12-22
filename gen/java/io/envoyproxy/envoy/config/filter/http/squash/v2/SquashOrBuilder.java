// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/squash/v2/squash.proto

package io.envoyproxy.envoy.config.filter.http.squash.v2;

public interface SquashOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.http.squash.v2.Squash)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the cluster that hosts the Squash server.
   * </pre>
   *
   * <code>string cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <pre>
   * The name of the cluster that hosts the Squash server.
   * </pre>
   *
   * <code>string cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * When the filter requests the Squash server to create a DebugAttachment, it will use this
   * structure as template for the body of the request. It can contain reference to environment
   * variables in the form of '{{ ENV_VAR_NAME }}'. These can be used to provide the Squash server
   * with more information to find the process to attach the debugger to. For example, in a
   * Istio/k8s environment, this will contain information on the pod:
   * .. code-block:: json
   *  {
   *    "spec": {
   *      "attachment": {
   *        "pod": "{{ POD_NAME }}",
   *        "namespace": "{{ POD_NAMESPACE }}"
   *      },
   *      "match_request": true
   *    }
   *  }
   * (where POD_NAME, POD_NAMESPACE are configured in the pod via the Downward API)
   * </pre>
   *
   * <code>.google.protobuf.Struct attachment_template = 2;</code>
   * @return Whether the attachmentTemplate field is set.
   */
  boolean hasAttachmentTemplate();
  /**
   * <pre>
   * When the filter requests the Squash server to create a DebugAttachment, it will use this
   * structure as template for the body of the request. It can contain reference to environment
   * variables in the form of '{{ ENV_VAR_NAME }}'. These can be used to provide the Squash server
   * with more information to find the process to attach the debugger to. For example, in a
   * Istio/k8s environment, this will contain information on the pod:
   * .. code-block:: json
   *  {
   *    "spec": {
   *      "attachment": {
   *        "pod": "{{ POD_NAME }}",
   *        "namespace": "{{ POD_NAMESPACE }}"
   *      },
   *      "match_request": true
   *    }
   *  }
   * (where POD_NAME, POD_NAMESPACE are configured in the pod via the Downward API)
   * </pre>
   *
   * <code>.google.protobuf.Struct attachment_template = 2;</code>
   * @return The attachmentTemplate.
   */
  com.google.protobuf.Struct getAttachmentTemplate();
  /**
   * <pre>
   * When the filter requests the Squash server to create a DebugAttachment, it will use this
   * structure as template for the body of the request. It can contain reference to environment
   * variables in the form of '{{ ENV_VAR_NAME }}'. These can be used to provide the Squash server
   * with more information to find the process to attach the debugger to. For example, in a
   * Istio/k8s environment, this will contain information on the pod:
   * .. code-block:: json
   *  {
   *    "spec": {
   *      "attachment": {
   *        "pod": "{{ POD_NAME }}",
   *        "namespace": "{{ POD_NAMESPACE }}"
   *      },
   *      "match_request": true
   *    }
   *  }
   * (where POD_NAME, POD_NAMESPACE are configured in the pod via the Downward API)
   * </pre>
   *
   * <code>.google.protobuf.Struct attachment_template = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getAttachmentTemplateOrBuilder();

  /**
   * <pre>
   * The timeout for individual requests sent to the Squash cluster. Defaults to 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration request_timeout = 3;</code>
   * @return Whether the requestTimeout field is set.
   */
  boolean hasRequestTimeout();
  /**
   * <pre>
   * The timeout for individual requests sent to the Squash cluster. Defaults to 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration request_timeout = 3;</code>
   * @return The requestTimeout.
   */
  com.google.protobuf.Duration getRequestTimeout();
  /**
   * <pre>
   * The timeout for individual requests sent to the Squash cluster. Defaults to 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration request_timeout = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getRequestTimeoutOrBuilder();

  /**
   * <pre>
   * The total timeout Squash will delay a request and wait for it to be attached. Defaults to 60
   * seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration attachment_timeout = 4;</code>
   * @return Whether the attachmentTimeout field is set.
   */
  boolean hasAttachmentTimeout();
  /**
   * <pre>
   * The total timeout Squash will delay a request and wait for it to be attached. Defaults to 60
   * seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration attachment_timeout = 4;</code>
   * @return The attachmentTimeout.
   */
  com.google.protobuf.Duration getAttachmentTimeout();
  /**
   * <pre>
   * The total timeout Squash will delay a request and wait for it to be attached. Defaults to 60
   * seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration attachment_timeout = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getAttachmentTimeoutOrBuilder();

  /**
   * <pre>
   * Amount of time to poll for the status of the attachment object in the Squash server
   * (to check if has been attached). Defaults to 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration attachment_poll_period = 5;</code>
   * @return Whether the attachmentPollPeriod field is set.
   */
  boolean hasAttachmentPollPeriod();
  /**
   * <pre>
   * Amount of time to poll for the status of the attachment object in the Squash server
   * (to check if has been attached). Defaults to 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration attachment_poll_period = 5;</code>
   * @return The attachmentPollPeriod.
   */
  com.google.protobuf.Duration getAttachmentPollPeriod();
  /**
   * <pre>
   * Amount of time to poll for the status of the attachment object in the Squash server
   * (to check if has been attached). Defaults to 1 second.
   * </pre>
   *
   * <code>.google.protobuf.Duration attachment_poll_period = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getAttachmentPollPeriodOrBuilder();
}