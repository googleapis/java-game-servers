/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gaming/v1/game_server_clusters.proto

package com.google.cloud.gaming.v1;

public final class GameServerClusters {
  private GameServerClusters() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GkeClusterReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GkeClusterReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_KubernetesClusterState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_KubernetesClusterState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/gaming/v1/game_server_clu"
          + "sters.proto\022\026google.cloud.gaming.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032#google/cloud/gaming/v1/"
          + "common.proto\032 google/protobuf/field_mask"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\205\002\n\035ListGameServerClustersRequest\022E\n\006par"
          + "ent\030\001 \001(\tB5\340A\002\372A/\022-gameservices.googleap"
          + "is.com/GameServerCluster\022\026\n\tpage_size\030\002 "
          + "\001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006fil"
          + "ter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\022@\n"
          + "\004view\030\006 \001(\0162-.google.cloud.gaming.v1.Gam"
          + "eServerClusterViewB\003\340A\001\"\227\001\n\036ListGameServ"
          + "erClustersResponse\022G\n\024game_server_cluste"
          + "rs\030\001 \003(\0132).google.cloud.gaming.v1.GameSe"
          + "rverCluster\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013"
          + "unreachable\030\004 \003(\t\"\244\001\n\033GetGameServerClust"
          + "erRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-gameser"
          + "vices.googleapis.com/GameServerCluster\022@"
          + "\n\004view\030\006 \001(\0162-.google.cloud.gaming.v1.Ga"
          + "meServerClusterViewB\003\340A\001\"\331\001\n\036CreateGameS"
          + "erverClusterRequest\022E\n\006parent\030\001 \001(\tB5\340A\002"
          + "\372A/\022-gameservices.googleapis.com/GameSer"
          + "verCluster\022#\n\026game_server_cluster_id\030\002 \001"
          + "(\tB\003\340A\002\022K\n\023game_server_cluster\030\003 \001(\0132).g"
          + "oogle.cloud.gaming.v1.GameServerClusterB"
          + "\003\340A\002\"\333\002\n%PreviewCreateGameServerClusterR"
          + "equest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-gameserv"
          + "ices.googleapis.com/GameServerCluster\022#\n"
          + "\026game_server_cluster_id\030\002 \001(\tB\003\340A\002\022K\n\023ga"
          + "me_server_cluster\030\003 \001(\0132).google.cloud.g"
          + "aming.v1.GameServerClusterB\003\340A\002\0225\n\014previ"
          + "ew_time\030\004 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\001\022B\n\004view\030\006 \001(\0162-.google.cloud.gami"
          + "ng.v1.GameServerClusterViewB\005\030\001\340A\001\"\275\001\n&P"
          + "reviewCreateGameServerClusterResponse\022\014\n"
          + "\004etag\030\002 \001(\t\0229\n\014target_state\030\003 \001(\0132#.goog"
          + "le.cloud.gaming.v1.TargetState\022J\n\rcluste"
          + "r_state\030\004 \001(\0132..google.cloud.gaming.v1.K"
          + "ubernetesClusterStateB\003\340A\003\"e\n\036DeleteGame"
          + "ServerClusterRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372"
          + "A/\n-gameservices.googleapis.com/GameServ"
          + "erCluster\"\243\001\n%PreviewDeleteGameServerClu"
          + "sterRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-games"
          + "ervices.googleapis.com/GameServerCluster"
          + "\0225\n\014preview_time\030\002 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\001\"q\n&PreviewDeleteGameServ"
          + "erClusterResponse\022\014\n\004etag\030\002 \001(\t\0229\n\014targe"
          + "t_state\030\003 \001(\0132#.google.cloud.gaming.v1.T"
          + "argetState\"\243\001\n\036UpdateGameServerClusterRe"
          + "quest\022K\n\023game_server_cluster\030\001 \001(\0132).goo"
          + "gle.cloud.gaming.v1.GameServerClusterB\003\340"
          + "A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.protobu"
          + "f.FieldMaskB\003\340A\002\"\341\001\n%PreviewUpdateGameSe"
          + "rverClusterRequest\022K\n\023game_server_cluste"
          + "r\030\001 \001(\0132).google.cloud.gaming.v1.GameSer"
          + "verClusterB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.g"
          + "oogle.protobuf.FieldMaskB\003\340A\002\0225\n\014preview"
          + "_time\030\003 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\001\"q\n&PreviewUpdateGameServerClusterRe"
          + "sponse\022\014\n\004etag\030\002 \001(\t\0229\n\014target_state\030\003 \001"
          + "(\0132#.google.cloud.gaming.v1.TargetState\""
          + "\227\001\n\037GameServerClusterConnectionInfo\022L\n\025g"
          + "ke_cluster_reference\030\007 \001(\0132+.google.clou"
          + "d.gaming.v1.GkeClusterReferenceH\000\022\021\n\tnam"
          + "espace\030\005 \001(\tB\023\n\021cluster_reference\"&\n\023Gke"
          + "ClusterReference\022\017\n\007cluster\030\001 \001(\t\"\324\004\n\021Ga"
          + "meServerCluster\022\021\n\004name\030\001 \001(\tB\003\340A\002\0224\n\013cr"
          + "eate_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022E\n\006labels\030\004 \003(\01325"
          + ".google.cloud.gaming.v1.GameServerCluste"
          + "r.LabelsEntry\022P\n\017connection_info\030\005 \001(\01327"
          + ".google.cloud.gaming.v1.GameServerCluste"
          + "rConnectionInfo\022\014\n\004etag\030\006 \001(\t\022\023\n\013descrip"
          + "tion\030\007 \001(\t\022J\n\rcluster_state\030\013 \001(\0132..goog"
          + "le.cloud.gaming.v1.KubernetesClusterStat"
          + "eB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001:\210\001\352A\204\001\n-gameservices.googl"
          + "eapis.com/GameServerCluster\022Sprojects/{p"
          + "roject}/locations/{location}/realms/{rea"
          + "lm}/gameServerClusters/{cluster}\"\347\004\n\026Kub"
          + "ernetesClusterState\022%\n\030agones_version_in"
          + "stalled\030\001 \001(\tB\003\340A\003\022)\n\034kubernetes_version"
          + "_installed\030\002 \001(\tB\003\340A\003\022a\n\022installation_st"
          + "ate\030\003 \001(\0162@.google.cloud.gaming.v1.Kuber"
          + "netesClusterState.InstallationStateB\003\340A\003"
          + "\022,\n\037version_installed_error_message\030\004 \001("
          + "\tB\003\340A\003\022\025\n\010provider\030\005 \001(\tB\003\340A\003\022$\n\027agones_"
          + "version_targeted\030\006 \001(\tB\003\340A\003\"\254\002\n\021Installa"
          + "tionState\022\"\n\036INSTALLATION_STATE_UNSPECIF"
          + "IED\020\000\022\'\n#AGONES_KUBERNETES_VERSION_SUPPO"
          + "RTED\020\001\022\036\n\032AGONES_VERSION_UNSUPPORTED\020\002\022)"
          + "\n%AGONES_KUBERNETES_VERSION_UNSUPPORTED\020"
          + "\003\022\037\n\033AGONES_VERSION_UNRECOGNIZED\020\004\022#\n\037KU"
          + "BERNETES_VERSION_UNRECOGNIZED\020\005\022\037\n\033VERSI"
          + "ON_VERIFICATION_FAILED\020\006\022\030\n\024AGONES_NOT_I"
          + "NSTALLED\020\007*V\n\025GameServerClusterView\022(\n$G"
          + "AME_SERVER_CLUSTER_VIEW_UNSPECIFIED\020\000\022\t\n"
          + "\005BASIC\020\001\022\010\n\004FULL\020\002BR\n\032com.google.cloud.g"
          + "aming.v1P\001Z2cloud.google.com/go/gaming/a"
          + "piv1/gamingpb;gamingpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gaming.v1.Common.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "View",
            });
    internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_descriptor,
            new java.lang.String[] {
              "GameServerClusters", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GameServerClusterId", "GameServerCluster",
            });
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GameServerClusterId", "GameServerCluster", "PreviewTime", "View",
            });
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState", "ClusterState",
            });
    internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "GameServerCluster", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "GameServerCluster", "UpdateMask", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor,
            new java.lang.String[] {
              "GkeClusterReference", "Namespace", "ClusterReference",
            });
    internal_static_google_cloud_gaming_v1_GkeClusterReference_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gaming_v1_GkeClusterReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GkeClusterReference_descriptor,
            new java.lang.String[] {
              "Cluster",
            });
    internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gaming_v1_GameServerCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "ConnectionInfo",
              "Etag",
              "Description",
              "ClusterState",
            });
    internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gaming_v1_KubernetesClusterState_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_gaming_v1_KubernetesClusterState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_KubernetesClusterState_descriptor,
            new java.lang.String[] {
              "AgonesVersionInstalled",
              "KubernetesVersionInstalled",
              "InstallationState",
              "VersionInstalledErrorMessage",
              "Provider",
              "AgonesVersionTargeted",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gaming.v1.Common.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
