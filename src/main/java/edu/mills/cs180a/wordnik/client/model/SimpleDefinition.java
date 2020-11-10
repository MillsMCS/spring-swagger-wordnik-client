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

/**
 * SimpleDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-09T16:51:03.324-08:00")



public class SimpleDefinition {
  @JsonProperty("note")
  private String note = null;

  @JsonProperty("partOfSpeech")
  private String partOfSpeech = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("text")
  private String text = null;

  public SimpleDefinition note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public SimpleDefinition partOfSpeech(String partOfSpeech) {
    this.partOfSpeech = partOfSpeech;
    return this;
  }

   /**
   * Get partOfSpeech
   * @return partOfSpeech
  **/
  @ApiModelProperty(value = "")
  public String getPartOfSpeech() {
    return partOfSpeech;
  }

  public void setPartOfSpeech(String partOfSpeech) {
    this.partOfSpeech = partOfSpeech;
  }

  public SimpleDefinition source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public SimpleDefinition text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleDefinition simpleDefinition = (SimpleDefinition) o;
    return Objects.equals(this.note, simpleDefinition.note) &&
        Objects.equals(this.partOfSpeech, simpleDefinition.partOfSpeech) &&
        Objects.equals(this.source, simpleDefinition.source) &&
        Objects.equals(this.text, simpleDefinition.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, partOfSpeech, source, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleDefinition {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    partOfSpeech: ").append(toIndentedString(partOfSpeech)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

