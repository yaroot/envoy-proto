// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface QueryParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.QueryParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time zone of this conversational query from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York,
   * Europe/Paris. If not provided, the time zone specified in the agent is
   * used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   * <pre>
   * The time zone of this conversational query from the [time zone
   * database](https://www.iana.org/time-zones), e.g., America/New_York,
   * Europe/Paris. If not provided, the time zone specified in the agent is
   * used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString
      getTimeZoneBytes();

  /**
   * <pre>
   * The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   * @return Whether the geoLocation field is set.
   */
  boolean hasGeoLocation();
  /**
   * <pre>
   * The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   * @return The geoLocation.
   */
  com.google.type.LatLng getGeoLocation();
  /**
   * <pre>
   * The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  com.google.type.LatLngOrBuilder getGeoLocationOrBuilder();

  /**
   * <pre>
   * Additional session entity types to replace or extend developer entity types
   * with. The entity synonyms apply to all languages and persist for the
   * session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 3;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType> 
      getSessionEntityTypesList();
  /**
   * <pre>
   * Additional session entity types to replace or extend developer entity types
   * with. The entity synonyms apply to all languages and persist for the
   * session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType getSessionEntityTypes(int index);
  /**
   * <pre>
   * Additional session entity types to replace or extend developer entity types
   * with. The entity synonyms apply to all languages and persist for the
   * session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 3;</code>
   */
  int getSessionEntityTypesCount();
  /**
   * <pre>
   * Additional session entity types to replace or extend developer entity types
   * with. The entity synonyms apply to all languages and persist for the
   * session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder> 
      getSessionEntityTypesOrBuilderList();
  /**
   * <pre>
   * Additional session entity types to replace or extend developer entity types
   * with. The entity synonyms apply to all languages and persist for the
   * session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index);

  /**
   * <pre>
   * This field can be used to pass custom data into the webhook associated with
   * the agent. Arbitrary JSON objects are supported.
   * Some integrations that query a Dialogflow agent may provide additional
   * information in the payload.
   * In particular, for the Dialogflow Phone Gateway integration, this field has
   * the form:
   * ```
   * {
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * This field can be used to pass custom data into the webhook associated with
   * the agent. Arbitrary JSON objects are supported.
   * Some integrations that query a Dialogflow agent may provide additional
   * information in the payload.
   * In particular, for the Dialogflow Phone Gateway integration, this field has
   * the form:
   * ```
   * {
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   * <pre>
   * This field can be used to pass custom data into the webhook associated with
   * the agent. Arbitrary JSON objects are supported.
   * Some integrations that query a Dialogflow agent may provide additional
   * information in the payload.
   * In particular, for the Dialogflow Phone Gateway integration, this field has
   * the form:
   * ```
   * {
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * Additional parameters to be put into [session
   * parameters][SessionInfo.parameters]. To remove a
   * parameter from the session, clients should explicitly set the parameter
   * value to null.
   * You can reference the session parameters in the agent with the following
   * format: $session.params.parameter-id.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 5;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Additional parameters to be put into [session
   * parameters][SessionInfo.parameters]. To remove a
   * parameter from the session, clients should explicitly set the parameter
   * value to null.
   * You can reference the session parameters in the agent with the following
   * format: $session.params.parameter-id.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 5;</code>
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   * <pre>
   * Additional parameters to be put into [session
   * parameters][SessionInfo.parameters]. To remove a
   * parameter from the session, clients should explicitly set the parameter
   * value to null.
   * You can reference the session parameters in the agent with the following
   * format: $session.params.parameter-id.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * * MapKey type: string
   * * MapKey value: parameter name
   * * MapValue type: If parameter's entity type is a composite entity then use
   * map, otherwise, depending on the parameter value type, it could be one of
   * string, number, boolean, null, list or map.
   * * MapValue value: If parameter's entity type is a composite entity then use
   * map from composite entity property names to property values, otherwise,
   * use parameter value.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   * <pre>
   * The unique identifier of the [page][google.cloud.dialogflow.cx.v3beta1.Page] to override the [current
   * page][QueryResult.current_page] in the session.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * If `current_page` is specified, the previous state of the session will be
   * ignored by Dialogflow, including the [previous
   * page][QueryResult.current_page] and the [previous session
   * parameters][QueryResult.parameters].
   * In most cases, [current_page][google.cloud.dialogflow.cx.v3beta1.QueryParameters.current_page] and
   * [parameters][google.cloud.dialogflow.cx.v3beta1.QueryParameters.parameters] should be configured together to
   * direct a session to a specific state.
   * </pre>
   *
   * <code>string current_page = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The currentPage.
   */
  java.lang.String getCurrentPage();
  /**
   * <pre>
   * The unique identifier of the [page][google.cloud.dialogflow.cx.v3beta1.Page] to override the [current
   * page][QueryResult.current_page] in the session.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * If `current_page` is specified, the previous state of the session will be
   * ignored by Dialogflow, including the [previous
   * page][QueryResult.current_page] and the [previous session
   * parameters][QueryResult.parameters].
   * In most cases, [current_page][google.cloud.dialogflow.cx.v3beta1.QueryParameters.current_page] and
   * [parameters][google.cloud.dialogflow.cx.v3beta1.QueryParameters.parameters] should be configured together to
   * direct a session to a specific state.
   * </pre>
   *
   * <code>string current_page = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for currentPage.
   */
  com.google.protobuf.ByteString
      getCurrentPageBytes();

  /**
   * <pre>
   * Whether to disable webhook calls for this request.
   * </pre>
   *
   * <code>bool disable_webhook = 7;</code>
   * @return The disableWebhook.
   */
  boolean getDisableWebhook();

  /**
   * <pre>
   * Configures whether sentiment analysis should be performed. If not
   * provided, sentiment analysis is not performed.
   * </pre>
   *
   * <code>bool analyze_query_text_sentiment = 8;</code>
   * @return The analyzeQueryTextSentiment.
   */
  boolean getAnalyzeQueryTextSentiment();

  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 10;</code>
   */
  int getWebhookHeadersCount();
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 10;</code>
   */
  boolean containsWebhookHeaders(
      java.lang.String key);
  /**
   * Use {@link #getWebhookHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getWebhookHeaders();
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getWebhookHeadersMap();
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 10;</code>
   */
  /* nullable */
java.lang.String getWebhookHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook along with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 10;</code>
   */
  java.lang.String getWebhookHeadersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * A list of flow versions to override for the request.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * If version 1 of flow X is included in this list, the traffic of
   * flow X will go through version 1 regardless of the version configuration in
   * the environment. Each flow can have at most one version specified in this
   * list.
   * </pre>
   *
   * <code>repeated string flow_versions = 14 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the flowVersions.
   */
  java.util.List<java.lang.String>
      getFlowVersionsList();
  /**
   * <pre>
   * A list of flow versions to override for the request.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * If version 1 of flow X is included in this list, the traffic of
   * flow X will go through version 1 regardless of the version configuration in
   * the environment. Each flow can have at most one version specified in this
   * list.
   * </pre>
   *
   * <code>repeated string flow_versions = 14 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of flowVersions.
   */
  int getFlowVersionsCount();
  /**
   * <pre>
   * A list of flow versions to override for the request.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * If version 1 of flow X is included in this list, the traffic of
   * flow X will go through version 1 regardless of the version configuration in
   * the environment. Each flow can have at most one version specified in this
   * list.
   * </pre>
   *
   * <code>repeated string flow_versions = 14 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The flowVersions at the given index.
   */
  java.lang.String getFlowVersions(int index);
  /**
   * <pre>
   * A list of flow versions to override for the request.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * If version 1 of flow X is included in this list, the traffic of
   * flow X will go through version 1 regardless of the version configuration in
   * the environment. Each flow can have at most one version specified in this
   * list.
   * </pre>
   *
   * <code>repeated string flow_versions = 14 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the flowVersions at the given index.
   */
  com.google.protobuf.ByteString
      getFlowVersionsBytes(int index);
}
