// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_clusters.proto

package com.google.cloud.gaming.v1;

public interface GameServerClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.GameServerCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the game server cluster, in the following form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * For example,
   * `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the game server cluster, in the following form:
   * `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`.
   * For example,
   * `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The labels associated with this game server cluster. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels associated with this game server cluster. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The labels associated with this game server cluster. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels associated with this game server cluster. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The labels associated with this game server cluster. Each label is a
   * key-value pair.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The game server cluster connection information. This information is used to
   * manage game server clusters.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.GameServerClusterConnectionInfo connection_info = 5;</code>
   * @return Whether the connectionInfo field is set.
   */
  boolean hasConnectionInfo();
  /**
   * <pre>
   * The game server cluster connection information. This information is used to
   * manage game server clusters.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.GameServerClusterConnectionInfo connection_info = 5;</code>
   * @return The connectionInfo.
   */
  com.google.cloud.gaming.v1.GameServerClusterConnectionInfo getConnectionInfo();
  /**
   * <pre>
   * The game server cluster connection information. This information is used to
   * manage game server clusters.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.GameServerClusterConnectionInfo connection_info = 5;</code>
   */
  com.google.cloud.gaming.v1.GameServerClusterConnectionInfoOrBuilder getConnectionInfoOrBuilder();

  /**
   * <pre>
   * ETag of the resource.
   * </pre>
   *
   * <code>string etag = 6;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * ETag of the resource.
   * </pre>
   *
   * <code>string etag = 6;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Human readable description of the cluster.
   * </pre>
   *
   * <code>string description = 7;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description of the cluster.
   * </pre>
   *
   * <code>string description = 7;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. The state of the Kubernetes cluster, this will be available if
   * 'view' is set to `FULL` in the relevant List/Get/Preview request.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.KubernetesClusterState cluster_state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the clusterState field is set.
   */
  boolean hasClusterState();
  /**
   * <pre>
   * Output only. The state of the Kubernetes cluster, this will be available if
   * 'view' is set to `FULL` in the relevant List/Get/Preview request.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.KubernetesClusterState cluster_state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clusterState.
   */
  com.google.cloud.gaming.v1.KubernetesClusterState getClusterState();
  /**
   * <pre>
   * Output only. The state of the Kubernetes cluster, this will be available if
   * 'view' is set to `FULL` in the relevant List/Get/Preview request.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.KubernetesClusterState cluster_state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gaming.v1.KubernetesClusterStateOrBuilder getClusterStateOrBuilder();
}