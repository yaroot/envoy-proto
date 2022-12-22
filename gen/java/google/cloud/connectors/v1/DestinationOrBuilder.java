// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/connectors/v1/destination_config.proto

package google.cloud.connectors.v1;

public interface DestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.connectors.v1.Destination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * PSC service attachments.
   * Format: projects/&#42;&#47;regions/&#42;&#47;serviceAttachments/&#42;
   * </pre>
   *
   * <code>string service_attachment = 1;</code>
   * @return Whether the serviceAttachment field is set.
   */
  boolean hasServiceAttachment();
  /**
   * <pre>
   * PSC service attachments.
   * Format: projects/&#42;&#47;regions/&#42;&#47;serviceAttachments/&#42;
   * </pre>
   *
   * <code>string service_attachment = 1;</code>
   * @return The serviceAttachment.
   */
  java.lang.String getServiceAttachment();
  /**
   * <pre>
   * PSC service attachments.
   * Format: projects/&#42;&#47;regions/&#42;&#47;serviceAttachments/&#42;
   * </pre>
   *
   * <code>string service_attachment = 1;</code>
   * @return The bytes for serviceAttachment.
   */
  com.google.protobuf.ByteString
      getServiceAttachmentBytes();

  /**
   * <pre>
   * For publicly routable host.
   * </pre>
   *
   * <code>string host = 2;</code>
   * @return Whether the host field is set.
   */
  boolean hasHost();
  /**
   * <pre>
   * For publicly routable host.
   * </pre>
   *
   * <code>string host = 2;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <pre>
   * For publicly routable host.
   * </pre>
   *
   * <code>string host = 2;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * The port is the target port number that is accepted by the destination.
   * </pre>
   *
   * <code>int32 port = 3;</code>
   * @return The port.
   */
  int getPort();

  public google.cloud.connectors.v1.Destination.DestinationCase getDestinationCase();
}