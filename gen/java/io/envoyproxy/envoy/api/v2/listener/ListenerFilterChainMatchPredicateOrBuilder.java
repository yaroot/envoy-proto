// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/listener/listener_components.proto

package io.envoyproxy.envoy.api.v2.listener;

public interface ListenerFilterChainMatchPredicateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.listener.ListenerFilterChainMatchPredicate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A set that describes a logical OR. If any member of the set matches, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet or_match = 1;</code>
   * @return Whether the orMatch field is set.
   */
  boolean hasOrMatch();
  /**
   * <pre>
   * A set that describes a logical OR. If any member of the set matches, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet or_match = 1;</code>
   * @return The orMatch.
   */
  io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet getOrMatch();
  /**
   * <pre>
   * A set that describes a logical OR. If any member of the set matches, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet or_match = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSetOrBuilder getOrMatchOrBuilder();

  /**
   * <pre>
   * A set that describes a logical AND. If all members of the set match, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet and_match = 2;</code>
   * @return Whether the andMatch field is set.
   */
  boolean hasAndMatch();
  /**
   * <pre>
   * A set that describes a logical AND. If all members of the set match, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet and_match = 2;</code>
   * @return The andMatch.
   */
  io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet getAndMatch();
  /**
   * <pre>
   * A set that describes a logical AND. If all members of the set match, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSet and_match = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.MatchSetOrBuilder getAndMatchOrBuilder();

  /**
   * <pre>
   * A negation match. The match configuration will match if the negated match condition matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate not_match = 3;</code>
   * @return Whether the notMatch field is set.
   */
  boolean hasNotMatch();
  /**
   * <pre>
   * A negation match. The match configuration will match if the negated match condition matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate not_match = 3;</code>
   * @return The notMatch.
   */
  io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicate getNotMatch();
  /**
   * <pre>
   * A negation match. The match configuration will match if the negated match condition matches.
   * </pre>
   *
   * <code>.envoy.api.v2.listener.ListenerFilterChainMatchPredicate not_match = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicateOrBuilder getNotMatchOrBuilder();

  /**
   * <pre>
   * The match configuration will always match.
   * </pre>
   *
   * <code>bool any_match = 4 [(.validate.rules) = { ... }</code>
   * @return Whether the anyMatch field is set.
   */
  boolean hasAnyMatch();
  /**
   * <pre>
   * The match configuration will always match.
   * </pre>
   *
   * <code>bool any_match = 4 [(.validate.rules) = { ... }</code>
   * @return The anyMatch.
   */
  boolean getAnyMatch();

  /**
   * <pre>
   * Match destination port. Particularly, the match evaluation must use the recovered local port if
   * the owning listener filter is after :ref:`an original_dst listener filter &lt;config_listener_filters_original_dst&gt;`.
   * </pre>
   *
   * <code>.envoy.type.Int32Range destination_port_range = 5;</code>
   * @return Whether the destinationPortRange field is set.
   */
  boolean hasDestinationPortRange();
  /**
   * <pre>
   * Match destination port. Particularly, the match evaluation must use the recovered local port if
   * the owning listener filter is after :ref:`an original_dst listener filter &lt;config_listener_filters_original_dst&gt;`.
   * </pre>
   *
   * <code>.envoy.type.Int32Range destination_port_range = 5;</code>
   * @return The destinationPortRange.
   */
  io.envoyproxy.envoy.type.Int32Range getDestinationPortRange();
  /**
   * <pre>
   * Match destination port. Particularly, the match evaluation must use the recovered local port if
   * the owning listener filter is after :ref:`an original_dst listener filter &lt;config_listener_filters_original_dst&gt;`.
   * </pre>
   *
   * <code>.envoy.type.Int32Range destination_port_range = 5;</code>
   */
  io.envoyproxy.envoy.type.Int32RangeOrBuilder getDestinationPortRangeOrBuilder();

  public io.envoyproxy.envoy.api.v2.listener.ListenerFilterChainMatchPredicate.RuleCase getRuleCase();
}