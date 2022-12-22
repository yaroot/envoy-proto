// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/rbac/v2/rbac.proto

package io.envoyproxy.envoy.config.rbac.v2;

public final class RbacProto {
  private RbacProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_RBAC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_RBAC_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_RBAC_PoliciesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_RBAC_PoliciesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_Permission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_Permission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_Permission_Set_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_Permission_Set_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_Principal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_Principal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_Principal_Set_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_Principal_Set_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v2_Principal_Authenticated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v2_Principal_Authenticated_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037envoy/config/rbac/v2/rbac.proto\022\024envoy" +
      ".config.rbac.v2\032\037envoy/api/v2/core/addre" +
      "ss.proto\032)envoy/api/v2/route/route_compo" +
      "nents.proto\032!envoy/type/matcher/metadata" +
      ".proto\032\035envoy/type/matcher/path.proto\032\037e" +
      "nvoy/type/matcher/string.proto\032%google/a" +
      "pi/expr/v1alpha1/syntax.proto\032\035udpa/anno" +
      "tations/status.proto\032\027validate/validate." +
      "proto\"\343\001\n\004RBAC\0221\n\006action\030\001 \001(\0162!.envoy.c" +
      "onfig.rbac.v2.RBAC.Action\022:\n\010policies\030\002 " +
      "\003(\0132(.envoy.config.rbac.v2.RBAC.Policies" +
      "Entry\032M\n\rPoliciesEntry\022\013\n\003key\030\001 \001(\t\022+\n\005v" +
      "alue\030\002 \001(\0132\034.envoy.config.rbac.v2.Policy" +
      ":\0028\001\"\035\n\006Action\022\t\n\005ALLOW\020\000\022\010\n\004DENY\020\001\"\273\001\n\006" +
      "Policy\022?\n\013permissions\030\001 \003(\0132 .envoy.conf" +
      "ig.rbac.v2.PermissionB\010\372B\005\222\001\002\010\001\022=\n\nprinc" +
      "ipals\030\002 \003(\0132\037.envoy.config.rbac.v2.Princ" +
      "ipalB\010\372B\005\222\001\002\010\001\0221\n\tcondition\030\003 \001(\0132\036.goog" +
      "le.api.expr.v1alpha1.Expr\"\344\004\n\nPermission" +
      "\0229\n\tand_rules\030\001 \001(\0132$.envoy.config.rbac." +
      "v2.Permission.SetH\000\0228\n\010or_rules\030\002 \001(\0132$." +
      "envoy.config.rbac.v2.Permission.SetH\000\022\026\n" +
      "\003any\030\003 \001(\010B\007\372B\004j\002\010\001H\000\0223\n\006header\030\004 \001(\0132!." +
      "envoy.api.v2.route.HeaderMatcherH\000\0223\n\010ur" +
      "l_path\030\n \001(\0132\037.envoy.type.matcher.PathMa" +
      "tcherH\000\0226\n\016destination_ip\030\005 \001(\0132\034.envoy." +
      "api.v2.core.CidrRangeH\000\022%\n\020destination_p" +
      "ort\030\006 \001(\rB\t\372B\006*\004\030\377\377\003H\000\0227\n\010metadata\030\007 \001(\013" +
      "2#.envoy.type.matcher.MetadataMatcherH\000\022" +
      "4\n\010not_rule\030\010 \001(\0132 .envoy.config.rbac.v2" +
      ".PermissionH\000\022B\n\025requested_server_name\030\t" +
      " \001(\0132!.envoy.type.matcher.StringMatcherH" +
      "\000\032@\n\003Set\0229\n\005rules\030\001 \003(\0132 .envoy.config.r" +
      "bac.v2.PermissionB\010\372B\005\222\001\002\010\001B\013\n\004rule\022\003\370B\001" +
      "\"\370\005\n\tPrincipal\0226\n\007and_ids\030\001 \001(\0132#.envoy." +
      "config.rbac.v2.Principal.SetH\000\0225\n\006or_ids" +
      "\030\002 \001(\0132#.envoy.config.rbac.v2.Principal." +
      "SetH\000\022\026\n\003any\030\003 \001(\010B\007\372B\004j\002\010\001H\000\022F\n\rauthent" +
      "icated\030\004 \001(\0132-.envoy.config.rbac.v2.Prin" +
      "cipal.AuthenticatedH\000\0225\n\tsource_ip\030\005 \001(\013" +
      "2\034.envoy.api.v2.core.CidrRangeB\002\030\001H\000\0228\n\020" +
      "direct_remote_ip\030\n \001(\0132\034.envoy.api.v2.co" +
      "re.CidrRangeH\000\0221\n\tremote_ip\030\013 \001(\0132\034.envo" +
      "y.api.v2.core.CidrRangeH\000\0223\n\006header\030\006 \001(" +
      "\0132!.envoy.api.v2.route.HeaderMatcherH\000\0223" +
      "\n\010url_path\030\t \001(\0132\037.envoy.type.matcher.Pa" +
      "thMatcherH\000\0227\n\010metadata\030\007 \001(\0132#.envoy.ty" +
      "pe.matcher.MetadataMatcherH\000\0221\n\006not_id\030\010" +
      " \001(\0132\037.envoy.config.rbac.v2.PrincipalH\000\032" +
      "=\n\003Set\0226\n\003ids\030\001 \003(\0132\037.envoy.config.rbac." +
      "v2.PrincipalB\010\372B\005\222\001\002\010\001\032P\n\rAuthenticated\022" +
      "9\n\016principal_name\030\002 \001(\0132!.envoy.type.mat" +
      "cher.StringMatcherJ\004\010\001\020\002B\021\n\nidentifier\022\003" +
      "\370B\001B}\n\"io.envoyproxy.envoy.config.rbac.v" +
      "2B\tRbacProtoP\001ZBgithub.com/envoyproxy/go" +
      "-control-plane/envoy/config/rbac/v2;rbac" +
      "v2\272\200\310\321\006\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.core.AddressProto.getDescriptor(),
          io.envoyproxy.envoy.api.v2.route.RouteComponentsProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.MetadataProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.PathProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.StringProto.getDescriptor(),
          com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_rbac_v2_RBAC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_rbac_v2_RBAC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_RBAC_descriptor,
        new java.lang.String[] { "Action", "Policies", });
    internal_static_envoy_config_rbac_v2_RBAC_PoliciesEntry_descriptor =
      internal_static_envoy_config_rbac_v2_RBAC_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_rbac_v2_RBAC_PoliciesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_RBAC_PoliciesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_config_rbac_v2_Policy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_rbac_v2_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_Policy_descriptor,
        new java.lang.String[] { "Permissions", "Principals", "Condition", });
    internal_static_envoy_config_rbac_v2_Permission_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_rbac_v2_Permission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_Permission_descriptor,
        new java.lang.String[] { "AndRules", "OrRules", "Any", "Header", "UrlPath", "DestinationIp", "DestinationPort", "Metadata", "NotRule", "RequestedServerName", "Rule", });
    internal_static_envoy_config_rbac_v2_Permission_Set_descriptor =
      internal_static_envoy_config_rbac_v2_Permission_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_rbac_v2_Permission_Set_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_Permission_Set_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_envoy_config_rbac_v2_Principal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_rbac_v2_Principal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_Principal_descriptor,
        new java.lang.String[] { "AndIds", "OrIds", "Any", "Authenticated", "SourceIp", "DirectRemoteIp", "RemoteIp", "Header", "UrlPath", "Metadata", "NotId", "Identifier", });
    internal_static_envoy_config_rbac_v2_Principal_Set_descriptor =
      internal_static_envoy_config_rbac_v2_Principal_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_rbac_v2_Principal_Set_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_Principal_Set_descriptor,
        new java.lang.String[] { "Ids", });
    internal_static_envoy_config_rbac_v2_Principal_Authenticated_descriptor =
      internal_static_envoy_config_rbac_v2_Principal_descriptor.getNestedTypes().get(1);
    internal_static_envoy_config_rbac_v2_Principal_Authenticated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v2_Principal_Authenticated_descriptor,
        new java.lang.String[] { "PrincipalName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.core.AddressProto.getDescriptor();
    io.envoyproxy.envoy.api.v2.route.RouteComponentsProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.MetadataProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.PathProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.StringProto.getDescriptor();
    com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}