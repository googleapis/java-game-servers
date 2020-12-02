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
package com.google.cloud.gaming.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/gaming/v1/game_server_deployments_service.proto")
public final class GameServerDeploymentsServiceGrpc {

  private GameServerDeploymentsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.gaming.v1.GameServerDeploymentsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest,
          com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
      getListGameServerDeploymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGameServerDeployments",
      requestType = com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest.class,
      responseType = com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest,
          com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
      getListGameServerDeploymentsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest,
            com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
        getListGameServerDeploymentsMethod;
    if ((getListGameServerDeploymentsMethod =
            GameServerDeploymentsServiceGrpc.getListGameServerDeploymentsMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getListGameServerDeploymentsMethod =
                GameServerDeploymentsServiceGrpc.getListGameServerDeploymentsMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getListGameServerDeploymentsMethod =
              getListGameServerDeploymentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest,
                          com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListGameServerDeployments"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "ListGameServerDeployments"))
                      .build();
        }
      }
    }
    return getListGameServerDeploymentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.GetGameServerDeploymentRequest,
          com.google.cloud.gaming.v1.GameServerDeployment>
      getGetGameServerDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGameServerDeployment",
      requestType = com.google.cloud.gaming.v1.GetGameServerDeploymentRequest.class,
      responseType = com.google.cloud.gaming.v1.GameServerDeployment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.GetGameServerDeploymentRequest,
          com.google.cloud.gaming.v1.GameServerDeployment>
      getGetGameServerDeploymentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.GetGameServerDeploymentRequest,
            com.google.cloud.gaming.v1.GameServerDeployment>
        getGetGameServerDeploymentMethod;
    if ((getGetGameServerDeploymentMethod =
            GameServerDeploymentsServiceGrpc.getGetGameServerDeploymentMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getGetGameServerDeploymentMethod =
                GameServerDeploymentsServiceGrpc.getGetGameServerDeploymentMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getGetGameServerDeploymentMethod =
              getGetGameServerDeploymentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.GetGameServerDeploymentRequest,
                          com.google.cloud.gaming.v1.GameServerDeployment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetGameServerDeployment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.GetGameServerDeploymentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.GameServerDeployment.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "GetGameServerDeployment"))
                      .build();
        }
      }
    }
    return getGetGameServerDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest,
          com.google.longrunning.Operation>
      getCreateGameServerDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGameServerDeployment",
      requestType = com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest,
          com.google.longrunning.Operation>
      getCreateGameServerDeploymentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest,
            com.google.longrunning.Operation>
        getCreateGameServerDeploymentMethod;
    if ((getCreateGameServerDeploymentMethod =
            GameServerDeploymentsServiceGrpc.getCreateGameServerDeploymentMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getCreateGameServerDeploymentMethod =
                GameServerDeploymentsServiceGrpc.getCreateGameServerDeploymentMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getCreateGameServerDeploymentMethod =
              getCreateGameServerDeploymentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateGameServerDeployment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "CreateGameServerDeployment"))
                      .build();
        }
      }
    }
    return getCreateGameServerDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest,
          com.google.longrunning.Operation>
      getDeleteGameServerDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGameServerDeployment",
      requestType = com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest,
          com.google.longrunning.Operation>
      getDeleteGameServerDeploymentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest,
            com.google.longrunning.Operation>
        getDeleteGameServerDeploymentMethod;
    if ((getDeleteGameServerDeploymentMethod =
            GameServerDeploymentsServiceGrpc.getDeleteGameServerDeploymentMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getDeleteGameServerDeploymentMethod =
                GameServerDeploymentsServiceGrpc.getDeleteGameServerDeploymentMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getDeleteGameServerDeploymentMethod =
              getDeleteGameServerDeploymentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteGameServerDeployment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "DeleteGameServerDeployment"))
                      .build();
        }
      }
    }
    return getDeleteGameServerDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest,
          com.google.longrunning.Operation>
      getUpdateGameServerDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGameServerDeployment",
      requestType = com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest,
          com.google.longrunning.Operation>
      getUpdateGameServerDeploymentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest,
            com.google.longrunning.Operation>
        getUpdateGameServerDeploymentMethod;
    if ((getUpdateGameServerDeploymentMethod =
            GameServerDeploymentsServiceGrpc.getUpdateGameServerDeploymentMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getUpdateGameServerDeploymentMethod =
                GameServerDeploymentsServiceGrpc.getUpdateGameServerDeploymentMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getUpdateGameServerDeploymentMethod =
              getUpdateGameServerDeploymentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateGameServerDeployment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "UpdateGameServerDeployment"))
                      .build();
        }
      }
    }
    return getUpdateGameServerDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest,
          com.google.cloud.gaming.v1.GameServerDeploymentRollout>
      getGetGameServerDeploymentRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGameServerDeploymentRollout",
      requestType = com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest.class,
      responseType = com.google.cloud.gaming.v1.GameServerDeploymentRollout.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest,
          com.google.cloud.gaming.v1.GameServerDeploymentRollout>
      getGetGameServerDeploymentRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest,
            com.google.cloud.gaming.v1.GameServerDeploymentRollout>
        getGetGameServerDeploymentRolloutMethod;
    if ((getGetGameServerDeploymentRolloutMethod =
            GameServerDeploymentsServiceGrpc.getGetGameServerDeploymentRolloutMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getGetGameServerDeploymentRolloutMethod =
                GameServerDeploymentsServiceGrpc.getGetGameServerDeploymentRolloutMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getGetGameServerDeploymentRolloutMethod =
              getGetGameServerDeploymentRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest,
                          com.google.cloud.gaming.v1.GameServerDeploymentRollout>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetGameServerDeploymentRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.GameServerDeploymentRollout
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "GetGameServerDeploymentRollout"))
                      .build();
        }
      }
    }
    return getGetGameServerDeploymentRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest,
          com.google.longrunning.Operation>
      getUpdateGameServerDeploymentRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGameServerDeploymentRollout",
      requestType = com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest,
          com.google.longrunning.Operation>
      getUpdateGameServerDeploymentRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest,
            com.google.longrunning.Operation>
        getUpdateGameServerDeploymentRolloutMethod;
    if ((getUpdateGameServerDeploymentRolloutMethod =
            GameServerDeploymentsServiceGrpc.getUpdateGameServerDeploymentRolloutMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getUpdateGameServerDeploymentRolloutMethod =
                GameServerDeploymentsServiceGrpc.getUpdateGameServerDeploymentRolloutMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getUpdateGameServerDeploymentRolloutMethod =
              getUpdateGameServerDeploymentRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateGameServerDeploymentRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "UpdateGameServerDeploymentRollout"))
                      .build();
        }
      }
    }
    return getUpdateGameServerDeploymentRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest,
          com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
      getPreviewGameServerDeploymentRolloutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewGameServerDeploymentRollout",
      requestType = com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest.class,
      responseType = com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest,
          com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
      getPreviewGameServerDeploymentRolloutMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest,
            com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
        getPreviewGameServerDeploymentRolloutMethod;
    if ((getPreviewGameServerDeploymentRolloutMethod =
            GameServerDeploymentsServiceGrpc.getPreviewGameServerDeploymentRolloutMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getPreviewGameServerDeploymentRolloutMethod =
                GameServerDeploymentsServiceGrpc.getPreviewGameServerDeploymentRolloutMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getPreviewGameServerDeploymentRolloutMethod =
              getPreviewGameServerDeploymentRolloutMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest,
                          com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              SERVICE_NAME, "PreviewGameServerDeploymentRollout"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "PreviewGameServerDeploymentRollout"))
                      .build();
        }
      }
    }
    return getPreviewGameServerDeploymentRolloutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.FetchDeploymentStateRequest,
          com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
      getFetchDeploymentStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchDeploymentState",
      requestType = com.google.cloud.gaming.v1.FetchDeploymentStateRequest.class,
      responseType = com.google.cloud.gaming.v1.FetchDeploymentStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.gaming.v1.FetchDeploymentStateRequest,
          com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
      getFetchDeploymentStateMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.gaming.v1.FetchDeploymentStateRequest,
            com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
        getFetchDeploymentStateMethod;
    if ((getFetchDeploymentStateMethod =
            GameServerDeploymentsServiceGrpc.getFetchDeploymentStateMethod)
        == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        if ((getFetchDeploymentStateMethod =
                GameServerDeploymentsServiceGrpc.getFetchDeploymentStateMethod)
            == null) {
          GameServerDeploymentsServiceGrpc.getFetchDeploymentStateMethod =
              getFetchDeploymentStateMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.gaming.v1.FetchDeploymentStateRequest,
                          com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "FetchDeploymentState"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.FetchDeploymentStateRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.gaming.v1.FetchDeploymentStateResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new GameServerDeploymentsServiceMethodDescriptorSupplier(
                              "FetchDeploymentState"))
                      .build();
        }
      }
    }
    return getFetchDeploymentStateMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static GameServerDeploymentsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServerDeploymentsServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<GameServerDeploymentsServiceStub>() {
          @java.lang.Override
          public GameServerDeploymentsServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GameServerDeploymentsServiceStub(channel, callOptions);
          }
        };
    return GameServerDeploymentsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServerDeploymentsServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServerDeploymentsServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<GameServerDeploymentsServiceBlockingStub>() {
          @java.lang.Override
          public GameServerDeploymentsServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GameServerDeploymentsServiceBlockingStub(channel, callOptions);
          }
        };
    return GameServerDeploymentsServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static GameServerDeploymentsServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServerDeploymentsServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<GameServerDeploymentsServiceFutureStub>() {
          @java.lang.Override
          public GameServerDeploymentsServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new GameServerDeploymentsServiceFutureStub(channel, callOptions);
          }
        };
    return GameServerDeploymentsServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class GameServerDeploymentsServiceImplBase
      implements io.grpc.BindableService {

    /** */
    public void listGameServerDeployments(
        com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListGameServerDeploymentsMethod(), responseObserver);
    }

    /** */
    public void getGameServerDeployment(
        com.google.cloud.gaming.v1.GetGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.GameServerDeployment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetGameServerDeploymentMethod(), responseObserver);
    }

    /** */
    public void createGameServerDeployment(
        com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGameServerDeploymentMethod(), responseObserver);
    }

    /** */
    public void deleteGameServerDeployment(
        com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGameServerDeploymentMethod(), responseObserver);
    }

    /** */
    public void updateGameServerDeployment(
        com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGameServerDeploymentMethod(), responseObserver);
    }

    /** */
    public void getGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.GameServerDeploymentRollout>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetGameServerDeploymentRolloutMethod(), responseObserver);
    }

    /** */
    public void updateGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGameServerDeploymentRolloutMethod(), responseObserver);
    }

    /** */
    public void previewGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getPreviewGameServerDeploymentRolloutMethod(), responseObserver);
    }

    /** */
    public void fetchDeploymentState(
        com.google.cloud.gaming.v1.FetchDeploymentStateRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getFetchDeploymentStateMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListGameServerDeploymentsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest,
                      com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>(
                      this, METHODID_LIST_GAME_SERVER_DEPLOYMENTS)))
          .addMethod(
              getGetGameServerDeploymentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.GetGameServerDeploymentRequest,
                      com.google.cloud.gaming.v1.GameServerDeployment>(
                      this, METHODID_GET_GAME_SERVER_DEPLOYMENT)))
          .addMethod(
              getCreateGameServerDeploymentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_CREATE_GAME_SERVER_DEPLOYMENT)))
          .addMethod(
              getDeleteGameServerDeploymentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_DELETE_GAME_SERVER_DEPLOYMENT)))
          .addMethod(
              getUpdateGameServerDeploymentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_UPDATE_GAME_SERVER_DEPLOYMENT)))
          .addMethod(
              getGetGameServerDeploymentRolloutMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest,
                      com.google.cloud.gaming.v1.GameServerDeploymentRollout>(
                      this, METHODID_GET_GAME_SERVER_DEPLOYMENT_ROLLOUT)))
          .addMethod(
              getUpdateGameServerDeploymentRolloutMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest,
                      com.google.longrunning.Operation>(
                      this, METHODID_UPDATE_GAME_SERVER_DEPLOYMENT_ROLLOUT)))
          .addMethod(
              getPreviewGameServerDeploymentRolloutMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest,
                      com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>(
                      this, METHODID_PREVIEW_GAME_SERVER_DEPLOYMENT_ROLLOUT)))
          .addMethod(
              getFetchDeploymentStateMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.gaming.v1.FetchDeploymentStateRequest,
                      com.google.cloud.gaming.v1.FetchDeploymentStateResponse>(
                      this, METHODID_FETCH_DEPLOYMENT_STATE)))
          .build();
    }
  }

  /** */
  public static final class GameServerDeploymentsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GameServerDeploymentsServiceStub> {
    private GameServerDeploymentsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServerDeploymentsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServerDeploymentsServiceStub(channel, callOptions);
    }

    /** */
    public void listGameServerDeployments(
        com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGameServerDeploymentsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getGameServerDeployment(
        com.google.cloud.gaming.v1.GetGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.GameServerDeployment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGameServerDeploymentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createGameServerDeployment(
        com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGameServerDeploymentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteGameServerDeployment(
        com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGameServerDeploymentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateGameServerDeployment(
        com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGameServerDeploymentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.GameServerDeploymentRollout>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGameServerDeploymentRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGameServerDeploymentRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void previewGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPreviewGameServerDeploymentRolloutMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void fetchDeploymentState(
        com.google.cloud.gaming.v1.FetchDeploymentStateRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchDeploymentStateMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class GameServerDeploymentsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GameServerDeploymentsServiceBlockingStub> {
    private GameServerDeploymentsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServerDeploymentsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServerDeploymentsServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse listGameServerDeployments(
        com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGameServerDeploymentsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.gaming.v1.GameServerDeployment getGameServerDeployment(
        com.google.cloud.gaming.v1.GetGameServerDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGameServerDeploymentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation createGameServerDeployment(
        com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGameServerDeploymentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deleteGameServerDeployment(
        com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGameServerDeploymentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation updateGameServerDeployment(
        com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGameServerDeploymentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.gaming.v1.GameServerDeploymentRollout getGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGameServerDeploymentRolloutMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation updateGameServerDeploymentRollout(
        com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGameServerDeploymentRolloutMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse
        previewGameServerDeploymentRollout(
            com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPreviewGameServerDeploymentRolloutMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.gaming.v1.FetchDeploymentStateResponse fetchDeploymentState(
        com.google.cloud.gaming.v1.FetchDeploymentStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchDeploymentStateMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class GameServerDeploymentsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GameServerDeploymentsServiceFutureStub> {
    private GameServerDeploymentsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServerDeploymentsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServerDeploymentsServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>
        listGameServerDeployments(
            com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGameServerDeploymentsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.gaming.v1.GameServerDeployment>
        getGameServerDeployment(com.google.cloud.gaming.v1.GetGameServerDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGameServerDeploymentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createGameServerDeployment(
            com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGameServerDeploymentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteGameServerDeployment(
            com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGameServerDeploymentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateGameServerDeployment(
            com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGameServerDeploymentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.gaming.v1.GameServerDeploymentRollout>
        getGameServerDeploymentRollout(
            com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGameServerDeploymentRolloutMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateGameServerDeploymentRollout(
            com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGameServerDeploymentRolloutMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>
        previewGameServerDeploymentRollout(
            com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPreviewGameServerDeploymentRolloutMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.gaming.v1.FetchDeploymentStateResponse>
        fetchDeploymentState(com.google.cloud.gaming.v1.FetchDeploymentStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchDeploymentStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GAME_SERVER_DEPLOYMENTS = 0;
  private static final int METHODID_GET_GAME_SERVER_DEPLOYMENT = 1;
  private static final int METHODID_CREATE_GAME_SERVER_DEPLOYMENT = 2;
  private static final int METHODID_DELETE_GAME_SERVER_DEPLOYMENT = 3;
  private static final int METHODID_UPDATE_GAME_SERVER_DEPLOYMENT = 4;
  private static final int METHODID_GET_GAME_SERVER_DEPLOYMENT_ROLLOUT = 5;
  private static final int METHODID_UPDATE_GAME_SERVER_DEPLOYMENT_ROLLOUT = 6;
  private static final int METHODID_PREVIEW_GAME_SERVER_DEPLOYMENT_ROLLOUT = 7;
  private static final int METHODID_FETCH_DEPLOYMENT_STATE = 8;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameServerDeploymentsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameServerDeploymentsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GAME_SERVER_DEPLOYMENTS:
          serviceImpl.listGameServerDeployments(
              (com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_GAME_SERVER_DEPLOYMENT:
          serviceImpl.getGameServerDeployment(
              (com.google.cloud.gaming.v1.GetGameServerDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.GameServerDeployment>)
                  responseObserver);
          break;
        case METHODID_CREATE_GAME_SERVER_DEPLOYMENT:
          serviceImpl.createGameServerDeployment(
              (com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_GAME_SERVER_DEPLOYMENT:
          serviceImpl.deleteGameServerDeployment(
              (com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_GAME_SERVER_DEPLOYMENT:
          serviceImpl.updateGameServerDeployment(
              (com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_GAME_SERVER_DEPLOYMENT_ROLLOUT:
          serviceImpl.getGameServerDeploymentRollout(
              (com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.GameServerDeploymentRollout>)
                  responseObserver);
          break;
        case METHODID_UPDATE_GAME_SERVER_DEPLOYMENT_ROLLOUT:
          serviceImpl.updateGameServerDeploymentRollout(
              (com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_PREVIEW_GAME_SERVER_DEPLOYMENT_ROLLOUT:
          serviceImpl.previewGameServerDeploymentRollout(
              (com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse>)
                  responseObserver);
          break;
        case METHODID_FETCH_DEPLOYMENT_STATE:
          serviceImpl.fetchDeploymentState(
              (com.google.cloud.gaming.v1.FetchDeploymentStateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.gaming.v1.FetchDeploymentStateResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class GameServerDeploymentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServerDeploymentsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.gaming.v1.GameServerDeploymentsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameServerDeploymentsService");
    }
  }

  private static final class GameServerDeploymentsServiceFileDescriptorSupplier
      extends GameServerDeploymentsServiceBaseDescriptorSupplier {
    GameServerDeploymentsServiceFileDescriptorSupplier() {}
  }

  private static final class GameServerDeploymentsServiceMethodDescriptorSupplier
      extends GameServerDeploymentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameServerDeploymentsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GameServerDeploymentsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new GameServerDeploymentsServiceFileDescriptorSupplier())
                      .addMethod(getListGameServerDeploymentsMethod())
                      .addMethod(getGetGameServerDeploymentMethod())
                      .addMethod(getCreateGameServerDeploymentMethod())
                      .addMethod(getDeleteGameServerDeploymentMethod())
                      .addMethod(getUpdateGameServerDeploymentMethod())
                      .addMethod(getGetGameServerDeploymentRolloutMethod())
                      .addMethod(getUpdateGameServerDeploymentRolloutMethod())
                      .addMethod(getPreviewGameServerDeploymentRolloutMethod())
                      .addMethod(getFetchDeploymentStateMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
