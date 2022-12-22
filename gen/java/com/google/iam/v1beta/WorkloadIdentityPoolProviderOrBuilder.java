// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1beta/workload_identity_pool.proto

package com.google.iam.v1beta;

public interface WorkloadIdentityPoolProviderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1beta.WorkloadIdentityPoolProvider)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the provider.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the provider.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A display name for the provider. Cannot exceed 32 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A display name for the provider. Cannot exceed 32 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A description for the provider. Cannot exceed 256 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description for the provider. Cannot exceed 256 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. The state of the provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The state of the provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.iam.v1beta.WorkloadIdentityPoolProvider.State getState();

  /**
   * <pre>
   * Whether the provider is disabled. You cannot use a disabled provider to
   * exchange tokens. However, existing tokens still grant access.
   * </pre>
   *
   * <code>bool disabled = 5;</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * Maps attributes from authentication credentials issued by an external
   * identity provider to Google Cloud attributes, such as `subject` and
   * `segment`.
   * Each key must be a string specifying the Google Cloud IAM attribute to
   * map to.
   * The following keys are supported:
   * * `google.subject`: The principal IAM is authenticating. You can reference
   *                     this value in IAM bindings. This is also the
   *                     subject that appears in Cloud Logging logs.
   *                     Cannot exceed 127 characters.
   * * `google.groups`: Groups the external identity belongs to. You can grant
   *                    groups access to resources using an IAM `principalSet`
   *                    binding; access applies to all members of the group.
   * You can also provide custom attributes by specifying
   * `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of
   * the custom attribute to be mapped. You can define a maximum of 50 custom
   * attributes. The maximum length of a mapped attribute key is
   * 100 characters, and the key may only contain the characters [a-z0-9_].
   * You can reference these attributes in IAM policies to define fine-grained
   * access for a workload to Google Cloud resources. For example:
   * * `google.subject`:
   * `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
   * * `google.groups`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
   * * `attribute.{custom_attribute}`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
   * Each value must be a [Common Expression Language]
   * (https://opensource.google/projects/cel) function that maps an
   * identity provider credential to the normalized attribute specified by the
   * corresponding map key.
   * You can use the `assertion` keyword in the expression to access a JSON
   * representation of the authentication credential issued by the provider.
   * The maximum length of an attribute mapping expression is 2048 characters.
   * When evaluated, the total size of all mapped attributes must not exceed
   * 8KB.
   * For AWS providers, the following rules apply:
   * - If no attribute mapping is defined, the following default mapping
   *   applies:
   *   ```
   *   {
   *     "google.subject":"assertion.arn",
   *     "attribute.aws_role":
   *         "assertion.arn.contains('assumed-role')"
   *         " ? assertion.arn.extract('{account_arn}assumed-role/')"
   *         "   + 'assumed-role/'"
   *         "   + assertion.arn.extract('assumed-role/{role_name}/')"
   *         " : assertion.arn",
   *   }
   *   ```
   * - If any custom attribute mappings are defined, they must include a mapping
   *   to the `google.subject` attribute.
   * For OIDC providers, the following rules apply:
   * - Custom attribute mappings must be defined, and must include a mapping to
   *   the `google.subject` attribute. For example, the following maps the
   *   `sub` claim of the incoming credential to the `subject` attribute on
   *   a Google token.
   *   ```
   *   {"google.subject": "assertion.sub"}
   *   ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; attribute_mapping = 6;</code>
   */
  int getAttributeMappingCount();
  /**
   * <pre>
   * Maps attributes from authentication credentials issued by an external
   * identity provider to Google Cloud attributes, such as `subject` and
   * `segment`.
   * Each key must be a string specifying the Google Cloud IAM attribute to
   * map to.
   * The following keys are supported:
   * * `google.subject`: The principal IAM is authenticating. You can reference
   *                     this value in IAM bindings. This is also the
   *                     subject that appears in Cloud Logging logs.
   *                     Cannot exceed 127 characters.
   * * `google.groups`: Groups the external identity belongs to. You can grant
   *                    groups access to resources using an IAM `principalSet`
   *                    binding; access applies to all members of the group.
   * You can also provide custom attributes by specifying
   * `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of
   * the custom attribute to be mapped. You can define a maximum of 50 custom
   * attributes. The maximum length of a mapped attribute key is
   * 100 characters, and the key may only contain the characters [a-z0-9_].
   * You can reference these attributes in IAM policies to define fine-grained
   * access for a workload to Google Cloud resources. For example:
   * * `google.subject`:
   * `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
   * * `google.groups`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
   * * `attribute.{custom_attribute}`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
   * Each value must be a [Common Expression Language]
   * (https://opensource.google/projects/cel) function that maps an
   * identity provider credential to the normalized attribute specified by the
   * corresponding map key.
   * You can use the `assertion` keyword in the expression to access a JSON
   * representation of the authentication credential issued by the provider.
   * The maximum length of an attribute mapping expression is 2048 characters.
   * When evaluated, the total size of all mapped attributes must not exceed
   * 8KB.
   * For AWS providers, the following rules apply:
   * - If no attribute mapping is defined, the following default mapping
   *   applies:
   *   ```
   *   {
   *     "google.subject":"assertion.arn",
   *     "attribute.aws_role":
   *         "assertion.arn.contains('assumed-role')"
   *         " ? assertion.arn.extract('{account_arn}assumed-role/')"
   *         "   + 'assumed-role/'"
   *         "   + assertion.arn.extract('assumed-role/{role_name}/')"
   *         " : assertion.arn",
   *   }
   *   ```
   * - If any custom attribute mappings are defined, they must include a mapping
   *   to the `google.subject` attribute.
   * For OIDC providers, the following rules apply:
   * - Custom attribute mappings must be defined, and must include a mapping to
   *   the `google.subject` attribute. For example, the following maps the
   *   `sub` claim of the incoming credential to the `subject` attribute on
   *   a Google token.
   *   ```
   *   {"google.subject": "assertion.sub"}
   *   ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; attribute_mapping = 6;</code>
   */
  boolean containsAttributeMapping(
      java.lang.String key);
  /**
   * Use {@link #getAttributeMappingMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributeMapping();
  /**
   * <pre>
   * Maps attributes from authentication credentials issued by an external
   * identity provider to Google Cloud attributes, such as `subject` and
   * `segment`.
   * Each key must be a string specifying the Google Cloud IAM attribute to
   * map to.
   * The following keys are supported:
   * * `google.subject`: The principal IAM is authenticating. You can reference
   *                     this value in IAM bindings. This is also the
   *                     subject that appears in Cloud Logging logs.
   *                     Cannot exceed 127 characters.
   * * `google.groups`: Groups the external identity belongs to. You can grant
   *                    groups access to resources using an IAM `principalSet`
   *                    binding; access applies to all members of the group.
   * You can also provide custom attributes by specifying
   * `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of
   * the custom attribute to be mapped. You can define a maximum of 50 custom
   * attributes. The maximum length of a mapped attribute key is
   * 100 characters, and the key may only contain the characters [a-z0-9_].
   * You can reference these attributes in IAM policies to define fine-grained
   * access for a workload to Google Cloud resources. For example:
   * * `google.subject`:
   * `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
   * * `google.groups`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
   * * `attribute.{custom_attribute}`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
   * Each value must be a [Common Expression Language]
   * (https://opensource.google/projects/cel) function that maps an
   * identity provider credential to the normalized attribute specified by the
   * corresponding map key.
   * You can use the `assertion` keyword in the expression to access a JSON
   * representation of the authentication credential issued by the provider.
   * The maximum length of an attribute mapping expression is 2048 characters.
   * When evaluated, the total size of all mapped attributes must not exceed
   * 8KB.
   * For AWS providers, the following rules apply:
   * - If no attribute mapping is defined, the following default mapping
   *   applies:
   *   ```
   *   {
   *     "google.subject":"assertion.arn",
   *     "attribute.aws_role":
   *         "assertion.arn.contains('assumed-role')"
   *         " ? assertion.arn.extract('{account_arn}assumed-role/')"
   *         "   + 'assumed-role/'"
   *         "   + assertion.arn.extract('assumed-role/{role_name}/')"
   *         " : assertion.arn",
   *   }
   *   ```
   * - If any custom attribute mappings are defined, they must include a mapping
   *   to the `google.subject` attribute.
   * For OIDC providers, the following rules apply:
   * - Custom attribute mappings must be defined, and must include a mapping to
   *   the `google.subject` attribute. For example, the following maps the
   *   `sub` claim of the incoming credential to the `subject` attribute on
   *   a Google token.
   *   ```
   *   {"google.subject": "assertion.sub"}
   *   ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; attribute_mapping = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributeMappingMap();
  /**
   * <pre>
   * Maps attributes from authentication credentials issued by an external
   * identity provider to Google Cloud attributes, such as `subject` and
   * `segment`.
   * Each key must be a string specifying the Google Cloud IAM attribute to
   * map to.
   * The following keys are supported:
   * * `google.subject`: The principal IAM is authenticating. You can reference
   *                     this value in IAM bindings. This is also the
   *                     subject that appears in Cloud Logging logs.
   *                     Cannot exceed 127 characters.
   * * `google.groups`: Groups the external identity belongs to. You can grant
   *                    groups access to resources using an IAM `principalSet`
   *                    binding; access applies to all members of the group.
   * You can also provide custom attributes by specifying
   * `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of
   * the custom attribute to be mapped. You can define a maximum of 50 custom
   * attributes. The maximum length of a mapped attribute key is
   * 100 characters, and the key may only contain the characters [a-z0-9_].
   * You can reference these attributes in IAM policies to define fine-grained
   * access for a workload to Google Cloud resources. For example:
   * * `google.subject`:
   * `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
   * * `google.groups`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
   * * `attribute.{custom_attribute}`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
   * Each value must be a [Common Expression Language]
   * (https://opensource.google/projects/cel) function that maps an
   * identity provider credential to the normalized attribute specified by the
   * corresponding map key.
   * You can use the `assertion` keyword in the expression to access a JSON
   * representation of the authentication credential issued by the provider.
   * The maximum length of an attribute mapping expression is 2048 characters.
   * When evaluated, the total size of all mapped attributes must not exceed
   * 8KB.
   * For AWS providers, the following rules apply:
   * - If no attribute mapping is defined, the following default mapping
   *   applies:
   *   ```
   *   {
   *     "google.subject":"assertion.arn",
   *     "attribute.aws_role":
   *         "assertion.arn.contains('assumed-role')"
   *         " ? assertion.arn.extract('{account_arn}assumed-role/')"
   *         "   + 'assumed-role/'"
   *         "   + assertion.arn.extract('assumed-role/{role_name}/')"
   *         " : assertion.arn",
   *   }
   *   ```
   * - If any custom attribute mappings are defined, they must include a mapping
   *   to the `google.subject` attribute.
   * For OIDC providers, the following rules apply:
   * - Custom attribute mappings must be defined, and must include a mapping to
   *   the `google.subject` attribute. For example, the following maps the
   *   `sub` claim of the incoming credential to the `subject` attribute on
   *   a Google token.
   *   ```
   *   {"google.subject": "assertion.sub"}
   *   ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; attribute_mapping = 6;</code>
   */
  /* nullable */
java.lang.String getAttributeMappingOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Maps attributes from authentication credentials issued by an external
   * identity provider to Google Cloud attributes, such as `subject` and
   * `segment`.
   * Each key must be a string specifying the Google Cloud IAM attribute to
   * map to.
   * The following keys are supported:
   * * `google.subject`: The principal IAM is authenticating. You can reference
   *                     this value in IAM bindings. This is also the
   *                     subject that appears in Cloud Logging logs.
   *                     Cannot exceed 127 characters.
   * * `google.groups`: Groups the external identity belongs to. You can grant
   *                    groups access to resources using an IAM `principalSet`
   *                    binding; access applies to all members of the group.
   * You can also provide custom attributes by specifying
   * `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of
   * the custom attribute to be mapped. You can define a maximum of 50 custom
   * attributes. The maximum length of a mapped attribute key is
   * 100 characters, and the key may only contain the characters [a-z0-9_].
   * You can reference these attributes in IAM policies to define fine-grained
   * access for a workload to Google Cloud resources. For example:
   * * `google.subject`:
   * `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
   * * `google.groups`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
   * * `attribute.{custom_attribute}`:
   * `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
   * Each value must be a [Common Expression Language]
   * (https://opensource.google/projects/cel) function that maps an
   * identity provider credential to the normalized attribute specified by the
   * corresponding map key.
   * You can use the `assertion` keyword in the expression to access a JSON
   * representation of the authentication credential issued by the provider.
   * The maximum length of an attribute mapping expression is 2048 characters.
   * When evaluated, the total size of all mapped attributes must not exceed
   * 8KB.
   * For AWS providers, the following rules apply:
   * - If no attribute mapping is defined, the following default mapping
   *   applies:
   *   ```
   *   {
   *     "google.subject":"assertion.arn",
   *     "attribute.aws_role":
   *         "assertion.arn.contains('assumed-role')"
   *         " ? assertion.arn.extract('{account_arn}assumed-role/')"
   *         "   + 'assumed-role/'"
   *         "   + assertion.arn.extract('assumed-role/{role_name}/')"
   *         " : assertion.arn",
   *   }
   *   ```
   * - If any custom attribute mappings are defined, they must include a mapping
   *   to the `google.subject` attribute.
   * For OIDC providers, the following rules apply:
   * - Custom attribute mappings must be defined, and must include a mapping to
   *   the `google.subject` attribute. For example, the following maps the
   *   `sub` claim of the incoming credential to the `subject` attribute on
   *   a Google token.
   *   ```
   *   {"google.subject": "assertion.sub"}
   *   ```
   * </pre>
   *
   * <code>map&lt;string, string&gt; attribute_mapping = 6;</code>
   */
  java.lang.String getAttributeMappingOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * [A Common Expression Language](https://opensource.google/projects/cel)
   * expression, in plain text, to restrict what otherwise valid authentication
   * credentials issued by the provider should not be accepted.
   * The expression must output a boolean representing whether to allow the
   * federation.
   * The following keywords may be referenced in the expressions:
   * * `assertion`: JSON representing the authentication credential issued by
   *                the provider.
   * * `google`: The Google attributes mapped from the assertion in the
   *             `attribute_mappings`.
   * * `attribute`: The custom attributes mapped from the assertion in the
   *                `attribute_mappings`.
   * The maximum length of the attribute condition expression is 4096
   * characters. If unspecified, all valid authentication credential are
   * accepted.
   * The following example shows how to only allow credentials with a mapped
   * `google.groups` value of `admins`:
   * ```
   * "'admins' in google.groups"
   * ```
   * </pre>
   *
   * <code>string attribute_condition = 7;</code>
   * @return The attributeCondition.
   */
  java.lang.String getAttributeCondition();
  /**
   * <pre>
   * [A Common Expression Language](https://opensource.google/projects/cel)
   * expression, in plain text, to restrict what otherwise valid authentication
   * credentials issued by the provider should not be accepted.
   * The expression must output a boolean representing whether to allow the
   * federation.
   * The following keywords may be referenced in the expressions:
   * * `assertion`: JSON representing the authentication credential issued by
   *                the provider.
   * * `google`: The Google attributes mapped from the assertion in the
   *             `attribute_mappings`.
   * * `attribute`: The custom attributes mapped from the assertion in the
   *                `attribute_mappings`.
   * The maximum length of the attribute condition expression is 4096
   * characters. If unspecified, all valid authentication credential are
   * accepted.
   * The following example shows how to only allow credentials with a mapped
   * `google.groups` value of `admins`:
   * ```
   * "'admins' in google.groups"
   * ```
   * </pre>
   *
   * <code>string attribute_condition = 7;</code>
   * @return The bytes for attributeCondition.
   */
  com.google.protobuf.ByteString
      getAttributeConditionBytes();

  /**
   * <pre>
   * An Amazon Web Services identity provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.Aws aws = 8;</code>
   * @return Whether the aws field is set.
   */
  boolean hasAws();
  /**
   * <pre>
   * An Amazon Web Services identity provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.Aws aws = 8;</code>
   * @return The aws.
   */
  com.google.iam.v1beta.WorkloadIdentityPoolProvider.Aws getAws();
  /**
   * <pre>
   * An Amazon Web Services identity provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.Aws aws = 8;</code>
   */
  com.google.iam.v1beta.WorkloadIdentityPoolProvider.AwsOrBuilder getAwsOrBuilder();

  /**
   * <pre>
   * An OpenId Connect 1.0 identity provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.Oidc oidc = 9;</code>
   * @return Whether the oidc field is set.
   */
  boolean hasOidc();
  /**
   * <pre>
   * An OpenId Connect 1.0 identity provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.Oidc oidc = 9;</code>
   * @return The oidc.
   */
  com.google.iam.v1beta.WorkloadIdentityPoolProvider.Oidc getOidc();
  /**
   * <pre>
   * An OpenId Connect 1.0 identity provider.
   * </pre>
   *
   * <code>.google.iam.v1beta.WorkloadIdentityPoolProvider.Oidc oidc = 9;</code>
   */
  com.google.iam.v1beta.WorkloadIdentityPoolProvider.OidcOrBuilder getOidcOrBuilder();

  public com.google.iam.v1beta.WorkloadIdentityPoolProvider.ProviderConfigCase getProviderConfigCase();
}