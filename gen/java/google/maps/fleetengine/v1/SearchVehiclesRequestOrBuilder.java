// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/vehicle_api.proto

package google.maps.fleetengine.v1;

public interface SearchVehiclesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.SearchVehiclesRequest)
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
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The pickup point to search near.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation pickup_point = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the pickupPoint field is set.
   */
  boolean hasPickupPoint();
  /**
   * <pre>
   * Required. The pickup point to search near.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation pickup_point = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pickupPoint.
   */
  google.maps.fleetengine.v1.TerminalLocation getPickupPoint();
  /**
   * <pre>
   * Required. The pickup point to search near.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation pickup_point = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.v1.TerminalLocationOrBuilder getPickupPointOrBuilder();

  /**
   * <pre>
   * The customer's intended dropoff location. The field is required if
   * `trip_types` contains `TripType.SHARED`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation dropoff_point = 5;</code>
   * @return Whether the dropoffPoint field is set.
   */
  boolean hasDropoffPoint();
  /**
   * <pre>
   * The customer's intended dropoff location. The field is required if
   * `trip_types` contains `TripType.SHARED`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation dropoff_point = 5;</code>
   * @return The dropoffPoint.
   */
  google.maps.fleetengine.v1.TerminalLocation getDropoffPoint();
  /**
   * <pre>
   * The customer's intended dropoff location. The field is required if
   * `trip_types` contains `TripType.SHARED`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation dropoff_point = 5;</code>
   */
  google.maps.fleetengine.v1.TerminalLocationOrBuilder getDropoffPointOrBuilder();

  /**
   * <pre>
   * Required. Defines the vehicle search radius around the pickup point. Only
   * vehicles within the search radius will be returned. Value must be between
   * 400 and 10000 meters (inclusive).
   * </pre>
   *
   * <code>int32 pickup_radius_meters = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pickupRadiusMeters.
   */
  int getPickupRadiusMeters();

  /**
   * <pre>
   * Required. Specifies the maximum number of vehicles to return. The value
   * must be between 1 and 50 (inclusive).
   * </pre>
   *
   * <code>int32 count = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count.
   */
  int getCount();

  /**
   * <pre>
   * Required. Specifies the number of passengers being considered for a trip.
   * The value must be greater than or equal to one. The driver is not
   * considered in the capacity value.
   * </pre>
   *
   * <code>int32 minimum_capacity = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The minimumCapacity.
   */
  int getMinimumCapacity();

  /**
   * <pre>
   * Required. Represents the type of proposed trip. Eligible vehicles are those
   * that can support at least one of the specified trip type.
   * `EXCLUSIVE` and `SHARED` may not be included together.
   * `SHARED` is not supported when `current_trips_present` is
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the tripTypes.
   */
  java.util.List<google.maps.fleetengine.v1.TripType> getTripTypesList();
  /**
   * <pre>
   * Required. Represents the type of proposed trip. Eligible vehicles are those
   * that can support at least one of the specified trip type.
   * `EXCLUSIVE` and `SHARED` may not be included together.
   * `SHARED` is not supported when `current_trips_present` is
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of tripTypes.
   */
  int getTripTypesCount();
  /**
   * <pre>
   * Required. Represents the type of proposed trip. Eligible vehicles are those
   * that can support at least one of the specified trip type.
   * `EXCLUSIVE` and `SHARED` may not be included together.
   * `SHARED` is not supported when `current_trips_present` is
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The tripTypes at the given index.
   */
  google.maps.fleetengine.v1.TripType getTripTypes(int index);
  /**
   * <pre>
   * Required. Represents the type of proposed trip. Eligible vehicles are those
   * that can support at least one of the specified trip type.
   * `EXCLUSIVE` and `SHARED` may not be included together.
   * `SHARED` is not supported when `current_trips_present` is
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for tripTypes.
   */
  java.util.List<java.lang.Integer>
  getTripTypesValueList();
  /**
   * <pre>
   * Required. Represents the type of proposed trip. Eligible vehicles are those
   * that can support at least one of the specified trip type.
   * `EXCLUSIVE` and `SHARED` may not be included together.
   * `SHARED` is not supported when `current_trips_present` is
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of tripTypes at the given index.
   */
  int getTripTypesValue(int index);

  /**
   * <pre>
   * Restricts the search to only those vehicles that have updated their
   * locations within the specified duration. If this field is not
   * set, the server uses five minutes as the default value.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_staleness = 10;</code>
   * @return Whether the maximumStaleness field is set.
   */
  boolean hasMaximumStaleness();
  /**
   * <pre>
   * Restricts the search to only those vehicles that have updated their
   * locations within the specified duration. If this field is not
   * set, the server uses five minutes as the default value.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_staleness = 10;</code>
   * @return The maximumStaleness.
   */
  com.google.protobuf.Duration getMaximumStaleness();
  /**
   * <pre>
   * Restricts the search to only those vehicles that have updated their
   * locations within the specified duration. If this field is not
   * set, the server uses five minutes as the default value.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_staleness = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaximumStalenessOrBuilder();

  /**
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<google.maps.fleetengine.v1.Vehicle.VehicleType> 
      getVehicleTypesList();
  /**
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.v1.Vehicle.VehicleType getVehicleTypes(int index);
  /**
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getVehicleTypesCount();
  /**
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends google.maps.fleetengine.v1.Vehicle.VehicleTypeOrBuilder> 
      getVehicleTypesOrBuilderList();
  /**
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.v1.Vehicle.VehicleTypeOrBuilder getVehicleTypesOrBuilder(
      int index);

  /**
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  java.util.List<google.maps.fleetengine.v1.VehicleAttribute> 
      getRequiredAttributesList();
  /**
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  google.maps.fleetengine.v1.VehicleAttribute getRequiredAttributes(int index);
  /**
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  int getRequiredAttributesCount();
  /**
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  java.util.List<? extends google.maps.fleetengine.v1.VehicleAttributeOrBuilder> 
      getRequiredAttributesOrBuilderList();
  /**
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  google.maps.fleetengine.v1.VehicleAttributeOrBuilder getRequiredAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;</code>
   */
  java.util.List<google.maps.fleetengine.v1.VehicleAttributeList> 
      getRequiredOneOfAttributesList();
  /**
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;</code>
   */
  google.maps.fleetengine.v1.VehicleAttributeList getRequiredOneOfAttributes(int index);
  /**
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;</code>
   */
  int getRequiredOneOfAttributesCount();
  /**
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;</code>
   */
  java.util.List<? extends google.maps.fleetengine.v1.VehicleAttributeListOrBuilder> 
      getRequiredOneOfAttributesOrBuilderList();
  /**
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;</code>
   */
  google.maps.fleetengine.v1.VehicleAttributeListOrBuilder getRequiredOneOfAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attribute_sets[0][0] AND
   * required_one_of_attribute_sets[0][1] AND
   * ...)
   * OR
   * (required_one_of_attribute_sets[1][0] AND
   * required_one_of_attribute_sets[1][1] AND
   * ...)
   * ```
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;</code>
   */
  java.util.List<google.maps.fleetengine.v1.VehicleAttributeList> 
      getRequiredOneOfAttributeSetsList();
  /**
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attribute_sets[0][0] AND
   * required_one_of_attribute_sets[0][1] AND
   * ...)
   * OR
   * (required_one_of_attribute_sets[1][0] AND
   * required_one_of_attribute_sets[1][1] AND
   * ...)
   * ```
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;</code>
   */
  google.maps.fleetengine.v1.VehicleAttributeList getRequiredOneOfAttributeSets(int index);
  /**
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attribute_sets[0][0] AND
   * required_one_of_attribute_sets[0][1] AND
   * ...)
   * OR
   * (required_one_of_attribute_sets[1][0] AND
   * required_one_of_attribute_sets[1][1] AND
   * ...)
   * ```
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;</code>
   */
  int getRequiredOneOfAttributeSetsCount();
  /**
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attribute_sets[0][0] AND
   * required_one_of_attribute_sets[0][1] AND
   * ...)
   * OR
   * (required_one_of_attribute_sets[1][0] AND
   * required_one_of_attribute_sets[1][1] AND
   * ...)
   * ```
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;</code>
   */
  java.util.List<? extends google.maps.fleetengine.v1.VehicleAttributeListOrBuilder> 
      getRequiredOneOfAttributeSetsOrBuilderList();
  /**
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attribute_sets[0][0] AND
   * required_one_of_attribute_sets[0][1] AND
   * ...)
   * OR
   * (required_one_of_attribute_sets[1][0] AND
   * required_one_of_attribute_sets[1][1] AND
   * ...)
   * ```
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;</code>
   */
  google.maps.fleetengine.v1.VehicleAttributeListOrBuilder getRequiredOneOfAttributeSetsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. Specifies the desired ordering criterion for results.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder order_by = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for orderBy.
   */
  int getOrderByValue();
  /**
   * <pre>
   * Required. Specifies the desired ordering criterion for results.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder order_by = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The orderBy.
   */
  google.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder getOrderBy();

  /**
   * <pre>
   * Indicates if a vehicle with a single active trip is eligible for another
   * match. If `false`, vehicles with assigned trips are excluded from the
   * search results. If `true`, search results include vehicles with
   * `TripStatus` of `ENROUTE_TO_DROPOFF`.
   * This field is only considered if a single `trip_type` of `EXCLUSIVE` is
   * specified.
   * The default value is `false`.
   * </pre>
   *
   * <code>bool include_back_to_back = 18;</code>
   * @return The includeBackToBack.
   */
  boolean getIncludeBackToBack();

  /**
   * <pre>
   * Indicates the trip associated with this `SearchVehicleRequest`.
   * </pre>
   *
   * <code>string trip_id = 19;</code>
   * @return The tripId.
   */
  java.lang.String getTripId();
  /**
   * <pre>
   * Indicates the trip associated with this `SearchVehicleRequest`.
   * </pre>
   *
   * <code>string trip_id = 19;</code>
   * @return The bytes for tripId.
   */
  com.google.protobuf.ByteString
      getTripIdBytes();

  /**
   * <pre>
   * Restricts vehicles from appearing in the search results based on
   * their current trips.
   * When current_trips_present is `NONE` or `ANY`, `trip_types` can be either
   * `EXCLUSIVE` or `SHARED`, but not both.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.CurrentTripsPresent current_trips_present = 21;</code>
   * @return The enum numeric value on the wire for currentTripsPresent.
   */
  int getCurrentTripsPresentValue();
  /**
   * <pre>
   * Restricts vehicles from appearing in the search results based on
   * their current trips.
   * When current_trips_present is `NONE` or `ANY`, `trip_types` can be either
   * `EXCLUSIVE` or `SHARED`, but not both.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.SearchVehiclesRequest.CurrentTripsPresent current_trips_present = 21;</code>
   * @return The currentTripsPresent.
   */
  google.maps.fleetengine.v1.SearchVehiclesRequest.CurrentTripsPresent getCurrentTripsPresent();
}
