/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gaming.v1.stub;

import static com.google.cloud.gaming.v1.GameServerDeploymentsServiceClient.ListGameServerDeploymentsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest;
import com.google.cloud.gaming.v1.DeleteGameServerDeploymentRequest;
import com.google.cloud.gaming.v1.FetchDeploymentStateRequest;
import com.google.cloud.gaming.v1.FetchDeploymentStateResponse;
import com.google.cloud.gaming.v1.GameServerDeployment;
import com.google.cloud.gaming.v1.GameServerDeploymentRollout;
import com.google.cloud.gaming.v1.GetGameServerDeploymentRequest;
import com.google.cloud.gaming.v1.GetGameServerDeploymentRolloutRequest;
import com.google.cloud.gaming.v1.ListGameServerDeploymentsRequest;
import com.google.cloud.gaming.v1.ListGameServerDeploymentsResponse;
import com.google.cloud.gaming.v1.OperationMetadata;
import com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutRequest;
import com.google.cloud.gaming.v1.PreviewGameServerDeploymentRolloutResponse;
import com.google.cloud.gaming.v1.UpdateGameServerDeploymentRequest;
import com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the GameServerDeploymentsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcGameServerDeploymentsServiceStub extends GameServerDeploymentsServiceStub {
  private static final MethodDescriptor<
          ListGameServerDeploymentsRequest, ListGameServerDeploymentsResponse>
      listGameServerDeploymentsMethodDescriptor =
          MethodDescriptor
              .<ListGameServerDeploymentsRequest, ListGameServerDeploymentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/ListGameServerDeployments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListGameServerDeploymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListGameServerDeploymentsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetGameServerDeploymentRequest, GameServerDeployment>
      getGameServerDeploymentMethodDescriptor =
          MethodDescriptor.<GetGameServerDeploymentRequest, GameServerDeployment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/GetGameServerDeployment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGameServerDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GameServerDeployment.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateGameServerDeploymentRequest, Operation>
      createGameServerDeploymentMethodDescriptor =
          MethodDescriptor.<CreateGameServerDeploymentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/CreateGameServerDeployment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateGameServerDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteGameServerDeploymentRequest, Operation>
      deleteGameServerDeploymentMethodDescriptor =
          MethodDescriptor.<DeleteGameServerDeploymentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/DeleteGameServerDeployment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteGameServerDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateGameServerDeploymentRequest, Operation>
      updateGameServerDeploymentMethodDescriptor =
          MethodDescriptor.<UpdateGameServerDeploymentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/UpdateGameServerDeployment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateGameServerDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GetGameServerDeploymentRolloutRequest, GameServerDeploymentRollout>
      getGameServerDeploymentRolloutMethodDescriptor =
          MethodDescriptor
              .<GetGameServerDeploymentRolloutRequest, GameServerDeploymentRollout>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/GetGameServerDeploymentRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGameServerDeploymentRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GameServerDeploymentRollout.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateGameServerDeploymentRolloutRequest, Operation>
      updateGameServerDeploymentRolloutMethodDescriptor =
          MethodDescriptor.<UpdateGameServerDeploymentRolloutRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/UpdateGameServerDeploymentRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      UpdateGameServerDeploymentRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          PreviewGameServerDeploymentRolloutRequest, PreviewGameServerDeploymentRolloutResponse>
      previewGameServerDeploymentRolloutMethodDescriptor =
          MethodDescriptor
              .<PreviewGameServerDeploymentRolloutRequest,
                  PreviewGameServerDeploymentRolloutResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/PreviewGameServerDeploymentRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      PreviewGameServerDeploymentRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      PreviewGameServerDeploymentRolloutResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<FetchDeploymentStateRequest, FetchDeploymentStateResponse>
      fetchDeploymentStateMethodDescriptor =
          MethodDescriptor.<FetchDeploymentStateRequest, FetchDeploymentStateResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.gaming.v1.GameServerDeploymentsService/FetchDeploymentState")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(FetchDeploymentStateRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(FetchDeploymentStateResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListGameServerDeploymentsRequest, ListGameServerDeploymentsResponse>
      listGameServerDeploymentsCallable;
  private final UnaryCallable<
          ListGameServerDeploymentsRequest, ListGameServerDeploymentsPagedResponse>
      listGameServerDeploymentsPagedCallable;
  private final UnaryCallable<GetGameServerDeploymentRequest, GameServerDeployment>
      getGameServerDeploymentCallable;
  private final UnaryCallable<CreateGameServerDeploymentRequest, Operation>
      createGameServerDeploymentCallable;
  private final OperationCallable<
          CreateGameServerDeploymentRequest, GameServerDeployment, OperationMetadata>
      createGameServerDeploymentOperationCallable;
  private final UnaryCallable<DeleteGameServerDeploymentRequest, Operation>
      deleteGameServerDeploymentCallable;
  private final OperationCallable<DeleteGameServerDeploymentRequest, Empty, OperationMetadata>
      deleteGameServerDeploymentOperationCallable;
  private final UnaryCallable<UpdateGameServerDeploymentRequest, Operation>
      updateGameServerDeploymentCallable;
  private final OperationCallable<
          UpdateGameServerDeploymentRequest, GameServerDeployment, OperationMetadata>
      updateGameServerDeploymentOperationCallable;
  private final UnaryCallable<GetGameServerDeploymentRolloutRequest, GameServerDeploymentRollout>
      getGameServerDeploymentRolloutCallable;
  private final UnaryCallable<UpdateGameServerDeploymentRolloutRequest, Operation>
      updateGameServerDeploymentRolloutCallable;
  private final OperationCallable<
          UpdateGameServerDeploymentRolloutRequest, GameServerDeployment, OperationMetadata>
      updateGameServerDeploymentRolloutOperationCallable;
  private final UnaryCallable<
          PreviewGameServerDeploymentRolloutRequest, PreviewGameServerDeploymentRolloutResponse>
      previewGameServerDeploymentRolloutCallable;
  private final UnaryCallable<FetchDeploymentStateRequest, FetchDeploymentStateResponse>
      fetchDeploymentStateCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGameServerDeploymentsServiceStub create(
      GameServerDeploymentsServiceStubSettings settings) throws IOException {
    return new GrpcGameServerDeploymentsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGameServerDeploymentsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGameServerDeploymentsServiceStub(
        GameServerDeploymentsServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGameServerDeploymentsServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGameServerDeploymentsServiceStub(
        GameServerDeploymentsServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of GrpcGameServerDeploymentsServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGameServerDeploymentsServiceStub(
      GameServerDeploymentsServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcGameServerDeploymentsServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcGameServerDeploymentsServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGameServerDeploymentsServiceStub(
      GameServerDeploymentsServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListGameServerDeploymentsRequest, ListGameServerDeploymentsResponse>
        listGameServerDeploymentsTransportSettings =
            GrpcCallSettings
                .<ListGameServerDeploymentsRequest, ListGameServerDeploymentsResponse>newBuilder()
                .setMethodDescriptor(listGameServerDeploymentsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListGameServerDeploymentsRequest>() {
                      @Override
                      public Map<String, String> extract(ListGameServerDeploymentsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GetGameServerDeploymentRequest, GameServerDeployment>
        getGameServerDeploymentTransportSettings =
            GrpcCallSettings.<GetGameServerDeploymentRequest, GameServerDeployment>newBuilder()
                .setMethodDescriptor(getGameServerDeploymentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetGameServerDeploymentRequest>() {
                      @Override
                      public Map<String, String> extract(GetGameServerDeploymentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CreateGameServerDeploymentRequest, Operation>
        createGameServerDeploymentTransportSettings =
            GrpcCallSettings.<CreateGameServerDeploymentRequest, Operation>newBuilder()
                .setMethodDescriptor(createGameServerDeploymentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CreateGameServerDeploymentRequest>() {
                      @Override
                      public Map<String, String> extract(
                          CreateGameServerDeploymentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<DeleteGameServerDeploymentRequest, Operation>
        deleteGameServerDeploymentTransportSettings =
            GrpcCallSettings.<DeleteGameServerDeploymentRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteGameServerDeploymentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<DeleteGameServerDeploymentRequest>() {
                      @Override
                      public Map<String, String> extract(
                          DeleteGameServerDeploymentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateGameServerDeploymentRequest, Operation>
        updateGameServerDeploymentTransportSettings =
            GrpcCallSettings.<UpdateGameServerDeploymentRequest, Operation>newBuilder()
                .setMethodDescriptor(updateGameServerDeploymentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<UpdateGameServerDeploymentRequest>() {
                      @Override
                      public Map<String, String> extract(
                          UpdateGameServerDeploymentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put(
                            "game_server_deployment.name",
                            String.valueOf(request.getGameServerDeployment().getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GetGameServerDeploymentRolloutRequest, GameServerDeploymentRollout>
        getGameServerDeploymentRolloutTransportSettings =
            GrpcCallSettings
                .<GetGameServerDeploymentRolloutRequest, GameServerDeploymentRollout>newBuilder()
                .setMethodDescriptor(getGameServerDeploymentRolloutMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetGameServerDeploymentRolloutRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetGameServerDeploymentRolloutRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateGameServerDeploymentRolloutRequest, Operation>
        updateGameServerDeploymentRolloutTransportSettings =
            GrpcCallSettings.<UpdateGameServerDeploymentRolloutRequest, Operation>newBuilder()
                .setMethodDescriptor(updateGameServerDeploymentRolloutMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<UpdateGameServerDeploymentRolloutRequest>() {
                      @Override
                      public Map<String, String> extract(
                          UpdateGameServerDeploymentRolloutRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("rollout.name", String.valueOf(request.getRollout().getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<
            PreviewGameServerDeploymentRolloutRequest, PreviewGameServerDeploymentRolloutResponse>
        previewGameServerDeploymentRolloutTransportSettings =
            GrpcCallSettings
                .<PreviewGameServerDeploymentRolloutRequest,
                    PreviewGameServerDeploymentRolloutResponse>
                    newBuilder()
                .setMethodDescriptor(previewGameServerDeploymentRolloutMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<PreviewGameServerDeploymentRolloutRequest>() {
                      @Override
                      public Map<String, String> extract(
                          PreviewGameServerDeploymentRolloutRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("rollout.name", String.valueOf(request.getRollout().getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<FetchDeploymentStateRequest, FetchDeploymentStateResponse>
        fetchDeploymentStateTransportSettings =
            GrpcCallSettings.<FetchDeploymentStateRequest, FetchDeploymentStateResponse>newBuilder()
                .setMethodDescriptor(fetchDeploymentStateMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<FetchDeploymentStateRequest>() {
                      @Override
                      public Map<String, String> extract(FetchDeploymentStateRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();

    this.listGameServerDeploymentsCallable =
        callableFactory.createUnaryCallable(
            listGameServerDeploymentsTransportSettings,
            settings.listGameServerDeploymentsSettings(),
            clientContext);
    this.listGameServerDeploymentsPagedCallable =
        callableFactory.createPagedCallable(
            listGameServerDeploymentsTransportSettings,
            settings.listGameServerDeploymentsSettings(),
            clientContext);
    this.getGameServerDeploymentCallable =
        callableFactory.createUnaryCallable(
            getGameServerDeploymentTransportSettings,
            settings.getGameServerDeploymentSettings(),
            clientContext);
    this.createGameServerDeploymentCallable =
        callableFactory.createUnaryCallable(
            createGameServerDeploymentTransportSettings,
            settings.createGameServerDeploymentSettings(),
            clientContext);
    this.createGameServerDeploymentOperationCallable =
        callableFactory.createOperationCallable(
            createGameServerDeploymentTransportSettings,
            settings.createGameServerDeploymentOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteGameServerDeploymentCallable =
        callableFactory.createUnaryCallable(
            deleteGameServerDeploymentTransportSettings,
            settings.deleteGameServerDeploymentSettings(),
            clientContext);
    this.deleteGameServerDeploymentOperationCallable =
        callableFactory.createOperationCallable(
            deleteGameServerDeploymentTransportSettings,
            settings.deleteGameServerDeploymentOperationSettings(),
            clientContext,
            operationsStub);
    this.updateGameServerDeploymentCallable =
        callableFactory.createUnaryCallable(
            updateGameServerDeploymentTransportSettings,
            settings.updateGameServerDeploymentSettings(),
            clientContext);
    this.updateGameServerDeploymentOperationCallable =
        callableFactory.createOperationCallable(
            updateGameServerDeploymentTransportSettings,
            settings.updateGameServerDeploymentOperationSettings(),
            clientContext,
            operationsStub);
    this.getGameServerDeploymentRolloutCallable =
        callableFactory.createUnaryCallable(
            getGameServerDeploymentRolloutTransportSettings,
            settings.getGameServerDeploymentRolloutSettings(),
            clientContext);
    this.updateGameServerDeploymentRolloutCallable =
        callableFactory.createUnaryCallable(
            updateGameServerDeploymentRolloutTransportSettings,
            settings.updateGameServerDeploymentRolloutSettings(),
            clientContext);
    this.updateGameServerDeploymentRolloutOperationCallable =
        callableFactory.createOperationCallable(
            updateGameServerDeploymentRolloutTransportSettings,
            settings.updateGameServerDeploymentRolloutOperationSettings(),
            clientContext,
            operationsStub);
    this.previewGameServerDeploymentRolloutCallable =
        callableFactory.createUnaryCallable(
            previewGameServerDeploymentRolloutTransportSettings,
            settings.previewGameServerDeploymentRolloutSettings(),
            clientContext);
    this.fetchDeploymentStateCallable =
        callableFactory.createUnaryCallable(
            fetchDeploymentStateTransportSettings,
            settings.fetchDeploymentStateSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<ListGameServerDeploymentsRequest, ListGameServerDeploymentsResponse>
      listGameServerDeploymentsCallable() {
    return listGameServerDeploymentsCallable;
  }

  public UnaryCallable<ListGameServerDeploymentsRequest, ListGameServerDeploymentsPagedResponse>
      listGameServerDeploymentsPagedCallable() {
    return listGameServerDeploymentsPagedCallable;
  }

  public UnaryCallable<GetGameServerDeploymentRequest, GameServerDeployment>
      getGameServerDeploymentCallable() {
    return getGameServerDeploymentCallable;
  }

  public UnaryCallable<CreateGameServerDeploymentRequest, Operation>
      createGameServerDeploymentCallable() {
    return createGameServerDeploymentCallable;
  }

  public OperationCallable<
          CreateGameServerDeploymentRequest, GameServerDeployment, OperationMetadata>
      createGameServerDeploymentOperationCallable() {
    return createGameServerDeploymentOperationCallable;
  }

  public UnaryCallable<DeleteGameServerDeploymentRequest, Operation>
      deleteGameServerDeploymentCallable() {
    return deleteGameServerDeploymentCallable;
  }

  public OperationCallable<DeleteGameServerDeploymentRequest, Empty, OperationMetadata>
      deleteGameServerDeploymentOperationCallable() {
    return deleteGameServerDeploymentOperationCallable;
  }

  public UnaryCallable<UpdateGameServerDeploymentRequest, Operation>
      updateGameServerDeploymentCallable() {
    return updateGameServerDeploymentCallable;
  }

  public OperationCallable<
          UpdateGameServerDeploymentRequest, GameServerDeployment, OperationMetadata>
      updateGameServerDeploymentOperationCallable() {
    return updateGameServerDeploymentOperationCallable;
  }

  public UnaryCallable<GetGameServerDeploymentRolloutRequest, GameServerDeploymentRollout>
      getGameServerDeploymentRolloutCallable() {
    return getGameServerDeploymentRolloutCallable;
  }

  public UnaryCallable<UpdateGameServerDeploymentRolloutRequest, Operation>
      updateGameServerDeploymentRolloutCallable() {
    return updateGameServerDeploymentRolloutCallable;
  }

  public OperationCallable<
          UpdateGameServerDeploymentRolloutRequest, GameServerDeployment, OperationMetadata>
      updateGameServerDeploymentRolloutOperationCallable() {
    return updateGameServerDeploymentRolloutOperationCallable;
  }

  public UnaryCallable<
          PreviewGameServerDeploymentRolloutRequest, PreviewGameServerDeploymentRolloutResponse>
      previewGameServerDeploymentRolloutCallable() {
    return previewGameServerDeploymentRolloutCallable;
  }

  public UnaryCallable<FetchDeploymentStateRequest, FetchDeploymentStateResponse>
      fetchDeploymentStateCallable() {
    return fetchDeploymentStateCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
