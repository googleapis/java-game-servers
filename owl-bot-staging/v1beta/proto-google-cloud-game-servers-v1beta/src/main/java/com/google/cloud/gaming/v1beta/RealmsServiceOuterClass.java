// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/realms_service.proto

package com.google.cloud.gaming.v1beta;

public final class RealmsServiceOuterClass {
  private RealmsServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/gaming/v1beta/realms_serv" +
      "ice.proto\022\032google.cloud.gaming.v1beta\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\'google/cloud/gaming/v1beta" +
      "/realms.proto\032#google/longrunning/operat" +
      "ions.proto2\367\t\n\rRealmsService\022\254\001\n\nListRea" +
      "lms\022-.google.cloud.gaming.v1beta.ListRea" +
      "lmsRequest\032..google.cloud.gaming.v1beta." +
      "ListRealmsResponse\"?\202\323\344\223\0020\022./v1beta/{par" +
      "ent=projects/*/locations/*}/realms\332A\006par" +
      "ent\022\231\001\n\010GetRealm\022+.google.cloud.gaming.v" +
      "1beta.GetRealmRequest\032!.google.cloud.gam" +
      "ing.v1beta.Realm\"=\202\323\344\223\0020\022./v1beta/{name=" +
      "projects/*/locations/*/realms/*}\332A\004name\022" +
      "\320\001\n\013CreateRealm\022..google.cloud.gaming.v1" +
      "beta.CreateRealmRequest\032\035.google.longrun" +
      "ning.Operation\"r\202\323\344\223\0027\"./v1beta/{parent=" +
      "projects/*/locations/*}/realms:\005realm\332A\025" +
      "parent,realm,realm_id\312A\032\n\005Realm\022\021Operati" +
      "onMetadata\022\310\001\n\013DeleteRealm\022..google.clou" +
      "d.gaming.v1beta.DeleteRealmRequest\032\035.goo" +
      "gle.longrunning.Operation\"j\202\323\344\223\0020*./v1be" +
      "ta/{name=projects/*/locations/*/realms/*" +
      "}\332A\004name\312A*\n\025google.protobuf.Empty\022\021Oper" +
      "ationMetadata\022\322\001\n\013UpdateRealm\022..google.c" +
      "loud.gaming.v1beta.UpdateRealmRequest\032\035." +
      "google.longrunning.Operation\"t\202\323\344\223\002=24/v" +
      "1beta/{realm.name=projects/*/locations/*" +
      "/realms/*}:\005realm\332A\021realm,update_mask\312A\032" +
      "\n\005Realm\022\021OperationMetadata\022\326\001\n\022PreviewRe" +
      "almUpdate\0225.google.cloud.gaming.v1beta.P" +
      "reviewRealmUpdateRequest\0326.google.cloud." +
      "gaming.v1beta.PreviewRealmUpdateResponse" +
      "\"Q\202\323\344\223\002K2B/v1beta/{realm.name=projects/*" +
      "/locations/*/realms/*}:previewUpdate:\005re" +
      "alm\032O\312A\033gameservices.googleapis.com\322A.ht" +
      "tps://www.googleapis.com/auth/cloud-plat" +
      "formBw\n\036com.google.cloud.gaming.v1betaP\001" +
      "Z6cloud.google.com/go/gaming/apiv1beta/g" +
      "amingpb;gamingpb\312\002\032Google\\Cloud\\Gaming\\V" +
      "1betab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.cloud.gaming.v1beta.Realms.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.gaming.v1beta.Realms.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
