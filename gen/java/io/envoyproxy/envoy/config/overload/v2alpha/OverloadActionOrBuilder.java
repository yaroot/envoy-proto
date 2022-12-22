// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/overload/v2alpha/overload.proto

package io.envoyproxy.envoy.config.overload.v2alpha;

public interface OverloadActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.overload.v2alpha.OverloadAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the overload action. This is just a well-known string that listeners can
   * use for registering callbacks. Custom overload actions should be named using reverse
   * DNS to ensure uniqueness.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the overload action. This is just a well-known string that listeners can
   * use for registering callbacks. Custom overload actions should be named using reverse
   * DNS to ensure uniqueness.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A set of triggers for this action. If any of these triggers fire the overload action
   * is activated. Listeners are notified when the overload action transitions from
   * inactivated to activated, or vice versa.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v2alpha.Trigger triggers = 2 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.config.overload.v2alpha.Trigger> 
      getTriggersList();
  /**
   * <pre>
   * A set of triggers for this action. If any of these triggers fire the overload action
   * is activated. Listeners are notified when the overload action transitions from
   * inactivated to activated, or vice versa.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v2alpha.Trigger triggers = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.overload.v2alpha.Trigger getTriggers(int index);
  /**
   * <pre>
   * A set of triggers for this action. If any of these triggers fire the overload action
   * is activated. Listeners are notified when the overload action transitions from
   * inactivated to activated, or vice versa.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v2alpha.Trigger triggers = 2 [(.validate.rules) = { ... }</code>
   */
  int getTriggersCount();
  /**
   * <pre>
   * A set of triggers for this action. If any of these triggers fire the overload action
   * is activated. Listeners are notified when the overload action transitions from
   * inactivated to activated, or vice versa.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v2alpha.Trigger triggers = 2 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.overload.v2alpha.TriggerOrBuilder> 
      getTriggersOrBuilderList();
  /**
   * <pre>
   * A set of triggers for this action. If any of these triggers fire the overload action
   * is activated. Listeners are notified when the overload action transitions from
   * inactivated to activated, or vice versa.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v2alpha.Trigger triggers = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.overload.v2alpha.TriggerOrBuilder getTriggersOrBuilder(
      int index);
}