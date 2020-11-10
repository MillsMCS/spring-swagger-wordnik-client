/*
 * api.wordnik.com
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package edu.mills.cs180a.wordnik.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Note
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-09T16:51:03.324-08:00")



public class Note {
  @JsonProperty("appliesTo")
  private List<String> appliesTo = null;

  @JsonProperty("noteType")
  private String noteType = null;

  @JsonProperty("pos")
  private Integer pos = null;

  @JsonProperty("value")
  private String value = null;

  public Note appliesTo(List<String> appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

  public Note addAppliesToItem(String appliesToItem) {
    if (this.appliesTo == null) {
      this.appliesTo = new ArrayList<String>();
    }
    this.appliesTo.add(appliesToItem);
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @ApiModelProperty(value = "")
  public List<String> getAppliesTo() {
    return appliesTo;
  }

  public void setAppliesTo(List<String> appliesTo) {
    this.appliesTo = appliesTo;
  }

  public Note noteType(String noteType) {
    this.noteType = noteType;
    return this;
  }

   /**
   * Get noteType
   * @return noteType
  **/
  @ApiModelProperty(value = "")
  public String getNoteType() {
    return noteType;
  }

  public void setNoteType(String noteType) {
    this.noteType = noteType;
  }

  public Note pos(Integer pos) {
    this.pos = pos;
    return this;
  }

   /**
   * Get pos
   * @return pos
  **/
  @ApiModelProperty(value = "")
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Note value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.appliesTo, note.appliesTo) &&
        Objects.equals(this.noteType, note.noteType) &&
        Objects.equals(this.pos, note.pos) &&
        Objects.equals(this.value, note.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesTo, noteType, pos, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
    sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

