// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document_schema.proto

package com.google.cloud.contentwarehouse.v1;

public interface PropertyTypeOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.PropertyTypeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. List of property definitions.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.PropertyDefinition> 
      getPropertyDefinitionsList();
  /**
   * <pre>
   * Required. List of property definitions.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.contentwarehouse.v1.PropertyDefinition getPropertyDefinitions(int index);
  /**
   * <pre>
   * Required. List of property definitions.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getPropertyDefinitionsCount();
  /**
   * <pre>
   * Required. List of property definitions.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.PropertyDefinitionOrBuilder> 
      getPropertyDefinitionsOrBuilderList();
  /**
   * <pre>
   * Required. List of property definitions.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.PropertyDefinition property_definitions = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.contentwarehouse.v1.PropertyDefinitionOrBuilder getPropertyDefinitionsOrBuilder(
      int index);
}