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
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

public interface PreviewGameServerDeploymentRolloutRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The game server deployment rollout to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rollout field is set.
   */
  boolean hasRollout();
  /**
   *
   *
   * <pre>
   * Required. The game server deployment rollout to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rollout.
   */
  com.google.cloud.gaming.v1beta.GameServerDeploymentRollout getRollout();
  /**
   *
   *
   * <pre>
   * Required. The game server deployment rollout to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gaming.v1beta.GameServerDeploymentRolloutOrBuilder getRolloutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The target timestamp to compute the preview. Defaults to the immediately
   * after the proposed rollout completes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the previewTime field is set.
   */
  boolean hasPreviewTime();
  /**
   *
   *
   * <pre>
   * Optional. The target timestamp to compute the preview. Defaults to the immediately
   * after the proposed rollout completes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The previewTime.
   */
  com.google.protobuf.Timestamp getPreviewTime();
  /**
   *
   *
   * <pre>
   * Optional. The target timestamp to compute the preview. Defaults to the immediately
   * after the proposed rollout completes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getPreviewTimeOrBuilder();
}
