// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2alpha/functions.proto

package com.google.cloud.functions.v2alpha;

public interface ServiceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2alpha.ServiceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Name of the service associated with a Function.
   * The format of this field is
   * `projects/{project}/locations/{region}/services/{service}`
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * Output only. Name of the service associated with a Function.
   * The format of this field is
   * `projects/{project}/locations/{region}/services/{service}`
   * </pre>
   *
   * <code>string service = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * The function execution timeout. Execution is considered failed and
   * can be terminated if the function is not completed at the end of the
   * timeout period. Defaults to 60 seconds.
   * </pre>
   *
   * <code>int32 timeout_seconds = 2;</code>
   * @return The timeoutSeconds.
   */
  int getTimeoutSeconds();

  /**
   * <pre>
   * The amount of memory available for a function.
   * Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is
   * supplied the value is interpreted as bytes.
   * See
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * a full description.
   * </pre>
   *
   * <code>string available_memory = 13;</code>
   * @return The availableMemory.
   */
  java.lang.String getAvailableMemory();
  /**
   * <pre>
   * The amount of memory available for a function.
   * Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is
   * supplied the value is interpreted as bytes.
   * See
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * a full description.
   * </pre>
   *
   * <code>string available_memory = 13;</code>
   * @return The bytes for availableMemory.
   */
  com.google.protobuf.ByteString
      getAvailableMemoryBytes();

  /**
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 4;</code>
   */
  int getEnvironmentVariablesCount();
  /**
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 4;</code>
   */
  boolean containsEnvironmentVariables(
      java.lang.String key);
  /**
   * Use {@link #getEnvironmentVariablesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironmentVariables();
  /**
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironmentVariablesMap();
  /**
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 4;</code>
   */
  /* nullable */
java.lang.String getEnvironmentVariablesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Environment variables that shall be available during function execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment_variables = 4;</code>
   */
  java.lang.String getEnvironmentVariablesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The limit on the maximum number of function instances that may coexist at a
   * given time.
   * In some cases, such as rapid traffic surges, Cloud Functions may, for a
   * short period of time, create more instances than the specified max
   * instances limit. If your function cannot tolerate this temporary behavior,
   * you may want to factor in a safety margin and set a lower max instances
   * value than your function can tolerate.
   * See the [Max
   * Instances](https://cloud.google.com/functions/docs/max-instances) Guide for
   * more details.
   * </pre>
   *
   * <code>int32 max_instance_count = 5;</code>
   * @return The maxInstanceCount.
   */
  int getMaxInstanceCount();

  /**
   * <pre>
   * The limit on the minimum number of function instances that may coexist at a
   * given time.
   * Function instances are kept in idle state for a short period after they
   * finished executing the request to reduce cold start time for subsequent
   * requests. Setting a minimum instance count will ensure that the given
   * number of instances are kept running in idle state always. This can help
   * with cold start times when jump in incoming request count occurs after the
   * idle instance would have been stopped in the default case.
   * </pre>
   *
   * <code>int32 min_instance_count = 12;</code>
   * @return The minInstanceCount.
   */
  int getMinInstanceCount();

  /**
   * <pre>
   * The Serverless VPC Access connector that this cloud function can connect
   * to. The format of this field is `projects/&#42;&#47;locations/&#42;&#47;connectors/&#42;`.
   * </pre>
   *
   * <code>string vpc_connector = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The vpcConnector.
   */
  java.lang.String getVpcConnector();
  /**
   * <pre>
   * The Serverless VPC Access connector that this cloud function can connect
   * to. The format of this field is `projects/&#42;&#47;locations/&#42;&#47;connectors/&#42;`.
   * </pre>
   *
   * <code>string vpc_connector = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for vpcConnector.
   */
  com.google.protobuf.ByteString
      getVpcConnectorBytes();

  /**
   * <pre>
   * The egress settings for the connector, controlling what traffic is diverted
   * through it.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.ServiceConfig.VpcConnectorEgressSettings vpc_connector_egress_settings = 7;</code>
   * @return The enum numeric value on the wire for vpcConnectorEgressSettings.
   */
  int getVpcConnectorEgressSettingsValue();
  /**
   * <pre>
   * The egress settings for the connector, controlling what traffic is diverted
   * through it.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.ServiceConfig.VpcConnectorEgressSettings vpc_connector_egress_settings = 7;</code>
   * @return The vpcConnectorEgressSettings.
   */
  com.google.cloud.functions.v2alpha.ServiceConfig.VpcConnectorEgressSettings getVpcConnectorEgressSettings();

  /**
   * <pre>
   * The ingress settings for the function, controlling what traffic can reach
   * it.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.ServiceConfig.IngressSettings ingress_settings = 8;</code>
   * @return The enum numeric value on the wire for ingressSettings.
   */
  int getIngressSettingsValue();
  /**
   * <pre>
   * The ingress settings for the function, controlling what traffic can reach
   * it.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.ServiceConfig.IngressSettings ingress_settings = 8;</code>
   * @return The ingressSettings.
   */
  com.google.cloud.functions.v2alpha.ServiceConfig.IngressSettings getIngressSettings();

  /**
   * <pre>
   * Output only. URI of the Service deployed.
   * </pre>
   *
   * <code>string uri = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Output only. URI of the Service deployed.
   * </pre>
   *
   * <code>string uri = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The email of the service's service account. If empty, defaults to
   * `{project_number}-compute&#64;developer.gserviceaccount.com`.
   * </pre>
   *
   * <code>string service_account_email = 10;</code>
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   * <pre>
   * The email of the service's service account. If empty, defaults to
   * `{project_number}-compute&#64;developer.gserviceaccount.com`.
   * </pre>
   *
   * <code>string service_account_email = 10;</code>
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString
      getServiceAccountEmailBytes();

  /**
   * <pre>
   * Whether 100% of traffic is routed to the latest revision.
   * On CreateFunction and UpdateFunction, when set to true, the revision being
   * deployed will serve 100% of traffic, ignoring any traffic split settings,
   * if any. On GetFunction, true will be returned if the latest revision is
   * serving 100% of traffic.
   * </pre>
   *
   * <code>bool all_traffic_on_latest_revision = 16;</code>
   * @return The allTrafficOnLatestRevision.
   */
  boolean getAllTrafficOnLatestRevision();

  /**
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretEnvVar secret_environment_variables = 17;</code>
   */
  java.util.List<com.google.cloud.functions.v2alpha.SecretEnvVar> 
      getSecretEnvironmentVariablesList();
  /**
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretEnvVar secret_environment_variables = 17;</code>
   */
  com.google.cloud.functions.v2alpha.SecretEnvVar getSecretEnvironmentVariables(int index);
  /**
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretEnvVar secret_environment_variables = 17;</code>
   */
  int getSecretEnvironmentVariablesCount();
  /**
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretEnvVar secret_environment_variables = 17;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v2alpha.SecretEnvVarOrBuilder> 
      getSecretEnvironmentVariablesOrBuilderList();
  /**
   * <pre>
   * Secret environment variables configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretEnvVar secret_environment_variables = 17;</code>
   */
  com.google.cloud.functions.v2alpha.SecretEnvVarOrBuilder getSecretEnvironmentVariablesOrBuilder(
      int index);

  /**
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretVolume secret_volumes = 19;</code>
   */
  java.util.List<com.google.cloud.functions.v2alpha.SecretVolume> 
      getSecretVolumesList();
  /**
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretVolume secret_volumes = 19;</code>
   */
  com.google.cloud.functions.v2alpha.SecretVolume getSecretVolumes(int index);
  /**
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretVolume secret_volumes = 19;</code>
   */
  int getSecretVolumesCount();
  /**
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretVolume secret_volumes = 19;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v2alpha.SecretVolumeOrBuilder> 
      getSecretVolumesOrBuilderList();
  /**
   * <pre>
   * Secret volumes configuration.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.SecretVolume secret_volumes = 19;</code>
   */
  com.google.cloud.functions.v2alpha.SecretVolumeOrBuilder getSecretVolumesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The name of service revision.
   * </pre>
   *
   * <code>string revision = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   * <pre>
   * Output only. The name of service revision.
   * </pre>
   *
   * <code>string revision = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString
      getRevisionBytes();
}