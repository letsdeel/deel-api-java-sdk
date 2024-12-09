/*
 * Deel REST API
 * Deel REST API
 *
 * The version of the OpenAPI document: 1.25.0
 * Contact: apiteam@deel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of a contract
 */
@JsonAdapter(ContractTypeEnum.Adapter.class)
public enum ContractTypeEnum {
  
  ONGOING_TIME_BASED("ongoing_time_based"),
  
  MILESTONES("milestones"),
  
  TIME_BASED("time_based"),
  
  PAY_AS_YOU_GO_TIME_BASED("pay_as_you_go_time_based"),
  
  COMMISSION("commission"),
  
  PAYG_MILESTONES("payg_milestones"),
  
  PAYG_TASKS("payg_tasks"),
  
  EOR("eor"),
  
  UNKNOWN("unknown"),
  
  EMPLOYEE("employee"),
  
  GLOBAL_PAYROLL("global_payroll"),
  
  SHIELD_MSA("shield_msa"),
  
  HRIS_DIRECT_EMPLOYEE("hris_direct_employee"),
  
  PEO("peo");

  private String value;

  ContractTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContractTypeEnum fromValue(String value) {
    for (ContractTypeEnum b : ContractTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ContractTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContractTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContractTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContractTypeEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ContractTypeEnum.fromValue(value);
  }
}

