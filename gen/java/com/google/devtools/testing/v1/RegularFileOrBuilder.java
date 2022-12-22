// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

public interface RegularFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.RegularFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The source file.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference content = 1;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * Required. The source file.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference content = 1;</code>
   * @return The content.
   */
  com.google.devtools.testing.v1.FileReference getContent();
  /**
   * <pre>
   * Required. The source file.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference content = 1;</code>
   */
  com.google.devtools.testing.v1.FileReferenceOrBuilder getContentOrBuilder();

  /**
   * <pre>
   * Required. Where to put the content on the device. Must be an absolute,
   * allowlisted path. If the file exists, it will be replaced.
   * The following device-side directories and any of their subdirectories are
   * allowlisted:
   * &lt;p&gt;${EXTERNAL_STORAGE}, /sdcard, or /storage&lt;/p&gt;
   * &lt;p&gt;${ANDROID_DATA}/local/tmp, or /data/local/tmp&lt;/p&gt;
   * &lt;p&gt;Specifying a path outside of these directory trees is invalid.
   * &lt;p&gt; The paths /sdcard and /data will be made available and treated as
   * implicit path substitutions. E.g. if /sdcard on a particular device does
   * not map to external storage, the system will replace it with the external
   * storage path prefix for that device and copy the file there.
   * &lt;p&gt; It is strongly advised to use the &lt;a href=
   * "http://developer.android.com/reference/android/os/Environment.html"&gt;
   * Environment API&lt;/a&gt; in app and test code to access files on the device in a
   * portable way.
   * </pre>
   *
   * <code>string device_path = 2;</code>
   * @return The devicePath.
   */
  java.lang.String getDevicePath();
  /**
   * <pre>
   * Required. Where to put the content on the device. Must be an absolute,
   * allowlisted path. If the file exists, it will be replaced.
   * The following device-side directories and any of their subdirectories are
   * allowlisted:
   * &lt;p&gt;${EXTERNAL_STORAGE}, /sdcard, or /storage&lt;/p&gt;
   * &lt;p&gt;${ANDROID_DATA}/local/tmp, or /data/local/tmp&lt;/p&gt;
   * &lt;p&gt;Specifying a path outside of these directory trees is invalid.
   * &lt;p&gt; The paths /sdcard and /data will be made available and treated as
   * implicit path substitutions. E.g. if /sdcard on a particular device does
   * not map to external storage, the system will replace it with the external
   * storage path prefix for that device and copy the file there.
   * &lt;p&gt; It is strongly advised to use the &lt;a href=
   * "http://developer.android.com/reference/android/os/Environment.html"&gt;
   * Environment API&lt;/a&gt; in app and test code to access files on the device in a
   * portable way.
   * </pre>
   *
   * <code>string device_path = 2;</code>
   * @return The bytes for devicePath.
   */
  com.google.protobuf.ByteString
      getDevicePathBytes();
}