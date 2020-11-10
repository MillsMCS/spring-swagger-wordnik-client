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
 * Definition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-09T16:51:03.324-08:00")



public class Definition {
  @JsonProperty("attributionText")
  private String attributionText = null;

  @JsonProperty("attributionUrl")
  private String attributionUrl = null;

  @JsonProperty("citations")
  private List<Object> citations = null;

  @JsonProperty("exampleUses")
  private List<Object> exampleUses = null;

  @JsonProperty("extendedText")
  private String extendedText = null;

  @JsonProperty("labels")
  private List<Object> labels = null;

  @JsonProperty("notes")
  private List<Object> notes = null;

  @JsonProperty("partOfSpeech")
  private String partOfSpeech = null;

  @JsonProperty("relatedWords")
  private List<Object> relatedWords = null;

  @JsonProperty("score")
  private Float score = null;

  @JsonProperty("seqString")
  private String seqString = null;

  @JsonProperty("sequence")
  private String sequence = null;

  @JsonProperty("sourceDictionary")
  private String sourceDictionary = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("textProns")
  private List<Object> textProns = null;

  @JsonProperty("word")
  private String word = null;

  public Definition attributionText(String attributionText) {
    this.attributionText = attributionText;
    return this;
  }

   /**
   * Get attributionText
   * @return attributionText
  **/
  @ApiModelProperty(value = "")
  public String getAttributionText() {
    return attributionText;
  }

  public void setAttributionText(String attributionText) {
    this.attributionText = attributionText;
  }

  public Definition attributionUrl(String attributionUrl) {
    this.attributionUrl = attributionUrl;
    return this;
  }

   /**
   * Get attributionUrl
   * @return attributionUrl
  **/
  @ApiModelProperty(value = "")
  public String getAttributionUrl() {
    return attributionUrl;
  }

  public void setAttributionUrl(String attributionUrl) {
    this.attributionUrl = attributionUrl;
  }

  public Definition citations(List<Object> citations) {
    this.citations = citations;
    return this;
  }

  public Definition addCitationsItem(Object citationsItem) {
    if (this.citations == null) {
      this.citations = new ArrayList<Object>();
    }
    this.citations.add(citationsItem);
    return this;
  }

   /**
   * Get citations
   * @return citations
  **/
  @ApiModelProperty(value = "")
  public List<Object> getCitations() {
    return citations;
  }

  public void setCitations(List<Object> citations) {
    this.citations = citations;
  }

  public Definition exampleUses(List<Object> exampleUses) {
    this.exampleUses = exampleUses;
    return this;
  }

  public Definition addExampleUsesItem(Object exampleUsesItem) {
    if (this.exampleUses == null) {
      this.exampleUses = new ArrayList<Object>();
    }
    this.exampleUses.add(exampleUsesItem);
    return this;
  }

   /**
   * Get exampleUses
   * @return exampleUses
  **/
  @ApiModelProperty(value = "")
  public List<Object> getExampleUses() {
    return exampleUses;
  }

  public void setExampleUses(List<Object> exampleUses) {
    this.exampleUses = exampleUses;
  }

  public Definition extendedText(String extendedText) {
    this.extendedText = extendedText;
    return this;
  }

   /**
   * Get extendedText
   * @return extendedText
  **/
  @ApiModelProperty(value = "")
  public String getExtendedText() {
    return extendedText;
  }

  public void setExtendedText(String extendedText) {
    this.extendedText = extendedText;
  }

  public Definition labels(List<Object> labels) {
    this.labels = labels;
    return this;
  }

  public Definition addLabelsItem(Object labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Object>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Object> getLabels() {
    return labels;
  }

  public void setLabels(List<Object> labels) {
    this.labels = labels;
  }

  public Definition notes(List<Object> notes) {
    this.notes = notes;
    return this;
  }

  public Definition addNotesItem(Object notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Object>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public List<Object> getNotes() {
    return notes;
  }

  public void setNotes(List<Object> notes) {
    this.notes = notes;
  }

  public Definition partOfSpeech(String partOfSpeech) {
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

  public Definition relatedWords(List<Object> relatedWords) {
    this.relatedWords = relatedWords;
    return this;
  }

  public Definition addRelatedWordsItem(Object relatedWordsItem) {
    if (this.relatedWords == null) {
      this.relatedWords = new ArrayList<Object>();
    }
    this.relatedWords.add(relatedWordsItem);
    return this;
  }

   /**
   * Get relatedWords
   * @return relatedWords
  **/
  @ApiModelProperty(value = "")
  public List<Object> getRelatedWords() {
    return relatedWords;
  }

  public void setRelatedWords(List<Object> relatedWords) {
    this.relatedWords = relatedWords;
  }

  public Definition score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }

  public Definition seqString(String seqString) {
    this.seqString = seqString;
    return this;
  }

   /**
   * Get seqString
   * @return seqString
  **/
  @ApiModelProperty(value = "")
  public String getSeqString() {
    return seqString;
  }

  public void setSeqString(String seqString) {
    this.seqString = seqString;
  }

  public Definition sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public Definition sourceDictionary(String sourceDictionary) {
    this.sourceDictionary = sourceDictionary;
    return this;
  }

   /**
   * Get sourceDictionary
   * @return sourceDictionary
  **/
  @ApiModelProperty(value = "")
  public String getSourceDictionary() {
    return sourceDictionary;
  }

  public void setSourceDictionary(String sourceDictionary) {
    this.sourceDictionary = sourceDictionary;
  }

  public Definition text(String text) {
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

  public Definition textProns(List<Object> textProns) {
    this.textProns = textProns;
    return this;
  }

  public Definition addTextPronsItem(Object textPronsItem) {
    if (this.textProns == null) {
      this.textProns = new ArrayList<Object>();
    }
    this.textProns.add(textPronsItem);
    return this;
  }

   /**
   * Get textProns
   * @return textProns
  **/
  @ApiModelProperty(value = "")
  public List<Object> getTextProns() {
    return textProns;
  }

  public void setTextProns(List<Object> textProns) {
    this.textProns = textProns;
  }

  public Definition word(String word) {
    this.word = word;
    return this;
  }

   /**
   * Get word
   * @return word
  **/
  @ApiModelProperty(value = "")
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Definition definition = (Definition) o;
    return Objects.equals(this.attributionText, definition.attributionText) &&
        Objects.equals(this.attributionUrl, definition.attributionUrl) &&
        Objects.equals(this.citations, definition.citations) &&
        Objects.equals(this.exampleUses, definition.exampleUses) &&
        Objects.equals(this.extendedText, definition.extendedText) &&
        Objects.equals(this.labels, definition.labels) &&
        Objects.equals(this.notes, definition.notes) &&
        Objects.equals(this.partOfSpeech, definition.partOfSpeech) &&
        Objects.equals(this.relatedWords, definition.relatedWords) &&
        Objects.equals(this.score, definition.score) &&
        Objects.equals(this.seqString, definition.seqString) &&
        Objects.equals(this.sequence, definition.sequence) &&
        Objects.equals(this.sourceDictionary, definition.sourceDictionary) &&
        Objects.equals(this.text, definition.text) &&
        Objects.equals(this.textProns, definition.textProns) &&
        Objects.equals(this.word, definition.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionText, attributionUrl, citations, exampleUses, extendedText, labels, notes, partOfSpeech, relatedWords, score, seqString, sequence, sourceDictionary, text, textProns, word);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Definition {\n");
    
    sb.append("    attributionText: ").append(toIndentedString(attributionText)).append("\n");
    sb.append("    attributionUrl: ").append(toIndentedString(attributionUrl)).append("\n");
    sb.append("    citations: ").append(toIndentedString(citations)).append("\n");
    sb.append("    exampleUses: ").append(toIndentedString(exampleUses)).append("\n");
    sb.append("    extendedText: ").append(toIndentedString(extendedText)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    partOfSpeech: ").append(toIndentedString(partOfSpeech)).append("\n");
    sb.append("    relatedWords: ").append(toIndentedString(relatedWords)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    seqString: ").append(toIndentedString(seqString)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    sourceDictionary: ").append(toIndentedString(sourceDictionary)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textProns: ").append(toIndentedString(textProns)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
