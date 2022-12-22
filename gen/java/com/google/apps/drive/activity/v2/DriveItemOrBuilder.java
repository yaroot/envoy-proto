// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/drive/activity/v2/target.proto

package com.google.apps.drive.activity.v2;

public interface DriveItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.drive.activity.v2.DriveItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The target Drive item. The format is `items/ITEM_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The target Drive item. The format is `items/ITEM_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The title of the Drive item.
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the Drive item.
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * This field is deprecated; please use the `driveFile` field instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.File file = 3 [deprecated = true];</code>
   * @deprecated google.apps.drive.activity.v2.DriveItem.file is deprecated.
   *     See google/apps/drive/activity/v2/target.proto;l=150
   * @return Whether the file field is set.
   */
  @java.lang.Deprecated boolean hasFile();
  /**
   * <pre>
   * This field is deprecated; please use the `driveFile` field instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.File file = 3 [deprecated = true];</code>
   * @deprecated google.apps.drive.activity.v2.DriveItem.file is deprecated.
   *     See google/apps/drive/activity/v2/target.proto;l=150
   * @return The file.
   */
  @java.lang.Deprecated com.google.apps.drive.activity.v2.DriveItem.File getFile();
  /**
   * <pre>
   * This field is deprecated; please use the `driveFile` field instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.File file = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.apps.drive.activity.v2.DriveItem.FileOrBuilder getFileOrBuilder();

  /**
   * <pre>
   * This field is deprecated; please use the `driveFolder` field instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.Folder folder = 4 [deprecated = true];</code>
   * @deprecated google.apps.drive.activity.v2.DriveItem.folder is deprecated.
   *     See google/apps/drive/activity/v2/target.proto;l=153
   * @return Whether the folder field is set.
   */
  @java.lang.Deprecated boolean hasFolder();
  /**
   * <pre>
   * This field is deprecated; please use the `driveFolder` field instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.Folder folder = 4 [deprecated = true];</code>
   * @deprecated google.apps.drive.activity.v2.DriveItem.folder is deprecated.
   *     See google/apps/drive/activity/v2/target.proto;l=153
   * @return The folder.
   */
  @java.lang.Deprecated com.google.apps.drive.activity.v2.DriveItem.Folder getFolder();
  /**
   * <pre>
   * This field is deprecated; please use the `driveFolder` field instead.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.Folder folder = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.apps.drive.activity.v2.DriveItem.FolderOrBuilder getFolderOrBuilder();

  /**
   * <pre>
   * The Drive item is a file.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.DriveFile drive_file = 8;</code>
   * @return Whether the driveFile field is set.
   */
  boolean hasDriveFile();
  /**
   * <pre>
   * The Drive item is a file.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.DriveFile drive_file = 8;</code>
   * @return The driveFile.
   */
  com.google.apps.drive.activity.v2.DriveItem.DriveFile getDriveFile();
  /**
   * <pre>
   * The Drive item is a file.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.DriveFile drive_file = 8;</code>
   */
  com.google.apps.drive.activity.v2.DriveItem.DriveFileOrBuilder getDriveFileOrBuilder();

  /**
   * <pre>
   * The Drive item is a folder. Includes information about the type of
   * folder.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.DriveFolder drive_folder = 9;</code>
   * @return Whether the driveFolder field is set.
   */
  boolean hasDriveFolder();
  /**
   * <pre>
   * The Drive item is a folder. Includes information about the type of
   * folder.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.DriveFolder drive_folder = 9;</code>
   * @return The driveFolder.
   */
  com.google.apps.drive.activity.v2.DriveItem.DriveFolder getDriveFolder();
  /**
   * <pre>
   * The Drive item is a folder. Includes information about the type of
   * folder.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.DriveItem.DriveFolder drive_folder = 9;</code>
   */
  com.google.apps.drive.activity.v2.DriveItem.DriveFolderOrBuilder getDriveFolderOrBuilder();

  /**
   * <pre>
   * The MIME type of the Drive item.  See
   * https://developers.google.com/drive/v3/web/mime-types.
   * </pre>
   *
   * <code>string mime_type = 6;</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * The MIME type of the Drive item.  See
   * https://developers.google.com/drive/v3/web/mime-types.
   * </pre>
   *
   * <code>string mime_type = 6;</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  /**
   * <pre>
   * Information about the owner of this Drive item.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Owner owner = 7;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <pre>
   * Information about the owner of this Drive item.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Owner owner = 7;</code>
   * @return The owner.
   */
  com.google.apps.drive.activity.v2.Owner getOwner();
  /**
   * <pre>
   * Information about the owner of this Drive item.
   * </pre>
   *
   * <code>.google.apps.drive.activity.v2.Owner owner = 7;</code>
   */
  com.google.apps.drive.activity.v2.OwnerOrBuilder getOwnerOrBuilder();

  public com.google.apps.drive.activity.v2.DriveItem.ItemTypeCase getItemTypeCase();
}