// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1/datafusion.proto

package com.google.cloud.datafusion.v1;

public interface InstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A description of this instance.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description of this instance.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Required. Instance type.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance.Type type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. Instance type.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance.Type type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.cloud.datafusion.v1.Instance.Type getType();

  /**
   * <pre>
   * Option to enable Stackdriver Logging.
   * </pre>
   *
   * <code>bool enable_stackdriver_logging = 4;</code>
   * @return The enableStackdriverLogging.
   */
  boolean getEnableStackdriverLogging();

  /**
   * <pre>
   * Option to enable Stackdriver Monitoring.
   * </pre>
   *
   * <code>bool enable_stackdriver_monitoring = 5;</code>
   * @return The enableStackdriverMonitoring.
   */
  boolean getEnableStackdriverMonitoring();

  /**
   * <pre>
   * Specifies whether the Data Fusion instance should be private. If set to
   * true, all Data Fusion nodes will have private IP addresses and will not be
   * able to access the public internet.
   * </pre>
   *
   * <code>bool private_instance = 6;</code>
   * @return The privateInstance.
   */
  boolean getPrivateInstance();

  /**
   * <pre>
   * Network configuration options. These are required when a private Data
   * Fusion instance is to be created.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.NetworkConfig network_config = 7;</code>
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   * <pre>
   * Network configuration options. These are required when a private Data
   * Fusion instance is to be created.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.NetworkConfig network_config = 7;</code>
   * @return The networkConfig.
   */
  com.google.cloud.datafusion.v1.NetworkConfig getNetworkConfig();
  /**
   * <pre>
   * Network configuration options. These are required when a private Data
   * Fusion instance is to be created.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.NetworkConfig network_config = 7;</code>
   */
  com.google.cloud.datafusion.v1.NetworkConfigOrBuilder getNetworkConfigOrBuilder();

  /**
   * <pre>
   * The resource labels for instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. The character '=' is not allowed to
   * be used within the labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The resource labels for instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. The character '=' is not allowed to
   * be used within the labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The resource labels for instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. The character '=' is not allowed to
   * be used within the labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The resource labels for instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. The character '=' is not allowed to
   * be used within the labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The resource labels for instance to use to annotate any related underlying
   * resources such as Compute Engine VMs. The character '=' is not allowed to
   * be used within the labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Map of additional options used to configure the behavior of
   * Data Fusion instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 9;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Map of additional options used to configure the behavior of
   * Data Fusion instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 9;</code>
   */
  boolean containsOptions(
      java.lang.String key);
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getOptions();
  /**
   * <pre>
   * Map of additional options used to configure the behavior of
   * Data Fusion instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getOptionsMap();
  /**
   * <pre>
   * Map of additional options used to configure the behavior of
   * Data Fusion instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 9;</code>
   */
  /* nullable */
java.lang.String getOptionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Map of additional options used to configure the behavior of
   * Data Fusion instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; options = 9;</code>
   */
  java.lang.String getOptionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time the instance was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time the instance was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time the instance was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The current state of this Data Fusion instance.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance.State state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state of this Data Fusion instance.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance.State state = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.datafusion.v1.Instance.State getState();

  /**
   * <pre>
   * Output only. Additional information about the current state of this Data
   * Fusion instance if available.
   * </pre>
   *
   * <code>string state_message = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   * <pre>
   * Output only. Additional information about the current state of this Data
   * Fusion instance if available.
   * </pre>
   *
   * <code>string state_message = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString
      getStateMessageBytes();

  /**
   * <pre>
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * </pre>
   *
   * <code>string service_endpoint = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The serviceEndpoint.
   */
  java.lang.String getServiceEndpoint();
  /**
   * <pre>
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * </pre>
   *
   * <code>string service_endpoint = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for serviceEndpoint.
   */
  com.google.protobuf.ByteString
      getServiceEndpointBytes();

  /**
   * <pre>
   * Name of the zone in which the Data Fusion instance will be created. Only
   * DEVELOPER instances use this field.
   * </pre>
   *
   * <code>string zone = 15;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Name of the zone in which the Data Fusion instance will be created. Only
   * DEVELOPER instances use this field.
   * </pre>
   *
   * <code>string zone = 15;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Current version of the Data Fusion. Only specifiable in Update.
   * </pre>
   *
   * <code>string version = 16;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Current version of the Data Fusion. Only specifiable in Update.
   * </pre>
   *
   * <code>string version = 16;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * </pre>
   *
   * <code>string service_account = 17 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @deprecated google.cloud.datafusion.v1.Instance.service_account is deprecated.
   *     See google/cloud/datafusion/v1/datafusion.proto;l=361
   * @return The serviceAccount.
   */
  @java.lang.Deprecated java.lang.String getServiceAccount();
  /**
   * <pre>
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * </pre>
   *
   * <code>string service_account = 17 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @deprecated google.cloud.datafusion.v1.Instance.service_account is deprecated.
   *     See google/cloud/datafusion/v1/datafusion.proto;l=361
   * @return The bytes for serviceAccount.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * Display name for an instance.
   * </pre>
   *
   * <code>string display_name = 18;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Display name for an instance.
   * </pre>
   *
   * <code>string display_name = 18;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Version available_version = 19;</code>
   */
  java.util.List<com.google.cloud.datafusion.v1.Version> 
      getAvailableVersionList();
  /**
   * <pre>
   * Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Version available_version = 19;</code>
   */
  com.google.cloud.datafusion.v1.Version getAvailableVersion(int index);
  /**
   * <pre>
   * Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Version available_version = 19;</code>
   */
  int getAvailableVersionCount();
  /**
   * <pre>
   * Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Version available_version = 19;</code>
   */
  java.util.List<? extends com.google.cloud.datafusion.v1.VersionOrBuilder> 
      getAvailableVersionOrBuilderList();
  /**
   * <pre>
   * Available versions that the instance can be upgraded to using
   * UpdateInstanceRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Version available_version = 19;</code>
   */
  com.google.cloud.datafusion.v1.VersionOrBuilder getAvailableVersionOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Endpoint on which the REST APIs is accessible.
   * </pre>
   *
   * <code>string api_endpoint = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The apiEndpoint.
   */
  java.lang.String getApiEndpoint();
  /**
   * <pre>
   * Output only. Endpoint on which the REST APIs is accessible.
   * </pre>
   *
   * <code>string api_endpoint = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for apiEndpoint.
   */
  com.google.protobuf.ByteString
      getApiEndpointBytes();

  /**
   * <pre>
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * </pre>
   *
   * <code>string gcs_bucket = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The gcsBucket.
   */
  java.lang.String getGcsBucket();
  /**
   * <pre>
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * </pre>
   *
   * <code>string gcs_bucket = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for gcsBucket.
   */
  com.google.protobuf.ByteString
      getGcsBucketBytes();

  /**
   * <pre>
   * List of accelerators enabled for this CDF instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Accelerator accelerators = 22;</code>
   */
  java.util.List<com.google.cloud.datafusion.v1.Accelerator> 
      getAcceleratorsList();
  /**
   * <pre>
   * List of accelerators enabled for this CDF instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Accelerator accelerators = 22;</code>
   */
  com.google.cloud.datafusion.v1.Accelerator getAccelerators(int index);
  /**
   * <pre>
   * List of accelerators enabled for this CDF instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Accelerator accelerators = 22;</code>
   */
  int getAcceleratorsCount();
  /**
   * <pre>
   * List of accelerators enabled for this CDF instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Accelerator accelerators = 22;</code>
   */
  java.util.List<? extends com.google.cloud.datafusion.v1.AcceleratorOrBuilder> 
      getAcceleratorsOrBuilderList();
  /**
   * <pre>
   * List of accelerators enabled for this CDF instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Accelerator accelerators = 22;</code>
   */
  com.google.cloud.datafusion.v1.AcceleratorOrBuilder getAcceleratorsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. P4 service account for the customer project.
   * </pre>
   *
   * <code>string p4_service_account = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The p4ServiceAccount.
   */
  java.lang.String getP4ServiceAccount();
  /**
   * <pre>
   * Output only. P4 service account for the customer project.
   * </pre>
   *
   * <code>string p4_service_account = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for p4ServiceAccount.
   */
  com.google.protobuf.ByteString
      getP4ServiceAccountBytes();

  /**
   * <pre>
   * Output only. The name of the tenant project.
   * </pre>
   *
   * <code>string tenant_project_id = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The tenantProjectId.
   */
  java.lang.String getTenantProjectId();
  /**
   * <pre>
   * Output only. The name of the tenant project.
   * </pre>
   *
   * <code>string tenant_project_id = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for tenantProjectId.
   */
  com.google.protobuf.ByteString
      getTenantProjectIdBytes();

  /**
   * <pre>
   * User-managed service account to set on Dataproc when Cloud Data Fusion
   * creates Dataproc to run data processing pipelines.
   * This allows users to have fine-grained access control on Dataproc's
   * accesses to cloud resources.
   * </pre>
   *
   * <code>string dataproc_service_account = 25;</code>
   * @return The dataprocServiceAccount.
   */
  java.lang.String getDataprocServiceAccount();
  /**
   * <pre>
   * User-managed service account to set on Dataproc when Cloud Data Fusion
   * creates Dataproc to run data processing pipelines.
   * This allows users to have fine-grained access control on Dataproc's
   * accesses to cloud resources.
   * </pre>
   *
   * <code>string dataproc_service_account = 25;</code>
   * @return The bytes for dataprocServiceAccount.
   */
  com.google.protobuf.ByteString
      getDataprocServiceAccountBytes();

  /**
   * <pre>
   * Option to enable granular role-based access control.
   * </pre>
   *
   * <code>bool enable_rbac = 27;</code>
   * @return The enableRbac.
   */
  boolean getEnableRbac();

  /**
   * <pre>
   * The crypto key configuration. This field is used by the Customer-Managed
   * Encryption Keys (CMEK) feature.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.CryptoKeyConfig crypto_key_config = 28;</code>
   * @return Whether the cryptoKeyConfig field is set.
   */
  boolean hasCryptoKeyConfig();
  /**
   * <pre>
   * The crypto key configuration. This field is used by the Customer-Managed
   * Encryption Keys (CMEK) feature.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.CryptoKeyConfig crypto_key_config = 28;</code>
   * @return The cryptoKeyConfig.
   */
  com.google.cloud.datafusion.v1.CryptoKeyConfig getCryptoKeyConfig();
  /**
   * <pre>
   * The crypto key configuration. This field is used by the Customer-Managed
   * Encryption Keys (CMEK) feature.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.CryptoKeyConfig crypto_key_config = 28;</code>
   */
  com.google.cloud.datafusion.v1.CryptoKeyConfigOrBuilder getCryptoKeyConfigOrBuilder();

  /**
   * <pre>
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Instance.DisabledReason disabled_reason = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the disabledReason.
   */
  java.util.List<com.google.cloud.datafusion.v1.Instance.DisabledReason> getDisabledReasonList();
  /**
   * <pre>
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Instance.DisabledReason disabled_reason = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of disabledReason.
   */
  int getDisabledReasonCount();
  /**
   * <pre>
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Instance.DisabledReason disabled_reason = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The disabledReason at the given index.
   */
  com.google.cloud.datafusion.v1.Instance.DisabledReason getDisabledReason(int index);
  /**
   * <pre>
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Instance.DisabledReason disabled_reason = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enum numeric values on the wire for disabledReason.
   */
  java.util.List<java.lang.Integer>
  getDisabledReasonValueList();
  /**
   * <pre>
   * Output only. If the instance state is DISABLED, the reason for disabling the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1.Instance.DisabledReason disabled_reason = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of disabledReason at the given index.
   */
  int getDisabledReasonValue(int index);
}
