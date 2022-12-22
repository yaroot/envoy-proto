// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/product.proto

package com.google.cloud.retail.v2;

public final class ProductProto {
  private ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_retail_v2_Product_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Product_AttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/retail/v2/product.proto\022\026" +
      "google.cloud.retail.v2\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032#google/cloud/retail/v2/common.proto\032" +
      "&google/cloud/retail/v2/promotion.proto\032" +
      "\036google/protobuf/duration.proto\032 google/" +
      "protobuf/field_mask.proto\032\037google/protob" +
      "uf/timestamp.proto\032\036google/protobuf/wrap" +
      "pers.proto\"\333\r\n\007Product\0221\n\013expire_time\030\020 " +
      "\001(\0132\032.google.protobuf.TimestampH\000\022-\n\003ttl" +
      "\030\021 \001(\0132\031.google.protobuf.DurationB\003\340A\004H\000" +
      "\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\017\n\002id\030\002 \001(\tB\003\340A\005\0227\n\004" +
      "type\030\003 \001(\0162$.google.cloud.retail.v2.Prod" +
      "uct.TypeB\003\340A\005\022\032\n\022primary_product_id\030\004 \001(" +
      "\t\022\035\n\025collection_member_ids\030\005 \003(\t\022\014\n\004gtin" +
      "\030\006 \001(\t\022\022\n\ncategories\030\007 \003(\t\022\022\n\005title\030\010 \001(" +
      "\tB\003\340A\002\022\016\n\006brands\030\t \003(\t\022\023\n\013description\030\n " +
      "\001(\t\022\025\n\rlanguage_code\030\013 \001(\t\022C\n\nattributes" +
      "\030\014 \003(\0132/.google.cloud.retail.v2.Product." +
      "AttributesEntry\022\014\n\004tags\030\r \003(\t\0225\n\nprice_i" +
      "nfo\030\016 \001(\0132!.google.cloud.retail.v2.Price" +
      "Info\022.\n\006rating\030\017 \001(\0132\036.google.cloud.reta" +
      "il.v2.Rating\0222\n\016available_time\030\022 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022B\n\014availability" +
      "\030\023 \001(\0162,.google.cloud.retail.v2.Product." +
      "Availability\0227\n\022available_quantity\030\024 \001(\013" +
      "2\033.google.protobuf.Int32Value\022A\n\020fulfill" +
      "ment_info\030\025 \003(\0132\'.google.cloud.retail.v2" +
      ".FulfillmentInfo\022\013\n\003uri\030\026 \001(\t\022-\n\006images\030" +
      "\027 \003(\0132\035.google.cloud.retail.v2.Image\0222\n\010" +
      "audience\030\030 \001(\0132 .google.cloud.retail.v2." +
      "Audience\0225\n\ncolor_info\030\031 \001(\0132!.google.cl" +
      "oud.retail.v2.ColorInfo\022\r\n\005sizes\030\032 \003(\t\022\021" +
      "\n\tmaterials\030\033 \003(\t\022\020\n\010patterns\030\034 \003(\t\022\022\n\nc" +
      "onditions\030\035 \003(\t\0225\n\npromotions\030\" \003(\0132!.go" +
      "ogle.cloud.retail.v2.Promotion\0220\n\014publis" +
      "h_time\030! \001(\0132\032.google.protobuf.Timestamp" +
      "\022:\n\022retrievable_fields\030\036 \001(\0132\032.google.pr" +
      "otobuf.FieldMaskB\002\030\001\0226\n\010variants\030\037 \003(\0132\037" +
      ".google.cloud.retail.v2.ProductB\003\340A\003\022F\n\021" +
      "local_inventories\030# \003(\0132&.google.cloud.r" +
      "etail.v2.LocalInventoryB\003\340A\003\032Z\n\017Attribut" +
      "esEntry\022\013\n\003key\030\001 \001(\t\0226\n\005value\030\002 \001(\0132\'.go" +
      "ogle.cloud.retail.v2.CustomAttribute:\0028\001" +
      "\"F\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\013\n\007PRIMAR" +
      "Y\020\001\022\013\n\007VARIANT\020\002\022\016\n\nCOLLECTION\020\003\"i\n\014Avai" +
      "lability\022\034\n\030AVAILABILITY_UNSPECIFIED\020\000\022\014" +
      "\n\010IN_STOCK\020\001\022\020\n\014OUT_OF_STOCK\020\002\022\014\n\010PREORD" +
      "ER\020\003\022\r\n\tBACKORDER\020\004:\204\001\352A\200\001\n\035retail.googl" +
      "eapis.com/Product\022_projects/{project}/lo" +
      "cations/{location}/catalogs/{catalog}/br" +
      "anches/{branch}/products/{product}B\014\n\nex" +
      "pirationB\260\002\n\032com.google.cloud.retail.v2B" +
      "\014ProductProtoP\001Z<google.golang.org/genpr" +
      "oto/googleapis/cloud/retail/v2;retail\242\002\006" +
      "RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Google" +
      "\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail" +
      "::V2\352Al\n\034retail.googleapis.com/Branch\022Lp" +
      "rojects/{project}/locations/{location}/c" +
      "atalogs/{catalog}/branches/{branch}b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.retail.v2.CommonProto.getDescriptor(),
          com.google.cloud.retail.v2.PromotionProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_google_cloud_retail_v2_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Product_descriptor,
        new java.lang.String[] { "ExpireTime", "Ttl", "Name", "Id", "Type", "PrimaryProductId", "CollectionMemberIds", "Gtin", "Categories", "Title", "Brands", "Description", "LanguageCode", "Attributes", "Tags", "PriceInfo", "Rating", "AvailableTime", "Availability", "AvailableQuantity", "FulfillmentInfo", "Uri", "Images", "Audience", "ColorInfo", "Sizes", "Materials", "Patterns", "Conditions", "Promotions", "PublishTime", "RetrievableFields", "Variants", "LocalInventories", "Expiration", });
    internal_static_google_cloud_retail_v2_Product_AttributesEntry_descriptor =
      internal_static_google_cloud_retail_v2_Product_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_Product_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_retail_v2_Product_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.PromotionProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
