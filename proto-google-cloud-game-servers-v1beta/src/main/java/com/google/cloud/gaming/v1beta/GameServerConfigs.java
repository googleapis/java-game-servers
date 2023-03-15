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
// source: google/cloud/gaming/v1beta/game_server_configs.proto

package com.google.cloud.gaming.v1beta;

public final class GameServerConfigs {
  private GameServerConfigs() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GetGameServerConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GetGameServerConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_DeleteGameServerConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_DeleteGameServerConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_ScalingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_ScalingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_FleetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_FleetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GameServerConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GameServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1beta_GameServerConfig_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1beta_GameServerConfig_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/gaming/v1beta/game_server"
          + "_configs.proto\022\032google.cloud.gaming.v1be"
          + "ta\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\032\'google/cloud/gam"
          + "ing/v1beta/common.proto\032\037google/protobuf"
          + "/timestamp.proto\"\301\001\n\034ListGameServerConfi"
          + "gsRequest\022D\n\006parent\030\001 \001(\tB4\340A\002\372A.\022,games"
          + "ervices.googleapis.com/GameServerConfig\022"
          + "\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 "
          + "\001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_b"
          + "y\030\005 \001(\tB\003\340A\001\"\230\001\n\035ListGameServerConfigsRe"
          + "sponse\022I\n\023game_server_configs\030\001 \003(\0132,.go"
          + "ogle.cloud.gaming.v1beta.GameServerConfi"
          + "g\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachabl"
          + "e\030\004 \003(\t\"`\n\032GetGameServerConfigRequest\022B\n"
          + "\004name\030\001 \001(\tB4\340A\002\372A.\n,gameservices.google"
          + "apis.com/GameServerConfig\"\314\001\n\035CreateGame"
          + "ServerConfigRequest\022D\n\006parent\030\001 \001(\tB4\340A\002"
          + "\372A.\022,gameservices.googleapis.com/GameSer"
          + "verConfig\022\026\n\tconfig_id\030\002 \001(\tB\003\340A\002\022M\n\022gam"
          + "e_server_config\030\003 \001(\0132,.google.cloud.gam"
          + "ing.v1beta.GameServerConfigB\003\340A\002\"c\n\035Dele"
          + "teGameServerConfigRequest\022B\n\004name\030\001 \001(\tB"
          + "4\340A\002\372A.\n,gameservices.googleapis.com/Gam"
          + "eServerConfig\"\275\001\n\rScalingConfig\022\021\n\004name\030"
          + "\001 \001(\tB\003\340A\002\022\"\n\025fleet_autoscaler_spec\030\002 \001("
          + "\tB\003\340A\002\022<\n\tselectors\030\004 \003(\0132).google.cloud"
          + ".gaming.v1beta.LabelSelector\0227\n\tschedule"
          + "s\030\005 \003(\0132$.google.cloud.gaming.v1beta.Sch"
          + "edule\"/\n\013FleetConfig\022\022\n\nfleet_spec\030\001 \001(\t"
          + "\022\014\n\004name\030\002 \001(\t\"\260\004\n\020GameServerConfig\022\014\n\004n"
          + "ame\030\001 \001(\t\0224\n\013create_time\030\002 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\0224\n\013update_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022H\n"
          + "\006labels\030\004 \003(\01328.google.cloud.gaming.v1be"
          + "ta.GameServerConfig.LabelsEntry\022>\n\rfleet"
          + "_configs\030\005 \003(\0132\'.google.cloud.gaming.v1b"
          + "eta.FleetConfig\022B\n\017scaling_configs\030\006 \003(\013"
          + "2).google.cloud.gaming.v1beta.ScalingCon"
          + "fig\022\023\n\013description\030\007 \001(\t\032-\n\013LabelsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\217\001\352A\213\001\n,"
          + "gameservices.googleapis.com/GameServerCo"
          + "nfig\022[projects/{project}/locations/{loca"
          + "tion}/gameServerDeployments/{deployment}"
          + "/configs/{config}Bw\n\036com.google.cloud.ga"
          + "ming.v1betaP\001Z6cloud.google.com/go/gamin"
          + "g/apiv1beta/gamingpb;gamingpb\312\002\032Google\\C"
          + "loud\\Gaming\\V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gaming.v1beta.Common.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_ListGameServerConfigsResponse_descriptor,
            new java.lang.String[] {
              "GameServerConfigs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gaming_v1beta_GetGameServerConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1beta_GetGameServerConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GetGameServerConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_CreateGameServerConfigRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ConfigId", "GameServerConfig",
            });
    internal_static_google_cloud_gaming_v1beta_DeleteGameServerConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1beta_DeleteGameServerConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_DeleteGameServerConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1beta_ScalingConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1beta_ScalingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_ScalingConfig_descriptor,
            new java.lang.String[] {
              "Name", "FleetAutoscalerSpec", "Selectors", "Schedules",
            });
    internal_static_google_cloud_gaming_v1beta_FleetConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1beta_FleetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_FleetConfig_descriptor,
            new java.lang.String[] {
              "FleetSpec", "Name",
            });
    internal_static_google_cloud_gaming_v1beta_GameServerConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1beta_GameServerConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GameServerConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "FleetConfigs",
              "ScalingConfigs",
              "Description",
            });
    internal_static_google_cloud_gaming_v1beta_GameServerConfig_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1beta_GameServerConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1beta_GameServerConfig_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1beta_GameServerConfig_LabelsEntry_descriptor,
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
