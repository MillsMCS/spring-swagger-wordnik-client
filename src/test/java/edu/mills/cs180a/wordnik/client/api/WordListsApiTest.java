package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.WordList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WordListsApi
 */
public class WordListsApiTest {

    private WordListsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(WordListsApi.class);
    }

    
    /**
     * Creates a WordList.
     *
     * 
     */
    @Test
    public void createWordListTest() {
        String authToken = null;
        WordList body = null;
        // WordList response = api.createWordList(authToken, body);

        // TODO: test validations
    }

    
}
