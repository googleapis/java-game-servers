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

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class GameServerConfigName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String deployment;
  private final String config;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getDeployment() {
    return deployment;
  }

  public String getConfig() {
    return config;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private GameServerConfigName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    deployment = Preconditions.checkNotNull(builder.getDeployment());
    config = Preconditions.checkNotNull(builder.getConfig());
  }

  public static GameServerConfigName of(
      String project, String location, String deployment, String config) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDeployment(deployment)
        .setConfig(config)
        .build();
  }

  public static String format(String project, String location, String deployment, String config) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDeployment(deployment)
        .setConfig(config)
        .build()
        .toString();
  }

  public static GameServerConfigName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "GameServerConfigName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("deployment"),
        matchMap.get("config"));
  }

  public static List<GameServerConfigName> parseList(List<String> formattedStrings) {
    List<GameServerConfigName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<GameServerConfigName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (GameServerConfigName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("location", location);
          fieldMapBuilder.put("deployment", deployment);
          fieldMapBuilder.put("config", config);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project", project, "location", location, "deployment", deployment, "config", config);
  }

  /** Builder for GameServerConfigName. */
  public static class Builder {

    private String project;
    private String location;
    private String deployment;
    private String config;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDeployment() {
      return deployment;
    }

    public String getConfig() {
      return config;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setDeployment(String deployment) {
      this.deployment = deployment;
      return this;
    }

    public Builder setConfig(String config) {
      this.config = config;
      return this;
    }

    private Builder() {}

    private Builder(GameServerConfigName gameServerConfigName) {
      project = gameServerConfigName.project;
      location = gameServerConfigName.location;
      deployment = gameServerConfigName.deployment;
      config = gameServerConfigName.config;
    }

    public GameServerConfigName build() {
      return new GameServerConfigName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GameServerConfigName) {
      GameServerConfigName that = (GameServerConfigName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.deployment.equals(that.deployment))
          && (this.config.equals(that.config));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= location.hashCode();
    h *= 1000003;
    h ^= deployment.hashCode();
    h *= 1000003;
    h ^= config.hashCode();
    return h;
  }
}
