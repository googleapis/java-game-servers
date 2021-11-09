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
// source: google/cloud/gaming/v1beta/common.proto

package com.google.cloud.gaming.v1beta;

public interface LabelSelectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.LabelSelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
