package com.adyen.examples.model;

import java.net.URI;
import java.util.Objects;
import com.adyen.examples.model.JSONPath;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JSONObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class JSONObject {

  @Valid
  private List<@Valid JSONPath> paths;

  private JSONPath rootPath;

  public JSONObject paths(List<@Valid JSONPath> paths) {
    this.paths = paths;
    return this;
  }

  public JSONObject addPathsItem(JSONPath pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * Get paths
   * @return paths
  */
  @Valid 
  @Schema(name = "paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paths")
  public List<@Valid JSONPath> getPaths() {
    return paths;
  }

  public void setPaths(List<@Valid JSONPath> paths) {
    this.paths = paths;
  }

  public JSONObject rootPath(JSONPath rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  /**
   * Get rootPath
   * @return rootPath
  */
  @Valid 
  @Schema(name = "rootPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootPath")
  public JSONPath getRootPath() {
    return rootPath;
  }

  public void setRootPath(JSONPath rootPath) {
    this.rootPath = rootPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONObject jsONObject = (JSONObject) o;
    return Objects.equals(this.paths, jsONObject.paths) &&
        Objects.equals(this.rootPath, jsONObject.rootPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths, rootPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONObject {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

