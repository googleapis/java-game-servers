// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_clusters.proto

package com.google.cloud.gaming.v1beta;

public interface GetGameServerClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.GetGameServerClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the game server cluster to retrieve. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm-id}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the game server cluster to retrieve. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm-id}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
