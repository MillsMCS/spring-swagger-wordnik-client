package edu.mills.cs180a.wordnik.client.api;

import com.edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import com.edu.mills.cs180a.wordnik.client.invoker.EncodingUtils;

import edu.mills.cs180a.wordnik.client.model.ApiTokenStatus;
import edu.mills.cs180a.wordnik.client.model.AuthenticationToken;
import edu.mills.cs180a.wordnik.client.model.User;
import edu.mills.cs180a.wordnik.client.model.WordList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-09T16:51:03.324-08:00")
public interface AccountApi extends ApiClient.Api {


  /**
   * Authenticates a User
   * 
    * @param username A confirmed Wordnik username (required)
    * @param password The user&#39;s password (required)
   * @return AuthenticationToken
   */
  @RequestLine("GET /account.json/authenticate/{username}?password={password}")
  @Headers({
    "Accept: application/json",
  })
  AuthenticationToken authenticate(@Param("username") String username, @Param("password") String password);

  /**
   * Authenticates a User
   * 
   * Note, this is equivalent to the other <code>authenticate</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AuthenticateQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param username A confirmed Wordnik username (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>password - The user&#39;s password (required)</li>
   *   </ul>
   * @return AuthenticationToken
   */
  @RequestLine("GET /account.json/authenticate/{username}?password={password}")
  @Headers({
  "Accept: application/json",
  })
  AuthenticationToken authenticate(@Param("username") String username, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>authenticate</code> method in a fluent style.
   */
  public static class AuthenticateQueryParams extends HashMap<String, Object> {
    public AuthenticateQueryParams password(final String value) {
      put("password", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Authenticates a user
   * 
    * @param username A confirmed Wordnik username (required)
    * @param body The user&#39;s password (required)
   * @return AuthenticationToken
   */
  @RequestLine("POST /account.json/authenticate/{username}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AuthenticationToken authenticatePost(@Param("username") String username, String body);

  /**
   * Returns usage statistics for the API account.
   * 
    * @param apiKey Wordnik authentication token (optional)
   * @return ApiTokenStatus
   */
  @RequestLine("GET /account.json/apiTokenStatus")
  @Headers({
    "Accept: application/json",
    "api_key: {apiKey}"
  })
  ApiTokenStatus getApiTokenStatus(@Param("apiKey") String apiKey);

  /**
   * Returns the logged-in User
   * Requires a valid auth_token to be set.
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
   * @return User
   */
  @RequestLine("GET /account.json/user")
  @Headers({
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  User getLoggedInUser(@Param("authToken") String authToken);

  /**
   * Fetches WordList objects for the logged-in user.
   * 
    * @param authToken auth_token of logged-in user (required)
    * @param skip Results to skip (optional, default to 0)
    * @param limit Maximum number of results to return (optional, default to 50)
   * @return List&lt;WordList&gt;
   */
  @RequestLine("GET /account.json/wordLists?skip={skip}&limit={limit}")
  @Headers({
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  List<WordList> getWordListsForLoggedInUser(@Param("authToken") String authToken, @Param("skip") Integer skip, @Param("limit") Integer limit);

  /**
   * Fetches WordList objects for the logged-in user.
   * 
   * Note, this is equivalent to the other <code>getWordListsForLoggedInUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetWordListsForLoggedInUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param authToken auth_token of logged-in user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>skip - Results to skip (optional, default to 0)</li>
   *   <li>limit - Maximum number of results to return (optional, default to 50)</li>
   *   </ul>
   * @return List&lt;WordList&gt;
   */
  @RequestLine("GET /account.json/wordLists?skip={skip}&limit={limit}")
  @Headers({
  "Accept: application/json",
      "auth_token: {authToken}"
  })
  List<WordList> getWordListsForLoggedInUser(@Param("authToken") String authToken, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getWordListsForLoggedInUser</code> method in a fluent style.
   */
  public static class GetWordListsForLoggedInUserQueryParams extends HashMap<String, Object> {
    public GetWordListsForLoggedInUserQueryParams skip(final Integer value) {
      put("skip", EncodingUtils.encode(value));
      return this;
    }
    public GetWordListsForLoggedInUserQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
