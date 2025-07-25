/*
 * Copyright 2025 Google LLC
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
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.spanner.admin.instance.v1;

public interface ListInstancePartitionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.ListInstancePartitionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of requested instancePartitions.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstancePartition instance_partitions = 1;
   * </code>
   */
  java.util.List<com.google.spanner.admin.instance.v1.InstancePartition>
      getInstancePartitionsList();

  /**
   *
   *
   * <pre>
   * The list of requested instancePartitions.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstancePartition instance_partitions = 1;
   * </code>
   */
  com.google.spanner.admin.instance.v1.InstancePartition getInstancePartitions(int index);

  /**
   *
   *
   * <pre>
   * The list of requested instancePartitions.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstancePartition instance_partitions = 1;
   * </code>
   */
  int getInstancePartitionsCount();

  /**
   *
   *
   * <pre>
   * The list of requested instancePartitions.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstancePartition instance_partitions = 1;
   * </code>
   */
  java.util.List<? extends com.google.spanner.admin.instance.v1.InstancePartitionOrBuilder>
      getInstancePartitionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of requested instancePartitions.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstancePartition instance_partitions = 1;
   * </code>
   */
  com.google.spanner.admin.instance.v1.InstancePartitionOrBuilder getInstancePartitionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListInstancePartitions][google.spanner.admin.instance.v1.InstanceAdmin.ListInstancePartitions]
   * call to fetch more of the matching instance partitions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListInstancePartitions][google.spanner.admin.instance.v1.InstanceAdmin.ListInstancePartitions]
   * call to fetch more of the matching instance partitions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The list of unreachable instances or instance partitions.
   * It includes the names of instances or instance partitions whose metadata
   * could not be retrieved within
   * [instance_partition_deadline][google.spanner.admin.instance.v1.ListInstancePartitionsRequest.instance_partition_deadline].
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();

  /**
   *
   *
   * <pre>
   * The list of unreachable instances or instance partitions.
   * It includes the names of instances or instance partitions whose metadata
   * could not be retrieved within
   * [instance_partition_deadline][google.spanner.admin.instance.v1.ListInstancePartitionsRequest.instance_partition_deadline].
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();

  /**
   *
   *
   * <pre>
   * The list of unreachable instances or instance partitions.
   * It includes the names of instances or instance partitions whose metadata
   * could not be retrieved within
   * [instance_partition_deadline][google.spanner.admin.instance.v1.ListInstancePartitionsRequest.instance_partition_deadline].
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);

  /**
   *
   *
   * <pre>
   * The list of unreachable instances or instance partitions.
   * It includes the names of instances or instance partitions whose metadata
   * could not be retrieved within
   * [instance_partition_deadline][google.spanner.admin.instance.v1.ListInstancePartitionsRequest.instance_partition_deadline].
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
