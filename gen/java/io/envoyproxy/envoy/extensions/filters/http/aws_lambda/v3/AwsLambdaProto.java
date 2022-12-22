// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/aws_lambda/v3/aws_lambda.proto

package io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3;

public final class AwsLambdaProto {
  private AwsLambdaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_aws_lambda_v3_PerRouteConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_aws_lambda_v3_PerRouteConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<envoy/extensions/filters/http/aws_lamb" +
      "da/v3/aws_lambda.proto\022+envoy.extensions" +
      ".filters.http.aws_lambda.v3\032\035udpa/annota" +
      "tions/status.proto\032!udpa/annotations/ver" +
      "sioning.proto\032\027validate/validate.proto\"\222" +
      "\002\n\006Config\022\024\n\003arn\030\001 \001(\tB\007\372B\004r\002\020\001\022\033\n\023paylo" +
      "ad_passthrough\030\002 \001(\010\022e\n\017invocation_mode\030" +
      "\003 \001(\0162B.envoy.extensions.filters.http.aw" +
      "s_lambda.v3.Config.InvocationModeB\010\372B\005\202\001" +
      "\002\020\001\"3\n\016InvocationMode\022\017\n\013SYNCHRONOUS\020\000\022\020" +
      "\n\014ASYNCHRONOUS\020\001:9\232\305\210\0364\n2envoy.config.fi" +
      "lter.http.aws_lambda.v2alpha.Config\"\237\001\n\016" +
      "PerRouteConfig\022J\n\rinvoke_config\030\001 \001(\01323." +
      "envoy.extensions.filters.http.aws_lambda" +
      ".v3.Config:A\232\305\210\036<\n:envoy.config.filter.h" +
      "ttp.aws_lambda.v2alpha.PerRouteConfigB\266\001" +
      "\n9io.envoyproxy.envoy.extensions.filters" +
      ".http.aws_lambda.v3B\016AwsLambdaProtoP\001Z_g" +
      "ithub.com/envoyproxy/go-control-plane/en" +
      "voy/extensions/filters/http/aws_lambda/v" +
      "3;aws_lambdav3\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_descriptor,
        new java.lang.String[] { "Arn", "PayloadPassthrough", "InvocationMode", });
    internal_static_envoy_extensions_filters_http_aws_lambda_v3_PerRouteConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_filters_http_aws_lambda_v3_PerRouteConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_aws_lambda_v3_PerRouteConfig_descriptor,
        new java.lang.String[] { "InvokeConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}