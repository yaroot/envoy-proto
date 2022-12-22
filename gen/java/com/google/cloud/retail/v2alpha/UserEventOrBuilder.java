// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/user_event.proto

package com.google.cloud.retail.v2alpha;

public interface UserEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.UserEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. User event type. Allowed values are:
   * * `add-to-cart`: Products being added to cart.
   * * `category-page-view`: Special pages such as sale or promotion pages
   *   viewed.
   * * `detail-page-view`: Products detail page viewed.
   * * `home-page-view`: Homepage viewed.
   * * `promotion-offered`: Promotion is offered to a user.
   * * `promotion-not-offered`: Promotion is not offered to a user.
   * * `purchase-complete`: User finishing a purchase.
   * * `search`: Product search.
   * * `shopping-cart-page-view`: User viewing a shopping cart.
   * </pre>
   *
   * <code>string event_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * Required. User event type. Allowed values are:
   * * `add-to-cart`: Products being added to cart.
   * * `category-page-view`: Special pages such as sale or promotion pages
   *   viewed.
   * * `detail-page-view`: Products detail page viewed.
   * * `home-page-view`: Homepage viewed.
   * * `promotion-offered`: Promotion is offered to a user.
   * * `promotion-not-offered`: Promotion is not offered to a user.
   * * `purchase-complete`: User finishing a purchase.
   * * `search`: Product search.
   * * `shopping-cart-page-view`: User viewing a shopping cart.
   * </pre>
   *
   * <code>string event_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * Required. A unique identifier for tracking visitors.
   * For example, this could be implemented with an HTTP cookie, which should be
   * able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor log in/out of the website.
   * Don't set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded model
   * quality.
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * The field should not contain PII or user-data. We recommend to use Google
   * Analytics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#clientId)
   * for this field.
   * </pre>
   *
   * <code>string visitor_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The visitorId.
   */
  java.lang.String getVisitorId();
  /**
   * <pre>
   * Required. A unique identifier for tracking visitors.
   * For example, this could be implemented with an HTTP cookie, which should be
   * able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor log in/out of the website.
   * Don't set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded model
   * quality.
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * The field should not contain PII or user-data. We recommend to use Google
   * Analytics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#clientId)
   * for this field.
   * </pre>
   *
   * <code>string visitor_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for visitorId.
   */
  com.google.protobuf.ByteString
      getVisitorIdBytes();

  /**
   * <pre>
   * A unique identifier for tracking a visitor session with a length limit of
   * 128 bytes. A session is an aggregation of an end user behavior in a time
   * span.
   * A general guideline to populate the sesion_id:
   * 1. If user has no activity for 30 min, a new session_id should be assigned.
   * 2. The session_id should be unique across users, suggest use uuid or add
   * visitor_id as prefix.
   * </pre>
   *
   * <code>string session_id = 21;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <pre>
   * A unique identifier for tracking a visitor session with a length limit of
   * 128 bytes. A session is an aggregation of an end user behavior in a time
   * span.
   * A general guideline to populate the sesion_id:
   * 1. If user has no activity for 30 min, a new session_id should be assigned.
   * 2. The session_id should be unique across users, suggest use uuid or add
   * visitor_id as prefix.
   * </pre>
   *
   * <code>string session_id = 21;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * Only required for
   * [UserEventService.ImportUserEvents][google.cloud.retail.v2alpha.UserEventService.ImportUserEvents]
   * method. Timestamp of when the user event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Only required for
   * [UserEventService.ImportUserEvents][google.cloud.retail.v2alpha.UserEventService.ImportUserEvents]
   * method. Timestamp of when the user event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * Only required for
   * [UserEventService.ImportUserEvents][google.cloud.retail.v2alpha.UserEventService.ImportUserEvents]
   * method. Timestamp of when the user event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups (e.g. using Retail API, using different
   * recommendation models).
   * </pre>
   *
   * <code>repeated string experiment_ids = 4;</code>
   * @return A list containing the experimentIds.
   */
  java.util.List<java.lang.String>
      getExperimentIdsList();
  /**
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups (e.g. using Retail API, using different
   * recommendation models).
   * </pre>
   *
   * <code>repeated string experiment_ids = 4;</code>
   * @return The count of experimentIds.
   */
  int getExperimentIdsCount();
  /**
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups (e.g. using Retail API, using different
   * recommendation models).
   * </pre>
   *
   * <code>repeated string experiment_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The experimentIds at the given index.
   */
  java.lang.String getExperimentIds(int index);
  /**
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups (e.g. using Retail API, using different
   * recommendation models).
   * </pre>
   *
   * <code>repeated string experiment_ids = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the experimentIds at the given index.
   */
  com.google.protobuf.ByteString
      getExperimentIdsBytes(int index);

  /**
   * <pre>
   * Highly recommended for user events that are the result of
   * [PredictionService.Predict][google.cloud.retail.v2alpha.PredictionService.Predict].
   * This field enables accurate attribution of recommendation model
   * performance.
   * The value must be a valid
   * [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
   * for user events that are the result of
   * [PredictionService.Predict][google.cloud.retail.v2alpha.PredictionService.Predict].
   * The value must be a valid
   * [SearchResponse.attribution_token][google.cloud.retail.v2alpha.SearchResponse.attribution_token]
   * for user events that are the result of
   * [SearchService.Search][google.cloud.retail.v2alpha.SearchService.Search].
   * This token enables us to accurately attribute page view or purchase back to
   * the event and the particular predict response containing this
   * clicked/purchased product. If user clicks on product K in the
   * recommendation results, pass
   * [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
   * as a URL parameter to product K's page. When recording events on product
   * K's page, log the
   * [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
   * to this field.
   * </pre>
   *
   * <code>string attribution_token = 5;</code>
   * @return The attributionToken.
   */
  java.lang.String getAttributionToken();
  /**
   * <pre>
   * Highly recommended for user events that are the result of
   * [PredictionService.Predict][google.cloud.retail.v2alpha.PredictionService.Predict].
   * This field enables accurate attribution of recommendation model
   * performance.
   * The value must be a valid
   * [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
   * for user events that are the result of
   * [PredictionService.Predict][google.cloud.retail.v2alpha.PredictionService.Predict].
   * The value must be a valid
   * [SearchResponse.attribution_token][google.cloud.retail.v2alpha.SearchResponse.attribution_token]
   * for user events that are the result of
   * [SearchService.Search][google.cloud.retail.v2alpha.SearchService.Search].
   * This token enables us to accurately attribute page view or purchase back to
   * the event and the particular predict response containing this
   * clicked/purchased product. If user clicks on product K in the
   * recommendation results, pass
   * [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
   * as a URL parameter to product K's page. When recording events on product
   * K's page, log the
   * [PredictResponse.attribution_token][google.cloud.retail.v2alpha.PredictResponse.attribution_token]
   * to this field.
   * </pre>
   *
   * <code>string attribution_token = 5;</code>
   * @return The bytes for attributionToken.
   */
  com.google.protobuf.ByteString
      getAttributionTokenBytes();

  /**
   * <pre>
   * The main product details related to the event.
   * This field is optional except for the following event types:
   * * `add-to-cart`
   * * `detail-page-view`
   * * `purchase-complete`
   * In a `search` event, this field represents the products returned to the end
   * user on the current page (the end user may have not finished browsing the
   * whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [product_details][google.cloud.retail.v2alpha.UserEvent.product_details] is
   * desired. The end user may have not finished browsing the whole page yet.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ProductDetail product_details = 6;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.ProductDetail> 
      getProductDetailsList();
  /**
   * <pre>
   * The main product details related to the event.
   * This field is optional except for the following event types:
   * * `add-to-cart`
   * * `detail-page-view`
   * * `purchase-complete`
   * In a `search` event, this field represents the products returned to the end
   * user on the current page (the end user may have not finished browsing the
   * whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [product_details][google.cloud.retail.v2alpha.UserEvent.product_details] is
   * desired. The end user may have not finished browsing the whole page yet.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ProductDetail product_details = 6;</code>
   */
  com.google.cloud.retail.v2alpha.ProductDetail getProductDetails(int index);
  /**
   * <pre>
   * The main product details related to the event.
   * This field is optional except for the following event types:
   * * `add-to-cart`
   * * `detail-page-view`
   * * `purchase-complete`
   * In a `search` event, this field represents the products returned to the end
   * user on the current page (the end user may have not finished browsing the
   * whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [product_details][google.cloud.retail.v2alpha.UserEvent.product_details] is
   * desired. The end user may have not finished browsing the whole page yet.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ProductDetail product_details = 6;</code>
   */
  int getProductDetailsCount();
  /**
   * <pre>
   * The main product details related to the event.
   * This field is optional except for the following event types:
   * * `add-to-cart`
   * * `detail-page-view`
   * * `purchase-complete`
   * In a `search` event, this field represents the products returned to the end
   * user on the current page (the end user may have not finished browsing the
   * whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [product_details][google.cloud.retail.v2alpha.UserEvent.product_details] is
   * desired. The end user may have not finished browsing the whole page yet.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ProductDetail product_details = 6;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ProductDetailOrBuilder> 
      getProductDetailsOrBuilderList();
  /**
   * <pre>
   * The main product details related to the event.
   * This field is optional except for the following event types:
   * * `add-to-cart`
   * * `detail-page-view`
   * * `purchase-complete`
   * In a `search` event, this field represents the products returned to the end
   * user on the current page (the end user may have not finished browsing the
   * whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [product_details][google.cloud.retail.v2alpha.UserEvent.product_details] is
   * desired. The end user may have not finished browsing the whole page yet.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ProductDetail product_details = 6;</code>
   */
  com.google.cloud.retail.v2alpha.ProductDetailOrBuilder getProductDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * The main auto-completion details related to the event.
   * This field should be set for `search` event when autocomplete function is
   * enabled and the user clicks a suggestion for search.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CompletionDetail completion_detail = 22;</code>
   * @return Whether the completionDetail field is set.
   */
  boolean hasCompletionDetail();
  /**
   * <pre>
   * The main auto-completion details related to the event.
   * This field should be set for `search` event when autocomplete function is
   * enabled and the user clicks a suggestion for search.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CompletionDetail completion_detail = 22;</code>
   * @return The completionDetail.
   */
  com.google.cloud.retail.v2alpha.CompletionDetail getCompletionDetail();
  /**
   * <pre>
   * The main auto-completion details related to the event.
   * This field should be set for `search` event when autocomplete function is
   * enabled and the user clicks a suggestion for search.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.CompletionDetail completion_detail = 22;</code>
   */
  com.google.cloud.retail.v2alpha.CompletionDetailOrBuilder getCompletionDetailOrBuilder();

  /**
   * <pre>
   * Extra user event features to include in the recommendation model.
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Retail API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   * For product recommendations, an example of extra user information is
   * traffic_channel, which is how a user arrives at the site. Users can arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 7;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Extra user event features to include in the recommendation model.
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Retail API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   * For product recommendations, an example of extra user information is
   * traffic_channel, which is how a user arrives at the site. Users can arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 7;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.retail.v2alpha.CustomAttribute>
  getAttributes();
  /**
   * <pre>
   * Extra user event features to include in the recommendation model.
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Retail API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   * For product recommendations, an example of extra user information is
   * traffic_channel, which is how a user arrives at the site. Users can arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 7;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.retail.v2alpha.CustomAttribute>
  getAttributesMap();
  /**
   * <pre>
   * Extra user event features to include in the recommendation model.
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Retail API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   * For product recommendations, an example of extra user information is
   * traffic_channel, which is how a user arrives at the site. Users can arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 7;</code>
   */
  /* nullable */
com.google.cloud.retail.v2alpha.CustomAttribute getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.retail.v2alpha.CustomAttribute defaultValue);
  /**
   * <pre>
   * Extra user event features to include in the recommendation model.
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Retail API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   * This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT
   * error is returned:
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   * For product recommendations, an example of extra user information is
   * traffic_channel, which is how a user arrives at the site. Users can arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.retail.v2alpha.CustomAttribute&gt; attributes = 7;</code>
   */
  com.google.cloud.retail.v2alpha.CustomAttribute getAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The ID or name of the associated shopping cart. This ID is used
   * to associate multiple items added or present in the cart before purchase.
   * This can only be set for `add-to-cart`, `purchase-complete`, or
   * `shopping-cart-page-view` events.
   * </pre>
   *
   * <code>string cart_id = 8;</code>
   * @return The cartId.
   */
  java.lang.String getCartId();
  /**
   * <pre>
   * The ID or name of the associated shopping cart. This ID is used
   * to associate multiple items added or present in the cart before purchase.
   * This can only be set for `add-to-cart`, `purchase-complete`, or
   * `shopping-cart-page-view` events.
   * </pre>
   *
   * <code>string cart_id = 8;</code>
   * @return The bytes for cartId.
   */
  com.google.protobuf.ByteString
      getCartIdBytes();

  /**
   * <pre>
   * A transaction represents the entire purchase transaction.
   * Required for `purchase-complete` events. Other event types should not set
   * this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.PurchaseTransaction purchase_transaction = 9;</code>
   * @return Whether the purchaseTransaction field is set.
   */
  boolean hasPurchaseTransaction();
  /**
   * <pre>
   * A transaction represents the entire purchase transaction.
   * Required for `purchase-complete` events. Other event types should not set
   * this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.PurchaseTransaction purchase_transaction = 9;</code>
   * @return The purchaseTransaction.
   */
  com.google.cloud.retail.v2alpha.PurchaseTransaction getPurchaseTransaction();
  /**
   * <pre>
   * A transaction represents the entire purchase transaction.
   * Required for `purchase-complete` events. Other event types should not set
   * this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.PurchaseTransaction purchase_transaction = 9;</code>
   */
  com.google.cloud.retail.v2alpha.PurchaseTransactionOrBuilder getPurchaseTransactionOrBuilder();

  /**
   * <pre>
   * The user's search query.
   * See [SearchRequest.query][google.cloud.retail.v2alpha.SearchRequest.query]
   * for definition.
   * The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * At least one of
   * [search_query][google.cloud.retail.v2alpha.UserEvent.search_query] or
   * [page_categories][google.cloud.retail.v2alpha.UserEvent.page_categories] is
   * required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string search_query = 10;</code>
   * @return The searchQuery.
   */
  java.lang.String getSearchQuery();
  /**
   * <pre>
   * The user's search query.
   * See [SearchRequest.query][google.cloud.retail.v2alpha.SearchRequest.query]
   * for definition.
   * The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * At least one of
   * [search_query][google.cloud.retail.v2alpha.UserEvent.search_query] or
   * [page_categories][google.cloud.retail.v2alpha.UserEvent.page_categories] is
   * required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string search_query = 10;</code>
   * @return The bytes for searchQuery.
   */
  com.google.protobuf.ByteString
      getSearchQueryBytes();

  /**
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the products being filtered.
   * See
   * [SearchRequest.filter][google.cloud.retail.v2alpha.SearchRequest.filter]
   * for definition and syntax.
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string filter = 16;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the products being filtered.
   * See
   * [SearchRequest.filter][google.cloud.retail.v2alpha.SearchRequest.filter]
   * for definition and syntax.
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string filter = 16;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The order in which products are returned.
   * See
   * [SearchRequest.order_by][google.cloud.retail.v2alpha.SearchRequest.order_by]
   * for definition and syntax.
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string order_by = 17;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * The order in which products are returned.
   * See
   * [SearchRequest.order_by][google.cloud.retail.v2alpha.SearchRequest.order_by]
   * for definition and syntax.
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string order_by = 17;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * An integer that specifies the current offset for pagination (the 0-indexed
   * starting location, amongst the products deemed by the API as relevant).
   * See
   * [SearchRequest.offset][google.cloud.retail.v2alpha.SearchRequest.offset]
   * for definition.
   * If this field is negative, an INVALID_ARGUMENT is returned.
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>int32 offset = 18;</code>
   * @return The offset.
   */
  int getOffset();

  /**
   * <pre>
   * The categories associated with a category page.
   * To represent full path of category, use '&gt;' sign to separate different
   * hierarchies. If '&gt;' is part of the category name, replace it with
   * other character(s).
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * "pageCategories" : ["Sales &gt; 2017 Black Friday Deals"].
   * Required for `category-page-view` events. At least one of
   * [search_query][google.cloud.retail.v2alpha.UserEvent.search_query] or
   * [page_categories][google.cloud.retail.v2alpha.UserEvent.page_categories] is
   * required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string page_categories = 11;</code>
   * @return A list containing the pageCategories.
   */
  java.util.List<java.lang.String>
      getPageCategoriesList();
  /**
   * <pre>
   * The categories associated with a category page.
   * To represent full path of category, use '&gt;' sign to separate different
   * hierarchies. If '&gt;' is part of the category name, replace it with
   * other character(s).
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * "pageCategories" : ["Sales &gt; 2017 Black Friday Deals"].
   * Required for `category-page-view` events. At least one of
   * [search_query][google.cloud.retail.v2alpha.UserEvent.search_query] or
   * [page_categories][google.cloud.retail.v2alpha.UserEvent.page_categories] is
   * required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string page_categories = 11;</code>
   * @return The count of pageCategories.
   */
  int getPageCategoriesCount();
  /**
   * <pre>
   * The categories associated with a category page.
   * To represent full path of category, use '&gt;' sign to separate different
   * hierarchies. If '&gt;' is part of the category name, replace it with
   * other character(s).
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * "pageCategories" : ["Sales &gt; 2017 Black Friday Deals"].
   * Required for `category-page-view` events. At least one of
   * [search_query][google.cloud.retail.v2alpha.UserEvent.search_query] or
   * [page_categories][google.cloud.retail.v2alpha.UserEvent.page_categories] is
   * required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string page_categories = 11;</code>
   * @param index The index of the element to return.
   * @return The pageCategories at the given index.
   */
  java.lang.String getPageCategories(int index);
  /**
   * <pre>
   * The categories associated with a category page.
   * To represent full path of category, use '&gt;' sign to separate different
   * hierarchies. If '&gt;' is part of the category name, replace it with
   * other character(s).
   * Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy:
   * "pageCategories" : ["Sales &gt; 2017 Black Friday Deals"].
   * Required for `category-page-view` events. At least one of
   * [search_query][google.cloud.retail.v2alpha.UserEvent.search_query] or
   * [page_categories][google.cloud.retail.v2alpha.UserEvent.page_categories] is
   * required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>repeated string page_categories = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the pageCategories at the given index.
   */
  com.google.protobuf.ByteString
      getPageCategoriesBytes(int index);

  /**
   * <pre>
   * User information.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.UserInfo user_info = 12;</code>
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   * <pre>
   * User information.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.UserInfo user_info = 12;</code>
   * @return The userInfo.
   */
  com.google.cloud.retail.v2alpha.UserInfo getUserInfo();
  /**
   * <pre>
   * User information.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.UserInfo user_info = 12;</code>
   */
  com.google.cloud.retail.v2alpha.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   * <pre>
   * Complete URL (window.location.href) of the user's current page.
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically. Maximum length 5,000
   * characters.
   * </pre>
   *
   * <code>string uri = 13;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Complete URL (window.location.href) of the user's current page.
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically. Maximum length 5,000
   * characters.
   * </pre>
   *
   * <code>string uri = 13;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The referrer URL of the current page.
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically.
   * </pre>
   *
   * <code>string referrer_uri = 14;</code>
   * @return The referrerUri.
   */
  java.lang.String getReferrerUri();
  /**
   * <pre>
   * The referrer URL of the current page.
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically.
   * </pre>
   *
   * <code>string referrer_uri = 14;</code>
   * @return The bytes for referrerUri.
   */
  com.google.protobuf.ByteString
      getReferrerUriBytes();

  /**
   * <pre>
   * A unique ID of a web page view.
   * This should be kept the same for all user events triggered from the same
   * pageview. For example, an item detail page view could trigger multiple
   * events as the user is browsing the page. The `pageViewId` property should
   * be kept the same for all these events so that they can be grouped together
   * properly.
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically.
   * </pre>
   *
   * <code>string page_view_id = 15;</code>
   * @return The pageViewId.
   */
  java.lang.String getPageViewId();
  /**
   * <pre>
   * A unique ID of a web page view.
   * This should be kept the same for all user events triggered from the same
   * pageview. For example, an item detail page view could trigger multiple
   * events as the user is browsing the page. The `pageViewId` property should
   * be kept the same for all these events so that they can be grouped together
   * properly.
   * When using the client side event reporting with JavaScript pixel and Google
   * Tag Manager, this value is filled in automatically.
   * </pre>
   *
   * <code>string page_view_id = 15;</code>
   * @return The bytes for pageViewId.
   */
  com.google.protobuf.ByteString
      getPageViewIdBytes();
}
