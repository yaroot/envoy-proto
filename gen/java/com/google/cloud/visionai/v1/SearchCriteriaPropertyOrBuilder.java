// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/warehouse.proto

package com.google.cloud.visionai.v1;

public interface SearchCriteriaPropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.SearchCriteriaProperty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Each mapped_field corresponds to a UGA key. To understand how this property
   * works, take the following example. In the SearchConfig table, the
   * user adds this entry:
   *   search_config {
   *     name: "person"
   *     search_criteria_property {
   *       mapped_fields: "player"
   *       mapped_fields: "coach"
   *     }
   *   }
   * Now, when a user issues a query like:
   *   criteria {
   *     field: "person"
   *     text_array {
   *       txt_values: "Tom Brady"
   *       txt_values: "Bill Belichick"
   *     }
   *   }
   * MWH search will return search documents where (player=Tom Brady ||
   * coach=Tom Brady || player=Bill Belichick || coach=Bill Belichick).
   * </pre>
   *
   * <code>repeated string mapped_fields = 1;</code>
   * @return A list containing the mappedFields.
   */
  java.util.List<java.lang.String>
      getMappedFieldsList();
  /**
   * <pre>
   * Each mapped_field corresponds to a UGA key. To understand how this property
   * works, take the following example. In the SearchConfig table, the
   * user adds this entry:
   *   search_config {
   *     name: "person"
   *     search_criteria_property {
   *       mapped_fields: "player"
   *       mapped_fields: "coach"
   *     }
   *   }
   * Now, when a user issues a query like:
   *   criteria {
   *     field: "person"
   *     text_array {
   *       txt_values: "Tom Brady"
   *       txt_values: "Bill Belichick"
   *     }
   *   }
   * MWH search will return search documents where (player=Tom Brady ||
   * coach=Tom Brady || player=Bill Belichick || coach=Bill Belichick).
   * </pre>
   *
   * <code>repeated string mapped_fields = 1;</code>
   * @return The count of mappedFields.
   */
  int getMappedFieldsCount();
  /**
   * <pre>
   * Each mapped_field corresponds to a UGA key. To understand how this property
   * works, take the following example. In the SearchConfig table, the
   * user adds this entry:
   *   search_config {
   *     name: "person"
   *     search_criteria_property {
   *       mapped_fields: "player"
   *       mapped_fields: "coach"
   *     }
   *   }
   * Now, when a user issues a query like:
   *   criteria {
   *     field: "person"
   *     text_array {
   *       txt_values: "Tom Brady"
   *       txt_values: "Bill Belichick"
   *     }
   *   }
   * MWH search will return search documents where (player=Tom Brady ||
   * coach=Tom Brady || player=Bill Belichick || coach=Bill Belichick).
   * </pre>
   *
   * <code>repeated string mapped_fields = 1;</code>
   * @param index The index of the element to return.
   * @return The mappedFields at the given index.
   */
  java.lang.String getMappedFields(int index);
  /**
   * <pre>
   * Each mapped_field corresponds to a UGA key. To understand how this property
   * works, take the following example. In the SearchConfig table, the
   * user adds this entry:
   *   search_config {
   *     name: "person"
   *     search_criteria_property {
   *       mapped_fields: "player"
   *       mapped_fields: "coach"
   *     }
   *   }
   * Now, when a user issues a query like:
   *   criteria {
   *     field: "person"
   *     text_array {
   *       txt_values: "Tom Brady"
   *       txt_values: "Bill Belichick"
   *     }
   *   }
   * MWH search will return search documents where (player=Tom Brady ||
   * coach=Tom Brady || player=Bill Belichick || coach=Bill Belichick).
   * </pre>
   *
   * <code>repeated string mapped_fields = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the mappedFields at the given index.
   */
  com.google.protobuf.ByteString
      getMappedFieldsBytes(int index);
}