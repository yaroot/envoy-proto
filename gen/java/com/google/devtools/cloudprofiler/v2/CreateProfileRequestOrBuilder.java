// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudprofiler/v2/profiler.proto

package com.google.devtools.cloudprofiler.v2;

public interface CreateProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudprofiler.v2.CreateProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parent project to create the profile in.
   * </pre>
   *
   * <code>string parent = 4;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Parent project to create the profile in.
   * </pre>
   *
   * <code>string parent = 4;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Deployment details.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Deployment deployment = 1;</code>
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   * <pre>
   * Deployment details.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Deployment deployment = 1;</code>
   * @return The deployment.
   */
  com.google.devtools.cloudprofiler.v2.Deployment getDeployment();
  /**
   * <pre>
   * Deployment details.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Deployment deployment = 1;</code>
   */
  com.google.devtools.cloudprofiler.v2.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   * <pre>
   * One or more profile types that the agent is capable of providing.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   * @return A list containing the profileType.
   */
  java.util.List<com.google.devtools.cloudprofiler.v2.ProfileType> getProfileTypeList();
  /**
   * <pre>
   * One or more profile types that the agent is capable of providing.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   * @return The count of profileType.
   */
  int getProfileTypeCount();
  /**
   * <pre>
   * One or more profile types that the agent is capable of providing.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   * @param index The index of the element to return.
   * @return The profileType at the given index.
   */
  com.google.devtools.cloudprofiler.v2.ProfileType getProfileType(int index);
  /**
   * <pre>
   * One or more profile types that the agent is capable of providing.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   * @return A list containing the enum numeric values on the wire for profileType.
   */
  java.util.List<java.lang.Integer>
  getProfileTypeValueList();
  /**
   * <pre>
   * One or more profile types that the agent is capable of providing.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of profileType at the given index.
   */
  int getProfileTypeValue(int index);
}