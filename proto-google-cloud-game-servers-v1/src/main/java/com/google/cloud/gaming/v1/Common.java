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
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

public final class Common {
  private Common() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_OperationMetadata_OperationStatusEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_OperationMetadata_OperationStatusEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_OperationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_OperationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_LabelSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_LabelSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_LabelSelector_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_LabelSelector_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_RealmSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_RealmSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_SpecSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_SpecSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_TargetDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_TargetDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleetAutoscaler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleetAutoscaler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_TargetState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_TargetState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_DeployedFleetStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_DeployedFleetStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleetAutoscaler_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleetAutoscaler_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "#google/cloud/gaming/v1/common.proto\022\026google.cloud.gaming.v1\032\037google/api/field_behavior.proto\032\036google/protobuf/duration.proto\032\037google/protobuf/timestamp.proto\032\034google/api/annotations.proto\"\332\003\n"
          + "\021OperationMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\007 \001(\tB\003\340A\003\022\030\n"
          + "\013unreachable\030\010 \003(\tB\003\340A\003\022]\n"
          + "\020operation_status\030\t"
          + " \003(\0132>.google.cloud.gaming.v1.OperationMetadata.OperationStatusEntryB\003\340A\003\032_\n"
          + "\024OperationStatusEntry\022\013\n"
          + "\003key\030\001 \001(\t\0226\n"
          + "\005value\030\002"
          + " \001(\0132\'.google.cloud.gaming.v1.OperationStatus:\0028\001\"\356\001\n"
          + "\017OperationStatus\022\021\n"
          + "\004done\030\001 \001(\010B\003\340A\003\022E\n\n"
          + "error_code\030\002"
          + " \001(\01621.google.cloud.gaming.v1.OperationStatus.ErrorCode\022\025\n\r"
          + "error_message\030\003 \001(\t\"j\n"
          + "\tErrorCode\022\032\n"
          + "\026ERROR_CODE_UNSPECIFIED\020\000\022\022\n"
          + "\016INTERNAL_ERROR\020\001\022\025\n"
          + "\021PERMISSION_DENIED\020\002\022\026\n"
          + "\022CLUSTER_CONNECTION\020\003\"\201\001\n\r"
          + "LabelSelector\022A\n"
          + "\006labels\030\001 \003(\01321.google.cloud.gaming.v1.LabelSelector.LabelsEntry\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"\037\n\r"
          + "RealmSelector\022\016\n"
          + "\006realms\030\001 \003(\t\"\261\001\n"
          + "\010Schedule\022.\n\n"
          + "start_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timestamp\0224\n"
          + "\021cron_job_duration\030\003 \001(\0132\031.google.protobuf.Duration\022\021\n"
          + "\tcron_spec\030\004 \001(\t\";\n\n"
          + "SpecSource\022\037\n"
          + "\027game_server_config_name\030\001 \001(\t\022\014\n"
          + "\004name\030\002 \001(\t\"\255\004\n\r"
          + "TargetDetails\022 \n"
          + "\030game_server_cluster_name\030\001 \001(\t\022#\n"
          + "\033game_server_deployment_name\030\002 \001(\t\022O\n\r"
          + "fleet_details\030\003"
          + " \003(\01328.google.cloud.gaming.v1.TargetDetails.TargetFleetDetails\032\203\003\n"
          + "\022TargetFleetDetails\022S\n"
          + "\005fleet\030\001"
          + " \001(\0132D.google.cloud.gaming.v1.TargetDetails.TargetFleetDetails.TargetFleet\022b\n\n"
          + "autoscaler\030\002"
          + " \001(\0132N.google.cloud.gaming.v1.TargetDetails.TargetFleetDetails.TargetFleetAutoscaler\032T\n"
          + "\013TargetFleet\022\014\n"
          + "\004name\030\001 \001(\t\0227\n"
          + "\013spec_source\030\002 \001(\0132\".google.cloud.gaming.v1.SpecSource\032^\n"
          + "\025TargetFleetAutoscaler\022\014\n"
          + "\004name\030\001 \001(\t\0227\n"
          + "\013spec_source\030\002 \001(\0132\".google.cloud.gaming.v1.SpecSource\"E\n"
          + "\013TargetState\0226\n"
          + "\007details\030\001 \003(\0132%.google.cloud.gaming.v1.TargetDetails\"\233\005\n"
          + "\024DeployedFleetDetails\022R\n"
          + "\016deployed_fleet\030\001"
          + " \001(\0132:.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleet\022a\n"
          + "\023deployed_autoscaler\030\002"
          + " \001(\0132D.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleetAutoscaler\032\303\002\n\r"
          + "DeployedFleet\022\r\n"
          + "\005fleet\030\001 \001(\t\022\022\n\n"
          + "fleet_spec\030\002 \001(\t\0227\n"
          + "\013spec_source\030\003 \001(\0132\".google.cloud.gaming.v1.SpecSource\022^\n"
          + "\006status\030\005"
          + " \001(\0132N.google.cloud.gaming.v1.DeployedFleetDetails.DeployedFleet.DeployedFleetStatus\032v\n"
          + "\023DeployedFleetStatus\022\026\n"
          + "\016ready_replicas\030\001 \001(\003\022\032\n"
          + "\022allocated_replicas\030\002 \001(\003\022\031\n"
          + "\021reserved_replicas\030\003 \001(\003\022\020\n"
          + "\010replicas\030\004 \001(\003\032\205\001\n"
          + "\027DeployedFleetAutoscaler\022\022\n\n"
          + "autoscaler\030\001 \001(\t\0227\n"
          + "\013spec_source\030\004 \001(\0132\".google.cloud.gaming.v1.SpecSource\022\035\n"
          + "\025fleet_autoscaler_spec\030\003 \001(\tB\\\n"
          + "\032com.google.cloud.gaming.v1P\001Z<google.golang.org/genproto/googl"
          + "eapis/cloud/gaming/v1;gamingb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
              "Unreachable",
              "OperationStatus",
            });
    internal_static_google_cloud_gaming_v1_OperationMetadata_OperationStatusEntry_descriptor =
        internal_static_google_cloud_gaming_v1_OperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_OperationMetadata_OperationStatusEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_OperationMetadata_OperationStatusEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gaming_v1_OperationStatus_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1_OperationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_OperationStatus_descriptor,
            new java.lang.String[] {
              "Done", "ErrorCode", "ErrorMessage",
            });
    internal_static_google_cloud_gaming_v1_LabelSelector_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1_LabelSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_LabelSelector_descriptor,
            new java.lang.String[] {
              "Labels",
            });
    internal_static_google_cloud_gaming_v1_LabelSelector_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1_LabelSelector_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_LabelSelector_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_LabelSelector_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gaming_v1_RealmSelector_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1_RealmSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_RealmSelector_descriptor,
            new java.lang.String[] {
              "Realms",
            });
    internal_static_google_cloud_gaming_v1_Schedule_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_Schedule_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "CronJobDuration", "CronSpec",
            });
    internal_static_google_cloud_gaming_v1_SpecSource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1_SpecSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_SpecSource_descriptor,
            new java.lang.String[] {
              "GameServerConfigName", "Name",
            });
    internal_static_google_cloud_gaming_v1_TargetDetails_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1_TargetDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_TargetDetails_descriptor,
            new java.lang.String[] {
              "GameServerClusterName", "GameServerDeploymentName", "FleetDetails",
            });
    internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_descriptor =
        internal_static_google_cloud_gaming_v1_TargetDetails_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_descriptor,
            new java.lang.String[] {
              "Fleet", "Autoscaler",
            });
    internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleet_descriptor =
        internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleet_descriptor,
            new java.lang.String[] {
              "Name", "SpecSource",
            });
    internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleetAutoscaler_descriptor =
        internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleetAutoscaler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_TargetDetails_TargetFleetDetails_TargetFleetAutoscaler_descriptor,
            new java.lang.String[] {
              "Name", "SpecSource",
            });
    internal_static_google_cloud_gaming_v1_TargetState_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1_TargetState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_TargetState_descriptor,
            new java.lang.String[] {
              "Details",
            });
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeployedFleetDetails_descriptor,
            new java.lang.String[] {
              "DeployedFleet", "DeployedAutoscaler",
            });
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_descriptor =
        internal_static_google_cloud_gaming_v1_DeployedFleetDetails_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_descriptor,
            new java.lang.String[] {
              "Fleet", "FleetSpec", "SpecSource", "Status",
            });
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_DeployedFleetStatus_descriptor =
        internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_DeployedFleetStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleet_DeployedFleetStatus_descriptor,
            new java.lang.String[] {
              "ReadyReplicas", "AllocatedReplicas", "ReservedReplicas", "Replicas",
            });
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleetAutoscaler_descriptor =
        internal_static_google_cloud_gaming_v1_DeployedFleetDetails_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleetAutoscaler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeployedFleetDetails_DeployedFleetAutoscaler_descriptor,
            new java.lang.String[] {
              "Autoscaler", "SpecSource", "FleetAutoscalerSpec",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
