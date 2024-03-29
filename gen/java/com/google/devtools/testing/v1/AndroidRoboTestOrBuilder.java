// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

public interface AndroidRoboTestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.AndroidRoboTest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The APK for the application under test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference app_apk = 1;</code>
   * @return Whether the appApk field is set.
   */
  boolean hasAppApk();
  /**
   * <pre>
   * The APK for the application under test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference app_apk = 1;</code>
   * @return The appApk.
   */
  com.google.devtools.testing.v1.FileReference getAppApk();
  /**
   * <pre>
   * The APK for the application under test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference app_apk = 1;</code>
   */
  com.google.devtools.testing.v1.FileReferenceOrBuilder getAppApkOrBuilder();

  /**
   * <pre>
   * A multi-apk app bundle for the application under test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.AppBundle app_bundle = 16;</code>
   * @return Whether the appBundle field is set.
   */
  boolean hasAppBundle();
  /**
   * <pre>
   * A multi-apk app bundle for the application under test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.AppBundle app_bundle = 16;</code>
   * @return The appBundle.
   */
  com.google.devtools.testing.v1.AppBundle getAppBundle();
  /**
   * <pre>
   * A multi-apk app bundle for the application under test.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.AppBundle app_bundle = 16;</code>
   */
  com.google.devtools.testing.v1.AppBundleOrBuilder getAppBundleOrBuilder();

  /**
   * <pre>
   * The java package for the application under test.
   * The default value is determined by examining the application's manifest.
   * </pre>
   *
   * <code>string app_package_id = 2;</code>
   * @return The appPackageId.
   */
  java.lang.String getAppPackageId();
  /**
   * <pre>
   * The java package for the application under test.
   * The default value is determined by examining the application's manifest.
   * </pre>
   *
   * <code>string app_package_id = 2;</code>
   * @return The bytes for appPackageId.
   */
  com.google.protobuf.ByteString
      getAppPackageIdBytes();

  /**
   * <pre>
   * The initial activity that should be used to start the app.
   * </pre>
   *
   * <code>string app_initial_activity = 3;</code>
   * @return The appInitialActivity.
   */
  java.lang.String getAppInitialActivity();
  /**
   * <pre>
   * The initial activity that should be used to start the app.
   * </pre>
   *
   * <code>string app_initial_activity = 3;</code>
   * @return The bytes for appInitialActivity.
   */
  com.google.protobuf.ByteString
      getAppInitialActivityBytes();

  /**
   * <pre>
   * The max depth of the traversal stack Robo can explore. Needs to be at least
   * 2 to make Robo explore the app beyond the first activity.
   * Default is 50.
   * </pre>
   *
   * <code>int32 max_depth = 7 [deprecated = true];</code>
   * @deprecated google.devtools.testing.v1.AndroidRoboTest.max_depth is deprecated.
   *     See google/devtools/testing/v1/test_execution.proto;l=593
   * @return The maxDepth.
   */
  @java.lang.Deprecated int getMaxDepth();

  /**
   * <pre>
   * The max number of steps Robo can execute.
   * Default is no limit.
   * </pre>
   *
   * <code>int32 max_steps = 8 [deprecated = true];</code>
   * @deprecated google.devtools.testing.v1.AndroidRoboTest.max_steps is deprecated.
   *     See google/devtools/testing/v1/test_execution.proto;l=597
   * @return The maxSteps.
   */
  @java.lang.Deprecated int getMaxSteps();

  /**
   * <pre>
   * A set of directives Robo should apply during the crawl.
   * This allows users to customize the crawl. For example, the username and
   * password for a test account can be provided.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboDirective robo_directives = 11;</code>
   */
  java.util.List<com.google.devtools.testing.v1.RoboDirective> 
      getRoboDirectivesList();
  /**
   * <pre>
   * A set of directives Robo should apply during the crawl.
   * This allows users to customize the crawl. For example, the username and
   * password for a test account can be provided.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboDirective robo_directives = 11;</code>
   */
  com.google.devtools.testing.v1.RoboDirective getRoboDirectives(int index);
  /**
   * <pre>
   * A set of directives Robo should apply during the crawl.
   * This allows users to customize the crawl. For example, the username and
   * password for a test account can be provided.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboDirective robo_directives = 11;</code>
   */
  int getRoboDirectivesCount();
  /**
   * <pre>
   * A set of directives Robo should apply during the crawl.
   * This allows users to customize the crawl. For example, the username and
   * password for a test account can be provided.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboDirective robo_directives = 11;</code>
   */
  java.util.List<? extends com.google.devtools.testing.v1.RoboDirectiveOrBuilder> 
      getRoboDirectivesOrBuilderList();
  /**
   * <pre>
   * A set of directives Robo should apply during the crawl.
   * This allows users to customize the crawl. For example, the username and
   * password for a test account can be provided.
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboDirective robo_directives = 11;</code>
   */
  com.google.devtools.testing.v1.RoboDirectiveOrBuilder getRoboDirectivesOrBuilder(
      int index);

  /**
   * <pre>
   * A JSON file with a sequence of actions Robo should perform as a prologue
   * for the crawl.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference robo_script = 13;</code>
   * @return Whether the roboScript field is set.
   */
  boolean hasRoboScript();
  /**
   * <pre>
   * A JSON file with a sequence of actions Robo should perform as a prologue
   * for the crawl.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference robo_script = 13;</code>
   * @return The roboScript.
   */
  com.google.devtools.testing.v1.FileReference getRoboScript();
  /**
   * <pre>
   * A JSON file with a sequence of actions Robo should perform as a prologue
   * for the crawl.
   * </pre>
   *
   * <code>.google.devtools.testing.v1.FileReference robo_script = 13;</code>
   */
  com.google.devtools.testing.v1.FileReferenceOrBuilder getRoboScriptOrBuilder();

  /**
   * <pre>
   * The intents used to launch the app for the crawl.
   * If none are provided, then the main launcher activity is launched.
   * If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboStartingIntent starting_intents = 15;</code>
   */
  java.util.List<com.google.devtools.testing.v1.RoboStartingIntent> 
      getStartingIntentsList();
  /**
   * <pre>
   * The intents used to launch the app for the crawl.
   * If none are provided, then the main launcher activity is launched.
   * If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboStartingIntent starting_intents = 15;</code>
   */
  com.google.devtools.testing.v1.RoboStartingIntent getStartingIntents(int index);
  /**
   * <pre>
   * The intents used to launch the app for the crawl.
   * If none are provided, then the main launcher activity is launched.
   * If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboStartingIntent starting_intents = 15;</code>
   */
  int getStartingIntentsCount();
  /**
   * <pre>
   * The intents used to launch the app for the crawl.
   * If none are provided, then the main launcher activity is launched.
   * If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboStartingIntent starting_intents = 15;</code>
   */
  java.util.List<? extends com.google.devtools.testing.v1.RoboStartingIntentOrBuilder> 
      getStartingIntentsOrBuilderList();
  /**
   * <pre>
   * The intents used to launch the app for the crawl.
   * If none are provided, then the main launcher activity is launched.
   * If some are provided, then only those provided are launched (the main
   * launcher activity must be provided explicitly).
   * </pre>
   *
   * <code>repeated .google.devtools.testing.v1.RoboStartingIntent starting_intents = 15;</code>
   */
  com.google.devtools.testing.v1.RoboStartingIntentOrBuilder getStartingIntentsOrBuilder(
      int index);

  public com.google.devtools.testing.v1.AndroidRoboTest.AppUnderTestCase getAppUnderTestCase();
}
