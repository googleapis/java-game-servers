/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

public final class GameServerDeployments {
  private GameServerDeployments() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_GetGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_GetGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_CreateGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_CreateGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_DeleteGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_DeleteGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_SetRolloutTargetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_SetRolloutTargetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_CommitRolloutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_CommitRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_RevertRolloutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_RevertRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_GetDeploymentTargetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_GetDeploymentTargetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_ClusterPercentageSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_ClusterPercentageSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_GameServerTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_GameServerTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_ClusterRolloutTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_ClusterRolloutTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/gaming/v1alpha/game_serve"
          + "r_deployments.proto\022\033google.cloud.gaming"
          + ".v1alpha\032\034google/api/annotations.proto\032("
          + "google/cloud/gaming/v1alpha/common.proto"
          + "\032#google/longrunning/operations.proto\032 g"
          + "oogle/protobuf/field_mask.proto\032\037google/"
          + "protobuf/timestamp.proto\032\027google/api/cli"
          + "ent.proto\"{\n ListGameServerDeploymentsRe"
          + "quest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005"
          + "\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010"
          + "order_by\030\005 \001(\t\"\220\001\n!ListGameServerDeploym"
          + "entsResponse\022R\n\027game_server_deployments\030"
          + "\001 \003(\01321.google.cloud.gaming.v1alpha.Game"
          + "ServerDeployment\022\027\n\017next_page_token\030\002 \001("
          + "\t\".\n\036GetGameServerDeploymentRequest\022\014\n\004n"
          + "ame\030\001 \001(\t\"\235\001\n!CreateGameServerDeployment"
          + "Request\022\016\n\006parent\030\001 \001(\t\022\025\n\rdeployment_id"
          + "\030\002 \001(\t\022Q\n\026game_server_deployment\030\003 \001(\01321"
          + ".google.cloud.gaming.v1alpha.GameServerD"
          + "eployment\"1\n!DeleteGameServerDeploymentR"
          + "equest\022\014\n\004name\030\001 \001(\t\"\247\001\n!UpdateGameServe"
          + "rDeploymentRequest\022Q\n\026game_server_deploy"
          + "ment\030\001 \001(\01321.google.cloud.gaming.v1alpha"
          + ".GameServerDeployment\022/\n\013update_mask\030\002 \001"
          + "(\0132\032.google.protobuf.FieldMask\"v\n\023StartR"
          + "olloutRequest\022\014\n\004name\030\001 \001(\t\022Q\n\030new_game_"
          + "server_template\030\002 \001(\0132/.google.cloud.gam"
          + "ing.v1alpha.GameServerTemplate\"\204\001\n\027SetRo"
          + "lloutTargetRequest\022\014\n\004name\030\001 \001(\t\022[\n\033clus"
          + "ter_percentage_selector\030\002 \003(\01326.google.c"
          + "loud.gaming.v1alpha.ClusterPercentageSel"
          + "ector\"$\n\024CommitRolloutRequest\022\014\n\004name\030\001 "
          + "\001(\t\"$\n\024RevertRolloutRequest\022\014\n\004name\030\001 \001("
          + "\t\"*\n\032GetDeploymentTargetRequest\022\014\n\004name\030"
          + "\001 \001(\t\"r\n\031ClusterPercentageSelector\022D\n\020cl"
          + "uster_selector\030\001 \001(\0132*.google.cloud.gami"
          + "ng.v1alpha.LabelSelector\022\017\n\007percent\030\002 \001("
          + "\005\"\252\001\n\022GameServerTemplate\022\023\n\013description\030"
          + "\001 \001(\t\022\014\n\004spec\030\002 \001(\t\022\\\n\034cluster_percentag"
          + "e_selectors\030\003 \003(\01326.google.cloud.gaming."
          + "v1alpha.ClusterPercentageSelector\022\023\n\013tem"
          + "plate_id\030\004 \001(\t\"\315\001\n\020DeploymentTarget\022T\n\010c"
          + "lusters\030\001 \003(\0132B.google.cloud.gaming.v1al"
          + "pha.DeploymentTarget.ClusterRolloutTarge"
          + "t\032c\n\024ClusterRolloutTarget\022\r\n\005realm\030\001 \001(\t"
          + "\022\017\n\007cluster\030\002 \001(\t\022\026\n\016stable_percent\030\003 \001("
          + "\005\022\023\n\013new_percent\030\004 \001(\005\"\255\003\n\024GameServerDep"
          + "loyment\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001"
          + "(\0132\032.google.protobuf.Timestamp\022/\n\013update"
          + "_time\030\003 \001(\0132\032.google.protobuf.Timestamp\022"
          + "M\n\006labels\030\004 \003(\0132=.google.cloud.gaming.v1"
          + "alpha.GameServerDeployment.LabelsEntry\022T"
          + "\n\033stable_game_server_template\030\005 \001(\0132/.go"
          + "ogle.cloud.gaming.v1alpha.GameServerTemp"
          + "late\022Q\n\030new_game_server_template\030\006 \001(\0132/"
          + ".google.cloud.gaming.v1alpha.GameServerT"
          + "emplate\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\0012\346\020\n\034GameServerDeployments"
          + "Service\022\342\001\n\031ListGameServerDeployments\022=."
          + "google.cloud.gaming.v1alpha.ListGameServ"
          + "erDeploymentsRequest\032>.google.cloud.gami"
          + "ng.v1alpha.ListGameServerDeploymentsResp"
          + "onse\"F\202\323\344\223\002@\022>/v1alpha/{parent=projects/"
          + "*/locations/*}/gameServerDeployments\022\321\001\n"
          + "\027GetGameServerDeployment\022;.google.cloud."
          + "gaming.v1alpha.GetGameServerDeploymentRe"
          + "quest\0321.google.cloud.gaming.v1alpha.Game"
          + "ServerDeployment\"F\202\323\344\223\002@\022>/v1alpha/{name"
          + "=projects/*/locations/*/gameServerDeploy"
          + "ments/*}\022\333\001\n\032CreateGameServerDeployment\022"
          + ">.google.cloud.gaming.v1alpha.CreateGame"
          + "ServerDeploymentRequest\032\035.google.longrun"
          + "ning.Operation\"^\202\323\344\223\002X\">/v1alpha/{parent"
          + "=projects/*/locations/*}/gameServerDeplo"
          + "yments:\026game_server_deployment\022\303\001\n\032Delet"
          + "eGameServerDeployment\022>.google.cloud.gam"
          + "ing.v1alpha.DeleteGameServerDeploymentRe"
          + "quest\032\035.google.longrunning.Operation\"F\202\323"
          + "\344\223\002@*>/v1alpha/{name=projects/*/location"
          + "s/*/gameServerDeployments/*}\022\362\001\n\032UpdateG"
          + "ameServerDeployment\022>.google.cloud.gamin"
          + "g.v1alpha.UpdateGameServerDeploymentRequ"
          + "est\032\035.google.longrunning.Operation\"u\202\323\344\223"
          + "\002o2U/v1alpha/{game_server_deployment.nam"
          + "e=projects/*/locations/*/gameServerDeplo"
          + "yments/*}:\026game_server_deployment\022\267\001\n\014St"
          + "artRollout\0220.google.cloud.gaming.v1alpha"
          + ".StartRolloutRequest\032\035.google.longrunnin"
          + "g.Operation\"V\202\323\344\223\002P\"K/v1alpha/{name=proj"
          + "ects/*/locations/*/gameServerDeployments"
          + "/*}:startRollout:\001*\022\303\001\n\020SetRolloutTarget"
          + "\0224.google.cloud.gaming.v1alpha.SetRollou"
          + "tTargetRequest\032\035.google.longrunning.Oper"
          + "ation\"Z\202\323\344\223\002T\"O/v1alpha/{name=projects/*"
          + "/locations/*/gameServerDeployments/*}:se"
          + "tRolloutTarget:\001*\022\272\001\n\rCommitRollout\0221.go"
          + "ogle.cloud.gaming.v1alpha.CommitRolloutR"
          + "equest\032\035.google.longrunning.Operation\"W\202"
          + "\323\344\223\002Q\"L/v1alpha/{name=projects/*/locatio"
          + "ns/*/gameServerDeployments/*}:commitRoll"
          + "out:\001*\022\272\001\n\rRevertRollout\0221.google.cloud."
          + "gaming.v1alpha.RevertRolloutRequest\032\035.go"
          + "ogle.longrunning.Operation\"W\202\323\344\223\002Q\"L/v1a"
          + "lpha/{name=projects/*/locations/*/gameSe"
          + "rverDeployments/*}:revertRollout:\001*\022\331\001\n\023"
          + "GetDeploymentTarget\0227.google.cloud.gamin"
          + "g.v1alpha.GetDeploymentTargetRequest\032-.g"
          + "oogle.cloud.gaming.v1alpha.DeploymentTar"
          + "get\"Z\202\323\344\223\002T\022R/v1alpha/{name=projects/*/l"
          + "ocations/*/gameServerDeployments/*}:getD"
          + "eploymentTarget\032\036\312A\033gameservices.googlea"
          + "pis.comBf\n\037com.google.cloud.gaming.v1alp"
          + "haP\001ZAgoogle.golang.org/genproto/googlea"
          + "pis/cloud/gaming/v1alpha;gamingb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.gaming.v1alpha.Common.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_ListGameServerDeploymentsResponse_descriptor,
            new java.lang.String[] {
              "GameServerDeployments", "NextPageToken",
            });
    internal_static_google_cloud_gaming_v1alpha_GetGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1alpha_GetGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_GetGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1alpha_CreateGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1alpha_CreateGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_CreateGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DeploymentId", "GameServerDeployment",
            });
    internal_static_google_cloud_gaming_v1alpha_DeleteGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1alpha_DeleteGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_DeleteGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "GameServerDeployment", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_descriptor,
            new java.lang.String[] {
              "Name", "NewGameServerTemplate",
            });
    internal_static_google_cloud_gaming_v1alpha_SetRolloutTargetRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1alpha_SetRolloutTargetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_SetRolloutTargetRequest_descriptor,
            new java.lang.String[] {
              "Name", "ClusterPercentageSelector",
            });
    internal_static_google_cloud_gaming_v1alpha_CommitRolloutRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1alpha_CommitRolloutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_CommitRolloutRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1alpha_RevertRolloutRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gaming_v1alpha_RevertRolloutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_RevertRolloutRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1alpha_GetDeploymentTargetRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gaming_v1alpha_GetDeploymentTargetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_GetDeploymentTargetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1alpha_ClusterPercentageSelector_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gaming_v1alpha_ClusterPercentageSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_ClusterPercentageSelector_descriptor,
            new java.lang.String[] {
              "ClusterSelector", "Percent",
            });
    internal_static_google_cloud_gaming_v1alpha_GameServerTemplate_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gaming_v1alpha_GameServerTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_GameServerTemplate_descriptor,
            new java.lang.String[] {
              "Description", "Spec", "ClusterPercentageSelectors", "TemplateId",
            });
    internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_descriptor,
            new java.lang.String[] {
              "Clusters",
            });
    internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_ClusterRolloutTarget_descriptor =
        internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_ClusterRolloutTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_DeploymentTarget_ClusterRolloutTarget_descriptor,
            new java.lang.String[] {
              "Realm", "Cluster", "StablePercent", "NewPercent",
            });
    internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "StableGameServerTemplate",
              "NewGameServerTemplate",
            });
    internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1alpha_GameServerDeployment_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.gaming.v1alpha.Common.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
