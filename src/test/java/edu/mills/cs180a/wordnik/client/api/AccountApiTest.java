package edu.mills.cs180a.wordnik.client.api;

import com.edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.ApiTokenStatus;
import edu.mills.cs180a.wordnik.client.model.AuthenticationToken;
import edu.mills.cs180a.wordnik.client.model.User;
import edu.mills.cs180a.wordnik.client.model.WordList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
public class AccountApiTest {

    private AccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AccountApi.class);
    }

    
    /**
     * Authenticates a User
     *
     * 
     */
    @Test
    public void authenticateTest() {
        String username = null;
        String password = null;
        // AuthenticationToken response = api.authenticate(username, password);

        // TODO: test validations
    }

    /**
     * Authenticates a User
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void authenticateTestQueryMap() {
        String username = null;
        AccountApi.AuthenticateQueryParams queryParams = new AccountApi.AuthenticateQueryParams()
            .password(null);
        // AuthenticationToken response = api.authenticate(username, queryParams);

    // TODO: test validations
    }
    
    /**
     * Authenticates a user
     *
     * 
     */
    @Test
    public void authenticatePostTest() {
        String username = null;
        String body = null;
        // AuthenticationToken response = api.authenticatePost(username, body);

        // TODO: test validations
    }

    
    /**
     * Returns usage statistics for the API account.
     *
     * 
     */
    @Test
    public void getApiTokenStatusTest() {
        String apiKey = null;
        // ApiTokenStatus response = api.getApiTokenStatus(apiKey);

        // TODO: test validations
    }

    
    /**
     * Returns the logged-in User
     *
     * Requires a valid auth_token to be set.
     */
    @Test
    public void getLoggedInUserTest() {
        String authToken = null;
        // User response = api.getLoggedInUser(authToken);

        // TODO: test validations
    }

    
    /**
     * Fetches WordList objects for the logged-in user.
     *
     * 
     */
    @Test
    public void getWordListsForLoggedInUserTest() {
        String authToken = null;
        Integer skip = null;
        Integer limit = null;
        // List<WordList> response = api.getWordListsForLoggedInUser(authToken, skip, limit);

        // TODO: test validations
    }

    /**
     * Fetches WordList objects for the logged-in user.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getWordListsForLoggedInUserTestQueryMap() {
        String authToken = null;
        AccountApi.GetWordListsForLoggedInUserQueryParams queryParams = new AccountApi.GetWordListsForLoggedInUserQueryParams()
            .skip(null)
            .limit(null);
        // List<WordList> response = api.getWordListsForLoggedInUser(authToken, queryParams);

    // TODO: test validations
    }
    
}
