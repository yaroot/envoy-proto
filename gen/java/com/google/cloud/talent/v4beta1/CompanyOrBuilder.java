// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company.proto

package com.google.cloud.talent.v4beta1;

public interface CompanyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Company)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required during company update.
   * The resource name for a company. This is generated by the service when a
   * company is created.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/foo/tenants/bar/companies/baz".
   * If tenant id is unspecified, the default tenant is used. For
   * example, "projects/foo/companies/bar".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required during company update.
   * The resource name for a company. This is generated by the service when a
   * company is created.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/foo/tenants/bar/companies/baz".
   * If tenant id is unspecified, the default tenant is used. For
   * example, "projects/foo/companies/bar".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The display name of the company, for example, "Google LLC".
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The display name of the company, for example, "Google LLC".
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. Client side company identifier, used to uniquely identify the
   * company.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <pre>
   * Required. Client side company identifier, used to uniquely identify the
   * company.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <pre>
   * The employer's company size.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompanySize size = 4;</code>
   * @return The enum numeric value on the wire for size.
   */
  int getSizeValue();
  /**
   * <pre>
   * The employer's company size.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompanySize size = 4;</code>
   * @return The size.
   */
  com.google.cloud.talent.v4beta1.CompanySize getSize();

  /**
   * <pre>
   * The street address of the company's main headquarters, which may be
   * different from the job location. The service attempts
   * to geolocate the provided address, and populates a more specific
   * location wherever possible in [DerivedInfo.headquarters_location][google.cloud.talent.v4beta1.Company.DerivedInfo.headquarters_location].
   * </pre>
   *
   * <code>string headquarters_address = 5;</code>
   * @return The headquartersAddress.
   */
  java.lang.String getHeadquartersAddress();
  /**
   * <pre>
   * The street address of the company's main headquarters, which may be
   * different from the job location. The service attempts
   * to geolocate the provided address, and populates a more specific
   * location wherever possible in [DerivedInfo.headquarters_location][google.cloud.talent.v4beta1.Company.DerivedInfo.headquarters_location].
   * </pre>
   *
   * <code>string headquarters_address = 5;</code>
   * @return The bytes for headquartersAddress.
   */
  com.google.protobuf.ByteString
      getHeadquartersAddressBytes();

  /**
   * <pre>
   * Set to true if it is the hiring agency that post jobs for other
   * employers.
   * Defaults to false if not provided.
   * </pre>
   *
   * <code>bool hiring_agency = 6;</code>
   * @return The hiringAgency.
   */
  boolean getHiringAgency();

  /**
   * <pre>
   * Equal Employment Opportunity legal disclaimer text to be
   * associated with all jobs, and typically to be displayed in all
   * roles.
   * The maximum number of allowed characters is 500.
   * </pre>
   *
   * <code>string eeo_text = 7;</code>
   * @return The eeoText.
   */
  java.lang.String getEeoText();
  /**
   * <pre>
   * Equal Employment Opportunity legal disclaimer text to be
   * associated with all jobs, and typically to be displayed in all
   * roles.
   * The maximum number of allowed characters is 500.
   * </pre>
   *
   * <code>string eeo_text = 7;</code>
   * @return The bytes for eeoText.
   */
  com.google.protobuf.ByteString
      getEeoTextBytes();

  /**
   * <pre>
   * The URI representing the company's primary web site or home page,
   * for example, "https://www.google.com".
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string website_uri = 8;</code>
   * @return The websiteUri.
   */
  java.lang.String getWebsiteUri();
  /**
   * <pre>
   * The URI representing the company's primary web site or home page,
   * for example, "https://www.google.com".
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string website_uri = 8;</code>
   * @return The bytes for websiteUri.
   */
  com.google.protobuf.ByteString
      getWebsiteUriBytes();

  /**
   * <pre>
   * The URI to employer's career site or careers page on the employer's web
   * site, for example, "https://careers.google.com".
   * </pre>
   *
   * <code>string career_site_uri = 9;</code>
   * @return The careerSiteUri.
   */
  java.lang.String getCareerSiteUri();
  /**
   * <pre>
   * The URI to employer's career site or careers page on the employer's web
   * site, for example, "https://careers.google.com".
   * </pre>
   *
   * <code>string career_site_uri = 9;</code>
   * @return The bytes for careerSiteUri.
   */
  com.google.protobuf.ByteString
      getCareerSiteUriBytes();

  /**
   * <pre>
   * A URI that hosts the employer's company logo.
   * </pre>
   *
   * <code>string image_uri = 10;</code>
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   * <pre>
   * A URI that hosts the employer's company logo.
   * </pre>
   *
   * <code>string image_uri = 10;</code>
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString
      getImageUriBytes();

  /**
   * <pre>
   * This field is deprecated. Please set the searchability of the custom
   * attribute in the [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes] going forward.
   * A list of keys of filterable [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes], whose
   * corresponding `string_values` are used in keyword searches. Jobs with
   * `string_values` under these specified field keys are returned if any
   * of the values match the search keyword. Custom field values with
   * parenthesis, brackets and special symbols are not searchable as-is,
   * and those keyword queries must be surrounded by quotes.
   * </pre>
   *
   * <code>repeated string keyword_searchable_job_custom_attributes = 11 [deprecated = true];</code>
   * @deprecated google.cloud.talent.v4beta1.Company.keyword_searchable_job_custom_attributes is deprecated.
   *     See google/cloud/talent/v4beta1/company.proto;l=111
   * @return A list containing the keywordSearchableJobCustomAttributes.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getKeywordSearchableJobCustomAttributesList();
  /**
   * <pre>
   * This field is deprecated. Please set the searchability of the custom
   * attribute in the [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes] going forward.
   * A list of keys of filterable [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes], whose
   * corresponding `string_values` are used in keyword searches. Jobs with
   * `string_values` under these specified field keys are returned if any
   * of the values match the search keyword. Custom field values with
   * parenthesis, brackets and special symbols are not searchable as-is,
   * and those keyword queries must be surrounded by quotes.
   * </pre>
   *
   * <code>repeated string keyword_searchable_job_custom_attributes = 11 [deprecated = true];</code>
   * @deprecated google.cloud.talent.v4beta1.Company.keyword_searchable_job_custom_attributes is deprecated.
   *     See google/cloud/talent/v4beta1/company.proto;l=111
   * @return The count of keywordSearchableJobCustomAttributes.
   */
  @java.lang.Deprecated int getKeywordSearchableJobCustomAttributesCount();
  /**
   * <pre>
   * This field is deprecated. Please set the searchability of the custom
   * attribute in the [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes] going forward.
   * A list of keys of filterable [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes], whose
   * corresponding `string_values` are used in keyword searches. Jobs with
   * `string_values` under these specified field keys are returned if any
   * of the values match the search keyword. Custom field values with
   * parenthesis, brackets and special symbols are not searchable as-is,
   * and those keyword queries must be surrounded by quotes.
   * </pre>
   *
   * <code>repeated string keyword_searchable_job_custom_attributes = 11 [deprecated = true];</code>
   * @deprecated google.cloud.talent.v4beta1.Company.keyword_searchable_job_custom_attributes is deprecated.
   *     See google/cloud/talent/v4beta1/company.proto;l=111
   * @param index The index of the element to return.
   * @return The keywordSearchableJobCustomAttributes at the given index.
   */
  @java.lang.Deprecated java.lang.String getKeywordSearchableJobCustomAttributes(int index);
  /**
   * <pre>
   * This field is deprecated. Please set the searchability of the custom
   * attribute in the [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes] going forward.
   * A list of keys of filterable [Job.custom_attributes][google.cloud.talent.v4beta1.Job.custom_attributes], whose
   * corresponding `string_values` are used in keyword searches. Jobs with
   * `string_values` under these specified field keys are returned if any
   * of the values match the search keyword. Custom field values with
   * parenthesis, brackets and special symbols are not searchable as-is,
   * and those keyword queries must be surrounded by quotes.
   * </pre>
   *
   * <code>repeated string keyword_searchable_job_custom_attributes = 11 [deprecated = true];</code>
   * @deprecated google.cloud.talent.v4beta1.Company.keyword_searchable_job_custom_attributes is deprecated.
   *     See google/cloud/talent/v4beta1/company.proto;l=111
   * @param index The index of the value to return.
   * @return The bytes of the keywordSearchableJobCustomAttributes at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getKeywordSearchableJobCustomAttributesBytes(int index);

  /**
   * <pre>
   * Output only. Derived details about the company.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company.DerivedInfo derived_info = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the derivedInfo field is set.
   */
  boolean hasDerivedInfo();
  /**
   * <pre>
   * Output only. Derived details about the company.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company.DerivedInfo derived_info = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The derivedInfo.
   */
  com.google.cloud.talent.v4beta1.Company.DerivedInfo getDerivedInfo();
  /**
   * <pre>
   * Output only. Derived details about the company.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Company.DerivedInfo derived_info = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.talent.v4beta1.Company.DerivedInfoOrBuilder getDerivedInfoOrBuilder();

  /**
   * <pre>
   * Output only. Indicates whether a company is flagged to be suspended from
   * public availability by the service when job content appears suspicious,
   * abusive, or spammy.
   * </pre>
   *
   * <code>bool suspended = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The suspended.
   */
  boolean getSuspended();
}