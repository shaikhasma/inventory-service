package com.gotech.inventoryservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
  @JsonProperty("status-code")
  private String statusCode;

  @JsonProperty("error-message")
  private String errorMessage;
}
