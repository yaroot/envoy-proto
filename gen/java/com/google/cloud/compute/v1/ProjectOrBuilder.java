// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Metadata common_instance_metadata = 185794117;</code>
   * @return Whether the commonInstanceMetadata field is set.
   */
  boolean hasCommonInstanceMetadata();
  /**
   * <pre>
   * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Metadata common_instance_metadata = 185794117;</code>
   * @return The commonInstanceMetadata.
   */
  com.google.cloud.compute.v1.Metadata getCommonInstanceMetadata();
  /**
   * <pre>
   * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Metadata common_instance_metadata = 185794117;</code>
   */
  com.google.cloud.compute.v1.MetadataOrBuilder getCommonInstanceMetadataOrBuilder();

  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString
      getCreationTimestampBytes();

  /**
   * <pre>
   * This signifies the default network tier used for configuring resources of the project and can only take the following values: PREMIUM, STANDARD. Initially the default network tier is PREMIUM.
   * Check the DefaultNetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string default_network_tier = 471753361;</code>
   * @return Whether the defaultNetworkTier field is set.
   */
  boolean hasDefaultNetworkTier();
  /**
   * <pre>
   * This signifies the default network tier used for configuring resources of the project and can only take the following values: PREMIUM, STANDARD. Initially the default network tier is PREMIUM.
   * Check the DefaultNetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string default_network_tier = 471753361;</code>
   * @return The defaultNetworkTier.
   */
  java.lang.String getDefaultNetworkTier();
  /**
   * <pre>
   * This signifies the default network tier used for configuring resources of the project and can only take the following values: PREMIUM, STANDARD. Initially the default network tier is PREMIUM.
   * Check the DefaultNetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string default_network_tier = 471753361;</code>
   * @return The bytes for defaultNetworkTier.
   */
  com.google.protobuf.ByteString
      getDefaultNetworkTierBytes();

  /**
   * <pre>
   * [Output Only] Default service account used by VMs running in this project.
   * </pre>
   *
   * <code>optional string default_service_account = 298712229;</code>
   * @return Whether the defaultServiceAccount field is set.
   */
  boolean hasDefaultServiceAccount();
  /**
   * <pre>
   * [Output Only] Default service account used by VMs running in this project.
   * </pre>
   *
   * <code>optional string default_service_account = 298712229;</code>
   * @return The defaultServiceAccount.
   */
  java.lang.String getDefaultServiceAccount();
  /**
   * <pre>
   * [Output Only] Default service account used by VMs running in this project.
   * </pre>
   *
   * <code>optional string default_service_account = 298712229;</code>
   * @return The bytes for defaultServiceAccount.
   */
  com.google.protobuf.ByteString
      getDefaultServiceAccountBytes();

  /**
   * <pre>
   * An optional textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * An optional textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   * @return A list containing the enabledFeatures.
   */
  java.util.List<java.lang.String>
      getEnabledFeaturesList();
  /**
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   * @return The count of enabledFeatures.
   */
  int getEnabledFeaturesCount();
  /**
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   * @param index The index of the element to return.
   * @return The enabledFeatures at the given index.
   */
  java.lang.String getEnabledFeatures(int index);
  /**
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   * @param index The index of the value to return.
   * @return The bytes of the enabledFeatures at the given index.
   */
  com.google.protobuf.ByteString
      getEnabledFeaturesBytes(int index);

  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is *not* the project ID, and is just a unique ID used by Compute Engine to identify resources.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is *not* the project ID, and is just a unique ID used by Compute Engine to identify resources.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#project for projects.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#project for projects.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#project for projects.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Quota> 
      getQuotasList();
  /**
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  com.google.cloud.compute.v1.Quota getQuotas(int index);
  /**
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  int getQuotasCount();
  /**
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.QuotaOrBuilder> 
      getQuotasOrBuilderList();
  /**
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  com.google.cloud.compute.v1.QuotaOrBuilder getQuotasOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UsageExportLocation usage_export_location = 347543874;</code>
   * @return Whether the usageExportLocation field is set.
   */
  boolean hasUsageExportLocation();
  /**
   * <pre>
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UsageExportLocation usage_export_location = 347543874;</code>
   * @return The usageExportLocation.
   */
  com.google.cloud.compute.v1.UsageExportLocation getUsageExportLocation();
  /**
   * <pre>
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UsageExportLocation usage_export_location = 347543874;</code>
   */
  com.google.cloud.compute.v1.UsageExportLocationOrBuilder getUsageExportLocationOrBuilder();

  /**
   * <pre>
   * [Output Only] Default internal DNS setting used by VMs running in this project.
   * Check the VmDnsSetting enum for the list of possible values.
   * </pre>
   *
   * <code>optional string vm_dns_setting = 58856370;</code>
   * @return Whether the vmDnsSetting field is set.
   */
  boolean hasVmDnsSetting();
  /**
   * <pre>
   * [Output Only] Default internal DNS setting used by VMs running in this project.
   * Check the VmDnsSetting enum for the list of possible values.
   * </pre>
   *
   * <code>optional string vm_dns_setting = 58856370;</code>
   * @return The vmDnsSetting.
   */
  java.lang.String getVmDnsSetting();
  /**
   * <pre>
   * [Output Only] Default internal DNS setting used by VMs running in this project.
   * Check the VmDnsSetting enum for the list of possible values.
   * </pre>
   *
   * <code>optional string vm_dns_setting = 58856370;</code>
   * @return The bytes for vmDnsSetting.
   */
  com.google.protobuf.ByteString
      getVmDnsSettingBytes();

  /**
   * <pre>
   * [Output Only] The role this project has in a shared VPC configuration. Currently, only projects with the host role, which is specified by the value HOST, are differentiated.
   * Check the XpnProjectStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string xpn_project_status = 228419265;</code>
   * @return Whether the xpnProjectStatus field is set.
   */
  boolean hasXpnProjectStatus();
  /**
   * <pre>
   * [Output Only] The role this project has in a shared VPC configuration. Currently, only projects with the host role, which is specified by the value HOST, are differentiated.
   * Check the XpnProjectStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string xpn_project_status = 228419265;</code>
   * @return The xpnProjectStatus.
   */
  java.lang.String getXpnProjectStatus();
  /**
   * <pre>
   * [Output Only] The role this project has in a shared VPC configuration. Currently, only projects with the host role, which is specified by the value HOST, are differentiated.
   * Check the XpnProjectStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string xpn_project_status = 228419265;</code>
   * @return The bytes for xpnProjectStatus.
   */
  com.google.protobuf.ByteString
      getXpnProjectStatusBytes();
}