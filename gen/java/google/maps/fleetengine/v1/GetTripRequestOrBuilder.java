// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/trip_api.proto

package google.maps.fleetengine.v1;

public interface GetTripRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.GetTripRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   * @return The header.
   */
  google.maps.fleetengine.v1.RequestHeader getHeader();
  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   */
  google.maps.fleetengine.v1.RequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Required. Must be in the format `providers/{provider}/trips/{trip}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Must be in the format `providers/{provider}/trips/{trip}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The subset of Trip fields that should be returned and their interpretation.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TripView view = 11;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * The subset of Trip fields that should be returned and their interpretation.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TripView view = 11;</code>
   * @return The view.
   */
  google.maps.fleetengine.v1.TripView getView();

  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which `Trip.route` or
   * `Trip.current_route_segment` data are retrieved. If route data are
   * unchanged since this timestamp, the route field is not set in the response.
   * If a minimum is unspecified, the route data are always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_version = 6;</code>
   * @return Whether the currentRouteSegmentVersion field is set.
   */
  boolean hasCurrentRouteSegmentVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which `Trip.route` or
   * `Trip.current_route_segment` data are retrieved. If route data are
   * unchanged since this timestamp, the route field is not set in the response.
   * If a minimum is unspecified, the route data are always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_version = 6;</code>
   * @return The currentRouteSegmentVersion.
   */
  com.google.protobuf.Timestamp getCurrentRouteSegmentVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which `Trip.route` or
   * `Trip.current_route_segment` data are retrieved. If route data are
   * unchanged since this timestamp, the route field is not set in the response.
   * If a minimum is unspecified, the route data are always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_version = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentRouteSegmentVersionOrBuilder();

  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.remaining_waypoints` are retrieved. If they are unchanged since this
   * timestamp, the `remaining_waypoints` are not set in the response. If this
   * field is unspecified, `remaining_waypoints` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remaining_waypoints_version = 7;</code>
   * @return Whether the remainingWaypointsVersion field is set.
   */
  boolean hasRemainingWaypointsVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.remaining_waypoints` are retrieved. If they are unchanged since this
   * timestamp, the `remaining_waypoints` are not set in the response. If this
   * field is unspecified, `remaining_waypoints` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remaining_waypoints_version = 7;</code>
   * @return The remainingWaypointsVersion.
   */
  com.google.protobuf.Timestamp getRemainingWaypointsVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.remaining_waypoints` are retrieved. If they are unchanged since this
   * timestamp, the `remaining_waypoints` are not set in the response. If this
   * field is unspecified, `remaining_waypoints` is always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remaining_waypoints_version = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRemainingWaypointsVersionOrBuilder();

  /**
   * <pre>
   * The returned current route format, `LAT_LNG_LIST_TYPE` (in `Trip.route`),
   * or `ENCODED_POLYLINE_TYPE` (in `Trip.current_route_segment`). The default
   * is `LAT_LNG_LIST_TYPE`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.PolylineFormatType route_format_type = 8;</code>
   * @return The enum numeric value on the wire for routeFormatType.
   */
  int getRouteFormatTypeValue();
  /**
   * <pre>
   * The returned current route format, `LAT_LNG_LIST_TYPE` (in `Trip.route`),
   * or `ENCODED_POLYLINE_TYPE` (in `Trip.current_route_segment`). The default
   * is `LAT_LNG_LIST_TYPE`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.PolylineFormatType route_format_type = 8;</code>
   * @return The routeFormatType.
   */
  google.maps.fleetengine.v1.PolylineFormatType getRouteFormatType();

  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.current_route_segment_traffic` is retrieved. If traffic data are
   * unchanged since this timestamp, the `current_route_segment_traffic` field
   * is not set in the response. If a minimum is unspecified, the traffic data
   * are always retrieved. Note that traffic is only available for On-Demand
   * Rides and Deliveries Solution customers.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_traffic_version = 9;</code>
   * @return Whether the currentRouteSegmentTrafficVersion field is set.
   */
  boolean hasCurrentRouteSegmentTrafficVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.current_route_segment_traffic` is retrieved. If traffic data are
   * unchanged since this timestamp, the `current_route_segment_traffic` field
   * is not set in the response. If a minimum is unspecified, the traffic data
   * are always retrieved. Note that traffic is only available for On-Demand
   * Rides and Deliveries Solution customers.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_traffic_version = 9;</code>
   * @return The currentRouteSegmentTrafficVersion.
   */
  com.google.protobuf.Timestamp getCurrentRouteSegmentTrafficVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.current_route_segment_traffic` is retrieved. If traffic data are
   * unchanged since this timestamp, the `current_route_segment_traffic` field
   * is not set in the response. If a minimum is unspecified, the traffic data
   * are always retrieved. Note that traffic is only available for On-Demand
   * Rides and Deliveries Solution customers.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_route_segment_traffic_version = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentRouteSegmentTrafficVersionOrBuilder();

  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.remaining_waypoints.traffic_to_waypoint` and
   * `Trip.remaining_waypoints.path_to_waypoint` data are retrieved. If data are
   * unchanged since this timestamp, the fields above are
   * not set in the response. If `remaining_waypoints_route_version` is
   * unspecified, traffic and path are always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remaining_waypoints_route_version = 10;</code>
   * @return Whether the remainingWaypointsRouteVersion field is set.
   */
  boolean hasRemainingWaypointsRouteVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.remaining_waypoints.traffic_to_waypoint` and
   * `Trip.remaining_waypoints.path_to_waypoint` data are retrieved. If data are
   * unchanged since this timestamp, the fields above are
   * not set in the response. If `remaining_waypoints_route_version` is
   * unspecified, traffic and path are always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remaining_waypoints_route_version = 10;</code>
   * @return The remainingWaypointsRouteVersion.
   */
  com.google.protobuf.Timestamp getRemainingWaypointsRouteVersion();
  /**
   * <pre>
   * Indicates the minimum timestamp (exclusive) for which
   * `Trip.remaining_waypoints.traffic_to_waypoint` and
   * `Trip.remaining_waypoints.path_to_waypoint` data are retrieved. If data are
   * unchanged since this timestamp, the fields above are
   * not set in the response. If `remaining_waypoints_route_version` is
   * unspecified, traffic and path are always retrieved.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remaining_waypoints_route_version = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRemainingWaypointsRouteVersionOrBuilder();
}