// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_configs_service.proto

package com.google.cloud.gaming.v1;

public final class GameServerConfigsServiceOuterClass {
  private GameServerConfigsServiceOuterClass() {}
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
      "\n8google/cloud/gaming/v1/game_server_con" +
      "figs_service.proto\022\026google.cloud.gaming." +
      "v1\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\0320google/cloud/gaming/v" +
      "1/game_server_configs.proto\032#google/long" +
      "running/operations.proto2\233\010\n\030GameServerC" +
      "onfigsService\022\332\001\n\025ListGameServerConfigs\022" +
      "4.google.cloud.gaming.v1.ListGameServerC" +
      "onfigsRequest\0325.google.cloud.gaming.v1.L" +
      "istGameServerConfigsResponse\"T\202\323\344\223\002E\022C/v" +
      "1/{parent=projects/*/locations/*/gameSer" +
      "verDeployments/*}/configs\332A\006parent\022\307\001\n\023G" +
      "etGameServerConfig\0222.google.cloud.gaming" +
      ".v1.GetGameServerConfigRequest\032(.google." +
      "cloud.gaming.v1.GameServerConfig\"R\202\323\344\223\002E" +
      "\022C/v1/{name=projects/*/locations/*/gameS" +
      "erverDeployments/*/configs/*}\332A\004name\022\224\002\n" +
      "\026CreateGameServerConfig\0225.google.cloud.g" +
      "aming.v1.CreateGameServerConfigRequest\032\035" +
      ".google.longrunning.Operation\"\243\001\202\323\344\223\002Y\"C" +
      "/v1/{parent=projects/*/locations/*/gameS" +
      "erverDeployments/*}/configs:\022game_server" +
      "_config\332A\031parent,game_server_config\312A%\n\020" +
      "GameServerConfig\022\021OperationMetadata\022\357\001\n\026" +
      "DeleteGameServerConfig\0225.google.cloud.ga" +
      "ming.v1.DeleteGameServerConfigRequest\032\035." +
      "google.longrunning.Operation\"\177\202\323\344\223\002E*C/v" +
      "1/{name=projects/*/locations/*/gameServe" +
      "rDeployments/*/configs/*}\332A\004name\312A*\n\025goo" +
      "gle.protobuf.Empty\022\021OperationMetadata\032O\312" +
      "A\033gameservices.googleapis.com\322A.https://" +
      "www.googleapis.com/auth/cloud-platformB\\" +
      "\n\032com.google.cloud.gaming.v1P\001Z<google.g" +
      "olang.org/genproto/googleapis/cloud/gami" +
      "ng/v1;gamingb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.cloud.gaming.v1.GameServerConfigs.getDescriptor(),
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
    com.google.cloud.gaming.v1.GameServerConfigs.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
