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

/**
 *
 *
 * <pre>
 * Response message for
 * GameServerClustersService.PreviewDeleteGameServerCluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse}
 */
public final class PreviewDeleteGameServerClusterResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse)
    PreviewDeleteGameServerClusterResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PreviewDeleteGameServerClusterResponse.newBuilder() to construct.
  private PreviewDeleteGameServerClusterResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PreviewDeleteGameServerClusterResponse() {
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PreviewDeleteGameServerClusterResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PreviewDeleteGameServerClusterResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              etag_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.gaming.v1.TargetState.Builder subBuilder = null;
              if (targetState_ != null) {
                subBuilder = targetState_.toBuilder();
              }
              targetState_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1.TargetState.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetState_);
                targetState_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1.GameServerClusters
        .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1.GameServerClusters
        .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.class,
            com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.Builder.class);
  }

  public static final int ETAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object etag_;
  /**
   *
   *
   * <pre>
   * The ETag of the game server cluster.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  @java.lang.Override
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ETag of the game server cluster.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_STATE_FIELD_NUMBER = 3;
  private com.google.cloud.gaming.v1.TargetState targetState_;
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   *
   * @return Whether the targetState field is set.
   */
  @java.lang.Override
  public boolean hasTargetState() {
    return targetState_ != null;
  }
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   *
   * @return The targetState.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.TargetState getTargetState() {
    return targetState_ == null
        ? com.google.cloud.gaming.v1.TargetState.getDefaultInstance()
        : targetState_;
  }
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.TargetStateOrBuilder getTargetStateOrBuilder() {
    return getTargetState();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getEtagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, etag_);
    }
    if (targetState_ != null) {
      output.writeMessage(3, getTargetState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEtagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, etag_);
    }
    if (targetState_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTargetState());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse other =
        (com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse) obj;

    if (!getEtag().equals(other.getEtag())) return false;
    if (hasTargetState() != other.hasTargetState()) return false;
    if (hasTargetState()) {
      if (!getTargetState().equals(other.getTargetState())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    if (hasTargetState()) {
      hash = (37 * hash) + TARGET_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for
   * GameServerClustersService.PreviewDeleteGameServerCluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse)
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.class,
              com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      etag_ = "";

      if (targetStateBuilder_ == null) {
        targetState_ = null;
      } else {
        targetState_ = null;
        targetStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse build() {
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse buildPartial() {
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse result =
          new com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse(this);
      result.etag_ = etag_;
      if (targetStateBuilder_ == null) {
        result.targetState_ = targetState_;
      } else {
        result.targetState_ = targetStateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse) {
        return mergeFrom((com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse other) {
      if (other
          == com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse.getDefaultInstance())
        return this;
      if (!other.getEtag().isEmpty()) {
        etag_ = other.etag_;
        onChanged();
      }
      if (other.hasTargetState()) {
        mergeTargetState(other.getTargetState());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object etag_ = "";
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      etag_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEtag() {

      etag_ = getDefaultInstance().getEtag();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      etag_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1.TargetState targetState_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1.TargetState,
            com.google.cloud.gaming.v1.TargetState.Builder,
            com.google.cloud.gaming.v1.TargetStateOrBuilder>
        targetStateBuilder_;
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     *
     * @return Whether the targetState field is set.
     */
    public boolean hasTargetState() {
      return targetStateBuilder_ != null || targetState_ != null;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     *
     * @return The targetState.
     */
    public com.google.cloud.gaming.v1.TargetState getTargetState() {
      if (targetStateBuilder_ == null) {
        return targetState_ == null
            ? com.google.cloud.gaming.v1.TargetState.getDefaultInstance()
            : targetState_;
      } else {
        return targetStateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    public Builder setTargetState(com.google.cloud.gaming.v1.TargetState value) {
      if (targetStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetState_ = value;
        onChanged();
      } else {
        targetStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    public Builder setTargetState(com.google.cloud.gaming.v1.TargetState.Builder builderForValue) {
      if (targetStateBuilder_ == null) {
        targetState_ = builderForValue.build();
        onChanged();
      } else {
        targetStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    public Builder mergeTargetState(com.google.cloud.gaming.v1.TargetState value) {
      if (targetStateBuilder_ == null) {
        if (targetState_ != null) {
          targetState_ =
              com.google.cloud.gaming.v1.TargetState.newBuilder(targetState_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          targetState_ = value;
        }
        onChanged();
      } else {
        targetStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    public Builder clearTargetState() {
      if (targetStateBuilder_ == null) {
        targetState_ = null;
        onChanged();
      } else {
        targetState_ = null;
        targetStateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    public com.google.cloud.gaming.v1.TargetState.Builder getTargetStateBuilder() {

      onChanged();
      return getTargetStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    public com.google.cloud.gaming.v1.TargetStateOrBuilder getTargetStateOrBuilder() {
      if (targetStateBuilder_ != null) {
        return targetStateBuilder_.getMessageOrBuilder();
      } else {
        return targetState_ == null
            ? com.google.cloud.gaming.v1.TargetState.getDefaultInstance()
            : targetState_;
      }
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1.TargetState,
            com.google.cloud.gaming.v1.TargetState.Builder,
            com.google.cloud.gaming.v1.TargetStateOrBuilder>
        getTargetStateFieldBuilder() {
      if (targetStateBuilder_ == null) {
        targetStateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1.TargetState,
                com.google.cloud.gaming.v1.TargetState.Builder,
                com.google.cloud.gaming.v1.TargetStateOrBuilder>(
                getTargetState(), getParentForChildren(), isClean());
        targetState_ = null;
      }
      return targetStateBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse)
  private static final com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse();
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviewDeleteGameServerClusterResponse> PARSER =
      new com.google.protobuf.AbstractParser<PreviewDeleteGameServerClusterResponse>() {
        @java.lang.Override
        public PreviewDeleteGameServerClusterResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PreviewDeleteGameServerClusterResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PreviewDeleteGameServerClusterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviewDeleteGameServerClusterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
