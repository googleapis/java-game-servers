// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

public interface OperationStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.OperationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Whether the operation is done or still in progress.
   * </pre>
   *
   * <code>bool done = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The done.
   */
  boolean getDone();

  /**
   * <pre>
   * The error code in case of failures.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.OperationStatus.ErrorCode error_code = 2;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <pre>
   * The error code in case of failures.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.OperationStatus.ErrorCode error_code = 2;</code>
   * @return The errorCode.
   */
  com.google.cloud.gaming.v1.OperationStatus.ErrorCode getErrorCode();

  /**
   * <pre>
   * The human-readable error message.
   * </pre>
   *
   * <code>string error_message = 3;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * The human-readable error message.
   * </pre>
   *
   * <code>string error_message = 3;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}