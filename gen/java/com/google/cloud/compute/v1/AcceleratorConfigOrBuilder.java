// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AcceleratorConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AcceleratorConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of the guest accelerator cards exposed to this instance.
   * </pre>
   *
   * <code>optional int32 accelerator_count = 504879675;</code>
   * @return Whether the acceleratorCount field is set.
   */
  boolean hasAcceleratorCount();
  /**
   * <pre>
   * The number of the guest accelerator cards exposed to this instance.
   * </pre>
   *
   * <code>optional int32 accelerator_count = 504879675;</code>
   * @return The acceleratorCount.
   */
  int getAcceleratorCount();

  /**
   * <pre>
   * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   * @return Whether the acceleratorType field is set.
   */
  boolean hasAcceleratorType();
  /**
   * <pre>
   * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   * @return The acceleratorType.
   */
  java.lang.String getAcceleratorType();
  /**
   * <pre>
   * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   * @return The bytes for acceleratorType.
   */
  com.google.protobuf.ByteString
      getAcceleratorTypeBytes();
}
