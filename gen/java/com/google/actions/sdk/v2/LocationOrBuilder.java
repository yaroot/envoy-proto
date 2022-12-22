// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/actions_testing.proto

package com.google.actions.sdk.v2;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Geo coordinates.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] permission.
   * </pre>
   *
   * <code>.google.type.LatLng coordinates = 1;</code>
   * @return Whether the coordinates field is set.
   */
  boolean hasCoordinates();
  /**
   * <pre>
   * Geo coordinates.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] permission.
   * </pre>
   *
   * <code>.google.type.LatLng coordinates = 1;</code>
   * @return The coordinates.
   */
  com.google.type.LatLng getCoordinates();
  /**
   * <pre>
   * Geo coordinates.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] permission.
   * </pre>
   *
   * <code>.google.type.LatLng coordinates = 1;</code>
   */
  com.google.type.LatLngOrBuilder getCoordinatesOrBuilder();

  /**
   * <pre>
   * Display address, e.g., "1600 Amphitheatre Pkwy, Mountain View, CA 94043".
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] permission.
   * </pre>
   *
   * <code>string formatted_address = 2;</code>
   * @return The formattedAddress.
   */
  java.lang.String getFormattedAddress();
  /**
   * <pre>
   * Display address, e.g., "1600 Amphitheatre Pkwy, Mountain View, CA 94043".
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] permission.
   * </pre>
   *
   * <code>string formatted_address = 2;</code>
   * @return The bytes for formattedAddress.
   */
  com.google.protobuf.ByteString
      getFormattedAddressBytes();

  /**
   * <pre>
   * Zip code.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] or
   * [DEVICE_COARSE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_COARSE_LOCATION] permission.
   * </pre>
   *
   * <code>string zip_code = 3;</code>
   * @return The zipCode.
   */
  java.lang.String getZipCode();
  /**
   * <pre>
   * Zip code.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] or
   * [DEVICE_COARSE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_COARSE_LOCATION] permission.
   * </pre>
   *
   * <code>string zip_code = 3;</code>
   * @return The bytes for zipCode.
   */
  com.google.protobuf.ByteString
      getZipCodeBytes();

  /**
   * <pre>
   * City.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] or
   * [DEVICE_COARSE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_COARSE_LOCATION] permission.
   * </pre>
   *
   * <code>string city = 4;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <pre>
   * City.
   * Requires the [DEVICE_PRECISE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_PRECISE_LOCATION] or
   * [DEVICE_COARSE_LOCATION]
   * [google.actions.v2.Permission.DEVICE_COARSE_LOCATION] permission.
   * </pre>
   *
   * <code>string city = 4;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();
}