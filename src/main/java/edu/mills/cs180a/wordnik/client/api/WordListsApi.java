package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.invoker.EncodingUtils;
import edu.mills.cs180a.wordnik.client.model.WordList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-09T16:51:03.324-08:00")
public interface WordListsApi extends ApiClient.Api {


  /**
   * Creates a WordList.
   * 
    * @param authToken The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
    * @param body WordList to create (optional)
   * @return WordList
   */
  @RequestLine("POST /wordLists.json")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "auth_token: {authToken}"
  })
  WordList createWordList(@Param("authToken") String authToken, WordList body);
}
