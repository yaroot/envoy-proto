// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface HttpRouteRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpRouteRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   * @return Whether the headerAction field is set.
   */
  boolean hasHeaderAction();
  /**
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   * @return The headerAction.
   */
  com.google.cloud.compute.v1.HttpHeaderAction getHeaderAction();
  /**
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderActionOrBuilder getHeaderActionOrBuilder();

  /**
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HttpRouteRuleMatch> 
      getMatchRulesList();
  /**
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleMatch getMatchRules(int index);
  /**
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  int getMatchRulesCount();
  /**
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HttpRouteRuleMatchOrBuilder> 
      getMatchRulesOrBuilderList();
  /**
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 376200701;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleMatchOrBuilder getMatchRulesOrBuilder(
      int index);

  /**
   * <pre>
   * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within a route rule's routeAction.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction route_action = 424563948;</code>
   * @return Whether the routeAction field is set.
   */
  boolean hasRouteAction();
  /**
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within a route rule's routeAction.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction route_action = 424563948;</code>
   * @return The routeAction.
   */
  com.google.cloud.compute.v1.HttpRouteAction getRouteAction();
  /**
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. URL maps for Classic external HTTP(S) load balancers only support the urlRewrite action within a route rule's routeAction.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRouteAction route_action = 424563948;</code>
   */
  com.google.cloud.compute.v1.HttpRouteActionOrBuilder getRouteActionOrBuilder();

  /**
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction url_redirect = 405147820;</code>
   * @return Whether the urlRedirect field is set.
   */
  boolean hasUrlRedirect();
  /**
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction url_redirect = 405147820;</code>
   * @return The urlRedirect.
   */
  com.google.cloud.compute.v1.HttpRedirectAction getUrlRedirect();
  /**
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpRedirectAction url_redirect = 405147820;</code>
   */
  com.google.cloud.compute.v1.HttpRedirectActionOrBuilder getUrlRedirectOrBuilder();
}
