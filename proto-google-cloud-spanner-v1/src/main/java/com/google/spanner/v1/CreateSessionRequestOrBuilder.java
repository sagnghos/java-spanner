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
// source: google/spanner/v1/spanner.proto

// Protobuf Java Version: 3.25.8
package com.google.spanner.v1;

public interface CreateSessionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.CreateSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The database in which the new session is created.
   * </pre>
   *
   * <code>
   * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();

  /**
   *
   *
   * <pre>
   * Required. The database in which the new session is created.
   * </pre>
   *
   * <code>
   * string database = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * Required. The session to create.
   * </pre>
   *
   * <code>.google.spanner.v1.Session session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the session field is set.
   */
  boolean hasSession();

  /**
   *
   *
   * <pre>
   * Required. The session to create.
   * </pre>
   *
   * <code>.google.spanner.v1.Session session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The session.
   */
  com.google.spanner.v1.Session getSession();

  /**
   *
   *
   * <pre>
   * Required. The session to create.
   * </pre>
   *
   * <code>.google.spanner.v1.Session session = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.spanner.v1.SessionOrBuilder getSessionOrBuilder();
}
