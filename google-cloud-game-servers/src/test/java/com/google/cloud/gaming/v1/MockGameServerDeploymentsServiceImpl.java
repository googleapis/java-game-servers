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

import com.google.api.core.BetaApi;
import com.google.cloud.gaming.v1.GameServerDeploymentsServiceGrpc.GameServerDeploymentsServiceImplBase;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockGameServerDeploymentsServiceImpl extends GameServerDeploymentsServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockGameServerDeploymentsServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void listGameServerDeployments(
      ListGameServerDeploymentsRequest request,
      StreamObserver<ListGameServerDeploymentsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListGameServerDeploymentsResponse) {
      requests.add(request);
      responseObserver.onNext((ListGameServerDeploymentsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getGameServerDeployment(
      GetGameServerDeploymentRequest request,
      StreamObserver<GameServerDeployment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof GameServerDeployment) {
      requests.add(request);
      responseObserver.onNext((GameServerDeployment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createGameServerDeployment(
      CreateGameServerDeploymentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteGameServerDeployment(
      DeleteGameServerDeploymentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateGameServerDeployment(
      UpdateGameServerDeploymentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getGameServerDeploymentRollout(
      GetGameServerDeploymentRolloutRequest request,
      StreamObserver<GameServerDeploymentRollout> responseObserver) {
    Object response = responses.remove();
    if (response instanceof GameServerDeploymentRollout) {
      requests.add(request);
      responseObserver.onNext((GameServerDeploymentRollout) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateGameServerDeploymentRollout(
      UpdateGameServerDeploymentRolloutRequest request,
      StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void previewGameServerDeploymentRollout(
      PreviewGameServerDeploymentRolloutRequest request,
      StreamObserver<PreviewGameServerDeploymentRolloutResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof PreviewGameServerDeploymentRolloutResponse) {
      requests.add(request);
      responseObserver.onNext((PreviewGameServerDeploymentRolloutResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void fetchDeploymentState(
      FetchDeploymentStateRequest request,
      StreamObserver<FetchDeploymentStateResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof FetchDeploymentStateResponse) {
      requests.add(request);
      responseObserver.onNext((FetchDeploymentStateResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
