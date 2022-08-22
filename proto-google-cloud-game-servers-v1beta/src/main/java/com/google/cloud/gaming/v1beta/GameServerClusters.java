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
// source: google/cloud/gaming/v1beta/game_server_clusters.proto

package com.google.cloud.gaming.v1beta;

public final class GameServerClusters {
  private GameServerClusters() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_ListGameServerClustersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_ListGameServerClustersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_ListGameServerClustersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_ListGameServerClustersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GetGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GetGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_DeleteGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_DeleteGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_UpdateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_UpdateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GameServerClusterConnectionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GameServerClusterConnectionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GkeClusterReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GkeClusterReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GameServerCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GameServerCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GameServerCluster_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GameServerCluster_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/gaming/v1beta/game_server"
          + "_clusters.proto\022\032google.cloud.gaming.v1b"
          + "eta\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032\'google/cloud/ga"
          + "ming/v1beta/common.proto\032 google/protobu"
          + "f/field_mask.proto\032\037google/protobuf/time"
          + "stamp.proto\"\303\001\n\035ListGameServerClustersRe"
          + "quest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-gameservi"
          + "ces.googleapis.com/GameServerCluster\022\026\n\t"
          + "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t"
          + "B\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005"
          + " \001(\tB\003\340A\001\"\233\001\n\036ListGameServerClustersResp"
          + "onse\022K\n\024game_server_clusters\030\001 \003(\0132-.goo"
          + "gle.cloud.gaming.v1beta.GameServerCluste"
          + "r\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachabl"
          + "e\030\004 \003(\t\"b\n\033GetGameServerClusterRequest\022C"
          + "\n\004name\030\001 \001(\tB5\340A\002\372A/\n-gameservices.googl"
          + "eapis.com/GameServerCluster\"\335\001\n\036CreateGa"
          + "meServerClusterRequest\022E\n\006parent\030\001 \001(\tB5"
          + "\340A\002\372A/\022-gameservices.googleapis.com/Game"
          + "ServerCluster\022#\n\026game_server_cluster_id\030"
          + "\002 \001(\tB\003\340A\002\022O\n\023game_server_cluster\030\003 \001(\0132"
          + "-.google.cloud.gaming.v1beta.GameServerC"
          + "lusterB\003\340A\002\"\233\002\n%PreviewCreateGameServerC"
          + "lusterRequest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-g"
          + "ameservices.googleapis.com/GameServerClu"
          + "ster\022#\n\026game_server_cluster_id\030\002 \001(\tB\003\340A"
          + "\002\022O\n\023game_server_cluster\030\003 \001(\0132-.google."
          + "cloud.gaming.v1beta.GameServerClusterB\003\340"
          + "A\002\0225\n\014preview_time\030\004 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\001\"u\n&PreviewCreateGameSe"
          + "rverClusterResponse\022\014\n\004etag\030\002 \001(\t\022=\n\014tar"
          + "get_state\030\003 \001(\0132\'.google.cloud.gaming.v1"
          + "beta.TargetState\"e\n\036DeleteGameServerClus"
          + "terRequest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-gamese"
          + "rvices.googleapis.com/GameServerCluster\""
          + "\243\001\n%PreviewDeleteGameServerClusterReques"
          + "t\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-gameservices.go"
          + "ogleapis.com/GameServerCluster\0225\n\014previe"
          + "w_time\030\002 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\001\"u\n&PreviewDeleteGameServerClusterR"
          + "esponse\022\014\n\004etag\030\002 \001(\t\022=\n\014target_state\030\003 "
          + "\001(\0132\'.google.cloud.gaming.v1beta.TargetS"
          + "tate\"\247\001\n\036UpdateGameServerClusterRequest\022"
          + "O\n\023game_server_cluster\030\001 \001(\0132-.google.cl"
          + "oud.gaming.v1beta.GameServerClusterB\003\340A\002"
          + "\0224\n\013update_mask\030\002 \001(\0132\032.google.protobuf."
          + "FieldMaskB\003\340A\002\"\345\001\n%PreviewUpdateGameServ"
          + "erClusterRequest\022O\n\023game_server_cluster\030"
          + "\001 \001(\0132-.google.cloud.gaming.v1beta.GameS"
          + "erverClusterB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032"
          + ".google.protobuf.FieldMaskB\003\340A\002\0225\n\014previ"
          + "ew_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\001\"u\n&PreviewUpdateGameServerCluster"
          + "Response\022\014\n\004etag\030\002 \001(\t\022=\n\014target_state\030\003"
          + " \001(\0132\'.google.cloud.gaming.v1beta.Target"
          + "State\"\233\001\n\037GameServerClusterConnectionInf"
          + "o\022P\n\025gke_cluster_reference\030\007 \001(\0132/.googl"
          + "e.cloud.gaming.v1beta.GkeClusterReferenc"
          + "eH\000\022\021\n\tnamespace\030\005 \001(\tB\023\n\021cluster_refere"
          + "nce\"&\n\023GkeClusterReference\022\017\n\007cluster\030\001 "
          + "\001(\t\"\220\004\n\021GameServerCluster\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\002\0224\n\013create_time\030\002 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022I\n\006labe"
          + "ls\030\004 \003(\01329.google.cloud.gaming.v1beta.Ga"
          + "meServerCluster.LabelsEntry\022T\n\017connectio"
          + "n_info\030\005 \001(\0132;.google.cloud.gaming.v1bet"
          + "a.GameServerClusterConnectionInfo\022\014\n\004eta"
          + "g\030\006 \001(\t\022\023\n\013description\030\007 \001(\t\032-\n\013LabelsEn"
          + "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\210\001\352A"
          + "\204\001\n-gameservices.googleapis.com/GameServ"
          + "erCluster\022Sprojects/{project}/locations/"
          + "{location}/realms/{realm}/gameServerClus"
          + "ters/{cluster}B\201\001\n\036com.google.cloud.gami"
          + "ng.v1betaP\001Z@google.golang.org/genproto/"
          + "googleapis/cloud/gaming/v1beta;gaming\312\002\032"
          + "Google\\Cloud\\Gaming\\V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gaming.v1beta.Common.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1beta_ListGameServerClustersRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1beta_ListGameServerClustersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_ListGameServerClustersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gaming_v1beta_ListGameServerClustersResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1beta_ListGameServerClustersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_ListGameServerClustersResponse_descriptor,
            new java.lang.String[] {
              "GameServerClusters", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gaming_v1beta_GetGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1beta_GetGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GetGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GameServerClusterId", "GameServerCluster",
            });
    internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GameServerClusterId", "GameServerCluster", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_PreviewCreateGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1beta_DeleteGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1beta_DeleteGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_DeleteGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_PreviewDeleteGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1beta_UpdateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gaming_v1beta_UpdateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_UpdateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "GameServerCluster", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "GameServerCluster", "UpdateMask", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_PreviewUpdateGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1beta_GameServerClusterConnectionInfo_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gaming_v1beta_GameServerClusterConnectionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GameServerClusterConnectionInfo_descriptor,
            new java.lang.String[] {
              "GkeClusterReference", "Namespace", "ClusterReference",
            });
    internal_static_google_cloud_gaming_v1beta_GkeClusterReference_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gaming_v1beta_GkeClusterReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GkeClusterReference_descriptor,
            new java.lang.String[] {
              "Cluster",
            });
    internal_static_google_cloud_gaming_v1beta_GameServerCluster_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gaming_v1beta_GameServerCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GameServerCluster_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "Labels", "ConnectionInfo", "Etag", "Description",
            });
    internal_static_google_cloud_gaming_v1beta_GameServerCluster_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1beta_GameServerCluster_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1beta_GameServerCluster_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GameServerCluster_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.gaming.v1beta.Common.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
