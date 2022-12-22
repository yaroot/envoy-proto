// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_environment_discovery.proto

package com.google.devtools.testing.v1;

public interface IosRuntimeConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.IosRuntimeConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The set of available locales.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Locale locales = 1;</code>
   */
  java.util.List<com.google.devtools.testing.v1.Locale> 
      getLocalesList();
  /**
   * <pre>
   * The set of available locales.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Locale locales = 1;</code>
   */
  com.google.devtools.testing.v1.Locale getLocales(int index);
  /**
   * <pre>
   * The set of available locales.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Locale locales = 1;</code>
   */
  int getLocalesCount();
  /**
   * <pre>
   * The set of available locales.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Locale locales = 1;</code>
   */
  java.util.List<? extends com.google.devtools.testing.v1.LocaleOrBuilder> 
      getLocalesOrBuilderList();
  /**
   * <pre>
   * The set of available locales.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Locale locales = 1;</code>
   */
  com.google.devtools.testing.v1.LocaleOrBuilder getLocalesOrBuilder(
      int index);

  /**
   * <pre>
   * The set of available orientations.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Orientation orientations = 2;</code>
   */
  java.util.List<com.google.devtools.testing.v1.Orientation> 
      getOrientationsList();
  /**
   * <pre>
   * The set of available orientations.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Orientation orientations = 2;</code>
   */
  com.google.devtools.testing.v1.Orientation getOrientations(int index);
  /**
   * <pre>
   * The set of available orientations.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Orientation orientations = 2;</code>
   */
  int getOrientationsCount();
  /**
   * <pre>
   * The set of available orientations.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Orientation orientations = 2;</code>
   */
  java.util.List<? extends com.google.devtools.testing.v1.OrientationOrBuilder> 
      getOrientationsOrBuilderList();
  /**
   * <pre>
   * The set of available orientations.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.Orientation orientations = 2;</code>
   */
  com.google.devtools.testing.v1.OrientationOrBuilder getOrientationsOrBuilder(
      int index);
}