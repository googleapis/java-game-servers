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
// source: google/cloud/gaming/v1/game_server_configs.proto

package com.google.cloud.gaming.v1;

public interface GameServerConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.GameServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the game server config. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`.
   * For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the game server config. Uses the form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`.
   * For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels associated with this game server config. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels associated with this game server config. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels associated with this game server config. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels associated with this game server config. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels associated with this game server config. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig
   * is allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.FleetConfig fleet_configs = 5;</code>
   */
  java.util.List<com.google.cloud.gaming.v1.FleetConfig> getFleetConfigsList();
  /**
   *
   *
   * <pre>
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig
   * is allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.FleetConfig fleet_configs = 5;</code>
   */
  com.google.cloud.gaming.v1.FleetConfig getFleetConfigs(int index);
  /**
   *
   *
   * <pre>
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig
   * is allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.FleetConfig fleet_configs = 5;</code>
   */
  int getFleetConfigsCount();
  /**
   *
   *
   * <pre>
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig
   * is allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.FleetConfig fleet_configs = 5;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1.FleetConfigOrBuilder>
      getFleetConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig
   * is allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.FleetConfig fleet_configs = 5;</code>
   */
  com.google.cloud.gaming.v1.FleetConfigOrBuilder getFleetConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The autoscaling settings.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.ScalingConfig scaling_configs = 6;</code>
   */
  java.util.List<com.google.cloud.gaming.v1.ScalingConfig> getScalingConfigsList();
  /**
   *
   *
   * <pre>
   * The autoscaling settings.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.ScalingConfig scaling_configs = 6;</code>
   */
  com.google.cloud.gaming.v1.ScalingConfig getScalingConfigs(int index);
  /**
   *
   *
   * <pre>
   * The autoscaling settings.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.ScalingConfig scaling_configs = 6;</code>
   */
  int getScalingConfigsCount();
  /**
   *
   *
   * <pre>
   * The autoscaling settings.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.ScalingConfig scaling_configs = 6;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1.ScalingConfigOrBuilder>
      getScalingConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The autoscaling settings.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.ScalingConfig scaling_configs = 6;</code>
   */
  com.google.cloud.gaming.v1.ScalingConfigOrBuilder getScalingConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The description of the game server config.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the game server config.
   * </pre>
   *
   * <code>string description = 7;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
