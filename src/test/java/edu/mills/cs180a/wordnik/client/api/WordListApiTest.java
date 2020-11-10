package edu.mills.cs180a.wordnik.client.api;

import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.StringValue;
import edu.mills.cs180a.wordnik.client.model.WordList;
import edu.mills.cs180a.wordnik.client.model.WordListWord;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WordListApi
 */
public class WordListApiTest {

    private WordListApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(WordListApi.class);
    }

    
    /**
     * Adds words to a WordList
     *
     * 
     */
    @Test
    public void addWordsToWordListTest() {
        String permalink = null;
        String authToken = null;
        List<StringValue> body = null;
        // Object response = api.addWordsToWordList(permalink, authToken, body);

        // TODO: test validations
    }

    
    /**
     * Deletes an existing WordList
     *
     * 
     */
    @Test
    public void deleteWordListTest() {
        String permalink = null;
        String authToken = null;
        // Object response = api.deleteWordList(permalink, authToken);

        // TODO: test validations
    }

    
    /**
     * Removes words from a WordList
     *
     * 
     */
    @Test
    public void deleteWordsFromWordListTest() {
        String permalink = null;
        String authToken = null;
        List<StringValue> body = null;
        // Object response = api.deleteWordsFromWordList(permalink, authToken, body);

        // TODO: test validations
    }

    
    /**
     * Fetches a WordList by ID
     *
     * 
     */
    @Test
    public void getWordListByPermalinkTest() {
        String permalink = null;
        String authToken = null;
        // WordList response = api.getWordListByPermalink(permalink, authToken);

        // TODO: test validations
    }

    
    /**
     * Fetches words in a WordList
     *
     * 
     */
    @Test
    public void getWordListWordsTest() {
        String permalink = null;
        String authToken = null;
        String sortBy = null;
        String sortOrder = null;
        Integer skip = null;
        Integer limit = null;
        // List<WordListWord> response = api.getWordListWords(permalink, authToken, sortBy, sortOrder, skip, limit);

        // TODO: test validations
    }

    /**
     * Fetches words in a WordList
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getWordListWordsTestQueryMap() {
        String permalink = null;
        String authToken = null;
        WordListApi.GetWordListWordsQueryParams queryParams = new WordListApi.GetWordListWordsQueryParams()
            .sortBy(null)
            .sortOrder(null)
            .skip(null)
            .limit(null);
        // List<WordListWord> response = api.getWordListWords(permalink, authToken, queryParams);

    // TODO: test validations
    }
    
    /**
     * Updates an existing WordList
     *
     * 
     */
    @Test
    public void updateWordListTest() {
        String permalink = null;
        String authToken = null;
        WordList body = null;
        // Object response = api.updateWordList(permalink, authToken, body);

        // TODO: test validations
    }

    
}
