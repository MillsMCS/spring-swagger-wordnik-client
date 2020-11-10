package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.invoker.EncodingUtils;
import edu.mills.cs180a.wordnik.client.model.StringValue;
import edu.mills.cs180a.wordnik.client.model.WordList;
import edu.mills.cs180a.wordnik.client.model.WordListWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-09T16:51:03.324-08:00")
public interface WordListApi extends ApiClient.Api {


  /**
   * Adds words to a WordList
   * 
    * @param permalink permalink of WordList to user (required)
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
    * @param body Array of words to add to WordList (optional)
   * @return Object
   */
  @RequestLine("POST /wordList.json/{permalink}/words")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  Object addWordsToWordList(@Param("permalink") String permalink, @Param("authToken") String authToken, List<StringValue> body);

  /**
   * Deletes an existing WordList
   * 
    * @param permalink ID of WordList to delete (required)
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
   * @return Object
   */
  @RequestLine("DELETE /wordList.json/{permalink}")
  @Headers({
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  Object deleteWordList(@Param("permalink") String permalink, @Param("authToken") String authToken);

  /**
   * Removes words from a WordList
   * 
    * @param permalink permalink of WordList to use (required)
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
    * @param body Words to remove from WordList (optional)
   * @return Object
   */
  @RequestLine("POST /wordList.json/{permalink}/deleteWords")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  Object deleteWordsFromWordList(@Param("permalink") String permalink, @Param("authToken") String authToken, List<StringValue> body);

  /**
   * Fetches a WordList by ID
   * 
    * @param permalink permalink of WordList to fetch (required)
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
   * @return WordList
   */
  @RequestLine("GET /wordList.json/{permalink}")
  @Headers({
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  WordList getWordListByPermalink(@Param("permalink") String permalink, @Param("authToken") String authToken);

  /**
   * Fetches words in a WordList
   * 
    * @param permalink ID of WordList to use (required)
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
    * @param sortBy Field to sort by (optional, default to createDate)
    * @param sortOrder Direction to sort (optional, default to desc)
    * @param skip Results to skip (optional, default to 0)
    * @param limit Maximum number of results to return (optional, default to 100)
   * @return List&lt;WordListWord&gt;
   */
  @RequestLine("GET /wordList.json/{permalink}/words?sortBy={sortBy}&sortOrder={sortOrder}&skip={skip}&limit={limit}")
  @Headers({
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  List<WordListWord> getWordListWords(@Param("permalink") String permalink, @Param("authToken") String authToken, @Param("sortBy") String sortBy, @Param("sortOrder") String sortOrder, @Param("skip") Integer skip, @Param("limit") Integer limit);

  /**
   * Fetches words in a WordList
   * 
   * Note, this is equivalent to the other <code>getWordListWords</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetWordListWordsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param permalink ID of WordList to use (required)
   * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sortBy - Field to sort by (optional, default to createDate)</li>
   *   <li>sortOrder - Direction to sort (optional, default to desc)</li>
   *   <li>skip - Results to skip (optional, default to 0)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 100)</li>
   *   </ul>
   * @return List&lt;WordListWord&gt;
   */
  @RequestLine("GET /wordList.json/{permalink}/words?sortBy={sortBy}&sortOrder={sortOrder}&skip={skip}&limit={limit}")
  @Headers({
  "Accept: application/json",
      "auth_token: {authToken}"
  })
  List<WordListWord> getWordListWords(@Param("permalink") String permalink, @Param("authToken") String authToken, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getWordListWords</code> method in a fluent style.
   */
  public static class GetWordListWordsQueryParams extends HashMap<String, Object> {
    public GetWordListWordsQueryParams sortBy(final String value) {
      put("sortBy", EncodingUtils.encode(value));
      return this;
    }
    public GetWordListWordsQueryParams sortOrder(final String value) {
      put("sortOrder", EncodingUtils.encode(value));
      return this;
    }
    public GetWordListWordsQueryParams skip(final Integer value) {
      put("skip", EncodingUtils.encode(value));
      return this;
    }
    public GetWordListWordsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Updates an existing WordList
   * 
    * @param permalink permalink of WordList to update (required)
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
    * @param body Updated WordList (optional)
   * @return Object
   */
  @RequestLine("PUT /wordList.json/{permalink}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  Object updateWordList(@Param("permalink") String permalink, @Param("authToken") String authToken, WordList body);
}
