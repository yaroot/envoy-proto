// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v3/discovery.proto

package io.envoyproxy.envoy.service.discovery.v3;

public interface DynamicParameterConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.discovery.v3.DynamicParameterConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A single constraint to evaluate.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraint constraint = 1;</code>
   * @return Whether the constraint field is set.
   */
  boolean hasConstraint();
  /**
   * <pre>
   * A single constraint to evaluate.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraint constraint = 1;</code>
   * @return The constraint.
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraint getConstraint();
  /**
   * <pre>
   * A single constraint to evaluate.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraint constraint = 1;</code>
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraintOrBuilder getConstraintOrBuilder();

  /**
   * <pre>
   * A list of constraints that match if any one constraint in the list
   * matches.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList or_constraints = 2;</code>
   * @return Whether the orConstraints field is set.
   */
  boolean hasOrConstraints();
  /**
   * <pre>
   * A list of constraints that match if any one constraint in the list
   * matches.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList or_constraints = 2;</code>
   * @return The orConstraints.
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList getOrConstraints();
  /**
   * <pre>
   * A list of constraints that match if any one constraint in the list
   * matches.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList or_constraints = 2;</code>
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintListOrBuilder getOrConstraintsOrBuilder();

  /**
   * <pre>
   * A list of constraints that must all match.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList and_constraints = 3;</code>
   * @return Whether the andConstraints field is set.
   */
  boolean hasAndConstraints();
  /**
   * <pre>
   * A list of constraints that must all match.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList and_constraints = 3;</code>
   * @return The andConstraints.
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList getAndConstraints();
  /**
   * <pre>
   * A list of constraints that must all match.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintList and_constraints = 3;</code>
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintListOrBuilder getAndConstraintsOrBuilder();

  /**
   * <pre>
   * The inverse (NOT) of a set of constraints.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints not_constraints = 4;</code>
   * @return Whether the notConstraints field is set.
   */
  boolean hasNotConstraints();
  /**
   * <pre>
   * The inverse (NOT) of a set of constraints.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints not_constraints = 4;</code>
   * @return The notConstraints.
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints getNotConstraints();
  /**
   * <pre>
   * The inverse (NOT) of a set of constraints.
   * </pre>
   *
   * <code>.envoy.service.discovery.v3.DynamicParameterConstraints not_constraints = 4;</code>
   */
  io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraintsOrBuilder getNotConstraintsOrBuilder();

  public io.envoyproxy.envoy.service.discovery.v3.DynamicParameterConstraints.TypeCase getTypeCase();
}