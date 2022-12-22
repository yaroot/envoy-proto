// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/delivery/v1/delivery_vehicles.proto

package google.maps.fleetengine.delivery.v1;

public interface VehicleStopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.VehicleStop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location of the stop. Note that the locations in the Tasks might not
   * exactly match this location, but will be within a short distance of it.
   * This field won't be populated in the response of either a `GetTask`, or a
   * `SearchTasks` call.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.LocationInfo planned_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the plannedLocation field is set.
   */
  boolean hasPlannedLocation();
  /**
   * <pre>
   * Required. The location of the stop. Note that the locations in the Tasks might not
   * exactly match this location, but will be within a short distance of it.
   * This field won't be populated in the response of either a `GetTask`, or a
   * `SearchTasks` call.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.LocationInfo planned_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The plannedLocation.
   */
  google.maps.fleetengine.delivery.v1.LocationInfo getPlannedLocation();
  /**
   * <pre>
   * Required. The location of the stop. Note that the locations in the Tasks might not
   * exactly match this location, but will be within a short distance of it.
   * This field won't be populated in the response of either a `GetTask`, or a
   * `SearchTasks` call.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.LocationInfo planned_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.delivery.v1.LocationInfoOrBuilder getPlannedLocationOrBuilder();

  /**
   * <pre>
   * The list of Tasks to be performed at this stop. This field won't be
   * populated in the response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.VehicleStop.TaskInfo tasks = 2;</code>
   */
  java.util.List<google.maps.fleetengine.delivery.v1.VehicleStop.TaskInfo> 
      getTasksList();
  /**
   * <pre>
   * The list of Tasks to be performed at this stop. This field won't be
   * populated in the response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.VehicleStop.TaskInfo tasks = 2;</code>
   */
  google.maps.fleetengine.delivery.v1.VehicleStop.TaskInfo getTasks(int index);
  /**
   * <pre>
   * The list of Tasks to be performed at this stop. This field won't be
   * populated in the response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.VehicleStop.TaskInfo tasks = 2;</code>
   */
  int getTasksCount();
  /**
   * <pre>
   * The list of Tasks to be performed at this stop. This field won't be
   * populated in the response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.VehicleStop.TaskInfo tasks = 2;</code>
   */
  java.util.List<? extends google.maps.fleetengine.delivery.v1.VehicleStop.TaskInfoOrBuilder> 
      getTasksOrBuilderList();
  /**
   * <pre>
   * The list of Tasks to be performed at this stop. This field won't be
   * populated in the response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.VehicleStop.TaskInfo tasks = 2;</code>
   */
  google.maps.fleetengine.delivery.v1.VehicleStop.TaskInfoOrBuilder getTasksOrBuilder(
      int index);

  /**
   * <pre>
   * The state of the `VehicleStop`. This field won't be populated in the
   * response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.VehicleStop.State state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The state of the `VehicleStop`. This field won't be populated in the
   * response of either a `GetTask`, or a `SearchTasks` call.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.VehicleStop.State state = 3;</code>
   * @return The state.
   */
  google.maps.fleetengine.delivery.v1.VehicleStop.State getState();
}