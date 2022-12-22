// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/labels/v2beta/field.proto

package com.google.apps.drive.labels.v2beta;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.labels.v2beta.Field)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Text field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.TextOptions text_options = 16;</code>
   * @return Whether the textOptions field is set.
   */
  boolean hasTextOptions();
  /**
   * <pre>
   * Text field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.TextOptions text_options = 16;</code>
   * @return The textOptions.
   */
  com.google.apps.drive.labels.v2beta.Field.TextOptions getTextOptions();
  /**
   * <pre>
   * Text field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.TextOptions text_options = 16;</code>
   */
  com.google.apps.drive.labels.v2beta.Field.TextOptionsOrBuilder getTextOptionsOrBuilder();

  /**
   * <pre>
   * Integer field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.IntegerOptions integer_options = 18;</code>
   * @return Whether the integerOptions field is set.
   */
  boolean hasIntegerOptions();
  /**
   * <pre>
   * Integer field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.IntegerOptions integer_options = 18;</code>
   * @return The integerOptions.
   */
  com.google.apps.drive.labels.v2beta.Field.IntegerOptions getIntegerOptions();
  /**
   * <pre>
   * Integer field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.IntegerOptions integer_options = 18;</code>
   */
  com.google.apps.drive.labels.v2beta.Field.IntegerOptionsOrBuilder getIntegerOptionsOrBuilder();

  /**
   * <pre>
   * Date field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.DateOptions date_options = 19;</code>
   * @return Whether the dateOptions field is set.
   */
  boolean hasDateOptions();
  /**
   * <pre>
   * Date field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.DateOptions date_options = 19;</code>
   * @return The dateOptions.
   */
  com.google.apps.drive.labels.v2beta.Field.DateOptions getDateOptions();
  /**
   * <pre>
   * Date field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.DateOptions date_options = 19;</code>
   */
  com.google.apps.drive.labels.v2beta.Field.DateOptionsOrBuilder getDateOptionsOrBuilder();

  /**
   * <pre>
   * Selection field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.SelectionOptions selection_options = 20;</code>
   * @return Whether the selectionOptions field is set.
   */
  boolean hasSelectionOptions();
  /**
   * <pre>
   * Selection field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.SelectionOptions selection_options = 20;</code>
   * @return The selectionOptions.
   */
  com.google.apps.drive.labels.v2beta.Field.SelectionOptions getSelectionOptions();
  /**
   * <pre>
   * Selection field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.SelectionOptions selection_options = 20;</code>
   */
  com.google.apps.drive.labels.v2beta.Field.SelectionOptionsOrBuilder getSelectionOptionsOrBuilder();

  /**
   * <pre>
   * User field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.UserOptions user_options = 21;</code>
   * @return Whether the userOptions field is set.
   */
  boolean hasUserOptions();
  /**
   * <pre>
   * User field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.UserOptions user_options = 21;</code>
   * @return The userOptions.
   */
  com.google.apps.drive.labels.v2beta.Field.UserOptions getUserOptions();
  /**
   * <pre>
   * User field options.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.UserOptions user_options = 21;</code>
   */
  com.google.apps.drive.labels.v2beta.Field.UserOptionsOrBuilder getUserOptionsOrBuilder();

  /**
   * <pre>
   * Output only. The key of a field, unique within a label or library.
   * This value is autogenerated. Matches the regex: `([a-zA-Z0-9])+`
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The key of a field, unique within a label or library.
   * This value is autogenerated. Matches the regex: `([a-zA-Z0-9])+`
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The key to use when constructing Drive search queries to find
   * files based on values defined for this field on files.
   * For example, "`{query_key}` &gt; 2001-01-01".
   * </pre>
   *
   * <code>string query_key = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The queryKey.
   */
  java.lang.String getQueryKey();
  /**
   * <pre>
   * Output only. The key to use when constructing Drive search queries to find
   * files based on values defined for this field on files.
   * For example, "`{query_key}` &gt; 2001-01-01".
   * </pre>
   *
   * <code>string query_key = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for queryKey.
   */
  com.google.protobuf.ByteString
      getQueryKeyBytes();

  /**
   * <pre>
   * The basic properties of the field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.Properties properties = 3;</code>
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   * <pre>
   * The basic properties of the field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.Properties properties = 3;</code>
   * @return The properties.
   */
  com.google.apps.drive.labels.v2beta.Field.Properties getProperties();
  /**
   * <pre>
   * The basic properties of the field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.Properties properties = 3;</code>
   */
  com.google.apps.drive.labels.v2beta.Field.PropertiesOrBuilder getPropertiesOrBuilder();

  /**
   * <pre>
   * Output only. The lifecycle of this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Lifecycle lifecycle = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lifecycle field is set.
   */
  boolean hasLifecycle();
  /**
   * <pre>
   * Output only. The lifecycle of this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Lifecycle lifecycle = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lifecycle.
   */
  com.google.apps.drive.labels.v2beta.Lifecycle getLifecycle();
  /**
   * <pre>
   * Output only. The lifecycle of this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Lifecycle lifecycle = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.LifecycleOrBuilder getLifecycleOrBuilder();

  /**
   * <pre>
   * Output only. UI display hints for rendering a field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.DisplayHints display_hints = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the displayHints field is set.
   */
  boolean hasDisplayHints();
  /**
   * <pre>
   * Output only. UI display hints for rendering a field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.DisplayHints display_hints = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayHints.
   */
  com.google.apps.drive.labels.v2beta.Field.DisplayHints getDisplayHints();
  /**
   * <pre>
   * Output only. UI display hints for rendering a field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.DisplayHints display_hints = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.Field.DisplayHintsOrBuilder getDisplayHintsOrBuilder();

  /**
   * <pre>
   * Output only. The capabilities this user has when editing this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.SchemaCapabilities schema_capabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the schemaCapabilities field is set.
   */
  boolean hasSchemaCapabilities();
  /**
   * <pre>
   * Output only. The capabilities this user has when editing this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.SchemaCapabilities schema_capabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The schemaCapabilities.
   */
  com.google.apps.drive.labels.v2beta.Field.SchemaCapabilities getSchemaCapabilities();
  /**
   * <pre>
   * Output only. The capabilities this user has when editing this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.SchemaCapabilities schema_capabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.Field.SchemaCapabilitiesOrBuilder getSchemaCapabilitiesOrBuilder();

  /**
   * <pre>
   * Output only. The capabilities this user has on this field and its value
   * when the label is applied on Drive items.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.AppliedCapabilities applied_capabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the appliedCapabilities field is set.
   */
  boolean hasAppliedCapabilities();
  /**
   * <pre>
   * Output only. The capabilities this user has on this field and its value
   * when the label is applied on Drive items.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.AppliedCapabilities applied_capabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The appliedCapabilities.
   */
  com.google.apps.drive.labels.v2beta.Field.AppliedCapabilities getAppliedCapabilities();
  /**
   * <pre>
   * Output only. The capabilities this user has on this field and its value
   * when the label is applied on Drive items.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.Field.AppliedCapabilities applied_capabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.Field.AppliedCapabilitiesOrBuilder getAppliedCapabilitiesOrBuilder();

  /**
   * <pre>
   * Output only. The user who created this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo creator = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the creator field is set.
   */
  boolean hasCreator();
  /**
   * <pre>
   * Output only. The user who created this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo creator = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creator.
   */
  com.google.apps.drive.labels.v2beta.UserInfo getCreator();
  /**
   * <pre>
   * Output only. The user who created this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo creator = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.UserInfoOrBuilder getCreatorOrBuilder();

  /**
   * <pre>
   * Output only. The time this field was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time this field was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time this field was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The user who modified this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo updater = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updater field is set.
   */
  boolean hasUpdater();
  /**
   * <pre>
   * Output only. The user who modified this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo updater = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updater.
   */
  com.google.apps.drive.labels.v2beta.UserInfo getUpdater();
  /**
   * <pre>
   * Output only. The user who modified this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo updater = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.UserInfoOrBuilder getUpdaterOrBuilder();

  /**
   * <pre>
   * Output only. The time this field was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time this field was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time this field was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The user who published this field. This value has no meaning
   * when the field is not published.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo publisher = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the publisher field is set.
   */
  boolean hasPublisher();
  /**
   * <pre>
   * Output only. The user who published this field. This value has no meaning
   * when the field is not published.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo publisher = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The publisher.
   */
  com.google.apps.drive.labels.v2beta.UserInfo getPublisher();
  /**
   * <pre>
   * Output only. The user who published this field. This value has no meaning
   * when the field is not published.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo publisher = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.UserInfoOrBuilder getPublisherOrBuilder();

  /**
   * <pre>
   * Output only. The user who disabled this field. This value has no meaning
   * when the field is not disabled.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo disabler = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the disabler field is set.
   */
  boolean hasDisabler();
  /**
   * <pre>
   * Output only. The user who disabled this field. This value has no meaning
   * when the field is not disabled.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo disabler = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The disabler.
   */
  com.google.apps.drive.labels.v2beta.UserInfo getDisabler();
  /**
   * <pre>
   * Output only. The user who disabled this field. This value has no meaning
   * when the field is not disabled.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.UserInfo disabler = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.UserInfoOrBuilder getDisablerOrBuilder();

  /**
   * <pre>
   * Output only. The time this field was disabled. This value has no meaning
   * when the field is not disabled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp disable_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the disableTime field is set.
   */
  boolean hasDisableTime();
  /**
   * <pre>
   * Output only. The time this field was disabled. This value has no meaning
   * when the field is not disabled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp disable_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The disableTime.
   */
  com.google.protobuf.Timestamp getDisableTime();
  /**
   * <pre>
   * Output only. The time this field was disabled. This value has no meaning
   * when the field is not disabled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp disable_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDisableTimeOrBuilder();

  /**
   * <pre>
   * Output only. The LockStatus of this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.LockStatus lock_status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lockStatus field is set.
   */
  boolean hasLockStatus();
  /**
   * <pre>
   * Output only. The LockStatus of this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.LockStatus lock_status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lockStatus.
   */
  com.google.apps.drive.labels.v2beta.LockStatus getLockStatus();
  /**
   * <pre>
   * Output only. The LockStatus of this field.
   * </pre>
   *
   * <code>.google.apps.drive.labels.v2beta.LockStatus lock_status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.apps.drive.labels.v2beta.LockStatusOrBuilder getLockStatusOrBuilder();

  public com.google.apps.drive.labels.v2beta.Field.TypeCase getTypeCase();
}