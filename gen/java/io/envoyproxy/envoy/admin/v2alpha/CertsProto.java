// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v2alpha/certs.proto

package io.envoyproxy.envoy.admin.v2alpha;

public final class CertsProto {
  private CertsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v2alpha_Certificates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v2alpha_Certificates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v2alpha_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v2alpha_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v2alpha_CertificateDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v2alpha_CertificateDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v2alpha_SubjectAlternateName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v2alpha_SubjectAlternateName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037envoy/admin/v2alpha/certs.proto\022\023envoy" +
      ".admin.v2alpha\032\037google/protobuf/timestam" +
      "p.proto\032\035udpa/annotations/status.proto\"F" +
      "\n\014Certificates\0226\n\014certificates\030\001 \003(\0132 .e" +
      "nvoy.admin.v2alpha.Certificate\"\204\001\n\013Certi" +
      "ficate\0228\n\007ca_cert\030\001 \003(\0132\'.envoy.admin.v2" +
      "alpha.CertificateDetails\022;\n\ncert_chain\030\002" +
      " \003(\0132\'.envoy.admin.v2alpha.CertificateDe" +
      "tails\"\203\002\n\022CertificateDetails\022\014\n\004path\030\001 \001" +
      "(\t\022\025\n\rserial_number\030\002 \001(\t\022D\n\021subject_alt" +
      "_names\030\003 \003(\0132).envoy.admin.v2alpha.Subje" +
      "ctAlternateName\022\035\n\025days_until_expiration" +
      "\030\004 \001(\004\022.\n\nvalid_from\030\005 \001(\0132\032.google.prot" +
      "obuf.Timestamp\0223\n\017expiration_time\030\006 \001(\0132" +
      "\032.google.protobuf.Timestamp\"R\n\024SubjectAl" +
      "ternateName\022\r\n\003dns\030\001 \001(\tH\000\022\r\n\003uri\030\002 \001(\tH" +
      "\000\022\024\n\nip_address\030\003 \001(\tH\000B\006\n\004nameBu\n!io.en" +
      "voyproxy.envoy.admin.v2alphaB\nCertsProto" +
      "P\001Z:github.com/envoyproxy/go-control-pla" +
      "ne/envoy/admin/v2alpha\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_admin_v2alpha_Certificates_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_admin_v2alpha_Certificates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v2alpha_Certificates_descriptor,
        new java.lang.String[] { "Certificates", });
    internal_static_envoy_admin_v2alpha_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_admin_v2alpha_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v2alpha_Certificate_descriptor,
        new java.lang.String[] { "CaCert", "CertChain", });
    internal_static_envoy_admin_v2alpha_CertificateDetails_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_admin_v2alpha_CertificateDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v2alpha_CertificateDetails_descriptor,
        new java.lang.String[] { "Path", "SerialNumber", "SubjectAltNames", "DaysUntilExpiration", "ValidFrom", "ExpirationTime", });
    internal_static_envoy_admin_v2alpha_SubjectAlternateName_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_admin_v2alpha_SubjectAlternateName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v2alpha_SubjectAlternateName_descriptor,
        new java.lang.String[] { "Dns", "Uri", "IpAddress", "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.TimestampProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
