// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_deployments.proto

package com.google.cloud.gaming.v1;

public interface DeleteGameServerDeploymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.DeleteGameServerDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the game server delpoyment to delete, in the following form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the game server delpoyment to delete, in the following form:
   * `projects/{project}/locations/{location}/gameServerDeployments/{deployment}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
